package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public class u73 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f35485a = new byte[0];

    public static String a(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        if (!f(bArr)) {
            for (byte b2 : bArr) {
                sb.append(String.format("%02X", Byte.valueOf(b2)));
            }
        }
        return sb.toString();
    }

    public static byte[] b(int i, boolean z) {
        return c(i, z, 4);
    }

    public static byte[] c(int i, boolean z, int i2) {
        byte[] bArr = new byte[i2];
        if (z) {
            for (int i3 = 0; i3 < i2; i3++) {
                bArr[i3] = (byte) (i & 255);
                i >>= 8;
            }
        } else {
            for (int i4 = i2 - 1; i4 >= 0; i4--) {
                bArr[i4] = (byte) (i & 255);
                i >>= 8;
            }
        }
        return bArr;
    }

    public static byte[] d(byte[] bArr, int i) {
        return e(bArr, i, bArr.length - i);
    }

    public static byte[] e(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return bArr2;
    }

    public static boolean f(byte[] bArr) {
        return bArr == null || bArr.length == 0;
    }

    public static int g(byte[] bArr, boolean z) {
        return h(bArr, z, 0);
    }

    public static int h(byte[] bArr, boolean z, int i) {
        int i2;
        byte b2;
        if (bArr.length < i + 4) {
            throw new IllegalArgumentException("bytes length too short");
        }
        if (z) {
            i2 = (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
            b2 = bArr[i + 3];
        } else {
            i2 = (bArr[i + 3] & 255) | ((bArr[i + 2] & 255) << 8) | ((bArr[i + 1] & 255) << 16);
            b2 = bArr[i];
        }
        return ((b2 & 255) << 24) | i2;
    }

    public static short i(byte[] bArr, boolean z) {
        int i;
        byte b2;
        if (z) {
            i = bArr[0] & 255;
            b2 = bArr[1];
        } else {
            i = bArr[1] & 255;
            b2 = bArr[0];
        }
        return (short) (((b2 & 255) << 8) | i);
    }
}
