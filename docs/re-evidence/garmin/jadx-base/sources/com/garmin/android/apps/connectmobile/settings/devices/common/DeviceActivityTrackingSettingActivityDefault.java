package com.garmin.android.apps.connectmobile.settings.devices.common;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.lifecycle.x1;
import c22.t3;
import ch1.f3;
import ch1.j6;
import ch1.k1;
import ch1.q4;
import ch1.u4;
import ch1.v2;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.settings.devices.DeviceSettingsActivityTracking;
import com.garmin.android.apps.connectmobile.settings.devices.Forerunner35DeviceSettingsDisplayOptions;
import com.garmin.android.apps.connectmobile.settings.devices.Forerunner35DeviceSystemSettings;
import com.garmin.android.apps.connectmobile.settings.devices.Forerunner35PhoneNotificationsDeviceSettings;
import com.garmin.android.apps.connectmobile.settings.devices.Forerunner35TonesDeviceSettings;
import com.garmin.android.apps.connectmobile.settings.model.UserSettingsDTO;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexOneLineButton;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexTwoLineButton;
import com.google.protobuf.DescriptorProtos;
import fw.p;
import i3.e5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Observable;
import java.util.Observer;
import ng1.j;
import org.json.JSONObject;
import org.koin.java.KoinJavaComponent;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.t0;
import vg1.k;
import vg1.l;
import xg1.i;
import xg1.m;
import zb0.d0;
import zb0.u0;
import zk0.h;

/* JADX INFO: loaded from: classes10.dex */
public class DeviceActivityTrackingSettingActivityDefault extends j implements Observer {
    public static final /* synthetic */ int R0 = 0;
    public h A;
    public h B;
    public lj0.j F;
    public int I;
    public xk0.g I0;
    public oc1.d J0;
    public GCMComplexOneLineButton P;
    public ViewGroup T;
    public GCMComplexTwoLineButton X;
    public GCMComplexTwoLineButton Y;
    public GCMComplexTwoLineButton Z;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f42599t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f42600v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public UserSettingsDTO f42601w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public JSONObject f42602x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public zk0.c f42603y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f42604z = false;
    public boolean C = false;
    public boolean D = false;
    public boolean E = false;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public long f42598k0 = -1;
    public long H0 = -1;
    public final ArrayList K0 = new ArrayList();
    public final a L0 = new a();
    public final b M0 = new b();
    public final c N0 = new c();
    public final d O0 = new d();
    public final e P0 = new e();
    public final f Q0 = new f();

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view2) {
            d0 d0Var = (d0) KoinJavaComponent.get(d0.class);
            DeviceActivityTrackingSettingActivityDefault deviceActivityTrackingSettingActivityDefault = DeviceActivityTrackingSettingActivityDefault.this;
            d0Var.m(deviceActivityTrackingSettingActivityDefault, deviceActivityTrackingSettingActivityDefault.f42599t, -1);
            deviceActivityTrackingSettingActivityDefault.f42604z = true;
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view2) {
            int iIntValue;
            boolean z14;
            DeviceActivityTrackingSettingActivityDefault deviceActivityTrackingSettingActivityDefault = DeviceActivityTrackingSettingActivityDefault.this;
            zk0.c cVar = deviceActivityTrackingSettingActivityDefault.f42603y;
            if (cVar != null) {
                int iIntValue2 = cVar.getUserGoal().intValue();
                zk0.c cVar2 = deviceActivityTrackingSettingActivityDefault.f42603y;
                if (iIntValue2 > 0) {
                    iIntValue = cVar2.getUserGoal().intValue();
                    z14 = false;
                } else {
                    iIntValue = cVar2.getDeviceGoal().intValue();
                    z14 = true;
                }
                m.u6(new tr2.b(this, 23), iIntValue, z14).show(deviceActivityTrackingSettingActivityDefault.getSupportFragmentManager(), "");
            }
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view2) {
            DeviceActivityTrackingSettingActivityDefault deviceActivityTrackingSettingActivityDefault = DeviceActivityTrackingSettingActivityDefault.this;
            h hVar = deviceActivityTrackingSettingActivityDefault.A;
            if (hVar != null) {
                qh0.a.u6(hVar.C(), new tr2.b(this, 24)).show(deviceActivityTrackingSettingActivityDefault.getSupportFragmentManager(), (String) null);
            }
        }
    }

    public class d implements View.OnClickListener {

        public class a implements i<Double> {
            public a() {
            }

            @Override // xg1.i
            public final void a(Double d14) {
                int iIntValue = d14.intValue();
                d dVar = d.this;
                if (iIntValue < 150 || 99999 < iIntValue) {
                    DeviceActivityTrackingSettingActivityDefault deviceActivityTrackingSettingActivityDefault = DeviceActivityTrackingSettingActivityDefault.this;
                    Toast.makeText(deviceActivityTrackingSettingActivityDefault, deviceActivityTrackingSettingActivityDefault.getString(R.string.wellness_goal_error, Integer.toString(150), Integer.toString(DescriptorProtos.Edition.EDITION_99999_TEST_ONLY_VALUE)), 0).show();
                    return;
                }
                DeviceActivityTrackingSettingActivityDefault deviceActivityTrackingSettingActivityDefault2 = DeviceActivityTrackingSettingActivityDefault.this;
                if (deviceActivityTrackingSettingActivityDefault2.B.C() != iIntValue) {
                    deviceActivityTrackingSettingActivityDefault2.getClass();
                    h hVar = new h("INTENSITY_MINUTES", iIntValue);
                    xk0.g gVar = deviceActivityTrackingSettingActivityDefault2.I0;
                    gVar.getClass();
                    xk0.g.x4(gVar, "intensity-minutes", hVar).f(deviceActivityTrackingSettingActivityDefault2, new k(deviceActivityTrackingSettingActivityDefault2, iIntValue, 1));
                    deviceActivityTrackingSettingActivityDefault2.f42604z = true;
                }
            }
        }

        public d() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view2) {
            DeviceActivityTrackingSettingActivityDefault deviceActivityTrackingSettingActivityDefault = DeviceActivityTrackingSettingActivityDefault.this;
            if (deviceActivityTrackingSettingActivityDefault.B != null) {
                ur0.a aVarS = ((d0) KoinJavaComponent.get(d0.class)).S(Double.valueOf(deviceActivityTrackingSettingActivityDefault.B.C()));
                aVarS.f172323d = new a();
                aVarS.g(deviceActivityTrackingSettingActivityDefault.getSupportFragmentManager());
            }
        }
    }

    public class e implements com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b {
        public e() {
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onComplete(long j8, com.garmin.android.library.backgroundtaskmanagement.b.c cVar) {
            DeviceActivityTrackingSettingActivityDefault deviceActivityTrackingSettingActivityDefault = DeviceActivityTrackingSettingActivityDefault.this;
            deviceActivityTrackingSettingActivityDefault.f42598k0 = -1L;
            if (cVar == com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS && deviceActivityTrackingSettingActivityDefault.f42601w != null) {
                deviceActivityTrackingSettingActivityDefault.ka();
                return;
            }
            i2.f(a2.SETTINGS, "DeviceActivityTrackingSettingActivityDefault", "Error fetching user settings from GC [" + cVar.name() + "].");
            if (cVar != com.garmin.android.library.backgroundtaskmanagement.b.c.NO_NETWORK) {
                Toast.makeText(deviceActivityTrackingSettingActivityDefault, R.string.txt_error_occurred, 0).show();
            }
            deviceActivityTrackingSettingActivityDefault.finish();
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onResults(long j8, com.garmin.android.library.backgroundtaskmanagement.b.e eVar, Object obj) {
            UserSettingsDTO userSettingsDTO = (UserSettingsDTO) obj;
            DeviceActivityTrackingSettingActivityDefault deviceActivityTrackingSettingActivityDefault = DeviceActivityTrackingSettingActivityDefault.this;
            deviceActivityTrackingSettingActivityDefault.f42601w = userSettingsDTO;
            if (userSettingsDTO != null) {
                deviceActivityTrackingSettingActivityDefault.f42602x = userSettingsDTO.t1();
            }
        }
    }

    public class f implements com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b {
        public f() {
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onComplete(long j8, com.garmin.android.library.backgroundtaskmanagement.b.c cVar) {
            DeviceActivityTrackingSettingActivityDefault deviceActivityTrackingSettingActivityDefault = DeviceActivityTrackingSettingActivityDefault.this;
            deviceActivityTrackingSettingActivityDefault.H0 = -1L;
            if (cVar == com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS) {
                deviceActivityTrackingSettingActivityDefault.J0.x4(deviceActivityTrackingSettingActivityDefault.f42600v, "DeviceActivityTrackingSettingActivityDefault");
                Toast.makeText(deviceActivityTrackingSettingActivityDefault, deviceActivityTrackingSettingActivityDefault.getText(R.string.msg_settings_saved_successfully), 0).show();
            } else {
                i2.f(a2.SETTINGS, "DeviceActivityTrackingSettingActivityDefault", "Error saving user settings to GC [" + cVar.name() + "].");
                if (cVar != com.garmin.android.library.backgroundtaskmanagement.b.c.NO_NETWORK) {
                    Toast.makeText(deviceActivityTrackingSettingActivityDefault, R.string.txt_error_occurred, 0).show();
                }
            }
            deviceActivityTrackingSettingActivityDefault.hideProgressOverlay();
            deviceActivityTrackingSettingActivityDefault.finish();
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onResults(long j8, com.garmin.android.library.backgroundtaskmanagement.b.e eVar, Object obj) {
        }
    }

    public static /* synthetic */ class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f42612a;

        static {
            int[] iArr = new int[p.values().length];
            f42612a = iArr;
            try {
                iArr[p.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f42612a[p.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f42612a[p.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @Override // ng1.j
    public final int ea() {
        return R.layout.gcm_device_activity_tracking_settings_default;
    }

    @Override // ng1.j
    public final GCMComplexOneLineButton ga() {
        return null;
    }

    public final void ka() {
        String str;
        int i14 = this.I - 1;
        this.I = i14;
        if (i14 == 0) {
            hideProgressOverlay();
            if (this.C && (str = this.f42599t) != null && u0.n(str, u0.E5)) {
                this.P.setVisibility(8);
                this.X.setVisibility(8);
                this.Y.setVisibility(8);
                this.Z.setVisibility(8);
                return;
            }
            if (this.f42603y != null && td2.a.a(this.f42600v)) {
                this.T.setVisibility(0);
                this.X.setVisibility(0);
                ma();
            }
            if (this.E && this.A != null) {
                this.T.setVisibility(0);
                this.Y.setVisibility(0);
                h hVar = this.A;
                if (hVar != null) {
                    this.Y.setButtonBottomLeftLabel(Integer.toString(hVar.C()));
                }
            }
            if (this.D && this.B != null) {
                this.T.setVisibility(0);
                this.Z.setVisibility(0);
                la();
            }
            if (!((d0) KoinJavaComponent.get(d0.class)).A(this.f42599t) || u0.n(this.f42599t, u0.G4) || u0.n(this.f42599t, u0.I4) || u0.n(this.f42599t, u0.f203796q) || u0.n(this.f42599t, u0.f203802r) || u0.n(this.f42599t, u0.f203824v) || u0.n(this.f42599t, u0.f203848z) || u0.n(this.f42599t, u0.f203836x)) {
                this.P.setVisibility(8);
            } else {
                this.P.setVisibility(0);
            }
        }
    }

    public final void la() {
        h hVar = this.B;
        if (hVar != null) {
            this.Z.setButtonBottomLeftLabel(Integer.toString(hVar.C()));
        }
    }

    public final void ma() {
        int iIntValue;
        zk0.c cVar = this.f42603y;
        if (cVar != null) {
            int iIntValue2 = cVar.getUserGoal().intValue();
            zk0.c cVar2 = this.f42603y;
            if (iIntValue2 != 0) {
                iIntValue = cVar2.getUserGoal().intValue();
            } else {
                iIntValue = cVar2.getDeviceGoal().intValue() != 0 ? this.f42603y.getDeviceGoal().intValue() : 0;
            }
            this.X.setButtonBottomLeftLabel(Integer.toString(iIntValue));
        }
    }

    @Override // com.garmin.android.apps.connectmobile.z1, androidx.fragment.app.m, b.g, android.app.Activity
    public final void onActivityResult(int i14, int i15, Intent intent) {
        n23.j.y(e5.j(i14, i15, "onActivityResult(): requestCode=", ", resultCode=", ", data="), intent, a2.SETTINGS, "DeviceActivityTrackingSettingActivityDefault");
        super.onActivityResult(i14, i15, intent);
        if (i14 == 10 && i15 == -1) {
            DeviceSettingsDTO deviceSettingsDTO = (intent == null || intent.getExtras() == null) ? null : (DeviceSettingsDTO) intent.getExtras().get("GCM_deviceSettings");
            if (deviceSettingsDTO != null) {
                for (fb2.e eVar : this.K0) {
                    eVar.m(eVar.k(deviceSettingsDTO));
                }
                this.f125985k = deviceSettingsDTO;
            }
        }
    }

    @Override // ng1.j, com.garmin.android.apps.connectmobile.z1, b.g, android.app.Activity
    public final void onBackPressed() {
        UserSettingsDTO userSettingsDTO = this.f42601w;
        JSONObject jSONObjectB = userSettingsDTO != null ? t3.b(userSettingsDTO.t1(), this.f42602x) : null;
        i2.a(a2.SETTINGS, "DeviceActivityTrackingSettingActivityDefault", "User Settings JSON delta = " + jSONObjectB);
        if (this.H0 == -1 && jSONObjectB != null) {
            showProgressOverlay();
            this.H0 = ((d0) KoinJavaComponent.get(d0.class)).a(this.f42601w, jSONObjectB, this.Q0);
        } else {
            if (this.f42604z) {
                this.J0.x4(this.f42600v, "DeviceActivityTrackingSettingActivityDefault");
                Toast.makeText(this, getText(R.string.msg_settings_saved_successfully), 0).show();
            }
            super.onBackPressed();
        }
    }

    @Override // ng1.j, ng1.p, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initActionBar(true, R.string.activity_tracking_title);
        if (this.f125985k == null) {
            i2.k(a2.SETTINGS, "DeviceActivityTrackingSettingActivityDefault", "Device Settings DTO is null");
            finish();
            return;
        }
        if (getIntent().getExtras() != null) {
            this.f42599t = getIntent().getExtras().getString("GCM_deviceProductNbr");
            this.f42600v = getIntent().getExtras().getLong("GCM_deviceUnitID", -1L);
        }
        if (this.f42599t == null) {
            i2.f(a2.SETTINGS, "DeviceActivityTrackingSettingActivityDefault", "Invalid device product number! Exit device user settings.");
            finish();
            return;
        }
        x1 x1Var = new x1(this);
        t0 t0Var = s0.f105811a;
        this.I0 = (xk0.g) x1Var.b(t0Var.b(xk0.g.class));
        this.J0 = (oc1.d) new x1(this).b(t0Var.b(oc1.d.class));
        GCMComplexOneLineButton gCMComplexOneLineButton = (GCMComplexOneLineButton) findViewById(R.id.user_settings_custom_step_length);
        this.P = gCMComplexOneLineButton;
        gCMComplexOneLineButton.setOnClickListener(this.L0);
        this.T = (ViewGroup) findViewById(R.id.user_settings_goals_container);
        GCMComplexTwoLineButton gCMComplexTwoLineButton = (GCMComplexTwoLineButton) findViewById(R.id.user_settings_daily_steps_goal);
        this.X = gCMComplexTwoLineButton;
        gCMComplexTwoLineButton.setOnClickListener(this.M0);
        GCMComplexTwoLineButton gCMComplexTwoLineButton2 = (GCMComplexTwoLineButton) findViewById(R.id.user_settings_daily_floors_climbed_goal);
        this.Y = gCMComplexTwoLineButton2;
        gCMComplexTwoLineButton2.setOnClickListener(this.N0);
        GCMComplexTwoLineButton gCMComplexTwoLineButton3 = (GCMComplexTwoLineButton) findViewById(R.id.user_settings_weekly_intensity_minutes);
        this.Z = gCMComplexTwoLineButton3;
        gCMComplexTwoLineButton3.setOnClickListener(this.O0);
        ArrayList<fb2.e> arrayList = this.K0;
        arrayList.clear();
        arrayList.add(new ch1.a(this));
        arrayList.add(new v2(this));
        arrayList.add(new k1(this));
        for (fb2.e eVar : arrayList) {
            boolean zG = eVar.g(this, this.f125985k);
            eVar.addObserver(this);
            eVar.m(zG);
        }
    }

    @Override // i.c, androidx.fragment.app.m, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        ArrayList arrayList = this.K0;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((fb2.e) it.next()).n();
        }
        arrayList.clear();
    }

    @Override // ng1.j, com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onNavigateUp() {
        onBackPressed();
        return true;
    }

    @Override // ng1.j, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (this.f42601w == null) {
            showProgressOverlay();
            this.I++;
            Object[] objArr = {String.valueOf(this.f42600v)};
            lj0.f fVar = lj0.f.f112996x;
            lj0.j jVar = new lj0.j(new l(this));
            this.F = jVar;
            jVar.b(new lj0.i(fVar, objArr));
            showProgressOverlay();
            this.I++;
            this.f42598k0 = ((d0) KoinJavaComponent.get(d0.class)).i(this.P0);
            if (td2.a.a(this.f42600v)) {
                showProgressOverlay();
                this.I++;
                xk0.g gVar = this.I0;
                gVar.getClass();
                xy2.b.K(gVar, new xk0.b(gVar, null)).f(this, new vg1.j(this, 0));
            }
        }
    }

    @Override // ng1.p, com.garmin.android.apps.connectmobile.c, i.c, androidx.fragment.app.m, android.app.Activity
    public final void onStop() {
        super.onStop();
        long j8 = this.f42598k0;
        if (j8 != -1) {
            try {
                com.garmin.android.library.backgroundtaskmanagement.c.f50123c.a(j8);
            } catch (Exception unused) {
                i2.f(a2.SETTINGS, "DeviceActivityTrackingSettingActivityDefault", "Error cancelling getUserSettingsFromGC");
            }
        }
        lj0.j jVar = this.F;
        if (jVar != null) {
            jVar.a();
        }
    }

    @Override // ng1.p, java.util.Observer
    public final void update(Observable observable, Object obj) {
        i2.k(a2.SETTINGS, "DeviceActivityTrackingSettingActivityDefault", hb.a.j("update(): observable=", observable, ", data=", obj));
        if (obj != null) {
            if (observable instanceof ch1.b) {
                DeviceSettingsActivityTracking.ca(this, this.f125985k, (String) obj, this.f125976b);
                return;
            }
            if (observable instanceof q4) {
                Forerunner35DeviceSystemSettings.ca(this, this.f125985k, (String) obj, false);
                return;
            }
            if (observable instanceof j6) {
                Forerunner35DeviceSettingsDisplayOptions.da(this, this.f125985k, (String) obj);
                return;
            }
            if (!(observable instanceof f3)) {
                if (observable instanceof u4) {
                    Forerunner35TonesDeviceSettings.ca(this, this.f125985k, (String) obj);
                }
            } else {
                DeviceSettingsDTO deviceSettingsDTO = this.f125985k;
                Intent intent = new Intent(this, (Class<?>) Forerunner35PhoneNotificationsDeviceSettings.class);
                intent.putExtra("GCM_deviceSettings", deviceSettingsDTO);
                intent.putExtra("GCM_deviceSettingsTitle", (String) obj);
                intent.putExtra("BLE_CONNECTION_ALERT", true);
                startActivityForResult(intent, 10);
            }
        }
    }
}
