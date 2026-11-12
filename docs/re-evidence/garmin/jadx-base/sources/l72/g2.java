package l72;

import p005kotlin.Unit;
import p3.b4;

/* JADX INFO: loaded from: classes9.dex */
public final class g2 {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f111028a;

        static {
            int[] iArr = new int[d2.values().length];
            try {
                iArr[d2.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d2.DEFAULT_SHADOW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[d2.HOVER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[d2.HOVER_SHADOW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f111028a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(z3.e eVar, long j8, d2 d2Var, h4.r rVar, String str, p3.m mVar, int i14) {
        int i15;
        o13.p pVar;
        p3.o0 o0VarE = mVar.E(506715537);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(eVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.l(j8) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.k(d2Var.ordinal()) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.B(rVar) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.B(str) ? 16384 : 8192;
        }
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            p3.x1 x1Var = p3.n.f135158a;
            int i16 = a.f111028a[d2Var.ordinal()];
            if (i16 == 1 || i16 == 2) {
                o0VarE.C(1622337849);
                d92.b.f58623a.getClass();
                pVar = new o13.p(o4.d0.a(d92.b.a(o0VarE).f().f63508c), o4.d0.a(j8));
                o0VarE.g0(false);
            } else {
                if (i16 != 3 && i16 != 4) {
                    throw kg.f.h(o0VarE, 1622335237, false);
                }
                o0VarE.C(1622341369);
                o4.d0 d0VarA = o4.d0.a(j8);
                d92.b.f58623a.getClass();
                pVar = new o13.p(d0VarA, o4.d0.a(d92.b.a(o0VarE).f().f63508c));
                o0VarE.g0(false);
            }
            long j14 = ((o4.d0) pVar.f128594a).f128833a;
            long j15 = ((o4.d0) pVar.f128595b).f128833a;
            boolean z14 = d2Var == d2.DEFAULT_SHADOW || d2Var == d2.HOVER_SHADOW;
            h4.d.f81522a.getClass();
            h4.g gVar = h4.d.a.f81528f;
            g6.f.a aVar = g6.f.f75994b;
            int i17 = i15;
            float f14 = 16;
            h4.r rVarThen = rVar.then(u1.q.b(1, j14, u1.n.e(v2.b(v2.a(c2.x2.b(h4.r.S, 22, 0.0f, 2), z14, new q(7), o0VarE, 6), str, new b82.i(13), o0VarE, (i17 >> 9) & 112), j15, k2.i.a(f14)), k2.i.a(f14)));
            f5.z0 z0VarD = c2.q.d(gVar, false);
            int iHashCode = Long.hashCode(o0VarE.U);
            p3.i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarThen, o0VarE);
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
            b4.c(h5.g.a.f81810g, z0VarD, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            eVar.invoke(c2.u.f22885a, o0VarE, Integer.valueOf(((i17 << 3) & 112) | 6));
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new i3.c3(eVar, j8, d2Var, rVar, str, i14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0045  */
    /* JADX WARN: Code duplicated, block: B:25:0x0048  */
    /* JADX WARN: Code duplicated, block: B:28:0x004f  */
    /* JADX WARN: Code duplicated, block: B:29:0x0052 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x0054  */
    /* JADX WARN: Code duplicated, block: B:31:0x0056  */
    /* JADX WARN: Code duplicated, block: B:34:0x0060  */
    /* JADX WARN: Code duplicated, block: B:35:0x0063  */
    /* JADX WARN: Code duplicated, block: B:39:0x006a  */
    /* JADX WARN: Code duplicated, block: B:41:0x006f  */
    /* JADX WARN: Code duplicated, block: B:43:0x0073  */
    /* JADX WARN: Code duplicated, block: B:45:0x007b  */
    /* JADX WARN: Code duplicated, block: B:46:0x007e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0085  */
    /* JADX WARN: Code duplicated, block: B:51:0x008b  */
    /* JADX WARN: Code duplicated, block: B:53:0x0093  */
    /* JADX WARN: Code duplicated, block: B:54:0x0096  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:67:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:68:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:73:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:82:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:84:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:87:0x0102  */
    /* JADX WARN: Code duplicated, block: B:89:0x010f  */
    /* JADX WARN: Code duplicated, block: B:91:0x012b  */
    /* JADX WARN: Code duplicated, block: B:94:0x0190  */
    /* JADX WARN: Code duplicated, block: B:97:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:99:? A[RETURN, SYNTHETIC] */
    public static final void b(u4.d dVar, String str, final long j8, d2 d2Var, h4.r rVar, String str2, p3.m mVar, final int i14, final int i15) {
        u4.d dVar2;
        int i16;
        String str3;
        int i17;
        int i18;
        int i19;
        int iOrdinal;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        String str4;
        int i29;
        int i30;
        boolean z14;
        final d2 d2Var2;
        final u4.d dVar3;
        final String str5;
        final h4.r rVar2;
        final String str6;
        p3.p2 p2VarI0;
        u4.d dVar4;
        String str7;
        d2 d2Var3;
        int i34;
        h4.r rVar3;
        int i35;
        long j14;
        long j15;
        p3.o0 o0VarE = mVar.E(462116196);
        int i36 = i15 & 1;
        if (i36 != 0) {
            i16 = i14 | 6;
            dVar2 = dVar;
        } else {
            dVar2 = dVar;
            i16 = (o0VarE.B(dVar2) ? 4 : 2) | i14;
        }
        int i37 = i15 & 2;
        if (i37 == 0) {
            if ((i14 & 48) == 0) {
                str3 = str;
                i16 |= o0VarE.B(str3) ? 32 : 16;
            }
            if (o0VarE.l(j8)) {
                i17 = 256;
            } else {
                i17 = 128;
            }
            i18 = i16 | i17;
            i19 = i15 & 8;
            if (i19 != 0) {
                i25 = i18 | 3072;
            } else {
                if (d2Var == null) {
                    iOrdinal = -1;
                } else {
                    iOrdinal = d2Var.ordinal();
                }
                if (o0VarE.k(iOrdinal)) {
                    i24 = 2048;
                } else {
                    i24 = 1024;
                }
                i25 = i18 | i24;
            }
            i26 = i15 & 16;
            if (i26 != 0) {
                if ((i14 & 24576) == 0) {
                    if (o0VarE.B(rVar)) {
                        i27 = 16384;
                    } else {
                        i27 = 8192;
                    }
                    i25 |= i27;
                }
                i28 = i15 & 32;
                if (i28 != 0) {
                    i30 = i25 | 196608;
                    str4 = str2;
                } else {
                    str4 = str2;
                    if (o0VarE.B(str4)) {
                        i29 = 131072;
                    } else {
                        i29 = 65536;
                    }
                    i30 = i25 | i29;
                }
                if ((i30 & 74899) != 74898) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (o0VarE.n(i30 & 1, z14)) {
                    if (i36 != 0) {
                        dVar4 = null;
                    } else {
                        dVar4 = dVar2;
                    }
                    if (i37 != 0) {
                        str7 = null;
                    } else {
                        str7 = str3;
                    }
                    if (i19 != 0) {
                        d2Var3 = d2.DEFAULT;
                    } else {
                        d2Var3 = d2Var;
                    }
                    if (i26 != 0) {
                        rVar3 = h4.r.S;
                        i34 = i28;
                    } else {
                        i34 = i28;
                        rVar3 = rVar;
                    }
                    if (i34 != 0) {
                        str4 = null;
                    }
                    p3.x1 x1Var = p3.n.f135158a;
                    i35 = a.f111028a[d2Var3.ordinal()];
                    if (i35 != 1) {
                        if (i35 != 2) {
                            if (i35 != 3) {
                                o0VarE.C(1712047017);
                                o0VarE.g0(false);
                            } else {
                                if (i35 == 4) {
                                    throw kg.f.h(o0VarE, 1712041182, false);
                                }
                                o0VarE.C(1712048585);
                                o0VarE.g0(false);
                            }
                            j15 = j8;
                        } else {
                            o0VarE.C(1712045487);
                            d92.b.f58623a.getClass();
                            j14 = d92.b.a(o0VarE).f().f63508c;
                            o0VarE.g0(false);
                        }
                        int i38 = i30 >> 3;
                        a(z3.f.c(-552479536, new e2(str7, dVar4, j15, o53.f0.H(g6.q.d(o53.f0.B(11)) / ((g6.c) o0VarE.A(kotlin.t1.f91490h)).getF75992b(), 4294967296L)), o0VarE), j8, d2Var3, rVar3, str4, o0VarE, (i38 & 112) | 6 | (i38 & 896) | (i38 & 7168) | (i38 & 57344));
                        d2Var2 = d2Var3;
                        rVar2 = rVar3;
                        str5 = str7;
                        dVar3 = dVar4;
                    } else {
                        o0VarE.C(1712043151);
                        d92.b.f58623a.getClass();
                        j14 = d92.b.a(o0VarE).f().f63508c;
                        o0VarE.g0(false);
                    }
                    j15 = j14;
                    int i39 = i30 >> 3;
                    a(z3.f.c(-552479536, new e2(str7, dVar4, j15, o53.f0.H(g6.q.d(o53.f0.B(11)) / ((g6.c) o0VarE.A(kotlin.t1.f91490h)).getF75992b(), 4294967296L)), o0VarE), j8, d2Var3, rVar3, str4, o0VarE, (i39 & 112) | 6 | (i39 & 896) | (i39 & 7168) | (i39 & 57344));
                    d2Var2 = d2Var3;
                    rVar2 = rVar3;
                    str5 = str7;
                    dVar3 = dVar4;
                } else {
                    o0VarE.e();
                    d2Var2 = d2Var;
                    dVar3 = dVar2;
                    str5 = str3;
                    rVar2 = rVar;
                }
                str6 = str4;
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new e23.p() { // from class: l72.f2
                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            g2.b(dVar3, str5, j8, d2Var2, rVar2, str6, (p3.m) obj, p3.p0.t(i14 | 1), i15);
                            return Unit.INSTANCE;
                        }
                    };
                }
            }
            i25 |= 24576;
            i28 = i15 & 32;
            if (i28 != 0) {
                i30 = i25 | 196608;
                str4 = str2;
            } else {
                str4 = str2;
                if (o0VarE.B(str4)) {
                    i29 = 131072;
                } else {
                    i29 = 65536;
                }
                i30 = i25 | i29;
            }
            if ((i30 & 74899) != 74898) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i30 & 1, z14)) {
                if (i36 != 0) {
                    dVar4 = null;
                } else {
                    dVar4 = dVar2;
                }
                if (i37 != 0) {
                    str7 = null;
                } else {
                    str7 = str3;
                }
                if (i19 != 0) {
                    d2Var3 = d2.DEFAULT;
                } else {
                    d2Var3 = d2Var;
                }
                if (i26 != 0) {
                    rVar3 = h4.r.S;
                    i34 = i28;
                } else {
                    i34 = i28;
                    rVar3 = rVar;
                }
                if (i34 != 0) {
                    str4 = null;
                }
                p3.x1 x1Var2 = p3.n.f135158a;
                i35 = a.f111028a[d2Var3.ordinal()];
                if (i35 != 1) {
                    if (i35 != 2) {
                        if (i35 != 3) {
                            o0VarE.C(1712047017);
                            o0VarE.g0(false);
                        } else {
                            if (i35 == 4) {
                                throw kg.f.h(o0VarE, 1712041182, false);
                            }
                            o0VarE.C(1712048585);
                            o0VarE.g0(false);
                        }
                        j15 = j8;
                    } else {
                        o0VarE.C(1712045487);
                        d92.b.f58623a.getClass();
                        j14 = d92.b.a(o0VarE).f().f63508c;
                        o0VarE.g0(false);
                    }
                    int i310 = i30 >> 3;
                    a(z3.f.c(-552479536, new e2(str7, dVar4, j15, o53.f0.H(g6.q.d(o53.f0.B(11)) / ((g6.c) o0VarE.A(kotlin.t1.f91490h)).getF75992b(), 4294967296L)), o0VarE), j8, d2Var3, rVar3, str4, o0VarE, (i310 & 112) | 6 | (i310 & 896) | (i310 & 7168) | (i310 & 57344));
                    d2Var2 = d2Var3;
                    rVar2 = rVar3;
                    str5 = str7;
                    dVar3 = dVar4;
                } else {
                    o0VarE.C(1712043151);
                    d92.b.f58623a.getClass();
                    j14 = d92.b.a(o0VarE).f().f63508c;
                    o0VarE.g0(false);
                }
                j15 = j14;
                int i311 = i30 >> 3;
                a(z3.f.c(-552479536, new e2(str7, dVar4, j15, o53.f0.H(g6.q.d(o53.f0.B(11)) / ((g6.c) o0VarE.A(kotlin.t1.f91490h)).getF75992b(), 4294967296L)), o0VarE), j8, d2Var3, rVar3, str4, o0VarE, (i311 & 112) | 6 | (i311 & 896) | (i311 & 7168) | (i311 & 57344));
                d2Var2 = d2Var3;
                rVar2 = rVar3;
                str5 = str7;
                dVar3 = dVar4;
            } else {
                o0VarE.e();
                d2Var2 = d2Var;
                dVar3 = dVar2;
                str5 = str3;
                rVar2 = rVar;
            }
            str6 = str4;
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new e23.p() { // from class: l72.f2
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        g2.b(dVar3, str5, j8, d2Var2, rVar2, str6, (p3.m) obj, p3.p0.t(i14 | 1), i15);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        i16 |= 48;
        str3 = str;
        if (o0VarE.l(j8)) {
            i17 = 256;
        } else {
            i17 = 128;
        }
        i18 = i16 | i17;
        i19 = i15 & 8;
        if (i19 != 0) {
            i25 = i18 | 3072;
        } else {
            if (d2Var == null) {
                iOrdinal = -1;
            } else {
                iOrdinal = d2Var.ordinal();
            }
            if (o0VarE.k(iOrdinal)) {
                i24 = 2048;
            } else {
                i24 = 1024;
            }
            i25 = i18 | i24;
        }
        i26 = i15 & 16;
        if (i26 != 0) {
            if ((i14 & 24576) == 0) {
                if (o0VarE.B(rVar)) {
                    i27 = 16384;
                } else {
                    i27 = 8192;
                }
                i25 |= i27;
            }
            i28 = i15 & 32;
            if (i28 != 0) {
                i30 = i25 | 196608;
                str4 = str2;
            } else {
                str4 = str2;
                if (o0VarE.B(str4)) {
                    i29 = 131072;
                } else {
                    i29 = 65536;
                }
                i30 = i25 | i29;
            }
            if ((i30 & 74899) != 74898) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i30 & 1, z14)) {
                if (i36 != 0) {
                    dVar4 = null;
                } else {
                    dVar4 = dVar2;
                }
                if (i37 != 0) {
                    str7 = null;
                } else {
                    str7 = str3;
                }
                if (i19 != 0) {
                    d2Var3 = d2.DEFAULT;
                } else {
                    d2Var3 = d2Var;
                }
                if (i26 != 0) {
                    rVar3 = h4.r.S;
                    i34 = i28;
                } else {
                    i34 = i28;
                    rVar3 = rVar;
                }
                if (i34 != 0) {
                    str4 = null;
                }
                p3.x1 x1Var3 = p3.n.f135158a;
                i35 = a.f111028a[d2Var3.ordinal()];
                if (i35 != 1) {
                    if (i35 != 2) {
                        if (i35 != 3) {
                            o0VarE.C(1712047017);
                            o0VarE.g0(false);
                        } else {
                            if (i35 == 4) {
                                throw kg.f.h(o0VarE, 1712041182, false);
                            }
                            o0VarE.C(1712048585);
                            o0VarE.g0(false);
                        }
                        j15 = j8;
                    } else {
                        o0VarE.C(1712045487);
                        d92.b.f58623a.getClass();
                        j14 = d92.b.a(o0VarE).f().f63508c;
                        o0VarE.g0(false);
                    }
                    int i312 = i30 >> 3;
                    a(z3.f.c(-552479536, new e2(str7, dVar4, j15, o53.f0.H(g6.q.d(o53.f0.B(11)) / ((g6.c) o0VarE.A(kotlin.t1.f91490h)).getF75992b(), 4294967296L)), o0VarE), j8, d2Var3, rVar3, str4, o0VarE, (i312 & 112) | 6 | (i312 & 896) | (i312 & 7168) | (i312 & 57344));
                    d2Var2 = d2Var3;
                    rVar2 = rVar3;
                    str5 = str7;
                    dVar3 = dVar4;
                } else {
                    o0VarE.C(1712043151);
                    d92.b.f58623a.getClass();
                    j14 = d92.b.a(o0VarE).f().f63508c;
                    o0VarE.g0(false);
                }
                j15 = j14;
                int i313 = i30 >> 3;
                a(z3.f.c(-552479536, new e2(str7, dVar4, j15, o53.f0.H(g6.q.d(o53.f0.B(11)) / ((g6.c) o0VarE.A(kotlin.t1.f91490h)).getF75992b(), 4294967296L)), o0VarE), j8, d2Var3, rVar3, str4, o0VarE, (i313 & 112) | 6 | (i313 & 896) | (i313 & 7168) | (i313 & 57344));
                d2Var2 = d2Var3;
                rVar2 = rVar3;
                str5 = str7;
                dVar3 = dVar4;
            } else {
                o0VarE.e();
                d2Var2 = d2Var;
                dVar3 = dVar2;
                str5 = str3;
                rVar2 = rVar;
            }
            str6 = str4;
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new e23.p() { // from class: l72.f2
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        g2.b(dVar3, str5, j8, d2Var2, rVar2, str6, (p3.m) obj, p3.p0.t(i14 | 1), i15);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        i25 |= 24576;
        i28 = i15 & 32;
        if (i28 != 0) {
            i30 = i25 | 196608;
            str4 = str2;
        } else {
            str4 = str2;
            if (o0VarE.B(str4)) {
                i29 = 131072;
            } else {
                i29 = 65536;
            }
            i30 = i25 | i29;
        }
        if ((i30 & 74899) != 74898) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (o0VarE.n(i30 & 1, z14)) {
            if (i36 != 0) {
                dVar4 = null;
            } else {
                dVar4 = dVar2;
            }
            if (i37 != 0) {
                str7 = null;
            } else {
                str7 = str3;
            }
            if (i19 != 0) {
                d2Var3 = d2.DEFAULT;
            } else {
                d2Var3 = d2Var;
            }
            if (i26 != 0) {
                rVar3 = h4.r.S;
                i34 = i28;
            } else {
                i34 = i28;
                rVar3 = rVar;
            }
            if (i34 != 0) {
                str4 = null;
            }
            p3.x1 x1Var4 = p3.n.f135158a;
            i35 = a.f111028a[d2Var3.ordinal()];
            if (i35 != 1) {
                if (i35 != 2) {
                    if (i35 != 3) {
                        o0VarE.C(1712047017);
                        o0VarE.g0(false);
                    } else {
                        if (i35 == 4) {
                            throw kg.f.h(o0VarE, 1712041182, false);
                        }
                        o0VarE.C(1712048585);
                        o0VarE.g0(false);
                    }
                    j15 = j8;
                } else {
                    o0VarE.C(1712045487);
                    d92.b.f58623a.getClass();
                    j14 = d92.b.a(o0VarE).f().f63508c;
                    o0VarE.g0(false);
                }
                int i314 = i30 >> 3;
                a(z3.f.c(-552479536, new e2(str7, dVar4, j15, o53.f0.H(g6.q.d(o53.f0.B(11)) / ((g6.c) o0VarE.A(kotlin.t1.f91490h)).getF75992b(), 4294967296L)), o0VarE), j8, d2Var3, rVar3, str4, o0VarE, (i314 & 112) | 6 | (i314 & 896) | (i314 & 7168) | (i314 & 57344));
                d2Var2 = d2Var3;
                rVar2 = rVar3;
                str5 = str7;
                dVar3 = dVar4;
            } else {
                o0VarE.C(1712043151);
                d92.b.f58623a.getClass();
                j14 = d92.b.a(o0VarE).f().f63508c;
                o0VarE.g0(false);
            }
            j15 = j14;
            int i315 = i30 >> 3;
            a(z3.f.c(-552479536, new e2(str7, dVar4, j15, o53.f0.H(g6.q.d(o53.f0.B(11)) / ((g6.c) o0VarE.A(kotlin.t1.f91490h)).getF75992b(), 4294967296L)), o0VarE), j8, d2Var3, rVar3, str4, o0VarE, (i315 & 112) | 6 | (i315 & 896) | (i315 & 7168) | (i315 & 57344));
            d2Var2 = d2Var3;
            rVar2 = rVar3;
            str5 = str7;
            dVar3 = dVar4;
        } else {
            o0VarE.e();
            d2Var2 = d2Var;
            dVar3 = dVar2;
            str5 = str3;
            rVar2 = rVar;
        }
        str6 = str4;
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p() { // from class: l72.f2
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    g2.b(dVar3, str5, j8, d2Var2, rVar2, str6, (p3.m) obj, p3.p0.t(i14 | 1), i15);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
