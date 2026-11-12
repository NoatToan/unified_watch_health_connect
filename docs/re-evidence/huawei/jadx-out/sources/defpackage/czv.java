package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.huawei.basefitnessadvice.model.intplan.IntPlan;
import com.huawei.featureuserprofile.todo.datatype.TodoSwitchSync;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.router.AppRouter;
import com.huawei.health.fitnessadvice.api.FitnessAdviceApi;
import com.huawei.health.healthmodel.bean.HealthLifeTaskBean;
import com.huawei.hihealth.HiSyncOption;
import com.huawei.hihealth.HiUserPreference;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;
import com.huawei.ui.commonui.utils.versioncontrol.VersionControlUtil;
import health.compact.a.CommonUtil;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.Utils;
import health.compact.a.util.LogUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class czv {
    public static int b(boolean z) {
        return z ? 1 : 2;
    }

    public static List<String> e() {
        return Arrays.asList("t000", "t100", "t102", "t103", "t105", "t106", "t107", "t108", "t109", "t110", "t111", "t112", "t113", "t114", "t201", "t401", "t301");
    }

    public static String b(int i) {
        switch (i) {
            case 2:
                return "t102";
            case 3:
                return "t103";
            case 4:
            default:
                return "";
            case 5:
                return "t105";
            case 6:
                return "t106";
            case 7:
                return "t107";
            case 8:
                return "t108";
            case 9:
                return "t109";
            case 10:
                return "t110";
            case 11:
                return "t111";
            case 12:
                return "t112";
            case 13:
                return "t113";
            case 14:
                return "t114";
        }
    }

    public static TodoSwitchSync e(Context context) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            LogUtil.a("td_switchs", "getTodoSwitchs can't running in MainLooper");
        }
        List<HiUserPreference> userPreferenceList = HiHealthNativeApi.a(context).getUserPreferenceList(Collections.singletonList("td_switchs"));
        TodoSwitchSync todoSwitchSync = null;
        if (njy.e(userPreferenceList)) {
            SharedPreferenceManager.e(context, String.valueOf(10006), "td_switchs", "", null);
            return null;
        }
        boolean z = false;
        HiUserPreference hiUserPreference = userPreferenceList.get(0);
        if (hiUserPreference == null || TextUtils.isEmpty(hiUserPreference.getValue())) {
            SharedPreferenceManager.e(context, String.valueOf(10006), "td_switchs", "", null);
            return null;
        }
        try {
            todoSwitchSync = (TodoSwitchSync) new Gson().fromJson(hiUserPreference.getValue(), TodoSwitchSync.class);
        } catch (JsonIOException | JsonSyntaxException unused) {
            LogUtil.a("td_switchs", "JsonSyntaxException or JsonIOException");
        }
        if (todoSwitchSync != null && e(context, todoSwitchSync)) {
            int iIndexOf = todoSwitchSync.getKeys().indexOf("t000");
            if (iIndexOf >= 0 && d("t000", todoSwitchSync.getValues().get(iIndexOf))) {
                z = true;
            }
            b(context, z);
        }
        return todoSwitchSync;
    }

    public static boolean b(Context context, Map<String, Integer> map) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            LogUtil.a("td_switchs", "uploadTodoSwitchs can't running in MainLooper");
        }
        if (map != null && !map.isEmpty()) {
            TodoSwitchSync todoSwitchSyncE = e(map);
            try {
                String json = new Gson().toJson(todoSwitchSyncE);
                LogUtil.a("td_switchs", json);
                boolean userPreference = HiHealthNativeApi.a(context).setUserPreference(new HiUserPreference("td_switchs", json));
                if (userPreference) {
                    if (e(context, todoSwitchSyncE)) {
                        int iIndexOf = todoSwitchSyncE.getKeys().indexOf("t000");
                        b(context, iIndexOf >= 0 && d("t000", todoSwitchSyncE.getValues().get(iIndexOf)));
                    }
                    HiSyncOption hiSyncOption = new HiSyncOption();
                    hiSyncOption.setSyncModel(2);
                    hiSyncOption.setSyncAction(0);
                    hiSyncOption.setSyncDataType(10026);
                    hiSyncOption.setSyncMethod(2);
                    HiHealthNativeApi.a(BaseApplication.b()).synCloud(hiSyncOption, null);
                }
                return userPreference;
            } catch (JsonIOException unused) {
                LogUtil.a("td_switchs", "uploadTodoSwitchs JsonIOException");
            }
        }
        return false;
    }

    public static TodoSwitchSync d(Context context) {
        String strE = SharedPreferenceManager.e(context, String.valueOf(10006), "td_switchs");
        if (TextUtils.isEmpty(strE)) {
            return null;
        }
        try {
            return (TodoSwitchSync) new Gson().fromJson(strE, TodoSwitchSync.class);
        } catch (JsonIOException | JsonSyntaxException unused) {
            LogUtil.a("td_switchs", "getLocalSp JsonIOException or JsonSyntaxException");
            return null;
        }
    }

    public static boolean e(Context context, TodoSwitchSync todoSwitchSync) {
        String json;
        if (todoSwitchSync == null || njy.e(todoSwitchSync.getKeys()) || njy.e(todoSwitchSync.getValues())) {
            return false;
        }
        try {
            json = new Gson().toJson(todoSwitchSync);
        } catch (JsonIOException unused) {
            LogUtil.a("td_switchs", "saveLocalSpSwitchs JsonIOException");
            json = null;
        }
        return !TextUtils.isEmpty(json) && SharedPreferenceManager.e(context, String.valueOf(10006), "td_switchs", json, null) == 0;
    }

    public static Map<String, Integer> b(TodoSwitchSync todoSwitchSync, Map<String, Integer> map) {
        if (map == null) {
            map = new HashMap<>();
        }
        if (todoSwitchSync != null && !njy.e(todoSwitchSync.getKeys()) && !njy.e(todoSwitchSync.getValues())) {
            List<String> keys = todoSwitchSync.getKeys();
            List<Integer> values = todoSwitchSync.getValues();
            int size = keys.size();
            for (int i = 0; i < size; i++) {
                map.put(keys.get(i), Integer.valueOf(njy.e(values, i) ? 0 : values.get(i).intValue()));
            }
        }
        return map;
    }

    public static TodoSwitchSync e(Map<String, Integer> map) {
        List<String> listE = e();
        ArrayList arrayList = new ArrayList(listE.size());
        for (String str : listE) {
            arrayList.add(Integer.valueOf(a(str, map.get(str))));
        }
        TodoSwitchSync todoSwitchSync = new TodoSwitchSync();
        todoSwitchSync.setKeys(listE);
        todoSwitchSync.setValues(arrayList);
        return todoSwitchSync;
    }

    public static boolean b(Context context) {
        String strE = SharedPreferenceManager.e(context, String.valueOf(10006), "t000");
        return TextUtils.isEmpty(strE) || "true".equalsIgnoreCase(strE);
    }

    public static void b(Context context, boolean z) {
        SharedPreferenceManager.e(context, String.valueOf(10006), "t000", String.valueOf(z), null);
    }

    public static boolean d(String str, Integer num) {
        return num == null || num.intValue() != 2;
    }

    public static boolean a(Integer num) {
        return num == null || num.intValue() != 2;
    }

    private static int a(String str, Integer num) {
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public static boolean c(Context context) {
        return !ffv.t() && !CommonUtil.ca() && Utils.h() && LoginInit.getInstance(context).getIsLogined() && VersionControlUtil.isSupportOperationAccount();
    }

    public static void c(Context context, AnalyticsValue analyticsValue, String str, int i, int i2) {
        HashMap map = new HashMap(3);
        int i3 = AnonymousClass2.d[analyticsValue.ordinal()];
        if (i3 == 1) {
            map.put(ParsedFieldTag.TASK_NAME, str);
            map.put(ParsedFieldTag.TASK_TYPE, Integer.valueOf(i2));
        } else if (i3 == 2) {
            map.put("taskNumber", Integer.valueOf(i));
        } else if (i3 == 3) {
            map.put("from", Integer.valueOf(i2));
        } else if (i3 == 4) {
            map.put("taskNumber", Integer.valueOf(i));
        } else {
            if (i3 != 5) {
                return;
            }
            map.put(ParsedFieldTag.TASK_NAME, str);
            map.put("taskNumber", Integer.valueOf(i));
        }
        map.put("click", 1);
        lmf.d().c(context, analyticsValue.value(), map, 0);
    }

    /* JADX INFO: renamed from: czv$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] d;

        static {
            int[] iArr = new int[AnalyticsValue.values().length];
            d = iArr;
            try {
                iArr[AnalyticsValue.HEALTH_LIFE_TODO_TASK_CLICK_2040172.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                d[AnalyticsValue.HEALTH_LIFE_TODO_TASK_CLICK_2040173.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                d[AnalyticsValue.HEALTH_LIFE_TODO_SETTINGS_ENTER_2040174.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                d[AnalyticsValue.HEALTH_LIFE_TODO_ICON_EXPOSE_2040177.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                d[AnalyticsValue.HEALTH_LIFE_TODO_LIST_EXPOSE_2040178.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static void e(Context context, String str, String str2, boolean z) {
        int i = z ? 2 : 1;
        HashMap map = new HashMap(3);
        map.put("click", 1);
        map.put("switchName", str);
        map.put("switchType", str2);
        map.put("switchStatus", Integer.valueOf(i));
        lmf.d().c(context, AnalyticsValue.HEALTH_LIFE_TODO_SETTINGS_SWITCH_2040175.value(), map, 0);
    }

    public static void a(Context context, String str, int i) {
        HashMap map = new HashMap(3);
        map.put("click", 1);
        map.put("changeNumber", Integer.valueOf(i));
        map.put("switchType", str);
        lmf.d().c(context, AnalyticsValue.HEALTH_LIFE_TODO_SETTINGS_EXIT_2040176.value(), map, 0);
    }

    public static void b(List<ikw> list, TodoSwitchSync todoSwitchSync, boolean z) {
        if (njy.e(list)) {
            return;
        }
        Map<String, Integer> mapB = b(todoSwitchSync, (Map<String, Integer>) null);
        Iterator<ikw> it = list.iterator();
        while (it.hasNext()) {
            if (!a(it.next(), mapB, z)) {
                it.remove();
            }
        }
    }

    public static boolean a(ikw ikwVar, Map<String, Integer> map, boolean z) {
        if (ikwVar == null) {
            return false;
        }
        if (z && ikwVar.j() == 1) {
            LogUtil.a("TodoSettingUtils", "isTodoTaskNeedShow task is finished, title = ", ikwVar.o());
            return false;
        }
        int iL = ikwVar.l();
        if ((iL == 1536 || iL == 512) && d("t201", map.get("t201"))) {
            return true;
        }
        if (iL == 1792 && d("t301", map.get("t301"))) {
            return true;
        }
        if (iL == 768 && d("t401", map.get("t401"))) {
            return true;
        }
        HealthLifeTaskBean healthLifeTaskBean = ikwVar.n() instanceof HealthLifeTaskBean ? (HealthLifeTaskBean) ikwVar.n() : null;
        if (iL != 256 || !d("t100", map.get("t100")) || healthLifeTaskBean == null) {
            return false;
        }
        String strB = b(healthLifeTaskBean.getId());
        return d(strB, map.get(strB));
    }

    public static String a(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject(str2);
            if (jSONObject.has(str)) {
                return jSONObject.getString(str);
            }
            return "";
        } catch (JSONException unused) {
            LogUtil.c("TodoSettingUtils", "parseJsonKey Exception");
            return "";
        }
    }

    public static void a(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.d("TodoSettingUtils", "startDeepLink url is null");
        } else {
            LogUtil.a("TodoSettingUtils", "startDeepLink with deepLink");
            AppRouter.e(Uri.parse(str)).b(BaseApplication.b());
        }
    }

    public static void a(ikw ikwVar) {
        int[] iArr;
        int iN = CommonUtil.n(com.huawei.hwcommonmodel.application.BaseApplication.getContext(), a("planType", ikwVar.k()));
        if (iN == IntPlan.PlanType.AI_FITNESS_PLAN.getType()) {
            iArr = new int[]{5, 1, 1};
        } else {
            if (iN == IntPlan.PlanType.AI_RUN_PLAN.getType()) {
                idy.c(AnalyticsValue.HEALTH_HOME_CARE_CARD_DATA_2010088.value());
            } else if (iN == IntPlan.PlanType.FIT_PLAN.getType()) {
                idy.c(AnalyticsValue.HEALTH_HOME_CARE_CARD_DATA_2010087.value());
            } else {
                LogUtil.d("TodoSettingUtils", "jumpToShowPlan, error planType == ", Integer.valueOf(iN));
            }
            iArr = null;
        }
        FitnessAdviceApi fitnessAdviceApi = (FitnessAdviceApi) Services.d("PluginFitnessAdvice", FitnessAdviceApi.class);
        if (fitnessAdviceApi == null) {
            LogUtil.d("TodoSettingUtils", "jumpToShowPlan, fitnessAdviceApi is null");
            return;
        }
        if (ikwVar.n() instanceof IntPlan) {
            if (iArr != null) {
                btw.e((IntPlan) ikwVar.n(), "1", iArr);
            } else {
                btw.e((IntPlan) ikwVar.n(), "1", new int[0]);
            }
        }
        fitnessAdviceApi.launchPlanTab();
    }

    public static void c(String str, dlp dlpVar) {
        HashMap map = new HashMap(3);
        map.put("click", 1);
        map.put("activityName", dlpVar.c());
        map.put("activityId", dlpVar.d());
        lmf.d().c(BaseApplication.b(), str, map, 0);
    }

    public static String b(String str) {
        Map<String, Integer> mapB = b(e(BaseApplication.b()), (Map<String, Integer>) null);
        if (!mapB.containsKey(str)) {
            LogUtil.a("TodoSettingUtils", "getTodoSwitchStatus switchType error");
            return "";
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("t000", a(mapB.get("t000")));
            if (!"t000".equals(str)) {
                jSONObject.put(str, a(mapB.get(str)));
            }
        } catch (JSONException e) {
            LogUtil.c("TodoSettingUtils", ExceptionUtils.c(e));
        }
        LogUtil.a("TodoSettingUtils", "getTodoSwitchStatus switch status = ", jSONObject.toString());
        return jSONObject.toString();
    }

    public static boolean c(String str, boolean z, int i) {
        Map<String, Integer> mapB = b(e(BaseApplication.b()), (Map<String, Integer>) null);
        if (!mapB.containsKey(str)) {
            LogUtil.d("TodoSettingUtils", "changeTodoSubSwitch switchType error");
            return false;
        }
        boolean zA = a(mapB.get("t000"));
        boolean zA2 = a(mapB.get(str));
        LogUtil.a("TodoSettingUtils", "openTodoSubSwitch switchType=", str, " isSubSwitchOn=", Boolean.valueOf(zA2), " isMainSwitchOn=", Boolean.valueOf(zA));
        if (z != zA2) {
            mapB.put(str, Integer.valueOf(z ? 1 : 2));
        }
        if (!"t000".equals(str) && !zA && z) {
            mapB.put("t000", 1);
        }
        boolean zB = b(BaseApplication.b(), mapB);
        if (zB && z) {
            HashMap map = new HashMap(3);
            map.put("click", 1);
            map.put("from", Integer.valueOf(i));
            lmf.d().c(BaseApplication.b(), AnalyticsValue.HEALTH_PAGE_TODO_2040226.value(), map, 0);
        }
        return zB;
    }
}
