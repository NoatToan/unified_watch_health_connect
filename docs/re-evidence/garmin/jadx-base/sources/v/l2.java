package v;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l2 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f173913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m2 f173914b;

    public /* synthetic */ l2(m2 m2Var, int i14) {
        this.f173913a = i14;
        this.f173914b = m2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f173913a) {
            case 0:
                this.f173914b.f173934b.decrementAndGet();
                break;
            default:
                this.f173914b.f173934b.incrementAndGet();
                break;
        }
    }
}
