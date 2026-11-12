package m30;

import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import h5.e0;
import i3.d7;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final class r {
    /* JADX WARN: Code duplicated, block: B:51:0x0129  */
    /* JADX WARN: Code duplicated, block: B:61:0x0193  */
    public static final void a(int i14, e23.l lVar, h4.r rVar, p3.m mVar, boolean z14) {
        long j8;
        long jD;
        e23.l lVar2 = lVar;
        lVar2.getClass();
        o0 o0VarE = mVar.E(2045704287);
        int i15 = i14 | (o0VarE.B(rVar) ? 4 : 2) | (o0VarE.h(z14) ? 32 : 16) | (o0VarE.r(lVar2) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            c2.j.f22691a.getClass();
            c2.j.C0343j c0343j = c2.j.f22692b;
            h4.d.f81522a.getClass();
            s2 s2VarA = q2.a(c0343j, h4.d.a.f81533k, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVar, o0VarE);
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
            b4.c(h5.g.a.f81810g, s2VarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            u2 u2Var = u2.f22900a;
            h4.r.a aVar2 = h4.r.S;
            d92.b.f58623a.getClass();
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97920e;
            float f15 = eVar.f97920e;
            h4.r rVarY = c2.l.y(aVar2, f14);
            k2.h hVar = k2.i.f102406a;
            if (z14) {
                j8 = zl.a.b(o0VarE, 1346418094, o0VarE).f63508c;
                o0VarE.g0(false);
            } else {
                o0VarE.C(1346419209);
                o0VarE.g0(false);
                gl.c.f77766a.getClass();
                j8 = gl.c.f77767b.f77773c;
            }
            if (z14) {
                jD = zl.a.b(o0VarE, 1346421518, o0VarE).f63509d;
            } else {
                o0VarE.C(1346422572);
                jD = d92.b.a(o0VarE).f().d();
            }
            o0VarE.g0(false);
            boolean z15 = (i15 & 112) == 32;
            int i16 = i15 & 896;
            boolean z16 = z15 | (i16 == 256);
            Object objQ = o0VarE.q();
            p3.m.a aVar3 = p3.m.f135153a;
            if (z16) {
                objQ = new ad0.e(z14, lVar2, 11);
                o0VarE.K(objQ);
            } else {
                aVar3.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new ad0.e(z14, lVar2, 11);
                    o0VarE.K(objQ);
                }
            }
            k.f116353a.getClass();
            boolean z17 = false;
            d7.d((e23.a) objQ, rVarY, hVar, j8, jD, null, k.f116354b, o0VarE, 12582912, 96);
            bVar2.getClass();
            c2.l.f(x2.u(aVar2, f15), o0VarE);
            bVar2.getClass();
            h4.r rVarY2 = c2.l.y(aVar2, f15);
            long j14 = d92.b.a(o0VarE).f().f63508c;
            long j15 = d92.b.a(o0VarE).f().f63509d;
            if (i16 == 256) {
                z17 = true;
            }
            Object objQ2 = o0VarE.q();
            if (z17) {
                lVar2 = lVar;
                objQ2 = new gt1.k(lVar2, 22);
                o0VarE.K(objQ2);
            } else {
                aVar3.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    lVar2 = lVar;
                    objQ2 = new gt1.k(lVar2, 22);
                    o0VarE.K(objQ2);
                } else {
                    lVar2 = lVar;
                }
            }
            d7.d((e23.a) objQ2, rVarY2, hVar, j14, j15, null, k.f116355c, o0VarE, 12582912, 96);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ad0.h(rVar, z14, lVar2, i14, 2);
        }
    }
}
