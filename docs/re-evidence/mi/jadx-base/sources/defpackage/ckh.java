package defpackage;

/* JADX INFO: loaded from: classes11.dex */
public class ckh implements nw3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f5427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public nw3 f5428b;

    public ckh(nw3 nw3Var, byte[] bArr) {
        this(nw3Var, bArr, 0, bArr.length);
    }

    public byte[] a() {
        return this.f5427a;
    }

    public nw3 b() {
        return this.f5428b;
    }

    public ckh(nw3 nw3Var, byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        this.f5427a = bArr2;
        this.f5428b = nw3Var;
        System.arraycopy(bArr, i, bArr2, 0, i2);
    }
}
