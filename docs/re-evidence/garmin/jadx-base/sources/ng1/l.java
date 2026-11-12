package ng1;

import com.garmin.android.apps.connectmobile.settings.model.UserSettingsDTO;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes10.dex */
public class l implements com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b<UserSettingsDTO> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.settings.devices.a f125960a;

    public l(com.garmin.android.apps.connectmobile.settings.devices.a aVar) {
        this.f125960a = aVar;
    }

    @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
    public final void onComplete(long j8, com.garmin.android.library.backgroundtaskmanagement.b.c cVar) {
        com.garmin.android.apps.connectmobile.settings.devices.a aVar = this.f125960a;
        aVar.f42507w.remove(Long.valueOf(j8));
        aVar.hideProgressOverlay();
        if (cVar == com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS) {
            ((zb0.d0) KoinJavaComponent.get(zb0.d0.class)).U(aVar.f125976b);
        }
    }

    @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
    public final void onResults(long j8, com.garmin.android.library.backgroundtaskmanagement.b.e eVar, UserSettingsDTO userSettingsDTO) {
        UserSettingsDTO userSettingsDTO2 = userSettingsDTO;
        com.garmin.android.apps.connectmobile.settings.devices.a aVar = this.f125960a;
        aVar.f42504k0 = userSettingsDTO2;
        aVar.H0 = userSettingsDTO2.t1();
    }
}
