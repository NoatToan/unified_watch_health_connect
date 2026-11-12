package r22;

import c2.q2;
import c2.s2;
import c2.u2;
import p3.b4;
import p3.p2;

/* JADX INFO: loaded from: classes10.dex */
public final class l2 {
    /* JADX WARN: Code duplicated, block: B:35:0x00c8  */
    public static final void a(h4.r rVar, e23.l lVar, float f14, z3.e eVar, p3.m mVar, int i14) {
        h4.r rVar2;
        e23.p pVar;
        p3.o0 o0VarE = mVar.E(117035320);
        p3.c<?> cVar = o0VarE.f135177b;
        int i15 = i14 | (o0VarE.r(lVar) ? 32 : 16) | (o0VarE.i(f14) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            p3.x1 x1Var = p3.n.f135158a;
            int iF0 = ((g6.c) o0VarE.A(kotlin.t1.f91490h)).f0(f14);
            h4.d.f81522a.getClass();
            h4.g.b bVar = h4.d.a.f81534l;
            c2.j.f22691a.getClass();
            s2 s2VarA = q2.a(c2.j.f22692b, bVar, o0VarE, 48);
            int iHashCode = Long.hashCode(o0VarE.U);
            p3.i2 i2VarA0 = o0VarE.a0();
            rVar2 = rVar;
            h4.r rVarC = h4.k.c(rVar2, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar = h5.g.a.f81805b;
            if (cVar == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar2 = h5.g.a.f81810g;
            b4.c(eVar2, s2VarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            u2 u2Var = u2.f22900a;
            boolean zK = ((i15 & 112) == 32) | o0VarE.k(iF0);
            Object objQ = o0VarE.q();
            if (zK) {
                objQ = new k2(iF0, lVar);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new k2(iF0, lVar);
                    o0VarE.K(objQ);
                }
            }
            f5.z0 z0Var = (f5.z0) objQ;
            h4.r.a aVar2 = h4.r.S;
            int iHashCode2 = Long.hashCode(o0VarE.U);
            p3.i2 i2VarA1 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(aVar2, o0VarE);
            if (cVar == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar);
            } else {
                o0VarE.c();
            }
            b4.c(eVar2, z0Var, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
            }
            b4.c(fVar, rVarC2, o0VarE);
            pVar = eVar;
            pVar.invoke(o0VarE, 6);
            o0VarE.g0(true);
            o0VarE.g0(true);
        } else {
            rVar2 = rVar;
            pVar = eVar;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new hz0.w(rVar2, lVar, f14, pVar, i14, 3);
        }
    }
}
