package com.garmin.android.apps.connectmobile.settings.devices.vivoactive3musiclte;

import android.os.Bundle;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.settings.devices.a;
import p005kotlin.Metadata;
import zb0.u0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/vivoactive3musiclte/Vivoactive3MusicLteActivityTracking;", "Lcom/garmin/android/apps/connectmobile/settings/devices/a;", "<init>", "()V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class Vivoactive3MusicLteActivityTracking extends a {
    @Override // com.garmin.android.apps.connectmobile.settings.devices.a, ng1.j
    public final int ea() {
        return R.layout.gcm3_activity_tracking_vva3_lte;
    }

    @Override // com.garmin.android.apps.connectmobile.settings.devices.a, ng1.j, ng1.p, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        getIntent().putExtra("GCM_deviceEnumValue", u0.f203705c2);
        getIntent().putExtra("GCM_deviceSettingsTitle", getResources().getString(R.string.activity_tracking_title));
        super.onCreate(bundle);
    }
}
