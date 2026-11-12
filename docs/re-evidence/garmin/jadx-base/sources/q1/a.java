package q1;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f142054a = new int[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long[] f142055b = new long[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object[] f142056c = new Object[0];

    public static final int a(int i14, int i15, int[] iArr) {
        iArr.getClass();
        int i16 = i14 - 1;
        int i17 = 0;
        while (i17 <= i16) {
            int i18 = (i17 + i16) >>> 1;
            int i19 = iArr[i18];
            if (i19 < i15) {
                i17 = i18 + 1;
            } else {
                if (i19 <= i15) {
                    return i18;
                }
                i16 = i18 - 1;
            }
        }
        return ~i17;
    }

    public static final int b(long[] jArr, int i14, long j8) {
        jArr.getClass();
        int i15 = i14 - 1;
        int i16 = 0;
        while (i16 <= i15) {
            int i17 = (i16 + i15) >>> 1;
            long j14 = jArr[i17];
            if (j14 < j8) {
                i16 = i17 + 1;
            } else {
                if (j14 <= j8) {
                    return i17;
                }
                i15 = i17 - 1;
            }
        }
        return ~i16;
    }
}
