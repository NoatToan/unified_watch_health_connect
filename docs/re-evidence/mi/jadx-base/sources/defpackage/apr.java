package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class apr extends jgj {
    public apr(r63<? extends r63<?>> r63Var) {
        super(r63Var);
    }

    public static final apr C(int i) {
        r63 a4bVar;
        if (i > 0) {
            a4bVar = new epf(i);
            a4bVar.l(i);
        } else {
            a4bVar = new a4b();
        }
        return new apr(a4bVar);
    }

    public static final apr D(byte[] bArr) {
        return new apr(new epf(bArr));
    }

    @Override // defpackage.jgj
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public apr z(int i) {
        if (i < 0 || i > f()) {
            throw new IndexOutOfBoundsException("Attempt to bind data outside of its limits.");
        }
        return new apr(this, i);
    }

    @Override // defpackage.jgj
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public apr A(int i, int i2) {
        if (i < 0 || i2 < 0 || i > Integer.MAX_VALUE - i2 || i + i2 > f()) {
            throw new IndexOutOfBoundsException("Attempt to bind data outside of its limits.");
        }
        return new apr(this, i, i2);
    }

    public int G(int i, byte b2) {
        this.f9792a.k(c(i), b2);
        return 1;
    }

    public int H(int i, byte[] bArr) {
        return I(i, bArr, 0, bArr.length);
    }

    public int I(int i, byte[] bArr, int i2, int i3) {
        return this.f9792a.j(c(i), bArr, i2, b(i, i3));
    }

    public int J(int i, int i2) {
        return K(i, i2);
    }

    public int K(int i, long j) {
        return O(i, j);
    }

    public int L(int i, int i2) {
        return M(i, i2, (byte) 0);
    }

    public int M(int i, int i2, byte b2) {
        for (int i3 = 0; i3 < i2; i3++) {
            this.f9792a.k(i + i3, b2);
        }
        return i2;
    }

    public int N(int i, int i2) {
        return Q(i, i2);
    }

    public int O(int i, long j) {
        G(i, (byte) ((j >> 24) & 255));
        G(i + 1, (byte) ((j >> 16) & 255));
        G(i + 2, (byte) ((j >> 8) & 255));
        G(i + 3, (byte) (j & 255));
        return 4;
    }

    public int P(int i, long j) {
        this.f9792a.k(i, (byte) (j & 255));
        this.f9792a.k(i + 1, (byte) ((j >> 8) & 255));
        this.f9792a.k(i + 2, (byte) ((j >> 16) & 255));
        this.f9792a.k(i + 3, (byte) ((j >> 24) & 255));
        return 4;
    }

    public int Q(int i, int i2) {
        G(i, (byte) ((i2 >> 8) & 255));
        G(i + 1, (byte) (i2 & 255));
        return 2;
    }

    public int R(int i, int i2) {
        this.f9792a.k(i, (byte) (i2 & 255));
        this.f9792a.k(i + 1, (byte) ((i2 >> 8) & 255));
        return 2;
    }

    public apr(apr aprVar, int i) {
        super(aprVar, i);
    }

    public apr(apr aprVar, int i, int i2) {
        super(aprVar, i, i2);
    }
}
