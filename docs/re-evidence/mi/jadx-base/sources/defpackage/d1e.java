package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class d1e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final aw6 f14956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14957b;

    public d1e(aw6 aw6Var, int i) {
        if (aw6Var == null) {
            throw new NullPointerException("digest == null");
        }
        this.f14956a = aw6Var;
        this.f14957b = i;
    }

    public byte[] a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i = this.f14957b;
        if (length != i) {
            throw new IllegalArgumentException("wrong key length");
        }
        if (bArr2.length == i) {
            return d(0, bArr, bArr2);
        }
        throw new IllegalArgumentException("wrong in length");
    }

    public byte[] b(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i = this.f14957b;
        if (length != i) {
            throw new IllegalArgumentException("wrong key length");
        }
        if (bArr2.length == i * 2) {
            return d(1, bArr, bArr2);
        }
        throw new IllegalArgumentException("wrong in length");
    }

    public byte[] c(byte[] bArr, byte[] bArr2) {
        if (bArr.length != this.f14957b) {
            throw new IllegalArgumentException("wrong key length");
        }
        if (bArr2.length == 32) {
            return d(3, bArr, bArr2);
        }
        throw new IllegalArgumentException("wrong address length");
    }

    public final byte[] d(int i, byte[] bArr, byte[] bArr2) {
        byte[] bArrP = fsr.p(i, this.f14957b);
        this.f14956a.update(bArrP, 0, bArrP.length);
        this.f14956a.update(bArr, 0, bArr.length);
        this.f14956a.update(bArr2, 0, bArr2.length);
        int i2 = this.f14957b;
        byte[] bArr3 = new byte[i2];
        aw6 aw6Var = this.f14956a;
        if (aw6Var instanceof qtr) {
            ((qtr) aw6Var).b(bArr3, 0, i2);
        } else {
            aw6Var.doFinal(bArr3, 0);
        }
        return bArr3;
    }
}
