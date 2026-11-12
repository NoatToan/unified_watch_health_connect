package com.garmin.android.apps.connectmobile.settings.devices.wifi;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.settings.GCMSettingManager;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/wifi/c;", "Lcom/garmin/android/library/backgroundtaskmanagement/b$b;", "", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c implements com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b<Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f43284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m.b f43285b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f43286c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f43287d;

    public c(b bVar, m.b bVar2, String str, boolean z14) {
        this.f43284a = bVar;
        this.f43285b = bVar2;
        this.f43286c = str;
        this.f43287d = z14;
    }

    @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
    public final void onComplete(long j8, com.garmin.android.library.backgroundtaskmanagement.b.c cVar) {
        cVar.getClass();
        b bVar = this.f43284a;
        if (b.u6(bVar)) {
            bVar.requireActivity().runOnUiThread(new at0.c(bVar, this.f43285b, cVar, this.f43286c, 10));
        }
    }

    @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
    public final void onResults(long j8, com.garmin.android.library.backgroundtaskmanagement.b.e eVar, Object obj) {
        eVar.getClass();
        obj.getClass();
        e eVar2 = (e) obj;
        i2.a aVar = i2.f36769a;
        aVar.getClass();
        i2.a.b(a2.SETTINGS, "DisplayWiFiNetworksFragment", "handleAddNewNetworkSelection.onResults: result=" + eVar2);
        boolean zB = eVar2.b();
        b bVar = this.f43284a;
        if (zB) {
            GCMSettingManager.T(bVar.f43264e, true);
        }
        if (b.u6(bVar)) {
            bVar.requireActivity().runOnUiThread(new a8.d(this.f43284a, this.f43285b, eVar2, this.f43286c, this.f43287d));
        }
    }
}
