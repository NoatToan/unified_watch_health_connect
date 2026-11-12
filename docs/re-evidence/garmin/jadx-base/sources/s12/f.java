package s12;

import i3.gf;
import li0.b0;
import li0.d0;
import li0.s;
import li0.z;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ls12/f;", "Lli0/s;", "<init>", "()V", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f implements s {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f155947a;

        static {
            int[] iArr = new int[b0.values().length];
            try {
                iArr[b0.FOLLOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b0.FOLLOW_BACK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b0.FOLLOWING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[b0.FAVORITE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[b0.REQUEST_SENT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[b0.MUTED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[b0.UNBLOCK.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f155947a = iArr;
        }
    }

    @Override // li0.s
    public final void a(d0 d0Var, boolean z14, e23.a<Unit> aVar, boolean z15, li0.f fVar, p3.m mVar, int i14) {
        int i15;
        d0Var.getClass();
        aVar.getClass();
        fVar.getClass();
        o0 o0VarE = mVar.E(273586207);
        if ((i14 & 6) == 0) {
            i15 = ((i14 & 8) == 0 ? o0VarE.B(d0Var) : o0VarE.r(d0Var) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.h(z14) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(aVar) ? 256 : 128;
        }
        if ((i14 & 24576) == 0) {
            i15 |= (32768 & i14) == 0 ? o0VarE.B(fVar) : o0VarE.r(fVar) ? 16384 : 8192;
        }
        if (o0VarE.n(i15 & 1, (i15 & 8339) != 8338)) {
            x1 x1Var = p3.n.f135158a;
            b0 b0Var = d0Var.f112649b;
            switch (b0Var == null ? -1 : a.f155947a[b0Var.ordinal()]) {
                case 1:
                    o0VarE.C(923348921);
                    z.e(d0Var, fVar, o0VarE, ((i15 >> 9) & 112) | d0.f112647j | (i15 & 14) | (li0.f.f112658h << 3));
                    o0VarE.g0(false);
                    break;
                case 2:
                    o0VarE.C(923351357);
                    z.d(d0Var, fVar, o0VarE, ((i15 >> 9) & 112) | d0.f112647j | (i15 & 14) | (li0.f.f112658h << 3));
                    o0VarE.g0(false);
                    break;
                case 3:
                    o0VarE.C(923353868);
                    z.h(z14, aVar, o0VarE, (i15 >> 3) & 126);
                    o0VarE.g0(false);
                    break;
                case 4:
                    o0VarE.C(923356811);
                    z.c(z14, aVar, o0VarE, (i15 >> 3) & 126);
                    o0VarE.g0(false);
                    break;
                case 5:
                    o0VarE.C(923359862);
                    z.m(z14, aVar, o0VarE, (i15 >> 3) & 126);
                    o0VarE.g0(false);
                    break;
                case 6:
                    o0VarE.C(923363016);
                    z.k(z14, aVar, o0VarE, (i15 >> 3) & 126);
                    o0VarE.g0(false);
                    break;
                case 7:
                    o0VarE.C(923365802);
                    z.b(z14, aVar, o0VarE, (i15 >> 3) & 126);
                    o0VarE.g0(false);
                    break;
                default:
                    o0VarE.C(-1440368991);
                    o0VarE.g0(false);
                    break;
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new gf(this, d0Var, z14, aVar, z15, fVar, i14, 9);
        }
    }
}
