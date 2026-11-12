package cw1;

import c2.h2;
import c2.l2;
import com.google.android.exoplayer2.C;
import p005kotlin.Unit;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final class o {
    /* JADX WARN: Code duplicated, block: B:26:0x0058  */
    /* JADX WARN: Code duplicated, block: B:28:0x005e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0061  */
    /* JADX WARN: Code duplicated, block: B:33:0x006d  */
    /* JADX WARN: Code duplicated, block: B:34:0x006f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0078  */
    /* JADX WARN: Code duplicated, block: B:46:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:48:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:52:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:53:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:55:0x0154  */
    /* JADX WARN: Code duplicated, block: B:58:0x0164  */
    /* JADX WARN: Code duplicated, block: B:60:? A[RETURN, SYNTHETIC] */
    public static final void a(final String str, final h4.r rVar, final boolean z14, h2 h2Var, long j8, long j14, s5.x0 x0Var, final e23.a<Unit> aVar, p3.m mVar, final int i14, final int i15) {
        long jE;
        int i16;
        boolean z15;
        final h2 h2Var2;
        final s5.x0 x0Var2;
        final long j15;
        final long j16;
        p2 p2VarI0;
        d92.b bVar;
        int i17;
        s5.x0 x0Var3;
        int i18;
        long j17;
        long j18;
        h2 h2Var3;
        long jC;
        int i19;
        p3.o0 o0VarL = vb.h.l(-595326356, aVar, str, mVar);
        int i24 = (o0VarL.B(str) ? 4 : 2) | i14 | (o0VarL.B(rVar) ? 32 : 16);
        if ((i14 & 384) == 0) {
            i24 |= o0VarL.h(z14) ? 256 : 128;
        }
        int i25 = i24 | 1024;
        if ((i15 & 16) == 0) {
            jE = j8;
            int i26 = o0VarL.l(jE) ? 16384 : 8192;
            i16 = i25 | i26 | 589824;
            if ((12582912 & i14) == 0) {
                if (o0VarL.r(aVar)) {
                    i19 = 8388608;
                } else {
                    i19 = 4194304;
                }
                i16 |= i19;
            }
            if ((4793491 & i16) != 4793490) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (o0VarL.n(i16 & 1, z15)) {
                o0VarL.G0();
                if ((i14 & 1) != 0 || o0VarL.o0()) {
                    bVar = d92.b.f58623a;
                    bVar.getClass();
                    d92.b.f58625c.getClass();
                    l2 l2VarA = c2.l.a(j92.b.f97899b.f97920e);
                    i17 = i16 & (-7169);
                    if ((i15 & 16) != 0) {
                        bVar.getClass();
                        jE = d92.b.a(o0VarL).e().e();
                        i17 = i16 & (-64513);
                    }
                    bVar.getClass();
                    long j19 = d92.b.a(o0VarL).k().f63527d;
                    bVar.getClass();
                    d92.b.f58624b.getClass();
                    x0Var3 = j92.f.f97931h;
                    i18 = i17 & (-4128769);
                    j17 = jE;
                    j18 = j19;
                    h2Var3 = l2VarA;
                } else {
                    o0VarL.e();
                    int i27 = i16 & (-7169);
                    if ((i15 & 16) != 0) {
                        i27 = i16 & (-64513);
                    }
                    h2Var3 = h2Var;
                    i18 = i27 & (-4128769);
                    x0Var3 = x0Var;
                    j17 = jE;
                    j18 = j14;
                }
                o0VarL.h0();
                x1 x1Var = p3.n.f135158a;
                if (z14) {
                    jC = j18;
                } else {
                    jC = o4.d0.c(0.5f, j18, 14);
                }
                i3.c1 c1Var = i3.c1.f87691a;
                long jC2 = o4.d0.c(0.5f, j17, 14);
                long jC3 = o4.d0.c(0.5f, jC, 14);
                c1Var.getClass();
                long j24 = jC;
                i3.b1 b1VarA = i3.c1.a(j17, j24, jC2, jC3, o0VarL, 0);
                long j25 = j17;
                o0VarL = o0VarL;
                g6.f.a aVar2 = g6.f.f75994b;
                i3.h1.a(aVar, rVar, z14, k2.i.a(4), b1VarA, null, null, h2Var3, null, z3.f.c(-1241689508, new m(str, x0Var3, j24), o0VarL), o0VarL, (14 & (i18 >> 21)) | C.ENCODING_PCM_32BIT | (i18 & 112) | (i18 & 896), 352);
                h2Var2 = h2Var3;
                x0Var2 = x0Var3;
                j15 = j25;
                j16 = j18;
            } else {
                o0VarL.e();
                h2Var2 = h2Var;
                x0Var2 = x0Var;
                j15 = jE;
                j16 = j14;
            }
            p2VarI0 = o0VarL.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new e23.p() { // from class: cw1.n
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        o.a(str, rVar, z14, h2Var2, j15, j16, x0Var2, aVar, (p3.m) obj, p3.p0.t(i14 | 1), i15);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        jE = j8;
        i16 = i25 | i26 | 589824;
        if ((12582912 & i14) == 0) {
            if (o0VarL.r(aVar)) {
                i19 = 8388608;
            } else {
                i19 = 4194304;
            }
            i16 |= i19;
        }
        if ((4793491 & i16) != 4793490) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (o0VarL.n(i16 & 1, z15)) {
            o0VarL.G0();
            if ((i14 & 1) != 0) {
                bVar = d92.b.f58623a;
                bVar.getClass();
                d92.b.f58625c.getClass();
                l2 l2VarA2 = c2.l.a(j92.b.f97899b.f97920e);
                i17 = i16 & (-7169);
                if ((i15 & 16) != 0) {
                    bVar.getClass();
                    jE = d92.b.a(o0VarL).e().e();
                    i17 = i16 & (-64513);
                }
                bVar.getClass();
                long j110 = d92.b.a(o0VarL).k().f63527d;
                bVar.getClass();
                d92.b.f58624b.getClass();
                x0Var3 = j92.f.f97931h;
                i18 = i17 & (-4128769);
                j17 = jE;
                j18 = j110;
                h2Var3 = l2VarA2;
            } else {
                bVar = d92.b.f58623a;
                bVar.getClass();
                d92.b.f58625c.getClass();
                l2 l2VarA3 = c2.l.a(j92.b.f97899b.f97920e);
                i17 = i16 & (-7169);
                if ((i15 & 16) != 0) {
                    bVar.getClass();
                    jE = d92.b.a(o0VarL).e().e();
                    i17 = i16 & (-64513);
                }
                bVar.getClass();
                long j111 = d92.b.a(o0VarL).k().f63527d;
                bVar.getClass();
                d92.b.f58624b.getClass();
                x0Var3 = j92.f.f97931h;
                i18 = i17 & (-4128769);
                j17 = jE;
                j18 = j111;
                h2Var3 = l2VarA3;
            }
            o0VarL.h0();
            x1 x1Var2 = p3.n.f135158a;
            if (z14) {
                jC = j18;
            } else {
                jC = o4.d0.c(0.5f, j18, 14);
            }
            i3.c1 c1Var2 = i3.c1.f87691a;
            long jC4 = o4.d0.c(0.5f, j17, 14);
            long jC5 = o4.d0.c(0.5f, jC, 14);
            c1Var2.getClass();
            long j26 = jC;
            i3.b1 b1VarA2 = i3.c1.a(j17, j26, jC4, jC5, o0VarL, 0);
            long j27 = j17;
            o0VarL = o0VarL;
            g6.f.a aVar3 = g6.f.f75994b;
            i3.h1.a(aVar, rVar, z14, k2.i.a(4), b1VarA2, null, null, h2Var3, null, z3.f.c(-1241689508, new m(str, x0Var3, j26), o0VarL), o0VarL, (14 & (i18 >> 21)) | C.ENCODING_PCM_32BIT | (i18 & 112) | (i18 & 896), 352);
            h2Var2 = h2Var3;
            x0Var2 = x0Var3;
            j15 = j27;
            j16 = j18;
        } else {
            o0VarL.e();
            h2Var2 = h2Var;
            x0Var2 = x0Var;
            j15 = jE;
            j16 = j14;
        }
        p2VarI0 = o0VarL.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p() { // from class: cw1.n
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    o.a(str, rVar, z14, h2Var2, j15, j16, x0Var2, aVar, (p3.m) obj, p3.p0.t(i14 | 1), i15);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
