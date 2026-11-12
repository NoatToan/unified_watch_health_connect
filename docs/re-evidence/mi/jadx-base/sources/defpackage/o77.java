package defpackage;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.WriterException;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class o77 extends a8q {
    @Override // defpackage.nah, defpackage.epr
    public cp2 a(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) throws WriterException {
        if (barcodeFormat == BarcodeFormat.EAN_13) {
            return super.a(str, barcodeFormat, i, i2, map);
        }
        throw new IllegalArgumentException("Can only encode EAN_13, but got ".concat(String.valueOf(barcodeFormat)));
    }

    @Override // defpackage.nah
    public boolean[] c(String str) {
        int length = str.length();
        if (length == 12) {
            try {
                str = str + z7q.q(str);
            } catch (FormatException e) {
                throw new IllegalArgumentException(e);
            }
        } else {
            if (length != 13) {
                throw new IllegalArgumentException("Requested contents should be 12 or 13 digits long, but got ".concat(String.valueOf(length)));
            }
            try {
                if (!z7q.h(str)) {
                    throw new IllegalArgumentException("Contents do not pass checksum");
                }
            } catch (FormatException unused) {
                throw new IllegalArgumentException("Illegal contents");
            }
        }
        int i = n77.j[Character.digit(str.charAt(0), 10)];
        boolean[] zArr = new boolean[95];
        int iB = nah.b(zArr, 0, z7q.d, true);
        for (int i2 = 1; i2 <= 6; i2++) {
            int iDigit = Character.digit(str.charAt(i2), 10);
            if (((i >> (6 - i2)) & 1) == 1) {
                iDigit += 10;
            }
            iB += nah.b(zArr, iB, z7q.h[iDigit], false);
        }
        int iB2 = iB + nah.b(zArr, iB, z7q.e, false);
        for (int i3 = 7; i3 <= 12; i3++) {
            iB2 += nah.b(zArr, iB2, z7q.g[Character.digit(str.charAt(i3), 10)], true);
        }
        nah.b(zArr, iB2, z7q.d, true);
        return zArr;
    }
}
