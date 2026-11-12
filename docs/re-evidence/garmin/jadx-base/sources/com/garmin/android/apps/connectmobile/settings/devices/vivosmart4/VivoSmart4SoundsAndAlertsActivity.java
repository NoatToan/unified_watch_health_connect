package com.garmin.android.apps.connectmobile.settings.devices.vivosmart4;

import android.content.Intent;
import android.os.Bundle;
import ch1.c0;
import ch1.f3;
import ch1.l3;
import ch1.r1;
import ch1.y0;
import ch1.y2;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.settings.devices.AlarmsSettingsActivity;
import com.garmin.android.apps.connectmobile.settings.devices.common.DevicePhoneNotificationsActivityDefault;
import fb2.e;
import java.util.ArrayList;
import java.util.Observable;
import ng1.k0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import zb0.d0;
import zb0.u0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/vivosmart4/VivoSmart4SoundsAndAlertsActivity;", "Lng1/k0;", "<init>", "()V", "a", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class VivoSmart4SoundsAndAlertsActivity extends k0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f43229o;

    static {
        new a(null);
    }

    @Override // ng1.k0
    public final void ea() {
        super.ea();
        y2 y2Var = new y2(this);
        ArrayList arrayList = this.f125956m;
        arrayList.add(y2Var);
        arrayList.add(new f3(this));
        arrayList.add(new r1(this, this.f43229o));
        arrayList.add(new l3(this));
        arrayList.add(new c0(this));
        arrayList.add(new y0(this, R.string.device_settings_do_not_disturb_during_sleep));
    }

    @Override // ng1.k0
    public final void fa() {
        for (e eVar : this.f125956m) {
            DeviceSettingsDTO deviceSettingsDTO = this.f125985k;
            deviceSettingsDTO.getClass();
            eVar.m(eVar.g(this, deviceSettingsDTO));
            eVar.addObserver(this);
            eVar.l(true);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.z1, androidx.fragment.app.m, b.g, android.app.Activity
    public final void onActivityResult(int i14, int i15, Intent intent) {
        Bundle extras;
        super.onActivityResult(i14, i15, intent);
        if (i14 == 10 && i15 == -1) {
            Object obj = (intent == null || (extras = intent.getExtras()) == null) ? null : extras.get("GCM_deviceSettings");
            if (obj != null) {
                DeviceSettingsDTO deviceSettingsDTO = (DeviceSettingsDTO) obj;
                k0.ia(this.f125956m, deviceSettingsDTO);
                this.f125985k = deviceSettingsDTO;
            }
        }
    }

    @Override // ng1.k0, ng1.p, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initActionBar(true, ((d0) KoinJavaComponent.get$default(d0.class, null, null, 6, null)).C(this.f125980f) ? R.string.device_alerts : R.string.sounds_and_alerts_title);
        this.f43229o = getIntent().getBooleanExtra("GCM_low_hr_alert_capable", false);
    }

    @Override // ng1.p, java.util.Observer
    public final void update(Observable observable, Object obj) {
        observable.getClass();
        if (obj != null) {
            if (observable instanceof f3) {
                d0 d0Var = (d0) KoinJavaComponent.get$default(d0.class, null, null, 6, null);
                DeviceSettingsDTO deviceSettingsDTO = this.f125985k;
                deviceSettingsDTO.getClass();
                DevicePhoneNotificationsActivityDefault.ca(this, deviceSettingsDTO, (String) obj, d0Var.J(this.f125980f), this.f125978d);
                return;
            }
            if (observable instanceof y2) {
                AlarmsSettingsActivity.a aVar = AlarmsSettingsActivity.f41854n;
                long j8 = this.f125976b;
                u0 u0Var = this.f125980f;
                aVar.getClass();
                AlarmsSettingsActivity.a.b(this, j8, u0Var);
                return;
            }
            if (observable instanceof r1) {
                VivoSmart4HighHeartRateSettings.a aVar2 = VivoSmart4HighHeartRateSettings.f43225d;
                boolean z14 = this.f43229o;
                DeviceSettingsDTO deviceSettingsDTO2 = this.f125985k;
                deviceSettingsDTO2.getClass();
                long j14 = this.f125976b;
                String str = this.f125978d;
                str.getClass();
                aVar2.getClass();
                VivoSmart4HighHeartRateSettings.a.a(this, z14, deviceSettingsDTO2, j14, str);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/vivosmart4/VivoSmart4SoundsAndAlertsActivity$a;", "", "<init>", "()V", "", "DEFAULT_SCREENS_REQUEST_CODE", "I", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
