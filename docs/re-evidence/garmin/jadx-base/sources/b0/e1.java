package b0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g1 f13877b;

    public /* synthetic */ e1(g1 g1Var, int i14) {
        this.f13876a = i14;
        this.f13877b = g1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f13876a) {
            case 0:
                this.f13877b.f13912h.cancel(true);
                break;
            default:
                this.f13877b.d();
                break;
        }
    }
}
