package com.garmin.android.apps.connectmobile;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;

/* JADX INFO: loaded from: classes7.dex */
public class UserDevicesActivity extends c {
    public static void ca(Context context) {
        Intent intent = new Intent(context, (Class<?>) UserDevicesActivity.class);
        intent.addFlags(67108864);
        context.startActivity(intent);
    }

    @Override // com.garmin.android.apps.connectmobile.c
    public final z10.l0 getConsentBannerScreen() {
        return z10.l0.USER_DEVICES;
    }

    @Override // com.garmin.android.apps.connectmobile.z1, androidx.fragment.app.m, b.g, android.app.Activity
    public final void onActivityResult(int i14, int i15, Intent intent) {
        super.onActivityResult(i14, i15, intent);
        Fragment fragmentG = getSupportFragmentManager().G("UserDevicesActivity");
        if (fragmentG != null) {
            fragmentG.onActivityResult(i14, i15, intent);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.z1, b.g, android.app.Activity
    public final void onBackPressed() {
        if (GarminConnectMobileApp.f28687i.f28691c) {
            finish();
        } else {
            super.onBackPressed();
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.gcm3_simple_frame_layout);
        super.initActionBar(true, R.string.concept_devices);
        Fragment fragmentInstantiate = Fragment.instantiate(this, hc0.k.class.getName(), null);
        androidx.fragment.app.v supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
        aVar.l(R.id.content_frame_layout, fragmentInstantiate, "UserDevicesActivity");
        aVar.e();
        Bundle bundle2 = new Bundle();
        bundle2.putString("PageAction", "Opened");
        ht.a.f85464a.getClass();
        ht.a.a(bundle2, "PageViewGarminDevices");
    }
}
