package mg2;

import l30.y0;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes11.dex */
public final class r {
    public static final void a(f fVar, h4.r rVar, p3.m mVar, int i14) {
        int i15;
        fVar.getClass();
        o0 o0VarE = mVar.E(-351714314);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(fVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        int i16 = i15 | 48;
        int i17 = 0;
        if (o0VarE.n(i16 & 1, (i16 & 19) != 18)) {
            rVar = h4.r.S;
            x1 x1Var = p3.n.f135158a;
            og2.k.j(!((Boolean) o0VarE.A(d92.c.f58628b)).booleanValue(), null, null, z3.f.c(-2074427114, new y0(23, rVar, fVar), o0VarE), o0VarE, 3072);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new o(fVar, rVar, i14, i17);
        }
    }
}
