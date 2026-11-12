package defpackage;

import android.os.Build;
import com.huawei.health.ecologydevice.networkclient.HealthEngineRequestManager;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.utils.CloudParamKeys;
import com.huawei.profile.coordinator.ProfileRequestConstants;
import com.huawei.thirdloginbasemodule.ThirdLoginDataStorageUtil;
import health.compact.a.CommonUtil;
import health.compact.a.GRSManager;
import health.compact.a.LanguageUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.Utils;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class fof {
    public static JSONObject d() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("publicArgs", b());
            return jSONObject;
        } catch (JSONException unused) {
            LogUtil.e("ArgsUtil", "JSONException");
            return jSONObject;
        }
    }

    public static Map<String, String> a() {
        HashMap map = new HashMap();
        String huidOrDefault = LoginInit.getInstance(BaseApplication.getContext()).getHuidOrDefault();
        if (!LoginInit.getInstance(BaseApplication.getContext()).isBrowseMode() && huidOrDefault != null) {
            map.put("x-huid", huidOrDefault);
        }
        map.put("x-version", CommonUtil.c(BaseApplication.getContext()));
        map.put("Content-Type", HealthEngineRequestManager.CONTENT_TYPE);
        return map;
    }

    private static JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("tokenType", ThirdLoginDataStorageUtil.getTokenTypeValue());
            d(jSONObject);
            jSONObject.put("oaId", "");
            String strE = SharedPreferenceManager.e(btx.c(), Integer.toString(10000), "health_product_recommend");
            if (strE == null) {
                jSONObject.put("isTrackingEnabled", "0");
            } else {
                jSONObject.put("isTrackingEnabled", strE);
            }
            if (LoginInit.getInstance(btx.c()).isLoginedByWear()) {
                jSONObject.put("appId", "com.huawei.bone");
            } else {
                jSONObject.put("appId", xkd.e());
            }
            jSONObject.put("deviceType", xkd.c());
            jSONObject.put("upDeviceType", LoginInit.getInstance(btx.c()).getDeviceType());
            jSONObject.put("deviceId", LoginInit.getInstance(btx.c()).getDeviceId());
            jSONObject.put("sysVersion", Build.VERSION.RELEASE);
            jSONObject.put(CloudParamKeys.CLIENT_TYPE, qrs.d());
            jSONObject.put("manufacturer", Build.MANUFACTURER);
            if ("com.huawei.bone".equals(BaseApplication.getAppPackage())) {
                jSONObject.put("appType", 2);
            } else {
                jSONObject.put("appType", 1);
            }
            jSONObject.put("ts", System.currentTimeMillis());
            jSONObject.put("timeZone", lsl.q(System.currentTimeMillis()));
            if (Utils.o()) {
                jSONObject.put("iVersion", "3");
            } else {
                jSONObject.put("iVersion", "5");
            }
            if (LanguageUtil.o(BaseApplication.getContext())) {
                jSONObject.put("language", ProfileRequestConstants.X_LANGUAGE_VALUE);
            } else {
                jSONObject.put("language", "en_US");
            }
            jSONObject.put("environment", CommonUtil.o(BaseApplication.getContext()));
            jSONObject.put("countryCode", GRSManager.c(BaseApplication.getContext()).getCommonCountryCode());
            jSONObject.put("traceId", String.valueOf(System.currentTimeMillis()) + Math.random());
            return jSONObject;
        } catch (JSONException unused) {
            LogUtil.e("ArgsUtil", "JSONException");
            return jSONObject;
        }
    }

    private static void d(JSONObject jSONObject) throws JSONException {
        LoginInit loginInit = LoginInit.getInstance(BaseApplication.getContext());
        if (loginInit.getUsetId() != null) {
            String accountInfo = loginInit.getAccountInfo(1008);
            int siteId = loginInit.getSiteId();
            jSONObject.put("token", accountInfo);
            jSONObject.put("siteId", siteId);
        }
    }
}
