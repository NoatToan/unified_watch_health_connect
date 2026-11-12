package com.github.mikephil.charting.renderer;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.buffer.BarBuffer;
import com.github.mikephil.charting.buffer.HorizontalBarBuffer;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.formatter.IValueFormatter;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider;
import com.github.mikephil.charting.interfaces.dataprovider.ChartInterface;
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;
import com.github.mikephil.charting.utils.Fill;
import com.github.mikephil.charting.utils.MPPointF;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class HorizontalBarChartRenderer extends BarChartRenderer {
    private RectF mBarShadowRectBuffer;

    public HorizontalBarChartRenderer(BarDataProvider barDataProvider, ChartAnimator chartAnimator, ViewPortHandler viewPortHandler) {
        super(barDataProvider, chartAnimator, viewPortHandler);
        this.mBarShadowRectBuffer = new RectF();
        this.mValuePaint.setTextAlign(Paint.Align.LEFT);
    }

    @Override // com.github.mikephil.charting.renderer.BarChartRenderer, com.github.mikephil.charting.renderer.DataRenderer
    public void initBuffers() {
        BarData barData = this.mChart.getBarData();
        this.mBarBuffers = new HorizontalBarBuffer[barData.getDataSetCount()];
        for (int i = 0; i < this.mBarBuffers.length; i++) {
            IBarDataSet iBarDataSet = (IBarDataSet) barData.getDataSetByIndex(i);
            this.mBarBuffers[i] = new HorizontalBarBuffer(iBarDataSet.getEntryCount() * 4 * (iBarDataSet.isStacked() ? iBarDataSet.getStackSize() : 1), barData.getDataSetCount(), iBarDataSet.isStacked());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.mikephil.charting.renderer.BarChartRenderer
    protected void drawDataSet(Canvas canvas, IBarDataSet iBarDataSet, int i) {
        Transformer transformer = this.mChart.getTransformer(iBarDataSet.getAxisDependency());
        this.mBarBorderPaint.setColor(iBarDataSet.getBarBorderColor());
        this.mBarBorderPaint.setStrokeWidth(Utils.convertDpToPixel(iBarDataSet.getBarBorderWidth()));
        int i2 = 0;
        boolean z = iBarDataSet.getBarBorderWidth() > 0.0f;
        float phaseX = this.mAnimator.getPhaseX();
        float phaseY = this.mAnimator.getPhaseY();
        if (this.mChart.isDrawBarShadowEnabled()) {
            this.mShadowPaint.setColor(iBarDataSet.getBarShadowColor());
            float barWidth = this.mChart.getBarData().getBarWidth() / 2.0f;
            int iMin = Math.min((int) Math.ceil(iBarDataSet.getEntryCount() * phaseX), iBarDataSet.getEntryCount());
            for (int i3 = 0; i3 < iMin; i3++) {
                float x = ((BarEntry) iBarDataSet.getEntryForIndex(i3)).getX();
                this.mBarShadowRectBuffer.top = x - barWidth;
                this.mBarShadowRectBuffer.bottom = x + barWidth;
                transformer.rectValueToPixel(this.mBarShadowRectBuffer);
                if (this.mViewPortHandler.isInBoundsTop(this.mBarShadowRectBuffer.bottom)) {
                    if (!this.mViewPortHandler.isInBoundsBottom(this.mBarShadowRectBuffer.top)) {
                        break;
                    }
                    this.mBarShadowRectBuffer.left = this.mViewPortHandler.contentLeft();
                    this.mBarShadowRectBuffer.right = this.mViewPortHandler.contentRight();
                    canvas.drawRect(this.mBarShadowRectBuffer, this.mShadowPaint);
                }
            }
        }
        BarBuffer barBuffer = this.mBarBuffers[i];
        barBuffer.setPhases(phaseX, phaseY);
        barBuffer.setDataSet(i);
        barBuffer.setInverted(this.mChart.isInverted(iBarDataSet.getAxisDependency()));
        barBuffer.setBarWidth(this.mChart.getBarData().getBarWidth());
        barBuffer.feed(iBarDataSet);
        transformer.pointValuesToPixel(barBuffer.buffer);
        boolean z2 = (iBarDataSet.getFills() == null || iBarDataSet.getFills().isEmpty()) ? false : true;
        boolean z3 = iBarDataSet.getColors().size() == 1;
        boolean zIsInverted = this.mChart.isInverted(iBarDataSet.getAxisDependency());
        if (z3) {
            this.mRenderPaint.setColor(iBarDataSet.getColor());
        }
        int i4 = 0;
        while (i2 < barBuffer.size()) {
            int i5 = i2 + 3;
            if (!this.mViewPortHandler.isInBoundsTop(barBuffer.buffer[i5])) {
                return;
            }
            int i6 = i2 + 1;
            if (this.mViewPortHandler.isInBoundsBottom(barBuffer.buffer[i6])) {
                if (!z3) {
                    this.mRenderPaint.setColor(iBarDataSet.getColor(i2 / 4));
                }
                if (z2) {
                    iBarDataSet.getFill(i4).fillRect(canvas, this.mRenderPaint, barBuffer.buffer[i2], barBuffer.buffer[i6], barBuffer.buffer[i2 + 2], barBuffer.buffer[i5], zIsInverted ? Fill.Direction.LEFT : Fill.Direction.RIGHT, 0.0f);
                } else {
                    canvas.drawRect(barBuffer.buffer[i2], barBuffer.buffer[i6], barBuffer.buffer[i2 + 2], barBuffer.buffer[i5], this.mRenderPaint);
                }
                if (z) {
                    canvas.drawRect(barBuffer.buffer[i2], barBuffer.buffer[i6], barBuffer.buffer[i2 + 2], barBuffer.buffer[i5], this.mBarBorderPaint);
                }
            }
            i2 += 4;
            i4++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:156:0x03e1  */
    /* JADX WARN: Code duplicated, block: B:157:0x03e4  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not found block with instruction: 0x00f6: MOVE (r3v17 ?? I:??[OBJECT, ARRAY]) A[DONT_GENERATE, REMOVE] */
    /* JADX WARN: Not found block with instruction: 0x0108: MOVE (r5v17 ?? I:??[OBJECT, ARRAY]) A[DONT_GENERATE, REMOVE] */
    @Override // com.github.mikephil.charting.renderer.BarChartRenderer, com.github.mikephil.charting.renderer.DataRenderer
    public void drawValues(Canvas canvas) {
        List list;
        float f;
        MPPointF mPPointF;
        float f2;
        float f3;
        if (isDrawingValuesAllowed(this.mChart)) {
            List dataSets = this.mChart.getBarData().getDataSets();
            float fConvertDpToPixel = Utils.convertDpToPixel(5.0f);
            boolean zIsDrawValueAboveBarEnabled = this.mChart.isDrawValueAboveBarEnabled();
            int i = 0;
            while (i < this.mChart.getBarData().getDataSetCount()) {
                IBarDataSet iBarDataSet = (IBarDataSet) dataSets.get(i);
                if (iBarDataSet.getEntryCount() != 0 && shouldDrawValues(iBarDataSet)) {
                    boolean zIsInverted = this.mChart.isInverted(iBarDataSet.getAxisDependency());
                    applyValueTextStyle(iBarDataSet);
                    float f4 = 2.0f;
                    float fCalcTextHeight = Utils.calcTextHeight(this.mValuePaint, "10") / 2.0f;
                    IValueFormatter valueFormatter = iBarDataSet.getValueFormatter();
                    BarBuffer barBuffer = this.mBarBuffers[i];
                    float phaseY = this.mAnimator.getPhaseY();
                    MPPointF mPPointF2 = MPPointF.getInstance(iBarDataSet.getIconsOffset());
                    mPPointF2.x = Utils.convertDpToPixel(mPPointF2.x);
                    mPPointF2.y = Utils.convertDpToPixel(mPPointF2.y);
                    if (iBarDataSet.isStacked()) {
                        list = dataSets;
                        f = fConvertDpToPixel;
                        mPPointF = mPPointF2;
                        Transformer transformer = this.mChart.getTransformer(iBarDataSet.getAxisDependency());
                        int i2 = 0;
                        int length = 0;
                        while (i2 < iBarDataSet.getEntryCount() * this.mAnimator.getPhaseX()) {
                            BarEntry barEntry = (BarEntry) iBarDataSet.getEntryForIndex(i2);
                            int valueTextColor = iBarDataSet.getValueTextColor(i2);
                            float[] yVals = barEntry.getYVals();
                            if (yVals == null) {
                                int i3 = length + 1;
                                if (!this.mViewPortHandler.isInBoundsTop(barBuffer.buffer[i3])) {
                                    break;
                                }
                                if (this.mViewPortHandler.isInBoundsX(barBuffer.buffer[length]) && this.mViewPortHandler.isInBoundsBottom(barBuffer.buffer[i3])) {
                                    String formattedValue = valueFormatter.getFormattedValue(barEntry.getY(), barEntry, i, this.mViewPortHandler);
                                    float fCalcTextWidth = Utils.calcTextWidth(this.mValuePaint, formattedValue);
                                    float f5 = zIsDrawValueAboveBarEnabled ? f : -(fCalcTextWidth + f);
                                    float f6 = zIsDrawValueAboveBarEnabled ? -(fCalcTextWidth + f) : f;
                                    if (zIsInverted) {
                                        f5 = (-f5) - fCalcTextWidth;
                                        f6 = (-f6) - fCalcTextWidth;
                                    }
                                    float f7 = f5;
                                    float f8 = f6;
                                    if (iBarDataSet.isDrawValuesEnabled()) {
                                        drawValue(canvas, formattedValue, barBuffer.buffer[length + 2] + (barEntry.getY() >= 0.0f ? f7 : f8), barBuffer.buffer[i3] + fCalcTextHeight, valueTextColor);
                                    }
                                    if (barEntry.getIcon() != null && iBarDataSet.isDrawIconsEnabled()) {
                                        Drawable icon = barEntry.getIcon();
                                        float f9 = barBuffer.buffer[length + 2];
                                        if (barEntry.getY() < 0.0f) {
                                            f7 = f8;
                                        }
                                        Utils.drawImage(canvas, icon, (int) (f9 + f7 + mPPointF.x), (int) (barBuffer.buffer[i3] + mPPointF.y), icon.getIntrinsicWidth(), icon.getIntrinsicHeight());
                                    }
                                }
                            } else {
                                i2 = i2;
                                yVals = yVals;
                                int length2 = yVals.length * 2;
                                float[] fArr = new float[length2];
                                float f10 = -barEntry.getNegativeSum();
                                float f11 = 0.0f;
                                int i4 = 0;
                                int i5 = 0;
                                while (i4 < length2) {
                                    float f12 = yVals[i5];
                                    if (f12 == 0.0f && (f11 == 0.0f || f10 == 0.0f)) {
                                        float f13 = f10;
                                        f10 = f12;
                                        f2 = f13;
                                    } else if (f12 >= 0.0f) {
                                        f11 += f12;
                                        f2 = f10;
                                        f10 = f11;
                                    } else {
                                        f2 = f10 - f12;
                                    }
                                    fArr[i4] = f10 * phaseY;
                                    i4 += 2;
                                    i5++;
                                    f10 = f2;
                                }
                                transformer.pointValuesToPixel(fArr);
                                int i6 = 0;
                                while (true) {
                                    if (i6 < length2) {
                                        float f14 = yVals[i6 / 2];
                                        String formattedValue2 = valueFormatter.getFormattedValue(f14, barEntry, i, this.mViewPortHandler);
                                        float fCalcTextWidth2 = Utils.calcTextWidth(this.mValuePaint, formattedValue2);
                                        float f15 = zIsDrawValueAboveBarEnabled ? f : -(fCalcTextWidth2 + f);
                                        int i7 = length2;
                                        float f16 = zIsDrawValueAboveBarEnabled ? -(fCalcTextWidth2 + f) : f;
                                        if (zIsInverted) {
                                            f15 = (-f15) - fCalcTextWidth2;
                                            f16 = (-f16) - fCalcTextWidth2;
                                        }
                                        boolean z = (f14 == 0.0f && f10 == 0.0f && f11 > 0.0f) || f14 < 0.0f;
                                        float f17 = fArr[i6];
                                        if (z) {
                                            f15 = f16;
                                        }
                                        float f18 = f17 + f15;
                                        float f19 = (barBuffer.buffer[length + 1] + barBuffer.buffer[length + 3]) / 2.0f;
                                        if (!this.mViewPortHandler.isInBoundsTop(f19)) {
                                            break;
                                        }
                                        if (this.mViewPortHandler.isInBoundsX(f18) && this.mViewPortHandler.isInBoundsBottom(f19)) {
                                            if (iBarDataSet.isDrawValuesEnabled()) {
                                                drawValue(canvas, formattedValue2, f18, f19 + fCalcTextHeight, valueTextColor);
                                            }
                                            if (barEntry.getIcon() != null && iBarDataSet.isDrawIconsEnabled()) {
                                                Drawable icon2 = barEntry.getIcon();
                                                Utils.drawImage(canvas, icon2, (int) (f18 + mPPointF.x), (int) (f19 + mPPointF.y), icon2.getIntrinsicWidth(), icon2.getIntrinsicHeight());
                                            }
                                        } else {
                                            i6 = i6;
                                            fArr = fArr;
                                        }
                                        i6 += 2;
                                        length2 = i7;
                                        fArr = fArr;
                                    }
                                }
                                if (yVals == null) {
                                    length += 4;
                                } else {
                                    length += yVals.length * 4;
                                }
                                i2++;
                            }
                            if (yVals == null) {
                                length += 4;
                            } else {
                                length += yVals.length * 4;
                            }
                            i2++;
                        }
                    } else {
                        int i8 = 0;
                        while (i8 < barBuffer.buffer.length * this.mAnimator.getPhaseX()) {
                            int i9 = i8 + 1;
                            float f20 = (barBuffer.buffer[i9] + barBuffer.buffer[i8 + 3]) / f4;
                            if (!this.mViewPortHandler.isInBoundsTop(barBuffer.buffer[i9])) {
                                break;
                            }
                            if (this.mViewPortHandler.isInBoundsX(barBuffer.buffer[i8]) && this.mViewPortHandler.isInBoundsBottom(barBuffer.buffer[i9])) {
                                BarEntry barEntry2 = (BarEntry) iBarDataSet.getEntryForIndex(i8 / 4);
                                float y = barEntry2.getY();
                                String formattedValue3 = valueFormatter.getFormattedValue(y, barEntry2, i, this.mViewPortHandler);
                                float fCalcTextWidth3 = Utils.calcTextWidth(this.mValuePaint, formattedValue3);
                                float f21 = zIsDrawValueAboveBarEnabled ? fConvertDpToPixel : -(fCalcTextWidth3 + fConvertDpToPixel);
                                int i10 = i8 + 2;
                                f3 = fConvertDpToPixel;
                                float f22 = (zIsDrawValueAboveBarEnabled ? -(fCalcTextWidth3 + fConvertDpToPixel) : fConvertDpToPixel) - (barBuffer.buffer[i10] - barBuffer.buffer[i8]);
                                if (zIsInverted) {
                                    f21 = (-f21) - fCalcTextWidth3;
                                    f22 = (-f22) - fCalcTextWidth3;
                                }
                                float f23 = f21;
                                float f24 = f22;
                                if (iBarDataSet.isDrawValuesEnabled()) {
                                    drawValue(canvas, formattedValue3, (y >= 0.0f ? f23 : f24) + barBuffer.buffer[i10], f20 + fCalcTextHeight, iBarDataSet.getValueTextColor(i8 / 2));
                                }
                                if (barEntry2.getIcon() != null && iBarDataSet.isDrawIconsEnabled()) {
                                    Drawable icon3 = barEntry2.getIcon();
                                    float f25 = barBuffer.buffer[i10];
                                    if (y < 0.0f) {
                                        f23 = f24;
                                    }
                                    Utils.drawImage(canvas, icon3, (int) (f25 + f23 + r19.x), (int) (f20 + r19.y), icon3.getIntrinsicWidth(), icon3.getIntrinsicHeight());
                                }
                            } else {
                                i8 = i8;
                                dataSets = dataSets;
                                f3 = fConvertDpToPixel;
                                fCalcTextHeight = fCalcTextHeight;
                                barBuffer = barBuffer;
                            }
                            i8 += 4;
                            mPPointF2 = mPPointF2;
                            barBuffer = barBuffer;
                            valueFormatter = valueFormatter;
                            dataSets = dataSets;
                            fConvertDpToPixel = f3;
                            fCalcTextHeight = fCalcTextHeight;
                            f4 = 2.0f;
                        }
                        list = dataSets;
                        f = fConvertDpToPixel;
                        mPPointF = mPPointF2;
                    }
                    MPPointF.recycleInstance(mPPointF);
                } else {
                    list = dataSets;
                    f = fConvertDpToPixel;
                }
                i++;
                dataSets = list;
                fConvertDpToPixel = f;
            }
        }
    }

    protected void drawValue(Canvas canvas, String str, float f, float f2, int i) {
        this.mValuePaint.setColor(i);
        canvas.drawText(str, f, f2, this.mValuePaint);
    }

    @Override // com.github.mikephil.charting.renderer.BarChartRenderer
    protected void prepareBarHighlight(float f, float f2, float f3, float f4, Transformer transformer) {
        this.mBarRect.set(f2, f - f4, f3, f + f4);
        transformer.rectToPixelPhaseHorizontal(this.mBarRect, this.mAnimator.getPhaseY());
    }

    @Override // com.github.mikephil.charting.renderer.BarChartRenderer
    protected void setHighlightDrawPos(Highlight highlight, RectF rectF) {
        highlight.setDraw(rectF.centerY(), rectF.right);
    }

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    protected boolean isDrawingValuesAllowed(ChartInterface chartInterface) {
        return ((float) chartInterface.getData().getEntryCount()) < ((float) chartInterface.getMaxVisibleCount()) * this.mViewPortHandler.getScaleY();
    }
}
