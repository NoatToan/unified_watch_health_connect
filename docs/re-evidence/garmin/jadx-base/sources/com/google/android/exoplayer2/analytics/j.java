package com.google.android.exoplayer2.analytics;

import com.google.android.exoplayer2.util.ListenerSet;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class j implements ListenerSet.Event {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f52919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AnalyticsListener.EventTime f52920b;

    public /* synthetic */ j(AnalyticsListener.EventTime eventTime, int i14) {
        this.f52919a = i14;
        this.f52920b = eventTime;
    }

    @Override // com.google.android.exoplayer2.util.ListenerSet.Event
    public final void invoke(Object obj) {
        switch (this.f52919a) {
            case 0:
                ((AnalyticsListener) obj).onSeekStarted(this.f52920b);
                break;
            case 1:
                ((AnalyticsListener) obj).onSeekProcessed(this.f52920b);
                break;
            case 2:
                ((AnalyticsListener) obj).onPlayerReleased(this.f52920b);
                break;
            case 3:
                ((AnalyticsListener) obj).onDrmKeysLoaded(this.f52920b);
                break;
            case 4:
                ((AnalyticsListener) obj).onDrmSessionReleased(this.f52920b);
                break;
            case 5:
                ((AnalyticsListener) obj).onDrmKeysRestored(this.f52920b);
                break;
            default:
                ((AnalyticsListener) obj).onDrmKeysRemoved(this.f52920b);
                break;
        }
    }
}
