package com.google.android.exoplayer2.analytics;

import com.google.android.exoplayer2.util.ListenerSet;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class r implements ListenerSet.Event {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f52945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AnalyticsListener.EventTime f52946b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f52947c;

    public /* synthetic */ r(AnalyticsListener.EventTime eventTime, String str, int i14) {
        this.f52945a = i14;
        this.f52946b = eventTime;
        this.f52947c = str;
    }

    @Override // com.google.android.exoplayer2.util.ListenerSet.Event
    public final void invoke(Object obj) {
        switch (this.f52945a) {
            case 0:
                ((AnalyticsListener) obj).onAudioDecoderReleased(this.f52946b, this.f52947c);
                break;
            default:
                ((AnalyticsListener) obj).onVideoDecoderReleased(this.f52946b, this.f52947c);
                break;
        }
    }
}
