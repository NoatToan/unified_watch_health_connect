package ck;

/* JADX INFO: loaded from: classes7.dex */
public final class f extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k f27769b = k.CHANNEL_RF_FREQUENCY;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f27770a;

    public f(int i14) {
        if (ak.k.c(i14, 124)) {
            this.f27770a = i14;
        } else {
            vb.h.s("RF Frequency out of range");
            throw null;
        }
    }

    @Override // ck.b
    public final byte[] f() {
        byte[] bArr = new byte[2];
        ak.k.g(0, 0, bArr);
        ak.k.f(1, 1, this.f27770a, bArr);
        return bArr;
    }

    @Override // ck.b
    public final k g() {
        return f27769b;
    }

    @Override // ck.b, ak.a
    public final String toString() {
        StringBuilder sb3 = new StringBuilder(h());
        sb3.append("\n  RF frequency=");
        int i14 = this.f27770a;
        sb3.append(i14 + 2400);
        sb3.append("MHz (");
        sb3.append(i14);
        sb3.append(")");
        return sb3.toString();
    }

    public f(byte[] bArr) {
        this((int) ak.k.e(1, 1, bArr));
    }
}
