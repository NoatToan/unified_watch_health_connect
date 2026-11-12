package la;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f111600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.media3.exoplayer.drm.b.a f111601b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ androidx.media3.exoplayer.drm.b f111602c;

    public /* synthetic */ a(androidx.media3.exoplayer.drm.b.a aVar, androidx.media3.exoplayer.drm.b bVar, int i14) {
        this.f111600a = i14;
        this.f111601b = aVar;
        this.f111602c = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f111600a) {
            case 0:
                androidx.media3.exoplayer.drm.b.a aVar = this.f111601b;
                this.f111602c.b(aVar.f8894a, aVar.f8895b);
                break;
            case 1:
                androidx.media3.exoplayer.drm.b.a aVar2 = this.f111601b;
                this.f111602c.l(aVar2.f8894a, aVar2.f8895b);
                break;
            case 2:
                androidx.media3.exoplayer.drm.b.a aVar3 = this.f111601b;
                this.f111602c.f(aVar3.f8894a, aVar3.f8895b);
                break;
            default:
                androidx.media3.exoplayer.drm.b.a aVar4 = this.f111601b;
                this.f111602c.a(aVar4.f8894a, aVar4.f8895b);
                break;
        }
    }
}
