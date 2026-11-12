package defpackage;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.hianalytics.v2.HiAnalytics;
import com.huawei.hms.network.embedded.x2;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.openalliance.ad.constant.TagConstants;
import com.huawei.operation.OpAnalyticsConstants;
import health.compact.a.CommonUtil;
import health.compact.a.EnvironmentUtils;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.Utils;
import health.compact.a.utils.StringUtils;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class lmh {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f40444b = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static JSONObject f40443a = new JSONObject();
    private static HashSet<lmg> d = new HashSet<>();

    protected static void e() {
        if (EnvironmentUtils.d() && !BaseApplication.isRunningForeground()) {
            ReleaseLogUtil.d("R_BIAnalyticsImpl", "call onReport in background");
        } else {
            HiAnalytics.onReport();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void a(String str, LinkedHashMap<String, String> linkedHashMap) {
        lmp.e("BIAnalyticsImpl", "onReport() viewName");
        HiAnalytics.onResume(str, linkedHashMap);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void d(Context context) {
        lmp.e("BIAnalyticsImpl", "onResume() context = " + context);
        HiAnalytics.onResume(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void c(String str, LinkedHashMap<String, String> linkedHashMap) {
        lmp.e("BIAnalyticsImpl", "onPause() viewName");
        HiAnalytics.onPause(str, linkedHashMap);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void b(Context context) {
        lmp.e("BIAnalyticsImpl", "onPause() context = " + context);
        HiAnalytics.onPause(context);
    }

    protected static int d(Context context, String str, Map<String, Object> map, String str2) {
        try {
            JSONObject jSONObject = new JSONObject(f40443a.toString());
            jSONObject.put("MANUFACTURER", Build.MANUFACTURER);
            if (map == null) {
                jSONObject.put("CONTENT", "[]");
            } else {
                jSONObject.put("CONTENT", "[" + new JSONObject(map).toString() + "]");
            }
            jSONObject.put(x2.AB_INFO, str2);
            lmp.e("BIAnalyticsImpl", str + jSONObject.toString());
            HiAnalytics.onEvent(context, str, jSONObject.toString());
            return 0;
        } catch (Exception unused) {
            lmp.a("BIAnalyticsImpl", "setEvent Exception！");
            return -1;
        }
    }

    protected static int b(Context context, String str, lmn lmnVar, String str2) {
        try {
            JSONObject jSONObject = new JSONObject(f40443a.toString());
            jSONObject.put("MANUFACTURER", Build.MANUFACTURER);
            d(lmnVar.c(), jSONObject, "CONTENT");
            d(lmnVar.b(), jSONObject, TagConstants.SCENE_TYPE);
            d(lmnVar.a(), jSONObject, "from");
            if (!CollectionUtils.a(lmnVar.e())) {
                jSONObject.put("pageProperties", peh.c(lmnVar.e()));
            } else {
                jSONObject.put("pageProperties", "[]");
            }
            if (StringUtils.g(str2)) {
                c(context, lmnVar);
            } else {
                jSONObject.put(x2.AB_INFO, str2);
            }
            lmp.e("BIAnalyticsImpl", str + jSONObject.toString());
            HiAnalytics.onEvent(context, str, jSONObject.toString());
            return 0;
        } catch (Exception unused) {
            lmp.a("BIAnalyticsImpl", "setEvent Exception！");
            return -1;
        }
    }

    private static void d(Map<String, Object> map, JSONObject jSONObject, String str) throws JSONException {
        if (CollectionUtils.c(map)) {
            jSONObject.put(str, "[]");
            return;
        }
        jSONObject.put(str, "[" + new JSONObject(map).toString() + "]");
    }

    private static void c(Context context, lmn lmnVar) {
        if (CollectionUtils.c(lmnVar.c()) && CollectionUtils.c(lmnVar.b()) && CollectionUtils.c(lmnVar.a()) && CollectionUtils.a(lmnVar.e())) {
            return;
        }
        e(context);
    }

    protected static int b(Context context, String str, Map<String, Object> map) {
        try {
            JSONObject jSONObject = new JSONObject(f40443a.toString());
            jSONObject.put("MANUFACTURER", Build.MANUFACTURER);
            if (map == null) {
                jSONObject.put("CONTENT", "[]");
            } else {
                jSONObject.put("CONTENT", "[" + new JSONObject(map).toString() + "]");
                e(context);
            }
            lmp.e("BIAnalyticsImpl", str + jSONObject.toString());
            HiAnalytics.onEvent(context, str, jSONObject.toString());
            return 0;
        } catch (Exception unused) {
            lmp.a("BIAnalyticsImpl", "setEvent Exception！");
            return -1;
        }
    }

    protected static int a(Context context, String str, lmn lmnVar) {
        return b(context, str, lmnVar, null);
    }

    protected static void e(Context context) {
        try {
            String strE = SharedPreferenceManager.e(context, String.valueOf(10000), "AB_TEST_BI_INFO");
            if (!TextUtils.isEmpty(strE)) {
                a(x2.AB_INFO, strE);
            }
            a("NEW_USER", SharedPreferenceManager.e(context, String.valueOf(10000), "NEW_USER"));
        } catch (JSONException unused) {
            lmp.a("BIAnalyticsImpl", "setABTestInfo Exception");
        }
    }

    private static String d() {
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10000), "SP_KEY_CUR_DISPLAY");
        if (TextUtils.isEmpty(strE)) {
            LogUtil.e("BIAnalyticsImpl", "json is null");
            return "STEPCARD";
        }
        if ("threeLeafCard".equals(strE) && SharedPreferenceManager.b(String.valueOf(10000), "SP_IS_HEALTH_LIFE_BI", false)) {
            return "FOURLEAFCARD";
        }
        return strE.toUpperCase(Locale.ROOT);
    }

    private static void a(String str, String str2) throws JSONException {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        f40443a.put(str, str2);
    }

    protected static void c(String str) {
        if (TextUtils.isEmpty(str)) {
            str = LoginInit.getInstance(null).getHuidOrDefault();
        }
        try {
            f40443a.put(OpAnalyticsConstants.OPERATION_ID, str);
            b("DT");
            b("DID");
            b("DV");
            e("MAIN_VIP", "MAIN_VIP_KEY");
            e("SHARED_VIP", "SHARED_VIP_KEY");
            f40443a.put("HEALTH_MODEL", d());
            lmp.e("BIAnalyticsImpl", "setUserInfo() userInfo = " + str);
        } catch (JSONException unused) {
            lmp.a("BIAnalyticsImpl", "setEvent Exception");
        }
    }

    protected static void d(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            if (!Utils.o()) {
                if (f40443a.has("CC")) {
                    f40443a.remove("CC");
                }
            } else {
                f40443a.put("CC", str);
                lmp.e("BIAnalyticsImpl", "setCountryCode() countryCode = " + str);
            }
        } catch (JSONException unused) {
            lmp.a("BIAnalyticsImpl", "setCountryCode Exception");
        }
    }

    protected static void d(String str, String str2) {
        try {
            c("MAIN_VIP", str);
            c("SHARED_VIP", str2);
            lmp.e("BIAnalyticsImpl", "setVipInfo() MAIN_VIP = " + str + " SHARED_VIP = " + str2);
        } catch (Exception unused) {
            lmp.a("BIAnalyticsImpl", "setVipInfo Exception");
        }
    }

    protected static void c(String str, String str2) {
        try {
            f40443a.put(str, str2);
            lmp.e("BIAnalyticsImpl", "setSingleVipInfo() vipKey = " + str + " vipValue = " + str2);
        } catch (Exception unused) {
            lmp.a("BIAnalyticsImpl", "setSingleVipInfo Exception");
        }
    }

    private static void e(String str, String str2) throws JSONException {
        Context contextB = com.huawei.haf.application.BaseApplication.b();
        if (f40443a.has(str)) {
            return;
        }
        f40443a.put(str, "");
        c(str, SharedPreferenceManager.e(contextB, Integer.toString(10000), str2));
    }

    private static void b(String str) throws JSONException {
        if (f40443a.has(str)) {
            return;
        }
        f40443a.put(str, "");
    }

    protected static void a(lmg lmgVar) {
        try {
            f40443a.put("DT", lmgVar.a());
            f40443a.put("DID", lmgVar.e());
            f40443a.put("DV", lmgVar.b());
            if (CommonUtil.q(BaseApplication.getContext())) {
                String strD = lmgVar.d();
                LogUtil.a("BIAnalyticsImpl", "setDeviceInfo deviceLogMark:", strD);
                f40443a.put("WEAR_DID", strD);
            }
            lmp.e("BIAnalyticsImpl", "setDeviceInfo() DT = " + lmgVar.a() + " DID = " + lmgVar.e() + " DV = " + lmgVar.b());
        } catch (Exception unused) {
            lmp.a("BIAnalyticsImpl", "setEvent Exception");
        }
    }

    public static void d(lmg... lmgVarArr) {
        if (lmgVarArr.length <= 0) {
            return;
        }
        a(lmgVarArr[0]);
        synchronized (f40444b) {
            d.addAll(Arrays.asList(lmgVarArr));
        }
        i();
    }

    private static void i() {
        try {
            f40443a.put("DEVICE_INFOS", c());
        } catch (JSONException unused) {
            lmp.a("BIAnalyticsImpl", "setDeviceInfoToMessage Exception");
        }
    }

    private static void a() {
        try {
            if (f40443a.has("DEVICE_INFOS")) {
                lmp.b("BIAnalyticsImpl", "removeDeviceInfoFromMessage");
                f40443a.remove("DEVICE_INFOS");
            }
            f40443a.put("DEVICE_INFOS", c());
        } catch (JSONException unused) {
            lmp.a("BIAnalyticsImpl", "removeDeviceInfoFromMessage Exception");
        }
    }

    private static String c() {
        synchronized (f40444b) {
            if (d.isEmpty()) {
                return "";
            }
            JSONArray jSONArray = new JSONArray();
            for (lmg lmgVar : d) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("DT", lmgVar.a());
                    jSONObject.put("DID", lmgVar.e());
                    jSONObject.put("DV", lmgVar.b());
                    if (CommonUtil.q(BaseApplication.getContext())) {
                        String strD = lmgVar.d();
                        LogUtil.a("BIAnalyticsImpl", "convertSetToJsonString deviceLogMark:", strD);
                        jSONObject.put("WEAR_DID", strD);
                    }
                } catch (JSONException unused) {
                    lmp.a("BIAnalyticsImpl", "convertSetToJsonString Exception");
                }
                jSONArray.put(jSONObject);
            }
            return jSONArray.toString();
        }
    }

    public static void b(lmg... lmgVarArr) {
        synchronized (f40444b) {
            for (lmg lmgVar : lmgVarArr) {
                d.remove(lmgVar);
            }
        }
        a();
    }

    public static JSONObject b() {
        if (f40443a != null) {
            try {
                return new JSONObject(f40443a.toString());
            } catch (ConcurrentModificationException unused) {
                lmp.a("BIAnalyticsImpl", "getEnvironmentParam failed: ConcurrentModificationException");
                return null;
            } catch (JSONException unused2) {
                lmp.a("BIAnalyticsImpl", "getEnvironmentParam failed: jsonException");
            }
        }
        return null;
    }
}
