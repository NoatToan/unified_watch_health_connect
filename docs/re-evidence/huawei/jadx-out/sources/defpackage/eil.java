package defpackage;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import android.os.Bundle;
import com.huawei.devicesdk.entity.DeviceInfo;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.health.device.api.DeviceInfoUtilsApi;
import com.huawei.health.device.callback.IHealthDeviceCallback;
import com.huawei.health.device.model.HealthDevice;
import com.huawei.health.device.open.data.model.HealthData;
import com.huawei.health.ecologydevice.callback.ConnectStatusCallback;
import com.huawei.health.ecologydevice.callback.DataChangedCallback;
import com.huawei.health.ecologydevice.manager.BloodPressureStartFromDeviceHelper;
import com.huawei.health.ecologydevice.open.GattMeasureController;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.Services;
import java.util.UUID;

/* JADX INFO: loaded from: classes7.dex */
public class eil extends GattMeasureController implements ConnectStatusCallback, DataChangedCallback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f33032b = new Object();
    private static eil e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private BluetoothGatt f33033a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private BluetoothGattCharacteristic f33034c;
    private IHealthDeviceCallback d;
    private BluetoothGattCharacteristic f;
    private volatile boolean h;
    private BluetoothGattCharacteristic i;
    private String l;
    private String m;
    private BluetoothGattCharacteristic n;
    private HealthDevice.HealthDeviceKind j = HealthDevice.HealthDeviceKind.HDK_BLOOD_PRESSURE;
    private BluetoothGattCallback g = new BluetoothGattCallback() { // from class: eil.4
        @Override // android.bluetooth.BluetoothGattCallback
        public void onConnectionStateChange(BluetoothGatt bluetoothGatt, int i, int i2) {
            eil.this.b(bluetoothGatt, i2);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onServicesDiscovered(BluetoothGatt bluetoothGatt, int i) {
            eil.this.a(bluetoothGatt, i);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicChanged(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
            UUID uuid = bluetoothGattCharacteristic.getUuid();
            LogUtil.a("BloodPressureMeasureController", "onCharacteristicChanged mBaseResponseCallback:", eil.this.d, ",parser:", eil.this.k, ",data = ", erh.a(bluetoothGattCharacteristic.getValue(), ""));
            if (dmz.f32038c.equals(uuid)) {
                if (eil.this.k == null) {
                    eil.this.k = new eik();
                }
                HealthData data = eil.this.k.parseData(bluetoothGattCharacteristic.getValue());
                if (!(data instanceof eni) || eil.this.d == null) {
                    return;
                }
                eil.this.d.onDataChanged(eil.this.mDevice, data);
                return;
            }
            if (dmz.q.equals(uuid)) {
                etn.c(bluetoothGatt, eil.this.i, eil.this.f);
            } else {
                if (dmz.ah.equals(uuid)) {
                    LogUtil.a("BloodPressureMeasureController", "Click Start on the device.");
                    eil.this.b();
                    eil.this.a(bluetoothGattCharacteristic.getValue());
                    return;
                }
                LogUtil.a("BloodPressureMeasureController", "onCharacteristicChanged other uuid ");
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onDescriptorWrite(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
            LogUtil.a("BloodPressureMeasureController", "Enter onDescriptorWrite status:", Integer.valueOf(i));
            if (i != 0) {
                return;
            }
            if (bluetoothGattDescriptor == null || bluetoothGattDescriptor.getCharacteristic() == null) {
                LogUtil.j("BloodPressureMeasureController", "descriptor == null || descriptor.getCharacteristic == null");
            } else if (dmz.f32038c.equals(bluetoothGattDescriptor.getCharacteristic().getUuid())) {
                if (eil.this.f == null && eil.this.i == null) {
                    return;
                }
                etn.c(bluetoothGatt, eil.this.i, eil.this.f);
            }
        }
    };
    private eik k = new eik();

    public static eil e() {
        eil eilVar;
        synchronized (f33032b) {
            if (e == null) {
                e = new eil();
            }
            eilVar = e;
        }
        return eilVar;
    }

    public eil() {
        ete.d().d(this.j.name());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        if (this.k == null) {
            this.k = new eik();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(byte[] bArr) {
        IHealthDeviceCallback iHealthDeviceCallback;
        eik eikVar = this.k;
        if (eikVar == null) {
            LogUtil.a("BloodPressureMeasureController", "bloodPressureDataParser is null");
            return;
        }
        int iE = eikVar.e(bArr);
        LogUtil.a("BloodPressureMeasureController", "Click Start on the device.controlType is ", Integer.valueOf(iE));
        if ((iE == 0 || iE == 1) && (iHealthDeviceCallback = this.d) != null) {
            iHealthDeviceCallback.onMeasureChanged(iE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(BluetoothGatt bluetoothGatt, int i) {
        LogUtil.d("BloodPressureMeasureController", "Enter doServiceDiscover, status:", Integer.valueOf(i));
        if (i == 0) {
            try {
                BluetoothGattService service = bluetoothGatt.getService(dmz.ad);
                if (service == null) {
                    return;
                }
                d();
                this.f33034c = service.getCharacteristic(dmz.f32038c);
                this.i = service.getCharacteristic(dmz.r);
                BluetoothGattCharacteristic characteristic = service.getCharacteristic(dmz.ah);
                this.n = characteristic;
                if (characteristic != null) {
                    LogUtil.a("BloodPressureMeasureController", " doServiceDiscover setCharacteristicNotification isEnable:", Boolean.valueOf(bluetoothGatt.setCharacteristicNotification(characteristic, true)));
                }
                if (this.f33034c != null) {
                    Thread.sleep(500L);
                    LogUtil.a("BloodPressureMeasureController", "doServiceDiscover enableIndication isEnable:", Boolean.valueOf(eij.c().e(bluetoothGatt, this.f33034c)));
                }
            } catch (InterruptedException | SecurityException e2) {
                LogUtil.e("BloodPressureMeasureController", "doServiceDiscover Exception:", ExceptionUtils.c(e2));
                return;
            }
        }
        Thread.sleep(600L);
        BluetoothGattService service2 = bluetoothGatt.getService(dmz.p);
        if (service2 != null) {
            BluetoothGattCharacteristic characteristic2 = service2.getCharacteristic(dmz.q);
            this.f = characteristic2;
            if (characteristic2 == null) {
                return;
            }
            bluetoothGatt.setCharacteristicNotification(characteristic2, true);
            BluetoothGattDescriptor descriptor = this.f.getDescriptor(dmz.k);
            if (descriptor != null) {
                LogUtil.a("BloodPressureMeasureController", "doServiceDiscover ENABLE_NOTIFICATION_VALUE");
                descriptor.setValue(BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE);
                bluetoothGatt.writeDescriptor(descriptor);
            }
        }
    }

    private void d() {
        if (BloodPressureStartFromDeviceHelper.a()) {
            LogUtil.a("BloodPressureMeasureController", "doServiceDiscover NewMeasurementProcedure");
            IHealthDeviceCallback iHealthDeviceCallback = this.d;
            if (iHealthDeviceCallback != null) {
                iHealthDeviceCallback.onStatusChanged(this.mDevice, 2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(BluetoothGatt bluetoothGatt, int i) {
        LogUtil.d("BloodPressureMeasureController", "Enter doConnectionStateChange, newState:", Integer.valueOf(i));
        try {
            if (i != 2) {
                if (i == 0) {
                    if (this.d != null && BloodPressureStartFromDeviceHelper.a()) {
                        LogUtil.j("BloodPressureMeasureController", "doConnectionStateChange disconnected");
                        this.d.onStatusChanged(this.mDevice, 3);
                    }
                    cleanup();
                    return;
                }
                LogUtil.j("BloodPressureMeasureController", "doConnectionStateChange other State = ", Integer.valueOf(i));
                return;
            }
            this.f33033a = bluetoothGatt;
            bluetoothGatt.discoverServices();
            if (!BloodPressureStartFromDeviceHelper.a()) {
                LogUtil.a("BloodPressureMeasureController", "OldMeasurementProcedure BluetoothProfile.STATE_CONNECTED");
                IHealthDeviceCallback iHealthDeviceCallback = this.d;
                if (iHealthDeviceCallback != null) {
                    iHealthDeviceCallback.onStatusChanged(this.mDevice, 2);
                    return;
                }
                return;
            }
            LogUtil.a("BloodPressureMeasureController", "NewMeasurementProcedure BluetoothProfile.STATE_CONNECTED");
        } catch (SecurityException e2) {
            LogUtil.e("BloodPressureMeasureController", "doConnectionStateChange SecurityException:", ExceptionUtils.c(e2));
        }
    }

    @Override // com.huawei.health.ecologydevice.open.GattMeasureController
    public BluetoothGattCallback getGattCallbackImpl() {
        return this.g;
    }

    @Override // com.huawei.health.ecologydevice.open.GattMeasureController, com.huawei.health.device.open.MeasureController
    public boolean prepare(HealthDevice healthDevice, IHealthDeviceCallback iHealthDeviceCallback, Bundle bundle) {
        LogUtil.a("BloodPressureMeasureController", "Enter prepare");
        if (ete.d().b()) {
            if (!super.prepare(healthDevice, iHealthDeviceCallback, bundle)) {
                return false;
            }
            String name = eil.class.getName();
            this.d = iHealthDeviceCallback;
            this.m = UUID.randomUUID().toString();
            ((DeviceInfoUtilsApi) Services.b("PluginDevice", DeviceInfoUtilsApi.class)).putUdsClassMap(name, e());
            emk.c().d(this.m, new eff(name));
            emk.c().c(this.m, new efd(name));
            LogUtil.a("BloodPressureMeasureController", "BloodPressureMeasureController prepare start, isConnect:", Boolean.valueOf(this.h));
            return true;
        }
        if (!super.prepare(healthDevice, iHealthDeviceCallback, bundle)) {
            return false;
        }
        this.d = iHealthDeviceCallback;
        return true;
    }

    @Override // com.huawei.health.device.open.MeasureController
    public boolean start() {
        LogUtil.a("BloodPressureMeasureController", "Enter start");
        return true;
    }

    @Override // com.huawei.health.ecologydevice.open.GattMeasureController, com.huawei.health.device.open.MeasureController
    public void ending() {
        LogUtil.a("BloodPressureMeasureController", "Enter ending");
        try {
            if (this.f33033a != null) {
                LogUtil.a("BloodPressureMeasureController", "ending disconnect");
                this.f33033a.disconnect();
            }
            if (ete.d().b()) {
                emk.c().a();
            }
            super.ending();
        } catch (SecurityException e2) {
            LogUtil.e("BloodPressureMeasureController", "ending SecurityException:", ExceptionUtils.c(e2));
        }
    }

    @Override // com.huawei.health.device.open.MeasureController
    public void cleanup() {
        LogUtil.a("BloodPressureMeasureController", "Enter cleanup");
        try {
            if (this.f33033a != null) {
                LogUtil.a("BloodPressureMeasureController", "cleanup close");
                this.f33033a.close();
            }
            this.f33034c = null;
            this.i = null;
            this.d = null;
            this.k = null;
            if (ete.d().b()) {
                emk.c().a();
                emk.c().b(this.m);
                emk.c().a(this.m);
                ((DeviceInfoUtilsApi) Services.b("PluginDevice", DeviceInfoUtilsApi.class)).clearUdsClassMap();
            }
            c();
            this.m = null;
        } catch (SecurityException e2) {
            LogUtil.e("BloodPressureMeasureController", "cleanup SecurityException:", ExceptionUtils.c(e2));
        }
    }

    private static void c() {
        synchronized (f33032b) {
            e = null;
        }
    }

    @Override // com.huawei.health.ecologydevice.callback.ConnectStatusCallback
    public void doDeviceConnected(int i, DeviceInfo deviceInfo) {
        IHealthDeviceCallback iHealthDeviceCallback = this.d;
        if (iHealthDeviceCallback != null) {
            iHealthDeviceCallback.onStatusChanged(this.mDevice, 2);
        }
        this.l = deviceInfo.getDeviceMac();
        this.h = true;
        DeviceInfoUtilsApi deviceInfoUtilsApi = (DeviceInfoUtilsApi) Services.b("PluginDevice", DeviceInfoUtilsApi.class);
        deviceInfoUtilsApi.setCharacteristicNotifyByUds(this.l, dmz.ad.toString(), dmz.f32038c.toString(), true);
        try {
            Thread.sleep(600L);
        } catch (InterruptedException unused) {
            LogUtil.e("BloodPressureMeasureController", "doDeviceConnected sleep error");
        }
        deviceInfoUtilsApi.setCharacteristicNotifyByUds(this.l, dmz.p.toString(), dmz.q.toString(), true);
    }

    @Override // com.huawei.health.ecologydevice.callback.ConnectStatusCallback
    public void doDeviceDisconnect(int i) {
        if (this.d != null && BloodPressureStartFromDeviceHelper.a()) {
            LogUtil.j("BloodPressureMeasureController", "doConnectionStateChange disconnected");
            this.d.onStatusChanged(this.mDevice, 3);
        }
        cleanup();
    }

    @Override // com.huawei.health.ecologydevice.callback.ConnectStatusCallback
    public void doDeviceConnecting(int i) {
        LogUtil.a("BloodPressureMeasureController", "device is connecting");
    }

    @Override // com.huawei.health.ecologydevice.callback.DataChangedCallback
    public void onDataChanged(cmm cmmVar) {
        IHealthDeviceCallback iHealthDeviceCallback;
        LogUtil.a("BloodPressureMeasureController", "onCharacterChanged enter");
        if (cmmVar == null) {
            return;
        }
        String strB = cmmVar.b();
        if (dmz.f32038c.toString().equals(strB)) {
            if (this.k == null) {
                this.k = new eik();
            }
            HealthData data = this.k.parseData(cmmVar.d());
            if ((data instanceof eni) && (iHealthDeviceCallback = this.d) != null) {
                iHealthDeviceCallback.onDataChanged(this.mDevice, data);
            }
            ete.d().c(dmz.ad.toString(), dmz.f32038c.toString(), this.l);
            return;
        }
        if (dmz.q.toString().equals(strB)) {
            ete.d().c(dmz.p.toString(), dmz.r.toString(), this.l);
        } else {
            LogUtil.a("BloodPressureMeasureController", "onCharacterChanged other uuid ");
        }
    }
}
