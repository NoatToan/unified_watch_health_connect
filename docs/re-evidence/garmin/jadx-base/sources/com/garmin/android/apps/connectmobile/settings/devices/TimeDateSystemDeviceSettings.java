package com.garmin.android.apps.connectmobile.settings.devices;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexTwoLineButton;
import java.util.ArrayList;
import zb0.s0;
import zb0.u0;

/* JADX INFO: loaded from: classes10.dex */
public class TimeDateSystemDeviceSettings extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public GCMComplexTwoLineButton f42166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public GCMComplexTwoLineButton f42167b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public GCMComplexTwoLineButton f42168c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public GCMComplexTwoLineButton f42169d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f42170e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public DeviceSettingsDTO f42171f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a f42172g = new a();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b f42173h = new b();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final c f42174i = new c();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final d f42175j = new d();

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view2) {
            TimeDateSystemDeviceSettings timeDateSystemDeviceSettings = TimeDateSystemDeviceSettings.this;
            int iOrdinal = timeDateSystemDeviceSettings.f42171f.h0().ordinal();
            androidx.appcompat.app.e.a aVar = new androidx.appcompat.app.e.a(timeDateSystemDeviceSettings);
            aVar.setTitle(R.string.lbl_time_format).setSingleChoiceItems(DeviceSettingsDTO.p.a(timeDateSystemDeviceSettings), iOrdinal, new kx0.f(this, 19));
            aVar.create().show();
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view2) {
            TimeDateSystemDeviceSettings timeDateSystemDeviceSettings = TimeDateSystemDeviceSettings.this;
            int iOrdinal = timeDateSystemDeviceSettings.f42171f.a0().ordinal();
            androidx.appcompat.app.e.a aVar = new androidx.appcompat.app.e.a(timeDateSystemDeviceSettings);
            aVar.setTitle(R.string.lbl_date_format).setSingleChoiceItems(DeviceSettingsDTO.j.a(timeDateSystemDeviceSettings), iOrdinal, new kx0.f(this, 20));
            aVar.create().show();
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view2) {
            TimeDateSystemDeviceSettings timeDateSystemDeviceSettings = TimeDateSystemDeviceSettings.this;
            ArrayList arrayListG0 = timeDateSystemDeviceSettings.f42171f.g0();
            DeviceSettingsDTO deviceSettingsDTO = timeDateSystemDeviceSettings.f42171f;
            deviceSettingsDTO.getClass();
            s0.a aVar = s0.f203651c;
            Integer num = deviceSettingsDTO.f33907y;
            s0 s0Var = s0.GCMDeviceLanguageEnglish;
            aVar.getClass();
            int iIndexOf = arrayListG0.indexOf(s0.a.a(num, s0Var));
            CharSequence[] charSequenceArr = new CharSequence[arrayListG0.size()];
            for (int i14 = 0; i14 < arrayListG0.size(); i14++) {
                charSequenceArr[i14] = timeDateSystemDeviceSettings.getString(((s0) arrayListG0.get(i14)).f203657b);
            }
            androidx.appcompat.app.e.a aVar2 = new androidx.appcompat.app.e.a(timeDateSystemDeviceSettings);
            aVar2.setTitle(R.string.device_setting_language).setSingleChoiceItems(charSequenceArr, iIndexOf, new hg1.g(23, this, arrayListG0));
            aVar2.create().show();
        }
    }

    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view2) {
            TimeDateSystemDeviceSettings timeDateSystemDeviceSettings = TimeDateSystemDeviceSettings.this;
            int iOrdinal = timeDateSystemDeviceSettings.f42171f.c0().ordinal();
            androidx.appcompat.app.e.a aVar = new androidx.appcompat.app.e.a(timeDateSystemDeviceSettings);
            aVar.setTitle(R.string.lbl_distance).setSingleChoiceItems(DeviceSettingsDTO.l.a(timeDateSystemDeviceSettings), iOrdinal, new kx0.f(this, 21));
            aVar.create().show();
        }
    }

    public static void ca(Activity activity, DeviceSettingsDTO deviceSettingsDTO) {
        Intent intent = new Intent(activity, (Class<?>) TimeDateSystemDeviceSettings.class);
        intent.putExtra("GCM_deviceSettings", deviceSettingsDTO);
        activity.startActivityForResult(intent, 10);
    }

    public static void da(Activity activity, DeviceSettingsDTO deviceSettingsDTO, String str) {
        Intent intent = new Intent(activity, (Class<?>) TimeDateSystemDeviceSettings.class);
        intent.putExtra("GCM_deviceSettings", deviceSettingsDTO);
        intent.putExtra("GCM_deviceSettingsTitle", str);
        activity.startActivityForResult(intent, 10);
    }

    @Override // android.app.Activity
    public final void finish() {
        getIntent().putExtra("GCM_deviceSettings", this.f42171f);
        setResult(-1, getIntent());
        super.finish();
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        ArrayList arrayList;
        super.onCreate(bundle);
        setContentView(R.layout.gcm3_device_settings_time_date_system);
        if (getIntent().getExtras() != null) {
            this.f42171f = (DeviceSettingsDTO) getIntent().getExtras().getParcelable("GCM_deviceSettings");
            this.f42170e = getIntent().getStringExtra("GCM_deviceProductNbr");
            String stringExtra = getIntent().getStringExtra("GCM_deviceSettingsTitle");
            if (TextUtils.isEmpty(stringExtra)) {
                stringExtra = getString(R.string.devices_settings_device_settings);
            }
            initActionBar(true, stringExtra);
        }
        if (this.f42171f == null) {
            i2.f(a2.SETTINGS, "TimeDateSystemDeviceSettings", "Invalid device settings object while entering device settings time, date, system screen!");
            finish();
            return;
        }
        GCMComplexTwoLineButton gCMComplexTwoLineButton = (GCMComplexTwoLineButton) findViewById(R.id.device_settings_time_format_btn);
        this.f42166a = gCMComplexTwoLineButton;
        gCMComplexTwoLineButton.setOnClickListener(this.f42172g);
        GCMComplexTwoLineButton gCMComplexTwoLineButton2 = (GCMComplexTwoLineButton) findViewById(R.id.device_settings_date_format_btn);
        this.f42167b = gCMComplexTwoLineButton2;
        gCMComplexTwoLineButton2.setOnClickListener(this.f42173h);
        GCMComplexTwoLineButton gCMComplexTwoLineButton3 = (GCMComplexTwoLineButton) findViewById(R.id.device_settings_language_btn);
        this.f42168c = gCMComplexTwoLineButton3;
        gCMComplexTwoLineButton3.setOnClickListener(this.f42174i);
        GCMComplexTwoLineButton gCMComplexTwoLineButton4 = (GCMComplexTwoLineButton) findViewById(R.id.device_settings_distance_btn);
        this.f42169d = gCMComplexTwoLineButton4;
        gCMComplexTwoLineButton4.setOnClickListener(this.f42175j);
        if (this.f42171f.s1("supportedLanguages") || (arrayList = this.f42171f.f33903w) == null || arrayList.size() <= 0) {
            this.f42168c.setVisibility(8);
        } else {
            GCMComplexTwoLineButton gCMComplexTwoLineButton5 = this.f42168c;
            DeviceSettingsDTO deviceSettingsDTO = this.f42171f;
            deviceSettingsDTO.getClass();
            s0.a aVar = s0.f203651c;
            Integer num = deviceSettingsDTO.f33907y;
            s0 s0Var = s0.GCMDeviceLanguageEnglish;
            aVar.getClass();
            gCMComplexTwoLineButton5.setButtonBottomLeftLabel(getString(s0.a.a(num, s0Var).f203657b));
        }
        boolean zS1 = this.f42171f.s1("timeFormat");
        GCMComplexTwoLineButton gCMComplexTwoLineButton6 = this.f42166a;
        if (zS1) {
            gCMComplexTwoLineButton6.setVisibility(8);
        } else {
            gCMComplexTwoLineButton6.setButtonBottomLeftLabel(getString(this.f42171f.h0().f34017b));
        }
        boolean zS2 = this.f42171f.s1("dateFormat");
        GCMComplexTwoLineButton gCMComplexTwoLineButton7 = this.f42167b;
        if (zS2) {
            gCMComplexTwoLineButton7.setVisibility(8);
        } else {
            gCMComplexTwoLineButton7.setButtonBottomLeftLabel(getString(this.f42171f.a0().f33976b));
        }
        boolean zS3 = this.f42171f.s1("allUnits");
        GCMComplexTwoLineButton gCMComplexTwoLineButton8 = this.f42169d;
        if (zS3) {
            gCMComplexTwoLineButton8.setVisibility(8);
        } else {
            gCMComplexTwoLineButton8.setButtonBottomLeftLabel(getString(this.f42171f.c0().f33990b));
        }
        if (u0.n(this.f42170e, u0.L2)) {
            this.f42167b.setVisibility(8);
        }
        if (u0.n(this.f42170e, u0.J2) || u0.n(this.f42170e, u0.K2) || u0.n(this.f42170e, u0.D4) || u0.n(this.f42170e, u0.E4)) {
            this.f42166a.setVisibility(8);
        }
    }
}
