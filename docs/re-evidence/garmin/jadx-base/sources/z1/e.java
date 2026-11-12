package z1;

import p008y1.b2;

/* JADX INFO: loaded from: classes.dex */
public final class e {
    public static final int a(f2.m mVar, b2 b2Var) {
        long j8;
        if (b2Var == b2.Vertical) {
            long jD = mVar.d();
            g6.k.a aVar = g6.k.f76003b;
            j8 = jD & 4294967295L;
        } else {
            long jD2 = mVar.d();
            g6.k.a aVar2 = g6.k.f76003b;
            j8 = jD2 >> 32;
        }
        return (int) j8;
    }

    public static final int b(f2.m mVar, b2 b2Var) {
        return (int) (b2Var == b2.Vertical ? mVar.a() & 4294967295L : mVar.a() >> 32);
    }
}
