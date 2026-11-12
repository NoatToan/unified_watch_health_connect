package com.garmin.android.apps.connectmobile.settings.devices;

import android.os.Bundle;
import android.widget.CompoundButton;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexOneLineButton;

/* JADX INFO: loaded from: classes10.dex */
public class VivosmartDeviceSettingsScreens extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f42402m = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public GCMComplexOneLineButton f42403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public GCMComplexOneLineButton f42404b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public GCMComplexOneLineButton f42405c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public GCMComplexOneLineButton f42406d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public GCMComplexOneLineButton f42407e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public GCMComplexOneLineButton f42408f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public GCMComplexOneLineButton f42409g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public GCMComplexOneLineButton f42410h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public GCMComplexOneLineButton f42411i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public GCMComplexOneLineButton f42412j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public GCMComplexOneLineButton f42413k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public DeviceSettingsDTO f42414l;

    public class a implements CompoundButton.OnCheckedChangeListener {
        public a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public final void onCheckedChanged(CompoundButton compoundButton, boolean z14) {
            VivosmartDeviceSettingsScreens.this.f42414l.f33872g.w0(Boolean.valueOf(z14));
        }
    }

    public class b implements CompoundButton.OnCheckedChangeListener {
        public b() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public final void onCheckedChanged(CompoundButton compoundButton, boolean z14) {
            VivosmartDeviceSettingsScreens.this.f42414l.f33872g.h0("page_move_bar", Boolean.valueOf(z14));
        }
    }

    public class c implements CompoundButton.OnCheckedChangeListener {
        public c() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public final void onCheckedChanged(CompoundButton compoundButton, boolean z14) {
            VivosmartDeviceSettingsScreens.this.f42414l.f33872g.i0(Boolean.valueOf(z14));
        }
    }

    public class d implements CompoundButton.OnCheckedChangeListener {
        public d() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public final void onCheckedChanged(CompoundButton compoundButton, boolean z14) {
            VivosmartDeviceSettingsScreens.this.f42414l.f33872g.k0(Boolean.valueOf(z14));
        }
    }

    public class e implements CompoundButton.OnCheckedChangeListener {
        public e() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public final void onCheckedChanged(CompoundButton compoundButton, boolean z14) {
            VivosmartDeviceSettingsScreens.this.f42414l.f33872g.n0(Boolean.valueOf(z14));
        }
    }

    public class f implements CompoundButton.OnCheckedChangeListener {
        public f() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public final void onCheckedChanged(CompoundButton compoundButton, boolean z14) {
            VivosmartDeviceSettingsScreens.this.f42414l.f33872g.h0("page_bike_speed", Boolean.valueOf(z14));
        }
    }

    public class g implements CompoundButton.OnCheckedChangeListener {
        public g() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public final void onCheckedChanged(CompoundButton compoundButton, boolean z14) {
            VivosmartDeviceSettingsScreens.this.f42414l.f33872g.p0(Boolean.valueOf(z14));
        }
    }

    public class h implements CompoundButton.OnCheckedChangeListener {
        public h() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public final void onCheckedChanged(CompoundButton compoundButton, boolean z14) {
            VivosmartDeviceSettingsScreens.this.f42414l.f33872g.o0(Boolean.valueOf(z14));
        }
    }

    public class i implements CompoundButton.OnCheckedChangeListener {
        public i() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public final void onCheckedChanged(CompoundButton compoundButton, boolean z14) {
            VivosmartDeviceSettingsScreens.this.f42414l.f33872g.h0("page_virb_remote", Boolean.valueOf(z14));
        }
    }

    @Override // android.app.Activity
    public final void finish() {
        getIntent().putExtra("GCM_deviceSettings", this.f42414l);
        setResult(-1, getIntent());
        super.finish();
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.gcm3_device_settings_vivosmart_visible_screens);
        initActionBar(true, R.string.device_setting_visible_screens);
        if (getIntent().getExtras() != null) {
            this.f42414l = (DeviceSettingsDTO) getIntent().getExtras().getParcelable("GCM_deviceSettings");
        }
        if (this.f42414l == null) {
            i2.f(a2.SETTINGS, "VivosmartDeviceSettingsScreens", "Invalid device settings object while entering device settings visible screens screen!");
            finish();
            return;
        }
        GCMComplexOneLineButton gCMComplexOneLineButton = (GCMComplexOneLineButton) findViewById(R.id.device_settings_vivosmart_screen_time_date);
        this.f42403a = gCMComplexOneLineButton;
        gCMComplexOneLineButton.k();
        this.f42403a.setEnabled(false);
        GCMComplexOneLineButton gCMComplexOneLineButton2 = (GCMComplexOneLineButton) findViewById(R.id.device_settings_vivosmart_screen_steps);
        this.f42404b = gCMComplexOneLineButton2;
        gCMComplexOneLineButton2.k();
        this.f42404b.setEnabled(false);
        GCMComplexOneLineButton gCMComplexOneLineButton3 = (GCMComplexOneLineButton) findViewById(R.id.device_settings_vivosmart_screen_steps_goal);
        this.f42405c = gCMComplexOneLineButton3;
        gCMComplexOneLineButton3.setOnCheckedChangeListener(new a());
        GCMComplexOneLineButton gCMComplexOneLineButton4 = (GCMComplexOneLineButton) findViewById(R.id.device_settings_vivosmart_screen_move_bar);
        this.f42406d = gCMComplexOneLineButton4;
        gCMComplexOneLineButton4.setOnCheckedChangeListener(new b());
        GCMComplexOneLineButton gCMComplexOneLineButton5 = (GCMComplexOneLineButton) findViewById(R.id.device_settings_vivosmart_screen_calories);
        this.f42407e = gCMComplexOneLineButton5;
        gCMComplexOneLineButton5.setOnCheckedChangeListener(new c());
        GCMComplexOneLineButton gCMComplexOneLineButton6 = (GCMComplexOneLineButton) findViewById(R.id.device_settings_vivosmart_screen_distance);
        this.f42408f = gCMComplexOneLineButton6;
        gCMComplexOneLineButton6.setOnCheckedChangeListener(new d());
        GCMComplexOneLineButton gCMComplexOneLineButton7 = (GCMComplexOneLineButton) findViewById(R.id.device_settings_vivosmart_screen_heart_rate);
        this.f42409g = gCMComplexOneLineButton7;
        gCMComplexOneLineButton7.setOnCheckedChangeListener(new e());
        GCMComplexOneLineButton gCMComplexOneLineButton8 = (GCMComplexOneLineButton) findViewById(R.id.device_settings_vivosmart_screen_bike_speed);
        this.f42410h = gCMComplexOneLineButton8;
        gCMComplexOneLineButton8.setOnCheckedChangeListener(new f());
        GCMComplexOneLineButton gCMComplexOneLineButton9 = (GCMComplexOneLineButton) findViewById(R.id.device_settings_vivosmart_screen_notification);
        this.f42411i = gCMComplexOneLineButton9;
        gCMComplexOneLineButton9.setOnCheckedChangeListener(new g());
        GCMComplexOneLineButton gCMComplexOneLineButton10 = (GCMComplexOneLineButton) findViewById(R.id.device_settings_vivosmart_screen_music);
        this.f42412j = gCMComplexOneLineButton10;
        gCMComplexOneLineButton10.setOnCheckedChangeListener(new h());
        GCMComplexOneLineButton gCMComplexOneLineButton11 = (GCMComplexOneLineButton) findViewById(R.id.device_settings_vivosmart_screen_virb_remote);
        this.f42413k = gCMComplexOneLineButton11;
        gCMComplexOneLineButton11.setOnCheckedChangeListener(new i());
        boolean zBooleanValue = this.f42414l.f33872g.c0().booleanValue();
        GCMComplexOneLineButton gCMComplexOneLineButton12 = this.f42405c;
        if (zBooleanValue) {
            gCMComplexOneLineButton12.k();
        } else {
            gCMComplexOneLineButton12.j();
        }
        boolean zI = this.f42414l.f33872g.I("page_move_bar");
        GCMComplexOneLineButton gCMComplexOneLineButton13 = this.f42406d;
        if (zI) {
            gCMComplexOneLineButton13.k();
        } else {
            gCMComplexOneLineButton13.j();
        }
        boolean zBooleanValue2 = this.f42414l.f33872g.F().booleanValue();
        GCMComplexOneLineButton gCMComplexOneLineButton14 = this.f42407e;
        if (zBooleanValue2) {
            gCMComplexOneLineButton14.k();
        } else {
            gCMComplexOneLineButton14.j();
        }
        boolean zBooleanValue3 = this.f42414l.f33872g.H().booleanValue();
        GCMComplexOneLineButton gCMComplexOneLineButton15 = this.f42408f;
        if (zBooleanValue3) {
            gCMComplexOneLineButton15.k();
        } else {
            gCMComplexOneLineButton15.j();
        }
        boolean zBooleanValue4 = this.f42414l.f33872g.M().booleanValue();
        GCMComplexOneLineButton gCMComplexOneLineButton16 = this.f42409g;
        if (zBooleanValue4) {
            gCMComplexOneLineButton16.k();
        } else {
            gCMComplexOneLineButton16.j();
        }
        boolean zI2 = this.f42414l.f33872g.I("page_bike_speed");
        GCMComplexOneLineButton gCMComplexOneLineButton17 = this.f42410h;
        if (zI2) {
            gCMComplexOneLineButton17.k();
        } else {
            gCMComplexOneLineButton17.j();
        }
        boolean zBooleanValue5 = this.f42414l.f33872g.a0().booleanValue();
        GCMComplexOneLineButton gCMComplexOneLineButton18 = this.f42411i;
        if (zBooleanValue5) {
            gCMComplexOneLineButton18.k();
        } else {
            gCMComplexOneLineButton18.j();
        }
        boolean zBooleanValue6 = this.f42414l.f33872g.Z().booleanValue();
        GCMComplexOneLineButton gCMComplexOneLineButton19 = this.f42412j;
        if (zBooleanValue6) {
            gCMComplexOneLineButton19.k();
        } else {
            gCMComplexOneLineButton19.j();
        }
        boolean zBooleanValue7 = this.f42414l.f33872g.f0().booleanValue();
        GCMComplexOneLineButton gCMComplexOneLineButton20 = this.f42413k;
        if (zBooleanValue7) {
            gCMComplexOneLineButton20.k();
        } else {
            gCMComplexOneLineButton20.j();
        }
    }
}
