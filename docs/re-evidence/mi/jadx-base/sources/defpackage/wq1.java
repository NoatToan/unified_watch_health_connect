package defpackage;

/* JADX INFO: loaded from: classes11.dex */
public final class wq1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f38242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f38243b;

    public wq1(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            throw new IllegalArgumentException("The cipher text must not be null");
        }
        this.f38242a = bArr;
        if (bArr2 == null) {
            throw new IllegalArgumentException("The authentication tag must not be null");
        }
        this.f38243b = bArr2;
    }

    public byte[] a() {
        byte[] bArr = this.f38242a;
        byte[] bArr2 = new byte[bArr.length + this.f38243b.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        byte[] bArr3 = this.f38243b;
        System.arraycopy(bArr3, 0, bArr2, this.f38242a.length, bArr3.length);
        return bArr2;
    }
}
