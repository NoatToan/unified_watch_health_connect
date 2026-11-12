package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zgh {
    public static int a(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | (bArr[i] << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    public static long b(byte[] bArr, int i) {
        int iA = a(bArr, i);
        return (((long) a(bArr, i + 4)) & 4294967295L) | ((((long) iA) & 4294967295L) << 32);
    }

    public static void c(byte[] bArr, int i, long[] jArr) {
        for (int i2 = 0; i2 < jArr.length; i2++) {
            jArr[i2] = b(bArr, i);
            i += 8;
        }
    }

    public static void d(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) (i >>> 24);
        bArr[i2 + 1] = (byte) (i >>> 16);
        bArr[i2 + 2] = (byte) (i >>> 8);
        bArr[i2 + 3] = (byte) i;
    }

    public static void e(int[] iArr, byte[] bArr, int i) {
        for (int i2 : iArr) {
            d(i2, bArr, i);
            i += 4;
        }
    }

    public static void f(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >>> 8);
        bArr[i2 + 2] = (byte) (i >>> 16);
        bArr[i2 + 3] = (byte) (i >>> 24);
    }

    public static int g(byte[] bArr, int i) {
        return (bArr[i + 3] << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public static long h(byte[] bArr, int i) {
        return ((((long) g(bArr, i + 4)) & 4294967295L) << 32) | (((long) g(bArr, i)) & 4294967295L);
    }

    public static short i(byte[] bArr, int i) {
        return (short) (((bArr[i + 1] & 255) << 8) | (bArr[i] & 255));
    }

    public static void j(long j, byte[] bArr, int i) {
        d((int) (j >>> 32), bArr, i);
        d((int) (j & 4294967295L), bArr, i + 4);
    }

    public static void k(long[] jArr, byte[] bArr, int i) {
        for (long j : jArr) {
            j(j, bArr, i);
            i += 8;
        }
    }

    public static byte[] l(long j) {
        byte[] bArr = new byte[8];
        j(j, bArr, 0);
        return bArr;
    }

    public static void m(long j, byte[] bArr, int i) {
        f((int) (4294967295L & j), bArr, i);
        f((int) (j >>> 32), bArr, i + 4);
    }

    public static void n(long[] jArr, int i, int i2, byte[] bArr, int i3) {
        for (int i4 = 0; i4 < i2; i4++) {
            m(jArr[i + i4], bArr, i3);
            i3 += 8;
        }
    }

    public static byte[] o(long j) {
        byte[] bArr = new byte[8];
        m(j, bArr, 0);
        return bArr;
    }

    public static void p(short s, byte[] bArr, int i) {
        bArr[i] = (byte) s;
        bArr[i + 1] = (byte) (s >>> 8);
    }
}
