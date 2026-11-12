package defpackage;

import android.util.SparseIntArray;
import com.huawei.health.healthmodel.bean.HealthLifeBean;
import com.huawei.hwlogsmodel.LogUtil;
import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: loaded from: classes23.dex */
public class cdb implements Comparator<HealthLifeBean>, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SparseIntArray f1483b = cbg.p();

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(HealthLifeBean healthLifeBean, HealthLifeBean healthLifeBean2) {
        int i;
        SparseIntArray sparseIntArray = this.f1483b;
        int i2 = 0;
        if (sparseIntArray == null) {
            LogUtil.j("HL_HealthModelComparator", "compare mSparseIntArray is null");
            return 0;
        }
        if (healthLifeBean == null) {
            LogUtil.j("HL_HealthModelComparator", "compare beforeBean is null");
            i = 0;
        } else {
            i = sparseIntArray.get(healthLifeBean.getId());
        }
        if (healthLifeBean2 == null) {
            LogUtil.j("HL_HealthModelComparator", "compare afterBean is null");
        } else {
            i2 = this.f1483b.get(healthLifeBean2.getId());
        }
        return i - i2;
    }
}
