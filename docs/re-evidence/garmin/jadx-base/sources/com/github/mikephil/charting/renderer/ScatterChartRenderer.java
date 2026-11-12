package com.github.mikephil.charting.renderer;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.ScatterData;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.interfaces.dataprovider.ScatterDataProvider;
import com.github.mikephil.charting.interfaces.datasets.IScatterDataSet;
import com.github.mikephil.charting.renderer.scatter.IShapeRenderer;
import com.github.mikephil.charting.utils.MPPointD;
import com.github.mikephil.charting.utils.MPPointF;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class ScatterChartRenderer extends LineScatterCandleRadarRenderer {
    protected ScatterDataProvider mChart;
    float[] mPixelBuffer;

    public ScatterChartRenderer(ScatterDataProvider scatterDataProvider, ChartAnimator chartAnimator, ViewPortHandler viewPortHandler) {
        super(chartAnimator, viewPortHandler);
        this.mPixelBuffer = new float[2];
        this.mChart = scatterDataProvider;
    }

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawData(Canvas canvas) {
        for (T t7 : this.mChart.getScatterData().getDataSets()) {
            if (t7.isVisible()) {
                drawDataSet(canvas, t7);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
    public void drawDataSet(Canvas canvas, IScatterDataSet iScatterDataSet) {
        IScatterDataSet iScatterDataSet2 = iScatterDataSet;
        if (iScatterDataSet2.getEntryCount() < 1) {
            return;
        }
        ViewPortHandler viewPortHandler = this.mViewPortHandler;
        Transformer transformer = this.mChart.getTransformer(iScatterDataSet2.getAxisDependency());
        float phaseY = this.mAnimator.getPhaseY();
        IShapeRenderer shapeRenderer = iScatterDataSet2.getShapeRenderer();
        if (shapeRenderer == null) {
            return;
        }
        int iMin = (int) Math.min(Math.ceil(this.mAnimator.getPhaseX() * iScatterDataSet2.getEntryCount()), iScatterDataSet2.getEntryCount());
        int i14 = 0;
        while (i14 < iMin) {
            ?? entryForIndex = iScatterDataSet2.getEntryForIndex(i14);
            this.mPixelBuffer[0] = entryForIndex.getX();
            this.mPixelBuffer[1] = entryForIndex.getY() * phaseY;
            transformer.pointValuesToPixel(this.mPixelBuffer);
            if (!viewPortHandler.isInBoundsRight(this.mPixelBuffer[0])) {
                return;
            }
            if (viewPortHandler.isInBoundsLeft(this.mPixelBuffer[0]) && viewPortHandler.isInBoundsY(this.mPixelBuffer[1])) {
                this.mRenderPaint.setColor(iScatterDataSet2.getColor(i14 / 2));
                ViewPortHandler viewPortHandler2 = this.mViewPortHandler;
                float[] fArr = this.mPixelBuffer;
                shapeRenderer.renderShape(canvas, iScatterDataSet2, viewPortHandler2, fArr[0], fArr[1], this.mRenderPaint);
            }
            i14++;
            iScatterDataSet2 = iScatterDataSet;
        }
    }

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawExtras(Canvas canvas) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawHighlighted(Canvas canvas, Highlight[] highlightArr) {
        ScatterData scatterData = this.mChart.getScatterData();
        for (Highlight highlight : highlightArr) {
            IScatterDataSet iScatterDataSet = (IScatterDataSet) scatterData.getDataSetByIndex(highlight.getDataSetIndex());
            if (iScatterDataSet != null && iScatterDataSet.isHighlightEnabled()) {
                ?? entryForXValue = iScatterDataSet.getEntryForXValue(highlight.getX(), highlight.getY());
                if (isInBoundsX(entryForXValue, iScatterDataSet)) {
                    MPPointD pixelForValues = this.mChart.getTransformer(iScatterDataSet.getAxisDependency()).getPixelForValues(entryForXValue.getX(), this.mAnimator.getPhaseY() * entryForXValue.getY());
                    highlight.setDraw((float) pixelForValues.f52826x, (float) pixelForValues.f52827y);
                    drawHighlightLines(canvas, (float) pixelForValues.f52826x, (float) pixelForValues.f52827y, iScatterDataSet);
                }
            }
        }
    }

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawValue(Canvas canvas, String str, float f14, float f15, int i14) {
        this.mValuePaint.setColor(i14);
        canvas.drawText(str, f14, f15, this.mValuePaint);
    }

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawValues(Canvas canvas) {
        Entry entry;
        ScatterChartRenderer scatterChartRenderer = this;
        if (scatterChartRenderer.isDrawingValuesAllowed(scatterChartRenderer.mChart)) {
            List<T> dataSets = scatterChartRenderer.mChart.getScatterData().getDataSets();
            int i14 = 0;
            while (i14 < scatterChartRenderer.mChart.getScatterData().getDataSetCount()) {
                IScatterDataSet iScatterDataSet = (IScatterDataSet) dataSets.get(i14);
                if (scatterChartRenderer.shouldDrawValues(iScatterDataSet) && iScatterDataSet.getEntryCount() >= 1) {
                    scatterChartRenderer.applyValueTextStyle(iScatterDataSet);
                    scatterChartRenderer.mXBounds.set(scatterChartRenderer.mChart, iScatterDataSet);
                    Transformer transformer = scatterChartRenderer.mChart.getTransformer(iScatterDataSet.getAxisDependency());
                    float phaseX = scatterChartRenderer.mAnimator.getPhaseX();
                    float phaseY = scatterChartRenderer.mAnimator.getPhaseY();
                    BarLineScatterCandleBubbleRenderer.XBounds xBounds = scatterChartRenderer.mXBounds;
                    float[] fArrGenerateTransformedValuesScatter = transformer.generateTransformedValuesScatter(iScatterDataSet, phaseX, phaseY, xBounds.min, xBounds.max);
                    float fConvertDpToPixel = Utils.convertDpToPixel(iScatterDataSet.getScatterShapeSize());
                    ValueFormatter valueFormatter = iScatterDataSet.getValueFormatter();
                    MPPointF mPPointF = MPPointF.getInstance(iScatterDataSet.getIconsOffset());
                    mPPointF.f52828x = Utils.convertDpToPixel(mPPointF.f52828x);
                    mPPointF.f52829y = Utils.convertDpToPixel(mPPointF.f52829y);
                    int i15 = 0;
                    while (i15 < fArrGenerateTransformedValuesScatter.length && scatterChartRenderer.mViewPortHandler.isInBoundsRight(fArrGenerateTransformedValuesScatter[i15])) {
                        if (scatterChartRenderer.mViewPortHandler.isInBoundsLeft(fArrGenerateTransformedValuesScatter[i15])) {
                            int i16 = i15 + 1;
                            if (scatterChartRenderer.mViewPortHandler.isInBoundsY(fArrGenerateTransformedValuesScatter[i16])) {
                                int i17 = i15 / 2;
                                Entry entryForIndex = iScatterDataSet.getEntryForIndex(scatterChartRenderer.mXBounds.min + i17);
                                if (iScatterDataSet.isDrawValuesEnabled()) {
                                    entry = entryForIndex;
                                    scatterChartRenderer.drawValue(canvas, valueFormatter.getPointLabel(entryForIndex), fArrGenerateTransformedValuesScatter[i15], fArrGenerateTransformedValuesScatter[i16] - fConvertDpToPixel, iScatterDataSet.getValueTextColor(i17 + scatterChartRenderer.mXBounds.min));
                                } else {
                                    entry = entryForIndex;
                                }
                                if (entry.getIcon() != null && iScatterDataSet.isDrawIconsEnabled()) {
                                    Drawable icon = entry.getIcon();
                                    Utils.drawImage(canvas, icon, (int) (fArrGenerateTransformedValuesScatter[i15] + mPPointF.f52828x), (int) (fArrGenerateTransformedValuesScatter[i16] + mPPointF.f52829y), icon.getIntrinsicWidth(), icon.getIntrinsicHeight());
                                }
                            }
                        }
                        i15 += 2;
                        scatterChartRenderer = this;
                    }
                    MPPointF.recycleInstance(mPPointF);
                }
                i14++;
                scatterChartRenderer = this;
            }
        }
    }

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void initBuffers() {
    }
}
