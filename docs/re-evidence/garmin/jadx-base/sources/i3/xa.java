package i3;

/* JADX INFO: loaded from: classes.dex */
public final class xa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f90303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f90304b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f90305c;

    static {
        float f14 = 2;
        g6.f.a aVar = g6.f.f75994b;
        f90303a = f14;
        f90304b = 12;
        f90305c = f14;
    }

    /* JADX WARN: Code duplicated, block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0052  */
    /* JADX WARN: Code duplicated, block: B:32:0x0057  */
    /* JADX WARN: Code duplicated, block: B:34:0x005b  */
    /* JADX WARN: Code duplicated, block: B:36:0x0063  */
    /* JADX WARN: Code duplicated, block: B:37:0x0066  */
    /* JADX WARN: Code duplicated, block: B:41:0x006d  */
    /* JADX WARN: Code duplicated, block: B:43:0x0073  */
    /* JADX WARN: Code duplicated, block: B:44:0x0076  */
    /* JADX WARN: Code duplicated, block: B:48:0x0087  */
    /* JADX WARN: Code duplicated, block: B:49:0x0089  */
    /* JADX WARN: Code duplicated, block: B:52:0x0091  */
    /* JADX WARN: Code duplicated, block: B:54:0x0098  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:61:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:68:0x00be  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:73:0x00d8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x00da A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:76:0x00df A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:77:0x00e1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:79:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:81:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:83:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:85:0x0113  */
    /* JADX WARN: Code duplicated, block: B:86:0x0141  */
    /* JADX WARN: Code duplicated, block: B:88:0x0147  */
    /* JADX WARN: Code duplicated, block: B:89:0x0151  */
    /* JADX WARN: Code duplicated, block: B:92:0x0186  */
    /* JADX WARN: Code duplicated, block: B:94:0x018f  */
    /* JADX WARN: Code duplicated, block: B:96:0x019f  */
    /* JADX WARN: Code duplicated, block: B:99:0x01aa  */
    public static final void a(boolean z14, e23.a aVar, h4.r rVar, boolean z15, va vaVar, p3.m mVar, int i14, int i15) {
        int i16;
        h4.r rVar2;
        int i17;
        boolean z16;
        int i18;
        int i19;
        boolean z17;
        h4.r rVar3;
        boolean z18;
        p3.p2 p2VarI0;
        h4.r rVar4;
        float f14;
        p3.x3 x3VarA;
        long j8;
        Object objQ;
        Object obj;
        h4.r rVar5;
        h4.r rVarA;
        h4.r rVar6;
        boolean zB;
        Object objQ2;
        int i24;
        p3.o0 o0VarE = mVar.E(408580840);
        if ((i14 & 6) == 0) {
            i16 = (o0VarE.h(z14) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= o0VarE.r(aVar) ? 32 : 16;
        }
        int i25 = i15 & 4;
        if (i25 == 0) {
            if ((i14 & 384) == 0) {
                rVar2 = rVar;
                i16 |= o0VarE.B(rVar2) ? 256 : 128;
            }
            i17 = i15 & 8;
            if (i17 != 0) {
                if ((i14 & 3072) == 0) {
                    z16 = z15;
                    if (o0VarE.h(z16)) {
                        i18 = 2048;
                    } else {
                        i18 = 1024;
                    }
                    i16 |= i18;
                }
                if ((i14 & 24576) == 0) {
                    if (o0VarE.B(vaVar)) {
                        i24 = 16384;
                    } else {
                        i24 = 8192;
                    }
                    i16 |= i24;
                }
                i19 = i16 | 196608;
                if ((74899 & i19) != 74898) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (o0VarE.n(i19 & 1, z17)) {
                    o0VarE.G0();
                    if ((i14 & 1) != 0 || o0VarE.o0()) {
                        if (i25 != 0) {
                            rVar4 = h4.r.S;
                        } else {
                            rVar4 = rVar2;
                        }
                        if (i17 != 0) {
                            z16 = true;
                        }
                    } else {
                        o0VarE.e();
                        rVar4 = rVar2;
                    }
                    z18 = z16;
                    o0VarE.h0();
                    p3.x1 x1Var = p3.n.f135158a;
                    if (z14) {
                        f14 = f90304b / 2;
                        g6.f.a aVar2 = g6.f.f75994b;
                    } else {
                        f14 = 0;
                        g6.f.a aVar3 = g6.f.f75994b;
                    }
                    x3VarA = s1.f.a(f14, k9.b(n3.h0.FastSpatial, o0VarE), null, o0VarE, 0, 12);
                    if (!z18 && z14) {
                        j8 = vaVar.f90004a;
                    } else if (!z18 && !z14) {
                        j8 = vaVar.f90005b;
                    } else if (z18 && z14) {
                        j8 = vaVar.f90006c;
                    } else {
                        j8 = vaVar.f90007d;
                    }
                    if (z18) {
                        o0VarE.C(1194696477);
                        objQ = r1.f2.a(j8, k9.b(n3.h0.DefaultEffects, o0VarE), o0VarE);
                        o0VarE.g0(false);
                    } else {
                        o0VarE.C(1194874138);
                        objQ = p3.p0.q(o4.d0.a(j8), o0VarE);
                        o0VarE.g0(false);
                    }
                    obj = objQ;
                    if (aVar != null) {
                        h4.r rVar7 = rVar4;
                        h4.r.a aVar4 = h4.r.S;
                        p5.l.f136032b.getClass();
                        int i26 = p5.l.f136035e;
                        n3.s0.f123251a.getClass();
                        gb gbVarA = fb.a(n3.s0.f123256f / 2, 4, 0L, false);
                        p5.l lVarA = p5.l.a(i26);
                        rVar5 = rVar7;
                        rVarA = j2.b.a(aVar4, z14, null, gbVarA, z18, lVarA, aVar);
                    } else {
                        rVar5 = rVar4;
                        rVarA = h4.r.S;
                    }
                    if (aVar != null) {
                        h4.r.a aVar5 = h4.r.S;
                        f5.p pVar = p7.f89279a;
                        rVar6 = d8.f87832a;
                        aVar5.getClass();
                    } else {
                        rVar6 = h4.r.S;
                    }
                    h4.r rVarThen = rVar5.then(rVar6).then(rVarA);
                    h4.d.f81522a.getClass();
                    h4.r rVarY = c2.l.y(c2.x2.y(rVarThen, h4.d.a.f81528f, 2), f90303a);
                    n3.s0.f123251a.getClass();
                    h4.r rVarM = c2.x2.m(rVarY, n3.s0.f123254d);
                    zB = o0VarE.B(obj) | o0VarE.B(x3VarA);
                    objQ2 = o0VarE.q();
                    if (zB) {
                        objQ2 = new hy.h(5, obj, x3VarA);
                        o0VarE.K(objQ2);
                    } else {
                        p3.m.f135153a.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new hy.h(5, obj, x3VarA);
                            o0VarE.K(objQ2);
                        }
                    }
                    u1.n.b(rVarM, (e23.l) objQ2, o0VarE, 0);
                    rVar3 = rVar5;
                } else {
                    o0VarE.e();
                    rVar3 = rVar2;
                    z18 = z16;
                }
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new cw1.v0(z14, aVar, rVar3, z18, vaVar, i14, i15);
                }
            }
            i16 |= 3072;
            z16 = z15;
            if ((i14 & 24576) == 0) {
                if (o0VarE.B(vaVar)) {
                    i24 = 16384;
                } else {
                    i24 = 8192;
                }
                i16 |= i24;
            }
            i19 = i16 | 196608;
            if ((74899 & i19) != 74898) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (o0VarE.n(i19 & 1, z17)) {
                o0VarE.G0();
                if ((i14 & 1) != 0) {
                    if (i25 != 0) {
                        rVar4 = h4.r.S;
                    } else {
                        rVar4 = rVar2;
                    }
                    if (i17 != 0) {
                        z16 = true;
                    }
                } else {
                    if (i25 != 0) {
                        rVar4 = h4.r.S;
                    } else {
                        rVar4 = rVar2;
                    }
                    if (i17 != 0) {
                        z16 = true;
                    }
                }
                z18 = z16;
                o0VarE.h0();
                p3.x1 x1Var2 = p3.n.f135158a;
                if (z14) {
                    f14 = f90304b / 2;
                    g6.f.a aVar6 = g6.f.f75994b;
                } else {
                    f14 = 0;
                    g6.f.a aVar7 = g6.f.f75994b;
                }
                x3VarA = s1.f.a(f14, k9.b(n3.h0.FastSpatial, o0VarE), null, o0VarE, 0, 12);
                if (!z18) {
                    if (!z18) {
                        if (z18) {
                            j8 = vaVar.f90007d;
                        } else {
                            j8 = vaVar.f90007d;
                        }
                    } else if (z18) {
                        j8 = vaVar.f90007d;
                    } else {
                        j8 = vaVar.f90007d;
                    }
                } else if (!z18) {
                    if (z18) {
                        j8 = vaVar.f90007d;
                    } else {
                        j8 = vaVar.f90007d;
                    }
                } else if (z18) {
                    j8 = vaVar.f90007d;
                } else {
                    j8 = vaVar.f90007d;
                }
                if (z18) {
                    o0VarE.C(1194696477);
                    objQ = r1.f2.a(j8, k9.b(n3.h0.DefaultEffects, o0VarE), o0VarE);
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(1194874138);
                    objQ = p3.p0.q(o4.d0.a(j8), o0VarE);
                    o0VarE.g0(false);
                }
                obj = objQ;
                if (aVar != null) {
                    h4.r rVar8 = rVar4;
                    h4.r.a aVar8 = h4.r.S;
                    p5.l.f136032b.getClass();
                    int i27 = p5.l.f136035e;
                    n3.s0.f123251a.getClass();
                    gb gbVarA2 = fb.a(n3.s0.f123256f / 2, 4, 0L, false);
                    p5.l lVarA2 = p5.l.a(i27);
                    rVar5 = rVar8;
                    rVarA = j2.b.a(aVar8, z14, null, gbVarA2, z18, lVarA2, aVar);
                } else {
                    rVar5 = rVar4;
                    rVarA = h4.r.S;
                }
                if (aVar != null) {
                    h4.r.a aVar9 = h4.r.S;
                    f5.p pVar2 = p7.f89279a;
                    rVar6 = d8.f87832a;
                    aVar9.getClass();
                } else {
                    rVar6 = h4.r.S;
                }
                h4.r rVarThen2 = rVar5.then(rVar6).then(rVarA);
                h4.d.f81522a.getClass();
                h4.r rVarY2 = c2.l.y(c2.x2.y(rVarThen2, h4.d.a.f81528f, 2), f90303a);
                n3.s0.f123251a.getClass();
                h4.r rVarM2 = c2.x2.m(rVarY2, n3.s0.f123254d);
                zB = o0VarE.B(obj) | o0VarE.B(x3VarA);
                objQ2 = o0VarE.q();
                if (zB) {
                    p3.m.f135153a.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new hy.h(5, obj, x3VarA);
                        o0VarE.K(objQ2);
                    }
                } else {
                    objQ2 = new hy.h(5, obj, x3VarA);
                    o0VarE.K(objQ2);
                }
                u1.n.b(rVarM2, (e23.l) objQ2, o0VarE, 0);
                rVar3 = rVar5;
            } else {
                o0VarE.e();
                rVar3 = rVar2;
                z18 = z16;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new cw1.v0(z14, aVar, rVar3, z18, vaVar, i14, i15);
            }
        }
        i16 |= 384;
        rVar2 = rVar;
        i17 = i15 & 8;
        if (i17 != 0) {
            if ((i14 & 3072) == 0) {
                z16 = z15;
                if (o0VarE.h(z16)) {
                    i18 = 2048;
                } else {
                    i18 = 1024;
                }
                i16 |= i18;
            }
            if ((i14 & 24576) == 0) {
                if (o0VarE.B(vaVar)) {
                    i24 = 16384;
                } else {
                    i24 = 8192;
                }
                i16 |= i24;
            }
            i19 = i16 | 196608;
            if ((74899 & i19) != 74898) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (o0VarE.n(i19 & 1, z17)) {
                o0VarE.G0();
                if ((i14 & 1) != 0) {
                    if (i25 != 0) {
                        rVar4 = h4.r.S;
                    } else {
                        rVar4 = rVar2;
                    }
                    if (i17 != 0) {
                        z16 = true;
                    }
                } else {
                    if (i25 != 0) {
                        rVar4 = h4.r.S;
                    } else {
                        rVar4 = rVar2;
                    }
                    if (i17 != 0) {
                        z16 = true;
                    }
                }
                z18 = z16;
                o0VarE.h0();
                p3.x1 x1Var3 = p3.n.f135158a;
                if (z14) {
                    f14 = f90304b / 2;
                    g6.f.a aVar10 = g6.f.f75994b;
                } else {
                    f14 = 0;
                    g6.f.a aVar11 = g6.f.f75994b;
                }
                x3VarA = s1.f.a(f14, k9.b(n3.h0.FastSpatial, o0VarE), null, o0VarE, 0, 12);
                if (!z18) {
                    if (!z18) {
                        if (z18) {
                            j8 = vaVar.f90007d;
                        } else {
                            j8 = vaVar.f90007d;
                        }
                    } else if (z18) {
                        j8 = vaVar.f90007d;
                    } else {
                        j8 = vaVar.f90007d;
                    }
                } else if (!z18) {
                    if (z18) {
                        j8 = vaVar.f90007d;
                    } else {
                        j8 = vaVar.f90007d;
                    }
                } else if (z18) {
                    j8 = vaVar.f90007d;
                } else {
                    j8 = vaVar.f90007d;
                }
                if (z18) {
                    o0VarE.C(1194696477);
                    objQ = r1.f2.a(j8, k9.b(n3.h0.DefaultEffects, o0VarE), o0VarE);
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(1194874138);
                    objQ = p3.p0.q(o4.d0.a(j8), o0VarE);
                    o0VarE.g0(false);
                }
                obj = objQ;
                if (aVar != null) {
                    h4.r rVar9 = rVar4;
                    h4.r.a aVar12 = h4.r.S;
                    p5.l.f136032b.getClass();
                    int i28 = p5.l.f136035e;
                    n3.s0.f123251a.getClass();
                    gb gbVarA3 = fb.a(n3.s0.f123256f / 2, 4, 0L, false);
                    p5.l lVarA3 = p5.l.a(i28);
                    rVar5 = rVar9;
                    rVarA = j2.b.a(aVar12, z14, null, gbVarA3, z18, lVarA3, aVar);
                } else {
                    rVar5 = rVar4;
                    rVarA = h4.r.S;
                }
                if (aVar != null) {
                    h4.r.a aVar13 = h4.r.S;
                    f5.p pVar3 = p7.f89279a;
                    rVar6 = d8.f87832a;
                    aVar13.getClass();
                } else {
                    rVar6 = h4.r.S;
                }
                h4.r rVarThen3 = rVar5.then(rVar6).then(rVarA);
                h4.d.f81522a.getClass();
                h4.r rVarY3 = c2.l.y(c2.x2.y(rVarThen3, h4.d.a.f81528f, 2), f90303a);
                n3.s0.f123251a.getClass();
                h4.r rVarM3 = c2.x2.m(rVarY3, n3.s0.f123254d);
                zB = o0VarE.B(obj) | o0VarE.B(x3VarA);
                objQ2 = o0VarE.q();
                if (zB) {
                    p3.m.f135153a.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new hy.h(5, obj, x3VarA);
                        o0VarE.K(objQ2);
                    }
                } else {
                    objQ2 = new hy.h(5, obj, x3VarA);
                    o0VarE.K(objQ2);
                }
                u1.n.b(rVarM3, (e23.l) objQ2, o0VarE, 0);
                rVar3 = rVar5;
            } else {
                o0VarE.e();
                rVar3 = rVar2;
                z18 = z16;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new cw1.v0(z14, aVar, rVar3, z18, vaVar, i14, i15);
            }
        }
        i16 |= 3072;
        z16 = z15;
        if ((i14 & 24576) == 0) {
            if (o0VarE.B(vaVar)) {
                i24 = 16384;
            } else {
                i24 = 8192;
            }
            i16 |= i24;
        }
        i19 = i16 | 196608;
        if ((74899 & i19) != 74898) {
            z17 = true;
        } else {
            z17 = false;
        }
        if (o0VarE.n(i19 & 1, z17)) {
            o0VarE.G0();
            if ((i14 & 1) != 0) {
                if (i25 != 0) {
                    rVar4 = h4.r.S;
                } else {
                    rVar4 = rVar2;
                }
                if (i17 != 0) {
                    z16 = true;
                }
            } else {
                if (i25 != 0) {
                    rVar4 = h4.r.S;
                } else {
                    rVar4 = rVar2;
                }
                if (i17 != 0) {
                    z16 = true;
                }
            }
            z18 = z16;
            o0VarE.h0();
            p3.x1 x1Var4 = p3.n.f135158a;
            if (z14) {
                f14 = f90304b / 2;
                g6.f.a aVar14 = g6.f.f75994b;
            } else {
                f14 = 0;
                g6.f.a aVar15 = g6.f.f75994b;
            }
            x3VarA = s1.f.a(f14, k9.b(n3.h0.FastSpatial, o0VarE), null, o0VarE, 0, 12);
            if (!z18) {
                if (!z18) {
                    if (z18) {
                        j8 = vaVar.f90007d;
                    } else {
                        j8 = vaVar.f90007d;
                    }
                } else if (z18) {
                    j8 = vaVar.f90007d;
                } else {
                    j8 = vaVar.f90007d;
                }
            } else if (!z18) {
                if (z18) {
                    j8 = vaVar.f90007d;
                } else {
                    j8 = vaVar.f90007d;
                }
            } else if (z18) {
                j8 = vaVar.f90007d;
            } else {
                j8 = vaVar.f90007d;
            }
            if (z18) {
                o0VarE.C(1194696477);
                objQ = r1.f2.a(j8, k9.b(n3.h0.DefaultEffects, o0VarE), o0VarE);
                o0VarE.g0(false);
            } else {
                o0VarE.C(1194874138);
                objQ = p3.p0.q(o4.d0.a(j8), o0VarE);
                o0VarE.g0(false);
            }
            obj = objQ;
            if (aVar != null) {
                h4.r rVar10 = rVar4;
                h4.r.a aVar16 = h4.r.S;
                p5.l.f136032b.getClass();
                int i29 = p5.l.f136035e;
                n3.s0.f123251a.getClass();
                gb gbVarA4 = fb.a(n3.s0.f123256f / 2, 4, 0L, false);
                p5.l lVarA4 = p5.l.a(i29);
                rVar5 = rVar10;
                rVarA = j2.b.a(aVar16, z14, null, gbVarA4, z18, lVarA4, aVar);
            } else {
                rVar5 = rVar4;
                rVarA = h4.r.S;
            }
            if (aVar != null) {
                h4.r.a aVar17 = h4.r.S;
                f5.p pVar4 = p7.f89279a;
                rVar6 = d8.f87832a;
                aVar17.getClass();
            } else {
                rVar6 = h4.r.S;
            }
            h4.r rVarThen4 = rVar5.then(rVar6).then(rVarA);
            h4.d.f81522a.getClass();
            h4.r rVarY4 = c2.l.y(c2.x2.y(rVarThen4, h4.d.a.f81528f, 2), f90303a);
            n3.s0.f123251a.getClass();
            h4.r rVarM4 = c2.x2.m(rVarY4, n3.s0.f123254d);
            zB = o0VarE.B(obj) | o0VarE.B(x3VarA);
            objQ2 = o0VarE.q();
            if (zB) {
                p3.m.f135153a.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new hy.h(5, obj, x3VarA);
                    o0VarE.K(objQ2);
                }
            } else {
                objQ2 = new hy.h(5, obj, x3VarA);
                o0VarE.K(objQ2);
            }
            u1.n.b(rVarM4, (e23.l) objQ2, o0VarE, 0);
            rVar3 = rVar5;
        } else {
            o0VarE.e();
            rVar3 = rVar2;
            z18 = z16;
        }
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new cw1.v0(z14, aVar, rVar3, z18, vaVar, i14, i15);
        }
    }
}
