package za;

import fa.z;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f203221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.media3.exoplayer.video.f.a f203222b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ androidx.media3.exoplayer.g f203223c;

    public /* synthetic */ i(androidx.media3.exoplayer.video.f.a aVar, androidx.media3.exoplayer.g gVar, int i14) {
        this.f203221a = i14;
        this.f203222b = aVar;
        this.f203223c = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f203221a) {
            case 0:
                androidx.media3.exoplayer.video.f.a aVar = this.f203222b;
                androidx.media3.exoplayer.g gVar = this.f203223c;
                androidx.media3.exoplayer.video.f fVar = aVar.f9870b;
                int i14 = z.f70071a;
                fVar.p(gVar);
                break;
            default:
                androidx.media3.exoplayer.video.f.a aVar2 = this.f203222b;
                androidx.media3.exoplayer.g gVar2 = this.f203223c;
                synchronized (gVar2) {
                }
                androidx.media3.exoplayer.video.f fVar2 = aVar2.f9870b;
                int i15 = z.f70071a;
                fVar2.A(gVar2);
                break;
        }
    }
}
