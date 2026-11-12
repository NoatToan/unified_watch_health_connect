package v;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n2 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f173939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o2 f173940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ androidx.concurrent.futures.b.a f173941c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m0.a f173942d;

    public /* synthetic */ n2(o2 o2Var, androidx.concurrent.futures.b.a aVar, m0.a aVar2, int i14) {
        this.f173939a = i14;
        this.f173940b = o2Var;
        this.f173941c = aVar;
        this.f173942d = aVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f173939a) {
            case 0:
                this.f173940b.b(this.f173941c, this.f173942d);
                break;
            default:
                this.f173940b.b(this.f173941c, this.f173942d);
                break;
        }
    }
}
