package com.huawei.ui.commonui.view.trackview;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.Description;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.R;
import defpackage.njy;
import defpackage.qrs;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class SleepLineChartHolder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f24020b;
    private Drawable d = null;
    private List<Integer> e = null;

    public SleepLineChartHolder(Context context) {
        if (context != null) {
            this.f24020b = context;
        }
    }

    public static class d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f24021b = true;

        public d c(boolean z) {
            this.f24021b = z;
            return this;
        }
    }

    public LineDataSet e(LineChart lineChart, d dVar) {
        if (lineChart == null || this.f24020b == null) {
            LogUtil.j("SleepLineChartHolder", "chart or mContext is null");
            return null;
        }
        ArrayList arrayList = new ArrayList(16);
        if (njy.e(this.e)) {
            LogUtil.j("SleepLineChartHolder", "environmentalList empty,return");
            return null;
        }
        for (int i = 0; i < this.e.size(); i++) {
            arrayList.add(new Entry(i, this.e.get(i).intValue()));
        }
        LineDataSet lineDataSet = new LineDataSet(arrayList, "单位dB");
        lineDataSet.setLineWidth(1.0f);
        lineDataSet.setDrawCircles(false);
        lineDataSet.setDrawValues(false);
        lineDataSet.setDrawFilled(true);
        lineDataSet.setColor(Color.argb(153, 19, 57, 252));
        Drawable drawable = this.f24020b.getResources().getDrawable(R.drawable.environmental_nosie_gradient_fill);
        this.d = drawable;
        lineDataSet.setFillDrawable(drawable);
        b(lineChart, dVar);
        c(lineChart, lineDataSet, dVar);
        return lineDataSet;
    }

    private void c(LineChart lineChart, LineDataSet lineDataSet, d dVar) {
        c(lineChart, dVar);
        c(lineChart, lineDataSet);
        e(lineChart);
    }

    private void c(LineChart lineChart, LineDataSet lineDataSet) {
        if (lineChart == null) {
            LogUtil.a("environmental noise chart is null", new Object[0]);
            return;
        }
        lineChart.setData(new LineData(lineDataSet));
        lineChart.notifyDataSetChanged();
        lineChart.invalidate();
    }

    private void c(LineChart lineChart, d dVar) {
        lineChart.setDrawGridBackground(false);
        lineChart.setDrawBorders(false);
        lineChart.setDragEnabled(false);
        lineChart.setTouchEnabled(false);
        lineChart.setExtraLeftOffset(30.0f);
        Description description = new Description();
        description.setText("");
        lineChart.setDescription(description);
        lineChart.getLegend().setEnabled(false);
    }

    private void e(LineChart lineChart) {
        LogUtil.a("SleepLineChartHolder", "axis is to be customed!");
        XAxis xAxis = lineChart.getXAxis();
        YAxis axisLeft = lineChart.getAxisLeft();
        YAxis axisRight = lineChart.getAxisRight();
        xAxis.setEnabled(false);
        axisRight.setEnabled(false);
        axisLeft.setAxisMinimum(0.0f);
        axisLeft.setAxisMaximum(100.0f);
        axisLeft.setLabelCount(5, true);
        axisLeft.setPosition(YAxis.YAxisLabelPosition.INSIDE_CHART);
        axisLeft.setXOffset(qrs.d(this.f24020b, -6.0f));
        xAxis.setDrawGridLines(false);
        axisLeft.setDrawAxisLine(false);
        axisLeft.setDrawGridLines(true);
        axisLeft.enableGridDashedLine(10.0f, 10.0f, 0.0f);
    }

    public void c(List<Integer> list) {
        this.e = list;
    }

    private void b(LineChart lineChart, d dVar) {
        YAxis axisLeft = lineChart.getAxisLeft();
        if (dVar.f24021b) {
            return;
        }
        axisLeft.setGridColor(Color.argb(51, 255, 255, 255));
        axisLeft.setTextColor(Color.argb(51, 255, 255, 255));
    }
}
