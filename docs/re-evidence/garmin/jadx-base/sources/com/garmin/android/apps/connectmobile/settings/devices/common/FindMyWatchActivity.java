package com.garmin.android.apps.connectmobile.settings.devices.common;

import android.os.Bundle;
import android.os.Handler;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.device.datatypes.DeviceProfile;
import org.koin.java.KoinJavaComponent;
import rd2.j;
import v.b0;
import vg1.l0;
import vg1.m0;
import vg1.o0;

/* JADX INFO: loaded from: classes10.dex */
public class FindMyWatchActivity extends i.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f42782c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Handler f42783a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public sd2.f f42784b = null;

    public static xt2.a O9(sd2.f fVar) {
        da2.b bVarX = ((l80.b) KoinJavaComponent.get(l80.b.class)).x();
        DeviceProfile deviceProfileD = bVarX.d(fVar.d0());
        if (deviceProfileD == null) {
            deviceProfileD = bVarX.d(fVar.Q());
        }
        if (deviceProfileD == null) {
            return null;
        }
        return (xt2.a) bVarX.getCapability(deviceProfileD.getMacAddress(), xt2.a.class);
    }

    public final void P9() {
        androidx.appcompat.app.e.a aVar = new androidx.appcompat.app.e.a(this);
        aVar.setMessage(R.string.find_my_watch_device_not_connected_msg);
        aVar.setPositiveButton(R.string.lbl_close, new l0(this, 1));
        androidx.appcompat.app.e eVarCreate = aVar.create();
        eVarCreate.setOnCancelListener(new m0(this, 1));
        eVarCreate.show();
    }

    @Override // androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getIntent().getExtras() != null) {
            long j8 = getIntent().getExtras().getLong("GCM_deviceUnitID");
            rd2.f.a().f152045a.getClass();
            this.f42784b = j.i(j8, null);
        }
    }

    @Override // i.c, androidx.fragment.app.m, android.app.Activity
    public final void onStart() {
        super.onStart();
        if (this.f42783a == null) {
            this.f42783a = new Handler();
        }
        l80.b bVar = (l80.b) KoinJavaComponent.get(l80.b.class);
        sd2.f fVar = this.f42784b;
        if (fVar == null || !bVar.a(fVar.getUnitID())) {
            androidx.appcompat.app.e.a aVar = new androidx.appcompat.app.e.a(this);
            aVar.setTitle(R.string.find_my_watch_device_not_connected_title);
            aVar.setMessage(R.string.find_my_watch_device_not_connected_msg);
            aVar.setPositiveButton(R.string.lbl_ok, new l0(this, 0));
            androidx.appcompat.app.e eVarCreate = aVar.create();
            eVarCreate.setOnCancelListener(new m0(this, 0));
            eVarCreate.show();
            return;
        }
        sd2.f fVar2 = this.f42784b;
        xt2.a aVarO9 = fVar2 != null ? O9(fVar2) : null;
        if (aVarO9 != null) {
            aVarO9.d(new o0(this));
            return;
        }
        Handler handler = this.f42783a;
        if (handler != null) {
            handler.post(new b0(this, 9));
        }
    }

    @Override // i.c, androidx.fragment.app.m, android.app.Activity
    public final void onStop() {
        super.onStop();
        Handler handler = this.f42783a;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f42783a = null;
        }
    }
}
