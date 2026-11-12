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
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider;
import com.github.mikephil.charting.interfaces.dataprovider.ChartInterface;
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;
import com.github.mikephil.charting.utils.MPPointF;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class HorizontalBarChartRenderer extends BarChartRenderer {
    private RectF mBarShadowRectBuffer;

    public HorizontalBarChartRenderer(BarDataProvider barDataProvider, ChartAnimator chartAnimator, ViewPortHandler viewPortHandler) {
        super(barDataProvider, chartAnimator, viewPortHandler);
        this.mBarShadowRectBuffer = new RectF();
        this.mValuePaint.setTextAlign(Paint.Align.LEFT);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.mikephil.charting.renderer.BarChartRenderer
    public void drawDataSet(Canvas canvas, IBarDataSet iBarDataSet, int i14) {
        Transformer transformer = this.mChart.getTransformer(iBarDataSet.getAxisDependency());
        this.mBarBorderPaint.setColor(iBarDataSet.getBarBorderColor());
        this.mBarBorderPaint.setStrokeWidth(Utils.convertDpToPixel(iBarDataSet.getBarBorderWidth()));
        boolean z14 = iBarDataSet.getBarBorderWidth() > 0.0f;
        float phaseX = this.mAnimator.getPhaseX();
        float phaseY = this.mAnimator.getPhaseY();
        if (this.mChart.isDrawBarShadowEnabled()) {
            this.mShadowPaint.setColor(iBarDataSet.getBarShadowColor());
            float barWidth = this.mChart.getBarData().getBarWidth() / 2.0f;
            int iMin = Math.min((int) Math.ceil(iBarDataSet.getEntryCount() * phaseX), iBarDataSet.getEntryCount());
            for (int i15 = 0; i15 < iMin; i15++) {
                float x14 = ((BarEntry) iBarDataSet.getEntryForIndex(i15)).getX();
                RectF rectF = this.mBarShadowRectBuffer;
                rectF.top = x14 - barWidth;
                rectF.bottom = x14 + barWidth;
                transformer.rectValueToPixel(rectF);
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
        BarBuffer barBuffer = this.mBarBuffers[i14];
        barBuffer.setPhases(phaseX, phaseY);
        barBuffer.setDataSet(i14);
        barBuffer.setInverted(this.mChart.isInverted(iBarDataSet.getAxisDependency()));
        barBuffer.setBarWidth(this.mChart.getBarData().getBarWidth());
        barBuffer.feed(iBarDataSet);
        transformer.pointValuesToPixel(barBuffer.buffer);
        boolean z15 = iBarDataSet.getColors().size() == 1;
        if (z15) {
            this.mRenderPaint.setColor(iBarDataSet.getColor());
        }
        for (int i16 = 0; i16 < barBuffer.size(); i16 += 4) {
            int i17 = i16 + 3;
            if (!this.mViewPortHandler.isInBoundsTop(barBuffer.buffer[i17])) {
                return;
            }
            int i18 = i16 + 1;
            if (this.mViewPortHandler.isInBoundsBottom(barBuffer.buffer[i18])) {
                if (!z15) {
                    this.mRenderPaint.setColor(iBarDataSet.getColor(i16 / 4));
                }
                float[] fArr = barBuffer.buffer;
                int i19 = i16 + 2;
                canvas.drawRect(fArr[i16], fArr[i18], fArr[i19], fArr[i17], this.mRenderPaint);
                if (z14) {
                    float[] fArr2 = barBuffer.buffer;
                    canvas.drawRect(fArr2[i16], fArr2[i18], fArr2[i19], fArr2[i17], this.mBarBorderPaint);
                }
            }
        }
    }

    @Override // com.github.mikephil.charting.renderer.BarChartRenderer, com.github.mikephil.charting.renderer.DataRenderer
    public void drawValue(Canvas canvas, String str, float f14, float f15, int i14) {
        this.mValuePaint.setColor(i14);
        canvas.drawText(str, f14, f15, this.mValuePaint);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.mikephil.charting.renderer.BarChartRenderer, com.github.mikephil.charting.renderer.DataRenderer
    public void drawValues(Canvas canvas) {
        List list;
        float f14;
        MPPointF mPPointF;
        int i14;
        float[] fArr;
        int i15;
        float f15;
        boolean z14;
        int i16;
        float f16;
        MPPointF mPPointF2;
        BarChartRenderer barChartRenderer = this;
        if (barChartRenderer.isDrawingValuesAllowed(barChartRenderer.mChart)) {
            List dataSets = barChartRenderer.mChart.getBarData().getDataSets();
            float fConvertDpToPixel = Utils.convertDpToPixel(5.0f);
            boolean zIsDrawValueAboveBarEnabled = barChartRenderer.mChart.isDrawValueAboveBarEnabled();
            int i17 = 0;
            while (i17 < barChartRenderer.mChart.getBarData().getDataSetCount()) {
                IBarDataSet iBarDataSet = (IBarDataSet) dataSets.get(i17);
                if (barChartRenderer.shouldDrawValues(iBarDataSet)) {
                    boolean zIsInverted = barChartRenderer.mChart.isInverted(iBarDataSet.getAxisDependency());
                    barChartRenderer.applyValueTextStyle(iBarDataSet);
                    float f17 = 2.0f;
                    float fCalcTextHeight = Utils.calcTextHeight(barChartRenderer.mValuePaint, "10") / 2.0f;
                    ValueFormatter valueFormatter = iBarDataSet.getValueFormatter();
                    BarBuffer barBuffer = barChartRenderer.mBarBuffers[i17];
                    float phaseY = barChartRenderer.mAnimator.getPhaseY();
                    MPPointF mPPointF3 = MPPointF.getInstance(iBarDataSet.getIconsOffset());
                    mPPointF3.f52828x = Utils.convertDpToPixel(mPPointF3.f52828x);
                    mPPointF3.f52829y = Utils.convertDpToPixel(mPPointF3.f52829y);
                    if (iBarDataSet.isStacked()) {
                        list = dataSets;
                        f14 = fConvertDpToPixel;
                        mPPointF = mPPointF3;
                        Transformer transformer = barChartRenderer.mChart.getTransformer(iBarDataSet.getAxisDependency());
                        int i18 = 0;
                        int length = 0;
                        while (i18 < barChartRenderer.mAnimator.getPhaseX() * iBarDataSet.getEntryCount()) {
                            BarEntry barEntry = (BarEntry) iBarDataSet.getEntryForIndex(i18);
                            int valueTextColor = iBarDataSet.getValueTextColor(i18);
                            float[] yVals = barEntry.getYVals();
                            if (yVals == null) {
                                int i19 = length + 1;
                                if (!barChartRenderer.mViewPortHandler.isInBoundsTop(barBuffer.buffer[i19])) {
                                    break;
                                }
                                if (barChartRenderer.mViewPortHandler.isInBoundsX(barBuffer.buffer[length]) && barChartRenderer.mViewPortHandler.isInBoundsBottom(barBuffer.buffer[i19])) {
                                    fArr = yVals;
                                    String barLabel = valueFormatter.getBarLabel(barEntry);
                                    float fCalcTextWidth = Utils.calcTextWidth(barChartRenderer.mValuePaint, barLabel);
                                    float f18 = zIsDrawValueAboveBarEnabled ? f14 : -(fCalcTextWidth + f14);
                                    float f19 = zIsDrawValueAboveBarEnabled ? -(fCalcTextWidth + f14) : f14;
                                    if (zIsInverted) {
                                        f18 = (-f18) - fCalcTextWidth;
                                        f19 = (-f19) - fCalcTextWidth;
                                    }
                                    float f22 = f18;
                                    float f24 = f19;
                                    if (iBarDataSet.isDrawValuesEnabled()) {
                                        drawValue(canvas, barLabel, barBuffer.buffer[length + 2] + (barEntry.getY() >= 0.0f ? f22 : f24), barBuffer.buffer[i19] + fCalcTextHeight, valueTextColor);
                                    }
                                    if (r23.getIcon() == null || !iBarDataSet.isDrawIconsEnabled()) {
                                        i14 = i17;
                                    } else {
                                        Drawable icon = r23.getIcon();
                                        float f25 = barBuffer.buffer[length + 2];
                                        if (barEntry.getY() < 0.0f) {
                                            f22 = f24;
                                        }
                                        float f26 = barBuffer.buffer[i19];
                                        i14 = i17;
                                        Utils.drawImage(canvas, icon, (int) (f25 + f22 + mPPointF.f52828x), (int) (f26 + mPPointF.f52829y), icon.getIntrinsicWidth(), icon.getIntrinsicHeight());
                                    }
                                }
                            } else {
                                BarEntry barEntry2 = barEntry;
                                zIsDrawValueAboveBarEnabled = zIsDrawValueAboveBarEnabled;
                                i14 = i17;
                                BarChartRenderer barChartRenderer2 = barChartRenderer;
                                fArr = yVals;
                                int length2 = fArr.length * 2;
                                float[] fArr2 = new float[length2];
                                float f27 = -barEntry2.getNegativeSum();
                                float f28 = 0.0f;
                                int i24 = 0;
                                int i25 = 0;
                                while (i24 < length2) {
                                    float f29 = fArr[i25];
                                    if (f29 == 0.0f && (f28 == 0.0f || f27 == 0.0f)) {
                                        float f34 = f27;
                                        f27 = f29;
                                        f15 = f34;
                                    } else if (f29 >= 0.0f) {
                                        f28 += f29;
                                        f15 = f27;
                                        f27 = f28;
                                    } else {
                                        f15 = f27 - f29;
                                    }
                                    fArr2[i24] = f27 * phaseY;
                                    i24 += 2;
                                    i25++;
                                    f27 = f15;
                                }
                                transformer.pointValuesToPixel(fArr2);
                                int i26 = 0;
                                while (i26 < length2) {
                                    float f35 = fArr[i26 / 2];
                                    BarEntry barEntry3 = barEntry2;
                                    int i27 = i26;
                                    String barStackedLabel = valueFormatter.getBarStackedLabel(f35, barEntry3);
                                    int i28 = length2;
                                    float fCalcTextWidth2 = Utils.calcTextWidth(barChartRenderer2.mValuePaint, barStackedLabel);
                                    float f36 = zIsDrawValueAboveBarEnabled ? f14 : -(fCalcTextWidth2 + f14);
                                    float[] fArr3 = fArr2;
                                    float f37 = zIsDrawValueAboveBarEnabled ? -(fCalcTextWidth2 + f14) : f14;
                                    if (zIsInverted) {
                                        f36 = (-f36) - fCalcTextWidth2;
                                        f37 = (-f37) - fCalcTextWidth2;
                                    }
                                    boolean z15 = (f35 == 0.0f && f27 == 0.0f && f28 > 0.0f) || f35 < 0.0f;
                                    float f38 = fArr3[i27];
                                    if (z15) {
                                        f36 = f37;
                                    }
                                    float f39 = f38 + f36;
                                    float[] fArr4 = barBuffer.buffer;
                                    float f44 = (fArr4[length + 1] + fArr4[length + 3]) / 2.0f;
                                    if (!barChartRenderer2.mViewPortHandler.isInBoundsTop(f44)) {
                                        break;
                                    }
                                    if (barChartRenderer2.mViewPortHandler.isInBoundsX(f39) && barChartRenderer2.mViewPortHandler.isInBoundsBottom(f44)) {
                                        if (iBarDataSet.isDrawValuesEnabled()) {
                                            barEntry2 = barEntry3;
                                            barChartRenderer2.drawValue(canvas, barStackedLabel, f39, f44 + fCalcTextHeight, valueTextColor);
                                        } else {
                                            barEntry2 = barEntry3;
                                        }
                                        i15 = valueTextColor;
                                        if (barEntry2.getIcon() != null && iBarDataSet.isDrawIconsEnabled()) {
                                            Drawable icon2 = barEntry2.getIcon();
                                            Utils.drawImage(canvas, icon2, (int) (f39 + mPPointF.f52828x), (int) (f44 + mPPointF.f52829y), icon2.getIntrinsicWidth(), icon2.getIntrinsicHeight());
                                        }
                                    } else {
                                        i15 = valueTextColor;
                                        i27 = i27;
                                        barEntry2 = barEntry3;
                                    }
                                    i26 = i27 + 2;
                                    barChartRenderer2 = this;
                                    length2 = i28;
                                    fArr2 = fArr3;
                                    valueTextColor = i15;
                                }
                            }
                            length = fArr == null ? length + 4 : (fArr.length * 4) + length;
                            i18++;
                            barChartRenderer = this;
                            i17 = i14;
                            zIsDrawValueAboveBarEnabled = zIsDrawValueAboveBarEnabled;
                        }
                    } else {
                        int i29 = 0;
                        while (i29 < barChartRenderer.mAnimator.getPhaseX() * barBuffer.buffer.length) {
                            float[] fArr5 = barBuffer.buffer;
                            int i30 = i29 + 1;
                            float f45 = fArr5[i30];
                            float f46 = (fArr5[i29 + 3] + f45) / f17;
                            if (!barChartRenderer.mViewPortHandler.isInBoundsTop(f45)) {
                                break;
                            }
                            if (barChartRenderer.mViewPortHandler.isInBoundsX(barBuffer.buffer[i29]) && barChartRenderer.mViewPortHandler.isInBoundsBottom(barBuffer.buffer[i30])) {
                                BarEntry barEntry4 = (BarEntry) iBarDataSet.getEntryForIndex(i29 / 4);
                                float y14 = barEntry4.getY();
                                MPPointF mPPointF4 = mPPointF3;
                                String barLabel2 = valueFormatter.getBarLabel(barEntry4);
                                float fCalcTextWidth3 = Utils.calcTextWidth(barChartRenderer.mValuePaint, barLabel2);
                                f16 = f17;
                                float f47 = zIsDrawValueAboveBarEnabled ? fConvertDpToPixel : -(fCalcTextWidth3 + fConvertDpToPixel);
                                float f48 = zIsDrawValueAboveBarEnabled ? -(fCalcTextWidth3 + fConvertDpToPixel) : fConvertDpToPixel;
                                if (zIsInverted) {
                                    f47 = (-f47) - fCalcTextWidth3;
                                    f48 = (-f48) - fCalcTextWidth3;
                                }
                                float f49 = f47;
                                float f50 = f48;
                                if (iBarDataSet.isDrawValuesEnabled()) {
                                    mPPointF2 = mPPointF4;
                                    barChartRenderer = this;
                                    barChartRenderer.drawValue(canvas, barLabel2, barBuffer.buffer[i29 + 2] + (y14 >= 0.0f ? f49 : f50), f46 + fCalcTextHeight, iBarDataSet.getValueTextColor(i29 / 2));
                                } else {
                                    barChartRenderer = this;
                                    mPPointF2 = mPPointF4;
                                }
                                if (barEntry4.getIcon() != null && iBarDataSet.isDrawIconsEnabled()) {
                                    Drawable icon3 = barEntry4.getIcon();
                                    float f54 = barBuffer.buffer[i29 + 2];
                                    if (y14 >= 0.0f) {
                                        f50 = f49;
                                    }
                                    Utils.drawImage(canvas, icon3, (int) (f54 + f50 + mPPointF2.f52828x), (int) (f46 + mPPointF2.f52829y), icon3.getIntrinsicWidth(), icon3.getIntrinsicHeight());
                                }
                            } else {
                                i29 = i29;
                                dataSets = dataSets;
                                fConvertDpToPixel = fConvertDpToPixel;
                                f16 = f17;
                                barBuffer = barBuffer;
                                mPPointF2 = mPPointF3;
                            }
                            i29 += 4;
                            barBuffer = barBuffer;
                            mPPointF3 = mPPointF2;
                            f17 = f16;
                            fConvertDpToPixel = fConvertDpToPixel;
                            dataSets = dataSets;
                        }
                        list = dataSets;
                        f14 = fConvertDpToPixel;
                        mPPointF = mPPointF3;
                    }
                    z14 = zIsDrawValueAboveBarEnabled;
                    i16 = i17;
                    MPPointF.recycleInstance(mPPointF);
                } else {
                    list = dataSets;
                    f14 = fConvertDpToPixel;
                    z14 = zIsDrawValueAboveBarEnabled;
                    i16 = i17;
                }
                i17 = i16 + 1;
                barChartRenderer = this;
                fConvertDpToPixel = f14;
                dataSets = list;
                zIsDrawValueAboveBarEnabled = z14;
            }
        }
    }

    @Override // com.github.mikephil.charting.renderer.BarChartRenderer, com.github.mikephil.charting.renderer.DataRenderer
    public void initBuffers() {
        BarData barData = this.mChart.getBarData();
        this.mBarBuffers = new HorizontalBarBuffer[barData.getDataSetCount()];
        for (int i14 = 0; i14 < this.mBarBuffers.length; i14++) {
            IBarDataSet iBarDataSet = (IBarDataSet) barData.getDataSetByIndex(i14);
            this.mBarBuffers[i14] = new HorizontalBarBuffer(iBarDataSet.getEntryCount() * 4 * (iBarDataSet.isStacked() ? iBarDataSet.getStackSize() : 1), barData.getDataSetCount(), iBarDataSet.isStacked());
        }
    }

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public boolean isDrawingValuesAllowed(ChartInterface chartInterface) {
        return ((float) chartInterface.getData().getEntryCount()) < this.mViewPortHandler.getScaleY() * ((float) chartInterface.getMaxVisibleCount());
    }

    @Override // com.github.mikephil.charting.renderer.BarChartRenderer
    public void prepareBarHighlight(float f14, float f15, float f16, float f17, Transformer transformer) {
        this.mBarRect.set(f15, f14 - f17, f16, f14 + f17);
        transformer.rectToPixelPhaseHorizontal(this.mBarRect, this.mAnimator.getPhaseY());
    }

    @Override // com.github.mikephil.charting.renderer.BarChartRenderer
    public void setHighlightDrawPos(Highlight highlight, RectF rectF) {
        highlight.setDraw(rectF.centerY(), rectF.right);
    }
}
