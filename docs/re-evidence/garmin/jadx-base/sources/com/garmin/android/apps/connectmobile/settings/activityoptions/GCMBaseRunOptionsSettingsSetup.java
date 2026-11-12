package com.garmin.android.apps.connectmobile.settings.activityoptions;

import android.content.Intent;
import android.os.Bundle;
import d80.g;
import hb2.i;
import zb0.u0;

/* JADX INFO: loaded from: classes10.dex */
public class GCMBaseRunOptionsSettingsSetup extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f41650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public u0 f41651b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.devices.model.f f41652c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public d80.f f41653d;

    public void ca() {
        Intent intent = new Intent(this, (Class<?>) GCMRunOptionsSettings.class);
        intent.putExtra("GCM_deviceUnitID", this.f41650a);
        intent.putExtra("GCM_deviceEnumValue", this.f41651b);
        intent.putExtra("GCM_deviceActivityOptions", this.f41652c);
        startActivity(intent);
        finish();
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f41650a = getIntent().getLongExtra("GCM_deviceUnitID", -1L);
        this.f41651b = (u0) getIntent().getSerializableExtra("GCM_deviceEnumValue");
        if (i.a(this)) {
            showProgressOverlay();
            com.garmin.android.apps.connectmobile.settings.devices.e eVarN = com.garmin.android.apps.connectmobile.settings.devices.e.N();
            long j8 = this.f41650a;
            hg1.c cVar = new hg1.c(this);
            eVarN.getClass();
            d80.f.b bVar = new d80.f.b(new Object[]{String.valueOf(j8)}, lj0.f.f112993t);
            bVar.f58273c = com.garmin.android.apps.connectmobile.devices.model.f.class;
            bVar.f58274d = cVar;
            bVar.f58275e = g.JSON_OBJECT;
            d80.f fVarA = bVar.a();
            fVarA.b();
            this.f41653d = fVarA;
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, i.c, androidx.fragment.app.m, android.app.Activity
    public final void onStop() {
        super.onStop();
        d80.f fVar = this.f41653d;
        if (fVar != null) {
            fVar.a();
        }
    }
}
