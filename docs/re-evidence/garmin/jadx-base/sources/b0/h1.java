package b0;

/* JADX INFO: loaded from: classes.dex */
public class h1 implements l0.c<Void> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Runnable f13938a;

    public h1(g1 g1Var, Runnable runnable) {
        this.f13938a = runnable;
    }

    @Override // l0.c
    public final void onFailure(Throwable th3) {
    }

    @Override // l0.c
    public final void onSuccess(Void r14) {
        this.f13938a.run();
    }
}
