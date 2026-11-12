package com.google.android.exoplayer2.analytics;

import com.google.android.exoplayer2.util.ListenerSet;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class c implements ListenerSet.Event {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f52891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AnalyticsListener.EventTime f52892b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Exception f52893c;

    public /* synthetic */ c(AnalyticsListener.EventTime eventTime, Exception exc, int i14) {
        this.f52891a = i14;
        this.f52892b = eventTime;
        this.f52893c = exc;
    }

    @Override // com.google.android.exoplayer2.util.ListenerSet.Event
    public final void invoke(Object obj) {
        switch (this.f52891a) {
            case 0:
                ((AnalyticsListener) obj).onVideoCodecError(this.f52892b, this.f52893c);
                break;
            case 1:
                ((AnalyticsListener) obj).onAudioCodecError(this.f52892b, this.f52893c);
                break;
            case 2:
                ((AnalyticsListener) obj).onAudioSinkError(this.f52892b, this.f52893c);
                break;
            default:
                ((AnalyticsListener) obj).onDrmSessionManagerError(this.f52892b, this.f52893c);
                break;
        }
    }
}
