package a3;

import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import p005kotlin.Unit;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes.dex */
public final class n {
    public static final void a(final e23.a aVar, final e23.p pVar, final h4.r rVar, final e23.p pVar2, final e23.p pVar3, o4.r1 r1Var, long j8, long j14, final p004k6.u uVar, p3.m mVar, final int i14) {
        int i15;
        h4.r rVar2;
        e23.p pVar4;
        e23.p pVar5;
        p3.o0 o0Var;
        final o4.r1 r1Var2;
        final long j15;
        final long j16;
        int i16;
        o4.r1 r1Var3;
        long j17;
        long jA;
        p3.o0 o0VarE = mVar.E(1967984963);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(aVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(pVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            rVar2 = rVar;
            i15 |= o0VarE.B(rVar2) ? 256 : 128;
        } else {
            rVar2 = rVar;
        }
        int i17 = i15 | 3072;
        if ((i14 & 24576) == 0) {
            pVar4 = pVar2;
            i17 |= o0VarE.r(pVar4) ? 16384 : 8192;
        } else {
            pVar4 = pVar2;
        }
        if ((196608 & i14) == 0) {
            pVar5 = pVar3;
            i17 |= o0VarE.r(pVar5) ? 131072 : 65536;
        } else {
            pVar5 = pVar3;
        }
        if ((1572864 & i14) == 0) {
            i17 |= 524288;
        }
        if ((12582912 & i14) == 0) {
            i17 |= 4194304;
        }
        if ((100663296 & i14) == 0) {
            i17 |= 33554432;
        }
        if ((805306368 & i14) == 0) {
            i17 |= o0VarE.B(uVar) ? 536870912 : 268435456;
        }
        if (o0VarE.n(i17 & 1, (306783379 & i17) != 306783378)) {
            o0VarE.G0();
            if ((i14 & 1) == 0 || o0VarE.o0()) {
                o0 o0Var2 = o0.f762a;
                o0Var2.getClass();
                k2.a aVar2 = o0.b(o0VarE).f672b;
                o0Var2.getClass();
                long jB = o0.a(o0VarE).b();
                i16 = i17 & (-267911169);
                r1Var3 = aVar2;
                j17 = jB;
                jA = u.a(jB, o0VarE);
            } else {
                o0VarE.e();
                i16 = i17 & (-267911169);
                r1Var3 = r1Var;
                j17 = j8;
                jA = j14;
            }
            o0VarE.h0();
            x1 x1Var = p3.n.f135158a;
            int i18 = (2147483646 & i16) >> 3;
            o0Var = o0VarE;
            b(aVar, z3.f.c(-309297447, new j(null, pVar), o0VarE), rVar2, pVar4, pVar5, r1Var3, j17, jA, uVar, o0Var, (i16 & 896) | (i16 & 14) | 48 | (i18 & 7168) | (57344 & i18) | (i18 & 234881024), 0);
            r1Var2 = r1Var3;
            j15 = j17;
            j16 = jA;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            r1Var2 = r1Var;
            j15 = j8;
            j16 = j14;
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p() { // from class: a3.l
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    n.a(aVar, pVar, rVar, pVar2, pVar3, r1Var2, j15, j16, uVar, (p3.m) obj, p3.p0.t(i14 | 1));
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:108:0x012f A[PHI: r1 r4 r7 r8 r10
      0x012f: PHI (r1v26 int) = (r1v14 int), (r1v31 int), (r1v32 int) binds: [B:123:0x0173, B:106:0x012c, B:107:0x012e] A[DONT_GENERATE, DONT_INLINE]
      0x012f: PHI (r4v9 h4.r) = (r4v4 h4.r), (r4v2 h4.r), (r4v2 h4.r) binds: [B:123:0x0173, B:106:0x012c, B:107:0x012e] A[DONT_GENERATE, DONT_INLINE]
      0x012f: PHI (r7v10 o4.r1) = (r7v6 o4.r1), (r7v3 o4.r1), (r7v3 o4.r1) binds: [B:123:0x0173, B:106:0x012c, B:107:0x012e] A[DONT_GENERATE, DONT_INLINE]
      0x012f: PHI (r8v7 long) = (r8v4 long), (r8v3 long), (r8v3 long) binds: [B:123:0x0173, B:106:0x012c, B:107:0x012e] A[DONT_GENERATE, DONT_INLINE]
      0x012f: PHI (r10v7 long) = (r10v4 long), (r10v3 long), (r10v3 long) binds: [B:123:0x0173, B:106:0x012c, B:107:0x012e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:110:0x013a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:111:0x013c  */
    /* JADX WARN: Code duplicated, block: B:114:0x0143  */
    /* JADX WARN: Code duplicated, block: B:115:0x0152  */
    /* JADX WARN: Code duplicated, block: B:118:0x0158  */
    /* JADX WARN: Code duplicated, block: B:121:0x016b  */
    /* JADX WARN: Code duplicated, block: B:122:0x0172  */
    /* JADX WARN: Code duplicated, block: B:124:0x0175  */
    /* JADX WARN: Code duplicated, block: B:126:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:129:0x01da  */
    /* JADX WARN: Code duplicated, block: B:131:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0052  */
    /* JADX WARN: Code duplicated, block: B:32:0x005a  */
    /* JADX WARN: Code duplicated, block: B:33:0x005d  */
    /* JADX WARN: Code duplicated, block: B:35:0x0061  */
    /* JADX WARN: Code duplicated, block: B:38:0x0067  */
    /* JADX WARN: Code duplicated, block: B:40:0x006f  */
    /* JADX WARN: Code duplicated, block: B:41:0x0072  */
    /* JADX WARN: Code duplicated, block: B:43:0x0076  */
    /* JADX WARN: Code duplicated, block: B:46:0x007d  */
    /* JADX WARN: Code duplicated, block: B:48:0x0081  */
    /* JADX WARN: Code duplicated, block: B:50:0x0089  */
    /* JADX WARN: Code duplicated, block: B:51:0x008c  */
    /* JADX WARN: Code duplicated, block: B:54:0x0092  */
    /* JADX WARN: Code duplicated, block: B:57:0x0099  */
    /* JADX WARN: Code duplicated, block: B:59:0x009d  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:76:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:80:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:82:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:89:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:90:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:93:0x0101  */
    public static final void b(final e23.a aVar, final z3.e eVar, h4.r rVar, final e23.p pVar, final e23.p pVar2, o4.r1 r1Var, long j8, long j14, p004k6.u uVar, p3.m mVar, final int i14, final int i15) {
        int i16;
        h4.r rVar2;
        e23.p pVar3;
        e23.p pVar4;
        o4.r1 r1Var2;
        long jB;
        long jA;
        int i17;
        int i18;
        int i19;
        boolean z14;
        final h4.r rVar3;
        final o4.r1 r1Var3;
        final long j15;
        final long j16;
        final p004k6.u uVar2;
        p2 p2VarI0;
        int i24;
        int i25;
        p004k6.u uVar3;
        int i26;
        int i27;
        p3.o0 o0VarE = mVar.E(1409209698);
        if ((i14 & 6) == 0) {
            i16 = (o0VarE.r(aVar) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= o0VarE.r(eVar) ? 32 : 16;
        }
        int i28 = i15 & 4;
        if (i28 == 0) {
            if ((i14 & 384) == 0) {
                rVar2 = rVar;
                i16 |= o0VarE.B(rVar2) ? 256 : 128;
            }
            if ((i14 & 3072) == 0) {
                pVar3 = pVar;
                if (o0VarE.r(pVar3)) {
                    i27 = 2048;
                } else {
                    i27 = 1024;
                }
                i16 |= i27;
            } else {
                pVar3 = pVar;
            }
            if ((i14 & 24576) == 0) {
                pVar4 = pVar2;
                if (o0VarE.r(pVar4)) {
                    i26 = 16384;
                } else {
                    i26 = 8192;
                }
                i16 |= i26;
            } else {
                pVar4 = pVar2;
            }
            if ((196608 & i14) == 0) {
                if ((i15 & 32) == 0) {
                    r1Var2 = r1Var;
                    int i29 = o0VarE.B(r1Var2) ? 131072 : 65536;
                    i16 |= i29;
                } else {
                    r1Var2 = r1Var;
                }
                i16 |= i29;
            } else {
                r1Var2 = r1Var;
            }
            if ((1572864 & i14) == 0) {
                if ((i15 & 64) == 0) {
                    jB = j8;
                    int i30 = o0VarE.l(jB) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
                    i16 |= i30;
                } else {
                    jB = j8;
                }
                i16 |= i30;
            } else {
                jB = j8;
            }
            if ((12582912 & i14) == 0) {
                if ((i15 & 128) == 0) {
                    jA = j14;
                    int i34 = o0VarE.l(jA) ? 8388608 : 4194304;
                    i16 |= i34;
                } else {
                    jA = j14;
                }
                i16 |= i34;
            } else {
                jA = j14;
            }
            i17 = i15 & 256;
            if (i17 != 0) {
                i16 |= 100663296;
            } else if ((i14 & 100663296) == 0) {
                if (o0VarE.B(uVar)) {
                    i18 = 67108864;
                } else {
                    i18 = 33554432;
                }
                i16 |= i18;
            }
            i19 = i16;
            if ((i16 & 38347923) != 38347922) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i19 & 1, z14)) {
                o0VarE.G0();
                if ((i14 & 1) != 0 || o0VarE.o0()) {
                    if (i28 != 0) {
                        rVar2 = h4.r.S;
                    }
                    if ((i15 & 32) != 0) {
                        o0.f762a.getClass();
                        i24 = i19 & (-458753);
                        r1Var2 = o0.b(o0VarE).f672b;
                    } else {
                        i24 = i19;
                    }
                    if ((i15 & 64) != 0) {
                        o0.f762a.getClass();
                        jB = o0.a(o0VarE).b();
                        i24 &= -3670017;
                    }
                    if ((i15 & 128) != 0) {
                        jA = u.a(jB, o0VarE);
                        i25 = i24 & (-29360129);
                    } else {
                        i25 = i24;
                    }
                    if (i17 != 0) {
                        uVar3 = new p004k6.u(false, false, false, 7, (p005kotlin.jvm.internal.j) null);
                    }
                    h4.r rVar4 = rVar2;
                    o4.r1 r1Var4 = r1Var2;
                    long j17 = jB;
                    long j18 = jA;
                    o0VarE.h0();
                    x1 x1Var = p3.n.f135158a;
                    p004k6.c.a(aVar, uVar3, z3.f.c(-488319269, new k(eVar, rVar4, pVar3, pVar4, r1Var4, j17, j18), o0VarE), o0VarE, (i25 & 14) | 384 | (((268435454 & i25) >> 21) & 112), 0);
                    uVar2 = uVar3;
                    rVar3 = rVar4;
                    r1Var3 = r1Var4;
                    j15 = j17;
                    j16 = j18;
                } else {
                    o0VarE.e();
                    i25 = (i15 & 32) != 0 ? i19 & (-458753) : i19;
                    if ((i15 & 64) != 0) {
                        i25 &= -3670017;
                    }
                    if ((i15 & 128) != 0) {
                        i25 &= -29360129;
                    }
                }
                uVar3 = uVar;
                h4.r rVar5 = rVar2;
                o4.r1 r1Var5 = r1Var2;
                long j19 = jB;
                long j110 = jA;
                o0VarE.h0();
                x1 x1Var2 = p3.n.f135158a;
                p004k6.c.a(aVar, uVar3, z3.f.c(-488319269, new k(eVar, rVar5, pVar3, pVar4, r1Var5, j19, j110), o0VarE), o0VarE, (i25 & 14) | 384 | (((268435454 & i25) >> 21) & 112), 0);
                uVar2 = uVar3;
                rVar3 = rVar5;
                r1Var3 = r1Var5;
                j15 = j19;
                j16 = j110;
            } else {
                o0VarE.e();
                rVar3 = rVar2;
                r1Var3 = r1Var2;
                j15 = jB;
                j16 = jA;
                uVar2 = uVar;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new e23.p() { // from class: a3.m
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        n.b(aVar, eVar, rVar3, pVar, pVar2, r1Var3, j15, j16, uVar2, (p3.m) obj, p3.p0.t(i14 | 1), i15);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        i16 |= 384;
        rVar2 = rVar;
        if ((i14 & 3072) == 0) {
            pVar3 = pVar;
            if (o0VarE.r(pVar3)) {
                i27 = 2048;
            } else {
                i27 = 1024;
            }
            i16 |= i27;
        } else {
            pVar3 = pVar;
        }
        if ((i14 & 24576) == 0) {
            pVar4 = pVar2;
            if (o0VarE.r(pVar4)) {
                i26 = 16384;
            } else {
                i26 = 8192;
            }
            i16 |= i26;
        } else {
            pVar4 = pVar2;
        }
        if ((196608 & i14) == 0) {
            if ((i15 & 32) == 0) {
                r1Var2 = r1Var;
                if (o0VarE.B(r1Var2)) {
                }
                i16 |= i29;
            } else {
                r1Var2 = r1Var;
            }
            i16 |= i29;
        } else {
            r1Var2 = r1Var;
        }
        if ((1572864 & i14) == 0) {
            if ((i15 & 64) == 0) {
                jB = j8;
                if (o0VarE.l(jB)) {
                }
                i16 |= i30;
            } else {
                jB = j8;
            }
            i16 |= i30;
        } else {
            jB = j8;
        }
        if ((12582912 & i14) == 0) {
            if ((i15 & 128) == 0) {
                jA = j14;
                if (o0VarE.l(jA)) {
                }
                i16 |= i34;
            } else {
                jA = j14;
            }
            i16 |= i34;
        } else {
            jA = j14;
        }
        i17 = i15 & 256;
        if (i17 != 0) {
            i16 |= 100663296;
        } else if ((i14 & 100663296) == 0) {
            if (o0VarE.B(uVar)) {
                i18 = 67108864;
            } else {
                i18 = 33554432;
            }
            i16 |= i18;
        }
        i19 = i16;
        if ((i16 & 38347923) != 38347922) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (o0VarE.n(i19 & 1, z14)) {
            o0VarE.G0();
            if ((i14 & 1) != 0) {
                if (i28 != 0) {
                    rVar2 = h4.r.S;
                }
                if ((i15 & 32) != 0) {
                    o0.f762a.getClass();
                    i24 = i19 & (-458753);
                    r1Var2 = o0.b(o0VarE).f672b;
                } else {
                    i24 = i19;
                }
                if ((i15 & 64) != 0) {
                    o0.f762a.getClass();
                    jB = o0.a(o0VarE).b();
                    i24 &= -3670017;
                }
                if ((i15 & 128) != 0) {
                    jA = u.a(jB, o0VarE);
                    i25 = i24 & (-29360129);
                } else {
                    i25 = i24;
                }
                if (i17 != 0) {
                    uVar3 = new p004k6.u(false, false, false, 7, (p005kotlin.jvm.internal.j) null);
                } else {
                    uVar3 = uVar;
                }
            } else {
                if (i28 != 0) {
                    rVar2 = h4.r.S;
                }
                if ((i15 & 32) != 0) {
                    o0.f762a.getClass();
                    i24 = i19 & (-458753);
                    r1Var2 = o0.b(o0VarE).f672b;
                } else {
                    i24 = i19;
                }
                if ((i15 & 64) != 0) {
                    o0.f762a.getClass();
                    jB = o0.a(o0VarE).b();
                    i24 &= -3670017;
                }
                if ((i15 & 128) != 0) {
                    jA = u.a(jB, o0VarE);
                    i25 = i24 & (-29360129);
                } else {
                    i25 = i24;
                }
                if (i17 != 0) {
                    uVar3 = new p004k6.u(false, false, false, 7, (p005kotlin.jvm.internal.j) null);
                } else {
                    uVar3 = uVar;
                }
            }
            h4.r rVar6 = rVar2;
            o4.r1 r1Var6 = r1Var2;
            long j111 = jB;
            long j112 = jA;
            o0VarE.h0();
            x1 x1Var3 = p3.n.f135158a;
            p004k6.c.a(aVar, uVar3, z3.f.c(-488319269, new k(eVar, rVar6, pVar3, pVar4, r1Var6, j111, j112), o0VarE), o0VarE, (i25 & 14) | 384 | (((268435454 & i25) >> 21) & 112), 0);
            uVar2 = uVar3;
            rVar3 = rVar6;
            r1Var3 = r1Var6;
            j15 = j111;
            j16 = j112;
        } else {
            o0VarE.e();
            rVar3 = rVar2;
            r1Var3 = r1Var2;
            j15 = jB;
            j16 = jA;
            uVar2 = uVar;
        }
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p() { // from class: a3.m
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    n.b(aVar, eVar, rVar3, pVar, pVar2, r1Var3, j15, j16, uVar2, (p3.m) obj, p3.p0.t(i14 | 1), i15);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
