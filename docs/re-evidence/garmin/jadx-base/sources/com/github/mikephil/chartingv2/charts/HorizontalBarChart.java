package com.github.mikephil.chartingv2.charts;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.RectF;
import android.util.AttributeSet;
import com.github.mikephil.chartingv2.components.Legend;
import com.github.mikephil.chartingv2.components.XAxis;
import com.github.mikephil.chartingv2.components.YAxis;
import com.github.mikephil.chartingv2.data.BarData;
import com.github.mikephil.chartingv2.data.BarEntry;
import com.github.mikephil.chartingv2.data.Entry;
import com.github.mikephil.chartingv2.highlight.Highlight;
import com.github.mikephil.chartingv2.highlight.HorizontalBarHighlighter;
import com.github.mikephil.chartingv2.interfaces.datasets.IBarDataSet;
import com.github.mikephil.chartingv2.renderer.HorizontalBarChartRenderer;
import com.github.mikephil.chartingv2.renderer.XAxisRendererHorizontalBarChart;
import com.github.mikephil.chartingv2.renderer.YAxisRendererHorizontalBarChart;
import com.github.mikephil.chartingv2.utils.Transformer;
import com.github.mikephil.chartingv2.utils.TransformerHorizontalBarChart;
import com.github.mikephil.chartingv2.utils.Utils;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated
public class HorizontalBarChart extends BarChart {
    public HorizontalBarChart(Context context) {
        super(context);
    }

    @Override // com.github.mikephil.chartingv2.charts.BarLineChartBase
    public void calcModulus() {
        float[] fArr = new float[9];
        this.mViewPortHandler.getMatrixTouch().getValues(fArr);
        this.mXAxis.mAxisLabelModulus = (int) Math.ceil((((BarData) this.mData).getXValCount() * this.mXAxis.mLabelRotatedHeight) / (this.mViewPortHandler.contentHeight() * fArr[4]));
        XAxis xAxis = this.mXAxis;
        if (xAxis.mAxisLabelModulus < 1) {
            xAxis.mAxisLabelModulus = 1;
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00f4  */
    @Override // com.github.mikephil.chartingv2.charts.BarLineChartBase, com.github.mikephil.chartingv2.charts.Chart
    public void calculateOffsets() {
        float requiredHeightSpace;
        float xOffset;
        float xOffset2;
        Legend legend = this.mLegend;
        float requiredHeightSpace2 = 0.0f;
        if (legend == null || !legend.isEnabled()) {
            requiredHeightSpace = 0.0f;
            xOffset = 0.0f;
            xOffset2 = xOffset;
        } else if (this.mLegend.getPosition() == Legend.LegendPosition.RIGHT_OF_CHART || this.mLegend.getPosition() == Legend.LegendPosition.RIGHT_OF_CHART_CENTER) {
            requiredHeightSpace = 0.0f;
            xOffset2 = (this.mLegend.getXOffset() * 2.0f) + Math.min(this.mLegend.mNeededWidth, this.mLegend.getMaxSizePercent() * this.mViewPortHandler.getChartWidth()) + 0.0f;
            xOffset = 0.0f;
        } else if (this.mLegend.getPosition() == Legend.LegendPosition.LEFT_OF_CHART || this.mLegend.getPosition() == Legend.LegendPosition.LEFT_OF_CHART_CENTER) {
            xOffset = (this.mLegend.getXOffset() * 2.0f) + Math.min(this.mLegend.mNeededWidth, this.mLegend.getMaxSizePercent() * this.mViewPortHandler.getChartWidth()) + 0.0f;
            requiredHeightSpace = 0.0f;
            xOffset2 = 0.0f;
        } else if (this.mLegend.getPosition() == Legend.LegendPosition.BELOW_CHART_LEFT || this.mLegend.getPosition() == Legend.LegendPosition.BELOW_CHART_RIGHT || this.mLegend.getPosition() == Legend.LegendPosition.BELOW_CHART_CENTER) {
            Legend legend2 = this.mLegend;
            requiredHeightSpace = Math.min(legend2.mNeededHeight + legend2.mTextHeightMax, this.mLegend.getMaxSizePercent() * this.mViewPortHandler.getChartHeight()) + 0.0f;
            xOffset = 0.0f;
            xOffset2 = xOffset;
        } else if (this.mLegend.getPosition() == Legend.LegendPosition.ABOVE_CHART_LEFT || this.mLegend.getPosition() == Legend.LegendPosition.ABOVE_CHART_RIGHT || this.mLegend.getPosition() == Legend.LegendPosition.ABOVE_CHART_CENTER) {
            Legend legend3 = this.mLegend;
            xOffset = 0.0f;
            xOffset2 = 0.0f;
            requiredHeightSpace2 = Math.min(legend3.mNeededHeight + (legend3.mTextHeightMax * 2.0f), this.mLegend.getMaxSizePercent() * this.mViewPortHandler.getChartHeight()) + 0.0f;
            requiredHeightSpace = 0.0f;
        } else {
            requiredHeightSpace = 0.0f;
            xOffset = 0.0f;
            xOffset2 = xOffset;
        }
        if (this.mAxisLeft.needsOffset()) {
            requiredHeightSpace2 += this.mAxisLeft.getRequiredHeightSpace(this.mAxisRendererLeft.getPaintAxisLabels());
        }
        if (this.mAxisRight.needsOffset()) {
            requiredHeightSpace += this.mAxisRight.getRequiredHeightSpace(this.mAxisRendererRight.getPaintAxisLabels());
        }
        XAxis xAxis = this.mXAxis;
        float f14 = xAxis.mLabelRotatedWidth;
        if (xAxis.isEnabled()) {
            if (this.mXAxis.getPosition() == XAxis.XAxisPosition.BOTTOM) {
                xOffset += f14;
            } else if (this.mXAxis.getPosition() == XAxis.XAxisPosition.TOP) {
                xOffset2 += f14;
            } else if (this.mXAxis.getPosition() == XAxis.XAxisPosition.BOTH_SIDED) {
                xOffset += f14;
                xOffset2 += f14;
            }
        }
        float extraTopOffset = getExtraTopOffset() + requiredHeightSpace2;
        float extraRightOffset = getExtraRightOffset() + xOffset2;
        float extraBottomOffset = getExtraBottomOffset() + requiredHeightSpace;
        float extraLeftOffset = getExtraLeftOffset() + xOffset;
        float fConvertDpToPixel = Utils.convertDpToPixel(this.mMinOffset);
        this.mViewPortHandler.restrainViewPort(Math.max(fConvertDpToPixel, extraLeftOffset), Math.max(fConvertDpToPixel, extraTopOffset), Math.max(fConvertDpToPixel, extraRightOffset), Math.max(fConvertDpToPixel, extraBottomOffset));
        if (this.mLogEnabled) {
            this.mViewPortHandler.getContentRect().toString();
        }
        prepareOffsetMatrix();
        prepareValuePxMatrix();
    }

    @Override // com.github.mikephil.chartingv2.charts.BarChart
    public RectF getBarBounds(BarEntry barEntry) {
        IBarDataSet iBarDataSet = (IBarDataSet) ((BarData) this.mData).getDataSetForEntry(barEntry);
        if (iBarDataSet == null) {
            return null;
        }
        float barSpace = iBarDataSet.getBarSpace();
        float val = barEntry.getVal();
        float xIndex = barEntry.getXIndex();
        float f14 = barSpace / 2.0f;
        float f15 = (xIndex - 0.5f) + f14;
        float f16 = (xIndex + 0.5f) - f14;
        float f17 = val >= 0.0f ? val : 0.0f;
        if (val > 0.0f) {
            val = 0.0f;
        }
        RectF rectF = new RectF(f17, f15, val, f16);
        getTransformer(iBarDataSet.getAxisDependency()).rectValueToPixel(rectF);
        return rectF;
    }

    @Override // com.github.mikephil.chartingv2.charts.BarChart, com.github.mikephil.chartingv2.charts.BarLineChartBase, com.github.mikephil.chartingv2.interfaces.dataprovider.BarLineScatterCandleBubbleDataProvider
    public int getHighestVisibleXIndex() {
        float dataSetCount = ((BarData) this.mData).getDataSetCount();
        float groupSpace = dataSetCount > 1.0f ? ((BarData) this.mData).getGroupSpace() + dataSetCount : 1.0f;
        float[] fArr = {this.mViewPortHandler.contentLeft(), this.mViewPortHandler.contentTop()};
        getTransformer(YAxis.AxisDependency.LEFT).pixelsToValue(fArr);
        return (int) ((fArr[1] >= getXChartMax() ? getXChartMax() : fArr[1]) / groupSpace);
    }

    @Override // com.github.mikephil.chartingv2.charts.BarChart, com.github.mikephil.chartingv2.charts.BarLineChartBase
    public Highlight getHighlightByTouchPoint(float f14, float f15) {
        if (this.mData == 0) {
            return null;
        }
        return getHighlighter().getHighlight(f15, f14);
    }

    @Override // com.github.mikephil.chartingv2.charts.BarChart, com.github.mikephil.chartingv2.charts.BarLineChartBase, com.github.mikephil.chartingv2.interfaces.dataprovider.BarLineScatterCandleBubbleDataProvider
    public int getLowestVisibleXIndex() {
        float dataSetCount = ((BarData) this.mData).getDataSetCount();
        float groupSpace = dataSetCount <= 1.0f ? 1.0f : ((BarData) this.mData).getGroupSpace() + dataSetCount;
        float[] fArr = {this.mViewPortHandler.contentLeft(), this.mViewPortHandler.contentBottom()};
        getTransformer(YAxis.AxisDependency.LEFT).pixelsToValue(fArr);
        float f14 = fArr[1];
        return (int) ((f14 > 0.0f ? f14 / groupSpace : 0.0f) + 1.0f);
    }

    @Override // com.github.mikephil.chartingv2.charts.BarLineChartBase
    public PointF getPosition(Entry entry, YAxis.AxisDependency axisDependency) {
        if (entry == null) {
            return null;
        }
        float[] fArr = {entry.getVal(), entry.getXIndex()};
        getTransformer(axisDependency).pointValuesToPixel(fArr);
        return new PointF(fArr[0], fArr[1]);
    }

    @Override // com.github.mikephil.chartingv2.charts.BarChart, com.github.mikephil.chartingv2.charts.BarLineChartBase, com.github.mikephil.chartingv2.charts.Chart
    public void init() {
        super.init();
        this.mLeftAxisTransformer = new TransformerHorizontalBarChart(this.mViewPortHandler);
        this.mRightAxisTransformer = new TransformerHorizontalBarChart(this.mViewPortHandler);
        this.mRenderer = new HorizontalBarChartRenderer(this, this.mAnimator, this.mViewPortHandler);
        setHighlighter(new HorizontalBarHighlighter(this));
        this.mAxisRendererLeft = new YAxisRendererHorizontalBarChart(this.mViewPortHandler, this.mAxisLeft, this.mLeftAxisTransformer);
        this.mAxisRendererRight = new YAxisRendererHorizontalBarChart(this.mViewPortHandler, this.mAxisRight, this.mRightAxisTransformer);
        this.mXAxisRenderer = new XAxisRendererHorizontalBarChart(this.mViewPortHandler, this.mXAxis, this.mLeftAxisTransformer, this);
    }

    @Override // com.github.mikephil.chartingv2.charts.BarLineChartBase
    public void prepareValuePxMatrix() {
        Transformer transformer = this.mRightAxisTransformer;
        YAxis yAxis = this.mAxisRight;
        float f14 = yAxis.mAxisMinimum;
        float f15 = yAxis.mAxisRange;
        XAxis xAxis = this.mXAxis;
        transformer.prepareMatrixValuePx(f14, f15, xAxis.mAxisRange, xAxis.mAxisMinimum);
        Transformer transformer2 = this.mLeftAxisTransformer;
        YAxis yAxis2 = this.mAxisLeft;
        float f16 = yAxis2.mAxisMinimum;
        float f17 = yAxis2.mAxisRange;
        XAxis xAxis2 = this.mXAxis;
        transformer2.prepareMatrixValuePx(f16, f17, xAxis2.mAxisRange, xAxis2.mAxisMinimum);
    }

    public HorizontalBarChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public HorizontalBarChart(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
    }
}
