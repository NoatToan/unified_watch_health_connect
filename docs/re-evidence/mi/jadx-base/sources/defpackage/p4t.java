package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class p4t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f30004a = 4;

    public static byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr.length == 0) {
            return bArr;
        }
        int length = bArr.length;
        int i = f30004a;
        int i2 = i - (length % i);
        int i3 = ((length / i) + 1) * i;
        byte[] bArr3 = new byte[i3];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        while (length < i3) {
            bArr3[length] = (byte) i2;
            length++;
        }
        int[] iArrB = b(bArr3);
        int[] iArrB2 = b(bArr2);
        int length2 = iArrB.length;
        int i4 = length2 - 1;
        if (i4 > 0) {
            if (iArrB2.length < 4) {
                int[] iArr = new int[4];
                System.arraycopy(iArrB2, 0, iArr, 0, iArrB2.length);
                iArrB2 = iArr;
            }
            int i5 = iArrB[i4];
            int i6 = (52 / length2) + 6;
            int i7 = 0;
            while (true) {
                int i8 = i6 - 1;
                if (i6 <= 0) {
                    break;
                }
                i7 -= 1640531527;
                int i9 = (i7 >>> 2) & 3;
                int i10 = 0;
                while (i10 < i4) {
                    int i11 = i10 + 1;
                    int i12 = iArrB[i11];
                    i5 = ((((i5 >>> 5) ^ (i12 << 2)) + ((i12 >>> 3) ^ (i5 << 4))) ^ ((i12 ^ i7) + (i5 ^ iArrB2[(i10 & 3) ^ i9]))) + iArrB[i10];
                    iArrB[i10] = i5;
                    i10 = i11;
                }
                int i13 = iArrB[0];
                i5 = ((((i5 >>> 5) ^ (i13 << 2)) + ((i13 >>> 3) ^ (i5 << 4))) ^ ((i13 ^ i7) + (i5 ^ iArrB2[i9 ^ (i10 & 3)]))) + iArrB[i4];
                iArrB[i4] = i5;
                i6 = i8;
            }
        }
        int length3 = iArrB.length << 2;
        byte[] bArr4 = new byte[length3];
        for (int i14 = 0; i14 < length3; i14++) {
            bArr4[i14] = (byte) ((iArrB[i14 >>> 2] >>> ((i14 & 3) << 3)) & 255);
        }
        return bArr4;
    }

    public static int[] b(byte[] bArr) {
        int[] iArr = new int[bArr.length >>> 2];
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            int i2 = i >>> 2;
            iArr[i2] = iArr[i2] | ((bArr[i] & 255) << ((i & 3) << 3));
        }
        return iArr;
    }
}
