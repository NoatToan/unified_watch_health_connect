package defpackage;

import health.compact.a.SharedPreferenceManager;

/* JADX INFO: loaded from: classes16.dex */
public class qrg {
    public static void d(boolean z) {
        SharedPreferenceManager.a("ecg_sharedpreference_start_msg", "showRedDot", z);
    }

    public static boolean e() {
        return SharedPreferenceManager.b("ecg_sharedpreference_start_msg", "showRedDot", false);
    }

    public static void a(boolean z) {
        SharedPreferenceManager.a(Integer.toString(10052), "NormalItemHolder_newDataDotExists", z);
    }

    public static void b(String str, long j) {
        SharedPreferenceManager.c("loginTime", str, j);
    }

    public static long d(String str) {
        return SharedPreferenceManager.d("loginTime", str, 0L);
    }

    public static boolean e(String str) {
        return SharedPreferenceManager.b("loginTime", str, true);
    }

    public static void a(String str, boolean z) {
        SharedPreferenceManager.a("loginTime", str, z);
    }

    public static int b(String str) {
        return SharedPreferenceManager.c("loginTime", str, 0);
    }

    public static void b(String str, int i) {
        SharedPreferenceManager.d("loginTime", str, i);
    }

    public static String c() {
        return SharedPreferenceManager.b("MAIN_NEED_NOVA_FLAG", "MAIN_NEED_NOVA_FLAG", "");
    }

    public static void h(String str) {
        SharedPreferenceManager.c("MAIN_NEED_NOVA_FLAG", "MAIN_NEED_NOVA_FLAG", str);
    }

    public static void a(String str) {
        SharedPreferenceManager.a(String.valueOf(20006), "THIRD_APP_FLAG" + str, true);
    }

    public static boolean c(String str) {
        return SharedPreferenceManager.b(String.valueOf(20006), "THIRD_APP_FLAG" + str, false);
    }
}
