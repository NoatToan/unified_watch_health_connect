package l4;

import o4.m1;
import o4.r1;
import o4.u0;

/* JADX INFO: loaded from: classes.dex */
public final class w {
    public static h4.r a(h4.r rVar, float f14, r1 r1Var, boolean z14, int i14) {
        if ((i14 & 2) != 0) {
            r1Var = m1.f128891a;
        }
        r1 r1Var2 = r1Var;
        if ((i14 & 4) != 0) {
            z14 = g6.f.b(f14, (float) 0) > 0;
        }
        boolean z15 = z14;
        long j8 = u0.f129009a;
        return (g6.f.b(f14, (float) 0) > 0 || z15) ? rVar.then(new v(f14, r1Var2, z15, j8, j8, null)) : rVar;
    }
}
