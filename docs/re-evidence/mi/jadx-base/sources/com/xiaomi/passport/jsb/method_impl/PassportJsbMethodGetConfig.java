package com.xiaomi.passport.jsb.method_impl;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import com.miui.tsmclient.net.TSMAuthContants;
import com.xiaomi.account.privacy_data.lib.ReflectionCalls;
import com.xiaomi.accountsdk.account.XMPassportSettings;
import com.xiaomi.passport.jsb.PassportJsbMethod;
import com.xiaomi.passport.jsb.PassportJsbMethodException;
import com.xiaomi.passport.jsb.PassportJsbMethodResult;
import com.xiaomi.passport.webview.PassportJsbWebView;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class PassportJsbMethodGetConfig extends PassportJsbMethod {
    @Override // com.xiaomi.passport.jsb.PassportJsbMethod
    public String getName() {
        return "getConfig";
    }

    @Override // com.xiaomi.passport.jsb.PassportJsbMethod
    public PassportJsbMethodResult invoke(PassportJsbWebView passportJsbWebView, JSONObject jSONObject) throws PassportJsbMethodException {
        String str;
        Context context = passportJsbWebView.getContext();
        JSONObject jSONObject2 = new JSONObject();
        try {
            Locale locale = Locale.getDefault();
            jSONObject2.put("locale", locale.toString());
            jSONObject2.put("language", locale.getLanguage());
            jSONObject2.put("country", locale.getCountry());
            String packageName = context.getPackageName();
            jSONObject2.put(TSMAuthContants.PARAM_APP_PACKAGE_NAME, packageName);
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            jSONObject2.put("appVersionName", packageInfo.versionName);
            jSONObject2.put("appVersionCode", packageInfo.versionCode);
            jSONObject2.put("buildModel", Build.MODEL);
            jSONObject2.put("buildDevice", Build.DEVICE);
            jSONObject2.put("romAndroidVersionName", Build.VERSION.RELEASE);
            jSONObject2.put("romAndroidSdkCode", Build.VERSION.SDK_INT);
            jSONObject2.put("romVersionName", Build.VERSION.INCREMENTAL);
            try {
                Class<?> cls = Class.forName("miui.os.Build");
                jSONObject2.put("romMiuiIsInternational", ReflectionCalls.getStaticField(cls, "IS_INTERNATIONAL_BUILD"));
                jSONObject2.put("romMiuiRegion", ReflectionCalls.callStaticMethod("miui.os.Build", "getRegion", new Object[0]));
                String str2 = "large";
                if (((Boolean) ReflectionCalls.getStaticField(cls, "IS_TABLET")).booleanValue()) {
                    str = "pad";
                } else {
                    Object objCallStaticMethod = ReflectionCalls.callStaticMethod("android.os.SystemProperties", "getInt", "persist.sys.muiltdisplay_type", 0);
                    if (objCallStaticMethod == null || ((Integer) objCallStaticMethod).intValue() != 2) {
                        str = "phone";
                    } else {
                        str = "fold-phone";
                        if ((context.getResources().getConfiguration().screenLayout & 15) == 3) {
                        }
                    }
                    str2 = "normal";
                }
                jSONObject2.put("miuiDeviceType", str);
                jSONObject2.put("miuiScreenType", str2);
            } catch (ClassNotFoundException unused) {
            }
            Object objCallStaticMethod2 = ReflectionCalls.callStaticMethod("android.os.SystemProperties", "get", "ro.mi.os.version.incremental");
            if ((objCallStaticMethod2 instanceof String) && !TextUtils.isEmpty((String) objCallStaticMethod2)) {
                jSONObject2.put("romOSIncremental", objCallStaticMethod2);
            }
            Object objCallStaticMethod3 = ReflectionCalls.callStaticMethod("android.os.SystemProperties", "get", "ro.mi.os.version.code");
            if ((objCallStaticMethod3 instanceof String) && !TextUtils.isEmpty((String) objCallStaticMethod3)) {
                jSONObject2.put("romOSVersionCode", objCallStaticMethod3);
            }
            Object objCallStaticMethod4 = ReflectionCalls.callStaticMethod("android.os.SystemProperties", "get", "ro.mi.os.version.name");
            if ((objCallStaticMethod4 instanceof String) && !TextUtils.isEmpty((String) objCallStaticMethod4)) {
                jSONObject2.put("romOSVersionName", objCallStaticMethod4);
            }
            Object objCallStaticMethod5 = ReflectionCalls.callStaticMethod("android.os.SystemProperties", "get", "ro.miui.ui.version.name");
            if (objCallStaticMethod5 instanceof String) {
                jSONObject2.put("romMiuiVersionName", objCallStaticMethod5);
            }
            jSONObject2.put("inMiuiProvisionStep", Settings.Global.getInt(context.getContentResolver(), "device_provisioned", 0) != 1);
            jSONObject2.put("userSpaceId", XMPassportSettings.getUserHandleId());
            return new PassportJsbMethodResult(jSONObject2);
        } catch (PackageManager.NameNotFoundException e) {
            throw new PassportJsbMethodException(105, "WebView is not attached to valid page", e);
        } catch (JSONException e2) {
            throw new PassportJsbMethodException(105, "WebView is not attached to valid page", e2);
        }
    }
}
