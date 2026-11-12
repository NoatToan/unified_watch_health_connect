package defpackage;

import com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart;
import com.huawei.ui.commonui.linechart.scrolladapter.BaseScrollAdapter;
import com.huawei.ui.commonui.linechart.scrolladapter.DynamicBorderSupportable;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes16.dex */
public class qmw extends BaseScrollAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f46502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HwHealthBaseScrollBarLineChart.HwHealthAxisValueFormatter f46503b;

    public qmw(HwHealthBaseScrollBarLineChart hwHealthBaseScrollBarLineChart, DynamicBorderSupportable dynamicBorderSupportable) {
        super(hwHealthBaseScrollBarLineChart, dynamicBorderSupportable);
        this.f46503b = null;
        this.f46502a = true;
        Objects.requireNonNull(hwHealthBaseScrollBarLineChart);
        this.f46503b = new HwHealthBaseScrollBarLineChart.f();
    }

    @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.ScrollAdapterInterface
    public int acquireDefaultStartX() {
        return qnh.h(qnh.o((int) TimeUnit.MILLISECONDS.toMinutes(getDefaultTime())));
    }

    @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.ScrollAdapterInterface
    public int acquireRange() {
        return ((int) TimeUnit.MILLISECONDS.toMinutes(qnh.j(getDefaultTime()))) - 1;
    }

    @Override // com.huawei.ui.commonui.linechart.scrolladapter.BaseScrollAdapter, com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.ScrollAdapterInterface
    public int acquireRange(long j) {
        return ((int) TimeUnit.MILLISECONDS.toMinutes(qnh.j(j))) - 1;
    }

    @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.ScrollAdapterInterface
    public HwHealthBaseScrollBarLineChart.HwHealthAxisValueFormatter acquireXAxisValueFormatter() {
        return this.f46503b;
    }

    @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.ScrollAdapterInterface
    public boolean querySupportTouchScroll() {
        return this.f46502a;
    }

    @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.ScrollAdapterInterface
    public int acquireValuePresentRangeMin(int i) {
        return b(i);
    }

    @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.ScrollAdapterInterface
    public int acquireValuePresentRangeMax(int i) {
        return a(i);
    }

    protected int b(int i) {
        return qnh.h(qnh.e(qnh.f(i)));
    }

    protected int a(int i) {
        return qnh.h(qnh.n(qnh.f(i)));
    }
}
