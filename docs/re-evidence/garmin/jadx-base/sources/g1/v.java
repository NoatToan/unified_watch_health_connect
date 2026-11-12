package g1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f74795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f74796b;

    public /* synthetic */ v(j jVar, int i14) {
        this.f74795a = i14;
        this.f74796b = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f74795a) {
            case 0:
                this.f74796b.getClass();
                break;
            default:
                this.f74796b.b();
                break;
        }
    }
}
