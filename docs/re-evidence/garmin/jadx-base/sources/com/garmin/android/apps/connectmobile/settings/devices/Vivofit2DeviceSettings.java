package com.garmin.android.apps.connectmobile.settings.devices;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexOneLineButton;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexTwoLineButton;
import mt0.h0;
import ng1.j;

/* JADX INFO: loaded from: classes10.dex */
public class Vivofit2DeviceSettings extends j {
    public static final /* synthetic */ int F = 0;
    public final a A = new a();
    public final b B = new b();
    public final c C = new c();
    public final d D = new d();
    public final h0 E = new h0(this, 19);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public GCMComplexTwoLineButton f42213t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public GCMComplexOneLineButton f42214v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public GCMComplexTwoLineButton f42215w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public GCMComplexTwoLineButton f42216x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public GCMComplexTwoLineButton f42217y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public GCMComplexOneLineButton f42218z;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view2) {
            Vivofit2DeviceSettings vivofit2DeviceSettings = Vivofit2DeviceSettings.this;
            int iOrdinal = vivofit2DeviceSettings.f125985k.h0().ordinal();
            androidx.appcompat.app.e.a aVar = new androidx.appcompat.app.e.a(vivofit2DeviceSettings);
            aVar.setTitle(R.string.lbl_time_format).setSingleChoiceItems(DeviceSettingsDTO.p.a(vivofit2DeviceSettings), iOrdinal, new kx0.f(this, 23));
            aVar.create().show();
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view2) {
            Vivofit2DeviceSettings vivofit2DeviceSettings = Vivofit2DeviceSettings.this;
            int iOrdinal = vivofit2DeviceSettings.f125985k.a0().ordinal();
            androidx.appcompat.app.e.a aVar = new androidx.appcompat.app.e.a(vivofit2DeviceSettings);
            aVar.setTitle(R.string.lbl_date_format).setSingleChoiceItems(DeviceSettingsDTO.j.a(vivofit2DeviceSettings), iOrdinal, new kx0.f(this, 24));
            aVar.create().show();
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view2) {
            Vivofit2DeviceSettings vivofit2DeviceSettings = Vivofit2DeviceSettings.this;
            int iOrdinal = vivofit2DeviceSettings.f125985k.c0().ordinal();
            androidx.appcompat.app.e.a aVar = new androidx.appcompat.app.e.a(vivofit2DeviceSettings);
            aVar.setTitle(R.string.pref_measurement_units).setSingleChoiceItems(DeviceSettingsDTO.l.a(vivofit2DeviceSettings), iOrdinal, new kx0.f(this, 25));
            aVar.create().show();
        }
    }

    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view2) {
            Vivofit2DeviceSettings vivofit2DeviceSettings = Vivofit2DeviceSettings.this;
            int iOrdinal = g.a(vivofit2DeviceSettings.f125985k.A).ordinal();
            androidx.appcompat.app.e.a aVar = new androidx.appcompat.app.e.a(vivofit2DeviceSettings);
            androidx.appcompat.app.e.a title = aVar.setTitle(R.string.device_setting_home_screen);
            CharSequence[] charSequenceArr = new CharSequence[g.values().length];
            for (int i14 = 0; i14 < g.values().length; i14++) {
                charSequenceArr[i14] = vivofit2DeviceSettings.getString(g.values()[i14].f42228b);
            }
            title.setSingleChoiceItems(charSequenceArr, iOrdinal, new kx0.f(this, 26));
            aVar.create().show();
        }
    }

    public class e implements CompoundButton.OnCheckedChangeListener {
        public e() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public final void onCheckedChanged(CompoundButton compoundButton, boolean z14) {
            DeviceSettingsDTO deviceSettingsDTO = Vivofit2DeviceSettings.this.f125985k;
            deviceSettingsDTO.f33893q = Boolean.valueOf(z14);
            deviceSettingsDTO.S1("userNoticeTonesEnabled");
        }
    }

    public class f implements CompoundButton.OnCheckedChangeListener {
        public f() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public final void onCheckedChanged(CompoundButton compoundButton, boolean z14) {
            DeviceSettingsDTO deviceSettingsDTO = Vivofit2DeviceSettings.this.f125985k;
            deviceSettingsDTO.J0 = Boolean.valueOf(z14);
            deviceSettingsDTO.S1("vivohubEnabled");
        }
    }

    public enum g {
        LAST_DISPLAYED(R.string.device_screen_last_displayed, "page_none"),
        /* JADX INFO: Fake field, exist only in values array */
        TIME_DEFAULT(R.string.lbl_time, "page_time"),
        /* JADX INFO: Fake field, exist only in values array */
        STEPS_DEFAULT(R.string.steps_steps, "page_steps"),
        /* JADX INFO: Fake field, exist only in values array */
        STEPS_GOAL_DEFAULT(R.string.steps_steps_goal, "page_steps_goal"),
        /* JADX INFO: Fake field, exist only in values array */
        CALORIES_DEFAULT(R.string.lbl_calories, "page_calories"),
        /* JADX INFO: Fake field, exist only in values array */
        DISTANCE_DEFAULT(R.string.lbl_distance, "page_distance"),
        /* JADX INFO: Fake field, exist only in values array */
        HEART_RATE_DEFAULT(R.string.device_screen_heart_rate, "page_heartrate");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f42227a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f42228b;

        g(int i14, String str) {
            this.f42227a = str;
            this.f42228b = i14;
        }

        public static g a(String str) {
            if (str != null) {
                for (g gVar : values()) {
                    if (gVar.f42227a.equals(str)) {
                        return gVar;
                    }
                }
            }
            return LAST_DISPLAYED;
        }
    }

    @Override // ng1.j
    public final int ea() {
        return R.layout.gcm3_device_settings_vivofit2;
    }

    @Override // com.garmin.android.apps.connectmobile.z1, androidx.fragment.app.m, b.g, android.app.Activity
    public final void onActivityResult(int i14, int i15, Intent intent) {
        super.onActivityResult(i14, i15, intent);
        if (i14 == 10 && i15 == -1) {
            DeviceSettingsDTO deviceSettingsDTO = (intent == null || intent.getExtras() == null) ? null : (DeviceSettingsDTO) intent.getExtras().get("GCM_deviceSettings");
            if (deviceSettingsDTO != null) {
                this.f125985k = deviceSettingsDTO;
            }
        }
    }

    @Override // ng1.j, ng1.p, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        GCMComplexTwoLineButton gCMComplexTwoLineButton = (GCMComplexTwoLineButton) findViewById(R.id.device_settings_vivofit2_time_format_btn);
        this.f42215w = gCMComplexTwoLineButton;
        gCMComplexTwoLineButton.setOnClickListener(this.A);
        GCMComplexTwoLineButton gCMComplexTwoLineButton2 = (GCMComplexTwoLineButton) findViewById(R.id.device_settings_vivofit2_date_format_btn);
        this.f42216x = gCMComplexTwoLineButton2;
        gCMComplexTwoLineButton2.setOnClickListener(this.B);
        GCMComplexTwoLineButton gCMComplexTwoLineButton3 = (GCMComplexTwoLineButton) findViewById(R.id.device_settings_vivofit2_measurement_units_btn);
        this.f42217y = gCMComplexTwoLineButton3;
        gCMComplexTwoLineButton3.setOnClickListener(this.C);
        ((GCMComplexOneLineButton) findViewById(R.id.device_settings_vivofit2_visible_screens)).setOnClickListener(this.E);
        GCMComplexTwoLineButton gCMComplexTwoLineButton4 = (GCMComplexTwoLineButton) findViewById(R.id.device_settings_vivofit2_home_screen);
        this.f42213t = gCMComplexTwoLineButton4;
        gCMComplexTwoLineButton4.setOnClickListener(this.D);
        GCMComplexOneLineButton gCMComplexOneLineButton = (GCMComplexOneLineButton) findViewById(R.id.device_settings_vivofit2_alert_tones);
        this.f42214v = gCMComplexOneLineButton;
        gCMComplexOneLineButton.setOnCheckedChangeListener(new e());
        GCMComplexOneLineButton gCMComplexOneLineButton2 = (GCMComplexOneLineButton) findViewById(R.id.device_settings_vivofit2_vivohub);
        this.f42218z = gCMComplexOneLineButton2;
        gCMComplexOneLineButton2.setOnCheckedChangeListener(new f());
        if (this.f125977c.u2()) {
            this.f42218z.setVisibility(0);
        }
        this.f42215w.setButtonBottomLeftLabel(getString(this.f125985k.h0().f34017b));
        this.f42216x.setButtonBottomLeftLabel(getString(this.f125985k.a0().f33976b));
        this.f42217y.setButtonBottomLeftLabel(getString(this.f125985k.c0().f33990b));
        this.f42213t.setButtonBottomLeftLabel(getString(g.a(this.f125985k.A).f42228b));
        Boolean bool = this.f125985k.f33893q;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        GCMComplexOneLineButton gCMComplexOneLineButton3 = this.f42214v;
        if (zBooleanValue) {
            gCMComplexOneLineButton3.k();
        } else {
            gCMComplexOneLineButton3.j();
        }
        Boolean bool2 = this.f125985k.J0;
        boolean zBooleanValue2 = bool2 != null ? bool2.booleanValue() : false;
        GCMComplexOneLineButton gCMComplexOneLineButton4 = this.f42218z;
        if (zBooleanValue2) {
            gCMComplexOneLineButton4.k();
        } else {
            gCMComplexOneLineButton4.j();
        }
    }
}
