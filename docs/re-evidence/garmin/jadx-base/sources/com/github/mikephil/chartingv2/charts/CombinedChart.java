package com.github.mikephil.chartingv2.charts;

import android.content.Context;
import android.util.AttributeSet;
import com.github.mikephil.chartingv2.components.XAxis;
import com.github.mikephil.chartingv2.data.BarData;
import com.github.mikephil.chartingv2.data.BubbleData;
import com.github.mikephil.chartingv2.data.CandleData;
import com.github.mikephil.chartingv2.data.CombinedData;
import com.github.mikephil.chartingv2.data.LineData;
import com.github.mikephil.chartingv2.data.ScatterData;
import com.github.mikephil.chartingv2.highlight.CombinedHighlighter;
import com.github.mikephil.chartingv2.interfaces.dataprovider.BarDataProvider;
import com.github.mikephil.chartingv2.interfaces.dataprovider.BubbleDataProvider;
import com.github.mikephil.chartingv2.interfaces.dataprovider.CandleDataProvider;
import com.github.mikephil.chartingv2.interfaces.dataprovider.LineDataProvider;
import com.github.mikephil.chartingv2.interfaces.dataprovider.ScatterDataProvider;
import com.github.mikephil.chartingv2.renderer.CombinedChartRenderer;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated
public class CombinedChart extends BarLineChartBase<CombinedData> implements LineDataProvider, BarDataProvider, ScatterDataProvider, CandleDataProvider, BubbleDataProvider {
    private boolean mDrawBarShadow;
    private boolean mDrawHighlightArrow;
    protected DrawOrder[] mDrawOrder;
    private boolean mDrawValueAboveBar;

    public enum DrawOrder {
        BAR,
        BUBBLE,
        LINE,
        CANDLE,
        SCATTER
    }

    public CombinedChart(Context context) {
        super(context);
        this.mDrawHighlightArrow = false;
        this.mDrawValueAboveBar = true;
        this.mDrawBarShadow = false;
        this.mDrawOrder = new DrawOrder[]{DrawOrder.BAR, DrawOrder.BUBBLE, DrawOrder.LINE, DrawOrder.CANDLE, DrawOrder.SCATTER};
    }

    @Override // com.github.mikephil.chartingv2.charts.BarLineChartBase, com.github.mikephil.chartingv2.charts.Chart
    public void calcMinMax() {
        super.calcMinMax();
        if (getBarData() != null || getCandleData() != null || getBubbleData() != null) {
            XAxis xAxis = this.mXAxis;
            xAxis.mAxisMinimum = -0.5f;
            xAxis.mAxisMaximum = ((CombinedData) this.mData).getXVals().size() - 0.5f;
            if (getBubbleData() != null) {
                for (T t7 : getBubbleData().getDataSets()) {
                    float xMin = t7.getXMin();
                    float xMax = t7.getXMax();
                    XAxis xAxis2 = this.mXAxis;
                    if (xMin < xAxis2.mAxisMinimum) {
                        xAxis2.mAxisMinimum = xMin;
                    }
                    if (xMax > xAxis2.mAxisMaximum) {
                        xAxis2.mAxisMaximum = xMax;
                    }
                }
            }
        }
        XAxis xAxis3 = this.mXAxis;
        xAxis3.mAxisRange = Math.abs(xAxis3.mAxisMaximum - xAxis3.mAxisMinimum);
        if (this.mXAxis.mAxisRange != 0.0f || getLineData() == null || getLineData().getYValCount() <= 0) {
            return;
        }
        this.mXAxis.mAxisRange = 1.0f;
    }

    @Override // com.github.mikephil.chartingv2.interfaces.dataprovider.BarDataProvider
    public BarData getBarData() {
        T t7 = this.mData;
        if (t7 == 0) {
            return null;
        }
        return ((CombinedData) t7).getBarData();
    }

    @Override // com.github.mikephil.chartingv2.interfaces.dataprovider.BubbleDataProvider
    public BubbleData getBubbleData() {
        T t7 = this.mData;
        if (t7 == 0) {
            return null;
        }
        return ((CombinedData) t7).getBubbleData();
    }

    @Override // com.github.mikephil.chartingv2.interfaces.dataprovider.CandleDataProvider
    public CandleData getCandleData() {
        T t7 = this.mData;
        if (t7 == 0) {
            return null;
        }
        return ((CombinedData) t7).getCandleData();
    }

    public DrawOrder[] getDrawOrder() {
        return this.mDrawOrder;
    }

    @Override // com.github.mikephil.chartingv2.interfaces.dataprovider.LineDataProvider
    public LineData getLineData() {
        T t7 = this.mData;
        if (t7 == 0) {
            return null;
        }
        return ((CombinedData) t7).getLineData();
    }

    @Override // com.github.mikephil.chartingv2.interfaces.dataprovider.ScatterDataProvider
    public ScatterData getScatterData() {
        T t7 = this.mData;
        if (t7 == 0) {
            return null;
        }
        return ((CombinedData) t7).getScatterData();
    }

    @Override // com.github.mikephil.chartingv2.charts.BarLineChartBase, com.github.mikephil.chartingv2.charts.Chart
    public void init() {
        super.init();
        setHighlighter(new CombinedHighlighter(this));
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

    @Override // com.github.mikephil.chartingv2.charts.Chart
    public void setData(CombinedData combinedData) {
        this.mData = null;
        this.mRenderer = null;
        super.setData(combinedData);
        CombinedChartRenderer combinedChartRenderer = new CombinedChartRenderer(this, this.mAnimator, this.mViewPortHandler);
        this.mRenderer = combinedChartRenderer;
        combinedChartRenderer.initBuffers();
    }

    public void setDrawBarShadow(boolean z14) {
        this.mDrawBarShadow = z14;
    }

    public void setDrawHighlightArrow(boolean z14) {
        this.mDrawHighlightArrow = z14;
    }

    public void setDrawOrder(DrawOrder[] drawOrderArr) {
        if (drawOrderArr == null || drawOrderArr.length <= 0) {
            return;
        }
        this.mDrawOrder = drawOrderArr;
    }

    public void setDrawValueAboveBar(boolean z14) {
        this.mDrawValueAboveBar = z14;
    }

    public CombinedChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mDrawHighlightArrow = false;
        this.mDrawValueAboveBar = true;
        this.mDrawBarShadow = false;
        this.mDrawOrder = new DrawOrder[]{DrawOrder.BAR, DrawOrder.BUBBLE, DrawOrder.LINE, DrawOrder.CANDLE, DrawOrder.SCATTER};
    }

    public CombinedChart(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
        this.mDrawHighlightArrow = false;
        this.mDrawValueAboveBar = true;
        this.mDrawBarShadow = false;
        this.mDrawOrder = new DrawOrder[]{DrawOrder.BAR, DrawOrder.BUBBLE, DrawOrder.LINE, DrawOrder.CANDLE, DrawOrder.SCATTER};
    }
}
