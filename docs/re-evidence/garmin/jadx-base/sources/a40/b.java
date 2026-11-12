package a40;

import a03.t0;
import c2.b0;
import c2.j;
import c2.x2;
import c2.y;
import c2.z;
import e23.l;
import e50.f;
import h4.k;
import h4.r;
import h5.e0;
import h5.g;
import n50.c;
import n50.d;
import o4.m1;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import u1.a2;
import vb.h;

/* JADX INFO: loaded from: classes8.dex */
public final class b {
    /* JADX WARN: Code duplicated, block: B:35:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:44:0x00f5  */
    public static final void a(d dVar, l<? super c, Unit> lVar, m mVar, int i14) {
        lVar.getClass();
        o0 o0VarE = mVar.E(2041595748);
        int i15 = (o0VarE.B(dVar) ? 4 : 2) | i14 | (o0VarE.r(lVar) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            r rVarE = u1.n.e(x2.d(r.S, 1.0f), h.f(d92.b.f58623a, o0VarE), m1.f128891a);
            d92.b.f58625c.getClass();
            r rVarB = a2.b(c2.l.A(rVarE, 0.0f, j92.b.f97899b.f97920e, 1), a2.a(o0VarE), true);
            j.f22691a.getClass();
            j.k kVar = j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = k.c(rVarB, o0VarE);
            g.V.getClass();
            e0.a aVar = g.a.f81805b;
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
            b4.c(g.a.f81810g, zVarA, o0VarE);
            b4.c(g.a.f81809f, i2VarA0, o0VarE);
            g.a.b bVar = g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            f fVar = dVar.f123743b;
            int i16 = i15 & 112;
            boolean z14 = i16 == 32;
            Object objQ = o0VarE.q();
            m.a aVar2 = m.f135153a;
            if (z14) {
                objQ = new a(lVar, 0);
                o0VarE.K(objQ);
            } else {
                aVar2.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new a(lVar, 0);
                    o0VarE.K(objQ);
                }
            }
            e23.a aVar3 = (e23.a) objQ;
            boolean z15 = i16 == 32;
            Object objQ2 = o0VarE.q();
            if (z15) {
                objQ2 = new a12.a(lVar, 1);
                o0VarE.K(objQ2);
            } else {
                aVar2.getClass();
                if (objQ2 == m.a.f135155b) {
                    objQ2 = new a12.a(lVar, 1);
                    o0VarE.K(objQ2);
                }
            }
            b40.c.a(fVar, aVar3, (l) objQ2, o0VarE, 0);
            c40.h.a(dVar.f123742a, o0VarE, 0);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new t0(dVar, lVar, i14, 1);
        }
    }
}
