package pj2;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import com.garmin.device.ble.BleCommunicationException;
import com.google.common.base.Predicate;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.ListeningExecutorService;
import com.google.common.util.concurrent.MoreExecutors;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* JADX INFO: loaded from: classes11.dex */
@SuppressLint({"MissingPermission"})
public final class b extends BluetoothGattCallback implements Closeable, k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Logger f138015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f138016b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public BluetoothGattCharacteristic f138020f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public BluetoothGattDescriptor f138021g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public e<Void> f138022h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public e<byte[]> f138023i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public e<Void> f138024j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public e<Void> f138025k;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final BluetoothGattCallback f138028n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ListeningExecutorService f138030p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f138032r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f138033t;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArraySet<d> f138017c = new CopyOnWriteArraySet<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f138018d = new byte[0];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f138019e = new byte[0];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final AtomicInteger f138026l = new AtomicInteger();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final AtomicBoolean f138027m = new AtomicBoolean();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final AtomicReference<BluetoothGatt> f138029o = new AtomicReference<>();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final AtomicInteger f138031q = new AtomicInteger(20);

    public class a implements ThreadFactory {
        public a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, "BleCommunication:" + b.this.f138016b);
            thread.setDaemon(false);
            thread.setPriority(6);
            return thread;
        }
    }

    /* JADX INFO: renamed from: pj2.b$b, reason: collision with other inner class name */
    public class CallableC2617b implements Callable<Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f138035a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ UUID f138036b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ UUID f138037c;

        public CallableC2617b(boolean z14, UUID uuid, UUID uuid2) {
            this.f138035a = z14;
            this.f138036b = uuid;
            this.f138037c = uuid2;
        }

        @Override // java.util.concurrent.Callable
        public final Void call() throws BleCommunicationException {
            byte[] bArr;
            b bVar;
            boolean z14 = this.f138035a;
            String str = z14 ? "enable" : "disable";
            b.this.f138015a.trace("Attempt to {} notification of characteristic [{}] on service [{}], enabled [{}].", str, this.f138036b, this.f138037c, Boolean.valueOf(z14));
            BluetoothGatt bluetoothGatt = b.this.f138029o.get();
            b bVar2 = b.this;
            if (bluetoothGatt == null) {
                bVar2.f138015a.warn("Attempt to set characteristic with no BluetoothGatt.");
                throw new BleCommunicationException("Set characteristic failed", Integer.MIN_VALUE);
            }
            BluetoothGattCharacteristic bluetoothGattCharacteristicB = bVar2.B(bluetoothGatt, this.f138037c, this.f138036b);
            if (bluetoothGattCharacteristicB == null) {
                b.this.f138015a.error("Failed to {} notification; characteristic [{}] does not exist on service [{}].", str, this.f138036b, this.f138037c);
                throw new BleCommunicationException("Set characteristic failed: characteristic does not exist");
            }
            List<BluetoothGattDescriptor> descriptors = bluetoothGattCharacteristicB.getDescriptors();
            if (descriptors == null || descriptors.size() == 0) {
                b.this.f138015a.error("Failed to {} notifications on characteristic [{}] of service [{}]; no descriptors.", str, this.f138036b, this.f138037c);
                throw new BleCommunicationException("Set characteristic failed: no descriptors");
            }
            BluetoothGattDescriptor bluetoothGattDescriptor = descriptors.get(0);
            int properties = bluetoothGattCharacteristicB.getProperties();
            if ((properties & 32) != 0) {
                bArr = this.f138035a ? BluetoothGattDescriptor.ENABLE_INDICATION_VALUE : BluetoothGattDescriptor.DISABLE_NOTIFICATION_VALUE;
            } else {
                if ((properties & 16) == 0) {
                    b.this.f138015a.error("Failed to {} notifications on characteristic [{}] of service [{}]; characteristic does not support notification.", str, this.f138036b, this.f138037c);
                    throw new BleCommunicationException("Set characteristic failed: notification not supported");
                }
                bArr = this.f138035a ? BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE : BluetoothGattDescriptor.DISABLE_NOTIFICATION_VALUE;
            }
            e<Void> eVar = new e<>(b.this.f138015a, "Set characteristic");
            synchronized (b.this.f138019e) {
                try {
                    bVar = b.this;
                    bVar.f138024j = eVar;
                    bVar.f138021g = bluetoothGattDescriptor;
                    if (this.f138035a) {
                        bVar.f138020f = bluetoothGattCharacteristicB;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            try {
                b.x(bVar, new pj2.c(this, bArr, bluetoothGatt), bluetoothGattDescriptor, "Set characteristic");
                Void voidA = eVar.a(30000L, false);
                synchronized (b.this.f138019e) {
                    b bVar3 = b.this;
                    bVar3.f138024j = null;
                    bVar3.f138021g = null;
                    bVar3.f138020f = null;
                }
                return voidA;
            } catch (Throwable th4) {
                synchronized (b.this.f138019e) {
                    b bVar4 = b.this;
                    bVar4.f138024j = null;
                    bVar4.f138021g = null;
                    bVar4.f138020f = null;
                    throw th4;
                }
            }
        }
    }

    public class c implements Callable<byte[]> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ UUID f138039a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ UUID f138040b;

        public c(UUID uuid, UUID uuid2) {
            this.f138039a = uuid;
            this.f138040b = uuid2;
        }

        @Override // java.util.concurrent.Callable
        public final byte[] call() throws BleCommunicationException {
            b bVar;
            BluetoothGatt bluetoothGatt = b.this.f138029o.get();
            b bVar2 = b.this;
            if (bluetoothGatt == null) {
                bVar2.f138015a.warn("Attempt to read characteristic with no BluetoothGatt.");
                throw new BleCommunicationException("Read failed", Integer.MIN_VALUE);
            }
            BluetoothGattCharacteristic bluetoothGattCharacteristicB = bVar2.B(bluetoothGatt, this.f138039a, this.f138040b);
            if (bluetoothGattCharacteristicB == null) {
                throw new BleCommunicationException("Read failed: characteristic does not exist.");
            }
            e<byte[]> eVar = new e<>(b.this.f138015a, "Read");
            synchronized (b.this.f138019e) {
                bVar = b.this;
                bVar.f138023i = eVar;
                bVar.f138020f = bluetoothGattCharacteristicB;
            }
            try {
                b.x(bVar, new pj2.d(this, bluetoothGatt), bluetoothGattCharacteristicB, "Read");
                byte[] bArrA = eVar.a(30000L, false);
                synchronized (b.this.f138019e) {
                    b bVar3 = b.this;
                    bVar3.f138023i = null;
                    bVar3.f138020f = null;
                }
                return bArrA;
            } catch (Throwable th3) {
                synchronized (b.this.f138019e) {
                    b bVar4 = b.this;
                    bVar4.f138023i = null;
                    bVar4.f138020f = null;
                    throw th3;
                }
            }
        }
    }

    public static class d implements l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UUID f138042a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final UUID f138043b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final l f138044c;

        public d(l lVar, UUID uuid, UUID uuid2) {
            this.f138044c = lVar;
            this.f138042a = uuid;
            this.f138043b = uuid2;
        }

        @Override // pj2.l
        public final void a(k kVar, UUID uuid, UUID uuid2, byte[] bArr) {
            if (this.f138042a.equals(uuid) && this.f138043b.equals(uuid2)) {
                this.f138044c.a(kVar, uuid, uuid2, bArr);
            }
        }
    }

    public static class e<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Logger f138045a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f138046b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public BleCommunicationException f138047c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public T f138048d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f138049e;

        public e(Logger logger, String str) {
            this.f138045a = logger;
            this.f138046b = str;
        }

        public final T a(long j8, boolean z14) throws BleCommunicationException {
            try {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                synchronized (this) {
                    while (!this.f138049e) {
                        try {
                            long jElapsedRealtime2 = j8 - (SystemClock.elapsedRealtime() - jElapsedRealtime);
                            if (jElapsedRealtime2 <= 0) {
                                break;
                            }
                            wait(jElapsedRealtime2);
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    if (this.f138049e) {
                        BleCommunicationException bleCommunicationException = this.f138047c;
                        if (bleCommunicationException != null) {
                            throw bleCommunicationException;
                        }
                        return this.f138048d;
                    }
                    String str = this.f138046b + " timed out after " + j8 + " ms";
                    if (!z14) {
                        throw new BleCommunicationException(str, BleCommunicationException.COMMUNICATION_TIMEOUT);
                    }
                    this.f138045a.warn(str);
                    return null;
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                throw new BleCommunicationException(am.j.o(this.f138046b, " failed: interrupted", new StringBuilder()));
            }
        }

        public final void b(T t7) {
            synchronized (this) {
                try {
                    if (this.f138049e) {
                        return;
                    }
                    this.f138048d = t7;
                    this.f138049e = true;
                    notifyAll();
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }

        public final void c(BleCommunicationException bleCommunicationException) {
            synchronized (this) {
                try {
                    if (this.f138049e) {
                        return;
                    }
                    this.f138049e = true;
                    this.f138047c = bleCommunicationException;
                    notifyAll();
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    public b(String str, BluetoothGattCallback bluetoothGattCallback) {
        if (TextUtils.isEmpty(str)) {
            vb.h.s("macAddress is empty");
            throw null;
        }
        if (bluetoothGattCallback == null) {
            vb.h.s("connectionCallback is null");
            throw null;
        }
        this.f138015a = LoggerFactory.getLogger(pj2.a.a("BleCommunication", str, this));
        this.f138016b = str;
        this.f138028n = bluetoothGattCallback;
        this.f138030p = MoreExecutors.listeningDecorator(Executors.newSingleThreadExecutor(new a()));
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004a  */
    /* JADX WARN: Code duplicated, block: B:23:0x0050 A[Catch: all -> 0x005b, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x005b, blocks: (B:19:0x0044, B:23:0x0050, B:25:0x0057, B:30:0x005e, B:31:0x0079, B:32:0x007a, B:33:0x0095), top: B:42:0x0044, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x002d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x007a A[SYNTHETIC] */
    public static void x(b bVar, Predicate predicate, Parcelable parcelable, String str) throws BleCommunicationException {
        long j8;
        int i14;
        Logger logger;
        bVar.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime() - bVar.f138032r;
        if (jElapsedRealtime > 0) {
            bVar.f138033t = 0L;
        }
        long j14 = bVar.f138033t;
        bVar.f138033t = 1 + j14;
        if (j14 < 100) {
            if (jElapsedRealtime < 0) {
                j8 = 0 - jElapsedRealtime;
            }
            if (j8 > 0) {
                try {
                    Thread.sleep(j8);
                } catch (InterruptedException e4) {
                    Thread.currentThread().interrupt();
                    throw new BleCommunicationException(str.concat(" failed: retry interrupted"), e4);
                }
            }
            i14 = 5;
            while (!predicate.apply(parcelable)) {
                try {
                    i14--;
                    logger = bVar.f138015a;
                    if (i14 > 0) {
                        logger.error("Retry of {} failed. Abort.", str);
                        throw new BleCommunicationException(str + " failed: gatt.writeCharacteristic() failed");
                    }
                    logger.warn("{} failed, retrying.", str);
                    try {
                        Thread.sleep(50L);
                    } catch (InterruptedException e14) {
                        Thread.currentThread().interrupt();
                        throw new BleCommunicationException(str + " failed: retry interrupted", e14);
                    }
                } catch (Throwable th3) {
                    bVar.f138032r = SystemClock.elapsedRealtime();
                    throw th3;
                }
            }
            bVar.f138032r = SystemClock.elapsedRealtime();
        }
        bVar.f138033t = 0L;
        j8 = 0;
        if (j8 > 0) {
            Thread.sleep(j8);
        }
        i14 = 5;
        while (!predicate.apply(parcelable)) {
            i14--;
            logger = bVar.f138015a;
            if (i14 > 0) {
                logger.error("Retry of {} failed. Abort.", str);
                throw new BleCommunicationException(str + " failed: gatt.writeCharacteristic() failed");
            }
            logger.warn("{} failed, retrying.", str);
            Thread.sleep(50L);
        }
        bVar.f138032r = SystemClock.elapsedRealtime();
    }

    public final BluetoothGattCharacteristic B(BluetoothGatt bluetoothGatt, UUID uuid, UUID uuid2) {
        try {
            BluetoothGattService service = bluetoothGatt.getService(uuid);
            Logger logger = this.f138015a;
            if (service == null) {
                logger.error("Cannot access characteristic [{}]; service [{}] does not exist.", uuid2, uuid);
                return null;
            }
            BluetoothGattCharacteristic characteristic = service.getCharacteristic(uuid2);
            if (characteristic != null) {
                return characteristic;
            }
            logger.error("Characteristic [{}] does not exist on service [{}].", uuid2, uuid);
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public final <T> ListenableFuture<T> C(Callable<T> callable) {
        try {
            if (this.f138027m.get()) {
                synchronized (this.f138030p) {
                    try {
                        if (!this.f138030p.isShutdown()) {
                            return this.f138030p.submit((Callable) callable);
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            }
        } catch (RejectedExecutionException e4) {
            this.f138015a.error("Call submitted after device disconnected", (Throwable) e4);
        }
        return Futures.immediateFailedFuture(new BleCommunicationException("Operation failed", Integer.MIN_VALUE));
    }

    @Override // pj2.k
    public final void a(l lVar, UUID uuid, UUID uuid2) {
        if (uuid == null) {
            vb.h.s("service is null");
            return;
        }
        if (uuid2 == null) {
            vb.h.s("characteristic is null");
            return;
        }
        if (lVar == null) {
            vb.h.s("callback is null");
            return;
        }
        BluetoothGatt bluetoothGatt = this.f138029o.get();
        if (bluetoothGatt == null) {
            this.f138015a.warn("Cannot add characteristic listeners.  Device is not connected");
            return;
        }
        BluetoothGattCharacteristic bluetoothGattCharacteristicB = B(bluetoothGatt, uuid, uuid2);
        if (bluetoothGattCharacteristicB == null) {
            return;
        }
        synchronized (this.f138018d) {
            bluetoothGatt.setCharacteristicNotification(bluetoothGattCharacteristicB, true);
            this.f138017c.add(new d(lVar, uuid, uuid2));
        }
    }

    @Override // pj2.k
    public final ListenableFuture<Void> c(UUID uuid, UUID uuid2, byte[] bArr) {
        if (uuid == null) {
            vb.h.s("serviceUuid is null");
            return null;
        }
        if (uuid2 != null) {
            return C(new f(this, uuid, uuid2, 2, bArr));
        }
        vb.h.s("characteristicUuid is null");
        return null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        z();
        BluetoothGatt andSet = this.f138029o.getAndSet(null);
        if (andSet == null) {
            return;
        }
        try {
            andSet.close();
        } catch (Exception e4) {
            this.f138015a.warn("Suppressing NPE in BT stack.", (Throwable) e4);
        }
    }

    @Override // pj2.k
    public final void e(l lVar, UUID uuid, UUID uuid2) {
        if (lVar == null) {
            vb.h.s("callback is null");
            return;
        }
        if (uuid == null) {
            vb.h.s("service is null");
            return;
        }
        if (uuid2 == null) {
            vb.h.s("characteristic is null");
            return;
        }
        ArrayList arrayList = new ArrayList();
        synchronized (this.f138018d) {
            try {
                boolean z14 = false;
                for (d dVar : this.f138017c) {
                    if (dVar.f138042a.equals(uuid) && dVar.f138043b.equals(uuid2)) {
                        if (dVar.f138044c.equals(lVar)) {
                            arrayList.add(dVar);
                        } else {
                            z14 = true;
                        }
                    }
                }
                this.f138017c.removeAll(arrayList);
                if (!z14) {
                    BluetoothGatt bluetoothGatt = this.f138029o.get();
                    if (bluetoothGatt == null) {
                        return;
                    }
                    BluetoothGattCharacteristic bluetoothGattCharacteristicB = B(bluetoothGatt, uuid, uuid2);
                    if (bluetoothGattCharacteristicB != null) {
                        try {
                            bluetoothGatt.setCharacteristicNotification(bluetoothGattCharacteristicB, false);
                        } catch (Throwable th3) {
                            this.f138015a.error("removeCharacteristicChangedCallback failed", th3);
                        }
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    @Override // pj2.k
    public final qj2.b f(UUID uuid, UUID uuid2) {
        return new qj2.b(this, uuid, uuid2);
    }

    @Override // pj2.k
    public final String getMacAddress() {
        return this.f138016b;
    }

    @Override // pj2.k
    public final String getName() {
        BluetoothGatt bluetoothGatt = this.f138029o.get();
        return bluetoothGatt == null ? "" : bluetoothGatt.getDevice().getName();
    }

    @Override // pj2.k
    public final ListenableFuture<Void> j(UUID uuid, UUID uuid2, byte[] bArr) {
        if (uuid == null) {
            vb.h.s("serviceUuid is null");
            return null;
        }
        if (uuid2 != null) {
            return C(new f(this, uuid, uuid2, 1, bArr));
        }
        vb.h.s("characteristicUuid is null");
        return null;
    }

    @Override // pj2.k
    public final qj2.a k(UUID uuid, UUID uuid2) {
        return new qj2.a(this, uuid, uuid2);
    }

    @Override // pj2.k
    public final int l() {
        return this.f138031q.get();
    }

    @Override // pj2.k
    public final List<UUID> n(UUID uuid) {
        if (uuid == null) {
            return Collections.EMPTY_LIST;
        }
        BluetoothGatt bluetoothGatt = this.f138029o.get();
        Logger logger = this.f138015a;
        if (bluetoothGatt == null) {
            logger.warn("Cannot get characteristics for service [{}]; device is not available", uuid);
            return Collections.EMPTY_LIST;
        }
        BluetoothGattService service = bluetoothGatt.getService(uuid);
        if (service == null) {
            logger.warn("Cannot get characteristics for service [{}]; service does not exist", uuid);
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<BluetoothGattCharacteristic> it = service.getCharacteristics().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getUuid());
        }
        return arrayList;
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onCharacteristicChanged(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        BluetoothGattCharacteristic bluetoothGattCharacteristic2;
        byte[] bArr = (byte[]) bluetoothGattCharacteristic.getValue().clone();
        UUID uuid = bluetoothGattCharacteristic.getService().getUuid();
        UUID uuid2 = bluetoothGattCharacteristic.getUuid();
        Iterator<d> it = this.f138017c.iterator();
        while (it.hasNext()) {
            try {
                it.next().a(this, uuid, uuid2, bArr);
            } catch (Exception e4) {
                this.f138015a.warn("Unexpected exception thrown by listener", (Throwable) e4);
            }
        }
        synchronized (this.f138019e) {
            e<Void> eVar = this.f138024j;
            if (eVar != null && (bluetoothGattCharacteristic2 = this.f138020f) != null) {
                if (bluetoothGattCharacteristic.equals(bluetoothGattCharacteristic2)) {
                    eVar.b(null);
                }
            }
        }
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onCharacteristicRead(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i14) {
        BluetoothGattCharacteristic bluetoothGattCharacteristic2;
        synchronized (this.f138019e) {
            e<byte[]> eVar = this.f138023i;
            if (eVar != null && (bluetoothGattCharacteristic2 = this.f138020f) != null) {
                if (bluetoothGattCharacteristic2.equals(bluetoothGattCharacteristic)) {
                    if (i14 == 0) {
                        eVar.b((byte[]) bluetoothGattCharacteristic.getValue().clone());
                    } else {
                        eVar.c(new BleCommunicationException("Read failed", i14));
                    }
                }
            }
        }
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onCharacteristicWrite(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i14) {
        BluetoothGattCharacteristic bluetoothGattCharacteristic2;
        synchronized (this.f138019e) {
            e<Void> eVar = this.f138022h;
            if (eVar != null && (bluetoothGattCharacteristic2 = this.f138020f) != null) {
                if (bluetoothGattCharacteristic.equals(bluetoothGattCharacteristic2)) {
                    if (i14 == 0) {
                        eVar.b(null);
                    } else {
                        eVar.c(new BleCommunicationException("Write failed", i14));
                    }
                }
            }
        }
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onConnectionStateChange(BluetoothGatt bluetoothGatt, int i14, int i15) {
        this.f138028n.onConnectionStateChange(bluetoothGatt, i14, i15);
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onDescriptorWrite(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i14) {
        BluetoothGattDescriptor bluetoothGattDescriptor2;
        synchronized (this.f138019e) {
            e<Void> eVar = this.f138024j;
            if (eVar != null && (bluetoothGattDescriptor2 = this.f138021g) != null) {
                if (bluetoothGattDescriptor.equals(bluetoothGattDescriptor2)) {
                    if (i14 == 0) {
                        eVar.b(null);
                    } else {
                        eVar.c(new BleCommunicationException("Set characteristic failed", i14));
                    }
                }
            }
        }
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onMtuChanged(BluetoothGatt bluetoothGatt, int i14, int i15) {
        synchronized (this.f138019e) {
            try {
                e<Void> eVar = this.f138025k;
                if (eVar == null) {
                    if (j.e() && i14 > 0) {
                        Logger logger = this.f138015a;
                        StringBuilder sb3 = new StringBuilder("unexpected onMtuChange: status=");
                        sb3.append(i15);
                        sb3.append("; mtu=");
                        int i16 = i14 - 3;
                        sb3.append(i16);
                        logger.warn(sb3.toString());
                        this.f138031q.set(i16);
                        e<Void> eVar2 = new e<>(this.f138015a, "RequestMtu");
                        this.f138025k = eVar2;
                        eVar2.b(null);
                    }
                    return;
                }
                if ((i15 != 0 && !j.e()) || i14 <= 0) {
                    this.f138015a.warn("invalid onMtuChange: status=" + i15 + "; mtu=" + i14);
                    eVar.c(new BleCommunicationException("Request MTU failed", i15));
                    return;
                }
                Logger logger2 = this.f138015a;
                if (i15 == 0) {
                    StringBuilder sb4 = new StringBuilder("onMtuChange: max write length to ");
                    sb4.append(i14 - 3);
                    sb4.append(" bytes");
                    logger2.debug(sb4.toString());
                } else {
                    StringBuilder sb5 = new StringBuilder("onMtuChange: max write length to ");
                    sb5.append(i14 - 3);
                    sb5.append(" bytes; invalid status=");
                    sb5.append(i15);
                    logger2.warn(sb5.toString());
                }
                this.f138031q.set(i14 - 3);
                eVar.b(null);
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onReadRemoteRssi(BluetoothGatt bluetoothGatt, int i14, int i15) {
        throw null;
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onServicesDiscovered(BluetoothGatt bluetoothGatt, int i14) {
        this.f138028n.onServicesDiscovered(bluetoothGatt, i14);
    }

    @Override // pj2.k
    public final List<UUID> p() {
        BluetoothGatt bluetoothGatt = this.f138029o.get();
        List<BluetoothGattService> services = bluetoothGatt == null ? Collections.EMPTY_LIST : bluetoothGatt.getServices();
        ArrayList arrayList = new ArrayList();
        Iterator<BluetoothGattService> it = services.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getUuid());
        }
        return arrayList;
    }

    @Override // pj2.k
    public final ListenableFuture<Void> s(UUID uuid, UUID uuid2, boolean z14) {
        if (uuid == null) {
            vb.h.s("service is null");
            return null;
        }
        if (uuid2 != null) {
            return C(new CallableC2617b(z14, uuid2, uuid));
        }
        vb.h.s("characteristic is null");
        return null;
    }

    @Override // pj2.k
    public final ListenableFuture<byte[]> v(UUID uuid, UUID uuid2) {
        if (uuid == null) {
            vb.h.s("serviceUuid is null");
            return null;
        }
        if (uuid2 != null) {
            return C(new c(uuid, uuid2));
        }
        vb.h.s("characteristicUuid is null");
        return null;
    }

    @Override // pj2.k
    public final void w(l lVar) {
        if (lVar == null) {
            vb.h.s("callback is null");
            return;
        }
        for (d dVar : this.f138017c) {
            if (dVar.f138044c.equals(lVar)) {
                e(lVar, dVar.f138042a, dVar.f138043b);
            }
        }
    }

    public final void z() {
        this.f138027m.set(false);
        this.f138017c.clear();
        synchronized (this.f138019e) {
            try {
                this.f138020f = null;
                this.f138021g = null;
                e<byte[]> eVar = this.f138023i;
                if (eVar != null) {
                    eVar.c(new BleCommunicationException("Read failed: connection closed.", Integer.MIN_VALUE));
                    this.f138023i = null;
                }
                e<Void> eVar2 = this.f138022h;
                if (eVar2 != null) {
                    eVar2.c(new BleCommunicationException("Write failed: connection closed.", Integer.MIN_VALUE));
                    this.f138022h = null;
                }
                e<Void> eVar3 = this.f138024j;
                if (eVar3 != null) {
                    eVar3.c(new BleCommunicationException("Set characteristic failed: connection closed.", Integer.MIN_VALUE));
                    this.f138024j = null;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        synchronized (this.f138030p) {
            this.f138030p.shutdownNow();
        }
    }
}
