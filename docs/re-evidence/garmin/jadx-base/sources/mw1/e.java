package mw1;

import am.j;
import c2.x2;
import h4.r;
import i3.ve;
import k2.i;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;
import u1.w;
import z3.f;

/* JADX INFO: loaded from: classes10.dex */
public final class e {
    public static final void a(r rVar, String str, e23.a aVar, m mVar, int i14) {
        int i15;
        e23.a aVar2;
        aVar.getClass();
        o0 o0VarE = mVar.E(-1226117546);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(str) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            aVar2 = aVar;
            i15 |= o0VarE.r(aVar2) ? 256 : 128;
        } else {
            aVar2 = aVar;
        }
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            r rVarD = w.d(x2.f(rVar, 1.0f), false, null, null, aVar2, 15);
            long jC = j.c(d92.b.f58623a, o0VarE);
            d92.b.f58625c.getClass();
            ve.a(rVarD, i.a(j92.b.f97900c.f97910b), jC, 0L, 0.0f, 0.0f, null, f.c(498890395, new fv1.b(str, 27), o0VarE), o0VarE, 12582912, 120);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new d(rVar, str, aVar, i14, 0);
        }
    }
}
