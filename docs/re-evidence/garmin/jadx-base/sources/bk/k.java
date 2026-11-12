package bk;

/* JADX INFO: loaded from: classes7.dex */
public abstract class k extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f18450b;

    public k(byte[] bArr) {
        super(bArr);
        this.f18450b = null;
    }

    public final byte[] j() {
        if (this.f18450b == null) {
            byte[] bArr = new byte[8];
            this.f18450b = bArr;
            System.arraycopy(this.f18402a, 1, bArr, 0, 8);
        }
        return this.f18450b;
    }

    @Override // bk.b, ak.a
    public String toString() {
        StringBuilder sb3 = new StringBuilder(i());
        sb3.append("\n  Payload=");
        sb3.append(ak.k.b(j()));
        if (ak.g.a(this)) {
            sb3.append("\n  ");
            sb3.append(new ak.g(this).toString());
        }
        return sb3.toString();
    }
}
