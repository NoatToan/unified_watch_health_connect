package defpackage;

import android.util.SparseArray;
import com.huawei.basichealthmodel.listener.TaskDataListener;
import com.huawei.basichealthmodel.listener.TaskDayDataListener;
import com.huawei.health.healthmodel.bean.HealthLifeBean;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.Objects;

/* JADX INFO: loaded from: classes23.dex */
public class bya extends bxw {
    @Override // defpackage.bxw, com.huawei.basichealthmodel.listener.TaskInterface
    public void getRecord(final HealthLifeBean healthLifeBean, final TaskDayDataListener taskDayDataListener) {
        if (taskDayDataListener == null) {
            LogUtil.j("HL_BreathManager", "getRecord listener is null");
        } else if (healthLifeBean == null) {
            LogUtil.j("HL_BreathManager", "getRecord bean is null");
            taskDayDataListener.onDataChange(-1, null);
        } else {
            cec.d(healthLifeBean, new ResponseCallback() { // from class: byf
                @Override // com.huawei.hwbasemgr.ResponseCallback
                public final void onResponse(int i, Object obj) {
                    taskDayDataListener.onDataChange(0, healthLifeBean);
                }
            });
        }
    }

    @Override // defpackage.bxw, com.huawei.basichealthmodel.listener.TaskInterface
    public void getRecord(SparseArray<HealthLifeBean> sparseArray, TaskDataListener taskDataListener) {
        if (taskDataListener == null) {
            LogUtil.j("HL_BreathManager", "getRecord listener is null");
            return;
        }
        if (sparseArray == null) {
            LogUtil.j("HL_BreathManager", "getRecord sparseArray is null");
            taskDataListener.onDataChange(-1, null);
        } else if (sparseArray.size() <= 0) {
            LogUtil.j("HL_BreathManager", "getRecord sparseArray ", sparseArray);
            taskDataListener.onDataChange(-1, sparseArray);
        } else {
            Objects.requireNonNull(taskDataListener);
            ccc.c(sparseArray, new byi(taskDataListener));
        }
    }
}
