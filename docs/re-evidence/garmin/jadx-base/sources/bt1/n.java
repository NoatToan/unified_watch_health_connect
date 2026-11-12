package bt1;

import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import h5.e0;
import i3.ec;
import i3.wg;
import o4.m1;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import s5.x0;
import u1.w;

/* JADX INFO: loaded from: classes10.dex */
public final class n {
    /* JADX WARN: Code duplicated, block: B:49:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:73:0x01a1  */
    public static final void a(h4.r rVar, String str, String str2, boolean z14, e23.a aVar, p3.m mVar, int i14) {
        h4.r rVar2;
        h4.r rVar3;
        long jD;
        x0 x0VarF;
        o0 o0VarL = vb.h.l(1697941385, aVar, str, mVar);
        int i15 = i14 | 6 | (o0VarL.B(str) ? 32 : 16) | (o0VarL.B(str2) ? 256 : 128) | (o0VarL.h(z14) ? 2048 : 1024) | (o0VarL.r(aVar) ? 16384 : 8192);
        if (o0VarL.n(i15 & 1, (i15 & 9363) != 9362)) {
            o0VarL.G0();
            if ((i14 & 1) == 0 || o0VarL.o0()) {
                rVar3 = h4.r.S;
            } else {
                o0VarL.e();
                rVar3 = rVar;
            }
            o0VarL.h0();
            x1 x1Var = p3.n.f135158a;
            if (z14) {
                o0VarL.C(-365894448);
                d92.b.f58623a.getClass();
                jD = d92.b.a(o0VarL).k().b();
            } else {
                o0VarL.C(-365893454);
                d92.b.f58623a.getClass();
                jD = d92.b.a(o0VarL).j().d();
            }
            o0VarL.g0(false);
            wg.f90137a.getClass();
            h4.r rVarK = x2.k(x2.b(rVar3, wg.f90139c, 0.0f, 2), wg.f90138b);
            float f14 = z14 ? 2 : 1;
            g6.f.a aVar2 = g6.f.f75994b;
            ec ecVar = j92.h.f97941a;
            h4.r rVarE = u1.n.e(l4.k.b(u1.q.b(f14, jD, rVarK, ecVar.f87991b), ecVar.f87991b), am.j.A(d92.b.f58623a, o0VarL), m1.f128891a);
            boolean z15 = (57344 & i15) == 16384;
            Object objQ = o0VarL.q();
            p3.m.a aVar3 = p3.m.f135153a;
            if (z15) {
                objQ = new as.n(aVar, 21);
                o0VarL.K(objQ);
            } else {
                aVar3.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new as.n(aVar, 21);
                    o0VarL.K(objQ);
                }
            }
            h4.r rVarD = w.d(rVarE, false, null, null, (e23.a) objQ, 15);
            d92.b.f58625c.getClass();
            h4.r rVarY = c2.l.y(rVarD, j92.b.f97899b.f97918c);
            h4.d.f81522a.getClass();
            h4.g.b bVar = h4.d.a.f81534l;
            c2.j.f22691a.getClass();
            s2 s2VarA = q2.a(c2.j.f22692b, bVar, o0VarL, 48);
            int iHashCode = Long.hashCode(o0VarL.U);
            i2 i2VarA0 = o0VarL.a0();
            h4.r rVarC = h4.k.c(rVarY, o0VarL);
            h5.g.V.getClass();
            e0.a aVar4 = h5.g.a.f81805b;
            if (o0VarL.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarL.z();
            if (o0VarL.T) {
                o0VarL.M(aVar4);
            } else {
                o0VarL.c();
            }
            b4.c(h5.g.a.f81810g, s2VarA, o0VarL);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarL);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarL.T || !p005kotlin.jvm.internal.s.g(o0VarL.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarL, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarL);
            u2 u2Var = u2.f22900a;
            h4.r.a aVar5 = h4.r.S;
            boolean z16 = (((i15 & 896) ^ 384) > 256 && o0VarL.B(str2)) || (i15 & 384) == 256;
            Object objQ2 = o0VarL.q();
            if (z16) {
                objQ2 = new defpackage.b(str2, 24);
                o0VarL.K(objQ2);
            } else {
                aVar3.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new defpackage.b(str2, 24);
                    o0VarL.K(objQ2);
                }
            }
            h4.r rVarC2 = p5.v.c((e23.l) objQ2, aVar5, false);
            if (z14) {
                o0VarL.C(656955899);
                d92.b.f58624b.getClass();
                x0VarF = d92.c.b(j92.f.f97931h, o0VarL);
            } else {
                o0VarL.C(656957021);
                d92.b.f58624b.getClass();
                x0VarF = d92.c.f(j92.f.f97931h, o0VarL);
            }
            o0VarL.g0(false);
            g02.c.a(str, rVarC2, 0L, null, 0, false, 0, x0VarF, 0.0d, o0VarL, (i15 >> 3) & 14, 380);
            o0VarL.g0(true);
            rVar2 = rVar3;
        } else {
            o0VarL.e();
            rVar2 = rVar;
        }
        p2 p2VarI0 = o0VarL.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new m(rVar2, str, str2, z14, aVar, i14, 0);
        }
    }
}
