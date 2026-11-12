package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class p7d implements arl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long[] f30083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f30084b;
    public final long c;
    public final boolean d;

    public p7d(long[] jArr, long[] jArr2, long j) {
        rk1.a(jArr.length == jArr2.length);
        int length = jArr2.length;
        boolean z = length > 0;
        this.d = z;
        if (!z || jArr2[0] <= 0) {
            this.f30083a = jArr;
            this.f30084b = jArr2;
        } else {
            int i = length + 1;
            long[] jArr3 = new long[i];
            this.f30083a = jArr3;
            long[] jArr4 = new long[i];
            this.f30084b = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length);
            System.arraycopy(jArr2, 0, jArr4, 1, length);
        }
        this.c = j;
    }

    @Override // defpackage.arl
    public arl.a d(long j) {
        if (!this.d) {
            return new arl.a(crl.c);
        }
        int i = wlq.i(this.f30084b, j, true, true);
        crl crlVar = new crl(this.f30084b[i], this.f30083a[i]);
        if (crlVar.f14648a == j || i == this.f30084b.length - 1) {
            return new arl.a(crlVar);
        }
        int i2 = i + 1;
        return new arl.a(crlVar, new crl(this.f30084b[i2], this.f30083a[i2]));
    }

    @Override // defpackage.arl
    public boolean e() {
        return this.d;
    }

    @Override // defpackage.arl
    public long i() {
        return this.c;
    }
}
