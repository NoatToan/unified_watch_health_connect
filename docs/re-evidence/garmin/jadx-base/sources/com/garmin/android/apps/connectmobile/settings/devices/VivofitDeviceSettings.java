package com.garmin.android.apps.connectmobile.settings.devices;

import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.settings.devices.VivofitDeviceSettings;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexOneLineButton;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexTwoLineButton;
import mt0.h0;
import ng1.c1;
import ng1.j;

/* JADX INFO: loaded from: classes10.dex */
public class VivofitDeviceSettings extends j {
    public static final /* synthetic */ int B = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public GCMComplexTwoLineButton f42292t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public GCMComplexTwoLineButton f42293v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public GCMComplexTwoLineButton f42294w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final a f42295x = new a();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final b f42296y = new b();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final c f42297z = new c();
    public final h0 A = new h0(this, 20);

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view2) {
            VivofitDeviceSettings vivofitDeviceSettings = VivofitDeviceSettings.this;
            int iOrdinal = vivofitDeviceSettings.f125985k.h0().ordinal();
            androidx.appcompat.app.e.a aVar = new androidx.appcompat.app.e.a(vivofitDeviceSettings);
            aVar.setTitle(R.string.lbl_time_format).setSingleChoiceItems(DeviceSettingsDTO.p.a(vivofitDeviceSettings), iOrdinal, new kx0.f(this, 28));
            aVar.create().show();
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view2) {
            VivofitDeviceSettings vivofitDeviceSettings = VivofitDeviceSettings.this;
            int iOrdinal = vivofitDeviceSettings.f125985k.a0().ordinal();
            androidx.appcompat.app.e.a aVar = new androidx.appcompat.app.e.a(vivofitDeviceSettings);
            aVar.setTitle(R.string.lbl_date_format).setSingleChoiceItems(DeviceSettingsDTO.j.a(vivofitDeviceSettings), iOrdinal, new kx0.f(this, 29));
            aVar.create().show();
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view2) {
            VivofitDeviceSettings vivofitDeviceSettings = VivofitDeviceSettings.this;
            int iOrdinal = vivofitDeviceSettings.f125985k.c0().ordinal();
            androidx.appcompat.app.e.a aVar = new androidx.appcompat.app.e.a(vivofitDeviceSettings);
            aVar.setTitle(R.string.pref_measurement_units).setSingleChoiceItems(DeviceSettingsDTO.l.a(vivofitDeviceSettings), iOrdinal, new c1(this, 0));
            aVar.create().show();
        }
    }

    @Override // ng1.j
    public final int ea() {
        return R.layout.gcm3_device_settings_vivofit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ng1.j, ng1.p, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        GCMComplexTwoLineButton gCMComplexTwoLineButton = (GCMComplexTwoLineButton) findViewById(R.id.device_settings_vivofit_time_format_btn);
        this.f42292t = gCMComplexTwoLineButton;
        gCMComplexTwoLineButton.setOnClickListener(this.f42295x);
        GCMComplexTwoLineButton gCMComplexTwoLineButton2 = (GCMComplexTwoLineButton) findViewById(R.id.device_settings_vivofit_date_format_btn);
        this.f42293v = gCMComplexTwoLineButton2;
        gCMComplexTwoLineButton2.setOnClickListener(this.f42296y);
        GCMComplexTwoLineButton gCMComplexTwoLineButton3 = (GCMComplexTwoLineButton) findViewById(R.id.device_settings_vivofit_measurement_units_btn);
        this.f42294w = gCMComplexTwoLineButton3;
        gCMComplexTwoLineButton3.setOnClickListener(this.f42297z);
        ((GCMComplexOneLineButton) findViewById(R.id.device_settings_vivofit_sleep_time)).setOnClickListener(this.A);
        GCMComplexOneLineButton gCMComplexOneLineButton = (GCMComplexOneLineButton) findViewById(R.id.device_settings_vivofit_vivohub);
        final Object[] objArr = 0 == true ? 1 : 0;
        gCMComplexOneLineButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: ng1.b1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ VivofitDeviceSettings f125913b;

            {
                this.f125913b = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z14) {
                int i14 = objArr;
                VivofitDeviceSettings vivofitDeviceSettings = this.f125913b;
                switch (i14) {
                    case 0:
                        int i15 = VivofitDeviceSettings.B;
                        DeviceSettingsDTO deviceSettingsDTO = vivofitDeviceSettings.f125985k;
                        deviceSettingsDTO.J0 = Boolean.valueOf(z14);
                        deviceSettingsDTO.S1("vivohubEnabled");
                        break;
                    case 1:
                        int i16 = VivofitDeviceSettings.B;
                        vivofitDeviceSettings.f125985k.f33872g.x0(Boolean.valueOf(z14));
                        break;
                    case 2:
                        int i17 = VivofitDeviceSettings.B;
                        vivofitDeviceSettings.f125985k.f33872g.j0(Boolean.valueOf(z14));
                        break;
                    case 3:
                        int i18 = VivofitDeviceSettings.B;
                        vivofitDeviceSettings.f125985k.f33872g.w0(Boolean.valueOf(z14));
                        break;
                    case 4:
                        int i19 = VivofitDeviceSettings.B;
                        vivofitDeviceSettings.f125985k.f33872g.k0(Boolean.valueOf(z14));
                        break;
                    case 5:
                        int i24 = VivofitDeviceSettings.B;
                        vivofitDeviceSettings.f125985k.f33872g.i0(Boolean.valueOf(z14));
                        break;
                    default:
                        int i25 = VivofitDeviceSettings.B;
                        vivofitDeviceSettings.f125985k.f33872g.n0(Boolean.valueOf(z14));
                        break;
                }
            }
        });
        if (this.f125977c.u2()) {
            gCMComplexOneLineButton.setVisibility(0);
        }
        GCMComplexOneLineButton gCMComplexOneLineButton2 = (GCMComplexOneLineButton) findViewById(R.id.device_settings_vivofit_screen_steps);
        gCMComplexOneLineButton2.k();
        gCMComplexOneLineButton2.setEnabled(false);
        GCMComplexOneLineButton gCMComplexOneLineButton3 = (GCMComplexOneLineButton) findViewById(R.id.device_settings_vivofit_screen_time);
        final int i14 = 1;
        gCMComplexOneLineButton3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: ng1.b1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ VivofitDeviceSettings f125913b;

            {
                this.f125913b = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z14) {
                int i15 = i14;
                VivofitDeviceSettings vivofitDeviceSettings = this.f125913b;
                switch (i15) {
                    case 0:
                        int i16 = VivofitDeviceSettings.B;
                        DeviceSettingsDTO deviceSettingsDTO = vivofitDeviceSettings.f125985k;
                        deviceSettingsDTO.J0 = Boolean.valueOf(z14);
                        deviceSettingsDTO.S1("vivohubEnabled");
                        break;
                    case 1:
                        int i17 = VivofitDeviceSettings.B;
                        vivofitDeviceSettings.f125985k.f33872g.x0(Boolean.valueOf(z14));
                        break;
                    case 2:
                        int i18 = VivofitDeviceSettings.B;
                        vivofitDeviceSettings.f125985k.f33872g.j0(Boolean.valueOf(z14));
                        break;
                    case 3:
                        int i19 = VivofitDeviceSettings.B;
                        vivofitDeviceSettings.f125985k.f33872g.w0(Boolean.valueOf(z14));
                        break;
                    case 4:
                        int i110 = VivofitDeviceSettings.B;
                        vivofitDeviceSettings.f125985k.f33872g.k0(Boolean.valueOf(z14));
                        break;
                    case 5:
                        int i24 = VivofitDeviceSettings.B;
                        vivofitDeviceSettings.f125985k.f33872g.i0(Boolean.valueOf(z14));
                        break;
                    default:
                        int i25 = VivofitDeviceSettings.B;
                        vivofitDeviceSettings.f125985k.f33872g.n0(Boolean.valueOf(z14));
                        break;
                }
            }
        });
        GCMComplexOneLineButton gCMComplexOneLineButton4 = (GCMComplexOneLineButton) findViewById(R.id.device_settings_vivofit_screen_date);
        final int i15 = 2;
        gCMComplexOneLineButton4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: ng1.b1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ VivofitDeviceSettings f125913b;

            {
                this.f125913b = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z14) {
                int i16 = i15;
                VivofitDeviceSettings vivofitDeviceSettings = this.f125913b;
                switch (i16) {
                    case 0:
                        int i17 = VivofitDeviceSettings.B;
                        DeviceSettingsDTO deviceSettingsDTO = vivofitDeviceSettings.f125985k;
                        deviceSettingsDTO.J0 = Boolean.valueOf(z14);
                        deviceSettingsDTO.S1("vivohubEnabled");
                        break;
                    case 1:
                        int i18 = VivofitDeviceSettings.B;
                        vivofitDeviceSettings.f125985k.f33872g.x0(Boolean.valueOf(z14));
                        break;
                    case 2:
                        int i19 = VivofitDeviceSettings.B;
                        vivofitDeviceSettings.f125985k.f33872g.j0(Boolean.valueOf(z14));
                        break;
                    case 3:
                        int i110 = VivofitDeviceSettings.B;
                        vivofitDeviceSettings.f125985k.f33872g.w0(Boolean.valueOf(z14));
                        break;
                    case 4:
                        int i111 = VivofitDeviceSettings.B;
                        vivofitDeviceSettings.f125985k.f33872g.k0(Boolean.valueOf(z14));
                        break;
                    case 5:
                        int i24 = VivofitDeviceSettings.B;
                        vivofitDeviceSettings.f125985k.f33872g.i0(Boolean.valueOf(z14));
                        break;
                    default:
                        int i25 = VivofitDeviceSettings.B;
                        vivofitDeviceSettings.f125985k.f33872g.n0(Boolean.valueOf(z14));
                        break;
                }
            }
        });
        GCMComplexOneLineButton gCMComplexOneLineButton5 = (GCMComplexOneLineButton) findViewById(R.id.device_settings_vivofit_screen_steps_goal);
        final int i16 = 3;
        gCMComplexOneLineButton5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: ng1.b1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ VivofitDeviceSettings f125913b;

            {
                this.f125913b = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z14) {
                int i17 = i16;
                VivofitDeviceSettings vivofitDeviceSettings = this.f125913b;
                switch (i17) {
                    case 0:
                        int i18 = VivofitDeviceSettings.B;
                        DeviceSettingsDTO deviceSettingsDTO = vivofitDeviceSettings.f125985k;
                        deviceSettingsDTO.J0 = Boolean.valueOf(z14);
                        deviceSettingsDTO.S1("vivohubEnabled");
                        break;
                    case 1:
                        int i19 = VivofitDeviceSettings.B;
                        vivofitDeviceSettings.f125985k.f33872g.x0(Boolean.valueOf(z14));
                        break;
                    case 2:
                        int i110 = VivofitDeviceSettings.B;
                        vivofitDeviceSettings.f125985k.f33872g.j0(Boolean.valueOf(z14));
                        break;
                    case 3:
                        int i111 = VivofitDeviceSettings.B;
                        vivofitDeviceSettings.f125985k.f33872g.w0(Boolean.valueOf(z14));
                        break;
                    case 4:
                        int i112 = VivofitDeviceSettings.B;
                        vivofitDeviceSettings.f125985k.f33872g.k0(Boolean.valueOf(z14));
                        break;
                    case 5:
                        int i24 = VivofitDeviceSettings.B;
                        vivofitDeviceSettings.f125985k.f33872g.i0(Boolean.valueOf(z14));
                        break;
                    default:
                        int i25 = VivofitDeviceSettings.B;
                        vivofitDeviceSettings.f125985k.f33872g.n0(Boolean.valueOf(z14));
                        break;
                }
            }
        });
        GCMComplexOneLineButton gCMComplexOneLineButton6 = (GCMComplexOneLineButton) findViewById(R.id.device_settings_vivofit_screen_distance);
        final int i17 = 4;
        gCMComplexOneLineButton6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: ng1.b1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ VivofitDeviceSettings f125913b;

            {
                this.f125913b = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z14) {
                int i18 = i17;
                VivofitDeviceSettings vivofitDeviceSettings = this.f125913b;
                switch (i18) {
                    case 0:
                        int i19 = VivofitDeviceSettings.B;
                        DeviceSettingsDTO deviceSettingsDTO = vivofitDeviceSettings.f125985k;
                        deviceSettingsDTO.J0 = Boolean.valueOf(z14);
                        deviceSettingsDTO.S1("vivohubEnabled");
                        break;
                    case 1:
                        int i110 = VivofitDeviceSettings.B;
                        vivofitDeviceSettings.f125985k.f33872g.x0(Boolean.valueOf(z14));
                        break;
                    case 2:
                        int i111 = VivofitDeviceSettings.B;
                        vivofitDeviceSettings.f125985k.f33872g.j0(Boolean.valueOf(z14));
                        break;
                    case 3:
                        int i112 = VivofitDeviceSettings.B;
                        vivofitDeviceSettings.f125985k.f33872g.w0(Boolean.valueOf(z14));
                        break;
                    case 4:
                        int i113 = VivofitDeviceSettings.B;
                        vivofitDeviceSettings.f125985k.f33872g.k0(Boolean.valueOf(z14));
                        break;
                    case 5:
                        int i24 = VivofitDeviceSettings.B;
                        vivofitDeviceSettings.f125985k.f33872g.i0(Boolean.valueOf(z14));
                        break;
                    default:
                        int i25 = VivofitDeviceSettings.B;
                        vivofitDeviceSettings.f125985k.f33872g.n0(Boolean.valueOf(z14));
                        break;
                }
            }
        });
        GCMComplexOneLineButton gCMComplexOneLineButton7 = (GCMComplexOneLineButton) findViewById(R.id.device_settings_vivofit_screen_calories);
        final int i18 = 5;
        gCMComplexOneLineButton7.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: ng1.b1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ VivofitDeviceSettings f125913b;

            {
                this.f125913b = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z14) {
                int i19 = i18;
                VivofitDeviceSettings vivofitDeviceSettings = this.f125913b;
                switch (i19) {
                    case 0:
                        int i110 = VivofitDeviceSettings.B;
                        DeviceSettingsDTO deviceSettingsDTO = vivofitDeviceSettings.f125985k;
                        deviceSettingsDTO.J0 = Boolean.valueOf(z14);
                        deviceSettingsDTO.S1("vivohubEnabled");
                        break;
                    case 1:
                        int i111 = VivofitDeviceSettings.B;
                        vivofitDeviceSettings.f125985k.f33872g.x0(Boolean.valueOf(z14));
                        break;
                    case 2:
                        int i112 = VivofitDeviceSettings.B;
                        vivofitDeviceSettings.f125985k.f33872g.j0(Boolean.valueOf(z14));
                        break;
                    case 3:
                        int i113 = VivofitDeviceSettings.B;
                        vivofitDeviceSettings.f125985k.f33872g.w0(Boolean.valueOf(z14));
                        break;
                    case 4:
                        int i114 = VivofitDeviceSettings.B;
                        vivofitDeviceSettings.f125985k.f33872g.k0(Boolean.valueOf(z14));
                        break;
                    case 5:
                        int i24 = VivofitDeviceSettings.B;
                        vivofitDeviceSettings.f125985k.f33872g.i0(Boolean.valueOf(z14));
                        break;
                    default:
                        int i25 = VivofitDeviceSettings.B;
                        vivofitDeviceSettings.f125985k.f33872g.n0(Boolean.valueOf(z14));
                        break;
                }
            }
        });
        GCMComplexOneLineButton gCMComplexOneLineButton8 = (GCMComplexOneLineButton) findViewById(R.id.device_settings_vivofit_screen_heart_rate);
        final int i19 = 6;
        gCMComplexOneLineButton8.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: ng1.b1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ VivofitDeviceSettings f125913b;

            {
                this.f125913b = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z14) {
                int i110 = i19;
                VivofitDeviceSettings vivofitDeviceSettings = this.f125913b;
                switch (i110) {
                    case 0:
                        int i111 = VivofitDeviceSettings.B;
                        DeviceSettingsDTO deviceSettingsDTO = vivofitDeviceSettings.f125985k;
                        deviceSettingsDTO.J0 = Boolean.valueOf(z14);
                        deviceSettingsDTO.S1("vivohubEnabled");
                        break;
                    case 1:
                        int i112 = VivofitDeviceSettings.B;
                        vivofitDeviceSettings.f125985k.f33872g.x0(Boolean.valueOf(z14));
                        break;
                    case 2:
                        int i113 = VivofitDeviceSettings.B;
                        vivofitDeviceSettings.f125985k.f33872g.j0(Boolean.valueOf(z14));
                        break;
                    case 3:
                        int i114 = VivofitDeviceSettings.B;
                        vivofitDeviceSettings.f125985k.f33872g.w0(Boolean.valueOf(z14));
                        break;
                    case 4:
                        int i115 = VivofitDeviceSettings.B;
                        vivofitDeviceSettings.f125985k.f33872g.k0(Boolean.valueOf(z14));
                        break;
                    case 5:
                        int i24 = VivofitDeviceSettings.B;
                        vivofitDeviceSettings.f125985k.f33872g.i0(Boolean.valueOf(z14));
                        break;
                    default:
                        int i25 = VivofitDeviceSettings.B;
                        vivofitDeviceSettings.f125985k.f33872g.n0(Boolean.valueOf(z14));
                        break;
                }
            }
        });
        this.f42292t.setButtonBottomLeftLabel(getString(this.f125985k.h0().f34017b));
        this.f42293v.setButtonBottomLeftLabel(getString(this.f125985k.a0().f33976b));
        this.f42294w.setButtonBottomLeftLabel(getString(this.f125985k.c0().f33990b));
        if (this.f125985k.f33872g.e0().booleanValue()) {
            gCMComplexOneLineButton3.k();
        } else {
            gCMComplexOneLineButton3.j();
        }
        if (this.f125985k.f33872g.G().booleanValue()) {
            gCMComplexOneLineButton4.k();
        } else {
            gCMComplexOneLineButton4.j();
        }
        if (this.f125985k.f33872g.c0().booleanValue()) {
            gCMComplexOneLineButton5.k();
        } else {
            gCMComplexOneLineButton5.j();
        }
        if (this.f125985k.f33872g.H().booleanValue()) {
            gCMComplexOneLineButton6.k();
        } else {
            gCMComplexOneLineButton6.j();
        }
        if (this.f125985k.f33872g.F().booleanValue()) {
            gCMComplexOneLineButton7.k();
        } else {
            gCMComplexOneLineButton7.j();
        }
        if (this.f125985k.f33872g.M().booleanValue()) {
            gCMComplexOneLineButton8.k();
        } else {
            gCMComplexOneLineButton8.j();
        }
        Boolean bool = this.f125985k.J0;
        if (bool != null ? bool.booleanValue() : false) {
            gCMComplexOneLineButton.k();
        } else {
            gCMComplexOneLineButton.j();
        }
    }
}
