package com.garmin.android.apps.connectmobile.settings.devices;

import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexOneLineButton;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexTwoLineButton;

/* JADX INFO: loaded from: classes10.dex */
public class Vivofit2DeviceSettingsScreensDuringActivity extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f42245l = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public GCMComplexOneLineButton f42246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public GCMComplexOneLineButton f42247b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public GCMComplexOneLineButton f42248c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public GCMComplexOneLineButton f42249d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public GCMComplexOneLineButton f42250e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public GCMComplexOneLineButton f42251f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public GCMComplexOneLineButton f42252g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public GCMComplexOneLineButton f42253h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public GCMComplexTwoLineButton f42254i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public DeviceSettingsDTO f42255j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final a f42256k = new a();

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view2) {
            Vivofit2DeviceSettingsScreensDuringActivity vivofit2DeviceSettingsScreensDuringActivity = Vivofit2DeviceSettingsScreensDuringActivity.this;
            int iOrdinal = i.a(vivofit2DeviceSettingsScreensDuringActivity.f42255j.f33863b1.f185492j).ordinal();
            androidx.appcompat.app.e.a aVar = new androidx.appcompat.app.e.a(vivofit2DeviceSettingsScreensDuringActivity);
            androidx.appcompat.app.e.a title = aVar.setTitle(R.string.device_setting_home_screen);
            CharSequence[] charSequenceArr = new CharSequence[i.values().length];
            for (int i14 = 0; i14 < i.values().length; i14++) {
                charSequenceArr[i14] = vivofit2DeviceSettingsScreensDuringActivity.getString(i.values()[i14].f42268b);
            }
            title.setSingleChoiceItems(charSequenceArr, iOrdinal, new kx0.f(this, 27));
            aVar.create().show();
        }
    }

    public class b implements CompoundButton.OnCheckedChangeListener {
        public b() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public final void onCheckedChanged(CompoundButton compoundButton, boolean z14) {
            Vivofit2DeviceSettingsScreensDuringActivity.this.f42255j.f33863b1.f185491i.h0("page_activity_steps", Boolean.valueOf(z14));
        }
    }

    public class c implements CompoundButton.OnCheckedChangeListener {
        public c() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public final void onCheckedChanged(CompoundButton compoundButton, boolean z14) {
            Vivofit2DeviceSettingsScreensDuringActivity.this.f42255j.f33863b1.f185491i.w0(Boolean.valueOf(z14));
        }
    }

    public class d implements CompoundButton.OnCheckedChangeListener {
        public d() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public final void onCheckedChanged(CompoundButton compoundButton, boolean z14) {
            Vivofit2DeviceSettingsScreensDuringActivity.this.f42255j.f33863b1.f185491i.h0("page_activity_distance", Boolean.valueOf(z14));
        }
    }

    public class e implements CompoundButton.OnCheckedChangeListener {
        public e() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public final void onCheckedChanged(CompoundButton compoundButton, boolean z14) {
            Vivofit2DeviceSettingsScreensDuringActivity.this.f42255j.f33863b1.f185491i.h0("page_activity_calories", Boolean.valueOf(z14));
        }
    }

    public class f implements CompoundButton.OnCheckedChangeListener {
        public f() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public final void onCheckedChanged(CompoundButton compoundButton, boolean z14) {
            Vivofit2DeviceSettingsScreensDuringActivity vivofit2DeviceSettingsScreensDuringActivity = Vivofit2DeviceSettingsScreensDuringActivity.this;
            vivofit2DeviceSettingsScreensDuringActivity.f42255j.f33863b1.f185491i.x0(Boolean.valueOf(z14));
            if (z14) {
                return;
            }
            vivofit2DeviceSettingsScreensDuringActivity.f42252g.j();
        }
    }

    public class g implements CompoundButton.OnCheckedChangeListener {
        public g() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public final void onCheckedChanged(CompoundButton compoundButton, boolean z14) {
            Vivofit2DeviceSettingsScreensDuringActivity vivofit2DeviceSettingsScreensDuringActivity = Vivofit2DeviceSettingsScreensDuringActivity.this;
            vivofit2DeviceSettingsScreensDuringActivity.f42255j.f33863b1.f185491i.j0(Boolean.valueOf(z14));
            if (z14) {
                vivofit2DeviceSettingsScreensDuringActivity.f42251f.k();
            }
        }
    }

    public class h implements CompoundButton.OnCheckedChangeListener {
        public h() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public final void onCheckedChanged(CompoundButton compoundButton, boolean z14) {
            Vivofit2DeviceSettingsScreensDuringActivity.this.f42255j.f33863b1.f185491i.n0(Boolean.valueOf(z14));
        }
    }

    public enum i {
        LAST_DISPLAYED(R.string.device_screen_last_displayed, "page_none"),
        /* JADX INFO: Fake field, exist only in values array */
        STEPS_DURING_ACTIVITY(R.string.lbl_activity_steps, "page_activity_steps"),
        /* JADX INFO: Fake field, exist only in values array */
        STEPS_GOAL_DURING_ACTIVITY(R.string.steps_steps_goal, "page_steps_goal"),
        /* JADX INFO: Fake field, exist only in values array */
        DISTANCE_DURING_ACTIVITY(R.string.lbl_activity_distance, "page_activity_distance"),
        /* JADX INFO: Fake field, exist only in values array */
        CALORIES_DURING_ACTIVITY(R.string.lbl_activity_calories, "page_activity_calories"),
        /* JADX INFO: Fake field, exist only in values array */
        TIMER_DURING_ACTIVITY(R.string.lbl_activity_timer, "page_activity_timer"),
        /* JADX INFO: Fake field, exist only in values array */
        TIME_DURING_ACTIVITY(R.string.lbl_time, "page_time"),
        /* JADX INFO: Fake field, exist only in values array */
        HEART_RATE_DURING_ACTIVITY(R.string.device_screen_heart_rate, "page_heartrate");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f42267a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f42268b;

        i(int i14, String str) {
            this.f42267a = str;
            this.f42268b = i14;
        }

        public static i a(String str) {
            if (str != null) {
                for (i iVar : values()) {
                    if (iVar.f42267a.equals(str)) {
                        return iVar;
                    }
                }
            }
            return LAST_DISPLAYED;
        }
    }

    @Override // android.app.Activity
    public final void finish() {
        getIntent().putExtra("GCM_deviceSettings", this.f42255j);
        setResult(-1, getIntent());
        super.finish();
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.gcm3_device_settings_vivofit2_visible_screens_during_activity);
        initActionBar(true, R.string.lbl_during_an_activity);
        if (getIntent().getExtras() != null) {
            this.f42255j = (DeviceSettingsDTO) getIntent().getExtras().getParcelable("GCM_deviceSettings");
        }
        DeviceSettingsDTO deviceSettingsDTO = this.f42255j;
        if (deviceSettingsDTO == null) {
            i2.f(a2.SETTINGS, "Vivofit2DeviceSettingsScreensDuringActivity", "Invalid device settings object while entering device settings visible screens during activity screen!");
            finish();
            return;
        }
        wi1.c cVar = deviceSettingsDTO.f33863b1;
        if (cVar == null || cVar.f185491i == null) {
            return;
        }
        GCMComplexTwoLineButton gCMComplexTwoLineButton = (GCMComplexTwoLineButton) findViewById(R.id.device_settings_vivofit2_activity_home_screen);
        this.f42254i = gCMComplexTwoLineButton;
        gCMComplexTwoLineButton.setOnClickListener(this.f42256k);
        GCMComplexOneLineButton gCMComplexOneLineButton = (GCMComplexOneLineButton) findViewById(R.id.device_settings_vivofit2_activity_screen_activity_timer);
        this.f42250e = gCMComplexOneLineButton;
        gCMComplexOneLineButton.k();
        this.f42250e.setEnabled(false);
        GCMComplexOneLineButton gCMComplexOneLineButton2 = (GCMComplexOneLineButton) findViewById(R.id.device_settings_vivofit2_activity_screen_steps);
        this.f42246a = gCMComplexOneLineButton2;
        gCMComplexOneLineButton2.setOnCheckedChangeListener(new b());
        GCMComplexOneLineButton gCMComplexOneLineButton3 = (GCMComplexOneLineButton) findViewById(R.id.device_settings_vivofit2_activity_screen_steps_goal);
        this.f42247b = gCMComplexOneLineButton3;
        gCMComplexOneLineButton3.setOnCheckedChangeListener(new c());
        GCMComplexOneLineButton gCMComplexOneLineButton4 = (GCMComplexOneLineButton) findViewById(R.id.device_settings_vivofit2_activity_screen_distance);
        this.f42248c = gCMComplexOneLineButton4;
        gCMComplexOneLineButton4.setOnCheckedChangeListener(new d());
        GCMComplexOneLineButton gCMComplexOneLineButton5 = (GCMComplexOneLineButton) findViewById(R.id.device_settings_vivofit2_activity_screen_calories);
        this.f42249d = gCMComplexOneLineButton5;
        gCMComplexOneLineButton5.setOnCheckedChangeListener(new e());
        GCMComplexOneLineButton gCMComplexOneLineButton6 = (GCMComplexOneLineButton) findViewById(R.id.device_settings_vivofit2_activity_screen_time);
        this.f42251f = gCMComplexOneLineButton6;
        gCMComplexOneLineButton6.setOnCheckedChangeListener(new f());
        GCMComplexOneLineButton gCMComplexOneLineButton7 = (GCMComplexOneLineButton) findViewById(R.id.device_settings_vivofit2_activity_screen_date);
        this.f42252g = gCMComplexOneLineButton7;
        gCMComplexOneLineButton7.setOnCheckedChangeListener(new g());
        GCMComplexOneLineButton gCMComplexOneLineButton8 = (GCMComplexOneLineButton) findViewById(R.id.device_settings_vivofit2_activity_screen_heart_rate);
        this.f42253h = gCMComplexOneLineButton8;
        gCMComplexOneLineButton8.setOnCheckedChangeListener(new h());
        this.f42254i.setButtonBottomLeftLabel(getString(i.a(this.f42255j.f33863b1.f185492j).f42268b));
        boolean zI = this.f42255j.f33863b1.f185491i.I("page_activity_steps");
        GCMComplexOneLineButton gCMComplexOneLineButton9 = this.f42246a;
        if (zI) {
            gCMComplexOneLineButton9.k();
        } else {
            gCMComplexOneLineButton9.j();
        }
        boolean zBooleanValue = this.f42255j.f33863b1.f185491i.c0().booleanValue();
        GCMComplexOneLineButton gCMComplexOneLineButton10 = this.f42247b;
        if (zBooleanValue) {
            gCMComplexOneLineButton10.k();
        } else {
            gCMComplexOneLineButton10.j();
        }
        boolean zI2 = this.f42255j.f33863b1.f185491i.I("page_activity_distance");
        GCMComplexOneLineButton gCMComplexOneLineButton11 = this.f42248c;
        if (zI2) {
            gCMComplexOneLineButton11.k();
        } else {
            gCMComplexOneLineButton11.j();
        }
        boolean zI3 = this.f42255j.f33863b1.f185491i.I("page_activity_calories");
        GCMComplexOneLineButton gCMComplexOneLineButton12 = this.f42249d;
        if (zI3) {
            gCMComplexOneLineButton12.k();
        } else {
            gCMComplexOneLineButton12.j();
        }
        boolean zBooleanValue2 = this.f42255j.f33863b1.f185491i.e0().booleanValue();
        GCMComplexOneLineButton gCMComplexOneLineButton13 = this.f42251f;
        if (zBooleanValue2) {
            gCMComplexOneLineButton13.k();
            boolean zBooleanValue3 = this.f42255j.f33863b1.f185491i.G().booleanValue();
            GCMComplexOneLineButton gCMComplexOneLineButton14 = this.f42252g;
            if (zBooleanValue3) {
                gCMComplexOneLineButton14.k();
            } else {
                gCMComplexOneLineButton14.j();
            }
        } else {
            gCMComplexOneLineButton13.j();
            this.f42252g.j();
        }
        boolean zBooleanValue4 = this.f42255j.f33863b1.f185491i.M().booleanValue();
        GCMComplexOneLineButton gCMComplexOneLineButton15 = this.f42253h;
        if (zBooleanValue4) {
            gCMComplexOneLineButton15.k();
        } else {
            gCMComplexOneLineButton15.j();
        }
    }
}
