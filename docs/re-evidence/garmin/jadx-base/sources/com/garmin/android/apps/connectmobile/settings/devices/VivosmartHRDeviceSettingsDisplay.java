package com.garmin.android.apps.connectmobile.settings.devices;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.devices.model.o;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexOneLineButton;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexTwoLineButton;
import java.util.ArrayList;
import org.apache.commons.lang3.BooleanUtils;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes10.dex */
public class VivosmartHRDeviceSettingsDisplay extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f42430q = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public GCMComplexOneLineButton f42431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public GCMComplexOneLineButton f42432b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public GCMComplexOneLineButton f42433c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public GCMComplexOneLineButton f42434d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public GCMComplexOneLineButton f42435e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public GCMComplexOneLineButton f42436f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public GCMComplexOneLineButton f42437g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public GCMComplexOneLineButton f42438h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public GCMComplexOneLineButton f42439i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public GCMComplexOneLineButton f42440j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public GCMComplexOneLineButton f42441k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public GCMComplexTwoLineButton f42442l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public GCMComplexTwoLineButton f42443m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public DeviceSettingsDTO f42444n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final d f42445o = new d();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e f42446p = new e();

    public class a implements CompoundButton.OnCheckedChangeListener {
        public a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public final void onCheckedChanged(CompoundButton compoundButton, boolean z14) {
            VivosmartHRDeviceSettingsDisplay vivosmartHRDeviceSettingsDisplay = VivosmartHRDeviceSettingsDisplay.this;
            vivosmartHRDeviceSettingsDisplay.f42444n.f33872g.h0("page_intensity_minutes", Boolean.valueOf(z14));
            VivosmartHRDeviceSettingsDisplay.ca(vivosmartHRDeviceSettingsDisplay);
        }
    }

    public class b implements CompoundButton.OnCheckedChangeListener {
        public b() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public final void onCheckedChanged(CompoundButton compoundButton, boolean z14) {
            VivosmartHRDeviceSettingsDisplay vivosmartHRDeviceSettingsDisplay = VivosmartHRDeviceSettingsDisplay.this;
            vivosmartHRDeviceSettingsDisplay.f42444n.f33872g.h0("page_weather", Boolean.valueOf(z14));
            VivosmartHRDeviceSettingsDisplay.ca(vivosmartHRDeviceSettingsDisplay);
            vivosmartHRDeviceSettingsDisplay.ea(z14);
        }
    }

    public static /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f42449a;

        static {
            int[] iArr = new int[DeviceSettingsDTO.g.values().length];
            f42449a = iArr;
            try {
                iArr[DeviceSettingsDTO.g.ON.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f42449a[DeviceSettingsDTO.g.DURING_ACTIVITY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f42449a[DeviceSettingsDTO.g.OFF.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view2) {
            int i14 = VivosmartHRDeviceSettingsDisplay.f42430q;
            VivosmartHRDeviceSettingsDisplay vivosmartHRDeviceSettingsDisplay = VivosmartHRDeviceSettingsDisplay.this;
            ArrayList arrayListDa = vivosmartHRDeviceSettingsDisplay.da();
            int iIndexOf = arrayListDa.indexOf(m.a(vivosmartHRDeviceSettingsDisplay.f42444n.A));
            androidx.appcompat.app.e.a aVar = new androidx.appcompat.app.e.a(vivosmartHRDeviceSettingsDisplay);
            androidx.appcompat.app.e.a title = aVar.setTitle(R.string.device_setting_home_screen);
            CharSequence[] charSequenceArr = new CharSequence[arrayListDa.size()];
            for (int i15 = 0; i15 < arrayListDa.size(); i15++) {
                charSequenceArr[i15] = vivosmartHRDeviceSettingsDisplay.getString(((m) arrayListDa.get(i15)).f42473b);
            }
            title.setSingleChoiceItems(charSequenceArr, iIndexOf, new hg1.g(26, this, arrayListDa));
            aVar.create().show();
        }
    }

    public class e implements View.OnClickListener {
        public e() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view2) {
            CharSequence[] charSequenceArr;
            VivosmartHRDeviceSettingsDisplay vivosmartHRDeviceSettingsDisplay = VivosmartHRDeviceSettingsDisplay.this;
            int iOrdinal = vivosmartHRDeviceSettingsDisplay.f42444n.I().ordinal();
            ArrayList arrayListC0 = vivosmartHRDeviceSettingsDisplay.f42444n.C0();
            if (arrayListC0.isEmpty()) {
                charSequenceArr = new CharSequence[0];
            } else {
                charSequenceArr = new CharSequence[arrayListC0.size()];
                for (int i14 = 0; i14 < arrayListC0.size(); i14++) {
                    int i15 = c.f42449a[((DeviceSettingsDTO.g) arrayListC0.get(i14)).ordinal()];
                    charSequenceArr[i14] = vivosmartHRDeviceSettingsDisplay.getString(i15 != 2 ? i15 != 3 ? R.string.device_setting_auto_backlight_always : R.string.device_device_setting_auto_backlight_never : R.string.device_device_setting_auto_backlight_during_activity);
                }
            }
            androidx.appcompat.app.e.a aVar = new androidx.appcompat.app.e.a(vivosmartHRDeviceSettingsDisplay);
            aVar.setTitle(R.string.device_setting_auto_backlight).setSingleChoiceItems(charSequenceArr, iOrdinal, new bi2.k(this, 24, arrayListC0, charSequenceArr));
            aVar.create().show();
        }
    }

    public class f implements CompoundButton.OnCheckedChangeListener {
        public f() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public final void onCheckedChanged(CompoundButton compoundButton, boolean z14) {
            VivosmartHRDeviceSettingsDisplay vivosmartHRDeviceSettingsDisplay = VivosmartHRDeviceSettingsDisplay.this;
            vivosmartHRDeviceSettingsDisplay.f42444n.f33872g.i0(Boolean.valueOf(z14));
            VivosmartHRDeviceSettingsDisplay.ca(vivosmartHRDeviceSettingsDisplay);
        }
    }

    public class g implements CompoundButton.OnCheckedChangeListener {
        public g() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public final void onCheckedChanged(CompoundButton compoundButton, boolean z14) {
            VivosmartHRDeviceSettingsDisplay vivosmartHRDeviceSettingsDisplay = VivosmartHRDeviceSettingsDisplay.this;
            vivosmartHRDeviceSettingsDisplay.f42444n.f33872g.k0(Boolean.valueOf(z14));
            VivosmartHRDeviceSettingsDisplay.ca(vivosmartHRDeviceSettingsDisplay);
        }
    }

    public class h implements CompoundButton.OnCheckedChangeListener {
        public h() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public final void onCheckedChanged(CompoundButton compoundButton, boolean z14) {
            VivosmartHRDeviceSettingsDisplay vivosmartHRDeviceSettingsDisplay = VivosmartHRDeviceSettingsDisplay.this;
            vivosmartHRDeviceSettingsDisplay.f42444n.f33872g.n0(Boolean.valueOf(z14));
            VivosmartHRDeviceSettingsDisplay.ca(vivosmartHRDeviceSettingsDisplay);
        }
    }

    public class i implements CompoundButton.OnCheckedChangeListener {
        public i() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public final void onCheckedChanged(CompoundButton compoundButton, boolean z14) {
            VivosmartHRDeviceSettingsDisplay vivosmartHRDeviceSettingsDisplay = VivosmartHRDeviceSettingsDisplay.this;
            vivosmartHRDeviceSettingsDisplay.f42444n.f33872g.h0("page_virb_remote", Boolean.valueOf(z14));
            VivosmartHRDeviceSettingsDisplay.ca(vivosmartHRDeviceSettingsDisplay);
        }
    }

    public class j implements CompoundButton.OnCheckedChangeListener {
        public j() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public final void onCheckedChanged(CompoundButton compoundButton, boolean z14) {
            VivosmartHRDeviceSettingsDisplay vivosmartHRDeviceSettingsDisplay = VivosmartHRDeviceSettingsDisplay.this;
            vivosmartHRDeviceSettingsDisplay.f42444n.f33872g.o0(Boolean.valueOf(z14));
            VivosmartHRDeviceSettingsDisplay.ca(vivosmartHRDeviceSettingsDisplay);
        }
    }

    public class k implements CompoundButton.OnCheckedChangeListener {
        public k() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public final void onCheckedChanged(CompoundButton compoundButton, boolean z14) {
            VivosmartHRDeviceSettingsDisplay vivosmartHRDeviceSettingsDisplay = VivosmartHRDeviceSettingsDisplay.this;
            vivosmartHRDeviceSettingsDisplay.f42444n.f33872g.p0(Boolean.valueOf(z14));
            VivosmartHRDeviceSettingsDisplay.ca(vivosmartHRDeviceSettingsDisplay);
        }
    }

    public class l implements CompoundButton.OnCheckedChangeListener {
        public l() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public final void onCheckedChanged(CompoundButton compoundButton, boolean z14) {
            VivosmartHRDeviceSettingsDisplay vivosmartHRDeviceSettingsDisplay = VivosmartHRDeviceSettingsDisplay.this;
            vivosmartHRDeviceSettingsDisplay.f42444n.f33872g.h0("page_floors_climbed", Boolean.valueOf(z14));
            VivosmartHRDeviceSettingsDisplay.ca(vivosmartHRDeviceSettingsDisplay);
        }
    }

    public enum m {
        LAST_DISPLAYED(R.string.device_screen_last_displayed, "page_none"),
        TIME_DATE(R.string.device_screen_time_date, "page_time_date"),
        STEPS(R.string.steps_steps, "page_steps"),
        CALORIES(R.string.lbl_calories, "page_calories"),
        DISTANCE(R.string.lbl_distance, "page_distance"),
        HEART_RATE(R.string.device_screen_heart_rate, "page_heartrate"),
        FLOORS_CLIMBED(R.string.floors_climbed_lbl, "page_floors_climbed"),
        INTENSITY_MINUTES(R.string.title_intensity_minutes, "page_intensity_minutes"),
        WEATHER(R.string.title_weather_on_off, "page_weather"),
        NOTIFICATIONS(R.string.device_screen_notifications, "page_notifications"),
        MUSIC(R.string.device_screen_music, "page_music"),
        VIRB_REMOTE(R.string.device_screen_virb_remote, "page_virb_remote");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f42472a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f42473b;

        m(int i14, String str) {
            this.f42472a = str;
            this.f42473b = i14;
        }

        public static m a(String str) {
            if (str != null) {
                for (m mVar : values()) {
                    if (mVar.f42472a.equals(str)) {
                        return mVar;
                    }
                }
            }
            return LAST_DISPLAYED;
        }
    }

    public static void ca(VivosmartHRDeviceSettingsDisplay vivosmartHRDeviceSettingsDisplay) {
        if (vivosmartHRDeviceSettingsDisplay.da().contains(m.a(vivosmartHRDeviceSettingsDisplay.f42444n.A))) {
            return;
        }
        vivosmartHRDeviceSettingsDisplay.f42444n.A1(m.LAST_DISPLAYED.f42472a);
        vivosmartHRDeviceSettingsDisplay.f42442l.setButtonBottomLeftLabel(vivosmartHRDeviceSettingsDisplay.getString(m.a(vivosmartHRDeviceSettingsDisplay.f42444n.A).f42473b));
    }

    public final ArrayList da() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(m.LAST_DISPLAYED);
        o oVar = this.f42444n.f33872g;
        if (oVar != null) {
            if (oVar.I("page_time_date")) {
                arrayList.add(m.TIME_DATE);
            }
            if (oVar.I("page_steps")) {
                arrayList.add(m.STEPS);
            }
            if (oVar.F().booleanValue()) {
                arrayList.add(m.CALORIES);
            }
            if (oVar.H().booleanValue()) {
                arrayList.add(m.DISTANCE);
            }
            if (oVar.I("page_floors_climbed")) {
                arrayList.add(m.FLOORS_CLIMBED);
            }
            if (oVar.I("page_intensity_minutes")) {
                arrayList.add(m.INTENSITY_MINUTES);
            }
            if (oVar.g0().booleanValue()) {
                arrayList.add(m.WEATHER);
            }
            if (oVar.a0().booleanValue()) {
                arrayList.add(m.NOTIFICATIONS);
            }
            if (oVar.Z().booleanValue()) {
                arrayList.add(m.MUSIC);
            }
            if (oVar.f0().booleanValue()) {
                arrayList.add(m.VIRB_REMOTE);
            }
        }
        return arrayList;
    }

    public final synchronized void ea(boolean z14) {
        try {
            long j8 = this.f42444n.f33860a;
            if (((l80.b) KoinJavaComponent.get(l80.b.class)).a(j8)) {
                a2 a2Var = a2.SETTINGS;
                i2.a(a2Var, "VivosmartHRDeviceSettingsDisplay", "Settings and connected device are the same -- device ID [" + j8 + "].");
                hk0.a.f().p(j8, z14);
                StringBuilder sb3 = new StringBuilder("  >> called DeviceManager.setWeatherConditionsEnabled(");
                sb3.append(z14 ? BooleanUtils.ON : BooleanUtils.OFF);
                sb3.append(") for device ID [");
                sb3.append(j8);
                sb3.append("].");
                String string = sb3.toString();
                i2.f36769a.getClass();
                i2.a.b(a2Var, "VivosmartHRDeviceSettingsDisplay", string);
                rd2.h.d().getClass();
                rd2.h.g(j8, 2, z14);
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    @Override // android.app.Activity
    public final void finish() {
        getIntent().putExtra("GCM_deviceSettings", this.f42444n);
        setResult(-1, getIntent());
        super.finish();
    }

    @Override // com.garmin.android.apps.connectmobile.z1, androidx.fragment.app.m, b.g, android.app.Activity
    public final void onActivityResult(int i14, int i15, Intent intent) {
        super.onActivityResult(i14, i15, intent);
        if (i14 == 10 && i15 == -1) {
            DeviceSettingsDTO deviceSettingsDTO = (intent == null || intent.getExtras() == null) ? null : (DeviceSettingsDTO) intent.getExtras().get("GCM_deviceSettings");
            if (deviceSettingsDTO != null) {
                this.f42444n = deviceSettingsDTO;
            }
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i14;
        super.onCreate(bundle);
        setContentView(R.layout.gcm3_device_settings_vivosmart_hr_display);
        initActionBar(true, R.string.device_setting_display);
        if (getIntent().getExtras() != null) {
            this.f42444n = (DeviceSettingsDTO) getIntent().getExtras().getParcelable("GCM_deviceSettings");
        }
        if (this.f42444n == null) {
            i2.f(a2.SETTINGS, "VivosmartHRDeviceSettingsDisplay", "Invalid device settings object while entering device settings time, date, system screen!");
            finish();
            return;
        }
        GCMComplexTwoLineButton gCMComplexTwoLineButton = (GCMComplexTwoLineButton) findViewById(R.id.device_settings_vivosmart_hr_home_screen_btn);
        this.f42442l = gCMComplexTwoLineButton;
        gCMComplexTwoLineButton.setOnClickListener(this.f42445o);
        GCMComplexTwoLineButton gCMComplexTwoLineButton2 = (GCMComplexTwoLineButton) findViewById(R.id.device_settings_vivosmart_hr_auto_on_btn);
        this.f42443m = gCMComplexTwoLineButton2;
        gCMComplexTwoLineButton2.setOnClickListener(this.f42446p);
        GCMComplexOneLineButton gCMComplexOneLineButton = (GCMComplexOneLineButton) findViewById(R.id.device_settings_vivosmart_hr_screen_time_date);
        this.f42431a = gCMComplexOneLineButton;
        gCMComplexOneLineButton.k();
        this.f42431a.setEnabled(false);
        GCMComplexOneLineButton gCMComplexOneLineButton2 = (GCMComplexOneLineButton) findViewById(R.id.device_settings_vivosmart_hr_screen_steps);
        this.f42432b = gCMComplexOneLineButton2;
        gCMComplexOneLineButton2.k();
        this.f42432b.setEnabled(false);
        GCMComplexOneLineButton gCMComplexOneLineButton3 = (GCMComplexOneLineButton) findViewById(R.id.device_settings_vivosmart_hr_screen_calories);
        this.f42433c = gCMComplexOneLineButton3;
        gCMComplexOneLineButton3.setOnCheckedChangeListener(new f());
        GCMComplexOneLineButton gCMComplexOneLineButton4 = (GCMComplexOneLineButton) findViewById(R.id.device_settings_vivosmart_hr_screen_distance);
        this.f42434d = gCMComplexOneLineButton4;
        gCMComplexOneLineButton4.setOnCheckedChangeListener(new g());
        GCMComplexOneLineButton gCMComplexOneLineButton5 = (GCMComplexOneLineButton) findViewById(R.id.device_settings_vivosmart_hr_screen_heart_rate);
        this.f42435e = gCMComplexOneLineButton5;
        gCMComplexOneLineButton5.setOnCheckedChangeListener(new h());
        GCMComplexOneLineButton gCMComplexOneLineButton6 = (GCMComplexOneLineButton) findViewById(R.id.device_settings_vivosmart_hr_screen_virb_remote);
        this.f42436f = gCMComplexOneLineButton6;
        gCMComplexOneLineButton6.setOnCheckedChangeListener(new i());
        GCMComplexOneLineButton gCMComplexOneLineButton7 = (GCMComplexOneLineButton) findViewById(R.id.device_settings_vivosmart_hr_screen_music);
        this.f42437g = gCMComplexOneLineButton7;
        gCMComplexOneLineButton7.setOnCheckedChangeListener(new j());
        GCMComplexOneLineButton gCMComplexOneLineButton8 = (GCMComplexOneLineButton) findViewById(R.id.device_settings_vivosmart_hr_screen_notification);
        this.f42438h = gCMComplexOneLineButton8;
        gCMComplexOneLineButton8.setOnCheckedChangeListener(new k());
        GCMComplexOneLineButton gCMComplexOneLineButton9 = (GCMComplexOneLineButton) findViewById(R.id.device_settings_vivosmart_hr_screen_floors_climbed);
        this.f42439i = gCMComplexOneLineButton9;
        gCMComplexOneLineButton9.setOnCheckedChangeListener(new l());
        GCMComplexOneLineButton gCMComplexOneLineButton10 = (GCMComplexOneLineButton) findViewById(R.id.device_settings_vivosmart_hr_screen_intensity_minutes);
        this.f42440j = gCMComplexOneLineButton10;
        gCMComplexOneLineButton10.setOnCheckedChangeListener(new a());
        GCMComplexOneLineButton gCMComplexOneLineButton11 = (GCMComplexOneLineButton) findViewById(R.id.device_settings_vivosmart_hr_screen_weather);
        this.f42441k = gCMComplexOneLineButton11;
        gCMComplexOneLineButton11.setOnCheckedChangeListener(new b());
        boolean zBooleanValue = this.f42444n.f33872g.F().booleanValue();
        GCMComplexOneLineButton gCMComplexOneLineButton12 = this.f42433c;
        if (zBooleanValue) {
            gCMComplexOneLineButton12.k();
        } else {
            gCMComplexOneLineButton12.j();
        }
        boolean zBooleanValue2 = this.f42444n.f33872g.H().booleanValue();
        GCMComplexOneLineButton gCMComplexOneLineButton13 = this.f42434d;
        if (zBooleanValue2) {
            gCMComplexOneLineButton13.k();
        } else {
            gCMComplexOneLineButton13.j();
        }
        boolean zBooleanValue3 = this.f42444n.f33872g.M().booleanValue();
        GCMComplexOneLineButton gCMComplexOneLineButton14 = this.f42435e;
        if (zBooleanValue3) {
            gCMComplexOneLineButton14.k();
        } else {
            gCMComplexOneLineButton14.j();
        }
        boolean zBooleanValue4 = this.f42444n.f33872g.f0().booleanValue();
        GCMComplexOneLineButton gCMComplexOneLineButton15 = this.f42436f;
        if (zBooleanValue4) {
            gCMComplexOneLineButton15.k();
        } else {
            gCMComplexOneLineButton15.j();
        }
        boolean zBooleanValue5 = this.f42444n.f33872g.Z().booleanValue();
        GCMComplexOneLineButton gCMComplexOneLineButton16 = this.f42437g;
        if (zBooleanValue5) {
            gCMComplexOneLineButton16.k();
        } else {
            gCMComplexOneLineButton16.j();
        }
        boolean zBooleanValue6 = this.f42444n.f33872g.a0().booleanValue();
        GCMComplexOneLineButton gCMComplexOneLineButton17 = this.f42438h;
        if (zBooleanValue6) {
            gCMComplexOneLineButton17.k();
        } else {
            gCMComplexOneLineButton17.j();
        }
        boolean zI = this.f42444n.f33872g.I("page_floors_climbed");
        GCMComplexOneLineButton gCMComplexOneLineButton18 = this.f42439i;
        if (zI) {
            gCMComplexOneLineButton18.k();
        } else {
            gCMComplexOneLineButton18.j();
        }
        boolean zI2 = this.f42444n.f33872g.I("page_intensity_minutes");
        GCMComplexOneLineButton gCMComplexOneLineButton19 = this.f42440j;
        if (zI2) {
            gCMComplexOneLineButton19.k();
        } else {
            gCMComplexOneLineButton19.j();
        }
        boolean zBooleanValue7 = this.f42444n.f33872g.g0().booleanValue();
        GCMComplexOneLineButton gCMComplexOneLineButton20 = this.f42441k;
        if (zBooleanValue7) {
            gCMComplexOneLineButton20.k();
        } else {
            gCMComplexOneLineButton20.j();
        }
        ea(this.f42444n.f33872g.g0().booleanValue());
        this.f42442l.setButtonBottomLeftLabel(getString(m.a(this.f42444n.A).f42473b));
        GCMComplexTwoLineButton gCMComplexTwoLineButton3 = this.f42443m;
        int i15 = c.f42449a[this.f42444n.I().ordinal()];
        if (i15 != 2) {
            i14 = i15 != 3 ? R.string.device_setting_auto_backlight_always : R.string.device_device_setting_auto_backlight_never;
        } else {
            i14 = R.string.device_device_setting_auto_backlight_during_activity;
        }
        gCMComplexTwoLineButton3.setButtonBottomLeftLabel(getString(i14));
    }
}
