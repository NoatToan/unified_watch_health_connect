package ck;

/* JADX INFO: loaded from: classes7.dex */
public final class e extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k f27767b = k.CHANNEL_PERIOD;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f27768a;

    public e(byte[] bArr) {
        this.f27768a = (int) ak.k.e(1, 2, bArr);
    }

    @Override // ck.b
    public final byte[] f() {
        byte[] bArr = new byte[3];
        ak.k.g(0, 0, bArr);
        ak.k.f(2, 1, this.f27768a, bArr);
        return bArr;
    }

    @Override // ck.b
    public final k g() {
        return f27767b;
    }

    @Override // ck.b, ak.a
    public final String toString() {
        StringBuilder sb3 = new StringBuilder(h());
        sb3.append("\n  Channel period=");
        int i14 = this.f27768a;
        sb3.append(32768.0d / ((double) i14));
        sb3.append("Hz (");
        sb3.append(i14);
        sb3.append(")");
        return sb3.toString();
    }

    public e(int i14) {
        this.f27768a = i14;
    }
}
