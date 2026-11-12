package com.google.android.exoplayer2.analytics;

import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.util.ListenerSet;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class o implements ListenerSet.Event {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f52936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AnalyticsListener.EventTime f52937b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PlaybackException f52938c;

    public /* synthetic */ o(AnalyticsListener.EventTime eventTime, PlaybackException playbackException, int i14) {
        this.f52936a = i14;
        this.f52937b = eventTime;
        this.f52938c = playbackException;
    }

    @Override // com.google.android.exoplayer2.util.ListenerSet.Event
    public final void invoke(Object obj) {
        switch (this.f52936a) {
            case 0:
                ((AnalyticsListener) obj).onPlayerError(this.f52937b, this.f52938c);
                break;
            default:
                ((AnalyticsListener) obj).onPlayerErrorChanged(this.f52937b, this.f52938c);
                break;
        }
    }
}
