package defpackage;

import com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart;
import com.huawei.ui.commonui.linechart.common.UnixChartType;
import com.huawei.ui.commonui.linechart.scrolladapter.DynamicBorderSupportable;

/* JADX INFO: loaded from: classes16.dex */
public class qnb {
    public static HwHealthBaseScrollBarLineChart.ScrollAdapterInterface a(UnixChartType unixChartType, HwHealthBaseScrollBarLineChart hwHealthBaseScrollBarLineChart, DynamicBorderSupportable dynamicBorderSupportable) {
        if (unixChartType == UnixChartType.DAY) {
            return new qmy(hwHealthBaseScrollBarLineChart, dynamicBorderSupportable);
        }
        if (unixChartType == UnixChartType.WEEK) {
            return new qnd(hwHealthBaseScrollBarLineChart, dynamicBorderSupportable);
        }
        if (unixChartType == UnixChartType.MONTH) {
            return new qmw(hwHealthBaseScrollBarLineChart, dynamicBorderSupportable);
        }
        if (unixChartType == UnixChartType.YEAR) {
            return new qnc(hwHealthBaseScrollBarLineChart, dynamicBorderSupportable);
        }
        if (unixChartType == UnixChartType.ALL) {
            return new qmx(hwHealthBaseScrollBarLineChart, dynamicBorderSupportable);
        }
        throw new RuntimeException("getAdapter unknown type");
    }
}
