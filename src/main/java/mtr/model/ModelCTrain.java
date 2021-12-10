package mtr.model;

import minecraftmappings.ModelDataWrapper;
import minecraftmappings.ModelMapper;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.util.math.MatrixStack;

public class ModelCTrain extends ModelTrainBase {
	private final ModelMapper window;
	private final ModelMapper upper_wall_2_r1;
	private final ModelMapper window_handrails;
	private final ModelMapper handrail_17_r1;
	private final ModelMapper handrail_16_r1;
	private final ModelMapper handrail_15_r1;
	private final ModelMapper handrail_14_r1;
	private final ModelMapper handrail_13_r1;
	private final ModelMapper handrail_12_r1;
	private final ModelMapper handrail_11_r1;
	private final ModelMapper handrail_10_r1;
	private final ModelMapper handrail_8_r1;
	private final ModelMapper top_handrail_4_r1;
	private final ModelMapper top_handrail_3_r1;
	private final ModelMapper handrail_5_r1;
	private final ModelMapper handrail_4_r1;
	private final ModelMapper handrail_3_r1;
	private final ModelMapper handrail_1_r1;
	private final ModelMapper seat;
	private final ModelMapper seat_back_r1;
	private final ModelMapper window_exterior;
	private final ModelMapper upper_wall_r1;
	private final ModelMapper side_panel;
	private final ModelMapper side_panel_translucent;
	private final ModelMapper roof_window;
	private final ModelMapper inner_roof_6_r1;
	private final ModelMapper inner_roof_5_r1;
	private final ModelMapper inner_roof_4_r1;
	private final ModelMapper inner_roof_3_r1;
	private final ModelMapper roof_door;
	private final ModelMapper inner_roof_6_r2;
	private final ModelMapper inner_roof_5_r2;
	private final ModelMapper inner_roof_4_r2;
	private final ModelMapper inner_roof_3_r2;
	private final ModelMapper inner_roof_2_r1;
	private final ModelMapper inner_roof_1_r1;
	private final ModelMapper roof_exterior;
	private final ModelMapper outer_roof_4_r1;
	private final ModelMapper outer_roof_3_r1;
	private final ModelMapper outer_roof_2_r1;
	private final ModelMapper outer_roof_1_r1;
	private final ModelMapper door;
	private final ModelMapper door_left;
	private final ModelMapper door_left_top_r1;
	private final ModelMapper door_right;
	private final ModelMapper door_right_top_r1;
	private final ModelMapper door_handrail;
	private final ModelMapper door_exterior;
	private final ModelMapper door_left_exterior;
	private final ModelMapper door_left_top_r2;
	private final ModelMapper door_right_exterior;
	private final ModelMapper door_right_top_r2;
	private final ModelMapper end;
	private final ModelMapper upper_wall_2_r2;
	private final ModelMapper upper_wall_1_r1;
	private final ModelMapper end_exterior;
	private final ModelMapper upper_wall_2_r3;
	private final ModelMapper upper_wall_1_r2;
	private final ModelMapper roof_end_exterior;
	private final ModelMapper vent_2_r1;
	private final ModelMapper vent_1_r1;
	private final ModelMapper outer_roof_1;
	private final ModelMapper outer_roof_4_r2;
	private final ModelMapper outer_roof_3_r2;
	private final ModelMapper outer_roof_2_r2;
	private final ModelMapper outer_roof_1_r2;
	private final ModelMapper outer_roof_2;
	private final ModelMapper outer_roof_4_r3;
	private final ModelMapper outer_roof_3_r3;
	private final ModelMapper outer_roof_2_r3;
	private final ModelMapper outer_roof_1_r3;
	private final ModelMapper roof_light;
	private final ModelMapper roof_light_r1;
	private final ModelMapper roof_end_light;
	private final ModelMapper roof_light_2_r1;
	private final ModelMapper roof_light_1_r1;
	private final ModelMapper roof_head_exterior;
	private final ModelMapper vent_2_r2;
	private final ModelMapper vent_1_r2;
	private final ModelMapper outer_roof_3;
	private final ModelMapper outer_roof_7_r1;
	private final ModelMapper outer_roof_6_r1;
	private final ModelMapper outer_roof_4_r4;
	private final ModelMapper outer_roof_3_r4;
	private final ModelMapper outer_roof_2_r4;
	private final ModelMapper outer_roof_4;
	private final ModelMapper outer_roof_7_r2;
	private final ModelMapper outer_roof_6_r2;
	private final ModelMapper outer_roof_4_r5;
	private final ModelMapper outer_roof_3_r5;
	private final ModelMapper outer_roof_2_r5;
	private final ModelMapper head;
	private final ModelMapper upper_wall_2_r4;
	private final ModelMapper upper_wall_1_r3;
	private final ModelMapper head_exterior;
	private final ModelMapper upper_wall_2_r5;
	private final ModelMapper upper_wall_1_r4;
	private final ModelMapper front;
	private final ModelMapper side_1;
	private final ModelMapper outer_roof_5_r1;
	private final ModelMapper outer_roof_4_r6;
	private final ModelMapper outer_roof_3_r6;
	private final ModelMapper outer_roof_2_r6;
	private final ModelMapper front_side_bottom_2_r1;
	private final ModelMapper front_side_bottom_1_r1;
	private final ModelMapper front_side_upper_1_r1;
	private final ModelMapper front_side_lower_1_r1;
	private final ModelMapper side_2;
	private final ModelMapper outer_roof_5_r2;
	private final ModelMapper outer_roof_4_r7;
	private final ModelMapper outer_roof_3_r7;
	private final ModelMapper outer_roof_2_r7;
	private final ModelMapper front_side_bottom_4_r1;
	private final ModelMapper front_side_bottom_3_r1;
	private final ModelMapper front_side_upper_2_r1;
	private final ModelMapper front_side_lower_2_r1;
	private final ModelMapper front_panel;
	private final ModelMapper panel_5_r1;
	private final ModelMapper panel_13_r1;
	private final ModelMapper panel_8_r1;
	private final ModelMapper panel_12_r1;
	private final ModelMapper panel_12_r2;
	private final ModelMapper panel_9_r1;
	private final ModelMapper panel_6_r1;
	private final ModelMapper panel_3_r1;
	private final ModelMapper panel_11_r1;
	private final ModelMapper panel_8_r2;
	private final ModelMapper panel_7_r1;
	private final ModelMapper panel_5_r2;
	private final ModelMapper panel_4_r1;
	private final ModelMapper panel_4_r2;
	private final ModelMapper panel_3_r2;
	private final ModelMapper panel_2_r1;
	private final ModelMapper headlights;
	private final ModelMapper headlight_3_r1;
	private final ModelMapper headlight_2_r1;
	private final ModelMapper tail_lights;
	private final ModelMapper tail_light_3_r1;
	private final ModelMapper tail_light_2_r1;
	private final ModelMapper door_light_on;
	private final ModelMapper light_r1;
	private final ModelMapper door_light_off;
	private final ModelMapper light_r2;

	public ModelCTrain() {
		final int textureWidth = 320;
		final int textureHeight = 320;

		final ModelDataWrapper modelDataWrapper = new ModelDataWrapper(this, textureWidth, textureHeight);

		window = new ModelMapper(modelDataWrapper);
		window.setPivot(0, 24, 0);
		window.setTextureOffset(0, 40).addCuboid(-20, 0, -24, 20, 1, 48, 0, false);
		window.setTextureOffset(168, 0).addCuboid(-20, -14, -22, 2, 14, 44, 0, false);
		window.setTextureOffset(0, 160).addCuboid(-20, -14, 22, 3, 14, 5, 0, false);
		window.setTextureOffset(22, 160).addCuboid(-20, -14, -27, 3, 14, 5, 0, false);

		upper_wall_2_r1 = new ModelMapper(modelDataWrapper);
		upper_wall_2_r1.setPivot(-20, -14, 0);
		window.addChild(upper_wall_2_r1);
		setRotationAngle(upper_wall_2_r1, 0, 0, 0.1107F);
		upper_wall_2_r1.setTextureOffset(187, 269).addCuboid(0, -19, -27, 3, 19, 5, 0, false);
		upper_wall_2_r1.setTextureOffset(268, 44).addCuboid(0, -19, 22, 3, 19, 5, 0, false);
		upper_wall_2_r1.setTextureOffset(0, 163).addCuboid(0, -16, -22, 2, 16, 44, 0, false);

		window_handrails = new ModelMapper(modelDataWrapper);
		window_handrails.setPivot(0, 24, 0);
		window_handrails.setTextureOffset(316, 17).addCuboid(-11.3135F, -18.3633F, -22, 0, 5, 0, 0.2F, false);
		window_handrails.setTextureOffset(316, 0).addCuboid(0, -35, -9, 0, 35, 0, 0.2F, false);
		window_handrails.setTextureOffset(316, 0).addCuboid(0, -35, 9, 0, 35, 0, 0.2F, false);
		window_handrails.setTextureOffset(316, 17).addCuboid(-11.3135F, -18.3633F, 22, 0, 5, 0, 0.2F, false);
		window_handrails.setTextureOffset(8, 5).addCuboid(-1, -32, 21, 2, 4, 0, 0, false);
		window_handrails.setTextureOffset(8, 5).addCuboid(-1, -32, 15, 2, 4, 0, 0, false);
		window_handrails.setTextureOffset(8, 5).addCuboid(-1, -32, 3, 2, 4, 0, 0, false);
		window_handrails.setTextureOffset(8, 5).addCuboid(-1, -32, -3, 2, 4, 0, 0, false);
		window_handrails.setTextureOffset(8, 5).addCuboid(-1, -32, -15, 2, 4, 0, 0, false);
		window_handrails.setTextureOffset(8, 5).addCuboid(-1, -32, -21, 2, 4, 0, 0, false);

		handrail_17_r1 = new ModelMapper(modelDataWrapper);
		handrail_17_r1.setPivot(-12.6434F, -3.3539F, 0);
		window_handrails.addChild(handrail_17_r1);
		setRotationAngle(handrail_17_r1, 0, 0, 0.0873F);
		handrail_17_r1.setTextureOffset(316, 9).addCuboid(0, -19.45F, -22, 0, 4, 0, 0.2F, false);

		handrail_16_r1 = new ModelMapper(modelDataWrapper);
		handrail_16_r1.setPivot(-12.6434F, -3.3539F, 0);
		window_handrails.addChild(handrail_16_r1);
		setRotationAngle(handrail_16_r1, 0, 0, 0.0873F);
		handrail_16_r1.setTextureOffset(316, 9).addCuboid(0, -19.45F, 22, 0, 4, 0, 0.2F, false);

		handrail_15_r1 = new ModelMapper(modelDataWrapper);
		handrail_15_r1.setPivot(-10.1335F, -27.6076F, 20.7938F);
		window_handrails.addChild(handrail_15_r1);
		setRotationAngle(handrail_15_r1, 1.0472F, 0, 0.2618F);
		handrail_15_r1.setTextureOffset(319, 0).addCuboid(0, -0.5F, 0, 0, 1, 0, 0.2F, false);

		handrail_14_r1 = new ModelMapper(modelDataWrapper);
		handrail_14_r1.setPivot(-10.362F, -26.7547F, 21.6768F);
		window_handrails.addChild(handrail_14_r1);
		setRotationAngle(handrail_14_r1, 0.5236F, 0, 0.2618F);
		handrail_14_r1.setTextureOffset(319, 0).addCuboid(0, -0.5F, 0, 0, 1, 0, 0.2F, false);

		handrail_13_r1 = new ModelMapper(modelDataWrapper);
		handrail_13_r1.setPivot(-10.3923F, -26.6416F, -22.5259F);
		window_handrails.addChild(handrail_13_r1);
		setRotationAngle(handrail_13_r1, -1.0472F, 0, 0.2618F);
		handrail_13_r1.setTextureOffset(319, 0).addCuboid(0, -2.5F, 0, 0, 1, 0, 0.2F, false);

		handrail_12_r1 = new ModelMapper(modelDataWrapper);
		handrail_12_r1.setPivot(-10.362F, -26.7546F, -21.6768F);
		window_handrails.addChild(handrail_12_r1);
		setRotationAngle(handrail_12_r1, -0.5236F, 0, 0.2618F);
		handrail_12_r1.setTextureOffset(319, 0).addCuboid(0, -0.5F, 0, 0, 1, 0, 0.2F, false);

		handrail_11_r1 = new ModelMapper(modelDataWrapper);
		handrail_11_r1.setPivot(-10.253F, -28.0759F, 22);
		window_handrails.addChild(handrail_11_r1);
		setRotationAngle(handrail_11_r1, 0, 0, 0.1309F);
		handrail_11_r1.setTextureOffset(316, 6).addCuboid(0, 2, -44, 0, 3, 0, 0.2F, false);

		handrail_10_r1 = new ModelMapper(modelDataWrapper);
		handrail_10_r1.setPivot(-10.253F, -28.0759F, 22);
		window_handrails.addChild(handrail_10_r1);
		setRotationAngle(handrail_10_r1, 0, 0, 0.1309F);
		handrail_10_r1.setTextureOffset(316, 6).addCuboid(0, 2, 0, 0, 3, 0, 0.2F, false);

		handrail_8_r1 = new ModelMapper(modelDataWrapper);
		handrail_8_r1.setPivot(0, 0, 0);
		window_handrails.addChild(handrail_8_r1);
		setRotationAngle(handrail_8_r1, -1.5708F, 0, 0);
		handrail_8_r1.setTextureOffset(319, 0).addCuboid(0, -40, -31.5F, 0, 80, 0, 0.2F, false);

		top_handrail_4_r1 = new ModelMapper(modelDataWrapper);
		top_handrail_4_r1.setPivot(-9.8084F, -27.8551F, 0.6584F);
		window_handrails.addChild(top_handrail_4_r1);
		setRotationAngle(top_handrail_4_r1, -1.5708F, 0, 0.2618F);
		top_handrail_4_r1.setTextureOffset(319, 0).addCuboid(-0.25F, -19.4292F, 0, 0, 20, 0, 0.2F, false);

		top_handrail_3_r1 = new ModelMapper(modelDataWrapper);
		top_handrail_3_r1.setPivot(-9.8084F, -27.855F, -0.5168F);
		window_handrails.addChild(top_handrail_3_r1);
		setRotationAngle(top_handrail_3_r1, -1.5708F, 0, 0.2618F);
		top_handrail_3_r1.setTextureOffset(319, 0).addCuboid(-0.25F, -0.4292F, 0, 0, 20, 0, 0.2F, false);

		handrail_5_r1 = new ModelMapper(modelDataWrapper);
		handrail_5_r1.setPivot(-9.4113F, -31.2686F, -20.0876F);
		window_handrails.addChild(handrail_5_r1);
		setRotationAngle(handrail_5_r1, 0, 0, 0.2618F);
		handrail_5_r1.setTextureOffset(319, 0).addCuboid(0.25F, -3, 6.0876F, 0, 6, 0, 0.2F, false);

		handrail_4_r1 = new ModelMapper(modelDataWrapper);
		handrail_4_r1.setPivot(-9.4113F, -31.2686F, 20.0876F);
		window_handrails.addChild(handrail_4_r1);
		setRotationAngle(handrail_4_r1, 0, 0, 0.2618F);
		handrail_4_r1.setTextureOffset(319, 0).addCuboid(0.25F, -3, -6.0876F, 0, 6, 0, 0.2F, false);

		handrail_3_r1 = new ModelMapper(modelDataWrapper);
		handrail_3_r1.setPivot(-10.5822F, -4.8127F, 0);
		window_handrails.addChild(handrail_3_r1);
		setRotationAngle(handrail_3_r1, 0, 0, -0.0873F);
		handrail_3_r1.setTextureOffset(319, 0).addCuboid(0, -8.2F, 22, 0, 6, 0, 0.2F, false);

		handrail_1_r1 = new ModelMapper(modelDataWrapper);
		handrail_1_r1.setPivot(-10.5822F, -4.8127F, 0);
		window_handrails.addChild(handrail_1_r1);
		setRotationAngle(handrail_1_r1, 0, 0, -0.0873F);
		handrail_1_r1.setTextureOffset(319, 0).addCuboid(0, -8.2F, -22, 0, 6, 0, 0.2F, false);

		seat = new ModelMapper(modelDataWrapper);
		seat.setPivot(0, 0, 0);
		window_handrails.addChild(seat);
		seat.setTextureOffset(160, 91).addCuboid(-18, -6, -22, 7, 1, 44, 0, false);

		seat_back_r1 = new ModelMapper(modelDataWrapper);
		seat_back_r1.setPivot(-17, -6, 0);
		seat.addChild(seat_back_r1);
		setRotationAngle(seat_back_r1, 0, 0, -0.0524F);
		seat_back_r1.setTextureOffset(174, 136).addCuboid(-1, -8, -22, 1, 8, 44, 0, false);

		window_exterior = new ModelMapper(modelDataWrapper);
		window_exterior.setPivot(0, 24, 0);
		window_exterior.setTextureOffset(124, 159).addCuboid(-21, 0, -24, 1, 4, 48, 0, false);
		window_exterior.setTextureOffset(106, 91).addCuboid(-20, -14, -26, 1, 14, 52, 0, false);

		upper_wall_r1 = new ModelMapper(modelDataWrapper);
		upper_wall_r1.setPivot(-20, -14, 0);
		window_exterior.addChild(upper_wall_r1);
		setRotationAngle(upper_wall_r1, 0, 0, 0.1107F);
		upper_wall_r1.setTextureOffset(0, 89).addCuboid(0, -19, -26, 1, 19, 52, 0, false);

		side_panel = new ModelMapper(modelDataWrapper);
		side_panel.setPivot(0, 24, 0);
		side_panel.setTextureOffset(262, 188).addCuboid(-18, -34, 0, 8, 30, 0, 0, false);

		side_panel_translucent = new ModelMapper(modelDataWrapper);
		side_panel_translucent.setPivot(0, 24, 0);
		side_panel_translucent.setTextureOffset(150, 211).addCuboid(-18, -34, 0, 8, 30, 0, 0, false);

		roof_window = new ModelMapper(modelDataWrapper);
		roof_window.setPivot(0, 24, 0);
		roof_window.setTextureOffset(86, 40).addCuboid(-16.3335F, -29.4192F, -22, 1, 0, 44, 0, false);
		roof_window.setTextureOffset(84, 40).addCuboid(-1, -35, -22, 1, 0, 44, 0, false);

		inner_roof_6_r1 = new ModelMapper(modelDataWrapper);
		inner_roof_6_r1.setPivot(-13.9193F, -30.8334F, 0);
		roof_window.addChild(inner_roof_6_r1);
		setRotationAngle(inner_roof_6_r1, 0, 0, -0.7854F);
		inner_roof_6_r1.setTextureOffset(44, 40).addCuboid(-2, 0, -22, 4, 0, 44, 0, false);

		inner_roof_5_r1 = new ModelMapper(modelDataWrapper);
		inner_roof_5_r1.setPivot(-1, -35, 0);
		roof_window.addChild(inner_roof_5_r1);
		setRotationAngle(inner_roof_5_r1, 0, 0, -0.0873F);
		inner_roof_5_r1.setTextureOffset(52, 40).addCuboid(-4, 0, -22, 4, 0, 44, 0, false);

		inner_roof_4_r1 = new ModelMapper(modelDataWrapper);
		inner_roof_4_r1.setPivot(-8.0496F, -34.3781F, 0);
		roof_window.addChild(inner_roof_4_r1);
		setRotationAngle(inner_roof_4_r1, 0, 0, -0.1309F);
		inner_roof_4_r1.setTextureOffset(0, 40).addCuboid(-1, 0, -22, 2, 0, 44, 0, false);

		inner_roof_3_r1 = new ModelMapper(modelDataWrapper);
		inner_roof_3_r1.setPivot(-10.7731F, -33.2476F, 0);
		roof_window.addChild(inner_roof_3_r1);
		setRotationAngle(inner_roof_3_r1, 0, 0, -0.5236F);
		inner_roof_3_r1.setTextureOffset(60, 40).addCuboid(-2, 0, -22, 4, 0, 44, 0, false);

		roof_door = new ModelMapper(modelDataWrapper);
		roof_door.setPivot(0, 24, 0);
		roof_door.setTextureOffset(0, 89).addCuboid(-1, -35, -18, 1, 0, 36, 0, false);

		inner_roof_6_r2 = new ModelMapper(modelDataWrapper);
		inner_roof_6_r2.setPivot(-14.2729F, -30.4798F, -15.5F);
		roof_door.addChild(inner_roof_6_r2);
		setRotationAngle(inner_roof_6_r2, 0, 1.5708F, -0.7854F);
		inner_roof_6_r2.setTextureOffset(160, 102).addCuboid(-2.5F, -4, -2.5F, 5, 4, 5, 0, false);

		inner_roof_5_r2 = new ModelMapper(modelDataWrapper);
		inner_roof_5_r2.setPivot(-14.2729F, -30.4798F, 15.5F);
		roof_door.addChild(inner_roof_5_r2);
		setRotationAngle(inner_roof_5_r2, 0, 1.5708F, -0.7854F);
		inner_roof_5_r2.setTextureOffset(160, 102).addCuboid(-2.5F, -4, -2.5F, 5, 4, 5, 0, true);

		inner_roof_4_r2 = new ModelMapper(modelDataWrapper);
		inner_roof_4_r2.setPivot(-1, -35, 0);
		roof_door.addChild(inner_roof_4_r2);
		setRotationAngle(inner_roof_4_r2, 0, 0, -0.0873F);
		inner_roof_4_r2.setTextureOffset(0, 40).addCuboid(-4, 0, -18, 4, 0, 36, 0, false);

		inner_roof_3_r2 = new ModelMapper(modelDataWrapper);
		inner_roof_3_r2.setPivot(-8.0496F, -34.3781F, 0);
		roof_door.addChild(inner_roof_3_r2);
		setRotationAngle(inner_roof_3_r2, 0, 0, -0.1309F);
		inner_roof_3_r2.setTextureOffset(88, 0).addCuboid(-1, 0, -18, 2, 0, 36, 0, false);

		inner_roof_2_r1 = new ModelMapper(modelDataWrapper);
		inner_roof_2_r1.setPivot(-10.7731F, -33.2476F, 0);
		roof_door.addChild(inner_roof_2_r1);
		setRotationAngle(inner_roof_2_r1, 0, 3.1416F, -0.5236F);
		inner_roof_2_r1.setTextureOffset(80, 0).addCuboid(-2, 0, -18, 4, 0, 36, 0, true);

		inner_roof_1_r1 = new ModelMapper(modelDataWrapper);
		inner_roof_1_r1.setPivot(-18.5F, -32, 41);
		roof_door.addChild(inner_roof_1_r1);
		setRotationAngle(inner_roof_1_r1, 0, 0, -0.0413F);
		inner_roof_1_r1.setTextureOffset(42, 89).addCuboid(0, 0, -54, 6, 0, 26, 0, false);

		roof_exterior = new ModelMapper(modelDataWrapper);
		roof_exterior.setPivot(0, 24, 0);
		roof_exterior.setTextureOffset(0, 89).addCuboid(-5.7229F, -41.9636F, -20, 6, 0, 40, 0, false);

		outer_roof_4_r1 = new ModelMapper(modelDataWrapper);
		outer_roof_4_r1.setPivot(-9.662F, -41.269F, 0);
		roof_exterior.addChild(outer_roof_4_r1);
		setRotationAngle(outer_roof_4_r1, 0, 0, -0.1745F);
		outer_roof_4_r1.setTextureOffset(72, 40).addCuboid(-4, 0, -20, 8, 0, 40, 0, false);

		outer_roof_3_r1 = new ModelMapper(modelDataWrapper);
		outer_roof_3_r1.setPivot(-15.3333F, -39.5745F, 0);
		roof_exterior.addChild(outer_roof_3_r1);
		setRotationAngle(outer_roof_3_r1, 0, 0, -0.5236F);
		outer_roof_3_r1.setTextureOffset(14, 89).addCuboid(-2, 0, -20, 4, 0, 40, 0, false);

		outer_roof_2_r1 = new ModelMapper(modelDataWrapper);
		outer_roof_2_r1.setPivot(-17.8145F, -37.2749F, 0);
		roof_exterior.addChild(outer_roof_2_r1);
		setRotationAngle(outer_roof_2_r1, 0, 0, -1.0472F);
		outer_roof_2_r1.setTextureOffset(22, 89).addCuboid(-1.5F, 0, -20, 3, 0, 40, 0, false);

		outer_roof_1_r1 = new ModelMapper(modelDataWrapper);
		outer_roof_1_r1.setPivot(-20, -14, 0);
		roof_exterior.addChild(outer_roof_1_r1);
		setRotationAngle(outer_roof_1_r1, 0, 0, 0.1107F);
		outer_roof_1_r1.setTextureOffset(52, 207).addCuboid(-1, -22, -20, 1, 4, 40, 0, false);

		door = new ModelMapper(modelDataWrapper);
		door.setPivot(0, 24, 0);
		door.setTextureOffset(190, 188).addCuboid(-20, 0, -16, 20, 1, 32, 0, false);

		door_left = new ModelMapper(modelDataWrapper);
		door_left.setPivot(0, 0, 0);
		door.addChild(door_left);
		door_left.setTextureOffset(0, 170).addCuboid(-19.8F, -14, 0, 0, 14, 14, 0, false);

		door_left_top_r1 = new ModelMapper(modelDataWrapper);
		door_left_top_r1.setPivot(-20.8F, -14, 0);
		door_left.addChild(door_left_top_r1);
		setRotationAngle(door_left_top_r1, 0, 0, 0.1107F);
		door_left_top_r1.setTextureOffset(75, 146).addCuboid(1, -19, 0, 0, 19, 14, 0, false);

		door_right = new ModelMapper(modelDataWrapper);
		door_right.setPivot(0, 0, 0);
		door.addChild(door_right);
		door_right.setTextureOffset(0, 26).addCuboid(-19.8F, -14, -14, 0, 14, 14, 0, false);

		door_right_top_r1 = new ModelMapper(modelDataWrapper);
		door_right_top_r1.setPivot(-20.8F, -14, 0);
		door_right.addChild(door_right_top_r1);
		setRotationAngle(door_right_top_r1, 0, 0, 0.1107F);
		door_right_top_r1.setTextureOffset(0, 75).addCuboid(1, -19, -14, 0, 19, 14, 0, false);

		door_handrail = new ModelMapper(modelDataWrapper);
		door_handrail.setPivot(0, 24, 0);
		door_handrail.setTextureOffset(316, 0).addCuboid(0, -35, 0, 0, 35, 0, 0.2F, false);

		door_exterior = new ModelMapper(modelDataWrapper);
		door_exterior.setPivot(0, 24, 0);
		door_exterior.setTextureOffset(222, 242).addCuboid(-21, 0, -16, 1, 4, 32, 0, false);

		door_left_exterior = new ModelMapper(modelDataWrapper);
		door_left_exterior.setPivot(0, 0, 0);
		door_exterior.addChild(door_left_exterior);
		door_left_exterior.setTextureOffset(220, 136).addCuboid(-20.8F, -14, 0, 1, 14, 15, 0, false);

		door_left_top_r2 = new ModelMapper(modelDataWrapper);
		door_left_top_r2.setPivot(-20.8F, -14, 0);
		door_left_exterior.addChild(door_left_top_r2);
		setRotationAngle(door_left_top_r2, 0, 0, 0.1107F);
		door_left_top_r2.setTextureOffset(140, 273).addCuboid(0, -19, 0, 1, 19, 15, 0, false);

		door_right_exterior = new ModelMapper(modelDataWrapper);
		door_right_exterior.setPivot(0, 0, 0);
		door_exterior.addChild(door_right_exterior);
		door_right_exterior.setTextureOffset(168, 211).addCuboid(-20.8F, -14, -15, 1, 14, 15, 0, false);

		door_right_top_r2 = new ModelMapper(modelDataWrapper);
		door_right_top_r2.setPivot(-20.8F, -14, 0);
		door_right_exterior.addChild(door_right_top_r2);
		setRotationAngle(door_right_top_r2, 0, 0, 0.1107F);
		door_right_top_r2.setTextureOffset(283, 206).addCuboid(0, -19, -15, 1, 19, 15, 0, false);

		end = new ModelMapper(modelDataWrapper);
		end.setPivot(0, 24, 0);
		end.setTextureOffset(168, 58).addCuboid(-20, 0, -12, 40, 1, 20, 0, false);
		end.setTextureOffset(0, 233).addCuboid(9.5F, -35, -12, 9, 35, 18, 0, false);
		end.setTextureOffset(200, 221).addCuboid(-18.5F, -35, -12, 9, 35, 18, 0, false);
		end.setTextureOffset(54, 251).addCuboid(-9.5F, -35, -12, 19, 3, 18, 0, false);
		end.setTextureOffset(135, 91).addCuboid(-20, -14, 6, 3, 14, 5, 0, false);
		end.setTextureOffset(108, 91).addCuboid(17, -14, 6, 3, 14, 5, 0, false);

		upper_wall_2_r2 = new ModelMapper(modelDataWrapper);
		upper_wall_2_r2.setPivot(20, -14, 0);
		end.addChild(upper_wall_2_r2);
		setRotationAngle(upper_wall_2_r2, 0, 0, -0.1107F);
		upper_wall_2_r2.setTextureOffset(94, 207).addCuboid(-3, -19, 6, 3, 19, 5, 0, false);

		upper_wall_1_r1 = new ModelMapper(modelDataWrapper);
		upper_wall_1_r1.setPivot(-20, -14, 0);
		end.addChild(upper_wall_1_r1);
		setRotationAngle(upper_wall_1_r1, 0, 0, 0.1107F);
		upper_wall_1_r1.setTextureOffset(0, 223).addCuboid(0, -19, 6, 3, 19, 5, 0, false);

		end_exterior = new ModelMapper(modelDataWrapper);
		end_exterior.setPivot(0, 24, 0);
		end_exterior.setTextureOffset(0, 160).addCuboid(20, 0, -12, 1, 4, 20, 0, true);
		end_exterior.setTextureOffset(0, 160).addCuboid(-21, 0, -12, 1, 4, 20, 0, false);
		end_exterior.setTextureOffset(256, 221).addCuboid(18, -14, -12, 2, 14, 23, 0, true);
		end_exterior.setTextureOffset(105, 251).addCuboid(-20, -14, -12, 2, 14, 23, 0, false);
		end_exterior.setTextureOffset(82, 91).addCuboid(9.5F, -34, -12, 9, 34, 0, 0, false);
		end_exterior.setTextureOffset(82, 91).addCuboid(-18.5F, -34, -12, 9, 34, 0, 0, true);
		end_exterior.setTextureOffset(168, 79).addCuboid(-18, -41, -12, 36, 7, 0, 0, false);

		upper_wall_2_r3 = new ModelMapper(modelDataWrapper);
		upper_wall_2_r3.setPivot(-20, -14, 0);
		end_exterior.addChild(upper_wall_2_r3);
		setRotationAngle(upper_wall_2_r3, 0, 0, 0.1107F);
		upper_wall_2_r3.setTextureOffset(108, 91).addCuboid(0, -19, -12, 2, 19, 23, 0, false);

		upper_wall_1_r2 = new ModelMapper(modelDataWrapper);
		upper_wall_1_r2.setPivot(20, -14, 0);
		end_exterior.addChild(upper_wall_1_r2);
		setRotationAngle(upper_wall_1_r2, 0, 0, -0.1107F);
		upper_wall_1_r2.setTextureOffset(48, 160).addCuboid(-2, -19, -12, 2, 19, 23, 0, true);

		roof_end_exterior = new ModelMapper(modelDataWrapper);
		roof_end_exterior.setPivot(0, 24, 0);
		roof_end_exterior.setTextureOffset(88, 41).addCuboid(-8, -43, 0, 16, 2, 48, 0, false);

		vent_2_r1 = new ModelMapper(modelDataWrapper);
		vent_2_r1.setPivot(-8, -43, 0);
		roof_end_exterior.addChild(vent_2_r1);
		setRotationAngle(vent_2_r1, 0, 0, -0.3491F);
		vent_2_r1.setTextureOffset(58, 157).addCuboid(-9, 0, 0, 9, 2, 48, 0, false);

		vent_1_r1 = new ModelMapper(modelDataWrapper);
		vent_1_r1.setPivot(8, -43, 0);
		roof_end_exterior.addChild(vent_1_r1);
		setRotationAngle(vent_1_r1, 0, 0, 0.3491F);
		vent_1_r1.setTextureOffset(58, 157).addCuboid(0, 0, 0, 9, 2, 48, 0, true);

		outer_roof_1 = new ModelMapper(modelDataWrapper);
		outer_roof_1.setPivot(0, 0, 0);
		roof_end_exterior.addChild(outer_roof_1);
		outer_roof_1.setTextureOffset(252, 79).addCuboid(-5.7219F, -41.9631F, -12, 6, 1, 20, 0, false);

		outer_roof_4_r2 = new ModelMapper(modelDataWrapper);
		outer_roof_4_r2.setPivot(-9.4875F, -40.2837F, -8);
		outer_roof_1.addChild(outer_roof_4_r2);
		setRotationAngle(outer_roof_4_r2, 0, 0, -0.1745F);
		outer_roof_4_r2.setTextureOffset(36, 223).addCuboid(-4, -1, -4, 8, 1, 20, 0, false);

		outer_roof_3_r2 = new ModelMapper(modelDataWrapper);
		outer_roof_3_r2.setPivot(-14.3994F, -38.9579F, -8);
		outer_roof_1.addChild(outer_roof_3_r2);
		setRotationAngle(outer_roof_3_r2, 0, 0, -0.5236F);
		outer_roof_3_r2.setTextureOffset(124, 157).addCuboid(-2.5F, -1, -4, 4, 1, 20, 0, false);

		outer_roof_2_r2 = new ModelMapper(modelDataWrapper);
		outer_roof_2_r2.setPivot(-16.6984F, -37.2079F, -8);
		outer_roof_1.addChild(outer_roof_2_r2);
		setRotationAngle(outer_roof_2_r2, 0, 0, -1.0472F);
		outer_roof_2_r2.setTextureOffset(260, 129).addCuboid(-2, -1, -4, 3, 1, 20, 0, false);

		outer_roof_1_r2 = new ModelMapper(modelDataWrapper);
		outer_roof_1_r2.setPivot(-20, -14, 0);
		outer_roof_1.addChild(outer_roof_1_r2);
		setRotationAngle(outer_roof_1_r2, 0, 0, 0.1107F);
		outer_roof_1_r2.setTextureOffset(0, 56).addCuboid(-1, -22, -12, 1, 4, 20, 0, false);

		outer_roof_2 = new ModelMapper(modelDataWrapper);
		outer_roof_2.setPivot(0, 0, 0);
		roof_end_exterior.addChild(outer_roof_2);
		outer_roof_2.setTextureOffset(252, 79).addCuboid(-0.2781F, -41.9631F, -12, 6, 1, 20, 0, true);

		outer_roof_4_r3 = new ModelMapper(modelDataWrapper);
		outer_roof_4_r3.setPivot(9.4875F, -40.2837F, -8);
		outer_roof_2.addChild(outer_roof_4_r3);
		setRotationAngle(outer_roof_4_r3, 0, 0, 0.1745F);
		outer_roof_4_r3.setTextureOffset(36, 223).addCuboid(-4, -1, -4, 8, 1, 20, 0, true);

		outer_roof_3_r3 = new ModelMapper(modelDataWrapper);
		outer_roof_3_r3.setPivot(15.2654F, -38.4579F, -8);
		outer_roof_2.addChild(outer_roof_3_r3);
		setRotationAngle(outer_roof_3_r3, 0, 0, 0.5236F);
		outer_roof_3_r3.setTextureOffset(124, 157).addCuboid(-2.5F, -1, -4, 4, 1, 20, 0, true);

		outer_roof_2_r3 = new ModelMapper(modelDataWrapper);
		outer_roof_2_r3.setPivot(16.6984F, -37.2079F, -8);
		outer_roof_2.addChild(outer_roof_2_r3);
		setRotationAngle(outer_roof_2_r3, 0, 0, 1.0472F);
		outer_roof_2_r3.setTextureOffset(260, 129).addCuboid(-1, -1, -4, 3, 1, 20, 0, true);

		outer_roof_1_r3 = new ModelMapper(modelDataWrapper);
		outer_roof_1_r3.setPivot(20, -14, 0);
		outer_roof_2.addChild(outer_roof_1_r3);
		setRotationAngle(outer_roof_1_r3, 0, 0, -0.1107F);
		outer_roof_1_r3.setTextureOffset(0, 56).addCuboid(0, -22, -12, 1, 4, 20, 0, true);

		roof_light = new ModelMapper(modelDataWrapper);
		roof_light.setPivot(0, 24, 0);
		setRotationAngle(roof_light, 0, 3.1416F, 0);


		roof_light_r1 = new ModelMapper(modelDataWrapper);
		roof_light_r1.setPivot(6, -34.2F, 0);
		roof_light.addChild(roof_light_r1);
		setRotationAngle(roof_light_r1, 0, 0, 0.3927F);
		roof_light_r1.setTextureOffset(54, 91).addCuboid(-1.5F, -1, -24, 3, 1, 48, 0, false);

		roof_end_light = new ModelMapper(modelDataWrapper);
		roof_end_light.setPivot(0, 24, 0);


		roof_light_2_r1 = new ModelMapper(modelDataWrapper);
		roof_light_2_r1.setPivot(-6, -34.2F, 0);
		roof_end_light.addChild(roof_light_2_r1);
		setRotationAngle(roof_light_2_r1, 0, 0, -0.3927F);
		roof_light_2_r1.setTextureOffset(220, 136).addCuboid(-1.5F, -1, 6, 3, 1, 34, 0, true);

		roof_light_1_r1 = new ModelMapper(modelDataWrapper);
		roof_light_1_r1.setPivot(6, -34.2F, 0);
		roof_end_light.addChild(roof_light_1_r1);
		setRotationAngle(roof_light_1_r1, 0, 0, 0.3927F);
		roof_light_1_r1.setTextureOffset(220, 136).addCuboid(-1.5F, -1, 6, 3, 1, 34, 0, false);

		roof_head_exterior = new ModelMapper(modelDataWrapper);
		roof_head_exterior.setPivot(0, 24, 0);
		roof_head_exterior.setTextureOffset(88, 41).addCuboid(-8, -43, 0, 16, 2, 48, 0, false);

		vent_2_r2 = new ModelMapper(modelDataWrapper);
		vent_2_r2.setPivot(-8, -43, 0);
		roof_head_exterior.addChild(vent_2_r2);
		setRotationAngle(vent_2_r2, 0, 0, -0.3491F);
		vent_2_r2.setTextureOffset(58, 157).addCuboid(-9, 0, 0, 9, 2, 48, 0, false);

		vent_1_r2 = new ModelMapper(modelDataWrapper);
		vent_1_r2.setPivot(8, -43, 0);
		roof_head_exterior.addChild(vent_1_r2);
		setRotationAngle(vent_1_r2, 0, 0, 0.3491F);
		vent_1_r2.setTextureOffset(58, 157).addCuboid(0, 0, 0, 9, 2, 48, 0, true);

		outer_roof_3 = new ModelMapper(modelDataWrapper);
		outer_roof_3.setPivot(0, 0, 6);
		roof_head_exterior.addChild(outer_roof_3);
		outer_roof_3.setTextureOffset(0, 109).addCuboid(-5.7219F, -41.9631F, -18, 6, 1, 20, 0, false);

		outer_roof_7_r1 = new ModelMapper(modelDataWrapper);
		outer_roof_7_r1.setPivot(-17.3162F, -35.3341F, -22.4193F);
		outer_roof_3.addChild(outer_roof_7_r1);
		setRotationAngle(outer_roof_7_r1, 0, -0.0698F, 0.1107F);
		outer_roof_7_r1.setTextureOffset(0, 310).addCuboid(-1, -0.5F, -4.5F, 2, 1, 9, 0, false);

		outer_roof_6_r1 = new ModelMapper(modelDataWrapper);
		outer_roof_6_r1.setPivot(-20, -14, -6);
		outer_roof_3.addChild(outer_roof_6_r1);
		setRotationAngle(outer_roof_6_r1, 0, 0, 0.1107F);
		outer_roof_6_r1.setTextureOffset(83, 126).addCuboid(-1, -22, -12, 1, 1, 6, 0, false);
		outer_roof_6_r1.setTextureOffset(14, 184).addCuboid(-1, -22, -6, 1, 4, 14, 0, false);

		outer_roof_4_r4 = new ModelMapper(modelDataWrapper);
		outer_roof_4_r4.setPivot(-9.4875F, -40.2837F, -8);
		outer_roof_3.addChild(outer_roof_4_r4);
		setRotationAngle(outer_roof_4_r4, 0, 0, -0.1745F);
		outer_roof_4_r4.setTextureOffset(94, 211).addCuboid(-4, -1, -10, 8, 1, 20, 0, false);

		outer_roof_3_r4 = new ModelMapper(modelDataWrapper);
		outer_roof_3_r4.setPivot(-14.3994F, -38.9579F, -8);
		outer_roof_3.addChild(outer_roof_3_r4);
		setRotationAngle(outer_roof_3_r4, 0, 0, -0.5236F);
		outer_roof_3_r4.setTextureOffset(54, 115).addCuboid(-2.5F, -1, -10, 4, 1, 20, 0, false);

		outer_roof_2_r4 = new ModelMapper(modelDataWrapper);
		outer_roof_2_r4.setPivot(-16.6984F, -37.2079F, -8);
		outer_roof_3.addChild(outer_roof_2_r4);
		setRotationAngle(outer_roof_2_r4, 0, 0, -1.0472F);
		outer_roof_2_r4.setTextureOffset(124, 178).addCuboid(-2, -1, -10, 3, 1, 20, 0, false);

		outer_roof_4 = new ModelMapper(modelDataWrapper);
		outer_roof_4.setPivot(0, 0, 6);
		roof_head_exterior.addChild(outer_roof_4);
		outer_roof_4.setTextureOffset(0, 109).addCuboid(-0.2781F, -41.9631F, -18, 6, 1, 20, 0, true);

		outer_roof_7_r2 = new ModelMapper(modelDataWrapper);
		outer_roof_7_r2.setPivot(17.3162F, -35.3341F, -22.4193F);
		outer_roof_4.addChild(outer_roof_7_r2);
		setRotationAngle(outer_roof_7_r2, 0, 0.0698F, -0.1107F);
		outer_roof_7_r2.setTextureOffset(0, 310).addCuboid(-1, -0.5F, -4.5F, 2, 1, 9, 0, true);

		outer_roof_6_r2 = new ModelMapper(modelDataWrapper);
		outer_roof_6_r2.setPivot(20, -14, -6);
		outer_roof_4.addChild(outer_roof_6_r2);
		setRotationAngle(outer_roof_6_r2, 0, 0, -0.1107F);
		outer_roof_6_r2.setTextureOffset(83, 126).addCuboid(0, -22, -12, 1, 1, 6, 0, true);
		outer_roof_6_r2.setTextureOffset(14, 184).addCuboid(0, -22, -6, 1, 4, 14, 0, true);

		outer_roof_4_r5 = new ModelMapper(modelDataWrapper);
		outer_roof_4_r5.setPivot(9.4875F, -40.2837F, -8);
		outer_roof_4.addChild(outer_roof_4_r5);
		setRotationAngle(outer_roof_4_r5, 0, 0, 0.1745F);
		outer_roof_4_r5.setTextureOffset(94, 211).addCuboid(-4, -1, -10, 8, 1, 20, 0, true);

		outer_roof_3_r5 = new ModelMapper(modelDataWrapper);
		outer_roof_3_r5.setPivot(15.2654F, -38.4579F, -8);
		outer_roof_4.addChild(outer_roof_3_r5);
		setRotationAngle(outer_roof_3_r5, 0, 0, 0.5236F);
		outer_roof_3_r5.setTextureOffset(54, 115).addCuboid(-2.5F, -1, -10, 4, 1, 20, 0, true);

		outer_roof_2_r5 = new ModelMapper(modelDataWrapper);
		outer_roof_2_r5.setPivot(16.6984F, -37.2079F, -8);
		outer_roof_4.addChild(outer_roof_2_r5);
		setRotationAngle(outer_roof_2_r5, 0, 0, 1.0472F);
		outer_roof_2_r5.setTextureOffset(124, 178).addCuboid(-1, -1, -10, 3, 1, 20, 0, true);

		head = new ModelMapper(modelDataWrapper);
		head.setPivot(0, 24, 0);
		head.setTextureOffset(216, 41).addCuboid(-20, 0, 6, 40, 1, 2, 0, false);
		head.setTextureOffset(108, 91).addCuboid(17, -14, 6, 3, 14, 5, 0, false);
		head.setTextureOffset(135, 91).addCuboid(-20, -14, 6, 3, 14, 5, 0, false);
		head.setTextureOffset(128, 0).addCuboid(-18.5F, -35, 6, 37, 35, 0, 0, false);

		upper_wall_2_r4 = new ModelMapper(modelDataWrapper);
		upper_wall_2_r4.setPivot(-20, -14, 0);
		head.addChild(upper_wall_2_r4);
		setRotationAngle(upper_wall_2_r4, 0, 0, 0.1107F);
		upper_wall_2_r4.setTextureOffset(0, 223).addCuboid(0, -19, 6, 3, 19, 5, 0, false);

		upper_wall_1_r3 = new ModelMapper(modelDataWrapper);
		upper_wall_1_r3.setPivot(20, -14, 0);
		head.addChild(upper_wall_1_r3);
		setRotationAngle(upper_wall_1_r3, 0, 0, -0.1107F);
		upper_wall_1_r3.setTextureOffset(94, 207).addCuboid(-3, -19, 6, 3, 19, 5, 0, false);

		head_exterior = new ModelMapper(modelDataWrapper);
		head_exterior.setPivot(0, 24, 0);
		head_exterior.setTextureOffset(218, 79).addCuboid(19, -14, -21, 1, 14, 32, 0, false);
		head_exterior.setTextureOffset(218, 79).addCuboid(-20, -14, -21, 1, 14, 32, 0, true);
		head_exterior.setTextureOffset(0, 0).addCuboid(-20, 0, -33, 40, 4, 36, 0, false);
		head_exterior.setTextureOffset(174, 157).addCuboid(20, 0, -6, 1, 4, 15, 0, false);
		head_exterior.setTextureOffset(174, 157).addCuboid(-21, 0, -6, 1, 4, 15, 0, true);
		head_exterior.setTextureOffset(218, 125).addCuboid(-20, 0, 3, 40, 1, 3, 0, false);
		head_exterior.setTextureOffset(216, 0).addCuboid(-18.5F, -41, 5, 37, 41, 0, 0, false);

		upper_wall_2_r5 = new ModelMapper(modelDataWrapper);
		upper_wall_2_r5.setPivot(-20, -14, -15);
		head_exterior.addChild(upper_wall_2_r5);
		setRotationAngle(upper_wall_2_r5, 0, 0, 0.1107F);
		upper_wall_2_r5.setTextureOffset(134, 211).addCuboid(0, -21, -6, 1, 21, 32, 0, true);

		upper_wall_1_r4 = new ModelMapper(modelDataWrapper);
		upper_wall_1_r4.setPivot(20, -14, 0);
		head_exterior.addChild(upper_wall_1_r4);
		setRotationAngle(upper_wall_1_r4, 0, 0, -0.1107F);
		upper_wall_1_r4.setTextureOffset(134, 211).addCuboid(-1, -21, -21, 1, 21, 32, 0, false);

		front = new ModelMapper(modelDataWrapper);
		front.setPivot(0, 0, 0);
		head_exterior.addChild(front);


		side_1 = new ModelMapper(modelDataWrapper);
		side_1.setPivot(0, 0, 0);
		front.addChild(side_1);


		outer_roof_5_r1 = new ModelMapper(modelDataWrapper);
		outer_roof_5_r1.setPivot(3.2219F, -40.7466F, -18.8935F);
		side_1.addChild(outer_roof_5_r1);
		setRotationAngle(outer_roof_5_r1, 0.1745F, 0, 0);
		outer_roof_5_r1.setTextureOffset(8, 54).addCuboid(-3.5F, 0, -7, 6, 0, 14, 0, false);

		outer_roof_4_r6 = new ModelMapper(modelDataWrapper);
		outer_roof_4_r6.setPivot(10.4347F, -39.8969F, -18.8935F);
		side_1.addChild(outer_roof_4_r6);
		setRotationAngle(outer_roof_4_r6, 0.1745F, 0, 0.1745F);
		outer_roof_4_r6.setTextureOffset(2, 0).addCuboid(-5, 0, -7, 10, 0, 14, 0, false);

		outer_roof_3_r6 = new ModelMapper(modelDataWrapper);
		outer_roof_3_r6.setPivot(14.4421F, -39.0318F, -18.94F);
		side_1.addChild(outer_roof_3_r6);
		setRotationAngle(outer_roof_3_r6, 0.1309F, 0, 0.5236F);
		outer_roof_3_r6.setTextureOffset(14, 40).addCuboid(-1.5F, 0, -7, 4, 0, 14, 0, false);

		outer_roof_2_r6 = new ModelMapper(modelDataWrapper);
		outer_roof_2_r6.setPivot(17.7118F, -37.2157F, -12.993F);
		side_1.addChild(outer_roof_2_r6);
		setRotationAngle(outer_roof_2_r6, 0.1178F, 0, 1.0472F);
		outer_roof_2_r6.setTextureOffset(16, 14).addCuboid(-1.5F, 0, -13, 3, 0, 14, 0, false);

		front_side_bottom_2_r1 = new ModelMapper(modelDataWrapper);
		front_side_bottom_2_r1.setPivot(23.7436F, -2.2438F, -20);
		side_1.addChild(front_side_bottom_2_r1);
		setRotationAngle(front_side_bottom_2_r1, 0, 0, 0.2618F);
		front_side_bottom_2_r1.setTextureOffset(0, 263).addCuboid(-2, 7, -1, 0, 3, 26, 0, true);

		front_side_bottom_1_r1 = new ModelMapper(modelDataWrapper);
		front_side_bottom_1_r1.setPivot(21.153F, 0.1678F, -20.0075F);
		side_1.addChild(front_side_bottom_1_r1);
		setRotationAngle(front_side_bottom_1_r1, 0, 0.1222F, 0.2618F);
		front_side_bottom_1_r1.setTextureOffset(0, 23).addCuboid(0, 4, -11, 0, 3, 10, 0, false);

		front_side_upper_1_r1 = new ModelMapper(modelDataWrapper);
		front_side_upper_1_r1.setPivot(20, -14, -21);
		side_1.addChild(front_side_upper_1_r1);
		setRotationAngle(front_side_upper_1_r1, 0, 0.1222F, -0.1107F);
		front_side_upper_1_r1.setTextureOffset(0, 44).addCuboid(0, -22, -10, 0, 22, 10, 0, true);

		front_side_lower_1_r1 = new ModelMapper(modelDataWrapper);
		front_side_lower_1_r1.setPivot(20.9925F, 0, -21.1219F);
		side_1.addChild(front_side_lower_1_r1);
		setRotationAngle(front_side_lower_1_r1, 0, 0.1222F, 0);
		front_side_lower_1_r1.setTextureOffset(0, 98).addCuboid(-1, -14, -10, 0, 18, 10, 0, true);

		side_2 = new ModelMapper(modelDataWrapper);
		side_2.setPivot(0, 0, 0);
		front.addChild(side_2);


		outer_roof_5_r2 = new ModelMapper(modelDataWrapper);
		outer_roof_5_r2.setPivot(-3.2219F, -40.7466F, -18.8935F);
		side_2.addChild(outer_roof_5_r2);
		setRotationAngle(outer_roof_5_r2, 0.1745F, 0, 0);
		outer_roof_5_r2.setTextureOffset(8, 54).addCuboid(-2.5F, 0, -7, 6, 0, 14, 0, true);

		outer_roof_4_r7 = new ModelMapper(modelDataWrapper);
		outer_roof_4_r7.setPivot(-10.4347F, -39.8969F, -18.8935F);
		side_2.addChild(outer_roof_4_r7);
		setRotationAngle(outer_roof_4_r7, 0.1745F, 0, -0.1745F);
		outer_roof_4_r7.setTextureOffset(2, 0).addCuboid(-5, 0, -7, 10, 0, 14, 0, true);

		outer_roof_3_r7 = new ModelMapper(modelDataWrapper);
		outer_roof_3_r7.setPivot(-13.0465F, -36.6147F, -9.4949F);
		side_2.addChild(outer_roof_3_r7);
		setRotationAngle(outer_roof_3_r7, 0.1309F, 0, -0.5236F);
		outer_roof_3_r7.setTextureOffset(14, 40).addCuboid(-2.5F, -4, -16, 4, 0, 14, 0, true);

		outer_roof_2_r7 = new ModelMapper(modelDataWrapper);
		outer_roof_2_r7.setPivot(-18.4243F, -37.627F, -6.0415F);
		side_2.addChild(outer_roof_2_r7);
		setRotationAngle(outer_roof_2_r7, 0.1178F, 0, -1.0472F);
		outer_roof_2_r7.setTextureOffset(16, 14).addCuboid(-1.5F, 0, -20, 3, 0, 14, 0, true);

		front_side_bottom_4_r1 = new ModelMapper(modelDataWrapper);
		front_side_bottom_4_r1.setPivot(-19.8799F, -3.2792F, -20);
		side_2.addChild(front_side_bottom_4_r1);
		setRotationAngle(front_side_bottom_4_r1, 0, 0, -0.2618F);
		front_side_bottom_4_r1.setTextureOffset(0, 263).addCuboid(-2, 7, -1, 0, 3, 26, 0, false);

		front_side_bottom_3_r1 = new ModelMapper(modelDataWrapper);
		front_side_bottom_3_r1.setPivot(-19.8589F, 4.9974F, -20.0073F);
		side_2.addChild(front_side_bottom_3_r1);
		setRotationAngle(front_side_bottom_3_r1, 0, -0.1222F, -0.2618F);
		front_side_bottom_3_r1.setTextureOffset(0, 23).addCuboid(0, -1, -11, 0, 3, 10, 0, true);

		front_side_upper_2_r1 = new ModelMapper(modelDataWrapper);
		front_side_upper_2_r1.setPivot(-20, -14, -21);
		side_2.addChild(front_side_upper_2_r1);
		setRotationAngle(front_side_upper_2_r1, 0, -0.1222F, 0.1107F);
		front_side_upper_2_r1.setTextureOffset(0, 44).addCuboid(0, -22, -10, 0, 22, 10, 0, false);

		front_side_lower_2_r1 = new ModelMapper(modelDataWrapper);
		front_side_lower_2_r1.setPivot(-19.0065F, 0, -20.878F);
		side_2.addChild(front_side_lower_2_r1);
		setRotationAngle(front_side_lower_2_r1, 0, -0.1222F, 0);
		front_side_lower_2_r1.setTextureOffset(0, 98).addCuboid(-1, -14, -10, 0, 18, 10, 0, false);

		front_panel = new ModelMapper(modelDataWrapper);
		front_panel.setPivot(0, 0, 2.75F);
		front.addChild(front_panel);


		panel_5_r1 = new ModelMapper(modelDataWrapper);
		panel_5_r1.setPivot(24.1146F, -0.1257F, -35.9598F);
		front_panel.addChild(panel_5_r1);
		setRotationAngle(panel_5_r1, 0, 0, 0);
		panel_5_r1.setTextureOffset(160, 124).addCuboid(-24.5573F, -13.5F, 2, 8, 10, 0, 0, true);

		panel_13_r1 = new ModelMapper(modelDataWrapper);
		panel_13_r1.setPivot(24.1146F, 8.3006F, -43.2568F);
		front_panel.addChild(panel_13_r1);
		setRotationAngle(panel_13_r1, -0.2618F, 0, 0);
		panel_13_r1.setTextureOffset(174, 188).addCuboid(-24.5573F, -50.5F, 2, 8, 17, 0, 0, true);

		panel_8_r1 = new ModelMapper(modelDataWrapper);
		panel_8_r1.setPivot(24.1146F, -0.5024F, -37.7047F);
		front_panel.addChild(panel_8_r1);
		setRotationAngle(panel_8_r1, -0.1309F, 0, 0);
		panel_8_r1.setTextureOffset(16, 223).addCuboid(-24.5573F, -23.5F, 2, 8, 10, 0, 0, true);

		panel_12_r1 = new ModelMapper(modelDataWrapper);
		panel_12_r1.setPivot(-24.1146F, 8.3006F, -43.2568F);
		front_panel.addChild(panel_12_r1);
		setRotationAngle(panel_12_r1, -0.2618F, 0, 0);
		panel_12_r1.setTextureOffset(174, 188).addCuboid(16.5573F, -50.5F, 2, 8, 17, 0, 0, false);

		panel_12_r2 = new ModelMapper(modelDataWrapper);
		panel_12_r2.setPivot(29.1968F, 11.1984F, -41.2713F);
		front_panel.addChild(panel_12_r2);
		setRotationAngle(panel_12_r2, -0.2618F, -0.1309F, 0);
		panel_12_r2.setTextureOffset(218, 86).addCuboid(-20.5F, -53.5F, 2, 13, 17, 0, 0, true);

		panel_9_r1 = new ModelMapper(modelDataWrapper);
		panel_9_r1.setPivot(24.4901F, 4.4548F, -36.1661F);
		front_panel.addChild(panel_9_r1);
		setRotationAngle(panel_9_r1, -0.1309F, -0.1309F, 0);
		panel_9_r1.setTextureOffset(120, 232).addCuboid(-16.5F, -28.5F, 2, 13, 10, 0, 0, true);

		panel_6_r1 = new ModelMapper(modelDataWrapper);
		panel_6_r1.setPivot(26.1601F, -0.1257F, -33.5279F);
		front_panel.addChild(panel_6_r1);
		setRotationAngle(panel_6_r1, 0, -0.1309F, 0);
		panel_6_r1.setTextureOffset(256, 258).addCuboid(-18.5F, -13.5F, 2, 13, 10, 0, 0, true);

		panel_3_r1 = new ModelMapper(modelDataWrapper);
		panel_3_r1.setPivot(15.127F, 0.2727F, -33.998F);
		front_panel.addChild(panel_3_r1);
		setRotationAngle(panel_3_r1, 0.2618F, -0.1309F, 0);
		panel_3_r1.setTextureOffset(176, 91).addCuboid(-7.5F, -3.5F, 2, 13, 11, 0, 0, true);

		panel_11_r1 = new ModelMapper(modelDataWrapper);
		panel_11_r1.setPivot(-29.1968F, 11.1984F, -41.2713F);
		front_panel.addChild(panel_11_r1);
		setRotationAngle(panel_11_r1, -0.2618F, 0.1309F, 0);
		panel_11_r1.setTextureOffset(218, 86).addCuboid(7.5F, -53.5F, 2, 13, 17, 0, 0, false);

		panel_8_r2 = new ModelMapper(modelDataWrapper);
		panel_8_r2.setPivot(-24.4901F, 4.4548F, -36.1661F);
		front_panel.addChild(panel_8_r2);
		setRotationAngle(panel_8_r2, -0.1309F, 0.1309F, 0);
		panel_8_r2.setTextureOffset(120, 232).addCuboid(3.5F, -28.5F, 2, 13, 10, 0, 0, false);

		panel_7_r1 = new ModelMapper(modelDataWrapper);
		panel_7_r1.setPivot(-24.1146F, -0.5024F, -37.7047F);
		front_panel.addChild(panel_7_r1);
		setRotationAngle(panel_7_r1, -0.1309F, 0, 0);
		panel_7_r1.setTextureOffset(16, 223).addCuboid(16.5573F, -23.5F, 2, 8, 10, 0, 0, false);

		panel_5_r2 = new ModelMapper(modelDataWrapper);
		panel_5_r2.setPivot(-26.1601F, -0.1257F, -33.5279F);
		front_panel.addChild(panel_5_r2);
		setRotationAngle(panel_5_r2, 0, 0.1309F, 0);
		panel_5_r2.setTextureOffset(256, 258).addCuboid(5.5F, -13.5F, 2, 13, 10, 0, 0, false);

		panel_4_r1 = new ModelMapper(modelDataWrapper);
		panel_4_r1.setPivot(-24.1146F, -0.1257F, -35.9598F);
		front_panel.addChild(panel_4_r1);
		setRotationAngle(panel_4_r1, 0, 0, 0);
		panel_4_r1.setTextureOffset(160, 124).addCuboid(16.5573F, -13.5F, 2, 8, 10, 0, 0, false);

		panel_4_r2 = new ModelMapper(modelDataWrapper);
		panel_4_r2.setPivot(24.1146F, 0.2727F, -34.9857F);
		front_panel.addChild(panel_4_r2);
		setRotationAngle(panel_4_r2, 0.2618F, 0, 0);
		panel_4_r2.setTextureOffset(0, 130).addCuboid(-24.5573F, -3.5F, 2, 8, 11, 0, 0, true);

		panel_3_r2 = new ModelMapper(modelDataWrapper);
		panel_3_r2.setPivot(-24.1146F, 0.2727F, -34.9857F);
		front_panel.addChild(panel_3_r2);
		setRotationAngle(panel_3_r2, 0.2618F, 0, 0);
		panel_3_r2.setTextureOffset(0, 130).addCuboid(16.5573F, -3.5F, 2, 8, 11, 0, 0, false);

		panel_2_r1 = new ModelMapper(modelDataWrapper);
		panel_2_r1.setPivot(-15.127F, 0.2727F, -33.998F);
		front_panel.addChild(panel_2_r1);
		setRotationAngle(panel_2_r1, 0.2618F, 0.1309F, 0);
		panel_2_r1.setTextureOffset(176, 91).addCuboid(-5.5F, -3.5F, 2, 13, 11, 0, 0, false);

		headlights = new ModelMapper(modelDataWrapper);
		headlights.setPivot(0, 24, 0);
		setRotationAngle(headlights, -0.0175F, 0, 0);


		headlight_3_r1 = new ModelMapper(modelDataWrapper);
		headlight_3_r1.setPivot(9.5402F, -8.0789F, -31.1818F);
		headlights.addChild(headlight_3_r1);
		setRotationAngle(headlight_3_r1, 0, -0.1309F, 0);
		headlight_3_r1.setTextureOffset(0, 5).addCuboid(-2, -2, 0, 4, 4, 0, 0, true);

		headlight_2_r1 = new ModelMapper(modelDataWrapper);
		headlight_2_r1.setPivot(-9.5402F, -8.0789F, -31.1818F);
		headlights.addChild(headlight_2_r1);
		setRotationAngle(headlight_2_r1, 0, 0.1309F, 0);
		headlight_2_r1.setTextureOffset(0, 5).addCuboid(-2, -2, 0, 4, 4, 0, 0, false);

		tail_lights = new ModelMapper(modelDataWrapper);
		tail_lights.setPivot(0, 24, 0);
		setRotationAngle(tail_lights, -0.0175F, 0, 0);


		tail_light_3_r1 = new ModelMapper(modelDataWrapper);
		tail_light_3_r1.setPivot(11.0273F, -10.5789F, -30.986F);
		tail_lights.addChild(tail_light_3_r1);
		setRotationAngle(tail_light_3_r1, 0, -0.1309F, 0);
		tail_light_3_r1.setTextureOffset(0, 0).addCuboid(-3.5F, -0.5F, 0, 7, 5, 0, 0, true);

		tail_light_2_r1 = new ModelMapper(modelDataWrapper);
		tail_light_2_r1.setPivot(-11.0273F, -10.5789F, -30.986F);
		tail_lights.addChild(tail_light_2_r1);
		setRotationAngle(tail_light_2_r1, 0, 0.1309F, 0);
		tail_light_2_r1.setTextureOffset(0, 0).addCuboid(-3.5F, -0.5F, 0, 7, 5, 0, 0, false);

		door_light_on = new ModelMapper(modelDataWrapper);
		door_light_on.setPivot(0, 24, 0);


		light_r1 = new ModelMapper(modelDataWrapper);
		light_r1.setPivot(-20, -14, 0);
		door_light_on.addChild(light_r1);
		setRotationAngle(light_r1, 0, 0, 0.1107F);
		light_r1.setTextureOffset(32, 319).addCuboid(-1, -19.5F, 0, 0, 0, 0, 0.4F, false);

		door_light_off = new ModelMapper(modelDataWrapper);
		door_light_off.setPivot(0, 24, 0);


		light_r2 = new ModelMapper(modelDataWrapper);
		light_r2.setPivot(-20, -14, 0);
		door_light_off.addChild(light_r2);
		setRotationAngle(light_r2, 0, 0, 0.1107F);
		light_r2.setTextureOffset(30, 319).addCuboid(-1, -19.5F, 0, 0, 0, 0, 0.4F, false);

		modelDataWrapper.setModelPart(textureWidth, textureHeight);
		window.setModelPart();
		window_handrails.setModelPart();
		window_exterior.setModelPart();
		side_panel.setModelPart();
		side_panel_translucent.setModelPart();
		roof_window.setModelPart();
		roof_door.setModelPart();
		roof_exterior.setModelPart();
		door.setModelPart();
		door_left.setModelPart(door.name);
		door_right.setModelPart(door.name);
		door_handrail.setModelPart();
		door_exterior.setModelPart();
		door_left_exterior.setModelPart(door_exterior.name);
		door_right_exterior.setModelPart(door_exterior.name);
		end.setModelPart();
		end_exterior.setModelPart();
		roof_end_exterior.setModelPart();
		roof_light.setModelPart();
		roof_end_light.setModelPart();
		roof_head_exterior.setModelPart();
		head.setModelPart();
		head_exterior.setModelPart();
		headlights.setModelPart();
		tail_lights.setModelPart();
		door_light_on.setModelPart();
		door_light_off.setModelPart();
	}

	private static final int DOOR_MAX = 13;
	private static final ModelDoorOverlay MODEL_DOOR_OVERLAY = new ModelDoorOverlay(DOOR_MAX, 6.34F, "door_overlay_c_train_left.png", "door_overlay_c_train_right.png");

	@Override
	protected void renderWindowPositions(MatrixStack matrices, VertexConsumer vertices, RenderStage renderStage, int light, int position, boolean renderDetails, float doorLeftX, float doorRightX, float doorLeftZ, float doorRightZ, boolean isEnd1Head, boolean isEnd2Head) {
		switch (renderStage) {
			case LIGHTS:
				renderMirror(roof_light, matrices, vertices, light, position);
				break;
			case INTERIOR:
				renderMirror(window, matrices, vertices, light, position);
				if (renderDetails) {
					renderMirror(window_handrails, matrices, vertices, light, position);
					renderMirror(roof_window, matrices, vertices, light, position);
					renderMirror(side_panel, matrices, vertices, light, position - 22F);
					renderMirror(side_panel, matrices, vertices, light, position + 22F);
				}
				break;
			case INTERIOR_TRANSLUCENT:
				renderMirror(side_panel_translucent, matrices, vertices, light, position - 22F);
				renderMirror(side_panel_translucent, matrices, vertices, light, position + 22F);
				break;
			case EXTERIOR:
				renderMirror(window_exterior, matrices, vertices, light, position);
				renderMirror(roof_exterior, matrices, vertices, light, position);
				break;
		}
	}

	@Override
	protected void renderDoorPositions(MatrixStack matrices, VertexConsumer vertices, RenderStage renderStage, int light, int position, boolean renderDetails, float doorLeftX, float doorRightX, float doorLeftZ, float doorRightZ, boolean isEnd1Head, boolean isEnd2Head) {
		final boolean middleDoor = isIndex(getDoorPositions().length / 2, position, getDoorPositions());
		final boolean doorOpen = doorLeftZ > 0 || doorRightZ > 0;
		final boolean notLastDoor = !isIndex(0, position, getDoorPositions()) && !isIndex(-1, position, getDoorPositions());

		switch (renderStage) {
			case LIGHTS:
				if (notLastDoor) {
					renderMirror(roof_light, matrices, vertices, light, position);
				}
				if (middleDoor && doorOpen && renderDetails) {
					renderMirror(door_light_on, matrices, vertices, light, position - 40);
				}
				break;
			case INTERIOR:
				door_left.setOffset(0, 0, doorRightZ);
				door_right.setOffset(0, 0, -doorRightZ);
				renderOnce(door, matrices, vertices, light, position);
				door_left.setOffset(0, 0, doorLeftZ);
				door_right.setOffset(0, 0, -doorLeftZ);
				renderOnceFlipped(door, matrices, vertices, light, position);

				if (renderDetails) {
					renderOnce(door_handrail, matrices, vertices, light, position);
					renderMirror(roof_door, matrices, vertices, light, position);
				}
				break;
			case EXTERIOR:
				door_left_exterior.setOffset(0, 0, doorRightZ);
				door_right_exterior.setOffset(0, 0, -doorRightZ);
				renderOnce(door_exterior, matrices, vertices, light, position);
				door_left_exterior.setOffset(0, 0, doorLeftZ);
				door_right_exterior.setOffset(0, 0, -doorLeftZ);
				renderOnceFlipped(door_exterior, matrices, vertices, light, position);
				renderMirror(roof_exterior, matrices, vertices, light, position);
				if (middleDoor && renderDetails) {
					if (!doorOpen) {
						renderMirror(door_light_off, matrices, vertices, light, position - 40);
					}
				}
				break;
		}
	}

	@Override
	protected void renderHeadPosition1(MatrixStack matrices, VertexConsumer vertices, RenderStage renderStage, int light, int position, boolean renderDetails, float doorLeftX, float doorRightX, float doorLeftZ, float doorRightZ, boolean useHeadlights) {
		switch (renderStage) {
			case LIGHTS:
				renderOnce(roof_end_light, matrices, vertices, light, position);
				break;
			case ALWAYS_ON_LIGHTS:
				renderOnce(useHeadlights ? headlights : tail_lights, matrices, vertices, light, position);
				break;
			case INTERIOR:
				renderOnce(head, matrices, vertices, light, position);
				break;
			case EXTERIOR:
				renderOnce(head_exterior, matrices, vertices, light, position);
				renderOnce(roof_head_exterior, matrices, vertices, light, position);
				break;
		}
	}

	@Override
	protected void renderHeadPosition2(MatrixStack matrices, VertexConsumer vertices, RenderStage renderStage, int light, int position, boolean renderDetails, float doorLeftX, float doorRightX, float doorLeftZ, float doorRightZ, boolean useHeadlights) {
		switch (renderStage) {
			case LIGHTS:
				renderOnceFlipped(roof_end_light, matrices, vertices, light, position);
				break;
			case ALWAYS_ON_LIGHTS:
				renderOnceFlipped(useHeadlights ? headlights : tail_lights, matrices, vertices, light, position);
				break;
			case INTERIOR:
				renderOnceFlipped(head, matrices, vertices, light, position);
				break;
			case EXTERIOR:
				renderOnceFlipped(head_exterior, matrices, vertices, light, position);
				renderOnceFlipped(roof_head_exterior, matrices, vertices, light, position);
				break;
		}
	}

	@Override
	protected void renderEndPosition1(MatrixStack matrices, VertexConsumer vertices, RenderStage renderStage, int light, int position, boolean renderDetails, float doorLeftX, float doorRightX, float doorLeftZ, float doorRightZ) {
		switch (renderStage) {
			case LIGHTS:
				renderOnce(roof_end_light, matrices, vertices, light, position);
				break;
			case INTERIOR:
				renderOnce(end, matrices, vertices, light, position);
				break;
			case EXTERIOR:
				renderOnce(end_exterior, matrices, vertices, light, position);
				renderOnce(roof_end_exterior, matrices, vertices, light, position);
				break;
		}
	}

	@Override
	protected void renderEndPosition2(MatrixStack matrices, VertexConsumer vertices, RenderStage renderStage, int light, int position, boolean renderDetails, float doorLeftX, float doorRightX, float doorLeftZ, float doorRightZ) {
		switch (renderStage) {
			case LIGHTS:
				renderOnceFlipped(roof_end_light, matrices, vertices, light, position);
				break;
			case INTERIOR:
				renderOnceFlipped(end, matrices, vertices, light, position);
				break;
			case EXTERIOR:
				renderOnceFlipped(end_exterior, matrices, vertices, light, position);
				renderOnceFlipped(roof_end_exterior, matrices, vertices, light, position);
				break;
		}
	}

	@Override
	protected ModelDoorOverlay getModelDoorOverlay() {
		return MODEL_DOOR_OVERLAY;
	}

	@Override
	protected ModelDoorOverlayTopBase getModelDoorOverlayTop() {
		return null;
	}

	@Override
	protected int[] getWindowPositions() {
		return new int[]{-120, -40, 40, 120};
	}

	@Override
	protected int[] getDoorPositions() {
		return new int[]{-160, -80, 0, 80, 160};
	}

	@Override
	protected int[] getEndPositions() {
		return new int[]{-184, 184};
	}

	@Override
	protected float getDoorAnimationX(float value, boolean opening) {
		return 0;
	}

	@Override
	protected float getDoorAnimationZ(float value, boolean opening) {
		return smoothEnds(0, DOOR_MAX, 0, 0.5F, value);
	}
}