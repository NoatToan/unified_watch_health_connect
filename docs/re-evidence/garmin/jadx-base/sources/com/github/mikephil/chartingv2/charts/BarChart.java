package com.github.mikephil.chartingv2.charts;

import android.content.Context;
import android.graphics.RectF;
import android.util.AttributeSet;
import com.github.mikephil.chartingv2.components.XAxis;
import com.github.mikephil.chartingv2.components.YAxis;
import com.github.mikephil.chartingv2.data.BarData;
import com.github.mikephil.chartingv2.data.BarEntry;
import com.github.mikephil.chartingv2.highlight.BarHighlighter;
import com.github.mikephil.chartingv2.highlight.Highlight;
import com.github.mikephil.chartingv2.interfaces.dataprovider.BarDataProvider;
import com.github.mikephil.chartingv2.interfaces.datasets.IBarDataSet;
import com.github.mikephil.chartingv2.renderer.BarChartRenderer;
import com.github.mikephil.chartingv2.renderer.XAxisRendererBarChart;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated
public class BarChart extends BarLineChartBase<BarData> implements BarDataProvider {
    private boolean mDrawBarShadow;
    private boolean mDrawHighlightArrow;
    private boolean mDrawValueAboveBar;

    public BarChart(Context context) {
        super(context);
        this.mDrawHighlightArrow = false;
        this.mDrawValueAboveBar = true;
        this.mDrawBarShadow = false;
    }

    @Override // com.github.mikephil.chartingv2.charts.BarLineChartBase, com.github.mikephil.chartingv2.charts.Chart
    public void calcMinMax() {
        super.calcMinMax();
        XAxis xAxis = this.mXAxis;
        float f14 = xAxis.mAxisRange + 0.5f;
        xAxis.mAxisRange = f14;
        xAxis.mAxisRange = f14 * ((BarData) this.mData).getDataSetCount();
        float groupSpace = ((BarData) this.mData).getGroupSpace();
        XAxis xAxis2 = this.mXAxis;
        xAxis2.mAxisRange = (((BarData) this.mData).getXValCount() * groupSpace) + xAxis2.mAxisRange;
        XAxis xAxis3 = this.mXAxis;
        xAxis3.mAxisMaximum = xAxis3.mAxisRange - xAxis3.mAxisMinimum;
    }

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
        RectF rectF = new RectF(f15, f17, f16, val);
        getTransformer(iBarDataSet.getAxisDependency()).rectValueToPixel(rectF);
        return rectF;
    }

    @Override // com.github.mikephil.chartingv2.interfaces.dataprovider.BarDataProvider
    public BarData getBarData() {
        return (BarData) this.mData;
    }

    @Override // com.github.mikephil.chartingv2.charts.BarLineChartBase, com.github.mikephil.chartingv2.interfaces.dataprovider.BarLineScatterCandleBubbleDataProvider
    public int getHighestVisibleXIndex() {
        float dataSetCount = ((BarData) this.mData).getDataSetCount();
        float groupSpace = dataSetCount > 1.0f ? ((BarData) this.mData).getGroupSpace() + dataSetCount : 1.0f;
        float[] fArr = {this.mViewPortHandler.contentRight(), this.mViewPortHandler.contentBottom()};
        getTransformer(YAxis.AxisDependency.LEFT).pixelsToValue(fArr);
        return (int) ((fArr[0] >= getXChartMax() ? getXChartMax() : fArr[0]) / groupSpace);
    }

    @Override // com.github.mikephil.chartingv2.charts.BarLineChartBase
    public Highlight getHighlightByTouchPoint(float f14, float f15) {
        if (this.mData == 0) {
            return null;
        }
        return getHighlighter().getHighlight(f14, f15);
    }

    @Override // com.github.mikephil.chartingv2.charts.BarLineChartBase, com.github.mikephil.chartingv2.interfaces.dataprovider.BarLineScatterCandleBubbleDataProvider
    public int getLowestVisibleXIndex() {
        float dataSetCount = ((BarData) this.mData).getDataSetCount();
        float groupSpace = dataSetCount <= 1.0f ? 1.0f : ((BarData) this.mData).getGroupSpace() + dataSetCount;
        float[] fArr = {this.mViewPortHandler.contentLeft(), this.mViewPortHandler.contentBottom()};
        getTransformer(YAxis.AxisDependency.LEFT).pixelsToValue(fArr);
        return (int) (fArr[0] <= getXChartMin() ? 0.0f : (fArr[0] / groupSpace) + 1.0f);
    }

    @Override // com.github.mikephil.chartingv2.charts.BarLineChartBase, com.github.mikephil.chartingv2.charts.Chart
    public void init() {
        super.init();
        this.mRenderer = new BarChartRenderer(this, this.mAnimator, this.mViewPortHandler);
        this.mXAxisRenderer = new XAxisRendererBarChart(this.mViewPortHandler, this.mXAxis, this.mLeftAxisTransformer, this);
        setHighlighter(new BarHighlighter(this));
        this.mXAxis.mAxisMinimum = -0.5f;
    }

    @Override // com.github.mikephil.chartingv2.interfaces.dataprovider.BarDataProvider
    public boolean isDrawBarShadowEnabled() {
        return this.mDrawBarShadow;
    }

    @Override // com.github.mikephil.chartingv2.interfaces.dataprovider.BarDataProvider
    public boolean isDrawHighlightArrowEnabled() {
        return this.mDrawHighlightArrow;
    }

    @Override // com.github.mikephil.chartingv2.interfaces.dataprovider.BarDataProvider
    public boolean isDrawValueAboveBarEnabled() {
        return this.mDrawValueAboveBar;
    }

    public void setDrawBarShadow(boolean z14) {
        this.mDrawBarShadow = z14;
    }

    public void setDrawHighlightArrow(boolean z14) {
        this.mDrawHighlightArrow = z14;
    }

    public void setDrawValueAboveBar(boolean z14) {
        this.mDrawValueAboveBar = z14;
    }

    public BarChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mDrawHighlightArrow = false;
        this.mDrawValueAboveBar = true;
        this.mDrawBarShadow = false;
    }

    public BarChart(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
        this.mDrawHighlightArrow = false;
        this.mDrawValueAboveBar = true;
        this.mDrawBarShadow = false;
    }
}
