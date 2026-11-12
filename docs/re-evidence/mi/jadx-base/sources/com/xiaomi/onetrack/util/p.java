package com.xiaomi.onetrack.util;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes11.dex */
public class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f13986a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f13987b = false;
    public static boolean c = false;
    private static final int d = 3000;
    private static final String e = "OneTrack-Api-";
    private static final int f = 0;
    private static final int g = 1;
    private static final int h = 2;
    private static final int i = 3;
    private static final int j = 4;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static boolean f13988k = false;
    private static boolean l = false;
    private static boolean m = false;
    private static boolean n = false;

    public static void a() {
        try {
            String strE = com.xiaomi.onetrack.f.a.e();
            String strA = ab.a("debug.onetrack.log");
            boolean z = false;
            l = (TextUtils.isEmpty(strA) || TextUtils.isEmpty(strE) || !TextUtils.equals(strE, strA)) ? false : true;
            String strA2 = ab.a("debug.onetrack.upload");
            f13987b = (TextUtils.isEmpty(strA2) || TextUtils.isEmpty(strE) || !TextUtils.equals(strE, strA2)) ? false : true;
            String strA3 = ab.a("debug.onetrack.test");
            if (!TextUtils.isEmpty(strA3) && !TextUtils.isEmpty(strE) && TextUtils.equals(strE, strA3)) {
                z = true;
            }
            n = z;
            b();
            c();
        } catch (Exception e2) {
            StringBuilder sb = new StringBuilder();
            sb.append("LogUtil static initializer: ");
            sb.append(e2.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("log on: ");
        sb2.append(l);
        sb2.append(", quick upload on: ");
        sb2.append(f13987b);
    }

    public static void b(String str, String str2) {
        if (f13986a) {
            a(a(str), str2, 0);
        }
    }

    public static void c(String str, String str2) {
        if (f13986a) {
            a(a(str), str2, 1);
        }
    }

    public static void d(String str, String str2) {
        if (f13986a) {
            a(a(str), str2, 2);
        }
    }

    public static void b(String str, String str2, Throwable th) {
        if (f13986a) {
            a(str);
        }
    }

    public static void c(String str, String str2, Throwable th) {
        if (f13986a) {
            a(str);
        }
    }

    public static void d(String str, String str2, Throwable th) {
        if (f13986a) {
            a(str);
        }
    }

    private static void b() {
        f13986a = f13988k || l;
        StringBuilder sb = new StringBuilder();
        sb.append("updateDebugSwitch sEnable: ");
        sb.append(f13986a);
        sb.append(" sDebugMode：");
        sb.append(f13988k);
        sb.append(" sDebugProperty：");
        sb.append(l);
    }

    private static void c() {
        c = m || n;
        StringBuilder sb = new StringBuilder();
        sb.append("updateTestSwitch sTestEnable: ");
        sb.append(c);
        sb.append(" sTestMode：");
        sb.append(m);
        sb.append(" sTestProperty：");
        sb.append(n);
    }

    public static void b(boolean z) {
        m = z;
        c();
    }

    public static void a(String str, String str2) {
        if (f13986a) {
            a(a(str), str2, 3);
        }
    }

    public static void a(String str, String str2, Throwable th) {
        if (f13986a) {
            a(str);
        }
    }

    private static void a(String str, String str2, int i2) {
        if (str2 == null) {
            return;
        }
        int i3 = 0;
        while (i3 <= str2.length() / 3000) {
            int i4 = i3 * 3000;
            i3++;
            int iMin = Math.min(str2.length(), i3 * 3000);
            if (i4 < iMin) {
                str2.substring(i4, iMin);
            }
        }
    }

    public static String a(String str) {
        return e + str;
    }

    public static void a(boolean z) {
        f13988k = z;
        b();
    }
}
