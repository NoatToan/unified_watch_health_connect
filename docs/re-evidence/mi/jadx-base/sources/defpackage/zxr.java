package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public class zxr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f41791a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static p1d f41792b;

    public static void a(String str, String str2) {
        p1d p1dVar;
        if (!f41791a || (p1dVar = f41792b) == null) {
            return;
        }
        p1dVar.d(str, str2);
    }

    public static void b(String str, String str2) {
        p1d p1dVar;
        if (!f41791a || (p1dVar = f41792b) == null) {
            return;
        }
        p1dVar.e(str, str2);
    }

    public static void c(String str, String str2, Throwable th) {
        p1d p1dVar;
        if (!f41791a || (p1dVar = f41792b) == null) {
            return;
        }
        p1dVar.e(str, str2, th);
    }

    public static boolean d() {
        return f41791a;
    }

    public static void e(boolean z) {
        if (f41792b == null) {
            f41791a = z;
        }
    }

    public static void f(p1d p1dVar) {
        if (p1dVar != null) {
            f41792b = p1dVar;
            f41791a = p1dVar.logEnable();
        }
    }

    public static void g(String str, String str2) {
        p1d p1dVar;
        if (!f41791a || (p1dVar = f41792b) == null) {
            return;
        }
        p1dVar.w(str, str2);
    }
}
