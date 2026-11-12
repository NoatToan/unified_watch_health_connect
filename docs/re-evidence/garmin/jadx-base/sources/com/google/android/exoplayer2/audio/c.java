package com.google.android.exoplayer2.audio;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f52969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AudioRendererEventListener.EventDispatcher f52970b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Exception f52971c;

    public /* synthetic */ c(AudioRendererEventListener.EventDispatcher eventDispatcher, Exception exc, int i14) {
        this.f52969a = i14;
        this.f52970b = eventDispatcher;
        this.f52971c = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f52969a) {
            case 0:
                this.f52970b.lambda$audioCodecError$9(this.f52971c);
                break;
            default:
                this.f52970b.lambda$audioSinkError$8(this.f52971c);
                break;
        }
    }
}
