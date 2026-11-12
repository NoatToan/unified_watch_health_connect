package af1;

import c2.x2;
import h4.r;
import p3.o0;
import p3.p2;
import p3.x1;
import s5.x0;

/* JADX INFO: loaded from: classes9.dex */
public final class n {
    public static final void a(int i14, Float f14, float f15, float f16, x0 x0Var, p3.m mVar, int i15) {
        float f17;
        o0 o0Var;
        o0 o0VarE = mVar.E(551224211);
        int i16 = i15 | (o0VarE.k(i14) ? 4 : 2) | (o0VarE.B(f14) ? 32 : 16) | (o0VarE.B(x0Var) ? 16384 : 8192);
        if (o0VarE.n(i16 & 1, (i16 & 9363) != 9362)) {
            x1 x1Var = p3.n.f135158a;
            f17 = f15;
            o0Var = o0VarE;
            z72.k.a(x2.q(r.S, f17), i53.a.a(new z72.l(0.25f, f.a(e.f3072e, o0VarE), null), new z72.l(0.25f, f.a(e.f3073f, o0VarE), null), new z72.l(0.25f, f.a(e.f3074g, o0VarE), null), new z72.l(0.25f, f.a(e.f3075h, o0VarE), null), new z72.l(0.125f, f.a(e.f3076i, o0VarE), null), new z72.l(0.125f, f.a(e.f3077j, o0VarE), null), new z72.l(0.125f, f.a(e.f3078k, o0VarE), null)), f14, null, null, f16, 2.0f, false, false, z3.f.c(804691271, new l(i14, x0Var, 0), o0VarE), o0Var, ((i16 << 3) & 896) | 807075840, 408);
        } else {
            f17 = f15;
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new m(i14, f14, f17, f16, x0Var, i15);
        }
    }
}
