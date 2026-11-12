package com.garmin.android.apps.connectmobile.settings.activityoptions;

/* JADX INFO: loaded from: classes10.dex */
public class f implements WellnessAlertsActivity.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WellnessAlertsActivity f41729a;

    public f(WellnessAlertsActivity wellnessAlertsActivity) {
        this.f41729a = wellnessAlertsActivity;
    }

    @Override // com.garmin.android.apps.connectmobile.settings.activityoptions.WellnessAlertsActivity.c
    public final boolean a(fb2.e eVar) {
        WellnessAlertsActivity wellnessAlertsActivity = this.f41729a;
        return eVar.g(wellnessAlertsActivity, wellnessAlertsActivity.f41698b);
    }

    @Override // com.garmin.android.apps.connectmobile.settings.activityoptions.WellnessAlertsActivity.c
    public final void b(fb2.e eVar) {
        eVar.addObserver(this.f41729a);
    }
}
