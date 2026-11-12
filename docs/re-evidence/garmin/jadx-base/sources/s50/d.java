package s50;

import am.j;
import c2.b0;
import c2.x2;
import c2.y;
import c2.z;
import e23.l;
import f5.g0;
import g6.m;
import h4.g;
import h4.k;
import h4.r;
import h5.e0;
import l72.w;
import o4.m1;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import p40.c0;
import rx1.u;
import v.h;

/* JADX INFO: loaded from: classes8.dex */
public final class d {
    /* JADX WARN: Code duplicated, block: B:39:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:47:0x010c  */
    public static final void a(t50.d dVar, l<? super t50.b, Unit> lVar, l<? super m, Unit> lVar2, p3.m mVar, int i14) {
        l<? super m, Unit> lVar3;
        lVar.getClass();
        lVar2.getClass();
        o0 o0VarE = mVar.E(1718650015);
        int i15 = i14 | (o0VarE.B(dVar) ? 4 : 2) | (o0VarE.r(lVar) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            r rVarE = u1.n.e(x2.f(r.S, 1.0f), j.c(d92.b.f58623a, o0VarE), m1.f128891a);
            Object objQ = o0VarE.q();
            p3.m.a aVar = p3.m.f135153a;
            aVar.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                lVar3 = lVar2;
                objQ = new qe2.c(lVar3, 20);
                o0VarE.K(objQ);
            } else {
                lVar3 = lVar2;
            }
            r rVarF = g0.f(rVarE, (l) objQ);
            h4.d.f81522a.getClass();
            g.a aVar2 = h4.d.a.f81537o;
            c2.j.f22691a.getClass();
            z zVarA = y.a(c2.j.f22694d, aVar2, o0VarE, 48);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = k.c(rVarF, o0VarE);
            h5.g.V.getClass();
            e0.a aVar3 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            w.f111301a.b(o0VarE, 0);
            boolean z14 = dVar.f162537a;
            int i16 = i15 & 112;
            boolean z15 = i16 == 32;
            Object objQ2 = o0VarE.q();
            if (z15) {
                objQ2 = new qe2.c(lVar, 21);
                o0VarE.K(objQ2);
            } else {
                aVar.getClass();
                if (objQ2 == c2565a) {
                    objQ2 = new qe2.c(lVar, 21);
                    o0VarE.K(objQ2);
                }
            }
            l lVar4 = (l) objQ2;
            boolean z16 = i16 == 32;
            Object objQ3 = o0VarE.q();
            if (z16) {
                objQ3 = new me2.d(lVar, 27);
                o0VarE.K(objQ3);
            } else {
                aVar.getClass();
                if (objQ3 == c2565a) {
                    objQ3 = new me2.d(lVar, 27);
                    o0VarE.K(objQ3);
                }
            }
            c0.a(z14, lVar4, (e23.a) objQ3, dVar.f162538b, dVar.f162539c, dVar.f162540d, o0VarE, 0);
            o0VarE.g0(true);
        } else {
            lVar3 = lVar2;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new u((Object) dVar, (l) lVar, (o13.h) lVar3, i14, 5);
        }
    }
}
