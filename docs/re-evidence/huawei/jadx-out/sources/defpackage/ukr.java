package defpackage;

import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.linechart.barchart.HwHealthBarEntry;
import com.huawei.ui.commonui.linechart.common.DataInfos;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class ukr extends qme {
    public ukr(List<HwHealthBarEntry> list, String str, String str2, String str3, DataInfos dataInfos) {
        super(list, str, str2, str3, dataInfos);
    }

    @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineDataSet, com.huawei.ui.commonui.linechart.icommon.IHwHealthBarLineDataSet
    public float acquireRangePagerMinValue(float f, float f2) {
        float fD = d(f, f2);
        LogUtil.a("BloodOxygenHealthBarDataSet acquireRangePagerMinValue ", Float.valueOf(fD));
        return fD;
    }

    @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineDataSet, com.huawei.ui.commonui.linechart.icommon.IHwHealthBarLineDataSet
    public float acquireShowRangeMinValue(HwHealthBaseScrollBarLineChart hwHealthBaseScrollBarLineChart) {
        if (hwHealthBaseScrollBarLineChart == null) {
            return Float.MAX_VALUE;
        }
        float fD = d(hwHealthBaseScrollBarLineChart.acquireShowRangeMinimum(), hwHealthBaseScrollBarLineChart.acquireShowRangeMaximum());
        LogUtil.a("BloodOxygenHealthBarDataSet acquireShowRangeMinValue ", Float.valueOf(fD));
        return fD;
    }

    private float d(float f, float f2) {
        float fA = Float.MAX_VALUE;
        for (T t : this.mEntries) {
            if (t != null && t.getX() >= f && t.getX() <= f2) {
                fqq fqqVarA = t.acquireModel() instanceof fqm ? ((fqm) t.acquireModel()).a() : null;
                if (fqqVarA != null && fqqVarA.a() < fA) {
                    fA = fqqVarA.a();
                }
            }
        }
        return fA;
    }
}
