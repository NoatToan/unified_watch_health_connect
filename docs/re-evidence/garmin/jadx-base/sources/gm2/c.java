package gm2;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothDevice;
import bd0.d0;
import com.garmin.device.datatypes.DeviceProfile;
import lm2.g;
import lm2.h;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lgm2/c;", "Lgm2/d;", "device-pairing-gdi_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c implements d {
    @Override // hk2.d
    public final void a(String str) {
        str.getClass();
        ((fm2.c) h.c()).d(-1L, str, true);
    }

    @Override // gm2.d
    @SuppressLint({"MissingPermission"})
    public final dk2.d b(DeviceProfile deviceProfile, BluetoothDevice bluetoothDevice) {
        String name;
        String strK;
        bluetoothDevice.getClass();
        if (deviceProfile != null) {
            try {
                if (s.g(deviceProfile.getMacAddress(), bluetoothDevice.getAddress())) {
                    String deviceFullName = deviceProfile.getDeviceFullName();
                    if (deviceFullName == null || deviceFullName.length() == 0) {
                        name = bluetoothDevice.getName();
                        name.getClass();
                    } else {
                        name = deviceProfile.getDeviceFullName();
                        name.getClass();
                    }
                    String str = name;
                    try {
                        b bVar = b.f78015a;
                        String strValueOf = String.valueOf(deviceProfile.getF172495c());
                        bVar.getClass();
                        strValueOf.getClass();
                        strK = ((fm2.c) h.c()).k(strValueOf);
                    } catch (Exception unused) {
                        strK = null;
                    }
                    String address = bluetoothDevice.getAddress();
                    address.getClass();
                    return new dk2.d(str, address, String.valueOf(deviceProfile.getF172495c()), bluetoothDevice, null, null, null, Long.valueOf(deviceProfile.getF172494b()), strK, null, deviceProfile.getF172502j(), null, 2672, null);
                }
            } catch (Exception unused2) {
                return null;
            }
        }
        return null;
    }

    @Override // hk2.d
    public final void c(BluetoothDevice bluetoothDevice, hk2.b.C1669b c1669b) {
        bluetoothDevice.getClass();
        try {
            g gVarC = h.c();
            String address = bluetoothDevice.getAddress();
            address.getClass();
            ((d0) gVarC).b(address, new e(c1669b, bluetoothDevice, this));
        } catch (Exception e4) {
            String address2 = bluetoothDevice.getAddress();
            address2.getClass();
            c1669b.c(address2, "Failed to start probe: " + e4.getMessage());
        }
    }
}
