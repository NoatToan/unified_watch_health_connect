package com.garmin.android.apps.connectmobile.settings.devices.swim;

import am.a2;
import android.content.Intent;
import com.garmin.android.apps.connectmobile.devices.model.f;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.settings.activityoptions.AlertsActivity;
import com.garmin.android.apps.connectmobile.settings.activityoptions.StrokeRateAlertsActivity;
import com.garmin.android.apps.connectmobile.settings.devices.e;
import hb.a;
import ig1.d2;
import ig1.e2;
import ig1.f2;
import ig1.g2;
import ig1.z1;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
import vk1.b;

/* JADX INFO: loaded from: classes10.dex */
public class SwimAlertsActivity extends AlertsActivity implements Observer {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public z1 f43145f;

    @Override // com.garmin.android.apps.connectmobile.settings.activityoptions.AlertsActivity
    public final ArrayList ea(b bVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(da(bVar));
        arrayList.add(new g2(this));
        if (e.b.LAP_SWIMMING.name().equalsIgnoreCase(this.f41617c.z0())) {
            e2 e2Var = new e2(this);
            e2Var.addObserver(this);
            arrayList.add(e2Var);
            arrayList.add(new f2(this));
        }
        if (e.b.OPEN_WATER.name().equalsIgnoreCase(this.f41617c.z0())) {
            arrayList.add(new d2(this));
            z1 z1Var = new z1(this);
            this.f43145f = z1Var;
            z1Var.addObserver(this);
            arrayList.add(this.f43145f);
        }
        arrayList.add(ca());
        return arrayList;
    }

    @Override // com.garmin.android.apps.connectmobile.settings.activityoptions.AlertsActivity
    public final String fa() {
        return "SwimAlertsActivity";
    }

    @Override // com.garmin.android.apps.connectmobile.z1, androidx.fragment.app.m, b.g, android.app.Activity
    public final void onActivityResult(int i14, int i15, Intent intent) {
        z1 z1Var;
        super.onActivityResult(i14, i15, intent);
        if (i15 != -1 || i14 != 20 || intent == null || intent.getExtras() == null) {
            return;
        }
        f fVar = (f) a2.c(intent.getExtras(), "GCM_deviceActivityOptions");
        if (fVar != null && (z1Var = this.f43145f) != null) {
            z1Var.k(fVar);
            this.f43145f.m(true);
            this.f41617c = fVar;
        }
        i2.a(com.garmin.android.apps.connectmobile.a2.SETTINGS, "SwimAlertsActivity", "onActivityResult: mDeviceActivityOptionsDTO=" + this.f41617c);
    }

    @Override // com.garmin.android.apps.connectmobile.settings.activityoptions.AlertsActivity, java.util.Observer
    public final void update(Observable observable, Object obj) {
        i2.k(com.garmin.android.apps.connectmobile.a2.SETTINGS, "SwimAlertsActivity", a.j("update: observable=", observable, ", data=", obj));
        if (obj != null) {
            if (observable instanceof z1) {
                f fVar = this.f41617c;
                StrokeRateAlertsActivity.f41693b.getClass();
                fVar.getClass();
                Intent intent = new Intent(this, (Class<?>) StrokeRateAlertsActivity.class);
                intent.putExtra("GCM_deviceActivityOptions", fVar);
                startActivityForResult(intent, 20);
            }
            if (observable instanceof e2) {
                ((e2) observable).k(this.f41617c);
            }
        }
    }
}
