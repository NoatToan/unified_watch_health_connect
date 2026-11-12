package com.garmin.android.apps.connectmobile.settings.devices;

import android.os.Bundle;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexOneLineButton;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexTwoLineButton;
import com.garmin.android.gfdi.configuration.SupportedCapability;
import ng1.p;
import ng1.w;
import ng1.x;
import org.apache.commons.lang3.BooleanUtils;
import org.koin.java.KoinJavaComponent;
import rd2.h;
import zb0.d0;
import zb0.u0;

/* JADX INFO: loaded from: classes10.dex */
public class DeviceSettings extends p {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f41956z = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f41957m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f41958n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f41959o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f41960p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f41961q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public GCMComplexOneLineButton f41962r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public GCMComplexOneLineButton f41963t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public GCMComplexOneLineButton f41964v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public GCMComplexTwoLineButton f41965w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public GCMComplexOneLineButton f41966x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public GCMComplexOneLineButton f41967y;

    public void ea() {
        this.f41965w = (GCMComplexTwoLineButton) findViewById(R.id.device_settings_audio_prompts_btn);
        if (km2.a.d(this.f41957m, km2.a.b())) {
            this.f41965w.setButtonTopLabel(getString(R.string.device_settings_audio_prompts));
            boolean zN = ((d0) KoinJavaComponent.get(d0.class)).n(this.f41957m);
            GCMComplexTwoLineButton gCMComplexTwoLineButton = this.f41965w;
            if (zN) {
                gCMComplexTwoLineButton.setButtonBottomLeftLabel(getString(R.string.lbl_on));
            } else {
                gCMComplexTwoLineButton.setButtonBottomLeftLabel(getString(R.string.lbl_off));
            }
            this.f41965w.setOnClickListener(new x(this, 1));
            this.f41965w.setVisibility(0);
        }
    }

    public void fa() {
        this.f41962r = (GCMComplexOneLineButton) findViewById(R.id.device_settings_auto_upload_btn);
        h hVarD = h.d();
        long j8 = this.f41957m;
        hVarD.getClass();
        boolean zE = h.e(1, j8);
        GCMComplexOneLineButton gCMComplexOneLineButton = this.f41962r;
        if (zE) {
            gCMComplexOneLineButton.k();
        } else {
            gCMComplexOneLineButton.j();
        }
        ia(1, Boolean.valueOf(zE));
        this.f41962r.setOnCheckedChangeListener(new w(this, 1));
        if (u0.n(this.f41958n, u0.G4) || u0.n(this.f41958n, u0.I4)) {
            this.f41962r.setEnabled(true);
        } else {
            this.f41962r.setEnabled(false);
        }
    }

    public void ga() {
        GCMComplexOneLineButton gCMComplexOneLineButton = (GCMComplexOneLineButton) findViewById(R.id.device_settings_weather_btn);
        this.f41963t = gCMComplexOneLineButton;
        if (!this.f41959o) {
            gCMComplexOneLineButton.setVisibility(8);
            return;
        }
        h hVarD = h.d();
        long j8 = this.f41957m;
        hVarD.getClass();
        boolean zE = h.e(2, j8);
        GCMComplexOneLineButton gCMComplexOneLineButton2 = this.f41963t;
        if (zE) {
            gCMComplexOneLineButton2.k();
        } else {
            gCMComplexOneLineButton2.j();
        }
        ia(2, Boolean.valueOf(zE));
        this.f41963t.setOnCheckedChangeListener(new w(this, 2));
    }

    public void ha() {
        GCMComplexOneLineButton gCMComplexOneLineButton = (GCMComplexOneLineButton) findViewById(R.id.device_settings_weather_alerts_btn);
        this.f41964v = gCMComplexOneLineButton;
        if (!this.f41959o || !this.f41960p) {
            gCMComplexOneLineButton.setVisibility(8);
            return;
        }
        h hVarD = h.d();
        long j8 = this.f41957m;
        hVarD.getClass();
        boolean zE = h.e(3, j8);
        GCMComplexOneLineButton gCMComplexOneLineButton2 = this.f41964v;
        if (zE) {
            gCMComplexOneLineButton2.k();
        } else {
            gCMComplexOneLineButton2.j();
        }
        h hVarD2 = h.d();
        long j14 = this.f41957m;
        hVarD2.getClass();
        if (!h.e(2, j14)) {
            this.f41964v.setEnabled(false);
        }
        this.f41964v.setOnCheckedChangeListener(new w(this, 0));
    }

    public final synchronized void ia(int i14, Boolean bool) {
        try {
            if (((l80.b) KoinJavaComponent.get(l80.b.class)).a(this.f41957m)) {
                if (i14 == 1) {
                    hk0.a.f().o(this.f41957m, bool.booleanValue());
                    a2 a2Var = a2.SETTINGS;
                    StringBuilder sb3 = new StringBuilder("Called DeviceManager.setAutoUploadEnabled(");
                    sb3.append(bool.booleanValue() ? BooleanUtils.ON : BooleanUtils.OFF);
                    sb3.append(") for device ID [");
                    sb3.append(this.f41957m);
                    sb3.append("].");
                    i2.a(a2Var, "DeviceSettings", sb3.toString());
                } else if (i14 == 2) {
                    hk0.a.f().p(this.f41957m, bool.booleanValue());
                    a2 a2Var2 = a2.SETTINGS;
                    StringBuilder sb4 = new StringBuilder("Called DeviceManager.setWeatherConditionsEnabled(");
                    sb4.append(bool.booleanValue() ? BooleanUtils.ON : BooleanUtils.OFF);
                    sb4.append(") for device ID [");
                    sb4.append(this.f41957m);
                    sb4.append("].");
                    i2.a(a2Var2, "DeviceSettings", sb4.toString());
                }
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    @Override // ng1.p, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        super.setContentView(R.layout.gcm3_device_settings);
        super.initActionBar(true, getString(R.string.lbl_settings));
        long longExtra = getIntent().getLongExtra("GCM_deviceUnitID", -1L);
        String stringExtra = getIntent().getStringExtra("GCM_deviceProductNbr");
        this.f41958n = stringExtra;
        if (longExtra < 0 || stringExtra == null) {
            finish();
            return;
        }
        if (((u0) u0.f203782n6.get(stringExtra)) == null) {
            finish();
            return;
        }
        this.f41957m = longExtra;
        this.f41959o = km2.a.i(longExtra, null, SupportedCapability.WEATHER_CONDITIONS.ordinal());
        this.f41960p = km2.a.i(this.f41957m, null, SupportedCapability.WEATHER_ALERTS.ordinal());
        this.f41961q = km2.a.i(this.f41957m, null, SupportedCapability.WIFI_SETUP.ordinal());
        fa();
        ga();
        ha();
        ea();
        a2 a2Var = a2.SETTINGS;
        i2.f36769a.getClass();
        i2.a.k(a2Var, "DeviceSettings", "initPhysioTrueUpField");
        GCMComplexOneLineButton gCMComplexOneLineButton = (GCMComplexOneLineButton) findViewById(R.id.device_settings_forerunner_physio_trueup);
        this.f41966x = gCMComplexOneLineButton;
        gCMComplexOneLineButton.setVisibility(8);
        DeviceSettingsDTO deviceSettingsDTO = this.f125985k;
        if (deviceSettingsDTO != null) {
            if (deviceSettingsDTO.f33873g1 != null) {
                this.f41966x.setVisibility(0);
                this.f41966x.setRightElement(GCMComplexOneLineButton.a.SWITCH);
                GCMComplexOneLineButton gCMComplexOneLineButton2 = this.f41966x;
                Boolean bool = this.f125985k.f33873g1;
                gCMComplexOneLineButton2.i(bool != null ? bool.booleanValue() : false);
            }
            this.f41966x.setOnCheckedChangeListener(new w(this, 3));
        }
        GCMComplexOneLineButton gCMComplexOneLineButton3 = (GCMComplexOneLineButton) findViewById(R.id.device_settings_wifi_btn);
        this.f41967y = gCMComplexOneLineButton3;
        gCMComplexOneLineButton3.setVisible(this.f41961q);
        this.f41967y.setOnClickListener(new x(this, 0));
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (this.f41965w != null) {
            boolean zN = ((d0) KoinJavaComponent.get(d0.class)).n(this.f41957m);
            GCMComplexTwoLineButton gCMComplexTwoLineButton = this.f41965w;
            if (zN) {
                gCMComplexTwoLineButton.setButtonBottomLeftLabel(getString(R.string.lbl_on));
            } else {
                gCMComplexTwoLineButton.setButtonBottomLeftLabel(getString(R.string.lbl_off));
            }
        }
    }
}
