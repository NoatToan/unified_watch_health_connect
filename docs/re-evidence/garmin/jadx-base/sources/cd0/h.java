package cd0;

/* JADX INFO: loaded from: classes8.dex */
public class h implements bd0.s.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f26810a;

    public h(g gVar) {
        this.f26810a = gVar;
    }

    @Override // bd0.s.c
    public final void a() {
        bd0.h0 h0Var = this.f26810a.f26816d;
        if (h0Var != null) {
            h0Var.N();
        }
    }

    @Override // bd0.s.c
    public final void b(bd0.b0 b0Var) {
        g gVar = this.f26810a;
        bd0.h0 h0Var = gVar.f26816d;
        if (h0Var != null) {
            h0Var.L(i.a.f26819a[b0Var.ordinal()] != 1 ? yl2.e.OTHER_FATAL : yl2.e.NO_INTERNET_CONNECTION);
        }
        if (b0Var != bd0.b0.NO_CONNECTION) {
            gVar.i();
        }
    }

    @Override // bd0.s.c
    public final void c(lj0.e.a aVar) {
        g gVar = this.f26810a;
        bd0.h0 h0Var = gVar.f26816d;
        if (h0Var != null) {
            h0Var.I();
        }
        gVar.i();
    }
}
