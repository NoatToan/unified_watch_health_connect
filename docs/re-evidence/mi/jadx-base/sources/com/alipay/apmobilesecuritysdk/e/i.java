package com.alipay.apmobilesecuritysdk.e;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f5781a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f5782b = "";
    private static String c = "";
    private static String d = "";
    private static String e = "";
    private static Map<String, String> f = new HashMap();

    public static synchronized String a(String str) {
        String str2 = "apdidTokenCache" + str;
        if (f.containsKey(str2)) {
            String str3 = f.get(str2);
            if (com.alipay.security.mobile.module.a.a.g(str3)) {
                return str3;
            }
        }
        return "";
    }

    public static synchronized String b() {
        return f5781a;
    }

    public static synchronized String c() {
        return f5782b;
    }

    public static synchronized String d() {
        return d;
    }

    public static synchronized String e() {
        return e;
    }

    public static synchronized String f() {
        return c;
    }

    public static synchronized c g() {
        return new c(f5781a, f5782b, c, d, e);
    }

    public static void h() {
        f.clear();
        f5781a = "";
        f5782b = "";
        d = "";
        e = "";
        c = "";
    }

    public static synchronized void a() {
    }

    public static void b(String str) {
        f5781a = str;
    }

    public static void c(String str) {
        f5782b = str;
    }

    public static void d(String str) {
        c = str;
    }

    public static void e(String str) {
        d = str;
    }

    public static void f(String str) {
        e = str;
    }

    public static synchronized void a(b bVar) {
        if (bVar != null) {
            f5781a = bVar.f5774a;
            f5782b = bVar.f5775b;
            c = bVar.c;
        }
    }

    public static synchronized void a(c cVar) {
        if (cVar != null) {
            f5781a = cVar.f5776a;
            f5782b = cVar.f5777b;
            d = cVar.d;
            e = cVar.e;
            c = cVar.c;
        }
    }

    public static synchronized void a(String str, String str2) {
        try {
            String str3 = "apdidTokenCache" + str;
            if (f.containsKey(str3)) {
                f.remove(str3);
            }
            f.put(str3, str2);
        } catch (Throwable th) {
            throw th;
        }
    }

    public static synchronized boolean a(Context context, String str) {
        long j = 86400000;
        long jA = h.a(context);
        if (jA >= 0) {
            j = jA;
        }
        try {
            if (Math.abs(System.currentTimeMillis() - h.h(context, str)) < j) {
                return true;
            }
        } catch (Throwable th) {
            com.alipay.apmobilesecuritysdk.c.a.a(th);
        }
        return false;
    }
}
