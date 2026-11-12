package l72;

import com.google.android.exoplayer2.C;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final class e1 {
    /* JADX WARN: Code duplicated, block: B:26:0x004a  */
    /* JADX WARN: Code duplicated, block: B:27:0x004c  */
    /* JADX WARN: Code duplicated, block: B:30:0x0057  */
    /* JADX WARN: Code duplicated, block: B:31:0x0059  */
    /* JADX WARN: Code duplicated, block: B:34:0x0062 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0064  */
    /* JADX WARN: Code duplicated, block: B:36:0x0066  */
    /* JADX WARN: Code duplicated, block: B:39:0x006b  */
    /* JADX WARN: Code duplicated, block: B:41:0x0071  */
    /* JADX WARN: Code duplicated, block: B:44:0x007e  */
    /* JADX WARN: Code duplicated, block: B:46:0x0082  */
    /* JADX WARN: Code duplicated, block: B:48:0x009e  */
    /* JADX WARN: Code duplicated, block: B:51:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:56:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:58:0x0110  */
    /* JADX WARN: Code duplicated, block: B:61:0x011b  */
    /* JADX WARN: Code duplicated, block: B:62:0x012a A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:63:? A[RETURN, SYNTHETIC] */
    public static final void a(String str, boolean z14, boolean z15, e23.a<Unit> aVar, p3.m mVar, int i14, int i15) {
        boolean z16;
        int i16;
        int i17;
        boolean z17;
        e23.a<Unit> aVar2;
        boolean z18;
        p3.p2 p2VarI0;
        d1 d1Var;
        boolean z19;
        long jB;
        boolean z24;
        Object objQ;
        p3.o0 o0VarE = mVar.E(-345958757);
        int i18 = (o0VarE.B(str) ? 4 : 2) | i14;
        if ((i14 & 48) == 0) {
            i18 |= o0VarE.h(z14) ? 32 : 16;
        }
        int i19 = i15 & 4;
        if (i19 == 0) {
            if ((i14 & 384) == 0) {
                z16 = z15;
                i18 |= o0VarE.h(z16) ? 256 : 128;
            }
            if (o0VarE.r(aVar)) {
                i16 = 2048;
            } else {
                i16 = 1024;
            }
            i17 = i18 | i16;
            if ((i17 & 1171) != 1170) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (o0VarE.n(i17 & 1, z17)) {
                if (i19 != 0) {
                    z19 = true;
                } else {
                    z19 = z16;
                }
                p3.x1 x1Var = p3.n.f135158a;
                if (str == null) {
                    p2VarI0 = o0VarE.i0();
                    if (p2VarI0 != null) {
                        return;
                    } else {
                        d1Var = new d1(str, z14, z19, aVar, i14, i15, 0);
                    }
                } else {
                    boolean z25 = z19;
                    aVar2 = aVar;
                    if (z14) {
                        o0VarE.C(-1753876350);
                        d92.b.f58623a.getClass();
                        jB = d92.b.a(o0VarE).k().e();
                        o0VarE.g0(false);
                    } else {
                        o0VarE.C(-1753875070);
                        d92.b.f58623a.getClass();
                        jB = d92.b.a(o0VarE).k().b();
                        o0VarE.g0(false);
                    }
                    long j8 = jB;
                    z24 = (i17 & 7168) == 2048;
                    objQ = o0VarE.q();
                    if (z24) {
                        objQ = new t(aVar2, 6);
                        o0VarE.K(objQ);
                    } else {
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new t(aVar2, 6);
                            o0VarE.K(objQ);
                        }
                    }
                    e23.a aVar3 = (e23.a) objQ;
                    i3.c1 c1Var = i3.c1.f87691a;
                    long jC = o4.d0.c(0.5f, j8, 14);
                    c1Var.getClass();
                    z18 = z25;
                    i3.h1.c(aVar3, null, z18, null, i3.c1.c(0L, j8, jC, o0VarE, 5), null, null, null, z3.f.c(1631338046, new j21.p(str, 5), o0VarE), o0VarE, (i17 & 896) | C.ENCODING_PCM_32BIT, 490);
                }
                p2VarI0.f135219d = d1Var;
            }
            aVar2 = aVar;
            o0VarE.e();
            z18 = z16;
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                d1Var = new d1(str, z14, z18, aVar2, i14, i15, 1);
                p2VarI0.f135219d = d1Var;
            }
        }
        i18 |= 384;
        z16 = z15;
        if (o0VarE.r(aVar)) {
            i16 = 2048;
        } else {
            i16 = 1024;
        }
        i17 = i18 | i16;
        if ((i17 & 1171) != 1170) {
            z17 = true;
        } else {
            z17 = false;
        }
        if (o0VarE.n(i17 & 1, z17)) {
            if (i19 != 0) {
                z19 = true;
            } else {
                z19 = z16;
            }
            p3.x1 x1Var2 = p3.n.f135158a;
            if (str == null) {
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    return;
                } else {
                    d1Var = new d1(str, z14, z19, aVar, i14, i15, 0);
                }
            } else {
                boolean z26 = z19;
                aVar2 = aVar;
                if (z14) {
                    o0VarE.C(-1753876350);
                    d92.b.f58623a.getClass();
                    jB = d92.b.a(o0VarE).k().e();
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(-1753875070);
                    d92.b.f58623a.getClass();
                    jB = d92.b.a(o0VarE).k().b();
                    o0VarE.g0(false);
                }
                long j14 = jB;
                if ((i17 & 7168) == 2048) {
                }
                objQ = o0VarE.q();
                if (z24) {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new t(aVar2, 6);
                        o0VarE.K(objQ);
                    }
                } else {
                    objQ = new t(aVar2, 6);
                    o0VarE.K(objQ);
                }
                e23.a aVar4 = (e23.a) objQ;
                i3.c1 c1Var2 = i3.c1.f87691a;
                long jC2 = o4.d0.c(0.5f, j14, 14);
                c1Var2.getClass();
                z18 = z26;
                i3.h1.c(aVar4, null, z18, null, i3.c1.c(0L, j14, jC2, o0VarE, 5), null, null, null, z3.f.c(1631338046, new j21.p(str, 5), o0VarE), o0VarE, (i17 & 896) | C.ENCODING_PCM_32BIT, 490);
            }
            p2VarI0.f135219d = d1Var;
        }
        aVar2 = aVar;
        o0VarE.e();
        z18 = z16;
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            d1Var = new d1(str, z14, z18, aVar2, i14, i15, 1);
            p2VarI0.f135219d = d1Var;
        }
    }

    public static final z3.e b(String str, s5.x0 x0Var, h4.r rVar, p3.m mVar) {
        p3.x1 x1Var = p3.n.f135158a;
        if (str == null) {
            mVar.C(1761232971);
            mVar.f();
            return null;
        }
        mVar.C(1761156246);
        z3.e eVarC = z3.f.c(-1857371044, new jt1.m(str, rVar, x0Var), mVar);
        mVar.f();
        return eVarC;
    }
}
