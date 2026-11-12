package r0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f148741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f148742b;

    public /* synthetic */ n(o oVar, int i14) {
        this.f148741a = i14;
        this.f148742b = oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f148741a) {
            case 0:
                k0.b.d().execute(new n(this.f148742b, 1));
                break;
            default:
                o oVar = this.f148742b;
                if (!oVar.f148756n) {
                    oVar.e();
                }
                break;
        }
    }
}
