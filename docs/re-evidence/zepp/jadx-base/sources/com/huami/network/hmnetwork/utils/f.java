package com.huami.network.hmnetwork.utils;

import java.util.Objects;

/* JADX INFO: loaded from: classes6.dex */
class f {
    private static final int A = -1009589776;
    private static final int B = 81;
    private static final int C = 82;
    private static final int D = 20;
    private static final int[] h = {Integer.MIN_VALUE, 8388608, 32768, 128};
    private static final int[] i = {0, 40, 48, 56};
    private static final int[] j = {0, 8, 16, 24};
    private static final int[] k = {0, 24, 16, 8};
    private static final int[] l = {-1, 16777215, 65535, 255};
    private static final int m = 20;
    private static final int n = 16;
    private static final int o = 0;
    private static final int p = 0;
    private static final int q = 5;
    private static final int r = 21;
    private static final int s = 48;
    private static final int t = 0;
    private static final int u = 1;
    private static final int v = 2;
    private static final int w = 1732584193;
    private static final int x = -271733879;
    private static final int y = -1732584194;
    private static final int z = 271733878;
    private transient int[] a;
    private transient long b;
    private transient int[] c;
    private transient byte[] d;
    private transient int e;
    private transient long f;
    private transient int g;

    private f() {
        int[] iArr = new int[87];
        this.a = iArr;
        iArr[82] = w;
        iArr[83] = x;
        iArr[84] = y;
        iArr[85] = z;
        iArr[86] = A;
        this.b = 0L;
        this.c = new int[37];
        this.d = new byte[20];
        this.e = 20;
        this.f = 0L;
        this.g = 0;
    }

    private static void a(int[] iArr) {
        int i2;
        int i3;
        int i4;
        int i5 = iArr[82];
        int i6 = iArr[83];
        int i7 = iArr[84];
        int i8 = iArr[85];
        int i9 = iArr[86];
        for (int i10 = 16; i10 < 80; i10++) {
            int i11 = ((iArr[i10 - 3] ^ iArr[i10 - 8]) ^ iArr[i10 - 14]) ^ iArr[i10 - 16];
            iArr[i10] = (i11 >>> 31) | (i11 << 1);
        }
        int i12 = 0;
        while (true) {
            i2 = 20;
            if (i12 >= 20) {
                break;
            }
            int i13 = i9 + iArr[i12] + 1518500249 + ((i5 << 5) | (i5 >>> 27)) + ((i6 & i7) | ((~i6) & i8));
            int i14 = (i6 >>> 2) | (i6 << 30);
            i12++;
            i6 = i5;
            i5 = i13;
            i9 = i8;
            i8 = i7;
            i7 = i14;
        }
        while (true) {
            i3 = 40;
            if (i2 >= 40) {
                break;
            }
            int i15 = i9 + iArr[i2] + 1859775393 + ((i5 << 5) | (i5 >>> 27)) + ((i6 ^ i7) ^ i8);
            int i16 = (i6 >>> 2) | (i6 << 30);
            i2++;
            i6 = i5;
            i5 = i15;
            i9 = i8;
            i8 = i7;
            i7 = i16;
        }
        while (true) {
            i4 = 60;
            if (i3 >= 60) {
                break;
            }
            int i17 = ((i9 + iArr[i3]) - 1894007588) + ((i5 << 5) | (i5 >>> 27)) + ((i6 & i7) | (i6 & i8) | (i7 & i8));
            int i18 = (i6 >>> 2) | (i6 << 30);
            i3++;
            i6 = i5;
            i5 = i17;
            i9 = i8;
            i8 = i7;
            i7 = i18;
        }
        while (i4 < 80) {
            int i19 = ((i9 + iArr[i4]) - 899497514) + ((i5 << 5) | (i5 >>> 27)) + ((i6 ^ i7) ^ i8);
            int i20 = (i6 >>> 2) | (i6 << 30);
            i4++;
            i6 = i5;
            i5 = i19;
            i9 = i8;
            i8 = i7;
            i7 = i20;
        }
        iArr[82] = iArr[82] + i5;
        iArr[83] = iArr[83] + i6;
        iArr[84] = iArr[84] + i7;
        iArr[85] = iArr[85] + i8;
        iArr[86] = iArr[86] + i9;
    }

    public static byte[] b(byte[] bArr, int i2) {
        f fVar = new f();
        fVar.d(bArr);
        byte[] bArr2 = new byte[i2];
        fVar.c(bArr2);
        return bArr2;
    }

    private void d(byte[] bArr) {
        Objects.requireNonNull(bArr, "seed == null");
        if (this.g == 2) {
            System.arraycopy(this.c, 0, this.a, 82, 5);
        }
        this.g = 1;
        if (bArr.length != 0) {
            f(bArr);
        }
    }

    private static void e(int[] iArr, byte[] bArr, int i2, int i3) {
        int i4 = iArr[81];
        int i5 = i4 >> 2;
        int i6 = i4 & 3;
        iArr[81] = (((i4 + i3) - i2) + 1) & 63;
        if (i6 != 0) {
            while (i2 <= i3 && i6 < 4) {
                iArr[i5] = iArr[i5] | ((bArr[i2] & 255) << ((3 - i6) << 3));
                i6++;
                i2++;
            }
            if (i6 == 4 && (i5 = i5 + 1) == 16) {
                a(iArr);
                i5 = 0;
            }
            if (i2 > i3) {
                return;
            }
        }
        int i7 = ((i3 - i2) + 1) >> 2;
        for (int i8 = 0; i8 < i7; i8++) {
            iArr[i5] = ((bArr[i2] & 255) << 24) | ((bArr[i2 + 1] & 255) << 16) | ((bArr[i2 + 2] & 255) << 8) | (bArr[i2 + 3] & 255);
            i2 += 4;
            i5++;
            if (i5 >= 16) {
                a(iArr);
                i5 = 0;
            }
        }
        int i9 = (i3 - i2) + 1;
        if (i9 != 0) {
            int i10 = (bArr[i2] & 255) << 24;
            if (i9 != 1) {
                i10 |= (bArr[i2 + 1] & 255) << 16;
                if (i9 != 2) {
                    i10 |= (bArr[i2 + 2] & 255) << 8;
                }
            }
            iArr[i5] = i10;
        }
    }

    private void f(byte[] bArr) {
        e(this.a, bArr, 0, bArr.length - 1);
        this.b += (long) bArr.length;
    }

    public synchronized void c(byte[] bArr) {
        int i2;
        int i3;
        try {
            if (bArr == null) {
                throw new NullPointerException("bytes == null");
            }
            int[] iArr = this.a;
            int i4 = iArr[81] == 0 ? 0 : (iArr[81] + 7) >> 2;
            int i5 = this.g;
            if (i5 == 0) {
                throw new IllegalStateException("No seed supplied!");
            }
            if (i5 == 1) {
                System.arraycopy(iArr, 82, this.c, 0, 5);
                for (int i6 = i4 + 3; i6 < 18; i6++) {
                    this.a[i6] = 0;
                }
                long j2 = (this.b << 3) + 64;
                int[] iArr2 = this.a;
                if (iArr2[81] < 48) {
                    iArr2[14] = (int) (j2 >>> 32);
                    iArr2[15] = (int) (j2 & (-1));
                } else {
                    int[] iArr3 = this.c;
                    iArr3[19] = (int) (j2 >>> 32);
                    iArr3[20] = (int) (j2 & (-1));
                }
                this.e = 20;
            } else {
                i4 = i4;
            }
            this.g = 2;
            if (bArr.length == 0) {
                return;
            }
            int i7 = this.e;
            int length = 20 - i7 < bArr.length - 0 ? 20 - i7 : bArr.length - 0;
            if (length > 0) {
                System.arraycopy(this.d, i7, bArr, 0, length);
                this.e += length;
                i2 = length + 0;
            } else {
                i2 = 0;
            }
            if (i2 >= bArr.length) {
                return;
            }
            int i8 = this.a[81] & 3;
            do {
                if (i8 == 0) {
                    int[] iArr4 = this.a;
                    long j3 = this.f;
                    iArr4[i4] = (int) (j3 >>> 32);
                    iArr4[i4 + 1] = (int) (j3 & (-1));
                    iArr4[i4 + 2] = h[0];
                } else {
                    int[] iArr5 = this.a;
                    int i9 = iArr5[i4];
                    long j4 = this.f;
                    iArr5[i4] = i9 | ((int) ((j4 >>> i[i8]) & ((long) l[i8])));
                    iArr5[i4 + 1] = (int) ((j4 >>> j[i8]) & (-1));
                    iArr5[i4 + 2] = (int) ((j4 << k[i8]) | ((long) h[i8]));
                }
                int[] iArr6 = this.a;
                if (iArr6[81] > 48) {
                    int[] iArr7 = this.c;
                    iArr7[5] = iArr6[16];
                    iArr7[6] = iArr6[17];
                }
                a(iArr6);
                int[] iArr8 = this.a;
                if (iArr8[81] > 48) {
                    System.arraycopy(iArr8, 0, this.c, 21, 16);
                    System.arraycopy(this.c, 5, this.a, 0, 16);
                    a(this.a);
                    System.arraycopy(this.c, 21, this.a, 0, 16);
                }
                this.f++;
                int i10 = 0;
                for (int i11 = 0; i11 < 5; i11++) {
                    int i12 = this.a[i11 + 82];
                    byte[] bArr2 = this.d;
                    bArr2[i10] = (byte) (i12 >>> 24);
                    bArr2[i10 + 1] = (byte) (i12 >>> 16);
                    bArr2[i10 + 2] = (byte) (i12 >>> 8);
                    bArr2[i10 + 3] = (byte) i12;
                    i10 += 4;
                }
                this.e = 0;
                int length2 = 20 < bArr.length - i2 ? 20 : bArr.length - i2;
                if (length2 > 0) {
                    int i13 = i2;
                    System.arraycopy(this.d, 0, bArr, i13, length2);
                    i3 = i13 + length2;
                    this.e += length2;
                } else {
                    i3 = i2;
                }
                i2 = i3;
            } while (i2 < bArr.length);
        } catch (Throwable th) {
            throw th;
        }
    }
}
