package o72;

import java.util.Locale;
import p3.b4;

/* JADX INFO: loaded from: classes9.dex */
public final class d {
    public static final void a(p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(-1884205515);
        p3.c<?> cVar = o0VarE.f135177b;
        if (o0VarE.n(i14 & 1, i14 != 0)) {
            p3.x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            float f14 = 8;
            g6.f.a aVar2 = g6.f.f75994b;
            c2.l.f(c2.x2.q(aVar, f14), o0VarE);
            c2.j.f22691a.getClass();
            c2.j.C0343j c0343j = c2.j.f22692b;
            h4.d.f81522a.getClass();
            h4.g.b bVar = h4.d.a.f81533k;
            c2.s2 s2VarA = c2.q2.a(c0343j, bVar, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            p3.i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(aVar, o0VarE);
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
            h5.g.a.e eVar = h5.g.a.f81810g;
            b4.c(eVar, s2VarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            c2.u2 u2Var = c2.u2.f22900a;
            h4.r rVarZ = c2.l.z(aVar, f14, f14);
            l72.p pVar = l72.p.f111202a;
            Locale locale = Locale.ROOT;
            String upperCase = "Label".toUpperCase(locale);
            upperCase.getClass();
            pVar.a(1, 432, rVarZ, upperCase, o0VarE);
            String upperCase2 = "Label".toUpperCase(locale);
            upperCase2.getClass();
            pVar.a(2, 432, rVarZ, upperCase2, o0VarE);
            String upperCase3 = "Label".toUpperCase(locale);
            upperCase3.getClass();
            pVar.a(3, 432, rVarZ, upperCase3, o0VarE);
            o0VarE.g0(true);
            c2.s2 s2VarA2 = c2.q2.a(c0343j, bVar, o0VarE, 0);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            p3.i2 i2VarA1 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(aVar, o0VarE);
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
            b4.c(eVar, s2VarA2, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
            }
            b4.c(fVar, rVarC2, o0VarE);
            h4.r rVarZ2 = c2.l.z(aVar, f14, f14);
            pVar.a(1, 438, rVarZ2, "New", o0VarE);
            pVar.a(2, 438, rVarZ2, "Live", o0VarE);
            pVar.a(3, 438, rVarZ2, "In 3 Days", o0VarE);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new o01.e(i14, 18);
        }
    }
}
