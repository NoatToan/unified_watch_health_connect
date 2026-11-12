package com.alipay.apmobilesecuritysdk.f;

import android.content.Context;
import defpackage.kj;
import defpackage.ks;
import defpackage.lf;
import defpackage.lm;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class a {
    public static void a(String str, String str2, String str3) {
        synchronized (a.class) {
            if (kj.c(str) || kj.c(str2)) {
                return;
            }
            try {
                String strC = lf.c(str);
                JSONObject jSONObject = new JSONObject();
                if (kj.e(strC)) {
                    try {
                        jSONObject = new JSONObject(strC);
                    } catch (Exception unused) {
                        jSONObject = new JSONObject();
                    }
                }
                jSONObject.put(str2, ks.c(ks.e(), str3));
                lf.e(str, jSONObject.toString());
            } catch (Throwable unused2) {
            }
        }
    }

    public static void a(Context context, String str, String str2, String str3) {
        if (kj.c(str) || kj.c(str2) || context == null) {
            return;
        }
        try {
            String strC = ks.c(ks.e(), str3);
            HashMap map = new HashMap();
            map.put(str2, strC);
            lm.b(context, str, map);
        } catch (Throwable unused) {
        }
    }

    public static String a(String str, String str2) {
        synchronized (a.class) {
            if (!kj.c(str) && !kj.c(str2)) {
                try {
                    String strC = lf.c(str);
                    if (!kj.c(strC)) {
                        String string = new JSONObject(strC).getString(str2);
                        if (!kj.c(string)) {
                            return ks.e(ks.e(), string);
                        }
                    }
                } catch (Throwable unused) {
                    return null;
                }
            }
            return null;
        }
    }

    public static String a(Context context, String str, String str2) {
        if (context != null && !kj.c(str) && !kj.c(str2)) {
            try {
                String strE = lm.e(context, str, str2, "");
                if (kj.c(strE)) {
                    return null;
                }
                return ks.e(ks.e(), strE);
            } catch (Throwable unused) {
            }
        }
        return null;
    }
}
