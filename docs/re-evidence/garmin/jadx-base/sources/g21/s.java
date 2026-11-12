package g21;

import lc.u0;

/* JADX INFO: loaded from: classes9.dex */
public final class s {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f75493a;

        static {
            int[] iArr = new int[r.values().length];
            try {
                iArr[r.FIBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[r.ADDED_SUGARS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[r.SATURATED_FAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[r.IRON.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[r.VITAMIN_A.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[r.VITAMIN_D.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[r.CALCIUM.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f75493a = iArr;
        }
    }

    public static final b11.n a(r rVar) {
        rVar.getClass();
        switch (a.f75493a[rVar.ordinal()]) {
            case 1:
                return b11.n.FIBER;
            case 2:
                return b11.n.ADDED_SUGAR;
            case 3:
                return b11.n.SATURATED_FAT;
            case 4:
                return b11.n.IRON;
            case 5:
                return b11.n.VITAMIN_A;
            case 6:
                return b11.n.VITAMIN_D;
            case 7:
                return b11.n.CALCIUM;
            default:
                u0.r();
                return null;
        }
    }
}
