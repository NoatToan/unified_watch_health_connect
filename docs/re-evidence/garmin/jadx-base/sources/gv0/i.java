package gv0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.livetrackui.presentation.settings.LiveTrackSettingsViewModel", f = "LiveTrackSettingsViewModel.kt", l = {485, 489, 495}, m = "fetchContactById", v = 2)
public final class i extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f79282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f79283b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f79284c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f79285d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(d dVar, t13.d<? super i> dVar2) {
        super(dVar2);
        this.f79284c = dVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f79283b = obj;
        this.f79285d |= Integer.MIN_VALUE;
        int i14 = d.O0;
        return this.f79284c.E4(null, false, this);
    }
}
