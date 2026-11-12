package d82;

import as.s;
import c2.b0;
import c2.j;
import c2.l;
import c2.q;
import c2.q2;
import c2.s2;
import c2.t0;
import c2.u;
import c2.u2;
import c2.x2;
import c2.y;
import c2.z;
import e23.p;
import f5.z0;
import h4.r;
import h5.e0;
import h5.g;
import i3.mh;
import j92.e;
import j92.f;
import k2.i;
import l4.k;
import l72.v2;
import o4.m1;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import s5.x0;
import v.h;

/* JADX INFO: loaded from: classes9.dex */
public final class d {
    public static final void a(final String str, final i53.c<a> cVar, b92.a aVar, m mVar, final int i14, final int i15) {
        int i16;
        b92.a aVar2;
        int i17;
        i53.c<a> cVar2;
        final b92.a aVar3;
        p2 p2VarI0;
        p<? super m, ? super Integer, Unit> pVar;
        cVar.getClass();
        o0 o0VarE = mVar.E(-466028203);
        if ((i14 & 6) == 0) {
            i16 = i14 | (o0VarE.B(str) ? 4 : 2);
        } else {
            i16 = i14;
        }
        int i18 = i16 | (o0VarE.B(cVar) ? 32 : 16);
        int i19 = i15 & 4;
        if (i19 != 0) {
            i17 = i18 | 384;
            aVar2 = aVar;
        } else {
            aVar2 = aVar;
            i17 = i18 | (o0VarE.B(aVar2) ? 256 : 128);
        }
        if (o0VarE.n(i17 & 1, (i17 & 147) != 146)) {
            final b92.a aVar4 = i19 != 0 ? null : aVar2;
            x1 x1Var = n.f135158a;
            if (cVar.isEmpty()) {
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 == null) {
                    return;
                }
                final int i24 = 0;
                pVar = new p() { // from class: d82.b
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        switch (i24) {
                            case 0:
                                ((Integer) obj2).getClass();
                                d.a(str, cVar, aVar4, (m) obj, p0.t(i14 | 1), i15);
                                break;
                            default:
                                ((Integer) obj2).getClass();
                                d.a(str, cVar, aVar4, (m) obj, p0.t(i14 | 1), i15);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
            } else {
                b92.a aVar5 = aVar4;
                String str2 = aVar5 != null ? aVar5.f16961a.get("merge") : null;
                r.a aVar6 = r.S;
                d92.b.f58623a.getClass();
                j92.b bVar = d92.b.f58625c;
                bVar.getClass();
                r rVarE = u1.n.e(k.b(aVar6, i.a(j92.b.f97900c.f97911c)), d92.b.a(o0VarE).c().g(), m1.f128891a);
                bVar.getClass();
                e eVar = j92.b.f97899b;
                float f14 = eVar.f97918c;
                float f15 = eVar.f97917b;
                r rVarA = v2.a(l.y(rVarE, f14), str2 != null, new s(str2, 10), o0VarE, 0);
                j.f22691a.getClass();
                j.k kVar = j.f22694d;
                h4.d.f81522a.getClass();
                z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
                int iHashCode = Long.hashCode(o0VarE.U);
                i2 i2VarA0 = o0VarE.a0();
                r rVarC = h4.k.c(rVarA, o0VarE);
                g.V.getClass();
                e0.a aVar7 = g.a.f81805b;
                if (o0VarE.f135177b == null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar7);
                } else {
                    o0VarE.c();
                }
                b4.c(g.a.f81810g, zVarA, o0VarE);
                b4.c(g.a.f81809f, i2VarA0, o0VarE);
                g.a.b bVar2 = g.a.f81813j;
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    h.A(iHashCode, o0VarE, iHashCode, bVar2);
                }
                b4.c(g.a.f81807d, rVarC, o0VarE);
                b0 b0Var = b0.f22601a;
                d92.b.f58624b.getClass();
                mh.c(str, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(d92.c.e(f.f97935l), o0VarE), o0VarE, i17 & 14, 0, 131070);
                o0VarE = o0VarE;
                bVar.getClass();
                l.f(x2.q(aVar6, f15), o0VarE);
                bVar.getClass();
                j.i iVarI = j.i(eVar.f97920e);
                bVar.getClass();
                j.i iVarI2 = j.i(f15);
                cVar2 = cVar;
                t0.a(null, iVarI, iVarI2, null, 3, 0, z3.f.c(1014274010, new c(cVar2, 0), o0VarE), o0VarE, 1597440, 41);
                o0VarE.g0(true);
                aVar3 = aVar5;
            }
            p2VarI0.f135219d = pVar;
        }
        cVar2 = cVar;
        o0VarE.e();
        aVar3 = aVar2;
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            final int i25 = 1;
            final i53.c<a> cVar3 = cVar2;
            pVar = new p() { // from class: d82.b
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    switch (i25) {
                        case 0:
                            ((Integer) obj2).getClass();
                            d.a(str, cVar3, aVar3, (m) obj, p0.t(i14 | 1), i15);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            d.a(str, cVar3, aVar3, (m) obj, p0.t(i14 | 1), i15);
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            p2VarI0.f135219d = pVar;
        }
    }

    public static final void b(a aVar, m mVar, int i14) {
        o0 o0Var;
        u2 u2Var;
        g.a.e eVar;
        g.a.b bVar;
        o0 o0VarE = mVar.E(-1947624950);
        p3.c<?> cVar = o0VarE.f135177b;
        int i15 = i14 | (o0VarE.B(aVar) ? 4 : 2);
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            r.a aVar2 = r.S;
            j.f22691a.getClass();
            j.C0343j c0343j = j.f22692b;
            h4.d.f81522a.getClass();
            h4.g.b bVar2 = h4.d.a.f81533k;
            s2 s2VarA = q2.a(c0343j, bVar2, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = h4.k.c(aVar2, o0VarE);
            g.V.getClass();
            e0.a aVar3 = g.a.f81805b;
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            g.a.e eVar2 = g.a.f81810g;
            b4.c(eVar2, s2VarA, o0VarE);
            g.a.C1623g c1623g = g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            g.a.b bVar3 = g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                h.A(iHashCode, o0VarE, iHashCode, bVar3);
            }
            g.a.f fVar = g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            u2 u2Var2 = u2.f22900a;
            if (aVar.f58377c instanceof j82.g.i) {
                u2Var = u2Var2;
                eVar = eVar2;
                o0VarE.C(-901472268);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-901713479);
                d92.b.f58623a.getClass();
                j92.b bVar4 = d92.b.f58625c;
                bVar4.getClass();
                e eVar3 = j92.b.f97899b;
                float f14 = eVar3.f97917b;
                bVar4.getClass();
                u2Var = u2Var2;
                r rVarC2 = l.C(aVar2, 0.0f, f14, eVar3.f97917b, 0.0f, 9);
                z0 z0VarD = q.d(h4.d.a.f81524b, false);
                int iHashCode2 = Long.hashCode(o0VarE.U);
                i2 i2VarA1 = o0VarE.a0();
                r rVarC3 = h4.k.c(rVarC2, o0VarE);
                if (cVar == null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar3);
                } else {
                    o0VarE.c();
                }
                eVar = eVar2;
                b4.c(eVar, z0VarD, o0VarE);
                b4.c(c1623g, i2VarA1, o0VarE);
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                    bVar3 = bVar3;
                    h.A(iHashCode2, o0VarE, iHashCode2, bVar3);
                } else {
                    bVar3 = bVar3;
                }
                b4.c(fVar, rVarC3, o0VarE);
                u uVar = u.f22885a;
                bVar4.getClass();
                j82.e.n(aVar.f58377c, j92.b.f97901d.f97902a, o0VarE, 0, 0);
                o0VarE.g0(true);
                o0VarE.g0(false);
            }
            z zVarA = y.a(j.f22694d, h4.d.a.f81536n, o0VarE, 0);
            g.a.b bVar5 = bVar3;
            int iHashCode3 = Long.hashCode(o0VarE.U);
            i2 i2VarA2 = o0VarE.a0();
            r rVarC4 = h4.k.c(aVar2, o0VarE);
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            b4.c(eVar, zVarA, o0VarE);
            b4.c(c1623g, i2VarA2, o0VarE);
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode3))) {
                bVar = bVar5;
                h.A(iHashCode3, o0VarE, iHashCode3, bVar);
            } else {
                bVar = bVar5;
            }
            b4.c(fVar, rVarC4, o0VarE);
            b0 b0Var = b0.f22601a;
            s2 s2VarA2 = q2.a(c0343j, bVar2, o0VarE, 0);
            int iHashCode4 = Long.hashCode(o0VarE.U);
            i2 i2VarA3 = o0VarE.a0();
            r rVarC5 = h4.k.c(aVar2, o0VarE);
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            b4.c(eVar, s2VarA2, o0VarE);
            b4.c(c1623g, i2VarA3, o0VarE);
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode4))) {
                h.A(iHashCode4, o0VarE, iHashCode4, bVar);
            }
            b4.c(fVar, rVarC5, o0VarE);
            String str = aVar.f58376b;
            d92.b.f58623a.getClass();
            f fVar2 = d92.b.f58624b;
            fVar2.getClass();
            x0 x0VarB = d92.c.b(f.f97932i, o0VarE);
            u2Var.getClass();
            f5.p pVar = f5.b.f68892a;
            u2 u2Var3 = u2Var;
            mh.c(str, u2Var3.d(aVar2, pVar), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, o0VarE, 0, 0, 131068);
            o0 o0Var2 = o0VarE;
            if (aVar.f58378d == null) {
                o0Var2.C(1059993953);
                o0Var2.g0(false);
            } else {
                o0Var2.C(1059993954);
                String str2 = aVar.f58378d;
                fVar2.getClass();
                x0 x0VarB2 = d92.c.b(f.f97935l, o0Var2);
                d92.b.f58625c.getClass();
                mh.c(str2, u2Var3.d(l.C(aVar2, j92.b.f97899b.f97917b, 0.0f, 0.0f, 0.0f, 14), pVar), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB2, o0Var2, 0, 0, 131068);
                o0Var2 = o0Var2;
                Unit unit = Unit.INSTANCE;
                o0Var2.g0(false);
            }
            o0Var2.g0(true);
            String str3 = aVar.f58375a;
            fVar2.getClass();
            o0 o0Var3 = o0Var2;
            mh.c(str3, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(f.f97935l, o0Var2), o0Var3, 0, 0, 131070);
            o0Var = o0Var3;
            o0Var.g0(true);
            o0Var.g0(true);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new c62.m1(aVar, i14, 28);
        }
    }
}
