package com.google.android.exoplayer2.analytics;

import com.google.android.exoplayer2.util.ListenerSet;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class k implements ListenerSet.Event {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f52921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AnalyticsListener.EventTime f52922b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f52923c;

    public /* synthetic */ k(AnalyticsListener.EventTime eventTime, int i14, int i15) {
        this.f52921a = i15;
        this.f52922b = eventTime;
        this.f52923c = i14;
    }

    @Override // com.google.android.exoplayer2.util.ListenerSet.Event
    public final void invoke(Object obj) {
        switch (this.f52921a) {
            case 0:
                ((AnalyticsListener) obj).onAudioSessionIdChanged(this.f52922b, this.f52923c);
                break;
            case 1:
                ((AnalyticsListener) obj).onPlaybackStateChanged(this.f52922b, this.f52923c);
                break;
            case 2:
                ((AnalyticsListener) obj).onRepeatModeChanged(this.f52922b, this.f52923c);
                break;
            case 3:
                ((AnalyticsListener) obj).onPlaybackSuppressionReasonChanged(this.f52922b, this.f52923c);
                break;
            case 4:
                ((AnalyticsListener) obj).onTimelineChanged(this.f52922b, this.f52923c);
                break;
            default:
                DefaultAnalyticsCollector.lambda$onDrmSessionAcquired$62(this.f52922b, this.f52923c, (AnalyticsListener) obj);
                break;
        }
    }
}
