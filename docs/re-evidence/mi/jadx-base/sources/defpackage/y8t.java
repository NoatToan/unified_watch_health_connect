package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class y8t extends vbt {
    private static int a(mbt mbtVar) {
        return mbtVar.n();
    }

    public static int b(mbt mbtVar, int i) {
        mbtVar.q(1);
        d(mbtVar, i);
        return a(mbtVar);
    }

    public static int c(mbt mbtVar, int[] iArr) {
        mbtVar.h(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            mbtVar.e(iArr[length]);
        }
        return mbtVar.a();
    }

    private static void d(mbt mbtVar, int i) {
        mbtVar.r(0, i);
    }
}
