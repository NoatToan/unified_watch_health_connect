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
import ng1.c1;

/* JADX INFO: loaded from: classes10.dex */
public class VivosmartDeviceSettingsDisplay extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f42342j = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public GCMComplexTwoLineButton f42343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public GCMComplexOneLineButton f42344b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public GCMComplexTwoLineButton f42345c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public DeviceSettingsDTO f42346d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f42347e = new a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b f42348f = new b();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c f42349g = new c();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final d f42350h = new d();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final e f42351i = new e();

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view2) {
            VivosmartDeviceSettingsDisplay vivosmartDeviceSettingsDisplay = VivosmartDeviceSettingsDisplay.this;
            DeviceSettingsDTO deviceSettingsDTO = vivosmartDeviceSettingsDisplay.f42346d;
            int i14 = VivosmartDeviceSettingsScreens.f42402m;
            Intent intent = new Intent(vivosmartDeviceSettingsDisplay, (Class<?>) VivosmartDeviceSettingsScreens.class);
            intent.putExtra("GCM_deviceSettings", deviceSettingsDTO);
            vivosmartDeviceSettingsDisplay.startActivityForResult(intent, 10);
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view2) {
            int i14 = VivosmartDeviceSettingsDisplay.f42342j;
            VivosmartDeviceSettingsDisplay vivosmartDeviceSettingsDisplay = VivosmartDeviceSettingsDisplay.this;
            ArrayList arrayListCa = vivosmartDeviceSettingsDisplay.ca();
            int iIndexOf = arrayListCa.indexOf(f.a(vivosmartDeviceSettingsDisplay.f42346d.A));
            androidx.appcompat.app.e.a aVar = new androidx.appcompat.app.e.a(vivosmartDeviceSettingsDisplay);
            androidx.appcompat.app.e.a title = aVar.setTitle(R.string.device_setting_home_screen);
            CharSequence[] charSequenceArr = new CharSequence[arrayListCa.size()];
            for (int i15 = 0; i15 < arrayListCa.size(); i15++) {
                charSequenceArr[i15] = vivosmartDeviceSettingsDisplay.getString(((f) arrayListCa.get(i15)).f42371b);
            }
            title.setSingleChoiceItems(charSequenceArr, iIndexOf, new hg1.g(25, this, arrayListCa));
            aVar.create().show();
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view2) {
            VivosmartDeviceSettingsDisplay vivosmartDeviceSettingsDisplay = VivosmartDeviceSettingsDisplay.this;
            DeviceSettingsDTO deviceSettingsDTO = vivosmartDeviceSettingsDisplay.f42346d;
            int i14 = VivosmartDeviceSettingsOrientation.f42372y;
            Intent intent = new Intent(vivosmartDeviceSettingsDisplay, (Class<?>) VivosmartDeviceSettingsOrientation.class);
            intent.putExtra("GCM_deviceSettings", deviceSettingsDTO);
            vivosmartDeviceSettingsDisplay.startActivityForResult(intent, 10);
        }
    }

    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view2) {
            VivosmartDeviceSettingsDisplay vivosmartDeviceSettingsDisplay = VivosmartDeviceSettingsDisplay.this;
            int iOrdinal = vivosmartDeviceSettingsDisplay.f42346d.M().ordinal();
            androidx.appcompat.app.e.a aVar = new androidx.appcompat.app.e.a(vivosmartDeviceSettingsDisplay);
            androidx.appcompat.app.e.a title = aVar.setTitle(R.string.device_setting_autodisplay);
            DeviceSettingsDTO.a.f33911c.getClass();
            w13.c cVar = DeviceSettingsDTO.a.f33916h;
            CharSequence[] charSequenceArr = new CharSequence[cVar.getF134973e()];
            int length = cVar.toArray(new DeviceSettingsDTO.a[0]).length;
            for (int i14 = 0; i14 < length; i14++) {
                charSequenceArr[i14] = vivosmartDeviceSettingsDisplay.getString(((DeviceSettingsDTO.a) cVar.get(i14)).f33918b);
            }
            title.setSingleChoiceItems(charSequenceArr, iOrdinal, new c1(this, 1));
            aVar.create().show();
        }
    }

    public class e implements CompoundButton.OnCheckedChangeListener {
        public e() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public final void onCheckedChanged(CompoundButton compoundButton, boolean z14) {
            VivosmartDeviceSettingsDisplay vivosmartDeviceSettingsDisplay = VivosmartDeviceSettingsDisplay.this;
            if (z14) {
                DeviceSettingsDTO deviceSettingsDTO = vivosmartDeviceSettingsDisplay.f42346d;
                DeviceSettingsDTO.b bVar = DeviceSettingsDTO.b.AUTO_BRIGHTNESS;
                deviceSettingsDTO.getClass();
                bVar.getClass();
                deviceSettingsDTO.E = bVar.f33926a;
                deviceSettingsDTO.S1("backlightMode");
                return;
            }
            DeviceSettingsDTO deviceSettingsDTO2 = vivosmartDeviceSettingsDisplay.f42346d;
            DeviceSettingsDTO.b bVar2 = DeviceSettingsDTO.b.OFF;
            deviceSettingsDTO2.getClass();
            bVar2.getClass();
            deviceSettingsDTO2.E = bVar2.f33926a;
            deviceSettingsDTO2.S1("backlightMode");
        }
    }

    public enum f {
        LAST_DISPLAYED(R.string.device_screen_last_displayed, "page_none"),
        TIME_DATE(R.string.device_screen_time_date, "page_time_date"),
        STEPS(R.string.steps_steps, "page_steps"),
        STEPS_GOAL(R.string.steps_steps_goal, "page_steps_goal"),
        MOVE_BAR(R.string.device_screen_move_bar, "page_move_bar"),
        CALORIES(R.string.lbl_calories, "page_calories"),
        DISTANCE(R.string.lbl_distance, "page_distance"),
        HEART_RATE(R.string.device_screen_heart_rate, "page_heartrate"),
        BIKE_SPEED(R.string.device_screen_bike_speed, "page_bike_speed"),
        NOTIFICATIONS(R.string.device_screen_notifications, "page_notifications"),
        MUSIC(R.string.device_screen_music, "page_music"),
        VIRB_REMOTE(R.string.device_screen_virb_remote, "page_virb_remote");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f42370a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f42371b;

        f(int i14, String str) {
            this.f42370a = str;
            this.f42371b = i14;
        }

        public static f a(String str) {
            if (str != null) {
                for (f fVar : values()) {
                    if (fVar.f42370a.equals(str)) {
                        return fVar;
                    }
                }
            }
            return LAST_DISPLAYED;
        }
    }

    public final ArrayList ca() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(f.LAST_DISPLAYED);
        o oVar = this.f42346d.f33872g;
        if (oVar != null) {
            if (oVar.I("page_time_date")) {
                arrayList.add(f.TIME_DATE);
            }
            if (oVar.I("page_steps")) {
                arrayList.add(f.STEPS);
            }
            if (oVar.c0().booleanValue()) {
                arrayList.add(f.STEPS_GOAL);
            }
            if (oVar.I("page_move_bar")) {
                arrayList.add(f.MOVE_BAR);
            }
            if (oVar.F().booleanValue()) {
                arrayList.add(f.CALORIES);
            }
            if (oVar.H().booleanValue()) {
                arrayList.add(f.DISTANCE);
            }
            if (oVar.M().booleanValue()) {
                arrayList.add(f.HEART_RATE);
            }
            if (oVar.I("page_bike_speed")) {
                arrayList.add(f.BIKE_SPEED);
            }
            if (oVar.a0().booleanValue()) {
                arrayList.add(f.NOTIFICATIONS);
            }
            if (oVar.Z().booleanValue()) {
                arrayList.add(f.MUSIC);
            }
            if (oVar.f0().booleanValue()) {
                arrayList.add(f.VIRB_REMOTE);
            }
        }
        return arrayList;
    }

    @Override // android.app.Activity
    public final void finish() {
        getIntent().putExtra("GCM_deviceSettings", this.f42346d);
        setResult(-1, getIntent());
        super.finish();
    }

    @Override // com.garmin.android.apps.connectmobile.z1, androidx.fragment.app.m, b.g, android.app.Activity
    public final void onActivityResult(int i14, int i15, Intent intent) {
        super.onActivityResult(i14, i15, intent);
        if (i14 == 10 && i15 == -1) {
            DeviceSettingsDTO deviceSettingsDTO = (intent == null || intent.getExtras() == null) ? null : (DeviceSettingsDTO) intent.getExtras().get("GCM_deviceSettings");
            if (deviceSettingsDTO != null) {
                this.f42346d = deviceSettingsDTO;
                if (ca().contains(f.a(this.f42346d.A))) {
                    return;
                }
                this.f42346d.A1(f.LAST_DISPLAYED.f42370a);
                this.f42343a.setButtonBottomLeftLabel(getString(f.a(this.f42346d.A).f42371b));
            }
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.gcm3_device_settings_vivosmart_display);
        initActionBar(true, R.string.devices_settings_device_settings);
        if (getIntent().getExtras() != null) {
            this.f42346d = (DeviceSettingsDTO) getIntent().getExtras().getParcelable("GCM_deviceSettings");
        }
        if (this.f42346d == null) {
            i2.f(a2.SETTINGS, "TimeDateSystemDeviceSettings", "Invalid device settings object while entering device settings time, date, system screen!");
            finish();
            return;
        }
        ((GCMComplexOneLineButton) findViewById(R.id.device_settings_vivosmart_visible_screens_btn)).setOnClickListener(this.f42347e);
        GCMComplexTwoLineButton gCMComplexTwoLineButton = (GCMComplexTwoLineButton) findViewById(R.id.device_settings_vivosmart_home_screen_btn);
        this.f42343a = gCMComplexTwoLineButton;
        gCMComplexTwoLineButton.setOnClickListener(this.f42348f);
        ((GCMComplexOneLineButton) findViewById(R.id.device_settings_vivosmart_orientation_btn)).setOnClickListener(this.f42349g);
        GCMComplexOneLineButton gCMComplexOneLineButton = (GCMComplexOneLineButton) findViewById(R.id.device_settings_vivosmart_auto_bright_display_btn);
        this.f42344b = gCMComplexOneLineButton;
        gCMComplexOneLineButton.setOnCheckedChangeListener(this.f42351i);
        GCMComplexTwoLineButton gCMComplexTwoLineButton2 = (GCMComplexTwoLineButton) findViewById(R.id.device_settings_vivosmart_auto_on_btn);
        this.f42345c = gCMComplexTwoLineButton2;
        gCMComplexTwoLineButton2.setOnClickListener(this.f42350h);
        this.f42343a.setButtonBottomLeftLabel(getString(f.a(this.f42346d.A).f42371b));
        DeviceSettingsDTO.b bVarZ = this.f42346d.Z();
        DeviceSettingsDTO.b bVar = DeviceSettingsDTO.b.AUTO_BRIGHTNESS;
        GCMComplexOneLineButton gCMComplexOneLineButton2 = this.f42344b;
        if (bVarZ == bVar) {
            gCMComplexOneLineButton2.k();
        } else {
            gCMComplexOneLineButton2.j();
        }
        this.f42345c.setButtonBottomLeftLabel(getString(this.f42346d.M().f33918b));
    }
}
