package i3;

import com.google.android.exoplayer2.source.ProgressiveMediaSource;

/* JADX INFO: loaded from: classes.dex */
public final class hf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f88346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f88347b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f88348c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f88349d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float f88350e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final s1.h1<Float> f88351f;

    static {
        n3.c1 c1Var = n3.c1.f122741a;
        c1Var.getClass();
        float f14 = n3.c1.f122756p;
        f88346a = f14;
        c1Var.getClass();
        f88347b = n3.c1.f122762v;
        c1Var.getClass();
        f88348c = n3.c1.f122761u;
        c1Var.getClass();
        float f15 = n3.c1.f122758r;
        f88349d = f15;
        float f16 = f15 - f14;
        g6.f.a aVar = g6.f.f75994b;
        f88350e = f16 / 2;
        f88351f = new s1.h1<>(0, 1, null);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0051  */
    /* JADX WARN: Code duplicated, block: B:32:0x0056  */
    /* JADX WARN: Code duplicated, block: B:34:0x005a  */
    /* JADX WARN: Code duplicated, block: B:36:0x0062  */
    /* JADX WARN: Code duplicated, block: B:37:0x0065  */
    /* JADX WARN: Code duplicated, block: B:41:0x006f  */
    /* JADX WARN: Code duplicated, block: B:43:0x0075  */
    /* JADX WARN: Code duplicated, block: B:44:0x0078  */
    /* JADX WARN: Code duplicated, block: B:48:0x0089  */
    /* JADX WARN: Code duplicated, block: B:49:0x008b  */
    /* JADX WARN: Code duplicated, block: B:52:0x0094  */
    /* JADX WARN: Code duplicated, block: B:54:0x009b  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:59:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:67:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:71:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:73:0x0134  */
    /* JADX WARN: Code duplicated, block: B:76:0x013f  */
    /* JADX WARN: Code duplicated, block: B:78:? A[RETURN, SYNTHETIC] */
    public static final void a(boolean z14, e23.l lVar, h4.r rVar, boolean z15, ef efVar, p3.m mVar, int i14, int i15) {
        int i16;
        h4.r rVar2;
        int i17;
        int i18;
        boolean z16;
        int i19;
        int i24;
        boolean z17;
        h4.r rVar3;
        boolean z18;
        p3.p2 p2VarI0;
        h4.r rVar4;
        h4.r rVar5;
        Object objQ;
        a2.j jVar;
        a2.j jVar2;
        h4.r rVarA;
        int i25;
        p3.o0 o0VarE = mVar.E(-263339167);
        if ((i14 & 6) == 0) {
            i16 = (o0VarE.h(z14) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= o0VarE.r(lVar) ? 32 : 16;
        }
        int i26 = i15 & 4;
        if (i26 == 0) {
            if ((i14 & 384) == 0) {
                rVar2 = rVar;
                i16 |= o0VarE.B(rVar2) ? 256 : 128;
            }
            i17 = i16 | 3072;
            i18 = i15 & 16;
            if (i18 != 0) {
                if ((i14 & 24576) == 0) {
                    z16 = z15;
                    if (o0VarE.h(z16)) {
                        i19 = 16384;
                    } else {
                        i19 = 8192;
                    }
                    i17 |= i19;
                }
                if ((196608 & i14) == 0) {
                    if (o0VarE.B(efVar)) {
                        i25 = 131072;
                    } else {
                        i25 = 65536;
                    }
                    i17 |= i25;
                }
                i24 = 1572864 | i17;
                if ((599187 & i24) != 599186) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (o0VarE.n(i24 & 1, z17)) {
                    o0VarE.G0();
                    if ((i14 & 1) != 0 || o0VarE.o0()) {
                        if (i26 != 0) {
                            rVar4 = h4.r.S;
                        } else {
                            rVar4 = rVar2;
                        }
                        rVar5 = rVar4;
                        z18 = i18 == 0 ? z16 : true;
                    } else {
                        o0VarE.e();
                        rVar5 = rVar2;
                        z18 = z16;
                    }
                    o0VarE.h0();
                    p3.x1 x1Var = p3.n.f135158a;
                    o0VarE.C(1768604058);
                    objQ = o0VarE.q();
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = kg.f.b(o0VarE);
                    }
                    jVar = (a2.j) objQ;
                    o0VarE.g0(false);
                    if (lVar != null) {
                        h4.r.a aVar = h4.r.S;
                        f5.p pVar = p7.f89279a;
                        jVar2 = jVar;
                        d8 d8Var = d8.f87832a;
                        aVar.getClass();
                        p5.l.f136032b.getClass();
                        rVarA = j2.g.a(d8Var, z14, jVar2, null, z18, p5.l.a(p5.l.f136034d), lVar);
                    } else {
                        jVar2 = jVar;
                        rVarA = h4.r.S;
                    }
                    h4.r rVarThen = rVar5.then(rVarA);
                    h4.d.f81522a.getClass();
                    h4.r rVarN = c2.x2.n(c2.x2.y(rVarThen, h4.d.a.f81528f, 2), f88348c, f88349d);
                    n3.c1.f122741a.getClass();
                    int i27 = i24 << 3;
                    int i28 = i24 >> 6;
                    rVar3 = rVar5;
                    b(rVarN, z14, z18, efVar, jVar2, fc.c(n3.c1.f122754n, o0VarE), o0VarE, (i27 & 112) | (i28 & 896) | (i28 & 7168) | (i27 & 57344));
                } else {
                    o0VarE.e();
                    rVar3 = rVar2;
                    z18 = z16;
                }
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new cw1.v0(z14, lVar, rVar3, z18, efVar, i14, i15, 4);
                }
            }
            i17 = i16 | 27648;
            z16 = z15;
            if ((196608 & i14) == 0) {
                if (o0VarE.B(efVar)) {
                    i25 = 131072;
                } else {
                    i25 = 65536;
                }
                i17 |= i25;
            }
            i24 = 1572864 | i17;
            if ((599187 & i24) != 599186) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (o0VarE.n(i24 & 1, z17)) {
                o0VarE.G0();
                if ((i14 & 1) != 0) {
                    if (i26 != 0) {
                        rVar4 = h4.r.S;
                    } else {
                        rVar4 = rVar2;
                    }
                    rVar5 = rVar4;
                    z18 = i18 == 0 ? z16 : true;
                } else {
                    if (i26 != 0) {
                        rVar4 = h4.r.S;
                    } else {
                        rVar4 = rVar2;
                    }
                    rVar5 = rVar4;
                    z18 = i18 == 0 ? z16 : true;
                }
                o0VarE.h0();
                p3.x1 x1Var2 = p3.n.f135158a;
                o0VarE.C(1768604058);
                objQ = o0VarE.q();
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = kg.f.b(o0VarE);
                }
                jVar = (a2.j) objQ;
                o0VarE.g0(false);
                if (lVar != null) {
                    h4.r.a aVar2 = h4.r.S;
                    f5.p pVar2 = p7.f89279a;
                    jVar2 = jVar;
                    d8 d8Var2 = d8.f87832a;
                    aVar2.getClass();
                    p5.l.f136032b.getClass();
                    rVarA = j2.g.a(d8Var2, z14, jVar2, null, z18, p5.l.a(p5.l.f136034d), lVar);
                } else {
                    jVar2 = jVar;
                    rVarA = h4.r.S;
                }
                h4.r rVarThen2 = rVar5.then(rVarA);
                h4.d.f81522a.getClass();
                h4.r rVarN2 = c2.x2.n(c2.x2.y(rVarThen2, h4.d.a.f81528f, 2), f88348c, f88349d);
                n3.c1.f122741a.getClass();
                int i29 = i24 << 3;
                int i210 = i24 >> 6;
                rVar3 = rVar5;
                b(rVarN2, z14, z18, efVar, jVar2, fc.c(n3.c1.f122754n, o0VarE), o0VarE, (i29 & 112) | (i210 & 896) | (i210 & 7168) | (i29 & 57344));
            } else {
                o0VarE.e();
                rVar3 = rVar2;
                z18 = z16;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new cw1.v0(z14, lVar, rVar3, z18, efVar, i14, i15, 4);
            }
        }
        i16 |= 384;
        rVar2 = rVar;
        i17 = i16 | 3072;
        i18 = i15 & 16;
        if (i18 != 0) {
            if ((i14 & 24576) == 0) {
                z16 = z15;
                if (o0VarE.h(z16)) {
                    i19 = 16384;
                } else {
                    i19 = 8192;
                }
                i17 |= i19;
            }
            if ((196608 & i14) == 0) {
                if (o0VarE.B(efVar)) {
                    i25 = 131072;
                } else {
                    i25 = 65536;
                }
                i17 |= i25;
            }
            i24 = 1572864 | i17;
            if ((599187 & i24) != 599186) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (o0VarE.n(i24 & 1, z17)) {
                o0VarE.G0();
                if ((i14 & 1) != 0) {
                    if (i26 != 0) {
                        rVar4 = h4.r.S;
                    } else {
                        rVar4 = rVar2;
                    }
                    rVar5 = rVar4;
                    z18 = i18 == 0 ? z16 : true;
                } else {
                    if (i26 != 0) {
                        rVar4 = h4.r.S;
                    } else {
                        rVar4 = rVar2;
                    }
                    rVar5 = rVar4;
                    z18 = i18 == 0 ? z16 : true;
                }
                o0VarE.h0();
                p3.x1 x1Var3 = p3.n.f135158a;
                o0VarE.C(1768604058);
                objQ = o0VarE.q();
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = kg.f.b(o0VarE);
                }
                jVar = (a2.j) objQ;
                o0VarE.g0(false);
                if (lVar != null) {
                    h4.r.a aVar3 = h4.r.S;
                    f5.p pVar3 = p7.f89279a;
                    jVar2 = jVar;
                    d8 d8Var3 = d8.f87832a;
                    aVar3.getClass();
                    p5.l.f136032b.getClass();
                    rVarA = j2.g.a(d8Var3, z14, jVar2, null, z18, p5.l.a(p5.l.f136034d), lVar);
                } else {
                    jVar2 = jVar;
                    rVarA = h4.r.S;
                }
                h4.r rVarThen3 = rVar5.then(rVarA);
                h4.d.f81522a.getClass();
                h4.r rVarN3 = c2.x2.n(c2.x2.y(rVarThen3, h4.d.a.f81528f, 2), f88348c, f88349d);
                n3.c1.f122741a.getClass();
                int i211 = i24 << 3;
                int i212 = i24 >> 6;
                rVar3 = rVar5;
                b(rVarN3, z14, z18, efVar, jVar2, fc.c(n3.c1.f122754n, o0VarE), o0VarE, (i211 & 112) | (i212 & 896) | (i212 & 7168) | (i211 & 57344));
            } else {
                o0VarE.e();
                rVar3 = rVar2;
                z18 = z16;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new cw1.v0(z14, lVar, rVar3, z18, efVar, i14, i15, 4);
            }
        }
        i17 = i16 | 27648;
        z16 = z15;
        if ((196608 & i14) == 0) {
            if (o0VarE.B(efVar)) {
                i25 = 131072;
            } else {
                i25 = 65536;
            }
            i17 |= i25;
        }
        i24 = 1572864 | i17;
        if ((599187 & i24) != 599186) {
            z17 = true;
        } else {
            z17 = false;
        }
        if (o0VarE.n(i24 & 1, z17)) {
            o0VarE.G0();
            if ((i14 & 1) != 0) {
                if (i26 != 0) {
                    rVar4 = h4.r.S;
                } else {
                    rVar4 = rVar2;
                }
                rVar5 = rVar4;
                z18 = i18 == 0 ? z16 : true;
            } else {
                if (i26 != 0) {
                    rVar4 = h4.r.S;
                } else {
                    rVar4 = rVar2;
                }
                rVar5 = rVar4;
                z18 = i18 == 0 ? z16 : true;
            }
            o0VarE.h0();
            p3.x1 x1Var4 = p3.n.f135158a;
            o0VarE.C(1768604058);
            objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = kg.f.b(o0VarE);
            }
            jVar = (a2.j) objQ;
            o0VarE.g0(false);
            if (lVar != null) {
                h4.r.a aVar4 = h4.r.S;
                f5.p pVar4 = p7.f89279a;
                jVar2 = jVar;
                d8 d8Var4 = d8.f87832a;
                aVar4.getClass();
                p5.l.f136032b.getClass();
                rVarA = j2.g.a(d8Var4, z14, jVar2, null, z18, p5.l.a(p5.l.f136034d), lVar);
            } else {
                jVar2 = jVar;
                rVarA = h4.r.S;
            }
            h4.r rVarThen4 = rVar5.then(rVarA);
            h4.d.f81522a.getClass();
            h4.r rVarN4 = c2.x2.n(c2.x2.y(rVarThen4, h4.d.a.f81528f, 2), f88348c, f88349d);
            n3.c1.f122741a.getClass();
            int i213 = i24 << 3;
            int i214 = i24 >> 6;
            rVar3 = rVar5;
            b(rVarN4, z14, z18, efVar, jVar2, fc.c(n3.c1.f122754n, o0VarE), o0VarE, (i213 & 112) | (i214 & 896) | (i214 & 7168) | (i213 & 57344));
        } else {
            o0VarE.e();
            rVar3 = rVar2;
            z18 = z16;
        }
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new cw1.v0(z14, lVar, rVar3, z18, efVar, i14, i15, 4);
        }
    }

    public static final void b(h4.r rVar, boolean z14, boolean z15, ef efVar, a2.i iVar, o4.r1 r1Var, p3.m mVar, int i14) {
        int i15;
        long j8;
        long j14;
        p3.c<?> cVar;
        long j15;
        p3.o0 o0VarE = mVar.E(-670917213);
        p3.c<?> cVar2 = o0VarE.f135177b;
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.h(z14) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.h(z15) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.B(efVar) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.r(null) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i15 |= o0VarE.B(iVar) ? 131072 : 65536;
        }
        if ((1572864 & i14) == 0) {
            i15 |= o0VarE.B(r1Var) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if (o0VarE.n(i15 & 1, (599187 & i15) != 599186)) {
            p3.x1 x1Var = p3.n.f135158a;
            if (z15) {
                j8 = z14 ? efVar.f88004b : efVar.f88008f;
            } else {
                j8 = z14 ? efVar.f88012j : efVar.f88016n;
            }
            if (z15) {
                j14 = z14 ? efVar.f88003a : efVar.f88007e;
            } else {
                j14 = z14 ? efVar.f88011i : efVar.f88015m;
            }
            n3.c1.f122741a.getClass();
            o4.r1 r1VarC = fc.c(n3.c1.f122760t, o0VarE);
            float f14 = n3.c1.f122759s;
            if (z15) {
                cVar = cVar2;
                j15 = z14 ? efVar.f88005c : efVar.f88009g;
            } else {
                cVar = cVar2;
                j15 = z14 ? efVar.f88013k : efVar.f88017o;
            }
            h4.r rVarE = u1.n.e(u1.q.b(f14, j15, rVar, r1VarC), j8, r1VarC);
            h4.d.f81522a.getClass();
            f5.z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
            int iP = o0VarE.P();
            p3.i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarE, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar = h5.g.a.f81805b;
            if (cVar == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar = h5.g.a.f81810g;
            p3.b4.c(eVar, z0VarD, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            p3.b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iP))) {
                v.h.A(iP, o0VarE, iP, bVar);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            p3.b4.c(fVar, rVarC, o0VarE);
            h4.r rVarThen = c2.u.f22885a.c(h4.r.S, h4.d.a.f81527e).then(new nh(iVar, z14, k9.b(n3.h0.FastSpatial, o0VarE)));
            float f15 = n3.c1.f122757q / 2;
            g6.f.a aVar2 = g6.f.f75994b;
            h4.r rVarE2 = u1.n.e(u1.b1.a(rVarThen, iVar, fb.a(f15, 4, 0L, false)), j14, r1Var);
            f5.z0 z0VarD2 = c2.q.d(h4.d.a.f81528f, false);
            int iP2 = o0VarE.P();
            p3.i2 i2VarA1 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(rVarE2, o0VarE);
            if (cVar == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar);
            } else {
                o0VarE.c();
            }
            p3.b4.c(eVar, z0VarD2, o0VarE);
            p3.b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iP2))) {
                v.h.A(iP2, o0VarE, iP2, bVar);
            }
            p3.b4.c(fVar, rVarC2, o0VarE);
            o0VarE.C(1236071411);
            o0VarE.g0(false);
            o0VarE.g0(true);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new gf(rVar, z14, z15, efVar, iVar, r1Var, i14, 0);
        }
    }
}
