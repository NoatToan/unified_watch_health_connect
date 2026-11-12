package di1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001¨\u0006\u0003"}, d2 = {"Ldi1/f;", "Lcom/garmin/android/library/backgroundtaskmanagement/b$b;", "", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f implements com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b<Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.settings.devices.wifi.b f59752a;

    public f(com.garmin.android.apps.connectmobile.settings.devices.wifi.b bVar) {
        this.f59752a = bVar;
    }

    @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
    public final void onComplete(long j8, com.garmin.android.library.backgroundtaskmanagement.b.c cVar) {
        cVar.getClass();
    }

    @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
    public final void onResults(long j8, com.garmin.android.library.backgroundtaskmanagement.b.e eVar, Object obj) {
        eVar.getClass();
        obj.getClass();
        com.garmin.android.apps.connectmobile.settings.devices.wifi.b bVar = this.f59752a;
        if (com.garmin.android.apps.connectmobile.settings.devices.wifi.b.u6(bVar)) {
            bVar.requireActivity().runOnUiThread(new df.d(3, obj, bVar));
        }
    }
}
