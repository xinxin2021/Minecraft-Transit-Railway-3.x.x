package mtr.block;

import minecraftmappings.BlockEntityClientSerializableMapper;
import minecraftmappings.BlockEntityProviderMapper;
import mtr.Items;
import mtr.MTR;
import mtr.packet.PacketTrainDataGuiServer;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.util.ActionResult;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.Hand;
import net.minecraft.util.StringIdentifiable;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.explosion.Explosion;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class BlockPSDTop extends HorizontalFacingBlock implements BlockEntityProviderMapper, IBlock, IPropagateBlock {

	public static final EnumProperty<EnumDoorLight> DOOR_LIGHT = EnumProperty.of("door_light", EnumDoorLight.class);
	public static final BooleanProperty AIR_LEFT = BooleanProperty.of("air_left");
	public static final BooleanProperty AIR_RIGHT = BooleanProperty.of("air_right");

	public BlockPSDTop() {
		super(FabricBlockSettings.of(Material.METAL, MapColor.OFF_WHITE).requiresTool().hardness(2).nonOpaque());
	}

	@Override
	public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
		return IBlock.checkHoldingBrush(world, player, () -> {
			if(player.isSneaking()) {
				world.setBlockState(pos, state.cycle(PROPAGATE_PROPERTY));
				propagate(world, pos, IBlock.getStatePropertySafe(state, FACING).rotateYClockwise(), 1);
				propagate(world, pos, IBlock.getStatePropertySafe(state, FACING).rotateYCounterclockwise(), 1);
			} else {
				final BlockEntity entity = world.getBlockEntity(pos);
				PacketTrainDataGuiServer.openPSDFilterScreenS2C((ServerPlayerEntity) player, pos);
				((BlockPSDTop.TileEntityPSDTop) entity).sync();
			}
		});
	}

	@Override
	public BlockState rotate(BlockState state, BlockRotation rotation) {
		return state;
	}

	@Override
	public Item asItem() {
		return Items.PSD_GLASS_1;
	}

	@Override
	public ItemStack getPickStack(BlockView world, BlockPos pos, BlockState state) {
		return new ItemStack(asItem());
	}

	@Override
	public void onBreak(World world, BlockPos pos, BlockState state, PlayerEntity player) {
		final Block blockDown = world.getBlockState(pos.down()).getBlock();
		if (blockDown instanceof BlockPSDAPGBase) {
			blockDown.onBreak(world, pos.down(), world.getBlockState(pos.down()), player);
			world.setBlockState(pos.down(), Blocks.AIR.getDefaultState());
		}
		super.onBreak(world, pos, state, player);
	}

	@Override
	public void onDestroyedByExplosion(World world, BlockPos pos, Explosion explosion) {
		onBreak(world, pos, null, null);
	}

	@Override
	public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState newState, WorldAccess world, BlockPos pos, BlockPos posFrom) {
		if (direction == Direction.DOWN && !(newState.getBlock() instanceof BlockPSDAPGBase)) {
			return Blocks.AIR.getDefaultState();
		} else {
			return getActualState(world, pos);
		}
	}

	@Override
	public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
		final VoxelShape baseShape = IBlock.getVoxelShapeByDirection(0, 0, 0, 16, 16, 6, IBlock.getStatePropertySafe(state, FACING));
		final boolean airLeft = IBlock.getStatePropertySafe(state, AIR_LEFT);
		final boolean airRight = IBlock.getStatePropertySafe(state, AIR_RIGHT);
		if (airLeft || airRight) {
			return BlockPSDAPGGlassEndBase.getEndOutlineShape(baseShape, state, 16, 6, airLeft, airRight);
		} else {
			return baseShape;
		}
	}

	@Override
	public PistonBehavior getPistonBehavior(BlockState state) {
		return PistonBehavior.BLOCK;
	}

	@Override
	protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
		builder.add(DOOR_LIGHT, FACING, SIDE_EXTENDED, AIR_LEFT, AIR_RIGHT, PROPAGATE_PROPERTY);
	}

	@Override
	public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
		return new TileEntityPSDTop(pos, state);
	}

//	public static void update(World world, BlockPos pos, Direction offset, Set<Long> data) {
//		BlockPos offsetPos = pos.offset(offset);
//
//		if(world.getBlockState(offsetPos).getBlock() instanceof BlockPSDTop) {
//			((TileEntityPSDTop) world.getBlockEntity(offsetPos)).setData(data);
//			update(world, offsetPos, offset, data);
//		}
//	}

	public static BlockState getActualState(WorldAccess world, BlockPos pos) {
		EnumDoorLight doorLight = EnumDoorLight.NONE;
		Direction facing = Direction.NORTH;
		EnumSide side = EnumSide.SINGLE;
		boolean airLeft = false, airRight = false;

		final BlockState stateBelow = world.getBlockState(pos.down());
		if (stateBelow.getBlock() instanceof BlockPSDAPGBase) {
			if (stateBelow.getBlock() instanceof BlockPSDAPGDoorBase) {
				doorLight = IBlock.getStatePropertySafe(stateBelow, BlockPSDAPGDoorBase.OPEN) > 0 ? EnumDoorLight.ON : EnumDoorLight.OFF;
				side = IBlock.getStatePropertySafe(stateBelow, SIDE);
			} else {
				side = IBlock.getStatePropertySafe(stateBelow, SIDE_EXTENDED);
			}

			if (stateBelow.getBlock() instanceof BlockPSDAPGGlassEndBase) {
				if (IBlock.getStatePropertySafe(stateBelow, BlockPSDAPGGlassEndBase.TOUCHING_LEFT) == BlockPSDAPGGlassEndBase.EnumPSDAPGGlassEndSide.AIR) {
					airLeft = true;
				}
				if (IBlock.getStatePropertySafe(stateBelow, BlockPSDAPGGlassEndBase.TOUCHING_RIGHT) == BlockPSDAPGGlassEndBase.EnumPSDAPGGlassEndSide.AIR) {
					airRight = true;
				}
			}

			facing = IBlock.getStatePropertySafe(stateBelow, FACING);
		}

		final BlockState oldState = world.getBlockState(pos);
		return (oldState.getBlock() instanceof BlockPSDTop ? oldState : mtr.Blocks.PSD_TOP.getDefaultState()).with(DOOR_LIGHT, doorLight).with(FACING, facing).with(SIDE_EXTENDED, side).with(AIR_LEFT, airLeft).with(AIR_RIGHT, airRight);
	}

	public static class TileEntityPSDTop extends BlockEntityClientSerializableMapper {

		public TileEntityPSDTop(BlockPos pos, BlockState state) {
			super(MTR.PSD_TOP_TILE_ENTITY, pos, state);
		}

		private final Set<Long> filterRouteIds = new HashSet<>();
		private static final String KEY_ROUTE_IDS = "route_ids";

		@Override
		public void readNbtCompound(NbtCompound nbtCompound) {
			final long[] routeIdsArray = nbtCompound.getLongArray(KEY_ROUTE_IDS);
			for (final long routeId : routeIdsArray) {
				filterRouteIds.add(routeId);
			}
		}

		@Override
		public void writeNbtCompound(NbtCompound nbtCompound) {
			nbtCompound.putLongArray(KEY_ROUTE_IDS, new ArrayList<>(filterRouteIds));
		}

		public Set<Long> getRouteIds() {
			return filterRouteIds;
		}

		public void setData(Set<Long> filterRouteIds) {
			this.filterRouteIds.clear();
			this.filterRouteIds.addAll(filterRouteIds);
			markDirty();
			sync();
		}
	}

	public enum EnumDoorLight implements StringIdentifiable {

		ON("on"), OFF("off"), NONE("none");
		private final String name;

		EnumDoorLight(String nameIn) {
			name = nameIn;
		}

		@Override
		public String asString() {
			return name;
		}
	}
}
