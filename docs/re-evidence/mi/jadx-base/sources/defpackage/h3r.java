package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class h3r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[][] f19661a;

    public h3r(g3r g3rVar, byte[][] bArr) {
        if (g3rVar == null) {
            throw new NullPointerException("params == null");
        }
        if (bArr == null) {
            throw new NullPointerException("publicKey == null");
        }
        if (fsr.k(bArr)) {
            throw new NullPointerException("publicKey byte array == null");
        }
        if (bArr.length != g3rVar.c()) {
            throw new IllegalArgumentException("wrong publicKey size");
        }
        for (byte[] bArr2 : bArr) {
            if (bArr2.length != g3rVar.b()) {
                throw new IllegalArgumentException("wrong publicKey format");
            }
        }
        this.f19661a = fsr.d(bArr);
    }

    public byte[][] a() {
        return fsr.d(this.f19661a);
    }
}
