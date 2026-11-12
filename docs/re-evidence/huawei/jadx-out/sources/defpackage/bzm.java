package defpackage;

import android.util.SparseArray;
import com.huawei.basichealthmodel.listener.TaskDataListener;
import com.huawei.health.healthmodel.bean.HealthLifeBean;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.Objects;

/* JADX INFO: loaded from: classes23.dex */
public class bzm extends bxw {
    @Override // defpackage.bxw, com.huawei.basichealthmodel.listener.TaskInterface
    public void getRecord(SparseArray<HealthLifeBean> sparseArray, TaskDataListener taskDataListener) {
        if (taskDataListener == null) {
            LogUtil.j("HL_WeightManager", "getRecord listener is null");
            return;
        }
        if (sparseArray == null) {
            LogUtil.j("HL_WeightManager", "getRecord sparseArray is null");
            taskDataListener.onDataChange(-1, null);
        } else if (sparseArray.size() <= 0) {
            LogUtil.j("HL_WeightManager", "getRecord recordArray ", sparseArray);
            taskDataListener.onDataChange(-1, sparseArray);
        } else {
            Objects.requireNonNull(taskDataListener);
            cgn.e(sparseArray, new byi(taskDataListener));
        }
    }
}
