package gv0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.livetrackui.presentation.settings.LiveTrackSettingsViewModel", f = "LiveTrackSettingsViewModel.kt", l = {540, 543}, m = "addLiveTrackRecipient", v = 2)
public final class f extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public pu0.b f79261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f79262b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f79263c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f79264d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(d dVar, t13.d<? super f> dVar2) {
        super(dVar2);
        this.f79263c = dVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f79262b = obj;
        this.f79264d |= Integer.MIN_VALUE;
        return d.y4(this.f79263c, null, this);
    }
}
