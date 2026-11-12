package za;

import androidx.media3.common.k0;
import androidx.media3.exoplayer.video.VideoSink;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f203177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ VideoSink.a f203178b;

    public /* synthetic */ c(androidx.media3.exoplayer.video.c.d dVar, VideoSink.a aVar, k0 k0Var) {
        this.f203177a = 0;
        this.f203178b = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f203177a) {
            case 0:
                this.f203178b.getClass();
                break;
            case 1:
                this.f203178b.a();
                break;
            default:
                this.f203178b.b();
                break;
        }
    }

    public /* synthetic */ c(androidx.media3.exoplayer.video.c.d dVar, VideoSink.a aVar, int i14) {
        this.f203177a = i14;
        this.f203178b = aVar;
    }
}
