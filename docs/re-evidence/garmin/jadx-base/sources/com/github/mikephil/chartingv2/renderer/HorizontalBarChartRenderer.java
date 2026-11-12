package com.github.mikephil.chartingv2.renderer;

import android.graphics.Canvas;
import android.graphics.Paint;
import com.github.mikephil.chartingv2.animation.ChartAnimator;
import com.github.mikephil.chartingv2.buffer.BarBuffer;
import com.github.mikephil.chartingv2.buffer.HorizontalBarBuffer;
import com.github.mikephil.chartingv2.data.BarData;
import com.github.mikephil.chartingv2.data.BarEntry;
import com.github.mikephil.chartingv2.formatter.ValueFormatter;
import com.github.mikephil.chartingv2.interfaces.dataprovider.BarDataProvider;
import com.github.mikephil.chartingv2.interfaces.datasets.IBarDataSet;
import com.github.mikephil.chartingv2.utils.Transformer;
import com.github.mikephil.chartingv2.utils.Utils;
import com.github.mikephil.chartingv2.utils.ViewPortHandler;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated
public class HorizontalBarChartRenderer extends BarChartRenderer {
    public HorizontalBarChartRenderer(BarDataProvider barDataProvider, ChartAnimator chartAnimator, ViewPortHandler viewPortHandler) {
        super(barDataProvider, chartAnimator, viewPortHandler);
        this.mValuePaint.setTextAlign(Paint.Align.LEFT);
    }

    @Override // com.github.mikephil.chartingv2.renderer.BarChartRenderer
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
        for (int i15 = 0; i15 < barBuffer.size(); i15 += 4) {
            int i16 = i15 + 3;
            if (!this.mViewPortHandler.isInBoundsTop(barBuffer.buffer[i16])) {
                return;
            }
            int i17 = i15 + 1;
            if (this.mViewPortHandler.isInBoundsBottom(barBuffer.buffer[i17])) {
                if (this.mChart.isDrawBarShadowEnabled()) {
                    canvas.drawRect(this.mViewPortHandler.contentLeft(), barBuffer.buffer[i17], this.mViewPortHandler.contentRight(), barBuffer.buffer[i16], this.mShadowPaint);
                }
                this.mRenderPaint.setColor(iBarDataSet.getColor(i15 / 4));
                float[] fArr = barBuffer.buffer;
                canvas.drawRect(fArr[i15], fArr[i17], fArr[i15 + 2], fArr[i16], this.mRenderPaint);
            }
        }
    }

    public void drawValue(Canvas canvas, String str, float f14, float f15, int i14) {
        this.mValuePaint.setColor(i14);
        canvas.drawText(str, f14, f15, this.mValuePaint);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.mikephil.chartingv2.renderer.BarChartRenderer, com.github.mikephil.chartingv2.renderer.DataRenderer
    public void drawValues(Canvas canvas) {
        int i14;
        float[] fArr;
        float f14;
        float[] fArr2;
        HorizontalBarChartRenderer horizontalBarChartRenderer = this;
        if (horizontalBarChartRenderer.passesCheck()) {
            List<T> dataSets = horizontalBarChartRenderer.mChart.getBarData().getDataSets();
            float fConvertDpToPixel = Utils.convertDpToPixel(5.0f);
            boolean zIsDrawValueAboveBarEnabled = horizontalBarChartRenderer.mChart.isDrawValueAboveBarEnabled();
            int i15 = 0;
            while (i15 < horizontalBarChartRenderer.mChart.getBarData().getDataSetCount()) {
                IBarDataSet iBarDataSet = (IBarDataSet) dataSets.get(i15);
                if (iBarDataSet.isDrawValuesEnabled() && iBarDataSet.getEntryCount() != 0) {
                    boolean zIsInverted = horizontalBarChartRenderer.mChart.isInverted(iBarDataSet.getAxisDependency());
                    horizontalBarChartRenderer.applyValueTextStyle(iBarDataSet);
                    float fCalcTextHeight = Utils.calcTextHeight(horizontalBarChartRenderer.mValuePaint, "10") / 2.0f;
                    ValueFormatter valueFormatter = iBarDataSet.getValueFormatter();
                    Transformer transformer = horizontalBarChartRenderer.mChart.getTransformer(iBarDataSet.getAxisDependency());
                    float[] transformedValues = horizontalBarChartRenderer.getTransformedValues(transformer, iBarDataSet, i15);
                    if (iBarDataSet.isStacked()) {
                        int i16 = 0;
                        while (i16 < horizontalBarChartRenderer.mAnimator.getPhaseX() * (transformedValues.length - 1)) {
                            int i17 = i16 / 2;
                            BarEntry barEntry = (BarEntry) iBarDataSet.getEntryForIndex(i17);
                            float[] vals = barEntry.getVals();
                            if (vals == null) {
                                int i18 = i16 + 1;
                                i14 = i16;
                                if (!horizontalBarChartRenderer.mViewPortHandler.isInBoundsTop(transformedValues[i18])) {
                                    break;
                                }
                                if (horizontalBarChartRenderer.mViewPortHandler.isInBoundsX(transformedValues[i14]) && horizontalBarChartRenderer.mViewPortHandler.isInBoundsBottom(transformedValues[i18])) {
                                    String formattedValue = valueFormatter.getFormattedValue(barEntry.getVal(), barEntry, i15, horizontalBarChartRenderer.mViewPortHandler);
                                    float fCalcTextWidth = Utils.calcTextWidth(horizontalBarChartRenderer.mValuePaint, formattedValue);
                                    float f15 = zIsDrawValueAboveBarEnabled ? fConvertDpToPixel : -(fCalcTextWidth + fConvertDpToPixel);
                                    float f16 = zIsDrawValueAboveBarEnabled ? -(fCalcTextWidth + fConvertDpToPixel) : fConvertDpToPixel;
                                    if (zIsInverted) {
                                        f15 = (-f15) - fCalcTextWidth;
                                        f16 = (-f16) - fCalcTextWidth;
                                    }
                                    float f17 = transformedValues[i14];
                                    if (barEntry.getVal() < 0.0f) {
                                        f15 = f16;
                                    }
                                    drawValue(canvas, formattedValue, f17 + f15, transformedValues[i18] + fCalcTextHeight, iBarDataSet.getValueTextColor(i17));
                                }
                            } else {
                                i14 = i16;
                                int length = vals.length * 2;
                                float[] fArr3 = new float[length];
                                float[] fArr4 = vals;
                                float f18 = -barEntry.getNegativeSum();
                                float f19 = 0.0f;
                                int i19 = 0;
                                int i24 = 0;
                                while (i19 < length) {
                                    float f22 = fArr4[i24];
                                    if (f22 >= 0.0f) {
                                        f19 += f22;
                                        f14 = f18;
                                        f18 = f19;
                                    } else {
                                        f14 = f18 - f22;
                                    }
                                    int i25 = i19;
                                    fArr3[i25] = horizontalBarChartRenderer.mAnimator.getPhaseY() * f18;
                                    i19 = i25 + 2;
                                    i24++;
                                    f18 = f14;
                                }
                                transformer.pointValuesToPixel(fArr3);
                                int i26 = 0;
                                while (i26 < length) {
                                    int i27 = length;
                                    float f24 = fArr4[i26 / 2];
                                    int i28 = i26;
                                    String formattedValue2 = valueFormatter.getFormattedValue(f24, barEntry, i15, horizontalBarChartRenderer.mViewPortHandler);
                                    float fCalcTextWidth2 = Utils.calcTextWidth(horizontalBarChartRenderer.mValuePaint, formattedValue2);
                                    float f25 = zIsDrawValueAboveBarEnabled ? fConvertDpToPixel : -(fCalcTextWidth2 + fConvertDpToPixel);
                                    BarEntry barEntry2 = barEntry;
                                    float f26 = zIsDrawValueAboveBarEnabled ? -(fCalcTextWidth2 + fConvertDpToPixel) : fConvertDpToPixel;
                                    if (zIsInverted) {
                                        f25 = (-f25) - fCalcTextWidth2;
                                        f26 = (-f26) - fCalcTextWidth2;
                                    }
                                    float f27 = fArr3[i28];
                                    if (f24 < 0.0f) {
                                        f25 = f26;
                                    }
                                    float f28 = f27 + f25;
                                    float f29 = transformedValues[i14 + 1];
                                    if (!horizontalBarChartRenderer.mViewPortHandler.isInBoundsTop(f29)) {
                                        break;
                                    }
                                    if (horizontalBarChartRenderer.mViewPortHandler.isInBoundsX(f28) && horizontalBarChartRenderer.mViewPortHandler.isInBoundsBottom(f29)) {
                                        fArr = fArr3;
                                        horizontalBarChartRenderer.drawValue(canvas, formattedValue2, f28, f29 + fCalcTextHeight, iBarDataSet.getValueTextColor(i17));
                                    } else {
                                        fArr = fArr3;
                                    }
                                    i26 = i28 + 2;
                                    horizontalBarChartRenderer = this;
                                    i17 = i17;
                                    fArr4 = fArr4;
                                    length = i27;
                                    fArr3 = fArr;
                                    barEntry = barEntry2;
                                }
                            }
                            i16 = i14 + 2;
                            horizontalBarChartRenderer = this;
                        }
                    } else {
                        int i29 = 0;
                        while (i29 < horizontalBarChartRenderer.mAnimator.getPhaseX() * transformedValues.length) {
                            int i30 = i29 + 1;
                            if (!horizontalBarChartRenderer.mViewPortHandler.isInBoundsTop(transformedValues[i30])) {
                                break;
                            }
                            if (horizontalBarChartRenderer.mViewPortHandler.isInBoundsX(transformedValues[i29]) && horizontalBarChartRenderer.mViewPortHandler.isInBoundsBottom(transformedValues[i30])) {
                                int i34 = i29 / 2;
                                BarEntry barEntry3 = (BarEntry) iBarDataSet.getEntryForIndex(i34);
                                float val = barEntry3.getVal();
                                String formattedValue3 = valueFormatter.getFormattedValue(val, barEntry3, i15, horizontalBarChartRenderer.mViewPortHandler);
                                float fCalcTextWidth3 = Utils.calcTextWidth(horizontalBarChartRenderer.mValuePaint, formattedValue3);
                                float f34 = zIsDrawValueAboveBarEnabled ? fConvertDpToPixel : -(fCalcTextWidth3 + fConvertDpToPixel);
                                float[] fArr5 = transformedValues;
                                float f35 = zIsDrawValueAboveBarEnabled ? -(fCalcTextWidth3 + fConvertDpToPixel) : fConvertDpToPixel;
                                if (zIsInverted) {
                                    f34 = (-f34) - fCalcTextWidth3;
                                    f35 = (-f35) - fCalcTextWidth3;
                                }
                                float f36 = fArr5[i29];
                                if (val < 0.0f) {
                                    f34 = f35;
                                }
                                fArr2 = fArr5;
                                horizontalBarChartRenderer = this;
                                horizontalBarChartRenderer.drawValue(canvas, formattedValue3, f36 + f34, fArr5[i30] + fCalcTextHeight, iBarDataSet.getValueTextColor(i34));
                            } else {
                                fArr2 = transformedValues;
                            }
                            i29 += 2;
                            transformedValues = fArr2;
                        }
                    }
                }
                i15++;
                horizontalBarChartRenderer = this;
            }
        }
    }

    @Override // com.github.mikephil.chartingv2.renderer.BarChartRenderer
    public float[] getTransformedValues(Transformer transformer, IBarDataSet iBarDataSet, int i14) {
        return transformer.generateTransformedValuesHorizontalBarChart(iBarDataSet, i14, this.mChart.getBarData(), this.mAnimator.getPhaseY());
    }

    @Override // com.github.mikephil.chartingv2.renderer.BarChartRenderer, com.github.mikephil.chartingv2.renderer.DataRenderer
    public void initBuffers() {
        BarData barData = this.mChart.getBarData();
        this.mBarBuffers = new HorizontalBarBuffer[barData.getDataSetCount()];
        for (int i14 = 0; i14 < this.mBarBuffers.length; i14++) {
            IBarDataSet iBarDataSet = (IBarDataSet) barData.getDataSetByIndex(i14);
            this.mBarBuffers[i14] = new HorizontalBarBuffer(iBarDataSet.getEntryCount() * 4 * (iBarDataSet.isStacked() ? iBarDataSet.getStackSize() : 1), barData.getGroupSpace(), barData.getDataSetCount(), iBarDataSet.isStacked());
        }
    }

    @Override // com.github.mikephil.chartingv2.renderer.BarChartRenderer
    public boolean passesCheck() {
        return ((float) this.mChart.getBarData().getYValCount()) < this.mViewPortHandler.getScaleY() * ((float) this.mChart.getMaxVisibleCount());
    }

    @Override // com.github.mikephil.chartingv2.renderer.BarChartRenderer
    public void prepareBarHighlight(float f14, float f15, float f16, float f17, Transformer transformer) {
        this.mBarRect.set(f15, (f14 - 0.5f) + f17, f16, (f14 + 0.5f) - f17);
        transformer.rectValueToPixelHorizontal(this.mBarRect, this.mAnimator.getPhaseY());
    }
}
