package com.garmin.android.apps.connectmobile.settings.devices.vivoactive3Music;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.LinearLayout;
import ch1.b5;
import ch1.f3;
import ch1.g2;
import ch1.h2;
import ch1.j;
import ch1.y0;
import ch1.y2;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.settings.devices.AlarmsSettingsActivity;
import com.garmin.android.apps.connectmobile.settings.devices.common.DevicePhoneNotificationsActivityDefault;
import e22.a;
import i3.e5;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
import ng1.k0;
import org.koin.java.KoinJavaComponent;
import xj1.b;
import zb0.d0;
import zb0.u0;

/* JADX INFO: loaded from: classes10.dex */
public class Vivoactive3MusicSoundsAndAlertsSettingActivity extends k0 implements Observer {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f43169p = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Handler f43170o = null;

    @Override // ng1.k0
    public final void fa() {
        ArrayList arrayList = this.f125956m;
        arrayList.clear();
        arrayList.add(new y2(this));
        arrayList.add(new g2(this));
        arrayList.add(new h2(this));
        arrayList.add(new j(this));
        arrayList.add(new b5(this, R.string.device_settings_alert_vibration));
        arrayList.add(new f3(this));
        arrayList.add(new y0(this, R.string.device_settings_do_not_disturb_during_sleep));
    }

    @Override // ng1.k0
    public final void ha() {
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.page_content);
        if (this.f125985k != null) {
            b bVar = new b(7, this, linearLayout);
            ArrayList arrayList = this.f125956m;
            a.a(arrayList, bVar);
            k0.ga(this, arrayList, this.f125985k, this);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.z1, androidx.fragment.app.m, b.g, android.app.Activity
    public final void onActivityResult(int i14, int i15, Intent intent) {
        n23.j.y(e5.j(i14, i15, "onActivityResult(): requestCode=", ", resultCode=", ", data="), intent, a2.SETTINGS, "Vivoactive3MusicSoundsAndAlertsSettingActivity");
        super.onActivityResult(i14, i15, intent);
        if (i14 == 10 && i15 == -1) {
            DeviceSettingsDTO deviceSettingsDTO = (intent == null || intent.getExtras() == null) ? null : (DeviceSettingsDTO) intent.getExtras().get("GCM_deviceSettings");
            if (deviceSettingsDTO != null) {
                k0.ia(this.f125956m, deviceSettingsDTO);
                this.f125985k = deviceSettingsDTO;
            }
        }
    }

    @Override // ng1.k0, ng1.p, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initActionBar(true, R.string.sounds_and_alerts_title);
        this.f43170o = new Handler();
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, android.app.Activity
    public final void onResume() {
        super.onResume();
        k0.ia(this.f125956m, this.f125985k);
    }

    @Override // com.garmin.android.apps.connectmobile.c, i.c, androidx.fragment.app.m, android.app.Activity
    public final void onStart() {
        super.onStart();
        if (this.f43170o == null) {
            this.f43170o = new Handler();
        }
    }

    @Override // ng1.p, com.garmin.android.apps.connectmobile.c, i.c, androidx.fragment.app.m, android.app.Activity
    public final void onStop() {
        super.onStop();
        Handler handler = this.f43170o;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        this.f43170o = null;
    }

    @Override // ng1.p, java.util.Observer
    public final void update(Observable observable, Object obj) {
        i2.k(a2.SETTINGS, "Vivoactive3MusicSoundsAndAlertsSettingActivity", hb.a.j("update(): observable=", observable, ", data=", obj));
        if (obj != null) {
            if (observable instanceof f3) {
                DevicePhoneNotificationsActivityDefault.ca(this, this.f125985k, (String) obj, ((d0) KoinJavaComponent.get(d0.class)).J(this.f125980f), this.f125978d);
            }
            if (observable instanceof y2) {
                long j8 = this.f125976b;
                u0 u0Var = this.f125980f;
                AlarmsSettingsActivity.f41854n.getClass();
                AlarmsSettingsActivity.a.b(this, j8, u0Var);
            }
        }
    }
}
