package defpackage;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.huawei.appgallery.agd.api.AgdConstant;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.handler.ExtendHandler;
import com.huawei.haf.handler.HandlerCenter;
import com.huawei.health.deviceconnect.callback.BtDeviceResponseCallback;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.huawei.hwbtsdk.btcommon.BTDeviceMgrUtil;
import com.huawei.hwbtsdk.btdatatype.callback.BtDeviceStateCallback;
import com.huawei.hwbtsdk.btmanager.btdeviceservice.BTDeviceServiceBase;
import com.huawei.operation.ble.BleConstants;
import health.compact.a.LogUtil;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.UUID;

/* JADX INFO: loaded from: classes10.dex */
public class lob implements BTDeviceServiceBase {
    private static final Object e = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private BluetoothDevice f40533a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f40535c;
    private String d;
    private int f;
    private Context g;
    private BtDeviceStateCallback h;
    private BluetoothGatt i;
    private BluetoothGattCharacteristic p;
    private BluetoothGattCharacteristic u;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private DeviceInfo f40534b = new DeviceInfo();
    private int r = 0;
    private ExtendHandler t = null;
    private boolean m = false;
    private int y = 0;
    private boolean q = false;
    private ExtendHandler s = null;
    private boolean n = false;
    private final Object k = new Object();
    private boolean l = false;
    private int j = 0;
    private final BluetoothGattCallback o = new BluetoothGattCallback() { // from class: lob.2
        @Override // android.bluetooth.BluetoothGattCallback
        public void onConnectionStateChange(BluetoothGatt bluetoothGatt, int i, int i2) {
            lob.this.e(bluetoothGatt, i, i2);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onServicesDiscovered(BluetoothGatt bluetoothGatt, int i) {
            lob.this.a(i);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicRead(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
            lob.this.b(i);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicWrite(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
            lob.this.e(i);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicChanged(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
            lob.this.a(bluetoothGattCharacteristic);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onDescriptorWrite(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
            lob.this.d(i);
        }
    };

    @Override // com.huawei.hwbtsdk.btmanager.btdeviceservice.BTDeviceServiceBase
    public void connectBTDevice(String str) {
    }

    @Override // com.huawei.hwbtsdk.btmanager.btdeviceservice.BTDeviceServiceBase
    public void setAwAssetCallback(BtDeviceResponseCallback btDeviceResponseCallback) {
    }

    public lob(Context context, BluetoothDevice bluetoothDevice, String str, BtDeviceStateCallback btDeviceStateCallback) {
        this.g = null;
        this.f40533a = null;
        this.h = null;
        this.d = "";
        if (context != null) {
            this.g = context;
        }
        this.f40533a = bluetoothDevice;
        if (bluetoothDevice != null) {
            try {
                this.d = bluetoothDevice.getName();
            } catch (SecurityException e2) {
                LogUtil.d("BTDeviceBLEService", "cancelBRDiscoveryForConnect SecurityException:", ExceptionUtils.c(e2));
            }
            LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceBLEService", "bluetoothDevice name:", this.d);
            if (TextUtils.isEmpty(this.d) && !TextUtils.isEmpty(str)) {
                this.d = str;
            }
            LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceBLEService", "Device name:", this.d);
        }
        this.h = btDeviceStateCallback;
        this.f40534b.setDeviceBluetoothType(2);
        b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(BluetoothGatt bluetoothGatt, int i, int i2) {
        LogUtil.b("R_BTDeviceBLEService", "onConnectionStateChange() status:", Integer.valueOf(i), " newState:", Integer.valueOf(i2));
        if (i == 133) {
            lne.e(System.currentTimeMillis());
            lng.d();
        }
        if (this.i == null) {
            LogUtil.e(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceBLEService", "mBluetoothGatt is null");
            this.i = bluetoothGatt;
        }
        if (i2 == 2) {
            lne.e(0L);
            LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceBLEService", "Connected to GATT server.");
            BTDeviceMgrUtil.c().d();
            this.t.removeMessages(4);
            this.t.sendEmptyMessage(2, 1000L);
            return;
        }
        if (i2 != 0) {
            LogUtil.e("DEVMGR_SETTING", "BTDeviceBLEService", " enter unknown status");
            return;
        }
        this.t.removeTasksAndMessages();
        int iD = d();
        LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceBLEService", "Bluetooth switch state:", Integer.valueOf(iD), " Disconnected from GATT server. mIsSetNotificationFlag:", Boolean.valueOf(this.m));
        if (!this.q && iD == 3) {
            if (this.m) {
                a(true);
                return;
            } else {
                a(false);
                return;
            }
        }
        LogUtil.b("DEVMGR_SETTING", "BTDeviceBLEService", " Wanted disconnect or bluetooth switch is not on occur, so release.status:", Integer.valueOf(i));
        lnn.a(i + 1000000);
        i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        BluetoothGattService service;
        LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceBLEService", "onServicesDiscovered() status:", Integer.valueOf(i));
        if (this.i == null) {
            LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceBLEService", "mBluetoothGatt is null");
            a(false);
            return;
        }
        if (i == 0) {
            LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceBLEService", "Service discover success.");
            this.t.removeMessages(4);
            try {
                service = this.i.getService(UUID.fromString("0000fe86-0000-1000-8000-00805f9b34fb"));
            } catch (SecurityException e2) {
                LogUtil.d("BTDeviceBLEService", "dealWithOnServicesDiscovered BLE_SERVICE SecurityException", cpc.c(e2));
                service = null;
            }
            if (service != null) {
                LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceBLEService", "BLE GATT Service UUID find success.");
                synchronized (this.k) {
                    this.u = service.getCharacteristic(UUID.fromString("0000fe01-0000-1000-8000-00805f9b34fb"));
                }
                this.p = service.getCharacteristic(UUID.fromString("0000fe02-0000-1000-8000-00805f9b34fb"));
                h();
                return;
            }
            try {
                service = this.i.getService(UUID.fromString("00000200-0000-1000-8000-00805F9B34FB"));
            } catch (SecurityException e3) {
                LogUtil.d("BTDeviceBLEService", "isSupportService B0_SERVICE SecurityException", cpc.c(e3));
            }
            if (service != null) {
                LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceBLEService", "B0 GATT Service UUID find success.");
                synchronized (this.k) {
                    this.u = service.getCharacteristic(UUID.fromString("00000203-0000-1000-8000-00805F9B34FB"));
                }
                this.p = service.getCharacteristic(UUID.fromString("00000202-0000-1000-8000-00805F9B34FB"));
                h();
                return;
            }
            LogUtil.e(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceBLEService", "Do not match any Service UUID.");
            a(this.i, 1);
            return;
        }
        LogUtil.e(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceBLEService", "Service discover fail.");
        a(this.i, 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i) {
        if (i != 0) {
            LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 0, "BTDeviceBLEService", "Device-->SDK onCharacteristicRead error status:", Integer.valueOf(i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i) {
        this.n = true;
        if (i != 0) {
            LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceBLEService", "SDK-->Device onCharacteristicWrite error status:", Integer.valueOf(i));
        }
        f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        byte[] value = bluetoothGattCharacteristic.getValue();
        LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 0, "BTDeviceBLEService", "Device-->SDK: ", lnb.e(cph.d(value)));
        Message messageObtain = Message.obtain();
        messageObtain.what = 1;
        messageObtain.obj = value;
        this.s.sendMessage(messageObtain);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i) {
        LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceBLEService", "Enter onDescriptorWrite with status:", Integer.valueOf(i));
        if (i == 0) {
            LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceBLEService", "Notification set success.");
            c(2);
            this.r = 0;
            lng.e();
            return;
        }
        LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceBLEService", "refreshResult:", Boolean.valueOf(a(this.i, 4)));
    }

    private void b() {
        this.t = HandlerCenter.b(new b(), "BTDeviceBLEService_MSG");
        this.s = HandlerCenter.b(new a(), "BTDeviceBLEService_RECEIVE");
    }

    class b implements Handler.Callback {
        private b() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message == null) {
                LogUtil.e(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 0, "BTDeviceBLEService", "handleMessage, message is null");
                return false;
            }
            LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceBLEService", "receive message:", Integer.valueOf(message.what));
            switch (message.what) {
                case 1:
                    a();
                    return true;
                case 2:
                    j();
                    return true;
                case 3:
                    lob.this.i();
                    return true;
                case 4:
                    b();
                    return true;
                case 5:
                    e();
                    return true;
                case 6:
                    d();
                    return true;
                case 7:
                    c();
                    return true;
                default:
                    LogUtil.e(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 0, "BTDeviceBLEService", "not support message type");
                    return false;
            }
        }

        private void a() {
            lob.this.t.removeMessages(1);
            if (lob.this.i != null) {
                try {
                    lob.this.i.disconnect();
                } catch (SecurityException e) {
                    LogUtil.d("BTDeviceBLEService", "dealWithMsgConnectBleDevice SecurityException:", ExceptionUtils.c(e));
                }
                lob.this.t.sendEmptyMessage(6, 5000L);
                return;
            }
            lob.this.t.sendEmptyMessage(5);
        }

        private void j() {
            boolean zDiscoverServices;
            if (lob.this.i != null) {
                lob.this.t.sendEmptyMessage(4, 20000L);
                try {
                    zDiscoverServices = lob.this.i.discoverServices();
                } catch (Exception unused) {
                    LogUtil.d(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceBLEService");
                    zDiscoverServices = false;
                }
                LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceBLEService", "Attempting to start service discovery:", Boolean.valueOf(zDiscoverServices));
            }
        }

        private void b() {
            lob.this.t.removeMessages(4);
            lob.this.a(true);
        }

        private void e() {
            if (xgx.d().getAuthorizationStatus(BaseApplication.b())) {
                lob.this.t.sendEmptyMessage(4, 20000L);
                try {
                    lob lobVar = lob.this;
                    lobVar.i = lobVar.f40533a.connectGatt(lob.this.g, false, lob.this.o);
                } catch (Exception unused) {
                    LogUtil.d("BTDeviceBLEService", "dealWithMsgDirectConnectBle occur exception");
                }
                LogUtil.b("R_BTDeviceBLEService", "connectGatt() from ble service");
                lmq.c(lob.this.d);
                return;
            }
            LogUtil.e(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceBLEService", "ble start connect, but not authorize, so return");
        }

        private void d() {
            if (lob.this.i != null) {
                try {
                    lob.this.i.close();
                } catch (SecurityException e) {
                    LogUtil.d("BTDeviceBLEService", "dealWithMsgCloseGatt SecurityException:", ExceptionUtils.c(e));
                }
                lob.this.t.sendEmptyMessage(5, 1000L);
            }
        }

        private void c() {
            if (lob.this.f40535c == 2) {
                LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceBLEService", "BT Switch off and bt connect state is connected so start to release.");
                lob.this.q = true;
                lob.this.i();
            }
        }
    }

    @Override // com.huawei.hwbtsdk.btmanager.btdeviceservice.BTDeviceServiceBase
    public void connectBTDevice(BluetoothDevice bluetoothDevice) {
        LogUtil.b("DEVMGR_SETTING", "BTDeviceBLEService", "Enter connectBTDevice() with device state:", Integer.valueOf(this.f40535c), Boolean.valueOf(bluetoothDevice == null));
        if (bluetoothDevice == null) {
            return;
        }
        int i = this.f40535c;
        c(1);
        if (i == 2) {
            LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceBLEService", "Device has connected.");
            c(2);
            return;
        }
        try {
            LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceBLEService", "Start to connect ble device with name = ", bluetoothDevice.getName());
        } catch (SecurityException e2) {
            LogUtil.d("BTDeviceBLEService", "cancelBRDiscoveryForConnect SecurityException:", ExceptionUtils.c(e2));
        }
        this.j = 0;
        this.f40533a = bluetoothDevice;
        this.q = false;
        ExtendHandler extendHandler = this.t;
        if (extendHandler != null) {
            extendHandler.sendEmptyMessage(1);
        }
    }

    @Override // com.huawei.hwbtsdk.btmanager.btdeviceservice.BTDeviceServiceBase
    public void disconnectBTDevice() {
        LogUtil.b("DEVMGR_SETTING", "BTDeviceBLEService", " Enter disconnectBTDevice().", Boolean.valueOf(this.i == null));
        this.q = true;
        BluetoothGatt bluetoothGatt = this.i;
        if (bluetoothGatt == null) {
            this.t.sendEmptyMessage(3);
            return;
        }
        this.t.sendEmptyMessage(3, 5000L);
        LogUtil.e(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceBLEService", "start to execute gatt disconnect.");
        try {
            bluetoothGatt.disconnect();
        } catch (SecurityException unused) {
            LogUtil.d("BTDeviceBLEService", "disconnectBTDevice bluetoothGatt SecurityException");
        }
        LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceBLEService", "End disconnectBTDevice().");
    }

    @Override // com.huawei.hwbtsdk.btmanager.btdeviceservice.BTDeviceServiceBase
    public boolean sendBTDeviceData(byte[] bArr) {
        boolean zE = false;
        if (bArr == null) {
            LogUtil.e("0xA0200008", HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceBLEService", "Param null");
            return false;
        }
        synchronized (this.k) {
            if (!c()) {
                return false;
            }
            BluetoothGattCharacteristic bluetoothGattCharacteristic = this.u;
            if (bluetoothGattCharacteristic != null) {
                bluetoothGattCharacteristic.setValue(bArr);
            }
            this.n = false;
            lmq.e("BTDeviceBLEService", cph.d(bArr));
            if (this.i != null && this.u != null) {
                zE = e();
            }
            if (!zE) {
                j();
                synchronized (this.k) {
                    if (this.i != null && this.u != null) {
                        zE = e();
                    }
                }
            }
            return !this.n ? c(zE) : zE;
        }
    }

    private boolean c(boolean z) {
        Object obj = e;
        synchronized (obj) {
            this.l = true;
            try {
                obj.wait(300L);
            } catch (InterruptedException e2) {
                LogUtil.d(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceBLEService", "InterruptedException:", ExceptionUtils.c(e2));
            }
            if (this.l) {
                LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceBLEService", "Wait back, timeout = ", 300);
                if (!z) {
                    synchronized (this.k) {
                        if (this.i != null && this.u != null) {
                            z = e();
                        }
                    }
                }
                this.l = false;
            }
        }
        return z;
    }

    private void j() {
        try {
            Thread.sleep(100L);
        } catch (InterruptedException e2) {
            LogUtil.d("0xA0200006", HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceBLEService", "InterruptedException:", ExceptionUtils.c(e2));
        }
    }

    private boolean e() {
        try {
            boolean zWriteCharacteristic = this.i.writeCharacteristic(this.u);
            LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceBLEService", "Service data send for timeout ,dataTempSendResult = ", Boolean.valueOf(zWriteCharacteristic));
            return zWriteCharacteristic;
        } catch (SecurityException e2) {
            LogUtil.d("BTDeviceBLEService", "cancelBRDiscoveryForConnect SecurityException:", ExceptionUtils.c(e2));
            return false;
        }
    }

    private boolean c() {
        if (this.u == null) {
            LogUtil.e(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceBLEService", "mWritePoint is incorrect.");
            return false;
        }
        if (this.i != null) {
            return true;
        }
        LogUtil.e(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceBLEService", "mBluetoothGatt is incorrect.");
        return false;
    }

    private void f() {
        Object obj = e;
        synchronized (obj) {
            if (this.l) {
                obj.notifyAll();
                this.l = false;
            }
        }
    }

    @Override // com.huawei.hwbtsdk.btmanager.btdeviceservice.BTDeviceServiceBase
    public void onDestroy() {
        this.g = null;
        this.f40533a = null;
        this.h = null;
        ExtendHandler extendHandler = this.t;
        if (extendHandler != null) {
            extendHandler.removeTasksAndMessages();
            this.t.quit(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z) {
        LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceBLEService", "Enter reConnect() with reConnectFlag = ", Boolean.valueOf(z));
        i();
    }

    private void h() {
        LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceBLEService", "Enter setCharacteristicMessage().");
        this.m = true;
        try {
            BluetoothGattCharacteristic bluetoothGattCharacteristic = this.p;
            if (bluetoothGattCharacteristic != null) {
                if ((bluetoothGattCharacteristic.getProperties() | 16) > 0) {
                    this.i.setCharacteristicNotification(this.p, true);
                    BluetoothGattDescriptor descriptor = this.p.getDescriptor(UUID.fromString(BleConstants.CLIENT_CHARACTERISTIC_CONFIG_DESCRIPTOR_UUID));
                    if (descriptor != null) {
                        descriptor.setValue(BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE);
                        LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceBLEService", "writeDescriptorResult = ", Boolean.valueOf(this.i.writeDescriptor(descriptor)));
                        return;
                    }
                    return;
                }
                return;
            }
            LogUtil.e("0xA0200004", HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceBLEService", "mNotifyPoint is null.");
            a(this.i, 2);
        } catch (SecurityException e2) {
            LogUtil.d("BTDeviceBLEService", "setCharacteristicMessage SecurityException:", ExceptionUtils.c(e2));
        }
    }

    private boolean a(BluetoothGatt bluetoothGatt, int i) {
        LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceBLEService", "Enter refreshDeviceCache(). BluetoothGatt parameter is null ", Boolean.valueOf(bluetoothGatt == null));
        if (bluetoothGatt == null) {
            return false;
        }
        try {
            int i2 = this.r;
            if (i2 != i && i2 != 0) {
                this.y = 0;
            }
            int i3 = this.y;
            if (i3 <= 1) {
                this.y = i3 + 1;
                this.r = i;
                Method method = bluetoothGatt.getClass().getMethod("refresh", new Class[0]);
                this.t.sendEmptyMessage(2, 1000L);
                LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceBLEService", "Start to refresh Device Cache.");
                if (method != null) {
                    Object objInvoke = method.invoke(bluetoothGatt, new Object[0]);
                    boolean zBooleanValue = (objInvoke == null || !(objInvoke instanceof Boolean)) ? false : ((Boolean) objInvoke).booleanValue();
                    LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceBLEService", "refresh Device Cache invoke result :", Boolean.valueOf(zBooleanValue));
                    return zBooleanValue;
                }
            } else {
                LogUtil.e("0xA0200003", HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceBLEService", "id =", Integer.valueOf(i), " call over times");
                a(false);
            }
        } catch (IllegalAccessException unused) {
            LogUtil.d("0xA0200003", HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceBLEService", "An exception occur while refreshing device:IllegalAccessException");
        } catch (NoSuchMethodException unused2) {
            LogUtil.d("0xA0200003", HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceBLEService", "An exception occur while refreshing device:NoSuchMethodException");
        } catch (InvocationTargetException unused3) {
            LogUtil.d("0xA0200003", HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceBLEService", "An exception occur while refreshing device:InvocationTargetException");
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceBLEService", "Enter release() with state:", Integer.valueOf(this.f40535c));
        synchronized (this.k) {
            if (this.i != null) {
                LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceBLEService", "Start to close gatt.");
                try {
                    this.i.close();
                } catch (Exception e2) {
                    LogUtil.d(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceBLEService", "release exception: ", ExceptionUtils.c(e2));
                }
                this.i = null;
                this.u = null;
            } else {
                this.u = null;
            }
            throw th;
        }
        ExtendHandler extendHandler = this.t;
        if (extendHandler != null) {
            extendHandler.removeTasksAndMessages();
        } else {
            LogUtil.e(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceBLEService", "mMsgHandler = null so can not remove all message.");
        }
        a();
    }

    private void a() {
        this.r = 0;
        this.y = 0;
        this.m = false;
        this.p = null;
        int i = this.j;
        if (i < 3 && this.f40535c != 2) {
            this.j = i + 1;
            int iD = d();
            LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceBLEService", "Try connect with BT switch state = ", Integer.valueOf(iD));
            if (!this.q && iD == 3) {
                ExtendHandler extendHandler = this.t;
                if (extendHandler == null) {
                    LogUtil.e(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceBLEService", "mMsgHandler = null.");
                    return;
                } else {
                    extendHandler.sendEmptyMessage(5, 2000L);
                    return;
                }
            }
            if (this.f40535c == 1) {
                this.f = 1002001;
                c(4);
                return;
            } else {
                c(3);
                return;
            }
        }
        if (this.f40535c == 1) {
            this.f = 1002001;
            c(4);
        } else {
            c(3);
        }
    }

    protected void c(int i) {
        BluetoothDevice bluetoothDevice;
        this.f40535c = i;
        if (this.h == null) {
            LogUtil.e(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceBLEService", "Client callback is null. ");
            return;
        }
        LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceBLEService", "Report BLE connect state = ", Integer.valueOf(i));
        if (this.f40534b == null || (bluetoothDevice = this.f40533a) == null) {
            return;
        }
        try {
            String name = bluetoothDevice.getName();
            if (TextUtils.isEmpty(name)) {
                name = this.d;
            }
            LogUtil.b("BTDeviceBLEService", "deviceName: ", name);
            if (!TextUtils.isEmpty(name)) {
                this.f40534b.setDeviceName(name);
            }
            this.f40534b.setDeviceIdentify(this.f40533a.getAddress());
            loa loaVarA = loa.a();
            String deviceIdentify = this.f40534b.getDeviceIdentify();
            LogUtil.b("OpAnalyticsImpl", "BLE btConnectState is::", Integer.valueOf(i));
            if (i == 4) {
                loaVarA.a(deviceIdentify, System.currentTimeMillis());
                loaVarA.d(deviceIdentify, this.f);
                loaVarA.e(deviceIdentify, AgdConstant.INSTALL_TYPE_DEFAULT);
            }
            this.h.onDeviceConnectionStateChanged(this.f40534b, this.f40535c, loaVarA.d(deviceIdentify));
        } catch (SecurityException e2) {
            LogUtil.d("BTDeviceBLEService", "cancelBRDiscoveryForConnect SecurityException:", ExceptionUtils.c(e2));
        }
    }

    class a implements Handler.Callback {
        private a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message == null) {
                LogUtil.e(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 0, "BTDeviceBLEService", "ReceiveCommandHandler, handleMessage message is null");
                return false;
            }
            if (message.what != 1) {
                return false;
            }
            if (message.obj instanceof byte[]) {
                byte[] bArr = (byte[]) message.obj;
                if (lob.this.h != null) {
                    lob.this.h.onDataReceived(lob.this.f40534b, bArr.length, bArr);
                }
            }
            return true;
        }
    }

    @Override // com.huawei.hwbtsdk.btmanager.btdeviceservice.BTDeviceServiceBase
    public DeviceInfo getDeviceInfo() {
        return this.f40534b;
    }

    private int d() {
        return BTDeviceMgrUtil.c().h();
    }

    @Override // com.huawei.hwbtsdk.btmanager.btdeviceservice.BTDeviceServiceBase
    public void btSwitchChangeInfo(int i) {
        LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceBLEService", "Enter btSwitchChangeInfo() with status = ", Integer.valueOf(i));
        if (i == 1) {
            ExtendHandler extendHandler = this.t;
            if (extendHandler == null) {
                LogUtil.e(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceBLEService", "mMsgHandler = null.");
            } else {
                extendHandler.sendEmptyMessage(7, 1000L);
            }
        }
    }

    @Override // com.huawei.hwbtsdk.btmanager.btdeviceservice.BTDeviceServiceBase
    public void sendBTFilePath(String str) {
        LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceBLEService", "Enter sendBTFilePath in ble.");
    }

    @Override // com.huawei.hwbtsdk.btmanager.btdeviceservice.BTDeviceServiceBase
    public void setFileCallback(BtDeviceResponseCallback btDeviceResponseCallback) {
        LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceBLEService", "Enter setFileCallback in ble.");
    }

    @Override // com.huawei.hwbtsdk.btmanager.btdeviceservice.BTDeviceServiceBase
    public void disconnectGMS() {
        LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceBLEService", "start to disconnectGMS in ble.");
    }

    @Override // com.huawei.hwbtsdk.btmanager.btdeviceservice.BTDeviceServiceBase
    public void removeV1CheckCommand() {
        LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceBLEService", "start to removeV1CheckCommand in ble.");
    }

    @Override // com.huawei.hwbtsdk.btmanager.btdeviceservice.BTDeviceServiceBase
    public void setPathExtendNum(int i) {
        LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceBLEService", "Enter setPathExtendNum in ble with pathExtendNum = ", Integer.valueOf(i));
    }

    @Override // com.huawei.hwbtsdk.btmanager.btdeviceservice.BTDeviceServiceBase
    public int getBTDeviceConnectState() {
        return this.f40535c;
    }
}
