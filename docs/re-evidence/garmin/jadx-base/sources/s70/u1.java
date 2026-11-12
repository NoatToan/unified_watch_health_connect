package s70;

import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import i3.i7;
import i3.mh;
import p3.b4;
import p3.i2;
import p3.p2;
import v62.fa;

/* JADX INFO: loaded from: classes8.dex */
public final class u1 {
    public static final void a(int i14, h4.r rVar, String str, p3.m mVar) {
        String str2 = str;
        p3.o0 o0VarE = mVar.E(766711562);
        p3.c<?> cVar = o0VarE.f135177b;
        int i15 = i14 | (o0VarE.B(rVar) ? 4 : 2) | (o0VarE.B(str2) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            p3.x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            d92.b.f58623a.getClass();
            long jB = d92.b.a(o0VarE).e().b();
            g6.f.a aVar2 = g6.f.f75994b;
            h4.r rVarF = x2.f(u1.n.e(aVar, jB, k2.i.a(8)), 1.0f);
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            h4.r rVarThen = rVar.then(c2.l.C(rVarF, eVar.f97920e, 0.0f, 0.0f, 0.0f, 14));
            c2.j.f22691a.getClass();
            c2.j.C0343j c0343j = c2.j.f22692b;
            h4.d.f81522a.getClass();
            s2 s2VarA = q2.a(c0343j, h4.d.a.f81533k, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarThen, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar3 = h5.g.a.f81805b;
            if (cVar == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar2 = h5.g.a.f81810g;
            b4.c(eVar2, s2VarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            u2 u2Var = u2.f22900a;
            h4.r rVarA = c2.l.A(aVar, 0.0f, 12, 1);
            f5.z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(rVarA, o0VarE);
            if (cVar == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            b4.c(eVar2, z0VarD, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
            }
            b4.c(fVar, rVarC2, o0VarE);
            c2.u uVar = c2.u.f22885a;
            s62.a.f157643a.getClass();
            u4.d dVarA = fa.a(t62.b.f162798a);
            long j8 = d92.b.a(o0VarE).f().f63509d;
            h4.r rVarE = u1.n.e(l4.k.b(aVar, k2.i.f102406a), o4.d0.c(0.14f, d92.b.a(o0VarE).f().f63509d, 14), o4.m1.f128891a);
            bVar.getClass();
            h4.r rVarQ = x2.q(rVarE, j92.b.f97901d.f97906e);
            bVar.getClass();
            i7.b(dVarA, null, c2.l.y(rVarQ, eVar.f97918c), j8, o0VarE, 48, 0);
            o0VarE.g0(true);
            d92.b.f58624b.getClass();
            s5.x0 x0Var = j92.f.f97932i;
            long j14 = d92.b.a(o0VarE).k().f63528e;
            bVar.getClass();
            str2 = str;
            mh.c(str2, c2.l.y(aVar, eVar.f97920e), j14, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0Var, o0VarE, (i15 >> 3) & 14, 0, 131064);
            o0VarE = o0VarE;
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new cq.g(rVar, str2, i14, 7);
        }
    }
}
