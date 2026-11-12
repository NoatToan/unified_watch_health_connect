package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class f8t extends vbt {
    private static int a(mbt mbtVar) {
        return mbtVar.n();
    }

    public static int b(mbt mbtVar, byte b2, byte b3, short s, byte b4, int i) {
        mbtVar.q(5);
        d(mbtVar, i);
        e(mbtVar, s);
        g(mbtVar, b4);
        f(mbtVar, b3);
        c(mbtVar, b2);
        return a(mbtVar);
    }

    private static void c(mbt mbtVar, byte b2) {
        mbtVar.f(0, b2);
    }

    private static void d(mbt mbtVar, int i) {
        mbtVar.r(4, i);
    }

    public static void e(mbt mbtVar, short s) {
        mbtVar.j(2, s);
    }

    public static void f(mbt mbtVar, byte b2) {
        mbtVar.f(1, b2);
    }

    public static void g(mbt mbtVar, byte b2) {
        mbtVar.f(3, b2);
    }
}
