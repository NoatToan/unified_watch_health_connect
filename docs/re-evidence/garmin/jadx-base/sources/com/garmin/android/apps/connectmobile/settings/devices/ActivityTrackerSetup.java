package com.garmin.android.apps.connectmobile.settings.devices;

import android.content.Intent;
import android.os.Bundle;
import c22.y0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.devices.model.n;
import com.garmin.android.apps.connectmobile.i2;
import java.util.concurrent.atomic.AtomicInteger;
import org.koin.java.KoinJavaComponent;
import vg1.z;
import zb0.d0;
import zb0.u0;

/* JADX INFO: loaded from: classes10.dex */
public class ActivityTrackerSetup extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f41772n = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f41773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f41774b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f41775c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f41776d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f41777e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicInteger f41778f = new AtomicInteger();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public u0 f41779g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public z f41780h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f41781i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f41782j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public d80.f<n> f41783k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public n f41784l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f41785m;

    public Intent ca() {
        Intent intentDa = da();
        intentDa.setClassName(this, ((d0) KoinJavaComponent.get(d0.class)).y(this.f41779g.f203854a));
        return intentDa;
    }

    public final Intent da() {
        Intent intent = new Intent();
        intent.putExtra("GCM_deviceProductNbr", this.f41774b);
        intent.putExtra("GCM_deviceUnitID", this.f41773a);
        intent.putExtra("GCM_deviceName", this.f41775c);
        intent.putExtra("GCM_deviceRegistrationStatus", this.f41784l);
        intent.putExtra("GCM_deviceDisplayName", this.f41776d);
        intent.putExtra("GCM_extra_device_image_url", this.f41777e);
        intent.putExtra("GCM_macAddress", this.f41781i);
        intent.putExtra("GCM_currentFirmwareVersion", this.f41782j);
        intent.putExtra("GCM_low_hr_alert_capable", this.f41785m);
        return intent;
    }

    public void ea() {
        if (this.f41778f.get() == 1) {
            hideProgressOverlay();
            startActivity(ca());
            finish();
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.gcm3_device_settings_setup);
        initActionBar(true);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            this.f41773a = extras.getLong("GCM_deviceUnitID", -1L);
            this.f41774b = extras.getString("GCM_deviceProductNbr");
            this.f41775c = extras.getString("GCM_deviceName");
            this.f41776d = extras.getString("GCM_deviceDisplayName");
            this.f41777e = extras.getString("GCM_extra_device_image_url");
            this.f41781i = extras.getString("GCM_macAddress");
            this.f41782j = extras.getString("GCM_currentFirmwareVersion");
            this.f41785m = extras.getBoolean("GCM_low_hr_alert_capable");
        }
        if (this.f41773a < 0) {
            i2.f(a2.SETTINGS, "ActivityTrackerSetup", "Invalid device unit ID while entering device settings!");
            finish();
            return;
        }
        String str = this.f41774b;
        if (str == null) {
            i2.f(a2.SETTINGS, "ActivityTrackerSetup", "Invalid device product number while entering device settings!");
            finish();
            return;
        }
        this.f41779g = (u0) u0.f203782n6.get(str);
        this.f41780h = ((d0) KoinJavaComponent.get(d0.class)).J(this.f41779g);
        showProgressOverlay();
        e eVarN = e.N();
        long j8 = this.f41773a;
        ng1.a aVar = new ng1.a(this);
        eVarN.getClass();
        d80.f.b bVar = new d80.f.b(new Object[]{String.valueOf(j8)}, lj0.f.f112995w);
        bVar.f58273c = n.class;
        bVar.f58274d = aVar;
        bVar.f58275e = d80.g.JSON_OBJECT;
        d80.f<n> fVarA = bVar.a();
        fVarA.b();
        this.f41783k = fVarA;
    }

    @Override // com.garmin.android.apps.connectmobile.c, i.c, androidx.fragment.app.m, android.app.Activity
    public void onStop() {
        super.onStop();
        y0.a(this.f41783k);
    }
}
