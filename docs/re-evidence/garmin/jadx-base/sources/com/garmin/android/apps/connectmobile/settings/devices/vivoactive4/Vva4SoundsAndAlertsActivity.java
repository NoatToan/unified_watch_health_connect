package com.garmin.android.apps.connectmobile.settings.devices.vivoactive4;

import android.content.Intent;
import android.os.Bundle;
import ch1.d4;
import ch1.l3;
import ch1.r1;
import ch1.y0;
import ch1.y2;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.settings.devices.AlarmsSettingsActivity;
import com.garmin.android.apps.connectmobile.settings.devices.common.smartnotifications.SmartNotificationsActivity;
import com.garmin.android.apps.connectmobile.settings.devices.vivosmart4.VivoSmart4HighHeartRateSettings;
import fb2.k;
import java.util.Observable;
import java.util.Observer;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import vg1.f0;
import vg1.k0;
import wg1.d;
import zb0.u0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/vivoactive4/Vva4SoundsAndAlertsActivity;", "Lvg1/f0;", "Ljava/util/Observer;", "<init>", "()V", "a", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class Vva4SoundsAndAlertsActivity extends f0 implements Observer {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f43189i;

    static {
        new a(null);
    }

    @Override // vg1.f0
    public final void da() {
        ca(new y2(this), 0);
        ca(new k(this, true), 2);
        ca(new d4(this), 0);
        ca(new k(this, true), 2);
        ca(new r1(this, this.f43189i), 0);
        ca(new k(this, true), 2);
        ca(new l3(this), 0);
        ca(new y0(this, R.string.device_settings_do_not_disturb_during_sleep), 0);
    }

    @Override // vg1.f0
    public final k0 fa() {
        return new k0(this, this, 2);
    }

    @Override // vg1.f0
    public final String ga() {
        String string = getString(R.string.sounds_and_alerts_title);
        string.getClass();
        return string;
    }

    @Override // com.garmin.android.apps.connectmobile.z1, androidx.fragment.app.m, b.g, android.app.Activity
    public final void onActivityResult(int i14, int i15, Intent intent) {
        Bundle extras;
        if (i15 == -1 && (i14 == 100 || i14 == 10)) {
            ma((DeviceSettingsDTO) ((intent == null || (extras = intent.getExtras()) == null) ? null : extras.get("GCM_deviceSettings")));
        }
        super.onActivityResult(i14, i15, intent);
    }

    @Override // vg1.f0, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f43189i = getIntent().getBooleanExtra("GCM_low_hr_alert_capable", false);
    }

    @Override // vg1.f0, java.util.Observer
    public final void update(Observable observable, Object obj) {
        DeviceSettingsDTO deviceSettingsDTOE;
        Intent intentA;
        observable.getClass();
        if (obj != null) {
            if (observable instanceof y2) {
                u0 u0VarO = this.f178102a.o();
                AlarmsSettingsActivity.a aVar = AlarmsSettingsActivity.f41854n;
                long deviceUnitId = this.f178102a.getDeviceUnitId();
                aVar.getClass();
                AlarmsSettingsActivity.a.b(this, deviceUnitId, u0VarO);
            }
            if ((observable instanceof d4) && this.f178102a.e() != null) {
                if (u0.n(this.f178102a.i(), u0.f203815t2, u0.f203820u2, u0.f203804r2, u0.f203809s2)) {
                    d dVar = new d(null, null, false, false, 11, null);
                    SmartNotificationsActivity.f42849j.getClass();
                    intentA = SmartNotificationsActivity.a.a(this, dVar);
                } else {
                    SmartNotificationsActivity.a aVar2 = SmartNotificationsActivity.f42849j;
                    d dVar2 = new d(null, null, false, false, 15, null);
                    aVar2.getClass();
                    intentA = SmartNotificationsActivity.a.a(this, dVar2);
                }
                intentA.putExtras(ha());
                startActivityForResult(intentA, 100);
            }
            if (!(observable instanceof r1) || (deviceSettingsDTOE = this.f178102a.e()) == null) {
                return;
            }
            VivoSmart4HighHeartRateSettings.a aVar3 = VivoSmart4HighHeartRateSettings.f43225d;
            boolean z14 = this.f43189i;
            long deviceUnitId2 = this.f178102a.getDeviceUnitId();
            String strI = this.f178102a.i();
            strI.getClass();
            aVar3.getClass();
            VivoSmart4HighHeartRateSettings.a.a(this, z14, deviceSettingsDTOE, deviceUnitId2, strI);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/vivoactive4/Vva4SoundsAndAlertsActivity$a;", "", "<init>", "()V", "", "HR_REQUEST_CODE", "I", "", "TAG", "Ljava/lang/String;", "NOTIFICATION_REQUEST_CODE", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
