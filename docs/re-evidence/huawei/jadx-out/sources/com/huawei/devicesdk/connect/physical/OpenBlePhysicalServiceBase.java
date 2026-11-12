package com.huawei.devicesdk.connect.physical;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import android.os.Message;
import android.text.TextUtils;
import androidx.media3.common.C;
import com.huawei.devicesdk.callback.CharacterOperationInterface;
import com.huawei.devicesdk.connect.retry.ExecuteActionInterface;
import com.huawei.devicesdk.connect.retry.RetryCallbackInterface;
import com.huawei.devicesdk.entity.CharacterOperationType;
import com.huawei.devicesdk.entity.DeviceInfo;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.exception.ExceptionUtils;
import defpackage.clp;
import defpackage.clq;
import defpackage.cmb;
import defpackage.cmd;
import defpackage.cmj;
import defpackage.cmm;
import defpackage.coq;
import defpackage.cpi;
import defpackage.cpl;
import health.compact.a.LogUtil;
import health.compact.a.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes4.dex */
public abstract class OpenBlePhysicalServiceBase extends PhysicalLayerBase implements CharacterOperationInterface {
    private static final int LIST_DEFAULT_SIZE = 16;
    private static final int MAX_REDISCOVER_TIMES = 10;
    private static final int MAX_SET_CHARACTER = 3;
    private static final String TAG = "OpenBlePhysicalServiceBase";
    private static final String TAG_RELEASE = "DEVMGR_OpenBlePhysicalServiceBase";
    private static final int TIMEOUT_LOCK = 3000;
    protected static final int WAIT_MS_200 = 200;
    protected static final int WAIT_SERVICE_INIT = 100;
    private int mBluetoothConnectState;
    public BluetoothGatt mBluetoothGatt;
    private c mBluetoothGattCallback;
    private Condition mCharacterCondition;
    private clq mCharacterExecutor;
    private final ReentrantLock mCharacterLock;
    public clp mConnectHandler;
    private ConsumerHandler<Message> mConnectHandlerMessage;
    protected clq mServiceDiscoveryExecutor;
    protected AtomicBoolean mIsLocked = new AtomicBoolean(false);
    private final Object mLock = new Object();
    private final Object mStatusLock = new Object();

    protected abstract void characteristicWrite(BluetoothGattCharacteristic bluetoothGattCharacteristic, int i);

    protected abstract void descriptorWrite(BluetoothGattDescriptor bluetoothGattDescriptor, int i);

    protected abstract void onCharacteristicChange(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic);

    protected abstract void onServiceDiscovery(BluetoothGatt bluetoothGatt);

    protected abstract void setDescriptorValue(BluetoothGattCharacteristic bluetoothGattCharacteristic, BluetoothGattDescriptor bluetoothGattDescriptor, List<byte[]> list);

    protected abstract boolean writeCharacteristicValue(BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr);

    class c extends BluetoothGattCallback {
        private c() {
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onConnectionStateChange(BluetoothGatt bluetoothGatt, int i, int i2) {
            ReleaseLogUtil.c(OpenBlePhysicalServiceBase.TAG_RELEASE, "onConnectionStateChange status: ", Integer.valueOf(i), ", newState: ", Integer.valueOf(i2), cpl.e(OpenBlePhysicalServiceBase.this.mDeviceInfo));
            if (bluetoothGatt == null) {
                LogUtil.d(OpenBlePhysicalServiceBase.TAG, "onConnectionStateChange gatt is null", cpl.a(OpenBlePhysicalServiceBase.this.mDeviceInfo));
                OpenBlePhysicalServiceBase.this.updateDeviceConnectState(3, cpi.c(1, i));
            } else {
                if (OpenBlePhysicalServiceBase.this.mBluetoothGatt == null) {
                    LogUtil.e(OpenBlePhysicalServiceBase.TAG, "onConnectionStateChange set mBluetoothGatt", cpl.a(OpenBlePhysicalServiceBase.this.mDeviceInfo));
                    OpenBlePhysicalServiceBase.this.mBluetoothGatt = bluetoothGatt;
                }
                OpenBlePhysicalServiceBase.this.onDeviceStateChange(i, i2);
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onServicesDiscovered(BluetoothGatt bluetoothGatt, int i) {
            OpenBlePhysicalServiceBase.this.mConnectHandler.d(null);
            if (bluetoothGatt == null) {
                LogUtil.d(OpenBlePhysicalServiceBase.TAG, "onServicesDiscovered gatt is null", cpl.a(OpenBlePhysicalServiceBase.this.mDeviceInfo));
                OpenBlePhysicalServiceBase.this.updateDeviceConnectState(3, cpi.c(2, i));
                return;
            }
            ReleaseLogUtil.c(OpenBlePhysicalServiceBase.TAG_RELEASE, "onServicesDiscovered status:", Integer.valueOf(i), cpl.e(OpenBlePhysicalServiceBase.this.mDeviceInfo));
            if (i != 0) {
                OpenBlePhysicalServiceBase.this.updateDeviceConnectState(3, cpi.c(2, i));
            } else {
                OpenBlePhysicalServiceBase.this.onServiceDiscovery(bluetoothGatt);
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicChanged(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
            super.onCharacteristicChanged(bluetoothGatt, bluetoothGattCharacteristic);
            OpenBlePhysicalServiceBase.this.onCharacteristicChange(bluetoothGatt, bluetoothGattCharacteristic);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicRead(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
            if (bluetoothGattCharacteristic == null) {
                LogUtil.d(OpenBlePhysicalServiceBase.TAG, "onCharacteristicRead characteristic is null");
                return;
            }
            super.onCharacteristicRead(bluetoothGatt, bluetoothGattCharacteristic, i);
            cpl.d(OpenBlePhysicalServiceBase.TAG, bluetoothGattCharacteristic.getValue(), "onCharacteristicRead uuid:", bluetoothGattCharacteristic.getUuid(), cpl.a(OpenBlePhysicalServiceBase.this.mDeviceInfo), " data:");
            String string = bluetoothGattCharacteristic.getUuid().toString();
            byte[] value = bluetoothGattCharacteristic.getValue();
            if (i != 0) {
                OpenBlePhysicalServiceBase.this.onMessageReceived(string, value, 1);
            } else {
                OpenBlePhysicalServiceBase.this.onMessageReceived(string, value, 0);
            }
            OpenBlePhysicalServiceBase.this.unlock(string);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicWrite(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
            if (bluetoothGattCharacteristic == null) {
                LogUtil.d(OpenBlePhysicalServiceBase.TAG, "onCharacteristicWrite characteristic is null");
                return;
            }
            super.onCharacteristicWrite(bluetoothGatt, bluetoothGattCharacteristic, i);
            OpenBlePhysicalServiceBase.this.characteristicWrite(bluetoothGattCharacteristic, i);
            OpenBlePhysicalServiceBase.this.unlock(bluetoothGattCharacteristic.getUuid().toString());
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onDescriptorWrite(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
            if (bluetoothGattDescriptor == null) {
                LogUtil.d(OpenBlePhysicalServiceBase.TAG, "descriptor is null");
                return;
            }
            super.onDescriptorWrite(bluetoothGatt, bluetoothGattDescriptor, i);
            OpenBlePhysicalServiceBase.this.descriptorWrite(bluetoothGattDescriptor, i);
            OpenBlePhysicalServiceBase.this.unlock(bluetoothGattDescriptor.getUuid().toString());
        }
    }

    /* JADX INFO: renamed from: lambda$new$0$com-huawei-devicesdk-connect-physical-OpenBlePhysicalServiceBase, reason: not valid java name */
    public /* synthetic */ void m815x59aaf103(Message message) {
        if (message == null) {
            LogUtil.d(TAG, "message is null");
        }
        switch (message.what) {
            case 2:
                checkActionExecuteState(startServiceDiscovery(), 2);
                break;
            case 3:
                release();
                break;
            case 4:
                this.mStatusChangeCallback.onConnectStatusChanged(this.mDeviceInfo, 3, message.arg1);
                break;
            case 5:
                checkActionExecuteState(initGattService(), 1);
                break;
            case 6:
                checkActionExecuteState(reInitGattService(), 1);
                break;
            case 7:
                checkActionExecuteState(checkInitCharacteristic(), 2);
                break;
            case 8:
                if (message.obj instanceof BluetoothGattCharacteristic) {
                    checkActionExecuteState(enableInitCharacteristic((BluetoothGattCharacteristic) message.obj), 2);
                }
                break;
            case 9:
                int i = message.arg1;
                Object obj = message.obj;
                if (obj instanceof cmm) {
                    notifyMessage((cmm) obj, i);
                }
                break;
            case 10:
                notifyDeviceState(message.arg1, message.arg2);
                break;
            case 11:
                enableDeviceCapability();
                break;
        }
    }

    public OpenBlePhysicalServiceBase() {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.mCharacterLock = reentrantLock;
        this.mCharacterCondition = reentrantLock.newCondition();
        this.mBluetoothGattCallback = new c();
        this.mConnectHandlerMessage = new ConsumerHandler() { // from class: clg
            @Override // com.huawei.devicesdk.connect.physical.ConsumerHandler
            public final void accept(Object obj) {
                this.f1710a.m815x59aaf103((Message) obj);
            }
        };
        this.mConnectHandler = new clp(this.mConnectHandlerMessage);
        this.mServiceDiscoveryExecutor = new clq(10);
        this.mCharacterExecutor = new clq(3);
    }

    private void notifyDeviceState(int i, int i2) {
        LogUtil.b(TAG, "notifyDeviceStatusToApp status ", Integer.valueOf(i), cpl.a(this.mDeviceInfo));
        synchronized (this.mStatusLock) {
            if (i == this.mBluetoothConnectState) {
                LogUtil.b(TAG, "connectState no change");
                return;
            }
            this.mBluetoothConnectState = i;
            if (this.mStatusChangeCallback != null) {
                this.mStatusChangeCallback.onConnectStatusChanged(this.mDeviceInfo, i, i2);
            } else {
                LogUtil.d(TAG, "device status call back is null", cpl.a(this.mDeviceInfo));
            }
        }
    }

    @Override // com.huawei.devicesdk.callback.CharacterOperationInterface
    public void write(cmd cmdVar) {
        if (cmdVar == null) {
            LogUtil.d(TAG, "write frameData is null");
            return;
        }
        LogUtil.b(TAG, "write characteristic. characterId: ", cmdVar.e(), cpl.a(this.mDeviceInfo));
        BluetoothGattCharacteristic characteristic = getCharacteristic(cmdVar.d(), cmdVar.e());
        if (characteristic == null) {
            onMessageReceived(cmdVar.e(), new byte[0], 1);
        }
        List<cmb> listA = cmdVar.a();
        if (coq.d(listA)) {
            LogUtil.d(TAG, "the packages getted is empty", cpl.a(this.mDeviceInfo));
            return;
        }
        Iterator<cmb> it = listA.iterator();
        while (it.hasNext()) {
            if (!executeCharacteristicValue(characteristic, it.next(), cmdVar.b())) {
                onMessageReceived(cmdVar.e(), new byte[0], 1);
                return;
            }
        }
    }

    @Override // com.huawei.devicesdk.callback.CharacterOperationInterface
    public void enable(cmd cmdVar) {
        if (cmdVar == null) {
            LogUtil.d(TAG, "enable frameData is null");
            return;
        }
        LogUtil.b(TAG, "enable characteristic. characterId:", cmdVar.e(), cpl.a(this.mDeviceInfo));
        ArrayList arrayList = new ArrayList(16);
        arrayList.add(BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE);
        arrayList.add(BluetoothGattDescriptor.ENABLE_INDICATION_VALUE);
        enableOrDisableCharacteristic(cmdVar, true, arrayList);
    }

    @Override // com.huawei.devicesdk.callback.CharacterOperationInterface
    public void read(cmd cmdVar) {
        if (cmdVar == null) {
            LogUtil.d(TAG, "read frameData is null");
            return;
        }
        LogUtil.b(TAG, "read characteristic. characterId: ", cmdVar.e(), cpl.a(this.mDeviceInfo));
        BluetoothGattCharacteristic characteristic = getCharacteristic(cmdVar.d(), cmdVar.e());
        if (characteristic == null) {
            onMessageReceived(cmdVar.e(), new byte[0], 1);
        }
        executeReadCharacteristic(characteristic, cmdVar.b());
    }

    @Override // com.huawei.devicesdk.callback.CharacterOperationInterface
    public void disable(cmd cmdVar) {
        if (cmdVar == null) {
            LogUtil.d(TAG, "disable frameData is null");
            return;
        }
        LogUtil.b(TAG, "disable characteristic. characterId:", cmdVar.e(), cpl.a(this.mDeviceInfo));
        ArrayList arrayList = new ArrayList(16);
        arrayList.add(BluetoothGattDescriptor.DISABLE_NOTIFICATION_VALUE);
        enableOrDisableCharacteristic(cmdVar, false, arrayList);
    }

    @Override // com.huawei.devicesdk.connect.physical.PhysicalLayerBase
    public void connectDevice(DeviceInfo deviceInfo) {
        if (this.mDeviceInfo == null || deviceInfo == null || TextUtils.isEmpty(deviceInfo.getDeviceMac())) {
            LogUtil.d(TAG, "connect device failed. device is invalid.");
            updateDeviceConnectState(3, cpi.c(7, 303));
            return;
        }
        LogUtil.b(TAG, "connectDevice start. ", cpl.a(this.mDeviceInfo));
        if (this.mBluetoothGatt != null) {
            LogUtil.b(TAG, "mBluetooth exit, start release gatt.", cpl.a(this.mDeviceInfo));
            try {
                this.mBluetoothGatt.disconnect();
            } catch (SecurityException e) {
                LogUtil.d(TAG, "connectDevice SecurityException ", ExceptionUtils.c(e));
            }
            this.mConnectHandler.e(6, 5000L);
            return;
        }
        this.mConnectHandler.b(5);
    }

    @Override // com.huawei.devicesdk.connect.physical.PhysicalLayerBase
    public void disconnectDevice() {
        LogUtil.b(TAG, "disconnectDevice start");
        synchronized (this.mLock) {
            BluetoothGatt bluetoothGatt = this.mBluetoothGatt;
            if (bluetoothGatt != null) {
                try {
                    bluetoothGatt.disconnect();
                } catch (SecurityException e) {
                    LogUtil.d(TAG, "disconnectDevice SecurityException ", ExceptionUtils.c(e));
                }
                LogUtil.b(TAG, "disconnectGatt success", cpl.a(this.mDeviceInfo));
                updateDeviceConnectState(0, cpi.d(6));
            } else {
                LogUtil.e(TAG, "disconnectGatt fail because mBluetoothGatt is invalid.", cpl.a(this.mDeviceInfo));
                updateDeviceConnectState(0, cpi.c(6, 303));
            }
        }
        this.mConnectHandler.e(3, 200L);
    }

    @Override // com.huawei.devicesdk.connect.physical.PhysicalLayerBase
    public boolean sendData(cmd cmdVar, String str) {
        if (cmdVar == null || cmdVar.c() == null) {
            LogUtil.d(TAG, "sendData error. bluetooth frame data is null");
            return false;
        }
        CharacterOperationType characterOperationTypeC = cmdVar.c();
        LogUtil.b(TAG, "sendData start. characterId:", cmdVar.e(), " type:", characterOperationTypeC);
        int i = AnonymousClass4.f5427b[characterOperationTypeC.ordinal()];
        if (i == 1) {
            enable(cmdVar);
        } else if (i == 2) {
            write(cmdVar);
        } else if (i == 3) {
            disable(cmdVar);
        } else if (i == 4) {
            read(cmdVar);
        }
        LogUtil.b(TAG, "sendData finish. characterId:", cmdVar.e(), " type:", characterOperationTypeC);
        return true;
    }

    /* JADX INFO: renamed from: com.huawei.devicesdk.connect.physical.OpenBlePhysicalServiceBase$4, reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f5427b;

        static {
            int[] iArr = new int[CharacterOperationType.values().length];
            f5427b = iArr;
            try {
                iArr[CharacterOperationType.ENABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5427b[CharacterOperationType.WRITE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5427b[CharacterOperationType.DISABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f5427b[CharacterOperationType.READ.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    @Override // com.huawei.devicesdk.connect.physical.PhysicalLayerBase
    public void destroy() {
        release();
        this.mConnectHandler.a();
        this.mConnectHandlerMessage = null;
        this.mBluetoothDevice = null;
        this.mServiceDiscoveryExecutor = null;
        this.mCharacterExecutor = null;
    }

    protected void unlock(String str) {
        LogUtil.b(TAG, "unlock character. characterUuid:", str);
        this.mCharacterLock.lock();
        if (this.mIsLocked.get()) {
            LogUtil.b(TAG, "release mCharacterLock. characterUuid:", str);
            this.mIsLocked.set(false);
            this.mCharacterCondition.signalAll();
        } else {
            LogUtil.b(TAG, "release mCharacterLock skip. lock is false.");
        }
        this.mCharacterLock.unlock();
    }

    protected void lock(String str) {
        LogUtil.b(TAG, "lock character. characterUuid:", str);
        try {
            try {
                this.mCharacterLock.lock();
                LogUtil.b(TAG, "get mCharacterLock wait. characterUuid:", str);
                if (this.mIsLocked.get()) {
                    LogUtil.b(TAG, "get mCharacterLock lock ", Boolean.valueOf(this.mCharacterCondition.await(C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS, TimeUnit.MILLISECONDS)), ". characterUuid:", str);
                }
            } catch (InterruptedException unused) {
                LogUtil.d(TAG, "InterruptedException. characterUuid:", str);
                this.mIsLocked.set(false);
            }
        } finally {
            this.mCharacterLock.unlock();
        }
    }

    @Override // com.huawei.devicesdk.connect.physical.PhysicalLayerBase
    public boolean isSupportService(String str) {
        BluetoothGattService service;
        BluetoothGatt bluetoothGatt = this.mBluetoothGatt;
        if (bluetoothGatt != null && str != null) {
            try {
                service = bluetoothGatt.getService(UUID.fromString(str));
            } catch (SecurityException e) {
                LogUtil.d(TAG, "isSupportService SecurityException", ExceptionUtils.c(e));
                service = null;
            }
            if (service != null) {
                return true;
            }
        }
        return false;
    }

    @Override // com.huawei.devicesdk.connect.physical.PhysicalLayerBase
    public boolean isSupportCharactor(String str, String str2) {
        BluetoothGattService service;
        BluetoothGatt bluetoothGatt = this.mBluetoothGatt;
        if (bluetoothGatt != null && str != null && str2 != null) {
            try {
                service = bluetoothGatt.getService(UUID.fromString(str));
            } catch (SecurityException e) {
                LogUtil.d(TAG, "isSupportCharactor SecurityException", ExceptionUtils.c(e));
                service = null;
            }
            if (service != null && service.getCharacteristic(UUID.fromString(str2)) != null) {
                return true;
            }
        }
        return false;
    }

    private void enableOrDisableCharacteristic(cmd cmdVar, boolean z, List<byte[]> list) {
        BluetoothGattCharacteristic characteristic = getCharacteristic(cmdVar.d(), cmdVar.e());
        if (characteristic == null) {
            doCharacteristicNotificationResponse(cmdVar.e(), false);
        } else {
            doCharacteristicNotificationResponse(cmdVar.e(), executeCharacteristicNotification(characteristic, z, list, cmdVar.b()));
        }
    }

    private void doCharacteristicNotificationResponse(final String str, final boolean z) {
        if (!this.mConnectHandler.c()) {
            LogUtil.b(TAG, "mConnectHandler is null");
        } else {
            this.mConnectHandler.a(new Runnable() { // from class: com.huawei.devicesdk.connect.physical.OpenBlePhysicalServiceBase.2
                @Override // java.lang.Runnable
                public void run() {
                    if (OpenBlePhysicalServiceBase.this.mMessageReceiveCallback != null) {
                        OpenBlePhysicalServiceBase.this.mMessageReceiveCallback.onChannelEnable(OpenBlePhysicalServiceBase.this.mDeviceInfo, str, !z ? 1 : 0);
                    }
                }
            });
        }
    }

    private boolean executeCharacteristicNotification(final BluetoothGattCharacteristic bluetoothGattCharacteristic, final boolean z, final List<byte[]> list, int i) {
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        new clq(i).c(new ExecuteActionInterface() { // from class: com.huawei.devicesdk.connect.physical.OpenBlePhysicalServiceBase.1
            @Override // com.huawei.devicesdk.connect.retry.ExecuteActionInterface
            public String getActionName() {
                return "EnableOrDisableCharacteristic{" + bluetoothGattCharacteristic.getUuid() + "}";
            }

            @Override // com.huawei.devicesdk.connect.retry.ExecuteActionInterface
            public boolean execute() {
                return OpenBlePhysicalServiceBase.this.setCharacteristicNotification(bluetoothGattCharacteristic, z, list);
            }
        }, new RetryCallbackInterface() { // from class: com.huawei.devicesdk.connect.physical.OpenBlePhysicalServiceBase.8
            @Override // com.huawei.devicesdk.connect.retry.RetryCallbackInterface
            public void doFailureAction() {
            }

            @Override // com.huawei.devicesdk.connect.retry.RetryCallbackInterface
            public void doRetryAction(int i2) {
                OpenBlePhysicalServiceBase.this.sleepDelay(100L);
            }

            @Override // com.huawei.devicesdk.connect.retry.RetryCallbackInterface
            public void doSuccessAction() {
                atomicBoolean.set(true);
                OpenBlePhysicalServiceBase.this.sleepDelay(100L);
                LogUtil.b(OpenBlePhysicalServiceBase.TAG, "EnableOrDisableCharacteristic success, character: ", bluetoothGattCharacteristic.getUuid(), cpl.a(OpenBlePhysicalServiceBase.this.mDeviceInfo));
            }
        }, false);
        return atomicBoolean.get();
    }

    private boolean executeCharacteristicValue(final BluetoothGattCharacteristic bluetoothGattCharacteristic, cmb cmbVar, int i) {
        final byte[] bArrA = cmbVar.a();
        final int iB = cmbVar.b();
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        new clq(i).c(new ExecuteActionInterface() { // from class: com.huawei.devicesdk.connect.physical.OpenBlePhysicalServiceBase.9
            @Override // com.huawei.devicesdk.connect.retry.ExecuteActionInterface
            public String getActionName() {
                StringBuilder sb = new StringBuilder("WriteCharacteristic{");
                BluetoothGattCharacteristic bluetoothGattCharacteristic2 = bluetoothGattCharacteristic;
                sb.append(bluetoothGattCharacteristic2 == null ? "" : bluetoothGattCharacteristic2.getUuid());
                sb.append("} ");
                return sb.toString();
            }

            @Override // com.huawei.devicesdk.connect.retry.ExecuteActionInterface
            public boolean execute() {
                return OpenBlePhysicalServiceBase.this.writeCharacteristicValue(bluetoothGattCharacteristic, bArrA);
            }
        }, new RetryCallbackInterface() { // from class: com.huawei.devicesdk.connect.physical.OpenBlePhysicalServiceBase.7
            @Override // com.huawei.devicesdk.connect.retry.RetryCallbackInterface
            public void doFailureAction() {
            }

            @Override // com.huawei.devicesdk.connect.retry.RetryCallbackInterface
            public void doRetryAction(int i2) {
            }

            @Override // com.huawei.devicesdk.connect.retry.RetryCallbackInterface
            public void doSuccessAction() {
                atomicBoolean.set(true);
                OpenBlePhysicalServiceBase.this.sleepDelay(iB);
            }
        }, false);
        return atomicBoolean.get();
    }

    private boolean executeReadCharacteristic(final BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        new clq(i).c(new ExecuteActionInterface() { // from class: com.huawei.devicesdk.connect.physical.OpenBlePhysicalServiceBase.6
            @Override // com.huawei.devicesdk.connect.retry.ExecuteActionInterface
            public String getActionName() {
                StringBuilder sb = new StringBuilder("ReadCharacteristic{");
                BluetoothGattCharacteristic bluetoothGattCharacteristic2 = bluetoothGattCharacteristic;
                sb.append(bluetoothGattCharacteristic2 == null ? "" : bluetoothGattCharacteristic2.getUuid());
                sb.append("} ");
                return sb.toString();
            }

            @Override // com.huawei.devicesdk.connect.retry.ExecuteActionInterface
            public boolean execute() {
                return OpenBlePhysicalServiceBase.this.readCharacteristic(bluetoothGattCharacteristic);
            }
        }, new RetryCallbackInterface() { // from class: com.huawei.devicesdk.connect.physical.OpenBlePhysicalServiceBase.10
            @Override // com.huawei.devicesdk.connect.retry.RetryCallbackInterface
            public void doFailureAction() {
            }

            @Override // com.huawei.devicesdk.connect.retry.RetryCallbackInterface
            public void doRetryAction(int i2) {
                OpenBlePhysicalServiceBase.this.sleepDelay(100L);
            }

            @Override // com.huawei.devicesdk.connect.retry.RetryCallbackInterface
            public void doSuccessAction() {
                atomicBoolean.set(true);
                OpenBlePhysicalServiceBase.this.sleepDelay(100L);
                BluetoothGattCharacteristic bluetoothGattCharacteristic2 = bluetoothGattCharacteristic;
                if (bluetoothGattCharacteristic2 != null) {
                    LogUtil.b(OpenBlePhysicalServiceBase.TAG, "readCharacteristic success, character: ", bluetoothGattCharacteristic2.getUuid(), "mDeviceInfo: ", cpl.a(OpenBlePhysicalServiceBase.this.mDeviceInfo));
                } else {
                    LogUtil.b(OpenBlePhysicalServiceBase.TAG, "readCharacteristic success, character: ", cpl.a(OpenBlePhysicalServiceBase.this.mDeviceInfo));
                }
            }
        }, false);
        return atomicBoolean.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean readCharacteristic(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        boolean characteristic;
        synchronized (this.mLock) {
            if (bluetoothGattCharacteristic == null) {
                LogUtil.d(TAG, "characteristic is invalid.");
                return false;
            }
            if (this.mBluetoothGatt == null) {
                return false;
            }
            String string = bluetoothGattCharacteristic.getUuid().toString();
            this.mIsLocked.set(true);
            try {
                characteristic = this.mBluetoothGatt.readCharacteristic(bluetoothGattCharacteristic);
            } catch (SecurityException e) {
                LogUtil.d(TAG, "readCharacteristic SecurityException:", ExceptionUtils.c(e));
                characteristic = false;
            }
            LogUtil.b(TAG, "readCharacteristic status:", Boolean.valueOf(characteristic));
            if (characteristic) {
                lock(string);
            } else {
                this.mIsLocked.set(false);
            }
            return characteristic;
        }
    }

    private void checkActionExecuteState(boolean z, int i) {
        if (z) {
            return;
        }
        updateDeviceConnectState(3, cpi.c(i, 301));
    }

    private boolean reInitGattService() {
        LogUtil.b(TAG, "reInitGatt start.", cpl.a(this.mDeviceInfo));
        BluetoothGatt bluetoothGatt = this.mBluetoothGatt;
        if (bluetoothGatt != null) {
            try {
                bluetoothGatt.close();
                this.mConnectHandler.e(5, 1000L);
                return true;
            } catch (SecurityException e) {
                LogUtil.d(TAG, "reInitGattService SecurityException ", ExceptionUtils.c(e));
                return false;
            }
        }
        LogUtil.d(TAG, "reInitGatt error. mBluetoothGatt is null.", cpl.a(this.mDeviceInfo));
        return false;
    }

    private boolean initGattService() {
        LogUtil.b(TAG, "initGattService start", cpl.a(this.mDeviceInfo));
        sendTimeoutMessage(this.mConnectHandler, 1);
        try {
            this.mBluetoothDevice = BluetoothAdapter.getDefaultAdapter().getRemoteDevice(this.mDeviceInfo.getDeviceMac());
            if (this.mBluetoothDevice == null) {
                LogUtil.e(TAG, "mBluetoothDevice is null");
                return false;
            }
            String name = this.mBluetoothDevice.getName();
            LogUtil.b(TAG, "BluetoothDevice deviceName: ", name);
            if (!TextUtils.isEmpty(name)) {
                this.mDeviceInfo.setDeviceName(name);
            }
            this.mBluetoothGatt = this.mBluetoothDevice.connectGatt(BaseApplication.b(), false, this.mBluetoothGattCallback, 2);
            synchronized (this.mStatusLock) {
                this.mBluetoothConnectState = 1;
            }
        } catch (Exception e) {
            LogUtil.d(TAG, "initGattService occur exception ", ExceptionUtils.c(e));
        }
        return this.mBluetoothGatt != null;
    }

    private void release() {
        this.mConnectHandler.a(4);
        synchronized (this.mStatusLock) {
            LogUtil.b(TAG, "release gatt start. current bluetooth state:", Integer.valueOf(this.mBluetoothConnectState), cpl.a(this.mDeviceInfo));
        }
        synchronized (this.mLock) {
            if (this.mBluetoothGatt != null) {
                LogUtil.b(TAG, "start close gatt.", cpl.a(this.mDeviceInfo));
                try {
                    this.mBluetoothGatt.close();
                } catch (SecurityException e) {
                    LogUtil.d(TAG, "release SecurityException ", ExceptionUtils.c(e));
                }
                this.mBluetoothGatt = null;
            }
        }
        this.mConnectHandler.d(null);
        clq clqVar = this.mServiceDiscoveryExecutor;
        if (clqVar != null) {
            clqVar.d();
        }
        clq clqVar2 = this.mCharacterExecutor;
        if (clqVar2 != null) {
            clqVar2.d();
        }
    }

    private boolean startServiceDiscovery() {
        LogUtil.b(TAG, "startServiceDiscovery start", cpl.a(this.mDeviceInfo));
        this.mConnectHandler.a(2);
        sendTimeoutMessage(this.mConnectHandler, 2);
        if (this.mBluetoothGatt != null) {
            LogUtil.b(TAG, "start service discovery", cpl.a(this.mDeviceInfo));
            try {
                this.mBluetoothGatt.discoverServices();
                return true;
            } catch (SecurityException e) {
                LogUtil.d(TAG, "startServiceDiscovery SecurityException ", ExceptionUtils.c(e));
                return false;
            }
        }
        LogUtil.d(TAG, "startServiceDiscovery error. mBluetoothGatt is null", cpl.a(this.mDeviceInfo));
        return false;
    }

    private boolean checkInitCharacteristic() {
        LogUtil.b(TAG, "checkScaleStatusCharacteristic", cpl.a(this.mDeviceInfo));
        BluetoothGattCharacteristic characteristic = getCharacteristic(cmj.f1777b.toString(), cmj.f1776a.toString());
        if (characteristic == null) {
            LogUtil.e(TAG, "characteristic is null", cpl.a(this.mDeviceInfo));
            return false;
        }
        this.mCharacterExecutor.d();
        Message messageE = this.mConnectHandler.e(8);
        messageE.obj = characteristic;
        this.mConnectHandler.c(messageE);
        return true;
    }

    private BluetoothGattCharacteristic getCharacteristic(String str, String str2) {
        BluetoothGattService service;
        BluetoothGatt bluetoothGatt = this.mBluetoothGatt;
        if (bluetoothGatt == null) {
            LogUtil.d(TAG, "mBluetoothGatt is null", cpl.a(this.mDeviceInfo));
            return null;
        }
        if (str == null || str2 == null) {
            LogUtil.d(TAG, "invalid parameter");
            return null;
        }
        try {
            service = bluetoothGatt.getService(UUID.fromString(str));
        } catch (SecurityException e) {
            LogUtil.d(TAG, "getCharacteristic SecurityException", ExceptionUtils.c(e));
            service = null;
        }
        if (service == null) {
            LogUtil.d(TAG, "can not get service. serviceUuid: ", str, cpl.a(this.mDeviceInfo));
            return null;
        }
        BluetoothGattCharacteristic characteristic = service.getCharacteristic(UUID.fromString(str2));
        if (characteristic == null) {
            LogUtil.d(TAG, "can not get characteristic. : characteristicUuid", str2, cpl.a(this.mDeviceInfo));
        }
        return characteristic;
    }

    private boolean enableInitCharacteristic(final BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        LogUtil.b(TAG, "enableInitCharacteristic", cpl.a(this.mDeviceInfo));
        if (this.mBluetoothGatt == null) {
            return false;
        }
        this.mCharacterExecutor.c(new ExecuteActionInterface() { // from class: com.huawei.devicesdk.connect.physical.OpenBlePhysicalServiceBase.12
            @Override // com.huawei.devicesdk.connect.retry.ExecuteActionInterface
            public String getActionName() {
                return "InitStatusCharacteristic" + cpl.e(OpenBlePhysicalServiceBase.this.mDeviceInfo);
            }

            @Override // com.huawei.devicesdk.connect.retry.ExecuteActionInterface
            public boolean execute() {
                ArrayList arrayList = new ArrayList(16);
                arrayList.add(BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE);
                arrayList.add(BluetoothGattDescriptor.ENABLE_INDICATION_VALUE);
                return OpenBlePhysicalServiceBase.this.setCharacteristicNotification(bluetoothGattCharacteristic, true, arrayList);
            }
        }, new RetryCallbackInterface() { // from class: com.huawei.devicesdk.connect.physical.OpenBlePhysicalServiceBase.14
            @Override // com.huawei.devicesdk.connect.retry.RetryCallbackInterface
            public void doRetryAction(int i) {
                Message messageE = OpenBlePhysicalServiceBase.this.mConnectHandler.e(8);
                messageE.obj = bluetoothGattCharacteristic;
                OpenBlePhysicalServiceBase.this.mConnectHandler.a(messageE, 200L);
            }

            @Override // com.huawei.devicesdk.connect.retry.RetryCallbackInterface
            public void doSuccessAction() {
                LogUtil.b(OpenBlePhysicalServiceBase.TAG, "setCharacteristicNotification success", cpl.a(OpenBlePhysicalServiceBase.this.mDeviceInfo));
                OpenBlePhysicalServiceBase.this.mConnectHandler.a(8);
                OpenBlePhysicalServiceBase.this.mConnectHandler.c(OpenBlePhysicalServiceBase.this.mConnectHandler.e(11));
            }

            @Override // com.huawei.devicesdk.connect.retry.RetryCallbackInterface
            public void doFailureAction() {
                OpenBlePhysicalServiceBase.this.mConnectHandler.a(8);
                OpenBlePhysicalServiceBase.this.updateDeviceConnectState(3, cpi.c(2, 301));
            }
        }, true);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean setCharacteristicNotification(BluetoothGattCharacteristic bluetoothGattCharacteristic, boolean z, List<byte[]> list) {
        synchronized (this.mLock) {
            BluetoothGatt bluetoothGatt = this.mBluetoothGatt;
            if (bluetoothGatt == null) {
                LogUtil.e(TAG, "setCharacteristicNotification mBluetoothGatt is null.");
                return false;
            }
            try {
                boolean characteristicNotification = bluetoothGatt.setCharacteristicNotification(bluetoothGattCharacteristic, z);
                BluetoothGattDescriptor descriptor = bluetoothGattCharacteristic.getDescriptor(cmj.f1778c);
                if (descriptor != null) {
                    setDescriptorValue(bluetoothGattCharacteristic, descriptor, list);
                    String string = bluetoothGattCharacteristic.getUuid().toString();
                    this.mIsLocked.set(true);
                    characteristicNotification = this.mBluetoothGatt.writeDescriptor(descriptor);
                    LogUtil.b(TAG, "setCharacteristicNotification status:", Boolean.valueOf(characteristicNotification));
                    if (characteristicNotification) {
                        lock(string);
                    } else {
                        this.mIsLocked.set(false);
                    }
                }
                LogUtil.b(TAG, "setCharacteristicNotification", cpl.a(this.mDeviceInfo), " isEnable:", Boolean.valueOf(z), " character:", bluetoothGattCharacteristic.getUuid().toString(), " result:", Boolean.valueOf(characteristicNotification));
                return characteristicNotification;
            } catch (SecurityException e) {
                LogUtil.d(TAG, "setCharacteristicNotification SecurityException ", ExceptionUtils.c(e));
                return false;
            }
        }
    }

    private void enableDeviceCapability() {
        LogUtil.b(TAG, "enableDeviceCapability", cpl.a(this.mDeviceInfo));
        if (this.mBluetoothGatt == null) {
            return;
        }
        this.mCharacterExecutor.d();
        final List<BluetoothGattCharacteristic> deviceCapabilityCharacteristic = getDeviceCapabilityCharacteristic();
        this.mCharacterExecutor.c(new ExecuteActionInterface() { // from class: com.huawei.devicesdk.connect.physical.OpenBlePhysicalServiceBase.3
            @Override // com.huawei.devicesdk.connect.retry.ExecuteActionInterface
            public String getActionName() {
                return "DeviceCapabilityCharacteristic" + cpl.e(OpenBlePhysicalServiceBase.this.mDeviceInfo);
            }

            @Override // com.huawei.devicesdk.connect.retry.ExecuteActionInterface
            public boolean execute() {
                ArrayList arrayList = new ArrayList(16);
                arrayList.add(BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE);
                Iterator it = deviceCapabilityCharacteristic.iterator();
                while (it.hasNext()) {
                    if (!OpenBlePhysicalServiceBase.this.setCharacteristicNotification((BluetoothGattCharacteristic) it.next(), true, arrayList)) {
                        return false;
                    }
                }
                return true;
            }
        }, new RetryCallbackInterface() { // from class: com.huawei.devicesdk.connect.physical.OpenBlePhysicalServiceBase.5
            @Override // com.huawei.devicesdk.connect.retry.RetryCallbackInterface
            public void doRetryAction(int i) {
                Message messageE = OpenBlePhysicalServiceBase.this.mConnectHandler.e(11);
                messageE.obj = deviceCapabilityCharacteristic;
                OpenBlePhysicalServiceBase.this.mConnectHandler.a(messageE, 200L);
            }

            @Override // com.huawei.devicesdk.connect.retry.RetryCallbackInterface
            public void doSuccessAction() {
                LogUtil.b(OpenBlePhysicalServiceBase.TAG, "setCharacteristicNotification success", cpl.a(OpenBlePhysicalServiceBase.this.mDeviceInfo));
                OpenBlePhysicalServiceBase.this.mConnectHandler.a(11);
                OpenBlePhysicalServiceBase.this.updateDeviceConnectState(2, 100000);
            }

            @Override // com.huawei.devicesdk.connect.retry.RetryCallbackInterface
            public void doFailureAction() {
                LogUtil.b(OpenBlePhysicalServiceBase.TAG, "setCharacteristicNotification fail", cpl.a(OpenBlePhysicalServiceBase.this.mDeviceInfo));
                OpenBlePhysicalServiceBase.this.mConnectHandler.a(11);
                OpenBlePhysicalServiceBase.this.updateDeviceConnectState(3, cpi.c(2, 301));
            }
        }, true);
    }

    private List<BluetoothGattCharacteristic> getDeviceCapabilityCharacteristic() {
        String string = cmj.e.toString();
        ArrayList<String> arrayList = new ArrayList(16);
        arrayList.add(cmj.f.toString());
        ArrayList arrayList2 = new ArrayList();
        for (String str : arrayList) {
            BluetoothGattCharacteristic characteristic = getCharacteristic(string, str);
            if (characteristic == null) {
                LogUtil.e(TAG, "can not find characteristic. service:", string, " characteristic:", str);
            } else {
                arrayList2.add(characteristic);
            }
        }
        return arrayList2;
    }

    private void notifyMessage(cmm cmmVar, int i) {
        if (this.mMessageReceiveCallback != null) {
            this.mMessageReceiveCallback.onDataReceived(this.mDeviceInfo, cmmVar, i);
        } else {
            LogUtil.d(TAG, "device message call back is null", cpl.a(this.mDeviceInfo));
        }
    }

    public void updateDeviceConnectState(int i, int i2) {
        if (i == 2 || i == 3) {
            this.mConnectHandler.d(null);
        }
        Message messageE = this.mConnectHandler.e(10);
        messageE.arg1 = i;
        messageE.arg2 = i2;
        this.mConnectHandler.c(messageE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onDeviceStateChange(int i, int i2) {
        if (i == 133) {
            LogUtil.d(TAG, "onConnectionStateChange bluetooth 133 error", cpl.a(this.mDeviceInfo));
            updateDeviceConnectState(3, cpi.c(6, i));
        }
        if (i2 == 2) {
            LogUtil.b(TAG, "device connect success. ", cpl.a(this.mDeviceInfo));
            this.mConnectHandler.a(4);
            this.mConnectHandler.e(2, 1000L);
        } else {
            if (i2 == 0) {
                LogUtil.b(TAG, "device disconnect success.", cpl.a(this.mDeviceInfo));
                updateDeviceConnectState(0, cpi.c(6, i));
                disconnectDevice();
                return;
            }
            LogUtil.e(TAG, "onStateChange unknown", cpl.a(this.mDeviceInfo));
        }
    }

    protected void onMessageReceived(String str, byte[] bArr, int i) {
        cmm cmmVar = new cmm();
        cmmVar.c(str);
        cmmVar.a(bArr);
        Message messageE = this.mConnectHandler.e(9);
        messageE.arg1 = i;
        messageE.obj = cmmVar;
        this.mConnectHandler.c(messageE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sleepDelay(long j) {
        try {
            Thread.sleep(j);
        } catch (InterruptedException unused) {
            LogUtil.d(TAG, "sleep delay interrupted");
        }
    }
}
