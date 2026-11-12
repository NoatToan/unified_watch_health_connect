package com.garmin.android.apps.connectmobile.settings.devices.marq;

import android.content.Intent;
import ch1.b5;
import ch1.d4;
import ch1.g2;
import ch1.h2;
import ch1.j;
import ch1.r1;
import ch1.y0;
import ch1.y2;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.settings.devices.common.smartnotifications.SmartNotificationsActivity;
import com.garmin.android.apps.connectmobile.settings.devices.fenix5Plus.Fenix5PlusSoundsAndAlertsSettingActivity;
import h7.c;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
import o13.p;
import p005kotlin.Metadata;
import wg1.d;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/marq/MarqSoundsAndAlertsSettingActivity;", "Lcom/garmin/android/apps/connectmobile/settings/devices/fenix5Plus/Fenix5PlusSoundsAndAlertsSettingActivity;", "Ljava/util/Observer;", "<init>", "()V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class MarqSoundsAndAlertsSettingActivity extends Fenix5PlusSoundsAndAlertsSettingActivity implements Observer {
    @Override // com.garmin.android.apps.connectmobile.settings.devices.fenix5Plus.Fenix5PlusSoundsAndAlertsSettingActivity, ng1.k0
    public final void fa() {
        ArrayList arrayList = this.f125956m;
        arrayList.clear();
        arrayList.add(new y2(this));
        arrayList.add(new g2(this));
        arrayList.add(new h2(this));
        arrayList.add(new j(this));
        arrayList.add(new b5(this, R.string.device_settings_alert_vibration));
        arrayList.add(new d4(this));
        arrayList.add(new r1(this, this.f125957n));
        arrayList.add(new y0(this, R.string.device_settings_do_not_disturb_during_sleep));
    }

    @Override // com.garmin.android.apps.connectmobile.settings.devices.fenix5Plus.Fenix5PlusSoundsAndAlertsSettingActivity, ng1.p, java.util.Observer
    public final void update(Observable observable, Object obj) {
        observable.getClass();
        obj.getClass();
        if (observable instanceof r1) {
            ja();
            return;
        }
        if (!(observable instanceof d4)) {
            super.update(observable, obj);
            return;
        }
        SmartNotificationsActivity.a aVar = SmartNotificationsActivity.f42849j;
        d dVar = new d(null, null, false, false, 15, null);
        aVar.getClass();
        Intent intentA = SmartNotificationsActivity.a.a(this, dVar);
        intentA.putExtras(c.a(new p("GCM_deviceSettings", this.f125985k), new p("GCM_deviceUnitID", Long.valueOf(this.f125976b)), new p("GCM_deviceProductNbr", this.f125978d)));
        startActivityForResult(intentA, 10);
    }
}
