package defpackage;

import android.util.Log;

/* JADX INFO: loaded from: classes5.dex */
public class ipe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f21975a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f21976b = 1;

    public static void a(String str) {
        if (!f21975a || f21976b > 3) {
            return;
        }
        c();
    }

    public static String b(StackTraceElement stackTraceElement) {
        String className = stackTraceElement.getClassName();
        return "ZXingLite|" + String.format("%s.%s(L:%d)", className.substring(className.lastIndexOf(".") + 1), stackTraceElement.getMethodName(), Integer.valueOf(stackTraceElement.getLineNumber()));
    }

    public static String c() {
        return b(d(5));
    }

    public static StackTraceElement d(int i) {
        return Thread.currentThread().getStackTrace()[i];
    }

    public static String e(Throwable th) {
        return Log.getStackTraceString(th);
    }

    public static void f(String str) {
        if (!f21975a || f21976b > 4) {
            return;
        }
        c();
    }

    public static boolean g() {
        return f21975a;
    }

    public static void h(String str) {
        if (!f21975a || f21976b > 5) {
            return;
        }
        c();
    }

    public static void i(String str, Throwable th) {
        if (!f21975a || f21976b > 5) {
            return;
        }
        c();
    }

    public static void j(Throwable th) {
        if (!f21975a || f21976b > 5) {
            return;
        }
        c();
        e(th);
    }
}
