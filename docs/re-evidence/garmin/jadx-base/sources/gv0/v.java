package gv0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.livetrackui.presentation.settings.LiveTrackSettingsViewModel", f = "LiveTrackSettingsViewModel.kt", l = {290, 290, 294}, m = "resolveInitialDestination", v = 2)
public final class v extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public bv0.a f79401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ou0.f f79402b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f79403c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f79404d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d f79405e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f79406f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(d dVar, t13.d<? super v> dVar2) {
        super(dVar2);
        this.f79405e = dVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f79404d = obj;
        this.f79406f |= Integer.MIN_VALUE;
        return this.f79405e.X4(null, this);
    }
}
