package h0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f80550a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t0 f80551b;

    public /* synthetic */ q0(t0 t0Var, int i14) {
        this.f80550a = i14;
        this.f80551b = t0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f80550a) {
            case 0:
                this.f80551b.d();
                break;
            default:
                t0 t0Var = this.f80551b;
                t0Var.f80576d = null;
                t0Var.d();
                break;
        }
    }
}
