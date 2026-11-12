package za;

import fa.z;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f203217a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.media3.exoplayer.video.f.a f203218b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f203219c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f203220d;

    public /* synthetic */ h(androidx.media3.exoplayer.video.f.a aVar, int i14, long j8) {
        this.f203218b = aVar;
        this.f203220d = i14;
        this.f203219c = j8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i14 = this.f203217a;
        int i15 = this.f203220d;
        long j8 = this.f203219c;
        androidx.media3.exoplayer.video.f.a aVar = this.f203218b;
        switch (i14) {
            case 0:
                androidx.media3.exoplayer.video.f fVar = aVar.f9870b;
                int i16 = z.f70071a;
                fVar.onDroppedFrames(i15, j8);
                break;
            default:
                androidx.media3.exoplayer.video.f fVar2 = aVar.f9870b;
                int i17 = z.f70071a;
                fVar2.onVideoFrameProcessingOffset(j8, i15);
                break;
        }
    }

    public /* synthetic */ h(androidx.media3.exoplayer.video.f.a aVar, long j8, int i14) {
        this.f203218b = aVar;
        this.f203219c = j8;
        this.f203220d = i14;
    }
}
