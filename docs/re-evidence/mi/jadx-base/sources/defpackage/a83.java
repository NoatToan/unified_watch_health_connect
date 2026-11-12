package defpackage;

import androidx.annotation.IntRange;

/* JADX INFO: loaded from: classes3.dex */
public final class a83 {
    public static byte[] a(byte[] bArr, @IntRange(from = 0) int i, @IntRange(from = 0) int i2) {
        if (bArr == null || i > bArr.length) {
            return null;
        }
        int iMin = Math.min(bArr.length - i, i2);
        byte[] bArr2 = new byte[iMin];
        System.arraycopy(bArr, i, bArr2, 0, iMin);
        return bArr2;
    }
}
