package ka2;

import com.google.common.primitives.UnsignedBytes;
import java.util.Locale;

/* JADX INFO: loaded from: classes7.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f103755a;

    public b(byte[] bArr) {
        this.f103755a = bArr;
    }

    public final byte[] a(int i14) {
        int i15 = i14 * 6;
        int i16 = i15 + 1;
        if (i14 < 0) {
            return null;
        }
        byte[] bArr = this.f103755a;
        if ((bArr[0] & UnsignedBytes.MAX_VALUE) <= i14 || bArr.length < i15 + 7) {
            return null;
        }
        byte[] bArr2 = new byte[6];
        System.arraycopy(bArr, i16, bArr2, 0, 6);
        return bArr2;
    }

    public final String toString() {
        Locale locale = Locale.getDefault();
        byte[] bArr = this.f103755a;
        return String.format(locale, "[Vector Pedals Pairing Status] msg id: %1$d, length: %2$d, no. of pedals: %3$d", 5055, Integer.valueOf(bArr.length), Integer.valueOf(bArr[0] & UnsignedBytes.MAX_VALUE));
    }
}
