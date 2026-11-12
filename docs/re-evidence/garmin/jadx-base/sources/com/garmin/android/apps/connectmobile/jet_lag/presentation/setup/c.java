package com.garmin.android.apps.connectmobile.jet_lag.presentation.setup;

import c22.t0;
import p005kotlin.Metadata;
import p13.j0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/garmin/android/apps/connectmobile/jet_lag/presentation/setup/c;", "Lc22/t0;", "gcm-jet-lag_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ms0.e f37098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TripFlightFragment f37099b;

    public c(ms0.e eVar, TripFlightFragment tripFlightFragment) {
        this.f37098a = eVar;
        this.f37099b = tripFlightFragment;
    }

    @Override // c22.t0, android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i14, int i15, int i16) {
        ms0.e eVar = this.f37098a;
        TripFlightFragment tripFlightFragment = this.f37099b;
        if (charSequence == null || charSequence.length() <= 0) {
            int i17 = TripFlightFragment.f37039n;
            tripFlightFragment.w6().A4();
            tripFlightFragment.E6(true);
            tripFlightFragment.getClass();
            TripFlightFragment.H6(eVar, false, null);
            return;
        }
        ms0.c.e(eVar, j0.f134944a);
        int i18 = TripFlightFragment.f37039n;
        tripFlightFragment.w6().y4(charSequence.toString(), tripFlightFragment.y6().f37110h);
        tripFlightFragment.E6(false);
        TripFlightFragment.H6(eVar, true, TripFlightFragment.b.SEARCHING);
    }
}
