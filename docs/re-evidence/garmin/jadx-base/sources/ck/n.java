package ck;

/* JADX INFO: loaded from: classes7.dex */
public final class n extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k f27811b = k.REQUEST_MESSAGE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bk.l f27812a;

    public n(byte[] bArr) {
        this(bk.l.a((int) ak.k.e(1, 1, bArr), null));
    }

    @Override // ck.b
    public final byte[] f() {
        byte[] bArr = new byte[2];
        ak.k.f(1, 0, 0, bArr);
        ak.k.g(this.f27812a.b(), 1, bArr);
        return bArr;
    }

    @Override // ck.b
    public final k g() {
        return f27811b;
    }

    @Override // ck.b, ak.a
    public final String toString() {
        return h() + "\n  Requested message=" + this.f27812a;
    }

    public n(bk.l lVar) {
        this.f27812a = lVar;
    }
}
