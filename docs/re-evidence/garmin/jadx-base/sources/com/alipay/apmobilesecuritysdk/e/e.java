package com.alipay.apmobilesecuritysdk.e;

import android.content.Context;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class e {
    public static f a(Context context) {
        if (context == null) {
            return null;
        }
        String strA = com.alipay.apmobilesecuritysdk.f.a.a(context, "device_feature_prefs_name", "device_feature_prefs_key");
        if (oi0.c.g(strA)) {
            strA = com.alipay.apmobilesecuritysdk.f.a.a("device_feature_file_name", "device_feature_file_key");
        }
        if (oi0.c.g(strA)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(strA);
            f fVar = new f();
            fVar.a(jSONObject.getString("imei"));
            fVar.b(jSONObject.getString("imsi"));
            fVar.c(jSONObject.getString("mac"));
            fVar.d(jSONObject.getString("bluetoothmac"));
            fVar.e(jSONObject.getString("gsi"));
            return fVar;
        } catch (Exception e4) {
            com.alipay.apmobilesecuritysdk.c.a.a(e4);
            return null;
        }
    }
}
