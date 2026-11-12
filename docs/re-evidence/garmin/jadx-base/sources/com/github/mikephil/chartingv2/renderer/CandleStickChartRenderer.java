package com.github.mikephil.chartingv2.renderer;

import android.graphics.Canvas;
import android.graphics.Paint;
import com.github.mikephil.chartingv2.animation.ChartAnimator;
import com.github.mikephil.chartingv2.data.CandleEntry;
import com.github.mikephil.chartingv2.highlight.Highlight;
import com.github.mikephil.chartingv2.interfaces.dataprovider.CandleDataProvider;
import com.github.mikephil.chartingv2.interfaces.datasets.ICandleDataSet;
import com.github.mikephil.chartingv2.utils.Transformer;
import com.github.mikephil.chartingv2.utils.Utils;
import com.github.mikephil.chartingv2.utils.ViewPortHandler;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated
public class CandleStickChartRenderer extends LineScatterCandleRadarRenderer {
    private float[] mBodyBuffers;
    protected CandleDataProvider mChart;
    private float[] mCloseBuffers;
    private float[] mOpenBuffers;
    private float[] mRangeBuffers;
    private float[] mShadowBuffers;

    public CandleStickChartRenderer(CandleDataProvider candleDataProvider, ChartAnimator chartAnimator, ViewPortHandler viewPortHandler) {
        super(chartAnimator, viewPortHandler);
        this.mShadowBuffers = new float[8];
        this.mBodyBuffers = new float[4];
        this.mRangeBuffers = new float[4];
        this.mOpenBuffers = new float[4];
        this.mCloseBuffers = new float[4];
        this.mChart = candleDataProvider;
    }

    @Override // com.github.mikephil.chartingv2.renderer.DataRenderer
    public void drawData(Canvas canvas) {
        for (T t7 : this.mChart.getCandleData().getDataSets()) {
            if (t7.isVisible() && t7.getEntryCount() > 0) {
                drawDataSet(canvas, t7);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void drawDataSet(Canvas canvas, ICandleDataSet iCandleDataSet) {
        char c14;
        char c15;
        int color;
        Transformer transformer = this.mChart.getTransformer(iCandleDataSet.getAxisDependency());
        float phaseX = this.mAnimator.getPhaseX();
        float phaseY = this.mAnimator.getPhaseY();
        float barSpace = iCandleDataSet.getBarSpace();
        boolean showCandleBar = iCandleDataSet.getShowCandleBar();
        char c16 = 0;
        int iMax = Math.max(this.mMinX, 0);
        char c17 = 1;
        int iMin = Math.min(this.mMaxX + 1, iCandleDataSet.getEntryCount());
        this.mRenderPaint.setStrokeWidth(iCandleDataSet.getShadowWidth());
        int iCeil = (int) Math.ceil(((iMin - iMax) * phaseX) + iMax);
        int i14 = iMax;
        while (i14 < iCeil) {
            CandleEntry candleEntry = (CandleEntry) iCandleDataSet.getEntryForIndex(i14);
            int xIndex = candleEntry.getXIndex();
            if (xIndex < iMax || xIndex >= iMin) {
                c14 = c16;
                c15 = c17;
            } else {
                float open = candleEntry.getOpen();
                float close = candleEntry.getClose();
                float high = candleEntry.getHigh();
                float low = candleEntry.getLow();
                c14 = c16;
                if (showCandleBar) {
                    c15 = c17;
                    float[] fArr = this.mShadowBuffers;
                    float f14 = xIndex;
                    fArr[c14] = f14;
                    fArr[2] = f14;
                    fArr[4] = f14;
                    fArr[6] = f14;
                    if (open > close) {
                        fArr[c15] = high * phaseY;
                        fArr[3] = open * phaseY;
                        fArr[5] = low * phaseY;
                        fArr[7] = close * phaseY;
                    } else if (open < close) {
                        fArr[c15] = high * phaseY;
                        fArr[3] = close * phaseY;
                        fArr[5] = low * phaseY;
                        fArr[7] = open * phaseY;
                    } else {
                        fArr[c15] = high * phaseY;
                        float f15 = open * phaseY;
                        fArr[3] = f15;
                        fArr[5] = low * phaseY;
                        fArr[7] = f15;
                    }
                    transformer.pointValuesToPixel(fArr);
                    if (!iCandleDataSet.getShadowColorSameAsCandle()) {
                        this.mRenderPaint.setColor(iCandleDataSet.getShadowColor() == 1122867 ? iCandleDataSet.getColor(i14) : iCandleDataSet.getShadowColor());
                    } else if (open > close) {
                        this.mRenderPaint.setColor(iCandleDataSet.getDecreasingColor() == 1122867 ? iCandleDataSet.getColor(i14) : iCandleDataSet.getDecreasingColor());
                    } else {
                        Paint paint = this.mRenderPaint;
                        if (open < close) {
                            paint.setColor(iCandleDataSet.getIncreasingColor() == 1122867 ? iCandleDataSet.getColor(i14) : iCandleDataSet.getIncreasingColor());
                        } else {
                            paint.setColor(iCandleDataSet.getNeutralColor() == 1122867 ? iCandleDataSet.getColor(i14) : iCandleDataSet.getNeutralColor());
                        }
                    }
                    this.mRenderPaint.setStyle(Paint.Style.STROKE);
                    canvas.drawLines(this.mShadowBuffers, this.mRenderPaint);
                    float[] fArr2 = this.mBodyBuffers;
                    fArr2[c14] = (f14 - 0.5f) + barSpace;
                    fArr2[c15] = close * phaseY;
                    fArr2[2] = (f14 + 0.5f) - barSpace;
                    fArr2[3] = open * phaseY;
                    transformer.pointValuesToPixel(fArr2);
                    if (open > close) {
                        int decreasingColor = iCandleDataSet.getDecreasingColor();
                        Paint paint2 = this.mRenderPaint;
                        if (decreasingColor == 1122867) {
                            paint2.setColor(iCandleDataSet.getColor(i14));
                        } else {
                            paint2.setColor(iCandleDataSet.getDecreasingColor());
                        }
                        this.mRenderPaint.setStyle(iCandleDataSet.getDecreasingPaintStyle());
                        float[] fArr3 = this.mBodyBuffers;
                        canvas.drawRect(fArr3[c14], fArr3[3], fArr3[2], fArr3[c15], this.mRenderPaint);
                    } else if (open < close) {
                        int increasingColor = iCandleDataSet.getIncreasingColor();
                        Paint paint3 = this.mRenderPaint;
                        if (increasingColor == 1122867) {
                            paint3.setColor(iCandleDataSet.getColor(i14));
                        } else {
                            paint3.setColor(iCandleDataSet.getIncreasingColor());
                        }
                        this.mRenderPaint.setStyle(iCandleDataSet.getIncreasingPaintStyle());
                        float[] fArr4 = this.mBodyBuffers;
                        canvas.drawRect(fArr4[c14], fArr4[c15], fArr4[2], fArr4[3], this.mRenderPaint);
                    } else {
                        int neutralColor = iCandleDataSet.getNeutralColor();
                        Paint paint4 = this.mRenderPaint;
                        if (neutralColor == 1122867) {
                            paint4.setColor(iCandleDataSet.getColor(i14));
                        } else {
                            paint4.setColor(iCandleDataSet.getNeutralColor());
                        }
                        float[] fArr5 = this.mBodyBuffers;
                        canvas.drawLine(fArr5[c14], fArr5[c15], fArr5[2], fArr5[3], this.mRenderPaint);
                    }
                } else {
                    c15 = c17;
                    float[] fArr6 = this.mRangeBuffers;
                    float f16 = xIndex;
                    fArr6[c14] = f16;
                    fArr6[c15] = high * phaseY;
                    fArr6[2] = f16;
                    fArr6[3] = low * phaseY;
                    float[] fArr7 = this.mOpenBuffers;
                    fArr7[c14] = (f16 - 0.5f) + barSpace;
                    float f17 = open * phaseY;
                    fArr7[c15] = f17;
                    fArr7[2] = f16;
                    fArr7[3] = f17;
                    float[] fArr8 = this.mCloseBuffers;
                    fArr8[c14] = (f16 + 0.5f) - barSpace;
                    float f18 = close * phaseY;
                    fArr8[c15] = f18;
                    fArr8[2] = f16;
                    fArr8[3] = f18;
                    transformer.pointValuesToPixel(fArr6);
                    transformer.pointValuesToPixel(this.mOpenBuffers);
                    transformer.pointValuesToPixel(this.mCloseBuffers);
                    if (open > close) {
                        color = iCandleDataSet.getDecreasingColor() == 1122867 ? iCandleDataSet.getColor(i14) : iCandleDataSet.getDecreasingColor();
                    } else if (open < close) {
                        color = iCandleDataSet.getIncreasingColor() == 1122867 ? iCandleDataSet.getColor(i14) : iCandleDataSet.getIncreasingColor();
                    } else {
                        color = iCandleDataSet.getNeutralColor() == 1122867 ? iCandleDataSet.getColor(i14) : iCandleDataSet.getNeutralColor();
                    }
                    this.mRenderPaint.setColor(color);
                    float[] fArr9 = this.mRangeBuffers;
                    canvas.drawLine(fArr9[c14], fArr9[c15], fArr9[2], fArr9[3], this.mRenderPaint);
                    float[] fArr10 = this.mOpenBuffers;
                    canvas.drawLine(fArr10[c14], fArr10[c15], fArr10[2], fArr10[3], this.mRenderPaint);
                    float[] fArr11 = this.mCloseBuffers;
                    canvas.drawLine(fArr11[c14], fArr11[c15], fArr11[2], fArr11[3], this.mRenderPaint);
                }
            }
            i14++;
            c16 = c14;
            c17 = c15;
        }
    }

    @Override // com.github.mikephil.chartingv2.renderer.DataRenderer
    public void drawExtras(Canvas canvas) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.mikephil.chartingv2.renderer.DataRenderer
    public void drawHighlighted(Canvas canvas, Highlight[] highlightArr) {
        CandleEntry candleEntry;
        for (int i14 = 0; i14 < highlightArr.length; i14++) {
            int xIndex = highlightArr[i14].getXIndex();
            ICandleDataSet iCandleDataSet = (ICandleDataSet) this.mChart.getCandleData().getDataSetByIndex(highlightArr[i14].getDataSetIndex());
            if (iCandleDataSet != null && iCandleDataSet.isHighlightEnabled() && (candleEntry = (CandleEntry) iCandleDataSet.getEntryForXIndex(xIndex)) != null && candleEntry.getXIndex() == xIndex) {
                float phaseY = ((this.mAnimator.getPhaseY() * candleEntry.getHigh()) + (this.mAnimator.getPhaseY() * candleEntry.getLow())) / 2.0f;
                this.mChart.getYChartMin();
                this.mChart.getYChartMax();
                float[] fArr = {xIndex, phaseY};
                this.mChart.getTransformer(iCandleDataSet.getAxisDependency()).pointValuesToPixel(fArr);
                drawHighlightLines(canvas, fArr, iCandleDataSet);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.mikephil.chartingv2.renderer.DataRenderer
    public void drawValues(Canvas canvas) {
        CandleStickChartRenderer candleStickChartRenderer = this;
        if (candleStickChartRenderer.mChart.getCandleData().getYValCount() < candleStickChartRenderer.mViewPortHandler.getScaleX() * candleStickChartRenderer.mChart.getMaxVisibleCount()) {
            List<T> dataSets = candleStickChartRenderer.mChart.getCandleData().getDataSets();
            int i14 = 0;
            while (i14 < dataSets.size()) {
                ICandleDataSet iCandleDataSet = (ICandleDataSet) dataSets.get(i14);
                if (iCandleDataSet.isDrawValuesEnabled() && iCandleDataSet.getEntryCount() != 0) {
                    candleStickChartRenderer.applyValueTextStyle(iCandleDataSet);
                    Transformer transformer = candleStickChartRenderer.mChart.getTransformer(iCandleDataSet.getAxisDependency());
                    int iMax = Math.max(candleStickChartRenderer.mMinX, 0);
                    float[] fArrGenerateTransformedValuesCandle = transformer.generateTransformedValuesCandle(iCandleDataSet, candleStickChartRenderer.mAnimator.getPhaseX(), candleStickChartRenderer.mAnimator.getPhaseY(), iMax, Math.min(candleStickChartRenderer.mMaxX + 1, iCandleDataSet.getEntryCount()));
                    float fConvertDpToPixel = Utils.convertDpToPixel(5.0f);
                    int i15 = 0;
                    while (i15 < fArrGenerateTransformedValuesCandle.length) {
                        float f14 = fArrGenerateTransformedValuesCandle[i15];
                        float f15 = fArrGenerateTransformedValuesCandle[i15 + 1];
                        if (!candleStickChartRenderer.mViewPortHandler.isInBoundsRight(f14)) {
                            break;
                        }
                        if (candleStickChartRenderer.mViewPortHandler.isInBoundsLeft(f14) && candleStickChartRenderer.mViewPortHandler.isInBoundsY(f15)) {
                            int i16 = i15 / 2;
                            CandleEntry candleEntry = (CandleEntry) iCandleDataSet.getEntryForIndex(i16 + iMax);
                            candleStickChartRenderer.drawValue(canvas, iCandleDataSet.getValueFormatter(), candleEntry.getHigh(), candleEntry, i14, f14, f15 - fConvertDpToPixel, iCandleDataSet.getValueTextColor(i16));
                        }
                        i15 += 2;
                        candleStickChartRenderer = this;
                    }
                }
                i14++;
                candleStickChartRenderer = this;
            }
        }
    }

    @Override // com.github.mikephil.chartingv2.renderer.DataRenderer
    public void initBuffers() {
    }
}
