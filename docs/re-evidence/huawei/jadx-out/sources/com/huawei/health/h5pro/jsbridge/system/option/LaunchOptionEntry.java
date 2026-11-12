package com.huawei.health.h5pro.jsbridge.system.option;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import com.google.gson.Gson;
import com.huawei.health.h5pro.H5ProClient;
import com.huawei.health.h5pro.core.H5ProBridgeManager;
import com.huawei.health.h5pro.core.H5ProBundle;
import com.huawei.health.h5pro.core.H5ProLaunchOption;
import com.huawei.health.h5pro.jsbridge.base.JsBaseModule;
import com.huawei.health.h5pro.jsbridge.base.JsModuleBase;
import com.huawei.health.h5pro.utils.GsonUtil;
import com.huawei.health.h5pro.utils.LogUtil;
import com.huawei.health.h5pro.webkit.H5ProDeeplinkManager;
import com.huawei.health.h5pro.webkit.trustlist.H5ProTrustListChecker;
import com.huawei.operation.ble.BleConstants;
import com.huawei.pluginachievement.manager.model.MedalConstants;
import com.huawei.profile.coordinator.ProfileRequestConstants;
import defpackage.exn;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class LaunchOptionEntry extends JsBaseModule {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f6855a = new Object();
    private String e;

    public LaunchOptionEntry(String str) {
        if (TextUtils.isEmpty(str)) {
            this.e = "{}";
        } else {
            this.e = str;
        }
    }

    private H5ProLaunchOption.Builder b(LaunchOptionObj launchOptionObj, H5ProLaunchOption.Builder builder) {
        Map<String, Class<? extends JsModuleBase>> customJsModule;
        Class<? extends JsModuleBase> cls;
        if (launchOptionObj != null && launchOptionObj.b() != 0 && (customJsModule = H5ProBridgeManager.getInstance().getCustomJsModule(this.mH5ProInstance)) != null && !customJsModule.isEmpty()) {
            for (String str : customJsModule.keySet()) {
                if (!TextUtils.isEmpty(str) && (cls = customJsModule.get(str)) != null) {
                    builder.addCustomizeJsModule(str, cls);
                }
            }
        }
        return builder;
    }

    private H5ProLaunchOption.Builder b(String str, String str2) {
        Map<String, Object> mapJson = GsonUtil.parseMapJson(str2);
        H5ProLaunchOption.Builder builder = !mapJson.isEmpty() ? new H5ProLaunchOption.Builder() : null;
        if (builder != null) {
            for (String str3 : mapJson.keySet()) {
                Object obj = mapJson.get(str3);
                if (str3 == null || !(obj instanceof String)) {
                    LogUtil.i(this.TAG, "Not supported: key = " + str3 + " value = " + obj);
                } else {
                    builder.addCustomizeArg(str3, (String) obj);
                }
            }
        }
        LaunchOptionObj launchOptionObj = (LaunchOptionObj) GsonUtil.parseJson(str, LaunchOptionObj.class);
        if (launchOptionObj == null) {
            return builder;
        }
        if (builder == null) {
            builder = new H5ProLaunchOption.Builder();
        }
        if (launchOptionObj.e() != -1) {
            builder.setBackgroundColor(launchOptionObj.e());
        }
        if (!TextUtils.isEmpty(launchOptionObj.h())) {
            builder.addPath(launchOptionObj.h());
        }
        if (launchOptionObj.d() != 0) {
            builder.setImmerse();
        }
        if (launchOptionObj.a() != 0) {
            builder.setNeedSoftInputAdapter();
        }
        if (launchOptionObj.i() != 0) {
            builder.showStatusBar();
        }
        builder.setStatusBarTextBlack(launchOptionObj.g() != 0);
        builder.setForceDarkMode(launchOptionObj.c());
        builder.setActivityStartFlag(launchOptionObj.f());
        return b(launchOptionObj, builder);
    }

    @JavascriptInterface
    public void addCustomizeArg(String str) {
        String string;
        LogUtil.i(this.TAG, "addCustomizeArg");
        if (TextUtils.isEmpty(str)) {
            LogUtil.i(this.TAG, "addCustomizeArg: params is null");
            return;
        }
        String string2 = null;
        try {
            JSONObject jSONObject = new JSONObject(str);
            string = jSONObject.getString(MedalConstants.EVENT_KEY);
            try {
                string2 = jSONObject.getString("value");
            } catch (JSONException unused) {
                LogUtil.e(this.TAG, "addCustomizeArg===JSONException");
            }
        } catch (JSONException unused2) {
            string = null;
        }
        if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2)) {
            return;
        }
        setCustomizeArg("{'" + string + "':'" + string2 + "'}");
    }

    @JavascriptInterface
    public String getAllCustomizeArg() {
        LogUtil.i(this.TAG, "getAllCustomizeArg==" + this.e);
        return this.e;
    }

    @JavascriptInterface
    public void getAllCustomizeArgAsync(long j) {
        LogUtil.i(this.TAG, "getAllCustomizeArgAsync==" + this.e);
        onSuccessCallback(j, this.e);
    }

    @JavascriptInterface
    public String getLocale() {
        String language = Locale.getDefault().getLanguage();
        String country = Locale.getDefault().getCountry();
        String script = Locale.getDefault().getScript();
        if ("ZH".equalsIgnoreCase(language)) {
            if ("HANS".equalsIgnoreCase(script)) {
                return ProfileRequestConstants.X_LANGUAGE_VALUE;
            }
            if ("HANT".equalsIgnoreCase(script) && "CN".equalsIgnoreCase(country)) {
                return "zh_HK";
            }
        }
        return TextUtils.concat(language, "_", country).toString();
    }

    @Override // com.huawei.health.h5pro.jsbridge.base.JsBaseModule
    public void onCreate(H5ProBundle h5ProBundle) {
        Map<? extends String, ? extends Object> data;
        super.onCreate(h5ProBundle);
        if (h5ProBundle == null || (data = h5ProBundle.getData()) == null || data.isEmpty()) {
            return;
        }
        Map<String, Object> mapJson = GsonUtil.parseMapJson(this.e);
        mapJson.putAll(data);
        this.e = GsonUtil.toJson(mapJson);
    }

    @JavascriptInterface
    public void setCustomizeArg(String str) {
        LogUtil.i(this.TAG, "setCustomizeArg");
        if (TextUtils.isEmpty(str)) {
            LogUtil.i(this.TAG, "setCustomizeArg: mapJson is null");
            return;
        }
        Map<String, Object> mapJson = GsonUtil.parseMapJson(str);
        if (mapJson.isEmpty()) {
            return;
        }
        if (TextUtils.isEmpty(this.e)) {
            this.e = "{}";
        }
        Map<String, Object> mapJson2 = GsonUtil.parseMapJson(this.e);
        for (String str2 : mapJson.keySet()) {
            Object obj = mapJson.get(str2);
            if (str2 == null || !(obj instanceof String)) {
                LogUtil.i(this.TAG, "Not supported: key = " + str2 + " value = " + obj);
            } else {
                mapJson2.put(str2, obj);
            }
        }
        this.e = new Gson().toJson(mapJson2);
    }

    @JavascriptInterface
    public void startActivity(String str) {
        LogUtil.i(this.TAG, "startActivity");
        if (TextUtils.isEmpty(str)) {
            LogUtil.w(this.TAG, " params is null");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("type");
            if (TextUtils.isEmpty(strOptString)) {
                LogUtil.w(this.TAG, "type is empty");
                return;
            }
            String strOptString2 = jSONObject.optString(BleConstants.KEY_PATH);
            if (TextUtils.isEmpty(strOptString2)) {
                LogUtil.w(this.TAG, "path is empty");
                return;
            }
            String strOptString3 = jSONObject.optString("packageName");
            if (!TextUtils.equals(strOptString.toUpperCase(Locale.ENGLISH), "DEEPLINK")) {
                LogUtil.w(this.TAG, "This type(" + strOptString + ") is not implemented");
                return;
            }
            if (H5ProTrustListChecker.isTrustedToLoad(strOptString2)) {
                H5ProDeeplinkManager.jumpFromDeeplink(this.mContext, strOptString2, strOptString3);
                return;
            }
            LogUtil.w(this.TAG, "untrusted -> " + strOptString2);
        } catch (ActivityNotFoundException | JSONException e) {
            LogUtil.e(this.TAG, "Exception -> " + e.getMessage());
        }
    }

    @JavascriptInterface
    public void startH5LightApp(String str) {
        synchronized (f6855a) {
            LogUtil.i(this.TAG, "startH5LightApp");
            if (TextUtils.isEmpty(str)) {
                LogUtil.i(this.TAG, "startH5LightApp: params is null");
                return;
            }
            exn exnVar = (exn) GsonUtil.parseJson(str, exn.class);
            if (exnVar == null) {
                LogUtil.i(this.TAG, "startH5LightApp: H5LightAppStartParamsObj is null");
                return;
            }
            final String strD = exnVar.d();
            final H5ProLaunchOption.Builder builderB = b(exnVar.c(), exnVar.e());
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.huawei.health.h5pro.jsbridge.system.option.LaunchOptionEntry.5
                @Override // java.lang.Runnable
                public void run() {
                    if (LaunchOptionEntry.this.mContext == null || TextUtils.isEmpty(strD)) {
                        return;
                    }
                    Context context = LaunchOptionEntry.this.mContext;
                    String str2 = strD;
                    H5ProLaunchOption.Builder builder = builderB;
                    H5ProClient.startH5LightApp(context, str2, builder == null ? null : builder.build());
                }
            });
        }
    }
}
