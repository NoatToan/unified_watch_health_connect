package ck;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final k f27759c = k.ADD_CHANNEL_ID_TO_LIST;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ak.b f27760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f27761b;

    public a(ak.b bVar, int i14) {
        if (i14 < 0 || i14 > 124) {
            vb.h.s("List Index out of range");
            throw null;
        }
        this.f27760a = bVar;
        this.f27761b = i14;
    }

    @Override // ck.b
    public final byte[] f() {
        byte[] bArr = new byte[6];
        ak.k.g(0, 0, bArr);
        System.arraycopy(this.f27760a.a(), 0, bArr, 1, 4);
        ak.k.f(1, 5, this.f27761b, bArr);
        return bArr;
    }

    @Override // ck.b
    public final k g() {
        return f27759c;
    }

    @Override // ck.b, ak.a
    public final String toString() {
        return h() + "\n  " + this.f27760a.toString() + "\n  List Index=" + this.f27761b;
    }

    public a(byte[] bArr) {
        this(new ak.b(bArr, 1), (int) ak.k.e(5, 1, bArr));
    }
}
