package com.google.android.exoplayer2.scheduler;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RequirementsWatcher.NetworkCallback f53051b;

    public /* synthetic */ a(RequirementsWatcher.NetworkCallback networkCallback, int i14) {
        this.f53050a = i14;
        this.f53051b = networkCallback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f53050a) {
            case 0:
                this.f53051b.lambda$postCheckRequirements$0();
                break;
            default:
                this.f53051b.lambda$postRecheckNotMetNetworkRequirements$1();
                break;
        }
    }
}
