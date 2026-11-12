package cd0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class d implements bd0.k0.a, km2.b.a, bd0.l0.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f26784a;

    public /* synthetic */ d(g gVar) {
        this.f26784a = gVar;
    }

    @Override // bd0.l0.c
    public void a(boolean z14) {
        g gVar = this.f26784a;
        gVar.r(0, true, z14 ? new e(gVar, 2) : null, null);
    }

    @Override // bd0.k0.a
    public void b(boolean z14) {
        if (z14) {
            return;
        }
        this.f26784a.r(0, false, null, null);
    }

    @Override // km2.b.a
    public void onComplete(boolean z14) {
        g gVar = this.f26784a;
        l80.b bVar = gVar.f26818f;
        bVar.k(gVar.f26796g.f18886a, z14);
        bVar.r();
        bd0.h0 h0Var = gVar.f26816d;
        if (h0Var != null) {
            h0Var.h();
        }
    }
}
