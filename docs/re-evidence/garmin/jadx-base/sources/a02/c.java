package a02;

import c2.b0;
import c2.j;
import c2.l;
import c2.q;
import c2.x2;
import c2.y;
import c2.z;
import h4.r;
import h5.e0;
import o4.d0;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import yz1.k;

/* JADX INFO: loaded from: classes10.dex */
public final class c {
    /* JADX WARN: Code duplicated, block: B:27:0x0111  */
    public static final void a(r rVar, float f14, m mVar, int i14) {
        rVar.getClass();
        o0 o0VarE = mVar.E(2145297538);
        int i15 = (o0VarE.i(f14) ? 32 : 16) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            float fE = k.e(o0VarE);
            d92.b.f58623a.getClass();
            long jC = d0.c(f14, d92.b.a(o0VarE).c().a(), 14);
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            r rVarE = u1.n.e(rVar, jC, k2.i.a(j92.b.f97900c.f97911c));
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            float f15 = eVar.f97919d;
            bVar.getClass();
            r rVarZ = l.z(rVarE, eVar.f97917b, f15);
            j.f22691a.getClass();
            j.k kVar = j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = h4.k.c(rVarZ, o0VarE);
            h5.g.V.getClass();
            e0.a aVar = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
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
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            long jC2 = d0.c(f14, d92.b.a(o0VarE).c().g(), 14);
            r.a aVar2 = r.S;
            q.a(b0Var.b(u1.n.e(x2.q(aVar2, fE), jC2, k2.i.f102406a), h4.d.a.f81537o), o0VarE, 0);
            bVar.getClass();
            l.f(x2.h(aVar2, eVar.f97918c), o0VarE);
            r rVarD = x2.d(rVar, 1.0f);
            boolean zL = o0VarE.l(jC2);
            Object objQ = o0VarE.q();
            if (zL) {
                objQ = new a(jC2, 0);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new a(jC2, 0);
                    o0VarE.K(objQ);
                }
            }
            u1.n.b(rVarD, (e23.l) objQ, o0VarE, 0);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new b(rVar, f14, i14, 0);
        }
    }
}
