package defpackage;

import android.os.Build;
import android.text.TextUtils;
import com.huawei.hiai.awareness.AwarenessConstants;
import com.huawei.hwcloudmodel.callback.GrsQueryCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.pluginhealthzone.cloud.HttpDataCallback;
import com.huawei.thirdloginbasemodule.ThirdLoginDataStorageUtil;
import health.compact.a.CommonUtil;
import health.compact.a.GRSManager;
import health.compact.a.LogAnonymous;
import health.compact.a.Utils;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class pfk {
    public static void a(JSONObject jSONObject, Map<String, String> map) {
        try {
            e(jSONObject);
            if (map == null || map.size() <= 0) {
                return;
            }
            for (Map.Entry<String, String> entry : map.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
        } catch (JSONException e) {
            LogUtil.e("CloudImplHelper", e.getMessage());
        }
    }

    private static void e(JSONObject jSONObject) throws JSONException {
        if ("com.huawei.bone".equals(BaseApplication.getAppPackage())) {
            jSONObject.put("appType", 2);
            jSONObject.put("appId", "com.huawei.bone");
        } else {
            jSONObject.put("appType", 1);
            jSONObject.put("appId", "com.huawei.health");
        }
        jSONObject.put("tokenType", ThirdLoginDataStorageUtil.getTokenTypeValue());
        LoginInit loginInit = LoginInit.getInstance(BaseApplication.getContext());
        jSONObject.put("token", loginInit.getAccountInfo(1008));
        jSONObject.put("siteId", loginInit.getSiteId());
        jSONObject.put("deviceType", Build.MODEL);
        jSONObject.put("deviceId", LoginInit.getInstance(BaseApplication.getContext()).getDeviceId());
        jSONObject.put("sysVersion", Build.VERSION.RELEASE);
        jSONObject.put("bindDeviceType", CommonUtil.h(BaseApplication.getContext()));
        jSONObject.put("ts", System.currentTimeMillis());
        jSONObject.put("iVersion", 2);
        jSONObject.put("environment", CommonUtil.o(BaseApplication.getContext()));
        jSONObject.put("manufacturer", Build.MANUFACTURER);
    }

    public static void c(String str, String str2, JSONObject jSONObject, Map<String, String> map, HttpDataCallback httpDataCallback) {
        b(str, str2, jSONObject, map, httpDataCallback, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(final String str, String str2, JSONObject jSONObject, Map<String, String> map, final HttpDataCallback httpDataCallback, boolean z) {
        a(jSONObject, map);
        pfq.c(str + str2, jSONObject, new HttpDataCallback() { // from class: pfk.1
            @Override // com.huawei.pluginhealthzone.cloud.HttpDataCallback
            public void onFailure(int i, String str3) {
                pfk.d(str, i, str3, httpDataCallback);
            }

            @Override // com.huawei.pluginhealthzone.cloud.HttpDataCallback
            public void onSuccess(JSONObject jSONObject2) {
                pfk.e(str, jSONObject2, httpDataCallback);
            }
        }, z);
    }

    public static void b(final String str, final String str2, final JSONObject jSONObject, final Map<String, String> map, final HttpDataCallback httpDataCallback, final boolean z) {
        if (b(str2, httpDataCallback)) {
            if (!Utils.h()) {
                LogUtil.j("CloudImplHelper", "fetch HEALTH_CLOUD from no_cloud user login");
            } else if (!CommonUtil.ab(BaseApplication.getContext())) {
                LogUtil.e("CloudImplHelper", "no network,please check");
                httpDataCallback.onFailure(AwarenessConstants.ERROR_TIMEOUT_CODE, "Internet connection failed. Please check your network settings and try again.");
            } else {
                GRSManager.c(BaseApplication.getContext()).d(str, new GrsQueryCallback() { // from class: pfk.5
                    @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
                    public void onCallBackSuccess(String str3) {
                        pfk.a(str3, str2, jSONObject, map, httpDataCallback, z);
                    }

                    @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
                    public void onCallBackFail(int i) {
                        LogUtil.e("CloudImplHelper", "get domainHealthdataHicloud failed :", Integer.valueOf(i));
                        String url = GRSManager.c(BaseApplication.getContext()).getUrl(str);
                        if (!TextUtils.isEmpty(url)) {
                            pfk.a(url, str2, jSONObject, map, httpDataCallback, z);
                        } else {
                            httpDataCallback.onFailure(AwarenessConstants.ERROR_UNKNOWN_CODE, pfo.d(AwarenessConstants.ERROR_UNKNOWN_CODE));
                        }
                    }
                });
            }
        }
    }

    public static boolean b(String str, HttpDataCallback httpDataCallback) {
        if (!TextUtils.isEmpty(str)) {
            return true;
        }
        httpDataCallback.onFailure(AwarenessConstants.ERROR_UNKNOWN_CODE, "args valid");
        LogUtil.e("CloudImplHelper", "url == null");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(String str, int i, String str2, HttpDataCallback httpDataCallback) {
        if (httpDataCallback != null) {
            httpDataCallback.onFailure(i, str2);
        }
        b(str, i, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(String str, JSONObject jSONObject, HttpDataCallback httpDataCallback) {
        int iOptInt = 209999;
        String strD = pfo.d(209999);
        if (jSONObject != null) {
            LogUtil.d("CloudImplHelper", "data = ", jSONObject);
            iOptInt = jSONObject.optInt("resultCode");
            LogUtil.a("CloudImplHelper", "resultCode = ", Integer.valueOf(iOptInt));
            strD = jSONObject.optString("resultDesc");
            if (iOptInt == 0) {
                if (httpDataCallback != null) {
                    httpDataCallback.onSuccess(jSONObject);
                }
                LogUtil.d("CloudImplHelper", str, jSONObject.toString());
            } else if (httpDataCallback != null) {
                httpDataCallback.onFailure(iOptInt, strD);
            }
        } else if (httpDataCallback != null) {
            httpDataCallback.onFailure(209999, strD);
        }
        LogUtil.d("CloudImplHelper", str, pfo.d(iOptInt), strD);
    }

    private static void b(String str, int i, String str2) {
        String str3;
        StringBuilder sb = new StringBuilder();
        String host = null;
        try {
            host = new URL(str).getHost();
            for (InetAddress inetAddress : InetAddress.getAllByName(host)) {
                if (inetAddress != null) {
                    sb.append(inetAddress.getHostAddress());
                    sb.append("_");
                }
            }
        } catch (MalformedURLException | UnknownHostException e) {
            LogUtil.j("CloudImplHelper", "requestFailureLog exception ", LogAnonymous.b(e));
        }
        String str4 = host;
        if (!CommonUtil.ab(BaseApplication.getContext())) {
            str3 = "net not Connect";
        } else {
            str3 = "net Connect";
        }
        LogUtil.d("CloudImplHelper", "url:", str4, "_ip:", sb.toString(), "_netConnected:", str3, "_errorCode:", Integer.valueOf(i), "_errorInfo:", str2, "_exceptionString:");
    }
}
