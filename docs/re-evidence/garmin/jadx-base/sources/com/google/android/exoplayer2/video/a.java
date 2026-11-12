package com.google.android.exoplayer2.video;

/* JADX INFO: loaded from: classes14.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53138a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ VideoRendererEventListener.EventDispatcher f53139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f53140c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f53141d;

    public /* synthetic */ a(VideoRendererEventListener.EventDispatcher eventDispatcher, int i14, long j8) {
        this.f53139b = eventDispatcher;
        this.f53141d = i14;
        this.f53140c = j8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f53138a) {
            case 0:
                this.f53139b.lambda$droppedFrames$3(this.f53141d, this.f53140c);
                break;
            default:
                this.f53139b.lambda$reportVideoFrameProcessingOffset$4(this.f53140c, this.f53141d);
                break;
        }
    }

    public /* synthetic */ a(VideoRendererEventListener.EventDispatcher eventDispatcher, long j8, int i14) {
        this.f53139b = eventDispatcher;
        this.f53140c = j8;
        this.f53141d = i14;
    }
}
