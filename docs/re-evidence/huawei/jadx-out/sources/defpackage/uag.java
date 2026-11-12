package defpackage;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import com.apprichtap.haptic.base.PrebakedEffectId;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.sleep.SleepApi;
import com.huawei.health.userlabelmgr.api.UserLabelServiceApi;
import com.huawei.hihealth.HiDataInsertOption;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.HiSyncOption;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.data.listener.HiCommonListener;
import com.huawei.hihealth.data.listener.HiDataOperateListener;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwbasemgr.SleepDailyProcessResultCallback;
import com.huawei.hwbasemgr.SleepMonthlyProcessResultCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.networkclient.ResultCallback;
import com.huawei.operation.h5pro.jsmodules.device.MatterDataContans;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;
import com.huawei.ui.commonui.utils.versioncontrol.VersionControlUtil;
import com.huawei.ui.main.stories.fitness.activity.coresleep.SleepJobService;
import com.huawei.ui.main.stories.fitness.activity.coresleep.SleepManagementCallback;
import health.compact.a.CommonUtil;
import health.compact.a.GRSManager;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.Services;
import health.compact.a.Utils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class uag {
    private static String d;
    public static final int[] e = {DicDataTypeUtil.DataType.DAILY_SLEEP_PROBLEM.value(), DicDataTypeUtil.DataType.DAILY_SLEEP_DEGREE.value(), DicDataTypeUtil.DataType.DAILY_TARGET_PROBLEM.value(), DicDataTypeUtil.DataType.DAILY_SLEEP_INTERPRET.value(), DicDataTypeUtil.DataType.DAILY_SLEEP_TASKS.value()};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f49837a = {DicDataTypeUtil.DataType.MONTHLY_SLEEP.value()};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f49838c = {DicDataTypeUtil.DataType.MONTHLY_SLEEP_PROBLEM.value()};

    public static void d(final SleepJobService.c cVar, final long j, final long j2) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: uag.3
            @Override // java.lang.Runnable
            public void run() {
                LogUtil.a("SleepManagementResultUtil", "TryRequestMonthResult");
                uag.c(new IBaseResponseCallback() { // from class: uag.3.1
                    @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                    /* JADX INFO: renamed from: onResponse */
                    public void a(int i, Object obj) {
                        LogUtil.a("SleepManagementResultUtil", "TryRequestMonthResult objData: ", obj);
                        if (!(obj instanceof Integer)) {
                            LogUtil.a("SleepManagementResultUtil", "objData invalid");
                            uag.e(cVar, j, j2);
                        } else if (cVar != null) {
                            cVar.a(0, true);
                        }
                    }
                }, j, j2);
            }
        });
    }

    public static void b(final SleepJobService.c cVar, final long j, final long j2) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: uag.7
            @Override // java.lang.Runnable
            public void run() {
                LogUtil.a("SleepManagementResultUtil", "requestMonthResult, startTime: ", Long.valueOf(j), ", endTime: ", Long.valueOf(j2));
                uag.e(cVar, j, j2);
            }
        });
    }

    public static void c(final IBaseResponseCallback iBaseResponseCallback, long j, long j2) {
        b(new HiDataReadResultListener() { // from class: uag.8
            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResult(Object obj, int i, int i2) {
                LogUtil.a("SleepManagementResultUtil", "queryMonthResult onResult, data: ", obj);
                if (i != 0) {
                    LogUtil.j("SleepManagementResultUtil", "errorCode: ", Integer.valueOf(i));
                    iBaseResponseCallback.a(-1, null);
                    return;
                }
                if (!(obj instanceof SparseArray)) {
                    iBaseResponseCallback.a(-1, null);
                    return;
                }
                SparseArray sparseArray = (SparseArray) obj;
                if (sparseArray.size() <= 0) {
                    LogUtil.j("SleepManagementResultUtil", "map.size() <= 0");
                    iBaseResponseCallback.a(-1, null);
                    return;
                }
                int iD = uag.d((SparseArray<Object>) sparseArray, DicDataTypeUtil.DataType.MONTHLY_SLEEP_PROBLEM.value());
                LogUtil.a("SleepManagementResultUtil", "queryMonthProcessResult success, sleepProblem: ", Integer.valueOf(iD));
                if (iD == -1) {
                    LogUtil.a("SleepManagementResultUtil", "get sleep problem failed");
                    iBaseResponseCallback.a(-1, null);
                } else {
                    iBaseResponseCallback.a(0, Integer.valueOf(iD));
                }
            }

            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResultIntent(int i, Object obj, int i2, int i3) {
                LogUtil.a("SleepManagementResultUtil", "queryMonthProcessResult intentType ", Integer.valueOf(i), " errorCode ", Integer.valueOf(i2));
            }
        }, j, j2);
    }

    public static void e(int i, Object obj, long j, long j2, int i2) {
        LogUtil.a("SleepManagementResultUtil", "handleMonthResult, objData: ", obj, ", startTime: ", Long.valueOf(j), ", curTime: ", Long.valueOf(j2), ", generateType: ", Integer.valueOf(i2));
        if (!(obj instanceof gxh)) {
            LogUtil.e("SleepManagementResultUtil", "objData error");
            return;
        }
        gxh gxhVar = (gxh) obj;
        d(gxhVar);
        b(new HiDataOperateListener() { // from class: uag.10
            @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
            public void onResult(int i3, Object obj2) {
                LogUtil.a("SleepManagementResultUtil", "handleMonthResult errorCode: ", Integer.valueOf(i3), "object: ", obj2);
                ObserverManagerUtil.e("MonthProblemRefresh", new Object[0]);
                uag.j();
            }
        }, j, j2, gxhVar, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void j() {
        HiSyncOption hiSyncOption = new HiSyncOption();
        hiSyncOption.setSyncModel(2);
        hiSyncOption.setSyncAction(0);
        hiSyncOption.setSyncDataType(DicDataTypeUtil.DataType.MONTHLY_SLEEP.value());
        hiSyncOption.setSyncMethod(2);
        HiHealthManager.d(BaseApplication.getContext()).synCloud(hiSyncOption, new HiCommonListener() { // from class: uag.13
            @Override // com.huawei.hihealth.data.listener.HiCommonListener
            public void onSuccess(int i, Object obj) {
                LogUtil.a("SleepManagementResultUtil", "syncCloud onSuccess");
            }

            @Override // com.huawei.hihealth.data.listener.HiCommonListener
            public void onFailure(int i, Object obj) {
                LogUtil.a("SleepManagementResultUtil", "syncCloud onFailure errorCode: ", Integer.valueOf(i), ", errorMessage: ", obj);
            }
        });
    }

    public static void c(gxd gxdVar, long j, SleepDailyProcessResultCallback<gxd> sleepDailyProcessResultCallback, boolean z) {
        LogUtil.a("SleepManagementResultUtil", "bean: ", gxdVar.toString());
        if (z) {
            if (sleepDailyProcessResultCallback == null) {
                return;
            }
            LogUtil.a("SleepManagementResultUtil", "handleDailyResult onResponse first.");
            sleepDailyProcessResultCallback.onResponse(0, gxdVar);
        }
        d(new AnonymousClass11(z, sleepDailyProcessResultCallback, gxdVar), j, gxdVar);
    }

    /* JADX INFO: renamed from: uag$11, reason: invalid class name */
    class AnonymousClass11 implements HiDataOperateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ gxd f49839a;
        final /* synthetic */ boolean d;
        final /* synthetic */ SleepDailyProcessResultCallback e;

        AnonymousClass11(boolean z, SleepDailyProcessResultCallback sleepDailyProcessResultCallback, gxd gxdVar) {
            this.d = z;
            this.e = sleepDailyProcessResultCallback;
            this.f49839a = gxdVar;
        }

        @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
        public void onResult(int i, Object obj) {
            LogUtil.a("SleepManagementResultUtil", "handleDailyResult errorCode: ", Integer.valueOf(i), "object: ", obj);
            ThreadPoolManager.c().execute(new Runnable() { // from class: uai
                @Override // java.lang.Runnable
                public final void run() {
                    uag.g();
                }
            });
            if (this.d || this.e == null) {
                return;
            }
            LogUtil.a("SleepManagementResultUtil", "handleDailyResult onResponse second.");
            this.e.onResponse(i, this.f49839a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void g() {
        HiSyncOption hiSyncOption = new HiSyncOption();
        hiSyncOption.setSyncModel(2);
        hiSyncOption.setSyncAction(0);
        hiSyncOption.setSyncDataType(DicDataTypeUtil.DataType.SLEEP_RECORD.value());
        hiSyncOption.setSyncMethod(2);
        HiHealthManager.d(BaseApplication.getContext()).synCloud(hiSyncOption, new HiCommonListener() { // from class: uag.12
            @Override // com.huawei.hihealth.data.listener.HiCommonListener
            public void onSuccess(int i, Object obj) {
                LogUtil.a("SleepManagementResultUtil", "syncDailyHiHealthData onSuccess");
            }

            @Override // com.huawei.hihealth.data.listener.HiCommonListener
            public void onFailure(int i, Object obj) {
                LogUtil.a("SleepManagementResultUtil", "syncDailyHiHealthData onFailure errorCode: ", Integer.valueOf(i), ", errorMessage: ", obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(gxd gxdVar, long j) {
        if (!lsl.aa(j)) {
            LogUtil.j("SleepManagementResultUtil", "time is not today, time: ", Long.valueOf(j));
        } else {
            d(gxdVar);
        }
    }

    private static void d(gxh gxhVar) {
        ((UserLabelServiceApi) Services.b("HWUserLabelMgr", UserLabelServiceApi.class)).initMonthlySleepLabel(gxhVar);
    }

    public static void d(gxd gxdVar) {
        ((UserLabelServiceApi) Services.b("HWUserLabelMgr", UserLabelServiceApi.class)).initDailySleepLabel(gxdVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(SleepJobService.c cVar, long j, long j2) {
        SleepApi sleepApi = (SleepApi) Services.d("Main", SleepApi.class);
        if (sleepApi != null) {
            sleepApi.requestMonthlyProcessResult(null, null, j, j2, new b(cVar, j, System.currentTimeMillis()));
            return;
        }
        LogUtil.a("SleepManagementResultUtil", "sleepServiceApi is null");
        if (cVar != null) {
            cVar.a(0, true);
        }
    }

    public static void c(HiDataReadResultListener hiDataReadResultListener, long j) {
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setTimeInterval(lsl.r(j), lsl.c(j));
        hiDataReadOption.setType(e);
        HiHealthManager.d(BaseApplication.getContext()).readHiHealthData(hiDataReadOption, hiDataReadResultListener);
    }

    public static void d(HiDataOperateListener hiDataOperateListener, long j, gxd gxdVar) {
        HiHealthData hiHealthData = new HiHealthData();
        hiHealthData.setType(DicDataTypeUtil.DataType.SLEEP_RECORD.value());
        hiHealthData.setDeviceUuid("-1");
        hiHealthData.setStartTime(lsl.r(j));
        hiHealthData.setEndTime(lsl.c(j));
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        map.put(Integer.valueOf(DicDataTypeUtil.DataType.DAILY_SLEEP_PROBLEM.value()), Integer.valueOf(gxdVar.j()));
        map.put(Integer.valueOf(DicDataTypeUtil.DataType.DAILY_SLEEP_DEGREE.value()), Integer.valueOf(gxdVar.i()));
        map2.put(Integer.valueOf(DicDataTypeUtil.DataType.DAILY_TARGET_PROBLEM.value()), g(gxdVar.a()));
        map2.put(Integer.valueOf(DicDataTypeUtil.DataType.DAILY_SLEEP_INTERPRET.value()), b(gxdVar));
        map2.put(Integer.valueOf(DicDataTypeUtil.DataType.DAILY_SLEEP_TASKS.value()), e(gxdVar, j));
        hiHealthData.setFieldsValue(HiJsonUtil.d(map));
        hiHealthData.setFieldsMetaData(HiJsonUtil.d(map2));
        HiDataInsertOption hiDataInsertOption = new HiDataInsertOption();
        hiDataInsertOption.addData(hiHealthData);
        HiHealthManager.d(BaseApplication.getContext()).insertHiHealthData(hiDataInsertOption, hiDataOperateListener);
    }

    private static String g(List<Integer> list) {
        JSONArray jSONArray = new JSONArray();
        if (njy.e(list)) {
            LogUtil.e("SleepManagementResultUtil", "factor is null");
            return jSONArray.toString();
        }
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next());
        }
        return jSONArray.toString();
    }

    private static List<Integer> e(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(Integer.valueOf(jSONArray.optInt(i)));
            }
        } catch (JSONException unused) {
            LogUtil.e("SleepManagementResultUtil", "JSONException");
        }
        return arrayList;
    }

    public static void c(HiDataReadResultListener hiDataReadResultListener, long j, boolean z) {
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        if (z) {
            hiDataReadOption.setTimeInterval(0L, j + 86400000);
            hiDataReadOption.setSortOrder(1);
        } else {
            hiDataReadOption.setTimeInterval(lsl.p(j) - 86400000, lsl.b(j) + 86400000);
        }
        hiDataReadOption.setType(f49837a);
        HiHealthManager.d(BaseApplication.getContext()).readHiHealthData(hiDataReadOption, hiDataReadResultListener);
    }

    public static void b(HiDataReadResultListener hiDataReadResultListener, long j, long j2) {
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setTimeInterval(j, j2);
        hiDataReadOption.setType(f49838c);
        HiHealthManager.d(BaseApplication.getContext()).readHiHealthData(hiDataReadOption, hiDataReadResultListener);
    }

    public static void b(HiDataOperateListener hiDataOperateListener, long j, long j2, gxh gxhVar, int i) {
        HiHealthData hiHealthData = new HiHealthData();
        hiHealthData.setType(DicDataTypeUtil.DataType.MONTHLY_SLEEP.value());
        hiHealthData.setDeviceUuid("-1");
        hiHealthData.setStartTime(lsl.p(j));
        hiHealthData.setEndTime(lsl.b(j));
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        map.put(Integer.valueOf(DicDataTypeUtil.DataType.RHYTHM_TYPE.value()), Integer.valueOf(gxhVar.m()));
        map.put(Integer.valueOf(DicDataTypeUtil.DataType.MONTHLY_SLEEP_PROBLEM.value()), Integer.valueOf(gxhVar.h()));
        map.put(Integer.valueOf(DicDataTypeUtil.DataType.MONTHLY_SLEEP_DEGREE.value()), Integer.valueOf(gxhVar.f()));
        int iValue = DicDataTypeUtil.DataType.MONTHLY_SLEEP_TASKS.value();
        map2.put(Integer.valueOf(iValue), b(gxhVar, j2, i));
        map2.put(Integer.valueOf(DicDataTypeUtil.DataType.MONTHLY_SLEEP_INTERPRET.value()), a(gxhVar));
        hiHealthData.setFieldsValue(HiJsonUtil.d(map));
        hiHealthData.setFieldsMetaData(HiJsonUtil.d(map2));
        HiDataInsertOption hiDataInsertOption = new HiDataInsertOption();
        hiDataInsertOption.addData(hiHealthData);
        HiHealthManager.d(BaseApplication.getContext()).insertHiHealthData(hiDataInsertOption, hiDataOperateListener);
    }

    public static Map<String, Object> c(gxd gxdVar, long j) {
        HashMap map = new HashMap();
        map.put("dailySleepProblem", Integer.valueOf(gxdVar.j()));
        map.put("dailySleepDegree", Integer.valueOf(gxdVar.i()));
        map.put("dailyTargetProblem", g(gxdVar.a()));
        map.put("dailySleepInterpretParam", b(gxdVar));
        map.put("dailySleepTasks", e(gxdVar, j));
        return map;
    }

    public static Map<String, Object> a(gxh gxhVar, long j) {
        HashMap map = new HashMap();
        map.put("rhythmType", Integer.valueOf(gxhVar.m()));
        map.put("monthlySleepProblem", Integer.valueOf(gxhVar.h()));
        map.put("monthlySleepDegree", Integer.valueOf(gxhVar.f()));
        map.put("monthlySleepInterpretParam", a(gxhVar));
        map.put("monthlySleepTasks", d(gxhVar, j));
        return map;
    }

    private static String d(gxh gxhVar, long j) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("generateTime", j);
            jSONObject.put("monthlyTasks", j(gxhVar.g()));
            jSONObject.put("monthlyDailyTasks", b(gxhVar, j));
        } catch (JSONException unused) {
            LogUtil.e("SleepManagementResultUtil", "JSONException");
        }
        return jSONObject.toString();
    }

    private static String b(gxh gxhVar, long j, int i) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("generateTime", j);
            jSONObject.put("generateType", i);
            jSONObject.put("monthlyTasks", j(gxhVar.g()));
            jSONObject.put("monthlyDailyTasks", b(gxhVar, j));
        } catch (JSONException unused) {
            LogUtil.e("SleepManagementResultUtil", "JSONException");
        }
        return jSONObject.toString();
    }

    private static JSONArray b(gxh gxhVar, long j) {
        JSONArray jSONArray = new JSONArray();
        List<List<gwq>> listA = gxhVar.a();
        if (njy.e(listA)) {
            LogUtil.e("SleepManagementResultUtil", "tasks is null");
            return jSONArray;
        }
        for (List<gwq> list : listA) {
            if (!njy.e(list)) {
                jSONArray.put(d(list));
            }
        }
        return jSONArray;
    }

    private static JSONArray d(List<gwq> list) {
        JSONArray jSONArray = new JSONArray();
        if (njy.e(list)) {
            LogUtil.e("SleepManagementResultUtil", "task is null");
            return jSONArray;
        }
        for (gwq gwqVar : list) {
            if (gwqVar != null) {
                jSONArray.put(d(gwqVar));
            }
        }
        return jSONArray;
    }

    private static JSONObject d(gwq gwqVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("taskId", gwqVar.a());
            jSONObject.put("taskCode", gwqVar.e());
            jSONObject.put(ParsedFieldTag.TASK_TYPE, gwqVar.c());
            jSONObject.put("dailyTaskCard", c(gwqVar.d()));
            return jSONObject;
        } catch (JSONException unused) {
            LogUtil.e("SleepManagementResultUtil", "JSONException");
            return jSONObject;
        }
    }

    private static String a(gxh gxhVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("monthlyProbDesc", gxhVar.d());
            jSONObject.put("monthlyProbVal", j(gxhVar.j()));
            jSONObject.put("monthlyMajorReason", j(gxhVar.c()));
            jSONObject.put("monthlyImpactDesc", gxhVar.b());
            jSONObject.put("monthlyRecomd", e(gxhVar.i()));
            jSONObject.put("monthlyDailyAdvices", b(gxhVar.e()));
        } catch (JSONException unused) {
            LogUtil.e("SleepManagementResultUtil", "JSONException");
        }
        return jSONObject.toString();
    }

    private static JSONArray j(List<Integer> list) {
        JSONArray jSONArray = new JSONArray();
        if (!njy.e(list)) {
            for (Integer num : list) {
                if (num != null) {
                    jSONArray.put(num);
                }
            }
        }
        return jSONArray;
    }

    private static JSONArray b(List<gwt> list) {
        JSONArray jSONArray = new JSONArray();
        if (!njy.e(list)) {
            Iterator<gwt> it = list.iterator();
            while (it.hasNext()) {
                jSONArray.put(e(it.next()));
            }
        }
        return jSONArray;
    }

    private static JSONObject e(gwt gwtVar) {
        JSONObject jSONObject = new JSONObject();
        if (gwtVar != null) {
            try {
                jSONObject.put("adviceId", gwtVar.c());
                jSONObject.put("adviceCode", gwtVar.b());
                jSONObject.put("adviceType", gwtVar.e());
                return jSONObject;
            } catch (JSONException unused) {
                LogUtil.e("SleepManagementResultUtil", "JSONException");
            }
        }
        return jSONObject;
    }

    private static JSONObject e(gwu gwuVar) {
        JSONObject jSONObject = new JSONObject();
        if (gwuVar != null) {
            try {
                jSONObject.put("recomdAsleepTime", gwuVar.a());
                jSONObject.put("recomdAwakeTime", gwuVar.d());
                jSONObject.put("recomdSleepDur", gwuVar.b());
                gwd gwdVarE = e();
                if (gwdVarE == null) {
                    LogUtil.e("SleepManagementResultUtil", "curAlarm is null");
                    return jSONObject;
                }
                jSONObject.put("fallAsleepTime", c(gwdVarE));
                jSONObject.put("wakeupTime", e(gwdVarE));
                return jSONObject;
            } catch (JSONException unused) {
                LogUtil.e("SleepManagementResultUtil", "JSONException");
            }
        }
        return jSONObject;
    }

    private static long e(gwd gwdVar) {
        return ((((long) gwdVar.c()) * 60) + ((long) gwdVar.e())) * 60000;
    }

    private static long c(gwd gwdVar) {
        return ((((long) gwdVar.i()) * 60) + ((long) gwdVar.l())) * 60000;
    }

    private static gwd e() {
        Set<gwd> alarms = new gwe().getAlarms();
        LogUtil.a("SleepManagementResultUtil", "alarmInfos: ", Integer.valueOf(alarms.size()));
        for (gwd gwdVar : alarms) {
            if (gwdVar.d() == 1000) {
                return gwdVar;
            }
        }
        return null;
    }

    private static JSONObject h() {
        JSONObject jSONObject = new JSONObject();
        try {
            gwd gwdVarE = e();
            if (gwdVarE == null) {
                LogUtil.e("SleepManagementResultUtil", "getDailyRecomd alarmInfo is null");
                return jSONObject;
            }
            jSONObject.put("fallAsleepTime", c(gwdVarE));
            jSONObject.put("wakeupTime", e(gwdVarE));
            return jSONObject;
        } catch (JSONException unused) {
            LogUtil.e("SleepManagementResultUtil", "JSONException");
            return jSONObject;
        }
    }

    private static String e(gxd gxdVar, long j) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("generateTime", j);
            List<gwn> listK = gxdVar.k();
            if (njy.e(listK)) {
                return jSONObject.toString();
            }
            JSONArray jSONArray = new JSONArray();
            Iterator<gwn> it = listK.iterator();
            while (it.hasNext()) {
                jSONArray.put(e(it.next()));
            }
            jSONObject.put("dailyTask", jSONArray);
            return jSONObject.toString();
        } catch (JSONException unused) {
            LogUtil.e("SleepManagementResultUtil", "JSONException");
        }
    }

    private static JSONObject e(gwn gwnVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("taskId", gwnVar.a());
            jSONObject.put("taskCode", gwnVar.c());
            jSONObject.put(ParsedFieldTag.TASK_TYPE, gwnVar.b());
            jSONObject.put("dailyTaskCard", c(gwnVar.e()));
            return jSONObject;
        } catch (JSONException unused) {
            LogUtil.e("SleepManagementResultUtil", "JSONException");
            return jSONObject;
        }
    }

    private static JSONObject c(gwm gwmVar) {
        JSONObject jSONObject = new JSONObject();
        if (gwmVar != null) {
            try {
                jSONObject.put("taskNum", gwmVar.d());
                jSONObject.put("taskTime", gwmVar.b());
                return jSONObject;
            } catch (JSONException unused) {
                LogUtil.e("SleepManagementResultUtil", "JSONException");
            }
        }
        return jSONObject;
    }

    private static String b(gxd gxdVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("dailyQualityDesc", gxdVar.o());
            jSONObject.put("dailyProblemDesc", gxdVar.g());
            jSONObject.put("dailyProblemImpact", gxdVar.f());
            jSONObject.put("dailyFactorDesc", gxdVar.e());
            jSONObject.put("dailyRecomd", h());
            jSONObject.put("dailyProblemDescInput", a(gxdVar.h()));
            jSONObject.put("dailyFactorDescInput", c(gxdVar.c()));
            jSONObject.put("dailyAdvice", a(gxdVar));
            jSONObject.put("dailyProblemPhysio", gxdVar.n());
            jSONObject.put("dailyFactorPhysio", gxdVar.b());
        } catch (JSONException unused) {
            LogUtil.e("SleepManagementResultUtil", "JSONException");
        }
        return jSONObject.toString();
    }

    private static JSONArray c(List<gwi> list) {
        JSONArray jSONArray = new JSONArray();
        try {
            if (!njy.e(list)) {
                for (gwi gwiVar : list) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("val", gwiVar.d());
                    jSONObject.put("trans", gwiVar.a());
                    jSONArray.put(jSONObject);
                }
            }
        } catch (JSONException unused) {
            LogUtil.e("SleepManagementResultUtil", "JSONException");
        }
        return jSONArray;
    }

    private static JSONArray a(List<gwk> list) {
        JSONArray jSONArray = new JSONArray();
        try {
            if (!njy.e(list)) {
                for (gwk gwkVar : list) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("val", gwkVar.e());
                    jSONObject.put("trans", gwkVar.a());
                    jSONArray.put(jSONObject);
                }
            }
        } catch (JSONException unused) {
            LogUtil.e("SleepManagementResultUtil", "JSONException");
        }
        return jSONArray;
    }

    private static JSONArray a(gxd gxdVar) {
        JSONArray jSONArray = new JSONArray();
        try {
            List<gwf> listD = gxdVar.d();
            if (!njy.e(listD)) {
                for (gwf gwfVar : listD) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("adviceId", gwfVar.a());
                    jSONObject.put("adviceCode", gwfVar.e());
                    jSONObject.put("adviceType", gwfVar.c());
                    jSONArray.put(jSONObject);
                }
            }
        } catch (JSONException unused) {
            LogUtil.e("SleepManagementResultUtil", "JSONException");
        }
        return jSONArray;
    }

    public static Map<String, Object> c(SparseArray<Object> sparseArray) {
        HashMap map = new HashMap();
        if (sparseArray == null) {
            LogUtil.e("SleepManagementResultUtil", "resultMap is null");
            return map;
        }
        map.put("dailySleepProblem", Integer.valueOf(d(sparseArray, DicDataTypeUtil.DataType.DAILY_SLEEP_PROBLEM.value())));
        map.put("dailySleepDegree", Integer.valueOf(d(sparseArray, DicDataTypeUtil.DataType.DAILY_SLEEP_DEGREE.value())));
        map.put("dailyTargetProblem", a(sparseArray, DicDataTypeUtil.DataType.DAILY_TARGET_PROBLEM.value()));
        map.put("dailySleepInterpretParam", a(sparseArray, DicDataTypeUtil.DataType.DAILY_SLEEP_INTERPRET.value()));
        map.put("dailySleepTasks", a(sparseArray, DicDataTypeUtil.DataType.DAILY_SLEEP_TASKS.value()));
        return map;
    }

    public static Map<String, Object> c(SparseArray<Object> sparseArray, long j, boolean z) {
        HashMap map = new HashMap();
        if (sparseArray == null) {
            LogUtil.e("SleepManagementResultUtil", "resultMap is null");
            return map;
        }
        Object obj = sparseArray.get(DicDataTypeUtil.DataType.MONTHLY_SLEEP.value());
        if (!(obj instanceof List)) {
            LogUtil.e("SleepManagementResultUtil", "data is invalid");
            return map;
        }
        List list = (List) obj;
        if (njy.e(list)) {
            LogUtil.e("SleepManagementResultUtil", "dataList is invalid");
            return map;
        }
        List<HiHealthData> listE = e(a((List<HiHealthData>) list, j, z));
        LogUtil.a("SleepManagementResultUtil", "result: ", listE.toString());
        if (listE.size() != 5) {
            LogUtil.e("SleepManagementResultUtil", "result map is not 5");
            return map;
        }
        map.put("rhythmType", Integer.valueOf(a(listE, DicDataTypeUtil.DataType.RHYTHM_TYPE.value())));
        map.put("monthlySleepProblem", Integer.valueOf(a(listE, DicDataTypeUtil.DataType.MONTHLY_SLEEP_PROBLEM.value())));
        map.put("monthlySleepDegree", Integer.valueOf(a(listE, DicDataTypeUtil.DataType.MONTHLY_SLEEP_DEGREE.value())));
        map.put("monthlySleepInterpretParam", c(listE, DicDataTypeUtil.DataType.MONTHLY_SLEEP_INTERPRET.value()));
        map.put("monthlySleepTasks", c(listE, DicDataTypeUtil.DataType.MONTHLY_SLEEP_TASKS.value()));
        return map;
    }

    private static List<HiHealthData> a(List<HiHealthData> list, long j, boolean z) {
        if (z) {
            return list;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (HiHealthData hiHealthData : list) {
            if (Math.abs(lsl.a(hiHealthData.getEndTime(), lsl.b(j))) <= 2) {
                arrayList.add(hiHealthData);
            }
        }
        return arrayList;
    }

    private static List<HiHealthData> e(List<HiHealthData> list) {
        long j = 0;
        long endTime = 0;
        long j2 = 0;
        for (HiHealthData hiHealthData : list) {
            if (hiHealthData != null && hiHealthData.getType() == DicDataTypeUtil.DataType.MONTHLY_SLEEP_TASKS.value()) {
                try {
                    long j3 = new JSONObject(hiHealthData.getMetaData()).getLong("generateTime");
                    if (j3 > j) {
                        try {
                            endTime = hiHealthData.getEndTime();
                            j = j3;
                        } catch (JSONException unused) {
                            j = j3;
                            LogUtil.e("SleepManagementResultUtil", "JSONException");
                        }
                    }
                    long endTime2 = hiHealthData.getEndTime();
                    if (endTime2 > j2) {
                        j2 = endTime2;
                    }
                } catch (JSONException unused2) {
                }
            }
        }
        LogUtil.a("SleepManagementResultUtil", "latestGenerateTime:", Long.valueOf(j), " endTime:", Long.valueOf(endTime), " latestEndTime:", Long.valueOf(j2));
        long jD = d(endTime, j2);
        ArrayList arrayList = new ArrayList(5);
        for (HiHealthData hiHealthData2 : list) {
            if (hiHealthData2 != null && hiHealthData2.getEndTime() == jD) {
                arrayList.add(hiHealthData2);
            }
        }
        return arrayList;
    }

    private static long d(long j, long j2) {
        if (j2 - j > 1296000000) {
            j = j2;
        }
        LogUtil.a("SleepManagementResultUtil", "resultEndTime: ", Long.valueOf(j));
        return j;
    }

    public static int d(SparseArray<Object> sparseArray, int i) {
        HiHealthData hiHealthData;
        Object obj = sparseArray.get(i);
        if (!(obj instanceof List)) {
            return -1;
        }
        List list = (List) obj;
        if (njy.e(list) || (hiHealthData = (HiHealthData) list.get(0)) == null) {
            return -1;
        }
        return (int) hiHealthData.getValue();
    }

    private static int a(List<HiHealthData> list, int i) {
        for (HiHealthData hiHealthData : list) {
            if (hiHealthData != null && hiHealthData.getType() == i) {
                return (int) hiHealthData.getValue();
            }
        }
        return -1;
    }

    public static String a(SparseArray<Object> sparseArray, int i) {
        HiHealthData hiHealthData;
        Object obj = sparseArray.get(i);
        if (!(obj instanceof List)) {
            return "";
        }
        List list = (List) obj;
        return (njy.e(list) || (hiHealthData = (HiHealthData) list.get(0)) == null) ? "" : hiHealthData.getMetaData();
    }

    private static String c(List<HiHealthData> list, int i) {
        for (HiHealthData hiHealthData : list) {
            if (hiHealthData != null && hiHealthData.getType() == i) {
                return hiHealthData.getMetaData();
            }
        }
        return "";
    }

    public static boolean d(gxd gxdVar, Map<String, Object> map) {
        if (gxdVar == null || map == null || gxdVar.j() != ((Integer) map.get("dailySleepProblem")).intValue() || gxdVar.i() != ((Integer) map.get("dailySleepDegree")).intValue()) {
            return false;
        }
        if (!b(g(gxdVar.a()), (String) map.get("dailyTargetProblem"))) {
            LogUtil.a("SleepManagementResultUtil", "has different target problem");
            return false;
        }
        if (!a(gxdVar, map)) {
            LogUtil.a("SleepManagementResultUtil", "has different factor string");
            return false;
        }
        if (b(gxdVar, map)) {
            return true;
        }
        LogUtil.a("SleepManagementResultUtil", "has different problem string");
        return false;
    }

    private static boolean a(gxd gxdVar, Map<String, Object> map) {
        try {
            return e(new JSONObject((String) map.get("dailySleepInterpretParam")).optJSONArray("dailyFactorDescInput"), c(gxdVar.c()));
        } catch (JSONException unused) {
            LogUtil.e("SleepManagementResultUtil", "isSameFactorString JSONException");
            return false;
        }
    }

    private static boolean b(gxd gxdVar, Map<String, Object> map) {
        try {
            JSONArray jSONArrayA = a(gxdVar.h());
            JSONObject jSONObject = new JSONObject((String) map.get("dailySleepInterpretParam"));
            return e(jSONObject.optJSONArray("dailyProblemDescInput"), jSONArrayA) && jSONObject.optString("dailyQualityDesc").equals(gxdVar.o()) && jSONObject.optString("dailyProblemDesc").equals(gxdVar.g()) && jSONObject.optString("dailyFactorDesc").equals(gxdVar.e()) && jSONObject.optString("dailyProblemImpact").equals(gxdVar.f()) && jSONObject.optString("dailyProblemPhysio").equals(gxdVar.f()) && jSONObject.optString("dailyFactorPhysio").equals(gxdVar.f());
        } catch (JSONException unused) {
            LogUtil.e("SleepManagementResultUtil", "isSameProblemString JSONException");
            return false;
        }
    }

    private static boolean e(JSONArray jSONArray, JSONArray jSONArray2) {
        if (c(jSONArray) && c(jSONArray2)) {
            return true;
        }
        if (c(jSONArray) || c(jSONArray2)) {
            return false;
        }
        if (b(jSONArray2.toString(), jSONArray.toString())) {
            return true;
        }
        LogUtil.a("SleepManagementResultUtil", "different array string");
        return false;
    }

    private static boolean c(JSONArray jSONArray) {
        return jSONArray == null || jSONArray.length() == 0;
    }

    private static boolean b(String str, String str2) {
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            return true;
        }
        return (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || !str.equals(str2)) ? false : true;
    }

    public static void c(boolean z) {
        d(z);
        vdo.b(MatterDataContans.TYPE_HEALTH, "900300013", Boolean.toString(z), new HiDataOperateListener() { // from class: uag.15
            @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
            public void onResult(int i, Object obj) {
                LogUtil.a("SleepManagementResultUtil", "setSleepManagementState errorCode: ", Integer.valueOf(i), ", object: ", obj);
            }
        });
    }

    public static void a(long j, SleepDailyProcessResultCallback<gxd> sleepDailyProcessResultCallback) {
        synchronized (uag.class) {
            LogUtil.a("SleepManagementResultUtil", "requestAndUpdateDailyResult");
            if (!VersionControlUtil.isSupportSleepManagement()) {
                LogUtil.j("SleepManagementResultUtil", "not support sleep management");
            } else {
                d(j, sleepDailyProcessResultCallback, false, null);
            }
        }
    }

    public static void c(Date date, SleepDailyProcessResultCallback<gxd> sleepDailyProcessResultCallback) {
        LogUtil.a("SleepManagementResultUtil", "syncRequestAndUpdateDailyResult");
        if (!VersionControlUtil.isSupportSleepManagement()) {
            LogUtil.j("SleepManagementResultUtil", "not support sleep management");
            return;
        }
        gxd gxdVarA = gwb.a(date);
        if (gxdVarA != null) {
            sleepDailyProcessResultCallback.onResponse(0, gxdVarA);
        }
        d(date.getTime(), sleepDailyProcessResultCallback, true, gxdVarA);
    }

    private static void d(final long j, final SleepDailyProcessResultCallback<gxd> sleepDailyProcessResultCallback, final boolean z, final gxd gxdVar) {
        d(j, new SleepManagementCallback<gwo>() { // from class: uag.5
            @Override // com.huawei.ui.main.stories.fitness.activity.coresleep.SleepManagementCallback
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public void onSuccess(gwo gwoVar) {
                LogUtil.a("SleepManagementResultUtil", "requestAndUpdateDailyResult request success");
                gwl gwlVarC = gwoVar.c();
                gxd gxdVarD = gwoVar.d();
                if (!gwlVarC.c()) {
                    gxd gxdVarC = uag.c(gwlVarC.e());
                    gxdVarC.c(j);
                    LogUtil.a("SleepManagementResultUtil", "requestAndUpdateDailyResult not Updated, return dailyResultBean: ", gxdVarC.toString());
                    gxd gxdVar2 = gxdVar;
                    LogUtil.a("SleepManagementResultUtil", "bean from sp is ", gxdVar2, "isEqual ", Boolean.valueOf(gxdVarC.equals(gxdVar2)));
                    gxd gxdVar3 = gxdVar;
                    if (gxdVar3 == null || gwb.c(Collections.singletonList(gxdVar3), Collections.singletonList(gxdVarC))) {
                        LogUtil.a("SleepManagementResultUtil", "callback new bean");
                        gwb.d(new Date(j), gxdVarC);
                        sleepDailyProcessResultCallback.onResponse(0, gxdVarC);
                    }
                } else {
                    LogUtil.a("SleepManagementResultUtil", "requestAndUpdateDailyResult has Updated");
                    gxdVarD.b(gwlVarC.c());
                    gxdVarD.c(j);
                    gwb.d(new Date(j), gxdVarD);
                    uag.c(gxdVarD, j, sleepDailyProcessResultCallback, z);
                }
                uag.a(gxdVarD, j);
            }

            @Override // com.huawei.ui.main.stories.fitness.activity.coresleep.SleepManagementCallback
            public void onFailure(int i, String str) {
                LogUtil.e("SleepManagementResultUtil", "errCode: ", Integer.valueOf(i), ", errMsg: ", str);
                sleepDailyProcessResultCallback.onResponse(1, null);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static gxd c(Map<String, Object> map) {
        gxd gxdVar = new gxd();
        if (map == null) {
            LogUtil.e("SleepManagementResultUtil", "resultMap is null");
            return gxdVar;
        }
        gxdVar.c(qqw.c(map, "dailySleepProblem", 0));
        gxdVar.a(qqw.c(map, "dailySleepDegree", 0));
        gxdVar.a(e(qqw.d((Map) map, "dailyTargetProblem", "")));
        try {
            JSONObject jSONObject = new JSONObject(qqw.d((Map) map, "dailySleepInterpretParam", ""));
            gxdVar.c(jSONObject.optString("dailyQualityDesc"));
            gxdVar.d(jSONObject.optString("dailyProblemDesc"));
            gxdVar.b(jSONObject.optString("dailyProblemImpact"));
            gxdVar.a(jSONObject.optString("dailyFactorDesc"));
            gxdVar.d(b(jSONObject.optJSONArray("dailyProblemDescInput")));
            gxdVar.c(e(jSONObject.optJSONArray("dailyFactorDescInput")));
            gxdVar.b(a(jSONObject.optJSONArray("dailyAdvice")));
            gxdVar.e(d(new JSONObject(qqw.d((Map) map, "dailySleepTasks", "")).optJSONArray("dailyTask")));
            return gxdVar;
        } catch (JSONException unused) {
            LogUtil.e("SleepManagementResultUtil", "dailyMapToBean JSONException");
            return gxdVar;
        }
    }

    private static List<gwn> d(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    if (jSONObject != null) {
                        gwn gwnVar = new gwn();
                        gwnVar.c(jSONObject.optInt("taskId"));
                        gwnVar.c(jSONObject.optString("taskCode"));
                        gwnVar.e(jSONObject.optInt(ParsedFieldTag.TASK_TYPE));
                        gwnVar.d(b(jSONObject.optJSONObject("dailyTaskCard")));
                        arrayList.add(gwnVar);
                    }
                } catch (JSONException unused) {
                    LogUtil.e("SleepManagementResultUtil", "transDailyTask JSONException");
                }
            }
        }
        return arrayList;
    }

    private static gwm b(JSONObject jSONObject) {
        gwm gwmVar = new gwm();
        if (jSONObject == null) {
            return gwmVar;
        }
        gwmVar.d(jSONObject.optInt("taskNum"));
        gwmVar.c(jSONObject.optInt("taskTime"));
        return gwmVar;
    }

    private static List<gwi> e(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    if (jSONObject != null) {
                        gwi gwiVar = new gwi();
                        gwiVar.a(jSONObject.optInt("val"));
                        gwiVar.b(jSONObject.optInt("trans"));
                        arrayList.add(gwiVar);
                    }
                } catch (JSONException unused) {
                    LogUtil.e("SleepManagementResultUtil", "JSONException");
                }
            }
        }
        return arrayList;
    }

    private static List<gwk> b(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    if (jSONObject != null) {
                        gwk gwkVar = new gwk();
                        gwkVar.a(jSONObject.optInt("val"));
                        gwkVar.b(jSONObject.optInt("trans"));
                        arrayList.add(gwkVar);
                    }
                } catch (JSONException unused) {
                    LogUtil.e("SleepManagementResultUtil", "JSONException");
                }
            }
        }
        return arrayList;
    }

    private static List<gwf> a(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    if (jSONObject != null) {
                        gwf gwfVar = new gwf();
                        gwfVar.c(jSONObject.optInt("adviceId"));
                        gwfVar.b(jSONObject.optString("adviceCode"));
                        gwfVar.b(jSONObject.optInt("adviceType"));
                        arrayList.add(gwfVar);
                    }
                } catch (JSONException unused) {
                    LogUtil.e("SleepManagementResultUtil", "JSONException");
                }
            }
        }
        return arrayList;
    }

    public static void c(long j, final SleepManagementCallback<Map<String, Object>> sleepManagementCallback) {
        c(new HiDataReadResultListener() { // from class: uag.1
            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResult(Object obj, int i, int i2) {
                if (i != 0) {
                    LogUtil.j("SleepManagementResultUtil", "errorCode: ", Integer.valueOf(i));
                    return;
                }
                if (obj instanceof SparseArray) {
                    SparseArray sparseArray = (SparseArray) obj;
                    if (sparseArray.size() <= 0) {
                        LogUtil.j("SleepManagementResultUtil", "map.size() <= 0");
                    } else {
                        LogUtil.a("SleepManagementResultUtil", "queryDailyResult success");
                        sleepManagementCallback.onSuccess(uag.c((SparseArray<Object>) sparseArray));
                    }
                }
            }

            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResultIntent(int i, Object obj, int i2, int i3) {
                LogUtil.a("SleepManagementResultUtil", "readCardData onResultIntent intentType ", Integer.valueOf(i), " errorCode ", Integer.valueOf(i2));
            }
        }, j);
    }

    public static void a(final long j, final SleepManagementCallback<gwl> sleepManagementCallback) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: uag.2
            @Override // java.lang.Runnable
            public void run() {
                uag.d(j, new SleepManagementCallback<gwo>() { // from class: uag.2.3
                    @Override // com.huawei.ui.main.stories.fitness.activity.coresleep.SleepManagementCallback
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public void onSuccess(gwo gwoVar) {
                        LogUtil.a("SleepManagementResultUtil", "getDailyProcessResult request success");
                        gwl gwlVarC = gwoVar.c();
                        gxd gxdVarD = gwoVar.d();
                        if (gwlVarC.c()) {
                            uag.c(gxdVarD, j, null, true);
                            gwl gwlVar = new gwl();
                            gwlVar.a(true);
                            gwlVar.b(uag.c(gxdVarD, gwoVar.a()));
                            sleepManagementCallback.onSuccess(gwlVar);
                            return;
                        }
                        sleepManagementCallback.onSuccess(gwlVarC);
                    }

                    @Override // com.huawei.ui.main.stories.fitness.activity.coresleep.SleepManagementCallback
                    public void onFailure(int i, String str) {
                        LogUtil.e("SleepManagementResultUtil", "errCode: ", Integer.valueOf(i), ", errMsg: ", str);
                        sleepManagementCallback.onFailure(1, null);
                    }
                });
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(long j, final SleepManagementCallback<gwo> sleepManagementCallback) {
        LogUtil.a("SleepManagementResultUtil", "requestDailyResultInner, time: ", Long.valueOf(j));
        final CountDownLatch countDownLatch = new CountDownLatch(2);
        final gxd[] gxdVarArr = new gxd[1];
        SleepApi sleepApi = (SleepApi) Services.d("Main", SleepApi.class);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (sleepApi != null) {
            sleepApi.requestDailyProcessResult(lsl.r(j), new SleepDailyProcessResultCallback() { // from class: uag.4
                @Override // com.huawei.hwbasemgr.SleepDailyProcessResultCallback
                public void onResponse(int i, Object obj) {
                    if (!(obj instanceof gxd)) {
                        LogUtil.e("SleepManagementResultUtil", "objData is null");
                        sleepManagementCallback.onFailure(0, "requestDailyProcessResult objData is null");
                        countDownLatch.countDown();
                    } else {
                        gxd gxdVar = (gxd) obj;
                        gxdVarArr[0] = gxdVar;
                        LogUtil.a("SleepManagementResultUtil", "requestDailyProcessResult onResponse, resultBean: ", gxdVar.toString());
                        countDownLatch.countDown();
                    }
                }
            });
        } else {
            LogUtil.a("SleepManagementResultUtil", "sleepServiceApi is null");
            countDownLatch.countDown();
        }
        final HashMap map = new HashMap();
        c(new HiDataReadResultListener() { // from class: uag.9
            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResult(Object obj, int i, int i2) {
                LogUtil.a("SleepManagementResultUtil", "queryDailyResult data: ", obj);
                if (i != 0) {
                    LogUtil.j("SleepManagementResultUtil", "errorCode: ", Integer.valueOf(i));
                    countDownLatch.countDown();
                    return;
                }
                if (!(obj instanceof SparseArray)) {
                    countDownLatch.countDown();
                    return;
                }
                SparseArray sparseArray = (SparseArray) obj;
                if (sparseArray.size() <= 0) {
                    LogUtil.j("SleepManagementResultUtil", "map.size() <= 0");
                    countDownLatch.countDown();
                } else {
                    LogUtil.a("SleepManagementResultUtil", "queryDailyResult success");
                    map.putAll(uag.c((SparseArray<Object>) sparseArray));
                    countDownLatch.countDown();
                }
            }

            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResultIntent(int i, Object obj, int i2, int i3) {
                LogUtil.a("SleepManagementResultUtil", "readCardData onResultIntent intentType ", Integer.valueOf(i), " errorCode ", Integer.valueOf(i2));
            }
        }, j);
        try {
            countDownLatch.await(10000L, TimeUnit.MILLISECONDS);
            LogUtil.a("SleepManagementResultUtil", "resultMap: ", map.toString());
            if (gxdVarArr[0] == null) {
                sleepManagementCallback.onFailure(0, "calculate data is null");
                return;
            }
            gwl gwlVar = new gwl();
            if (map.size() != 0 && d(gxdVarArr[0], map)) {
                gwlVar.a(false);
                gwlVar.b(map);
            } else {
                gwlVar.a(true);
            }
            gwo gwoVar = new gwo();
            gwoVar.e(gwlVar);
            gwoVar.d(gxdVarArr[0]);
            gwoVar.c(jCurrentTimeMillis);
            sleepManagementCallback.onSuccess(gwoVar);
        } catch (InterruptedException unused) {
            LogUtil.e("SleepManagementResultUtil", "InterruptedException");
            sleepManagementCallback.onFailure(2, "timeout");
        }
    }

    public static void b(Boolean bool) {
        boolean zD = tza.b().d();
        LogUtil.a("SleepManagementResultUtil", "sleep job service is running: ", Boolean.valueOf(zD));
        if (bool == null) {
            return;
        }
        if (bool.booleanValue() && !zD) {
            tza.b().c();
        } else {
            if (bool.booleanValue() || !zD) {
                return;
            }
            tza.b().e();
        }
    }

    public static void e(final IBaseResponseCallback iBaseResponseCallback) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: uag.6
            @Override // java.lang.Runnable
            public void run() {
                if (iBaseResponseCallback == null) {
                    LogUtil.j("SleepManagementResultUtil", "callback is null");
                    return;
                }
                if (!Utils.h()) {
                    LogUtil.j("SleepManagementResultUtil", "fetch HEALTH_CLOUD from no_cloud user login");
                    iBaseResponseCallback.a(5001, "no_cloud user login");
                    return;
                }
                if (!CommonUtil.ab(BaseApplication.getContext())) {
                    LogUtil.e("SleepManagementResultUtil", "no network,please check");
                    iBaseResponseCallback.a(5001, "no network");
                    return;
                }
                JSONObject jSONObjectOptJSONObject = fof.d().optJSONObject("publicArgs");
                if (jSONObjectOptJSONObject == null) {
                    LogUtil.j("SleepManagementResultUtil", "requestBody is null");
                    iBaseResponseCallback.a(5001, "requestBody is null");
                    return;
                }
                try {
                    jSONObjectOptJSONObject.put("category", 0);
                    jSONObjectOptJSONObject.put("subCategory", 1);
                    if (uag.d == null) {
                        String unused = uag.d = uag.f();
                    }
                    LogUtil.a("SleepManagementResultUtil", "mUrl: " + uag.d + ", requestBody: " + jSONObjectOptJSONObject);
                    final long jElapsedRealtime = SystemClock.elapsedRealtime();
                    Map<String, String> mapA = fof.a();
                    LogUtil.a("SleepManagementResultUtil", "headers: ", mapA.toString());
                    oet.d().c(uag.d, mapA, jSONObjectOptJSONObject.toString(), String.class, new ResultCallback<String>() { // from class: uag.6.5
                        @Override // com.huawei.networkclient.ResultCallback
                        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
                        public void onSuccess(String str) {
                            LogUtil.a("SleepManagementResultUtil", "getPlanState onSuccess, post time: ", Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime));
                            try {
                                if (str == null) {
                                    iBaseResponseCallback.a(5001, "data is null");
                                    return;
                                }
                                JSONObject jSONObject = new JSONObject(str);
                                LogUtil.a("SleepManagementResultUtil", "response: ", jSONObject);
                                int iOptInt = jSONObject.optInt("resultCode");
                                if (iOptInt == 0) {
                                    uag.c(iBaseResponseCallback, jSONObject);
                                } else {
                                    iBaseResponseCallback.a(iOptInt, jSONObject.optString("resultDesc"));
                                    uag.d(iOptInt, jSONObject.optString("resultDesc"));
                                }
                            } catch (JSONException unused2) {
                                iBaseResponseCallback.a(5002, "JSONException");
                            }
                        }

                        @Override // com.huawei.networkclient.ResultCallback
                        public void onFailure(Throwable th) {
                            LogUtil.a("SleepManagementResultUtil", "getPlanState onFail, post time: ", Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime));
                            iBaseResponseCallback.a(5003, th.getMessage());
                        }
                    });
                } catch (JSONException unused2) {
                    LogUtil.e("SleepManagementResultUtil", "JSONException");
                    iBaseResponseCallback.a(5001, "JSONException");
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(int i, Object obj) {
        boolean zBooleanValue;
        LogUtil.a("SleepManagementResultUtil", "resCode:", Integer.valueOf(i));
        if (obj instanceof Boolean) {
            zBooleanValue = ((Boolean) obj).booleanValue();
        } else if (i != 23030) {
            return;
        } else {
            zBooleanValue = false;
        }
        d(zBooleanValue);
    }

    private static void d(boolean z) {
        String str = String.format(Locale.ROOT, "%d,%b", Long.valueOf(System.currentTimeMillis()), Boolean.valueOf(z));
        lua.a(String.valueOf(PrebakedEffectId.RT_COIN_DROP), "intelSleepTimeStatus", str);
        LogUtil.a("SleepManagementResultUtil", "setStatusToSp success:", str);
    }

    public static Boolean c(Boolean bool) {
        String strH = lua.h(String.valueOf(PrebakedEffectId.RT_COIN_DROP), "intelSleepTimeStatus");
        if (!TextUtils.isEmpty(strH)) {
            String[] strArrSplit = strH.split(",");
            if (strArrSplit.length == 2 && c(CommonUtil.i(strArrSplit[0]))) {
                bool = Boolean.valueOf(Boolean.parseBoolean(strArrSplit[1]));
            }
        }
        LogUtil.a("SleepManagementResultUtil", "timeAndStatus:", strH);
        return bool;
    }

    private static boolean c(long j) {
        return System.currentTimeMillis() - j <= 86400000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(IBaseResponseCallback iBaseResponseCallback, JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("planDetail");
        if (jSONObjectOptJSONObject == null) {
            LogUtil.j("SleepManagementResultUtil", "planDetail is null");
            iBaseResponseCallback.a(5002, "planDetail is null");
            return;
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("publicInfo");
        if (jSONObjectOptJSONObject2 == null) {
            LogUtil.j("SleepManagementResultUtil", "planDetail is null");
            iBaseResponseCallback.a(5002, "publicInfo is null");
            return;
        }
        JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject2.optJSONObject("planMetaInfo");
        if (jSONObjectOptJSONObject3 == null) {
            LogUtil.j("SleepManagementResultUtil", "planDetail is null");
            iBaseResponseCallback.a(5002, "planMetaInfo is null");
            return;
        }
        int iOptInt = jSONObjectOptJSONObject3.optInt("status");
        int iOptInt2 = jSONObjectOptJSONObject3.optInt("transactionStatus");
        LogUtil.a("SleepManagementResultUtil", "parsePlanDetail: status: ", Integer.valueOf(iOptInt), ", transactionStatus: ", Integer.valueOf(iOptInt2));
        iBaseResponseCallback.a(0, Boolean.valueOf(iOptInt == 1 && iOptInt2 == 1));
        d(0, Boolean.valueOf(iOptInt == 1 && iOptInt2 == 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String f() {
        return GRSManager.c(BaseApplication.getContext()).getUrl("domainHealthdataHicloud") + "/healthExpansion/app/plan/v1/getPlanDetail";
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static class b implements SleepMonthlyProcessResultCallback<gxh> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f49857a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f49858b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private SleepJobService.c f49859c;
        private long e;

        public b(SleepJobService.c cVar, long j, long j2) {
            this.f49859c = cVar;
            this.f49858b = j;
            this.e = j2;
        }

        @Override // com.huawei.hwbasemgr.SleepMonthlyProcessResultCallback
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onResponse(int i, gxh gxhVar) {
            LogUtil.a("SleepManagementResultUtil", "handle from MonthlyProcessResultCallback");
            try {
                uag.e(i, gxhVar, this.f49858b, this.e, this.f49857a);
            } catch (NoSuchMethodError e) {
                ReleaseLogUtil.b("R_SleepManagementResultUtil", "MonthlyProcessResultCallback error ", ExceptionUtils.c(e));
            }
            SleepJobService.c cVar = this.f49859c;
            if (cVar != null) {
                cVar.a(0, true);
            }
        }
    }
}
