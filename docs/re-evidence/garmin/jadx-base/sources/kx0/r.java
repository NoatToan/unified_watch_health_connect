package kx0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.MenstrualCycleSettingsViewModel", f = "MenstrualCycleSettingsViewModel.kt", l = {282}, m = "postUserSettings", v = 2)
public final class r extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f107110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f107111b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f107112c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(m mVar, t13.d<? super r> dVar) {
        super(dVar);
        this.f107111b = mVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f107110a = obj;
        this.f107112c |= Integer.MIN_VALUE;
        return m.x4(this.f107111b, null, null, this);
    }
}
