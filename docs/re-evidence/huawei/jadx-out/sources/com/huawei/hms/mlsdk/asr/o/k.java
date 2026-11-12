package com.huawei.hms.mlsdk.asr.o;

/* JADX INFO: loaded from: classes34.dex */
public final class k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f14421b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte[] f14420a = new byte[64];

    public final void a(int i) {
        int i2 = this.f14421b + 4;
        byte[] bArr = this.f14420a;
        int length = bArr.length;
        if (i2 > length) {
            int i3 = length << 1;
            if (i3 >= i2) {
                i2 = i3;
            }
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            this.f14420a = bArr2;
        }
        byte[] bArr3 = this.f14420a;
        int i4 = this.f14421b;
        bArr3[i4] = (byte) (i >>> 24);
        bArr3[i4 + 1] = (byte) (i >> 16);
        bArr3[i4 + 2] = (byte) (i >> 8);
        this.f14421b = i4 + 4;
        bArr3[i4 + 3] = (byte) i;
    }

    public final void a(long j) {
        int i = this.f14421b + 8;
        byte[] bArr = this.f14420a;
        int length = bArr.length;
        if (i > length) {
            int i2 = length << 1;
            if (i2 >= i) {
                i = i2;
            }
            byte[] bArr2 = new byte[i];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            this.f14420a = bArr2;
        }
        byte[] bArr3 = this.f14420a;
        int i3 = this.f14421b;
        bArr3[i3] = (byte) (j >>> 56);
        bArr3[i3 + 1] = (byte) (j >> 48);
        bArr3[i3 + 2] = (byte) (j >> 40);
        bArr3[i3 + 3] = (byte) (j >> 32);
        bArr3[i3 + 4] = (byte) (j >> 24);
        bArr3[i3 + 5] = (byte) (j >> 16);
        bArr3[i3 + 6] = (byte) (j >> 8);
        this.f14421b = i3 + 8;
        bArr3[i3 + 7] = (byte) j;
    }

    public final void a(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return;
        }
        int length = this.f14421b + bArr.length;
        byte[] bArr2 = this.f14420a;
        int length2 = bArr2.length;
        if (length > length2) {
            int i = length2 << 1;
            if (i >= length) {
                length = i;
            }
            byte[] bArr3 = new byte[length];
            System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
            this.f14420a = bArr3;
        }
        System.arraycopy(bArr, 0, this.f14420a, this.f14421b, bArr.length);
        this.f14421b += bArr.length;
    }

    public final byte[] a() {
        int i = this.f14421b;
        byte[] bArr = new byte[i];
        System.arraycopy(this.f14420a, 0, bArr, 0, i);
        return bArr;
    }
}
