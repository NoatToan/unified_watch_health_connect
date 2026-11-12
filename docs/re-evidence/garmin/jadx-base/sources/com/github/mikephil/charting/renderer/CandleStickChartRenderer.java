package com.github.mikephil.charting.renderer;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.data.CandleData;
import com.github.mikephil.charting.data.CandleEntry;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.interfaces.dataprovider.CandleDataProvider;
import com.github.mikephil.charting.interfaces.datasets.ICandleDataSet;
import com.github.mikephil.charting.interfaces.datasets.ILineScatterCandleRadarDataSet;
import com.github.mikephil.charting.utils.MPPointD;
import com.github.mikephil.charting.utils.MPPointF;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
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

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawData(Canvas canvas) {
        for (T t7 : this.mChart.getCandleData().getDataSets()) {
            if (t7.isVisible()) {
                drawDataSet(canvas, t7);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void drawDataSet(Canvas canvas, ICandleDataSet iCandleDataSet) {
        int color;
        Transformer transformer = this.mChart.getTransformer(iCandleDataSet.getAxisDependency());
        float phaseY = this.mAnimator.getPhaseY();
        float barSpace = iCandleDataSet.getBarSpace();
        boolean showCandleBar = iCandleDataSet.getShowCandleBar();
        this.mXBounds.set(this.mChart, iCandleDataSet);
        this.mRenderPaint.setStrokeWidth(iCandleDataSet.getShadowWidth());
        int i14 = this.mXBounds.min;
        while (true) {
            BarLineScatterCandleBubbleRenderer.XBounds xBounds = this.mXBounds;
            if (i14 > xBounds.range + xBounds.min) {
                return;
            }
            CandleEntry candleEntry = (CandleEntry) iCandleDataSet.getEntryForIndex(i14);
            if (candleEntry != null) {
                float x14 = candleEntry.getX();
                float open = candleEntry.getOpen();
                float close = candleEntry.getClose();
                float high = candleEntry.getHigh();
                float low = candleEntry.getLow();
                if (showCandleBar) {
                    float[] fArr = this.mShadowBuffers;
                    fArr[0] = x14;
                    fArr[2] = x14;
                    fArr[4] = x14;
                    fArr[6] = x14;
                    if (open > close) {
                        fArr[1] = high * phaseY;
                        fArr[3] = open * phaseY;
                        fArr[5] = low * phaseY;
                        fArr[7] = close * phaseY;
                    } else if (open < close) {
                        fArr[1] = high * phaseY;
                        fArr[3] = close * phaseY;
                        fArr[5] = low * phaseY;
                        fArr[7] = open * phaseY;
                    } else {
                        fArr[1] = high * phaseY;
                        float f14 = open * phaseY;
                        fArr[3] = f14;
                        fArr[5] = low * phaseY;
                        fArr[7] = f14;
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
                    fArr2[0] = (x14 - 0.5f) + barSpace;
                    fArr2[1] = close * phaseY;
                    fArr2[2] = (x14 + 0.5f) - barSpace;
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
                        canvas.drawRect(fArr3[0], fArr3[3], fArr3[2], fArr3[1], this.mRenderPaint);
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
                        canvas.drawRect(fArr4[0], fArr4[1], fArr4[2], fArr4[3], this.mRenderPaint);
                    } else {
                        int neutralColor = iCandleDataSet.getNeutralColor();
                        Paint paint4 = this.mRenderPaint;
                        if (neutralColor == 1122867) {
                            paint4.setColor(iCandleDataSet.getColor(i14));
                        } else {
                            paint4.setColor(iCandleDataSet.getNeutralColor());
                        }
                        float[] fArr5 = this.mBodyBuffers;
                        canvas.drawLine(fArr5[0], fArr5[1], fArr5[2], fArr5[3], this.mRenderPaint);
                    }
                } else {
                    float[] fArr6 = this.mRangeBuffers;
                    fArr6[0] = x14;
                    fArr6[1] = high * phaseY;
                    fArr6[2] = x14;
                    fArr6[3] = low * phaseY;
                    float[] fArr7 = this.mOpenBuffers;
                    fArr7[0] = (x14 - 0.5f) + barSpace;
                    float f15 = open * phaseY;
                    fArr7[1] = f15;
                    fArr7[2] = x14;
                    fArr7[3] = f15;
                    float[] fArr8 = this.mCloseBuffers;
                    fArr8[0] = (x14 + 0.5f) - barSpace;
                    float f16 = close * phaseY;
                    fArr8[1] = f16;
                    fArr8[2] = x14;
                    fArr8[3] = f16;
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
                    canvas.drawLine(fArr9[0], fArr9[1], fArr9[2], fArr9[3], this.mRenderPaint);
                    float[] fArr10 = this.mOpenBuffers;
                    canvas.drawLine(fArr10[0], fArr10[1], fArr10[2], fArr10[3], this.mRenderPaint);
                    float[] fArr11 = this.mCloseBuffers;
                    canvas.drawLine(fArr11[0], fArr11[1], fArr11[2], fArr11[3], this.mRenderPaint);
                }
            }
            i14++;
        }
    }

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawExtras(Canvas canvas) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawHighlighted(Canvas canvas, Highlight[] highlightArr) {
        CandleData candleData = this.mChart.getCandleData();
        for (Highlight highlight : highlightArr) {
            ILineScatterCandleRadarDataSet iLineScatterCandleRadarDataSet = (ICandleDataSet) candleData.getDataSetByIndex(highlight.getDataSetIndex());
            if (iLineScatterCandleRadarDataSet != null && iLineScatterCandleRadarDataSet.isHighlightEnabled()) {
                CandleEntry candleEntry = (CandleEntry) iLineScatterCandleRadarDataSet.getEntryForXValue(highlight.getX(), highlight.getY());
                if (isInBoundsX(candleEntry, iLineScatterCandleRadarDataSet)) {
                    MPPointD pixelForValues = this.mChart.getTransformer(iLineScatterCandleRadarDataSet.getAxisDependency()).getPixelForValues(candleEntry.getX(), ((this.mAnimator.getPhaseY() * candleEntry.getHigh()) + (this.mAnimator.getPhaseY() * candleEntry.getLow())) / 2.0f);
                    highlight.setDraw((float) pixelForValues.f52826x, (float) pixelForValues.f52827y);
                    drawHighlightLines(canvas, (float) pixelForValues.f52826x, (float) pixelForValues.f52827y, iLineScatterCandleRadarDataSet);
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
        CandleEntry candleEntry;
        CandleStickChartRenderer candleStickChartRenderer = this;
        if (candleStickChartRenderer.isDrawingValuesAllowed(candleStickChartRenderer.mChart)) {
            List<T> dataSets = candleStickChartRenderer.mChart.getCandleData().getDataSets();
            int i14 = 0;
            while (i14 < dataSets.size()) {
                ICandleDataSet iCandleDataSet = (ICandleDataSet) dataSets.get(i14);
                if (candleStickChartRenderer.shouldDrawValues(iCandleDataSet) && iCandleDataSet.getEntryCount() >= 1) {
                    candleStickChartRenderer.applyValueTextStyle(iCandleDataSet);
                    Transformer transformer = candleStickChartRenderer.mChart.getTransformer(iCandleDataSet.getAxisDependency());
                    candleStickChartRenderer.mXBounds.set(candleStickChartRenderer.mChart, iCandleDataSet);
                    float phaseX = candleStickChartRenderer.mAnimator.getPhaseX();
                    float phaseY = candleStickChartRenderer.mAnimator.getPhaseY();
                    BarLineScatterCandleBubbleRenderer.XBounds xBounds = candleStickChartRenderer.mXBounds;
                    float[] fArrGenerateTransformedValuesCandle = transformer.generateTransformedValuesCandle(iCandleDataSet, phaseX, phaseY, xBounds.min, xBounds.max);
                    float fConvertDpToPixel = Utils.convertDpToPixel(5.0f);
                    ValueFormatter valueFormatter = iCandleDataSet.getValueFormatter();
                    MPPointF mPPointF = MPPointF.getInstance(iCandleDataSet.getIconsOffset());
                    mPPointF.f52828x = Utils.convertDpToPixel(mPPointF.f52828x);
                    mPPointF.f52829y = Utils.convertDpToPixel(mPPointF.f52829y);
                    int i15 = 0;
                    while (i15 < fArrGenerateTransformedValuesCandle.length) {
                        float f14 = fArrGenerateTransformedValuesCandle[i15];
                        float f15 = fArrGenerateTransformedValuesCandle[i15 + 1];
                        if (!candleStickChartRenderer.mViewPortHandler.isInBoundsRight(f14)) {
                            break;
                        }
                        if (candleStickChartRenderer.mViewPortHandler.isInBoundsLeft(f14) && candleStickChartRenderer.mViewPortHandler.isInBoundsY(f15)) {
                            int i16 = i15 / 2;
                            CandleEntry candleEntry2 = (CandleEntry) iCandleDataSet.getEntryForIndex(candleStickChartRenderer.mXBounds.min + i16);
                            if (iCandleDataSet.isDrawValuesEnabled()) {
                                candleEntry = candleEntry2;
                                candleStickChartRenderer.drawValue(canvas, valueFormatter.getCandleLabel(candleEntry2), f14, f15 - fConvertDpToPixel, iCandleDataSet.getValueTextColor(i16));
                            } else {
                                candleEntry = candleEntry2;
                            }
                            if (candleEntry.getIcon() != null && iCandleDataSet.isDrawIconsEnabled()) {
                                Drawable icon = candleEntry.getIcon();
                                Utils.drawImage(canvas, icon, (int) (f14 + mPPointF.f52828x), (int) (f15 + mPPointF.f52829y), icon.getIntrinsicWidth(), icon.getIntrinsicHeight());
                            }
                        }
                        i15 += 2;
                        candleStickChartRenderer = this;
                    }
                    MPPointF.recycleInstance(mPPointF);
                }
                i14++;
                candleStickChartRenderer = this;
            }
        }
    }

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void initBuffers() {
    }
}
