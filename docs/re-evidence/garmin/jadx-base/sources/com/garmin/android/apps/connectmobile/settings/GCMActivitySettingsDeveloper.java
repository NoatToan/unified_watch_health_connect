package com.garmin.android.apps.connectmobile.settings;

import android.os.Bundle;
import androidx.fragment.app.v;
import com.garmin.android.apps.connectmobile.R;
import gg1.r;

/* JADX INFO: loaded from: classes10.dex */
public class GCMActivitySettingsDeveloper extends com.garmin.android.apps.connectmobile.c {
    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.gcm3_simple_frame_layout);
        initActionBar(true, R.string.gcm_developer);
        v supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
        aVar.l(R.id.content_frame, new r(), null);
        aVar.e();
    }
}
