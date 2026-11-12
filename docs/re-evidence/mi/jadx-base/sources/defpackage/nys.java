package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class nys {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f28580a = 4;

    public static byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr.length == 0) {
            return bArr;
        }
        int length = bArr.length;
        int i = f28580a;
        int i2 = i - (length % i);
        int i3 = ((length / i) + 1) * i;
        byte[] bArr3 = new byte[i3];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        while (length < i3) {
            bArr3[length] = (byte) i2;
            length++;
        }
        return b(d(c(bArr3), c(bArr2)));
    }

    public static byte[] b(int[] iArr) {
        int length = iArr.length << 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr[i] = (byte) ((iArr[i >>> 2] >>> ((i & 3) << 3)) & 255);
        }
        return bArr;
    }

    public static int[] c(byte[] bArr) {
        int[] iArr = new int[bArr.length >>> 2];
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            int i2 = i >>> 2;
            iArr[i2] = iArr[i2] | ((bArr[i] & 255) << ((i & 3) << 3));
        }
        return iArr;
    }

    public static int[] d(int[] iArr, int[] iArr2) {
        int length = iArr.length;
        int i = length - 1;
        if (i <= 0) {
            return iArr;
        }
        if (iArr2.length < 4) {
            int[] iArr3 = new int[4];
            System.arraycopy(iArr2, 0, iArr3, 0, iArr2.length);
            iArr2 = iArr3;
        }
        int i2 = iArr[i];
        int i3 = (52 / length) + 6;
        int i4 = 0;
        while (true) {
            int i5 = i3 - 1;
            if (i3 <= 0) {
                return iArr;
            }
            i4 -= 1640531527;
            int i6 = (i4 >>> 2) & 3;
            int i7 = 0;
            while (i7 < i) {
                int i8 = i7 + 1;
                int i9 = iArr[i8];
                i2 = ((((i2 >>> 5) ^ (i9 << 2)) + ((i9 >>> 3) ^ (i2 << 4))) ^ ((i9 ^ i4) + (i2 ^ iArr2[(i7 & 3) ^ i6]))) + iArr[i7];
                iArr[i7] = i2;
                i7 = i8;
            }
            int i10 = iArr[0];
            i2 = ((((i2 >>> 5) ^ (i10 << 2)) + ((i10 >>> 3) ^ (i2 << 4))) ^ ((i10 ^ i4) + (i2 ^ iArr2[i6 ^ (i7 & 3)]))) + iArr[i];
            iArr[i] = i2;
            i3 = i5;
        }
    }
}
