package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class b8t extends vbt {
    public static int a(mbt mbtVar) {
        return mbtVar.n();
    }

    public static int b(mbt mbtVar, int i, int i2, int i3) {
        mbtVar.q(3);
        h(mbtVar, i3);
        g(mbtVar, i2);
        e(mbtVar, i);
        return a(mbtVar);
    }

    public static int c(mbt mbtVar, byte[] bArr) {
        mbtVar.h(1, bArr.length, 1);
        for (int length = bArr.length - 1; length >= 0; length--) {
            mbtVar.d(bArr[length]);
        }
        return mbtVar.a();
    }

    public static int d(mbt mbtVar, int[] iArr) {
        mbtVar.h(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            mbtVar.e(iArr[length]);
        }
        return mbtVar.a();
    }

    private static void e(mbt mbtVar, int i) {
        mbtVar.r(0, i);
    }

    public static int f(mbt mbtVar, byte[] bArr) {
        mbtVar.h(1, bArr.length, 1);
        for (int length = bArr.length - 1; length >= 0; length--) {
            mbtVar.d(bArr[length]);
        }
        return mbtVar.a();
    }

    private static void g(mbt mbtVar, int i) {
        mbtVar.r(1, i);
    }

    private static void h(mbt mbtVar, int i) {
        mbtVar.r(2, i);
    }
}
