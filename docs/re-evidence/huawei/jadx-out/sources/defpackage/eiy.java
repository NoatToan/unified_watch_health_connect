package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.os.Bundle;
import com.huawei.devicesdk.entity.CharacterOperationType;
import com.huawei.devicesdk.entity.DeviceInfo;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.health.device.api.DeviceInfoUtilsApi;
import com.huawei.health.device.callback.IHealthDeviceCallback;
import com.huawei.health.device.model.HealthDevice;
import com.huawei.health.ecologydevice.callback.ConnectStatusCallback;
import com.huawei.health.ecologydevice.callback.DataChangedCallback;
import com.huawei.health.ecologydevice.open.GattMeasureController;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.ble.BleConstants;
import com.huawei.profile.profile.ProfileExtendConstants;
import health.compact.a.Services;
import java.util.UUID;

/* JADX INFO: loaded from: classes7.dex */
public class eiy extends GattMeasureController implements ConnectStatusCallback, DataChangedCallback {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static eiy f33049c;
    private static final Object d = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private BluetoothGattService f33050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private BluetoothGattDescriptor f33051b;
    private BluetoothGattCharacteristic e;
    private Context f;
    private BluetoothAdapter g;
    private BluetoothGattCharacteristic i;
    private BluetoothManager j;
    private String l;
    private IHealthDeviceCallback m;
    private BluetoothGatt n;
    private String q;
    private boolean k = true;
    private int o = 0;
    private final BluetoothGattCallback h = new BluetoothGattCallback() { // from class: eiy.4
        @Override // android.bluetooth.BluetoothGattCallback
        public void onConnectionStateChange(BluetoothGatt bluetoothGatt, int i, int i2) {
            eiy.this.a(bluetoothGatt, i2);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onServicesDiscovered(BluetoothGatt bluetoothGatt, int i) {
            eiy.this.d(bluetoothGatt, i);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicWrite(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
            LogUtil.a("KangKangMeasureController", "onCharacteristicWrite success status:", Integer.valueOf(i));
            try {
                if (eiy.this.k) {
                    eiy.this.k = false;
                    LogUtil.d("KangKangMeasureController", "onCharacteristicWrite send a cmd");
                    try {
                        Thread.sleep(200L);
                    } catch (InterruptedException e) {
                        LogUtil.e("KangKangMeasureController", "onCharacteristicWrite ex = ", e.getMessage());
                    }
                    if (eiy.this.i == null || eiy.this.n == null) {
                        return;
                    }
                    eiy.this.i.setValue(Integer.parseInt("A", 16), 17, 0);
                    eiy.this.n.writeCharacteristic(eiy.this.i);
                }
            } catch (NumberFormatException | SecurityException e2) {
                LogUtil.e("KangKangMeasureController", "onCharacteristicWrite e:", ExceptionUtils.c(e2));
                eiy.this.e(0);
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicChanged(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
            eiy.this.d(bluetoothGattCharacteristic);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onDescriptorWrite(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
            eiy.this.c(bluetoothGatt, i);
        }
    };

    private eiy() {
    }

    public static eiy d() {
        eiy eiyVar;
        synchronized (d) {
            if (f33049c == null) {
                f33049c = new eiy();
            }
            eiyVar = f33049c;
        }
        return eiyVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(BluetoothGatt bluetoothGatt, int i) {
        LogUtil.a("KangKangMeasureController", "doDescriptorWrite success status:", Integer.valueOf(i));
        int i2 = this.o;
        if (i2 != 1) {
            if (i2 == 0) {
                this.o = 2;
                LogUtil.d("KangKangMeasureController", "doDescriptorWrite STATE_NONE only set STATE_CONNECTED");
                this.k = false;
                return;
            }
            LogUtil.j("KangKangMeasureController", "doDescriptorWrite other status:", Integer.valueOf(i));
            return;
        }
        LogUtil.d("KangKangMeasureController", "doDescriptorWrite send ble cmd 11");
        this.k = true;
        try {
            this.i.setValue(11, 17, 0);
            bluetoothGatt.writeCharacteristic(this.i);
            e(2);
            Thread.sleep(100L);
        } catch (InterruptedException | SecurityException e) {
            LogUtil.e("KangKangMeasureController", "doDescriptorWrite SecurityException:", ExceptionUtils.c(e));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        LogUtil.d("KangKangMeasureController", "Enter doCharacteristicChange");
        byte[] value = bluetoothGattCharacteristic.getValue();
        if (value == null || value.length != 6) {
            return;
        }
        eni eniVar = new eni();
        eniVar.c(value);
        d(eniVar);
    }

    private void d(eni eniVar) {
        if (ejh.d(eniVar.getDiastolic())) {
            synchronized (this) {
                IHealthDeviceCallback iHealthDeviceCallback = this.m;
                if (iHealthDeviceCallback != null) {
                    iHealthDeviceCallback.onFailed(this.mDevice, eniVar.getDiastolic());
                }
            }
            return;
        }
        synchronized (this) {
            IHealthDeviceCallback iHealthDeviceCallback2 = this.m;
            if (iHealthDeviceCallback2 != null) {
                iHealthDeviceCallback2.onDataChanged(this.mDevice, eniVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(BluetoothGatt bluetoothGatt, int i) {
        LogUtil.a("KangKangMeasureController", "Enter doServiceDiscovered");
        if (i == 0) {
            try {
                BluetoothGattService service = bluetoothGatt.getService(UUID.fromString("0000fff0-0000-1000-8000-00805f9b34fb"));
                this.f33050a = service;
                if (service == null) {
                    LogUtil.j("KangKangMeasureController", "doServiceDiscovered mBleGattService is null");
                    return;
                }
                this.e = service.getCharacteristic(UUID.fromString("0000fff1-0000-1000-8000-00805f9b34fb"));
                BluetoothGattCharacteristic characteristic = this.f33050a.getCharacteristic(UUID.fromString("0000fff2-0000-1000-8000-00805f9b34fb"));
                this.i = characteristic;
                BluetoothGattCharacteristic bluetoothGattCharacteristic = this.e;
                if (bluetoothGattCharacteristic == null || characteristic == null) {
                    return;
                }
                this.f33051b = bluetoothGattCharacteristic.getDescriptor(UUID.fromString(BleConstants.CLIENT_CHARACTERISTIC_CONFIG_DESCRIPTOR_UUID));
                Thread.sleep(50L);
                if (this.f33051b != null) {
                    bluetoothGatt.setCharacteristicNotification(this.e, true);
                    this.f33051b.setValue(BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE);
                    bluetoothGatt.writeDescriptor(this.f33051b);
                    return;
                }
                return;
            } catch (InterruptedException | SecurityException e) {
                LogUtil.e("KangKangMeasureController", "doServiceDiscovered Exception:", ExceptionUtils.c(e));
                return;
            }
        }
        LogUtil.j("KangKangMeasureController", "doServiceDiscovered other status : ", Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(BluetoothGatt bluetoothGatt, int i) {
        LogUtil.a("KangKangMeasureController", "doConnectionStateChange Connection State Change:", Integer.valueOf(i));
        this.n = bluetoothGatt;
        if (i == 1) {
            LogUtil.d("KangKangMeasureController", "doConnectionStateChange please wait connecting");
            return;
        }
        if (i == 2) {
            LogUtil.d("KangKangMeasureController", "doConnectionStateChange Connected to GATT server.");
            try {
                Thread.sleep(100L);
                bluetoothGatt.discoverServices();
                Thread.sleep(100L);
                return;
            } catch (InterruptedException | SecurityException e) {
                LogUtil.e("KangKangMeasureController", "doConnectionStateChange Exception:", ExceptionUtils.c(e));
                return;
            }
        }
        if (i == 0) {
            LogUtil.a("KangKangMeasureController", "doConnectionStateChange Disconnected from GATT server.");
            cleanup();
            this.k = true;
            e(0);
            return;
        }
        LogUtil.j("KangKangMeasureController", "doConnectionStateChange other state:", Integer.valueOf(i));
    }

    private void d(IHealthDeviceCallback iHealthDeviceCallback) {
        synchronized (this) {
            this.m = iHealthDeviceCallback;
        }
    }

    @Override // com.huawei.health.ecologydevice.open.GattMeasureController, com.huawei.health.device.open.MeasureController
    public boolean prepare(HealthDevice healthDevice, IHealthDeviceCallback iHealthDeviceCallback, Bundle bundle) {
        if (ete.d().b()) {
            this.l = UUID.randomUUID().toString();
            eiy eiyVarD = d();
            String name = eiy.class.getName();
            ((DeviceInfoUtilsApi) Services.b("PluginDevice", DeviceInfoUtilsApi.class)).putUdsClassMap(name, eiyVarD);
            emk.c().d(this.l, new eff(name));
            emk.c().c(this.l, new efd(name));
        }
        if (!super.prepare(healthDevice, iHealthDeviceCallback, bundle)) {
            return false;
        }
        this.f = dxw.d();
        g();
        d(iHealthDeviceCallback);
        return true;
    }

    @Override // com.huawei.health.device.open.MeasureController
    public boolean start() {
        j();
        return true;
    }

    @Override // com.huawei.health.ecologydevice.open.GattMeasureController, com.huawei.health.device.open.MeasureController
    public void ending() {
        BluetoothGatt bluetoothGatt = this.n;
        if (bluetoothGatt != null) {
            try {
                bluetoothGatt.disconnect();
            } catch (SecurityException e) {
                LogUtil.e("KangKangMeasureController", "ending SecurityException:", ExceptionUtils.c(e));
                return;
            }
        }
        if (ete.d().b()) {
            emk.c().a();
        }
    }

    @Override // com.huawei.health.device.open.MeasureController
    public void cleanup() {
        synchronized (this) {
            this.m = null;
        }
        BluetoothGatt bluetoothGatt = this.n;
        if (bluetoothGatt != null) {
            try {
                bluetoothGatt.close();
            } catch (SecurityException e) {
                LogUtil.e("KangKangMeasureController", "cleanup SecurityException:", ExceptionUtils.c(e));
                return;
            }
        }
        this.n = null;
        this.f33050a = null;
        if (ete.d().b()) {
            emk.c().a();
            emk.c().b(this.l);
            emk.c().a(this.l);
            ((DeviceInfoUtilsApi) Services.b("PluginDevice", DeviceInfoUtilsApi.class)).clearUdsClassMap();
        }
        b();
        this.l = null;
    }

    private static void b() {
        synchronized (d) {
            f33049c = null;
        }
    }

    @Override // com.huawei.health.ecologydevice.open.GattMeasureController
    public BluetoothGattCallback getGattCallbackImpl() {
        return this.h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i) {
        synchronized (this) {
            this.o = i;
            IHealthDeviceCallback iHealthDeviceCallback = this.m;
            if (iHealthDeviceCallback != null) {
                iHealthDeviceCallback.onStatusChanged(this.mDevice, i);
            }
        }
    }

    private boolean g() {
        if (this.j == null) {
            Object systemService = this.f.getSystemService("bluetooth");
            if (systemService instanceof BluetoothManager) {
                this.j = (BluetoothManager) systemService;
            }
            if (this.j == null) {
                LogUtil.j("KangKangMeasureController", "Unable to initialize BluetoothManager.");
                return false;
            }
        }
        BluetoothAdapter adapter = this.j.getAdapter();
        this.g = adapter;
        if (adapter == null) {
            LogUtil.j("KangKangMeasureController", "initialize Unable to obtain a BluetoothAdapter.");
            return false;
        }
        try {
            Thread.sleep(ProfileExtendConstants.TIME_OUT);
            return true;
        } catch (InterruptedException e) {
            LogUtil.e("KangKangMeasureController", "initialize e = ", e.getMessage());
            return true;
        }
    }

    private void j() {
        int i = this.o;
        if (i == 1) {
            LogUtil.a("KangKangMeasureController", "startBloodPressureMeasurement state connecting ");
            return;
        }
        if (i == 2) {
            if (ete.d().b()) {
                c();
                return;
            } else {
                a();
                return;
            }
        }
        LogUtil.j("KangKangMeasureController", "startBloodPressureMeasurement, state = ", Integer.valueOf(i));
        e();
    }

    private void e() {
        e(1);
        BluetoothAdapter bluetoothAdapter = this.g;
        if (bluetoothAdapter != null && !bluetoothAdapter.isEnabled()) {
            LogUtil.d("KangKangMeasureController", "enableBluetoothAdapterAndSetStateValue bluetooth not enabled ,start bluetooth ");
            e(0);
        } else if (this.n != null) {
            LogUtil.d("KangKangMeasureController", "enableBluetoothAdapterAndSetStateValue mGattObject is not null");
            this.k = true;
        } else {
            LogUtil.j("KangKangMeasureController", "enableBluetoothAdapterAndSetStateValue mGattObject is null");
            this.k = true;
        }
    }

    private void a() {
        try {
            if (this.n == null || this.i == null) {
                return;
            }
            LogUtil.d("KangKangMeasureController", "callbackOnStatusChangedAndSetBleValue state connected,send 40 cmd");
            synchronized (this) {
                this.m.onStatusChanged(this.mDevice, this.o);
            }
            this.k = true;
            this.i.setValue(Integer.parseInt("B", 16), 17, 0);
            this.n.writeCharacteristic(this.i);
            try {
                Thread.sleep(200L);
            } catch (InterruptedException e) {
                LogUtil.e("KangKangMeasureController", "callbackOnStatusChangedAndSetBleValue ex:", ExceptionUtils.c(e));
            }
        } catch (NumberFormatException | SecurityException e2) {
            LogUtil.e("KangKangMeasureController", "callbackOnStatusChangedAndSetBleValue e:", ExceptionUtils.c(e2));
            e(0);
        }
    }

    private void c() {
        synchronized (this) {
            if (this.m == null) {
                LogUtil.j("KangKangMeasureController", "mGetDataResultCallback == null");
                return;
            }
            try {
                synchronized (this) {
                    this.m.onStatusChanged(this.mDevice, this.o);
                }
                this.k = true;
                b(new byte[]{Byte.parseByte("B", 16)});
                try {
                    Thread.sleep(200L);
                } catch (InterruptedException unused) {
                    LogUtil.e("KangKangMeasureController", "callbackOnStatusChangedAndSetBleValue InterruptedException");
                }
            } catch (NumberFormatException unused2) {
                LogUtil.e("KangKangMeasureController", "callbackOnStatusChangedAndSetBleValue InterruptedException");
                e(0);
            }
        }
    }

    private void b(byte[] bArr) {
        cmm cmmVar = new cmm();
        cmmVar.c(dmz.u.toString());
        cmmVar.a(bArr);
        ete.d().b(cmmVar, dmz.x.toString(), dmz.u.toString(), this.q, CharacterOperationType.WRITE);
    }

    @Override // com.huawei.health.ecologydevice.callback.ConnectStatusCallback
    public void doDeviceConnected(int i, DeviceInfo deviceInfo) {
        LogUtil.d("KangKangMeasureController", "doConnectionStateChange Connected to GATT server bu uds");
        this.q = deviceInfo.getDeviceMac();
        ((DeviceInfoUtilsApi) Services.b("PluginDevice", DeviceInfoUtilsApi.class)).setCharacteristicNotifyByUds(this.q, dmz.x.toString(), dmz.v.toString(), true);
    }

    @Override // com.huawei.health.ecologydevice.callback.ConnectStatusCallback
    public void doDeviceDisconnect(int i) {
        LogUtil.a("KangKangMeasureController", "doConnectionStateChange Disconnected from GATT server by uds");
        cleanup();
        this.k = true;
        e(0);
    }

    @Override // com.huawei.health.ecologydevice.callback.ConnectStatusCallback
    public void doDeviceConnecting(int i) {
        LogUtil.d("KangKangMeasureController", "doConnectionStateChange please wait connecting by uds");
    }

    @Override // com.huawei.health.ecologydevice.callback.DataChangedCallback
    public void onDataChanged(cmm cmmVar) {
        if (cmmVar == null) {
            LogUtil.j("KangKangMeasureController", "dataFrame == null");
            return;
        }
        if (cmmVar.b() != null && dmz.u.toString().equalsIgnoreCase(cmmVar.b())) {
            h();
        }
        if (cmmVar.b() == null || !dmz.v.toString().equalsIgnoreCase(cmmVar.b())) {
            return;
        }
        f();
        a(cmmVar);
    }

    private void f() {
        int i = this.o;
        if (i != 1) {
            if (i == 0) {
                this.o = 2;
                LogUtil.a("KangKangMeasureController", "doDescriptorWrite STATE_NONE only set STATE_CONNECTED by uds");
                this.k = false;
                return;
            }
            LogUtil.j("KangKangMeasureController", "doDescriptorWrite other status : ", Integer.valueOf(i));
            return;
        }
        LogUtil.a("KangKangMeasureController", "doDescriptorWrite send ble cmd by uds");
        this.k = true;
        b(new byte[]{11});
        e(2);
        try {
            Thread.sleep(100L);
        } catch (InterruptedException e) {
            LogUtil.e("KangKangMeasureController", "doDescriptorWrite ex = ", e.getMessage());
        }
    }

    private void h() {
        if (this.k) {
            this.k = false;
            LogUtil.a("KangKangMeasureController", "onCharacteristicWrite send a cmd by cmd");
            try {
                Thread.sleep(200L);
            } catch (InterruptedException unused) {
                LogUtil.e("KangKangMeasureController", "onCharacteristicWrite InterruptedException");
            }
            try {
                b(new byte[]{Byte.parseByte("A", 16)});
            } catch (NumberFormatException e) {
                LogUtil.e("KangKangMeasureController", "onCharacteristicWrite ex = ", e.getMessage());
                e(0);
            }
        }
    }

    private void a(cmm cmmVar) {
        byte[] bArrD = cmmVar.d();
        if (bArrD == null || bArrD.length != 6) {
            return;
        }
        eni eniVar = new eni();
        eniVar.c(bArrD);
        d(eniVar);
    }
}
