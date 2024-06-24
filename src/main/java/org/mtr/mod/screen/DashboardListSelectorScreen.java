package org.mtr.mod.screen;

import it.unimi.dsi.fastutil.longs.LongArrayList;
import it.unimi.dsi.fastutil.longs.LongCollection;
import it.unimi.dsi.fastutil.longs.LongList;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectImmutableList;
import org.mtr.mapping.holder.ClickableWidget;
import org.mtr.mapping.holder.MinecraftClient;
import org.mtr.mapping.holder.Screen;
import org.mtr.mapping.mapper.ButtonWidgetExtension;
import org.mtr.mapping.mapper.GraphicsHolder;
import org.mtr.mapping.mapper.ScreenExtension;
import org.mtr.mapping.mapper.TextHelper;
import org.mtr.mod.client.ClientData;
import org.mtr.mod.client.IDrawing;
import org.mtr.mod.data.IGui;

import javax.annotation.Nullable;

public class DashboardListSelectorScreen extends ScreenExtension implements IGui {

	private final DashboardList availableList;
	private final DashboardList selectedList;
	private final ButtonWidgetExtension buttonDone;

	private final ScreenExtension previousScreen;
	private final Runnable onClose;
	private final ObjectImmutableList<DashboardListItem> allData;
	private final LongCollection selectedIds;
	private final boolean isSingleSelect;
	private final boolean canRepeat;

	public DashboardListSelectorScreen(@Nullable Runnable onClose, ObjectImmutableList<DashboardListItem> allData, LongCollection selectedIds, boolean isSingleSelect, boolean canRepeat) {
		this(null, onClose, allData, selectedIds, isSingleSelect, canRepeat);
	}

	public DashboardListSelectorScreen(@Nullable ScreenExtension previousScreen, ObjectImmutableList<DashboardListItem> allData, LongCollection selectedIds, boolean isSingleSelect, boolean canRepeat) {
		this(previousScreen, null, allData, selectedIds, isSingleSelect, canRepeat);
	}

	private DashboardListSelectorScreen(@Nullable ScreenExtension previousScreen, @Nullable Runnable onClose, ObjectImmutableList<DashboardListItem> allData, LongCollection selectedIds, boolean isSingleSelect, boolean canRepeat) {
		super();
		this.previousScreen = previousScreen;
		this.onClose = onClose;
		this.allData = allData;
		this.selectedIds = selectedIds;
		this.isSingleSelect = isSingleSelect;
		this.canRepeat = canRepeat;

		availableList = new DashboardList(null, null, null, null, this::onAdd, null, null, () -> ClientData.ROUTES_PLATFORMS_SEARCH, text -> ClientData.ROUTES_PLATFORMS_SEARCH = text);
		selectedList = new DashboardList(null, null, null, this::updateList, null, this::onDelete, () -> selectedIds instanceof LongList ? (LongList) selectedIds : new LongArrayList(), () -> ClientData.ROUTES_PLATFORMS_SELECTED_SEARCH, text -> ClientData.ROUTES_PLATFORMS_SELECTED_SEARCH = text);
		buttonDone = new ButtonWidgetExtension(0, 0, 0, SQUARE_SIZE, TextHelper.translatable("gui.done"), button -> onClose2());
	}

	@Override
	protected void init2() {
		super.init2();
		availableList.x = width / 2 - PANEL_WIDTH - SQUARE_SIZE;
		selectedList.x = width / 2 + SQUARE_SIZE;
		availableList.y = selectedList.y = SQUARE_SIZE * 2;
		availableList.height = selectedList.height = height - SQUARE_SIZE * 5;
		availableList.width = selectedList.width = PANEL_WIDTH;
		availableList.init(this::addChild);
		selectedList.init(this::addChild);
		IDrawing.setPositionAndWidth(buttonDone, (width - PANEL_WIDTH) / 2, height - SQUARE_SIZE * 2, PANEL_WIDTH);
		addChild(new ClickableWidget(buttonDone));
		updateList();
	}

	@Override
	public void tick2() {
		availableList.tick();
		selectedList.tick();
	}

	@Override
	public void render(GraphicsHolder graphicsHolder, int mouseX, int mouseY, float delta) {
		renderBackground(graphicsHolder);
		availableList.render(graphicsHolder);
		selectedList.render(graphicsHolder);
		super.render(graphicsHolder, mouseX, mouseY, delta);
		graphicsHolder.drawCenteredText(TextHelper.translatable("gui.mtr.available"), width / 2 - PANEL_WIDTH / 2 - SQUARE_SIZE, SQUARE_SIZE + TEXT_PADDING, ARGB_WHITE);
		graphicsHolder.drawCenteredText(TextHelper.translatable("gui.mtr.selected"), width / 2 + PANEL_WIDTH / 2 + SQUARE_SIZE, SQUARE_SIZE + TEXT_PADDING, ARGB_WHITE);
	}

	@Override
	public void mouseMoved2(double mouseX, double mouseY) {
		availableList.mouseMoved(mouseX, mouseY);
		selectedList.mouseMoved(mouseX, mouseY);
	}

	@Override
	public boolean mouseScrolled2(double mouseX, double mouseY, double amount) {
		availableList.mouseScrolled(mouseX, mouseY, amount);
		selectedList.mouseScrolled(mouseX, mouseY, amount);
		return super.mouseScrolled2(mouseX, mouseY, amount);
	}

	@Override
	public void onClose2() {
		super.onClose2();
		if (onClose != null) {
			onClose.run();
		}
		if (previousScreen != null) {
			MinecraftClient.getInstance().openScreen(new Screen(previousScreen));
		}
	}

	@Override
	public boolean isPauseScreen2() {
		return false;
	}

	private void updateList() {
		final ObjectArrayList<DashboardListItem> availableData = new ObjectArrayList<>();
		for (final DashboardListItem dashboardListItem : allData) {
			if (canRepeat || !selectedIds.contains(dashboardListItem.id)) {
				availableData.add(dashboardListItem);
			}
		}

		final ObjectArrayList<DashboardListItem> selectedData = new ObjectArrayList<>();
		for (final long selectedId : selectedIds) {
			allData.stream().filter(data -> data.id == selectedId).findFirst().ifPresent(selectedData::add);
		}

		availableList.setData(availableData, false, false, false, false, true, false);
		selectedList.setData(selectedData, false, false, false, canRepeat, false, true);
	}

	private void onAdd(DashboardListItem dashboardListItem, int index) {
		if (isSingleSelect) {
			selectedIds.clear();
		}
		selectedIds.add(dashboardListItem.id);
		updateList();
	}

	private void onDelete(DashboardListItem dashboardListItem, int index) {
		if (canRepeat && selectedIds instanceof LongList) {
			((LongList) selectedIds).removeLong(index);
		} else {
			selectedIds.rem(dashboardListItem.id);
		}
		updateList();
	}
}
