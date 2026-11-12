package androidx.camera.camera2.internal.compat;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q.a f5366b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f5367c;

    public /* synthetic */ p(q.a aVar, String str, int i14) {
        this.f5365a = i14;
        this.f5366b = aVar;
        this.f5367c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5365a) {
            case 0:
                this.f5366b.f5371b.onCameraAvailable(this.f5367c);
                break;
            default:
                this.f5366b.f5371b.onCameraUnavailable(this.f5367c);
                break;
        }
    }
}
