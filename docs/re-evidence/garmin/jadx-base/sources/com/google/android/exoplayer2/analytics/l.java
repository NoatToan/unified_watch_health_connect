package com.google.android.exoplayer2.analytics;

import com.google.android.exoplayer2.source.MediaLoadData;
import com.google.android.exoplayer2.util.ListenerSet;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class l implements ListenerSet.Event {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f52924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AnalyticsListener.EventTime f52925b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MediaLoadData f52926c;

    public /* synthetic */ l(AnalyticsListener.EventTime eventTime, MediaLoadData mediaLoadData, int i14) {
        this.f52924a = i14;
        this.f52925b = eventTime;
        this.f52926c = mediaLoadData;
    }

    @Override // com.google.android.exoplayer2.util.ListenerSet.Event
    public final void invoke(Object obj) {
        switch (this.f52924a) {
            case 0:
                ((AnalyticsListener) obj).onDownstreamFormatChanged(this.f52925b, this.f52926c);
                break;
            default:
                ((AnalyticsListener) obj).onUpstreamDiscarded(this.f52925b, this.f52926c);
                break;
        }
    }
}
