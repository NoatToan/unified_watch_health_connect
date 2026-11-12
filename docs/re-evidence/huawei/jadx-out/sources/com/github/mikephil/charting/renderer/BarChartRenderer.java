package com.github.mikephil.charting.renderer;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.buffer.BarBuffer;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.formatter.IValueFormatter;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.highlight.Range;
import com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider;
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;
import com.github.mikephil.charting.utils.Fill;
import com.github.mikephil.charting.utils.MPPointF;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class BarChartRenderer extends BarLineScatterCandleBubbleRenderer {
    protected Paint mBarBorderPaint;
    protected BarBuffer[] mBarBuffers;
    protected RectF mBarRect;
    private RectF mBarShadowRectBuffer;
    protected BarDataProvider mChart;
    private boolean mDrawRoundedBars;
    private float mRoundedBarRadius;
    protected Paint mShadowPaint;

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawExtras(Canvas canvas) {
    }

    public BarChartRenderer(BarDataProvider barDataProvider, ChartAnimator chartAnimator, ViewPortHandler viewPortHandler) {
        super(chartAnimator, viewPortHandler);
        this.mBarRect = new RectF();
        this.mRoundedBarRadius = 0.0f;
        this.mBarShadowRectBuffer = new RectF();
        this.mChart = barDataProvider;
        this.mHighlightPaint = new Paint(1);
        this.mHighlightPaint.setStyle(Paint.Style.FILL);
        this.mHighlightPaint.setColor(Color.rgb(0, 0, 0));
        this.mHighlightPaint.setAlpha(120);
        Paint paint = new Paint(1);
        this.mShadowPaint = paint;
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint(1);
        this.mBarBorderPaint = paint2;
        paint2.setStyle(Paint.Style.STROKE);
    }

    public BarChartRenderer(BarDataProvider barDataProvider, ChartAnimator chartAnimator, ViewPortHandler viewPortHandler, boolean z, float f) {
        this(barDataProvider, chartAnimator, viewPortHandler);
        this.mDrawRoundedBars = z;
        this.mRoundedBarRadius = f;
    }

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void initBuffers() {
        BarData barData = this.mChart.getBarData();
        this.mBarBuffers = new BarBuffer[barData.getDataSetCount()];
        for (int i = 0; i < this.mBarBuffers.length; i++) {
            IBarDataSet iBarDataSet = (IBarDataSet) barData.getDataSetByIndex(i);
            this.mBarBuffers[i] = new BarBuffer(iBarDataSet.getEntryCount() * 4 * (iBarDataSet.isStacked() ? iBarDataSet.getStackSize() : 1), barData.getDataSetCount(), iBarDataSet.isStacked());
        }
    }

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawData(Canvas canvas) {
        if (this.mBarBuffers == null) {
            initBuffers();
        }
        BarData barData = this.mChart.getBarData();
        for (int i = 0; i < barData.getDataSetCount(); i++) {
            IBarDataSet iBarDataSet = (IBarDataSet) barData.getDataSetByIndex(i);
            if (iBarDataSet.isVisible()) {
                drawDataSet(canvas, iBarDataSet, i);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void drawDataSet(Canvas canvas, IBarDataSet iBarDataSet, int i) {
        int i2;
        int i3;
        Transformer transformer = this.mChart.getTransformer(iBarDataSet.getAxisDependency());
        this.mBarBorderPaint.setColor(iBarDataSet.getBarBorderColor());
        this.mBarBorderPaint.setStrokeWidth(Utils.convertDpToPixel(iBarDataSet.getBarBorderWidth()));
        boolean z = iBarDataSet.getBarBorderWidth() > 0.0f;
        float phaseX = this.mAnimator.getPhaseX();
        float phaseY = this.mAnimator.getPhaseY();
        if (this.mChart.isDrawBarShadowEnabled()) {
            this.mShadowPaint.setColor(iBarDataSet.getBarShadowColor());
            float barWidth = this.mChart.getBarData().getBarWidth() / 2.0f;
            int iMin = Math.min((int) Math.ceil(iBarDataSet.getEntryCount() * phaseX), iBarDataSet.getEntryCount());
            for (int i4 = 0; i4 < iMin; i4++) {
                float x = ((BarEntry) iBarDataSet.getEntryForIndex(i4)).getX();
                this.mBarShadowRectBuffer.left = x - barWidth;
                this.mBarShadowRectBuffer.right = x + barWidth;
                transformer.rectValueToPixel(this.mBarShadowRectBuffer);
                if (this.mViewPortHandler.isInBoundsLeft(this.mBarShadowRectBuffer.right)) {
                    if (!this.mViewPortHandler.isInBoundsRight(this.mBarShadowRectBuffer.left)) {
                        break;
                    }
                    this.mBarShadowRectBuffer.top = this.mViewPortHandler.contentTop();
                    this.mBarShadowRectBuffer.bottom = this.mViewPortHandler.contentBottom();
                    if (this.mDrawRoundedBars) {
                        RectF rectF = this.mBarShadowRectBuffer;
                        float f = this.mRoundedBarRadius;
                        canvas.drawRoundRect(rectF, f, f, this.mShadowPaint);
                    } else {
                        canvas.drawRect(this.mBarShadowRectBuffer, this.mShadowPaint);
                    }
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
        int i5 = 0;
        int i6 = 0;
        while (i6 < barBuffer.size()) {
            int i7 = i6 + 2;
            if (!this.mViewPortHandler.isInBoundsLeft(barBuffer.buffer[i7])) {
                i2 = i5;
                i3 = i6;
            } else {
                if (!this.mViewPortHandler.isInBoundsRight(barBuffer.buffer[i6])) {
                    return;
                }
                if (!z3) {
                    this.mRenderPaint.setColor(iBarDataSet.getColor(i5));
                }
                if (z2) {
                    i2 = i5;
                    i3 = i6;
                    iBarDataSet.getFill(i5).fillRect(canvas, this.mRenderPaint, barBuffer.buffer[i6], barBuffer.buffer[i6 + 1], barBuffer.buffer[i7], barBuffer.buffer[i6 + 3], zIsInverted ? Fill.Direction.DOWN : Fill.Direction.UP, this.mRoundedBarRadius);
                } else {
                    i2 = i5;
                    i3 = i6;
                    if (this.mDrawRoundedBars) {
                        RectF rectF2 = new RectF(barBuffer.buffer[i3], barBuffer.buffer[i3 + 1], barBuffer.buffer[i7], barBuffer.buffer[i3 + 3]);
                        float f2 = this.mRoundedBarRadius;
                        canvas.drawRoundRect(rectF2, f2, f2, this.mRenderPaint);
                    } else {
                        canvas.drawRect(barBuffer.buffer[i3], barBuffer.buffer[i3 + 1], barBuffer.buffer[i7], barBuffer.buffer[i3 + 3], this.mRenderPaint);
                    }
                }
                if (z) {
                    if (this.mDrawRoundedBars) {
                        RectF rectF3 = new RectF(barBuffer.buffer[i3], barBuffer.buffer[i3 + 1], barBuffer.buffer[i7], barBuffer.buffer[i3 + 3]);
                        float f3 = this.mRoundedBarRadius;
                        canvas.drawRoundRect(rectF3, f3, f3, this.mBarBorderPaint);
                    } else {
                        canvas.drawRect(barBuffer.buffer[i3], barBuffer.buffer[i3 + 1], barBuffer.buffer[i7], barBuffer.buffer[i3 + 3], this.mBarBorderPaint);
                    }
                }
            }
            i6 = i3 + 4;
            i5 = i2 + 1;
        }
    }

    protected void prepareBarHighlight(float f, float f2, float f3, float f4, Transformer transformer) {
        this.mBarRect.set(f - f4, f2, f + f4, f3);
        transformer.rectToPixelPhase(this.mBarRect, this.mAnimator.getPhaseY());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawValues(Canvas canvas) {
        List list;
        float f;
        boolean z;
        MPPointF mPPointF;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        if (isDrawingValuesAllowed(this.mChart)) {
            List dataSets = this.mChart.getBarData().getDataSets();
            float fConvertDpToPixel = Utils.convertDpToPixel(4.5f);
            boolean zIsDrawValueAboveBarEnabled = this.mChart.isDrawValueAboveBarEnabled();
            int i = 0;
            while (i < this.mChart.getBarData().getDataSetCount()) {
                IBarDataSet iBarDataSet = (IBarDataSet) dataSets.get(i);
                if (iBarDataSet.getEntryCount() != 0 && shouldDrawValues(iBarDataSet)) {
                    applyValueTextStyle(iBarDataSet);
                    boolean zIsInverted = this.mChart.isInverted(iBarDataSet.getAxisDependency());
                    float fCalcTextHeight = Utils.calcTextHeight(this.mValuePaint, "8");
                    float f8 = zIsDrawValueAboveBarEnabled ? -fConvertDpToPixel : fCalcTextHeight + fConvertDpToPixel;
                    float f9 = zIsDrawValueAboveBarEnabled ? fCalcTextHeight + fConvertDpToPixel : -fConvertDpToPixel;
                    if (zIsInverted) {
                        f8 = (-f8) - fCalcTextHeight;
                        f9 = (-f9) - fCalcTextHeight;
                    }
                    float f10 = f8;
                    float f11 = f9;
                    BarBuffer barBuffer = this.mBarBuffers[i];
                    float phaseY = this.mAnimator.getPhaseY();
                    MPPointF mPPointF2 = MPPointF.getInstance(iBarDataSet.getIconsOffset());
                    mPPointF2.x = Utils.convertDpToPixel(mPPointF2.x);
                    mPPointF2.y = Utils.convertDpToPixel(mPPointF2.y);
                    if (iBarDataSet.isStacked()) {
                        mPPointF = mPPointF2;
                        list = dataSets;
                        Transformer transformer = this.mChart.getTransformer(iBarDataSet.getAxisDependency());
                        int i2 = 0;
                        int length = 0;
                        while (i2 < iBarDataSet.getEntryCount() * this.mAnimator.getPhaseX()) {
                            BarEntry barEntry = (BarEntry) iBarDataSet.getEntryForIndex(i2);
                            float[] yVals = barEntry.getYVals();
                            float f12 = (barBuffer.buffer[length] + barBuffer.buffer[length + 2]) / 2.0f;
                            int valueTextColor = iBarDataSet.getValueTextColor(i2);
                            if (yVals == null) {
                                if (!this.mViewPortHandler.isInBoundsRight(f12)) {
                                    break;
                                }
                                int i3 = length + 1;
                                if (this.mViewPortHandler.isInBoundsY(barBuffer.buffer[i3]) && this.mViewPortHandler.isInBoundsLeft(f12)) {
                                    if (iBarDataSet.isDrawValuesEnabled()) {
                                        f4 = f12;
                                        drawValue(canvas, iBarDataSet.getValueFormatter(), barEntry.getY(), barEntry, i, f4, barBuffer.buffer[i3] + (barEntry.getY() >= 0.0f ? f10 : f11), valueTextColor);
                                    } else {
                                        f4 = f12;
                                    }
                                    if (barEntry.getIcon() != null && iBarDataSet.isDrawIconsEnabled()) {
                                        Drawable icon = barEntry.getIcon();
                                        Utils.drawImage(canvas, icon, (int) (mPPointF.x + f4), (int) (barBuffer.buffer[i3] + (barEntry.getY() >= 0.0f ? f10 : f11) + mPPointF.y), icon.getIntrinsicWidth(), icon.getIntrinsicHeight());
                                    }
                                } else {
                                    fConvertDpToPixel = fConvertDpToPixel;
                                    zIsDrawValueAboveBarEnabled = zIsDrawValueAboveBarEnabled;
                                    transformer = transformer;
                                    i2 = i2;
                                }
                                transformer = transformer;
                                zIsDrawValueAboveBarEnabled = zIsDrawValueAboveBarEnabled;
                                fConvertDpToPixel = fConvertDpToPixel;
                            } else {
                                i2 = i2;
                                fConvertDpToPixel = fConvertDpToPixel;
                                zIsDrawValueAboveBarEnabled = zIsDrawValueAboveBarEnabled;
                                yVals = yVals;
                                transformer = transformer;
                                float f13 = f12;
                                int length2 = yVals.length * 2;
                                float[] fArr = new float[length2];
                                float f14 = -barEntry.getNegativeSum();
                                float f15 = 0.0f;
                                int i4 = 0;
                                int i5 = 0;
                                while (i4 < length2) {
                                    float f16 = yVals[i5];
                                    if (f16 == 0.0f && (f15 == 0.0f || f14 == 0.0f)) {
                                        float f17 = f14;
                                        f14 = f16;
                                        f3 = f17;
                                    } else if (f16 >= 0.0f) {
                                        f15 += f16;
                                        f3 = f14;
                                        f14 = f15;
                                    } else {
                                        f3 = f14 - f16;
                                    }
                                    fArr[i4 + 1] = f14 * phaseY;
                                    i4 += 2;
                                    i5++;
                                    f14 = f3;
                                }
                                transformer.pointValuesToPixel(fArr);
                                int i6 = 0;
                                while (i6 < length2) {
                                    int i7 = i6 / 2;
                                    float f18 = yVals[i7];
                                    float f19 = fArr[i6 + 1] + (((f18 > 0.0f ? 1 : (f18 == 0.0f ? 0 : -1)) == 0 && (f14 > 0.0f ? 1 : (f14 == 0.0f ? 0 : -1)) == 0 && (f15 > 0.0f ? 1 : (f15 == 0.0f ? 0 : -1)) > 0) || (f18 > 0.0f ? 1 : (f18 == 0.0f ? 0 : -1)) < 0 ? f11 : f10);
                                    if (!this.mViewPortHandler.isInBoundsRight(f13)) {
                                        break;
                                    }
                                    if (this.mViewPortHandler.isInBoundsY(f19) && this.mViewPortHandler.isInBoundsLeft(f13)) {
                                        if (iBarDataSet.isDrawValuesEnabled()) {
                                            f2 = f19;
                                            drawValue(canvas, iBarDataSet.getValueFormatter(), yVals[i7], barEntry, i, f13, f2, valueTextColor);
                                        } else {
                                            f2 = f19;
                                        }
                                        if (barEntry.getIcon() != null && iBarDataSet.isDrawIconsEnabled()) {
                                            Drawable icon2 = barEntry.getIcon();
                                            Utils.drawImage(canvas, icon2, (int) (mPPointF.x + f13), (int) (f2 + mPPointF.y), icon2.getIntrinsicWidth(), icon2.getIntrinsicHeight());
                                        }
                                    } else {
                                        i6 = i6;
                                        fArr = fArr;
                                        length2 = length2;
                                        f13 = f13;
                                    }
                                    i6 += 2;
                                    fArr = fArr;
                                    length2 = length2;
                                    f13 = f13;
                                }
                            }
                            length = yVals == null ? length + 4 : length + (yVals.length * 4);
                            i2++;
                            transformer = transformer;
                            zIsDrawValueAboveBarEnabled = zIsDrawValueAboveBarEnabled;
                            fConvertDpToPixel = fConvertDpToPixel;
                        }
                    } else {
                        int i8 = 0;
                        while (i8 < barBuffer.buffer.length * this.mAnimator.getPhaseX()) {
                            float f20 = (barBuffer.buffer[i8] + barBuffer.buffer[i8 + 2]) / 2.0f;
                            if (!this.mViewPortHandler.isInBoundsRight(f20)) {
                                break;
                            }
                            int i9 = i8 + 1;
                            if (this.mViewPortHandler.isInBoundsY(barBuffer.buffer[i9]) && this.mViewPortHandler.isInBoundsLeft(f20)) {
                                int i10 = i8 / 4;
                                Entry entry = (BarEntry) iBarDataSet.getEntryForIndex(i10);
                                float y = entry.getY();
                                if (iBarDataSet.isDrawValuesEnabled()) {
                                    IValueFormatter valueFormatter = iBarDataSet.getValueFormatter();
                                    if (y >= 0.0f) {
                                        f7 = barBuffer.buffer[i9] + f10;
                                    } else {
                                        f7 = barBuffer.buffer[i8 + 3] + f11;
                                    }
                                    f5 = f20;
                                    drawValue(canvas, valueFormatter, y, entry, i, f5, f7, iBarDataSet.getValueTextColor(i10));
                                } else {
                                    f5 = f20;
                                }
                                if (entry.getIcon() != null && iBarDataSet.isDrawIconsEnabled()) {
                                    Drawable icon3 = entry.getIcon();
                                    if (y >= 0.0f) {
                                        f6 = barBuffer.buffer[i9] + f10;
                                    } else {
                                        f6 = barBuffer.buffer[i8 + 3] + f11;
                                    }
                                    Utils.drawImage(canvas, icon3, (int) (f5 + mPPointF2.x), (int) (f6 + mPPointF2.y), icon3.getIntrinsicWidth(), icon3.getIntrinsicHeight());
                                }
                            } else {
                                i8 = i8;
                                mPPointF2 = mPPointF2;
                                dataSets = dataSets;
                                barBuffer = barBuffer;
                            }
                            i8 += 4;
                            barBuffer = barBuffer;
                            mPPointF2 = mPPointF2;
                            dataSets = dataSets;
                        }
                        mPPointF = mPPointF2;
                        list = dataSets;
                    }
                    f = fConvertDpToPixel;
                    z = zIsDrawValueAboveBarEnabled;
                    MPPointF.recycleInstance(mPPointF);
                } else {
                    list = dataSets;
                    f = fConvertDpToPixel;
                    z = zIsDrawValueAboveBarEnabled;
                }
                i++;
                dataSets = list;
                zIsDrawValueAboveBarEnabled = z;
                fConvertDpToPixel = f;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:25:0x00b0  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawHighlighted(Canvas canvas, Highlight[] highlightArr) {
        float y;
        float f;
        float f2;
        float f3;
        BarData barData = this.mChart.getBarData();
        for (Highlight highlight : highlightArr) {
            IBarDataSet iBarDataSet = (IBarDataSet) barData.getDataSetByIndex(highlight.getDataSetIndex());
            if (iBarDataSet != null && iBarDataSet.isHighlightEnabled()) {
                BarEntry barEntry = (BarEntry) iBarDataSet.getEntryForXValue(highlight.getX(), highlight.getY());
                if (isInBoundsX(barEntry, iBarDataSet)) {
                    Transformer transformer = this.mChart.getTransformer(iBarDataSet.getAxisDependency());
                    this.mHighlightPaint.setColor(iBarDataSet.getHighLightColor());
                    this.mHighlightPaint.setAlpha(iBarDataSet.getHighLightAlpha());
                    if (highlight.getStackIndex() >= 0 && barEntry.isStacked()) {
                        if (this.mChart.isHighlightFullBarEnabled()) {
                            y = barEntry.getPositiveSum();
                            f = -barEntry.getNegativeSum();
                        } else {
                            Range range = barEntry.getRanges()[highlight.getStackIndex()];
                            f3 = range.from;
                            f2 = range.to;
                        }
                        prepareBarHighlight(barEntry.getX(), f3, f2, barData.getBarWidth() / 2.0f, transformer);
                        setHighlightDrawPos(highlight, this.mBarRect);
                        if (this.mDrawRoundedBars) {
                            RectF rectF = new RectF(this.mBarRect);
                            float f4 = this.mRoundedBarRadius;
                            canvas.drawRoundRect(rectF, f4, f4, this.mHighlightPaint);
                        } else {
                            canvas.drawRect(this.mBarRect, this.mHighlightPaint);
                        }
                    } else {
                        y = barEntry.getY();
                        f = 0.0f;
                    }
                    f2 = f;
                    f3 = y;
                    prepareBarHighlight(barEntry.getX(), f3, f2, barData.getBarWidth() / 2.0f, transformer);
                    setHighlightDrawPos(highlight, this.mBarRect);
                    if (this.mDrawRoundedBars) {
                        RectF rectF2 = new RectF(this.mBarRect);
                        float f5 = this.mRoundedBarRadius;
                        canvas.drawRoundRect(rectF2, f5, f5, this.mHighlightPaint);
                    } else {
                        canvas.drawRect(this.mBarRect, this.mHighlightPaint);
                    }
                }
            }
        }
    }

    protected void setHighlightDrawPos(Highlight highlight, RectF rectF) {
        highlight.setDraw(rectF.centerX(), rectF.top);
    }
}
