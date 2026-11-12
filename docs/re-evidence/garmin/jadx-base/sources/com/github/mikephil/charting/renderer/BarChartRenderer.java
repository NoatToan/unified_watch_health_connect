package com.github.mikephil.charting.renderer;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.buffer.BarBuffer;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.highlight.Range;
import com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider;
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;
import com.github.mikephil.charting.model.GradientColor;
import com.github.mikephil.charting.utils.MPPointF;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class BarChartRenderer extends BarLineScatterCandleBubbleRenderer {
    protected Paint mBarBorderPaint;
    protected BarBuffer[] mBarBuffers;
    protected RectF mBarRect;
    private RectF mBarShadowRectBuffer;
    protected BarDataProvider mChart;
    protected Paint mShadowPaint;

    public BarChartRenderer(BarDataProvider barDataProvider, ChartAnimator chartAnimator, ViewPortHandler viewPortHandler) {
        super(chartAnimator, viewPortHandler);
        this.mBarRect = new RectF();
        this.mBarShadowRectBuffer = new RectF();
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
        Paint paint3 = new Paint(1);
        this.mBarBorderPaint = paint3;
        paint3.setStyle(Paint.Style.STROKE);
    }

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawData(Canvas canvas) {
        BarData barData = this.mChart.getBarData();
        for (int i14 = 0; i14 < barData.getDataSetCount(); i14++) {
            IBarDataSet iBarDataSet = (IBarDataSet) barData.getDataSetByIndex(i14);
            if (iBarDataSet.isVisible()) {
                drawDataSet(canvas, iBarDataSet, i14);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
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
                rectF.left = x14 - barWidth;
                rectF.right = x14 + barWidth;
                transformer.rectValueToPixel(rectF);
                if (this.mViewPortHandler.isInBoundsLeft(this.mBarShadowRectBuffer.right)) {
                    if (!this.mViewPortHandler.isInBoundsRight(this.mBarShadowRectBuffer.left)) {
                        break;
                    }
                    this.mBarShadowRectBuffer.top = this.mViewPortHandler.contentTop();
                    this.mBarShadowRectBuffer.bottom = this.mViewPortHandler.contentBottom();
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
            int i17 = i16 + 2;
            if (this.mViewPortHandler.isInBoundsLeft(barBuffer.buffer[i17])) {
                if (!this.mViewPortHandler.isInBoundsRight(barBuffer.buffer[i16])) {
                    return;
                }
                if (!z15) {
                    this.mRenderPaint.setColor(iBarDataSet.getColor(i16 / 4));
                }
                if (iBarDataSet.getGradientColor() != null) {
                    GradientColor gradientColor = iBarDataSet.getGradientColor();
                    Paint paint = this.mRenderPaint;
                    float[] fArr = barBuffer.buffer;
                    float f14 = fArr[i16];
                    paint.setShader(new LinearGradient(f14, fArr[i16 + 3], f14, fArr[i16 + 1], gradientColor.getStartColor(), gradientColor.getEndColor(), Shader.TileMode.MIRROR));
                }
                if (iBarDataSet.getGradientColors() != null) {
                    Paint paint2 = this.mRenderPaint;
                    float[] fArr2 = barBuffer.buffer;
                    float f15 = fArr2[i16];
                    float f16 = fArr2[i16 + 3];
                    float f17 = fArr2[i16 + 1];
                    int i18 = i16 / 4;
                    paint2.setShader(new LinearGradient(f15, f16, f15, f17, iBarDataSet.getGradientColor(i18).getStartColor(), iBarDataSet.getGradientColor(i18).getEndColor(), Shader.TileMode.MIRROR));
                }
                float[] fArr3 = barBuffer.buffer;
                int i19 = i16 + 1;
                int i24 = i16 + 3;
                canvas.drawRect(fArr3[i16], fArr3[i19], fArr3[i17], fArr3[i24], this.mRenderPaint);
                if (z14) {
                    float[] fArr4 = barBuffer.buffer;
                    canvas.drawRect(fArr4[i16], fArr4[i19], fArr4[i17], fArr4[i24], this.mBarBorderPaint);
                }
            }
        }
    }

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawExtras(Canvas canvas) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawHighlighted(Canvas canvas, Highlight[] highlightArr) {
        float y14;
        float f14;
        BarData barData = this.mChart.getBarData();
        for (Highlight highlight : highlightArr) {
            IBarDataSet iBarDataSet = (IBarDataSet) barData.getDataSetByIndex(highlight.getDataSetIndex());
            if (iBarDataSet != null && iBarDataSet.isHighlightEnabled()) {
                BarEntry barEntry = (BarEntry) iBarDataSet.getEntryForXValue(highlight.getX(), highlight.getY());
                if (isInBoundsX(barEntry, iBarDataSet)) {
                    Transformer transformer = this.mChart.getTransformer(iBarDataSet.getAxisDependency());
                    this.mHighlightPaint.setColor(iBarDataSet.getHighLightColor());
                    this.mHighlightPaint.setAlpha(iBarDataSet.getHighLightAlpha());
                    if (highlight.getStackIndex() < 0 || !barEntry.isStacked()) {
                        y14 = barEntry.getY();
                        f14 = 0.0f;
                    } else if (this.mChart.isHighlightFullBarEnabled()) {
                        y14 = barEntry.getPositiveSum();
                        f14 = -barEntry.getNegativeSum();
                    } else {
                        Range range = barEntry.getRanges()[highlight.getStackIndex()];
                        float f15 = range.from;
                        f14 = range.f52821to;
                        y14 = f15;
                    }
                    prepareBarHighlight(barEntry.getX(), y14, f14, barData.getBarWidth() / 2.0f, transformer);
                    setHighlightDrawPos(highlight, this.mBarRect);
                    canvas.drawRect(this.mBarRect, this.mHighlightPaint);
                }
            }
        }
    }

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawValue(Canvas canvas, String str, float f14, float f15, int i14) {
        this.mValuePaint.setColor(i14);
        canvas.drawText(str, f14, f15, this.mValuePaint);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawValues(Canvas canvas) {
        List list;
        MPPointF mPPointF;
        int i14;
        int i15;
        Transformer transformer;
        float f14;
        int i16;
        float f15;
        float f16;
        float f17;
        float f18;
        boolean z14;
        int i17;
        MPPointF mPPointF2;
        BarChartRenderer barChartRenderer = this;
        if (barChartRenderer.isDrawingValuesAllowed(barChartRenderer.mChart)) {
            List dataSets = barChartRenderer.mChart.getBarData().getDataSets();
            float fConvertDpToPixel = Utils.convertDpToPixel(4.5f);
            boolean zIsDrawValueAboveBarEnabled = barChartRenderer.mChart.isDrawValueAboveBarEnabled();
            int i18 = 0;
            while (i18 < barChartRenderer.mChart.getBarData().getDataSetCount()) {
                IBarDataSet iBarDataSet = (IBarDataSet) dataSets.get(i18);
                if (barChartRenderer.shouldDrawValues(iBarDataSet)) {
                    barChartRenderer.applyValueTextStyle(iBarDataSet);
                    boolean zIsInverted = barChartRenderer.mChart.isInverted(iBarDataSet.getAxisDependency());
                    float fCalcTextHeight = Utils.calcTextHeight(barChartRenderer.mValuePaint, "8");
                    float f19 = zIsDrawValueAboveBarEnabled ? -fConvertDpToPixel : fCalcTextHeight + fConvertDpToPixel;
                    float f22 = zIsDrawValueAboveBarEnabled ? fCalcTextHeight + fConvertDpToPixel : -fConvertDpToPixel;
                    if (zIsInverted) {
                        f19 = (-f19) - fCalcTextHeight;
                        f22 = (-f22) - fCalcTextHeight;
                    }
                    float f24 = f19;
                    float f25 = f22;
                    BarBuffer barBuffer = barChartRenderer.mBarBuffers[i18];
                    float phaseY = barChartRenderer.mAnimator.getPhaseY();
                    ValueFormatter valueFormatter = iBarDataSet.getValueFormatter();
                    MPPointF mPPointF3 = MPPointF.getInstance(iBarDataSet.getIconsOffset());
                    mPPointF3.f52828x = Utils.convertDpToPixel(mPPointF3.f52828x);
                    mPPointF3.f52829y = Utils.convertDpToPixel(mPPointF3.f52829y);
                    if (iBarDataSet.isStacked()) {
                        list = dataSets;
                        mPPointF = mPPointF3;
                        Transformer transformer2 = barChartRenderer.mChart.getTransformer(iBarDataSet.getAxisDependency());
                        int i19 = 0;
                        int length = 0;
                        while (i19 < barChartRenderer.mAnimator.getPhaseX() * iBarDataSet.getEntryCount()) {
                            BarEntry barEntry = (BarEntry) iBarDataSet.getEntryForIndex(i19);
                            float[] yVals = barEntry.getYVals();
                            float[] fArr = barBuffer.buffer;
                            float f26 = (fArr[length] + fArr[length + 2]) / 2.0f;
                            int valueTextColor = iBarDataSet.getValueTextColor(i19);
                            if (yVals == null) {
                                Transformer transformer3 = transformer2;
                                if (!barChartRenderer.mViewPortHandler.isInBoundsRight(f26)) {
                                    break;
                                }
                                i14 = i19;
                                int i24 = length + 1;
                                if (barChartRenderer.mViewPortHandler.isInBoundsY(barBuffer.buffer[i24]) && barChartRenderer.mViewPortHandler.isInBoundsLeft(f26)) {
                                    if (iBarDataSet.isDrawValuesEnabled()) {
                                        String barLabel = valueFormatter.getBarLabel(barEntry);
                                        float f27 = barBuffer.buffer[i24];
                                        float f28 = barEntry.getY() >= 0.0f ? f24 : f25;
                                        f17 = f26;
                                        transformer = transformer3;
                                        barChartRenderer.drawValue(canvas, barLabel, f17, f27 + f28, valueTextColor);
                                    } else {
                                        transformer = transformer3;
                                        f17 = f26;
                                    }
                                    if (barEntry.getIcon() == null || !iBarDataSet.isDrawIconsEnabled()) {
                                        i15 = i18;
                                    } else {
                                        Drawable icon = barEntry.getIcon();
                                        float f29 = barBuffer.buffer[i24] + (barEntry.getY() >= 0.0f ? f24 : f25);
                                        i15 = i18;
                                        Utils.drawImage(canvas, icon, (int) (f17 + mPPointF.f52828x), (int) (f29 + mPPointF.f52829y), icon.getIntrinsicWidth(), icon.getIntrinsicHeight());
                                    }
                                } else {
                                    zIsDrawValueAboveBarEnabled = zIsDrawValueAboveBarEnabled;
                                    i15 = i18;
                                    transformer2 = transformer3;
                                    barChartRenderer = barChartRenderer;
                                    fConvertDpToPixel = fConvertDpToPixel;
                                    i19 = i14;
                                }
                                i18 = i15;
                                zIsDrawValueAboveBarEnabled = zIsDrawValueAboveBarEnabled;
                            } else {
                                i14 = i19;
                                BarEntry barEntry2 = barEntry;
                                float f34 = f26;
                                zIsDrawValueAboveBarEnabled = zIsDrawValueAboveBarEnabled;
                                i15 = i18;
                                int i25 = valueTextColor;
                                BarChartRenderer barChartRenderer2 = barChartRenderer;
                                yVals = yVals;
                                fConvertDpToPixel = fConvertDpToPixel;
                                transformer = transformer2;
                                int length2 = yVals.length * 2;
                                float[] fArr2 = new float[length2];
                                float f35 = -barEntry2.getNegativeSum();
                                float f36 = 0.0f;
                                int i26 = 0;
                                int i27 = 0;
                                while (i26 < length2) {
                                    float f37 = yVals[i27];
                                    if (f37 == 0.0f && (f36 == 0.0f || f35 == 0.0f)) {
                                        f16 = f35;
                                        f35 = f37;
                                    } else if (f37 >= 0.0f) {
                                        f36 += f37;
                                        f16 = f35;
                                        f35 = f36;
                                    } else {
                                        f16 = f35 - f37;
                                    }
                                    fArr2[i26 + 1] = f35 * phaseY;
                                    i26 += 2;
                                    i27++;
                                    f35 = f16;
                                }
                                transformer.pointValuesToPixel(fArr2);
                                int i28 = 0;
                                while (i28 < length2) {
                                    float f38 = yVals[i28 / 2];
                                    int i29 = length2;
                                    float f39 = fArr2[i28 + 1] + (((f38 > 0.0f ? 1 : (f38 == 0.0f ? 0 : -1)) == 0 && (f35 > 0.0f ? 1 : (f35 == 0.0f ? 0 : -1)) == 0 && (f36 > 0.0f ? 1 : (f36 == 0.0f ? 0 : -1)) > 0) || (f38 > 0.0f ? 1 : (f38 == 0.0f ? 0 : -1)) < 0 ? f25 : f24);
                                    float[] fArr3 = fArr2;
                                    if (!barChartRenderer2.mViewPortHandler.isInBoundsRight(f34)) {
                                        break;
                                    }
                                    if (barChartRenderer2.mViewPortHandler.isInBoundsY(f39) && barChartRenderer2.mViewPortHandler.isInBoundsLeft(f34)) {
                                        if (iBarDataSet.isDrawValuesEnabled()) {
                                            BarEntry barEntry3 = barEntry2;
                                            String barStackedLabel = valueFormatter.getBarStackedLabel(f38, barEntry3);
                                            f15 = f39;
                                            barEntry2 = barEntry3;
                                            barChartRenderer2.drawValue(canvas, barStackedLabel, f34, f15, i25);
                                        } else {
                                            f15 = f39;
                                        }
                                        f14 = f34;
                                        i16 = i25;
                                        if (barEntry2.getIcon() != null && iBarDataSet.isDrawIconsEnabled()) {
                                            Drawable icon2 = barEntry2.getIcon();
                                            Utils.drawImage(canvas, icon2, (int) (f14 + mPPointF.f52828x), (int) (mPPointF.f52829y + f15), icon2.getIntrinsicWidth(), icon2.getIntrinsicHeight());
                                        }
                                    } else {
                                        i28 = i28;
                                        f14 = f34;
                                        i16 = i25;
                                    }
                                    i28 += 2;
                                    barChartRenderer2 = this;
                                    fArr2 = fArr3;
                                    f34 = f14;
                                    length2 = i29;
                                    i25 = i16;
                                }
                            }
                            length = yVals == null ? length + 4 : (yVals.length * 4) + length;
                            i19 = i14 + 1;
                            barChartRenderer = this;
                            transformer2 = transformer;
                            fConvertDpToPixel = fConvertDpToPixel;
                            i18 = i15;
                            zIsDrawValueAboveBarEnabled = zIsDrawValueAboveBarEnabled;
                        }
                    } else {
                        int i30 = 0;
                        while (i30 < barChartRenderer.mAnimator.getPhaseX() * barBuffer.buffer.length) {
                            float[] fArr4 = barBuffer.buffer;
                            float f44 = (fArr4[i30] + fArr4[i30 + 2]) / 2.0f;
                            if (!barChartRenderer.mViewPortHandler.isInBoundsRight(f44)) {
                                break;
                            }
                            int i34 = i30 + 1;
                            if (barChartRenderer.mViewPortHandler.isInBoundsY(barBuffer.buffer[i34]) && barChartRenderer.mViewPortHandler.isInBoundsLeft(f44)) {
                                int i35 = i30 / 4;
                                BarEntry barEntry4 = (BarEntry) iBarDataSet.getEntryForIndex(i35);
                                float y14 = barEntry4.getY();
                                if (iBarDataSet.isDrawValuesEnabled()) {
                                    MPPointF mPPointF4 = mPPointF3;
                                    String barLabel2 = valueFormatter.getBarLabel(barEntry4);
                                    float[] fArr5 = barBuffer.buffer;
                                    mPPointF2 = mPPointF4;
                                    barChartRenderer.drawValue(canvas, barLabel2, f44, y14 >= 0.0f ? fArr5[i34] + f24 : fArr5[i30 + 3] + f25, iBarDataSet.getValueTextColor(i35));
                                } else {
                                    mPPointF2 = mPPointF3;
                                }
                                if (barEntry4.getIcon() != null && iBarDataSet.isDrawIconsEnabled()) {
                                    Drawable icon3 = barEntry4.getIcon();
                                    float[] fArr6 = barBuffer.buffer;
                                    Utils.drawImage(canvas, icon3, (int) (f44 + mPPointF2.f52828x), (int) ((y14 >= 0.0f ? fArr6[i34] + f24 : fArr6[i30 + 3] + f25) + mPPointF2.f52829y), icon3.getIntrinsicWidth(), icon3.getIntrinsicHeight());
                                }
                            } else {
                                valueFormatter = valueFormatter;
                                dataSets = dataSets;
                                mPPointF2 = mPPointF3;
                            }
                            i30 += 4;
                            mPPointF3 = mPPointF2;
                            valueFormatter = valueFormatter;
                            dataSets = dataSets;
                        }
                        list = dataSets;
                        mPPointF = mPPointF3;
                    }
                    f18 = fConvertDpToPixel;
                    z14 = zIsDrawValueAboveBarEnabled;
                    i17 = i18;
                    MPPointF.recycleInstance(mPPointF);
                } else {
                    list = dataSets;
                    f18 = fConvertDpToPixel;
                    z14 = zIsDrawValueAboveBarEnabled;
                    i17 = i18;
                }
                i18 = i17 + 1;
                barChartRenderer = this;
                fConvertDpToPixel = f18;
                dataSets = list;
                zIsDrawValueAboveBarEnabled = z14;
            }
        }
    }

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void initBuffers() {
        BarData barData = this.mChart.getBarData();
        this.mBarBuffers = new BarBuffer[barData.getDataSetCount()];
        for (int i14 = 0; i14 < this.mBarBuffers.length; i14++) {
            IBarDataSet iBarDataSet = (IBarDataSet) barData.getDataSetByIndex(i14);
            this.mBarBuffers[i14] = new BarBuffer(iBarDataSet.getEntryCount() * 4 * (iBarDataSet.isStacked() ? iBarDataSet.getStackSize() : 1), barData.getDataSetCount(), iBarDataSet.isStacked());
        }
    }

    public void prepareBarHighlight(float f14, float f15, float f16, float f17, Transformer transformer) {
        this.mBarRect.set(f14 - f17, f15, f14 + f17, f16);
        transformer.rectToPixelPhase(this.mBarRect, this.mAnimator.getPhaseY());
    }

    public void setHighlightDrawPos(Highlight highlight, RectF rectF) {
        highlight.setDraw(rectF.centerX(), rectF.top);
    }
}
