package ka;

import fa.z;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f103673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.media3.exoplayer.audio.b.a f103674b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ androidx.media3.exoplayer.g f103675c;

    public /* synthetic */ d(androidx.media3.exoplayer.audio.b.a aVar, androidx.media3.exoplayer.g gVar, int i14) {
        this.f103673a = i14;
        this.f103674b = aVar;
        this.f103675c = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f103673a) {
            case 0:
                androidx.media3.exoplayer.audio.b.a aVar = this.f103674b;
                androidx.media3.exoplayer.g gVar = this.f103675c;
                androidx.media3.exoplayer.audio.b bVar = aVar.f8767b;
                int i14 = z.f70071a;
                bVar.C(gVar);
                break;
            default:
                androidx.media3.exoplayer.audio.b.a aVar2 = this.f103674b;
                androidx.media3.exoplayer.g gVar2 = this.f103675c;
                synchronized (gVar2) {
                }
                androidx.media3.exoplayer.audio.b bVar2 = aVar2.f8767b;
                int i15 = z.f70071a;
                bVar2.I(gVar2);
                break;
        }
    }
}
