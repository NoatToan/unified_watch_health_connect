package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import android.os.Message;
import android.text.TextUtils;
import com.huawei.devicesdk.connect.physical.ConsumerHandler;
import com.huawei.devicesdk.connect.physical.PhysicalLayerBase;
import com.huawei.devicesdk.connect.retry.ExecuteActionInterface;
import com.huawei.devicesdk.connect.retry.RetryCallbackInterface;
import com.huawei.devicesdk.entity.DeviceInfo;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.profile.profile.ProfileExtendConstants;
import health.compact.a.LogUtil;
import health.compact.a.ReleaseLogUtil;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes4.dex */
public class cld extends PhysicalLayerBase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f1700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ReentrantLock f1701b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Condition f1702c;
    private a d;
    private BluetoothGatt e;
    private int f;
    private ConsumerHandler<Message> g;
    private ConsumerHandler<Message> h;
    private clp i;
    private clp j;
    private int k;
    private AtomicBoolean l;
    private AtomicBoolean m;
    private final Object n;
    private BluetoothGattCharacteristic o;
    private final Object p;
    private BluetoothGattCharacteristic q;
    private int r;
    private clq s;
    private int t;

    /* synthetic */ void b(Message message) {
        int i = message.what;
        if (i == 2) {
            j();
            return;
        }
        if (i == 3) {
            c();
            return;
        }
        if (i != 4) {
            if (i == 5) {
                a(b());
                return;
            }
            if (i == 6) {
                a(a());
                return;
            } else if (i == 10) {
                e(message.arg1, message.arg2);
                return;
            } else {
                LogUtil.e("InoperableBlePhysicalService", "mConnectHandlerMessage default");
                return;
            }
        }
        if (message.arg1 == 20304) {
            if (this.t >= 2) {
                LogUtil.e("InoperableBlePhysicalService", "service times reach, report fail");
                this.t = 0;
                d(message);
                return;
            } else {
                LogUtil.b("InoperableBlePhysicalService", "service time out, again.");
                this.t++;
                e(this.e, "discoveryService");
                sendTimeoutMessageForService(this.i);
                this.i.e(2, 1000L);
                return;
            }
        }
        if (message.arg1 == 10304) {
            LogUtil.b("InoperableBlePhysicalService", "gatt timeout retry start.");
            if (this.f >= 2) {
                LogUtil.e("InoperableBlePhysicalService", "gatt retries exceeded.");
                this.f = 0;
                d(message);
                return;
            } else {
                LogUtil.b("InoperableBlePhysicalService", "gatt first timeout, result reported.");
                this.f++;
                a(a());
                return;
            }
        }
        LogUtil.b("InoperableBlePhysicalService", "gatt timeout, message.arg1 is other");
    }

    /* synthetic */ void c(Message message) {
        if (message.what == 9) {
            int i = message.arg1;
            Object obj = message.obj;
            if (obj instanceof cmm) {
                e((cmm) obj, i);
                return;
            }
            return;
        }
        LogUtil.e("InoperableBlePhysicalService", "mDataHandlerMessage default");
    }

    public cld() {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f1701b = reentrantLock;
        this.f1702c = reentrantLock.newCondition();
        this.n = new Object();
        this.p = new Object();
        this.k = 0;
        this.d = new a();
        this.l = new AtomicBoolean(false);
        this.m = new AtomicBoolean(false);
        this.r = 0;
        this.t = 0;
        this.f = 0;
        this.g = new ConsumerHandler() { // from class: clc
            @Override // com.huawei.devicesdk.connect.physical.ConsumerHandler
            public final void accept(Object obj) {
                this.f1699a.b((Message) obj);
            }
        };
        this.h = new ConsumerHandler() { // from class: clj
            @Override // com.huawei.devicesdk.connect.physical.ConsumerHandler
            public final void accept(Object obj) {
                this.e.c((Message) obj);
            }
        };
        this.i = new clp(this.g);
        this.j = new clp(this.h);
        this.s = new clq(3);
    }

    private void d(Message message) {
        cmc cmcVarB = coy.b(this.mDeviceInfo.getDeviceMac());
        LogUtil.b("InoperableBlePhysicalService", "deviceIdentify: ", cpl.e(this.mDeviceInfo.getDeviceMac()), " bleDeviceRssi:", Integer.valueOf(cmcVarB.e()));
        boolean z = (message.arg1 == 10304 && cmcVarB.e() > -65) || message.arg1 == 20304;
        ReleaseLogUtil.c("DEVMGR_InoperableBlePhysicalService", "dealGattOrServiceTimeout isReport: ", Boolean.valueOf(z), " arg1: ", Integer.valueOf(message.arg1));
        cmcVarB.b(z);
        coy.e(this.mDeviceInfo.getDeviceMac(), cmcVarB);
        reportMonitorResult(message, this.mDeviceInfo, 100038);
        setTriggerType(3, this.mDeviceInfo);
        this.mStatusChangeCallback.onConnectStatusChanged(this.mDeviceInfo, 3, message.arg1);
        c();
    }

    private void a(boolean z) {
        if (z) {
            return;
        }
        c(3, cpi.c(1, 301));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i, int i2) {
        clp clpVar = this.i;
        if (clpVar == null || this.j == null) {
            LogUtil.e("InoperableBlePhysicalService", "updateDeviceConnectState Handler is null");
            return;
        }
        if (i == 2 || i == 3) {
            clpVar.d(null);
            this.j.d(null);
        }
        Message messageE = this.i.e(10);
        messageE.arg1 = i;
        messageE.arg2 = i2;
        this.i.c(messageE);
    }

    private void e(int i, int i2) {
        ReleaseLogUtil.c("DEVMGR_InoperableBlePhysicalService", "notifyDeviceStatusToApp status ", Integer.valueOf(i), cpl.e(this.mDeviceInfo));
        synchronized (this.p) {
            if (i == this.f1700a) {
                LogUtil.b("InoperableBlePhysicalService", "connectState no change");
                return;
            }
            this.f1700a = i;
            setTriggerType(i, this.mDeviceInfo);
            if (this.mStatusChangeCallback != null && this.mDeviceInfo != null) {
                ReleaseLogUtil.c("DEVMGR_InoperableBlePhysicalService", "report connect state: ", Integer.valueOf(i));
                this.mStatusChangeCallback.onConnectStatusChanged(this.mDeviceInfo, i, i2);
            } else {
                LogUtil.e("InoperableBlePhysicalService", "device status call back is null ", cpl.a(this.mDeviceInfo));
            }
        }
    }

    private void e(cmm cmmVar, int i) {
        if (this.mMessageReceiveCallback != null) {
            this.mMessageReceiveCallback.onDataReceived(this.mDeviceInfo, cmmVar, i);
        } else {
            LogUtil.e("InoperableBlePhysicalService", "device message call back is null", cpl.a(this.mDeviceInfo));
        }
    }

    private boolean j() {
        try {
            this.i.a(2);
            BluetoothGatt bluetoothGatt = this.e;
            if (bluetoothGatt != null && this.mDeviceInfo != null) {
                ReleaseLogUtil.c("DEVMGR_InoperableBlePhysicalService", "start service discovery ", cpl.e(this.mDeviceInfo));
                cqp.a(100040, cqc.a((Object) this.mDeviceInfo.getDeviceName()), "", "");
                return bluetoothGatt.discoverServices();
            }
            ReleaseLogUtil.d("DEVMGR_InoperableBlePhysicalService", "startServiceDiscovery error. mBluetoothGatt or mDeviceInfo is null ", cpl.a(this.mDeviceInfo));
            return false;
        } catch (SecurityException e) {
            LogUtil.d("InoperableBlePhysicalService", "startServiceDiscovery SecurityException:", ExceptionUtils.c(e));
            return false;
        }
    }

    private void c() {
        this.t = 0;
        this.i.a(4);
        ReleaseLogUtil.c("DEVMGR_InoperableBlePhysicalService", "release gatt start. current bluetooth state: ", Integer.valueOf(this.f1700a), cpl.a(this.mDeviceInfo));
        synchronized (this.n) {
            BluetoothGatt bluetoothGatt = this.e;
            if (bluetoothGatt != null) {
                ReleaseLogUtil.c("DEVMGR_InoperableBlePhysicalService", "start close gatt.", cpl.e(this.mDeviceInfo));
                try {
                    bluetoothGatt.disconnect();
                    bluetoothGatt.close();
                } catch (Exception unused) {
                    ReleaseLogUtil.b("DEVMGR_InoperableBlePhysicalService", "bluetoothGatt SecurityException");
                }
                this.e = null;
            }
        }
        this.i.d(null);
        this.j.d(null);
        clq clqVar = this.s;
        if (clqVar != null) {
            clqVar.d();
        }
    }

    private boolean b() {
        ReleaseLogUtil.c("DEVMGR_InoperableBlePhysicalService", "initGattService start", cpl.e(this.mDeviceInfo));
        sendTimeoutMessage(this.i, 1, 8000L);
        if (this.mDeviceInfo == null) {
            LogUtil.e("InoperableBlePhysicalService", "initGattService mDeviceInfo is null");
            return false;
        }
        try {
            this.mBluetoothDevice = BluetoothAdapter.getDefaultAdapter().getRemoteDevice(this.mDeviceInfo.getDeviceMac());
            if (this.mBluetoothDevice == null) {
                LogUtil.e("InoperableBlePhysicalService", "mBluetoothDevice is null");
                return false;
            }
            String name = this.mBluetoothDevice.getName();
            ReleaseLogUtil.c("DEVMGR_InoperableBlePhysicalService", "BluetoothDevice deviceName: ", name);
            if (!TextUtils.isEmpty(name)) {
                this.mDeviceInfo.setDeviceName(name);
            }
            cqp.a(100036, cqc.a((Object) this.mDeviceInfo.getDeviceName()), "", "");
            BluetoothGatt bluetoothGattConnectGatt = this.mBluetoothDevice.connectGatt(BaseApplication.b(), false, this.d, 2);
            this.e = bluetoothGattConnectGatt;
            if (bluetoothGattConnectGatt == null) {
                Thread.sleep(1000L);
                ReleaseLogUtil.c("DEVMGR_InoperableBlePhysicalService", "mBluetoothGatt is null ,so again connectGatt");
                this.e = this.mBluetoothDevice.connectGatt(BaseApplication.b(), false, this.d, 2);
            }
            synchronized (this.p) {
                this.f1700a = 1;
            }
        } catch (Exception unused) {
            LogUtil.d("InoperableBlePhysicalService", "initGattService occur exception");
        }
        return this.e != null;
    }

    private boolean a() {
        LogUtil.b("InoperableBlePhysicalService", "reInitGatt start.", cpl.a(this.mDeviceInfo));
        BluetoothGatt bluetoothGatt = this.e;
        if (bluetoothGatt != null) {
            try {
                bluetoothGatt.close();
            } catch (Exception e) {
                lng.c("ConnectMessage", "reInitGattService Exception:" + ExceptionUtils.c(e));
                LogUtil.d("InoperableBlePhysicalService", "reInitGattService Exception:", ExceptionUtils.c(e));
            }
            this.i.e(5, 1000L);
            return true;
        }
        LogUtil.e("InoperableBlePhysicalService", "reInitGatt error. mBluetoothGatt is null.", cpl.a(this.mDeviceInfo));
        return false;
    }

    @Override // com.huawei.devicesdk.connect.physical.PhysicalLayerBase
    public void connectDevice(DeviceInfo deviceInfo) {
        try {
            if (this.mDeviceInfo != null && deviceInfo != null && !TextUtils.isEmpty(deviceInfo.getDeviceMac())) {
                c(1, 100000);
                ReleaseLogUtil.c("DEVMGR_InoperableBlePhysicalService", "connectDevice start. ", cpl.e(this.mDeviceInfo));
                if (this.f1700a == 2) {
                    ReleaseLogUtil.c("DEVMGR_InoperableBlePhysicalService", "device has connected. ", cpl.e(deviceInfo));
                    c(2, 100000);
                    return;
                }
                BluetoothGatt bluetoothGatt = this.e;
                if (bluetoothGatt != null) {
                    ReleaseLogUtil.c("DEVMGR_InoperableBlePhysicalService", "mBluetooth exit, start release gatt.", cpl.e(this.mDeviceInfo));
                    bluetoothGatt.disconnect();
                    this.i.e(6, 5000L);
                    return;
                }
                this.i.b(5);
                return;
            }
            LogUtil.e("InoperableBlePhysicalService", "connect device failed. device is invalid.");
            c(3, cpi.c(7, 303));
        } catch (SecurityException e) {
            LogUtil.d("InoperableBlePhysicalService", "cancelBRDiscoveryForConnect SecurityException:", ExceptionUtils.c(e));
        }
    }

    private boolean a(final BluetoothGattCharacteristic bluetoothGattCharacteristic, cmb cmbVar, final String str) {
        final byte[] bArrA = cmbVar.a();
        final int iB = cmbVar.b();
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        new clq(2).c(new ExecuteActionInterface() { // from class: cld.1
            @Override // com.huawei.devicesdk.connect.retry.ExecuteActionInterface
            public String getActionName() {
                return "WriteCharacteristic";
            }

            @Override // com.huawei.devicesdk.connect.retry.ExecuteActionInterface
            public boolean execute() {
                return cld.this.c(bluetoothGattCharacteristic, bArrA);
            }
        }, new RetryCallbackInterface() { // from class: cld.5
            @Override // com.huawei.devicesdk.connect.retry.RetryCallbackInterface
            public void doRetryAction(int i) {
                LogUtil.b("InoperableBlePhysicalService", "doRetryAction enter: ", Integer.valueOf(i));
                if (i == 0) {
                    cld.this.a(100L);
                } else if (i == 1) {
                    cld.this.a(300L);
                } else {
                    LogUtil.b("InoperableBlePhysicalService", "currentRetry else");
                }
            }

            @Override // com.huawei.devicesdk.connect.retry.RetryCallbackInterface
            public void doSuccessAction() {
                atomicBoolean.set(true);
                int i = iB;
                if (i >= 0) {
                    cld.this.a(i);
                } else {
                    LogUtil.b("InoperableBlePhysicalService", "doSuccessAction sendInterval: ", Integer.valueOf(i));
                }
            }

            @Override // com.huawei.devicesdk.connect.retry.RetryCallbackInterface
            public void doFailureAction() {
                LogUtil.b("InoperableBlePhysicalService", "doFailureAction() enter");
                cjy.e(str);
            }
        }, false);
        return atomicBoolean.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [android.bluetooth.BluetoothGattCharacteristic] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    public boolean c(BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr) {
        SecurityException e;
        ?? r8;
        if (bluetoothGattCharacteristic == 0) {
            LogUtil.e("InoperableBlePhysicalService", "characteristic is invalid.");
            return false;
        }
        this.f1701b.lock();
        try {
            try {
                bluetoothGattCharacteristic.setValue(bArr);
                BluetoothGatt bluetoothGatt = this.e;
                try {
                    if (bluetoothGatt != null) {
                        boolean zWriteCharacteristic = bluetoothGatt.writeCharacteristic(bluetoothGattCharacteristic);
                        if (!zWriteCharacteristic) {
                            cpl.e("InoperableBlePhysicalService", bArr, cpl.a(this.mDeviceInfo), " SDK-->Device[retryTime]: ");
                            bluetoothGattCharacteristic = zWriteCharacteristic;
                        } else {
                            try {
                                this.l.set(true);
                                LogUtil.c("InoperableBlePhysicalService", "isAwaitSuccess ", Boolean.valueOf(this.f1702c.await(ProfileExtendConstants.TIME_OUT, TimeUnit.MILLISECONDS)));
                                bluetoothGattCharacteristic = zWriteCharacteristic;
                            } catch (InterruptedException unused) {
                                LogUtil.d("InoperableBlePhysicalService", "wait for characteristic error.");
                                bluetoothGattCharacteristic = zWriteCharacteristic;
                            }
                        }
                    } else {
                        bluetoothGattCharacteristic = 0;
                    }
                    this.l.set(false);
                    r8 = bluetoothGattCharacteristic;
                } catch (SecurityException e2) {
                    e = e2;
                    LogUtil.d("InoperableBlePhysicalService", "writeCharacteristicValue SecurityException:", ExceptionUtils.c(e));
                    r8 = bluetoothGattCharacteristic;
                }
            } finally {
                this.f1701b.unlock();
            }
        } catch (SecurityException e3) {
            e = e3;
            bluetoothGattCharacteristic = 0;
        }
        return r8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(long j) {
        try {
            Thread.sleep(j);
        } catch (InterruptedException unused) {
            LogUtil.d("InoperableBlePhysicalService", "sleep delay interrupted");
        }
    }

    @Override // com.huawei.devicesdk.connect.physical.PhysicalLayerBase
    public void disconnectDevice() {
        ReleaseLogUtil.c("DEVMGR_InoperableBlePhysicalService", "disconnectDevice start");
        try {
            synchronized (this.n) {
                BluetoothGatt bluetoothGatt = this.e;
                if (bluetoothGatt != null) {
                    bluetoothGatt.disconnect();
                    ReleaseLogUtil.c("DEVMGR_InoperableBlePhysicalService", "disconnectGatt success ", cpl.e(this.mDeviceInfo));
                    c(0, cpi.d(6));
                } else {
                    LogUtil.e("InoperableBlePhysicalService", "disconnectGatt fail because mBluetoothGatt is invalid.", cpl.e(this.mDeviceInfo));
                    c(0, cpi.c(6, 303));
                }
            }
            this.i.e(3, 200L);
        } catch (SecurityException e) {
            LogUtil.d("InoperableBlePhysicalService", "disconnectDevice SecurityException:", ExceptionUtils.c(e));
        }
    }

    @Override // com.huawei.devicesdk.connect.physical.PhysicalLayerBase
    public boolean sendData(cmd cmdVar, String str) {
        if (cmdVar == null) {
            LogUtil.e("InoperableBlePhysicalService", "sendData error. bluetooth frame data is null");
            return false;
        }
        LogUtil.b("InoperableBlePhysicalService", "sendData start.", cpl.a(this.mDeviceInfo));
        if (this.q == null) {
            b(new byte[0], 1);
        }
        List<cmb> listA = cmdVar.a();
        if (coq.d(listA)) {
            LogUtil.e("InoperableBlePhysicalService", "the packages getted is empty ", cpl.a(this.mDeviceInfo));
            return true;
        }
        for (cmb cmbVar : listA) {
            this.m.set(false);
            cpl.e("InoperableBlePhysicalService", cmbVar.a(), cpl.a(this.mDeviceInfo), " SDK-->Device: ");
            boolean zA = a(this.q, cmbVar, str);
            if (!zA || !this.m.get()) {
                boolean z = this.m.get();
                LogUtil.e("InoperableBlePhysicalService", "sendData isExecuteSuccess: ", Boolean.valueOf(zA), ",mIsCharacteristicRespSuccess.get: ", Boolean.valueOf(z), ",", cpl.a(this.mDeviceInfo));
                b(new byte[0], 1);
                break;
            }
        }
        LogUtil.b("InoperableBlePhysicalService", "sendData finish.", cpl.a(this.mDeviceInfo));
        return true;
    }

    @Override // com.huawei.devicesdk.connect.physical.PhysicalLayerBase
    public void destroy() {
        c();
        this.i.a();
        this.g = null;
        this.mBluetoothDevice = null;
        this.s = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        this.f1701b.lock();
        if (this.l.get()) {
            LogUtil.b("InoperableBlePhysicalService", "release mCharacterLock.");
            this.l.set(false);
            this.f1702c.signalAll();
        } else {
            LogUtil.b("InoperableBlePhysicalService", "release mCharacterLock skip. lock is false.");
        }
        this.f1701b.unlock();
    }

    class a extends BluetoothGattCallback {
        private a() {
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onConnectionStateChange(BluetoothGatt bluetoothGatt, int i, int i2) {
            ReleaseLogUtil.c("DEVMGR_InoperableBlePhysicalService", "onConnectionStateChange status: ", Integer.valueOf(i), ", newState: ", Integer.valueOf(i2), cpl.e(cld.this.mDeviceInfo));
            if (cld.this.mDeviceInfo == null) {
                LogUtil.d("InoperableBlePhysicalService", "mDeviceInfo is null");
                return;
            }
            cqp.a(100039, cqc.a((Object) cld.this.mDeviceInfo.getDeviceName()), cqc.a(Integer.valueOf(i)), cqc.a(Integer.valueOf(i2)));
            if (bluetoothGatt != null) {
                if (cld.this.e == null) {
                    LogUtil.e("InoperableBlePhysicalService", "onConnectionStateChange set mBluetoothGatt ", cpl.a(cld.this.mDeviceInfo));
                    cld.this.e = bluetoothGatt;
                }
                cld.this.a(i, i2, bluetoothGatt);
                return;
            }
            ReleaseLogUtil.b("DEVMGR_InoperableBlePhysicalService", "onConnectionStateChange gatt is null ", cpl.e(cld.this.mDeviceInfo));
            cld.this.c(3, cpi.c(1, i));
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onServicesDiscovered(BluetoothGatt bluetoothGatt, int i) {
            if (cld.this.mDeviceInfo == null) {
                LogUtil.d("InoperableBlePhysicalService", "mDeviceInfo is null");
                return;
            }
            cqp.a(100041, cqc.a((Object) cld.this.mDeviceInfo.getDeviceName()), cqc.a(Integer.valueOf(i)), "");
            cld.this.i.d(null);
            cld.this.j.d(null);
            if (bluetoothGatt == null) {
                LogUtil.e("InoperableBlePhysicalService", "onServicesDiscovered gatt is null ", cpl.a(cld.this.mDeviceInfo));
                cld.this.c(3, cpi.c(2, i));
            } else {
                ReleaseLogUtil.c("DEVMGR_InoperableBlePhysicalService", "onServicesDiscovered status: ", Integer.valueOf(i), cpl.e(cld.this.mDeviceInfo));
                cld.this.t = 0;
                cld.this.e(bluetoothGatt);
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicChanged(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
            super.onCharacteristicChanged(bluetoothGatt, bluetoothGattCharacteristic);
            byte[] value = bluetoothGattCharacteristic.getValue();
            cpl.d("InoperableBlePhysicalService", value, "onCharacteristicChanged: ", cpl.a(cld.this.mDeviceInfo), " Device-->SDK: ");
            cld.this.b(value, 0);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicRead(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
            if (bluetoothGattCharacteristic == null) {
                LogUtil.d("InoperableBlePhysicalService", "characteristic is null");
            } else {
                super.onCharacteristicRead(bluetoothGatt, bluetoothGattCharacteristic, i);
                cpl.d("InoperableBlePhysicalService", bluetoothGattCharacteristic.getValue(), "onCharacteristicRead: ", cpl.a(cld.this.mDeviceInfo), " data: ");
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicWrite(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
            super.onCharacteristicWrite(bluetoothGatt, bluetoothGattCharacteristic, i);
            LogUtil.b("InoperableBlePhysicalService", "onCharacteristicWrite status: ", Integer.valueOf(i), cpl.a(cld.this.mDeviceInfo));
            cld.this.m.set(i == 0);
            cld.this.f();
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onDescriptorWrite(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
            super.onDescriptorWrite(bluetoothGatt, bluetoothGattDescriptor, i);
            LogUtil.b("InoperableBlePhysicalService", "onDescriptorWrite status: ", Integer.valueOf(i), cpl.a(cld.this.mDeviceInfo));
            if (i == 0) {
                cld.this.c(2, 100000);
                cld.this.k = 0;
                return;
            }
            cld cldVar = cld.this;
            boolean zE = cldVar.e(cldVar.e, "descriptorSetting");
            LogUtil.b("InoperableBlePhysicalService", "refreshResult: ", Boolean.valueOf(zE));
            if (zE) {
                cld.this.e();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        this.i.e(2, 1000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean e(BluetoothGatt bluetoothGatt, String str) {
        if (bluetoothGatt == null) {
            LogUtil.b("InoperableBlePhysicalService", "Enter isRefreshServiceDiscovery BluetoothGatt parameter is false ");
            return false;
        }
        if ("discoveryService".equals(str)) {
            return a(bluetoothGatt);
        }
        if (!"descriptorSetting".equals(str)) {
            LogUtil.e("InoperableBlePhysicalService", "label is invalid.");
        } else {
            int i = this.k;
            if (i > 1) {
                LogUtil.d("InoperableBlePhysicalService", "call over times");
                c(3, cpi.c(2, 302));
                this.i.e(3, 1000L);
            } else {
                this.k = i + 1;
                return a(bluetoothGatt);
            }
        }
        return false;
    }

    private boolean a(BluetoothGatt bluetoothGatt) {
        try {
            Method method = bluetoothGatt.getClass().getMethod("refresh", new Class[0]);
            LogUtil.b("InoperableBlePhysicalService", "Start to refresh service discovery.");
            Object objInvoke = method.invoke(bluetoothGatt, new Object[0]);
            if (objInvoke instanceof Boolean) {
                Boolean bool = (Boolean) objInvoke;
                boolean zBooleanValue = bool.booleanValue();
                LogUtil.b("InoperableBlePhysicalService", "refresh device service discovery result :", bool);
                return zBooleanValue;
            }
        } catch (IllegalAccessException unused) {
            LogUtil.d("InoperableBlePhysicalService", "An exception occur while refreshing device:IllegalAccessException");
        } catch (NoSuchMethodException unused2) {
            LogUtil.d("InoperableBlePhysicalService", "An exception occur while refreshing device:NoSuchMethodException");
        } catch (InvocationTargetException unused3) {
            LogUtil.d("InoperableBlePhysicalService", "An exception occur while refreshing device:InvocationTargetException");
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(byte[] bArr, int i) {
        cmm cmmVar = new cmm();
        cmmVar.a(bArr);
        if (this.j.c()) {
            Message messageE = this.j.e(9);
            messageE.arg1 = i;
            messageE.obj = cmmVar;
            this.j.c(messageE);
            return;
        }
        cpl.d("InoperableBlePhysicalService", bArr, "mDataHandler is null. response data:");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, int i2, BluetoothGatt bluetoothGatt) {
        if (i == 133) {
            LogUtil.d("InoperableBlePhysicalService", "onConnectionStateChange bluetooth 133 error", cpl.a(this.mDeviceInfo), " current retry times: ", Integer.valueOf(this.r));
            if (this.r < 3) {
                d(bluetoothGatt);
                this.r++;
                return;
            }
        }
        this.r = 0;
        if (i == 133) {
            LogUtil.d("InoperableBlePhysicalService", "onConnectionStateChange bluetooth 133 error", cpl.a(this.mDeviceInfo));
            c(3, cpi.c(6, i));
        }
        if (i2 == 2) {
            LogUtil.b("InoperableBlePhysicalService", "device connect success. ", cpl.a(this.mDeviceInfo));
            this.i.a(4);
            sendTimeoutMessageForService(this.i);
            this.i.e(2, 1000L);
            return;
        }
        if (i2 == 0) {
            LogUtil.b("InoperableBlePhysicalService", "device disconnect success.", cpl.a(this.mDeviceInfo));
            c(0, cpi.c(6, i));
            disconnectDevice();
            return;
        }
        LogUtil.e("InoperableBlePhysicalService", "onStateChange unknown", cpl.a(this.mDeviceInfo));
    }

    private void d(BluetoothGatt bluetoothGatt) {
        this.i.a(4);
        if (bluetoothGatt != null) {
            try {
                LogUtil.b("InoperableBlePhysicalService", "mBluetooth exit, start release gatt.", cpl.a(this.mDeviceInfo));
                bluetoothGatt.disconnect();
                this.i.e(6, 5000L);
            } catch (SecurityException e) {
                LogUtil.d("InoperableBlePhysicalService", "dealWithGatt133 SecurityException:", ExceptionUtils.c(e));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(final BluetoothGatt bluetoothGatt) {
        this.s.c(new ExecuteActionInterface() { // from class: cld.3
            @Override // com.huawei.devicesdk.connect.retry.ExecuteActionInterface
            public String getActionName() {
                return "ServiceDiscovery";
            }

            @Override // com.huawei.devicesdk.connect.retry.ExecuteActionInterface
            public boolean execute() {
                return cld.this.c(bluetoothGatt) || !cld.this.e(bluetoothGatt, "descriptorSetting");
            }
        }, new RetryCallbackInterface() { // from class: cld.2
            @Override // com.huawei.devicesdk.connect.retry.RetryCallbackInterface
            public void doRetryAction(int i) {
                BluetoothGatt bluetoothGatt2 = bluetoothGatt;
                if (bluetoothGatt2 == null) {
                    LogUtil.d("InoperableBlePhysicalService", "gatt is null");
                    return;
                }
                int size = bluetoothGatt2.getServices().size();
                LogUtil.e("InoperableBlePhysicalService", "not found user data service find service num=", Integer.valueOf(size), cpl.a(cld.this.mDeviceInfo));
                if (cld.this.i.c()) {
                    cld.this.i.a(2);
                    cld.this.i.e(2, 1000L);
                    LogUtil.b("InoperableBlePhysicalService", "send discovery message", cpl.a(cld.this.mDeviceInfo));
                } else {
                    LogUtil.e("InoperableBlePhysicalService", "mConnectHandler is null", cpl.a(cld.this.mDeviceInfo));
                    cld.this.c(3, cpi.c(2, 303));
                }
            }

            @Override // com.huawei.devicesdk.connect.retry.RetryCallbackInterface
            public void doSuccessAction() {
                cld.this.e = bluetoothGatt;
                LogUtil.b("InoperableBlePhysicalService", "service discover and notification set success");
            }

            @Override // com.huawei.devicesdk.connect.retry.RetryCallbackInterface
            public void doFailureAction() {
                cld.this.c(3, cpi.c(2, 301));
            }
        }, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean c(BluetoothGatt bluetoothGatt) {
        BluetoothGattService service;
        try {
            service = bluetoothGatt.getService(cmj.e);
        } catch (SecurityException e) {
            LogUtil.d("InoperableBlePhysicalService", "isObtainServiceSuccess SecurityException : ", cpc.c(e));
            service = null;
        }
        if (service == null) {
            return false;
        }
        ReleaseLogUtil.c("DEVMGR_InoperableBlePhysicalService", "BLE GATT Service UUID find success.");
        this.q = service.getCharacteristic(cmj.j);
        this.o = service.getCharacteristic(cmj.f);
        return d();
    }

    private boolean d() {
        LogUtil.b("InoperableBlePhysicalService", "Enter setCharacteristicMessage().");
        try {
            BluetoothGattCharacteristic bluetoothGattCharacteristic = this.o;
            if (bluetoothGattCharacteristic != null && this.e != null && (bluetoothGattCharacteristic.getProperties() | 16) > 0) {
                this.e.setCharacteristicNotification(this.o, true);
                BluetoothGattDescriptor descriptor = this.o.getDescriptor(cmj.f1778c);
                if (descriptor == null) {
                    try {
                        Thread.sleep(30L);
                        descriptor = this.o.getDescriptor(cmj.f1778c);
                    } catch (InterruptedException unused) {
                        LogUtil.d("InoperableBlePhysicalService", "setCharacteristicMessage InterruptedException");
                    }
                }
                if (descriptor != null) {
                    descriptor.setValue(BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE);
                    LogUtil.b("InoperableBlePhysicalService", "writeDescriptorResult: ", Boolean.valueOf(this.e.writeDescriptor(descriptor)));
                    return true;
                }
                cqp.a(100095, cqc.a((Object) this.mDeviceInfo.getDeviceName()), "", "");
            }
        } catch (SecurityException e) {
            LogUtil.d("InoperableBlePhysicalService", "setCharacteristicMessage SecurityException:", ExceptionUtils.c(e));
        }
        return false;
    }
}
