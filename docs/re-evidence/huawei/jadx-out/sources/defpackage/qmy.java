package defpackage;

import com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart;
import com.huawei.ui.commonui.linechart.scrolladapter.BaseScrollAdapter;
import com.huawei.ui.commonui.linechart.scrolladapter.DynamicBorderSupportable;
import java.util.Calendar;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes16.dex */
public class qmy extends BaseScrollAdapter {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HwHealthBaseScrollBarLineChart.HwHealthAxisValueFormatter f46505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f46506c;

    public qmy(HwHealthBaseScrollBarLineChart hwHealthBaseScrollBarLineChart, DynamicBorderSupportable dynamicBorderSupportable) {
        super(hwHealthBaseScrollBarLineChart, dynamicBorderSupportable);
        this.f46505b = null;
        this.f46506c = false;
        Objects.requireNonNull(hwHealthBaseScrollBarLineChart);
        this.f46505b = new HwHealthBaseScrollBarLineChart.i();
        this.mScrollBuffer.e(false);
    }

    @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.ScrollAdapterInterface
    public int acquireDefaultStartX() {
        return qnh.h(qnh.e((int) TimeUnit.MILLISECONDS.toMinutes(getDefaultTime())));
    }

    @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.ScrollAdapterInterface
    public int acquireRange() {
        return (int) TimeUnit.MILLISECONDS.toMinutes(qnh.d());
    }

    @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.ScrollAdapterInterface
    public HwHealthBaseScrollBarLineChart.HwHealthAxisValueFormatter acquireXAxisValueFormatter() {
        return this.f46505b;
    }

    @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.ScrollAdapterInterface
    public boolean querySupportTouchScroll() {
        return this.f46506c;
    }

    @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.ScrollAdapterInterface
    public int acquireValuePresentRangeMin(int i) {
        return b(i);
    }

    @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.ScrollAdapterInterface
    public int acquireValuePresentRangeMax(int i) {
        return e(i);
    }

    protected int b(int i) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(TimeUnit.MINUTES.toMillis(qnh.f(i)));
        if (calendar.get(12) < 30) {
            calendar.set(12, 0);
        } else {
            calendar.set(12, 29);
        }
        return qnh.h((int) TimeUnit.MILLISECONDS.toMinutes(calendar.getTimeInMillis()));
    }

    protected int e(int i) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(TimeUnit.MINUTES.toMillis(qnh.f(i)));
        if (calendar.get(12) < 30) {
            calendar.set(12, 30);
        } else {
            calendar.set(12, 59);
        }
        return qnh.h((int) TimeUnit.MILLISECONDS.toMinutes(calendar.getTimeInMillis()));
    }
}
