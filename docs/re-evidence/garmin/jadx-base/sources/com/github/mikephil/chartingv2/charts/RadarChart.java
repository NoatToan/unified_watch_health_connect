package com.github.mikephil.chartingv2.charts;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.RectF;
import android.util.AttributeSet;
import com.github.mikephil.chartingv2.components.Legend;
import com.github.mikephil.chartingv2.components.XAxis;
import com.github.mikephil.chartingv2.components.YAxis;
import com.github.mikephil.chartingv2.data.Entry;
import com.github.mikephil.chartingv2.data.RadarData;
import com.github.mikephil.chartingv2.highlight.Highlight;
import com.github.mikephil.chartingv2.renderer.RadarChartRenderer;
import com.github.mikephil.chartingv2.renderer.XAxisRendererRadarChart;
import com.github.mikephil.chartingv2.renderer.YAxisRendererRadarChart;
import com.github.mikephil.chartingv2.utils.Utils;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated
public class RadarChart extends PieRadarChartBase<RadarData> {
    private boolean mDrawWeb;
    private float mInnerWebLineWidth;
    private int mSkipWebLineCount;
    private int mWebAlpha;
    private int mWebColor;
    private int mWebColorInner;
    private float mWebLineWidth;
    protected XAxisRendererRadarChart mXAxisRenderer;
    private YAxis mYAxis;
    protected YAxisRendererRadarChart mYAxisRenderer;

    public RadarChart(Context context) {
        super(context);
        this.mWebLineWidth = 2.5f;
        this.mInnerWebLineWidth = 1.5f;
        this.mWebColor = Color.rgb(122, 122, 122);
        this.mWebColorInner = Color.rgb(122, 122, 122);
        this.mWebAlpha = 150;
        this.mDrawWeb = true;
        this.mSkipWebLineCount = 0;
    }

    @Override // com.github.mikephil.chartingv2.charts.PieRadarChartBase, com.github.mikephil.chartingv2.charts.Chart
    public void calcMinMax() {
        super.calcMinMax();
        this.mXAxis.mAxisMaximum = ((RadarData) this.mData).getXVals().size() - 1;
        XAxis xAxis = this.mXAxis;
        xAxis.mAxisRange = Math.abs(xAxis.mAxisMaximum - xAxis.mAxisMinimum);
        YAxis yAxis = this.mYAxis;
        RadarData radarData = (RadarData) this.mData;
        YAxis.AxisDependency axisDependency = YAxis.AxisDependency.LEFT;
        yAxis.calcMinMax(radarData.getYMin(axisDependency), ((RadarData) this.mData).getYMax(axisDependency));
    }

    public float getFactor() {
        RectF contentRect = this.mViewPortHandler.getContentRect();
        return Math.min(contentRect.width() / 2.0f, contentRect.height() / 2.0f) / this.mYAxis.mAxisRange;
    }

    @Override // com.github.mikephil.chartingv2.charts.PieRadarChartBase
    public int getIndexForAngle(float f14) {
        float normalizedAngle = Utils.getNormalizedAngle(f14 - getRotationAngle());
        float sliceAngle = getSliceAngle();
        int i14 = 0;
        while (i14 < ((RadarData) this.mData).getXValCount()) {
            int i15 = i14 + 1;
            if ((i15 * sliceAngle) - (sliceAngle / 2.0f) > normalizedAngle) {
                return i14;
            }
            i14 = i15;
        }
        return 0;
    }

    @Override // com.github.mikephil.chartingv2.charts.Chart
    public float[] getMarkerPosition(Entry entry, Highlight highlight) {
        float rotationAngle = getRotationAngle() + (getSliceAngle() * entry.getXIndex());
        float factor = getFactor() * entry.getVal();
        PointF centerOffsets = getCenterOffsets();
        double d14 = factor;
        double d15 = rotationAngle;
        PointF pointF = new PointF((float) ((Math.cos(Math.toRadians(d15)) * d14) + ((double) centerOffsets.x)), (float) ((Math.sin(Math.toRadians(d15)) * d14) + ((double) centerOffsets.y)));
        return new float[]{pointF.x, pointF.y};
    }

    @Override // com.github.mikephil.chartingv2.charts.PieRadarChartBase
    public float getRadius() {
        RectF contentRect = this.mViewPortHandler.getContentRect();
        return Math.min(contentRect.width() / 2.0f, contentRect.height() / 2.0f);
    }

    @Override // com.github.mikephil.chartingv2.charts.PieRadarChartBase
    public float getRequiredBaseOffset() {
        return (this.mXAxis.isEnabled() && this.mXAxis.isDrawLabelsEnabled()) ? this.mXAxis.mLabelRotatedWidth : Utils.convertDpToPixel(10.0f);
    }

    @Override // com.github.mikephil.chartingv2.charts.PieRadarChartBase
    public float getRequiredLegendOffset() {
        return this.mLegendRenderer.getLabelPaint().getTextSize() * 4.0f;
    }

    public int getSkipWebLineCount() {
        return this.mSkipWebLineCount;
    }

    public float getSliceAngle() {
        return 360.0f / ((RadarData) this.mData).getXValCount();
    }

    public int getWebAlpha() {
        return this.mWebAlpha;
    }

    public int getWebColor() {
        return this.mWebColor;
    }

    public int getWebColorInner() {
        return this.mWebColorInner;
    }

    public float getWebLineWidth() {
        return this.mWebLineWidth;
    }

    public float getWebLineWidthInner() {
        return this.mInnerWebLineWidth;
    }

    public YAxis getYAxis() {
        return this.mYAxis;
    }

    @Override // com.github.mikephil.chartingv2.charts.PieRadarChartBase, com.github.mikephil.chartingv2.interfaces.dataprovider.ChartInterface
    public float getYChartMax() {
        return this.mYAxis.mAxisMaximum;
    }

    @Override // com.github.mikephil.chartingv2.charts.PieRadarChartBase, com.github.mikephil.chartingv2.interfaces.dataprovider.ChartInterface
    public float getYChartMin() {
        return this.mYAxis.mAxisMinimum;
    }

    public float getYRange() {
        return this.mYAxis.mAxisRange;
    }

    @Override // com.github.mikephil.chartingv2.charts.PieRadarChartBase, com.github.mikephil.chartingv2.charts.Chart
    public void init() {
        super.init();
        this.mYAxis = new YAxis(YAxis.AxisDependency.LEFT);
        this.mXAxis.setSpaceBetweenLabels(0);
        this.mWebLineWidth = Utils.convertDpToPixel(1.5f);
        this.mInnerWebLineWidth = Utils.convertDpToPixel(0.75f);
        this.mRenderer = new RadarChartRenderer(this, this.mAnimator, this.mViewPortHandler);
        this.mYAxisRenderer = new YAxisRendererRadarChart(this.mViewPortHandler, this.mYAxis, this);
        this.mXAxisRenderer = new XAxisRendererRadarChart(this.mViewPortHandler, this.mXAxis, this);
    }

    @Override // com.github.mikephil.chartingv2.charts.PieRadarChartBase, com.github.mikephil.chartingv2.charts.Chart
    public void notifyDataSetChanged() {
        if (this.mData == 0) {
            return;
        }
        calcMinMax();
        YAxisRendererRadarChart yAxisRendererRadarChart = this.mYAxisRenderer;
        YAxis yAxis = this.mYAxis;
        yAxisRendererRadarChart.computeAxis(yAxis.mAxisMinimum, yAxis.mAxisMaximum);
        this.mXAxisRenderer.computeAxis(((RadarData) this.mData).getXValMaximumLength(), ((RadarData) this.mData).getXVals());
        Legend legend = this.mLegend;
        if (legend != null && !legend.isLegendCustom()) {
            this.mLegendRenderer.computeLegend(this.mData);
        }
        calculateOffsets();
    }

    @Override // com.github.mikephil.chartingv2.charts.Chart, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.mData == 0) {
            return;
        }
        this.mXAxisRenderer.renderAxisLabels(canvas);
        if (this.mDrawWeb) {
            this.mRenderer.drawExtras(canvas);
        }
        this.mYAxisRenderer.renderLimitLines(canvas);
        this.mRenderer.drawData(canvas);
        if (valuesToHighlight()) {
            this.mRenderer.drawHighlighted(canvas, this.mIndicesToHighlight);
        }
        this.mYAxisRenderer.renderAxisLabels(canvas);
        this.mRenderer.drawValues(canvas);
        this.mLegendRenderer.renderLegend(canvas);
        drawDescription(canvas);
        drawMarkers(canvas);
    }

    public void setDrawWeb(boolean z14) {
        this.mDrawWeb = z14;
    }

    public void setSkipWebLineCount(int i14) {
        this.mSkipWebLineCount = Math.max(0, i14);
    }

    public void setWebAlpha(int i14) {
        this.mWebAlpha = i14;
    }

    public void setWebColor(int i14) {
        this.mWebColor = i14;
    }

    public void setWebColorInner(int i14) {
        this.mWebColorInner = i14;
    }

    public void setWebLineWidth(float f14) {
        this.mWebLineWidth = Utils.convertDpToPixel(f14);
    }

    public void setWebLineWidthInner(float f14) {
        this.mInnerWebLineWidth = Utils.convertDpToPixel(f14);
    }

    public RadarChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mWebLineWidth = 2.5f;
        this.mInnerWebLineWidth = 1.5f;
        this.mWebColor = Color.rgb(122, 122, 122);
        this.mWebColorInner = Color.rgb(122, 122, 122);
        this.mWebAlpha = 150;
        this.mDrawWeb = true;
        this.mSkipWebLineCount = 0;
    }

    public RadarChart(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
        this.mWebLineWidth = 2.5f;
        this.mInnerWebLineWidth = 1.5f;
        this.mWebColor = Color.rgb(122, 122, 122);
        this.mWebColorInner = Color.rgb(122, 122, 122);
        this.mWebAlpha = 150;
        this.mDrawWeb = true;
        this.mSkipWebLineCount = 0;
    }
}
