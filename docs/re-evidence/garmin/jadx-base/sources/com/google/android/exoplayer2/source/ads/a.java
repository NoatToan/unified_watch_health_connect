package com.google.android.exoplayer2.source.ads;

/* JADX INFO: loaded from: classes14.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AdsMediaSource f53060b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AdsMediaSource.ComponentListener f53061c;

    public /* synthetic */ a(AdsMediaSource adsMediaSource, AdsMediaSource.ComponentListener componentListener, int i14) {
        this.f53059a = i14;
        this.f53060b = adsMediaSource;
        this.f53061c = componentListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f53059a) {
            case 0:
                this.f53060b.lambda$prepareSourceInternal$0(this.f53061c);
                break;
            default:
                this.f53060b.lambda$releaseSourceInternal$1(this.f53061c);
                break;
        }
    }
}
