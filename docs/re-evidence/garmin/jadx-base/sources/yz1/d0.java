package yz1;

import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import lc.u0;
import p005kotlin.Unit;
import p13.h0;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final class d0 {
    public static final void a(final h4.r rVar, final String str, final u4.d dVar, final o4.d0 d0Var, final a0.a aVar, final e23.l lVar, final e23.l lVar2, final String str2, final String str3, final e23.l lVar3, final e23.l lVar4, final int i14, final float f14, final String str4, final e23.a aVar2, final e23.a aVar3, final e23.a aVar4, final z zVar, final String str5, final Integer num, final e23.a aVar5, p3.m mVar, final int i15, final int i16, final int i17) {
        int i18;
        Object obj;
        int i19;
        int i24;
        o0 o0Var;
        Double d14;
        Double d15;
        Double d16;
        Double d17;
        String strL;
        d dVar2;
        o0 o0VarE = mVar.E(1626375004);
        if ((i15 & 6) == 0) {
            i18 = (o0VarE.B(rVar) ? 4 : 2) | i15;
        } else {
            i18 = i15;
        }
        if ((i15 & 48) == 0) {
            obj = str;
            i18 |= o0VarE.B(obj) ? 32 : 16;
        } else {
            obj = str;
        }
        if ((i15 & 384) == 0) {
            i18 |= o0VarE.B(dVar) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i18 |= o0VarE.B(d0Var) ? 2048 : 1024;
        }
        if ((i15 & 24576) == 0) {
            i18 |= o0VarE.B(aVar) ? 16384 : 8192;
        }
        if ((i15 & 196608) == 0) {
            i18 |= o0VarE.B(null) ? 131072 : 65536;
        }
        if ((i15 & 1572864) == 0) {
            i18 |= o0VarE.r(lVar) ? 1048576 : 524288;
        }
        if ((i15 & 12582912) == 0) {
            i18 |= o0VarE.r(lVar2) ? 8388608 : 4194304;
        }
        if ((i15 & 100663296) == 0) {
            i18 |= o0VarE.B(str2) ? 67108864 : 33554432;
        }
        if ((i15 & C.ENCODING_PCM_32BIT) == 0) {
            i18 |= o0VarE.B(str3) ? 536870912 : 268435456;
        }
        int i25 = i18;
        if ((i16 & 6) == 0) {
            i19 = (o0VarE.r(lVar3) ? 4 : 2) | i16;
        } else {
            i19 = i16;
        }
        if ((i16 & 48) == 0) {
            i19 |= o0VarE.r(lVar4) ? 32 : 16;
        }
        int i26 = i19;
        if ((i16 & 384) == 0) {
            i26 |= o0VarE.k(i14) ? 256 : 128;
        }
        if ((i16 & 3072) == 0) {
            i26 |= o0VarE.i(f14) ? 2048 : 1024;
        }
        if ((i16 & 24576) == 0) {
            i26 |= o0VarE.B(str4) ? 16384 : 8192;
        }
        if ((i16 & 196608) == 0) {
            i26 |= o0VarE.r(aVar2) ? 131072 : 65536;
        }
        if ((i16 & 1572864) == 0) {
            i26 |= o0VarE.r(aVar3) ? 1048576 : 524288;
        }
        if ((i16 & 12582912) == 0) {
            i26 |= o0VarE.r(aVar4) ? 8388608 : 4194304;
        }
        if ((i16 & 100663296) == 0) {
            i26 |= o0VarE.k(zVar == null ? -1 : zVar.ordinal()) ? 67108864 : 33554432;
        }
        if ((i16 & C.ENCODING_PCM_32BIT) == 0) {
            i26 |= o0VarE.B(str5) ? 536870912 : 268435456;
        }
        if ((i17 & 6) == 0) {
            i24 = i17 | (o0VarE.B(num) ? 4 : 2);
        } else {
            i24 = i17;
        }
        if ((i17 & 48) == 0) {
            i24 |= o0VarE.r(aVar5) ? 32 : 16;
        }
        if (o0VarE.n(i25 & 1, ((i25 & 306783379) == 306783378 && (i26 & 306783379) == 306783378 && (i24 & 19) == 18) ? false : true)) {
            o0VarE.G0();
            if ((i15 & 1) != 0 && !o0VarE.o0()) {
                o0VarE.e();
            }
            o0VarE.h0();
            x1 x1Var = p3.n.f135158a;
            if (aVar == null || (d14 = aVar.f200239b) == null) {
                d14 = null;
            }
            if (aVar == null || (d15 = aVar.f200240c) == null) {
                d15 = null;
            }
            i53.c<c02.c> cVar = aVar != null ? aVar.f200241d : null;
            c02.c cVar2 = aVar != null ? aVar.f200242e : null;
            j53.j jVarB = j53.l.b();
            c02.c cVar3 = cVar2;
            String strQ = gl1.y.Q(o0VarE, R.string.no_data_label);
            if (d14 == null || d15 == null) {
                d16 = d14;
                d17 = d15;
                o0VarE.C(-186278552);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-186762090);
                d16 = d14;
                d17 = d15;
                strQ = oi0.c.P(p13.x.k(gl1.y.P(R.string.lbl_out_of_goal_1, new Object[]{(String) lVar3.invoke(d14), (String) lVar4.invoke(d15)}, o0VarE), gl1.y.P(R.string.msg_percent_of_goal_met, new Object[]{Integer.valueOf((int) (((double) 100) * (d16.doubleValue() / d17.doubleValue())))}, o0VarE)));
                o0VarE.g0(false);
            }
            String str6 = strQ;
            String strK0 = h0.k0(p13.w.c(gl1.y.P(R.string.msg_view_last_7_day_feature_trend, new Object[]{obj}, o0VarE)), ". ", null, null, null, 62);
            d dVar3 = (aVar == null || (dVar2 = aVar.f200238a) == null) ? null : dVar2;
            z3.e eVarC = z3.f.c(785951616, new wv0.e(d16, d17, lVar, lVar2, str6), o0VarE);
            z3.e eVarC2 = z3.f.c(-1957361151, new xx1.c(aVar, cVar3, cVar, str3, jVarB, str2, strK0), o0VarE);
            e23.a aVar6 = zVar == z.EMPTY ? aVar3 : null;
            if (num == null) {
                o0VarE.C(-181959354);
                o0VarE.g0(false);
                strL = null;
            } else {
                strL = u0.l(o0VarE, -181959353, num, o0VarE, false);
            }
            int i27 = i25 << 6;
            int i28 = i26 >> 12;
            int i29 = i26 << 3;
            o0Var = o0VarE;
            y.d(rVar, dVar3, str, str, dVar, d0Var, 0.0f, i14, null, f14, str4, aVar2, false, 0L, null, eVarC, eVarC2, aVar3, aVar4, aVar6, zVar, str5, strL, aVar5, o0Var, (i25 & 14) | ((i25 << 3) & 896) | (i27 & 7168) | (57344 & i27) | (i27 & 458752) | ((i26 << 15) & 29360128) | ((i26 << 18) & 1879048192), (i28 & 112) | (i28 & 14) | 1769472 | (29360128 & i29) | (i29 & 234881024), ((i26 >> 24) & 126) | ((i24 << 6) & 7168), 28992);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p() { // from class: yz1.c0
                @Override // e23.p
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iT = p0.t(i15 | 1);
                    int iT2 = p0.t(i16);
                    int iT3 = p0.t(i17);
                    d0.a(rVar, str, dVar, d0Var, aVar, lVar, lVar2, str2, str3, lVar3, lVar4, i14, f14, str4, aVar2, aVar3, aVar4, zVar, str5, num, aVar5, (p3.m) obj2, iT, iT2, iT3);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0147  */
    /* JADX WARN: Code duplicated, block: B:102:0x014f  */
    /* JADX WARN: Code duplicated, block: B:103:0x0152  */
    /* JADX WARN: Code duplicated, block: B:107:0x015e  */
    /* JADX WARN: Code duplicated, block: B:109:0x0165  */
    /* JADX WARN: Code duplicated, block: B:111:0x016f  */
    /* JADX WARN: Code duplicated, block: B:112:0x0172  */
    /* JADX WARN: Code duplicated, block: B:116:0x017d  */
    /* JADX WARN: Code duplicated, block: B:119:0x0189  */
    /* JADX WARN: Code duplicated, block: B:120:0x018c  */
    /* JADX WARN: Code duplicated, block: B:123:0x0192  */
    /* JADX WARN: Code duplicated, block: B:125:0x0197  */
    /* JADX WARN: Code duplicated, block: B:128:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:131:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:134:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:135:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:137:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:141:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:142:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:144:0x01da  */
    /* JADX WARN: Code duplicated, block: B:145:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:154:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:157:0x0203  */
    /* JADX WARN: Code duplicated, block: B:169:0x0237  */
    /* JADX WARN: Code duplicated, block: B:171:0x023b  */
    /* JADX WARN: Code duplicated, block: B:174:0x0241  */
    /* JADX WARN: Code duplicated, block: B:178:0x0249  */
    /* JADX WARN: Code duplicated, block: B:181:0x025d  */
    /* JADX WARN: Code duplicated, block: B:182:0x0260  */
    /* JADX WARN: Code duplicated, block: B:185:0x0266  */
    /* JADX WARN: Code duplicated, block: B:187:0x0273  */
    /* JADX WARN: Code duplicated, block: B:189:0x0281  */
    /* JADX WARN: Code duplicated, block: B:191:0x0287  */
    /* JADX WARN: Code duplicated, block: B:192:0x0289  */
    /* JADX WARN: Code duplicated, block: B:195:0x028f  */
    /* JADX WARN: Code duplicated, block: B:197:0x029a  */
    /* JADX WARN: Code duplicated, block: B:200:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:202:0x0341  */
    /* JADX WARN: Code duplicated, block: B:205:0x035a  */
    /* JADX WARN: Code duplicated, block: B:207:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x0127  */
    /* JADX WARN: Code duplicated, block: B:92:0x012c  */
    /* JADX WARN: Code duplicated, block: B:94:0x0134  */
    /* JADX WARN: Code duplicated, block: B:95:0x0137  */
    /* JADX WARN: Code duplicated, block: B:99:0x0144  */
    public static final void b(final h4.r rVar, final String str, final u4.d dVar, final o4.d0 d0Var, final a0.a aVar, final e23.l lVar, final e23.l lVar2, final String str2, final String str3, e23.l lVar3, e23.l lVar4, int i14, float f14, String str4, e23.a aVar2, final e23.a aVar3, final e23.a aVar4, final z zVar, final String str5, Integer num, e23.a aVar5, p3.m mVar, final int i15, final int i16) {
        int i17;
        String str6;
        u4.d dVar2;
        o4.d0 d0Var2;
        e23.l lVar5;
        e23.l lVar6;
        int i18;
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
        int i36;
        int i37;
        int iOrdinal;
        int i38;
        int i39;
        int i44;
        int i45;
        int i46;
        boolean z14;
        o0 o0Var;
        final int i47;
        final float f15;
        final String str7;
        final Integer num2;
        final e23.a aVar6;
        final e23.l lVar7;
        final e23.l lVar8;
        final e23.a aVar7;
        p2 p2VarI0;
        int i48;
        float f16;
        int i49;
        String str8;
        p3.m.a aVar8;
        e23.a aVar9;
        Integer num3;
        e23.a aVar10;
        e23.a aVar11;
        Integer num4;
        Object objQ;
        Object objQ2;
        int i54;
        str.getClass();
        dVar.getClass();
        lVar.getClass();
        lVar2.getClass();
        str2.getClass();
        str3.getClass();
        o0 o0VarE = mVar.E(246608580);
        if ((i15 & 6) == 0) {
            i17 = (o0VarE.B(rVar) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            str6 = str;
            i17 |= o0VarE.B(str6) ? 32 : 16;
        } else {
            str6 = str;
        }
        if ((i15 & 384) == 0) {
            dVar2 = dVar;
            i17 |= o0VarE.B(dVar2) ? 256 : 128;
        } else {
            dVar2 = dVar;
        }
        if ((i15 & 3072) == 0) {
            d0Var2 = d0Var;
            i17 |= o0VarE.B(d0Var2) ? 2048 : 1024;
        } else {
            d0Var2 = d0Var;
        }
        if ((i15 & 24576) == 0) {
            i17 |= o0VarE.B(aVar) ? 16384 : 8192;
        }
        int i55 = 196608;
        if ((i15 & 196608) == 0) {
            i17 |= o0VarE.r(lVar) ? 131072 : 65536;
        }
        if ((i15 & 1572864) == 0) {
            i17 |= o0VarE.r(lVar2) ? 1048576 : 524288;
        }
        if ((i15 & 12582912) == 0) {
            i17 |= o0VarE.B(str2) ? 8388608 : 4194304;
        }
        if ((i15 & 100663296) == 0) {
            i17 |= o0VarE.B(str3) ? 67108864 : 33554432;
        }
        if ((i15 & C.ENCODING_PCM_32BIT) == 0) {
            if ((i16 & 512) == 0) {
                lVar5 = lVar3;
                if (o0VarE.r(lVar5)) {
                    i54 = 536870912;
                }
                i17 |= i54;
            } else {
                lVar5 = lVar3;
            }
            i54 = 268435456;
            i17 |= i54;
        } else {
            lVar5 = lVar3;
        }
        if ((i16 & 1024) == 0) {
            lVar6 = lVar4;
            i18 = o0VarE.r(lVar6) ? 4 : 2;
            i19 = i16 & 2048;
            if (i19 != 0) {
                i25 = i18 | 48;
            } else {
                if (o0VarE.k(i14)) {
                    i24 = 32;
                } else {
                    i24 = 16;
                }
                i25 = i18 | i24;
            }
            i26 = i25;
            i27 = i26 | 128;
            i28 = i16 & 8192;
            if (i28 != 0) {
                i30 = i26 | 3200;
            } else {
                if (o0VarE.B(str4)) {
                    i29 = 2048;
                } else {
                    i29 = 1024;
                }
                i30 = i27 | i29;
            }
            i34 = i16 & 16384;
            if (i34 != 0) {
                i36 = i30 | 24576;
            } else {
                int i56 = i30;
                if (o0VarE.r(aVar2)) {
                    i35 = 16384;
                } else {
                    i35 = 8192;
                }
                i36 = i56 | i35;
            }
            int i57 = i36 | (o0VarE.r(aVar3) ? 131072 : 65536);
            if (o0VarE.r(aVar4)) {
                i37 = 1048576;
            } else {
                i37 = 524288;
            }
            int i58 = i57 | i37;
            if (zVar == null) {
                iOrdinal = -1;
            } else {
                iOrdinal = zVar.ordinal();
            }
            i38 = i58 | (o0VarE.k(iOrdinal) ? 8388608 : 4194304) | (o0VarE.B(str5) ? 67108864 : 33554432);
            i39 = i16 & 524288;
            if (i39 != 0) {
                i44 = i38 | C.ENCODING_PCM_32BIT;
            } else {
                i44 = i38 | (o0VarE.B(num) ? 536870912 : 268435456);
            }
            i45 = i16 & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
            if (i45 != 0) {
                i46 = 6;
            } else if (o0VarE.r(aVar5)) {
                i46 = 4;
            } else {
                i46 = 2;
            }
            if ((i17 & 306783379) != 306783378 && (i44 & 306783379) == 306783378 && (i46 & 3) == 2) {
                z14 = false;
            } else {
                z14 = true;
            }
            if (o0VarE.n(i17 & 1, z14)) {
                o0VarE.G0();
                if ((i15 & 1) != 0 || o0VarE.o0()) {
                    if ((i16 & 512) != 0) {
                        i17 &= -1879048193;
                        lVar5 = lVar;
                    }
                    if ((i16 & 1024) != 0) {
                        i44 &= -15;
                        lVar6 = lVar2;
                    }
                    int i59 = i44;
                    i48 = i19 == 0 ? i14 : 0;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    f16 = j92.b.f97901d.f97904c;
                    i49 = i59 & (-897);
                    if (i28 != 0) {
                        str8 = null;
                    } else {
                        str8 = str4;
                    }
                    aVar8 = p3.m.f135153a;
                    if (i34 != 0) {
                        objQ2 = o0VarE.q();
                        aVar8.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new yx2.b(16);
                            o0VarE.K(objQ2);
                        }
                        aVar9 = (e23.a) objQ2;
                    } else {
                        aVar9 = aVar2;
                    }
                    if (i39 != 0) {
                        num3 = null;
                    } else {
                        num3 = num;
                    }
                    aVar10 = aVar9;
                    if (i45 != 0) {
                        objQ = o0VarE.q();
                        aVar8.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new yx2.b(17);
                            o0VarE.K(objQ);
                        }
                        aVar11 = (e23.a) objQ;
                    } else {
                        aVar11 = aVar5;
                    }
                    num4 = num3;
                } else {
                    o0VarE.e();
                    if ((i16 & 512) != 0) {
                        i17 &= -1879048193;
                    }
                    if ((i16 & 1024) != 0) {
                        i44 &= -15;
                    }
                    i49 = i44 & (-897);
                    i48 = i14;
                    f16 = f14;
                    str8 = str4;
                    num4 = num;
                    aVar11 = aVar5;
                    lVar6 = lVar6;
                    i55 = 196608;
                    aVar10 = aVar2;
                }
                o0VarE.h0();
                x1 x1Var = p3.n.f135158a;
                int i64 = i17 << 3;
                int i65 = i55 | (i17 & 14) | (i17 & 112) | (i17 & 896) | (i17 & 7168) | (i17 & 57344) | (i64 & 3670016) | (i64 & 29360128) | (i64 & 234881024) | (i64 & 1879048192);
                int i66 = (i17 >> 27) & 14;
                int i67 = i49 << 3;
                o0Var = o0VarE;
                e23.l lVar9 = lVar5;
                float f17 = f16;
                a(rVar, str6, dVar2, d0Var2, aVar, lVar, lVar2, str2, str3, lVar9, lVar6, i48, f17, str8, aVar10, aVar3, aVar4, zVar, str5, num4, aVar11, o0Var, i65, i66 | (i67 & 112) | (i67 & 896) | (57344 & i67) | (458752 & i67) | (i67 & 3670016) | (i67 & 29360128) | (i67 & 234881024) | (i67 & 1879048192), ((i49 >> 27) & 14) | ((i46 << 3) & 112));
                lVar8 = lVar9;
                lVar7 = lVar6;
                i47 = i48;
                f15 = f17;
                str7 = str8;
                aVar7 = aVar10;
                num2 = num4;
                aVar6 = aVar11;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                i47 = i14;
                f15 = f14;
                str7 = str4;
                num2 = num;
                aVar6 = aVar5;
                lVar7 = lVar6;
                lVar8 = lVar5;
                aVar7 = aVar2;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new e23.p() { // from class: yz1.b0
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iT = p0.t(i15 | 1);
                        d0.b(rVar, str, dVar, d0Var, aVar, lVar, lVar2, str2, str3, lVar8, lVar7, i47, f15, str7, aVar7, aVar3, aVar4, zVar, str5, num2, aVar6, (p3.m) obj, iT, i16);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        lVar6 = lVar4;
        i19 = i16 & 2048;
        if (i19 != 0) {
            i25 = i18 | 48;
        } else {
            if (o0VarE.k(i14)) {
                i24 = 32;
            } else {
                i24 = 16;
            }
            i25 = i18 | i24;
        }
        i26 = i25;
        i27 = i26 | 128;
        i28 = i16 & 8192;
        if (i28 != 0) {
            i30 = i26 | 3200;
        } else {
            if (o0VarE.B(str4)) {
                i29 = 2048;
            } else {
                i29 = 1024;
            }
            i30 = i27 | i29;
        }
        i34 = i16 & 16384;
        if (i34 != 0) {
            i36 = i30 | 24576;
        } else {
            int i510 = i30;
            if (o0VarE.r(aVar2)) {
                i35 = 16384;
            } else {
                i35 = 8192;
            }
            i36 = i510 | i35;
        }
        int i511 = i36 | (o0VarE.r(aVar3) ? 131072 : 65536);
        if (o0VarE.r(aVar4)) {
            i37 = 1048576;
        } else {
            i37 = 524288;
        }
        int i512 = i511 | i37;
        if (zVar == null) {
            iOrdinal = -1;
        } else {
            iOrdinal = zVar.ordinal();
        }
        i38 = i512 | (o0VarE.k(iOrdinal) ? 8388608 : 4194304) | (o0VarE.B(str5) ? 67108864 : 33554432);
        i39 = i16 & 524288;
        if (i39 != 0) {
            i44 = i38 | C.ENCODING_PCM_32BIT;
        } else {
            i44 = i38 | (o0VarE.B(num) ? 536870912 : 268435456);
        }
        i45 = i16 & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
        if (i45 != 0) {
            i46 = 6;
        } else if (o0VarE.r(aVar5)) {
            i46 = 4;
        } else {
            i46 = 2;
        }
        if ((i17 & 306783379) != 306783378) {
            z14 = true;
        } else {
            z14 = true;
        }
        if (o0VarE.n(i17 & 1, z14)) {
            o0VarE.G0();
            if ((i15 & 1) != 0) {
                if ((i16 & 512) != 0) {
                    i17 &= -1879048193;
                    lVar5 = lVar;
                }
                if ((i16 & 1024) != 0) {
                    i44 &= -15;
                    lVar6 = lVar2;
                }
                int i513 = i44;
                if (i19 == 0) {
                }
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                f16 = j92.b.f97901d.f97904c;
                i49 = i513 & (-897);
                if (i28 != 0) {
                    str8 = null;
                } else {
                    str8 = str4;
                }
                aVar8 = p3.m.f135153a;
                if (i34 != 0) {
                    objQ2 = o0VarE.q();
                    aVar8.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new yx2.b(16);
                        o0VarE.K(objQ2);
                    }
                    aVar9 = (e23.a) objQ2;
                } else {
                    aVar9 = aVar2;
                }
                if (i39 != 0) {
                    num3 = null;
                } else {
                    num3 = num;
                }
                aVar10 = aVar9;
                if (i45 != 0) {
                    objQ = o0VarE.q();
                    aVar8.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new yx2.b(17);
                        o0VarE.K(objQ);
                    }
                    aVar11 = (e23.a) objQ;
                } else {
                    aVar11 = aVar5;
                }
                num4 = num3;
            } else {
                if ((i16 & 512) != 0) {
                    i17 &= -1879048193;
                    lVar5 = lVar;
                }
                if ((i16 & 1024) != 0) {
                    i44 &= -15;
                    lVar6 = lVar2;
                }
                int i514 = i44;
                if (i19 == 0) {
                }
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                f16 = j92.b.f97901d.f97904c;
                i49 = i514 & (-897);
                if (i28 != 0) {
                    str8 = null;
                } else {
                    str8 = str4;
                }
                aVar8 = p3.m.f135153a;
                if (i34 != 0) {
                    objQ2 = o0VarE.q();
                    aVar8.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new yx2.b(16);
                        o0VarE.K(objQ2);
                    }
                    aVar9 = (e23.a) objQ2;
                } else {
                    aVar9 = aVar2;
                }
                if (i39 != 0) {
                    num3 = null;
                } else {
                    num3 = num;
                }
                aVar10 = aVar9;
                if (i45 != 0) {
                    objQ = o0VarE.q();
                    aVar8.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new yx2.b(17);
                        o0VarE.K(objQ);
                    }
                    aVar11 = (e23.a) objQ;
                } else {
                    aVar11 = aVar5;
                }
                num4 = num3;
            }
            o0VarE.h0();
            x1 x1Var2 = p3.n.f135158a;
            int i68 = i17 << 3;
            int i69 = i55 | (i17 & 14) | (i17 & 112) | (i17 & 896) | (i17 & 7168) | (i17 & 57344) | (i68 & 3670016) | (i68 & 29360128) | (i68 & 234881024) | (i68 & 1879048192);
            int i610 = (i17 >> 27) & 14;
            int i611 = i49 << 3;
            o0Var = o0VarE;
            e23.l lVar10 = lVar5;
            float f18 = f16;
            a(rVar, str6, dVar2, d0Var2, aVar, lVar, lVar2, str2, str3, lVar10, lVar6, i48, f18, str8, aVar10, aVar3, aVar4, zVar, str5, num4, aVar11, o0Var, i69, i610 | (i611 & 112) | (i611 & 896) | (57344 & i611) | (458752 & i611) | (i611 & 3670016) | (i611 & 29360128) | (i611 & 234881024) | (i611 & 1879048192), ((i49 >> 27) & 14) | ((i46 << 3) & 112));
            lVar8 = lVar10;
            lVar7 = lVar6;
            i47 = i48;
            f15 = f18;
            str7 = str8;
            aVar7 = aVar10;
            num2 = num4;
            aVar6 = aVar11;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            i47 = i14;
            f15 = f14;
            str7 = str4;
            num2 = num;
            aVar6 = aVar5;
            lVar7 = lVar6;
            lVar8 = lVar5;
            aVar7 = aVar2;
        }
        p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p() { // from class: yz1.b0
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iT = p0.t(i15 | 1);
                    d0.b(rVar, str, dVar, d0Var, aVar, lVar, lVar2, str2, str3, lVar8, lVar7, i47, f15, str7, aVar7, aVar3, aVar4, zVar, str5, num2, aVar6, (p3.m) obj, iT, i16);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final z c(a0.a aVar) {
        if (aVar != null && aVar.f200241d != null) {
            return z.VALID_DATA;
        }
        return z.EMPTY;
    }
}
