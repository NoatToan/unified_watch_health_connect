package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothManager;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanFilter;
import android.bluetooth.le.ScanResult;
import android.bluetooth.le.ScanSettings;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.huawei.devicesdk.callback.DeviceScanCallback;
import com.huawei.devicesdk.callback.DeviceStatusChangeCallback;
import com.huawei.devicesdk.entity.DeviceInfo;
import com.huawei.devicesdk.entity.ScanMode;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.handler.HandlerCenter;
import com.huawei.health.device.open.data.model.HealthData;
import com.huawei.health.ecologydevice.callback.NfcMeasureCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.unitedevice.entity.UniteDevice;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: loaded from: classes7.dex */
public class ejo extends ejn {
    private static ejo h;
    private static final Object i = new Object();
    private BluetoothAdapter k;
    private BluetoothManager l;
    private BluetoothDevice m;
    private boolean o;
    private String r;
    private UniteDevice y;
    private boolean q = false;
    private boolean n = false;
    private ScanCallback s = new ScanCallback() { // from class: ejo.3
        @Override // android.bluetooth.le.ScanCallback
        public void onScanResult(int i2, ScanResult scanResult) {
            super.onScanResult(i2, scanResult);
            ejo.this.h();
            if (scanResult == null || scanResult.getDevice() == null) {
                LogUtil.a("RocheGlucoseManager", "result is null or result.getDevice is null");
                return;
            }
            try {
                LogUtil.a("RocheGlucoseManager", "get device in scanning: ", scanResult.getDevice().getName());
                ejo.this.a(scanResult.getDevice());
            } catch (SecurityException e) {
                LogUtil.e("RocheGlucoseManager", "onScanResult SecurityException:", ExceptionUtils.c(e));
            }
        }

        @Override // android.bluetooth.le.ScanCallback
        public void onBatchScanResults(List<ScanResult> list) {
            super.onBatchScanResults(list);
            LogUtil.a("RocheGlucoseManager", "onBatchScanResults : results=" + list.size());
        }

        @Override // android.bluetooth.le.ScanCallback
        public void onScanFailed(int i2) {
            super.onScanFailed(i2);
            LogUtil.a("RocheGlucoseManager", "onScanFailed : errorCode=" + i2);
        }
    };
    private DeviceScanCallback p = new DeviceScanCallback() { // from class: ejo.5
        @Override // com.huawei.devicesdk.callback.DeviceScanCallback
        public void scanResult(UniteDevice uniteDevice, byte[] bArr, String str, int i2) {
            LogUtil.a("RocheGlucoseManager", "device: ", uniteDevice, "status: ", Integer.valueOf(i2));
            if (i2 == 20 && uniteDevice != null) {
                String deviceName = uniteDevice.getDeviceInfo().getDeviceName();
                LogUtil.a("RocheGlucoseManager", "scanResult deviceName: ", deviceName);
                if (!TextUtils.isEmpty(deviceName)) {
                    if (ejo.this.o) {
                        return;
                    }
                    ejo.this.e(uniteDevice);
                    return;
                }
                LogUtil.j("RocheGlucoseManager", "deviceName is empty");
                return;
            }
            LogUtil.j("RocheGlucoseManager", "scanResult: " + i2);
        }
    };
    private DeviceStatusChangeCallback t = new DeviceStatusChangeCallback() { // from class: ejo.1
        @Override // com.huawei.devicesdk.callback.DeviceStatusChangeCallback
        public void onConnectStatusChanged(DeviceInfo deviceInfo, int i2, int i3) {
            LogUtil.a("RocheGlucoseManager", "device: ", deviceInfo.toString(), "status: ", Integer.valueOf(i2), "errCode: ", Integer.valueOf(i3));
            ejo.this.f33064b = 16;
            String deviceName = deviceInfo.getDeviceName();
            String deviceMac = deviceInfo.getDeviceMac();
            if (deviceName == null) {
                if (deviceMac == null || !deviceMac.equals(ejo.this.d)) {
                    LogUtil.j("RocheGlucoseManager", "not this bond device");
                    return;
                }
            } else if (!deviceName.equals(ejo.this.f33065c) && !deviceMac.equals(ejo.this.d)) {
                LogUtil.a("RocheGlucoseManager", "Ble pair failed: name and address are not equal");
                return;
            }
            if (i2 == 30) {
                LogUtil.a("RocheGlucoseManager", "bonded_device_success");
                ejo.this.f33064b = 16;
                emk.c().a(ejo.this.r);
                ejo.this.f = 12;
                enm.b(deviceMac, 1);
            } else if (i2 == 31) {
                LogUtil.a("RocheGlucoseManager", "bonded_device_ing");
                ejo.this.f33064b = 15;
                ejo.this.f = 11;
            } else if (i2 == 32) {
                LogUtil.a("RocheGlucoseManager", "bonded_device_failed");
                ejo.this.f33064b = 14;
                ejo.this.f = 10;
                emk.c().a(ejo.this.r);
            } else if (i2 == 33) {
                enm.b(deviceMac, 0);
            } else {
                LogUtil.a("RocheGlucoseManager", "unknown status", Integer.valueOf(i2));
            }
            ejo.this.b(106);
        }
    };

    public static ejo b() {
        ejo ejoVar;
        synchronized (i) {
            if (h == null) {
                h = new ejo();
            }
            ejoVar = h;
        }
        return ejoVar;
    }

    @Override // defpackage.ejn
    public boolean b(NfcMeasureCallback nfcMeasureCallback) {
        if (nfcMeasureCallback == null) {
            LogUtil.j("RocheGlucoseManager", "nfcMeasureCallback == null");
            return false;
        }
        super.b(nfcMeasureCallback);
        i();
        if (this.k != null) {
            LogUtil.a("RocheGlucoseManager", "Init already.");
            return true;
        }
        if (this.l == null) {
            Object systemService = BaseApplication.getContext().getSystemService("bluetooth");
            if (systemService instanceof BluetoothManager) {
                this.l = (BluetoothManager) systemService;
            }
        }
        BluetoothManager bluetoothManager = this.l;
        if (bluetoothManager == null) {
            LogUtil.e("RocheGlucoseManager", "Unable to initAdapter BluetoothManager.");
            return false;
        }
        BluetoothAdapter adapter = bluetoothManager.getAdapter();
        this.k = adapter;
        if (adapter != null) {
            return true;
        }
        LogUtil.e("RocheGlucoseManager", "Unable to obtain BluetoothAdapter.");
        return false;
    }

    private void i() {
        if (this.e == null) {
            this.e = HandlerCenter.b(new c(), "RocheGlucoseManager");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        if (this.j) {
            k();
        } else {
            a(true);
        }
    }

    private void k() {
        b(103, 5000L);
        if (this.g < 1) {
            b(104, 30000L);
        }
        this.o = false;
        emk.c().c(ScanMode.BLE, emk.c().a(this.f33065c, this.d), this.p);
    }

    private void a(boolean z) {
        b(103, 5000L);
        if (this.g < 1) {
            b(104, 30000L);
        }
        if (this.k != null && (!TextUtils.isEmpty(this.f33065c) || !TextUtils.isEmpty(this.d))) {
            LogUtil.a("RocheGlucoseManager", "SDK is higher than LOLLIPOP");
            if (z) {
                n();
                return;
            } else {
                l();
                return;
            }
        }
        LogUtil.d("RocheGlucoseManager", "scanBleDevice stop scan");
    }

    public void h() {
        if (this.q) {
            LogUtil.a("RocheGlucoseManager", "stopScanDevice ");
            this.q = false;
            try {
                BluetoothLeScanner bluetoothLeScanner = this.k.getBluetoothLeScanner();
                if (bluetoothLeScanner != null) {
                    bluetoothLeScanner.stopScan(this.s);
                }
                this.o = true;
            } catch (SecurityException e) {
                LogUtil.e("RocheGlucoseManager", "stopScanDevice SecurityException:", ExceptionUtils.c(e));
            }
        }
    }

    private void n() {
        ScanFilter scanFilterBuild;
        this.q = true;
        ArrayList arrayList = new ArrayList(10);
        if (!TextUtils.isEmpty(this.f33065c)) {
            scanFilterBuild = new ScanFilter.Builder().setDeviceName(this.f33065c).build();
        } else {
            scanFilterBuild = new ScanFilter.Builder().setDeviceAddress(this.d).build();
        }
        arrayList.add(scanFilterBuild);
        LogUtil.a("RocheGlucoseManager", "now scanner start scan");
        try {
            BluetoothLeScanner bluetoothLeScanner = this.k.getBluetoothLeScanner();
            if (bluetoothLeScanner != null) {
                bluetoothLeScanner.startScan(arrayList, new ScanSettings.Builder().setScanMode(1).build(), this.s);
            } else {
                LogUtil.e("RocheGlucoseManager", "scanner = null");
            }
        } catch (SecurityException e) {
            LogUtil.e("RocheGlucoseManager", "scanEnableBle SecurityException:", ExceptionUtils.c(e));
        }
    }

    private void l() {
        this.q = false;
        LogUtil.a("RocheGlucoseManager", "now scanner stop scan");
        try {
            BluetoothLeScanner bluetoothLeScanner = this.k.getBluetoothLeScanner();
            if (bluetoothLeScanner != null) {
                bluetoothLeScanner.stopScan(this.s);
            } else {
                LogUtil.a("RocheGlucoseManager", "null = scanner");
            }
        } catch (SecurityException e) {
            LogUtil.e("RocheGlucoseManager", "onBondStateChanged SecurityException:", ExceptionUtils.c(e));
        }
    }

    public void e() {
        try {
            Set<BluetoothDevice> bondedDevices = BluetoothAdapter.getDefaultAdapter().getBondedDevices();
            if (bondedDevices != null && bondedDevices.size() > 0) {
                Iterator<BluetoothDevice> it = bondedDevices.iterator();
                while (it.hasNext()) {
                    d(it.next());
                }
                if (this.n) {
                    a(this.m);
                    return;
                } else {
                    m();
                    return;
                }
            }
            m();
        } catch (SecurityException e) {
            LogUtil.e("RocheGlucoseManager", "getConnectedDeviceList SecurityException:", ExceptionUtils.c(e));
        }
    }

    private void d(BluetoothDevice bluetoothDevice) {
        if ((TextUtils.isEmpty(this.f33065c) || !this.f33065c.equals(bluetoothDevice.getName())) && (TextUtils.isEmpty(this.d) || !this.d.equals(bluetoothDevice.getAddress()))) {
            return;
        }
        this.n = true;
        this.m = bluetoothDevice;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(BluetoothDevice bluetoothDevice) {
        LogUtil.a("RocheGlucoseManager", "now will distinguish device.");
        if (bluetoothDevice == null) {
            return;
        }
        if ((TextUtils.isEmpty(this.f33065c) || !this.f33065c.equals(bluetoothDevice.getName())) && (TextUtils.isEmpty(this.d) || !this.d.equals(bluetoothDevice.getAddress()))) {
            return;
        }
        LogUtil.a("RocheGlucoseManager", "found the device we need successfully");
        e(103);
        e(104);
        if (this.f33063a != null) {
            this.m = bluetoothDevice;
            this.f33063a.onDataChanged(efx.b(bluetoothDevice), new HealthData());
            b(108);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(UniteDevice uniteDevice) {
        LogUtil.a("RocheGlucoseManager", "now will deviceScanSucByUds");
        if (uniteDevice == null) {
            return;
        }
        if ((TextUtils.isEmpty(this.f33065c) || !this.f33065c.equals(uniteDevice.getDeviceInfo().getDeviceName())) && (TextUtils.isEmpty(this.d) || !this.d.equals(uniteDevice.getDeviceInfo().getDeviceMac()))) {
            return;
        }
        LogUtil.a("RocheGlucoseManager", "found the device we need successfully by uds");
        e(103);
        e(104);
        if (this.f33063a != null) {
            this.y = uniteDevice;
            this.f33063a.onDataChanged(efx.d(uniteDevice), new HealthData());
            b(108);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        if (this.q) {
            h();
        }
        this.g++;
        if (this.g == 1) {
            this.f33063a.onStatusChanged(10, this.f, this.g);
        }
        b(102, 2000L);
    }

    private void g() {
        synchronized (i) {
            h = null;
        }
    }

    public void c() {
        b(101);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        try {
            BluetoothDevice bluetoothDevice = this.m;
            if (bluetoothDevice != null && bluetoothDevice.getBondState() != 12) {
                this.m.createBond();
            }
            if (this.j) {
                this.r = UUID.randomUUID().toString();
                emk.c().d(this.r, this.t);
                emk.c().b(this.y);
            }
        } catch (SecurityException e) {
            LogUtil.e("RocheGlucoseManager", "createBondDevice SecurityException:", ExceptionUtils.c(e));
        }
    }

    public void a() {
        e();
    }

    @Override // defpackage.ejn
    public void d() {
        super.d();
        g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean d(Class cls, BluetoothDevice bluetoothDevice) {
        if (cls == null || bluetoothDevice == null) {
            LogUtil.j("RocheGlucoseManager", "clazz == null || bleDevice == null");
            return false;
        }
        try {
            Object objInvoke = cls.getMethod("removeBond", new Class[0]).invoke(bluetoothDevice, new Object[0]);
            if (objInvoke instanceof Boolean) {
                return ((Boolean) objInvoke).booleanValue();
            }
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            LogUtil.e("RocheGlucoseManager", "removeDevice exception");
        }
        return false;
    }

    class c implements Handler.Callback {
        private c() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            switch (message.what) {
                case 101:
                    ejo.this.j();
                    return true;
                case 102:
                    ejo.this.m();
                    return true;
                case 103:
                    ejo.this.f();
                    return true;
                case 104:
                    ejo.this.f33063a.onStatusChanged(13, ejo.this.f, ejo.this.g);
                    ejo.this.h();
                    ejo.this.d();
                    return true;
                case 105:
                    ejo.this.f33063a.onStatusChanged(12, ejo.this.f, ejo.this.g);
                    return true;
                case 106:
                    ejo.this.f33063a.onStatusChanged(ejo.this.f33064b, ejo.this.f, ejo.this.g);
                    if (ejo.this.f33064b == 16) {
                        ejo.this.f33063a.onDataChanged(ejo.this.j ? efx.d(ejo.this.y) : efx.b(ejo.this.m), new HealthData());
                        ejo.this.h();
                    }
                    return true;
                case 107:
                    ejo ejoVar = ejo.this;
                    ejoVar.d(ejoVar.m.getClass(), ejo.this.m);
                    return true;
                case 108:
                    ejo.this.h();
                    ejo.this.f33063a.onStatusChanged(17, ejo.this.f, ejo.this.g);
                    return true;
                default:
                    LogUtil.a("RocheGlucoseManager", "default case");
                    return false;
            }
        }
    }
}
