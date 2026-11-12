package gs;

import e11.f0;
import kotlin.t1;
import nr.p0;
import p3.o0;
import p3.p2;
import p3.v;
import p3.x1;
import p3.y3;

/* JADX INFO: loaded from: classes7.dex */
public final class c {
    public static final void a(h4.r rVar, p0 p0Var, float f14, ds.n nVar, p3.m mVar, int i14) {
        p0Var.getClass();
        o0 o0VarE = mVar.E(597125007);
        int i15 = (o0VarE.B(rVar) ? 4 : 2) | i14 | (o0VarE.r(p0Var) ? 32 : 16) | (o0VarE.i(f14) ? 256 : 128) | (o0VarE.k(nVar == null ? -1 : nVar.ordinal()) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            o0VarE.G0();
            if ((i14 & 1) != 0 && !o0VarE.o0()) {
                o0VarE.e();
            }
            o0VarE.h0();
            x1 x1Var = p3.n.f135158a;
            y3 y3Var = t1.f91490h;
            v.a(y3Var.c(new is.n(((g6.c) o0VarE.A(y3Var)).getF75991a() * f14, 1.0f)), z3.f.c(-979457329, new f0(rVar, 27, nVar, p0Var), o0VarE), o0VarE, 56);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a(rVar, p0Var, f14, nVar, i14, 0);
        }
    }
}
