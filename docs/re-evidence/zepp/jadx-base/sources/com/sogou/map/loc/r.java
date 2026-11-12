package com.sogou.map.loc;

/* JADX INFO: loaded from: classes18.dex */
final class r extends i {
    private final p h;
    private final p i;

    public r(SGLocService sGLocService, k2 k2Var, long j, long j2) {
        super(sGLocService, k2Var, (byte) 0);
        r0.b("TwinRunner: " + j + ", " + j2);
        this.h = new p(this, sGLocService.f, j, (byte) 0);
        this.i = new p(this, sGLocService.g, j2, (byte) 0);
    }

    @Override // com.sogou.map.loc.i
    public final void b() {
        this.h.a();
        this.i.a();
    }

    @Override // com.sogou.map.loc.i
    public final void d() {
        this.h.e();
        this.i.e();
    }

    @Override // com.sogou.map.loc.i
    public final void f() {
        this.h.g();
        this.i.g();
    }

    @Override // com.sogou.map.loc.i
    public final void h() {
        if (!this.a.h() && this.h.e.g() && this.i.e.g()) {
            this.a.f(new SGLocation(2, "GPS:" + ((SGLocation) this.h.e.i()).e() + ";NET:" + ((SGLocation) this.i.e.i()).e()));
        }
    }

    @Override // com.sogou.map.loc.i
    public final void i() {
        if (this.h.e.g() && !this.i.e.g()) {
            this.a.f(new SGLocation(2, "GPS:" + ((SGLocation) this.h.e.i()).e() + ";NET:time out"));
        }
        if (!this.h.e.g() && this.i.e.g()) {
            this.a.f(new SGLocation(2, "GPS:time out;NET:" + ((SGLocation) this.i.e.i()).e()));
        }
        if (this.h.e.g() || this.i.e.g()) {
            return;
        }
        this.a.f(new SGLocation(3, "GPS:time out;NET:time out"));
    }
}
