package com.garmin.android.apps.connectmobile.settings.devices.fr945;

import ch1.c1;
import ch1.g3;
import ch1.h6;
import ch1.k2;
import ch1.m6;
import ch1.q2;
import ch1.s2;
import ch1.s4;
import ch1.u;
import com.garmin.android.apps.connectmobile.settings.devices.fr645.FR645GeneralSettingActivity;
import java.util.ArrayList;
import java.util.Observable;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import zb0.d0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/fr945/FR945GeneralSettingsActivity;", "Lcom/garmin/android/apps/connectmobile/settings/devices/fr645/FR645GeneralSettingActivity;", "<init>", "()V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class FR945GeneralSettingsActivity extends FR645GeneralSettingActivity {
    @Override // com.garmin.android.apps.connectmobile.settings.devices.fr645.FR645GeneralSettingActivity, ng1.k0
    public final void fa() {
        ArrayList arrayList = this.f125956m;
        arrayList.clear();
        h6 h6Var = new h6(this, this.f125976b);
        this.f43012o = h6Var;
        arrayList.add(h6Var);
        arrayList.add(new m6(this));
        arrayList.add(new u(this));
        arrayList.add(new q2(this));
        arrayList.add(new g3(this));
        arrayList.add(new s4(this));
        arrayList.add(new c1(this));
        arrayList.add(new k2(this));
        if (this.f125977c.X0()) {
            arrayList.add(new s2(this));
        }
    }

    @Override // com.garmin.android.apps.connectmobile.settings.devices.fr645.FR645GeneralSettingActivity, ng1.p, java.util.Observer
    public final void update(Observable observable, Object obj) {
        super.update(observable, obj);
        if (observable instanceof h6) {
            ((d0) KoinJavaComponent.get$default(d0.class, null, null, 6, null)).H(this, this.f125976b, this.f125977c.getProductNumber(), this.f125977c.getProductDisplayName(), 2131231958);
        }
    }
}
