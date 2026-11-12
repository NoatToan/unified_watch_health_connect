package com.google.android.exoplayer2.drm;

import com.google.android.exoplayer2.util.Consumer;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class a implements Consumer, DrmSessionManager.DrmSessionReference {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f52983a;

    public /* synthetic */ a(int i14) {
        this.f52983a = i14;
    }

    @Override // com.google.android.exoplayer2.util.Consumer
    public void accept(Object obj) {
        DrmSessionEventListener.EventDispatcher eventDispatcher = (DrmSessionEventListener.EventDispatcher) obj;
        switch (this.f52983a) {
            case 0:
                eventDispatcher.drmSessionAcquired(3);
                break;
            case 1:
                eventDispatcher.drmKeysRestored();
                break;
            case 2:
                eventDispatcher.drmKeysRemoved();
                break;
            default:
                eventDispatcher.drmKeysLoaded();
                break;
        }
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionManager.DrmSessionReference
    public void release() {
        DrmSessionManager.DrmSessionReference.lambda$static$0();
    }
}
