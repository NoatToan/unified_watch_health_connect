package com.github.mikephil.chartingv2.charts;

import android.content.Context;
import android.util.AttributeSet;
import com.github.mikephil.chartingv2.components.XAxis;
import com.github.mikephil.chartingv2.data.CandleData;
import com.github.mikephil.chartingv2.interfaces.dataprovider.CandleDataProvider;
import com.github.mikephil.chartingv2.renderer.CandleStickChartRenderer;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated
public class CandleStickChart extends BarLineChartBase<CandleData> implements CandleDataProvider {
    public CandleStickChart(Context context) {
        super(context);
    }

    @Override // com.github.mikephil.chartingv2.charts.BarLineChartBase, com.github.mikephil.chartingv2.charts.Chart
    public void calcMinMax() {
        super.calcMinMax();
        XAxis xAxis = this.mXAxis;
        float f14 = xAxis.mAxisMaximum + 0.5f;
        xAxis.mAxisMaximum = f14;
        xAxis.mAxisRange = Math.abs(f14 - xAxis.mAxisMinimum);
    }

    @Override // com.github.mikephil.chartingv2.interfaces.dataprovider.CandleDataProvider
    public CandleData getCandleData() {
        return (CandleData) this.mData;
    }

    @Override // com.github.mikephil.chartingv2.charts.BarLineChartBase, com.github.mikephil.chartingv2.charts.Chart
    public void init() {
        super.init();
        this.mRenderer = new CandleStickChartRenderer(this, this.mAnimator, this.mViewPortHandler);
        this.mXAxis.mAxisMinimum = -0.5f;
    }

    public CandleStickChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CandleStickChart(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
    }
}
