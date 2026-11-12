package com.alipay.apmobilesecuritysdk.d;

import android.content.Context;
import com.alipay.apmobilesecuritysdk.face.APSecuritySdk;
import defpackage.ky;
import defpackage.lc;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class d {
    public static Map<String, String> b(Context context) {
        HashMap map;
        synchronized (d.class) {
            map = new HashMap();
            try {
                map.put("AE16", com.alipay.apmobilesecuritysdk.c.c.a(context).a());
            } catch (Throwable unused) {
            }
        }
        return map;
    }

    public static Map<String, String> a(Context context) {
        HashMap map;
        synchronized (d.class) {
            lc lcVarD = lc.d();
            ky kyVarC = ky.c(APSecuritySdk.getInstance(context));
            map = new HashMap();
            map.put("AE1", lcVarD.c());
            map.put("AE2", lcVarD.b() ? "1" : "0");
            map.put("AE3", lcVarD.d(context) ? "1" : "0");
            map.put("AE4", lcVarD.a());
            map.put("AE5", lcVarD.e());
            map.put("AE6", lcVarD.h());
            map.put("AE7", lcVarD.i());
            map.put("AE8", lcVarD.j());
            map.put("AE9", lcVarD.g());
            map.put("AE10", lcVarD.f());
            map.put("AE11", lcVarD.m());
            map.put("AE12", lcVarD.l());
            map.put("AE13", lcVarD.n());
            map.put("AE14", lcVarD.k());
            map.put("AE15", lcVarD.o());
            map.put("AE21", kyVarC.g());
        }
        return map;
    }
}
