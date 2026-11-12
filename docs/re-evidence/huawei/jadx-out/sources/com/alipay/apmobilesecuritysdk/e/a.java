package com.alipay.apmobilesecuritysdk.e;

import android.content.Context;
import defpackage.kj;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class a {
    public static b e(Context context) {
        synchronized (a.class) {
            String strA = com.alipay.apmobilesecuritysdk.f.a.a("wxcasxx_v3", "wxcasxx");
            if (kj.c(strA)) {
                return null;
            }
            return a(strA);
        }
    }

    public static b d(Context context) {
        synchronized (a.class) {
            String strA = com.alipay.apmobilesecuritysdk.f.a.a(context, "vkeyid_profiles_v3", "deviceid");
            if (kj.c(strA)) {
                return null;
            }
            return a(strA);
        }
    }

    public static b c(Context context) {
        b bVarA;
        synchronized (a.class) {
            String strA = com.alipay.apmobilesecuritysdk.f.a.a(context, "vkeyid_profiles_v3", "deviceid");
            if (kj.c(strA)) {
                strA = com.alipay.apmobilesecuritysdk.f.a.a("wxcasxx_v3", "wxcasxx");
            }
            bVarA = a(strA);
        }
        return bVarA;
    }

    public static void b(Context context) {
        synchronized (a.class) {
            com.alipay.apmobilesecuritysdk.f.a.a(context, "vkeyid_profiles_v3", "deviceid", "");
            com.alipay.apmobilesecuritysdk.f.a.a("wxcasxx_v3", "wxcasxx", "");
        }
    }

    public static void a(Context context, b bVar) {
        synchronized (a.class) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("apdid", bVar.f2028a);
                jSONObject.put("deviceInfoHash", bVar.f2029b);
                jSONObject.put("timestamp", bVar.f2030c);
                String string = jSONObject.toString();
                com.alipay.apmobilesecuritysdk.f.a.a(context, "vkeyid_profiles_v3", "deviceid", string);
                com.alipay.apmobilesecuritysdk.f.a.a("wxcasxx_v3", "wxcasxx", string);
            } catch (Exception e) {
                com.alipay.apmobilesecuritysdk.c.a.a(e);
            }
        }
    }

    public static void a(Context context) {
        synchronized (a.class) {
        }
    }

    private static b a(String str) {
        try {
            if (kj.c(str)) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(str);
            return new b(jSONObject.optString("apdid"), jSONObject.optString("deviceInfoHash"), jSONObject.optString("timestamp"));
        } catch (Exception e) {
            com.alipay.apmobilesecuritysdk.c.a.a(e);
            return null;
        }
    }
}
