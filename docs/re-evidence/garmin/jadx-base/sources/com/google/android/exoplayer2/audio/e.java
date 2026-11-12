package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.decoder.DecoderCounters;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f52975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AudioRendererEventListener.EventDispatcher f52976b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ DecoderCounters f52977c;

    public /* synthetic */ e(AudioRendererEventListener.EventDispatcher eventDispatcher, DecoderCounters decoderCounters, int i14) {
        this.f52975a = i14;
        this.f52976b = eventDispatcher;
        this.f52977c = decoderCounters;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f52975a) {
            case 0:
                this.f52976b.lambda$enabled$0(this.f52977c);
                break;
            default:
                this.f52976b.lambda$disabled$6(this.f52977c);
                break;
        }
    }
}
