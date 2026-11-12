package jk2;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import ch.qos.logback.classic.Logger;
import gt2.c;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import vb.h;

/* JADX INFO: loaded from: classes11.dex */
public final class a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Logger f99425k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f99426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jk2.b f99427b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public BluetoothAdapter f99428c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f99431f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ConcurrentHashMap f99429d = new ConcurrentHashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f99430e = new AtomicBoolean();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f99432g = new AtomicBoolean(false);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f99433h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C1910a f99434i = new C1910a();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final b f99435j = new b();

    /* JADX INFO: renamed from: jk2.a$a, reason: collision with other inner class name */
    public class C1910a extends BroadcastReceiver {
        public C1910a() {
        }

        @Override // android.content.BroadcastReceiver
        @SuppressLint({"MissingPermission"})
        public final void onReceive(Context context, Intent intent) {
            BluetoothDevice bluetoothDevice;
            String action = intent.getAction();
            if ("android.bluetooth.adapter.action.DISCOVERY_STARTED".equals(action)) {
                a.f99425k.debug("ACTION_DISCOVERY_STARTED");
                return;
            }
            boolean zEquals = "android.bluetooth.adapter.action.DISCOVERY_FINISHED".equals(action);
            a aVar = a.this;
            if (zEquals) {
                Logger logger = a.f99425k;
                logger.debug("ACTION_DISCOVERY_FINISHED");
                if (!aVar.f99430e.get()) {
                    logger.warn("Premature stop!");
                    BluetoothAdapter bluetoothAdapter = aVar.f99428c;
                    if (bluetoothAdapter == null || !bluetoothAdapter.isEnabled()) {
                        return;
                    }
                    logger.debug("Restarting device discovery");
                    aVar.f99428c.startDiscovery();
                    return;
                }
                logger.debug("Notifying listeners... pass=" + aVar.f99431f);
                logger.debug("foundDevices=" + aVar.f99429d.values());
                int i14 = aVar.f99431f + 1;
                aVar.f99431f = i14;
                if (i14 < 5) {
                    aVar.b((i14 * 1000) + 3055);
                    return;
                } else {
                    aVar.c(context);
                    return;
                }
            }
            if (!"android.bluetooth.device.action.FOUND".equals(action) || (bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE")) == null) {
                return;
            }
            if ((bluetoothDevice.getType() != 1 && bluetoothDevice.getType() != 3) || TextUtils.isEmpty(bluetoothDevice.getAddress()) || TextUtils.isEmpty(bluetoothDevice.getName())) {
                a.f99425k.trace("ACTION_FOUND " + bluetoothDevice);
                return;
            }
            if (aVar.f99429d.containsKey(bluetoothDevice.getAddress())) {
                a.f99425k.debug("ACTION_FOUND " + bluetoothDevice + " (DUPLICATE)");
                return;
            }
            aVar.f99429d.put(bluetoothDevice.getAddress(), bluetoothDevice);
            a.f99425k.debug("ACTION_FOUND " + bluetoothDevice + " (ADDED)");
            jk2.b bVar = aVar.f99427b;
            if (bVar != null) {
                bVar.a(bluetoothDevice);
            }
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Logger logger = a.f99425k;
            a.this.a();
        }
    }

    static {
        int i14 = c.f79010a;
        f99425k = gt2.b.f79005a.i("BluetoothClassicScanner");
    }

    public a(jk2.b bVar) {
        if (bVar == null) {
            h.s("scanCallback is NULL");
            throw null;
        }
        this.f99426a = new Handler(Looper.getMainLooper());
        this.f99427b = bVar;
    }

    @SuppressLint({"MissingPermission"})
    public final void a() {
        BluetoothAdapter bluetoothAdapter = this.f99428c;
        if (bluetoothAdapter != null && bluetoothAdapter.isDiscovering()) {
            f99425k.debug("Cancelling device scanning");
            this.f99430e.set(true);
            this.f99428c.cancelDiscovery();
        }
        this.f99426a.removeCallbacks(this.f99435j);
        this.f99432g.set(false);
    }

    @SuppressLint({"MissingPermission"})
    public final void b(long j8) {
        BluetoothAdapter bluetoothAdapter = this.f99428c;
        jk2.b bVar = this.f99427b;
        Logger logger = f99425k;
        if (bluetoothAdapter == null) {
            logger.error("Bluetooth adapter is NULL");
            if (bVar != null) {
                bVar.b(5);
                return;
            }
            return;
        }
        if (!bluetoothAdapter.isEnabled()) {
            logger.error("Bluetooth adapter is disabled");
            if (bVar != null) {
                bVar.b(6);
                return;
            }
            return;
        }
        this.f99432g.set(true);
        if (j8 < 0) {
            j8 = 5555;
        }
        logger.debug("Device scanning starts at " + System.currentTimeMillis());
        this.f99430e.set(false);
        this.f99428c.startDiscovery();
        this.f99426a.postDelayed(this.f99435j, j8);
    }

    public final void c(Context context) {
        try {
            boolean zCompareAndSet = this.f99432g.compareAndSet(true, false);
            Logger logger = f99425k;
            if (zCompareAndSet) {
                logger.debug("Stopping device discovery");
            }
            if (context == null) {
                throw new IllegalArgumentException("Context is NULL");
            }
            if (this.f99433h) {
                context.unregisterReceiver(this.f99434i);
                this.f99433h = false;
            }
            a();
            jk2.b bVar = this.f99427b;
            if (bVar != null && zCompareAndSet) {
                bVar.c();
            }
            if (zCompareAndSet) {
                logger.debug("***** FINISH DEVICE SCANNING *****");
            }
        } catch (Exception unused) {
        }
    }
}
