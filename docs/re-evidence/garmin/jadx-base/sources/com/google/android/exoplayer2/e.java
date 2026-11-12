package com.google.android.exoplayer2;

import com.google.android.exoplayer2.upstream.BandwidthMeter;
import com.google.common.base.Supplier;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class e implements Supplier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f52996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BandwidthMeter f52997b;

    public /* synthetic */ e(BandwidthMeter bandwidthMeter, int i14) {
        this.f52996a = i14;
        this.f52997b = bandwidthMeter;
    }

    @Override // com.google.common.base.Supplier
    public final Object get() {
        switch (this.f52996a) {
            case 0:
                return ExoPlayer.Builder.lambda$new$12(this.f52997b);
            default:
                return ExoPlayer.Builder.lambda$setBandwidthMeter$20(this.f52997b);
        }
    }
}
