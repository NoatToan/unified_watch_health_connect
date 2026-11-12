package defpackage;

import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.appcompat.app.AppCompatDelegate;
import com.huawei.devicesdk.callback.BtDeviceHfpStateCallback;
import com.huawei.devicesdk.callback.BtSwitchCallback;
import com.huawei.devicesdk.entity.ConnectMode;
import com.huawei.devicesdk.entity.DeviceInfo;
import com.huawei.devicesdk.entity.ExternalDeviceCapability;
import com.huawei.devicesdk.reconnect.BleReconnectScanCallback;
import com.huawei.haf.application.BroadcastManager;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.unitedevice.entity.UniteDevice;
import com.huawei.watchface.api.HwWatchFaceApi;
import health.compact.a.CommonUtil;
import health.compact.a.LogUtil;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.SharedPreferenceManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public class cno {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<String> f1856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final BtSwitchCallback f1857b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final BleReconnectScanCallback f1858c;
    private Map<String, DeviceInfo> d;
    private Map<String, DeviceInfo> e;
    private BroadcastReceiver f;
    private coi g;
    private boolean h;
    private Map<String, Boolean> i;
    private final BtDeviceHfpStateCallback j;
    private long o;

    private cno() {
        this.o = 0L;
        this.i = new HashMap(16);
        this.f1856a = new ArrayList(5);
        this.d = new ConcurrentHashMap(4);
        this.e = new ConcurrentHashMap(4);
        BtSwitchCallback btSwitchCallback = new BtSwitchCallback() { // from class: cno.5
            @Override // com.huawei.devicesdk.callback.BtSwitchCallback
            public void onBtSwitchStateCallback(int i) {
                if (i == 1) {
                    ReleaseLogUtil.c("DEVMGR_ReconnectManager", "BLUETOOTH_STATE_OFF!");
                    cno.this.g();
                    return;
                }
                if (i == 2) {
                    ReleaseLogUtil.c("DEVMGR_ReconnectManager", "BLUETOOTH_STATE_TURNING_OFF!");
                    return;
                }
                if (i != 3) {
                    if (i != 4) {
                        return;
                    }
                    ReleaseLogUtil.c("DEVMGR_ReconnectManager", "BLUETOOTH_STATE_TURNING_ON!");
                } else {
                    ReleaseLogUtil.c("DEVMGR_ReconnectManager", "BLUETOOTH_STATE_ON!");
                    cno.this.f();
                    new Timer().schedule(new TimerTask() { // from class: cno.5.3
                        @Override // java.util.TimerTask, java.lang.Runnable
                        public void run() {
                            ReleaseLogUtil.c("DEVMGR_ReconnectManager", "BLUETOOTH_STATE_ON. reconnect br devices.");
                            cno.this.i();
                        }
                    }, 10000L);
                }
            }
        };
        this.f1857b = btSwitchCallback;
        this.f = new BroadcastReceiver() { // from class: cno.4
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                if (intent == null) {
                    return;
                }
                String action = intent.getAction();
                LogUtil.b("ReconnectManager", "mForegroundStatusChangeReceiver action: ", action);
                if (action == null) {
                    return;
                }
                if (HwWatchFaceApi.ACTION_FOREGROUND_STATUS.equals(action)) {
                    boolean booleanExtra = intent.getBooleanExtra("isForeground", false);
                    ReleaseLogUtil.c("DEVMGR_ReconnectManager", "ForegroundStatus isForeground: ", Boolean.valueOf(booleanExtra));
                    if (cno.this.h == booleanExtra) {
                        return;
                    }
                    cno.this.h = booleanExtra;
                    if (cno.this.h) {
                        if (Math.abs(System.currentTimeMillis() - cno.this.o) < 60000) {
                            LogUtil.e("ReconnectManager", "startAllReconnect less one minutes, return");
                            return;
                        }
                        cqp.a(100083, "", "", "");
                        cno.this.o = System.currentTimeMillis();
                        ReleaseLogUtil.c("DEVMGR_ReconnectManager", "ForegroundStatus startAllReconnect");
                        cno.this.e(2);
                        return;
                    }
                    return;
                }
                LogUtil.e("ReconnectManager", "mForegroundStatusChangeReceiver other action");
            }
        };
        BtDeviceHfpStateCallback btDeviceHfpStateCallback = new BtDeviceHfpStateCallback() { // from class: cno.2
            @Override // com.huawei.devicesdk.callback.BtDeviceHfpStateCallback
            public void onBtDeviceHfpConnected(BluetoothDevice bluetoothDevice, String str) {
                if (bluetoothDevice != null) {
                    try {
                        if (!TextUtils.isEmpty(bluetoothDevice.getAddress())) {
                            DeviceInfo deviceInfoJ = cnk.c().j(bluetoothDevice.getAddress());
                            if (deviceInfoJ == null) {
                                ReleaseLogUtil.d("DEVMGR_ReconnectManager", "deviceInfo is null, onBtDeviceHfpConnected fail.");
                                return;
                            }
                            if (!cpt.a(deviceInfoJ.getDeviceName(), deviceInfoJ.getDeviceMac())) {
                                ReleaseLogUtil.d("DEVMGR_ReconnectManager", "onBTDeviceHFPConnected Br device connect too often.");
                                return;
                            }
                            int deviceBtType = deviceInfoJ.getDeviceBtType();
                            ReleaseLogUtil.c("DEVMGR_ReconnectManager", "Enter onBtDeviceHfpConnected.", cpl.a(bluetoothDevice.getAddress()), ",btType:", Integer.valueOf(deviceBtType));
                            if (!"android.bluetooth.device.action.ACL_CONNECTED".equals(str)) {
                                if (deviceBtType == 1 || deviceBtType == 2) {
                                    ReleaseLogUtil.c("DEVMGR_ReconnectManager", "onBTDeviceHFPConnected. type: ", Integer.valueOf(deviceBtType));
                                    cno.this.a(bluetoothDevice, 2);
                                    return;
                                }
                                return;
                            }
                            String deviceBtMode = deviceInfoJ.getDeviceBtMode();
                            ReleaseLogUtil.c("DEVMGR_ReconnectManager", "onBTDeviceHFPConnected device manufacture:", deviceBtMode);
                            if (cno.this.b(deviceBtType, deviceBtMode)) {
                                ReleaseLogUtil.c("DEVMGR_ReconnectManager", "onBTDeviceHFPConnected connect diana or ble05 device.");
                                cno.this.a(bluetoothDevice, 1);
                                return;
                            }
                            return;
                        }
                    } catch (SecurityException e) {
                        LogUtil.d("ReconnectManager", "connect SecurityException ", ExceptionUtils.c(e));
                        return;
                    }
                }
                LogUtil.e("ReconnectManager", "btDevice is invalid, onBtDeviceHfpConnected fail.");
            }
        };
        this.j = btDeviceHfpStateCallback;
        this.f1858c = new BleReconnectScanCallback() { // from class: cno.3
            @Override // com.huawei.devicesdk.reconnect.BleReconnectScanCallback
            public void onLeScan(BluetoothDevice bluetoothDevice, int i, byte[] bArr) {
                ReleaseLogUtil.c("DEVMGR_ReconnectManager", "Enter onLeScan, find want device.");
                try {
                    Boolean bool = (Boolean) cno.this.i.get(bluetoothDevice.getAddress());
                    if (bool != null && bool.booleanValue()) {
                        LogUtil.b("ReconnectManager", "gatt connect timeout scanned the device, report");
                        cno.this.i.put(bluetoothDevice.getAddress(), false);
                        cqp.a(100094, cqc.a((Object) bluetoothDevice.getName()), "", "1");
                    }
                    cno.this.a(bluetoothDevice, 3);
                } catch (SecurityException e) {
                    LogUtil.d("ReconnectManager", "mBleScanCallback SecurityException ", ExceptionUtils.c(e));
                }
            }
        };
        LogUtil.b("DEVMGR_ReconnectManager", "ReconnectManager onCreate");
        coi coiVarB = coi.b();
        this.g = coiVarB;
        coiVarB.a(btDeviceHfpStateCallback);
        this.g.d(btSwitchCallback);
        this.g.i();
        BroadcastManager.d(this.f);
    }

    public Map<String, Boolean> b() {
        return this.i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(int i, String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if ("010303".equals(str) && i == 1) {
            return true;
        }
        return "010505".equals(str) && i == 2;
    }

    public static cno a() {
        return a.d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(BluetoothDevice bluetoothDevice, int i) {
        if (bluetoothDevice == null || TextUtils.isEmpty(bluetoothDevice.getAddress())) {
            LogUtil.e("ReconnectManager", "btDevice is invalid, connect fail.");
        } else {
            ReleaseLogUtil.c("DEVMGR_ReconnectManager", "ready to connect device is ", cpl.e(bluetoothDevice.getAddress()), "reconnectType: ", Integer.valueOf(i));
            c(cnk.c().j(bluetoothDevice.getAddress()));
        }
    }

    public void e(int i) {
        if (!cok.d().e()) {
            LogUtil.e("ReconnectManager", "startAllReconnect bt switch is off");
            return;
        }
        int iC = SharedPreferenceManager.c(String.valueOf(10024), "cloneSceneForProcessReconnect", 0);
        LogUtil.b("ReconnectManager", "startAllReconnect canReconnectMark: ", Integer.valueOf(iC), " triggeringScenario: ", Integer.valueOf(i));
        if (iC == 1) {
            boolean zQ = CommonUtil.q(BaseApplication.getContext());
            LogUtil.b("ReconnectManager", "startAllReconnect isMainProcessRunning: ", Boolean.valueOf(zQ));
            if (!zQ && i == 1) {
                return;
            } else {
                SharedPreferenceManager.d(String.valueOf(10024), "cloneSceneForProcessReconnect", 0);
            }
        }
        ReleaseLogUtil.c("DEVMGR_ReconnectManager", "Enter startAllReconnect.");
        i();
        cnr.d().a(this.f1858c, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        ArrayList<DeviceInfo> arrayList = new ArrayList(4);
        for (DeviceInfo deviceInfo : this.e.values()) {
            if ("main_relationship".equals(xgx.d().getDeviceRelation(deviceInfo.getDeviceMac()))) {
                LogUtil.b("ReconnectManager", "start reconnect main_relationship.", cpl.a(deviceInfo));
                c(deviceInfo);
            } else {
                arrayList.add(deviceInfo);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        Collections.sort(arrayList, new Comparator<DeviceInfo>() { // from class: cno.1
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public int compare(DeviceInfo deviceInfo2, DeviceInfo deviceInfo3) {
                return deviceInfo2.getLastConnectedTime() >= deviceInfo3.getLastConnectedTime() ? -1 : 1;
            }
        });
        Set<String> setB = cok.d().b();
        for (DeviceInfo deviceInfo2 : arrayList) {
            if (deviceInfo2 != null && !TextUtils.isEmpty(deviceInfo2.getDeviceMac()) && setB.contains(deviceInfo2.getDeviceMac())) {
                LogUtil.b("ReconnectManager", "start reconnect br device.", cpl.a(deviceInfo2));
                c(deviceInfo2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        ReleaseLogUtil.c("DEVMGR_ReconnectManager", "startBleReconnect start reconnect ble device.");
        cnr.d().a(this.f1858c, 3);
    }

    public void d(DeviceInfo deviceInfo, int i) {
        if (deviceInfo == null || deviceInfo.getDeviceBtType() != 2) {
            return;
        }
        if (!deviceInfo.isUsing()) {
            ReleaseLogUtil.d("DEVMGR_ReconnectManager", "current device is not using");
            return;
        }
        String strC = cpx.c(deviceInfo.getDeviceMac());
        ReleaseLogUtil.c("DEVMGR_ReconnectManager", "connect reason is ", Integer.valueOf(i), " relation is ", strC);
        int i2 = i % 1000;
        if (i2 == 133) {
            cnr.d().e(300000L);
            return;
        }
        if (i2 == 304) {
            this.i.put(deviceInfo.getDeviceMac(), true);
            cnr.d().e();
            return;
        }
        ExternalDeviceCapability externalDeviceCapabilityB = cnk.c().b(deviceInfo.getDeviceMac());
        UniteDevice uniteDevice = new UniteDevice();
        uniteDevice.setIdentify(deviceInfo.getDeviceMac());
        uniteDevice.setCapability(externalDeviceCapabilityB);
        boolean zB = col.b(uniteDevice, AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY);
        LogUtil.b("ReconnectManager", "reconnectDevice isSupportMulti: ", Boolean.valueOf(zB));
        if (cop.f() && ("main_relationship".equalsIgnoreCase(strC) || zB || deviceInfo.getDeviceType() == 275)) {
            ReleaseLogUtil.d("DEVMGR_ReconnectManager", "current device is start all scan");
            cnr.d().b(true);
            cnr.d().e(5000L);
            this.f1856a.add(deviceInfo.getDeviceMac());
            return;
        }
        cnr.d().e();
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.e("ReconnectManager", "removeDisconnectDevices mac is empty.");
            return;
        }
        if (this.f1856a.size() > 0) {
            if (this.f1856a.contains(str)) {
                this.f1856a.remove(str);
            }
            if (this.f1856a.size() == 0 && cnr.d().a()) {
                cnr.d().g();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        cnr.d().j();
    }

    public void c(DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            LogUtil.e("ReconnectManager", "device info is invalid.");
            return;
        }
        if (!cok.d().e()) {
            LogUtil.e("ReconnectManager", "start reconnect and the bt switch is off");
            return;
        }
        cmo cmoVarF = cnk.c().f(deviceInfo.getDeviceMac());
        if (cmoVarF == null) {
            LogUtil.b("ReconnectManager", "device status is incorrect.");
            return;
        }
        if (deviceInfo.isUsing() && cmoVarF.b() == ConnectMode.GENERAL) {
            int deviceConnectState = deviceInfo.getDeviceConnectState();
            ReleaseLogUtil.c("DEVMGR_ReconnectManager", "start reconnect device.", cpl.e(deviceInfo), " deviceConnectState: ", Integer.valueOf(deviceConnectState));
            if (deviceConnectState == 2 || deviceConnectState == 1 || deviceConnectState == 9 || deviceConnectState == 13 || deviceConnectState == 10 || deviceConnectState == 14 || deviceConnectState == 11) {
                LogUtil.b("ReconnectManager", "start reconnect device, but the device connect status is ", Integer.valueOf(deviceInfo.getDeviceConnectState()));
                return;
            } else {
                d();
                cju.d().connectDevice(deviceInfo, true, ConnectMode.GENERAL);
                return;
            }
        }
        boolean zIsUsing = deviceInfo.isUsing();
        ReleaseLogUtil.c("DEVMGR_ReconnectManager", " isUsing:", Boolean.valueOf(zIsUsing), " connectMode:", cmoVarF.b(), "The connected hfp is not wanted device, so stop to connect spp.");
    }

    private void d() {
        if (cop.c()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: cno.10
                @Override // java.lang.Runnable
                public void run() {
                    LogUtil.b("ReconnectManager", "PowerKitManager reconnectDevice request");
                    cpw.c("ReconnectManager", 65535, 30000L, "user-reconnectDevice");
                }
            });
        }
    }

    public void d(DeviceInfo deviceInfo) {
        if (deviceInfo == null || TextUtils.isEmpty(deviceInfo.getDeviceMac()) || !deviceInfo.isUsing()) {
            LogUtil.e("ReconnectManager", "addReconnectDevice device is null.");
            return;
        }
        LogUtil.b("ReconnectManager", "address: ", cpl.a(deviceInfo.getDeviceMac()), " isUsing: ", Boolean.valueOf(deviceInfo.isUsing()));
        cmo cmoVarF = cnk.c().f(deviceInfo.getDeviceMac());
        if (cmoVarF == null || cmoVarF.b() == null || cmoVarF.b() != ConnectMode.GENERAL) {
            ReleaseLogUtil.d("DEVMGR_ReconnectManager", "deviceStatus is null.");
            return;
        }
        if (deviceInfo.getDeviceBtType() == 2) {
            this.d.put(deviceInfo.getDeviceMac(), deviceInfo);
            clw.a(this.d.values());
            ReleaseLogUtil.c("DEVMGR_ReconnectManager", "reconnect ble device size is ", Integer.valueOf(this.d.size()));
        } else {
            this.e.put(deviceInfo.getDeviceMac(), deviceInfo);
            clw.b(this.e.values());
            ReleaseLogUtil.c("DEVMGR_ReconnectManager", "reconnect br device size is ", Integer.valueOf(this.e.size()));
        }
    }

    public void c() {
        LogUtil.b("ReconnectManager", "destroy enter.");
        BroadcastManager.n(this.f);
    }

    public void a(DeviceInfo deviceInfo) {
        ReleaseLogUtil.d("DEVMGR_ReconnectManager", "enter removeReconnectDevice");
        if (deviceInfo == null || TextUtils.isEmpty(deviceInfo.getDeviceMac())) {
            return;
        }
        this.e.remove(deviceInfo.getDeviceMac());
        this.d.remove(deviceInfo.getDeviceMac());
        clw.b(this.e.values());
        clw.a(this.d.values());
        this.i.remove(deviceInfo.getDeviceMac());
    }

    public void e(DeviceInfo deviceInfo) {
        ReleaseLogUtil.d("DEVMGR_ReconnectManager", "enter removeReconnectDevice");
        if (deviceInfo == null || TextUtils.isEmpty(deviceInfo.getDeviceMac())) {
            return;
        }
        this.e.remove(deviceInfo.getDeviceMac());
        this.d.remove(deviceInfo.getDeviceMac());
        this.i.remove(deviceInfo.getDeviceMac());
    }

    Map<String, DeviceInfo> e() {
        return this.d;
    }

    static class a {
        private static cno d = new cno();
    }
}
