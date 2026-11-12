package cd0;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.devices.setup.strategy.DeviceInfoDTONullException;
import com.garmin.android.apps.connectmobile.i2;

/* JADX INFO: loaded from: classes8.dex */
public class c0 extends f0 {
    @Override // cd0.c
    public final void J(byte[] bArr, boolean z14) {
        super.J(bArr, false);
    }

    @Override // cd0.f0, cd0.c
    public final void o(byte[] bArr) {
        try {
            L(this.f26794x);
        } catch (DeviceInfoDTONullException e4) {
            i2.f(a2.DEVICES, "GPSMap64SetupStrategy", "checkForFirmwareUpdate: " + e4.getMessage());
        }
    }
}
