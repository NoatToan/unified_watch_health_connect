package w2;

import lc.u0;
import s5.w0;
import v2.g1;
import v2.h2;
import v2.k2;
import v2.s0;

/* JADX INFO: loaded from: classes.dex */
public final class h0 {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f181336a;

        static {
            int[] iArr = new int[s0.values().length];
            try {
                iArr[s0.Untransformed.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[s0.Deletion.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[s0.Replacement.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[s0.Insertion.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f181336a = iArr;
        }
    }

    public static final long a(int i14, int i15, h2 h2Var) {
        s0 s0Var;
        h2.b bVar;
        if (i14 == -1) {
            return (((long) i15) << 32) | (4294967295L & ((long) (-1)));
        }
        boolean z14 = i14 > i15;
        p3.d0 d0Var = h2Var.f175041c;
        g1 g1Var = (d0Var == null || (bVar = (h2.b) d0Var.getF182175a()) == null) ? null : bVar.f175045b;
        long jA = g1Var != null ? g1Var.a(i14, false) : og.a.l(i14, i14);
        long jF = h2Var.f(jA);
        if (w0.e(jA) && w0.e(jF)) {
            s0Var = s0.Untransformed;
        } else if (w0.e(jA) || w0.e(jF)) {
            s0Var = (!w0.e(jA) || w0.e(jF)) ? s0.Deletion : s0.Insertion;
        } else {
            s0Var = s0.Replacement;
        }
        int i16 = a.f181336a[s0Var.ordinal()];
        if (i16 == 1) {
            return b.b(i14, z14 ? k2.Start : k2.End);
        }
        if (i16 == 2) {
            return (((long) i14) << 32) | (4294967295L & ((long) (-1)));
        }
        if (i16 == 3) {
            return z14 ? b.b((int) (jF & 4294967295L), k2.Start) : b.b((int) (jF >> 32), k2.End);
        }
        if (i16 != 4) {
            u0.r();
            return 0L;
        }
        if (z14) {
            return i14 == ((int) (jF >> 32)) ? b.b(i14, k2.Start) : b.b((int) (jF & 4294967295L), k2.End);
        }
        return i14 == ((int) (jF & 4294967295L)) ? b.b(i14, k2.End) : b.b((int) (jF >> 32), k2.Start);
    }
}
