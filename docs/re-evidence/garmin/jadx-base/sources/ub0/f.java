package ub0;

import android.graphics.Bitmap;
import c2.x2;
import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.RenderMode;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import p005kotlin.Unit;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f169723a;

    static {
        g6.f.a aVar = g6.f.f75994b;
        f169723a = 270;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0151  */
    /* JADX WARN: Code duplicated, block: B:103:0x0159  */
    /* JADX WARN: Code duplicated, block: B:105:0x0160  */
    /* JADX WARN: Code duplicated, block: B:107:0x0179  */
    /* JADX WARN: Code duplicated, block: B:110:0x0188  */
    /* JADX WARN: Code duplicated, block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0062  */
    /* JADX WARN: Code duplicated, block: B:31:0x0065  */
    /* JADX WARN: Code duplicated, block: B:33:0x0069 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x006b  */
    /* JADX WARN: Code duplicated, block: B:35:0x006d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0077  */
    /* JADX WARN: Code duplicated, block: B:39:0x0079  */
    /* JADX WARN: Code duplicated, block: B:43:0x0080  */
    /* JADX WARN: Code duplicated, block: B:45:0x0086  */
    /* JADX WARN: Code duplicated, block: B:46:0x0089  */
    /* JADX WARN: Code duplicated, block: B:50:0x0093  */
    /* JADX WARN: Code duplicated, block: B:52:0x009b  */
    /* JADX WARN: Code duplicated, block: B:53:0x009d  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:69:0x00cf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:74:0x00db  */
    /* JADX WARN: Code duplicated, block: B:77:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:78:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:81:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:82:0x0101  */
    /* JADX WARN: Code duplicated, block: B:85:0x0108  */
    /* JADX WARN: Code duplicated, block: B:86:0x010b  */
    /* JADX WARN: Code duplicated, block: B:89:0x0118  */
    /* JADX WARN: Code duplicated, block: B:90:0x011b  */
    /* JADX WARN: Code duplicated, block: B:93:0x0126  */
    /* JADX WARN: Code duplicated, block: B:95:0x012d  */
    /* JADX WARN: Code duplicated, block: B:96:0x012f  */
    public static final void a(String str, i53.d<String, Bitmap> dVar, boolean z14, RenderMode renderMode, e23.l<? super Float, Unit> lVar, e23.l<? super Integer, Unit> lVar2, e23.l<? super LottieAnimationView, Unit> lVar3, p3.m mVar, int i14, int i15) {
        int i16;
        int i17;
        int iOrdinal;
        int i18;
        Object obj;
        int i19;
        boolean z15;
        boolean z16;
        o0 o0Var;
        RenderMode renderMode2;
        p2 p2VarI0;
        boolean z17;
        RenderMode renderMode3;
        boolean z18;
        boolean z19;
        boolean z24;
        boolean z25;
        boolean z26;
        Object objQ;
        p3.m.a aVar;
        int i24;
        RenderMode renderMode4;
        boolean z27;
        boolean z28;
        Object objQ2;
        int i25;
        int i26;
        int i27;
        str.getClass();
        lVar.getClass();
        lVar2.getClass();
        lVar3.getClass();
        o0 o0VarE = mVar.E(178325461);
        if ((i14 & 6) == 0) {
            i16 = (o0VarE.B(str) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= o0VarE.r(dVar) ? 32 : 16;
        }
        int i28 = i15 & 4;
        if (i28 == 0) {
            if ((i14 & 384) == 0) {
                i16 |= o0VarE.h(z14) ? 256 : 128;
            }
            i17 = i15 & 8;
            if (i17 != 0) {
                i16 |= 3072;
            } else if ((i14 & 3072) == 0) {
                if (renderMode == null) {
                    iOrdinal = -1;
                } else {
                    iOrdinal = renderMode.ordinal();
                }
                if (o0VarE.k(iOrdinal)) {
                    i18 = 2048;
                } else {
                    i18 = 1024;
                }
                i16 |= i18;
            }
            if ((i14 & 24576) == 0) {
                if (o0VarE.r(lVar)) {
                    i27 = 16384;
                } else {
                    i27 = 8192;
                }
                i16 |= i27;
            }
            if ((196608 & i14) == 0) {
                obj = lVar2;
                if (o0VarE.r(obj)) {
                    i26 = 131072;
                } else {
                    i26 = 65536;
                }
                i16 |= i26;
            } else {
                obj = lVar2;
            }
            if ((1572864 & i14) == 0) {
                if (o0VarE.r(lVar3)) {
                    i25 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                } else {
                    i25 = 524288;
                }
                i16 |= i25;
            }
            i19 = i16;
            if ((599187 & i19) != 599186) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (o0VarE.n(i19 & 1, z15)) {
                if (i28 != 0) {
                    z17 = false;
                } else {
                    z17 = z14;
                }
                if (i17 != 0) {
                    renderMode3 = RenderMode.AUTOMATIC;
                } else {
                    renderMode3 = renderMode;
                }
                x1 x1Var = p3.n.f135158a;
                h4.r rVarA = x80.c.a(x2.f(x2.h(h4.r.S, f169723a), 1.0f), lVar);
                if ((i19 & 7168) == 2048) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                if ((i19 & 896) == 256) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                boolean z29 = z19 | z18;
                if ((i19 & 14) == 4) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                boolean zR = z24 | z29 | o0VarE.r(dVar);
                if ((458752 & i19) == 131072) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                z26 = zR | z25;
                objQ = o0VarE.q();
                aVar = p3.m.f135153a;
                if (z26) {
                    boolean z34 = z17;
                    RenderMode renderMode5 = renderMode3;
                    Object obj2 = obj;
                    i24 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    cq.m mVar2 = new cq.m(renderMode5, z34, str, dVar, obj2, 9);
                    renderMode4 = renderMode5;
                    z27 = z34;
                    o0VarE.K(mVar2);
                    objQ = mVar2;
                } else {
                    aVar.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        boolean z35 = z17;
                        RenderMode renderMode6 = renderMode3;
                        Object obj3 = obj;
                        i24 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                        cq.m mVar3 = new cq.m(renderMode6, z35, str, dVar, obj3, 9);
                        renderMode4 = renderMode6;
                        z27 = z35;
                        o0VarE.K(mVar3);
                        objQ = mVar3;
                    } else {
                        z27 = z17;
                        renderMode4 = renderMode3;
                        i24 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    }
                }
                e23.l lVar4 = (e23.l) objQ;
                z28 = (3670016 & i19) == i24;
                objQ2 = o0VarE.q();
                if (z28) {
                    objQ2 = new ta0.j(lVar3, 9);
                    o0VarE.K(objQ2);
                } else {
                    aVar.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new ta0.j(lVar3, 9);
                        o0VarE.K(objQ2);
                    }
                }
                p002j6.c.b(lVar4, rVarA, (e23.l) objQ2, o0VarE, 0, 0);
                o0Var = o0VarE;
                z16 = z27;
                renderMode2 = renderMode4;
            } else {
                o0VarE.e();
                z16 = z14;
                o0Var = o0VarE;
                renderMode2 = renderMode;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new da0.n(str, dVar, z16, renderMode2, lVar, lVar2, lVar3, i14, i15);
            }
        }
        i16 |= 384;
        i17 = i15 & 8;
        if (i17 != 0) {
            i16 |= 3072;
        } else if ((i14 & 3072) == 0) {
            if (renderMode == null) {
                iOrdinal = -1;
            } else {
                iOrdinal = renderMode.ordinal();
            }
            if (o0VarE.k(iOrdinal)) {
                i18 = 2048;
            } else {
                i18 = 1024;
            }
            i16 |= i18;
        }
        if ((i14 & 24576) == 0) {
            if (o0VarE.r(lVar)) {
                i27 = 16384;
            } else {
                i27 = 8192;
            }
            i16 |= i27;
        }
        if ((196608 & i14) == 0) {
            obj = lVar2;
            if (o0VarE.r(obj)) {
                i26 = 131072;
            } else {
                i26 = 65536;
            }
            i16 |= i26;
        } else {
            obj = lVar2;
        }
        if ((1572864 & i14) == 0) {
            if (o0VarE.r(lVar3)) {
                i25 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
            } else {
                i25 = 524288;
            }
            i16 |= i25;
        }
        i19 = i16;
        if ((599187 & i19) != 599186) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (o0VarE.n(i19 & 1, z15)) {
            if (i28 != 0) {
                z17 = false;
            } else {
                z17 = z14;
            }
            if (i17 != 0) {
                renderMode3 = RenderMode.AUTOMATIC;
            } else {
                renderMode3 = renderMode;
            }
            x1 x1Var2 = p3.n.f135158a;
            h4.r rVarA2 = x80.c.a(x2.f(x2.h(h4.r.S, f169723a), 1.0f), lVar);
            if ((i19 & 7168) == 2048) {
                z18 = true;
            } else {
                z18 = false;
            }
            if ((i19 & 896) == 256) {
                z19 = true;
            } else {
                z19 = false;
            }
            boolean z210 = z19 | z18;
            if ((i19 & 14) == 4) {
                z24 = true;
            } else {
                z24 = false;
            }
            boolean zR2 = z24 | z210 | o0VarE.r(dVar);
            if ((458752 & i19) == 131072) {
                z25 = true;
            } else {
                z25 = false;
            }
            z26 = zR2 | z25;
            objQ = o0VarE.q();
            aVar = p3.m.f135153a;
            if (z26) {
                aVar.getClass();
                if (objQ == p3.m.a.f135155b) {
                    boolean z36 = z17;
                    RenderMode renderMode7 = renderMode3;
                    Object obj4 = obj;
                    i24 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    cq.m mVar4 = new cq.m(renderMode7, z36, str, dVar, obj4, 9);
                    renderMode4 = renderMode7;
                    z27 = z36;
                    o0VarE.K(mVar4);
                    objQ = mVar4;
                } else {
                    z27 = z17;
                    renderMode4 = renderMode3;
                    i24 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                }
            } else {
                boolean z37 = z17;
                RenderMode renderMode8 = renderMode3;
                Object obj5 = obj;
                i24 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                cq.m mVar5 = new cq.m(renderMode8, z37, str, dVar, obj5, 9);
                renderMode4 = renderMode8;
                z27 = z37;
                o0VarE.K(mVar5);
                objQ = mVar5;
            }
            e23.l lVar5 = (e23.l) objQ;
            if ((3670016 & i19) == i24) {
            }
            objQ2 = o0VarE.q();
            if (z28) {
                aVar.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new ta0.j(lVar3, 9);
                    o0VarE.K(objQ2);
                }
            } else {
                objQ2 = new ta0.j(lVar3, 9);
                o0VarE.K(objQ2);
            }
            p002j6.c.b(lVar5, rVarA2, (e23.l) objQ2, o0VarE, 0, 0);
            o0Var = o0VarE;
            z16 = z27;
            renderMode2 = renderMode4;
        } else {
            o0VarE.e();
            z16 = z14;
            o0Var = o0VarE;
            renderMode2 = renderMode;
        }
        p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new da0.n(str, dVar, z16, renderMode2, lVar, lVar2, lVar3, i14, i15);
        }
    }
}
