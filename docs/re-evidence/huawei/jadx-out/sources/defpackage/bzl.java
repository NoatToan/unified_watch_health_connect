package defpackage;

import android.util.SparseArray;
import android.util.SparseIntArray;
import com.huawei.basefitnessadvice.model.FitnessTrackRecord;
import com.huawei.basichealthmodel.listener.TaskDataListener;
import com.huawei.basichealthmodel.listener.TaskDayDataListener;
import com.huawei.health.courseplanservice.api.RecordApi;
import com.huawei.health.healthmodel.bean.HealthLifeBean;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import health.compact.a.Services;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public class bzl extends bxw {
    @Override // defpackage.bxw, com.huawei.basichealthmodel.listener.TaskInterface
    public void getRecord(final HealthLifeBean healthLifeBean, final TaskDayDataListener taskDayDataListener) {
        if (taskDayDataListener == null) {
            LogUtil.j("HL_WorkoutManager", "getRecord listener is null");
            return;
        }
        if (healthLifeBean == null) {
            LogUtil.j("HL_WorkoutManager", "getRecord bean is null");
            taskDayDataListener.onDataChange(-1, null);
            return;
        }
        RecordApi recordApi = (RecordApi) Services.d("CoursePlanService", RecordApi.class);
        if (recordApi == null) {
            LogUtil.j("HL_WorkoutManager", "getRecord api is null");
            taskDayDataListener.onDataChange(-1, healthLifeBean);
        } else {
            recordApi.acquireSummaryFitnessRecord(new ntx.d().b(cbg.b(healthLifeBean)).d(cbg.c(healthLifeBean)).a(), new IBaseResponseCallback() { // from class: bzj
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i, Object obj) {
                    bzl.b(taskDayDataListener, healthLifeBean, i, obj);
                }
            });
        }
    }

    static /* synthetic */ void b(TaskDayDataListener taskDayDataListener, HealthLifeBean healthLifeBean, int i, Object obj) {
        LogUtil.a("HL_WorkoutManager", "getRecord errorCode ", Integer.valueOf(i), " object ", obj);
        if (!njy.b(obj, FitnessTrackRecord.class)) {
            taskDayDataListener.onDataChange(-1, healthLifeBean);
            return;
        }
        List list = (List) obj;
        if (njy.e(list)) {
            taskDayDataListener.onDataChange(0, healthLifeBean);
            return;
        }
        FitnessTrackRecord fitnessTrackRecord = (FitnessTrackRecord) list.get(0);
        if (fitnessTrackRecord == null) {
            taskDayDataListener.onDataChange(0, healthLifeBean);
            return;
        }
        int iAcquireSumExerciseTimes = fitnessTrackRecord.acquireSumExerciseTimes();
        if (iAcquireSumExerciseTimes <= 0) {
            taskDayDataListener.onDataChange(0, healthLifeBean);
            return;
        }
        if (healthLifeBean.getComplete() <= 0) {
            healthLifeBean.setComplete(1);
            healthLifeBean.setRest(0);
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        healthLifeBean.setIsUpdated(true);
        healthLifeBean.setTimestamp(jCurrentTimeMillis);
        healthLifeBean.setTimeZone(lsl.q(jCurrentTimeMillis));
        healthLifeBean.setResult(String.valueOf(iAcquireSumExerciseTimes));
        healthLifeBean.setSyncStatus(0);
        taskDayDataListener.onDataChange(0, healthLifeBean);
    }

    @Override // defpackage.bxw, com.huawei.basichealthmodel.listener.TaskInterface
    public void getRecord(final SparseArray<HealthLifeBean> sparseArray, final TaskDataListener taskDataListener) {
        if (taskDataListener == null) {
            LogUtil.j("HL_WorkoutManager", "getRecord listener is null");
            return;
        }
        if (sparseArray == null) {
            LogUtil.j("HL_WorkoutManager", "getRecord sparseArray is null");
            taskDataListener.onDataChange(-1, null);
        } else {
            if (sparseArray.size() <= 0) {
                LogUtil.j("HL_WorkoutManager", "getRecord sparseArray ", sparseArray);
                taskDataListener.onDataChange(-1, sparseArray);
                return;
            }
            RecordApi recordApi = (RecordApi) Services.d("CoursePlanService", RecordApi.class);
            if (recordApi == null) {
                LogUtil.j("HL_WorkoutManager", "getRecord api is null");
                taskDataListener.onDataChange(-1, sparseArray);
            } else {
                recordApi.acquireSummaryFitnessRecord(new ntx.d().b(cbg.d(sparseArray)).d(cbg.e(sparseArray)).d(3).a(), new IBaseResponseCallback() { // from class: bzi
                    @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                    /* JADX INFO: renamed from: onResponse */
                    public final void a(int i, Object obj) {
                        bzl.a(taskDataListener, sparseArray, i, obj);
                    }
                });
            }
        }
    }

    static /* synthetic */ void a(TaskDataListener taskDataListener, SparseArray sparseArray, int i, Object obj) {
        List<FitnessTrackRecord> arrayList = new ArrayList();
        if (njy.b(obj, FitnessTrackRecord.class)) {
            arrayList = (List) obj;
        }
        SparseIntArray sparseIntArray = new SparseIntArray();
        for (FitnessTrackRecord fitnessTrackRecord : arrayList) {
            if (fitnessTrackRecord != null) {
                sparseIntArray.put(CommonUtil.j(fitnessTrackRecord.acquireMonthDate()), fitnessTrackRecord.acquireSumExerciseTimes());
            }
        }
        taskDataListener.onDataChange(0, cgi.d(4, (SparseArray<HealthLifeBean>) sparseArray, sparseIntArray));
    }
}
