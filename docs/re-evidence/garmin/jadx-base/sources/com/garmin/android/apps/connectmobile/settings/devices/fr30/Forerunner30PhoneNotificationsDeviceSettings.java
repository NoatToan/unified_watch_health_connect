package com.garmin.android.apps.connectmobile.settings.devices.fr30;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.appcompat.app.e;
import ch1.c0;
import ch1.x0;
import ch1.z0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexTwoLineButton;
import hg1.g;
import java.util.Observable;
import java.util.Observer;
import wi1.f;

/* JADX INFO: loaded from: classes10.dex */
public class Forerunner30PhoneNotificationsDeviceSettings extends com.garmin.android.apps.connectmobile.c implements Observer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public x0 f42971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public z0 f42972b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public GCMComplexTwoLineButton f42973c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public GCMComplexTwoLineButton f42974d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public GCMComplexTwoLineButton f42975e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public GCMComplexTwoLineButton f42976f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f42977g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f42978h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public DeviceSettingsDTO f42979i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f42980j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f42981k = true;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final a f42982l = new a();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final b f42983m = new b();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final c f42984n = new c();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final d f42985o = new d();

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view2) {
            Forerunner30PhoneNotificationsDeviceSettings forerunner30PhoneNotificationsDeviceSettings = Forerunner30PhoneNotificationsDeviceSettings.this;
            int iC = forerunner30PhoneNotificationsDeviceSettings.f42979i.Q0() ? forerunner30PhoneNotificationsDeviceSettings.f42979i.f33863b1.C() : 1;
            e.a aVar = new e.a(view2.getContext());
            aVar.setTitle(R.string.lbl_smart_notifications).setSingleChoiceItems(new CharSequence[]{view2.getContext().getString(R.string.device_settings_all_notifications)}, iC, new g(1, this, view2));
            aVar.create().show();
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view2) {
            Forerunner30PhoneNotificationsDeviceSettings forerunner30PhoneNotificationsDeviceSettings = Forerunner30PhoneNotificationsDeviceSettings.this;
            int iG = forerunner30PhoneNotificationsDeviceSettings.f42979i.S0() ? forerunner30PhoneNotificationsDeviceSettings.f42979i.f33865c1.G() : 2;
            e.a aVar = new e.a(view2.getContext());
            aVar.setTitle(R.string.device_settings_alert).setSingleChoiceItems(forerunner30PhoneNotificationsDeviceSettings.f42979i.f33863b1.Z(forerunner30PhoneNotificationsDeviceSettings), iG, new g(2, this, view2));
            aVar.create().show();
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view2) {
            Forerunner30PhoneNotificationsDeviceSettings forerunner30PhoneNotificationsDeviceSettings = Forerunner30PhoneNotificationsDeviceSettings.this;
            int iG = forerunner30PhoneNotificationsDeviceSettings.f42979i.Q0() ? forerunner30PhoneNotificationsDeviceSettings.f42979i.f33863b1.G() : 2;
            e.a aVar = new e.a(view2.getContext());
            aVar.setTitle(R.string.device_settings_alert).setSingleChoiceItems(forerunner30PhoneNotificationsDeviceSettings.f42979i.f33863b1.Z(forerunner30PhoneNotificationsDeviceSettings), iG, new g(3, this, view2));
            aVar.create().show();
        }
    }

    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view2) {
            Forerunner30PhoneNotificationsDeviceSettings forerunner30PhoneNotificationsDeviceSettings = Forerunner30PhoneNotificationsDeviceSettings.this;
            int iC = forerunner30PhoneNotificationsDeviceSettings.f42979i.S0() ? forerunner30PhoneNotificationsDeviceSettings.f42979i.f33865c1.C() : 1;
            e.a aVar = new e.a(view2.getContext());
            aVar.setTitle(R.string.lbl_smart_notifications).setSingleChoiceItems(new CharSequence[]{view2.getContext().getString(R.string.device_settings_all_notifications)}, iC, new g(4, this, view2));
            aVar.create().show();
        }
    }

    public final void ca(boolean z14) {
        int i14 = 8;
        if (z14) {
            this.f42971a.m(z14);
            boolean z15 = this.f42971a.z(this.f42979i);
            GCMComplexTwoLineButton gCMComplexTwoLineButton = this.f42973c;
            if (z15) {
                gCMComplexTwoLineButton.setVisibility(0);
                GCMComplexTwoLineButton gCMComplexTwoLineButton2 = this.f42974d;
                if (this.f42979i.f33863b1.c0() && this.f42981k) {
                    i14 = 0;
                }
                gCMComplexTwoLineButton2.setVisibility(i14);
                this.f42979i.f33863b1.i0(this.f42977g);
            } else {
                gCMComplexTwoLineButton.setVisibility(8);
                this.f42974d.setVisibility(8);
                this.f42979i.f33863b1.i0("OFF");
            }
        } else {
            this.f42973c.setVisibility(8);
            this.f42974d.setVisibility(8);
            if (this.f42979i.f33863b1.g0()) {
                this.f42979i.f33863b1.i0("OFF");
            }
        }
        if (this.f42971a.z(this.f42979i)) {
            this.f42973c.setButtonBottomLeftLabel(this.f42979i.f33863b1.D(this));
        }
    }

    public final void da(boolean z14) {
        int i14 = 8;
        if (z14) {
            this.f42972b.m(z14);
            boolean z15 = this.f42972b.z(this.f42979i);
            GCMComplexTwoLineButton gCMComplexTwoLineButton = this.f42975e;
            if (z15) {
                gCMComplexTwoLineButton.setVisibility(0);
                GCMComplexTwoLineButton gCMComplexTwoLineButton2 = this.f42976f;
                if (this.f42979i.f33865c1.c0() && this.f42981k) {
                    i14 = 0;
                }
                gCMComplexTwoLineButton2.setVisibility(i14);
                this.f42979i.f33865c1.i0(this.f42978h);
            } else {
                gCMComplexTwoLineButton.setVisibility(8);
                this.f42976f.setVisibility(8);
                this.f42979i.f33865c1.i0("OFF");
            }
        } else {
            this.f42975e.setVisibility(8);
            this.f42976f.setVisibility(8);
            if (this.f42979i.f33865c1.g0()) {
                this.f42979i.f33865c1.i0("OFF");
            }
        }
        if (this.f42972b.z(this.f42979i)) {
            this.f42975e.setButtonBottomLeftLabel(this.f42979i.f33865c1.D(this));
        }
    }

    @Override // android.app.Activity
    public final void finish() {
        setResult(-1, getIntent().putExtra("GCM_deviceSettings", this.f42979i));
        super.finish();
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.gcm3_device_settings_phone_notifications);
        if (getIntent().getExtras() != null) {
            this.f42979i = (DeviceSettingsDTO) getIntent().getExtras().getParcelable("GCM_deviceSettings");
            String stringExtra = getIntent().getStringExtra("GCM_deviceSettingsTitle");
            this.f42980j = getIntent().getExtras().getBoolean("BLE_CONNECTION_ALERT", false);
            this.f42981k = getIntent().getExtras().getBoolean("GCM_showPhoneNotificationAlerts", true);
            if (TextUtils.isEmpty(stringExtra)) {
                stringExtra = getString(R.string.device_setting_phone_notifications);
            }
            initActionBar(true, stringExtra);
        }
        if (this.f42979i == null) {
            i2.f(a2.SETTINGS, "Forerunner30PhoneNotificationsDeviceSettings", "Invalid device settings object while entering device settings Phone Notifications screen!");
            finish();
            return;
        }
        this.f42974d = (GCMComplexTwoLineButton) findViewById(R.id.device_settings_during_activity_alert_btn);
        this.f42973c = (GCMComplexTwoLineButton) findViewById(R.id.device_settings_during_activity_notification_btn);
        this.f42976f = (GCMComplexTwoLineButton) findViewById(R.id.device_settings_not_during_activity_alert_btn);
        this.f42975e = (GCMComplexTwoLineButton) findViewById(R.id.device_settings_not_during_activity_notification_btn);
        if (this.f42980j) {
            findViewById(R.id.device_settings_ble_alert_btn).setVisibility(0);
        }
        wi1.c cVar = this.f42979i.f33863b1;
        if (cVar == null) {
            i2.f(a2.SETTINGS, "Forerunner30PhoneNotificationsDeviceSettings", "Invalid DuringActivityDTO object while entering device settings Phone Notifications screen!");
            finish();
            return;
        }
        if (!this.f42981k) {
            this.f42974d.setVisible(false);
            this.f42976f.setVisible(false);
        }
        this.f42974d.setOnClickListener(this.f42984n);
        this.f42974d.setButtonBottomLeftLabel(cVar.H(this));
        this.f42973c.setOnClickListener(this.f42982l);
        this.f42973c.setButtonBottomLeftLabel(cVar.D(this));
        this.f42977g = cVar.f185502a;
        f fVar = this.f42979i.f33865c1;
        this.f42976f.setOnClickListener(this.f42983m);
        this.f42976f.setButtonBottomLeftLabel(fVar.H(this));
        this.f42975e.setOnClickListener(this.f42985o);
        this.f42975e.setButtonBottomLeftLabel(fVar.D(this));
        this.f42978h = fVar.f185502a;
        this.f42971a = new x0(this);
        this.f42972b = new z0(this);
        if (this.f42971a.g(this, this.f42979i)) {
            this.f42971a.addObserver(this);
            ca(true);
        }
        if (this.f42972b.g(this, this.f42979i)) {
            this.f42972b.addObserver(this);
            da(true);
        }
        if (this.f42980j) {
            c0 c0Var = new c0(this);
            c0Var.m(c0Var.g(this, this.f42979i));
            c0Var.addObserver(this);
        }
    }

    @Override // java.util.Observer
    public final void update(Observable observable, Object obj) {
        i2.k(a2.SETTINGS, "Forerunner30PhoneNotificationsDeviceSettings", hb.a.j("update(): observable=", observable, ", data=", obj));
        if (obj != null) {
            if ((observable instanceof x0) && (obj instanceof Boolean)) {
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                if (zBooleanValue && !this.f42971a.z(this.f42979i)) {
                    if (this.f42977g.equalsIgnoreCase("OFF")) {
                        this.f42977g = "SHOW_ALL";
                    }
                    this.f42979i.f33863b1.i0(this.f42977g);
                }
                ca(zBooleanValue);
                return;
            }
            if ((observable instanceof z0) && (obj instanceof Boolean)) {
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                if (zBooleanValue2 && !this.f42972b.z(this.f42979i)) {
                    if (this.f42978h.equalsIgnoreCase("OFF")) {
                        this.f42978h = "SHOW_ALL";
                    }
                    this.f42979i.f33865c1.i0(this.f42978h);
                }
                da(zBooleanValue2);
            }
        }
    }
}
