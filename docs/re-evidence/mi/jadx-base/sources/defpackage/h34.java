package defpackage;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import java.util.Map;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes5.dex */
public final class h34 extends nah {
    public static void f(int i, int[] iArr) {
        for (int i2 = 0; i2 < 9; i2++) {
            int i3 = 1;
            if (((1 << (8 - i2)) & i) != 0) {
                i3 = 2;
            }
            iArr[i2] = i3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00d4  */
    public static String g(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == 0) {
                sb.append("%U");
            } else if (cCharAt == ' ') {
                sb.append(cCharAt);
            } else if (cCharAt == '@') {
                sb.append("%V");
            } else if (cCharAt == '`') {
                sb.append("%W");
            } else if (cCharAt == '-' || cCharAt == '.') {
                sb.append(cCharAt);
            } else if (cCharAt <= 26) {
                sb.append(Typography.dollar);
                sb.append((char) (cCharAt + '@'));
            } else if (cCharAt < ' ') {
                sb.append('%');
                sb.append((char) (cCharAt + Typography.amp));
            } else if (cCharAt <= ',' || cCharAt == '/' || cCharAt == ':') {
                sb.append('/');
                sb.append((char) (cCharAt + ' '));
            } else if (cCharAt <= '9') {
                sb.append(cCharAt);
            } else if (cCharAt <= '?') {
                sb.append('%');
                sb.append((char) (cCharAt + 11));
            } else if (cCharAt <= 'Z') {
                sb.append(cCharAt);
            } else if (cCharAt <= '_') {
                sb.append('%');
                sb.append((char) (cCharAt - 16));
            } else if (cCharAt <= 'z') {
                sb.append('+');
                sb.append((char) (cCharAt - ' '));
            } else {
                if (cCharAt > 127) {
                    throw new IllegalArgumentException("Requested content contains a non-encodable character: '" + str.charAt(i) + "'");
                }
                sb.append('%');
                sb.append((char) (cCharAt - '+'));
            }
        }
        return sb.toString();
    }

    @Override // defpackage.nah, defpackage.epr
    public cp2 a(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) throws WriterException {
        if (barcodeFormat == BarcodeFormat.CODE_39) {
            return super.a(str, barcodeFormat, i, i2, map);
        }
        throw new IllegalArgumentException("Can only encode CODE_39, but got ".concat(String.valueOf(barcodeFormat)));
    }

    @Override // defpackage.nah
    public boolean[] c(String str) {
        int length = str.length();
        if (length > 80) {
            throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got ".concat(String.valueOf(length)));
        }
        for (int i = 0; i < length; i++) {
            if ("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(str.charAt(i)) < 0) {
                str = g(str);
                length = str.length();
                if (length <= 80) {
                    break;
                }
                throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got " + length + " (extended full ASCII mode)");
            }
        }
        int[] iArr = new int[9];
        int i2 = length + 25;
        for (int i3 = 0; i3 < length; i3++) {
            f(g34.e["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(str.charAt(i3))], iArr);
            for (int i4 = 0; i4 < 9; i4++) {
                i2 += iArr[i4];
            }
        }
        boolean[] zArr = new boolean[i2];
        f(148, iArr);
        int iB = nah.b(zArr, 0, iArr, true);
        int[] iArr2 = {1};
        int iB2 = iB + nah.b(zArr, iB, iArr2, false);
        for (int i5 = 0; i5 < length; i5++) {
            f(g34.e["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(str.charAt(i5))], iArr);
            int iB3 = iB2 + nah.b(zArr, iB2, iArr, true);
            iB2 = iB3 + nah.b(zArr, iB3, iArr2, false);
        }
        f(148, iArr);
        nah.b(zArr, iB2, iArr, true);
        return zArr;
    }
}
