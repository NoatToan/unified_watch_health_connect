package defpackage;

import android.util.SparseArray;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.health.marketing.utils.EcgDataInquirer;
import com.huawei.health.section.section.MeasureCardItemHolder;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.data.model.EcgMetaData;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class fxf extends EcgDataInquirer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f34673a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f34674c;

    public fxf(int[] iArr) {
        super(iArr, MeasureCardItemHolder.MeasureType.ITEM_TYPE_ECG_NORMAL);
        this.f34674c = iArr[0];
        this.f34673a = iArr[1];
    }

    @Override // com.huawei.health.marketing.utils.EcgDataInquirer
    public void onQuerySummaryDone(SparseArray<List<HiHealthData>> sparseArray) {
        EcgMetaData ecgMetaData;
        List<HiHealthData> list = sparseArray.get(this.f34674c, null);
        if (njy.b(list)) {
            this.mMeasureCardBean.c(list.get(0)).c((List<gvh>) null);
        } else {
            this.mMeasureCardBean.c((HiHealthData) null).c((List<gvh>) null);
            LogUtil.e("EcgNormalDataInquirer", "parseEcgData no collection data found!");
        }
        List<HiHealthData> list2 = sparseArray.get(this.f34673a, null);
        if (njy.b(list2)) {
            for (int i = 0; i < list2.size(); i++) {
                HiHealthData hiHealthData = list2.get(i);
                try {
                    ecgMetaData = (EcgMetaData) qqt.c(hiHealthData.getMetaData(), new TypeToken<EcgMetaData>() { // from class: com.huawei.health.marketing.utils.EcgNormalDataInquirer$1
                    }.getType());
                } catch (JsonSyntaxException unused) {
                    LogUtil.e("EcgNormalDataInquirer", "JsonSyntaxException");
                    ecgMetaData = new EcgMetaData();
                }
                if (((int) ecgMetaData.getEcgArrhyType()) != 0) {
                    this.mMeasureCardBean.d(hiHealthData);
                    queryDetail(hiHealthData.getStartTime(), hiHealthData.getEndTime(), this.mDataTypes);
                    ObserverManagerUtil.e(EcgDataInquirer.ECG_DATA_OBSERVER, 1);
                }
            }
        } else {
            LogUtil.e("EcgNormalDataInquirer", "parseEcgData no diagram data found, diagramDataList is empty!");
        }
        LogUtil.e("EcgNormalDataInquirer", "parseEcgData no diagram data found, diagramDataList has no valid data!");
        this.mMeasureCardBean.d((HiHealthData) null).c((List<gvh>) null);
        ObserverManagerUtil.e(EcgDataInquirer.ECG_DATA_OBSERVER, 1);
    }

    @Override // com.huawei.health.marketing.utils.EcgDataInquirer
    public void onQueryDetailDone(SparseArray<List<HiHealthData>> sparseArray) {
        List<HiHealthData> list = sparseArray.get(this.f34673a);
        if (njy.e(list)) {
            LogUtil.e("EcgNormalDataInquirer", "parseEcgDiagramSeqData cause hiSeqDataList is empty");
            return;
        }
        List<gvh> listB = fxn.b(list);
        if (listB == null) {
            return;
        }
        this.mMeasureCardBean.c(listB);
        ObserverManagerUtil.e(EcgDataInquirer.ECG_DATA_OBSERVER, 2);
    }
}
