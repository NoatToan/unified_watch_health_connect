package com.alipay.apmobilesecuritysdk.e;

import android.content.Context;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class d {
    private static c a(String str) {
        try {
            if (com.alipay.security.mobile.module.a.a.d(str)) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(str);
            return new c(jSONObject.optString("apdid"), jSONObject.optString("deviceInfoHash"), jSONObject.optString("timestamp"), jSONObject.optString("tid"), jSONObject.optString("utdid"));
        } catch (Exception e) {
            com.alipay.apmobilesecuritysdk.c.a.a(e);
            return null;
        }
    }

    public static synchronized c b() {
        String strA = com.alipay.apmobilesecuritysdk.f.a.a("wxcasxx_v4", "key_wxcasxx_v4");
        if (com.alipay.security.mobile.module.a.a.d(strA)) {
            return null;
        }
        return a(strA);
    }

    public static synchronized c c(Context context) {
        String strA = com.alipay.apmobilesecuritysdk.f.a.a(context, "vkeyid_profiles_v4", "key_deviceid_v4");
        if (com.alipay.security.mobile.module.a.a.d(strA)) {
            return null;
        }
        return a(strA);
    }

    public static synchronized void a() {
    }

    public static synchronized c b(Context context) {
        String strA;
        try {
            strA = com.alipay.apmobilesecuritysdk.f.a.a(context, "vkeyid_profiles_v4", "key_deviceid_v4");
            if (com.alipay.security.mobile.module.a.a.d(strA)) {
                strA = com.alipay.apmobilesecuritysdk.f.a.a("wxcasxx_v4", "key_wxcasxx_v4");
            }
        } catch (Throwable th) {
            throw th;
        }
        return a(strA);
    }

    public static synchronized void a(Context context) {
        com.alipay.apmobilesecuritysdk.f.a.a(context, "vkeyid_profiles_v4", "key_deviceid_v4", "");
        com.alipay.apmobilesecuritysdk.f.a.a("wxcasxx_v4", "key_wxcasxx_v4", "");
    }

    public static synchronized void a(Context context, c cVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("apdid", cVar.f5776a);
            jSONObject.put("deviceInfoHash", cVar.f5777b);
            jSONObject.put("timestamp", cVar.c);
            jSONObject.put("tid", cVar.d);
            jSONObject.put("utdid", cVar.e);
            String string = jSONObject.toString();
            com.alipay.apmobilesecuritysdk.f.a.a(context, "vkeyid_profiles_v4", "key_deviceid_v4", string);
            com.alipay.apmobilesecuritysdk.f.a.a("wxcasxx_v4", "key_wxcasxx_v4", string);
        } catch (Exception e) {
            com.alipay.apmobilesecuritysdk.c.a.a(e);
        }
    }
}
