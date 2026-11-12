package defpackage;

import android.text.TextUtils;
import android.util.SparseArray;
import com.huawei.basichealthmodel.listener.TaskDataListener;
import com.huawei.basichealthmodel.listener.TaskDayDataListener;
import com.huawei.basichealthmodel.listener.TaskInterface;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.healthmodel.bean.HealthLifeBean;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import health.compact.a.ReleaseLogUtil;

/* JADX INFO: loaded from: classes23.dex */
public class bxw implements TaskInterface {
    @Override // com.huawei.basichealthmodel.listener.TaskInterface
    public void getRecord(HealthLifeBean healthLifeBean, TaskDayDataListener taskDayDataListener) {
        if (taskDayDataListener == null) {
            LogUtil.j("HL_BaseManager", "getRecord listener is null bean ", healthLifeBean);
        } else if (healthLifeBean == null) {
            ReleaseLogUtil.d("HL_BaseManager", "getRecord bean is null listener ", taskDayDataListener);
            taskDayDataListener.onDataChange(-1, null);
        } else {
            taskDayDataListener.onDataChange(0, healthLifeBean);
        }
    }

    @Override // com.huawei.basichealthmodel.listener.TaskInterface
    public void getRecord(SparseArray<HealthLifeBean> sparseArray, TaskDataListener taskDataListener) {
        if (taskDataListener == null) {
            LogUtil.j("HL_BaseManager", "getRecord listener is null sparseArray ", sparseArray);
            return;
        }
        if (sparseArray == null) {
            ReleaseLogUtil.d("HL_BaseManager", "getRecord sparseArray is null listener ", taskDataListener);
            taskDataListener.onDataChange(-1, null);
            return;
        }
        int size = sparseArray.size();
        if (size <= 0) {
            LogUtil.j("HL_BaseManager", "getRecord size ", Integer.valueOf(size), " sparseArray ", sparseArray, " listener ", taskDataListener);
            taskDataListener.onDataChange(-1, sparseArray);
        } else {
            taskDataListener.onDataChange(0, sparseArray);
        }
    }

    @Override // com.huawei.basichealthmodel.listener.TaskInterface
    /* JADX INFO: renamed from: saveRecord, reason: merged with bridge method [inline-methods] */
    public void a(final int i, final String str, final HealthLifeBean healthLifeBean, final TaskDayDataListener taskDayDataListener) {
        if (taskDayDataListener == null) {
            LogUtil.j("HL_BaseManager", "saveRecord listener is null.");
            return;
        }
        if (healthLifeBean == null || TextUtils.isEmpty(str)) {
            LogUtil.j("HL_BaseManager", "saveRecord null or no new change.");
            taskDayDataListener.onDataChange(-1, healthLifeBean);
        } else {
            if (HandlerExecutor.c()) {
                cbg.c(ThreadPoolManager.c(), "HealthModelSaveTaskRecord", new Runnable() { // from class: byc
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f1308a.a(i, str, healthLifeBean, taskDayDataListener);
                    }
                });
                return;
            }
            int complete = healthLifeBean.getComplete();
            b(i, str, healthLifeBean);
            int complete2 = healthLifeBean.getComplete();
            if (complete2 > 0 && complete <= 0) {
                cbk.c(healthLifeBean.getId(), complete2);
            }
            taskDayDataListener.onDataChange(bxc.a(healthLifeBean, cbg.q()) >= 0 ? 0 : -1, healthLifeBean);
        }
    }

    private void b(int i, String str, HealthLifeBean healthLifeBean) {
        int iE = e(i, healthLifeBean);
        if (iE == -1) {
            return;
        }
        int id = healthLifeBean.getId();
        int recordDay = healthLifeBean.getRecordDay();
        if (id == 6) {
            int iC = cfu.c(recordDay, str);
            int iA = cfu.a(recordDay, healthLifeBean.getTarget());
            if (healthLifeBean.getComplete() <= 0 && Math.abs(iA - iC) <= 60) {
                healthLifeBean.setComplete(iE);
            }
        } else if (id == 7) {
            int iC2 = cfu.c(recordDay, str);
            int iA2 = cfu.a(recordDay, healthLifeBean.getTarget());
            if (healthLifeBean.getComplete() <= 0 && iC2 <= iA2 + 60) {
                healthLifeBean.setComplete(iE);
            }
        } else if (id == 12) {
            LogUtil.a("HL_BaseManager", "refreshBean type ", Integer.valueOf(i), " result ", str, " bean ", healthLifeBean);
        } else if (healthLifeBean.getComplete() <= 0 && CommonUtil.j(str) >= CommonUtil.j(healthLifeBean.getTarget())) {
            healthLifeBean.setComplete(iE);
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        healthLifeBean.setResult(str);
        healthLifeBean.setTimestamp(jCurrentTimeMillis);
        healthLifeBean.setTimeZone(lsl.q(jCurrentTimeMillis));
        healthLifeBean.setSyncStatus(0);
    }

    private int e(int i, HealthLifeBean healthLifeBean) {
        int complete = healthLifeBean.getComplete();
        if (complete == 4) {
            return 4;
        }
        if (i == 1) {
            return 1;
        }
        if (i != 2) {
            if (i != 3) {
                if (i != 4) {
                    return -1;
                }
                if (complete <= 0) {
                    healthLifeBean.setComplete(3);
                }
                return 3;
            }
            if (complete <= 0) {
                healthLifeBean.setComplete(2);
            }
            healthLifeBean.setRest(1);
        }
        return 2;
    }
}
