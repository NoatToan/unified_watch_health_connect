package vq0;

import c2.j;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import e23.l;
import h4.r;
import i3.h6;
import java.util.List;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import pp.c;
import vd0.d;
import z3.f;

/* JADX INFO: loaded from: classes8.dex */
public final class b {
    /* JADX WARN: Code duplicated, block: B:30:0x005b  */
    /* JADX WARN: Code duplicated, block: B:32:0x005f  */
    /* JADX WARN: Code duplicated, block: B:33:0x0064  */
    /* JADX WARN: Code duplicated, block: B:35:0x006a  */
    /* JADX WARN: Code duplicated, block: B:36:0x006d  */
    /* JADX WARN: Code duplicated, block: B:40:0x0076  */
    /* JADX WARN: Code duplicated, block: B:42:0x007c  */
    /* JADX WARN: Code duplicated, block: B:43:0x007f  */
    /* JADX WARN: Code duplicated, block: B:47:0x0089  */
    /* JADX WARN: Code duplicated, block: B:49:0x008f  */
    /* JADX WARN: Code duplicated, block: B:50:0x0092  */
    /* JADX WARN: Code duplicated, block: B:54:0x009c  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:65:0x00bd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:66:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:73:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:75:0x0120  */
    /* JADX WARN: Code duplicated, block: B:78:0x012b  */
    /* JADX WARN: Code duplicated, block: B:80:? A[RETURN, SYNTHETIC] */
    public static final <T> void a(r rVar, j.e eVar, int i14, T t7, List<? extends T> list, l<? super T, String> lVar, l<? super Integer, Unit> lVar2, m mVar, int i15, int i16) {
        int i17;
        int i18;
        int i19;
        boolean z14;
        o0 o0Var;
        int i24;
        p2 p2VarI0;
        int i25;
        Object objQ;
        m.a.C2565a c2565a;
        p1 p1Var;
        Object objQ2;
        int i26;
        int i27;
        int i28;
        boolean zR;
        int i29;
        rVar.getClass();
        eVar.getClass();
        list.getClass();
        lVar.getClass();
        lVar2.getClass();
        o0 o0VarE = mVar.E(1574420429);
        if ((i15 & 6) == 0) {
            i17 = (o0VarE.B(rVar) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            i17 |= o0VarE.B(eVar) ? 32 : 16;
        }
        int i30 = i16 & 4;
        if (i30 == 0) {
            if ((i15 & 384) == 0) {
                i18 = i14;
                i17 |= o0VarE.k(i18) ? 256 : 128;
            }
            if ((i15 & 3072) == 0) {
                if ((i15 & 4096) == 0) {
                    zR = o0VarE.B(t7);
                } else {
                    zR = o0VarE.r(t7);
                }
                if (zR) {
                    i29 = 2048;
                } else {
                    i29 = 1024;
                }
                i17 |= i29;
            }
            if ((i15 & 24576) == 0) {
                if (o0VarE.r(list)) {
                    i28 = 16384;
                } else {
                    i28 = 8192;
                }
                i17 |= i28;
            }
            if ((196608 & i15) == 0) {
                if (o0VarE.r(lVar)) {
                    i27 = 131072;
                } else {
                    i27 = 65536;
                }
                i17 |= i27;
            }
            if ((1572864 & i15) == 0) {
                if (o0VarE.r(lVar2)) {
                    i26 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                } else {
                    i26 = 524288;
                }
                i17 |= i26;
            }
            i19 = i17;
            if ((599187 & i19) != 599186) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i19 & 1, z14)) {
                if (i30 != 0) {
                    i25 = Integer.MAX_VALUE;
                } else {
                    i25 = i18;
                }
                x1 x1Var = n.f135158a;
                objQ = o0VarE.q();
                m.f135153a.getClass();
                c2565a = m.a.f135155b;
                if (objQ == c2565a) {
                    objQ = p0.n(Boolean.FALSE);
                    o0VarE.K(objQ);
                }
                p1Var = (p1) objQ;
                boolean zBooleanValue = ((Boolean) p1Var.getF182175a()).booleanValue();
                objQ2 = o0VarE.q();
                if (objQ2 == c2565a) {
                    objQ2 = new d(p1Var, 8);
                    o0VarE.K(objQ2);
                }
                o0Var = o0VarE;
                h6.a(zBooleanValue, (l) objQ2, rVar, f.c(1503340791, new c(rVar, eVar, p1Var, lVar, t7, i25, list, lVar2), o0VarE), o0Var, ((i19 << 6) & 896) | 3120, 0);
                i24 = i25;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                i24 = i18;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new fx0.l(rVar, eVar, i24, t7, list, lVar, lVar2, i15, i16);
            }
        }
        i17 |= 384;
        i18 = i14;
        if ((i15 & 3072) == 0) {
            if ((i15 & 4096) == 0) {
                zR = o0VarE.B(t7);
            } else {
                zR = o0VarE.r(t7);
            }
            if (zR) {
                i29 = 2048;
            } else {
                i29 = 1024;
            }
            i17 |= i29;
        }
        if ((i15 & 24576) == 0) {
            if (o0VarE.r(list)) {
                i28 = 16384;
            } else {
                i28 = 8192;
            }
            i17 |= i28;
        }
        if ((196608 & i15) == 0) {
            if (o0VarE.r(lVar)) {
                i27 = 131072;
            } else {
                i27 = 65536;
            }
            i17 |= i27;
        }
        if ((1572864 & i15) == 0) {
            if (o0VarE.r(lVar2)) {
                i26 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
            } else {
                i26 = 524288;
            }
            i17 |= i26;
        }
        i19 = i17;
        if ((599187 & i19) != 599186) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (o0VarE.n(i19 & 1, z14)) {
            if (i30 != 0) {
                i25 = Integer.MAX_VALUE;
            } else {
                i25 = i18;
            }
            x1 x1Var2 = n.f135158a;
            objQ = o0VarE.q();
            m.f135153a.getClass();
            c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p0.n(Boolean.FALSE);
                o0VarE.K(objQ);
            }
            p1Var = (p1) objQ;
            boolean zBooleanValue2 = ((Boolean) p1Var.getF182175a()).booleanValue();
            objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = new d(p1Var, 8);
                o0VarE.K(objQ2);
            }
            o0Var = o0VarE;
            h6.a(zBooleanValue2, (l) objQ2, rVar, f.c(1503340791, new c(rVar, eVar, p1Var, lVar, t7, i25, list, lVar2), o0VarE), o0Var, ((i19 << 6) & 896) | 3120, 0);
            i24 = i25;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            i24 = i18;
        }
        p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new fx0.l(rVar, eVar, i24, t7, list, lVar, lVar2, i15, i16);
        }
    }
}
