package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class d8t extends vbt {
    private static int a(mbt mbtVar) {
        return mbtVar.n();
    }

    public static int b(mbt mbtVar, int i, byte b2, int i2, int i3) {
        mbtVar.q(4);
        h(mbtVar, i3);
        g(mbtVar, i2);
        e(mbtVar, i);
        d(mbtVar, b2);
        return a(mbtVar);
    }

    public static int c(mbt mbtVar, int[] iArr) {
        mbtVar.h(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            mbtVar.e(iArr[length]);
        }
        return mbtVar.a();
    }

    public static void d(mbt mbtVar, byte b2) {
        mbtVar.f(1, b2);
    }

    private static void e(mbt mbtVar, int i) {
        mbtVar.r(0, i);
    }

    public static int f(mbt mbtVar, int[] iArr) {
        mbtVar.h(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            mbtVar.e(iArr[length]);
        }
        return mbtVar.a();
    }

    private static void g(mbt mbtVar, int i) {
        mbtVar.r(2, i);
    }

    private static void h(mbt mbtVar, int i) {
        mbtVar.r(3, i);
    }
}
