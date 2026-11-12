package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class esr extends cl1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bsr f17032b;
    public final byte[] c;
    public final byte[] d;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final bsr f17033a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public byte[] f17034b = null;
        public byte[] c = null;
        public byte[] d = null;

        public b(bsr bsrVar) {
            this.f17033a = bsrVar;
        }

        public esr e() {
            return new esr(this);
        }

        public b f(byte[] bArr) {
            this.c = fsr.c(bArr);
            return this;
        }

        public b g(byte[] bArr) {
            this.f17034b = fsr.c(bArr);
            return this;
        }
    }

    public esr(b bVar) {
        super(false);
        bsr bsrVar = bVar.f17033a;
        this.f17032b = bsrVar;
        if (bsrVar == null) {
            throw new NullPointerException("params == null");
        }
        int iC = bsrVar.c();
        byte[] bArr = bVar.d;
        if (bArr != null) {
            if (bArr.length != iC + iC) {
                throw new IllegalArgumentException("public key has wrong size");
            }
            this.c = fsr.g(bArr, 0, iC);
            this.d = fsr.g(bArr, iC, iC);
            return;
        }
        byte[] bArr2 = bVar.f17034b;
        if (bArr2 == null) {
            this.c = new byte[iC];
        } else {
            if (bArr2.length != iC) {
                throw new IllegalArgumentException("length of root must be equal to length of digest");
            }
            this.c = bArr2;
        }
        byte[] bArr3 = bVar.c;
        if (bArr3 == null) {
            this.d = new byte[iC];
        } else {
            if (bArr3.length != iC) {
                throw new IllegalArgumentException("length of publicSeed must be equal to length of digest");
            }
            this.d = bArr3;
        }
    }

    public bsr b() {
        return this.f17032b;
    }

    public byte[] c() {
        return fsr.c(this.d);
    }

    public byte[] d() {
        return fsr.c(this.c);
    }

    public byte[] e() {
        int iC = this.f17032b.c();
        byte[] bArr = new byte[iC + iC];
        fsr.e(bArr, this.c, 0);
        fsr.e(bArr, this.d, iC);
        return bArr;
    }
}
