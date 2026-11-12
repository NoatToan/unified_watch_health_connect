package com.garmin.android.apps.connectmobile.settings.devices.fr45;

import am.a2;
import android.content.Intent;
import ch1.i2;
import ch1.w0;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.settings.devices.fr645.FR645ActivityOptionsSettingActivity;
import com.garmin.android.apps.connectmobile.settings.devices.fr645.FR645BasicAudioPromptsSettingActivityDefault;
import dh1.i;
import java.util.Observable;
import ng1.j0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import zb0.u0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/fr45/FR45ActivityOptionsSettingActivity;", "Lcom/garmin/android/apps/connectmobile/settings/devices/fr645/FR645ActivityOptionsSettingActivity;", "<init>", "()V", "a", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class FR45ActivityOptionsSettingActivity extends FR645ActivityOptionsSettingActivity {
    static {
        new a(null);
    }

    @Override // com.garmin.android.apps.connectmobile.settings.devices.fr645.FR645ActivityOptionsSettingActivity, vg1.f0
    public final void da() {
        if (j0.a(this.f178102a.i())) {
            ca(new i(this), 0);
        } else {
            ca(new i2(this), 0);
        }
        ca(new w0(this), 2);
    }

    @Override // com.garmin.android.apps.connectmobile.settings.devices.fr645.FR645ActivityOptionsSettingActivity, com.garmin.android.apps.connectmobile.z1, androidx.fragment.app.m, b.g, android.app.Activity
    public final void onActivityResult(int i14, int i15, Intent intent) {
        if (i14 == 1001 && intent != null) {
            ma((DeviceSettingsDTO) a2.c(intent.getExtras(), "GCM_deviceSettings"));
        }
        super.onActivityResult(i14, i15, intent);
    }

    @Override // com.garmin.android.apps.connectmobile.settings.devices.fr645.FR645ActivityOptionsSettingActivity, vg1.f0, java.util.Observer
    public final void update(Observable observable, Object obj) {
        observable.getClass();
        if (observable instanceof i) {
            FR645BasicAudioPromptsSettingActivityDefault.a aVar = FR645BasicAudioPromptsSettingActivityDefault.f43002n;
            long deviceUnitId = this.f178102a.getDeviceUnitId();
            String strI = this.f178102a.i();
            DeviceSettingsDTO deviceSettingsDTOE = this.f178102a.e();
            aVar.getClass();
            Intent intent = new Intent(this, (Class<?>) FR645BasicAudioPromptsSettingActivityDefault.class);
            intent.putExtra("GCM_deviceUnitID", deviceUnitId);
            intent.putExtra("GCM_deviceProductNbr", strI);
            intent.putExtra("GCM_deviceSettings", deviceSettingsDTOE);
            startActivityForResult(intent, 1001);
            return;
        }
        if (observable instanceof i2) {
            FR45DeviceAudioPromptsSettingActivity.a aVar2 = FR45DeviceAudioPromptsSettingActivity.f42993l;
            long deviceUnitId2 = this.f178102a.getDeviceUnitId();
            String strI2 = this.f178102a.i();
            strI2.getClass();
            aVar2.getClass();
            Intent intent2 = new Intent(this, (Class<?>) FR45DeviceAudioPromptsSettingActivity.class);
            intent2.putExtra("GCM_deviceUnitID", deviceUnitId2);
            intent2.putExtra("GCM_deviceProductNbr", strI2);
            startActivityForResult(intent2, 1001);
            return;
        }
        if (observable instanceof w0) {
            FR45ActivityOptionsActivity.a aVar3 = FR45ActivityOptionsActivity.f42991n;
            long deviceUnitId3 = this.f178102a.getDeviceUnitId();
            String strI3 = this.f178102a.i();
            strI3.getClass();
            aVar3.getClass();
            Intent intent3 = new Intent(this, (Class<?>) FR45ActivityOptionsActivity.class);
            intent3.putExtra("GCM_deviceUnitID", deviceUnitId3);
            intent3.putExtra("GCM_deviceEnumValue", (u0) u0.f203782n6.get(strI3));
            intent3.putExtra("GCM_displayActivitiesMaxLimit", 6);
            startActivityForResult(intent3, 1002);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/fr45/FR45ActivityOptionsSettingActivity$a;", "", "<init>", "()V", "", "DISPLAYED_ACTIVITIES_SETTINGS_CHANGE_REQUEST_CODE", "I", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
