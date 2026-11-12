package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class ndb implements v7l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f27809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f27810b;
    public long c;
    public ac8 d;
    public zye e;
    public int f;

    public ndb(zye zyeVar, int i, ac8 ac8Var, byte[] bArr, byte[] bArr2) {
        if (i > imq.b(zyeVar)) {
            throw new IllegalArgumentException("Requested security strength is not supported by the derivation function");
        }
        if (ac8Var.b() < i) {
            throw new IllegalArgumentException("Not enough entropy for security strength required");
        }
        this.f = i;
        this.d = ac8Var;
        this.e = zyeVar;
        byte[] bArrK = vj1.k(c(), bArr2, bArr);
        byte[] bArr3 = new byte[zyeVar.getMacSize()];
        this.f27809a = bArr3;
        byte[] bArr4 = new byte[bArr3.length];
        this.f27810b = bArr4;
        vj1.o(bArr4, (byte) 1);
        d(bArrK);
        this.c = 1L;
    }

    @Override // defpackage.v7l
    public int a(byte[] bArr, byte[] bArr2, boolean z) {
        int length = bArr.length * 8;
        if (length > 262144) {
            throw new IllegalArgumentException("Number of bits per request limited to 262144");
        }
        if (this.c > 140737488355328L) {
            return -1;
        }
        if (z) {
            b(bArr2);
            bArr2 = null;
        }
        if (bArr2 != null) {
            d(bArr2);
        }
        int length2 = bArr.length;
        byte[] bArr3 = new byte[length2];
        int length3 = bArr.length / this.f27810b.length;
        this.e.a(new c0e(this.f27809a));
        for (int i = 0; i < length3; i++) {
            zye zyeVar = this.e;
            byte[] bArr4 = this.f27810b;
            zyeVar.update(bArr4, 0, bArr4.length);
            this.e.doFinal(this.f27810b, 0);
            byte[] bArr5 = this.f27810b;
            System.arraycopy(bArr5, 0, bArr3, bArr5.length * i, bArr5.length);
        }
        byte[] bArr6 = this.f27810b;
        if (bArr6.length * length3 < length2) {
            this.e.update(bArr6, 0, bArr6.length);
            this.e.doFinal(this.f27810b, 0);
            byte[] bArr7 = this.f27810b;
            System.arraycopy(bArr7, 0, bArr3, bArr7.length * length3, length2 - (length3 * bArr7.length));
        }
        d(bArr2);
        this.c++;
        System.arraycopy(bArr3, 0, bArr, 0, bArr.length);
        return length;
    }

    @Override // defpackage.v7l
    public void b(byte[] bArr) {
        d(vj1.j(c(), bArr));
        this.c = 1L;
    }

    public final byte[] c() {
        byte[] bArrA = this.d.a();
        if (bArrA.length >= (this.f + 7) / 8) {
            return bArrA;
        }
        throw new IllegalStateException("Insufficient entropy provided by entropy source");
    }

    public final void d(byte[] bArr) {
        e(bArr, (byte) 0);
        if (bArr != null) {
            e(bArr, (byte) 1);
        }
    }

    public final void e(byte[] bArr, byte b2) {
        this.e.a(new c0e(this.f27809a));
        zye zyeVar = this.e;
        byte[] bArr2 = this.f27810b;
        zyeVar.update(bArr2, 0, bArr2.length);
        this.e.update(b2);
        if (bArr != null) {
            this.e.update(bArr, 0, bArr.length);
        }
        this.e.doFinal(this.f27809a, 0);
        this.e.a(new c0e(this.f27809a));
        zye zyeVar2 = this.e;
        byte[] bArr3 = this.f27810b;
        zyeVar2.update(bArr3, 0, bArr3.length);
        this.e.doFinal(this.f27810b, 0);
    }
}
