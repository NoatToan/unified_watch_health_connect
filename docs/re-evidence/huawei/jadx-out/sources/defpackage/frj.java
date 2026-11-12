package defpackage;

import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.ui.commonui.linechart.common.DataInfos;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseEntry;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public class frj extends qnr {
    public frj(List<HwHealthBaseEntry> list, String str, String str2, String str3, DataInfos dataInfos) {
        super(BaseApplication.getContext(), list, str, str2, str3, dataInfos);
    }

    @Override // defpackage.qnr, com.github.mikephil.charting.data.DataSet, com.github.mikephil.charting.interfaces.datasets.IDataSet
    public List<HwHealthBaseEntry> getEntriesForXValue(float f) {
        return super.getEntriesForXValue(f);
    }
}
