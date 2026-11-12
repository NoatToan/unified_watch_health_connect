package defpackage;

/* JADX INFO: loaded from: classes11.dex */
public class gpe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f19212a = true;

    public static void a(String str, String str2, Object... objArr) {
        if (f19212a) {
            e(str2, objArr);
        }
    }

    public static void b(String str, String str2, Throwable th) {
        d(th, str, str2, new Object[0]);
    }

    public static void c(String str, String str2, Object... objArr) {
        e(str2, objArr);
    }

    public static void d(Throwable th, String str, String str2, Object... objArr) {
        e(str2, objArr);
    }

    public static String e(String str, Object... objArr) {
        return objArr.length == 0 ? str : String.format(str, objArr);
    }

    public static void f(String str, String str2, Object... objArr) {
        e(str2, objArr);
    }

    public static void g(boolean z) {
        f19212a = z;
    }

    public static void h(String str, String str2, Object... objArr) {
        if (f19212a) {
            e(str2, objArr);
        }
    }

    public static void i(String str, String str2, Object... objArr) {
        e(str2, objArr);
    }
}
