package com.google.android.exoplayer2;

import com.google.android.exoplayer2.analytics.AnalyticsCollector;
import com.google.android.exoplayer2.util.Clock;
import com.google.common.base.Function;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class f implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AnalyticsCollector f53003b;

    public /* synthetic */ f(AnalyticsCollector analyticsCollector, int i14) {
        this.f53002a = i14;
        this.f53003b = analyticsCollector;
    }

    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        switch (this.f53002a) {
            case 0:
                return ExoPlayer.Builder.lambda$new$13(this.f53003b, (Clock) obj);
            default:
                return ExoPlayer.Builder.lambda$setAnalyticsCollector$21(this.f53003b, (Clock) obj);
        }
    }
}
