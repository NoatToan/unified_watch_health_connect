package i3;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class na {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f89071a;

    static {
        g6.f.a aVar = g6.f.f75994b;
        f89071a = 4;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x013c  */
    /* JADX WARN: Code duplicated, block: B:106:0x0146  */
    /* JADX WARN: Code duplicated, block: B:108:0x014d  */
    /* JADX WARN: Code duplicated, block: B:112:0x0168 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:113:0x016a  */
    /* JADX WARN: Code duplicated, block: B:114:0x016c  */
    /* JADX WARN: Code duplicated, block: B:116:0x0170  */
    /* JADX WARN: Code duplicated, block: B:119:0x017b  */
    /* JADX WARN: Code duplicated, block: B:120:0x0183  */
    /* JADX WARN: Code duplicated, block: B:122:0x0186  */
    /* JADX WARN: Code duplicated, block: B:123:0x0189  */
    /* JADX WARN: Code duplicated, block: B:126:0x0190  */
    /* JADX WARN: Code duplicated, block: B:127:0x019a  */
    /* JADX WARN: Code duplicated, block: B:131:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:135:0x01df  */
    /* JADX WARN: Code duplicated, block: B:137:0x026f  */
    /* JADX WARN: Code duplicated, block: B:140:0x0285  */
    /* JADX WARN: Code duplicated, block: B:142:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x0076  */
    /* JADX WARN: Code duplicated, block: B:40:0x007c  */
    /* JADX WARN: Code duplicated, block: B:41:0x007f  */
    /* JADX WARN: Code duplicated, block: B:45:0x008d  */
    /* JADX WARN: Code duplicated, block: B:47:0x0094  */
    /* JADX WARN: Code duplicated, block: B:49:0x0098  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:56:0x00af  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:63:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:66:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:68:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:73:0x00de  */
    /* JADX WARN: Code duplicated, block: B:75:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:76:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:80:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:83:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:85:0x0105  */
    /* JADX WARN: Code duplicated, block: B:88:0x010e  */
    /* JADX WARN: Code duplicated, block: B:90:0x0113  */
    /* JADX WARN: Code duplicated, block: B:93:0x011b  */
    /* JADX WARN: Code duplicated, block: B:94:0x011e  */
    /* JADX WARN: Code duplicated, block: B:97:0x012f  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final String str, final e23.l lVar, final h4.r rVar, boolean z14, boolean z15, final s5.x0 x0Var, e23.p pVar, x5.r0 r0Var, final p006l2.a2 a2Var, p006l2.z1 z1Var, final boolean z16, int i14, int i15, o4.r1 r1Var, final sg sgVar, p3.m mVar, final int i16, final int i17, final int i18, final int i19) {
        int i24;
        h4.r rVar2;
        int i25;
        int i26;
        e23.p pVar2;
        int i27;
        int i28;
        int i29;
        final p006l2.z1 z1Var2;
        int i30;
        int i34;
        int i35;
        boolean z17;
        final boolean z18;
        final boolean z19;
        final x5.r0 r0Var2;
        final int i36;
        final int i37;
        final e23.p pVar3;
        final o4.r1 r1Var2;
        p3.p2 p2VarI0;
        boolean z24;
        p006l2.z1 z1Var3;
        int i38;
        o4.r1 r1VarE;
        x5.r0 r0Var3;
        p006l2.z1 z1Var4;
        o4.r1 r1Var3;
        e23.p pVar4;
        boolean z25;
        int i39;
        int i44;
        Object objQ;
        a2.j jVar;
        long jC;
        int i45;
        int i46;
        int i47;
        p3.o0 o0VarE = mVar.E(1901501544);
        if ((i16 & 6) == 0) {
            i24 = (o0VarE.B(str) ? 4 : 2) | i16;
        } else {
            i24 = i16;
        }
        if ((i16 & 48) == 0) {
            i24 |= o0VarE.r(lVar) ? 32 : 16;
        }
        if ((i16 & 384) == 0) {
            rVar2 = rVar;
            i24 |= o0VarE.B(rVar2) ? 256 : 128;
        } else {
            rVar2 = rVar;
        }
        int i48 = i24 | 3072;
        int i49 = i19 & 16;
        if (i49 == 0) {
            if ((i16 & 24576) == 0) {
                i48 |= o0VarE.h(z15) ? 16384 : 8192;
            }
            if ((i16 & 196608) == 0) {
                if (o0VarE.B(x0Var)) {
                    i47 = 131072;
                } else {
                    i47 = 65536;
                }
                i48 |= i47;
            }
            i25 = i48 | 114819072;
            i26 = i19 & 512;
            if (i26 != 0) {
                if ((i16 & C.ENCODING_PCM_32BIT) == 0) {
                    pVar2 = pVar;
                    if (o0VarE.r(pVar2)) {
                        i27 = 536870912;
                    } else {
                        i27 = 268435456;
                    }
                    i25 |= i27;
                }
                i28 = i17 | 28086;
                if ((i17 & 196608) == 0) {
                    i28 |= o0VarE.B(a2Var) ? 131072 : 65536;
                }
                i29 = i19 & 65536;
                if (i29 != 0) {
                    i28 |= 1572864;
                    z1Var2 = z1Var;
                } else {
                    z1Var2 = z1Var;
                    if ((i17 & 1572864) == 0) {
                        if (o0VarE.B(z1Var2)) {
                            i30 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                        } else {
                            i30 = 524288;
                        }
                        i28 |= i30;
                    }
                }
                if ((i17 & 12582912) == 0) {
                    if (o0VarE.h(z16)) {
                        i46 = 8388608;
                    } else {
                        i46 = 4194304;
                    }
                    i28 |= i46;
                }
                if ((i17 & 100663296) == 0) {
                    i28 |= 33554432;
                }
                int i54 = i28 | C.ENCODING_PCM_32BIT;
                i34 = i18 | 6;
                if ((i18 & 48) != 0) {
                    if ((i19 & 2097152) == 0 || !o0VarE.B(r1Var)) {
                        i45 = 16;
                    } else {
                        i45 = 32;
                    }
                    i34 |= i45;
                }
                if (o0VarE.B(sgVar)) {
                    i35 = 256;
                } else {
                    i35 = 128;
                }
                int i55 = i34 | i35;
                if ((i25 & 306783379) != 306783378 && (i54 & 306783379) == 306783378 && (i55 & 147) == 146) {
                    z17 = false;
                } else {
                    z17 = true;
                }
                if (o0VarE.n(i25 & 1, z17)) {
                    o0VarE.G0();
                    if ((i16 & 1) != 0 || o0VarE.o0()) {
                        if (i49 != 0) {
                            z24 = false;
                        } else {
                            z24 = z15;
                        }
                        if (i26 != 0) {
                            pVar2 = null;
                        }
                        x5.r0.f188941a.getClass();
                        nb0.b bVar = x5.r0.a.f188943b;
                        if (i29 != 0) {
                            p006l2.z1.f108930g.getClass();
                            z1Var3 = p006l2.z1.f108931h;
                        } else {
                            z1Var3 = z1Var2;
                        }
                        if (z16) {
                            i38 = 1;
                        } else {
                            i38 = Integer.MAX_VALUE;
                        }
                        if ((i19 & 2097152) != 0) {
                            ba.f87580a.getClass();
                            r1VarE = ba.e(o0VarE);
                        } else {
                            r1VarE = r1Var;
                        }
                        r0Var3 = bVar;
                        z1Var4 = z1Var3;
                        r1Var3 = r1VarE;
                        pVar4 = pVar2;
                        z25 = true;
                        i39 = 1;
                        i44 = i38;
                    } else {
                        o0VarE.e();
                        z24 = z15;
                        r0Var3 = r0Var;
                        i44 = i14;
                        i39 = i15;
                        r1Var3 = r1Var;
                        z1Var4 = z1Var2;
                        pVar4 = pVar2;
                        z25 = z14;
                    }
                    o0VarE.h0();
                    p3.x1 x1Var = p3.n.f135158a;
                    o0VarE.C(1310051731);
                    objQ = o0VarE.q();
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = kg.f.b(o0VarE);
                    }
                    jVar = (a2.j) objQ;
                    o0VarE.g0(false);
                    o0VarE.C(1981927842);
                    jC = x0Var.c();
                    if (jC == 16) {
                        jC = sgVar.d(z25, false, ((Boolean) xy2.b.k(jVar, o0VarE, 0).getF182175a()).booleanValue());
                    }
                    long j8 = jC;
                    o0VarE.g0(false);
                    boolean z26 = z24;
                    p3.v.a(z2.u2.f201804a.c(sgVar.f89685k), z3.f.c(1874034984, new ja(rVar2, null, false, sgVar, str, lVar, z25, z26, x0Var.e(new s5.x0(j8, 0L, (w5.f0) null, (w5.b0) null, (w5.c0) null, (w5.q) null, (String) null, 0L, (d6.a) null, (d6.m) null, (z5.c) null, 0L, (d6.i) null, (o4.q1) null, (q4.g) null, 0, 0, 0L, (d6.n) null, (s5.c0) null, (d6.f) null, 0, 0, (d6.o) null, 16777214, (p005kotlin.jvm.internal.j) null)), a2Var, z1Var4, z16, i44, i39, r0Var3, jVar, null, null, pVar4, null, null, null, r1Var3), o0VarE), o0VarE, 56);
                    z18 = z25;
                    z19 = z26;
                    z1Var2 = z1Var4;
                    i36 = i44;
                    i37 = i39;
                    r0Var2 = r0Var3;
                    pVar3 = pVar4;
                    r1Var2 = r1Var3;
                } else {
                    o0VarE.e();
                    z18 = z14;
                    z19 = z15;
                    r0Var2 = r0Var;
                    i36 = i14;
                    i37 = i15;
                    pVar3 = pVar2;
                    r1Var2 = r1Var;
                }
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new e23.p() { // from class: i3.ea
                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iT = p3.p0.t(i16 | 1);
                            int iT2 = p3.p0.t(i17);
                            int iT3 = p3.p0.t(i18);
                            na.a(str, lVar, rVar, z18, z19, x0Var, pVar3, r0Var2, a2Var, z1Var2, z16, i36, i37, r1Var2, sgVar, (p3.m) obj, iT, iT2, iT3, i19);
                            return Unit.INSTANCE;
                        }
                    };
                }
            }
            i25 = i48 | 920125440;
            pVar2 = pVar;
            i28 = i17 | 28086;
            if ((i17 & 196608) == 0) {
                i28 |= o0VarE.B(a2Var) ? 131072 : 65536;
            }
            i29 = i19 & 65536;
            if (i29 != 0) {
                i28 |= 1572864;
                z1Var2 = z1Var;
            } else {
                z1Var2 = z1Var;
                if ((i17 & 1572864) == 0) {
                    if (o0VarE.B(z1Var2)) {
                        i30 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    } else {
                        i30 = 524288;
                    }
                    i28 |= i30;
                }
            }
            if ((i17 & 12582912) == 0) {
                if (o0VarE.h(z16)) {
                    i46 = 8388608;
                } else {
                    i46 = 4194304;
                }
                i28 |= i46;
            }
            if ((i17 & 100663296) == 0) {
                i28 |= 33554432;
            }
            int i56 = i28 | C.ENCODING_PCM_32BIT;
            i34 = i18 | 6;
            if ((i18 & 48) != 0) {
                if ((i19 & 2097152) == 0) {
                    i45 = 16;
                } else {
                    i45 = 16;
                }
                i34 |= i45;
            }
            if (o0VarE.B(sgVar)) {
                i35 = 256;
            } else {
                i35 = 128;
            }
            int i57 = i34 | i35;
            if ((i25 & 306783379) != 306783378) {
                z17 = true;
            } else {
                z17 = true;
            }
            if (o0VarE.n(i25 & 1, z17)) {
                o0VarE.G0();
                if ((i16 & 1) != 0) {
                    if (i49 != 0) {
                        z24 = false;
                    } else {
                        z24 = z15;
                    }
                    if (i26 != 0) {
                        pVar2 = null;
                    }
                    x5.r0.f188941a.getClass();
                    nb0.b bVar2 = x5.r0.a.f188943b;
                    if (i29 != 0) {
                        p006l2.z1.f108930g.getClass();
                        z1Var3 = p006l2.z1.f108931h;
                    } else {
                        z1Var3 = z1Var2;
                    }
                    if (z16) {
                        i38 = 1;
                    } else {
                        i38 = Integer.MAX_VALUE;
                    }
                    if ((i19 & 2097152) != 0) {
                        ba.f87580a.getClass();
                        r1VarE = ba.e(o0VarE);
                    } else {
                        r1VarE = r1Var;
                    }
                    r0Var3 = bVar2;
                    z1Var4 = z1Var3;
                    r1Var3 = r1VarE;
                    pVar4 = pVar2;
                    z25 = true;
                    i39 = 1;
                    i44 = i38;
                } else {
                    if (i49 != 0) {
                        z24 = false;
                    } else {
                        z24 = z15;
                    }
                    if (i26 != 0) {
                        pVar2 = null;
                    }
                    x5.r0.f188941a.getClass();
                    nb0.b bVar3 = x5.r0.a.f188943b;
                    if (i29 != 0) {
                        p006l2.z1.f108930g.getClass();
                        z1Var3 = p006l2.z1.f108931h;
                    } else {
                        z1Var3 = z1Var2;
                    }
                    if (z16) {
                        i38 = 1;
                    } else {
                        i38 = Integer.MAX_VALUE;
                    }
                    if ((i19 & 2097152) != 0) {
                        ba.f87580a.getClass();
                        r1VarE = ba.e(o0VarE);
                    } else {
                        r1VarE = r1Var;
                    }
                    r0Var3 = bVar3;
                    z1Var4 = z1Var3;
                    r1Var3 = r1VarE;
                    pVar4 = pVar2;
                    z25 = true;
                    i39 = 1;
                    i44 = i38;
                }
                o0VarE.h0();
                p3.x1 x1Var2 = p3.n.f135158a;
                o0VarE.C(1310051731);
                objQ = o0VarE.q();
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = kg.f.b(o0VarE);
                }
                jVar = (a2.j) objQ;
                o0VarE.g0(false);
                o0VarE.C(1981927842);
                jC = x0Var.c();
                if (jC == 16) {
                    jC = sgVar.d(z25, false, ((Boolean) xy2.b.k(jVar, o0VarE, 0).getF182175a()).booleanValue());
                }
                long j14 = jC;
                o0VarE.g0(false);
                boolean z27 = z24;
                p3.v.a(z2.u2.f201804a.c(sgVar.f89685k), z3.f.c(1874034984, new ja(rVar2, null, false, sgVar, str, lVar, z25, z27, x0Var.e(new s5.x0(j14, 0L, (w5.f0) null, (w5.b0) null, (w5.c0) null, (w5.q) null, (String) null, 0L, (d6.a) null, (d6.m) null, (z5.c) null, 0L, (d6.i) null, (o4.q1) null, (q4.g) null, 0, 0, 0L, (d6.n) null, (s5.c0) null, (d6.f) null, 0, 0, (d6.o) null, 16777214, (p005kotlin.jvm.internal.j) null)), a2Var, z1Var4, z16, i44, i39, r0Var3, jVar, null, null, pVar4, null, null, null, r1Var3), o0VarE), o0VarE, 56);
                z18 = z25;
                z19 = z27;
                z1Var2 = z1Var4;
                i36 = i44;
                i37 = i39;
                r0Var2 = r0Var3;
                pVar3 = pVar4;
                r1Var2 = r1Var3;
            } else {
                o0VarE.e();
                z18 = z14;
                z19 = z15;
                r0Var2 = r0Var;
                i36 = i14;
                i37 = i15;
                pVar3 = pVar2;
                r1Var2 = r1Var;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new e23.p() { // from class: i3.ea
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iT = p3.p0.t(i16 | 1);
                        int iT2 = p3.p0.t(i17);
                        int iT3 = p3.p0.t(i18);
                        na.a(str, lVar, rVar, z18, z19, x0Var, pVar3, r0Var2, a2Var, z1Var2, z16, i36, i37, r1Var2, sgVar, (p3.m) obj, iT, iT2, iT3, i19);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        i48 = i24 | 27648;
        if ((i16 & 196608) == 0) {
            if (o0VarE.B(x0Var)) {
                i47 = 131072;
            } else {
                i47 = 65536;
            }
            i48 |= i47;
        }
        i25 = i48 | 114819072;
        i26 = i19 & 512;
        if (i26 != 0) {
            if ((i16 & C.ENCODING_PCM_32BIT) == 0) {
                pVar2 = pVar;
                if (o0VarE.r(pVar2)) {
                    i27 = 536870912;
                } else {
                    i27 = 268435456;
                }
                i25 |= i27;
            }
            i28 = i17 | 28086;
            if ((i17 & 196608) == 0) {
                i28 |= o0VarE.B(a2Var) ? 131072 : 65536;
            }
            i29 = i19 & 65536;
            if (i29 != 0) {
                i28 |= 1572864;
                z1Var2 = z1Var;
            } else {
                z1Var2 = z1Var;
                if ((i17 & 1572864) == 0) {
                    if (o0VarE.B(z1Var2)) {
                        i30 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    } else {
                        i30 = 524288;
                    }
                    i28 |= i30;
                }
            }
            if ((i17 & 12582912) == 0) {
                if (o0VarE.h(z16)) {
                    i46 = 8388608;
                } else {
                    i46 = 4194304;
                }
                i28 |= i46;
            }
            if ((i17 & 100663296) == 0) {
                i28 |= 33554432;
            }
            int i58 = i28 | C.ENCODING_PCM_32BIT;
            i34 = i18 | 6;
            if ((i18 & 48) != 0) {
                if ((i19 & 2097152) == 0) {
                    i45 = 16;
                } else {
                    i45 = 16;
                }
                i34 |= i45;
            }
            if (o0VarE.B(sgVar)) {
                i35 = 256;
            } else {
                i35 = 128;
            }
            int i59 = i34 | i35;
            if ((i25 & 306783379) != 306783378) {
                z17 = true;
            } else {
                z17 = true;
            }
            if (o0VarE.n(i25 & 1, z17)) {
                o0VarE.G0();
                if ((i16 & 1) != 0) {
                    if (i49 != 0) {
                        z24 = false;
                    } else {
                        z24 = z15;
                    }
                    if (i26 != 0) {
                        pVar2 = null;
                    }
                    x5.r0.f188941a.getClass();
                    nb0.b bVar4 = x5.r0.a.f188943b;
                    if (i29 != 0) {
                        p006l2.z1.f108930g.getClass();
                        z1Var3 = p006l2.z1.f108931h;
                    } else {
                        z1Var3 = z1Var2;
                    }
                    if (z16) {
                        i38 = 1;
                    } else {
                        i38 = Integer.MAX_VALUE;
                    }
                    if ((i19 & 2097152) != 0) {
                        ba.f87580a.getClass();
                        r1VarE = ba.e(o0VarE);
                    } else {
                        r1VarE = r1Var;
                    }
                    r0Var3 = bVar4;
                    z1Var4 = z1Var3;
                    r1Var3 = r1VarE;
                    pVar4 = pVar2;
                    z25 = true;
                    i39 = 1;
                    i44 = i38;
                } else {
                    if (i49 != 0) {
                        z24 = false;
                    } else {
                        z24 = z15;
                    }
                    if (i26 != 0) {
                        pVar2 = null;
                    }
                    x5.r0.f188941a.getClass();
                    nb0.b bVar5 = x5.r0.a.f188943b;
                    if (i29 != 0) {
                        p006l2.z1.f108930g.getClass();
                        z1Var3 = p006l2.z1.f108931h;
                    } else {
                        z1Var3 = z1Var2;
                    }
                    if (z16) {
                        i38 = 1;
                    } else {
                        i38 = Integer.MAX_VALUE;
                    }
                    if ((i19 & 2097152) != 0) {
                        ba.f87580a.getClass();
                        r1VarE = ba.e(o0VarE);
                    } else {
                        r1VarE = r1Var;
                    }
                    r0Var3 = bVar5;
                    z1Var4 = z1Var3;
                    r1Var3 = r1VarE;
                    pVar4 = pVar2;
                    z25 = true;
                    i39 = 1;
                    i44 = i38;
                }
                o0VarE.h0();
                p3.x1 x1Var3 = p3.n.f135158a;
                o0VarE.C(1310051731);
                objQ = o0VarE.q();
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = kg.f.b(o0VarE);
                }
                jVar = (a2.j) objQ;
                o0VarE.g0(false);
                o0VarE.C(1981927842);
                jC = x0Var.c();
                if (jC == 16) {
                    jC = sgVar.d(z25, false, ((Boolean) xy2.b.k(jVar, o0VarE, 0).getF182175a()).booleanValue());
                }
                long j15 = jC;
                o0VarE.g0(false);
                boolean z28 = z24;
                p3.v.a(z2.u2.f201804a.c(sgVar.f89685k), z3.f.c(1874034984, new ja(rVar2, null, false, sgVar, str, lVar, z25, z28, x0Var.e(new s5.x0(j15, 0L, (w5.f0) null, (w5.b0) null, (w5.c0) null, (w5.q) null, (String) null, 0L, (d6.a) null, (d6.m) null, (z5.c) null, 0L, (d6.i) null, (o4.q1) null, (q4.g) null, 0, 0, 0L, (d6.n) null, (s5.c0) null, (d6.f) null, 0, 0, (d6.o) null, 16777214, (p005kotlin.jvm.internal.j) null)), a2Var, z1Var4, z16, i44, i39, r0Var3, jVar, null, null, pVar4, null, null, null, r1Var3), o0VarE), o0VarE, 56);
                z18 = z25;
                z19 = z28;
                z1Var2 = z1Var4;
                i36 = i44;
                i37 = i39;
                r0Var2 = r0Var3;
                pVar3 = pVar4;
                r1Var2 = r1Var3;
            } else {
                o0VarE.e();
                z18 = z14;
                z19 = z15;
                r0Var2 = r0Var;
                i36 = i14;
                i37 = i15;
                pVar3 = pVar2;
                r1Var2 = r1Var;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new e23.p() { // from class: i3.ea
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iT = p3.p0.t(i16 | 1);
                        int iT2 = p3.p0.t(i17);
                        int iT3 = p3.p0.t(i18);
                        na.a(str, lVar, rVar, z18, z19, x0Var, pVar3, r0Var2, a2Var, z1Var2, z16, i36, i37, r1Var2, sgVar, (p3.m) obj, iT, iT2, iT3, i19);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        i25 = i48 | 920125440;
        pVar2 = pVar;
        i28 = i17 | 28086;
        if ((i17 & 196608) == 0) {
            i28 |= o0VarE.B(a2Var) ? 131072 : 65536;
        }
        i29 = i19 & 65536;
        if (i29 != 0) {
            i28 |= 1572864;
            z1Var2 = z1Var;
        } else {
            z1Var2 = z1Var;
            if ((i17 & 1572864) == 0) {
                if (o0VarE.B(z1Var2)) {
                    i30 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                } else {
                    i30 = 524288;
                }
                i28 |= i30;
            }
        }
        if ((i17 & 12582912) == 0) {
            if (o0VarE.h(z16)) {
                i46 = 8388608;
            } else {
                i46 = 4194304;
            }
            i28 |= i46;
        }
        if ((i17 & 100663296) == 0) {
            i28 |= 33554432;
        }
        int i510 = i28 | C.ENCODING_PCM_32BIT;
        i34 = i18 | 6;
        if ((i18 & 48) != 0) {
            if ((i19 & 2097152) == 0) {
                i45 = 16;
            } else {
                i45 = 16;
            }
            i34 |= i45;
        }
        if (o0VarE.B(sgVar)) {
            i35 = 256;
        } else {
            i35 = 128;
        }
        int i511 = i34 | i35;
        if ((i25 & 306783379) != 306783378) {
            z17 = true;
        } else {
            z17 = true;
        }
        if (o0VarE.n(i25 & 1, z17)) {
            o0VarE.G0();
            if ((i16 & 1) != 0) {
                if (i49 != 0) {
                    z24 = false;
                } else {
                    z24 = z15;
                }
                if (i26 != 0) {
                    pVar2 = null;
                }
                x5.r0.f188941a.getClass();
                nb0.b bVar6 = x5.r0.a.f188943b;
                if (i29 != 0) {
                    p006l2.z1.f108930g.getClass();
                    z1Var3 = p006l2.z1.f108931h;
                } else {
                    z1Var3 = z1Var2;
                }
                if (z16) {
                    i38 = 1;
                } else {
                    i38 = Integer.MAX_VALUE;
                }
                if ((i19 & 2097152) != 0) {
                    ba.f87580a.getClass();
                    r1VarE = ba.e(o0VarE);
                } else {
                    r1VarE = r1Var;
                }
                r0Var3 = bVar6;
                z1Var4 = z1Var3;
                r1Var3 = r1VarE;
                pVar4 = pVar2;
                z25 = true;
                i39 = 1;
                i44 = i38;
            } else {
                if (i49 != 0) {
                    z24 = false;
                } else {
                    z24 = z15;
                }
                if (i26 != 0) {
                    pVar2 = null;
                }
                x5.r0.f188941a.getClass();
                nb0.b bVar7 = x5.r0.a.f188943b;
                if (i29 != 0) {
                    p006l2.z1.f108930g.getClass();
                    z1Var3 = p006l2.z1.f108931h;
                } else {
                    z1Var3 = z1Var2;
                }
                if (z16) {
                    i38 = 1;
                } else {
                    i38 = Integer.MAX_VALUE;
                }
                if ((i19 & 2097152) != 0) {
                    ba.f87580a.getClass();
                    r1VarE = ba.e(o0VarE);
                } else {
                    r1VarE = r1Var;
                }
                r0Var3 = bVar7;
                z1Var4 = z1Var3;
                r1Var3 = r1VarE;
                pVar4 = pVar2;
                z25 = true;
                i39 = 1;
                i44 = i38;
            }
            o0VarE.h0();
            p3.x1 x1Var4 = p3.n.f135158a;
            o0VarE.C(1310051731);
            objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = kg.f.b(o0VarE);
            }
            jVar = (a2.j) objQ;
            o0VarE.g0(false);
            o0VarE.C(1981927842);
            jC = x0Var.c();
            if (jC == 16) {
                jC = sgVar.d(z25, false, ((Boolean) xy2.b.k(jVar, o0VarE, 0).getF182175a()).booleanValue());
            }
            long j16 = jC;
            o0VarE.g0(false);
            boolean z29 = z24;
            p3.v.a(z2.u2.f201804a.c(sgVar.f89685k), z3.f.c(1874034984, new ja(rVar2, null, false, sgVar, str, lVar, z25, z29, x0Var.e(new s5.x0(j16, 0L, (w5.f0) null, (w5.b0) null, (w5.c0) null, (w5.q) null, (String) null, 0L, (d6.a) null, (d6.m) null, (z5.c) null, 0L, (d6.i) null, (o4.q1) null, (q4.g) null, 0, 0, 0L, (d6.n) null, (s5.c0) null, (d6.f) null, 0, 0, (d6.o) null, 16777214, (p005kotlin.jvm.internal.j) null)), a2Var, z1Var4, z16, i44, i39, r0Var3, jVar, null, null, pVar4, null, null, null, r1Var3), o0VarE), o0VarE, 56);
            z18 = z25;
            z19 = z29;
            z1Var2 = z1Var4;
            i36 = i44;
            i37 = i39;
            r0Var2 = r0Var3;
            pVar3 = pVar4;
            r1Var2 = r1Var3;
        } else {
            o0VarE.e();
            z18 = z14;
            z19 = z15;
            r0Var2 = r0Var;
            i36 = i14;
            i37 = i15;
            pVar3 = pVar2;
            r1Var2 = r1Var;
        }
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p() { // from class: i3.ea
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iT = p3.p0.t(i16 | 1);
                    int iT2 = p3.p0.t(i17);
                    int iT3 = p3.p0.t(i18);
                    na.a(str, lVar, rVar, z18, z19, x0Var, pVar3, r0Var2, a2Var, z1Var2, z16, i36, i37, r1Var2, sgVar, (p3.m) obj, iT, iT2, iT3, i19);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(final x5.l0 l0Var, final e23.l lVar, final h4.r rVar, boolean z14, s5.x0 x0Var, e23.p pVar, e23.p pVar2, e23.p pVar3, boolean z15, x5.r0 r0Var, final p006l2.a2 a2Var, p006l2.z1 z1Var, final boolean z16, int i14, int i15, o4.r1 r1Var, final sg sgVar, p3.m mVar, final int i16, final int i17, final int i18, final int i19) {
        int i24;
        h4.r rVar2;
        s5.x0 x0Var2;
        e23.p pVar4;
        e23.p pVar5;
        int i25;
        e23.p pVar6;
        int i26;
        int i27;
        int i28;
        int i29;
        p3.o0 o0Var;
        boolean z17;
        final boolean z18;
        final x5.r0 r0Var2;
        final p006l2.z1 z1Var2;
        final int i30;
        final o4.r1 r1Var2;
        final e23.p pVar7;
        final s5.x0 x0Var3;
        final e23.p pVar8;
        final int i34;
        x5.r0 r0Var3;
        p006l2.z1 z1Var3;
        o4.r1 r1VarE;
        x5.r0 r0Var4;
        o4.r1 r1Var3;
        e23.p pVar9;
        s5.x0 x0Var4;
        e23.p pVar10;
        int i35;
        p006l2.z1 z1Var4;
        int i36;
        boolean z19;
        boolean z24;
        p3.o0 o0VarE = mVar.E(2057288437);
        if ((i16 & 6) == 0) {
            i24 = (o0VarE.B(l0Var) ? 4 : 2) | i16;
        } else {
            i24 = i16;
        }
        if ((i16 & 48) == 0) {
            i24 |= o0VarE.r(lVar) ? 32 : 16;
        }
        if ((i16 & 384) == 0) {
            rVar2 = rVar;
            i24 |= o0VarE.B(rVar2) ? 256 : 128;
        } else {
            rVar2 = rVar;
        }
        int i37 = i24 | 27648;
        if ((196608 & i16) == 0) {
            if ((i19 & 32) == 0) {
                x0Var2 = x0Var;
                int i38 = o0VarE.B(x0Var2) ? 131072 : 65536;
                i37 |= i38;
            } else {
                x0Var2 = x0Var;
            }
            i37 |= i38;
        } else {
            x0Var2 = x0Var;
        }
        int i39 = i19 & 64;
        if (i39 != 0) {
            i37 |= 1572864;
            pVar4 = pVar;
        } else {
            pVar4 = pVar;
            if ((i16 & 1572864) == 0) {
                i37 |= o0VarE.r(pVar4) ? 1048576 : 524288;
            }
        }
        int i44 = i19 & 128;
        if (i44 != 0) {
            i37 |= 12582912;
            pVar5 = pVar2;
        } else {
            pVar5 = pVar2;
            if ((i16 & 12582912) == 0) {
                i37 |= o0VarE.r(pVar5) ? 8388608 : 4194304;
            }
        }
        int i45 = i37 | 905969664;
        int i46 = i17 | 54;
        int i47 = i19 & 4096;
        if (i47 != 0) {
            pVar6 = pVar3;
            i26 = 12779958;
            i25 = 65536;
        } else {
            i25 = 65536;
            if ((i17 & 384) == 0) {
                pVar6 = pVar3;
                i46 |= o0VarE.r(pVar6) ? 256 : 128;
            } else {
                pVar6 = pVar3;
            }
            i26 = i46;
        }
        int i48 = i19 & 8192;
        if (i48 != 0) {
            i27 = i26 | 3072;
        } else {
            i27 = i26 | (o0VarE.h(z15) ? 2048 : 1024);
        }
        int i49 = i19 & 16384;
        if (i49 != 0) {
            i28 = i27 | 24576;
        } else {
            i28 = i27 | (o0VarE.B(r0Var) ? 16384 : 8192);
        }
        int i54 = i19 & i25;
        if (i54 != 0) {
            i29 = i28 | 1572864;
        } else {
            i29 = i28 | (o0VarE.B(z1Var) ? 1048576 : 524288);
        }
        int i55 = i29 | 838860800;
        int i56 = i18 | 6;
        if ((i18 & 48) == 0) {
            i56 |= ((i19 & 2097152) == 0 && o0VarE.B(r1Var)) ? 32 : 16;
        }
        if (o0VarE.n(i45 & 1, ((i45 & 306783379) == 306783378 && (i55 & 306783379) == 306783378 && ((i56 | (o0VarE.B(sgVar) ? 256 : 128)) & 147) == 146) ? false : true)) {
            o0VarE.G0();
            if ((i16 & 1) == 0 || o0VarE.o0()) {
                if ((i19 & 32) != 0) {
                    x0Var2 = (s5.x0) o0VarE.A(mh.f89022a);
                }
                if (i39 != 0) {
                    pVar4 = null;
                }
                if (i44 != 0) {
                    pVar5 = null;
                }
                if (i47 != 0) {
                    pVar6 = null;
                }
                boolean z25 = i48 != 0 ? false : z15;
                if (i49 != 0) {
                    x5.r0.f188941a.getClass();
                    r0Var3 = x5.r0.a.f188943b;
                } else {
                    r0Var3 = r0Var;
                }
                if (i54 != 0) {
                    p006l2.z1.f108930g.getClass();
                    z1Var3 = p006l2.z1.f108931h;
                } else {
                    z1Var3 = z1Var;
                }
                int i57 = z16 ? 1 : Integer.MAX_VALUE;
                if ((i19 & 2097152) != 0) {
                    ba.f87580a.getClass();
                    r1VarE = ba.e(o0VarE);
                } else {
                    r1VarE = r1Var;
                }
                r0Var4 = r0Var3;
                r1Var3 = r1VarE;
                pVar9 = pVar5;
                x0Var4 = x0Var2;
                pVar10 = pVar6;
                i35 = 1;
                z1Var4 = z1Var3;
                i36 = i57;
                z19 = z25;
                z24 = true;
            } else {
                o0VarE.e();
                z24 = z14;
                z19 = z15;
                r0Var4 = r0Var;
                r1Var3 = r1Var;
                pVar9 = pVar5;
                x0Var4 = x0Var2;
                pVar10 = pVar6;
                z1Var4 = z1Var;
                i36 = i14;
                i35 = i15;
            }
            e23.p pVar11 = pVar4;
            o0VarE.h0();
            p3.x1 x1Var = p3.n.f135158a;
            o0VarE.C(-502250010);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = kg.f.b(o0VarE);
            }
            a2.j jVar = (a2.j) objQ;
            o0VarE.g0(false);
            o0VarE.C(1369277167);
            long jC = x0Var4.c();
            if (jC == 16) {
                jC = sgVar.d(z24, z19, ((Boolean) xy2.b.k(jVar, o0VarE, 0).getF182175a()).booleanValue());
            }
            long j8 = jC;
            o0VarE.g0(false);
            z17 = z24;
            boolean z26 = z19;
            o0Var = o0VarE;
            p3.v.a(z2.u2.f201804a.c(sgVar.f89685k), z3.f.c(-2094276683, new ma(rVar2, pVar11, z26, sgVar, l0Var, lVar, z17, false, x0Var4.e(new s5.x0(j8, 0L, (w5.f0) null, (w5.b0) null, (w5.c0) null, (w5.q) null, (String) null, 0L, (d6.a) null, (d6.m) null, (z5.c) null, 0L, (d6.i) null, (o4.q1) null, (q4.g) null, 0, 0, 0L, (d6.n) null, (s5.c0) null, (d6.f) null, 0, 0, (d6.o) null, 16777214, (p005kotlin.jvm.internal.j) null)), a2Var, z1Var4, z16, i36, i35, r0Var4, jVar, pVar9, null, null, null, null, pVar10, r1Var3), o0Var), o0Var, 56);
            pVar7 = pVar11;
            z18 = z26;
            z1Var2 = z1Var4;
            r0Var2 = r0Var4;
            pVar5 = pVar9;
            pVar8 = pVar10;
            r1Var2 = r1Var3;
            x0Var3 = x0Var4;
            i30 = i35;
            i34 = i36;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            z17 = z14;
            z18 = z15;
            r0Var2 = r0Var;
            z1Var2 = z1Var;
            i30 = i15;
            r1Var2 = r1Var;
            pVar7 = pVar4;
            x0Var3 = x0Var2;
            pVar8 = pVar6;
            i34 = i14;
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            final boolean z27 = z17;
            final e23.p pVar12 = pVar5;
            p2VarI0.f135219d = new e23.p() { // from class: i3.da
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iT = p3.p0.t(i16 | 1);
                    int iT2 = p3.p0.t(i17);
                    int iT3 = p3.p0.t(i18);
                    na.b(l0Var, lVar, rVar, z27, x0Var3, pVar7, pVar12, pVar8, z18, r0Var2, a2Var, z1Var2, z16, i34, i30, r1Var2, sgVar, (p3.m) obj, iT, iT2, iT3, i19);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:147:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:274:0x0562  */
    /* JADX WARN: Code duplicated, block: B:277:0x056a  */
    /* JADX WARN: Code duplicated, block: B:278:0x056c  */
    /* JADX WARN: Code duplicated, block: B:281:0x05a5  */
    /* JADX WARN: Code duplicated, block: B:283:0x05ac  */
    /* JADX WARN: Code duplicated, block: B:284:0x05b0  */
    /* JADX WARN: Code duplicated, block: B:287:0x05bd  */
    /* JADX WARN: Code duplicated, block: B:289:0x05cb  */
    /* JADX WARN: Code duplicated, block: B:291:0x05df  */
    public static final void c(final h4.r rVar, final e23.p pVar, e23.q qVar, e23.p pVar2, final e23.p pVar3, final e23.p pVar4, final e23.p pVar5, e23.p pVar6, final boolean z14, final fh.b bVar, final l3.k2.b bVar2, final e23.l lVar, final z3.e eVar, e23.p pVar7, final c2.h2 h2Var, p3.m mVar, final int i14, final int i15) {
        int i16;
        int i17;
        e23.p pVar8;
        e23.p pVar9;
        e23.q qVar2;
        p3.o0 o0Var;
        int i18;
        int i19;
        float f14;
        h4.d.c cVar;
        int i24;
        float f15;
        float f16;
        boolean z15;
        l3.k2.b bVar3;
        boolean z16;
        Object objQ;
        f5.z0 z0VarD;
        int iP;
        p3.i2 i2VarA0;
        h4.r rVarC;
        final e23.p pVar10 = pVar6;
        p3.o0 o0VarE = mVar.E(753699262);
        p3.c<?> cVar2 = o0VarE.f135177b;
        if ((i14 & 6) == 0) {
            i16 = i14 | (o0VarE.B(rVar) ? 4 : 2);
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= o0VarE.r(pVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= o0VarE.r(qVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i16 |= o0VarE.r(pVar2) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i16 |= o0VarE.r(pVar3) ? 16384 : 8192;
        }
        if ((i14 & 196608) == 0) {
            i16 |= o0VarE.r(pVar4) ? 131072 : 65536;
        }
        if ((i14 & 1572864) == 0) {
            i16 |= o0VarE.r(pVar5) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((i14 & 12582912) == 0) {
            i16 |= o0VarE.r(pVar10) ? 8388608 : 4194304;
        }
        if ((i14 & 100663296) == 0) {
            i16 |= o0VarE.h(z14) ? 67108864 : 33554432;
        }
        if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
            i16 |= o0VarE.B(bVar) ? 536870912 : 268435456;
        }
        int i25 = i16;
        if ((i15 & 6) == 0) {
            i17 = i15 | ((i15 & 8) == 0 ? o0VarE.B(bVar2) : o0VarE.r(bVar2) ? 4 : 2);
        } else {
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            i17 |= o0VarE.r(lVar) ? 32 : 16;
        }
        if ((i15 & 384) == 0) {
            i17 |= o0VarE.r(eVar) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i17 |= o0VarE.r(pVar7) ? 2048 : 1024;
        }
        if ((i15 & 24576) == 0) {
            i17 |= o0VarE.B(h2Var) ? 16384 : 8192;
        }
        int i26 = i17;
        if (o0VarE.n(i25 & 1, ((i25 & 306783379) == 306783378 && (i26 & 9363) == 9362) ? false : true)) {
            p3.x1 x1Var = p3.n.f135158a;
            float fH = l3.k2.h(o0VarE);
            int i27 = i26 & 14;
            boolean zI = ((i25 & 234881024) == 67108864) | ((i26 & 112) == 32) | ((i25 & 1879048192) == 536870912) | (i27 == 4 || ((i26 & 8) != 0 && o0VarE.B(bVar2))) | ((i26 & 57344) == 16384) | o0VarE.i(fH);
            Object objQ2 = o0VarE.q();
            p3.m.a aVar = p3.m.f135153a;
            if (zI) {
                i18 = i27;
                o0Var = o0VarE;
                pa paVar = new pa(lVar, z14, bVar, bVar2, h2Var, fH, null);
                o0Var.K(paVar);
                objQ2 = paVar;
            } else {
                aVar.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    i18 = i27;
                    o0Var = o0VarE;
                    pa paVar2 = new pa(lVar, z14, bVar, bVar2, h2Var, fH, null);
                    o0Var.K(paVar2);
                    objQ2 = paVar2;
                } else {
                    i18 = i27;
                    o0Var = o0VarE;
                }
            }
            pa paVar3 = (pa) objQ2;
            g6.o oVar = (g6.o) o0Var.A(kotlin.t1.f91496n);
            int iP2 = o0Var.P();
            p3.i2 i2VarA1 = o0Var.a0();
            h4.r rVarC2 = h4.k.c(rVar, o0Var);
            h5.g.V.getClass();
            h5.e0.a aVar2 = h5.g.a.f81805b;
            if (cVar2 == null) {
                p3.p0.l();
                throw null;
            }
            o0Var.z();
            if (o0Var.T) {
                o0Var.M(aVar2);
            } else {
                o0Var.c();
            }
            h5.g.a.e eVar2 = h5.g.a.f81810g;
            p3.b4.c(eVar2, paVar3, o0Var);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            p3.b4.c(c1623g, i2VarA1, o0Var);
            h5.g.a.b bVar4 = h5.g.a.f81813j;
            if (o0Var.T || !p005kotlin.jvm.internal.s.g(o0Var.q(), Integer.valueOf(iP2))) {
                v.h.A(iP2, o0Var, iP2, bVar4);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            p3.b4.c(fVar, rVarC2, o0Var);
            int i28 = i26 >> 6;
            int i29 = 14;
            eVar.invoke(o0Var, Integer.valueOf(i28 & 14));
            if (pVar3 != null) {
                o0Var.C(2145628269);
                h4.r rVarThen = f5.g0.e(h4.r.S, "Leading").then(d8.f87832a);
                h4.d.f81522a.getClass();
                f5.z0 z0VarD2 = c2.q.d(h4.d.a.f81528f, false);
                int iP3 = o0Var.P();
                p3.i2 i2VarA2 = o0Var.a0();
                h4.r rVarC3 = h4.k.c(rVarThen, o0Var);
                if (cVar2 == null) {
                    p3.p0.l();
                    throw null;
                }
                o0Var.z();
                if (o0Var.T) {
                    o0Var.M(aVar2);
                } else {
                    o0Var.c();
                }
                p3.b4.c(eVar2, z0VarD2, o0Var);
                p3.b4.c(c1623g, i2VarA2, o0Var);
                if (o0Var.T || !p005kotlin.jvm.internal.s.g(o0Var.q(), Integer.valueOf(iP3))) {
                    v.h.A(iP3, o0Var, iP3, bVar4);
                }
                p3.b4.c(fVar, rVarC3, o0Var);
                c2.u uVar = c2.u.f22885a;
                e5.r((i25 >> 12) & 14, pVar3, o0Var, true, false);
            } else {
                o0Var.C(2145874285);
                o0Var.g0(false);
            }
            if (pVar4 != null) {
                o0Var.C(2145917003);
                h4.r rVarThen2 = f5.g0.e(h4.r.S, "Trailing").then(d8.f87832a);
                h4.d.f81522a.getClass();
                f5.z0 z0VarD3 = c2.q.d(h4.d.a.f81528f, false);
                int iP4 = o0Var.P();
                p3.i2 i2VarA3 = o0Var.a0();
                h4.r rVarC4 = h4.k.c(rVarThen2, o0Var);
                if (cVar2 == null) {
                    p3.p0.l();
                    throw null;
                }
                o0Var.z();
                if (o0Var.T) {
                    o0Var.M(aVar2);
                } else {
                    o0Var.c();
                }
                p3.b4.c(eVar2, z0VarD3, o0Var);
                p3.b4.c(c1623g, i2VarA3, o0Var);
                if (o0Var.T || !p005kotlin.jvm.internal.s.g(o0Var.q(), Integer.valueOf(iP4))) {
                    v.h.A(iP4, o0Var, iP4, bVar4);
                }
                p3.b4.c(fVar, rVarC4, o0Var);
                c2.u uVar2 = c2.u.f22885a;
                i19 = 0;
                e5.r((i25 >> 15) & 14, pVar4, o0Var, true, false);
            } else {
                i19 = 0;
                o0Var.C(2146164941);
                o0Var.g0(false);
            }
            float fI = c2.l.i(h2Var, oVar);
            float fH2 = c2.l.h(h2Var, oVar);
            if (pVar3 != null) {
                fI -= fH;
                float f17 = i19;
                if (fI < f17) {
                    fI = f17;
                }
            }
            float f18 = fI;
            if (pVar4 != null) {
                fH2 -= fH;
                float f19 = i19;
                if (fH2 < f19) {
                    fH2 = f19;
                }
            }
            if (pVar5 != null) {
                o0Var.C(2146868920);
                h4.r rVarC5 = c2.l.C(c2.x2.x(c2.x2.j(f5.g0.e(h4.r.S, "Prefix"), l3.k2.f109305f, 0.0f, 2), null, 3), f18, 0.0f, l3.k2.f109304e, 0.0f, 10);
                h4.d.f81522a.getClass();
                f5.z0 z0VarD4 = c2.q.d(h4.d.a.f81524b, false);
                int iP5 = o0Var.P();
                p3.i2 i2VarA4 = o0Var.a0();
                h4.r rVarC6 = h4.k.c(rVarC5, o0Var);
                if (cVar2 == null) {
                    p3.p0.l();
                    throw null;
                }
                o0Var.z();
                if (o0Var.T) {
                    o0Var.M(aVar2);
                } else {
                    o0Var.c();
                }
                p3.b4.c(eVar2, z0VarD4, o0Var);
                p3.b4.c(c1623g, i2VarA4, o0Var);
                if (o0Var.T || !p005kotlin.jvm.internal.s.g(o0Var.q(), Integer.valueOf(iP5))) {
                    v.h.A(iP5, o0Var, iP5, bVar4);
                }
                p3.b4.c(fVar, rVarC6, o0Var);
                c2.u uVar3 = c2.u.f22885a;
                e5.r((i25 >> 18) & 14, pVar5, o0Var, true, false);
            } else {
                o0Var.C(2147196621);
                o0Var.g0(false);
            }
            if (pVar6 != null) {
                o0Var.C(2147239866);
                f14 = fH2;
                h4.r rVarC7 = c2.l.C(c2.x2.x(c2.x2.j(f5.g0.e(h4.r.S, "Suffix"), l3.k2.f109305f, 0.0f, 2), null, 3), l3.k2.f109304e, 0.0f, f14, 0.0f, 10);
                h4.d.f81522a.getClass();
                f5.z0 z0VarD5 = c2.q.d(h4.d.a.f81524b, false);
                int iP6 = o0Var.P();
                p3.i2 i2VarA5 = o0Var.a0();
                h4.r rVarC8 = h4.k.c(rVarC7, o0Var);
                if (cVar2 == null) {
                    p3.p0.l();
                    throw null;
                }
                o0Var.z();
                if (o0Var.T) {
                    o0Var.M(aVar2);
                } else {
                    o0Var.c();
                }
                p3.b4.c(eVar2, z0VarD5, o0Var);
                p3.b4.c(c1623g, i2VarA5, o0Var);
                if (o0Var.T || !p005kotlin.jvm.internal.s.g(o0Var.q(), Integer.valueOf(iP6))) {
                    v.h.A(iP6, o0Var, iP6, bVar4);
                }
                p3.b4.c(fVar, rVarC8, o0Var);
                c2.u uVar4 = c2.u.f22885a;
                pVar10 = pVar6;
                e5.r((i25 >> 21) & 14, pVar10, o0Var, true, false);
                cVar = null;
            } else {
                pVar10 = pVar6;
                f14 = fH2;
                cVar = null;
                o0Var.C(-2147401651);
                o0Var.g0(false);
            }
            h4.r.a aVar3 = h4.r.S;
            h4.r rVarX = c2.x2.x(c2.x2.j(aVar3, l3.k2.f109305f, 0.0f, 2), cVar, 3);
            if (pVar5 == null) {
                f15 = f18;
                i24 = 0;
            } else {
                i24 = 0;
                g6.f.a aVar4 = g6.f.f75994b;
                f15 = 0;
            }
            if (pVar10 == null) {
                f16 = f14;
            } else {
                g6.f.a aVar5 = g6.f.f75994b;
                f16 = i24;
            }
            h4.r rVarC9 = c2.l.C(rVarX, f15, 0.0f, f16, 0.0f, 10);
            if (qVar != null) {
                o0Var.C(-2147031666);
                qVar2 = qVar;
                qVar2.invoke(f5.g0.e(aVar3, "Hint").then(rVarC9), o0Var, Integer.valueOf((i25 >> 3) & 112));
                o0Var.g0(false);
            } else {
                qVar2 = qVar;
                o0Var.C(-2146940371);
                o0Var.g0(false);
            }
            h4.r rVarThen3 = f5.g0.e(aVar3, "TextField").then(rVarC9);
            h4.d.f81522a.getClass();
            h4.g gVar = h4.d.a.f81524b;
            f5.z0 z0VarD6 = c2.q.d(gVar, true);
            int iP7 = o0Var.P();
            p3.i2 i2VarA6 = o0Var.a0();
            h4.r rVarC10 = h4.k.c(rVarThen3, o0Var);
            if (cVar2 == null) {
                p3.p0.l();
                throw null;
            }
            o0Var.z();
            if (o0Var.T) {
                o0Var.M(aVar2);
            } else {
                o0Var.c();
            }
            p3.b4.c(eVar2, z0VarD6, o0Var);
            p3.b4.c(c1623g, i2VarA6, o0Var);
            if (o0Var.T || !p005kotlin.jvm.internal.s.g(o0Var.q(), Integer.valueOf(iP7))) {
                v.h.A(iP7, o0Var, iP7, bVar4);
            }
            p3.b4.c(fVar, rVarC10, o0Var);
            c2.u uVar5 = c2.u.f22885a;
            e5.q((i25 >> 3) & 14, pVar, o0Var, true);
            if (pVar2 != null) {
                o0Var.C(-2146287790);
                if (i18 != 4) {
                    if ((i26 & 8) != 0) {
                        bVar3 = bVar2;
                        if (o0Var.r(bVar3)) {
                        }
                        objQ = o0Var.q();
                        if (z16) {
                            objQ = new fa(bVar3, 0);
                            o0Var.K(objQ);
                        } else {
                            aVar.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = new fa(bVar3, 0);
                                o0Var.K(objQ);
                            }
                        }
                        h4.r rVarThen4 = f5.g0.e(c2.x2.x(f5.g0.d(aVar3, new ak0.p((e23.a) objQ, i29)), null, 3), "Label").then(aVar3);
                        z0VarD = c2.q.d(gVar, false);
                        iP = o0Var.P();
                        i2VarA0 = o0Var.a0();
                        rVarC = h4.k.c(rVarThen4, o0Var);
                        if (cVar2 == null) {
                            p3.p0.l();
                            throw null;
                        }
                        o0Var.z();
                        if (o0Var.T) {
                            o0Var.M(aVar2);
                        } else {
                            o0Var.c();
                        }
                        p3.b4.c(eVar2, z0VarD, o0Var);
                        p3.b4.c(c1623g, i2VarA0, o0Var);
                        if (o0Var.T || !p005kotlin.jvm.internal.s.g(o0Var.q(), Integer.valueOf(iP))) {
                            v.h.A(iP, o0Var, iP, bVar4);
                        }
                        p3.b4.c(fVar, rVarC, o0Var);
                        pVar8 = pVar2;
                        e5.r((i25 >> 9) & 14, pVar8, o0Var, true, false);
                    } else {
                        bVar3 = bVar2;
                    }
                    z16 = false;
                    objQ = o0Var.q();
                    if (z16) {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new fa(bVar3, 0);
                            o0Var.K(objQ);
                        }
                    } else {
                        objQ = new fa(bVar3, 0);
                        o0Var.K(objQ);
                    }
                    h4.r rVarThen5 = f5.g0.e(c2.x2.x(f5.g0.d(aVar3, new ak0.p((e23.a) objQ, i29)), null, 3), "Label").then(aVar3);
                    z0VarD = c2.q.d(gVar, false);
                    iP = o0Var.P();
                    i2VarA0 = o0Var.a0();
                    rVarC = h4.k.c(rVarThen5, o0Var);
                    if (cVar2 == null) {
                        p3.p0.l();
                        throw null;
                    }
                    o0Var.z();
                    if (o0Var.T) {
                        o0Var.M(aVar2);
                    } else {
                        o0Var.c();
                    }
                    p3.b4.c(eVar2, z0VarD, o0Var);
                    p3.b4.c(c1623g, i2VarA0, o0Var);
                    if (o0Var.T) {
                        v.h.A(iP, o0Var, iP, bVar4);
                    } else {
                        v.h.A(iP, o0Var, iP, bVar4);
                    }
                    p3.b4.c(fVar, rVarC, o0Var);
                    pVar8 = pVar2;
                    e5.r((i25 >> 9) & 14, pVar8, o0Var, true, false);
                } else {
                    bVar3 = bVar2;
                }
                z16 = true;
                objQ = o0Var.q();
                if (z16) {
                    aVar.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new fa(bVar3, 0);
                        o0Var.K(objQ);
                    }
                } else {
                    objQ = new fa(bVar3, 0);
                    o0Var.K(objQ);
                }
                h4.r rVarThen6 = f5.g0.e(c2.x2.x(f5.g0.d(aVar3, new ak0.p((e23.a) objQ, i29)), null, 3), "Label").then(aVar3);
                z0VarD = c2.q.d(gVar, false);
                iP = o0Var.P();
                i2VarA0 = o0Var.a0();
                rVarC = h4.k.c(rVarThen6, o0Var);
                if (cVar2 == null) {
                    p3.p0.l();
                    throw null;
                }
                o0Var.z();
                if (o0Var.T) {
                    o0Var.M(aVar2);
                } else {
                    o0Var.c();
                }
                p3.b4.c(eVar2, z0VarD, o0Var);
                p3.b4.c(c1623g, i2VarA0, o0Var);
                if (o0Var.T) {
                    v.h.A(iP, o0Var, iP, bVar4);
                } else {
                    v.h.A(iP, o0Var, iP, bVar4);
                }
                p3.b4.c(fVar, rVarC, o0Var);
                pVar8 = pVar2;
                e5.r((i25 >> 9) & 14, pVar8, o0Var, true, false);
            } else {
                pVar8 = pVar2;
                o0Var.C(-2145892819);
                o0Var.g0(false);
            }
            if (pVar7 != null) {
                o0Var.C(-2145844304);
                h4.r rVarX2 = c2.l.x(c2.x2.x(c2.x2.j(f5.g0.e(aVar3, "Supporting"), l3.k2.f109307h, 0.0f, 2), null, 3), wg.f(wg.f90137a));
                f5.z0 z0VarD7 = c2.q.d(gVar, false);
                int iP8 = o0Var.P();
                p3.i2 i2VarA7 = o0Var.a0();
                h4.r rVarC11 = h4.k.c(rVarX2, o0Var);
                if (cVar2 == null) {
                    p3.p0.l();
                    throw null;
                }
                o0Var.z();
                if (o0Var.T) {
                    o0Var.M(aVar2);
                } else {
                    o0Var.c();
                }
                p3.b4.c(eVar2, z0VarD7, o0Var);
                p3.b4.c(c1623g, i2VarA7, o0Var);
                if (o0Var.T || !p005kotlin.jvm.internal.s.g(o0Var.q(), Integer.valueOf(iP8))) {
                    v.h.A(iP8, o0Var, iP8, bVar4);
                }
                p3.b4.c(fVar, rVarC11, o0Var);
                pVar9 = pVar7;
                z15 = true;
                e5.r((i26 >> 9) & 14, pVar9, o0Var, true, false);
            } else {
                pVar9 = pVar7;
                z15 = true;
                o0Var.C(-2145508915);
                o0Var.g0(false);
            }
            o0Var.g0(z15);
        } else {
            pVar8 = pVar2;
            pVar9 = pVar7;
            qVar2 = qVar;
            o0Var = o0VarE;
            o0Var.e();
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            final e23.p pVar11 = pVar8;
            final e23.q qVar3 = qVar2;
            final e23.p pVar12 = pVar9;
            p2VarI0.f135219d = new e23.p() { // from class: i3.ga
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iT = p3.p0.t(i14 | 1);
                    int iT2 = p3.p0.t(i15);
                    na.c(rVar, pVar, qVar3, pVar11, pVar3, pVar4, pVar5, pVar10, z14, bVar, bVar2, lVar, eVar, pVar12, h2Var, (p3.m) obj, iT, iT2);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
