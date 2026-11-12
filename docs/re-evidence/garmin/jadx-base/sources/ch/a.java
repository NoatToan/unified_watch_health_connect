package ch;

import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import org.apache.commons.io.IOUtils;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f27273a = new byte[128];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final char[] f27274b = new char[64];

    static {
        int i14 = 0;
        for (int i15 = 0; i15 < 128; i15++) {
            f27273a[i15] = -1;
        }
        for (int i16 = 90; i16 >= 65; i16--) {
            f27273a[i16] = (byte) (i16 - 65);
        }
        for (int i17 = 122; i17 >= 97; i17--) {
            f27273a[i17] = (byte) (i17 - 71);
        }
        for (int i18 = 57; i18 >= 48; i18--) {
            f27273a[i18] = (byte) (i18 + 4);
        }
        byte[] bArr = f27273a;
        bArr[43] = 62;
        bArr[47] = 63;
        for (int i19 = 0; i19 <= 25; i19++) {
            f27274b[i19] = (char) (i19 + 65);
        }
        int i24 = 26;
        int i25 = 0;
        while (i24 <= 51) {
            f27274b[i24] = (char) (i25 + 97);
            i24++;
            i25++;
        }
        int i26 = 52;
        while (i26 <= 61) {
            f27274b[i26] = (char) (i14 + 48);
            i26++;
            i14++;
        }
        char[] cArr = f27274b;
        cArr[62] = '+';
        cArr[63] = IOUtils.DIR_SEPARATOR_UNIX;
    }

    public static String a(byte[] bArr) {
        char[] cArr;
        if (bArr == null) {
            return null;
        }
        int length = bArr.length * 8;
        if (length == 0) {
            return "";
        }
        int i14 = length % 24;
        int i15 = length / 24;
        char[] cArr2 = new char[(i14 != 0 ? i15 + 1 : i15) * 4];
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        while (true) {
            cArr = f27274b;
            if (i16 >= i15) {
                break;
            }
            byte b14 = bArr[i17];
            int i19 = i17 + 2;
            byte b15 = bArr[i17 + 1];
            i17 += 3;
            byte b16 = bArr[i19];
            byte b17 = (byte) (b15 & Ascii.SI);
            byte b18 = (byte) (b14 & 3);
            int i24 = b14 & UnsignedBytes.MAX_POWER_OF_TWO;
            int i25 = b14 >> 2;
            if (i24 != 0) {
                i25 ^= 192;
            }
            byte b19 = (byte) i25;
            int i26 = b15 & UnsignedBytes.MAX_POWER_OF_TWO;
            int i27 = b15 >> 4;
            if (i26 != 0) {
                i27 ^= PsExtractor.VIDEO_STREAM_MASK;
            }
            byte b24 = (byte) i27;
            byte b25 = (byte) ((b16 & UnsignedBytes.MAX_POWER_OF_TWO) == 0 ? b16 >> 6 : (b16 >> 6) ^ 252);
            cArr2[i18] = cArr[b19];
            cArr2[i18 + 1] = cArr[b24 | (b18 << 4)];
            int i28 = i18 + 3;
            cArr2[i18 + 2] = cArr[(b17 << 2) | b25];
            i18 += 4;
            cArr2[i28] = cArr[b16 & 63];
            i16++;
        }
        if (i14 == 8) {
            byte b26 = bArr[i17];
            byte b27 = (byte) (b26 & 3);
            int i29 = b26 & UnsignedBytes.MAX_POWER_OF_TWO;
            int i30 = b26 >> 2;
            if (i29 != 0) {
                i30 ^= 192;
            }
            cArr2[i18] = cArr[(byte) i30];
            cArr2[i18 + 1] = cArr[b27 << 4];
            cArr2[i18 + 2] = '=';
            cArr2[i18 + 3] = '=';
        } else if (i14 == 16) {
            byte b28 = bArr[i17];
            byte b29 = bArr[i17 + 1];
            byte b34 = (byte) (b29 & Ascii.SI);
            byte b35 = (byte) (b28 & 3);
            int i34 = b28 & UnsignedBytes.MAX_POWER_OF_TWO;
            int i35 = b28 >> 2;
            if (i34 != 0) {
                i35 ^= 192;
            }
            byte b36 = (byte) i35;
            int i36 = b29 & UnsignedBytes.MAX_POWER_OF_TWO;
            int i37 = b29 >> 4;
            if (i36 != 0) {
                i37 ^= PsExtractor.VIDEO_STREAM_MASK;
            }
            byte b37 = (byte) i37;
            cArr2[i18] = cArr[b36];
            cArr2[i18 + 1] = cArr[b37 | (b35 << 4)];
            cArr2[i18 + 2] = cArr[b34 << 2];
            cArr2[i18 + 3] = '=';
        }
        return new String(cArr2);
    }

    public static boolean b(char c14) {
        return c14 < 128 && f27273a[c14] != -1;
    }

    public static byte[] c(String str) {
        int i14;
        if (str == null) {
            return null;
        }
        char[] charArray = str.toCharArray();
        if (charArray == null) {
            i14 = 0;
        } else {
            i14 = 0;
            for (char c14 : charArray) {
                if (c14 != ' ' && c14 != '\r' && c14 != '\n' && c14 != '\t') {
                    charArray[i14] = c14;
                    i14++;
                }
            }
        }
        if (i14 % 4 != 0) {
            return null;
        }
        int i15 = i14 / 4;
        if (i15 == 0) {
            return new byte[0];
        }
        byte[] bArr = new byte[i15 * 3];
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        while (true) {
            int i19 = i15 - 1;
            byte[] bArr2 = f27273a;
            if (i16 >= i19) {
                int i24 = i17 + 1;
                char c15 = charArray[i17];
                if (!b(c15)) {
                    return null;
                }
                int i25 = i17 + 2;
                char c16 = charArray[i24];
                if (!b(c16)) {
                    return null;
                }
                byte b14 = bArr2[c15];
                byte b15 = bArr2[c16];
                char c17 = charArray[i25];
                char c18 = charArray[i17 + 3];
                if (b(c17) && b(c18)) {
                    byte b16 = bArr2[c17];
                    byte b17 = bArr2[c18];
                    bArr[i18] = (byte) ((b14 << 2) | (b15 >> 4));
                    bArr[i18 + 1] = (byte) (((b15 & Ascii.SI) << 4) | ((b16 >> 2) & 15));
                    bArr[i18 + 2] = (byte) (b17 | (b16 << 6));
                    return bArr;
                }
                if (c17 == '=' && c18 == '=') {
                    if ((b15 & Ascii.SI) != 0) {
                        return null;
                    }
                    int i26 = i16 * 3;
                    byte[] bArr3 = new byte[i26 + 1];
                    System.arraycopy(bArr, 0, bArr3, 0, i26);
                    bArr3[i18] = (byte) ((b14 << 2) | (b15 >> 4));
                    return bArr3;
                }
                if (c17 == '=' || c18 != '=') {
                    return null;
                }
                byte b18 = bArr2[c17];
                if ((b18 & 3) != 0) {
                    return null;
                }
                int i27 = i16 * 3;
                byte[] bArr4 = new byte[i27 + 2];
                System.arraycopy(bArr, 0, bArr4, 0, i27);
                bArr4[i18] = (byte) ((b14 << 2) | (b15 >> 4));
                bArr4[i18 + 1] = (byte) (((b18 >> 2) & 15) | ((b15 & Ascii.SI) << 4));
                return bArr4;
            }
            int i28 = i17 + 1;
            char c19 = charArray[i17];
            if (!b(c19)) {
                return null;
            }
            int i29 = i17 + 2;
            char c23 = charArray[i28];
            if (!b(c23)) {
                return null;
            }
            int i30 = i17 + 3;
            char c24 = charArray[i29];
            if (!b(c24)) {
                return null;
            }
            i17 += 4;
            char c25 = charArray[i30];
            if (!b(c25)) {
                return null;
            }
            byte b19 = bArr2[c19];
            byte b24 = bArr2[c23];
            byte b25 = bArr2[c24];
            byte b26 = bArr2[c25];
            bArr[i18] = (byte) ((b19 << 2) | (b24 >> 4));
            int i34 = i18 + 2;
            bArr[i18 + 1] = (byte) (((b24 & Ascii.SI) << 4) | ((b25 >> 2) & 15));
            i18 += 3;
            bArr[i34] = (byte) ((b25 << 6) | b26);
            i16++;
        }
    }
}
