package r82;

import b82.g0;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import cw1.j0;
import ds.e0;
import gl1.y;
import i3.e5;
import java.math.BigDecimal;
import java.util.ArrayList;
import o72.h3;
import p005kotlin.Unit;
import p005kotlin.math.MathKt;
import p3.n1;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final class u {
    /* JADX WARN: Code duplicated, block: B:100:0x0144  */
    /* JADX WARN: Code duplicated, block: B:101:0x014b  */
    /* JADX WARN: Code duplicated, block: B:103:0x0151  */
    /* JADX WARN: Code duplicated, block: B:105:0x0159  */
    /* JADX WARN: Code duplicated, block: B:107:0x015e  */
    /* JADX WARN: Code duplicated, block: B:110:0x016b  */
    /* JADX WARN: Code duplicated, block: B:111:0x0170  */
    /* JADX WARN: Code duplicated, block: B:113:0x0176  */
    /* JADX WARN: Code duplicated, block: B:115:0x017c  */
    /* JADX WARN: Code duplicated, block: B:116:0x017f  */
    /* JADX WARN: Code duplicated, block: B:120:0x0189  */
    /* JADX WARN: Code duplicated, block: B:122:0x018e  */
    /* JADX WARN: Code duplicated, block: B:124:0x0194  */
    /* JADX WARN: Code duplicated, block: B:126:0x019a  */
    /* JADX WARN: Code duplicated, block: B:130:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:134:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:137:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:139:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:149:0x0201 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:150:0x0203  */
    /* JADX WARN: Code duplicated, block: B:151:0x0206  */
    /* JADX WARN: Code duplicated, block: B:153:0x020a  */
    /* JADX WARN: Code duplicated, block: B:156:0x020f  */
    /* JADX WARN: Code duplicated, block: B:157:0x0219  */
    /* JADX WARN: Code duplicated, block: B:160:0x021e  */
    /* JADX WARN: Code duplicated, block: B:161:0x0228  */
    /* JADX WARN: Code duplicated, block: B:164:0x0234  */
    /* JADX WARN: Code duplicated, block: B:166:0x0238  */
    /* JADX WARN: Code duplicated, block: B:168:0x023f  */
    /* JADX WARN: Code duplicated, block: B:169:0x0245  */
    /* JADX WARN: Code duplicated, block: B:171:0x0249  */
    /* JADX WARN: Code duplicated, block: B:173:0x0254  */
    /* JADX WARN: Code duplicated, block: B:175:0x0261  */
    /* JADX WARN: Code duplicated, block: B:177:0x0264  */
    /* JADX WARN: Code duplicated, block: B:179:0x026f  */
    /* JADX WARN: Code duplicated, block: B:181:0x027d  */
    /* JADX WARN: Code duplicated, block: B:183:0x0281  */
    /* JADX WARN: Code duplicated, block: B:184:0x0283  */
    /* JADX WARN: Code duplicated, block: B:187:0x028e  */
    /* JADX WARN: Code duplicated, block: B:188:0x0295  */
    /* JADX WARN: Code duplicated, block: B:191:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:192:0x02a7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:193:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:194:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:197:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:199:0x0311  */
    /* JADX WARN: Code duplicated, block: B:202:0x0344  */
    /* JADX WARN: Code duplicated, block: B:203:0x0347  */
    /* JADX WARN: Code duplicated, block: B:206:0x034f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:207:0x0351  */
    /* JADX WARN: Code duplicated, block: B:209:0x0382  */
    /* JADX WARN: Code duplicated, block: B:211:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:214:0x03be  */
    /* JADX WARN: Code duplicated, block: B:217:0x03d7  */
    /* JADX WARN: Code duplicated, block: B:218:0x040e  */
    /* JADX WARN: Code duplicated, block: B:221:0x0423  */
    /* JADX WARN: Code duplicated, block: B:222:0x0435  */
    /* JADX WARN: Code duplicated, block: B:225:0x043c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:228:0x0441  */
    /* JADX WARN: Code duplicated, block: B:230:0x0445 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:231:0x0447  */
    /* JADX WARN: Code duplicated, block: B:234:0x0473  */
    /* JADX WARN: Code duplicated, block: B:235:0x0476  */
    /* JADX WARN: Code duplicated, block: B:238:0x047e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:241:0x0486  */
    /* JADX WARN: Code duplicated, block: B:244:0x04d3  */
    /* JADX WARN: Code duplicated, block: B:245:0x04d6  */
    /* JADX WARN: Code duplicated, block: B:248:0x04dd A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:249:0x04df  */
    /* JADX WARN: Code duplicated, block: B:252:0x0506  */
    /* JADX WARN: Code duplicated, block: B:253:0x0509  */
    /* JADX WARN: Code duplicated, block: B:256:0x0511 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:259:0x0517  */
    /* JADX WARN: Code duplicated, block: B:262:0x0550  */
    /* JADX WARN: Code duplicated, block: B:265:0x055f  */
    /* JADX WARN: Code duplicated, block: B:268:0x0567 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:271:0x056d  */
    /* JADX WARN: Code duplicated, block: B:273:0x05a4  */
    /* JADX WARN: Code duplicated, block: B:275:0x05d3  */
    /* JADX WARN: Code duplicated, block: B:278:0x05f3  */
    /* JADX WARN: Code duplicated, block: B:280:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x0060  */
    /* JADX WARN: Code duplicated, block: B:35:0x0068  */
    /* JADX WARN: Code duplicated, block: B:36:0x006b  */
    /* JADX WARN: Code duplicated, block: B:40:0x0079  */
    /* JADX WARN: Code duplicated, block: B:43:0x0082  */
    /* JADX WARN: Code duplicated, block: B:46:0x0090  */
    /* JADX WARN: Code duplicated, block: B:47:0x0099  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:55:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:58:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:59:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:63:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:64:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:68:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:69:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:71:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:73:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:74:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:77:0x0102  */
    /* JADX WARN: Code duplicated, block: B:80:0x010d  */
    /* JADX WARN: Code duplicated, block: B:82:0x0115  */
    /* JADX WARN: Code duplicated, block: B:83:0x0118  */
    /* JADX WARN: Code duplicated, block: B:86:0x011f  */
    /* JADX WARN: Code duplicated, block: B:89:0x0126  */
    /* JADX WARN: Code duplicated, block: B:91:0x012b  */
    /* JADX WARN: Code duplicated, block: B:93:0x012f  */
    /* JADX WARN: Code duplicated, block: B:95:0x0137  */
    /* JADX WARN: Code duplicated, block: B:96:0x013a  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(h4.r rVar, final boolean z14, boolean z15, String str, String str2, String str3, String str4, final double d14, double d15, double d16, int i14, double d17, final e23.l<? super Double, Unit> lVar, e23.l<? super Integer, Unit> lVar2, e23.l<? super Boolean, Unit> lVar3, boolean z16, boolean z17, p3.m mVar, final int i15, final int i16, final int i17) {
        int i18;
        boolean z18;
        String str5;
        int i19;
        int i24;
        int i25;
        int i26;
        final String str6;
        int i27;
        int i28;
        int i29;
        int i30;
        int i34;
        int i35;
        double d18;
        int i36;
        int i37;
        int i38;
        int i39;
        int i44;
        int i45;
        int i46;
        e23.l<? super Integer, Unit> lVar4;
        int i47;
        int i48;
        int i49;
        int i54;
        int i55;
        int i56;
        int i57;
        int i58;
        boolean z19;
        final h4.r rVar2;
        final e23.l<? super Boolean, Unit> lVar5;
        final boolean z24;
        final boolean z25;
        final e23.l<? super Integer, Unit> lVar6;
        final double d19;
        final boolean z26;
        final String str7;
        final String str8;
        final String str9;
        final double d24;
        final int i59;
        final double d25;
        p2 p2VarI0;
        int i64;
        p3.m.a aVar;
        h4.r rVar3;
        String strQ;
        String strQ2;
        String strQ3;
        int i65;
        double d26;
        e23.l<? super Integer, Unit> lVar7;
        e23.l<? super Boolean, Unit> lVar8;
        boolean z27;
        double d27;
        int i66;
        int i67;
        boolean z28;
        Object objQ;
        Object objQ2;
        double d28;
        ArrayList arrayList;
        double dC;
        double d29;
        Object objQ3;
        p3.m.a.C2565a c2565a;
        n1 n1Var;
        Object objQ4;
        n1 n1Var2;
        i53.c cVarE;
        i53.c cVarH;
        String str10;
        i53.c cVarE2;
        int i68;
        boolean z29;
        boolean z34;
        Object objQ5;
        i53.c cVar;
        boolean z35;
        Object objQ6;
        boolean z36;
        boolean z37;
        Object objQ7;
        i53.c cVar2;
        e23.l<? super Boolean, Unit> lVar9;
        int i69;
        boolean z38;
        Object objQ8;
        int iE;
        Object objQ9;
        p3.m.a.C2565a c2565a2;
        n1 n1Var3;
        i53.c cVarH2;
        boolean z39;
        boolean z44;
        Object objQ10;
        int i74;
        o0 o0VarE = mVar.E(-1215273000);
        int i75 = i17 & 1;
        if (i75 != 0) {
            i18 = i15 | 6;
        } else if ((i15 & 6) == 0) {
            i18 = (o0VarE.B(rVar) ? 4 : 2) | i15;
        } else {
            i18 = i15;
        }
        if ((i15 & 48) == 0) {
            i18 |= o0VarE.h(z14) ? 32 : 16;
        }
        int i76 = i17 & 4;
        if (i76 == 0) {
            if ((i15 & 384) == 0) {
                z18 = z15;
                i18 |= o0VarE.h(z18) ? 256 : 128;
            }
            if ((i17 & 8) == 0) {
                str5 = str;
                int i77 = o0VarE.B(str5) ? 2048 : 1024;
                int i78 = i18 | i77;
                if ((i17 & 16) == 0 || !o0VarE.B(str2)) {
                    i19 = 8192;
                } else {
                    i19 = 16384;
                }
                i24 = i78 | i19;
                i25 = i24 | 65536;
                i26 = i17 & 64;
                if (i26 != 0) {
                    i28 = i24 | 1638400;
                    str6 = str4;
                } else {
                    str6 = str4;
                    if (o0VarE.B(str6)) {
                        i27 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    } else {
                        i27 = 524288;
                    }
                    i28 = i25 | i27;
                }
                if (o0VarE.m(d14)) {
                    i29 = 8388608;
                } else {
                    i29 = 4194304;
                }
                i30 = i28 | i29;
                i34 = i17 & 256;
                if (i34 != 0) {
                    i30 |= 100663296;
                    i35 = i34;
                    d18 = d15;
                } else {
                    i35 = i34;
                    d18 = d15;
                    if ((i15 & 100663296) == 0) {
                        if (o0VarE.m(d18)) {
                            i36 = 67108864;
                        } else {
                            i36 = 33554432;
                        }
                        i30 |= i36;
                    }
                }
                i37 = i17 & 512;
                if (i37 != 0) {
                    i75 = i75;
                    i38 = i30 | C.ENCODING_PCM_32BIT;
                } else {
                    if ((i15 & C.ENCODING_PCM_32BIT) != 0) {
                        if (o0VarE.m(d16)) {
                            i39 = 536870912;
                        } else {
                            i39 = 268435456;
                        }
                        i30 |= i39;
                    }
                    i38 = i30;
                }
                i44 = i16 | 54;
                if ((i16 & 384) != 0) {
                    if (o0VarE.r(lVar)) {
                        i74 = 256;
                    } else {
                        i74 = 128;
                    }
                    i44 |= i74;
                }
                i45 = i44;
                i46 = i17 & 8192;
                if (i46 != 0) {
                    if ((i16 & 3072) == 0) {
                        lVar4 = lVar2;
                        if (o0VarE.r(lVar4)) {
                            i47 = 2048;
                        } else {
                            i47 = 1024;
                        }
                        i45 |= i47;
                    }
                    i48 = i17 & 16384;
                    if (i48 != 0) {
                        i54 = i45 | 24576;
                    } else {
                        i49 = i45;
                        if ((i16 & 24576) == 0) {
                            i54 = i49 | (o0VarE.r(lVar3) ? 16384 : 8192);
                        } else {
                            i54 = i49;
                        }
                    }
                    i55 = i17 & 32768;
                    if (i55 != 0) {
                        i54 |= 196608;
                    } else if ((i16 & 196608) == 0) {
                        if (o0VarE.h(z16)) {
                            i56 = 131072;
                        } else {
                            i56 = 65536;
                        }
                        i54 |= i56;
                    }
                    i57 = i17 & 65536;
                    if (i57 != 0) {
                        i54 |= 1572864;
                    } else if ((i16 & 1572864) == 0) {
                        i54 |= o0VarE.h(z17) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
                    }
                    i58 = i54;
                    if ((i38 & 306783379) == 306783378 || (599187 & i58) != 599186) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    if (o0VarE.n(i38 & 1, z19)) {
                        o0VarE.G0();
                        i64 = i15 & 1;
                        aVar = p3.m.f135153a;
                        if (i64 != 0 || o0VarE.o0()) {
                            if (i75 != 0) {
                                rVar3 = h4.r.S;
                            } else {
                                rVar3 = rVar;
                            }
                            if (i76 != 0) {
                                z18 = false;
                            }
                            if ((i17 & 8) != 0) {
                                strQ = y.Q(o0VarE, R.string.gak_lbl_kg);
                                i38 &= -7169;
                            } else {
                                strQ = str5;
                            }
                            if ((i17 & 16) != 0) {
                                strQ2 = y.Q(o0VarE, R.string.gak_lbl_lbs);
                                i38 &= -57345;
                            } else {
                                strQ2 = str2;
                            }
                            strQ3 = y.Q(o0VarE, R.string.gak_lbl_st);
                            i65 = i38 & (-458753);
                            if (i26 != 0) {
                                str6 = ".";
                            }
                            if (i35 != 0) {
                                d18 = 453.5d;
                            }
                            if (i37 != 0) {
                                d26 = 999.9d;
                            } else {
                                d26 = d16;
                            }
                            if (i46 != 0) {
                                objQ2 = o0VarE.q();
                                aVar.getClass();
                                if (objQ2 == p3.m.a.f135155b) {
                                    objQ2 = new e(7);
                                    o0VarE.K(objQ2);
                                }
                                lVar7 = (e23.l) objQ2;
                            } else {
                                lVar7 = lVar4;
                            }
                            if (i48 != 0) {
                                objQ = o0VarE.q();
                                aVar.getClass();
                                if (objQ == p3.m.a.f135155b) {
                                    objQ = new e(8);
                                    o0VarE.K(objQ);
                                }
                                lVar8 = (e23.l) objQ;
                            } else {
                                lVar8 = lVar3;
                            }
                            if (i55 != 0) {
                                z27 = false;
                            } else {
                                z27 = z16;
                            }
                            d27 = 13.9d;
                            if (i57 != 0) {
                                i66 = i65;
                                i67 = 71;
                                z28 = false;
                            } else {
                                i66 = i65;
                                i67 = 71;
                                z28 = z17;
                            }
                        } else {
                            o0VarE.e();
                            if ((i17 & 8) != 0) {
                                i38 &= -7169;
                            }
                            if ((i17 & 16) != 0) {
                                i38 &= -57345;
                            }
                            rVar3 = rVar;
                            d26 = d16;
                            d27 = d17;
                            lVar8 = lVar3;
                            z28 = z17;
                            i66 = i38 & (-458753);
                            lVar7 = lVar4;
                            strQ = str5;
                            strQ2 = str2;
                            strQ3 = str3;
                            i67 = i14;
                            z27 = z16;
                        }
                        o0VarE.h0();
                        x1 x1Var = p3.n.f135158a;
                        if (z14) {
                            d28 = d18;
                        } else if (z18) {
                            d28 = d27;
                        } else {
                            d28 = d26;
                        }
                        arrayList = new ArrayList();
                        if (z18) {
                            o0VarE.C(-1917435849);
                            int i79 = (int) d14;
                            double d34 = 10;
                            o13.p pVar = new o13.p(Integer.valueOf(i79), Double.valueOf(Math.rint(((d14 - ((double) i79)) * 14.0d) * d34) / d34));
                            int iIntValue = ((Number) pVar.f128594a).intValue();
                            double dDoubleValue = ((Number) pVar.f128595b).doubleValue();
                            iE = j23.t.e(iIntValue, 0, i67);
                            double d35 = d28;
                            dC = j23.t.c(dDoubleValue, 0.0d, d35);
                            objQ9 = o0VarE.q();
                            aVar.getClass();
                            c2565a2 = p3.m.a.f135155b;
                            if (objQ9 == c2565a2) {
                                objQ9 = e5.o(iE, o0VarE);
                            }
                            n1Var3 = (n1) objQ9;
                            cVarH2 = e0.h(0, i67);
                            int iIndexOf = cVarH2.indexOf(Integer.valueOf(n1Var3.getIntValue()));
                            z3.e eVarC = z3.f.c(507960485, new h3(strQ3, 13), o0VarE);
                            boolean zB = o0VarE.B(cVarH2);
                            if ((i58 & 7168) == 2048) {
                                z39 = true;
                            } else {
                                z39 = false;
                            }
                            z44 = z39 | zB;
                            objQ10 = o0VarE.q();
                            if (z44 || objQ10 == c2565a2) {
                                objQ10 = new j0(cVarH2, lVar7, n1Var3);
                                o0VarE.K(objQ10);
                            }
                            arrayList.add(new p(cVarH2, iIndexOf, null, null, eVarC, 0.0f, false, false, null, null, (e23.l) objQ10, 1004, null));
                            o0VarE.g0(false);
                            d29 = d35;
                        } else {
                            double d36 = d28;
                            o0VarE.C(-1916240923);
                            o0VarE.g0(false);
                            dC = j23.t.c(d14, 0.0d, d36);
                            d29 = d36;
                            Unit unit = Unit.INSTANCE;
                        }
                        if (z28) {
                            dC = ((double) MathKt.b(dC * 2.0d)) / 2.0d;
                        }
                        objQ3 = o0VarE.q();
                        aVar.getClass();
                        c2565a = p3.m.a.f135155b;
                        if (objQ3 == c2565a) {
                            objQ3 = e5.o(new BigDecimal(String.valueOf(dC)).intValue(), o0VarE);
                        }
                        n1Var = (n1) objQ3;
                        objQ4 = o0VarE.q();
                        if (objQ4 == c2565a) {
                            BigDecimal bigDecimal = new BigDecimal(String.valueOf(dC));
                            BigDecimal bigDecimalValueOf = BigDecimal.valueOf(n1Var.getIntValue());
                            bigDecimalValueOf.getClass();
                            BigDecimal bigDecimalSubtract = bigDecimal.subtract(bigDecimalValueOf);
                            bigDecimalSubtract.getClass();
                            BigDecimal bigDecimalMultiply = bigDecimalSubtract.multiply(new BigDecimal(10.0d));
                            bigDecimalMultiply.getClass();
                            objQ4 = e5.o(bigDecimalMultiply.intValue(), o0VarE);
                        }
                        n1Var2 = (n1) objQ4;
                        cVarE = i53.a.e(new j23.l(0, (int) d29));
                        if (z28) {
                            cVarH = i53.a.a(0, 5);
                        } else {
                            cVarH = e0.h(0, 9);
                        }
                        if (z27 != 0 || z14) {
                            str10 = strQ;
                        } else {
                            str10 = null;
                        }
                        cVarE2 = i53.a.e(p13.u.C(new String[]{str10, (z27 == 0 && z14) ? null : strQ2}));
                        int iIndexOf2 = cVarE.indexOf(Integer.valueOf(n1Var.getIntValue()));
                        c.f151221a.getClass();
                        z3.e eVar = c.f151222b;
                        boolean zB2 = o0VarE.B(cVarE);
                        i68 = i58 & 896;
                        if (i68 == 256) {
                            z29 = true;
                        } else {
                            z29 = false;
                        }
                        z34 = z29 | zB2;
                        objQ5 = o0VarE.q();
                        if (!z34 || objQ5 == c2565a) {
                            objQ5 = new r21.p(cVarE, lVar, n1Var, n1Var2, 1);
                            cVar = cVarE;
                            o0VarE.K(objQ5);
                        } else {
                            cVar = cVarE;
                        }
                        arrayList.add(new p(cVar, iIndexOf2, null, null, eVar, 0.0f, false, false, null, null, (e23.l) objQ5, 1004, null));
                        int iIndexOf3 = cVarH.indexOf(Integer.valueOf(n1Var2.getIntValue()));
                        if ((i66 & 3670016) == 1048576) {
                            z35 = true;
                        } else {
                            z35 = false;
                        }
                        objQ6 = o0VarE.q();
                        if (z35 || objQ6 == c2565a) {
                            objQ6 = new o60.b(str6, 20);
                            o0VarE.K(objQ6);
                        }
                        e23.l lVar10 = (e23.l) objQ6;
                        z3.e eVarC2 = z3.f.c(-1020879543, new g0(z18, strQ2, 8, (byte) 0), o0VarE);
                        boolean zB3 = o0VarE.B(cVarH);
                        if (i68 == 256) {
                            z36 = true;
                        } else {
                            z36 = false;
                        }
                        z37 = zB3 | z36;
                        objQ7 = o0VarE.q();
                        if (!z37 || objQ7 == c2565a) {
                            i53.c cVar3 = cVarH;
                            objQ7 = new r21.p(cVar3, lVar, n1Var2, n1Var, 2);
                            cVar2 = cVar3;
                            o0VarE.K(objQ7);
                        } else {
                            cVar2 = cVarH;
                        }
                        arrayList.add(new p(cVar2, iIndexOf3, lVar10, null, eVarC2, 0.0f, false, false, null, null, (e23.l) objQ7, 1000, null));
                        if (z18) {
                            lVar9 = lVar8;
                            i69 = 0;
                            o0VarE.C(-1913581526);
                            o0VarE.g0(false);
                        } else {
                            o0VarE.C(-1913769882);
                            z38 = (57344 & i58) == 16384;
                            objQ8 = o0VarE.q();
                            if (!z38 || objQ8 == c2565a) {
                                lVar9 = lVar8;
                                objQ8 = new qe2.c(lVar9, 9);
                                o0VarE.K(objQ8);
                            } else {
                                lVar9 = lVar8;
                            }
                            arrayList.add(new p(cVarE2, 0, null, null, null, 0.0f, false, false, null, null, (e23.l) objQ8, 1022, null));
                            i69 = 0;
                            o0VarE.g0(false);
                        }
                        h4.r rVar4 = rVar3;
                        k.c(rVar4, i53.a.e(arrayList), o0VarE, i66 & 14, i69);
                        d19 = d18;
                        rVar2 = rVar4;
                        lVar5 = lVar9;
                        z26 = z18;
                        str9 = strQ3;
                        d25 = d27;
                        d24 = d26;
                        z24 = z27;
                        str7 = strQ;
                        z25 = z28;
                        lVar6 = lVar7;
                        str8 = strQ2;
                        i59 = i67;
                    } else {
                        o0VarE.e();
                        rVar2 = rVar;
                        lVar5 = lVar3;
                        z24 = z16;
                        z25 = z17;
                        lVar6 = lVar4;
                        d19 = d18;
                        z26 = z18;
                        str7 = str5;
                        str8 = str2;
                        str9 = str3;
                        d24 = d16;
                        i59 = i14;
                        d25 = d17;
                    }
                    p2VarI0 = o0VarE.i0();
                    if (p2VarI0 != null) {
                        p2VarI0.f135219d = new e23.p() { // from class: r82.t
                            @Override // e23.p
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iT = p0.t(i15 | 1);
                                int iT2 = p0.t(i16);
                                u.a(rVar2, z14, z26, str7, str8, str9, str6, d14, d19, d24, i59, d25, lVar, lVar6, lVar5, z24, z25, (p3.m) obj, iT, iT2, i17);
                                return Unit.INSTANCE;
                            }
                        };
                    }
                }
                i45 |= 3072;
                lVar4 = lVar2;
                i48 = i17 & 16384;
                if (i48 != 0) {
                    i54 = i45 | 24576;
                } else {
                    i49 = i45;
                    if ((i16 & 24576) == 0) {
                        i54 = i49 | (o0VarE.r(lVar3) ? 16384 : 8192);
                    } else {
                        i54 = i49;
                    }
                }
                i55 = i17 & 32768;
                if (i55 != 0) {
                    i54 |= 196608;
                } else if ((i16 & 196608) == 0) {
                    if (o0VarE.h(z16)) {
                        i56 = 131072;
                    } else {
                        i56 = 65536;
                    }
                    i54 |= i56;
                }
                i57 = i17 & 65536;
                if (i57 != 0) {
                    i54 |= 1572864;
                } else if ((i16 & 1572864) == 0) {
                    i54 |= o0VarE.h(z17) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
                }
                i58 = i54;
                if ((i38 & 306783379) == 306783378) {
                    z19 = true;
                } else {
                    z19 = true;
                }
                if (o0VarE.n(i38 & 1, z19)) {
                    o0VarE.G0();
                    i64 = i15 & 1;
                    aVar = p3.m.f135153a;
                    if (i64 != 0) {
                        if (i75 != 0) {
                            rVar3 = h4.r.S;
                        } else {
                            rVar3 = rVar;
                        }
                        if (i76 != 0) {
                            z18 = false;
                        }
                        if ((i17 & 8) != 0) {
                            strQ = y.Q(o0VarE, R.string.gak_lbl_kg);
                            i38 &= -7169;
                        } else {
                            strQ = str5;
                        }
                        if ((i17 & 16) != 0) {
                            strQ2 = y.Q(o0VarE, R.string.gak_lbl_lbs);
                            i38 &= -57345;
                        } else {
                            strQ2 = str2;
                        }
                        strQ3 = y.Q(o0VarE, R.string.gak_lbl_st);
                        i65 = i38 & (-458753);
                        if (i26 != 0) {
                            str6 = ".";
                        }
                        if (i35 != 0) {
                            d18 = 453.5d;
                        }
                        if (i37 != 0) {
                            d26 = 999.9d;
                        } else {
                            d26 = d16;
                        }
                        if (i46 != 0) {
                            objQ2 = o0VarE.q();
                            aVar.getClass();
                            if (objQ2 == p3.m.a.f135155b) {
                                objQ2 = new e(7);
                                o0VarE.K(objQ2);
                            }
                            lVar7 = (e23.l) objQ2;
                        } else {
                            lVar7 = lVar4;
                        }
                        if (i48 != 0) {
                            objQ = o0VarE.q();
                            aVar.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = new e(8);
                                o0VarE.K(objQ);
                            }
                            lVar8 = (e23.l) objQ;
                        } else {
                            lVar8 = lVar3;
                        }
                        if (i55 != 0) {
                            z27 = false;
                        } else {
                            z27 = z16;
                        }
                        d27 = 13.9d;
                        if (i57 != 0) {
                            i66 = i65;
                            i67 = 71;
                            z28 = false;
                        } else {
                            i66 = i65;
                            i67 = 71;
                            z28 = z17;
                        }
                    } else {
                        if (i75 != 0) {
                            rVar3 = h4.r.S;
                        } else {
                            rVar3 = rVar;
                        }
                        if (i76 != 0) {
                            z18 = false;
                        }
                        if ((i17 & 8) != 0) {
                            strQ = y.Q(o0VarE, R.string.gak_lbl_kg);
                            i38 &= -7169;
                        } else {
                            strQ = str5;
                        }
                        if ((i17 & 16) != 0) {
                            strQ2 = y.Q(o0VarE, R.string.gak_lbl_lbs);
                            i38 &= -57345;
                        } else {
                            strQ2 = str2;
                        }
                        strQ3 = y.Q(o0VarE, R.string.gak_lbl_st);
                        i65 = i38 & (-458753);
                        if (i26 != 0) {
                            str6 = ".";
                        }
                        if (i35 != 0) {
                            d18 = 453.5d;
                        }
                        if (i37 != 0) {
                            d26 = 999.9d;
                        } else {
                            d26 = d16;
                        }
                        if (i46 != 0) {
                            objQ2 = o0VarE.q();
                            aVar.getClass();
                            if (objQ2 == p3.m.a.f135155b) {
                                objQ2 = new e(7);
                                o0VarE.K(objQ2);
                            }
                            lVar7 = (e23.l) objQ2;
                        } else {
                            lVar7 = lVar4;
                        }
                        if (i48 != 0) {
                            objQ = o0VarE.q();
                            aVar.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = new e(8);
                                o0VarE.K(objQ);
                            }
                            lVar8 = (e23.l) objQ;
                        } else {
                            lVar8 = lVar3;
                        }
                        if (i55 != 0) {
                            z27 = false;
                        } else {
                            z27 = z16;
                        }
                        d27 = 13.9d;
                        if (i57 != 0) {
                            i66 = i65;
                            i67 = 71;
                            z28 = false;
                        } else {
                            i66 = i65;
                            i67 = 71;
                            z28 = z17;
                        }
                    }
                    o0VarE.h0();
                    x1 x1Var2 = p3.n.f135158a;
                    if (z14) {
                        d28 = d18;
                    } else if (z18) {
                        d28 = d27;
                    } else {
                        d28 = d26;
                    }
                    arrayList = new ArrayList();
                    if (z18) {
                        o0VarE.C(-1917435849);
                        int i710 = (int) d14;
                        double d37 = 10;
                        o13.p pVar2 = new o13.p(Integer.valueOf(i710), Double.valueOf(Math.rint(((d14 - ((double) i710)) * 14.0d) * d37) / d37));
                        int iIntValue2 = ((Number) pVar2.f128594a).intValue();
                        double dDoubleValue2 = ((Number) pVar2.f128595b).doubleValue();
                        iE = j23.t.e(iIntValue2, 0, i67);
                        double d38 = d28;
                        dC = j23.t.c(dDoubleValue2, 0.0d, d38);
                        objQ9 = o0VarE.q();
                        aVar.getClass();
                        c2565a2 = p3.m.a.f135155b;
                        if (objQ9 == c2565a2) {
                            objQ9 = e5.o(iE, o0VarE);
                        }
                        n1Var3 = (n1) objQ9;
                        cVarH2 = e0.h(0, i67);
                        int iIndexOf4 = cVarH2.indexOf(Integer.valueOf(n1Var3.getIntValue()));
                        z3.e eVarC3 = z3.f.c(507960485, new h3(strQ3, 13), o0VarE);
                        boolean zB4 = o0VarE.B(cVarH2);
                        if ((i58 & 7168) == 2048) {
                            z39 = true;
                        } else {
                            z39 = false;
                        }
                        z44 = z39 | zB4;
                        objQ10 = o0VarE.q();
                        if (z44) {
                            objQ10 = new j0(cVarH2, lVar7, n1Var3);
                            o0VarE.K(objQ10);
                        } else {
                            objQ10 = new j0(cVarH2, lVar7, n1Var3);
                            o0VarE.K(objQ10);
                        }
                        arrayList.add(new p(cVarH2, iIndexOf4, null, null, eVarC3, 0.0f, false, false, null, null, (e23.l) objQ10, 1004, null));
                        o0VarE.g0(false);
                        d29 = d38;
                    } else {
                        double d39 = d28;
                        o0VarE.C(-1916240923);
                        o0VarE.g0(false);
                        dC = j23.t.c(d14, 0.0d, d39);
                        d29 = d39;
                        Unit unit2 = Unit.INSTANCE;
                    }
                    if (z28) {
                        dC = ((double) MathKt.b(dC * 2.0d)) / 2.0d;
                    }
                    objQ3 = o0VarE.q();
                    aVar.getClass();
                    c2565a = p3.m.a.f135155b;
                    if (objQ3 == c2565a) {
                        objQ3 = e5.o(new BigDecimal(String.valueOf(dC)).intValue(), o0VarE);
                    }
                    n1Var = (n1) objQ3;
                    objQ4 = o0VarE.q();
                    if (objQ4 == c2565a) {
                        BigDecimal bigDecimal2 = new BigDecimal(String.valueOf(dC));
                        BigDecimal bigDecimalValueOf2 = BigDecimal.valueOf(n1Var.getIntValue());
                        bigDecimalValueOf2.getClass();
                        BigDecimal bigDecimalSubtract2 = bigDecimal2.subtract(bigDecimalValueOf2);
                        bigDecimalSubtract2.getClass();
                        BigDecimal bigDecimalMultiply2 = bigDecimalSubtract2.multiply(new BigDecimal(10.0d));
                        bigDecimalMultiply2.getClass();
                        objQ4 = e5.o(bigDecimalMultiply2.intValue(), o0VarE);
                    }
                    n1Var2 = (n1) objQ4;
                    cVarE = i53.a.e(new j23.l(0, (int) d29));
                    if (z28) {
                        cVarH = i53.a.a(0, 5);
                    } else {
                        cVarH = e0.h(0, 9);
                    }
                    if (z27 != 0) {
                        str10 = strQ;
                    } else {
                        str10 = strQ;
                    }
                    cVarE2 = i53.a.e(p13.u.C(new String[]{str10, (z27 == 0 && z14) ? null : strQ2}));
                    int iIndexOf5 = cVarE.indexOf(Integer.valueOf(n1Var.getIntValue()));
                    c.f151221a.getClass();
                    z3.e eVar2 = c.f151222b;
                    boolean zB5 = o0VarE.B(cVarE);
                    i68 = i58 & 896;
                    if (i68 == 256) {
                        z29 = true;
                    } else {
                        z29 = false;
                    }
                    z34 = z29 | zB5;
                    objQ5 = o0VarE.q();
                    if (z34) {
                        objQ5 = new r21.p(cVarE, lVar, n1Var, n1Var2, 1);
                        cVar = cVarE;
                        o0VarE.K(objQ5);
                    } else {
                        objQ5 = new r21.p(cVarE, lVar, n1Var, n1Var2, 1);
                        cVar = cVarE;
                        o0VarE.K(objQ5);
                    }
                    arrayList.add(new p(cVar, iIndexOf5, null, null, eVar2, 0.0f, false, false, null, null, (e23.l) objQ5, 1004, null));
                    int iIndexOf6 = cVarH.indexOf(Integer.valueOf(n1Var2.getIntValue()));
                    if ((i66 & 3670016) == 1048576) {
                        z35 = true;
                    } else {
                        z35 = false;
                    }
                    objQ6 = o0VarE.q();
                    if (z35) {
                        objQ6 = new o60.b(str6, 20);
                        o0VarE.K(objQ6);
                    } else {
                        objQ6 = new o60.b(str6, 20);
                        o0VarE.K(objQ6);
                    }
                    e23.l lVar11 = (e23.l) objQ6;
                    z3.e eVarC4 = z3.f.c(-1020879543, new g0(z18, strQ2, 8, (byte) 0), o0VarE);
                    boolean zB6 = o0VarE.B(cVarH);
                    if (i68 == 256) {
                        z36 = true;
                    } else {
                        z36 = false;
                    }
                    z37 = zB6 | z36;
                    objQ7 = o0VarE.q();
                    if (z37) {
                        i53.c cVar4 = cVarH;
                        objQ7 = new r21.p(cVar4, lVar, n1Var2, n1Var, 2);
                        cVar2 = cVar4;
                        o0VarE.K(objQ7);
                    } else {
                        i53.c cVar5 = cVarH;
                        objQ7 = new r21.p(cVar5, lVar, n1Var2, n1Var, 2);
                        cVar2 = cVar5;
                        o0VarE.K(objQ7);
                    }
                    arrayList.add(new p(cVar2, iIndexOf6, lVar11, null, eVarC4, 0.0f, false, false, null, null, (e23.l) objQ7, 1000, null));
                    if (z18) {
                        o0VarE.C(-1913769882);
                        if ((57344 & i58) == 16384) {
                        }
                        objQ8 = o0VarE.q();
                        if (z38) {
                            lVar9 = lVar8;
                            objQ8 = new qe2.c(lVar9, 9);
                            o0VarE.K(objQ8);
                        } else {
                            lVar9 = lVar8;
                            objQ8 = new qe2.c(lVar9, 9);
                            o0VarE.K(objQ8);
                        }
                        arrayList.add(new p(cVarE2, 0, null, null, null, 0.0f, false, false, null, null, (e23.l) objQ8, 1022, null));
                        i69 = 0;
                        o0VarE.g0(false);
                    } else {
                        lVar9 = lVar8;
                        i69 = 0;
                        o0VarE.C(-1913581526);
                        o0VarE.g0(false);
                    }
                    h4.r rVar5 = rVar3;
                    k.c(rVar5, i53.a.e(arrayList), o0VarE, i66 & 14, i69);
                    d19 = d18;
                    rVar2 = rVar5;
                    lVar5 = lVar9;
                    z26 = z18;
                    str9 = strQ3;
                    d25 = d27;
                    d24 = d26;
                    z24 = z27;
                    str7 = strQ;
                    z25 = z28;
                    lVar6 = lVar7;
                    str8 = strQ2;
                    i59 = i67;
                } else {
                    o0VarE.e();
                    rVar2 = rVar;
                    lVar5 = lVar3;
                    z24 = z16;
                    z25 = z17;
                    lVar6 = lVar4;
                    d19 = d18;
                    z26 = z18;
                    str7 = str5;
                    str8 = str2;
                    str9 = str3;
                    d24 = d16;
                    i59 = i14;
                    d25 = d17;
                }
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new e23.p() { // from class: r82.t
                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iT = p0.t(i15 | 1);
                            int iT2 = p0.t(i16);
                            u.a(rVar2, z14, z26, str7, str8, str9, str6, d14, d19, d24, i59, d25, lVar, lVar6, lVar5, z24, z25, (p3.m) obj, iT, iT2, i17);
                            return Unit.INSTANCE;
                        }
                    };
                }
            }
            str5 = str;
            int i711 = i18 | i77;
            if ((i17 & 16) == 0) {
                i19 = 8192;
            } else {
                i19 = 8192;
            }
            i24 = i711 | i19;
            i25 = i24 | 65536;
            i26 = i17 & 64;
            if (i26 != 0) {
                i28 = i24 | 1638400;
                str6 = str4;
            } else {
                str6 = str4;
                if (o0VarE.B(str6)) {
                    i27 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                } else {
                    i27 = 524288;
                }
                i28 = i25 | i27;
            }
            if (o0VarE.m(d14)) {
                i29 = 8388608;
            } else {
                i29 = 4194304;
            }
            i30 = i28 | i29;
            i34 = i17 & 256;
            if (i34 != 0) {
                i30 |= 100663296;
                i35 = i34;
                d18 = d15;
            } else {
                i35 = i34;
                d18 = d15;
                if ((i15 & 100663296) == 0) {
                    if (o0VarE.m(d18)) {
                        i36 = 67108864;
                    } else {
                        i36 = 33554432;
                    }
                    i30 |= i36;
                }
            }
            i37 = i17 & 512;
            if (i37 != 0) {
                i75 = i75;
                i38 = i30 | C.ENCODING_PCM_32BIT;
            } else {
                if ((i15 & C.ENCODING_PCM_32BIT) != 0) {
                    if (o0VarE.m(d16)) {
                        i39 = 536870912;
                    } else {
                        i39 = 268435456;
                    }
                    i30 |= i39;
                }
                i38 = i30;
            }
            i44 = i16 | 54;
            if ((i16 & 384) != 0) {
                if (o0VarE.r(lVar)) {
                    i74 = 256;
                } else {
                    i74 = 128;
                }
                i44 |= i74;
            }
            i45 = i44;
            i46 = i17 & 8192;
            if (i46 != 0) {
                if ((i16 & 3072) == 0) {
                    lVar4 = lVar2;
                    if (o0VarE.r(lVar4)) {
                        i47 = 2048;
                    } else {
                        i47 = 1024;
                    }
                    i45 |= i47;
                }
                i48 = i17 & 16384;
                if (i48 != 0) {
                    i54 = i45 | 24576;
                } else {
                    i49 = i45;
                    if ((i16 & 24576) == 0) {
                        i54 = i49 | (o0VarE.r(lVar3) ? 16384 : 8192);
                    } else {
                        i54 = i49;
                    }
                }
                i55 = i17 & 32768;
                if (i55 != 0) {
                    i54 |= 196608;
                } else if ((i16 & 196608) == 0) {
                    if (o0VarE.h(z16)) {
                        i56 = 131072;
                    } else {
                        i56 = 65536;
                    }
                    i54 |= i56;
                }
                i57 = i17 & 65536;
                if (i57 != 0) {
                    i54 |= 1572864;
                } else if ((i16 & 1572864) == 0) {
                    i54 |= o0VarE.h(z17) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
                }
                i58 = i54;
                if ((i38 & 306783379) == 306783378) {
                    z19 = true;
                } else {
                    z19 = true;
                }
                if (o0VarE.n(i38 & 1, z19)) {
                    o0VarE.G0();
                    i64 = i15 & 1;
                    aVar = p3.m.f135153a;
                    if (i64 != 0) {
                        if (i75 != 0) {
                            rVar3 = h4.r.S;
                        } else {
                            rVar3 = rVar;
                        }
                        if (i76 != 0) {
                            z18 = false;
                        }
                        if ((i17 & 8) != 0) {
                            strQ = y.Q(o0VarE, R.string.gak_lbl_kg);
                            i38 &= -7169;
                        } else {
                            strQ = str5;
                        }
                        if ((i17 & 16) != 0) {
                            strQ2 = y.Q(o0VarE, R.string.gak_lbl_lbs);
                            i38 &= -57345;
                        } else {
                            strQ2 = str2;
                        }
                        strQ3 = y.Q(o0VarE, R.string.gak_lbl_st);
                        i65 = i38 & (-458753);
                        if (i26 != 0) {
                            str6 = ".";
                        }
                        if (i35 != 0) {
                            d18 = 453.5d;
                        }
                        if (i37 != 0) {
                            d26 = 999.9d;
                        } else {
                            d26 = d16;
                        }
                        if (i46 != 0) {
                            objQ2 = o0VarE.q();
                            aVar.getClass();
                            if (objQ2 == p3.m.a.f135155b) {
                                objQ2 = new e(7);
                                o0VarE.K(objQ2);
                            }
                            lVar7 = (e23.l) objQ2;
                        } else {
                            lVar7 = lVar4;
                        }
                        if (i48 != 0) {
                            objQ = o0VarE.q();
                            aVar.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = new e(8);
                                o0VarE.K(objQ);
                            }
                            lVar8 = (e23.l) objQ;
                        } else {
                            lVar8 = lVar3;
                        }
                        if (i55 != 0) {
                            z27 = false;
                        } else {
                            z27 = z16;
                        }
                        d27 = 13.9d;
                        if (i57 != 0) {
                            i66 = i65;
                            i67 = 71;
                            z28 = false;
                        } else {
                            i66 = i65;
                            i67 = 71;
                            z28 = z17;
                        }
                    } else {
                        if (i75 != 0) {
                            rVar3 = h4.r.S;
                        } else {
                            rVar3 = rVar;
                        }
                        if (i76 != 0) {
                            z18 = false;
                        }
                        if ((i17 & 8) != 0) {
                            strQ = y.Q(o0VarE, R.string.gak_lbl_kg);
                            i38 &= -7169;
                        } else {
                            strQ = str5;
                        }
                        if ((i17 & 16) != 0) {
                            strQ2 = y.Q(o0VarE, R.string.gak_lbl_lbs);
                            i38 &= -57345;
                        } else {
                            strQ2 = str2;
                        }
                        strQ3 = y.Q(o0VarE, R.string.gak_lbl_st);
                        i65 = i38 & (-458753);
                        if (i26 != 0) {
                            str6 = ".";
                        }
                        if (i35 != 0) {
                            d18 = 453.5d;
                        }
                        if (i37 != 0) {
                            d26 = 999.9d;
                        } else {
                            d26 = d16;
                        }
                        if (i46 != 0) {
                            objQ2 = o0VarE.q();
                            aVar.getClass();
                            if (objQ2 == p3.m.a.f135155b) {
                                objQ2 = new e(7);
                                o0VarE.K(objQ2);
                            }
                            lVar7 = (e23.l) objQ2;
                        } else {
                            lVar7 = lVar4;
                        }
                        if (i48 != 0) {
                            objQ = o0VarE.q();
                            aVar.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = new e(8);
                                o0VarE.K(objQ);
                            }
                            lVar8 = (e23.l) objQ;
                        } else {
                            lVar8 = lVar3;
                        }
                        if (i55 != 0) {
                            z27 = false;
                        } else {
                            z27 = z16;
                        }
                        d27 = 13.9d;
                        if (i57 != 0) {
                            i66 = i65;
                            i67 = 71;
                            z28 = false;
                        } else {
                            i66 = i65;
                            i67 = 71;
                            z28 = z17;
                        }
                    }
                    o0VarE.h0();
                    x1 x1Var3 = p3.n.f135158a;
                    if (z14) {
                        d28 = d18;
                    } else if (z18) {
                        d28 = d27;
                    } else {
                        d28 = d26;
                    }
                    arrayList = new ArrayList();
                    if (z18) {
                        o0VarE.C(-1917435849);
                        int i712 = (int) d14;
                        double d310 = 10;
                        o13.p pVar3 = new o13.p(Integer.valueOf(i712), Double.valueOf(Math.rint(((d14 - ((double) i712)) * 14.0d) * d310) / d310));
                        int iIntValue3 = ((Number) pVar3.f128594a).intValue();
                        double dDoubleValue3 = ((Number) pVar3.f128595b).doubleValue();
                        iE = j23.t.e(iIntValue3, 0, i67);
                        double d311 = d28;
                        dC = j23.t.c(dDoubleValue3, 0.0d, d311);
                        objQ9 = o0VarE.q();
                        aVar.getClass();
                        c2565a2 = p3.m.a.f135155b;
                        if (objQ9 == c2565a2) {
                            objQ9 = e5.o(iE, o0VarE);
                        }
                        n1Var3 = (n1) objQ9;
                        cVarH2 = e0.h(0, i67);
                        int iIndexOf7 = cVarH2.indexOf(Integer.valueOf(n1Var3.getIntValue()));
                        z3.e eVarC5 = z3.f.c(507960485, new h3(strQ3, 13), o0VarE);
                        boolean zB7 = o0VarE.B(cVarH2);
                        if ((i58 & 7168) == 2048) {
                            z39 = true;
                        } else {
                            z39 = false;
                        }
                        z44 = z39 | zB7;
                        objQ10 = o0VarE.q();
                        if (z44) {
                            objQ10 = new j0(cVarH2, lVar7, n1Var3);
                            o0VarE.K(objQ10);
                        } else {
                            objQ10 = new j0(cVarH2, lVar7, n1Var3);
                            o0VarE.K(objQ10);
                        }
                        arrayList.add(new p(cVarH2, iIndexOf7, null, null, eVarC5, 0.0f, false, false, null, null, (e23.l) objQ10, 1004, null));
                        o0VarE.g0(false);
                        d29 = d311;
                    } else {
                        double d312 = d28;
                        o0VarE.C(-1916240923);
                        o0VarE.g0(false);
                        dC = j23.t.c(d14, 0.0d, d312);
                        d29 = d312;
                        Unit unit3 = Unit.INSTANCE;
                    }
                    if (z28) {
                        dC = ((double) MathKt.b(dC * 2.0d)) / 2.0d;
                    }
                    objQ3 = o0VarE.q();
                    aVar.getClass();
                    c2565a = p3.m.a.f135155b;
                    if (objQ3 == c2565a) {
                        objQ3 = e5.o(new BigDecimal(String.valueOf(dC)).intValue(), o0VarE);
                    }
                    n1Var = (n1) objQ3;
                    objQ4 = o0VarE.q();
                    if (objQ4 == c2565a) {
                        BigDecimal bigDecimal3 = new BigDecimal(String.valueOf(dC));
                        BigDecimal bigDecimalValueOf3 = BigDecimal.valueOf(n1Var.getIntValue());
                        bigDecimalValueOf3.getClass();
                        BigDecimal bigDecimalSubtract3 = bigDecimal3.subtract(bigDecimalValueOf3);
                        bigDecimalSubtract3.getClass();
                        BigDecimal bigDecimalMultiply3 = bigDecimalSubtract3.multiply(new BigDecimal(10.0d));
                        bigDecimalMultiply3.getClass();
                        objQ4 = e5.o(bigDecimalMultiply3.intValue(), o0VarE);
                    }
                    n1Var2 = (n1) objQ4;
                    cVarE = i53.a.e(new j23.l(0, (int) d29));
                    if (z28) {
                        cVarH = i53.a.a(0, 5);
                    } else {
                        cVarH = e0.h(0, 9);
                    }
                    if (z27 != 0) {
                        str10 = strQ;
                    } else {
                        str10 = strQ;
                    }
                    cVarE2 = i53.a.e(p13.u.C(new String[]{str10, (z27 == 0 && z14) ? null : strQ2}));
                    int iIndexOf8 = cVarE.indexOf(Integer.valueOf(n1Var.getIntValue()));
                    c.f151221a.getClass();
                    z3.e eVar3 = c.f151222b;
                    boolean zB8 = o0VarE.B(cVarE);
                    i68 = i58 & 896;
                    if (i68 == 256) {
                        z29 = true;
                    } else {
                        z29 = false;
                    }
                    z34 = z29 | zB8;
                    objQ5 = o0VarE.q();
                    if (z34) {
                        objQ5 = new r21.p(cVarE, lVar, n1Var, n1Var2, 1);
                        cVar = cVarE;
                        o0VarE.K(objQ5);
                    } else {
                        objQ5 = new r21.p(cVarE, lVar, n1Var, n1Var2, 1);
                        cVar = cVarE;
                        o0VarE.K(objQ5);
                    }
                    arrayList.add(new p(cVar, iIndexOf8, null, null, eVar3, 0.0f, false, false, null, null, (e23.l) objQ5, 1004, null));
                    int iIndexOf9 = cVarH.indexOf(Integer.valueOf(n1Var2.getIntValue()));
                    if ((i66 & 3670016) == 1048576) {
                        z35 = true;
                    } else {
                        z35 = false;
                    }
                    objQ6 = o0VarE.q();
                    if (z35) {
                        objQ6 = new o60.b(str6, 20);
                        o0VarE.K(objQ6);
                    } else {
                        objQ6 = new o60.b(str6, 20);
                        o0VarE.K(objQ6);
                    }
                    e23.l lVar12 = (e23.l) objQ6;
                    z3.e eVarC6 = z3.f.c(-1020879543, new g0(z18, strQ2, 8, (byte) 0), o0VarE);
                    boolean zB9 = o0VarE.B(cVarH);
                    if (i68 == 256) {
                        z36 = true;
                    } else {
                        z36 = false;
                    }
                    z37 = zB9 | z36;
                    objQ7 = o0VarE.q();
                    if (z37) {
                        i53.c cVar6 = cVarH;
                        objQ7 = new r21.p(cVar6, lVar, n1Var2, n1Var, 2);
                        cVar2 = cVar6;
                        o0VarE.K(objQ7);
                    } else {
                        i53.c cVar7 = cVarH;
                        objQ7 = new r21.p(cVar7, lVar, n1Var2, n1Var, 2);
                        cVar2 = cVar7;
                        o0VarE.K(objQ7);
                    }
                    arrayList.add(new p(cVar2, iIndexOf9, lVar12, null, eVarC6, 0.0f, false, false, null, null, (e23.l) objQ7, 1000, null));
                    if (z18) {
                        o0VarE.C(-1913769882);
                        if ((57344 & i58) == 16384) {
                        }
                        objQ8 = o0VarE.q();
                        if (z38) {
                            lVar9 = lVar8;
                            objQ8 = new qe2.c(lVar9, 9);
                            o0VarE.K(objQ8);
                        } else {
                            lVar9 = lVar8;
                            objQ8 = new qe2.c(lVar9, 9);
                            o0VarE.K(objQ8);
                        }
                        arrayList.add(new p(cVarE2, 0, null, null, null, 0.0f, false, false, null, null, (e23.l) objQ8, 1022, null));
                        i69 = 0;
                        o0VarE.g0(false);
                    } else {
                        lVar9 = lVar8;
                        i69 = 0;
                        o0VarE.C(-1913581526);
                        o0VarE.g0(false);
                    }
                    h4.r rVar6 = rVar3;
                    k.c(rVar6, i53.a.e(arrayList), o0VarE, i66 & 14, i69);
                    d19 = d18;
                    rVar2 = rVar6;
                    lVar5 = lVar9;
                    z26 = z18;
                    str9 = strQ3;
                    d25 = d27;
                    d24 = d26;
                    z24 = z27;
                    str7 = strQ;
                    z25 = z28;
                    lVar6 = lVar7;
                    str8 = strQ2;
                    i59 = i67;
                } else {
                    o0VarE.e();
                    rVar2 = rVar;
                    lVar5 = lVar3;
                    z24 = z16;
                    z25 = z17;
                    lVar6 = lVar4;
                    d19 = d18;
                    z26 = z18;
                    str7 = str5;
                    str8 = str2;
                    str9 = str3;
                    d24 = d16;
                    i59 = i14;
                    d25 = d17;
                }
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new e23.p() { // from class: r82.t
                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iT = p0.t(i15 | 1);
                            int iT2 = p0.t(i16);
                            u.a(rVar2, z14, z26, str7, str8, str9, str6, d14, d19, d24, i59, d25, lVar, lVar6, lVar5, z24, z25, (p3.m) obj, iT, iT2, i17);
                            return Unit.INSTANCE;
                        }
                    };
                }
            }
            i45 |= 3072;
            lVar4 = lVar2;
            i48 = i17 & 16384;
            if (i48 != 0) {
                i54 = i45 | 24576;
            } else {
                i49 = i45;
                if ((i16 & 24576) == 0) {
                    i54 = i49 | (o0VarE.r(lVar3) ? 16384 : 8192);
                } else {
                    i54 = i49;
                }
            }
            i55 = i17 & 32768;
            if (i55 != 0) {
                i54 |= 196608;
            } else if ((i16 & 196608) == 0) {
                if (o0VarE.h(z16)) {
                    i56 = 131072;
                } else {
                    i56 = 65536;
                }
                i54 |= i56;
            }
            i57 = i17 & 65536;
            if (i57 != 0) {
                i54 |= 1572864;
            } else if ((i16 & 1572864) == 0) {
                i54 |= o0VarE.h(z17) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
            }
            i58 = i54;
            if ((i38 & 306783379) == 306783378) {
                z19 = true;
            } else {
                z19 = true;
            }
            if (o0VarE.n(i38 & 1, z19)) {
                o0VarE.G0();
                i64 = i15 & 1;
                aVar = p3.m.f135153a;
                if (i64 != 0) {
                    if (i75 != 0) {
                        rVar3 = h4.r.S;
                    } else {
                        rVar3 = rVar;
                    }
                    if (i76 != 0) {
                        z18 = false;
                    }
                    if ((i17 & 8) != 0) {
                        strQ = y.Q(o0VarE, R.string.gak_lbl_kg);
                        i38 &= -7169;
                    } else {
                        strQ = str5;
                    }
                    if ((i17 & 16) != 0) {
                        strQ2 = y.Q(o0VarE, R.string.gak_lbl_lbs);
                        i38 &= -57345;
                    } else {
                        strQ2 = str2;
                    }
                    strQ3 = y.Q(o0VarE, R.string.gak_lbl_st);
                    i65 = i38 & (-458753);
                    if (i26 != 0) {
                        str6 = ".";
                    }
                    if (i35 != 0) {
                        d18 = 453.5d;
                    }
                    if (i37 != 0) {
                        d26 = 999.9d;
                    } else {
                        d26 = d16;
                    }
                    if (i46 != 0) {
                        objQ2 = o0VarE.q();
                        aVar.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new e(7);
                            o0VarE.K(objQ2);
                        }
                        lVar7 = (e23.l) objQ2;
                    } else {
                        lVar7 = lVar4;
                    }
                    if (i48 != 0) {
                        objQ = o0VarE.q();
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new e(8);
                            o0VarE.K(objQ);
                        }
                        lVar8 = (e23.l) objQ;
                    } else {
                        lVar8 = lVar3;
                    }
                    if (i55 != 0) {
                        z27 = false;
                    } else {
                        z27 = z16;
                    }
                    d27 = 13.9d;
                    if (i57 != 0) {
                        i66 = i65;
                        i67 = 71;
                        z28 = false;
                    } else {
                        i66 = i65;
                        i67 = 71;
                        z28 = z17;
                    }
                } else {
                    if (i75 != 0) {
                        rVar3 = h4.r.S;
                    } else {
                        rVar3 = rVar;
                    }
                    if (i76 != 0) {
                        z18 = false;
                    }
                    if ((i17 & 8) != 0) {
                        strQ = y.Q(o0VarE, R.string.gak_lbl_kg);
                        i38 &= -7169;
                    } else {
                        strQ = str5;
                    }
                    if ((i17 & 16) != 0) {
                        strQ2 = y.Q(o0VarE, R.string.gak_lbl_lbs);
                        i38 &= -57345;
                    } else {
                        strQ2 = str2;
                    }
                    strQ3 = y.Q(o0VarE, R.string.gak_lbl_st);
                    i65 = i38 & (-458753);
                    if (i26 != 0) {
                        str6 = ".";
                    }
                    if (i35 != 0) {
                        d18 = 453.5d;
                    }
                    if (i37 != 0) {
                        d26 = 999.9d;
                    } else {
                        d26 = d16;
                    }
                    if (i46 != 0) {
                        objQ2 = o0VarE.q();
                        aVar.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new e(7);
                            o0VarE.K(objQ2);
                        }
                        lVar7 = (e23.l) objQ2;
                    } else {
                        lVar7 = lVar4;
                    }
                    if (i48 != 0) {
                        objQ = o0VarE.q();
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new e(8);
                            o0VarE.K(objQ);
                        }
                        lVar8 = (e23.l) objQ;
                    } else {
                        lVar8 = lVar3;
                    }
                    if (i55 != 0) {
                        z27 = false;
                    } else {
                        z27 = z16;
                    }
                    d27 = 13.9d;
                    if (i57 != 0) {
                        i66 = i65;
                        i67 = 71;
                        z28 = false;
                    } else {
                        i66 = i65;
                        i67 = 71;
                        z28 = z17;
                    }
                }
                o0VarE.h0();
                x1 x1Var4 = p3.n.f135158a;
                if (z14) {
                    d28 = d18;
                } else if (z18) {
                    d28 = d27;
                } else {
                    d28 = d26;
                }
                arrayList = new ArrayList();
                if (z18) {
                    o0VarE.C(-1917435849);
                    int i713 = (int) d14;
                    double d313 = 10;
                    o13.p pVar4 = new o13.p(Integer.valueOf(i713), Double.valueOf(Math.rint(((d14 - ((double) i713)) * 14.0d) * d313) / d313));
                    int iIntValue4 = ((Number) pVar4.f128594a).intValue();
                    double dDoubleValue4 = ((Number) pVar4.f128595b).doubleValue();
                    iE = j23.t.e(iIntValue4, 0, i67);
                    double d314 = d28;
                    dC = j23.t.c(dDoubleValue4, 0.0d, d314);
                    objQ9 = o0VarE.q();
                    aVar.getClass();
                    c2565a2 = p3.m.a.f135155b;
                    if (objQ9 == c2565a2) {
                        objQ9 = e5.o(iE, o0VarE);
                    }
                    n1Var3 = (n1) objQ9;
                    cVarH2 = e0.h(0, i67);
                    int iIndexOf10 = cVarH2.indexOf(Integer.valueOf(n1Var3.getIntValue()));
                    z3.e eVarC7 = z3.f.c(507960485, new h3(strQ3, 13), o0VarE);
                    boolean zB10 = o0VarE.B(cVarH2);
                    if ((i58 & 7168) == 2048) {
                        z39 = true;
                    } else {
                        z39 = false;
                    }
                    z44 = z39 | zB10;
                    objQ10 = o0VarE.q();
                    if (z44) {
                        objQ10 = new j0(cVarH2, lVar7, n1Var3);
                        o0VarE.K(objQ10);
                    } else {
                        objQ10 = new j0(cVarH2, lVar7, n1Var3);
                        o0VarE.K(objQ10);
                    }
                    arrayList.add(new p(cVarH2, iIndexOf10, null, null, eVarC7, 0.0f, false, false, null, null, (e23.l) objQ10, 1004, null));
                    o0VarE.g0(false);
                    d29 = d314;
                } else {
                    double d315 = d28;
                    o0VarE.C(-1916240923);
                    o0VarE.g0(false);
                    dC = j23.t.c(d14, 0.0d, d315);
                    d29 = d315;
                    Unit unit4 = Unit.INSTANCE;
                }
                if (z28) {
                    dC = ((double) MathKt.b(dC * 2.0d)) / 2.0d;
                }
                objQ3 = o0VarE.q();
                aVar.getClass();
                c2565a = p3.m.a.f135155b;
                if (objQ3 == c2565a) {
                    objQ3 = e5.o(new BigDecimal(String.valueOf(dC)).intValue(), o0VarE);
                }
                n1Var = (n1) objQ3;
                objQ4 = o0VarE.q();
                if (objQ4 == c2565a) {
                    BigDecimal bigDecimal4 = new BigDecimal(String.valueOf(dC));
                    BigDecimal bigDecimalValueOf4 = BigDecimal.valueOf(n1Var.getIntValue());
                    bigDecimalValueOf4.getClass();
                    BigDecimal bigDecimalSubtract4 = bigDecimal4.subtract(bigDecimalValueOf4);
                    bigDecimalSubtract4.getClass();
                    BigDecimal bigDecimalMultiply4 = bigDecimalSubtract4.multiply(new BigDecimal(10.0d));
                    bigDecimalMultiply4.getClass();
                    objQ4 = e5.o(bigDecimalMultiply4.intValue(), o0VarE);
                }
                n1Var2 = (n1) objQ4;
                cVarE = i53.a.e(new j23.l(0, (int) d29));
                if (z28) {
                    cVarH = i53.a.a(0, 5);
                } else {
                    cVarH = e0.h(0, 9);
                }
                if (z27 != 0) {
                    str10 = strQ;
                } else {
                    str10 = strQ;
                }
                cVarE2 = i53.a.e(p13.u.C(new String[]{str10, (z27 == 0 && z14) ? null : strQ2}));
                int iIndexOf11 = cVarE.indexOf(Integer.valueOf(n1Var.getIntValue()));
                c.f151221a.getClass();
                z3.e eVar4 = c.f151222b;
                boolean zB11 = o0VarE.B(cVarE);
                i68 = i58 & 896;
                if (i68 == 256) {
                    z29 = true;
                } else {
                    z29 = false;
                }
                z34 = z29 | zB11;
                objQ5 = o0VarE.q();
                if (z34) {
                    objQ5 = new r21.p(cVarE, lVar, n1Var, n1Var2, 1);
                    cVar = cVarE;
                    o0VarE.K(objQ5);
                } else {
                    objQ5 = new r21.p(cVarE, lVar, n1Var, n1Var2, 1);
                    cVar = cVarE;
                    o0VarE.K(objQ5);
                }
                arrayList.add(new p(cVar, iIndexOf11, null, null, eVar4, 0.0f, false, false, null, null, (e23.l) objQ5, 1004, null));
                int iIndexOf12 = cVarH.indexOf(Integer.valueOf(n1Var2.getIntValue()));
                if ((i66 & 3670016) == 1048576) {
                    z35 = true;
                } else {
                    z35 = false;
                }
                objQ6 = o0VarE.q();
                if (z35) {
                    objQ6 = new o60.b(str6, 20);
                    o0VarE.K(objQ6);
                } else {
                    objQ6 = new o60.b(str6, 20);
                    o0VarE.K(objQ6);
                }
                e23.l lVar13 = (e23.l) objQ6;
                z3.e eVarC8 = z3.f.c(-1020879543, new g0(z18, strQ2, 8, (byte) 0), o0VarE);
                boolean zB12 = o0VarE.B(cVarH);
                if (i68 == 256) {
                    z36 = true;
                } else {
                    z36 = false;
                }
                z37 = zB12 | z36;
                objQ7 = o0VarE.q();
                if (z37) {
                    i53.c cVar8 = cVarH;
                    objQ7 = new r21.p(cVar8, lVar, n1Var2, n1Var, 2);
                    cVar2 = cVar8;
                    o0VarE.K(objQ7);
                } else {
                    i53.c cVar9 = cVarH;
                    objQ7 = new r21.p(cVar9, lVar, n1Var2, n1Var, 2);
                    cVar2 = cVar9;
                    o0VarE.K(objQ7);
                }
                arrayList.add(new p(cVar2, iIndexOf12, lVar13, null, eVarC8, 0.0f, false, false, null, null, (e23.l) objQ7, 1000, null));
                if (z18) {
                    o0VarE.C(-1913769882);
                    if ((57344 & i58) == 16384) {
                    }
                    objQ8 = o0VarE.q();
                    if (z38) {
                        lVar9 = lVar8;
                        objQ8 = new qe2.c(lVar9, 9);
                        o0VarE.K(objQ8);
                    } else {
                        lVar9 = lVar8;
                        objQ8 = new qe2.c(lVar9, 9);
                        o0VarE.K(objQ8);
                    }
                    arrayList.add(new p(cVarE2, 0, null, null, null, 0.0f, false, false, null, null, (e23.l) objQ8, 1022, null));
                    i69 = 0;
                    o0VarE.g0(false);
                } else {
                    lVar9 = lVar8;
                    i69 = 0;
                    o0VarE.C(-1913581526);
                    o0VarE.g0(false);
                }
                h4.r rVar7 = rVar3;
                k.c(rVar7, i53.a.e(arrayList), o0VarE, i66 & 14, i69);
                d19 = d18;
                rVar2 = rVar7;
                lVar5 = lVar9;
                z26 = z18;
                str9 = strQ3;
                d25 = d27;
                d24 = d26;
                z24 = z27;
                str7 = strQ;
                z25 = z28;
                lVar6 = lVar7;
                str8 = strQ2;
                i59 = i67;
            } else {
                o0VarE.e();
                rVar2 = rVar;
                lVar5 = lVar3;
                z24 = z16;
                z25 = z17;
                lVar6 = lVar4;
                d19 = d18;
                z26 = z18;
                str7 = str5;
                str8 = str2;
                str9 = str3;
                d24 = d16;
                i59 = i14;
                d25 = d17;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new e23.p() { // from class: r82.t
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iT = p0.t(i15 | 1);
                        int iT2 = p0.t(i16);
                        u.a(rVar2, z14, z26, str7, str8, str9, str6, d14, d19, d24, i59, d25, lVar, lVar6, lVar5, z24, z25, (p3.m) obj, iT, iT2, i17);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        i18 |= 384;
        z18 = z15;
        if ((i17 & 8) == 0) {
            str5 = str;
            if (o0VarE.B(str5)) {
            }
            int i714 = i18 | i77;
            if ((i17 & 16) == 0) {
                i19 = 8192;
            } else {
                i19 = 8192;
            }
            i24 = i714 | i19;
            i25 = i24 | 65536;
            i26 = i17 & 64;
            if (i26 != 0) {
                i28 = i24 | 1638400;
                str6 = str4;
            } else {
                str6 = str4;
                if (o0VarE.B(str6)) {
                    i27 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                } else {
                    i27 = 524288;
                }
                i28 = i25 | i27;
            }
            if (o0VarE.m(d14)) {
                i29 = 8388608;
            } else {
                i29 = 4194304;
            }
            i30 = i28 | i29;
            i34 = i17 & 256;
            if (i34 != 0) {
                i30 |= 100663296;
                i35 = i34;
                d18 = d15;
            } else {
                i35 = i34;
                d18 = d15;
                if ((i15 & 100663296) == 0) {
                    if (o0VarE.m(d18)) {
                        i36 = 67108864;
                    } else {
                        i36 = 33554432;
                    }
                    i30 |= i36;
                }
            }
            i37 = i17 & 512;
            if (i37 != 0) {
                i75 = i75;
                i38 = i30 | C.ENCODING_PCM_32BIT;
            } else {
                if ((i15 & C.ENCODING_PCM_32BIT) != 0) {
                    if (o0VarE.m(d16)) {
                        i39 = 536870912;
                    } else {
                        i39 = 268435456;
                    }
                    i30 |= i39;
                }
                i38 = i30;
            }
            i44 = i16 | 54;
            if ((i16 & 384) != 0) {
                if (o0VarE.r(lVar)) {
                    i74 = 256;
                } else {
                    i74 = 128;
                }
                i44 |= i74;
            }
            i45 = i44;
            i46 = i17 & 8192;
            if (i46 != 0) {
                if ((i16 & 3072) == 0) {
                    lVar4 = lVar2;
                    if (o0VarE.r(lVar4)) {
                        i47 = 2048;
                    } else {
                        i47 = 1024;
                    }
                    i45 |= i47;
                }
                i48 = i17 & 16384;
                if (i48 != 0) {
                    i54 = i45 | 24576;
                } else {
                    i49 = i45;
                    if ((i16 & 24576) == 0) {
                        i54 = i49 | (o0VarE.r(lVar3) ? 16384 : 8192);
                    } else {
                        i54 = i49;
                    }
                }
                i55 = i17 & 32768;
                if (i55 != 0) {
                    i54 |= 196608;
                } else if ((i16 & 196608) == 0) {
                    if (o0VarE.h(z16)) {
                        i56 = 131072;
                    } else {
                        i56 = 65536;
                    }
                    i54 |= i56;
                }
                i57 = i17 & 65536;
                if (i57 != 0) {
                    i54 |= 1572864;
                } else if ((i16 & 1572864) == 0) {
                    i54 |= o0VarE.h(z17) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
                }
                i58 = i54;
                if ((i38 & 306783379) == 306783378) {
                    z19 = true;
                } else {
                    z19 = true;
                }
                if (o0VarE.n(i38 & 1, z19)) {
                    o0VarE.G0();
                    i64 = i15 & 1;
                    aVar = p3.m.f135153a;
                    if (i64 != 0) {
                        if (i75 != 0) {
                            rVar3 = h4.r.S;
                        } else {
                            rVar3 = rVar;
                        }
                        if (i76 != 0) {
                            z18 = false;
                        }
                        if ((i17 & 8) != 0) {
                            strQ = y.Q(o0VarE, R.string.gak_lbl_kg);
                            i38 &= -7169;
                        } else {
                            strQ = str5;
                        }
                        if ((i17 & 16) != 0) {
                            strQ2 = y.Q(o0VarE, R.string.gak_lbl_lbs);
                            i38 &= -57345;
                        } else {
                            strQ2 = str2;
                        }
                        strQ3 = y.Q(o0VarE, R.string.gak_lbl_st);
                        i65 = i38 & (-458753);
                        if (i26 != 0) {
                            str6 = ".";
                        }
                        if (i35 != 0) {
                            d18 = 453.5d;
                        }
                        if (i37 != 0) {
                            d26 = 999.9d;
                        } else {
                            d26 = d16;
                        }
                        if (i46 != 0) {
                            objQ2 = o0VarE.q();
                            aVar.getClass();
                            if (objQ2 == p3.m.a.f135155b) {
                                objQ2 = new e(7);
                                o0VarE.K(objQ2);
                            }
                            lVar7 = (e23.l) objQ2;
                        } else {
                            lVar7 = lVar4;
                        }
                        if (i48 != 0) {
                            objQ = o0VarE.q();
                            aVar.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = new e(8);
                                o0VarE.K(objQ);
                            }
                            lVar8 = (e23.l) objQ;
                        } else {
                            lVar8 = lVar3;
                        }
                        if (i55 != 0) {
                            z27 = false;
                        } else {
                            z27 = z16;
                        }
                        d27 = 13.9d;
                        if (i57 != 0) {
                            i66 = i65;
                            i67 = 71;
                            z28 = false;
                        } else {
                            i66 = i65;
                            i67 = 71;
                            z28 = z17;
                        }
                    } else {
                        if (i75 != 0) {
                            rVar3 = h4.r.S;
                        } else {
                            rVar3 = rVar;
                        }
                        if (i76 != 0) {
                            z18 = false;
                        }
                        if ((i17 & 8) != 0) {
                            strQ = y.Q(o0VarE, R.string.gak_lbl_kg);
                            i38 &= -7169;
                        } else {
                            strQ = str5;
                        }
                        if ((i17 & 16) != 0) {
                            strQ2 = y.Q(o0VarE, R.string.gak_lbl_lbs);
                            i38 &= -57345;
                        } else {
                            strQ2 = str2;
                        }
                        strQ3 = y.Q(o0VarE, R.string.gak_lbl_st);
                        i65 = i38 & (-458753);
                        if (i26 != 0) {
                            str6 = ".";
                        }
                        if (i35 != 0) {
                            d18 = 453.5d;
                        }
                        if (i37 != 0) {
                            d26 = 999.9d;
                        } else {
                            d26 = d16;
                        }
                        if (i46 != 0) {
                            objQ2 = o0VarE.q();
                            aVar.getClass();
                            if (objQ2 == p3.m.a.f135155b) {
                                objQ2 = new e(7);
                                o0VarE.K(objQ2);
                            }
                            lVar7 = (e23.l) objQ2;
                        } else {
                            lVar7 = lVar4;
                        }
                        if (i48 != 0) {
                            objQ = o0VarE.q();
                            aVar.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = new e(8);
                                o0VarE.K(objQ);
                            }
                            lVar8 = (e23.l) objQ;
                        } else {
                            lVar8 = lVar3;
                        }
                        if (i55 != 0) {
                            z27 = false;
                        } else {
                            z27 = z16;
                        }
                        d27 = 13.9d;
                        if (i57 != 0) {
                            i66 = i65;
                            i67 = 71;
                            z28 = false;
                        } else {
                            i66 = i65;
                            i67 = 71;
                            z28 = z17;
                        }
                    }
                    o0VarE.h0();
                    x1 x1Var5 = p3.n.f135158a;
                    if (z14) {
                        d28 = d18;
                    } else if (z18) {
                        d28 = d27;
                    } else {
                        d28 = d26;
                    }
                    arrayList = new ArrayList();
                    if (z18) {
                        o0VarE.C(-1917435849);
                        int i715 = (int) d14;
                        double d316 = 10;
                        o13.p pVar5 = new o13.p(Integer.valueOf(i715), Double.valueOf(Math.rint(((d14 - ((double) i715)) * 14.0d) * d316) / d316));
                        int iIntValue5 = ((Number) pVar5.f128594a).intValue();
                        double dDoubleValue5 = ((Number) pVar5.f128595b).doubleValue();
                        iE = j23.t.e(iIntValue5, 0, i67);
                        double d317 = d28;
                        dC = j23.t.c(dDoubleValue5, 0.0d, d317);
                        objQ9 = o0VarE.q();
                        aVar.getClass();
                        c2565a2 = p3.m.a.f135155b;
                        if (objQ9 == c2565a2) {
                            objQ9 = e5.o(iE, o0VarE);
                        }
                        n1Var3 = (n1) objQ9;
                        cVarH2 = e0.h(0, i67);
                        int iIndexOf13 = cVarH2.indexOf(Integer.valueOf(n1Var3.getIntValue()));
                        z3.e eVarC9 = z3.f.c(507960485, new h3(strQ3, 13), o0VarE);
                        boolean zB13 = o0VarE.B(cVarH2);
                        if ((i58 & 7168) == 2048) {
                            z39 = true;
                        } else {
                            z39 = false;
                        }
                        z44 = z39 | zB13;
                        objQ10 = o0VarE.q();
                        if (z44) {
                            objQ10 = new j0(cVarH2, lVar7, n1Var3);
                            o0VarE.K(objQ10);
                        } else {
                            objQ10 = new j0(cVarH2, lVar7, n1Var3);
                            o0VarE.K(objQ10);
                        }
                        arrayList.add(new p(cVarH2, iIndexOf13, null, null, eVarC9, 0.0f, false, false, null, null, (e23.l) objQ10, 1004, null));
                        o0VarE.g0(false);
                        d29 = d317;
                    } else {
                        double d318 = d28;
                        o0VarE.C(-1916240923);
                        o0VarE.g0(false);
                        dC = j23.t.c(d14, 0.0d, d318);
                        d29 = d318;
                        Unit unit5 = Unit.INSTANCE;
                    }
                    if (z28) {
                        dC = ((double) MathKt.b(dC * 2.0d)) / 2.0d;
                    }
                    objQ3 = o0VarE.q();
                    aVar.getClass();
                    c2565a = p3.m.a.f135155b;
                    if (objQ3 == c2565a) {
                        objQ3 = e5.o(new BigDecimal(String.valueOf(dC)).intValue(), o0VarE);
                    }
                    n1Var = (n1) objQ3;
                    objQ4 = o0VarE.q();
                    if (objQ4 == c2565a) {
                        BigDecimal bigDecimal5 = new BigDecimal(String.valueOf(dC));
                        BigDecimal bigDecimalValueOf5 = BigDecimal.valueOf(n1Var.getIntValue());
                        bigDecimalValueOf5.getClass();
                        BigDecimal bigDecimalSubtract5 = bigDecimal5.subtract(bigDecimalValueOf5);
                        bigDecimalSubtract5.getClass();
                        BigDecimal bigDecimalMultiply5 = bigDecimalSubtract5.multiply(new BigDecimal(10.0d));
                        bigDecimalMultiply5.getClass();
                        objQ4 = e5.o(bigDecimalMultiply5.intValue(), o0VarE);
                    }
                    n1Var2 = (n1) objQ4;
                    cVarE = i53.a.e(new j23.l(0, (int) d29));
                    if (z28) {
                        cVarH = i53.a.a(0, 5);
                    } else {
                        cVarH = e0.h(0, 9);
                    }
                    if (z27 != 0) {
                        str10 = strQ;
                    } else {
                        str10 = strQ;
                    }
                    cVarE2 = i53.a.e(p13.u.C(new String[]{str10, (z27 == 0 && z14) ? null : strQ2}));
                    int iIndexOf14 = cVarE.indexOf(Integer.valueOf(n1Var.getIntValue()));
                    c.f151221a.getClass();
                    z3.e eVar5 = c.f151222b;
                    boolean zB14 = o0VarE.B(cVarE);
                    i68 = i58 & 896;
                    if (i68 == 256) {
                        z29 = true;
                    } else {
                        z29 = false;
                    }
                    z34 = z29 | zB14;
                    objQ5 = o0VarE.q();
                    if (z34) {
                        objQ5 = new r21.p(cVarE, lVar, n1Var, n1Var2, 1);
                        cVar = cVarE;
                        o0VarE.K(objQ5);
                    } else {
                        objQ5 = new r21.p(cVarE, lVar, n1Var, n1Var2, 1);
                        cVar = cVarE;
                        o0VarE.K(objQ5);
                    }
                    arrayList.add(new p(cVar, iIndexOf14, null, null, eVar5, 0.0f, false, false, null, null, (e23.l) objQ5, 1004, null));
                    int iIndexOf15 = cVarH.indexOf(Integer.valueOf(n1Var2.getIntValue()));
                    if ((i66 & 3670016) == 1048576) {
                        z35 = true;
                    } else {
                        z35 = false;
                    }
                    objQ6 = o0VarE.q();
                    if (z35) {
                        objQ6 = new o60.b(str6, 20);
                        o0VarE.K(objQ6);
                    } else {
                        objQ6 = new o60.b(str6, 20);
                        o0VarE.K(objQ6);
                    }
                    e23.l lVar14 = (e23.l) objQ6;
                    z3.e eVarC10 = z3.f.c(-1020879543, new g0(z18, strQ2, 8, (byte) 0), o0VarE);
                    boolean zB15 = o0VarE.B(cVarH);
                    if (i68 == 256) {
                        z36 = true;
                    } else {
                        z36 = false;
                    }
                    z37 = zB15 | z36;
                    objQ7 = o0VarE.q();
                    if (z37) {
                        i53.c cVar10 = cVarH;
                        objQ7 = new r21.p(cVar10, lVar, n1Var2, n1Var, 2);
                        cVar2 = cVar10;
                        o0VarE.K(objQ7);
                    } else {
                        i53.c cVar11 = cVarH;
                        objQ7 = new r21.p(cVar11, lVar, n1Var2, n1Var, 2);
                        cVar2 = cVar11;
                        o0VarE.K(objQ7);
                    }
                    arrayList.add(new p(cVar2, iIndexOf15, lVar14, null, eVarC10, 0.0f, false, false, null, null, (e23.l) objQ7, 1000, null));
                    if (z18) {
                        o0VarE.C(-1913769882);
                        if ((57344 & i58) == 16384) {
                        }
                        objQ8 = o0VarE.q();
                        if (z38) {
                            lVar9 = lVar8;
                            objQ8 = new qe2.c(lVar9, 9);
                            o0VarE.K(objQ8);
                        } else {
                            lVar9 = lVar8;
                            objQ8 = new qe2.c(lVar9, 9);
                            o0VarE.K(objQ8);
                        }
                        arrayList.add(new p(cVarE2, 0, null, null, null, 0.0f, false, false, null, null, (e23.l) objQ8, 1022, null));
                        i69 = 0;
                        o0VarE.g0(false);
                    } else {
                        lVar9 = lVar8;
                        i69 = 0;
                        o0VarE.C(-1913581526);
                        o0VarE.g0(false);
                    }
                    h4.r rVar8 = rVar3;
                    k.c(rVar8, i53.a.e(arrayList), o0VarE, i66 & 14, i69);
                    d19 = d18;
                    rVar2 = rVar8;
                    lVar5 = lVar9;
                    z26 = z18;
                    str9 = strQ3;
                    d25 = d27;
                    d24 = d26;
                    z24 = z27;
                    str7 = strQ;
                    z25 = z28;
                    lVar6 = lVar7;
                    str8 = strQ2;
                    i59 = i67;
                } else {
                    o0VarE.e();
                    rVar2 = rVar;
                    lVar5 = lVar3;
                    z24 = z16;
                    z25 = z17;
                    lVar6 = lVar4;
                    d19 = d18;
                    z26 = z18;
                    str7 = str5;
                    str8 = str2;
                    str9 = str3;
                    d24 = d16;
                    i59 = i14;
                    d25 = d17;
                }
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new e23.p() { // from class: r82.t
                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iT = p0.t(i15 | 1);
                            int iT2 = p0.t(i16);
                            u.a(rVar2, z14, z26, str7, str8, str9, str6, d14, d19, d24, i59, d25, lVar, lVar6, lVar5, z24, z25, (p3.m) obj, iT, iT2, i17);
                            return Unit.INSTANCE;
                        }
                    };
                }
            }
            i45 |= 3072;
            lVar4 = lVar2;
            i48 = i17 & 16384;
            if (i48 != 0) {
                i54 = i45 | 24576;
            } else {
                i49 = i45;
                if ((i16 & 24576) == 0) {
                    i54 = i49 | (o0VarE.r(lVar3) ? 16384 : 8192);
                } else {
                    i54 = i49;
                }
            }
            i55 = i17 & 32768;
            if (i55 != 0) {
                i54 |= 196608;
            } else if ((i16 & 196608) == 0) {
                if (o0VarE.h(z16)) {
                    i56 = 131072;
                } else {
                    i56 = 65536;
                }
                i54 |= i56;
            }
            i57 = i17 & 65536;
            if (i57 != 0) {
                i54 |= 1572864;
            } else if ((i16 & 1572864) == 0) {
                i54 |= o0VarE.h(z17) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
            }
            i58 = i54;
            if ((i38 & 306783379) == 306783378) {
                z19 = true;
            } else {
                z19 = true;
            }
            if (o0VarE.n(i38 & 1, z19)) {
                o0VarE.G0();
                i64 = i15 & 1;
                aVar = p3.m.f135153a;
                if (i64 != 0) {
                    if (i75 != 0) {
                        rVar3 = h4.r.S;
                    } else {
                        rVar3 = rVar;
                    }
                    if (i76 != 0) {
                        z18 = false;
                    }
                    if ((i17 & 8) != 0) {
                        strQ = y.Q(o0VarE, R.string.gak_lbl_kg);
                        i38 &= -7169;
                    } else {
                        strQ = str5;
                    }
                    if ((i17 & 16) != 0) {
                        strQ2 = y.Q(o0VarE, R.string.gak_lbl_lbs);
                        i38 &= -57345;
                    } else {
                        strQ2 = str2;
                    }
                    strQ3 = y.Q(o0VarE, R.string.gak_lbl_st);
                    i65 = i38 & (-458753);
                    if (i26 != 0) {
                        str6 = ".";
                    }
                    if (i35 != 0) {
                        d18 = 453.5d;
                    }
                    if (i37 != 0) {
                        d26 = 999.9d;
                    } else {
                        d26 = d16;
                    }
                    if (i46 != 0) {
                        objQ2 = o0VarE.q();
                        aVar.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new e(7);
                            o0VarE.K(objQ2);
                        }
                        lVar7 = (e23.l) objQ2;
                    } else {
                        lVar7 = lVar4;
                    }
                    if (i48 != 0) {
                        objQ = o0VarE.q();
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new e(8);
                            o0VarE.K(objQ);
                        }
                        lVar8 = (e23.l) objQ;
                    } else {
                        lVar8 = lVar3;
                    }
                    if (i55 != 0) {
                        z27 = false;
                    } else {
                        z27 = z16;
                    }
                    d27 = 13.9d;
                    if (i57 != 0) {
                        i66 = i65;
                        i67 = 71;
                        z28 = false;
                    } else {
                        i66 = i65;
                        i67 = 71;
                        z28 = z17;
                    }
                } else {
                    if (i75 != 0) {
                        rVar3 = h4.r.S;
                    } else {
                        rVar3 = rVar;
                    }
                    if (i76 != 0) {
                        z18 = false;
                    }
                    if ((i17 & 8) != 0) {
                        strQ = y.Q(o0VarE, R.string.gak_lbl_kg);
                        i38 &= -7169;
                    } else {
                        strQ = str5;
                    }
                    if ((i17 & 16) != 0) {
                        strQ2 = y.Q(o0VarE, R.string.gak_lbl_lbs);
                        i38 &= -57345;
                    } else {
                        strQ2 = str2;
                    }
                    strQ3 = y.Q(o0VarE, R.string.gak_lbl_st);
                    i65 = i38 & (-458753);
                    if (i26 != 0) {
                        str6 = ".";
                    }
                    if (i35 != 0) {
                        d18 = 453.5d;
                    }
                    if (i37 != 0) {
                        d26 = 999.9d;
                    } else {
                        d26 = d16;
                    }
                    if (i46 != 0) {
                        objQ2 = o0VarE.q();
                        aVar.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new e(7);
                            o0VarE.K(objQ2);
                        }
                        lVar7 = (e23.l) objQ2;
                    } else {
                        lVar7 = lVar4;
                    }
                    if (i48 != 0) {
                        objQ = o0VarE.q();
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new e(8);
                            o0VarE.K(objQ);
                        }
                        lVar8 = (e23.l) objQ;
                    } else {
                        lVar8 = lVar3;
                    }
                    if (i55 != 0) {
                        z27 = false;
                    } else {
                        z27 = z16;
                    }
                    d27 = 13.9d;
                    if (i57 != 0) {
                        i66 = i65;
                        i67 = 71;
                        z28 = false;
                    } else {
                        i66 = i65;
                        i67 = 71;
                        z28 = z17;
                    }
                }
                o0VarE.h0();
                x1 x1Var6 = p3.n.f135158a;
                if (z14) {
                    d28 = d18;
                } else if (z18) {
                    d28 = d27;
                } else {
                    d28 = d26;
                }
                arrayList = new ArrayList();
                if (z18) {
                    o0VarE.C(-1917435849);
                    int i716 = (int) d14;
                    double d319 = 10;
                    o13.p pVar6 = new o13.p(Integer.valueOf(i716), Double.valueOf(Math.rint(((d14 - ((double) i716)) * 14.0d) * d319) / d319));
                    int iIntValue6 = ((Number) pVar6.f128594a).intValue();
                    double dDoubleValue6 = ((Number) pVar6.f128595b).doubleValue();
                    iE = j23.t.e(iIntValue6, 0, i67);
                    double d3110 = d28;
                    dC = j23.t.c(dDoubleValue6, 0.0d, d3110);
                    objQ9 = o0VarE.q();
                    aVar.getClass();
                    c2565a2 = p3.m.a.f135155b;
                    if (objQ9 == c2565a2) {
                        objQ9 = e5.o(iE, o0VarE);
                    }
                    n1Var3 = (n1) objQ9;
                    cVarH2 = e0.h(0, i67);
                    int iIndexOf16 = cVarH2.indexOf(Integer.valueOf(n1Var3.getIntValue()));
                    z3.e eVarC11 = z3.f.c(507960485, new h3(strQ3, 13), o0VarE);
                    boolean zB16 = o0VarE.B(cVarH2);
                    if ((i58 & 7168) == 2048) {
                        z39 = true;
                    } else {
                        z39 = false;
                    }
                    z44 = z39 | zB16;
                    objQ10 = o0VarE.q();
                    if (z44) {
                        objQ10 = new j0(cVarH2, lVar7, n1Var3);
                        o0VarE.K(objQ10);
                    } else {
                        objQ10 = new j0(cVarH2, lVar7, n1Var3);
                        o0VarE.K(objQ10);
                    }
                    arrayList.add(new p(cVarH2, iIndexOf16, null, null, eVarC11, 0.0f, false, false, null, null, (e23.l) objQ10, 1004, null));
                    o0VarE.g0(false);
                    d29 = d3110;
                } else {
                    double d3111 = d28;
                    o0VarE.C(-1916240923);
                    o0VarE.g0(false);
                    dC = j23.t.c(d14, 0.0d, d3111);
                    d29 = d3111;
                    Unit unit6 = Unit.INSTANCE;
                }
                if (z28) {
                    dC = ((double) MathKt.b(dC * 2.0d)) / 2.0d;
                }
                objQ3 = o0VarE.q();
                aVar.getClass();
                c2565a = p3.m.a.f135155b;
                if (objQ3 == c2565a) {
                    objQ3 = e5.o(new BigDecimal(String.valueOf(dC)).intValue(), o0VarE);
                }
                n1Var = (n1) objQ3;
                objQ4 = o0VarE.q();
                if (objQ4 == c2565a) {
                    BigDecimal bigDecimal6 = new BigDecimal(String.valueOf(dC));
                    BigDecimal bigDecimalValueOf6 = BigDecimal.valueOf(n1Var.getIntValue());
                    bigDecimalValueOf6.getClass();
                    BigDecimal bigDecimalSubtract6 = bigDecimal6.subtract(bigDecimalValueOf6);
                    bigDecimalSubtract6.getClass();
                    BigDecimal bigDecimalMultiply6 = bigDecimalSubtract6.multiply(new BigDecimal(10.0d));
                    bigDecimalMultiply6.getClass();
                    objQ4 = e5.o(bigDecimalMultiply6.intValue(), o0VarE);
                }
                n1Var2 = (n1) objQ4;
                cVarE = i53.a.e(new j23.l(0, (int) d29));
                if (z28) {
                    cVarH = i53.a.a(0, 5);
                } else {
                    cVarH = e0.h(0, 9);
                }
                if (z27 != 0) {
                    str10 = strQ;
                } else {
                    str10 = strQ;
                }
                cVarE2 = i53.a.e(p13.u.C(new String[]{str10, (z27 == 0 && z14) ? null : strQ2}));
                int iIndexOf17 = cVarE.indexOf(Integer.valueOf(n1Var.getIntValue()));
                c.f151221a.getClass();
                z3.e eVar6 = c.f151222b;
                boolean zB17 = o0VarE.B(cVarE);
                i68 = i58 & 896;
                if (i68 == 256) {
                    z29 = true;
                } else {
                    z29 = false;
                }
                z34 = z29 | zB17;
                objQ5 = o0VarE.q();
                if (z34) {
                    objQ5 = new r21.p(cVarE, lVar, n1Var, n1Var2, 1);
                    cVar = cVarE;
                    o0VarE.K(objQ5);
                } else {
                    objQ5 = new r21.p(cVarE, lVar, n1Var, n1Var2, 1);
                    cVar = cVarE;
                    o0VarE.K(objQ5);
                }
                arrayList.add(new p(cVar, iIndexOf17, null, null, eVar6, 0.0f, false, false, null, null, (e23.l) objQ5, 1004, null));
                int iIndexOf18 = cVarH.indexOf(Integer.valueOf(n1Var2.getIntValue()));
                if ((i66 & 3670016) == 1048576) {
                    z35 = true;
                } else {
                    z35 = false;
                }
                objQ6 = o0VarE.q();
                if (z35) {
                    objQ6 = new o60.b(str6, 20);
                    o0VarE.K(objQ6);
                } else {
                    objQ6 = new o60.b(str6, 20);
                    o0VarE.K(objQ6);
                }
                e23.l lVar15 = (e23.l) objQ6;
                z3.e eVarC12 = z3.f.c(-1020879543, new g0(z18, strQ2, 8, (byte) 0), o0VarE);
                boolean zB18 = o0VarE.B(cVarH);
                if (i68 == 256) {
                    z36 = true;
                } else {
                    z36 = false;
                }
                z37 = zB18 | z36;
                objQ7 = o0VarE.q();
                if (z37) {
                    i53.c cVar12 = cVarH;
                    objQ7 = new r21.p(cVar12, lVar, n1Var2, n1Var, 2);
                    cVar2 = cVar12;
                    o0VarE.K(objQ7);
                } else {
                    i53.c cVar13 = cVarH;
                    objQ7 = new r21.p(cVar13, lVar, n1Var2, n1Var, 2);
                    cVar2 = cVar13;
                    o0VarE.K(objQ7);
                }
                arrayList.add(new p(cVar2, iIndexOf18, lVar15, null, eVarC12, 0.0f, false, false, null, null, (e23.l) objQ7, 1000, null));
                if (z18) {
                    o0VarE.C(-1913769882);
                    if ((57344 & i58) == 16384) {
                    }
                    objQ8 = o0VarE.q();
                    if (z38) {
                        lVar9 = lVar8;
                        objQ8 = new qe2.c(lVar9, 9);
                        o0VarE.K(objQ8);
                    } else {
                        lVar9 = lVar8;
                        objQ8 = new qe2.c(lVar9, 9);
                        o0VarE.K(objQ8);
                    }
                    arrayList.add(new p(cVarE2, 0, null, null, null, 0.0f, false, false, null, null, (e23.l) objQ8, 1022, null));
                    i69 = 0;
                    o0VarE.g0(false);
                } else {
                    lVar9 = lVar8;
                    i69 = 0;
                    o0VarE.C(-1913581526);
                    o0VarE.g0(false);
                }
                h4.r rVar9 = rVar3;
                k.c(rVar9, i53.a.e(arrayList), o0VarE, i66 & 14, i69);
                d19 = d18;
                rVar2 = rVar9;
                lVar5 = lVar9;
                z26 = z18;
                str9 = strQ3;
                d25 = d27;
                d24 = d26;
                z24 = z27;
                str7 = strQ;
                z25 = z28;
                lVar6 = lVar7;
                str8 = strQ2;
                i59 = i67;
            } else {
                o0VarE.e();
                rVar2 = rVar;
                lVar5 = lVar3;
                z24 = z16;
                z25 = z17;
                lVar6 = lVar4;
                d19 = d18;
                z26 = z18;
                str7 = str5;
                str8 = str2;
                str9 = str3;
                d24 = d16;
                i59 = i14;
                d25 = d17;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new e23.p() { // from class: r82.t
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iT = p0.t(i15 | 1);
                        int iT2 = p0.t(i16);
                        u.a(rVar2, z14, z26, str7, str8, str9, str6, d14, d19, d24, i59, d25, lVar, lVar6, lVar5, z24, z25, (p3.m) obj, iT, iT2, i17);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        str5 = str;
        int i717 = i18 | i77;
        if ((i17 & 16) == 0) {
            i19 = 8192;
        } else {
            i19 = 8192;
        }
        i24 = i717 | i19;
        i25 = i24 | 65536;
        i26 = i17 & 64;
        if (i26 != 0) {
            i28 = i24 | 1638400;
            str6 = str4;
        } else {
            str6 = str4;
            if (o0VarE.B(str6)) {
                i27 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
            } else {
                i27 = 524288;
            }
            i28 = i25 | i27;
        }
        if (o0VarE.m(d14)) {
            i29 = 8388608;
        } else {
            i29 = 4194304;
        }
        i30 = i28 | i29;
        i34 = i17 & 256;
        if (i34 != 0) {
            i30 |= 100663296;
            i35 = i34;
            d18 = d15;
        } else {
            i35 = i34;
            d18 = d15;
            if ((i15 & 100663296) == 0) {
                if (o0VarE.m(d18)) {
                    i36 = 67108864;
                } else {
                    i36 = 33554432;
                }
                i30 |= i36;
            }
        }
        i37 = i17 & 512;
        if (i37 != 0) {
            i75 = i75;
            i38 = i30 | C.ENCODING_PCM_32BIT;
        } else {
            if ((i15 & C.ENCODING_PCM_32BIT) != 0) {
                if (o0VarE.m(d16)) {
                    i39 = 536870912;
                } else {
                    i39 = 268435456;
                }
                i30 |= i39;
            }
            i38 = i30;
        }
        i44 = i16 | 54;
        if ((i16 & 384) != 0) {
            if (o0VarE.r(lVar)) {
                i74 = 256;
            } else {
                i74 = 128;
            }
            i44 |= i74;
        }
        i45 = i44;
        i46 = i17 & 8192;
        if (i46 != 0) {
            if ((i16 & 3072) == 0) {
                lVar4 = lVar2;
                if (o0VarE.r(lVar4)) {
                    i47 = 2048;
                } else {
                    i47 = 1024;
                }
                i45 |= i47;
            }
            i48 = i17 & 16384;
            if (i48 != 0) {
                i54 = i45 | 24576;
            } else {
                i49 = i45;
                if ((i16 & 24576) == 0) {
                    i54 = i49 | (o0VarE.r(lVar3) ? 16384 : 8192);
                } else {
                    i54 = i49;
                }
            }
            i55 = i17 & 32768;
            if (i55 != 0) {
                i54 |= 196608;
            } else if ((i16 & 196608) == 0) {
                if (o0VarE.h(z16)) {
                    i56 = 131072;
                } else {
                    i56 = 65536;
                }
                i54 |= i56;
            }
            i57 = i17 & 65536;
            if (i57 != 0) {
                i54 |= 1572864;
            } else if ((i16 & 1572864) == 0) {
                i54 |= o0VarE.h(z17) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
            }
            i58 = i54;
            if ((i38 & 306783379) == 306783378) {
                z19 = true;
            } else {
                z19 = true;
            }
            if (o0VarE.n(i38 & 1, z19)) {
                o0VarE.G0();
                i64 = i15 & 1;
                aVar = p3.m.f135153a;
                if (i64 != 0) {
                    if (i75 != 0) {
                        rVar3 = h4.r.S;
                    } else {
                        rVar3 = rVar;
                    }
                    if (i76 != 0) {
                        z18 = false;
                    }
                    if ((i17 & 8) != 0) {
                        strQ = y.Q(o0VarE, R.string.gak_lbl_kg);
                        i38 &= -7169;
                    } else {
                        strQ = str5;
                    }
                    if ((i17 & 16) != 0) {
                        strQ2 = y.Q(o0VarE, R.string.gak_lbl_lbs);
                        i38 &= -57345;
                    } else {
                        strQ2 = str2;
                    }
                    strQ3 = y.Q(o0VarE, R.string.gak_lbl_st);
                    i65 = i38 & (-458753);
                    if (i26 != 0) {
                        str6 = ".";
                    }
                    if (i35 != 0) {
                        d18 = 453.5d;
                    }
                    if (i37 != 0) {
                        d26 = 999.9d;
                    } else {
                        d26 = d16;
                    }
                    if (i46 != 0) {
                        objQ2 = o0VarE.q();
                        aVar.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new e(7);
                            o0VarE.K(objQ2);
                        }
                        lVar7 = (e23.l) objQ2;
                    } else {
                        lVar7 = lVar4;
                    }
                    if (i48 != 0) {
                        objQ = o0VarE.q();
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new e(8);
                            o0VarE.K(objQ);
                        }
                        lVar8 = (e23.l) objQ;
                    } else {
                        lVar8 = lVar3;
                    }
                    if (i55 != 0) {
                        z27 = false;
                    } else {
                        z27 = z16;
                    }
                    d27 = 13.9d;
                    if (i57 != 0) {
                        i66 = i65;
                        i67 = 71;
                        z28 = false;
                    } else {
                        i66 = i65;
                        i67 = 71;
                        z28 = z17;
                    }
                } else {
                    if (i75 != 0) {
                        rVar3 = h4.r.S;
                    } else {
                        rVar3 = rVar;
                    }
                    if (i76 != 0) {
                        z18 = false;
                    }
                    if ((i17 & 8) != 0) {
                        strQ = y.Q(o0VarE, R.string.gak_lbl_kg);
                        i38 &= -7169;
                    } else {
                        strQ = str5;
                    }
                    if ((i17 & 16) != 0) {
                        strQ2 = y.Q(o0VarE, R.string.gak_lbl_lbs);
                        i38 &= -57345;
                    } else {
                        strQ2 = str2;
                    }
                    strQ3 = y.Q(o0VarE, R.string.gak_lbl_st);
                    i65 = i38 & (-458753);
                    if (i26 != 0) {
                        str6 = ".";
                    }
                    if (i35 != 0) {
                        d18 = 453.5d;
                    }
                    if (i37 != 0) {
                        d26 = 999.9d;
                    } else {
                        d26 = d16;
                    }
                    if (i46 != 0) {
                        objQ2 = o0VarE.q();
                        aVar.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new e(7);
                            o0VarE.K(objQ2);
                        }
                        lVar7 = (e23.l) objQ2;
                    } else {
                        lVar7 = lVar4;
                    }
                    if (i48 != 0) {
                        objQ = o0VarE.q();
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new e(8);
                            o0VarE.K(objQ);
                        }
                        lVar8 = (e23.l) objQ;
                    } else {
                        lVar8 = lVar3;
                    }
                    if (i55 != 0) {
                        z27 = false;
                    } else {
                        z27 = z16;
                    }
                    d27 = 13.9d;
                    if (i57 != 0) {
                        i66 = i65;
                        i67 = 71;
                        z28 = false;
                    } else {
                        i66 = i65;
                        i67 = 71;
                        z28 = z17;
                    }
                }
                o0VarE.h0();
                x1 x1Var7 = p3.n.f135158a;
                if (z14) {
                    d28 = d18;
                } else if (z18) {
                    d28 = d27;
                } else {
                    d28 = d26;
                }
                arrayList = new ArrayList();
                if (z18) {
                    o0VarE.C(-1917435849);
                    int i718 = (int) d14;
                    double d3112 = 10;
                    o13.p pVar7 = new o13.p(Integer.valueOf(i718), Double.valueOf(Math.rint(((d14 - ((double) i718)) * 14.0d) * d3112) / d3112));
                    int iIntValue7 = ((Number) pVar7.f128594a).intValue();
                    double dDoubleValue7 = ((Number) pVar7.f128595b).doubleValue();
                    iE = j23.t.e(iIntValue7, 0, i67);
                    double d3113 = d28;
                    dC = j23.t.c(dDoubleValue7, 0.0d, d3113);
                    objQ9 = o0VarE.q();
                    aVar.getClass();
                    c2565a2 = p3.m.a.f135155b;
                    if (objQ9 == c2565a2) {
                        objQ9 = e5.o(iE, o0VarE);
                    }
                    n1Var3 = (n1) objQ9;
                    cVarH2 = e0.h(0, i67);
                    int iIndexOf19 = cVarH2.indexOf(Integer.valueOf(n1Var3.getIntValue()));
                    z3.e eVarC13 = z3.f.c(507960485, new h3(strQ3, 13), o0VarE);
                    boolean zB19 = o0VarE.B(cVarH2);
                    if ((i58 & 7168) == 2048) {
                        z39 = true;
                    } else {
                        z39 = false;
                    }
                    z44 = z39 | zB19;
                    objQ10 = o0VarE.q();
                    if (z44) {
                        objQ10 = new j0(cVarH2, lVar7, n1Var3);
                        o0VarE.K(objQ10);
                    } else {
                        objQ10 = new j0(cVarH2, lVar7, n1Var3);
                        o0VarE.K(objQ10);
                    }
                    arrayList.add(new p(cVarH2, iIndexOf19, null, null, eVarC13, 0.0f, false, false, null, null, (e23.l) objQ10, 1004, null));
                    o0VarE.g0(false);
                    d29 = d3113;
                } else {
                    double d3114 = d28;
                    o0VarE.C(-1916240923);
                    o0VarE.g0(false);
                    dC = j23.t.c(d14, 0.0d, d3114);
                    d29 = d3114;
                    Unit unit7 = Unit.INSTANCE;
                }
                if (z28) {
                    dC = ((double) MathKt.b(dC * 2.0d)) / 2.0d;
                }
                objQ3 = o0VarE.q();
                aVar.getClass();
                c2565a = p3.m.a.f135155b;
                if (objQ3 == c2565a) {
                    objQ3 = e5.o(new BigDecimal(String.valueOf(dC)).intValue(), o0VarE);
                }
                n1Var = (n1) objQ3;
                objQ4 = o0VarE.q();
                if (objQ4 == c2565a) {
                    BigDecimal bigDecimal7 = new BigDecimal(String.valueOf(dC));
                    BigDecimal bigDecimalValueOf7 = BigDecimal.valueOf(n1Var.getIntValue());
                    bigDecimalValueOf7.getClass();
                    BigDecimal bigDecimalSubtract7 = bigDecimal7.subtract(bigDecimalValueOf7);
                    bigDecimalSubtract7.getClass();
                    BigDecimal bigDecimalMultiply7 = bigDecimalSubtract7.multiply(new BigDecimal(10.0d));
                    bigDecimalMultiply7.getClass();
                    objQ4 = e5.o(bigDecimalMultiply7.intValue(), o0VarE);
                }
                n1Var2 = (n1) objQ4;
                cVarE = i53.a.e(new j23.l(0, (int) d29));
                if (z28) {
                    cVarH = i53.a.a(0, 5);
                } else {
                    cVarH = e0.h(0, 9);
                }
                if (z27 != 0) {
                    str10 = strQ;
                } else {
                    str10 = strQ;
                }
                cVarE2 = i53.a.e(p13.u.C(new String[]{str10, (z27 == 0 && z14) ? null : strQ2}));
                int iIndexOf110 = cVarE.indexOf(Integer.valueOf(n1Var.getIntValue()));
                c.f151221a.getClass();
                z3.e eVar7 = c.f151222b;
                boolean zB110 = o0VarE.B(cVarE);
                i68 = i58 & 896;
                if (i68 == 256) {
                    z29 = true;
                } else {
                    z29 = false;
                }
                z34 = z29 | zB110;
                objQ5 = o0VarE.q();
                if (z34) {
                    objQ5 = new r21.p(cVarE, lVar, n1Var, n1Var2, 1);
                    cVar = cVarE;
                    o0VarE.K(objQ5);
                } else {
                    objQ5 = new r21.p(cVarE, lVar, n1Var, n1Var2, 1);
                    cVar = cVarE;
                    o0VarE.K(objQ5);
                }
                arrayList.add(new p(cVar, iIndexOf110, null, null, eVar7, 0.0f, false, false, null, null, (e23.l) objQ5, 1004, null));
                int iIndexOf111 = cVarH.indexOf(Integer.valueOf(n1Var2.getIntValue()));
                if ((i66 & 3670016) == 1048576) {
                    z35 = true;
                } else {
                    z35 = false;
                }
                objQ6 = o0VarE.q();
                if (z35) {
                    objQ6 = new o60.b(str6, 20);
                    o0VarE.K(objQ6);
                } else {
                    objQ6 = new o60.b(str6, 20);
                    o0VarE.K(objQ6);
                }
                e23.l lVar16 = (e23.l) objQ6;
                z3.e eVarC14 = z3.f.c(-1020879543, new g0(z18, strQ2, 8, (byte) 0), o0VarE);
                boolean zB111 = o0VarE.B(cVarH);
                if (i68 == 256) {
                    z36 = true;
                } else {
                    z36 = false;
                }
                z37 = zB111 | z36;
                objQ7 = o0VarE.q();
                if (z37) {
                    i53.c cVar14 = cVarH;
                    objQ7 = new r21.p(cVar14, lVar, n1Var2, n1Var, 2);
                    cVar2 = cVar14;
                    o0VarE.K(objQ7);
                } else {
                    i53.c cVar15 = cVarH;
                    objQ7 = new r21.p(cVar15, lVar, n1Var2, n1Var, 2);
                    cVar2 = cVar15;
                    o0VarE.K(objQ7);
                }
                arrayList.add(new p(cVar2, iIndexOf111, lVar16, null, eVarC14, 0.0f, false, false, null, null, (e23.l) objQ7, 1000, null));
                if (z18) {
                    o0VarE.C(-1913769882);
                    if ((57344 & i58) == 16384) {
                    }
                    objQ8 = o0VarE.q();
                    if (z38) {
                        lVar9 = lVar8;
                        objQ8 = new qe2.c(lVar9, 9);
                        o0VarE.K(objQ8);
                    } else {
                        lVar9 = lVar8;
                        objQ8 = new qe2.c(lVar9, 9);
                        o0VarE.K(objQ8);
                    }
                    arrayList.add(new p(cVarE2, 0, null, null, null, 0.0f, false, false, null, null, (e23.l) objQ8, 1022, null));
                    i69 = 0;
                    o0VarE.g0(false);
                } else {
                    lVar9 = lVar8;
                    i69 = 0;
                    o0VarE.C(-1913581526);
                    o0VarE.g0(false);
                }
                h4.r rVar10 = rVar3;
                k.c(rVar10, i53.a.e(arrayList), o0VarE, i66 & 14, i69);
                d19 = d18;
                rVar2 = rVar10;
                lVar5 = lVar9;
                z26 = z18;
                str9 = strQ3;
                d25 = d27;
                d24 = d26;
                z24 = z27;
                str7 = strQ;
                z25 = z28;
                lVar6 = lVar7;
                str8 = strQ2;
                i59 = i67;
            } else {
                o0VarE.e();
                rVar2 = rVar;
                lVar5 = lVar3;
                z24 = z16;
                z25 = z17;
                lVar6 = lVar4;
                d19 = d18;
                z26 = z18;
                str7 = str5;
                str8 = str2;
                str9 = str3;
                d24 = d16;
                i59 = i14;
                d25 = d17;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new e23.p() { // from class: r82.t
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iT = p0.t(i15 | 1);
                        int iT2 = p0.t(i16);
                        u.a(rVar2, z14, z26, str7, str8, str9, str6, d14, d19, d24, i59, d25, lVar, lVar6, lVar5, z24, z25, (p3.m) obj, iT, iT2, i17);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        i45 |= 3072;
        lVar4 = lVar2;
        i48 = i17 & 16384;
        if (i48 != 0) {
            i54 = i45 | 24576;
        } else {
            i49 = i45;
            if ((i16 & 24576) == 0) {
                i54 = i49 | (o0VarE.r(lVar3) ? 16384 : 8192);
            } else {
                i54 = i49;
            }
        }
        i55 = i17 & 32768;
        if (i55 != 0) {
            i54 |= 196608;
        } else if ((i16 & 196608) == 0) {
            if (o0VarE.h(z16)) {
                i56 = 131072;
            } else {
                i56 = 65536;
            }
            i54 |= i56;
        }
        i57 = i17 & 65536;
        if (i57 != 0) {
            i54 |= 1572864;
        } else if ((i16 & 1572864) == 0) {
            i54 |= o0VarE.h(z17) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        i58 = i54;
        if ((i38 & 306783379) == 306783378) {
            z19 = true;
        } else {
            z19 = true;
        }
        if (o0VarE.n(i38 & 1, z19)) {
            o0VarE.G0();
            i64 = i15 & 1;
            aVar = p3.m.f135153a;
            if (i64 != 0) {
                if (i75 != 0) {
                    rVar3 = h4.r.S;
                } else {
                    rVar3 = rVar;
                }
                if (i76 != 0) {
                    z18 = false;
                }
                if ((i17 & 8) != 0) {
                    strQ = y.Q(o0VarE, R.string.gak_lbl_kg);
                    i38 &= -7169;
                } else {
                    strQ = str5;
                }
                if ((i17 & 16) != 0) {
                    strQ2 = y.Q(o0VarE, R.string.gak_lbl_lbs);
                    i38 &= -57345;
                } else {
                    strQ2 = str2;
                }
                strQ3 = y.Q(o0VarE, R.string.gak_lbl_st);
                i65 = i38 & (-458753);
                if (i26 != 0) {
                    str6 = ".";
                }
                if (i35 != 0) {
                    d18 = 453.5d;
                }
                if (i37 != 0) {
                    d26 = 999.9d;
                } else {
                    d26 = d16;
                }
                if (i46 != 0) {
                    objQ2 = o0VarE.q();
                    aVar.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new e(7);
                        o0VarE.K(objQ2);
                    }
                    lVar7 = (e23.l) objQ2;
                } else {
                    lVar7 = lVar4;
                }
                if (i48 != 0) {
                    objQ = o0VarE.q();
                    aVar.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new e(8);
                        o0VarE.K(objQ);
                    }
                    lVar8 = (e23.l) objQ;
                } else {
                    lVar8 = lVar3;
                }
                if (i55 != 0) {
                    z27 = false;
                } else {
                    z27 = z16;
                }
                d27 = 13.9d;
                if (i57 != 0) {
                    i66 = i65;
                    i67 = 71;
                    z28 = false;
                } else {
                    i66 = i65;
                    i67 = 71;
                    z28 = z17;
                }
            } else {
                if (i75 != 0) {
                    rVar3 = h4.r.S;
                } else {
                    rVar3 = rVar;
                }
                if (i76 != 0) {
                    z18 = false;
                }
                if ((i17 & 8) != 0) {
                    strQ = y.Q(o0VarE, R.string.gak_lbl_kg);
                    i38 &= -7169;
                } else {
                    strQ = str5;
                }
                if ((i17 & 16) != 0) {
                    strQ2 = y.Q(o0VarE, R.string.gak_lbl_lbs);
                    i38 &= -57345;
                } else {
                    strQ2 = str2;
                }
                strQ3 = y.Q(o0VarE, R.string.gak_lbl_st);
                i65 = i38 & (-458753);
                if (i26 != 0) {
                    str6 = ".";
                }
                if (i35 != 0) {
                    d18 = 453.5d;
                }
                if (i37 != 0) {
                    d26 = 999.9d;
                } else {
                    d26 = d16;
                }
                if (i46 != 0) {
                    objQ2 = o0VarE.q();
                    aVar.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new e(7);
                        o0VarE.K(objQ2);
                    }
                    lVar7 = (e23.l) objQ2;
                } else {
                    lVar7 = lVar4;
                }
                if (i48 != 0) {
                    objQ = o0VarE.q();
                    aVar.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new e(8);
                        o0VarE.K(objQ);
                    }
                    lVar8 = (e23.l) objQ;
                } else {
                    lVar8 = lVar3;
                }
                if (i55 != 0) {
                    z27 = false;
                } else {
                    z27 = z16;
                }
                d27 = 13.9d;
                if (i57 != 0) {
                    i66 = i65;
                    i67 = 71;
                    z28 = false;
                } else {
                    i66 = i65;
                    i67 = 71;
                    z28 = z17;
                }
            }
            o0VarE.h0();
            x1 x1Var8 = p3.n.f135158a;
            if (z14) {
                d28 = d18;
            } else if (z18) {
                d28 = d27;
            } else {
                d28 = d26;
            }
            arrayList = new ArrayList();
            if (z18) {
                o0VarE.C(-1917435849);
                int i719 = (int) d14;
                double d3115 = 10;
                o13.p pVar8 = new o13.p(Integer.valueOf(i719), Double.valueOf(Math.rint(((d14 - ((double) i719)) * 14.0d) * d3115) / d3115));
                int iIntValue8 = ((Number) pVar8.f128594a).intValue();
                double dDoubleValue8 = ((Number) pVar8.f128595b).doubleValue();
                iE = j23.t.e(iIntValue8, 0, i67);
                double d3116 = d28;
                dC = j23.t.c(dDoubleValue8, 0.0d, d3116);
                objQ9 = o0VarE.q();
                aVar.getClass();
                c2565a2 = p3.m.a.f135155b;
                if (objQ9 == c2565a2) {
                    objQ9 = e5.o(iE, o0VarE);
                }
                n1Var3 = (n1) objQ9;
                cVarH2 = e0.h(0, i67);
                int iIndexOf112 = cVarH2.indexOf(Integer.valueOf(n1Var3.getIntValue()));
                z3.e eVarC15 = z3.f.c(507960485, new h3(strQ3, 13), o0VarE);
                boolean zB112 = o0VarE.B(cVarH2);
                if ((i58 & 7168) == 2048) {
                    z39 = true;
                } else {
                    z39 = false;
                }
                z44 = z39 | zB112;
                objQ10 = o0VarE.q();
                if (z44) {
                    objQ10 = new j0(cVarH2, lVar7, n1Var3);
                    o0VarE.K(objQ10);
                } else {
                    objQ10 = new j0(cVarH2, lVar7, n1Var3);
                    o0VarE.K(objQ10);
                }
                arrayList.add(new p(cVarH2, iIndexOf112, null, null, eVarC15, 0.0f, false, false, null, null, (e23.l) objQ10, 1004, null));
                o0VarE.g0(false);
                d29 = d3116;
            } else {
                double d3117 = d28;
                o0VarE.C(-1916240923);
                o0VarE.g0(false);
                dC = j23.t.c(d14, 0.0d, d3117);
                d29 = d3117;
                Unit unit8 = Unit.INSTANCE;
            }
            if (z28) {
                dC = ((double) MathKt.b(dC * 2.0d)) / 2.0d;
            }
            objQ3 = o0VarE.q();
            aVar.getClass();
            c2565a = p3.m.a.f135155b;
            if (objQ3 == c2565a) {
                objQ3 = e5.o(new BigDecimal(String.valueOf(dC)).intValue(), o0VarE);
            }
            n1Var = (n1) objQ3;
            objQ4 = o0VarE.q();
            if (objQ4 == c2565a) {
                BigDecimal bigDecimal8 = new BigDecimal(String.valueOf(dC));
                BigDecimal bigDecimalValueOf8 = BigDecimal.valueOf(n1Var.getIntValue());
                bigDecimalValueOf8.getClass();
                BigDecimal bigDecimalSubtract8 = bigDecimal8.subtract(bigDecimalValueOf8);
                bigDecimalSubtract8.getClass();
                BigDecimal bigDecimalMultiply8 = bigDecimalSubtract8.multiply(new BigDecimal(10.0d));
                bigDecimalMultiply8.getClass();
                objQ4 = e5.o(bigDecimalMultiply8.intValue(), o0VarE);
            }
            n1Var2 = (n1) objQ4;
            cVarE = i53.a.e(new j23.l(0, (int) d29));
            if (z28) {
                cVarH = i53.a.a(0, 5);
            } else {
                cVarH = e0.h(0, 9);
            }
            if (z27 != 0) {
                str10 = strQ;
            } else {
                str10 = strQ;
            }
            cVarE2 = i53.a.e(p13.u.C(new String[]{str10, (z27 == 0 && z14) ? null : strQ2}));
            int iIndexOf113 = cVarE.indexOf(Integer.valueOf(n1Var.getIntValue()));
            c.f151221a.getClass();
            z3.e eVar8 = c.f151222b;
            boolean zB113 = o0VarE.B(cVarE);
            i68 = i58 & 896;
            if (i68 == 256) {
                z29 = true;
            } else {
                z29 = false;
            }
            z34 = z29 | zB113;
            objQ5 = o0VarE.q();
            if (z34) {
                objQ5 = new r21.p(cVarE, lVar, n1Var, n1Var2, 1);
                cVar = cVarE;
                o0VarE.K(objQ5);
            } else {
                objQ5 = new r21.p(cVarE, lVar, n1Var, n1Var2, 1);
                cVar = cVarE;
                o0VarE.K(objQ5);
            }
            arrayList.add(new p(cVar, iIndexOf113, null, null, eVar8, 0.0f, false, false, null, null, (e23.l) objQ5, 1004, null));
            int iIndexOf114 = cVarH.indexOf(Integer.valueOf(n1Var2.getIntValue()));
            if ((i66 & 3670016) == 1048576) {
                z35 = true;
            } else {
                z35 = false;
            }
            objQ6 = o0VarE.q();
            if (z35) {
                objQ6 = new o60.b(str6, 20);
                o0VarE.K(objQ6);
            } else {
                objQ6 = new o60.b(str6, 20);
                o0VarE.K(objQ6);
            }
            e23.l lVar17 = (e23.l) objQ6;
            z3.e eVarC16 = z3.f.c(-1020879543, new g0(z18, strQ2, 8, (byte) 0), o0VarE);
            boolean zB114 = o0VarE.B(cVarH);
            if (i68 == 256) {
                z36 = true;
            } else {
                z36 = false;
            }
            z37 = zB114 | z36;
            objQ7 = o0VarE.q();
            if (z37) {
                i53.c cVar16 = cVarH;
                objQ7 = new r21.p(cVar16, lVar, n1Var2, n1Var, 2);
                cVar2 = cVar16;
                o0VarE.K(objQ7);
            } else {
                i53.c cVar17 = cVarH;
                objQ7 = new r21.p(cVar17, lVar, n1Var2, n1Var, 2);
                cVar2 = cVar17;
                o0VarE.K(objQ7);
            }
            arrayList.add(new p(cVar2, iIndexOf114, lVar17, null, eVarC16, 0.0f, false, false, null, null, (e23.l) objQ7, 1000, null));
            if (z18) {
                o0VarE.C(-1913769882);
                if ((57344 & i58) == 16384) {
                }
                objQ8 = o0VarE.q();
                if (z38) {
                    lVar9 = lVar8;
                    objQ8 = new qe2.c(lVar9, 9);
                    o0VarE.K(objQ8);
                } else {
                    lVar9 = lVar8;
                    objQ8 = new qe2.c(lVar9, 9);
                    o0VarE.K(objQ8);
                }
                arrayList.add(new p(cVarE2, 0, null, null, null, 0.0f, false, false, null, null, (e23.l) objQ8, 1022, null));
                i69 = 0;
                o0VarE.g0(false);
            } else {
                lVar9 = lVar8;
                i69 = 0;
                o0VarE.C(-1913581526);
                o0VarE.g0(false);
            }
            h4.r rVar11 = rVar3;
            k.c(rVar11, i53.a.e(arrayList), o0VarE, i66 & 14, i69);
            d19 = d18;
            rVar2 = rVar11;
            lVar5 = lVar9;
            z26 = z18;
            str9 = strQ3;
            d25 = d27;
            d24 = d26;
            z24 = z27;
            str7 = strQ;
            z25 = z28;
            lVar6 = lVar7;
            str8 = strQ2;
            i59 = i67;
        } else {
            o0VarE.e();
            rVar2 = rVar;
            lVar5 = lVar3;
            z24 = z16;
            z25 = z17;
            lVar6 = lVar4;
            d19 = d18;
            z26 = z18;
            str7 = str5;
            str8 = str2;
            str9 = str3;
            d24 = d16;
            i59 = i14;
            d25 = d17;
        }
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p() { // from class: r82.t
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iT = p0.t(i15 | 1);
                    int iT2 = p0.t(i16);
                    u.a(rVar2, z14, z26, str7, str8, str9, str6, d14, d19, d24, i59, d25, lVar, lVar6, lVar5, z24, z25, (p3.m) obj, iT, iT2, i17);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
