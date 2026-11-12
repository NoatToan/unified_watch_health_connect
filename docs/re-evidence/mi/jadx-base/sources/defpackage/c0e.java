package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class c0e implements lw3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f4789a;

    public c0e(byte[] bArr) {
        this(bArr, 0, bArr.length);
    }

    public byte[] a() {
        return this.f4789a;
    }

    public c0e(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        this.f4789a = bArr2;
        System.arraycopy(bArr, i, bArr2, 0, i2);
    }
}
