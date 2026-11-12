package com.google.android.exoplayer2.analytics;

import com.google.android.exoplayer2.util.ListenerSet;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class b implements ListenerSet.Event {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f52888a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AnalyticsListener.EventTime f52889b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f52890c;

    public /* synthetic */ b(AnalyticsListener.EventTime eventTime, int i14, boolean z14) {
        this.f52888a = i14;
        this.f52889b = eventTime;
        this.f52890c = z14;
    }

    @Override // com.google.android.exoplayer2.util.ListenerSet.Event
    public final void invoke(Object obj) {
        switch (this.f52888a) {
            case 0:
                ((AnalyticsListener) obj).onSkipSilenceEnabledChanged(this.f52889b, this.f52890c);
                break;
            case 1:
                ((AnalyticsListener) obj).onIsPlayingChanged(this.f52889b, this.f52890c);
                break;
            case 2:
                ((AnalyticsListener) obj).onShuffleModeChanged(this.f52889b, this.f52890c);
                break;
            default:
                DefaultAnalyticsCollector.lambda$onIsLoadingChanged$33(this.f52889b, this.f52890c, (AnalyticsListener) obj);
                break;
        }
    }
}
