package com.huami.watch.companion.bind;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.huami.watch.companion.CompanionApplication;
import com.huami.watch.companion.cloud.api.DeviceBindAPI;
import com.huami.watch.companion.device.Device;
import com.huami.watch.companion.device.DeviceManager;
import com.huami.watch.companion.device.DeviceSource;
import com.huami.watch.companion.device.DeviceUtil;
import com.huami.watch.companion.event.DeviceUnboundEvent;
import com.huami.watch.companion.usersettings.UserSettings;
import com.huami.watch.util.BTUtil;
import com.huami.watch.util.Log;
import com.huami.watch.util.Rx;
import com.huami.watch.util.RxBus;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes16.dex */
public class BindUtil {
    private static final String a = "Bind-Util";

    public class a implements Runnable {
        public final /* synthetic */ Context a;
        public final /* synthetic */ String b;

        public a(Context context, String str) {
            this.a = context;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            BindUtil.j(this.a, this.b);
        }
    }

    public static void a(Context context, String str) {
        Device deviceFind = DeviceManager.getManager(context).find(str);
        if (deviceFind != null) {
            activeDevice(context, deviceFind);
            return;
        }
        Log.w(a, "Find no Device : " + str + ", abort!!", new Object[0]);
    }

    public static void activeDevice(Context context, @NonNull Device device) {
        DeviceManager manager = DeviceManager.getManager(context);
        Device currentDevice = manager.getCurrentDevice();
        if (currentDevice != null) {
            manager.inactive(currentDevice);
        }
        manager.active(device);
        UserSettings.putString(context.getContentResolver(), "huami.watch.companion.phone.device.main", device.getCpuId());
    }

    public static void activeLastMainDevice(Context context) {
        String str = UserSettings.get(context.getContentResolver(), "huami.watch.companion.phone.device.main");
        Log.d(a, "Active Last MainDevice : " + str, new Object[0]);
        DeviceManager manager = DeviceManager.getManager(context);
        Device deviceFindByDeviceId = !TextUtils.isEmpty(str) ? manager.findByDeviceId(str) : null;
        if (deviceFindByDeviceId != null) {
            activeDevice(context, deviceFindByDeviceId);
            return;
        }
        Log.w(a, "Find no Device : " + str + ", to Active any one!!", new Object[0]);
        List<Device> all = manager.getAll();
        if (all.size() > 0) {
            activeDevice(context, all.get(0));
        }
    }

    public static boolean b(Context context, String str, Device device) {
        return device != null ? c(context, str, device.info().bleAuthKey, device.info().bleAuthAppIdMiFit) : c(context, str, null, true);
    }

    private static boolean c(Context context, String str, String str2, boolean z) {
        boolean zConnect;
        String string;
        boolean z2;
        if (TextUtils.isEmpty(str)) {
            zConnect = false;
        } else {
            if (TextUtils.isEmpty(str2)) {
                Log.w(a, "BleAuthKey is Empty, Reassign!!", new Object[0]);
                string = UUID.randomUUID().toString();
                z2 = true;
            } else {
                string = str2;
                z2 = false;
            }
            Log.d(a, "BleAuthAppId using MiFit: " + z, new Object[0]);
            zConnect = CompanionApplication.get().mBleConnection.connect(context, str, string, z2, z ? (byte) 0 : (byte) 14);
        }
        Log.d(a, "Connect BleDevice [" + str + "], Success: " + zConnect, new Object[0]);
        return zConnect;
    }

    public static void connectCurrentDevice(Context context) {
        Device currentDevice = DeviceManager.getManager(context).getCurrentDevice();
        Log.d(a, "Connect CurrentDevice: " + currentDevice, new Object[0]);
        if (currentDevice != null) {
            d(context, currentDevice);
        }
    }

    private static void d(Context context, @NonNull Device device) {
        String strAddress = device.address();
        if (DeviceSource.isSeriesEverest2(device)) {
            b(context, strAddress, device);
        } else {
            if (DeviceUtil.isLastBoundByIOS(device)) {
                return;
            }
            e(strAddress);
        }
    }

    public static void disconnectAllDevices(Context context) {
        ArrayList arrayList = new ArrayList(DeviceManager.getManager(context).getAll());
        Log.d(a, "Disconnect AllDevices : " + arrayList.size() + ", " + arrayList, new Object[0]);
        if (arrayList.size() > 0) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                disconnectDevice(((Device) it2.next()).address());
            }
        }
    }

    public static void disconnectDevice(String str) {
        disconnectDevice(str, false);
    }

    public static boolean e(String str) {
        boolean zBind = !TextUtils.isEmpty(str) ? CompanionApplication.get().mConnection.bind(str) : false;
        if (zBind) {
            CompanionApplication.get().checkConnected(str);
        }
        Log.d(a, "Connect Device [" + str + "], Success : " + zBind, new Object[0]);
        return zBind;
    }

    public static void f(Context context) {
        Device currentDevice = DeviceManager.getManager(context).getCurrentDevice();
        Log.i(a, "Disconnect CurrentDevice : " + currentDevice, new Object[0]);
        if (currentDevice != null) {
            disconnectDevice(currentDevice.address());
        }
    }

    private static void g(Context context) {
        List<Device> all = DeviceManager.getManager(context).getAll();
        if (all.size() > 0) {
            switchMainDevice(context, all.get(0).address());
        }
    }

    public static boolean h(Context context, Device device) {
        Log.d(a, "Sync device bound to Cloud : " + device, new Object[0]);
        if (device == null) {
            Log.w(a, "No bound device!!", new Object[0]);
            return false;
        }
        boolean zPostDeviceBindInfo = DeviceBindAPI.postDeviceBindInfo(context, device);
        if (zPostDeviceBindInfo) {
            device.setSyncedToCloud(true);
            DeviceManager.getManager(context).save(device);
        }
        Log.d(a, "Sync device to Cloud : " + device.address() + ", success : " + zPostDeviceBindInfo, new Object[0]);
        return zPostDeviceBindInfo;
    }

    public static boolean i(Context context, Device device) {
        Log.d(a, "Sync DeviceUnbound to Cloud : " + device, new Object[0]);
        return device == null || j(context, device.getCpuId());
    }

    public static boolean j(Context context, String str) {
        boolean zDeleteDeviceBindInfo = !TextUtils.isEmpty(str) ? DeviceBindAPI.deleteDeviceBindInfo(context, str) : true;
        Log.d(a, "Sync DeviceUnbound to Cloud : " + str + ", " + zDeleteDeviceBindInfo, new Object[0]);
        return zDeleteDeviceBindInfo;
    }

    public static void k(Context context, String str) {
        Log.i(a, "Unbind Device [" + str + "]", new Object[0]);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Log.i(a, "Unbind Device 1, Disconnect...", new Object[0]);
        disconnectDevice(str, true);
        DeviceManager manager = DeviceManager.getManager(context);
        Device deviceFind = manager.find(str);
        if (deviceFind != null) {
            Log.i(a, "Unbind Device 2, Remove : " + deviceFind, new Object[0]);
            String strAddress = deviceFind.address();
            boolean zIsActive = deviceFind.isActive();
            manager.remove(deviceFind);
            RxBus.get().post(new DeviceUnboundEvent(DeviceUtil.UNKNOWN_DID, strAddress, zIsActive, DeviceSource.isSeriesEverest2(deviceFind)));
        }
    }

    private static boolean l(Context context, String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            Log.d(a, "UnbindDeviceWithCloud is Empty, Abort : " + str, new Object[0]);
            return true;
        }
        Device deviceFind = DeviceManager.getManager(context).find(str);
        Log.d(a, "UnbindDeviceWithCloud : " + str + ", " + deviceFind + ", Async : " + z, new Object[0]);
        String cpuId = deviceFind != null ? deviceFind.getCpuId() : null;
        k(context, str);
        if (!TextUtils.isEmpty(cpuId)) {
            if (!z) {
                return j(context, cpuId);
            }
            Rx.io(new a(context, cpuId)).safeSubscribe();
            return true;
        }
        Log.w(a, "UnbindDeviceWithCloud : DeviceId is Empty, " + cpuId, new Object[0]);
        return true;
    }

    public static void switchMainDevice(Context context, String str) {
        Device deviceFind = DeviceManager.getManager(context).find(str);
        Log.i(a, "Switch MainDevice To : " + str + ", " + deviceFind, new Object[0]);
        if (TextUtils.isEmpty(str) || deviceFind == null) {
            return;
        }
        Device currentDevice = DeviceManager.getManager(context).getCurrentDevice();
        if (currentDevice != null && currentDevice.address().equals(str)) {
            Log.w(a, "Switch MainDevice, Already is MainDevice : " + currentDevice, new Object[0]);
        }
        f(context);
        activeDevice(context, deviceFind);
        d(context, deviceFind);
        BindCallback.a(context);
    }

    public static void switchOffMainDevice(Context context) {
        DeviceManager manager = DeviceManager.getManager(context);
        Device currentDevice = manager.getCurrentDevice();
        if (currentDevice == null) {
            Log.w(a, "SwitchOff MainDevice, There is no MainDevice, Abort!!", new Object[0]);
            return;
        }
        Log.d(a, "SwitchOff MainDevice!!", new Object[0]);
        f(context);
        manager.inactive(currentDevice);
    }

    public static void unbindCurrentDevice(Context context) {
        Device currentDevice = DeviceManager.getManager(context).getCurrentDevice();
        Log.d(a, "Unbind CurrentDevice : " + currentDevice, new Object[0]);
        if (currentDevice != null) {
            k(context, currentDevice.address());
        }
    }

    public static boolean unbindDeviceWithCloud(Context context, String str) {
        return l(context, str, true);
    }

    public static void disconnectDevice(String str, boolean z) {
        Log.d(a, "Disconnect Device [" + str + ", RemoveSystemPairing : " + z + "]", new Object[0]);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        CompanionApplication companionApplication = CompanionApplication.get();
        companionApplication.mConnection.unbind(str);
        if (z) {
            BTUtil.removeBond(str);
        }
        companionApplication.mBleConnection.disconnect(str);
        CompanionApplication.get().cancelCheckConnected(str);
    }
}
