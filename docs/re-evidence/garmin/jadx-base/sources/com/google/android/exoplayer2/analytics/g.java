package com.google.android.exoplayer2.analytics;

import com.google.android.exoplayer2.MediaMetadata;
import com.google.android.exoplayer2.util.ListenerSet;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class g implements ListenerSet.Event {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f52908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AnalyticsListener.EventTime f52909b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MediaMetadata f52910c;

    public /* synthetic */ g(AnalyticsListener.EventTime eventTime, MediaMetadata mediaMetadata, int i14) {
        this.f52908a = i14;
        this.f52909b = eventTime;
        this.f52910c = mediaMetadata;
    }

    @Override // com.google.android.exoplayer2.util.ListenerSet.Event
    public final void invoke(Object obj) {
        switch (this.f52908a) {
            case 0:
                ((AnalyticsListener) obj).onMediaMetadataChanged(this.f52909b, this.f52910c);
                break;
            default:
                ((AnalyticsListener) obj).onPlaylistMetadataChanged(this.f52909b, this.f52910c);
                break;
        }
    }
}
