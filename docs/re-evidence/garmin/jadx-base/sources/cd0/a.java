package cd0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class a implements bd0.k0.a, km2.b.a, bd0.l0.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f26758a;

    public /* synthetic */ a(c cVar) {
        this.f26758a = cVar;
    }

    @Override // bd0.l0.c
    public void a(boolean z14) {
        c cVar = this.f26758a;
        cVar.s(0, true, z14 ? new b(cVar, 2) : null, null);
    }

    @Override // bd0.k0.a
    public void b(boolean z14) {
        if (z14) {
            return;
        }
        c cVar = this.f26758a;
        cVar.s(0, false, null, null);
        cVar.f26818f.j();
    }

    @Override // km2.b.a
    public void onComplete(boolean z14) {
        c cVar = this.f26758a;
        l80.b bVar = cVar.f26818f;
        bVar.k(cVar.f26761g.f18886a, z14);
        bVar.r();
        bd0.h0 h0Var = cVar.f26816d;
        if (h0Var != null) {
            h0Var.h();
        }
    }
}
