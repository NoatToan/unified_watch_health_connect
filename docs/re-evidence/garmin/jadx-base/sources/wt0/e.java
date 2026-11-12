package wt0;

import c2.q;
import c2.u;
import e23.l;
import f5.z0;
import h4.k;
import h4.r;
import h5.e0;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import p5.v;
import u1.w;

/* JADX INFO: loaded from: classes9.dex */
public final class e {
    public static final void a(r rVar, tt0.b bVar, e23.a aVar, m mVar, int i14) {
        r rVar2;
        bVar.getClass();
        yz1.d dVar = bVar.f166366a;
        tt0.e eVar = bVar.f166367b;
        o0 o0VarE = mVar.E(-1802435412);
        int i15 = i14 | (o0VarE.B(bVar) ? 32 : 16) | (o0VarE.r(aVar) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            long jA = am.j.A(d92.b.f58623a, o0VarE);
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            j92.e eVar2 = j92.b.f97899b;
            rVar2 = rVar;
            r rVarE = u1.n.e(rVar2, jA, k2.i.a(eVar2.f97918c));
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new wp.b(14);
                o0VarE.K(objQ);
            }
            r rVarC = v.c((l) objQ, rVarE, true);
            boolean z14 = (i15 & 896) == 256;
            Object objQ2 = o0VarE.q();
            if (z14 || objQ2 == c2565a) {
                objQ2 = new w51.j(aVar, 20);
                o0VarE.K(objQ2);
            }
            r rVarD = w.d(rVarC, false, null, null, (e23.a) objQ2, 15);
            bVar2.getClass();
            r rVarY = c2.l.y(rVarD, eVar2.f97920e);
            h4.d.f81522a.getClass();
            z0 z0VarD = q.d(h4.d.a.f81524b, false);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC2 = k.c(rVarY, o0VarE);
            h5.g.V.getClass();
            e0.a aVar2 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, z0VarD, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar3 = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
            }
            b4.c(h5.g.a.f81807d, rVarC2, o0VarE);
            u uVar = u.f22885a;
            if (eVar instanceof tt0.e.c) {
                o0VarE.C(-1437257234);
                f12.l.f68084a.getClass();
                d.d(yz1.e.b(dVar), (tt0.e.c) eVar, f12.l.a.a().g(), o0VarE, 0);
                o0VarE.g0(false);
            } else if (eVar instanceof tt0.e.a) {
                o0VarE.C(-1437246787);
                d.a(yz1.e.b(dVar), (tt0.e.a) eVar, o0VarE, 0);
                o0VarE.g0(false);
            } else {
                if (!(eVar instanceof tt0.e.b)) {
                    throw kg.f.h(o0VarE, -1437259844, false);
                }
                o0VarE.C(-1437239735);
                f12.l.f68084a.getClass();
                d.b(yz1.e.b(dVar), (tt0.e.b) eVar, f12.l.a.a().g(), o0VarE, 0);
                o0VarE.g0(false);
            }
            o0VarE.g0(true);
        } else {
            rVar2 = rVar;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new vx1.b(rVar2, bVar, aVar, i14, 18);
        }
    }
}
