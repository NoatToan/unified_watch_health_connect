package com.sogou.map.loc;

/* JADX INFO: loaded from: classes18.dex */
final class h extends f {
    private g2 f;
    private /* synthetic */ SGLocService g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(SGLocService sGLocService, boolean z) {
        super(sGLocService, false);
        this.g = sGLocService;
        this.f = null;
    }

    @Override // com.sogou.map.loc.f
    public final void b() {
        try {
            r0.b("开始Net定位");
            this.g.e.k();
            d2 d2Var = this.g.e;
            d2Var.getClass();
            this.f = new g2(d2Var, this.a);
            this.g.b.a().execute(this.f);
        } catch (Throwable unused) {
        }
    }

    @Override // com.sogou.map.loc.f
    public final void d() {
        try {
            r0.b("取消Net定位");
            this.g.e.n();
            g2 g2Var = this.f;
            if (g2Var != null) {
                g2Var.a();
            }
        } catch (Throwable unused) {
        }
    }
}
