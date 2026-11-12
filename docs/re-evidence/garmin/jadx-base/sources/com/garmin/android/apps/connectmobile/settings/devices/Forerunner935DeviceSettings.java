package com.garmin.android.apps.connectmobile.settings.devices;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import ch1.b3;
import ch1.g3;
import ch1.j6;
import ch1.l6;
import ch1.m;
import ch1.q4;
import ch1.y0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.audioprompts.ui.AudioPromptsSettingsActivity;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexOneLineButton;
import com.garmin.android.gfdi.configuration.SupportedCapability;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Observable;
import java.util.Observer;
import mt0.h0;
import ng1.j;
import zb0.u0;

/* JADX INFO: loaded from: classes10.dex */
public class Forerunner935DeviceSettings extends j implements Observer {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f42118y = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public GCMComplexOneLineButton f42120v;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public GCMComplexOneLineButton f42122x;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ArrayList f42119t = new ArrayList();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Handler f42121w = null;

    @Override // ng1.j
    public int ea() {
        return R.layout.gcm3_device_settings_forerunner_935;
    }

    @Override // ng1.j
    public final GCMComplexOneLineButton ga() {
        GCMComplexOneLineButton gCMComplexOneLineButton = (GCMComplexOneLineButton) findViewById(R.id.device_settings_auto_upload_btn);
        this.f42120v = gCMComplexOneLineButton;
        return gCMComplexOneLineButton;
    }

    public int ka() {
        return 2131231957;
    }

    public final void la() {
        if (this.f125985k != null) {
            for (fb2.e eVar : this.f42119t) {
                boolean zG = eVar.g(this, this.f125985k);
                eVar.addObserver(this);
                eVar.m(zG);
            }
        }
    }

    @Override // com.garmin.android.apps.connectmobile.z1, androidx.fragment.app.m, b.g, android.app.Activity
    public final void onActivityResult(int i14, int i15, Intent intent) {
        Bundle extras;
        super.onActivityResult(i14, i15, intent);
        if (i15 == -1) {
            if ((i14 != 10 && i14 != 12) || intent == null || (extras = intent.getExtras()) == null) {
                return;
            }
            this.f125985k = (DeviceSettingsDTO) extras.get("GCM_deviceSettings");
            la();
        }
    }

    @Override // ng1.j, ng1.p, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle extras = getIntent().getExtras();
        if (this.f125985k == null || extras == null) {
            i2.f(a2.SETTINGS, "Forerunner935DeviceSettings", "Device Settings DTO is null or extras is null");
            finish();
            return;
        }
        this.f42122x = (GCMComplexOneLineButton) findViewById(R.id.device_settings_wifi_btn);
        this.f125949q = extras.getString("GCM_deviceName");
        ArrayList arrayList = this.f42119t;
        arrayList.clear();
        arrayList.add(new ch1.b(this));
        arrayList.add(new y0(this));
        arrayList.add(new m(this));
        arrayList.add(new b3(this));
        arrayList.add(new l6(this));
        arrayList.add(new g3(this));
        arrayList.add(new q4(this));
        la();
        this.f42120v.setButtonBottomHint((String) null);
        if (this.f42122x != null) {
            this.f42122x.setVisibility(km2.a.i(this.f125976b, null, SupportedCapability.WIFI_SETUP.ordinal()) ? 0 : 8);
            this.f42122x.setOnClickListener(new h0(this, 16));
        }
    }

    @Override // i.c, androidx.fragment.app.m, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        Iterator it = this.f42119t.iterator();
        while (it.hasNext()) {
            ((fb2.e) it.next()).n();
        }
    }

    @Override // ng1.j, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (this.f42121w == null) {
            this.f42121w = new Handler();
        }
    }

    @Override // ng1.p, com.garmin.android.apps.connectmobile.c, i.c, androidx.fragment.app.m, android.app.Activity
    public final void onStop() {
        super.onStop();
        Handler handler = this.f42121w;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f42121w = null;
        }
    }

    @Override // ng1.p, java.util.Observer
    public void update(Observable observable, Object obj) {
        if (obj != null) {
            String str = obj instanceof String ? (String) obj : null;
            if (observable instanceof ch1.b) {
                DeviceSettingsActivityTracking.ca(this, this.f125985k, str, this.f125976b);
                return;
            }
            if (observable instanceof q4) {
                Forerunner35DeviceSystemSettings.ca(this, this.f125985k, str, false);
                return;
            }
            if (observable instanceof j6) {
                Forerunner35DeviceSettingsDisplayOptions.da(this, this.f125985k, str);
                return;
            }
            if (!(observable instanceof b3)) {
                if (observable instanceof m) {
                    long j8 = this.f125976b;
                    String str2 = this.f125978d;
                    AudioPromptsSettingsActivity.f30263h.getClass();
                    Intent intent = new Intent(this, (Class<?>) AudioPromptsSettingsActivity.class);
                    intent.putExtra("GCM_deviceUnitID", j8);
                    intent.putExtra("GCM_deviceProductNbr", str2);
                    startActivity(intent);
                    return;
                }
                return;
            }
            DeviceSettingsDTO deviceSettingsDTO = this.f125985k;
            u0 u0Var = this.f125980f;
            String str3 = this.f125949q;
            Forerunner935NotificationsAndAlertsActivity.f42123f.getClass();
            deviceSettingsDTO.getClass();
            u0Var.getClass();
            Intent intent2 = new Intent(this, (Class<?>) Forerunner935NotificationsAndAlertsActivity.class);
            intent2.putExtra("GCM_deviceSettings", deviceSettingsDTO);
            intent2.putExtra("GCM_deviceEnumValue", u0Var);
            intent2.putExtra("GCM_deviceName", str3);
            startActivityForResult(intent2, 10);
        }
    }
}
