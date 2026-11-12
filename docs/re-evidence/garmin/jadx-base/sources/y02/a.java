package y02;

import a2.j;
import c2.q;
import c2.u;
import e23.p;
import f5.z0;
import h4.d;
import h4.r;
import h5.e0;
import h5.g;
import i3.e5;
import i3.fb;
import k2.i;
import kg.f;
import l4.k;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import u1.w;
import v.h;
import xk1.e;

/* JADX INFO: loaded from: classes10.dex */
public final class a {
    public static final void a(e23.a aVar, r rVar, p pVar, m mVar, int i14) {
        r rVar2;
        aVar.getClass();
        pVar.getClass();
        o0 o0VarE = mVar.E(594210623);
        int i15 = i14 | (o0VarE.r(aVar) ? 4 : 2) | 48;
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            r.a aVar2 = r.S;
            x1 x1Var = n.f135158a;
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            if (objQ == m.a.f135155b) {
                objQ = f.b(o0VarE);
            }
            g6.f.a aVar3 = g6.f.f75994b;
            r rVarB = w.b(k.b(aVar2, i.a(4)), (j) objQ, fb.a(0.0f, 6, 0L, true), false, null, null, aVar, 28);
            d.f81522a.getClass();
            z0 z0VarD = q.d(d.a.f81524b, false);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = h4.k.c(rVarB, o0VarE);
            g.V.getClass();
            e0.a aVar4 = g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar4);
            } else {
                o0VarE.c();
            }
            b4.c(g.a.f81810g, z0VarD, o0VarE);
            b4.c(g.a.f81809f, i2VarA0, o0VarE);
            g.a.b bVar = g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(g.a.f81807d, rVarC, o0VarE);
            u uVar = u.f22885a;
            e5.q(6, pVar, o0VarE, true);
            rVar2 = aVar2;
        } else {
            o0VarE.e();
            rVar2 = rVar;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e(aVar, rVar2, pVar, i14, 4);
        }
    }
}
