package defpackage;

import java.util.IllegalFormatException;

/* JADX INFO: loaded from: classes7.dex */
public final class uoe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f35968a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f35969b = 4;

    public static void a(String str, String str2, Object... objArr) {
        g(3, str, null, str2, objArr);
    }

    public static void b(String str, String str2) {
        g(6, str, null, str2, new Object[0]);
    }

    public static void c(String str, String str2, Throwable th) {
        g(6, str, th, str2, new Object[0]);
    }

    public static String d(String str, Object... objArr) {
        if (str == null) {
            return "";
        }
        if (objArr == null || objArr.length == 0) {
            return str;
        }
        try {
            return String.format(str, objArr);
        } catch (IllegalFormatException unused) {
            return str;
        }
    }

    public static void e(String str, String str2) {
        g(4, str, null, str2, new Object[0]);
    }

    public static void f(String str, String str2, Object... objArr) {
        g(4, str, null, str2, objArr);
    }

    public static void g(int i, String str, Throwable th, String str2, Object... objArr) {
        if (f35968a || i >= f35969b) {
            d(str2, objArr);
        }
    }

    public static void h(String str, String str2) {
        g(5, str, null, str2, new Object[0]);
    }
}
