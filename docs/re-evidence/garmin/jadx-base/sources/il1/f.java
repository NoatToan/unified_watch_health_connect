package il1;

import ak0.h;
import b82.l0;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import e23.l;
import e23.p;
import h4.r;
import i3.i7;
import o4.d0;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;
import p5.v;
import v62.k5;
import v62.s6;

/* JADX INFO: loaded from: classes10.dex */
public final class f {
    /* JADX WARN: Code duplicated, block: B:100:0x011d  */
    /* JADX WARN: Code duplicated, block: B:101:0x011f  */
    /* JADX WARN: Code duplicated, block: B:104:0x0124  */
    /* JADX WARN: Code duplicated, block: B:106:0x012f  */
    /* JADX WARN: Code duplicated, block: B:108:0x013d  */
    /* JADX WARN: Code duplicated, block: B:110:0x0141  */
    /* JADX WARN: Code duplicated, block: B:111:0x0144  */
    /* JADX WARN: Code duplicated, block: B:113:0x0148  */
    /* JADX WARN: Code duplicated, block: B:114:0x014b  */
    /* JADX WARN: Code duplicated, block: B:116:0x014f  */
    /* JADX WARN: Code duplicated, block: B:118:0x0154  */
    /* JADX WARN: Code duplicated, block: B:121:0x016a  */
    /* JADX WARN: Code duplicated, block: B:122:0x0175  */
    /* JADX WARN: Code duplicated, block: B:124:0x017f  */
    /* JADX WARN: Code duplicated, block: B:125:0x018a  */
    /* JADX WARN: Code duplicated, block: B:127:0x0196  */
    /* JADX WARN: Code duplicated, block: B:128:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:130:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:131:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:134:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:135:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:138:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:139:0x01da  */
    /* JADX WARN: Code duplicated, block: B:142:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:143:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:146:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:147:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:150:0x0208  */
    /* JADX WARN: Code duplicated, block: B:153:0x0210  */
    /* JADX WARN: Code duplicated, block: B:154:0x0213  */
    /* JADX WARN: Code duplicated, block: B:156:0x026a  */
    /* JADX WARN: Code duplicated, block: B:159:0x027e  */
    /* JADX WARN: Code duplicated, block: B:161:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x005b  */
    /* JADX WARN: Code duplicated, block: B:33:0x0060  */
    /* JADX WARN: Code duplicated, block: B:35:0x0064  */
    /* JADX WARN: Code duplicated, block: B:37:0x006c  */
    /* JADX WARN: Code duplicated, block: B:38:0x006f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0076  */
    /* JADX WARN: Code duplicated, block: B:44:0x007e  */
    /* JADX WARN: Code duplicated, block: B:45:0x0081  */
    /* JADX WARN: Code duplicated, block: B:47:0x0085  */
    /* JADX WARN: Code duplicated, block: B:50:0x008d  */
    /* JADX WARN: Code duplicated, block: B:52:0x0091  */
    /* JADX WARN: Code duplicated, block: B:54:0x0094  */
    /* JADX WARN: Code duplicated, block: B:56:0x009c  */
    /* JADX WARN: Code duplicated, block: B:57:0x009f  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:67:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:72:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:77:0x00db  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:83:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:87:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:88:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:92:0x010c  */
    /* JADX WARN: Code duplicated, block: B:93:0x010e  */
    /* JADX WARN: Code duplicated, block: B:96:0x0117  */
    /* JADX WARN: Code duplicated, block: B:98:0x011a  */
    public static final void a(String str, u4.d dVar, u4.d dVar2, d0 d0Var, e23.a<Unit> aVar, e23.a<Unit> aVar2, e23.a<Boolean> aVar3, e23.a<Boolean> aVar4, p<? super m, ? super Integer, Unit> pVar, m mVar, int i14, int i15) {
        int i16;
        u4.d dVar3;
        int i17;
        d0 d0Var2;
        int i18;
        int i19;
        e23.a<Unit> aVar5;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        boolean z14;
        o0 o0Var;
        e23.a<Boolean> aVar6;
        u4.d dVar4;
        d0 d0Var3;
        e23.a<Unit> aVar7;
        e23.a<Boolean> aVar8;
        p<? super m, ? super Integer, Unit> pVar2;
        p2 p2VarI0;
        String strJ;
        d0 d0Var4;
        m.a aVar9;
        e23.a<Unit> aVar10;
        e23.a<Boolean> aVar11;
        e23.a<Boolean> aVar12;
        p<? super m, ? super Integer, Unit> pVar3;
        t62.b bVar;
        String strJ2;
        String strJ3;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        Object objQ;
        u4.d dVar5;
        Object objQ2;
        int i34;
        str.getClass();
        dVar.getClass();
        o0 o0VarE = mVar.E(374159889);
        if ((i14 & 6) == 0) {
            i16 = (o0VarE.B(str) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= o0VarE.B(dVar) ? 32 : 16;
        }
        int i35 = i15 & 4;
        if (i35 == 0) {
            if ((i14 & 384) == 0) {
                dVar3 = dVar2;
                i16 |= o0VarE.B(dVar3) ? 256 : 128;
            }
            i17 = i15 & 8;
            if (i17 != 0) {
                if ((i14 & 3072) == 0) {
                    d0Var2 = d0Var;
                    if (o0VarE.B(d0Var2)) {
                        i18 = 2048;
                    } else {
                        i18 = 1024;
                    }
                    i16 |= i18;
                }
                if ((i14 & 24576) != 0) {
                    if (o0VarE.r(aVar)) {
                        i34 = 16384;
                    } else {
                        i34 = 8192;
                    }
                    i16 |= i34;
                }
                i19 = i15 & 32;
                if (i19 != 0) {
                    if ((196608 & i14) == 0) {
                        aVar5 = aVar2;
                        if (o0VarE.r(aVar5)) {
                            i24 = 131072;
                        } else {
                            i24 = 65536;
                        }
                        i16 |= i24;
                    }
                    i25 = i15 & 64;
                    if (i25 != 0) {
                        i16 |= 1572864;
                    } else if ((i14 & 1572864) == 0) {
                        if (o0VarE.r(aVar3)) {
                            i26 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                        } else {
                            i26 = 524288;
                        }
                        i16 |= i26;
                    }
                    i27 = i15 & 128;
                    if (i27 != 0) {
                        i16 |= 12582912;
                    } else if ((i14 & 12582912) == 0) {
                        if (o0VarE.r(aVar4)) {
                            i28 = 8388608;
                        } else {
                            i28 = 4194304;
                        }
                        i16 |= i28;
                    }
                    i29 = i15 & 256;
                    if (i29 != 0) {
                        if ((i14 & 100663296) == 0) {
                            if (o0VarE.r(pVar)) {
                                i30 = 67108864;
                            } else {
                                i30 = 33554432;
                            }
                            i16 |= i30;
                        }
                        if ((i16 & 38347923) != 38347922) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (o0VarE.n(i16 & 1, z14)) {
                            strJ = null;
                            if (i35 != 0) {
                                dVar3 = null;
                            }
                            if (i17 != 0) {
                                d0Var4 = null;
                            } else {
                                d0Var4 = d0Var2;
                            }
                            aVar9 = m.f135153a;
                            if (i19 != 0) {
                                objQ2 = o0VarE.q();
                                aVar9.getClass();
                                if (objQ2 == m.a.f135155b) {
                                    objQ2 = new ik2.b(2);
                                    o0VarE.K(objQ2);
                                }
                                aVar10 = (e23.a) objQ2;
                            } else {
                                aVar10 = aVar5;
                            }
                            if (i25 != 0) {
                                aVar11 = null;
                            } else {
                                aVar11 = aVar3;
                            }
                            if (i27 != 0) {
                                aVar12 = null;
                            } else {
                                aVar12 = aVar4;
                            }
                            if (i29 != 0) {
                                pVar3 = null;
                            } else {
                                pVar3 = pVar;
                            }
                            x1 x1Var = n.f135158a;
                            s62.a.f157643a.getClass();
                            bVar = t62.b.f162798a;
                            if (s.g(dVar3, k5.a(bVar))) {
                                strJ2 = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -1209585317, R.string.lbl_common_remove, o0VarE, false);
                            } else if (s.g(dVar3, s6.a(bVar))) {
                                strJ2 = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -1209583023, R.string.lbl_add, o0VarE, false);
                            } else {
                                o0VarE.C(1157679692);
                                o0VarE.g0(false);
                                strJ2 = null;
                            }
                            if (aVar11 != null) {
                                strJ3 = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -1209579695, R.string.move_up, o0VarE, false);
                            } else {
                                o0VarE.C(1157771948);
                                o0VarE.g0(false);
                                strJ3 = null;
                            }
                            if (aVar12 != null) {
                                strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -1209576781, R.string.move_down, o0VarE, false);
                            } else {
                                o0VarE.C(1157864204);
                                o0VarE.g0(false);
                            }
                            l72.p2 p2Var = l72.p2.f111205a;
                            r.a aVar13 = r.S;
                            if ((i16 & 896) == 256) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            boolean zB = z15 | o0VarE.B(strJ2);
                            if ((458752 & i16) == 131072) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            boolean zB2 = z16 | zB | o0VarE.B(strJ3);
                            if ((i16 & 3670016) == 1048576) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            boolean zB3 = zB2 | z17 | o0VarE.B(strJ);
                            if ((29360128 & i16) == 8388608) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                            z19 = zB3 | z18;
                            objQ = o0VarE.q();
                            if (z19) {
                                dVar5 = dVar3;
                                objQ = new l0(dVar5, strJ2, strJ3, strJ, aVar10, aVar11, aVar12, 7);
                                o0VarE.K(objQ);
                            } else {
                                aVar9.getClass();
                                if (objQ == m.a.f135155b) {
                                    dVar5 = dVar3;
                                    objQ = new l0(dVar5, strJ2, strJ3, strJ, aVar10, aVar11, aVar12, 7);
                                    o0VarE.K(objQ);
                                } else {
                                    dVar5 = dVar3;
                                }
                            }
                            o0Var = o0VarE;
                            p2Var.f(v.c((l) objQ, aVar13, true), z3.f.c(1985780585, new h(dVar5, d0Var4, aVar10, dVar, str, pVar3, 9), o0VarE), null, false, false, null, aVar, o0Var, ((i16 << 6) & 3670016) | 48, 60);
                            pVar2 = pVar3;
                            dVar4 = dVar5;
                            aVar7 = aVar10;
                            aVar8 = aVar11;
                            aVar6 = aVar12;
                            d0Var3 = d0Var4;
                        } else {
                            o0Var = o0VarE;
                            o0Var.e();
                            aVar6 = aVar4;
                            dVar4 = dVar3;
                            d0Var3 = d0Var2;
                            aVar7 = aVar5;
                            aVar8 = aVar3;
                            pVar2 = pVar;
                        }
                        p2VarI0 = o0Var.i0();
                        if (p2VarI0 != null) {
                            p2VarI0.f135219d = new h02.c(str, dVar, dVar4, d0Var3, aVar, aVar7, aVar8, aVar6, pVar2, i14, i15);
                        }
                    }
                    i16 |= 100663296;
                    if ((i16 & 38347923) != 38347922) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (o0VarE.n(i16 & 1, z14)) {
                        strJ = null;
                        if (i35 != 0) {
                            dVar3 = null;
                        }
                        if (i17 != 0) {
                            d0Var4 = null;
                        } else {
                            d0Var4 = d0Var2;
                        }
                        aVar9 = m.f135153a;
                        if (i19 != 0) {
                            objQ2 = o0VarE.q();
                            aVar9.getClass();
                            if (objQ2 == m.a.f135155b) {
                                objQ2 = new ik2.b(2);
                                o0VarE.K(objQ2);
                            }
                            aVar10 = (e23.a) objQ2;
                        } else {
                            aVar10 = aVar5;
                        }
                        if (i25 != 0) {
                            aVar11 = null;
                        } else {
                            aVar11 = aVar3;
                        }
                        if (i27 != 0) {
                            aVar12 = null;
                        } else {
                            aVar12 = aVar4;
                        }
                        if (i29 != 0) {
                            pVar3 = null;
                        } else {
                            pVar3 = pVar;
                        }
                        x1 x1Var2 = n.f135158a;
                        s62.a.f157643a.getClass();
                        bVar = t62.b.f162798a;
                        if (s.g(dVar3, k5.a(bVar))) {
                            strJ2 = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -1209585317, R.string.lbl_common_remove, o0VarE, false);
                        } else if (s.g(dVar3, s6.a(bVar))) {
                            strJ2 = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -1209583023, R.string.lbl_add, o0VarE, false);
                        } else {
                            o0VarE.C(1157679692);
                            o0VarE.g0(false);
                            strJ2 = null;
                        }
                        if (aVar11 != null) {
                            strJ3 = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -1209579695, R.string.move_up, o0VarE, false);
                        } else {
                            o0VarE.C(1157771948);
                            o0VarE.g0(false);
                            strJ3 = null;
                        }
                        if (aVar12 != null) {
                            strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -1209576781, R.string.move_down, o0VarE, false);
                        } else {
                            o0VarE.C(1157864204);
                            o0VarE.g0(false);
                        }
                        l72.p2 p2Var2 = l72.p2.f111205a;
                        r.a aVar14 = r.S;
                        if ((i16 & 896) == 256) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        boolean zB4 = z15 | o0VarE.B(strJ2);
                        if ((458752 & i16) == 131072) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        boolean zB5 = z16 | zB4 | o0VarE.B(strJ3);
                        if ((i16 & 3670016) == 1048576) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        boolean zB6 = zB5 | z17 | o0VarE.B(strJ);
                        if ((29360128 & i16) == 8388608) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        z19 = zB6 | z18;
                        objQ = o0VarE.q();
                        if (z19) {
                            aVar9.getClass();
                            if (objQ == m.a.f135155b) {
                                dVar5 = dVar3;
                                objQ = new l0(dVar5, strJ2, strJ3, strJ, aVar10, aVar11, aVar12, 7);
                                o0VarE.K(objQ);
                            } else {
                                dVar5 = dVar3;
                            }
                        } else {
                            dVar5 = dVar3;
                            objQ = new l0(dVar5, strJ2, strJ3, strJ, aVar10, aVar11, aVar12, 7);
                            o0VarE.K(objQ);
                        }
                        o0Var = o0VarE;
                        p2Var2.f(v.c((l) objQ, aVar14, true), z3.f.c(1985780585, new h(dVar5, d0Var4, aVar10, dVar, str, pVar3, 9), o0VarE), null, false, false, null, aVar, o0Var, ((i16 << 6) & 3670016) | 48, 60);
                        pVar2 = pVar3;
                        dVar4 = dVar5;
                        aVar7 = aVar10;
                        aVar8 = aVar11;
                        aVar6 = aVar12;
                        d0Var3 = d0Var4;
                    } else {
                        o0Var = o0VarE;
                        o0Var.e();
                        aVar6 = aVar4;
                        dVar4 = dVar3;
                        d0Var3 = d0Var2;
                        aVar7 = aVar5;
                        aVar8 = aVar3;
                        pVar2 = pVar;
                    }
                    p2VarI0 = o0Var.i0();
                    if (p2VarI0 != null) {
                        p2VarI0.f135219d = new h02.c(str, dVar, dVar4, d0Var3, aVar, aVar7, aVar8, aVar6, pVar2, i14, i15);
                    }
                }
                i16 |= 196608;
                aVar5 = aVar2;
                i25 = i15 & 64;
                if (i25 != 0) {
                    i16 |= 1572864;
                } else if ((i14 & 1572864) == 0) {
                    if (o0VarE.r(aVar3)) {
                        i26 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    } else {
                        i26 = 524288;
                    }
                    i16 |= i26;
                }
                i27 = i15 & 128;
                if (i27 != 0) {
                    i16 |= 12582912;
                } else if ((i14 & 12582912) == 0) {
                    if (o0VarE.r(aVar4)) {
                        i28 = 8388608;
                    } else {
                        i28 = 4194304;
                    }
                    i16 |= i28;
                }
                i29 = i15 & 256;
                if (i29 != 0) {
                    if ((i14 & 100663296) == 0) {
                        if (o0VarE.r(pVar)) {
                            i30 = 67108864;
                        } else {
                            i30 = 33554432;
                        }
                        i16 |= i30;
                    }
                    if ((i16 & 38347923) != 38347922) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (o0VarE.n(i16 & 1, z14)) {
                        strJ = null;
                        if (i35 != 0) {
                            dVar3 = null;
                        }
                        if (i17 != 0) {
                            d0Var4 = null;
                        } else {
                            d0Var4 = d0Var2;
                        }
                        aVar9 = m.f135153a;
                        if (i19 != 0) {
                            objQ2 = o0VarE.q();
                            aVar9.getClass();
                            if (objQ2 == m.a.f135155b) {
                                objQ2 = new ik2.b(2);
                                o0VarE.K(objQ2);
                            }
                            aVar10 = (e23.a) objQ2;
                        } else {
                            aVar10 = aVar5;
                        }
                        if (i25 != 0) {
                            aVar11 = null;
                        } else {
                            aVar11 = aVar3;
                        }
                        if (i27 != 0) {
                            aVar12 = null;
                        } else {
                            aVar12 = aVar4;
                        }
                        if (i29 != 0) {
                            pVar3 = null;
                        } else {
                            pVar3 = pVar;
                        }
                        x1 x1Var3 = n.f135158a;
                        s62.a.f157643a.getClass();
                        bVar = t62.b.f162798a;
                        if (s.g(dVar3, k5.a(bVar))) {
                            strJ2 = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -1209585317, R.string.lbl_common_remove, o0VarE, false);
                        } else if (s.g(dVar3, s6.a(bVar))) {
                            strJ2 = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -1209583023, R.string.lbl_add, o0VarE, false);
                        } else {
                            o0VarE.C(1157679692);
                            o0VarE.g0(false);
                            strJ2 = null;
                        }
                        if (aVar11 != null) {
                            strJ3 = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -1209579695, R.string.move_up, o0VarE, false);
                        } else {
                            o0VarE.C(1157771948);
                            o0VarE.g0(false);
                            strJ3 = null;
                        }
                        if (aVar12 != null) {
                            strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -1209576781, R.string.move_down, o0VarE, false);
                        } else {
                            o0VarE.C(1157864204);
                            o0VarE.g0(false);
                        }
                        l72.p2 p2Var3 = l72.p2.f111205a;
                        r.a aVar15 = r.S;
                        if ((i16 & 896) == 256) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        boolean zB7 = z15 | o0VarE.B(strJ2);
                        if ((458752 & i16) == 131072) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        boolean zB8 = z16 | zB7 | o0VarE.B(strJ3);
                        if ((i16 & 3670016) == 1048576) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        boolean zB9 = zB8 | z17 | o0VarE.B(strJ);
                        if ((29360128 & i16) == 8388608) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        z19 = zB9 | z18;
                        objQ = o0VarE.q();
                        if (z19) {
                            aVar9.getClass();
                            if (objQ == m.a.f135155b) {
                                dVar5 = dVar3;
                                objQ = new l0(dVar5, strJ2, strJ3, strJ, aVar10, aVar11, aVar12, 7);
                                o0VarE.K(objQ);
                            } else {
                                dVar5 = dVar3;
                            }
                        } else {
                            dVar5 = dVar3;
                            objQ = new l0(dVar5, strJ2, strJ3, strJ, aVar10, aVar11, aVar12, 7);
                            o0VarE.K(objQ);
                        }
                        o0Var = o0VarE;
                        p2Var3.f(v.c((l) objQ, aVar15, true), z3.f.c(1985780585, new h(dVar5, d0Var4, aVar10, dVar, str, pVar3, 9), o0VarE), null, false, false, null, aVar, o0Var, ((i16 << 6) & 3670016) | 48, 60);
                        pVar2 = pVar3;
                        dVar4 = dVar5;
                        aVar7 = aVar10;
                        aVar8 = aVar11;
                        aVar6 = aVar12;
                        d0Var3 = d0Var4;
                    } else {
                        o0Var = o0VarE;
                        o0Var.e();
                        aVar6 = aVar4;
                        dVar4 = dVar3;
                        d0Var3 = d0Var2;
                        aVar7 = aVar5;
                        aVar8 = aVar3;
                        pVar2 = pVar;
                    }
                    p2VarI0 = o0Var.i0();
                    if (p2VarI0 != null) {
                        p2VarI0.f135219d = new h02.c(str, dVar, dVar4, d0Var3, aVar, aVar7, aVar8, aVar6, pVar2, i14, i15);
                    }
                }
                i16 |= 100663296;
                if ((i16 & 38347923) != 38347922) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (o0VarE.n(i16 & 1, z14)) {
                    strJ = null;
                    if (i35 != 0) {
                        dVar3 = null;
                    }
                    if (i17 != 0) {
                        d0Var4 = null;
                    } else {
                        d0Var4 = d0Var2;
                    }
                    aVar9 = m.f135153a;
                    if (i19 != 0) {
                        objQ2 = o0VarE.q();
                        aVar9.getClass();
                        if (objQ2 == m.a.f135155b) {
                            objQ2 = new ik2.b(2);
                            o0VarE.K(objQ2);
                        }
                        aVar10 = (e23.a) objQ2;
                    } else {
                        aVar10 = aVar5;
                    }
                    if (i25 != 0) {
                        aVar11 = null;
                    } else {
                        aVar11 = aVar3;
                    }
                    if (i27 != 0) {
                        aVar12 = null;
                    } else {
                        aVar12 = aVar4;
                    }
                    if (i29 != 0) {
                        pVar3 = null;
                    } else {
                        pVar3 = pVar;
                    }
                    x1 x1Var4 = n.f135158a;
                    s62.a.f157643a.getClass();
                    bVar = t62.b.f162798a;
                    if (s.g(dVar3, k5.a(bVar))) {
                        strJ2 = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -1209585317, R.string.lbl_common_remove, o0VarE, false);
                    } else if (s.g(dVar3, s6.a(bVar))) {
                        strJ2 = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -1209583023, R.string.lbl_add, o0VarE, false);
                    } else {
                        o0VarE.C(1157679692);
                        o0VarE.g0(false);
                        strJ2 = null;
                    }
                    if (aVar11 != null) {
                        strJ3 = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -1209579695, R.string.move_up, o0VarE, false);
                    } else {
                        o0VarE.C(1157771948);
                        o0VarE.g0(false);
                        strJ3 = null;
                    }
                    if (aVar12 != null) {
                        strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -1209576781, R.string.move_down, o0VarE, false);
                    } else {
                        o0VarE.C(1157864204);
                        o0VarE.g0(false);
                    }
                    l72.p2 p2Var4 = l72.p2.f111205a;
                    r.a aVar16 = r.S;
                    if ((i16 & 896) == 256) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    boolean zB10 = z15 | o0VarE.B(strJ2);
                    if ((458752 & i16) == 131072) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    boolean zB11 = z16 | zB10 | o0VarE.B(strJ3);
                    if ((i16 & 3670016) == 1048576) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    boolean zB12 = zB11 | z17 | o0VarE.B(strJ);
                    if ((29360128 & i16) == 8388608) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    z19 = zB12 | z18;
                    objQ = o0VarE.q();
                    if (z19) {
                        aVar9.getClass();
                        if (objQ == m.a.f135155b) {
                            dVar5 = dVar3;
                            objQ = new l0(dVar5, strJ2, strJ3, strJ, aVar10, aVar11, aVar12, 7);
                            o0VarE.K(objQ);
                        } else {
                            dVar5 = dVar3;
                        }
                    } else {
                        dVar5 = dVar3;
                        objQ = new l0(dVar5, strJ2, strJ3, strJ, aVar10, aVar11, aVar12, 7);
                        o0VarE.K(objQ);
                    }
                    o0Var = o0VarE;
                    p2Var4.f(v.c((l) objQ, aVar16, true), z3.f.c(1985780585, new h(dVar5, d0Var4, aVar10, dVar, str, pVar3, 9), o0VarE), null, false, false, null, aVar, o0Var, ((i16 << 6) & 3670016) | 48, 60);
                    pVar2 = pVar3;
                    dVar4 = dVar5;
                    aVar7 = aVar10;
                    aVar8 = aVar11;
                    aVar6 = aVar12;
                    d0Var3 = d0Var4;
                } else {
                    o0Var = o0VarE;
                    o0Var.e();
                    aVar6 = aVar4;
                    dVar4 = dVar3;
                    d0Var3 = d0Var2;
                    aVar7 = aVar5;
                    aVar8 = aVar3;
                    pVar2 = pVar;
                }
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new h02.c(str, dVar, dVar4, d0Var3, aVar, aVar7, aVar8, aVar6, pVar2, i14, i15);
                }
            }
            i16 |= 3072;
            d0Var2 = d0Var;
            if ((i14 & 24576) != 0) {
                if (o0VarE.r(aVar)) {
                    i34 = 16384;
                } else {
                    i34 = 8192;
                }
                i16 |= i34;
            }
            i19 = i15 & 32;
            if (i19 != 0) {
                if ((196608 & i14) == 0) {
                    aVar5 = aVar2;
                    if (o0VarE.r(aVar5)) {
                        i24 = 131072;
                    } else {
                        i24 = 65536;
                    }
                    i16 |= i24;
                }
                i25 = i15 & 64;
                if (i25 != 0) {
                    i16 |= 1572864;
                } else if ((i14 & 1572864) == 0) {
                    if (o0VarE.r(aVar3)) {
                        i26 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    } else {
                        i26 = 524288;
                    }
                    i16 |= i26;
                }
                i27 = i15 & 128;
                if (i27 != 0) {
                    i16 |= 12582912;
                } else if ((i14 & 12582912) == 0) {
                    if (o0VarE.r(aVar4)) {
                        i28 = 8388608;
                    } else {
                        i28 = 4194304;
                    }
                    i16 |= i28;
                }
                i29 = i15 & 256;
                if (i29 != 0) {
                    if ((i14 & 100663296) == 0) {
                        if (o0VarE.r(pVar)) {
                            i30 = 67108864;
                        } else {
                            i30 = 33554432;
                        }
                        i16 |= i30;
                    }
                    if ((i16 & 38347923) != 38347922) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (o0VarE.n(i16 & 1, z14)) {
                        strJ = null;
                        if (i35 != 0) {
                            dVar3 = null;
                        }
                        if (i17 != 0) {
                            d0Var4 = null;
                        } else {
                            d0Var4 = d0Var2;
                        }
                        aVar9 = m.f135153a;
                        if (i19 != 0) {
                            objQ2 = o0VarE.q();
                            aVar9.getClass();
                            if (objQ2 == m.a.f135155b) {
                                objQ2 = new ik2.b(2);
                                o0VarE.K(objQ2);
                            }
                            aVar10 = (e23.a) objQ2;
                        } else {
                            aVar10 = aVar5;
                        }
                        if (i25 != 0) {
                            aVar11 = null;
                        } else {
                            aVar11 = aVar3;
                        }
                        if (i27 != 0) {
                            aVar12 = null;
                        } else {
                            aVar12 = aVar4;
                        }
                        if (i29 != 0) {
                            pVar3 = null;
                        } else {
                            pVar3 = pVar;
                        }
                        x1 x1Var5 = n.f135158a;
                        s62.a.f157643a.getClass();
                        bVar = t62.b.f162798a;
                        if (s.g(dVar3, k5.a(bVar))) {
                            strJ2 = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -1209585317, R.string.lbl_common_remove, o0VarE, false);
                        } else if (s.g(dVar3, s6.a(bVar))) {
                            strJ2 = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -1209583023, R.string.lbl_add, o0VarE, false);
                        } else {
                            o0VarE.C(1157679692);
                            o0VarE.g0(false);
                            strJ2 = null;
                        }
                        if (aVar11 != null) {
                            strJ3 = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -1209579695, R.string.move_up, o0VarE, false);
                        } else {
                            o0VarE.C(1157771948);
                            o0VarE.g0(false);
                            strJ3 = null;
                        }
                        if (aVar12 != null) {
                            strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -1209576781, R.string.move_down, o0VarE, false);
                        } else {
                            o0VarE.C(1157864204);
                            o0VarE.g0(false);
                        }
                        l72.p2 p2Var5 = l72.p2.f111205a;
                        r.a aVar17 = r.S;
                        if ((i16 & 896) == 256) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        boolean zB13 = z15 | o0VarE.B(strJ2);
                        if ((458752 & i16) == 131072) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        boolean zB14 = z16 | zB13 | o0VarE.B(strJ3);
                        if ((i16 & 3670016) == 1048576) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        boolean zB15 = zB14 | z17 | o0VarE.B(strJ);
                        if ((29360128 & i16) == 8388608) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        z19 = zB15 | z18;
                        objQ = o0VarE.q();
                        if (z19) {
                            aVar9.getClass();
                            if (objQ == m.a.f135155b) {
                                dVar5 = dVar3;
                                objQ = new l0(dVar5, strJ2, strJ3, strJ, aVar10, aVar11, aVar12, 7);
                                o0VarE.K(objQ);
                            } else {
                                dVar5 = dVar3;
                            }
                        } else {
                            dVar5 = dVar3;
                            objQ = new l0(dVar5, strJ2, strJ3, strJ, aVar10, aVar11, aVar12, 7);
                            o0VarE.K(objQ);
                        }
                        o0Var = o0VarE;
                        p2Var5.f(v.c((l) objQ, aVar17, true), z3.f.c(1985780585, new h(dVar5, d0Var4, aVar10, dVar, str, pVar3, 9), o0VarE), null, false, false, null, aVar, o0Var, ((i16 << 6) & 3670016) | 48, 60);
                        pVar2 = pVar3;
                        dVar4 = dVar5;
                        aVar7 = aVar10;
                        aVar8 = aVar11;
                        aVar6 = aVar12;
                        d0Var3 = d0Var4;
                    } else {
                        o0Var = o0VarE;
                        o0Var.e();
                        aVar6 = aVar4;
                        dVar4 = dVar3;
                        d0Var3 = d0Var2;
                        aVar7 = aVar5;
                        aVar8 = aVar3;
                        pVar2 = pVar;
                    }
                    p2VarI0 = o0Var.i0();
                    if (p2VarI0 != null) {
                        p2VarI0.f135219d = new h02.c(str, dVar, dVar4, d0Var3, aVar, aVar7, aVar8, aVar6, pVar2, i14, i15);
                    }
                }
                i16 |= 100663296;
                if ((i16 & 38347923) != 38347922) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (o0VarE.n(i16 & 1, z14)) {
                    strJ = null;
                    if (i35 != 0) {
                        dVar3 = null;
                    }
                    if (i17 != 0) {
                        d0Var4 = null;
                    } else {
                        d0Var4 = d0Var2;
                    }
                    aVar9 = m.f135153a;
                    if (i19 != 0) {
                        objQ2 = o0VarE.q();
                        aVar9.getClass();
                        if (objQ2 == m.a.f135155b) {
                            objQ2 = new ik2.b(2);
                            o0VarE.K(objQ2);
                        }
                        aVar10 = (e23.a) objQ2;
                    } else {
                        aVar10 = aVar5;
                    }
                    if (i25 != 0) {
                        aVar11 = null;
                    } else {
                        aVar11 = aVar3;
                    }
                    if (i27 != 0) {
                        aVar12 = null;
                    } else {
                        aVar12 = aVar4;
                    }
                    if (i29 != 0) {
                        pVar3 = null;
                    } else {
                        pVar3 = pVar;
                    }
                    x1 x1Var6 = n.f135158a;
                    s62.a.f157643a.getClass();
                    bVar = t62.b.f162798a;
                    if (s.g(dVar3, k5.a(bVar))) {
                        strJ2 = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -1209585317, R.string.lbl_common_remove, o0VarE, false);
                    } else if (s.g(dVar3, s6.a(bVar))) {
                        strJ2 = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -1209583023, R.string.lbl_add, o0VarE, false);
                    } else {
                        o0VarE.C(1157679692);
                        o0VarE.g0(false);
                        strJ2 = null;
                    }
                    if (aVar11 != null) {
                        strJ3 = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -1209579695, R.string.move_up, o0VarE, false);
                    } else {
                        o0VarE.C(1157771948);
                        o0VarE.g0(false);
                        strJ3 = null;
                    }
                    if (aVar12 != null) {
                        strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -1209576781, R.string.move_down, o0VarE, false);
                    } else {
                        o0VarE.C(1157864204);
                        o0VarE.g0(false);
                    }
                    l72.p2 p2Var6 = l72.p2.f111205a;
                    r.a aVar18 = r.S;
                    if ((i16 & 896) == 256) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    boolean zB16 = z15 | o0VarE.B(strJ2);
                    if ((458752 & i16) == 131072) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    boolean zB17 = z16 | zB16 | o0VarE.B(strJ3);
                    if ((i16 & 3670016) == 1048576) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    boolean zB18 = zB17 | z17 | o0VarE.B(strJ);
                    if ((29360128 & i16) == 8388608) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    z19 = zB18 | z18;
                    objQ = o0VarE.q();
                    if (z19) {
                        aVar9.getClass();
                        if (objQ == m.a.f135155b) {
                            dVar5 = dVar3;
                            objQ = new l0(dVar5, strJ2, strJ3, strJ, aVar10, aVar11, aVar12, 7);
                            o0VarE.K(objQ);
                        } else {
                            dVar5 = dVar3;
                        }
                    } else {
                        dVar5 = dVar3;
                        objQ = new l0(dVar5, strJ2, strJ3, strJ, aVar10, aVar11, aVar12, 7);
                        o0VarE.K(objQ);
                    }
                    o0Var = o0VarE;
                    p2Var6.f(v.c((l) objQ, aVar18, true), z3.f.c(1985780585, new h(dVar5, d0Var4, aVar10, dVar, str, pVar3, 9), o0VarE), null, false, false, null, aVar, o0Var, ((i16 << 6) & 3670016) | 48, 60);
                    pVar2 = pVar3;
                    dVar4 = dVar5;
                    aVar7 = aVar10;
                    aVar8 = aVar11;
                    aVar6 = aVar12;
                    d0Var3 = d0Var4;
                } else {
                    o0Var = o0VarE;
                    o0Var.e();
                    aVar6 = aVar4;
                    dVar4 = dVar3;
                    d0Var3 = d0Var2;
                    aVar7 = aVar5;
                    aVar8 = aVar3;
                    pVar2 = pVar;
                }
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new h02.c(str, dVar, dVar4, d0Var3, aVar, aVar7, aVar8, aVar6, pVar2, i14, i15);
                }
            }
            i16 |= 196608;
            aVar5 = aVar2;
            i25 = i15 & 64;
            if (i25 != 0) {
                i16 |= 1572864;
            } else if ((i14 & 1572864) == 0) {
                if (o0VarE.r(aVar3)) {
                    i26 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                } else {
                    i26 = 524288;
                }
                i16 |= i26;
            }
            i27 = i15 & 128;
            if (i27 != 0) {
                i16 |= 12582912;
            } else if ((i14 & 12582912) == 0) {
                if (o0VarE.r(aVar4)) {
                    i28 = 8388608;
                } else {
                    i28 = 4194304;
                }
                i16 |= i28;
            }
            i29 = i15 & 256;
            if (i29 != 0) {
                if ((i14 & 100663296) == 0) {
                    if (o0VarE.r(pVar)) {
                        i30 = 67108864;
                    } else {
                        i30 = 33554432;
                    }
                    i16 |= i30;
                }
                if ((i16 & 38347923) != 38347922) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (o0VarE.n(i16 & 1, z14)) {
                    strJ = null;
                    if (i35 != 0) {
                        dVar3 = null;
                    }
                    if (i17 != 0) {
                        d0Var4 = null;
                    } else {
                        d0Var4 = d0Var2;
                    }
                    aVar9 = m.f135153a;
                    if (i19 != 0) {
                        objQ2 = o0VarE.q();
                        aVar9.getClass();
                        if (objQ2 == m.a.f135155b) {
                            objQ2 = new ik2.b(2);
                            o0VarE.K(objQ2);
                        }
                        aVar10 = (e23.a) objQ2;
                    } else {
                        aVar10 = aVar5;
                    }
                    if (i25 != 0) {
                        aVar11 = null;
                    } else {
                        aVar11 = aVar3;
                    }
                    if (i27 != 0) {
                        aVar12 = null;
                    } else {
                        aVar12 = aVar4;
                    }
                    if (i29 != 0) {
                        pVar3 = null;
                    } else {
                        pVar3 = pVar;
                    }
                    x1 x1Var7 = n.f135158a;
                    s62.a.f157643a.getClass();
                    bVar = t62.b.f162798a;
                    if (s.g(dVar3, k5.a(bVar))) {
                        strJ2 = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -1209585317, R.string.lbl_common_remove, o0VarE, false);
                    } else if (s.g(dVar3, s6.a(bVar))) {
                        strJ2 = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -1209583023, R.string.lbl_add, o0VarE, false);
                    } else {
                        o0VarE.C(1157679692);
                        o0VarE.g0(false);
                        strJ2 = null;
                    }
                    if (aVar11 != null) {
                        strJ3 = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -1209579695, R.string.move_up, o0VarE, false);
                    } else {
                        o0VarE.C(1157771948);
                        o0VarE.g0(false);
                        strJ3 = null;
                    }
                    if (aVar12 != null) {
                        strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -1209576781, R.string.move_down, o0VarE, false);
                    } else {
                        o0VarE.C(1157864204);
                        o0VarE.g0(false);
                    }
                    l72.p2 p2Var7 = l72.p2.f111205a;
                    r.a aVar19 = r.S;
                    if ((i16 & 896) == 256) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    boolean zB19 = z15 | o0VarE.B(strJ2);
                    if ((458752 & i16) == 131072) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    boolean zB110 = z16 | zB19 | o0VarE.B(strJ3);
                    if ((i16 & 3670016) == 1048576) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    boolean zB111 = zB110 | z17 | o0VarE.B(strJ);
                    if ((29360128 & i16) == 8388608) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    z19 = zB111 | z18;
                    objQ = o0VarE.q();
                    if (z19) {
                        aVar9.getClass();
                        if (objQ == m.a.f135155b) {
                            dVar5 = dVar3;
                            objQ = new l0(dVar5, strJ2, strJ3, strJ, aVar10, aVar11, aVar12, 7);
                            o0VarE.K(objQ);
                        } else {
                            dVar5 = dVar3;
                        }
                    } else {
                        dVar5 = dVar3;
                        objQ = new l0(dVar5, strJ2, strJ3, strJ, aVar10, aVar11, aVar12, 7);
                        o0VarE.K(objQ);
                    }
                    o0Var = o0VarE;
                    p2Var7.f(v.c((l) objQ, aVar19, true), z3.f.c(1985780585, new h(dVar5, d0Var4, aVar10, dVar, str, pVar3, 9), o0VarE), null, false, false, null, aVar, o0Var, ((i16 << 6) & 3670016) | 48, 60);
                    pVar2 = pVar3;
                    dVar4 = dVar5;
                    aVar7 = aVar10;
                    aVar8 = aVar11;
                    aVar6 = aVar12;
                    d0Var3 = d0Var4;
                } else {
                    o0Var = o0VarE;
                    o0Var.e();
                    aVar6 = aVar4;
                    dVar4 = dVar3;
                    d0Var3 = d0Var2;
                    aVar7 = aVar5;
                    aVar8 = aVar3;
                    pVar2 = pVar;
                }
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new h02.c(str, dVar, dVar4, d0Var3, aVar, aVar7, aVar8, aVar6, pVar2, i14, i15);
                }
            }
            i16 |= 100663296;
            if ((i16 & 38347923) != 38347922) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i16 & 1, z14)) {
                strJ = null;
                if (i35 != 0) {
                    dVar3 = null;
                }
                if (i17 != 0) {
                    d0Var4 = null;
                } else {
                    d0Var4 = d0Var2;
                }
                aVar9 = m.f135153a;
                if (i19 != 0) {
                    objQ2 = o0VarE.q();
                    aVar9.getClass();
                    if (objQ2 == m.a.f135155b) {
                        objQ2 = new ik2.b(2);
                        o0VarE.K(objQ2);
                    }
                    aVar10 = (e23.a) objQ2;
                } else {
                    aVar10 = aVar5;
                }
                if (i25 != 0) {
                    aVar11 = null;
                } else {
                    aVar11 = aVar3;
                }
                if (i27 != 0) {
                    aVar12 = null;
                } else {
                    aVar12 = aVar4;
                }
                if (i29 != 0) {
                    pVar3 = null;
                } else {
                    pVar3 = pVar;
                }
                x1 x1Var8 = n.f135158a;
                s62.a.f157643a.getClass();
                bVar = t62.b.f162798a;
                if (s.g(dVar3, k5.a(bVar))) {
                    strJ2 = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -1209585317, R.string.lbl_common_remove, o0VarE, false);
                } else if (s.g(dVar3, s6.a(bVar))) {
                    strJ2 = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -1209583023, R.string.lbl_add, o0VarE, false);
                } else {
                    o0VarE.C(1157679692);
                    o0VarE.g0(false);
                    strJ2 = null;
                }
                if (aVar11 != null) {
                    strJ3 = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -1209579695, R.string.move_up, o0VarE, false);
                } else {
                    o0VarE.C(1157771948);
                    o0VarE.g0(false);
                    strJ3 = null;
                }
                if (aVar12 != null) {
                    strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -1209576781, R.string.move_down, o0VarE, false);
                } else {
                    o0VarE.C(1157864204);
                    o0VarE.g0(false);
                }
                l72.p2 p2Var8 = l72.p2.f111205a;
                r.a aVar110 = r.S;
                if ((i16 & 896) == 256) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                boolean zB112 = z15 | o0VarE.B(strJ2);
                if ((458752 & i16) == 131072) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                boolean zB113 = z16 | zB112 | o0VarE.B(strJ3);
                if ((i16 & 3670016) == 1048576) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                boolean zB114 = zB113 | z17 | o0VarE.B(strJ);
                if ((29360128 & i16) == 8388608) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                z19 = zB114 | z18;
                objQ = o0VarE.q();
                if (z19) {
                    aVar9.getClass();
                    if (objQ == m.a.f135155b) {
                        dVar5 = dVar3;
                        objQ = new l0(dVar5, strJ2, strJ3, strJ, aVar10, aVar11, aVar12, 7);
                        o0VarE.K(objQ);
                    } else {
                        dVar5 = dVar3;
                    }
                } else {
                    dVar5 = dVar3;
                    objQ = new l0(dVar5, strJ2, strJ3, strJ, aVar10, aVar11, aVar12, 7);
                    o0VarE.K(objQ);
                }
                o0Var = o0VarE;
                p2Var8.f(v.c((l) objQ, aVar110, true), z3.f.c(1985780585, new h(dVar5, d0Var4, aVar10, dVar, str, pVar3, 9), o0VarE), null, false, false, null, aVar, o0Var, ((i16 << 6) & 3670016) | 48, 60);
                pVar2 = pVar3;
                dVar4 = dVar5;
                aVar7 = aVar10;
                aVar8 = aVar11;
                aVar6 = aVar12;
                d0Var3 = d0Var4;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                aVar6 = aVar4;
                dVar4 = dVar3;
                d0Var3 = d0Var2;
                aVar7 = aVar5;
                aVar8 = aVar3;
                pVar2 = pVar;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new h02.c(str, dVar, dVar4, d0Var3, aVar, aVar7, aVar8, aVar6, pVar2, i14, i15);
            }
        }
        i16 |= 384;
        dVar3 = dVar2;
        i17 = i15 & 8;
        if (i17 != 0) {
            if ((i14 & 3072) == 0) {
                d0Var2 = d0Var;
                if (o0VarE.B(d0Var2)) {
                    i18 = 2048;
                } else {
                    i18 = 1024;
                }
                i16 |= i18;
            }
            if ((i14 & 24576) != 0) {
                if (o0VarE.r(aVar)) {
                    i34 = 16384;
                } else {
                    i34 = 8192;
                }
                i16 |= i34;
            }
            i19 = i15 & 32;
            if (i19 != 0) {
                if ((196608 & i14) == 0) {
                    aVar5 = aVar2;
                    if (o0VarE.r(aVar5)) {
                        i24 = 131072;
                    } else {
                        i24 = 65536;
                    }
                    i16 |= i24;
                }
                i25 = i15 & 64;
                if (i25 != 0) {
                    i16 |= 1572864;
                } else if ((i14 & 1572864) == 0) {
                    if (o0VarE.r(aVar3)) {
                        i26 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    } else {
                        i26 = 524288;
                    }
                    i16 |= i26;
                }
                i27 = i15 & 128;
                if (i27 != 0) {
                    i16 |= 12582912;
                } else if ((i14 & 12582912) == 0) {
                    if (o0VarE.r(aVar4)) {
                        i28 = 8388608;
                    } else {
                        i28 = 4194304;
                    }
                    i16 |= i28;
                }
                i29 = i15 & 256;
                if (i29 != 0) {
                    if ((i14 & 100663296) == 0) {
                        if (o0VarE.r(pVar)) {
                            i30 = 67108864;
                        } else {
                            i30 = 33554432;
                        }
                        i16 |= i30;
                    }
                    if ((i16 & 38347923) != 38347922) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (o0VarE.n(i16 & 1, z14)) {
                        strJ = null;
                        if (i35 != 0) {
                            dVar3 = null;
                        }
                        if (i17 != 0) {
                            d0Var4 = null;
                        } else {
                            d0Var4 = d0Var2;
                        }
                        aVar9 = m.f135153a;
                        if (i19 != 0) {
                            objQ2 = o0VarE.q();
                            aVar9.getClass();
                            if (objQ2 == m.a.f135155b) {
                                objQ2 = new ik2.b(2);
                                o0VarE.K(objQ2);
                            }
                            aVar10 = (e23.a) objQ2;
                        } else {
                            aVar10 = aVar5;
                        }
                        if (i25 != 0) {
                            aVar11 = null;
                        } else {
                            aVar11 = aVar3;
                        }
                        if (i27 != 0) {
                            aVar12 = null;
                        } else {
                            aVar12 = aVar4;
                        }
                        if (i29 != 0) {
                            pVar3 = null;
                        } else {
                            pVar3 = pVar;
                        }
                        x1 x1Var9 = n.f135158a;
                        s62.a.f157643a.getClass();
                        bVar = t62.b.f162798a;
                        if (s.g(dVar3, k5.a(bVar))) {
                            strJ2 = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -1209585317, R.string.lbl_common_remove, o0VarE, false);
                        } else if (s.g(dVar3, s6.a(bVar))) {
                            strJ2 = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -1209583023, R.string.lbl_add, o0VarE, false);
                        } else {
                            o0VarE.C(1157679692);
                            o0VarE.g0(false);
                            strJ2 = null;
                        }
                        if (aVar11 != null) {
                            strJ3 = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -1209579695, R.string.move_up, o0VarE, false);
                        } else {
                            o0VarE.C(1157771948);
                            o0VarE.g0(false);
                            strJ3 = null;
                        }
                        if (aVar12 != null) {
                            strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -1209576781, R.string.move_down, o0VarE, false);
                        } else {
                            o0VarE.C(1157864204);
                            o0VarE.g0(false);
                        }
                        l72.p2 p2Var9 = l72.p2.f111205a;
                        r.a aVar111 = r.S;
                        if ((i16 & 896) == 256) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        boolean zB115 = z15 | o0VarE.B(strJ2);
                        if ((458752 & i16) == 131072) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        boolean zB116 = z16 | zB115 | o0VarE.B(strJ3);
                        if ((i16 & 3670016) == 1048576) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        boolean zB117 = zB116 | z17 | o0VarE.B(strJ);
                        if ((29360128 & i16) == 8388608) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        z19 = zB117 | z18;
                        objQ = o0VarE.q();
                        if (z19) {
                            aVar9.getClass();
                            if (objQ == m.a.f135155b) {
                                dVar5 = dVar3;
                                objQ = new l0(dVar5, strJ2, strJ3, strJ, aVar10, aVar11, aVar12, 7);
                                o0VarE.K(objQ);
                            } else {
                                dVar5 = dVar3;
                            }
                        } else {
                            dVar5 = dVar3;
                            objQ = new l0(dVar5, strJ2, strJ3, strJ, aVar10, aVar11, aVar12, 7);
                            o0VarE.K(objQ);
                        }
                        o0Var = o0VarE;
                        p2Var9.f(v.c((l) objQ, aVar111, true), z3.f.c(1985780585, new h(dVar5, d0Var4, aVar10, dVar, str, pVar3, 9), o0VarE), null, false, false, null, aVar, o0Var, ((i16 << 6) & 3670016) | 48, 60);
                        pVar2 = pVar3;
                        dVar4 = dVar5;
                        aVar7 = aVar10;
                        aVar8 = aVar11;
                        aVar6 = aVar12;
                        d0Var3 = d0Var4;
                    } else {
                        o0Var = o0VarE;
                        o0Var.e();
                        aVar6 = aVar4;
                        dVar4 = dVar3;
                        d0Var3 = d0Var2;
                        aVar7 = aVar5;
                        aVar8 = aVar3;
                        pVar2 = pVar;
                    }
                    p2VarI0 = o0Var.i0();
                    if (p2VarI0 != null) {
                        p2VarI0.f135219d = new h02.c(str, dVar, dVar4, d0Var3, aVar, aVar7, aVar8, aVar6, pVar2, i14, i15);
                    }
                }
                i16 |= 100663296;
                if ((i16 & 38347923) != 38347922) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (o0VarE.n(i16 & 1, z14)) {
                    strJ = null;
                    if (i35 != 0) {
                        dVar3 = null;
                    }
                    if (i17 != 0) {
                        d0Var4 = null;
                    } else {
                        d0Var4 = d0Var2;
                    }
                    aVar9 = m.f135153a;
                    if (i19 != 0) {
                        objQ2 = o0VarE.q();
                        aVar9.getClass();
                        if (objQ2 == m.a.f135155b) {
                            objQ2 = new ik2.b(2);
                            o0VarE.K(objQ2);
                        }
                        aVar10 = (e23.a) objQ2;
                    } else {
                        aVar10 = aVar5;
                    }
                    if (i25 != 0) {
                        aVar11 = null;
                    } else {
                        aVar11 = aVar3;
                    }
                    if (i27 != 0) {
                        aVar12 = null;
                    } else {
                        aVar12 = aVar4;
                    }
                    if (i29 != 0) {
                        pVar3 = null;
                    } else {
                        pVar3 = pVar;
                    }
                    x1 x1Var10 = n.f135158a;
                    s62.a.f157643a.getClass();
                    bVar = t62.b.f162798a;
                    if (s.g(dVar3, k5.a(bVar))) {
                        strJ2 = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -1209585317, R.string.lbl_common_remove, o0VarE, false);
                    } else if (s.g(dVar3, s6.a(bVar))) {
                        strJ2 = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -1209583023, R.string.lbl_add, o0VarE, false);
                    } else {
                        o0VarE.C(1157679692);
                        o0VarE.g0(false);
                        strJ2 = null;
                    }
                    if (aVar11 != null) {
                        strJ3 = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -1209579695, R.string.move_up, o0VarE, false);
                    } else {
                        o0VarE.C(1157771948);
                        o0VarE.g0(false);
                        strJ3 = null;
                    }
                    if (aVar12 != null) {
                        strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -1209576781, R.string.move_down, o0VarE, false);
                    } else {
                        o0VarE.C(1157864204);
                        o0VarE.g0(false);
                    }
                    l72.p2 p2Var10 = l72.p2.f111205a;
                    r.a aVar112 = r.S;
                    if ((i16 & 896) == 256) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    boolean zB118 = z15 | o0VarE.B(strJ2);
                    if ((458752 & i16) == 131072) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    boolean zB119 = z16 | zB118 | o0VarE.B(strJ3);
                    if ((i16 & 3670016) == 1048576) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    boolean zB1110 = zB119 | z17 | o0VarE.B(strJ);
                    if ((29360128 & i16) == 8388608) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    z19 = zB1110 | z18;
                    objQ = o0VarE.q();
                    if (z19) {
                        aVar9.getClass();
                        if (objQ == m.a.f135155b) {
                            dVar5 = dVar3;
                            objQ = new l0(dVar5, strJ2, strJ3, strJ, aVar10, aVar11, aVar12, 7);
                            o0VarE.K(objQ);
                        } else {
                            dVar5 = dVar3;
                        }
                    } else {
                        dVar5 = dVar3;
                        objQ = new l0(dVar5, strJ2, strJ3, strJ, aVar10, aVar11, aVar12, 7);
                        o0VarE.K(objQ);
                    }
                    o0Var = o0VarE;
                    p2Var10.f(v.c((l) objQ, aVar112, true), z3.f.c(1985780585, new h(dVar5, d0Var4, aVar10, dVar, str, pVar3, 9), o0VarE), null, false, false, null, aVar, o0Var, ((i16 << 6) & 3670016) | 48, 60);
                    pVar2 = pVar3;
                    dVar4 = dVar5;
                    aVar7 = aVar10;
                    aVar8 = aVar11;
                    aVar6 = aVar12;
                    d0Var3 = d0Var4;
                } else {
                    o0Var = o0VarE;
                    o0Var.e();
                    aVar6 = aVar4;
                    dVar4 = dVar3;
                    d0Var3 = d0Var2;
                    aVar7 = aVar5;
                    aVar8 = aVar3;
                    pVar2 = pVar;
                }
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new h02.c(str, dVar, dVar4, d0Var3, aVar, aVar7, aVar8, aVar6, pVar2, i14, i15);
                }
            }
            i16 |= 196608;
            aVar5 = aVar2;
            i25 = i15 & 64;
            if (i25 != 0) {
                i16 |= 1572864;
            } else if ((i14 & 1572864) == 0) {
                if (o0VarE.r(aVar3)) {
                    i26 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                } else {
                    i26 = 524288;
                }
                i16 |= i26;
            }
            i27 = i15 & 128;
            if (i27 != 0) {
                i16 |= 12582912;
            } else if ((i14 & 12582912) == 0) {
                if (o0VarE.r(aVar4)) {
                    i28 = 8388608;
                } else {
                    i28 = 4194304;
                }
                i16 |= i28;
            }
            i29 = i15 & 256;
            if (i29 != 0) {
                if ((i14 & 100663296) == 0) {
                    if (o0VarE.r(pVar)) {
                        i30 = 67108864;
                    } else {
                        i30 = 33554432;
                    }
                    i16 |= i30;
                }
                if ((i16 & 38347923) != 38347922) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (o0VarE.n(i16 & 1, z14)) {
                    strJ = null;
                    if (i35 != 0) {
                        dVar3 = null;
                    }
                    if (i17 != 0) {
                        d0Var4 = null;
                    } else {
                        d0Var4 = d0Var2;
                    }
                    aVar9 = m.f135153a;
                    if (i19 != 0) {
                        objQ2 = o0VarE.q();
                        aVar9.getClass();
                        if (objQ2 == m.a.f135155b) {
                            objQ2 = new ik2.b(2);
                            o0VarE.K(objQ2);
                        }
                        aVar10 = (e23.a) objQ2;
                    } else {
                        aVar10 = aVar5;
                    }
                    if (i25 != 0) {
                        aVar11 = null;
                    } else {
                        aVar11 = aVar3;
                    }
                    if (i27 != 0) {
                        aVar12 = null;
                    } else {
                        aVar12 = aVar4;
                    }
                    if (i29 != 0) {
                        pVar3 = null;
                    } else {
                        pVar3 = pVar;
                    }
                    x1 x1Var11 = n.f135158a;
                    s62.a.f157643a.getClass();
                    bVar = t62.b.f162798a;
                    if (s.g(dVar3, k5.a(bVar))) {
                        strJ2 = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -1209585317, R.string.lbl_common_remove, o0VarE, false);
                    } else if (s.g(dVar3, s6.a(bVar))) {
                        strJ2 = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -1209583023, R.string.lbl_add, o0VarE, false);
                    } else {
                        o0VarE.C(1157679692);
                        o0VarE.g0(false);
                        strJ2 = null;
                    }
                    if (aVar11 != null) {
                        strJ3 = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -1209579695, R.string.move_up, o0VarE, false);
                    } else {
                        o0VarE.C(1157771948);
                        o0VarE.g0(false);
                        strJ3 = null;
                    }
                    if (aVar12 != null) {
                        strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -1209576781, R.string.move_down, o0VarE, false);
                    } else {
                        o0VarE.C(1157864204);
                        o0VarE.g0(false);
                    }
                    l72.p2 p2Var11 = l72.p2.f111205a;
                    r.a aVar113 = r.S;
                    if ((i16 & 896) == 256) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    boolean zB1111 = z15 | o0VarE.B(strJ2);
                    if ((458752 & i16) == 131072) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    boolean zB1112 = z16 | zB1111 | o0VarE.B(strJ3);
                    if ((i16 & 3670016) == 1048576) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    boolean zB1113 = zB1112 | z17 | o0VarE.B(strJ);
                    if ((29360128 & i16) == 8388608) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    z19 = zB1113 | z18;
                    objQ = o0VarE.q();
                    if (z19) {
                        aVar9.getClass();
                        if (objQ == m.a.f135155b) {
                            dVar5 = dVar3;
                            objQ = new l0(dVar5, strJ2, strJ3, strJ, aVar10, aVar11, aVar12, 7);
                            o0VarE.K(objQ);
                        } else {
                            dVar5 = dVar3;
                        }
                    } else {
                        dVar5 = dVar3;
                        objQ = new l0(dVar5, strJ2, strJ3, strJ, aVar10, aVar11, aVar12, 7);
                        o0VarE.K(objQ);
                    }
                    o0Var = o0VarE;
                    p2Var11.f(v.c((l) objQ, aVar113, true), z3.f.c(1985780585, new h(dVar5, d0Var4, aVar10, dVar, str, pVar3, 9), o0VarE), null, false, false, null, aVar, o0Var, ((i16 << 6) & 3670016) | 48, 60);
                    pVar2 = pVar3;
                    dVar4 = dVar5;
                    aVar7 = aVar10;
                    aVar8 = aVar11;
                    aVar6 = aVar12;
                    d0Var3 = d0Var4;
                } else {
                    o0Var = o0VarE;
                    o0Var.e();
                    aVar6 = aVar4;
                    dVar4 = dVar3;
                    d0Var3 = d0Var2;
                    aVar7 = aVar5;
                    aVar8 = aVar3;
                    pVar2 = pVar;
                }
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new h02.c(str, dVar, dVar4, d0Var3, aVar, aVar7, aVar8, aVar6, pVar2, i14, i15);
                }
            }
            i16 |= 100663296;
            if ((i16 & 38347923) != 38347922) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i16 & 1, z14)) {
                strJ = null;
                if (i35 != 0) {
                    dVar3 = null;
                }
                if (i17 != 0) {
                    d0Var4 = null;
                } else {
                    d0Var4 = d0Var2;
                }
                aVar9 = m.f135153a;
                if (i19 != 0) {
                    objQ2 = o0VarE.q();
                    aVar9.getClass();
                    if (objQ2 == m.a.f135155b) {
                        objQ2 = new ik2.b(2);
                        o0VarE.K(objQ2);
                    }
                    aVar10 = (e23.a) objQ2;
                } else {
                    aVar10 = aVar5;
                }
                if (i25 != 0) {
                    aVar11 = null;
                } else {
                    aVar11 = aVar3;
                }
                if (i27 != 0) {
                    aVar12 = null;
                } else {
                    aVar12 = aVar4;
                }
                if (i29 != 0) {
                    pVar3 = null;
                } else {
                    pVar3 = pVar;
                }
                x1 x1Var12 = n.f135158a;
                s62.a.f157643a.getClass();
                bVar = t62.b.f162798a;
                if (s.g(dVar3, k5.a(bVar))) {
                    strJ2 = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -1209585317, R.string.lbl_common_remove, o0VarE, false);
                } else if (s.g(dVar3, s6.a(bVar))) {
                    strJ2 = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -1209583023, R.string.lbl_add, o0VarE, false);
                } else {
                    o0VarE.C(1157679692);
                    o0VarE.g0(false);
                    strJ2 = null;
                }
                if (aVar11 != null) {
                    strJ3 = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -1209579695, R.string.move_up, o0VarE, false);
                } else {
                    o0VarE.C(1157771948);
                    o0VarE.g0(false);
                    strJ3 = null;
                }
                if (aVar12 != null) {
                    strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -1209576781, R.string.move_down, o0VarE, false);
                } else {
                    o0VarE.C(1157864204);
                    o0VarE.g0(false);
                }
                l72.p2 p2Var12 = l72.p2.f111205a;
                r.a aVar114 = r.S;
                if ((i16 & 896) == 256) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                boolean zB1114 = z15 | o0VarE.B(strJ2);
                if ((458752 & i16) == 131072) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                boolean zB1115 = z16 | zB1114 | o0VarE.B(strJ3);
                if ((i16 & 3670016) == 1048576) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                boolean zB1116 = zB1115 | z17 | o0VarE.B(strJ);
                if ((29360128 & i16) == 8388608) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                z19 = zB1116 | z18;
                objQ = o0VarE.q();
                if (z19) {
                    aVar9.getClass();
                    if (objQ == m.a.f135155b) {
                        dVar5 = dVar3;
                        objQ = new l0(dVar5, strJ2, strJ3, strJ, aVar10, aVar11, aVar12, 7);
                        o0VarE.K(objQ);
                    } else {
                        dVar5 = dVar3;
                    }
                } else {
                    dVar5 = dVar3;
                    objQ = new l0(dVar5, strJ2, strJ3, strJ, aVar10, aVar11, aVar12, 7);
                    o0VarE.K(objQ);
                }
                o0Var = o0VarE;
                p2Var12.f(v.c((l) objQ, aVar114, true), z3.f.c(1985780585, new h(dVar5, d0Var4, aVar10, dVar, str, pVar3, 9), o0VarE), null, false, false, null, aVar, o0Var, ((i16 << 6) & 3670016) | 48, 60);
                pVar2 = pVar3;
                dVar4 = dVar5;
                aVar7 = aVar10;
                aVar8 = aVar11;
                aVar6 = aVar12;
                d0Var3 = d0Var4;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                aVar6 = aVar4;
                dVar4 = dVar3;
                d0Var3 = d0Var2;
                aVar7 = aVar5;
                aVar8 = aVar3;
                pVar2 = pVar;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new h02.c(str, dVar, dVar4, d0Var3, aVar, aVar7, aVar8, aVar6, pVar2, i14, i15);
            }
        }
        i16 |= 3072;
        d0Var2 = d0Var;
        if ((i14 & 24576) != 0) {
            if (o0VarE.r(aVar)) {
                i34 = 16384;
            } else {
                i34 = 8192;
            }
            i16 |= i34;
        }
        i19 = i15 & 32;
        if (i19 != 0) {
            if ((196608 & i14) == 0) {
                aVar5 = aVar2;
                if (o0VarE.r(aVar5)) {
                    i24 = 131072;
                } else {
                    i24 = 65536;
                }
                i16 |= i24;
            }
            i25 = i15 & 64;
            if (i25 != 0) {
                i16 |= 1572864;
            } else if ((i14 & 1572864) == 0) {
                if (o0VarE.r(aVar3)) {
                    i26 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                } else {
                    i26 = 524288;
                }
                i16 |= i26;
            }
            i27 = i15 & 128;
            if (i27 != 0) {
                i16 |= 12582912;
            } else if ((i14 & 12582912) == 0) {
                if (o0VarE.r(aVar4)) {
                    i28 = 8388608;
                } else {
                    i28 = 4194304;
                }
                i16 |= i28;
            }
            i29 = i15 & 256;
            if (i29 != 0) {
                if ((i14 & 100663296) == 0) {
                    if (o0VarE.r(pVar)) {
                        i30 = 67108864;
                    } else {
                        i30 = 33554432;
                    }
                    i16 |= i30;
                }
                if ((i16 & 38347923) != 38347922) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (o0VarE.n(i16 & 1, z14)) {
                    strJ = null;
                    if (i35 != 0) {
                        dVar3 = null;
                    }
                    if (i17 != 0) {
                        d0Var4 = null;
                    } else {
                        d0Var4 = d0Var2;
                    }
                    aVar9 = m.f135153a;
                    if (i19 != 0) {
                        objQ2 = o0VarE.q();
                        aVar9.getClass();
                        if (objQ2 == m.a.f135155b) {
                            objQ2 = new ik2.b(2);
                            o0VarE.K(objQ2);
                        }
                        aVar10 = (e23.a) objQ2;
                    } else {
                        aVar10 = aVar5;
                    }
                    if (i25 != 0) {
                        aVar11 = null;
                    } else {
                        aVar11 = aVar3;
                    }
                    if (i27 != 0) {
                        aVar12 = null;
                    } else {
                        aVar12 = aVar4;
                    }
                    if (i29 != 0) {
                        pVar3 = null;
                    } else {
                        pVar3 = pVar;
                    }
                    x1 x1Var13 = n.f135158a;
                    s62.a.f157643a.getClass();
                    bVar = t62.b.f162798a;
                    if (s.g(dVar3, k5.a(bVar))) {
                        strJ2 = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -1209585317, R.string.lbl_common_remove, o0VarE, false);
                    } else if (s.g(dVar3, s6.a(bVar))) {
                        strJ2 = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -1209583023, R.string.lbl_add, o0VarE, false);
                    } else {
                        o0VarE.C(1157679692);
                        o0VarE.g0(false);
                        strJ2 = null;
                    }
                    if (aVar11 != null) {
                        strJ3 = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -1209579695, R.string.move_up, o0VarE, false);
                    } else {
                        o0VarE.C(1157771948);
                        o0VarE.g0(false);
                        strJ3 = null;
                    }
                    if (aVar12 != null) {
                        strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -1209576781, R.string.move_down, o0VarE, false);
                    } else {
                        o0VarE.C(1157864204);
                        o0VarE.g0(false);
                    }
                    l72.p2 p2Var13 = l72.p2.f111205a;
                    r.a aVar115 = r.S;
                    if ((i16 & 896) == 256) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    boolean zB1117 = z15 | o0VarE.B(strJ2);
                    if ((458752 & i16) == 131072) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    boolean zB1118 = z16 | zB1117 | o0VarE.B(strJ3);
                    if ((i16 & 3670016) == 1048576) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    boolean zB1119 = zB1118 | z17 | o0VarE.B(strJ);
                    if ((29360128 & i16) == 8388608) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    z19 = zB1119 | z18;
                    objQ = o0VarE.q();
                    if (z19) {
                        aVar9.getClass();
                        if (objQ == m.a.f135155b) {
                            dVar5 = dVar3;
                            objQ = new l0(dVar5, strJ2, strJ3, strJ, aVar10, aVar11, aVar12, 7);
                            o0VarE.K(objQ);
                        } else {
                            dVar5 = dVar3;
                        }
                    } else {
                        dVar5 = dVar3;
                        objQ = new l0(dVar5, strJ2, strJ3, strJ, aVar10, aVar11, aVar12, 7);
                        o0VarE.K(objQ);
                    }
                    o0Var = o0VarE;
                    p2Var13.f(v.c((l) objQ, aVar115, true), z3.f.c(1985780585, new h(dVar5, d0Var4, aVar10, dVar, str, pVar3, 9), o0VarE), null, false, false, null, aVar, o0Var, ((i16 << 6) & 3670016) | 48, 60);
                    pVar2 = pVar3;
                    dVar4 = dVar5;
                    aVar7 = aVar10;
                    aVar8 = aVar11;
                    aVar6 = aVar12;
                    d0Var3 = d0Var4;
                } else {
                    o0Var = o0VarE;
                    o0Var.e();
                    aVar6 = aVar4;
                    dVar4 = dVar3;
                    d0Var3 = d0Var2;
                    aVar7 = aVar5;
                    aVar8 = aVar3;
                    pVar2 = pVar;
                }
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new h02.c(str, dVar, dVar4, d0Var3, aVar, aVar7, aVar8, aVar6, pVar2, i14, i15);
                }
            }
            i16 |= 100663296;
            if ((i16 & 38347923) != 38347922) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i16 & 1, z14)) {
                strJ = null;
                if (i35 != 0) {
                    dVar3 = null;
                }
                if (i17 != 0) {
                    d0Var4 = null;
                } else {
                    d0Var4 = d0Var2;
                }
                aVar9 = m.f135153a;
                if (i19 != 0) {
                    objQ2 = o0VarE.q();
                    aVar9.getClass();
                    if (objQ2 == m.a.f135155b) {
                        objQ2 = new ik2.b(2);
                        o0VarE.K(objQ2);
                    }
                    aVar10 = (e23.a) objQ2;
                } else {
                    aVar10 = aVar5;
                }
                if (i25 != 0) {
                    aVar11 = null;
                } else {
                    aVar11 = aVar3;
                }
                if (i27 != 0) {
                    aVar12 = null;
                } else {
                    aVar12 = aVar4;
                }
                if (i29 != 0) {
                    pVar3 = null;
                } else {
                    pVar3 = pVar;
                }
                x1 x1Var14 = n.f135158a;
                s62.a.f157643a.getClass();
                bVar = t62.b.f162798a;
                if (s.g(dVar3, k5.a(bVar))) {
                    strJ2 = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -1209585317, R.string.lbl_common_remove, o0VarE, false);
                } else if (s.g(dVar3, s6.a(bVar))) {
                    strJ2 = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -1209583023, R.string.lbl_add, o0VarE, false);
                } else {
                    o0VarE.C(1157679692);
                    o0VarE.g0(false);
                    strJ2 = null;
                }
                if (aVar11 != null) {
                    strJ3 = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -1209579695, R.string.move_up, o0VarE, false);
                } else {
                    o0VarE.C(1157771948);
                    o0VarE.g0(false);
                    strJ3 = null;
                }
                if (aVar12 != null) {
                    strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -1209576781, R.string.move_down, o0VarE, false);
                } else {
                    o0VarE.C(1157864204);
                    o0VarE.g0(false);
                }
                l72.p2 p2Var14 = l72.p2.f111205a;
                r.a aVar116 = r.S;
                if ((i16 & 896) == 256) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                boolean zB11110 = z15 | o0VarE.B(strJ2);
                if ((458752 & i16) == 131072) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                boolean zB11111 = z16 | zB11110 | o0VarE.B(strJ3);
                if ((i16 & 3670016) == 1048576) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                boolean zB11112 = zB11111 | z17 | o0VarE.B(strJ);
                if ((29360128 & i16) == 8388608) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                z19 = zB11112 | z18;
                objQ = o0VarE.q();
                if (z19) {
                    aVar9.getClass();
                    if (objQ == m.a.f135155b) {
                        dVar5 = dVar3;
                        objQ = new l0(dVar5, strJ2, strJ3, strJ, aVar10, aVar11, aVar12, 7);
                        o0VarE.K(objQ);
                    } else {
                        dVar5 = dVar3;
                    }
                } else {
                    dVar5 = dVar3;
                    objQ = new l0(dVar5, strJ2, strJ3, strJ, aVar10, aVar11, aVar12, 7);
                    o0VarE.K(objQ);
                }
                o0Var = o0VarE;
                p2Var14.f(v.c((l) objQ, aVar116, true), z3.f.c(1985780585, new h(dVar5, d0Var4, aVar10, dVar, str, pVar3, 9), o0VarE), null, false, false, null, aVar, o0Var, ((i16 << 6) & 3670016) | 48, 60);
                pVar2 = pVar3;
                dVar4 = dVar5;
                aVar7 = aVar10;
                aVar8 = aVar11;
                aVar6 = aVar12;
                d0Var3 = d0Var4;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                aVar6 = aVar4;
                dVar4 = dVar3;
                d0Var3 = d0Var2;
                aVar7 = aVar5;
                aVar8 = aVar3;
                pVar2 = pVar;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new h02.c(str, dVar, dVar4, d0Var3, aVar, aVar7, aVar8, aVar6, pVar2, i14, i15);
            }
        }
        i16 |= 196608;
        aVar5 = aVar2;
        i25 = i15 & 64;
        if (i25 != 0) {
            i16 |= 1572864;
        } else if ((i14 & 1572864) == 0) {
            if (o0VarE.r(aVar3)) {
                i26 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
            } else {
                i26 = 524288;
            }
            i16 |= i26;
        }
        i27 = i15 & 128;
        if (i27 != 0) {
            i16 |= 12582912;
        } else if ((i14 & 12582912) == 0) {
            if (o0VarE.r(aVar4)) {
                i28 = 8388608;
            } else {
                i28 = 4194304;
            }
            i16 |= i28;
        }
        i29 = i15 & 256;
        if (i29 != 0) {
            if ((i14 & 100663296) == 0) {
                if (o0VarE.r(pVar)) {
                    i30 = 67108864;
                } else {
                    i30 = 33554432;
                }
                i16 |= i30;
            }
            if ((i16 & 38347923) != 38347922) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i16 & 1, z14)) {
                strJ = null;
                if (i35 != 0) {
                    dVar3 = null;
                }
                if (i17 != 0) {
                    d0Var4 = null;
                } else {
                    d0Var4 = d0Var2;
                }
                aVar9 = m.f135153a;
                if (i19 != 0) {
                    objQ2 = o0VarE.q();
                    aVar9.getClass();
                    if (objQ2 == m.a.f135155b) {
                        objQ2 = new ik2.b(2);
                        o0VarE.K(objQ2);
                    }
                    aVar10 = (e23.a) objQ2;
                } else {
                    aVar10 = aVar5;
                }
                if (i25 != 0) {
                    aVar11 = null;
                } else {
                    aVar11 = aVar3;
                }
                if (i27 != 0) {
                    aVar12 = null;
                } else {
                    aVar12 = aVar4;
                }
                if (i29 != 0) {
                    pVar3 = null;
                } else {
                    pVar3 = pVar;
                }
                x1 x1Var15 = n.f135158a;
                s62.a.f157643a.getClass();
                bVar = t62.b.f162798a;
                if (s.g(dVar3, k5.a(bVar))) {
                    strJ2 = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -1209585317, R.string.lbl_common_remove, o0VarE, false);
                } else if (s.g(dVar3, s6.a(bVar))) {
                    strJ2 = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -1209583023, R.string.lbl_add, o0VarE, false);
                } else {
                    o0VarE.C(1157679692);
                    o0VarE.g0(false);
                    strJ2 = null;
                }
                if (aVar11 != null) {
                    strJ3 = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -1209579695, R.string.move_up, o0VarE, false);
                } else {
                    o0VarE.C(1157771948);
                    o0VarE.g0(false);
                    strJ3 = null;
                }
                if (aVar12 != null) {
                    strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -1209576781, R.string.move_down, o0VarE, false);
                } else {
                    o0VarE.C(1157864204);
                    o0VarE.g0(false);
                }
                l72.p2 p2Var15 = l72.p2.f111205a;
                r.a aVar117 = r.S;
                if ((i16 & 896) == 256) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                boolean zB11113 = z15 | o0VarE.B(strJ2);
                if ((458752 & i16) == 131072) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                boolean zB11114 = z16 | zB11113 | o0VarE.B(strJ3);
                if ((i16 & 3670016) == 1048576) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                boolean zB11115 = zB11114 | z17 | o0VarE.B(strJ);
                if ((29360128 & i16) == 8388608) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                z19 = zB11115 | z18;
                objQ = o0VarE.q();
                if (z19) {
                    aVar9.getClass();
                    if (objQ == m.a.f135155b) {
                        dVar5 = dVar3;
                        objQ = new l0(dVar5, strJ2, strJ3, strJ, aVar10, aVar11, aVar12, 7);
                        o0VarE.K(objQ);
                    } else {
                        dVar5 = dVar3;
                    }
                } else {
                    dVar5 = dVar3;
                    objQ = new l0(dVar5, strJ2, strJ3, strJ, aVar10, aVar11, aVar12, 7);
                    o0VarE.K(objQ);
                }
                o0Var = o0VarE;
                p2Var15.f(v.c((l) objQ, aVar117, true), z3.f.c(1985780585, new h(dVar5, d0Var4, aVar10, dVar, str, pVar3, 9), o0VarE), null, false, false, null, aVar, o0Var, ((i16 << 6) & 3670016) | 48, 60);
                pVar2 = pVar3;
                dVar4 = dVar5;
                aVar7 = aVar10;
                aVar8 = aVar11;
                aVar6 = aVar12;
                d0Var3 = d0Var4;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                aVar6 = aVar4;
                dVar4 = dVar3;
                d0Var3 = d0Var2;
                aVar7 = aVar5;
                aVar8 = aVar3;
                pVar2 = pVar;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new h02.c(str, dVar, dVar4, d0Var3, aVar, aVar7, aVar8, aVar6, pVar2, i14, i15);
            }
        }
        i16 |= 100663296;
        if ((i16 & 38347923) != 38347922) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (o0VarE.n(i16 & 1, z14)) {
            strJ = null;
            if (i35 != 0) {
                dVar3 = null;
            }
            if (i17 != 0) {
                d0Var4 = null;
            } else {
                d0Var4 = d0Var2;
            }
            aVar9 = m.f135153a;
            if (i19 != 0) {
                objQ2 = o0VarE.q();
                aVar9.getClass();
                if (objQ2 == m.a.f135155b) {
                    objQ2 = new ik2.b(2);
                    o0VarE.K(objQ2);
                }
                aVar10 = (e23.a) objQ2;
            } else {
                aVar10 = aVar5;
            }
            if (i25 != 0) {
                aVar11 = null;
            } else {
                aVar11 = aVar3;
            }
            if (i27 != 0) {
                aVar12 = null;
            } else {
                aVar12 = aVar4;
            }
            if (i29 != 0) {
                pVar3 = null;
            } else {
                pVar3 = pVar;
            }
            x1 x1Var16 = n.f135158a;
            s62.a.f157643a.getClass();
            bVar = t62.b.f162798a;
            if (s.g(dVar3, k5.a(bVar))) {
                strJ2 = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -1209585317, R.string.lbl_common_remove, o0VarE, false);
            } else if (s.g(dVar3, s6.a(bVar))) {
                strJ2 = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -1209583023, R.string.lbl_add, o0VarE, false);
            } else {
                o0VarE.C(1157679692);
                o0VarE.g0(false);
                strJ2 = null;
            }
            if (aVar11 != null) {
                strJ3 = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -1209579695, R.string.move_up, o0VarE, false);
            } else {
                o0VarE.C(1157771948);
                o0VarE.g0(false);
                strJ3 = null;
            }
            if (aVar12 != null) {
                strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -1209576781, R.string.move_down, o0VarE, false);
            } else {
                o0VarE.C(1157864204);
                o0VarE.g0(false);
            }
            l72.p2 p2Var16 = l72.p2.f111205a;
            r.a aVar118 = r.S;
            if ((i16 & 896) == 256) {
                z15 = true;
            } else {
                z15 = false;
            }
            boolean zB11116 = z15 | o0VarE.B(strJ2);
            if ((458752 & i16) == 131072) {
                z16 = true;
            } else {
                z16 = false;
            }
            boolean zB11117 = z16 | zB11116 | o0VarE.B(strJ3);
            if ((i16 & 3670016) == 1048576) {
                z17 = true;
            } else {
                z17 = false;
            }
            boolean zB11118 = zB11117 | z17 | o0VarE.B(strJ);
            if ((29360128 & i16) == 8388608) {
                z18 = true;
            } else {
                z18 = false;
            }
            z19 = zB11118 | z18;
            objQ = o0VarE.q();
            if (z19) {
                aVar9.getClass();
                if (objQ == m.a.f135155b) {
                    dVar5 = dVar3;
                    objQ = new l0(dVar5, strJ2, strJ3, strJ, aVar10, aVar11, aVar12, 7);
                    o0VarE.K(objQ);
                } else {
                    dVar5 = dVar3;
                }
            } else {
                dVar5 = dVar3;
                objQ = new l0(dVar5, strJ2, strJ3, strJ, aVar10, aVar11, aVar12, 7);
                o0VarE.K(objQ);
            }
            o0Var = o0VarE;
            p2Var16.f(v.c((l) objQ, aVar118, true), z3.f.c(1985780585, new h(dVar5, d0Var4, aVar10, dVar, str, pVar3, 9), o0VarE), null, false, false, null, aVar, o0Var, ((i16 << 6) & 3670016) | 48, 60);
            pVar2 = pVar3;
            dVar4 = dVar5;
            aVar7 = aVar10;
            aVar8 = aVar11;
            aVar6 = aVar12;
            d0Var3 = d0Var4;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            aVar6 = aVar4;
            dVar4 = dVar3;
            d0Var3 = d0Var2;
            aVar7 = aVar5;
            aVar8 = aVar3;
            pVar2 = pVar;
        }
        p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new h02.c(str, dVar, dVar4, d0Var3, aVar, aVar7, aVar8, aVar6, pVar2, i14, i15);
        }
    }

    public static final void b(int i14, long j8, r rVar, m mVar, u4.d dVar) {
        long j14;
        long jD;
        int i15;
        o0 o0VarE = mVar.E(-940828711);
        int i16 = (o0VarE.B(rVar) ? 4 : 2) | i14 | (o0VarE.B(dVar) ? 32 : 16) | 1408;
        if (o0VarE.n(i16 & 1, (i16 & 1171) != 1170)) {
            o0VarE.G0();
            if ((i14 & 1) == 0 || o0VarE.o0()) {
                jD = hb.a.d(d92.b.f58623a, o0VarE);
                i15 = i16 & (-7169);
            } else {
                o0VarE.e();
                i15 = i16 & (-7169);
                jD = j8;
            }
            o0VarE.h0();
            x1 x1Var = n.f135158a;
            g6.f.a aVar = g6.f.f75994b;
            i7.b(dVar, null, x2.q(rVar, 32), jD, o0VarE, (i15 >> 3) & 126, 0);
            j14 = jD;
        } else {
            o0VarE.e();
            j14 = j8;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a3.l0(rVar, dVar, j14, i14, 8);
        }
    }
}
