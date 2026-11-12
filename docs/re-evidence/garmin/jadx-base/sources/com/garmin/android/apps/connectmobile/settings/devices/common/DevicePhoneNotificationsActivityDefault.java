package com.garmin.android.apps.connectmobile.settings.devices.common;

import android.content.Intent;
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
import ng1.p;
import org.koin.java.KoinJavaComponent;
import pk1.t;
import vg1.z;
import zb0.d0;

/* JADX INFO: loaded from: classes10.dex */
public class DevicePhoneNotificationsActivityDefault extends com.garmin.android.apps.connectmobile.c implements Observer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public x0 f42663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public z0 f42664b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public GCMComplexTwoLineButton f42665c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public GCMComplexTwoLineButton f42666d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public GCMComplexTwoLineButton f42667e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public GCMComplexTwoLineButton f42668f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f42669g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f42670h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public DeviceSettingsDTO f42671i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f42672j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f42673k = true;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final a f42674l = new a();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final b f42675m = new b();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final c f42676n = new c();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final d f42677o = new d();

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view2) {
            DevicePhoneNotificationsActivityDefault devicePhoneNotificationsActivityDefault = DevicePhoneNotificationsActivityDefault.this;
            int iC = devicePhoneNotificationsActivityDefault.f42671i.Q0() ? devicePhoneNotificationsActivityDefault.f42671i.f33863b1.C() : 1;
            androidx.appcompat.app.e.a aVar = new androidx.appcompat.app.e.a(view2.getContext());
            aVar.setTitle(R.string.lbl_smart_notifications).setSingleChoiceItems(devicePhoneNotificationsActivityDefault.f42671i.f33863b1.I(devicePhoneNotificationsActivityDefault), iC, new t(20, this, view2));
            aVar.create().show();
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view2) {
            DevicePhoneNotificationsActivityDefault devicePhoneNotificationsActivityDefault = DevicePhoneNotificationsActivityDefault.this;
            int iG = devicePhoneNotificationsActivityDefault.f42671i.S0() ? devicePhoneNotificationsActivityDefault.f42671i.f33865c1.G() : 2;
            androidx.appcompat.app.e.a aVar = new androidx.appcompat.app.e.a(view2.getContext());
            aVar.setTitle(R.string.device_settings_alert).setSingleChoiceItems(devicePhoneNotificationsActivityDefault.f42671i.f33863b1.Z(devicePhoneNotificationsActivityDefault), iG, new t(21, this, view2));
            aVar.create().show();
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view2) {
            DevicePhoneNotificationsActivityDefault devicePhoneNotificationsActivityDefault = DevicePhoneNotificationsActivityDefault.this;
            int iG = devicePhoneNotificationsActivityDefault.f42671i.Q0() ? devicePhoneNotificationsActivityDefault.f42671i.f33863b1.G() : 2;
            androidx.appcompat.app.e.a aVar = new androidx.appcompat.app.e.a(view2.getContext());
            aVar.setTitle(R.string.device_settings_alert).setSingleChoiceItems(devicePhoneNotificationsActivityDefault.f42671i.f33863b1.Z(devicePhoneNotificationsActivityDefault), iG, new t(22, this, view2));
            aVar.create().show();
        }
    }

    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view2) {
            DevicePhoneNotificationsActivityDefault devicePhoneNotificationsActivityDefault = DevicePhoneNotificationsActivityDefault.this;
            int iC = devicePhoneNotificationsActivityDefault.f42671i.S0() ? devicePhoneNotificationsActivityDefault.f42671i.f33865c1.C() : 1;
            androidx.appcompat.app.e.a aVar = new androidx.appcompat.app.e.a(view2.getContext());
            aVar.setTitle(R.string.lbl_smart_notifications).setSingleChoiceItems(devicePhoneNotificationsActivityDefault.f42671i.f33863b1.I(devicePhoneNotificationsActivityDefault), iC, new t(23, this, view2));
            aVar.create().show();
        }
    }

    public static void ca(p pVar, DeviceSettingsDTO deviceSettingsDTO, String str, z zVar, String str2) {
        Intent intent = new Intent();
        if (zVar != null) {
            intent.setClassName(pVar, zVar.getF178184q());
        }
        boolean zL = ((d0) KoinJavaComponent.get(d0.class)).l(zVar);
        intent.putExtra("GCM_deviceSettings", deviceSettingsDTO);
        intent.putExtra("GCM_deviceSettingsTitle", str);
        intent.putExtra("GCM_showPhoneNotificationAlerts", zL);
        if (zVar instanceof vg1.t) {
            intent.putExtra("GCM_deviceSettingsEnumValue", (vg1.t) zVar);
        }
        intent.putExtra("GCM_deviceProductNbr", str2);
        pVar.startActivityForResult(intent, 10);
    }

    public final void da(boolean z14) {
        int i14 = 8;
        if (z14) {
            this.f42663a.m(z14);
            boolean z15 = this.f42663a.z(this.f42671i);
            GCMComplexTwoLineButton gCMComplexTwoLineButton = this.f42665c;
            if (z15) {
                gCMComplexTwoLineButton.setVisibility(0);
                GCMComplexTwoLineButton gCMComplexTwoLineButton2 = this.f42666d;
                if (this.f42671i.f33863b1.c0() && this.f42673k) {
                    i14 = 0;
                }
                gCMComplexTwoLineButton2.setVisibility(i14);
                this.f42671i.f33863b1.i0(this.f42669g);
            } else {
                gCMComplexTwoLineButton.setVisibility(8);
                this.f42666d.setVisibility(8);
                this.f42671i.f33863b1.i0("OFF");
            }
        } else {
            this.f42665c.setVisibility(8);
            this.f42666d.setVisibility(8);
            if (this.f42671i.f33863b1.g0()) {
                this.f42671i.f33863b1.i0("OFF");
            }
        }
        if (this.f42663a.z(this.f42671i)) {
            this.f42665c.setButtonBottomLeftLabel(this.f42671i.f33863b1.D(this));
        }
    }

    public final void ea(boolean z14) {
        int i14 = 8;
        if (z14) {
            this.f42664b.m(z14);
            boolean z15 = this.f42664b.z(this.f42671i);
            GCMComplexTwoLineButton gCMComplexTwoLineButton = this.f42667e;
            if (z15) {
                gCMComplexTwoLineButton.setVisibility(0);
                GCMComplexTwoLineButton gCMComplexTwoLineButton2 = this.f42668f;
                if (this.f42671i.f33865c1.c0() && this.f42673k) {
                    i14 = 0;
                }
                gCMComplexTwoLineButton2.setVisibility(i14);
                this.f42671i.f33865c1.i0(this.f42670h);
            } else {
                gCMComplexTwoLineButton.setVisibility(8);
                this.f42668f.setVisibility(8);
                this.f42671i.f33865c1.i0("OFF");
            }
        } else {
            this.f42667e.setVisibility(8);
            this.f42668f.setVisibility(8);
            if (this.f42671i.f33865c1.g0()) {
                this.f42671i.f33865c1.i0("OFF");
            }
        }
        if (this.f42664b.z(this.f42671i)) {
            this.f42667e.setButtonBottomLeftLabel(this.f42671i.f33865c1.D(this));
        }
    }

    @Override // android.app.Activity
    public final void finish() {
        setResult(-1, getIntent().putExtra("GCM_deviceSettings", this.f42671i));
        super.finish();
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.gcm3_device_settings_phone_notifications);
        if (getIntent().getExtras() != null) {
            this.f42671i = (DeviceSettingsDTO) getIntent().getExtras().getParcelable("GCM_deviceSettings");
            String stringExtra = getIntent().getStringExtra("GCM_deviceSettingsTitle");
            this.f42672j = getIntent().getExtras().getBoolean("BLE_CONNECTION_ALERT", false);
            this.f42673k = getIntent().getExtras().getBoolean("GCM_showPhoneNotificationAlerts", true);
            if (TextUtils.isEmpty(stringExtra)) {
                stringExtra = getString(R.string.device_setting_phone_notifications);
            }
            initActionBar(true, stringExtra);
        }
        if (this.f42671i == null) {
            i2.f(a2.SETTINGS, "DevicePhoneNotificationsActivityDefault", "Invalid device settings object while entering device settings Phone Notifications screen!");
            finish();
            return;
        }
        this.f42666d = (GCMComplexTwoLineButton) findViewById(R.id.device_settings_during_activity_alert_btn);
        this.f42665c = (GCMComplexTwoLineButton) findViewById(R.id.device_settings_during_activity_notification_btn);
        this.f42668f = (GCMComplexTwoLineButton) findViewById(R.id.device_settings_not_during_activity_alert_btn);
        this.f42667e = (GCMComplexTwoLineButton) findViewById(R.id.device_settings_not_during_activity_notification_btn);
        if (this.f42672j) {
            findViewById(R.id.device_settings_ble_alert_btn).setVisibility(0);
        }
        wi1.c cVar = this.f42671i.f33863b1;
        if (cVar == null) {
            i2.f(a2.SETTINGS, "DevicePhoneNotificationsActivityDefault", "Invalid DuringActivityDTO object while entering device settings Phone Notifications screen!");
            finish();
            return;
        }
        if (!this.f42673k) {
            this.f42666d.setVisible(false);
            this.f42668f.setVisible(false);
        }
        this.f42666d.setOnClickListener(this.f42676n);
        this.f42666d.setButtonBottomLeftLabel(cVar.H(this));
        this.f42665c.setOnClickListener(this.f42674l);
        this.f42665c.setButtonBottomLeftLabel(cVar.D(this));
        this.f42669g = cVar.f185502a;
        wi1.f fVar = this.f42671i.f33865c1;
        this.f42668f.setOnClickListener(this.f42675m);
        this.f42668f.setButtonBottomLeftLabel(fVar.H(this));
        this.f42667e.setOnClickListener(this.f42677o);
        this.f42667e.setButtonBottomLeftLabel(fVar.D(this));
        this.f42670h = fVar.f185502a;
        this.f42663a = new x0(this);
        this.f42664b = new z0(this);
        if (this.f42663a.g(this, this.f42671i)) {
            this.f42663a.addObserver(this);
            da(true);
        }
        if (this.f42664b.g(this, this.f42671i)) {
            this.f42664b.addObserver(this);
            ea(true);
        }
        if (this.f42672j) {
            c0 c0Var = new c0(this);
            c0Var.m(c0Var.g(this, this.f42671i));
            c0Var.addObserver(this);
        }
    }

    @Override // java.util.Observer
    public final void update(Observable observable, Object obj) {
        i2.k(a2.SETTINGS, "DevicePhoneNotificationsActivityDefault", hb.a.j("update(): observable=", observable, ", data=", obj));
        if (obj != null) {
            if ((observable instanceof x0) && (obj instanceof Boolean)) {
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                if (zBooleanValue && !this.f42663a.z(this.f42671i)) {
                    if (this.f42669g.equalsIgnoreCase("OFF")) {
                        this.f42669g = "SHOW_ALL";
                    }
                    this.f42671i.f33863b1.i0(this.f42669g);
                }
                da(zBooleanValue);
                return;
            }
            if ((observable instanceof z0) && (obj instanceof Boolean)) {
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                if (zBooleanValue2 && !this.f42664b.z(this.f42671i)) {
                    if (this.f42670h.equalsIgnoreCase("OFF")) {
                        this.f42670h = "SHOW_ALL";
                    }
                    this.f42671i.f33865c1.i0(this.f42670h);
                }
                ea(zBooleanValue2);
            }
        }
    }
}
