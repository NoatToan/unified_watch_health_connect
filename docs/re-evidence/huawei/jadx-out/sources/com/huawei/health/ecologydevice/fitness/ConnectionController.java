package com.huawei.health.ecologydevice.fitness;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import com.huawei.ecologydevice.R;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.handler.ExtendHandler;
import com.huawei.haf.handler.HandlerCenter;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.dxw;
import defpackage.ego;
import defpackage.erh;
import defpackage.qpx;
import health.compact.a.HuaweiHealth;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.UUID;

/* JADX INFO: loaded from: classes7.dex */
public class ConnectionController {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private BluetoothAdapter f6487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private BluetoothDevice f6488b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private BluetoothGatt f6489c;
    private BluetoothManager e;
    private String g;
    private ConnectResultCallback i;
    private int j;
    private ego k;
    private final Object l;
    private long f = 0;
    private int o = 0;
    private ExtendHandler h = null;
    private boolean d = false;
    private int m = 0;
    private final BluetoothGattCallback n = new BluetoothGattCallback() { // from class: com.huawei.health.ecologydevice.fitness.ConnectionController.3
        @Override // android.bluetooth.BluetoothGattCallback
        public void onConnectionStateChange(BluetoothGatt bluetoothGatt, int i, int i2) {
            ConnectionController.this.c(bluetoothGatt, i, i2);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onServicesDiscovered(BluetoothGatt bluetoothGatt, int i) {
            super.onServicesDiscovered(bluetoothGatt, i);
            ConnectionController.this.d(bluetoothGatt, i);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicRead(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
            LogUtil.a("PDROPE_ConnectionController", "onCharacteristicRead, status：", Integer.valueOf(i));
            ConnectionController.this.k.e(bluetoothGattCharacteristic, i);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicChanged(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
            if (bluetoothGattCharacteristic == null) {
                LogUtil.e("PDROPE_ConnectionController", "characteristic == null");
                return;
            }
            UUID uuid = bluetoothGattCharacteristic.getUuid();
            if (uuid == null) {
                LogUtil.a("PDROPE_ConnectionController", "onCharacteristicChanged, charUUID is null");
                return;
            }
            byte[] value = bluetoothGattCharacteristic.getValue();
            if (value == null || value.length <= 0) {
                LogUtil.a("PDROPE_ConnectionController", "onCharacteristicChanged, value is invalid");
                return;
            }
            LogUtil.a("PDROPE_ConnectionController", "onFitnessCharacteristicChanged, original data:", erh.a(value, ""));
            Message messageObtain = Message.obtain();
            messageObtain.what = 30;
            Bundle bundle = new Bundle();
            bundle.putString("CHARACTERISTIC_UUID", uuid.toString());
            bundle.putByteArray("CHARACTERISTIC_VALUE", value);
            messageObtain.setData(bundle);
            ConnectionController.this.h.sendMessage(messageObtain);
        }

        private void d(BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr) {
            UUID uuid = bluetoothGattCharacteristic.getUuid();
            if (uuid == null) {
                LogUtil.a("PDROPE_ConnectionController", "onCharacteristicChanged, charUUID is null");
                return;
            }
            LogUtil.a("PDROPE_ConnectionController", "onFitnessCharacteristicChanged, original data:", erh.a(bArr, ""));
            Message messageObtain = Message.obtain();
            messageObtain.what = 30;
            Bundle bundle = new Bundle();
            bundle.putString("CHARACTERISTIC_UUID", uuid.toString());
            bundle.putByteArray("CHARACTERISTIC_VALUE", bArr);
            messageObtain.setData(bundle);
            ConnectionController.this.h.sendMessage(messageObtain);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicChanged(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr) {
            if (bArr.length == 0) {
                LogUtil.a("PDROPE_ConnectionController", "onCharacteristicChanged, value is invalid");
            } else {
                d(bluetoothGattCharacteristic, bArr);
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicWrite(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
            LogUtil.a("PDROPE_ConnectionController", "onCharacteristicWrite, status：", Integer.valueOf(i));
            ConnectionController.this.k.a();
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onDescriptorWrite(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
            LogUtil.a("PDROPE_ConnectionController", "onDescriptorWrite, status：", Integer.valueOf(i));
            ConnectionController.this.k.d();
            super.onDescriptorWrite(bluetoothGatt, bluetoothGattDescriptor, i);
        }
    };

    public interface ConnectResultCallback {
        void onResult(int i);
    }

    public ConnectionController(ego egoVar, Object obj) {
        this.k = egoVar;
        this.l = obj;
        g();
        j();
    }

    public void c(int i) {
        this.m = i;
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.a("PDROPE_ConnectionController", "mac is error");
            return;
        }
        LogUtil.a("PDROPE_ConnectionController", "reConnectDevice!");
        try {
            BluetoothAdapter bluetoothAdapter = this.f6487a;
            if (bluetoothAdapter != null && bluetoothAdapter.isEnabled() && !TextUtils.isEmpty(str)) {
                this.f = SystemClock.elapsedRealtime();
                BluetoothDevice remoteDevice = this.f6487a.getRemoteDevice(str);
                this.f6488b = remoteDevice;
                if (remoteDevice != null) {
                    ReleaseLogUtil.d("DEVMGR_EcologyDevice_PDROPE_ConnectionController", "Record the number of reConnections : ", Integer.valueOf(this.o));
                    this.f6489c = this.f6488b.connectGatt(dxw.d(), false, this.n);
                    if (this.h != null && this.o == 0) {
                        ReleaseLogUtil.d("DEVMGR_EcologyDevice_PDROPE_ConnectionController", "Start counting down 30 seconds.");
                        this.h.sendEmptyMessage(21, 30000L);
                    }
                    this.o++;
                    return;
                }
                a(4);
                return;
            }
            LogUtil.j("PDROPE_ConnectionController", "BluetoothAdapter not initialized or unspecified address.");
            a(4);
        } catch (SecurityException e2) {
            LogUtil.e("PDROPE_ConnectionController", "reConnectDevice SecurityException:", ExceptionUtils.c(e2));
        }
    }

    private void j() {
        if (this.h == null) {
            this.h = HandlerCenter.b(new e(), "PDROPE_ConnectionController");
        }
    }

    private void g() {
        if (this.f6487a != null) {
            LogUtil.a("PDROPE_ConnectionController", "Init already.");
            return;
        }
        if (this.e == null && (BaseApplication.getContext().getSystemService("bluetooth") instanceof BluetoothManager)) {
            this.e = (BluetoothManager) BaseApplication.getContext().getSystemService("bluetooth");
        }
        BluetoothManager bluetoothManager = this.e;
        if (bluetoothManager == null) {
            LogUtil.e("PDROPE_ConnectionController", "Unable to initAdapter BluetoothManager.");
            return;
        }
        BluetoothAdapter adapter = bluetoothManager.getAdapter();
        this.f6487a = adapter;
        if (adapter == null) {
            LogUtil.e("PDROPE_ConnectionController", "Unable to obtain BluetoothAdapter.");
        }
    }

    public BluetoothGatt b() {
        return this.f6489c;
    }

    public void c() {
        boolean zDiscoverServices;
        synchronized (this.l) {
            BluetoothGatt bluetoothGatt = this.f6489c;
            if (bluetoothGatt == null) {
                return;
            }
            try {
                zDiscoverServices = bluetoothGatt.discoverServices();
            } catch (SecurityException e2) {
                ReleaseLogUtil.a("DEVMGR_EcologyDevice_PDROPE_ConnectionController", "discoverServices, ", ExceptionUtils.c(e2));
                zDiscoverServices = false;
            }
            LogUtil.a("PDROPE_ConnectionController", "Attempting to start service discovery:", Boolean.valueOf(zDiscoverServices));
            this.h.sendEmptyMessage(23, 10000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(BluetoothGatt bluetoothGatt, int i, int i2) {
        LogUtil.a("PDROPE_ConnectionController", "oldStatus= ", Integer.valueOf(i), " NewStates= ", Integer.valueOf(i2), " mCurrentDeviceStatus = ", Integer.valueOf(this.j));
        ExtendHandler extendHandler = this.h;
        if (extendHandler == null) {
            a(1);
            return;
        }
        if (i2 == 2) {
            this.j = 6;
            extendHandler.removeTasksAndMessages();
            d(bluetoothGatt);
        } else if (i2 == 0) {
            this.j = 8;
            f();
        } else if (i2 == 1) {
            this.j = 5;
            a(8);
        } else if (i2 != 3) {
            LogUtil.d("PDROPE_ConnectionController", "other gatt error code");
            f();
        } else {
            this.j = 7;
            a(9);
        }
    }

    private void f() {
        ReleaseLogUtil.d("DEVMGR_EcologyDevice_PDROPE_ConnectionController", "stateIsDisconnect isNewConnect = ", Boolean.valueOf(this.d), " ,scanTimes = ", Integer.valueOf(this.m));
        if (this.d) {
            if (this.m == 1) {
                i();
                return;
            } else {
                LogUtil.a("PDROPE_ConnectionController", "The reconnection mechanism is not triggered for new connection.");
                a(12);
                return;
            }
        }
        ReleaseLogUtil.d("DEVMGR_EcologyDevice_PDROPE_ConnectionController", "Disconnected from GATT server. mReconnectTimes = ", Integer.valueOf(this.o));
        if (this.o <= 2) {
            try {
                BluetoothAdapter bluetoothAdapter = this.f6487a;
                if (bluetoothAdapter != null && bluetoothAdapter.isEnabled() && !TextUtils.isEmpty(this.g)) {
                    a(12);
                    synchronized (this.l) {
                        BluetoothGatt bluetoothGatt = this.f6489c;
                        if (bluetoothGatt != null) {
                            bluetoothGatt.close();
                            this.f6489c = null;
                        }
                    }
                    this.h.sendEmptyMessage(12, 1000L);
                    return;
                }
                this.h.removeTasksAndMessages();
                a(1);
            } catch (SecurityException e2) {
                LogUtil.e("PDROPE_ConnectionController", "handleDisConnectStatus SecurityException:", ExceptionUtils.c(e2));
            }
        } else {
            i();
        }
    }

    private void i() {
        qpx.e(HuaweiHealth.a(), HuaweiHealth.a().getResources().getString(R.string.IDS_fitness_equip_blutooth_disconnected));
        a(1);
        this.h.removeTasksAndMessages();
    }

    private void d(BluetoothGatt bluetoothGatt) {
        ego egoVar = this.k;
        if (egoVar != null) {
            egoVar.e(bluetoothGatt);
        }
        this.f6489c = bluetoothGatt;
        this.o = 0;
        this.d = false;
        this.m = 0;
        LogUtil.a("PDROPE_ConnectionController", "Connected to GATT server. Time-cosuming: " + (SystemClock.elapsedRealtime() - this.f));
        a(3);
        this.h.sendEmptyMessage(22, 1000L);
    }

    public void e(String str) {
        LogUtil.a("PDROPE_ConnectionController", "in connectByMac");
        if (this.h == null) {
            LogUtil.e("PDROPE_ConnectionController", "connectByMac,mExtendHandler is null,create");
            this.h = HandlerCenter.b(new e(), "PDROPE_ConnectionController");
        }
        try {
            BluetoothAdapter bluetoothAdapter = this.f6487a;
            if (bluetoothAdapter != null && bluetoothAdapter.isEnabled() && !TextUtils.isEmpty(str)) {
                if (str.equals(this.g) && this.f6489c != null) {
                    a(3);
                    LogUtil.d("PDROPE_ConnectionController", "Trying to use an existing mBluetoothGatt for connection.");
                    return;
                }
                this.f = SystemClock.elapsedRealtime();
                LogUtil.d("PDROPE_ConnectionController", "in connectByMac,mac:", str);
                try {
                    this.f6488b = this.f6487a.getRemoteDevice(str);
                    synchronized (this.l) {
                        BluetoothGatt bluetoothGatt = this.f6489c;
                        if (bluetoothGatt != null) {
                            bluetoothGatt.close();
                            this.f6489c = null;
                        }
                        this.f6489c = this.f6488b.connectGatt(dxw.d(), false, this.n);
                        this.h.sendEmptyMessage(20, 10000L);
                        this.g = str;
                        this.o = 0;
                        this.d = true;
                        LogUtil.d("PDROPE_ConnectionController", "Trying to create new connection (in connectDevice)");
                    }
                    return;
                } catch (IllegalArgumentException unused) {
                    LogUtil.e("PDROPE_ConnectionController", "mac IllegalArgumentException");
                    a(1);
                    return;
                }
            }
            LogUtil.j("PDROPE_ConnectionController", "BluetoothAdapter not initialized or unspecified address.");
            a(1);
        } catch (SecurityException e2) {
            LogUtil.e("PDROPE_ConnectionController", "connectDevice SecurityException:", ExceptionUtils.c(e2));
            a(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(BluetoothGatt bluetoothGatt, int i) {
        ExtendHandler extendHandler = this.h;
        if (extendHandler != null) {
            extendHandler.removeTasksAndMessages();
        }
        LogUtil.a("PDROPE_ConnectionController", "onServicesDiscovered status: ", Integer.valueOf(i));
        if (i == 0) {
            a(10);
            this.k.a(bluetoothGatt, i);
        } else {
            LogUtil.j("PDROPE_ConnectionController", "onServicesDiscovered received: ", Integer.valueOf(i));
        }
    }

    class e implements Handler.Callback {
        private e() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 12) {
                ConnectionController connectionController = ConnectionController.this;
                connectionController.a(connectionController.g);
                return true;
            }
            if (i != 30) {
                switch (i) {
                    case 20:
                        LogUtil.a("PDROPE_ConnectionController", "MSG_CONNECT_GATT_TIMEOUT");
                        synchronized (ConnectionController.this.l) {
                            if (ConnectionController.this.f6489c != null) {
                                ConnectionController.this.e();
                                try {
                                    ConnectionController.this.f6489c.close();
                                    ConnectionController.this.f6489c = null;
                                } catch (SecurityException e) {
                                    LogUtil.e("PDROPE_ConnectionController", "ExtendHandlerCallback handleMessage SecurityException:", ExceptionUtils.c(e));
                                }
                            }
                            break;
                        }
                        ConnectionController.this.g = "";
                        ConnectionController.this.h.removeTasksAndMessages();
                        ConnectionController.this.a(2);
                        return true;
                    case 21:
                        LogUtil.a("PDROPE_ConnectionController", "MSG_RECONNECT_GATT_TIMEOUT");
                        ConnectionController.this.a(13);
                        ConnectionController.this.o = 0;
                        ConnectionController.this.h.removeTasksAndMessages();
                        return true;
                    case 22:
                        ConnectionController.this.c();
                        return true;
                    case 23:
                        ConnectionController.this.a(11);
                        return true;
                    default:
                        return false;
                }
            }
            Bundle data = message.getData();
            if (data != null) {
                ConnectionController.this.k.b(data.getString("CHARACTERISTIC_UUID"), data.getByteArray("CHARACTERISTIC_VALUE"));
                return true;
            }
            LogUtil.j("PDROPE_ConnectionController", "ConnectionController MSG_GET_DATA_SUCCESS bundle is null");
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        try {
            this.f6489c.disconnect();
        } catch (SecurityException e2) {
            ReleaseLogUtil.a("DEVMGR_EcologyDevice_PDROPE_ConnectionController", "disconnectGatt, ", ExceptionUtils.c(e2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        if (this.i != null) {
            LogUtil.d("PDROPE_ConnectionController", "code = ", Integer.valueOf(i));
            this.i.onResult(i);
        }
    }

    public void a() {
        LogUtil.a("PDROPE_ConnectionController", "releaseGattResource");
        d();
        h();
        this.o = 0;
        this.d = false;
        this.m = 0;
    }

    private void d() {
        synchronized (this.l) {
            try {
                if (this.f6489c != null) {
                    LogUtil.a("PDROPE_ConnectionController", "start to close gatt...");
                    e();
                    this.f6489c.close();
                    this.g = null;
                    this.f6489c = null;
                }
                this.f6488b = null;
            } catch (SecurityException e2) {
                LogUtil.e("PDROPE_ConnectionController", "closeBluetoothGatt SecurityException:", ExceptionUtils.c(e2));
            }
        }
    }

    private void h() {
        if (this.h != null) {
            LogUtil.a("PDROPE_ConnectionController", "msgHandler will removeCallbacksAndMessages");
            this.h.removeTasksAndMessages();
            this.h.quit(false);
        }
    }

    public void a(ConnectResultCallback connectResultCallback) {
        this.i = connectResultCallback;
    }
}
