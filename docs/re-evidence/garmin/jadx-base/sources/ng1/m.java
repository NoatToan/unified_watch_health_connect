package ng1;

import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;

/* JADX INFO: loaded from: classes10.dex */
public class m implements com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b<nr0.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.settings.devices.a f125971a;

    public m(com.garmin.android.apps.connectmobile.settings.devices.a aVar) {
        this.f125971a = aVar;
    }

    @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
    public final void onComplete(long j8, com.garmin.android.library.backgroundtaskmanagement.b.c cVar) {
        com.garmin.android.apps.connectmobile.settings.devices.a aVar = this.f125971a;
        com.garmin.android.apps.connectmobile.g1.b(aVar, cVar);
        aVar.f42507w.remove(Long.valueOf(j8));
        aVar.hideProgressOverlay();
    }

    @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
    public final void onResults(long j8, com.garmin.android.library.backgroundtaskmanagement.b.e eVar, nr0.a aVar) {
        nr0.a aVar2 = aVar;
        com.garmin.android.apps.connectmobile.settings.devices.a aVar3 = this.f125971a;
        aVar3.f42506v = aVar2;
        DeviceSettingsDTO deviceSettingsDTO = aVar3.f125985k;
        if (deviceSettingsDTO != null) {
            deviceSettingsDTO.f33879j1 = aVar2;
            com.garmin.android.apps.connectmobile.settings.devices.a.pa(aVar3.f42505t, deviceSettingsDTO);
        }
    }
}
