package defpackage;

import com.xiaomi.smarthome.plugin.update.PluginPackageConstant;

/* JADX INFO: loaded from: classes3.dex */
public class h7l extends nxa {
    public static final int[] n = {1116352408, 1899447441, -1245643825, -373957723, 961987163, 1508970993, -1841331548, -1424204075, -670586216, 310598401, 607225278, 1426881987, 1925078388, -2132889090, -1680079193, -1046744716, -459576895, -272742522, 264347078, 604807628, 770255983, 1249150122, 1555081692, 1996064986, -1740746414, -1473132947, -1341970488, -1084653625, -958395405, -710438585, 113926993, 338241895, 666307205, 773529912, 1294757372, 1396182291, 1695183700, 1986661051, -2117940946, -1838011259, -1564481375, -1474664885, -1035236496, -949202525, -778901479, -694614492, -200395387, 275423344, 430227734, 506948616, 659060556, 883997877, 958139571, 1322822218, 1537002063, 1747873779, 1955562222, 2024104815, -2067236844, -1933114872, -1866530822, -1538233109, -1090935817, -965641998};
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f19782k;
    public int[] l;
    public int m;

    public h7l() {
        this.l = new int[64];
        reset();
    }

    private int j(int i, int i2, int i3) {
        return ((~i) & i3) ^ (i2 & i);
    }

    private int k(int i, int i2, int i3) {
        return ((i & i3) ^ (i & i2)) ^ (i2 & i3);
    }

    private int l(int i) {
        return ((i << 10) | (i >>> 22)) ^ (((i >>> 2) | (i << 30)) ^ ((i >>> 13) | (i << 19)));
    }

    private int m(int i) {
        return ((i << 7) | (i >>> 25)) ^ (((i >>> 6) | (i << 26)) ^ ((i >>> 11) | (i << 21)));
    }

    private int n(int i) {
        return (i >>> 3) ^ (((i >>> 7) | (i << 25)) ^ ((i >>> 18) | (i << 14)));
    }

    private int o(int i) {
        return (i >>> 10) ^ (((i >>> 17) | (i << 15)) ^ ((i >>> 19) | (i << 13)));
    }

    @Override // defpackage.dpf
    public void a(dpf dpfVar) {
        p((h7l) dpfVar);
    }

    @Override // defpackage.aw6
    public int c() {
        return 32;
    }

    @Override // defpackage.dpf
    public dpf copy() {
        return new h7l(this);
    }

    @Override // defpackage.aw6
    public int doFinal(byte[] bArr, int i) {
        f();
        zgh.d(this.d, bArr, i);
        zgh.d(this.e, bArr, i + 4);
        zgh.d(this.f, bArr, i + 8);
        zgh.d(this.g, bArr, i + 12);
        zgh.d(this.h, bArr, i + 16);
        zgh.d(this.i, bArr, i + 20);
        zgh.d(this.j, bArr, i + 24);
        zgh.d(this.f19782k, bArr, i + 28);
        reset();
        return 32;
    }

    @Override // defpackage.nxa
    public void g() {
        for (int i = 16; i <= 63; i++) {
            int[] iArr = this.l;
            int iO = o(iArr[i - 2]);
            int[] iArr2 = this.l;
            iArr[i] = iO + iArr2[i - 7] + n(iArr2[i - 15]) + this.l[i - 16];
        }
        int iL = this.d;
        int iL2 = this.e;
        int iL3 = this.f;
        int iL4 = this.g;
        int i2 = this.h;
        int i3 = this.i;
        int i4 = this.j;
        int i5 = this.f19782k;
        int i6 = 0;
        for (int i7 = 0; i7 < 8; i7++) {
            int iM = m(i2) + j(i2, i3, i4);
            int[] iArr3 = n;
            int i8 = i5 + iM + iArr3[i6] + this.l[i6];
            int i9 = iL4 + i8;
            int iL5 = i8 + l(iL) + k(iL, iL2, iL3);
            int i10 = i6 + 1;
            int iM2 = i4 + m(i9) + j(i9, i2, i3) + iArr3[i10] + this.l[i10];
            int i11 = iL3 + iM2;
            int iL6 = iM2 + l(iL5) + k(iL5, iL, iL2);
            int i12 = i6 + 2;
            int iM3 = i3 + m(i11) + j(i11, i9, i2) + iArr3[i12] + this.l[i12];
            int i13 = iL2 + iM3;
            int iL7 = iM3 + l(iL6) + k(iL6, iL5, iL);
            int i14 = i6 + 3;
            int iM4 = i2 + m(i13) + j(i13, i11, i9) + iArr3[i14] + this.l[i14];
            int i15 = iL + iM4;
            int iL8 = iM4 + l(iL7) + k(iL7, iL6, iL5);
            int i16 = i6 + 4;
            int iM5 = i9 + m(i15) + j(i15, i13, i11) + iArr3[i16] + this.l[i16];
            i5 = iL5 + iM5;
            iL4 = iM5 + l(iL8) + k(iL8, iL7, iL6);
            int i17 = i6 + 5;
            int iM6 = i11 + m(i5) + j(i5, i15, i13) + iArr3[i17] + this.l[i17];
            i4 = iL6 + iM6;
            iL3 = iM6 + l(iL4) + k(iL4, iL8, iL7);
            int i18 = i6 + 6;
            int iM7 = i13 + m(i4) + j(i4, i5, i15) + iArr3[i18] + this.l[i18];
            i3 = iL7 + iM7;
            iL2 = iM7 + l(iL3) + k(iL3, iL4, iL8);
            int i19 = i6 + 7;
            int iM8 = i15 + m(i3) + j(i3, i4, i5) + iArr3[i19] + this.l[i19];
            i2 = iL8 + iM8;
            iL = iM8 + l(iL2) + k(iL2, iL3, iL4);
            i6 += 8;
        }
        this.d += iL;
        this.e += iL2;
        this.f += iL3;
        this.g += iL4;
        this.h += i2;
        this.i += i3;
        this.j += i4;
        this.f19782k += i5;
        this.m = 0;
        for (int i20 = 0; i20 < 16; i20++) {
            this.l[i20] = 0;
        }
    }

    @Override // defpackage.aw6
    public String getAlgorithmName() {
        return PluginPackageConstant.RN_BUNDLE_HASH_ALGORITHM;
    }

    @Override // defpackage.nxa
    public void h(long j) {
        if (this.m > 14) {
            g();
        }
        int[] iArr = this.l;
        iArr[14] = (int) (j >>> 32);
        iArr[15] = (int) j;
    }

    @Override // defpackage.nxa
    public void i(byte[] bArr, int i) {
        int i2 = (bArr[i + 3] & 255) | (bArr[i] << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
        int[] iArr = this.l;
        int i3 = this.m;
        iArr[i3] = i2;
        int i4 = i3 + 1;
        this.m = i4;
        if (i4 == 16) {
            g();
        }
    }

    public final void p(h7l h7lVar) {
        super.e(h7lVar);
        this.d = h7lVar.d;
        this.e = h7lVar.e;
        this.f = h7lVar.f;
        this.g = h7lVar.g;
        this.h = h7lVar.h;
        this.i = h7lVar.i;
        this.j = h7lVar.j;
        this.f19782k = h7lVar.f19782k;
        int[] iArr = h7lVar.l;
        System.arraycopy(iArr, 0, this.l, 0, iArr.length);
        this.m = h7lVar.m;
    }

    @Override // defpackage.nxa, defpackage.aw6
    public void reset() {
        super.reset();
        this.d = 1779033703;
        this.e = -1150833019;
        this.f = 1013904242;
        this.g = -1521486534;
        this.h = 1359893119;
        this.i = -1694144372;
        this.j = 528734635;
        this.f19782k = 1541459225;
        this.m = 0;
        int i = 0;
        while (true) {
            int[] iArr = this.l;
            if (i == iArr.length) {
                return;
            }
            iArr[i] = 0;
            i++;
        }
    }

    public h7l(h7l h7lVar) {
        super(h7lVar);
        this.l = new int[64];
        p(h7lVar);
    }
}
