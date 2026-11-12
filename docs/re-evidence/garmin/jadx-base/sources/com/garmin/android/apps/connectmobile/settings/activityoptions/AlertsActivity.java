package com.garmin.android.apps.connectmobile.settings.activityoptions;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.Toast;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import fb2.g;
import ig1.b1;
import ig1.d0;
import ig1.e1;
import ig1.f2;
import ig1.g2;
import ig1.m0;
import ig1.t;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
import uk1.i;
import zb0.u0;

/* JADX INFO: loaded from: classes10.dex */
public class AlertsActivity extends com.garmin.android.apps.connectmobile.c implements Observer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f41615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public u0 f41616b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.devices.model.f f41617c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public vk1.b f41618d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f41619e = -1;

    public class a implements com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b {
        public a() {
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onComplete(long j8, com.garmin.android.library.backgroundtaskmanagement.b.c cVar) {
            AlertsActivity alertsActivity = AlertsActivity.this;
            alertsActivity.f41619e = -1L;
            if (cVar != com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS) {
                i2.f(a2.SETTINGS, alertsActivity.fa(), "getHRZonesConfig: " + cVar.name());
                Toast.makeText(alertsActivity, R.string.txt_something_went_wrong_try_again, 0).show();
                alertsActivity.finish();
            }
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onResults(long j8, com.garmin.android.library.backgroundtaskmanagement.b.e eVar, Object obj) {
            AlertsActivity alertsActivity = AlertsActivity.this;
            alertsActivity.f41619e = -1L;
            if (obj == null) {
                i2.f(a2.SETTINGS, alertsActivity.fa(), "getHRZonesConfig: data from call is null");
                Toast.makeText(alertsActivity, R.string.txt_something_went_wrong_try_again, 0).show();
                alertsActivity.finish();
                return;
            }
            alertsActivity.f41618d = (vk1.b) obj;
            alertsActivity.hideProgressOverlay();
            ArrayList arrayListEa = alertsActivity.ea(alertsActivity.f41618d);
            LinearLayout linearLayout = (LinearLayout) alertsActivity.findViewById(R.id.page_content);
            linearLayout.addView(g.a(alertsActivity));
            for (int i14 = 0; i14 < arrayListEa.size(); i14++) {
                fb2.e eVar2 = (fb2.e) arrayListEa.get(i14);
                if (eVar2.g(alertsActivity, alertsActivity.f41617c)) {
                    linearLayout.addView(eVar2.a());
                }
            }
            linearLayout.addView(g.a(alertsActivity));
        }
    }

    public final t ca() {
        u0 u0Var = this.f41616b;
        return (u0Var == u0.f203764l2 || u0Var == u0.M1) ? new b1(this) : new t(this);
    }

    public final m0 da(vk1.b bVar) {
        u0 u0Var = this.f41616b;
        return (u0Var == u0.f203764l2 || u0Var == u0.M1) ? new e1(this, bVar) : new m0(this, bVar);
    }

    public ArrayList ea(vk1.b bVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(da(bVar));
        arrayList.add(new g2(this));
        arrayList.add(new d0(this));
        arrayList.add(ca());
        arrayList.add(new f2(this));
        return arrayList;
    }

    public String fa() {
        return "AlertsActivity";
    }

    @Override // android.app.Activity
    public final void finish() {
        if (this.f41617c != null) {
            getIntent().putExtra("GCM_deviceActivityOptions", this.f41617c);
            setResult(-1, getIntent());
        } else {
            setResult(0);
        }
        super.finish();
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.gcm3_activity_options_dynamic_content);
        initActionBar(true, R.string.device_alerts);
        this.f41617c = (com.garmin.android.apps.connectmobile.devices.model.f) getIntent().getExtras().getParcelable("GCM_deviceActivityOptions");
        this.f41615a = getIntent().getLongExtra("GCM_deviceUnitID", -1L);
        this.f41616b = (u0) getIntent().getSerializableExtra("GCM_deviceEnumValue");
    }

    @Override // com.garmin.android.apps.connectmobile.c, androidx.fragment.app.m, android.app.Activity
    public final void onPause() {
        super.onPause();
        long j8 = this.f41619e;
        if (j8 != -1) {
            com.garmin.android.library.backgroundtaskmanagement.c.f50123c.a(j8);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, android.app.Activity
    public final void onResume() {
        i iVarA;
        super.onResume();
        if (this.f41618d == null) {
            showProgressOverlay();
            a aVar = new a();
            i.a aVar2 = i.f171903b;
            synchronized (i.class) {
                iVarA = i.f171903b.a();
            }
            this.f41619e = iVarA.N(this.f41615a, aVar);
        }
    }

    @Override // java.util.Observer
    public void update(Observable observable, Object obj) {
    }
}
