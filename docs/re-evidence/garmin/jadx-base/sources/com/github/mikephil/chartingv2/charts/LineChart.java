package com.github.mikephil.chartingv2.charts;

import android.content.Context;
import android.util.AttributeSet;
import com.github.mikephil.chartingv2.data.LineData;
import com.github.mikephil.chartingv2.interfaces.dataprovider.LineDataProvider;
import com.github.mikephil.chartingv2.renderer.DataRenderer;
import com.github.mikephil.chartingv2.renderer.LineChartRenderer;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated
public class LineChart extends BarLineChartBase<LineData> implements LineDataProvider {
    public LineChart(Context context) {
        super(context);
    }

    @Override // com.github.mikephil.chartingv2.charts.BarLineChartBase, com.github.mikephil.chartingv2.charts.Chart
    public void calcMinMax() {
        super.calcMinMax();
        if (this.mXAxis.mAxisRange != 0.0f || ((LineData) this.mData).getYValCount() <= 0) {
            return;
        }
        this.mXAxis.mAxisRange = 1.0f;
    }

    @Override // com.github.mikephil.chartingv2.interfaces.dataprovider.LineDataProvider
    public LineData getLineData() {
        return (LineData) this.mData;
    }

    @Override // com.github.mikephil.chartingv2.charts.BarLineChartBase, com.github.mikephil.chartingv2.charts.Chart
    public void init() {
        super.init();
        this.mRenderer = new LineChartRenderer(this, this.mAnimator, this.mViewPortHandler);
    }

    @Override // com.github.mikephil.chartingv2.charts.Chart, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        DataRenderer dataRenderer = this.mRenderer;
        if (dataRenderer != null && (dataRenderer instanceof LineChartRenderer)) {
            ((LineChartRenderer) dataRenderer).releaseBitmap();
        }
        super.onDetachedFromWindow();
    }

    public LineChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LineChart(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
    }
}
