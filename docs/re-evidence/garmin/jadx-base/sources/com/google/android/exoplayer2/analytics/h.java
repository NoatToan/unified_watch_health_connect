package com.google.android.exoplayer2.analytics;

import com.google.android.exoplayer2.source.LoadEventInfo;
import com.google.android.exoplayer2.source.MediaLoadData;
import com.google.android.exoplayer2.util.ListenerSet;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class h implements ListenerSet.Event {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f52911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AnalyticsListener.EventTime f52912b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LoadEventInfo f52913c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ MediaLoadData f52914d;

    public /* synthetic */ h(AnalyticsListener.EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, int i14) {
        this.f52911a = i14;
        this.f52912b = eventTime;
        this.f52913c = loadEventInfo;
        this.f52914d = mediaLoadData;
    }

    @Override // com.google.android.exoplayer2.util.ListenerSet.Event
    public final void invoke(Object obj) {
        switch (this.f52911a) {
            case 0:
                ((AnalyticsListener) obj).onLoadCompleted(this.f52912b, this.f52913c, this.f52914d);
                break;
            case 1:
                ((AnalyticsListener) obj).onLoadStarted(this.f52912b, this.f52913c, this.f52914d);
                break;
            default:
                ((AnalyticsListener) obj).onLoadCanceled(this.f52912b, this.f52913c, this.f52914d);
                break;
        }
    }
}
