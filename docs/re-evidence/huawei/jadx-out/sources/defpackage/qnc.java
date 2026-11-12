package defpackage;

import com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart;
import com.huawei.ui.commonui.linechart.scrolladapter.BaseScrollAdapter;
import com.huawei.ui.commonui.linechart.scrolladapter.DynamicBorderSupportable;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes16.dex */
public class qnc extends BaseScrollAdapter {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HwHealthBaseScrollBarLineChart.HwHealthAxisValueFormatter f46520c;
    private boolean e;

    public qnc(HwHealthBaseScrollBarLineChart hwHealthBaseScrollBarLineChart, DynamicBorderSupportable dynamicBorderSupportable) {
        super(hwHealthBaseScrollBarLineChart, dynamicBorderSupportable);
        this.f46520c = null;
        this.e = true;
        Objects.requireNonNull(hwHealthBaseScrollBarLineChart);
        this.f46520c = new HwHealthBaseScrollBarLineChart.h();
    }

    @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.ScrollAdapterInterface
    public int acquireDefaultStartX() {
        return qnh.h(qnh.q((int) TimeUnit.MILLISECONDS.toMinutes(getDefaultTime())));
    }

    @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.ScrollAdapterInterface
    public int acquireRange() {
        return (int) (TimeUnit.MILLISECONDS.toMinutes(qnh.q(getDefaultTime())) - 1);
    }

    @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.ScrollAdapterInterface
    public HwHealthBaseScrollBarLineChart.HwHealthAxisValueFormatter acquireXAxisValueFormatter() {
        return this.f46520c;
    }

    @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.ScrollAdapterInterface
    public boolean querySupportTouchScroll() {
        return this.e;
    }

    @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.ScrollAdapterInterface
    public int acquireValuePresentRangeMin(int i) {
        return b(i);
    }

    @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.ScrollAdapterInterface
    public int acquireValuePresentRangeMax(int i) {
        return d(i);
    }

    protected int b(int i) {
        return qnh.h(qnh.o(qnh.f(i)));
    }

    protected int d(int i) {
        return qnh.h(qnh.l(qnh.f(i)) - 1);
    }
}
