package l72;

import i3.o6;
import i3.xb;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final class n0 {
    public static final void a(h4.r rVar, j0 j0Var, long j8, e23.l<? super Boolean, Unit> lVar, p3.m mVar, int i14, int i15) {
        int i16;
        h4.r rVar2;
        long jB;
        h4.r rVar3;
        int i17;
        j0Var.getClass();
        lVar.getClass();
        p3.o0 o0VarE = mVar.E(1507860960);
        int i18 = i15 & 1;
        if (i18 != 0) {
            i16 = i14 | 6;
        } else if ((i14 & 6) == 0) {
            i16 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        int i19 = i16 | (o0VarE.B(j0Var) ? 32 : 16) | 128;
        if ((i14 & 3072) == 0) {
            i19 |= o0VarE.r(lVar) ? 2048 : 1024;
        }
        int i24 = 0;
        if (o0VarE.n(i19 & 1, (i19 & 1171) != 1170)) {
            o0VarE.G0();
            if ((i14 & 1) == 0 || o0VarE.o0()) {
                rVar3 = i18 != 0 ? h4.r.S : rVar;
                d92.b.f58623a.getClass();
                i17 = i19 & (-897);
                jB = d92.b.a(o0VarE).i().a().b();
            } else {
                o0VarE.e();
                int i25 = i19 & (-897);
                jB = j8;
                i17 = i25;
                rVar3 = rVar;
            }
            o0VarE.h0();
            p3.x1 x1Var = p3.n.f135158a;
            z3.e eVarC = z3.f.c(1915273094, new k0(j0Var, i24), o0VarE);
            int i26 = (i17 & 14) | 48;
            int i27 = i17 << 3;
            b(rVar3, eVarC, j0Var, jB, lVar, o0VarE, (i27 & 57344) | i26 | (i27 & 896), 0);
            rVar2 = rVar3;
        } else {
            o0VarE.e();
            rVar2 = rVar;
            jB = j8;
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new b82.b(rVar2, j0Var, jB, lVar, i14, i15);
        }
    }

    /* JADX WARN: Code duplicated, block: B:80:0x01c0  */
    public static final void b(h4.r rVar, e23.p<? super p3.m, ? super Integer, Unit> pVar, j0 j0Var, long j8, e23.l<? super Boolean, Unit> lVar, p3.m mVar, int i14, int i15) {
        h4.r rVar2;
        int i16;
        long jB;
        p3.o0 o0Var;
        h4.r rVar3;
        long j14;
        int i17;
        pVar.getClass();
        j0Var.getClass();
        lVar.getClass();
        p3.o0 o0VarE = mVar.E(993795073);
        int i18 = i15 & 1;
        if (i18 != 0) {
            i16 = i14 | 6;
            rVar2 = rVar;
        } else if ((i14 & 6) == 0) {
            rVar2 = rVar;
            i16 = (o0VarE.B(rVar2) ? 4 : 2) | i14;
        } else {
            rVar2 = rVar;
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= o0VarE.r(pVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= o0VarE.B(j0Var) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            jB = j8;
            i16 |= ((i15 & 8) == 0 && o0VarE.l(jB)) ? 2048 : 1024;
        } else {
            jB = j8;
        }
        if ((i14 & 24576) == 0) {
            i16 |= o0VarE.r(lVar) ? 16384 : 8192;
        }
        if (o0VarE.n(i16 & 1, (i16 & 9363) != 9362)) {
            o0VarE.G0();
            if ((i14 & 1) == 0 || o0VarE.o0()) {
                rVar3 = i18 != 0 ? h4.r.S : rVar2;
                if ((i15 & 8) != 0) {
                    d92.b.f58623a.getClass();
                    jB = d92.b.a(o0VarE).i().a().b();
                    i16 &= -7169;
                }
            } else {
                o0VarE.e();
                if ((i15 & 8) != 0) {
                    i16 &= -7169;
                }
                rVar3 = rVar2;
            }
            int i19 = i16;
            long j15 = jB;
            o0VarE.h0();
            p3.x1 x1Var = p3.n.f135158a;
            o6 o6Var = o6.f89151a;
            d92.b.f58623a.getClass();
            long jA = d92.b.a(o0VarE).i().a().a();
            long jD = com.nimbusds.jose.shaded.gson.internal.a.d(o0VarE);
            long jD2 = am.j.d(o0VarE);
            long jA2 = d92.b.a(o0VarE).i().a().a();
            long jD3 = com.nimbusds.jose.shaded.gson.internal.a.d(o0VarE);
            long jD4 = am.j.d(o0VarE);
            long jA3 = d92.b.a(o0VarE).i().a().a();
            long j16 = d92.b.a(o0VarE).k().f63527d;
            long j17 = d92.b.a(o0VarE).f().f63508c;
            o6Var.getClass();
            xb xbVarB = o6.b(jA, jD, jD2, jA2, jD3, jD4, j15, jA3, j16, j17, o0VarE, 2112);
            long jD5 = o4.f0.d(4285295724L);
            o4.d0.f128823b.getClass();
            long j18 = o4.d0.f128831j;
            long jD6 = o4.f0.d(4285295724L);
            float f14 = 1;
            g6.f.a aVar = g6.f.f75994b;
            u1.u uVarA = o6.a(j0Var.f111075d, j0Var.f111076e, jD5, j18, jD6, j18, f14, 0, o0VarE, 0);
            boolean z14 = j0Var.f111076e;
            boolean z15 = ((i19 & 57344) == 16384) | ((i19 & 896) == 256);
            Object objQ = o0VarE.q();
            if (z15) {
                i17 = 2;
                objQ = new l0(j0Var, lVar, 2);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    i17 = 2;
                    objQ = new l0(j0Var, lVar, 2);
                    o0VarE.K(objQ);
                } else {
                    i17 = 2;
                }
            }
            z3.e eVarC = z3.f.c(-510936082, new k0(j0Var, i17), o0VarE);
            h4.r rVarA = v2.a(c2.x2.a(rVar3, f14, f14), !j0Var.f111075d, new q(3), o0VarE, 0);
            boolean z16 = j0Var.f111075d;
            z3.e eVarC2 = z3.f.c(-1645679541, new a3.d(pVar, 23), o0VarE);
            k2.h hVar = k2.i.f102406a;
            int i24 = k2.c.f102402a;
            k2.f fVar = new k2.f(50);
            i3.y1.b(z14, (e23.a) objQ, eVarC, rVarA, z16, eVarC2, null, new k2.h(fVar, fVar, fVar, fVar), xbVarB, null, uVarA, o0VarE, 196992, 2624);
            o0Var = o0VarE;
            j14 = j15;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            rVar3 = rVar2;
            j14 = jB;
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new b82.a(rVar3, pVar, j0Var, j14, lVar, i14, i15);
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0158  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(h4.r rVar, e23.p<? super p3.m, ? super Integer, Unit> pVar, j0 j0Var, e23.l<? super Boolean, Unit> lVar, p3.m mVar, int i14, int i15) {
        h4.r rVar2;
        int i16;
        p3.o0 o0Var;
        h4.r rVar3;
        j0 j0Var2 = j0Var;
        pVar.getClass();
        j0Var2.getClass();
        lVar.getClass();
        p3.o0 o0VarE = mVar.E(838725506);
        int i17 = i15 & 1;
        if (i17 != 0) {
            i16 = i14 | 6;
            rVar2 = rVar;
        } else if ((i14 & 6) == 0) {
            rVar2 = rVar;
            i16 = (o0VarE.B(rVar2) ? 4 : 2) | i14;
        } else {
            rVar2 = rVar;
            i16 = i14;
        }
        if ((i14 & 384) == 0) {
            i16 |= o0VarE.B(j0Var2) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i16 |= o0VarE.r(lVar) ? 2048 : 1024;
        }
        if (o0VarE.n(i16 & 1, (i16 & 1171) != 1170)) {
            rVar3 = i17 != 0 ? h4.r.S : rVar2;
            p3.x1 x1Var = p3.n.f135158a;
            d92.b.f58623a.getClass();
            long jB = d92.b.a(o0VarE).i().a().b();
            o6 o6Var = o6.f89151a;
            o4.d0.f128823b.getClass();
            int i18 = i16;
            long j8 = o4.d0.f128831j;
            long j14 = d92.b.a(o0VarE).k().f63527d;
            long j15 = d92.b.a(o0VarE).f().f63508c;
            long j16 = ((o4.d0) d92.b.a(o0VarE).i().a().f92369g.getF182175a()).f128833a;
            long j17 = d92.b.a(o0VarE).k().f63527d;
            long j18 = d92.b.a(o0VarE).f().f63508c;
            long j19 = d92.b.a(o0VarE).k().f63527d;
            long j24 = d92.b.a(o0VarE).f().f63508c;
            o6Var.getClass();
            xb xbVarB = o6.b(j8, j14, j15, j16, j17, j18, jB, jB, j19, j24, o0VarE, 2112);
            long jD = o4.f0.d(4285295724L);
            float f14 = 1;
            g6.f.a aVar = g6.f.f75994b;
            j0Var2 = j0Var;
            u1.u uVarA = o6.a(j0Var.f111075d, true, jD, j8, j8, j8, f14, 0, o0VarE, 0);
            boolean z14 = ((i18 & 7168) == 2048) | ((i18 & 896) == 256);
            Object objQ = o0VarE.q();
            if (z14) {
                objQ = new l0(j0Var2, lVar, 0);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new l0(j0Var2, lVar, 0);
                    o0VarE.K(objQ);
                }
            }
            z3.e eVarC = z3.f.c(-666005649, new k0(j0Var2, 1), o0VarE);
            h4.r rVarA = v2.a(c2.x2.a(rVar3, f14, f14), true ^ j0Var2.f111075d, new q(2), o0VarE, 0);
            boolean z15 = j0Var2.f111075d;
            z3.e eVarC2 = z3.f.c(-1800749108, new a3.d(pVar, 22), o0VarE);
            z3.e eVarC3 = z3.f.c(684314603, new l30.y0(3, j0Var2, lVar), o0VarE);
            k2.h hVar = k2.i.f102406a;
            int i19 = k2.c.f102402a;
            k2.f fVar = new k2.f(50);
            i3.y1.b(true, (e23.a) objQ, eVarC, rVarA, z15, eVarC2, eVarC3, new k2.h(fVar, fVar, fVar, fVar), xbVarB, null, uVarA, o0VarE, 1769862, 2560);
            o0Var = o0VarE;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            rVar3 = rVar2;
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new b82.f0(rVar3, pVar, j0Var2, lVar, i14, i15, 18);
        }
    }

    public static final void d(h4.r rVar, j0 j0Var, e23.l<? super Boolean, Unit> lVar, p3.m mVar, int i14, int i15) {
        int i16;
        h4.r rVar2;
        j0Var.getClass();
        lVar.getClass();
        p3.o0 o0VarE = mVar.E(-1806302047);
        int i17 = i15 & 1;
        if (i17 != 0) {
            i16 = i14 | 6;
        } else if ((i14 & 6) == 0) {
            i16 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        int i18 = i16 | (o0VarE.B(j0Var) ? 32 : 16);
        if ((i14 & 384) == 0) {
            i18 |= o0VarE.r(lVar) ? 256 : 128;
        }
        if (o0VarE.n(i18 & 1, (i18 & 147) != 146)) {
            h4.r rVar3 = i17 != 0 ? h4.r.S : rVar;
            p3.x1 x1Var = p3.n.f135158a;
            int i19 = (i18 & 14) | 48;
            int i24 = i18 << 3;
            c(rVar3, z3.f.c(-913963153, new k0(j0Var, 3), o0VarE), j0Var, lVar, o0VarE, (i24 & 7168) | (i24 & 896) | i19, 0);
            rVar2 = rVar3;
        } else {
            o0VarE.e();
            rVar2 = rVar;
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new an1.d(rVar2, j0Var, lVar, i14, i15, 17);
        }
    }
}
