package defpackage;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.huawei.devicesdk.entity.DeviceInfo;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.health.device.api.DeviceInfoUtilsApi;
import com.huawei.health.device.callback.IHealthDeviceCallback;
import com.huawei.health.device.model.HealthDevice;
import com.huawei.health.device.open.data.model.HealthData;
import com.huawei.health.ecologydevice.callback.ConnectStatusCallback;
import com.huawei.health.ecologydevice.callback.DataChangedCallback;
import com.huawei.health.ecologydevice.open.GattMeasureController;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.ParamConstants;
import com.huawei.unitedevice.entity.UniteDevice;
import health.compact.a.Services;
import java.util.UUID;

/* JADX INFO: loaded from: classes7.dex */
public class eja extends GattMeasureController implements ConnectStatusCallback, DataChangedCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f33054a = new Object();
    private static eja e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private IHealthDeviceCallback f33055b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f33056c;
    private BluetoothGatt g;
    private int k;
    private d l;
    private boolean m;
    private String n;
    private final String o = HealthDevice.HealthDeviceKind.HDK_HEART_RATE.name();
    private final HandlerThread f = new HandlerThread("HeartRateMeasureController");
    private int d = 0;
    private boolean j = true;
    private BluetoothGattCallback h = new BluetoothGattCallback() { // from class: eja.2
        @Override // android.bluetooth.BluetoothGattCallback
        public void onConnectionStateChange(BluetoothGatt bluetoothGatt, int i, int i2) {
            eja.this.c(bluetoothGatt, i, i2);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onServicesDiscovered(BluetoothGatt bluetoothGatt, int i) {
            super.onServicesDiscovered(bluetoothGatt, i);
            if (eja.this.l != null) {
                eja.this.l.removeCallbacksAndMessages(null);
            }
            LogUtil.a("HeartRateMeasureController", "HeartRateMeasureController onServicesDiscovered statusInt = ", Integer.valueOf(i));
            if (eja.this.k != 1) {
                LogUtil.a("HeartRateMeasureController", "HRPController onServicesDiscovered mState is disconnected");
            } else if (i == 0) {
                eja.this.c(bluetoothGatt, true);
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicChanged(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
            super.onCharacteristicChanged(bluetoothGatt, bluetoothGattCharacteristic);
            if (eja.this.k != 1) {
                LogUtil.a("HeartRateMeasureController", "HeartRateMeasureController onCharacteristicChanged mState is disconnected");
                return;
            }
            String string = bluetoothGattCharacteristic.getUuid().toString();
            LogUtil.a("HeartRateMeasureController", "onCharacteristicChanged characteristicId: ", string, ", characteristic.getValue: ", erh.a(bluetoothGattCharacteristic.getValue(), ""), ", characteristic.getProperties: ", Integer.valueOf(bluetoothGattCharacteristic.getProperties()));
            if (string.equalsIgnoreCase(dmz.h.toString())) {
                if (eja.this.i == null) {
                    eja.this.i = new eiw();
                }
                eja.this.i.c(bluetoothGattCharacteristic.getProperties());
                HealthData data = eja.this.i.parseData(bluetoothGattCharacteristic.getValue());
                if (!(data instanceof enb)) {
                    LogUtil.a("HeartRateMeasureController", "onCharacteristicChanged healthData healthData instanceof HeartRate is false");
                    return;
                }
                enb enbVar = (enb) data;
                if (eja.this.f33055b != null) {
                    eja.this.f33055b.onDataChanged(eja.this.mDevice, enbVar);
                }
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onDescriptorWrite(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
            super.onDescriptorWrite(bluetoothGatt, bluetoothGattDescriptor, i);
            if (eja.this.k != 1) {
                LogUtil.a("HeartRateMeasureController", "HeartRateMeasureController onDescriptorWrite mState is disconnected");
            }
        }
    };
    private eiw i = new eiw();

    static /* synthetic */ int m(eja ejaVar) {
        int i = ejaVar.d;
        ejaVar.d = i + 1;
        return i;
    }

    private eja() {
        b();
    }

    public static eja a() {
        eja ejaVar;
        synchronized (f33054a) {
            if (e == null) {
                e = new eja();
            }
            ejaVar = e;
        }
        return ejaVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(BluetoothGatt bluetoothGatt, int i, int i2) {
        if (i2 == 2) {
            LogUtil.a("HeartRateMeasureController", "doConnectionStateChange Connected to GATT server.");
            this.g = bluetoothGatt;
            this.k = 1;
            d dVar = this.l;
            if (dVar != null) {
                dVar.sendEmptyMessageDelayed(1, 1000L);
            }
            IHealthDeviceCallback iHealthDeviceCallback = this.f33055b;
            if (iHealthDeviceCallback != null) {
                iHealthDeviceCallback.onStatusChanged(this.mDevice, 2);
                return;
            }
            return;
        }
        if (i2 == 0) {
            LogUtil.a("HeartRateMeasureController", "doConnectionStateChange Disconnected from GATT server.");
            this.k = 0;
            if (this.j) {
                LogUtil.a("HeartRateMeasureController", "doConnectionStateChange isFirstConnect enter");
                d(this.g, this.l);
                d dVar2 = this.l;
                if (dVar2 != null) {
                    dVar2.sendEmptyMessageDelayed(4, 1000L);
                }
            }
            IHealthDeviceCallback iHealthDeviceCallback2 = this.f33055b;
            if (iHealthDeviceCallback2 != null) {
                iHealthDeviceCallback2.onStatusChanged(this.mDevice, 3);
                return;
            }
            return;
        }
        LogUtil.a("HeartRateMeasureController", "doConnectionStateChange other state ", Integer.valueOf(i2));
    }

    public void a(IHealthDeviceCallback iHealthDeviceCallback) {
        this.f33055b = iHealthDeviceCallback;
    }

    private void b() {
        this.f.start();
        this.l = new d(this.f.getLooper());
        ete.d().d(this.o);
    }

    @Override // com.huawei.health.ecologydevice.open.GattMeasureController, com.huawei.health.device.open.MeasureController
    public boolean prepare(HealthDevice healthDevice, IHealthDeviceCallback iHealthDeviceCallback, Bundle bundle) {
        LogUtil.a("HeartRateMeasureController", ParamConstants.CallbackMethod.ON_PREPARE);
        DeviceInfoUtilsApi deviceInfoUtilsApi = (DeviceInfoUtilsApi) Services.b("PluginDevice", DeviceInfoUtilsApi.class);
        if (ete.d().b()) {
            String name = eja.class.getName();
            this.f33055b = iHealthDeviceCallback;
            this.n = UUID.randomUUID().toString();
            deviceInfoUtilsApi.putUdsClassMap(name, a());
            emk.c().d(this.n, new eff(name));
            emk.c().c(this.n, new efd(name));
            return super.prepare(healthDevice, iHealthDeviceCallback, bundle);
        }
        if (!super.prepare(healthDevice, iHealthDeviceCallback, bundle)) {
            return false;
        }
        a(iHealthDeviceCallback);
        return true;
    }

    @Override // com.huawei.health.device.open.MeasureController
    public boolean start() {
        LogUtil.a("HeartRateMeasureController", "start");
        return true;
    }

    @Override // com.huawei.health.ecologydevice.open.GattMeasureController, com.huawei.health.device.open.MeasureController
    public void ending() {
        LogUtil.a("HeartRateMeasureController", "ending");
        BluetoothGatt bluetoothGatt = this.g;
        if (bluetoothGatt != null) {
            c(bluetoothGatt, false);
            try {
                Thread.sleep(300L);
            } catch (InterruptedException e2) {
                LogUtil.e("HeartRateMeasureController", "ending", e2.getMessage());
            }
        }
        super.ending();
        d dVar = this.l;
        if (dVar != null) {
            dVar.removeCallbacksAndMessages(null);
            this.l = null;
        }
        HandlerThread handlerThread = this.f;
        if (handlerThread != null) {
            handlerThread.quit();
        }
        if (ete.d().b()) {
            ((DeviceInfoUtilsApi) Services.b("PluginDevice", DeviceInfoUtilsApi.class)).setCharacteristicNotifyByUds(this.f33056c, dmz.t.toString(), dmz.h.toString(), false);
            d();
        }
        c();
    }

    @Override // com.huawei.health.device.open.MeasureController
    public void cleanup() {
        LogUtil.a("HeartRateMeasureController", "cleanup");
        this.j = false;
        this.d = 0;
        this.g = null;
        this.i = null;
        this.f33055b = null;
        if (ete.d().b()) {
            d();
        }
    }

    private static void c() {
        synchronized (f33054a) {
            e = null;
        }
    }

    private void d() {
        UniteDevice uniteDeviceD = ete.d().d(this.f33056c, 2);
        if (uniteDeviceD == null) {
            LogUtil.j("HeartRateMeasureController", "uniteDevice is null");
        } else {
            emk.c().a(uniteDeviceD);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(BluetoothGatt bluetoothGatt, boolean z) {
        BluetoothGattCharacteristic characteristic;
        LogUtil.a("HeartRateMeasureController", "HeartRateMeasureController setCharNotification() enabled:", Boolean.valueOf(z));
        try {
            BluetoothGattService service = bluetoothGatt.getService(dmz.t);
            if (service != null && (characteristic = service.getCharacteristic(UUID.fromString(dmz.h.toString()))) != null) {
                bluetoothGatt.setCharacteristicNotification(characteristic, z);
                BluetoothGattDescriptor descriptor = characteristic.getDescriptor(UUID.fromString(dmz.k.toString()));
                if (descriptor == null) {
                    LogUtil.j("HeartRateMeasureController", "HeartRateMeasureController setCharNotification descriptor == null");
                    return;
                }
                LogUtil.a("HeartRateMeasureController", "HeartRateMeasureController notification isEnabled:", Boolean.valueOf(z));
                if (z) {
                    descriptor.setValue(BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE);
                } else {
                    descriptor.setValue(BluetoothGattDescriptor.DISABLE_NOTIFICATION_VALUE);
                }
                bluetoothGatt.writeDescriptor(descriptor);
            }
        } catch (SecurityException e2) {
            LogUtil.e("HeartRateMeasureController", "setCharNotification SecurityException:", ExceptionUtils.c(e2));
        }
    }

    @Override // com.huawei.health.ecologydevice.callback.ConnectStatusCallback
    public void doDeviceConnected(int i, DeviceInfo deviceInfo) {
        LogUtil.a("HeartRateMeasureController", "doDeviceConnected Connected to GATT server. by uds");
        if (deviceInfo == null) {
            LogUtil.j("HeartRateMeasureController", "deviceInfo == null");
            return;
        }
        this.f33056c = deviceInfo.getDeviceMac();
        this.k = 1;
        IHealthDeviceCallback iHealthDeviceCallback = this.f33055b;
        if (iHealthDeviceCallback != null) {
            iHealthDeviceCallback.onStatusChanged(this.mDevice, 2);
        }
        d dVar = this.l;
        if (dVar != null) {
            dVar.removeCallbacksAndMessages(null);
        }
        if (this.k != 1) {
            LogUtil.a("HeartRateMeasureController", "HRPController onServicesDiscovered mState is disconnected");
        } else {
            ((DeviceInfoUtilsApi) Services.b("PluginDevice", DeviceInfoUtilsApi.class)).setCharacteristicNotifyByUds(this.f33056c, dmz.t.toString(), dmz.h.toString(), true);
        }
    }

    @Override // com.huawei.health.ecologydevice.callback.ConnectStatusCallback
    public void doDeviceDisconnect(int i) {
        LogUtil.a("HeartRateMeasureController", "doDeviceDisconnect Disconnected from GATT server. by uds");
        this.k = 0;
        if (this.j) {
            LogUtil.a("HeartRateMeasureController", "doConnectionStateChange isFirstConnect enter");
            d(this.g, this.l);
            d dVar = this.l;
            if (dVar != null) {
                dVar.sendEmptyMessageDelayed(4, 1000L);
            }
        }
        IHealthDeviceCallback iHealthDeviceCallback = this.f33055b;
        if (iHealthDeviceCallback != null) {
            iHealthDeviceCallback.onStatusChanged(this.mDevice, 3);
        }
    }

    @Override // com.huawei.health.ecologydevice.callback.ConnectStatusCallback
    public void doDeviceConnecting(int i) {
        LogUtil.a("HeartRateMeasureController", "doDeviceConnecting connecting by uds");
    }

    @Override // com.huawei.health.ecologydevice.callback.DataChangedCallback
    public void onDataChanged(cmm cmmVar) {
        if (cmmVar == null) {
            LogUtil.j("HeartRateMeasureController", "dataFrame == null");
            return;
        }
        if (this.k != 1) {
            LogUtil.a("HeartRateMeasureController", "HeartRateMeasureController onCharacteristicChanged mState is disconnected");
            return;
        }
        if (dmz.h.toString().equalsIgnoreCase(cmmVar.b())) {
            if (this.i == null) {
                this.i = new eiw();
            }
            this.i.c(cmmVar.a());
            HealthData data = this.i.parseData(cmmVar.d());
            if (data instanceof enb) {
                LogUtil.a("HeartRateMeasureController", " mBaseResponseCallback ", this.f33055b);
                enb enbVar = (enb) data;
                IHealthDeviceCallback iHealthDeviceCallback = this.f33055b;
                if (iHealthDeviceCallback != null) {
                    iHealthDeviceCallback.onDataChanged(this.mDevice, enbVar);
                }
            }
        }
    }

    class d extends Handler {
        d(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            LogUtil.a("HeartRateMeasureController", "HeartRateMeasureController receive msg : ", Integer.valueOf(message.what));
            try {
                int i = message.what;
                if (i == 1) {
                    if (eja.this.g != null) {
                        sendEmptyMessageDelayed(2, 10000L);
                        eja ejaVar = eja.this;
                        ejaVar.m = ejaVar.g.discoverServices();
                        LogUtil.a("HeartRateMeasureController", "start service discovery:", Boolean.valueOf(eja.this.m));
                        return;
                    }
                    return;
                }
                if (i != 2) {
                    if (i == 3) {
                        eja.this.mDevice.connectAsync(null);
                        return;
                    } else {
                        if (i != 4) {
                            return;
                        }
                        eja.this.mDevice.e();
                        return;
                    }
                }
                removeMessages(2);
                if (eja.this.d >= 2) {
                    LogUtil.j("HeartRateMeasureController", "Times IS OUT! The mConnectTryNum = ", Integer.valueOf(eja.this.d));
                    return;
                }
                eja.m(eja.this);
                eja ejaVar2 = eja.this;
                ejaVar2.d(ejaVar2.g, eja.this.l);
                if (eja.this.l != null) {
                    eja.this.l.sendEmptyMessageDelayed(3, 1000L);
                }
            } catch (SecurityException e) {
                LogUtil.e("HeartRateMeasureController", "handleMessage SecurityException:", ExceptionUtils.c(e));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(BluetoothGatt bluetoothGatt, d dVar) {
        if (bluetoothGatt != null) {
            LogUtil.a("HeartRateMeasureController", "start to close gatt...");
            try {
                bluetoothGatt.close();
            } catch (SecurityException e2) {
                LogUtil.e("HeartRateMeasureController", "closeBluetoothGattAndRemoveMsg SecurityException:", ExceptionUtils.c(e2));
                return;
            }
        }
        if (dVar != null) {
            dVar.removeCallbacksAndMessages(null);
        }
        if (ete.d().b()) {
            d();
        }
    }

    @Override // com.huawei.health.ecologydevice.open.GattMeasureController
    public BluetoothGattCallback getGattCallbackImpl() {
        return this.h;
    }
}
