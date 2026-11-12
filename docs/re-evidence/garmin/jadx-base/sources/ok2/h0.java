package ok2;

import lc.u0;

/* JADX INFO: loaded from: classes11.dex */
public final class h0 {

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f132735a;

        static {
            int[] iArr = new int[mk2.a.values().length];
            try {
                iArr[mk2.a.IMMEDIATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[mk2.a.DURING_ACTIVITY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[mk2.a.SOON.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[mk2.a.STANDARD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f132735a = iArr;
        }
    }

    public static final g0 a(mk2.a aVar, g0 g0Var) {
        g0 g0Var2;
        g0 g0Var3;
        aVar.getClass();
        int[] iArr = a.f132735a;
        int i14 = iArr[aVar.ordinal()];
        if (i14 == 1) {
            g0Var2 = g0.IMMEDIATE_MESSAGE;
        } else if (i14 == 2) {
            g0Var2 = g0.USER_INITIATED_GENERAL;
        } else if (i14 == 3) {
            g0Var2 = g0.AUTOMATIC_PREFERRED;
        } else {
            if (i14 != 4) {
                u0.r();
                return null;
            }
            g0Var2 = g0.AUTOMATIC_ALLOWED;
        }
        if (g0Var == null || (-g0Var.ordinal()) < (-g0Var2.ordinal())) {
            return g0Var2;
        }
        int i15 = iArr[aVar.ordinal()];
        if (i15 == 1) {
            g0Var3 = g0.IMMEDIATE_MESSAGE;
        } else if (i15 == 2 || i15 == 3) {
            g0Var3 = g0.USER_INITIATED_HIGHEST;
        } else {
            if (i15 != 4) {
                u0.r();
                return null;
            }
            g0Var3 = g0.USER_INITIATED_GENERAL;
        }
        return (-g0Var.ordinal()) > (-g0Var3.ordinal()) ? g0Var3 : g0Var;
    }
}
