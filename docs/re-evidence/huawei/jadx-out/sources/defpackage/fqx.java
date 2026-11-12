package defpackage;

import android.content.Context;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseEntry;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart;
import com.huawei.ui.commonui.linechart.icommon.IStorageModel;
import com.huawei.ui.commonui.linechart.view.HwHealthLineDataSet;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public class fqx extends HwHealthLineDataSet {
    public fqx(Context context, List<HwHealthBaseEntry> list, String str, String str2, String str3) {
        super(context, list, str, str2, str3);
    }

    @Override // com.huawei.ui.commonui.linechart.view.HwHealthBaseLineDataSet, com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineDataSet
    public HwHealthBaseEntry constructEntry(float f, IStorageModel iStorageModel) {
        HwHealthBaseEntry hwHealthBaseEntryConstructEntry = super.constructEntry(f, iStorageModel);
        hwHealthBaseEntryConstructEntry.setData(iStorageModel);
        return hwHealthBaseEntryConstructEntry;
    }

    @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineDataSet, com.huawei.ui.commonui.linechart.icommon.IHwHealthBarLineDataSet
    public float acquireShowRangeMinValue(HwHealthBaseScrollBarLineChart hwHealthBaseScrollBarLineChart) {
        if (hwHealthBaseScrollBarLineChart == null) {
            return Float.MAX_VALUE;
        }
        return d(Float.MAX_VALUE, hwHealthBaseScrollBarLineChart, false);
    }

    @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineDataSet, com.huawei.ui.commonui.linechart.icommon.IHwHealthBarLineDataSet
    public float acquireShowRangeMaxValue(HwHealthBaseScrollBarLineChart hwHealthBaseScrollBarLineChart) {
        if (hwHealthBaseScrollBarLineChart == null) {
            return -3.4028235E38f;
        }
        return d(-3.4028235E38f, hwHealthBaseScrollBarLineChart, true);
    }

    @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineDataSet, com.huawei.ui.commonui.linechart.icommon.IHwHealthBarLineDataSet
    public float acquireRangePagerMinValue(float f, float f2) {
        float fC = Float.MAX_VALUE;
        fsq fsqVar = null;
        for (T t : this.mEntries) {
            if (t != null) {
                if (t.getData() instanceof fsq) {
                    fsqVar = (fsq) t.getData();
                }
                if (t.getX() >= f && t.getX() <= f2 && fsqVar != null && fsqVar.c() < fC) {
                    fC = fsqVar.c();
                }
            }
        }
        return fC;
    }

    public float d(float f, HwHealthBaseScrollBarLineChart hwHealthBaseScrollBarLineChart, boolean z) {
        float fAcquireShowRangeMinimum = hwHealthBaseScrollBarLineChart.acquireShowRangeMinimum();
        float fAcquireShowRangeMaximum = hwHealthBaseScrollBarLineChart.acquireShowRangeMaximum();
        fsq fsqVar = null;
        for (T t : this.mEntries) {
            if (t != null) {
                if (t.getData() instanceof fsq) {
                    fsqVar = (fsq) t.getData();
                }
                if (t.getX() >= fAcquireShowRangeMinimum && t.getX() <= fAcquireShowRangeMaximum) {
                    if (z) {
                        if (fsqVar != null && fsqVar.b() > f) {
                            f = fsqVar.b();
                        }
                    } else if (fsqVar != null && fsqVar.c() < f) {
                        f = fsqVar.c();
                    }
                }
            }
        }
        return f;
    }

    @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineDataSet, com.huawei.ui.commonui.linechart.icommon.IHwHealthBarLineDataSet
    public float acquireRangePagerMaxValue(float f, float f2) {
        float fB = Float.MAX_VALUE;
        fsq fsqVar = null;
        for (T t : this.mEntries) {
            if (t != null) {
                if (t.getData() instanceof fsq) {
                    fsqVar = (fsq) t.getData();
                }
                if (t.getX() >= f && t.getX() <= f2 && fsqVar != null && fsqVar.b() > fB) {
                    fB = fsqVar.b();
                }
            }
        }
        return fB;
    }
}
