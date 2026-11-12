package com.google.android.exoplayer2.offline;

import java.io.IOException;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class g implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f53038b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f53039c;

    public /* synthetic */ g(int i14, Object obj, Object obj2) {
        this.f53037a = i14;
        this.f53038b = obj;
        this.f53039c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f53037a) {
            case 0:
                ((DownloadService.DownloadManagerHelper) this.f53038b).lambda$attachService$0((DownloadService) this.f53039c);
                break;
            case 1:
                ((DownloadHelper) this.f53038b).lambda$onMediaPreparationFailed$5((IOException) this.f53039c);
                break;
            default:
                ((DownloadHelper) this.f53038b).lambda$prepare$3((DownloadHelper.Callback) this.f53039c);
                break;
        }
    }
}
