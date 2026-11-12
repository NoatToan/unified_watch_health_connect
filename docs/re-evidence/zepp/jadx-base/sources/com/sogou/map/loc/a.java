package com.sogou.map.loc;

/* JADX INFO: loaded from: classes18.dex */
final class a extends i {
    private final p h;

    public a(SGLocService sGLocService, k2 k2Var, boolean z) {
        super(sGLocService, k2Var, (byte) 0);
        StringBuilder sb = new StringBuilder("AloneRunner: ");
        sb.append(z ? "GPS" : "NET");
        r0.b(sb.toString());
        this.h = new p(this, z ? sGLocService.f : sGLocService.g, 0L, (byte) 0);
    }

    @Override // com.sogou.map.loc.i
    public final void b() {
        this.h.a();
    }

    @Override // com.sogou.map.loc.i
    public final void d() {
        this.h.e();
    }

    @Override // com.sogou.map.loc.i
    public final void f() {
        this.h.g();
    }

    @Override // com.sogou.map.loc.i
    public final void h() {
        if (this.h.e.g()) {
            this.a.f((SGLocation) this.h.e.i());
        }
    }

    @Override // com.sogou.map.loc.i
    public final void i() {
        this.a.f(new SGLocation(3, "time out"));
    }
}
