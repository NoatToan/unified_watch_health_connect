package defpackage;

import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.ui.commonui.linechart.common.DataInfos;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseEntry;
import com.huawei.ui.commonui.linechart.icommon.IStorageModel;
import java.util.List;

/* JADX INFO: loaded from: classes43.dex */
public class twe extends ukf {
    @Override // com.github.mikephil.charting.data.DataSet, com.github.mikephil.charting.interfaces.datasets.IDataSet
    public void calcMinMaxY(float f, float f2) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.github.mikephil.charting.data.DataSet
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void calcMinMaxY(HwHealthBaseEntry hwHealthBaseEntry) {
    }

    twe(List<HwHealthBaseEntry> list, String str, String str2, String str3, DataInfos dataInfos) {
        super(BaseApplication.getContext(), list, str, str2, str3, dataInfos);
    }

    @Override // defpackage.ukf, com.github.mikephil.charting.data.DataSet, com.github.mikephil.charting.interfaces.datasets.IDataSet
    public List<HwHealthBaseEntry> getEntriesForXValue(float f) {
        return super.getEntriesForXValue(f);
    }

    @Override // com.huawei.ui.commonui.linechart.view.HwHealthBaseLineDataSet, com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineDataSet
    public HwHealthBaseEntry constructEntry(float f, IStorageModel iStorageModel) {
        HwHealthBaseEntry hwHealthBaseEntryConstructEntry = super.constructEntry(f, iStorageModel);
        hwHealthBaseEntryConstructEntry.setData(iStorageModel);
        return hwHealthBaseEntryConstructEntry;
    }

    @Override // com.github.mikephil.charting.data.DataSet, com.github.mikephil.charting.interfaces.datasets.IDataSet
    public void calcMinMax() {
        int y = Integer.MIN_VALUE;
        int y2 = Integer.MAX_VALUE;
        for (T t : this.mEntries) {
            if (t.getY() != 0.0f) {
                if (t.getY() > y) {
                    y = (int) t.getY();
                }
                if (t.getY() < y2) {
                    y2 = (int) t.getY();
                }
            }
        }
        this.mYMax = y;
        this.mYMin = y2;
    }
}
