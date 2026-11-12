package com.garmin.android.apps.connectmobile.settings.devices.fr645;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.lifecycle.x1;
import ch1.f1;
import ch1.f2;
import ch1.i0;
import ch1.i3;
import ch1.p4;
import ch1.u2;
import ch1.w2;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.g1;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.settings.devices.ActivityTrackingPulseOXSetting;
import com.garmin.android.apps.connectmobile.settings.devices.DeviceSettingsActivityTracking;
import com.garmin.android.apps.connectmobile.settings.devices.fr645.FR645ActivityTrackingSettingActivity;
import com.garmin.android.library.backgroundtaskmanagement.c;
import fb2.e;
import gr0.f;
import i3.e5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Observable;
import java.util.Observer;
import ng1.j;
import oc1.d;
import org.koin.java.KoinJavaComponent;
import zb0.d0;

/* JADX INFO: loaded from: classes10.dex */
public class FR645ActivityTrackingSettingActivity extends j implements Observer {
    public static final /* synthetic */ int T = 0;
    public a A;
    public com.garmin.android.apps.connectmobile.settings.devices.fr645.a B;
    public w2 E;
    public u2 F;
    public i3 I;
    public d P;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f42995t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f42996v;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public jh1.b f42999y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public b f43000z;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public nr0.a f42997w = new nr0.a();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ArrayList f42998x = new ArrayList();
    public final ArrayList C = new ArrayList();
    public boolean D = false;

    public class a implements com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b<nr0.a> {
        public a() {
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onComplete(long j8, com.garmin.android.library.backgroundtaskmanagement.b.c cVar) {
            FR645ActivityTrackingSettingActivity fR645ActivityTrackingSettingActivity = FR645ActivityTrackingSettingActivity.this;
            g1.b(fR645ActivityTrackingSettingActivity, cVar);
            fR645ActivityTrackingSettingActivity.hideProgressOverlay();
            fR645ActivityTrackingSettingActivity.C.remove(Long.valueOf(j8));
            FR645ActivityTrackingSettingActivity.la(fR645ActivityTrackingSettingActivity.f42998x, fR645ActivityTrackingSettingActivity.f125985k);
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onResults(long j8, com.garmin.android.library.backgroundtaskmanagement.b.e eVar, nr0.a aVar) {
            nr0.a aVar2 = aVar;
            FR645ActivityTrackingSettingActivity fR645ActivityTrackingSettingActivity = FR645ActivityTrackingSettingActivity.this;
            fR645ActivityTrackingSettingActivity.f42997w = aVar2;
            DeviceSettingsDTO deviceSettingsDTO = fR645ActivityTrackingSettingActivity.f125985k;
            if (deviceSettingsDTO != null) {
                deviceSettingsDTO.f33879j1 = aVar2;
            }
        }
    }

    public static void la(ArrayList arrayList, DeviceSettingsDTO deviceSettingsDTO) {
        if (deviceSettingsDTO == null || arrayList == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            eVar.m(eVar.k(deviceSettingsDTO));
        }
    }

    @Override // ng1.j
    public int ea() {
        return R.layout.gcm_fr645_device_activity_tracking_settings_default;
    }

    public void ka() {
        this.E = new w2(this);
        this.F = new u2(this);
        this.I = new i3(this);
        ArrayList<e> arrayList = this.f42998x;
        arrayList.clear();
        arrayList.add(this.I);
        arrayList.add(new ch1.a(this));
        arrayList.add(this.F);
        arrayList.add(this.E);
        final int i14 = 0;
        arrayList.add(new p4(this, new xg1.j(this) { // from class: jh1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FR645ActivityTrackingSettingActivity f98754b;

            {
                this.f98754b = this;
            }

            @Override // xg1.j
            public final void a(nr0.a aVar) {
                int i15 = i14;
                FR645ActivityTrackingSettingActivity fR645ActivityTrackingSettingActivity = this.f98754b;
                switch (i15) {
                    case 0:
                        int i16 = FR645ActivityTrackingSettingActivity.T;
                        fR645ActivityTrackingSettingActivity.oa(aVar);
                        break;
                    case 1:
                        int i17 = FR645ActivityTrackingSettingActivity.T;
                        fR645ActivityTrackingSettingActivity.na(aVar);
                        break;
                    default:
                        int i18 = FR645ActivityTrackingSettingActivity.T;
                        fR645ActivityTrackingSettingActivity.ma(aVar);
                        break;
                }
            }
        }));
        final int i15 = 1;
        arrayList.add(new f2(this, new xg1.j(this) { // from class: jh1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FR645ActivityTrackingSettingActivity f98754b;

            {
                this.f98754b = this;
            }

            @Override // xg1.j
            public final void a(nr0.a aVar) {
                int i16 = i15;
                FR645ActivityTrackingSettingActivity fR645ActivityTrackingSettingActivity = this.f98754b;
                switch (i16) {
                    case 0:
                        int i17 = FR645ActivityTrackingSettingActivity.T;
                        fR645ActivityTrackingSettingActivity.oa(aVar);
                        break;
                    case 1:
                        int i18 = FR645ActivityTrackingSettingActivity.T;
                        fR645ActivityTrackingSettingActivity.na(aVar);
                        break;
                    default:
                        int i19 = FR645ActivityTrackingSettingActivity.T;
                        fR645ActivityTrackingSettingActivity.ma(aVar);
                        break;
                }
            }
        }));
        final int i16 = 2;
        arrayList.add(new f1(this, new xg1.j(this) { // from class: jh1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FR645ActivityTrackingSettingActivity f98754b;

            {
                this.f98754b = this;
            }

            @Override // xg1.j
            public final void a(nr0.a aVar) {
                int i17 = i16;
                FR645ActivityTrackingSettingActivity fR645ActivityTrackingSettingActivity = this.f98754b;
                switch (i17) {
                    case 0:
                        int i18 = FR645ActivityTrackingSettingActivity.T;
                        fR645ActivityTrackingSettingActivity.oa(aVar);
                        break;
                    case 1:
                        int i19 = FR645ActivityTrackingSettingActivity.T;
                        fR645ActivityTrackingSettingActivity.na(aVar);
                        break;
                    default:
                        int i110 = FR645ActivityTrackingSettingActivity.T;
                        fR645ActivityTrackingSettingActivity.ma(aVar);
                        break;
                }
            }
        }));
        arrayList.add(new i0(this));
        if (this.f125985k != null) {
            for (e eVar : arrayList) {
                boolean zG = eVar.g(this, this.f125985k);
                eVar.addObserver(this);
                eVar.m(zG);
            }
            this.E.l(this.f125985k.e1());
            this.F.l(this.f125985k.e1());
        }
    }

    public final void ma(nr0.a aVar) {
        this.f43000z = new b(this);
        showProgressOverlay();
        fr0.a aVarM = fr0.a.M();
        b bVar = this.f43000z;
        aVarM.getClass();
        aVar.getClass();
        this.C.add(Long.valueOf(c.d(new gr0.a(aVar, 1, aVarM), bVar)));
    }

    public final void na(nr0.a aVar) {
        this.A = new a();
        showProgressOverlay();
        fr0.a aVarM = fr0.a.M();
        a aVar2 = this.A;
        aVarM.getClass();
        aVar.getClass();
        this.C.add(Long.valueOf(c.d(new gr0.a(aVar, 2, aVarM), aVar2)));
    }

    public final void oa(nr0.a aVar) {
        this.B = new com.garmin.android.apps.connectmobile.settings.devices.fr645.a(this);
        showProgressOverlay();
        fr0.a aVarM = fr0.a.M();
        com.garmin.android.apps.connectmobile.settings.devices.fr645.a aVar2 = this.B;
        aVarM.getClass();
        aVar.getClass();
        this.C.add(Long.valueOf(c.d(new gr0.a(aVar, 0, aVarM), aVar2)));
    }

    @Override // com.garmin.android.apps.connectmobile.z1, androidx.fragment.app.m, b.g, android.app.Activity
    public void onActivityResult(int i14, int i15, Intent intent) {
        DeviceSettingsDTO deviceSettingsDTO;
        n23.j.y(e5.j(i14, i15, "onActivityResult(): requestCode=", ", resultCode=", ", data="), intent, a2.SETTINGS, "FR645ActivityTrackingSettingActivity");
        super.onActivityResult(i14, i15, intent);
        if (i14 == 10 && i15 == -1) {
            if (intent == null || intent.getExtras() == null) {
                deviceSettingsDTO = null;
            } else {
                deviceSettingsDTO = (DeviceSettingsDTO) intent.getExtras().get("GCM_deviceSettings");
                intent.getBooleanExtra("GCM_updatedPAT", false);
            }
            if (deviceSettingsDTO != null) {
                this.f125985k = deviceSettingsDTO;
                la(this.f42998x, deviceSettingsDTO);
            }
        }
        if (i14 == 15 && i15 == -1 && intent != null && "android.intent.action.EDIT".equalsIgnoreCase(intent.getAction())) {
            this.D = true;
        }
    }

    @Override // ng1.j, com.garmin.android.apps.connectmobile.z1, b.g, android.app.Activity
    public void onBackPressed() {
        if (this.D) {
            this.P.x4(this.f42996v, "FR645ActivityTrackingSettingActivity");
        }
        super.onBackPressed();
    }

    @Override // ng1.j, ng1.p, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initActionBar(true, R.string.activity_tracking_title);
        if (this.f125985k == null) {
            i2.k(a2.SETTINGS, "FR645ActivityTrackingSettingActivity", "Device Settings DTO is null");
            finish();
            return;
        }
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            this.f42995t = extras.getString("GCM_deviceProductNbr");
            this.f42996v = extras.getLong("GCM_deviceUnitID", -1L);
        }
        if (this.f42995t != null) {
            this.P = (d) new x1(this).a(d.class);
        } else {
            i2.f(a2.SETTINGS, "FR645ActivityTrackingSettingActivity", "Invalid device product number! Exit device user settings.");
            finish();
        }
    }

    @Override // i.c, androidx.fragment.app.m, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        ArrayList arrayList = this.f42998x;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((e) it.next()).n();
            }
        }
        arrayList.clear();
    }

    @Override // ng1.j, com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onNavigateUp() {
        onBackPressed();
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem == null || menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    @Override // ng1.j, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, android.app.Activity
    public final void onResume() {
        super.onResume();
        nr0.a aVar = this.f42997w;
        if (aVar.f127608b == null && aVar.f127607a == null && !aVar.f()) {
            this.f42999y = new jh1.b(this);
            showProgressOverlay();
            fr0.a aVarM = fr0.a.M();
            jh1.b bVar = this.f42999y;
            aVarM.getClass();
            this.C.add(Long.valueOf(c.d(new f(true, true, true, aVarM), bVar)));
        }
    }

    @Override // ng1.p, com.garmin.android.apps.connectmobile.c, i.c, androidx.fragment.app.m, android.app.Activity
    public final void onStop() {
        super.onStop();
        c.f50123c.c(this.C);
    }

    @Override // ng1.p, java.util.Observer
    public void update(Observable observable, Object obj) {
        DeviceSettingsDTO deviceSettingsDTO;
        i2.k(a2.SETTINGS, "FR645ActivityTrackingSettingActivity", hb.a.j("update(): observable=", observable, ", data=", obj));
        if (obj != null) {
            if ((observable instanceof ch1.a) && (deviceSettingsDTO = this.f125985k) != null) {
                this.F.z(deviceSettingsDTO);
                this.E.z(this.f125985k);
            }
            if (observable instanceof i3) {
                DeviceSettingsDTO deviceSettingsDTO2 = this.f125985k;
                String str = this.f125949q;
                String str2 = this.f42995t;
                ActivityTrackingPulseOXSetting.f41786l.getClass();
                ActivityTrackingPulseOXSetting.a.a(this, deviceSettingsDTO2, str, str2);
            }
            if (observable instanceof ch1.b) {
                DeviceSettingsActivityTracking.ca(this, this.f125985k, (String) obj, this.f125976b);
            } else if (observable instanceof i0) {
                ((d0) KoinJavaComponent.get(d0.class)).m(this, this.f42995t, 15);
            }
        }
    }
}
