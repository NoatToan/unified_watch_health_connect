package defpackage;

import android.util.SparseArray;
import com.huawei.basichealthmodel.listener.TaskDataListener;
import com.huawei.basichealthmodel.listener.TaskDayDataListener;
import com.huawei.health.healthmodel.bean.HealthLifeBean;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes23.dex */
public class bxz extends bxw {
    @Override // defpackage.bxw, com.huawei.basichealthmodel.listener.TaskInterface
    public void getRecord(final HealthLifeBean healthLifeBean, final TaskDayDataListener taskDayDataListener) {
        if (taskDayDataListener == null) {
            LogUtil.j("HL_BloodPressureManager", "getRecord listener is null");
        } else if (healthLifeBean == null) {
            LogUtil.j("HL_BloodPressureManager", "getRecord bean is null");
            taskDayDataListener.onDataChange(-1, null);
        } else {
            cbq.a(healthLifeBean, (ResponseCallback<HealthLifeBean>) new ResponseCallback() { // from class: byd
                @Override // com.huawei.hwbasemgr.ResponseCallback
                public final void onResponse(int i, Object obj) {
                    bxz.b(taskDayDataListener, healthLifeBean, i, (HealthLifeBean) obj);
                }
            });
        }
    }

    static /* synthetic */ void b(TaskDayDataListener taskDayDataListener, HealthLifeBean healthLifeBean, int i, HealthLifeBean healthLifeBean2) {
        if (i == -1 || healthLifeBean2 == null) {
            LogUtil.j("HL_BloodPressureManager", "getRecord resultCode ", Integer.valueOf(i), " result ", healthLifeBean2);
            taskDayDataListener.onDataChange(-1, healthLifeBean);
        } else {
            taskDayDataListener.onDataChange(0, healthLifeBean2);
        }
    }

    @Override // defpackage.bxw, com.huawei.basichealthmodel.listener.TaskInterface
    public void getRecord(final SparseArray<HealthLifeBean> sparseArray, final TaskDataListener taskDataListener) {
        if (taskDataListener == null) {
            LogUtil.j("HL_BloodPressureManager", "getRecord listener is null");
            return;
        }
        if (sparseArray == null) {
            LogUtil.j("HL_BloodPressureManager", "getRecord sparseArray is null");
            taskDataListener.onDataChange(-1, null);
        } else if (sparseArray.size() <= 0) {
            LogUtil.j("HL_BloodPressureManager", "getRecord sparseArray ", sparseArray);
            taskDataListener.onDataChange(-1, sparseArray);
        } else {
            cbq.d(sparseArray, (ResponseCallback<SparseArray<HealthLifeBean>>) new ResponseCallback() { // from class: byb
                @Override // com.huawei.hwbasemgr.ResponseCallback
                public final void onResponse(int i, Object obj) {
                    bxz.b(taskDataListener, sparseArray, i, (SparseArray) obj);
                }
            });
        }
    }

    static /* synthetic */ void b(TaskDataListener taskDataListener, SparseArray sparseArray, int i, SparseArray sparseArray2) {
        if (i == -1 || sparseArray2 == null) {
            LogUtil.j("HL_BloodPressureManager", "getRecord resultCode ", Integer.valueOf(i), " result ", sparseArray2);
            taskDataListener.onDataChange(-1, sparseArray);
        } else {
            taskDataListener.onDataChange(0, sparseArray2);
        }
    }
}
