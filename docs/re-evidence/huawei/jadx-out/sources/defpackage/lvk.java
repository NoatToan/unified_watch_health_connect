package defpackage;

import com.huawei.callback.BluetoothDataReceiveCallback;
import com.huawei.callback.DeviceStatusCallback;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.ReleaseLogUtil;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class lvk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f40903a = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Map<Integer, BluetoothDataReceiveCallback> f40904c = new HashMap(16);
    private static Map<String, DeviceStatusCallback> d = new HashMap(16);
    private static IBaseResponseCallback e;

    public static IBaseResponseCallback e() {
        return e;
    }

    public static BluetoothDataReceiveCallback a(int i) {
        BluetoothDataReceiveCallback bluetoothDataReceiveCallback;
        ReleaseLogUtil.c("DEVMGR_ServiceCallback", "Enter getManagerCallback method. moduleId=" + i);
        synchronized (f40903a) {
            bluetoothDataReceiveCallback = f40904c.containsKey(Integer.valueOf(i)) ? f40904c.get(Integer.valueOf(i)) : null;
        }
        return bluetoothDataReceiveCallback;
    }

    public static void e(int i, BluetoothDataReceiveCallback bluetoothDataReceiveCallback) {
        LogUtil.a("ServiceCallback", "Enter registerManagerCallback method. serviceId=" + i);
        if (lvb.e().e(i) || lvb.e().d(i)) {
            ReleaseLogUtil.c("DEVMGR_ServiceCallback", "registerManagerCallback is,", Integer.valueOf(i));
        }
        synchronized (f40903a) {
            if (f40904c.get(Integer.valueOf(i)) != null) {
                LogUtil.e("ServiceCallback", "sManagersCallbackMap.get(serviceId) != null");
                f40904c.remove(Integer.valueOf(i));
            }
            f40904c.put(Integer.valueOf(i), bluetoothDataReceiveCallback);
        }
    }

    public static void e(int i) {
        LogUtil.a("ServiceCallback", "Enter unregisterBaseResponseCallback method. serviceId=" + i);
        if (lvb.e().e(i) || lvb.e().d(i)) {
            ReleaseLogUtil.c("DEVMGR_ServiceCallback", "unregisterManagerResponseCallback is,", Integer.valueOf(i));
        }
        synchronized (f40903a) {
            f40904c.remove(Integer.valueOf(i));
        }
    }

    public static void b(String str, DeviceStatusCallback deviceStatusCallback) {
        LogUtil.a("ServiceCallback", "Enter registerDeviceStatusCallback method. moduleName: ", str);
        synchronized (f40903a) {
            if (d.get(str) != null) {
                LogUtil.a("ServiceCallback", "sDeviceConnectCallbackMap.get(moduleName) != null");
                d.remove(str);
            }
            d.put(str, deviceStatusCallback);
        }
    }

    public static void c(String str) {
        LogUtil.a("ServiceCallback", "Enter unregisterDeviceConnectedCallback method. moduleName: ", str);
        synchronized (f40903a) {
            d.remove(str);
        }
    }

    public static Map<String, DeviceStatusCallback> c() {
        return d;
    }
}
