package s70;

import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p2;

/* JADX INFO: loaded from: classes8.dex */
public final class l1 {
    public static final void a(List<? extends r70.s> list, boolean z14, r70.q qVar, p3.m mVar, int i14) {
        float F;
        boolean z15;
        long jE;
        list.getClass();
        p3.o0 o0VarE = mVar.E(763959048);
        p3.c<?> cVar = o0VarE.f135177b;
        int i15 = (i14 & 6) == 0 ? (o0VarE.r(list) ? 4 : 2) | i14 : i14;
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.h(z14) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(qVar) ? 256 : 128;
        }
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            p3.x1 x1Var = p3.n.f135158a;
            float f75992b = ((g6.c) o0VarE.A(kotlin.t1.f91490h)).getF75992b();
            float fH = yz1.y.h(f75992b);
            float f14 = 1.0f;
            float f15 = f75992b <= 1.5f ? 0.5f : 1.0f;
            if (z14) {
                o0VarE.C(-274752385);
                F = jg.b.F(o0VarE);
                o0VarE.g0(false);
            } else {
                o0VarE.C(1137991990);
                o0VarE.g0(false);
                F = 1.0f;
            }
            double d14 = f75992b;
            int i16 = d14 > 1.5d ? 1 : 2;
            for (List list2 : p13.h0.i1(list, i16, i16, true)) {
                c2.j jVar = c2.j.f22691a;
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                float f16 = j92.b.f97899b.f97918c;
                jVar.getClass();
                c2.j.i iVarI = c2.j.i(f16);
                h4.r rVarX = x2.x(x2.f(h4.r.S, f14), null, 3);
                h4.d.f81522a.getClass();
                s2 s2VarA = q2.a(iVarI, h4.d.a.f81533k, o0VarE, 0);
                p3.x1 x1Var2 = p3.n.f135158a;
                p3.c<?> cVar2 = cVar;
                int iHashCode = Long.hashCode(o0VarE.U);
                i2 i2VarA0 = o0VarE.a0();
                h4.r rVarC = h4.k.c(rVarX, o0VarE);
                h5.g.V.getClass();
                h5.e0.a aVar = h5.g.a.f81805b;
                if (cVar2 == null) {
                    p3.p0.l();
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
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                }
                b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                u2 u2Var = u2.f22900a;
                o0VarE.C(-1796192707);
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    r70.s sVar = (r70.s) it.next();
                    h4.r.a aVar2 = h4.r.S;
                    h4.r rVarH = x2.h(u2Var.a(aVar2, f15, true), fH);
                    h4.d.f81522a.getClass();
                    Iterator it3 = it;
                    f5.z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
                    p3.x1 x1Var3 = p3.n.f135158a;
                    int i17 = i15;
                    double d15 = d14;
                    int iHashCode2 = Long.hashCode(o0VarE.U);
                    i2 i2VarA1 = o0VarE.a0();
                    h4.r rVarC2 = h4.k.c(rVarH, o0VarE);
                    h5.g.V.getClass();
                    h5.e0.a aVar3 = h5.g.a.f81805b;
                    if (cVar2 == null) {
                        p3.p0.l();
                        throw null;
                    }
                    o0VarE.z();
                    if (o0VarE.T) {
                        o0VarE.M(aVar3);
                    } else {
                        o0VarE.c();
                    }
                    b4.c(h5.g.a.f81810g, z0VarD, o0VarE);
                    b4.c(h5.g.a.f81809f, i2VarA1, o0VarE);
                    h5.g.a.b bVar2 = h5.g.a.f81813j;
                    if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                        v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
                    }
                    b4.c(h5.g.a.f81807d, rVarC2, o0VarE);
                    c2.u uVar = c2.u.f22885a;
                    if (z14) {
                        o0VarE.C(-2013100390);
                        a02.h.a(x2.d(aVar2, 1.0f), F, o0VarE, 6);
                        o0VarE.g0(false);
                        Unit unit = Unit.INSTANCE;
                    } else {
                        o0VarE.C(-2012856668);
                        r70.r rVarA = m70.f.a(sVar);
                        if (rVarA == null) {
                            o0VarE.C(-2012856669);
                            o0VarE.g0(false);
                        } else {
                            o0VarE.C(-1866046178);
                            rVarA.a(x2.d(aVar2, 1.0f), qVar, o0VarE, 6 | ((i17 >> 3) & 112));
                            o0VarE.g0(false);
                            Unit unit2 = Unit.INSTANCE;
                        }
                        o0VarE.g0(false);
                    }
                    o0VarE.g0(true);
                    it = it3;
                    d14 = d15;
                    i15 = i17;
                }
                int i18 = i15;
                double d16 = d14;
                o0VarE.g0(false);
                if (d16 > 4609434218613702656 || list2.size() != 1) {
                    z15 = false;
                    o0VarE.C(154082547);
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(153401198);
                    h4.r rVarH2 = x2.h(u2Var.a(h4.r.S, f15, true), fH);
                    if (z14) {
                        o0VarE.C(153686057);
                        d92.b.f58623a.getClass();
                        jE = o4.d0.c(F, d92.b.a(o0VarE).c().f(), 14);
                        z15 = false;
                        o0VarE.g0(false);
                    } else {
                        z15 = false;
                        o0VarE.C(153828068);
                        d92.b.f58623a.getClass();
                        jE = d92.b.a(o0VarE).c().e();
                        o0VarE.g0(false);
                    }
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    c2.q.a(u1.n.e(rVarH2, jE, k2.i.a(j92.b.f97899b.f97918c)), o0VarE, z15 ? 1 : 0);
                    o0VarE.g0(z15);
                }
                o0VarE.g0(true);
                cVar = cVar2;
                d14 = d16;
                f14 = 1.0f;
                i15 = i18;
            }
            p3.x1 x1Var4 = p3.n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new n0(list, z14, qVar, i14, 1);
        }
    }
}
