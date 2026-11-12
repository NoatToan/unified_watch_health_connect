package com.xiaomi.fitness.chart.mpchart.barchart;

import android.content.Context;
import android.util.AttributeSet;
import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.chart.entrys.SleepEntry;
import defpackage.du3;
import defpackage.id5;
import defpackage.jd5;
import defpackage.kd5;
import defpackage.qzi;
import defpackage.w02;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class CustomBarChart<T extends RecyclerBarEntry> extends BarChart {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public id5 f11773a;

    public CustomBarChart(Context context) {
        super(context);
    }

    private <K extends RecyclerBarEntry> void setYmaxValue(List<K> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        float y = list.get(0).getY();
        for (int i = 0; i < list.size(); i++) {
            y = Math.max(y, list.get(i).getY());
        }
        if (y == 0.0f) {
            y = 1.0f;
        }
        getAxisLeft().setAxisMaximum(y);
        getAxisRight().setAxisMaximum(y);
    }

    public void a() {
        d();
        setDrawMarkers(false);
        getDescription().setEnabled(false);
        setTouchEnabled(false);
        setDrawGridBackground(false);
        setNoDataText(getContext().getString(qzi.common_data_empty));
        setDragEnabled(false);
        setScaleEnabled(false);
        setPinchZoom(false);
        setClickable(false);
        getDescription().setEnabled(false);
        getLegend().setEnabled(false);
        setXY();
    }

    public void b(int i, float f, int i2, float f2) {
        id5 id5Var = this.f11773a;
        id5Var.s = i;
        id5Var.m = f;
        id5Var.t = i2;
        id5Var.l = f2;
        a();
    }

    public void c(Context context, int i, int i2) {
        this.f11773a.o = context.getColor(i);
        this.f11773a.q = context.getColor(i2);
    }

    public void d() {
        setMinOffset(0.0f);
        setExtraOffsets(0.0f, 0.0f, 0.0f, 0.0f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <K extends RecyclerBarEntry> void e(List<K> list, float f, float f2) {
        getAxisLeft().setAxisMaximum(f);
        getAxisRight().setAxisMaximum(f);
        getAxisLeft().setAxisMinimum(f2);
        getAxisRight().setAxisMinimum(f2);
        if (getData() == null || ((w02) getData()).j() <= 0) {
            kd5 kd5Var = new kd5(list, "Data Set");
            kd5Var.Y0(false);
            kd5Var.V0(this.f11773a.o);
            ArrayList arrayList = new ArrayList();
            arrayList.add(kd5Var);
            w02 w02Var = new w02(arrayList);
            w02Var.B(this.f11773a.l);
            setData(w02Var);
            setFitBars(true);
        } else {
            ((kd5) ((w02) getData()).i(0)).i1(list);
            ((w02) getData()).x();
            notifyDataSetChanged();
        }
        invalidate();
    }

    public id5 getAttribute() {
        return this.f11773a;
    }

    @Override // com.github.mikephil.charting.charts.BarChart, com.github.mikephil.charting.charts.BarLineChartBase, com.github.mikephil.charting.charts.Chart
    public void init() {
        super.init();
        this.mRenderer = new jd5(this, this.mAnimator, this.mViewPortHandler);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        a();
    }

    public void setBarChartType(int i) {
        this.f11773a.t = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <K extends RecyclerBarEntry> void setEntryData(List<K> list) {
        setYmaxValue(list);
        getAxisLeft().setAxisMinimum(0.0f);
        getAxisRight().setAxisMinimum(0.0f);
        if (getData() == null || ((w02) getData()).j() <= 0) {
            kd5 kd5Var = new kd5(list, "Data Set");
            kd5Var.Y0(false);
            kd5Var.V0(this.f11773a.o);
            ArrayList arrayList = new ArrayList();
            arrayList.add(kd5Var);
            w02 w02Var = new w02(arrayList);
            w02Var.B(this.f11773a.l);
            setData(w02Var);
            setFitBars(true);
        } else {
            ((kd5) ((w02) getData()).i(0)).i1(list);
            ((w02) getData()).x();
            notifyDataSetChanged();
        }
        invalidate();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setSleepEntryData(List<SleepEntry> list) {
        if (getData() == null || ((w02) getData()).j() <= 0) {
            kd5 kd5Var = new kd5(list, "Data Set");
            kd5Var.Y0(false);
            ArrayList arrayList = new ArrayList();
            arrayList.add(kd5Var);
            w02 w02Var = new w02(arrayList);
            w02Var.B(this.f11773a.l);
            setData(w02Var);
            setFitBars(true);
        } else {
            ((kd5) ((w02) getData()).i(0)).i1(list);
            ((w02) getData()).x();
            notifyDataSetChanged();
        }
        invalidate();
    }

    public void setXY() {
        YAxis axisLeft = getAxisLeft();
        YAxis axisRight = getAxisRight();
        XAxis xAxis = getXAxis();
        xAxis.setAxisMinimum(-0.5f);
        xAxis.setAxisMaximum(this.f11773a.s + 0.5f);
        xAxis.setDrawLabels(false);
        xAxis.setDrawAxisLine(false);
        xAxis.setDrawGridLines(false);
        axisLeft.setEnabled(false);
        axisLeft.setDrawAxisLine(false);
        axisLeft.setDrawGridLines(false);
        axisLeft.setDrawLabels(false);
        axisRight.setEnabled(false);
        axisRight.setDrawAxisLine(false);
        axisRight.setDrawGridLines(false);
        axisRight.setDrawLabels(false);
    }

    public CustomBarChart(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CustomBarChart(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f11773a = du3.d(context, attributeSet);
    }
}
