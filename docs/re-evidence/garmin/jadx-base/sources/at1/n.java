package at1;

import e23.p;
import p004k6.u;
import p005kotlin.Unit;
import p3.o0;
import p3.p2;
import p3.x1;
import pt1.y;

/* JADX INFO: loaded from: classes10.dex */
public final class n {
    public static final void a(y yVar, p<? super y, ? super Integer, Unit> pVar, e23.a<Unit> aVar, p3.m mVar, int i14) {
        yVar.getClass();
        pVar.getClass();
        aVar.getClass();
        o0 o0VarE = mVar.E(-890763966);
        int i15 = (o0VarE.B(yVar) ? 4 : 2) | i14;
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(pVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(aVar) ? 256 : 128;
        }
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            p004k6.c.a(aVar, new u(false, false, false, 5, (p005kotlin.jvm.internal.j) null), z3.f.c(198603339, new a3.e(aVar, yVar, pVar), o0VarE), o0VarE, ((i15 >> 6) & 14) | 432, 0);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a42.f(yVar, pVar, aVar, i14, 7);
        }
    }
}
