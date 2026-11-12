package com.google.android.exoplayer2;

import com.google.android.exoplayer2.source.MediaSource;
import com.google.common.base.Supplier;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class j implements Supplier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MediaSource.Factory f53011b;

    public /* synthetic */ j(MediaSource.Factory factory, int i14) {
        this.f53010a = i14;
        this.f53011b = factory;
    }

    @Override // com.google.common.base.Supplier
    public final Object get() {
        switch (this.f53010a) {
            case 0:
                return ExoPlayer.Builder.lambda$new$5(this.f53011b);
            case 1:
                return ExoPlayer.Builder.lambda$setMediaSourceFactory$17(this.f53011b);
            case 2:
                return ExoPlayer.Builder.lambda$new$7(this.f53011b);
            default:
                return ExoPlayer.Builder.lambda$new$9(this.f53011b);
        }
    }
}
