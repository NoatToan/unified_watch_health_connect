package com.garmin.android.apps.connectmobile.settings.devices.lumen;

import android.content.Intent;
import android.os.Build;
import android.os.Parcelable;
import ch1.a1;
import ch1.g3;
import ch1.k2;
import ch1.m0;
import ch1.n6;
import ch1.p0;
import ch1.s2;
import ch1.s4;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.settings.devices.common.DeviceNameActivity;
import java.util.Observable;
import java.util.Observer;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import vg1.f0;
import vg1.k0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/lumen/LumenGeneralSettingsActivity;", "Lvg1/f0;", "Ljava/util/Observer;", "<init>", "()V", "a", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class LumenGeneralSettingsActivity extends f0 implements Observer {
    static {
        new a(null);
    }

    @Override // vg1.f0
    public final void da() {
        ca(new p0(this), 0);
        ca(new n6(this), 0);
        ca(new a1(this), 2);
        ca(new g3(this), 0);
        ca(new s4(this), 0);
        ca(new m0(this), 0);
        ca(new a1(this), 2);
        ca(new k2(this), 0);
        ca(new s2(this), 0);
    }

    @Override // vg1.f0
    public final k0 fa() {
        return new k0(this, this, 2);
    }

    @Override // vg1.f0
    public final String ga() {
        String string = getString(R.string.lbl_general);
        string.getClass();
        return string;
    }

    @Override // com.garmin.android.apps.connectmobile.z1, androidx.fragment.app.m, b.g, android.app.Activity
    public final void onActivityResult(int i14, int i15, Intent intent) {
        Parcelable parcelable;
        super.onActivityResult(i14, i15, intent);
        if (i14 == 10 && i15 == -1 && intent != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) intent.getParcelableExtra("GCM_deviceSettings", DeviceSettingsDTO.class);
            } else {
                Parcelable parcelableExtra = intent.getParcelableExtra("GCM_deviceSettings");
                if (!(parcelableExtra instanceof DeviceSettingsDTO)) {
                    parcelableExtra = null;
                }
                parcelable = (DeviceSettingsDTO) parcelableExtra;
            }
            DeviceSettingsDTO deviceSettingsDTO = (DeviceSettingsDTO) parcelable;
            if (deviceSettingsDTO != null) {
                ma(deviceSettingsDTO);
            }
        }
    }

    @Override // vg1.f0, java.util.Observer
    public final void update(Observable observable, Object obj) {
        if (observable instanceof p0) {
            DeviceNameActivity.a aVar = DeviceNameActivity.f42630c;
            DeviceSettingsDTO deviceSettingsDTOE = this.f178102a.e();
            aVar.getClass();
            Intent intent = new Intent(this, (Class<?>) DeviceNameActivity.class);
            intent.putExtra("GCM_deviceSettings", deviceSettingsDTOE);
            startActivityForResult(intent, 10);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/lumen/LumenGeneralSettingsActivity$a;", "", "<init>", "()V", "", "SECONDARY_SCREEN_REQUEST_CODE", "I", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
