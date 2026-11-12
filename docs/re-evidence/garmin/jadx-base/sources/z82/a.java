package z82;

import c2.b0;
import c2.j;
import c2.l;
import c2.x2;
import c2.y;
import c2.z;
import d92.b;
import e23.p;
import h4.d;
import h4.k;
import h4.r;
import h5.e0;
import h5.g;
import i3.e5;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import v.h;
import z3.e;

/* JADX INFO: loaded from: classes9.dex */
public final class a {
    public static final void a(r rVar, p pVar, e eVar, p pVar2, m mVar, int i14) {
        o0 o0VarE = mVar.E(-939601860);
        int i15 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            j.f22691a.getClass();
            j.k kVar = j.f22694d;
            d.f81522a.getClass();
            z zVarA = y.a(kVar, d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = k.c(rVar, o0VarE);
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
                h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            if (pVar != null) {
                o0VarE.C(-2144699224);
                pVar.invoke(o0VarE, 6);
                r.a aVar2 = r.S;
                b.f58623a.getClass();
                b.f58625c.getClass();
                e5.t(aVar2, j92.b.f97899b.f97918c, o0VarE, false);
            } else {
                o0VarE.C(-2144587748);
                o0VarE.g0(false);
            }
            eVar.invoke(o0VarE, 6);
            if (pVar2 != null) {
                o0VarE.C(-2144516665);
                r.a aVar3 = r.S;
                b.f58623a.getClass();
                b.f58625c.getClass();
                l.f(x2.h(aVar3, j92.b.f97899b.f97917b), o0VarE);
                pVar2.invoke(o0VarE, 6);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-2144404228);
                o0VarE.g0(false);
            }
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new xr.n(rVar, pVar, eVar, pVar2, i14, 19);
        }
    }
}
