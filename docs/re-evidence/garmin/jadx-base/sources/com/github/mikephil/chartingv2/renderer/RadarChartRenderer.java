package com.github.mikephil.chartingv2.renderer;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import com.github.mikephil.chartingv2.animation.ChartAnimator;
import com.github.mikephil.chartingv2.charts.RadarChart;
import com.github.mikephil.chartingv2.data.Entry;
import com.github.mikephil.chartingv2.data.RadarData;
import com.github.mikephil.chartingv2.highlight.Highlight;
import com.github.mikephil.chartingv2.interfaces.datasets.IRadarDataSet;
import com.github.mikephil.chartingv2.utils.ColorTemplate;
import com.github.mikephil.chartingv2.utils.Utils;
import com.github.mikephil.chartingv2.utils.ViewPortHandler;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated
public class RadarChartRenderer extends LineRadarRenderer {
    protected RadarChart mChart;
    protected Paint mHighlightCirclePaint;
    protected Paint mWebPaint;

    public RadarChartRenderer(RadarChart radarChart, ChartAnimator chartAnimator, ViewPortHandler viewPortHandler) {
        super(chartAnimator, viewPortHandler);
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
    @Override // com.github.mikephil.chartingv2.renderer.DataRenderer
    public void drawData(Canvas canvas) {
        RadarData radarData = (RadarData) this.mChart.getData();
        int entryCount = 0;
        for (IRadarDataSet iRadarDataSet : radarData.getDataSets()) {
            if (iRadarDataSet.getEntryCount() > entryCount) {
                entryCount = iRadarDataSet.getEntryCount();
            }
        }
        for (IRadarDataSet iRadarDataSet2 : radarData.getDataSets()) {
            if (iRadarDataSet2.isVisible() && iRadarDataSet2.getEntryCount() > 0) {
                drawDataSet(canvas, iRadarDataSet2, entryCount);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r8v2, types: [com.github.mikephil.chartingv2.data.Entry] */
    public void drawDataSet(Canvas canvas, IRadarDataSet iRadarDataSet, int i14) {
        float phaseX = this.mAnimator.getPhaseX();
        float phaseY = this.mAnimator.getPhaseY();
        float sliceAngle = this.mChart.getSliceAngle();
        float factor = this.mChart.getFactor();
        PointF centerOffsets = this.mChart.getCenterOffsets();
        Path path = new Path();
        boolean z14 = false;
        for (int i15 = 0; i15 < iRadarDataSet.getEntryCount(); i15++) {
            this.mRenderPaint.setColor(iRadarDataSet.getColor(i15));
            PointF position = Utils.getPosition(centerOffsets, (iRadarDataSet.getEntryForIndex(i15).getVal() - this.mChart.getYChartMin()) * factor * phaseY, this.mChart.getRotationAngle() + (i15 * sliceAngle * phaseX));
            if (!Float.isNaN(position.x)) {
                float f14 = position.x;
                if (z14) {
                    path.lineTo(f14, position.y);
                } else {
                    path.moveTo(f14, position.y);
                    z14 = true;
                }
            }
        }
        if (iRadarDataSet.getEntryCount() > i14) {
            path.lineTo(centerOffsets.x, centerOffsets.y);
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
    }

    @Override // com.github.mikephil.chartingv2.renderer.DataRenderer
    public void drawExtras(Canvas canvas) {
        drawWeb(canvas);
    }

    public void drawHighlightCircle(Canvas canvas, PointF pointF, float f14, float f15, int i14, int i15, float f16) {
        canvas.save();
        float fConvertDpToPixel = Utils.convertDpToPixel(f15);
        float fConvertDpToPixel2 = Utils.convertDpToPixel(f14);
        if (i14 != 1122867) {
            Path path = new Path();
            path.addCircle(pointF.x, pointF.y, fConvertDpToPixel, Path.Direction.CW);
            if (fConvertDpToPixel2 > 0.0f) {
                path.addCircle(pointF.x, pointF.y, fConvertDpToPixel2, Path.Direction.CCW);
            }
            this.mHighlightCirclePaint.setColor(i14);
            this.mHighlightCirclePaint.setStyle(Paint.Style.FILL);
            canvas.drawPath(path, this.mHighlightCirclePaint);
        }
        if (i15 != 1122867) {
            this.mHighlightCirclePaint.setColor(i15);
            this.mHighlightCirclePaint.setStyle(Paint.Style.STROKE);
            this.mHighlightCirclePaint.setStrokeWidth(Utils.convertDpToPixel(f16));
            canvas.drawCircle(pointF.x, pointF.y, fConvertDpToPixel, this.mHighlightCirclePaint);
        }
        canvas.restore();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [com.github.mikephil.chartingv2.data.Entry] */
    @Override // com.github.mikephil.chartingv2.renderer.DataRenderer
    public void drawHighlighted(Canvas canvas, Highlight[] highlightArr) {
        int xIndex;
        ?? entryForXIndex;
        RadarChartRenderer radarChartRenderer = this;
        float phaseX = radarChartRenderer.mAnimator.getPhaseX();
        float phaseY = radarChartRenderer.mAnimator.getPhaseY();
        float sliceAngle = radarChartRenderer.mChart.getSliceAngle();
        float factor = radarChartRenderer.mChart.getFactor();
        PointF centerOffsets = radarChartRenderer.mChart.getCenterOffsets();
        int i14 = 0;
        while (i14 < highlightArr.length) {
            IRadarDataSet dataSetByIndex = ((RadarData) radarChartRenderer.mChart.getData()).getDataSetByIndex(highlightArr[i14].getDataSetIndex());
            if (dataSetByIndex != null && dataSetByIndex.isHighlightEnabled() && (entryForXIndex = dataSetByIndex.getEntryForXIndex((xIndex = highlightArr[i14].getXIndex()))) != 0 && entryForXIndex.getXIndex() == xIndex) {
                int entryIndex = dataSetByIndex.getEntryIndex(entryForXIndex);
                float val = entryForXIndex.getVal() - radarChartRenderer.mChart.getYChartMin();
                if (!Float.isNaN(val)) {
                    PointF position = Utils.getPosition(centerOffsets, val * factor * phaseY, radarChartRenderer.mChart.getRotationAngle() + (entryIndex * sliceAngle * phaseX));
                    float[] fArr = {position.x, position.y};
                    radarChartRenderer.drawHighlightLines(canvas, fArr, dataSetByIndex);
                    if (dataSetByIndex.isDrawHighlightCircleEnabled() && !Float.isNaN(fArr[0]) && !Float.isNaN(fArr[1])) {
                        int highlightCircleStrokeColor = dataSetByIndex.getHighlightCircleStrokeColor();
                        if (highlightCircleStrokeColor == 1122867) {
                            highlightCircleStrokeColor = dataSetByIndex.getColor(0);
                        }
                        if (dataSetByIndex.getHighlightCircleStrokeAlpha() < 255) {
                            highlightCircleStrokeColor = ColorTemplate.getColorWithAlphaComponent(highlightCircleStrokeColor, dataSetByIndex.getHighlightCircleStrokeAlpha());
                        }
                        radarChartRenderer.drawHighlightCircle(canvas, position, dataSetByIndex.getHighlightCircleInnerRadius(), dataSetByIndex.getHighlightCircleOuterRadius(), dataSetByIndex.getHighlightCircleFillColor(), highlightCircleStrokeColor, dataSetByIndex.getHighlightCircleStrokeWidth());
                    }
                }
            }
            i14++;
            radarChartRenderer = this;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.mikephil.chartingv2.renderer.DataRenderer
    public void drawValues(Canvas canvas) {
        RadarChartRenderer radarChartRenderer = this;
        float phaseX = radarChartRenderer.mAnimator.getPhaseX();
        float phaseY = radarChartRenderer.mAnimator.getPhaseY();
        float sliceAngle = radarChartRenderer.mChart.getSliceAngle();
        float factor = radarChartRenderer.mChart.getFactor();
        PointF centerOffsets = radarChartRenderer.mChart.getCenterOffsets();
        float fConvertDpToPixel = Utils.convertDpToPixel(5.0f);
        int i14 = 0;
        while (i14 < ((RadarData) radarChartRenderer.mChart.getData()).getDataSetCount()) {
            IRadarDataSet dataSetByIndex = ((RadarData) radarChartRenderer.mChart.getData()).getDataSetByIndex(i14);
            if (dataSetByIndex.isDrawValuesEnabled() && dataSetByIndex.getEntryCount() != 0) {
                radarChartRenderer.applyValueTextStyle(dataSetByIndex);
                int i15 = 0;
                while (i15 < dataSetByIndex.getEntryCount()) {
                    Entry entryForIndex = dataSetByIndex.getEntryForIndex(i15);
                    PointF position = Utils.getPosition(centerOffsets, (entryForIndex.getVal() - radarChartRenderer.mChart.getYChartMin()) * factor * phaseY, radarChartRenderer.mChart.getRotationAngle() + (i15 * sliceAngle * phaseX));
                    radarChartRenderer.drawValue(canvas, dataSetByIndex.getValueFormatter(), entryForIndex.getVal(), entryForIndex, i14, position.x, position.y - fConvertDpToPixel, dataSetByIndex.getValueTextColor(i15));
                    i15++;
                    radarChartRenderer = this;
                    dataSetByIndex = dataSetByIndex;
                }
            }
            i14++;
            radarChartRenderer = this;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void drawWeb(Canvas canvas) {
        float sliceAngle = this.mChart.getSliceAngle();
        float factor = this.mChart.getFactor();
        float rotationAngle = this.mChart.getRotationAngle();
        PointF centerOffsets = this.mChart.getCenterOffsets();
        this.mWebPaint.setStrokeWidth(this.mChart.getWebLineWidth());
        this.mWebPaint.setColor(this.mChart.getWebColor());
        this.mWebPaint.setAlpha(this.mChart.getWebAlpha());
        int skipWebLineCount = this.mChart.getSkipWebLineCount() + 1;
        for (int i14 = 0; i14 < ((RadarData) this.mChart.getData()).getXValCount(); i14 += skipWebLineCount) {
            PointF position = Utils.getPosition(centerOffsets, this.mChart.getYRange() * factor, (i14 * sliceAngle) + rotationAngle);
            canvas.drawLine(centerOffsets.x, centerOffsets.y, position.x, position.y, this.mWebPaint);
        }
        this.mWebPaint.setStrokeWidth(this.mChart.getWebLineWidthInner());
        this.mWebPaint.setColor(this.mChart.getWebColorInner());
        this.mWebPaint.setAlpha(this.mChart.getWebAlpha());
        int i15 = this.mChart.getYAxis().mEntryCount;
        for (int i16 = 0; i16 < i15; i16++) {
            int i17 = 0;
            while (i17 < ((RadarData) this.mChart.getData()).getXValCount()) {
                float yChartMin = (this.mChart.getYAxis().mEntries[i16] - this.mChart.getYChartMin()) * factor;
                PointF position2 = Utils.getPosition(centerOffsets, yChartMin, (i17 * sliceAngle) + rotationAngle);
                i17++;
                PointF position3 = Utils.getPosition(centerOffsets, yChartMin, (i17 * sliceAngle) + rotationAngle);
                canvas.drawLine(position2.x, position2.y, position3.x, position3.y, this.mWebPaint);
            }
        }
    }

    public Paint getWebPaint() {
        return this.mWebPaint;
    }

    @Override // com.github.mikephil.chartingv2.renderer.DataRenderer
    public void initBuffers() {
    }
}
