package com.xiaomi.passport.jsb.method_impl;

import android.content.Context;
import com.xiaomi.account.privacy_data.lib.ReflectionCalls;
import com.xiaomi.accountsdk.account.XMPassportSettings;
import com.xiaomi.accountsdk.hasheddeviceidlib.HashedDeviceIdUtil;
import com.xiaomi.passport.jsb.PassportJsbMethod;
import com.xiaomi.passport.jsb.PassportJsbMethodException;
import com.xiaomi.passport.jsb.PassportJsbMethodResult;
import com.xiaomi.passport.webview.PassportJsbWebView;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class PassportJsbMethodGetDeviceInfo extends PassportJsbMethod {
    @Override // com.xiaomi.passport.jsb.PassportJsbMethod
    public String getName() {
        return "getDeviceInfo";
    }

    @Override // com.xiaomi.passport.jsb.PassportJsbMethod
    public PassportJsbMethodResult invoke(PassportJsbWebView passportJsbWebView, JSONObject jSONObject) throws PassportJsbMethodException {
        String str;
        Context context = passportJsbWebView.getContext();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("deviceId", new HashedDeviceIdUtil(XMPassportSettings.getApplicationContext()).getHashedDeviceIdNoThrow());
            try {
                String str2 = "large";
                if (((Boolean) ReflectionCalls.getStaticField(Class.forName("miui.os.Build"), "IS_TABLET")).booleanValue()) {
                    str = "pad";
                } else {
                    Object objCallStaticMethod = ReflectionCalls.callStaticMethod("android.os.SystemProperties", "getInt", "persist.sys.muiltdisplay_type", 0);
                    if (objCallStaticMethod == null || ((Integer) objCallStaticMethod).intValue() != 2) {
                        str = "phone";
                        str2 = "normal";
                    } else {
                        if ((context.getResources().getConfiguration().screenLayout & 15) != 3) {
                            str2 = "normal";
                        }
                        str = "fold-phone";
                    }
                }
                jSONObject2.put("miuiDeviceType", str);
                jSONObject2.put("miuiScreenType", str2);
            } catch (ClassNotFoundException unused) {
            }
            return new PassportJsbMethodResult(jSONObject2);
        } catch (JSONException unused2) {
            throw new PassportJsbMethodException(105, "should never happen");
        }
    }
}
