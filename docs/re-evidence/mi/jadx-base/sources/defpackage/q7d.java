package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class q7d implements drl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f31200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rre f31201b;
    public final rre c;
    public long d;

    public q7d(long j, long j2, long j3) {
        this.d = j;
        this.f31200a = j3;
        rre rreVar = new rre();
        this.f31201b = rreVar;
        rre rreVar2 = new rre();
        this.c = rreVar2;
        rreVar.a(0L);
        rreVar2.a(j2);
    }

    public boolean a(long j) {
        rre rreVar = this.f31201b;
        return j - rreVar.b(rreVar.c() - 1) < 100000;
    }

    public void b(long j, long j2) {
        if (a(j)) {
            return;
        }
        this.f31201b.a(j);
        this.c.a(j2);
    }

    @Override // defpackage.drl
    public long c(long j) {
        return this.f31201b.b(wlq.f(this.c, j, true, true));
    }

    @Override // defpackage.arl
    public arl.a d(long j) {
        int iF = wlq.f(this.f31201b, j, true, true);
        crl crlVar = new crl(this.f31201b.b(iF), this.c.b(iF));
        if (crlVar.f14648a == j || iF == this.f31201b.c() - 1) {
            return new arl.a(crlVar);
        }
        int i = iF + 1;
        return new arl.a(crlVar, new crl(this.f31201b.b(i), this.c.b(i)));
    }

    @Override // defpackage.arl
    public boolean e() {
        return true;
    }

    public void f(long j) {
        this.d = j;
    }

    @Override // defpackage.drl
    public long h() {
        return this.f31200a;
    }

    @Override // defpackage.arl
    public long i() {
        return this.d;
    }
}
