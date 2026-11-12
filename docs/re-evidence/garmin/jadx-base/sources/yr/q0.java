package yr;

import c2.x2;
import l72.p2;
import l72.r1;
import p3.b4;
import p3.i2;
import p3.x1;

/* JADX INFO: loaded from: classes7.dex */
public final class q0 {
    public static final void a(nr.g.r rVar, p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(1471034244);
        int i15 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            h4.r rVarF = x2.f(h4.r.S, 1.0f);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarF, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar = h5.g.a.f81805b;
            z3.e eVarC = null;
            if (o0VarE.f135177b == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            String str = rVar.f127121b;
            if (str == null) {
                o0VarE.C(-315569874);
            } else {
                o0VarE.C(-315569873);
                r1.b(str, null, o0VarE, 0, 2);
            }
            o0VarE.g0(false);
            p2 p2Var = p2.f111205a;
            u4.d dVar = rVar.f127122c;
            if (dVar == null) {
                o0VarE.C(-315441286);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-315441285);
                eVarC = z3.f.c(338243512, new b82.k(dVar, 19), o0VarE);
                o0VarE.g0(false);
            }
            p2Var.g(rVar.f127123d, null, null, eVarC, null, false, false, null, o0VarE, 0, 502);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new d(rVar, i14, 14);
        }
    }
}
