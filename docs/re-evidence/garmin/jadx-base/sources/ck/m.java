package ck;

/* JADX INFO: loaded from: classes7.dex */
public final class m extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k f27809b = k.PROXIMITY_SEARCH;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f27810a;

    public m(int i14) {
        if (ak.k.c(i14, 10)) {
            this.f27810a = i14;
        } else {
            vb.h.s("Search threshold outside valid range");
            throw null;
        }
    }

    @Override // ck.b
    public final byte[] f() {
        byte[] bArr = new byte[5];
        ak.k.f(1, 0, 0, bArr);
        ak.k.g(this.f27810a, 1, bArr);
        return bArr;
    }

    @Override // ck.b
    public final k g() {
        return f27809b;
    }

    @Override // ck.b, ak.a
    public final String toString() {
        StringBuilder sb3 = new StringBuilder(h());
        sb3.append("\n  Search threshold bin=");
        int i14 = this.f27810a;
        if (i14 == 0) {
            sb3.append("[Proximity search disabled]");
        } else {
            sb3.append(i14);
        }
        return sb3.toString();
    }

    public m(byte[] bArr) {
        this((int) ak.k.e(1, 1, bArr));
    }
}
