package c2;

/* JADX INFO: loaded from: classes.dex */
public final class v {
    /* JADX WARN: Code duplicated, block: B:36:0x005c  */
    /* JADX WARN: Code duplicated, block: B:38:0x0062  */
    /* JADX WARN: Code duplicated, block: B:39:0x0064  */
    /* JADX WARN: Code duplicated, block: B:43:0x006f  */
    /* JADX WARN: Code duplicated, block: B:44:0x0071  */
    /* JADX WARN: Code duplicated, block: B:47:0x007a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:48:0x007c  */
    /* JADX WARN: Code duplicated, block: B:50:0x0080  */
    /* JADX WARN: Code duplicated, block: B:51:0x0088  */
    /* JADX WARN: Code duplicated, block: B:53:0x008b  */
    /* JADX WARN: Code duplicated, block: B:57:0x0097  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:67:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:69:? A[RETURN, SYNTHETIC] */
    public static final void a(h4.r rVar, h4.d dVar, boolean z14, z3.e eVar, p3.m mVar, int i14, int i15) {
        int i16;
        boolean z15;
        boolean z16;
        h4.d dVar2;
        h4.r rVar2;
        boolean z17;
        p3.p2 p2VarI0;
        h4.d dVar3;
        f5.z0 z0VarD;
        boolean zB;
        Object objQ;
        int i17;
        p3.o0 o0VarE = mVar.E(380139498);
        int i18 = i15 & 1;
        if (i18 != 0) {
            i16 = i14 | 6;
        } else if ((i14 & 6) == 0) {
            i16 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        int i19 = i15 & 2;
        if (i19 != 0) {
            i16 |= 48;
        } else if ((i14 & 48) == 0) {
            i16 |= o0VarE.B(dVar) ? 32 : 16;
        }
        int i24 = i15 & 4;
        if (i24 == 0) {
            if ((i14 & 384) == 0) {
                z15 = z14;
                i16 |= o0VarE.h(z15) ? 256 : 128;
            }
            if ((i14 & 3072) == 0) {
                if (o0VarE.r(eVar)) {
                    i17 = 2048;
                } else {
                    i17 = 1024;
                }
                i16 |= i17;
            }
            if ((i16 & 1171) != 1170) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (o0VarE.n(i16 & 1, z16)) {
                if (i18 != 0) {
                    rVar = h4.r.S;
                }
                if (i19 != 0) {
                    h4.d.f81522a.getClass();
                    dVar3 = h4.d.a.f81524b;
                } else {
                    dVar3 = dVar;
                }
                if (i24 != 0) {
                    z15 = false;
                }
                p3.x1 x1Var = p3.n.f135158a;
                z0VarD = q.d(dVar3, z15);
                zB = o0VarE.B(z0VarD) | ((i16 & 7168) == 2048);
                objQ = o0VarE.q();
                if (zB) {
                    objQ = new a03.t0(27, z0VarD, eVar);
                    o0VarE.K(objQ);
                } else {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new a03.t0(27, z0VarD, eVar);
                        o0VarE.K(objQ);
                    }
                }
                f5.i2.b(rVar, (e23.p) objQ, o0VarE, i16 & 14, 0);
                dVar2 = dVar3;
                z17 = z15;
                rVar2 = rVar;
            } else {
                o0VarE.e();
                dVar2 = dVar;
                rVar2 = rVar;
                z17 = z15;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new aa2.g(rVar2, dVar2, z17, eVar, i14, i15, 2);
            }
        }
        i16 |= 384;
        z15 = z14;
        if ((i14 & 3072) == 0) {
            if (o0VarE.r(eVar)) {
                i17 = 2048;
            } else {
                i17 = 1024;
            }
            i16 |= i17;
        }
        if ((i16 & 1171) != 1170) {
            z16 = true;
        } else {
            z16 = false;
        }
        if (o0VarE.n(i16 & 1, z16)) {
            if (i18 != 0) {
                rVar = h4.r.S;
            }
            if (i19 != 0) {
                h4.d.f81522a.getClass();
                dVar3 = h4.d.a.f81524b;
            } else {
                dVar3 = dVar;
            }
            if (i24 != 0) {
                z15 = false;
            }
            p3.x1 x1Var2 = p3.n.f135158a;
            z0VarD = q.d(dVar3, z15);
            zB = o0VarE.B(z0VarD) | ((i16 & 7168) == 2048);
            objQ = o0VarE.q();
            if (zB) {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new a03.t0(27, z0VarD, eVar);
                    o0VarE.K(objQ);
                }
            } else {
                objQ = new a03.t0(27, z0VarD, eVar);
                o0VarE.K(objQ);
            }
            f5.i2.b(rVar, (e23.p) objQ, o0VarE, i16 & 14, 0);
            dVar2 = dVar3;
            z17 = z15;
            rVar2 = rVar;
        } else {
            o0VarE.e();
            dVar2 = dVar;
            rVar2 = rVar;
            z17 = z15;
        }
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new aa2.g(rVar2, dVar2, z17, eVar, i14, i15, 2);
        }
    }
}
