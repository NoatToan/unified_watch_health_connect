package zb0;

/* JADX INFO: loaded from: classes8.dex */
public class m0 extends j83.n<sd2.f> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g80.a f203572e;

    public m0(g80.a aVar) {
        this.f203572e = aVar;
    }

    @Override // j83.f
    public final void a() {
        this.f203572e.L1(n0.f203581e);
    }

    @Override // j83.f
    public final void c(Object obj) {
        sd2.f fVar = (sd2.f) obj;
        if (fVar != null) {
            n0.f203581e.f(fVar.getUnitID(), fVar);
        }
    }

    @Override // j83.f
    public final void onError(Throwable th3) {
    }
}
