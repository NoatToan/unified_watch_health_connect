package defpackage;

/* JADX INFO: loaded from: classes11.dex */
public class e0e implements nw3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f16123a;

    public e0e(byte[] bArr) {
        this(bArr, 0, bArr.length);
    }

    public byte[] a() {
        return this.f16123a;
    }

    public e0e(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        this.f16123a = bArr2;
        System.arraycopy(bArr, i, bArr2, 0, i2);
    }
}
