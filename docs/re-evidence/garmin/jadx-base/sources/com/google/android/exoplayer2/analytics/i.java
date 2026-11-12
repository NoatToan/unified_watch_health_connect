package com.google.android.exoplayer2.analytics;

import com.google.android.exoplayer2.util.ListenerSet;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class i implements ListenerSet.Event, fa.j.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f52915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f52916b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f52917c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f52918d;

    public /* synthetic */ i(AnalyticsListener.EventTime eventTime, int i14, boolean z14) {
        this.f52915a = 2;
        this.f52916b = eventTime;
        this.f52918d = i14;
        this.f52917c = z14;
    }

    @Override // com.google.android.exoplayer2.util.ListenerSet.Event
    public final void invoke(Object obj) {
        switch (this.f52915a) {
            case 0:
                ((AnalyticsListener) obj).onPlayerStateChanged((AnalyticsListener.EventTime) this.f52916b, this.f52917c, this.f52918d);
                break;
            case 1:
                ((AnalyticsListener) obj).onPlayWhenReadyChanged((AnalyticsListener.EventTime) this.f52916b, this.f52917c, this.f52918d);
                break;
            case 2:
                ((AnalyticsListener) obj).onDeviceVolumeChanged((AnalyticsListener.EventTime) this.f52916b, this.f52918d, this.f52917c);
                break;
            default:
                ((ja.b) obj).t((ja.b.a) this.f52916b, this.f52917c, this.f52918d);
                break;
        }
    }

    public /* synthetic */ i(Object obj, boolean z14, int i14, int i15) {
        this.f52915a = i15;
        this.f52916b = obj;
        this.f52917c = z14;
        this.f52918d = i14;
    }
}
