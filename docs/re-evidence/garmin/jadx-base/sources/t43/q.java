package t43;

import lc.u0;
import p43.g2;

/* JADX INFO: loaded from: classes3.dex */
public final class q {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f162393a;

        static {
            int[] iArr = new int[g2.values().length];
            try {
                iArr[g2.INVARIANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[g2.IN_VARIANCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[g2.OUT_VARIANCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f162393a = iArr;
        }
    }

    public static final t a(g2 g2Var) {
        int i14 = a.f162393a[g2Var.ordinal()];
        if (i14 == 1) {
            return t.INV;
        }
        if (i14 == 2) {
            return t.IN;
        }
        if (i14 == 3) {
            return t.OUT;
        }
        u0.r();
        return null;
    }
}
