package kn1;

import g02.q0;
import i3.mc;
import ln1.o;
import ln1.p;
import ln1.q;
import ln1.r;
import o53.b0;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final class g {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f105661a;

        static {
            int[] iArr = new int[mn1.b.values().length];
            try {
                iArr[mn1.b.f119758b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[mn1.b.f119759c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[mn1.b.f119760d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[mn1.b.f119761e.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[mn1.b.f119762f.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[mn1.b.f119763g.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[mn1.b.f119764h.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[mn1.b.f119765i.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f105661a = iArr;
        }
    }

    public static final void a(mn1.b bVar, km1.c cVar, mc mcVar, b0 b0Var, p3.m mVar, int i14) {
        int i15;
        cVar.getClass();
        b0Var.getClass();
        o0 o0VarE = mVar.E(3738051);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.k(bVar == null ? -1 : bVar.ordinal()) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(cVar) : o0VarE.r(cVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.B(mcVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(b0Var) ? 2048 : 1024;
        }
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            switch (bVar != null ? a.f105661a[bVar.ordinal()] : -1) {
                case 1:
                    o0VarE.C(-702693141);
                    int i16 = i15 >> 3;
                    o.a(cVar, mcVar, b0Var, o0VarE, (i16 & 896) | km1.c.B | (i16 & 14) | (i16 & 112));
                    o0VarE.g0(false);
                    break;
                case 2:
                    o0VarE.C(-702689559);
                    int i17 = i15 >> 3;
                    r.a(cVar, mcVar, b0Var, o0VarE, (i17 & 896) | km1.c.B | (i17 & 14) | (i17 & 112));
                    o0VarE.g0(false);
                    break;
                case 3:
                    o0VarE.C(-702686105);
                    int i18 = i15 >> 3;
                    ln1.n.a(cVar, mcVar, b0Var, o0VarE, (i18 & 896) | km1.c.B | (i18 & 14) | (i18 & 112));
                    o0VarE.g0(false);
                    break;
                case 4:
                    o0VarE.C(-702682680);
                    int i19 = i15 >> 3;
                    p.a(cVar, mcVar, b0Var, o0VarE, (i19 & 896) | km1.c.B | (i19 & 14) | (i19 & 112));
                    o0VarE.g0(false);
                    break;
                case 5:
                    o0VarE.C(-702679290);
                    int i24 = i15 >> 3;
                    q.a(cVar, mcVar, b0Var, o0VarE, (i24 & 896) | km1.c.B | (i24 & 14) | (i24 & 112));
                    o0VarE.g0(false);
                    break;
                case 6:
                    o0VarE.C(-702675896);
                    int i25 = i15 >> 3;
                    ln1.m.a(cVar, mcVar, b0Var, o0VarE, (i25 & 896) | km1.c.B | (i25 & 14) | (i25 & 112));
                    o0VarE.g0(false);
                    break;
                case 7:
                    o0VarE.C(-702672222);
                    g8.i.i(mcVar, b0Var, o0VarE, (i15 >> 6) & 126);
                    o0VarE.g0(false);
                    break;
                case 8:
                    o0VarE.C(-702668524);
                    int i26 = i15 >> 3;
                    ln1.k.b(cVar, mcVar, b0Var, o0VarE, (i26 & 896) | km1.c.B | (i26 & 14) | (i26 & 112));
                    o0VarE.g0(false);
                    break;
                default:
                    o0VarE.C(-307792995);
                    o0VarE.g0(false);
                    break;
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new q0(bVar, cVar, mcVar, b0Var, i14, 16);
        }
    }
}
