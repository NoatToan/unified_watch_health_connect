package at1;

import p004k6.u;
import p005kotlin.Unit;
import p3.o0;
import p3.p2;
import p3.x1;
import pt1.v;

/* JADX INFO: loaded from: classes10.dex */
public final class m {
    public static final void a(v vVar, e23.l<? super Integer, Unit> lVar, e23.a<Unit> aVar, p3.m mVar, int i14) {
        e23.a<Unit> aVar2;
        vVar.getClass();
        lVar.getClass();
        aVar.getClass();
        o0 o0VarE = mVar.E(-147284575);
        int i15 = (o0VarE.B(vVar) ? 4 : 2) | i14 | (o0VarE.r(lVar) ? 32 : 16) | (o0VarE.r(aVar) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            aVar2 = aVar;
            p004k6.c.a(aVar2, new u(false, false, false, 5, (p005kotlin.jvm.internal.j) null), z3.f.c(-421294038, new k(aVar, vVar, lVar), o0VarE), o0VarE, ((i15 >> 6) & 14) | 432, 0);
        } else {
            aVar2 = aVar;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new k(vVar, lVar, aVar2, i14);
        }
    }
}
