package com.huawei.ui.commonui.linechart.common;

import android.graphics.Color;
import android.graphics.Paint;
import com.github.mikephil.charting.components.YAxis;

/* JADX INFO: loaded from: classes16.dex */
public class HwHealthYAxis extends YAxis {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HwHealthAxisDependency f23685c;
    private HwHealthBaseBarLineChart d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f23684b = true;
    private int e = Color.argb(0, 0, 0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f23683a = Color.argb(0, 0, 0, 0);

    public enum HwHealthAxisDependency {
        FIRST_PARTY,
        SECOND_PARTY,
        THIRD_PARTY
    }

    @Override // com.github.mikephil.charting.components.YAxis
    public YAxis.AxisDependency getAxisDependency() {
        return null;
    }

    public HwHealthYAxis(HwHealthBaseBarLineChart hwHealthBaseBarLineChart, HwHealthAxisDependency hwHealthAxisDependency) {
        this.d = hwHealthBaseBarLineChart;
        this.f23685c = hwHealthAxisDependency;
        this.mYOffset = 0.0f;
    }

    public HwHealthAxisDependency b() {
        return this.f23685c;
    }

    public void d(int i, int i2) {
        this.f23684b = false;
        this.e = i;
        this.f23683a = i2;
    }

    public boolean a() {
        return this.f23684b;
    }

    public int d() {
        return this.e;
    }

    public int e() {
        return this.f23683a;
    }

    @Override // com.github.mikephil.charting.components.YAxis
    public boolean needsOffset() {
        return isEnabled() && isDrawLabelsEnabled() && getLabelPosition() == YAxis.YAxisLabelPosition.OUTSIDE_CHART;
    }

    @Override // com.github.mikephil.charting.components.YAxis
    public float getRequiredWidthSpace(Paint paint) {
        HwHealthBaseBarLineChart hwHealthBaseBarLineChart = this.d;
        if (hwHealthBaseBarLineChart != null) {
            return hwHealthBaseBarLineChart.resolveYAxisWidth(this);
        }
        return 0.0f;
    }

    @Override // com.github.mikephil.charting.components.AxisBase
    public void setAxisMaximum(float f) {
        super.setAxisMaximum(f);
    }

    @Override // com.github.mikephil.charting.components.ComponentBase
    public void setXOffset(float f) {
        throw new RuntimeException("pls use LayoutBuilder and ChartAnchor");
    }
}
