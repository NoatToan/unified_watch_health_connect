package o72;

import i3.v5;
import p005kotlin.Unit;
import p3.b4;

/* JADX INFO: loaded from: classes9.dex */
public final class o1 {
    public static final void a(p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(-369015531);
        if (o0VarE.n(i14 & 1, i14 != 0)) {
            p3.x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            h4.r rVarC = c2.x2.c(aVar, 1.0f);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            p3.i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(rVarC, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar2 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC2, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            n82.f fVarA = n82.j.a(new n82.f.a(o82.g.f130849b, null, null, 6, null), null, o0VarE, 0);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new n1();
                o0VarE.K(objQ);
            }
            q82.c cVar = (q82.c) objQ;
            o82.g gVarA = fVarA.f124961b.a();
            boolean zB = o0VarE.B(fVarA);
            Object objQ2 = o0VarE.q();
            if (zB || objQ2 == c2565a) {
                objQ2 = new d52.k(fVarA, 10);
                o0VarE.K(objQ2);
            }
            b(gVarA, (e23.l) objQ2, o0VarE, 0);
            q82.a.a(c2.x2.f(aVar, 1.0f), new n82.n(fVarA, cVar), null, o0VarE, 6, 4);
            n82.c.a(b0Var.a(aVar, 1.0f, true), fVarA, 3, false, z3.f.c(-1759166931, new a6.c(cVar, 13), o0VarE), o0VarE, 24960, 8);
            o0VarE = o0VarE;
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new b1(i14, 19);
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0072  */
    public static final void b(o82.g gVar, e23.l<? super o82.g, Unit> lVar, p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(-410513961);
        int i15 = (o0VarE.k(gVar.ordinal()) ? 4 : 2) | i14 | (o0VarE.r(lVar) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            p3.x1 x1Var = p3.n.f135158a;
            c2.j jVar = c2.j.f22691a;
            g6.f.a aVar = g6.f.f75994b;
            jVar.getClass();
            c2.j.i iVarI = c2.j.i(8);
            c2.l2 l2VarC = c2.l.c(4, 0.0f, 2);
            boolean z14 = ((i15 & 14) == 4) | ((i15 & 112) == 32);
            Object objQ = o0VarE.q();
            if (z14) {
                objQ = new o50.a(3, gVar, lVar);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new o50.a(3, gVar, lVar);
                    o0VarE.K(objQ);
                }
            }
            e2.c.c(null, null, l2VarC, iVarI, null, null, false, null, (e23.l) objQ, o0VarE, 24960, 491);
            d92.b.f58623a.getClass();
            v5.a(1, 48, 1, d92.b.a(o0VarE).j().c(), null, o0VarE);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new mw0.i(gVar, lVar, i14, 22);
        }
    }
}
