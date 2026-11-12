package b23;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f15497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f15498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final byte[] f15499c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f15500d;

    static {
        byte[] bArr = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
        f15497a = bArr;
        int[] iArr = new int[256];
        int i14 = 0;
        Arrays.fill(iArr, 0, 256, -1);
        iArr[61] = -2;
        int i15 = 0;
        int i16 = 0;
        while (i15 < 64) {
            iArr[bArr[i15]] = i16;
            i15++;
            i16++;
        }
        f15498b = iArr;
        byte[] bArr2 = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};
        f15499c = bArr2;
        int[] iArr2 = new int[256];
        Arrays.fill(iArr2, 0, 256, -1);
        iArr2[61] = -2;
        int i17 = 0;
        while (i14 < 64) {
            iArr2[bArr2[i14]] = i17;
            i14++;
            i17++;
        }
        f15500d = iArr2;
    }
}
