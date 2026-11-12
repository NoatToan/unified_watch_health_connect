package ck;

/* JADX INFO: loaded from: classes7.dex */
public final class d extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k f27765b = k.CHANNEL_ID;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ak.b f27766a;

    public d(byte[] bArr) {
        this.f27766a = new ak.b(bArr, 1);
    }

    @Override // ck.b
    public final byte[] f() {
        byte[] bArr = new byte[5];
        ak.k.g(0, 0, bArr);
        System.arraycopy(this.f27766a.a(), 0, bArr, 1, 4);
        return bArr;
    }

    @Override // ck.b
    public final k g() {
        return f27765b;
    }

    @Override // ck.b, ak.a
    public final String toString() {
        return h() + "\n  " + this.f27766a.toString();
    }

    public d(ak.b bVar) {
        this.f27766a = bVar;
    }
}
