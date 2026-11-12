package com.google.android.exoplayer2.analytics;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.decoder.DecoderReuseEvaluation;
import com.google.android.exoplayer2.util.ListenerSet;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class d implements ListenerSet.Event {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f52894a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AnalyticsListener.EventTime f52895b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Format f52896c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ DecoderReuseEvaluation f52897d;

    public /* synthetic */ d(AnalyticsListener.EventTime eventTime, Format format, DecoderReuseEvaluation decoderReuseEvaluation, int i14) {
        this.f52894a = i14;
        this.f52895b = eventTime;
        this.f52896c = format;
        this.f52897d = decoderReuseEvaluation;
    }

    @Override // com.google.android.exoplayer2.util.ListenerSet.Event
    public final void invoke(Object obj) {
        switch (this.f52894a) {
            case 0:
                DefaultAnalyticsCollector.lambda$onAudioInputFormatChanged$5(this.f52895b, this.f52896c, this.f52897d, (AnalyticsListener) obj);
                break;
            default:
                DefaultAnalyticsCollector.lambda$onVideoInputFormatChanged$15(this.f52895b, this.f52896c, this.f52897d, (AnalyticsListener) obj);
                break;
        }
    }
}
