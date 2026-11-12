package com.google.android.exoplayer2.analytics;

import com.google.android.exoplayer2.util.ListenerSet;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class e implements ListenerSet.Event, fa.j.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f52898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f52899b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f52900c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f52901d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f52902e;

    public /* synthetic */ e(Object obj, int i14, long j8, long j14, int i15) {
        this.f52898a = i15;
        this.f52899b = obj;
        this.f52900c = i14;
        this.f52901d = j8;
        this.f52902e = j14;
    }

    @Override // com.google.android.exoplayer2.util.ListenerSet.Event
    public final void invoke(Object obj) {
        switch (this.f52898a) {
            case 0:
                ((AnalyticsListener) obj).onAudioUnderrun((AnalyticsListener.EventTime) this.f52899b, this.f52900c, this.f52901d, this.f52902e);
                break;
            case 1:
                ((AnalyticsListener) obj).onBandwidthEstimate((AnalyticsListener.EventTime) this.f52899b, this.f52900c, this.f52901d, this.f52902e);
                break;
            default:
                ((ja.b) obj).y((ja.b.a) this.f52899b, this.f52900c, this.f52901d, this.f52902e);
                break;
        }
    }
}
