package defpackage;

import android.annotation.SuppressLint;

/* JADX INFO: loaded from: classes6.dex */
@SuppressLint({"DefaultLocale"})
@Deprecated
public class of4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f29100a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f29101b = 0;
    public static String c = "";
    public static boolean d = true;

    public static String a(String str, String str2) {
        return String.format("%s/html/permission_settings_run_in_background/index.html?locale=%s&model=%s", c(), str, str2);
    }

    public static String b(String str) {
        return String.format("%s/html/android_notify/index.html?locale=%s", c(), str);
    }

    public static String c() {
        return g() ? "http://st-watch.iot.mi.com" : String.format("https://%swatch.iot.mi.com", c);
    }

    public static String d() {
        return "https://region.hlth.io.mi.com";
    }

    public static String e(String str, String str2, String str3) {
        return String.format("%s/html/guidance/index.html?model=%s&locale=%s", c(), str2, str);
    }

    public static String f(String str, String str2) {
        return String.format("%s/html/privacy/index.html?locale=%s&type=watch_user_license_v3&model=%s", d(), str, str2);
    }

    public static boolean g() {
        return f29100a;
    }
}
