package com.garmin.android.apps.connectmobile.settings.devices.common;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import ch1.a4;
import ch1.c0;
import ch1.x0;
import ch1.z0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexTwoLineButton;
import fb2.g;
import java.util.Observable;
import java.util.Observer;
import pk1.t;
import wi1.h;

/* JADX INFO: loaded from: classes10.dex */
public class DevicePhoneNotificationActivityV3 extends com.garmin.android.apps.connectmobile.c implements Observer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public x0 f42643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public z0 f42644b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a4 f42645c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public GCMComplexTwoLineButton f42646d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public GCMComplexTwoLineButton f42647e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public GCMComplexTwoLineButton f42648f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public GCMComplexTwoLineButton f42649g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f42650h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f42651i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public DeviceSettingsDTO f42652j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f42653k = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f42654l = true;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final a f42655m = new a();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final b f42656n = new b();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final c f42657o = new c();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final d f42658p = new d();

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view2) {
            DevicePhoneNotificationActivityV3 devicePhoneNotificationActivityV3 = DevicePhoneNotificationActivityV3.this;
            int iC = devicePhoneNotificationActivityV3.f42652j.Q0() ? devicePhoneNotificationActivityV3.f42652j.f33863b1.C() : 1;
            Context context = view2.getContext();
            androidx.appcompat.app.e.a aVar = new androidx.appcompat.app.e.a(context);
            androidx.appcompat.app.e.a title = aVar.setTitle(R.string.lbl_smart_notifications);
            devicePhoneNotificationActivityV3.f42652j.f33863b1.getClass();
            title.setSingleChoiceItems(h.M(context), iC, new t(16, this, context));
            aVar.create().show();
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view2) {
            DevicePhoneNotificationActivityV3 devicePhoneNotificationActivityV3 = DevicePhoneNotificationActivityV3.this;
            int iG = devicePhoneNotificationActivityV3.f42652j.S0() ? devicePhoneNotificationActivityV3.f42652j.f33865c1.G() : 2;
            Context context = view2.getContext();
            androidx.appcompat.app.e.a aVar = new androidx.appcompat.app.e.a(context);
            aVar.setTitle(R.string.device_settings_alert).setSingleChoiceItems(devicePhoneNotificationActivityV3.f42652j.f33863b1.Z(context), iG, new t(17, this, context));
            aVar.create().show();
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view2) {
            DevicePhoneNotificationActivityV3 devicePhoneNotificationActivityV3 = DevicePhoneNotificationActivityV3.this;
            int iG = devicePhoneNotificationActivityV3.f42652j.Q0() ? devicePhoneNotificationActivityV3.f42652j.f33863b1.G() : 2;
            Context context = view2.getContext();
            androidx.appcompat.app.e.a aVar = new androidx.appcompat.app.e.a(context);
            aVar.setTitle(R.string.device_settings_alert).setSingleChoiceItems(devicePhoneNotificationActivityV3.f42652j.f33863b1.Z(context), iG, new t(18, this, context));
            aVar.create().show();
        }
    }

    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view2) {
            DevicePhoneNotificationActivityV3 devicePhoneNotificationActivityV3 = DevicePhoneNotificationActivityV3.this;
            int iC = devicePhoneNotificationActivityV3.f42652j.S0() ? devicePhoneNotificationActivityV3.f42652j.f33865c1.C() : 1;
            Context context = view2.getContext();
            androidx.appcompat.app.e.a aVar = new androidx.appcompat.app.e.a(context);
            androidx.appcompat.app.e.a title = aVar.setTitle(R.string.lbl_smart_notifications);
            devicePhoneNotificationActivityV3.f42652j.f33863b1.getClass();
            title.setSingleChoiceItems(h.M(context), iC, new t(19, this, context));
            aVar.create().show();
        }
    }

    public final void ca(boolean z14) {
        int i14 = 8;
        if (z14) {
            this.f42643a.m(z14);
            boolean z15 = this.f42643a.z(this.f42652j);
            GCMComplexTwoLineButton gCMComplexTwoLineButton = this.f42646d;
            if (z15) {
                gCMComplexTwoLineButton.setVisibility(0);
                GCMComplexTwoLineButton gCMComplexTwoLineButton2 = this.f42647e;
                if (this.f42654l && this.f42652j.f33863b1.c0()) {
                    i14 = 0;
                }
                gCMComplexTwoLineButton2.setVisibility(i14);
                this.f42652j.f33863b1.i0(this.f42650h);
            } else {
                gCMComplexTwoLineButton.setVisibility(8);
                this.f42647e.setVisibility(8);
                this.f42652j.f33863b1.i0("OFF");
            }
        } else {
            this.f42646d.setVisibility(8);
            this.f42647e.setVisibility(8);
            if (this.f42652j.f33863b1.g0()) {
                this.f42652j.f33863b1.i0("OFF");
            }
        }
        if (this.f42643a.z(this.f42652j)) {
            this.f42646d.setButtonBottomLeftLabel(this.f42652j.f33863b1.F(this));
        }
    }

    public final void da(boolean z14) {
        int i14 = 8;
        if (z14) {
            this.f42644b.m(z14);
            boolean z15 = this.f42644b.z(this.f42652j);
            GCMComplexTwoLineButton gCMComplexTwoLineButton = this.f42648f;
            if (z15) {
                gCMComplexTwoLineButton.setVisibility(0);
                GCMComplexTwoLineButton gCMComplexTwoLineButton2 = this.f42649g;
                if (this.f42654l && this.f42652j.f33865c1.c0()) {
                    i14 = 0;
                }
                gCMComplexTwoLineButton2.setVisibility(i14);
                this.f42652j.f33865c1.i0(this.f42651i);
            } else {
                gCMComplexTwoLineButton.setVisibility(8);
                this.f42649g.setVisibility(8);
                this.f42652j.f33865c1.i0("OFF");
            }
        } else {
            this.f42648f.setVisibility(8);
            this.f42649g.setVisibility(8);
            if (this.f42652j.f33865c1.g0()) {
                this.f42652j.f33865c1.i0("OFF");
            }
        }
        if (this.f42644b.z(this.f42652j)) {
            this.f42648f.setButtonBottomLeftLabel(this.f42652j.f33865c1.F(this));
        }
    }

    @Override // android.app.Activity
    public final void finish() {
        setResult(-1, getIntent().putExtra("GCM_deviceSettings", this.f42652j));
        super.finish();
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.gcm3_device_settings_phone_notifications);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            this.f42652j = (DeviceSettingsDTO) extras.getParcelable("GCM_deviceSettings");
            String stringExtra = getIntent().getStringExtra("GCM_deviceSettingsTitle");
            this.f42653k = extras.getBoolean("BLE_CONNECTION_ALERT", false);
            if (TextUtils.isEmpty(stringExtra)) {
                stringExtra = getString(R.string.device_setting_phone_notifications);
            }
            initActionBar(true, stringExtra);
            this.f42654l = extras.getBoolean("GCM_showPhoneNotificationAlerts");
        }
        if (this.f42652j == null) {
            i2.f(a2.SETTINGS, "DevicePhoneNotificationActivityV3", "Invalid device settings object while entering device settings Phone Notifications screen!");
            finish();
            return;
        }
        this.f42647e = (GCMComplexTwoLineButton) findViewById(R.id.device_settings_during_activity_alert_btn);
        this.f42646d = (GCMComplexTwoLineButton) findViewById(R.id.device_settings_during_activity_notification_btn);
        this.f42649g = (GCMComplexTwoLineButton) findViewById(R.id.device_settings_not_during_activity_alert_btn);
        this.f42648f = (GCMComplexTwoLineButton) findViewById(R.id.device_settings_not_during_activity_notification_btn);
        if (this.f42653k) {
            findViewById(R.id.device_settings_ble_alert_btn).setVisibility(0);
        }
        wi1.c cVar = this.f42652j.f33863b1;
        if (cVar == null) {
            i2.f(a2.SETTINGS, "DevicePhoneNotificationActivityV3", "Invalid DuringActivityDTO object while entering device settings Phone Notifications screen!");
            finish();
            return;
        }
        this.f42646d.setOnClickListener(this.f42655m);
        this.f42648f.setOnClickListener(this.f42658p);
        this.f42647e.setOnClickListener(this.f42657o);
        this.f42647e.setButtonBottomLeftLabel(cVar.H(this));
        this.f42646d.setButtonBottomLeftLabel(cVar.F(this));
        this.f42650h = cVar.f185502a;
        wi1.f fVar = this.f42652j.f33865c1;
        if (fVar == null) {
            i2.f(a2.SETTINGS, "DevicePhoneNotificationActivityV3", "Invalid notDuringActivityDTO object while entering device settings Phone Notifications screen!");
            finish();
            return;
        }
        this.f42649g.setOnClickListener(this.f42656n);
        this.f42649g.setButtonBottomLeftLabel(fVar.H(this));
        this.f42648f.setButtonBottomLeftLabel(fVar.F(this));
        this.f42651i = fVar.f185502a;
        this.f42643a = new x0(this);
        this.f42644b = new z0(this);
        this.f42645c = new a4(this);
        DeviceSettingsDTO deviceSettingsDTO = this.f42652j;
        deviceSettingsDTO.getClass();
        if (deviceSettingsDTO.Y0 != null) {
            this.f42645c.g(this, this.f42652j);
            this.f42645c.addObserver(this);
            LinearLayout linearLayout = (LinearLayout) findViewById(R.id.layout_id);
            linearLayout.addView(g.a(this));
            linearLayout.addView(this.f42645c.a());
        }
        if (this.f42643a.g(this, this.f42652j)) {
            this.f42643a.addObserver(this);
            ca(true);
        }
        if (this.f42644b.g(this, this.f42652j)) {
            this.f42644b.addObserver(this);
            da(true);
        }
        if (this.f42653k) {
            c0 c0Var = new c0(this);
            c0Var.m(c0Var.g(this, this.f42652j));
            c0Var.addObserver(this);
        }
    }

    @Override // java.util.Observer
    public final void update(Observable observable, Object obj) {
        String str;
        String str2;
        i2.k(a2.SETTINGS, "DevicePhoneNotificationActivityV3", hb.a.j("update(): observable=", observable, ", data=", obj));
        if (obj != null) {
            if ((observable instanceof x0) && (obj instanceof Boolean)) {
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                if (zBooleanValue && !this.f42643a.z(this.f42652j) && (str2 = this.f42650h) != null) {
                    if (str2.equalsIgnoreCase("OFF")) {
                        this.f42650h = "SHOW_ALL";
                    }
                    this.f42652j.f33863b1.i0(this.f42650h);
                }
                ca(zBooleanValue);
                return;
            }
            if ((observable instanceof z0) && (obj instanceof Boolean)) {
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                if (zBooleanValue2 && !this.f42644b.z(this.f42652j) && (str = this.f42651i) != null) {
                    if (str.equalsIgnoreCase("OFF")) {
                        this.f42651i = "SHOW_ALL";
                    }
                    this.f42652j.f33865c1.i0(this.f42651i);
                }
                da(zBooleanValue2);
            }
        }
    }
}
