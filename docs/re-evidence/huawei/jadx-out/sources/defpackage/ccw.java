package defpackage;

import android.util.SparseIntArray;
import com.huawei.health.healthlife.constant.WearTaskEnum;
import com.huawei.hwlogsmodel.LogUtil;
import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: loaded from: classes23.dex */
public class ccw implements Comparator<qfz>, Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SparseIntArray f1480c = cbg.t();

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(qfz qfzVar, qfz qfzVar2) {
        if (this.f1480c == null) {
            LogUtil.j("HL_HealthModelComparator", "compare mSparseIntArray is null");
            return 0;
        }
        return a(qfzVar) - a(qfzVar2);
    }

    private int a(qfz qfzVar) {
        if (qfzVar == null) {
            LogUtil.j("HL_HealthModelComparator", "compare taskSchedule is null");
            return 0;
        }
        return this.f1480c.get(WearTaskEnum.getWearTaskIdByCloudId(qfzVar.g()));
    }
}
