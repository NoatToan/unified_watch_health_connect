package defpackage;

/* JADX INFO: loaded from: classes11.dex */
public class ecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f16507a = System.getProperty("line.separator");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static char[] f16508b = new char[64];
    public static byte[] c;

    static {
        char c2 = 'A';
        int i = 0;
        while (c2 <= 'Z') {
            f16508b[i] = c2;
            c2 = (char) (c2 + 1);
            i++;
        }
        char c3 = 'a';
        while (c3 <= 'z') {
            f16508b[i] = c3;
            c3 = (char) (c3 + 1);
            i++;
        }
        char c4 = '0';
        while (c4 <= '9') {
            f16508b[i] = c4;
            c4 = (char) (c4 + 1);
            i++;
        }
        char[] cArr = f16508b;
        cArr[i] = '+';
        cArr[i + 1] = '/';
        c = new byte[128];
        int i2 = 0;
        while (true) {
            byte[] bArr = c;
            if (i2 >= bArr.length) {
                break;
            }
            bArr[i2] = -1;
            i2++;
        }
        for (int i3 = 0; i3 < 64; i3++) {
            c[f16508b[i3]] = (byte) i3;
        }
    }

    public static String a(String str) {
        return new String(e(str.getBytes()));
    }

    public static byte[] b(String str) {
        return c(str.toCharArray());
    }

    public static byte[] c(char[] cArr) {
        return d(cArr, 0, cArr.length);
    }

    public static byte[] d(char[] cArr, int i, int i2) {
        char c2;
        if (i2 % 4 != 0) {
            throw new IllegalArgumentException("Length of Base64 encoded input string is not a multiple of 4.");
        }
        while (i2 > 0 && cArr[(i + i2) - 1] == '=') {
            i2--;
        }
        int i3 = (i2 * 3) / 4;
        byte[] bArr = new byte[i3];
        int i4 = i2 + i;
        int i5 = 0;
        while (i < i4) {
            char c3 = cArr[i];
            int i6 = i + 2;
            char c4 = cArr[i + 1];
            char c5 = 'A';
            if (i6 < i4) {
                i += 3;
                c2 = cArr[i6];
            } else {
                i = i6;
                c2 = 'A';
            }
            if (i < i4) {
                c5 = cArr[i];
                i++;
            }
            if (c3 > 127 || c4 > 127 || c2 > 127 || c5 > 127) {
                throw new IllegalArgumentException("Illegal character in Base64 encoded data.");
            }
            byte[] bArr2 = c;
            byte b2 = bArr2[c3];
            byte b3 = bArr2[c4];
            byte b4 = bArr2[c2];
            byte b5 = bArr2[c5];
            if (b2 < 0 || b3 < 0 || b4 < 0 || b5 < 0) {
                throw new IllegalArgumentException("Illegal character in Base64 encoded data.");
            }
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
        }
        return bArr;
    }

    public static char[] e(byte[] bArr) {
        return f(bArr, 0, bArr.length);
    }

    public static char[] f(byte[] bArr, int i, int i2) {
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
            char[] cArr2 = f16508b;
            cArr[i9] = cArr2[i11 >>> 2];
            int i15 = i9 + 2;
            cArr[i9 + 1] = cArr2[i12];
            char c2 = '=';
            cArr[i15] = i15 < i7 ? cArr2[i13] : '=';
            int i16 = i9 + 3;
            if (i16 < i7) {
                c2 = cArr2[i14];
            }
            cArr[i16] = c2;
            i9 += 4;
            i = i5;
        }
        return cArr;
    }

    public static String g(String str) {
        return new String(b(str));
    }
}
