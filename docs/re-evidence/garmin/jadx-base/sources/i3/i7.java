package i3;

/* JADX INFO: loaded from: classes.dex */
public final class i7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h4.r f88411a;

    static {
        h4.r.a aVar = h4.r.S;
        n3.y0.f123325a.getClass();
        f88411a = c2.x2.q(aVar, n3.y0.f123329e);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0181  */
    /* JADX WARN: Code duplicated, block: B:104:0x018c  */
    /* JADX WARN: Code duplicated, block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x004f  */
    /* JADX WARN: Code duplicated, block: B:35:0x005d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0061  */
    /* JADX WARN: Code duplicated, block: B:40:0x0069  */
    /* JADX WARN: Code duplicated, block: B:41:0x006b  */
    /* JADX WARN: Code duplicated, block: B:44:0x0074  */
    /* JADX WARN: Code duplicated, block: B:53:0x008d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x008f  */
    /* JADX WARN: Code duplicated, block: B:55:0x0092  */
    /* JADX WARN: Code duplicated, block: B:58:0x0097  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:72:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:73:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:75:0x00da  */
    /* JADX WARN: Code duplicated, block: B:76:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:80:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:86:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:88:0x0106  */
    /* JADX WARN: Code duplicated, block: B:90:0x011b  */
    /* JADX WARN: Code duplicated, block: B:93:0x013b  */
    /* JADX WARN: Code duplicated, block: B:99:0x0161  */
    public static final void a(t4.d dVar, String str, h4.r rVar, long j8, p3.m mVar, int i14, int i15) {
        int i16;
        h4.r rVar2;
        long j14;
        boolean z14;
        h4.r rVar3;
        long j15;
        p3.p2 p2VarI0;
        boolean z15;
        Object objQ;
        p3.m.a aVar;
        Object objA;
        h4.r rVarC;
        long jMo54getIntrinsicSizeNHjbRc;
        h4.r rVar4;
        long jMo54getIntrinsicSizeNHjbRc2;
        boolean z16;
        Object objQ2;
        int i17;
        p3.o0 o0VarE = mVar.E(-2142239481);
        if ((i14 & 6) == 0) {
            i16 = (o0VarE.r(dVar) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= o0VarE.B(str) ? 32 : 16;
        }
        int i18 = i15 & 4;
        if (i18 == 0) {
            if ((i14 & 384) == 0) {
                rVar2 = rVar;
                i16 |= o0VarE.B(rVar2) ? 256 : 128;
            }
            if ((i14 & 3072) == 0) {
                j14 = j8;
                if ((i15 & 8) == 0 || !o0VarE.l(j14)) {
                    i17 = 1024;
                } else {
                    i17 = 2048;
                }
                i16 |= i17;
            } else {
                j14 = j8;
            }
            if ((i16 & 1171) != 1170) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i16 & 1, z14)) {
                o0VarE.G0();
                if ((i14 & 1) != 0 || o0VarE.o0()) {
                    if (i18 != 0) {
                        rVar3 = h4.r.S;
                    } else {
                        rVar3 = rVar2;
                    }
                    if ((i15 & 8) != 0) {
                        j14 = ((o4.d0) o0VarE.A(s2.f89590a)).f128833a;
                        i16 &= -7169;
                    }
                } else {
                    o0VarE.e();
                    if ((i15 & 8) != 0) {
                        i16 &= -7169;
                    }
                    rVar3 = rVar2;
                }
                o0VarE.h0();
                p3.x1 x1Var = p3.n.f135158a;
                z15 = (((i16 & 7168) ^ 3072) <= 2048 && o0VarE.l(j14)) || (i16 & 3072) == 2048;
                objQ = o0VarE.q();
                aVar = p3.m.f135153a;
                if (z15) {
                    o4.d0.f128823b.getClass();
                    if (o4.d0.d(j14, o4.d0.f128832k)) {
                        objA = null;
                    } else {
                        objA = o4.e0.a.a(o4.e0.f128843b, j14);
                    }
                    o0VarE.K(objA);
                } else {
                    aVar.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        o4.d0.f128823b.getClass();
                        if (o4.d0.d(j14, o4.d0.f128832k)) {
                            objA = null;
                        } else {
                            objA = o4.e0.a.a(o4.e0.f128843b, j14);
                        }
                        o0VarE.K(objA);
                    } else {
                        objA = objQ;
                    }
                }
                o4.e0 e0Var = (o4.e0) objA;
                if (str != null) {
                    o0VarE.C(-536990979);
                    h4.r.a aVar2 = h4.r.S;
                    if ((i16 & 112) == 32) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    objQ2 = o0VarE.q();
                    if (z16) {
                        objQ2 = new i11.g(str, 8);
                        o0VarE.K(objQ2);
                    } else {
                        aVar.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new i11.g(str, 8);
                            o0VarE.K(objQ2);
                        }
                    }
                    rVarC = p5.v.c((e23.l) objQ2, aVar2, false);
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(-536832197);
                    o0VarE.g0(false);
                    rVarC = h4.r.S;
                }
                i5.k2.a aVar3 = kotlin.k2.f91249a;
                jMo54getIntrinsicSizeNHjbRc = dVar.getF162260d();
                n4.g.f123559b.getClass();
                if (n4.g.c(jMo54getIntrinsicSizeNHjbRc, n4.g.f123560c)) {
                    rVar4 = f88411a;
                } else {
                    jMo54getIntrinsicSizeNHjbRc2 = dVar.getF162260d();
                    if (Float.isInfinite(Float.intBitsToFloat((int) (jMo54getIntrinsicSizeNHjbRc2 >> 32))) || !Float.isInfinite(Float.intBitsToFloat((int) (jMo54getIntrinsicSizeNHjbRc2 & 4294967295L)))) {
                        rVar4 = h4.r.S;
                    } else {
                        rVar4 = f88411a;
                    }
                }
                h4.r rVarThen = rVar3.then(rVar4);
                f5.k.f68985a.getClass();
                j15 = j14;
                c2.q.a(l4.r.a(rVarThen, dVar, null, f5.k.a.f68988c, 0.0f, e0Var, 22).then(rVarC), o0VarE, 0);
            } else {
                o0VarE.e();
                rVar3 = rVar2;
                j15 = j14;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new b82.b(dVar, str, rVar3, j15, i14, i15, 2);
            }
        }
        i16 |= 384;
        rVar2 = rVar;
        if ((i14 & 3072) == 0) {
            j14 = j8;
            if ((i15 & 8) == 0) {
                i17 = 1024;
            } else {
                i17 = 1024;
            }
            i16 |= i17;
        } else {
            j14 = j8;
        }
        if ((i16 & 1171) != 1170) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (o0VarE.n(i16 & 1, z14)) {
            o0VarE.G0();
            if ((i14 & 1) != 0) {
                if (i18 != 0) {
                    rVar3 = h4.r.S;
                } else {
                    rVar3 = rVar2;
                }
                if ((i15 & 8) != 0) {
                    j14 = ((o4.d0) o0VarE.A(s2.f89590a)).f128833a;
                    i16 &= -7169;
                }
            } else {
                if (i18 != 0) {
                    rVar3 = h4.r.S;
                } else {
                    rVar3 = rVar2;
                }
                if ((i15 & 8) != 0) {
                    j14 = ((o4.d0) o0VarE.A(s2.f89590a)).f128833a;
                    i16 &= -7169;
                }
            }
            o0VarE.h0();
            p3.x1 x1Var2 = p3.n.f135158a;
            if (((i16 & 7168) ^ 3072) <= 2048) {
            }
            objQ = o0VarE.q();
            aVar = p3.m.f135153a;
            if (z15) {
                aVar.getClass();
                if (objQ == p3.m.a.f135155b) {
                    o4.d0.f128823b.getClass();
                    if (o4.d0.d(j14, o4.d0.f128832k)) {
                        objA = null;
                    } else {
                        objA = o4.e0.a.a(o4.e0.f128843b, j14);
                    }
                    o0VarE.K(objA);
                } else {
                    objA = objQ;
                }
            } else {
                o4.d0.f128823b.getClass();
                if (o4.d0.d(j14, o4.d0.f128832k)) {
                    objA = null;
                } else {
                    objA = o4.e0.a.a(o4.e0.f128843b, j14);
                }
                o0VarE.K(objA);
            }
            o4.e0 e0Var2 = (o4.e0) objA;
            if (str != null) {
                o0VarE.C(-536990979);
                h4.r.a aVar4 = h4.r.S;
                if ((i16 & 112) == 32) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                objQ2 = o0VarE.q();
                if (z16) {
                    aVar.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new i11.g(str, 8);
                        o0VarE.K(objQ2);
                    }
                } else {
                    objQ2 = new i11.g(str, 8);
                    o0VarE.K(objQ2);
                }
                rVarC = p5.v.c((e23.l) objQ2, aVar4, false);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-536832197);
                o0VarE.g0(false);
                rVarC = h4.r.S;
            }
            i5.k2.a aVar5 = kotlin.k2.f91249a;
            jMo54getIntrinsicSizeNHjbRc = dVar.getF162260d();
            n4.g.f123559b.getClass();
            if (n4.g.c(jMo54getIntrinsicSizeNHjbRc, n4.g.f123560c)) {
                jMo54getIntrinsicSizeNHjbRc2 = dVar.getF162260d();
                if (Float.isInfinite(Float.intBitsToFloat((int) (jMo54getIntrinsicSizeNHjbRc2 >> 32)))) {
                }
                rVar4 = h4.r.S;
            } else {
                rVar4 = f88411a;
            }
            h4.r rVarThen2 = rVar3.then(rVar4);
            f5.k.f68985a.getClass();
            j15 = j14;
            c2.q.a(l4.r.a(rVarThen2, dVar, null, f5.k.a.f68988c, 0.0f, e0Var2, 22).then(rVarC), o0VarE, 0);
        } else {
            o0VarE.e();
            rVar3 = rVar2;
            j15 = j14;
        }
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new b82.b(dVar, str, rVar3, j15, i14, i15, 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x004c  */
    /* JADX WARN: Code duplicated, block: B:32:0x0050  */
    /* JADX WARN: Code duplicated, block: B:34:0x0058  */
    /* JADX WARN: Code duplicated, block: B:35:0x005b  */
    /* JADX WARN: Code duplicated, block: B:38:0x0061  */
    /* JADX WARN: Code duplicated, block: B:41:0x0069  */
    /* JADX WARN: Code duplicated, block: B:42:0x006b  */
    /* JADX WARN: Code duplicated, block: B:45:0x0074  */
    /* JADX WARN: Code duplicated, block: B:55:0x008e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x0090  */
    /* JADX WARN: Code duplicated, block: B:57:0x0093  */
    /* JADX WARN: Code duplicated, block: B:60:0x0098  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:63:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:66:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:68:? A[RETURN, SYNTHETIC] */
    public static final void b(u4.d dVar, String str, h4.r rVar, long j8, p3.m mVar, int i14, int i15) {
        int i16;
        h4.r rVar2;
        long j14;
        boolean z14;
        long j15;
        h4.r rVar3;
        p3.p2 p2VarI0;
        h4.r rVar4;
        h4.r rVar5;
        long j16;
        p3.o0 o0VarE = mVar.E(-126890956);
        if ((i14 & 6) == 0) {
            i16 = (o0VarE.B(dVar) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= o0VarE.B(str) ? 32 : 16;
        }
        int i17 = i15 & 4;
        if (i17 == 0) {
            if ((i14 & 384) == 0) {
                rVar2 = rVar;
                i16 |= o0VarE.B(rVar2) ? 256 : 128;
            }
            if ((i14 & 3072) == 0) {
                if ((i15 & 8) == 0) {
                    j14 = j8;
                    int i18 = o0VarE.l(j14) ? 2048 : 1024;
                    i16 |= i18;
                } else {
                    j14 = j8;
                }
                i16 |= i18;
            } else {
                j14 = j8;
            }
            if ((i16 & 1171) != 1170) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i16 & 1, z14)) {
                o0VarE.G0();
                if ((i14 & 1) != 0 || o0VarE.o0()) {
                    if (i17 != 0) {
                        rVar4 = h4.r.S;
                    } else {
                        rVar4 = rVar2;
                    }
                    if ((i15 & 8) != 0) {
                        i16 &= -7169;
                        rVar5 = rVar4;
                        j16 = ((o4.d0) o0VarE.A(s2.f89590a)).f128833a;
                    } else {
                        rVar5 = rVar4;
                    }
                    o0VarE.h0();
                    p3.x1 x1Var = p3.n.f135158a;
                    a(u4.p.b(dVar, o0VarE), str, rVar5, j16, o0VarE, (i16 & 112) | 8 | (i16 & 896) | (i16 & 7168), 0);
                    rVar3 = rVar5;
                    j15 = j16;
                } else {
                    o0VarE.e();
                    if ((i15 & 8) != 0) {
                        i16 &= -7169;
                    }
                    rVar5 = rVar2;
                }
                j16 = j14;
                o0VarE.h0();
                p3.x1 x1Var2 = p3.n.f135158a;
                a(u4.p.b(dVar, o0VarE), str, rVar5, j16, o0VarE, (i16 & 112) | 8 | (i16 & 896) | (i16 & 7168), 0);
                rVar3 = rVar5;
                j15 = j16;
            } else {
                o0VarE.e();
                j15 = j14;
                rVar3 = rVar2;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new b82.b(dVar, str, rVar3, j15, i14, i15, 1);
            }
        }
        i16 |= 384;
        rVar2 = rVar;
        if ((i14 & 3072) == 0) {
            if ((i15 & 8) == 0) {
                j14 = j8;
                if (o0VarE.l(j14)) {
                }
                i16 |= i18;
            } else {
                j14 = j8;
            }
            i16 |= i18;
        } else {
            j14 = j8;
        }
        if ((i16 & 1171) != 1170) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (o0VarE.n(i16 & 1, z14)) {
            o0VarE.G0();
            if ((i14 & 1) != 0) {
                if (i17 != 0) {
                    rVar4 = h4.r.S;
                } else {
                    rVar4 = rVar2;
                }
                if ((i15 & 8) != 0) {
                    i16 &= -7169;
                    rVar5 = rVar4;
                    j16 = ((o4.d0) o0VarE.A(s2.f89590a)).f128833a;
                } else {
                    rVar5 = rVar4;
                    j16 = j14;
                }
            } else {
                if (i17 != 0) {
                    rVar4 = h4.r.S;
                } else {
                    rVar4 = rVar2;
                }
                if ((i15 & 8) != 0) {
                    i16 &= -7169;
                    rVar5 = rVar4;
                    j16 = ((o4.d0) o0VarE.A(s2.f89590a)).f128833a;
                } else {
                    rVar5 = rVar4;
                    j16 = j14;
                }
            }
            o0VarE.h0();
            p3.x1 x1Var3 = p3.n.f135158a;
            a(u4.p.b(dVar, o0VarE), str, rVar5, j16, o0VarE, (i16 & 112) | 8 | (i16 & 896) | (i16 & 7168), 0);
            rVar3 = rVar5;
            j15 = j16;
        } else {
            o0VarE.e();
            j15 = j14;
            rVar3 = rVar2;
        }
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new b82.b(dVar, str, rVar3, j15, i14, i15, 1);
        }
    }
}
