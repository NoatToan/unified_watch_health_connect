package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class a0i extends awe {
    public final byte[] c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;

    public a0i(byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, boolean z) {
        super(i5, i6);
        if (i3 + i5 > i || i4 + i6 > i2) {
            throw new IllegalArgumentException("Crop rectangle does not fit within image data.");
        }
        this.c = bArr;
        this.d = i;
        this.e = i2;
        this.f = i3;
        this.g = i4;
        if (z) {
            k(i5, i6);
        }
    }

    @Override // defpackage.awe
    public byte[] b() {
        int iD = d();
        int iA = a();
        int i = this.d;
        if (iD == i && iA == this.e) {
            return this.c;
        }
        int i2 = iD * iA;
        byte[] bArr = new byte[i2];
        int i3 = (this.g * i) + this.f;
        if (iD == i) {
            System.arraycopy(this.c, i3, bArr, 0, i2);
            return bArr;
        }
        for (int i4 = 0; i4 < iA; i4++) {
            System.arraycopy(this.c, i3, bArr, i4 * iD, iD);
            i3 += this.d;
        }
        return bArr;
    }

    @Override // defpackage.awe
    public byte[] c(int i, byte[] bArr) {
        if (i < 0 || i >= a()) {
            throw new IllegalArgumentException("Requested row is outside the image: ".concat(String.valueOf(i)));
        }
        int iD = d();
        if (bArr == null || bArr.length < iD) {
            bArr = new byte[iD];
        }
        System.arraycopy(this.c, ((i + this.g) * this.d) + this.f, bArr, 0, iD);
        return bArr;
    }

    public int h() {
        return a() / 2;
    }

    public int i() {
        return d() / 2;
    }

    public int[] j() {
        int iD = d() / 2;
        int iA = a() / 2;
        int[] iArr = new int[iD * iA];
        byte[] bArr = this.c;
        int i = (this.g * this.d) + this.f;
        for (int i2 = 0; i2 < iA; i2++) {
            int i3 = i2 * iD;
            for (int i4 = 0; i4 < iD; i4++) {
                iArr[i3 + i4] = ((bArr[(i4 << 1) + i] & 255) * 65793) | (-16777216);
            }
            i += this.d << 1;
        }
        return iArr;
    }

    public final void k(int i, int i2) {
        byte[] bArr = this.c;
        int i3 = (this.g * this.d) + this.f;
        int i4 = 0;
        while (i4 < i2) {
            int i5 = (i / 2) + i3;
            int i6 = (i3 + i) - 1;
            int i7 = i3;
            while (i7 < i5) {
                byte b2 = bArr[i7];
                bArr[i7] = bArr[i6];
                bArr[i6] = b2;
                i7++;
                i6--;
            }
            i4++;
            i3 += this.d;
        }
    }
}
