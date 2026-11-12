package com.garmin.android.apps.connectmobile.settings.devices.vivomove3;

import android.os.Bundle;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.settings.devices.vivosmart4.VivoSmart4SoundsAndAlertsActivity;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/vivomove3/Vivomove3AlertsActivity;", "Lcom/garmin/android/apps/connectmobile/settings/devices/vivosmart4/VivoSmart4SoundsAndAlertsActivity;", "<init>", "()V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class Vivomove3AlertsActivity extends VivoSmart4SoundsAndAlertsActivity {
    @Override // com.garmin.android.apps.connectmobile.settings.devices.vivosmart4.VivoSmart4SoundsAndAlertsActivity, ng1.k0, ng1.p, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initActionBar(true, R.string.device_alerts);
    }
}
