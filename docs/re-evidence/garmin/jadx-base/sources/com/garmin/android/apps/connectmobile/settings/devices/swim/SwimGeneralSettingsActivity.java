package com.garmin.android.apps.connectmobile.settings.devices.swim;

import ch1.a1;
import ch1.c1;
import ch1.g3;
import ch1.k2;
import ch1.l6;
import ch1.m0;
import ch1.s2;
import ch1.s4;
import ch1.v;
import com.garmin.android.apps.connectmobile.settings.devices.fr645.FR645GeneralSettingActivity;
import java.util.ArrayList;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/swim/SwimGeneralSettingsActivity;", "Lcom/garmin/android/apps/connectmobile/settings/devices/fr645/FR645GeneralSettingActivity;", "<init>", "()V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class SwimGeneralSettingsActivity extends FR645GeneralSettingActivity {
    @Override // com.garmin.android.apps.connectmobile.settings.devices.fr645.FR645GeneralSettingActivity, ng1.k0
    public final void fa() {
        ArrayList arrayList = this.f125956m;
        arrayList.clear();
        arrayList.add(new a1(this));
        arrayList.add(new l6(this));
        arrayList.add(new g3(this));
        arrayList.add(new v(this, this.f125976b, false));
        arrayList.add(new s4(this));
        arrayList.add(new m0(this));
        arrayList.add(new a1(this));
        arrayList.add(new c1(this));
        arrayList.add(new a1(this));
        arrayList.add(new k2(this));
        if (this.f125977c.X0()) {
            arrayList.add(new s2(this));
        }
    }
}
