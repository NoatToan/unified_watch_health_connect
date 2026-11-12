package et1;

import c2.s2;
import c2.u2;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import i3.e9;
import i3.fe;
import i3.mc;
import i3.mh;
import i3.pc;
import l72.v2;
import p005kotlin.Unit;
import p3.b4;

/* JADX INFO: loaded from: classes10.dex */
public final class w0 {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f65930a;

        static {
            int[] iArr = new int[pc.values().length];
            try {
                iArr[pc.Hidden.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f65930a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0061  */
    /* JADX WARN: Code duplicated, block: B:33:0x0063  */
    /* JADX WARN: Code duplicated, block: B:36:0x006c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x006e  */
    /* JADX WARN: Code duplicated, block: B:38:0x0071  */
    /* JADX WARN: Code duplicated, block: B:40:0x0074  */
    /* JADX WARN: Code duplicated, block: B:41:0x0076  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:46:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:48:? A[RETURN, SYNTHETIC] */
    public static final void a(h4.r rVar, jf.d dVar, long j8, boolean z14, p3.m mVar, int i14, int i15) {
        h4.r rVar2;
        int i16;
        boolean z15;
        boolean z16;
        boolean z17;
        p3.p2 p2VarI0;
        h4.r rVar3;
        boolean z18;
        p3.o0 o0VarE = mVar.E(-1485443458);
        int i17 = i15 & 1;
        if (i17 != 0) {
            i16 = i14 | 6;
            rVar2 = rVar;
        } else {
            rVar2 = rVar;
            i16 = (o0VarE.B(rVar2) ? 4 : 2) | i14;
        }
        int i18 = i16 | (o0VarE.B(dVar) ? 32 : 16) | (o0VarE.l(j8) ? 256 : 128);
        int i19 = i15 & 8;
        if (i19 == 0) {
            if ((i14 & 3072) == 0) {
                z15 = z14;
                i18 |= o0VarE.h(z15) ? 2048 : 1024;
            }
            if ((i18 & 1171) != 1170) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (o0VarE.n(i18 & 1, z16)) {
                if (i17 != 0) {
                    rVar3 = h4.r.S;
                } else {
                    rVar3 = rVar2;
                }
                if (i19 != 0) {
                    z18 = false;
                } else {
                    z18 = z15;
                }
                p3.x1 x1Var = p3.n.f135158a;
                String strQ = gl1.y.Q(o0VarE, R.string.trail_photo_content_description);
                f5.k.f68985a.getClass();
                u1.y0.a(dVar, strQ, v2.a(x2.d(c2.l.g(rVar3, Float.intBitsToFloat((int) (j8 >> 32)) / Float.intBitsToFloat((int) (4294967295L & j8))), 1.0f), z18, new e11.a(9), o0VarE, (i18 >> 6) & 112), null, f5.k.a.f68988c, 0.0f, null, o0VarE, ((i18 >> 3) & 14) | 24576, 104);
                z17 = z18;
                rVar2 = rVar3;
            } else {
                o0VarE.e();
                z17 = z15;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new cq.n(rVar2, dVar, j8, z17, i14, i15);
            }
        }
        i18 |= 3072;
        z15 = z14;
        if ((i18 & 1171) != 1170) {
            z16 = true;
        } else {
            z16 = false;
        }
        if (o0VarE.n(i18 & 1, z16)) {
            if (i17 != 0) {
                rVar3 = h4.r.S;
            } else {
                rVar3 = rVar2;
            }
            if (i19 != 0) {
                z18 = false;
            } else {
                z18 = z15;
            }
            p3.x1 x1Var2 = p3.n.f135158a;
            String strQ2 = gl1.y.Q(o0VarE, R.string.trail_photo_content_description);
            f5.k.f68985a.getClass();
            u1.y0.a(dVar, strQ2, v2.a(x2.d(c2.l.g(rVar3, Float.intBitsToFloat((int) (j8 >> 32)) / Float.intBitsToFloat((int) (4294967295L & j8))), 1.0f), z18, new e11.a(9), o0VarE, (i18 >> 6) & 112), null, f5.k.a.f68988c, 0.0f, null, o0VarE, ((i18 >> 3) & 14) | 24576, 104);
            z17 = z18;
            rVar2 = rVar3;
        } else {
            o0VarE.e();
            z17 = z15;
        }
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new cq.n(rVar2, dVar, j8, z17, i14, i15);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0166  */
    /* JADX WARN: Code duplicated, block: B:105:0x0173  */
    /* JADX WARN: Code duplicated, block: B:108:0x017f  */
    /* JADX WARN: Code duplicated, block: B:111:0x018b  */
    /* JADX WARN: Code duplicated, block: B:114:0x0197  */
    /* JADX WARN: Code duplicated, block: B:117:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:118:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:127:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:130:0x01ca A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:131:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:132:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:135:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:136:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:138:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:140:0x0202  */
    /* JADX WARN: Code duplicated, block: B:142:0x0209  */
    /* JADX WARN: Code duplicated, block: B:145:0x022b  */
    /* JADX WARN: Code duplicated, block: B:146:0x022d  */
    /* JADX WARN: Code duplicated, block: B:149:0x0239  */
    /* JADX WARN: Code duplicated, block: B:151:0x0240  */
    /* JADX WARN: Code duplicated, block: B:154:0x0259  */
    /* JADX WARN: Code duplicated, block: B:157:0x026e  */
    /* JADX WARN: Code duplicated, block: B:158:0x0271  */
    /* JADX WARN: Code duplicated, block: B:164:0x027f  */
    /* JADX WARN: Code duplicated, block: B:168:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:171:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:172:0x02be  */
    /* JADX WARN: Code duplicated, block: B:176:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:182:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:184:0x0353  */
    /* JADX WARN: Code duplicated, block: B:186:0x0361  */
    /* JADX WARN: Code duplicated, block: B:189:0x036c  */
    /* JADX WARN: Code duplicated, block: B:191:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x00af  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:53:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:56:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:60:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:62:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:67:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:69:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:70:0x0101  */
    /* JADX WARN: Code duplicated, block: B:74:0x010f  */
    /* JADX WARN: Code duplicated, block: B:76:0x0115  */
    /* JADX WARN: Code duplicated, block: B:77:0x0118  */
    /* JADX WARN: Code duplicated, block: B:81:0x0122  */
    /* JADX WARN: Code duplicated, block: B:82:0x0125  */
    /* JADX WARN: Code duplicated, block: B:85:0x012d  */
    /* JADX WARN: Code duplicated, block: B:87:0x0133  */
    /* JADX WARN: Code duplicated, block: B:88:0x0136  */
    /* JADX WARN: Code duplicated, block: B:92:0x0142  */
    /* JADX WARN: Code duplicated, block: B:95:0x014e  */
    /* JADX WARN: Code duplicated, block: B:98:0x015a  */
    public static final void b(final r53.i iVar, final i53.d dVar, final int i14, final int i15, boolean z14, final boolean z15, final boolean z16, final boolean z17, final boolean z18, final fe feVar, final pt1.n nVar, final e23.l lVar, final e23.l lVar2, final e23.l lVar3, final e23.l lVar4, final e23.l lVar5, final e23.p pVar, final e23.a aVar, final e23.a aVar2, final e23.a aVar3, final e23.a aVar4, p3.m mVar, final int i16, final int i17, final int i18) {
        int i19;
        i53.d dVar2;
        int i24;
        boolean z19;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        char c14;
        int i30;
        boolean z24;
        p3.o0 o0Var;
        final boolean z25;
        p3.p2 p2VarI0;
        boolean z26;
        final zc.d dVar3;
        boolean zR;
        Object objQ;
        p3.m.a aVar5;
        final h2.b bVarB;
        boolean z27;
        boolean zB;
        Object objQ2;
        Object objQ3;
        p3.m.a.C2565a c2565a;
        int i34;
        boolean z28;
        Object objQ4;
        final p3.p1 p1Var;
        p3.p1 p1VarQ;
        boolean zB2;
        Object objQ5;
        final mc mcVarF;
        boolean z29;
        boolean zB3;
        Object objQ6;
        int i35;
        int i36;
        int i37;
        int i38;
        int i39;
        int i44;
        dVar.getClass();
        lVar.getClass();
        lVar2.getClass();
        lVar3.getClass();
        lVar4.getClass();
        lVar5.getClass();
        pVar.getClass();
        aVar.getClass();
        aVar4.getClass();
        p3.o0 o0VarE = mVar.E(-1230709407);
        if ((i16 & 6) == 0) {
            i19 = (o0VarE.r(iVar) ? 4 : 2) | i16;
        } else {
            i19 = i16;
        }
        if ((i16 & 48) == 0) {
            dVar2 = dVar;
            i19 |= o0VarE.B(dVar2) ? 32 : 16;
        } else {
            dVar2 = dVar;
        }
        if ((i16 & 384) == 0) {
            i19 |= o0VarE.k(i14) ? 256 : 128;
        }
        if ((i16 & 3072) == 0) {
            i24 = i15;
            i19 |= o0VarE.k(i24) ? 2048 : 1024;
        } else {
            i24 = i15;
        }
        int i45 = i18 & 16;
        if (i45 == 0) {
            if ((i16 & 24576) == 0) {
                z19 = z14;
                i19 |= o0VarE.h(z19) ? 16384 : 8192;
            }
            if ((i16 & 196608) == 0) {
                if (o0VarE.h(z15)) {
                    i44 = 131072;
                } else {
                    i44 = 65536;
                }
                i19 |= i44;
            }
            i25 = i16 & 1572864;
            i26 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
            if (i25 == 0) {
                if (o0VarE.h(z16)) {
                    i39 = 1048576;
                } else {
                    i39 = 524288;
                }
                i19 |= i39;
            }
            if ((i16 & 12582912) == 0) {
                if (o0VarE.h(z17)) {
                    i38 = 8388608;
                } else {
                    i38 = 4194304;
                }
                i19 |= i38;
            }
            if ((i16 & 100663296) == 0) {
                if (o0VarE.h(z18)) {
                    i37 = 67108864;
                } else {
                    i37 = 33554432;
                }
                i19 |= i37;
            }
            if ((i16 & C.ENCODING_PCM_32BIT) == 0) {
                if (o0VarE.B(feVar)) {
                    i36 = 536870912;
                } else {
                    i36 = 268435456;
                }
                i19 |= i36;
            }
            if (o0VarE.B(nVar)) {
                i27 = 4;
            } else {
                i27 = 2;
            }
            i28 = i17 | i27;
            if ((i17 & 48) == 0) {
                if (o0VarE.r(lVar)) {
                    i35 = 32;
                } else {
                    i35 = 16;
                }
                i28 |= i35;
            }
            int i46 = i28 | (o0VarE.r(lVar2) ? 256 : 128) | (o0VarE.r(lVar3) ? 2048 : 1024) | (o0VarE.r(lVar4) ? 16384 : 8192) | (o0VarE.r(lVar5) ? 131072 : 65536);
            if (!o0VarE.r(pVar)) {
                i26 = 524288;
            }
            i29 = i46 | i26 | (o0VarE.r(aVar) ? 8388608 : 4194304) | (o0VarE.r(aVar2) ? 67108864 : 33554432) | (o0VarE.r(aVar3) ? 536870912 : 268435456);
            if (o0VarE.r(aVar4)) {
                c14 = 4;
            } else {
                c14 = 2;
            }
            i30 = i19;
            if ((i19 & 306783379) != 306783378 && (i29 & 306783379) == 306783378 && (c14 & 3) == 2) {
                z24 = false;
            } else {
                z24 = true;
            }
            if (o0VarE.n(i30 & 1, z24)) {
                if (i45 != 0) {
                    z26 = false;
                } else {
                    z26 = z19;
                }
                p3.x1 x1Var = p3.n.f135158a;
                if (iVar == null) {
                    o0VarE.C(2073108774);
                    o0VarE.g0(false);
                    dVar3 = null;
                } else {
                    o0VarE.C(-1595693509);
                    zc.d dVarA = zc.g.a(iVar, o0VarE);
                    o0VarE.g0(false);
                    dVar3 = dVarA;
                }
                if (dVar3 != null) {
                    o0VarE.C(2073540667);
                    zR = o0VarE.r(dVar3);
                    objQ = o0VarE.q();
                    aVar5 = p3.m.f135153a;
                    if (zR) {
                        objQ = new s0(dVar3, 0);
                        o0VarE.K(objQ);
                    } else {
                        aVar5.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new s0(dVar3, 0);
                            o0VarE.K(objQ);
                        }
                    }
                    bVarB = h2.o0.b(i14, (e23.a) objQ, o0VarE, (i30 >> 6) & 14, 2);
                    Integer numValueOf = Integer.valueOf(bVarB.l());
                    if ((i29 & 112) == 32) {
                        z27 = true;
                    } else {
                        z27 = false;
                    }
                    zB = z27 | o0VarE.B(bVarB);
                    objQ2 = o0VarE.q();
                    if (zB) {
                        objQ2 = new t0(lVar, bVarB, null);
                        o0VarE.K(objQ2);
                    } else {
                        aVar5.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new t0(lVar, bVarB, null);
                            o0VarE.K(objQ2);
                        }
                    }
                    p3.l0.e((e23.p) objQ2, numValueOf, o0VarE);
                    objQ3 = o0VarE.q();
                    aVar5.getClass();
                    c2565a = p3.m.a.f135155b;
                    if (objQ3 == c2565a) {
                        objQ3 = p3.p0.n(Boolean.TRUE);
                        o0VarE.K(objQ3);
                    }
                    final p3.p1 p1Var2 = (p3.p1) objQ3;
                    Object[] objArr = new Object[0];
                    i34 = i29 & 14;
                    if (i34 == 4) {
                        z28 = true;
                    } else {
                        z28 = false;
                    }
                    objQ4 = o0VarE.q();
                    if (z28 || objQ4 == c2565a) {
                        objQ4 = new e40.d(nVar, 8);
                        o0VarE.K(objQ4);
                    }
                    p1Var = (p3.p1) d4.a.e(objArr, (e23.a) objQ4, o0VarE, 0);
                    p1VarQ = p3.p0.q(nVar, o0VarE);
                    zB2 = o0VarE.B(p1VarQ);
                    objQ5 = o0VarE.q();
                    if (zB2 || objQ5 == c2565a) {
                        objQ5 = new a11.m(p1VarQ, 29);
                        o0VarE.K(objQ5);
                    }
                    mcVarF = e9.f(true, (e23.l) objQ5, o0VarE, 6, 0);
                    if (i34 == 4) {
                        z29 = true;
                    } else {
                        z29 = false;
                    }
                    zB3 = z29 | o0VarE.B(mcVarF) | o0VarE.B(p1Var);
                    objQ6 = o0VarE.q();
                    if (zB3 || objQ6 == c2565a) {
                        objQ6 = new u0(nVar, mcVarF, p1Var, null);
                        o0VarE.K(objQ6);
                    }
                    p3.l0.e((e23.p) objQ6, nVar, o0VarE);
                    final i53.d dVar4 = dVar2;
                    final int i47 = i24;
                    o0Var = o0VarE;
                    z02.d.a((z18 || mcVarF.e()) ? false : true, z3.f.c(-771416021, new bt1.m(aVar4, z26, bVarB, dVar3, lVar4), o0VarE), z3.f.c(291772588, new ak0.o(feVar, 11), o0VarE), null, null, z3.f.c(-813628881, new e23.p() { // from class: et1.p0
                        /* JADX WARN: Code duplicated, block: B:48:0x0234  */
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            int i48;
                            p3.m mVar2 = (p3.m) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                                p3.x1 x1Var2 = p3.n.f135158a;
                                h4.r.a aVar6 = h4.r.S;
                                h4.r rVarD = x2.d(aVar6, 1.0f);
                                c2.j.f22691a.getClass();
                                c2.j.k kVar = c2.j.f22694d;
                                h4.d.f81522a.getClass();
                                c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, mVar2, 0);
                                int iHashCode = Long.hashCode(mVar2.getU());
                                p3.i2 i2VarX = mVar2.x();
                                h4.r rVarC = h4.k.c(rVarD, mVar2);
                                h5.g.V.getClass();
                                h5.e0.a aVar7 = h5.g.a.f81805b;
                                if (mVar2.F() == null) {
                                    p3.p0.l();
                                    throw null;
                                }
                                mVar2.z();
                                if (mVar2.getT()) {
                                    mVar2.M(aVar7);
                                } else {
                                    mVar2.c();
                                }
                                h5.g.a.e eVar = h5.g.a.f81810g;
                                b4.c(eVar, zVarA, mVar2);
                                h5.g.a.C1623g c1623g = h5.g.a.f81809f;
                                b4.c(c1623g, i2VarX, mVar2);
                                h5.g.a.b bVar = h5.g.a.f81813j;
                                if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                                    v.h.z(iHashCode, mVar2, iHashCode, bVar);
                                }
                                h5.g.a.f fVar = h5.g.a.f81807d;
                                b4.c(fVar, rVarC, mVar2);
                                h4.r rVarA = c2.b0.f22601a.a(aVar6, 1.0f, true);
                                h4.g gVar = h4.d.a.f81528f;
                                h2.b bVar2 = bVarB;
                                p3.p1 p1Var3 = p1Var2;
                                mc mcVar = mcVarF;
                                e23.l lVar6 = lVar4;
                                boolean z34 = z18;
                                zc.d dVar5 = dVar3;
                                c2.v.a(rVarA, gVar, false, z3.f.c(89464571, new r0(bVar2, p1Var3, mcVar, lVar6, z34, dVar5, lVar3, feVar, nVar, p1Var, pVar, lVar5), mVar2), mVar2, 3120, 4);
                                kt1.b bVar3 = bVar2.l() < dVar5.b() ? (kt1.b) dVar5.a(bVar2.l()) : null;
                                if (bVar3 == null) {
                                    mVar2.C(-696916361);
                                    mVar2.f();
                                } else {
                                    mVar2.C(-696916360);
                                    h4.r rVarE = u1.n.e(x2.f(aVar6, 1.0f), tn.k.a(d92.b.f58623a, mVar2), o4.m1.f128891a);
                                    d92.b.f58625c.getClass();
                                    h4.r rVarY = c2.l.y(rVarE, j92.b.f97899b.f97920e);
                                    s2 s2VarA = c2.q2.a(c2.j.f22698h, h4.d.a.f81534l, mVar2, 54);
                                    int iHashCode2 = Long.hashCode(mVar2.getU());
                                    p3.i2 i2VarX2 = mVar2.x();
                                    h4.r rVarC2 = h4.k.c(rVarY, mVar2);
                                    if (mVar2.F() == null) {
                                        p3.p0.l();
                                        throw null;
                                    }
                                    mVar2.z();
                                    if (mVar2.getT()) {
                                        mVar2.M(aVar7);
                                    } else {
                                        mVar2.c();
                                    }
                                    b4.c(eVar, s2VarA, mVar2);
                                    b4.c(c1623g, i2VarX2, mVar2);
                                    if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode2))) {
                                        v.h.z(iHashCode2, mVar2, iHashCode2, bVar);
                                    }
                                    b4.c(fVar, rVarC2, mVar2);
                                    u2 u2Var = u2.f22900a;
                                    kt1.b bVar4 = bVar3;
                                    String str = bVar4.f106451e;
                                    d92.b.f58624b.getClass();
                                    mh.c(str, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, mVar2), mVar2, 0, 0, 131070);
                                    mh.c(gl1.y.P(R.string.lbl_value1_of_value2, new Object[]{String.valueOf(bVar2.l() + 1), String.valueOf(i47)}, mVar2), null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, mVar2), mVar2, 0, 0, 131070);
                                    pt1.r rVar = (pt1.r) dVar4.get(Long.valueOf(bVar4.f106447a));
                                    int i49 = bVar4.f106452f + (rVar != null ? rVar.f140963c : 0);
                                    boolean z35 = rVar != null ? rVar.f140961a : false;
                                    boolean z36 = !bVar4.f106455i;
                                    boolean zR2 = mVar2.r(bVar4);
                                    e23.l lVar7 = lVar2;
                                    boolean zB4 = zR2 | mVar2.B(lVar7) | mVar2.r(bVar4);
                                    Object objQ7 = mVar2.q();
                                    if (zB4) {
                                        objQ7 = new cw1.g0(bVar4, 12, lVar7, bVar4);
                                        mVar2.K(objQ7);
                                    } else {
                                        p3.m.f135153a.getClass();
                                        if (objQ7 == p3.m.a.f135155b) {
                                            objQ7 = new cw1.g0(bVar4, 12, lVar7, bVar4);
                                            mVar2.K(objQ7);
                                        }
                                    }
                                    ct1.b.a(null, i49, z35, z36, (e23.a) objQ7, mVar2, 0);
                                    mVar2 = mVar2;
                                    mVar2.y();
                                    Unit unit = Unit.INSTANCE;
                                    mVar2.f();
                                }
                                mVar2.y();
                                if (z15) {
                                    mVar2.C(1985612630);
                                    i48 = 0;
                                    zf.b.b(null, null, aVar, mVar2, 0);
                                    mVar2.f();
                                } else {
                                    i48 = 0;
                                    mVar2.C(1985763507);
                                    mVar2.f();
                                }
                                if (z16) {
                                    mVar2.C(1985815835);
                                    xy2.b.f(aVar2, mVar2, i48);
                                    mVar2.f();
                                } else {
                                    mVar2.C(1985992659);
                                    mVar2.f();
                                }
                                if (z17) {
                                    mVar2.C(1986049327);
                                    xy2.b.a(aVar3, mVar2, i48);
                                    mVar2.f();
                                } else {
                                    mVar2.C(1986237683);
                                    mVar2.f();
                                }
                            } else {
                                mVar2.e();
                            }
                            return Unit.INSTANCE;
                        }
                    }, o0VarE), o0Var, 197040, 24);
                    o0Var.g0(false);
                } else {
                    o0Var = o0VarE;
                    o0Var.C(2085047681);
                    o0Var.g0(false);
                }
                z25 = z26;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                z25 = z19;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new e23.p() { // from class: et1.q0
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iT = p3.p0.t(i16 | 1);
                        int iT2 = p3.p0.t(i17);
                        w0.b(iVar, dVar, i14, i15, z25, z15, z16, z17, z18, feVar, nVar, lVar, lVar2, lVar3, lVar4, lVar5, pVar, aVar, aVar2, aVar3, aVar4, (p3.m) obj, iT, iT2, i18);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        i19 |= 24576;
        z19 = z14;
        if ((i16 & 196608) == 0) {
            if (o0VarE.h(z15)) {
                i44 = 131072;
            } else {
                i44 = 65536;
            }
            i19 |= i44;
        }
        i25 = i16 & 1572864;
        i26 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
        if (i25 == 0) {
            if (o0VarE.h(z16)) {
                i39 = 1048576;
            } else {
                i39 = 524288;
            }
            i19 |= i39;
        }
        if ((i16 & 12582912) == 0) {
            if (o0VarE.h(z17)) {
                i38 = 8388608;
            } else {
                i38 = 4194304;
            }
            i19 |= i38;
        }
        if ((i16 & 100663296) == 0) {
            if (o0VarE.h(z18)) {
                i37 = 67108864;
            } else {
                i37 = 33554432;
            }
            i19 |= i37;
        }
        if ((i16 & C.ENCODING_PCM_32BIT) == 0) {
            if (o0VarE.B(feVar)) {
                i36 = 536870912;
            } else {
                i36 = 268435456;
            }
            i19 |= i36;
        }
        if (o0VarE.B(nVar)) {
            i27 = 4;
        } else {
            i27 = 2;
        }
        i28 = i17 | i27;
        if ((i17 & 48) == 0) {
            if (o0VarE.r(lVar)) {
                i35 = 32;
            } else {
                i35 = 16;
            }
            i28 |= i35;
        }
        int i48 = i28 | (o0VarE.r(lVar2) ? 256 : 128) | (o0VarE.r(lVar3) ? 2048 : 1024) | (o0VarE.r(lVar4) ? 16384 : 8192) | (o0VarE.r(lVar5) ? 131072 : 65536);
        if (!o0VarE.r(pVar)) {
            i26 = 524288;
        }
        i29 = i48 | i26 | (o0VarE.r(aVar) ? 8388608 : 4194304) | (o0VarE.r(aVar2) ? 67108864 : 33554432) | (o0VarE.r(aVar3) ? 536870912 : 268435456);
        if (o0VarE.r(aVar4)) {
            c14 = 4;
        } else {
            c14 = 2;
        }
        i30 = i19;
        if ((i19 & 306783379) != 306783378) {
            z24 = true;
        } else {
            z24 = true;
        }
        if (o0VarE.n(i30 & 1, z24)) {
            if (i45 != 0) {
                z26 = false;
            } else {
                z26 = z19;
            }
            p3.x1 x1Var2 = p3.n.f135158a;
            if (iVar == null) {
                o0VarE.C(2073108774);
                o0VarE.g0(false);
                dVar3 = null;
            } else {
                o0VarE.C(-1595693509);
                zc.d dVarA2 = zc.g.a(iVar, o0VarE);
                o0VarE.g0(false);
                dVar3 = dVarA2;
            }
            if (dVar3 != null) {
                o0VarE.C(2073540667);
                zR = o0VarE.r(dVar3);
                objQ = o0VarE.q();
                aVar5 = p3.m.f135153a;
                if (zR) {
                    aVar5.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new s0(dVar3, 0);
                        o0VarE.K(objQ);
                    }
                } else {
                    objQ = new s0(dVar3, 0);
                    o0VarE.K(objQ);
                }
                bVarB = h2.o0.b(i14, (e23.a) objQ, o0VarE, (i30 >> 6) & 14, 2);
                Integer numValueOf2 = Integer.valueOf(bVarB.l());
                if ((i29 & 112) == 32) {
                    z27 = true;
                } else {
                    z27 = false;
                }
                zB = z27 | o0VarE.B(bVarB);
                objQ2 = o0VarE.q();
                if (zB) {
                    aVar5.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new t0(lVar, bVarB, null);
                        o0VarE.K(objQ2);
                    }
                } else {
                    objQ2 = new t0(lVar, bVarB, null);
                    o0VarE.K(objQ2);
                }
                p3.l0.e((e23.p) objQ2, numValueOf2, o0VarE);
                objQ3 = o0VarE.q();
                aVar5.getClass();
                c2565a = p3.m.a.f135155b;
                if (objQ3 == c2565a) {
                    objQ3 = p3.p0.n(Boolean.TRUE);
                    o0VarE.K(objQ3);
                }
                final p3.p1 p1Var3 = (p3.p1) objQ3;
                Object[] objArr2 = new Object[0];
                i34 = i29 & 14;
                if (i34 == 4) {
                    z28 = true;
                } else {
                    z28 = false;
                }
                objQ4 = o0VarE.q();
                if (z28) {
                    objQ4 = new e40.d(nVar, 8);
                    o0VarE.K(objQ4);
                } else {
                    objQ4 = new e40.d(nVar, 8);
                    o0VarE.K(objQ4);
                }
                p1Var = (p3.p1) d4.a.e(objArr2, (e23.a) objQ4, o0VarE, 0);
                p1VarQ = p3.p0.q(nVar, o0VarE);
                zB2 = o0VarE.B(p1VarQ);
                objQ5 = o0VarE.q();
                if (zB2) {
                    objQ5 = new a11.m(p1VarQ, 29);
                    o0VarE.K(objQ5);
                } else {
                    objQ5 = new a11.m(p1VarQ, 29);
                    o0VarE.K(objQ5);
                }
                mcVarF = e9.f(true, (e23.l) objQ5, o0VarE, 6, 0);
                if (i34 == 4) {
                    z29 = true;
                } else {
                    z29 = false;
                }
                zB3 = z29 | o0VarE.B(mcVarF) | o0VarE.B(p1Var);
                objQ6 = o0VarE.q();
                if (zB3) {
                    objQ6 = new u0(nVar, mcVarF, p1Var, null);
                    o0VarE.K(objQ6);
                } else {
                    objQ6 = new u0(nVar, mcVarF, p1Var, null);
                    o0VarE.K(objQ6);
                }
                p3.l0.e((e23.p) objQ6, nVar, o0VarE);
                final i53.d dVar5 = dVar2;
                final int i49 = i24;
                o0Var = o0VarE;
                z02.d.a((z18 || mcVarF.e()) ? false : true, z3.f.c(-771416021, new bt1.m(aVar4, z26, bVarB, dVar3, lVar4), o0VarE), z3.f.c(291772588, new ak0.o(feVar, 11), o0VarE), null, null, z3.f.c(-813628881, new e23.p() { // from class: et1.p0
                    /* JADX WARN: Code duplicated, block: B:48:0x0234  */
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        int i410;
                        p3.m mVar2 = (p3.m) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                            p3.x1 x1Var3 = p3.n.f135158a;
                            h4.r.a aVar6 = h4.r.S;
                            h4.r rVarD = x2.d(aVar6, 1.0f);
                            c2.j.f22691a.getClass();
                            c2.j.k kVar = c2.j.f22694d;
                            h4.d.f81522a.getClass();
                            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, mVar2, 0);
                            int iHashCode = Long.hashCode(mVar2.getU());
                            p3.i2 i2VarX = mVar2.x();
                            h4.r rVarC = h4.k.c(rVarD, mVar2);
                            h5.g.V.getClass();
                            h5.e0.a aVar7 = h5.g.a.f81805b;
                            if (mVar2.F() == null) {
                                p3.p0.l();
                                throw null;
                            }
                            mVar2.z();
                            if (mVar2.getT()) {
                                mVar2.M(aVar7);
                            } else {
                                mVar2.c();
                            }
                            h5.g.a.e eVar = h5.g.a.f81810g;
                            b4.c(eVar, zVarA, mVar2);
                            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
                            b4.c(c1623g, i2VarX, mVar2);
                            h5.g.a.b bVar = h5.g.a.f81813j;
                            if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                                v.h.z(iHashCode, mVar2, iHashCode, bVar);
                            }
                            h5.g.a.f fVar = h5.g.a.f81807d;
                            b4.c(fVar, rVarC, mVar2);
                            h4.r rVarA = c2.b0.f22601a.a(aVar6, 1.0f, true);
                            h4.g gVar = h4.d.a.f81528f;
                            h2.b bVar2 = bVarB;
                            p3.p1 p1Var4 = p1Var3;
                            mc mcVar = mcVarF;
                            e23.l lVar6 = lVar4;
                            boolean z34 = z18;
                            zc.d dVar6 = dVar3;
                            c2.v.a(rVarA, gVar, false, z3.f.c(89464571, new r0(bVar2, p1Var4, mcVar, lVar6, z34, dVar6, lVar3, feVar, nVar, p1Var, pVar, lVar5), mVar2), mVar2, 3120, 4);
                            kt1.b bVar3 = bVar2.l() < dVar6.b() ? (kt1.b) dVar6.a(bVar2.l()) : null;
                            if (bVar3 == null) {
                                mVar2.C(-696916361);
                                mVar2.f();
                            } else {
                                mVar2.C(-696916360);
                                h4.r rVarE = u1.n.e(x2.f(aVar6, 1.0f), tn.k.a(d92.b.f58623a, mVar2), o4.m1.f128891a);
                                d92.b.f58625c.getClass();
                                h4.r rVarY = c2.l.y(rVarE, j92.b.f97899b.f97920e);
                                s2 s2VarA = c2.q2.a(c2.j.f22698h, h4.d.a.f81534l, mVar2, 54);
                                int iHashCode2 = Long.hashCode(mVar2.getU());
                                p3.i2 i2VarX2 = mVar2.x();
                                h4.r rVarC2 = h4.k.c(rVarY, mVar2);
                                if (mVar2.F() == null) {
                                    p3.p0.l();
                                    throw null;
                                }
                                mVar2.z();
                                if (mVar2.getT()) {
                                    mVar2.M(aVar7);
                                } else {
                                    mVar2.c();
                                }
                                b4.c(eVar, s2VarA, mVar2);
                                b4.c(c1623g, i2VarX2, mVar2);
                                if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode2))) {
                                    v.h.z(iHashCode2, mVar2, iHashCode2, bVar);
                                }
                                b4.c(fVar, rVarC2, mVar2);
                                u2 u2Var = u2.f22900a;
                                kt1.b bVar4 = bVar3;
                                String str = bVar4.f106451e;
                                d92.b.f58624b.getClass();
                                mh.c(str, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, mVar2), mVar2, 0, 0, 131070);
                                mh.c(gl1.y.P(R.string.lbl_value1_of_value2, new Object[]{String.valueOf(bVar2.l() + 1), String.valueOf(i49)}, mVar2), null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, mVar2), mVar2, 0, 0, 131070);
                                pt1.r rVar = (pt1.r) dVar5.get(Long.valueOf(bVar4.f106447a));
                                int i411 = bVar4.f106452f + (rVar != null ? rVar.f140963c : 0);
                                boolean z35 = rVar != null ? rVar.f140961a : false;
                                boolean z36 = !bVar4.f106455i;
                                boolean zR2 = mVar2.r(bVar4);
                                e23.l lVar7 = lVar2;
                                boolean zB4 = zR2 | mVar2.B(lVar7) | mVar2.r(bVar4);
                                Object objQ7 = mVar2.q();
                                if (zB4) {
                                    objQ7 = new cw1.g0(bVar4, 12, lVar7, bVar4);
                                    mVar2.K(objQ7);
                                } else {
                                    p3.m.f135153a.getClass();
                                    if (objQ7 == p3.m.a.f135155b) {
                                        objQ7 = new cw1.g0(bVar4, 12, lVar7, bVar4);
                                        mVar2.K(objQ7);
                                    }
                                }
                                ct1.b.a(null, i411, z35, z36, (e23.a) objQ7, mVar2, 0);
                                mVar2 = mVar2;
                                mVar2.y();
                                Unit unit = Unit.INSTANCE;
                                mVar2.f();
                            }
                            mVar2.y();
                            if (z15) {
                                mVar2.C(1985612630);
                                i410 = 0;
                                zf.b.b(null, null, aVar, mVar2, 0);
                                mVar2.f();
                            } else {
                                i410 = 0;
                                mVar2.C(1985763507);
                                mVar2.f();
                            }
                            if (z16) {
                                mVar2.C(1985815835);
                                xy2.b.f(aVar2, mVar2, i410);
                                mVar2.f();
                            } else {
                                mVar2.C(1985992659);
                                mVar2.f();
                            }
                            if (z17) {
                                mVar2.C(1986049327);
                                xy2.b.a(aVar3, mVar2, i410);
                                mVar2.f();
                            } else {
                                mVar2.C(1986237683);
                                mVar2.f();
                            }
                        } else {
                            mVar2.e();
                        }
                        return Unit.INSTANCE;
                    }
                }, o0VarE), o0Var, 197040, 24);
                o0Var.g0(false);
            } else {
                o0Var = o0VarE;
                o0Var.C(2085047681);
                o0Var.g0(false);
            }
            z25 = z26;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            z25 = z19;
        }
        p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p() { // from class: et1.q0
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iT = p3.p0.t(i16 | 1);
                    int iT2 = p3.p0.t(i17);
                    w0.b(iVar, dVar, i14, i15, z25, z15, z16, z17, z18, feVar, nVar, lVar, lVar2, lVar3, lVar4, lVar5, pVar, aVar, aVar2, aVar3, aVar4, (p3.m) obj, iT, iT2, i18);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
