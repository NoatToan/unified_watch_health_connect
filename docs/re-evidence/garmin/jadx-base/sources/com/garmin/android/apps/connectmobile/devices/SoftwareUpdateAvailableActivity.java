package com.garmin.android.apps.connectmobile.devices;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;

/* JADX INFO: loaded from: classes8.dex */
public class SoftwareUpdateAvailableActivity extends Activity {
    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.software_update_available);
        ((TextView) findViewById(R.id.software_update_message)).setText(getString(R.string.notification_bigtext_software_update_available, getIntent().getStringExtra("deviceName")));
    }
}
