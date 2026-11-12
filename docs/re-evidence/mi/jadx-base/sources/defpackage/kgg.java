package defpackage;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class kgg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f23821a = {0, 0, 0, 1};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float[] f23822b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
    public static final Object c = new Object();
    public static int[] d = new int[10];

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f23823a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f23824b;
        public final boolean c;

        public a(int i, int i2, boolean z) {
            this.f23823a = i;
            this.f23824b = i2;
            this.c = z;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f23825a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f23826b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final float g;
        public final boolean h;
        public final boolean i;
        public final int j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final int f23827k;
        public final int l;
        public final boolean m;

        public b(int i, int i2, int i3, int i4, int i5, int i6, float f, boolean z, boolean z2, int i7, int i8, int i9, boolean z3) {
            this.f23825a = i;
            this.f23826b = i2;
            this.c = i3;
            this.d = i4;
            this.e = i5;
            this.f = i6;
            this.g = f;
            this.h = z;
            this.i = z2;
            this.j = i7;
            this.f23827k = i8;
            this.l = i9;
            this.m = z3;
        }
    }

    public static void a(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static void b(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = i + 1;
            if (i3 >= iPosition) {
                byteBuffer.clear();
                return;
            }
            int i4 = byteBuffer.get(i) & 255;
            if (i2 == 3) {
                if (i4 == 1 && (byteBuffer.get(i3) & 31) == 7) {
                    ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
                    byteBufferDuplicate.position(i - 3);
                    byteBufferDuplicate.limit(iPosition);
                    byteBuffer.position(0);
                    byteBuffer.put(byteBufferDuplicate);
                    return;
                }
            } else if (i4 == 0) {
                i2++;
            }
            if (i4 != 0) {
                i2 = 0;
            }
            i = i3;
        }
    }

    public static int c(byte[] bArr, int i, int i2, boolean[] zArr) {
        int i3 = i2 - i;
        rk1.g(i3 >= 0);
        if (i3 == 0) {
            return i2;
        }
        if (zArr[0]) {
            a(zArr);
            return i - 3;
        }
        if (i3 > 1 && zArr[1] && bArr[i] == 1) {
            a(zArr);
            return i - 2;
        }
        if (i3 > 2 && zArr[2] && bArr[i] == 0 && bArr[i + 1] == 1) {
            a(zArr);
            return i - 1;
        }
        int i4 = i2 - 1;
        int i5 = i + 2;
        while (i5 < i4) {
            byte b2 = bArr[i5];
            if ((b2 & 254) == 0) {
                int i6 = i5 - 2;
                if (bArr[i6] == 0 && bArr[i5 - 1] == 0 && b2 == 1) {
                    a(zArr);
                    return i6;
                }
                i5 -= 2;
            }
            i5 += 3;
        }
        zArr[0] = i3 <= 2 ? !(i3 != 2 ? !(zArr[1] && bArr[i4] == 1) : !(zArr[2] && bArr[i2 + (-2)] == 0 && bArr[i4] == 1)) : bArr[i2 + (-3)] == 0 && bArr[i2 + (-2)] == 0 && bArr[i4] == 1;
        zArr[1] = i3 <= 1 ? zArr[2] && bArr[i4] == 0 : bArr[i2 + (-2)] == 0 && bArr[i4] == 0;
        zArr[2] = bArr[i4] == 0;
        return i2;
    }

    public static int d(byte[] bArr, int i, int i2) {
        while (i < i2 - 2) {
            if (bArr[i] == 0 && bArr[i + 1] == 0 && bArr[i + 2] == 3) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static int e(byte[] bArr, int i) {
        return (bArr[i + 3] & 126) >> 1;
    }

    public static int f(byte[] bArr, int i) {
        return bArr[i + 3] & 31;
    }

    public static boolean g(String str, byte b2) {
        if ("video/avc".equals(str) && (b2 & 31) == 6) {
            return true;
        }
        return "video/hevc".equals(str) && ((b2 & 126) >> 1) == 39;
    }

    public static a h(byte[] bArr, int i, int i2) {
        pkh pkhVar = new pkh(bArr, i, i2);
        pkhVar.l(8);
        int iH = pkhVar.h();
        int iH2 = pkhVar.h();
        pkhVar.k();
        return new a(iH, iH2, pkhVar.d());
    }

    /* JADX WARN: Code duplicated, block: B:56:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:59:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:61:0x0102  */
    /* JADX WARN: Code duplicated, block: B:62:0x0105  */
    /* JADX WARN: Code duplicated, block: B:64:0x010b  */
    /* JADX WARN: Code duplicated, block: B:65:0x010d  */
    /* JADX WARN: Code duplicated, block: B:67:0x0111  */
    /* JADX WARN: Code duplicated, block: B:80:0x014e A[PHI: r2
      0x014e: PHI (r2v8 float) = (r2v7 float), (r2v7 float), (r2v7 float), (r2v7 float), (r2v7 float), (r2v10 float) binds: [B:71:0x012a, B:73:0x0130, B:84:0x0159, B:77:0x0146, B:78:0x0148, B:79:0x014a] A[DONT_GENERATE, DONT_INLINE]] */
    public static b i(byte[] bArr, int i, int i2) {
        int iH;
        boolean zD;
        int iH2;
        boolean z;
        boolean zD2;
        int i3;
        int i4;
        float f;
        float f2;
        int i5;
        int i6;
        int i7;
        pkh pkhVar = new pkh(bArr, i, i2);
        pkhVar.l(8);
        int iE = pkhVar.e(8);
        int iE2 = pkhVar.e(8);
        int iE3 = pkhVar.e(8);
        int iH3 = pkhVar.h();
        int i8 = 1;
        if (iE == 100 || iE == 110 || iE == 122 || iE == 244 || iE == 44 || iE == 83 || iE == 86 || iE == 118 || iE == 128 || iE == 138) {
            iH = pkhVar.h();
            zD = iH == 3 ? pkhVar.d() : false;
            pkhVar.h();
            pkhVar.h();
            pkhVar.k();
            if (pkhVar.d()) {
                int i9 = iH != 3 ? 8 : 12;
                int i10 = 0;
                while (i10 < i9) {
                    if (pkhVar.d()) {
                        j(pkhVar, i10 < 6 ? 16 : 64);
                    }
                    i10++;
                }
            }
        } else {
            iH = 1;
            zD = false;
        }
        int iH4 = pkhVar.h() + 4;
        int iH5 = pkhVar.h();
        if (iH5 != 0) {
            if (iH5 == 1) {
                boolean zD3 = pkhVar.d();
                pkhVar.g();
                pkhVar.g();
                zD = zD;
                long jH = pkhVar.h();
                iH = iH;
                for (int i11 = 0; i11 < jH; i11++) {
                    pkhVar.h();
                }
                z = zD3;
                iH2 = 0;
            } else {
                iH2 = 0;
            }
            pkhVar.h();
            pkhVar.k();
            int iH6 = pkhVar.h() + 1;
            int iH7 = pkhVar.h() + 1;
            zD2 = pkhVar.d();
            int i12 = (2 - (zD2 ? 1 : 0)) * iH7;
            if (!zD2) {
                pkhVar.k();
            }
            pkhVar.k();
            i3 = iH6 * 16;
            i4 = i12 * 16;
            if (pkhVar.d()) {
                int iH8 = pkhVar.h();
                int iH9 = pkhVar.h();
                int iH10 = pkhVar.h();
                int iH11 = pkhVar.h();
                if (iH == 0) {
                    i7 = 2 - (zD2 ? 1 : 0);
                } else {
                    i5 = iH;
                    if (i5 == 3) {
                        i6 = 1;
                    } else {
                        i6 = 2;
                    }
                    i8 = i6;
                    i7 = (2 - (zD2 ? 1 : 0)) * (i5 == 1 ? 2 : 1);
                }
                i3 -= (iH8 + iH9) * i8;
                i4 -= (iH10 + iH11) * i7;
            }
            int i13 = i3;
            int i14 = i4;
            f = 1.0f;
            if (pkhVar.d() || !pkhVar.d()) {
                f2 = f;
            } else {
                int iE4 = pkhVar.e(8);
                if (iE4 == 255) {
                    int iE5 = pkhVar.e(16);
                    int iE6 = pkhVar.e(16);
                    if (iE5 != 0 && iE6 != 0) {
                        f = iE5 / iE6;
                    }
                } else {
                    float[] fArr = f23822b;
                    if (iE4 < fArr.length) {
                        f2 = fArr[iE4];
                    } else {
                        StringBuilder sb = new StringBuilder(46);
                        sb.append("Unexpected aspect_ratio_idc value: ");
                        sb.append(iE4);
                        toe.h("NalUnitUtil", sb.toString());
                    }
                }
                f2 = f;
            }
            return new b(iE, iE2, iE3, iH3, i13, i14, f2, zD, zD2, iH4, iH5, iH2, z);
        }
        iH2 = pkhVar.h() + 4;
        z = false;
        pkhVar.h();
        pkhVar.k();
        int iH12 = pkhVar.h() + 1;
        int iH13 = pkhVar.h() + 1;
        zD2 = pkhVar.d();
        int i15 = (2 - (zD2 ? 1 : 0)) * iH13;
        if (!zD2) {
            pkhVar.k();
        }
        pkhVar.k();
        i3 = iH12 * 16;
        i4 = i15 * 16;
        if (pkhVar.d()) {
            int iH14 = pkhVar.h();
            int iH15 = pkhVar.h();
            int iH16 = pkhVar.h();
            int iH17 = pkhVar.h();
            if (iH == 0) {
                i7 = 2 - (zD2 ? 1 : 0);
            } else {
                i5 = iH;
                if (i5 == 3) {
                    i6 = 1;
                } else {
                    i6 = 2;
                }
                i8 = i6;
                i7 = (2 - (zD2 ? 1 : 0)) * (i5 == 1 ? 2 : 1);
            }
            i3 -= (iH14 + iH15) * i8;
            i4 -= (iH16 + iH17) * i7;
        }
        int i16 = i3;
        int i17 = i4;
        f = 1.0f;
        if (pkhVar.d()) {
            f2 = f;
        } else {
            f2 = f;
        }
        return new b(iE, iE2, iE3, iH3, i16, i17, f2, zD, zD2, iH4, iH5, iH2, z);
    }

    public static void j(pkh pkhVar, int i) {
        int iG = 8;
        int i2 = 8;
        for (int i3 = 0; i3 < i; i3++) {
            if (iG != 0) {
                iG = ((pkhVar.g() + i2) + 256) % 256;
            }
            if (iG != 0) {
                i2 = iG;
            }
        }
    }

    public static int k(byte[] bArr, int i) {
        int i2;
        synchronized (c) {
            int iD = 0;
            int i3 = 0;
            while (iD < i) {
                try {
                    iD = d(bArr, iD, i);
                    if (iD < i) {
                        int[] iArr = d;
                        if (iArr.length <= i3) {
                            d = Arrays.copyOf(iArr, iArr.length * 2);
                        }
                        d[i3] = iD;
                        iD += 3;
                        i3++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            i2 = i - i3;
            int i4 = 0;
            int i5 = 0;
            for (int i6 = 0; i6 < i3; i6++) {
                int i7 = d[i6] - i5;
                System.arraycopy(bArr, i5, bArr, i4, i7);
                int i8 = i4 + i7;
                int i9 = i8 + 1;
                bArr[i8] = 0;
                i4 = i8 + 2;
                bArr[i9] = 0;
                i5 += i7 + 3;
            }
            System.arraycopy(bArr, i5, bArr, i4, i2 - i4);
        }
        return i2;
    }
}
