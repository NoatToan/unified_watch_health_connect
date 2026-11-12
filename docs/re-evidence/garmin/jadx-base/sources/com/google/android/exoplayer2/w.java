package com.google.android.exoplayer2;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class w implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f53149b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f53150c;

    public /* synthetic */ w(int i14, Object obj, Object obj2) {
        this.f53148a = i14;
        this.f53149b = obj;
        this.f53150c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f53148a) {
            case 0:
                ((ExoPlayerImpl) this.f53149b).lambda$new$1((ExoPlayerImplInternal.PlaybackInfoUpdate) this.f53150c);
                break;
            default:
                ((ExoPlayerImplInternal) this.f53149b).lambda$sendMessageToTargetThread$1((PlayerMessage) this.f53150c);
                break;
        }
    }
}
