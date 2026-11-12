package d53;

/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f57681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long[] f57682b;

    static {
        int[] iArr = new int[256];
        int i14 = 0;
        for (int i15 = 0; i15 < 256; i15++) {
            iArr[i15] = "0123456789abcdef".charAt(i15 & 15) | ("0123456789abcdef".charAt(i15 >> 4) << '\b');
        }
        f57681a = iArr;
        int[] iArr2 = new int[256];
        for (int i16 = 0; i16 < 256; i16++) {
            iArr2[i16] = "0123456789ABCDEF".charAt(i16 & 15) | ("0123456789ABCDEF".charAt(i16 >> 4) << '\b');
        }
        int[] iArr3 = new int[256];
        for (int i17 = 0; i17 < 256; i17++) {
            iArr3[i17] = -1;
        }
        int i18 = 0;
        int i19 = 0;
        while (i18 < "0123456789abcdef".length()) {
            iArr3["0123456789abcdef".charAt(i18)] = i19;
            i18++;
            i19++;
        }
        int i24 = 0;
        int i25 = 0;
        while (i24 < "0123456789ABCDEF".length()) {
            iArr3["0123456789ABCDEF".charAt(i24)] = i25;
            i24++;
            i25++;
        }
        long[] jArr = new long[256];
        for (int i26 = 0; i26 < 256; i26++) {
            jArr[i26] = -1;
        }
        int i27 = 0;
        int i28 = 0;
        while (i27 < "0123456789abcdef".length()) {
            jArr["0123456789abcdef".charAt(i27)] = i28;
            i27++;
            i28++;
        }
        int i29 = 0;
        while (i14 < "0123456789ABCDEF".length()) {
            jArr["0123456789ABCDEF".charAt(i14)] = i29;
            i14++;
            i29++;
        }
        f57682b = jArr;
    }
}
