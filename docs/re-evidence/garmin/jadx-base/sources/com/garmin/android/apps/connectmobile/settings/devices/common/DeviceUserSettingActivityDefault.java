package com.garmin.android.apps.connectmobile.settings.devices.common;

import android.app.TimePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.lifecycle.x1;
import c22.l3;
import c22.t3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.g1;
import com.garmin.android.apps.connectmobile.help.HelpActivity;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.settings.devices.common.DeviceUserSettingActivityDefault;
import com.garmin.android.apps.connectmobile.settings.model.UserSettingsDTO;
import com.garmin.android.apps.connectmobile.settings.user.PowerZonesDTO;
import com.garmin.android.apps.connectmobile.settings.usersettings.UpdateBirthdateActivity;
import com.garmin.android.apps.connectmobile.settings.usersettings.heartratezones.ui.PowerZonesConfigActivity;
import com.garmin.android.apps.connectmobile.settings.usersettings.heartratezones.ui.PowerZonesListActivity;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexTwoLineButton;
import cw.q;
import f12.l;
import java.util.List;
import ls0.m;
import o72.t;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.format.DateTimeFormat;
import org.json.JSONObject;
import org.koin.java.KoinJavaComponent;
import p005kotlin.jvm.internal.s0;
import vg1.d0;
import vg1.e0;
import vg1.z;
import z10.d1;
import zb0.n0;
import zb0.u0;

/* JADX INFO: loaded from: classes10.dex */
public class DeviceUserSettingActivityDefault extends com.garmin.android.apps.connectmobile.c {
    public static final /* synthetic */ int K0 = 0;
    public long A;
    public z B;
    public oc1.d C;
    public final d0 D;
    public final d0 Y;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f42747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f42748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public UserSettingsDTO f42749c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public JSONObject f42750d;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f42756j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public lj0.j f42757k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final d0 f42758k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f42759l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public GCMComplexTwoLineButton f42760m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public GCMComplexTwoLineButton f42761n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public GCMComplexTwoLineButton f42762o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public GCMComplexTwoLineButton f42763p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public GCMComplexTwoLineButton f42764q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ViewGroup f42765r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public GCMComplexTwoLineButton f42766t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public GCMComplexTwoLineButton f42767v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ViewGroup f42768w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public GCMComplexTwoLineButton f42769x;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f42751e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f42752f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f42753g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f42754h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f42755i = false;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f42770y = -1;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f42771z = -1;
    public final b E = new b();
    public final c F = new c();
    public final d I = new d();
    public final e P = new e();
    public final f T = new f();
    public final g X = new g();
    public final h Z = new h();
    public final i H0 = new i();
    public final j I0 = new j();
    public final a J0 = new a();

    public class a implements com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b<List<PowerZonesDTO>> {
        public a() {
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onComplete(long j8, com.garmin.android.library.backgroundtaskmanagement.b.c cVar) {
            DeviceUserSettingActivityDefault deviceUserSettingActivityDefault = DeviceUserSettingActivityDefault.this;
            deviceUserSettingActivityDefault.hideProgressOverlay();
            g1.b(deviceUserSettingActivityDefault, cVar);
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onResults(long j8, com.garmin.android.library.backgroundtaskmanagement.b.e eVar, List<PowerZonesDTO> list) {
            DeviceUserSettingActivityDefault.this.f42756j = t.L(vk1.e.CYCLING.name(), list);
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view2) {
            DeviceUserSettingActivityDefault deviceUserSettingActivityDefault = DeviceUserSettingActivityDefault.this;
            int iOrdinal = (deviceUserSettingActivityDefault.f42749c.G() != null ? deviceUserSettingActivityDefault.f42749c.G() : UserSettingsDTO.c.MALE).ordinal();
            androidx.appcompat.app.e.a aVar = new androidx.appcompat.app.e.a(deviceUserSettingActivityDefault);
            aVar.setTitle(R.string.lbl_gender).setSingleChoiceItems(UserSettingsDTO.c.a(deviceUserSettingActivityDefault), iOrdinal, new sa2.b(this, 17));
            aVar.create().show();
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view2) {
            new com.garmin.android.apps.connectmobile.settings.d(DeviceUserSettingActivityDefault.this, new tr2.b(this, 25));
        }
    }

    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view2) {
            DeviceUserSettingActivityDefault deviceUserSettingActivityDefault = DeviceUserSettingActivityDefault.this;
            if (deviceUserSettingActivityDefault.f42749c != null) {
                new j42.b(deviceUserSettingActivityDefault, new tr2.b(this, 26));
            }
        }
    }

    public class e implements View.OnClickListener {
        public e() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view2) {
            int i14;
            int i15;
            DeviceUserSettingActivityDefault deviceUserSettingActivityDefault = DeviceUserSettingActivityDefault.this;
            UserSettingsDTO userSettingsDTO = deviceUserSettingActivityDefault.f42749c;
            if (userSettingsDTO != null) {
                long jM = userSettingsDTO.M();
                l3.f23124b.getClass();
                int[] iArrF = l3.a.f(jM);
                if (iArrF != null) {
                    int i16 = iArrF[0];
                    i15 = iArrF[1];
                    i14 = i16;
                } else {
                    i14 = 22;
                    i15 = 0;
                }
                m mVar = new m(this, 8);
                DeviceUserSettingActivityDefault deviceUserSettingActivityDefault2 = DeviceUserSettingActivityDefault.this;
                TimePickerDialog timePickerDialog = new TimePickerDialog(deviceUserSettingActivityDefault2, R.style.GCMTimePicker, mVar, i14, i15, DateFormat.is24HourFormat(deviceUserSettingActivityDefault2));
                timePickerDialog.setTitle(R.string.sleep_lbl_start_time);
                timePickerDialog.show();
                og.a.W(timePickerDialog, deviceUserSettingActivityDefault);
                og.a.w(timePickerDialog, deviceUserSettingActivityDefault);
            }
        }
    }

    public class f implements View.OnClickListener {
        public f() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view2) {
            int i14;
            int i15;
            DeviceUserSettingActivityDefault deviceUserSettingActivityDefault = DeviceUserSettingActivityDefault.this;
            UserSettingsDTO userSettingsDTO = deviceUserSettingActivityDefault.f42749c;
            if (userSettingsDTO != null) {
                long jZ = userSettingsDTO.Z();
                l3.f23124b.getClass();
                int[] iArrF = l3.a.f(jZ);
                if (iArrF != null) {
                    int i16 = iArrF[0];
                    i15 = iArrF[1];
                    i14 = i16;
                } else {
                    i14 = 6;
                    i15 = 0;
                }
                m mVar = new m(this, 9);
                DeviceUserSettingActivityDefault deviceUserSettingActivityDefault2 = DeviceUserSettingActivityDefault.this;
                TimePickerDialog timePickerDialog = new TimePickerDialog(deviceUserSettingActivityDefault2, R.style.GCMTimePicker, mVar, i14, i15, DateFormat.is24HourFormat(deviceUserSettingActivityDefault2));
                timePickerDialog.setTitle(R.string.sleep_lbl_wake_time);
                timePickerDialog.show();
                og.a.W(timePickerDialog, deviceUserSettingActivityDefault);
                og.a.w(timePickerDialog, deviceUserSettingActivityDefault);
            }
        }
    }

    public class g implements View.OnClickListener {
        public g() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view2) {
            DeviceUserSettingActivityDefault deviceUserSettingActivityDefault = DeviceUserSettingActivityDefault.this;
            int iOrdinal = deviceUserSettingActivityDefault.f42749c.H().ordinal();
            androidx.appcompat.app.e.a aVar = new androidx.appcompat.app.e.a(deviceUserSettingActivityDefault);
            aVar.setTitle(R.string.handedness_title).setSingleChoiceItems(UserSettingsDTO.d.a(deviceUserSettingActivityDefault), iOrdinal, new sa2.b(this, 18));
            aVar.create().show();
        }
    }

    public class h implements View.OnClickListener {
        public h() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view2) {
            Intent intent = new Intent();
            DeviceUserSettingActivityDefault deviceUserSettingActivityDefault = DeviceUserSettingActivityDefault.this;
            intent.setClassName(deviceUserSettingActivityDefault, deviceUserSettingActivityDefault.B.getF178180m());
            intent.putExtra("GCM_deviceUnitID", deviceUserSettingActivityDefault.f42748b);
            deviceUserSettingActivityDefault.startActivity(intent);
            deviceUserSettingActivityDefault.f42751e = true;
        }
    }

    public class i implements com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b {
        public i() {
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onComplete(long j8, com.garmin.android.library.backgroundtaskmanagement.b.c cVar) {
            DeviceUserSettingActivityDefault deviceUserSettingActivityDefault = DeviceUserSettingActivityDefault.this;
            deviceUserSettingActivityDefault.f42770y = -1L;
            if (cVar == com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS && deviceUserSettingActivityDefault.f42749c != null) {
                DeviceUserSettingActivityDefault.ca(deviceUserSettingActivityDefault);
                return;
            }
            i2.f(a2.SETTINGS, "DeviceUserSettingActivityDefault", "Error fetching user settings from GC [" + cVar.name() + "].");
            if (cVar != com.garmin.android.library.backgroundtaskmanagement.b.c.NO_NETWORK) {
                Toast.makeText(deviceUserSettingActivityDefault, R.string.txt_error_occurred, 0).show();
            }
            deviceUserSettingActivityDefault.finish();
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onResults(long j8, com.garmin.android.library.backgroundtaskmanagement.b.e eVar, Object obj) {
            UserSettingsDTO userSettingsDTO = (UserSettingsDTO) obj;
            DeviceUserSettingActivityDefault deviceUserSettingActivityDefault = DeviceUserSettingActivityDefault.this;
            deviceUserSettingActivityDefault.f42749c = userSettingsDTO;
            if (userSettingsDTO != null) {
                deviceUserSettingActivityDefault.f42750d = userSettingsDTO.t1();
            }
        }
    }

    public class j implements com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b {
        public j() {
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onComplete(long j8, com.garmin.android.library.backgroundtaskmanagement.b.c cVar) {
            DeviceUserSettingActivityDefault deviceUserSettingActivityDefault = DeviceUserSettingActivityDefault.this;
            deviceUserSettingActivityDefault.f42771z = -1L;
            if (cVar == com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS) {
                deviceUserSettingActivityDefault.C.x4(deviceUserSettingActivityDefault.f42748b, "DeviceUserSettingActivityDefault");
                Toast.makeText(deviceUserSettingActivityDefault, deviceUserSettingActivityDefault.getText(R.string.msg_settings_saved_successfully), 0).show();
            } else {
                i2.f(a2.SETTINGS, "DeviceUserSettingActivityDefault", "Error saving user settings to GC [" + cVar.name() + "].");
                if (cVar != com.garmin.android.library.backgroundtaskmanagement.b.c.NO_NETWORK) {
                    Toast.makeText(deviceUserSettingActivityDefault, R.string.txt_error_occurred, 0).show();
                }
            }
            deviceUserSettingActivityDefault.hideProgressOverlay();
            deviceUserSettingActivityDefault.finish();
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onResults(long j8, com.garmin.android.library.backgroundtaskmanagement.b.e eVar, Object obj) {
        }
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [vg1.d0] */
    /* JADX WARN: Type inference failed for: r0v2, types: [vg1.d0] */
    /* JADX WARN: Type inference failed for: r0v9, types: [vg1.d0] */
    public DeviceUserSettingActivityDefault() {
        final int i14 = 0;
        this.D = new View.OnClickListener(this) { // from class: vg1.d0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DeviceUserSettingActivityDefault f178093b;

            {
                this.f178093b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i15 = i14;
                DeviceUserSettingActivityDefault deviceUserSettingActivityDefault = this.f178093b;
                switch (i15) {
                    case 0:
                        int i16 = DeviceUserSettingActivityDefault.K0;
                        deviceUserSettingActivityDefault.startActivity(new Intent(deviceUserSettingActivityDefault, (Class<?>) UpdateBirthdateActivity.class));
                        break;
                    case 1:
                        if (deviceUserSettingActivityDefault.f42755i) {
                            PowerZonesListActivity.ca(deviceUserSettingActivityDefault, deviceUserSettingActivityDefault.f42748b);
                        } else {
                            PowerZonesConfigActivity.ca(deviceUserSettingActivityDefault, deviceUserSettingActivityDefault.f42756j, vk1.e.CYCLING.name());
                        }
                        deviceUserSettingActivityDefault.f42751e = true;
                        break;
                    default:
                        int i17 = DeviceUserSettingActivityDefault.K0;
                        HelpActivity.da(deviceUserSettingActivityDefault, ro0.l.HEART_RATE_ZONES, "DEFAULT_ACTION", null);
                        break;
                }
            }
        };
        final int i15 = 1;
        this.Y = new View.OnClickListener(this) { // from class: vg1.d0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DeviceUserSettingActivityDefault f178093b;

            {
                this.f178093b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i16 = i15;
                DeviceUserSettingActivityDefault deviceUserSettingActivityDefault = this.f178093b;
                switch (i16) {
                    case 0:
                        int i17 = DeviceUserSettingActivityDefault.K0;
                        deviceUserSettingActivityDefault.startActivity(new Intent(deviceUserSettingActivityDefault, (Class<?>) UpdateBirthdateActivity.class));
                        break;
                    case 1:
                        if (deviceUserSettingActivityDefault.f42755i) {
                            PowerZonesListActivity.ca(deviceUserSettingActivityDefault, deviceUserSettingActivityDefault.f42748b);
                        } else {
                            PowerZonesConfigActivity.ca(deviceUserSettingActivityDefault, deviceUserSettingActivityDefault.f42756j, vk1.e.CYCLING.name());
                        }
                        deviceUserSettingActivityDefault.f42751e = true;
                        break;
                    default:
                        int i18 = DeviceUserSettingActivityDefault.K0;
                        HelpActivity.da(deviceUserSettingActivityDefault, ro0.l.HEART_RATE_ZONES, "DEFAULT_ACTION", null);
                        break;
                }
            }
        };
        final int i16 = 2;
        this.f42758k0 = new View.OnClickListener(this) { // from class: vg1.d0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DeviceUserSettingActivityDefault f178093b;

            {
                this.f178093b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i17 = i16;
                DeviceUserSettingActivityDefault deviceUserSettingActivityDefault = this.f178093b;
                switch (i17) {
                    case 0:
                        int i18 = DeviceUserSettingActivityDefault.K0;
                        deviceUserSettingActivityDefault.startActivity(new Intent(deviceUserSettingActivityDefault, (Class<?>) UpdateBirthdateActivity.class));
                        break;
                    case 1:
                        if (deviceUserSettingActivityDefault.f42755i) {
                            PowerZonesListActivity.ca(deviceUserSettingActivityDefault, deviceUserSettingActivityDefault.f42748b);
                        } else {
                            PowerZonesConfigActivity.ca(deviceUserSettingActivityDefault, deviceUserSettingActivityDefault.f42756j, vk1.e.CYCLING.name());
                        }
                        deviceUserSettingActivityDefault.f42751e = true;
                        break;
                    default:
                        int i19 = DeviceUserSettingActivityDefault.K0;
                        HelpActivity.da(deviceUserSettingActivityDefault, ro0.l.HEART_RATE_ZONES, "DEFAULT_ACTION", null);
                        break;
                }
            }
        };
    }

    public static void ca(DeviceUserSettingActivityDefault deviceUserSettingActivityDefault) {
        String str;
        int i14 = deviceUserSettingActivityDefault.f42759l - 1;
        deviceUserSettingActivityDefault.f42759l = i14;
        if (i14 == 0) {
            deviceUserSettingActivityDefault.hideProgressOverlay();
            if (deviceUserSettingActivityDefault.f42752f && (str = deviceUserSettingActivityDefault.f42747a) != null && u0.n(str, u0.E5)) {
                deviceUserSettingActivityDefault.f42761n.setVisibility(0);
                deviceUserSettingActivityDefault.ea();
                deviceUserSettingActivityDefault.f42763p.setVisibility(0);
                UserSettingsDTO userSettingsDTO = deviceUserSettingActivityDefault.f42749c;
                if (userSettingsDTO != null) {
                    deviceUserSettingActivityDefault.f42763p.setButtonBottomLeftLabel(deviceUserSettingActivityDefault.getString(userSettingsDTO.H().f43545b));
                }
                deviceUserSettingActivityDefault.f42760m.setVisibility(8);
                deviceUserSettingActivityDefault.f42762o.setVisibility(8);
                deviceUserSettingActivityDefault.f42764q.setVisibility(8);
                deviceUserSettingActivityDefault.f42765r.setVisibility(8);
                deviceUserSettingActivityDefault.f42768w.setVisibility(8);
                return;
            }
            deviceUserSettingActivityDefault.f42768w.setVisibility(0);
            if (n0.i(u0.A5, deviceUserSettingActivityDefault.f42747a) || n0.i(u0.f203807r5, deviceUserSettingActivityDefault.f42747a) || n0.i(u0.f203812s5, deviceUserSettingActivityDefault.f42747a) || n0.i(u0.f203767l5, deviceUserSettingActivityDefault.f42747a) || n0.i(u0.f203818t5, deviceUserSettingActivityDefault.f42747a) || n0.i(u0.I1, deviceUserSettingActivityDefault.f42747a) || n0.i(u0.Q5, deviceUserSettingActivityDefault.f42747a) || n0.i(u0.V5, deviceUserSettingActivityDefault.f42747a) || n0.i(u0.T5, deviceUserSettingActivityDefault.f42747a) || n0.i(u0.W5, deviceUserSettingActivityDefault.f42747a) || n0.i(u0.X5, deviceUserSettingActivityDefault.f42747a) || n0.i(u0.f203732g6, deviceUserSettingActivityDefault.f42747a) || n0.i(u0.f203726f6, deviceUserSettingActivityDefault.f42747a)) {
                deviceUserSettingActivityDefault.f42768w.setVisibility(8);
            }
            if (!n0.i(u0.E4, deviceUserSettingActivityDefault.f42747a) && deviceUserSettingActivityDefault.f42749c != null) {
                deviceUserSettingActivityDefault.fa();
                deviceUserSettingActivityDefault.ia();
            }
            deviceUserSettingActivityDefault.f42760m.setVisibility(0);
            UserSettingsDTO userSettingsDTO2 = deviceUserSettingActivityDefault.f42749c;
            if (userSettingsDTO2 != null && userSettingsDTO2.F() != null) {
                deviceUserSettingActivityDefault.f42760m.setButtonBottomLeftLabel(DateTimeFormat.mediumDate().print(deviceUserSettingActivityDefault.f42749c.F()));
            }
            deviceUserSettingActivityDefault.f42761n.setVisibility(0);
            deviceUserSettingActivityDefault.ea();
            deviceUserSettingActivityDefault.f42762o.setVisibility(0);
            deviceUserSettingActivityDefault.fa();
            deviceUserSettingActivityDefault.f42764q.setVisibility(0);
            deviceUserSettingActivityDefault.ia();
            if (deviceUserSettingActivityDefault.f42754h) {
                deviceUserSettingActivityDefault.f42765r.setVisibility(0);
                deviceUserSettingActivityDefault.ga();
                deviceUserSettingActivityDefault.ha();
            }
            deviceUserSettingActivityDefault.f42763p.setVisibility(8);
        }
    }

    public final String da(long j8) {
        return (DateFormat.is24HourFormat(this) ? DateTimeFormat.forPattern("HH:mm") : DateTimeFormat.forPattern("hh:mm a")).withZone(DateTimeZone.UTC).print(new DateTime(j8 * 1000));
    }

    public final void ea() {
        UserSettingsDTO userSettingsDTO = this.f42749c;
        if (userSettingsDTO != null) {
            this.f42761n.setButtonBottomLeftLabel(getString((userSettingsDTO.G() != null ? this.f42749c.G() : UserSettingsDTO.c.MALE).f43538b));
        }
    }

    public final void fa() {
        if (this.f42749c != null) {
            this.f42762o.setButtonBottomLeftLabel(l3.f((float) this.f42749c.I(), this, ((l) KoinJavaComponent.get(l.class)).y()));
        }
    }

    public final void ga() {
        UserSettingsDTO userSettingsDTO = this.f42749c;
        if (userSettingsDTO != null) {
            this.f42766t.setButtonBottomLeftLabel(da(userSettingsDTO.M() >= 0 ? this.f42749c.M() : 79200L));
        }
    }

    public final void ha() {
        UserSettingsDTO userSettingsDTO = this.f42749c;
        if (userSettingsDTO != null) {
            this.f42767v.setButtonBottomLeftLabel(da(userSettingsDTO.Z() >= 0 ? this.f42749c.Z() : 21600L));
        }
    }

    public final void ia() {
        if (this.f42749c != null) {
            this.f42764q.setButtonBottomLeftLabel(l3.l(this.f42749c.E2() / 1000.0d, this, ((l) KoinJavaComponent.get(l.class)).y()));
        }
    }

    @Override // com.garmin.android.apps.connectmobile.z1, b.g, android.app.Activity
    public final void onBackPressed() {
        UserSettingsDTO userSettingsDTO = this.f42749c;
        JSONObject jSONObjectB = userSettingsDTO != null ? t3.b(userSettingsDTO.t1(), this.f42750d) : null;
        i2.a(a2.SETTINGS, "DeviceUserSettingActivityDefault", "User Settings JSON delta = " + jSONObjectB);
        if (this.f42771z == -1 && jSONObjectB != null) {
            showProgressOverlay();
            this.f42771z = q.N().O(this.f42749c, jSONObjectB, this.I0);
            yr1.e.b("DeviceUserSettingActivityDefault");
        } else {
            if (this.f42751e) {
                this.C.x4(this.f42748b, "DeviceUserSettingActivityDefault");
                Toast.makeText(this, getText(R.string.msg_settings_saved_successfully), 0).show();
            }
            super.onBackPressed();
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.gcm3_device_user_settings_default);
        initActionBar(true, R.string.devices_settings_user_settings);
        if (d1.f()) {
            d1.o(this, new sa2.b(this, 16));
        }
        if (getIntent().getExtras() != null) {
            this.f42747a = getIntent().getExtras().getString("GCM_deviceProductNbr");
            this.f42748b = getIntent().getExtras().getLong("GCM_deviceUnitID", -1L);
            this.B = ((zb0.d0) KoinJavaComponent.get(zb0.d0.class)).J((u0) u0.f203782n6.get(this.f42747a));
        }
        if (this.f42747a == null) {
            i2.f(a2.SETTINGS, "DeviceUserSettingActivityDefault", "Invalid device product number! Exit device user settings.");
            finish();
            return;
        }
        GCMComplexTwoLineButton gCMComplexTwoLineButton = (GCMComplexTwoLineButton) findViewById(R.id.user_settings_birth_date);
        this.f42760m = gCMComplexTwoLineButton;
        gCMComplexTwoLineButton.setOnClickListener(this.D);
        GCMComplexTwoLineButton gCMComplexTwoLineButton2 = (GCMComplexTwoLineButton) findViewById(R.id.user_settings_gender);
        this.f42761n = gCMComplexTwoLineButton2;
        gCMComplexTwoLineButton2.setOnClickListener(this.E);
        GCMComplexTwoLineButton gCMComplexTwoLineButton3 = (GCMComplexTwoLineButton) findViewById(R.id.user_settings_height);
        this.f42762o = gCMComplexTwoLineButton3;
        gCMComplexTwoLineButton3.setOnClickListener(this.F);
        GCMComplexTwoLineButton gCMComplexTwoLineButton4 = (GCMComplexTwoLineButton) findViewById(R.id.user_settings_weight);
        this.f42764q = gCMComplexTwoLineButton4;
        gCMComplexTwoLineButton4.setOnClickListener(this.I);
        this.f42765r = (ViewGroup) findViewById(R.id.user_settings_sleep_container);
        GCMComplexTwoLineButton gCMComplexTwoLineButton5 = (GCMComplexTwoLineButton) findViewById(R.id.user_settings_sleep_time);
        this.f42766t = gCMComplexTwoLineButton5;
        gCMComplexTwoLineButton5.setOnClickListener(this.P);
        GCMComplexTwoLineButton gCMComplexTwoLineButton6 = (GCMComplexTwoLineButton) findViewById(R.id.user_settings_wake_time);
        this.f42767v = gCMComplexTwoLineButton6;
        gCMComplexTwoLineButton6.setOnClickListener(this.T);
        GCMComplexTwoLineButton gCMComplexTwoLineButton7 = (GCMComplexTwoLineButton) findViewById(R.id.user_settings_handedness);
        this.f42763p = gCMComplexTwoLineButton7;
        gCMComplexTwoLineButton7.setOnClickListener(this.X);
        this.f42768w = (ViewGroup) findViewById(R.id.user_settings_heart_rate_zones_container);
        ((GCMComplexTwoLineButton) findViewById(R.id.user_settings_heart_rate_zones)).setOnClickListener(this.Z);
        GCMComplexTwoLineButton gCMComplexTwoLineButton8 = (GCMComplexTwoLineButton) findViewById(R.id.user_settings_power_zones);
        this.f42769x = gCMComplexTwoLineButton8;
        gCMComplexTwoLineButton8.setOnClickListener(this.Y);
        findViewById(R.id.user_settings_heart_rate_zones_help_icon).setOnClickListener(this.f42758k0);
        this.C = (oc1.d) new x1(this).b(s0.f105811a.b(oc1.d.class));
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onNavigateUp() {
        onBackPressed();
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (this.f42749c == null) {
            showProgressOverlay();
            this.f42759l++;
            Object[] objArr = {String.valueOf(this.f42748b)};
            lj0.f fVar = lj0.f.f112996x;
            lj0.j jVar = new lj0.j(new e0(this));
            this.f42757k = jVar;
            jVar.b(new lj0.i(fVar, objArr));
            showProgressOverlay();
            this.f42759l++;
            this.f42770y = q.N().M(this.H0);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, i.c, androidx.fragment.app.m, android.app.Activity
    public final void onStop() {
        super.onStop();
        com.garmin.android.library.backgroundtaskmanagement.c cVar = com.garmin.android.library.backgroundtaskmanagement.c.f50123c;
        cVar.a(this.f42770y);
        cVar.a(this.A);
        lj0.j jVar = this.f42757k;
        if (jVar != null) {
            jVar.a();
        }
    }
}
