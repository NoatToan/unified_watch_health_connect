package com.garmin.android.apps.connectmobile.settings.devices;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexOneLineButton;

/* JADX INFO: loaded from: classes10.dex */
public class Vivofit2DeviceSettingsScreensDefault extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public GCMComplexOneLineButton f42229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public GCMComplexOneLineButton f42230b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public GCMComplexOneLineButton f42231c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public GCMComplexOneLineButton f42232d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public GCMComplexOneLineButton f42233e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public GCMComplexOneLineButton f42234f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public GCMComplexOneLineButton f42235g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public DeviceSettingsDTO f42236h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final a f42237i = new a();

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view2) {
            Vivofit2DeviceSettingsScreensDefault vivofit2DeviceSettingsScreensDefault = Vivofit2DeviceSettingsScreensDefault.this;
            DeviceSettingsDTO deviceSettingsDTO = vivofit2DeviceSettingsScreensDefault.f42236h;
            int i14 = Vivofit2DeviceSettingsScreensDuringActivity.f42245l;
            Intent intent = new Intent(vivofit2DeviceSettingsScreensDefault, (Class<?>) Vivofit2DeviceSettingsScreensDuringActivity.class);
            intent.putExtra("GCM_deviceSettings", deviceSettingsDTO);
            vivofit2DeviceSettingsScreensDefault.startActivityForResult(intent, 20);
        }
    }

    public class b implements CompoundButton.OnCheckedChangeListener {
        public b() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public final void onCheckedChanged(CompoundButton compoundButton, boolean z14) {
            Vivofit2DeviceSettingsScreensDefault vivofit2DeviceSettingsScreensDefault = Vivofit2DeviceSettingsScreensDefault.this;
            vivofit2DeviceSettingsScreensDefault.f42236h.f33872g.x0(Boolean.valueOf(z14));
            if (z14) {
                return;
            }
            vivofit2DeviceSettingsScreensDefault.f42230b.j();
        }
    }

    public class c implements CompoundButton.OnCheckedChangeListener {
        public c() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public final void onCheckedChanged(CompoundButton compoundButton, boolean z14) {
            Vivofit2DeviceSettingsScreensDefault vivofit2DeviceSettingsScreensDefault = Vivofit2DeviceSettingsScreensDefault.this;
            vivofit2DeviceSettingsScreensDefault.f42236h.f33872g.j0(Boolean.valueOf(z14));
            if (z14) {
                vivofit2DeviceSettingsScreensDefault.f42229a.k();
            }
        }
    }

    public class d implements CompoundButton.OnCheckedChangeListener {
        public d() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public final void onCheckedChanged(CompoundButton compoundButton, boolean z14) {
            Vivofit2DeviceSettingsScreensDefault.this.f42236h.f33872g.w0(Boolean.valueOf(z14));
        }
    }

    public class e implements CompoundButton.OnCheckedChangeListener {
        public e() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public final void onCheckedChanged(CompoundButton compoundButton, boolean z14) {
            Vivofit2DeviceSettingsScreensDefault.this.f42236h.f33872g.k0(Boolean.valueOf(z14));
        }
    }

    public class f implements CompoundButton.OnCheckedChangeListener {
        public f() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public final void onCheckedChanged(CompoundButton compoundButton, boolean z14) {
            Vivofit2DeviceSettingsScreensDefault.this.f42236h.f33872g.i0(Boolean.valueOf(z14));
        }
    }

    public class g implements CompoundButton.OnCheckedChangeListener {
        public g() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public final void onCheckedChanged(CompoundButton compoundButton, boolean z14) {
            Vivofit2DeviceSettingsScreensDefault.this.f42236h.f33872g.n0(Boolean.valueOf(z14));
        }
    }

    @Override // android.app.Activity
    public final void finish() {
        getIntent().putExtra("GCM_deviceSettings", this.f42236h);
        setResult(-1, getIntent());
        super.finish();
    }

    @Override // com.garmin.android.apps.connectmobile.z1, androidx.fragment.app.m, b.g, android.app.Activity
    public final void onActivityResult(int i14, int i15, Intent intent) {
        super.onActivityResult(i14, i15, intent);
        if (i14 == 20 && i15 == -1) {
            DeviceSettingsDTO deviceSettingsDTO = (intent == null || intent.getExtras() == null) ? null : (DeviceSettingsDTO) intent.getExtras().get("GCM_deviceSettings");
            if (deviceSettingsDTO != null) {
                this.f42236h = deviceSettingsDTO;
                getIntent().putExtra("GCM_deviceSettings", this.f42236h);
                setResult(-1, getIntent());
            }
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.gcm3_device_settings_vivofit2_visible_screens);
        initActionBar(true, R.string.device_setting_visible_screens);
        if (getIntent().getExtras() != null) {
            this.f42236h = (DeviceSettingsDTO) getIntent().getExtras().getParcelable("GCM_deviceSettings");
        }
        if (this.f42236h == null) {
            i2.f(a2.SETTINGS, "Vivofit2DeviceSettingsScreensDefault", "Invalid device settings object while entering device settings visible screens screen!");
            finish();
            return;
        }
        ((GCMComplexOneLineButton) findViewById(R.id.device_settings_vivofit2_during_an_activity)).setOnClickListener(this.f42237i);
        GCMComplexOneLineButton gCMComplexOneLineButton = (GCMComplexOneLineButton) findViewById(R.id.device_settings_vivofit2_screen_steps);
        this.f42231c = gCMComplexOneLineButton;
        gCMComplexOneLineButton.k();
        this.f42231c.setEnabled(false);
        GCMComplexOneLineButton gCMComplexOneLineButton2 = (GCMComplexOneLineButton) findViewById(R.id.device_settings_vivofit2_screen_time);
        this.f42229a = gCMComplexOneLineButton2;
        gCMComplexOneLineButton2.setOnCheckedChangeListener(new b());
        GCMComplexOneLineButton gCMComplexOneLineButton3 = (GCMComplexOneLineButton) findViewById(R.id.device_settings_vivofit2_screen_date);
        this.f42230b = gCMComplexOneLineButton3;
        gCMComplexOneLineButton3.setOnCheckedChangeListener(new c());
        GCMComplexOneLineButton gCMComplexOneLineButton4 = (GCMComplexOneLineButton) findViewById(R.id.device_settings_vivofit2_screen_steps_goal);
        this.f42232d = gCMComplexOneLineButton4;
        gCMComplexOneLineButton4.setOnCheckedChangeListener(new d());
        GCMComplexOneLineButton gCMComplexOneLineButton5 = (GCMComplexOneLineButton) findViewById(R.id.device_settings_vivofit2_screen_distance);
        this.f42233e = gCMComplexOneLineButton5;
        gCMComplexOneLineButton5.setOnCheckedChangeListener(new e());
        GCMComplexOneLineButton gCMComplexOneLineButton6 = (GCMComplexOneLineButton) findViewById(R.id.device_settings_vivofit2_screen_calories);
        this.f42234f = gCMComplexOneLineButton6;
        gCMComplexOneLineButton6.setOnCheckedChangeListener(new f());
        GCMComplexOneLineButton gCMComplexOneLineButton7 = (GCMComplexOneLineButton) findViewById(R.id.device_settings_vivofit2_screen_heart_rate);
        this.f42235g = gCMComplexOneLineButton7;
        gCMComplexOneLineButton7.setOnCheckedChangeListener(new g());
        boolean zBooleanValue = this.f42236h.f33872g.e0().booleanValue();
        GCMComplexOneLineButton gCMComplexOneLineButton8 = this.f42229a;
        if (zBooleanValue) {
            gCMComplexOneLineButton8.k();
            boolean zBooleanValue2 = this.f42236h.f33872g.G().booleanValue();
            GCMComplexOneLineButton gCMComplexOneLineButton9 = this.f42230b;
            if (zBooleanValue2) {
                gCMComplexOneLineButton9.k();
            } else {
                gCMComplexOneLineButton9.j();
            }
        } else {
            gCMComplexOneLineButton8.j();
            this.f42230b.j();
        }
        boolean zBooleanValue3 = this.f42236h.f33872g.c0().booleanValue();
        GCMComplexOneLineButton gCMComplexOneLineButton10 = this.f42232d;
        if (zBooleanValue3) {
            gCMComplexOneLineButton10.k();
        } else {
            gCMComplexOneLineButton10.j();
        }
        boolean zBooleanValue4 = this.f42236h.f33872g.H().booleanValue();
        GCMComplexOneLineButton gCMComplexOneLineButton11 = this.f42233e;
        if (zBooleanValue4) {
            gCMComplexOneLineButton11.k();
        } else {
            gCMComplexOneLineButton11.j();
        }
        boolean zBooleanValue5 = this.f42236h.f33872g.F().booleanValue();
        GCMComplexOneLineButton gCMComplexOneLineButton12 = this.f42234f;
        if (zBooleanValue5) {
            gCMComplexOneLineButton12.k();
        } else {
            gCMComplexOneLineButton12.j();
        }
        boolean zBooleanValue6 = this.f42236h.f33872g.M().booleanValue();
        GCMComplexOneLineButton gCMComplexOneLineButton13 = this.f42235g;
        if (zBooleanValue6) {
            gCMComplexOneLineButton13.k();
        } else {
            gCMComplexOneLineButton13.j();
        }
    }
}
