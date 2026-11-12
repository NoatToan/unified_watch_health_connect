package defpackage;

import android.text.TextUtils;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.haf.handler.HandlerCenter;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hihealth.HiDataInsertOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.data.listener.HiDataOperateListener;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.taskplatform.TaskEnum;
import com.huawei.taskplatform.api.TaskPlatformApi;
import health.compact.a.CommonUtils;
import health.compact.a.LogUtil;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.Services;
import health.compact.a.Utils;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes33.dex */
public class kbg {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final AtomicInteger f39296c = new AtomicInteger(0);

    public static void b(qex qexVar, final ResponseCallback<qey> responseCallback) {
        if (responseCallback == null) {
            ReleaseLogUtil.d("R_HL_TaskUtil", "createPlan callback is null");
        } else if (qexVar == null) {
            ReleaseLogUtil.d("R_HL_TaskUtil", "createPlan createPlanReq is null");
            responseCallback.onResponse(-1, null);
        } else {
            ((TaskPlatformApi) Services.b("TaskPlatform", TaskPlatformApi.class)).createPlan(qexVar, new ResponseCallback() { // from class: kbd
                @Override // com.huawei.hwbasemgr.ResponseCallback
                public final void onResponse(int i, Object obj) {
                    kbg.c(responseCallback, i, (qey) obj);
                }
            });
        }
    }

    static /* synthetic */ void c(ResponseCallback responseCallback, int i, qey qeyVar) {
        LogUtil.b("TaskUtil", "createPlan errorCode ", Integer.valueOf(i), " planDetail ", qeyVar);
        jzl.a(qeyVar);
        jyc.c().i();
        responseCallback.onResponse(i, qeyVar);
        if (i != 0 || !Utils.l()) {
            LogUtil.e("TaskUtil", "initHealthModel isSupportHealthModel false");
        } else {
            cfv.e().a(new ResponseCallback() { // from class: kbp
                @Override // com.huawei.hwbasemgr.ResponseCallback
                public final void onResponse(int i2, Object obj) {
                    LogUtil.b("TaskUtil", "initHealthModel resCode:", Integer.valueOf(i2));
                }
            }, "cloverLife");
        }
    }

    public static void d(final qfv qfvVar, final ResponseCallback<qgc> responseCallback) {
        if (responseCallback == null) {
            ReleaseLogUtil.d("R_HL_TaskUtil", "createTask callback is null");
            return;
        }
        if (qfvVar == null) {
            ReleaseLogUtil.d("R_HL_TaskUtil", "createTask createTasksReq is null");
            responseCallback.onResponse(-1, null);
            return;
        }
        if (TextUtils.isEmpty(qfvVar.d())) {
            qfvVar.c(jyc.c().b());
        }
        if (TextUtils.isEmpty(qfvVar.c())) {
            qfvVar.d(jzl.j());
        }
        if (TextUtils.isEmpty(qfvVar.d())) {
            jyc.c().i();
        }
        ((TaskPlatformApi) Services.b("TaskPlatform", TaskPlatformApi.class)).createTask(qfvVar, new ResponseCallback() { // from class: kbe
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i, Object obj) {
                kbg.e(qfvVar, responseCallback, i, (qgc) obj);
            }
        });
    }

    static /* synthetic */ void e(qfv qfvVar, ResponseCallback responseCallback, int i, qgc qgcVar) {
        LogUtil.b("TaskUtil", "createTask errorCode ", Integer.valueOf(i), " queryTasksResp ", qgcVar);
        if (qgcVar != null && qgcVar.e() == 25003) {
            ReleaseLogUtil.b("TaskUtil", "updateTask error with invalid version");
            b(qfvVar, (ResponseCallback<qgc>) responseCallback);
            return;
        }
        boolean z = false;
        jyc.c().c(false);
        kac.e(qgcVar);
        qfw qfwVarA = qfvVar.a();
        if (qfwVarA != null && qfwVarA.d()) {
            z = true;
        }
        kba.c(qfvVar.b(), z, qgcVar);
        c(qgcVar);
        responseCallback.onResponse(i, qgcVar);
        ThreadPoolManager.c().execute(new Runnable() { // from class: kbh
            @Override // java.lang.Runnable
            public final void run() {
                jyc.c().d("createTask", Collections.singletonList("all"));
            }
        });
    }

    private static void b(final qfv qfvVar, final ResponseCallback<qgc> responseCallback) {
        AtomicInteger atomicInteger = f39296c;
        int i = atomicInteger.get();
        if (i > 5) {
            ReleaseLogUtil.d("TaskUtil", "recreateTask over max count");
        } else {
            HandlerCenter.a().d(new Runnable() { // from class: kbf
                @Override // java.lang.Runnable
                public final void run() {
                    jyc.c().e(new ResponseCallback() { // from class: kbc
                        @Override // com.huawei.hwbasemgr.ResponseCallback
                        public final void onResponse(int i2, Object obj) {
                            ThreadPoolManager.c().execute(new Runnable() { // from class: kbn
                                @Override // java.lang.Runnable
                                public final void run() {
                                    kbg.c(qfvVar, responseCallback);
                                }
                            });
                        }
                    });
                }
            }, i * 2000);
            atomicInteger.incrementAndGet();
        }
    }

    static /* synthetic */ void c(qfv qfvVar, ResponseCallback responseCallback) {
        qfvVar.d("");
        d(qfvVar, (ResponseCallback<qgc>) responseCallback);
    }

    private static void d(final qfz qfzVar, final List<qgb> list) {
        if (qfzVar == null) {
            ReleaseLogUtil.d("R_HL_TaskUtil", "createTaskBySubTask taskSchedule is null");
        } else if (CollectionUtils.a(list)) {
            ReleaseLogUtil.d("R_HL_TaskUtil", "createTaskBySubTask subTaskCreateList ", list);
        } else {
            ThreadPoolManager.c().execute(new Runnable() { // from class: kbj
                @Override // java.lang.Runnable
                public final void run() {
                    kbg.a(list, qfzVar);
                }
            });
        }
    }

    static /* synthetic */ void a(List list, qfz qfzVar) {
        qfu qfuVar = new qfu();
        qfuVar.d((List<qgb>) list);
        qfuVar.f(qfzVar.g());
        qfuVar.d(qfzVar.d());
        qfuVar.i(lsl.q(System.currentTimeMillis()));
        qfuVar.e(qfzVar.c());
        qfuVar.d(qfzVar.i());
        qfuVar.c(true);
        qfuVar.a(true);
        qfuVar.h("other");
        qfv qfvVar = new qfv();
        qfvVar.b(Collections.singletonList(qfuVar));
        qfvVar.c(jyc.c().b());
        LogUtil.b("TaskUtil", "createTaskBySubTask createTasksReq ", HiJsonUtil.d(qfvVar));
        d(qfvVar, (ResponseCallback<qgc>) new ResponseCallback() { // from class: kbk
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i, Object obj) {
                kbg.d(i, (qgc) obj);
            }
        });
    }

    static /* synthetic */ void d(int i, qgc qgcVar) {
        LogUtil.b("TaskUtil", "createTaskBySubTask errorCode ", Integer.valueOf(i), " queryTasksResp ", qgcVar);
        if (i == 0) {
            kad.a("R_HL_TaskUtil", "updateBloodPressure");
        }
    }

    private static qfz d(qfj qfjVar, String str) {
        if (qfjVar == null) {
            ReleaseLogUtil.d("R_HL_TaskUtil", "getTaskSchedule querySchedulesResp is null");
            return null;
        }
        return qfjVar.j(str);
    }

    private static qgb a(qfz qfzVar, qfq qfqVar, List<qff> list) {
        qgb qgbVar = new qgb();
        if (qfzVar != null) {
            qgbVar.e(qfzVar.g());
        }
        if (qfqVar != null) {
            qgbVar.d(qfqVar.a());
            qgbVar.d(qfqVar.h());
            qgbVar.f(qfqVar.f());
            qgbVar.e(qfqVar.e());
        }
        qgbVar.b("DAILY");
        qgbVar.c(true);
        qgbVar.a(true);
        qgbVar.a(list);
        qgbVar.i(lsl.q(System.currentTimeMillis()));
        return qgbVar;
    }

    private static Map<Integer, dfl> e(List<dfl> list) {
        if (CollectionUtils.a(list)) {
            ReleaseLogUtil.d("R_HL_TaskUtil", "getBloodPressureAlarmInfoMap list ", list);
            return new HashMap();
        }
        HashMap map = new HashMap();
        for (dfl dflVar : list) {
            if (dflVar != null) {
                map.put(Integer.valueOf(dflVar.g()), dflVar);
            }
        }
        return map;
    }

    private static String e(int i) {
        String strValueOf = String.valueOf(i);
        if (TextUtils.isEmpty(strValueOf) || strValueOf.length() >= 2) {
            return strValueOf;
        }
        return "0" + strValueOf;
    }

    private static boolean e(boolean z, qfz qfzVar, qfq qfqVar, Map<Integer, dfl> map, List<qgb> list) {
        if (qfqVar == null) {
            ReleaseLogUtil.d("R_HL_TaskUtil", "isNeedUpdateByBloodPressure subTasks is null");
            return z;
        }
        List<qfk> listG = qfqVar.g();
        if (CollectionUtils.a(listG)) {
            ReleaseLogUtil.d("R_HL_TaskUtil", "isNeedUpdateByBloodPressure scheduleDetailList ", listG);
            return z;
        }
        ArrayList arrayList = new ArrayList();
        for (qfk qfkVar : listG) {
            if (qfkVar != null) {
                List<qfg> listN = qfkVar.n();
                if (CollectionUtils.a(listN)) {
                    ReleaseLogUtil.d("R_HL_TaskUtil", "isNeedUpdateByBloodPressure objectiveInfoList ", listN);
                } else {
                    for (qfg qfgVar : listN) {
                        if (qfgVar != null) {
                            boolean zD = d(qfgVar, map);
                            if (!z) {
                                z = zD;
                            }
                        }
                    }
                    arrayList.add(e(qfkVar, listN));
                }
            }
        }
        list.add(a(qfzVar, qfqVar, arrayList));
        return z;
    }

    private static boolean d(qfg qfgVar, Map<Integer, dfl> map) {
        boolean z = false;
        if (qfgVar == null) {
            ReleaseLogUtil.d("R_HL_TaskUtil", "updateBloodPressureMetadata objectiveInfo is null");
            return false;
        }
        String strD = qfgVar.d();
        if (TextUtils.isEmpty(strD)) {
            ReleaseLogUtil.d("R_HL_TaskUtil", "updateBloodPressureMetadata metadata ", strD);
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(strD);
            int iOptInt = jSONObject.optInt("planId");
            String strOptString = jSONObject.optString("targetTime");
            if (!map.containsKey(Integer.valueOf(iOptInt))) {
                return false;
            }
            dfl dflVar = map.get(Integer.valueOf(iOptInt));
            if (dflVar == null) {
                ReleaseLogUtil.d("R_HL_TaskUtil", "updateBloodPressureMetadata alarmInfo is null");
                return false;
            }
            int iC = dflVar.c();
            int iE = dflVar.e();
            String str = e(iC) + ":" + e(iE);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("planId", iOptInt);
            jSONObject2.put("targetTime", str);
            qfgVar.c(jSONObject2.toString());
            boolean z2 = !Objects.equals(strOptString, str);
            try {
                qfe qfeVarB = qfgVar.b();
                if (qfeVarB != null) {
                    Calendar calendar = Calendar.getInstance();
                    calendar.set(14, 0);
                    calendar.set(13, 0);
                    calendar.set(11, iC);
                    calendar.set(12, iE - 30);
                    qfeVarB.d(e(calendar.get(11)) + ":" + e(calendar.get(12)));
                    calendar.set(11, iC);
                    calendar.set(12, iE + 30);
                    qfeVarB.b(e(calendar.get(11)) + ":" + e(calendar.get(12)));
                }
                return z2;
            } catch (JSONException e) {
                e = e;
                z = z2;
                ReleaseLogUtil.b("R_HL_TaskUtil", "updateBloodPressureMetadata exception ", ExceptionUtils.c(e));
                return z;
            }
        } catch (JSONException e2) {
            e = e2;
        }
    }

    private static qff e(qfk qfkVar, List<qfg> list) {
        if (qfkVar == null) {
            ReleaseLogUtil.d("R_HL_TaskUtil", "getBaseScheduleByBloodPressure scheduleDetail is null");
            return new qff();
        }
        qff qffVar = new qff();
        if (!CollectionUtils.a(list)) {
            qfg qfgVar = list.get(0);
            qfgVar.a(String.valueOf(1));
            qffVar.b(Collections.singletonList(qfgVar));
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        qffVar.d(jCurrentTimeMillis);
        qffVar.c(qfkVar.o());
        qffVar.a(qfkVar.e());
        qffVar.d(qfkVar.h());
        qffVar.a(new qfi("DAILY"));
        qffVar.a(qfkVar.t());
        qffVar.e(lsl.q(jCurrentTimeMillis));
        qffVar.h(DateFormatUtil.a(jCurrentTimeMillis));
        qffVar.b(lsl.r(jCurrentTimeMillis));
        return qffVar;
    }

    public static void d(qfj qfjVar) {
        final qfz qfzVarD = d(qfjVar, TaskEnum.BLOOD_PRESS_MEASURE.getTaskId());
        if (qfzVarD == null) {
            ReleaseLogUtil.d("R_HL_TaskUtil", "updateBloodPressure taskSchedule is null");
            return;
        }
        final List<qfq> listF = qfzVarD.f();
        if (CollectionUtils.a(listF)) {
            ReleaseLogUtil.d("R_HL_TaskUtil", "updateBloodPressure subTaskList ", listF);
        } else {
            ThreadPoolManager.c().execute(new Runnable() { // from class: kbi
                @Override // java.lang.Runnable
                public final void run() {
                    dfp.c((ResponseCallback<List<dfl>>) new ResponseCallback() { // from class: kbo
                        @Override // com.huawei.hwbasemgr.ResponseCallback
                        public final void onResponse(int i, Object obj) {
                            kbg.b(list, qfzVar, i, (List) obj);
                        }
                    });
                }
            });
        }
    }

    static /* synthetic */ void b(List list, qfz qfzVar, int i, List list2) {
        Map<Integer, dfl> mapE = e((List<dfl>) list2);
        if (CollectionUtils.c(mapE)) {
            ReleaseLogUtil.d("R_HL_TaskUtil", "updateBloodPressure map ", mapE);
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        boolean zE = false;
        while (it.hasNext()) {
            zE = e(zE, qfzVar, (qfq) it.next(), mapE, arrayList);
        }
        if (zE) {
            d(qfzVar, arrayList);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(final qgc qgcVar) {
        if (HandlerExecutor.c()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: kbl
                @Override // java.lang.Runnable
                public final void run() {
                    kbg.c(qgcVar);
                }
            });
            return;
        }
        if (qgcVar == null) {
            return;
        }
        List<qfy> listB = qgcVar.b();
        if (CollectionUtils.a(listB)) {
            return;
        }
        HashMap map = new HashMap();
        for (qfy qfyVar : listB) {
            if (qfyVar != null && "T121010".equals(qfyVar.d())) {
                c(qfyVar, map);
            }
        }
        List<dfl> listC = dfp.c();
        a(listC, map);
        LogUtil.b("TaskUtil", "updateBloodPressure:", HiJsonUtil.d(listC));
        if (CollectionUtils.a(listC)) {
            return;
        }
        dfp.a(listC);
    }

    private static void c(qfy qfyVar, Map<Integer, String> map) {
        Iterator<qfk> it = qfyVar.n().iterator();
        while (it.hasNext()) {
            for (qfg qfgVar : it.next().n()) {
                if (qfgVar != null) {
                    String strD = qfgVar.d();
                    if (!TextUtils.isEmpty(strD)) {
                        try {
                            JSONObject jSONObject = new JSONObject(strD);
                            map.put(Integer.valueOf(jSONObject.optInt("planId")), jSONObject.optString("targetTime"));
                        } catch (JSONException unused) {
                            ReleaseLogUtil.b("TaskUtil", "JSONException updateBloodPressure");
                        }
                    }
                }
            }
        }
    }

    private static void a(List<dfl> list, Map<Integer, String> map) {
        HashSet hashSet = new HashSet();
        if (CollectionUtils.a(list)) {
            list = new ArrayList<>();
        } else {
            Iterator<dfl> it = list.iterator();
            while (it.hasNext()) {
                hashSet.add(Integer.valueOf(it.next().g()));
            }
        }
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            b(list, hashSet, entry.getKey().intValue(), entry.getValue());
        }
    }

    private static void b(List<dfl> list, Set<Integer> set, int i, String str) {
        if (set.contains(Integer.valueOf(i))) {
            for (dfl dflVar : list) {
                if (i == dflVar.g()) {
                    String[] strArrSplit = str.split(":");
                    if (strArrSplit.length >= 2) {
                        int iJ = CommonUtils.j(strArrSplit[0]);
                        int iJ2 = CommonUtils.j(strArrSplit[1]);
                        dflVar.d(iJ);
                        dflVar.c(iJ2);
                    }
                }
            }
            return;
        }
        String[] strArrSplit2 = str.split(":");
        if (strArrSplit2.length < 2) {
            return;
        }
        list.add(new dfl(i, CommonUtils.j(strArrSplit2[0]), CommonUtils.j(strArrSplit2[1]), i));
    }

    public static void b(int i, final ResponseCallback<qfr> responseCallback) {
        HiHealthData hiHealthData = new HiHealthData();
        long jCurrentTimeMillis = System.currentTimeMillis();
        hiHealthData.setStartTime(jCurrentTimeMillis);
        hiHealthData.setEndTime(jCurrentTimeMillis);
        hiHealthData.setValue(i);
        hiHealthData.setType(DicDataTypeUtil.DataType.DRINK_WATER.value());
        hiHealthData.setDeviceUuid(String.valueOf(-1));
        final HiDataInsertOption hiDataInsertOption = new HiDataInsertOption();
        hiDataInsertOption.addData(hiHealthData);
        LogUtil.b("TaskUtil", "drinkWater intake ", Integer.valueOf(i), " option ", HiJsonUtil.d(hiDataInsertOption));
        ThreadPoolManager.c().execute(new Runnable() { // from class: kbm
            @Override // java.lang.Runnable
            public final void run() {
                HiHealthManager.d(BaseApplication.b()).insertHiHealthData(hiDataInsertOption, new HiDataOperateListener() { // from class: kbq
                    @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
                    public final void onResult(int i2, Object obj) {
                        kbg.d(responseCallback, i2, obj);
                    }
                });
            }
        });
    }

    static /* synthetic */ void d(ResponseCallback responseCallback, int i, Object obj) {
        ReleaseLogUtil.c("R_HL_TaskUtil", "drinkWater onResult errorCode ", Integer.valueOf(i), " object ", HiJsonUtil.d(obj));
        if (responseCallback == null) {
            return;
        }
        responseCallback.onResponse(i, null);
    }

    public static qfu a(qfz qfzVar, String str, String str2) {
        if (qfzVar == null) {
            ReleaseLogUtil.d("R_HL_TaskUtil", "taskScheduleToCreateTask taskSchedule is null");
            return null;
        }
        qfu qfuVar = new qfu();
        qfuVar.f(qfzVar.g());
        qfuVar.d(qfzVar.d());
        qfuVar.i(lsl.q(System.currentTimeMillis()));
        qfuVar.e(qfzVar.c());
        qfuVar.d(qfzVar.i());
        qfuVar.c(true);
        qfuVar.a(true);
        qfuVar.h(str2);
        List<qfk> listJ = qfzVar.j();
        ArrayList arrayList = new ArrayList();
        if (njy.b(listJ)) {
            for (qfk qfkVar : listJ) {
                if (qfkVar != null && !CollectionUtils.a(qfkVar.n())) {
                    qff qffVar = new qff();
                    qffVar.c(qfkVar.o());
                    qffVar.a(qfkVar.t());
                    qfg qfgVar = qfkVar.n().get(0);
                    qfgVar.a(str);
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(qfgVar);
                    qffVar.b(arrayList2);
                    qffVar.a(new qfi("DAILY"));
                    qffVar.h(DateFormatUtil.a(System.currentTimeMillis()));
                    qffVar.d(qfkVar.h());
                    qffVar.b(lsl.r(System.currentTimeMillis()));
                    qffVar.a(qfkVar.e());
                    qffVar.e(lsl.q(System.currentTimeMillis()));
                    arrayList.add(qffVar);
                }
            }
        }
        qfuVar.a(arrayList);
        return qfuVar;
    }
}
