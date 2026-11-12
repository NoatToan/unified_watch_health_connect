package a3;

import c2.h2;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import p3.p2;
import p3.x1;
import r1.q2;

/* JADX INFO: loaded from: classes.dex */
public final class s {
    /* JADX WARN: Code duplicated, block: B:100:0x0113  */
    /* JADX WARN: Code duplicated, block: B:101:0x0115  */
    /* JADX WARN: Code duplicated, block: B:104:0x011e  */
    /* JADX WARN: Code duplicated, block: B:106:0x012d  */
    /* JADX WARN: Code duplicated, block: B:116:0x0146 A[PHI: r1 r5 r12 r13 r15
      0x0146: PHI (r1v42 int) = (r1v27 int), (r1v46 int), (r1v47 int) binds: [B:136:0x01ca, B:114:0x0142, B:115:0x0144] A[DONT_GENERATE, DONT_INLINE]
      0x0146: PHI (r5v13 h4.r) = (r5v5 h4.r), (r5v2 h4.r), (r5v2 h4.r) binds: [B:136:0x01ca, B:114:0x0142, B:115:0x0144] A[DONT_GENERATE, DONT_INLINE]
      0x0146: PHI (r12v8 boolean) = (r12v3 boolean), (r12v2 boolean), (r12v2 boolean) binds: [B:136:0x01ca, B:114:0x0142, B:115:0x0144] A[DONT_GENERATE, DONT_INLINE]
      0x0146: PHI (r13v18 a3.p) = (r13v13 a3.p), (r13v12 a3.p), (r13v12 a3.p) binds: [B:136:0x01ca, B:114:0x0142, B:115:0x0144] A[DONT_GENERATE, DONT_INLINE]
      0x0146: PHI (r15v10 o4.r1) = (r15v4 o4.r1), (r15v3 o4.r1), (r15v3 o4.r1) binds: [B:136:0x01ca, B:114:0x0142, B:115:0x0144] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:118:0x014e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:119:0x0150  */
    /* JADX WARN: Code duplicated, block: B:121:0x0155  */
    /* JADX WARN: Code duplicated, block: B:124:0x015a  */
    /* JADX WARN: Code duplicated, block: B:126:0x018e  */
    /* JADX WARN: Code duplicated, block: B:129:0x0198  */
    /* JADX WARN: Code duplicated, block: B:132:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:135:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:137:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:140:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:143:0x0200  */
    /* JADX WARN: Code duplicated, block: B:144:0x0203  */
    /* JADX WARN: Code duplicated, block: B:147:0x0219  */
    /* JADX WARN: Code duplicated, block: B:150:0x0234  */
    /* JADX WARN: Code duplicated, block: B:151:0x0237  */
    /* JADX WARN: Code duplicated, block: B:154:0x0264  */
    /* JADX WARN: Code duplicated, block: B:155:0x0270  */
    /* JADX WARN: Code duplicated, block: B:157:0x0282  */
    /* JADX WARN: Code duplicated, block: B:158:0x028d  */
    /* JADX WARN: Code duplicated, block: B:160:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:163:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:165:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0042  */
    /* JADX WARN: Code duplicated, block: B:25:0x0047  */
    /* JADX WARN: Code duplicated, block: B:27:0x004b  */
    /* JADX WARN: Code duplicated, block: B:29:0x0053  */
    /* JADX WARN: Code duplicated, block: B:30:0x0056  */
    /* JADX WARN: Code duplicated, block: B:34:0x005e  */
    /* JADX WARN: Code duplicated, block: B:35:0x0061  */
    /* JADX WARN: Code duplicated, block: B:37:0x0065  */
    /* JADX WARN: Code duplicated, block: B:39:0x006b  */
    /* JADX WARN: Code duplicated, block: B:40:0x006e  */
    /* JADX WARN: Code duplicated, block: B:44:0x0075  */
    /* JADX WARN: Code duplicated, block: B:46:0x0079  */
    /* JADX WARN: Code duplicated, block: B:48:0x0081  */
    /* JADX WARN: Code duplicated, block: B:49:0x0084  */
    /* JADX WARN: Code duplicated, block: B:52:0x008a  */
    /* JADX WARN: Code duplicated, block: B:55:0x0091  */
    /* JADX WARN: Code duplicated, block: B:57:0x0095  */
    /* JADX WARN: Code duplicated, block: B:59:0x009d  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:66:0x00af  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:71:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:72:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:76:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:78:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:83:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:86:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:88:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:89:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:93:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:95:0x0100  */
    /* JADX WARN: Code duplicated, block: B:96:0x0103  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(e23.a aVar, h4.r rVar, boolean z14, p pVar, o4.r1 r1Var, y yVar, h2 h2Var, z3.e eVar, p3.m mVar, int i14, int i15) {
        int i16;
        h4.r rVar2;
        int i17;
        boolean z15;
        int i18;
        int i19;
        p pVar2;
        o4.r1 r1Var2;
        int i24;
        int i25;
        int i26;
        int i27;
        boolean z16;
        p3.o0 o0Var;
        h2 h2Var2;
        h4.r rVar3;
        boolean z17;
        p pVar3;
        o4.r1 r1Var3;
        p2 p2VarI0;
        int i28;
        p3.m.a aVar2;
        int i29;
        h2 h2Var3;
        boolean zI;
        Object objQ;
        p pVar4;
        boolean z18;
        Object objH;
        p3.m.a.C2565a c2565a;
        a2.j jVar;
        int i30;
        long j8;
        Object objQ2;
        long j14;
        int i34;
        s1.m mVarA;
        float f14;
        int i35;
        int i36;
        p3.o0 o0VarE = mVar.E(-1084573925);
        if ((i14 & 6) == 0) {
            i16 = (o0VarE.r(aVar) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        int i37 = i15 & 2;
        if (i37 == 0) {
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
                if ((i15 & 8) != 0) {
                    i16 |= 3072;
                } else if ((i14 & 3072) == 0) {
                    if (o0VarE.B(null)) {
                        i19 = 2048;
                    } else {
                        i19 = 1024;
                    }
                    i16 |= i19;
                }
                if ((i14 & 24576) == 0) {
                    if ((i15 & 16) == 0) {
                        pVar2 = pVar;
                        int i38 = o0VarE.B(pVar2) ? 16384 : 8192;
                        i16 |= i38;
                    } else {
                        pVar2 = pVar;
                    }
                    i16 |= i38;
                } else {
                    pVar2 = pVar;
                }
                if ((196608 & i14) == 0) {
                    if ((i15 & 32) == 0) {
                        r1Var2 = r1Var;
                        int i39 = o0VarE.B(r1Var2) ? 131072 : 65536;
                        i16 |= i39;
                    } else {
                        r1Var2 = r1Var;
                    }
                    i16 |= i39;
                } else {
                    r1Var2 = r1Var;
                }
                if ((i15 & 64) != 0) {
                    i16 |= 1572864;
                } else if ((i14 & 1572864) == 0) {
                    if (o0VarE.B(null)) {
                        i24 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    } else {
                        i24 = 524288;
                    }
                    i16 |= i24;
                }
                if ((i14 & 12582912) == 0) {
                    if (o0VarE.B(yVar)) {
                        i36 = 8388608;
                    } else {
                        i36 = 4194304;
                    }
                    i16 |= i36;
                }
                i25 = i15 & 256;
                if (i25 != 0) {
                    i16 |= 100663296;
                } else if ((i14 & 100663296) == 0) {
                    if (o0VarE.B(h2Var)) {
                        i26 = 67108864;
                    } else {
                        i26 = 33554432;
                    }
                    i16 |= i26;
                }
                if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                    if (o0VarE.r(eVar)) {
                        i35 = 536870912;
                    } else {
                        i35 = 268435456;
                    }
                    i16 |= i35;
                }
                i27 = i16;
                if ((i16 & 306783379) != 306783378) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (o0VarE.n(i27 & 1, z16)) {
                    o0VarE.G0();
                    i28 = i14 & 1;
                    aVar2 = p3.m.f135153a;
                    if (i28 != 0 || o0VarE.o0()) {
                        if (i37 != 0) {
                            rVar2 = h4.r.S;
                        }
                        if (i17 != 0) {
                            z15 = true;
                        }
                        if ((i15 & 16) != 0) {
                            o.f757a.getClass();
                            float f15 = 2;
                            g6.f.a aVar3 = g6.f.f75994b;
                            float f16 = 8;
                            float f17 = 0;
                            float f18 = 4;
                            x1 x1Var = p3.n.f135158a;
                            zI = o0VarE.i(f15) | o0VarE.i(f16) | o0VarE.i(f17) | o0VarE.i(f18) | o0VarE.i(f18);
                            objQ = o0VarE.q();
                            if (!zI) {
                                aVar2.getClass();
                                if (objQ == p3.m.a.f135155b) {
                                }
                                pVar2 = (b0) objQ;
                                i29 = i27 & (-57345);
                            }
                            objQ = new b0(f15, f16, f17, f18, f18, null);
                            o0VarE.K(objQ);
                            pVar2 = (b0) objQ;
                            i29 = i27 & (-57345);
                        } else {
                            i29 = i27;
                        }
                        if ((i15 & 32) != 0) {
                            o0.f762a.getClass();
                            i29 &= -458753;
                            r1Var2 = o0.b(o0VarE).f671a;
                        }
                        if (i25 != 0) {
                            o.f757a.getClass();
                            h2Var3 = o.f758b;
                        }
                        int i44 = i29;
                        pVar4 = pVar2;
                        o4.r1 r1Var4 = r1Var2;
                        z18 = z15;
                        o0VarE.h0();
                        x1 x1Var2 = p3.n.f135158a;
                        objH = q2.h(o0VarE, 497721888, aVar2);
                        c2565a = p3.m.a.f135155b;
                        if (objH == c2565a) {
                            objH = kg.f.b(o0VarE);
                        }
                        jVar = (a2.j) objH;
                        o0VarE.g0(false);
                        i30 = i44 >> 6;
                        yVar.getClass();
                        o0VarE.C(-2133647540);
                        x1 x1Var3 = p3.n.f135158a;
                        if (z18) {
                            j8 = yVar.f881b;
                        } else {
                            j8 = yVar.f883d;
                        }
                        p3.p1 p1VarQ = p3.p0.q(o4.d0.a(j8), o0VarE);
                        o0VarE.f();
                        objQ2 = o0VarE.q();
                        aVar2.getClass();
                        if (objQ2 == c2565a) {
                            objQ2 = new a03.h(11);
                            o0VarE.K(objQ2);
                        }
                        h4.r rVarC = p5.v.c((e23.l) objQ2, rVar2, false);
                        o0VarE.C(-655254499);
                        x1 x1Var4 = p3.n.f135158a;
                        if (z18) {
                            j14 = yVar.f880a;
                        } else {
                            j14 = yVar.f882c;
                        }
                        p3.p1 p1VarQ2 = p3.p0.q(o4.d0.a(j14), o0VarE);
                        o0VarE.f();
                        long j15 = ((o4.d0) p1VarQ2.getF182175a()).f128833a;
                        h4.r rVar4 = rVar2;
                        long jC = o4.d0.c(1.0f, ((o4.d0) p1VarQ.getF182175a()).f128833a, 14);
                        if (pVar4 == null) {
                            o0VarE.C(498128545);
                            i34 = 0;
                            o0VarE.g0(false);
                            mVarA = null;
                        } else {
                            i34 = 0;
                            o0VarE.C(1401541984);
                            mVarA = pVar4.a(z18, jVar, o0VarE, i30 & 910);
                            o0VarE.g0(false);
                        }
                        if (mVarA != null) {
                            f14 = ((g6.f) mVarA.f155628b.getF182175a()).f75997a;
                        } else {
                            f14 = i34;
                            g6.f.a aVar4 = g6.f.f75994b;
                        }
                        o0Var = o0VarE;
                        n1.b(aVar, rVarC, z18, r1Var4, j15, jC, f14, jVar, z3.f.c(-20345758, new e(p1VarQ, 1, h2Var3, eVar), o0VarE), o0Var, (i44 & 14) | C.ENCODING_PCM_32BIT | (i44 & 896) | (i30 & 7168) | (i44 & 3670016));
                        pVar3 = pVar4;
                        h2Var2 = h2Var3;
                        z17 = z18;
                        r1Var3 = r1Var4;
                        rVar3 = rVar4;
                    } else {
                        o0VarE.e();
                        i29 = (i15 & 16) != 0 ? i27 & (-57345) : i27;
                        if ((i15 & 32) != 0) {
                            i29 &= -458753;
                        }
                    }
                    h2Var3 = h2Var;
                    int i45 = i29;
                    pVar4 = pVar2;
                    o4.r1 r1Var5 = r1Var2;
                    z18 = z15;
                    o0VarE.h0();
                    x1 x1Var5 = p3.n.f135158a;
                    objH = q2.h(o0VarE, 497721888, aVar2);
                    c2565a = p3.m.a.f135155b;
                    if (objH == c2565a) {
                        objH = kg.f.b(o0VarE);
                    }
                    jVar = (a2.j) objH;
                    o0VarE.g0(false);
                    i30 = i45 >> 6;
                    yVar.getClass();
                    o0VarE.C(-2133647540);
                    x1 x1Var6 = p3.n.f135158a;
                    if (z18) {
                        j8 = yVar.f881b;
                    } else {
                        j8 = yVar.f883d;
                    }
                    p3.p1 p1VarQ3 = p3.p0.q(o4.d0.a(j8), o0VarE);
                    o0VarE.f();
                    objQ2 = o0VarE.q();
                    aVar2.getClass();
                    if (objQ2 == c2565a) {
                        objQ2 = new a03.h(11);
                        o0VarE.K(objQ2);
                    }
                    h4.r rVarC2 = p5.v.c((e23.l) objQ2, rVar2, false);
                    o0VarE.C(-655254499);
                    x1 x1Var7 = p3.n.f135158a;
                    if (z18) {
                        j14 = yVar.f880a;
                    } else {
                        j14 = yVar.f882c;
                    }
                    p3.p1 p1VarQ4 = p3.p0.q(o4.d0.a(j14), o0VarE);
                    o0VarE.f();
                    long j16 = ((o4.d0) p1VarQ4.getF182175a()).f128833a;
                    h4.r rVar5 = rVar2;
                    long jC2 = o4.d0.c(1.0f, ((o4.d0) p1VarQ3.getF182175a()).f128833a, 14);
                    if (pVar4 == null) {
                        o0VarE.C(498128545);
                        i34 = 0;
                        o0VarE.g0(false);
                        mVarA = null;
                    } else {
                        i34 = 0;
                        o0VarE.C(1401541984);
                        mVarA = pVar4.a(z18, jVar, o0VarE, i30 & 910);
                        o0VarE.g0(false);
                    }
                    if (mVarA != null) {
                        f14 = ((g6.f) mVarA.f155628b.getF182175a()).f75997a;
                    } else {
                        f14 = i34;
                        g6.f.a aVar5 = g6.f.f75994b;
                    }
                    o0Var = o0VarE;
                    n1.b(aVar, rVarC2, z18, r1Var5, j16, jC2, f14, jVar, z3.f.c(-20345758, new e(p1VarQ3, 1, h2Var3, eVar), o0VarE), o0Var, (i45 & 14) | C.ENCODING_PCM_32BIT | (i45 & 896) | (i30 & 7168) | (i45 & 3670016));
                    pVar3 = pVar4;
                    h2Var2 = h2Var3;
                    z17 = z18;
                    r1Var3 = r1Var5;
                    rVar3 = rVar5;
                } else {
                    o0Var = o0VarE;
                    o0Var.e();
                    h2Var2 = h2Var;
                    rVar3 = rVar2;
                    z17 = z15;
                    pVar3 = pVar2;
                    r1Var3 = r1Var2;
                }
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new q(aVar, rVar3, z17, pVar3, r1Var3, yVar, h2Var2, eVar, i14, i15);
                }
            }
            i16 |= 384;
            z15 = z14;
            if ((i15 & 8) != 0) {
                i16 |= 3072;
            } else if ((i14 & 3072) == 0) {
                if (o0VarE.B(null)) {
                    i19 = 2048;
                } else {
                    i19 = 1024;
                }
                i16 |= i19;
            }
            if ((i14 & 24576) == 0) {
                if ((i15 & 16) == 0) {
                    pVar2 = pVar;
                    if (o0VarE.B(pVar2)) {
                    }
                    i16 |= i38;
                } else {
                    pVar2 = pVar;
                }
                i16 |= i38;
            } else {
                pVar2 = pVar;
            }
            if ((196608 & i14) == 0) {
                if ((i15 & 32) == 0) {
                    r1Var2 = r1Var;
                    if (o0VarE.B(r1Var2)) {
                    }
                    i16 |= i39;
                } else {
                    r1Var2 = r1Var;
                }
                i16 |= i39;
            } else {
                r1Var2 = r1Var;
            }
            if ((i15 & 64) != 0) {
                i16 |= 1572864;
            } else if ((i14 & 1572864) == 0) {
                if (o0VarE.B(null)) {
                    i24 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                } else {
                    i24 = 524288;
                }
                i16 |= i24;
            }
            if ((i14 & 12582912) == 0) {
                if (o0VarE.B(yVar)) {
                    i36 = 8388608;
                } else {
                    i36 = 4194304;
                }
                i16 |= i36;
            }
            i25 = i15 & 256;
            if (i25 != 0) {
                i16 |= 100663296;
            } else if ((i14 & 100663296) == 0) {
                if (o0VarE.B(h2Var)) {
                    i26 = 67108864;
                } else {
                    i26 = 33554432;
                }
                i16 |= i26;
            }
            if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                if (o0VarE.r(eVar)) {
                    i35 = 536870912;
                } else {
                    i35 = 268435456;
                }
                i16 |= i35;
            }
            i27 = i16;
            if ((i16 & 306783379) != 306783378) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (o0VarE.n(i27 & 1, z16)) {
                o0VarE.G0();
                i28 = i14 & 1;
                aVar2 = p3.m.f135153a;
                if (i28 != 0) {
                    if (i37 != 0) {
                        rVar2 = h4.r.S;
                    }
                    if (i17 != 0) {
                        z15 = true;
                    }
                    if ((i15 & 16) != 0) {
                        o.f757a.getClass();
                        float f19 = 2;
                        g6.f.a aVar6 = g6.f.f75994b;
                        float f110 = 8;
                        float f111 = 0;
                        float f112 = 4;
                        x1 x1Var8 = p3.n.f135158a;
                        zI = o0VarE.i(f19) | o0VarE.i(f110) | o0VarE.i(f111) | o0VarE.i(f112) | o0VarE.i(f112);
                        objQ = o0VarE.q();
                        if (!zI) {
                            aVar2.getClass();
                            if (objQ == p3.m.a.f135155b) {
                            }
                            pVar2 = (b0) objQ;
                            i29 = i27 & (-57345);
                        }
                        objQ = new b0(f19, f110, f111, f112, f112, null);
                        o0VarE.K(objQ);
                        pVar2 = (b0) objQ;
                        i29 = i27 & (-57345);
                    } else {
                        i29 = i27;
                    }
                    if ((i15 & 32) != 0) {
                        o0.f762a.getClass();
                        i29 &= -458753;
                        r1Var2 = o0.b(o0VarE).f671a;
                    }
                    if (i25 != 0) {
                        o.f757a.getClass();
                        h2Var3 = o.f758b;
                    } else {
                        h2Var3 = h2Var;
                    }
                } else {
                    if (i37 != 0) {
                        rVar2 = h4.r.S;
                    }
                    if (i17 != 0) {
                        z15 = true;
                    }
                    if ((i15 & 16) != 0) {
                        o.f757a.getClass();
                        float f113 = 2;
                        g6.f.a aVar7 = g6.f.f75994b;
                        float f114 = 8;
                        float f115 = 0;
                        float f116 = 4;
                        x1 x1Var9 = p3.n.f135158a;
                        zI = o0VarE.i(f113) | o0VarE.i(f114) | o0VarE.i(f115) | o0VarE.i(f116) | o0VarE.i(f116);
                        objQ = o0VarE.q();
                        if (!zI) {
                            aVar2.getClass();
                            if (objQ == p3.m.a.f135155b) {
                            }
                            pVar2 = (b0) objQ;
                            i29 = i27 & (-57345);
                        }
                        objQ = new b0(f113, f114, f115, f116, f116, null);
                        o0VarE.K(objQ);
                        pVar2 = (b0) objQ;
                        i29 = i27 & (-57345);
                    } else {
                        i29 = i27;
                    }
                    if ((i15 & 32) != 0) {
                        o0.f762a.getClass();
                        i29 &= -458753;
                        r1Var2 = o0.b(o0VarE).f671a;
                    }
                    if (i25 != 0) {
                        o.f757a.getClass();
                        h2Var3 = o.f758b;
                    } else {
                        h2Var3 = h2Var;
                    }
                }
                int i46 = i29;
                pVar4 = pVar2;
                o4.r1 r1Var6 = r1Var2;
                z18 = z15;
                o0VarE.h0();
                x1 x1Var10 = p3.n.f135158a;
                objH = q2.h(o0VarE, 497721888, aVar2);
                c2565a = p3.m.a.f135155b;
                if (objH == c2565a) {
                    objH = kg.f.b(o0VarE);
                }
                jVar = (a2.j) objH;
                o0VarE.g0(false);
                i30 = i46 >> 6;
                yVar.getClass();
                o0VarE.C(-2133647540);
                x1 x1Var11 = p3.n.f135158a;
                if (z18) {
                    j8 = yVar.f881b;
                } else {
                    j8 = yVar.f883d;
                }
                p3.p1 p1VarQ5 = p3.p0.q(o4.d0.a(j8), o0VarE);
                o0VarE.f();
                objQ2 = o0VarE.q();
                aVar2.getClass();
                if (objQ2 == c2565a) {
                    objQ2 = new a03.h(11);
                    o0VarE.K(objQ2);
                }
                h4.r rVarC3 = p5.v.c((e23.l) objQ2, rVar2, false);
                o0VarE.C(-655254499);
                x1 x1Var12 = p3.n.f135158a;
                if (z18) {
                    j14 = yVar.f880a;
                } else {
                    j14 = yVar.f882c;
                }
                p3.p1 p1VarQ6 = p3.p0.q(o4.d0.a(j14), o0VarE);
                o0VarE.f();
                long j17 = ((o4.d0) p1VarQ6.getF182175a()).f128833a;
                h4.r rVar6 = rVar2;
                long jC3 = o4.d0.c(1.0f, ((o4.d0) p1VarQ5.getF182175a()).f128833a, 14);
                if (pVar4 == null) {
                    o0VarE.C(498128545);
                    i34 = 0;
                    o0VarE.g0(false);
                    mVarA = null;
                } else {
                    i34 = 0;
                    o0VarE.C(1401541984);
                    mVarA = pVar4.a(z18, jVar, o0VarE, i30 & 910);
                    o0VarE.g0(false);
                }
                if (mVarA != null) {
                    f14 = ((g6.f) mVarA.f155628b.getF182175a()).f75997a;
                } else {
                    f14 = i34;
                    g6.f.a aVar8 = g6.f.f75994b;
                }
                o0Var = o0VarE;
                n1.b(aVar, rVarC3, z18, r1Var6, j17, jC3, f14, jVar, z3.f.c(-20345758, new e(p1VarQ5, 1, h2Var3, eVar), o0VarE), o0Var, (i46 & 14) | C.ENCODING_PCM_32BIT | (i46 & 896) | (i30 & 7168) | (i46 & 3670016));
                pVar3 = pVar4;
                h2Var2 = h2Var3;
                z17 = z18;
                r1Var3 = r1Var6;
                rVar3 = rVar6;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                h2Var2 = h2Var;
                rVar3 = rVar2;
                z17 = z15;
                pVar3 = pVar2;
                r1Var3 = r1Var2;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new q(aVar, rVar3, z17, pVar3, r1Var3, yVar, h2Var2, eVar, i14, i15);
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
            if ((i15 & 8) != 0) {
                i16 |= 3072;
            } else if ((i14 & 3072) == 0) {
                if (o0VarE.B(null)) {
                    i19 = 2048;
                } else {
                    i19 = 1024;
                }
                i16 |= i19;
            }
            if ((i14 & 24576) == 0) {
                if ((i15 & 16) == 0) {
                    pVar2 = pVar;
                    if (o0VarE.B(pVar2)) {
                    }
                    i16 |= i38;
                } else {
                    pVar2 = pVar;
                }
                i16 |= i38;
            } else {
                pVar2 = pVar;
            }
            if ((196608 & i14) == 0) {
                if ((i15 & 32) == 0) {
                    r1Var2 = r1Var;
                    if (o0VarE.B(r1Var2)) {
                    }
                    i16 |= i39;
                } else {
                    r1Var2 = r1Var;
                }
                i16 |= i39;
            } else {
                r1Var2 = r1Var;
            }
            if ((i15 & 64) != 0) {
                i16 |= 1572864;
            } else if ((i14 & 1572864) == 0) {
                if (o0VarE.B(null)) {
                    i24 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                } else {
                    i24 = 524288;
                }
                i16 |= i24;
            }
            if ((i14 & 12582912) == 0) {
                if (o0VarE.B(yVar)) {
                    i36 = 8388608;
                } else {
                    i36 = 4194304;
                }
                i16 |= i36;
            }
            i25 = i15 & 256;
            if (i25 != 0) {
                i16 |= 100663296;
            } else if ((i14 & 100663296) == 0) {
                if (o0VarE.B(h2Var)) {
                    i26 = 67108864;
                } else {
                    i26 = 33554432;
                }
                i16 |= i26;
            }
            if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                if (o0VarE.r(eVar)) {
                    i35 = 536870912;
                } else {
                    i35 = 268435456;
                }
                i16 |= i35;
            }
            i27 = i16;
            if ((i16 & 306783379) != 306783378) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (o0VarE.n(i27 & 1, z16)) {
                o0VarE.G0();
                i28 = i14 & 1;
                aVar2 = p3.m.f135153a;
                if (i28 != 0) {
                    if (i37 != 0) {
                        rVar2 = h4.r.S;
                    }
                    if (i17 != 0) {
                        z15 = true;
                    }
                    if ((i15 & 16) != 0) {
                        o.f757a.getClass();
                        float f117 = 2;
                        g6.f.a aVar9 = g6.f.f75994b;
                        float f118 = 8;
                        float f119 = 0;
                        float f1110 = 4;
                        x1 x1Var13 = p3.n.f135158a;
                        zI = o0VarE.i(f117) | o0VarE.i(f118) | o0VarE.i(f119) | o0VarE.i(f1110) | o0VarE.i(f1110);
                        objQ = o0VarE.q();
                        if (!zI) {
                            aVar2.getClass();
                            if (objQ == p3.m.a.f135155b) {
                            }
                            pVar2 = (b0) objQ;
                            i29 = i27 & (-57345);
                        }
                        objQ = new b0(f117, f118, f119, f1110, f1110, null);
                        o0VarE.K(objQ);
                        pVar2 = (b0) objQ;
                        i29 = i27 & (-57345);
                    } else {
                        i29 = i27;
                    }
                    if ((i15 & 32) != 0) {
                        o0.f762a.getClass();
                        i29 &= -458753;
                        r1Var2 = o0.b(o0VarE).f671a;
                    }
                    if (i25 != 0) {
                        o.f757a.getClass();
                        h2Var3 = o.f758b;
                    } else {
                        h2Var3 = h2Var;
                    }
                } else {
                    if (i37 != 0) {
                        rVar2 = h4.r.S;
                    }
                    if (i17 != 0) {
                        z15 = true;
                    }
                    if ((i15 & 16) != 0) {
                        o.f757a.getClass();
                        float f1111 = 2;
                        g6.f.a aVar10 = g6.f.f75994b;
                        float f1112 = 8;
                        float f1113 = 0;
                        float f1114 = 4;
                        x1 x1Var14 = p3.n.f135158a;
                        zI = o0VarE.i(f1111) | o0VarE.i(f1112) | o0VarE.i(f1113) | o0VarE.i(f1114) | o0VarE.i(f1114);
                        objQ = o0VarE.q();
                        if (!zI) {
                            aVar2.getClass();
                            if (objQ == p3.m.a.f135155b) {
                            }
                            pVar2 = (b0) objQ;
                            i29 = i27 & (-57345);
                        }
                        objQ = new b0(f1111, f1112, f1113, f1114, f1114, null);
                        o0VarE.K(objQ);
                        pVar2 = (b0) objQ;
                        i29 = i27 & (-57345);
                    } else {
                        i29 = i27;
                    }
                    if ((i15 & 32) != 0) {
                        o0.f762a.getClass();
                        i29 &= -458753;
                        r1Var2 = o0.b(o0VarE).f671a;
                    }
                    if (i25 != 0) {
                        o.f757a.getClass();
                        h2Var3 = o.f758b;
                    } else {
                        h2Var3 = h2Var;
                    }
                }
                int i47 = i29;
                pVar4 = pVar2;
                o4.r1 r1Var7 = r1Var2;
                z18 = z15;
                o0VarE.h0();
                x1 x1Var15 = p3.n.f135158a;
                objH = q2.h(o0VarE, 497721888, aVar2);
                c2565a = p3.m.a.f135155b;
                if (objH == c2565a) {
                    objH = kg.f.b(o0VarE);
                }
                jVar = (a2.j) objH;
                o0VarE.g0(false);
                i30 = i47 >> 6;
                yVar.getClass();
                o0VarE.C(-2133647540);
                x1 x1Var16 = p3.n.f135158a;
                if (z18) {
                    j8 = yVar.f881b;
                } else {
                    j8 = yVar.f883d;
                }
                p3.p1 p1VarQ7 = p3.p0.q(o4.d0.a(j8), o0VarE);
                o0VarE.f();
                objQ2 = o0VarE.q();
                aVar2.getClass();
                if (objQ2 == c2565a) {
                    objQ2 = new a03.h(11);
                    o0VarE.K(objQ2);
                }
                h4.r rVarC4 = p5.v.c((e23.l) objQ2, rVar2, false);
                o0VarE.C(-655254499);
                x1 x1Var17 = p3.n.f135158a;
                if (z18) {
                    j14 = yVar.f880a;
                } else {
                    j14 = yVar.f882c;
                }
                p3.p1 p1VarQ8 = p3.p0.q(o4.d0.a(j14), o0VarE);
                o0VarE.f();
                long j18 = ((o4.d0) p1VarQ8.getF182175a()).f128833a;
                h4.r rVar7 = rVar2;
                long jC4 = o4.d0.c(1.0f, ((o4.d0) p1VarQ7.getF182175a()).f128833a, 14);
                if (pVar4 == null) {
                    o0VarE.C(498128545);
                    i34 = 0;
                    o0VarE.g0(false);
                    mVarA = null;
                } else {
                    i34 = 0;
                    o0VarE.C(1401541984);
                    mVarA = pVar4.a(z18, jVar, o0VarE, i30 & 910);
                    o0VarE.g0(false);
                }
                if (mVarA != null) {
                    f14 = ((g6.f) mVarA.f155628b.getF182175a()).f75997a;
                } else {
                    f14 = i34;
                    g6.f.a aVar11 = g6.f.f75994b;
                }
                o0Var = o0VarE;
                n1.b(aVar, rVarC4, z18, r1Var7, j18, jC4, f14, jVar, z3.f.c(-20345758, new e(p1VarQ7, 1, h2Var3, eVar), o0VarE), o0Var, (i47 & 14) | C.ENCODING_PCM_32BIT | (i47 & 896) | (i30 & 7168) | (i47 & 3670016));
                pVar3 = pVar4;
                h2Var2 = h2Var3;
                z17 = z18;
                r1Var3 = r1Var7;
                rVar3 = rVar7;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                h2Var2 = h2Var;
                rVar3 = rVar2;
                z17 = z15;
                pVar3 = pVar2;
                r1Var3 = r1Var2;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new q(aVar, rVar3, z17, pVar3, r1Var3, yVar, h2Var2, eVar, i14, i15);
            }
        }
        i16 |= 384;
        z15 = z14;
        if ((i15 & 8) != 0) {
            i16 |= 3072;
        } else if ((i14 & 3072) == 0) {
            if (o0VarE.B(null)) {
                i19 = 2048;
            } else {
                i19 = 1024;
            }
            i16 |= i19;
        }
        if ((i14 & 24576) == 0) {
            if ((i15 & 16) == 0) {
                pVar2 = pVar;
                if (o0VarE.B(pVar2)) {
                }
                i16 |= i38;
            } else {
                pVar2 = pVar;
            }
            i16 |= i38;
        } else {
            pVar2 = pVar;
        }
        if ((196608 & i14) == 0) {
            if ((i15 & 32) == 0) {
                r1Var2 = r1Var;
                if (o0VarE.B(r1Var2)) {
                }
                i16 |= i39;
            } else {
                r1Var2 = r1Var;
            }
            i16 |= i39;
        } else {
            r1Var2 = r1Var;
        }
        if ((i15 & 64) != 0) {
            i16 |= 1572864;
        } else if ((i14 & 1572864) == 0) {
            if (o0VarE.B(null)) {
                i24 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
            } else {
                i24 = 524288;
            }
            i16 |= i24;
        }
        if ((i14 & 12582912) == 0) {
            if (o0VarE.B(yVar)) {
                i36 = 8388608;
            } else {
                i36 = 4194304;
            }
            i16 |= i36;
        }
        i25 = i15 & 256;
        if (i25 != 0) {
            i16 |= 100663296;
        } else if ((i14 & 100663296) == 0) {
            if (o0VarE.B(h2Var)) {
                i26 = 67108864;
            } else {
                i26 = 33554432;
            }
            i16 |= i26;
        }
        if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
            if (o0VarE.r(eVar)) {
                i35 = 536870912;
            } else {
                i35 = 268435456;
            }
            i16 |= i35;
        }
        i27 = i16;
        if ((i16 & 306783379) != 306783378) {
            z16 = true;
        } else {
            z16 = false;
        }
        if (o0VarE.n(i27 & 1, z16)) {
            o0VarE.G0();
            i28 = i14 & 1;
            aVar2 = p3.m.f135153a;
            if (i28 != 0) {
                if (i37 != 0) {
                    rVar2 = h4.r.S;
                }
                if (i17 != 0) {
                    z15 = true;
                }
                if ((i15 & 16) != 0) {
                    o.f757a.getClass();
                    float f1115 = 2;
                    g6.f.a aVar12 = g6.f.f75994b;
                    float f1116 = 8;
                    float f1117 = 0;
                    float f1118 = 4;
                    x1 x1Var18 = p3.n.f135158a;
                    zI = o0VarE.i(f1115) | o0VarE.i(f1116) | o0VarE.i(f1117) | o0VarE.i(f1118) | o0VarE.i(f1118);
                    objQ = o0VarE.q();
                    if (!zI) {
                        aVar2.getClass();
                        if (objQ == p3.m.a.f135155b) {
                        }
                        pVar2 = (b0) objQ;
                        i29 = i27 & (-57345);
                    }
                    objQ = new b0(f1115, f1116, f1117, f1118, f1118, null);
                    o0VarE.K(objQ);
                    pVar2 = (b0) objQ;
                    i29 = i27 & (-57345);
                } else {
                    i29 = i27;
                }
                if ((i15 & 32) != 0) {
                    o0.f762a.getClass();
                    i29 &= -458753;
                    r1Var2 = o0.b(o0VarE).f671a;
                }
                if (i25 != 0) {
                    o.f757a.getClass();
                    h2Var3 = o.f758b;
                } else {
                    h2Var3 = h2Var;
                }
            } else {
                if (i37 != 0) {
                    rVar2 = h4.r.S;
                }
                if (i17 != 0) {
                    z15 = true;
                }
                if ((i15 & 16) != 0) {
                    o.f757a.getClass();
                    float f1119 = 2;
                    g6.f.a aVar13 = g6.f.f75994b;
                    float f11110 = 8;
                    float f11111 = 0;
                    float f11112 = 4;
                    x1 x1Var19 = p3.n.f135158a;
                    zI = o0VarE.i(f1119) | o0VarE.i(f11110) | o0VarE.i(f11111) | o0VarE.i(f11112) | o0VarE.i(f11112);
                    objQ = o0VarE.q();
                    if (!zI) {
                        aVar2.getClass();
                        if (objQ == p3.m.a.f135155b) {
                        }
                        pVar2 = (b0) objQ;
                        i29 = i27 & (-57345);
                    }
                    objQ = new b0(f1119, f11110, f11111, f11112, f11112, null);
                    o0VarE.K(objQ);
                    pVar2 = (b0) objQ;
                    i29 = i27 & (-57345);
                } else {
                    i29 = i27;
                }
                if ((i15 & 32) != 0) {
                    o0.f762a.getClass();
                    i29 &= -458753;
                    r1Var2 = o0.b(o0VarE).f671a;
                }
                if (i25 != 0) {
                    o.f757a.getClass();
                    h2Var3 = o.f758b;
                } else {
                    h2Var3 = h2Var;
                }
            }
            int i48 = i29;
            pVar4 = pVar2;
            o4.r1 r1Var8 = r1Var2;
            z18 = z15;
            o0VarE.h0();
            x1 x1Var110 = p3.n.f135158a;
            objH = q2.h(o0VarE, 497721888, aVar2);
            c2565a = p3.m.a.f135155b;
            if (objH == c2565a) {
                objH = kg.f.b(o0VarE);
            }
            jVar = (a2.j) objH;
            o0VarE.g0(false);
            i30 = i48 >> 6;
            yVar.getClass();
            o0VarE.C(-2133647540);
            x1 x1Var111 = p3.n.f135158a;
            if (z18) {
                j8 = yVar.f881b;
            } else {
                j8 = yVar.f883d;
            }
            p3.p1 p1VarQ9 = p3.p0.q(o4.d0.a(j8), o0VarE);
            o0VarE.f();
            objQ2 = o0VarE.q();
            aVar2.getClass();
            if (objQ2 == c2565a) {
                objQ2 = new a03.h(11);
                o0VarE.K(objQ2);
            }
            h4.r rVarC5 = p5.v.c((e23.l) objQ2, rVar2, false);
            o0VarE.C(-655254499);
            x1 x1Var112 = p3.n.f135158a;
            if (z18) {
                j14 = yVar.f880a;
            } else {
                j14 = yVar.f882c;
            }
            p3.p1 p1VarQ10 = p3.p0.q(o4.d0.a(j14), o0VarE);
            o0VarE.f();
            long j19 = ((o4.d0) p1VarQ10.getF182175a()).f128833a;
            h4.r rVar8 = rVar2;
            long jC5 = o4.d0.c(1.0f, ((o4.d0) p1VarQ9.getF182175a()).f128833a, 14);
            if (pVar4 == null) {
                o0VarE.C(498128545);
                i34 = 0;
                o0VarE.g0(false);
                mVarA = null;
            } else {
                i34 = 0;
                o0VarE.C(1401541984);
                mVarA = pVar4.a(z18, jVar, o0VarE, i30 & 910);
                o0VarE.g0(false);
            }
            if (mVarA != null) {
                f14 = ((g6.f) mVarA.f155628b.getF182175a()).f75997a;
            } else {
                f14 = i34;
                g6.f.a aVar14 = g6.f.f75994b;
            }
            o0Var = o0VarE;
            n1.b(aVar, rVarC5, z18, r1Var8, j19, jC5, f14, jVar, z3.f.c(-20345758, new e(p1VarQ9, 1, h2Var3, eVar), o0VarE), o0Var, (i48 & 14) | C.ENCODING_PCM_32BIT | (i48 & 896) | (i30 & 7168) | (i48 & 3670016));
            pVar3 = pVar4;
            h2Var2 = h2Var3;
            z17 = z18;
            r1Var3 = r1Var8;
            rVar3 = rVar8;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            h2Var2 = h2Var;
            rVar3 = rVar2;
            z17 = z15;
            pVar3 = pVar2;
            r1Var3 = r1Var2;
        }
        p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new q(aVar, rVar3, z17, pVar3, r1Var3, yVar, h2Var2, eVar, i14, i15);
        }
    }
}
