package com.alipay.apmobilesecuritysdk.e;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f5780a = "";

    public static long a(Context context) {
        String strA = com.alipay.security.mobile.module.c.a.a(context, "vkeyid_settings", "update_time_interval");
        if (!com.alipay.security.mobile.module.a.a.g(strA)) {
            return 86400000L;
        }
        try {
            return Long.parseLong(strA);
        } catch (Exception unused) {
            return 86400000L;
        }
    }

    public static String b(Context context) {
        return com.alipay.security.mobile.module.c.a.a(context, "vkeyid_settings", "last_apdid_env");
    }

    public static void c(Context context, String str) {
        a(context, "last_apdid_env", str);
    }

    public static String d(Context context) {
        return com.alipay.security.mobile.module.c.a.a(context, "vkeyid_settings", "dynamic_key");
    }

    public static String e(Context context) {
        return com.alipay.security.mobile.module.c.a.a(context, "vkeyid_settings", "apse_degrade");
    }

    public static String f(Context context) {
        String str;
        SharedPreferences.Editor editorEdit;
        synchronized (h.class) {
            try {
                if (com.alipay.security.mobile.module.a.a.d(f5780a)) {
                    String strA = com.alipay.security.mobile.module.c.e.a(context, "alipay_vkey_random", "random", "");
                    f5780a = strA;
                    if (com.alipay.security.mobile.module.a.a.d(strA)) {
                        String strA2 = com.alipay.security.mobile.module.a.a.b.a(UUID.randomUUID().toString());
                        f5780a = strA2;
                        if (strA2 != null && (editorEdit = context.getSharedPreferences("alipay_vkey_random", 0).edit()) != null) {
                            editorEdit.putString("random", strA2);
                            editorEdit.commit();
                        }
                    }
                }
                str = f5780a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    public static void g(Context context, String str) {
        a(context, "apse_degrade", str);
    }

    public static long h(Context context, String str) {
        try {
            String strA = com.alipay.security.mobile.module.c.a.a(context, "vkeyid_settings", "vkey_valid" + str);
            if (com.alipay.security.mobile.module.a.a.d(strA)) {
                return 0L;
            }
            return Long.parseLong(strA);
        } catch (Throwable unused) {
            return 0L;
        }
    }

    public static void a(Context context, String str) {
        a(context, "update_time_interval", str);
    }

    public static void b(Context context, String str) {
        a(context, "last_machine_boot_time", str);
    }

    public static boolean c(Context context) {
        String strA = com.alipay.security.mobile.module.c.a.a(context, "vkeyid_settings", "log_switch");
        return strA != null && "1".equals(strA);
    }

    public static void d(Context context, String str) {
        a(context, "agent_switch", str);
    }

    public static void e(Context context, String str) {
        a(context, "dynamic_key", str);
    }

    public static void f(Context context, String str) {
        a(context, "webrtc_url", str);
    }

    public static void a(Context context, String str, long j) {
        com.alipay.security.mobile.module.c.a.b(context, "vkeyid_settings", "vkey_valid" + str, String.valueOf(j));
    }

    private static void a(Context context, String str, String str2) {
        com.alipay.security.mobile.module.c.a.b(context, "vkeyid_settings", str, str2);
    }

    public static void a(Context context, boolean z) {
        a(context, "log_switch", z ? "1" : "0");
    }
}
