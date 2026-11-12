package bk;

/* JADX INFO: loaded from: classes7.dex */
public class e extends k {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final l f18408d = l.BURST_TRANSFER_DATA;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f18409c;

    public e(byte[] bArr) {
        super(bArr);
        this.f18409c = (this.f18402a[0] & 224) >> 5;
    }

    @Override // bk.b
    public final l h() {
        return f18408d;
    }

    @Override // bk.k, bk.b, ak.a
    public final String toString() {
        StringBuilder sb3 = new StringBuilder(super.toString());
        sb3.append("\n  Sequence=");
        int i14 = this.f18409c;
        sb3.append(ak.k.a(i14));
        if (i14 == 0) {
            sb3.append(" (FIRST)");
        }
        if (ak.k.d(4, i14)) {
            sb3.append(" (LAST)");
        }
        return sb3.toString();
    }

    public e(dk.a aVar) {
        this(b.g(f18408d, aVar));
    }
}
