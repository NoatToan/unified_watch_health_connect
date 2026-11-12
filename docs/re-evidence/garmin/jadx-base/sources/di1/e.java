package di1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f59747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.settings.devices.wifi.b f59748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.settings.devices.wifi.m.b f59749c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.settings.devices.wifi.e f59750d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.settings.devices.wifi.k f59751e;

    public /* synthetic */ e(com.garmin.android.apps.connectmobile.settings.devices.wifi.b bVar, com.garmin.android.apps.connectmobile.settings.devices.wifi.m.b bVar2, com.garmin.android.apps.connectmobile.settings.devices.wifi.e eVar, com.garmin.android.apps.connectmobile.settings.devices.wifi.k kVar, int i14) {
        this.f59747a = i14;
        this.f59748b = bVar;
        this.f59749c = bVar2;
        this.f59750d = eVar;
        this.f59751e = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i14 = this.f59747a;
        com.garmin.android.apps.connectmobile.settings.devices.wifi.k kVar = this.f59751e;
        com.garmin.android.apps.connectmobile.settings.devices.wifi.e eVar = this.f59750d;
        com.garmin.android.apps.connectmobile.settings.devices.wifi.m.b bVar = this.f59749c;
        com.garmin.android.apps.connectmobile.settings.devices.wifi.b bVar2 = this.f59748b;
        switch (i14) {
            case 0:
                com.garmin.android.apps.connectmobile.settings.devices.wifi.b.C0803b c0803b = com.garmin.android.apps.connectmobile.settings.devices.wifi.b.f43259w;
                bVar2.z6(bVar);
                if (!eVar.b()) {
                    com.garmin.android.apps.connectmobile.settings.devices.wifi.b.a aVar = bVar2.f43262c;
                    aVar.getClass();
                    kVar.getClass();
                    aVar.K1();
                    com.garmin.android.apps.connectmobile.settings.devices.wifi.b.w6(bVar2, com.garmin.android.apps.connectmobile.settings.devices.wifi.b.v6(bVar2, eVar));
                } else {
                    com.garmin.android.apps.connectmobile.settings.devices.wifi.m mVar = bVar2.f43263d;
                    mVar.getClass();
                    mVar.d(eVar);
                    com.garmin.android.apps.connectmobile.settings.devices.wifi.b.a aVar2 = bVar2.f43262c;
                    aVar2.getClass();
                    kVar.getClass();
                    aVar2.g7();
                    bVar2.C6(true);
                }
                break;
            default:
                com.garmin.android.apps.connectmobile.settings.devices.wifi.b.C0803b c0803b2 = com.garmin.android.apps.connectmobile.settings.devices.wifi.b.f43259w;
                bVar2.z6(bVar);
                if (!eVar.b()) {
                    com.garmin.android.apps.connectmobile.settings.devices.wifi.b.a aVar3 = bVar2.f43262c;
                    aVar3.getClass();
                    String str = kVar.f43320a;
                    aVar3.K1();
                    String strV6 = com.garmin.android.apps.connectmobile.settings.devices.wifi.b.v6(bVar2, eVar);
                    if (eVar.f43297c != com.garmin.android.apps.connectmobile.settings.devices.wifi.e.f43293f) {
                        com.garmin.android.apps.connectmobile.settings.devices.wifi.b.w6(bVar2, strV6);
                    } else {
                        bVar2.y6(kVar, strV6, bVar);
                    }
                } else {
                    com.garmin.android.apps.connectmobile.settings.devices.wifi.m mVar2 = bVar2.f43263d;
                    mVar2.getClass();
                    mVar2.d(eVar);
                    com.garmin.android.apps.connectmobile.settings.devices.wifi.b.a aVar4 = bVar2.f43262c;
                    aVar4.getClass();
                    String str2 = kVar.f43320a;
                    aVar4.g7();
                    bVar2.C6(true);
                }
                break;
        }
    }
}
