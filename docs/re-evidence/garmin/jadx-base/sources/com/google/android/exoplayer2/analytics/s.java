package com.google.android.exoplayer2.analytics;

import com.google.android.exoplayer2.util.ListenerSet;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class s implements ListenerSet.Event {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f52948a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AnalyticsListener.EventTime f52949b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f52950c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f52951d;

    public /* synthetic */ s(AnalyticsListener.EventTime eventTime, int i14, long j8) {
        this.f52949b = eventTime;
        this.f52951d = i14;
        this.f52950c = j8;
    }

    @Override // com.google.android.exoplayer2.util.ListenerSet.Event
    public final void invoke(Object obj) {
        switch (this.f52948a) {
            case 0:
                ((AnalyticsListener) obj).onDroppedVideoFrames(this.f52949b, this.f52951d, this.f52950c);
                break;
            default:
                ((AnalyticsListener) obj).onVideoFrameProcessingOffset(this.f52949b, this.f52950c, this.f52951d);
                break;
        }
    }

    public /* synthetic */ s(AnalyticsListener.EventTime eventTime, long j8, int i14) {
        this.f52949b = eventTime;
        this.f52950c = j8;
        this.f52951d = i14;
    }
}
