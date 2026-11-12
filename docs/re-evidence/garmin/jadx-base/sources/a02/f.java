package a02;

import c2.b0;
import c2.j;
import c2.l;
import c2.q;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import c2.y;
import c2.z;
import h4.k;
import h4.r;
import h5.e0;
import i3.v5;
import kotlin.t1;
import o4.d0;
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

/* JADX INFO: loaded from: classes10.dex */
public final class f {
    public static final void a(r rVar, float f14, m mVar, int i14) {
        int i15;
        rVar.getClass();
        o0 o0VarE = mVar.E(-483164350);
        p3.c<?> cVar = o0VarE.f135177b;
        if ((i14 & 6) == 0) {
            i15 = i14 | (o0VarE.B(rVar) ? 4 : 2);
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.i(f14) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            float f75992b = ((g6.c) o0VarE.A(t1.f91490h)).getF75992b();
            g6.f.a aVar = g6.f.f75994b;
            float f15 = 90 * f75992b * 0.8f;
            float f16 = 10 * f75992b;
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            float f17 = j92.b.f97901d.f97905d * f75992b;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            r rVarY = l.y(rVar, eVar.f97920e);
            h4.d.f81522a.getClass();
            h4.g.b bVar2 = h4.d.a.f81534l;
            j.f22691a.getClass();
            j.C0343j c0343j = j.f22692b;
            s2 s2VarA = q2.a(c0343j, bVar2, o0VarE, 48);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = k.c(rVarY, o0VarE);
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
            h5.g.a.b bVar3 = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            u2 u2Var = u2.f22900a;
            long jC = d0.c(f14, d92.b.a(o0VarE).c().g(), 14);
            r.a aVar3 = r.S;
            r rVarA = u2Var.a(aVar3, 1.0f, true);
            s2 s2VarA2 = q2.a(c0343j, bVar2, o0VarE, 48);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            r rVarC2 = k.c(rVarA, o0VarE);
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
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar3);
            }
            b4.c(fVar, rVarC2, o0VarE);
            bVar.getClass();
            q.a(u1.n.e(x2.q(l.C(aVar3, 0.0f, 0.0f, eVar.f97918c, 0.0f, 11), f17), jC, k2.i.f102406a), o0VarE, 0);
            r rVarR = x2.r(aVar3, f15, f16);
            m1.a aVar4 = m1.f128891a;
            q.a(u1.n.e(rVarR, jC, aVar4), o0VarE, 0);
            o0VarE.g0(true);
            q.a(u1.n.e(x2.r(u2Var.a(aVar3, 1.0f, false), f15, f16), jC, aVar4), o0VarE, 0);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new d(rVar, f14, i14, 2);
        }
    }

    public static final void b(r rVar, float f14, m mVar, int i14) {
        rVar.getClass();
        o0 o0VarE = mVar.E(-1194637684);
        int i15 = ((i14 & 6) == 0 ? (o0VarE.B(rVar) ? 4 : 2) | i14 : i14) | (o0VarE.i(f14) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            d92.b.f58623a.getClass();
            long jC = d0.c(f14, d92.b.a(o0VarE).c().a(), 14);
            d92.b.f58625c.getClass();
            r rVarE = u1.n.e(rVar, jC, k2.i.a(j92.b.f97899b.f97918c));
            j.f22691a.getClass();
            j.k kVar = j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = k.c(rVarE, o0VarE);
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
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            o0VarE.C(1043078893);
            for (int i16 = 0; i16 < 5; i16++) {
                r.a aVar2 = r.S;
                float f15 = 1.0f;
                a(x2.f(aVar2, 1.0f), f14, o0VarE, ((i15 >> 3) & 112) | 6);
                r rVarF = x2.f(aVar2, 1.0f);
                if (i16 >= 4) {
                    f15 = 0.0f;
                }
                r rVarA = l4.k.a(rVarF, f15);
                d92.b.f58623a.getClass();
                v5.a(0.0f, 0, 2, d0.c(f14, d92.b.a(o0VarE).j().c(), 14), rVarA, o0VarE);
            }
            o0VarE.g0(false);
            o0VarE.g0(true);
            x1 x1Var2 = n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new d(rVar, f14, i14, 1);
        }
    }
}
