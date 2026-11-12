package defpackage;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import android.os.Bundle;
import com.huawei.devicesdk.entity.DeviceInfo;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.device.api.DeviceInfoUtilsApi;
import com.huawei.health.device.callback.IHealthDeviceCallback;
import com.huawei.health.device.model.HealthDevice;
import com.huawei.health.device.open.data.model.HealthData;
import com.huawei.health.ecologydevice.callback.ConnectStatusCallback;
import com.huawei.health.ecologydevice.callback.DataChangedCallback;
import com.huawei.health.ecologydevice.open.GattMeasureController;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.Services;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes7.dex */
public class ejg extends GattMeasureController implements ConnectStatusCallback, DataChangedCallback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f33059b = new Object();
    private static ejg d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private IHealthDeviceCallback f33060a;
    private BluetoothGatt e;
    private boolean f;
    private BluetoothGattCharacteristic g;
    private String i;
    private BluetoothGattService j;
    private String k;
    private int m;
    private BluetoothGattCharacteristic n;
    private ejj h = new ejj();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private BluetoothGattCallback f33061c = new BluetoothGattCallback() { // from class: ejg.4
        @Override // android.bluetooth.BluetoothGattCallback
        public void onConnectionStateChange(BluetoothGatt bluetoothGatt, int i, int i2) {
            ejg.this.b(bluetoothGatt, i, i2);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onDescriptorWrite(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
            LogUtil.a("EcologyDevice_MuMuMeasureController", "onDescriptorWrite status:", Integer.valueOf(i));
            super.onDescriptorWrite(bluetoothGatt, bluetoothGattDescriptor, i);
            if (ejg.this.m != 2) {
                LogUtil.j("EcologyDevice_MuMuMeasureController", "onDescriptorWrite state is not connected");
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicChanged(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
            LogUtil.d("EcologyDevice_MuMuMeasureController", "onCharacteristicChanged");
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicWrite(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
            super.onCharacteristicWrite(bluetoothGatt, bluetoothGattCharacteristic, i);
            LogUtil.a("EcologyDevice_MuMuMeasureController", "onCharacteristicWrite");
            try {
                ejg.this.e.readCharacteristic(ejg.this.g);
            } catch (SecurityException e) {
                LogUtil.e("EcologyDevice_MuMuMeasureController", "onCharacteristicWrite SecurityException:", ExceptionUtils.c(e));
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicRead(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
            LogUtil.a("EcologyDevice_MuMuMeasureController", "onCharacteristicRead");
            if (dmz.w.toString().equalsIgnoreCase(bluetoothGattCharacteristic.getUuid().toString())) {
                ejg.this.d(bluetoothGattCharacteristic.getValue());
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onServicesDiscovered(BluetoothGatt bluetoothGatt, int i) {
            super.onServicesDiscovered(bluetoothGatt, i);
            try {
                List<BluetoothGattService> services = bluetoothGatt.getServices();
                LogUtil.d("EcologyDevice_MuMuMeasureController", "onServicesDiscovered serviceList = ", services.toString());
                if (i == 0) {
                    LogUtil.d("EcologyDevice_MuMuMeasureController", "onServicesDiscovered GATT_SUCCESS");
                    Iterator<BluetoothGattService> it = services.iterator();
                    while (it.hasNext()) {
                        String string = it.next().getUuid().toString();
                        LogUtil.d("EcologyDevice_MuMuMeasureController", "onServicesDiscovered UUID: ", string);
                        if (dmz.ad.toString().equalsIgnoreCase(string)) {
                            ejg.this.a(bluetoothGatt);
                            return;
                        }
                    }
                }
            } catch (SecurityException e) {
                LogUtil.e("EcologyDevice_MuMuMeasureController", "onServicesDiscovered SecurityException:", ExceptionUtils.c(e));
            }
        }
    };

    @Override // com.huawei.health.device.open.MeasureController
    public boolean start() {
        return true;
    }

    private ejg() {
    }

    public static ejg d() {
        ejg ejgVar;
        synchronized (f33059b) {
            if (d == null) {
                d = new ejg();
            }
            ejgVar = d;
        }
        return ejgVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(BluetoothGatt bluetoothGatt, int i, int i2) {
        LogUtil.d("EcologyDevice_MuMuMeasureController", "doConnectionStateChange status:", Integer.valueOf(i));
        if (i2 == 2) {
            try {
                this.e = bluetoothGatt;
                this.m = 2;
                bluetoothGatt.discoverServices();
                return;
            } catch (SecurityException e) {
                LogUtil.e("EcologyDevice_MuMuMeasureController", "doConnectionStateChange SecurityException:", ExceptionUtils.c(e));
                return;
            }
        }
        if (i2 == 0) {
            this.m = 0;
            cleanup();
            g();
            return;
        }
        LogUtil.a("EcologyDevice_MuMuMeasureController", "doConnectionStateChange other newState:", Integer.valueOf(i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(byte[] bArr) {
        if (bArr == null || bArr.length < 1 || bArr[0] != -6) {
            return;
        }
        HealthData healthData = new HealthData();
        if (bArr.length >= 2) {
            b(bArr[1], bArr, healthData);
        }
    }

    private void b(byte b2, byte[] bArr, HealthData healthData) {
        if (b2 == 33) {
            e(bArr);
        } else {
            a(b2, bArr, healthData);
        }
    }

    private void e(byte[] bArr) {
        ejp ejpVar = new ejp(bArr);
        if (ejpVar.d() != null) {
            LogUtil.d("EcologyDevice_MuMuMeasureController", "parserDataCaseOne message is ", ejpVar.d().b());
            g();
            return;
        }
        LogUtil.d("EcologyDevice_MuMuMeasureController", "parserDataCaseOne ResultInfo :", ejpVar.toString());
        if (ejpVar.i()) {
            eni eniVar = new eni();
            eniVar.setDiastolic((short) ejpVar.e());
            if (b()) {
                this.f33060a.onProgressChanged(null, eniVar);
                return;
            }
            return;
        }
        this.f = false;
        eni eniVar2 = new eni();
        eniVar2.setDiastolic((short) ejpVar.b());
        eniVar2.setSystolic((short) ejpVar.a());
        eniVar2.setHeartRate((short) ejpVar.c());
        if (b()) {
            this.f33060a.onDataChanged((HealthDevice) null, eniVar2);
        }
    }

    private void g() {
        if (b()) {
            this.f33060a.onStatusChanged(new HealthDevice() { // from class: ejg.1
                @Override // com.huawei.health.device.model.HealthDevice
                public String getDeviceName() {
                    return "";
                }

                @Override // com.huawei.health.device.model.HealthDevice
                public String getAddress() {
                    return "";
                }

                @Override // com.huawei.health.device.model.HealthDevice
                public String getUniqueId() {
                    return "";
                }
            }, 3);
        }
    }

    private void a(byte b2, byte[] bArr, HealthData healthData) {
        if (b2 == 1 || b2 == 2) {
            if (b()) {
                this.f33060a.onDataChanged((HealthDevice) null, healthData);
            }
        } else {
            if (b2 != 32) {
                return;
            }
            b(bArr);
        }
    }

    @Override // com.huawei.health.ecologydevice.open.GattMeasureController, com.huawei.health.device.open.MeasureController
    public boolean prepare(HealthDevice healthDevice, IHealthDeviceCallback iHealthDeviceCallback, Bundle bundle) {
        LogUtil.a("EcologyDevice_MuMuMeasureController", "Enter prepare");
        if (ete.d().b()) {
            if (!super.prepare(healthDevice, iHealthDeviceCallback, bundle)) {
                return false;
            }
            this.f33060a = iHealthDeviceCallback;
            this.i = UUID.randomUUID().toString();
            ejg ejgVarD = d();
            String name = ejg.class.getName();
            ((DeviceInfoUtilsApi) Services.b("PluginDevice", DeviceInfoUtilsApi.class)).putUdsClassMap(name, ejgVarD);
            emk.c().d(this.i, new eff(name));
            emk.c().c(this.i, new efd(name));
            LogUtil.a("EcologyDevice_MuMuMeasureController", "MuMuMeasureController uds prepare start");
            return true;
        }
        if (!super.prepare(healthDevice, iHealthDeviceCallback, bundle)) {
            return false;
        }
        this.f33060a = iHealthDeviceCallback;
        return true;
    }

    public void a(BluetoothGatt bluetoothGatt) {
        LogUtil.d("EcologyDevice_MuMuMeasureController", "Enter initService");
        this.e = bluetoothGatt;
        if (this.j != null) {
            e();
            return;
        }
        this.f = false;
        BluetoothGattService service = bluetoothGatt.getService(UUID.fromString(dmz.ad.toString()));
        this.j = service;
        if (service != null) {
            this.g = service.getCharacteristic(UUID.fromString(dmz.w.toString()));
            this.n = this.j.getCharacteristic(UUID.fromString(dmz.ak.toString()));
            e();
        }
    }

    public void e() {
        if (this.j == null) {
            return;
        }
        try {
            this.n.setValue(this.h.e());
            this.e.writeCharacteristic(this.n);
            this.f = true;
            dxw.d(new Runnable() { // from class: ejm
                @Override // java.lang.Runnable
                public final void run() {
                    this.e.a();
                }
            });
        } catch (SecurityException e) {
            LogUtil.e("EcologyDevice_MuMuMeasureController", "startMeasure SecurityException:", ExceptionUtils.c(e));
        }
    }

    /* synthetic */ void a() {
        BluetoothGattCharacteristic bluetoothGattCharacteristic;
        while (this.m == 2 && this.f && (bluetoothGattCharacteristic = this.n) != null) {
            try {
                bluetoothGattCharacteristic.setValue(this.h.b());
                this.e.writeCharacteristic(this.n);
                Thread.sleep(250L);
            } catch (InterruptedException | SecurityException e) {
                LogUtil.e("EcologyDevice_MuMuMeasureController", "startMeasure Exception:", ExceptionUtils.c(e));
            }
        }
    }

    private boolean b() {
        return this.f33060a != null;
    }

    private void b(byte[] bArr) {
        byte b2 = bArr[2];
        Boolean boolD = ejr.d(bArr[3], 7);
        if (boolD != null) {
            if (b2 == 0) {
                this.f = boolD.booleanValue();
            } else {
                this.f = !boolD.booleanValue();
            }
        }
    }

    @Override // com.huawei.health.ecologydevice.open.GattMeasureController
    public BluetoothGattCallback getGattCallbackImpl() {
        return this.f33061c;
    }

    @Override // com.huawei.health.device.open.MeasureController
    public void cleanup() {
        BluetoothGatt bluetoothGatt = this.e;
        if (bluetoothGatt != null) {
            try {
                bluetoothGatt.close();
            } catch (SecurityException e) {
                LogUtil.e("EcologyDevice_MuMuMeasureController", "cleanup SecurityException:", ExceptionUtils.c(e));
                return;
            }
        }
        this.e = null;
        this.j = null;
        this.n = null;
        this.g = null;
        this.f33060a = null;
        this.m = 0;
        if (ete.d().b()) {
            emk.c().a();
            emk.c().b(this.i);
            emk.c().a(this.i);
            ((DeviceInfoUtilsApi) Services.b("PluginDevice", DeviceInfoUtilsApi.class)).clearUdsClassMap();
            this.f = false;
        }
        h();
        this.i = null;
    }

    private static void h() {
        synchronized (f33059b) {
            d = null;
        }
    }

    @Override // com.huawei.health.ecologydevice.open.GattMeasureController, com.huawei.health.device.open.MeasureController
    public void ending() {
        BluetoothGatt bluetoothGatt = this.e;
        if (bluetoothGatt != null) {
            try {
                bluetoothGatt.disconnect();
            } catch (SecurityException e) {
                LogUtil.e("EcologyDevice_MuMuMeasureController", "ending SecurityException:", ExceptionUtils.c(e));
                return;
            }
        }
        if (ete.d().b()) {
            emk.c().a();
        }
    }

    @Override // com.huawei.health.ecologydevice.callback.ConnectStatusCallback
    public void doDeviceConnected(int i, DeviceInfo deviceInfo) {
        LogUtil.a("EcologyDevice_MuMuMeasureController", "doConnectionStateChange doDeviceConnected");
        this.k = deviceInfo.getDeviceMac();
        ete.d().b(this.h.e(), this.k);
        this.f = true;
        ThreadPoolManager.c().execute(new Runnable() { // from class: ejl
            @Override // java.lang.Runnable
            public final void run() {
                this.e.c();
            }
        });
    }

    /* synthetic */ void c() {
        while (this.f) {
            ete.d().b(this.h.b(), this.k);
            try {
                Thread.sleep(500L);
            } catch (InterruptedException unused) {
                LogUtil.e("EcologyDevice_MuMuMeasureController", "doDeviceConnected sleep error");
            }
        }
    }

    @Override // com.huawei.health.ecologydevice.callback.ConnectStatusCallback
    public void doDeviceDisconnect(int i) {
        cleanup();
        if (this.f33060a != null) {
            LogUtil.j("EcologyDevice_MuMuMeasureController", "doConnectionStateChange disconnected");
            this.f33060a.onStatusChanged(this.mDevice, 3);
        }
    }

    @Override // com.huawei.health.ecologydevice.callback.ConnectStatusCallback
    public void doDeviceConnecting(int i) {
        LogUtil.a("EcologyDevice_MuMuMeasureController", "device is connecting");
    }

    @Override // com.huawei.health.ecologydevice.callback.DataChangedCallback
    public void onDataChanged(cmm cmmVar) {
        LogUtil.a("EcologyDevice_MuMuMeasureController", "onDataChanged enter");
        if (cmmVar == null) {
            return;
        }
        String strB = cmmVar.b();
        LogUtil.a("EcologyDevice_MuMuMeasureController", "onDataChanged enter", cmmVar.d(), cmmVar.b());
        if (dmz.w.toString().equalsIgnoreCase(strB)) {
            d(cmmVar.d());
        } else if (dmz.ak.toString().equalsIgnoreCase(strB)) {
            ete.d().a(cmmVar, dmz.ad.toString(), dmz.w.toString(), this.k);
        } else {
            LogUtil.a("EcologyDevice_MuMuMeasureController", "onDataChanged other uuid");
        }
    }
}
