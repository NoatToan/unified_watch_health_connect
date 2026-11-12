package m92;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import p005kotlin.Unit;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final class r {
    /* JADX WARN: Code duplicated, block: B:102:0x0132  */
    /* JADX WARN: Code duplicated, block: B:106:0x013a  */
    /* JADX WARN: Code duplicated, block: B:109:0x0144 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:110:0x0146  */
    /* JADX WARN: Code duplicated, block: B:111:0x0149  */
    /* JADX WARN: Code duplicated, block: B:113:0x014c  */
    /* JADX WARN: Code duplicated, block: B:114:0x014e  */
    /* JADX WARN: Code duplicated, block: B:117:0x0153  */
    /* JADX WARN: Code duplicated, block: B:118:0x0155  */
    /* JADX WARN: Code duplicated, block: B:120:0x0158  */
    /* JADX WARN: Code duplicated, block: B:121:0x015a  */
    /* JADX WARN: Code duplicated, block: B:125:0x0165  */
    /* JADX WARN: Code duplicated, block: B:128:0x016d  */
    /* JADX WARN: Code duplicated, block: B:130:0x0176  */
    /* JADX WARN: Code duplicated, block: B:132:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:135:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:137:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x0072  */
    /* JADX WARN: Code duplicated, block: B:40:0x0077  */
    /* JADX WARN: Code duplicated, block: B:42:0x007b  */
    /* JADX WARN: Code duplicated, block: B:44:0x0083  */
    /* JADX WARN: Code duplicated, block: B:45:0x0086  */
    /* JADX WARN: Code duplicated, block: B:49:0x008e  */
    /* JADX WARN: Code duplicated, block: B:51:0x0096  */
    /* JADX WARN: Code duplicated, block: B:52:0x0099  */
    /* JADX WARN: Code duplicated, block: B:54:0x009e  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:70:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:80:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:87:0x0102  */
    /* JADX WARN: Code duplicated, block: B:89:0x0108  */
    /* JADX WARN: Code duplicated, block: B:90:0x010b  */
    /* JADX WARN: Code duplicated, block: B:94:0x0115  */
    /* JADX WARN: Code duplicated, block: B:96:0x011b  */
    /* JADX WARN: Code duplicated, block: B:97:0x011e  */
    /* JADX WARN: Code duplicated, block: B:99:0x0123  */
    public static final void a(h4.r rVar, i53.c<? extends e23.l<? super q4.f, ? extends i53.g<Float, Float>>> cVar, e23.p<? super p3.m, ? super Integer, Unit> pVar, g6.f fVar, boolean z14, String str, float f14, float f15, n92.a aVar, e23.p<? super p3.m, ? super Integer, Unit> pVar2, e23.q<? super Float, ? super p3.m, ? super Integer, Unit> qVar, p3.m mVar, int i14, int i15, int i16) {
        int i17;
        g6.f fVar2;
        int i18;
        boolean z15;
        int i19;
        String str2;
        int i24;
        float f16;
        int i25;
        int i26;
        int i27;
        int i28;
        boolean z16;
        float f17;
        float f18;
        g6.f fVar3;
        boolean z17;
        p2 p2VarI0;
        g6.f fVar4;
        boolean z18;
        float f19;
        float f22;
        boolean z19;
        Object objQ;
        int i29;
        int i30;
        boolean zR;
        int i34;
        int i35;
        cVar.getClass();
        pVar.getClass();
        str.getClass();
        p3.o0 o0VarE = mVar.E(-919377447);
        if ((i14 & 6) == 0) {
            i17 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i17 = i14;
        }
        if ((i14 & 48) == 0) {
            i17 |= o0VarE.B(cVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i17 |= o0VarE.r(pVar) ? 256 : 128;
        }
        int i36 = i16 & 8;
        if (i36 == 0) {
            if ((i14 & 3072) == 0) {
                fVar2 = fVar;
                i17 |= o0VarE.B(fVar2) ? 2048 : 1024;
            }
            i18 = i16 & 16;
            if (i18 != 0) {
                if ((i14 & 24576) == 0) {
                    z15 = z14;
                    if (o0VarE.h(z15)) {
                        i19 = 16384;
                    } else {
                        i19 = 8192;
                    }
                    i17 |= i19;
                }
                if ((196608 & i14) == 0) {
                    str2 = str;
                    if (o0VarE.B(str2)) {
                        i35 = 131072;
                    } else {
                        i35 = 65536;
                    }
                    i17 |= i35;
                } else {
                    str2 = str;
                }
                i24 = i16 & 64;
                if (i24 != 0) {
                    i17 |= 1572864;
                    f16 = f14;
                } else {
                    f16 = f14;
                    if ((i14 & 1572864) == 0) {
                        if (o0VarE.i(f16)) {
                            i25 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                        } else {
                            i25 = 524288;
                        }
                        i17 |= i25;
                    }
                }
                i26 = i16 & 128;
                if (i26 != 0) {
                    i17 |= 12582912;
                } else if ((i14 & 12582912) == 0) {
                    if (o0VarE.i(f15)) {
                        i27 = 8388608;
                    } else {
                        i27 = 4194304;
                    }
                    i17 |= i27;
                }
                if ((i14 & 100663296) == 0) {
                    if ((i14 & 134217728) == 0) {
                        zR = o0VarE.B(aVar);
                    } else {
                        zR = o0VarE.r(aVar);
                    }
                    if (zR) {
                        i34 = 67108864;
                    } else {
                        i34 = 33554432;
                    }
                    i17 |= i34;
                }
                if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                    if (o0VarE.r(pVar2)) {
                        i30 = 536870912;
                    } else {
                        i30 = 268435456;
                    }
                    i17 |= i30;
                }
                if ((i15 & 6) == 0) {
                    if (o0VarE.r(qVar)) {
                        i29 = 4;
                    } else {
                        i29 = 2;
                    }
                    i28 = i15 | i29;
                } else {
                    i28 = i15;
                }
                if ((i17 & 306783379) == 306783378 || (i28 & 3) != 2) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (o0VarE.n(i17 & 1, z16)) {
                    if (i36 != 0) {
                        fVar4 = null;
                    } else {
                        fVar4 = fVar2;
                    }
                    if (i18 != 0) {
                        z18 = false;
                    } else {
                        z18 = z15;
                    }
                    if (i24 != 0) {
                        f19 = 0.0f;
                    } else {
                        f19 = f16;
                    }
                    if (i26 != 0) {
                        f22 = 0.0f;
                    } else {
                        f22 = f15;
                    }
                    x1 x1Var = p3.n.f135158a;
                    z19 = (i17 & 112) == 32;
                    objQ = o0VarE.q();
                    if (z19) {
                        objQ = new q(cVar, 0);
                        o0VarE.K(objQ);
                    } else {
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new q(cVar, 0);
                            o0VarE.K(objQ);
                        }
                    }
                    int i37 = i17 >> 3;
                    l.a(rVar, pVar, fVar4, str2, z18, f19, f22, aVar, pVar2, qVar, (e23.l) objQ, o0VarE, (i17 & 14) | (i37 & 112) | (i37 & 896) | ((i17 >> 6) & 7168) | (57344 & i17) | (458752 & i37) | (3670016 & i37) | (29360128 & i37) | (i37 & 234881024) | ((i28 << 27) & 1879048192), 0);
                    fVar3 = fVar4;
                    z17 = z18;
                    f18 = f19;
                    f17 = f22;
                } else {
                    o0VarE.e();
                    f17 = f15;
                    f18 = f16;
                    fVar3 = fVar2;
                    z17 = z15;
                }
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new p(rVar, cVar, pVar, fVar3, z17, str, f18, f17, aVar, pVar2, qVar, i14, i15, i16);
                }
            }
            i17 |= 24576;
            z15 = z14;
            if ((196608 & i14) == 0) {
                str2 = str;
                if (o0VarE.B(str2)) {
                    i35 = 131072;
                } else {
                    i35 = 65536;
                }
                i17 |= i35;
            } else {
                str2 = str;
            }
            i24 = i16 & 64;
            if (i24 != 0) {
                i17 |= 1572864;
                f16 = f14;
            } else {
                f16 = f14;
                if ((i14 & 1572864) == 0) {
                    if (o0VarE.i(f16)) {
                        i25 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    } else {
                        i25 = 524288;
                    }
                    i17 |= i25;
                }
            }
            i26 = i16 & 128;
            if (i26 != 0) {
                i17 |= 12582912;
            } else if ((i14 & 12582912) == 0) {
                if (o0VarE.i(f15)) {
                    i27 = 8388608;
                } else {
                    i27 = 4194304;
                }
                i17 |= i27;
            }
            if ((i14 & 100663296) == 0) {
                if ((i14 & 134217728) == 0) {
                    zR = o0VarE.B(aVar);
                } else {
                    zR = o0VarE.r(aVar);
                }
                if (zR) {
                    i34 = 67108864;
                } else {
                    i34 = 33554432;
                }
                i17 |= i34;
            }
            if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                if (o0VarE.r(pVar2)) {
                    i30 = 536870912;
                } else {
                    i30 = 268435456;
                }
                i17 |= i30;
            }
            if ((i15 & 6) == 0) {
                if (o0VarE.r(qVar)) {
                    i29 = 4;
                } else {
                    i29 = 2;
                }
                i28 = i15 | i29;
            } else {
                i28 = i15;
            }
            if ((i17 & 306783379) == 306783378) {
                z16 = true;
            } else {
                z16 = true;
            }
            if (o0VarE.n(i17 & 1, z16)) {
                if (i36 != 0) {
                    fVar4 = null;
                } else {
                    fVar4 = fVar2;
                }
                if (i18 != 0) {
                    z18 = false;
                } else {
                    z18 = z15;
                }
                if (i24 != 0) {
                    f19 = 0.0f;
                } else {
                    f19 = f16;
                }
                if (i26 != 0) {
                    f22 = 0.0f;
                } else {
                    f22 = f15;
                }
                x1 x1Var2 = p3.n.f135158a;
                if ((i17 & 112) == 32) {
                }
                objQ = o0VarE.q();
                if (z19) {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new q(cVar, 0);
                        o0VarE.K(objQ);
                    }
                } else {
                    objQ = new q(cVar, 0);
                    o0VarE.K(objQ);
                }
                int i38 = i17 >> 3;
                l.a(rVar, pVar, fVar4, str2, z18, f19, f22, aVar, pVar2, qVar, (e23.l) objQ, o0VarE, (i17 & 14) | (i38 & 112) | (i38 & 896) | ((i17 >> 6) & 7168) | (57344 & i17) | (458752 & i38) | (3670016 & i38) | (29360128 & i38) | (i38 & 234881024) | ((i28 << 27) & 1879048192), 0);
                fVar3 = fVar4;
                z17 = z18;
                f18 = f19;
                f17 = f22;
            } else {
                o0VarE.e();
                f17 = f15;
                f18 = f16;
                fVar3 = fVar2;
                z17 = z15;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new p(rVar, cVar, pVar, fVar3, z17, str, f18, f17, aVar, pVar2, qVar, i14, i15, i16);
            }
        }
        i17 |= 3072;
        fVar2 = fVar;
        i18 = i16 & 16;
        if (i18 != 0) {
            if ((i14 & 24576) == 0) {
                z15 = z14;
                if (o0VarE.h(z15)) {
                    i19 = 16384;
                } else {
                    i19 = 8192;
                }
                i17 |= i19;
            }
            if ((196608 & i14) == 0) {
                str2 = str;
                if (o0VarE.B(str2)) {
                    i35 = 131072;
                } else {
                    i35 = 65536;
                }
                i17 |= i35;
            } else {
                str2 = str;
            }
            i24 = i16 & 64;
            if (i24 != 0) {
                i17 |= 1572864;
                f16 = f14;
            } else {
                f16 = f14;
                if ((i14 & 1572864) == 0) {
                    if (o0VarE.i(f16)) {
                        i25 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    } else {
                        i25 = 524288;
                    }
                    i17 |= i25;
                }
            }
            i26 = i16 & 128;
            if (i26 != 0) {
                i17 |= 12582912;
            } else if ((i14 & 12582912) == 0) {
                if (o0VarE.i(f15)) {
                    i27 = 8388608;
                } else {
                    i27 = 4194304;
                }
                i17 |= i27;
            }
            if ((i14 & 100663296) == 0) {
                if ((i14 & 134217728) == 0) {
                    zR = o0VarE.B(aVar);
                } else {
                    zR = o0VarE.r(aVar);
                }
                if (zR) {
                    i34 = 67108864;
                } else {
                    i34 = 33554432;
                }
                i17 |= i34;
            }
            if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                if (o0VarE.r(pVar2)) {
                    i30 = 536870912;
                } else {
                    i30 = 268435456;
                }
                i17 |= i30;
            }
            if ((i15 & 6) == 0) {
                if (o0VarE.r(qVar)) {
                    i29 = 4;
                } else {
                    i29 = 2;
                }
                i28 = i15 | i29;
            } else {
                i28 = i15;
            }
            if ((i17 & 306783379) == 306783378) {
                z16 = true;
            } else {
                z16 = true;
            }
            if (o0VarE.n(i17 & 1, z16)) {
                if (i36 != 0) {
                    fVar4 = null;
                } else {
                    fVar4 = fVar2;
                }
                if (i18 != 0) {
                    z18 = false;
                } else {
                    z18 = z15;
                }
                if (i24 != 0) {
                    f19 = 0.0f;
                } else {
                    f19 = f16;
                }
                if (i26 != 0) {
                    f22 = 0.0f;
                } else {
                    f22 = f15;
                }
                x1 x1Var3 = p3.n.f135158a;
                if ((i17 & 112) == 32) {
                }
                objQ = o0VarE.q();
                if (z19) {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new q(cVar, 0);
                        o0VarE.K(objQ);
                    }
                } else {
                    objQ = new q(cVar, 0);
                    o0VarE.K(objQ);
                }
                int i39 = i17 >> 3;
                l.a(rVar, pVar, fVar4, str2, z18, f19, f22, aVar, pVar2, qVar, (e23.l) objQ, o0VarE, (i17 & 14) | (i39 & 112) | (i39 & 896) | ((i17 >> 6) & 7168) | (57344 & i17) | (458752 & i39) | (3670016 & i39) | (29360128 & i39) | (i39 & 234881024) | ((i28 << 27) & 1879048192), 0);
                fVar3 = fVar4;
                z17 = z18;
                f18 = f19;
                f17 = f22;
            } else {
                o0VarE.e();
                f17 = f15;
                f18 = f16;
                fVar3 = fVar2;
                z17 = z15;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new p(rVar, cVar, pVar, fVar3, z17, str, f18, f17, aVar, pVar2, qVar, i14, i15, i16);
            }
        }
        i17 |= 24576;
        z15 = z14;
        if ((196608 & i14) == 0) {
            str2 = str;
            if (o0VarE.B(str2)) {
                i35 = 131072;
            } else {
                i35 = 65536;
            }
            i17 |= i35;
        } else {
            str2 = str;
        }
        i24 = i16 & 64;
        if (i24 != 0) {
            i17 |= 1572864;
            f16 = f14;
        } else {
            f16 = f14;
            if ((i14 & 1572864) == 0) {
                if (o0VarE.i(f16)) {
                    i25 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                } else {
                    i25 = 524288;
                }
                i17 |= i25;
            }
        }
        i26 = i16 & 128;
        if (i26 != 0) {
            i17 |= 12582912;
        } else if ((i14 & 12582912) == 0) {
            if (o0VarE.i(f15)) {
                i27 = 8388608;
            } else {
                i27 = 4194304;
            }
            i17 |= i27;
        }
        if ((i14 & 100663296) == 0) {
            if ((i14 & 134217728) == 0) {
                zR = o0VarE.B(aVar);
            } else {
                zR = o0VarE.r(aVar);
            }
            if (zR) {
                i34 = 67108864;
            } else {
                i34 = 33554432;
            }
            i17 |= i34;
        }
        if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
            if (o0VarE.r(pVar2)) {
                i30 = 536870912;
            } else {
                i30 = 268435456;
            }
            i17 |= i30;
        }
        if ((i15 & 6) == 0) {
            if (o0VarE.r(qVar)) {
                i29 = 4;
            } else {
                i29 = 2;
            }
            i28 = i15 | i29;
        } else {
            i28 = i15;
        }
        if ((i17 & 306783379) == 306783378) {
            z16 = true;
        } else {
            z16 = true;
        }
        if (o0VarE.n(i17 & 1, z16)) {
            if (i36 != 0) {
                fVar4 = null;
            } else {
                fVar4 = fVar2;
            }
            if (i18 != 0) {
                z18 = false;
            } else {
                z18 = z15;
            }
            if (i24 != 0) {
                f19 = 0.0f;
            } else {
                f19 = f16;
            }
            if (i26 != 0) {
                f22 = 0.0f;
            } else {
                f22 = f15;
            }
            x1 x1Var4 = p3.n.f135158a;
            if ((i17 & 112) == 32) {
            }
            objQ = o0VarE.q();
            if (z19) {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new q(cVar, 0);
                    o0VarE.K(objQ);
                }
            } else {
                objQ = new q(cVar, 0);
                o0VarE.K(objQ);
            }
            int i310 = i17 >> 3;
            l.a(rVar, pVar, fVar4, str2, z18, f19, f22, aVar, pVar2, qVar, (e23.l) objQ, o0VarE, (i17 & 14) | (i310 & 112) | (i310 & 896) | ((i17 >> 6) & 7168) | (57344 & i17) | (458752 & i310) | (3670016 & i310) | (29360128 & i310) | (i310 & 234881024) | ((i28 << 27) & 1879048192), 0);
            fVar3 = fVar4;
            z17 = z18;
            f18 = f19;
            f17 = f22;
        } else {
            o0VarE.e();
            f17 = f15;
            f18 = f16;
            fVar3 = fVar2;
            z17 = z15;
        }
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new p(rVar, cVar, pVar, fVar3, z17, str, f18, f17, aVar, pVar2, qVar, i14, i15, i16);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0123  */
    /* JADX WARN: Code duplicated, block: B:101:0x0126  */
    /* JADX WARN: Code duplicated, block: B:105:0x012e  */
    /* JADX WARN: Code duplicated, block: B:106:0x0137  */
    /* JADX WARN: Code duplicated, block: B:108:0x013b  */
    /* JADX WARN: Code duplicated, block: B:110:0x0145  */
    /* JADX WARN: Code duplicated, block: B:111:0x0148  */
    /* JADX WARN: Code duplicated, block: B:113:0x014d  */
    /* JADX WARN: Code duplicated, block: B:116:0x0161  */
    /* JADX WARN: Code duplicated, block: B:120:0x016a  */
    /* JADX WARN: Code duplicated, block: B:123:0x0173  */
    /* JADX WARN: Code duplicated, block: B:125:0x0178  */
    /* JADX WARN: Code duplicated, block: B:126:0x017b  */
    /* JADX WARN: Code duplicated, block: B:128:0x017f  */
    /* JADX WARN: Code duplicated, block: B:131:0x0184  */
    /* JADX WARN: Code duplicated, block: B:132:0x0187  */
    /* JADX WARN: Code duplicated, block: B:135:0x018c  */
    /* JADX WARN: Code duplicated, block: B:136:0x0191  */
    /* JADX WARN: Code duplicated, block: B:138:0x0199  */
    /* JADX WARN: Code duplicated, block: B:139:0x019e  */
    /* JADX WARN: Code duplicated, block: B:141:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:142:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:144:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:145:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:147:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:148:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:150:0x020a  */
    /* JADX WARN: Code duplicated, block: B:153:0x0221  */
    /* JADX WARN: Code duplicated, block: B:155:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x005b  */
    /* JADX WARN: Code duplicated, block: B:33:0x0060  */
    /* JADX WARN: Code duplicated, block: B:35:0x0064  */
    /* JADX WARN: Code duplicated, block: B:37:0x006c  */
    /* JADX WARN: Code duplicated, block: B:38:0x006f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0076  */
    /* JADX WARN: Code duplicated, block: B:44:0x007b  */
    /* JADX WARN: Code duplicated, block: B:46:0x007f  */
    /* JADX WARN: Code duplicated, block: B:48:0x0087  */
    /* JADX WARN: Code duplicated, block: B:49:0x008a  */
    /* JADX WARN: Code duplicated, block: B:53:0x0092  */
    /* JADX WARN: Code duplicated, block: B:55:0x009a  */
    /* JADX WARN: Code duplicated, block: B:56:0x009d  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:61:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:62:0x00af  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:66:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:67:0x00be  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:73:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:77:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:82:0x00ea A[PHI: r19
      0x00ea: PHI (r19v21 int) = (r19v4 int), (r19v10 int), (r19v11 int) binds: [B:81:0x00e8, B:91:0x0105, B:90:0x0102] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:83:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:88:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:90:0x0102  */
    /* JADX WARN: Code duplicated, block: B:91:0x0105  */
    /* JADX WARN: Code duplicated, block: B:94:0x010e  */
    /* JADX WARN: Code duplicated, block: B:96:0x0115  */
    /* JADX WARN: Code duplicated, block: B:98:0x0119  */
    public static final void b(h4.r rVar, i53.c<? extends e23.l<? super q4.f, ? extends i53.g<Float, Float>>> cVar, g6.f fVar, String str, boolean z14, String str2, float f14, float f15, n92.a aVar, e23.p<? super p3.m, ? super Integer, Unit> pVar, e23.q<? super Float, ? super p3.m, ? super Integer, Unit> qVar, p3.m mVar, int i14, int i15, int i16) {
        int i17;
        i53.c<? extends e23.l<? super q4.f, ? extends i53.g<Float, Float>>> cVar2;
        g6.f fVar2;
        int i18;
        String str3;
        int i19;
        int i24;
        boolean z15;
        int i25;
        String str4;
        int i26;
        float f16;
        int i27;
        int i28;
        int i29;
        int i30;
        int i34;
        int i35;
        boolean zR;
        int i36;
        int i37;
        int i38;
        int i39;
        int i44;
        boolean z16;
        p3.o0 o0Var;
        float f17;
        e23.p<? super p3.m, ? super Integer, Unit> pVar2;
        g6.f fVar3;
        boolean z17;
        e23.q<? super Float, ? super p3.m, ? super Integer, Unit> qVar2;
        float f18;
        String str5;
        n92.a aVar2;
        p2 p2VarI0;
        g6.f fVar4;
        boolean z18;
        float f19;
        int i45;
        float f22;
        n92.a aVar3;
        e23.p<? super p3.m, ? super Integer, Unit> pVar3;
        e23.q<? super Float, ? super p3.m, ? super Integer, Unit> qVar3;
        int i46;
        cVar.getClass();
        str2.getClass();
        p3.o0 o0VarE = mVar.E(296620533);
        if ((i14 & 6) == 0) {
            i17 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i17 = i14;
        }
        if ((i14 & 48) == 0) {
            cVar2 = cVar;
            i17 |= o0VarE.B(cVar2) ? 32 : 16;
        } else {
            cVar2 = cVar;
        }
        int i47 = i16 & 4;
        if (i47 == 0) {
            if ((i14 & 384) == 0) {
                fVar2 = fVar;
                i17 |= o0VarE.B(fVar2) ? 256 : 128;
            }
            i18 = i16 & 8;
            if (i18 != 0) {
                if ((i14 & 3072) == 0) {
                    str3 = str;
                    if (o0VarE.B(str3)) {
                        i19 = 2048;
                    } else {
                        i19 = 1024;
                    }
                    i17 |= i19;
                }
                i24 = i16 & 16;
                if (i24 != 0) {
                    if ((i14 & 24576) == 0) {
                        z15 = z14;
                        if (o0VarE.h(z15)) {
                            i25 = 16384;
                        } else {
                            i25 = 8192;
                        }
                        i17 |= i25;
                    }
                    if ((196608 & i14) == 0) {
                        str4 = str2;
                        if (o0VarE.B(str4)) {
                            i46 = 131072;
                        } else {
                            i46 = 65536;
                        }
                        i17 |= i46;
                    } else {
                        str4 = str2;
                    }
                    i26 = i16 & 64;
                    if (i26 != 0) {
                        i17 |= 1572864;
                        f16 = f14;
                    } else {
                        f16 = f14;
                        if ((i14 & 1572864) == 0) {
                            if (o0VarE.i(f16)) {
                                i27 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                            } else {
                                i27 = 524288;
                            }
                            i17 |= i27;
                        }
                    }
                    i28 = i16 & 128;
                    if (i28 != 0) {
                        if ((i14 & 12582912) == 0) {
                            int i48 = i17;
                            if (o0VarE.i(f15)) {
                                i29 = 8388608;
                            } else {
                                i29 = 4194304;
                            }
                            i30 = i48 | i29;
                        }
                        i34 = i16 & 256;
                        i35 = 100663296;
                        if (i34 == 0) {
                            i30 |= i35;
                        } else if ((i14 & 100663296) == 0) {
                            if ((i14 & 134217728) == 0) {
                                zR = o0VarE.B(aVar);
                            } else {
                                zR = o0VarE.r(aVar);
                            }
                            if (zR) {
                                i35 = 67108864;
                            } else {
                                i35 = 33554432;
                            }
                            i30 |= i35;
                        }
                        i36 = i16 & 512;
                        if (i36 != 0) {
                            if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                                if (o0VarE.r(pVar)) {
                                    i37 = 536870912;
                                } else {
                                    i37 = 268435456;
                                }
                                i30 |= i37;
                            }
                            i38 = i16 & 1024;
                            if (i38 != 0) {
                                i39 = 6;
                            } else if ((i15 & 6) == 0) {
                                if (o0VarE.r(qVar)) {
                                    i44 = 4;
                                } else {
                                    i44 = 2;
                                }
                                i39 = i15 | i44;
                            } else {
                                i39 = i15;
                            }
                            if ((i30 & 306783379) == 306783378 || (i39 & 3) != 2) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            if (o0VarE.n(i30 & 1, z16)) {
                                int i49 = i30;
                                if (i47 != 0) {
                                    fVar4 = null;
                                } else {
                                    fVar4 = fVar2;
                                }
                                if (i18 != 0) {
                                    str3 = null;
                                }
                                if (i24 != 0) {
                                    z18 = false;
                                } else {
                                    z18 = z15;
                                }
                                if (i26 != 0) {
                                    i45 = i39;
                                    f19 = 0.0f;
                                } else {
                                    int i54 = i39;
                                    f19 = f16;
                                    i45 = i54;
                                }
                                if (i28 != 0) {
                                    f22 = 0.0f;
                                } else {
                                    f22 = f15;
                                }
                                if (i34 != 0) {
                                    aVar3 = null;
                                } else {
                                    aVar3 = aVar;
                                }
                                if (i36 != 0) {
                                    pVar3 = null;
                                } else {
                                    pVar3 = pVar;
                                }
                                if (i38 != 0) {
                                    qVar3 = null;
                                } else {
                                    qVar3 = qVar;
                                }
                                x1 x1Var = p3.n.f135158a;
                                o0Var = o0VarE;
                                a(rVar, cVar2, z3.f.c(263761673, new fv1.b(str3, 23), o0VarE), fVar4, z18, str4, f19, f22, aVar3, pVar3, qVar3, o0Var, (i49 & 14) | 384 | (i49 & 112) | ((i49 << 3) & 7168) | (57344 & i49) | (458752 & i49) | (3670016 & i49) | (29360128 & i49) | (234881024 & i49) | (i49 & 1879048192), i45 & 14, 0);
                                str5 = str3;
                                fVar3 = fVar4;
                                z17 = z18;
                                f18 = f19;
                                f17 = f22;
                                aVar2 = aVar3;
                                pVar2 = pVar3;
                                qVar2 = qVar3;
                            } else {
                                o0Var = o0VarE;
                                o0Var.e();
                                f17 = f15;
                                pVar2 = pVar;
                                fVar3 = fVar2;
                                z17 = z15;
                                qVar2 = qVar;
                                f18 = f16;
                                str5 = str3;
                                aVar2 = aVar;
                            }
                            p2VarI0 = o0Var.i0();
                            if (p2VarI0 != null) {
                                p2VarI0.f135219d = new p(rVar, cVar, fVar3, str5, z17, str2, f18, f17, aVar2, pVar2, qVar2, i14, i15, i16);
                            }
                        }
                        i30 |= C.ENCODING_PCM_32BIT;
                        i38 = i16 & 1024;
                        if (i38 != 0) {
                            i39 = 6;
                        } else if ((i15 & 6) == 0) {
                            if (o0VarE.r(qVar)) {
                                i44 = 4;
                            } else {
                                i44 = 2;
                            }
                            i39 = i15 | i44;
                        } else {
                            i39 = i15;
                        }
                        if ((i30 & 306783379) == 306783378) {
                            z16 = true;
                        } else {
                            z16 = true;
                        }
                        if (o0VarE.n(i30 & 1, z16)) {
                            int i410 = i30;
                            if (i47 != 0) {
                                fVar4 = null;
                            } else {
                                fVar4 = fVar2;
                            }
                            if (i18 != 0) {
                                str3 = null;
                            }
                            if (i24 != 0) {
                                z18 = false;
                            } else {
                                z18 = z15;
                            }
                            if (i26 != 0) {
                                i45 = i39;
                                f19 = 0.0f;
                            } else {
                                int i55 = i39;
                                f19 = f16;
                                i45 = i55;
                            }
                            if (i28 != 0) {
                                f22 = 0.0f;
                            } else {
                                f22 = f15;
                            }
                            if (i34 != 0) {
                                aVar3 = null;
                            } else {
                                aVar3 = aVar;
                            }
                            if (i36 != 0) {
                                pVar3 = null;
                            } else {
                                pVar3 = pVar;
                            }
                            if (i38 != 0) {
                                qVar3 = null;
                            } else {
                                qVar3 = qVar;
                            }
                            x1 x1Var2 = p3.n.f135158a;
                            o0Var = o0VarE;
                            a(rVar, cVar2, z3.f.c(263761673, new fv1.b(str3, 23), o0VarE), fVar4, z18, str4, f19, f22, aVar3, pVar3, qVar3, o0Var, (i410 & 14) | 384 | (i410 & 112) | ((i410 << 3) & 7168) | (57344 & i410) | (458752 & i410) | (3670016 & i410) | (29360128 & i410) | (234881024 & i410) | (i410 & 1879048192), i45 & 14, 0);
                            str5 = str3;
                            fVar3 = fVar4;
                            z17 = z18;
                            f18 = f19;
                            f17 = f22;
                            aVar2 = aVar3;
                            pVar2 = pVar3;
                            qVar2 = qVar3;
                        } else {
                            o0Var = o0VarE;
                            o0Var.e();
                            f17 = f15;
                            pVar2 = pVar;
                            fVar3 = fVar2;
                            z17 = z15;
                            qVar2 = qVar;
                            f18 = f16;
                            str5 = str3;
                            aVar2 = aVar;
                        }
                        p2VarI0 = o0Var.i0();
                        if (p2VarI0 != null) {
                            p2VarI0.f135219d = new p(rVar, cVar, fVar3, str5, z17, str2, f18, f17, aVar2, pVar2, qVar2, i14, i15, i16);
                        }
                    }
                    i17 |= 12582912;
                    i30 = i17;
                    i34 = i16 & 256;
                    i35 = 100663296;
                    if (i34 == 0) {
                        i30 |= i35;
                    } else if ((i14 & 100663296) == 0) {
                        if ((i14 & 134217728) == 0) {
                            zR = o0VarE.B(aVar);
                        } else {
                            zR = o0VarE.r(aVar);
                        }
                        if (zR) {
                            i35 = 67108864;
                        } else {
                            i35 = 33554432;
                        }
                        i30 |= i35;
                    }
                    i36 = i16 & 512;
                    if (i36 != 0) {
                        if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                            if (o0VarE.r(pVar)) {
                                i37 = 536870912;
                            } else {
                                i37 = 268435456;
                            }
                            i30 |= i37;
                        }
                        i38 = i16 & 1024;
                        if (i38 != 0) {
                            i39 = 6;
                        } else if ((i15 & 6) == 0) {
                            if (o0VarE.r(qVar)) {
                                i44 = 4;
                            } else {
                                i44 = 2;
                            }
                            i39 = i15 | i44;
                        } else {
                            i39 = i15;
                        }
                        if ((i30 & 306783379) == 306783378) {
                            z16 = true;
                        } else {
                            z16 = true;
                        }
                        if (o0VarE.n(i30 & 1, z16)) {
                            int i411 = i30;
                            if (i47 != 0) {
                                fVar4 = null;
                            } else {
                                fVar4 = fVar2;
                            }
                            if (i18 != 0) {
                                str3 = null;
                            }
                            if (i24 != 0) {
                                z18 = false;
                            } else {
                                z18 = z15;
                            }
                            if (i26 != 0) {
                                i45 = i39;
                                f19 = 0.0f;
                            } else {
                                int i56 = i39;
                                f19 = f16;
                                i45 = i56;
                            }
                            if (i28 != 0) {
                                f22 = 0.0f;
                            } else {
                                f22 = f15;
                            }
                            if (i34 != 0) {
                                aVar3 = null;
                            } else {
                                aVar3 = aVar;
                            }
                            if (i36 != 0) {
                                pVar3 = null;
                            } else {
                                pVar3 = pVar;
                            }
                            if (i38 != 0) {
                                qVar3 = null;
                            } else {
                                qVar3 = qVar;
                            }
                            x1 x1Var3 = p3.n.f135158a;
                            o0Var = o0VarE;
                            a(rVar, cVar2, z3.f.c(263761673, new fv1.b(str3, 23), o0VarE), fVar4, z18, str4, f19, f22, aVar3, pVar3, qVar3, o0Var, (i411 & 14) | 384 | (i411 & 112) | ((i411 << 3) & 7168) | (57344 & i411) | (458752 & i411) | (3670016 & i411) | (29360128 & i411) | (234881024 & i411) | (i411 & 1879048192), i45 & 14, 0);
                            str5 = str3;
                            fVar3 = fVar4;
                            z17 = z18;
                            f18 = f19;
                            f17 = f22;
                            aVar2 = aVar3;
                            pVar2 = pVar3;
                            qVar2 = qVar3;
                        } else {
                            o0Var = o0VarE;
                            o0Var.e();
                            f17 = f15;
                            pVar2 = pVar;
                            fVar3 = fVar2;
                            z17 = z15;
                            qVar2 = qVar;
                            f18 = f16;
                            str5 = str3;
                            aVar2 = aVar;
                        }
                        p2VarI0 = o0Var.i0();
                        if (p2VarI0 != null) {
                            p2VarI0.f135219d = new p(rVar, cVar, fVar3, str5, z17, str2, f18, f17, aVar2, pVar2, qVar2, i14, i15, i16);
                        }
                    }
                    i30 |= C.ENCODING_PCM_32BIT;
                    i38 = i16 & 1024;
                    if (i38 != 0) {
                        i39 = 6;
                    } else if ((i15 & 6) == 0) {
                        if (o0VarE.r(qVar)) {
                            i44 = 4;
                        } else {
                            i44 = 2;
                        }
                        i39 = i15 | i44;
                    } else {
                        i39 = i15;
                    }
                    if ((i30 & 306783379) == 306783378) {
                        z16 = true;
                    } else {
                        z16 = true;
                    }
                    if (o0VarE.n(i30 & 1, z16)) {
                        int i412 = i30;
                        if (i47 != 0) {
                            fVar4 = null;
                        } else {
                            fVar4 = fVar2;
                        }
                        if (i18 != 0) {
                            str3 = null;
                        }
                        if (i24 != 0) {
                            z18 = false;
                        } else {
                            z18 = z15;
                        }
                        if (i26 != 0) {
                            i45 = i39;
                            f19 = 0.0f;
                        } else {
                            int i57 = i39;
                            f19 = f16;
                            i45 = i57;
                        }
                        if (i28 != 0) {
                            f22 = 0.0f;
                        } else {
                            f22 = f15;
                        }
                        if (i34 != 0) {
                            aVar3 = null;
                        } else {
                            aVar3 = aVar;
                        }
                        if (i36 != 0) {
                            pVar3 = null;
                        } else {
                            pVar3 = pVar;
                        }
                        if (i38 != 0) {
                            qVar3 = null;
                        } else {
                            qVar3 = qVar;
                        }
                        x1 x1Var4 = p3.n.f135158a;
                        o0Var = o0VarE;
                        a(rVar, cVar2, z3.f.c(263761673, new fv1.b(str3, 23), o0VarE), fVar4, z18, str4, f19, f22, aVar3, pVar3, qVar3, o0Var, (i412 & 14) | 384 | (i412 & 112) | ((i412 << 3) & 7168) | (57344 & i412) | (458752 & i412) | (3670016 & i412) | (29360128 & i412) | (234881024 & i412) | (i412 & 1879048192), i45 & 14, 0);
                        str5 = str3;
                        fVar3 = fVar4;
                        z17 = z18;
                        f18 = f19;
                        f17 = f22;
                        aVar2 = aVar3;
                        pVar2 = pVar3;
                        qVar2 = qVar3;
                    } else {
                        o0Var = o0VarE;
                        o0Var.e();
                        f17 = f15;
                        pVar2 = pVar;
                        fVar3 = fVar2;
                        z17 = z15;
                        qVar2 = qVar;
                        f18 = f16;
                        str5 = str3;
                        aVar2 = aVar;
                    }
                    p2VarI0 = o0Var.i0();
                    if (p2VarI0 != null) {
                        p2VarI0.f135219d = new p(rVar, cVar, fVar3, str5, z17, str2, f18, f17, aVar2, pVar2, qVar2, i14, i15, i16);
                    }
                }
                i17 |= 24576;
                z15 = z14;
                if ((196608 & i14) == 0) {
                    str4 = str2;
                    if (o0VarE.B(str4)) {
                        i46 = 131072;
                    } else {
                        i46 = 65536;
                    }
                    i17 |= i46;
                } else {
                    str4 = str2;
                }
                i26 = i16 & 64;
                if (i26 != 0) {
                    i17 |= 1572864;
                    f16 = f14;
                } else {
                    f16 = f14;
                    if ((i14 & 1572864) == 0) {
                        if (o0VarE.i(f16)) {
                            i27 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                        } else {
                            i27 = 524288;
                        }
                        i17 |= i27;
                    }
                }
                i28 = i16 & 128;
                if (i28 != 0) {
                    if ((i14 & 12582912) == 0) {
                        int i413 = i17;
                        if (o0VarE.i(f15)) {
                            i29 = 8388608;
                        } else {
                            i29 = 4194304;
                        }
                        i30 = i413 | i29;
                    }
                    i34 = i16 & 256;
                    i35 = 100663296;
                    if (i34 == 0) {
                        i30 |= i35;
                    } else if ((i14 & 100663296) == 0) {
                        if ((i14 & 134217728) == 0) {
                            zR = o0VarE.B(aVar);
                        } else {
                            zR = o0VarE.r(aVar);
                        }
                        if (zR) {
                            i35 = 67108864;
                        } else {
                            i35 = 33554432;
                        }
                        i30 |= i35;
                    }
                    i36 = i16 & 512;
                    if (i36 != 0) {
                        if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                            if (o0VarE.r(pVar)) {
                                i37 = 536870912;
                            } else {
                                i37 = 268435456;
                            }
                            i30 |= i37;
                        }
                        i38 = i16 & 1024;
                        if (i38 != 0) {
                            i39 = 6;
                        } else if ((i15 & 6) == 0) {
                            if (o0VarE.r(qVar)) {
                                i44 = 4;
                            } else {
                                i44 = 2;
                            }
                            i39 = i15 | i44;
                        } else {
                            i39 = i15;
                        }
                        if ((i30 & 306783379) == 306783378) {
                            z16 = true;
                        } else {
                            z16 = true;
                        }
                        if (o0VarE.n(i30 & 1, z16)) {
                            int i414 = i30;
                            if (i47 != 0) {
                                fVar4 = null;
                            } else {
                                fVar4 = fVar2;
                            }
                            if (i18 != 0) {
                                str3 = null;
                            }
                            if (i24 != 0) {
                                z18 = false;
                            } else {
                                z18 = z15;
                            }
                            if (i26 != 0) {
                                i45 = i39;
                                f19 = 0.0f;
                            } else {
                                int i58 = i39;
                                f19 = f16;
                                i45 = i58;
                            }
                            if (i28 != 0) {
                                f22 = 0.0f;
                            } else {
                                f22 = f15;
                            }
                            if (i34 != 0) {
                                aVar3 = null;
                            } else {
                                aVar3 = aVar;
                            }
                            if (i36 != 0) {
                                pVar3 = null;
                            } else {
                                pVar3 = pVar;
                            }
                            if (i38 != 0) {
                                qVar3 = null;
                            } else {
                                qVar3 = qVar;
                            }
                            x1 x1Var5 = p3.n.f135158a;
                            o0Var = o0VarE;
                            a(rVar, cVar2, z3.f.c(263761673, new fv1.b(str3, 23), o0VarE), fVar4, z18, str4, f19, f22, aVar3, pVar3, qVar3, o0Var, (i414 & 14) | 384 | (i414 & 112) | ((i414 << 3) & 7168) | (57344 & i414) | (458752 & i414) | (3670016 & i414) | (29360128 & i414) | (234881024 & i414) | (i414 & 1879048192), i45 & 14, 0);
                            str5 = str3;
                            fVar3 = fVar4;
                            z17 = z18;
                            f18 = f19;
                            f17 = f22;
                            aVar2 = aVar3;
                            pVar2 = pVar3;
                            qVar2 = qVar3;
                        } else {
                            o0Var = o0VarE;
                            o0Var.e();
                            f17 = f15;
                            pVar2 = pVar;
                            fVar3 = fVar2;
                            z17 = z15;
                            qVar2 = qVar;
                            f18 = f16;
                            str5 = str3;
                            aVar2 = aVar;
                        }
                        p2VarI0 = o0Var.i0();
                        if (p2VarI0 != null) {
                            p2VarI0.f135219d = new p(rVar, cVar, fVar3, str5, z17, str2, f18, f17, aVar2, pVar2, qVar2, i14, i15, i16);
                        }
                    }
                    i30 |= C.ENCODING_PCM_32BIT;
                    i38 = i16 & 1024;
                    if (i38 != 0) {
                        i39 = 6;
                    } else if ((i15 & 6) == 0) {
                        if (o0VarE.r(qVar)) {
                            i44 = 4;
                        } else {
                            i44 = 2;
                        }
                        i39 = i15 | i44;
                    } else {
                        i39 = i15;
                    }
                    if ((i30 & 306783379) == 306783378) {
                        z16 = true;
                    } else {
                        z16 = true;
                    }
                    if (o0VarE.n(i30 & 1, z16)) {
                        int i415 = i30;
                        if (i47 != 0) {
                            fVar4 = null;
                        } else {
                            fVar4 = fVar2;
                        }
                        if (i18 != 0) {
                            str3 = null;
                        }
                        if (i24 != 0) {
                            z18 = false;
                        } else {
                            z18 = z15;
                        }
                        if (i26 != 0) {
                            i45 = i39;
                            f19 = 0.0f;
                        } else {
                            int i59 = i39;
                            f19 = f16;
                            i45 = i59;
                        }
                        if (i28 != 0) {
                            f22 = 0.0f;
                        } else {
                            f22 = f15;
                        }
                        if (i34 != 0) {
                            aVar3 = null;
                        } else {
                            aVar3 = aVar;
                        }
                        if (i36 != 0) {
                            pVar3 = null;
                        } else {
                            pVar3 = pVar;
                        }
                        if (i38 != 0) {
                            qVar3 = null;
                        } else {
                            qVar3 = qVar;
                        }
                        x1 x1Var6 = p3.n.f135158a;
                        o0Var = o0VarE;
                        a(rVar, cVar2, z3.f.c(263761673, new fv1.b(str3, 23), o0VarE), fVar4, z18, str4, f19, f22, aVar3, pVar3, qVar3, o0Var, (i415 & 14) | 384 | (i415 & 112) | ((i415 << 3) & 7168) | (57344 & i415) | (458752 & i415) | (3670016 & i415) | (29360128 & i415) | (234881024 & i415) | (i415 & 1879048192), i45 & 14, 0);
                        str5 = str3;
                        fVar3 = fVar4;
                        z17 = z18;
                        f18 = f19;
                        f17 = f22;
                        aVar2 = aVar3;
                        pVar2 = pVar3;
                        qVar2 = qVar3;
                    } else {
                        o0Var = o0VarE;
                        o0Var.e();
                        f17 = f15;
                        pVar2 = pVar;
                        fVar3 = fVar2;
                        z17 = z15;
                        qVar2 = qVar;
                        f18 = f16;
                        str5 = str3;
                        aVar2 = aVar;
                    }
                    p2VarI0 = o0Var.i0();
                    if (p2VarI0 != null) {
                        p2VarI0.f135219d = new p(rVar, cVar, fVar3, str5, z17, str2, f18, f17, aVar2, pVar2, qVar2, i14, i15, i16);
                    }
                }
                i17 |= 12582912;
                i30 = i17;
                i34 = i16 & 256;
                i35 = 100663296;
                if (i34 == 0) {
                    i30 |= i35;
                } else if ((i14 & 100663296) == 0) {
                    if ((i14 & 134217728) == 0) {
                        zR = o0VarE.B(aVar);
                    } else {
                        zR = o0VarE.r(aVar);
                    }
                    if (zR) {
                        i35 = 67108864;
                    } else {
                        i35 = 33554432;
                    }
                    i30 |= i35;
                }
                i36 = i16 & 512;
                if (i36 != 0) {
                    if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                        if (o0VarE.r(pVar)) {
                            i37 = 536870912;
                        } else {
                            i37 = 268435456;
                        }
                        i30 |= i37;
                    }
                    i38 = i16 & 1024;
                    if (i38 != 0) {
                        i39 = 6;
                    } else if ((i15 & 6) == 0) {
                        if (o0VarE.r(qVar)) {
                            i44 = 4;
                        } else {
                            i44 = 2;
                        }
                        i39 = i15 | i44;
                    } else {
                        i39 = i15;
                    }
                    if ((i30 & 306783379) == 306783378) {
                        z16 = true;
                    } else {
                        z16 = true;
                    }
                    if (o0VarE.n(i30 & 1, z16)) {
                        int i416 = i30;
                        if (i47 != 0) {
                            fVar4 = null;
                        } else {
                            fVar4 = fVar2;
                        }
                        if (i18 != 0) {
                            str3 = null;
                        }
                        if (i24 != 0) {
                            z18 = false;
                        } else {
                            z18 = z15;
                        }
                        if (i26 != 0) {
                            i45 = i39;
                            f19 = 0.0f;
                        } else {
                            int i510 = i39;
                            f19 = f16;
                            i45 = i510;
                        }
                        if (i28 != 0) {
                            f22 = 0.0f;
                        } else {
                            f22 = f15;
                        }
                        if (i34 != 0) {
                            aVar3 = null;
                        } else {
                            aVar3 = aVar;
                        }
                        if (i36 != 0) {
                            pVar3 = null;
                        } else {
                            pVar3 = pVar;
                        }
                        if (i38 != 0) {
                            qVar3 = null;
                        } else {
                            qVar3 = qVar;
                        }
                        x1 x1Var7 = p3.n.f135158a;
                        o0Var = o0VarE;
                        a(rVar, cVar2, z3.f.c(263761673, new fv1.b(str3, 23), o0VarE), fVar4, z18, str4, f19, f22, aVar3, pVar3, qVar3, o0Var, (i416 & 14) | 384 | (i416 & 112) | ((i416 << 3) & 7168) | (57344 & i416) | (458752 & i416) | (3670016 & i416) | (29360128 & i416) | (234881024 & i416) | (i416 & 1879048192), i45 & 14, 0);
                        str5 = str3;
                        fVar3 = fVar4;
                        z17 = z18;
                        f18 = f19;
                        f17 = f22;
                        aVar2 = aVar3;
                        pVar2 = pVar3;
                        qVar2 = qVar3;
                    } else {
                        o0Var = o0VarE;
                        o0Var.e();
                        f17 = f15;
                        pVar2 = pVar;
                        fVar3 = fVar2;
                        z17 = z15;
                        qVar2 = qVar;
                        f18 = f16;
                        str5 = str3;
                        aVar2 = aVar;
                    }
                    p2VarI0 = o0Var.i0();
                    if (p2VarI0 != null) {
                        p2VarI0.f135219d = new p(rVar, cVar, fVar3, str5, z17, str2, f18, f17, aVar2, pVar2, qVar2, i14, i15, i16);
                    }
                }
                i30 |= C.ENCODING_PCM_32BIT;
                i38 = i16 & 1024;
                if (i38 != 0) {
                    i39 = 6;
                } else if ((i15 & 6) == 0) {
                    if (o0VarE.r(qVar)) {
                        i44 = 4;
                    } else {
                        i44 = 2;
                    }
                    i39 = i15 | i44;
                } else {
                    i39 = i15;
                }
                if ((i30 & 306783379) == 306783378) {
                    z16 = true;
                } else {
                    z16 = true;
                }
                if (o0VarE.n(i30 & 1, z16)) {
                    int i417 = i30;
                    if (i47 != 0) {
                        fVar4 = null;
                    } else {
                        fVar4 = fVar2;
                    }
                    if (i18 != 0) {
                        str3 = null;
                    }
                    if (i24 != 0) {
                        z18 = false;
                    } else {
                        z18 = z15;
                    }
                    if (i26 != 0) {
                        i45 = i39;
                        f19 = 0.0f;
                    } else {
                        int i511 = i39;
                        f19 = f16;
                        i45 = i511;
                    }
                    if (i28 != 0) {
                        f22 = 0.0f;
                    } else {
                        f22 = f15;
                    }
                    if (i34 != 0) {
                        aVar3 = null;
                    } else {
                        aVar3 = aVar;
                    }
                    if (i36 != 0) {
                        pVar3 = null;
                    } else {
                        pVar3 = pVar;
                    }
                    if (i38 != 0) {
                        qVar3 = null;
                    } else {
                        qVar3 = qVar;
                    }
                    x1 x1Var8 = p3.n.f135158a;
                    o0Var = o0VarE;
                    a(rVar, cVar2, z3.f.c(263761673, new fv1.b(str3, 23), o0VarE), fVar4, z18, str4, f19, f22, aVar3, pVar3, qVar3, o0Var, (i417 & 14) | 384 | (i417 & 112) | ((i417 << 3) & 7168) | (57344 & i417) | (458752 & i417) | (3670016 & i417) | (29360128 & i417) | (234881024 & i417) | (i417 & 1879048192), i45 & 14, 0);
                    str5 = str3;
                    fVar3 = fVar4;
                    z17 = z18;
                    f18 = f19;
                    f17 = f22;
                    aVar2 = aVar3;
                    pVar2 = pVar3;
                    qVar2 = qVar3;
                } else {
                    o0Var = o0VarE;
                    o0Var.e();
                    f17 = f15;
                    pVar2 = pVar;
                    fVar3 = fVar2;
                    z17 = z15;
                    qVar2 = qVar;
                    f18 = f16;
                    str5 = str3;
                    aVar2 = aVar;
                }
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new p(rVar, cVar, fVar3, str5, z17, str2, f18, f17, aVar2, pVar2, qVar2, i14, i15, i16);
                }
            }
            i17 |= 3072;
            str3 = str;
            i24 = i16 & 16;
            if (i24 != 0) {
                if ((i14 & 24576) == 0) {
                    z15 = z14;
                    if (o0VarE.h(z15)) {
                        i25 = 16384;
                    } else {
                        i25 = 8192;
                    }
                    i17 |= i25;
                }
                if ((196608 & i14) == 0) {
                    str4 = str2;
                    if (o0VarE.B(str4)) {
                        i46 = 131072;
                    } else {
                        i46 = 65536;
                    }
                    i17 |= i46;
                } else {
                    str4 = str2;
                }
                i26 = i16 & 64;
                if (i26 != 0) {
                    i17 |= 1572864;
                    f16 = f14;
                } else {
                    f16 = f14;
                    if ((i14 & 1572864) == 0) {
                        if (o0VarE.i(f16)) {
                            i27 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                        } else {
                            i27 = 524288;
                        }
                        i17 |= i27;
                    }
                }
                i28 = i16 & 128;
                if (i28 != 0) {
                    if ((i14 & 12582912) == 0) {
                        int i418 = i17;
                        if (o0VarE.i(f15)) {
                            i29 = 8388608;
                        } else {
                            i29 = 4194304;
                        }
                        i30 = i418 | i29;
                    }
                    i34 = i16 & 256;
                    i35 = 100663296;
                    if (i34 == 0) {
                        i30 |= i35;
                    } else if ((i14 & 100663296) == 0) {
                        if ((i14 & 134217728) == 0) {
                            zR = o0VarE.B(aVar);
                        } else {
                            zR = o0VarE.r(aVar);
                        }
                        if (zR) {
                            i35 = 67108864;
                        } else {
                            i35 = 33554432;
                        }
                        i30 |= i35;
                    }
                    i36 = i16 & 512;
                    if (i36 != 0) {
                        if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                            if (o0VarE.r(pVar)) {
                                i37 = 536870912;
                            } else {
                                i37 = 268435456;
                            }
                            i30 |= i37;
                        }
                        i38 = i16 & 1024;
                        if (i38 != 0) {
                            i39 = 6;
                        } else if ((i15 & 6) == 0) {
                            if (o0VarE.r(qVar)) {
                                i44 = 4;
                            } else {
                                i44 = 2;
                            }
                            i39 = i15 | i44;
                        } else {
                            i39 = i15;
                        }
                        if ((i30 & 306783379) == 306783378) {
                            z16 = true;
                        } else {
                            z16 = true;
                        }
                        if (o0VarE.n(i30 & 1, z16)) {
                            int i419 = i30;
                            if (i47 != 0) {
                                fVar4 = null;
                            } else {
                                fVar4 = fVar2;
                            }
                            if (i18 != 0) {
                                str3 = null;
                            }
                            if (i24 != 0) {
                                z18 = false;
                            } else {
                                z18 = z15;
                            }
                            if (i26 != 0) {
                                i45 = i39;
                                f19 = 0.0f;
                            } else {
                                int i512 = i39;
                                f19 = f16;
                                i45 = i512;
                            }
                            if (i28 != 0) {
                                f22 = 0.0f;
                            } else {
                                f22 = f15;
                            }
                            if (i34 != 0) {
                                aVar3 = null;
                            } else {
                                aVar3 = aVar;
                            }
                            if (i36 != 0) {
                                pVar3 = null;
                            } else {
                                pVar3 = pVar;
                            }
                            if (i38 != 0) {
                                qVar3 = null;
                            } else {
                                qVar3 = qVar;
                            }
                            x1 x1Var9 = p3.n.f135158a;
                            o0Var = o0VarE;
                            a(rVar, cVar2, z3.f.c(263761673, new fv1.b(str3, 23), o0VarE), fVar4, z18, str4, f19, f22, aVar3, pVar3, qVar3, o0Var, (i419 & 14) | 384 | (i419 & 112) | ((i419 << 3) & 7168) | (57344 & i419) | (458752 & i419) | (3670016 & i419) | (29360128 & i419) | (234881024 & i419) | (i419 & 1879048192), i45 & 14, 0);
                            str5 = str3;
                            fVar3 = fVar4;
                            z17 = z18;
                            f18 = f19;
                            f17 = f22;
                            aVar2 = aVar3;
                            pVar2 = pVar3;
                            qVar2 = qVar3;
                        } else {
                            o0Var = o0VarE;
                            o0Var.e();
                            f17 = f15;
                            pVar2 = pVar;
                            fVar3 = fVar2;
                            z17 = z15;
                            qVar2 = qVar;
                            f18 = f16;
                            str5 = str3;
                            aVar2 = aVar;
                        }
                        p2VarI0 = o0Var.i0();
                        if (p2VarI0 != null) {
                            p2VarI0.f135219d = new p(rVar, cVar, fVar3, str5, z17, str2, f18, f17, aVar2, pVar2, qVar2, i14, i15, i16);
                        }
                    }
                    i30 |= C.ENCODING_PCM_32BIT;
                    i38 = i16 & 1024;
                    if (i38 != 0) {
                        i39 = 6;
                    } else if ((i15 & 6) == 0) {
                        if (o0VarE.r(qVar)) {
                            i44 = 4;
                        } else {
                            i44 = 2;
                        }
                        i39 = i15 | i44;
                    } else {
                        i39 = i15;
                    }
                    if ((i30 & 306783379) == 306783378) {
                        z16 = true;
                    } else {
                        z16 = true;
                    }
                    if (o0VarE.n(i30 & 1, z16)) {
                        int i4110 = i30;
                        if (i47 != 0) {
                            fVar4 = null;
                        } else {
                            fVar4 = fVar2;
                        }
                        if (i18 != 0) {
                            str3 = null;
                        }
                        if (i24 != 0) {
                            z18 = false;
                        } else {
                            z18 = z15;
                        }
                        if (i26 != 0) {
                            i45 = i39;
                            f19 = 0.0f;
                        } else {
                            int i513 = i39;
                            f19 = f16;
                            i45 = i513;
                        }
                        if (i28 != 0) {
                            f22 = 0.0f;
                        } else {
                            f22 = f15;
                        }
                        if (i34 != 0) {
                            aVar3 = null;
                        } else {
                            aVar3 = aVar;
                        }
                        if (i36 != 0) {
                            pVar3 = null;
                        } else {
                            pVar3 = pVar;
                        }
                        if (i38 != 0) {
                            qVar3 = null;
                        } else {
                            qVar3 = qVar;
                        }
                        x1 x1Var10 = p3.n.f135158a;
                        o0Var = o0VarE;
                        a(rVar, cVar2, z3.f.c(263761673, new fv1.b(str3, 23), o0VarE), fVar4, z18, str4, f19, f22, aVar3, pVar3, qVar3, o0Var, (i4110 & 14) | 384 | (i4110 & 112) | ((i4110 << 3) & 7168) | (57344 & i4110) | (458752 & i4110) | (3670016 & i4110) | (29360128 & i4110) | (234881024 & i4110) | (i4110 & 1879048192), i45 & 14, 0);
                        str5 = str3;
                        fVar3 = fVar4;
                        z17 = z18;
                        f18 = f19;
                        f17 = f22;
                        aVar2 = aVar3;
                        pVar2 = pVar3;
                        qVar2 = qVar3;
                    } else {
                        o0Var = o0VarE;
                        o0Var.e();
                        f17 = f15;
                        pVar2 = pVar;
                        fVar3 = fVar2;
                        z17 = z15;
                        qVar2 = qVar;
                        f18 = f16;
                        str5 = str3;
                        aVar2 = aVar;
                    }
                    p2VarI0 = o0Var.i0();
                    if (p2VarI0 != null) {
                        p2VarI0.f135219d = new p(rVar, cVar, fVar3, str5, z17, str2, f18, f17, aVar2, pVar2, qVar2, i14, i15, i16);
                    }
                }
                i17 |= 12582912;
                i30 = i17;
                i34 = i16 & 256;
                i35 = 100663296;
                if (i34 == 0) {
                    i30 |= i35;
                } else if ((i14 & 100663296) == 0) {
                    if ((i14 & 134217728) == 0) {
                        zR = o0VarE.B(aVar);
                    } else {
                        zR = o0VarE.r(aVar);
                    }
                    if (zR) {
                        i35 = 67108864;
                    } else {
                        i35 = 33554432;
                    }
                    i30 |= i35;
                }
                i36 = i16 & 512;
                if (i36 != 0) {
                    if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                        if (o0VarE.r(pVar)) {
                            i37 = 536870912;
                        } else {
                            i37 = 268435456;
                        }
                        i30 |= i37;
                    }
                    i38 = i16 & 1024;
                    if (i38 != 0) {
                        i39 = 6;
                    } else if ((i15 & 6) == 0) {
                        if (o0VarE.r(qVar)) {
                            i44 = 4;
                        } else {
                            i44 = 2;
                        }
                        i39 = i15 | i44;
                    } else {
                        i39 = i15;
                    }
                    if ((i30 & 306783379) == 306783378) {
                        z16 = true;
                    } else {
                        z16 = true;
                    }
                    if (o0VarE.n(i30 & 1, z16)) {
                        int i4111 = i30;
                        if (i47 != 0) {
                            fVar4 = null;
                        } else {
                            fVar4 = fVar2;
                        }
                        if (i18 != 0) {
                            str3 = null;
                        }
                        if (i24 != 0) {
                            z18 = false;
                        } else {
                            z18 = z15;
                        }
                        if (i26 != 0) {
                            i45 = i39;
                            f19 = 0.0f;
                        } else {
                            int i514 = i39;
                            f19 = f16;
                            i45 = i514;
                        }
                        if (i28 != 0) {
                            f22 = 0.0f;
                        } else {
                            f22 = f15;
                        }
                        if (i34 != 0) {
                            aVar3 = null;
                        } else {
                            aVar3 = aVar;
                        }
                        if (i36 != 0) {
                            pVar3 = null;
                        } else {
                            pVar3 = pVar;
                        }
                        if (i38 != 0) {
                            qVar3 = null;
                        } else {
                            qVar3 = qVar;
                        }
                        x1 x1Var11 = p3.n.f135158a;
                        o0Var = o0VarE;
                        a(rVar, cVar2, z3.f.c(263761673, new fv1.b(str3, 23), o0VarE), fVar4, z18, str4, f19, f22, aVar3, pVar3, qVar3, o0Var, (i4111 & 14) | 384 | (i4111 & 112) | ((i4111 << 3) & 7168) | (57344 & i4111) | (458752 & i4111) | (3670016 & i4111) | (29360128 & i4111) | (234881024 & i4111) | (i4111 & 1879048192), i45 & 14, 0);
                        str5 = str3;
                        fVar3 = fVar4;
                        z17 = z18;
                        f18 = f19;
                        f17 = f22;
                        aVar2 = aVar3;
                        pVar2 = pVar3;
                        qVar2 = qVar3;
                    } else {
                        o0Var = o0VarE;
                        o0Var.e();
                        f17 = f15;
                        pVar2 = pVar;
                        fVar3 = fVar2;
                        z17 = z15;
                        qVar2 = qVar;
                        f18 = f16;
                        str5 = str3;
                        aVar2 = aVar;
                    }
                    p2VarI0 = o0Var.i0();
                    if (p2VarI0 != null) {
                        p2VarI0.f135219d = new p(rVar, cVar, fVar3, str5, z17, str2, f18, f17, aVar2, pVar2, qVar2, i14, i15, i16);
                    }
                }
                i30 |= C.ENCODING_PCM_32BIT;
                i38 = i16 & 1024;
                if (i38 != 0) {
                    i39 = 6;
                } else if ((i15 & 6) == 0) {
                    if (o0VarE.r(qVar)) {
                        i44 = 4;
                    } else {
                        i44 = 2;
                    }
                    i39 = i15 | i44;
                } else {
                    i39 = i15;
                }
                if ((i30 & 306783379) == 306783378) {
                    z16 = true;
                } else {
                    z16 = true;
                }
                if (o0VarE.n(i30 & 1, z16)) {
                    int i4112 = i30;
                    if (i47 != 0) {
                        fVar4 = null;
                    } else {
                        fVar4 = fVar2;
                    }
                    if (i18 != 0) {
                        str3 = null;
                    }
                    if (i24 != 0) {
                        z18 = false;
                    } else {
                        z18 = z15;
                    }
                    if (i26 != 0) {
                        i45 = i39;
                        f19 = 0.0f;
                    } else {
                        int i515 = i39;
                        f19 = f16;
                        i45 = i515;
                    }
                    if (i28 != 0) {
                        f22 = 0.0f;
                    } else {
                        f22 = f15;
                    }
                    if (i34 != 0) {
                        aVar3 = null;
                    } else {
                        aVar3 = aVar;
                    }
                    if (i36 != 0) {
                        pVar3 = null;
                    } else {
                        pVar3 = pVar;
                    }
                    if (i38 != 0) {
                        qVar3 = null;
                    } else {
                        qVar3 = qVar;
                    }
                    x1 x1Var12 = p3.n.f135158a;
                    o0Var = o0VarE;
                    a(rVar, cVar2, z3.f.c(263761673, new fv1.b(str3, 23), o0VarE), fVar4, z18, str4, f19, f22, aVar3, pVar3, qVar3, o0Var, (i4112 & 14) | 384 | (i4112 & 112) | ((i4112 << 3) & 7168) | (57344 & i4112) | (458752 & i4112) | (3670016 & i4112) | (29360128 & i4112) | (234881024 & i4112) | (i4112 & 1879048192), i45 & 14, 0);
                    str5 = str3;
                    fVar3 = fVar4;
                    z17 = z18;
                    f18 = f19;
                    f17 = f22;
                    aVar2 = aVar3;
                    pVar2 = pVar3;
                    qVar2 = qVar3;
                } else {
                    o0Var = o0VarE;
                    o0Var.e();
                    f17 = f15;
                    pVar2 = pVar;
                    fVar3 = fVar2;
                    z17 = z15;
                    qVar2 = qVar;
                    f18 = f16;
                    str5 = str3;
                    aVar2 = aVar;
                }
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new p(rVar, cVar, fVar3, str5, z17, str2, f18, f17, aVar2, pVar2, qVar2, i14, i15, i16);
                }
            }
            i17 |= 24576;
            z15 = z14;
            if ((196608 & i14) == 0) {
                str4 = str2;
                if (o0VarE.B(str4)) {
                    i46 = 131072;
                } else {
                    i46 = 65536;
                }
                i17 |= i46;
            } else {
                str4 = str2;
            }
            i26 = i16 & 64;
            if (i26 != 0) {
                i17 |= 1572864;
                f16 = f14;
            } else {
                f16 = f14;
                if ((i14 & 1572864) == 0) {
                    if (o0VarE.i(f16)) {
                        i27 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    } else {
                        i27 = 524288;
                    }
                    i17 |= i27;
                }
            }
            i28 = i16 & 128;
            if (i28 != 0) {
                if ((i14 & 12582912) == 0) {
                    int i4113 = i17;
                    if (o0VarE.i(f15)) {
                        i29 = 8388608;
                    } else {
                        i29 = 4194304;
                    }
                    i30 = i4113 | i29;
                }
                i34 = i16 & 256;
                i35 = 100663296;
                if (i34 == 0) {
                    i30 |= i35;
                } else if ((i14 & 100663296) == 0) {
                    if ((i14 & 134217728) == 0) {
                        zR = o0VarE.B(aVar);
                    } else {
                        zR = o0VarE.r(aVar);
                    }
                    if (zR) {
                        i35 = 67108864;
                    } else {
                        i35 = 33554432;
                    }
                    i30 |= i35;
                }
                i36 = i16 & 512;
                if (i36 != 0) {
                    if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                        if (o0VarE.r(pVar)) {
                            i37 = 536870912;
                        } else {
                            i37 = 268435456;
                        }
                        i30 |= i37;
                    }
                    i38 = i16 & 1024;
                    if (i38 != 0) {
                        i39 = 6;
                    } else if ((i15 & 6) == 0) {
                        if (o0VarE.r(qVar)) {
                            i44 = 4;
                        } else {
                            i44 = 2;
                        }
                        i39 = i15 | i44;
                    } else {
                        i39 = i15;
                    }
                    if ((i30 & 306783379) == 306783378) {
                        z16 = true;
                    } else {
                        z16 = true;
                    }
                    if (o0VarE.n(i30 & 1, z16)) {
                        int i4114 = i30;
                        if (i47 != 0) {
                            fVar4 = null;
                        } else {
                            fVar4 = fVar2;
                        }
                        if (i18 != 0) {
                            str3 = null;
                        }
                        if (i24 != 0) {
                            z18 = false;
                        } else {
                            z18 = z15;
                        }
                        if (i26 != 0) {
                            i45 = i39;
                            f19 = 0.0f;
                        } else {
                            int i516 = i39;
                            f19 = f16;
                            i45 = i516;
                        }
                        if (i28 != 0) {
                            f22 = 0.0f;
                        } else {
                            f22 = f15;
                        }
                        if (i34 != 0) {
                            aVar3 = null;
                        } else {
                            aVar3 = aVar;
                        }
                        if (i36 != 0) {
                            pVar3 = null;
                        } else {
                            pVar3 = pVar;
                        }
                        if (i38 != 0) {
                            qVar3 = null;
                        } else {
                            qVar3 = qVar;
                        }
                        x1 x1Var13 = p3.n.f135158a;
                        o0Var = o0VarE;
                        a(rVar, cVar2, z3.f.c(263761673, new fv1.b(str3, 23), o0VarE), fVar4, z18, str4, f19, f22, aVar3, pVar3, qVar3, o0Var, (i4114 & 14) | 384 | (i4114 & 112) | ((i4114 << 3) & 7168) | (57344 & i4114) | (458752 & i4114) | (3670016 & i4114) | (29360128 & i4114) | (234881024 & i4114) | (i4114 & 1879048192), i45 & 14, 0);
                        str5 = str3;
                        fVar3 = fVar4;
                        z17 = z18;
                        f18 = f19;
                        f17 = f22;
                        aVar2 = aVar3;
                        pVar2 = pVar3;
                        qVar2 = qVar3;
                    } else {
                        o0Var = o0VarE;
                        o0Var.e();
                        f17 = f15;
                        pVar2 = pVar;
                        fVar3 = fVar2;
                        z17 = z15;
                        qVar2 = qVar;
                        f18 = f16;
                        str5 = str3;
                        aVar2 = aVar;
                    }
                    p2VarI0 = o0Var.i0();
                    if (p2VarI0 != null) {
                        p2VarI0.f135219d = new p(rVar, cVar, fVar3, str5, z17, str2, f18, f17, aVar2, pVar2, qVar2, i14, i15, i16);
                    }
                }
                i30 |= C.ENCODING_PCM_32BIT;
                i38 = i16 & 1024;
                if (i38 != 0) {
                    i39 = 6;
                } else if ((i15 & 6) == 0) {
                    if (o0VarE.r(qVar)) {
                        i44 = 4;
                    } else {
                        i44 = 2;
                    }
                    i39 = i15 | i44;
                } else {
                    i39 = i15;
                }
                if ((i30 & 306783379) == 306783378) {
                    z16 = true;
                } else {
                    z16 = true;
                }
                if (o0VarE.n(i30 & 1, z16)) {
                    int i4115 = i30;
                    if (i47 != 0) {
                        fVar4 = null;
                    } else {
                        fVar4 = fVar2;
                    }
                    if (i18 != 0) {
                        str3 = null;
                    }
                    if (i24 != 0) {
                        z18 = false;
                    } else {
                        z18 = z15;
                    }
                    if (i26 != 0) {
                        i45 = i39;
                        f19 = 0.0f;
                    } else {
                        int i517 = i39;
                        f19 = f16;
                        i45 = i517;
                    }
                    if (i28 != 0) {
                        f22 = 0.0f;
                    } else {
                        f22 = f15;
                    }
                    if (i34 != 0) {
                        aVar3 = null;
                    } else {
                        aVar3 = aVar;
                    }
                    if (i36 != 0) {
                        pVar3 = null;
                    } else {
                        pVar3 = pVar;
                    }
                    if (i38 != 0) {
                        qVar3 = null;
                    } else {
                        qVar3 = qVar;
                    }
                    x1 x1Var14 = p3.n.f135158a;
                    o0Var = o0VarE;
                    a(rVar, cVar2, z3.f.c(263761673, new fv1.b(str3, 23), o0VarE), fVar4, z18, str4, f19, f22, aVar3, pVar3, qVar3, o0Var, (i4115 & 14) | 384 | (i4115 & 112) | ((i4115 << 3) & 7168) | (57344 & i4115) | (458752 & i4115) | (3670016 & i4115) | (29360128 & i4115) | (234881024 & i4115) | (i4115 & 1879048192), i45 & 14, 0);
                    str5 = str3;
                    fVar3 = fVar4;
                    z17 = z18;
                    f18 = f19;
                    f17 = f22;
                    aVar2 = aVar3;
                    pVar2 = pVar3;
                    qVar2 = qVar3;
                } else {
                    o0Var = o0VarE;
                    o0Var.e();
                    f17 = f15;
                    pVar2 = pVar;
                    fVar3 = fVar2;
                    z17 = z15;
                    qVar2 = qVar;
                    f18 = f16;
                    str5 = str3;
                    aVar2 = aVar;
                }
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new p(rVar, cVar, fVar3, str5, z17, str2, f18, f17, aVar2, pVar2, qVar2, i14, i15, i16);
                }
            }
            i17 |= 12582912;
            i30 = i17;
            i34 = i16 & 256;
            i35 = 100663296;
            if (i34 == 0) {
                i30 |= i35;
            } else if ((i14 & 100663296) == 0) {
                if ((i14 & 134217728) == 0) {
                    zR = o0VarE.B(aVar);
                } else {
                    zR = o0VarE.r(aVar);
                }
                if (zR) {
                    i35 = 67108864;
                } else {
                    i35 = 33554432;
                }
                i30 |= i35;
            }
            i36 = i16 & 512;
            if (i36 != 0) {
                if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                    if (o0VarE.r(pVar)) {
                        i37 = 536870912;
                    } else {
                        i37 = 268435456;
                    }
                    i30 |= i37;
                }
                i38 = i16 & 1024;
                if (i38 != 0) {
                    i39 = 6;
                } else if ((i15 & 6) == 0) {
                    if (o0VarE.r(qVar)) {
                        i44 = 4;
                    } else {
                        i44 = 2;
                    }
                    i39 = i15 | i44;
                } else {
                    i39 = i15;
                }
                if ((i30 & 306783379) == 306783378) {
                    z16 = true;
                } else {
                    z16 = true;
                }
                if (o0VarE.n(i30 & 1, z16)) {
                    int i4116 = i30;
                    if (i47 != 0) {
                        fVar4 = null;
                    } else {
                        fVar4 = fVar2;
                    }
                    if (i18 != 0) {
                        str3 = null;
                    }
                    if (i24 != 0) {
                        z18 = false;
                    } else {
                        z18 = z15;
                    }
                    if (i26 != 0) {
                        i45 = i39;
                        f19 = 0.0f;
                    } else {
                        int i518 = i39;
                        f19 = f16;
                        i45 = i518;
                    }
                    if (i28 != 0) {
                        f22 = 0.0f;
                    } else {
                        f22 = f15;
                    }
                    if (i34 != 0) {
                        aVar3 = null;
                    } else {
                        aVar3 = aVar;
                    }
                    if (i36 != 0) {
                        pVar3 = null;
                    } else {
                        pVar3 = pVar;
                    }
                    if (i38 != 0) {
                        qVar3 = null;
                    } else {
                        qVar3 = qVar;
                    }
                    x1 x1Var15 = p3.n.f135158a;
                    o0Var = o0VarE;
                    a(rVar, cVar2, z3.f.c(263761673, new fv1.b(str3, 23), o0VarE), fVar4, z18, str4, f19, f22, aVar3, pVar3, qVar3, o0Var, (i4116 & 14) | 384 | (i4116 & 112) | ((i4116 << 3) & 7168) | (57344 & i4116) | (458752 & i4116) | (3670016 & i4116) | (29360128 & i4116) | (234881024 & i4116) | (i4116 & 1879048192), i45 & 14, 0);
                    str5 = str3;
                    fVar3 = fVar4;
                    z17 = z18;
                    f18 = f19;
                    f17 = f22;
                    aVar2 = aVar3;
                    pVar2 = pVar3;
                    qVar2 = qVar3;
                } else {
                    o0Var = o0VarE;
                    o0Var.e();
                    f17 = f15;
                    pVar2 = pVar;
                    fVar3 = fVar2;
                    z17 = z15;
                    qVar2 = qVar;
                    f18 = f16;
                    str5 = str3;
                    aVar2 = aVar;
                }
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new p(rVar, cVar, fVar3, str5, z17, str2, f18, f17, aVar2, pVar2, qVar2, i14, i15, i16);
                }
            }
            i30 |= C.ENCODING_PCM_32BIT;
            i38 = i16 & 1024;
            if (i38 != 0) {
                i39 = 6;
            } else if ((i15 & 6) == 0) {
                if (o0VarE.r(qVar)) {
                    i44 = 4;
                } else {
                    i44 = 2;
                }
                i39 = i15 | i44;
            } else {
                i39 = i15;
            }
            if ((i30 & 306783379) == 306783378) {
                z16 = true;
            } else {
                z16 = true;
            }
            if (o0VarE.n(i30 & 1, z16)) {
                int i4117 = i30;
                if (i47 != 0) {
                    fVar4 = null;
                } else {
                    fVar4 = fVar2;
                }
                if (i18 != 0) {
                    str3 = null;
                }
                if (i24 != 0) {
                    z18 = false;
                } else {
                    z18 = z15;
                }
                if (i26 != 0) {
                    i45 = i39;
                    f19 = 0.0f;
                } else {
                    int i519 = i39;
                    f19 = f16;
                    i45 = i519;
                }
                if (i28 != 0) {
                    f22 = 0.0f;
                } else {
                    f22 = f15;
                }
                if (i34 != 0) {
                    aVar3 = null;
                } else {
                    aVar3 = aVar;
                }
                if (i36 != 0) {
                    pVar3 = null;
                } else {
                    pVar3 = pVar;
                }
                if (i38 != 0) {
                    qVar3 = null;
                } else {
                    qVar3 = qVar;
                }
                x1 x1Var16 = p3.n.f135158a;
                o0Var = o0VarE;
                a(rVar, cVar2, z3.f.c(263761673, new fv1.b(str3, 23), o0VarE), fVar4, z18, str4, f19, f22, aVar3, pVar3, qVar3, o0Var, (i4117 & 14) | 384 | (i4117 & 112) | ((i4117 << 3) & 7168) | (57344 & i4117) | (458752 & i4117) | (3670016 & i4117) | (29360128 & i4117) | (234881024 & i4117) | (i4117 & 1879048192), i45 & 14, 0);
                str5 = str3;
                fVar3 = fVar4;
                z17 = z18;
                f18 = f19;
                f17 = f22;
                aVar2 = aVar3;
                pVar2 = pVar3;
                qVar2 = qVar3;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                f17 = f15;
                pVar2 = pVar;
                fVar3 = fVar2;
                z17 = z15;
                qVar2 = qVar;
                f18 = f16;
                str5 = str3;
                aVar2 = aVar;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new p(rVar, cVar, fVar3, str5, z17, str2, f18, f17, aVar2, pVar2, qVar2, i14, i15, i16);
            }
        }
        i17 |= 384;
        fVar2 = fVar;
        i18 = i16 & 8;
        if (i18 != 0) {
            if ((i14 & 3072) == 0) {
                str3 = str;
                if (o0VarE.B(str3)) {
                    i19 = 2048;
                } else {
                    i19 = 1024;
                }
                i17 |= i19;
            }
            i24 = i16 & 16;
            if (i24 != 0) {
                if ((i14 & 24576) == 0) {
                    z15 = z14;
                    if (o0VarE.h(z15)) {
                        i25 = 16384;
                    } else {
                        i25 = 8192;
                    }
                    i17 |= i25;
                }
                if ((196608 & i14) == 0) {
                    str4 = str2;
                    if (o0VarE.B(str4)) {
                        i46 = 131072;
                    } else {
                        i46 = 65536;
                    }
                    i17 |= i46;
                } else {
                    str4 = str2;
                }
                i26 = i16 & 64;
                if (i26 != 0) {
                    i17 |= 1572864;
                    f16 = f14;
                } else {
                    f16 = f14;
                    if ((i14 & 1572864) == 0) {
                        if (o0VarE.i(f16)) {
                            i27 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                        } else {
                            i27 = 524288;
                        }
                        i17 |= i27;
                    }
                }
                i28 = i16 & 128;
                if (i28 != 0) {
                    if ((i14 & 12582912) == 0) {
                        int i4118 = i17;
                        if (o0VarE.i(f15)) {
                            i29 = 8388608;
                        } else {
                            i29 = 4194304;
                        }
                        i30 = i4118 | i29;
                    }
                    i34 = i16 & 256;
                    i35 = 100663296;
                    if (i34 == 0) {
                        i30 |= i35;
                    } else if ((i14 & 100663296) == 0) {
                        if ((i14 & 134217728) == 0) {
                            zR = o0VarE.B(aVar);
                        } else {
                            zR = o0VarE.r(aVar);
                        }
                        if (zR) {
                            i35 = 67108864;
                        } else {
                            i35 = 33554432;
                        }
                        i30 |= i35;
                    }
                    i36 = i16 & 512;
                    if (i36 != 0) {
                        if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                            if (o0VarE.r(pVar)) {
                                i37 = 536870912;
                            } else {
                                i37 = 268435456;
                            }
                            i30 |= i37;
                        }
                        i38 = i16 & 1024;
                        if (i38 != 0) {
                            i39 = 6;
                        } else if ((i15 & 6) == 0) {
                            if (o0VarE.r(qVar)) {
                                i44 = 4;
                            } else {
                                i44 = 2;
                            }
                            i39 = i15 | i44;
                        } else {
                            i39 = i15;
                        }
                        if ((i30 & 306783379) == 306783378) {
                            z16 = true;
                        } else {
                            z16 = true;
                        }
                        if (o0VarE.n(i30 & 1, z16)) {
                            int i4119 = i30;
                            if (i47 != 0) {
                                fVar4 = null;
                            } else {
                                fVar4 = fVar2;
                            }
                            if (i18 != 0) {
                                str3 = null;
                            }
                            if (i24 != 0) {
                                z18 = false;
                            } else {
                                z18 = z15;
                            }
                            if (i26 != 0) {
                                i45 = i39;
                                f19 = 0.0f;
                            } else {
                                int i5110 = i39;
                                f19 = f16;
                                i45 = i5110;
                            }
                            if (i28 != 0) {
                                f22 = 0.0f;
                            } else {
                                f22 = f15;
                            }
                            if (i34 != 0) {
                                aVar3 = null;
                            } else {
                                aVar3 = aVar;
                            }
                            if (i36 != 0) {
                                pVar3 = null;
                            } else {
                                pVar3 = pVar;
                            }
                            if (i38 != 0) {
                                qVar3 = null;
                            } else {
                                qVar3 = qVar;
                            }
                            x1 x1Var17 = p3.n.f135158a;
                            o0Var = o0VarE;
                            a(rVar, cVar2, z3.f.c(263761673, new fv1.b(str3, 23), o0VarE), fVar4, z18, str4, f19, f22, aVar3, pVar3, qVar3, o0Var, (i4119 & 14) | 384 | (i4119 & 112) | ((i4119 << 3) & 7168) | (57344 & i4119) | (458752 & i4119) | (3670016 & i4119) | (29360128 & i4119) | (234881024 & i4119) | (i4119 & 1879048192), i45 & 14, 0);
                            str5 = str3;
                            fVar3 = fVar4;
                            z17 = z18;
                            f18 = f19;
                            f17 = f22;
                            aVar2 = aVar3;
                            pVar2 = pVar3;
                            qVar2 = qVar3;
                        } else {
                            o0Var = o0VarE;
                            o0Var.e();
                            f17 = f15;
                            pVar2 = pVar;
                            fVar3 = fVar2;
                            z17 = z15;
                            qVar2 = qVar;
                            f18 = f16;
                            str5 = str3;
                            aVar2 = aVar;
                        }
                        p2VarI0 = o0Var.i0();
                        if (p2VarI0 != null) {
                            p2VarI0.f135219d = new p(rVar, cVar, fVar3, str5, z17, str2, f18, f17, aVar2, pVar2, qVar2, i14, i15, i16);
                        }
                    }
                    i30 |= C.ENCODING_PCM_32BIT;
                    i38 = i16 & 1024;
                    if (i38 != 0) {
                        i39 = 6;
                    } else if ((i15 & 6) == 0) {
                        if (o0VarE.r(qVar)) {
                            i44 = 4;
                        } else {
                            i44 = 2;
                        }
                        i39 = i15 | i44;
                    } else {
                        i39 = i15;
                    }
                    if ((i30 & 306783379) == 306783378) {
                        z16 = true;
                    } else {
                        z16 = true;
                    }
                    if (o0VarE.n(i30 & 1, z16)) {
                        int i41110 = i30;
                        if (i47 != 0) {
                            fVar4 = null;
                        } else {
                            fVar4 = fVar2;
                        }
                        if (i18 != 0) {
                            str3 = null;
                        }
                        if (i24 != 0) {
                            z18 = false;
                        } else {
                            z18 = z15;
                        }
                        if (i26 != 0) {
                            i45 = i39;
                            f19 = 0.0f;
                        } else {
                            int i5111 = i39;
                            f19 = f16;
                            i45 = i5111;
                        }
                        if (i28 != 0) {
                            f22 = 0.0f;
                        } else {
                            f22 = f15;
                        }
                        if (i34 != 0) {
                            aVar3 = null;
                        } else {
                            aVar3 = aVar;
                        }
                        if (i36 != 0) {
                            pVar3 = null;
                        } else {
                            pVar3 = pVar;
                        }
                        if (i38 != 0) {
                            qVar3 = null;
                        } else {
                            qVar3 = qVar;
                        }
                        x1 x1Var18 = p3.n.f135158a;
                        o0Var = o0VarE;
                        a(rVar, cVar2, z3.f.c(263761673, new fv1.b(str3, 23), o0VarE), fVar4, z18, str4, f19, f22, aVar3, pVar3, qVar3, o0Var, (i41110 & 14) | 384 | (i41110 & 112) | ((i41110 << 3) & 7168) | (57344 & i41110) | (458752 & i41110) | (3670016 & i41110) | (29360128 & i41110) | (234881024 & i41110) | (i41110 & 1879048192), i45 & 14, 0);
                        str5 = str3;
                        fVar3 = fVar4;
                        z17 = z18;
                        f18 = f19;
                        f17 = f22;
                        aVar2 = aVar3;
                        pVar2 = pVar3;
                        qVar2 = qVar3;
                    } else {
                        o0Var = o0VarE;
                        o0Var.e();
                        f17 = f15;
                        pVar2 = pVar;
                        fVar3 = fVar2;
                        z17 = z15;
                        qVar2 = qVar;
                        f18 = f16;
                        str5 = str3;
                        aVar2 = aVar;
                    }
                    p2VarI0 = o0Var.i0();
                    if (p2VarI0 != null) {
                        p2VarI0.f135219d = new p(rVar, cVar, fVar3, str5, z17, str2, f18, f17, aVar2, pVar2, qVar2, i14, i15, i16);
                    }
                }
                i17 |= 12582912;
                i30 = i17;
                i34 = i16 & 256;
                i35 = 100663296;
                if (i34 == 0) {
                    i30 |= i35;
                } else if ((i14 & 100663296) == 0) {
                    if ((i14 & 134217728) == 0) {
                        zR = o0VarE.B(aVar);
                    } else {
                        zR = o0VarE.r(aVar);
                    }
                    if (zR) {
                        i35 = 67108864;
                    } else {
                        i35 = 33554432;
                    }
                    i30 |= i35;
                }
                i36 = i16 & 512;
                if (i36 != 0) {
                    if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                        if (o0VarE.r(pVar)) {
                            i37 = 536870912;
                        } else {
                            i37 = 268435456;
                        }
                        i30 |= i37;
                    }
                    i38 = i16 & 1024;
                    if (i38 != 0) {
                        i39 = 6;
                    } else if ((i15 & 6) == 0) {
                        if (o0VarE.r(qVar)) {
                            i44 = 4;
                        } else {
                            i44 = 2;
                        }
                        i39 = i15 | i44;
                    } else {
                        i39 = i15;
                    }
                    if ((i30 & 306783379) == 306783378) {
                        z16 = true;
                    } else {
                        z16 = true;
                    }
                    if (o0VarE.n(i30 & 1, z16)) {
                        int i41111 = i30;
                        if (i47 != 0) {
                            fVar4 = null;
                        } else {
                            fVar4 = fVar2;
                        }
                        if (i18 != 0) {
                            str3 = null;
                        }
                        if (i24 != 0) {
                            z18 = false;
                        } else {
                            z18 = z15;
                        }
                        if (i26 != 0) {
                            i45 = i39;
                            f19 = 0.0f;
                        } else {
                            int i5112 = i39;
                            f19 = f16;
                            i45 = i5112;
                        }
                        if (i28 != 0) {
                            f22 = 0.0f;
                        } else {
                            f22 = f15;
                        }
                        if (i34 != 0) {
                            aVar3 = null;
                        } else {
                            aVar3 = aVar;
                        }
                        if (i36 != 0) {
                            pVar3 = null;
                        } else {
                            pVar3 = pVar;
                        }
                        if (i38 != 0) {
                            qVar3 = null;
                        } else {
                            qVar3 = qVar;
                        }
                        x1 x1Var19 = p3.n.f135158a;
                        o0Var = o0VarE;
                        a(rVar, cVar2, z3.f.c(263761673, new fv1.b(str3, 23), o0VarE), fVar4, z18, str4, f19, f22, aVar3, pVar3, qVar3, o0Var, (i41111 & 14) | 384 | (i41111 & 112) | ((i41111 << 3) & 7168) | (57344 & i41111) | (458752 & i41111) | (3670016 & i41111) | (29360128 & i41111) | (234881024 & i41111) | (i41111 & 1879048192), i45 & 14, 0);
                        str5 = str3;
                        fVar3 = fVar4;
                        z17 = z18;
                        f18 = f19;
                        f17 = f22;
                        aVar2 = aVar3;
                        pVar2 = pVar3;
                        qVar2 = qVar3;
                    } else {
                        o0Var = o0VarE;
                        o0Var.e();
                        f17 = f15;
                        pVar2 = pVar;
                        fVar3 = fVar2;
                        z17 = z15;
                        qVar2 = qVar;
                        f18 = f16;
                        str5 = str3;
                        aVar2 = aVar;
                    }
                    p2VarI0 = o0Var.i0();
                    if (p2VarI0 != null) {
                        p2VarI0.f135219d = new p(rVar, cVar, fVar3, str5, z17, str2, f18, f17, aVar2, pVar2, qVar2, i14, i15, i16);
                    }
                }
                i30 |= C.ENCODING_PCM_32BIT;
                i38 = i16 & 1024;
                if (i38 != 0) {
                    i39 = 6;
                } else if ((i15 & 6) == 0) {
                    if (o0VarE.r(qVar)) {
                        i44 = 4;
                    } else {
                        i44 = 2;
                    }
                    i39 = i15 | i44;
                } else {
                    i39 = i15;
                }
                if ((i30 & 306783379) == 306783378) {
                    z16 = true;
                } else {
                    z16 = true;
                }
                if (o0VarE.n(i30 & 1, z16)) {
                    int i41112 = i30;
                    if (i47 != 0) {
                        fVar4 = null;
                    } else {
                        fVar4 = fVar2;
                    }
                    if (i18 != 0) {
                        str3 = null;
                    }
                    if (i24 != 0) {
                        z18 = false;
                    } else {
                        z18 = z15;
                    }
                    if (i26 != 0) {
                        i45 = i39;
                        f19 = 0.0f;
                    } else {
                        int i5113 = i39;
                        f19 = f16;
                        i45 = i5113;
                    }
                    if (i28 != 0) {
                        f22 = 0.0f;
                    } else {
                        f22 = f15;
                    }
                    if (i34 != 0) {
                        aVar3 = null;
                    } else {
                        aVar3 = aVar;
                    }
                    if (i36 != 0) {
                        pVar3 = null;
                    } else {
                        pVar3 = pVar;
                    }
                    if (i38 != 0) {
                        qVar3 = null;
                    } else {
                        qVar3 = qVar;
                    }
                    x1 x1Var110 = p3.n.f135158a;
                    o0Var = o0VarE;
                    a(rVar, cVar2, z3.f.c(263761673, new fv1.b(str3, 23), o0VarE), fVar4, z18, str4, f19, f22, aVar3, pVar3, qVar3, o0Var, (i41112 & 14) | 384 | (i41112 & 112) | ((i41112 << 3) & 7168) | (57344 & i41112) | (458752 & i41112) | (3670016 & i41112) | (29360128 & i41112) | (234881024 & i41112) | (i41112 & 1879048192), i45 & 14, 0);
                    str5 = str3;
                    fVar3 = fVar4;
                    z17 = z18;
                    f18 = f19;
                    f17 = f22;
                    aVar2 = aVar3;
                    pVar2 = pVar3;
                    qVar2 = qVar3;
                } else {
                    o0Var = o0VarE;
                    o0Var.e();
                    f17 = f15;
                    pVar2 = pVar;
                    fVar3 = fVar2;
                    z17 = z15;
                    qVar2 = qVar;
                    f18 = f16;
                    str5 = str3;
                    aVar2 = aVar;
                }
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new p(rVar, cVar, fVar3, str5, z17, str2, f18, f17, aVar2, pVar2, qVar2, i14, i15, i16);
                }
            }
            i17 |= 24576;
            z15 = z14;
            if ((196608 & i14) == 0) {
                str4 = str2;
                if (o0VarE.B(str4)) {
                    i46 = 131072;
                } else {
                    i46 = 65536;
                }
                i17 |= i46;
            } else {
                str4 = str2;
            }
            i26 = i16 & 64;
            if (i26 != 0) {
                i17 |= 1572864;
                f16 = f14;
            } else {
                f16 = f14;
                if ((i14 & 1572864) == 0) {
                    if (o0VarE.i(f16)) {
                        i27 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    } else {
                        i27 = 524288;
                    }
                    i17 |= i27;
                }
            }
            i28 = i16 & 128;
            if (i28 != 0) {
                if ((i14 & 12582912) == 0) {
                    int i41113 = i17;
                    if (o0VarE.i(f15)) {
                        i29 = 8388608;
                    } else {
                        i29 = 4194304;
                    }
                    i30 = i41113 | i29;
                }
                i34 = i16 & 256;
                i35 = 100663296;
                if (i34 == 0) {
                    i30 |= i35;
                } else if ((i14 & 100663296) == 0) {
                    if ((i14 & 134217728) == 0) {
                        zR = o0VarE.B(aVar);
                    } else {
                        zR = o0VarE.r(aVar);
                    }
                    if (zR) {
                        i35 = 67108864;
                    } else {
                        i35 = 33554432;
                    }
                    i30 |= i35;
                }
                i36 = i16 & 512;
                if (i36 != 0) {
                    if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                        if (o0VarE.r(pVar)) {
                            i37 = 536870912;
                        } else {
                            i37 = 268435456;
                        }
                        i30 |= i37;
                    }
                    i38 = i16 & 1024;
                    if (i38 != 0) {
                        i39 = 6;
                    } else if ((i15 & 6) == 0) {
                        if (o0VarE.r(qVar)) {
                            i44 = 4;
                        } else {
                            i44 = 2;
                        }
                        i39 = i15 | i44;
                    } else {
                        i39 = i15;
                    }
                    if ((i30 & 306783379) == 306783378) {
                        z16 = true;
                    } else {
                        z16 = true;
                    }
                    if (o0VarE.n(i30 & 1, z16)) {
                        int i41114 = i30;
                        if (i47 != 0) {
                            fVar4 = null;
                        } else {
                            fVar4 = fVar2;
                        }
                        if (i18 != 0) {
                            str3 = null;
                        }
                        if (i24 != 0) {
                            z18 = false;
                        } else {
                            z18 = z15;
                        }
                        if (i26 != 0) {
                            i45 = i39;
                            f19 = 0.0f;
                        } else {
                            int i5114 = i39;
                            f19 = f16;
                            i45 = i5114;
                        }
                        if (i28 != 0) {
                            f22 = 0.0f;
                        } else {
                            f22 = f15;
                        }
                        if (i34 != 0) {
                            aVar3 = null;
                        } else {
                            aVar3 = aVar;
                        }
                        if (i36 != 0) {
                            pVar3 = null;
                        } else {
                            pVar3 = pVar;
                        }
                        if (i38 != 0) {
                            qVar3 = null;
                        } else {
                            qVar3 = qVar;
                        }
                        x1 x1Var111 = p3.n.f135158a;
                        o0Var = o0VarE;
                        a(rVar, cVar2, z3.f.c(263761673, new fv1.b(str3, 23), o0VarE), fVar4, z18, str4, f19, f22, aVar3, pVar3, qVar3, o0Var, (i41114 & 14) | 384 | (i41114 & 112) | ((i41114 << 3) & 7168) | (57344 & i41114) | (458752 & i41114) | (3670016 & i41114) | (29360128 & i41114) | (234881024 & i41114) | (i41114 & 1879048192), i45 & 14, 0);
                        str5 = str3;
                        fVar3 = fVar4;
                        z17 = z18;
                        f18 = f19;
                        f17 = f22;
                        aVar2 = aVar3;
                        pVar2 = pVar3;
                        qVar2 = qVar3;
                    } else {
                        o0Var = o0VarE;
                        o0Var.e();
                        f17 = f15;
                        pVar2 = pVar;
                        fVar3 = fVar2;
                        z17 = z15;
                        qVar2 = qVar;
                        f18 = f16;
                        str5 = str3;
                        aVar2 = aVar;
                    }
                    p2VarI0 = o0Var.i0();
                    if (p2VarI0 != null) {
                        p2VarI0.f135219d = new p(rVar, cVar, fVar3, str5, z17, str2, f18, f17, aVar2, pVar2, qVar2, i14, i15, i16);
                    }
                }
                i30 |= C.ENCODING_PCM_32BIT;
                i38 = i16 & 1024;
                if (i38 != 0) {
                    i39 = 6;
                } else if ((i15 & 6) == 0) {
                    if (o0VarE.r(qVar)) {
                        i44 = 4;
                    } else {
                        i44 = 2;
                    }
                    i39 = i15 | i44;
                } else {
                    i39 = i15;
                }
                if ((i30 & 306783379) == 306783378) {
                    z16 = true;
                } else {
                    z16 = true;
                }
                if (o0VarE.n(i30 & 1, z16)) {
                    int i41115 = i30;
                    if (i47 != 0) {
                        fVar4 = null;
                    } else {
                        fVar4 = fVar2;
                    }
                    if (i18 != 0) {
                        str3 = null;
                    }
                    if (i24 != 0) {
                        z18 = false;
                    } else {
                        z18 = z15;
                    }
                    if (i26 != 0) {
                        i45 = i39;
                        f19 = 0.0f;
                    } else {
                        int i5115 = i39;
                        f19 = f16;
                        i45 = i5115;
                    }
                    if (i28 != 0) {
                        f22 = 0.0f;
                    } else {
                        f22 = f15;
                    }
                    if (i34 != 0) {
                        aVar3 = null;
                    } else {
                        aVar3 = aVar;
                    }
                    if (i36 != 0) {
                        pVar3 = null;
                    } else {
                        pVar3 = pVar;
                    }
                    if (i38 != 0) {
                        qVar3 = null;
                    } else {
                        qVar3 = qVar;
                    }
                    x1 x1Var112 = p3.n.f135158a;
                    o0Var = o0VarE;
                    a(rVar, cVar2, z3.f.c(263761673, new fv1.b(str3, 23), o0VarE), fVar4, z18, str4, f19, f22, aVar3, pVar3, qVar3, o0Var, (i41115 & 14) | 384 | (i41115 & 112) | ((i41115 << 3) & 7168) | (57344 & i41115) | (458752 & i41115) | (3670016 & i41115) | (29360128 & i41115) | (234881024 & i41115) | (i41115 & 1879048192), i45 & 14, 0);
                    str5 = str3;
                    fVar3 = fVar4;
                    z17 = z18;
                    f18 = f19;
                    f17 = f22;
                    aVar2 = aVar3;
                    pVar2 = pVar3;
                    qVar2 = qVar3;
                } else {
                    o0Var = o0VarE;
                    o0Var.e();
                    f17 = f15;
                    pVar2 = pVar;
                    fVar3 = fVar2;
                    z17 = z15;
                    qVar2 = qVar;
                    f18 = f16;
                    str5 = str3;
                    aVar2 = aVar;
                }
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new p(rVar, cVar, fVar3, str5, z17, str2, f18, f17, aVar2, pVar2, qVar2, i14, i15, i16);
                }
            }
            i17 |= 12582912;
            i30 = i17;
            i34 = i16 & 256;
            i35 = 100663296;
            if (i34 == 0) {
                i30 |= i35;
            } else if ((i14 & 100663296) == 0) {
                if ((i14 & 134217728) == 0) {
                    zR = o0VarE.B(aVar);
                } else {
                    zR = o0VarE.r(aVar);
                }
                if (zR) {
                    i35 = 67108864;
                } else {
                    i35 = 33554432;
                }
                i30 |= i35;
            }
            i36 = i16 & 512;
            if (i36 != 0) {
                if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                    if (o0VarE.r(pVar)) {
                        i37 = 536870912;
                    } else {
                        i37 = 268435456;
                    }
                    i30 |= i37;
                }
                i38 = i16 & 1024;
                if (i38 != 0) {
                    i39 = 6;
                } else if ((i15 & 6) == 0) {
                    if (o0VarE.r(qVar)) {
                        i44 = 4;
                    } else {
                        i44 = 2;
                    }
                    i39 = i15 | i44;
                } else {
                    i39 = i15;
                }
                if ((i30 & 306783379) == 306783378) {
                    z16 = true;
                } else {
                    z16 = true;
                }
                if (o0VarE.n(i30 & 1, z16)) {
                    int i41116 = i30;
                    if (i47 != 0) {
                        fVar4 = null;
                    } else {
                        fVar4 = fVar2;
                    }
                    if (i18 != 0) {
                        str3 = null;
                    }
                    if (i24 != 0) {
                        z18 = false;
                    } else {
                        z18 = z15;
                    }
                    if (i26 != 0) {
                        i45 = i39;
                        f19 = 0.0f;
                    } else {
                        int i5116 = i39;
                        f19 = f16;
                        i45 = i5116;
                    }
                    if (i28 != 0) {
                        f22 = 0.0f;
                    } else {
                        f22 = f15;
                    }
                    if (i34 != 0) {
                        aVar3 = null;
                    } else {
                        aVar3 = aVar;
                    }
                    if (i36 != 0) {
                        pVar3 = null;
                    } else {
                        pVar3 = pVar;
                    }
                    if (i38 != 0) {
                        qVar3 = null;
                    } else {
                        qVar3 = qVar;
                    }
                    x1 x1Var113 = p3.n.f135158a;
                    o0Var = o0VarE;
                    a(rVar, cVar2, z3.f.c(263761673, new fv1.b(str3, 23), o0VarE), fVar4, z18, str4, f19, f22, aVar3, pVar3, qVar3, o0Var, (i41116 & 14) | 384 | (i41116 & 112) | ((i41116 << 3) & 7168) | (57344 & i41116) | (458752 & i41116) | (3670016 & i41116) | (29360128 & i41116) | (234881024 & i41116) | (i41116 & 1879048192), i45 & 14, 0);
                    str5 = str3;
                    fVar3 = fVar4;
                    z17 = z18;
                    f18 = f19;
                    f17 = f22;
                    aVar2 = aVar3;
                    pVar2 = pVar3;
                    qVar2 = qVar3;
                } else {
                    o0Var = o0VarE;
                    o0Var.e();
                    f17 = f15;
                    pVar2 = pVar;
                    fVar3 = fVar2;
                    z17 = z15;
                    qVar2 = qVar;
                    f18 = f16;
                    str5 = str3;
                    aVar2 = aVar;
                }
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new p(rVar, cVar, fVar3, str5, z17, str2, f18, f17, aVar2, pVar2, qVar2, i14, i15, i16);
                }
            }
            i30 |= C.ENCODING_PCM_32BIT;
            i38 = i16 & 1024;
            if (i38 != 0) {
                i39 = 6;
            } else if ((i15 & 6) == 0) {
                if (o0VarE.r(qVar)) {
                    i44 = 4;
                } else {
                    i44 = 2;
                }
                i39 = i15 | i44;
            } else {
                i39 = i15;
            }
            if ((i30 & 306783379) == 306783378) {
                z16 = true;
            } else {
                z16 = true;
            }
            if (o0VarE.n(i30 & 1, z16)) {
                int i41117 = i30;
                if (i47 != 0) {
                    fVar4 = null;
                } else {
                    fVar4 = fVar2;
                }
                if (i18 != 0) {
                    str3 = null;
                }
                if (i24 != 0) {
                    z18 = false;
                } else {
                    z18 = z15;
                }
                if (i26 != 0) {
                    i45 = i39;
                    f19 = 0.0f;
                } else {
                    int i5117 = i39;
                    f19 = f16;
                    i45 = i5117;
                }
                if (i28 != 0) {
                    f22 = 0.0f;
                } else {
                    f22 = f15;
                }
                if (i34 != 0) {
                    aVar3 = null;
                } else {
                    aVar3 = aVar;
                }
                if (i36 != 0) {
                    pVar3 = null;
                } else {
                    pVar3 = pVar;
                }
                if (i38 != 0) {
                    qVar3 = null;
                } else {
                    qVar3 = qVar;
                }
                x1 x1Var114 = p3.n.f135158a;
                o0Var = o0VarE;
                a(rVar, cVar2, z3.f.c(263761673, new fv1.b(str3, 23), o0VarE), fVar4, z18, str4, f19, f22, aVar3, pVar3, qVar3, o0Var, (i41117 & 14) | 384 | (i41117 & 112) | ((i41117 << 3) & 7168) | (57344 & i41117) | (458752 & i41117) | (3670016 & i41117) | (29360128 & i41117) | (234881024 & i41117) | (i41117 & 1879048192), i45 & 14, 0);
                str5 = str3;
                fVar3 = fVar4;
                z17 = z18;
                f18 = f19;
                f17 = f22;
                aVar2 = aVar3;
                pVar2 = pVar3;
                qVar2 = qVar3;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                f17 = f15;
                pVar2 = pVar;
                fVar3 = fVar2;
                z17 = z15;
                qVar2 = qVar;
                f18 = f16;
                str5 = str3;
                aVar2 = aVar;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new p(rVar, cVar, fVar3, str5, z17, str2, f18, f17, aVar2, pVar2, qVar2, i14, i15, i16);
            }
        }
        i17 |= 3072;
        str3 = str;
        i24 = i16 & 16;
        if (i24 != 0) {
            if ((i14 & 24576) == 0) {
                z15 = z14;
                if (o0VarE.h(z15)) {
                    i25 = 16384;
                } else {
                    i25 = 8192;
                }
                i17 |= i25;
            }
            if ((196608 & i14) == 0) {
                str4 = str2;
                if (o0VarE.B(str4)) {
                    i46 = 131072;
                } else {
                    i46 = 65536;
                }
                i17 |= i46;
            } else {
                str4 = str2;
            }
            i26 = i16 & 64;
            if (i26 != 0) {
                i17 |= 1572864;
                f16 = f14;
            } else {
                f16 = f14;
                if ((i14 & 1572864) == 0) {
                    if (o0VarE.i(f16)) {
                        i27 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    } else {
                        i27 = 524288;
                    }
                    i17 |= i27;
                }
            }
            i28 = i16 & 128;
            if (i28 != 0) {
                if ((i14 & 12582912) == 0) {
                    int i41118 = i17;
                    if (o0VarE.i(f15)) {
                        i29 = 8388608;
                    } else {
                        i29 = 4194304;
                    }
                    i30 = i41118 | i29;
                }
                i34 = i16 & 256;
                i35 = 100663296;
                if (i34 == 0) {
                    i30 |= i35;
                } else if ((i14 & 100663296) == 0) {
                    if ((i14 & 134217728) == 0) {
                        zR = o0VarE.B(aVar);
                    } else {
                        zR = o0VarE.r(aVar);
                    }
                    if (zR) {
                        i35 = 67108864;
                    } else {
                        i35 = 33554432;
                    }
                    i30 |= i35;
                }
                i36 = i16 & 512;
                if (i36 != 0) {
                    if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                        if (o0VarE.r(pVar)) {
                            i37 = 536870912;
                        } else {
                            i37 = 268435456;
                        }
                        i30 |= i37;
                    }
                    i38 = i16 & 1024;
                    if (i38 != 0) {
                        i39 = 6;
                    } else if ((i15 & 6) == 0) {
                        if (o0VarE.r(qVar)) {
                            i44 = 4;
                        } else {
                            i44 = 2;
                        }
                        i39 = i15 | i44;
                    } else {
                        i39 = i15;
                    }
                    if ((i30 & 306783379) == 306783378) {
                        z16 = true;
                    } else {
                        z16 = true;
                    }
                    if (o0VarE.n(i30 & 1, z16)) {
                        int i41119 = i30;
                        if (i47 != 0) {
                            fVar4 = null;
                        } else {
                            fVar4 = fVar2;
                        }
                        if (i18 != 0) {
                            str3 = null;
                        }
                        if (i24 != 0) {
                            z18 = false;
                        } else {
                            z18 = z15;
                        }
                        if (i26 != 0) {
                            i45 = i39;
                            f19 = 0.0f;
                        } else {
                            int i5118 = i39;
                            f19 = f16;
                            i45 = i5118;
                        }
                        if (i28 != 0) {
                            f22 = 0.0f;
                        } else {
                            f22 = f15;
                        }
                        if (i34 != 0) {
                            aVar3 = null;
                        } else {
                            aVar3 = aVar;
                        }
                        if (i36 != 0) {
                            pVar3 = null;
                        } else {
                            pVar3 = pVar;
                        }
                        if (i38 != 0) {
                            qVar3 = null;
                        } else {
                            qVar3 = qVar;
                        }
                        x1 x1Var115 = p3.n.f135158a;
                        o0Var = o0VarE;
                        a(rVar, cVar2, z3.f.c(263761673, new fv1.b(str3, 23), o0VarE), fVar4, z18, str4, f19, f22, aVar3, pVar3, qVar3, o0Var, (i41119 & 14) | 384 | (i41119 & 112) | ((i41119 << 3) & 7168) | (57344 & i41119) | (458752 & i41119) | (3670016 & i41119) | (29360128 & i41119) | (234881024 & i41119) | (i41119 & 1879048192), i45 & 14, 0);
                        str5 = str3;
                        fVar3 = fVar4;
                        z17 = z18;
                        f18 = f19;
                        f17 = f22;
                        aVar2 = aVar3;
                        pVar2 = pVar3;
                        qVar2 = qVar3;
                    } else {
                        o0Var = o0VarE;
                        o0Var.e();
                        f17 = f15;
                        pVar2 = pVar;
                        fVar3 = fVar2;
                        z17 = z15;
                        qVar2 = qVar;
                        f18 = f16;
                        str5 = str3;
                        aVar2 = aVar;
                    }
                    p2VarI0 = o0Var.i0();
                    if (p2VarI0 != null) {
                        p2VarI0.f135219d = new p(rVar, cVar, fVar3, str5, z17, str2, f18, f17, aVar2, pVar2, qVar2, i14, i15, i16);
                    }
                }
                i30 |= C.ENCODING_PCM_32BIT;
                i38 = i16 & 1024;
                if (i38 != 0) {
                    i39 = 6;
                } else if ((i15 & 6) == 0) {
                    if (o0VarE.r(qVar)) {
                        i44 = 4;
                    } else {
                        i44 = 2;
                    }
                    i39 = i15 | i44;
                } else {
                    i39 = i15;
                }
                if ((i30 & 306783379) == 306783378) {
                    z16 = true;
                } else {
                    z16 = true;
                }
                if (o0VarE.n(i30 & 1, z16)) {
                    int i411110 = i30;
                    if (i47 != 0) {
                        fVar4 = null;
                    } else {
                        fVar4 = fVar2;
                    }
                    if (i18 != 0) {
                        str3 = null;
                    }
                    if (i24 != 0) {
                        z18 = false;
                    } else {
                        z18 = z15;
                    }
                    if (i26 != 0) {
                        i45 = i39;
                        f19 = 0.0f;
                    } else {
                        int i5119 = i39;
                        f19 = f16;
                        i45 = i5119;
                    }
                    if (i28 != 0) {
                        f22 = 0.0f;
                    } else {
                        f22 = f15;
                    }
                    if (i34 != 0) {
                        aVar3 = null;
                    } else {
                        aVar3 = aVar;
                    }
                    if (i36 != 0) {
                        pVar3 = null;
                    } else {
                        pVar3 = pVar;
                    }
                    if (i38 != 0) {
                        qVar3 = null;
                    } else {
                        qVar3 = qVar;
                    }
                    x1 x1Var116 = p3.n.f135158a;
                    o0Var = o0VarE;
                    a(rVar, cVar2, z3.f.c(263761673, new fv1.b(str3, 23), o0VarE), fVar4, z18, str4, f19, f22, aVar3, pVar3, qVar3, o0Var, (i411110 & 14) | 384 | (i411110 & 112) | ((i411110 << 3) & 7168) | (57344 & i411110) | (458752 & i411110) | (3670016 & i411110) | (29360128 & i411110) | (234881024 & i411110) | (i411110 & 1879048192), i45 & 14, 0);
                    str5 = str3;
                    fVar3 = fVar4;
                    z17 = z18;
                    f18 = f19;
                    f17 = f22;
                    aVar2 = aVar3;
                    pVar2 = pVar3;
                    qVar2 = qVar3;
                } else {
                    o0Var = o0VarE;
                    o0Var.e();
                    f17 = f15;
                    pVar2 = pVar;
                    fVar3 = fVar2;
                    z17 = z15;
                    qVar2 = qVar;
                    f18 = f16;
                    str5 = str3;
                    aVar2 = aVar;
                }
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new p(rVar, cVar, fVar3, str5, z17, str2, f18, f17, aVar2, pVar2, qVar2, i14, i15, i16);
                }
            }
            i17 |= 12582912;
            i30 = i17;
            i34 = i16 & 256;
            i35 = 100663296;
            if (i34 == 0) {
                i30 |= i35;
            } else if ((i14 & 100663296) == 0) {
                if ((i14 & 134217728) == 0) {
                    zR = o0VarE.B(aVar);
                } else {
                    zR = o0VarE.r(aVar);
                }
                if (zR) {
                    i35 = 67108864;
                } else {
                    i35 = 33554432;
                }
                i30 |= i35;
            }
            i36 = i16 & 512;
            if (i36 != 0) {
                if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                    if (o0VarE.r(pVar)) {
                        i37 = 536870912;
                    } else {
                        i37 = 268435456;
                    }
                    i30 |= i37;
                }
                i38 = i16 & 1024;
                if (i38 != 0) {
                    i39 = 6;
                } else if ((i15 & 6) == 0) {
                    if (o0VarE.r(qVar)) {
                        i44 = 4;
                    } else {
                        i44 = 2;
                    }
                    i39 = i15 | i44;
                } else {
                    i39 = i15;
                }
                if ((i30 & 306783379) == 306783378) {
                    z16 = true;
                } else {
                    z16 = true;
                }
                if (o0VarE.n(i30 & 1, z16)) {
                    int i411111 = i30;
                    if (i47 != 0) {
                        fVar4 = null;
                    } else {
                        fVar4 = fVar2;
                    }
                    if (i18 != 0) {
                        str3 = null;
                    }
                    if (i24 != 0) {
                        z18 = false;
                    } else {
                        z18 = z15;
                    }
                    if (i26 != 0) {
                        i45 = i39;
                        f19 = 0.0f;
                    } else {
                        int i51110 = i39;
                        f19 = f16;
                        i45 = i51110;
                    }
                    if (i28 != 0) {
                        f22 = 0.0f;
                    } else {
                        f22 = f15;
                    }
                    if (i34 != 0) {
                        aVar3 = null;
                    } else {
                        aVar3 = aVar;
                    }
                    if (i36 != 0) {
                        pVar3 = null;
                    } else {
                        pVar3 = pVar;
                    }
                    if (i38 != 0) {
                        qVar3 = null;
                    } else {
                        qVar3 = qVar;
                    }
                    x1 x1Var117 = p3.n.f135158a;
                    o0Var = o0VarE;
                    a(rVar, cVar2, z3.f.c(263761673, new fv1.b(str3, 23), o0VarE), fVar4, z18, str4, f19, f22, aVar3, pVar3, qVar3, o0Var, (i411111 & 14) | 384 | (i411111 & 112) | ((i411111 << 3) & 7168) | (57344 & i411111) | (458752 & i411111) | (3670016 & i411111) | (29360128 & i411111) | (234881024 & i411111) | (i411111 & 1879048192), i45 & 14, 0);
                    str5 = str3;
                    fVar3 = fVar4;
                    z17 = z18;
                    f18 = f19;
                    f17 = f22;
                    aVar2 = aVar3;
                    pVar2 = pVar3;
                    qVar2 = qVar3;
                } else {
                    o0Var = o0VarE;
                    o0Var.e();
                    f17 = f15;
                    pVar2 = pVar;
                    fVar3 = fVar2;
                    z17 = z15;
                    qVar2 = qVar;
                    f18 = f16;
                    str5 = str3;
                    aVar2 = aVar;
                }
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new p(rVar, cVar, fVar3, str5, z17, str2, f18, f17, aVar2, pVar2, qVar2, i14, i15, i16);
                }
            }
            i30 |= C.ENCODING_PCM_32BIT;
            i38 = i16 & 1024;
            if (i38 != 0) {
                i39 = 6;
            } else if ((i15 & 6) == 0) {
                if (o0VarE.r(qVar)) {
                    i44 = 4;
                } else {
                    i44 = 2;
                }
                i39 = i15 | i44;
            } else {
                i39 = i15;
            }
            if ((i30 & 306783379) == 306783378) {
                z16 = true;
            } else {
                z16 = true;
            }
            if (o0VarE.n(i30 & 1, z16)) {
                int i411112 = i30;
                if (i47 != 0) {
                    fVar4 = null;
                } else {
                    fVar4 = fVar2;
                }
                if (i18 != 0) {
                    str3 = null;
                }
                if (i24 != 0) {
                    z18 = false;
                } else {
                    z18 = z15;
                }
                if (i26 != 0) {
                    i45 = i39;
                    f19 = 0.0f;
                } else {
                    int i51111 = i39;
                    f19 = f16;
                    i45 = i51111;
                }
                if (i28 != 0) {
                    f22 = 0.0f;
                } else {
                    f22 = f15;
                }
                if (i34 != 0) {
                    aVar3 = null;
                } else {
                    aVar3 = aVar;
                }
                if (i36 != 0) {
                    pVar3 = null;
                } else {
                    pVar3 = pVar;
                }
                if (i38 != 0) {
                    qVar3 = null;
                } else {
                    qVar3 = qVar;
                }
                x1 x1Var118 = p3.n.f135158a;
                o0Var = o0VarE;
                a(rVar, cVar2, z3.f.c(263761673, new fv1.b(str3, 23), o0VarE), fVar4, z18, str4, f19, f22, aVar3, pVar3, qVar3, o0Var, (i411112 & 14) | 384 | (i411112 & 112) | ((i411112 << 3) & 7168) | (57344 & i411112) | (458752 & i411112) | (3670016 & i411112) | (29360128 & i411112) | (234881024 & i411112) | (i411112 & 1879048192), i45 & 14, 0);
                str5 = str3;
                fVar3 = fVar4;
                z17 = z18;
                f18 = f19;
                f17 = f22;
                aVar2 = aVar3;
                pVar2 = pVar3;
                qVar2 = qVar3;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                f17 = f15;
                pVar2 = pVar;
                fVar3 = fVar2;
                z17 = z15;
                qVar2 = qVar;
                f18 = f16;
                str5 = str3;
                aVar2 = aVar;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new p(rVar, cVar, fVar3, str5, z17, str2, f18, f17, aVar2, pVar2, qVar2, i14, i15, i16);
            }
        }
        i17 |= 24576;
        z15 = z14;
        if ((196608 & i14) == 0) {
            str4 = str2;
            if (o0VarE.B(str4)) {
                i46 = 131072;
            } else {
                i46 = 65536;
            }
            i17 |= i46;
        } else {
            str4 = str2;
        }
        i26 = i16 & 64;
        if (i26 != 0) {
            i17 |= 1572864;
            f16 = f14;
        } else {
            f16 = f14;
            if ((i14 & 1572864) == 0) {
                if (o0VarE.i(f16)) {
                    i27 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                } else {
                    i27 = 524288;
                }
                i17 |= i27;
            }
        }
        i28 = i16 & 128;
        if (i28 != 0) {
            if ((i14 & 12582912) == 0) {
                int i411113 = i17;
                if (o0VarE.i(f15)) {
                    i29 = 8388608;
                } else {
                    i29 = 4194304;
                }
                i30 = i411113 | i29;
            }
            i34 = i16 & 256;
            i35 = 100663296;
            if (i34 == 0) {
                i30 |= i35;
            } else if ((i14 & 100663296) == 0) {
                if ((i14 & 134217728) == 0) {
                    zR = o0VarE.B(aVar);
                } else {
                    zR = o0VarE.r(aVar);
                }
                if (zR) {
                    i35 = 67108864;
                } else {
                    i35 = 33554432;
                }
                i30 |= i35;
            }
            i36 = i16 & 512;
            if (i36 != 0) {
                if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                    if (o0VarE.r(pVar)) {
                        i37 = 536870912;
                    } else {
                        i37 = 268435456;
                    }
                    i30 |= i37;
                }
                i38 = i16 & 1024;
                if (i38 != 0) {
                    i39 = 6;
                } else if ((i15 & 6) == 0) {
                    if (o0VarE.r(qVar)) {
                        i44 = 4;
                    } else {
                        i44 = 2;
                    }
                    i39 = i15 | i44;
                } else {
                    i39 = i15;
                }
                if ((i30 & 306783379) == 306783378) {
                    z16 = true;
                } else {
                    z16 = true;
                }
                if (o0VarE.n(i30 & 1, z16)) {
                    int i411114 = i30;
                    if (i47 != 0) {
                        fVar4 = null;
                    } else {
                        fVar4 = fVar2;
                    }
                    if (i18 != 0) {
                        str3 = null;
                    }
                    if (i24 != 0) {
                        z18 = false;
                    } else {
                        z18 = z15;
                    }
                    if (i26 != 0) {
                        i45 = i39;
                        f19 = 0.0f;
                    } else {
                        int i51112 = i39;
                        f19 = f16;
                        i45 = i51112;
                    }
                    if (i28 != 0) {
                        f22 = 0.0f;
                    } else {
                        f22 = f15;
                    }
                    if (i34 != 0) {
                        aVar3 = null;
                    } else {
                        aVar3 = aVar;
                    }
                    if (i36 != 0) {
                        pVar3 = null;
                    } else {
                        pVar3 = pVar;
                    }
                    if (i38 != 0) {
                        qVar3 = null;
                    } else {
                        qVar3 = qVar;
                    }
                    x1 x1Var119 = p3.n.f135158a;
                    o0Var = o0VarE;
                    a(rVar, cVar2, z3.f.c(263761673, new fv1.b(str3, 23), o0VarE), fVar4, z18, str4, f19, f22, aVar3, pVar3, qVar3, o0Var, (i411114 & 14) | 384 | (i411114 & 112) | ((i411114 << 3) & 7168) | (57344 & i411114) | (458752 & i411114) | (3670016 & i411114) | (29360128 & i411114) | (234881024 & i411114) | (i411114 & 1879048192), i45 & 14, 0);
                    str5 = str3;
                    fVar3 = fVar4;
                    z17 = z18;
                    f18 = f19;
                    f17 = f22;
                    aVar2 = aVar3;
                    pVar2 = pVar3;
                    qVar2 = qVar3;
                } else {
                    o0Var = o0VarE;
                    o0Var.e();
                    f17 = f15;
                    pVar2 = pVar;
                    fVar3 = fVar2;
                    z17 = z15;
                    qVar2 = qVar;
                    f18 = f16;
                    str5 = str3;
                    aVar2 = aVar;
                }
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new p(rVar, cVar, fVar3, str5, z17, str2, f18, f17, aVar2, pVar2, qVar2, i14, i15, i16);
                }
            }
            i30 |= C.ENCODING_PCM_32BIT;
            i38 = i16 & 1024;
            if (i38 != 0) {
                i39 = 6;
            } else if ((i15 & 6) == 0) {
                if (o0VarE.r(qVar)) {
                    i44 = 4;
                } else {
                    i44 = 2;
                }
                i39 = i15 | i44;
            } else {
                i39 = i15;
            }
            if ((i30 & 306783379) == 306783378) {
                z16 = true;
            } else {
                z16 = true;
            }
            if (o0VarE.n(i30 & 1, z16)) {
                int i411115 = i30;
                if (i47 != 0) {
                    fVar4 = null;
                } else {
                    fVar4 = fVar2;
                }
                if (i18 != 0) {
                    str3 = null;
                }
                if (i24 != 0) {
                    z18 = false;
                } else {
                    z18 = z15;
                }
                if (i26 != 0) {
                    i45 = i39;
                    f19 = 0.0f;
                } else {
                    int i51113 = i39;
                    f19 = f16;
                    i45 = i51113;
                }
                if (i28 != 0) {
                    f22 = 0.0f;
                } else {
                    f22 = f15;
                }
                if (i34 != 0) {
                    aVar3 = null;
                } else {
                    aVar3 = aVar;
                }
                if (i36 != 0) {
                    pVar3 = null;
                } else {
                    pVar3 = pVar;
                }
                if (i38 != 0) {
                    qVar3 = null;
                } else {
                    qVar3 = qVar;
                }
                x1 x1Var1110 = p3.n.f135158a;
                o0Var = o0VarE;
                a(rVar, cVar2, z3.f.c(263761673, new fv1.b(str3, 23), o0VarE), fVar4, z18, str4, f19, f22, aVar3, pVar3, qVar3, o0Var, (i411115 & 14) | 384 | (i411115 & 112) | ((i411115 << 3) & 7168) | (57344 & i411115) | (458752 & i411115) | (3670016 & i411115) | (29360128 & i411115) | (234881024 & i411115) | (i411115 & 1879048192), i45 & 14, 0);
                str5 = str3;
                fVar3 = fVar4;
                z17 = z18;
                f18 = f19;
                f17 = f22;
                aVar2 = aVar3;
                pVar2 = pVar3;
                qVar2 = qVar3;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                f17 = f15;
                pVar2 = pVar;
                fVar3 = fVar2;
                z17 = z15;
                qVar2 = qVar;
                f18 = f16;
                str5 = str3;
                aVar2 = aVar;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new p(rVar, cVar, fVar3, str5, z17, str2, f18, f17, aVar2, pVar2, qVar2, i14, i15, i16);
            }
        }
        i17 |= 12582912;
        i30 = i17;
        i34 = i16 & 256;
        i35 = 100663296;
        if (i34 == 0) {
            i30 |= i35;
        } else if ((i14 & 100663296) == 0) {
            if ((i14 & 134217728) == 0) {
                zR = o0VarE.B(aVar);
            } else {
                zR = o0VarE.r(aVar);
            }
            if (zR) {
                i35 = 67108864;
            } else {
                i35 = 33554432;
            }
            i30 |= i35;
        }
        i36 = i16 & 512;
        if (i36 != 0) {
            if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                if (o0VarE.r(pVar)) {
                    i37 = 536870912;
                } else {
                    i37 = 268435456;
                }
                i30 |= i37;
            }
            i38 = i16 & 1024;
            if (i38 != 0) {
                i39 = 6;
            } else if ((i15 & 6) == 0) {
                if (o0VarE.r(qVar)) {
                    i44 = 4;
                } else {
                    i44 = 2;
                }
                i39 = i15 | i44;
            } else {
                i39 = i15;
            }
            if ((i30 & 306783379) == 306783378) {
                z16 = true;
            } else {
                z16 = true;
            }
            if (o0VarE.n(i30 & 1, z16)) {
                int i411116 = i30;
                if (i47 != 0) {
                    fVar4 = null;
                } else {
                    fVar4 = fVar2;
                }
                if (i18 != 0) {
                    str3 = null;
                }
                if (i24 != 0) {
                    z18 = false;
                } else {
                    z18 = z15;
                }
                if (i26 != 0) {
                    i45 = i39;
                    f19 = 0.0f;
                } else {
                    int i51114 = i39;
                    f19 = f16;
                    i45 = i51114;
                }
                if (i28 != 0) {
                    f22 = 0.0f;
                } else {
                    f22 = f15;
                }
                if (i34 != 0) {
                    aVar3 = null;
                } else {
                    aVar3 = aVar;
                }
                if (i36 != 0) {
                    pVar3 = null;
                } else {
                    pVar3 = pVar;
                }
                if (i38 != 0) {
                    qVar3 = null;
                } else {
                    qVar3 = qVar;
                }
                x1 x1Var1111 = p3.n.f135158a;
                o0Var = o0VarE;
                a(rVar, cVar2, z3.f.c(263761673, new fv1.b(str3, 23), o0VarE), fVar4, z18, str4, f19, f22, aVar3, pVar3, qVar3, o0Var, (i411116 & 14) | 384 | (i411116 & 112) | ((i411116 << 3) & 7168) | (57344 & i411116) | (458752 & i411116) | (3670016 & i411116) | (29360128 & i411116) | (234881024 & i411116) | (i411116 & 1879048192), i45 & 14, 0);
                str5 = str3;
                fVar3 = fVar4;
                z17 = z18;
                f18 = f19;
                f17 = f22;
                aVar2 = aVar3;
                pVar2 = pVar3;
                qVar2 = qVar3;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                f17 = f15;
                pVar2 = pVar;
                fVar3 = fVar2;
                z17 = z15;
                qVar2 = qVar;
                f18 = f16;
                str5 = str3;
                aVar2 = aVar;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new p(rVar, cVar, fVar3, str5, z17, str2, f18, f17, aVar2, pVar2, qVar2, i14, i15, i16);
            }
        }
        i30 |= C.ENCODING_PCM_32BIT;
        i38 = i16 & 1024;
        if (i38 != 0) {
            i39 = 6;
        } else if ((i15 & 6) == 0) {
            if (o0VarE.r(qVar)) {
                i44 = 4;
            } else {
                i44 = 2;
            }
            i39 = i15 | i44;
        } else {
            i39 = i15;
        }
        if ((i30 & 306783379) == 306783378) {
            z16 = true;
        } else {
            z16 = true;
        }
        if (o0VarE.n(i30 & 1, z16)) {
            int i411117 = i30;
            if (i47 != 0) {
                fVar4 = null;
            } else {
                fVar4 = fVar2;
            }
            if (i18 != 0) {
                str3 = null;
            }
            if (i24 != 0) {
                z18 = false;
            } else {
                z18 = z15;
            }
            if (i26 != 0) {
                i45 = i39;
                f19 = 0.0f;
            } else {
                int i51115 = i39;
                f19 = f16;
                i45 = i51115;
            }
            if (i28 != 0) {
                f22 = 0.0f;
            } else {
                f22 = f15;
            }
            if (i34 != 0) {
                aVar3 = null;
            } else {
                aVar3 = aVar;
            }
            if (i36 != 0) {
                pVar3 = null;
            } else {
                pVar3 = pVar;
            }
            if (i38 != 0) {
                qVar3 = null;
            } else {
                qVar3 = qVar;
            }
            x1 x1Var1112 = p3.n.f135158a;
            o0Var = o0VarE;
            a(rVar, cVar2, z3.f.c(263761673, new fv1.b(str3, 23), o0VarE), fVar4, z18, str4, f19, f22, aVar3, pVar3, qVar3, o0Var, (i411117 & 14) | 384 | (i411117 & 112) | ((i411117 << 3) & 7168) | (57344 & i411117) | (458752 & i411117) | (3670016 & i411117) | (29360128 & i411117) | (234881024 & i411117) | (i411117 & 1879048192), i45 & 14, 0);
            str5 = str3;
            fVar3 = fVar4;
            z17 = z18;
            f18 = f19;
            f17 = f22;
            aVar2 = aVar3;
            pVar2 = pVar3;
            qVar2 = qVar3;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            f17 = f15;
            pVar2 = pVar;
            fVar3 = fVar2;
            z17 = z15;
            qVar2 = qVar;
            f18 = f16;
            str5 = str3;
            aVar2 = aVar;
        }
        p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new p(rVar, cVar, fVar3, str5, z17, str2, f18, f17, aVar2, pVar2, qVar2, i14, i15, i16);
        }
    }
}
