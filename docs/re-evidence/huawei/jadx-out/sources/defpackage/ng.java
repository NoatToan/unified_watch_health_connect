package defpackage;

import androidx.media3.extractor.ts.PsExtractor;
import okio.Utf8;

/* JADX INFO: loaded from: classes4.dex */
public final class ng {
    public static final byte[] e = new byte[128];
    public static final char[] d = new char[64];

    static {
        int i = 0;
        for (int i2 = 0; i2 < 128; i2++) {
            e[i2] = -1;
        }
        for (int i3 = 90; i3 >= 65; i3--) {
            e[i3] = (byte) (i3 - 65);
        }
        for (int i4 = 122; i4 >= 97; i4--) {
            e[i4] = (byte) (i4 - 71);
        }
        for (int i5 = 57; i5 >= 48; i5--) {
            e[i5] = (byte) (i5 + 4);
        }
        byte[] bArr = e;
        bArr[43] = 62;
        bArr[47] = Utf8.REPLACEMENT_BYTE;
        for (int i6 = 0; i6 <= 25; i6++) {
            d[i6] = (char) (i6 + 65);
        }
        int i7 = 26;
        int i8 = 0;
        while (i7 <= 51) {
            d[i7] = (char) (i8 + 97);
            i7++;
            i8++;
        }
        int i9 = 52;
        while (i9 <= 61) {
            d[i9] = (char) (i + 48);
            i9++;
            i++;
        }
        char[] cArr = d;
        cArr[62] = '+';
        cArr[63] = '/';
    }

    public static boolean a(char c2) {
        return c2 < 128 && e[c2] != -1;
    }

    public static boolean c(char c2) {
        return c2 == '=';
    }

    public static boolean e(char c2) {
        return c2 == ' ' || c2 == '\r' || c2 == '\n' || c2 == '\t';
    }

    public static String d(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        int length = bArr.length * 8;
        if (length == 0) {
            return "";
        }
        int i = length % 24;
        int i2 = length / 24;
        char[] cArr = new char[(i != 0 ? i2 + 1 : i2) * 4];
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i3 < i2) {
            byte b2 = bArr[i4];
            byte b3 = bArr[i4 + 1];
            int i6 = i4 + 3;
            byte b4 = bArr[i4 + 2];
            byte b5 = (byte) (b3 & 15);
            byte b6 = (byte) (b2 & 3);
            int i7 = b2 >> 2;
            if ((b2 & (-128)) != 0) {
                i7 ^= PsExtractor.AUDIO_STREAM;
            }
            byte b7 = (byte) i7;
            int i8 = b3 >> 4;
            if ((b3 & (-128)) != 0) {
                i8 ^= 240;
            }
            byte b8 = (byte) i8;
            int i9 = (b4 & (-128)) == 0 ? b4 >> 6 : (b4 >> 6) ^ 252;
            char[] cArr2 = d;
            cArr[i5] = cArr2[b7];
            cArr[i5 + 1] = cArr2[b8 | (b6 << 4)];
            cArr[i5 + 2] = cArr2[(b5 << 2) | ((byte) i9)];
            cArr[i5 + 3] = cArr2[b4 & Utf8.REPLACEMENT_BYTE];
            i3++;
            i5 += 4;
            i4 = i6;
        }
        if (i == 8) {
            byte b9 = bArr[i4];
            byte b10 = (byte) (b9 & 3);
            int i10 = b9 >> 2;
            if ((b9 & (-128)) != 0) {
                i10 ^= PsExtractor.AUDIO_STREAM;
            }
            byte b11 = (byte) i10;
            char[] cArr3 = d;
            cArr[i5] = cArr3[b11];
            cArr[i5 + 1] = cArr3[b10 << 4];
            cArr[i5 + 2] = '=';
            cArr[i5 + 3] = '=';
        } else if (i == 16) {
            byte b12 = bArr[i4];
            byte b13 = bArr[i4 + 1];
            byte b14 = (byte) (b13 & 15);
            byte b15 = (byte) (b12 & 3);
            int i11 = b12 >> 2;
            if ((b12 & (-128)) != 0) {
                i11 ^= PsExtractor.AUDIO_STREAM;
            }
            byte b16 = (byte) i11;
            int i12 = b13 >> 4;
            if ((b13 & (-128)) != 0) {
                i12 ^= 240;
            }
            byte b17 = (byte) i12;
            char[] cArr4 = d;
            cArr[i5] = cArr4[b16];
            cArr[i5 + 1] = cArr4[b17 | (b15 << 4)];
            cArr[i5 + 2] = cArr4[b14 << 2];
            cArr[i5 + 3] = '=';
        }
        return new String(cArr);
    }

    public static byte[] a(String str) {
        if (str == null) {
            return null;
        }
        char[] charArray = str.toCharArray();
        int iA = a(charArray);
        if (iA % 4 != 0) {
            return null;
        }
        int i = iA / 4;
        if (i == 0) {
            return new byte[0];
        }
        byte[] bArr = new byte[i * 3];
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i - 1) {
            char c2 = charArray[i2];
            if (a(c2)) {
                char c3 = charArray[i2 + 1];
                if (a(c3)) {
                    char c4 = charArray[i2 + 2];
                    if (a(c4)) {
                        int i5 = i2 + 4;
                        char c5 = charArray[i2 + 3];
                        if (a(c5)) {
                            byte[] bArr2 = e;
                            byte b2 = bArr2[c2];
                            byte b3 = bArr2[c3];
                            byte b4 = bArr2[c4];
                            byte b5 = bArr2[c5];
                            bArr[i4] = (byte) ((b2 << 2) | (b3 >> 4));
                            bArr[i4 + 1] = (byte) (((b3 & 15) << 4) | ((b4 >> 2) & 15));
                            bArr[i4 + 2] = (byte) (b5 | (b4 << 6));
                            i3++;
                            i4 += 3;
                            i2 = i5;
                        }
                    }
                }
            }
            return null;
        }
        char c6 = charArray[i2];
        if (!a(c6)) {
            return null;
        }
        char c7 = charArray[i2 + 1];
        if (!a(c7)) {
            return null;
        }
        byte[] bArr3 = e;
        byte b6 = bArr3[c6];
        byte b7 = bArr3[c7];
        char c8 = charArray[i2 + 2];
        char c9 = charArray[i2 + 3];
        if (a(c8) && a(c9)) {
            byte b8 = bArr3[c8];
            byte b9 = bArr3[c9];
            bArr[i4] = (byte) ((b6 << 2) | (b7 >> 4));
            bArr[i4 + 1] = (byte) (((b7 & 15) << 4) | ((b8 >> 2) & 15));
            bArr[i4 + 2] = (byte) (b9 | (b8 << 6));
            return bArr;
        }
        if (c(c8) && c(c9)) {
            if ((b7 & 15) != 0) {
                return null;
            }
            int i6 = i3 * 3;
            byte[] bArr4 = new byte[i6 + 1];
            System.arraycopy(bArr, 0, bArr4, 0, i6);
            bArr4[i4] = (byte) ((b6 << 2) | (b7 >> 4));
            return bArr4;
        }
        if (c(c8) || !c(c9)) {
            return null;
        }
        byte b10 = bArr3[c8];
        if ((b10 & 3) != 0) {
            return null;
        }
        int i7 = i3 * 3;
        byte[] bArr5 = new byte[i7 + 2];
        System.arraycopy(bArr, 0, bArr5, 0, i7);
        bArr5[i4] = (byte) ((b6 << 2) | (b7 >> 4));
        bArr5[i4 + 1] = (byte) (((b10 >> 2) & 15) | ((b7 & 15) << 4));
        return bArr5;
    }

    public static int a(char[] cArr) {
        if (cArr == null) {
            return 0;
        }
        int length = cArr.length;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (!e(cArr[i2])) {
                cArr[i] = cArr[i2];
                i++;
            }
        }
        return i;
    }
}
