package com.alipay.apmobilesecuritysdk.e;

import android.content.Context;
import defpackage.kj;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class d {
    public static c e(Context context) {
        synchronized (d.class) {
            String strA = com.alipay.apmobilesecuritysdk.f.a.a("wxcasxx_v4", "key_wxcasxx_v4");
            if (kj.c(strA)) {
                return null;
            }
            return a(strA);
        }
    }

    public static c d(Context context) {
        synchronized (d.class) {
            String strA = com.alipay.apmobilesecuritysdk.f.a.a(context, "vkeyid_profiles_v4", "key_deviceid_v4");
            if (kj.c(strA)) {
                return null;
            }
            return a(strA);
        }
    }

    public static c c(Context context) {
        c cVarA;
        synchronized (d.class) {
            String strA = com.alipay.apmobilesecuritysdk.f.a.a(context, "vkeyid_profiles_v4", "key_deviceid_v4");
            if (kj.c(strA)) {
                strA = com.alipay.apmobilesecuritysdk.f.a.a("wxcasxx_v4", "key_wxcasxx_v4");
            }
            cVarA = a(strA);
        }
        return cVarA;
    }

    public static void b(Context context) {
        synchronized (d.class) {
        }
    }

    public static void a(Context context, c cVar) {
        synchronized (d.class) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("apdid", cVar.f2031a);
                jSONObject.put("deviceInfoHash", cVar.f2032b);
                jSONObject.put("timestamp", cVar.f2033c);
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

    public static void a(Context context) {
        synchronized (d.class) {
            com.alipay.apmobilesecuritysdk.f.a.a(context, "vkeyid_profiles_v4", "key_deviceid_v4", "");
            com.alipay.apmobilesecuritysdk.f.a.a("wxcasxx_v4", "key_wxcasxx_v4", "");
        }
    }

    private static c a(String str) {
        try {
            if (kj.c(str)) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(str);
            return new c(jSONObject.optString("apdid"), jSONObject.optString("deviceInfoHash"), jSONObject.optString("timestamp"), jSONObject.optString("tid"), jSONObject.optString("utdid"));
        } catch (Exception e) {
            com.alipay.apmobilesecuritysdk.c.a.a(e);
            return null;
        }
    }
}
