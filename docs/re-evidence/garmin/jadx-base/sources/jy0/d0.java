package jy0;

import am.h1;
import am.x0;
import c2.x2;
import i3.m8;
import l72.p2;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.x1;
import s5.l0;

/* JADX INFO: loaded from: classes9.dex */
public final class d0 {
    /* JADX WARN: Code duplicated, block: B:45:0x00b5  */
    public static final void a(boolean z14, x0 x0Var, e23.l<? super x0, Unit> lVar, p3.m mVar, int i14) {
        int i15;
        String strT;
        o0 o0VarE = mVar.E(1916959410);
        int i16 = 4;
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.h(z14) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.k(x0Var.ordinal()) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(lVar) ? 256 : 128;
        }
        byte b14 = 0;
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            if (x0Var == x0.f4304m) {
                o0VarE.C(-2042186339);
                o0VarE.g0(false);
                String str = x0Var.f4358a;
                z5.b.f202439b.getClass();
                strT = l0.a(str, z5.b.a.a());
            } else {
                o0VarE.C(-2042129764);
                strT = gl1.d.T(x0Var.f4360c, o0VarE, 0);
                o0VarE.g0(false);
            }
            p2 p2Var = p2.f111205a;
            z3.e eVarC = z3.f.c(1776916285, new j30.d(z14, i16, b14), o0VarE);
            int i17 = ((i15 & 896) == 256 ? (byte) 1 : (byte) 0) | ((i15 & 112) == 32 ? (byte) 1 : (byte) 0);
            Object objQ = o0VarE.q();
            if (i17 == 0) {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new h1(lVar, x0Var, 2);
                    o0VarE.K(objQ);
                }
            } else {
                objQ = new h1(lVar, x0Var, 2);
                o0VarE.K(objQ);
            }
            p2Var.g(strT, null, null, null, eVarC, false, false, (e23.a) objQ, o0VarE, 24576, 238);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new at.b(z14, x0Var, lVar, i14, 11);
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00dc  */
    public static final void b(i53.c<? extends x0> cVar, i53.e<? extends x0> eVar, e23.a<Unit> aVar, e23.l<? super x0, Unit> lVar, p3.m mVar, int i14) {
        cVar.getClass();
        eVar.getClass();
        aVar.getClass();
        lVar.getClass();
        o0 o0VarE = mVar.E(163638916);
        int i15 = (o0VarE.B(cVar) ? 4 : 2) | i14 | (o0VarE.B(eVar) ? 32 : 16) | (o0VarE.r(aVar) ? 256 : 128) | (o0VarE.r(lVar) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            h4.r rVarD = x2.d(h4.r.S, 1.0f);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarD, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar2 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            boolean zIsEmpty = eVar.isEmpty();
            x0 x0Var = x0.f4304m;
            boolean z14 = (i15 & 896) == 256;
            Object objQ = o0VarE.q();
            if (z14) {
                objQ = new m8(aVar, 8);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new m8(aVar, 8);
                    o0VarE.K(objQ);
                }
            }
            a(zIsEmpty, x0Var, (e23.l) objQ, o0VarE, 48);
            o0VarE.C(-1589777883);
            for (x0 x0Var2 : cVar) {
                a(eVar.contains(x0Var2), x0Var2, lVar, o0VarE, (i15 >> 3) & 896);
            }
            o0VarE.g0(false);
            o0VarE.g0(true);
            x1 x1Var2 = p3.n.f135158a;
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new jj2.c(cVar, eVar, aVar, lVar, i14, 4);
        }
    }
}
