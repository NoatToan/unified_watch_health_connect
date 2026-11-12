package com.garmin.android.apps.connectmobile.settings.devices.fenix5Plus;

import android.content.Intent;
import android.os.Bundle;
import ch1.a1;
import ch1.c3;
import ch1.e6;
import ch1.g0;
import ch1.o1;
import ch1.x3;
import ch1.y3;
import ch1.z3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.settings.devices.swim.css.CriticalSwimSpeedEditActivity;
import com.garmin.android.apps.connectmobile.settings.usersettings.heartratezones.ui.PowerZonesConfigActivity;
import com.garmin.android.apps.connectmobile.settings.usersettings.heartratezones.ui.PowerZonesListActivity;
import ig1.h0;
import ig1.p1;
import ig1.s;
import ig1.s0;
import java.util.ArrayList;
import java.util.Observable;
import ng1.l0;
import org.koin.java.KoinJavaComponent;
import vg1.w;
import vk1.e;
import zb0.d0;

/* JADX INFO: loaded from: classes10.dex */
public class Fenix5PlusUserSettingActivity extends l0 {
    @Override // ng1.l0
    public final void da() {
        ArrayList arrayList = this.f125961r;
        arrayList.clear();
        arrayList.add(new c3(this));
        arrayList.add(new h0(this));
        arrayList.add(new o1(this));
        arrayList.add(new e6(this));
        arrayList.add(new s(this));
        arrayList.add(new y3(this));
        arrayList.add(new z3(this));
        arrayList.add(new x3(this));
        arrayList.add(new a1(this));
        arrayList.add(new s0(this));
        if (((d0) KoinJavaComponent.get(d0.class)).Y(this.f125993g)) {
            arrayList.add(new p1(this));
        }
        arrayList.add(new g0(this));
        l0.ea(this, arrayList, this.f125995i, this);
    }

    @Override // ng1.l0, ng1.q, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initActionBar(true, R.string.devices_settings_user_settings);
    }

    @Override // ng1.l0, java.util.Observer
    public final void update(Observable observable, Object obj) {
        if (obj != null) {
            if (observable instanceof s0) {
                Intent intent = new Intent();
                intent.setClassName(this, this.f125993g.getF178180m());
                intent.putExtra("GCM_deviceUnitID", this.f125992f);
                intent.putExtra("GCM_deviceProductNbr", this.f125994h);
                startActivity(intent);
                this.f125997k = true;
            }
            if (observable instanceof p1) {
                if (this.f125998l) {
                    PowerZonesListActivity.ca(this, this.f125992f);
                } else {
                    PowerZonesConfigActivity.ca(this, this.f125999m, e.CYCLING.name());
                }
                this.f125997k = true;
            }
            if (observable instanceof g0) {
                w.a();
                CriticalSwimSpeedEditActivity.f43146g.getClass();
                startActivity(CriticalSwimSpeedEditActivity.a.a(this, false));
                this.f125997k = true;
            }
        }
    }
}
