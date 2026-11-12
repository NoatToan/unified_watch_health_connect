package cd1;

import b82.y;
import c2.j;
import c2.t0;
import h4.r;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final class e {
    public static final void a(r rVar, m mVar, int i14) {
        r rVar2;
        o0 o0VarE = mVar.E(1869220485);
        int i15 = 2;
        int i16 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        if (o0VarE.n(i16 & 1, (i16 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            j.f22691a.getClass();
            j.c cVar = j.f22696f;
            a.f26866a.getClass();
            rVar2 = rVar;
            t0.a(rVar2, cVar, null, null, 0, 0, a.f26867b, o0VarE, (i16 & 14) | 1572912, 60);
        } else {
            rVar2 = rVar;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new y(rVar2, i14, i15);
        }
    }
}
