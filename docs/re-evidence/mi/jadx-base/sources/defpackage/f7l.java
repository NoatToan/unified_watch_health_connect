package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class f7l extends nxa {
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int[] i;
    public int j;

    public f7l() {
        this.i = new int[80];
        reset();
    }

    @Override // defpackage.dpf
    public void a(dpf dpfVar) {
        f7l f7lVar = (f7l) dpfVar;
        super.e(f7lVar);
        j(f7lVar);
    }

    @Override // defpackage.aw6
    public int c() {
        return 20;
    }

    @Override // defpackage.dpf
    public dpf copy() {
        return new f7l(this);
    }

    @Override // defpackage.aw6
    public int doFinal(byte[] bArr, int i) {
        f();
        zgh.d(this.d, bArr, i);
        zgh.d(this.e, bArr, i + 4);
        zgh.d(this.f, bArr, i + 8);
        zgh.d(this.g, bArr, i + 12);
        zgh.d(this.h, bArr, i + 16);
        reset();
        return 20;
    }

    @Override // defpackage.nxa
    public void g() {
        for (int i = 16; i < 80; i++) {
            int[] iArr = this.i;
            int i2 = ((iArr[i - 3] ^ iArr[i - 8]) ^ iArr[i - 14]) ^ iArr[i - 16];
            iArr[i] = (i2 >>> 31) | (i2 << 1);
        }
        int iM = this.d;
        int iM2 = this.e;
        int i3 = this.f;
        int i4 = this.g;
        int i5 = this.h;
        int i6 = 0;
        for (int i7 = 0; i7 < 4; i7++) {
            int iK = i5 + ((iM << 5) | (iM >>> 27)) + k(iM2, i3, i4) + this.i[i6] + 1518500249;
            int i8 = (iM2 >>> 2) | (iM2 << 30);
            int iK2 = i4 + ((iK << 5) | (iK >>> 27)) + k(iM, i8, i3) + this.i[i6 + 1] + 1518500249;
            int i9 = (iM >>> 2) | (iM << 30);
            int iK3 = i3 + ((iK2 << 5) | (iK2 >>> 27)) + k(iK, i9, i8) + this.i[i6 + 2] + 1518500249;
            i5 = (iK >>> 2) | (iK << 30);
            int i10 = i6 + 4;
            iM2 = i8 + ((iK3 << 5) | (iK3 >>> 27)) + k(iK2, i5, i9) + this.i[i6 + 3] + 1518500249;
            i4 = (iK2 >>> 2) | (iK2 << 30);
            i6 += 5;
            iM = i9 + ((iM2 << 5) | (iM2 >>> 27)) + k(iK3, i4, i5) + this.i[i10] + 1518500249;
            i3 = (iK3 >>> 2) | (iK3 << 30);
        }
        for (int i11 = 0; i11 < 4; i11++) {
            int iM3 = i5 + ((iM << 5) | (iM >>> 27)) + m(iM2, i3, i4) + this.i[i6] + 1859775393;
            int i12 = (iM2 >>> 2) | (iM2 << 30);
            int iM4 = i4 + ((iM3 << 5) | (iM3 >>> 27)) + m(iM, i12, i3) + this.i[i6 + 1] + 1859775393;
            int i13 = (iM >>> 2) | (iM << 30);
            int iM5 = i3 + ((iM4 << 5) | (iM4 >>> 27)) + m(iM3, i13, i12) + this.i[i6 + 2] + 1859775393;
            i5 = (iM3 >>> 2) | (iM3 << 30);
            int i14 = i6 + 4;
            iM2 = i12 + ((iM5 << 5) | (iM5 >>> 27)) + m(iM4, i5, i13) + this.i[i6 + 3] + 1859775393;
            i4 = (iM4 >>> 2) | (iM4 << 30);
            i6 += 5;
            iM = i13 + ((iM2 << 5) | (iM2 >>> 27)) + m(iM5, i4, i5) + this.i[i14] + 1859775393;
            i3 = (iM5 >>> 2) | (iM5 << 30);
        }
        for (int i15 = 0; i15 < 4; i15++) {
            int iL = i5 + (((((iM << 5) | (iM >>> 27)) + l(iM2, i3, i4)) + this.i[i6]) - 1894007588);
            int i16 = (iM2 >>> 2) | (iM2 << 30);
            int iL2 = i4 + (((((iL << 5) | (iL >>> 27)) + l(iM, i16, i3)) + this.i[i6 + 1]) - 1894007588);
            int i17 = (iM >>> 2) | (iM << 30);
            int iL3 = i3 + (((((iL2 << 5) | (iL2 >>> 27)) + l(iL, i17, i16)) + this.i[i6 + 2]) - 1894007588);
            i5 = (iL >>> 2) | (iL << 30);
            int i18 = i6 + 4;
            iM2 = i16 + (((((iL3 << 5) | (iL3 >>> 27)) + l(iL2, i5, i17)) + this.i[i6 + 3]) - 1894007588);
            i4 = (iL2 >>> 2) | (iL2 << 30);
            i6 += 5;
            iM = i17 + (((((iM2 << 5) | (iM2 >>> 27)) + l(iL3, i4, i5)) + this.i[i18]) - 1894007588);
            i3 = (iL3 >>> 2) | (iL3 << 30);
        }
        for (int i19 = 0; i19 <= 3; i19++) {
            int iM6 = i5 + (((((iM << 5) | (iM >>> 27)) + m(iM2, i3, i4)) + this.i[i6]) - 899497514);
            int i20 = (iM2 >>> 2) | (iM2 << 30);
            int iM7 = i4 + (((((iM6 << 5) | (iM6 >>> 27)) + m(iM, i20, i3)) + this.i[i6 + 1]) - 899497514);
            int i21 = (iM >>> 2) | (iM << 30);
            int iM8 = i3 + (((((iM7 << 5) | (iM7 >>> 27)) + m(iM6, i21, i20)) + this.i[i6 + 2]) - 899497514);
            i5 = (iM6 >>> 2) | (iM6 << 30);
            int i22 = i6 + 4;
            iM2 = i20 + (((((iM8 << 5) | (iM8 >>> 27)) + m(iM7, i5, i21)) + this.i[i6 + 3]) - 899497514);
            i4 = (iM7 >>> 2) | (iM7 << 30);
            i6 += 5;
            iM = i21 + (((((iM2 << 5) | (iM2 >>> 27)) + m(iM8, i4, i5)) + this.i[i22]) - 899497514);
            i3 = (iM8 >>> 2) | (iM8 << 30);
        }
        this.d += iM;
        this.e += iM2;
        this.f += i3;
        this.g += i4;
        this.h += i5;
        this.j = 0;
        for (int i23 = 0; i23 < 16; i23++) {
            this.i[i23] = 0;
        }
    }

    @Override // defpackage.aw6
    public String getAlgorithmName() {
        return "SHA-1";
    }

    @Override // defpackage.nxa
    public void h(long j) {
        if (this.j > 14) {
            g();
        }
        int[] iArr = this.i;
        iArr[14] = (int) (j >>> 32);
        iArr[15] = (int) j;
    }

    @Override // defpackage.nxa
    public void i(byte[] bArr, int i) {
        int i2 = (bArr[i + 3] & 255) | (bArr[i] << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
        int[] iArr = this.i;
        int i3 = this.j;
        iArr[i3] = i2;
        int i4 = i3 + 1;
        this.j = i4;
        if (i4 == 16) {
            g();
        }
    }

    public final void j(f7l f7lVar) {
        this.d = f7lVar.d;
        this.e = f7lVar.e;
        this.f = f7lVar.f;
        this.g = f7lVar.g;
        this.h = f7lVar.h;
        int[] iArr = f7lVar.i;
        System.arraycopy(iArr, 0, this.i, 0, iArr.length);
        this.j = f7lVar.j;
    }

    public final int k(int i, int i2, int i3) {
        return ((~i) & i3) | (i2 & i);
    }

    public final int l(int i, int i2, int i3) {
        return (i & i3) | (i & i2) | (i2 & i3);
    }

    public final int m(int i, int i2, int i3) {
        return (i ^ i2) ^ i3;
    }

    @Override // defpackage.nxa, defpackage.aw6
    public void reset() {
        super.reset();
        this.d = 1732584193;
        this.e = -271733879;
        this.f = -1732584194;
        this.g = 271733878;
        this.h = -1009589776;
        this.j = 0;
        int i = 0;
        while (true) {
            int[] iArr = this.i;
            if (i == iArr.length) {
                return;
            }
            iArr[i] = 0;
            i++;
        }
    }

    public f7l(f7l f7lVar) {
        super(f7lVar);
        this.i = new int[80];
        j(f7lVar);
    }
}
