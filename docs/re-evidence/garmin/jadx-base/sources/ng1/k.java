package ng1;

import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class k implements m0, xg1.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f125954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.settings.devices.a f125955b;

    public /* synthetic */ k(com.garmin.android.apps.connectmobile.settings.devices.a aVar, int i14) {
        this.f125954a = i14;
        this.f125955b = aVar;
    }

    @Override // xg1.j
    public void a(nr0.a aVar) {
        int i14 = this.f125954a;
        com.garmin.android.apps.connectmobile.settings.devices.a aVar2 = this.f125955b;
        switch (i14) {
            case 1:
                int i15 = com.garmin.android.apps.connectmobile.settings.devices.a.Z0;
                aVar2.X = new com.garmin.android.apps.connectmobile.settings.devices.b(aVar2);
                aVar2.showProgressOverlay();
                fr0.a aVarM = fr0.a.M();
                com.garmin.android.apps.connectmobile.settings.devices.b bVar = aVar2.X;
                aVarM.getClass();
                aVar.getClass();
                aVar2.f42507w.add(Long.valueOf(com.garmin.android.library.backgroundtaskmanagement.c.d(new gr0.a(aVar, 0, aVarM), bVar)));
                break;
            case 2:
                int i16 = com.garmin.android.apps.connectmobile.settings.devices.a.Z0;
                aVar2.ra(aVar);
                break;
            default:
                int i17 = com.garmin.android.apps.connectmobile.settings.devices.a.Z0;
                aVar2.T = new com.garmin.android.apps.connectmobile.settings.devices.c(aVar2);
                aVar2.showProgressOverlay();
                fr0.a aVarM2 = fr0.a.M();
                com.garmin.android.apps.connectmobile.settings.devices.c cVar = aVar2.T;
                aVarM2.getClass();
                aVar.getClass();
                aVar2.f42507w.add(Long.valueOf(com.garmin.android.library.backgroundtaskmanagement.c.d(new gr0.a(aVar, 1, aVarM2), cVar)));
                break;
        }
    }

    @Override // ng1.m0
    public void b(com.garmin.android.apps.connectmobile.devices.model.k kVar) {
        int i14 = com.garmin.android.apps.connectmobile.settings.devices.a.Z0;
        DeviceSettingsDTO deviceSettingsDTO = this.f125955b.f125985k;
        if (deviceSettingsDTO != null) {
            deviceSettingsDTO.T0 = kVar;
            deviceSettingsDTO.S1("autoActivityDetect");
        }
    }
}
