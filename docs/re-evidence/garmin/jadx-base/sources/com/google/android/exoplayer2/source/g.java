package com.google.android.exoplayer2.source;

/* JADX INFO: loaded from: classes14.dex */
public final /* synthetic */ class g implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MediaSourceEventListener.EventDispatcher f53077b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MediaSourceEventListener f53078c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ LoadEventInfo f53079d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ MediaLoadData f53080e;

    public /* synthetic */ g(MediaSourceEventListener.EventDispatcher eventDispatcher, MediaSourceEventListener mediaSourceEventListener, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, int i14) {
        this.f53076a = i14;
        this.f53077b = eventDispatcher;
        this.f53078c = mediaSourceEventListener;
        this.f53079d = loadEventInfo;
        this.f53080e = mediaLoadData;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f53076a) {
            case 0:
                this.f53077b.lambda$loadCompleted$1(this.f53078c, this.f53079d, this.f53080e);
                break;
            case 1:
                this.f53077b.lambda$loadCanceled$2(this.f53078c, this.f53079d, this.f53080e);
                break;
            default:
                this.f53077b.lambda$loadStarted$0(this.f53078c, this.f53079d, this.f53080e);
                break;
        }
    }
}
