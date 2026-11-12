package m92;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import lc.u0;
import o4.f1;
import o4.g1;
import o4.j1;
import o4.z0;
import p005kotlin.Unit;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final class c0 {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f117278a;

        static {
            int[] iArr = new int[e0.values().length];
            try {
                iArr[e0.LINEAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[e0.STEP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[e0.STEP_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[e0.CUBIC_BEZIER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[e0.SINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f117278a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x013a  */
    /* JADX WARN: Code duplicated, block: B:103:0x0141  */
    /* JADX WARN: Code duplicated, block: B:105:0x0145  */
    /* JADX WARN: Code duplicated, block: B:107:0x014f  */
    /* JADX WARN: Code duplicated, block: B:108:0x0152  */
    /* JADX WARN: Code duplicated, block: B:110:0x0157  */
    /* JADX WARN: Code duplicated, block: B:113:0x0164  */
    /* JADX WARN: Code duplicated, block: B:114:0x0167  */
    /* JADX WARN: Code duplicated, block: B:116:0x016b  */
    /* JADX WARN: Code duplicated, block: B:118:0x0171  */
    /* JADX WARN: Code duplicated, block: B:119:0x0174  */
    /* JADX WARN: Code duplicated, block: B:123:0x017c  */
    /* JADX WARN: Code duplicated, block: B:125:0x0184  */
    /* JADX WARN: Code duplicated, block: B:126:0x0187  */
    /* JADX WARN: Code duplicated, block: B:129:0x018e  */
    /* JADX WARN: Code duplicated, block: B:132:0x0195  */
    /* JADX WARN: Code duplicated, block: B:134:0x0199  */
    /* JADX WARN: Code duplicated, block: B:136:0x019d  */
    /* JADX WARN: Code duplicated, block: B:138:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:142:0x01af  */
    /* JADX WARN: Code duplicated, block: B:143:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:145:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:147:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:148:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:150:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:152:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:155:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:156:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:158:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:161:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:165:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:166:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:168:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:170:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:174:0x020e  */
    /* JADX WARN: Code duplicated, block: B:178:0x021b  */
    /* JADX WARN: Code duplicated, block: B:181:0x0224 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:182:0x0226  */
    /* JADX WARN: Code duplicated, block: B:183:0x0228  */
    /* JADX WARN: Code duplicated, block: B:185:0x022b  */
    /* JADX WARN: Code duplicated, block: B:186:0x022e  */
    /* JADX WARN: Code duplicated, block: B:188:0x0232  */
    /* JADX WARN: Code duplicated, block: B:189:0x0238  */
    /* JADX WARN: Code duplicated, block: B:191:0x023c  */
    /* JADX WARN: Code duplicated, block: B:192:0x023f  */
    /* JADX WARN: Code duplicated, block: B:194:0x0243  */
    /* JADX WARN: Code duplicated, block: B:195:0x0245  */
    /* JADX WARN: Code duplicated, block: B:197:0x0249  */
    /* JADX WARN: Code duplicated, block: B:198:0x024e  */
    /* JADX WARN: Code duplicated, block: B:200:0x0252  */
    /* JADX WARN: Code duplicated, block: B:201:0x0255  */
    /* JADX WARN: Code duplicated, block: B:203:0x0259  */
    /* JADX WARN: Code duplicated, block: B:204:0x025b  */
    /* JADX WARN: Code duplicated, block: B:206:0x025f  */
    /* JADX WARN: Code duplicated, block: B:207:0x0261  */
    /* JADX WARN: Code duplicated, block: B:209:0x0265  */
    /* JADX WARN: Code duplicated, block: B:210:0x0267  */
    /* JADX WARN: Code duplicated, block: B:212:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:215:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:217:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x004a  */
    /* JADX WARN: Code duplicated, block: B:25:0x0052  */
    /* JADX WARN: Code duplicated, block: B:26:0x0055  */
    /* JADX WARN: Code duplicated, block: B:28:0x005a  */
    /* JADX WARN: Code duplicated, block: B:31:0x0064  */
    /* JADX WARN: Code duplicated, block: B:33:0x006c  */
    /* JADX WARN: Code duplicated, block: B:34:0x006f  */
    /* JADX WARN: Code duplicated, block: B:36:0x0074  */
    /* JADX WARN: Code duplicated, block: B:39:0x007e  */
    /* JADX WARN: Code duplicated, block: B:41:0x0083  */
    /* JADX WARN: Code duplicated, block: B:43:0x0087  */
    /* JADX WARN: Code duplicated, block: B:45:0x008f  */
    /* JADX WARN: Code duplicated, block: B:46:0x0092  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:53:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:55:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:56:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:60:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:61:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:63:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:65:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:66:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:70:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:72:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:73:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:77:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:78:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:80:0x0100  */
    /* JADX WARN: Code duplicated, block: B:82:0x0106  */
    /* JADX WARN: Code duplicated, block: B:83:0x0109  */
    /* JADX WARN: Code duplicated, block: B:87:0x0113  */
    /* JADX WARN: Code duplicated, block: B:89:0x0118  */
    /* JADX WARN: Code duplicated, block: B:91:0x011c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:92:0x011e  */
    /* JADX WARN: Code duplicated, block: B:94:0x0125  */
    /* JADX WARN: Code duplicated, block: B:97:0x0130  */
    /* JADX WARN: Code duplicated, block: B:98:0x0133  */
    public static final void a(final h4.r rVar, String str, final float f14, final m.d dVar, boolean z14, float f15, o4.d0 d0Var, final i53.c cVar, Float f16, e0 e0Var, boolean z15, final String str2, n92.a aVar, e23.p pVar, e23.q qVar, p3.m mVar, final int i14, final int i15, final int i16) {
        int i17;
        String str3;
        m.d dVar2;
        int i18;
        int i19;
        int i24;
        float f17;
        int i25;
        int i26;
        o4.d0 d0Var2;
        int i27;
        int i28;
        int i29;
        int i30;
        int iOrdinal;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38;
        int i39;
        int i44;
        int i45;
        int i46;
        boolean zR;
        int i47;
        int i48;
        int i49;
        boolean z16;
        final boolean z17;
        final n92.a aVar2;
        final e23.q qVar2;
        final float f18;
        final o4.d0 d0Var3;
        final String str4;
        final Float f19;
        final e0 e0Var2;
        final boolean z18;
        final e23.p pVar2;
        p2 p2VarI0;
        String str5;
        boolean z19;
        float f22;
        o4.d0 d0Var4;
        Float f24;
        e0 e0Var3;
        boolean z24;
        n92.a aVar3;
        e23.p pVar3;
        e23.q qVar3;
        int i54;
        int i55;
        int i56;
        int i57;
        cVar.getClass();
        str2.getClass();
        p3.o0 o0VarE = mVar.E(765986742);
        if ((i14 & 6) == 0) {
            i17 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i17 = i14;
        }
        int i58 = i16 & 2;
        if (i58 == 0) {
            if ((i14 & 48) == 0) {
                str3 = str;
                i17 |= o0VarE.B(str3) ? 32 : 16;
            }
            if ((i14 & 384) != 0) {
                if (o0VarE.i(f14)) {
                    i57 = 256;
                } else {
                    i57 = 128;
                }
                i17 |= i57;
            }
            if ((i14 & 3072) == 0) {
                dVar2 = dVar;
                if (o0VarE.B(dVar2)) {
                    i56 = 2048;
                } else {
                    i56 = 1024;
                }
                i17 |= i56;
            } else {
                dVar2 = dVar;
            }
            i18 = i16 & 16;
            if (i18 != 0) {
                if ((i14 & 24576) == 0) {
                    if (o0VarE.h(z14)) {
                        i19 = 16384;
                    } else {
                        i19 = 8192;
                    }
                    i17 |= i19;
                }
                i24 = i16 & 32;
                if (i24 != 0) {
                    i17 |= 196608;
                    f17 = f15;
                } else {
                    f17 = f15;
                    if ((i14 & 196608) == 0) {
                        if (o0VarE.i(f17)) {
                            i25 = 131072;
                        } else {
                            i25 = 65536;
                        }
                        i17 |= i25;
                    }
                }
                i26 = i16 & 64;
                if (i26 != 0) {
                    i17 |= 1572864;
                    d0Var2 = d0Var;
                } else {
                    d0Var2 = d0Var;
                    if ((i14 & 1572864) == 0) {
                        if (o0VarE.B(d0Var2)) {
                            i27 = 1048576;
                        } else {
                            i27 = 524288;
                        }
                        i17 |= i27;
                    }
                }
                if ((i14 & 12582912) == 0) {
                    if (o0VarE.B(cVar)) {
                        i55 = 8388608;
                    } else {
                        i55 = 4194304;
                    }
                    i17 |= i55;
                }
                i28 = i16 & 256;
                if (i28 != 0) {
                    i17 |= 100663296;
                } else if ((i14 & 100663296) == 0) {
                    if (o0VarE.B(f16)) {
                        i29 = 67108864;
                    } else {
                        i29 = 33554432;
                    }
                    i17 |= i29;
                }
                i30 = i16 & 512;
                if (i30 != 0) {
                    if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                        if (e0Var == null) {
                            iOrdinal = -1;
                        } else {
                            iOrdinal = e0Var.ordinal();
                        }
                        if (o0VarE.k(iOrdinal)) {
                            i34 = 536870912;
                        } else {
                            i34 = 268435456;
                        }
                        i17 |= i34;
                    }
                    i35 = i16 & 1024;
                    if (i35 != 0) {
                        i36 = i15 | 6;
                    } else if ((i15 & 6) == 0) {
                        if (o0VarE.h(z15)) {
                            i37 = 4;
                        } else {
                            i37 = 2;
                        }
                        i36 = i15 | i37;
                    } else {
                        i36 = i15;
                    }
                    if ((i16 & 2048) != 0) {
                        i36 |= 48;
                    } else if ((i15 & 48) == 0) {
                        if (o0VarE.r(null)) {
                            i38 = 32;
                        } else {
                            i38 = 16;
                        }
                        i36 |= i38;
                    }
                    if ((i15 & 384) != 0) {
                        if (o0VarE.B(str2)) {
                            i54 = 256;
                        } else {
                            i54 = 128;
                        }
                        i36 |= i54;
                    }
                    i39 = i36;
                    if ((i16 & 8192) != 0) {
                        if ((i15 & 3072) == 0) {
                            i39 |= o0VarE.B(null) ? 2048 : 1024;
                        }
                        i44 = i16 & 16384;
                        if (i44 != 0) {
                            i46 = i39 | 24576;
                        } else {
                            i45 = i39;
                            if ((i15 & 24576) == 0) {
                                if ((i15 & 32768) == 0) {
                                    zR = o0VarE.B(aVar);
                                } else {
                                    zR = o0VarE.r(aVar);
                                }
                                i46 = i45 | (zR ? 16384 : 8192);
                            } else {
                                i46 = i45;
                            }
                        }
                        i47 = i16 & 32768;
                        if (i47 != 0) {
                            i46 |= 196608;
                        } else if ((i15 & 196608) == 0) {
                            i46 |= o0VarE.r(pVar) ? 131072 : 65536;
                        }
                        i48 = i16 & 65536;
                        if (i48 != 0) {
                            i46 |= 1572864;
                        } else if ((i15 & 1572864) == 0) {
                            i46 |= o0VarE.r(qVar) ? 1048576 : 524288;
                        }
                        i49 = i46;
                        if ((i17 & 306783379) == 306783378 || (i49 & 599187) != 599186) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        if (o0VarE.n(i17 & 1, z16)) {
                            if (i58 != 0) {
                                str5 = null;
                            } else {
                                str5 = str3;
                            }
                            if (i18 != 0) {
                                z19 = false;
                            } else {
                                z19 = z14;
                            }
                            if (i24 != 0) {
                                g6.f.a aVar4 = g6.f.f75994b;
                                f22 = 0;
                            } else {
                                f22 = f17;
                            }
                            if (i26 != 0) {
                                d0Var4 = null;
                            } else {
                                d0Var4 = d0Var2;
                            }
                            if (i28 != 0) {
                                f24 = null;
                            } else {
                                f24 = f16;
                            }
                            if (i30 != 0) {
                                e0Var3 = e0.LINEAR;
                            } else {
                                e0Var3 = e0Var;
                            }
                            if (i35 != 0) {
                                z24 = false;
                            } else {
                                z24 = z15;
                            }
                            if (i44 != 0) {
                                aVar3 = null;
                            } else {
                                aVar3 = aVar;
                            }
                            if (i47 != 0) {
                                pVar3 = null;
                            } else {
                                pVar3 = pVar;
                            }
                            if (i48 != 0) {
                                qVar3 = null;
                            } else {
                                qVar3 = qVar;
                            }
                            x1 x1Var = p3.n.f135158a;
                            int i59 = i49 << 6;
                            b(rVar, str5, i53.a.j(p13.w.c(new d0(f14, dVar2, cVar, z19, f22, d0Var4, e0Var3, z24, null, null))), f24, str2, null, aVar3, pVar3, qVar3, o0VarE, (i17 & 126) | ((i17 >> 15) & 7168) | (57344 & i59) | (458752 & i59) | (3670016 & i59) | (29360128 & i59) | (i59 & 234881024), 0);
                            str4 = str5;
                            f19 = f24;
                            qVar2 = qVar3;
                            z17 = z19;
                            f18 = f22;
                            d0Var3 = d0Var4;
                            e0Var2 = e0Var3;
                            aVar2 = aVar3;
                            pVar2 = pVar3;
                            z18 = z24;
                        } else {
                            o0VarE.e();
                            z17 = z14;
                            aVar2 = aVar;
                            qVar2 = qVar;
                            f18 = f17;
                            d0Var3 = d0Var2;
                            str4 = str3;
                            f19 = f16;
                            e0Var2 = e0Var;
                            z18 = z15;
                            pVar2 = pVar;
                        }
                        p2VarI0 = o0VarE.i0();
                        if (p2VarI0 != null) {
                            p2VarI0.f135219d = new e23.p() { // from class: m92.b0
                                @Override // e23.p
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    int iT = p3.p0.t(i14 | 1);
                                    int iT2 = p3.p0.t(i15);
                                    c0.a(rVar, str4, f14, dVar, z17, f18, d0Var3, cVar, f19, e0Var2, z18, str2, aVar2, pVar2, qVar2, (p3.m) obj, iT, iT2, i16);
                                    return Unit.INSTANCE;
                                }
                            };
                        }
                    }
                    i39 |= 3072;
                    i44 = i16 & 16384;
                    if (i44 != 0) {
                        i46 = i39 | 24576;
                    } else {
                        i45 = i39;
                        if ((i15 & 24576) == 0) {
                            if ((i15 & 32768) == 0) {
                                zR = o0VarE.B(aVar);
                            } else {
                                zR = o0VarE.r(aVar);
                            }
                            i46 = i45 | (zR ? 16384 : 8192);
                        } else {
                            i46 = i45;
                        }
                    }
                    i47 = i16 & 32768;
                    if (i47 != 0) {
                        i46 |= 196608;
                    } else if ((i15 & 196608) == 0) {
                        i46 |= o0VarE.r(pVar) ? 131072 : 65536;
                    }
                    i48 = i16 & 65536;
                    if (i48 != 0) {
                        i46 |= 1572864;
                    } else if ((i15 & 1572864) == 0) {
                        i46 |= o0VarE.r(qVar) ? 1048576 : 524288;
                    }
                    i49 = i46;
                    if ((i17 & 306783379) == 306783378) {
                        z16 = true;
                    } else {
                        z16 = true;
                    }
                    if (o0VarE.n(i17 & 1, z16)) {
                        if (i58 != 0) {
                            str5 = null;
                        } else {
                            str5 = str3;
                        }
                        if (i18 != 0) {
                            z19 = false;
                        } else {
                            z19 = z14;
                        }
                        if (i24 != 0) {
                            g6.f.a aVar5 = g6.f.f75994b;
                            f22 = 0;
                        } else {
                            f22 = f17;
                        }
                        if (i26 != 0) {
                            d0Var4 = null;
                        } else {
                            d0Var4 = d0Var2;
                        }
                        if (i28 != 0) {
                            f24 = null;
                        } else {
                            f24 = f16;
                        }
                        if (i30 != 0) {
                            e0Var3 = e0.LINEAR;
                        } else {
                            e0Var3 = e0Var;
                        }
                        if (i35 != 0) {
                            z24 = false;
                        } else {
                            z24 = z15;
                        }
                        if (i44 != 0) {
                            aVar3 = null;
                        } else {
                            aVar3 = aVar;
                        }
                        if (i47 != 0) {
                            pVar3 = null;
                        } else {
                            pVar3 = pVar;
                        }
                        if (i48 != 0) {
                            qVar3 = null;
                        } else {
                            qVar3 = qVar;
                        }
                        x1 x1Var2 = p3.n.f135158a;
                        int i510 = i49 << 6;
                        b(rVar, str5, i53.a.j(p13.w.c(new d0(f14, dVar2, cVar, z19, f22, d0Var4, e0Var3, z24, null, null))), f24, str2, null, aVar3, pVar3, qVar3, o0VarE, (i17 & 126) | ((i17 >> 15) & 7168) | (57344 & i510) | (458752 & i510) | (3670016 & i510) | (29360128 & i510) | (i510 & 234881024), 0);
                        str4 = str5;
                        f19 = f24;
                        qVar2 = qVar3;
                        z17 = z19;
                        f18 = f22;
                        d0Var3 = d0Var4;
                        e0Var2 = e0Var3;
                        aVar2 = aVar3;
                        pVar2 = pVar3;
                        z18 = z24;
                    } else {
                        o0VarE.e();
                        z17 = z14;
                        aVar2 = aVar;
                        qVar2 = qVar;
                        f18 = f17;
                        d0Var3 = d0Var2;
                        str4 = str3;
                        f19 = f16;
                        e0Var2 = e0Var;
                        z18 = z15;
                        pVar2 = pVar;
                    }
                    p2VarI0 = o0VarE.i0();
                    if (p2VarI0 != null) {
                        p2VarI0.f135219d = new e23.p() { // from class: m92.b0
                            @Override // e23.p
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iT = p3.p0.t(i14 | 1);
                                int iT2 = p3.p0.t(i15);
                                c0.a(rVar, str4, f14, dVar, z17, f18, d0Var3, cVar, f19, e0Var2, z18, str2, aVar2, pVar2, qVar2, (p3.m) obj, iT, iT2, i16);
                                return Unit.INSTANCE;
                            }
                        };
                    }
                }
                i17 |= C.ENCODING_PCM_32BIT;
                i35 = i16 & 1024;
                if (i35 != 0) {
                    i36 = i15 | 6;
                } else if ((i15 & 6) == 0) {
                    if (o0VarE.h(z15)) {
                        i37 = 4;
                    } else {
                        i37 = 2;
                    }
                    i36 = i15 | i37;
                } else {
                    i36 = i15;
                }
                if ((i16 & 2048) != 0) {
                    i36 |= 48;
                } else if ((i15 & 48) == 0) {
                    if (o0VarE.r(null)) {
                        i38 = 32;
                    } else {
                        i38 = 16;
                    }
                    i36 |= i38;
                }
                if ((i15 & 384) != 0) {
                    if (o0VarE.B(str2)) {
                        i54 = 256;
                    } else {
                        i54 = 128;
                    }
                    i36 |= i54;
                }
                i39 = i36;
                if ((i16 & 8192) != 0) {
                    if ((i15 & 3072) == 0) {
                        i39 |= o0VarE.B(null) ? 2048 : 1024;
                    }
                    i44 = i16 & 16384;
                    if (i44 != 0) {
                        i46 = i39 | 24576;
                    } else {
                        i45 = i39;
                        if ((i15 & 24576) == 0) {
                            if ((i15 & 32768) == 0) {
                                zR = o0VarE.B(aVar);
                            } else {
                                zR = o0VarE.r(aVar);
                            }
                            i46 = i45 | (zR ? 16384 : 8192);
                        } else {
                            i46 = i45;
                        }
                    }
                    i47 = i16 & 32768;
                    if (i47 != 0) {
                        i46 |= 196608;
                    } else if ((i15 & 196608) == 0) {
                        i46 |= o0VarE.r(pVar) ? 131072 : 65536;
                    }
                    i48 = i16 & 65536;
                    if (i48 != 0) {
                        i46 |= 1572864;
                    } else if ((i15 & 1572864) == 0) {
                        i46 |= o0VarE.r(qVar) ? 1048576 : 524288;
                    }
                    i49 = i46;
                    if ((i17 & 306783379) == 306783378) {
                        z16 = true;
                    } else {
                        z16 = true;
                    }
                    if (o0VarE.n(i17 & 1, z16)) {
                        if (i58 != 0) {
                            str5 = null;
                        } else {
                            str5 = str3;
                        }
                        if (i18 != 0) {
                            z19 = false;
                        } else {
                            z19 = z14;
                        }
                        if (i24 != 0) {
                            g6.f.a aVar6 = g6.f.f75994b;
                            f22 = 0;
                        } else {
                            f22 = f17;
                        }
                        if (i26 != 0) {
                            d0Var4 = null;
                        } else {
                            d0Var4 = d0Var2;
                        }
                        if (i28 != 0) {
                            f24 = null;
                        } else {
                            f24 = f16;
                        }
                        if (i30 != 0) {
                            e0Var3 = e0.LINEAR;
                        } else {
                            e0Var3 = e0Var;
                        }
                        if (i35 != 0) {
                            z24 = false;
                        } else {
                            z24 = z15;
                        }
                        if (i44 != 0) {
                            aVar3 = null;
                        } else {
                            aVar3 = aVar;
                        }
                        if (i47 != 0) {
                            pVar3 = null;
                        } else {
                            pVar3 = pVar;
                        }
                        if (i48 != 0) {
                            qVar3 = null;
                        } else {
                            qVar3 = qVar;
                        }
                        x1 x1Var3 = p3.n.f135158a;
                        int i511 = i49 << 6;
                        b(rVar, str5, i53.a.j(p13.w.c(new d0(f14, dVar2, cVar, z19, f22, d0Var4, e0Var3, z24, null, null))), f24, str2, null, aVar3, pVar3, qVar3, o0VarE, (i17 & 126) | ((i17 >> 15) & 7168) | (57344 & i511) | (458752 & i511) | (3670016 & i511) | (29360128 & i511) | (i511 & 234881024), 0);
                        str4 = str5;
                        f19 = f24;
                        qVar2 = qVar3;
                        z17 = z19;
                        f18 = f22;
                        d0Var3 = d0Var4;
                        e0Var2 = e0Var3;
                        aVar2 = aVar3;
                        pVar2 = pVar3;
                        z18 = z24;
                    } else {
                        o0VarE.e();
                        z17 = z14;
                        aVar2 = aVar;
                        qVar2 = qVar;
                        f18 = f17;
                        d0Var3 = d0Var2;
                        str4 = str3;
                        f19 = f16;
                        e0Var2 = e0Var;
                        z18 = z15;
                        pVar2 = pVar;
                    }
                    p2VarI0 = o0VarE.i0();
                    if (p2VarI0 != null) {
                        p2VarI0.f135219d = new e23.p() { // from class: m92.b0
                            @Override // e23.p
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iT = p3.p0.t(i14 | 1);
                                int iT2 = p3.p0.t(i15);
                                c0.a(rVar, str4, f14, dVar, z17, f18, d0Var3, cVar, f19, e0Var2, z18, str2, aVar2, pVar2, qVar2, (p3.m) obj, iT, iT2, i16);
                                return Unit.INSTANCE;
                            }
                        };
                    }
                }
                i39 |= 3072;
                i44 = i16 & 16384;
                if (i44 != 0) {
                    i46 = i39 | 24576;
                } else {
                    i45 = i39;
                    if ((i15 & 24576) == 0) {
                        if ((i15 & 32768) == 0) {
                            zR = o0VarE.B(aVar);
                        } else {
                            zR = o0VarE.r(aVar);
                        }
                        i46 = i45 | (zR ? 16384 : 8192);
                    } else {
                        i46 = i45;
                    }
                }
                i47 = i16 & 32768;
                if (i47 != 0) {
                    i46 |= 196608;
                } else if ((i15 & 196608) == 0) {
                    i46 |= o0VarE.r(pVar) ? 131072 : 65536;
                }
                i48 = i16 & 65536;
                if (i48 != 0) {
                    i46 |= 1572864;
                } else if ((i15 & 1572864) == 0) {
                    i46 |= o0VarE.r(qVar) ? 1048576 : 524288;
                }
                i49 = i46;
                if ((i17 & 306783379) == 306783378) {
                    z16 = true;
                } else {
                    z16 = true;
                }
                if (o0VarE.n(i17 & 1, z16)) {
                    if (i58 != 0) {
                        str5 = null;
                    } else {
                        str5 = str3;
                    }
                    if (i18 != 0) {
                        z19 = false;
                    } else {
                        z19 = z14;
                    }
                    if (i24 != 0) {
                        g6.f.a aVar7 = g6.f.f75994b;
                        f22 = 0;
                    } else {
                        f22 = f17;
                    }
                    if (i26 != 0) {
                        d0Var4 = null;
                    } else {
                        d0Var4 = d0Var2;
                    }
                    if (i28 != 0) {
                        f24 = null;
                    } else {
                        f24 = f16;
                    }
                    if (i30 != 0) {
                        e0Var3 = e0.LINEAR;
                    } else {
                        e0Var3 = e0Var;
                    }
                    if (i35 != 0) {
                        z24 = false;
                    } else {
                        z24 = z15;
                    }
                    if (i44 != 0) {
                        aVar3 = null;
                    } else {
                        aVar3 = aVar;
                    }
                    if (i47 != 0) {
                        pVar3 = null;
                    } else {
                        pVar3 = pVar;
                    }
                    if (i48 != 0) {
                        qVar3 = null;
                    } else {
                        qVar3 = qVar;
                    }
                    x1 x1Var4 = p3.n.f135158a;
                    int i512 = i49 << 6;
                    b(rVar, str5, i53.a.j(p13.w.c(new d0(f14, dVar2, cVar, z19, f22, d0Var4, e0Var3, z24, null, null))), f24, str2, null, aVar3, pVar3, qVar3, o0VarE, (i17 & 126) | ((i17 >> 15) & 7168) | (57344 & i512) | (458752 & i512) | (3670016 & i512) | (29360128 & i512) | (i512 & 234881024), 0);
                    str4 = str5;
                    f19 = f24;
                    qVar2 = qVar3;
                    z17 = z19;
                    f18 = f22;
                    d0Var3 = d0Var4;
                    e0Var2 = e0Var3;
                    aVar2 = aVar3;
                    pVar2 = pVar3;
                    z18 = z24;
                } else {
                    o0VarE.e();
                    z17 = z14;
                    aVar2 = aVar;
                    qVar2 = qVar;
                    f18 = f17;
                    d0Var3 = d0Var2;
                    str4 = str3;
                    f19 = f16;
                    e0Var2 = e0Var;
                    z18 = z15;
                    pVar2 = pVar;
                }
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new e23.p() { // from class: m92.b0
                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iT = p3.p0.t(i14 | 1);
                            int iT2 = p3.p0.t(i15);
                            c0.a(rVar, str4, f14, dVar, z17, f18, d0Var3, cVar, f19, e0Var2, z18, str2, aVar2, pVar2, qVar2, (p3.m) obj, iT, iT2, i16);
                            return Unit.INSTANCE;
                        }
                    };
                }
            }
            i17 |= 24576;
            i24 = i16 & 32;
            if (i24 != 0) {
                i17 |= 196608;
                f17 = f15;
            } else {
                f17 = f15;
                if ((i14 & 196608) == 0) {
                    if (o0VarE.i(f17)) {
                        i25 = 131072;
                    } else {
                        i25 = 65536;
                    }
                    i17 |= i25;
                }
            }
            i26 = i16 & 64;
            if (i26 != 0) {
                i17 |= 1572864;
                d0Var2 = d0Var;
            } else {
                d0Var2 = d0Var;
                if ((i14 & 1572864) == 0) {
                    if (o0VarE.B(d0Var2)) {
                        i27 = 1048576;
                    } else {
                        i27 = 524288;
                    }
                    i17 |= i27;
                }
            }
            if ((i14 & 12582912) == 0) {
                if (o0VarE.B(cVar)) {
                    i55 = 8388608;
                } else {
                    i55 = 4194304;
                }
                i17 |= i55;
            }
            i28 = i16 & 256;
            if (i28 != 0) {
                i17 |= 100663296;
            } else if ((i14 & 100663296) == 0) {
                if (o0VarE.B(f16)) {
                    i29 = 67108864;
                } else {
                    i29 = 33554432;
                }
                i17 |= i29;
            }
            i30 = i16 & 512;
            if (i30 != 0) {
                if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                    if (e0Var == null) {
                        iOrdinal = -1;
                    } else {
                        iOrdinal = e0Var.ordinal();
                    }
                    if (o0VarE.k(iOrdinal)) {
                        i34 = 536870912;
                    } else {
                        i34 = 268435456;
                    }
                    i17 |= i34;
                }
                i35 = i16 & 1024;
                if (i35 != 0) {
                    i36 = i15 | 6;
                } else if ((i15 & 6) == 0) {
                    if (o0VarE.h(z15)) {
                        i37 = 4;
                    } else {
                        i37 = 2;
                    }
                    i36 = i15 | i37;
                } else {
                    i36 = i15;
                }
                if ((i16 & 2048) != 0) {
                    i36 |= 48;
                } else if ((i15 & 48) == 0) {
                    if (o0VarE.r(null)) {
                        i38 = 32;
                    } else {
                        i38 = 16;
                    }
                    i36 |= i38;
                }
                if ((i15 & 384) != 0) {
                    if (o0VarE.B(str2)) {
                        i54 = 256;
                    } else {
                        i54 = 128;
                    }
                    i36 |= i54;
                }
                i39 = i36;
                if ((i16 & 8192) != 0) {
                    if ((i15 & 3072) == 0) {
                        i39 |= o0VarE.B(null) ? 2048 : 1024;
                    }
                    i44 = i16 & 16384;
                    if (i44 != 0) {
                        i46 = i39 | 24576;
                    } else {
                        i45 = i39;
                        if ((i15 & 24576) == 0) {
                            if ((i15 & 32768) == 0) {
                                zR = o0VarE.B(aVar);
                            } else {
                                zR = o0VarE.r(aVar);
                            }
                            i46 = i45 | (zR ? 16384 : 8192);
                        } else {
                            i46 = i45;
                        }
                    }
                    i47 = i16 & 32768;
                    if (i47 != 0) {
                        i46 |= 196608;
                    } else if ((i15 & 196608) == 0) {
                        i46 |= o0VarE.r(pVar) ? 131072 : 65536;
                    }
                    i48 = i16 & 65536;
                    if (i48 != 0) {
                        i46 |= 1572864;
                    } else if ((i15 & 1572864) == 0) {
                        i46 |= o0VarE.r(qVar) ? 1048576 : 524288;
                    }
                    i49 = i46;
                    if ((i17 & 306783379) == 306783378) {
                        z16 = true;
                    } else {
                        z16 = true;
                    }
                    if (o0VarE.n(i17 & 1, z16)) {
                        if (i58 != 0) {
                            str5 = null;
                        } else {
                            str5 = str3;
                        }
                        if (i18 != 0) {
                            z19 = false;
                        } else {
                            z19 = z14;
                        }
                        if (i24 != 0) {
                            g6.f.a aVar8 = g6.f.f75994b;
                            f22 = 0;
                        } else {
                            f22 = f17;
                        }
                        if (i26 != 0) {
                            d0Var4 = null;
                        } else {
                            d0Var4 = d0Var2;
                        }
                        if (i28 != 0) {
                            f24 = null;
                        } else {
                            f24 = f16;
                        }
                        if (i30 != 0) {
                            e0Var3 = e0.LINEAR;
                        } else {
                            e0Var3 = e0Var;
                        }
                        if (i35 != 0) {
                            z24 = false;
                        } else {
                            z24 = z15;
                        }
                        if (i44 != 0) {
                            aVar3 = null;
                        } else {
                            aVar3 = aVar;
                        }
                        if (i47 != 0) {
                            pVar3 = null;
                        } else {
                            pVar3 = pVar;
                        }
                        if (i48 != 0) {
                            qVar3 = null;
                        } else {
                            qVar3 = qVar;
                        }
                        x1 x1Var5 = p3.n.f135158a;
                        int i513 = i49 << 6;
                        b(rVar, str5, i53.a.j(p13.w.c(new d0(f14, dVar2, cVar, z19, f22, d0Var4, e0Var3, z24, null, null))), f24, str2, null, aVar3, pVar3, qVar3, o0VarE, (i17 & 126) | ((i17 >> 15) & 7168) | (57344 & i513) | (458752 & i513) | (3670016 & i513) | (29360128 & i513) | (i513 & 234881024), 0);
                        str4 = str5;
                        f19 = f24;
                        qVar2 = qVar3;
                        z17 = z19;
                        f18 = f22;
                        d0Var3 = d0Var4;
                        e0Var2 = e0Var3;
                        aVar2 = aVar3;
                        pVar2 = pVar3;
                        z18 = z24;
                    } else {
                        o0VarE.e();
                        z17 = z14;
                        aVar2 = aVar;
                        qVar2 = qVar;
                        f18 = f17;
                        d0Var3 = d0Var2;
                        str4 = str3;
                        f19 = f16;
                        e0Var2 = e0Var;
                        z18 = z15;
                        pVar2 = pVar;
                    }
                    p2VarI0 = o0VarE.i0();
                    if (p2VarI0 != null) {
                        p2VarI0.f135219d = new e23.p() { // from class: m92.b0
                            @Override // e23.p
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iT = p3.p0.t(i14 | 1);
                                int iT2 = p3.p0.t(i15);
                                c0.a(rVar, str4, f14, dVar, z17, f18, d0Var3, cVar, f19, e0Var2, z18, str2, aVar2, pVar2, qVar2, (p3.m) obj, iT, iT2, i16);
                                return Unit.INSTANCE;
                            }
                        };
                    }
                }
                i39 |= 3072;
                i44 = i16 & 16384;
                if (i44 != 0) {
                    i46 = i39 | 24576;
                } else {
                    i45 = i39;
                    if ((i15 & 24576) == 0) {
                        if ((i15 & 32768) == 0) {
                            zR = o0VarE.B(aVar);
                        } else {
                            zR = o0VarE.r(aVar);
                        }
                        i46 = i45 | (zR ? 16384 : 8192);
                    } else {
                        i46 = i45;
                    }
                }
                i47 = i16 & 32768;
                if (i47 != 0) {
                    i46 |= 196608;
                } else if ((i15 & 196608) == 0) {
                    i46 |= o0VarE.r(pVar) ? 131072 : 65536;
                }
                i48 = i16 & 65536;
                if (i48 != 0) {
                    i46 |= 1572864;
                } else if ((i15 & 1572864) == 0) {
                    i46 |= o0VarE.r(qVar) ? 1048576 : 524288;
                }
                i49 = i46;
                if ((i17 & 306783379) == 306783378) {
                    z16 = true;
                } else {
                    z16 = true;
                }
                if (o0VarE.n(i17 & 1, z16)) {
                    if (i58 != 0) {
                        str5 = null;
                    } else {
                        str5 = str3;
                    }
                    if (i18 != 0) {
                        z19 = false;
                    } else {
                        z19 = z14;
                    }
                    if (i24 != 0) {
                        g6.f.a aVar9 = g6.f.f75994b;
                        f22 = 0;
                    } else {
                        f22 = f17;
                    }
                    if (i26 != 0) {
                        d0Var4 = null;
                    } else {
                        d0Var4 = d0Var2;
                    }
                    if (i28 != 0) {
                        f24 = null;
                    } else {
                        f24 = f16;
                    }
                    if (i30 != 0) {
                        e0Var3 = e0.LINEAR;
                    } else {
                        e0Var3 = e0Var;
                    }
                    if (i35 != 0) {
                        z24 = false;
                    } else {
                        z24 = z15;
                    }
                    if (i44 != 0) {
                        aVar3 = null;
                    } else {
                        aVar3 = aVar;
                    }
                    if (i47 != 0) {
                        pVar3 = null;
                    } else {
                        pVar3 = pVar;
                    }
                    if (i48 != 0) {
                        qVar3 = null;
                    } else {
                        qVar3 = qVar;
                    }
                    x1 x1Var6 = p3.n.f135158a;
                    int i514 = i49 << 6;
                    b(rVar, str5, i53.a.j(p13.w.c(new d0(f14, dVar2, cVar, z19, f22, d0Var4, e0Var3, z24, null, null))), f24, str2, null, aVar3, pVar3, qVar3, o0VarE, (i17 & 126) | ((i17 >> 15) & 7168) | (57344 & i514) | (458752 & i514) | (3670016 & i514) | (29360128 & i514) | (i514 & 234881024), 0);
                    str4 = str5;
                    f19 = f24;
                    qVar2 = qVar3;
                    z17 = z19;
                    f18 = f22;
                    d0Var3 = d0Var4;
                    e0Var2 = e0Var3;
                    aVar2 = aVar3;
                    pVar2 = pVar3;
                    z18 = z24;
                } else {
                    o0VarE.e();
                    z17 = z14;
                    aVar2 = aVar;
                    qVar2 = qVar;
                    f18 = f17;
                    d0Var3 = d0Var2;
                    str4 = str3;
                    f19 = f16;
                    e0Var2 = e0Var;
                    z18 = z15;
                    pVar2 = pVar;
                }
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new e23.p() { // from class: m92.b0
                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iT = p3.p0.t(i14 | 1);
                            int iT2 = p3.p0.t(i15);
                            c0.a(rVar, str4, f14, dVar, z17, f18, d0Var3, cVar, f19, e0Var2, z18, str2, aVar2, pVar2, qVar2, (p3.m) obj, iT, iT2, i16);
                            return Unit.INSTANCE;
                        }
                    };
                }
            }
            i17 |= C.ENCODING_PCM_32BIT;
            i35 = i16 & 1024;
            if (i35 != 0) {
                i36 = i15 | 6;
            } else if ((i15 & 6) == 0) {
                if (o0VarE.h(z15)) {
                    i37 = 4;
                } else {
                    i37 = 2;
                }
                i36 = i15 | i37;
            } else {
                i36 = i15;
            }
            if ((i16 & 2048) != 0) {
                i36 |= 48;
            } else if ((i15 & 48) == 0) {
                if (o0VarE.r(null)) {
                    i38 = 32;
                } else {
                    i38 = 16;
                }
                i36 |= i38;
            }
            if ((i15 & 384) != 0) {
                if (o0VarE.B(str2)) {
                    i54 = 256;
                } else {
                    i54 = 128;
                }
                i36 |= i54;
            }
            i39 = i36;
            if ((i16 & 8192) != 0) {
                if ((i15 & 3072) == 0) {
                    i39 |= o0VarE.B(null) ? 2048 : 1024;
                }
                i44 = i16 & 16384;
                if (i44 != 0) {
                    i46 = i39 | 24576;
                } else {
                    i45 = i39;
                    if ((i15 & 24576) == 0) {
                        if ((i15 & 32768) == 0) {
                            zR = o0VarE.B(aVar);
                        } else {
                            zR = o0VarE.r(aVar);
                        }
                        i46 = i45 | (zR ? 16384 : 8192);
                    } else {
                        i46 = i45;
                    }
                }
                i47 = i16 & 32768;
                if (i47 != 0) {
                    i46 |= 196608;
                } else if ((i15 & 196608) == 0) {
                    i46 |= o0VarE.r(pVar) ? 131072 : 65536;
                }
                i48 = i16 & 65536;
                if (i48 != 0) {
                    i46 |= 1572864;
                } else if ((i15 & 1572864) == 0) {
                    i46 |= o0VarE.r(qVar) ? 1048576 : 524288;
                }
                i49 = i46;
                if ((i17 & 306783379) == 306783378) {
                    z16 = true;
                } else {
                    z16 = true;
                }
                if (o0VarE.n(i17 & 1, z16)) {
                    if (i58 != 0) {
                        str5 = null;
                    } else {
                        str5 = str3;
                    }
                    if (i18 != 0) {
                        z19 = false;
                    } else {
                        z19 = z14;
                    }
                    if (i24 != 0) {
                        g6.f.a aVar10 = g6.f.f75994b;
                        f22 = 0;
                    } else {
                        f22 = f17;
                    }
                    if (i26 != 0) {
                        d0Var4 = null;
                    } else {
                        d0Var4 = d0Var2;
                    }
                    if (i28 != 0) {
                        f24 = null;
                    } else {
                        f24 = f16;
                    }
                    if (i30 != 0) {
                        e0Var3 = e0.LINEAR;
                    } else {
                        e0Var3 = e0Var;
                    }
                    if (i35 != 0) {
                        z24 = false;
                    } else {
                        z24 = z15;
                    }
                    if (i44 != 0) {
                        aVar3 = null;
                    } else {
                        aVar3 = aVar;
                    }
                    if (i47 != 0) {
                        pVar3 = null;
                    } else {
                        pVar3 = pVar;
                    }
                    if (i48 != 0) {
                        qVar3 = null;
                    } else {
                        qVar3 = qVar;
                    }
                    x1 x1Var7 = p3.n.f135158a;
                    int i515 = i49 << 6;
                    b(rVar, str5, i53.a.j(p13.w.c(new d0(f14, dVar2, cVar, z19, f22, d0Var4, e0Var3, z24, null, null))), f24, str2, null, aVar3, pVar3, qVar3, o0VarE, (i17 & 126) | ((i17 >> 15) & 7168) | (57344 & i515) | (458752 & i515) | (3670016 & i515) | (29360128 & i515) | (i515 & 234881024), 0);
                    str4 = str5;
                    f19 = f24;
                    qVar2 = qVar3;
                    z17 = z19;
                    f18 = f22;
                    d0Var3 = d0Var4;
                    e0Var2 = e0Var3;
                    aVar2 = aVar3;
                    pVar2 = pVar3;
                    z18 = z24;
                } else {
                    o0VarE.e();
                    z17 = z14;
                    aVar2 = aVar;
                    qVar2 = qVar;
                    f18 = f17;
                    d0Var3 = d0Var2;
                    str4 = str3;
                    f19 = f16;
                    e0Var2 = e0Var;
                    z18 = z15;
                    pVar2 = pVar;
                }
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new e23.p() { // from class: m92.b0
                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iT = p3.p0.t(i14 | 1);
                            int iT2 = p3.p0.t(i15);
                            c0.a(rVar, str4, f14, dVar, z17, f18, d0Var3, cVar, f19, e0Var2, z18, str2, aVar2, pVar2, qVar2, (p3.m) obj, iT, iT2, i16);
                            return Unit.INSTANCE;
                        }
                    };
                }
            }
            i39 |= 3072;
            i44 = i16 & 16384;
            if (i44 != 0) {
                i46 = i39 | 24576;
            } else {
                i45 = i39;
                if ((i15 & 24576) == 0) {
                    if ((i15 & 32768) == 0) {
                        zR = o0VarE.B(aVar);
                    } else {
                        zR = o0VarE.r(aVar);
                    }
                    i46 = i45 | (zR ? 16384 : 8192);
                } else {
                    i46 = i45;
                }
            }
            i47 = i16 & 32768;
            if (i47 != 0) {
                i46 |= 196608;
            } else if ((i15 & 196608) == 0) {
                i46 |= o0VarE.r(pVar) ? 131072 : 65536;
            }
            i48 = i16 & 65536;
            if (i48 != 0) {
                i46 |= 1572864;
            } else if ((i15 & 1572864) == 0) {
                i46 |= o0VarE.r(qVar) ? 1048576 : 524288;
            }
            i49 = i46;
            if ((i17 & 306783379) == 306783378) {
                z16 = true;
            } else {
                z16 = true;
            }
            if (o0VarE.n(i17 & 1, z16)) {
                if (i58 != 0) {
                    str5 = null;
                } else {
                    str5 = str3;
                }
                if (i18 != 0) {
                    z19 = false;
                } else {
                    z19 = z14;
                }
                if (i24 != 0) {
                    g6.f.a aVar11 = g6.f.f75994b;
                    f22 = 0;
                } else {
                    f22 = f17;
                }
                if (i26 != 0) {
                    d0Var4 = null;
                } else {
                    d0Var4 = d0Var2;
                }
                if (i28 != 0) {
                    f24 = null;
                } else {
                    f24 = f16;
                }
                if (i30 != 0) {
                    e0Var3 = e0.LINEAR;
                } else {
                    e0Var3 = e0Var;
                }
                if (i35 != 0) {
                    z24 = false;
                } else {
                    z24 = z15;
                }
                if (i44 != 0) {
                    aVar3 = null;
                } else {
                    aVar3 = aVar;
                }
                if (i47 != 0) {
                    pVar3 = null;
                } else {
                    pVar3 = pVar;
                }
                if (i48 != 0) {
                    qVar3 = null;
                } else {
                    qVar3 = qVar;
                }
                x1 x1Var8 = p3.n.f135158a;
                int i516 = i49 << 6;
                b(rVar, str5, i53.a.j(p13.w.c(new d0(f14, dVar2, cVar, z19, f22, d0Var4, e0Var3, z24, null, null))), f24, str2, null, aVar3, pVar3, qVar3, o0VarE, (i17 & 126) | ((i17 >> 15) & 7168) | (57344 & i516) | (458752 & i516) | (3670016 & i516) | (29360128 & i516) | (i516 & 234881024), 0);
                str4 = str5;
                f19 = f24;
                qVar2 = qVar3;
                z17 = z19;
                f18 = f22;
                d0Var3 = d0Var4;
                e0Var2 = e0Var3;
                aVar2 = aVar3;
                pVar2 = pVar3;
                z18 = z24;
            } else {
                o0VarE.e();
                z17 = z14;
                aVar2 = aVar;
                qVar2 = qVar;
                f18 = f17;
                d0Var3 = d0Var2;
                str4 = str3;
                f19 = f16;
                e0Var2 = e0Var;
                z18 = z15;
                pVar2 = pVar;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new e23.p() { // from class: m92.b0
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iT = p3.p0.t(i14 | 1);
                        int iT2 = p3.p0.t(i15);
                        c0.a(rVar, str4, f14, dVar, z17, f18, d0Var3, cVar, f19, e0Var2, z18, str2, aVar2, pVar2, qVar2, (p3.m) obj, iT, iT2, i16);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        i17 |= 48;
        str3 = str;
        if ((i14 & 384) != 0) {
            if (o0VarE.i(f14)) {
                i57 = 256;
            } else {
                i57 = 128;
            }
            i17 |= i57;
        }
        if ((i14 & 3072) == 0) {
            dVar2 = dVar;
            if (o0VarE.B(dVar2)) {
                i56 = 2048;
            } else {
                i56 = 1024;
            }
            i17 |= i56;
        } else {
            dVar2 = dVar;
        }
        i18 = i16 & 16;
        if (i18 != 0) {
            if ((i14 & 24576) == 0) {
                if (o0VarE.h(z14)) {
                    i19 = 16384;
                } else {
                    i19 = 8192;
                }
                i17 |= i19;
            }
            i24 = i16 & 32;
            if (i24 != 0) {
                i17 |= 196608;
                f17 = f15;
            } else {
                f17 = f15;
                if ((i14 & 196608) == 0) {
                    if (o0VarE.i(f17)) {
                        i25 = 131072;
                    } else {
                        i25 = 65536;
                    }
                    i17 |= i25;
                }
            }
            i26 = i16 & 64;
            if (i26 != 0) {
                i17 |= 1572864;
                d0Var2 = d0Var;
            } else {
                d0Var2 = d0Var;
                if ((i14 & 1572864) == 0) {
                    if (o0VarE.B(d0Var2)) {
                        i27 = 1048576;
                    } else {
                        i27 = 524288;
                    }
                    i17 |= i27;
                }
            }
            if ((i14 & 12582912) == 0) {
                if (o0VarE.B(cVar)) {
                    i55 = 8388608;
                } else {
                    i55 = 4194304;
                }
                i17 |= i55;
            }
            i28 = i16 & 256;
            if (i28 != 0) {
                i17 |= 100663296;
            } else if ((i14 & 100663296) == 0) {
                if (o0VarE.B(f16)) {
                    i29 = 67108864;
                } else {
                    i29 = 33554432;
                }
                i17 |= i29;
            }
            i30 = i16 & 512;
            if (i30 != 0) {
                if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                    if (e0Var == null) {
                        iOrdinal = -1;
                    } else {
                        iOrdinal = e0Var.ordinal();
                    }
                    if (o0VarE.k(iOrdinal)) {
                        i34 = 536870912;
                    } else {
                        i34 = 268435456;
                    }
                    i17 |= i34;
                }
                i35 = i16 & 1024;
                if (i35 != 0) {
                    i36 = i15 | 6;
                } else if ((i15 & 6) == 0) {
                    if (o0VarE.h(z15)) {
                        i37 = 4;
                    } else {
                        i37 = 2;
                    }
                    i36 = i15 | i37;
                } else {
                    i36 = i15;
                }
                if ((i16 & 2048) != 0) {
                    i36 |= 48;
                } else if ((i15 & 48) == 0) {
                    if (o0VarE.r(null)) {
                        i38 = 32;
                    } else {
                        i38 = 16;
                    }
                    i36 |= i38;
                }
                if ((i15 & 384) != 0) {
                    if (o0VarE.B(str2)) {
                        i54 = 256;
                    } else {
                        i54 = 128;
                    }
                    i36 |= i54;
                }
                i39 = i36;
                if ((i16 & 8192) != 0) {
                    if ((i15 & 3072) == 0) {
                        i39 |= o0VarE.B(null) ? 2048 : 1024;
                    }
                    i44 = i16 & 16384;
                    if (i44 != 0) {
                        i46 = i39 | 24576;
                    } else {
                        i45 = i39;
                        if ((i15 & 24576) == 0) {
                            if ((i15 & 32768) == 0) {
                                zR = o0VarE.B(aVar);
                            } else {
                                zR = o0VarE.r(aVar);
                            }
                            i46 = i45 | (zR ? 16384 : 8192);
                        } else {
                            i46 = i45;
                        }
                    }
                    i47 = i16 & 32768;
                    if (i47 != 0) {
                        i46 |= 196608;
                    } else if ((i15 & 196608) == 0) {
                        i46 |= o0VarE.r(pVar) ? 131072 : 65536;
                    }
                    i48 = i16 & 65536;
                    if (i48 != 0) {
                        i46 |= 1572864;
                    } else if ((i15 & 1572864) == 0) {
                        i46 |= o0VarE.r(qVar) ? 1048576 : 524288;
                    }
                    i49 = i46;
                    if ((i17 & 306783379) == 306783378) {
                        z16 = true;
                    } else {
                        z16 = true;
                    }
                    if (o0VarE.n(i17 & 1, z16)) {
                        if (i58 != 0) {
                            str5 = null;
                        } else {
                            str5 = str3;
                        }
                        if (i18 != 0) {
                            z19 = false;
                        } else {
                            z19 = z14;
                        }
                        if (i24 != 0) {
                            g6.f.a aVar12 = g6.f.f75994b;
                            f22 = 0;
                        } else {
                            f22 = f17;
                        }
                        if (i26 != 0) {
                            d0Var4 = null;
                        } else {
                            d0Var4 = d0Var2;
                        }
                        if (i28 != 0) {
                            f24 = null;
                        } else {
                            f24 = f16;
                        }
                        if (i30 != 0) {
                            e0Var3 = e0.LINEAR;
                        } else {
                            e0Var3 = e0Var;
                        }
                        if (i35 != 0) {
                            z24 = false;
                        } else {
                            z24 = z15;
                        }
                        if (i44 != 0) {
                            aVar3 = null;
                        } else {
                            aVar3 = aVar;
                        }
                        if (i47 != 0) {
                            pVar3 = null;
                        } else {
                            pVar3 = pVar;
                        }
                        if (i48 != 0) {
                            qVar3 = null;
                        } else {
                            qVar3 = qVar;
                        }
                        x1 x1Var9 = p3.n.f135158a;
                        int i517 = i49 << 6;
                        b(rVar, str5, i53.a.j(p13.w.c(new d0(f14, dVar2, cVar, z19, f22, d0Var4, e0Var3, z24, null, null))), f24, str2, null, aVar3, pVar3, qVar3, o0VarE, (i17 & 126) | ((i17 >> 15) & 7168) | (57344 & i517) | (458752 & i517) | (3670016 & i517) | (29360128 & i517) | (i517 & 234881024), 0);
                        str4 = str5;
                        f19 = f24;
                        qVar2 = qVar3;
                        z17 = z19;
                        f18 = f22;
                        d0Var3 = d0Var4;
                        e0Var2 = e0Var3;
                        aVar2 = aVar3;
                        pVar2 = pVar3;
                        z18 = z24;
                    } else {
                        o0VarE.e();
                        z17 = z14;
                        aVar2 = aVar;
                        qVar2 = qVar;
                        f18 = f17;
                        d0Var3 = d0Var2;
                        str4 = str3;
                        f19 = f16;
                        e0Var2 = e0Var;
                        z18 = z15;
                        pVar2 = pVar;
                    }
                    p2VarI0 = o0VarE.i0();
                    if (p2VarI0 != null) {
                        p2VarI0.f135219d = new e23.p() { // from class: m92.b0
                            @Override // e23.p
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iT = p3.p0.t(i14 | 1);
                                int iT2 = p3.p0.t(i15);
                                c0.a(rVar, str4, f14, dVar, z17, f18, d0Var3, cVar, f19, e0Var2, z18, str2, aVar2, pVar2, qVar2, (p3.m) obj, iT, iT2, i16);
                                return Unit.INSTANCE;
                            }
                        };
                    }
                }
                i39 |= 3072;
                i44 = i16 & 16384;
                if (i44 != 0) {
                    i46 = i39 | 24576;
                } else {
                    i45 = i39;
                    if ((i15 & 24576) == 0) {
                        if ((i15 & 32768) == 0) {
                            zR = o0VarE.B(aVar);
                        } else {
                            zR = o0VarE.r(aVar);
                        }
                        i46 = i45 | (zR ? 16384 : 8192);
                    } else {
                        i46 = i45;
                    }
                }
                i47 = i16 & 32768;
                if (i47 != 0) {
                    i46 |= 196608;
                } else if ((i15 & 196608) == 0) {
                    i46 |= o0VarE.r(pVar) ? 131072 : 65536;
                }
                i48 = i16 & 65536;
                if (i48 != 0) {
                    i46 |= 1572864;
                } else if ((i15 & 1572864) == 0) {
                    i46 |= o0VarE.r(qVar) ? 1048576 : 524288;
                }
                i49 = i46;
                if ((i17 & 306783379) == 306783378) {
                    z16 = true;
                } else {
                    z16 = true;
                }
                if (o0VarE.n(i17 & 1, z16)) {
                    if (i58 != 0) {
                        str5 = null;
                    } else {
                        str5 = str3;
                    }
                    if (i18 != 0) {
                        z19 = false;
                    } else {
                        z19 = z14;
                    }
                    if (i24 != 0) {
                        g6.f.a aVar13 = g6.f.f75994b;
                        f22 = 0;
                    } else {
                        f22 = f17;
                    }
                    if (i26 != 0) {
                        d0Var4 = null;
                    } else {
                        d0Var4 = d0Var2;
                    }
                    if (i28 != 0) {
                        f24 = null;
                    } else {
                        f24 = f16;
                    }
                    if (i30 != 0) {
                        e0Var3 = e0.LINEAR;
                    } else {
                        e0Var3 = e0Var;
                    }
                    if (i35 != 0) {
                        z24 = false;
                    } else {
                        z24 = z15;
                    }
                    if (i44 != 0) {
                        aVar3 = null;
                    } else {
                        aVar3 = aVar;
                    }
                    if (i47 != 0) {
                        pVar3 = null;
                    } else {
                        pVar3 = pVar;
                    }
                    if (i48 != 0) {
                        qVar3 = null;
                    } else {
                        qVar3 = qVar;
                    }
                    x1 x1Var10 = p3.n.f135158a;
                    int i518 = i49 << 6;
                    b(rVar, str5, i53.a.j(p13.w.c(new d0(f14, dVar2, cVar, z19, f22, d0Var4, e0Var3, z24, null, null))), f24, str2, null, aVar3, pVar3, qVar3, o0VarE, (i17 & 126) | ((i17 >> 15) & 7168) | (57344 & i518) | (458752 & i518) | (3670016 & i518) | (29360128 & i518) | (i518 & 234881024), 0);
                    str4 = str5;
                    f19 = f24;
                    qVar2 = qVar3;
                    z17 = z19;
                    f18 = f22;
                    d0Var3 = d0Var4;
                    e0Var2 = e0Var3;
                    aVar2 = aVar3;
                    pVar2 = pVar3;
                    z18 = z24;
                } else {
                    o0VarE.e();
                    z17 = z14;
                    aVar2 = aVar;
                    qVar2 = qVar;
                    f18 = f17;
                    d0Var3 = d0Var2;
                    str4 = str3;
                    f19 = f16;
                    e0Var2 = e0Var;
                    z18 = z15;
                    pVar2 = pVar;
                }
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new e23.p() { // from class: m92.b0
                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iT = p3.p0.t(i14 | 1);
                            int iT2 = p3.p0.t(i15);
                            c0.a(rVar, str4, f14, dVar, z17, f18, d0Var3, cVar, f19, e0Var2, z18, str2, aVar2, pVar2, qVar2, (p3.m) obj, iT, iT2, i16);
                            return Unit.INSTANCE;
                        }
                    };
                }
            }
            i17 |= C.ENCODING_PCM_32BIT;
            i35 = i16 & 1024;
            if (i35 != 0) {
                i36 = i15 | 6;
            } else if ((i15 & 6) == 0) {
                if (o0VarE.h(z15)) {
                    i37 = 4;
                } else {
                    i37 = 2;
                }
                i36 = i15 | i37;
            } else {
                i36 = i15;
            }
            if ((i16 & 2048) != 0) {
                i36 |= 48;
            } else if ((i15 & 48) == 0) {
                if (o0VarE.r(null)) {
                    i38 = 32;
                } else {
                    i38 = 16;
                }
                i36 |= i38;
            }
            if ((i15 & 384) != 0) {
                if (o0VarE.B(str2)) {
                    i54 = 256;
                } else {
                    i54 = 128;
                }
                i36 |= i54;
            }
            i39 = i36;
            if ((i16 & 8192) != 0) {
                if ((i15 & 3072) == 0) {
                    i39 |= o0VarE.B(null) ? 2048 : 1024;
                }
                i44 = i16 & 16384;
                if (i44 != 0) {
                    i46 = i39 | 24576;
                } else {
                    i45 = i39;
                    if ((i15 & 24576) == 0) {
                        if ((i15 & 32768) == 0) {
                            zR = o0VarE.B(aVar);
                        } else {
                            zR = o0VarE.r(aVar);
                        }
                        i46 = i45 | (zR ? 16384 : 8192);
                    } else {
                        i46 = i45;
                    }
                }
                i47 = i16 & 32768;
                if (i47 != 0) {
                    i46 |= 196608;
                } else if ((i15 & 196608) == 0) {
                    i46 |= o0VarE.r(pVar) ? 131072 : 65536;
                }
                i48 = i16 & 65536;
                if (i48 != 0) {
                    i46 |= 1572864;
                } else if ((i15 & 1572864) == 0) {
                    i46 |= o0VarE.r(qVar) ? 1048576 : 524288;
                }
                i49 = i46;
                if ((i17 & 306783379) == 306783378) {
                    z16 = true;
                } else {
                    z16 = true;
                }
                if (o0VarE.n(i17 & 1, z16)) {
                    if (i58 != 0) {
                        str5 = null;
                    } else {
                        str5 = str3;
                    }
                    if (i18 != 0) {
                        z19 = false;
                    } else {
                        z19 = z14;
                    }
                    if (i24 != 0) {
                        g6.f.a aVar14 = g6.f.f75994b;
                        f22 = 0;
                    } else {
                        f22 = f17;
                    }
                    if (i26 != 0) {
                        d0Var4 = null;
                    } else {
                        d0Var4 = d0Var2;
                    }
                    if (i28 != 0) {
                        f24 = null;
                    } else {
                        f24 = f16;
                    }
                    if (i30 != 0) {
                        e0Var3 = e0.LINEAR;
                    } else {
                        e0Var3 = e0Var;
                    }
                    if (i35 != 0) {
                        z24 = false;
                    } else {
                        z24 = z15;
                    }
                    if (i44 != 0) {
                        aVar3 = null;
                    } else {
                        aVar3 = aVar;
                    }
                    if (i47 != 0) {
                        pVar3 = null;
                    } else {
                        pVar3 = pVar;
                    }
                    if (i48 != 0) {
                        qVar3 = null;
                    } else {
                        qVar3 = qVar;
                    }
                    x1 x1Var11 = p3.n.f135158a;
                    int i519 = i49 << 6;
                    b(rVar, str5, i53.a.j(p13.w.c(new d0(f14, dVar2, cVar, z19, f22, d0Var4, e0Var3, z24, null, null))), f24, str2, null, aVar3, pVar3, qVar3, o0VarE, (i17 & 126) | ((i17 >> 15) & 7168) | (57344 & i519) | (458752 & i519) | (3670016 & i519) | (29360128 & i519) | (i519 & 234881024), 0);
                    str4 = str5;
                    f19 = f24;
                    qVar2 = qVar3;
                    z17 = z19;
                    f18 = f22;
                    d0Var3 = d0Var4;
                    e0Var2 = e0Var3;
                    aVar2 = aVar3;
                    pVar2 = pVar3;
                    z18 = z24;
                } else {
                    o0VarE.e();
                    z17 = z14;
                    aVar2 = aVar;
                    qVar2 = qVar;
                    f18 = f17;
                    d0Var3 = d0Var2;
                    str4 = str3;
                    f19 = f16;
                    e0Var2 = e0Var;
                    z18 = z15;
                    pVar2 = pVar;
                }
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new e23.p() { // from class: m92.b0
                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iT = p3.p0.t(i14 | 1);
                            int iT2 = p3.p0.t(i15);
                            c0.a(rVar, str4, f14, dVar, z17, f18, d0Var3, cVar, f19, e0Var2, z18, str2, aVar2, pVar2, qVar2, (p3.m) obj, iT, iT2, i16);
                            return Unit.INSTANCE;
                        }
                    };
                }
            }
            i39 |= 3072;
            i44 = i16 & 16384;
            if (i44 != 0) {
                i46 = i39 | 24576;
            } else {
                i45 = i39;
                if ((i15 & 24576) == 0) {
                    if ((i15 & 32768) == 0) {
                        zR = o0VarE.B(aVar);
                    } else {
                        zR = o0VarE.r(aVar);
                    }
                    i46 = i45 | (zR ? 16384 : 8192);
                } else {
                    i46 = i45;
                }
            }
            i47 = i16 & 32768;
            if (i47 != 0) {
                i46 |= 196608;
            } else if ((i15 & 196608) == 0) {
                i46 |= o0VarE.r(pVar) ? 131072 : 65536;
            }
            i48 = i16 & 65536;
            if (i48 != 0) {
                i46 |= 1572864;
            } else if ((i15 & 1572864) == 0) {
                i46 |= o0VarE.r(qVar) ? 1048576 : 524288;
            }
            i49 = i46;
            if ((i17 & 306783379) == 306783378) {
                z16 = true;
            } else {
                z16 = true;
            }
            if (o0VarE.n(i17 & 1, z16)) {
                if (i58 != 0) {
                    str5 = null;
                } else {
                    str5 = str3;
                }
                if (i18 != 0) {
                    z19 = false;
                } else {
                    z19 = z14;
                }
                if (i24 != 0) {
                    g6.f.a aVar15 = g6.f.f75994b;
                    f22 = 0;
                } else {
                    f22 = f17;
                }
                if (i26 != 0) {
                    d0Var4 = null;
                } else {
                    d0Var4 = d0Var2;
                }
                if (i28 != 0) {
                    f24 = null;
                } else {
                    f24 = f16;
                }
                if (i30 != 0) {
                    e0Var3 = e0.LINEAR;
                } else {
                    e0Var3 = e0Var;
                }
                if (i35 != 0) {
                    z24 = false;
                } else {
                    z24 = z15;
                }
                if (i44 != 0) {
                    aVar3 = null;
                } else {
                    aVar3 = aVar;
                }
                if (i47 != 0) {
                    pVar3 = null;
                } else {
                    pVar3 = pVar;
                }
                if (i48 != 0) {
                    qVar3 = null;
                } else {
                    qVar3 = qVar;
                }
                x1 x1Var12 = p3.n.f135158a;
                int i5110 = i49 << 6;
                b(rVar, str5, i53.a.j(p13.w.c(new d0(f14, dVar2, cVar, z19, f22, d0Var4, e0Var3, z24, null, null))), f24, str2, null, aVar3, pVar3, qVar3, o0VarE, (i17 & 126) | ((i17 >> 15) & 7168) | (57344 & i5110) | (458752 & i5110) | (3670016 & i5110) | (29360128 & i5110) | (i5110 & 234881024), 0);
                str4 = str5;
                f19 = f24;
                qVar2 = qVar3;
                z17 = z19;
                f18 = f22;
                d0Var3 = d0Var4;
                e0Var2 = e0Var3;
                aVar2 = aVar3;
                pVar2 = pVar3;
                z18 = z24;
            } else {
                o0VarE.e();
                z17 = z14;
                aVar2 = aVar;
                qVar2 = qVar;
                f18 = f17;
                d0Var3 = d0Var2;
                str4 = str3;
                f19 = f16;
                e0Var2 = e0Var;
                z18 = z15;
                pVar2 = pVar;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new e23.p() { // from class: m92.b0
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iT = p3.p0.t(i14 | 1);
                        int iT2 = p3.p0.t(i15);
                        c0.a(rVar, str4, f14, dVar, z17, f18, d0Var3, cVar, f19, e0Var2, z18, str2, aVar2, pVar2, qVar2, (p3.m) obj, iT, iT2, i16);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        i17 |= 24576;
        i24 = i16 & 32;
        if (i24 != 0) {
            i17 |= 196608;
            f17 = f15;
        } else {
            f17 = f15;
            if ((i14 & 196608) == 0) {
                if (o0VarE.i(f17)) {
                    i25 = 131072;
                } else {
                    i25 = 65536;
                }
                i17 |= i25;
            }
        }
        i26 = i16 & 64;
        if (i26 != 0) {
            i17 |= 1572864;
            d0Var2 = d0Var;
        } else {
            d0Var2 = d0Var;
            if ((i14 & 1572864) == 0) {
                if (o0VarE.B(d0Var2)) {
                    i27 = 1048576;
                } else {
                    i27 = 524288;
                }
                i17 |= i27;
            }
        }
        if ((i14 & 12582912) == 0) {
            if (o0VarE.B(cVar)) {
                i55 = 8388608;
            } else {
                i55 = 4194304;
            }
            i17 |= i55;
        }
        i28 = i16 & 256;
        if (i28 != 0) {
            i17 |= 100663296;
        } else if ((i14 & 100663296) == 0) {
            if (o0VarE.B(f16)) {
                i29 = 67108864;
            } else {
                i29 = 33554432;
            }
            i17 |= i29;
        }
        i30 = i16 & 512;
        if (i30 != 0) {
            if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                if (e0Var == null) {
                    iOrdinal = -1;
                } else {
                    iOrdinal = e0Var.ordinal();
                }
                if (o0VarE.k(iOrdinal)) {
                    i34 = 536870912;
                } else {
                    i34 = 268435456;
                }
                i17 |= i34;
            }
            i35 = i16 & 1024;
            if (i35 != 0) {
                i36 = i15 | 6;
            } else if ((i15 & 6) == 0) {
                if (o0VarE.h(z15)) {
                    i37 = 4;
                } else {
                    i37 = 2;
                }
                i36 = i15 | i37;
            } else {
                i36 = i15;
            }
            if ((i16 & 2048) != 0) {
                i36 |= 48;
            } else if ((i15 & 48) == 0) {
                if (o0VarE.r(null)) {
                    i38 = 32;
                } else {
                    i38 = 16;
                }
                i36 |= i38;
            }
            if ((i15 & 384) != 0) {
                if (o0VarE.B(str2)) {
                    i54 = 256;
                } else {
                    i54 = 128;
                }
                i36 |= i54;
            }
            i39 = i36;
            if ((i16 & 8192) != 0) {
                if ((i15 & 3072) == 0) {
                    i39 |= o0VarE.B(null) ? 2048 : 1024;
                }
                i44 = i16 & 16384;
                if (i44 != 0) {
                    i46 = i39 | 24576;
                } else {
                    i45 = i39;
                    if ((i15 & 24576) == 0) {
                        if ((i15 & 32768) == 0) {
                            zR = o0VarE.B(aVar);
                        } else {
                            zR = o0VarE.r(aVar);
                        }
                        i46 = i45 | (zR ? 16384 : 8192);
                    } else {
                        i46 = i45;
                    }
                }
                i47 = i16 & 32768;
                if (i47 != 0) {
                    i46 |= 196608;
                } else if ((i15 & 196608) == 0) {
                    i46 |= o0VarE.r(pVar) ? 131072 : 65536;
                }
                i48 = i16 & 65536;
                if (i48 != 0) {
                    i46 |= 1572864;
                } else if ((i15 & 1572864) == 0) {
                    i46 |= o0VarE.r(qVar) ? 1048576 : 524288;
                }
                i49 = i46;
                if ((i17 & 306783379) == 306783378) {
                    z16 = true;
                } else {
                    z16 = true;
                }
                if (o0VarE.n(i17 & 1, z16)) {
                    if (i58 != 0) {
                        str5 = null;
                    } else {
                        str5 = str3;
                    }
                    if (i18 != 0) {
                        z19 = false;
                    } else {
                        z19 = z14;
                    }
                    if (i24 != 0) {
                        g6.f.a aVar16 = g6.f.f75994b;
                        f22 = 0;
                    } else {
                        f22 = f17;
                    }
                    if (i26 != 0) {
                        d0Var4 = null;
                    } else {
                        d0Var4 = d0Var2;
                    }
                    if (i28 != 0) {
                        f24 = null;
                    } else {
                        f24 = f16;
                    }
                    if (i30 != 0) {
                        e0Var3 = e0.LINEAR;
                    } else {
                        e0Var3 = e0Var;
                    }
                    if (i35 != 0) {
                        z24 = false;
                    } else {
                        z24 = z15;
                    }
                    if (i44 != 0) {
                        aVar3 = null;
                    } else {
                        aVar3 = aVar;
                    }
                    if (i47 != 0) {
                        pVar3 = null;
                    } else {
                        pVar3 = pVar;
                    }
                    if (i48 != 0) {
                        qVar3 = null;
                    } else {
                        qVar3 = qVar;
                    }
                    x1 x1Var13 = p3.n.f135158a;
                    int i5111 = i49 << 6;
                    b(rVar, str5, i53.a.j(p13.w.c(new d0(f14, dVar2, cVar, z19, f22, d0Var4, e0Var3, z24, null, null))), f24, str2, null, aVar3, pVar3, qVar3, o0VarE, (i17 & 126) | ((i17 >> 15) & 7168) | (57344 & i5111) | (458752 & i5111) | (3670016 & i5111) | (29360128 & i5111) | (i5111 & 234881024), 0);
                    str4 = str5;
                    f19 = f24;
                    qVar2 = qVar3;
                    z17 = z19;
                    f18 = f22;
                    d0Var3 = d0Var4;
                    e0Var2 = e0Var3;
                    aVar2 = aVar3;
                    pVar2 = pVar3;
                    z18 = z24;
                } else {
                    o0VarE.e();
                    z17 = z14;
                    aVar2 = aVar;
                    qVar2 = qVar;
                    f18 = f17;
                    d0Var3 = d0Var2;
                    str4 = str3;
                    f19 = f16;
                    e0Var2 = e0Var;
                    z18 = z15;
                    pVar2 = pVar;
                }
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new e23.p() { // from class: m92.b0
                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iT = p3.p0.t(i14 | 1);
                            int iT2 = p3.p0.t(i15);
                            c0.a(rVar, str4, f14, dVar, z17, f18, d0Var3, cVar, f19, e0Var2, z18, str2, aVar2, pVar2, qVar2, (p3.m) obj, iT, iT2, i16);
                            return Unit.INSTANCE;
                        }
                    };
                }
            }
            i39 |= 3072;
            i44 = i16 & 16384;
            if (i44 != 0) {
                i46 = i39 | 24576;
            } else {
                i45 = i39;
                if ((i15 & 24576) == 0) {
                    if ((i15 & 32768) == 0) {
                        zR = o0VarE.B(aVar);
                    } else {
                        zR = o0VarE.r(aVar);
                    }
                    i46 = i45 | (zR ? 16384 : 8192);
                } else {
                    i46 = i45;
                }
            }
            i47 = i16 & 32768;
            if (i47 != 0) {
                i46 |= 196608;
            } else if ((i15 & 196608) == 0) {
                i46 |= o0VarE.r(pVar) ? 131072 : 65536;
            }
            i48 = i16 & 65536;
            if (i48 != 0) {
                i46 |= 1572864;
            } else if ((i15 & 1572864) == 0) {
                i46 |= o0VarE.r(qVar) ? 1048576 : 524288;
            }
            i49 = i46;
            if ((i17 & 306783379) == 306783378) {
                z16 = true;
            } else {
                z16 = true;
            }
            if (o0VarE.n(i17 & 1, z16)) {
                if (i58 != 0) {
                    str5 = null;
                } else {
                    str5 = str3;
                }
                if (i18 != 0) {
                    z19 = false;
                } else {
                    z19 = z14;
                }
                if (i24 != 0) {
                    g6.f.a aVar17 = g6.f.f75994b;
                    f22 = 0;
                } else {
                    f22 = f17;
                }
                if (i26 != 0) {
                    d0Var4 = null;
                } else {
                    d0Var4 = d0Var2;
                }
                if (i28 != 0) {
                    f24 = null;
                } else {
                    f24 = f16;
                }
                if (i30 != 0) {
                    e0Var3 = e0.LINEAR;
                } else {
                    e0Var3 = e0Var;
                }
                if (i35 != 0) {
                    z24 = false;
                } else {
                    z24 = z15;
                }
                if (i44 != 0) {
                    aVar3 = null;
                } else {
                    aVar3 = aVar;
                }
                if (i47 != 0) {
                    pVar3 = null;
                } else {
                    pVar3 = pVar;
                }
                if (i48 != 0) {
                    qVar3 = null;
                } else {
                    qVar3 = qVar;
                }
                x1 x1Var14 = p3.n.f135158a;
                int i5112 = i49 << 6;
                b(rVar, str5, i53.a.j(p13.w.c(new d0(f14, dVar2, cVar, z19, f22, d0Var4, e0Var3, z24, null, null))), f24, str2, null, aVar3, pVar3, qVar3, o0VarE, (i17 & 126) | ((i17 >> 15) & 7168) | (57344 & i5112) | (458752 & i5112) | (3670016 & i5112) | (29360128 & i5112) | (i5112 & 234881024), 0);
                str4 = str5;
                f19 = f24;
                qVar2 = qVar3;
                z17 = z19;
                f18 = f22;
                d0Var3 = d0Var4;
                e0Var2 = e0Var3;
                aVar2 = aVar3;
                pVar2 = pVar3;
                z18 = z24;
            } else {
                o0VarE.e();
                z17 = z14;
                aVar2 = aVar;
                qVar2 = qVar;
                f18 = f17;
                d0Var3 = d0Var2;
                str4 = str3;
                f19 = f16;
                e0Var2 = e0Var;
                z18 = z15;
                pVar2 = pVar;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new e23.p() { // from class: m92.b0
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iT = p3.p0.t(i14 | 1);
                        int iT2 = p3.p0.t(i15);
                        c0.a(rVar, str4, f14, dVar, z17, f18, d0Var3, cVar, f19, e0Var2, z18, str2, aVar2, pVar2, qVar2, (p3.m) obj, iT, iT2, i16);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        i17 |= C.ENCODING_PCM_32BIT;
        i35 = i16 & 1024;
        if (i35 != 0) {
            i36 = i15 | 6;
        } else if ((i15 & 6) == 0) {
            if (o0VarE.h(z15)) {
                i37 = 4;
            } else {
                i37 = 2;
            }
            i36 = i15 | i37;
        } else {
            i36 = i15;
        }
        if ((i16 & 2048) != 0) {
            i36 |= 48;
        } else if ((i15 & 48) == 0) {
            if (o0VarE.r(null)) {
                i38 = 32;
            } else {
                i38 = 16;
            }
            i36 |= i38;
        }
        if ((i15 & 384) != 0) {
            if (o0VarE.B(str2)) {
                i54 = 256;
            } else {
                i54 = 128;
            }
            i36 |= i54;
        }
        i39 = i36;
        if ((i16 & 8192) != 0) {
            if ((i15 & 3072) == 0) {
                i39 |= o0VarE.B(null) ? 2048 : 1024;
            }
            i44 = i16 & 16384;
            if (i44 != 0) {
                i46 = i39 | 24576;
            } else {
                i45 = i39;
                if ((i15 & 24576) == 0) {
                    if ((i15 & 32768) == 0) {
                        zR = o0VarE.B(aVar);
                    } else {
                        zR = o0VarE.r(aVar);
                    }
                    i46 = i45 | (zR ? 16384 : 8192);
                } else {
                    i46 = i45;
                }
            }
            i47 = i16 & 32768;
            if (i47 != 0) {
                i46 |= 196608;
            } else if ((i15 & 196608) == 0) {
                i46 |= o0VarE.r(pVar) ? 131072 : 65536;
            }
            i48 = i16 & 65536;
            if (i48 != 0) {
                i46 |= 1572864;
            } else if ((i15 & 1572864) == 0) {
                i46 |= o0VarE.r(qVar) ? 1048576 : 524288;
            }
            i49 = i46;
            if ((i17 & 306783379) == 306783378) {
                z16 = true;
            } else {
                z16 = true;
            }
            if (o0VarE.n(i17 & 1, z16)) {
                if (i58 != 0) {
                    str5 = null;
                } else {
                    str5 = str3;
                }
                if (i18 != 0) {
                    z19 = false;
                } else {
                    z19 = z14;
                }
                if (i24 != 0) {
                    g6.f.a aVar18 = g6.f.f75994b;
                    f22 = 0;
                } else {
                    f22 = f17;
                }
                if (i26 != 0) {
                    d0Var4 = null;
                } else {
                    d0Var4 = d0Var2;
                }
                if (i28 != 0) {
                    f24 = null;
                } else {
                    f24 = f16;
                }
                if (i30 != 0) {
                    e0Var3 = e0.LINEAR;
                } else {
                    e0Var3 = e0Var;
                }
                if (i35 != 0) {
                    z24 = false;
                } else {
                    z24 = z15;
                }
                if (i44 != 0) {
                    aVar3 = null;
                } else {
                    aVar3 = aVar;
                }
                if (i47 != 0) {
                    pVar3 = null;
                } else {
                    pVar3 = pVar;
                }
                if (i48 != 0) {
                    qVar3 = null;
                } else {
                    qVar3 = qVar;
                }
                x1 x1Var15 = p3.n.f135158a;
                int i5113 = i49 << 6;
                b(rVar, str5, i53.a.j(p13.w.c(new d0(f14, dVar2, cVar, z19, f22, d0Var4, e0Var3, z24, null, null))), f24, str2, null, aVar3, pVar3, qVar3, o0VarE, (i17 & 126) | ((i17 >> 15) & 7168) | (57344 & i5113) | (458752 & i5113) | (3670016 & i5113) | (29360128 & i5113) | (i5113 & 234881024), 0);
                str4 = str5;
                f19 = f24;
                qVar2 = qVar3;
                z17 = z19;
                f18 = f22;
                d0Var3 = d0Var4;
                e0Var2 = e0Var3;
                aVar2 = aVar3;
                pVar2 = pVar3;
                z18 = z24;
            } else {
                o0VarE.e();
                z17 = z14;
                aVar2 = aVar;
                qVar2 = qVar;
                f18 = f17;
                d0Var3 = d0Var2;
                str4 = str3;
                f19 = f16;
                e0Var2 = e0Var;
                z18 = z15;
                pVar2 = pVar;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new e23.p() { // from class: m92.b0
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iT = p3.p0.t(i14 | 1);
                        int iT2 = p3.p0.t(i15);
                        c0.a(rVar, str4, f14, dVar, z17, f18, d0Var3, cVar, f19, e0Var2, z18, str2, aVar2, pVar2, qVar2, (p3.m) obj, iT, iT2, i16);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        i39 |= 3072;
        i44 = i16 & 16384;
        if (i44 != 0) {
            i46 = i39 | 24576;
        } else {
            i45 = i39;
            if ((i15 & 24576) == 0) {
                if ((i15 & 32768) == 0) {
                    zR = o0VarE.B(aVar);
                } else {
                    zR = o0VarE.r(aVar);
                }
                i46 = i45 | (zR ? 16384 : 8192);
            } else {
                i46 = i45;
            }
        }
        i47 = i16 & 32768;
        if (i47 != 0) {
            i46 |= 196608;
        } else if ((i15 & 196608) == 0) {
            i46 |= o0VarE.r(pVar) ? 131072 : 65536;
        }
        i48 = i16 & 65536;
        if (i48 != 0) {
            i46 |= 1572864;
        } else if ((i15 & 1572864) == 0) {
            i46 |= o0VarE.r(qVar) ? 1048576 : 524288;
        }
        i49 = i46;
        if ((i17 & 306783379) == 306783378) {
            z16 = true;
        } else {
            z16 = true;
        }
        if (o0VarE.n(i17 & 1, z16)) {
            if (i58 != 0) {
                str5 = null;
            } else {
                str5 = str3;
            }
            if (i18 != 0) {
                z19 = false;
            } else {
                z19 = z14;
            }
            if (i24 != 0) {
                g6.f.a aVar19 = g6.f.f75994b;
                f22 = 0;
            } else {
                f22 = f17;
            }
            if (i26 != 0) {
                d0Var4 = null;
            } else {
                d0Var4 = d0Var2;
            }
            if (i28 != 0) {
                f24 = null;
            } else {
                f24 = f16;
            }
            if (i30 != 0) {
                e0Var3 = e0.LINEAR;
            } else {
                e0Var3 = e0Var;
            }
            if (i35 != 0) {
                z24 = false;
            } else {
                z24 = z15;
            }
            if (i44 != 0) {
                aVar3 = null;
            } else {
                aVar3 = aVar;
            }
            if (i47 != 0) {
                pVar3 = null;
            } else {
                pVar3 = pVar;
            }
            if (i48 != 0) {
                qVar3 = null;
            } else {
                qVar3 = qVar;
            }
            x1 x1Var16 = p3.n.f135158a;
            int i5114 = i49 << 6;
            b(rVar, str5, i53.a.j(p13.w.c(new d0(f14, dVar2, cVar, z19, f22, d0Var4, e0Var3, z24, null, null))), f24, str2, null, aVar3, pVar3, qVar3, o0VarE, (i17 & 126) | ((i17 >> 15) & 7168) | (57344 & i5114) | (458752 & i5114) | (3670016 & i5114) | (29360128 & i5114) | (i5114 & 234881024), 0);
            str4 = str5;
            f19 = f24;
            qVar2 = qVar3;
            z17 = z19;
            f18 = f22;
            d0Var3 = d0Var4;
            e0Var2 = e0Var3;
            aVar2 = aVar3;
            pVar2 = pVar3;
            z18 = z24;
        } else {
            o0VarE.e();
            z17 = z14;
            aVar2 = aVar;
            qVar2 = qVar;
            f18 = f17;
            d0Var3 = d0Var2;
            str4 = str3;
            f19 = f16;
            e0Var2 = e0Var;
            z18 = z15;
            pVar2 = pVar;
        }
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p() { // from class: m92.b0
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iT = p3.p0.t(i14 | 1);
                    int iT2 = p3.p0.t(i15);
                    c0.a(rVar, str4, f14, dVar, z17, f18, d0Var3, cVar, f19, e0Var2, z18, str2, aVar2, pVar2, qVar2, (p3.m) obj, iT, iT2, i16);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0140  */
    /* JADX WARN: Code duplicated, block: B:103:0x0152  */
    /* JADX WARN: Code duplicated, block: B:107:0x0170  */
    /* JADX WARN: Code duplicated, block: B:109:0x0174  */
    /* JADX WARN: Code duplicated, block: B:111:0x0184  */
    /* JADX WARN: Code duplicated, block: B:114:0x0196  */
    /* JADX WARN: Code duplicated, block: B:120:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:122:0x01bf A[EDGE_INSN: B:122:0x01bf->B:129:0x01db BREAK  A[LOOP:0: B:124:0x01c6->B:161:?]] */
    /* JADX WARN: Code duplicated, block: B:123:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:126:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:131:0x01de  */
    /* JADX WARN: Code duplicated, block: B:132:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:135:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:136:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:145:0x0207  */
    /* JADX WARN: Code duplicated, block: B:148:0x0210  */
    /* JADX WARN: Code duplicated, block: B:150:0x0219  */
    /* JADX WARN: Code duplicated, block: B:152:0x024f  */
    /* JADX WARN: Code duplicated, block: B:154:0x0253  */
    /* JADX WARN: Code duplicated, block: B:157:0x025d  */
    /* JADX WARN: Code duplicated, block: B:159:0x01bf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:160:0x01da A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:161:? A[LOOP:0: B:124:0x01c6->B:161:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:163:0x0164 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:165:0x014c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:168:0x01a8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:170:0x0190 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:172:0x0116 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:173:0x012c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:174:? A[LOOP:3: B:92:0x011c->B:174:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:175:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x0092  */
    /* JADX WARN: Code duplicated, block: B:54:0x0096  */
    /* JADX WARN: Code duplicated, block: B:55:0x009b  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:67:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:72:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:73:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:82:0x00ef A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:83:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:87:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:88:0x0110  */
    /* JADX WARN: Code duplicated, block: B:90:0x0116 A[EDGE_INSN: B:90:0x0116->B:97:0x012e BREAK  A[LOOP:3: B:92:0x011c->B:174:?]] */
    /* JADX WARN: Code duplicated, block: B:91:0x0118  */
    /* JADX WARN: Code duplicated, block: B:94:0x0122  */
    /* JADX WARN: Code duplicated, block: B:98:0x0130  */
    public static final void b(h4.r rVar, String str, i53.c<d0> cVar, Float f14, String str2, g6.f fVar, n92.a aVar, e23.p<? super p3.m, ? super Integer, Unit> pVar, e23.q<? super Float, ? super p3.m, ? super Integer, Unit> qVar, p3.m mVar, int i14, int i15) {
        int i16;
        String str3;
        g6.f fVar2;
        e23.p<? super p3.m, ? super Integer, Unit> pVar2;
        e23.q<? super Float, ? super p3.m, ? super Integer, Unit> qVar2;
        boolean z14;
        g6.f fVar3;
        p2 p2VarI0;
        g6.f fVar4;
        Iterator<d0> it;
        boolean z15;
        Iterator<d0> it3;
        g6.f fVarA;
        float fA;
        g6.f fVarA2;
        Iterator<d0> it4;
        g6.f fVarA3;
        g6.f fVarA4;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        Object objQ;
        Iterator<d0> it5;
        boolean z24;
        int i17;
        int i18;
        boolean zR;
        int i19;
        cVar.getClass();
        str2.getClass();
        p3.o0 o0VarE = mVar.E(1578163791);
        if ((i14 & 6) == 0) {
            i16 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= o0VarE.B(str) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= o0VarE.r(cVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i16 |= o0VarE.B(f14) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            str3 = str2;
            i16 |= o0VarE.B(str3) ? 16384 : 8192;
        } else {
            str3 = str2;
        }
        int i24 = i15 & 32;
        if (i24 == 0) {
            if ((196608 & i14) == 0) {
                fVar2 = fVar;
                i16 |= o0VarE.B(fVar2) ? 131072 : 65536;
            }
            if ((1572864 & i14) == 0) {
                if ((i14 & 2097152) == 0) {
                    zR = o0VarE.B(aVar);
                } else {
                    zR = o0VarE.r(aVar);
                }
                if (zR) {
                    i19 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                } else {
                    i19 = 524288;
                }
                i16 |= i19;
            }
            if ((12582912 & i14) == 0) {
                pVar2 = pVar;
                if (o0VarE.r(pVar2)) {
                    i18 = 8388608;
                } else {
                    i18 = 4194304;
                }
                i16 |= i18;
            } else {
                pVar2 = pVar;
            }
            if ((100663296 & i14) == 0) {
                qVar2 = qVar;
                if (o0VarE.r(qVar2)) {
                    i17 = 67108864;
                } else {
                    i17 = 33554432;
                }
                i16 |= i17;
            } else {
                qVar2 = qVar;
            }
            if ((i16 & 38347923) != 38347922) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i16 & 1, z14)) {
                if (i24 != 0) {
                    fVar4 = null;
                } else {
                    fVar4 = fVar2;
                }
                x1 x1Var = p3.n.f135158a;
                if (cVar.isEmpty()) {
                    o0VarE.C(-1929088908);
                    g6.f.a aVar2 = g6.f.f75994b;
                    fA = o92.c.a((float) 1.5d, o0VarE);
                    o0VarE.g0(false);
                } else {
                    if (cVar.isEmpty()) {
                        it = cVar.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                z15 = false;
                                break;
                            } else if (it.next().f117282d) {
                                z15 = true;
                                break;
                            }
                        }
                    } else {
                        z15 = false;
                        break;
                    }
                    if (z15) {
                        o0VarE.C(-1929013795);
                        it4 = cVar.iterator();
                        if (it4.hasNext()) {
                            c22.t.g();
                            return;
                        }
                        fVarA3 = g6.f.a(it4.next().f117283e);
                        while (it4.hasNext()) {
                            fVarA4 = g6.f.a(it4.next().f117283e);
                            if (fVarA3.compareTo(fVarA4) < 0) {
                                fVarA3 = fVarA4;
                            }
                        }
                        fA = o92.c.a(fVarA3.f75997a, o0VarE);
                        o0VarE.g0(false);
                    } else {
                        o0VarE.C(-1928954213);
                        it3 = cVar.iterator();
                        if (it3.hasNext()) {
                            c22.t.g();
                            return;
                        }
                        fVarA = g6.f.a(it3.next().f117279a);
                        while (it3.hasNext()) {
                            fVarA2 = g6.f.a(it3.next().f117279a);
                            if (fVarA.compareTo(fVarA2) < 0) {
                                fVarA = fVarA2;
                            }
                        }
                        fA = o92.c.a(fVarA.f75997a, o0VarE);
                        o0VarE.g0(false);
                    }
                }
                if (cVar.isEmpty()) {
                    z16 = true;
                } else {
                    if (cVar.isEmpty()) {
                        it5 = cVar.iterator();
                        while (true) {
                            if (it5.hasNext()) {
                                z24 = true;
                                break;
                            } else if (!it5.next().f117281c.isEmpty()) {
                                z24 = false;
                                break;
                            }
                        }
                    } else {
                        z24 = true;
                        break;
                    }
                    if (z24) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                }
                boolean zR2 = o0VarE.r(cVar);
                if ((i16 & 7168) == 2048) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                boolean z25 = z17 | zR2;
                if ((3670016 & i16) != 1048576 || ((i16 & 2097152) != 0 && o0VarE.r(aVar))) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                z19 = z25 | z18;
                objQ = o0VarE.q();
                if (z19) {
                    objQ = new ls0.h(cVar, 7, f14, aVar);
                    o0VarE.K(objQ);
                } else {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new ls0.h(cVar, 7, f14, aVar);
                        o0VarE.K(objQ);
                    }
                }
                int i25 = (i16 & 126) | ((i16 >> 9) & 896) | ((i16 >> 3) & 7168);
                int i26 = i16 << 3;
                g6.f fVar5 = fVar4;
                l.b(rVar, str, fVar5, str3, z16, fA, aVar, pVar2, qVar2, (e23.l) objQ, o0VarE, i25 | (29360128 & i26) | (234881024 & i26) | (i26 & 1879048192), 64);
                x1 x1Var2 = p3.n.f135158a;
                fVar3 = fVar5;
            } else {
                o0VarE.e();
                fVar3 = fVar2;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new h02.c(rVar, str, cVar, f14, str2, fVar3, aVar, pVar, qVar, i14, i15);
            }
        }
        i16 |= 196608;
        fVar2 = fVar;
        if ((1572864 & i14) == 0) {
            if ((i14 & 2097152) == 0) {
                zR = o0VarE.B(aVar);
            } else {
                zR = o0VarE.r(aVar);
            }
            if (zR) {
                i19 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
            } else {
                i19 = 524288;
            }
            i16 |= i19;
        }
        if ((12582912 & i14) == 0) {
            pVar2 = pVar;
            if (o0VarE.r(pVar2)) {
                i18 = 8388608;
            } else {
                i18 = 4194304;
            }
            i16 |= i18;
        } else {
            pVar2 = pVar;
        }
        if ((100663296 & i14) == 0) {
            qVar2 = qVar;
            if (o0VarE.r(qVar2)) {
                i17 = 67108864;
            } else {
                i17 = 33554432;
            }
            i16 |= i17;
        } else {
            qVar2 = qVar;
        }
        if ((i16 & 38347923) != 38347922) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (o0VarE.n(i16 & 1, z14)) {
            if (i24 != 0) {
                fVar4 = null;
            } else {
                fVar4 = fVar2;
            }
            x1 x1Var3 = p3.n.f135158a;
            if (cVar.isEmpty()) {
                o0VarE.C(-1929088908);
                g6.f.a aVar3 = g6.f.f75994b;
                fA = o92.c.a((float) 1.5d, o0VarE);
                o0VarE.g0(false);
            } else {
                if (cVar.isEmpty()) {
                    it = cVar.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            z15 = false;
                            break;
                        } else if (it.next().f117282d) {
                            z15 = true;
                            break;
                        }
                    }
                } else {
                    z15 = false;
                    break;
                }
                if (z15) {
                    o0VarE.C(-1929013795);
                    it4 = cVar.iterator();
                    if (it4.hasNext()) {
                        c22.t.g();
                        return;
                    }
                    fVarA3 = g6.f.a(it4.next().f117283e);
                    while (it4.hasNext()) {
                        fVarA4 = g6.f.a(it4.next().f117283e);
                        if (fVarA3.compareTo(fVarA4) < 0) {
                            fVarA3 = fVarA4;
                        }
                    }
                    fA = o92.c.a(fVarA3.f75997a, o0VarE);
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(-1928954213);
                    it3 = cVar.iterator();
                    if (it3.hasNext()) {
                        c22.t.g();
                        return;
                    }
                    fVarA = g6.f.a(it3.next().f117279a);
                    while (it3.hasNext()) {
                        fVarA2 = g6.f.a(it3.next().f117279a);
                        if (fVarA.compareTo(fVarA2) < 0) {
                            fVarA = fVarA2;
                        }
                    }
                    fA = o92.c.a(fVarA.f75997a, o0VarE);
                    o0VarE.g0(false);
                }
            }
            if (cVar.isEmpty()) {
                z16 = true;
            } else {
                if (cVar.isEmpty()) {
                    it5 = cVar.iterator();
                    while (true) {
                        if (it5.hasNext()) {
                            z24 = true;
                            break;
                        } else if (!it5.next().f117281c.isEmpty()) {
                            z24 = false;
                            break;
                        }
                    }
                } else {
                    z24 = true;
                    break;
                }
                if (z24) {
                    z16 = true;
                } else {
                    z16 = false;
                }
            }
            boolean zR3 = o0VarE.r(cVar);
            if ((i16 & 7168) == 2048) {
                z17 = true;
            } else {
                z17 = false;
            }
            boolean z26 = z17 | zR3;
            if ((3670016 & i16) != 1048576) {
                z18 = true;
            } else {
                z18 = true;
            }
            z19 = z26 | z18;
            objQ = o0VarE.q();
            if (z19) {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new ls0.h(cVar, 7, f14, aVar);
                    o0VarE.K(objQ);
                }
            } else {
                objQ = new ls0.h(cVar, 7, f14, aVar);
                o0VarE.K(objQ);
            }
            int i27 = (i16 & 126) | ((i16 >> 9) & 896) | ((i16 >> 3) & 7168);
            int i28 = i16 << 3;
            g6.f fVar6 = fVar4;
            l.b(rVar, str, fVar6, str3, z16, fA, aVar, pVar2, qVar2, (e23.l) objQ, o0VarE, i27 | (29360128 & i28) | (234881024 & i28) | (i28 & 1879048192), 64);
            x1 x1Var4 = p3.n.f135158a;
            fVar3 = fVar6;
        } else {
            o0VarE.e();
            fVar3 = fVar2;
        }
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new h02.c(rVar, str, cVar, f14, str2, fVar3, aVar, pVar, qVar, i14, i15);
        }
    }

    public static final void c(final h4.r rVar, final float f14, final m.d dVar, final i53.c cVar, float f15, e0 e0Var, final Float f16, boolean z14, final String str, p3.m mVar, final int i14) {
        final float f17;
        final e0 e0Var2;
        final boolean z15;
        cVar.getClass();
        str.getClass();
        p3.o0 o0VarE = mVar.E(2019354386);
        int i15 = i14 | (o0VarE.i(f14) ? 32 : 16) | (o0VarE.B(dVar) ? 256 : 128) | (o0VarE.B(cVar) ? 2048 : 1024) | 918773760;
        int i16 = (o0VarE.B(str) ? 4 : 2) | 48;
        if (o0VarE.n(i15 & 1, ((306783379 & i15) == 306783378 && (i16 & 19) == 18) ? false : true)) {
            f17 = 0;
            g6.f.a aVar = g6.f.f75994b;
            e0 e0Var3 = e0.LINEAR;
            x1 x1Var = p3.n.f135158a;
            int i17 = i15 << 3;
            a(rVar, null, f14, dVar, cVar.size() == 1, f17, o4.d0.a(dVar.f117408a), cVar, f16, e0Var3, false, str, null, null, null, o0VarE, ((i15 << 12) & 29360128) | (i17 & 7168) | (i17 & 896) | 6 | 196608 | 905969664, ((i16 << 6) & 896) | 3126, 114690);
            e0Var2 = e0Var3;
            z15 = true;
        } else {
            o0VarE.e();
            f17 = f15;
            e0Var2 = e0Var;
            z15 = z14;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p(f14, dVar, cVar, f17, e0Var2, f16, z15, str, i14) { // from class: m92.a0

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ float f117229b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ m.d f117230c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ i53.c f117231d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ float f117232e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ e0 f117233f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public final /* synthetic */ Float f117234g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                public final /* synthetic */ boolean f117235h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                public final /* synthetic */ String f117236i;

                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iT = p3.p0.t(1572871);
                    c0.c(this.f117228a, this.f117229b, this.f117230c, this.f117231d, this.f117232e, this.f117233f, this.f117234g, this.f117235h, this.f117236i, (p3.m) obj, iT);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final o4.j d(ArrayList arrayList, e0 e0Var) throws Throwable {
        Throwable th3;
        e0Var.getClass();
        o4.j jVarA = o4.m.a();
        int i14 = 0;
        float f14 = (arrayList.isEmpty() || arrayList.size() <= 1) ? 0.0f : ((h0.e.a) arrayList.get(1)).f117346a - ((h0.e.a) arrayList.get(0)).f117346a;
        int i15 = a.f117278a[e0Var.ordinal()];
        Throwable th4 = null;
        if (i15 == 1) {
            for (Object obj : arrayList) {
                int i16 = i14 + 1;
                if (i14 < 0) {
                    p13.x.q();
                    throw null;
                }
                h0.e.a aVar = (h0.e.a) obj;
                if (i14 != 0) {
                    jVarA.c(aVar.f117346a, aVar.f117347b);
                } else if (arrayList.size() == 1) {
                    float f15 = aVar.f117346a;
                    float f16 = aVar.f117347b;
                    jVarA.a(f15 - 4.0f, f16);
                    jVarA.c(aVar.f117346a + 7.0f, f16);
                } else {
                    jVarA.a(aVar.f117346a, aVar.f117347b);
                }
                i14 = i16;
            }
        } else if (i15 == 2) {
            for (Object obj2 : arrayList) {
                int i17 = i14 + 1;
                if (i14 < 0) {
                    p13.x.q();
                    throw null;
                }
                h0.e.a aVar2 = (h0.e.a) obj2;
                if (i14 != 0) {
                    float f17 = aVar2.f117346a;
                    float f18 = aVar2.f117347b;
                    jVarA.c(f17, f18);
                    if (i14 < arrayList.size() - 1) {
                        jVarA.c(f17 + f14, f18);
                    }
                    if (i14 == arrayList.size() - 1) {
                        jVarA.c((f14 / 1.7f) + f17, f18);
                    }
                } else if (arrayList.size() == 1) {
                    float f19 = aVar2.f117346a;
                    float f22 = aVar2.f117347b;
                    jVarA.a((3 * 12.0f) + f19, f22);
                    jVarA.c((5 * 12.0f) + aVar2.f117346a, f22);
                } else {
                    float f24 = aVar2.f117346a;
                    float f25 = aVar2.f117347b;
                    jVarA.a((f14 / 2) + f24, f25);
                    jVarA.c(aVar2.f117346a + f14, f25);
                }
                i14 = i17;
            }
        } else if (i15 == 3) {
            float f26 = f14;
            for (Object obj3 : arrayList) {
                int i18 = i14 + 1;
                if (i14 < 0) {
                    Throwable th5 = th4;
                    p13.x.q();
                    throw th5;
                }
                h0.e.a aVar3 = (h0.e.a) obj3;
                if (i14 == 0) {
                    if (arrayList.size() == 1) {
                        float f27 = aVar3.f117346a;
                        float f28 = aVar3.f117347b;
                        jVarA.a((3 * 12.0f) + f27, f28);
                        jVarA.c((5 * 12.0f) + aVar3.f117346a, f28);
                    } else {
                        float f29 = aVar3.f117346a;
                        float f34 = aVar3.f117347b;
                        jVarA.a(f29, f34);
                        jVarA.c((f14 / 2) + aVar3.f117346a, f34);
                    }
                    th3 = th4;
                } else {
                    float f35 = i14 <= arrayList.size() - 2 ? ((h0.e.a) arrayList.get(i18)).f117346a - ((h0.e.a) arrayList.get(i14)).f117346a : f14;
                    if (i14 < arrayList.size() - 1) {
                        float f36 = aVar3.f117346a;
                        float f37 = aVar3.f117347b;
                        th3 = th4;
                        float f38 = 2;
                        jVarA.c(f36 - (f26 / f38), f37);
                        jVarA.c((f35 / f38) + aVar3.f117346a, f37);
                        f26 = f35;
                    } else {
                        th3 = th4;
                        if (i14 == arrayList.size() - 1) {
                            float f39 = aVar3.f117346a;
                            float f44 = aVar3.f117347b;
                            jVarA.c(f39 - (f26 / 2), f44);
                            jVarA.c(aVar3.f117346a, f44);
                        }
                    }
                }
                th4 = th3;
                i14 = i18;
            }
        } else if (i15 == 4) {
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            int size = arrayList.size();
            for (int i19 = 1; i19 < size; i19++) {
                int i24 = i19 - 1;
                float f45 = 2;
                arrayList2.add(new h0.e.a((((h0.e.a) arrayList.get(i19)).f117346a + ((h0.e.a) arrayList.get(i24)).f117346a) / f45, ((h0.e.a) arrayList.get(i24)).f117347b));
                arrayList3.add(new h0.e.a((((h0.e.a) arrayList.get(i19)).f117346a + ((h0.e.a) arrayList.get(i24)).f117346a) / f45, ((h0.e.a) arrayList.get(i19)).f117347b));
            }
            jVarA.a(((h0.e.a) p13.h0.b0(arrayList)).f117346a, ((h0.e.a) p13.h0.b0(arrayList)).f117347b);
            int size2 = arrayList.size() - 1;
            while (i14 < size2) {
                int i25 = i14 + 1;
                jVarA.b(i0.b((h0.e) arrayList2.get(i14)), i0.e((h0.e) arrayList2.get(i14)), i0.b((h0.e) arrayList3.get(i14)), i0.e((h0.e) arrayList3.get(i14)), ((h0.e.a) arrayList.get(i25)).f117346a, ((h0.e.a) arrayList.get(i25)).f117347b);
                i14 = i25;
            }
        } else {
            if (i15 != 5) {
                u0.r();
                return null;
            }
            ArrayList arrayList4 = new ArrayList();
            int i26 = 0;
            for (Object obj4 : arrayList) {
                int i27 = i26 + 1;
                if (i26 < 0) {
                    p13.x.q();
                    throw null;
                }
                h0.e.a aVar4 = (h0.e.a) obj4;
                if (arrayList4.isEmpty()) {
                    arrayList4.add(aVar4);
                } else {
                    h0.e.a aVar5 = (h0.e.a) arrayList.get(i26 - 1);
                    if (i26 < arrayList.size() - 1) {
                        h0.e.a aVar6 = (h0.e.a) arrayList.get(i27);
                        float f46 = aVar4.f117347b;
                        float f47 = aVar5.f117347b;
                        if ((f46 >= f47 && f46 >= aVar6.f117347b) || (f46 <= f47 && f46 <= aVar6.f117347b)) {
                            arrayList4.add(aVar4);
                        }
                    } else {
                        arrayList4.add(aVar4);
                    }
                }
                i26 = i27;
            }
            ArrayList arrayList5 = new ArrayList();
            ArrayList arrayList6 = new ArrayList();
            int size3 = arrayList4.size();
            for (int i28 = 1; i28 < size3; i28++) {
                int i29 = i28 - 1;
                float f48 = 2;
                arrayList5.add(new h0.e.a((((h0.e.a) arrayList4.get(i28)).f117346a + ((h0.e.a) arrayList4.get(i29)).f117346a) / f48, ((h0.e.a) arrayList4.get(i29)).f117347b));
                arrayList6.add(new h0.e.a((((h0.e.a) arrayList4.get(i28)).f117346a + ((h0.e.a) arrayList4.get(i29)).f117346a) / f48, ((h0.e.a) arrayList4.get(i28)).f117347b));
            }
            jVarA.a(((h0.e.a) p13.h0.b0(arrayList4)).f117346a, ((h0.e.a) p13.h0.b0(arrayList4)).f117347b);
            int size4 = arrayList4.size() - 1;
            while (i14 < size4) {
                int i30 = i14 + 1;
                o4.j jVar = jVarA;
                jVar.b(i0.b((h0.e) arrayList5.get(i14)), i0.e((h0.e) arrayList5.get(i14)), i0.b((h0.e) arrayList6.get(i14)), i0.e((h0.e) arrayList6.get(i14)), ((h0.e.a) arrayList4.get(i30)).f117346a, ((h0.e.a) arrayList4.get(i30)).f117347b);
                jVarA = jVar;
                i14 = i30;
            }
        }
        return jVarA;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01a8 A[LOOP:1: B:100:0x01a2->B:102:0x01a8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:105:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:107:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:109:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:111:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:113:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:64:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d3 A[LOOP:4: B:67:0x00cd->B:69:0x00d3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:72:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:73:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:75:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:78:0x0101 A[LOOP:3: B:76:0x00fb->B:78:0x0101, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:81:0x0111  */
    /* JADX WARN: Code duplicated, block: B:82:0x0117  */
    /* JADX WARN: Code duplicated, block: B:84:0x0121  */
    /* JADX WARN: Code duplicated, block: B:87:0x012f A[LOOP:2: B:85:0x0129->B:87:0x012f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:90:0x013f  */
    /* JADX WARN: Code duplicated, block: B:92:0x014c  */
    /* JADX WARN: Code duplicated, block: B:95:0x0167 A[LOOP:0: B:93:0x0161->B:95:0x0167, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:99:0x019c  */
    public static i53.g e(q4.f fVar, float f14, m mVar, boolean z14, float f15, m mVar2, o4.d0 d0Var, List list, Float f16, Float f17, Float f18, Float f19, Float f22, e0 e0Var, boolean z15, g1 g1Var, int i14) {
        float f24;
        float f25;
        float fFloatValue;
        Iterator it;
        float fMax;
        float f26;
        float fFloatValue2;
        Iterator it3;
        float fMin;
        float fFloatValue3;
        Iterator it4;
        float fMax2;
        float fFloatValue4;
        ArrayList arrayListM;
        Iterator<E> it5;
        Iterator it6;
        boolean z16 = (i14 & 4) != 0 ? false : z14;
        if ((i14 & 8) != 0) {
            g6.f.a aVar = g6.f.f75994b;
            f24 = 0;
        } else {
            f24 = f15;
        }
        Object next = null;
        m mVar3 = (i14 & 16) != 0 ? null : mVar2;
        o4.d0 d0Var2 = (i14 & 32) != 0 ? null : d0Var;
        Float f27 = (i14 & 128) != 0 ? null : f16;
        Float f28 = (i14 & 256) != 0 ? null : f17;
        Float f29 = (i14 & 512) != 0 ? null : f18;
        e0 e0Var2 = (i14 & 4096) != 0 ? e0.LINEAR : e0Var;
        boolean z17 = (i14 & 8192) != 0 ? false : z15;
        g1 g1Var2 = (i14 & 16384) != 0 ? null : g1Var;
        fVar.getClass();
        mVar.getClass();
        list.getClass();
        e0Var2.getClass();
        if (list.isEmpty()) {
            return i53.a.c();
        }
        if (f28 == null) {
            if (f27 != null) {
                fFloatValue = 0.0f;
            } else {
                Iterator it7 = list.iterator();
                if (!it7.hasNext()) {
                    c22.t.g();
                    return null;
                }
                float fMin2 = ((h0.e.a) it7.next()).f117346a;
                while (it7.hasNext()) {
                    fMin2 = Math.min(fMin2, ((h0.e.a) it7.next()).f117346a);
                }
                f25 = fMin2;
            }
            if (f29 != null) {
                if (f27 != null) {
                    fFloatValue2 = f27.floatValue() - 1;
                } else {
                    it = list.iterator();
                    if (it.hasNext()) {
                        c22.t.g();
                        return null;
                    }
                    fMax = ((h0.e.a) it.next()).f117346a;
                    while (it.hasNext()) {
                        fMax = Math.max(fMax, ((h0.e.a) it.next()).f117346a);
                    }
                    f26 = fMax;
                }
                if (f19 != null) {
                    fFloatValue3 = f19.floatValue();
                } else {
                    it3 = list.iterator();
                    if (it3.hasNext()) {
                        c22.t.g();
                        return null;
                    }
                    fMin = ((h0.e.a) it3.next()).f117347b;
                    while (it3.hasNext()) {
                        fMin = Math.min(fMin, ((h0.e.a) it3.next()).f117347b);
                    }
                    fFloatValue3 = fMin;
                }
                if (f22 != null) {
                    fFloatValue4 = f22.floatValue();
                } else {
                    it4 = list.iterator();
                    if (it4.hasNext()) {
                        c22.t.g();
                        return null;
                    }
                    fMax2 = ((h0.e.a) it4.next()).f117347b;
                    while (it4.hasNext()) {
                        fMax2 = Math.max(fMax2, ((h0.e.a) it4.next()).f117347b);
                    }
                    fFloatValue4 = fMax2;
                }
                if (!z17) {
                    return f(fVar, f14, mVar, z16, f24, d0Var2, mVar3, list, f25, f26, fFloatValue3, fFloatValue4, e0Var2, g1Var2);
                }
                i53.c cVarG = g(list);
                p13.k0 k0Var = p13.k0.f134949a;
                k0Var.getClass();
                arrayListM = p13.x.m(k0Var);
                it5 = cVarG.iterator();
                while (it5.hasNext()) {
                    arrayListM.add(f(fVar, f14, mVar, z16, f24, d0Var2, mVar3, (i53.c) it5.next(), f25, f26, fFloatValue3, fFloatValue4, e0Var2, g1Var2));
                }
                it6 = arrayListM.iterator();
                if (it6.hasNext()) {
                    next = it6.next();
                    while (it6.hasNext()) {
                        next = p13.u0.h((Map) next, (Map) it6.next());
                    }
                }
                Map map = (Map) next;
                return map != null ? i53.a.k(map) : i53.a.c();
            }
            fFloatValue2 = f29.floatValue();
            f26 = fFloatValue2;
            if (f19 != null) {
                fFloatValue3 = f19.floatValue();
            } else {
                it3 = list.iterator();
                if (it3.hasNext()) {
                    c22.t.g();
                    return null;
                }
                fMin = ((h0.e.a) it3.next()).f117347b;
                while (it3.hasNext()) {
                    fMin = Math.min(fMin, ((h0.e.a) it3.next()).f117347b);
                }
                fFloatValue3 = fMin;
            }
            if (f22 != null) {
                fFloatValue4 = f22.floatValue();
            } else {
                it4 = list.iterator();
                if (it4.hasNext()) {
                    c22.t.g();
                    return null;
                }
                fMax2 = ((h0.e.a) it4.next()).f117347b;
                while (it4.hasNext()) {
                    fMax2 = Math.max(fMax2, ((h0.e.a) it4.next()).f117347b);
                }
                fFloatValue4 = fMax2;
            }
            if (!z17) {
                return f(fVar, f14, mVar, z16, f24, d0Var2, mVar3, list, f25, f26, fFloatValue3, fFloatValue4, e0Var2, g1Var2);
            }
            i53.c cVarG2 = g(list);
            p13.k0 k0Var2 = p13.k0.f134949a;
            k0Var2.getClass();
            arrayListM = p13.x.m(k0Var2);
            it5 = cVarG2.iterator();
            while (it5.hasNext()) {
                arrayListM.add(f(fVar, f14, mVar, z16, f24, d0Var2, mVar3, (i53.c) it5.next(), f25, f26, fFloatValue3, fFloatValue4, e0Var2, g1Var2));
            }
            it6 = arrayListM.iterator();
            if (it6.hasNext()) {
                next = it6.next();
                while (it6.hasNext()) {
                    next = p13.u0.h((Map) next, (Map) it6.next());
                }
            }
            Map map2 = (Map) next;
            if (map2 != null) {
            }
        }
        fFloatValue = f28.floatValue();
        f25 = fFloatValue;
        if (f29 != null) {
            if (f27 != null) {
                fFloatValue2 = f27.floatValue() - 1;
            } else {
                it = list.iterator();
                if (it.hasNext()) {
                    c22.t.g();
                    return null;
                }
                fMax = ((h0.e.a) it.next()).f117346a;
                while (it.hasNext()) {
                    fMax = Math.max(fMax, ((h0.e.a) it.next()).f117346a);
                }
                f26 = fMax;
            }
            if (f19 != null) {
                fFloatValue3 = f19.floatValue();
            } else {
                it3 = list.iterator();
                if (it3.hasNext()) {
                    c22.t.g();
                    return null;
                }
                fMin = ((h0.e.a) it3.next()).f117347b;
                while (it3.hasNext()) {
                    fMin = Math.min(fMin, ((h0.e.a) it3.next()).f117347b);
                }
                fFloatValue3 = fMin;
            }
            if (f22 != null) {
                fFloatValue4 = f22.floatValue();
            } else {
                it4 = list.iterator();
                if (it4.hasNext()) {
                    c22.t.g();
                    return null;
                }
                fMax2 = ((h0.e.a) it4.next()).f117347b;
                while (it4.hasNext()) {
                    fMax2 = Math.max(fMax2, ((h0.e.a) it4.next()).f117347b);
                }
                fFloatValue4 = fMax2;
            }
            if (!z17) {
                return f(fVar, f14, mVar, z16, f24, d0Var2, mVar3, list, f25, f26, fFloatValue3, fFloatValue4, e0Var2, g1Var2);
            }
            i53.c cVarG3 = g(list);
            p13.k0 k0Var3 = p13.k0.f134949a;
            k0Var3.getClass();
            arrayListM = p13.x.m(k0Var3);
            it5 = cVarG3.iterator();
            while (it5.hasNext()) {
                arrayListM.add(f(fVar, f14, mVar, z16, f24, d0Var2, mVar3, (i53.c) it5.next(), f25, f26, fFloatValue3, fFloatValue4, e0Var2, g1Var2));
            }
            it6 = arrayListM.iterator();
            if (it6.hasNext()) {
                next = it6.next();
                while (it6.hasNext()) {
                    next = p13.u0.h((Map) next, (Map) it6.next());
                }
            }
            Map map3 = (Map) next;
            if (map3 != null) {
            }
        }
        fFloatValue2 = f29.floatValue();
        f26 = fFloatValue2;
        if (f19 != null) {
            fFloatValue3 = f19.floatValue();
        } else {
            it3 = list.iterator();
            if (it3.hasNext()) {
                c22.t.g();
                return null;
            }
            fMin = ((h0.e.a) it3.next()).f117347b;
            while (it3.hasNext()) {
                fMin = Math.min(fMin, ((h0.e.a) it3.next()).f117347b);
            }
            fFloatValue3 = fMin;
        }
        if (f22 != null) {
            fFloatValue4 = f22.floatValue();
        } else {
            it4 = list.iterator();
            if (it4.hasNext()) {
                c22.t.g();
                return null;
            }
            fMax2 = ((h0.e.a) it4.next()).f117347b;
            while (it4.hasNext()) {
                fMax2 = Math.max(fMax2, ((h0.e.a) it4.next()).f117347b);
            }
            fFloatValue4 = fMax2;
        }
        if (!z17) {
            return f(fVar, f14, mVar, z16, f24, d0Var2, mVar3, list, f25, f26, fFloatValue3, fFloatValue4, e0Var2, g1Var2);
        }
        i53.c cVarG4 = g(list);
        p13.k0 k0Var4 = p13.k0.f134949a;
        k0Var4.getClass();
        arrayListM = p13.x.m(k0Var4);
        it5 = cVarG4.iterator();
        while (it5.hasNext()) {
            arrayListM.add(f(fVar, f14, mVar, z16, f24, d0Var2, mVar3, (i53.c) it5.next(), f25, f26, fFloatValue3, fFloatValue4, e0Var2, g1Var2));
        }
        it6 = arrayListM.iterator();
        if (it6.hasNext()) {
            next = it6.next();
            while (it6.hasNext()) {
                next = p13.u0.h((Map) next, (Map) it6.next());
            }
        }
        Map map4 = (Map) next;
        if (map4 != null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final i53.g<Float, Float> f(q4.f fVar, float f14, m mVar, boolean z14, float f15, o4.d0 d0Var, m mVar2, List<h0.e.a> list, float f16, float f17, float f18, float f19, e0 e0Var, g1 g1Var) throws Throwable {
        char c14;
        char c15;
        int i14;
        o4.j jVar;
        q4.f fVar2;
        z0 z0VarH;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList<h0.e.a> arrayList = new ArrayList(p13.y.r(list, 10));
        Iterator it = list.iterator();
        while (true) {
            c14 = ' ';
            if (!it.hasNext()) {
                break;
            }
            h0.e.a aVar = (h0.e.a) it.next();
            float fH = i0.h(aVar.f117346a, f16, f17, 0.0f, Float.intBitsToFloat((int) (fVar.b() >> 32)));
            linkedHashMap.put(Float.valueOf(fH), Float.valueOf(aVar.f117346a));
            arrayList.add(new h0.e.a(fH, i0.h(aVar.f117347b, f18, f19, Float.intBitsToFloat((int) (fVar.b() & 4294967295L)), 0.0f)));
            it = it;
        }
        o4.j jVarD = d(arrayList, e0Var);
        if (mVar2 instanceof m.b) {
            ArrayList arrayList2 = new ArrayList();
            if (z14) {
                m.b bVar = (m.b) mVar2;
                List<o13.p<Float, o4.d0>> list2 = bVar.f117404a;
                double size = 1.0d / ((double) arrayList.size());
                long j8 = list2.get(0).f128595b.f128833a;
                ArrayList arrayList3 = new ArrayList(p13.y.r(list2, 10));
                Iterator<T> it3 = list2.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(o4.d0.a(((o4.d0) ((o13.p) it3.next()).f128595b).f128833a));
                    list2 = list2;
                    c14 = c14;
                }
                List<o13.p<Float, o4.d0>> list3 = list2;
                c15 = c14;
                int size2 = p13.h0.b1(p13.h0.f1(arrayList3)).size();
                int i15 = 0;
                for (Object obj : arrayList) {
                    int i16 = i15 + 1;
                    if (i15 < 0) {
                        p13.x.q();
                        throw null;
                    }
                    double d14 = ((double) i15) * size;
                    ArrayList arrayList4 = new ArrayList();
                    for (Object obj2 : list3) {
                        o4.j jVar2 = jVarD;
                        long j14 = j8;
                        float f22 = (float) d14;
                        float fFloatValue = ((Number) ((o13.p) obj2).f128594a).floatValue();
                        if (0.0f <= fFloatValue && fFloatValue <= f22) {
                            arrayList4.add(obj2);
                        }
                        jVarD = jVar2;
                        j8 = j14;
                    }
                    o4.j jVar3 = jVarD;
                    j8 = !arrayList4.isEmpty() ? ((o4.d0) ((o13.p) p13.h0.m0(arrayList4)).f128595b).f128833a : j8;
                    arrayList2.add(new o13.p(Float.valueOf((float) d14), o4.d0.a(j8)));
                    jVarD = jVar3;
                    i15 = i16;
                }
                o4.j jVar4 = jVarD;
                int i17 = 1;
                if (list3.size() > 1) {
                    if (size2 > 2) {
                        o4.w.a aVar2 = o4.w.f129023a;
                        o13.p[] pVarArr = (o13.p[]) arrayList2.toArray(new o13.p[0]);
                        o13.p[] pVarArr2 = (o13.p[]) Arrays.copyOf(pVarArr, pVarArr.length);
                        o4.x1.f129034b.getClass();
                        z0VarH = o4.w.a.e(aVar2, pVarArr2);
                    } else {
                        o4.w.a aVar3 = o4.w.f129023a;
                        o13.p[] pVarArr3 = (o13.p[]) arrayList2.toArray(new o13.p[0]);
                        o13.p[] pVarArr4 = (o13.p[]) Arrays.copyOf(pVarArr3, pVarArr3.length);
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (fVar.b() & 4294967295L));
                        o4.x1.f129034b.getClass();
                        aVar3.getClass();
                        z0VarH = o4.w.a.h(pVarArr4, 0.0f, fIntBitsToFloat);
                    }
                    q4.f.C1(fVar, jVar4, z0VarH, 0.0f, new q4.k(fVar.s0(f14), 0.0f, bVar.f117405b, 0, g1Var, 10, null), 52);
                    fVar2 = fVar;
                } else {
                    fVar2 = fVar;
                }
                jVar = jVar4;
                List<o13.p<Float, o4.d0>> list4 = list3;
                long j15 = list4.get(0).f128595b.f128833a;
                long j16 = j15;
                int i18 = 0;
                for (Object obj3 : arrayList) {
                    int i19 = i18 + 1;
                    if (i18 < 0) {
                        p13.x.q();
                        throw null;
                    }
                    h0.e.a aVar4 = (h0.e.a) obj3;
                    List<o13.p<Float, o4.d0>> list5 = list4;
                    double d15 = ((double) i18) * size;
                    ArrayList arrayList5 = new ArrayList();
                    for (Object obj4 : list5) {
                        long j17 = j16;
                        float f24 = (float) d15;
                        float fFloatValue2 = ((Number) ((o13.p) obj4).f128594a).floatValue();
                        if (0.0f <= fFloatValue2 && fFloatValue2 <= f24) {
                            arrayList5.add(obj4);
                        }
                        j16 = j17;
                    }
                    long j18 = !arrayList5.isEmpty() ? ((o4.d0) ((o13.p) p13.h0.m0(arrayList5)).f128595b).f128833a : j16;
                    arrayList2.add(new o13.p(Float.valueOf((float) d15), o4.d0.a(j18)));
                    float fS0 = fVar2.s0(f15);
                    long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(aVar4.f117346a)) << c15) | (((long) Float.floatToRawIntBits(aVar4.f117347b)) & 4294967295L);
                    n4.c.a aVar5 = n4.c.f123541b;
                    long j19 = j18;
                    q4.f.o0(fVar, j19, fS0, jFloatToRawIntBits, null, 0, 120);
                    j16 = j19;
                    i17 = 1;
                    list4 = list5;
                    i18 = i19;
                    fVar2 = fVar;
                }
                i14 = i17;
            } else {
                c15 = ' ';
                i14 = 1;
                jVar = jVarD;
                m.b bVar2 = (m.b) mVar2;
                List<o13.p<Float, o4.d0>> list6 = bVar2.f117404a;
                if (list6.size() > 1) {
                    o4.w.a aVar6 = o4.w.f129023a;
                    o13.p[] pVarArr5 = (o13.p[]) list6.toArray(new o13.p[0]);
                    o13.p[] pVarArr6 = (o13.p[]) Arrays.copyOf(pVarArr5, pVarArr5.length);
                    o4.x1.f129034b.getClass();
                    q4.f.C1(fVar, jVar, o4.w.a.e(aVar6, pVarArr6), 0.0f, new q4.k(fVar.s0(f14), 0.0f, bVar2.f117405b, 0, g1Var, 10, null), 52);
                }
            }
        } else {
            boolean z15 = false;
            c15 = ' ';
            i14 = 1;
            jVar = jVarD;
            if (z14 && d0Var != null) {
                for (h0.e.a aVar7 : arrayList) {
                    long j24 = d0Var.f128833a;
                    float fS1 = fVar.s0(f15);
                    long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(aVar7.f117347b)) & 4294967295L) | (((long) Float.floatToRawIntBits(aVar7.f117346a)) << 32);
                    n4.c.a aVar8 = n4.c.f123541b;
                    q4.f.o0(fVar, j24, fS1, jFloatToRawIntBits2, null, 0, 120);
                    z15 = false;
                }
            }
        }
        if (mVar instanceof m.d) {
            q4.f.L(fVar, jVar, ((m.d) mVar).f117408a, 0.0f, new q4.k(fVar.s0(f14), 0.0f, 0, 0, g1Var, 14, null), 52);
        } else if (mVar instanceof m.b) {
            m.b bVar3 = (m.b) mVar;
            List<o13.p<Float, o4.d0>> list7 = bVar3.f117404a;
            if (list7.size() > i14 && !z14 && mVar2 == null) {
                o4.w.a aVar9 = o4.w.f129023a;
                o13.p[] pVarArr7 = (o13.p[]) list7.toArray(new o13.p[0]);
                o13.p[] pVarArr8 = (o13.p[]) Arrays.copyOf(pVarArr7, pVarArr7.length);
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (fVar.b() & 4294967295L));
                o4.x1.f129034b.getClass();
                aVar9.getClass();
                q4.f.C1(fVar, jVar, o4.w.a.h(pVarArr8, fIntBitsToFloat2, 0.0f), 0.0f, new q4.k(fVar.s0(f14), 0.0f, bVar3.f117405b, 0, g1Var, 10, null), 52);
            }
        } else if (mVar instanceof m.c) {
            m.c cVar = (m.c) mVar;
            List<o13.p<Float, o4.d0>> list8 = cVar.f117406a;
            if (list8.size() > i14 && !z14 && mVar2 == null) {
                o4.w.a aVar10 = o4.w.f129023a;
                o13.p[] pVarArr9 = (o13.p[]) list8.toArray(new o13.p[0]);
                o13.p[] pVarArr10 = (o13.p[]) Arrays.copyOf(pVarArr9, pVarArr9.length);
                float fIntBitsToFloat3 = Float.intBitsToFloat((int) (fVar.b() >> c15));
                o4.x1.f129034b.getClass();
                aVar10.getClass();
                q4.f.C1(fVar, jVar, o4.w.a.a(pVarArr10, 0.0f, fIntBitsToFloat3), 0.0f, new q4.k(fVar.s0(f14), 0.0f, cVar.f117407b, 0, g1Var, 10, null), 52);
            }
        } else {
            if (!(mVar instanceof m.a)) {
                u0.r();
                return null;
            }
            o4.j jVarA = o4.m.a();
            f1.m(jVarA, jVar);
            float f25 = 2;
            jVarA.c(((h0.e.a) p13.h0.m0(arrayList)).f117346a, Float.intBitsToFloat((int) (fVar.b() & 4294967295L)) / f25);
            jVarA.c(((h0.e.a) p13.h0.b0(arrayList)).f117346a, Float.intBitsToFloat((int) (fVar.b() & 4294967295L)) / f25);
            jVarA.close();
            o4.j jVarA2 = o4.m.a();
            jVarA2.a(((h0.e.a) p13.h0.b0(arrayList)).f117346a, Float.intBitsToFloat((int) (fVar.b() & 4294967295L)) / f25);
            jVarA2.c(((h0.e.a) p13.h0.b0(arrayList)).f117346a, 0.0f);
            jVarA2.c(((h0.e.a) p13.h0.m0(arrayList)).f117346a, 0.0f);
            jVarA2.c(((h0.e.a) p13.h0.m0(arrayList)).f117346a, Float.intBitsToFloat((int) (fVar.b() & 4294967295L)) / f25);
            jVarA2.close();
            o4.j jVarA3 = o4.m.a();
            f1.m(jVarA3, jVarA);
            o4.j jVarA4 = o4.m.a();
            j1.a aVar11 = j1.f128873b;
            aVar11.getClass();
            jVarA4.s(jVarA3, jVarA2, j1.f128874c);
            o4.j jVarA5 = o4.m.a();
            f1.m(jVarA5, jVarA);
            o4.j jVarA6 = o4.m.a();
            aVar11.getClass();
            jVarA6.s(jVarA5, jVarA2, 0);
            m.a aVar12 = (m.a) mVar;
            q4.f.L(fVar, jVarA4, aVar12.f117402b, 0.0f, null, 60);
            o4.d0 d0Var2 = aVar12.f117403c;
            q4.f.L(fVar, jVarA6, d0Var2 != null ? d0Var2.f128833a : aVar12.f117402b, 0.0f, null, 60);
            q4.f.L(fVar, jVar, aVar12.f117401a, 0.0f, new q4.k(fVar.s0(f14), 0.0f, 0, 0, g1Var, 14, null), 52);
        }
        return i53.a.k(linkedHashMap);
    }

    public static final <T extends h0> i53.c<i53.c<T>> g(List<? extends T> list) {
        Boolean boolValueOf;
        ArrayList arrayListL = androidx.core.view.j.l(list);
        ArrayList arrayList = new ArrayList();
        Object objD0 = p13.h0.d0(arrayList);
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            h0 h0Var = (h0) it.next();
            h0 h0Var2 = (h0) objD0;
            if (h0Var2 == null || h0Var == null) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(!(i0.c(h0Var) - i0.c(h0Var2) == 1.0f));
            }
            if (p005kotlin.jvm.internal.s.g(boolValueOf, Boolean.TRUE)) {
                arrayListL.add(i53.a.j(arrayList));
                arrayList = p13.x.m(h0Var);
            } else {
                arrayList.add(h0Var);
            }
            objD0 = h0Var;
        }
        arrayListL.add(i53.a.e(arrayList));
        return i53.a.e(arrayListL);
    }
}
