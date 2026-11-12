package defpackage;

import android.util.SparseArray;
import com.huawei.basichealthmodel.listener.TaskDataListener;
import com.huawei.basichealthmodel.listener.TaskDayDataListener;
import com.huawei.health.healthdatamgr.api.HealthDataMgrApi;
import com.huawei.health.healthmodel.bean.HealthLifeBean;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.fitnessdatatype.SleepTotalData;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.ConfigMapDefValues;
import health.compact.a.Services;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes23.dex */
public class cfj {
    public static void d(HealthLifeBean healthLifeBean, TaskDayDataListener taskDayDataListener) {
        if (taskDayDataListener == null) {
            LogUtil.j("HL_SleepHelper", "getSleepData listener is null");
            return;
        }
        if (healthLifeBean == null) {
            LogUtil.j("HL_SleepHelper", "getSleepData healthTaskBean is null");
            e(null, taskDayDataListener, -1);
        } else {
            if (!lua.a()) {
                e(healthLifeBean, taskDayDataListener, 0);
                return;
            }
            long jB = cbg.b(healthLifeBean) / 1000;
            LogUtil.a("HL_SleepHelper", "getSleepData dayBeginTime ", Long.valueOf(jB), " healthTaskBean ", healthLifeBean);
            d(jB, healthLifeBean, taskDayDataListener);
        }
    }

    public static void c(SparseArray<HealthLifeBean> sparseArray, TaskDataListener taskDataListener) {
        if (taskDataListener == null) {
            LogUtil.j("HL_SleepHelper", "getWeekSleepData listener is null");
            return;
        }
        if (sparseArray == null || sparseArray.size() < 0) {
            LogUtil.j("HL_SleepHelper", "getWeekSleepData healthTaskBeanArray ", sparseArray);
            d(sparseArray, taskDataListener, -1);
            return;
        }
        if (!lua.a()) {
            d(sparseArray, taskDataListener, 0);
            return;
        }
        int iKeyAt = sparseArray.keyAt(0);
        long jD = cbg.d(sparseArray) / 1000;
        cbg.c(DateFormatUtil.a(lsl.c(System.currentTimeMillis(), -60)) <= iKeyAt, "HL_SleepHelper", "getWeekSleepData dayBeginTime ", Long.valueOf(jD), " healthTaskBeanArray ", sparseArray);
        a(jD, sparseArray, taskDataListener);
    }

    private static void d(long j, final HealthLifeBean healthLifeBean, final TaskDayDataListener taskDayDataListener) {
        HealthDataMgrApi healthDataMgrApi = (HealthDataMgrApi) Services.d("HWHealthDataMgr", HealthDataMgrApi.class);
        if (healthDataMgrApi == null) {
            LogUtil.j("HL_SleepHelper", "requestGetCoreSleepDetail healthDataMgrApi is null");
            e(healthLifeBean, taskDayDataListener, -1);
        } else {
            healthDataMgrApi.getCoreSleepDetail(j, 3, ConfigMapDefValues.DEFAULT_APPLIST_INTERVAL, 2, new IBaseResponseCallback() { // from class: cfl
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i, Object obj) {
                    cfj.c(healthLifeBean, taskDayDataListener, i, obj);
                }
            });
        }
    }

    static /* synthetic */ void c(HealthLifeBean healthLifeBean, TaskDayDataListener taskDayDataListener, int i, Object obj) {
        if (obj != null) {
            e(i, obj, healthLifeBean, taskDayDataListener);
        } else {
            LogUtil.j("HL_SleepHelper", "requestGetCoreSleepDetail errorCode ", Integer.valueOf(i));
            e(healthLifeBean, taskDayDataListener, -1);
        }
    }

    private static void a(long j, final SparseArray<HealthLifeBean> sparseArray, final TaskDataListener taskDataListener) {
        HealthDataMgrApi healthDataMgrApi = (HealthDataMgrApi) Services.d("HWHealthDataMgr", HealthDataMgrApi.class);
        if (healthDataMgrApi == null) {
            LogUtil.j("HL_SleepHelper", "requestWeekCoreSleepDetailData weekHealthDataMgrApi is null");
        } else {
            healthDataMgrApi.getCoreSleepDetail(j, 3, ConfigMapDefValues.DEFAULT_APPLIST_INTERVAL, 8, new IBaseResponseCallback() { // from class: cfi
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i, Object obj) {
                    cfj.a(sparseArray, taskDataListener, i, obj);
                }
            });
        }
    }

    static /* synthetic */ void a(SparseArray sparseArray, TaskDataListener taskDataListener, int i, Object obj) {
        if (obj != null) {
            a(i, obj, (SparseArray<HealthLifeBean>) sparseArray, taskDataListener);
        } else {
            LogUtil.j("HL_SleepHelper", "requestWeekCoreSleepDetailData errorCode ", Integer.valueOf(i));
            d((SparseArray<HealthLifeBean>) sparseArray, taskDataListener, -1);
        }
    }

    private static void e(int i, Object obj, HealthLifeBean healthLifeBean, TaskDayDataListener taskDayDataListener) {
        if (i != 0 || obj == null) {
            LogUtil.j("HL_SleepHelper", "requestGetCoreSleepDetailData else.");
            e(healthLifeBean, taskDayDataListener, -1);
            return;
        }
        List arrayList = new ArrayList(16);
        if (njy.b(obj, SleepTotalData.class)) {
            arrayList = (List) obj;
        }
        if (arrayList.size() == 0) {
            LogUtil.j("HL_SleepHelper", "sleepTotalDataList is null");
            e(healthLifeBean, taskDayDataListener, -1);
            return;
        }
        if (healthLifeBean.getId() == 7 && njy.c(arrayList, 1)) {
            c(healthLifeBean, (SleepTotalData) arrayList.get(1));
            e(healthLifeBean, taskDayDataListener, 0);
        } else if (healthLifeBean.getId() != 6) {
            LogUtil.j("HL_SleepHelper", "processFitnessSleepStatisticData other type");
            e(healthLifeBean, taskDayDataListener, -1);
        } else {
            c(healthLifeBean, (SleepTotalData) arrayList.get(0));
            e(healthLifeBean, taskDayDataListener, 0);
        }
    }

    private static void a(int i, Object obj, SparseArray<HealthLifeBean> sparseArray, TaskDataListener taskDataListener) {
        if (i != 0 || obj == null) {
            LogUtil.j("HL_SleepHelper", "requestGetCoreSleepDetailData else.");
            d(sparseArray, taskDataListener, -1);
            return;
        }
        List arrayList = new ArrayList(16);
        if (njy.b(obj, SleepTotalData.class)) {
            arrayList = (List) obj;
        }
        if (arrayList.size() == 0) {
            LogUtil.j("HL_SleepHelper", "sleepTotalDataList is null");
            d(sparseArray, taskDataListener, -1);
        } else {
            b(sparseArray, taskDataListener, arrayList);
        }
    }

    private static void b(SparseArray<HealthLifeBean> sparseArray, TaskDataListener taskDataListener, List<SleepTotalData> list) {
        for (SleepTotalData sleepTotalData : list) {
            if (sleepTotalData != null) {
                long sleepDayTime = sleepTotalData.getSleepDayTime();
                HealthLifeBean healthLifeBean = sparseArray.get(DateFormatUtil.a(lsl.u(sleepDayTime)));
                if (healthLifeBean != null && healthLifeBean.getId() == 7) {
                    c(healthLifeBean, sleepTotalData);
                }
                HealthLifeBean healthLifeBean2 = sparseArray.get(DateFormatUtil.a(sleepDayTime));
                if (healthLifeBean2 != null && healthLifeBean2.getId() == 6) {
                    c(healthLifeBean2, sleepTotalData);
                }
            }
        }
        d(sparseArray, taskDataListener, 0);
    }

    private static void d(SparseArray<HealthLifeBean> sparseArray, TaskDataListener taskDataListener, int i) {
        if (taskDataListener != null) {
            taskDataListener.onDataChange(i, sparseArray);
        }
    }

    private static void e(HealthLifeBean healthLifeBean, TaskDayDataListener taskDayDataListener, int i) {
        if (taskDayDataListener != null) {
            taskDayDataListener.onDataChange(i, healthLifeBean);
        }
    }

    private static void c(HealthLifeBean healthLifeBean, SleepTotalData sleepTotalData) {
        int iD;
        String target = healthLifeBean.getTarget();
        int recordDay = healthLifeBean.getRecordDay();
        int iD2 = cfu.d(target);
        int i = 0;
        if (healthLifeBean.getId() == 7) {
            iD = c(sleepTotalData);
            LogUtil.a("HL_SleepHelper", "setHealthTaskBean ID_SLEEP taskTime ", 0);
            i = iD + 1200;
            if (i >= 1440) {
                TimeZone timeZoneA = lsl.a(healthLifeBean.getTimeZone());
                recordDay = DateFormatUtil.a(lsl.t(cbg.b(healthLifeBean), timeZoneA), timeZoneA);
                i = iD - 240;
            }
        } else if (healthLifeBean.getId() == 6) {
            iD = d(sleepTotalData);
            LogUtil.a("HL_SleepHelper", "setHealthTaskBean ID_WAKE_UP taskTime ", 0);
            i = iD + 1200;
            if (i > 1440) {
                i = iD - 240;
            }
        } else {
            LogUtil.j("HL_SleepHelper", "setHealthTaskBean other type");
        }
        e(healthLifeBean, i, recordDay, iD2, sleepTotalData);
        c(healthLifeBean, sleepTotalData, i, recordDay);
    }

    private static int c(SleepTotalData sleepTotalData) {
        int fallTime = sleepTotalData.getFallTime();
        if (fallTime <= 0) {
            fallTime = sleepTotalData.getCommonFallTime();
        }
        if (fallTime <= 0) {
            fallTime = sleepTotalData.getManualFallTime();
        }
        LogUtil.a("HL_SleepHelper", "getSleepTime fallTime ", Integer.valueOf(sleepTotalData.getFallTime()), " commonFallTime ", Integer.valueOf(sleepTotalData.getCommonFallTime()), " manualFallTime ", Integer.valueOf(sleepTotalData.getManualFallTime()));
        return fallTime;
    }

    private static int d(SleepTotalData sleepTotalData) {
        int wakeUpTime = sleepTotalData.getWakeUpTime();
        if (wakeUpTime <= 0) {
            wakeUpTime = sleepTotalData.getCommonWakeUpTime();
        }
        if (wakeUpTime <= 0) {
            wakeUpTime = sleepTotalData.getManualWakeUpTime();
        }
        LogUtil.a("HL_SleepHelper", "getWakeTime wakeUpTime ", Integer.valueOf(sleepTotalData.getWakeUpTime()), " commonWakeUpTime ", Integer.valueOf(sleepTotalData.getCommonWakeUpTime()), " manualRisingTime ", Integer.valueOf(sleepTotalData.getManualWakeUpTime()));
        return wakeUpTime;
    }

    private static void e(HealthLifeBean healthLifeBean, int i, int i2, int i3, SleepTotalData sleepTotalData) {
        if (healthLifeBean.getId() == 6 && i2 == healthLifeBean.getRecordDay() && Math.abs(i3 - i) <= 60 && healthLifeBean.getComplete() == 0 && a(sleepTotalData)) {
            LogUtil.a("HL_SleepHelper", "getHealthTaskBean ID_WAKE_UP ", cfu.e(i2, i));
            c(healthLifeBean);
        }
        if (healthLifeBean.getId() == 7 && i2 == healthLifeBean.getRecordDay() && i <= i3 + 60 && healthLifeBean.getComplete() == 0 && a(sleepTotalData)) {
            LogUtil.a("HL_SleepHelper", "getHealthTaskBean ID_SLEEP ", cfu.e(i2, i));
            c(healthLifeBean);
        }
    }

    private static void c(HealthLifeBean healthLifeBean, SleepTotalData sleepTotalData, int i, int i2) {
        String strE = cfu.e(i2, i);
        LogUtil.a("HL_SleepHelper", "setHealthTaskBeanResult result ", strE, " healthTaskBean ", healthLifeBean);
        if (a(sleepTotalData)) {
            healthLifeBean.setResult(strE);
        }
    }

    private static boolean a(SleepTotalData sleepTotalData) {
        int type = sleepTotalData.getType();
        int totalSleepTime = sleepTotalData.getTotalSleepTime();
        int manualBedTime = sleepTotalData.getManualBedTime();
        int shallowSleepTime = sleepTotalData.getShallowSleepTime();
        int deepSleepTime = sleepTotalData.getDeepSleepTime();
        int commonWakeUpTime = sleepTotalData.getCommonWakeUpTime();
        int commonFallTime = sleepTotalData.getCommonFallTime();
        LogUtil.a("HL_SleepHelper", "checkDataValid type ", Integer.valueOf(type), " totalSleepTime ", Integer.valueOf(totalSleepTime), " manualBedTime ", Integer.valueOf(manualBedTime), " shallowSleepTime ", Integer.valueOf(shallowSleepTime), " deepSleepTime ", Integer.valueOf(deepSleepTime), " commonWakeUpTime ", Integer.valueOf(commonWakeUpTime), " commonFallTime ", Integer.valueOf(commonFallTime));
        if (type == 31 && (totalSleepTime > 0 || manualBedTime > 0)) {
            return true;
        }
        if (type == 30) {
            return totalSleepTime > 0 || manualBedTime > 0 || shallowSleepTime > 0 || deepSleepTime > 0 || commonWakeUpTime != commonFallTime;
        }
        return false;
    }

    private static void c(HealthLifeBean healthLifeBean) {
        if (healthLifeBean.getComplete() <= 0) {
            cbk.c(healthLifeBean.getId(), 1);
        }
        healthLifeBean.setComplete(1);
        long jCurrentTimeMillis = System.currentTimeMillis();
        healthLifeBean.setTimestamp(jCurrentTimeMillis);
        healthLifeBean.setTimeZone(lsl.q(jCurrentTimeMillis));
        healthLifeBean.setIsUpdated(true);
        healthLifeBean.setSyncStatus(0);
    }
}
