package vc1;

import c2.b0;
import c2.j;
import c2.l;
import c2.q;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import c2.z;
import c22.j0;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import cr.w;
import g22.k;
import gl1.y;
import h4.r;
import h5.e0;
import i3.i7;
import i3.mh;
import o4.m1;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;
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
import sk0.k1;

/* JADX INFO: loaded from: classes9.dex */
public final class i {
    /* JADX WARN: Code duplicated, block: B:44:0x00ba  */
    public static final void a(tc1.a aVar, Double d14, LocalDate localDate, sc1.a aVar2, m mVar, int i14) {
        String strG1;
        aVar2.getClass();
        o0 o0VarE = mVar.E(-78736687);
        int i15 = i14 | (o0VarE.B(aVar) ? 4 : 2) | (o0VarE.B(d14) ? 32 : 16) | (o0VarE.r(localDate) ? 256 : 128) | (o0VarE.k(aVar2.ordinal()) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            String strQ = y.Q(o0VarE, R.string.no_duration_value);
            String str = aVar.f163811a;
            Long lValueOf = null;
            LocalDate localDate2 = str == null ? null : LocalDate.parse(str, DateTimeFormat.forPattern("yyyy-MM-dd"));
            String strB = j0.b(localDate2 != null ? localDate2.toDateTimeAtStartOfDay() : null, "M/d/yy", null);
            if (strB == null) {
                strB = "--/--/--";
            }
            if (aVar2 == sc1.a.Time) {
                l3.a aVar3 = l3.f23124b;
                Long l14 = aVar.f163812b;
                aVar3.getClass();
                strG1 = l3.a.g1(l14);
                if (strG1 == null) {
                    strG1 = strQ;
                }
            } else {
                l3.a aVar4 = l3.f23124b;
                Double d15 = aVar.f163817g;
                if (d15 != null) {
                    double dDoubleValue = d15.doubleValue();
                    boolean zC = mg0.b.c();
                    aVar4.getClass();
                    lValueOf = Long.valueOf(l3.a.u(dDoubleValue, zC));
                }
                aVar4.getClass();
                strG1 = l3.a.g1(lValueOf);
                if (strG1 == null) {
                    strG1 = strQ;
                }
            }
            gl.c.f77766a.getClass();
            long jF = gl.c.a(o0VarE).f();
            long jE = gl.c.a(o0VarE).e();
            boolean zG = k.g(localDate2, localDate);
            l3.a aVar5 = l3.f23124b;
            boolean zC2 = mg0.b.c();
            aVar5.getClass();
            String strN = fb1.c.n(StringUtils.SPACE, y.Q(o0VarE, l3.a.N1(zC2)));
            if (strB.equals("--/--/--") || s.g(strG1, strQ)) {
                o0VarE.C(-589729135);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-590814104);
                m92.y.a(strB, z3.f.c(881949200, new w(strG1, aVar2, strN, zG, jF, d14, strQ, jE), o0VarE), o0VarE, 384);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new k1(aVar, d14, localDate, aVar2, i14, 23);
        }
    }

    public static final void b(String str, String str2, long j8, boolean z14, m mVar, int i14) {
        h5.g.a.C1623g c1623g;
        r.a aVar;
        e0.a aVar2;
        int i15;
        str2.getClass();
        o0 o0VarE = mVar.E(1884865472);
        p3.c<?> cVar = o0VarE.f135177b;
        int i16 = (o0VarE.B(str) ? 4 : 2) | i14 | (o0VarE.B(str2) ? 32 : 16) | (o0VarE.l(j8) ? 256 : 128);
        if ((i14 & 3072) == 0) {
            i16 |= o0VarE.h(z14) ? 2048 : 1024;
        }
        if (o0VarE.n(i16 & 1, (i16 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            r.a aVar3 = r.S;
            j.f22691a.getClass();
            j.C0343j c0343j = j.f22692b;
            h4.d.f81522a.getClass();
            h4.g.b bVar = h4.d.a.f81533k;
            s2 s2VarA = q2.a(c0343j, bVar, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = h4.k.c(aVar3, o0VarE);
            h5.g.V.getClass();
            e0.a aVar4 = h5.g.a.f81805b;
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar4);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar = h5.g.a.f81810g;
            b4.c(eVar, s2VarA, o0VarE);
            h5.g.a.C1623g c1623g2 = h5.g.a.f81809f;
            b4.c(c1623g2, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            u2 u2Var = u2.f22900a;
            if (z14) {
                o0VarE.C(688409202);
                d92.b.f58623a.getClass();
                j92.b bVar3 = d92.b.f58625c;
                bVar3.getClass();
                j92.e eVar2 = j92.b.f97899b;
                float f14 = eVar2.f97917b;
                bVar3.getClass();
                r rVarC2 = l.C(aVar3, 0.0f, f14, eVar2.f97917b, 0.0f, 9);
                bVar3.getClass();
                q.a(u1.n.e(l4.k.b(x2.q(rVarC2, j92.b.f97901d.f97902a), k2.i.f102406a), j8, m1.f128891a), o0VarE, 0);
                o0VarE.g0(false);
                aVar2 = aVar4;
                c1623g = c1623g2;
                aVar = aVar3;
                i15 = 0;
            } else {
                o0VarE.C(688728719);
                d92.b.f58623a.getClass();
                j92.b bVar4 = d92.b.f58625c;
                bVar4.getClass();
                j92.e eVar3 = j92.b.f97899b;
                float f15 = eVar3.f97917b;
                bVar4.getClass();
                r rVarC3 = l.C(aVar3, 0.0f, f15, eVar3.f97917b, 0.0f, 9);
                bVar4.getClass();
                r rVarQ = x2.q(rVarC3, j92.b.f97901d.f97902a);
                t4.d dVarA = n5.c.a(R.drawable.ic_dash, o0VarE, 0);
                gl.c.f77766a.getClass();
                c1623g = c1623g2;
                aVar = aVar3;
                aVar2 = aVar4;
                i15 = 0;
                i7.a(dVarA, null, rVarQ, gl.c.a(o0VarE).f(), o0VarE, 48, 0);
                o0VarE.g0(false);
            }
            z zVarA = c2.y.a(j.f22694d, h4.d.a.f81536n, o0VarE, i15);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            r rVarC4 = h4.k.c(aVar, o0VarE);
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
            b4.c(eVar, zVarA, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
            }
            b4.c(fVar, rVarC4, o0VarE);
            b0 b0Var = b0.f22601a;
            s2 s2VarA2 = q2.a(c0343j, bVar, o0VarE, i15);
            int iHashCode3 = Long.hashCode(o0VarE.U);
            i2 i2VarA2 = o0VarE.a0();
            r rVarC5 = h4.k.c(aVar, o0VarE);
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
            b4.c(eVar, s2VarA2, o0VarE);
            b4.c(c1623g, i2VarA2, o0VarE);
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode3))) {
                v.h.A(iHashCode3, o0VarE, iHashCode3, bVar2);
            }
            b4.c(fVar, rVarC5, o0VarE);
            d92.b.f58623a.getClass();
            j92.f fVar2 = d92.b.f58624b;
            fVar2.getClass();
            x0 x0VarB = d92.c.b(j92.f.f97932i, o0VarE);
            u2Var.getClass();
            mh.c(str, u2Var.d(aVar, f5.b.f68892a), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, o0VarE, i16 & 14, 0, 131068);
            o0VarE.g0(true);
            fVar2.getClass();
            mh.c(str2, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97935l, o0VarE), o0VarE, (i16 >> 3) & 14, 0, 131070);
            o0VarE = o0VarE;
            o0VarE.g0(true);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ty1.s(str, j8, i14, str2, z14);
        }
    }
}
