package com.huawei.hms.scankit.p;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes34.dex */
public final class m6 extends p4 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f16217c;
    private final int d;
    private final int e;
    private final int f;
    private final int g;

    public m6(int i, int i2, ByteBuffer byteBuffer) {
        super(i, i2);
        this.d = i;
        this.e = i2;
        this.f = 0;
        this.g = 0;
        byte[] bArrArray = byteBuffer.array();
        int i3 = i * i2;
        this.f16217c = new byte[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = i4 * 4;
            if ((bArrArray[i5 + 3] & 255) == 0) {
                this.f16217c[i4] = -1;
            } else {
                this.f16217c[i4] = (byte) ((((((bArrArray[i5] & 255) * 306) + ((bArrArray[i5 + 1] & 255) * 601)) + ((bArrArray[i5 + 2] & 255) * 117)) + 512) >> 10);
            }
        }
    }

    @Override // com.huawei.hms.scankit.p.p4
    public byte[] a(int i, byte[] bArr) {
        if (i >= 0 && i < a()) {
            int iC = c();
            if (bArr == null || bArr.length < iC) {
                bArr = new byte[iC];
            }
            int i2 = this.g;
            System.arraycopy(this.f16217c, ((i + i2) * this.d) + this.f, bArr, 0, iC);
            return bArr;
        }
        throw new IllegalArgumentException("Requested row is outside the image: " + i);
    }

    @Override // com.huawei.hms.scankit.p.p4
    public p4 a(int i, int i2, int i3, int i4) {
        return new m6(this.f16217c, this.d, this.e, this.f + i, this.g + i2, i3, i4);
    }

    @Override // com.huawei.hms.scankit.p.p4
    public byte[] b() {
        int iC = c();
        int iA = a();
        int i = this.d;
        if (iC == i && iA == this.e) {
            return this.f16217c;
        }
        int i2 = iC * iA;
        byte[] bArr = new byte[i2];
        int i3 = (this.g * i) + this.f;
        if (iC == i) {
            System.arraycopy(this.f16217c, i3, bArr, 0, i2);
            return bArr;
        }
        for (int i4 = 0; i4 < iA; i4++) {
            System.arraycopy(this.f16217c, i3, bArr, i4 * iC, iC);
            i3 += this.d;
        }
        return bArr;
    }

    private m6(byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6) {
        super(i5, i6);
        if (i5 + i3 <= i && i6 + i4 <= i2) {
            this.f16217c = bArr;
            this.d = i;
            this.e = i2;
            this.f = i3;
            this.g = i4;
            return;
        }
        throw new IllegalArgumentException("Crop rectangle does not fit within image data.");
    }
}
