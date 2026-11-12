package gv0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.livetrackui.presentation.settings.LiveTrackSettingsViewModel", f = "LiveTrackSettingsViewModel.kt", l = {786}, m = "initStravaBeaconOption", v = 2)
public final class o extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f79346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f79347b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f79348c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(d dVar, t13.d<? super o> dVar2) {
        super(dVar2);
        this.f79347b = dVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f79346a = obj;
        this.f79348c |= Integer.MIN_VALUE;
        return d.z4(this.f79347b, this);
    }
}
