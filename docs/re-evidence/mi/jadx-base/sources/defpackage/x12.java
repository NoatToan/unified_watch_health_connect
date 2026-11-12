package defpackage;

import java.util.Arrays;
import kotlin.text.Typography;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes5.dex */
public class x12 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f38562a = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', AbstractJsonLexerKt.UNICODE_ESC, 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f38563b;

    static {
        byte[] bArr = new byte[128];
        f38563b = bArr;
        Arrays.fill(bArr, (byte) 127);
        int i = 0;
        while (true) {
            char[] cArr = f38562a;
            if (i >= cArr.length) {
                return;
            }
            f38563b[cArr[i]] = (byte) i;
            i++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002b  */
    /* JADX WARN: Code duplicated, block: B:13:0x0031  */
    /* JADX WARN: Code duplicated, block: B:14:0x0038  */
    public static byte[] a(String str) {
        int i;
        char[] cArr = new char[4];
        int length = ((str.length() / 4) * 3) + 3;
        byte[] bArr = new byte[length];
        int iB = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < str.length(); i3++) {
            char cCharAt = str.charAt(i3);
            if (cCharAt != '$') {
                byte[] bArr2 = f38563b;
                if (cCharAt < bArr2.length && bArr2[cCharAt] != 127) {
                    i = i2 + 1;
                    cArr[i2] = cCharAt;
                    if (i == 4) {
                        iB += b(cArr, bArr, iB);
                        i2 = 0;
                    } else {
                        i2 = i;
                    }
                }
            } else {
                i = i2 + 1;
                cArr[i2] = cCharAt;
                if (i == 4) {
                    iB += b(cArr, bArr, iB);
                    i2 = 0;
                } else {
                    i2 = i;
                }
            }
        }
        if (iB == length) {
            return bArr;
        }
        byte[] bArr3 = new byte[iB];
        System.arraycopy(bArr, 0, bArr3, 0, iB);
        return bArr3;
    }

    public static int b(char[] cArr, byte[] bArr, int i) {
        char c = cArr[3];
        char c2 = c == '$' ? (char) 2 : (char) 3;
        char c3 = cArr[2];
        if (c3 == '$') {
            c2 = 1;
        }
        byte[] bArr2 = f38563b;
        byte b2 = bArr2[cArr[0]];
        byte b3 = bArr2[cArr[1]];
        byte b4 = bArr2[c3];
        byte b5 = bArr2[c];
        if (c2 == 1) {
            bArr[i] = (byte) (((b3 >> 4) & 3) | ((b2 << 2) & 252));
            return 1;
        }
        if (c2 == 2) {
            bArr[i] = (byte) ((3 & (b3 >> 4)) | ((b2 << 2) & 252));
            bArr[i + 1] = (byte) (((b3 << 4) & 240) | ((b4 >> 2) & 15));
            return 2;
        }
        if (c2 != 3) {
            throw new RuntimeException("internalError00");
        }
        bArr[i] = (byte) (((b2 << 2) & 252) | ((b3 >> 4) & 3));
        bArr[i + 1] = (byte) (((b3 << 4) & 240) | ((b4 >> 2) & 15));
        bArr[i + 2] = (byte) (((b4 << 6) & 192) | (b5 & 63));
        return 3;
    }

    public static String c(byte[] bArr) {
        return d(bArr, 0, bArr.length);
    }

    public static String d(byte[] bArr, int i, int i2) {
        if (i2 <= 0) {
            return "";
        }
        char[] cArr = new char[((i2 / 3) * 4) + 4];
        int i3 = i2 - i;
        int i4 = 0;
        while (i3 >= 3) {
            int i5 = ((bArr[i] & 255) << 16) + ((bArr[i + 1] & 255) << 8) + (bArr[i + 2] & 255);
            char[] cArr2 = f38562a;
            cArr[i4] = cArr2[i5 >> 18];
            cArr[i4 + 1] = cArr2[(i5 >> 12) & 63];
            int i6 = i4 + 3;
            cArr[i4 + 2] = cArr2[(i5 >> 6) & 63];
            i4 += 4;
            cArr[i6] = cArr2[i5 & 63];
            i += 3;
            i3 -= 3;
        }
        if (i3 == 1) {
            int i7 = bArr[i] & 255;
            char[] cArr3 = f38562a;
            cArr[i4] = cArr3[i7 >> 2];
            cArr[i4 + 1] = cArr3[(i7 << 4) & 63];
            int i8 = i4 + 3;
            cArr[i4 + 2] = Typography.dollar;
            i4 += 4;
            cArr[i8] = Typography.dollar;
        } else if (i3 == 2) {
            int i9 = ((bArr[i] & 255) << 8) + (bArr[i + 1] & 255);
            char[] cArr4 = f38562a;
            cArr[i4] = cArr4[i9 >> 10];
            cArr[i4 + 1] = cArr4[(i9 >> 4) & 63];
            int i10 = i4 + 3;
            cArr[i4 + 2] = cArr4[(i9 << 2) & 63];
            i4 += 4;
            cArr[i10] = Typography.dollar;
        }
        return new String(cArr, 0, i4);
    }
}
