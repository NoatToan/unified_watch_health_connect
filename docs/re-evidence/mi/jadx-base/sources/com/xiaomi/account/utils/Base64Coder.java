package com.xiaomi.account.utils;

/* JADX INFO: loaded from: classes6.dex */
public class Base64Coder {
    private static byte[] map2;
    private static final String systemLineSeparator = System.getProperty("line.separator");
    private static char[] map1 = new char[64];

    static {
        char c = 'A';
        int i = 0;
        while (c <= 'Z') {
            map1[i] = c;
            c = (char) (c + 1);
            i++;
        }
        char c2 = 'a';
        while (c2 <= 'z') {
            map1[i] = c2;
            c2 = (char) (c2 + 1);
            i++;
        }
        char c3 = '0';
        while (c3 <= '9') {
            map1[i] = c3;
            c3 = (char) (c3 + 1);
            i++;
        }
        char[] cArr = map1;
        cArr[i] = '+';
        cArr[i + 1] = '/';
        map2 = new byte[128];
        int i2 = 0;
        while (true) {
            byte[] bArr = map2;
            if (i2 >= bArr.length) {
                break;
            }
            bArr[i2] = -1;
            i2++;
        }
        for (int i3 = 0; i3 < 64; i3++) {
            map2[map1[i3]] = (byte) i3;
        }
    }

    private Base64Coder() {
    }

    public static byte[] decode(String str) {
        return decode(str.toCharArray());
    }

    public static byte[] decodeLines(String str) {
        char[] cArr = new char[str.length()];
        int i = 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt != ' ' && cCharAt != '\r' && cCharAt != '\n' && cCharAt != '\t') {
                cArr[i] = cCharAt;
                i++;
            }
        }
        return decode(cArr, 0, i);
    }

    public static String decodeString(String str) {
        return new String(decode(str));
    }

    public static char[] encode(byte[] bArr) {
        return encode(bArr, 0, bArr.length);
    }

    public static String encodeLines(byte[] bArr) {
        return encodeLines(bArr, 0, bArr.length, 76, systemLineSeparator);
    }

    public static String encodeString(String str) {
        return new String(encode(str.getBytes()));
    }

    public static byte[] decode(char[] cArr) {
        return decode(cArr, 0, cArr.length);
    }

    public static char[] encode(byte[] bArr, int i) {
        return encode(bArr, 0, i);
    }

    public static String encodeLines(byte[] bArr, int i, int i2, int i3, String str) {
        int i4 = (i3 * 3) / 4;
        if (i4 <= 0) {
            throw new IllegalArgumentException();
        }
        StringBuilder sb = new StringBuilder((((i2 + 2) / 3) * 4) + ((((i2 + i4) - 1) / i4) * str.length()));
        int i5 = 0;
        while (i5 < i2) {
            int iMin = Math.min(i2 - i5, i4);
            sb.append(encode(bArr, i + i5, iMin));
            sb.append(str);
            i5 += iMin;
        }
        return sb.toString();
    }

    public static byte[] decode(char[] cArr, int i, int i2) {
        char c;
        if (i2 % 4 == 0) {
            while (i2 > 0 && cArr[(i + i2) - 1] == '=') {
                i2--;
            }
            int i3 = (i2 * 3) / 4;
            byte[] bArr = new byte[i3];
            int i4 = i2 + i;
            int i5 = 0;
            while (i < i4) {
                char c2 = cArr[i];
                int i6 = i + 2;
                char c3 = cArr[i + 1];
                char c4 = 'A';
                if (i6 < i4) {
                    i += 3;
                    c = cArr[i6];
                } else {
                    i = i6;
                    c = 'A';
                }
                if (i < i4) {
                    c4 = cArr[i];
                    i++;
                }
                if (c2 <= 127 && c3 <= 127 && c <= 127 && c4 <= 127) {
                    byte[] bArr2 = map2;
                    byte b2 = bArr2[c2];
                    byte b3 = bArr2[c3];
                    byte b4 = bArr2[c];
                    byte b5 = bArr2[c4];
                    if (b2 >= 0 && b3 >= 0 && b4 >= 0 && b5 >= 0) {
                        int i7 = (b2 << 2) | (b3 >>> 4);
                        int i8 = ((b3 & 15) << 4) | (b4 >>> 2);
                        int i9 = ((b4 & 3) << 6) | b5;
                        int i10 = i5 + 1;
                        bArr[i5] = (byte) i7;
                        if (i10 < i3) {
                            bArr[i10] = (byte) i8;
                            i10 = i5 + 2;
                        }
                        if (i10 < i3) {
                            i5 = i10 + 1;
                            bArr[i10] = (byte) i9;
                        } else {
                            i5 = i10;
                        }
                    } else {
                        throw new IllegalArgumentException("Illegal character in Base64 encoded data.");
                    }
                } else {
                    throw new IllegalArgumentException("Illegal character in Base64 encoded data.");
                }
            }
            return bArr;
        }
        throw new IllegalArgumentException("Length of Base64 encoded input string is not a multiple of 4.");
    }

    public static char[] encode(byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = ((i2 * 4) + 2) / 3;
        char[] cArr = new char[((i2 + 2) / 3) * 4];
        int i8 = i2 + i;
        int i9 = 0;
        while (i < i8) {
            int i10 = i + 1;
            byte b2 = bArr[i];
            int i11 = b2 & 255;
            if (i10 < i8) {
                i3 = i + 2;
                i4 = bArr[i10] & 255;
            } else {
                i3 = i10;
                i4 = 0;
            }
            if (i3 < i8) {
                i5 = i3 + 1;
                i6 = bArr[i3] & 255;
            } else {
                i5 = i3;
                i6 = 0;
            }
            int i12 = ((b2 & 3) << 4) | (i4 >>> 4);
            int i13 = ((i4 & 15) << 2) | (i6 >>> 6);
            int i14 = i6 & 63;
            char[] cArr2 = map1;
            cArr[i9] = cArr2[i11 >>> 2];
            int i15 = i9 + 2;
            cArr[i9 + 1] = cArr2[i12];
            char c = '=';
            cArr[i15] = i15 < i7 ? cArr2[i13] : '=';
            int i16 = i9 + 3;
            if (i16 < i7) {
                c = cArr2[i14];
            }
            cArr[i16] = c;
            i9 += 4;
            i = i5;
        }
        return cArr;
    }
}
