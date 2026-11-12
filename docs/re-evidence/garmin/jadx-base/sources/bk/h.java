package bk;

/* JADX INFO: loaded from: classes7.dex */
public class h extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l f18441c = l.CHANNEL_ID;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ak.b f18442b;

    public h(byte[] bArr) {
        super(bArr);
        this.f18442b = new ak.b(bArr, 1);
    }

    @Override // bk.b
    public final l h() {
        return f18441c;
    }

    @Override // bk.b, ak.a
    public final String toString() {
        return i() + "\n  " + this.f18442b.toString();
    }

    public h(dk.a aVar) {
        this(b.g(f18441c, aVar));
    }
}
