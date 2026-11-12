package bk;

/* JADX INFO: loaded from: classes7.dex */
public class m extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l f18464c = l.SERIAL_NUMBER;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f18465b;

    public m(byte[] bArr) {
        super(bArr);
        this.f18465b = ak.k.e(0, 4, bArr);
    }

    @Override // bk.b
    public final l h() {
        return f18464c;
    }

    @Override // bk.b, ak.a
    public final String toString() {
        return i() + "\n  Serial number=" + this.f18465b;
    }

    public m(dk.a aVar) {
        this(b.g(f18464c, aVar));
    }
}
