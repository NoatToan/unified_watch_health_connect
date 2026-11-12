package com.huami.chart.render;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.huami.chart.chart.HMChart;
import com.huami.chart.data.ChartData;
import com.huami.chart.provider.PaintProvider;
import com.huami.chart.style.ValueStyle;
import com.huami.chart.util.ChartUtil;
import com.huami.chart.util.Index;

/* JADX INFO: loaded from: classes6.dex */
public class ValueRender extends BaseRender<ValueStyle> {
    private static final String i = "ValueRender";

    public ValueRender(HMChart hMChart, PaintProvider paintProvider) {
        super(hMChart, paintProvider);
    }

    private String e(ChartData chartData, float f) {
        return ((ValueStyle) this.mStyle).getValueTransformation() != null ? ((ValueStyle) this.mStyle).getValueTransformation().onValueTrans(chartData.getSumValue(), this.hmChart.getHmDataCacheCenter().getIndexByPosition(f / this.hmChart.getInteractiveManager().getScaleFactorX(), 0.0f)) : "";
    }

    @Override // com.huami.chart.render.BaseRender
    public void draw(Canvas canvas, int i2, int i3, float f) {
        ChartData dataByPositionIndex;
        ChartData dataByPositionIndex2;
        super.draw(canvas, i2, i3, f);
        for (int canvasStart = getCanvasStart(); canvasStart <= getCanvasEnd(); canvasStart++) {
            if ((((ValueStyle) this.mStyle).getValueStyle() & 2) > 0) {
                ChartData dataByPositionIndex3 = this.hmChart.getChartDataManager().getDataByPositionIndex(canvasStart);
                if (dataByPositionIndex3 != null) {
                    float positionByPosIndex = getPositionByPosIndex(canvasStart);
                    float fClipValueInCorrectRange = clipValueInCorrectRange(getShownDataHorizonalValue(positionByPosIndex));
                    String strE = e(dataByPositionIndex3, positionByPosIndex);
                    if (!strE.isEmpty()) {
                        float positionByValue = getPositionByValue(dataByPositionIndex3.getSumValue());
                        Paint valuePaint = this.paintProvider.getValuePaint(highlight(fClipValueInCorrectRange, -1.0f));
                        valuePaint.setStyle(((ValueStyle) this.mStyle).getPaintStyle());
                        canvas.drawText(strE, fClipValueInCorrectRange - (ChartUtil.calculateTextWidth(valuePaint, strE) / 2.0f), positionByValue - ((ValueStyle) this.mStyle).getValueBottomMargin(), valuePaint);
                        if ((((ValueStyle) this.mStyle).getValueStyle() & 8) <= 0) {
                        }
                    }
                }
            } else if ((((ValueStyle) this.mStyle).getValueStyle() & 8) <= 0 && ((ValueStyle) this.mStyle).getShowValueSpecialPosition().contains(Integer.valueOf(canvasStart)) && (dataByPositionIndex2 = this.hmChart.getChartDataManager().getDataByPositionIndex(canvasStart)) != null) {
                float positionByPosIndex2 = getPositionByPosIndex(canvasStart);
                float fClipValueInCorrectRange2 = clipValueInCorrectRange(getShownDataHorizonalValue(positionByPosIndex2));
                String strE2 = e(dataByPositionIndex2, positionByPosIndex2);
                if (!strE2.isEmpty()) {
                    float positionByValue2 = getPositionByValue(dataByPositionIndex2.getSumValue());
                    Paint valuePaint2 = this.paintProvider.getValuePaint(highlight(fClipValueInCorrectRange2, -1.0f));
                    valuePaint2.setStyle(((ValueStyle) this.mStyle).getPaintStyle());
                    canvas.drawText(strE2, fClipValueInCorrectRange2 - (ChartUtil.calculateTextWidth(valuePaint2, strE2) / 2.0f), positionByValue2 - ((ValueStyle) this.mStyle).getValueBottomMargin(), valuePaint2);
                }
            }
        }
        if ((((ValueStyle) this.mStyle).getValueStyle() & 4) > 0) {
            Index currentIndex = this.hmChart.getInteractiveManager().getCurrentIndex();
            if (currentIndex.isInvalidate() || (dataByPositionIndex = this.hmChart.getChartDataManager().getDataByPositionIndex(currentIndex.getPosiIndex().getIndex())) == null) {
                return;
            }
            if (((ValueStyle) this.mStyle).isDrawEmptyValue() || dataByPositionIndex.getSumValue() > this.hmChart.getChartDataManager().getChartDataList().getMinDataValue()) {
                float positionByPosIndex3 = getPositionByPosIndex(currentIndex.getPosiIndex().getIndex());
                float fClipValueInCorrectRange3 = clipValueInCorrectRange(getShownDataHorizonalValue(positionByPosIndex3));
                String strE3 = e(dataByPositionIndex, positionByPosIndex3);
                float bottom = ((ValueStyle) this.mStyle).getValueGravity() == ValueStyle.ValueGravity.BOTTOM ? this.hmChart.getDrawAreaManager().getBottom() : ((ValueStyle) this.mStyle).getValueGravity() == ValueStyle.ValueGravity.CENTER ? getShownDataVerticalValue(getPositionByValue(dataByPositionIndex.getSumValue() / 2.0f)) : getShownDataVerticalValue(getPositionByValue(dataByPositionIndex.getSumValue()));
                Paint valuePaint3 = this.paintProvider.getValuePaint(highlight(fClipValueInCorrectRange3, -1.0f));
                valuePaint3.setStyle(((ValueStyle) this.mStyle).getPaintStyle());
                if (((ValueStyle) this.mStyle).getValueBitmap() == null) {
                    if (strE3.isEmpty()) {
                        return;
                    }
                    canvas.drawText(strE3, fClipValueInCorrectRange3 - (ChartUtil.calculateTextWidth(valuePaint3, strE3) / 2.0f), (bottom - ((ValueStyle) this.mStyle).getValueBottomMargin()) - ChartUtil.calculateTextHeight(valuePaint3, strE3), valuePaint3);
                } else {
                    Bitmap bitmapTintBitmap = ((ValueStyle) this.mStyle).getBitmapTintColor() != -7829368 ? ChartUtil.tintBitmap(((ValueStyle) this.mStyle).getValueBitmap(), ((ValueStyle) this.mStyle).getBitmapTintColor()) : ((ValueStyle) this.mStyle).getValueBitmap();
                    if (bitmapTintBitmap.isRecycled()) {
                        return;
                    }
                    canvas.drawBitmap(bitmapTintBitmap, fClipValueInCorrectRange3 - (bitmapTintBitmap.getWidth() / 2), (bottom - ((ValueStyle) this.mStyle).getValueBottomMargin()) - bitmapTintBitmap.getHeight(), valuePaint3);
                }
            }
        }
    }
}
