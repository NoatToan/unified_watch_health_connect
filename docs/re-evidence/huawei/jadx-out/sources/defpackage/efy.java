package defpackage;

import android.bluetooth.BluetoothDevice;
import android.text.TextUtils;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes7.dex */
public class efy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile efy f32913a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f32914c = new Object();
    private final Map<String, WeakReference<efx>> e = new ConcurrentHashMap();

    private efy() {
    }

    public static efy c() {
        if (f32913a == null) {
            synchronized (f32914c) {
                if (f32913a == null) {
                    f32913a = new efy();
                }
            }
        }
        return f32913a;
    }

    public efx a(BluetoothDevice bluetoothDevice) {
        if (bluetoothDevice == null || TextUtils.isEmpty(bluetoothDevice.getAddress())) {
            LogUtil.j("BleDeviceManager", "device or mac address is null");
            return null;
        }
        WeakReference<efx> weakReference = this.e.get(bluetoothDevice.getAddress());
        if (weakReference == null || weakReference.get() == null) {
            weakReference = new WeakReference<>(new efx(bluetoothDevice));
        }
        LogUtil.a("BleDeviceManager", "getBleDevice, device:", Integer.valueOf(System.identityHashCode(weakReference.get())));
        this.e.put(bluetoothDevice.getAddress(), weakReference);
        return weakReference.get();
    }

    public void b(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("BleDeviceManager", "mac address is null");
            return;
        }
        WeakReference<efx> weakReferenceRemove = this.e.remove(str);
        if (weakReferenceRemove != null) {
            ReleaseLogUtil.d("R_BleDeviceManager", "release device:", Integer.valueOf(System.identityHashCode(weakReferenceRemove.get())));
        }
    }
}
