package i3;

import com.google.android.exoplayer2.source.ProgressiveMediaSource;

/* JADX INFO: loaded from: classes.dex */
public final class h7 {
    /* JADX WARN: Code duplicated, block: B:23:0x003c  */
    /* JADX WARN: Code duplicated, block: B:25:0x0041  */
    /* JADX WARN: Code duplicated, block: B:27:0x0045  */
    /* JADX WARN: Code duplicated, block: B:29:0x004d  */
    /* JADX WARN: Code duplicated, block: B:30:0x0050  */
    /* JADX WARN: Code duplicated, block: B:34:0x0057  */
    /* JADX WARN: Code duplicated, block: B:36:0x005b  */
    /* JADX WARN: Code duplicated, block: B:38:0x0063  */
    /* JADX WARN: Code duplicated, block: B:39:0x0066  */
    /* JADX WARN: Code duplicated, block: B:42:0x006c  */
    /* JADX WARN: Code duplicated, block: B:45:0x0075  */
    /* JADX WARN: Code duplicated, block: B:48:0x0080  */
    /* JADX WARN: Code duplicated, block: B:50:0x0086  */
    /* JADX WARN: Code duplicated, block: B:51:0x0089  */
    /* JADX WARN: Code duplicated, block: B:55:0x0096  */
    /* JADX WARN: Code duplicated, block: B:56:0x0098  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:69:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:73:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:77:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:80:0x011d  */
    /* JADX WARN: Code duplicated, block: B:83:0x012a  */
    /* JADX WARN: Code duplicated, block: B:85:? A[RETURN, SYNTHETIC] */
    public static final void a(e23.a aVar, h4.r rVar, boolean z14, e7 e7Var, o4.r1 r1Var, e23.p pVar, p3.m mVar, int i14, int i15) {
        int i16;
        h4.r rVar2;
        int i17;
        boolean z15;
        int i18;
        e7 e7Var2;
        int i19;
        boolean z16;
        boolean z17;
        e7 e7Var3;
        o4.r1 r1Var2;
        p3.p2 p2VarI0;
        h4.r rVar3;
        boolean z18;
        e7 e7VarA;
        h4.r rVar4;
        e7 e7Var4;
        o4.r1 r1VarC;
        int i24;
        int i25;
        p3.o0 o0VarE = mVar.E(1413012038);
        if ((i14 & 6) == 0) {
            i16 = (o0VarE.r(aVar) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        int i26 = i15 & 2;
        if (i26 == 0) {
            if ((i14 & 48) == 0) {
                rVar2 = rVar;
                i16 |= o0VarE.B(rVar2) ? 32 : 16;
            }
            i17 = i15 & 4;
            if (i17 != 0) {
                if ((i14 & 384) == 0) {
                    z15 = z14;
                    if (o0VarE.h(z15)) {
                        i18 = 256;
                    } else {
                        i18 = 128;
                    }
                    i16 |= i18;
                }
                if ((i14 & 3072) == 0) {
                    if ((i15 & 8) == 0) {
                        e7Var2 = e7Var;
                        int i27 = o0VarE.B(e7Var2) ? 2048 : 1024;
                        i16 |= i27;
                    } else {
                        e7Var2 = e7Var;
                    }
                    i16 |= i27;
                } else {
                    e7Var2 = e7Var;
                }
                i19 = i16 | 24576;
                if ((196608 & i14) == 0) {
                    i19 = 90112 | i16;
                }
                if ((1572864 & i14) == 0) {
                    if (o0VarE.r(pVar)) {
                        i25 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    } else {
                        i25 = 524288;
                    }
                    i19 |= i25;
                }
                if ((599187 & i19) != 599186) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (o0VarE.n(i19 & 1, z16)) {
                    o0VarE.G0();
                    if ((i14 & 1) != 0 || o0VarE.o0()) {
                        if (i26 != 0) {
                            rVar3 = h4.r.S;
                        } else {
                            rVar3 = rVar2;
                        }
                        z18 = i17 == 0 ? z15 : true;
                        if ((i15 & 8) != 0) {
                            f7.f88085a.getClass();
                            e7VarA = f7.a(o0VarE);
                            i19 &= -7169;
                        } else {
                            e7VarA = e7Var2;
                        }
                        f7.f88085a.getClass();
                        p3.x1 x1Var = p3.n.f135158a;
                        n3.y0.f123325a.getClass();
                        rVar4 = rVar3;
                        e7Var4 = e7VarA;
                        r1VarC = fc.c(n3.y0.f123327c, o0VarE);
                        i24 = i19 & (-458753);
                    } else {
                        o0VarE.e();
                        if ((i15 & 8) != 0) {
                            i19 &= -7169;
                        }
                        i24 = i19 & (-458753);
                        r1VarC = r1Var;
                        rVar4 = rVar2;
                        z18 = z15;
                        e7Var4 = e7Var2;
                    }
                    o0VarE.h0();
                    p3.x1 x1Var2 = p3.n.f135158a;
                    int i28 = i24 << 3;
                    b(rVar4, aVar, z18, r1VarC, e7Var4, pVar, o0VarE, ((i24 >> 3) & 14) | (i28 & 112) | (i24 & 896) | (57344 & i28) | (i28 & 458752) | (i24 & 3670016));
                    rVar2 = rVar4;
                    z17 = z18;
                    r1Var2 = r1VarC;
                    e7Var3 = e7Var4;
                } else {
                    o0VarE.e();
                    z17 = z15;
                    e7Var3 = e7Var2;
                    r1Var2 = r1Var;
                }
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new d62.o(aVar, rVar2, z17, e7Var3, r1Var2, pVar, i14, i15);
                }
            }
            i16 |= 384;
            z15 = z14;
            if ((i14 & 3072) == 0) {
                if ((i15 & 8) == 0) {
                    e7Var2 = e7Var;
                    if (o0VarE.B(e7Var2)) {
                    }
                    i16 |= i27;
                } else {
                    e7Var2 = e7Var;
                }
                i16 |= i27;
            } else {
                e7Var2 = e7Var;
            }
            i19 = i16 | 24576;
            if ((196608 & i14) == 0) {
                i19 = 90112 | i16;
            }
            if ((1572864 & i14) == 0) {
                if (o0VarE.r(pVar)) {
                    i25 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                } else {
                    i25 = 524288;
                }
                i19 |= i25;
            }
            if ((599187 & i19) != 599186) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (o0VarE.n(i19 & 1, z16)) {
                o0VarE.G0();
                if ((i14 & 1) != 0) {
                    if (i26 != 0) {
                        rVar3 = h4.r.S;
                    } else {
                        rVar3 = rVar2;
                    }
                    if (i17 == 0) {
                    }
                    if ((i15 & 8) != 0) {
                        f7.f88085a.getClass();
                        e7VarA = f7.a(o0VarE);
                        i19 &= -7169;
                    } else {
                        e7VarA = e7Var2;
                    }
                    f7.f88085a.getClass();
                    p3.x1 x1Var3 = p3.n.f135158a;
                    n3.y0.f123325a.getClass();
                    rVar4 = rVar3;
                    e7Var4 = e7VarA;
                    r1VarC = fc.c(n3.y0.f123327c, o0VarE);
                    i24 = i19 & (-458753);
                } else {
                    if (i26 != 0) {
                        rVar3 = h4.r.S;
                    } else {
                        rVar3 = rVar2;
                    }
                    if (i17 == 0) {
                    }
                    if ((i15 & 8) != 0) {
                        f7.f88085a.getClass();
                        e7VarA = f7.a(o0VarE);
                        i19 &= -7169;
                    } else {
                        e7VarA = e7Var2;
                    }
                    f7.f88085a.getClass();
                    p3.x1 x1Var4 = p3.n.f135158a;
                    n3.y0.f123325a.getClass();
                    rVar4 = rVar3;
                    e7Var4 = e7VarA;
                    r1VarC = fc.c(n3.y0.f123327c, o0VarE);
                    i24 = i19 & (-458753);
                }
                o0VarE.h0();
                p3.x1 x1Var5 = p3.n.f135158a;
                int i29 = i24 << 3;
                b(rVar4, aVar, z18, r1VarC, e7Var4, pVar, o0VarE, ((i24 >> 3) & 14) | (i29 & 112) | (i24 & 896) | (57344 & i29) | (i29 & 458752) | (i24 & 3670016));
                rVar2 = rVar4;
                z17 = z18;
                r1Var2 = r1VarC;
                e7Var3 = e7Var4;
            } else {
                o0VarE.e();
                z17 = z15;
                e7Var3 = e7Var2;
                r1Var2 = r1Var;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new d62.o(aVar, rVar2, z17, e7Var3, r1Var2, pVar, i14, i15);
            }
        }
        i16 |= 48;
        rVar2 = rVar;
        i17 = i15 & 4;
        if (i17 != 0) {
            if ((i14 & 384) == 0) {
                z15 = z14;
                if (o0VarE.h(z15)) {
                    i18 = 256;
                } else {
                    i18 = 128;
                }
                i16 |= i18;
            }
            if ((i14 & 3072) == 0) {
                if ((i15 & 8) == 0) {
                    e7Var2 = e7Var;
                    if (o0VarE.B(e7Var2)) {
                    }
                    i16 |= i27;
                } else {
                    e7Var2 = e7Var;
                }
                i16 |= i27;
            } else {
                e7Var2 = e7Var;
            }
            i19 = i16 | 24576;
            if ((196608 & i14) == 0) {
                i19 = 90112 | i16;
            }
            if ((1572864 & i14) == 0) {
                if (o0VarE.r(pVar)) {
                    i25 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                } else {
                    i25 = 524288;
                }
                i19 |= i25;
            }
            if ((599187 & i19) != 599186) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (o0VarE.n(i19 & 1, z16)) {
                o0VarE.G0();
                if ((i14 & 1) != 0) {
                    if (i26 != 0) {
                        rVar3 = h4.r.S;
                    } else {
                        rVar3 = rVar2;
                    }
                    if (i17 == 0) {
                    }
                    if ((i15 & 8) != 0) {
                        f7.f88085a.getClass();
                        e7VarA = f7.a(o0VarE);
                        i19 &= -7169;
                    } else {
                        e7VarA = e7Var2;
                    }
                    f7.f88085a.getClass();
                    p3.x1 x1Var6 = p3.n.f135158a;
                    n3.y0.f123325a.getClass();
                    rVar4 = rVar3;
                    e7Var4 = e7VarA;
                    r1VarC = fc.c(n3.y0.f123327c, o0VarE);
                    i24 = i19 & (-458753);
                } else {
                    if (i26 != 0) {
                        rVar3 = h4.r.S;
                    } else {
                        rVar3 = rVar2;
                    }
                    if (i17 == 0) {
                    }
                    if ((i15 & 8) != 0) {
                        f7.f88085a.getClass();
                        e7VarA = f7.a(o0VarE);
                        i19 &= -7169;
                    } else {
                        e7VarA = e7Var2;
                    }
                    f7.f88085a.getClass();
                    p3.x1 x1Var7 = p3.n.f135158a;
                    n3.y0.f123325a.getClass();
                    rVar4 = rVar3;
                    e7Var4 = e7VarA;
                    r1VarC = fc.c(n3.y0.f123327c, o0VarE);
                    i24 = i19 & (-458753);
                }
                o0VarE.h0();
                p3.x1 x1Var8 = p3.n.f135158a;
                int i210 = i24 << 3;
                b(rVar4, aVar, z18, r1VarC, e7Var4, pVar, o0VarE, ((i24 >> 3) & 14) | (i210 & 112) | (i24 & 896) | (57344 & i210) | (i210 & 458752) | (i24 & 3670016));
                rVar2 = rVar4;
                z17 = z18;
                r1Var2 = r1VarC;
                e7Var3 = e7Var4;
            } else {
                o0VarE.e();
                z17 = z15;
                e7Var3 = e7Var2;
                r1Var2 = r1Var;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new d62.o(aVar, rVar2, z17, e7Var3, r1Var2, pVar, i14, i15);
            }
        }
        i16 |= 384;
        z15 = z14;
        if ((i14 & 3072) == 0) {
            if ((i15 & 8) == 0) {
                e7Var2 = e7Var;
                if (o0VarE.B(e7Var2)) {
                }
                i16 |= i27;
            } else {
                e7Var2 = e7Var;
            }
            i16 |= i27;
        } else {
            e7Var2 = e7Var;
        }
        i19 = i16 | 24576;
        if ((196608 & i14) == 0) {
            i19 = 90112 | i16;
        }
        if ((1572864 & i14) == 0) {
            if (o0VarE.r(pVar)) {
                i25 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
            } else {
                i25 = 524288;
            }
            i19 |= i25;
        }
        if ((599187 & i19) != 599186) {
            z16 = true;
        } else {
            z16 = false;
        }
        if (o0VarE.n(i19 & 1, z16)) {
            o0VarE.G0();
            if ((i14 & 1) != 0) {
                if (i26 != 0) {
                    rVar3 = h4.r.S;
                } else {
                    rVar3 = rVar2;
                }
                if (i17 == 0) {
                }
                if ((i15 & 8) != 0) {
                    f7.f88085a.getClass();
                    e7VarA = f7.a(o0VarE);
                    i19 &= -7169;
                } else {
                    e7VarA = e7Var2;
                }
                f7.f88085a.getClass();
                p3.x1 x1Var9 = p3.n.f135158a;
                n3.y0.f123325a.getClass();
                rVar4 = rVar3;
                e7Var4 = e7VarA;
                r1VarC = fc.c(n3.y0.f123327c, o0VarE);
                i24 = i19 & (-458753);
            } else {
                if (i26 != 0) {
                    rVar3 = h4.r.S;
                } else {
                    rVar3 = rVar2;
                }
                if (i17 == 0) {
                }
                if ((i15 & 8) != 0) {
                    f7.f88085a.getClass();
                    e7VarA = f7.a(o0VarE);
                    i19 &= -7169;
                } else {
                    e7VarA = e7Var2;
                }
                f7.f88085a.getClass();
                p3.x1 x1Var10 = p3.n.f135158a;
                n3.y0.f123325a.getClass();
                rVar4 = rVar3;
                e7Var4 = e7VarA;
                r1VarC = fc.c(n3.y0.f123327c, o0VarE);
                i24 = i19 & (-458753);
            }
            o0VarE.h0();
            p3.x1 x1Var11 = p3.n.f135158a;
            int i211 = i24 << 3;
            b(rVar4, aVar, z18, r1VarC, e7Var4, pVar, o0VarE, ((i24 >> 3) & 14) | (i211 & 112) | (i24 & 896) | (57344 & i211) | (i211 & 458752) | (i24 & 3670016));
            rVar2 = rVar4;
            z17 = z18;
            r1Var2 = r1VarC;
            e7Var3 = e7Var4;
        } else {
            o0VarE.e();
            z17 = z15;
            e7Var3 = e7Var2;
            r1Var2 = r1Var;
        }
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new d62.o(aVar, rVar2, z17, e7Var3, r1Var2, pVar, i14, i15);
        }
    }

    public static final void b(h4.r rVar, e23.a aVar, boolean z14, o4.r1 r1Var, e7 e7Var, e23.p pVar, p3.m mVar, int i14) {
        int i15;
        p3.o0 o0VarE = mVar.E(-1134296466);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(aVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.h(z14) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.B(r1Var) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.B(e7Var) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i15 |= o0VarE.B(null) ? 131072 : 65536;
        }
        if ((1572864 & i14) == 0) {
            i15 |= o0VarE.r(pVar) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        int i16 = i15;
        if (o0VarE.n(i16 & 1, (599187 & i16) != 599186)) {
            p3.x1 x1Var = p3.n.f135158a;
            o0VarE.C(977045485);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = kg.f.b(o0VarE);
            }
            a2.j jVar = (a2.j) objQ;
            o0VarE.g0(false);
            f5.p pVar2 = p7.f89279a;
            h4.r rVarThen = rVar.then(d8.f87832a);
            long jB = f7.b(f7.f88085a);
            c2.k0 k0Var = c2.x2.f22930a;
            h4.r rVarE = u1.n.e(l4.k.b(c2.x2.r(rVarThen, g6.h.c(jB), g6.h.b(jB)), r1Var), z14 ? e7Var.f87959a : e7Var.f87961c, r1Var);
            p5.l.f136032b.getClass();
            h4.r rVarD = l3.k.d(u1.w.b(rVarE, jVar, fb.a(0.0f, 7, 0L, false), z14, null, p5.l.a(0), aVar, 8));
            h4.d.f81522a.getClass();
            f5.z0 z0VarD = c2.q.d(h4.d.a.f81528f, false);
            int iP = o0VarE.P();
            p3.i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarD, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar2 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            p3.b4.c(h5.g.a.f81810g, z0VarD, o0VarE);
            p3.b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iP))) {
                v.h.A(iP, o0VarE, iP, bVar);
            }
            p3.b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.u uVar = c2.u.f22885a;
            p3.v.a(s2.f89590a.c(o4.d0.a(z14 ? e7Var.f87960b : e7Var.f87962d)), pVar, o0VarE, ((i16 >> 15) & 112) | 8);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a82.b(rVar, aVar, z14, r1Var, e7Var, pVar, i14);
        }
    }

    public static final void c(boolean z14, e23.l lVar, h4.r rVar, boolean z15, j7 j7Var, o4.r1 r1Var, z3.e eVar, p3.m mVar, int i14) {
        int i15;
        p3.o0 o0Var;
        boolean z16;
        j7 j7Var2;
        o4.r1 r1Var2;
        j7 j7Var3;
        boolean z17;
        o4.r1 r1VarC;
        int i16;
        p3.o0 o0VarE = mVar.E(-1031402037);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.h(z14) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(lVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.B(rVar) ? 256 : 128;
        }
        int i17 = i15 | 3072;
        if ((i14 & 24576) == 0) {
            i17 = i15 | 11264;
        }
        int i18 = 196608 | i17;
        if ((1572864 & i14) == 0) {
            i18 = 720896 | i17;
        }
        if ((12582912 & i14) == 0) {
            i18 |= o0VarE.r(eVar) ? 8388608 : 4194304;
        }
        if (o0VarE.n(i18 & 1, (4793491 & i18) != 4793490)) {
            o0VarE.G0();
            if ((i14 & 1) == 0 || o0VarE.o0()) {
                f7 f7Var = f7.f88085a;
                f7Var.getClass();
                o0VarE.C(-1355771567);
                p3.x1 x1Var = p3.n.f135158a;
                long j8 = ((o4.d0) o0VarE.A(s2.f89590a)).f128833a;
                s7.f89624a.getClass();
                j2 j2VarA = s7.a(o0VarE);
                j7 j7Var4 = j2VarA.f88484g0;
                if (j7Var4 == null) {
                    o4.d0.f128823b.getClass();
                    long j14 = o4.d0.f128831j;
                    n3.a1.f122687a.getClass();
                    j7Var4 = new j7(j14, j8, j14, o4.d0.c(n3.a1.f122688b, j8, 14), j14, k2.d(j2VarA, n3.a1.f122689c), null);
                    j8 = j8;
                    j2VarA.f88484g0 = j7Var4;
                }
                long j15 = j7Var4.f88527b;
                if (o4.d0.d(j15, j8)) {
                    o0VarE.g0(false);
                } else {
                    n3.a1.f122687a.getClass();
                    long jC = o4.d0.c(n3.a1.f122688b, j8, 14);
                    long j16 = j7Var4.f88526a;
                    long j17 = j7Var4.f88528c;
                    long j18 = j7Var4.f88530e;
                    long j19 = j7Var4.f88531f;
                    if (j8 == 16) {
                        j8 = j15;
                    }
                    j7 j7Var5 = new j7(j16, j8, j17, jC != 16 ? jC : j7Var4.f88529d, j18, j19, null);
                    o0VarE.g0(false);
                    j7Var4 = j7Var5;
                }
                f7Var.getClass();
                n3.y0.f123325a.getClass();
                j7Var3 = j7Var4;
                z17 = true;
                r1VarC = fc.c(n3.y0.f123327c, o0VarE);
                i16 = i18 & (-3727361);
            } else {
                o0VarE.e();
                i16 = i18 & (-3727361);
                z17 = z15;
                j7Var3 = j7Var;
                r1VarC = r1Var;
            }
            o0VarE.h0();
            p3.x1 x1Var2 = p3.n.f135158a;
            o0Var = o0VarE;
            d(z14, lVar, rVar, z17, j7Var3, r1VarC, eVar, o0Var, i16 & 33554430);
            z16 = z17;
            j7Var2 = j7Var3;
            r1Var2 = r1VarC;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            z16 = z15;
            j7Var2 = j7Var;
            r1Var2 = r1Var;
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new g7(z14, lVar, rVar, z16, j7Var2, r1Var2, eVar, i14, 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(boolean z14, e23.l lVar, h4.r rVar, boolean z15, j7 j7Var, o4.r1 r1Var, z3.e eVar, p3.m mVar, int i14) {
        int i15;
        long j8;
        long j14;
        p3.o0 o0VarE = mVar.E(1724745099);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.h(z14) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(lVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.B(rVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.h(z15) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.B(j7Var) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i15 |= o0VarE.B(null) ? 131072 : 65536;
        }
        if ((1572864 & i14) == 0) {
            i15 |= o0VarE.B(r1Var) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i14) == 0) {
            i15 |= o0VarE.r(eVar) ? 8388608 : 4194304;
        }
        int i16 = i15;
        if (o0VarE.n(i16 & 1, (4793491 & i16) != 4793490)) {
            o0VarE.G0();
            if ((i14 & 1) != 0 && !o0VarE.o0()) {
                o0VarE.e();
            }
            o0VarE.h0();
            p3.x1 x1Var = p3.n.f135158a;
            o0VarE.C(1187972528);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = kg.f.b(o0VarE);
            }
            a2.j jVar = (a2.j) objQ;
            o0VarE.g0(false);
            f5.p pVar = p7.f89279a;
            h4.r rVarThen = rVar.then(d8.f87832a);
            long jB = f7.b(f7.f88085a);
            c2.k0 k0Var = c2.x2.f22930a;
            h4.r rVarB = l4.k.b(c2.x2.r(rVarThen, g6.h.c(jB), g6.h.b(jB)), r1Var);
            j7Var.getClass();
            if (z15) {
                j8 = !z14 ? j7Var.f88526a : j7Var.f88530e;
            } else {
                j8 = j7Var.f88528c;
            }
            h4.r rVarE = u1.n.e(rVarB, ((o4.d0) p3.p0.q(o4.d0.a(j8), o0VarE).getF182175a()).f128833a, o4.m1.f128891a);
            p5.l.f136032b.getClass();
            h4.r rVarA = j2.g.a(rVarE, z14, jVar, fb.a(0.0f, 7, 0L, false), z15, p5.l.a(p5.l.f136033c), lVar);
            h4.d.f81522a.getClass();
            f5.z0 z0VarD = c2.q.d(h4.d.a.f81528f, false);
            int iP = o0VarE.P();
            p3.i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarA, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar);
            } else {
                o0VarE.c();
            }
            p3.b4.c(h5.g.a.f81810g, z0VarD, o0VarE);
            p3.b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iP))) {
                v.h.A(iP, o0VarE, iP, bVar);
            }
            p3.b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.u uVar = c2.u.f22885a;
            if (z15) {
                j14 = !z14 ? j7Var.f88527b : j7Var.f88531f;
            } else {
                j14 = j7Var.f88529d;
            }
            p3.v.a(s2.f89590a.c(o4.d0.a(((o4.d0) p3.p0.q(o4.d0.a(j14), o0VarE).getF182175a()).f128833a)), eVar, o0VarE, ((i16 >> 18) & 112) | 8);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new g7(z14, lVar, rVar, z15, j7Var, r1Var, eVar, i14, 1);
        }
    }
}
