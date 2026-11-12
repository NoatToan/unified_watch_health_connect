package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class g8t extends vbt {
    private static int a(mbt mbtVar) {
        return mbtVar.n();
    }

    public static int b(mbt mbtVar, byte b2, int i) {
        mbtVar.q(2);
        e(mbtVar, i);
        d(mbtVar, b2);
        return a(mbtVar);
    }

    public static int c(mbt mbtVar, byte[] bArr) {
        mbtVar.h(1, bArr.length, 1);
        for (int length = bArr.length - 1; length >= 0; length--) {
            mbtVar.d(bArr[length]);
        }
        return mbtVar.a();
    }

    private static void d(mbt mbtVar, byte b2) {
        mbtVar.f(0, b2);
    }

    private static void e(mbt mbtVar, int i) {
        mbtVar.r(1, i);
    }
}
