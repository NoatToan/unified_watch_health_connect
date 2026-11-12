package com.garmin.android.apps.connectmobile.settings.devices.common;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import ch1.x0;
import ch1.z0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexTwoLineButton;
import java.util.Observable;
import java.util.Observer;
import wi1.h;

/* JADX INFO: loaded from: classes10.dex */
public class DevicePhoneNotificationsActivityVivoActive3LTE extends com.garmin.android.apps.connectmobile.c implements Observer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public x0 f42682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public z0 f42683b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public GCMComplexTwoLineButton f42684c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public GCMComplexTwoLineButton f42685d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f42686e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f42687f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public DeviceSettingsDTO f42688g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a f42689h = new a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final b f42690i = new b();

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view2) {
            DevicePhoneNotificationsActivityVivoActive3LTE devicePhoneNotificationsActivityVivoActive3LTE = DevicePhoneNotificationsActivityVivoActive3LTE.this;
            int iC = devicePhoneNotificationsActivityVivoActive3LTE.f42688g.Q0() ? devicePhoneNotificationsActivityVivoActive3LTE.f42688g.f33863b1.C() : 1;
            androidx.appcompat.app.e.a aVar = new androidx.appcompat.app.e.a(devicePhoneNotificationsActivityVivoActive3LTE);
            androidx.appcompat.app.e.a title = aVar.setTitle(R.string.lbl_smart_notifications);
            devicePhoneNotificationsActivityVivoActive3LTE.f42688g.f33863b1.getClass();
            title.setSingleChoiceItems(h.M(devicePhoneNotificationsActivityVivoActive3LTE), iC, new sa2.b(this, 14));
            aVar.create().show();
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view2) {
            DevicePhoneNotificationsActivityVivoActive3LTE devicePhoneNotificationsActivityVivoActive3LTE = DevicePhoneNotificationsActivityVivoActive3LTE.this;
            int iC = devicePhoneNotificationsActivityVivoActive3LTE.f42688g.S0() ? devicePhoneNotificationsActivityVivoActive3LTE.f42688g.f33865c1.C() : 1;
            androidx.appcompat.app.e.a aVar = new androidx.appcompat.app.e.a(devicePhoneNotificationsActivityVivoActive3LTE);
            androidx.appcompat.app.e.a title = aVar.setTitle(R.string.lbl_smart_notifications);
            devicePhoneNotificationsActivityVivoActive3LTE.f42688g.f33863b1.getClass();
            title.setSingleChoiceItems(h.M(devicePhoneNotificationsActivityVivoActive3LTE), iC, new sa2.b(this, 15));
            aVar.create().show();
        }
    }

    public final void ca(boolean z14) {
        if (z14) {
            this.f42682a.m(z14);
            boolean z15 = this.f42682a.z(this.f42688g);
            GCMComplexTwoLineButton gCMComplexTwoLineButton = this.f42684c;
            if (z15) {
                gCMComplexTwoLineButton.setVisibility(0);
                this.f42688g.f33863b1.i0(this.f42686e);
            } else {
                gCMComplexTwoLineButton.setVisibility(8);
                this.f42688g.f33863b1.i0("OFF");
            }
        } else {
            this.f42684c.setVisibility(8);
            if (this.f42688g.f33863b1.g0()) {
                this.f42688g.f33863b1.i0("OFF");
            }
        }
        if (this.f42682a.z(this.f42688g)) {
            this.f42684c.setButtonBottomLeftLabel(this.f42688g.f33863b1.F(this));
        }
    }

    public final void da(boolean z14) {
        if (z14) {
            this.f42683b.m(z14);
            boolean z15 = this.f42683b.z(this.f42688g);
            GCMComplexTwoLineButton gCMComplexTwoLineButton = this.f42685d;
            if (z15) {
                gCMComplexTwoLineButton.setVisibility(0);
                this.f42688g.f33865c1.i0(this.f42687f);
            } else {
                gCMComplexTwoLineButton.setVisibility(8);
                this.f42688g.f33865c1.i0("OFF");
            }
        } else {
            this.f42685d.setVisibility(8);
            if (this.f42688g.f33865c1.g0()) {
                this.f42688g.f33865c1.i0("OFF");
            }
        }
        if (this.f42683b.z(this.f42688g)) {
            this.f42685d.setButtonBottomLeftLabel(this.f42688g.f33865c1.F(this));
        }
    }

    @Override // android.app.Activity
    public final void finish() {
        setResult(-1, getIntent().putExtra("GCM_deviceSettings", this.f42688g));
        super.finish();
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.gcm3_device_settings_phone_notifications_lte);
        if (getIntent().getExtras() != null) {
            this.f42688g = (DeviceSettingsDTO) getIntent().getExtras().getParcelable("GCM_deviceSettings");
            String stringExtra = getIntent().getStringExtra("GCM_deviceSettingsTitle");
            if (TextUtils.isEmpty(stringExtra)) {
                stringExtra = getString(R.string.device_setting_phone_notifications);
            }
            initActionBar(true, stringExtra);
        }
        if (this.f42688g == null) {
            i2.f(a2.SETTINGS, "DevicePhoneNotificationsActivityVivoActive3LTE", "Invalid device settings object while entering device settings Phone Notifications screen!");
            finish();
            return;
        }
        this.f42684c = (GCMComplexTwoLineButton) findViewById(R.id.device_settings_during_activity_notification_btn);
        this.f42685d = (GCMComplexTwoLineButton) findViewById(R.id.device_settings_not_during_activity_notification_btn);
        wi1.c cVar = this.f42688g.f33863b1;
        if (cVar == null) {
            i2.f(a2.SETTINGS, "DevicePhoneNotificationsActivityVivoActive3LTE", "Invalid DuringActivityDTO object while entering device settings Phone Notifications screen!");
            finish();
            return;
        }
        this.f42684c.setOnClickListener(this.f42689h);
        this.f42684c.setButtonBottomLeftLabel(cVar.F(this));
        this.f42686e = cVar.f185502a;
        wi1.f fVar = this.f42688g.f33865c1;
        if (fVar == null) {
            i2.f(a2.SETTINGS, "DevicePhoneNotificationsActivityVivoActive3LTE", "Invalid notDuringActivityDTO object while entering device settings Phone Notifications screen!");
            finish();
            return;
        }
        this.f42685d.setOnClickListener(this.f42690i);
        this.f42685d.setButtonBottomLeftLabel(fVar.F(this));
        this.f42687f = fVar.f185502a;
        this.f42682a = new x0(this);
        this.f42683b = new z0(this);
        if (this.f42682a.g(this, this.f42688g)) {
            this.f42682a.addObserver(this);
            ca(true);
        }
        if (this.f42683b.g(this, this.f42688g)) {
            this.f42683b.addObserver(this);
            da(true);
        }
    }

    @Override // java.util.Observer
    public final void update(Observable observable, Object obj) {
        String str;
        String str2;
        i2.k(a2.SETTINGS, "DevicePhoneNotificationsActivityVivoActive3LTE", hb.a.j("update(): observable=", observable, ", data=", obj));
        if (obj != null) {
            if ((observable instanceof x0) && (obj instanceof Boolean)) {
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                if (zBooleanValue && !this.f42682a.z(this.f42688g) && (str2 = this.f42686e) != null) {
                    if (str2.equalsIgnoreCase("OFF")) {
                        this.f42686e = "SHOW_ALL";
                    }
                    this.f42688g.f33863b1.i0(this.f42686e);
                }
                ca(zBooleanValue);
                return;
            }
            if ((observable instanceof z0) && (obj instanceof Boolean)) {
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                if (zBooleanValue2 && !this.f42683b.z(this.f42688g) && (str = this.f42687f) != null) {
                    if (str.equalsIgnoreCase("OFF")) {
                        this.f42687f = "SHOW_ALL";
                    }
                    this.f42688g.f33865c1.i0(this.f42687f);
                }
                da(zBooleanValue2);
            }
        }
    }
}
