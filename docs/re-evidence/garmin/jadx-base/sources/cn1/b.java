package cn1;

import am.i1;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final class b {
    public static final void a(h4.r rVar, i53.f<String> fVar, boolean z14, p3.m mVar, int i14, int i15) {
        fVar.getClass();
        o0 o0VarE = mVar.E(-910737686);
        int i16 = (o0VarE.B(rVar) ? 4 : 2) | i14 | (o0VarE.B(fVar) ? 32 : 16);
        int i17 = i15 & 4;
        if (i17 != 0) {
            i16 |= 384;
        } else if ((i14 & 384) == 0) {
            i16 |= o0VarE.h(z14) ? 256 : 128;
        }
        if (o0VarE.n(i16 & 1, (i16 & 147) != 146)) {
            if (i17 != 0) {
                z14 = false;
            }
            x1 x1Var = p3.n.f135158a;
            og.a.e(z3.f.c(1703937699, new i1(rVar, z14, fVar, 7), o0VarE), o0VarE, 6);
        } else {
            o0VarE.e();
        }
        boolean z15 = z14;
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a(rVar, fVar, z15, i14, i15, 0);
        }
    }
}
