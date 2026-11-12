package defpackage;

import android.text.TextUtils;
import android.util.SparseArray;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.health.marketing.utils.EcgDataInquirer;
import com.huawei.health.section.section.MeasureCardItemHolder;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class fxd extends EcgDataInquirer {
    private final int d;
    private final int e;

    public fxd(int[] iArr) {
        super(iArr, MeasureCardItemHolder.MeasureType.ITEM_TYPE_ECG_ARRHYTHMIA);
        this.e = iArr[0];
        this.d = iArr[1];
    }

    @Override // com.huawei.health.marketing.utils.EcgDataInquirer
    public void onQuerySummaryDone(SparseArray<List<HiHealthData>> sparseArray) {
        if (sparseArray == null) {
            return;
        }
        List<HiHealthData> list = sparseArray.get(this.d, null);
        if (njy.b(list)) {
            this.mMeasureCardBean.c(list.get(0));
            HiHealthData hiHealthData = list.get(0);
            queryDetail(hiHealthData.getStartTime(), hiHealthData.getEndTime(), this.mDataTypes);
        } else {
            this.mMeasureCardBean.c((HiHealthData) null).c((List<gvh>) null);
            ObserverManagerUtil.e(EcgDataInquirer.ECG_DATA_OBSERVER, 8);
            LogUtil.a("EcgArrhythmiaDataInquirer", "parseEcgData no collection data found!");
        }
        ObserverManagerUtil.e(EcgDataInquirer.ECG_DATA_OBSERVER, 4);
    }

    @Override // com.huawei.health.marketing.utils.EcgDataInquirer
    public void onQueryDetailDone(SparseArray<List<HiHealthData>> sparseArray) {
        List<HiHealthData> list = sparseArray.get(this.e);
        if (njy.e(list)) {
            LogUtil.e("EcgArrhythmiaDataInquirer", "parseEcgDiagramSeqData cause hiSeqDataList is empty");
            this.mMeasureCardBean.c((List<gvh>) null);
            ObserverManagerUtil.e(EcgDataInquirer.ECG_DATA_OBSERVER, 8);
            return;
        }
        HiHealthData hiHealthData = list.get(0);
        String simpleData = hiHealthData.getSimpleData();
        if (TextUtils.isEmpty(simpleData)) {
            LogUtil.a("EcgArrhythmiaDataInquirer", "onQueryDetailDone getDrawDataJsonStrWithAlgo now!");
            simpleData = fxn.e(hiHealthData);
        }
        this.mMeasureCardBean.c(fxn.b(simpleData));
        ObserverManagerUtil.e(EcgDataInquirer.ECG_DATA_OBSERVER, 8);
    }
}
