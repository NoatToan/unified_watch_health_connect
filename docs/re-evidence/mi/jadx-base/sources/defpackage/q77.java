package defpackage;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.WriterException;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class q77 extends a8q {
    @Override // defpackage.nah, defpackage.epr
    public cp2 a(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) throws WriterException {
        if (barcodeFormat == BarcodeFormat.EAN_8) {
            return super.a(str, barcodeFormat, i, i2, map);
        }
        throw new IllegalArgumentException("Can only encode EAN_8, but got ".concat(String.valueOf(barcodeFormat)));
    }

    @Override // defpackage.nah
    public boolean[] c(String str) {
        int length = str.length();
        if (length == 7) {
            try {
                str = str + z7q.q(str);
            } catch (FormatException e) {
                throw new IllegalArgumentException(e);
            }
        } else {
            if (length != 8) {
                throw new IllegalArgumentException("Requested contents should be 8 digits long, but got ".concat(String.valueOf(length)));
            }
            try {
                if (!z7q.h(str)) {
                    throw new IllegalArgumentException("Contents do not pass checksum");
                }
            } catch (FormatException unused) {
                throw new IllegalArgumentException("Illegal contents");
            }
        }
        boolean[] zArr = new boolean[67];
        int iB = nah.b(zArr, 0, z7q.d, true);
        for (int i = 0; i <= 3; i++) {
            iB += nah.b(zArr, iB, z7q.g[Character.digit(str.charAt(i), 10)], false);
        }
        int iB2 = iB + nah.b(zArr, iB, z7q.e, false);
        for (int i2 = 4; i2 <= 7; i2++) {
            iB2 += nah.b(zArr, iB2, z7q.g[Character.digit(str.charAt(i2), 10)], true);
        }
        nah.b(zArr, iB2, z7q.d, true);
        return zArr;
    }
}
