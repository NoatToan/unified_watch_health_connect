package defpackage;

import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import com.google.gson.reflect.TypeToken;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.healthdatamgr.api.HealthDataMgrApi;
import com.huawei.health.healthmodel.bean.BloodPressurePlanResultBean;
import com.huawei.health.healthmodel.bean.HealthLifeBean;
import com.huawei.hihealth.HiAggregateOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiAggregateListener;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwcommonmodel.fitnessdatatype.SleepTotalData;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.ConfigMapDefValues;
import com.huawei.operation.ble.BleConstants;
import health.compact.a.CommonUtil;
import health.compact.a.CommonUtils;
import health.compact.a.Services;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes23.dex */
public class cbq {
    private static final AtomicBoolean e = new AtomicBoolean(true);

    public static void a(final String str) {
        if (HandlerExecutor.c()) {
            cbg.b(ThreadPoolManager.c(), new Runnable() { // from class: cbx
                @Override // java.lang.Runnable
                public final void run() {
                    cbq.a(str);
                }
            });
        } else {
            dfp.e((ResponseCallback<Pair<Long, List<dfl>>>) new ResponseCallback() { // from class: cbv
                @Override // com.huawei.hwbasemgr.ResponseCallback
                public final void onResponse(int i, Object obj) {
                    cbq.d((Pair<Long, List<dfl>>) obj, str);
                }
            });
        }
    }

    public static void d(Pair<Long, List<dfl>> pair, String str) {
        List list = (List) pair.second;
        if (njy.e(list)) {
            LogUtil.j("HL_BloodPressureMeasureUtil", "refreshBloodPressureMeasurePlan list ", list);
            return;
        }
        e(String.valueOf(list.size()), str);
        ccy.d("bloodPressureMeasurePlan", HiJsonUtil.d(list));
        ccy.d("bloodPressureMeasurePlanSaveTime", String.valueOf(pair.first));
        dfl dflVar = (dfl) list.get(0);
        if (dflVar != null) {
            ccy.d("blood_pressure_day_of_week", String.valueOf(dflVar.a()));
        }
    }

    public static void e(final String str, final String str2) {
        if (HandlerExecutor.c()) {
            cbg.b(ThreadPoolManager.c(), new Runnable() { // from class: cbw
                @Override // java.lang.Runnable
                public final void run() {
                    cbq.e(str, str2);
                }
            });
            return;
        }
        int iA = DateFormatUtil.a(lsl.w(System.currentTimeMillis()));
        HealthLifeBean healthLifeBeanB = bxd.b(1, iA, str2);
        if (TextUtils.isEmpty(healthLifeBeanB.getTarget()) || !healthLifeBeanB.getTarget().contains(String.valueOf(12))) {
            LogUtil.a("HL_BloodPressureMeasureUtil", "setBloodPressureTarget cloverBean ", healthLifeBeanB);
            return;
        }
        HealthLifeBean healthLifeBeanB2 = bxd.b(12, iA, str2);
        if (cbg.h(healthLifeBeanB2) && iA == healthLifeBeanB2.getRecordDay()) {
            healthLifeBeanB2.setTarget(str);
            bxd.c(healthLifeBeanB2, str2);
        }
    }

    public static void a(final HealthLifeBean healthLifeBean, final ResponseCallback<HealthLifeBean> responseCallback) {
        if (responseCallback == null) {
            LogUtil.j("HL_BloodPressureMeasureUtil", "getTaskNewestResult listener is null");
            return;
        }
        if (healthLifeBean == null) {
            responseCallback.onResponse(-1, null);
            return;
        }
        if (HandlerExecutor.c()) {
            cbg.b(ThreadPoolManager.c(), new Runnable() { // from class: cby
                @Override // java.lang.Runnable
                public final void run() {
                    cbq.a(healthLifeBean, (ResponseCallback<HealthLifeBean>) responseCallback);
                }
            });
            return;
        }
        List<dfl> listB = b();
        if (njy.e(listB) || listB.size() < 2) {
            responseCallback.onResponse(-1, healthLifeBean);
            return;
        }
        dfl dflVar = listB.get(0);
        dfl dflVar2 = listB.get(listB.size() - 1);
        if (dflVar == null || dflVar2 == null) {
            LogUtil.j("HL_BloodPressureMeasureUtil", "getTaskNewestResult wokeUpAlarm or sleepAlarm is null");
            responseCallback.onResponse(-1, null);
            return;
        }
        int recordDay = healthLifeBean.getRecordDay();
        long jB = cbg.b(healthLifeBean);
        long jA = lsl.a(jB, dflVar.c(), dflVar.e());
        long jA2 = lsl.a(jB, dflVar2.c(), dflVar2.e());
        long jC = cbg.c(healthLifeBean);
        final boolean z = jA > jA2;
        if (z) {
            jB += 9000000;
            jC += 9000000;
        }
        LogUtil.a("HL_BloodPressureMeasureUtil", "getTaskNewestResult recordDay ", Integer.valueOf(recordDay), " startTime ", Long.valueOf(jB), " endTime ", Long.valueOf(jC), " isCrossDay ", Boolean.valueOf(z));
        final List<BloodPressurePlanResultBean> listD = d(listB);
        d(jB, jC, new HiAggregateListener() { // from class: cbq.5
            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResultIntent(int i, List<HiHealthData> list, int i2, int i3) {
            }

            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResult(List<HiHealthData> list, int i, int i2) {
                cbq.e(z, healthLifeBean, list, listD, responseCallback);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(boolean z, HealthLifeBean healthLifeBean, List<HiHealthData> list, List<BloodPressurePlanResultBean> list2, ResponseCallback<HealthLifeBean> responseCallback) {
        int iA = a();
        int recordDay = healthLifeBean.getRecordDay();
        b(healthLifeBean, iA, list2.size());
        int complete = healthLifeBean.getComplete();
        if (iA <= recordDay && complete <= 0 && cbg.b(cbg.c(healthLifeBean))) {
            healthLifeBean.setRest(1);
            e(healthLifeBean);
        }
        if (njy.e(list)) {
            LogUtil.j("HL_BloodPressureMeasureUtil", "handlePressureDayData dataList is empty");
            healthLifeBean.setExtendInfo(HiJsonUtil.d(list2));
            responseCallback.onResponse(0, healthLifeBean);
            return;
        }
        SparseArray<List<BloodPressurePlanResultBean>> sparseArrayC = c(list, list2, z);
        if (sparseArrayC.size() == 0) {
            healthLifeBean.setExtendInfo(HiJsonUtil.d(list2));
            responseCallback.onResponse(0, healthLifeBean);
            return;
        }
        List<BloodPressurePlanResultBean> list3 = sparseArrayC.get(recordDay);
        int iE = e(list3);
        boolean zE = e(list3.get(0));
        boolean zE2 = e(list3.get(list3.size() - 1));
        LogUtil.a("HL_BloodPressureMeasureUtil", "handlePressureDayData isCompleteWakeUp=", Boolean.valueOf(zE), ",isCompleteSleep=", Boolean.valueOf(zE2), ",recordDay=", Integer.valueOf(recordDay), ",count=", Integer.valueOf(iE));
        if (healthLifeBean.getComplete() == 0 && zE && zE2) {
            e(healthLifeBean);
        }
        healthLifeBean.setResult(String.valueOf(iE));
        healthLifeBean.setExtendInfo(HiJsonUtil.d(list3));
        if (zE) {
            responseCallback.onResponse(0, healthLifeBean);
        } else {
            c(list3, list, healthLifeBean, zE2, responseCallback);
        }
    }

    private static void c(final List<BloodPressurePlanResultBean> list, final List<HiHealthData> list2, final HealthLifeBean healthLifeBean, final boolean z, final ResponseCallback<HealthLifeBean> responseCallback) {
        final int recordDay = healthLifeBean.getRecordDay();
        long jB = cbg.b(healthLifeBean) / 1000;
        LogUtil.a("HL_BloodPressureMeasureUtil", "getSleepDayData recordDay=" + recordDay + ",unitSize=", Integer.valueOf(ConfigMapDefValues.DEFAULT_APPLIST_INTERVAL), ",unitCount=", 2, ",unitType=", 3);
        HealthDataMgrApi healthDataMgrApi = (HealthDataMgrApi) Services.d("HWHealthDataMgr", HealthDataMgrApi.class);
        if (healthDataMgrApi == null) {
            LogUtil.j("HL_BloodPressureMeasureUtil", "getSleepDayData : healthDataMgrApi is null.");
            healthLifeBean.setExtendInfo(HiJsonUtil.d(list));
            responseCallback.onResponse(0, healthLifeBean);
            return;
        }
        healthDataMgrApi.getCoreSleepDetail(jB, 3, ConfigMapDefValues.DEFAULT_APPLIST_INTERVAL, 2, new IBaseResponseCallback() { // from class: cbz
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                cbq.c(healthLifeBean, list, responseCallback, recordDay, list2, z, i, obj);
            }
        });
    }

    static /* synthetic */ void c(HealthLifeBean healthLifeBean, List list, ResponseCallback responseCallback, int i, List list2, boolean z, int i2, Object obj) {
        LogUtil.a("HL_BloodPressureMeasureUtil", "getSleepDayData getCoreSleepDetail onResponse errorCode=", Integer.valueOf(i2));
        if (!njy.b(obj, SleepTotalData.class)) {
            healthLifeBean.setExtendInfo(HiJsonUtil.d(list));
            responseCallback.onResponse(0, healthLifeBean);
            return;
        }
        SleepTotalData sleepTotalData = (SleepTotalData) ((List) obj).get(0);
        if (!e(sleepTotalData)) {
            LogUtil.a("HL_BloodPressureMeasureUtil", "getSleepDayData sleepTotalDataList checkDataValid false");
            healthLifeBean.setExtendInfo(HiJsonUtil.d(list));
            responseCallback.onResponse(0, healthLifeBean);
            return;
        }
        int wakeUpTime = sleepTotalData.getWakeUpTime();
        if (wakeUpTime == 0) {
            wakeUpTime = sleepTotalData.getCommonWakeUpTime();
        }
        if (sleepTotalData.isPhone()) {
            wakeUpTime = (int) sleepTotalData.getPhoneStartTime();
        }
        int i3 = wakeUpTime + 1200;
        if (i3 > 1440) {
            i3 = wakeUpTime - 240;
        }
        b(z, a((List<HiHealthData>) list2, d(i, i3)), healthLifeBean, list, responseCallback);
    }

    private static void b(boolean z, HiHealthData hiHealthData, HealthLifeBean healthLifeBean, List<BloodPressurePlanResultBean> list, ResponseCallback<HealthLifeBean> responseCallback) {
        if (hiHealthData == null) {
            healthLifeBean.setExtendInfo(HiJsonUtil.d(list));
            responseCallback.onResponse(0, healthLifeBean);
            return;
        }
        ArrayList arrayList = new ArrayList();
        BloodPressurePlanResultBean bloodPressurePlanResultBean = null;
        for (BloodPressurePlanResultBean bloodPressurePlanResultBean2 : list) {
            if (bloodPressurePlanResultBean2 != null) {
                if (bloodPressurePlanResultBean2.getPlanId() == 0) {
                    bloodPressurePlanResultBean = bloodPressurePlanResultBean2;
                } else {
                    arrayList.add(bloodPressurePlanResultBean2);
                }
            }
        }
        if (bloodPressurePlanResultBean != null) {
            bloodPressurePlanResultBean.setPressureTime(hiHealthData.getStartTime());
            bloodPressurePlanResultBean.setBloodPressureSystolic(hiHealthData.getDouble("BLOOD_PRESSURE_SYSTOLIC"));
            bloodPressurePlanResultBean.setBloodPressureDiastolic(hiHealthData.getDouble("BLOOD_PRESSURE_DIASTOLIC"));
            arrayList.add(0, bloodPressurePlanResultBean);
        }
        healthLifeBean.setExtendInfo(HiJsonUtil.d(lsm.e(arrayList)));
        b(healthLifeBean);
        if (z) {
            e(healthLifeBean);
        }
        LogUtil.a("HL_BloodPressureMeasureUtil", "refreshDayTask taskBean ", healthLifeBean);
        responseCallback.onResponse(0, healthLifeBean);
    }

    private static void c(SparseArray<HealthLifeBean> sparseArray, List<dfl> list) {
        if (njy.e(list)) {
            return;
        }
        int iA = a();
        int size = list.size();
        int size2 = sparseArray.size();
        for (int i = 0; i < size2; i++) {
            b(sparseArray.valueAt(i), iA, size);
        }
    }

    private static void b(HealthLifeBean healthLifeBean, int i, int i2) {
        if (healthLifeBean == null) {
            LogUtil.j("HL_BloodPressureMeasureUtil", "setTarget lifeBean is null");
        } else if (CommonUtils.j(healthLifeBean.getTarget()) < 2 || (i != 0 && healthLifeBean.getRecordDay() > i)) {
            healthLifeBean.setTarget(String.valueOf(Math.max(i2, 2)));
        }
    }

    private static void d(SparseArray<HealthLifeBean> sparseArray, String str) {
        int iA = a();
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            HealthLifeBean healthLifeBeanValueAt = sparseArray.valueAt(i);
            if (healthLifeBeanValueAt != null) {
                int iKeyAt = sparseArray.keyAt(i);
                int complete = healthLifeBeanValueAt.getComplete();
                boolean zB = cbg.b(cbg.b(sparseArray.get(iKeyAt)));
                if (complete == 0 && zB) {
                    healthLifeBeanValueAt.setRest(1);
                    healthLifeBeanValueAt.setComplete(1);
                    healthLifeBeanValueAt.setIsUpdated(true);
                }
                if (CommonUtils.j(healthLifeBeanValueAt.getTarget()) < 2 || (iA != 0 && iKeyAt > iA)) {
                    healthLifeBeanValueAt.setTarget(str);
                }
                LogUtil.a("HL_BloodPressureMeasureUtil", "updateTaskBean startDay=", Integer.valueOf(iKeyAt), ",status=", Integer.valueOf(complete), ",isRest=", Boolean.valueOf(zB), ",target=", healthLifeBeanValueAt.getTarget());
            }
        }
    }

    private static void e(HealthLifeBean healthLifeBean) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (healthLifeBean.getComplete() <= 0 && healthLifeBean.getRecordDay() == DateFormatUtil.a(jCurrentTimeMillis)) {
            cbk.c(healthLifeBean.getId(), 1);
        }
        healthLifeBean.setComplete(1);
        healthLifeBean.setTimestamp(jCurrentTimeMillis);
        healthLifeBean.setTimeZone(lsl.q(jCurrentTimeMillis));
        healthLifeBean.setSyncStatus(0);
        healthLifeBean.setIsUpdated(true);
    }

    public static List<dfl> b() {
        ArrayList arrayList = new ArrayList();
        if (DateFormatUtil.a(CommonUtil.i(ccy.c("bloodPressureMeasurePlanSaveTime"))) == DateFormatUtil.a(System.currentTimeMillis())) {
            List<dfl> listA = cbg.a(ccy.c("bloodPressureMeasurePlan"));
            LogUtil.a("HL_BloodPressureMeasureUtil", "getAlarmInfo infoList ", listA);
            if (njy.b(listA)) {
                arrayList.addAll(listA);
            }
        }
        if (njy.e(arrayList)) {
            AtomicBoolean atomicBoolean = e;
            if (atomicBoolean.get()) {
                List<dfl> listC = dfp.c();
                if (njy.b(listC)) {
                    atomicBoolean.set(false);
                    ccy.d("bloodPressureMeasurePlan", HiJsonUtil.d(listC));
                }
                arrayList.addAll(listC);
            }
        }
        if (njy.e(arrayList)) {
            List<dfl> listA2 = cbg.a(ccy.c("bloodPressureMeasurePlan"));
            if (njy.e(listA2)) {
                listA2 = cbg.g();
            }
            arrayList.addAll(listA2);
        }
        LogUtil.a("HL_BloodPressureMeasureUtil", "getAlarmInfo list ", arrayList);
        if (njy.b(arrayList)) {
            cbg.e(arrayList);
            dfl dflVar = (dfl) arrayList.get(0);
            if (dflVar != null) {
                ccy.d("blood_pressure_day_of_week", String.valueOf(dflVar.a()));
            }
        }
        return arrayList;
    }

    public static void d(SparseArray<HealthLifeBean> sparseArray, ResponseCallback<SparseArray<HealthLifeBean>> responseCallback) {
        if (responseCallback == null) {
            LogUtil.j("HL_BloodPressureMeasureUtil", "getTaskNewestWeekResults listener is null");
            return;
        }
        if (sparseArray == null || sparseArray.size() <= 0) {
            LogUtil.j("HL_BloodPressureMeasureUtil", "getTaskNewestWeekResults taskList is empty");
            responseCallback.onResponse(0, sparseArray);
            return;
        }
        List<dfl> listB = b();
        if (njy.e(listB) || listB.size() < 2) {
            LogUtil.a("HL_BloodPressureMeasureUtil", "getTaskNewestWeekResults alarmInfoList error");
            c(sparseArray, listB);
            responseCallback.onResponse(0, sparseArray);
        } else {
            d(sparseArray, String.valueOf(listB.size()));
            e(sparseArray, listB, responseCallback);
        }
    }

    private static int e(List<BloodPressurePlanResultBean> list) {
        int i = 0;
        if (njy.e(list)) {
            LogUtil.a("HL_BloodPressureMeasureUtil", "getPlanCompleteCount planResultList is empty");
            return 0;
        }
        for (BloodPressurePlanResultBean bloodPressurePlanResultBean : list) {
            if (bloodPressurePlanResultBean != null && bloodPressurePlanResultBean.getPressureTime() > 0) {
                i++;
            }
        }
        return i;
    }

    private static boolean c(dfl dflVar, dfl dflVar2) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        return lsl.a(jCurrentTimeMillis, dflVar.c(), dflVar.e()) > lsl.a(jCurrentTimeMillis, dflVar2.c(), dflVar2.e());
    }

    private static void e(final SparseArray<HealthLifeBean> sparseArray, List<dfl> list, final ResponseCallback<SparseArray<HealthLifeBean>> responseCallback) {
        dfl dflVar = list.get(0);
        dfl dflVar2 = list.get(list.size() - 1);
        if (dflVar == null || dflVar2 == null) {
            LogUtil.j("HL_BloodPressureMeasureUtil", "getPressureWeekData startPlan or endPlan is null");
            responseCallback.onResponse(0, sparseArray);
            return;
        }
        final int iKeyAt = sparseArray.keyAt(0);
        final int iKeyAt2 = sparseArray.keyAt(sparseArray.size() - 1);
        long jD = cbg.d(sparseArray);
        long jE = cbg.e(sparseArray);
        final boolean zC = c(dflVar, dflVar2);
        if (zC) {
            jD += 9000000;
            jE += 9000000;
        }
        LogUtil.a("HL_BloodPressureMeasureUtil", "getPressureWeekData startTime ", Long.valueOf(jD), " endTime ", Long.valueOf(jE), " isCrossDay ", Boolean.valueOf(zC), " startDay ", Integer.valueOf(iKeyAt), " endDay ", Integer.valueOf(iKeyAt2));
        final List<BloodPressurePlanResultBean> listD = d(list);
        d(sparseArray, listD);
        d(jD, jE, new HiAggregateListener() { // from class: cbq.1
            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResult(List<HiHealthData> list2, int i, int i2) {
                if (!njy.e(list2)) {
                    SparseArray sparseArrayC = cbq.c(list2, listD, zC);
                    if (sparseArrayC.size() != 0) {
                        cbq.a((SparseArray<List<BloodPressurePlanResultBean>>) sparseArrayC, (SparseArray<HealthLifeBean>) sparseArray);
                        SparseArray sparseArray2 = sparseArray;
                        int i3 = iKeyAt;
                        cbq.c(list2, (SparseArray<HealthLifeBean>) sparseArray2, i3, lsl.a(DateFormatUtil.d(i3), DateFormatUtil.d(iKeyAt2)), (ResponseCallback<SparseArray<HealthLifeBean>>) responseCallback);
                        return;
                    }
                    responseCallback.onResponse(0, sparseArray);
                    return;
                }
                LogUtil.j("HL_BloodPressureMeasureUtil", "getPressureWeekData onResult dataList empty");
                responseCallback.onResponse(0, sparseArray);
            }

            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResultIntent(int i, List<HiHealthData> list2, int i2, int i3) {
                LogUtil.a("HL_BloodPressureMeasureUtil", "getPressureWeekData onResultIntent callback");
            }
        });
    }

    private static void d(SparseArray<HealthLifeBean> sparseArray, List<BloodPressurePlanResultBean> list) {
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            HealthLifeBean healthLifeBeanValueAt = sparseArray.valueAt(i);
            if (healthLifeBeanValueAt != null) {
                healthLifeBeanValueAt.setExtendInfo(HiJsonUtil.d(lsm.e(list)));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static SparseArray<List<BloodPressurePlanResultBean>> c(List<HiHealthData> list, List<BloodPressurePlanResultBean> list2, boolean z) {
        SparseArray<List<BloodPressurePlanResultBean>> sparseArray = new SparseArray<>();
        for (Map.Entry<Integer, List<HiHealthData>> entry : d(list, z).entrySet()) {
            List<HiHealthData> value = entry.getValue();
            if (!njy.e(value)) {
                sparseArray.put(entry.getKey().intValue(), b(z, (List<BloodPressurePlanResultBean>) lsm.e(list2), value));
            }
        }
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            c(sparseArray.valueAt(i));
        }
        return sparseArray;
    }

    private static List<BloodPressurePlanResultBean> b(boolean z, List<BloodPressurePlanResultBean> list, List<HiHealthData> list2) {
        HiHealthData hiHealthDataE;
        if (njy.e(list)) {
            LogUtil.j("HL_BloodPressureMeasureUtil", "convertPressurePlanData planResultRecord is empty");
            return Collections.EMPTY_LIST;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            BloodPressurePlanResultBean bloodPressurePlanResultBean = list.get(i);
            if (bloodPressurePlanResultBean != null && (hiHealthDataE = e(list2, bloodPressurePlanResultBean, z)) != null) {
                bloodPressurePlanResultBean.setPressureTime(hiHealthDataE.getStartTime());
                bloodPressurePlanResultBean.setBloodPressureSystolic(hiHealthDataE.getDouble("BLOOD_PRESSURE_SYSTOLIC"));
                bloodPressurePlanResultBean.setBloodPressureDiastolic(hiHealthDataE.getDouble("BLOOD_PRESSURE_DIASTOLIC"));
            }
        }
        return list;
    }

    private static HiHealthData e(List<HiHealthData> list, BloodPressurePlanResultBean bloodPressurePlanResultBean, boolean z) {
        long maxTime = bloodPressurePlanResultBean.getMaxTime();
        long minTime = bloodPressurePlanResultBean.getMinTime();
        int size = list.size();
        HiHealthData hiHealthData = null;
        for (int i = 0; i < size; i++) {
            HiHealthData hiHealthData2 = list.get(i);
            if (hiHealthData2 != null) {
                long startTime = hiHealthData2.getStartTime();
                long jC = c(startTime, z);
                if (jC <= maxTime && jC >= minTime && (hiHealthData == null || hiHealthData.getStartTime() < startTime)) {
                    hiHealthData = hiHealthData2;
                }
            }
        }
        return hiHealthData;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(SparseArray<List<BloodPressurePlanResultBean>> sparseArray, SparseArray<HealthLifeBean> sparseArray2) {
        long jA = a();
        if (jA <= 0) {
            jA = System.currentTimeMillis();
        }
        int iA = DateFormatUtil.a(jA);
        int size = sparseArray2.size();
        for (int i = 0; i < size; i++) {
            int iKeyAt = sparseArray2.keyAt(i);
            HealthLifeBean healthLifeBean = sparseArray2.get(iKeyAt);
            if (iA <= iKeyAt && healthLifeBean.getComplete() == 0 && cbg.b(cbg.b(healthLifeBean))) {
                healthLifeBean.setRest(1);
                e(healthLifeBean);
            }
            List<BloodPressurePlanResultBean> list = sparseArray.get(iKeyAt);
            if (njy.e(list)) {
                LogUtil.a("HL_BloodPressureMeasureUtil", "refreshWeekTaskList planResultList is empty", ", recordDay ", Integer.valueOf(iKeyAt));
            } else {
                int iE = e(list);
                boolean zE = e(list.get(0));
                boolean zE2 = e(list.get(list.size() - 1));
                LogUtil.a("HL_BloodPressureMeasureUtil", "refreshWeekTaskList isCompleteWakeUp=", Boolean.valueOf(zE), ",isCompleteSleep=", Boolean.valueOf(zE2), ",recordDay=", Integer.valueOf(iKeyAt), ",count=", Integer.valueOf(iE));
                if (healthLifeBean.getComplete() == 0 && zE && zE2) {
                    e(healthLifeBean);
                }
                healthLifeBean.setResult(String.valueOf(iE));
                healthLifeBean.setExtendInfo(HiJsonUtil.d(list));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(final List<HiHealthData> list, final SparseArray<HealthLifeBean> sparseArray, int i, int i2, final ResponseCallback<SparseArray<HealthLifeBean>> responseCallback) {
        LogUtil.a("HL_BloodPressureMeasureUtil", "getSleepWeekDate startDay=", Integer.valueOf(i), ",intervalDays=", Integer.valueOf(i2));
        long jD = DateFormatUtil.d(i) / 1000;
        LogUtil.a("HL_BloodPressureMeasureUtil", "getSleepWeekDate unitSize=", Integer.valueOf(ConfigMapDefValues.DEFAULT_APPLIST_INTERVAL), ",unitCount=", 8, ",unitType=", 3, ",beginTime=", Long.valueOf(jD));
        HealthDataMgrApi healthDataMgrApi = (HealthDataMgrApi) Services.d("HWHealthDataMgr", HealthDataMgrApi.class);
        if (healthDataMgrApi == null) {
            LogUtil.j("HL_BloodPressureMeasureUtil", "getSleepWeekDate healthDataMgrApi is null.");
            responseCallback.onResponse(0, sparseArray);
        } else {
            healthDataMgrApi.getCoreSleepDetail(jD, 3, ConfigMapDefValues.DEFAULT_APPLIST_INTERVAL, 8, new IBaseResponseCallback() { // from class: cbs
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i3, Object obj) {
                    cbq.c(list, sparseArray, responseCallback, i3, obj);
                }
            });
        }
    }

    static /* synthetic */ void c(List list, SparseArray sparseArray, ResponseCallback responseCallback, int i, Object obj) {
        LogUtil.a("HL_BloodPressureMeasureUtil", "getSleepWeekDate onResponse errorCode = ", Integer.valueOf(i));
        if (njy.b(obj, SleepTotalData.class)) {
            a(list, sparseArray, (List) obj, responseCallback);
        } else {
            responseCallback.onResponse(0, sparseArray);
        }
    }

    private static void a(List<HiHealthData> list, SparseArray<HealthLifeBean> sparseArray, List<SleepTotalData> list2, ResponseCallback<SparseArray<HealthLifeBean>> responseCallback) {
        int iA;
        HealthLifeBean healthLifeBean;
        List<BloodPressurePlanResultBean> listC;
        BloodPressurePlanResultBean bloodPressurePlanResultBeanB;
        if (njy.e(list2)) {
            LogUtil.j("HL_BloodPressureMeasureUtil", "processWeekFitnessSleepData sleepList is empty");
            responseCallback.onResponse(0, sparseArray);
            return;
        }
        LogUtil.a("HL_BloodPressureMeasureUtil", "processWeekFitnessSleepData size=", Integer.valueOf(list2.size()));
        for (SleepTotalData sleepTotalData : list2) {
            if (sleepTotalData != null && (healthLifeBean = sparseArray.get((iA = DateFormatUtil.a(sleepTotalData.getSleepDayTime())))) != null && (bloodPressurePlanResultBeanB = b((listC = c(healthLifeBean)))) != null && bloodPressurePlanResultBeanB.getPressureTime() <= 0) {
                int wakeUpTime = sleepTotalData.getWakeUpTime();
                if (wakeUpTime == 0) {
                    wakeUpTime = sleepTotalData.getCommonWakeUpTime();
                }
                if (sleepTotalData.isPhone()) {
                    wakeUpTime = (int) sleepTotalData.getPhoneStartTime();
                }
                int i = wakeUpTime + 1200;
                if (i > 1440) {
                    i = wakeUpTime - 240;
                }
                if (e(sleepTotalData)) {
                    long jD = d(iA, i);
                    HiHealthData hiHealthDataA = a(list, jD);
                    LogUtil.a("HL_BloodPressureMeasureUtil", "processWeekFitnessSleepData sleepDay ", Integer.valueOf(iA), " sleepTime ", Integer.valueOf(i), " wokeUpTime ", Long.valueOf(jD), " wokeUp ", hiHealthDataA);
                    if (hiHealthDataA != null) {
                        ArrayList arrayList = new ArrayList();
                        for (BloodPressurePlanResultBean bloodPressurePlanResultBean : listC) {
                            if (bloodPressurePlanResultBean != null && bloodPressurePlanResultBean.getPlanId() != 0) {
                                arrayList.add(bloodPressurePlanResultBean);
                            }
                        }
                        bloodPressurePlanResultBeanB.setPressureTime(hiHealthDataA.getStartTime());
                        bloodPressurePlanResultBeanB.setBloodPressureSystolic(hiHealthDataA.getDouble("BLOOD_PRESSURE_SYSTOLIC"));
                        bloodPressurePlanResultBeanB.setBloodPressureDiastolic(hiHealthDataA.getDouble("BLOOD_PRESSURE_DIASTOLIC"));
                        arrayList.add(0, bloodPressurePlanResultBeanB);
                        healthLifeBean.setExtendInfo(HiJsonUtil.d(lsm.e(arrayList)));
                        b(healthLifeBean);
                    }
                }
            }
        }
        LogUtil.a("HL_BloodPressureMeasureUtil", "processWeekFitnessSleepData taskList ", sparseArray);
        responseCallback.onResponse(0, sparseArray);
    }

    private static void b(HealthLifeBean healthLifeBean) {
        String extendInfo = healthLifeBean.getExtendInfo();
        if (TextUtils.isEmpty(extendInfo)) {
            LogUtil.j("HL_BloodPressureMeasureUtil", "adaptWakeupResult extendInfo is empty");
            return;
        }
        List list = (List) HiJsonUtil.d(extendInfo, new TypeToken<List<BloodPressurePlanResultBean>>() { // from class: com.huawei.basichealthmodel.util.BloodPressureMeasureUtil$3
        }.getType());
        if (njy.e(list)) {
            LogUtil.j("HL_BloodPressureMeasureUtil", "adaptWakeupResult pressureList is empty");
        } else {
            healthLifeBean.setResult(String.valueOf(e((List<BloodPressurePlanResultBean>) list)));
        }
    }

    private static List<BloodPressurePlanResultBean> c(HealthLifeBean healthLifeBean) {
        String extendInfo = healthLifeBean.getExtendInfo();
        if (TextUtils.isEmpty(extendInfo)) {
            LogUtil.j("HL_BloodPressureMeasureUtil", "getExtendInfo extendInfo ", extendInfo);
            return Collections.EMPTY_LIST;
        }
        List<BloodPressurePlanResultBean> list = (List) HiJsonUtil.d(extendInfo, new TypeToken<List<BloodPressurePlanResultBean>>() { // from class: com.huawei.basichealthmodel.util.BloodPressureMeasureUtil$4
        }.getType());
        if (!njy.e(list)) {
            return list;
        }
        LogUtil.j("HL_BloodPressureMeasureUtil", "getExtendInfo planResultList ", list);
        return Collections.EMPTY_LIST;
    }

    private static BloodPressurePlanResultBean b(List<BloodPressurePlanResultBean> list) {
        if (njy.e(list)) {
            LogUtil.j("HL_BloodPressureMeasureUtil", "getWakeUpPressurePlan planResultList is empty");
            return null;
        }
        for (BloodPressurePlanResultBean bloodPressurePlanResultBean : list) {
            if (bloodPressurePlanResultBean != null && bloodPressurePlanResultBean.getPlanId() == 0) {
                return bloodPressurePlanResultBean;
            }
        }
        return list.get(0);
    }

    private static long d(int i, int i2) {
        int i3 = i2 / 60;
        if (i3 >= 24) {
            i = DateFormatUtil.a(lsl.w(DateFormatUtil.d(i)));
            i3 -= 24;
        }
        return lsl.a(DateFormatUtil.d(i), i3, i2 % 60);
    }

    private static HiHealthData a(List<HiHealthData> list, long j) {
        for (HiHealthData hiHealthData : list) {
            if (hiHealthData != null) {
                long startTime = hiHealthData.getStartTime();
                if (startTime >= j && Math.abs(startTime - j) <= 5400000) {
                    LogUtil.a("HL_BloodPressureMeasureUtil", "getWakeUpPressureTime pressureTime ", Long.valueOf(startTime));
                    return hiHealthData;
                }
            }
        }
        return null;
    }

    private static boolean e(SleepTotalData sleepTotalData) {
        if (!(sleepTotalData.getTotalSleepTime() == 0 && sleepTotalData.getManualBedTime() == 0) && sleepTotalData.getType() == 31) {
            return true;
        }
        if (sleepTotalData.getType() == 30) {
            return (sleepTotalData.getTotalSleepTime() == 0 && sleepTotalData.getShallowSleepTime() == 0 && sleepTotalData.getDeepSleepTime() == 0 && sleepTotalData.getCommonWakeUpTime() == sleepTotalData.getCommonFallTime()) ? false : true;
        }
        return false;
    }

    private static List<BloodPressurePlanResultBean> d(List<dfl> list) {
        ArrayList arrayList = new ArrayList(10);
        for (dfl dflVar : list) {
            if (dflVar != null) {
                BloodPressurePlanResultBean bloodPressurePlanResultBean = new BloodPressurePlanResultBean();
                int iC = dflVar.c();
                int iE = dflVar.e();
                long j = (iC * 60) + iE;
                if (iC < 2) {
                    j += 1440;
                }
                bloodPressurePlanResultBean.setMaxTime(j + 30);
                bloodPressurePlanResultBean.setMinTime(j - 30);
                bloodPressurePlanResultBean.setHour(iC);
                bloodPressurePlanResultBean.setMinute(iE);
                bloodPressurePlanResultBean.setPlanId(dflVar.g());
                arrayList.add(bloodPressurePlanResultBean);
            }
        }
        return arrayList;
    }

    private static long c(long j, boolean z) {
        long jM = (((long) lsl.m(j)) * 60) + ((long) lsl.n(j));
        return (!z || j >= lsl.a(j, 2, 30)) ? jM : jM + 1440;
    }

    private static void c(List<BloodPressurePlanResultBean> list) {
        int size = list.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            BloodPressurePlanResultBean bloodPressurePlanResultBean = list.get(i);
            if (bloodPressurePlanResultBean != null) {
                long pressureTime = bloodPressurePlanResultBean.getPressureTime();
                if (j == pressureTime) {
                    bloodPressurePlanResultBean.setPressureTime(0L);
                    bloodPressurePlanResultBean.setBloodPressureSystolic(0.0d);
                    bloodPressurePlanResultBean.setBloodPressureDiastolic(0.0d);
                } else {
                    j = pressureTime;
                }
            }
        }
    }

    private static HashMap<Integer, List<HiHealthData>> d(List<HiHealthData> list, boolean z) {
        HashMap<Integer, List<HiHealthData>> map = new HashMap<>();
        for (HiHealthData hiHealthData : list) {
            if (hiHealthData != null) {
                double d = hiHealthData.getDouble("BLOOD_PRESSURE_SYSTOLIC");
                double d2 = hiHealthData.getDouble("BLOOD_PRESSURE_DIASTOLIC");
                if (d >= 1.0d || d2 >= 1.0d) {
                    int day = (int) hiHealthData.getDay();
                    if (!z) {
                        b(map, day, hiHealthData);
                    } else {
                        long startTime = hiHealthData.getStartTime();
                        if (startTime < lsl.a(startTime, 2, 30)) {
                            day = DateFormatUtil.a(lsl.u(DateFormatUtil.d(day)));
                        }
                        b(map, day, hiHealthData);
                    }
                }
            }
        }
        return map;
    }

    private static void b(HashMap<Integer, List<HiHealthData>> map, int i, HiHealthData hiHealthData) {
        List<HiHealthData> arrayList;
        if (map.containsKey(Integer.valueOf(i))) {
            arrayList = map.get(Integer.valueOf(i));
        } else {
            arrayList = new ArrayList<>();
        }
        if (arrayList != null) {
            arrayList.add(hiHealthData);
            map.put(Integer.valueOf(i), arrayList);
        }
    }

    private static int a() {
        long jI = CommonUtil.i(ccy.c("bloodPressureMeasurePlanSaveTime"));
        if (jI <= 0) {
            jI = System.currentTimeMillis();
        }
        int iA = DateFormatUtil.a(jI);
        LogUtil.a("HL_BloodPressureMeasureUtil", "getPlanSaveDay saveDay=", Integer.valueOf(iA));
        return iA;
    }

    private static boolean e(BloodPressurePlanResultBean bloodPressurePlanResultBean) {
        return bloodPressurePlanResultBean != null && bloodPressurePlanResultBean.getPressureTime() > 0;
    }

    private static void d(long j, long j2, HiAggregateListener hiAggregateListener) {
        HiHealthNativeApi.a(BaseApplication.b()).aggregateHiHealthData(c(j, j2), hiAggregateListener);
    }

    public static HiAggregateOption c(long j, long j2) {
        HiAggregateOption hiAggregateOption = new HiAggregateOption();
        hiAggregateOption.setTimeRange(j, j2);
        hiAggregateOption.setType(new int[]{10002});
        hiAggregateOption.setConstantsKey(new String[]{BleConstants.BLOOD_PRESSURE});
        hiAggregateOption.setAggregateType(1);
        hiAggregateOption.setGroupUnitType(0);
        hiAggregateOption.setSortOrder(1);
        hiAggregateOption.setFilter("");
        return hiAggregateOption;
    }
}
