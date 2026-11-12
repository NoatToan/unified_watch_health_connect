package com.huawei.health.ecologydevice.fitness;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import android.bluetooth.BluetoothManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.handler.ExtendHandler;
import com.huawei.haf.handler.HandlerCenter;
import com.huawei.health.device.model.HealthDevice;
import com.huawei.health.ecologydevice.fitness.dataparser.secondropecommand.CommandArrayList;
import com.huawei.health.ecologydevice.fitness.dataparser.secondropecommand.Receiver;
import com.huawei.health.ecologydevice.fitness.datastruct.BaseRopeData;
import com.huawei.health.ecologydevice.ui.util.PermissionDialogHelper;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.ble.BleConstants;
import defpackage.egq;
import defpackage.erh;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.Locale;
import java.util.UUID;

/* JADX INFO: loaded from: classes7.dex */
public class RopeFittingsClient implements Receiver.CommandReceiveCallback {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private BluetoothAdapter f6498c;
    private BluetoothManager f;
    private BluetoothGatt h;
    private int i;
    private BluetoothDevice j;
    private String k;
    private FittingsMessageOrStateCallback m;
    private ExtendHandler n;
    private BluetoothGattCharacteristic s;
    private BluetoothGattCharacteristic t;
    private ScannerController x;
    private RopeDataQueues y;
    private static final UUID e = UUID.fromString("0000fff0-0000-1000-8000-00805f9b34fb");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final UUID f6496a = UUID.fromString("0000fff2-0000-1000-8000-00805f9b34fb");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final UUID f6497b = UUID.fromString("0000fff3-0000-1000-8000-00805f9b34fb");
    private static final UUID d = UUID.fromString(BleConstants.CLIENT_CHARACTERISTIC_CONFIG_DESCRIPTOR_UUID);
    private long g = 0;
    private int r = 0;
    private boolean q = false;
    private boolean o = false;
    private int u = 0;
    private final BluetoothGattCallback l = new BluetoothGattCallback() { // from class: com.huawei.health.ecologydevice.fitness.RopeFittingsClient.3
        @Override // android.bluetooth.BluetoothGattCallback
        public void onConnectionStateChange(BluetoothGatt bluetoothGatt, int i, int i2) {
            RopeFittingsClient.this.b(bluetoothGatt, i, i2);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onServicesDiscovered(BluetoothGatt bluetoothGatt, int i) {
            super.onServicesDiscovered(bluetoothGatt, i);
            RopeFittingsClient.this.d(bluetoothGatt, i);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicChanged(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
            super.onCharacteristicChanged(bluetoothGatt, bluetoothGattCharacteristic);
            RopeFittingsClient.this.b(bluetoothGattCharacteristic);
        }
    };
    private egq p = new egq();

    public interface FittingsMessageOrStateCallback {
        void onNewMessage(String str, int i, Bundle bundle);

        void onStateChange(String str, String str2);
    }

    public RopeFittingsClient(String str) {
        this.k = str;
        f();
        j();
        i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        if (bluetoothGattCharacteristic == null || this.m == null) {
            LogUtil.a("RopeFittingsClient", "characteristic == null?", Boolean.valueOf(bluetoothGattCharacteristic == null), " mFittingsMessageOrStateCallback == null ?", Boolean.valueOf(this.m == null));
            return;
        }
        UUID uuid = bluetoothGattCharacteristic.getUuid();
        if (uuid == null) {
            LogUtil.a("RopeFittingsClient", "onCharacteristicChanged, charUUID is null");
            return;
        }
        String upperCase = uuid.toString().toUpperCase(Locale.ENGLISH);
        LogUtil.a("RopeFittingsClient", "onFitnessCharacteristicChanged, charUUID is not null:" + upperCase);
        String strA = erh.a(bluetoothGattCharacteristic.getValue(), "");
        LogUtil.a("RopeFittingsClient", "onFitnessCharacteristicChanged, DATA:", strA);
        if ("0000fff3-0000-1000-8000-00805f9b34fb".toUpperCase(Locale.ENGLISH).equals(upperCase)) {
            Receiver.c().c(this);
            Receiver.c().d(bluetoothGattCharacteristic.getValue());
        } else {
            LogUtil.a("RopeFittingsClient", "onFitnessCharacteristicChanged, value:" + strA);
        }
    }

    private void i() {
        RopeDataQueues ropeDataQueues = new RopeDataQueues(1000L, 500L);
        this.y = ropeDataQueues;
        ropeDataQueues.b(new RopeDataQueues.RopeDataListener() { // from class: egm
            @Override // com.huawei.health.ecologydevice.fitness.RopeDataQueues.RopeDataListener
            public final void onResult(byte[] bArr, boolean z) {
                this.f32944b.d(bArr, z);
            }
        });
    }

    public /* synthetic */ void d(byte[] bArr, boolean z) {
        e(z ? this.s : this.t, bArr);
    }

    private void j() {
        if (this.n == null) {
            this.n = HandlerCenter.b(new c(), "RopeFittingsClient");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(BluetoothGatt bluetoothGatt, int i, int i2) {
        LogUtil.a("RopeFittingsClient", "oldStatus= ", Integer.valueOf(i), " NewStates= ", Integer.valueOf(i2));
        this.i = i2;
        ExtendHandler extendHandler = this.n;
        if (extendHandler == null) {
            b("STATUS_CONNECT_FAIL");
            return;
        }
        if (i2 == 2) {
            extendHandler.removeTasksAndMessages();
            c(bluetoothGatt);
            return;
        }
        if (i2 == 0) {
            g();
            return;
        }
        if (i2 == 1) {
            b("STATUS_GATT_STATE_CONNECTING");
        } else if (i2 == 3) {
            b("STATUS_GATT_STATE_DISCONNECTING");
        } else {
            LogUtil.d("RopeFittingsClient", "other gatt error code");
            g();
        }
    }

    private void g() {
        LogUtil.a("RopeFittingsClient", "stateIsDisconnect isNewConnect:", Boolean.valueOf(this.q), " ,scanTimes:", Integer.valueOf(this.u));
        if (this.q) {
            if (this.u == 1) {
                e();
                return;
            } else {
                LogUtil.a("RopeFittingsClient", "The reconnection mechanism is not triggered for new connection.");
                b("REQUEST_RECONNECT_DEVICE");
                return;
            }
        }
        LogUtil.a("RopeFittingsClient", "Disconnected from GATT server. mReconnectTimes:", Integer.valueOf(this.r));
        if (this.r <= 2) {
            try {
                BluetoothAdapter bluetoothAdapter = this.f6498c;
                if (bluetoothAdapter != null && bluetoothAdapter.isEnabled() && !TextUtils.isEmpty(this.k)) {
                    b("REQUEST_RECONNECT_DEVICE");
                    BluetoothGatt bluetoothGatt = this.h;
                    if (bluetoothGatt != null) {
                        bluetoothGatt.close();
                        this.h = null;
                    }
                    this.n.sendEmptyMessage(3, 1000L);
                    return;
                }
                this.n.removeTasksAndMessages();
                b("STATUS_CONNECT_FAIL");
            } catch (SecurityException e2) {
                LogUtil.e("RopeFittingsClient", "handleDisConnectStatus SecurityException:", ExceptionUtils.c(e2));
            }
        } else {
            e();
        }
    }

    private void e() {
        b("STATUS_CONNECT_FAIL");
        this.n.removeTasksAndMessages();
    }

    private void c(BluetoothGatt bluetoothGatt) {
        this.h = bluetoothGatt;
        this.r = 0;
        this.q = false;
        this.u = 0;
        LogUtil.a("RopeFittingsClient", "Connected to GATT server. Time-consuming: ", Long.valueOf(SystemClock.elapsedRealtime() - this.g));
        b("STATUS_CONNECT_SUCCESS");
        this.n.sendEmptyMessage(2, 1000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(BluetoothGatt bluetoothGatt, int i) {
        ExtendHandler extendHandler = this.n;
        if (extendHandler != null) {
            extendHandler.removeTasksAndMessages();
        }
        LogUtil.a("RopeFittingsClient", "onServicesDiscovered status: ", Integer.valueOf(i));
        if (i != 0) {
            LogUtil.j("RopeFittingsClient", "onServicesDiscovered received: ", Integer.valueOf(i));
            b("GATT_ERROR");
        } else {
            d(bluetoothGatt);
        }
    }

    private void d(BluetoothGatt bluetoothGatt) {
        if (bluetoothGatt == null) {
            LogUtil.a("RopeFittingsClient", "cannot get service bcz gatt is null");
            b("GATT_ERROR");
            return;
        }
        UUID uuid = e;
        BluetoothGattService service = bluetoothGatt.getService(uuid);
        if (service == null) {
            LogUtil.d("RopeFittingsClient", "getService, mRopeService is null:", uuid);
            b("GATT_ERROR");
            return;
        }
        LogUtil.a("RopeFittingsClient", "Rope Service found");
        b("GET_SERVICE_SUCCESS");
        e(service);
        b(service);
        e(this.s, true);
    }

    private void e(BluetoothGattCharacteristic bluetoothGattCharacteristic, boolean z) {
        try {
            if (this.h != null && bluetoothGattCharacteristic != null) {
                LogUtil.a("RopeFittingsClient", "setCharacteristicNotification isEnable:", Boolean.valueOf(z));
                this.h.setCharacteristicNotification(bluetoothGattCharacteristic, z);
                LogUtil.a("RopeFittingsClient", "setCharacteristicNotification, will mBluetoothGatt.writeDescriptor");
                BluetoothGattDescriptor descriptor = bluetoothGattCharacteristic.getDescriptor(d);
                if (descriptor == null) {
                    LogUtil.j("RopeFittingsClient", "setCharacteristicNotification descriptor is null");
                    return;
                }
                if (z) {
                    if ((bluetoothGattCharacteristic.getProperties() & 16) != 0) {
                        descriptor.setValue(BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE);
                    } else if ((bluetoothGattCharacteristic.getProperties() & 32) != 0) {
                        descriptor.setValue(BluetoothGattDescriptor.ENABLE_INDICATION_VALUE);
                    }
                } else {
                    descriptor.setValue(BluetoothGattDescriptor.DISABLE_NOTIFICATION_VALUE);
                }
                LogUtil.a("RopeFittingsClient", "setCharacteristicNotification, mBluetoothGatt.writeDescriptor:", bluetoothGattCharacteristic.getUuid().toString(), ", and Descriptor is:", descriptor.getUuid().toString());
                LogUtil.a("RopeFittingsClient", "setCharacteristicNotification isSuccess:", Boolean.valueOf(this.h.writeDescriptor(descriptor)));
                return;
            }
            LogUtil.j("RopeFittingsClient", "BluetoothAdapter not initialized");
        } catch (SecurityException e2) {
            LogUtil.e("RopeFittingsClient", "setCharacteristicNotification SecurityException:", ExceptionUtils.c(e2));
        }
    }

    private void e(BluetoothGattService bluetoothGattService) {
        BluetoothGattCharacteristic characteristic = bluetoothGattService.getCharacteristic(f6496a);
        LogUtil.a("RopeFittingsClient", "setRopeCharacteristicNotification() controlPointCharacteristic is null ", Boolean.valueOf(characteristic == null));
        this.t = characteristic;
    }

    private void b(BluetoothGattService bluetoothGattService) {
        BluetoothGattCharacteristic characteristic = bluetoothGattService.getCharacteristic(f6497b);
        LogUtil.a("RopeFittingsClient", "setRopeCharacteristicNotification() ropeConfigCharacteristic is null ", Boolean.valueOf(characteristic == null));
        this.s = characteristic;
    }

    private void f() {
        if (this.f6498c != null) {
            LogUtil.a("RopeFittingsClient", "Init already.");
            return;
        }
        if (this.f == null && (BaseApplication.b().getSystemService("bluetooth") instanceof BluetoothManager)) {
            this.f = (BluetoothManager) BaseApplication.b().getSystemService("bluetooth");
        }
        BluetoothManager bluetoothManager = this.f;
        if (bluetoothManager == null) {
            LogUtil.e("RopeFittingsClient", "Unable to initAdapter BluetoothManager.");
            return;
        }
        BluetoothAdapter adapter = bluetoothManager.getAdapter();
        this.f6498c = adapter;
        if (adapter == null) {
            LogUtil.e("RopeFittingsClient", "Unable to obtain BluetoothAdapter.");
        }
    }

    public boolean a() {
        return this.i == 2;
    }

    public void d() {
        try {
            BluetoothAdapter bluetoothAdapter = this.f6498c;
            if (bluetoothAdapter != null && bluetoothAdapter.isEnabled() && !TextUtils.isEmpty(this.k)) {
                this.g = SystemClock.elapsedRealtime();
                LogUtil.d("RopeFittingsClient", "in connectFittingsByMac,mac:", this.k);
                this.j = this.f6498c.getRemoteDevice(this.k);
                BluetoothGatt bluetoothGatt = this.h;
                if (bluetoothGatt != null) {
                    bluetoothGatt.close();
                    this.h = null;
                }
                this.h = this.j.connectGatt(BaseApplication.b(), false, this.l);
                this.r = 0;
                this.q = true;
                this.o = false;
                this.n.sendEmptyMessage(1, 10000L);
                LogUtil.d("RopeFittingsClient", "start connectFittings");
                return;
            }
            LogUtil.j("RopeFittingsClient", "BluetoothAdapter not initialized or unspecified address.");
            b("STATUS_CONNECT_FAIL");
        } catch (SecurityException e2) {
            LogUtil.e("RopeFittingsClient", "connectFittingsByMac SecurityException:", ExceptionUtils.c(e2));
        }
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("RopeFittingsClient", "mac is error");
            b("STATUS_CONNECT_FAIL");
            return;
        }
        LogUtil.a("RopeFittingsClient", "reConnectDevice!");
        try {
            BluetoothAdapter bluetoothAdapter = this.f6498c;
            if (bluetoothAdapter != null && bluetoothAdapter.isEnabled() && !TextUtils.isEmpty(str)) {
                if (this.o) {
                    LogUtil.a("RopeFittingsClient", "Active disconnection without triggering reconnection");
                    b("STATUS_CONNECT_FAIL");
                    return;
                }
                this.g = SystemClock.elapsedRealtime();
                BluetoothDevice remoteDevice = this.f6498c.getRemoteDevice(str);
                this.j = remoteDevice;
                if (remoteDevice == null) {
                    b("STATUS_CONNECT_FAIL");
                    return;
                }
                LogUtil.a("RopeFittingsClient", "Record the number of reConnections : ", Integer.valueOf(this.r));
                this.h = this.j.connectGatt(BaseApplication.b(), false, this.l);
                if (this.n != null && this.r == 0) {
                    LogUtil.a("RopeFittingsClient", "Start counting down 30 seconds.");
                    this.n.sendEmptyMessage(3, 30000L);
                }
                this.r++;
                return;
            }
            LogUtil.j("RopeFittingsClient", "BluetoothAdapter not initialized or unspecified address.");
            b("STATUS_CONNECT_FAIL");
        } catch (SecurityException e2) {
            LogUtil.e("RopeFittingsClient", "reConnectDevice SecurityException:", ExceptionUtils.c(e2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        if (this.m != null) {
            LogUtil.d("RopeFittingsClient", "status = ", str);
            this.m.onStateChange(this.k, str);
        }
    }

    public void c() {
        BluetoothGatt bluetoothGatt = this.h;
        if (bluetoothGatt != null) {
            try {
                LogUtil.a("RopeFittingsClient", "Attempting to start service discovery:", Boolean.valueOf(bluetoothGatt.discoverServices()));
            } catch (SecurityException e2) {
                LogUtil.e("RopeFittingsClient", "discoverServices SecurityException:", ExceptionUtils.c(e2));
            }
            this.n.sendEmptyMessage(4, 10000L);
            return;
        }
        b("GATT_ERROR");
    }

    public void b() {
        if (this.h == null) {
            LogUtil.j("RopeFittingsClient", "mBluetoothGatt is null");
            return;
        }
        this.m = null;
        this.o = true;
        LogUtil.a("RopeFittingsClient", "disconnect has been called");
        try {
            this.h.disconnect();
            m();
            this.y.c();
            this.r = 0;
            this.q = false;
            this.u = 0;
        } catch (SecurityException e2) {
            LogUtil.e("RopeFittingsClient", "disconnectFittings SecurityException:", ExceptionUtils.c(e2));
        }
    }

    private void m() {
        if (this.n != null) {
            LogUtil.a("RopeFittingsClient", "msgHandler will removeCallbacksAndMessages");
            this.n.removeTasksAndMessages();
            this.n.quit(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        LogUtil.a("RopeFittingsClient", "startScannerDevice");
        if (!h()) {
            LogUtil.j("RopeFittingsClient", "No Scan permission.");
            return;
        }
        ScannerController scannerController = new ScannerController(this.k);
        this.x = scannerController;
        scannerController.d(new ScannerController.ScanResultCallback() { // from class: egr
            @Override // com.huawei.health.ecologydevice.fitness.ScannerController.ScanResultCallback
            public final void onResult(int i, HealthDevice healthDevice) {
                this.f32956b.a(i, healthDevice);
            }
        });
        this.x.a();
    }

    public /* synthetic */ void a(int i, HealthDevice healthDevice) {
        ScannerController scannerController = this.x;
        if (scannerController != null) {
            scannerController.e();
        }
        ReleaseLogUtil.d("DEVMGR_EcologyDevice_RopeFittingsClient", "ScannerController code = ", Integer.valueOf(i));
        if (i == 1 && healthDevice != null) {
            this.u = 1;
            this.k = healthDevice.getAddress();
            d();
        } else if (i == 2 || i == 3) {
            e();
        } else {
            LogUtil.d("RopeFittingsClient", "other branch");
            e();
        }
    }

    private boolean h() {
        return PermissionUtil.e(BaseApplication.j(), PermissionDialogHelper.c()) == PermissionUtil.PermissionResult.GRANTED;
    }

    public void a(FittingsMessageOrStateCallback fittingsMessageOrStateCallback) {
        this.m = fittingsMessageOrStateCallback;
    }

    public void e(int[] iArr) {
        LogUtil.a("RopeFittingsClient", "sendDataToFittings");
        this.y.c(iArr, "RopeControlSubPackage");
    }

    public void a(int i, int i2) {
        LogUtil.a("RopeFittingsClient", "sendBeatSoundMessage");
        this.y.b(2, 4, new int[]{i, i2}, "RopeConfigSubPackage");
    }

    public void e(int i) {
        LogUtil.a("RopeFittingsClient", "sendHeartRateMessage");
        this.y.b(5, 0, new int[]{i}, "RopeControlSingle");
    }

    private void e(BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr) {
        LogUtil.a("RopeFittingsClient", "writeCharacteristic:", erh.a(bArr, ""));
        if (bArr == null || this.h == null || bluetoothGattCharacteristic == null) {
            LogUtil.a("RopeFittingsClient", "writeCharacteristic: characteristic is null?", Boolean.valueOf(bluetoothGattCharacteristic == null), "mBluetoothGatt is null?", Boolean.valueOf(this.h == null));
            return;
        }
        try {
            bluetoothGattCharacteristic.setValue(bArr);
            LogUtil.a("RopeFittingsClient", "writeCharacteristic isSuccess? ", Boolean.valueOf(this.h.writeCharacteristic(bluetoothGattCharacteristic)));
        } catch (SecurityException e2) {
            LogUtil.e("RopeFittingsClient", "handlewriteCharacteristic SecurityException:", ExceptionUtils.c(e2));
        }
    }

    @Override // com.huawei.health.ecologydevice.fitness.dataparser.secondropecommand.Receiver.CommandReceiveCallback
    public void onReceiveSuccess(CommandArrayList commandArrayList) {
        BaseRopeData baseRopeDataA = this.p.a(commandArrayList);
        if (baseRopeDataA == null) {
            LogUtil.a("RopeFittingsClient", "baseRopeData is null");
            return;
        }
        LogUtil.a("RopeFittingsClient", "onReceiveSuccess, fitting FitnessDataType = ", Integer.valueOf(baseRopeDataA.getFitnessDataType()));
        if (this.m != null) {
            Bundle bundle = new Bundle();
            bundle.putSerializable("FITTINGS_MESSAGE_KEY", baseRopeDataA.getFitnessHashMap());
            this.m.onNewMessage(this.k, 10000, bundle);
        }
    }

    class c implements Handler.Callback {
        private c() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                LogUtil.a("RopeFittingsClient", "MSG_CONNECT_GATT_TIMEOUT");
                if (RopeFittingsClient.this.h != null) {
                    try {
                        RopeFittingsClient.this.h.disconnect();
                        RopeFittingsClient.this.h.close();
                        RopeFittingsClient.this.h = null;
                        RopeFittingsClient.this.l();
                    } catch (SecurityException e) {
                        LogUtil.e("RopeFittingsClient", "FittingsMassageHandler handleMessage SecurityException:", ExceptionUtils.c(e));
                    }
                }
                RopeFittingsClient.this.n.removeTasksAndMessages();
                return true;
            }
            if (i == 2) {
                RopeFittingsClient.this.c();
                return true;
            }
            if (i == 3) {
                RopeFittingsClient ropeFittingsClient = RopeFittingsClient.this;
                ropeFittingsClient.a(ropeFittingsClient.k);
                return true;
            }
            if (i != 4) {
                return false;
            }
            RopeFittingsClient.this.b("STATUS_DISCOVERY_SERVICE_FAIL");
            return true;
        }
    }
}
