package defpackage;

import health.compact.a.util.LogUtil;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes7.dex */
public class ehn {
    public static int a(byte b2) {
        return b2 & 255;
    }

    private static int b(int i, int i2) {
        int i3 = 1 << (i2 - 1);
        return (i & i3) != 0 ? (i3 - (i & (i3 - 1))) * (-1) : i;
    }

    private static int e(int i) {
        return i & 15;
    }

    private static int a(byte b2, byte b3) {
        return a(b2) + (a(b3) << 8);
    }

    private static int b(byte b2, byte b3, byte b4, byte b5) {
        return a(b2) + (a(b3) << 8) + (a(b4) << 16) + (a(b5) << 24);
    }

    public static int d(byte[] bArr, int i, int i2) {
        if (bArr == null || e(i) + i2 > bArr.length) {
            return -1;
        }
        if (i == 17) {
            return a(bArr[i2]);
        }
        if (i == 18) {
            return a(bArr[i2], bArr[i2 + 1]);
        }
        if (i == 20) {
            return b(bArr[i2], bArr[i2 + 1], bArr[i2 + 2], bArr[i2 + 3]);
        }
        if (i == 36) {
            return b(b(bArr[i2], bArr[i2 + 1], bArr[i2 + 2], bArr[i2 + 3]), 32);
        }
        if (i == 33) {
            return b(a(bArr[i2]), 8);
        }
        if (i == 34) {
            return b(a(bArr[i2], bArr[i2 + 1]), 16);
        }
        LogUtil.c("PDROPE_GattParser", "no formatType");
        return -1;
    }

    public static String e(byte[] bArr, int i) {
        if (bArr == null || i > bArr.length) {
            return "";
        }
        byte[] bArr2 = new byte[bArr.length - i];
        for (int i2 = 0; i2 != bArr.length - i; i2++) {
            bArr2[i2] = bArr[i + i2];
        }
        try {
            return new String(bArr2, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            LogUtil.c("ByteUtils", "getStringValue UnsupportedEncodingException ", e.getMessage());
            return null;
        }
    }

    public static byte[] c(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return bArr2;
    }

    public static void a(byte[] bArr, int i, int i2) {
        if (bArr == null || i2 >= bArr.length) {
            return;
        }
        bArr[i2] = (byte) (i & 255);
    }

    public static void d(byte[] bArr, int i, int[] iArr, int i2, int i3) {
        if (bArr == null || iArr == null || iArr.length - i2 < i3) {
            return;
        }
        int i4 = 0;
        while (i4 < i3) {
            a(bArr, iArr[i2], i);
            i4++;
            i2++;
            i++;
        }
    }

    public static void b(byte[] bArr, int i, int i2) {
        if (bArr == null || i2 >= bArr.length) {
            return;
        }
        bArr[i2] = (byte) (i & 255);
        bArr[i2 + 1] = (byte) ((i >> 8) & 255);
    }

    public static void e(byte[] bArr, int i, int[] iArr, int i2, int i3) {
        if (bArr == null || iArr == null || iArr.length - i2 < i3) {
            return;
        }
        int i4 = 0;
        while (i4 < i3) {
            b(bArr, iArr[i2], i);
            i += 2;
            i4++;
            i2++;
        }
    }

    public static String b(byte[] bArr, int i) {
        byte[] bArr2 = new byte[bArr.length];
        for (int length = bArr.length - 1; length >= 0; length--) {
            bArr2[(bArr.length - 1) - length] = bArr[length];
        }
        return new BigInteger(1, bArr2).toString(i);
    }
}
