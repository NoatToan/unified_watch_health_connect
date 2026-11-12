package af1;

import a03.t0;
import lc.y;
import p3.o0;
import p3.p2;
import p3.x1;
import r1.c0;

/* JADX INFO: loaded from: classes9.dex */
public final class d {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(y yVar, we1.d dVar, p3.m mVar, int i14) {
        yVar.getClass();
        dVar.getClass();
        o0 o0VarE = mVar.E(1199589480);
        int i15 = (o0VarE.r(yVar) ? 4 : 2) | i14 | (o0VarE.r(dVar) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            c0.e(((Boolean) dVar.f184781f.getF182175a()).booleanValue(), null, null, null, null, z3.f.c(229552960, new aa2.f(1, dVar, yVar), o0VarE), o0VarE, 196608, 30);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new t0(yVar, dVar, i14, 5);
        }
    }
}
