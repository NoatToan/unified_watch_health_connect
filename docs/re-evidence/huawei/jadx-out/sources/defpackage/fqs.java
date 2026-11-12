package defpackage;

import com.huawei.ui.commonui.linechart.common.HwHealthBaseEntry;
import com.huawei.ui.commonui.linechart.icommon.IStorageModel;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class fqs extends frb {
    @Override // defpackage.frb, com.github.mikephil.charting.data.DataSet, com.github.mikephil.charting.interfaces.datasets.IDataSet
    public List<HwHealthBaseEntry> getEntriesForXValue(float f) {
        return super.getEntriesForXValue(f);
    }

    @Override // com.huawei.ui.commonui.linechart.view.HwHealthBaseLineDataSet, com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineDataSet
    public HwHealthBaseEntry constructEntry(float f, IStorageModel iStorageModel) {
        HwHealthBaseEntry hwHealthBaseEntryConstructEntry = super.constructEntry(f, iStorageModel);
        fqt fqtVar = new fqt(0.0f);
        if (iStorageModel instanceof fqt) {
            fqtVar = (fqt) iStorageModel;
        }
        if (fqtVar.e() == 0.0f) {
            return null;
        }
        hwHealthBaseEntryConstructEntry.setData(iStorageModel);
        return hwHealthBaseEntryConstructEntry;
    }
}
