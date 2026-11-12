package com.garmin.android.apps.connectmobile.settings.devices.fr45;

import ch1.b5;
import ch1.c0;
import ch1.f3;
import ch1.g2;
import ch1.h2;
import ch1.j;
import ch1.r1;
import ch1.y0;
import ch1.y2;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.settings.devices.fr645.FR645SoundsAndAlertsSettingActivity;
import fb2.k;
import java.util.ArrayList;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/fr45/FR45SoundAndAlertsSettingsActivity;", "Lcom/garmin/android/apps/connectmobile/settings/devices/fr645/FR645SoundsAndAlertsSettingActivity;", "<init>", "()V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class FR45SoundAndAlertsSettingsActivity extends FR645SoundsAndAlertsSettingActivity {
    @Override // com.garmin.android.apps.connectmobile.settings.devices.fr645.FR645SoundsAndAlertsSettingActivity, ng1.k0
    public final void fa() {
        ArrayList arrayList = this.f125956m;
        arrayList.clear();
        arrayList.add(new y2(this));
        arrayList.add(new g2(this));
        arrayList.add(new h2(this));
        arrayList.add(new j(this));
        arrayList.add(new b5(this, R.string.device_settings_alert_vibration));
        arrayList.add(new f3(this));
        arrayList.add(new r1(this, this.f43015o));
        arrayList.add(new k(this));
        arrayList.add(new c0(this));
        arrayList.add(new y0(this, R.string.device_settings_do_not_disturb_during_sleep));
    }
}
