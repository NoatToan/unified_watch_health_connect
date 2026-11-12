package l72;

import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import i3.e9;
import i3.mc;

/* JADX INFO: loaded from: classes9.dex */
public final class h1 {
    /* JADX WARN: Code duplicated, block: B:37:0x006b  */
    /* JADX WARN: Code duplicated, block: B:39:0x0071  */
    /* JADX WARN: Code duplicated, block: B:40:0x0074  */
    /* JADX WARN: Code duplicated, block: B:44:0x007e  */
    /* JADX WARN: Code duplicated, block: B:46:0x0084  */
    /* JADX WARN: Code duplicated, block: B:47:0x0087  */
    /* JADX WARN: Code duplicated, block: B:51:0x0091  */
    /* JADX WARN: Code duplicated, block: B:53:0x0097  */
    /* JADX WARN: Code duplicated, block: B:54:0x009a  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:67:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:69:0x0122  */
    /* JADX WARN: Code duplicated, block: B:72:0x012d  */
    /* JADX WARN: Code duplicated, block: B:74:? A[RETURN, SYNTHETIC] */
    public static final void a(String str, String str2, mc mcVar, boolean z14, e23.a aVar, e23.a aVar2, z3.e eVar, p3.m mVar, int i14, int i15) {
        int i16;
        boolean z15;
        boolean z16;
        p3.o0 o0Var;
        p3.p2 p2VarI0;
        boolean z17;
        Object objQ;
        int i17;
        int i18;
        int i19;
        str.getClass();
        aVar.getClass();
        aVar2.getClass();
        p3.o0 o0VarE = mVar.E(-873404663);
        if ((i14 & 6) == 0) {
            i16 = (o0VarE.B(str) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= o0VarE.B(str2) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= o0VarE.B(mcVar) ? 256 : 128;
        }
        int i24 = i15 & 8;
        if (i24 == 0) {
            if ((i14 & 3072) == 0) {
                z15 = z14;
                i16 |= o0VarE.h(z15) ? 2048 : 1024;
            }
            if ((i14 & 24576) == 0) {
                if (o0VarE.r(aVar)) {
                    i19 = 16384;
                } else {
                    i19 = 8192;
                }
                i16 |= i19;
            }
            if ((196608 & i14) == 0) {
                if (o0VarE.r(aVar2)) {
                    i18 = 131072;
                } else {
                    i18 = 65536;
                }
                i16 |= i18;
            }
            if ((1572864 & i14) == 0) {
                if (o0VarE.r(eVar)) {
                    i17 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                } else {
                    i17 = 524288;
                }
                i16 |= i17;
            }
            if ((599187 & i16) != 599186) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (o0VarE.n(i16 & 1, z16)) {
                if (i24 != 0) {
                    z17 = true;
                } else {
                    z17 = z15;
                }
                p3.x1 x1Var = p3.n.f135158a;
                long jF = vb.h.f(d92.b.f58623a, o0VarE);
                long jF2 = ds.e0.f(o0VarE);
                h4.r rVarD = c2.x2.d(h4.r.S, 1.0f);
                objQ = o0VarE.q();
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new l01.b(28);
                    o0VarE.K(objQ);
                }
                s0.f111243a.getClass();
                o0Var = o0VarE;
                e9.a((e23.a) objQ, rVarD, mcVar, 0.0f, false, null, jF, 0L, 0.0f, jF2, s0.f111244b, new l71.i(12), null, z3.f.c(1035798891, new b(eVar, str, aVar2, str2, z17, aVar), o0VarE), o0Var, (i16 & 896) | 54, 3078, 4536);
                z15 = z17;
            } else {
                o0Var = o0VarE;
                o0Var.e();
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new da0.n(str, str2, mcVar, z15, aVar, aVar2, eVar, i14, i15);
            }
        }
        i16 |= 3072;
        z15 = z14;
        if ((i14 & 24576) == 0) {
            if (o0VarE.r(aVar)) {
                i19 = 16384;
            } else {
                i19 = 8192;
            }
            i16 |= i19;
        }
        if ((196608 & i14) == 0) {
            if (o0VarE.r(aVar2)) {
                i18 = 131072;
            } else {
                i18 = 65536;
            }
            i16 |= i18;
        }
        if ((1572864 & i14) == 0) {
            if (o0VarE.r(eVar)) {
                i17 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
            } else {
                i17 = 524288;
            }
            i16 |= i17;
        }
        if ((599187 & i16) != 599186) {
            z16 = true;
        } else {
            z16 = false;
        }
        if (o0VarE.n(i16 & 1, z16)) {
            if (i24 != 0) {
                z17 = true;
            } else {
                z17 = z15;
            }
            p3.x1 x1Var2 = p3.n.f135158a;
            long jF3 = vb.h.f(d92.b.f58623a, o0VarE);
            long jF4 = ds.e0.f(o0VarE);
            h4.r rVarD2 = c2.x2.d(h4.r.S, 1.0f);
            objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = new l01.b(28);
                o0VarE.K(objQ);
            }
            s0.f111243a.getClass();
            o0Var = o0VarE;
            e9.a((e23.a) objQ, rVarD2, mcVar, 0.0f, false, null, jF3, 0L, 0.0f, jF4, s0.f111244b, new l71.i(12), null, z3.f.c(1035798891, new b(eVar, str, aVar2, str2, z17, aVar), o0VarE), o0Var, (i16 & 896) | 54, 3078, 4536);
            z15 = z17;
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new da0.n(str, str2, mcVar, z15, aVar, aVar2, eVar, i14, i15);
        }
    }
}
