package com.github.mikephil.chartingv2.renderer;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.github.mikephil.chartingv2.animation.ChartAnimator;
import com.github.mikephil.chartingv2.buffer.BarBuffer;
import com.github.mikephil.chartingv2.data.BarData;
import com.github.mikephil.chartingv2.data.BarEntry;
import com.github.mikephil.chartingv2.highlight.Highlight;
import com.github.mikephil.chartingv2.interfaces.dataprovider.BarDataProvider;
import com.github.mikephil.chartingv2.interfaces.datasets.IBarDataSet;
import com.github.mikephil.chartingv2.utils.Transformer;
import com.github.mikephil.chartingv2.utils.Utils;
import com.github.mikephil.chartingv2.utils.ViewPortHandler;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated
public class BarChartRenderer extends DataRenderer {
    protected BarBuffer[] mBarBuffers;
    protected RectF mBarRect;
    protected BarDataProvider mChart;
    protected Paint mShadowPaint;

    public BarChartRenderer(BarDataProvider barDataProvider, ChartAnimator chartAnimator, ViewPortHandler viewPortHandler) {
        super(chartAnimator, viewPortHandler);
        this.mBarRect = new RectF();
        this.mChart = barDataProvider;
        Paint paint = new Paint(1);
        this.mHighlightPaint = paint;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.mHighlightPaint.setColor(Color.rgb(0, 0, 0));
        this.mHighlightPaint.setAlpha(120);
        Paint paint2 = new Paint(1);
        this.mShadowPaint = paint2;
        paint2.setStyle(style);
    }

    @Override // com.github.mikephil.chartingv2.renderer.DataRenderer
    public void drawData(Canvas canvas) {
        BarData barData = this.mChart.getBarData();
        for (int i14 = 0; i14 < barData.getDataSetCount(); i14++) {
            IBarDataSet iBarDataSet = (IBarDataSet) barData.getDataSetByIndex(i14);
            if (iBarDataSet.isVisible() && iBarDataSet.getEntryCount() > 0) {
                drawDataSet(canvas, iBarDataSet, i14);
            }
        }
    }

    public void drawDataSet(Canvas canvas, IBarDataSet iBarDataSet, int i14) {
        Transformer transformer = this.mChart.getTransformer(iBarDataSet.getAxisDependency());
        this.mShadowPaint.setColor(iBarDataSet.getBarShadowColor());
        float phaseX = this.mAnimator.getPhaseX();
        float phaseY = this.mAnimator.getPhaseY();
        BarBuffer barBuffer = this.mBarBuffers[i14];
        barBuffer.setPhases(phaseX, phaseY);
        barBuffer.setBarSpace(iBarDataSet.getBarSpace());
        barBuffer.setDataSet(i14);
        barBuffer.setInverted(this.mChart.isInverted(iBarDataSet.getAxisDependency()));
        barBuffer.feed(iBarDataSet);
        transformer.pointValuesToPixel(barBuffer.buffer);
        int i15 = 0;
        if (this.mChart.isDrawBarShadowEnabled()) {
            for (int i16 = 0; i16 < barBuffer.size(); i16 += 4) {
                int i17 = i16 + 2;
                if (this.mViewPortHandler.isInBoundsLeft(barBuffer.buffer[i17])) {
                    if (!this.mViewPortHandler.isInBoundsRight(barBuffer.buffer[i16])) {
                        break;
                    } else {
                        canvas.drawRect(barBuffer.buffer[i16], this.mViewPortHandler.contentTop(), barBuffer.buffer[i17], this.mViewPortHandler.contentBottom(), this.mShadowPaint);
                    }
                }
            }
        }
        if (iBarDataSet.getColors().size() > 1) {
            while (i15 < barBuffer.size()) {
                int i18 = i15 + 2;
                if (this.mViewPortHandler.isInBoundsLeft(barBuffer.buffer[i18])) {
                    if (!this.mViewPortHandler.isInBoundsRight(barBuffer.buffer[i15])) {
                        return;
                    }
                    this.mRenderPaint.setColor(iBarDataSet.getColor(i15 / 4));
                    float[] fArr = barBuffer.buffer;
                    canvas.drawRect(fArr[i15], fArr[i15 + 1], fArr[i18], fArr[i15 + 3], this.mRenderPaint);
                }
                i15 += 4;
            }
            return;
        }
        this.mRenderPaint.setColor(iBarDataSet.getColor());
        while (i15 < barBuffer.size()) {
            int i19 = i15 + 2;
            if (this.mViewPortHandler.isInBoundsLeft(barBuffer.buffer[i19])) {
                if (!this.mViewPortHandler.isInBoundsRight(barBuffer.buffer[i15])) {
                    return;
                }
                float[] fArr2 = barBuffer.buffer;
                canvas.drawRect(fArr2[i15], fArr2[i15 + 1], fArr2[i19], fArr2[i15 + 3], this.mRenderPaint);
            }
            i15 += 4;
        }
    }

    @Override // com.github.mikephil.chartingv2.renderer.DataRenderer
    public void drawExtras(Canvas canvas) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.mikephil.chartingv2.renderer.DataRenderer
    public void drawHighlighted(Canvas canvas, Highlight[] highlightArr) {
        BarEntry barEntry;
        float val;
        float f14;
        int dataSetCount = this.mChart.getBarData().getDataSetCount();
        for (Highlight highlight : highlightArr) {
            int xIndex = highlight.getXIndex();
            int dataSetIndex = highlight.getDataSetIndex();
            IBarDataSet iBarDataSet = (IBarDataSet) this.mChart.getBarData().getDataSetByIndex(dataSetIndex);
            if (iBarDataSet != null && iBarDataSet.isHighlightEnabled()) {
                float barSpace = iBarDataSet.getBarSpace() / 2.0f;
                Transformer transformer = this.mChart.getTransformer(iBarDataSet.getAxisDependency());
                this.mHighlightPaint.setColor(iBarDataSet.getHighLightColor());
                this.mHighlightPaint.setAlpha(iBarDataSet.getHighLightAlpha());
                if (xIndex >= 0) {
                    float f15 = xIndex;
                    if (f15 < (this.mAnimator.getPhaseX() * this.mChart.getXChartMax()) / dataSetCount && (barEntry = (BarEntry) iBarDataSet.getEntryForXIndex(xIndex)) != null && barEntry.getXIndex() == xIndex) {
                        float groupSpace = this.mChart.getBarData().getGroupSpace();
                        float f16 = (groupSpace * f15) + (groupSpace / 2.0f) + (xIndex * dataSetCount) + dataSetIndex;
                        if (highlight.getStackIndex() >= 0) {
                            val = highlight.getRange().from;
                            f14 = highlight.getRange().f52830to;
                        } else {
                            val = barEntry.getVal();
                            f14 = 0.0f;
                        }
                        prepareBarHighlight(f16, val, f14, barSpace, transformer);
                        canvas.drawRect(this.mBarRect, this.mHighlightPaint);
                        if (this.mChart.isDrawHighlightArrowEnabled()) {
                            this.mHighlightPaint.setAlpha(255);
                            float phaseY = this.mAnimator.getPhaseY() * 0.07f;
                            float[] fArr = new float[9];
                            transformer.getPixelToValueMatrix().getValues(fArr);
                            float fAbs = Math.abs(fArr[4] / fArr[0]);
                            float barSpace2 = iBarDataSet.getBarSpace() / 2.0f;
                            float f17 = fAbs * barSpace2;
                            float phaseY2 = this.mAnimator.getPhaseY() * val;
                            Path path = new Path();
                            float f18 = f16 + 0.4f;
                            float f19 = phaseY2 + phaseY;
                            path.moveTo(f18, f19);
                            float f22 = f18 + barSpace2;
                            path.lineTo(f22, f19 - f17);
                            path.lineTo(f22, f19 + f17);
                            transformer.pathValueToPixel(path);
                            canvas.drawPath(path, this.mHighlightPaint);
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.mikephil.chartingv2.renderer.DataRenderer
    public void drawValues(Canvas canvas) {
        int i14;
        List list;
        Transformer transformer;
        float f14;
        float[] fArr;
        BarChartRenderer barChartRenderer = this;
        if (barChartRenderer.passesCheck()) {
            List dataSets = barChartRenderer.mChart.getBarData().getDataSets();
            float fConvertDpToPixel = Utils.convertDpToPixel(4.5f);
            boolean zIsDrawValueAboveBarEnabled = barChartRenderer.mChart.isDrawValueAboveBarEnabled();
            int i15 = 0;
            while (i15 < barChartRenderer.mChart.getBarData().getDataSetCount()) {
                IBarDataSet iBarDataSet = (IBarDataSet) dataSets.get(i15);
                if (iBarDataSet.isDrawValuesEnabled() && iBarDataSet.getEntryCount() != 0) {
                    barChartRenderer.applyValueTextStyle(iBarDataSet);
                    boolean zIsInverted = barChartRenderer.mChart.isInverted(iBarDataSet.getAxisDependency());
                    float fCalcTextHeight = Utils.calcTextHeight(barChartRenderer.mValuePaint, "8");
                    float f15 = zIsDrawValueAboveBarEnabled ? -fConvertDpToPixel : fCalcTextHeight + fConvertDpToPixel;
                    float f16 = zIsDrawValueAboveBarEnabled ? fCalcTextHeight + fConvertDpToPixel : -fConvertDpToPixel;
                    if (zIsInverted) {
                        f15 = (-f15) - fCalcTextHeight;
                        f16 = (-f16) - fCalcTextHeight;
                    }
                    float f17 = f15;
                    float f18 = f16;
                    Transformer transformer2 = barChartRenderer.mChart.getTransformer(iBarDataSet.getAxisDependency());
                    float[] transformedValues = barChartRenderer.getTransformedValues(transformer2, iBarDataSet, i15);
                    if (iBarDataSet.isStacked()) {
                        int i16 = 0;
                        while (i16 < barChartRenderer.mAnimator.getPhaseX() * (transformedValues.length - 1)) {
                            int i17 = i16 / 2;
                            BarEntry barEntry = (BarEntry) iBarDataSet.getEntryForIndex(i17);
                            float[] vals = barEntry.getVals();
                            if (vals != null) {
                                i14 = i16;
                                list = dataSets;
                                transformer = transformer2;
                                int valueTextColor = iBarDataSet.getValueTextColor(i17);
                                int length = vals.length * 2;
                                float[] fArr2 = new float[length];
                                float f19 = -barEntry.getNegativeSum();
                                float f22 = 0.0f;
                                int i18 = 0;
                                int i19 = 0;
                                while (i18 < length) {
                                    float f24 = vals[i19];
                                    if (f24 >= 0.0f) {
                                        f22 += f24;
                                        f14 = f19;
                                        f19 = f22;
                                    } else {
                                        f14 = f19 - f24;
                                    }
                                    fArr2[i18 + 1] = barChartRenderer.mAnimator.getPhaseY() * f19;
                                    i18 += 2;
                                    i19++;
                                    f19 = f14;
                                }
                                transformer.pointValuesToPixel(fArr2);
                                int i24 = 0;
                                while (i24 < length) {
                                    float[] fArr3 = vals;
                                    float f25 = transformedValues[i14];
                                    int i25 = i24 / 2;
                                    int i26 = length;
                                    float f26 = fArr2[i24 + 1] + (fArr3[i25] >= 0.0f ? f17 : f18);
                                    float[] fArr4 = fArr2;
                                    if (!barChartRenderer.mViewPortHandler.isInBoundsRight(f25)) {
                                        break;
                                    }
                                    if (barChartRenderer.mViewPortHandler.isInBoundsY(f26) && barChartRenderer.mViewPortHandler.isInBoundsLeft(f25)) {
                                        barChartRenderer.drawValue(canvas, iBarDataSet.getValueFormatter(), fArr3[i25], barEntry, i15, f25, f26, valueTextColor);
                                    }
                                    i24 += 2;
                                    barChartRenderer = this;
                                    vals = fArr3;
                                    fArr2 = fArr4;
                                    length = i26;
                                }
                            } else {
                                if (!barChartRenderer.mViewPortHandler.isInBoundsRight(transformedValues[i16])) {
                                    break;
                                }
                                int i27 = i16 + 1;
                                if (barChartRenderer.mViewPortHandler.isInBoundsY(transformedValues[i27]) && barChartRenderer.mViewPortHandler.isInBoundsLeft(transformedValues[i16])) {
                                    i14 = i16;
                                    list = dataSets;
                                    transformer = transformer2;
                                    barChartRenderer.drawValue(canvas, iBarDataSet.getValueFormatter(), barEntry.getVal(), barEntry, i15, transformedValues[i14], transformedValues[i27] + (barEntry.getVal() >= 0.0f ? f17 : f18), iBarDataSet.getValueTextColor(i17));
                                } else {
                                    i14 = i16;
                                    list = dataSets;
                                    transformer = transformer2;
                                }
                            }
                            i16 = i14 + 2;
                            barChartRenderer = this;
                            transformer2 = transformer;
                            dataSets = list;
                        }
                    } else {
                        int i28 = 0;
                        while (i28 < barChartRenderer.mAnimator.getPhaseX() * transformedValues.length && barChartRenderer.mViewPortHandler.isInBoundsRight(transformedValues[i28])) {
                            int i29 = i28 + 1;
                            if (barChartRenderer.mViewPortHandler.isInBoundsY(transformedValues[i29]) && barChartRenderer.mViewPortHandler.isInBoundsLeft(transformedValues[i28])) {
                                int i30 = i28 / 2;
                                BarEntry barEntry2 = (BarEntry) iBarDataSet.getEntryForIndex(i30);
                                float val = barEntry2.getVal();
                                float[] fArr5 = transformedValues;
                                fArr = fArr5;
                                barChartRenderer.drawValue(canvas, iBarDataSet.getValueFormatter(), val, barEntry2, i15, fArr5[i28], fArr5[i29] + (val >= 0.0f ? f17 : f18), iBarDataSet.getValueTextColor(i30));
                            } else {
                                fArr = transformedValues;
                            }
                            i28 += 2;
                            transformedValues = fArr;
                        }
                    }
                }
                i15++;
                barChartRenderer = this;
                dataSets = dataSets;
            }
        }
    }

    public float[] getTransformedValues(Transformer transformer, IBarDataSet iBarDataSet, int i14) {
        return transformer.generateTransformedValuesBarChart(iBarDataSet, i14, this.mChart.getBarData(), this.mAnimator.getPhaseY());
    }

    @Override // com.github.mikephil.chartingv2.renderer.DataRenderer
    public void initBuffers() {
        BarData barData = this.mChart.getBarData();
        this.mBarBuffers = new BarBuffer[barData.getDataSetCount()];
        for (int i14 = 0; i14 < this.mBarBuffers.length; i14++) {
            IBarDataSet iBarDataSet = (IBarDataSet) barData.getDataSetByIndex(i14);
            this.mBarBuffers[i14] = new BarBuffer(iBarDataSet.getEntryCount() * 4 * (iBarDataSet.isStacked() ? iBarDataSet.getStackSize() : 1), barData.getGroupSpace(), barData.getDataSetCount(), iBarDataSet.isStacked());
        }
    }

    public boolean passesCheck() {
        return ((float) this.mChart.getBarData().getYValCount()) < this.mViewPortHandler.getScaleX() * ((float) this.mChart.getMaxVisibleCount());
    }

    public void prepareBarHighlight(float f14, float f15, float f16, float f17, Transformer transformer) {
        this.mBarRect.set((f14 - 0.5f) + f17, f15, (f14 + 0.5f) - f17, f16);
        transformer.rectValueToPixel(this.mBarRect, this.mAnimator.getPhaseY());
    }
}
