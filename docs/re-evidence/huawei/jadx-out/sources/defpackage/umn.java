package defpackage;

import android.graphics.Color;
import com.github.mikephil.charting.components.YAxis;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineChart;
import com.huawei.ui.commonui.linechart.common.HwHealthYAxis;

/* JADX INFO: loaded from: classes43.dex */
public class umn extends HwHealthYAxis {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f50366a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HwHealthYAxis.HwHealthAxisDependency f50367c;
    private boolean d;
    private int e;

    @Override // com.huawei.ui.commonui.linechart.common.HwHealthYAxis, com.github.mikephil.charting.components.YAxis
    public YAxis.AxisDependency getAxisDependency() {
        return null;
    }

    public umn(HwHealthBaseBarLineChart hwHealthBaseBarLineChart, HwHealthYAxis.HwHealthAxisDependency hwHealthAxisDependency) {
        super(hwHealthBaseBarLineChart, hwHealthAxisDependency);
        this.d = true;
        this.f50366a = Color.argb(0, 0, 0, 0);
        this.e = Color.argb(0, 0, 0, 0);
        this.f50367c = hwHealthAxisDependency;
        this.mYOffset = 0.0f;
    }

    @Override // com.huawei.ui.commonui.linechart.common.HwHealthYAxis
    public HwHealthYAxis.HwHealthAxisDependency b() {
        return this.f50367c;
    }

    @Override // com.huawei.ui.commonui.linechart.common.HwHealthYAxis
    public boolean a() {
        return this.d;
    }

    @Override // com.huawei.ui.commonui.linechart.common.HwHealthYAxis
    public int d() {
        return this.f50366a;
    }

    @Override // com.huawei.ui.commonui.linechart.common.HwHealthYAxis
    public int e() {
        return this.e;
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
