package com.alipay.apmobilesecuritysdk.f;

import android.content.Context;
import android.os.Environment;
import gl1.d;
import gl1.y;
import java.io.File;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class a {
    /* JADX WARN: Code duplicated, block: B:18:0x0041 A[Catch: all -> 0x0072, TRY_LEAVE, TryCatch #0 {all -> 0x0072, blocks: (B:9:0x0010, B:11:0x001f, B:14:0x002a, B:16:0x003b, B:18:0x0041, B:13:0x0025), top: B:36:0x0010, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:21:0x005a  */
    /* JADX WARN: Instruction removed from duplicated block: B:18:0x0041, please report this as an issue */
    public static void a(String str, String str2, String str3) {
        String str4;
        File file;
        synchronized (a.class) {
            try {
                if (oi0.c.g(str) || oi0.c.g(str2)) {
                    return;
                }
                try {
                    String strH = d.h(str);
                    JSONObject jSONObject = new JSONObject();
                    if (oi0.c.k(strH)) {
                        try {
                            jSONObject = new JSONObject(strH);
                        } catch (Exception unused) {
                            jSONObject = new JSONObject();
                        }
                        jSONObject.put(str2, og.a.n(og.a.m(), str3));
                        jSONObject.toString();
                        try {
                            System.clearProperty(str);
                        } catch (Throwable unused2) {
                        }
                        if (y.g()) {
                            str4 = ".SystemConfig" + File.separator + str;
                            if (y.g()) {
                                file = new File(Environment.getExternalStorageDirectory(), str4);
                                if (file.exists() && file.isFile()) {
                                    file.delete();
                                }
                            }
                        }
                    } else {
                        jSONObject.put(str2, og.a.n(og.a.m(), str3));
                        jSONObject.toString();
                        System.clearProperty(str);
                        if (y.g()) {
                            str4 = ".SystemConfig" + File.separator + str;
                            if (y.g()) {
                                file = new File(Environment.getExternalStorageDirectory(), str4);
                                if (file.exists()) {
                                    file.delete();
                                }
                            }
                        }
                    }
                } catch (Throwable unused3) {
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public static String a(String str, String str2) {
        synchronized (a.class) {
            if (!oi0.c.g(str) && !oi0.c.g(str2)) {
                try {
                    String strH = d.h(str);
                    if (!oi0.c.g(strH)) {
                        String string = new JSONObject(strH).getString(str2);
                        if (!oi0.c.g(string)) {
                            return og.a.r(og.a.m(), string);
                        }
                    }
                } catch (Throwable unused) {
                    return null;
                }
            }
            return null;
        }
    }

    public static void a(Context context, String str, String str2, String str3) {
        if (oi0.c.g(str) || oi0.c.g(str2) || context == null) {
            return;
        }
        try {
            String strN = og.a.n(og.a.m(), str3);
            HashMap map = new HashMap();
            map.put(str2, strN);
            jg.c.a(context, str, map);
        } catch (Throwable unused) {
        }
    }

    public static String a(Context context, String str, String str2) {
        if (context != null && !oi0.c.g(str) && !oi0.c.g(str2)) {
            try {
                String string = context.getSharedPreferences(str, 0).getString(str2, "");
                if (oi0.c.g(string)) {
                    return null;
                }
                return og.a.r(og.a.m(), string);
            } catch (Throwable unused) {
            }
        }
        return null;
    }
}
