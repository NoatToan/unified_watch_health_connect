package defpackage;

import android.graphics.Color;
import com.github.mikephil.charting.components.YAxis;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineChart;
import com.huawei.ui.commonui.linechart.common.HwHealthYAxis;

/* JADX INFO: loaded from: classes7.dex */
public class frl extends HwHealthYAxis {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f34439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f34440b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f34441c;
    private HwHealthYAxis.HwHealthAxisDependency e;

    @Override // com.huawei.ui.commonui.linechart.common.HwHealthYAxis, com.github.mikephil.charting.components.YAxis
    public YAxis.AxisDependency getAxisDependency() {
        return null;
    }

    public frl(HwHealthBaseBarLineChart hwHealthBaseBarLineChart, HwHealthYAxis.HwHealthAxisDependency hwHealthAxisDependency) {
        super(hwHealthBaseBarLineChart, hwHealthAxisDependency);
        this.f34441c = true;
        this.f34440b = Color.argb(0, 0, 0, 0);
        this.f34439a = Color.argb(0, 0, 0, 0);
        this.e = hwHealthAxisDependency;
        this.mYOffset = 0.0f;
    }

    @Override // com.huawei.ui.commonui.linechart.common.HwHealthYAxis
    public HwHealthYAxis.HwHealthAxisDependency b() {
        return this.e;
    }

    @Override // com.huawei.ui.commonui.linechart.common.HwHealthYAxis
    public boolean a() {
        return this.f34441c;
    }

    @Override // com.huawei.ui.commonui.linechart.common.HwHealthYAxis
    public int d() {
        return this.f34440b;
    }

    @Override // com.huawei.ui.commonui.linechart.common.HwHealthYAxis
    public int e() {
        return this.f34439a;
    }

    @Override // com.huawei.ui.commonui.linechart.common.HwHealthYAxis, com.github.mikephil.charting.components.YAxis
    public boolean needsOffset() {
        return isEnabled() && isDrawLabelsEnabled() && getLabelPosition() == YAxis.YAxisLabelPosition.OUTSIDE_CHART;
    }

    @Override // com.huawei.ui.commonui.linechart.common.HwHealthYAxis, com.github.mikephil.charting.components.AxisBase
    public void setAxisMaximum(float f) {
        super.setAxisMaximum(f);
    }
}
