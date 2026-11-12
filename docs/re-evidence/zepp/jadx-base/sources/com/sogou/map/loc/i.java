package com.sogou.map.loc;

/* JADX INFO: loaded from: classes18.dex */
abstract class i {
    public final k2 a;
    private Runnable b;
    private Runnable c;
    private u d;
    private u e;
    private u f;
    public final /* synthetic */ SGLocService g;

    private i(SGLocService sGLocService, k2 k2Var) {
        this.g = sGLocService;
        this.b = new j(this);
        this.c = new k(this);
        this.d = new l(this);
        this.e = new m(this);
        this.f = new o(this);
        this.a = k2Var;
    }

    public abstract void b();

    public abstract void d();

    public abstract void f();

    public abstract void h();

    public abstract void i();

    public final void j() {
        try {
            b();
            this.g.c.postDelayed(this.b, 30000L);
            k2 k2Var = this.a;
            u uVar = this.d;
            k2Var.b(uVar, uVar);
        } catch (Throwable unused) {
        }
    }

    public /* synthetic */ i(SGLocService sGLocService, k2 k2Var, byte b) {
        this(sGLocService, k2Var);
    }
}
