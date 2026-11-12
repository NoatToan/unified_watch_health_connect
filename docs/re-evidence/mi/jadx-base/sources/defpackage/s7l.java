package defpackage;

import cn.hutool.crypto.digest.SM3;

/* JADX INFO: loaded from: classes3.dex */
public class s7l extends nxa {
    public static final int[] h = new int[64];
    public int[] d;
    public int[] e;
    public int f;
    public int[] g;

    static {
        int i;
        int i2 = 0;
        while (true) {
            if (i2 >= 16) {
                break;
            }
            h[i2] = (2043430169 >>> (32 - i2)) | (2043430169 << i2);
            i2++;
        }
        for (i = 16; i < 64; i++) {
            int i3 = i % 32;
            h[i] = (2055708042 >>> (32 - i3)) | (2055708042 << i3);
        }
    }

    public s7l() {
        this.d = new int[8];
        this.e = new int[16];
        this.g = new int[68];
        reset();
    }

    @Override // defpackage.dpf
    public void a(dpf dpfVar) {
        s7l s7lVar = (s7l) dpfVar;
        super.e(s7lVar);
        p(s7lVar);
    }

    @Override // defpackage.aw6
    public int c() {
        return 32;
    }

    @Override // defpackage.dpf
    public dpf copy() {
        return new s7l(this);
    }

    @Override // defpackage.aw6
    public int doFinal(byte[] bArr, int i) {
        f();
        zgh.e(this.d, bArr, i);
        reset();
        return 32;
    }

    @Override // defpackage.nxa
    public void g() {
        int i;
        int i2 = 0;
        while (true) {
            if (i2 >= 16) {
                break;
            }
            this.g[i2] = this.e[i2];
            i2++;
        }
        for (int i3 = 16; i3 < 68; i3++) {
            int[] iArr = this.g;
            int i4 = iArr[i3 - 3];
            int i5 = iArr[i3 - 13];
            iArr[i3] = (o(((i4 >>> 17) | (i4 << 15)) ^ (iArr[i3 - 16] ^ iArr[i3 - 9])) ^ ((i5 >>> 25) | (i5 << 7))) ^ this.g[i3 - 6];
        }
        int[] iArr2 = this.d;
        int i6 = iArr2[0];
        int i7 = iArr2[1];
        int i8 = iArr2[2];
        int i9 = iArr2[3];
        int iN = iArr2[4];
        int i10 = iArr2[5];
        int i11 = iArr2[6];
        int i12 = iArr2[7];
        int i13 = 0;
        int i14 = i11;
        for (i = 16; i13 < i; i = 16) {
            int i15 = (i6 << 12) | (i6 >>> 20);
            int i16 = i15 + iN + h[i13];
            int i17 = (i16 << 7) | (i16 >>> 25);
            int[] iArr3 = this.g;
            int i18 = iArr3[i13];
            int i19 = i18 ^ iArr3[i13 + 4];
            int iJ = j(i6, i7, i8) + i9;
            int iL = l(iN, i10, i14) + i12 + i17 + i18;
            int i20 = (i7 << 9) | (i7 >>> 23);
            int i21 = (i10 << 19) | (i10 >>> 13);
            i13++;
            i10 = iN;
            iN = n(iL);
            i9 = i8;
            i8 = i20;
            i12 = i14;
            i14 = i21;
            i7 = i6;
            i6 = iJ + (i17 ^ i15) + i19;
        }
        int i22 = i12;
        int iN2 = iN;
        int i23 = i14;
        int i24 = i9;
        int i25 = i8;
        int i26 = i7;
        int i27 = i6;
        int i28 = 16;
        while (i28 < 64) {
            int i29 = (i27 << 12) | (i27 >>> 20);
            int i30 = i29 + iN2 + h[i28];
            int i31 = (i30 << 7) | (i30 >>> 25);
            int[] iArr4 = this.g;
            int i32 = iArr4[i28];
            int i33 = i32 ^ iArr4[i28 + 4];
            int iK = k(i27, i26, i25) + i24;
            int iM = m(iN2, i10, i23) + i22 + i31 + i32;
            int i34 = (i10 << 19) | (i10 >>> 13);
            i28++;
            i10 = iN2;
            iN2 = n(iM);
            i24 = i25;
            i25 = (i26 >>> 23) | (i26 << 9);
            i26 = i27;
            i27 = iK + (i31 ^ i29) + i33;
            i22 = i23;
            i23 = i34;
        }
        int[] iArr5 = this.d;
        iArr5[0] = i27 ^ iArr5[0];
        iArr5[1] = iArr5[1] ^ i26;
        iArr5[2] = iArr5[2] ^ i25;
        iArr5[3] = iArr5[3] ^ i24;
        iArr5[4] = iArr5[4] ^ iN2;
        iArr5[5] = iArr5[5] ^ i10;
        iArr5[6] = i23 ^ iArr5[6];
        iArr5[7] = iArr5[7] ^ i22;
        this.f = 0;
    }

    @Override // defpackage.aw6
    public String getAlgorithmName() {
        return SM3.ALGORITHM_NAME;
    }

    @Override // defpackage.nxa
    public void h(long j) {
        int i = this.f;
        if (i > 14) {
            this.e[i] = 0;
            this.f = i + 1;
            g();
        }
        while (true) {
            int i2 = this.f;
            if (i2 >= 14) {
                int[] iArr = this.e;
                iArr[i2] = (int) (j >>> 32);
                this.f = i2 + 2;
                iArr[i2 + 1] = (int) j;
                return;
            }
            this.e[i2] = 0;
            this.f = i2 + 1;
        }
    }

    @Override // defpackage.nxa
    public void i(byte[] bArr, int i) {
        int i2 = (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
        int[] iArr = this.e;
        int i3 = this.f;
        iArr[i3] = i2;
        int i4 = i3 + 1;
        this.f = i4;
        if (i4 >= 16) {
            g();
        }
    }

    public final int j(int i, int i2, int i3) {
        return (i ^ i2) ^ i3;
    }

    public final int k(int i, int i2, int i3) {
        return (i & i3) | (i & i2) | (i2 & i3);
    }

    public final int l(int i, int i2, int i3) {
        return (i ^ i2) ^ i3;
    }

    public final int m(int i, int i2, int i3) {
        return ((~i) & i3) | (i2 & i);
    }

    public final int n(int i) {
        return (i ^ ((i << 9) | (i >>> 23))) ^ ((i << 17) | (i >>> 15));
    }

    public final int o(int i) {
        return (i ^ ((i << 15) | (i >>> 17))) ^ ((i << 23) | (i >>> 9));
    }

    public final void p(s7l s7lVar) {
        int[] iArr = s7lVar.d;
        int[] iArr2 = this.d;
        System.arraycopy(iArr, 0, iArr2, 0, iArr2.length);
        int[] iArr3 = s7lVar.e;
        int[] iArr4 = this.e;
        System.arraycopy(iArr3, 0, iArr4, 0, iArr4.length);
        this.f = s7lVar.f;
    }

    @Override // defpackage.nxa, defpackage.aw6
    public void reset() {
        super.reset();
        int[] iArr = this.d;
        iArr[0] = 1937774191;
        iArr[1] = 1226093241;
        iArr[2] = 388252375;
        iArr[3] = -628488704;
        iArr[4] = -1452330820;
        iArr[5] = 372324522;
        iArr[6] = -477237683;
        iArr[7] = -1325724082;
        this.f = 0;
    }

    public s7l(s7l s7lVar) {
        super(s7lVar);
        this.d = new int[8];
        this.e = new int[16];
        this.g = new int[68];
        p(s7lVar);
    }
}
