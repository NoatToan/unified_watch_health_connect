package hk0;

/* JADX INFO: loaded from: classes8.dex */
public class n implements lm2.f.a<Void> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ lm2.f.a f84078a;

    public n(o oVar, lm2.f.a aVar) {
        this.f84078a = aVar;
    }

    @Override // lm2.f.a
    public final void a() {
        ed0.a.m("GCMPairDbDelegate", new m(this));
    }

    @Override // lm2.f.a
    public final void onFailure(Throwable th3) {
        this.f84078a.onFailure(th3);
    }
}
