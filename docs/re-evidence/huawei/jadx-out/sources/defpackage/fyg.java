package defpackage;

import android.util.SparseArray;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.health.marketing.utils.EcgDataInquirer;
import com.huawei.health.section.section.MeasureCardItemHolder;
import com.huawei.hihealth.HiHealthData;
import health.compact.a.util.LogUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class fyg extends EcgDataInquirer {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f34739c;

    @Override // com.huawei.health.marketing.utils.EcgDataInquirer
    public void onQueryDetailDone(SparseArray<List<HiHealthData>> sparseArray) {
    }

    public fyg(int[] iArr) {
        super(iArr, MeasureCardItemHolder.MeasureType.ITEM_TYPE_ECG_VASCULAR);
        this.f34739c = iArr[0];
    }

    @Override // com.huawei.health.marketing.utils.EcgDataInquirer
    public void onQuerySummaryDone(SparseArray<List<HiHealthData>> sparseArray) {
        if (sparseArray == null) {
            return;
        }
        LogUtil.c("VascularDataInquirer", "onQuerySummaryDone sparseArray size  = ", Integer.valueOf(sparseArray.size()));
        List<HiHealthData> list = sparseArray.get(this.f34739c, null);
        if (njy.b(list)) {
            HiHealthData hiHealthData = list.get(0);
            this.mMeasureCardBean.c(hiHealthData).c(new ArrayList(Collections.singletonList(new gvh(hiHealthData.getValue()))));
        } else {
            this.mMeasureCardBean.c((HiHealthData) null);
        }
        ObserverManagerUtil.e(EcgDataInquirer.ECG_DATA_OBSERVER, 16);
    }
}
