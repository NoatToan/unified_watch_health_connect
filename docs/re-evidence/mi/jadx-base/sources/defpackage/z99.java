package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class z99 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f41042b;
    public byte[] d;
    public int e;
    public int f;
    public final int g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[][] f41041a = new byte[16][];
    public int c = -1;

    public z99(int i) {
        this.g = Math.abs(i);
    }

    public z99 a(byte b2) {
        byte[] bArr = this.d;
        if (bArr == null || this.e == bArr.length) {
            c(this.f + 1);
        }
        byte[] bArr2 = this.d;
        int i = this.e;
        bArr2[i] = b2;
        this.e = i + 1;
        this.f++;
        return this;
    }

    public z99 b(byte[] bArr, int i, int i2) {
        int i3 = i + i2;
        if (i < 0 || i2 < 0 || i3 > bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        if (i2 == 0) {
            return this;
        }
        int i4 = this.f + i2;
        byte[] bArr2 = this.d;
        if (bArr2 != null) {
            int iMin = Math.min(i2, bArr2.length - this.e);
            System.arraycopy(bArr, i3 - i2, this.d, this.e, iMin);
            i2 -= iMin;
            this.e += iMin;
            this.f += iMin;
        }
        if (i2 > 0) {
            c(i4);
            int iMin2 = Math.min(i2, this.d.length - this.e);
            System.arraycopy(bArr, i3 - i2, this.d, this.e, iMin2);
            this.e += iMin2;
            this.f += iMin2;
        }
        return this;
    }

    public final void c(int i) {
        int iMax = Math.max(this.g, i - this.f);
        int i2 = this.c + 1;
        this.c = i2;
        this.d = new byte[iMax];
        this.e = 0;
        byte[][] bArr = this.f41041a;
        if (i2 >= bArr.length) {
            byte[][] bArr2 = new byte[bArr.length << 1][];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            this.f41041a = bArr2;
        }
        this.f41041a[this.c] = this.d;
        this.f41042b++;
    }

    public byte[] d() {
        byte[] bArr = new byte[this.f];
        if (this.c == -1) {
            return bArr;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = this.c;
            if (i >= i3) {
                System.arraycopy(this.f41041a[i3], 0, bArr, i2, this.e);
                return bArr;
            }
            byte[] bArr2 = this.f41041a[i];
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i2, length);
            i2 += length;
            i++;
        }
    }
}
