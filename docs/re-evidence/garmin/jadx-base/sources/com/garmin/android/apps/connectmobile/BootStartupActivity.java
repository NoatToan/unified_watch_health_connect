package com.garmin.android.apps.connectmobile;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

/* JADX INFO: loaded from: classes7.dex */
public class BootStartupActivity extends Activity {
    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Toast.makeText(this, getText(R.string.app_name_garmin_connect), 0).show();
        finish();
    }
}
