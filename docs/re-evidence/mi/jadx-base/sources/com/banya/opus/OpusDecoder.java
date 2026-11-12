package com.banya.opus;

/* JADX INFO: loaded from: classes4.dex */
public class OpusDecoder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6923a = "OpusDecoder";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6924b;
    public final int c;
    public final int d;
    public final int e;

    static {
        System.loadLibrary("jni_byopus");
    }

    public OpusDecoder(int i, int i2, int i3, int i4) {
        this.f6924b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }

    private native int createDecoder(int i, int i2);

    private native int decode(int i, byte[] bArr, int i2, int i3, byte[] bArr2, int i4);

    private native void destroyDecoder(int i);

    public int a() {
        return createDecoder(this.f6924b, this.c);
    }

    public byte[] b(int i, byte[] bArr, int i2) {
        int i3 = this.e;
        if (i2 % i3 != 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("input data len must be a multiple of ");
            sb.append(this.e);
            return null;
        }
        int i4 = this.d;
        byte[] bArr2 = new byte[(i2 * i4) / i3];
        byte[] bArr3 = new byte[i3];
        byte[] bArr4 = new byte[i4];
        int i5 = (i4 / 2) / this.c;
        int i6 = 0;
        while (true) {
            int i7 = this.e;
            if (i6 >= i2 / i7) {
                return bArr2;
            }
            System.arraycopy(bArr, i6 * i7, bArr3, 0, i7);
            if (decode(i, bArr3, this.e, i5, bArr4, this.d) != 0) {
                return null;
            }
            int i8 = this.d;
            System.arraycopy(bArr4, 0, bArr2, i6 * i8, i8);
            i6++;
        }
    }

    public void c(int i) {
        destroyDecoder(i);
    }
}
