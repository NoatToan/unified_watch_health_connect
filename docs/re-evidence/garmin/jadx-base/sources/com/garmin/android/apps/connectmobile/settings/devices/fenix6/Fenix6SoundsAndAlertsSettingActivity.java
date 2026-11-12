package com.garmin.android.apps.connectmobile.settings.devices.fenix6;

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
import com.garmin.android.apps.connectmobile.settings.devices.fenix5Plus.Fenix5PlusSoundsAndAlertsSettingActivity;
import java.util.ArrayList;
import java.util.Observer;

/* JADX INFO: loaded from: classes10.dex */
public class Fenix6SoundsAndAlertsSettingActivity extends Fenix5PlusSoundsAndAlertsSettingActivity implements Observer {
    @Override // com.garmin.android.apps.connectmobile.settings.devices.fenix5Plus.Fenix5PlusSoundsAndAlertsSettingActivity, ng1.k0
    public final void fa() {
        ArrayList arrayList = this.f125956m;
        arrayList.clear();
        arrayList.add(new y2(this));
        arrayList.add(new g2(this));
        arrayList.add(new h2(this));
        arrayList.add(new j(this));
        arrayList.add(new b5(this, R.string.device_settings_alert_vibration));
        arrayList.add(new f3(this));
        arrayList.add(new r1(this, this.f125957n));
        arrayList.add(new c0(this));
        arrayList.add(new y0(this, R.string.device_settings_do_not_disturb_during_sleep));
    }
}
