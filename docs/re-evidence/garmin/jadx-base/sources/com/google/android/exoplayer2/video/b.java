package com.google.android.exoplayer2.video;

import com.google.android.exoplayer2.decoder.DecoderCounters;

/* JADX INFO: loaded from: classes14.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ VideoRendererEventListener.EventDispatcher f53143b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ DecoderCounters f53144c;

    public /* synthetic */ b(VideoRendererEventListener.EventDispatcher eventDispatcher, DecoderCounters decoderCounters, int i14) {
        this.f53142a = i14;
        this.f53143b = eventDispatcher;
        this.f53144c = decoderCounters;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f53142a) {
            case 0:
                this.f53143b.lambda$disabled$8(this.f53144c);
                break;
            default:
                this.f53143b.lambda$enabled$0(this.f53144c);
                break;
        }
    }
}
