package com.xiaomi.fitness.chart.mpchart.sleepchart;

import android.app.Application;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.xiaomi.fitness.chart.entrys.SleepItemEntry;
import com.xiaomi.fitness.common.utils.AppUtil;
import defpackage.g4j;
import defpackage.gpc;
import defpackage.pim;
import defpackage.qzi;
import defpackage.uim;
import defpackage.w02;

/* JADX INFO: loaded from: classes7.dex */
public class SleepChart extends BarChart {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public pim f11774a;

    public SleepChart(Context context) {
        this(context, null);
    }

    private void setXY() {
        XAxis xAxis = getXAxis();
        xAxis.setAxisMinimum(0.0f);
        xAxis.setEnabled(false);
        YAxis axisRight = getAxisRight();
        axisRight.setAxisMinimum(0.0f);
        axisRight.setAxisMaximum(4.0f);
        axisRight.setEnabled(false);
        YAxis axisLeft = getAxisLeft();
        axisLeft.setAxisMinimum(0.0f);
        axisLeft.setAxisMaximum(4.0f);
        axisLeft.setEnabled(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.mikephil.charting.charts.BarChart, com.github.mikephil.charting.charts.BarLineChartBase, com.github.mikephil.charting.charts.Chart
    public void calcMinMax() {
        gpc gpcVar = (gpc) ((w02) this.mData).i(0);
        if (gpcVar.O0() <= 0) {
            super.calcMinMax();
            return;
        }
        this.mXAxis.calculate(((w02) this.mData).s(), ((w02) this.mData).r() + ((SleepItemEntry) gpcVar.i(gpcVar.O0() - 1)).f11764a.e);
        YAxis yAxis = this.mAxisLeft;
        w02 w02Var = (w02) this.mData;
        YAxis.AxisDependency axisDependency = YAxis.AxisDependency.LEFT;
        yAxis.calculate(w02Var.w(axisDependency), ((w02) this.mData).u(axisDependency));
        YAxis yAxis2 = this.mAxisRight;
        w02 w02Var2 = (w02) this.mData;
        YAxis.AxisDependency axisDependency2 = YAxis.AxisDependency.RIGHT;
        yAxis2.calculate(w02Var2.w(axisDependency2), ((w02) this.mData).u(axisDependency2));
    }

    @Override // com.github.mikephil.charting.charts.BarChart, com.github.mikephil.charting.charts.BarLineChartBase, com.github.mikephil.charting.charts.Chart
    public void init() {
        super.init();
        this.mRenderer = new uim(this, this.mAnimator, this.mViewPortHandler);
    }

    public final void initLineChart() {
        Application app = AppUtil.getApp();
        setMinOffset(0.0f);
        setExtraOffsets(0.0f, 0.0f, 0.0f, 0.0f);
        setDrawGridBackground(false);
        getDescription().setEnabled(false);
        setTouchEnabled(true);
        setDrawBorders(false);
        setDragEnabled(false);
        setScaleEnabled(false);
        setPinchZoom(true);
        setDrawMarkers(false);
        setNoDataText(app.getString(qzi.common_data_empty));
        getLegend().setEnabled(false);
        setXY();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        initLineChart();
    }

    public SleepChart(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SleepChart(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g4j.l4);
        if (this.f11774a == null) {
            this.f11774a = new pim();
        }
        this.f11774a.f30436k = typedArrayObtainStyledAttributes.getInteger(g4j.m4, 0);
        typedArrayObtainStyledAttributes.recycle();
    }
}
