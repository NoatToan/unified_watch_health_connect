package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class Code39Writer extends OneDimensionalCodeWriter {
    private static void b(int i, int[] iArr) {
        for (int i2 = 0; i2 < 9; i2++) {
            int i3 = 1;
            if (((1 << (8 - i2)) & i) != 0) {
                i3 = 2;
            }
            iArr[i2] = i3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00ec  */
    private static String c(String str) {
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
                sb.append('$');
                sb.append((char) ((cCharAt - 1) + 65));
            } else if (cCharAt < ' ') {
                sb.append('%');
                sb.append((char) ((cCharAt - 27) + 65));
            } else if (cCharAt <= ',' || cCharAt == '/' || cCharAt == ':') {
                sb.append('/');
                sb.append((char) ((cCharAt - '!') + 65));
            } else if (cCharAt <= '9') {
                sb.append((char) ((cCharAt - '0') + 48));
            } else if (cCharAt <= '?') {
                sb.append('%');
                sb.append((char) ((cCharAt - ';') + 70));
            } else if (cCharAt <= 'Z') {
                sb.append((char) ((cCharAt - 'A') + 65));
            } else if (cCharAt <= '_') {
                sb.append('%');
                sb.append((char) ((cCharAt - '[') + 75));
            } else if (cCharAt <= 'z') {
                sb.append('+');
                sb.append((char) ((cCharAt - 'a') + 65));
            } else {
                if (cCharAt > 127) {
                    throw new IllegalArgumentException("Requested content contains a non-encodable character: '" + str.charAt(i) + "'");
                }
                sb.append('%');
                sb.append((char) ((cCharAt - '{') + 80));
            }
        }
        return sb.toString();
    }

    @Override // com.google.zxing.oned.OneDimensionalCodeWriter, com.google.zxing.Writer
    public BitMatrix encode(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) throws WriterException {
        if (barcodeFormat == BarcodeFormat.CODE_39) {
            return super.encode(str, barcodeFormat, i, i2, map);
        }
        throw new IllegalArgumentException("Can only encode CODE_39, but got ".concat(String.valueOf(barcodeFormat)));
    }

    @Override // com.google.zxing.oned.OneDimensionalCodeWriter
    public boolean[] encode(String str) {
        int length = str.length();
        if (length <= 80) {
            for (int i = 0; i < length; i++) {
                if (Code39Reader.e.indexOf(str.charAt(i)) < 0) {
                    str = c(str);
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
                b(Code39Reader.f[Code39Reader.e.indexOf(str.charAt(i3))], iArr);
                for (int i4 = 0; i4 < 9; i4++) {
                    i2 += iArr[i4];
                }
            }
            boolean[] zArr = new boolean[i2];
            b(148, iArr);
            int iAppendPattern = OneDimensionalCodeWriter.appendPattern(zArr, 0, iArr, true);
            int[] iArr2 = {1};
            int iAppendPattern2 = iAppendPattern + OneDimensionalCodeWriter.appendPattern(zArr, iAppendPattern, iArr2, false);
            for (int i5 = 0; i5 < length; i5++) {
                b(Code39Reader.f[Code39Reader.e.indexOf(str.charAt(i5))], iArr);
                int iAppendPattern3 = iAppendPattern2 + OneDimensionalCodeWriter.appendPattern(zArr, iAppendPattern2, iArr, true);
                iAppendPattern2 = iAppendPattern3 + OneDimensionalCodeWriter.appendPattern(zArr, iAppendPattern3, iArr2, false);
            }
            b(148, iArr);
            OneDimensionalCodeWriter.appendPattern(zArr, iAppendPattern2, iArr, true);
            return zArr;
        }
        throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got ".concat(String.valueOf(length)));
    }
}
