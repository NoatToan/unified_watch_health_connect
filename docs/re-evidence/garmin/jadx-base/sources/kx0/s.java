package kx0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.MenstrualCycleSettingsViewModel", f = "MenstrualCycleSettingsViewModel.kt", l = {258}, m = "updatePregnancySetting", v = 2)
public final class s extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f107113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f107114b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f107115c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(m mVar, t13.d<? super s> dVar) {
        super(dVar);
        this.f107114b = mVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f107113a = obj;
        this.f107115c |= Integer.MIN_VALUE;
        return m.z4(this.f107114b, null, null, this);
    }
}
