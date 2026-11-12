package defpackage;

import android.content.Context;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseEntry;
import com.huawei.ui.commonui.linechart.icommon.IStorageModel;
import com.huawei.ui.commonui.linechart.view.HwHealthLineDataSet;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public class frd extends HwHealthLineDataSet {
    public frd(Context context, List<HwHealthBaseEntry> list, String str, String str2, String str3) {
        super(context, list, str, str2, str3);
    }

    @Override // com.huawei.ui.commonui.linechart.view.HwHealthBaseLineDataSet, com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineDataSet
    public HwHealthBaseEntry constructEntry(float f, IStorageModel iStorageModel) {
        HwHealthBaseEntry hwHealthBaseEntryConstructEntry = super.constructEntry(f, iStorageModel);
        hwHealthBaseEntryConstructEntry.setData(iStorageModel);
        return hwHealthBaseEntryConstructEntry;
    }
}
