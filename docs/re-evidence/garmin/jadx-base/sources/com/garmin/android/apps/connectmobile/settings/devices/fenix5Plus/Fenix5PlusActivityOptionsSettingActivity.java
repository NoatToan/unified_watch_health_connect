package com.garmin.android.apps.connectmobile.settings.devices.fenix5Plus;

import am.a2;
import android.content.Intent;
import ch1.i2;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.settings.devices.common.DeviceAudioPromptsSettingActivityDefault;
import java.util.Observable;
import vg1.f0;
import vg1.k0;

/* JADX INFO: loaded from: classes10.dex */
public class Fenix5PlusActivityOptionsSettingActivity extends f0 {
    @Override // vg1.f0
    public final void da() {
        ca(new i2(this), 0);
    }

    @Override // vg1.f0
    public final k0 fa() {
        return new k0(this, this, 2);
    }

    @Override // vg1.f0
    public final String ga() {
        return getString(R.string.activity_options_title);
    }

    @Override // com.garmin.android.apps.connectmobile.z1, androidx.fragment.app.m, b.g, android.app.Activity
    public final void onActivityResult(int i14, int i15, Intent intent) {
        if (i14 == 1001 && intent != null) {
            ma((DeviceSettingsDTO) a2.c(intent.getExtras(), "GCM_deviceSettings"));
        }
        super.onActivityResult(i14, i15, intent);
    }

    @Override // vg1.f0, java.util.Observer
    public final void update(Observable observable, Object obj) {
        if (observable instanceof i2) {
            DeviceAudioPromptsSettingActivityDefault.pa(this, this.f178102a.getDeviceUnitId(), this.f178102a.i(), this.f178102a.e());
        }
    }
}
