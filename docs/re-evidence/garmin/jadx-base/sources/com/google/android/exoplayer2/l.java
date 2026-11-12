package com.google.android.exoplayer2;

import com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector;
import com.google.android.exoplayer2.util.Clock;
import com.google.common.base.Function;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class l implements Function {
    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        return new DefaultAnalyticsCollector((Clock) obj);
    }
}
