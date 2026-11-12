package com.garmin.android.apps.connectmobile.settings.devices;

import android.os.Bundle;
import ch1.o;
import ch1.r5;
import ch1.t;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.settings.model.AutoActivityDetectDTO;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Observable;
import java.util.Observer;
import ng1.d1;
import ng1.j;
import org.koin.java.KoinJavaComponent;
import zb0.d0;

/* JADX INFO: loaded from: classes10.dex */
public class VivomoveDeviceSettings extends j implements Observer {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ArrayList f42301t = new ArrayList();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public AutoActivityDetectDTO f42302v;

    @Override // ng1.j
    public final int ea() {
        return R.layout.gcm3_device_settings_vivomove;
    }

    @Override // ng1.j, com.garmin.android.apps.connectmobile.z1, b.g, android.app.Activity
    public final void onBackPressed() {
        super.onBackPressed();
        showProgressOverlay();
        d0 d0Var = (d0) KoinJavaComponent.get(d0.class);
        AutoActivityDetectDTO autoActivityDetectDTO = this.f42302v;
        Boolean bool = autoActivityDetectDTO.f43509b;
        if (bool == null) {
            bool = autoActivityDetectDTO.f43510c;
        }
        if (bool != null) {
            d0Var.z(bool.booleanValue(), new d1(this));
        }
    }

    @Override // ng1.j, ng1.p, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getIntent().getExtras() != null) {
            this.f42302v = (AutoActivityDetectDTO) getIntent().getExtras().getParcelable("GCM_autoActivityDetectValue");
        }
        ArrayList arrayList = this.f42301t;
        arrayList.clear();
        o oVar = new o(this);
        oVar.m(oVar.g(this, this.f42302v));
        arrayList.add(oVar);
        t tVar = new t(this);
        tVar.m(tVar.g(this, this.f125985k));
        arrayList.add(tVar);
        r5 r5Var = new r5(this);
        r5Var.m(r5Var.g(this, this.f125985k));
        arrayList.add(r5Var);
    }

    @Override // i.c, androidx.fragment.app.m, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        ArrayList arrayList = this.f42301t;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((fb2.e) it.next()).n();
        }
        arrayList.clear();
    }

    @Override // ng1.p, java.util.Observer
    public final void update(Observable observable, Object obj) {
    }
}
