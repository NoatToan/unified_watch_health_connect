package c2;

import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Unit;
import p3.b4;

/* JADX INFO: loaded from: classes.dex */
public final class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f22879a = 0;

    static {
        f0.b bVar = f0.f22642a;
        h4.d.f81522a.getClass();
        h4.g.b bVar2 = h4.d.a.f81533k;
        bVar.getClass();
        new f0.d(bVar2);
        new f0.c(h4.d.a.f81536n);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0048  */
    /* JADX WARN: Code duplicated, block: B:28:0x004d  */
    /* JADX WARN: Code duplicated, block: B:30:0x0051  */
    /* JADX WARN: Code duplicated, block: B:32:0x0059  */
    /* JADX WARN: Code duplicated, block: B:33:0x005c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0063  */
    /* JADX WARN: Code duplicated, block: B:39:0x0068  */
    /* JADX WARN: Code duplicated, block: B:41:0x006c  */
    /* JADX WARN: Code duplicated, block: B:43:0x0074  */
    /* JADX WARN: Code duplicated, block: B:44:0x0077  */
    /* JADX WARN: Code duplicated, block: B:48:0x007e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0083  */
    /* JADX WARN: Code duplicated, block: B:52:0x0087  */
    /* JADX WARN: Code duplicated, block: B:54:0x008f  */
    /* JADX WARN: Code duplicated, block: B:55:0x0092  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:71:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:72:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:77:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:80:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:81:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:84:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:85:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:87:0x0133  */
    /* JADX WARN: Code duplicated, block: B:90:0x0147  */
    /* JADX WARN: Code duplicated, block: B:92:? A[RETURN, SYNTHETIC] */
    public static final void a(h4.r rVar, j.e eVar, j.l lVar, h4.d.c cVar, int i14, int i15, e23.q<? super c1, ? super p3.m, ? super Integer, Unit> qVar, p3.m mVar, int i16, int i17) {
        h4.r rVar2;
        int i18;
        j.e eVar2;
        int i19;
        j.l lVar2;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        boolean z14;
        p3.o0 o0Var;
        h4.d.c cVar2;
        int i30;
        h4.r rVar3;
        j.e eVar3;
        j.l lVar3;
        int i34;
        p3.p2 p2VarI0;
        int i35;
        h4.r rVar4;
        j.e eVar4;
        int i36;
        j.l lVar4;
        h4.d.c cVar3;
        int i37;
        int i38;
        p3.o0 o0VarE = mVar.E(-1303174015);
        int i39 = i17 & 1;
        if (i39 != 0) {
            i18 = i16 | 6;
            rVar2 = rVar;
        } else if ((i16 & 6) == 0) {
            rVar2 = rVar;
            i18 = (o0VarE.B(rVar2) ? 4 : 2) | i16;
        } else {
            rVar2 = rVar;
            i18 = i16;
        }
        int i44 = i17 & 2;
        if (i44 == 0) {
            if ((i16 & 48) == 0) {
                eVar2 = eVar;
                i18 |= o0VarE.B(eVar2) ? 32 : 16;
            }
            i19 = i17 & 4;
            if (i19 != 0) {
                if ((i16 & 384) == 0) {
                    lVar2 = lVar;
                    if (o0VarE.B(lVar2)) {
                        i24 = 256;
                    } else {
                        i24 = 128;
                    }
                    i18 |= i24;
                }
                i25 = i17 & 8;
                if (i25 != 0) {
                    if ((i16 & 3072) == 0) {
                        if (o0VarE.B(cVar)) {
                            i26 = 2048;
                        } else {
                            i26 = 1024;
                        }
                        i18 |= i26;
                    }
                    i27 = i17 & 16;
                    if (i27 != 0) {
                        if ((i16 & 24576) == 0) {
                            if (o0VarE.k(i14)) {
                                i28 = 16384;
                            } else {
                                i28 = 8192;
                            }
                            i18 |= i28;
                        }
                        i29 = i18 | 196608;
                        if ((i16 & 1572864) == 0) {
                            if (o0VarE.r(qVar)) {
                                i38 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                            } else {
                                i38 = 524288;
                            }
                            i29 |= i38;
                        }
                        if ((599187 & i29) != 599186) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (o0VarE.n(i29 & 1, z14)) {
                            if (i39 != 0) {
                                rVar4 = h4.r.S;
                                i35 = i25;
                            } else {
                                i35 = i25;
                                rVar4 = rVar2;
                            }
                            if (i44 != 0) {
                                j.f22691a.getClass();
                                eVar4 = j.f22692b;
                            } else {
                                eVar4 = eVar2;
                            }
                            if (i19 != 0) {
                                j.f22691a.getClass();
                                lVar4 = j.f22694d;
                                i36 = i27;
                            } else {
                                i36 = i27;
                                lVar4 = lVar2;
                            }
                            if (i35 != 0) {
                                h4.d.f81522a.getClass();
                                cVar3 = h4.d.a.f81533k;
                            } else {
                                cVar3 = cVar;
                            }
                            if (i36 != 0) {
                                i37 = Integer.MAX_VALUE;
                            } else {
                                i37 = i14;
                            }
                            p3.x1 x1Var = p3.n.f135158a;
                            b1.f22602f.getClass();
                            o0Var = o0VarE;
                            b(rVar4, eVar4, lVar4, cVar3, i37, b1.f22603g, qVar, o0Var, (i29 & 14) | 1572864 | (i29 & 112) | (i29 & 896) | (i29 & 7168) | (57344 & i29) | (458752 & i29) | ((i29 << 3) & 29360128));
                            i30 = Integer.MAX_VALUE;
                            rVar3 = rVar4;
                            eVar3 = eVar4;
                            lVar3 = lVar4;
                            cVar2 = cVar3;
                            i34 = i37;
                        } else {
                            o0Var = o0VarE;
                            o0Var.e();
                            cVar2 = cVar;
                            i30 = i15;
                            rVar3 = rVar2;
                            eVar3 = eVar2;
                            lVar3 = lVar2;
                            i34 = i14;
                        }
                        p2VarI0 = o0Var.i0();
                        if (p2VarI0 != null) {
                            p2VarI0.f135219d = new q0(rVar3, eVar3, lVar3, cVar2, i34, i30, qVar, i16, i17);
                        }
                    }
                    i18 |= 24576;
                    i29 = i18 | 196608;
                    if ((i16 & 1572864) == 0) {
                        if (o0VarE.r(qVar)) {
                            i38 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                        } else {
                            i38 = 524288;
                        }
                        i29 |= i38;
                    }
                    if ((599187 & i29) != 599186) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (o0VarE.n(i29 & 1, z14)) {
                        if (i39 != 0) {
                            rVar4 = h4.r.S;
                            i35 = i25;
                        } else {
                            i35 = i25;
                            rVar4 = rVar2;
                        }
                        if (i44 != 0) {
                            j.f22691a.getClass();
                            eVar4 = j.f22692b;
                        } else {
                            eVar4 = eVar2;
                        }
                        if (i19 != 0) {
                            j.f22691a.getClass();
                            lVar4 = j.f22694d;
                            i36 = i27;
                        } else {
                            i36 = i27;
                            lVar4 = lVar2;
                        }
                        if (i35 != 0) {
                            h4.d.f81522a.getClass();
                            cVar3 = h4.d.a.f81533k;
                        } else {
                            cVar3 = cVar;
                        }
                        if (i36 != 0) {
                            i37 = Integer.MAX_VALUE;
                        } else {
                            i37 = i14;
                        }
                        p3.x1 x1Var2 = p3.n.f135158a;
                        b1.f22602f.getClass();
                        o0Var = o0VarE;
                        b(rVar4, eVar4, lVar4, cVar3, i37, b1.f22603g, qVar, o0Var, (i29 & 14) | 1572864 | (i29 & 112) | (i29 & 896) | (i29 & 7168) | (57344 & i29) | (458752 & i29) | ((i29 << 3) & 29360128));
                        i30 = Integer.MAX_VALUE;
                        rVar3 = rVar4;
                        eVar3 = eVar4;
                        lVar3 = lVar4;
                        cVar2 = cVar3;
                        i34 = i37;
                    } else {
                        o0Var = o0VarE;
                        o0Var.e();
                        cVar2 = cVar;
                        i30 = i15;
                        rVar3 = rVar2;
                        eVar3 = eVar2;
                        lVar3 = lVar2;
                        i34 = i14;
                    }
                    p2VarI0 = o0Var.i0();
                    if (p2VarI0 != null) {
                        p2VarI0.f135219d = new q0(rVar3, eVar3, lVar3, cVar2, i34, i30, qVar, i16, i17);
                    }
                }
                i18 |= 3072;
                i27 = i17 & 16;
                if (i27 != 0) {
                    if ((i16 & 24576) == 0) {
                        if (o0VarE.k(i14)) {
                            i28 = 16384;
                        } else {
                            i28 = 8192;
                        }
                        i18 |= i28;
                    }
                    i29 = i18 | 196608;
                    if ((i16 & 1572864) == 0) {
                        if (o0VarE.r(qVar)) {
                            i38 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                        } else {
                            i38 = 524288;
                        }
                        i29 |= i38;
                    }
                    if ((599187 & i29) != 599186) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (o0VarE.n(i29 & 1, z14)) {
                        if (i39 != 0) {
                            rVar4 = h4.r.S;
                            i35 = i25;
                        } else {
                            i35 = i25;
                            rVar4 = rVar2;
                        }
                        if (i44 != 0) {
                            j.f22691a.getClass();
                            eVar4 = j.f22692b;
                        } else {
                            eVar4 = eVar2;
                        }
                        if (i19 != 0) {
                            j.f22691a.getClass();
                            lVar4 = j.f22694d;
                            i36 = i27;
                        } else {
                            i36 = i27;
                            lVar4 = lVar2;
                        }
                        if (i35 != 0) {
                            h4.d.f81522a.getClass();
                            cVar3 = h4.d.a.f81533k;
                        } else {
                            cVar3 = cVar;
                        }
                        if (i36 != 0) {
                            i37 = Integer.MAX_VALUE;
                        } else {
                            i37 = i14;
                        }
                        p3.x1 x1Var3 = p3.n.f135158a;
                        b1.f22602f.getClass();
                        o0Var = o0VarE;
                        b(rVar4, eVar4, lVar4, cVar3, i37, b1.f22603g, qVar, o0Var, (i29 & 14) | 1572864 | (i29 & 112) | (i29 & 896) | (i29 & 7168) | (57344 & i29) | (458752 & i29) | ((i29 << 3) & 29360128));
                        i30 = Integer.MAX_VALUE;
                        rVar3 = rVar4;
                        eVar3 = eVar4;
                        lVar3 = lVar4;
                        cVar2 = cVar3;
                        i34 = i37;
                    } else {
                        o0Var = o0VarE;
                        o0Var.e();
                        cVar2 = cVar;
                        i30 = i15;
                        rVar3 = rVar2;
                        eVar3 = eVar2;
                        lVar3 = lVar2;
                        i34 = i14;
                    }
                    p2VarI0 = o0Var.i0();
                    if (p2VarI0 != null) {
                        p2VarI0.f135219d = new q0(rVar3, eVar3, lVar3, cVar2, i34, i30, qVar, i16, i17);
                    }
                }
                i18 |= 24576;
                i29 = i18 | 196608;
                if ((i16 & 1572864) == 0) {
                    if (o0VarE.r(qVar)) {
                        i38 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    } else {
                        i38 = 524288;
                    }
                    i29 |= i38;
                }
                if ((599187 & i29) != 599186) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (o0VarE.n(i29 & 1, z14)) {
                    if (i39 != 0) {
                        rVar4 = h4.r.S;
                        i35 = i25;
                    } else {
                        i35 = i25;
                        rVar4 = rVar2;
                    }
                    if (i44 != 0) {
                        j.f22691a.getClass();
                        eVar4 = j.f22692b;
                    } else {
                        eVar4 = eVar2;
                    }
                    if (i19 != 0) {
                        j.f22691a.getClass();
                        lVar4 = j.f22694d;
                        i36 = i27;
                    } else {
                        i36 = i27;
                        lVar4 = lVar2;
                    }
                    if (i35 != 0) {
                        h4.d.f81522a.getClass();
                        cVar3 = h4.d.a.f81533k;
                    } else {
                        cVar3 = cVar;
                    }
                    if (i36 != 0) {
                        i37 = Integer.MAX_VALUE;
                    } else {
                        i37 = i14;
                    }
                    p3.x1 x1Var4 = p3.n.f135158a;
                    b1.f22602f.getClass();
                    o0Var = o0VarE;
                    b(rVar4, eVar4, lVar4, cVar3, i37, b1.f22603g, qVar, o0Var, (i29 & 14) | 1572864 | (i29 & 112) | (i29 & 896) | (i29 & 7168) | (57344 & i29) | (458752 & i29) | ((i29 << 3) & 29360128));
                    i30 = Integer.MAX_VALUE;
                    rVar3 = rVar4;
                    eVar3 = eVar4;
                    lVar3 = lVar4;
                    cVar2 = cVar3;
                    i34 = i37;
                } else {
                    o0Var = o0VarE;
                    o0Var.e();
                    cVar2 = cVar;
                    i30 = i15;
                    rVar3 = rVar2;
                    eVar3 = eVar2;
                    lVar3 = lVar2;
                    i34 = i14;
                }
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new q0(rVar3, eVar3, lVar3, cVar2, i34, i30, qVar, i16, i17);
                }
            }
            i18 |= 384;
            lVar2 = lVar;
            i25 = i17 & 8;
            if (i25 != 0) {
                if ((i16 & 3072) == 0) {
                    if (o0VarE.B(cVar)) {
                        i26 = 2048;
                    } else {
                        i26 = 1024;
                    }
                    i18 |= i26;
                }
                i27 = i17 & 16;
                if (i27 != 0) {
                    if ((i16 & 24576) == 0) {
                        if (o0VarE.k(i14)) {
                            i28 = 16384;
                        } else {
                            i28 = 8192;
                        }
                        i18 |= i28;
                    }
                    i29 = i18 | 196608;
                    if ((i16 & 1572864) == 0) {
                        if (o0VarE.r(qVar)) {
                            i38 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                        } else {
                            i38 = 524288;
                        }
                        i29 |= i38;
                    }
                    if ((599187 & i29) != 599186) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (o0VarE.n(i29 & 1, z14)) {
                        if (i39 != 0) {
                            rVar4 = h4.r.S;
                            i35 = i25;
                        } else {
                            i35 = i25;
                            rVar4 = rVar2;
                        }
                        if (i44 != 0) {
                            j.f22691a.getClass();
                            eVar4 = j.f22692b;
                        } else {
                            eVar4 = eVar2;
                        }
                        if (i19 != 0) {
                            j.f22691a.getClass();
                            lVar4 = j.f22694d;
                            i36 = i27;
                        } else {
                            i36 = i27;
                            lVar4 = lVar2;
                        }
                        if (i35 != 0) {
                            h4.d.f81522a.getClass();
                            cVar3 = h4.d.a.f81533k;
                        } else {
                            cVar3 = cVar;
                        }
                        if (i36 != 0) {
                            i37 = Integer.MAX_VALUE;
                        } else {
                            i37 = i14;
                        }
                        p3.x1 x1Var5 = p3.n.f135158a;
                        b1.f22602f.getClass();
                        o0Var = o0VarE;
                        b(rVar4, eVar4, lVar4, cVar3, i37, b1.f22603g, qVar, o0Var, (i29 & 14) | 1572864 | (i29 & 112) | (i29 & 896) | (i29 & 7168) | (57344 & i29) | (458752 & i29) | ((i29 << 3) & 29360128));
                        i30 = Integer.MAX_VALUE;
                        rVar3 = rVar4;
                        eVar3 = eVar4;
                        lVar3 = lVar4;
                        cVar2 = cVar3;
                        i34 = i37;
                    } else {
                        o0Var = o0VarE;
                        o0Var.e();
                        cVar2 = cVar;
                        i30 = i15;
                        rVar3 = rVar2;
                        eVar3 = eVar2;
                        lVar3 = lVar2;
                        i34 = i14;
                    }
                    p2VarI0 = o0Var.i0();
                    if (p2VarI0 != null) {
                        p2VarI0.f135219d = new q0(rVar3, eVar3, lVar3, cVar2, i34, i30, qVar, i16, i17);
                    }
                }
                i18 |= 24576;
                i29 = i18 | 196608;
                if ((i16 & 1572864) == 0) {
                    if (o0VarE.r(qVar)) {
                        i38 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    } else {
                        i38 = 524288;
                    }
                    i29 |= i38;
                }
                if ((599187 & i29) != 599186) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (o0VarE.n(i29 & 1, z14)) {
                    if (i39 != 0) {
                        rVar4 = h4.r.S;
                        i35 = i25;
                    } else {
                        i35 = i25;
                        rVar4 = rVar2;
                    }
                    if (i44 != 0) {
                        j.f22691a.getClass();
                        eVar4 = j.f22692b;
                    } else {
                        eVar4 = eVar2;
                    }
                    if (i19 != 0) {
                        j.f22691a.getClass();
                        lVar4 = j.f22694d;
                        i36 = i27;
                    } else {
                        i36 = i27;
                        lVar4 = lVar2;
                    }
                    if (i35 != 0) {
                        h4.d.f81522a.getClass();
                        cVar3 = h4.d.a.f81533k;
                    } else {
                        cVar3 = cVar;
                    }
                    if (i36 != 0) {
                        i37 = Integer.MAX_VALUE;
                    } else {
                        i37 = i14;
                    }
                    p3.x1 x1Var6 = p3.n.f135158a;
                    b1.f22602f.getClass();
                    o0Var = o0VarE;
                    b(rVar4, eVar4, lVar4, cVar3, i37, b1.f22603g, qVar, o0Var, (i29 & 14) | 1572864 | (i29 & 112) | (i29 & 896) | (i29 & 7168) | (57344 & i29) | (458752 & i29) | ((i29 << 3) & 29360128));
                    i30 = Integer.MAX_VALUE;
                    rVar3 = rVar4;
                    eVar3 = eVar4;
                    lVar3 = lVar4;
                    cVar2 = cVar3;
                    i34 = i37;
                } else {
                    o0Var = o0VarE;
                    o0Var.e();
                    cVar2 = cVar;
                    i30 = i15;
                    rVar3 = rVar2;
                    eVar3 = eVar2;
                    lVar3 = lVar2;
                    i34 = i14;
                }
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new q0(rVar3, eVar3, lVar3, cVar2, i34, i30, qVar, i16, i17);
                }
            }
            i18 |= 3072;
            i27 = i17 & 16;
            if (i27 != 0) {
                if ((i16 & 24576) == 0) {
                    if (o0VarE.k(i14)) {
                        i28 = 16384;
                    } else {
                        i28 = 8192;
                    }
                    i18 |= i28;
                }
                i29 = i18 | 196608;
                if ((i16 & 1572864) == 0) {
                    if (o0VarE.r(qVar)) {
                        i38 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    } else {
                        i38 = 524288;
                    }
                    i29 |= i38;
                }
                if ((599187 & i29) != 599186) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (o0VarE.n(i29 & 1, z14)) {
                    if (i39 != 0) {
                        rVar4 = h4.r.S;
                        i35 = i25;
                    } else {
                        i35 = i25;
                        rVar4 = rVar2;
                    }
                    if (i44 != 0) {
                        j.f22691a.getClass();
                        eVar4 = j.f22692b;
                    } else {
                        eVar4 = eVar2;
                    }
                    if (i19 != 0) {
                        j.f22691a.getClass();
                        lVar4 = j.f22694d;
                        i36 = i27;
                    } else {
                        i36 = i27;
                        lVar4 = lVar2;
                    }
                    if (i35 != 0) {
                        h4.d.f81522a.getClass();
                        cVar3 = h4.d.a.f81533k;
                    } else {
                        cVar3 = cVar;
                    }
                    if (i36 != 0) {
                        i37 = Integer.MAX_VALUE;
                    } else {
                        i37 = i14;
                    }
                    p3.x1 x1Var7 = p3.n.f135158a;
                    b1.f22602f.getClass();
                    o0Var = o0VarE;
                    b(rVar4, eVar4, lVar4, cVar3, i37, b1.f22603g, qVar, o0Var, (i29 & 14) | 1572864 | (i29 & 112) | (i29 & 896) | (i29 & 7168) | (57344 & i29) | (458752 & i29) | ((i29 << 3) & 29360128));
                    i30 = Integer.MAX_VALUE;
                    rVar3 = rVar4;
                    eVar3 = eVar4;
                    lVar3 = lVar4;
                    cVar2 = cVar3;
                    i34 = i37;
                } else {
                    o0Var = o0VarE;
                    o0Var.e();
                    cVar2 = cVar;
                    i30 = i15;
                    rVar3 = rVar2;
                    eVar3 = eVar2;
                    lVar3 = lVar2;
                    i34 = i14;
                }
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new q0(rVar3, eVar3, lVar3, cVar2, i34, i30, qVar, i16, i17);
                }
            }
            i18 |= 24576;
            i29 = i18 | 196608;
            if ((i16 & 1572864) == 0) {
                if (o0VarE.r(qVar)) {
                    i38 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                } else {
                    i38 = 524288;
                }
                i29 |= i38;
            }
            if ((599187 & i29) != 599186) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i29 & 1, z14)) {
                if (i39 != 0) {
                    rVar4 = h4.r.S;
                    i35 = i25;
                } else {
                    i35 = i25;
                    rVar4 = rVar2;
                }
                if (i44 != 0) {
                    j.f22691a.getClass();
                    eVar4 = j.f22692b;
                } else {
                    eVar4 = eVar2;
                }
                if (i19 != 0) {
                    j.f22691a.getClass();
                    lVar4 = j.f22694d;
                    i36 = i27;
                } else {
                    i36 = i27;
                    lVar4 = lVar2;
                }
                if (i35 != 0) {
                    h4.d.f81522a.getClass();
                    cVar3 = h4.d.a.f81533k;
                } else {
                    cVar3 = cVar;
                }
                if (i36 != 0) {
                    i37 = Integer.MAX_VALUE;
                } else {
                    i37 = i14;
                }
                p3.x1 x1Var8 = p3.n.f135158a;
                b1.f22602f.getClass();
                o0Var = o0VarE;
                b(rVar4, eVar4, lVar4, cVar3, i37, b1.f22603g, qVar, o0Var, (i29 & 14) | 1572864 | (i29 & 112) | (i29 & 896) | (i29 & 7168) | (57344 & i29) | (458752 & i29) | ((i29 << 3) & 29360128));
                i30 = Integer.MAX_VALUE;
                rVar3 = rVar4;
                eVar3 = eVar4;
                lVar3 = lVar4;
                cVar2 = cVar3;
                i34 = i37;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                cVar2 = cVar;
                i30 = i15;
                rVar3 = rVar2;
                eVar3 = eVar2;
                lVar3 = lVar2;
                i34 = i14;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new q0(rVar3, eVar3, lVar3, cVar2, i34, i30, qVar, i16, i17);
            }
        }
        i18 |= 48;
        eVar2 = eVar;
        i19 = i17 & 4;
        if (i19 != 0) {
            if ((i16 & 384) == 0) {
                lVar2 = lVar;
                if (o0VarE.B(lVar2)) {
                    i24 = 256;
                } else {
                    i24 = 128;
                }
                i18 |= i24;
            }
            i25 = i17 & 8;
            if (i25 != 0) {
                if ((i16 & 3072) == 0) {
                    if (o0VarE.B(cVar)) {
                        i26 = 2048;
                    } else {
                        i26 = 1024;
                    }
                    i18 |= i26;
                }
                i27 = i17 & 16;
                if (i27 != 0) {
                    if ((i16 & 24576) == 0) {
                        if (o0VarE.k(i14)) {
                            i28 = 16384;
                        } else {
                            i28 = 8192;
                        }
                        i18 |= i28;
                    }
                    i29 = i18 | 196608;
                    if ((i16 & 1572864) == 0) {
                        if (o0VarE.r(qVar)) {
                            i38 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                        } else {
                            i38 = 524288;
                        }
                        i29 |= i38;
                    }
                    if ((599187 & i29) != 599186) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (o0VarE.n(i29 & 1, z14)) {
                        if (i39 != 0) {
                            rVar4 = h4.r.S;
                            i35 = i25;
                        } else {
                            i35 = i25;
                            rVar4 = rVar2;
                        }
                        if (i44 != 0) {
                            j.f22691a.getClass();
                            eVar4 = j.f22692b;
                        } else {
                            eVar4 = eVar2;
                        }
                        if (i19 != 0) {
                            j.f22691a.getClass();
                            lVar4 = j.f22694d;
                            i36 = i27;
                        } else {
                            i36 = i27;
                            lVar4 = lVar2;
                        }
                        if (i35 != 0) {
                            h4.d.f81522a.getClass();
                            cVar3 = h4.d.a.f81533k;
                        } else {
                            cVar3 = cVar;
                        }
                        if (i36 != 0) {
                            i37 = Integer.MAX_VALUE;
                        } else {
                            i37 = i14;
                        }
                        p3.x1 x1Var9 = p3.n.f135158a;
                        b1.f22602f.getClass();
                        o0Var = o0VarE;
                        b(rVar4, eVar4, lVar4, cVar3, i37, b1.f22603g, qVar, o0Var, (i29 & 14) | 1572864 | (i29 & 112) | (i29 & 896) | (i29 & 7168) | (57344 & i29) | (458752 & i29) | ((i29 << 3) & 29360128));
                        i30 = Integer.MAX_VALUE;
                        rVar3 = rVar4;
                        eVar3 = eVar4;
                        lVar3 = lVar4;
                        cVar2 = cVar3;
                        i34 = i37;
                    } else {
                        o0Var = o0VarE;
                        o0Var.e();
                        cVar2 = cVar;
                        i30 = i15;
                        rVar3 = rVar2;
                        eVar3 = eVar2;
                        lVar3 = lVar2;
                        i34 = i14;
                    }
                    p2VarI0 = o0Var.i0();
                    if (p2VarI0 != null) {
                        p2VarI0.f135219d = new q0(rVar3, eVar3, lVar3, cVar2, i34, i30, qVar, i16, i17);
                    }
                }
                i18 |= 24576;
                i29 = i18 | 196608;
                if ((i16 & 1572864) == 0) {
                    if (o0VarE.r(qVar)) {
                        i38 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    } else {
                        i38 = 524288;
                    }
                    i29 |= i38;
                }
                if ((599187 & i29) != 599186) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (o0VarE.n(i29 & 1, z14)) {
                    if (i39 != 0) {
                        rVar4 = h4.r.S;
                        i35 = i25;
                    } else {
                        i35 = i25;
                        rVar4 = rVar2;
                    }
                    if (i44 != 0) {
                        j.f22691a.getClass();
                        eVar4 = j.f22692b;
                    } else {
                        eVar4 = eVar2;
                    }
                    if (i19 != 0) {
                        j.f22691a.getClass();
                        lVar4 = j.f22694d;
                        i36 = i27;
                    } else {
                        i36 = i27;
                        lVar4 = lVar2;
                    }
                    if (i35 != 0) {
                        h4.d.f81522a.getClass();
                        cVar3 = h4.d.a.f81533k;
                    } else {
                        cVar3 = cVar;
                    }
                    if (i36 != 0) {
                        i37 = Integer.MAX_VALUE;
                    } else {
                        i37 = i14;
                    }
                    p3.x1 x1Var10 = p3.n.f135158a;
                    b1.f22602f.getClass();
                    o0Var = o0VarE;
                    b(rVar4, eVar4, lVar4, cVar3, i37, b1.f22603g, qVar, o0Var, (i29 & 14) | 1572864 | (i29 & 112) | (i29 & 896) | (i29 & 7168) | (57344 & i29) | (458752 & i29) | ((i29 << 3) & 29360128));
                    i30 = Integer.MAX_VALUE;
                    rVar3 = rVar4;
                    eVar3 = eVar4;
                    lVar3 = lVar4;
                    cVar2 = cVar3;
                    i34 = i37;
                } else {
                    o0Var = o0VarE;
                    o0Var.e();
                    cVar2 = cVar;
                    i30 = i15;
                    rVar3 = rVar2;
                    eVar3 = eVar2;
                    lVar3 = lVar2;
                    i34 = i14;
                }
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new q0(rVar3, eVar3, lVar3, cVar2, i34, i30, qVar, i16, i17);
                }
            }
            i18 |= 3072;
            i27 = i17 & 16;
            if (i27 != 0) {
                if ((i16 & 24576) == 0) {
                    if (o0VarE.k(i14)) {
                        i28 = 16384;
                    } else {
                        i28 = 8192;
                    }
                    i18 |= i28;
                }
                i29 = i18 | 196608;
                if ((i16 & 1572864) == 0) {
                    if (o0VarE.r(qVar)) {
                        i38 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    } else {
                        i38 = 524288;
                    }
                    i29 |= i38;
                }
                if ((599187 & i29) != 599186) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (o0VarE.n(i29 & 1, z14)) {
                    if (i39 != 0) {
                        rVar4 = h4.r.S;
                        i35 = i25;
                    } else {
                        i35 = i25;
                        rVar4 = rVar2;
                    }
                    if (i44 != 0) {
                        j.f22691a.getClass();
                        eVar4 = j.f22692b;
                    } else {
                        eVar4 = eVar2;
                    }
                    if (i19 != 0) {
                        j.f22691a.getClass();
                        lVar4 = j.f22694d;
                        i36 = i27;
                    } else {
                        i36 = i27;
                        lVar4 = lVar2;
                    }
                    if (i35 != 0) {
                        h4.d.f81522a.getClass();
                        cVar3 = h4.d.a.f81533k;
                    } else {
                        cVar3 = cVar;
                    }
                    if (i36 != 0) {
                        i37 = Integer.MAX_VALUE;
                    } else {
                        i37 = i14;
                    }
                    p3.x1 x1Var11 = p3.n.f135158a;
                    b1.f22602f.getClass();
                    o0Var = o0VarE;
                    b(rVar4, eVar4, lVar4, cVar3, i37, b1.f22603g, qVar, o0Var, (i29 & 14) | 1572864 | (i29 & 112) | (i29 & 896) | (i29 & 7168) | (57344 & i29) | (458752 & i29) | ((i29 << 3) & 29360128));
                    i30 = Integer.MAX_VALUE;
                    rVar3 = rVar4;
                    eVar3 = eVar4;
                    lVar3 = lVar4;
                    cVar2 = cVar3;
                    i34 = i37;
                } else {
                    o0Var = o0VarE;
                    o0Var.e();
                    cVar2 = cVar;
                    i30 = i15;
                    rVar3 = rVar2;
                    eVar3 = eVar2;
                    lVar3 = lVar2;
                    i34 = i14;
                }
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new q0(rVar3, eVar3, lVar3, cVar2, i34, i30, qVar, i16, i17);
                }
            }
            i18 |= 24576;
            i29 = i18 | 196608;
            if ((i16 & 1572864) == 0) {
                if (o0VarE.r(qVar)) {
                    i38 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                } else {
                    i38 = 524288;
                }
                i29 |= i38;
            }
            if ((599187 & i29) != 599186) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i29 & 1, z14)) {
                if (i39 != 0) {
                    rVar4 = h4.r.S;
                    i35 = i25;
                } else {
                    i35 = i25;
                    rVar4 = rVar2;
                }
                if (i44 != 0) {
                    j.f22691a.getClass();
                    eVar4 = j.f22692b;
                } else {
                    eVar4 = eVar2;
                }
                if (i19 != 0) {
                    j.f22691a.getClass();
                    lVar4 = j.f22694d;
                    i36 = i27;
                } else {
                    i36 = i27;
                    lVar4 = lVar2;
                }
                if (i35 != 0) {
                    h4.d.f81522a.getClass();
                    cVar3 = h4.d.a.f81533k;
                } else {
                    cVar3 = cVar;
                }
                if (i36 != 0) {
                    i37 = Integer.MAX_VALUE;
                } else {
                    i37 = i14;
                }
                p3.x1 x1Var12 = p3.n.f135158a;
                b1.f22602f.getClass();
                o0Var = o0VarE;
                b(rVar4, eVar4, lVar4, cVar3, i37, b1.f22603g, qVar, o0Var, (i29 & 14) | 1572864 | (i29 & 112) | (i29 & 896) | (i29 & 7168) | (57344 & i29) | (458752 & i29) | ((i29 << 3) & 29360128));
                i30 = Integer.MAX_VALUE;
                rVar3 = rVar4;
                eVar3 = eVar4;
                lVar3 = lVar4;
                cVar2 = cVar3;
                i34 = i37;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                cVar2 = cVar;
                i30 = i15;
                rVar3 = rVar2;
                eVar3 = eVar2;
                lVar3 = lVar2;
                i34 = i14;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new q0(rVar3, eVar3, lVar3, cVar2, i34, i30, qVar, i16, i17);
            }
        }
        i18 |= 384;
        lVar2 = lVar;
        i25 = i17 & 8;
        if (i25 != 0) {
            if ((i16 & 3072) == 0) {
                if (o0VarE.B(cVar)) {
                    i26 = 2048;
                } else {
                    i26 = 1024;
                }
                i18 |= i26;
            }
            i27 = i17 & 16;
            if (i27 != 0) {
                if ((i16 & 24576) == 0) {
                    if (o0VarE.k(i14)) {
                        i28 = 16384;
                    } else {
                        i28 = 8192;
                    }
                    i18 |= i28;
                }
                i29 = i18 | 196608;
                if ((i16 & 1572864) == 0) {
                    if (o0VarE.r(qVar)) {
                        i38 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    } else {
                        i38 = 524288;
                    }
                    i29 |= i38;
                }
                if ((599187 & i29) != 599186) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (o0VarE.n(i29 & 1, z14)) {
                    if (i39 != 0) {
                        rVar4 = h4.r.S;
                        i35 = i25;
                    } else {
                        i35 = i25;
                        rVar4 = rVar2;
                    }
                    if (i44 != 0) {
                        j.f22691a.getClass();
                        eVar4 = j.f22692b;
                    } else {
                        eVar4 = eVar2;
                    }
                    if (i19 != 0) {
                        j.f22691a.getClass();
                        lVar4 = j.f22694d;
                        i36 = i27;
                    } else {
                        i36 = i27;
                        lVar4 = lVar2;
                    }
                    if (i35 != 0) {
                        h4.d.f81522a.getClass();
                        cVar3 = h4.d.a.f81533k;
                    } else {
                        cVar3 = cVar;
                    }
                    if (i36 != 0) {
                        i37 = Integer.MAX_VALUE;
                    } else {
                        i37 = i14;
                    }
                    p3.x1 x1Var13 = p3.n.f135158a;
                    b1.f22602f.getClass();
                    o0Var = o0VarE;
                    b(rVar4, eVar4, lVar4, cVar3, i37, b1.f22603g, qVar, o0Var, (i29 & 14) | 1572864 | (i29 & 112) | (i29 & 896) | (i29 & 7168) | (57344 & i29) | (458752 & i29) | ((i29 << 3) & 29360128));
                    i30 = Integer.MAX_VALUE;
                    rVar3 = rVar4;
                    eVar3 = eVar4;
                    lVar3 = lVar4;
                    cVar2 = cVar3;
                    i34 = i37;
                } else {
                    o0Var = o0VarE;
                    o0Var.e();
                    cVar2 = cVar;
                    i30 = i15;
                    rVar3 = rVar2;
                    eVar3 = eVar2;
                    lVar3 = lVar2;
                    i34 = i14;
                }
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new q0(rVar3, eVar3, lVar3, cVar2, i34, i30, qVar, i16, i17);
                }
            }
            i18 |= 24576;
            i29 = i18 | 196608;
            if ((i16 & 1572864) == 0) {
                if (o0VarE.r(qVar)) {
                    i38 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                } else {
                    i38 = 524288;
                }
                i29 |= i38;
            }
            if ((599187 & i29) != 599186) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i29 & 1, z14)) {
                if (i39 != 0) {
                    rVar4 = h4.r.S;
                    i35 = i25;
                } else {
                    i35 = i25;
                    rVar4 = rVar2;
                }
                if (i44 != 0) {
                    j.f22691a.getClass();
                    eVar4 = j.f22692b;
                } else {
                    eVar4 = eVar2;
                }
                if (i19 != 0) {
                    j.f22691a.getClass();
                    lVar4 = j.f22694d;
                    i36 = i27;
                } else {
                    i36 = i27;
                    lVar4 = lVar2;
                }
                if (i35 != 0) {
                    h4.d.f81522a.getClass();
                    cVar3 = h4.d.a.f81533k;
                } else {
                    cVar3 = cVar;
                }
                if (i36 != 0) {
                    i37 = Integer.MAX_VALUE;
                } else {
                    i37 = i14;
                }
                p3.x1 x1Var14 = p3.n.f135158a;
                b1.f22602f.getClass();
                o0Var = o0VarE;
                b(rVar4, eVar4, lVar4, cVar3, i37, b1.f22603g, qVar, o0Var, (i29 & 14) | 1572864 | (i29 & 112) | (i29 & 896) | (i29 & 7168) | (57344 & i29) | (458752 & i29) | ((i29 << 3) & 29360128));
                i30 = Integer.MAX_VALUE;
                rVar3 = rVar4;
                eVar3 = eVar4;
                lVar3 = lVar4;
                cVar2 = cVar3;
                i34 = i37;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                cVar2 = cVar;
                i30 = i15;
                rVar3 = rVar2;
                eVar3 = eVar2;
                lVar3 = lVar2;
                i34 = i14;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new q0(rVar3, eVar3, lVar3, cVar2, i34, i30, qVar, i16, i17);
            }
        }
        i18 |= 3072;
        i27 = i17 & 16;
        if (i27 != 0) {
            if ((i16 & 24576) == 0) {
                if (o0VarE.k(i14)) {
                    i28 = 16384;
                } else {
                    i28 = 8192;
                }
                i18 |= i28;
            }
            i29 = i18 | 196608;
            if ((i16 & 1572864) == 0) {
                if (o0VarE.r(qVar)) {
                    i38 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                } else {
                    i38 = 524288;
                }
                i29 |= i38;
            }
            if ((599187 & i29) != 599186) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i29 & 1, z14)) {
                if (i39 != 0) {
                    rVar4 = h4.r.S;
                    i35 = i25;
                } else {
                    i35 = i25;
                    rVar4 = rVar2;
                }
                if (i44 != 0) {
                    j.f22691a.getClass();
                    eVar4 = j.f22692b;
                } else {
                    eVar4 = eVar2;
                }
                if (i19 != 0) {
                    j.f22691a.getClass();
                    lVar4 = j.f22694d;
                    i36 = i27;
                } else {
                    i36 = i27;
                    lVar4 = lVar2;
                }
                if (i35 != 0) {
                    h4.d.f81522a.getClass();
                    cVar3 = h4.d.a.f81533k;
                } else {
                    cVar3 = cVar;
                }
                if (i36 != 0) {
                    i37 = Integer.MAX_VALUE;
                } else {
                    i37 = i14;
                }
                p3.x1 x1Var15 = p3.n.f135158a;
                b1.f22602f.getClass();
                o0Var = o0VarE;
                b(rVar4, eVar4, lVar4, cVar3, i37, b1.f22603g, qVar, o0Var, (i29 & 14) | 1572864 | (i29 & 112) | (i29 & 896) | (i29 & 7168) | (57344 & i29) | (458752 & i29) | ((i29 << 3) & 29360128));
                i30 = Integer.MAX_VALUE;
                rVar3 = rVar4;
                eVar3 = eVar4;
                lVar3 = lVar4;
                cVar2 = cVar3;
                i34 = i37;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                cVar2 = cVar;
                i30 = i15;
                rVar3 = rVar2;
                eVar3 = eVar2;
                lVar3 = lVar2;
                i34 = i14;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new q0(rVar3, eVar3, lVar3, cVar2, i34, i30, qVar, i16, i17);
            }
        }
        i18 |= 24576;
        i29 = i18 | 196608;
        if ((i16 & 1572864) == 0) {
            if (o0VarE.r(qVar)) {
                i38 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
            } else {
                i38 = 524288;
            }
            i29 |= i38;
        }
        if ((599187 & i29) != 599186) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (o0VarE.n(i29 & 1, z14)) {
            if (i39 != 0) {
                rVar4 = h4.r.S;
                i35 = i25;
            } else {
                i35 = i25;
                rVar4 = rVar2;
            }
            if (i44 != 0) {
                j.f22691a.getClass();
                eVar4 = j.f22692b;
            } else {
                eVar4 = eVar2;
            }
            if (i19 != 0) {
                j.f22691a.getClass();
                lVar4 = j.f22694d;
                i36 = i27;
            } else {
                i36 = i27;
                lVar4 = lVar2;
            }
            if (i35 != 0) {
                h4.d.f81522a.getClass();
                cVar3 = h4.d.a.f81533k;
            } else {
                cVar3 = cVar;
            }
            if (i36 != 0) {
                i37 = Integer.MAX_VALUE;
            } else {
                i37 = i14;
            }
            p3.x1 x1Var16 = p3.n.f135158a;
            b1.f22602f.getClass();
            o0Var = o0VarE;
            b(rVar4, eVar4, lVar4, cVar3, i37, b1.f22603g, qVar, o0Var, (i29 & 14) | 1572864 | (i29 & 112) | (i29 & 896) | (i29 & 7168) | (57344 & i29) | (458752 & i29) | ((i29 << 3) & 29360128));
            i30 = Integer.MAX_VALUE;
            rVar3 = rVar4;
            eVar3 = eVar4;
            lVar3 = lVar4;
            cVar2 = cVar3;
            i34 = i37;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            cVar2 = cVar;
            i30 = i15;
            rVar3 = rVar2;
            eVar3 = eVar2;
            lVar3 = lVar2;
            i34 = i14;
        }
        p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new q0(rVar3, eVar3, lVar3, cVar2, i34, i30, qVar, i16, i17);
        }
    }

    /* JADX WARN: Code duplicated, block: B:120:0x016d  */
    /* JADX WARN: Code duplicated, block: B:139:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:141:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:142:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:145:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:146:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:149:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:152:0x0200 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:153:0x0202  */
    /* JADX WARN: Code duplicated, block: B:155:0x0207  */
    /* JADX WARN: Code duplicated, block: B:156:0x020b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:157:0x020d  */
    /* JADX WARN: Code duplicated, block: B:163:0x022a  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d2  */
    @o13.e
    public static final void b(h4.r rVar, j.e eVar, j.l lVar, h4.d.c cVar, int i14, b1 b1Var, e23.q qVar, p3.m mVar, int i15) {
        int i16;
        h4.r rVar2;
        p3.o0 o0Var;
        int i17;
        p3.o0 o0Var2;
        ArrayList arrayList;
        boolean z14;
        e23.l<w0, e23.p<p3.m, Integer, Unit>> lVar2;
        e23.p<p3.m, Integer, Unit> pVarInvoke;
        e23.l<w0, e23.p<p3.m, Integer, Unit>> lVar3;
        e23.p<p3.m, Integer, Unit> pVarInvoke2;
        int i18;
        Object obj;
        p3.o0 o0VarE = mVar.E(-1956591841);
        if ((i15 & 6) == 0) {
            i16 = (o0VarE.B(rVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= o0VarE.B(eVar) ? 32 : 16;
        }
        if ((i15 & 384) == 0) {
            i16 |= o0VarE.B(lVar) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i16 |= o0VarE.B(cVar) ? 2048 : 1024;
        }
        if ((i15 & 24576) == 0) {
            i16 |= o0VarE.k(i14) ? 16384 : 8192;
        }
        if ((196608 & i15) == 0) {
            i16 |= o0VarE.k(Integer.MAX_VALUE) ? 131072 : 65536;
        }
        if ((1572864 & i15) == 0) {
            i16 |= o0VarE.B(b1Var) ? 1048576 : 524288;
        }
        if ((12582912 & i15) == 0) {
            i16 |= o0VarE.r(qVar) ? 8388608 : 4194304;
        }
        int i19 = i16;
        if (o0VarE.n(i19 & 1, (i19 & 4793491) != 4793490)) {
            p3.x1 x1Var = p3.n.f135158a;
            int i24 = i19 & 3670016;
            boolean z15 = i24 == 1048576;
            Object objQ = o0VarE.q();
            p3.m.a aVar = p3.m.f135153a;
            if (z15) {
                objQ = new w0(b1Var.f22886a, b1Var.f22887b, b1Var.f22888c);
                o0VarE.K(objQ);
            } else {
                aVar.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new w0(b1Var.f22886a, b1Var.f22887b, b1Var.f22888c);
                    o0VarE.K(objQ);
                }
            }
            w0 w0Var = (w0) objQ;
            int i25 = i19 >> 3;
            int i26 = Integer.MAX_VALUE;
            boolean zB = ((((57344 & i25) ^ 24576) > 16384 && o0VarE.k(Integer.MAX_VALUE)) || (i25 & 24576) == 16384) | ((((i25 & 14) ^ 6) > 4 && o0VarE.B(eVar)) || (i25 & 6) == 4) | ((((i25 & 112) ^ 48) > 32 && o0VarE.B(lVar)) || (i25 & 48) == 32) | ((((i25 & 896) ^ 384) > 256 && o0VarE.B(cVar)) || (i25 & 384) == 256) | ((((i25 & 7168) ^ 3072) > 2048 && o0VarE.k(i14)) || (i25 & 3072) == 2048) | o0VarE.B(w0Var);
            Object objQ2 = o0VarE.q();
            if (zB) {
                float f22711d = eVar.getF22711d();
                f0.f22642a.getClass();
                p3.o0 o0Var3 = o0VarE;
                i17 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                a1 a1Var = new a1(true, eVar, lVar, f22711d, new f0.d(cVar), lVar.getF22711d(), i14, i26, w0Var, null);
                o0Var3.K(a1Var);
                objQ2 = a1Var;
                o0Var2 = o0Var3;
            } else {
                aVar.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    float f22711d2 = eVar.getF22711d();
                    f0.f22642a.getClass();
                    p3.o0 o0Var4 = o0VarE;
                    i17 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    a1 a1Var2 = new a1(true, eVar, lVar, f22711d2, new f0.d(cVar), lVar.getF22711d(), i14, i26, w0Var, null);
                    o0Var4.K(a1Var2);
                    objQ2 = a1Var2;
                    o0Var2 = o0Var4;
                } else {
                    o0Var2 = o0VarE;
                    i17 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                }
            }
            a1 a1Var3 = (a1) objQ2;
            boolean z16 = ((i19 & 29360128) == 8388608) | (i24 == i17) | ((i19 & 458752) == 131072);
            Object objQ3 = o0Var2.q();
            if (z16) {
                arrayList = new ArrayList();
                z14 = true;
                arrayList.add(new z3.e(-1192950673, true, new r0(qVar)));
                lVar2 = b1Var.f22889d;
                if (lVar2 != null) {
                    pVarInvoke = lVar2.invoke(w0Var);
                } else {
                    pVarInvoke = null;
                }
                lVar3 = b1Var.f22890e;
                if (lVar3 != null) {
                    pVarInvoke2 = lVar3.invoke(w0Var);
                } else {
                    pVarInvoke2 = null;
                }
                i18 = u0.b.f22896a[b1Var.f22886a.ordinal()];
                if (i18 != 1) {
                    if (i18 == 2) {
                        if (pVarInvoke != null) {
                            arrayList.add(pVarInvoke);
                        }
                        if (pVarInvoke2 != null) {
                            arrayList.add(pVarInvoke2);
                        }
                    }
                } else if (pVarInvoke != null) {
                    arrayList.add(pVarInvoke);
                }
                o0Var2.K(arrayList);
                obj = arrayList;
            } else {
                aVar.getClass();
                if (objQ3 == p3.m.a.f135155b) {
                    arrayList = new ArrayList();
                    z14 = true;
                    arrayList.add(new z3.e(-1192950673, true, new r0(qVar)));
                    lVar2 = b1Var.f22889d;
                    if (lVar2 != null) {
                        pVarInvoke = lVar2.invoke(w0Var);
                    } else {
                        pVarInvoke = null;
                    }
                    lVar3 = b1Var.f22890e;
                    if (lVar3 != null) {
                        pVarInvoke2 = lVar3.invoke(w0Var);
                    } else {
                        pVarInvoke2 = null;
                    }
                    i18 = u0.b.f22896a[b1Var.f22886a.ordinal()];
                    if (i18 != 1) {
                        if (i18 == 2) {
                            if (pVarInvoke != null) {
                                arrayList.add(pVarInvoke);
                            }
                            if (pVarInvoke2 != null) {
                                arrayList.add(pVarInvoke2);
                            }
                        }
                    } else if (pVarInvoke != null) {
                        arrayList.add(pVarInvoke);
                    }
                    o0Var2.K(arrayList);
                    obj = arrayList;
                } else {
                    z14 = true;
                    obj = objQ3;
                }
            }
            z3.e eVarB = f5.k0.b((List) obj);
            boolean zB2 = o0Var2.B(a1Var3);
            Object objQ4 = o0Var2.q();
            if (zB2) {
                objQ4 = new f5.f1(a1Var3);
                o0Var2.K(objQ4);
            } else {
                aVar.getClass();
                if (objQ4 == p3.m.a.f135155b) {
                    objQ4 = new f5.f1(a1Var3);
                    o0Var2.K(objQ4);
                }
            }
            f5.z0 z0Var = (f5.z0) objQ4;
            int iHashCode = Long.hashCode(o0Var2.U);
            p3.i2 i2VarA0 = o0Var2.a0();
            rVar2 = rVar;
            h4.r rVarC = h4.k.c(rVar2, o0Var2);
            h5.g.V.getClass();
            h5.e0.a aVar2 = h5.g.a.f81805b;
            if (o0Var2.f135177b == null) {
                p3.p0.l();
                throw null;
            }
            o0Var2.z();
            if (o0Var2.T) {
                o0Var2.M(aVar2);
            } else {
                o0Var2.c();
            }
            b4.c(h5.g.a.f81810g, z0Var, o0Var2);
            b4.c(h5.g.a.f81809f, i2VarA0, o0Var2);
            b4.a(o0Var2, Integer.valueOf(iHashCode), h5.g.a.f81813j);
            b4.b(h5.g.a.f81814k, o0Var2);
            b4.c(h5.g.a.f81807d, rVarC, o0Var2);
            b71.i.n(0, eVarB, o0Var2, z14);
            o0Var = o0Var2;
        } else {
            rVar2 = rVar;
            p3.o0 o0Var5 = o0VarE;
            o0Var5.e();
            o0Var = o0Var5;
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new b82.u0(rVar2, eVar, lVar, cVar, i14, b1Var, qVar, i15);
        }
    }

    public static final long c(f5.y0 y0Var, a1 a1Var, long j8, e23.l lVar) {
        p0 p0Var;
        boolean z14 = a1Var.f22580a;
        if (l.n(l.m(y0Var)) == 0.0f) {
            p2 p2VarM = l.m(y0Var);
            if (((p2VarM == null || (p0Var = p2VarM.f22814d) == null) ? null : Float.valueOf(p0Var.f22809a)) == null) {
                f5.v1 v1VarQ = y0Var.Q(j8);
                lVar.invoke(v1VarQ);
                return p1.k.b(a1Var.b(v1VarQ), a1Var.a(v1VarQ));
            }
        }
        int iO = z14 ? y0Var.O(Integer.MAX_VALUE) : y0Var.e0(Integer.MAX_VALUE);
        return p1.k.b(iO, z14 ? y0Var.e0(iO) : y0Var.O(iO));
    }
}
