package com.google.android.exoplayer2.analytics;

import com.google.android.exoplayer2.util.ListenerSet;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class a implements ListenerSet.Event {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f52885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AnalyticsListener.EventTime f52886b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f52887c;

    public /* synthetic */ a(AnalyticsListener.EventTime eventTime, long j8, int i14) {
        this.f52885a = i14;
        this.f52886b = eventTime;
        this.f52887c = j8;
    }

    @Override // com.google.android.exoplayer2.util.ListenerSet.Event
    public final void invoke(Object obj) {
        switch (this.f52885a) {
            case 0:
                ((AnalyticsListener) obj).onSeekForwardIncrementChanged(this.f52886b, this.f52887c);
                break;
            case 1:
                ((AnalyticsListener) obj).onSeekBackIncrementChanged(this.f52886b, this.f52887c);
                break;
            case 2:
                ((AnalyticsListener) obj).onAudioPositionAdvancing(this.f52886b, this.f52887c);
                break;
            default:
                ((AnalyticsListener) obj).onMaxSeekToPreviousPositionChanged(this.f52886b, this.f52887c);
                break;
        }
    }
}
