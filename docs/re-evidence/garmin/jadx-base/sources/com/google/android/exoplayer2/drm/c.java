package com.google.android.exoplayer2.drm;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f52985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f52986b;

    public /* synthetic */ c(Object obj, int i14) {
        this.f52985a = i14;
        this.f52986b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f52985a) {
            case 0:
                ((DefaultDrmSessionManager.PreacquiredSessionReference) this.f52986b).lambda$release$1();
                break;
            default:
                ((DefaultDrmSession) this.f52986b).release(null);
                break;
        }
    }
}
