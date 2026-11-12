package com.google.android.exoplayer2.analytics;

import androidx.media3.common.z;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import com.google.android.exoplayer2.ui.TrackSelectionDialogBuilder;
import com.google.android.exoplayer2.util.ListenerSet;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class t implements ListenerSet.Event, TrackSelectionDialogBuilder.DialogCallback, fa.j.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f52952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f52953b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f52954c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f52955d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f52956e;

    public /* synthetic */ t(DefaultTrackSelector defaultTrackSelector, DefaultTrackSelector.Parameters parameters, int i14, TrackGroupArray trackGroupArray) {
        this.f52952a = 1;
        this.f52954c = defaultTrackSelector;
        this.f52955d = parameters;
        this.f52953b = i14;
        this.f52956e = trackGroupArray;
    }

    @Override // com.google.android.exoplayer2.util.ListenerSet.Event
    public void invoke(Object obj) {
        switch (this.f52952a) {
            case 0:
                DefaultAnalyticsCollector.lambda$onPositionDiscontinuity$44((AnalyticsListener.EventTime) this.f52954c, this.f52953b, (Player.PositionInfo) this.f52955d, (Player.PositionInfo) this.f52956e, (AnalyticsListener) obj);
                break;
            default:
                ja.b.a aVar = (ja.b.a) this.f52954c;
                z.e eVar = (z.e) this.f52955d;
                z.e eVar2 = (z.e) this.f52956e;
                ja.b bVar = (ja.b) obj;
                bVar.getClass();
                bVar.v(aVar, eVar, eVar2, this.f52953b);
                break;
        }
    }

    @Override // com.google.android.exoplayer2.ui.TrackSelectionDialogBuilder.DialogCallback
    public void onTracksSelected(boolean z14, List list) {
        TrackSelectionDialogBuilder.lambda$new$0((DefaultTrackSelector) this.f52954c, (DefaultTrackSelector.Parameters) this.f52955d, this.f52953b, (TrackGroupArray) this.f52956e, z14, list);
    }

    public /* synthetic */ t(Object obj, int i14, Object obj2, Object obj3, int i15) {
        this.f52952a = i15;
        this.f52954c = obj;
        this.f52953b = i14;
        this.f52955d = obj2;
        this.f52956e = obj3;
    }
}
