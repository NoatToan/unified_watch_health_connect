package defpackage;

import android.text.TextUtils;
import com.google.android.gms.wearable.PutDataRequest;
import com.huawei.basefitnessadvice.model.intplan.IntPlan;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hiai.awareness.AwarenessConstants;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hms.network.embedded.x2;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseConstants;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.ParamConstants;
import com.huawei.operation.ble.BleConstants;
import com.huawei.pluginhealthzone.interactors.HealthZonePushReceiver;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.Utils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class idy {
    public static void c(String str) {
        HashMap map = new HashMap();
        map.put("click", "1");
        lmf.d().c(btx.c(), str, map, 0);
        lmf.d().b(btx.c());
    }

    public static void a(String str, String str2) {
        HashMap map = new HashMap();
        map.put("click", "1");
        map.put("from", str2);
        b(str, map);
    }

    public static void c(String str, int i, String str2) {
        HashMap map = new HashMap();
        map.put("click", "1");
        map.put("type", Integer.valueOf(i));
        map.put("content", str2);
        b(str, map);
    }

    public static void c(String str, int i) {
        HashMap map = new HashMap();
        map.put("click", "1");
        map.put("entrance", str);
        map.put("position", Integer.valueOf(i));
        b("1130015", map);
    }

    public static void e(String str, String str2) {
        lmn lmnVar = (lmn) peh.b(str2, lmn.class);
        if (lmnVar == null) {
            LogUtil.j("Suggestion_BiUtil", "info is null");
        } else {
            lmf.d().a(BaseApplication.getContext(), str, lmnVar, 0);
        }
    }

    public static void b(String str, Map map) {
        String str2;
        if (!(map.get(x2.AB_INFO) instanceof String)) {
            str2 = "";
        } else {
            str2 = (String) map.get(x2.AB_INFO);
        }
        String str3 = str2;
        if (TextUtils.isEmpty(str3)) {
            lmf.d().c(btx.c(), str, map, 0);
        } else {
            lmf.d().e(btx.c(), str, (Map<String, Object>) map, str3, 0);
        }
        lmf.d().b(btx.c());
    }

    public static void a(String str) {
        HashMap map = new HashMap();
        if (str != null) {
            map.put("planName", str);
        }
        b("1120013", map);
    }

    public static void c(String str, int i, String str2, String str3) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("plan_name", str);
            jSONObject.put("plan_type", i);
            if (!TextUtils.isEmpty(str3)) {
                jSONObject.put(HwExerciseConstants.JSON_NAME_PLAN_ID, str3);
            }
            if (d()) {
                jSONObject.put("end_time", System.currentTimeMillis());
                if (str2 != null) {
                    jSONObject.put("finishRate", e(str2));
                }
            }
            HashMap map = new HashMap();
            map.put("data", jSONObject.toString());
            b("1120004", map);
        } catch (JSONException e) {
            LogUtil.e("Suggestion_BiUtil", "JSONException = ", e.getMessage());
        }
    }

    public static void d(float f, String str, int i, int i2) {
        HashMap map = new HashMap(3);
        map.put("finishRate", Float.valueOf(f));
        map.put("plan_name", str);
        map.put("click", 1);
        map.put("type", Integer.valueOf(i));
        map.put(ParamConstants.Param.END_MODE, Integer.valueOf(i2));
        map.put("moduleName", "termination_plan");
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.INT_PLAN_1120044.value(), map, 0);
    }

    public static void e(int i, int i2, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            if (d()) {
                jSONObject.put("create_time", System.currentTimeMillis());
                jSONObject.put("movementTimes", i2);
            }
            jSONObject.put("difficulty", i);
            jSONObject.put("excludedDate", ifp.g(str));
            HashMap map = new HashMap();
            map.put("data", jSONObject.toString());
            b("1130002", map);
        } catch (JSONException unused) {
            LogUtil.e("Suggestion_BiUtil", "JSONException");
        }
    }

    public static void d(int i, int i2, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            if (d()) {
                jSONObject.put("create_time", System.currentTimeMillis());
                jSONObject.put("movementTimes", i2);
            }
            jSONObject.put("difficulty", i);
            jSONObject.put("excludedDate", ifp.g(str));
            HashMap map = new HashMap();
            map.put("data", jSONObject.toString());
            b("1130003", map);
        } catch (JSONException unused) {
            LogUtil.e("Suggestion_BiUtil", "JSONException");
        }
    }

    public static String c(float f) {
        if (f < 0.1f) {
            return "0";
        }
        if (f < 10.0f) {
            return "5";
        }
        if (f < 20.0f) {
            return "15";
        }
        if (f < 30.0f) {
            return "25";
        }
        if (f < 40.0f) {
            return HealthZonePushReceiver.BODY_TEMPERATURE_LOW_NOTIFY;
        }
        if (f < 50.0f) {
            return "45";
        }
        if (f < 60.0f) {
            return "55";
        }
        if (f < 70.0f) {
            return "65";
        }
        if (f < 80.0f) {
            return "75";
        }
        if (f < 90.0f) {
            return "85";
        }
        return "95";
    }

    private static String e(String str) {
        try {
            return c(Float.parseFloat(str));
        } catch (NumberFormatException unused) {
            LogUtil.e("Suggestion_BiUtil", "NumberFormatException");
            return "0";
        }
    }

    public static boolean d() {
        return !Utils.o();
    }

    public static int d(String str) {
        if ("RUNNING_COURSE".equals(str)) {
            return AwarenessConstants.ERROR_NO_PERMISSION_CODE;
        }
        return "FITNESS_COURSE".equals(str) ? AwarenessConstants.ERROR_INVALID_FREQUENCY_CODE : AwarenessConstants.REGISTER_SUCCESS_CODE;
    }

    public static int b(String str) {
        if ("RUNNING_COURSE".equals(str)) {
            return 2;
        }
        return "FITNESS_COURSE".equals(str) ? 1 : 3;
    }

    public static void b(int i, String str, int i2, int i3) {
        final HashMap map = new HashMap(10);
        map.put("click", 1);
        map.put("planStatus", Integer.valueOf(i));
        map.put("planName", str);
        map.put("finishRate", Integer.valueOf(i3));
        map.put("event", Integer.valueOf(i2));
        ThreadPoolManager.c().execute(new Runnable() { // from class: iea
            @Override // java.lang.Runnable
            public final void run() {
                idy.b("2120150", map);
            }
        });
    }

    public static void a(int i, final Map<String, Object> map) {
        map.put("click", 1);
        map.put("event", Integer.valueOf(i));
        ThreadPoolManager.c().execute(new Runnable() { // from class: idz
            @Override // java.lang.Runnable
            public final void run() {
                idy.b("2120151", map);
            }
        });
    }

    public static void a(final int i) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: idx
            @Override // java.lang.Runnable
            public final void run() {
                idy.d(i);
            }
        });
    }

    static /* synthetic */ void d(int i) {
        HashMap map = new HashMap(1);
        map.put("click", 1);
        map.put("enter", Integer.valueOf(i));
        b(AnalyticsValue.INT_PLAN_2040150.value(), map);
    }

    public static void b(final int i, final int i2, final List<Integer> list, final boolean z) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: idw
            @Override // java.lang.Runnable
            public final void run() {
                idy.c(i, i2, list, z);
            }
        });
    }

    static /* synthetic */ void c(int i, int i2, List list, boolean z) {
        HashMap map = new HashMap(3);
        map.put("goalNum", Integer.valueOf(i));
        map.put("finishNum", Integer.valueOf(i2));
        map.put(BleConstants.SPORT_TYPE, list);
        map.put("hasAICourse", String.valueOf(z));
        b(AnalyticsValue.INT_PLAN_1120038.value(), map);
    }

    public static void c(final int i, final boolean z, final Map<String, Object> map) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: ief
            @Override // java.lang.Runnable
            public final void run() {
                idy.a(map, i, z);
            }
        });
    }

    static /* synthetic */ void a(Map map, int i, boolean z) {
        HashMap map2;
        if (map == null || map.size() == 0) {
            map2 = new HashMap(3);
        } else {
            map2 = new HashMap(map);
        }
        map2.put("click", 1);
        map2.put("event", Integer.valueOf(i));
        if (z) {
            map2.put("ControlMode", PutDataRequest.WEAR_URI_SCHEME);
        } else {
            map2.put("ControlMode", "app");
        }
        b("1130067", map2);
    }

    public static int a() {
        return SharedPreferenceManager.c("Suggestion_BiUtil", AnalyticsValue.INT_PLAN_1120039.value(), 0);
    }

    public static void b(int i) {
        SharedPreferenceManager.d("Suggestion_BiUtil", AnalyticsValue.INT_PLAN_1120039.value(), i);
    }

    public static void d(IntPlan intPlan, boolean z) {
        LogUtil.a("Suggestion_BiUtil", "doPlanScheduleBi:", Integer.valueOf(a()), " user visible:", Boolean.valueOf(z));
        if (intPlan == null || intPlan.getMetaInfo() == null || a() == 0 || !z) {
            return;
        }
        HashMap map = new HashMap(6);
        map.put("meetGoal", 1);
        map.put("type", Integer.valueOf(intPlan.getPlanType().getType()));
        map.put("plan_name", intPlan.getMetaInfo().getName());
        if (intPlan.getStat("progress") != null) {
            map.put("finishRate", intPlan.getStat("progress").getValue());
        }
        map.put("dayProgress", Integer.valueOf((int) (((ift.a(System.currentTimeMillis()) / 86400000) - ((intPlan.getPlanTimeInfo().getBeginDate() * 1000) / 86400000)) + 1)));
        map.put("completeMode", Integer.valueOf(a()));
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.INT_PLAN_1120039.value(), map, 0);
        b(0);
    }

    public static void b(qey qeyVar, String str) {
        if (!btw.d(qeyVar)) {
            LogUtil.j("Suggestion_BiUtil", "doTrainPlanClockBi isSmartTrainPlan false");
            return;
        }
        if (!BaseApplication.isRunningForeground()) {
            LogUtil.j("Suggestion_BiUtil", "doTrainPlanClockBi isRunningForeground false");
            return;
        }
        if (!a(qeyVar, str)) {
            LogUtil.j("Suggestion_BiUtil", "doTrainPlanClockBi isWorkoutIdExit is false");
            return;
        }
        HashMap map = new HashMap(16);
        map.put("event", 1);
        map.put("type", 2);
        map.put("planName", qeyVar.g());
        map.put("planId", qeyVar.h());
        gng gngVarB = ((gnm) HiJsonUtil.d(qeyVar.a(), gnm.class)).b();
        map.put("finishRate", Float.valueOf((gngVarB == null || gngVarB.a() == 0) ? 0.0f : (gngVarB.d() * 100.0f) / gngVarB.a()));
        map.put("dayProgress", Integer.valueOf(lsl.a(DateFormatUtil.d(qeyVar.i()), System.currentTimeMillis())));
        lmn lmnVar = new lmn();
        lmnVar.e(map);
        HashMap map2 = new HashMap(1);
        map2.put("pageId", "");
        lmnVar.d(map2);
        lmf.d().a(BaseApplication.getContext(), AnalyticsValue.INT_PLAN_1120039.value(), lmnVar, 0);
    }

    private static boolean a(qey qeyVar, String str) {
        if (qeyVar == null) {
            LogUtil.j("Suggestion_BiUtil", "isWorkoutIdExit planDetail is null");
            return false;
        }
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("Suggestion_BiUtil", "isWorkoutIdExit workoutId is empty");
            return false;
        }
        for (qfy qfyVar : njy.e(qeyVar.n()) ? new ArrayList<>() : qeyVar.n()) {
            if (!njy.e(qfyVar.n())) {
                Iterator<qfk> it = qfyVar.n().iterator();
                while (it.hasNext()) {
                    List<qfg> listN = it.next().n();
                    if (!njy.e(listN) && listN.get(0) != null) {
                        pce pceVar = (pce) HiJsonUtil.d(listN.get(0).d(), pce.class);
                        pce.d dVarD = pceVar != null ? pceVar.d() : null;
                        if (dVarD != null && Objects.equals(dVarD.g(), str)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}
