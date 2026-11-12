package com.google.android.exoplayer2.analytics;

import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.util.ListenerSet;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class p implements ListenerSet.Event {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f52939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AnalyticsListener.EventTime f52940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ DecoderCounters f52941c;

    public /* synthetic */ p(AnalyticsListener.EventTime eventTime, int i14, DecoderCounters decoderCounters) {
        this.f52939a = i14;
        this.f52940b = eventTime;
        this.f52941c = decoderCounters;
    }

    @Override // com.google.android.exoplayer2.util.ListenerSet.Event
    public final void invoke(Object obj) {
        switch (this.f52939a) {
            case 0:
                DefaultAnalyticsCollector.lambda$onVideoEnabled$13(this.f52940b, this.f52941c, (AnalyticsListener) obj);
                break;
            case 1:
                DefaultAnalyticsCollector.lambda$onAudioDisabled$9(this.f52940b, this.f52941c, (AnalyticsListener) obj);
                break;
            case 2:
                DefaultAnalyticsCollector.lambda$onVideoDisabled$18(this.f52940b, this.f52941c, (AnalyticsListener) obj);
                break;
            default:
                DefaultAnalyticsCollector.lambda$onAudioEnabled$3(this.f52940b, this.f52941c, (AnalyticsListener) obj);
                break;
        }
    }
}
