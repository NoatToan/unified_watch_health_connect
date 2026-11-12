package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class zrr extends cl1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wrr f41611b;
    public final byte[] c;
    public final byte[] d;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final wrr f41612a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public byte[] f41613b = null;
        public byte[] c = null;
        public byte[] d = null;

        public b(wrr wrrVar) {
            this.f41612a = wrrVar;
        }

        public zrr e() {
            return new zrr(this);
        }

        public b f(byte[] bArr) {
            this.c = fsr.c(bArr);
            return this;
        }

        public b g(byte[] bArr) {
            this.f41613b = fsr.c(bArr);
            return this;
        }
    }

    public zrr(b bVar) {
        super(false);
        wrr wrrVar = bVar.f41612a;
        this.f41611b = wrrVar;
        if (wrrVar == null) {
            throw new NullPointerException("params == null");
        }
        int iB = wrrVar.b();
        byte[] bArr = bVar.d;
        if (bArr != null) {
            if (bArr.length != iB + iB) {
                throw new IllegalArgumentException("public key has wrong size");
            }
            this.c = fsr.g(bArr, 0, iB);
            this.d = fsr.g(bArr, iB, iB);
            return;
        }
        byte[] bArr2 = bVar.f41613b;
        if (bArr2 == null) {
            this.c = new byte[iB];
        } else {
            if (bArr2.length != iB) {
                throw new IllegalArgumentException("length of root must be equal to length of digest");
            }
            this.c = bArr2;
        }
        byte[] bArr3 = bVar.c;
        if (bArr3 == null) {
            this.d = new byte[iB];
        } else {
            if (bArr3.length != iB) {
                throw new IllegalArgumentException("length of publicSeed must be equal to length of digest");
            }
            this.d = bArr3;
        }
    }

    public wrr b() {
        return this.f41611b;
    }

    public byte[] c() {
        return fsr.c(this.d);
    }

    public byte[] d() {
        return fsr.c(this.c);
    }

    public byte[] e() {
        int iB = this.f41611b.b();
        byte[] bArr = new byte[iB + iB];
        fsr.e(bArr, this.c, 0);
        fsr.e(bArr, this.d, iB);
        return bArr;
    }
}
