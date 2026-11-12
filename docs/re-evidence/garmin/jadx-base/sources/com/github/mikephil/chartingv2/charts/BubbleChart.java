package com.github.mikephil.chartingv2.charts;

import android.content.Context;
import android.util.AttributeSet;
import com.github.mikephil.chartingv2.components.XAxis;
import com.github.mikephil.chartingv2.data.BubbleData;
import com.github.mikephil.chartingv2.interfaces.dataprovider.BubbleDataProvider;
import com.github.mikephil.chartingv2.renderer.BubbleChartRenderer;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated
public class BubbleChart extends BarLineChartBase<BubbleData> implements BubbleDataProvider {
    public BubbleChart(Context context) {
        super(context);
    }

    @Override // com.github.mikephil.chartingv2.charts.BarLineChartBase, com.github.mikephil.chartingv2.charts.Chart
    public void calcMinMax() {
        super.calcMinMax();
        if (this.mXAxis.mAxisRange == 0.0f && ((BubbleData) this.mData).getYValCount() > 0) {
            this.mXAxis.mAxisRange = 1.0f;
        }
        XAxis xAxis = this.mXAxis;
        xAxis.mAxisMinimum = -0.5f;
        xAxis.mAxisMaximum = ((BubbleData) this.mData).getXValCount() - 0.5f;
        if (this.mRenderer != null) {
            for (T t7 : ((BubbleData) this.mData).getDataSets()) {
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
        XAxis xAxis3 = this.mXAxis;
        xAxis3.mAxisRange = Math.abs(xAxis3.mAxisMaximum - xAxis3.mAxisMinimum);
    }

    @Override // com.github.mikephil.chartingv2.interfaces.dataprovider.BubbleDataProvider
    public BubbleData getBubbleData() {
        return (BubbleData) this.mData;
    }

    @Override // com.github.mikephil.chartingv2.charts.BarLineChartBase, com.github.mikephil.chartingv2.charts.Chart
    public void init() {
        super.init();
        this.mRenderer = new BubbleChartRenderer(this, this.mAnimator, this.mViewPortHandler);
    }

    public BubbleChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BubbleChart(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
    }
}
