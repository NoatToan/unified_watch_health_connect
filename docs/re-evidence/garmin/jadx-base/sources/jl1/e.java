package jl1;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import c22.n1;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.device.setup.DeviceSetupActivity;
import com.garmin.android.apps.connectmobile.i2;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class e implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f99485a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f99486b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f99487c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f99488d;

    public /* synthetic */ e(g gVar, boolean z14, c cVar) {
        this.f99487c = gVar;
        this.f99486b = z14;
        this.f99488d = cVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i14) {
        int i15 = this.f99485a;
        Object obj = this.f99488d;
        Object obj2 = this.f99487c;
        boolean z14 = this.f99486b;
        switch (i15) {
            case 0:
                g gVar = (g) obj2;
                xs.h hVar = ((c.a) ((c) obj)).f99474a;
                gVar.getClass();
                gVar.A4(z14, hVar);
                break;
            default:
                DeviceSetupActivity deviceSetupActivity = (DeviceSetupActivity) obj2;
                com.garmin.android.apps.connectmobile.device.setup.a aVar = (com.garmin.android.apps.connectmobile.device.setup.a) obj;
                DeviceSetupActivity.a aVar2 = DeviceSetupActivity.f33758b;
                if (z14) {
                    a2 a2Var = a2.DEVICE_SETUP;
                    i2.f36769a.getClass();
                    i2.a.a(a2Var, "Device is Explore-primary, Explore app installed, redirecting user to finish setup");
                    Intent intent = new Intent();
                    intent.setAction("android.intent.action.VIEW");
                    intent.setData(Uri.parse("explore://devices/setupRegisteredDevice/" + ((com.garmin.android.apps.connectmobile.device.setup.a.b) aVar).f33761a));
                    deviceSetupActivity.startActivity(intent);
                } else {
                    a2 a2Var2 = a2.DEVICE_SETUP;
                    i2.f36769a.getClass();
                    i2.a.a(a2Var2, "Device is Explore-primary, Explore app not installed, redirecting user to install Explore app");
                    new n1(deviceSetupActivity, hb2.g.a.GARMIN_EXPLORE).a();
                }
                deviceSetupActivity.finish();
                break;
        }
    }

    public /* synthetic */ e(boolean z14, DeviceSetupActivity deviceSetupActivity, com.garmin.android.apps.connectmobile.device.setup.a aVar) {
        this.f99486b = z14;
        this.f99487c = deviceSetupActivity;
        this.f99488d = aVar;
    }
}
