package com.garmin.android.apps.connectmobile.gncs;

import android.os.Bundle;
import androidx.core.view.j;
import androidx.fragment.app.a;
import androidx.fragment.app.v;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.c;
import com.garmin.android.gncs.settings.GNCSConfigSettingsFragment;

/* JADX INFO: loaded from: classes8.dex */
public class GNCSConfigurationOverrideActivity extends c {
    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.opt_out_settings);
        GNCSConfigSettingsFragment gNCSConfigSettingsFragment = new GNCSConfigSettingsFragment();
        v supportFragmentManager = getSupportFragmentManager();
        a aVarB = j.b(supportFragmentManager, supportFragmentManager);
        aVarB.j(R.id.fragment_container, gNCSConfigSettingsFragment, null, 1);
        aVarB.e();
        initActionBar(true, R.string.smart_notifications_title);
    }
}
