package defpackage;

import android.text.TextUtils;
import com.huawei.hihealth.HiGoalInfo;
import com.huawei.hihealth.HiSampleConfig;
import com.huawei.hihealth.HiSyncOption;
import com.huawei.hihealth.HiUserPreference;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiCommonListener;
import com.huawei.hihealth.data.listener.HiDataOperateListener;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginhealthzone.interactors.HealthZonePushReceiver;
import health.compact.a.CommonUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public class qgm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap<String, String> f46188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static AtomicBoolean f46189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String[] f46190c;
    private static final String[] d;
    private static int e;

    static {
        HashMap<String, String> map = new HashMap<>();
        f46188a = map;
        e = 10000;
        f46190c = new String[]{"10", "15", HealthZonePushReceiver.DEAUTH_EVENT_NOTIFY, "25", HealthZonePushReceiver.SLEEP_SCORE_NOTIFY, HealthZonePushReceiver.BODY_TEMPERATURE_LOW_NOTIFY, HealthZonePushReceiver.FAMILY_CARE_NOTIFY, "45", "50", "55", "60", "65", "70", "75", "80", "85", "90"};
        d = new String[]{"6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16"};
        f46189b = new AtomicBoolean(true);
        map.put("active_sp_key_achieved_goal_step", "900200006");
        map.put("active_sp_key_achieved_goal_calorie", "900200007");
        map.put("active_sp_key_achieved_goal_intensity", "900200008");
        map.put("active_sp_key_achieved_goal_stand", "900200009");
    }

    public static void b(String str, int i) {
        c(str, i, null);
    }

    public static void c(final String str, final int i, final ResponseCallback<qgx> responseCallback) {
        c(str, new IBaseResponseCallback() { // from class: qgn
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i2, Object obj) {
                qgm.a(str, i, responseCallback, i2, obj);
            }
        });
    }

    static /* synthetic */ void a(String str, int i, ResponseCallback responseCallback, int i2, Object obj) {
        if (!(obj instanceof qgx)) {
            LogUtil.a("SCUI_ActiveGoalUtil", "enter first time save model key ", str, " goalVal ", Integer.valueOf(i));
            a(str, c(i, System.currentTimeMillis()), (ResponseCallback<qgx>) responseCallback);
            return;
        }
        qgx qgxVar = (qgx) obj;
        if (qgxVar.d() != i) {
            LogUtil.a("SCUI_ActiveGoalUtil", "enter not the first time save model key ", str, " goalVal ", Integer.valueOf(i), " activeGoalModel is ", qgxVar);
            a(str, c(i, System.currentTimeMillis()), (ResponseCallback<qgx>) responseCallback);
        }
    }

    public static void c(final String str, final IBaseResponseCallback iBaseResponseCallback) {
        if (TextUtils.isEmpty(str) || iBaseResponseCallback == null) {
            LogUtil.j("SCUI_ActiveGoalUtil", "getActiveGoalModel key or callback is null");
            return;
        }
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(str);
        a(arrayList, new IBaseResponseCallback() { // from class: qgo
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                qgm.a(str, iBaseResponseCallback, i, obj);
            }
        });
    }

    static /* synthetic */ void a(String str, IBaseResponseCallback iBaseResponseCallback, int i, Object obj) {
        if (obj instanceof HashMap) {
            HashMap map = (HashMap) obj;
            if (map.containsKey(str)) {
                iBaseResponseCallback.a(0, map.get(str));
                return;
            } else {
                iBaseResponseCallback.a(0, null);
                return;
            }
        }
        iBaseResponseCallback.a(0, null);
    }

    private static void a(final String str, final qgx qgxVar, final ResponseCallback<qgx> responseCallback) {
        lsy.a(new Runnable() { // from class: qgm.5
            @Override // java.lang.Runnable
            public void run() {
                LogUtil.a("SCUI_ActiveGoalUtil", "saveActiveGoalModel start save model and sync cloud");
                qgm.d(str, qgxVar);
                qgm.a(qgxVar, str, (ResponseCallback<qgx>) responseCallback);
                qgm.i();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(String str, qgx qgxVar) {
        if ("900200006".equals(str)) {
            qgq.b(qgxVar.d(), new IBaseResponseCallback() { // from class: qgm.3
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    LogUtil.a("SCUI_ActiveGoalUtil", "saveMotionGoal end errorCode ", Integer.valueOf(i));
                }
            });
        }
    }

    public static void a(List<String> list, final IBaseResponseCallback iBaseResponseCallback) {
        if (njy.e(list) || iBaseResponseCallback == null) {
            LogUtil.j("SCUI_ActiveGoalUtil", "getActiveGoals keys or callback is null");
            return;
        }
        final HashMap map = new HashMap(16);
        ReleaseLogUtil.d("SCUI_ActiveGoalUtil", npt.d("getActiveGoals configIdList ", list.toString()));
        qhq.b("9002", list, new HiDataReadResultListener() { // from class: qgm.2
            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResultIntent(int i, Object obj, int i2, int i3) {
            }

            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResult(Object obj, int i, int i2) {
                ReleaseLogUtil.d("SCUI_ActiveGoalUtil", npt.d("onResult errorCode: ", Integer.valueOf(i), ", data: ", obj));
                if (!njy.b(obj, HiSampleConfig.class)) {
                    LogUtil.j("SCUI_ActiveGoalUtil", "list getActiveGoals isListTypeMatch false ");
                    qgm.e(iBaseResponseCallback);
                    return;
                }
                List<HiSampleConfig> list2 = (List) obj;
                if (njy.e(list2)) {
                    LogUtil.j("SCUI_ActiveGoalUtil", "list getActiveGoals list is empty ");
                    qgm.e(iBaseResponseCallback);
                    return;
                }
                for (HiSampleConfig hiSampleConfig : list2) {
                    if (hiSampleConfig != null) {
                        String configData = hiSampleConfig.getConfigData();
                        if (TextUtils.isEmpty(configData)) {
                            map.put(hiSampleConfig.getConfigId(), Integer.valueOf(qgm.d(hiSampleConfig.getConfigId())));
                        } else {
                            map.put(hiSampleConfig.getConfigId(), Integer.valueOf(((qgx) HiJsonUtil.d(configData, qgx.class)).d()));
                        }
                    }
                }
                LogUtil.a("SCUI_ActiveGoalUtil", "list getActiveGoals return ", map);
                iBaseResponseCallback.a(0, map);
            }
        });
    }

    public static int d(HashMap<String, Integer> map, String str, int i) {
        Integer num;
        return (!map.containsKey(str) || (num = map.get(str)) == null) ? i : num.intValue();
    }

    private static void d(final List<HiUserPreference> list, final List<String> list2) {
        LogUtil.a("SCUI_ActiveGoalUtil", "initSampleConfigGoal start ", Boolean.valueOf(!f46189b.get()));
        if (f46189b.get()) {
            if (!SharedPreferenceManager.b("HiHealthService", "pullAllStatus", false)) {
                LogUtil.a("SCUI_ActiveGoalUtil", "data is not sync finish.");
            } else {
                a(new IBaseResponseCallback() { // from class: qgm.4
                    @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                    /* JADX INFO: renamed from: onResponse */
                    public void a(int i, Object obj) {
                        LogUtil.a("SCUI_ActiveGoalUtil", "initSampleConfigGoal motionGoal end ");
                        if (njy.e(list)) {
                            qgm.a(qgm.c(qgm.e, 1L), "900200006", (ResponseCallback<qgx>) null);
                            qgm.a(qgm.c(25, 1L), "900200008", (ResponseCallback<qgx>) null);
                            qgm.a(qgm.c(12, 1L), "900200009", (ResponseCallback<qgx>) null);
                            qgm.a(qgm.c(270000, 1L), "900200007", (ResponseCallback<qgx>) null);
                            qgm.f46189b.set(false);
                            LogUtil.a("SCUI_ActiveGoalUtil", "initSampleConfigGoal preferencesList is null, write data then end ");
                            return;
                        }
                        list2.add("active_sp_key_achieved_goal_calorie");
                        for (String str : list2) {
                            qgm.a(qgm.c(qgm.d(0, str), 1L), qgm.f46188a.get(str), (ResponseCallback<qgx>) null);
                        }
                        for (HiUserPreference hiUserPreference : list) {
                            if (hiUserPreference != null) {
                                qgm.a(qgm.c(((qgj) HiJsonUtil.d(hiUserPreference.getValue(), qgj.class)).c(), 1L), qgm.f46188a.get(hiUserPreference.getKey()), (ResponseCallback<qgx>) null);
                            }
                        }
                        qgm.f46189b.set(false);
                    }
                });
            }
        }
    }

    public static int d(String str) {
        if ("900200006".equals(str) || "active_sp_key_achieved_goal_step".equals(str)) {
            return e;
        }
        if ("900200008".equals(str) || "active_sp_key_achieved_goal_intensity".equals(str)) {
            return 25;
        }
        if ("900200009".equals(str) || "active_sp_key_achieved_goal_stand".equals(str)) {
            return 12;
        }
        return ("900200007".equals(str) || "active_sp_key_achieved_goal_calorie".equals(str)) ? 270000 : 0;
    }

    private static void a(final IBaseResponseCallback iBaseResponseCallback) {
        HiHealthNativeApi.a(BaseApplication.getContext()).fetchGoalInfo(0, 2, new HiCommonListener() { // from class: qgm.1
            @Override // com.huawei.hihealth.data.listener.HiCommonListener
            public void onSuccess(int i, Object obj) {
                List list;
                if (njy.b(obj, HiGoalInfo.class)) {
                    list = (List) obj;
                } else {
                    LogUtil.j("SCUI_ActiveGoalUtil", "data is not list<HiGoalInfo> type");
                    list = null;
                }
                if (njy.b(list) && list.get(0) != null) {
                    int unused = qgm.e = (int) ((HiGoalInfo) list.get(0)).getGoalValue();
                }
                LogUtil.a("SCUI_ActiveGoalUtil", "getStepGoalByMotionGoal StepMotionGoal ", Integer.valueOf(qgm.e));
                iBaseResponseCallback.a(0, Integer.valueOf(qgm.e));
            }

            @Override // com.huawei.hihealth.data.listener.HiCommonListener
            public void onFailure(int i, Object obj) {
                iBaseResponseCallback.a(-1, Integer.valueOf(qgm.e));
            }
        });
    }

    public static HashMap<String, Integer> e(IBaseResponseCallback iBaseResponseCallback) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add("active_sp_key_achieved_goal_step");
        arrayList.add("active_sp_key_achieved_goal_intensity");
        arrayList.add("active_sp_key_achieved_goal_stand");
        List<HiUserPreference> userPreferenceList = HiHealthManager.d(BaseApplication.getContext()).getUserPreferenceList(arrayList);
        d(userPreferenceList, arrayList);
        HashMap<String, Integer> mapE = e();
        for (HiUserPreference hiUserPreference : userPreferenceList) {
            if (hiUserPreference != null) {
                mapE.put(f46188a.get(hiUserPreference.getKey()), Integer.valueOf(d(((qgj) HiJsonUtil.d(hiUserPreference.getValue(), qgj.class)).c(), hiUserPreference.getKey())));
            }
        }
        iBaseResponseCallback.a(0, mapE);
        LogUtil.a("SCUI_ActiveGoalUtil", "getUserPreferenceGoal map is ", mapE.toString());
        return mapE;
    }

    private static HashMap<String, Integer> e() {
        HashMap<String, Integer> map = new HashMap<>(4);
        map.put("900200006", 10000);
        map.put("900200009", 12);
        map.put("900200008", 25);
        map.put("900200007", 270000);
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int d(int i, String str) {
        return i == 0 ? d(str) : i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static qgx c(int i, long j) {
        qgx qgxVar = new qgx();
        qgxVar.a(i);
        qgxVar.c(j);
        return qgxVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(final qgx qgxVar, String str, final ResponseCallback<qgx> responseCallback) {
        ReleaseLogUtil.d("SCUI_ActiveGoalUtil", npt.d("saveSampleConfig enter key ", str, " goal ", qgxVar.toString()));
        qhq.d("9002", str, HiJsonUtil.d(qgxVar), new HiDataOperateListener() { // from class: qgm.8
            @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
            public void onResult(int i, Object obj) {
                LogUtil.a("SCUI_ActiveGoalUtil", "saveSampleConfig errorCode: ", Integer.valueOf(i), ", object: ", obj);
                ResponseCallback responseCallback2 = responseCallback;
                if (responseCallback2 != null) {
                    responseCallback2.onResponse(i, qgxVar);
                }
            }
        }, qgxVar.e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void i() {
        HiSyncOption hiSyncOption = new HiSyncOption();
        hiSyncOption.setSyncModel(2);
        hiSyncOption.setSyncAction(0);
        hiSyncOption.setSyncDataType(900000000);
        hiSyncOption.setSyncMethod(2);
        HiHealthNativeApi.a(BaseApplication.getContext()).synCloud(hiSyncOption, null);
    }

    private static String[] c() {
        ArrayList arrayList = new ArrayList();
        for (int i = 50; i <= 5000; i += 10) {
            arrayList.add(String.valueOf(i));
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static String[] e(int i) {
        if (i == 0) {
            return c();
        }
        if (i == 1) {
            return f46190c;
        }
        if (i == 2) {
            return d;
        }
        LogUtil.a("SCUI_ActiveGoalUtil", "getPickArray ERROR.");
        return new String[0];
    }

    public static int d(int i) {
        if (i == 0) {
            return 270;
        }
        if (i == 1) {
            return 25;
        }
        if (i == 2) {
            return 12;
        }
        LogUtil.j("SCUI_ActiveGoalUtil", "getPickArray ERROR. type = ", Integer.valueOf(i));
        return 0;
    }

    public static int e(int i, String[] strArr) {
        int i2 = 0;
        for (int i3 = 0; i3 < strArr.length - 1; i3++) {
            if (i > CommonUtil.n(com.huawei.haf.application.BaseApplication.b(), strArr[i3])) {
                int i4 = i3 + 1;
                if (i <= CommonUtil.n(com.huawei.haf.application.BaseApplication.b(), strArr[i4])) {
                    i2 = i4;
                    break;
                }
            }
        }
        LogUtil.a("SCUI_ActiveGoalUtil", "getDefaultPosition position is ", Integer.valueOf(i2));
        return i2;
    }
}
