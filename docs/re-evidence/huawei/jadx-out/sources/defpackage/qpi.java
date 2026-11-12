package defpackage;

import com.huawei.haf.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineChart;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineDataSet;
import com.huawei.ui.commonui.linechart.common.HwHealthYAxis;
import com.huawei.ui.commonui.linechart.icommon.IHwHealthDataSetStyle;

/* JADX INFO: loaded from: classes16.dex */
public class qpi implements IHwHealthDataSetStyle {
    @Override // com.huawei.ui.commonui.linechart.icommon.IHwHealthDataSetStyle
    public void initStyle(HwHealthBaseBarLineChart hwHealthBaseBarLineChart, HwHealthBaseBarLineDataSet hwHealthBaseBarLineDataSet) {
        if (hwHealthBaseBarLineChart == null || hwHealthBaseBarLineDataSet == null) {
            LogUtil.j("RunningPostureDefaultSetStyle", "initStyle chart or datset is null");
            return;
        }
        HwHealthYAxis.HwHealthAxisDependency axisDependencyExt = hwHealthBaseBarLineDataSet.getAxisDependencyExt();
        qrs.e(hwHealthBaseBarLineChart, hwHealthBaseBarLineDataSet, axisDependencyExt, b(hwHealthBaseBarLineDataSet));
        qmi axisDataRenderArg = hwHealthBaseBarLineChart.getAxisDataRenderArg(axisDependencyExt);
        axisDataRenderArg.e(false);
        axisDataRenderArg.d(this);
    }

    private int b(HwHealthBaseBarLineDataSet hwHealthBaseBarLineDataSet) {
        String string = BaseApplication.b().getResources().getString(R.string.IDS_bolt_balance_left_right_touches);
        String string2 = BaseApplication.b().getResources().getString(R.string.IDS_running_posture_ground_contact_time);
        String string3 = BaseApplication.b().getResources().getString(R.string.IDS_aw_version2_duration_of_passage);
        if (hwHealthBaseBarLineDataSet.getLabel().equals(string)) {
            return 1;
        }
        return (hwHealthBaseBarLineDataSet.getLabel().equals(string2) || hwHealthBaseBarLineDataSet.getLabel().equals(string3)) ? 2 : 0;
    }
}
