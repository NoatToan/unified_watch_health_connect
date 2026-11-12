package defpackage;

import androidx.annotation.IntRange;

/* JADX INFO: loaded from: classes7.dex */
public final class ew5 implements ip5 {
    @Override // defpackage.ip5
    public byte[] a(byte[] bArr, @IntRange(from = 0) int i, @IntRange(from = 20) int i2) {
        int i3 = i * i2;
        int iMin = Math.min(i2, bArr.length - i3);
        if (iMin <= 0) {
            return null;
        }
        byte[] bArr2 = new byte[iMin];
        System.arraycopy(bArr, i3, bArr2, 0, iMin);
        return bArr2;
    }
}
