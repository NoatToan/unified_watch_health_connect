package com.google.android.exoplayer2.analytics;

import com.google.android.exoplayer2.source.LoadEventInfo;
import com.google.android.exoplayer2.source.MediaLoadData;
import com.google.android.exoplayer2.util.ListenerSet;
import java.io.IOException;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class n implements ListenerSet.Event, fa.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ IOException f52931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f52932b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f52933c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f52934d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f52935e;

    public /* synthetic */ n(Object obj, Object obj2, Object obj3, IOException iOException, boolean z14) {
        this.f52933c = obj;
        this.f52934d = obj2;
        this.f52935e = obj3;
        this.f52931a = iOException;
        this.f52932b = z14;
    }

    @Override // fa.g
    public void accept(Object obj) {
        androidx.media3.exoplayer.source.k.a aVar = (androidx.media3.exoplayer.source.k.a) this.f52933c;
        ((androidx.media3.exoplayer.source.k) obj).d(aVar.f9524a, aVar.f9525b, (sa.i) this.f52934d, (sa.j) this.f52935e, this.f52931a, this.f52932b);
    }

    @Override // com.google.android.exoplayer2.util.ListenerSet.Event
    public void invoke(Object obj) {
        ((AnalyticsListener) obj).onLoadError((AnalyticsListener.EventTime) this.f52933c, (LoadEventInfo) this.f52934d, (MediaLoadData) this.f52935e, this.f52931a, this.f52932b);
    }
}
