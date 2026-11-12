package di1;

import com.garmin.android.apps.connectmobile.R;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f59742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.settings.devices.wifi.b f59743b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.settings.devices.wifi.m.b f59744c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.library.backgroundtaskmanagement.b.c f59745d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.settings.devices.wifi.k f59746e;

    public /* synthetic */ d(com.garmin.android.apps.connectmobile.settings.devices.wifi.b bVar, com.garmin.android.apps.connectmobile.settings.devices.wifi.m.b bVar2, com.garmin.android.library.backgroundtaskmanagement.b.c cVar, com.garmin.android.apps.connectmobile.settings.devices.wifi.k kVar, int i14) {
        this.f59742a = i14;
        this.f59743b = bVar;
        this.f59744c = bVar2;
        this.f59745d = cVar;
        this.f59746e = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i14 = this.f59742a;
        com.garmin.android.apps.connectmobile.settings.devices.wifi.k kVar = this.f59746e;
        com.garmin.android.library.backgroundtaskmanagement.b.c cVar = this.f59745d;
        com.garmin.android.apps.connectmobile.settings.devices.wifi.m.b bVar = this.f59744c;
        com.garmin.android.apps.connectmobile.settings.devices.wifi.b bVar2 = this.f59743b;
        switch (i14) {
            case 0:
                com.garmin.android.apps.connectmobile.settings.devices.wifi.b.C0803b c0803b = com.garmin.android.apps.connectmobile.settings.devices.wifi.b.f43259w;
                bVar2.z6(bVar);
                if (cVar != com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS) {
                    if (cVar != com.garmin.android.library.backgroundtaskmanagement.b.c.DEVICE_TIMEOUT) {
                        com.garmin.android.apps.connectmobile.settings.devices.wifi.b.w6(bVar2, bVar2.getString(R.string.txt_something_went_wrong_try_again));
                    } else {
                        kVar.getClass();
                        com.garmin.android.apps.connectmobile.settings.devices.wifi.b.w6(bVar2, bVar2.getString(R.string.wifi_error_connecting_timeout, kVar.f43320a));
                    }
                }
                break;
            default:
                com.garmin.android.apps.connectmobile.settings.devices.wifi.b.C0803b c0803b2 = com.garmin.android.apps.connectmobile.settings.devices.wifi.b.f43259w;
                bVar2.z6(bVar);
                if (cVar != com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS) {
                    if (cVar != com.garmin.android.library.backgroundtaskmanagement.b.c.DEVICE_TIMEOUT) {
                        com.garmin.android.apps.connectmobile.settings.devices.wifi.b.w6(bVar2, bVar2.getString(R.string.txt_something_went_wrong_try_again));
                    } else {
                        com.garmin.android.apps.connectmobile.settings.devices.wifi.b.w6(bVar2, bVar2.getString(R.string.wifi_error_connecting_timeout, kVar.f43320a));
                    }
                }
                break;
        }
    }
}
