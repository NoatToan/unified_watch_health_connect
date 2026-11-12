package ng1;

import com.garmin.android.apps.connectmobile.settings.devices.VivomoveDeviceSettings;

/* JADX INFO: loaded from: classes10.dex */
public class d1 implements com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ VivomoveDeviceSettings f125922a;

    public d1(VivomoveDeviceSettings vivomoveDeviceSettings) {
        this.f125922a = vivomoveDeviceSettings;
    }

    @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
    public final void onComplete(long j8, com.garmin.android.library.backgroundtaskmanagement.b.c cVar) {
        this.f125922a.hideProgressOverlay();
    }

    @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
    public final void onResults(long j8, com.garmin.android.library.backgroundtaskmanagement.b.e eVar, Object obj) {
    }
}
