package com.garmin.android.apps.connectmobile.permissions;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.widget.Toast;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.i2;

/* JADX INFO: loaded from: classes9.dex */
public class RequestLocationServicesActivity extends Activity {
    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i14;
        super.onCreate(bundle);
        try {
            i14 = Settings.Secure.getInt(getContentResolver(), "location_mode");
        } catch (Settings.SettingNotFoundException e4) {
            i2.i("RequestLocationServicesActivity", "isLocationServiceEnabled: " + e4.getMessage());
            i14 = 0;
        }
        if (i14 != 0) {
            Toast.makeText(this, R.string.location_services_already_enabled, 1).show();
        } else {
            startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
        }
        finish();
    }
}
