package defpackage;

import com.xiaomi.hm.health.bt.profile.gdsp.gps.SportSummary;

/* JADX INFO: loaded from: classes5.dex */
public class iwe {
    public int c;
    public vnc e;
    public vnc f;
    public vnc g;
    public int h;
    public int i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f22167k;
    public int l;
    public int m;
    public byte[] n;
    public b[] o;
    public int d = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public bp2 f22165a = new bp2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f22166b = false;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f22168a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public b f22169b;

        public b() {
        }
    }

    public static byte[] a(byte[] bArr) {
        iwe iweVar = new iwe();
        iweVar.o(bArr);
        return iweVar.m();
    }

    public static int i() {
        return 7168;
    }

    public final void b() {
        j();
        this.f22165a.e(this.c, 24);
        int i = 7168;
        int i2 = this.c + 7168;
        int[] iArr = new int[1];
        while (i < i2) {
            int i3 = i + 1;
            int iK = k(i, iArr);
            if (iK > 0) {
                int iH = h(iArr[0]);
                e(iK, iArr[0], iH);
                c(iArr[0], iH);
                int i4 = 1;
                while (i4 < iK) {
                    n(i3);
                    i4++;
                    i3++;
                }
            } else {
                byte[] bArr = this.n;
                byte b2 = bArr[i];
                if (i >= 2 && b2 == bArr[i - 2]) {
                    this.g.e(this.j);
                } else if (i >= 4 && b2 == bArr[i - 4]) {
                    this.g.e(this.f22167k);
                } else if (i < 6 || b2 != bArr[i - 6]) {
                    this.g.e(b2 & 255);
                } else {
                    this.g.e(this.l);
                }
            }
            i = i3;
        }
    }

    public final void c(int i, int i2) {
        int i3 = i - 1;
        for (int i4 = (i2 - 1) * 3; i4 >= 0; i4 -= 3) {
            this.e.e((i3 >> i4) & 7);
        }
    }

    public final int d(int i, int i2) {
        int i3 = i - 1;
        int iF = 0;
        for (int i4 = (i2 - 1) * 3; i4 >= 0; i4 -= 3) {
            iF += this.e.f((i3 >> i4) & 7);
        }
        return iF;
    }

    public final void e(int i, int i2, int i3) {
        int i4 = i2 >= 512 ? i - 3 : i - 2;
        int iA = vnc.a(i4);
        int i5 = 2;
        while (i5 < iA) {
            i5 += 2;
        }
        int i6 = 1 << (i5 - 1);
        int i7 = iA > 2 ? 2 : 0;
        if ((i4 & i6) != 0) {
            i7 |= 1;
        }
        int i8 = i7 << 1;
        if (((i6 >> 1) & i4) != 0) {
            i8 |= 1;
        }
        int i9 = i6 >> 2;
        this.g.e(i8 + 256 + ((i3 - 1) * 8));
        int i10 = iA - 2;
        while (i10 >= 1) {
            int i11 = i10 > 2 ? 2 : 0;
            if ((i4 & i9) != 0) {
                i11 |= 1;
            }
            int i12 = i11 << 1;
            if (((i9 >> 1) & i4) != 0) {
                i12 |= 1;
            }
            i9 >>= 2;
            this.f.e(i12);
            i10 -= 2;
        }
    }

    public final int f(int i, int i2, int i3) {
        int i4 = i2 >= 512 ? i - 3 : i - 2;
        int iA = vnc.a(i4);
        int i5 = 2;
        while (i5 < iA) {
            i5 += 2;
        }
        int i6 = 1 << (i5 - 1);
        int i7 = iA > 2 ? 2 : 0;
        if ((i4 & i6) != 0) {
            i7 |= 1;
        }
        int i8 = i7 << 1;
        if (((i6 >> 1) & i4) != 0) {
            i8 |= 1;
        }
        int i9 = i6 >> 2;
        int iF = this.g.f(i8 + 256 + ((i3 - 1) * 8));
        int i10 = iA - 2;
        while (i10 >= 1) {
            int i11 = i10 > 2 ? 2 : 0;
            if ((i4 & i9) != 0) {
                i11 |= 1;
            }
            int i12 = i11 << 1;
            if (((i9 >> 1) & i4) != 0) {
                i12 |= 1;
            }
            i9 >>= 2;
            iF += this.f.f(i12);
            i10 -= 2;
        }
        return iF;
    }

    public int g(int i, int[] iArr, int[] iArr2, int[] iArr3) {
        int i2;
        int i3;
        int i4;
        int i5;
        char c;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int iD;
        int iD2;
        int[] iArr4 = new int[33];
        byte[] bArr = this.n;
        int length = bArr.length - i;
        int i11 = 1;
        if (length > 1) {
            int i12 = (bArr[i + 1] & 255) | ((bArr[i] & 255) << 8);
            b bVar = this.o[i12];
            int i13 = 0;
            i2 = 0;
            i3 = 0;
            i4 = 0;
            i5 = 0;
            b bVar2 = null;
            int i14 = 0;
            while (bVar != null) {
                int i15 = bVar.f22168a;
                int i16 = i - i15;
                i13 += i11;
                if (i13 > 256 || i16 > this.d || i16 > this.i) {
                    b[] bVarArr = this.o;
                    if (bVarArr[i12] != bVar) {
                        bVar2.f22169b = null;
                        break;
                    }
                    bVarArr[i12] = null;
                    break;
                }
                int i17 = length < i16 ? length : i16;
                int i18 = 2;
                if (i17 < 2) {
                    i7 = length;
                } else {
                    int i19 = i15 + 2;
                    int i20 = 2;
                    while (true) {
                        if (i20 >= i17) {
                            i7 = length;
                            i8 = i18;
                            break;
                        }
                        byte[] bArr2 = this.n;
                        i7 = length;
                        if (bArr2[i19] != bArr2[i + i20]) {
                            i8 = 2;
                            break;
                        }
                        i19++;
                        i20++;
                        length = i7;
                        i18 = 2;
                    }
                    if (i20 >= i8 && (i9 = (i16 - i20) + 1) <= this.i && ((i20 != i8 || i9 < 512) && (i20 > i2 || i9 <= i3 || (i20 > i2 - 2 && (i9 <= (i3 << 3) || (i20 >= i2 && i9 <= (i3 << 4))))))) {
                        if (i20 > i14) {
                            int i21 = i20 > 32 ? 32 : i20;
                            while (i14 < i21) {
                                int i22 = i14 + 1;
                                iArr4[i22] = iArr4[i14] + this.g.f(this.n[i + i14] & 255);
                                i14 = i22;
                            }
                            if (i20 > 32) {
                                int i23 = iArr4[32];
                                i10 = i23 + ((i23 / 32) * (i20 - 32));
                            } else {
                                i10 = iArr4[i20];
                            }
                            i14 = i21;
                        } else {
                            i10 = iArr4[i20];
                        }
                        if (i10 > i4) {
                            int iH = h(i9);
                            int iF = f(i20, i9, iH);
                            if ((i10 - iF) - (iH << 16) > i4 && (iD2 = i10 - (iD = iF + d(i9, iH))) > i4) {
                                i4 = iD2;
                                i3 = i9;
                                i2 = i20;
                                i5 = iD;
                            }
                        }
                    }
                }
                bVar2 = bVar;
                i11 = 1;
                bVar = bVar.f22169b;
                length = i7;
            }
        } else {
            i2 = 0;
            i3 = 0;
            i4 = 0;
            i5 = 0;
        }
        if (i2 > 0) {
            i6 = i5 / i2;
            c = 0;
        } else {
            c = 0;
            i6 = 0;
        }
        iArr3[c] = i6;
        iArr[c] = i3;
        iArr2[c] = i4;
        return i2;
    }

    public final int h(int i) {
        return (vnc.a(i - 1) + 2) / 3;
    }

    public void j() {
        this.o = new b[65536];
        int i = 0;
        for (int i2 = 0; i2 < 32; i2++) {
            for (int i3 = 0; i3 < 96; i3++) {
                this.n[i] = (byte) i2;
                int i4 = i + 1;
                n(i);
                this.n[i4] = (byte) i3;
                i += 2;
                n(i4);
            }
        }
        for (int i5 = 0; i < 7168 && i5 < 256; i5++) {
            byte b2 = (byte) i5;
            this.n[i] = b2;
            int i6 = i + 1;
            n(i);
            this.n[i6] = b2;
            int i7 = i + 2;
            n(i6);
            this.n[i7] = b2;
            int i8 = i + 3;
            n(i7);
            this.n[i8] = b2;
            i += 4;
            n(i8);
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00bf A[PHI: r6
      0x00bf: PHI (r6v5 int) = (r6v4 int), (r6v4 int), (r6v4 int), (r6v4 int), (r6v4 int), (r6v4 int), (r6v7 int) binds: [B:21:0x0095, B:29:0x00c1, B:31:0x00c6, B:33:0x00cd, B:35:0x00dd, B:26:0x00bc, B:27:0x00be] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:29:0x00c1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x00c3  */
    public final int k(int i, int[] iArr) {
        char c;
        int i2;
        int i3;
        int iG;
        byte[] bArr;
        int[] iArr2 = new int[1];
        int[] iArr3 = new int[1];
        int[] iArr4 = new int[1];
        int iG2 = g(i, iArr2, iArr3, iArr4);
        int i4 = i + 1;
        n(i);
        if (iArr3[0] > 0) {
            int[] iArr5 = new int[1];
            int[] iArr6 = new int[1];
            int[] iArr7 = new int[1];
            int iG3 = g(i4, iArr5, iArr6, iArr7);
            int iF = this.g.f(this.n[i] & 255);
            if (iArr6[0] < iArr3[0] || iArr4[0] <= ((iArr7[0] * iG3) + iF) / (iG3 + 1)) {
                if (iG2 > 3 && (iG = g((i3 = i + iG2), iArr5, iArr6, iArr7)) >= 2) {
                    int[] iArr8 = new int[1];
                    int iG4 = g(i3 - 1, new int[1], new int[1], iArr8);
                    if (iG4 > iG && iArr8[0] < iArr7[0]) {
                        int iH = h(iArr2[0] + 1);
                        int i5 = iG2 - 1;
                        if (((iArr4[0] * iG2) + (iArr7[0] * iG)) / (iG + iG2) > ((f(i5, iArr2[0] + 1, iH) + d(iArr2[0] + 1, iH)) + (iArr8[0] * iG4)) / (i5 + iG4)) {
                            iG2--;
                            iArr2[0] = iArr2[0] + 1;
                        }
                    }
                }
                i2 = 2;
            } else {
                iG2 = 0;
                i2 = 2;
            }
            if (iG2 != i2) {
                c = 0;
            } else if (i >= i2) {
                byte[] bArr2 = this.n;
                if (bArr2[i] == bArr2[i - 2]) {
                    if (iArr4[0] * i2 > this.g.f(this.j) + this.g.f(this.n[i4] & 255)) {
                        iG2 = 0;
                    }
                } else if (i >= 1) {
                    bArr = this.n;
                    if (i4 >= bArr.length && bArr[i4] == bArr[i - 1]) {
                        if (iArr4[0] * 2 > iF + this.g.f(this.j)) {
                            c = 0;
                            iG2 = 0;
                        }
                    }
                }
                c = 0;
            } else if (i >= 1) {
                bArr = this.n;
                if (i4 >= bArr.length) {
                    c = 0;
                } else {
                    c = 0;
                }
            } else {
                c = 0;
            }
        } else {
            c = 0;
        }
        iArr[c] = iArr2[c];
        return iG2;
    }

    public void l(int i) {
        this.h = 1;
        this.i = 1 << 3;
        while (this.i < i) {
            int i2 = this.h + 1;
            this.h = i2;
            this.i = 1 << (i2 * 3);
        }
        int i3 = this.h * 8;
        this.j = i3 + 256;
        this.f22167k = i3 + 257;
        this.l = i3 + SportSummary.VERSION_102;
        this.m = i3 + SportSummary.VERSION_103;
    }

    public final byte[] m() {
        return this.f22165a.b();
    }

    public final void n(int i) {
        byte b2 = this.n[i];
        if (i > 0) {
            b bVar = new b();
            int i2 = i - 1;
            int i3 = (b2 & 255) | ((this.n[i2] & 255) << 8);
            bVar.f22168a = i2;
            b[] bVarArr = this.o;
            bVar.f22169b = bVarArr[i3];
            bVarArr[i3] = bVar;
        }
    }

    public final void o(byte[] bArr) {
        this.f22165a.d(this.f22166b);
        int length = bArr.length;
        this.c = length;
        l(length);
        this.e = new vnc(this.f22165a, 8);
        this.f = new vnc(this.f22165a, 8);
        this.g = new vnc(this.f22165a, this.m);
        int i = this.c;
        byte[] bArr2 = new byte[i + 7168];
        this.n = bArr2;
        System.arraycopy(bArr, 0, bArr2, 7168, i);
        b();
        this.f22165a.a();
    }
}
