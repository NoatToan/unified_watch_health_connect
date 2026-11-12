package h81;

import c2.b0;
import c2.j;
import c2.l;
import c2.q;
import c2.q2;
import c2.s2;
import c2.u;
import c2.u2;
import c2.x2;
import c2.y;
import c2.z;
import et1.v;
import f5.z0;
import g81.t;
import h4.k;
import h4.r;
import h5.e0;
import i3.mh;
import k2.i;
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

/* JADX INFO: loaded from: classes9.dex */
public final class e {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f82418a;

        static {
            int[] iArr = new int[n61.b.values().length];
            try {
                iArr[n61.b.ELITE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[n61.b.RECREATIONAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f82418a = iArr;
        }
    }

    public static final void a(long j8, m mVar, int i14) {
        int i15;
        o0 o0VarE = mVar.E(-1926531314);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.l(j8) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        int i16 = 1;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            r.a aVar = r.S;
            g6.f.a aVar2 = g6.f.f75994b;
            r rVarC = l.C(aVar, 0.0f, 4, 0.0f, 0.0f, 13);
            h4.d.f81522a.getClass();
            z0 z0VarD = q.d(h4.d.a.f81524b, false);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC2 = k.c(rVarC, o0VarE);
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
            b4.c(h5.g.a.f81810g, z0VarD, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC2, o0VarE);
            u uVar = u.f22885a;
            q.a(u1.n.e(l4.k.b(x2.q(aVar, 16), i.f102406a), j8, m1.f128891a), o0VarE, 0);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new d70.h(j8, i14, i16);
        }
    }

    public static final void b(int i14, long j8, String str, String str2, m mVar) {
        o0 o0Var;
        String str3 = str2;
        o0 o0VarE = mVar.E(-113207490);
        p3.c<?> cVar = o0VarE.f135177b;
        int i15 = i14 | (o0VarE.l(j8) ? 4 : 2) | (o0VarE.B(str) ? 32 : 16) | (o0VarE.B(str3) ? 256 : 128) | 3072;
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            r.a aVar = r.S;
            j.f22691a.getClass();
            j.k kVar = j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = k.c(aVar, o0VarE);
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
            h5.g.a.e eVar = h5.g.a.f81810g;
            b4.c(eVar, zVarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            h4.g.b bVar2 = h4.d.a.f81534l;
            float f14 = 16;
            g6.f.a aVar3 = g6.f.f75994b;
            r rVarC2 = l.C(aVar, f14, 0.0f, 0.0f, 0.0f, 14);
            s2 s2VarA = q2.a(j.f22692b, bVar2, o0VarE, 48);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            r rVarC3 = k.c(rVarC2, o0VarE);
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
            b4.c(eVar, s2VarA, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
            }
            b4.c(fVar, rVarC3, o0VarE);
            u2 u2Var = u2.f22900a;
            a(j8, o0VarE, i15 & 14);
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            mh.c(str, l.C(aVar, f14, 0.0f, f14, 0.0f, 10), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97931h), o0VarE), o0VarE, ((i15 >> 3) & 14) | 48, 0, 131068);
            o0Var = o0VarE;
            o0Var.g0(true);
            if (str2 != null) {
                o0Var.C(425339306);
                r rVarC4 = l.C(aVar, 32, 0.0f, 0.0f, 0.0f, 14);
                z0 z0VarD = q.d(h4.d.a.f81524b, false);
                int iHashCode3 = Long.hashCode(o0Var.U);
                i2 i2VarA2 = o0Var.a0();
                r rVarC5 = k.c(rVarC4, o0Var);
                if (cVar == null) {
                    p0.l();
                    throw null;
                }
                o0Var.z();
                if (o0Var.T) {
                    o0Var.M(aVar2);
                } else {
                    o0Var.c();
                }
                b4.c(eVar, z0VarD, o0Var);
                b4.c(c1623g, i2VarA2, o0Var);
                if (o0Var.T || !s.g(o0Var.q(), Integer.valueOf(iHashCode3))) {
                    v.h.A(iHashCode3, o0Var, iHashCode3, bVar);
                }
                b4.c(fVar, rVarC5, o0Var);
                u uVar = u.f22885a;
                str3 = str2;
                h82.r.f82497a.z(((i15 >> 6) & 14) | 432, 0, str3, o0Var);
                o0Var.g0(true);
                o0Var.g0(false);
            } else {
                str3 = str2;
                o0Var.C(425527662);
                o0Var.g0(false);
            }
            o0Var.g0(true);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new d(i14, str, str3, j8);
        }
    }

    public static final void c(t tVar, m mVar, int i14) {
        o0 o0VarE = mVar.E(523158394);
        int i15 = (o0VarE.B(tVar) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            h82.e.a(z3.f.c(1861036359, new v(tVar, 18), o0VarE), o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new fp0.l(tVar, i14, 10);
        }
    }
}
