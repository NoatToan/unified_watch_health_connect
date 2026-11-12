package com.garmin.android.apps.connectmobile.settings.devices.gentoo;

import ch1.c1;
import ch1.g3;
import ch1.h6;
import ch1.k2;
import ch1.l6;
import ch1.o0;
import ch1.q2;
import ch1.s2;
import ch1.s4;
import ch1.u;
import ch1.v;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.settings.devices.fenix6.Fenix6GeneralSettingActivity;
import java.util.ArrayList;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/gentoo/GentooGeneralSettingActivity;", "Lcom/garmin/android/apps/connectmobile/settings/devices/fenix6/Fenix6GeneralSettingActivity;", "<init>", "()V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class GentooGeneralSettingActivity extends Fenix6GeneralSettingActivity {
    @Override // com.garmin.android.apps.connectmobile.settings.devices.fenix6.Fenix6GeneralSettingActivity, com.garmin.android.apps.connectmobile.settings.devices.fenix5Plus.Fenix5PlusGeneralSettingActivity, ng1.k0
    public final void fa() {
        ArrayList arrayList = this.f125956m;
        arrayList.clear();
        h6 h6Var = new h6(this, this.f125976b);
        this.f42962o = h6Var;
        arrayList.add(h6Var);
        arrayList.add(new l6(this));
        arrayList.add(new u(this));
        arrayList.add(new q2(this));
        arrayList.add(new v(this, this.f125976b, false));
        arrayList.add(new g3(this));
        arrayList.add(new s4(this, true));
        arrayList.add(new c1(this));
        o0 o0Var = new o0(this);
        DeviceSettingsDTO deviceSettingsDTO = this.f125985k;
        if (deviceSettingsDTO != null && o0Var.h(deviceSettingsDTO)) {
            arrayList.add(o0Var);
        }
        arrayList.add(new k2(this));
        if (this.f125977c.X0()) {
            arrayList.add(new s2(this));
        }
    }
}
