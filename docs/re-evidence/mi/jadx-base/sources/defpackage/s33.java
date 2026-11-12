package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.os.Build;
import com.xiaomi.fitness.common.extensions.PermissionExtKt;
import com.xiaomi.miot.core.BluetoothExtKt;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public class s33 {
    public static int a() {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter != null) {
            return defaultAdapter.getState();
        }
        return 10;
    }

    public static Set<BluetoothDevice> b() {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter != null) {
            return defaultAdapter.getBondedDevices();
        }
        return null;
    }

    public static BluetoothDevice c(String str) {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter != null) {
            return defaultAdapter.getRemoteDevice(str);
        }
        return null;
    }

    public static boolean d() {
        return Build.VERSION.SDK_INT < 31 || PermissionExtKt.isPermissionGranted(BluetoothExtKt.getContext(), "android.permission.BLUETOOTH_CONNECT");
    }

    public static boolean e() {
        return a() == 12;
    }

    public static boolean f() {
        try {
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            if (defaultAdapter != null) {
                return defaultAdapter.enable();
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean g(String str) {
        BluetoothDevice bluetoothDeviceC = c(str);
        if (bluetoothDeviceC != null) {
            try {
                return ((Boolean) bluetoothDeviceC.getClass().getMethod("removeBond", new Class[0]).invoke(bluetoothDeviceC, new Object[0])).booleanValue();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false;
    }
}
