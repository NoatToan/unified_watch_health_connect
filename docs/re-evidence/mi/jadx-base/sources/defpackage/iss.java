package defpackage;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.HandlerThread;
import com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeProgressBar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes11.dex */
@SuppressLint({"NewApi"})
public abstract class iss extends BluetoothGattCallback implements zh {
    public static final String y;
    public static final String z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReentrantLock f22062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Condition f22063b;
    public final Object c;
    public final Context d;
    public final BluetoothDevice e;
    public final Map<BluetoothGattCharacteristic, zh.b> f;
    public final AtomicBoolean g;
    public final HandlerThread h;
    public final Handler i;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f22064k;
    public boolean l;
    public int m;
    public int n;
    public BluetoothGatt o;
    public zh.c p;
    public final AtomicInteger q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final AtomicReference<qhs> f22065r;
    public final ExecutorService s;
    public t6 t;
    public final AtomicBoolean u;
    public final Runnable v;
    public final Runnable w;
    public volatile boolean x;

    static {
        String simpleName = iss.class.getSimpleName();
        y = simpleName + Marker.ANY_MARKER;
        z = simpleName;
    }

    public iss(Context context, BluetoothDevice bluetoothDevice) {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f22062a = reentrantLock;
        this.f22063b = reentrantLock.newCondition();
        this.c = new Object();
        this.f = new HashMap();
        this.g = new AtomicBoolean(false);
        this.j = false;
        this.f22064k = 65534;
        this.l = false;
        this.m = 0;
        this.n = 65534;
        this.o = null;
        this.p = zh.c.DISCONNECTED;
        this.q = new AtomicInteger(-1);
        this.f22065r = new AtomicReference<>();
        this.s = k8t.d(z, new RejectedExecutionHandler() { // from class: uqs
            @Override // java.util.concurrent.RejectedExecutionHandler
            public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
                t5t.d("AbsGattCallback", "rejected runnable=" + runnable.toString());
            }
        });
        this.t = null;
        this.u = new AtomicBoolean(false);
        this.v = new Runnable() { // from class: vqs
            @Override // java.lang.Runnable
            public final void run() {
                this.f37146a.q0();
            }
        };
        this.w = new Runnable() { // from class: wqs
            @Override // java.lang.Runnable
            public final void run() {
                iss.r0();
            }
        };
        this.x = false;
        HandlerThread handlerThread = new HandlerThread(y);
        this.h = handlerThread;
        handlerThread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: xqs
            @Override // java.lang.Thread.UncaughtExceptionHandler
            public final void uncaughtException(Thread thread, Throwable th) {
                t5t.d("AbsGattCallback", "c_GattQueueThread uncaughtException:" + th.getMessage());
            }
        });
        handlerThread.start();
        this.i = new Handler(handlerThread.getLooper());
        this.d = context;
        this.e = bluetoothDevice;
    }

    public static /* synthetic */ void B(zh.b bVar, byte[] bArr) {
        if (bVar != null) {
            bVar.e(bArr);
        }
    }

    public static /* synthetic */ String K(BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr) {
        return "Characteristic[" + bluetoothGattCharacteristic.getUuid() + "] Write: " + tet.x(bArr);
    }

    public static /* synthetic */ String Q(BluetoothGattDescriptor bluetoothGattDescriptor) {
        return "Descriptor[" + bluetoothGattDescriptor.getUuid() + "] Read";
    }

    public static /* synthetic */ String U(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        return "Characteristic[" + bluetoothGattCharacteristic.getUuid() + "] Read";
    }

    public static /* synthetic */ String q(BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr) {
        return "Characteristic[" + bluetoothGattCharacteristic.getUuid() + "] Changed: " + tet.x(bArr);
    }

    public static /* synthetic */ void r0() {
        t5t.d("AbsGattCallback", "=================================================");
        t5t.d("AbsGattCallback", "============ discoverServices TIMEOUT ===========");
        t5t.d("AbsGattCallback", "=================================================");
        fct.a(2);
    }

    public static /* synthetic */ String s(BluetoothGattDescriptor bluetoothGattDescriptor, byte[] bArr) {
        return "Descriptor[" + bluetoothGattDescriptor.getUuid() + "] Write:" + tet.x(bArr);
    }

    public void A(t6 t6Var) {
        this.t = t6Var;
    }

    public final boolean C(BluetoothGatt bluetoothGatt) {
        return bluetoothGatt != null && this.p == zh.c.CONNECTED;
    }

    public final boolean D(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        return this.f.containsKey(bluetoothGattCharacteristic);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00a4  */
    public final boolean E(BluetoothGattCharacteristic bluetoothGattCharacteristic, zh.b bVar) {
        int I;
        t5t.d("AbsGattCallback", "registerNotification:" + bluetoothGattCharacteristic.getUuid());
        boolean z2 = false;
        try {
            if (!C(this.o)) {
                t5t.d("AbsGattCallback", "registerNotification failed as not connected!!!");
                return false;
            }
            if (!this.o.setCharacteristicNotification(bluetoothGattCharacteristic, true)) {
                t5t.d("AbsGattCallback", "setCharacteristicNotification true failed!");
                return false;
            }
            UUID uuid = tet.f34631a;
            BluetoothGattDescriptor descriptor = bluetoothGattCharacteristic.getDescriptor(uuid);
            if (descriptor == null) {
                t5t.d("AbsGattCallback", uuid + " is null!");
                return false;
            }
            if (bVar != null) {
                this.f.put(bluetoothGattCharacteristic, bVar);
            }
            int properties = bluetoothGattCharacteristic.getProperties();
            if ((properties & 16) > 0) {
                I = I(this.o, descriptor, BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE);
            } else {
                if ((properties & 32) <= 0) {
                    t5t.d("AbsGattCallback", "properties " + properties + " is not support");
                    this.f.remove(bluetoothGattCharacteristic);
                    return false;
                }
                I = I(this.o, descriptor, BluetoothGattDescriptor.ENABLE_INDICATION_VALUE);
            }
            if (I != 143) {
                if (I == 0) {
                }
                if (!z2) {
                    this.f.remove(bluetoothGattCharacteristic);
                }
                t5t.d("AbsGattCallback", "registerNotification:" + bluetoothGattCharacteristic.getUuid() + ",ret:" + z2);
                return z2;
            }
            t5t.d("AbsGattCallback", "registerNotification " + bluetoothGattCharacteristic.getUuid() + " get GATT_CONNECTION_CONGESTED!!!");
            z2 = true;
            if (!z2) {
                this.f.remove(bluetoothGattCharacteristic);
            }
            t5t.d("AbsGattCallback", "registerNotification:" + bluetoothGattCharacteristic.getUuid() + ",ret:" + z2);
            return z2;
        } catch (Exception e) {
            t5t.d("AbsGattCallback", "setCharacteristicNotification failed:" + e.getMessage());
            return false;
        }
    }

    public final synchronized int F(final BluetoothGatt bluetoothGatt, final BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        t5t.g("AbsGattCallback", new Function0() { // from class: ers
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return iss.U(bluetoothGattCharacteristic);
            }
        });
        Runnable runnable = new Runnable() { // from class: frs
            @Override // java.lang.Runnable
            public final void run() {
                this.f18138a.t(bluetoothGatt, bluetoothGattCharacteristic);
            }
        };
        this.f22062a.lock();
        try {
            try {
                this.j = true;
                this.i.post(runnable);
                while (this.j) {
                    if (!C(bluetoothGatt)) {
                        t5t.d("AbsGattCallback", "synchronizedReadCharacteristic NO CONNECTION");
                        break;
                    }
                    this.f22063b.await(30L, TimeUnit.SECONDS);
                    if (this.j) {
                        b0(5);
                        t5t.d("AbsGattCallback", "synchronizedReadCharacteristic GATT OPERATION TIMEOUT");
                        break;
                    }
                }
            } catch (InterruptedException e) {
                t5t.d("AbsGattCallback", "InterruptedException:" + e.getMessage());
            }
        } finally {
            this.f22062a.unlock();
        }
        return this.f22064k;
    }

    public final synchronized int G(final BluetoothGatt bluetoothGatt, final BluetoothGattCharacteristic bluetoothGattCharacteristic, final byte[] bArr) {
        t5t.g("AbsGattCallback", new Function0() { // from class: prs
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return iss.K(bluetoothGattCharacteristic, bArr);
            }
        });
        Runnable runnable = new Runnable() { // from class: qrs
            @Override // java.lang.Runnable
            public final void run() {
                this.f31785a.u(bluetoothGatt, bluetoothGattCharacteristic, bArr);
            }
        };
        this.f22062a.lock();
        try {
            try {
                this.j = true;
                this.i.post(runnable);
                while (this.j) {
                    if (!C(bluetoothGatt)) {
                        t5t.d("AbsGattCallback", "synchronizedWriteCharacteristic NO CONNECTION");
                        break;
                    }
                    this.f22063b.await(30L, TimeUnit.SECONDS);
                    if (this.j) {
                        b0(5);
                        t5t.d("AbsGattCallback", "synchronizedWriteCharacteristic GATT OPERATION TIMEOUT");
                        break;
                    }
                }
            } catch (InterruptedException e) {
                t5t.d("AbsGattCallback", "InterruptedException:" + e.getMessage());
            }
        } finally {
            this.f22062a.unlock();
        }
        return this.f22064k;
    }

    public final synchronized int H(final BluetoothGatt bluetoothGatt, final BluetoothGattDescriptor bluetoothGattDescriptor) {
        t5t.g("AbsGattCallback", new Function0() { // from class: zqs
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return iss.Q(bluetoothGattDescriptor);
            }
        });
        Runnable runnable = new Runnable() { // from class: ars
            @Override // java.lang.Runnable
            public final void run() {
                this.f3397a.v(bluetoothGatt, bluetoothGattDescriptor);
            }
        };
        this.f22062a.lock();
        try {
            try {
                this.j = true;
                this.i.post(runnable);
                while (this.j) {
                    if (!C(bluetoothGatt)) {
                        t5t.d("AbsGattCallback", "synchronizedReadDescriptor NO CONNECTION");
                        break;
                    }
                    this.f22063b.await(30L, TimeUnit.SECONDS);
                    if (this.j) {
                        b0(5);
                        t5t.d("AbsGattCallback", "synchronizedReadDescriptor GATT OPERATION TIMEOUT");
                        break;
                    }
                }
            } catch (InterruptedException e) {
                t5t.d("AbsGattCallback", "InterruptedException:" + e.getMessage());
            }
        } finally {
            this.f22062a.unlock();
        }
        return this.f22064k;
    }

    public final synchronized int I(final BluetoothGatt bluetoothGatt, final BluetoothGattDescriptor bluetoothGattDescriptor, final byte[] bArr) {
        t5t.g("AbsGattCallback", new Function0() { // from class: lrs
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return iss.s(bluetoothGattDescriptor, bArr);
            }
        });
        Runnable runnable = new Runnable() { // from class: mrs
            @Override // java.lang.Runnable
            public final void run() {
                this.f27143a.w(bluetoothGatt, bluetoothGattDescriptor, bArr);
            }
        };
        this.f22062a.lock();
        try {
            try {
                this.j = true;
                this.i.post(runnable);
                while (this.j) {
                    if (!C(bluetoothGatt)) {
                        t5t.d("AbsGattCallback", "synchronizedWriteDescriptor NO CONNECTION");
                        break;
                    }
                    this.f22063b.await(30L, TimeUnit.SECONDS);
                    if (this.j) {
                        b0(5);
                        t5t.d("AbsGattCallback", "synchronizedWriteDescriptor GATT OPERATION TIMEOUT");
                        break;
                    }
                }
            } catch (InterruptedException e) {
                t5t.d("AbsGattCallback", "InterruptedException:" + e.getMessage());
            }
        } finally {
            this.f22062a.unlock();
        }
        return this.f22064k;
    }

    public final /* synthetic */ String J(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        return "NOTIFY: onCharacteristicRead[" + bluetoothGattCharacteristic.getUuid() + "]:" + this.f22064k + ",value:" + tet.x(bluetoothGattCharacteristic.getValue());
    }

    public final /* synthetic */ String L(BluetoothGattDescriptor bluetoothGattDescriptor) {
        return "NOTIFY: onDescriptorWrite[" + bluetoothGattDescriptor.getUuid() + "]:" + this.f22064k;
    }

    public void N(boolean z2) {
        Context context = this.d;
        if (context == null) {
            t5t.d("AbsGattCallback", "enableRefreshGatt failed as context is null!!!");
            return;
        }
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("hm_bluetooth", 0).edit();
        editorEdit.putBoolean("refresh_gatt", z2);
        editorEdit.commit();
    }

    public final int O(BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr) {
        int iG = G(this.o, bluetoothGattCharacteristic, bArr);
        if (iG != 143) {
            return iG;
        }
        t5t.d("AbsGattCallback", "writeCharacteristic " + bluetoothGattCharacteristic.getUuid() + " get GATT_CONNECTION_CONGESTED!!!");
        return 0;
    }

    public final /* synthetic */ String P(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        return "NOTIFY: onCharacteristicWrite[" + bluetoothGattCharacteristic.getUuid() + "]: " + this.f22064k;
    }

    public void S(boolean z2) {
        if (!wbt.f37823a) {
            t5t.d("AbsGattCallback", "not support refreshGatt");
            return;
        }
        try {
            t5t.d("AbsGattCallback", "refreshGatt, wait: " + z2);
            BluetoothGatt.class.getDeclaredMethod("refresh", null).invoke(this.o, null);
            if (z2) {
                Thread.sleep(VibrateModeProgressBar.sLongToLong);
            }
        } catch (Exception e) {
            t5t.d("AbsGattCallback", "refreshGatt exception:" + e.getMessage());
        }
    }

    public final int T(BluetoothGattDescriptor bluetoothGattDescriptor) {
        int iH = H(this.o, bluetoothGattDescriptor);
        if (iH != 143) {
            return iH;
        }
        t5t.d("AbsGattCallback", "readDescriptor " + bluetoothGattDescriptor.getUuid() + " get GATT_CONNECTION_CONGESTED!!!");
        return 0;
    }

    public synchronized void W(boolean z2) {
        this.x = z2;
    }

    public final int X(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        int iF = F(this.o, bluetoothGattCharacteristic);
        t5t.d("AbsGattCallback", "readCharacteristic status: " + iF);
        if (iF != 143) {
            return iF;
        }
        t5t.d("AbsGattCallback", "readCharacteristic " + bluetoothGattCharacteristic.getUuid() + " get GATT_CONNECTION_CONGESTED!!!");
        return 0;
    }

    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public abstract void R(int i);

    /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
    public abstract void M(int i);

    public final boolean a0(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        t5t.d("AbsGattCallback", "unregisterNotification:" + bluetoothGattCharacteristic.getUuid());
        this.f.remove(bluetoothGattCharacteristic);
        boolean z2 = false;
        if (!C(this.o)) {
            t5t.m("AbsGattCallback", "unregisterNotification failed as not connected!");
            return false;
        }
        if (!this.o.setCharacteristicNotification(bluetoothGattCharacteristic, false)) {
            t5t.d("AbsGattCallback", "setCharacteristicNotification: false failed!");
            return false;
        }
        UUID uuid = tet.f34631a;
        BluetoothGattDescriptor descriptor = bluetoothGattCharacteristic.getDescriptor(uuid);
        if (descriptor == null) {
            t5t.d("AbsGattCallback", uuid + " is null!");
            return false;
        }
        int I = I(this.o, descriptor, BluetoothGattDescriptor.DISABLE_NOTIFICATION_VALUE);
        if (I != 143) {
            if (I == 0) {
            }
            t5t.d("AbsGattCallback", "unregisterNotification:" + bluetoothGattCharacteristic.getUuid() + ",ret:" + z2);
            return z2;
        }
        t5t.d("AbsGattCallback", "unregisterNotification " + bluetoothGattCharacteristic.getUuid() + " get GATT_CONNECTION_CONGESTED!!!");
        z2 = true;
        t5t.d("AbsGattCallback", "unregisterNotification:" + bluetoothGattCharacteristic.getUuid() + ",ret:" + z2);
        return z2;
    }

    public final void b0(int i) {
        if (wbt.i) {
            fct.a(i);
        }
    }

    /* JADX INFO: renamed from: c0, reason: merged with bridge method [inline-methods] */
    public abstract void V(int i);

    public final void d0() {
        t5t.d("AbsGattCallback", "m_State: " + this.p);
        this.p = zh.c.DISCONNECTED;
        this.i.removeCallbacksAndMessages(null);
        this.f.clear();
        if (o0()) {
            S(false);
            N(false);
        }
        e0();
    }

    public final void e0() {
        this.f22062a.lock();
        try {
            this.j = false;
            this.f22064k = 65534;
            t5t.d("AbsGattCallback", "RELEASE: c_condGattOperationComplete");
            this.f22063b.signalAll();
            this.f22062a.unlock();
            synchronized (this.c) {
                this.l = false;
                this.m = 0;
                this.n = 65534;
                t5t.d("AbsGattCallback", "RELEASE: c_RSSILock");
                this.c.notifyAll();
            }
            synchronized (this) {
                try {
                    if (this.o != null) {
                        t5t.d("AbsGattCallback", "******Gatt close:<" + Integer.toHexString(this.o.hashCode()) + "," + tet.b(this.o) + ">******");
                        this.o.disconnect();
                        this.o.close();
                        this.o = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            this.f22062a.unlock();
            throw th2;
        }
    }

    public final void f0() {
        this.s.execute(new Runnable() { // from class: ors
            @Override // java.lang.Runnable
            public final void run() {
                this.f29638a.g0();
            }
        });
    }

    public void g0() {
        W(false);
        if (this.p != zh.c.DISCONNECTED) {
            t5t.d("AbsGattCallback", "connectInternal Illegal state: m_State = " + this.p);
        }
        this.p = zh.c.CONNECTING;
        this.i.postDelayed(this.v, 45000L);
        try {
            t5t.d("AbsGattCallback", "Device type before connectGatt:" + tet.t(this.e));
            this.o = this.e.connectGatt(this.d, false, this, 2);
        } catch (Exception e) {
            t5t.d("AbsGattCallback", "connectGatt e: " + e);
        }
        if (this.o != null) {
            fct.a(0);
            t5t.d("AbsGattCallback", "******Gatt create:<" + Integer.toHexString(this.o.hashCode()) + ">******");
            return;
        }
        t5t.d("AbsGattCallback", "connectGatt<" + this.e.getAddress() + "> return null, now disable bluetooth!!!");
        this.i.removeCallbacks(this.v);
        fct.a(4);
    }

    public void h0() {
        synchronized (this.u) {
            try {
                if (this.s.isShutdown()) {
                    t5t.d("AbsGattCallback", "destroy but m_Executor isShutdown");
                } else {
                    this.s.execute(new Runnable() { // from class: jrs
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f23077a.i0();
                        }
                    });
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void i0() {
        t5t.d("AbsGattCallback", "destroyInternal m_Gatt:" + this.o + ",m_State:" + this.p);
        this.p = zh.c.DISCONNECTED;
        a(false);
        e0();
        this.i.removeCallbacksAndMessages(null);
    }

    public final void j0() {
        synchronized (this.u) {
            try {
                if (this.s.isShutdown()) {
                    t5t.d("AbsGattCallback", "disconnect but m_Executor isShutdown");
                } else {
                    this.s.execute(new Runnable() { // from class: grs
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f19282a.k0();
                        }
                    });
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void k0() {
        t5t.d("AbsGattCallback", "disconnectInternal m_Gatt:" + this.o + ",m_State:" + this.p);
        if (!C(this.o)) {
            t5t.d("AbsGattCallback", "return as not connected!");
        } else {
            this.p = zh.c.DISCONNECTING;
            this.o.disconnect();
        }
    }

    public boolean l0() {
        BluetoothGatt bluetoothGatt = this.o;
        return bluetoothGatt != null && bluetoothGatt.discoverServices();
    }

    public final BluetoothDevice m0() {
        return this.e;
    }

    public abstract void n();

    public List<BluetoothGattService> n0() {
        BluetoothGatt bluetoothGatt = this.o;
        if (bluetoothGatt == null) {
            return null;
        }
        return bluetoothGatt.getServices();
    }

    public void o() {
        synchronized (this.u) {
            this.u.set(true);
            this.s.shutdown();
        }
        HandlerThread handlerThread = this.h;
        if (handlerThread != null) {
            handlerThread.quitSafely();
        }
        Handler handler = this.i;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        t5t.d("AbsGattCallback", "shutdown");
    }

    public final boolean o0() {
        Context context = this.d;
        return context != null && context.getSharedPreferences("hm_bluetooth", 0).getBoolean("refresh_gatt", false);
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onCharacteristicChanged(BluetoothGatt bluetoothGatt, final BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        final byte[] value = bluetoothGattCharacteristic.getValue();
        t5t.g("AbsGattCallback", new Function0() { // from class: brs
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return iss.q(bluetoothGattCharacteristic, value);
            }
        });
        final zh.b bVar = this.f.get(bluetoothGattCharacteristic);
        this.s.execute(new Runnable() { // from class: drs
            @Override // java.lang.Runnable
            public final void run() {
                iss.B(bVar, value);
            }
        });
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onCharacteristicRead(BluetoothGatt bluetoothGatt, final BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
        this.f22062a.lock();
        try {
            this.f22064k = i;
            t5t.g("AbsGattCallback", new Function0() { // from class: tqs
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return this.f34950a.J(bluetoothGattCharacteristic);
                }
            });
            this.j = false;
            this.f22063b.signal();
            this.f22062a.unlock();
            if (i != 0) {
                t5t.d("AbsGattCallback", "onCharacteristicRead:" + bluetoothGattCharacteristic.getUuid() + ",status:" + i);
            }
        } catch (Throwable th) {
            this.f22062a.unlock();
            throw th;
        }
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onCharacteristicWrite(BluetoothGatt bluetoothGatt, final BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
        this.f22062a.lock();
        try {
            this.f22064k = i;
            t5t.g("AbsGattCallback", new Function0() { // from class: nrs
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return this.f28305a.P(bluetoothGattCharacteristic);
                }
            });
            this.j = false;
            this.f22063b.signal();
            this.f22062a.unlock();
            if (i != 0) {
                t5t.d("AbsGattCallback", "onCharacteristicWrite:" + bluetoothGattCharacteristic.getUuid() + ",status:" + i);
            }
        } catch (Throwable th) {
            this.f22062a.unlock();
            throw th;
        }
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onConnectionStateChange(BluetoothGatt bluetoothGatt, final int i, int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append("onConnectionStateChange Gatt:");
        Object device = AbstractJsonLexerKt.NULL;
        sb.append(bluetoothGatt != null ? Integer.toHexString(bluetoothGatt.hashCode()) : AbstractJsonLexerKt.NULL);
        sb.append(",device:");
        if (bluetoothGatt != null) {
            device = bluetoothGatt.getDevice();
        }
        sb.append(device);
        sb.append(",status:");
        sb.append(i);
        sb.append(",newState:");
        sb.append(i2);
        t5t.d("AbsGattCallback", sb.toString());
        this.g.set(false);
        this.i.removeCallbacks(this.v);
        if (this.o != bluetoothGatt) {
            t5t.d("AbsGattCallback", "m_Gatt:" + this.o + ",gatt:" + bluetoothGatt);
        }
        int iB = tet.b(this.o);
        if (i != 0) {
            this.p = zh.c.DISCONNECTED;
            t5t.d("AbsGattCallback", "=================================================");
            t5t.d("AbsGattCallback", "=============== CONNECTION FAILED ===============");
            t5t.d("AbsGattCallback", "=================================================");
            t5t.d("AbsGattCallback", "clientIf is " + iB);
            if (iB == 0) {
                fct.a(3);
                return;
            } else {
                this.s.execute(new Runnable() { // from class: krs
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f24241a.R(i);
                    }
                });
                return;
            }
        }
        if (i2 == 0) {
            this.p = zh.c.DISCONNECTED;
            t5t.d("AbsGattCallback", "=================================================");
            t5t.d("AbsGattCallback", "================== DISCONNECTED =================");
            t5t.d("AbsGattCallback", "=================================================");
            this.s.execute(new Runnable() { // from class: crs
                @Override // java.lang.Runnable
                public final void run() {
                    this.f14658a.M(i);
                }
            });
            return;
        }
        if (i2 != 2) {
            t5t.E(">>> UNEXPECTED <<<");
            return;
        }
        if (this.o == null) {
            t5t.d("AbsGattCallback", "try fix error : onConnectionStateChange callback before connectGatt return");
            this.o = bluetoothGatt;
        }
        this.p = zh.c.CONNECTED;
        t5t.d("AbsGattCallback", "=================================================");
        t5t.d("AbsGattCallback", "=================== CONNECTED ===================");
        t5t.d("AbsGattCallback", "=================================================");
        t5t.d("AbsGattCallback", "******Gatt connected:<" + Integer.toHexString(this.o.hashCode()) + "," + iB + ">******");
        this.s.execute(new Runnable() { // from class: rqs
            @Override // java.lang.Runnable
            public final void run() {
                this.f32809a.t0();
            }
        });
        this.i.postDelayed(this.w, 30000L);
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onDescriptorRead(BluetoothGatt bluetoothGatt, final BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
        this.f22062a.lock();
        try {
            this.f22064k = i;
            t5t.g("AbsGattCallback", new Function0() { // from class: hrs
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return this.f20386a.r(bluetoothGattDescriptor);
                }
            });
            this.j = false;
            this.f22063b.signal();
            this.f22062a.unlock();
            if (i != 0) {
                t5t.d("AbsGattCallback", "onDescriptorRead:" + bluetoothGattDescriptor.getUuid() + ",status:" + i);
            }
        } catch (Throwable th) {
            this.f22062a.unlock();
            throw th;
        }
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onDescriptorWrite(BluetoothGatt bluetoothGatt, final BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
        this.f22062a.lock();
        try {
            this.f22064k = i;
            t5t.g("AbsGattCallback", new Function0() { // from class: yqs
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return this.f40440a.L(bluetoothGattDescriptor);
                }
            });
            this.j = false;
            this.f22063b.signal();
            this.f22062a.unlock();
            if (i != 0) {
                t5t.d("AbsGattCallback", "onDescriptorWrite:" + bluetoothGattDescriptor.getUuid() + ",status:" + i);
            }
        } catch (Throwable th) {
            this.f22062a.unlock();
            throw th;
        }
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public void onMtuChanged(BluetoothGatt bluetoothGatt, int i, int i2) {
        synchronized (this.q) {
            t5t.d("AbsGattCallback", "mtu:" + i + ",status:" + i2);
            AtomicInteger atomicInteger = this.q;
            if (i2 != 0) {
                i = 0;
            }
            atomicInteger.getAndSet(i);
            this.q.notify();
        }
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public void onPhyUpdate(BluetoothGatt bluetoothGatt, int i, int i2, int i3) {
        synchronized (this.f22065r) {
            try {
                t5t.d("AbsGattCallback", "onPhyUpdate txPhy:" + i + ",rxPhy:" + i2 + ",status:" + i3);
                this.f22065r.getAndSet(i3 == 0 ? new qhs(i, i2) : new qhs());
                this.f22065r.notify();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onReadRemoteRssi(BluetoothGatt bluetoothGatt, int i, int i2) {
        synchronized (this.c) {
            this.m = i;
            this.n = i2;
            t5t.g("AbsGattCallback", new Function0() { // from class: irs
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return this.f22029a.s0();
                }
            });
            this.l = false;
            this.c.notify();
        }
        if (i2 != 0) {
            t5t.d("AbsGattCallback", "onReadRemoteRssi status:" + i2);
        }
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onReliableWriteCompleted(BluetoothGatt bluetoothGatt, int i) {
        t5t.d("AbsGattCallback", ">>> UNEXPECTED <<<");
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onServicesDiscovered(BluetoothGatt bluetoothGatt, final int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("onServicesDiscovered Gatt:");
        Object device = AbstractJsonLexerKt.NULL;
        sb.append(bluetoothGatt != null ? Integer.toHexString(bluetoothGatt.hashCode()) : AbstractJsonLexerKt.NULL);
        sb.append(",device:");
        if (bluetoothGatt != null) {
            device = bluetoothGatt.getDevice();
        }
        sb.append(device);
        sb.append(",status:");
        sb.append(i);
        t5t.d("AbsGattCallback", sb.toString());
        this.i.removeCallbacks(this.w);
        if (this.g.get()) {
            t5t.d("AbsGattCallback", "onServicesDiscovered call twice,return now!!!");
            return;
        }
        this.g.set(true);
        if (i == 0) {
            this.s.execute(new Runnable() { // from class: rrs
                @Override // java.lang.Runnable
                public final void run() {
                    this.f32839a.n();
                }
            });
        } else {
            this.s.execute(new Runnable() { // from class: sqs
                @Override // java.lang.Runnable
                public final void run() {
                    this.f33896a.V(i);
                }
            });
        }
    }

    public final BluetoothGattService p(UUID uuid) {
        BluetoothGatt bluetoothGatt = this.o;
        if (bluetoothGatt == null) {
            return null;
        }
        return bluetoothGatt.getService(uuid);
    }

    public synchronized boolean p0() {
        return this.x;
    }

    public final /* synthetic */ void q0() {
        this.p = zh.c.DISCONNECTED;
        t5t.d("AbsGattCallback", "=================================================");
        t5t.d("AbsGattCallback", "=============== CONNECT TIMEOUT ===============");
        t5t.d("AbsGattCallback", "=================================================");
        fct.a(1);
    }

    public final /* synthetic */ String r(BluetoothGattDescriptor bluetoothGattDescriptor) {
        return "NOTIFY: onDescriptorRead[" + bluetoothGattDescriptor.getUuid() + "]:" + this.f22064k;
    }

    public final /* synthetic */ String s0() {
        return "NOTIFY: onReadRemoteRssi(): " + this.n;
    }

    public final /* synthetic */ void t(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        if (bluetoothGatt == null) {
            this.f22062a.lock();
            try {
                this.f22064k = 65281;
                this.j = false;
                this.f22063b.signal();
                return;
            } finally {
                this.f22062a.unlock();
            }
        }
        if (bluetoothGatt.readCharacteristic(bluetoothGattCharacteristic)) {
            return;
        }
        t5t.d("AbsGattCallback", "synchronizedReadCharacteristic GATT OPERATION FAILED");
        this.f22062a.lock();
        try {
            this.f22064k = 65282;
            this.j = false;
            this.f22063b.signal();
        } finally {
            this.f22062a.unlock();
        }
    }

    public abstract void t0();

    public final /* synthetic */ void u(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr) {
        if (bluetoothGatt == null) {
            this.f22062a.lock();
            try {
                this.f22064k = 65281;
                this.j = false;
                this.f22063b.signal();
                return;
            } finally {
                this.f22062a.unlock();
            }
        }
        bluetoothGattCharacteristic.setValue(bArr);
        if (bluetoothGatt.writeCharacteristic(bluetoothGattCharacteristic)) {
            return;
        }
        t5t.d("AbsGattCallback", "synchronizedWriteCharacteristic GATT OPERATION FAILED");
        this.f22062a.lock();
        try {
            this.f22064k = 65282;
            this.j = false;
            this.f22063b.signal();
        } finally {
            this.f22062a.unlock();
        }
    }

    public final /* synthetic */ void v(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor) {
        if (bluetoothGatt == null) {
            this.f22062a.lock();
            try {
                this.f22064k = 65281;
                this.j = false;
                this.f22063b.signal();
                return;
            } finally {
                this.f22062a.unlock();
            }
        }
        boolean descriptor = bluetoothGatt.readDescriptor(bluetoothGattDescriptor);
        t5t.j(descriptor);
        if (descriptor) {
            return;
        }
        t5t.d("AbsGattCallback", "synchronizedReadDescriptor GATT OPERATION FAILED");
        this.f22062a.lock();
        try {
            this.f22064k = 65282;
            this.j = false;
            this.f22063b.signal();
        } finally {
            this.f22062a.unlock();
        }
    }

    public final /* synthetic */ void w(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, byte[] bArr) {
        if (bluetoothGatt == null) {
            this.f22062a.lock();
            try {
                this.f22064k = 65281;
                this.j = false;
                this.f22063b.signal();
                return;
            } finally {
                this.f22062a.unlock();
            }
        }
        bluetoothGattDescriptor.setValue(bArr);
        if (bluetoothGatt.writeDescriptor(bluetoothGattDescriptor)) {
            return;
        }
        t5t.d("AbsGattCallback", "synchronizedWriteDescriptor GATT OPERATION FAILED");
        this.f22062a.lock();
        try {
            this.f22064k = 65282;
            this.j = false;
            this.f22063b.signal();
        } finally {
            this.f22062a.unlock();
        }
    }

    public synchronized void x(gr grVar) {
        t6 t6Var = this.t;
        if (t6Var == null) {
            t5t.d("AbsGattCallback", "bridge cannot be null!");
        } else {
            if (this.x) {
                t5t.d("AbsGattCallback", "already scanning!");
                return;
            }
            if (d().booleanValue()) {
                W(true);
                t6Var.a(grVar);
            }
        }
    }
}
