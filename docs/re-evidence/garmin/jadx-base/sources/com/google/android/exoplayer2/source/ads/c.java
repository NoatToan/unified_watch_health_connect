package com.google.android.exoplayer2.source.ads;

import com.google.android.exoplayer2.source.MediaSource;
import com.google.common.collect.ImmutableMap;

/* JADX INFO: loaded from: classes14.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f53066b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f53067c;

    public /* synthetic */ c(int i14, Object obj, Object obj2) {
        this.f53065a = i14;
        this.f53066b = obj;
        this.f53067c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f53065a) {
            case 0:
                ((AdsMediaSource.AdPrepareListener) this.f53066b).lambda$onPrepareComplete$0((MediaSource.MediaPeriodId) this.f53067c);
                break;
            case 1:
                ((AdsMediaSource.ComponentListener) this.f53066b).lambda$onAdPlaybackState$0((AdPlaybackState) this.f53067c);
                break;
            default:
                ((ServerSideAdInsertionMediaSource) this.f53066b).lambda$setAdPlaybackStates$0((ImmutableMap) this.f53067c);
                break;
        }
    }
}
