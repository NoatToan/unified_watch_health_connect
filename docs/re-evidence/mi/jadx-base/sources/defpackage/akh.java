package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class akh implements lw3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f1132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public lw3 f1133b;

    public akh(lw3 lw3Var, byte[] bArr) {
        this(lw3Var, bArr, 0, bArr.length);
    }

    public byte[] a() {
        return this.f1132a;
    }

    public lw3 b() {
        return this.f1133b;
    }

    public akh(lw3 lw3Var, byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        this.f1132a = bArr2;
        this.f1133b = lw3Var;
        System.arraycopy(bArr, i, bArr2, 0, i2);
    }
}
