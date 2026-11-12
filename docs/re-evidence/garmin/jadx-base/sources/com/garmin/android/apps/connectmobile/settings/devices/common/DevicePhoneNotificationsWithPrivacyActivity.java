package com.garmin.android.apps.connectmobile.settings.devices.common;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import ch1.a4;
import ch1.c0;
import ch1.f4;
import ch1.x0;
import ch1.z0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.settings.devices.common.smartnotifications.SmartNotificationsPrivacyActivity;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexTwoLineButton;
import fb2.g;
import java.util.Observable;
import java.util.Observer;
import pk1.t;
import wi1.h;

/* JADX INFO: loaded from: classes10.dex */
public class DevicePhoneNotificationsWithPrivacyActivity extends com.garmin.android.apps.connectmobile.c implements Observer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public x0 f42693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public z0 f42694b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a4 f42695c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public f4 f42696d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public GCMComplexTwoLineButton f42697e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public GCMComplexTwoLineButton f42698f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public GCMComplexTwoLineButton f42699g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public GCMComplexTwoLineButton f42700h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f42701i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f42702j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public DeviceSettingsDTO f42703k;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f42706n;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f42704l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f42705m = true;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final a f42707o = new a();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b f42708p = new b();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final c f42709q = new c();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final d f42710r = new d();

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view2) {
            DevicePhoneNotificationsWithPrivacyActivity devicePhoneNotificationsWithPrivacyActivity = DevicePhoneNotificationsWithPrivacyActivity.this;
            int iC = devicePhoneNotificationsWithPrivacyActivity.f42703k.Q0() ? devicePhoneNotificationsWithPrivacyActivity.f42703k.f33863b1.C() : 1;
            Context context = view2.getContext();
            androidx.appcompat.app.e.a aVar = new androidx.appcompat.app.e.a(context);
            androidx.appcompat.app.e.a title = aVar.setTitle(R.string.lbl_smart_notifications);
            devicePhoneNotificationsWithPrivacyActivity.f42703k.f33863b1.getClass();
            title.setSingleChoiceItems(h.M(context), iC, new t(24, this, context));
            aVar.create().show();
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view2) {
            DevicePhoneNotificationsWithPrivacyActivity devicePhoneNotificationsWithPrivacyActivity = DevicePhoneNotificationsWithPrivacyActivity.this;
            int iG = devicePhoneNotificationsWithPrivacyActivity.f42703k.S0() ? devicePhoneNotificationsWithPrivacyActivity.f42703k.f33865c1.G() : 2;
            Context context = view2.getContext();
            androidx.appcompat.app.e.a aVar = new androidx.appcompat.app.e.a(context);
            aVar.setTitle(R.string.device_settings_alert).setSingleChoiceItems(devicePhoneNotificationsWithPrivacyActivity.f42703k.f33863b1.Z(context), iG, new t(25, this, context));
            aVar.create().show();
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view2) {
            DevicePhoneNotificationsWithPrivacyActivity devicePhoneNotificationsWithPrivacyActivity = DevicePhoneNotificationsWithPrivacyActivity.this;
            int iG = devicePhoneNotificationsWithPrivacyActivity.f42703k.Q0() ? devicePhoneNotificationsWithPrivacyActivity.f42703k.f33863b1.G() : 2;
            Context context = view2.getContext();
            androidx.appcompat.app.e.a aVar = new androidx.appcompat.app.e.a(context);
            aVar.setTitle(R.string.device_settings_alert).setSingleChoiceItems(devicePhoneNotificationsWithPrivacyActivity.f42703k.f33863b1.Z(context), iG, new t(26, this, context));
            aVar.create().show();
        }
    }

    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view2) {
            DevicePhoneNotificationsWithPrivacyActivity devicePhoneNotificationsWithPrivacyActivity = DevicePhoneNotificationsWithPrivacyActivity.this;
            int iC = devicePhoneNotificationsWithPrivacyActivity.f42703k.S0() ? devicePhoneNotificationsWithPrivacyActivity.f42703k.f33865c1.C() : 1;
            Context context = view2.getContext();
            androidx.appcompat.app.e.a aVar = new androidx.appcompat.app.e.a(context);
            androidx.appcompat.app.e.a title = aVar.setTitle(R.string.lbl_smart_notifications);
            devicePhoneNotificationsWithPrivacyActivity.f42703k.f33863b1.getClass();
            title.setSingleChoiceItems(h.M(context), iC, new t(27, this, context));
            aVar.create().show();
        }
    }

    public final void ca(boolean z14) {
        int i14 = 8;
        if (z14) {
            this.f42693a.m(z14);
            boolean z15 = this.f42693a.z(this.f42703k);
            GCMComplexTwoLineButton gCMComplexTwoLineButton = this.f42697e;
            if (z15) {
                gCMComplexTwoLineButton.setVisibility(0);
                GCMComplexTwoLineButton gCMComplexTwoLineButton2 = this.f42698f;
                if (this.f42705m && this.f42703k.f33863b1.c0()) {
                    i14 = 0;
                }
                gCMComplexTwoLineButton2.setVisibility(i14);
                this.f42703k.f33863b1.i0(this.f42701i);
            } else {
                gCMComplexTwoLineButton.setVisibility(8);
                this.f42698f.setVisibility(8);
                this.f42703k.f33863b1.i0("OFF");
            }
        } else {
            this.f42697e.setVisibility(8);
            this.f42698f.setVisibility(8);
            if (this.f42703k.f33863b1.g0()) {
                this.f42703k.f33863b1.i0("OFF");
            }
        }
        if (this.f42693a.z(this.f42703k)) {
            this.f42697e.setButtonBottomLeftLabel(this.f42703k.f33863b1.F(this));
        }
    }

    public final void da(boolean z14) {
        int i14 = 8;
        if (z14) {
            this.f42694b.m(z14);
            boolean z15 = this.f42694b.z(this.f42703k);
            GCMComplexTwoLineButton gCMComplexTwoLineButton = this.f42699g;
            if (z15) {
                gCMComplexTwoLineButton.setVisibility(0);
                GCMComplexTwoLineButton gCMComplexTwoLineButton2 = this.f42700h;
                if (this.f42705m && this.f42703k.f33865c1.c0()) {
                    i14 = 0;
                }
                gCMComplexTwoLineButton2.setVisibility(i14);
                this.f42703k.f33865c1.i0(this.f42702j);
            } else {
                gCMComplexTwoLineButton.setVisibility(8);
                this.f42700h.setVisibility(8);
                this.f42703k.f33865c1.i0("OFF");
            }
        } else {
            this.f42699g.setVisibility(8);
            this.f42700h.setVisibility(8);
            if (this.f42703k.f33865c1.g0()) {
                this.f42703k.f33865c1.i0("OFF");
            }
        }
        if (this.f42694b.z(this.f42703k)) {
            this.f42699g.setButtonBottomLeftLabel(this.f42703k.f33865c1.F(this));
        }
    }

    @Override // android.app.Activity
    public final void finish() {
        setResult(-1, getIntent().putExtra("GCM_deviceSettings", this.f42703k));
        super.finish();
    }

    @Override // com.garmin.android.apps.connectmobile.z1, androidx.fragment.app.m, b.g, android.app.Activity
    public final void onActivityResult(int i14, int i15, Intent intent) {
        DeviceSettingsDTO deviceSettingsDTO;
        if (i14 == 1 && i15 == -1 && intent != null && (deviceSettingsDTO = (DeviceSettingsDTO) intent.getParcelableExtra("GCM_deviceSettings")) != null) {
            this.f42703k = deviceSettingsDTO;
            this.f42696d.k(deviceSettingsDTO);
        }
        super.onActivityResult(i14, i15, intent);
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.gcm3_device_settings_phone_notifications);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            this.f42703k = (DeviceSettingsDTO) extras.getParcelable("GCM_deviceSettings");
            String stringExtra = getIntent().getStringExtra("GCM_deviceSettingsTitle");
            this.f42704l = extras.getBoolean("BLE_CONNECTION_ALERT", false);
            if (TextUtils.isEmpty(stringExtra)) {
                stringExtra = getString(R.string.device_setting_phone_notifications);
            }
            initActionBar(true, stringExtra);
            this.f42705m = extras.getBoolean("GCM_showPhoneNotificationAlerts");
            this.f42706n = extras.getString("GCM_deviceProductNbr");
        }
        if (this.f42703k == null) {
            i2.f(a2.SETTINGS, "DevicePhoneNotificationsActivityDefault", "Invalid device settings object while entering device settings Phone Notifications screen!");
            finish();
            return;
        }
        this.f42698f = (GCMComplexTwoLineButton) findViewById(R.id.device_settings_during_activity_alert_btn);
        this.f42697e = (GCMComplexTwoLineButton) findViewById(R.id.device_settings_during_activity_notification_btn);
        this.f42700h = (GCMComplexTwoLineButton) findViewById(R.id.device_settings_not_during_activity_alert_btn);
        this.f42699g = (GCMComplexTwoLineButton) findViewById(R.id.device_settings_not_during_activity_notification_btn);
        if (this.f42704l) {
            findViewById(R.id.device_settings_ble_alert_btn).setVisibility(0);
        }
        wi1.c cVar = this.f42703k.f33863b1;
        if (cVar == null) {
            i2.f(a2.SETTINGS, "DevicePhoneNotificationsActivityDefault", "Invalid DuringActivityDTO object while entering device settings Phone Notifications screen!");
            finish();
            return;
        }
        this.f42697e.setOnClickListener(this.f42707o);
        this.f42699g.setOnClickListener(this.f42710r);
        this.f42698f.setOnClickListener(this.f42709q);
        this.f42698f.setButtonBottomLeftLabel(cVar.H(this));
        this.f42697e.setButtonBottomLeftLabel(cVar.F(this));
        this.f42701i = cVar.f185502a;
        wi1.f fVar = this.f42703k.f33865c1;
        this.f42700h.setOnClickListener(this.f42708p);
        this.f42700h.setButtonBottomLeftLabel(fVar.H(this));
        this.f42699g.setButtonBottomLeftLabel(fVar.F(this));
        this.f42702j = fVar.f185502a;
        this.f42693a = new x0(this);
        this.f42694b = new z0(this);
        this.f42695c = new a4(this);
        this.f42696d = new f4(this);
        a4 a4Var = this.f42695c;
        DeviceSettingsDTO deviceSettingsDTO = this.f42703k;
        a4Var.getClass();
        deviceSettingsDTO.getClass();
        if (deviceSettingsDTO.Y0 != null) {
            this.f42695c.g(this, this.f42703k);
            this.f42695c.addObserver(this);
            LinearLayout linearLayout = (LinearLayout) findViewById(R.id.layout_id);
            linearLayout.addView(g.a(this));
            linearLayout.addView(this.f42695c.a());
        }
        if (this.f42693a.g(this, this.f42703k)) {
            this.f42693a.addObserver(this);
            ca(true);
        }
        if (this.f42694b.g(this, this.f42703k)) {
            this.f42694b.addObserver(this);
            da(true);
        }
        if (this.f42696d.g(this, this.f42703k)) {
            this.f42696d.addObserver(this);
            LinearLayout linearLayout2 = (LinearLayout) findViewById(R.id.layout_id);
            linearLayout2.addView(g.a(this));
            linearLayout2.addView(this.f42696d.a());
        }
        if (this.f42704l) {
            c0 c0Var = new c0(this);
            c0Var.m(c0Var.g(this, this.f42703k));
            c0Var.addObserver(this);
        }
    }

    @Override // java.util.Observer
    public final void update(Observable observable, Object obj) {
        String str;
        String str2;
        i2.k(a2.SETTINGS, "DevicePhoneNotificationsActivityDefault", hb.a.j("update(): observable=", observable, ", data=", obj));
        if (obj != null) {
            if ((observable instanceof x0) && (obj instanceof Boolean)) {
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                if (zBooleanValue && !this.f42693a.z(this.f42703k) && (str2 = this.f42701i) != null) {
                    if (str2.equalsIgnoreCase("OFF")) {
                        this.f42701i = "SHOW_ALL";
                    }
                    this.f42703k.f33863b1.i0(this.f42701i);
                }
                ca(zBooleanValue);
                return;
            }
            if ((observable instanceof z0) && (obj instanceof Boolean)) {
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                if (zBooleanValue2 && !this.f42694b.z(this.f42703k) && (str = this.f42702j) != null) {
                    if (str.equalsIgnoreCase("OFF")) {
                        this.f42702j = "SHOW_ALL";
                    }
                    this.f42703k.f33865c1.i0(this.f42702j);
                }
                da(zBooleanValue2);
                return;
            }
            if (observable instanceof f4) {
                SmartNotificationsPrivacyActivity.f42851i.getClass();
                Intent intent = new Intent(this, (Class<?>) SmartNotificationsPrivacyActivity.class);
                Bundle bundle = new Bundle();
                bundle.putParcelable("GCM_deviceSettings", this.f42703k);
                bundle.putLong("GCM_deviceUnitID", this.f42703k.f33860a);
                bundle.putString("GCM_deviceProductNbr", this.f42706n);
                intent.putExtras(bundle);
                startActivityForResult(intent, 1);
            }
        }
    }
}
