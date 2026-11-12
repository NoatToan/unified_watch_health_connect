package com.alipay.apmobilesecuritysdk.e;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f28375a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f28376b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static String f28377c = "";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static String f28378d = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static String f28379e = "";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static Map<String, String> f28380f = new HashMap();

    public static synchronized String a(String str) {
        String str2 = "apdidTokenCache" + str;
        if (f28380f.containsKey(str2)) {
            String str3 = f28380f.get(str2);
            if (oi0.c.k(str3)) {
                return str3;
            }
        }
        return "";
    }

    public static synchronized String b() {
        return f28375a;
    }

    public static synchronized String c() {
        return f28376b;
    }

    public static synchronized String d() {
        return f28378d;
    }

    public static synchronized String e() {
        return f28379e;
    }

    public static synchronized String f() {
        return f28377c;
    }

    public static synchronized c g() {
        return new c(f28375a, f28376b, f28377c, f28378d, f28379e);
    }

    public static void h() {
        f28380f.clear();
        f28375a = "";
        f28376b = "";
        f28378d = "";
        f28379e = "";
        f28377c = "";
    }

    public static void b(String str) {
        f28375a = str;
    }

    public static void c(String str) {
        f28376b = str;
    }

    public static void d(String str) {
        f28377c = str;
    }

    public static void e(String str) {
        f28378d = str;
    }

    public static void f(String str) {
        f28379e = str;
    }

    public static synchronized void a() {
    }

    public static synchronized void a(b bVar) {
        if (bVar != null) {
            f28375a = bVar.f28361a;
            f28376b = bVar.f28362b;
            f28377c = bVar.f28363c;
        }
    }

    public static synchronized void a(c cVar) {
        if (cVar != null) {
            f28375a = cVar.f28364a;
            f28376b = cVar.f28365b;
            f28378d = cVar.f28367d;
            f28379e = cVar.f28368e;
            f28377c = cVar.f28366c;
        }
    }

    public static synchronized void a(String str, String str2) {
        try {
            String str3 = "apdidTokenCache" + str;
            if (f28380f.containsKey(str3)) {
                f28380f.remove(str3);
            }
            f28380f.put(str3, str2);
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public static synchronized boolean a(Context context, String str) {
        long jA;
        try {
            jA = h.a(context);
            if (jA < 0) {
                jA = 86400000;
            }
        } catch (Throwable unused) {
        }
        try {
            if (Math.abs(System.currentTimeMillis() - h.h(context, str)) < jA) {
                return true;
            }
        } catch (Throwable th3) {
            com.alipay.apmobilesecuritysdk.c.a.a(th3);
        }
        return false;
    }
}
