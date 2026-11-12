package defpackage;

import com.mi.fitness.netproxy.NetProxyComponentKt;

/* JADX INFO: loaded from: classes2.dex */
public class mbd {
    public static final int[] h = {Integer.MIN_VALUE, NetProxyComponentKt.DEVICE_CAPABILITY_NET_PROXY, 32768, 128};
    public static final int[] i = {0, 40, 48, 56};
    public static final int[] j = {0, 8, 16, 24};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int[] f25970k = {0, 24, 16, 8};
    public static final int[] l = {-1, 16777215, 65535, 255};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public transient int[] f25971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient long f25972b;
    public transient int[] c;
    public transient byte[] d;
    public transient int e;
    public transient long f;
    public transient int g;

    public mbd() {
        int[] iArr = new int[87];
        this.f25971a = iArr;
        iArr[82] = 1732584193;
        iArr[83] = -271733879;
        iArr[84] = -1732584194;
        iArr[85] = 271733878;
        iArr[86] = -1009589776;
        this.f25972b = 0L;
        this.c = new int[37];
        this.d = new byte[20];
        this.e = 20;
        this.f = 0L;
        this.g = 0;
    }

    public static void a(int[] iArr) {
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
        mbd mbdVar = new mbd();
        mbdVar.d(bArr);
        byte[] bArr2 = new byte[i2];
        mbdVar.c(bArr2);
        return bArr2;
    }

    public static void e(int[] iArr, byte[] bArr, int i2, int i3) {
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

    public synchronized void c(byte[] bArr) {
        try {
            if (bArr == null) {
                throw new NullPointerException("bytes == null");
            }
            int[] iArr = this.f25971a;
            int i2 = iArr[81];
            int i3 = i2 == 0 ? 0 : (i2 + 7) >> 2;
            int i4 = this.g;
            if (i4 == 0) {
                throw new IllegalStateException("No seed supplied!");
            }
            char c = ' ';
            if (i4 == 1) {
                System.arraycopy(iArr, 82, this.c, 0, 5);
                for (int i5 = i3 + 3; i5 < 18; i5++) {
                    this.f25971a[i5] = 0;
                }
                long j2 = (this.f25972b << 3) + 64;
                int[] iArr2 = this.f25971a;
                if (iArr2[81] < 48) {
                    iArr2[14] = (int) (j2 >>> 32);
                    iArr2[15] = (int) j2;
                } else {
                    int[] iArr3 = this.c;
                    iArr3[19] = (int) (j2 >>> 32);
                    iArr3[20] = (int) j2;
                }
                this.e = 20;
            }
            this.g = 2;
            if (bArr.length == 0) {
                return;
            }
            int i6 = this.e;
            int length = 20 - i6 < bArr.length ? 20 - i6 : bArr.length;
            if (length > 0) {
                System.arraycopy(this.d, i6, bArr, 0, length);
                this.e += length;
            } else {
                length = 0;
            }
            if (length >= bArr.length) {
                return;
            }
            int i7 = this.f25971a[81] & 3;
            while (true) {
                if (i7 == 0) {
                    int[] iArr4 = this.f25971a;
                    long j3 = this.f;
                    iArr4[i3] = (int) (j3 >>> c);
                    iArr4[i3 + 1] = (int) j3;
                    iArr4[i3 + 2] = h[0];
                } else {
                    int[] iArr5 = this.f25971a;
                    int i8 = iArr5[i3];
                    long j4 = this.f;
                    iArr5[i3] = ((int) ((j4 >>> i[i7]) & ((long) l[i7]))) | i8;
                    iArr5[i3 + 1] = (int) (j4 >>> j[i7]);
                    iArr5[i3 + 2] = (int) ((j4 << f25970k[i7]) | ((long) h[i7]));
                }
                int[] iArr6 = this.f25971a;
                if (iArr6[81] > 48) {
                    int[] iArr7 = this.c;
                    iArr7[5] = iArr6[16];
                    iArr7[6] = iArr6[17];
                }
                a(iArr6);
                int[] iArr8 = this.f25971a;
                if (iArr8[81] > 48) {
                    System.arraycopy(iArr8, 0, this.c, 21, 16);
                    System.arraycopy(this.c, 5, this.f25971a, 0, 16);
                    a(this.f25971a);
                    System.arraycopy(this.c, 21, this.f25971a, 0, 16);
                }
                this.f++;
                int i9 = 0;
                for (int i10 = 0; i10 < 5; i10++) {
                    int i11 = this.f25971a[i10 + 82];
                    byte[] bArr2 = this.d;
                    bArr2[i9] = (byte) (i11 >>> 24);
                    bArr2[i9 + 1] = (byte) (i11 >>> 16);
                    bArr2[i9 + 2] = (byte) (i11 >>> 8);
                    bArr2[i9 + 3] = (byte) i11;
                    i9 += 4;
                }
                this.e = 0;
                int length2 = 20 < bArr.length - length ? 20 : bArr.length - length;
                if (length2 > 0) {
                    System.arraycopy(this.d, 0, bArr, length, length2);
                    length += length2;
                    this.e += length2;
                }
                if (length >= bArr.length) {
                    return;
                } else {
                    c = ' ';
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void d(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("seed == null");
        }
        if (this.g == 2) {
            System.arraycopy(this.c, 0, this.f25971a, 82, 5);
        }
        this.g = 1;
        if (bArr.length != 0) {
            f(bArr);
        }
    }

    public final void f(byte[] bArr) {
        e(this.f25971a, bArr, 0, bArr.length - 1);
        this.f25972b += (long) bArr.length;
    }
}
