package com.google.android.exoplayer2.offline;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class h implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f53041b;

    public /* synthetic */ h(Object obj, int i14) {
        this.f53040a = i14;
        this.f53041b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f53040a) {
            case 0:
                ((DownloadService.ForegroundNotificationUpdater) this.f53041b).update();
                break;
            default:
                ((DownloadHelper) this.f53041b).lambda$onMediaPrepared$4();
                break;
        }
    }
}
