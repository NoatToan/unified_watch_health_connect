package com.github.mikephil.chartingv2.charts;

import android.content.Context;
import android.util.AttributeSet;
import com.github.mikephil.chartingv2.components.XAxis;
import com.github.mikephil.chartingv2.data.ScatterData;
import com.github.mikephil.chartingv2.interfaces.dataprovider.ScatterDataProvider;
import com.github.mikephil.chartingv2.renderer.ScatterChartRenderer;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated
public class ScatterChart extends BarLineChartBase<ScatterData> implements ScatterDataProvider {

    public enum ScatterShape {
        SQUARE,
        CIRCLE,
        TRIANGLE,
        CROSS,
        X
    }

    public ScatterChart(Context context) {
        super(context);
    }

    public static ScatterShape[] getAllPossibleShapes() {
        return new ScatterShape[]{ScatterShape.SQUARE, ScatterShape.CIRCLE, ScatterShape.TRIANGLE, ScatterShape.CROSS};
    }

    @Override // com.github.mikephil.chartingv2.charts.BarLineChartBase, com.github.mikephil.chartingv2.charts.Chart
    public void calcMinMax() {
        super.calcMinMax();
        if (this.mXAxis.mAxisRange == 0.0f && ((ScatterData) this.mData).getYValCount() > 0) {
            this.mXAxis.mAxisRange = 1.0f;
        }
        XAxis xAxis = this.mXAxis;
        float f14 = xAxis.mAxisMaximum + 0.5f;
        xAxis.mAxisMaximum = f14;
        xAxis.mAxisRange = Math.abs(f14 - xAxis.mAxisMinimum);
    }

    @Override // com.github.mikephil.chartingv2.interfaces.dataprovider.ScatterDataProvider
    public ScatterData getScatterData() {
        return (ScatterData) this.mData;
    }

    @Override // com.github.mikephil.chartingv2.charts.BarLineChartBase, com.github.mikephil.chartingv2.charts.Chart
    public void init() {
        super.init();
        this.mRenderer = new ScatterChartRenderer(this, this.mAnimator, this.mViewPortHandler);
        this.mXAxis.mAxisMinimum = -0.5f;
    }

    public ScatterChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ScatterChart(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
    }
}
