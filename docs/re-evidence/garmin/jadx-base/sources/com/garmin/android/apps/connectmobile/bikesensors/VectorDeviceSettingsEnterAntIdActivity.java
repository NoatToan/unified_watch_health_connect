package com.garmin.android.apps.connectmobile.bikesensors;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.v;
import com.garmin.android.apps.connectmobile.R;

/* JADX INFO: loaded from: classes7.dex */
public class VectorDeviceSettingsEnterAntIdActivity extends com.garmin.android.apps.connectmobile.c implements lv.d.b {
    @Override // lv.d.b
    public final void T7(long j8) {
        Intent intent = new Intent();
        intent.putExtra("RIGHT_PEDAL_ID", j8);
        setResult(-1, intent);
        finish();
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.gcm_settings_powerzones);
        initActionBar(true, getString(R.string.device_settings_vector_section_title_pedals));
        long j8 = getIntent().getExtras() != null ? getIntent().getExtras().getLong("EXTRA_LEFT_PEDAL_ID", -1L) : -1L;
        String string = getString(R.string.device_settings_vector_link_pedal_title);
        lv.d dVar = new lv.d();
        Bundle bundle2 = new Bundle();
        bundle2.putString("NEXT_BUTTON", string);
        bundle2.putInt("DEVICE_IMAGE", 2131233259);
        bundle2.putLong("LEFT_PEDAL_ID", j8);
        dVar.setArguments(bundle2);
        v supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
        aVar.l(R.id.content_frame, dVar, null);
        aVar.e();
    }
}
