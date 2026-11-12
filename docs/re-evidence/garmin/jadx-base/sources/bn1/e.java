package bn1;

import c2.l;
import c2.v;
import c2.x2;
import h4.r;
import o4.z0;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final class e {
    public static final void a(float f14, z0 z0Var, float f15, z3.e eVar, m mVar, int i14) {
        int i15;
        o0 o0VarE = mVar.E(-1876440278);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.i(f14) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(z0Var) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.i(f15) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(eVar) ? 2048 : 1024;
        }
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            r rVarF = x2.f(l.A(r.S, f15, 0.0f, 2), 1.0f);
            h4.d.f81522a.getClass();
            v.a(rVarF, h4.d.a.f81530h, false, z3.f.c(-1011923052, new d(f14, z0Var, eVar, 0), o0VarE), o0VarE, 3120, 4);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new af1.m(f14, z0Var, f15, eVar, i14);
        }
    }
}
