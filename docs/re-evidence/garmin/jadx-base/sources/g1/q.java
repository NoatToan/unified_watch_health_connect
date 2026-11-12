package g1;

/* JADX INFO: loaded from: classes.dex */
public class q implements l0.c<y> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r f74726a;

    public q(r rVar) {
        this.f74726a = rVar;
    }

    @Override // l0.c
    public final void onFailure(Throwable th3) {
        this.f74726a.b(0, "Unable to acquire InputBuffer.", th3);
    }

    @Override // l0.c
    public final void onSuccess(y yVar) {
        y yVar2 = yVar;
        r rVar = this.f74726a;
        yVar2.b(rVar.f74744r.b());
        yVar2.c();
        yVar2.a();
        l0.j.a(yVar2.d(), new p(this), rVar.f74735i);
    }
}
