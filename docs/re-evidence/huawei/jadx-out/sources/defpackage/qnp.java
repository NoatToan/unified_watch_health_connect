package defpackage;

import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineChart;

/* JADX INFO: loaded from: classes16.dex */
public class qnp {
    public static void a(HwHealthBaseBarLineChart hwHealthBaseBarLineChart, boolean z) {
        if (hwHealthBaseBarLineChart == null) {
            LogUtil.j("HwHealthBarLineChartBaseUtil", "enableSpacePreserve4DataOverlay ");
        } else if (z) {
            hwHealthBaseBarLineChart.setMinOffset(40.0f);
            hwHealthBaseBarLineChart.getLegend().setXOffset(16.0f);
        } else {
            hwHealthBaseBarLineChart.setMinOffset(0.0f);
            hwHealthBaseBarLineChart.getLegend().setXOffset(0.0f);
        }
    }
}
