package com.google.android.exoplayer2.drm;

import com.google.android.exoplayer2.Format;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f52987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f52988b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f52989c;

    public /* synthetic */ d(int i14, Object obj, Object obj2) {
        this.f52987a = i14;
        this.f52988b = obj;
        this.f52989c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f52987a) {
            case 0:
                ((DrmSessionEventListener.EventDispatcher) this.f52988b).lambda$drmKeysRemoved$4((DrmSessionEventListener) this.f52989c);
                break;
            case 1:
                ((DrmSessionEventListener.EventDispatcher) this.f52988b).lambda$drmKeysRestored$3((DrmSessionEventListener) this.f52989c);
                break;
            case 2:
                ((DrmSessionEventListener.EventDispatcher) this.f52988b).lambda$drmKeysLoaded$1((DrmSessionEventListener) this.f52989c);
                break;
            case 3:
                ((DrmSessionEventListener.EventDispatcher) this.f52988b).lambda$drmSessionReleased$5((DrmSessionEventListener) this.f52989c);
                break;
            default:
                ((DefaultDrmSessionManager.PreacquiredSessionReference) this.f52988b).lambda$acquire$0((Format) this.f52989c);
                break;
        }
    }
}
