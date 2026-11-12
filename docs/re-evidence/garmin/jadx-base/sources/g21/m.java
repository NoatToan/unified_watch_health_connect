package g21;

import lc.u0;

/* JADX INFO: loaded from: classes9.dex */
public final class m {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f75454a;

        static {
            int[] iArr = new int[l.values().length];
            try {
                iArr[l.PROTEIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[l.FAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[l.CARBS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[l.OTHER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[l.ALL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f75454a = iArr;
        }
    }

    public static final n a(l lVar) {
        lVar.getClass();
        int i14 = a.f75454a[lVar.ordinal()];
        if (i14 == 1) {
            return n.PROTEIN;
        }
        if (i14 == 2) {
            return n.FAT;
        }
        if (i14 == 3) {
            return n.CARBS;
        }
        if (i14 == 4) {
            return n.OTHER;
        }
        if (i14 == 5) {
            return n.PROTEIN;
        }
        u0.r();
        return null;
    }
}
