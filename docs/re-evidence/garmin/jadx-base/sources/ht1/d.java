package ht1;

import c2.q2;
import c2.s2;
import c2.t2;
import c2.u2;
import g02.q0;
import i3.p7;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import p3.y3;

/* JADX INFO: loaded from: classes10.dex */
public final class d {
    public static final void a(e23.q<? super t2, ? super p3.m, ? super Integer, Unit> qVar, e23.q<? super c2.a0, ? super p3.m, ? super Integer, Unit> qVar2, h4.r rVar, e23.a<Unit> aVar, p3.m mVar, int i14, int i15) {
        e23.q<? super c2.a0, ? super p3.m, ? super Integer, Unit> qVar3;
        int i16;
        boolean z14;
        rVar.getClass();
        aVar.getClass();
        o0 o0VarE = mVar.E(65291903);
        p3.c<?> cVar = o0VarE.f135177b;
        int i17 = i15 & 2;
        if (i17 != 0) {
            i16 = i14 | 48;
            qVar3 = qVar2;
        } else if ((i14 & 48) == 0) {
            qVar3 = qVar2;
            i16 = (o0VarE.r(qVar3) ? 32 : 16) | i14;
        } else {
            qVar3 = qVar2;
            i16 = i14;
        }
        if ((i14 & 384) == 0) {
            i16 |= o0VarE.B(rVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i16 |= o0VarE.r(aVar) ? 2048 : 1024;
        }
        if (o0VarE.n(i16 & 1, (i16 & 1171) != 1170)) {
            if (i17 != 0) {
                qVar3 = null;
            }
            x1 x1Var = p3.n.f135158a;
            c2.j jVar = c2.j.f22691a;
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97918c;
            jVar.getClass();
            c2.j.i iVarI = c2.j.i(f14);
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(iVarI, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVar, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar2 = h5.g.a.f81805b;
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
            b4.c(eVar2, zVarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            h4.r.a aVar3 = h4.r.S;
            bVar.getClass();
            h4.r rVarA = c2.l.A(aVar3, 0.0f, eVar.f97917b, 1);
            s2 s2VarA = q2.a(c2.j.f22692b, h4.d.a.f81534l, o0VarE, 48);
            int i18 = i16;
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(rVarA, o0VarE);
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
            b4.c(eVar2, s2VarA, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
            }
            b4.c(fVar, rVarC2, o0VarE);
            qVar.invoke(u2.f22900a, o0VarE, 54);
            y3 y3Var = p7.f89282d;
            g6.f.f75994b.getClass();
            p3.v.a(y3Var.c(g6.f.a(g6.f.f75996d)), z3.f.c(835593625, new hl1.i(aVar, 3), o0VarE), o0VarE, 56);
            o0VarE.g0(true);
            if (qVar3 == null) {
                o0VarE.C(403822144);
                z14 = false;
            } else {
                z14 = false;
                o0VarE.C(290121185);
                qVar3.invoke(b0Var, o0VarE, Integer.valueOf((i18 & 112) | 6));
            }
            o0VarE.g0(z14);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        e23.q<? super c2.a0, ? super p3.m, ? super Integer, Unit> qVar4 = qVar3;
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new b82.f0(i14, i15, 13, qVar, qVar4, rVar, aVar);
        }
    }

    public static final void b(String str, e23.q qVar, h4.r rVar, e23.a aVar, p3.m mVar, int i14) {
        str.getClass();
        rVar.getClass();
        aVar.getClass();
        o0 o0VarE = mVar.E(-1842350338);
        int i15 = (o0VarE.B(str) ? 4 : 2) | i14 | (o0VarE.B(rVar) ? 256 : 128) | (o0VarE.r(aVar) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            a(z3.f.c(-2122974072, new as.s(str, 23), o0VarE), qVar, rVar, aVar, o0VarE, (i15 & 896) | 54 | (i15 & 7168), 0);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new g52.d(str, qVar, rVar, aVar, i14, 16);
        }
    }

    public static final void c(String str, String str2, h4.r rVar, e23.a aVar, p3.m mVar, int i14) {
        z3.e eVarC;
        str.getClass();
        rVar.getClass();
        aVar.getClass();
        o0 o0VarE = mVar.E(1027644063);
        int i15 = (o0VarE.B(str) ? 4 : 2) | i14;
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(str2) ? 32 : 16;
        }
        int i16 = i15 | (o0VarE.B(rVar) ? 256 : 128) | (o0VarE.r(aVar) ? 2048 : 1024);
        if (o0VarE.n(i16 & 1, (i16 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            z3.e eVarC2 = z3.f.c(2125356245, new as.s(str, 24), o0VarE);
            if (str2 == null) {
                o0VarE.C(17859915);
                o0VarE.g0(false);
                eVarC = null;
            } else {
                o0VarE.C(17859916);
                eVarC = z3.f.c(-1799582088, new as.s(str2, 25), o0VarE);
                o0VarE.g0(false);
            }
            a(eVarC2, eVarC, rVar, aVar, o0VarE, (i16 & 896) | 6 | (i16 & 7168), 0);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new q0(str, str2, rVar, aVar, i14, 7);
        }
    }
}
