package com.github.mikephil.charting.renderer;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.charts.RadarChart;
import com.github.mikephil.charting.data.RadarData;
import com.github.mikephil.charting.data.RadarEntry;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.interfaces.datasets.IRadarDataSet;
import com.github.mikephil.charting.utils.ColorTemplate;
import com.github.mikephil.charting.utils.MPPointF;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;

/* JADX INFO: loaded from: classes13.dex */
public class RadarChartRenderer extends LineRadarRenderer {
    protected RadarChart mChart;
    protected Path mDrawDataSetSurfacePathBuffer;
    protected Path mDrawHighlightCirclePathBuffer;
    protected Paint mHighlightCirclePaint;
    protected Paint mWebPaint;

    public RadarChartRenderer(RadarChart radarChart, ChartAnimator chartAnimator, ViewPortHandler viewPortHandler) {
        super(chartAnimator, viewPortHandler);
        this.mDrawDataSetSurfacePathBuffer = new Path();
        this.mDrawHighlightCirclePathBuffer = new Path();
        this.mChart = radarChart;
        Paint paint = new Paint(1);
        this.mHighlightPaint = paint;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        this.mHighlightPaint.setStrokeWidth(2.0f);
        this.mHighlightPaint.setColor(Color.rgb(255, 187, 115));
        Paint paint2 = new Paint(1);
        this.mWebPaint = paint2;
        paint2.setStyle(style);
        this.mHighlightCirclePaint = new Paint(1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawData(Canvas canvas) {
        RadarData radarData = (RadarData) this.mChart.getData();
        int entryCount = radarData.getMaxEntryCountSet().getEntryCount();
        for (IRadarDataSet iRadarDataSet : radarData.getDataSets()) {
            if (iRadarDataSet.isVisible()) {
                drawDataSet(canvas, iRadarDataSet, entryCount);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void drawDataSet(Canvas canvas, IRadarDataSet iRadarDataSet, int i14) {
        float phaseX = this.mAnimator.getPhaseX();
        float phaseY = this.mAnimator.getPhaseY();
        float sliceAngle = this.mChart.getSliceAngle();
        float factor = this.mChart.getFactor();
        MPPointF centerOffsets = this.mChart.getCenterOffsets();
        MPPointF mPPointF = MPPointF.getInstance(0.0f, 0.0f);
        Path path = this.mDrawDataSetSurfacePathBuffer;
        path.reset();
        boolean z14 = false;
        for (int i15 = 0; i15 < iRadarDataSet.getEntryCount(); i15++) {
            this.mRenderPaint.setColor(iRadarDataSet.getColor(i15));
            Utils.getPosition(centerOffsets, (((RadarEntry) iRadarDataSet.getEntryForIndex(i15)).getY() - this.mChart.getYChartMin()) * factor * phaseY, this.mChart.getRotationAngle() + (i15 * sliceAngle * phaseX), mPPointF);
            if (!Float.isNaN(mPPointF.f52828x)) {
                float f14 = mPPointF.f52828x;
                if (z14) {
                    path.lineTo(f14, mPPointF.f52829y);
                } else {
                    path.moveTo(f14, mPPointF.f52829y);
                    z14 = true;
                }
            }
        }
        if (iRadarDataSet.getEntryCount() > i14) {
            path.lineTo(centerOffsets.f52828x, centerOffsets.f52829y);
        }
        path.close();
        if (iRadarDataSet.isDrawFilledEnabled()) {
            Drawable fillDrawable = iRadarDataSet.getFillDrawable();
            if (fillDrawable != null) {
                drawFilledPath(canvas, path, fillDrawable);
            } else {
                drawFilledPath(canvas, path, iRadarDataSet.getFillColor(), iRadarDataSet.getFillAlpha());
            }
        }
        this.mRenderPaint.setStrokeWidth(iRadarDataSet.getLineWidth());
        this.mRenderPaint.setStyle(Paint.Style.STROKE);
        if (!iRadarDataSet.isDrawFilledEnabled() || iRadarDataSet.getFillAlpha() < 255) {
            canvas.drawPath(path, this.mRenderPaint);
        }
        MPPointF.recycleInstance(centerOffsets);
        MPPointF.recycleInstance(mPPointF);
    }

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawExtras(Canvas canvas) {
        drawWeb(canvas);
    }

    public void drawHighlightCircle(Canvas canvas, MPPointF mPPointF, float f14, float f15, int i14, int i15, float f16) {
        canvas.save();
        float fConvertDpToPixel = Utils.convertDpToPixel(f15);
        float fConvertDpToPixel2 = Utils.convertDpToPixel(f14);
        if (i14 != 1122867) {
            Path path = this.mDrawHighlightCirclePathBuffer;
            path.reset();
            path.addCircle(mPPointF.f52828x, mPPointF.f52829y, fConvertDpToPixel, Path.Direction.CW);
            if (fConvertDpToPixel2 > 0.0f) {
                path.addCircle(mPPointF.f52828x, mPPointF.f52829y, fConvertDpToPixel2, Path.Direction.CCW);
            }
            this.mHighlightCirclePaint.setColor(i14);
            this.mHighlightCirclePaint.setStyle(Paint.Style.FILL);
            canvas.drawPath(path, this.mHighlightCirclePaint);
        }
        if (i15 != 1122867) {
            this.mHighlightCirclePaint.setColor(i15);
            this.mHighlightCirclePaint.setStyle(Paint.Style.STROKE);
            this.mHighlightCirclePaint.setStrokeWidth(Utils.convertDpToPixel(f16));
            canvas.drawCircle(mPPointF.f52828x, mPPointF.f52829y, fConvertDpToPixel, this.mHighlightCirclePaint);
        }
        canvas.restore();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawHighlighted(Canvas canvas, Highlight[] highlightArr) {
        RadarChartRenderer radarChartRenderer = this;
        float sliceAngle = radarChartRenderer.mChart.getSliceAngle();
        float factor = radarChartRenderer.mChart.getFactor();
        MPPointF centerOffsets = radarChartRenderer.mChart.getCenterOffsets();
        MPPointF mPPointF = MPPointF.getInstance(0.0f, 0.0f);
        RadarData radarData = (RadarData) radarChartRenderer.mChart.getData();
        int length = highlightArr.length;
        int i14 = 0;
        while (i14 < length) {
            Highlight highlight = highlightArr[i14];
            IRadarDataSet dataSetByIndex = radarData.getDataSetByIndex(highlight.getDataSetIndex());
            if (dataSetByIndex != null && dataSetByIndex.isHighlightEnabled()) {
                RadarEntry radarEntry = (RadarEntry) dataSetByIndex.getEntryForIndex((int) highlight.getX());
                if (radarChartRenderer.isInBoundsX(radarEntry, dataSetByIndex)) {
                    Utils.getPosition(centerOffsets, radarChartRenderer.mAnimator.getPhaseY() * (radarEntry.getY() - radarChartRenderer.mChart.getYChartMin()) * factor, radarChartRenderer.mChart.getRotationAngle() + (radarChartRenderer.mAnimator.getPhaseX() * highlight.getX() * sliceAngle), mPPointF);
                    highlight.setDraw(mPPointF.f52828x, mPPointF.f52829y);
                    radarChartRenderer.drawHighlightLines(canvas, mPPointF.f52828x, mPPointF.f52829y, dataSetByIndex);
                    if (dataSetByIndex.isDrawHighlightCircleEnabled() && !Float.isNaN(mPPointF.f52828x) && !Float.isNaN(mPPointF.f52829y)) {
                        int highlightCircleStrokeColor = dataSetByIndex.getHighlightCircleStrokeColor();
                        if (highlightCircleStrokeColor == 1122867) {
                            highlightCircleStrokeColor = dataSetByIndex.getColor(0);
                        }
                        if (dataSetByIndex.getHighlightCircleStrokeAlpha() < 255) {
                            highlightCircleStrokeColor = ColorTemplate.colorWithAlpha(highlightCircleStrokeColor, dataSetByIndex.getHighlightCircleStrokeAlpha());
                        }
                        radarChartRenderer.drawHighlightCircle(canvas, mPPointF, dataSetByIndex.getHighlightCircleInnerRadius(), dataSetByIndex.getHighlightCircleOuterRadius(), dataSetByIndex.getHighlightCircleFillColor(), highlightCircleStrokeColor, dataSetByIndex.getHighlightCircleStrokeWidth());
                    }
                }
            }
            i14++;
            radarChartRenderer = this;
        }
        MPPointF.recycleInstance(centerOffsets);
        MPPointF.recycleInstance(mPPointF);
    }

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawValue(Canvas canvas, String str, float f14, float f15, int i14) {
        this.mValuePaint.setColor(i14);
        canvas.drawText(str, f14, f15, this.mValuePaint);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawValues(Canvas canvas) {
        float f14;
        RadarEntry radarEntry;
        ValueFormatter valueFormatter;
        RadarChartRenderer radarChartRenderer = this;
        float phaseX = radarChartRenderer.mAnimator.getPhaseX();
        float phaseY = radarChartRenderer.mAnimator.getPhaseY();
        float sliceAngle = radarChartRenderer.mChart.getSliceAngle();
        float factor = radarChartRenderer.mChart.getFactor();
        MPPointF centerOffsets = radarChartRenderer.mChart.getCenterOffsets();
        MPPointF mPPointF = MPPointF.getInstance(0.0f, 0.0f);
        MPPointF mPPointF2 = MPPointF.getInstance(0.0f, 0.0f);
        float fConvertDpToPixel = Utils.convertDpToPixel(5.0f);
        int i14 = 0;
        while (i14 < ((RadarData) radarChartRenderer.mChart.getData()).getDataSetCount()) {
            IRadarDataSet dataSetByIndex = ((RadarData) radarChartRenderer.mChart.getData()).getDataSetByIndex(i14);
            if (radarChartRenderer.shouldDrawValues(dataSetByIndex)) {
                radarChartRenderer.applyValueTextStyle(dataSetByIndex);
                ValueFormatter valueFormatter2 = dataSetByIndex.getValueFormatter();
                MPPointF mPPointF3 = MPPointF.getInstance(dataSetByIndex.getIconsOffset());
                mPPointF3.f52828x = Utils.convertDpToPixel(mPPointF3.f52828x);
                mPPointF3.f52829y = Utils.convertDpToPixel(mPPointF3.f52829y);
                int i15 = 0;
                while (i15 < dataSetByIndex.getEntryCount()) {
                    RadarEntry radarEntry2 = (RadarEntry) dataSetByIndex.getEntryForIndex(i15);
                    MPPointF mPPointF4 = mPPointF3;
                    float f15 = i15 * sliceAngle * phaseX;
                    Utils.getPosition(centerOffsets, (radarEntry2.getY() - radarChartRenderer.mChart.getYChartMin()) * factor * phaseY, radarChartRenderer.mChart.getRotationAngle() + f15, mPPointF);
                    if (dataSetByIndex.isDrawValuesEnabled()) {
                        ValueFormatter valueFormatter3 = valueFormatter2;
                        radarEntry = radarEntry2;
                        radarChartRenderer = this;
                        valueFormatter = valueFormatter3;
                        radarChartRenderer.drawValue(canvas, valueFormatter3.getRadarLabel(radarEntry2), mPPointF.f52828x, mPPointF.f52829y - fConvertDpToPixel, dataSetByIndex.getValueTextColor(i15));
                    } else {
                        radarEntry = radarEntry2;
                        valueFormatter = valueFormatter2;
                    }
                    if (radarEntry.getIcon() != null && dataSetByIndex.isDrawIconsEnabled()) {
                        Drawable icon = radarEntry.getIcon();
                        Utils.getPosition(centerOffsets, (radarEntry.getY() * factor * phaseY) + mPPointF4.f52829y, radarChartRenderer.mChart.getRotationAngle() + f15, mPPointF2);
                        float f16 = mPPointF2.f52829y + mPPointF4.f52828x;
                        mPPointF2.f52829y = f16;
                        Utils.drawImage(canvas, icon, (int) mPPointF2.f52828x, (int) f16, icon.getIntrinsicWidth(), icon.getIntrinsicHeight());
                    }
                    i15++;
                    mPPointF3 = mPPointF4;
                    dataSetByIndex = dataSetByIndex;
                    valueFormatter2 = valueFormatter;
                    phaseX = phaseX;
                }
                f14 = phaseX;
                MPPointF.recycleInstance(mPPointF3);
            } else {
                f14 = phaseX;
            }
            i14++;
            phaseX = f14;
        }
        MPPointF.recycleInstance(centerOffsets);
        MPPointF.recycleInstance(mPPointF);
        MPPointF.recycleInstance(mPPointF2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void drawWeb(Canvas canvas) {
        float sliceAngle = this.mChart.getSliceAngle();
        float factor = this.mChart.getFactor();
        float rotationAngle = this.mChart.getRotationAngle();
        MPPointF centerOffsets = this.mChart.getCenterOffsets();
        this.mWebPaint.setStrokeWidth(this.mChart.getWebLineWidth());
        this.mWebPaint.setColor(this.mChart.getWebColor());
        this.mWebPaint.setAlpha(this.mChart.getWebAlpha());
        int skipWebLineCount = this.mChart.getSkipWebLineCount() + 1;
        int entryCount = ((RadarData) this.mChart.getData()).getMaxEntryCountSet().getEntryCount();
        MPPointF mPPointF = MPPointF.getInstance(0.0f, 0.0f);
        for (int i14 = 0; i14 < entryCount; i14 += skipWebLineCount) {
            Utils.getPosition(centerOffsets, this.mChart.getYRange() * factor, (i14 * sliceAngle) + rotationAngle, mPPointF);
            canvas.drawLine(centerOffsets.f52828x, centerOffsets.f52829y, mPPointF.f52828x, mPPointF.f52829y, this.mWebPaint);
        }
        MPPointF.recycleInstance(mPPointF);
        this.mWebPaint.setStrokeWidth(this.mChart.getWebLineWidthInner());
        this.mWebPaint.setColor(this.mChart.getWebColorInner());
        this.mWebPaint.setAlpha(this.mChart.getWebAlpha());
        int i15 = this.mChart.getYAxis().mEntryCount;
        MPPointF mPPointF2 = MPPointF.getInstance(0.0f, 0.0f);
        MPPointF mPPointF3 = MPPointF.getInstance(0.0f, 0.0f);
        for (int i16 = 0; i16 < i15; i16++) {
            int i17 = 0;
            while (i17 < ((RadarData) this.mChart.getData()).getEntryCount()) {
                float yChartMin = (this.mChart.getYAxis().mEntries[i16] - this.mChart.getYChartMin()) * factor;
                Utils.getPosition(centerOffsets, yChartMin, (i17 * sliceAngle) + rotationAngle, mPPointF2);
                i17++;
                Utils.getPosition(centerOffsets, yChartMin, (i17 * sliceAngle) + rotationAngle, mPPointF3);
                canvas.drawLine(mPPointF2.f52828x, mPPointF2.f52829y, mPPointF3.f52828x, mPPointF3.f52829y, this.mWebPaint);
            }
        }
        MPPointF.recycleInstance(mPPointF2);
        MPPointF.recycleInstance(mPPointF3);
    }

    public Paint getWebPaint() {
        return this.mWebPaint;
    }

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void initBuffers() {
    }
}
