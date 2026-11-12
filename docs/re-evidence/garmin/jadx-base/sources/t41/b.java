package t41;

import lc.u0;

/* JADX INFO: loaded from: classes9.dex */
public final class b {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f162273a;

        static {
            int[] iArr = new int[t41.a.values().length];
            try {
                iArr[t41.a.KILOMETER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[t41.a.MILE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[n02.g.values().length];
            try {
                iArr2[n02.g.KILOMETERS.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[n02.g.MILES.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            f162273a = iArr2;
        }
    }

    public static final t41.a a(n02.g gVar) {
        gVar.getClass();
        int i14 = a.f162273a[gVar.ordinal()];
        if (i14 == 1) {
            return t41.a.KILOMETER;
        }
        if (i14 == 2) {
            return t41.a.MILE;
        }
        u0.r();
        return null;
    }
}
