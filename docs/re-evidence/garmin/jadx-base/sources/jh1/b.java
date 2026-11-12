package jh1;

import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.g1;
import com.garmin.android.apps.connectmobile.settings.devices.fr645.FR645ActivityTrackingSettingActivity;

/* JADX INFO: loaded from: classes10.dex */
public class b implements com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b<nr0.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FR645ActivityTrackingSettingActivity f98755a;

    public b(FR645ActivityTrackingSettingActivity fR645ActivityTrackingSettingActivity) {
        this.f98755a = fR645ActivityTrackingSettingActivity;
    }

    @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
    public final void onComplete(long j8, com.garmin.android.library.backgroundtaskmanagement.b.c cVar) {
        FR645ActivityTrackingSettingActivity fR645ActivityTrackingSettingActivity = this.f98755a;
        g1.b(fR645ActivityTrackingSettingActivity, cVar);
        fR645ActivityTrackingSettingActivity.C.remove(Long.valueOf(j8));
        fR645ActivityTrackingSettingActivity.hideProgressOverlay();
    }

    @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
    public final void onResults(long j8, com.garmin.android.library.backgroundtaskmanagement.b.e eVar, nr0.a aVar) {
        nr0.a aVar2 = aVar;
        FR645ActivityTrackingSettingActivity fR645ActivityTrackingSettingActivity = this.f98755a;
        fR645ActivityTrackingSettingActivity.f42997w = aVar2;
        DeviceSettingsDTO deviceSettingsDTO = fR645ActivityTrackingSettingActivity.f125985k;
        if (deviceSettingsDTO != null) {
            deviceSettingsDTO.f33879j1 = aVar2;
            fR645ActivityTrackingSettingActivity.ka();
            FR645ActivityTrackingSettingActivity.la(fR645ActivityTrackingSettingActivity.f42998x, fR645ActivityTrackingSettingActivity.f125985k);
        }
    }
}
