package i3;

/* JADX INFO: loaded from: classes.dex */
public final class v5 {
    /* JADX WARN: Code duplicated, block: B:72:0x00e5  */
    public static final void a(float f14, int i14, int i15, long j8, h4.r rVar, p3.m mVar) {
        h4.r rVar2;
        int i16;
        long jE;
        h4.r rVar3;
        long j14;
        float f15;
        p3.o0 o0VarE = mVar.E(75144485);
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
        int i18 = i15 & 2;
        if (i18 != 0) {
            i16 |= 48;
        } else if ((i14 & 48) == 0) {
            i16 |= o0VarE.i(f14) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            jE = j8;
            i16 |= ((i15 & 4) == 0 && o0VarE.l(jE)) ? 256 : 128;
        } else {
            jE = j8;
        }
        int i19 = 0;
        boolean z14 = true;
        if (o0VarE.n(i16 & 1, (i16 & 147) != 146)) {
            o0VarE.G0();
            if ((i14 & 1) == 0 || o0VarE.o0()) {
                rVar3 = i17 != 0 ? h4.r.S : rVar2;
                if (i18 != 0) {
                    r5.f89500a.getClass();
                    f14 = r5.f89501b;
                }
                if ((i15 & 4) != 0) {
                    r5.f89500a.getClass();
                    p3.x1 x1Var = p3.n.f135158a;
                    n3.p.f123214a.getClass();
                    jE = k2.e(n3.p.f123215b, o0VarE);
                    i16 &= -897;
                }
            } else {
                o0VarE.e();
                if ((i15 & 4) != 0) {
                    i16 &= -897;
                }
                rVar3 = rVar2;
            }
            o0VarE.h0();
            p3.x1 x1Var2 = p3.n.f135158a;
            h4.r rVarH = c2.x2.h(c2.x2.f(rVar3, 1.0f), f14);
            boolean z15 = (i16 & 112) == 32;
            if ((((i16 & 896) ^ 384) <= 256 || !o0VarE.l(jE)) && (i16 & 384) != 256) {
                z14 = false;
            }
            boolean z16 = z15 | z14;
            Object objQ = o0VarE.q();
            if (z16) {
                objQ = new s5(f14, jE, i19);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new s5(f14, jE, i19);
                    o0VarE.K(objQ);
                }
            }
            u1.n.b(rVarH, (e23.l) objQ, o0VarE, 0);
            f15 = f14;
            j14 = jE;
        } else {
            o0VarE.e();
            rVar3 = rVar2;
            j14 = jE;
            f15 = f14;
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new t5(rVar3, f15, j14, i14, i15);
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0093  */
    public static final void b(float f14, int i14, int i15, long j8, h4.r rVar, p3.m mVar) {
        h4.r rVar2;
        int i16;
        h4.r rVar3;
        float f15;
        p3.o0 o0VarE = mVar.E(-1534852205);
        int i17 = i15 & 1;
        if (i17 != 0) {
            i16 = i14 | 6;
            rVar2 = rVar;
        } else {
            rVar2 = rVar;
            i16 = (o0VarE.B(rVar2) ? 4 : 2) | i14;
        }
        int i18 = i16 | 48 | (o0VarE.l(j8) ? 256 : 128);
        int i19 = 1;
        if (o0VarE.n(i18 & 1, (i18 & 147) != 146)) {
            o0VarE.G0();
            if ((i14 & 1) == 0 || o0VarE.o0()) {
                rVar3 = i17 != 0 ? h4.r.S : rVar2;
                r5.f89500a.getClass();
                f15 = r5.f89501b;
            } else {
                o0VarE.e();
                rVar3 = rVar2;
                f15 = f14;
            }
            o0VarE.h0();
            p3.x1 x1Var = p3.n.f135158a;
            h4.r rVarU = c2.x2.u(c2.x2.c(rVar3, 1.0f), f15);
            boolean z14 = (((i18 & 896) ^ 384) > 256 && o0VarE.l(j8)) || (i18 & 384) == 256;
            Object objQ = o0VarE.q();
            if (z14) {
                objQ = new s5(f15, j8, i19);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new s5(f15, j8, i19);
                    o0VarE.K(objQ);
                }
            }
            u1.n.b(rVarU, (e23.l) objQ, o0VarE, 0);
        } else {
            o0VarE.e();
            rVar3 = rVar2;
            f15 = f14;
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new u5(rVar3, f15, j8, i14, i15);
        }
    }
}
