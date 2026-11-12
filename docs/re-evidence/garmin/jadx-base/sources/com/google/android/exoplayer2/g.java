package com.google.android.exoplayer2;

import com.google.android.exoplayer2.trackselection.TrackSelector;
import com.google.common.base.Supplier;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class g implements Supplier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TrackSelector f53005b;

    public /* synthetic */ g(TrackSelector trackSelector, int i14) {
        this.f53004a = i14;
        this.f53005b = trackSelector;
    }

    @Override // com.google.common.base.Supplier
    public final Object get() {
        switch (this.f53004a) {
            case 0:
                return ExoPlayer.Builder.lambda$setTrackSelector$18(this.f53005b);
            default:
                return ExoPlayer.Builder.lambda$new$10(this.f53005b);
        }
    }
}
