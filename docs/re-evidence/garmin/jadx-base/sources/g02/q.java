package g02;

import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import i3.mh;
import i3.p7;
import p3.b4;
import p3.i2;
import p3.p2;
import p3.y3;

/* JADX INFO: loaded from: classes10.dex */
public final class q {
    public static final void a(p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(1923245734);
        if (o0VarE.n(i14 & 1, i14 != 0)) {
            p3.x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            float f14 = 16;
            g6.f.a aVar2 = g6.f.f75994b;
            b("This is some short text.", c2.l.y(aVar, f14), 0, null, null, null, null, null, o0VarE, 54, 252);
            c2.l.f(x2.h(aVar, f14), o0VarE);
            b("This is some text that is long enough to wrap to multiple lines. There's enough information here that the user might spend a long time reading it, so we want to truncate it in order to allow them to read it when they want to, instead of right now.", c2.l.y(aVar, f14), 0, null, null, null, null, null, o0VarE, 48, 252);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new fy0.c(i14, 26);
        }
    }

    /* JADX WARN: Code duplicated, block: B:106:0x011e A[PHI: r2 r5 r6 r8 r11 r13
      0x011e: PHI (r2v22 int) = (r2v16 int), (r2v25 int), (r2v26 int) binds: [B:124:0x017d, B:104:0x011b, B:105:0x011d] A[DONT_GENERATE, DONT_INLINE]
      0x011e: PHI (r5v8 int) = (r5v5 int), (r5v2 int), (r5v2 int) binds: [B:124:0x017d, B:104:0x011b, B:105:0x011d] A[DONT_GENERATE, DONT_INLINE]
      0x011e: PHI (r6v12 s5.x0) = (r6v9 s5.x0), (r6v6 s5.x0), (r6v6 s5.x0) binds: [B:124:0x017d, B:104:0x011b, B:105:0x011d] A[DONT_GENERATE, DONT_INLINE]
      0x011e: PHI (r8v8 p3.p1<java.lang.Boolean>) = (r8v5 p3.p1<java.lang.Boolean>), (r8v2 p3.p1<java.lang.Boolean>), (r8v2 p3.p1<java.lang.Boolean>) binds: [B:124:0x017d, B:104:0x011b, B:105:0x011d] A[DONT_GENERATE, DONT_INLINE]
      0x011e: PHI (r11v12 java.lang.String) = (r11v9 java.lang.String), (r11v7 java.lang.String), (r11v7 java.lang.String) binds: [B:124:0x017d, B:104:0x011b, B:105:0x011d] A[DONT_GENERATE, DONT_INLINE]
      0x011e: PHI (r13v8 java.lang.String) = (r13v4 java.lang.String), (r13v3 java.lang.String), (r13v3 java.lang.String) binds: [B:124:0x017d, B:104:0x011b, B:105:0x011d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:107:0x0129 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:108:0x012b  */
    /* JADX WARN: Code duplicated, block: B:111:0x0131  */
    /* JADX WARN: Code duplicated, block: B:113:0x0146  */
    /* JADX WARN: Code duplicated, block: B:115:0x0153  */
    /* JADX WARN: Code duplicated, block: B:119:0x0163  */
    /* JADX WARN: Code duplicated, block: B:122:0x0171  */
    /* JADX WARN: Code duplicated, block: B:125:0x017f  */
    /* JADX WARN: Code duplicated, block: B:127:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:130:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:132:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    /* JADX WARN: Code duplicated, block: B:32:0x0057  */
    /* JADX WARN: Code duplicated, block: B:34:0x005f  */
    /* JADX WARN: Code duplicated, block: B:35:0x0062  */
    /* JADX WARN: Code duplicated, block: B:38:0x0068  */
    /* JADX WARN: Code duplicated, block: B:41:0x006e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0073  */
    /* JADX WARN: Code duplicated, block: B:45:0x0077  */
    /* JADX WARN: Code duplicated, block: B:47:0x007f  */
    /* JADX WARN: Code duplicated, block: B:48:0x0082  */
    /* JADX WARN: Code duplicated, block: B:52:0x008a  */
    /* JADX WARN: Code duplicated, block: B:54:0x008e  */
    /* JADX WARN: Code duplicated, block: B:56:0x0096  */
    /* JADX WARN: Code duplicated, block: B:57:0x0099  */
    /* JADX WARN: Code duplicated, block: B:60:0x009f  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:65:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:71:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:76:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:78:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:82:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:86:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:89:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:91:0x00fd  */
    public static final void b(String str, h4.r rVar, int i14, s5.x0 x0Var, p3.p1<Boolean> p1Var, String str2, String str3, s5.x0 x0Var2, p3.m mVar, int i15, int i16) {
        int i17;
        int i18;
        s5.x0 x0VarB;
        int i19;
        p3.p1<Boolean> p1Var2;
        int i24;
        String strQ;
        String strQ2;
        s5.x0 x0Var3;
        boolean z14;
        p3.o0 o0Var;
        int i25;
        s5.x0 x0Var4;
        p3.p1<Boolean> p1Var3;
        String str4;
        String str5;
        s5.x0 x0Var5;
        p2 p2VarI0;
        s5.x0 x0VarA;
        s5.x0 x0Var6;
        p3.p1<Boolean> p1Var4;
        String str6;
        String str7;
        int i26;
        Object objQ;
        str.getClass();
        p3.o0 o0VarE = mVar.E(-2047790963);
        if ((i15 & 6) == 0) {
            i17 = (o0VarE.B(str) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            i17 |= o0VarE.B(rVar) ? 32 : 16;
        }
        int i27 = i16 & 4;
        if (i27 == 0) {
            if ((i15 & 384) == 0) {
                i18 = i14;
                i17 |= o0VarE.k(i18) ? 256 : 128;
            }
            if ((i15 & 3072) == 0) {
                if ((i16 & 8) == 0) {
                    x0VarB = x0Var;
                    int i28 = o0VarE.B(x0VarB) ? 2048 : 1024;
                    i17 |= i28;
                } else {
                    x0VarB = x0Var;
                }
                i17 |= i28;
            } else {
                x0VarB = x0Var;
            }
            i19 = i16 & 16;
            if (i19 != 0) {
                if ((i15 & 24576) == 0) {
                    p1Var2 = p1Var;
                    if (o0VarE.B(p1Var2)) {
                        i24 = 16384;
                    } else {
                        i24 = 8192;
                    }
                    i17 |= i24;
                }
                if ((196608 & i15) == 0) {
                    if ((i16 & 32) == 0) {
                        strQ = str2;
                        int i29 = o0VarE.B(strQ) ? 131072 : 65536;
                        i17 |= i29;
                    } else {
                        strQ = str2;
                    }
                    i17 |= i29;
                } else {
                    strQ = str2;
                }
                if ((1572864 & i15) == 0) {
                    if ((i16 & 64) == 0) {
                        strQ2 = str3;
                        int i30 = o0VarE.B(strQ2) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
                        i17 |= i30;
                    } else {
                        strQ2 = str3;
                    }
                    i17 |= i30;
                } else {
                    strQ2 = str3;
                }
                if ((12582912 & i15) == 0) {
                    if ((i16 & 128) == 0) {
                        x0Var3 = x0Var2;
                        int i34 = o0VarE.B(x0Var3) ? 8388608 : 4194304;
                        i17 |= i34;
                    } else {
                        x0Var3 = x0Var2;
                    }
                    i17 |= i34;
                } else {
                    x0Var3 = x0Var2;
                }
                if ((4793491 & i17) != 4793490) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (o0VarE.n(i17 & 1, z14)) {
                    o0VarE.G0();
                    if ((i15 & 1) != 0 || o0VarE.o0()) {
                        if (i27 != 0) {
                            i18 = 3;
                        }
                        if ((i16 & 8) != 0) {
                            d92.b.f58623a.getClass();
                            d92.b.f58624b.getClass();
                            i17 &= -7169;
                            x0VarB = d92.c.b(j92.f.f97932i, o0VarE);
                        }
                        if (i19 != 0) {
                            objQ = o0VarE.q();
                            p3.m.f135153a.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = p3.p0.n(Boolean.FALSE);
                                o0VarE.K(objQ);
                            }
                            p1Var2 = (p3.p1) objQ;
                        }
                        if ((i16 & 32) != 0) {
                            i17 &= -458753;
                            strQ = gl1.y.Q(o0VarE, R.string.lbl_show_more_sentence_case);
                        }
                        if ((i16 & 64) != 0) {
                            i17 &= -3670017;
                            strQ2 = gl1.y.Q(o0VarE, R.string.lbl_show_less);
                        }
                        if ((i16 & 128) != 0) {
                            d92.b.f58623a.getClass();
                            d92.b.f58624b.getClass();
                            i17 &= -29360129;
                            x0VarA = s5.x0.a(j92.f.f97932i, hb.a.e(o0VarE), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214);
                            x0Var6 = x0VarB;
                            p1Var4 = p1Var2;
                            str6 = strQ;
                            str7 = strQ2;
                            i26 = i18;
                        }
                        o0VarE.h0();
                        p3.x1 x1Var = p3.n.f135158a;
                        o0Var = o0VarE;
                        c(new s5.c(str, null, 2, null), rVar, i26, x0Var6, p1Var4, str6, str7, x0VarA, o0Var, i17 & 33554416, 0);
                        i25 = i26;
                        x0Var4 = x0Var6;
                        p1Var3 = p1Var4;
                        str4 = str6;
                        str5 = str7;
                        x0Var5 = x0VarA;
                    } else {
                        o0VarE.e();
                        if ((i16 & 8) != 0) {
                            i17 &= -7169;
                        }
                        if ((i16 & 32) != 0) {
                            i17 &= -458753;
                        }
                        if ((i16 & 64) != 0) {
                            i17 &= -3670017;
                        }
                        if ((i16 & 128) != 0) {
                            i17 &= -29360129;
                        }
                    }
                    p1Var4 = p1Var2;
                    str6 = strQ;
                    str7 = strQ2;
                    x0VarA = x0Var3;
                    i26 = i18;
                    x0Var6 = x0VarB;
                    o0VarE.h0();
                    p3.x1 x1Var2 = p3.n.f135158a;
                    o0Var = o0VarE;
                    c(new s5.c(str, null, 2, null), rVar, i26, x0Var6, p1Var4, str6, str7, x0VarA, o0Var, i17 & 33554416, 0);
                    i25 = i26;
                    x0Var4 = x0Var6;
                    p1Var3 = p1Var4;
                    str4 = str6;
                    str5 = str7;
                    x0Var5 = x0VarA;
                } else {
                    o0Var = o0VarE;
                    o0Var.e();
                    i25 = i18;
                    x0Var4 = x0VarB;
                    p1Var3 = p1Var2;
                    str4 = strQ;
                    str5 = strQ2;
                    x0Var5 = x0Var3;
                }
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new f10.j(str, rVar, i25, x0Var4, p1Var3, str4, str5, x0Var5, i15, i16, 1);
                }
            }
            i17 |= 24576;
            p1Var2 = p1Var;
            if ((196608 & i15) == 0) {
                if ((i16 & 32) == 0) {
                    strQ = str2;
                    if (o0VarE.B(strQ)) {
                    }
                    i17 |= i29;
                } else {
                    strQ = str2;
                }
                i17 |= i29;
            } else {
                strQ = str2;
            }
            if ((1572864 & i15) == 0) {
                if ((i16 & 64) == 0) {
                    strQ2 = str3;
                    if (o0VarE.B(strQ2)) {
                    }
                    i17 |= i30;
                } else {
                    strQ2 = str3;
                }
                i17 |= i30;
            } else {
                strQ2 = str3;
            }
            if ((12582912 & i15) == 0) {
                if ((i16 & 128) == 0) {
                    x0Var3 = x0Var2;
                    if (o0VarE.B(x0Var3)) {
                    }
                    i17 |= i34;
                } else {
                    x0Var3 = x0Var2;
                }
                i17 |= i34;
            } else {
                x0Var3 = x0Var2;
            }
            if ((4793491 & i17) != 4793490) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i17 & 1, z14)) {
                o0VarE.G0();
                if ((i15 & 1) != 0) {
                    if (i27 != 0) {
                        i18 = 3;
                    }
                    if ((i16 & 8) != 0) {
                        d92.b.f58623a.getClass();
                        d92.b.f58624b.getClass();
                        i17 &= -7169;
                        x0VarB = d92.c.b(j92.f.f97932i, o0VarE);
                    }
                    if (i19 != 0) {
                        objQ = o0VarE.q();
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = p3.p0.n(Boolean.FALSE);
                            o0VarE.K(objQ);
                        }
                        p1Var2 = (p3.p1) objQ;
                    }
                    if ((i16 & 32) != 0) {
                        i17 &= -458753;
                        strQ = gl1.y.Q(o0VarE, R.string.lbl_show_more_sentence_case);
                    }
                    if ((i16 & 64) != 0) {
                        i17 &= -3670017;
                        strQ2 = gl1.y.Q(o0VarE, R.string.lbl_show_less);
                    }
                    if ((i16 & 128) != 0) {
                        d92.b.f58623a.getClass();
                        d92.b.f58624b.getClass();
                        i17 &= -29360129;
                        x0VarA = s5.x0.a(j92.f.f97932i, hb.a.e(o0VarE), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214);
                        x0Var6 = x0VarB;
                        p1Var4 = p1Var2;
                        str6 = strQ;
                        str7 = strQ2;
                        i26 = i18;
                    } else {
                        p1Var4 = p1Var2;
                        str6 = strQ;
                        str7 = strQ2;
                        x0VarA = x0Var3;
                        i26 = i18;
                        x0Var6 = x0VarB;
                    }
                } else {
                    if (i27 != 0) {
                        i18 = 3;
                    }
                    if ((i16 & 8) != 0) {
                        d92.b.f58623a.getClass();
                        d92.b.f58624b.getClass();
                        i17 &= -7169;
                        x0VarB = d92.c.b(j92.f.f97932i, o0VarE);
                    }
                    if (i19 != 0) {
                        objQ = o0VarE.q();
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = p3.p0.n(Boolean.FALSE);
                            o0VarE.K(objQ);
                        }
                        p1Var2 = (p3.p1) objQ;
                    }
                    if ((i16 & 32) != 0) {
                        i17 &= -458753;
                        strQ = gl1.y.Q(o0VarE, R.string.lbl_show_more_sentence_case);
                    }
                    if ((i16 & 64) != 0) {
                        i17 &= -3670017;
                        strQ2 = gl1.y.Q(o0VarE, R.string.lbl_show_less);
                    }
                    if ((i16 & 128) != 0) {
                        d92.b.f58623a.getClass();
                        d92.b.f58624b.getClass();
                        i17 &= -29360129;
                        x0VarA = s5.x0.a(j92.f.f97932i, hb.a.e(o0VarE), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214);
                        x0Var6 = x0VarB;
                        p1Var4 = p1Var2;
                        str6 = strQ;
                        str7 = strQ2;
                        i26 = i18;
                    } else {
                        p1Var4 = p1Var2;
                        str6 = strQ;
                        str7 = strQ2;
                        x0VarA = x0Var3;
                        i26 = i18;
                        x0Var6 = x0VarB;
                    }
                }
                o0VarE.h0();
                p3.x1 x1Var3 = p3.n.f135158a;
                o0Var = o0VarE;
                c(new s5.c(str, null, 2, null), rVar, i26, x0Var6, p1Var4, str6, str7, x0VarA, o0Var, i17 & 33554416, 0);
                i25 = i26;
                x0Var4 = x0Var6;
                p1Var3 = p1Var4;
                str4 = str6;
                str5 = str7;
                x0Var5 = x0VarA;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                i25 = i18;
                x0Var4 = x0VarB;
                p1Var3 = p1Var2;
                str4 = strQ;
                str5 = strQ2;
                x0Var5 = x0Var3;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new f10.j(str, rVar, i25, x0Var4, p1Var3, str4, str5, x0Var5, i15, i16, 1);
            }
        }
        i17 |= 384;
        i18 = i14;
        if ((i15 & 3072) == 0) {
            if ((i16 & 8) == 0) {
                x0VarB = x0Var;
                if (o0VarE.B(x0VarB)) {
                }
                i17 |= i28;
            } else {
                x0VarB = x0Var;
            }
            i17 |= i28;
        } else {
            x0VarB = x0Var;
        }
        i19 = i16 & 16;
        if (i19 != 0) {
            if ((i15 & 24576) == 0) {
                p1Var2 = p1Var;
                if (o0VarE.B(p1Var2)) {
                    i24 = 16384;
                } else {
                    i24 = 8192;
                }
                i17 |= i24;
            }
            if ((196608 & i15) == 0) {
                if ((i16 & 32) == 0) {
                    strQ = str2;
                    if (o0VarE.B(strQ)) {
                    }
                    i17 |= i29;
                } else {
                    strQ = str2;
                }
                i17 |= i29;
            } else {
                strQ = str2;
            }
            if ((1572864 & i15) == 0) {
                if ((i16 & 64) == 0) {
                    strQ2 = str3;
                    if (o0VarE.B(strQ2)) {
                    }
                    i17 |= i30;
                } else {
                    strQ2 = str3;
                }
                i17 |= i30;
            } else {
                strQ2 = str3;
            }
            if ((12582912 & i15) == 0) {
                if ((i16 & 128) == 0) {
                    x0Var3 = x0Var2;
                    if (o0VarE.B(x0Var3)) {
                    }
                    i17 |= i34;
                } else {
                    x0Var3 = x0Var2;
                }
                i17 |= i34;
            } else {
                x0Var3 = x0Var2;
            }
            if ((4793491 & i17) != 4793490) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i17 & 1, z14)) {
                o0VarE.G0();
                if ((i15 & 1) != 0) {
                    if (i27 != 0) {
                        i18 = 3;
                    }
                    if ((i16 & 8) != 0) {
                        d92.b.f58623a.getClass();
                        d92.b.f58624b.getClass();
                        i17 &= -7169;
                        x0VarB = d92.c.b(j92.f.f97932i, o0VarE);
                    }
                    if (i19 != 0) {
                        objQ = o0VarE.q();
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = p3.p0.n(Boolean.FALSE);
                            o0VarE.K(objQ);
                        }
                        p1Var2 = (p3.p1) objQ;
                    }
                    if ((i16 & 32) != 0) {
                        i17 &= -458753;
                        strQ = gl1.y.Q(o0VarE, R.string.lbl_show_more_sentence_case);
                    }
                    if ((i16 & 64) != 0) {
                        i17 &= -3670017;
                        strQ2 = gl1.y.Q(o0VarE, R.string.lbl_show_less);
                    }
                    if ((i16 & 128) != 0) {
                        d92.b.f58623a.getClass();
                        d92.b.f58624b.getClass();
                        i17 &= -29360129;
                        x0VarA = s5.x0.a(j92.f.f97932i, hb.a.e(o0VarE), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214);
                        x0Var6 = x0VarB;
                        p1Var4 = p1Var2;
                        str6 = strQ;
                        str7 = strQ2;
                        i26 = i18;
                    } else {
                        p1Var4 = p1Var2;
                        str6 = strQ;
                        str7 = strQ2;
                        x0VarA = x0Var3;
                        i26 = i18;
                        x0Var6 = x0VarB;
                    }
                } else {
                    if (i27 != 0) {
                        i18 = 3;
                    }
                    if ((i16 & 8) != 0) {
                        d92.b.f58623a.getClass();
                        d92.b.f58624b.getClass();
                        i17 &= -7169;
                        x0VarB = d92.c.b(j92.f.f97932i, o0VarE);
                    }
                    if (i19 != 0) {
                        objQ = o0VarE.q();
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = p3.p0.n(Boolean.FALSE);
                            o0VarE.K(objQ);
                        }
                        p1Var2 = (p3.p1) objQ;
                    }
                    if ((i16 & 32) != 0) {
                        i17 &= -458753;
                        strQ = gl1.y.Q(o0VarE, R.string.lbl_show_more_sentence_case);
                    }
                    if ((i16 & 64) != 0) {
                        i17 &= -3670017;
                        strQ2 = gl1.y.Q(o0VarE, R.string.lbl_show_less);
                    }
                    if ((i16 & 128) != 0) {
                        d92.b.f58623a.getClass();
                        d92.b.f58624b.getClass();
                        i17 &= -29360129;
                        x0VarA = s5.x0.a(j92.f.f97932i, hb.a.e(o0VarE), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214);
                        x0Var6 = x0VarB;
                        p1Var4 = p1Var2;
                        str6 = strQ;
                        str7 = strQ2;
                        i26 = i18;
                    } else {
                        p1Var4 = p1Var2;
                        str6 = strQ;
                        str7 = strQ2;
                        x0VarA = x0Var3;
                        i26 = i18;
                        x0Var6 = x0VarB;
                    }
                }
                o0VarE.h0();
                p3.x1 x1Var4 = p3.n.f135158a;
                o0Var = o0VarE;
                c(new s5.c(str, null, 2, null), rVar, i26, x0Var6, p1Var4, str6, str7, x0VarA, o0Var, i17 & 33554416, 0);
                i25 = i26;
                x0Var4 = x0Var6;
                p1Var3 = p1Var4;
                str4 = str6;
                str5 = str7;
                x0Var5 = x0VarA;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                i25 = i18;
                x0Var4 = x0VarB;
                p1Var3 = p1Var2;
                str4 = strQ;
                str5 = strQ2;
                x0Var5 = x0Var3;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new f10.j(str, rVar, i25, x0Var4, p1Var3, str4, str5, x0Var5, i15, i16, 1);
            }
        }
        i17 |= 24576;
        p1Var2 = p1Var;
        if ((196608 & i15) == 0) {
            if ((i16 & 32) == 0) {
                strQ = str2;
                if (o0VarE.B(strQ)) {
                }
                i17 |= i29;
            } else {
                strQ = str2;
            }
            i17 |= i29;
        } else {
            strQ = str2;
        }
        if ((1572864 & i15) == 0) {
            if ((i16 & 64) == 0) {
                strQ2 = str3;
                if (o0VarE.B(strQ2)) {
                }
                i17 |= i30;
            } else {
                strQ2 = str3;
            }
            i17 |= i30;
        } else {
            strQ2 = str3;
        }
        if ((12582912 & i15) == 0) {
            if ((i16 & 128) == 0) {
                x0Var3 = x0Var2;
                if (o0VarE.B(x0Var3)) {
                }
                i17 |= i34;
            } else {
                x0Var3 = x0Var2;
            }
            i17 |= i34;
        } else {
            x0Var3 = x0Var2;
        }
        if ((4793491 & i17) != 4793490) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (o0VarE.n(i17 & 1, z14)) {
            o0VarE.G0();
            if ((i15 & 1) != 0) {
                if (i27 != 0) {
                    i18 = 3;
                }
                if ((i16 & 8) != 0) {
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    i17 &= -7169;
                    x0VarB = d92.c.b(j92.f.f97932i, o0VarE);
                }
                if (i19 != 0) {
                    objQ = o0VarE.q();
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = p3.p0.n(Boolean.FALSE);
                        o0VarE.K(objQ);
                    }
                    p1Var2 = (p3.p1) objQ;
                }
                if ((i16 & 32) != 0) {
                    i17 &= -458753;
                    strQ = gl1.y.Q(o0VarE, R.string.lbl_show_more_sentence_case);
                }
                if ((i16 & 64) != 0) {
                    i17 &= -3670017;
                    strQ2 = gl1.y.Q(o0VarE, R.string.lbl_show_less);
                }
                if ((i16 & 128) != 0) {
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    i17 &= -29360129;
                    x0VarA = s5.x0.a(j92.f.f97932i, hb.a.e(o0VarE), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214);
                    x0Var6 = x0VarB;
                    p1Var4 = p1Var2;
                    str6 = strQ;
                    str7 = strQ2;
                    i26 = i18;
                } else {
                    p1Var4 = p1Var2;
                    str6 = strQ;
                    str7 = strQ2;
                    x0VarA = x0Var3;
                    i26 = i18;
                    x0Var6 = x0VarB;
                }
            } else {
                if (i27 != 0) {
                    i18 = 3;
                }
                if ((i16 & 8) != 0) {
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    i17 &= -7169;
                    x0VarB = d92.c.b(j92.f.f97932i, o0VarE);
                }
                if (i19 != 0) {
                    objQ = o0VarE.q();
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = p3.p0.n(Boolean.FALSE);
                        o0VarE.K(objQ);
                    }
                    p1Var2 = (p3.p1) objQ;
                }
                if ((i16 & 32) != 0) {
                    i17 &= -458753;
                    strQ = gl1.y.Q(o0VarE, R.string.lbl_show_more_sentence_case);
                }
                if ((i16 & 64) != 0) {
                    i17 &= -3670017;
                    strQ2 = gl1.y.Q(o0VarE, R.string.lbl_show_less);
                }
                if ((i16 & 128) != 0) {
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    i17 &= -29360129;
                    x0VarA = s5.x0.a(j92.f.f97932i, hb.a.e(o0VarE), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214);
                    x0Var6 = x0VarB;
                    p1Var4 = p1Var2;
                    str6 = strQ;
                    str7 = strQ2;
                    i26 = i18;
                } else {
                    p1Var4 = p1Var2;
                    str6 = strQ;
                    str7 = strQ2;
                    x0VarA = x0Var3;
                    i26 = i18;
                    x0Var6 = x0VarB;
                }
            }
            o0VarE.h0();
            p3.x1 x1Var5 = p3.n.f135158a;
            o0Var = o0VarE;
            c(new s5.c(str, null, 2, null), rVar, i26, x0Var6, p1Var4, str6, str7, x0VarA, o0Var, i17 & 33554416, 0);
            i25 = i26;
            x0Var4 = x0Var6;
            p1Var3 = p1Var4;
            str4 = str6;
            str5 = str7;
            x0Var5 = x0VarA;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            i25 = i18;
            x0Var4 = x0VarB;
            p1Var3 = p1Var2;
            str4 = strQ;
            str5 = strQ2;
            x0Var5 = x0Var3;
        }
        p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new f10.j(str, rVar, i25, x0Var4, p1Var3, str4, str5, x0Var5, i15, i16, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x011a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:103:0x011c  */
    /* JADX WARN: Code duplicated, block: B:104:0x011f  */
    /* JADX WARN: Code duplicated, block: B:107:0x0124  */
    /* JADX WARN: Code duplicated, block: B:109:0x0139  */
    /* JADX WARN: Code duplicated, block: B:111:0x0144  */
    /* JADX WARN: Code duplicated, block: B:115:0x0154  */
    /* JADX WARN: Code duplicated, block: B:116:0x015e  */
    /* JADX WARN: Code duplicated, block: B:119:0x0164  */
    /* JADX WARN: Code duplicated, block: B:120:0x016e  */
    /* JADX WARN: Code duplicated, block: B:123:0x0180  */
    /* JADX WARN: Code duplicated, block: B:126:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:128:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:129:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:132:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:134:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:137:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:139:0x0205  */
    /* JADX WARN: Code duplicated, block: B:142:0x022e  */
    /* JADX WARN: Code duplicated, block: B:143:0x0234  */
    /* JADX WARN: Code duplicated, block: B:146:0x0245  */
    /* JADX WARN: Code duplicated, block: B:147:0x0247  */
    /* JADX WARN: Code duplicated, block: B:150:0x024e  */
    /* JADX WARN: Code duplicated, block: B:151:0x0250  */
    /* JADX WARN: Code duplicated, block: B:154:0x0258 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:155:0x025a  */
    /* JADX WARN: Code duplicated, block: B:158:0x0297  */
    /* JADX WARN: Code duplicated, block: B:159:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:161:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:163:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:166:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:168:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0041  */
    /* JADX WARN: Code duplicated, block: B:25:0x0047  */
    /* JADX WARN: Code duplicated, block: B:26:0x004a  */
    /* JADX WARN: Code duplicated, block: B:30:0x0051  */
    /* JADX WARN: Code duplicated, block: B:32:0x0055  */
    /* JADX WARN: Code duplicated, block: B:34:0x005d  */
    /* JADX WARN: Code duplicated, block: B:35:0x0060  */
    /* JADX WARN: Code duplicated, block: B:38:0x0066  */
    /* JADX WARN: Code duplicated, block: B:41:0x006c  */
    /* JADX WARN: Code duplicated, block: B:43:0x0071  */
    /* JADX WARN: Code duplicated, block: B:45:0x0075  */
    /* JADX WARN: Code duplicated, block: B:47:0x007d  */
    /* JADX WARN: Code duplicated, block: B:48:0x0080  */
    /* JADX WARN: Code duplicated, block: B:52:0x0088  */
    /* JADX WARN: Code duplicated, block: B:54:0x008c  */
    /* JADX WARN: Code duplicated, block: B:57:0x0097 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:60:0x009d  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:65:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:71:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:76:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:77:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:79:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:82:0x00db  */
    /* JADX WARN: Code duplicated, block: B:83:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:86:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f5  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(s5.c cVar, h4.r rVar, int i14, s5.x0 x0Var, p3.p1<Boolean> p1Var, String str, String str2, s5.x0 x0Var2, p3.m mVar, int i15, int i16) {
        int i17;
        h4.r rVar2;
        s5.x0 x0VarB;
        int i18;
        p3.p1<Boolean> p1Var2;
        int i19;
        String str3;
        boolean z14;
        String str4;
        h4.r rVar3;
        s5.x0 x0Var3;
        p3.p1<Boolean> p1Var3;
        String str5;
        p2 p2VarI0;
        int i24;
        p3.m.a aVar;
        h4.r rVar4;
        String strQ;
        String strQ2;
        Object objQ;
        s5.x0 x0Var4;
        int i25;
        p3.p1<Boolean> p1Var4;
        Object objQ2;
        p3.m.a.C2565a c2565a;
        p3.p1 p1Var5;
        c2.z zVarA;
        int iHashCode;
        i2 i2VarA0;
        h4.r rVarC;
        h5.e0.a aVar2;
        h4.r rVar5;
        h5.g.a.b bVar;
        boolean z15;
        float f14;
        int i26;
        int i27;
        boolean z16;
        boolean z17;
        boolean z18;
        Object objQ3;
        p3.p1<Boolean> p1Var6;
        String str6;
        String str7;
        int i28;
        int i29;
        cVar.getClass();
        p3.o0 o0VarE = mVar.E(-2022680319);
        if ((i15 & 6) == 0) {
            i17 = (o0VarE.B(cVar) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        int i30 = i16 & 2;
        if (i30 == 0) {
            if ((i15 & 48) == 0) {
                rVar2 = rVar;
                i17 |= o0VarE.B(rVar2) ? 32 : 16;
            }
            if ((i15 & 384) == 0) {
                if (o0VarE.k(i14)) {
                    i29 = 256;
                } else {
                    i29 = 128;
                }
                i17 |= i29;
            }
            if ((i15 & 3072) == 0) {
                if ((i16 & 8) == 0) {
                    x0VarB = x0Var;
                    int i34 = o0VarE.B(x0VarB) ? 2048 : 1024;
                    i17 |= i34;
                } else {
                    x0VarB = x0Var;
                }
                i17 |= i34;
            } else {
                x0VarB = x0Var;
            }
            i18 = i16 & 16;
            if (i18 != 0) {
                if ((i15 & 24576) == 0) {
                    p1Var2 = p1Var;
                    if (o0VarE.B(p1Var2)) {
                        i19 = 16384;
                    } else {
                        i19 = 8192;
                    }
                    i17 |= i19;
                }
                if ((196608 & i15) != 0) {
                    i17 |= ((i16 & 32) == 0 || !o0VarE.B(str)) ? 65536 : 131072;
                }
                if ((1572864 & i15) == 0) {
                    if ((i16 & 64) == 0) {
                        str3 = str2;
                        int i35 = o0VarE.B(str3) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
                        i17 |= i35;
                    } else {
                        str3 = str2;
                    }
                    i17 |= i35;
                } else {
                    str3 = str2;
                }
                if ((12582912 & i15) != 0) {
                    if (o0VarE.B(x0Var2)) {
                        i28 = 8388608;
                    } else {
                        i28 = 4194304;
                    }
                    i17 |= i28;
                }
                if ((4793491 & i17) != 4793490) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (o0VarE.n(i17 & 1, z14)) {
                    o0VarE.G0();
                    i24 = i15 & 1;
                    aVar = p3.m.f135153a;
                    if (i24 != 0 || o0VarE.o0()) {
                        if (i30 != 0) {
                            rVar4 = h4.r.S;
                        } else {
                            rVar4 = rVar2;
                        }
                        if ((i16 & 8) != 0) {
                            d92.b.f58623a.getClass();
                            d92.b.f58624b.getClass();
                            i17 &= -7169;
                            x0VarB = d92.c.b(j92.f.f97932i, o0VarE);
                        }
                        if (i18 != 0) {
                            objQ = o0VarE.q();
                            aVar.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = p3.p0.n(Boolean.FALSE);
                                o0VarE.K(objQ);
                            }
                            p1Var2 = (p3.p1) objQ;
                        }
                        if ((i16 & 32) != 0) {
                            strQ = gl1.y.Q(o0VarE, R.string.lbl_show_more_sentence_case);
                            i17 &= -458753;
                        } else {
                            strQ = str;
                        }
                        if ((i16 & 64) != 0) {
                            strQ2 = gl1.y.Q(o0VarE, R.string.lbl_show_less);
                            i17 &= -3670017;
                        } else {
                            strQ2 = str3;
                        }
                    } else {
                        o0VarE.e();
                        if ((i16 & 8) != 0) {
                            i17 &= -7169;
                        }
                        if ((i16 & 32) != 0) {
                            i17 &= -458753;
                        }
                        if ((i16 & 64) != 0) {
                            i17 &= -3670017;
                        }
                        rVar4 = rVar2;
                        strQ2 = str3;
                        strQ = str;
                    }
                    x0Var4 = x0VarB;
                    i25 = i17;
                    p1Var4 = p1Var2;
                    o0VarE.h0();
                    p3.x1 x1Var = p3.n.f135158a;
                    objQ2 = o0VarE.q();
                    aVar.getClass();
                    c2565a = p3.m.a.f135155b;
                    if (objQ2 == c2565a) {
                        objQ2 = p3.p0.n(Boolean.FALSE);
                        o0VarE.K(objQ2);
                    }
                    p1Var5 = (p3.p1) objQ2;
                    c2.j.f22691a.getClass();
                    c2.j.k kVar = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
                    iHashCode = Long.hashCode(o0VarE.U);
                    i2VarA0 = o0VarE.a0();
                    rVarC = h4.k.c(rVar4, o0VarE);
                    h5.g.V.getClass();
                    aVar2 = h5.g.a.f81805b;
                    rVar5 = rVar4;
                    if (o0VarE.f135177b != null) {
                        p3.p0.l();
                        throw null;
                    }
                    o0VarE.z();
                    if (o0VarE.T) {
                        o0VarE.M(aVar2);
                    } else {
                        o0VarE.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA, o0VarE);
                    b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
                    bVar = h5.g.a.f81813j;
                    if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                        v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                    c2.b0 b0Var = c2.b0.f22601a;
                    h4.r.a aVar3 = h4.r.S;
                    if (((Boolean) p1Var5.getF182175a()).booleanValue()) {
                        z15 = false;
                        f14 = 0;
                        g6.f.a aVar4 = g6.f.f75994b;
                    } else {
                        z15 = false;
                        i3.c1.f87691a.getClass();
                        f14 = i3.c1.f87693c.f22739d;
                    }
                    i26 = 3;
                    h4.r rVarA = r1.g0.a(c2.l.C(aVar3, 0.0f, 0.0f, 0.0f, f14, 7), null, 3);
                    if (p1Var4.getF182175a().booleanValue()) {
                        i27 = Integer.MAX_VALUE;
                    } else {
                        i27 = i14;
                    }
                    d6.p.f57793b.getClass();
                    int i36 = d6.p.f57795d;
                    if ((57344 & i25) == 16384) {
                        z16 = true;
                    } else {
                        z16 = z15;
                    }
                    if ((i25 & 896) == 256) {
                        z17 = true;
                    } else {
                        z17 = z15;
                    }
                    z18 = z16 | z17;
                    objQ3 = o0VarE.q();
                    if (z18 || objQ3 == c2565a) {
                        objQ3 = new ct2.e(p1Var4, i14, p1Var5, i26);
                        o0VarE.K(objQ3);
                    }
                    mh.d(cVar, rVarA, 0L, 0L, 0L, null, 0L, i36, false, i27, 0, null, (e23.l) objQ3, x0Var4, o0VarE, i25 & 14, ((i25 << 15) & 234881024) | 384, 110588);
                    if (((Boolean) p1Var5.getF182175a()).booleanValue()) {
                        o0VarE.C(-978304510);
                        y3 y3Var = p7.f89282d;
                        g6.f.f75994b.getClass();
                        p1Var6 = p1Var4;
                        str6 = strQ;
                        str7 = strQ2;
                        p3.v.a(y3Var.c(g6.f.a(g6.f.f75996d)), z3.f.c(-1587658032, new o(p1Var6, str7, str6, x0Var2, 0), o0VarE), o0VarE, 56);
                        o0VarE.g0(z15);
                    } else {
                        p1Var6 = p1Var4;
                        str6 = strQ;
                        str7 = strQ2;
                        o0VarE.C(-977546281);
                        o0VarE.g0(z15);
                    }
                    o0VarE.g0(true);
                    rVar3 = rVar5;
                    p1Var3 = p1Var6;
                    str5 = str7;
                    str4 = str6;
                    x0Var3 = x0Var4;
                } else {
                    o0VarE.e();
                    str4 = str;
                    rVar3 = rVar2;
                    x0Var3 = x0VarB;
                    p1Var3 = p1Var2;
                    str5 = str3;
                }
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new f10.j(cVar, rVar3, i14, x0Var3, p1Var3, str4, str5, x0Var2, i15, i16, 2);
                }
            }
            i17 |= 24576;
            p1Var2 = p1Var;
            if ((196608 & i15) != 0) {
                i17 |= ((i16 & 32) == 0 || !o0VarE.B(str)) ? 65536 : 131072;
            }
            if ((1572864 & i15) == 0) {
                if ((i16 & 64) == 0) {
                    str3 = str2;
                    if (o0VarE.B(str3)) {
                    }
                    i17 |= i35;
                } else {
                    str3 = str2;
                }
                i17 |= i35;
            } else {
                str3 = str2;
            }
            if ((12582912 & i15) != 0) {
                if (o0VarE.B(x0Var2)) {
                    i28 = 8388608;
                } else {
                    i28 = 4194304;
                }
                i17 |= i28;
            }
            if ((4793491 & i17) != 4793490) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i17 & 1, z14)) {
                o0VarE.G0();
                i24 = i15 & 1;
                aVar = p3.m.f135153a;
                if (i24 != 0) {
                    if (i30 != 0) {
                        rVar4 = h4.r.S;
                    } else {
                        rVar4 = rVar2;
                    }
                    if ((i16 & 8) != 0) {
                        d92.b.f58623a.getClass();
                        d92.b.f58624b.getClass();
                        i17 &= -7169;
                        x0VarB = d92.c.b(j92.f.f97932i, o0VarE);
                    }
                    if (i18 != 0) {
                        objQ = o0VarE.q();
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = p3.p0.n(Boolean.FALSE);
                            o0VarE.K(objQ);
                        }
                        p1Var2 = (p3.p1) objQ;
                    }
                    if ((i16 & 32) != 0) {
                        strQ = gl1.y.Q(o0VarE, R.string.lbl_show_more_sentence_case);
                        i17 &= -458753;
                    } else {
                        strQ = str;
                    }
                    if ((i16 & 64) != 0) {
                        strQ2 = gl1.y.Q(o0VarE, R.string.lbl_show_less);
                        i17 &= -3670017;
                    } else {
                        strQ2 = str3;
                    }
                } else {
                    if (i30 != 0) {
                        rVar4 = h4.r.S;
                    } else {
                        rVar4 = rVar2;
                    }
                    if ((i16 & 8) != 0) {
                        d92.b.f58623a.getClass();
                        d92.b.f58624b.getClass();
                        i17 &= -7169;
                        x0VarB = d92.c.b(j92.f.f97932i, o0VarE);
                    }
                    if (i18 != 0) {
                        objQ = o0VarE.q();
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = p3.p0.n(Boolean.FALSE);
                            o0VarE.K(objQ);
                        }
                        p1Var2 = (p3.p1) objQ;
                    }
                    if ((i16 & 32) != 0) {
                        strQ = gl1.y.Q(o0VarE, R.string.lbl_show_more_sentence_case);
                        i17 &= -458753;
                    } else {
                        strQ = str;
                    }
                    if ((i16 & 64) != 0) {
                        strQ2 = gl1.y.Q(o0VarE, R.string.lbl_show_less);
                        i17 &= -3670017;
                    } else {
                        strQ2 = str3;
                    }
                }
                x0Var4 = x0VarB;
                i25 = i17;
                p1Var4 = p1Var2;
                o0VarE.h0();
                p3.x1 x1Var2 = p3.n.f135158a;
                objQ2 = o0VarE.q();
                aVar.getClass();
                c2565a = p3.m.a.f135155b;
                if (objQ2 == c2565a) {
                    objQ2 = p3.p0.n(Boolean.FALSE);
                    o0VarE.K(objQ2);
                }
                p1Var5 = (p3.p1) objQ2;
                c2.j.f22691a.getClass();
                c2.j.k kVar2 = c2.j.f22694d;
                h4.d.f81522a.getClass();
                zVarA = c2.y.a(kVar2, h4.d.a.f81536n, o0VarE, 0);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(rVar4, o0VarE);
                h5.g.V.getClass();
                aVar2 = h5.g.a.f81805b;
                rVar5 = rVar4;
                if (o0VarE.f135177b != null) {
                    p3.p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar2);
                } else {
                    o0VarE.c();
                }
                b4.c(h5.g.a.f81810g, zVarA, o0VarE);
                b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
                bVar = h5.g.a.f81813j;
                if (o0VarE.T) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                } else {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                }
                b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                c2.b0 b0Var2 = c2.b0.f22601a;
                h4.r.a aVar5 = h4.r.S;
                if (((Boolean) p1Var5.getF182175a()).booleanValue()) {
                    z15 = false;
                    f14 = 0;
                    g6.f.a aVar6 = g6.f.f75994b;
                } else {
                    z15 = false;
                    i3.c1.f87691a.getClass();
                    f14 = i3.c1.f87693c.f22739d;
                }
                i26 = 3;
                h4.r rVarA2 = r1.g0.a(c2.l.C(aVar5, 0.0f, 0.0f, 0.0f, f14, 7), null, 3);
                if (p1Var4.getF182175a().booleanValue()) {
                    i27 = Integer.MAX_VALUE;
                } else {
                    i27 = i14;
                }
                d6.p.f57793b.getClass();
                int i37 = d6.p.f57795d;
                if ((57344 & i25) == 16384) {
                    z16 = true;
                } else {
                    z16 = z15;
                }
                if ((i25 & 896) == 256) {
                    z17 = true;
                } else {
                    z17 = z15;
                }
                z18 = z16 | z17;
                objQ3 = o0VarE.q();
                if (z18) {
                    objQ3 = new ct2.e(p1Var4, i14, p1Var5, i26);
                    o0VarE.K(objQ3);
                } else {
                    objQ3 = new ct2.e(p1Var4, i14, p1Var5, i26);
                    o0VarE.K(objQ3);
                }
                mh.d(cVar, rVarA2, 0L, 0L, 0L, null, 0L, i37, false, i27, 0, null, (e23.l) objQ3, x0Var4, o0VarE, i25 & 14, ((i25 << 15) & 234881024) | 384, 110588);
                if (((Boolean) p1Var5.getF182175a()).booleanValue()) {
                    o0VarE.C(-978304510);
                    y3 y3Var2 = p7.f89282d;
                    g6.f.f75994b.getClass();
                    p1Var6 = p1Var4;
                    str6 = strQ;
                    str7 = strQ2;
                    p3.v.a(y3Var2.c(g6.f.a(g6.f.f75996d)), z3.f.c(-1587658032, new o(p1Var6, str7, str6, x0Var2, 0), o0VarE), o0VarE, 56);
                    o0VarE.g0(z15);
                } else {
                    p1Var6 = p1Var4;
                    str6 = strQ;
                    str7 = strQ2;
                    o0VarE.C(-977546281);
                    o0VarE.g0(z15);
                }
                o0VarE.g0(true);
                rVar3 = rVar5;
                p1Var3 = p1Var6;
                str5 = str7;
                str4 = str6;
                x0Var3 = x0Var4;
            } else {
                o0VarE.e();
                str4 = str;
                rVar3 = rVar2;
                x0Var3 = x0VarB;
                p1Var3 = p1Var2;
                str5 = str3;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new f10.j(cVar, rVar3, i14, x0Var3, p1Var3, str4, str5, x0Var2, i15, i16, 2);
            }
        }
        i17 |= 48;
        rVar2 = rVar;
        if ((i15 & 384) == 0) {
            if (o0VarE.k(i14)) {
                i29 = 256;
            } else {
                i29 = 128;
            }
            i17 |= i29;
        }
        if ((i15 & 3072) == 0) {
            if ((i16 & 8) == 0) {
                x0VarB = x0Var;
                if (o0VarE.B(x0VarB)) {
                }
                i17 |= i34;
            } else {
                x0VarB = x0Var;
            }
            i17 |= i34;
        } else {
            x0VarB = x0Var;
        }
        i18 = i16 & 16;
        if (i18 != 0) {
            if ((i15 & 24576) == 0) {
                p1Var2 = p1Var;
                if (o0VarE.B(p1Var2)) {
                    i19 = 16384;
                } else {
                    i19 = 8192;
                }
                i17 |= i19;
            }
            if ((196608 & i15) != 0) {
                i17 |= ((i16 & 32) == 0 || !o0VarE.B(str)) ? 65536 : 131072;
            }
            if ((1572864 & i15) == 0) {
                if ((i16 & 64) == 0) {
                    str3 = str2;
                    if (o0VarE.B(str3)) {
                    }
                    i17 |= i35;
                } else {
                    str3 = str2;
                }
                i17 |= i35;
            } else {
                str3 = str2;
            }
            if ((12582912 & i15) != 0) {
                if (o0VarE.B(x0Var2)) {
                    i28 = 8388608;
                } else {
                    i28 = 4194304;
                }
                i17 |= i28;
            }
            if ((4793491 & i17) != 4793490) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i17 & 1, z14)) {
                o0VarE.G0();
                i24 = i15 & 1;
                aVar = p3.m.f135153a;
                if (i24 != 0) {
                    if (i30 != 0) {
                        rVar4 = h4.r.S;
                    } else {
                        rVar4 = rVar2;
                    }
                    if ((i16 & 8) != 0) {
                        d92.b.f58623a.getClass();
                        d92.b.f58624b.getClass();
                        i17 &= -7169;
                        x0VarB = d92.c.b(j92.f.f97932i, o0VarE);
                    }
                    if (i18 != 0) {
                        objQ = o0VarE.q();
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = p3.p0.n(Boolean.FALSE);
                            o0VarE.K(objQ);
                        }
                        p1Var2 = (p3.p1) objQ;
                    }
                    if ((i16 & 32) != 0) {
                        strQ = gl1.y.Q(o0VarE, R.string.lbl_show_more_sentence_case);
                        i17 &= -458753;
                    } else {
                        strQ = str;
                    }
                    if ((i16 & 64) != 0) {
                        strQ2 = gl1.y.Q(o0VarE, R.string.lbl_show_less);
                        i17 &= -3670017;
                    } else {
                        strQ2 = str3;
                    }
                } else {
                    if (i30 != 0) {
                        rVar4 = h4.r.S;
                    } else {
                        rVar4 = rVar2;
                    }
                    if ((i16 & 8) != 0) {
                        d92.b.f58623a.getClass();
                        d92.b.f58624b.getClass();
                        i17 &= -7169;
                        x0VarB = d92.c.b(j92.f.f97932i, o0VarE);
                    }
                    if (i18 != 0) {
                        objQ = o0VarE.q();
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = p3.p0.n(Boolean.FALSE);
                            o0VarE.K(objQ);
                        }
                        p1Var2 = (p3.p1) objQ;
                    }
                    if ((i16 & 32) != 0) {
                        strQ = gl1.y.Q(o0VarE, R.string.lbl_show_more_sentence_case);
                        i17 &= -458753;
                    } else {
                        strQ = str;
                    }
                    if ((i16 & 64) != 0) {
                        strQ2 = gl1.y.Q(o0VarE, R.string.lbl_show_less);
                        i17 &= -3670017;
                    } else {
                        strQ2 = str3;
                    }
                }
                x0Var4 = x0VarB;
                i25 = i17;
                p1Var4 = p1Var2;
                o0VarE.h0();
                p3.x1 x1Var3 = p3.n.f135158a;
                objQ2 = o0VarE.q();
                aVar.getClass();
                c2565a = p3.m.a.f135155b;
                if (objQ2 == c2565a) {
                    objQ2 = p3.p0.n(Boolean.FALSE);
                    o0VarE.K(objQ2);
                }
                p1Var5 = (p3.p1) objQ2;
                c2.j.f22691a.getClass();
                c2.j.k kVar3 = c2.j.f22694d;
                h4.d.f81522a.getClass();
                zVarA = c2.y.a(kVar3, h4.d.a.f81536n, o0VarE, 0);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(rVar4, o0VarE);
                h5.g.V.getClass();
                aVar2 = h5.g.a.f81805b;
                rVar5 = rVar4;
                if (o0VarE.f135177b != null) {
                    p3.p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar2);
                } else {
                    o0VarE.c();
                }
                b4.c(h5.g.a.f81810g, zVarA, o0VarE);
                b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
                bVar = h5.g.a.f81813j;
                if (o0VarE.T) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                } else {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                }
                b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                c2.b0 b0Var3 = c2.b0.f22601a;
                h4.r.a aVar7 = h4.r.S;
                if (((Boolean) p1Var5.getF182175a()).booleanValue()) {
                    z15 = false;
                    f14 = 0;
                    g6.f.a aVar8 = g6.f.f75994b;
                } else {
                    z15 = false;
                    i3.c1.f87691a.getClass();
                    f14 = i3.c1.f87693c.f22739d;
                }
                i26 = 3;
                h4.r rVarA3 = r1.g0.a(c2.l.C(aVar7, 0.0f, 0.0f, 0.0f, f14, 7), null, 3);
                if (p1Var4.getF182175a().booleanValue()) {
                    i27 = Integer.MAX_VALUE;
                } else {
                    i27 = i14;
                }
                d6.p.f57793b.getClass();
                int i38 = d6.p.f57795d;
                if ((57344 & i25) == 16384) {
                    z16 = true;
                } else {
                    z16 = z15;
                }
                if ((i25 & 896) == 256) {
                    z17 = true;
                } else {
                    z17 = z15;
                }
                z18 = z16 | z17;
                objQ3 = o0VarE.q();
                if (z18) {
                    objQ3 = new ct2.e(p1Var4, i14, p1Var5, i26);
                    o0VarE.K(objQ3);
                } else {
                    objQ3 = new ct2.e(p1Var4, i14, p1Var5, i26);
                    o0VarE.K(objQ3);
                }
                mh.d(cVar, rVarA3, 0L, 0L, 0L, null, 0L, i38, false, i27, 0, null, (e23.l) objQ3, x0Var4, o0VarE, i25 & 14, ((i25 << 15) & 234881024) | 384, 110588);
                if (((Boolean) p1Var5.getF182175a()).booleanValue()) {
                    o0VarE.C(-978304510);
                    y3 y3Var3 = p7.f89282d;
                    g6.f.f75994b.getClass();
                    p1Var6 = p1Var4;
                    str6 = strQ;
                    str7 = strQ2;
                    p3.v.a(y3Var3.c(g6.f.a(g6.f.f75996d)), z3.f.c(-1587658032, new o(p1Var6, str7, str6, x0Var2, 0), o0VarE), o0VarE, 56);
                    o0VarE.g0(z15);
                } else {
                    p1Var6 = p1Var4;
                    str6 = strQ;
                    str7 = strQ2;
                    o0VarE.C(-977546281);
                    o0VarE.g0(z15);
                }
                o0VarE.g0(true);
                rVar3 = rVar5;
                p1Var3 = p1Var6;
                str5 = str7;
                str4 = str6;
                x0Var3 = x0Var4;
            } else {
                o0VarE.e();
                str4 = str;
                rVar3 = rVar2;
                x0Var3 = x0VarB;
                p1Var3 = p1Var2;
                str5 = str3;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new f10.j(cVar, rVar3, i14, x0Var3, p1Var3, str4, str5, x0Var2, i15, i16, 2);
            }
        }
        i17 |= 24576;
        p1Var2 = p1Var;
        if ((196608 & i15) != 0) {
            i17 |= ((i16 & 32) == 0 || !o0VarE.B(str)) ? 65536 : 131072;
        }
        if ((1572864 & i15) == 0) {
            if ((i16 & 64) == 0) {
                str3 = str2;
                if (o0VarE.B(str3)) {
                }
                i17 |= i35;
            } else {
                str3 = str2;
            }
            i17 |= i35;
        } else {
            str3 = str2;
        }
        if ((12582912 & i15) != 0) {
            if (o0VarE.B(x0Var2)) {
                i28 = 8388608;
            } else {
                i28 = 4194304;
            }
            i17 |= i28;
        }
        if ((4793491 & i17) != 4793490) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (o0VarE.n(i17 & 1, z14)) {
            o0VarE.G0();
            i24 = i15 & 1;
            aVar = p3.m.f135153a;
            if (i24 != 0) {
                if (i30 != 0) {
                    rVar4 = h4.r.S;
                } else {
                    rVar4 = rVar2;
                }
                if ((i16 & 8) != 0) {
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    i17 &= -7169;
                    x0VarB = d92.c.b(j92.f.f97932i, o0VarE);
                }
                if (i18 != 0) {
                    objQ = o0VarE.q();
                    aVar.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = p3.p0.n(Boolean.FALSE);
                        o0VarE.K(objQ);
                    }
                    p1Var2 = (p3.p1) objQ;
                }
                if ((i16 & 32) != 0) {
                    strQ = gl1.y.Q(o0VarE, R.string.lbl_show_more_sentence_case);
                    i17 &= -458753;
                } else {
                    strQ = str;
                }
                if ((i16 & 64) != 0) {
                    strQ2 = gl1.y.Q(o0VarE, R.string.lbl_show_less);
                    i17 &= -3670017;
                } else {
                    strQ2 = str3;
                }
            } else {
                if (i30 != 0) {
                    rVar4 = h4.r.S;
                } else {
                    rVar4 = rVar2;
                }
                if ((i16 & 8) != 0) {
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    i17 &= -7169;
                    x0VarB = d92.c.b(j92.f.f97932i, o0VarE);
                }
                if (i18 != 0) {
                    objQ = o0VarE.q();
                    aVar.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = p3.p0.n(Boolean.FALSE);
                        o0VarE.K(objQ);
                    }
                    p1Var2 = (p3.p1) objQ;
                }
                if ((i16 & 32) != 0) {
                    strQ = gl1.y.Q(o0VarE, R.string.lbl_show_more_sentence_case);
                    i17 &= -458753;
                } else {
                    strQ = str;
                }
                if ((i16 & 64) != 0) {
                    strQ2 = gl1.y.Q(o0VarE, R.string.lbl_show_less);
                    i17 &= -3670017;
                } else {
                    strQ2 = str3;
                }
            }
            x0Var4 = x0VarB;
            i25 = i17;
            p1Var4 = p1Var2;
            o0VarE.h0();
            p3.x1 x1Var4 = p3.n.f135158a;
            objQ2 = o0VarE.q();
            aVar.getClass();
            c2565a = p3.m.a.f135155b;
            if (objQ2 == c2565a) {
                objQ2 = p3.p0.n(Boolean.FALSE);
                o0VarE.K(objQ2);
            }
            p1Var5 = (p3.p1) objQ2;
            c2.j.f22691a.getClass();
            c2.j.k kVar4 = c2.j.f22694d;
            h4.d.f81522a.getClass();
            zVarA = c2.y.a(kVar4, h4.d.a.f81536n, o0VarE, 0);
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = h4.k.c(rVar4, o0VarE);
            h5.g.V.getClass();
            aVar2 = h5.g.a.f81805b;
            rVar5 = rVar4;
            if (o0VarE.f135177b != null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            bVar = h5.g.a.f81813j;
            if (o0VarE.T) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            } else {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var4 = c2.b0.f22601a;
            h4.r.a aVar9 = h4.r.S;
            if (((Boolean) p1Var5.getF182175a()).booleanValue()) {
                z15 = false;
                f14 = 0;
                g6.f.a aVar10 = g6.f.f75994b;
            } else {
                z15 = false;
                i3.c1.f87691a.getClass();
                f14 = i3.c1.f87693c.f22739d;
            }
            i26 = 3;
            h4.r rVarA4 = r1.g0.a(c2.l.C(aVar9, 0.0f, 0.0f, 0.0f, f14, 7), null, 3);
            if (p1Var4.getF182175a().booleanValue()) {
                i27 = Integer.MAX_VALUE;
            } else {
                i27 = i14;
            }
            d6.p.f57793b.getClass();
            int i39 = d6.p.f57795d;
            if ((57344 & i25) == 16384) {
                z16 = true;
            } else {
                z16 = z15;
            }
            if ((i25 & 896) == 256) {
                z17 = true;
            } else {
                z17 = z15;
            }
            z18 = z16 | z17;
            objQ3 = o0VarE.q();
            if (z18) {
                objQ3 = new ct2.e(p1Var4, i14, p1Var5, i26);
                o0VarE.K(objQ3);
            } else {
                objQ3 = new ct2.e(p1Var4, i14, p1Var5, i26);
                o0VarE.K(objQ3);
            }
            mh.d(cVar, rVarA4, 0L, 0L, 0L, null, 0L, i39, false, i27, 0, null, (e23.l) objQ3, x0Var4, o0VarE, i25 & 14, ((i25 << 15) & 234881024) | 384, 110588);
            if (((Boolean) p1Var5.getF182175a()).booleanValue()) {
                o0VarE.C(-978304510);
                y3 y3Var4 = p7.f89282d;
                g6.f.f75994b.getClass();
                p1Var6 = p1Var4;
                str6 = strQ;
                str7 = strQ2;
                p3.v.a(y3Var4.c(g6.f.a(g6.f.f75996d)), z3.f.c(-1587658032, new o(p1Var6, str7, str6, x0Var2, 0), o0VarE), o0VarE, 56);
                o0VarE.g0(z15);
            } else {
                p1Var6 = p1Var4;
                str6 = strQ;
                str7 = strQ2;
                o0VarE.C(-977546281);
                o0VarE.g0(z15);
            }
            o0VarE.g0(true);
            rVar3 = rVar5;
            p1Var3 = p1Var6;
            str5 = str7;
            str4 = str6;
            x0Var3 = x0Var4;
        } else {
            o0VarE.e();
            str4 = str;
            rVar3 = rVar2;
            x0Var3 = x0VarB;
            p1Var3 = p1Var2;
            str5 = str3;
        }
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new f10.j(cVar, rVar3, i14, x0Var3, p1Var3, str4, str5, x0Var2, i15, i16, 2);
        }
    }
}
