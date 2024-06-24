package org.mtr.mod.screen;

import org.mtr.mapping.holder.ClickableWidget;
import org.mtr.mapping.holder.Screen;
import org.mtr.mapping.holder.Text;
import org.mtr.mapping.mapper.GraphicsHolder;
import org.mtr.mapping.mapper.GuiDrawing;
import org.mtr.mapping.mapper.SliderWidgetExtension;
import org.mtr.mapping.mapper.TextHelper;
import org.mtr.mod.data.IGui;

import javax.annotation.Nullable;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;

public class WidgetShorterSlider extends SliderWidgetExtension implements IGui {

	private final int maxValue;
	private final int markerFrequency;
	private final int markerDisplayedRatio;
	private final IntFunction<String> setMessage;
	private final IntConsumer shiftClickAction;

	private static final int SLIDER_WIDTH = 6;
	private static final int TICK_HEIGHT = SQUARE_SIZE / 2;

	public WidgetShorterSlider(int x, int width, int maxValue, int markerFrequency, int markerDisplayedRatio, IntFunction<String> setMessage, @Nullable IntConsumer shiftClickAction) {
		super(x, 0, width, 0);
		this.maxValue = maxValue;
		this.setMessage = setMessage;
		this.shiftClickAction = shiftClickAction;
		this.markerFrequency = markerFrequency;
		this.markerDisplayedRatio = markerDisplayedRatio;
	}

	public WidgetShorterSlider(int x, int width, int maxValue, IntFunction<String> setMessage, @Nullable IntConsumer shiftClickAction) {
		this(x, width, maxValue, 0, 0, setMessage, shiftClickAction);
	}

	@Override
	public void onClick2(double d, double e) {
		super.onClick2(d, e);
		checkShiftClick();
	}

	@Override
	public void setWidth2(int width) {
		super.setWidth2(Math.min(width, 380));
	}

	@Override
	protected void updateMessage2() {
		setMessage2(new Text(TextHelper.literal(setMessage.apply(getIntValue())).data));
	}

	@Override
	protected void onDrag2(double d, double e, double f, double g) {
		super.onDrag2(d, e, f, g);
		checkShiftClick();
	}

	@Override
	protected void applyValue2() {
	}

	@Override
	public void render(GraphicsHolder graphicsHolder, int mouseX, int mouseY, float delta) {
		final GuiDrawing guiDrawing = new GuiDrawing(graphicsHolder);
		guiDrawing.beginDrawingTexture(ClickableWidget.getWidgetsTextureMapped());

		IGui.drawTexture(guiDrawing, getX2(), getY2(), 0, 46, width / 2, height / 2);
		IGui.drawTexture(guiDrawing, getX2(), getY2() + height / 2, 0, 66 - height / 2, width / 2, height / 2);
		IGui.drawTexture(guiDrawing, getX2() + width / 2, getY2(), 200 - width / 2, 46, width / 2, height / 2);
		IGui.drawTexture(guiDrawing, getX2() + width / 2, getY2() + height / 2, 200 - width / 2, 66 - height / 2, width / 2, height / 2);

		final int v = isHovered2() ? 86 : 66;
		final int xOffset = (width - SLIDER_WIDTH) * getIntValue() / maxValue;
		IGui.drawTexture(guiDrawing, getX2() + xOffset, getY2(), 0, v, SLIDER_WIDTH / 2, height / 2);
		IGui.drawTexture(guiDrawing, getX2() + xOffset, getY2() + height / 2, 0, v + 20 - height / 2, SLIDER_WIDTH / 2, height / 2);
		IGui.drawTexture(guiDrawing, getX2() + xOffset + SLIDER_WIDTH / 2, getY2(), 200 - SLIDER_WIDTH / 2, v, SLIDER_WIDTH / 2, height / 2);
		IGui.drawTexture(guiDrawing, getX2() + xOffset + SLIDER_WIDTH / 2, getY2() + height / 2, 200 - SLIDER_WIDTH / 2, v + 20 - height / 2, SLIDER_WIDTH / 2, height / 2);

		graphicsHolder.drawText(getMessage2().getString(), getX2() + width + TEXT_PADDING, getY2() + (height - TEXT_HEIGHT) / 2, ARGB_WHITE, false, MAX_LIGHT_GLOWING);

		if (markerFrequency > 0) {
			for (int i = 1; i <= maxValue / markerFrequency; i++) {
				final int xOffset1 = (width - SLIDER_WIDTH) * i * markerFrequency / maxValue;
				IGui.drawTexture(guiDrawing, getX2() + xOffset1 + SLIDER_WIDTH / 3, getY2() + height, 10, 68, 2, TICK_HEIGHT);
				graphicsHolder.drawCenteredText(String.valueOf(i * markerFrequency / markerDisplayedRatio), getX2() + xOffset1 + SLIDER_WIDTH / 2, getY2() + height + TICK_HEIGHT + 2, ARGB_WHITE);
			}
		}
	}

	public void setValue(int valueInt) {
		value = (double) valueInt / maxValue;
		updateMessage2();
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getIntValue() {
		return (int) Math.round(value * maxValue);
	}

	private void checkShiftClick() {
		if (shiftClickAction != null && Screen.hasShiftDown()) {
			shiftClickAction.accept(getIntValue());
		}
	}
}
