package com.alipay.apmobilesecuritysdk.e;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import java.util.UUID;

/* JADX INFO: loaded from: classes7.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f28374a = "";

    public static long a(Context context) {
        String strA = jg.a.a(context, "update_time_interval");
        if (oi0.c.k(strA)) {
            try {
                return Long.parseLong(strA);
            } catch (Exception unused) {
            }
        }
        return 86400000L;
    }

    public static String b(Context context) {
        return jg.a.a(context, "last_apdid_env");
    }

    public static boolean c(Context context) {
        String strA = jg.a.a(context, "log_switch");
        return strA != null && IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(strA);
    }

    public static String d(Context context) {
        return jg.a.a(context, "dynamic_key");
    }

    public static String e(Context context) {
        return jg.a.a(context, "apse_degrade");
    }

    public static String f(Context context) {
        String str;
        SharedPreferences.Editor editorEdit;
        synchronized (h.class) {
            try {
                if (oi0.c.g(f28374a)) {
                    String string = context.getSharedPreferences("alipay_vkey_random", 0).getString("random", "");
                    f28374a = string;
                    if (oi0.c.g(string)) {
                        String strC = oe2.f.c(UUID.randomUUID().toString());
                        f28374a = strC;
                        if (strC != null && (editorEdit = context.getSharedPreferences("alipay_vkey_random", 0).edit()) != null) {
                            editorEdit.putString("random", strC);
                            editorEdit.commit();
                        }
                    }
                }
                str = f28374a;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return str;
    }

    public static void g(Context context, String str) {
        a(context, "apse_degrade", str);
    }

    public static long h(Context context, String str) {
        try {
            String strA = jg.a.a(context, "vkey_valid" + str);
            if (oi0.c.g(strA)) {
                return 0L;
            }
            return Long.parseLong(strA);
        } catch (Throwable unused) {
            return 0L;
        }
    }

    public static void b(Context context, String str) {
        a(context, "last_machine_boot_time", str);
    }

    public static void d(Context context, String str) {
        a(context, "agent_switch", str);
    }

    public static void e(Context context, String str) {
        a(context, "dynamic_key", str);
    }

    public static void c(Context context, String str) {
        a(context, "last_apdid_env", str);
    }

    public static void a(Context context, String str) {
        a(context, "update_time_interval", str);
    }

    public static void a(Context context, String str, long j8) {
        jg.a.b(context, fb1.c.n("vkey_valid", str), String.valueOf(j8));
    }

    public static void a(Context context, String str, String str2) {
        jg.a.b(context, str, str2);
    }

    public static void a(Context context, boolean z14) {
        a(context, "log_switch", z14 ? IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE : "0");
    }

    public static void f(Context context, String str) {
        a(context, "webrtc_url", str);
    }
}
