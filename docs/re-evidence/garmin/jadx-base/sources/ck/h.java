package ck;

/* JADX INFO: loaded from: classes7.dex */
public final class h extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final k f27772c = k.CONFIG_ID_LIST;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f27773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f27774b;

    public h(int i14, boolean z14) {
        if (i14 < 0 || i14 > 4) {
            vb.h.s("List Index out of range");
            throw null;
        }
        this.f27773a = i14;
        this.f27774b = z14;
    }

    @Override // ck.b
    public final byte[] f() {
        byte[] bArr = {0, 0, this.f27774b ? (byte) 1 : (byte) 0};
        ak.k.g(0, 0, bArr);
        ak.k.f(1, 1, this.f27773a, bArr);
        return bArr;
    }

    @Override // ck.b
    public final k g() {
        return f27772c;
    }

    @Override // ck.b, ak.a
    public final String toString() {
        StringBuilder sb3 = new StringBuilder(h());
        sb3.append("\n  Size=");
        sb3.append(this.f27773a);
        sb3.append("\n  ");
        if (this.f27774b) {
            sb3.append("Exclude");
        } else {
            sb3.append("Include");
        }
        return sb3.toString();
    }

    public h(byte[] bArr) {
        this((int) ak.k.e(1, 1, bArr), ((int) ak.k.e(2, 1, bArr)) == 1);
    }
}
