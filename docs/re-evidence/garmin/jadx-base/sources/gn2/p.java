package gn2;

import com.google.common.primitives.UnsignedBytes;

/* JADX INFO: loaded from: classes11.dex */
public class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f78151a = new int[64];

    public final void a(byte[] bArr) {
        int[] iArr = new int[4];
        int i14 = 0;
        int i15 = 0;
        while (i15 < 16) {
            int i16 = i15 / 4;
            int i17 = i15 + 3;
            int i18 = (bArr[i15] & UnsignedBytes.MAX_VALUE) + ((bArr[i15 + 1] & UnsignedBytes.MAX_VALUE) << 8) + ((bArr[i15 + 2] & UnsignedBytes.MAX_VALUE) << 16);
            i15 += 4;
            iArr[i16] = i18 + ((bArr[i17] & UnsignedBytes.MAX_VALUE) << 24);
        }
        int i19 = 0;
        while (i14 < 64) {
            int i24 = i14 + 1;
            int i25 = iArr[i19 & 3] + i19;
            int[] iArr2 = this.f78151a;
            iArr2[i14] = i25;
            i19 -= 1640531527;
            i14 += 2;
            iArr2[i24] = iArr[(i19 >>> 11) & 3] + i19;
        }
    }
}
