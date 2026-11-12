package com.google.android.exoplayer2.analytics;

import com.google.android.exoplayer2.util.ListenerSet;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class f implements ListenerSet.Event {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f52903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AnalyticsListener.EventTime f52904b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f52905c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f52906d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f52907e;

    public /* synthetic */ f(AnalyticsListener.EventTime eventTime, String str, long j8, long j14, int i14) {
        this.f52903a = i14;
        this.f52904b = eventTime;
        this.f52905c = str;
        this.f52906d = j8;
        this.f52907e = j14;
    }

    @Override // com.google.android.exoplayer2.util.ListenerSet.Event
    public final void invoke(Object obj) {
        switch (this.f52903a) {
            case 0:
                DefaultAnalyticsCollector.lambda$onAudioDecoderInitialized$4(this.f52904b, this.f52905c, this.f52906d, this.f52907e, (AnalyticsListener) obj);
                break;
            default:
                DefaultAnalyticsCollector.lambda$onVideoDecoderInitialized$14(this.f52904b, this.f52905c, this.f52906d, this.f52907e, (AnalyticsListener) obj);
                break;
        }
    }
}
