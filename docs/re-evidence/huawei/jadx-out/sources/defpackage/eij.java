package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import android.bluetooth.BluetoothManager;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.huawei.devicesdk.entity.ConnectMode;
import com.huawei.devicesdk.entity.DeviceInfo;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.handler.ExtendHandler;
import com.huawei.haf.handler.HandlerCenter;
import com.huawei.health.device.api.DeviceInfoUtilsApi;
import com.huawei.health.device.open.data.model.HealthData;
import com.huawei.health.ecologydevice.callback.NfcMeasureCallback;
import com.huawei.health.ecologydevice.fitness.util.RopeStateMonitor;
import com.huawei.health.ecologydevice.kit.blp.BaseBloodPressureManager;
import com.huawei.health.ecologydevice.manager.BloodPressureStartFromDeviceHelper;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.unitedevice.entity.UniteDevice;
import health.compact.a.Services;
import java.util.UUID;

/* JADX INFO: loaded from: classes7.dex */
public class eij extends BaseBloodPressureManager implements RopeStateMonitor.StateChangeListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static eij f33028c;
    private static final Object d = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private NfcMeasureCallback f33029a;
    private RopeStateMonitor e;
    private BluetoothManager f;
    private BluetoothAdapter g;
    private BluetoothGattCharacteristic h;
    private BluetoothDevice i;
    private BluetoothGatt j;
    private BluetoothGattCharacteristic l;
    private efx n;
    private BluetoothGattCharacteristic o;
    private int p;
    private eik q;
    private BluetoothGattCharacteristic t;
    private String u;
    private String k = "";
    private boolean s = false;
    private int v = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f33030b = 3;
    private ExtendHandler m = null;
    private BluetoothGattCallback r = new BluetoothGattCallback() { // from class: eij.3
        @Override // android.bluetooth.BluetoothGattCallback
        public void onConnectionStateChange(BluetoothGatt bluetoothGatt, int i, int i2) {
            super.onConnectionStateChange(bluetoothGatt, i, i2);
            eij.this.e(bluetoothGatt, i, i2);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onServicesDiscovered(BluetoothGatt bluetoothGatt, int i) {
            super.onServicesDiscovered(bluetoothGatt, i);
            eij.this.b(bluetoothGatt, i);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicChanged(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
            super.onCharacteristicChanged(bluetoothGatt, bluetoothGattCharacteristic);
            UUID uuid = bluetoothGattCharacteristic.getUuid();
            LogUtil.a("BloodPressureManager", "onCharacteristicChanged mBaseResponseCallback:", eij.this.f33029a, ",parser:", eij.this.q, ",data = ", erh.a(bluetoothGattCharacteristic.getValue(), ""));
            if (dmz.f32038c.equals(uuid)) {
                eij.this.f();
                HealthData data = eij.this.q.parseData(bluetoothGattCharacteristic.getValue());
                if (data instanceof eni) {
                    LogUtil.a("BloodPressureManager", "onCharacteristicChanged HeartRateAndBloodPressure");
                    if (eij.this.f33029a != null) {
                        LogUtil.a("BloodPressureManager", "onCharacteristicChanged mBaseResponseCallback != null");
                        eij.this.f33029a.onDataChanged(eij.this.n, data);
                        return;
                    }
                    return;
                }
                return;
            }
            if (dmz.q.equals(uuid)) {
                etn.c(bluetoothGatt, eij.this.o, eij.this.l);
            } else if (dmz.ah.equals(uuid)) {
                eij.this.f();
                eij.this.d(bluetoothGattCharacteristic.getValue(), eij.this.q);
            } else {
                LogUtil.a("BloodPressureManager", "onCharacteristicChanged other uuid ");
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onDescriptorWrite(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
            super.onDescriptorWrite(bluetoothGatt, bluetoothGattDescriptor, i);
            LogUtil.a("BloodPressureManager", "onDescriptorWrite status:", Integer.valueOf(i));
            if (i != 0) {
                return;
            }
            if (bluetoothGattDescriptor == null || bluetoothGattDescriptor.getCharacteristic() == null) {
                LogUtil.j("BloodPressureManager", "descriptor == null || descriptor.getCharacteristic == null");
                return;
            }
            if (dmz.f32038c.equals(bluetoothGattDescriptor.getCharacteristic().getUuid())) {
                if (eij.this.l == null && eij.this.o == null) {
                    return;
                }
                LogUtil.a("BloodPressureManager", "enter setDateTime");
                etn.c(bluetoothGatt, eij.this.o, eij.this.l);
            }
        }
    };

    @Override // com.huawei.health.ecologydevice.fitness.util.RopeStateMonitor.StateChangeListener
    public void onBondStateChanged(int i, BluetoothDevice bluetoothDevice) {
    }

    private eij() {
        f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        if (this.q == null) {
            this.q = new eik();
        }
    }

    public void a(String str) {
        this.u = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(byte[] bArr, eik eikVar) {
        if (eikVar == null) {
            LogUtil.a("BloodPressureManager", "bloodPressureDataParser is null");
            return;
        }
        int iE = eikVar.e(bArr);
        LogUtil.a("BloodPressureManager", "Click Start on the device.controlType is ", Integer.valueOf(iE));
        if (iE == 0) {
            LogUtil.a("BloodPressureManager", "BloodPressureControl.MEASUREMENT_STATE_START");
            NfcMeasureCallback nfcMeasureCallback = this.f33029a;
            if (nfcMeasureCallback != null) {
                nfcMeasureCallback.onStartMeasuring();
                return;
            }
            return;
        }
        LogUtil.a("BloodPressureManager", "controlType is ", Integer.valueOf(iE));
    }

    public static eij c() {
        eij eijVar;
        synchronized (d) {
            if (f33028c == null) {
                f33028c = new eij();
            }
            eijVar = f33028c;
        }
        return eijVar;
    }

    @Override // com.huawei.health.ecologydevice.kit.blp.BaseBloodPressureManager
    public boolean init(NfcMeasureCallback nfcMeasureCallback) {
        super.init(nfcMeasureCallback);
        e(nfcMeasureCallback);
        n();
        k();
        if (this.g != null) {
            LogUtil.a("BloodPressureManager", "Init already.");
            return true;
        }
        if (this.f == null && (BaseApplication.getContext().getSystemService("bluetooth") instanceof BluetoothManager)) {
            this.f = (BluetoothManager) BaseApplication.getContext().getSystemService("bluetooth");
        }
        BluetoothManager bluetoothManager = this.f;
        if (bluetoothManager == null) {
            LogUtil.e("BloodPressureManager", "Unable to initAdapter BluetoothManager.");
            return false;
        }
        BluetoothAdapter adapter = bluetoothManager.getAdapter();
        this.g = adapter;
        if (adapter != null) {
            return true;
        }
        LogUtil.e("BloodPressureManager", "Unable to obtain BluetoothAdapter.");
        return false;
    }

    private void e(NfcMeasureCallback nfcMeasureCallback) {
        this.f33029a = nfcMeasureCallback;
    }

    private void q() {
        this.f33029a = null;
    }

    private void n() {
        if (this.m == null) {
            this.m = HandlerCenter.b(new d(), "BloodPressureManager");
        }
    }

    class d implements Handler.Callback {
        private d() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                LogUtil.a("BloodPressureManager", "MSG_RECONNECT: now will reconnect");
                eij.this.e();
            } else if (i == 2) {
                LogUtil.a("BloodPressureManager", "DISCONNECT_WHEN_TIMEOUT");
                eij.this.o();
            } else if (i == 3) {
                LogUtil.a("BloodPressureManager", "TIMER_OUT");
                if (eij.this.f33029a != null) {
                    eij.this.f33029a.onStatusChanged(11, eij.this.p, eij.this.v);
                }
                eij.this.a();
            } else if (i == 4) {
                LogUtil.a("BloodPressureManager", "BLUETOOTH_TURN_OFF");
                if (eij.this.f33029a != null) {
                    eij.this.f33029a.onStatusChanged(12, eij.this.p, eij.this.v);
                }
            } else {
                LogUtil.a("BloodPressureManager", "default case");
                return false;
            }
            return true;
        }
    }

    private void k() {
        RopeStateMonitor ropeStateMonitor = this.e;
        if (ropeStateMonitor != null) {
            ropeStateMonitor.a();
        }
        RopeStateMonitor ropeStateMonitor2 = new RopeStateMonitor(BaseApplication.getContext(), this);
        this.e = ropeStateMonitor2;
        ropeStateMonitor2.d();
    }

    private void t() {
        if (this.m != null) {
            LogUtil.a("BloodPressureManager", "releaseHandler mExtendHandler will removeCallbacksAndMessages");
            this.m.removeTasksAndMessages();
            this.m.quit(false);
            this.m = null;
        }
    }

    private void m() {
        RopeStateMonitor ropeStateMonitor = this.e;
        if (ropeStateMonitor != null) {
            ropeStateMonitor.a();
            this.e = null;
        }
    }

    @Override // com.huawei.health.ecologydevice.kit.blp.BaseBloodPressureManager
    public void releaseResource() {
        super.releaseResource();
        LogUtil.a("BloodPressureManager", "Enter release");
        a();
        q();
        t();
        m();
        i();
    }

    private static void i() {
        synchronized (d) {
            f33028c = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        LogUtil.a("BloodPressureManager", "meet the reconnect conditions");
        int i = this.v + 1;
        this.v = i;
        if (i == 1) {
            LogUtil.a("BloodPressureManager", "first reconnect zoro");
            NfcMeasureCallback nfcMeasureCallback = this.f33029a;
            if (nfcMeasureCallback != null) {
                nfcMeasureCallback.onStatusChanged(10, this.p, this.v);
            }
        }
        g();
        c(1, 2000L);
    }

    private void g() {
        synchronized (d) {
            if (this.j != null) {
                LogUtil.a("BloodPressureManager", "start to close gatt...");
                try {
                    this.j.close();
                    this.j = null;
                } catch (SecurityException e) {
                    LogUtil.e("BloodPressureManager", "closeBluetoothGattBeforeReconnect SecurityException:", ExceptionUtils.c(e));
                }
            }
        }
    }

    public boolean e() {
        LogUtil.a("BloodPressureManager", "reconnect!");
        c(2, 5000L);
        try {
            if (!TextUtils.isEmpty(this.k)) {
                this.i = this.g.getRemoteDevice(this.k);
            } else {
                LogUtil.j("BloodPressureManager", "in reConnect, mac addr is empty");
                this.i = null;
            }
            if (this.i == null) {
                LogUtil.j("BloodPressureManager", "Device not found. Unable to connect.");
                return false;
            }
            BluetoothGatt bluetoothGatt = this.j;
            if (bluetoothGatt != null) {
                bluetoothGatt.close();
                this.j = null;
            }
            if (ete.d().b()) {
                h();
            } else {
                this.j = this.i.connectGatt(dxw.d(), false, this.r);
            }
            LogUtil.a("BloodPressureManager", "Trying to create new connection (in reConnect).");
            return true;
        } catch (SecurityException e) {
            LogUtil.e("BloodPressureManager", "reconnection SecurityException:", ExceptionUtils.c(e));
            return false;
        }
    }

    private void c(int i, long j) {
        ExtendHandler extendHandler = this.m;
        if (extendHandler != null) {
            extendHandler.sendEmptyMessage(i, j);
        }
    }

    private void b(int i) {
        ExtendHandler extendHandler = this.m;
        if (extendHandler != null) {
            extendHandler.sendEmptyMessage(i);
        }
    }

    public void b(String str) {
        LogUtil.a("BloodPressureManager", "in connectByMac");
        if (this.m == null) {
            LogUtil.j("BloodPressureManager", "connectByMac,mExtendHandler is null,create");
            this.m = HandlerCenter.b(new d(), "BloodPressureManager");
        }
        c(3, 30000L);
        c(2, 5000L);
        if (this.g == null || TextUtils.isEmpty(str)) {
            LogUtil.j("BloodPressureManager", "BluetoothAdapter not initialized or unspecified address.");
            this.i = null;
            return;
        }
        if (str.equals(this.k) && this.j != null) {
            LogUtil.a("BloodPressureManager", "Trying to use an existing mBluetoothGatt for connection.");
            return;
        }
        try {
            BluetoothDevice remoteDevice = this.g.getRemoteDevice(str);
            this.i = remoteDevice;
            if (remoteDevice == null) {
                return;
            }
            this.n = efx.b(remoteDevice);
            ExtendHandler extendHandler = this.m;
            if (extendHandler != null) {
                extendHandler.removeMessages(2);
            }
            b(this.i);
        } catch (IllegalArgumentException unused) {
            LogUtil.e("BloodPressureManager", "mac IllegalArgumentException");
        }
    }

    private void b(BluetoothDevice bluetoothDevice) {
        LogUtil.a("BloodPressureManager", "in connectDevice");
        c(2, 5000L);
        if (bluetoothDevice == null) {
            LogUtil.j("BloodPressureManager", "connectDevice btDevice not initialized");
            return;
        }
        if (this.m == null) {
            this.m = HandlerCenter.b(new d(), "BloodPressureManager");
        }
        try {
            String address = bluetoothDevice.getAddress();
            if (address.equals(this.k) && this.j != null) {
                LogUtil.a("BloodPressureManager", "Trying to use an existing BluetoothGatt for connection");
                return;
            }
            this.k = address;
            this.s = false;
            BluetoothGatt bluetoothGatt = this.j;
            if (bluetoothGatt != null) {
                bluetoothGatt.close();
                this.j = null;
            }
            if (ete.d().b()) {
                h();
            } else {
                this.j = bluetoothDevice.connectGatt(dxw.d(), false, this.r);
            }
            LogUtil.a("BloodPressureManager", "Trying to create new connection");
        } catch (SecurityException e) {
            LogUtil.e("BloodPressureManager", "connectDevice SecurityException:", ExceptionUtils.c(e));
        }
    }

    private void h() {
        UniteDevice uniteDeviceD = ete.d().d(this.k, 2);
        if (uniteDeviceD == null) {
            LogUtil.j("BloodPressureManager", "udsDevice is null");
        } else {
            emk.c().c(uniteDeviceD, ConnectMode.TRANSPARENT, 2, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(BluetoothGatt bluetoothGatt, int i, int i2) {
        LogUtil.a("BloodPressureManager", "doConnectionStateChange, oldStatus=", Integer.valueOf(i), " NewStates=", Integer.valueOf(i2));
        this.p = i2;
        if (i2 == 2) {
            LogUtil.a("BloodPressureManager", "doConnectionStateChange STATUS_CONNECTED.");
            this.j = bluetoothGatt;
            if (BloodPressureStartFromDeviceHelper.a()) {
                LogUtil.a("BloodPressureManager", "NewMeasurementProcedure discoverService");
                b();
                return;
            }
            this.s = true;
            ExtendHandler extendHandler = this.m;
            if (extendHandler != null) {
                extendHandler.removeMessages(3);
                this.m.removeMessages(2);
            }
            this.f33030b = 2;
            this.v = 0;
            NfcMeasureCallback nfcMeasureCallback = this.f33029a;
            if (nfcMeasureCallback != null) {
                nfcMeasureCallback.onStatusChanged(2, i2, 0);
                return;
            }
            return;
        }
        if (i2 != 0) {
            if (i2 == 1) {
                LogUtil.d("BloodPressureManager", "doConnectionStateChange connecting and newState =", Integer.valueOf(i2));
                this.f33030b = 1;
                NfcMeasureCallback nfcMeasureCallback2 = this.f33029a;
                if (nfcMeasureCallback2 != null) {
                    nfcMeasureCallback2.onStatusChanged(1, i2, this.v);
                    return;
                }
                return;
            }
            LogUtil.j("BloodPressureManager", "doConnectionStateChange other State = ", Integer.valueOf(i2));
            return;
        }
        LogUtil.a("BloodPressureManager", "doConnectionStateChange STATE_DISCONNECTED.");
        ExtendHandler extendHandler2 = this.m;
        if (extendHandler2 != null) {
            extendHandler2.removeMessages(2);
        }
        this.f33030b = 3;
        NfcMeasureCallback nfcMeasureCallback3 = this.f33029a;
        if (nfcMeasureCallback3 != null) {
            nfcMeasureCallback3.onStatusChanged(3, i2, this.v);
        }
        if (this.s) {
            a();
            LogUtil.a("BloodPressureManager", "doConnectionStateChange ConnectedBefore, releaseBleSource.");
        } else {
            o();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(BluetoothGatt bluetoothGatt, int i) {
        LogUtil.a("BloodPressureManager", "Enter doServiceDiscover, status:", Integer.valueOf(i));
        if (i != 0) {
            LogUtil.j("BloodPressureManager", "doServiceDiscover failed");
            return;
        }
        try {
            BluetoothGattService service = bluetoothGatt.getService(dmz.ad);
            if (service == null) {
                LogUtil.j("BloodPressureManager", "gattService is null");
                return;
            }
            this.h = service.getCharacteristic(dmz.f32038c);
            this.o = service.getCharacteristic(dmz.r);
            BluetoothGattCharacteristic characteristic = service.getCharacteristic(dmz.ah);
            this.t = characteristic;
            if (characteristic != null) {
                LogUtil.a("BloodPressureManager", " doServiceDiscover setCharacteristicNotification isEnable:", Boolean.valueOf(bluetoothGatt.setCharacteristicNotification(characteristic, true)));
            }
            if (this.h != null) {
                try {
                    Thread.sleep(500L);
                } catch (InterruptedException unused) {
                    LogUtil.e("BloodPressureManager", "InterruptedException");
                }
                LogUtil.a("BloodPressureManager", "doServiceDiscover enableIndication isEnable: ", Boolean.valueOf(e(bluetoothGatt, this.h)));
            }
            try {
                Thread.sleep(600L);
            } catch (InterruptedException unused2) {
                LogUtil.e("BloodPressureManager", "InterruptedException");
            }
            BluetoothGattService service2 = bluetoothGatt.getService(dmz.p);
            if (service2 != null) {
                BluetoothGattCharacteristic characteristic2 = service2.getCharacteristic(dmz.q);
                this.l = characteristic2;
                if (characteristic2 == null) {
                    return;
                }
                LogUtil.a("BloodPressureManager", "mCurrentTimeCharacteristic setCharacteristicNotification: ", Boolean.valueOf(bluetoothGatt.setCharacteristicNotification(characteristic2, true)));
                BluetoothGattDescriptor descriptor = this.l.getDescriptor(dmz.k);
                if (descriptor != null) {
                    descriptor.setValue(BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE);
                    bluetoothGatt.writeDescriptor(descriptor);
                }
            }
            a(i);
        } catch (SecurityException e) {
            LogUtil.e("BloodPressureManager", "doServiceDiscover SecurityException:", ExceptionUtils.c(e));
        }
    }

    private void a(int i) {
        LogUtil.a("BloodPressureManager", "gatt service discover success");
        if (BloodPressureStartFromDeviceHelper.a()) {
            LogUtil.a("BloodPressureManager", "NewMeasurementProcedure connect success");
            this.s = true;
            ExtendHandler extendHandler = this.m;
            if (extendHandler != null) {
                extendHandler.removeMessages(3);
                this.m.removeMessages(2);
            }
            this.f33030b = 2;
            this.v = 0;
            NfcMeasureCallback nfcMeasureCallback = this.f33029a;
            if (nfcMeasureCallback != null) {
                nfcMeasureCallback.onStatusChanged(2, i, 0);
            }
        }
    }

    public boolean e(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        LogUtil.a("BloodPressureManager", "Enter enableIndications");
        if (bluetoothGatt == null || bluetoothGattCharacteristic == null) {
            LogUtil.j("BloodPressureManager", "enableIndications gatt or characteristic is null");
            return false;
        }
        try {
            if ((bluetoothGattCharacteristic.getProperties() & 32) == 0) {
                return false;
            }
            bluetoothGatt.setCharacteristicNotification(bluetoothGattCharacteristic, true);
            BluetoothGattDescriptor descriptor = bluetoothGattCharacteristic.getDescriptor(dmz.k);
            if (descriptor != null) {
                if (BloodPressureStartFromDeviceHelper.a()) {
                    LogUtil.a("BloodPressureManager", "set indication value BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE");
                    descriptor.setValue(BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE);
                } else {
                    descriptor.setValue(BluetoothGattDescriptor.ENABLE_INDICATION_VALUE);
                }
                return bluetoothGatt.writeDescriptor(descriptor);
            }
            LogUtil.j("BloodPressureManager", "descriptor is null");
            return false;
        } catch (SecurityException e) {
            LogUtil.e("BloodPressureManager", "enableIndications SecurityException:", ExceptionUtils.c(e));
        }
    }

    public void a() {
        LogUtil.a("BloodPressureManager", "releaseBleSource");
        synchronized (d) {
            if (this.j != null) {
                LogUtil.a("BloodPressureManager", "start to close gatt...");
                try {
                    this.j.close();
                    this.j = null;
                } catch (SecurityException e) {
                    LogUtil.e("BloodPressureManager", "releaseBleSource SecurityException:", ExceptionUtils.c(e));
                    return;
                }
            }
            if (ete.d().b()) {
                l();
            }
            t();
            this.f33030b = 3;
            this.v = 0;
            this.k = null;
            this.i = null;
            this.h = null;
            this.o = null;
            this.l = null;
            this.q = null;
        }
    }

    private void l() {
        UniteDevice uniteDeviceD = ete.d().d(this.k, 2);
        if (uniteDeviceD == null) {
            uniteDeviceD = null;
        }
        if (uniteDeviceD == null) {
            LogUtil.j("BloodPressureManager", "udsDevice is null");
        } else {
            emk.c().a(uniteDeviceD);
        }
    }

    public int d() {
        return this.f33030b;
    }

    public void b() {
        DeviceInfoUtilsApi deviceInfoUtilsApi = (DeviceInfoUtilsApi) Services.b("PluginDevice", DeviceInfoUtilsApi.class);
        if (ete.d().b()) {
            deviceInfoUtilsApi.setCharacteristicNotifyByUds(this.k, dmz.ad.toString(), dmz.f32038c.toString(), true);
            try {
                Thread.sleep(600L);
            } catch (InterruptedException unused) {
                LogUtil.e("BloodPressureManager", "discoverService InterruptedException");
            }
            deviceInfoUtilsApi.setCharacteristicNotifyByUds(this.k, dmz.p.toString(), dmz.q.toString(), true);
            return;
        }
        BluetoothGatt bluetoothGatt = this.j;
        if (bluetoothGatt == null) {
            LogUtil.j("BloodPressureManager", "mBluetoothGatt == null");
            return;
        }
        try {
            bluetoothGatt.discoverServices();
        } catch (SecurityException e) {
            LogUtil.e("BloodPressureManager", "discoverService SecurityException:", ExceptionUtils.c(e));
        }
    }

    public void j() {
        if (this.t != null) {
            f();
            LogUtil.a("BloodPressureManager", "setBlpControl ", Boolean.valueOf(this.q.e(this.j, this.t, 1, 0)));
        } else {
            LogUtil.a("BloodPressureManager", "mMeasuringCharacteristic is null");
        }
    }

    @Override // com.huawei.health.ecologydevice.fitness.util.RopeStateMonitor.StateChangeListener
    public void onSwitchStateChanged(int i) {
        if (i != 3) {
            if (i != 4) {
                LogUtil.a("BloodPressureManager", "BluetoothSwitchMonitorReceiver other blueState: ", Integer.valueOf(i));
                return;
            } else {
                LogUtil.a("BloodPressureManager", "BLUETOOTH_SWITCH_ON");
                return;
            }
        }
        LogUtil.a("BloodPressureManager", "BLUETOOTH_SWITCH_OFF");
        if (!this.s) {
            LogUtil.a("BloodPressureManager", "mIsBrokenButHasConnectedBefore is false");
            b(4);
        } else {
            e((BluetoothGatt) null, 2, 0);
        }
    }

    @Override // com.huawei.health.ecologydevice.callback.ConnectStatusCallback
    public void doDeviceConnected(int i, DeviceInfo deviceInfo) {
        if (deviceInfo == null || deviceInfo.getDeviceMac() == null) {
            LogUtil.j("BloodPressureManager", "deviceInfo == null || deviceMac == null");
            return;
        }
        LogUtil.a("BloodPressureManager", "doConnectionStateChange STATUS_CONNECTED.");
        this.p = i;
        this.s = true;
        ExtendHandler extendHandler = this.m;
        if (extendHandler != null) {
            extendHandler.removeMessages(3);
            this.m.removeMessages(2);
        }
        this.f33030b = 2;
        this.v = 0;
        NfcMeasureCallback nfcMeasureCallback = this.f33029a;
        if (nfcMeasureCallback != null) {
            nfcMeasureCallback.onStatusChanged(2, this.p, 0);
        }
    }

    @Override // com.huawei.health.ecologydevice.callback.ConnectStatusCallback
    public void doDeviceDisconnect(int i) {
        LogUtil.a("BloodPressureManager", "doConnectionStateChange STATE_DISCONNECTED.");
        ExtendHandler extendHandler = this.m;
        if (extendHandler != null) {
            extendHandler.removeMessages(2);
        }
        this.f33030b = 3;
        NfcMeasureCallback nfcMeasureCallback = this.f33029a;
        if (nfcMeasureCallback != null) {
            nfcMeasureCallback.onStatusChanged(3, this.p, this.v);
        }
        if (this.s) {
            a();
            LogUtil.a("BloodPressureManager", "doConnectionStateChange ConnectedBefore, releaseBleSource.");
        } else {
            o();
        }
    }

    @Override // com.huawei.health.ecologydevice.callback.ConnectStatusCallback
    public void doDeviceConnecting(int i) {
        this.p = i;
        LogUtil.a("BloodPressureManager", "doConnectionStateChange connecting and newState =", Integer.valueOf(i));
        this.f33030b = 1;
        NfcMeasureCallback nfcMeasureCallback = this.f33029a;
        if (nfcMeasureCallback != null) {
            nfcMeasureCallback.onStatusChanged(1, this.p, this.v);
        }
    }

    @Override // com.huawei.health.ecologydevice.callback.DataChangedCallback
    public void onDataChanged(cmm cmmVar) {
        if (cmmVar == null) {
            LogUtil.j("BloodPressureManager", "dataContents == null");
            return;
        }
        String strB = cmmVar.b();
        if (strB == null) {
            LogUtil.j("BloodPressureManager", "characterUuid == null");
            return;
        }
        if (dmz.f32038c.toString().equals(strB)) {
            f();
            HealthData data = this.q.parseData(cmmVar.d());
            if (data instanceof eni) {
                LogUtil.a("BloodPressureManager", "onCharacteristicChanged HeartRateAndBloodPressure");
                if (this.f33029a != null) {
                    LogUtil.a("BloodPressureManager", "onCharacteristicChanged mBaseResponseCallback != null");
                    this.f33029a.onDataChanged(this.n, data);
                }
            }
            ete.d().c(dmz.ad.toString(), dmz.f32038c.toString(), this.k);
            return;
        }
        if (!dmz.q.toString().equals(strB)) {
            LogUtil.a("BloodPressureManager", "onCharacteristicChanged other uuid ");
        } else {
            ete.d().c(dmz.p.toString(), dmz.r.toString(), this.k);
        }
    }
}
