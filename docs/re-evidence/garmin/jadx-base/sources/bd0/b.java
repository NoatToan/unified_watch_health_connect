package bd0;

import com.garmin.android.apps.connectmobile.devices.setup.BLEDeviceSetupActivity;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class b implements com.garmin.android.apps.connectmobile.devices.setup.a.InterfaceC0580a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BLEDeviceSetupActivity f17531b;

    public /* synthetic */ b(BLEDeviceSetupActivity bLEDeviceSetupActivity, int i14) {
        this.f17530a = i14;
        this.f17531b = bLEDeviceSetupActivity;
    }

    @Override // com.garmin.android.apps.connectmobile.devices.setup.a.InterfaceC0580a
    public final void a(boolean z14) {
        switch (this.f17530a) {
            case 0:
                BLEDeviceSetupActivity.ca(this.f17531b, z14);
                break;
            default:
                BLEDeviceSetupActivity.da(this.f17531b, z14);
                break;
        }
    }
}
