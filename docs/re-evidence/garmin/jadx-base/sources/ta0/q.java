package ta0;

import b21.o9;
import c2.x2;
import ca0.o1;
import ca0.t1;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import i3.mh;
import kotlin.o3;
import p005kotlin.Unit;
import p3.p1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final class q {
    /* JADX WARN: Code duplicated, block: B:40:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:53:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:83:0x019f  */
    /* JADX WARN: Code duplicated, block: B:90:0x01c5  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(x xVar, l90.k kVar, t1 t1Var, e23.a aVar, e23.l lVar, e23.l lVar2, e23.l lVar3, p3.m mVar, int i14) {
        p3.o0 o0Var;
        Object pVar;
        int i15;
        boolean z14;
        String strP;
        int i16;
        int i17;
        xVar.getClass();
        kVar.getClass();
        boolean z15 = kVar.f111579c;
        l90.b bVar = kVar.f111582f;
        aVar.getClass();
        lVar.getClass();
        lVar2.getClass();
        lVar3.getClass();
        p3.o0 o0VarE = mVar.E(26929638);
        int i18 = i14 | (o0VarE.r(xVar) ? 4 : 2) | (o0VarE.r(kVar) ? 32 : 16) | (o0VarE.r(t1Var) ? 256 : 128) | (o0VarE.r(aVar) ? 2048 : 1024) | (o0VarE.r(lVar) ? 16384 : 8192) | (o0VarE.r(lVar2) ? 131072 : 65536) | (o0VarE.r(lVar3) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        if (o0VarE.n(i18 & 1, (i18 & 599187) != 599186)) {
            x1 x1Var = p3.n.f135158a;
            p1 p1VarC = s9.c.c(xVar.f163478x, o0VarE);
            boolean zR = o0VarE.r(xVar);
            Object objQ = o0VarE.q();
            p3.m.a aVar2 = p3.m.f135153a;
            if (zR) {
                objQ = new c(xVar, 1);
                o0VarE.K(objQ);
            } else {
                aVar2.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new c(xVar, 1);
                    o0VarE.K(objQ);
                }
            }
            c.w.a(0, 1, (e23.a) objQ, o0VarE, false);
            p1 p1VarC2 = s9.c.c(xVar.f163465i, o0VarE);
            l90.k kVar2 = (l90.k) p1VarC2.getF182175a();
            boolean zB = o0VarE.B(p1VarC2) | o0VarE.r(kVar) | ((i18 & 57344) == 16384) | ((i18 & 7168) == 2048);
            Object objQ2 = o0VarE.q();
            if (zB) {
                i15 = i18;
                z14 = false;
                pVar = new p(p1VarC2, kVar, lVar, aVar, null);
                o0VarE.K(pVar);
            } else {
                aVar2.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    i15 = i18;
                    z14 = false;
                    pVar = new p(p1VarC2, kVar, lVar, aVar, null);
                    o0VarE.K(pVar);
                } else {
                    i15 = i18;
                    pVar = objQ2;
                    z14 = false;
                }
            }
            p3.l0.e((e23.p) pVar, kVar2, o0VarE);
            String str = bVar.f111521f;
            d90.d dVar = bVar.f111531p;
            boolean z16 = (z15 || dVar.f58436b == null) ? z14 : true;
            long j8 = kVar.f111577a;
            boolean zBooleanValue = ((Boolean) p1VarC.getF182175a()).booleanValue();
            o90.a aVar3 = bVar.f111526k;
            if (z15) {
                o0VarE.C(-896428800);
                o0VarE.g0(z14);
                strP = null;
            } else {
                o0VarE.C(-896546135);
                strP = gl1.y.P(R.string.smart_troubleshooting_found_device_not_in_pairing_mode, new Object[]{str}, o0VarE);
                o0VarE.g0(z14);
            }
            String str2 = strP;
            String str3 = dVar.f58437c.f58419h.f58450b;
            if (z16) {
                i16 = -896265988;
                i17 = R.string.lbl_how_to_pair;
            } else {
                i16 = -896196703;
                i17 = R.string.connect_it;
            }
            String strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, i16, i17, o0VarE, z14);
            boolean zR2 = o0VarE.r(xVar) | o0VarE.h(z16) | ((458752 & i15) == 131072 ? true : z14) | o0VarE.r(kVar);
            if ((i15 & 896) == 256) {
                z14 = true;
            }
            boolean z17 = zR2 | z14;
            Object objQ3 = o0VarE.q();
            if (z17) {
                o9 o9Var = new o9(xVar, z16, lVar2, kVar, t1Var);
                o0VarE.K(o9Var);
                objQ3 = o9Var;
            } else {
                aVar2.getClass();
                if (objQ3 == p3.m.a.f135155b) {
                    o9 o9Var2 = new o9(xVar, z16, lVar2, kVar, t1Var);
                    o0VarE.K(o9Var2);
                    objQ3 = o9Var2;
                }
            }
            e23.a aVar4 = (e23.a) objQ3;
            boolean zR3 = o0VarE.r(xVar);
            Object objQ4 = o0VarE.q();
            if (zR3) {
                objQ4 = new c(xVar, 2);
                o0VarE.K(objQ4);
            } else {
                aVar2.getClass();
                if (objQ4 == p3.m.a.f135155b) {
                    objQ4 = new c(xVar, 2);
                    o0VarE.K(objQ4);
                }
            }
            o0Var = o0VarE;
            c("device_discovery_device_confirm_screen", j8, zBooleanValue, str, aVar3, null, str2, str3, strJ, aVar4, null, (e23.a) objQ4, null, null, lVar3, o0Var, 6, (i15 >> 6) & 57344, 13344);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new r11.k(xVar, kVar, t1Var, aVar, lVar, lVar2, lVar3, i14, 10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:53:0x010e  */
    /* JADX WARN: Code duplicated, block: B:62:0x013d  */
    /* JADX WARN: Code duplicated, block: B:71:0x016d  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(x xVar, o1 o1Var, l90.k kVar, e23.l lVar, e23.l lVar2, ca0.u0 u0Var, e23.l lVar3, p3.m mVar, int i14) {
        p3.o0 o0Var;
        String strJ;
        xVar.getClass();
        o1Var.getClass();
        kVar.getClass();
        l90.b bVar = kVar.f111582f;
        lVar.getClass();
        lVar2.getClass();
        lVar3.getClass();
        p3.o0 o0VarE = mVar.E(391706156);
        int i15 = i14 | (o0VarE.r(xVar) ? 4 : 2) | (o0VarE.k(o1Var.ordinal()) ? 32 : 16) | (o0VarE.r(kVar) ? 256 : 128) | (o0VarE.r(lVar) ? 2048 : 1024) | (o0VarE.r(lVar2) ? 16384 : 8192) | (o0VarE.r(u0Var) ? 131072 : 65536) | (o0VarE.r(lVar3) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        if (o0VarE.n(i15 & 1, (599187 & i15) != 599186)) {
            x1 x1Var = p3.n.f135158a;
            p1 p1VarC = s9.c.c(xVar.f163478x, o0VarE);
            boolean z14 = o1Var == o1.SIGN_IN;
            long j8 = kVar.f111577a;
            boolean zBooleanValue = ((Boolean) p1VarC.getF182175a()).booleanValue();
            boolean z15 = z14;
            String str = bVar.f111521f;
            o90.a aVar = bVar.f111526k;
            String strQ = gl1.y.Q(o0VarE, R.string.lbl_ready_to_connect);
            d90.e eVar = bVar.f111531p.f58437c.f58416e;
            String str2 = eVar.f58449a;
            String str3 = eVar.f58450b;
            if (z15) {
                strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -1527469900, R.string.lbl_skip_button, o0VarE, false);
            } else {
                o0VarE.C(-106882127);
                o0VarE.g0(false);
                strJ = null;
            }
            String str4 = strJ;
            boolean zR = o0VarE.r(xVar) | ((i15 & 7168) == 2048) | o0VarE.r(kVar);
            Object objQ = o0VarE.q();
            p3.m.a aVar2 = p3.m.f135153a;
            if (zR) {
                objQ = new sg0.j(xVar, 16, lVar, kVar);
                o0VarE.K(objQ);
            } else {
                aVar2.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new sg0.j(xVar, 16, lVar, kVar);
                    o0VarE.K(objQ);
                }
            }
            e23.a aVar3 = (e23.a) objQ;
            boolean zR2 = o0VarE.r(xVar) | ((i15 & 57344) == 16384);
            Object objQ2 = o0VarE.q();
            if (zR2) {
                objQ2 = new s70.j1(26, xVar, lVar2);
                o0VarE.K(objQ2);
            } else {
                aVar2.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new s70.j1(26, xVar, lVar2);
                    o0VarE.K(objQ2);
                }
            }
            e23.a aVar4 = (e23.a) objQ2;
            boolean zR3 = o0VarE.r(xVar) | ((i15 & 458752) == 131072);
            Object objQ3 = o0VarE.q();
            if (zR3) {
                objQ3 = new s70.j1(27, xVar, u0Var);
                o0VarE.K(objQ3);
            } else {
                aVar2.getClass();
                if (objQ3 == p3.m.a.f135155b) {
                    objQ3 = new s70.j1(27, xVar, u0Var);
                    o0VarE.K(objQ3);
                }
            }
            o0Var = o0VarE;
            c("device_discovery_device_detected_screen", j8, zBooleanValue, str, aVar, strQ, str2, str3, null, aVar3, null, aVar4, str4, (e23.a) objQ3, lVar3, o0Var, 6, (i15 >> 6) & 57344, 1280);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new r11.k(i14, 11, xVar, o1Var, kVar, lVar, u0Var, lVar3, lVar2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:109:0x0169  */
    /* JADX WARN: Code duplicated, block: B:110:0x0174  */
    /* JADX WARN: Code duplicated, block: B:113:0x017a  */
    /* JADX WARN: Code duplicated, block: B:114:0x0184  */
    /* JADX WARN: Code duplicated, block: B:117:0x0192  */
    /* JADX WARN: Code duplicated, block: B:118:0x0195  */
    /* JADX WARN: Code duplicated, block: B:121:0x019c  */
    /* JADX WARN: Code duplicated, block: B:122:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:124:0x020e  */
    /* JADX WARN: Code duplicated, block: B:127:0x0220  */
    /* JADX WARN: Code duplicated, block: B:129:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x0067  */
    /* JADX WARN: Code duplicated, block: B:28:0x006a  */
    /* JADX WARN: Code duplicated, block: B:31:0x0076  */
    /* JADX WARN: Code duplicated, block: B:32:0x0079  */
    /* JADX WARN: Code duplicated, block: B:35:0x0081  */
    /* JADX WARN: Code duplicated, block: B:37:0x0089  */
    /* JADX WARN: Code duplicated, block: B:38:0x008c  */
    /* JADX WARN: Code duplicated, block: B:42:0x009a  */
    /* JADX WARN: Code duplicated, block: B:43:0x009d  */
    /* JADX WARN: Code duplicated, block: B:46:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:53:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:57:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:59:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:61:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:63:0x00da  */
    /* JADX WARN: Code duplicated, block: B:64:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:68:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:72:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:74:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:75:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:79:0x0105  */
    /* JADX WARN: Code duplicated, block: B:82:0x010e  */
    /* JADX WARN: Code duplicated, block: B:84:0x0113  */
    /* JADX WARN: Code duplicated, block: B:87:0x011f  */
    /* JADX WARN: Code duplicated, block: B:91:0x0128  */
    /* JADX WARN: Code duplicated, block: B:94:0x0131  */
    /* JADX WARN: Code duplicated, block: B:96:0x013b  */
    /* JADX WARN: Code duplicated, block: B:98:0x0141  */
    public static final void c(final String str, final long j8, final boolean z14, final String str2, final o90.a aVar, String str3, final String str4, final String str5, String str6, final e23.a<Unit> aVar2, String str7, final e23.a<Unit> aVar3, String str8, e23.a<Unit> aVar4, final e23.l<? super Float, Unit> lVar, p3.m mVar, final int i14, final int i15, final int i16) {
        String strQ;
        int i17;
        int i18;
        final String str9;
        int i19;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i34;
        int i35;
        boolean z15;
        p3.o0 o0Var;
        final String str10;
        final String str11;
        final String str12;
        final e23.a<Unit> aVar5;
        p2 p2VarI0;
        int i36;
        String strQ2;
        String str13;
        String str14;
        int i37;
        e23.a<Unit> aVar6;
        String str15;
        int i38;
        int i39;
        p3.o0 o0VarE = mVar.E(1759094467);
        int i44 = i14 | (o0VarE.l(j8) ? 32 : 16) | (o0VarE.h(z14) ? 256 : 128) | (o0VarE.B(str2) ? 2048 : 1024) | (o0VarE.B(aVar) ? 16384 : 8192);
        if ((i16 & 32) == 0) {
            strQ = str3;
            int i45 = o0VarE.B(strQ) ? 131072 : 65536;
            int i46 = i44 | i45;
            if (o0VarE.B(str4)) {
                i17 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
            } else {
                i17 = 524288;
            }
            int i47 = i46 | i17;
            if (o0VarE.B(str5)) {
                i18 = 8388608;
            } else {
                i18 = 4194304;
            }
            int i48 = i47 | i18;
            if ((i16 & 256) == 0) {
                str9 = str6;
                int i49 = o0VarE.B(str9) ? 67108864 : 33554432;
                int i54 = i48 | i49;
                if (o0VarE.r(aVar2)) {
                    i19 = 536870912;
                } else {
                    i19 = 268435456;
                }
                i24 = i54 | i19;
                if ((i15 & 6) == 0) {
                    i25 = i15 | 2;
                } else {
                    i25 = i15;
                }
                if ((i15 & 48) == 0) {
                    if (o0VarE.r(aVar3)) {
                        i39 = 32;
                    } else {
                        i39 = 16;
                    }
                    i25 |= i39;
                }
                i26 = i25;
                i27 = i16 & 4096;
                if (i27 != 0) {
                    i28 = i27;
                    if ((i15 & 384) == 0) {
                        if (o0VarE.B(str8)) {
                            i29 = 256;
                        } else {
                            i29 = 128;
                        }
                        i26 |= i29;
                    }
                    i30 = i16 & 8192;
                    if (i30 != 0) {
                        i34 = i30;
                        if ((i15 & 3072) == 0) {
                            if (o0VarE.r(aVar4)) {
                                i35 = 2048;
                            } else {
                                i35 = 1024;
                            }
                            i26 |= i35;
                        }
                        if ((i15 & 24576) != 0) {
                            i26 |= o0VarE.r(lVar) ? 16384 : 8192;
                        }
                        if ((i24 & 306783379) == 306783378 || (i26 & 9363) != 9362) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (o0VarE.n(i24 & 1, z15)) {
                            o0VarE.G0();
                            if ((i14 & 1) != 0 || o0VarE.o0()) {
                                if ((i16 & 32) != 0) {
                                    i36 = i24 & (-458753);
                                    strQ = gl1.y.Q(o0VarE, R.string.find_my_watch_found_title);
                                } else {
                                    i36 = i24;
                                }
                                if ((i16 & 256) != 0) {
                                    strQ2 = gl1.y.Q(o0VarE, R.string.connect_it);
                                    i36 &= -234881025;
                                } else {
                                    strQ2 = str9;
                                }
                                String strQ3 = gl1.y.Q(o0VarE, R.string.startup_bic_different_device);
                                int i55 = i26 & (-15);
                                if (i28 != 0) {
                                    str13 = null;
                                } else {
                                    str13 = str8;
                                }
                                str14 = strQ3;
                                i37 = i55;
                                if (i34 != 0) {
                                    str15 = strQ2;
                                    i38 = i36;
                                    aVar6 = null;
                                } else {
                                    aVar6 = aVar4;
                                    str15 = strQ2;
                                    i38 = i36;
                                }
                            } else {
                                o0VarE.e();
                                i38 = (i16 & 32) != 0 ? i24 & (-458753) : i24;
                                if ((i16 & 256) != 0) {
                                    i38 &= -234881025;
                                }
                                int i56 = i26 & (-15);
                                str14 = str7;
                                str13 = str8;
                                aVar6 = aVar4;
                                str15 = str9;
                                i37 = i56;
                            }
                            o0VarE.h0();
                            x1 x1Var = p3.n.f135158a;
                            int i57 = i38 >> 6;
                            int i58 = (i57 & 7168) | (i57 & 112) | 6 | (i57 & 896) | (234881024 & i38) | (i38 & 1879048192);
                            int i59 = i37 << 6;
                            o0Var = o0VarE;
                            String str16 = strQ;
                            da0.p.c(str, str2, aVar, str16, false, null, null, null, str15, aVar2, false, str14, aVar3, false, str13, aVar6, false, false, null, lVar, null, null, z3.f.c(861935458, new e23.q() { // from class: ta0.n
                                /* JADX WARN: Code duplicated, block: B:13:0x00a0  */
                                @Override // e23.q
                                public final Object invoke(Object obj, Object obj2, Object obj3) {
                                    p3.m mVar2 = (p3.m) obj2;
                                    int iIntValue = ((Integer) obj3).intValue();
                                    ((c2.a0) obj).getClass();
                                    if (mVar2.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                                        x1 x1Var2 = p3.n.f135158a;
                                        if (z14) {
                                            long j14 = j8;
                                            if (j14 != -1) {
                                                mVar2.C(-1690152377);
                                                String strValueOf = String.valueOf(j14);
                                                h4.r rVarF = x2.f(o3.c(h4.r.S, "ready_to_connect_device_unit_id"), 1.0f);
                                                d92.b.f58623a.getClass();
                                                d92.b.f58625c.getClass();
                                                h4.r rVarC = c2.l.C(rVarF, 0.0f, j92.b.f97899b.f97921f, 0.0f, 0.0f, 13);
                                                d92.b.f58624b.getClass();
                                                s5.x0 x0VarB = d92.c.b(j92.f.f97931h, mVar2);
                                                d6.h.f57752b.getClass();
                                                mh.c(strValueOf, rVarC, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarB, mVar2, 0, 0, 130044);
                                                mVar2 = mVar2;
                                                mVar2.f();
                                            } else {
                                                mVar2.C(-1689749408);
                                                mVar2.f();
                                            }
                                        } else {
                                            mVar2.C(-1689749408);
                                            mVar2.f();
                                        }
                                        String str17 = str4;
                                        if (str17 == null) {
                                            mVar2.C(-1689718037);
                                            mVar2.f();
                                        } else {
                                            mVar2.C(-1689718036);
                                            h4.r rVarF2 = x2.f(h4.r.S, 1.0f);
                                            d92.b.f58623a.getClass();
                                            d92.b.f58625c.getClass();
                                            h4.r rVarC2 = c2.l.C(rVarF2, 0.0f, j92.b.f97899b.f97921f, 0.0f, 0.0f, 13);
                                            d92.b.f58624b.getClass();
                                            s5.x0 x0VarB2 = d92.c.b(j92.f.f97931h, mVar2);
                                            d6.h.f57752b.getClass();
                                            p3.m mVar3 = mVar2;
                                            mh.c(str17, rVarC2, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarB2, mVar3, 0, 0, 130044);
                                            mVar2 = mVar3;
                                            mVar2.f();
                                        }
                                        String str18 = str5;
                                        if (str18 == null) {
                                            mVar2.C(-1689390677);
                                            mVar2.f();
                                        } else {
                                            mVar2.C(-1689390676);
                                            h4.r rVarF3 = x2.f(h4.r.S, 1.0f);
                                            d92.b.f58623a.getClass();
                                            d92.b.f58625c.getClass();
                                            h4.r rVarC3 = c2.l.C(rVarF3, 0.0f, j92.b.f97899b.f97921f, 0.0f, 0.0f, 13);
                                            d92.b.f58624b.getClass();
                                            s5.x0 x0VarB3 = d92.c.b(j92.f.f97931h, mVar2);
                                            d6.h.f57752b.getClass();
                                            p3.m mVar4 = mVar2;
                                            mh.c(str18, rVarC3, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarB3, mVar4, 0, 0, 130044);
                                            mVar4.f();
                                        }
                                    } else {
                                        mVar2.e();
                                    }
                                    return Unit.INSTANCE;
                                }
                            }, o0VarE), o0Var, i58, ((i37 << 3) & 1008) | (57344 & i59) | (i59 & 458752) | ((i37 << 15) & 1879048192), 3072, 7808240);
                            str12 = str16;
                            str9 = str15;
                            str10 = str14;
                            str11 = str13;
                            aVar5 = aVar6;
                        } else {
                            o0Var = o0VarE;
                            o0Var.e();
                            str10 = str7;
                            str11 = str8;
                            str12 = strQ;
                            aVar5 = aVar4;
                        }
                        p2VarI0 = o0Var.i0();
                        if (p2VarI0 != null) {
                            p2VarI0.f135219d = new e23.p(str, j8, z14, str2, aVar, str12, str4, str5, str9, aVar2, str10, aVar3, str11, aVar5, lVar, i14, i15, i16) { // from class: ta0.o

                                /* JADX INFO: renamed from: a, reason: collision with root package name */
                                public final /* synthetic */ String f163393a;

                                /* JADX INFO: renamed from: b, reason: collision with root package name */
                                public final /* synthetic */ long f163394b;

                                /* JADX INFO: renamed from: c, reason: collision with root package name */
                                public final /* synthetic */ boolean f163395c;

                                /* JADX INFO: renamed from: d, reason: collision with root package name */
                                public final /* synthetic */ String f163396d;

                                /* JADX INFO: renamed from: e, reason: collision with root package name */
                                public final /* synthetic */ o90.a f163397e;

                                /* JADX INFO: renamed from: f, reason: collision with root package name */
                                public final /* synthetic */ String f163398f;

                                /* JADX INFO: renamed from: g, reason: collision with root package name */
                                public final /* synthetic */ String f163399g;

                                /* JADX INFO: renamed from: h, reason: collision with root package name */
                                public final /* synthetic */ String f163400h;

                                /* JADX INFO: renamed from: i, reason: collision with root package name */
                                public final /* synthetic */ String f163401i;

                                /* JADX INFO: renamed from: j, reason: collision with root package name */
                                public final /* synthetic */ e23.a f163402j;

                                /* JADX INFO: renamed from: k, reason: collision with root package name */
                                public final /* synthetic */ String f163403k;

                                /* JADX INFO: renamed from: l, reason: collision with root package name */
                                public final /* synthetic */ e23.a f163404l;

                                /* JADX INFO: renamed from: m, reason: collision with root package name */
                                public final /* synthetic */ String f163405m;

                                /* JADX INFO: renamed from: n, reason: collision with root package name */
                                public final /* synthetic */ e23.a f163406n;

                                /* JADX INFO: renamed from: o, reason: collision with root package name */
                                public final /* synthetic */ e23.l f163407o;

                                /* JADX INFO: renamed from: p, reason: collision with root package name */
                                public final /* synthetic */ int f163408p;

                                /* JADX INFO: renamed from: q, reason: collision with root package name */
                                public final /* synthetic */ int f163409q;

                                {
                                    this.f163408p = i15;
                                    this.f163409q = i16;
                                }

                                @Override // e23.p
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    int iT = p3.p0.t(7);
                                    int iT2 = p3.p0.t(this.f163408p);
                                    q.c(this.f163393a, this.f163394b, this.f163395c, this.f163396d, this.f163397e, this.f163398f, this.f163399g, this.f163400h, this.f163401i, this.f163402j, this.f163403k, this.f163404l, this.f163405m, this.f163406n, this.f163407o, (p3.m) obj, iT, iT2, this.f163409q);
                                    return Unit.INSTANCE;
                                }
                            };
                        }
                    }
                    i26 |= 3072;
                    i34 = i30;
                    if ((i15 & 24576) != 0) {
                        i26 |= o0VarE.r(lVar) ? 16384 : 8192;
                    }
                    if ((i24 & 306783379) == 306783378) {
                        z15 = true;
                    } else {
                        z15 = true;
                    }
                    if (o0VarE.n(i24 & 1, z15)) {
                        o0VarE.G0();
                        if ((i14 & 1) != 0) {
                            if ((i16 & 32) != 0) {
                                i36 = i24 & (-458753);
                                strQ = gl1.y.Q(o0VarE, R.string.find_my_watch_found_title);
                            } else {
                                i36 = i24;
                            }
                            if ((i16 & 256) != 0) {
                                strQ2 = gl1.y.Q(o0VarE, R.string.connect_it);
                                i36 &= -234881025;
                            } else {
                                strQ2 = str9;
                            }
                            String strQ4 = gl1.y.Q(o0VarE, R.string.startup_bic_different_device);
                            int i510 = i26 & (-15);
                            if (i28 != 0) {
                                str13 = null;
                            } else {
                                str13 = str8;
                            }
                            str14 = strQ4;
                            i37 = i510;
                            if (i34 != 0) {
                                str15 = strQ2;
                                i38 = i36;
                                aVar6 = null;
                            } else {
                                aVar6 = aVar4;
                                str15 = strQ2;
                                i38 = i36;
                            }
                        } else {
                            if ((i16 & 32) != 0) {
                                i36 = i24 & (-458753);
                                strQ = gl1.y.Q(o0VarE, R.string.find_my_watch_found_title);
                            } else {
                                i36 = i24;
                            }
                            if ((i16 & 256) != 0) {
                                strQ2 = gl1.y.Q(o0VarE, R.string.connect_it);
                                i36 &= -234881025;
                            } else {
                                strQ2 = str9;
                            }
                            String strQ5 = gl1.y.Q(o0VarE, R.string.startup_bic_different_device);
                            int i511 = i26 & (-15);
                            if (i28 != 0) {
                                str13 = null;
                            } else {
                                str13 = str8;
                            }
                            str14 = strQ5;
                            i37 = i511;
                            if (i34 != 0) {
                                str15 = strQ2;
                                i38 = i36;
                                aVar6 = null;
                            } else {
                                aVar6 = aVar4;
                                str15 = strQ2;
                                i38 = i36;
                            }
                        }
                        o0VarE.h0();
                        x1 x1Var2 = p3.n.f135158a;
                        int i512 = i38 >> 6;
                        int i513 = (i512 & 7168) | (i512 & 112) | 6 | (i512 & 896) | (234881024 & i38) | (i38 & 1879048192);
                        int i514 = i37 << 6;
                        o0Var = o0VarE;
                        String str17 = strQ;
                        da0.p.c(str, str2, aVar, str17, false, null, null, null, str15, aVar2, false, str14, aVar3, false, str13, aVar6, false, false, null, lVar, null, null, z3.f.c(861935458, new e23.q() { // from class: ta0.n
                            /* JADX WARN: Code duplicated, block: B:13:0x00a0  */
                            @Override // e23.q
                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                p3.m mVar2 = (p3.m) obj2;
                                int iIntValue = ((Integer) obj3).intValue();
                                ((c2.a0) obj).getClass();
                                if (mVar2.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    x1 x1Var3 = p3.n.f135158a;
                                    if (z14) {
                                        long j14 = j8;
                                        if (j14 != -1) {
                                            mVar2.C(-1690152377);
                                            String strValueOf = String.valueOf(j14);
                                            h4.r rVarF = x2.f(o3.c(h4.r.S, "ready_to_connect_device_unit_id"), 1.0f);
                                            d92.b.f58623a.getClass();
                                            d92.b.f58625c.getClass();
                                            h4.r rVarC = c2.l.C(rVarF, 0.0f, j92.b.f97899b.f97921f, 0.0f, 0.0f, 13);
                                            d92.b.f58624b.getClass();
                                            s5.x0 x0VarB = d92.c.b(j92.f.f97931h, mVar2);
                                            d6.h.f57752b.getClass();
                                            mh.c(strValueOf, rVarC, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarB, mVar2, 0, 0, 130044);
                                            mVar2 = mVar2;
                                            mVar2.f();
                                        } else {
                                            mVar2.C(-1689749408);
                                            mVar2.f();
                                        }
                                    } else {
                                        mVar2.C(-1689749408);
                                        mVar2.f();
                                    }
                                    String str18 = str4;
                                    if (str18 == null) {
                                        mVar2.C(-1689718037);
                                        mVar2.f();
                                    } else {
                                        mVar2.C(-1689718036);
                                        h4.r rVarF2 = x2.f(h4.r.S, 1.0f);
                                        d92.b.f58623a.getClass();
                                        d92.b.f58625c.getClass();
                                        h4.r rVarC2 = c2.l.C(rVarF2, 0.0f, j92.b.f97899b.f97921f, 0.0f, 0.0f, 13);
                                        d92.b.f58624b.getClass();
                                        s5.x0 x0VarB2 = d92.c.b(j92.f.f97931h, mVar2);
                                        d6.h.f57752b.getClass();
                                        p3.m mVar3 = mVar2;
                                        mh.c(str18, rVarC2, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarB2, mVar3, 0, 0, 130044);
                                        mVar2 = mVar3;
                                        mVar2.f();
                                    }
                                    String str19 = str5;
                                    if (str19 == null) {
                                        mVar2.C(-1689390677);
                                        mVar2.f();
                                    } else {
                                        mVar2.C(-1689390676);
                                        h4.r rVarF3 = x2.f(h4.r.S, 1.0f);
                                        d92.b.f58623a.getClass();
                                        d92.b.f58625c.getClass();
                                        h4.r rVarC3 = c2.l.C(rVarF3, 0.0f, j92.b.f97899b.f97921f, 0.0f, 0.0f, 13);
                                        d92.b.f58624b.getClass();
                                        s5.x0 x0VarB3 = d92.c.b(j92.f.f97931h, mVar2);
                                        d6.h.f57752b.getClass();
                                        p3.m mVar4 = mVar2;
                                        mh.c(str19, rVarC3, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarB3, mVar4, 0, 0, 130044);
                                        mVar4.f();
                                    }
                                } else {
                                    mVar2.e();
                                }
                                return Unit.INSTANCE;
                            }
                        }, o0VarE), o0Var, i513, ((i37 << 3) & 1008) | (57344 & i514) | (i514 & 458752) | ((i37 << 15) & 1879048192), 3072, 7808240);
                        str12 = str17;
                        str9 = str15;
                        str10 = str14;
                        str11 = str13;
                        aVar5 = aVar6;
                    } else {
                        o0Var = o0VarE;
                        o0Var.e();
                        str10 = str7;
                        str11 = str8;
                        str12 = strQ;
                        aVar5 = aVar4;
                    }
                    p2VarI0 = o0Var.i0();
                    if (p2VarI0 != null) {
                        p2VarI0.f135219d = new e23.p(str, j8, z14, str2, aVar, str12, str4, str5, str9, aVar2, str10, aVar3, str11, aVar5, lVar, i14, i15, i16) { // from class: ta0.o

                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                            public final /* synthetic */ String f163393a;

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            public final /* synthetic */ long f163394b;

                            /* JADX INFO: renamed from: c, reason: collision with root package name */
                            public final /* synthetic */ boolean f163395c;

                            /* JADX INFO: renamed from: d, reason: collision with root package name */
                            public final /* synthetic */ String f163396d;

                            /* JADX INFO: renamed from: e, reason: collision with root package name */
                            public final /* synthetic */ o90.a f163397e;

                            /* JADX INFO: renamed from: f, reason: collision with root package name */
                            public final /* synthetic */ String f163398f;

                            /* JADX INFO: renamed from: g, reason: collision with root package name */
                            public final /* synthetic */ String f163399g;

                            /* JADX INFO: renamed from: h, reason: collision with root package name */
                            public final /* synthetic */ String f163400h;

                            /* JADX INFO: renamed from: i, reason: collision with root package name */
                            public final /* synthetic */ String f163401i;

                            /* JADX INFO: renamed from: j, reason: collision with root package name */
                            public final /* synthetic */ e23.a f163402j;

                            /* JADX INFO: renamed from: k, reason: collision with root package name */
                            public final /* synthetic */ String f163403k;

                            /* JADX INFO: renamed from: l, reason: collision with root package name */
                            public final /* synthetic */ e23.a f163404l;

                            /* JADX INFO: renamed from: m, reason: collision with root package name */
                            public final /* synthetic */ String f163405m;

                            /* JADX INFO: renamed from: n, reason: collision with root package name */
                            public final /* synthetic */ e23.a f163406n;

                            /* JADX INFO: renamed from: o, reason: collision with root package name */
                            public final /* synthetic */ e23.l f163407o;

                            /* JADX INFO: renamed from: p, reason: collision with root package name */
                            public final /* synthetic */ int f163408p;

                            /* JADX INFO: renamed from: q, reason: collision with root package name */
                            public final /* synthetic */ int f163409q;

                            {
                                this.f163408p = i15;
                                this.f163409q = i16;
                            }

                            @Override // e23.p
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iT = p3.p0.t(7);
                                int iT2 = p3.p0.t(this.f163408p);
                                q.c(this.f163393a, this.f163394b, this.f163395c, this.f163396d, this.f163397e, this.f163398f, this.f163399g, this.f163400h, this.f163401i, this.f163402j, this.f163403k, this.f163404l, this.f163405m, this.f163406n, this.f163407o, (p3.m) obj, iT, iT2, this.f163409q);
                                return Unit.INSTANCE;
                            }
                        };
                    }
                }
                i26 |= 384;
                i28 = i27;
                i30 = i16 & 8192;
                if (i30 != 0) {
                    i34 = i30;
                    if ((i15 & 3072) == 0) {
                        if (o0VarE.r(aVar4)) {
                            i35 = 2048;
                        } else {
                            i35 = 1024;
                        }
                        i26 |= i35;
                    }
                    if ((i15 & 24576) != 0) {
                        i26 |= o0VarE.r(lVar) ? 16384 : 8192;
                    }
                    if ((i24 & 306783379) == 306783378) {
                        z15 = true;
                    } else {
                        z15 = true;
                    }
                    if (o0VarE.n(i24 & 1, z15)) {
                        o0VarE.G0();
                        if ((i14 & 1) != 0) {
                            if ((i16 & 32) != 0) {
                                i36 = i24 & (-458753);
                                strQ = gl1.y.Q(o0VarE, R.string.find_my_watch_found_title);
                            } else {
                                i36 = i24;
                            }
                            if ((i16 & 256) != 0) {
                                strQ2 = gl1.y.Q(o0VarE, R.string.connect_it);
                                i36 &= -234881025;
                            } else {
                                strQ2 = str9;
                            }
                            String strQ6 = gl1.y.Q(o0VarE, R.string.startup_bic_different_device);
                            int i515 = i26 & (-15);
                            if (i28 != 0) {
                                str13 = null;
                            } else {
                                str13 = str8;
                            }
                            str14 = strQ6;
                            i37 = i515;
                            if (i34 != 0) {
                                str15 = strQ2;
                                i38 = i36;
                                aVar6 = null;
                            } else {
                                aVar6 = aVar4;
                                str15 = strQ2;
                                i38 = i36;
                            }
                        } else {
                            if ((i16 & 32) != 0) {
                                i36 = i24 & (-458753);
                                strQ = gl1.y.Q(o0VarE, R.string.find_my_watch_found_title);
                            } else {
                                i36 = i24;
                            }
                            if ((i16 & 256) != 0) {
                                strQ2 = gl1.y.Q(o0VarE, R.string.connect_it);
                                i36 &= -234881025;
                            } else {
                                strQ2 = str9;
                            }
                            String strQ7 = gl1.y.Q(o0VarE, R.string.startup_bic_different_device);
                            int i516 = i26 & (-15);
                            if (i28 != 0) {
                                str13 = null;
                            } else {
                                str13 = str8;
                            }
                            str14 = strQ7;
                            i37 = i516;
                            if (i34 != 0) {
                                str15 = strQ2;
                                i38 = i36;
                                aVar6 = null;
                            } else {
                                aVar6 = aVar4;
                                str15 = strQ2;
                                i38 = i36;
                            }
                        }
                        o0VarE.h0();
                        x1 x1Var3 = p3.n.f135158a;
                        int i517 = i38 >> 6;
                        int i518 = (i517 & 7168) | (i517 & 112) | 6 | (i517 & 896) | (234881024 & i38) | (i38 & 1879048192);
                        int i519 = i37 << 6;
                        o0Var = o0VarE;
                        String str18 = strQ;
                        da0.p.c(str, str2, aVar, str18, false, null, null, null, str15, aVar2, false, str14, aVar3, false, str13, aVar6, false, false, null, lVar, null, null, z3.f.c(861935458, new e23.q() { // from class: ta0.n
                            /* JADX WARN: Code duplicated, block: B:13:0x00a0  */
                            @Override // e23.q
                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                p3.m mVar2 = (p3.m) obj2;
                                int iIntValue = ((Integer) obj3).intValue();
                                ((c2.a0) obj).getClass();
                                if (mVar2.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    x1 x1Var4 = p3.n.f135158a;
                                    if (z14) {
                                        long j14 = j8;
                                        if (j14 != -1) {
                                            mVar2.C(-1690152377);
                                            String strValueOf = String.valueOf(j14);
                                            h4.r rVarF = x2.f(o3.c(h4.r.S, "ready_to_connect_device_unit_id"), 1.0f);
                                            d92.b.f58623a.getClass();
                                            d92.b.f58625c.getClass();
                                            h4.r rVarC = c2.l.C(rVarF, 0.0f, j92.b.f97899b.f97921f, 0.0f, 0.0f, 13);
                                            d92.b.f58624b.getClass();
                                            s5.x0 x0VarB = d92.c.b(j92.f.f97931h, mVar2);
                                            d6.h.f57752b.getClass();
                                            mh.c(strValueOf, rVarC, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarB, mVar2, 0, 0, 130044);
                                            mVar2 = mVar2;
                                            mVar2.f();
                                        } else {
                                            mVar2.C(-1689749408);
                                            mVar2.f();
                                        }
                                    } else {
                                        mVar2.C(-1689749408);
                                        mVar2.f();
                                    }
                                    String str19 = str4;
                                    if (str19 == null) {
                                        mVar2.C(-1689718037);
                                        mVar2.f();
                                    } else {
                                        mVar2.C(-1689718036);
                                        h4.r rVarF2 = x2.f(h4.r.S, 1.0f);
                                        d92.b.f58623a.getClass();
                                        d92.b.f58625c.getClass();
                                        h4.r rVarC2 = c2.l.C(rVarF2, 0.0f, j92.b.f97899b.f97921f, 0.0f, 0.0f, 13);
                                        d92.b.f58624b.getClass();
                                        s5.x0 x0VarB2 = d92.c.b(j92.f.f97931h, mVar2);
                                        d6.h.f57752b.getClass();
                                        p3.m mVar3 = mVar2;
                                        mh.c(str19, rVarC2, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarB2, mVar3, 0, 0, 130044);
                                        mVar2 = mVar3;
                                        mVar2.f();
                                    }
                                    String str110 = str5;
                                    if (str110 == null) {
                                        mVar2.C(-1689390677);
                                        mVar2.f();
                                    } else {
                                        mVar2.C(-1689390676);
                                        h4.r rVarF3 = x2.f(h4.r.S, 1.0f);
                                        d92.b.f58623a.getClass();
                                        d92.b.f58625c.getClass();
                                        h4.r rVarC3 = c2.l.C(rVarF3, 0.0f, j92.b.f97899b.f97921f, 0.0f, 0.0f, 13);
                                        d92.b.f58624b.getClass();
                                        s5.x0 x0VarB3 = d92.c.b(j92.f.f97931h, mVar2);
                                        d6.h.f57752b.getClass();
                                        p3.m mVar4 = mVar2;
                                        mh.c(str110, rVarC3, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarB3, mVar4, 0, 0, 130044);
                                        mVar4.f();
                                    }
                                } else {
                                    mVar2.e();
                                }
                                return Unit.INSTANCE;
                            }
                        }, o0VarE), o0Var, i518, ((i37 << 3) & 1008) | (57344 & i519) | (i519 & 458752) | ((i37 << 15) & 1879048192), 3072, 7808240);
                        str12 = str18;
                        str9 = str15;
                        str10 = str14;
                        str11 = str13;
                        aVar5 = aVar6;
                    } else {
                        o0Var = o0VarE;
                        o0Var.e();
                        str10 = str7;
                        str11 = str8;
                        str12 = strQ;
                        aVar5 = aVar4;
                    }
                    p2VarI0 = o0Var.i0();
                    if (p2VarI0 != null) {
                        p2VarI0.f135219d = new e23.p(str, j8, z14, str2, aVar, str12, str4, str5, str9, aVar2, str10, aVar3, str11, aVar5, lVar, i14, i15, i16) { // from class: ta0.o

                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                            public final /* synthetic */ String f163393a;

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            public final /* synthetic */ long f163394b;

                            /* JADX INFO: renamed from: c, reason: collision with root package name */
                            public final /* synthetic */ boolean f163395c;

                            /* JADX INFO: renamed from: d, reason: collision with root package name */
                            public final /* synthetic */ String f163396d;

                            /* JADX INFO: renamed from: e, reason: collision with root package name */
                            public final /* synthetic */ o90.a f163397e;

                            /* JADX INFO: renamed from: f, reason: collision with root package name */
                            public final /* synthetic */ String f163398f;

                            /* JADX INFO: renamed from: g, reason: collision with root package name */
                            public final /* synthetic */ String f163399g;

                            /* JADX INFO: renamed from: h, reason: collision with root package name */
                            public final /* synthetic */ String f163400h;

                            /* JADX INFO: renamed from: i, reason: collision with root package name */
                            public final /* synthetic */ String f163401i;

                            /* JADX INFO: renamed from: j, reason: collision with root package name */
                            public final /* synthetic */ e23.a f163402j;

                            /* JADX INFO: renamed from: k, reason: collision with root package name */
                            public final /* synthetic */ String f163403k;

                            /* JADX INFO: renamed from: l, reason: collision with root package name */
                            public final /* synthetic */ e23.a f163404l;

                            /* JADX INFO: renamed from: m, reason: collision with root package name */
                            public final /* synthetic */ String f163405m;

                            /* JADX INFO: renamed from: n, reason: collision with root package name */
                            public final /* synthetic */ e23.a f163406n;

                            /* JADX INFO: renamed from: o, reason: collision with root package name */
                            public final /* synthetic */ e23.l f163407o;

                            /* JADX INFO: renamed from: p, reason: collision with root package name */
                            public final /* synthetic */ int f163408p;

                            /* JADX INFO: renamed from: q, reason: collision with root package name */
                            public final /* synthetic */ int f163409q;

                            {
                                this.f163408p = i15;
                                this.f163409q = i16;
                            }

                            @Override // e23.p
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iT = p3.p0.t(7);
                                int iT2 = p3.p0.t(this.f163408p);
                                q.c(this.f163393a, this.f163394b, this.f163395c, this.f163396d, this.f163397e, this.f163398f, this.f163399g, this.f163400h, this.f163401i, this.f163402j, this.f163403k, this.f163404l, this.f163405m, this.f163406n, this.f163407o, (p3.m) obj, iT, iT2, this.f163409q);
                                return Unit.INSTANCE;
                            }
                        };
                    }
                }
                i26 |= 3072;
                i34 = i30;
                if ((i15 & 24576) != 0) {
                    i26 |= o0VarE.r(lVar) ? 16384 : 8192;
                }
                if ((i24 & 306783379) == 306783378) {
                    z15 = true;
                } else {
                    z15 = true;
                }
                if (o0VarE.n(i24 & 1, z15)) {
                    o0VarE.G0();
                    if ((i14 & 1) != 0) {
                        if ((i16 & 32) != 0) {
                            i36 = i24 & (-458753);
                            strQ = gl1.y.Q(o0VarE, R.string.find_my_watch_found_title);
                        } else {
                            i36 = i24;
                        }
                        if ((i16 & 256) != 0) {
                            strQ2 = gl1.y.Q(o0VarE, R.string.connect_it);
                            i36 &= -234881025;
                        } else {
                            strQ2 = str9;
                        }
                        String strQ8 = gl1.y.Q(o0VarE, R.string.startup_bic_different_device);
                        int i5110 = i26 & (-15);
                        if (i28 != 0) {
                            str13 = null;
                        } else {
                            str13 = str8;
                        }
                        str14 = strQ8;
                        i37 = i5110;
                        if (i34 != 0) {
                            str15 = strQ2;
                            i38 = i36;
                            aVar6 = null;
                        } else {
                            aVar6 = aVar4;
                            str15 = strQ2;
                            i38 = i36;
                        }
                    } else {
                        if ((i16 & 32) != 0) {
                            i36 = i24 & (-458753);
                            strQ = gl1.y.Q(o0VarE, R.string.find_my_watch_found_title);
                        } else {
                            i36 = i24;
                        }
                        if ((i16 & 256) != 0) {
                            strQ2 = gl1.y.Q(o0VarE, R.string.connect_it);
                            i36 &= -234881025;
                        } else {
                            strQ2 = str9;
                        }
                        String strQ9 = gl1.y.Q(o0VarE, R.string.startup_bic_different_device);
                        int i5111 = i26 & (-15);
                        if (i28 != 0) {
                            str13 = null;
                        } else {
                            str13 = str8;
                        }
                        str14 = strQ9;
                        i37 = i5111;
                        if (i34 != 0) {
                            str15 = strQ2;
                            i38 = i36;
                            aVar6 = null;
                        } else {
                            aVar6 = aVar4;
                            str15 = strQ2;
                            i38 = i36;
                        }
                    }
                    o0VarE.h0();
                    x1 x1Var4 = p3.n.f135158a;
                    int i5112 = i38 >> 6;
                    int i5113 = (i5112 & 7168) | (i5112 & 112) | 6 | (i5112 & 896) | (234881024 & i38) | (i38 & 1879048192);
                    int i5114 = i37 << 6;
                    o0Var = o0VarE;
                    String str19 = strQ;
                    da0.p.c(str, str2, aVar, str19, false, null, null, null, str15, aVar2, false, str14, aVar3, false, str13, aVar6, false, false, null, lVar, null, null, z3.f.c(861935458, new e23.q() { // from class: ta0.n
                        /* JADX WARN: Code duplicated, block: B:13:0x00a0  */
                        @Override // e23.q
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            p3.m mVar2 = (p3.m) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            ((c2.a0) obj).getClass();
                            if (mVar2.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                                x1 x1Var5 = p3.n.f135158a;
                                if (z14) {
                                    long j14 = j8;
                                    if (j14 != -1) {
                                        mVar2.C(-1690152377);
                                        String strValueOf = String.valueOf(j14);
                                        h4.r rVarF = x2.f(o3.c(h4.r.S, "ready_to_connect_device_unit_id"), 1.0f);
                                        d92.b.f58623a.getClass();
                                        d92.b.f58625c.getClass();
                                        h4.r rVarC = c2.l.C(rVarF, 0.0f, j92.b.f97899b.f97921f, 0.0f, 0.0f, 13);
                                        d92.b.f58624b.getClass();
                                        s5.x0 x0VarB = d92.c.b(j92.f.f97931h, mVar2);
                                        d6.h.f57752b.getClass();
                                        mh.c(strValueOf, rVarC, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarB, mVar2, 0, 0, 130044);
                                        mVar2 = mVar2;
                                        mVar2.f();
                                    } else {
                                        mVar2.C(-1689749408);
                                        mVar2.f();
                                    }
                                } else {
                                    mVar2.C(-1689749408);
                                    mVar2.f();
                                }
                                String str110 = str4;
                                if (str110 == null) {
                                    mVar2.C(-1689718037);
                                    mVar2.f();
                                } else {
                                    mVar2.C(-1689718036);
                                    h4.r rVarF2 = x2.f(h4.r.S, 1.0f);
                                    d92.b.f58623a.getClass();
                                    d92.b.f58625c.getClass();
                                    h4.r rVarC2 = c2.l.C(rVarF2, 0.0f, j92.b.f97899b.f97921f, 0.0f, 0.0f, 13);
                                    d92.b.f58624b.getClass();
                                    s5.x0 x0VarB2 = d92.c.b(j92.f.f97931h, mVar2);
                                    d6.h.f57752b.getClass();
                                    p3.m mVar3 = mVar2;
                                    mh.c(str110, rVarC2, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarB2, mVar3, 0, 0, 130044);
                                    mVar2 = mVar3;
                                    mVar2.f();
                                }
                                String str111 = str5;
                                if (str111 == null) {
                                    mVar2.C(-1689390677);
                                    mVar2.f();
                                } else {
                                    mVar2.C(-1689390676);
                                    h4.r rVarF3 = x2.f(h4.r.S, 1.0f);
                                    d92.b.f58623a.getClass();
                                    d92.b.f58625c.getClass();
                                    h4.r rVarC3 = c2.l.C(rVarF3, 0.0f, j92.b.f97899b.f97921f, 0.0f, 0.0f, 13);
                                    d92.b.f58624b.getClass();
                                    s5.x0 x0VarB3 = d92.c.b(j92.f.f97931h, mVar2);
                                    d6.h.f57752b.getClass();
                                    p3.m mVar4 = mVar2;
                                    mh.c(str111, rVarC3, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarB3, mVar4, 0, 0, 130044);
                                    mVar4.f();
                                }
                            } else {
                                mVar2.e();
                            }
                            return Unit.INSTANCE;
                        }
                    }, o0VarE), o0Var, i5113, ((i37 << 3) & 1008) | (57344 & i5114) | (i5114 & 458752) | ((i37 << 15) & 1879048192), 3072, 7808240);
                    str12 = str19;
                    str9 = str15;
                    str10 = str14;
                    str11 = str13;
                    aVar5 = aVar6;
                } else {
                    o0Var = o0VarE;
                    o0Var.e();
                    str10 = str7;
                    str11 = str8;
                    str12 = strQ;
                    aVar5 = aVar4;
                }
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new e23.p(str, j8, z14, str2, aVar, str12, str4, str5, str9, aVar2, str10, aVar3, str11, aVar5, lVar, i14, i15, i16) { // from class: ta0.o

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final /* synthetic */ String f163393a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ long f163394b;

                        /* JADX INFO: renamed from: c, reason: collision with root package name */
                        public final /* synthetic */ boolean f163395c;

                        /* JADX INFO: renamed from: d, reason: collision with root package name */
                        public final /* synthetic */ String f163396d;

                        /* JADX INFO: renamed from: e, reason: collision with root package name */
                        public final /* synthetic */ o90.a f163397e;

                        /* JADX INFO: renamed from: f, reason: collision with root package name */
                        public final /* synthetic */ String f163398f;

                        /* JADX INFO: renamed from: g, reason: collision with root package name */
                        public final /* synthetic */ String f163399g;

                        /* JADX INFO: renamed from: h, reason: collision with root package name */
                        public final /* synthetic */ String f163400h;

                        /* JADX INFO: renamed from: i, reason: collision with root package name */
                        public final /* synthetic */ String f163401i;

                        /* JADX INFO: renamed from: j, reason: collision with root package name */
                        public final /* synthetic */ e23.a f163402j;

                        /* JADX INFO: renamed from: k, reason: collision with root package name */
                        public final /* synthetic */ String f163403k;

                        /* JADX INFO: renamed from: l, reason: collision with root package name */
                        public final /* synthetic */ e23.a f163404l;

                        /* JADX INFO: renamed from: m, reason: collision with root package name */
                        public final /* synthetic */ String f163405m;

                        /* JADX INFO: renamed from: n, reason: collision with root package name */
                        public final /* synthetic */ e23.a f163406n;

                        /* JADX INFO: renamed from: o, reason: collision with root package name */
                        public final /* synthetic */ e23.l f163407o;

                        /* JADX INFO: renamed from: p, reason: collision with root package name */
                        public final /* synthetic */ int f163408p;

                        /* JADX INFO: renamed from: q, reason: collision with root package name */
                        public final /* synthetic */ int f163409q;

                        {
                            this.f163408p = i15;
                            this.f163409q = i16;
                        }

                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iT = p3.p0.t(7);
                            int iT2 = p3.p0.t(this.f163408p);
                            q.c(this.f163393a, this.f163394b, this.f163395c, this.f163396d, this.f163397e, this.f163398f, this.f163399g, this.f163400h, this.f163401i, this.f163402j, this.f163403k, this.f163404l, this.f163405m, this.f163406n, this.f163407o, (p3.m) obj, iT, iT2, this.f163409q);
                            return Unit.INSTANCE;
                        }
                    };
                }
            }
            str9 = str6;
            int i520 = i48 | i49;
            if (o0VarE.r(aVar2)) {
                i19 = 536870912;
            } else {
                i19 = 268435456;
            }
            i24 = i520 | i19;
            if ((i15 & 6) == 0) {
                i25 = i15 | 2;
            } else {
                i25 = i15;
            }
            if ((i15 & 48) == 0) {
                if (o0VarE.r(aVar3)) {
                    i39 = 32;
                } else {
                    i39 = 16;
                }
                i25 |= i39;
            }
            i26 = i25;
            i27 = i16 & 4096;
            if (i27 != 0) {
                i28 = i27;
                if ((i15 & 384) == 0) {
                    if (o0VarE.B(str8)) {
                        i29 = 256;
                    } else {
                        i29 = 128;
                    }
                    i26 |= i29;
                }
                i30 = i16 & 8192;
                if (i30 != 0) {
                    i34 = i30;
                    if ((i15 & 3072) == 0) {
                        if (o0VarE.r(aVar4)) {
                            i35 = 2048;
                        } else {
                            i35 = 1024;
                        }
                        i26 |= i35;
                    }
                    if ((i15 & 24576) != 0) {
                        i26 |= o0VarE.r(lVar) ? 16384 : 8192;
                    }
                    if ((i24 & 306783379) == 306783378) {
                        z15 = true;
                    } else {
                        z15 = true;
                    }
                    if (o0VarE.n(i24 & 1, z15)) {
                        o0VarE.G0();
                        if ((i14 & 1) != 0) {
                            if ((i16 & 32) != 0) {
                                i36 = i24 & (-458753);
                                strQ = gl1.y.Q(o0VarE, R.string.find_my_watch_found_title);
                            } else {
                                i36 = i24;
                            }
                            if ((i16 & 256) != 0) {
                                strQ2 = gl1.y.Q(o0VarE, R.string.connect_it);
                                i36 &= -234881025;
                            } else {
                                strQ2 = str9;
                            }
                            String strQ10 = gl1.y.Q(o0VarE, R.string.startup_bic_different_device);
                            int i5115 = i26 & (-15);
                            if (i28 != 0) {
                                str13 = null;
                            } else {
                                str13 = str8;
                            }
                            str14 = strQ10;
                            i37 = i5115;
                            if (i34 != 0) {
                                str15 = strQ2;
                                i38 = i36;
                                aVar6 = null;
                            } else {
                                aVar6 = aVar4;
                                str15 = strQ2;
                                i38 = i36;
                            }
                        } else {
                            if ((i16 & 32) != 0) {
                                i36 = i24 & (-458753);
                                strQ = gl1.y.Q(o0VarE, R.string.find_my_watch_found_title);
                            } else {
                                i36 = i24;
                            }
                            if ((i16 & 256) != 0) {
                                strQ2 = gl1.y.Q(o0VarE, R.string.connect_it);
                                i36 &= -234881025;
                            } else {
                                strQ2 = str9;
                            }
                            String strQ11 = gl1.y.Q(o0VarE, R.string.startup_bic_different_device);
                            int i5116 = i26 & (-15);
                            if (i28 != 0) {
                                str13 = null;
                            } else {
                                str13 = str8;
                            }
                            str14 = strQ11;
                            i37 = i5116;
                            if (i34 != 0) {
                                str15 = strQ2;
                                i38 = i36;
                                aVar6 = null;
                            } else {
                                aVar6 = aVar4;
                                str15 = strQ2;
                                i38 = i36;
                            }
                        }
                        o0VarE.h0();
                        x1 x1Var5 = p3.n.f135158a;
                        int i5117 = i38 >> 6;
                        int i5118 = (i5117 & 7168) | (i5117 & 112) | 6 | (i5117 & 896) | (234881024 & i38) | (i38 & 1879048192);
                        int i5119 = i37 << 6;
                        o0Var = o0VarE;
                        String str110 = strQ;
                        da0.p.c(str, str2, aVar, str110, false, null, null, null, str15, aVar2, false, str14, aVar3, false, str13, aVar6, false, false, null, lVar, null, null, z3.f.c(861935458, new e23.q() { // from class: ta0.n
                            /* JADX WARN: Code duplicated, block: B:13:0x00a0  */
                            @Override // e23.q
                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                p3.m mVar2 = (p3.m) obj2;
                                int iIntValue = ((Integer) obj3).intValue();
                                ((c2.a0) obj).getClass();
                                if (mVar2.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    x1 x1Var6 = p3.n.f135158a;
                                    if (z14) {
                                        long j14 = j8;
                                        if (j14 != -1) {
                                            mVar2.C(-1690152377);
                                            String strValueOf = String.valueOf(j14);
                                            h4.r rVarF = x2.f(o3.c(h4.r.S, "ready_to_connect_device_unit_id"), 1.0f);
                                            d92.b.f58623a.getClass();
                                            d92.b.f58625c.getClass();
                                            h4.r rVarC = c2.l.C(rVarF, 0.0f, j92.b.f97899b.f97921f, 0.0f, 0.0f, 13);
                                            d92.b.f58624b.getClass();
                                            s5.x0 x0VarB = d92.c.b(j92.f.f97931h, mVar2);
                                            d6.h.f57752b.getClass();
                                            mh.c(strValueOf, rVarC, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarB, mVar2, 0, 0, 130044);
                                            mVar2 = mVar2;
                                            mVar2.f();
                                        } else {
                                            mVar2.C(-1689749408);
                                            mVar2.f();
                                        }
                                    } else {
                                        mVar2.C(-1689749408);
                                        mVar2.f();
                                    }
                                    String str111 = str4;
                                    if (str111 == null) {
                                        mVar2.C(-1689718037);
                                        mVar2.f();
                                    } else {
                                        mVar2.C(-1689718036);
                                        h4.r rVarF2 = x2.f(h4.r.S, 1.0f);
                                        d92.b.f58623a.getClass();
                                        d92.b.f58625c.getClass();
                                        h4.r rVarC2 = c2.l.C(rVarF2, 0.0f, j92.b.f97899b.f97921f, 0.0f, 0.0f, 13);
                                        d92.b.f58624b.getClass();
                                        s5.x0 x0VarB2 = d92.c.b(j92.f.f97931h, mVar2);
                                        d6.h.f57752b.getClass();
                                        p3.m mVar3 = mVar2;
                                        mh.c(str111, rVarC2, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarB2, mVar3, 0, 0, 130044);
                                        mVar2 = mVar3;
                                        mVar2.f();
                                    }
                                    String str112 = str5;
                                    if (str112 == null) {
                                        mVar2.C(-1689390677);
                                        mVar2.f();
                                    } else {
                                        mVar2.C(-1689390676);
                                        h4.r rVarF3 = x2.f(h4.r.S, 1.0f);
                                        d92.b.f58623a.getClass();
                                        d92.b.f58625c.getClass();
                                        h4.r rVarC3 = c2.l.C(rVarF3, 0.0f, j92.b.f97899b.f97921f, 0.0f, 0.0f, 13);
                                        d92.b.f58624b.getClass();
                                        s5.x0 x0VarB3 = d92.c.b(j92.f.f97931h, mVar2);
                                        d6.h.f57752b.getClass();
                                        p3.m mVar4 = mVar2;
                                        mh.c(str112, rVarC3, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarB3, mVar4, 0, 0, 130044);
                                        mVar4.f();
                                    }
                                } else {
                                    mVar2.e();
                                }
                                return Unit.INSTANCE;
                            }
                        }, o0VarE), o0Var, i5118, ((i37 << 3) & 1008) | (57344 & i5119) | (i5119 & 458752) | ((i37 << 15) & 1879048192), 3072, 7808240);
                        str12 = str110;
                        str9 = str15;
                        str10 = str14;
                        str11 = str13;
                        aVar5 = aVar6;
                    } else {
                        o0Var = o0VarE;
                        o0Var.e();
                        str10 = str7;
                        str11 = str8;
                        str12 = strQ;
                        aVar5 = aVar4;
                    }
                    p2VarI0 = o0Var.i0();
                    if (p2VarI0 != null) {
                        p2VarI0.f135219d = new e23.p(str, j8, z14, str2, aVar, str12, str4, str5, str9, aVar2, str10, aVar3, str11, aVar5, lVar, i14, i15, i16) { // from class: ta0.o

                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                            public final /* synthetic */ String f163393a;

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            public final /* synthetic */ long f163394b;

                            /* JADX INFO: renamed from: c, reason: collision with root package name */
                            public final /* synthetic */ boolean f163395c;

                            /* JADX INFO: renamed from: d, reason: collision with root package name */
                            public final /* synthetic */ String f163396d;

                            /* JADX INFO: renamed from: e, reason: collision with root package name */
                            public final /* synthetic */ o90.a f163397e;

                            /* JADX INFO: renamed from: f, reason: collision with root package name */
                            public final /* synthetic */ String f163398f;

                            /* JADX INFO: renamed from: g, reason: collision with root package name */
                            public final /* synthetic */ String f163399g;

                            /* JADX INFO: renamed from: h, reason: collision with root package name */
                            public final /* synthetic */ String f163400h;

                            /* JADX INFO: renamed from: i, reason: collision with root package name */
                            public final /* synthetic */ String f163401i;

                            /* JADX INFO: renamed from: j, reason: collision with root package name */
                            public final /* synthetic */ e23.a f163402j;

                            /* JADX INFO: renamed from: k, reason: collision with root package name */
                            public final /* synthetic */ String f163403k;

                            /* JADX INFO: renamed from: l, reason: collision with root package name */
                            public final /* synthetic */ e23.a f163404l;

                            /* JADX INFO: renamed from: m, reason: collision with root package name */
                            public final /* synthetic */ String f163405m;

                            /* JADX INFO: renamed from: n, reason: collision with root package name */
                            public final /* synthetic */ e23.a f163406n;

                            /* JADX INFO: renamed from: o, reason: collision with root package name */
                            public final /* synthetic */ e23.l f163407o;

                            /* JADX INFO: renamed from: p, reason: collision with root package name */
                            public final /* synthetic */ int f163408p;

                            /* JADX INFO: renamed from: q, reason: collision with root package name */
                            public final /* synthetic */ int f163409q;

                            {
                                this.f163408p = i15;
                                this.f163409q = i16;
                            }

                            @Override // e23.p
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iT = p3.p0.t(7);
                                int iT2 = p3.p0.t(this.f163408p);
                                q.c(this.f163393a, this.f163394b, this.f163395c, this.f163396d, this.f163397e, this.f163398f, this.f163399g, this.f163400h, this.f163401i, this.f163402j, this.f163403k, this.f163404l, this.f163405m, this.f163406n, this.f163407o, (p3.m) obj, iT, iT2, this.f163409q);
                                return Unit.INSTANCE;
                            }
                        };
                    }
                }
                i26 |= 3072;
                i34 = i30;
                if ((i15 & 24576) != 0) {
                    i26 |= o0VarE.r(lVar) ? 16384 : 8192;
                }
                if ((i24 & 306783379) == 306783378) {
                    z15 = true;
                } else {
                    z15 = true;
                }
                if (o0VarE.n(i24 & 1, z15)) {
                    o0VarE.G0();
                    if ((i14 & 1) != 0) {
                        if ((i16 & 32) != 0) {
                            i36 = i24 & (-458753);
                            strQ = gl1.y.Q(o0VarE, R.string.find_my_watch_found_title);
                        } else {
                            i36 = i24;
                        }
                        if ((i16 & 256) != 0) {
                            strQ2 = gl1.y.Q(o0VarE, R.string.connect_it);
                            i36 &= -234881025;
                        } else {
                            strQ2 = str9;
                        }
                        String strQ12 = gl1.y.Q(o0VarE, R.string.startup_bic_different_device);
                        int i51110 = i26 & (-15);
                        if (i28 != 0) {
                            str13 = null;
                        } else {
                            str13 = str8;
                        }
                        str14 = strQ12;
                        i37 = i51110;
                        if (i34 != 0) {
                            str15 = strQ2;
                            i38 = i36;
                            aVar6 = null;
                        } else {
                            aVar6 = aVar4;
                            str15 = strQ2;
                            i38 = i36;
                        }
                    } else {
                        if ((i16 & 32) != 0) {
                            i36 = i24 & (-458753);
                            strQ = gl1.y.Q(o0VarE, R.string.find_my_watch_found_title);
                        } else {
                            i36 = i24;
                        }
                        if ((i16 & 256) != 0) {
                            strQ2 = gl1.y.Q(o0VarE, R.string.connect_it);
                            i36 &= -234881025;
                        } else {
                            strQ2 = str9;
                        }
                        String strQ13 = gl1.y.Q(o0VarE, R.string.startup_bic_different_device);
                        int i51111 = i26 & (-15);
                        if (i28 != 0) {
                            str13 = null;
                        } else {
                            str13 = str8;
                        }
                        str14 = strQ13;
                        i37 = i51111;
                        if (i34 != 0) {
                            str15 = strQ2;
                            i38 = i36;
                            aVar6 = null;
                        } else {
                            aVar6 = aVar4;
                            str15 = strQ2;
                            i38 = i36;
                        }
                    }
                    o0VarE.h0();
                    x1 x1Var6 = p3.n.f135158a;
                    int i51112 = i38 >> 6;
                    int i51113 = (i51112 & 7168) | (i51112 & 112) | 6 | (i51112 & 896) | (234881024 & i38) | (i38 & 1879048192);
                    int i51114 = i37 << 6;
                    o0Var = o0VarE;
                    String str111 = strQ;
                    da0.p.c(str, str2, aVar, str111, false, null, null, null, str15, aVar2, false, str14, aVar3, false, str13, aVar6, false, false, null, lVar, null, null, z3.f.c(861935458, new e23.q() { // from class: ta0.n
                        /* JADX WARN: Code duplicated, block: B:13:0x00a0  */
                        @Override // e23.q
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            p3.m mVar2 = (p3.m) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            ((c2.a0) obj).getClass();
                            if (mVar2.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                                x1 x1Var7 = p3.n.f135158a;
                                if (z14) {
                                    long j14 = j8;
                                    if (j14 != -1) {
                                        mVar2.C(-1690152377);
                                        String strValueOf = String.valueOf(j14);
                                        h4.r rVarF = x2.f(o3.c(h4.r.S, "ready_to_connect_device_unit_id"), 1.0f);
                                        d92.b.f58623a.getClass();
                                        d92.b.f58625c.getClass();
                                        h4.r rVarC = c2.l.C(rVarF, 0.0f, j92.b.f97899b.f97921f, 0.0f, 0.0f, 13);
                                        d92.b.f58624b.getClass();
                                        s5.x0 x0VarB = d92.c.b(j92.f.f97931h, mVar2);
                                        d6.h.f57752b.getClass();
                                        mh.c(strValueOf, rVarC, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarB, mVar2, 0, 0, 130044);
                                        mVar2 = mVar2;
                                        mVar2.f();
                                    } else {
                                        mVar2.C(-1689749408);
                                        mVar2.f();
                                    }
                                } else {
                                    mVar2.C(-1689749408);
                                    mVar2.f();
                                }
                                String str112 = str4;
                                if (str112 == null) {
                                    mVar2.C(-1689718037);
                                    mVar2.f();
                                } else {
                                    mVar2.C(-1689718036);
                                    h4.r rVarF2 = x2.f(h4.r.S, 1.0f);
                                    d92.b.f58623a.getClass();
                                    d92.b.f58625c.getClass();
                                    h4.r rVarC2 = c2.l.C(rVarF2, 0.0f, j92.b.f97899b.f97921f, 0.0f, 0.0f, 13);
                                    d92.b.f58624b.getClass();
                                    s5.x0 x0VarB2 = d92.c.b(j92.f.f97931h, mVar2);
                                    d6.h.f57752b.getClass();
                                    p3.m mVar3 = mVar2;
                                    mh.c(str112, rVarC2, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarB2, mVar3, 0, 0, 130044);
                                    mVar2 = mVar3;
                                    mVar2.f();
                                }
                                String str113 = str5;
                                if (str113 == null) {
                                    mVar2.C(-1689390677);
                                    mVar2.f();
                                } else {
                                    mVar2.C(-1689390676);
                                    h4.r rVarF3 = x2.f(h4.r.S, 1.0f);
                                    d92.b.f58623a.getClass();
                                    d92.b.f58625c.getClass();
                                    h4.r rVarC3 = c2.l.C(rVarF3, 0.0f, j92.b.f97899b.f97921f, 0.0f, 0.0f, 13);
                                    d92.b.f58624b.getClass();
                                    s5.x0 x0VarB3 = d92.c.b(j92.f.f97931h, mVar2);
                                    d6.h.f57752b.getClass();
                                    p3.m mVar4 = mVar2;
                                    mh.c(str113, rVarC3, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarB3, mVar4, 0, 0, 130044);
                                    mVar4.f();
                                }
                            } else {
                                mVar2.e();
                            }
                            return Unit.INSTANCE;
                        }
                    }, o0VarE), o0Var, i51113, ((i37 << 3) & 1008) | (57344 & i51114) | (i51114 & 458752) | ((i37 << 15) & 1879048192), 3072, 7808240);
                    str12 = str111;
                    str9 = str15;
                    str10 = str14;
                    str11 = str13;
                    aVar5 = aVar6;
                } else {
                    o0Var = o0VarE;
                    o0Var.e();
                    str10 = str7;
                    str11 = str8;
                    str12 = strQ;
                    aVar5 = aVar4;
                }
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new e23.p(str, j8, z14, str2, aVar, str12, str4, str5, str9, aVar2, str10, aVar3, str11, aVar5, lVar, i14, i15, i16) { // from class: ta0.o

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final /* synthetic */ String f163393a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ long f163394b;

                        /* JADX INFO: renamed from: c, reason: collision with root package name */
                        public final /* synthetic */ boolean f163395c;

                        /* JADX INFO: renamed from: d, reason: collision with root package name */
                        public final /* synthetic */ String f163396d;

                        /* JADX INFO: renamed from: e, reason: collision with root package name */
                        public final /* synthetic */ o90.a f163397e;

                        /* JADX INFO: renamed from: f, reason: collision with root package name */
                        public final /* synthetic */ String f163398f;

                        /* JADX INFO: renamed from: g, reason: collision with root package name */
                        public final /* synthetic */ String f163399g;

                        /* JADX INFO: renamed from: h, reason: collision with root package name */
                        public final /* synthetic */ String f163400h;

                        /* JADX INFO: renamed from: i, reason: collision with root package name */
                        public final /* synthetic */ String f163401i;

                        /* JADX INFO: renamed from: j, reason: collision with root package name */
                        public final /* synthetic */ e23.a f163402j;

                        /* JADX INFO: renamed from: k, reason: collision with root package name */
                        public final /* synthetic */ String f163403k;

                        /* JADX INFO: renamed from: l, reason: collision with root package name */
                        public final /* synthetic */ e23.a f163404l;

                        /* JADX INFO: renamed from: m, reason: collision with root package name */
                        public final /* synthetic */ String f163405m;

                        /* JADX INFO: renamed from: n, reason: collision with root package name */
                        public final /* synthetic */ e23.a f163406n;

                        /* JADX INFO: renamed from: o, reason: collision with root package name */
                        public final /* synthetic */ e23.l f163407o;

                        /* JADX INFO: renamed from: p, reason: collision with root package name */
                        public final /* synthetic */ int f163408p;

                        /* JADX INFO: renamed from: q, reason: collision with root package name */
                        public final /* synthetic */ int f163409q;

                        {
                            this.f163408p = i15;
                            this.f163409q = i16;
                        }

                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iT = p3.p0.t(7);
                            int iT2 = p3.p0.t(this.f163408p);
                            q.c(this.f163393a, this.f163394b, this.f163395c, this.f163396d, this.f163397e, this.f163398f, this.f163399g, this.f163400h, this.f163401i, this.f163402j, this.f163403k, this.f163404l, this.f163405m, this.f163406n, this.f163407o, (p3.m) obj, iT, iT2, this.f163409q);
                            return Unit.INSTANCE;
                        }
                    };
                }
            }
            i26 |= 384;
            i28 = i27;
            i30 = i16 & 8192;
            if (i30 != 0) {
                i34 = i30;
                if ((i15 & 3072) == 0) {
                    if (o0VarE.r(aVar4)) {
                        i35 = 2048;
                    } else {
                        i35 = 1024;
                    }
                    i26 |= i35;
                }
                if ((i15 & 24576) != 0) {
                    i26 |= o0VarE.r(lVar) ? 16384 : 8192;
                }
                if ((i24 & 306783379) == 306783378) {
                    z15 = true;
                } else {
                    z15 = true;
                }
                if (o0VarE.n(i24 & 1, z15)) {
                    o0VarE.G0();
                    if ((i14 & 1) != 0) {
                        if ((i16 & 32) != 0) {
                            i36 = i24 & (-458753);
                            strQ = gl1.y.Q(o0VarE, R.string.find_my_watch_found_title);
                        } else {
                            i36 = i24;
                        }
                        if ((i16 & 256) != 0) {
                            strQ2 = gl1.y.Q(o0VarE, R.string.connect_it);
                            i36 &= -234881025;
                        } else {
                            strQ2 = str9;
                        }
                        String strQ14 = gl1.y.Q(o0VarE, R.string.startup_bic_different_device);
                        int i51115 = i26 & (-15);
                        if (i28 != 0) {
                            str13 = null;
                        } else {
                            str13 = str8;
                        }
                        str14 = strQ14;
                        i37 = i51115;
                        if (i34 != 0) {
                            str15 = strQ2;
                            i38 = i36;
                            aVar6 = null;
                        } else {
                            aVar6 = aVar4;
                            str15 = strQ2;
                            i38 = i36;
                        }
                    } else {
                        if ((i16 & 32) != 0) {
                            i36 = i24 & (-458753);
                            strQ = gl1.y.Q(o0VarE, R.string.find_my_watch_found_title);
                        } else {
                            i36 = i24;
                        }
                        if ((i16 & 256) != 0) {
                            strQ2 = gl1.y.Q(o0VarE, R.string.connect_it);
                            i36 &= -234881025;
                        } else {
                            strQ2 = str9;
                        }
                        String strQ15 = gl1.y.Q(o0VarE, R.string.startup_bic_different_device);
                        int i51116 = i26 & (-15);
                        if (i28 != 0) {
                            str13 = null;
                        } else {
                            str13 = str8;
                        }
                        str14 = strQ15;
                        i37 = i51116;
                        if (i34 != 0) {
                            str15 = strQ2;
                            i38 = i36;
                            aVar6 = null;
                        } else {
                            aVar6 = aVar4;
                            str15 = strQ2;
                            i38 = i36;
                        }
                    }
                    o0VarE.h0();
                    x1 x1Var7 = p3.n.f135158a;
                    int i51117 = i38 >> 6;
                    int i51118 = (i51117 & 7168) | (i51117 & 112) | 6 | (i51117 & 896) | (234881024 & i38) | (i38 & 1879048192);
                    int i51119 = i37 << 6;
                    o0Var = o0VarE;
                    String str112 = strQ;
                    da0.p.c(str, str2, aVar, str112, false, null, null, null, str15, aVar2, false, str14, aVar3, false, str13, aVar6, false, false, null, lVar, null, null, z3.f.c(861935458, new e23.q() { // from class: ta0.n
                        /* JADX WARN: Code duplicated, block: B:13:0x00a0  */
                        @Override // e23.q
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            p3.m mVar2 = (p3.m) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            ((c2.a0) obj).getClass();
                            if (mVar2.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                                x1 x1Var8 = p3.n.f135158a;
                                if (z14) {
                                    long j14 = j8;
                                    if (j14 != -1) {
                                        mVar2.C(-1690152377);
                                        String strValueOf = String.valueOf(j14);
                                        h4.r rVarF = x2.f(o3.c(h4.r.S, "ready_to_connect_device_unit_id"), 1.0f);
                                        d92.b.f58623a.getClass();
                                        d92.b.f58625c.getClass();
                                        h4.r rVarC = c2.l.C(rVarF, 0.0f, j92.b.f97899b.f97921f, 0.0f, 0.0f, 13);
                                        d92.b.f58624b.getClass();
                                        s5.x0 x0VarB = d92.c.b(j92.f.f97931h, mVar2);
                                        d6.h.f57752b.getClass();
                                        mh.c(strValueOf, rVarC, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarB, mVar2, 0, 0, 130044);
                                        mVar2 = mVar2;
                                        mVar2.f();
                                    } else {
                                        mVar2.C(-1689749408);
                                        mVar2.f();
                                    }
                                } else {
                                    mVar2.C(-1689749408);
                                    mVar2.f();
                                }
                                String str113 = str4;
                                if (str113 == null) {
                                    mVar2.C(-1689718037);
                                    mVar2.f();
                                } else {
                                    mVar2.C(-1689718036);
                                    h4.r rVarF2 = x2.f(h4.r.S, 1.0f);
                                    d92.b.f58623a.getClass();
                                    d92.b.f58625c.getClass();
                                    h4.r rVarC2 = c2.l.C(rVarF2, 0.0f, j92.b.f97899b.f97921f, 0.0f, 0.0f, 13);
                                    d92.b.f58624b.getClass();
                                    s5.x0 x0VarB2 = d92.c.b(j92.f.f97931h, mVar2);
                                    d6.h.f57752b.getClass();
                                    p3.m mVar3 = mVar2;
                                    mh.c(str113, rVarC2, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarB2, mVar3, 0, 0, 130044);
                                    mVar2 = mVar3;
                                    mVar2.f();
                                }
                                String str114 = str5;
                                if (str114 == null) {
                                    mVar2.C(-1689390677);
                                    mVar2.f();
                                } else {
                                    mVar2.C(-1689390676);
                                    h4.r rVarF3 = x2.f(h4.r.S, 1.0f);
                                    d92.b.f58623a.getClass();
                                    d92.b.f58625c.getClass();
                                    h4.r rVarC3 = c2.l.C(rVarF3, 0.0f, j92.b.f97899b.f97921f, 0.0f, 0.0f, 13);
                                    d92.b.f58624b.getClass();
                                    s5.x0 x0VarB3 = d92.c.b(j92.f.f97931h, mVar2);
                                    d6.h.f57752b.getClass();
                                    p3.m mVar4 = mVar2;
                                    mh.c(str114, rVarC3, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarB3, mVar4, 0, 0, 130044);
                                    mVar4.f();
                                }
                            } else {
                                mVar2.e();
                            }
                            return Unit.INSTANCE;
                        }
                    }, o0VarE), o0Var, i51118, ((i37 << 3) & 1008) | (57344 & i51119) | (i51119 & 458752) | ((i37 << 15) & 1879048192), 3072, 7808240);
                    str12 = str112;
                    str9 = str15;
                    str10 = str14;
                    str11 = str13;
                    aVar5 = aVar6;
                } else {
                    o0Var = o0VarE;
                    o0Var.e();
                    str10 = str7;
                    str11 = str8;
                    str12 = strQ;
                    aVar5 = aVar4;
                }
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new e23.p(str, j8, z14, str2, aVar, str12, str4, str5, str9, aVar2, str10, aVar3, str11, aVar5, lVar, i14, i15, i16) { // from class: ta0.o

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final /* synthetic */ String f163393a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ long f163394b;

                        /* JADX INFO: renamed from: c, reason: collision with root package name */
                        public final /* synthetic */ boolean f163395c;

                        /* JADX INFO: renamed from: d, reason: collision with root package name */
                        public final /* synthetic */ String f163396d;

                        /* JADX INFO: renamed from: e, reason: collision with root package name */
                        public final /* synthetic */ o90.a f163397e;

                        /* JADX INFO: renamed from: f, reason: collision with root package name */
                        public final /* synthetic */ String f163398f;

                        /* JADX INFO: renamed from: g, reason: collision with root package name */
                        public final /* synthetic */ String f163399g;

                        /* JADX INFO: renamed from: h, reason: collision with root package name */
                        public final /* synthetic */ String f163400h;

                        /* JADX INFO: renamed from: i, reason: collision with root package name */
                        public final /* synthetic */ String f163401i;

                        /* JADX INFO: renamed from: j, reason: collision with root package name */
                        public final /* synthetic */ e23.a f163402j;

                        /* JADX INFO: renamed from: k, reason: collision with root package name */
                        public final /* synthetic */ String f163403k;

                        /* JADX INFO: renamed from: l, reason: collision with root package name */
                        public final /* synthetic */ e23.a f163404l;

                        /* JADX INFO: renamed from: m, reason: collision with root package name */
                        public final /* synthetic */ String f163405m;

                        /* JADX INFO: renamed from: n, reason: collision with root package name */
                        public final /* synthetic */ e23.a f163406n;

                        /* JADX INFO: renamed from: o, reason: collision with root package name */
                        public final /* synthetic */ e23.l f163407o;

                        /* JADX INFO: renamed from: p, reason: collision with root package name */
                        public final /* synthetic */ int f163408p;

                        /* JADX INFO: renamed from: q, reason: collision with root package name */
                        public final /* synthetic */ int f163409q;

                        {
                            this.f163408p = i15;
                            this.f163409q = i16;
                        }

                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iT = p3.p0.t(7);
                            int iT2 = p3.p0.t(this.f163408p);
                            q.c(this.f163393a, this.f163394b, this.f163395c, this.f163396d, this.f163397e, this.f163398f, this.f163399g, this.f163400h, this.f163401i, this.f163402j, this.f163403k, this.f163404l, this.f163405m, this.f163406n, this.f163407o, (p3.m) obj, iT, iT2, this.f163409q);
                            return Unit.INSTANCE;
                        }
                    };
                }
            }
            i26 |= 3072;
            i34 = i30;
            if ((i15 & 24576) != 0) {
                i26 |= o0VarE.r(lVar) ? 16384 : 8192;
            }
            if ((i24 & 306783379) == 306783378) {
                z15 = true;
            } else {
                z15 = true;
            }
            if (o0VarE.n(i24 & 1, z15)) {
                o0VarE.G0();
                if ((i14 & 1) != 0) {
                    if ((i16 & 32) != 0) {
                        i36 = i24 & (-458753);
                        strQ = gl1.y.Q(o0VarE, R.string.find_my_watch_found_title);
                    } else {
                        i36 = i24;
                    }
                    if ((i16 & 256) != 0) {
                        strQ2 = gl1.y.Q(o0VarE, R.string.connect_it);
                        i36 &= -234881025;
                    } else {
                        strQ2 = str9;
                    }
                    String strQ16 = gl1.y.Q(o0VarE, R.string.startup_bic_different_device);
                    int i511110 = i26 & (-15);
                    if (i28 != 0) {
                        str13 = null;
                    } else {
                        str13 = str8;
                    }
                    str14 = strQ16;
                    i37 = i511110;
                    if (i34 != 0) {
                        str15 = strQ2;
                        i38 = i36;
                        aVar6 = null;
                    } else {
                        aVar6 = aVar4;
                        str15 = strQ2;
                        i38 = i36;
                    }
                } else {
                    if ((i16 & 32) != 0) {
                        i36 = i24 & (-458753);
                        strQ = gl1.y.Q(o0VarE, R.string.find_my_watch_found_title);
                    } else {
                        i36 = i24;
                    }
                    if ((i16 & 256) != 0) {
                        strQ2 = gl1.y.Q(o0VarE, R.string.connect_it);
                        i36 &= -234881025;
                    } else {
                        strQ2 = str9;
                    }
                    String strQ17 = gl1.y.Q(o0VarE, R.string.startup_bic_different_device);
                    int i511111 = i26 & (-15);
                    if (i28 != 0) {
                        str13 = null;
                    } else {
                        str13 = str8;
                    }
                    str14 = strQ17;
                    i37 = i511111;
                    if (i34 != 0) {
                        str15 = strQ2;
                        i38 = i36;
                        aVar6 = null;
                    } else {
                        aVar6 = aVar4;
                        str15 = strQ2;
                        i38 = i36;
                    }
                }
                o0VarE.h0();
                x1 x1Var8 = p3.n.f135158a;
                int i511112 = i38 >> 6;
                int i511113 = (i511112 & 7168) | (i511112 & 112) | 6 | (i511112 & 896) | (234881024 & i38) | (i38 & 1879048192);
                int i511114 = i37 << 6;
                o0Var = o0VarE;
                String str113 = strQ;
                da0.p.c(str, str2, aVar, str113, false, null, null, null, str15, aVar2, false, str14, aVar3, false, str13, aVar6, false, false, null, lVar, null, null, z3.f.c(861935458, new e23.q() { // from class: ta0.n
                    /* JADX WARN: Code duplicated, block: B:13:0x00a0  */
                    @Override // e23.q
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        p3.m mVar2 = (p3.m) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        ((c2.a0) obj).getClass();
                        if (mVar2.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                            x1 x1Var9 = p3.n.f135158a;
                            if (z14) {
                                long j14 = j8;
                                if (j14 != -1) {
                                    mVar2.C(-1690152377);
                                    String strValueOf = String.valueOf(j14);
                                    h4.r rVarF = x2.f(o3.c(h4.r.S, "ready_to_connect_device_unit_id"), 1.0f);
                                    d92.b.f58623a.getClass();
                                    d92.b.f58625c.getClass();
                                    h4.r rVarC = c2.l.C(rVarF, 0.0f, j92.b.f97899b.f97921f, 0.0f, 0.0f, 13);
                                    d92.b.f58624b.getClass();
                                    s5.x0 x0VarB = d92.c.b(j92.f.f97931h, mVar2);
                                    d6.h.f57752b.getClass();
                                    mh.c(strValueOf, rVarC, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarB, mVar2, 0, 0, 130044);
                                    mVar2 = mVar2;
                                    mVar2.f();
                                } else {
                                    mVar2.C(-1689749408);
                                    mVar2.f();
                                }
                            } else {
                                mVar2.C(-1689749408);
                                mVar2.f();
                            }
                            String str114 = str4;
                            if (str114 == null) {
                                mVar2.C(-1689718037);
                                mVar2.f();
                            } else {
                                mVar2.C(-1689718036);
                                h4.r rVarF2 = x2.f(h4.r.S, 1.0f);
                                d92.b.f58623a.getClass();
                                d92.b.f58625c.getClass();
                                h4.r rVarC2 = c2.l.C(rVarF2, 0.0f, j92.b.f97899b.f97921f, 0.0f, 0.0f, 13);
                                d92.b.f58624b.getClass();
                                s5.x0 x0VarB2 = d92.c.b(j92.f.f97931h, mVar2);
                                d6.h.f57752b.getClass();
                                p3.m mVar3 = mVar2;
                                mh.c(str114, rVarC2, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarB2, mVar3, 0, 0, 130044);
                                mVar2 = mVar3;
                                mVar2.f();
                            }
                            String str115 = str5;
                            if (str115 == null) {
                                mVar2.C(-1689390677);
                                mVar2.f();
                            } else {
                                mVar2.C(-1689390676);
                                h4.r rVarF3 = x2.f(h4.r.S, 1.0f);
                                d92.b.f58623a.getClass();
                                d92.b.f58625c.getClass();
                                h4.r rVarC3 = c2.l.C(rVarF3, 0.0f, j92.b.f97899b.f97921f, 0.0f, 0.0f, 13);
                                d92.b.f58624b.getClass();
                                s5.x0 x0VarB3 = d92.c.b(j92.f.f97931h, mVar2);
                                d6.h.f57752b.getClass();
                                p3.m mVar4 = mVar2;
                                mh.c(str115, rVarC3, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarB3, mVar4, 0, 0, 130044);
                                mVar4.f();
                            }
                        } else {
                            mVar2.e();
                        }
                        return Unit.INSTANCE;
                    }
                }, o0VarE), o0Var, i511113, ((i37 << 3) & 1008) | (57344 & i511114) | (i511114 & 458752) | ((i37 << 15) & 1879048192), 3072, 7808240);
                str12 = str113;
                str9 = str15;
                str10 = str14;
                str11 = str13;
                aVar5 = aVar6;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                str10 = str7;
                str11 = str8;
                str12 = strQ;
                aVar5 = aVar4;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new e23.p(str, j8, z14, str2, aVar, str12, str4, str5, str9, aVar2, str10, aVar3, str11, aVar5, lVar, i14, i15, i16) { // from class: ta0.o

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ String f163393a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ long f163394b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ boolean f163395c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    public final /* synthetic */ String f163396d;

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    public final /* synthetic */ o90.a f163397e;

                    /* JADX INFO: renamed from: f, reason: collision with root package name */
                    public final /* synthetic */ String f163398f;

                    /* JADX INFO: renamed from: g, reason: collision with root package name */
                    public final /* synthetic */ String f163399g;

                    /* JADX INFO: renamed from: h, reason: collision with root package name */
                    public final /* synthetic */ String f163400h;

                    /* JADX INFO: renamed from: i, reason: collision with root package name */
                    public final /* synthetic */ String f163401i;

                    /* JADX INFO: renamed from: j, reason: collision with root package name */
                    public final /* synthetic */ e23.a f163402j;

                    /* JADX INFO: renamed from: k, reason: collision with root package name */
                    public final /* synthetic */ String f163403k;

                    /* JADX INFO: renamed from: l, reason: collision with root package name */
                    public final /* synthetic */ e23.a f163404l;

                    /* JADX INFO: renamed from: m, reason: collision with root package name */
                    public final /* synthetic */ String f163405m;

                    /* JADX INFO: renamed from: n, reason: collision with root package name */
                    public final /* synthetic */ e23.a f163406n;

                    /* JADX INFO: renamed from: o, reason: collision with root package name */
                    public final /* synthetic */ e23.l f163407o;

                    /* JADX INFO: renamed from: p, reason: collision with root package name */
                    public final /* synthetic */ int f163408p;

                    /* JADX INFO: renamed from: q, reason: collision with root package name */
                    public final /* synthetic */ int f163409q;

                    {
                        this.f163408p = i15;
                        this.f163409q = i16;
                    }

                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iT = p3.p0.t(7);
                        int iT2 = p3.p0.t(this.f163408p);
                        q.c(this.f163393a, this.f163394b, this.f163395c, this.f163396d, this.f163397e, this.f163398f, this.f163399g, this.f163400h, this.f163401i, this.f163402j, this.f163403k, this.f163404l, this.f163405m, this.f163406n, this.f163407o, (p3.m) obj, iT, iT2, this.f163409q);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        strQ = str3;
        int i410 = i44 | i45;
        if (o0VarE.B(str4)) {
            i17 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
        } else {
            i17 = 524288;
        }
        int i411 = i410 | i17;
        if (o0VarE.B(str5)) {
            i18 = 8388608;
        } else {
            i18 = 4194304;
        }
        int i412 = i411 | i18;
        if ((i16 & 256) == 0) {
            str9 = str6;
            if (o0VarE.B(str9)) {
            }
            int i521 = i412 | i49;
            if (o0VarE.r(aVar2)) {
                i19 = 536870912;
            } else {
                i19 = 268435456;
            }
            i24 = i521 | i19;
            if ((i15 & 6) == 0) {
                i25 = i15 | 2;
            } else {
                i25 = i15;
            }
            if ((i15 & 48) == 0) {
                if (o0VarE.r(aVar3)) {
                    i39 = 32;
                } else {
                    i39 = 16;
                }
                i25 |= i39;
            }
            i26 = i25;
            i27 = i16 & 4096;
            if (i27 != 0) {
                i28 = i27;
                if ((i15 & 384) == 0) {
                    if (o0VarE.B(str8)) {
                        i29 = 256;
                    } else {
                        i29 = 128;
                    }
                    i26 |= i29;
                }
                i30 = i16 & 8192;
                if (i30 != 0) {
                    i34 = i30;
                    if ((i15 & 3072) == 0) {
                        if (o0VarE.r(aVar4)) {
                            i35 = 2048;
                        } else {
                            i35 = 1024;
                        }
                        i26 |= i35;
                    }
                    if ((i15 & 24576) != 0) {
                        i26 |= o0VarE.r(lVar) ? 16384 : 8192;
                    }
                    if ((i24 & 306783379) == 306783378) {
                        z15 = true;
                    } else {
                        z15 = true;
                    }
                    if (o0VarE.n(i24 & 1, z15)) {
                        o0VarE.G0();
                        if ((i14 & 1) != 0) {
                            if ((i16 & 32) != 0) {
                                i36 = i24 & (-458753);
                                strQ = gl1.y.Q(o0VarE, R.string.find_my_watch_found_title);
                            } else {
                                i36 = i24;
                            }
                            if ((i16 & 256) != 0) {
                                strQ2 = gl1.y.Q(o0VarE, R.string.connect_it);
                                i36 &= -234881025;
                            } else {
                                strQ2 = str9;
                            }
                            String strQ18 = gl1.y.Q(o0VarE, R.string.startup_bic_different_device);
                            int i511115 = i26 & (-15);
                            if (i28 != 0) {
                                str13 = null;
                            } else {
                                str13 = str8;
                            }
                            str14 = strQ18;
                            i37 = i511115;
                            if (i34 != 0) {
                                str15 = strQ2;
                                i38 = i36;
                                aVar6 = null;
                            } else {
                                aVar6 = aVar4;
                                str15 = strQ2;
                                i38 = i36;
                            }
                        } else {
                            if ((i16 & 32) != 0) {
                                i36 = i24 & (-458753);
                                strQ = gl1.y.Q(o0VarE, R.string.find_my_watch_found_title);
                            } else {
                                i36 = i24;
                            }
                            if ((i16 & 256) != 0) {
                                strQ2 = gl1.y.Q(o0VarE, R.string.connect_it);
                                i36 &= -234881025;
                            } else {
                                strQ2 = str9;
                            }
                            String strQ19 = gl1.y.Q(o0VarE, R.string.startup_bic_different_device);
                            int i511116 = i26 & (-15);
                            if (i28 != 0) {
                                str13 = null;
                            } else {
                                str13 = str8;
                            }
                            str14 = strQ19;
                            i37 = i511116;
                            if (i34 != 0) {
                                str15 = strQ2;
                                i38 = i36;
                                aVar6 = null;
                            } else {
                                aVar6 = aVar4;
                                str15 = strQ2;
                                i38 = i36;
                            }
                        }
                        o0VarE.h0();
                        x1 x1Var9 = p3.n.f135158a;
                        int i511117 = i38 >> 6;
                        int i511118 = (i511117 & 7168) | (i511117 & 112) | 6 | (i511117 & 896) | (234881024 & i38) | (i38 & 1879048192);
                        int i511119 = i37 << 6;
                        o0Var = o0VarE;
                        String str114 = strQ;
                        da0.p.c(str, str2, aVar, str114, false, null, null, null, str15, aVar2, false, str14, aVar3, false, str13, aVar6, false, false, null, lVar, null, null, z3.f.c(861935458, new e23.q() { // from class: ta0.n
                            /* JADX WARN: Code duplicated, block: B:13:0x00a0  */
                            @Override // e23.q
                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                p3.m mVar2 = (p3.m) obj2;
                                int iIntValue = ((Integer) obj3).intValue();
                                ((c2.a0) obj).getClass();
                                if (mVar2.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    x1 x1Var10 = p3.n.f135158a;
                                    if (z14) {
                                        long j14 = j8;
                                        if (j14 != -1) {
                                            mVar2.C(-1690152377);
                                            String strValueOf = String.valueOf(j14);
                                            h4.r rVarF = x2.f(o3.c(h4.r.S, "ready_to_connect_device_unit_id"), 1.0f);
                                            d92.b.f58623a.getClass();
                                            d92.b.f58625c.getClass();
                                            h4.r rVarC = c2.l.C(rVarF, 0.0f, j92.b.f97899b.f97921f, 0.0f, 0.0f, 13);
                                            d92.b.f58624b.getClass();
                                            s5.x0 x0VarB = d92.c.b(j92.f.f97931h, mVar2);
                                            d6.h.f57752b.getClass();
                                            mh.c(strValueOf, rVarC, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarB, mVar2, 0, 0, 130044);
                                            mVar2 = mVar2;
                                            mVar2.f();
                                        } else {
                                            mVar2.C(-1689749408);
                                            mVar2.f();
                                        }
                                    } else {
                                        mVar2.C(-1689749408);
                                        mVar2.f();
                                    }
                                    String str115 = str4;
                                    if (str115 == null) {
                                        mVar2.C(-1689718037);
                                        mVar2.f();
                                    } else {
                                        mVar2.C(-1689718036);
                                        h4.r rVarF2 = x2.f(h4.r.S, 1.0f);
                                        d92.b.f58623a.getClass();
                                        d92.b.f58625c.getClass();
                                        h4.r rVarC2 = c2.l.C(rVarF2, 0.0f, j92.b.f97899b.f97921f, 0.0f, 0.0f, 13);
                                        d92.b.f58624b.getClass();
                                        s5.x0 x0VarB2 = d92.c.b(j92.f.f97931h, mVar2);
                                        d6.h.f57752b.getClass();
                                        p3.m mVar3 = mVar2;
                                        mh.c(str115, rVarC2, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarB2, mVar3, 0, 0, 130044);
                                        mVar2 = mVar3;
                                        mVar2.f();
                                    }
                                    String str116 = str5;
                                    if (str116 == null) {
                                        mVar2.C(-1689390677);
                                        mVar2.f();
                                    } else {
                                        mVar2.C(-1689390676);
                                        h4.r rVarF3 = x2.f(h4.r.S, 1.0f);
                                        d92.b.f58623a.getClass();
                                        d92.b.f58625c.getClass();
                                        h4.r rVarC3 = c2.l.C(rVarF3, 0.0f, j92.b.f97899b.f97921f, 0.0f, 0.0f, 13);
                                        d92.b.f58624b.getClass();
                                        s5.x0 x0VarB3 = d92.c.b(j92.f.f97931h, mVar2);
                                        d6.h.f57752b.getClass();
                                        p3.m mVar4 = mVar2;
                                        mh.c(str116, rVarC3, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarB3, mVar4, 0, 0, 130044);
                                        mVar4.f();
                                    }
                                } else {
                                    mVar2.e();
                                }
                                return Unit.INSTANCE;
                            }
                        }, o0VarE), o0Var, i511118, ((i37 << 3) & 1008) | (57344 & i511119) | (i511119 & 458752) | ((i37 << 15) & 1879048192), 3072, 7808240);
                        str12 = str114;
                        str9 = str15;
                        str10 = str14;
                        str11 = str13;
                        aVar5 = aVar6;
                    } else {
                        o0Var = o0VarE;
                        o0Var.e();
                        str10 = str7;
                        str11 = str8;
                        str12 = strQ;
                        aVar5 = aVar4;
                    }
                    p2VarI0 = o0Var.i0();
                    if (p2VarI0 != null) {
                        p2VarI0.f135219d = new e23.p(str, j8, z14, str2, aVar, str12, str4, str5, str9, aVar2, str10, aVar3, str11, aVar5, lVar, i14, i15, i16) { // from class: ta0.o

                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                            public final /* synthetic */ String f163393a;

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            public final /* synthetic */ long f163394b;

                            /* JADX INFO: renamed from: c, reason: collision with root package name */
                            public final /* synthetic */ boolean f163395c;

                            /* JADX INFO: renamed from: d, reason: collision with root package name */
                            public final /* synthetic */ String f163396d;

                            /* JADX INFO: renamed from: e, reason: collision with root package name */
                            public final /* synthetic */ o90.a f163397e;

                            /* JADX INFO: renamed from: f, reason: collision with root package name */
                            public final /* synthetic */ String f163398f;

                            /* JADX INFO: renamed from: g, reason: collision with root package name */
                            public final /* synthetic */ String f163399g;

                            /* JADX INFO: renamed from: h, reason: collision with root package name */
                            public final /* synthetic */ String f163400h;

                            /* JADX INFO: renamed from: i, reason: collision with root package name */
                            public final /* synthetic */ String f163401i;

                            /* JADX INFO: renamed from: j, reason: collision with root package name */
                            public final /* synthetic */ e23.a f163402j;

                            /* JADX INFO: renamed from: k, reason: collision with root package name */
                            public final /* synthetic */ String f163403k;

                            /* JADX INFO: renamed from: l, reason: collision with root package name */
                            public final /* synthetic */ e23.a f163404l;

                            /* JADX INFO: renamed from: m, reason: collision with root package name */
                            public final /* synthetic */ String f163405m;

                            /* JADX INFO: renamed from: n, reason: collision with root package name */
                            public final /* synthetic */ e23.a f163406n;

                            /* JADX INFO: renamed from: o, reason: collision with root package name */
                            public final /* synthetic */ e23.l f163407o;

                            /* JADX INFO: renamed from: p, reason: collision with root package name */
                            public final /* synthetic */ int f163408p;

                            /* JADX INFO: renamed from: q, reason: collision with root package name */
                            public final /* synthetic */ int f163409q;

                            {
                                this.f163408p = i15;
                                this.f163409q = i16;
                            }

                            @Override // e23.p
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iT = p3.p0.t(7);
                                int iT2 = p3.p0.t(this.f163408p);
                                q.c(this.f163393a, this.f163394b, this.f163395c, this.f163396d, this.f163397e, this.f163398f, this.f163399g, this.f163400h, this.f163401i, this.f163402j, this.f163403k, this.f163404l, this.f163405m, this.f163406n, this.f163407o, (p3.m) obj, iT, iT2, this.f163409q);
                                return Unit.INSTANCE;
                            }
                        };
                    }
                }
                i26 |= 3072;
                i34 = i30;
                if ((i15 & 24576) != 0) {
                    i26 |= o0VarE.r(lVar) ? 16384 : 8192;
                }
                if ((i24 & 306783379) == 306783378) {
                    z15 = true;
                } else {
                    z15 = true;
                }
                if (o0VarE.n(i24 & 1, z15)) {
                    o0VarE.G0();
                    if ((i14 & 1) != 0) {
                        if ((i16 & 32) != 0) {
                            i36 = i24 & (-458753);
                            strQ = gl1.y.Q(o0VarE, R.string.find_my_watch_found_title);
                        } else {
                            i36 = i24;
                        }
                        if ((i16 & 256) != 0) {
                            strQ2 = gl1.y.Q(o0VarE, R.string.connect_it);
                            i36 &= -234881025;
                        } else {
                            strQ2 = str9;
                        }
                        String strQ110 = gl1.y.Q(o0VarE, R.string.startup_bic_different_device);
                        int i5111110 = i26 & (-15);
                        if (i28 != 0) {
                            str13 = null;
                        } else {
                            str13 = str8;
                        }
                        str14 = strQ110;
                        i37 = i5111110;
                        if (i34 != 0) {
                            str15 = strQ2;
                            i38 = i36;
                            aVar6 = null;
                        } else {
                            aVar6 = aVar4;
                            str15 = strQ2;
                            i38 = i36;
                        }
                    } else {
                        if ((i16 & 32) != 0) {
                            i36 = i24 & (-458753);
                            strQ = gl1.y.Q(o0VarE, R.string.find_my_watch_found_title);
                        } else {
                            i36 = i24;
                        }
                        if ((i16 & 256) != 0) {
                            strQ2 = gl1.y.Q(o0VarE, R.string.connect_it);
                            i36 &= -234881025;
                        } else {
                            strQ2 = str9;
                        }
                        String strQ111 = gl1.y.Q(o0VarE, R.string.startup_bic_different_device);
                        int i5111111 = i26 & (-15);
                        if (i28 != 0) {
                            str13 = null;
                        } else {
                            str13 = str8;
                        }
                        str14 = strQ111;
                        i37 = i5111111;
                        if (i34 != 0) {
                            str15 = strQ2;
                            i38 = i36;
                            aVar6 = null;
                        } else {
                            aVar6 = aVar4;
                            str15 = strQ2;
                            i38 = i36;
                        }
                    }
                    o0VarE.h0();
                    x1 x1Var10 = p3.n.f135158a;
                    int i5111112 = i38 >> 6;
                    int i5111113 = (i5111112 & 7168) | (i5111112 & 112) | 6 | (i5111112 & 896) | (234881024 & i38) | (i38 & 1879048192);
                    int i5111114 = i37 << 6;
                    o0Var = o0VarE;
                    String str115 = strQ;
                    da0.p.c(str, str2, aVar, str115, false, null, null, null, str15, aVar2, false, str14, aVar3, false, str13, aVar6, false, false, null, lVar, null, null, z3.f.c(861935458, new e23.q() { // from class: ta0.n
                        /* JADX WARN: Code duplicated, block: B:13:0x00a0  */
                        @Override // e23.q
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            p3.m mVar2 = (p3.m) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            ((c2.a0) obj).getClass();
                            if (mVar2.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                                x1 x1Var11 = p3.n.f135158a;
                                if (z14) {
                                    long j14 = j8;
                                    if (j14 != -1) {
                                        mVar2.C(-1690152377);
                                        String strValueOf = String.valueOf(j14);
                                        h4.r rVarF = x2.f(o3.c(h4.r.S, "ready_to_connect_device_unit_id"), 1.0f);
                                        d92.b.f58623a.getClass();
                                        d92.b.f58625c.getClass();
                                        h4.r rVarC = c2.l.C(rVarF, 0.0f, j92.b.f97899b.f97921f, 0.0f, 0.0f, 13);
                                        d92.b.f58624b.getClass();
                                        s5.x0 x0VarB = d92.c.b(j92.f.f97931h, mVar2);
                                        d6.h.f57752b.getClass();
                                        mh.c(strValueOf, rVarC, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarB, mVar2, 0, 0, 130044);
                                        mVar2 = mVar2;
                                        mVar2.f();
                                    } else {
                                        mVar2.C(-1689749408);
                                        mVar2.f();
                                    }
                                } else {
                                    mVar2.C(-1689749408);
                                    mVar2.f();
                                }
                                String str116 = str4;
                                if (str116 == null) {
                                    mVar2.C(-1689718037);
                                    mVar2.f();
                                } else {
                                    mVar2.C(-1689718036);
                                    h4.r rVarF2 = x2.f(h4.r.S, 1.0f);
                                    d92.b.f58623a.getClass();
                                    d92.b.f58625c.getClass();
                                    h4.r rVarC2 = c2.l.C(rVarF2, 0.0f, j92.b.f97899b.f97921f, 0.0f, 0.0f, 13);
                                    d92.b.f58624b.getClass();
                                    s5.x0 x0VarB2 = d92.c.b(j92.f.f97931h, mVar2);
                                    d6.h.f57752b.getClass();
                                    p3.m mVar3 = mVar2;
                                    mh.c(str116, rVarC2, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarB2, mVar3, 0, 0, 130044);
                                    mVar2 = mVar3;
                                    mVar2.f();
                                }
                                String str117 = str5;
                                if (str117 == null) {
                                    mVar2.C(-1689390677);
                                    mVar2.f();
                                } else {
                                    mVar2.C(-1689390676);
                                    h4.r rVarF3 = x2.f(h4.r.S, 1.0f);
                                    d92.b.f58623a.getClass();
                                    d92.b.f58625c.getClass();
                                    h4.r rVarC3 = c2.l.C(rVarF3, 0.0f, j92.b.f97899b.f97921f, 0.0f, 0.0f, 13);
                                    d92.b.f58624b.getClass();
                                    s5.x0 x0VarB3 = d92.c.b(j92.f.f97931h, mVar2);
                                    d6.h.f57752b.getClass();
                                    p3.m mVar4 = mVar2;
                                    mh.c(str117, rVarC3, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarB3, mVar4, 0, 0, 130044);
                                    mVar4.f();
                                }
                            } else {
                                mVar2.e();
                            }
                            return Unit.INSTANCE;
                        }
                    }, o0VarE), o0Var, i5111113, ((i37 << 3) & 1008) | (57344 & i5111114) | (i5111114 & 458752) | ((i37 << 15) & 1879048192), 3072, 7808240);
                    str12 = str115;
                    str9 = str15;
                    str10 = str14;
                    str11 = str13;
                    aVar5 = aVar6;
                } else {
                    o0Var = o0VarE;
                    o0Var.e();
                    str10 = str7;
                    str11 = str8;
                    str12 = strQ;
                    aVar5 = aVar4;
                }
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new e23.p(str, j8, z14, str2, aVar, str12, str4, str5, str9, aVar2, str10, aVar3, str11, aVar5, lVar, i14, i15, i16) { // from class: ta0.o

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final /* synthetic */ String f163393a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ long f163394b;

                        /* JADX INFO: renamed from: c, reason: collision with root package name */
                        public final /* synthetic */ boolean f163395c;

                        /* JADX INFO: renamed from: d, reason: collision with root package name */
                        public final /* synthetic */ String f163396d;

                        /* JADX INFO: renamed from: e, reason: collision with root package name */
                        public final /* synthetic */ o90.a f163397e;

                        /* JADX INFO: renamed from: f, reason: collision with root package name */
                        public final /* synthetic */ String f163398f;

                        /* JADX INFO: renamed from: g, reason: collision with root package name */
                        public final /* synthetic */ String f163399g;

                        /* JADX INFO: renamed from: h, reason: collision with root package name */
                        public final /* synthetic */ String f163400h;

                        /* JADX INFO: renamed from: i, reason: collision with root package name */
                        public final /* synthetic */ String f163401i;

                        /* JADX INFO: renamed from: j, reason: collision with root package name */
                        public final /* synthetic */ e23.a f163402j;

                        /* JADX INFO: renamed from: k, reason: collision with root package name */
                        public final /* synthetic */ String f163403k;

                        /* JADX INFO: renamed from: l, reason: collision with root package name */
                        public final /* synthetic */ e23.a f163404l;

                        /* JADX INFO: renamed from: m, reason: collision with root package name */
                        public final /* synthetic */ String f163405m;

                        /* JADX INFO: renamed from: n, reason: collision with root package name */
                        public final /* synthetic */ e23.a f163406n;

                        /* JADX INFO: renamed from: o, reason: collision with root package name */
                        public final /* synthetic */ e23.l f163407o;

                        /* JADX INFO: renamed from: p, reason: collision with root package name */
                        public final /* synthetic */ int f163408p;

                        /* JADX INFO: renamed from: q, reason: collision with root package name */
                        public final /* synthetic */ int f163409q;

                        {
                            this.f163408p = i15;
                            this.f163409q = i16;
                        }

                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iT = p3.p0.t(7);
                            int iT2 = p3.p0.t(this.f163408p);
                            q.c(this.f163393a, this.f163394b, this.f163395c, this.f163396d, this.f163397e, this.f163398f, this.f163399g, this.f163400h, this.f163401i, this.f163402j, this.f163403k, this.f163404l, this.f163405m, this.f163406n, this.f163407o, (p3.m) obj, iT, iT2, this.f163409q);
                            return Unit.INSTANCE;
                        }
                    };
                }
            }
            i26 |= 384;
            i28 = i27;
            i30 = i16 & 8192;
            if (i30 != 0) {
                i34 = i30;
                if ((i15 & 3072) == 0) {
                    if (o0VarE.r(aVar4)) {
                        i35 = 2048;
                    } else {
                        i35 = 1024;
                    }
                    i26 |= i35;
                }
                if ((i15 & 24576) != 0) {
                    i26 |= o0VarE.r(lVar) ? 16384 : 8192;
                }
                if ((i24 & 306783379) == 306783378) {
                    z15 = true;
                } else {
                    z15 = true;
                }
                if (o0VarE.n(i24 & 1, z15)) {
                    o0VarE.G0();
                    if ((i14 & 1) != 0) {
                        if ((i16 & 32) != 0) {
                            i36 = i24 & (-458753);
                            strQ = gl1.y.Q(o0VarE, R.string.find_my_watch_found_title);
                        } else {
                            i36 = i24;
                        }
                        if ((i16 & 256) != 0) {
                            strQ2 = gl1.y.Q(o0VarE, R.string.connect_it);
                            i36 &= -234881025;
                        } else {
                            strQ2 = str9;
                        }
                        String strQ112 = gl1.y.Q(o0VarE, R.string.startup_bic_different_device);
                        int i5111115 = i26 & (-15);
                        if (i28 != 0) {
                            str13 = null;
                        } else {
                            str13 = str8;
                        }
                        str14 = strQ112;
                        i37 = i5111115;
                        if (i34 != 0) {
                            str15 = strQ2;
                            i38 = i36;
                            aVar6 = null;
                        } else {
                            aVar6 = aVar4;
                            str15 = strQ2;
                            i38 = i36;
                        }
                    } else {
                        if ((i16 & 32) != 0) {
                            i36 = i24 & (-458753);
                            strQ = gl1.y.Q(o0VarE, R.string.find_my_watch_found_title);
                        } else {
                            i36 = i24;
                        }
                        if ((i16 & 256) != 0) {
                            strQ2 = gl1.y.Q(o0VarE, R.string.connect_it);
                            i36 &= -234881025;
                        } else {
                            strQ2 = str9;
                        }
                        String strQ113 = gl1.y.Q(o0VarE, R.string.startup_bic_different_device);
                        int i5111116 = i26 & (-15);
                        if (i28 != 0) {
                            str13 = null;
                        } else {
                            str13 = str8;
                        }
                        str14 = strQ113;
                        i37 = i5111116;
                        if (i34 != 0) {
                            str15 = strQ2;
                            i38 = i36;
                            aVar6 = null;
                        } else {
                            aVar6 = aVar4;
                            str15 = strQ2;
                            i38 = i36;
                        }
                    }
                    o0VarE.h0();
                    x1 x1Var11 = p3.n.f135158a;
                    int i5111117 = i38 >> 6;
                    int i5111118 = (i5111117 & 7168) | (i5111117 & 112) | 6 | (i5111117 & 896) | (234881024 & i38) | (i38 & 1879048192);
                    int i5111119 = i37 << 6;
                    o0Var = o0VarE;
                    String str116 = strQ;
                    da0.p.c(str, str2, aVar, str116, false, null, null, null, str15, aVar2, false, str14, aVar3, false, str13, aVar6, false, false, null, lVar, null, null, z3.f.c(861935458, new e23.q() { // from class: ta0.n
                        /* JADX WARN: Code duplicated, block: B:13:0x00a0  */
                        @Override // e23.q
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            p3.m mVar2 = (p3.m) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            ((c2.a0) obj).getClass();
                            if (mVar2.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                                x1 x1Var12 = p3.n.f135158a;
                                if (z14) {
                                    long j14 = j8;
                                    if (j14 != -1) {
                                        mVar2.C(-1690152377);
                                        String strValueOf = String.valueOf(j14);
                                        h4.r rVarF = x2.f(o3.c(h4.r.S, "ready_to_connect_device_unit_id"), 1.0f);
                                        d92.b.f58623a.getClass();
                                        d92.b.f58625c.getClass();
                                        h4.r rVarC = c2.l.C(rVarF, 0.0f, j92.b.f97899b.f97921f, 0.0f, 0.0f, 13);
                                        d92.b.f58624b.getClass();
                                        s5.x0 x0VarB = d92.c.b(j92.f.f97931h, mVar2);
                                        d6.h.f57752b.getClass();
                                        mh.c(strValueOf, rVarC, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarB, mVar2, 0, 0, 130044);
                                        mVar2 = mVar2;
                                        mVar2.f();
                                    } else {
                                        mVar2.C(-1689749408);
                                        mVar2.f();
                                    }
                                } else {
                                    mVar2.C(-1689749408);
                                    mVar2.f();
                                }
                                String str117 = str4;
                                if (str117 == null) {
                                    mVar2.C(-1689718037);
                                    mVar2.f();
                                } else {
                                    mVar2.C(-1689718036);
                                    h4.r rVarF2 = x2.f(h4.r.S, 1.0f);
                                    d92.b.f58623a.getClass();
                                    d92.b.f58625c.getClass();
                                    h4.r rVarC2 = c2.l.C(rVarF2, 0.0f, j92.b.f97899b.f97921f, 0.0f, 0.0f, 13);
                                    d92.b.f58624b.getClass();
                                    s5.x0 x0VarB2 = d92.c.b(j92.f.f97931h, mVar2);
                                    d6.h.f57752b.getClass();
                                    p3.m mVar3 = mVar2;
                                    mh.c(str117, rVarC2, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarB2, mVar3, 0, 0, 130044);
                                    mVar2 = mVar3;
                                    mVar2.f();
                                }
                                String str118 = str5;
                                if (str118 == null) {
                                    mVar2.C(-1689390677);
                                    mVar2.f();
                                } else {
                                    mVar2.C(-1689390676);
                                    h4.r rVarF3 = x2.f(h4.r.S, 1.0f);
                                    d92.b.f58623a.getClass();
                                    d92.b.f58625c.getClass();
                                    h4.r rVarC3 = c2.l.C(rVarF3, 0.0f, j92.b.f97899b.f97921f, 0.0f, 0.0f, 13);
                                    d92.b.f58624b.getClass();
                                    s5.x0 x0VarB3 = d92.c.b(j92.f.f97931h, mVar2);
                                    d6.h.f57752b.getClass();
                                    p3.m mVar4 = mVar2;
                                    mh.c(str118, rVarC3, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarB3, mVar4, 0, 0, 130044);
                                    mVar4.f();
                                }
                            } else {
                                mVar2.e();
                            }
                            return Unit.INSTANCE;
                        }
                    }, o0VarE), o0Var, i5111118, ((i37 << 3) & 1008) | (57344 & i5111119) | (i5111119 & 458752) | ((i37 << 15) & 1879048192), 3072, 7808240);
                    str12 = str116;
                    str9 = str15;
                    str10 = str14;
                    str11 = str13;
                    aVar5 = aVar6;
                } else {
                    o0Var = o0VarE;
                    o0Var.e();
                    str10 = str7;
                    str11 = str8;
                    str12 = strQ;
                    aVar5 = aVar4;
                }
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new e23.p(str, j8, z14, str2, aVar, str12, str4, str5, str9, aVar2, str10, aVar3, str11, aVar5, lVar, i14, i15, i16) { // from class: ta0.o

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final /* synthetic */ String f163393a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ long f163394b;

                        /* JADX INFO: renamed from: c, reason: collision with root package name */
                        public final /* synthetic */ boolean f163395c;

                        /* JADX INFO: renamed from: d, reason: collision with root package name */
                        public final /* synthetic */ String f163396d;

                        /* JADX INFO: renamed from: e, reason: collision with root package name */
                        public final /* synthetic */ o90.a f163397e;

                        /* JADX INFO: renamed from: f, reason: collision with root package name */
                        public final /* synthetic */ String f163398f;

                        /* JADX INFO: renamed from: g, reason: collision with root package name */
                        public final /* synthetic */ String f163399g;

                        /* JADX INFO: renamed from: h, reason: collision with root package name */
                        public final /* synthetic */ String f163400h;

                        /* JADX INFO: renamed from: i, reason: collision with root package name */
                        public final /* synthetic */ String f163401i;

                        /* JADX INFO: renamed from: j, reason: collision with root package name */
                        public final /* synthetic */ e23.a f163402j;

                        /* JADX INFO: renamed from: k, reason: collision with root package name */
                        public final /* synthetic */ String f163403k;

                        /* JADX INFO: renamed from: l, reason: collision with root package name */
                        public final /* synthetic */ e23.a f163404l;

                        /* JADX INFO: renamed from: m, reason: collision with root package name */
                        public final /* synthetic */ String f163405m;

                        /* JADX INFO: renamed from: n, reason: collision with root package name */
                        public final /* synthetic */ e23.a f163406n;

                        /* JADX INFO: renamed from: o, reason: collision with root package name */
                        public final /* synthetic */ e23.l f163407o;

                        /* JADX INFO: renamed from: p, reason: collision with root package name */
                        public final /* synthetic */ int f163408p;

                        /* JADX INFO: renamed from: q, reason: collision with root package name */
                        public final /* synthetic */ int f163409q;

                        {
                            this.f163408p = i15;
                            this.f163409q = i16;
                        }

                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iT = p3.p0.t(7);
                            int iT2 = p3.p0.t(this.f163408p);
                            q.c(this.f163393a, this.f163394b, this.f163395c, this.f163396d, this.f163397e, this.f163398f, this.f163399g, this.f163400h, this.f163401i, this.f163402j, this.f163403k, this.f163404l, this.f163405m, this.f163406n, this.f163407o, (p3.m) obj, iT, iT2, this.f163409q);
                            return Unit.INSTANCE;
                        }
                    };
                }
            }
            i26 |= 3072;
            i34 = i30;
            if ((i15 & 24576) != 0) {
                i26 |= o0VarE.r(lVar) ? 16384 : 8192;
            }
            if ((i24 & 306783379) == 306783378) {
                z15 = true;
            } else {
                z15 = true;
            }
            if (o0VarE.n(i24 & 1, z15)) {
                o0VarE.G0();
                if ((i14 & 1) != 0) {
                    if ((i16 & 32) != 0) {
                        i36 = i24 & (-458753);
                        strQ = gl1.y.Q(o0VarE, R.string.find_my_watch_found_title);
                    } else {
                        i36 = i24;
                    }
                    if ((i16 & 256) != 0) {
                        strQ2 = gl1.y.Q(o0VarE, R.string.connect_it);
                        i36 &= -234881025;
                    } else {
                        strQ2 = str9;
                    }
                    String strQ114 = gl1.y.Q(o0VarE, R.string.startup_bic_different_device);
                    int i51111110 = i26 & (-15);
                    if (i28 != 0) {
                        str13 = null;
                    } else {
                        str13 = str8;
                    }
                    str14 = strQ114;
                    i37 = i51111110;
                    if (i34 != 0) {
                        str15 = strQ2;
                        i38 = i36;
                        aVar6 = null;
                    } else {
                        aVar6 = aVar4;
                        str15 = strQ2;
                        i38 = i36;
                    }
                } else {
                    if ((i16 & 32) != 0) {
                        i36 = i24 & (-458753);
                        strQ = gl1.y.Q(o0VarE, R.string.find_my_watch_found_title);
                    } else {
                        i36 = i24;
                    }
                    if ((i16 & 256) != 0) {
                        strQ2 = gl1.y.Q(o0VarE, R.string.connect_it);
                        i36 &= -234881025;
                    } else {
                        strQ2 = str9;
                    }
                    String strQ115 = gl1.y.Q(o0VarE, R.string.startup_bic_different_device);
                    int i51111111 = i26 & (-15);
                    if (i28 != 0) {
                        str13 = null;
                    } else {
                        str13 = str8;
                    }
                    str14 = strQ115;
                    i37 = i51111111;
                    if (i34 != 0) {
                        str15 = strQ2;
                        i38 = i36;
                        aVar6 = null;
                    } else {
                        aVar6 = aVar4;
                        str15 = strQ2;
                        i38 = i36;
                    }
                }
                o0VarE.h0();
                x1 x1Var12 = p3.n.f135158a;
                int i51111112 = i38 >> 6;
                int i51111113 = (i51111112 & 7168) | (i51111112 & 112) | 6 | (i51111112 & 896) | (234881024 & i38) | (i38 & 1879048192);
                int i51111114 = i37 << 6;
                o0Var = o0VarE;
                String str117 = strQ;
                da0.p.c(str, str2, aVar, str117, false, null, null, null, str15, aVar2, false, str14, aVar3, false, str13, aVar6, false, false, null, lVar, null, null, z3.f.c(861935458, new e23.q() { // from class: ta0.n
                    /* JADX WARN: Code duplicated, block: B:13:0x00a0  */
                    @Override // e23.q
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        p3.m mVar2 = (p3.m) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        ((c2.a0) obj).getClass();
                        if (mVar2.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                            x1 x1Var13 = p3.n.f135158a;
                            if (z14) {
                                long j14 = j8;
                                if (j14 != -1) {
                                    mVar2.C(-1690152377);
                                    String strValueOf = String.valueOf(j14);
                                    h4.r rVarF = x2.f(o3.c(h4.r.S, "ready_to_connect_device_unit_id"), 1.0f);
                                    d92.b.f58623a.getClass();
                                    d92.b.f58625c.getClass();
                                    h4.r rVarC = c2.l.C(rVarF, 0.0f, j92.b.f97899b.f97921f, 0.0f, 0.0f, 13);
                                    d92.b.f58624b.getClass();
                                    s5.x0 x0VarB = d92.c.b(j92.f.f97931h, mVar2);
                                    d6.h.f57752b.getClass();
                                    mh.c(strValueOf, rVarC, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarB, mVar2, 0, 0, 130044);
                                    mVar2 = mVar2;
                                    mVar2.f();
                                } else {
                                    mVar2.C(-1689749408);
                                    mVar2.f();
                                }
                            } else {
                                mVar2.C(-1689749408);
                                mVar2.f();
                            }
                            String str118 = str4;
                            if (str118 == null) {
                                mVar2.C(-1689718037);
                                mVar2.f();
                            } else {
                                mVar2.C(-1689718036);
                                h4.r rVarF2 = x2.f(h4.r.S, 1.0f);
                                d92.b.f58623a.getClass();
                                d92.b.f58625c.getClass();
                                h4.r rVarC2 = c2.l.C(rVarF2, 0.0f, j92.b.f97899b.f97921f, 0.0f, 0.0f, 13);
                                d92.b.f58624b.getClass();
                                s5.x0 x0VarB2 = d92.c.b(j92.f.f97931h, mVar2);
                                d6.h.f57752b.getClass();
                                p3.m mVar3 = mVar2;
                                mh.c(str118, rVarC2, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarB2, mVar3, 0, 0, 130044);
                                mVar2 = mVar3;
                                mVar2.f();
                            }
                            String str119 = str5;
                            if (str119 == null) {
                                mVar2.C(-1689390677);
                                mVar2.f();
                            } else {
                                mVar2.C(-1689390676);
                                h4.r rVarF3 = x2.f(h4.r.S, 1.0f);
                                d92.b.f58623a.getClass();
                                d92.b.f58625c.getClass();
                                h4.r rVarC3 = c2.l.C(rVarF3, 0.0f, j92.b.f97899b.f97921f, 0.0f, 0.0f, 13);
                                d92.b.f58624b.getClass();
                                s5.x0 x0VarB3 = d92.c.b(j92.f.f97931h, mVar2);
                                d6.h.f57752b.getClass();
                                p3.m mVar4 = mVar2;
                                mh.c(str119, rVarC3, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarB3, mVar4, 0, 0, 130044);
                                mVar4.f();
                            }
                        } else {
                            mVar2.e();
                        }
                        return Unit.INSTANCE;
                    }
                }, o0VarE), o0Var, i51111113, ((i37 << 3) & 1008) | (57344 & i51111114) | (i51111114 & 458752) | ((i37 << 15) & 1879048192), 3072, 7808240);
                str12 = str117;
                str9 = str15;
                str10 = str14;
                str11 = str13;
                aVar5 = aVar6;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                str10 = str7;
                str11 = str8;
                str12 = strQ;
                aVar5 = aVar4;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new e23.p(str, j8, z14, str2, aVar, str12, str4, str5, str9, aVar2, str10, aVar3, str11, aVar5, lVar, i14, i15, i16) { // from class: ta0.o

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ String f163393a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ long f163394b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ boolean f163395c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    public final /* synthetic */ String f163396d;

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    public final /* synthetic */ o90.a f163397e;

                    /* JADX INFO: renamed from: f, reason: collision with root package name */
                    public final /* synthetic */ String f163398f;

                    /* JADX INFO: renamed from: g, reason: collision with root package name */
                    public final /* synthetic */ String f163399g;

                    /* JADX INFO: renamed from: h, reason: collision with root package name */
                    public final /* synthetic */ String f163400h;

                    /* JADX INFO: renamed from: i, reason: collision with root package name */
                    public final /* synthetic */ String f163401i;

                    /* JADX INFO: renamed from: j, reason: collision with root package name */
                    public final /* synthetic */ e23.a f163402j;

                    /* JADX INFO: renamed from: k, reason: collision with root package name */
                    public final /* synthetic */ String f163403k;

                    /* JADX INFO: renamed from: l, reason: collision with root package name */
                    public final /* synthetic */ e23.a f163404l;

                    /* JADX INFO: renamed from: m, reason: collision with root package name */
                    public final /* synthetic */ String f163405m;

                    /* JADX INFO: renamed from: n, reason: collision with root package name */
                    public final /* synthetic */ e23.a f163406n;

                    /* JADX INFO: renamed from: o, reason: collision with root package name */
                    public final /* synthetic */ e23.l f163407o;

                    /* JADX INFO: renamed from: p, reason: collision with root package name */
                    public final /* synthetic */ int f163408p;

                    /* JADX INFO: renamed from: q, reason: collision with root package name */
                    public final /* synthetic */ int f163409q;

                    {
                        this.f163408p = i15;
                        this.f163409q = i16;
                    }

                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iT = p3.p0.t(7);
                        int iT2 = p3.p0.t(this.f163408p);
                        q.c(this.f163393a, this.f163394b, this.f163395c, this.f163396d, this.f163397e, this.f163398f, this.f163399g, this.f163400h, this.f163401i, this.f163402j, this.f163403k, this.f163404l, this.f163405m, this.f163406n, this.f163407o, (p3.m) obj, iT, iT2, this.f163409q);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        str9 = str6;
        int i522 = i412 | i49;
        if (o0VarE.r(aVar2)) {
            i19 = 536870912;
        } else {
            i19 = 268435456;
        }
        i24 = i522 | i19;
        if ((i15 & 6) == 0) {
            i25 = i15 | 2;
        } else {
            i25 = i15;
        }
        if ((i15 & 48) == 0) {
            if (o0VarE.r(aVar3)) {
                i39 = 32;
            } else {
                i39 = 16;
            }
            i25 |= i39;
        }
        i26 = i25;
        i27 = i16 & 4096;
        if (i27 != 0) {
            i28 = i27;
            if ((i15 & 384) == 0) {
                if (o0VarE.B(str8)) {
                    i29 = 256;
                } else {
                    i29 = 128;
                }
                i26 |= i29;
            }
            i30 = i16 & 8192;
            if (i30 != 0) {
                i34 = i30;
                if ((i15 & 3072) == 0) {
                    if (o0VarE.r(aVar4)) {
                        i35 = 2048;
                    } else {
                        i35 = 1024;
                    }
                    i26 |= i35;
                }
                if ((i15 & 24576) != 0) {
                    i26 |= o0VarE.r(lVar) ? 16384 : 8192;
                }
                if ((i24 & 306783379) == 306783378) {
                    z15 = true;
                } else {
                    z15 = true;
                }
                if (o0VarE.n(i24 & 1, z15)) {
                    o0VarE.G0();
                    if ((i14 & 1) != 0) {
                        if ((i16 & 32) != 0) {
                            i36 = i24 & (-458753);
                            strQ = gl1.y.Q(o0VarE, R.string.find_my_watch_found_title);
                        } else {
                            i36 = i24;
                        }
                        if ((i16 & 256) != 0) {
                            strQ2 = gl1.y.Q(o0VarE, R.string.connect_it);
                            i36 &= -234881025;
                        } else {
                            strQ2 = str9;
                        }
                        String strQ116 = gl1.y.Q(o0VarE, R.string.startup_bic_different_device);
                        int i51111115 = i26 & (-15);
                        if (i28 != 0) {
                            str13 = null;
                        } else {
                            str13 = str8;
                        }
                        str14 = strQ116;
                        i37 = i51111115;
                        if (i34 != 0) {
                            str15 = strQ2;
                            i38 = i36;
                            aVar6 = null;
                        } else {
                            aVar6 = aVar4;
                            str15 = strQ2;
                            i38 = i36;
                        }
                    } else {
                        if ((i16 & 32) != 0) {
                            i36 = i24 & (-458753);
                            strQ = gl1.y.Q(o0VarE, R.string.find_my_watch_found_title);
                        } else {
                            i36 = i24;
                        }
                        if ((i16 & 256) != 0) {
                            strQ2 = gl1.y.Q(o0VarE, R.string.connect_it);
                            i36 &= -234881025;
                        } else {
                            strQ2 = str9;
                        }
                        String strQ117 = gl1.y.Q(o0VarE, R.string.startup_bic_different_device);
                        int i51111116 = i26 & (-15);
                        if (i28 != 0) {
                            str13 = null;
                        } else {
                            str13 = str8;
                        }
                        str14 = strQ117;
                        i37 = i51111116;
                        if (i34 != 0) {
                            str15 = strQ2;
                            i38 = i36;
                            aVar6 = null;
                        } else {
                            aVar6 = aVar4;
                            str15 = strQ2;
                            i38 = i36;
                        }
                    }
                    o0VarE.h0();
                    x1 x1Var13 = p3.n.f135158a;
                    int i51111117 = i38 >> 6;
                    int i51111118 = (i51111117 & 7168) | (i51111117 & 112) | 6 | (i51111117 & 896) | (234881024 & i38) | (i38 & 1879048192);
                    int i51111119 = i37 << 6;
                    o0Var = o0VarE;
                    String str118 = strQ;
                    da0.p.c(str, str2, aVar, str118, false, null, null, null, str15, aVar2, false, str14, aVar3, false, str13, aVar6, false, false, null, lVar, null, null, z3.f.c(861935458, new e23.q() { // from class: ta0.n
                        /* JADX WARN: Code duplicated, block: B:13:0x00a0  */
                        @Override // e23.q
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            p3.m mVar2 = (p3.m) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            ((c2.a0) obj).getClass();
                            if (mVar2.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                                x1 x1Var14 = p3.n.f135158a;
                                if (z14) {
                                    long j14 = j8;
                                    if (j14 != -1) {
                                        mVar2.C(-1690152377);
                                        String strValueOf = String.valueOf(j14);
                                        h4.r rVarF = x2.f(o3.c(h4.r.S, "ready_to_connect_device_unit_id"), 1.0f);
                                        d92.b.f58623a.getClass();
                                        d92.b.f58625c.getClass();
                                        h4.r rVarC = c2.l.C(rVarF, 0.0f, j92.b.f97899b.f97921f, 0.0f, 0.0f, 13);
                                        d92.b.f58624b.getClass();
                                        s5.x0 x0VarB = d92.c.b(j92.f.f97931h, mVar2);
                                        d6.h.f57752b.getClass();
                                        mh.c(strValueOf, rVarC, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarB, mVar2, 0, 0, 130044);
                                        mVar2 = mVar2;
                                        mVar2.f();
                                    } else {
                                        mVar2.C(-1689749408);
                                        mVar2.f();
                                    }
                                } else {
                                    mVar2.C(-1689749408);
                                    mVar2.f();
                                }
                                String str119 = str4;
                                if (str119 == null) {
                                    mVar2.C(-1689718037);
                                    mVar2.f();
                                } else {
                                    mVar2.C(-1689718036);
                                    h4.r rVarF2 = x2.f(h4.r.S, 1.0f);
                                    d92.b.f58623a.getClass();
                                    d92.b.f58625c.getClass();
                                    h4.r rVarC2 = c2.l.C(rVarF2, 0.0f, j92.b.f97899b.f97921f, 0.0f, 0.0f, 13);
                                    d92.b.f58624b.getClass();
                                    s5.x0 x0VarB2 = d92.c.b(j92.f.f97931h, mVar2);
                                    d6.h.f57752b.getClass();
                                    p3.m mVar3 = mVar2;
                                    mh.c(str119, rVarC2, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarB2, mVar3, 0, 0, 130044);
                                    mVar2 = mVar3;
                                    mVar2.f();
                                }
                                String str1110 = str5;
                                if (str1110 == null) {
                                    mVar2.C(-1689390677);
                                    mVar2.f();
                                } else {
                                    mVar2.C(-1689390676);
                                    h4.r rVarF3 = x2.f(h4.r.S, 1.0f);
                                    d92.b.f58623a.getClass();
                                    d92.b.f58625c.getClass();
                                    h4.r rVarC3 = c2.l.C(rVarF3, 0.0f, j92.b.f97899b.f97921f, 0.0f, 0.0f, 13);
                                    d92.b.f58624b.getClass();
                                    s5.x0 x0VarB3 = d92.c.b(j92.f.f97931h, mVar2);
                                    d6.h.f57752b.getClass();
                                    p3.m mVar4 = mVar2;
                                    mh.c(str1110, rVarC3, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarB3, mVar4, 0, 0, 130044);
                                    mVar4.f();
                                }
                            } else {
                                mVar2.e();
                            }
                            return Unit.INSTANCE;
                        }
                    }, o0VarE), o0Var, i51111118, ((i37 << 3) & 1008) | (57344 & i51111119) | (i51111119 & 458752) | ((i37 << 15) & 1879048192), 3072, 7808240);
                    str12 = str118;
                    str9 = str15;
                    str10 = str14;
                    str11 = str13;
                    aVar5 = aVar6;
                } else {
                    o0Var = o0VarE;
                    o0Var.e();
                    str10 = str7;
                    str11 = str8;
                    str12 = strQ;
                    aVar5 = aVar4;
                }
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new e23.p(str, j8, z14, str2, aVar, str12, str4, str5, str9, aVar2, str10, aVar3, str11, aVar5, lVar, i14, i15, i16) { // from class: ta0.o

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final /* synthetic */ String f163393a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ long f163394b;

                        /* JADX INFO: renamed from: c, reason: collision with root package name */
                        public final /* synthetic */ boolean f163395c;

                        /* JADX INFO: renamed from: d, reason: collision with root package name */
                        public final /* synthetic */ String f163396d;

                        /* JADX INFO: renamed from: e, reason: collision with root package name */
                        public final /* synthetic */ o90.a f163397e;

                        /* JADX INFO: renamed from: f, reason: collision with root package name */
                        public final /* synthetic */ String f163398f;

                        /* JADX INFO: renamed from: g, reason: collision with root package name */
                        public final /* synthetic */ String f163399g;

                        /* JADX INFO: renamed from: h, reason: collision with root package name */
                        public final /* synthetic */ String f163400h;

                        /* JADX INFO: renamed from: i, reason: collision with root package name */
                        public final /* synthetic */ String f163401i;

                        /* JADX INFO: renamed from: j, reason: collision with root package name */
                        public final /* synthetic */ e23.a f163402j;

                        /* JADX INFO: renamed from: k, reason: collision with root package name */
                        public final /* synthetic */ String f163403k;

                        /* JADX INFO: renamed from: l, reason: collision with root package name */
                        public final /* synthetic */ e23.a f163404l;

                        /* JADX INFO: renamed from: m, reason: collision with root package name */
                        public final /* synthetic */ String f163405m;

                        /* JADX INFO: renamed from: n, reason: collision with root package name */
                        public final /* synthetic */ e23.a f163406n;

                        /* JADX INFO: renamed from: o, reason: collision with root package name */
                        public final /* synthetic */ e23.l f163407o;

                        /* JADX INFO: renamed from: p, reason: collision with root package name */
                        public final /* synthetic */ int f163408p;

                        /* JADX INFO: renamed from: q, reason: collision with root package name */
                        public final /* synthetic */ int f163409q;

                        {
                            this.f163408p = i15;
                            this.f163409q = i16;
                        }

                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iT = p3.p0.t(7);
                            int iT2 = p3.p0.t(this.f163408p);
                            q.c(this.f163393a, this.f163394b, this.f163395c, this.f163396d, this.f163397e, this.f163398f, this.f163399g, this.f163400h, this.f163401i, this.f163402j, this.f163403k, this.f163404l, this.f163405m, this.f163406n, this.f163407o, (p3.m) obj, iT, iT2, this.f163409q);
                            return Unit.INSTANCE;
                        }
                    };
                }
            }
            i26 |= 3072;
            i34 = i30;
            if ((i15 & 24576) != 0) {
                i26 |= o0VarE.r(lVar) ? 16384 : 8192;
            }
            if ((i24 & 306783379) == 306783378) {
                z15 = true;
            } else {
                z15 = true;
            }
            if (o0VarE.n(i24 & 1, z15)) {
                o0VarE.G0();
                if ((i14 & 1) != 0) {
                    if ((i16 & 32) != 0) {
                        i36 = i24 & (-458753);
                        strQ = gl1.y.Q(o0VarE, R.string.find_my_watch_found_title);
                    } else {
                        i36 = i24;
                    }
                    if ((i16 & 256) != 0) {
                        strQ2 = gl1.y.Q(o0VarE, R.string.connect_it);
                        i36 &= -234881025;
                    } else {
                        strQ2 = str9;
                    }
                    String strQ118 = gl1.y.Q(o0VarE, R.string.startup_bic_different_device);
                    int i511111110 = i26 & (-15);
                    if (i28 != 0) {
                        str13 = null;
                    } else {
                        str13 = str8;
                    }
                    str14 = strQ118;
                    i37 = i511111110;
                    if (i34 != 0) {
                        str15 = strQ2;
                        i38 = i36;
                        aVar6 = null;
                    } else {
                        aVar6 = aVar4;
                        str15 = strQ2;
                        i38 = i36;
                    }
                } else {
                    if ((i16 & 32) != 0) {
                        i36 = i24 & (-458753);
                        strQ = gl1.y.Q(o0VarE, R.string.find_my_watch_found_title);
                    } else {
                        i36 = i24;
                    }
                    if ((i16 & 256) != 0) {
                        strQ2 = gl1.y.Q(o0VarE, R.string.connect_it);
                        i36 &= -234881025;
                    } else {
                        strQ2 = str9;
                    }
                    String strQ119 = gl1.y.Q(o0VarE, R.string.startup_bic_different_device);
                    int i511111111 = i26 & (-15);
                    if (i28 != 0) {
                        str13 = null;
                    } else {
                        str13 = str8;
                    }
                    str14 = strQ119;
                    i37 = i511111111;
                    if (i34 != 0) {
                        str15 = strQ2;
                        i38 = i36;
                        aVar6 = null;
                    } else {
                        aVar6 = aVar4;
                        str15 = strQ2;
                        i38 = i36;
                    }
                }
                o0VarE.h0();
                x1 x1Var14 = p3.n.f135158a;
                int i511111112 = i38 >> 6;
                int i511111113 = (i511111112 & 7168) | (i511111112 & 112) | 6 | (i511111112 & 896) | (234881024 & i38) | (i38 & 1879048192);
                int i511111114 = i37 << 6;
                o0Var = o0VarE;
                String str119 = strQ;
                da0.p.c(str, str2, aVar, str119, false, null, null, null, str15, aVar2, false, str14, aVar3, false, str13, aVar6, false, false, null, lVar, null, null, z3.f.c(861935458, new e23.q() { // from class: ta0.n
                    /* JADX WARN: Code duplicated, block: B:13:0x00a0  */
                    @Override // e23.q
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        p3.m mVar2 = (p3.m) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        ((c2.a0) obj).getClass();
                        if (mVar2.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                            x1 x1Var15 = p3.n.f135158a;
                            if (z14) {
                                long j14 = j8;
                                if (j14 != -1) {
                                    mVar2.C(-1690152377);
                                    String strValueOf = String.valueOf(j14);
                                    h4.r rVarF = x2.f(o3.c(h4.r.S, "ready_to_connect_device_unit_id"), 1.0f);
                                    d92.b.f58623a.getClass();
                                    d92.b.f58625c.getClass();
                                    h4.r rVarC = c2.l.C(rVarF, 0.0f, j92.b.f97899b.f97921f, 0.0f, 0.0f, 13);
                                    d92.b.f58624b.getClass();
                                    s5.x0 x0VarB = d92.c.b(j92.f.f97931h, mVar2);
                                    d6.h.f57752b.getClass();
                                    mh.c(strValueOf, rVarC, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarB, mVar2, 0, 0, 130044);
                                    mVar2 = mVar2;
                                    mVar2.f();
                                } else {
                                    mVar2.C(-1689749408);
                                    mVar2.f();
                                }
                            } else {
                                mVar2.C(-1689749408);
                                mVar2.f();
                            }
                            String str1110 = str4;
                            if (str1110 == null) {
                                mVar2.C(-1689718037);
                                mVar2.f();
                            } else {
                                mVar2.C(-1689718036);
                                h4.r rVarF2 = x2.f(h4.r.S, 1.0f);
                                d92.b.f58623a.getClass();
                                d92.b.f58625c.getClass();
                                h4.r rVarC2 = c2.l.C(rVarF2, 0.0f, j92.b.f97899b.f97921f, 0.0f, 0.0f, 13);
                                d92.b.f58624b.getClass();
                                s5.x0 x0VarB2 = d92.c.b(j92.f.f97931h, mVar2);
                                d6.h.f57752b.getClass();
                                p3.m mVar3 = mVar2;
                                mh.c(str1110, rVarC2, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarB2, mVar3, 0, 0, 130044);
                                mVar2 = mVar3;
                                mVar2.f();
                            }
                            String str1111 = str5;
                            if (str1111 == null) {
                                mVar2.C(-1689390677);
                                mVar2.f();
                            } else {
                                mVar2.C(-1689390676);
                                h4.r rVarF3 = x2.f(h4.r.S, 1.0f);
                                d92.b.f58623a.getClass();
                                d92.b.f58625c.getClass();
                                h4.r rVarC3 = c2.l.C(rVarF3, 0.0f, j92.b.f97899b.f97921f, 0.0f, 0.0f, 13);
                                d92.b.f58624b.getClass();
                                s5.x0 x0VarB3 = d92.c.b(j92.f.f97931h, mVar2);
                                d6.h.f57752b.getClass();
                                p3.m mVar4 = mVar2;
                                mh.c(str1111, rVarC3, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarB3, mVar4, 0, 0, 130044);
                                mVar4.f();
                            }
                        } else {
                            mVar2.e();
                        }
                        return Unit.INSTANCE;
                    }
                }, o0VarE), o0Var, i511111113, ((i37 << 3) & 1008) | (57344 & i511111114) | (i511111114 & 458752) | ((i37 << 15) & 1879048192), 3072, 7808240);
                str12 = str119;
                str9 = str15;
                str10 = str14;
                str11 = str13;
                aVar5 = aVar6;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                str10 = str7;
                str11 = str8;
                str12 = strQ;
                aVar5 = aVar4;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new e23.p(str, j8, z14, str2, aVar, str12, str4, str5, str9, aVar2, str10, aVar3, str11, aVar5, lVar, i14, i15, i16) { // from class: ta0.o

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ String f163393a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ long f163394b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ boolean f163395c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    public final /* synthetic */ String f163396d;

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    public final /* synthetic */ o90.a f163397e;

                    /* JADX INFO: renamed from: f, reason: collision with root package name */
                    public final /* synthetic */ String f163398f;

                    /* JADX INFO: renamed from: g, reason: collision with root package name */
                    public final /* synthetic */ String f163399g;

                    /* JADX INFO: renamed from: h, reason: collision with root package name */
                    public final /* synthetic */ String f163400h;

                    /* JADX INFO: renamed from: i, reason: collision with root package name */
                    public final /* synthetic */ String f163401i;

                    /* JADX INFO: renamed from: j, reason: collision with root package name */
                    public final /* synthetic */ e23.a f163402j;

                    /* JADX INFO: renamed from: k, reason: collision with root package name */
                    public final /* synthetic */ String f163403k;

                    /* JADX INFO: renamed from: l, reason: collision with root package name */
                    public final /* synthetic */ e23.a f163404l;

                    /* JADX INFO: renamed from: m, reason: collision with root package name */
                    public final /* synthetic */ String f163405m;

                    /* JADX INFO: renamed from: n, reason: collision with root package name */
                    public final /* synthetic */ e23.a f163406n;

                    /* JADX INFO: renamed from: o, reason: collision with root package name */
                    public final /* synthetic */ e23.l f163407o;

                    /* JADX INFO: renamed from: p, reason: collision with root package name */
                    public final /* synthetic */ int f163408p;

                    /* JADX INFO: renamed from: q, reason: collision with root package name */
                    public final /* synthetic */ int f163409q;

                    {
                        this.f163408p = i15;
                        this.f163409q = i16;
                    }

                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iT = p3.p0.t(7);
                        int iT2 = p3.p0.t(this.f163408p);
                        q.c(this.f163393a, this.f163394b, this.f163395c, this.f163396d, this.f163397e, this.f163398f, this.f163399g, this.f163400h, this.f163401i, this.f163402j, this.f163403k, this.f163404l, this.f163405m, this.f163406n, this.f163407o, (p3.m) obj, iT, iT2, this.f163409q);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        i26 |= 384;
        i28 = i27;
        i30 = i16 & 8192;
        if (i30 != 0) {
            i34 = i30;
            if ((i15 & 3072) == 0) {
                if (o0VarE.r(aVar4)) {
                    i35 = 2048;
                } else {
                    i35 = 1024;
                }
                i26 |= i35;
            }
            if ((i15 & 24576) != 0) {
                i26 |= o0VarE.r(lVar) ? 16384 : 8192;
            }
            if ((i24 & 306783379) == 306783378) {
                z15 = true;
            } else {
                z15 = true;
            }
            if (o0VarE.n(i24 & 1, z15)) {
                o0VarE.G0();
                if ((i14 & 1) != 0) {
                    if ((i16 & 32) != 0) {
                        i36 = i24 & (-458753);
                        strQ = gl1.y.Q(o0VarE, R.string.find_my_watch_found_title);
                    } else {
                        i36 = i24;
                    }
                    if ((i16 & 256) != 0) {
                        strQ2 = gl1.y.Q(o0VarE, R.string.connect_it);
                        i36 &= -234881025;
                    } else {
                        strQ2 = str9;
                    }
                    String strQ1110 = gl1.y.Q(o0VarE, R.string.startup_bic_different_device);
                    int i511111115 = i26 & (-15);
                    if (i28 != 0) {
                        str13 = null;
                    } else {
                        str13 = str8;
                    }
                    str14 = strQ1110;
                    i37 = i511111115;
                    if (i34 != 0) {
                        str15 = strQ2;
                        i38 = i36;
                        aVar6 = null;
                    } else {
                        aVar6 = aVar4;
                        str15 = strQ2;
                        i38 = i36;
                    }
                } else {
                    if ((i16 & 32) != 0) {
                        i36 = i24 & (-458753);
                        strQ = gl1.y.Q(o0VarE, R.string.find_my_watch_found_title);
                    } else {
                        i36 = i24;
                    }
                    if ((i16 & 256) != 0) {
                        strQ2 = gl1.y.Q(o0VarE, R.string.connect_it);
                        i36 &= -234881025;
                    } else {
                        strQ2 = str9;
                    }
                    String strQ1111 = gl1.y.Q(o0VarE, R.string.startup_bic_different_device);
                    int i511111116 = i26 & (-15);
                    if (i28 != 0) {
                        str13 = null;
                    } else {
                        str13 = str8;
                    }
                    str14 = strQ1111;
                    i37 = i511111116;
                    if (i34 != 0) {
                        str15 = strQ2;
                        i38 = i36;
                        aVar6 = null;
                    } else {
                        aVar6 = aVar4;
                        str15 = strQ2;
                        i38 = i36;
                    }
                }
                o0VarE.h0();
                x1 x1Var15 = p3.n.f135158a;
                int i511111117 = i38 >> 6;
                int i511111118 = (i511111117 & 7168) | (i511111117 & 112) | 6 | (i511111117 & 896) | (234881024 & i38) | (i38 & 1879048192);
                int i511111119 = i37 << 6;
                o0Var = o0VarE;
                String str1110 = strQ;
                da0.p.c(str, str2, aVar, str1110, false, null, null, null, str15, aVar2, false, str14, aVar3, false, str13, aVar6, false, false, null, lVar, null, null, z3.f.c(861935458, new e23.q() { // from class: ta0.n
                    /* JADX WARN: Code duplicated, block: B:13:0x00a0  */
                    @Override // e23.q
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        p3.m mVar2 = (p3.m) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        ((c2.a0) obj).getClass();
                        if (mVar2.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                            x1 x1Var16 = p3.n.f135158a;
                            if (z14) {
                                long j14 = j8;
                                if (j14 != -1) {
                                    mVar2.C(-1690152377);
                                    String strValueOf = String.valueOf(j14);
                                    h4.r rVarF = x2.f(o3.c(h4.r.S, "ready_to_connect_device_unit_id"), 1.0f);
                                    d92.b.f58623a.getClass();
                                    d92.b.f58625c.getClass();
                                    h4.r rVarC = c2.l.C(rVarF, 0.0f, j92.b.f97899b.f97921f, 0.0f, 0.0f, 13);
                                    d92.b.f58624b.getClass();
                                    s5.x0 x0VarB = d92.c.b(j92.f.f97931h, mVar2);
                                    d6.h.f57752b.getClass();
                                    mh.c(strValueOf, rVarC, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarB, mVar2, 0, 0, 130044);
                                    mVar2 = mVar2;
                                    mVar2.f();
                                } else {
                                    mVar2.C(-1689749408);
                                    mVar2.f();
                                }
                            } else {
                                mVar2.C(-1689749408);
                                mVar2.f();
                            }
                            String str1111 = str4;
                            if (str1111 == null) {
                                mVar2.C(-1689718037);
                                mVar2.f();
                            } else {
                                mVar2.C(-1689718036);
                                h4.r rVarF2 = x2.f(h4.r.S, 1.0f);
                                d92.b.f58623a.getClass();
                                d92.b.f58625c.getClass();
                                h4.r rVarC2 = c2.l.C(rVarF2, 0.0f, j92.b.f97899b.f97921f, 0.0f, 0.0f, 13);
                                d92.b.f58624b.getClass();
                                s5.x0 x0VarB2 = d92.c.b(j92.f.f97931h, mVar2);
                                d6.h.f57752b.getClass();
                                p3.m mVar3 = mVar2;
                                mh.c(str1111, rVarC2, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarB2, mVar3, 0, 0, 130044);
                                mVar2 = mVar3;
                                mVar2.f();
                            }
                            String str1112 = str5;
                            if (str1112 == null) {
                                mVar2.C(-1689390677);
                                mVar2.f();
                            } else {
                                mVar2.C(-1689390676);
                                h4.r rVarF3 = x2.f(h4.r.S, 1.0f);
                                d92.b.f58623a.getClass();
                                d92.b.f58625c.getClass();
                                h4.r rVarC3 = c2.l.C(rVarF3, 0.0f, j92.b.f97899b.f97921f, 0.0f, 0.0f, 13);
                                d92.b.f58624b.getClass();
                                s5.x0 x0VarB3 = d92.c.b(j92.f.f97931h, mVar2);
                                d6.h.f57752b.getClass();
                                p3.m mVar4 = mVar2;
                                mh.c(str1112, rVarC3, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarB3, mVar4, 0, 0, 130044);
                                mVar4.f();
                            }
                        } else {
                            mVar2.e();
                        }
                        return Unit.INSTANCE;
                    }
                }, o0VarE), o0Var, i511111118, ((i37 << 3) & 1008) | (57344 & i511111119) | (i511111119 & 458752) | ((i37 << 15) & 1879048192), 3072, 7808240);
                str12 = str1110;
                str9 = str15;
                str10 = str14;
                str11 = str13;
                aVar5 = aVar6;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                str10 = str7;
                str11 = str8;
                str12 = strQ;
                aVar5 = aVar4;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new e23.p(str, j8, z14, str2, aVar, str12, str4, str5, str9, aVar2, str10, aVar3, str11, aVar5, lVar, i14, i15, i16) { // from class: ta0.o

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ String f163393a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ long f163394b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ boolean f163395c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    public final /* synthetic */ String f163396d;

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    public final /* synthetic */ o90.a f163397e;

                    /* JADX INFO: renamed from: f, reason: collision with root package name */
                    public final /* synthetic */ String f163398f;

                    /* JADX INFO: renamed from: g, reason: collision with root package name */
                    public final /* synthetic */ String f163399g;

                    /* JADX INFO: renamed from: h, reason: collision with root package name */
                    public final /* synthetic */ String f163400h;

                    /* JADX INFO: renamed from: i, reason: collision with root package name */
                    public final /* synthetic */ String f163401i;

                    /* JADX INFO: renamed from: j, reason: collision with root package name */
                    public final /* synthetic */ e23.a f163402j;

                    /* JADX INFO: renamed from: k, reason: collision with root package name */
                    public final /* synthetic */ String f163403k;

                    /* JADX INFO: renamed from: l, reason: collision with root package name */
                    public final /* synthetic */ e23.a f163404l;

                    /* JADX INFO: renamed from: m, reason: collision with root package name */
                    public final /* synthetic */ String f163405m;

                    /* JADX INFO: renamed from: n, reason: collision with root package name */
                    public final /* synthetic */ e23.a f163406n;

                    /* JADX INFO: renamed from: o, reason: collision with root package name */
                    public final /* synthetic */ e23.l f163407o;

                    /* JADX INFO: renamed from: p, reason: collision with root package name */
                    public final /* synthetic */ int f163408p;

                    /* JADX INFO: renamed from: q, reason: collision with root package name */
                    public final /* synthetic */ int f163409q;

                    {
                        this.f163408p = i15;
                        this.f163409q = i16;
                    }

                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iT = p3.p0.t(7);
                        int iT2 = p3.p0.t(this.f163408p);
                        q.c(this.f163393a, this.f163394b, this.f163395c, this.f163396d, this.f163397e, this.f163398f, this.f163399g, this.f163400h, this.f163401i, this.f163402j, this.f163403k, this.f163404l, this.f163405m, this.f163406n, this.f163407o, (p3.m) obj, iT, iT2, this.f163409q);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        i26 |= 3072;
        i34 = i30;
        if ((i15 & 24576) != 0) {
            i26 |= o0VarE.r(lVar) ? 16384 : 8192;
        }
        if ((i24 & 306783379) == 306783378) {
            z15 = true;
        } else {
            z15 = true;
        }
        if (o0VarE.n(i24 & 1, z15)) {
            o0VarE.G0();
            if ((i14 & 1) != 0) {
                if ((i16 & 32) != 0) {
                    i36 = i24 & (-458753);
                    strQ = gl1.y.Q(o0VarE, R.string.find_my_watch_found_title);
                } else {
                    i36 = i24;
                }
                if ((i16 & 256) != 0) {
                    strQ2 = gl1.y.Q(o0VarE, R.string.connect_it);
                    i36 &= -234881025;
                } else {
                    strQ2 = str9;
                }
                String strQ1112 = gl1.y.Q(o0VarE, R.string.startup_bic_different_device);
                int i5111111110 = i26 & (-15);
                if (i28 != 0) {
                    str13 = null;
                } else {
                    str13 = str8;
                }
                str14 = strQ1112;
                i37 = i5111111110;
                if (i34 != 0) {
                    str15 = strQ2;
                    i38 = i36;
                    aVar6 = null;
                } else {
                    aVar6 = aVar4;
                    str15 = strQ2;
                    i38 = i36;
                }
            } else {
                if ((i16 & 32) != 0) {
                    i36 = i24 & (-458753);
                    strQ = gl1.y.Q(o0VarE, R.string.find_my_watch_found_title);
                } else {
                    i36 = i24;
                }
                if ((i16 & 256) != 0) {
                    strQ2 = gl1.y.Q(o0VarE, R.string.connect_it);
                    i36 &= -234881025;
                } else {
                    strQ2 = str9;
                }
                String strQ1113 = gl1.y.Q(o0VarE, R.string.startup_bic_different_device);
                int i5111111111 = i26 & (-15);
                if (i28 != 0) {
                    str13 = null;
                } else {
                    str13 = str8;
                }
                str14 = strQ1113;
                i37 = i5111111111;
                if (i34 != 0) {
                    str15 = strQ2;
                    i38 = i36;
                    aVar6 = null;
                } else {
                    aVar6 = aVar4;
                    str15 = strQ2;
                    i38 = i36;
                }
            }
            o0VarE.h0();
            x1 x1Var16 = p3.n.f135158a;
            int i5111111112 = i38 >> 6;
            int i5111111113 = (i5111111112 & 7168) | (i5111111112 & 112) | 6 | (i5111111112 & 896) | (234881024 & i38) | (i38 & 1879048192);
            int i5111111114 = i37 << 6;
            o0Var = o0VarE;
            String str1111 = strQ;
            da0.p.c(str, str2, aVar, str1111, false, null, null, null, str15, aVar2, false, str14, aVar3, false, str13, aVar6, false, false, null, lVar, null, null, z3.f.c(861935458, new e23.q() { // from class: ta0.n
                /* JADX WARN: Code duplicated, block: B:13:0x00a0  */
                @Override // e23.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    p3.m mVar2 = (p3.m) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((c2.a0) obj).getClass();
                    if (mVar2.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                        x1 x1Var17 = p3.n.f135158a;
                        if (z14) {
                            long j14 = j8;
                            if (j14 != -1) {
                                mVar2.C(-1690152377);
                                String strValueOf = String.valueOf(j14);
                                h4.r rVarF = x2.f(o3.c(h4.r.S, "ready_to_connect_device_unit_id"), 1.0f);
                                d92.b.f58623a.getClass();
                                d92.b.f58625c.getClass();
                                h4.r rVarC = c2.l.C(rVarF, 0.0f, j92.b.f97899b.f97921f, 0.0f, 0.0f, 13);
                                d92.b.f58624b.getClass();
                                s5.x0 x0VarB = d92.c.b(j92.f.f97931h, mVar2);
                                d6.h.f57752b.getClass();
                                mh.c(strValueOf, rVarC, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarB, mVar2, 0, 0, 130044);
                                mVar2 = mVar2;
                                mVar2.f();
                            } else {
                                mVar2.C(-1689749408);
                                mVar2.f();
                            }
                        } else {
                            mVar2.C(-1689749408);
                            mVar2.f();
                        }
                        String str1112 = str4;
                        if (str1112 == null) {
                            mVar2.C(-1689718037);
                            mVar2.f();
                        } else {
                            mVar2.C(-1689718036);
                            h4.r rVarF2 = x2.f(h4.r.S, 1.0f);
                            d92.b.f58623a.getClass();
                            d92.b.f58625c.getClass();
                            h4.r rVarC2 = c2.l.C(rVarF2, 0.0f, j92.b.f97899b.f97921f, 0.0f, 0.0f, 13);
                            d92.b.f58624b.getClass();
                            s5.x0 x0VarB2 = d92.c.b(j92.f.f97931h, mVar2);
                            d6.h.f57752b.getClass();
                            p3.m mVar3 = mVar2;
                            mh.c(str1112, rVarC2, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarB2, mVar3, 0, 0, 130044);
                            mVar2 = mVar3;
                            mVar2.f();
                        }
                        String str1113 = str5;
                        if (str1113 == null) {
                            mVar2.C(-1689390677);
                            mVar2.f();
                        } else {
                            mVar2.C(-1689390676);
                            h4.r rVarF3 = x2.f(h4.r.S, 1.0f);
                            d92.b.f58623a.getClass();
                            d92.b.f58625c.getClass();
                            h4.r rVarC3 = c2.l.C(rVarF3, 0.0f, j92.b.f97899b.f97921f, 0.0f, 0.0f, 13);
                            d92.b.f58624b.getClass();
                            s5.x0 x0VarB3 = d92.c.b(j92.f.f97931h, mVar2);
                            d6.h.f57752b.getClass();
                            p3.m mVar4 = mVar2;
                            mh.c(str1113, rVarC3, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarB3, mVar4, 0, 0, 130044);
                            mVar4.f();
                        }
                    } else {
                        mVar2.e();
                    }
                    return Unit.INSTANCE;
                }
            }, o0VarE), o0Var, i5111111113, ((i37 << 3) & 1008) | (57344 & i5111111114) | (i5111111114 & 458752) | ((i37 << 15) & 1879048192), 3072, 7808240);
            str12 = str1111;
            str9 = str15;
            str10 = str14;
            str11 = str13;
            aVar5 = aVar6;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            str10 = str7;
            str11 = str8;
            str12 = strQ;
            aVar5 = aVar4;
        }
        p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p(str, j8, z14, str2, aVar, str12, str4, str5, str9, aVar2, str10, aVar3, str11, aVar5, lVar, i14, i15, i16) { // from class: ta0.o

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ String f163393a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ long f163394b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ boolean f163395c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ String f163396d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ o90.a f163397e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ String f163398f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public final /* synthetic */ String f163399g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                public final /* synthetic */ String f163400h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                public final /* synthetic */ String f163401i;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                public final /* synthetic */ e23.a f163402j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                public final /* synthetic */ String f163403k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                public final /* synthetic */ e23.a f163404l;

                /* JADX INFO: renamed from: m, reason: collision with root package name */
                public final /* synthetic */ String f163405m;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                public final /* synthetic */ e23.a f163406n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                public final /* synthetic */ e23.l f163407o;

                /* JADX INFO: renamed from: p, reason: collision with root package name */
                public final /* synthetic */ int f163408p;

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                public final /* synthetic */ int f163409q;

                {
                    this.f163408p = i15;
                    this.f163409q = i16;
                }

                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iT = p3.p0.t(7);
                    int iT2 = p3.p0.t(this.f163408p);
                    q.c(this.f163393a, this.f163394b, this.f163395c, this.f163396d, this.f163397e, this.f163398f, this.f163399g, this.f163400h, this.f163401i, this.f163402j, this.f163403k, this.f163404l, this.f163405m, this.f163406n, this.f163407o, (p3.m) obj, iT, iT2, this.f163409q);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
