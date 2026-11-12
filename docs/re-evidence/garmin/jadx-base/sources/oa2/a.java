package oa2;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.text.TextUtils;
import java.util.Set;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* JADX INFO: loaded from: classes7.dex */
@SuppressLint({"MissingPermission"})
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Logger f131085a = LoggerFactory.getLogger("GDI#BluetoothUtils");

    public static BluetoothAdapter a(Context context) {
        BluetoothAdapter adapter;
        if (context != null) {
            try {
                adapter = ((BluetoothManager) context.getSystemService("bluetooth")).getAdapter();
            } catch (Throwable unused) {
                return BluetoothAdapter.getDefaultAdapter();
            }
        } else {
            adapter = null;
        }
        return adapter != null ? adapter : BluetoothAdapter.getDefaultAdapter();
    }

    public static boolean b(Context context) {
        BluetoothAdapter bluetoothAdapterA = a(context);
        return bluetoothAdapterA != null && bluetoothAdapterA.isEnabled();
    }

    public static boolean c(String str) {
        BluetoothAdapter defaultAdapter;
        Set<BluetoothDevice> bondedDevices;
        if (TextUtils.isEmpty(str) || (defaultAdapter = BluetoothAdapter.getDefaultAdapter()) == null || (bondedDevices = defaultAdapter.getBondedDevices()) == null || bondedDevices.isEmpty()) {
            return false;
        }
        for (BluetoothDevice bluetoothDevice : bondedDevices) {
            if (bluetoothDevice != null && bluetoothDevice.getAddress().equalsIgnoreCase(str)) {
                f131085a.debug("isDeviceCurrentlyBonded: Yes!");
                return true;
            }
        }
        return false;
    }
}
