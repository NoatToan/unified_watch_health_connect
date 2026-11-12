package lb0;

import c2.j;
import c2.q2;
import c2.s2;
import c2.u2;
import e23.l;
import h4.k;
import h4.r;
import h5.e0;
import java.util.Iterator;
import java.util.List;
import l30.i0;
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
import v.h;

/* JADX INFO: loaded from: classes8.dex */
public final class c {
    /* JADX WARN: Code duplicated, block: B:42:0x00e1  */
    public static final void a(int i14, l lVar, r rVar, List list, m mVar) {
        list.getClass();
        lVar.getClass();
        o0 o0VarE = mVar.E(127265825);
        int i15 = (o0VarE.r(list) ? 4 : 2) | i14 | (o0VarE.r(lVar) ? 32 : 16) | (o0VarE.B(rVar) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            r rVarB = a2.b(rVar, a2.a(o0VarE), false);
            j.f22691a.getClass();
            j.g gVar = j.f22698h;
            h4.d.f81522a.getClass();
            s2 s2VarA = q2.a(gVar, h4.d.a.f81533k, o0VarE, 6);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = k.c(rVarB, o0VarE);
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
            b4.c(h5.g.a.f81810g, s2VarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            u2 u2Var = u2.f22900a;
            o0VarE.C(-2141821180);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                mb0.b bVar2 = (mb0.b) it.next();
                boolean zB = ((i15 & 112) == 32) | o0VarE.B(bVar2);
                Object objQ = o0VarE.q();
                if (zB) {
                    objQ = new i0(7, lVar, bVar2);
                    o0VarE.K(objQ);
                } else {
                    m.f135153a.getClass();
                    if (objQ == m.a.f135155b) {
                        objQ = new i0(7, lVar, bVar2);
                        o0VarE.K(objQ);
                    }
                }
                b.a(bVar2, (e23.a) objQ, null, o0VarE, 0);
            }
            o0VarE.g0(false);
            o0VarE.g0(true);
            x1 x1Var2 = n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a(list, lVar, rVar, i14, 1);
        }
    }
}
