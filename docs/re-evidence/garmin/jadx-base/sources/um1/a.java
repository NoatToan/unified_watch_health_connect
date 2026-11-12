package um1;

import i41.d;
import lc.u0;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: um1.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C3204a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f172014a;

        static {
            int[] iArr = new int[d.values().length];
            try {
                iArr[d.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d.BALANCED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[d.UNBALANCED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[d.LOW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[d.POOR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f172014a = iArr;
        }
    }

    public static final int a(d dVar) {
        int i14 = C3204a.f172014a[dVar.ordinal()];
        if (i14 == 1) {
            return 0;
        }
        if (i14 == 2) {
            return 1;
        }
        if (i14 == 3) {
            return 2;
        }
        if (i14 == 4) {
            return 3;
        }
        if (i14 == 5) {
            return 4;
        }
        u0.r();
        return 0;
    }
}
