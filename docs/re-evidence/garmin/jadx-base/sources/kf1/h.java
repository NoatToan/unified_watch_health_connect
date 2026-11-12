package kf1;

import c2.b0;
import c2.l;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import f5.p;
import h4.r;
import h5.e0;
import i3.i7;
import i3.mh;
import l4.k;
import m92.y;
import o4.m1;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import s5.x0;
import u1.q;

/* JADX INFO: loaded from: classes9.dex */
public final class h {
    public static final void a(e eVar, o82.g gVar, boolean z14, boolean z15, m mVar, int i14) {
        int i15;
        o82.g gVar2;
        long jA;
        r rVarE;
        r rVarQ;
        t4.d dVarA;
        r rVarQ2;
        eVar.getClass();
        gVar.getClass();
        o0 o0VarE = mVar.E(1757838687);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.k(eVar.ordinal()) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.k(gVar.ordinal()) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.h(z14) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.h(z15) ? 2048 : 1024;
        }
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            if (eVar == e.TOLERANCE) {
                o0VarE.C(-763686929);
                if (z15) {
                    r.a aVar = r.S;
                    d92.b.f58623a.getClass();
                    j92.b bVar = d92.b.f58625c;
                    bVar.getClass();
                    j92.e eVar2 = j92.b.f97899b;
                    float f14 = eVar2.f97917b;
                    bVar.getClass();
                    r rVarC = l.C(aVar, 0.0f, f14, eVar2.f97917b, 0.0f, 9);
                    bVar.getClass();
                    rVarQ2 = x2.q(rVarC, j92.b.f97901d.f97902a);
                } else {
                    r.a aVar2 = r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    rVarQ2 = x2.q(aVar2, j92.b.f97901d.f97903b);
                }
                r rVar = rVarQ2;
                t4.d dVarA2 = n5.c.a(R.drawable.ic_dash, o0VarE, 0);
                gl.c.f77766a.getClass();
                i7.a(dVarA2, null, rVar, gl.c.a(o0VarE).f(), o0VarE, 48, 0);
                o0VarE.g0(false);
                gVar2 = gVar;
            } else if (z14 && eVar == e.REAL_DISTANCE) {
                o0VarE.C(-763124031);
                if (z15) {
                    r.a aVar3 = r.S;
                    d92.b.f58623a.getClass();
                    j92.b bVar2 = d92.b.f58625c;
                    bVar2.getClass();
                    j92.e eVar3 = j92.b.f97899b;
                    float f15 = eVar3.f97917b;
                    bVar2.getClass();
                    r rVarC2 = l.C(aVar3, 0.0f, f15, eVar3.f97917b, 0.0f, 9);
                    bVar2.getClass();
                    rVarQ = x2.q(rVarC2, j92.b.f97901d.f97902a);
                } else {
                    r.a aVar4 = r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    rVarQ = x2.q(aVar4, j92.b.f97901d.f97903b);
                }
                r rVar2 = rVarQ;
                gVar2 = gVar;
                if (gVar2 == o82.g.f130856i) {
                    o0VarE.C(-762765733);
                    dVarA = n5.c.a(R.drawable.ic_dash, o0VarE, 0);
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(-762687954);
                    dVarA = n5.c.a(R.drawable.ic_legend_real_miles, o0VarE, 0);
                    o0VarE.g0(false);
                }
                t4.d dVar = dVarA;
                gl.c.f77766a.getClass();
                i7.a(dVar, null, rVar2, gl.c.a(o0VarE).n(), o0VarE, 48, 0);
                o0VarE.g0(false);
            } else {
                gVar2 = gVar;
                o0VarE.C(-762462677);
                if (z15) {
                    o0VarE.C(-762419587);
                    if (z14) {
                        o0VarE.C(-762390974);
                        r.a aVar5 = r.S;
                        d92.b.f58623a.getClass();
                        j92.b bVar3 = d92.b.f58625c;
                        bVar3.getClass();
                        j92.e eVar4 = j92.b.f97899b;
                        float f16 = eVar4.f97917b;
                        bVar3.getClass();
                        r rVarC3 = l.C(aVar5, 0.0f, f16, eVar4.f97917b, 0.0f, 9);
                        bVar3.getClass();
                        r rVarQ3 = x2.q(rVarC3, j92.b.f97901d.f97902a);
                        g6.f.a aVar6 = g6.f.f75994b;
                        gl.c.f77766a.getClass();
                        long jF = gl.c.a(o0VarE).f();
                        k2.h hVar = k2.i.f102406a;
                        rVarE = u1.n.e(k.b(q.b(1, jF, rVarQ3, hVar), hVar), f.b(eVar, o0VarE), m1.f128891a);
                        o0VarE.g0(false);
                    } else {
                        o0VarE.C(-762005830);
                        r.a aVar7 = r.S;
                        d92.b.f58623a.getClass();
                        j92.b bVar4 = d92.b.f58625c;
                        bVar4.getClass();
                        j92.e eVar5 = j92.b.f97899b;
                        float f17 = eVar5.f97917b;
                        bVar4.getClass();
                        r rVarC4 = l.C(aVar7, 0.0f, f17, eVar5.f97917b, 0.0f, 9);
                        bVar4.getClass();
                        rVarE = u1.n.e(k.b(x2.q(rVarC4, j92.b.f97901d.f97902a), k2.i.f102406a), f.a(eVar, o0VarE), m1.f128891a);
                        o0VarE.g0(false);
                    }
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(-761693443);
                    r.a aVar8 = r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    r rVarB = k.b(x2.q(aVar8, j92.b.f97899b.f97920e), k2.i.f102406a);
                    if (z14) {
                        o0VarE.C(1360908076);
                        jA = f.b(eVar, o0VarE);
                    } else {
                        o0VarE.C(1360908905);
                        jA = f.a(eVar, o0VarE);
                    }
                    o0VarE.g0(false);
                    rVarE = u1.n.e(rVarB, jA, m1.f128891a);
                    o0VarE.g0(false);
                }
                c2.q.a(rVarE, o0VarE, 0);
                o0VarE.g0(false);
            }
        } else {
            gVar2 = gVar;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ct1.a(eVar, gVar2, z14, z15, i14);
        }
    }

    public static final void b(o82.g gVar, boolean z14, if1.c cVar, of1.a aVar, m mVar, int i14) {
        Float f14;
        Float f15;
        gVar.getClass();
        aVar.getClass();
        o0 o0VarE = mVar.E(1898613843);
        int i15 = (o0VarE.k(gVar.ordinal()) ? 4 : 2) | i14 | (o0VarE.h(z14) ? 32 : 16) | (o0VarE.r(cVar) ? 256 : 128) | (o0VarE.r(aVar) ? 2048 : 1024);
        boolean z15 = true;
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            String strC = aVar.c(cVar.f93210a, cVar.f93211b);
            Integer num = cVar.f93215f;
            if ((num == null || num.intValue() <= 0) && (((f14 = cVar.f93213d) == null || f14.floatValue() <= 0.0f) && (!z14 || (f15 = cVar.f93214e) == null || f15.floatValue() <= 0.0f))) {
                z15 = false;
            }
            if (strC.equals("--") || !z15) {
                o0VarE.C(1184042639);
                o0VarE.g0(false);
            } else {
                o0VarE.C(1181348956);
                y.a(strC, z3.f.c(531581289, new g(cVar, aVar, gVar, z14), o0VarE), o0VarE, 384);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new g(gVar, z14, cVar, aVar, i14);
        }
    }

    public static final void c(String str, String str2, String str3, e eVar, o82.g gVar, boolean z14, m mVar, int i14) {
        str.getClass();
        str3.getClass();
        eVar.getClass();
        gVar.getClass();
        o0 o0VarE = mVar.E(1981102103);
        p3.c<?> cVar = o0VarE.f135177b;
        int i15 = (o0VarE.B(str) ? 4 : 2) | i14 | (o0VarE.B(str2) ? 32 : 16) | (o0VarE.B(str3) ? 256 : 128);
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.k(eVar.ordinal()) ? 2048 : 1024;
        }
        int i16 = i15 | (o0VarE.k(gVar.ordinal()) ? 16384 : 8192);
        if ((196608 & i14) == 0) {
            i16 |= o0VarE.h(z14) ? 131072 : 65536;
        }
        int i17 = i16;
        if (o0VarE.n(i17 & 1, (i17 & 74899) != 74898)) {
            x1 x1Var = n.f135158a;
            r.a aVar = r.S;
            c2.j.f22691a.getClass();
            c2.j.C0343j c0343j = c2.j.f22692b;
            h4.d.f81522a.getClass();
            h4.g.b bVar = h4.d.a.f81533k;
            s2 s2VarA = q2.a(c0343j, bVar, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = h4.k.c(aVar, o0VarE);
            h5.g.V.getClass();
            e0.a aVar2 = h5.g.a.f81805b;
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar2 = h5.g.a.f81810g;
            b4.c(eVar2, s2VarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            u2 u2Var = u2.f22900a;
            int i18 = i17 >> 9;
            a(eVar, gVar, z14, true, o0VarE, (i18 & 14) | 3072 | (i18 & 112) | (i18 & 896));
            z zVarA = c2.y.a(c2.j.f22694d, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            r rVarC2 = h4.k.c(aVar, o0VarE);
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(eVar2, zVarA, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
            }
            b4.c(fVar, rVarC2, o0VarE);
            b0 b0Var = b0.f22601a;
            s2 s2VarA2 = q2.a(c0343j, bVar, o0VarE, 0);
            int iHashCode3 = Long.hashCode(o0VarE.U);
            i2 i2VarA2 = o0VarE.a0();
            r rVarC3 = h4.k.c(aVar, o0VarE);
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(eVar2, s2VarA2, o0VarE);
            b4.c(c1623g, i2VarA2, o0VarE);
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode3))) {
                v.h.A(iHashCode3, o0VarE, iHashCode3, bVar2);
            }
            b4.c(fVar, rVarC3, o0VarE);
            d92.b.f58623a.getClass();
            j92.f fVar2 = d92.b.f58624b;
            fVar2.getClass();
            x0 x0VarB = d92.c.b(j92.f.f97932i, o0VarE);
            u2Var.getClass();
            p pVar = f5.b.f68892a;
            mh.c(str, u2Var.d(aVar, pVar), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, o0VarE, i17 & 14, 0, 131068);
            o0 o0Var = o0VarE;
            if (str2 != null) {
                o0Var.C(1490735303);
                fVar2.getClass();
                x0 x0VarB2 = d92.c.b(j92.f.f97935l, o0Var);
                d92.b.f58625c.getClass();
                mh.c(str2, u2Var.d(l.C(aVar, j92.b.f97899b.f97917b, 0.0f, 0.0f, 0.0f, 14), pVar), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB2, o0Var, (i17 >> 3) & 14, 0, 131068);
                o0Var = o0Var;
                o0Var.g0(false);
            } else {
                o0Var.C(1491066445);
                o0Var.g0(false);
            }
            o0Var.g0(true);
            fVar2.getClass();
            o0 o0Var2 = o0Var;
            mh.c(str3, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97935l, o0Var), o0Var2, (i17 >> 6) & 14, 0, 131070);
            o0VarE = o0Var2;
            o0VarE.g0(true);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a82.b(str, str2, str3, eVar, gVar, z14, i14);
        }
    }
}
