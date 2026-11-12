package com.alipay.apmobilesecuritysdk.e;

import android.content.Context;
import defpackage.kj;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f2038a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f2039b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static String f2040c = "";
    private static String d = "";
    private static String e = "";
    private static Map<String, String> f = new HashMap();

    public static void h() {
        f.clear();
        f2038a = "";
        f2039b = "";
        d = "";
        e = "";
        f2040c = "";
    }

    public static c g() {
        c cVar;
        synchronized (i.class) {
            cVar = new c(f2038a, f2039b, f2040c, d, e);
        }
        return cVar;
    }

    public static void f(String str) {
        e = str;
    }

    public static String f() {
        String str;
        synchronized (i.class) {
            str = f2040c;
        }
        return str;
    }

    public static void e(String str) {
        d = str;
    }

    public static String e() {
        String str;
        synchronized (i.class) {
            str = e;
        }
        return str;
    }

    public static void d(String str) {
        f2040c = str;
    }

    public static String d() {
        String str;
        synchronized (i.class) {
            str = d;
        }
        return str;
    }

    public static void c(String str) {
        f2039b = str;
    }

    public static String c() {
        String str;
        synchronized (i.class) {
            str = f2039b;
        }
        return str;
    }

    public static void b(String str) {
        f2038a = str;
    }

    public static String b() {
        String str;
        synchronized (i.class) {
            str = f2038a;
        }
        return str;
    }

    public static boolean a(Context context, String str) {
        long jA;
        synchronized (i.class) {
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
            } catch (Throwable th) {
                com.alipay.apmobilesecuritysdk.c.a.a(th);
            }
            return false;
        }
    }

    public static void a(String str, String str2) {
        synchronized (i.class) {
            String str3 = "apdidTokenCache" + str;
            if (f.containsKey(str3)) {
                f.remove(str3);
            }
            f.put(str3, str2);
        }
    }

    public static void a(c cVar) {
        synchronized (i.class) {
            if (cVar != null) {
                b(cVar.f2031a);
                c(cVar.f2032b);
                e(cVar.d);
                f(cVar.e);
                d(cVar.f2033c);
            }
        }
    }

    public static void a(b bVar) {
        synchronized (i.class) {
            if (bVar != null) {
                b(bVar.f2028a);
                c(bVar.f2029b);
                d(bVar.f2030c);
            }
        }
    }

    public static void a() {
        synchronized (i.class) {
        }
    }

    public static String a(String str) {
        synchronized (i.class) {
            String str2 = "apdidTokenCache" + str;
            if (f.containsKey(str2)) {
                String str3 = f.get(str2);
                if (kj.e(str3)) {
                    return str3;
                }
            }
            return "";
        }
    }
}
