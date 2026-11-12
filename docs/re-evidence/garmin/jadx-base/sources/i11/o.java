package i11;

import h4.r;
import i3.p7;
import p3.o0;
import p3.p2;
import p3.v;
import p3.x1;
import p3.y3;

/* JADX INFO: loaded from: classes9.dex */
public final class o {
    public static final void a(int i14, e23.l lVar, r rVar, p3.m mVar, boolean z14) {
        int i15;
        lVar.getClass();
        o0 o0VarE = mVar.E(-1650676975);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.h(z14) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(lVar) ? 32 : 16;
        }
        int i16 = i15 | 384;
        if (o0VarE.n(i16 & 1, (i16 & 147) != 146)) {
            rVar = r.S;
            x1 x1Var = p3.n.f135158a;
            y3 y3Var = p7.f89282d;
            g6.f.f75994b.getClass();
            v.a(y3Var.c(g6.f.a(g6.f.f75996d)), z3.f.c(1464766417, new ad0.h(lVar, rVar, z14), o0VarE), o0VarE, 56);
        } else {
            o0VarE.e();
        }
        r rVar2 = rVar;
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new at.b(z14, lVar, rVar2, i14, 7);
        }
    }
}
