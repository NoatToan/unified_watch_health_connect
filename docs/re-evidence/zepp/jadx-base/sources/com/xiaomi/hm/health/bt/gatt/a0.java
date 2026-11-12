package com.xiaomi.hm.health.bt.gatt;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import com.xiaomi.hm.health.bt.HMBleConfig;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.device.ScanReason;
import com.xiaomi.hm.health.bt.utils.ThreadUtil;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.functions.Function0;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes19.dex */
@SuppressLint({"NewApi"})
public abstract class a0 extends BluetoothGattCallback implements IGattCallback {
    private static final int A = 45000;
    private static final int B = 30000;
    public static final int GATT_ERROR = 133;
    public static final int GATT_VALUE_OUT_OF_RANGE = 255;
    private static final String v = "AbsGattCallback";
    private static final String w;
    private static final String x;
    private static final String y;
    private static final long z = 30;
    private final ReentrantLock a;
    private final Condition b;
    private final Object c;
    private final BluetoothDevice d;
    public DeviceAndBleBridge deviceAndBleBridge;
    private final Map<BluetoothGattCharacteristic, IGattCallback.INotifyCallback> e;
    private final AtomicBoolean f;
    private final HandlerThread g;
    private final Handler h;
    private boolean i;
    private int j;
    private boolean k;
    private int l;
    private int m;
    public final Context m_Context;
    private BluetoothGatt n;
    private IGattCallback.STATE o;
    private final AtomicInteger p;
    private final AtomicReference<Phy> q;
    private final ExecutorService r;
    private final Runnable s;
    private final Runnable t;
    private volatile boolean u;

    static {
        String simpleName = a0.class.getSimpleName();
        w = simpleName;
        x = simpleName + "*";
        y = simpleName;
    }

    public a0(Context context, BluetoothDevice device) {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.a = reentrantLock;
        this.b = reentrantLock.newCondition();
        this.c = new Object();
        this.e = new HashMap();
        this.f = new AtomicBoolean(false);
        this.i = false;
        this.j = 65534;
        this.k = false;
        this.l = 0;
        this.m = 65534;
        this.n = null;
        this.o = IGattCallback.STATE.DISCONNECTED;
        this.p = new AtomicInteger(-1);
        this.q = new AtomicReference<>();
        this.r = ThreadUtil.newSingleThreadExecutor(y);
        this.deviceAndBleBridge = null;
        this.s = new Runnable() { // from class: com.xiaomi.hm.health.bt.gatt.v
            @Override // java.lang.Runnable
            public final void run() {
                this.a.D();
            }
        };
        this.t = new Runnable() { // from class: com.xiaomi.hm.health.bt.gatt.f
            @Override // java.lang.Runnable
            public final void run() {
                a0.E();
            }
        };
        this.u = false;
        HandlerThread handlerThread = new HandlerThread(x);
        this.g = handlerThread;
        handlerThread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: com.xiaomi.hm.health.bt.gatt.g
            @Override // java.lang.Thread.UncaughtExceptionHandler
            public final void uncaughtException(Thread thread, Throwable th) {
                a0.F(thread, th);
            }
        });
        handlerThread.start();
        this.h = new Handler(handlerThread.getLooper());
        this.m_Context = context;
        this.d = device;
    }

    private boolean B(BluetoothGatt gatt) {
        return gatt != null && this.o == IGattCallback.STATE.CONNECTED;
    }

    private boolean C() {
        Context context = this.m_Context;
        return context != null && context.getSharedPreferences("hm_bluetooth", 0).getBoolean("refresh_gatt", false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void D() {
        this.o = IGattCallback.STATE.DISCONNECTED;
        Debug.fi(v, "=================================================");
        Debug.fi(v, "=============== CONNECT TIMEOUT ===============");
        Debug.fi(v, "=================================================");
        BluetoothSwitcher.offOn(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void E() {
        Debug.fi(v, "=================================================");
        Debug.fi(v, "============ discoverServices TIMEOUT ===========");
        Debug.fi(v, "=================================================");
        BluetoothSwitcher.offOn(2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void F(Thread thread, Throwable th) {
        Debug.fi(v, "c_GattQueueThread uncaughtException:" + th.getMessage());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String G(BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr) {
        return "Characteristic[" + bluetoothGattCharacteristic.getUuid() + "] Changed: " + GattUtils.bytesToHexString(bArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void H(IGattCallback.INotifyCallback iNotifyCallback, byte[] bArr) {
        if (iNotifyCallback != null) {
            iNotifyCallback.notify(bArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String I(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        return "NOTIFY: onCharacteristicRead[" + bluetoothGattCharacteristic.getUuid() + "]:" + this.j + ",value:" + GattUtils.bytesToHexString(bluetoothGattCharacteristic.getValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String J(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        return "NOTIFY: onCharacteristicWrite[" + bluetoothGattCharacteristic.getUuid() + "]: " + this.j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String M(BluetoothGattDescriptor bluetoothGattDescriptor) {
        return "NOTIFY: onDescriptorRead[" + bluetoothGattDescriptor.getUuid() + "]:" + this.j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String N(BluetoothGattDescriptor bluetoothGattDescriptor) {
        return "NOTIFY: onDescriptorWrite[" + bluetoothGattDescriptor.getUuid() + "]:" + this.j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String O() {
        return "NOTIFY: onReadRemoteRssi(): " + this.m;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String Q(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        return "Characteristic[" + bluetoothGattCharacteristic.getUuid() + "] Read";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void R(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        if (bluetoothGatt == null) {
            this.a.lock();
            try {
                this.j = 65281;
                this.i = false;
                this.b.signal();
                return;
            } finally {
                this.a.unlock();
            }
        }
        if (bluetoothGatt.readCharacteristic(bluetoothGattCharacteristic)) {
            return;
        }
        Debug.fi(v, "synchronizedReadCharacteristic GATT OPERATION FAILED");
        this.a.lock();
        try {
            this.j = 65282;
            this.i = false;
            this.b.signal();
        } finally {
            this.a.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String S(BluetoothGattDescriptor bluetoothGattDescriptor) {
        return "Descriptor[" + bluetoothGattDescriptor.getUuid() + "] Read";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void T(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor) {
        if (bluetoothGatt == null) {
            this.a.lock();
            try {
                this.j = 65281;
                this.i = false;
                this.b.signal();
                return;
            } finally {
                this.a.unlock();
            }
        }
        boolean descriptor = bluetoothGatt.readDescriptor(bluetoothGattDescriptor);
        Debug.assertTrue(descriptor);
        if (descriptor) {
            return;
        }
        Debug.fi(v, "synchronizedReadDescriptor GATT OPERATION FAILED");
        this.a.lock();
        try {
            this.j = 65282;
            this.i = false;
            this.b.signal();
        } finally {
            this.a.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String U(BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr) {
        return "Characteristic[" + bluetoothGattCharacteristic.getUuid() + "] Write: " + GattUtils.bytesToHexString(bArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void V(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr) {
        if (bluetoothGatt == null) {
            this.a.lock();
            try {
                this.j = 65281;
                this.i = false;
                this.b.signal();
                return;
            } finally {
                this.a.unlock();
            }
        }
        bluetoothGattCharacteristic.setValue(bArr);
        if (bluetoothGatt.writeCharacteristic(bluetoothGattCharacteristic)) {
            return;
        }
        Debug.fi(v, "synchronizedWriteCharacteristic GATT OPERATION FAILED");
        this.a.lock();
        try {
            this.j = 65282;
            this.i = false;
            this.b.signal();
        } finally {
            this.a.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String W(BluetoothGattDescriptor bluetoothGattDescriptor, byte[] bArr) {
        return "Descriptor[" + bluetoothGattDescriptor.getUuid() + "] Write:" + GattUtils.bytesToHexString(bArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void X(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, byte[] bArr) {
        if (bluetoothGatt == null) {
            this.a.lock();
            try {
                this.j = 65281;
                this.i = false;
                this.b.signal();
                return;
            } finally {
                this.a.unlock();
            }
        }
        bluetoothGattDescriptor.setValue(bArr);
        if (bluetoothGatt.writeDescriptor(bluetoothGattDescriptor)) {
            return;
        }
        Debug.fi(v, "synchronizedWriteDescriptor GATT OPERATION FAILED");
        this.a.lock();
        try {
            this.j = 65282;
            this.i = false;
            this.b.signal();
        } finally {
            this.a.unlock();
        }
    }

    private void Y(int errorCode) {
        if (HMBleConfig.SUPPORT_NOTIFY_GATT_OPERATE_ERROR) {
            BluetoothSwitcher.offOn(errorCode);
        }
    }

    private synchronized int a0(final BluetoothGatt gatt, final BluetoothGattCharacteristic characteristic) {
        ReentrantLock reentrantLock;
        try {
            Debug.ble(v, new Function0() { // from class: com.xiaomi.hm.health.bt.gatt.h
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return a0.Q(characteristic);
                }
            });
            Runnable runnable = new Runnable() { // from class: com.xiaomi.hm.health.bt.gatt.z
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.R(gatt, characteristic);
                }
            };
            this.a.lock();
            try {
                try {
                    this.i = true;
                    this.h.post(runnable);
                    while (this.i) {
                        if (!B(gatt)) {
                            Debug.fi(v, "synchronizedReadCharacteristic NO CONNECTION");
                            break;
                        }
                        this.b.await(30L, TimeUnit.SECONDS);
                        if (this.i) {
                            Y(5);
                            Debug.fi(v, "synchronizedReadCharacteristic GATT OPERATION TIMEOUT");
                            break;
                        }
                    }
                    reentrantLock = this.a;
                } catch (InterruptedException e) {
                    Debug.fi(v, "InterruptedException:" + e.getMessage());
                    reentrantLock = this.a;
                }
                reentrantLock.unlock();
            } catch (Throwable th) {
                this.a.unlock();
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.j;
    }

    private synchronized int b0(final BluetoothGatt gatt, final BluetoothGattDescriptor descriptor) {
        ReentrantLock reentrantLock;
        try {
            Debug.ble(v, new Function0() { // from class: com.xiaomi.hm.health.bt.gatt.k
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return a0.S(descriptor);
                }
            });
            Runnable runnable = new Runnable() { // from class: com.xiaomi.hm.health.bt.gatt.c
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.T(gatt, descriptor);
                }
            };
            this.a.lock();
            try {
                try {
                    this.i = true;
                    this.h.post(runnable);
                    while (this.i) {
                        if (!B(gatt)) {
                            Debug.fi(v, "synchronizedReadDescriptor NO CONNECTION");
                            break;
                        }
                        this.b.await(30L, TimeUnit.SECONDS);
                        if (this.i) {
                            Y(5);
                            Debug.fi(v, "synchronizedReadDescriptor GATT OPERATION TIMEOUT");
                            break;
                        }
                    }
                    reentrantLock = this.a;
                } catch (InterruptedException e) {
                    Debug.fi(v, "InterruptedException:" + e.getMessage());
                    reentrantLock = this.a;
                }
                reentrantLock.unlock();
            } catch (Throwable th) {
                this.a.unlock();
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.j;
    }

    private synchronized int c0(final BluetoothGatt gatt, final BluetoothGattCharacteristic characteristic, final byte[] value) {
        ReentrantLock reentrantLock;
        try {
            Debug.ble(v, new Function0() { // from class: com.xiaomi.hm.health.bt.gatt.i
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return a0.U(characteristic, value);
                }
            });
            Runnable runnable = new Runnable() { // from class: com.xiaomi.hm.health.bt.gatt.b
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.V(gatt, characteristic, value);
                }
            };
            this.a.lock();
            try {
                try {
                    this.i = true;
                    this.h.post(runnable);
                    while (this.i) {
                        if (!B(gatt)) {
                            Debug.fi(v, "synchronizedWriteCharacteristic NO CONNECTION");
                            break;
                        }
                        this.b.await(30L, TimeUnit.SECONDS);
                        if (this.i) {
                            Y(5);
                            Debug.fi(v, "synchronizedWriteCharacteristic GATT OPERATION TIMEOUT");
                            break;
                        }
                    }
                    reentrantLock = this.a;
                } catch (InterruptedException e) {
                    Debug.fi(v, "InterruptedException:" + e.getMessage());
                    reentrantLock = this.a;
                }
                reentrantLock.unlock();
            } catch (Throwable th) {
                this.a.unlock();
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.j;
    }

    private synchronized int d0(final BluetoothGatt gatt, final BluetoothGattDescriptor descriptor, final byte[] value) {
        ReentrantLock reentrantLock;
        try {
            Debug.ble(v, new Function0() { // from class: com.xiaomi.hm.health.bt.gatt.m
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return a0.W(descriptor, value);
                }
            });
            Runnable runnable = new Runnable() { // from class: com.xiaomi.hm.health.bt.gatt.d
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.X(gatt, descriptor, value);
                }
            };
            this.a.lock();
            try {
                try {
                    this.i = true;
                    this.h.post(runnable);
                    while (this.i) {
                        if (!B(gatt)) {
                            Debug.fi(v, "synchronizedWriteDescriptor NO CONNECTION");
                            break;
                        }
                        this.b.await(30L, TimeUnit.SECONDS);
                        if (this.i) {
                            Y(5);
                            Debug.fi(v, "synchronizedWriteDescriptor GATT OPERATION TIMEOUT");
                            break;
                        }
                    }
                    reentrantLock = this.a;
                } catch (InterruptedException e) {
                    Debug.fi(v, "InterruptedException:" + e.getMessage());
                    reentrantLock = this.a;
                }
                reentrantLock.unlock();
            } catch (Throwable th) {
                this.a.unlock();
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.j;
    }

    public static boolean isBluetoothSwitching() {
        return BluetoothSwitcher.isSwitching();
    }

    private void w() {
        this.a.lock();
        try {
            this.i = false;
            this.j = 65534;
            Debug.fi(v, "RELEASE: c_condGattOperationComplete");
            this.b.signalAll();
            this.a.unlock();
            synchronized (this.c) {
                this.k = false;
                this.l = 0;
                this.m = 65534;
                Debug.fi(v, "RELEASE: c_RSSILock");
                this.c.notifyAll();
            }
            synchronized (this) {
                if (this.n != null) {
                    Debug.fi(v, "******Gatt close:<" + Integer.toHexString(this.n.hashCode()) + "," + GattUtils.getClientIf(this.n) + ">******");
                    this.n.disconnect();
                    this.n.close();
                    this.n = null;
                }
            }
        } catch (Throwable th) {
            this.a.unlock();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y() {
        Debug.fi(v, "destroyInternal m_Gatt:" + this.n + ",m_State:" + this.o);
        this.o = IGattCallback.STATE.DISCONNECTED;
        setAutoReconnect(false);
        w();
        this.h.removeCallbacksAndMessages(null);
    }

    public boolean A() {
        BluetoothGatt bluetoothGatt = this.n;
        return bluetoothGatt != null && bluetoothGatt.discoverServices();
    }

    public final int Z(BluetoothGattDescriptor descriptor) {
        int iB0 = b0(this.n, descriptor);
        if (iB0 != 143) {
            return iB0;
        }
        Debug.fi(v, "readDescriptor " + descriptor.getUuid() + " get GATT_CONNECTION_CONGESTED!!!");
        return 0;
    }

    public void cleanupGatt() {
        Debug.fi(v, "m_State: " + this.o);
        this.o = IGattCallback.STATE.DISCONNECTED;
        this.h.removeCallbacksAndMessages(null);
        this.e.clear();
        if (C()) {
            refreshGatt(false);
            enableRefreshGatt(false);
        }
        w();
    }

    public void connect() {
        this.r.execute(new Runnable() { // from class: com.xiaomi.hm.health.bt.gatt.a
            @Override // java.lang.Runnable
            public final void run() {
                this.a.x();
            }
        });
    }

    public void destroy() {
        this.r.execute(new Runnable() { // from class: com.xiaomi.hm.health.bt.gatt.u
            @Override // java.lang.Runnable
            public final void run() {
                this.a.y();
            }
        });
    }

    public void disconnect() {
        this.r.execute(new Runnable() { // from class: com.xiaomi.hm.health.bt.gatt.l
            @Override // java.lang.Runnable
            public final void run() {
                this.a.z();
            }
        });
    }

    public void enableRefreshGatt(boolean enable) {
        Context context = this.m_Context;
        if (context == null) {
            Debug.fi(v, "enableRefreshGatt failed as context is null!!!");
            return;
        }
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("hm_bluetooth", 0).edit();
        editorEdit.putBoolean("refresh_gatt", enable);
        editorEdit.commit();
    }

    public BluetoothDevice getDevice() {
        return this.d;
    }

    public DeviceAndBleBridge getDeviceAndBleBridge() {
        return this.deviceAndBleBridge;
    }

    public BluetoothGattService getService(UUID uuid) {
        BluetoothGatt bluetoothGatt = this.n;
        if (bluetoothGatt == null) {
            return null;
        }
        return bluetoothGatt.getService(uuid);
    }

    public List<BluetoothGattService> getServices() {
        BluetoothGatt bluetoothGatt = this.n;
        if (bluetoothGatt == null) {
            return null;
        }
        return bluetoothGatt.getServices();
    }

    @Override // com.xiaomi.hm.health.bt.gatt.IGattCallback
    public final IGattCallback.STATE getState() {
        return this.o;
    }

    public boolean hasNotification(BluetoothGattCharacteristic characteristic) {
        return this.e.containsKey(characteristic);
    }

    public synchronized boolean isPauseConnectForScan() {
        return this.u;
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onCharacteristicChanged(BluetoothGatt gatt, final BluetoothGattCharacteristic characteristic) {
        final byte[] value = characteristic.getValue();
        Debug.ble(v, new Function0() { // from class: com.xiaomi.hm.health.bt.gatt.j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return a0.G(characteristic, value);
            }
        });
        final IGattCallback.INotifyCallback iNotifyCallback = this.e.get(characteristic);
        this.r.execute(new Runnable() { // from class: com.xiaomi.hm.health.bt.gatt.e
            @Override // java.lang.Runnable
            public final void run() {
                a0.H(iNotifyCallback, value);
            }
        });
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onCharacteristicRead(BluetoothGatt gatt, final BluetoothGattCharacteristic characteristic, int status) {
        this.a.lock();
        try {
            this.j = status;
            Debug.ble(v, new Function0() { // from class: com.xiaomi.hm.health.bt.gatt.o
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return this.a.I(characteristic);
                }
            });
            this.i = false;
            this.b.signal();
            this.a.unlock();
            if (status != 0) {
                Debug.fi(v, "onCharacteristicRead:" + characteristic.getUuid() + ",status:" + status);
            }
        } catch (Throwable th) {
            this.a.unlock();
            throw th;
        }
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onCharacteristicWrite(BluetoothGatt gatt, final BluetoothGattCharacteristic characteristic, int status) {
        this.a.lock();
        try {
            this.j = status;
            Debug.ble(v, new Function0() { // from class: com.xiaomi.hm.health.bt.gatt.p
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return this.a.J(characteristic);
                }
            });
            this.i = false;
            this.b.signal();
            this.a.unlock();
            if (status != 0) {
                Debug.fi(v, "onCharacteristicWrite:" + characteristic.getUuid() + ",status:" + status);
            }
        } catch (Throwable th) {
            this.a.unlock();
            throw th;
        }
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onConnectionStateChange(BluetoothGatt gatt, final int status, int newState) {
        StringBuilder sb = new StringBuilder();
        sb.append("onConnectionStateChange Gatt:");
        sb.append(gatt != null ? Integer.toHexString(gatt.hashCode()) : "null");
        sb.append(",device:");
        sb.append(gatt != null ? gatt.getDevice() : "null");
        sb.append(",status:");
        sb.append(status);
        sb.append(",newState:");
        sb.append(newState);
        Debug.fi(v, sb.toString());
        this.f.set(false);
        this.h.removeCallbacks(this.s);
        if (this.n != gatt) {
            Debug.fi(v, "m_Gatt:" + this.n + ",gatt:" + gatt);
        }
        int clientIf = GattUtils.getClientIf(this.n);
        if (status != 0) {
            this.o = IGattCallback.STATE.DISCONNECTED;
            Debug.fi(v, "=================================================");
            Debug.fi(v, "=============== CONNECTION FAILED ===============");
            Debug.fi(v, "=================================================");
            Debug.fi(v, "clientIf is " + clientIf);
            if (clientIf == 0) {
                BluetoothSwitcher.offOn(3);
                return;
            } else {
                this.r.execute(new Runnable() { // from class: com.xiaomi.hm.health.bt.gatt.w
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.L(status);
                    }
                });
                return;
            }
        }
        if (newState == 0) {
            this.o = IGattCallback.STATE.DISCONNECTED;
            Debug.fi(v, "=================================================");
            Debug.fi(v, "================== DISCONNECTED =================");
            Debug.fi(v, "=================================================");
            this.r.execute(new Runnable() { // from class: com.xiaomi.hm.health.bt.gatt.y
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.K(status);
                }
            });
            return;
        }
        if (newState != 2) {
            Debug.warn(">>> UNEXPECTED <<<");
            return;
        }
        if (this.n == null) {
            Debug.fi(v, "try fix error : onConnectionStateChange callback before connectGatt return");
            this.n = gatt;
        }
        this.o = IGattCallback.STATE.CONNECTED;
        Debug.fi(v, "=================================================");
        Debug.fi(v, "=================== CONNECTED ===================");
        Debug.fi(v, "=================================================");
        Debug.fi(v, "******Gatt connected:<" + Integer.toHexString(this.n.hashCode()) + "," + clientIf + ">******");
        this.r.execute(new Runnable() { // from class: com.xiaomi.hm.health.bt.gatt.s
            @Override // java.lang.Runnable
            public final void run() {
                this.a.onGattConnected();
            }
        });
        this.h.postDelayed(this.t, 30000L);
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onDescriptorRead(BluetoothGatt gatt, final BluetoothGattDescriptor descriptor, int status) {
        this.a.lock();
        try {
            this.j = status;
            Debug.ble(v, new Function0() { // from class: com.xiaomi.hm.health.bt.gatt.r
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return this.a.M(descriptor);
                }
            });
            this.i = false;
            this.b.signal();
            this.a.unlock();
            if (status != 0) {
                Debug.fi(v, "onDescriptorRead:" + descriptor.getUuid() + ",status:" + status);
            }
        } catch (Throwable th) {
            this.a.unlock();
            throw th;
        }
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onDescriptorWrite(BluetoothGatt gatt, final BluetoothGattDescriptor descriptor, int status) {
        this.a.lock();
        try {
            this.j = status;
            Debug.ble(v, new Function0() { // from class: com.xiaomi.hm.health.bt.gatt.q
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return this.a.N(descriptor);
                }
            });
            this.i = false;
            this.b.signal();
            this.a.unlock();
            if (status != 0) {
                Debug.fi(v, "onDescriptorWrite:" + descriptor.getUuid() + ",status:" + status);
            }
        } catch (Throwable th) {
            this.a.unlock();
            throw th;
        }
    }

    public abstract void onGattConnected();

    /* JADX INFO: renamed from: onGattConnectionFailed, reason: merged with bridge method [inline-methods] */
    public abstract void L(int status);

    /* JADX INFO: renamed from: onGattDisconnected, reason: merged with bridge method [inline-methods] */
    public abstract void K(int status);

    /* JADX INFO: renamed from: onGattServiceDiscoverFailed, reason: merged with bridge method [inline-methods] */
    public abstract void P(int status);

    public abstract void onGattServiceDiscovered();

    @Override // android.bluetooth.BluetoothGattCallback
    public void onMtuChanged(BluetoothGatt gatt, int mtu, int status) {
        synchronized (this.p) {
            Debug.fi(v, "mtu:" + mtu + ",status:" + status);
            AtomicInteger atomicInteger = this.p;
            if (status != 0) {
                mtu = 0;
            }
            atomicInteger.getAndSet(mtu);
            this.p.notify();
        }
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public void onPhyUpdate(BluetoothGatt gatt, int txPhy, int rxPhy, int status) {
        synchronized (this.q) {
            Debug.fi(v, "onPhyUpdate txPhy:" + txPhy + ",rxPhy:" + rxPhy + ",status:" + status);
            this.q.getAndSet(status == 0 ? new Phy(txPhy, rxPhy) : new Phy());
            this.q.notify();
        }
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onReadRemoteRssi(BluetoothGatt gatt, final int rssi, int status) {
        synchronized (this.c) {
            this.l = rssi;
            this.m = status;
            Debug.ble(v, new Function0() { // from class: com.xiaomi.hm.health.bt.gatt.n
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return this.a.O();
                }
            });
            this.k = false;
            this.c.notify();
        }
        if (status != 0) {
            Debug.fi(v, "onReadRemoteRssi status:" + status);
        }
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onReliableWriteCompleted(BluetoothGatt gatt, int status) {
        Debug.fi(v, ">>> UNEXPECTED <<<");
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onServicesDiscovered(BluetoothGatt gatt, final int status) {
        StringBuilder sb = new StringBuilder();
        sb.append("onServicesDiscovered Gatt:");
        sb.append(gatt != null ? Integer.toHexString(gatt.hashCode()) : "null");
        sb.append(",device:");
        sb.append(gatt != null ? gatt.getDevice() : "null");
        sb.append(",status:");
        sb.append(status);
        Debug.fi(v, sb.toString());
        this.h.removeCallbacks(this.t);
        if (this.f.get()) {
            Debug.fi(v, "onServicesDiscovered call twice,return now!!!");
            return;
        }
        this.f.set(true);
        if (status == 0) {
            this.r.execute(new Runnable() { // from class: com.xiaomi.hm.health.bt.gatt.t
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.onGattServiceDiscovered();
                }
            });
        } else {
            this.r.execute(new Runnable() { // from class: com.xiaomi.hm.health.bt.gatt.x
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.P(status);
                }
            });
        }
    }

    public synchronized void reConnectWithScan(ScanReason scanReason) {
        DeviceAndBleBridge deviceAndBleBridge = this.deviceAndBleBridge;
        if (deviceAndBleBridge == null) {
            Debug.fi(v, "bridge cannot be null!");
        } else {
            if (this.u) {
                Debug.fi(v, "already scanning!");
                return;
            }
            if (isAutoReconnect().booleanValue()) {
                setPauseConnectForScan(true);
                deviceAndBleBridge.reConnectWithScan(scanReason);
            }
        }
    }

    @Override // com.xiaomi.hm.health.bt.gatt.IGattCallback
    public final int readCharacteristic(BluetoothGattCharacteristic characteristic) {
        int iA0 = a0(this.n, characteristic);
        Debug.fi(v, "readCharacteristic status: " + iA0);
        if (iA0 != 143) {
            return iA0;
        }
        Debug.fi(v, "readCharacteristic " + characteristic.getUuid() + " get GATT_CONNECTION_CONGESTED!!!");
        return 0;
    }

    public int readRemoteRssi() {
        this.k = true;
        BluetoothGatt bluetoothGatt = this.n;
        if (bluetoothGatt == null) {
            this.k = false;
            return 0;
        }
        if (!bluetoothGatt.readRemoteRssi()) {
            this.k = false;
            return 0;
        }
        synchronized (this.c) {
            while (this.k) {
                try {
                    this.c.wait(30L);
                    if (this.k) {
                        Y(5);
                        Debug.fi(v, "readRemoteRssi GATT OPERATION TIMEOUT");
                        break;
                    }
                } catch (InterruptedException e) {
                    Debug.fi(v, "InterruptedException:" + e.getMessage());
                }
            }
            if (this.m != 0) {
                return 0;
            }
            return this.l;
        }
    }

    public void refreshGatt(boolean wait) {
        if (!HMBleConfig.SUPPORT_REFRESH_GATT) {
            Debug.fi(v, "not support refreshGatt");
            return;
        }
        try {
            Debug.fi(v, "refreshGatt, wait: " + wait);
            BluetoothGatt.class.getDeclaredMethod("refresh", null).invoke(this.n, null);
            if (wait) {
                Thread.sleep(2000L);
            }
        } catch (Exception e) {
            Debug.fi(v, "refreshGatt exception:" + e.getMessage());
        }
    }

    public void registerCallback(BluetoothGattCharacteristic characteristic, IGattCallback.INotifyCallback notifyCB) {
        if (this.e.containsKey(characteristic)) {
            return;
        }
        this.e.put(characteristic, notifyCB);
    }

    public boolean registerNotification(BluetoothGattCharacteristic characteristic, IGattCallback.INotifyCallback notifyCB) {
        int iD0;
        Debug.fi(v, "registerNotification:" + characteristic.getUuid());
        if (!B(this.n)) {
            Debug.fi(v, "registerNotification failed as not connected!!!");
            return false;
        }
        boolean z2 = true;
        if (!this.n.setCharacteristicNotification(characteristic, true)) {
            Debug.fi(v, "setCharacteristicNotification true failed!");
            return false;
        }
        UUID uuid = GattUtils.UUID_DESCRIPTOR_CLIENT_CHARACTERISTIC_CONFIGURATION;
        BluetoothGattDescriptor descriptor = characteristic.getDescriptor(uuid);
        if (descriptor == null) {
            Debug.fi(v, uuid + " is null!");
            return false;
        }
        if (notifyCB != null) {
            this.e.put(characteristic, notifyCB);
        }
        int properties = characteristic.getProperties();
        if ((properties & 16) > 0) {
            iD0 = d0(this.n, descriptor, BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE);
        } else {
            if ((properties & 32) <= 0) {
                Debug.fi(v, "properties " + properties + " is not support");
                this.e.remove(characteristic);
                return false;
            }
            iD0 = d0(this.n, descriptor, BluetoothGattDescriptor.ENABLE_INDICATION_VALUE);
        }
        if (iD0 == 143) {
            Debug.fi(v, "registerNotification " + characteristic.getUuid() + " get GATT_CONNECTION_CONGESTED!!!");
        } else {
            z2 = iD0 == 0;
        }
        if (!z2) {
            this.e.remove(characteristic);
        }
        Debug.fi(v, "registerNotification:" + characteristic.getUuid() + ",ret:" + z2);
        return z2;
    }

    public boolean requestConnectionPriority(int connectionPriority) {
        BluetoothGatt bluetoothGatt;
        return Build.VERSION.SDK_INT >= 21 && (bluetoothGatt = this.n) != null && bluetoothGatt.requestConnectionPriority(connectionPriority);
    }

    public int requestMtu(int mtu) {
        BluetoothGatt bluetoothGatt;
        synchronized (this.p) {
            this.p.set(-1);
            if (Build.VERSION.SDK_INT >= 21 && (bluetoothGatt = this.n) != null && bluetoothGatt.requestMtu(mtu)) {
                while (this.p.get() == -1) {
                    try {
                        this.p.wait(30000L);
                    } catch (Exception e) {
                        Debug.fi(v, "requestMtu Exception:" + e.getMessage());
                    }
                    if (this.p.get() == -1) {
                        this.p.getAndSet(0);
                    }
                }
                return this.p.get();
            }
            return -1;
        }
    }

    public void setDeviceAndBleBridge(DeviceAndBleBridge deviceAndBleBridge) {
        this.deviceAndBleBridge = deviceAndBleBridge;
    }

    public synchronized void setPauseConnectForScan(boolean isAutoReconnecting) {
        this.u = isAutoReconnecting;
    }

    public Phy setPreferredPhy(int txPhy, int rxPhy, int phyOptions) {
        Debug.fi(v, "setPreferredPhy txPhy:" + txPhy + ",rxPhy:" + rxPhy + ",opt:" + phyOptions);
        synchronized (this.q) {
            if (Build.VERSION.SDK_INT >= 26 && this.n != null) {
                this.q.set(null);
                this.n.setPreferredPhy(txPhy, rxPhy, phyOptions);
                while (this.q.get() == null) {
                    try {
                        this.q.wait(30000L);
                    } catch (Exception e) {
                        Debug.fi(v, "setPreferredPhy Exception:" + e.getMessage());
                    }
                    if (this.q.get() == null) {
                        this.q.getAndSet(new Phy());
                    }
                }
                return this.q.get();
            }
            return null;
        }
    }

    public void unRegisterCallback(BluetoothGattCharacteristic characteristic) {
        this.e.remove(characteristic);
    }

    public boolean unregisterNotification(BluetoothGattCharacteristic characteristic) {
        Debug.fi(v, "unregisterNotification:" + characteristic.getUuid());
        this.e.remove(characteristic);
        if (!B(this.n)) {
            Debug.i(v, "unregisterNotification failed as not connected!");
            return false;
        }
        if (!this.n.setCharacteristicNotification(characteristic, false)) {
            Debug.fi(v, "setCharacteristicNotification: false failed!");
            return false;
        }
        UUID uuid = GattUtils.UUID_DESCRIPTOR_CLIENT_CHARACTERISTIC_CONFIGURATION;
        BluetoothGattDescriptor descriptor = characteristic.getDescriptor(uuid);
        if (descriptor == null) {
            Debug.fi(v, uuid + " is null!");
            return false;
        }
        int iD0 = d0(this.n, descriptor, BluetoothGattDescriptor.DISABLE_NOTIFICATION_VALUE);
        boolean z2 = true;
        if (iD0 == 143) {
            Debug.fi(v, "unregisterNotification " + characteristic.getUuid() + " get GATT_CONNECTION_CONGESTED!!!");
        } else {
            z2 = iD0 == 0;
        }
        Debug.fi(v, "unregisterNotification:" + characteristic.getUuid() + ",ret:" + z2);
        return z2;
    }

    @Override // com.xiaomi.hm.health.bt.gatt.IGattCallback
    public final int writeCharacteristic(BluetoothGattCharacteristic characteristic, byte[] value) {
        int iC0 = c0(this.n, characteristic, value);
        if (iC0 != 143) {
            return iC0;
        }
        Debug.fi(v, "writeCharacteristic " + characteristic.getUuid() + " get GATT_CONNECTION_CONGESTED!!!");
        return 0;
    }

    public void x() {
        setPauseConnectForScan(false);
        if (this.o != IGattCallback.STATE.DISCONNECTED) {
            Debug.fi(v, "connectInternal Illegal state: m_State = " + this.o);
        }
        this.o = IGattCallback.STATE.CONNECTING;
        this.h.postDelayed(this.s, 45000L);
        try {
            Debug.fi(v, "Device type before connectGatt:" + GattUtils.getBluetoothDeviceType(this.d));
            if (Build.VERSION.SDK_INT >= 23) {
                this.n = this.d.connectGatt(this.m_Context, false, this, 2);
            } else {
                this.n = this.d.connectGatt(this.m_Context, false, this);
            }
        } catch (Exception e) {
            Debug.fi(v, "connectGatt e: " + e);
        }
        if (this.n != null) {
            BluetoothSwitcher.offOn(0);
            Debug.fi(v, "******Gatt create:<" + Integer.toHexString(this.n.hashCode()) + ">******");
            return;
        }
        Debug.fi(v, "connectGatt<" + this.d.getAddress() + "> return null, now disable bluetooth!!!");
        this.h.removeCallbacks(this.s);
        BluetoothSwitcher.offOn(4);
    }

    public void z() {
        Debug.fi(v, "disconnectInternal m_Gatt:" + this.n + ",m_State:" + this.o);
        if (!B(this.n)) {
            Debug.fi(v, "return as not connected!");
        } else {
            this.o = IGattCallback.STATE.DISCONNECTING;
            this.n.disconnect();
        }
    }
}
