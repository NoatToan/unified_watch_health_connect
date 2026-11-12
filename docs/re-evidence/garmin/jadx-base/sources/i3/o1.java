package i3;

/* JADX INFO: loaded from: classes.dex */
public final class o1 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(h4.r rVar, o4.r1 r1Var, k1 k1Var, m1 m1Var, z3.e eVar, p3.m mVar, int i14, int i15) {
        h4.r rVar2;
        int i16;
        k1 k1Var2;
        m1 m1Var2;
        p3.o0 o0Var;
        h4.r rVar3;
        k1 k1Var3;
        m1 m1Var3;
        k1 k1VarC;
        m1 m1Var4;
        h4.r rVar4;
        m1 m1Var5;
        p3.o0 o0VarE = mVar.E(1359693790);
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
        if ((i14 & 48) == 0) {
            i16 |= o0VarE.B(r1Var) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            if ((i15 & 4) == 0) {
                k1Var2 = k1Var;
                int i18 = o0VarE.B(k1Var2) ? 256 : 128;
                i16 |= i18;
            } else {
                k1Var2 = k1Var;
            }
            i16 |= i18;
        } else {
            k1Var2 = k1Var;
        }
        if ((i14 & 3072) == 0) {
            if ((i15 & 8) == 0) {
                m1Var2 = m1Var;
                int i19 = o0VarE.B(m1Var2) ? 2048 : 1024;
                i16 |= i19;
            } else {
                m1Var2 = m1Var;
            }
            i16 |= i19;
        } else {
            m1Var2 = m1Var;
        }
        if ((i15 & 16) != 0) {
            i16 |= 24576;
        } else if ((i14 & 24576) == 0) {
            i16 |= o0VarE.B(null) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i16 |= o0VarE.r(eVar) ? 131072 : 65536;
        }
        if (o0VarE.n(i16 & 1, (74899 & i16) != 74898)) {
            o0VarE.G0();
            if ((i14 & 1) == 0 || o0VarE.o0()) {
                h4.r rVar5 = i17 != 0 ? h4.r.S : rVar2;
                if ((i15 & 4) != 0) {
                    l1.f88793a.getClass();
                    p3.x1 x1Var = p3.n.f135158a;
                    s7.f89624a.getClass();
                    k1VarC = l1.c(s7.a(o0VarE));
                    i16 &= -897;
                } else {
                    k1VarC = k1Var2;
                }
                if ((i15 & 8) != 0) {
                    l1.f88793a.getClass();
                    n3.b0.f122691a.getClass();
                    float f14 = n3.b0.f122693c;
                    float f15 = n3.b0.f122700j;
                    float f16 = n3.b0.f122698h;
                    float f17 = n3.b0.f122699i;
                    float f18 = n3.b0.f122697g;
                    float f19 = n3.b0.f122695e;
                    p3.x1 x1Var2 = p3.n.f135158a;
                    m1Var4 = new m1(f14, f15, f16, f17, f18, f19, null);
                    i16 &= -7169;
                } else {
                    m1Var4 = m1Var2;
                }
                rVar4 = rVar5;
                k1Var2 = k1VarC;
                m1Var5 = m1Var4;
            } else {
                o0VarE.e();
                if ((i15 & 4) != 0) {
                    i16 &= -897;
                }
                if ((i15 & 8) != 0) {
                    i16 &= -7169;
                }
                m1Var5 = m1Var2;
                rVar4 = rVar2;
            }
            o0VarE.h0();
            p3.x1 x1Var3 = p3.n.f135158a;
            long j8 = k1Var2.f88654a;
            long j14 = k1Var2.f88655b;
            float f22 = m1Var5.f88932a;
            o0VarE.C(-1763481333);
            o0VarE.C(167751211);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = p3.p0.n(g6.f.a(f22));
                o0VarE.K(objQ);
            }
            o0VarE.g0(false);
            o0VarE.g0(false);
            o0Var = o0VarE;
            ve.a(rVar4, r1Var, j8, j14, 0.0f, ((g6.f) ((p3.p1) objQ).getF182175a()).f75997a, null, z3.f.c(-97109725, new n1(eVar), o0VarE), o0Var, (i16 & 14) | 12582912 | (i16 & 112) | ((i16 << 6) & 3670016), 16);
            k1Var3 = k1Var2;
            m1Var3 = m1Var5;
            rVar3 = rVar4;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            rVar3 = rVar2;
            k1Var3 = k1Var2;
            m1Var3 = m1Var2;
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a42.a0(rVar3, (Object) r1Var, (Object) k1Var3, (Object) m1Var3, (Object) eVar, i14, i15, 13);
        }
    }

    public static final void b(h4.r rVar, o4.r1 r1Var, k1 k1Var, m1 m1Var, z3.e eVar, p3.m mVar, int i14) {
        o4.r1 r1Var2;
        m1 m1Var2;
        int i15;
        o4.r1 r1Var3;
        m1 m1Var3;
        p3.o0 o0VarE = mVar.E(-1464672362);
        int i16 = i14 | (o0VarE.B(rVar) ? 4 : 2) | 16 | (o0VarE.B(k1Var) ? 256 : 128) | 1024;
        if (o0VarE.n(i16 & 1, (i16 & 9363) != 9362)) {
            o0VarE.G0();
            if ((i14 & 1) == 0 || o0VarE.o0()) {
                l1 l1Var = l1.f88793a;
                l1Var.getClass();
                p3.x1 x1Var = p3.n.f135158a;
                n3.r rVar2 = n3.r.f123232a;
                rVar2.getClass();
                o4.r1 r1VarC = fc.c(n3.r.f123235d, o0VarE);
                l1Var.getClass();
                rVar2.getClass();
                i15 = i16 & (-7281);
                r1Var3 = r1VarC;
                m1Var3 = new m1(n3.r.f123234c, n3.r.f123242k, n3.r.f123240i, n3.r.f123241j, n3.r.f123239h, n3.r.f123237f, null);
            } else {
                o0VarE.e();
                i15 = i16 & (-7281);
                r1Var3 = r1Var;
                m1Var3 = m1Var;
            }
            o0VarE.h0();
            p3.x1 x1Var2 = p3.n.f135158a;
            a(rVar, r1Var3, k1Var, m1Var3, eVar, o0VarE, (i15 & 896) | (i15 & 14) | 24576 | 196608, 0);
            r1Var2 = r1Var3;
            m1Var2 = m1Var3;
        } else {
            o0VarE.e();
            r1Var2 = r1Var;
            m1Var2 = m1Var;
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new et.p(rVar, r1Var2, k1Var, m1Var2, eVar, i14, 22);
        }
    }
}
