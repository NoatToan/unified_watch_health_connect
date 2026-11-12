package com.garmin.android.apps.connectmobile.settings.devices;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import ch1.c0;
import ch1.x0;
import ch1.z0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexTwoLineButton;
import java.util.Observable;
import java.util.Observer;

/* JADX INFO: loaded from: classes10.dex */
public class Forerunner35PhoneNotificationsDeviceSettings extends com.garmin.android.apps.connectmobile.c implements Observer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public x0 f42090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public z0 f42091b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c0 f42092c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public GCMComplexTwoLineButton f42093d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public GCMComplexTwoLineButton f42094e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public GCMComplexTwoLineButton f42095f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public GCMComplexTwoLineButton f42096g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f42097h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f42098i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public DeviceSettingsDTO f42099j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f42100k = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final a f42101l = new a();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final b f42102m = new b();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final c f42103n = new c();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final d f42104o = new d();

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view2) {
            Forerunner35PhoneNotificationsDeviceSettings forerunner35PhoneNotificationsDeviceSettings = Forerunner35PhoneNotificationsDeviceSettings.this;
            int iC = forerunner35PhoneNotificationsDeviceSettings.f42099j.Q0() ? forerunner35PhoneNotificationsDeviceSettings.f42099j.f33863b1.C() : 1;
            androidx.appcompat.app.e.a aVar = new androidx.appcompat.app.e.a(view2.getContext());
            aVar.setTitle(R.string.lbl_smart_notifications).setSingleChoiceItems(forerunner35PhoneNotificationsDeviceSettings.f42099j.f33863b1.I(forerunner35PhoneNotificationsDeviceSettings), iC, new hg1.g(19, this, view2));
            aVar.create().show();
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view2) {
            Forerunner35PhoneNotificationsDeviceSettings forerunner35PhoneNotificationsDeviceSettings = Forerunner35PhoneNotificationsDeviceSettings.this;
            int iG = forerunner35PhoneNotificationsDeviceSettings.f42099j.S0() ? forerunner35PhoneNotificationsDeviceSettings.f42099j.f33865c1.G() : 2;
            androidx.appcompat.app.e.a aVar = new androidx.appcompat.app.e.a(view2.getContext());
            aVar.setTitle(R.string.device_settings_alert).setSingleChoiceItems(forerunner35PhoneNotificationsDeviceSettings.f42099j.f33863b1.Z(forerunner35PhoneNotificationsDeviceSettings), iG, new hg1.g(20, this, view2));
            aVar.create().show();
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view2) {
            Forerunner35PhoneNotificationsDeviceSettings forerunner35PhoneNotificationsDeviceSettings = Forerunner35PhoneNotificationsDeviceSettings.this;
            int iG = forerunner35PhoneNotificationsDeviceSettings.f42099j.Q0() ? forerunner35PhoneNotificationsDeviceSettings.f42099j.f33863b1.G() : 2;
            androidx.appcompat.app.e.a aVar = new androidx.appcompat.app.e.a(view2.getContext());
            aVar.setTitle(R.string.device_settings_alert).setSingleChoiceItems(forerunner35PhoneNotificationsDeviceSettings.f42099j.f33863b1.Z(forerunner35PhoneNotificationsDeviceSettings), iG, new hg1.g(21, this, view2));
            aVar.create().show();
        }
    }

    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view2) {
            Forerunner35PhoneNotificationsDeviceSettings forerunner35PhoneNotificationsDeviceSettings = Forerunner35PhoneNotificationsDeviceSettings.this;
            int iC = forerunner35PhoneNotificationsDeviceSettings.f42099j.S0() ? forerunner35PhoneNotificationsDeviceSettings.f42099j.f33865c1.C() : 1;
            androidx.appcompat.app.e.a aVar = new androidx.appcompat.app.e.a(view2.getContext());
            aVar.setTitle(R.string.lbl_smart_notifications).setSingleChoiceItems(forerunner35PhoneNotificationsDeviceSettings.f42099j.f33863b1.I(forerunner35PhoneNotificationsDeviceSettings), iC, new hg1.g(22, this, view2));
            aVar.create().show();
        }
    }

    public final void ca(boolean z14) {
        if (z14) {
            this.f42090a.m(z14);
            boolean z15 = this.f42090a.z(this.f42099j);
            GCMComplexTwoLineButton gCMComplexTwoLineButton = this.f42093d;
            if (z15) {
                gCMComplexTwoLineButton.setVisibility(0);
                this.f42094e.setVisibility(this.f42099j.f33863b1.c0() ? 0 : 8);
                this.f42099j.f33863b1.i0(this.f42097h);
            } else {
                gCMComplexTwoLineButton.setVisibility(8);
                this.f42094e.setVisibility(8);
                this.f42099j.f33863b1.i0("OFF");
            }
        } else {
            this.f42093d.setVisibility(8);
            this.f42094e.setVisibility(8);
            if (this.f42099j.f33863b1.g0()) {
                this.f42099j.f33863b1.i0("OFF");
            }
        }
        if (this.f42090a.z(this.f42099j)) {
            this.f42093d.setButtonBottomLeftLabel(this.f42099j.f33863b1.D(this));
        }
    }

    public final void da(boolean z14) {
        if (z14) {
            this.f42091b.m(z14);
            boolean z15 = this.f42091b.z(this.f42099j);
            GCMComplexTwoLineButton gCMComplexTwoLineButton = this.f42095f;
            if (z15) {
                gCMComplexTwoLineButton.setVisibility(0);
                this.f42096g.setVisibility(this.f42099j.f33865c1.c0() ? 0 : 8);
                this.f42099j.f33865c1.i0(this.f42098i);
            } else {
                gCMComplexTwoLineButton.setVisibility(8);
                this.f42096g.setVisibility(8);
                this.f42099j.f33865c1.i0("OFF");
            }
        } else {
            this.f42095f.setVisibility(8);
            this.f42096g.setVisibility(8);
            if (this.f42099j.f33865c1.g0()) {
                this.f42099j.f33865c1.i0("OFF");
            }
        }
        if (this.f42091b.z(this.f42099j)) {
            this.f42095f.setButtonBottomLeftLabel(this.f42099j.f33865c1.D(this));
        }
    }

    @Override // android.app.Activity
    public final void finish() {
        setResult(-1, getIntent().putExtra("GCM_deviceSettings", this.f42099j));
        super.finish();
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.gcm3_device_settings_phone_notifications);
        if (getIntent().getExtras() != null) {
            this.f42099j = (DeviceSettingsDTO) getIntent().getExtras().getParcelable("GCM_deviceSettings");
            String stringExtra = getIntent().getStringExtra("GCM_deviceSettingsTitle");
            this.f42100k = getIntent().getExtras().getBoolean("BLE_CONNECTION_ALERT", false);
            if (TextUtils.isEmpty(stringExtra)) {
                stringExtra = getString(R.string.device_setting_phone_notifications);
            }
            initActionBar(true, stringExtra);
        }
        if (this.f42099j == null) {
            i2.f(a2.SETTINGS, "Forerunner35PhoneNotificationsDeviceSettings", "Invalid device settings object while entering device settings Phone Notifications screen!");
            finish();
            return;
        }
        this.f42094e = (GCMComplexTwoLineButton) findViewById(R.id.device_settings_during_activity_alert_btn);
        this.f42093d = (GCMComplexTwoLineButton) findViewById(R.id.device_settings_during_activity_notification_btn);
        this.f42096g = (GCMComplexTwoLineButton) findViewById(R.id.device_settings_not_during_activity_alert_btn);
        this.f42095f = (GCMComplexTwoLineButton) findViewById(R.id.device_settings_not_during_activity_notification_btn);
        if (this.f42100k) {
            findViewById(R.id.device_settings_ble_alert_btn).setVisibility(0);
        }
        wi1.c cVar = this.f42099j.f33863b1;
        if (cVar == null) {
            i2.f(a2.SETTINGS, "Forerunner35PhoneNotificationsDeviceSettings", "Invalid DuringActivityDTO object while entering device settings Phone Notifications screen!");
            finish();
            return;
        }
        this.f42094e.setOnClickListener(this.f42103n);
        this.f42094e.setButtonBottomLeftLabel(cVar.H(this));
        this.f42093d.setOnClickListener(this.f42101l);
        this.f42093d.setButtonBottomLeftLabel(cVar.D(this));
        this.f42097h = cVar.f185502a;
        wi1.f fVar = this.f42099j.f33865c1;
        this.f42096g.setOnClickListener(this.f42102m);
        this.f42096g.setButtonBottomLeftLabel(fVar.H(this));
        this.f42095f.setOnClickListener(this.f42104o);
        this.f42095f.setButtonBottomLeftLabel(fVar.D(this));
        this.f42098i = fVar.f185502a;
        this.f42090a = new x0(this);
        this.f42091b = new z0(this);
        if (this.f42090a.g(this, this.f42099j)) {
            this.f42090a.addObserver(this);
            ca(true);
        }
        if (this.f42091b.g(this, this.f42099j)) {
            this.f42091b.addObserver(this);
            da(true);
        }
        if (this.f42100k) {
            c0 c0Var = new c0(this);
            this.f42092c = c0Var;
            this.f42092c.m(c0Var.g(this, this.f42099j));
            this.f42092c.addObserver(this);
        }
    }

    @Override // java.util.Observer
    public final void update(Observable observable, Object obj) {
        i2.k(a2.SETTINGS, "Forerunner35PhoneNotificationsDeviceSettings", hb.a.j("update(): observable=", observable, ", data=", obj));
        if (obj != null) {
            if ((observable instanceof x0) && (obj instanceof Boolean)) {
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                if (zBooleanValue && !this.f42090a.z(this.f42099j)) {
                    if (this.f42097h.equalsIgnoreCase("OFF")) {
                        this.f42097h = "SHOW_ALL";
                    }
                    this.f42099j.f33863b1.i0(this.f42097h);
                }
                ca(zBooleanValue);
                return;
            }
            if ((observable instanceof z0) && (obj instanceof Boolean)) {
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                if (zBooleanValue2 && !this.f42091b.z(this.f42099j)) {
                    if (this.f42098i.equalsIgnoreCase("OFF")) {
                        this.f42098i = "SHOW_ALL";
                    }
                    this.f42099j.f33865c1.i0(this.f42098i);
                }
                da(zBooleanValue2);
            }
        }
    }
}
