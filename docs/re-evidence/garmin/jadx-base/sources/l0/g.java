package l0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f107803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.concurrent.futures.b.a f107804b;

    public /* synthetic */ g(androidx.concurrent.futures.b.a aVar, int i14) {
        this.f107803a = i14;
        this.f107804b = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i14 = this.f107803a;
        androidx.concurrent.futures.b.a aVar = this.f107804b;
        switch (i14) {
            case 0:
                j.a aVar2 = j.f107810a;
                aVar.b(null);
                break;
            default:
                aVar.d(new Exception("Failed to snapshot: OpenGLRenderer not ready."));
                break;
        }
    }
}
