package la2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.garmin.android.gfdi.AuthRegistry;
import com.garmin.device.datatypes.DeviceProfile;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Timer;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import ma2.a.d;
import ma2.l;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p006l2.v0;
import pj2.v;
import v.e0;

/* JADX INFO: loaded from: classes7.dex */
public class e implements j {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final da2.b f111646e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f f111647f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Logger f111648g;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final b f111652k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Handler f111653l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Context f111654m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ma2.a f111655n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final na2.d f111656o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f111657p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f111658q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final da2.e f111659r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f111642a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f111643b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ConcurrentHashMap f111644c = new ConcurrentHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ConcurrentHashMap f111645d = new ConcurrentHashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final CopyOnWriteArraySet<la2.a> f111649h = new CopyOnWriteArraySet<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Handler f111650i = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final a f111651j = new a();

    public class a implements g {
        public a() {
        }

        @Override // la2.g
        public final void b(String str) {
            e.this.f111642a.remove(str);
            da2.h.d(str);
        }

        @Override // la2.g
        public final void d(String str, i iVar, String str2) {
            boolean zIsEmpty = TextUtils.isEmpty(str);
            e eVar = e.this;
            if (!zIsEmpty && !((Set) eVar.f111642a.computeIfAbsent(str, new com.google.android.material.color.utilities.f(3))).add(iVar)) {
                eVar.f111648g.debug("onDeviceConnectionFailed: duplicate notification suppressed for " + str + ", " + iVar);
                return;
            }
            if (iVar == i.BLE_NO_SERVICE_SUBSCRIBER) {
                String strM = am.j.m("previously authenticated device ", str, " currently presents no compatible services");
                if (TextUtils.isEmpty(str2)) {
                    str2 = strM;
                } else {
                    eVar.f111648g.warn(strM);
                }
            }
            if (iVar != i.BLE_CONNECT_GATT_TIMEOUT) {
                StringBuilder sb3 = new StringBuilder("\n******* HANDSHAKE FAILED [");
                sb3.append(str);
                sb3.append("] *******\n** connection failed ");
                sb3.append(iVar);
                if (!TextUtils.isEmpty(str2)) {
                    sb3.append(" : ");
                    sb3.append(str2);
                }
                sb3.append("\n*******\n");
                eVar.f111648g.info(sb3.toString());
            }
            Iterator<la2.a> it = eVar.f111649h.iterator();
            while (it.hasNext()) {
                try {
                    it.next().onDeviceConnectingFailure(new la2.c(str, iVar));
                } catch (Exception e4) {
                    eVar.f111648g.error("onDeviceConnectingFailure callback failed: " + str, (Throwable) e4);
                }
            }
        }

        @Override // la2.g
        public final void e(String str, int i14, ma2.i iVar) {
            a aVar = this;
            String str2 = str;
            da2.h.e(str2);
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            e eVar = e.this;
            ConcurrentHashMap concurrentHashMap = eVar.f111643b;
            ConcurrentHashMap concurrentHashMap2 = eVar.f111644c;
            Handler handler = eVar.f111650i;
            CopyOnWriteArraySet<la2.a> copyOnWriteArraySet = eVar.f111649h;
            da2.b bVar = eVar.f111646e;
            Logger logger = eVar.f111648g;
            DeviceProfile deviceProfile = (DeviceProfile) concurrentHashMap.get(str2);
            if (deviceProfile != null) {
                long f172494b = deviceProfile.getF92746j();
                StringBuilder sb3 = new StringBuilder("\n******* DEVICE DISCONNECTED");
                if (iVar != null && iVar != ma2.i.PERSISTENT) {
                    sb3.append(": ");
                    sb3.append(iVar);
                }
                sb3.append("*******\n");
                if (i14 == Integer.MIN_VALUE) {
                    sb3.append("** app called disconnect() [");
                } else {
                    sb3.append("** remote device disconnected, GattStatus(");
                    sb3.append(i14);
                    sb3.append(") [");
                }
                sb3.append(e.a(e.this, str2, f172494b, deviceProfile.getDeviceFullName(), deviceProfile.getConnectionType()));
                sb3.append("]\n*******\n");
                logger.info(sb3.toString());
                bVar.h(str2);
                eVar.f111643b.remove(str2);
                Long l14 = (Long) eVar.f111645d.remove(str2);
                Long lValueOf = l14 == null ? null : Long.valueOf(System.currentTimeMillis() - l14.longValue());
                Iterator<la2.a> it = copyOnWriteArraySet.iterator();
                while (it.hasNext()) {
                    String str3 = str2;
                    str2 = str3;
                    handler.post(new la2.d(aVar, it.next(), i14, deviceProfile, lValueOf, str3, 0));
                    aVar = this;
                }
            } else {
                if (!concurrentHashMap2.containsKey(str2)) {
                    String strF = e0.f(i14, "GattStatus(", ")");
                    if (iVar != null) {
                        strF = strF + StringUtils.SPACE + iVar;
                    }
                    d(str2, i.GFDI_PREMATURE_DISCONNECT, strF);
                    return;
                }
                DeviceProfile deviceProfile2 = (DeviceProfile) concurrentHashMap2.get(str2);
                if (deviceProfile2 != null) {
                    bVar.h(str2);
                    Iterator<la2.a> it3 = copyOnWriteArraySet.iterator();
                    while (it3.hasNext()) {
                        DeviceProfile deviceProfile3 = deviceProfile2;
                        hc0.a aVar2 = new hc0.a(this, it3.next(), deviceProfile3, i14, str);
                        str2 = str;
                        handler.post(aVar2);
                        deviceProfile2 = deviceProfile3;
                    }
                    DeviceProfile deviceProfile4 = deviceProfile2;
                    StringBuilder sbL = hb.a.l("\n******* PROBE CONNECTION CLOSED [", str2, "] *******");
                    sbL.append(e.a(e.this, str, deviceProfile4.getF92746j(), deviceProfile4.getDeviceFullName(), deviceProfile4.getConnectionType()));
                    sbL.append("]\n*******\n");
                    logger.info(sbL.toString());
                }
            }
        }
    }

    public class b implements da2.h.b {
        public b() {
        }

        @Override // da2.h.b
        public final void a(String str) {
            StringBuilder sbL = hb.a.l("\n*****************************************************\n** handshake TIMED OUT [", str, "]\n*****************************************************\n");
            e eVar = e.this;
            eVar.f111648g.info(sbL.toString());
            eVar.k(str);
            Iterator<la2.a> it = eVar.f111649h.iterator();
            while (it.hasNext()) {
                try {
                    it.next().onDeviceConnectingFailure(new la2.c(str, i.HANDSHAKE_TIMEOUT));
                } catch (Exception e4) {
                    eVar.f111648g.error("onDeviceConnectingTimeout callback failed: " + str, (Throwable) e4);
                }
            }
        }

        @Override // da2.h.b
        public final void c(DeviceProfile deviceProfile) {
            String macAddress = deviceProfile.getMacAddress();
            String f172496d = deviceProfile.getF92742f();
            long f172494b = deviceProfile.getF92746j();
            int connectionType = deviceProfile.getConnectionType();
            StringBuilder sbL = hb.a.l("\n******* HANDSHAKE COMPLETE [", macAddress, "] *******\n");
            if (connectionType != 2 || deviceProfile.getDualPairingMacAddress() == null) {
                sbL.append("** [");
                sbL.append(e.a(e.this, macAddress, f172494b, f172496d, connectionType));
            } else {
                sbL.append("** with SECONDARY (BTC) [");
                sbL.append(macAddress);
                sbL.append("], BLE [");
                sbL.append(deviceProfile.getDualPairingMacAddress());
            }
            sbL.append("]\n*******\n");
            e eVar = e.this;
            eVar.f111648g.info(sbL.toString());
            AuthRegistry.getInstance().setOutOfBandPasskey(macAddress, null);
            eVar.f111643b.put(macAddress, deviceProfile);
            eVar.f111645d.put(macAddress, Long.valueOf(System.currentTimeMillis()));
            Iterator<la2.a> it = eVar.f111649h.iterator();
            while (it.hasNext()) {
                try {
                    it.next().onDeviceConnected(new la2.b(deviceProfile));
                } catch (Exception e4) {
                    eVar.f111648g.error("onDeviceConnected callback failed: " + deviceProfile.getMacAddress(), (Throwable) e4);
                }
            }
        }

        @Override // da2.h.b
        public final void f(String str, String str2) {
            StringBuilder sbI = p6.b.i("\n******* HANDSHAKE FAILED [", str, "] *******\n** ", str2, "\n*******\n");
            e eVar = e.this;
            eVar.f111648g.info(sbI.toString());
            eVar.k(str);
            Iterator<la2.a> it = eVar.f111649h.iterator();
            while (it.hasNext()) {
                try {
                    it.next().onDeviceConnectingFailure(new la2.c(str, i.HANDSHAKE_FAILURE));
                } catch (Exception e4) {
                    eVar.f111648g.error("onDeviceConnectingFailure callback failed: " + str, (Throwable) e4);
                }
            }
        }
    }

    public class c implements ma2.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f111662a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ma2.j f111663b;

        public c(String str, ma2.j jVar) {
            this.f111662a = str;
            this.f111663b = jVar;
        }

        @Override // ma2.k
        public final void a(String str, v0 v0Var) {
            try {
                ma2.j jVar = this.f111663b;
                if (jVar instanceof ma2.k) {
                    ((ma2.k) jVar).a(str, v0Var);
                } else {
                    v0Var.invoke();
                }
            } catch (Throwable unused) {
                v0Var.invoke();
            }
        }

        @Override // ma2.k
        public final boolean b(DeviceProfile deviceProfile) {
            ma2.j jVar = this.f111663b;
            if (jVar instanceof ma2.k) {
                return ((ma2.k) jVar).b(deviceProfile);
            }
            return false;
        }

        @Override // ma2.j
        public final void c(i iVar) {
            this.f111663b.c(iVar);
        }

        @Override // ma2.j
        public final void d(DeviceProfile deviceProfile) {
            e eVar = e.this;
            eVar.f111644c.put(this.f111662a, deviceProfile);
            eVar.f111650i.post(new fh2.a(this, 14, this.f111663b, deviceProfile));
        }

        @Override // ma2.j
        public final void e() {
            f fVar = e.this.f111647f;
            String str = this.f111662a;
            synchronized (fVar.f111672c) {
                if (fVar.f111672c.add(str)) {
                    fVar.f111670a.getSharedPreferences("com.garmin.android.deviceinterface.prefs", 0).edit().putStringSet(fVar.f111671b, fVar.f111672c).apply();
                }
            }
            this.f111663b.e();
        }
    }

    public static /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f111665a;

        static {
            int[] iArr = new int[i.values().length];
            f111665a = iArr;
            try {
                iArr[i.BLE_CONNECTION_TIMEOUT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f111665a[i.BLE_CONNECT_GATT_TIMEOUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f111665a[i.BLE_NULL_GATT_HANDLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f111665a[i.BLE_CHARACTERISTIC_EXCEPTION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f111665a[i.BLE_TOO_MANY_RECONNECTING_FAILURES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: renamed from: la2.e$e, reason: collision with other inner class name */
    public class C2139e extends BroadcastReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AtomicBoolean f111666a;

        /* JADX INFO: renamed from: la2.e$e$a */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                e.this.n();
            }
        }

        /* JADX INFO: renamed from: la2.e$e$b */
        public class b implements Runnable {
            public b() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                e.this.l();
            }
        }

        public C2139e(boolean z14) {
            AtomicBoolean atomicBoolean = new AtomicBoolean();
            this.f111666a = atomicBoolean;
            atomicBoolean.set(z14);
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if ("android.bluetooth.adapter.action.STATE_CHANGED".equals(intent.getAction())) {
                int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", -1);
                AtomicBoolean atomicBoolean = this.f111666a;
                e eVar = e.this;
                if (intExtra == 10 || intExtra == 13) {
                    eVar.f111648g.info("Bluetooth State Changed: ".concat(intExtra == 10 ? "OFF" : "Turning Off"));
                    if (atomicBoolean.compareAndSet(true, false)) {
                        eVar.f111653l.post(new a());
                        return;
                    }
                    return;
                }
                if (intExtra == 11) {
                    eVar.f111648g.info("Bluetooth State Changed: Turning On");
                } else if (intExtra == 12 && atomicBoolean.compareAndSet(false, true)) {
                    eVar.f111648g.info("Bluetooth State Changed: ON");
                    eVar.f111653l.postDelayed(new b(), 1000L);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x008e  */
    public e(Context context, da2.e eVar) {
        boolean z14;
        b bVar = new b();
        this.f111652k = bVar;
        if (context == null) {
            vb.h.s("context is null");
            throw null;
        }
        if (eVar == null) {
            vb.h.s("configuration is null");
            throw null;
        }
        this.f111648g = LoggerFactory.getLogger(oa2.d.a(this, "ConnectionManager"));
        this.f111653l = new Handler(Looper.getMainLooper());
        Context applicationContext = context.getApplicationContext();
        this.f111654m = applicationContext;
        this.f111646e = new da2.b();
        da2.h.a();
        da2.h.f58902c.set(bVar);
        this.f111647f = new f(applicationContext, "ble_mac_blacklist");
        boolean zHasSystemFeature = false;
        if (eVar.f58894e != null) {
            Logger logger = oa2.a.f131085a;
            if (applicationContext.getPackageManager().hasSystemFeature("android.hardware.bluetooth")) {
                z14 = true;
            } else {
                z14 = false;
            }
        } else {
            z14 = false;
        }
        this.f111657p = z14;
        Logger logger2 = oa2.a.f131085a;
        if (applicationContext != null) {
            try {
                zHasSystemFeature = applicationContext.getPackageManager().hasSystemFeature("android.hardware.bluetooth_le");
            } catch (Throwable unused) {
            }
        }
        this.f111658q = zHasSystemFeature;
        this.f111656o = this.f111657p ? new na2.d(context, this.f111651j, eVar) : null;
        this.f111655n = zHasSystemFeature ? new ma2.a(context, this.f111651j) : null;
        this.f111659r = eVar;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
        context.registerReceiver(new C2139e(oa2.a.b(context)), intentFilter);
        l();
    }

    public static String a(e eVar, String str, long j8, String str2, int i14) {
        String str3;
        eVar.getClass();
        StringBuilder sb3 = new StringBuilder();
        if (!TextUtils.isEmpty(str2)) {
            sb3.append(str2);
            sb3.append(StringUtils.SPACE);
        }
        sb3.append("(");
        sb3.append(str);
        if (j8 > -1) {
            sb3.append("/");
            sb3.append(j8);
        }
        sb3.append(") - ");
        if (i14 != 1) {
            str3 = i14 != 2 ? "UNKNOWN" : "BLUETOOTH_CLASSIC";
        } else {
            str3 = "BLUETOOTH_LOW_ENERGY";
        }
        sb3.append(str3);
        return sb3.toString();
    }

    public final void b(la2.a aVar) {
        this.f111649h.add(aVar);
    }

    public final void c(da2.a aVar, boolean z14) {
        ConcurrentHashMap concurrentHashMap = this.f111642a;
        String str = aVar.f58870a;
        concurrentHashMap.remove(str);
        Logger logger = this.f111648g;
        StringBuilder sbL = hb.a.l("pairDevice: remoteDeviceMacAddress=", str, ", isGarminAuth=");
        sbL.append(aVar.b());
        sbL.append(", forceSystemBonding=");
        sbL.append(z14);
        logger.debug(sbL.toString());
        f fVar = this.f111647f;
        synchronized (fVar.f111672c) {
            if (fVar.f111672c.remove(str)) {
                fVar.f111670a.getSharedPreferences("com.garmin.android.deviceinterface.prefs", 0).edit().putStringSet(fVar.f111671b, fVar.f111672c).apply();
            }
        }
        if (!aVar.b()) {
            f(aVar, z14);
        } else {
            AuthRegistry.getInstance().registerAuthInfo(str, aVar);
            f(aVar, false);
        }
    }

    public final void d(String str, ma2.j jVar) {
        boolean zContains;
        f fVar = this.f111647f;
        synchronized (fVar.f111672c) {
            zContains = fVar.f111672c.contains(str);
        }
        if (zContains) {
            jVar.e();
            return;
        }
        this.f111648g.debug("probeDevice: remoteDeviceMacAddress=" + str);
        c cVar = new c(str, jVar);
        ma2.a aVar = this.f111655n;
        if (!this.f111658q || aVar == null) {
            return;
        }
        da2.e eVar = this.f111659r;
        HashSet hashSet = eVar.f58891b;
        long j8 = eVar.f58892c;
        da2.e.f58888g.getClass();
        da2.e eVar2 = new da2.e((p005kotlin.jvm.internal.j) null);
        if (hashSet != null && !hashSet.isEmpty()) {
            eVar2.f58891b.addAll(hashSet);
        }
        eVar2.f58890a = EnumSet.of(l.GFDI);
        eVar2.f58892c = j8;
        if (TextUtils.isEmpty(str)) {
            vb.h.s("impossible to probe, empty macAddress");
            return;
        }
        AtomicReference<Timer> atomicReference = ma2.a.f117631h;
        Timer timer = new Timer("GDI_ProbeWatcher");
        while (!atomicReference.compareAndSet(null, timer) && atomicReference.get() == null) {
        }
        aVar.f117639g.info("probe connection requested to [" + str + "]");
        ConcurrentHashMap<String, ma2.a.d> concurrentHashMap = ma2.a.f117632i;
        ma2.a.d dVar = concurrentHashMap.get(str);
        if (dVar == null) {
            ma2.a.d dVar2 = aVar.new d(str, cVar);
            concurrentHashMap.put(str, dVar2);
            da2.h.f58901b.put(str, dVar2);
            aVar.d(str, false, ma2.i.PROBE, dVar2, eVar2);
            return;
        }
        DeviceProfile deviceProfile = dVar.f117656c;
        if (deviceProfile != null) {
            cVar.d(deviceProfile);
        } else {
            cVar.c(i.CONNECTION_ALREADY_IN_PROGRESS);
        }
    }

    public final void e(String str) {
        na2.d dVar;
        na2.c cVarRemove;
        boolean zIsEmpty;
        if (this.f111658q && this.f111655n != null) {
            ma2.i iVar = g(str) ? ma2.i.PERSISTENT : ma2.i.PAIRING;
            ml2.l lVar = (ml2.l) this.f111646e.getCapability(str, ml2.l.class);
            if (this.f111655n.e(str)) {
                this.f111651j.e(str, Integer.MIN_VALUE, iVar);
                if (lVar != null) {
                    synchronized (lVar.f119379f) {
                        lVar.f119380g.clear();
                        lVar.f119388o.clear();
                    }
                    Futures.addCallback(lVar.f119383j.c(), new ml2.k(lVar), MoreExecutors.directExecutor());
                }
            }
        }
        if (this.f111657p && (dVar = this.f111656o) != null) {
            synchronized (dVar.f125226b) {
                try {
                    if (dVar.f125225a.remove(str) != null) {
                        dVar.f125231g.info("Disconnecting: Forget known connection for [" + str + "]");
                    }
                    cVarRemove = dVar.f125226b.remove(str);
                    zIsEmpty = dVar.f125225a.isEmpty();
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            if (cVarRemove != null) {
                dVar.f125231g.info("Terminating connection for [" + cVarRemove.f125217a + "]");
                cVarRemove.a();
                if (zIsEmpty) {
                    dVar.f125231g.debug("disconnected last known mac address");
                    dVar.f125231g.debug("BluetoothClassicManager => stopAccepting");
                    dVar.f125227c.c(true);
                }
            }
        }
        AuthRegistry.getInstance().unregisterAuthInfo(str);
    }

    public final void f(da2.a aVar, boolean z14) {
        ma2.a aVar2;
        if (!this.f111658q || (aVar2 = this.f111655n) == null) {
            return;
        }
        da2.e.f58888g.getClass();
        da2.e eVarA = da2.e.a.a(this.f111659r, aVar);
        String str = aVar.f58870a;
        aVar2.f117639g.info(n23.j.g("pairing connection requested to [", str, "], requiresBond [", z14, "]"));
        aVar2.d(str, z14, ma2.i.PAIRING, aVar2.f117635c, eVarA);
    }

    public final boolean g(String str) {
        boolean z14;
        boolean z15;
        ma2.a aVar = this.f111655n;
        synchronized (aVar.f117636d) {
            try {
                ma2.a.c cVar = aVar.f117636d.get(str);
                z14 = false;
                z15 = cVar != null && cVar.f117649b == ma2.i.PERSISTENT;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (z15) {
            return true;
        }
        na2.d dVar = this.f111656o;
        if (dVar == null) {
            return false;
        }
        synchronized (dVar.f125226b) {
            try {
                na2.d.a aVar2 = dVar.f125225a.get(str);
                if (aVar2 != null && aVar2.f125232a == na2.d.b.PERSISTENT) {
                    z14 = true;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return z14;
    }

    public final boolean h(String str) {
        ma2.a aVar;
        ma2.a.c cVar;
        v vVar;
        if (this.f111658q && (aVar = this.f111655n) != null) {
            synchronized (aVar.f117636d) {
                cVar = aVar.f117636d.get(str);
            }
            if (cVar == null) {
                ds.e0.u("cannot refresh device service cache [", str, "], connection does not exist", aVar.f117639g);
                return false;
            }
            pj2.j jVar = cVar.f117648a;
            jVar.f138068b.trace("refreshDeviceCache");
            synchronized (jVar.f138076j) {
                vVar = jVar.f138077k;
            }
            if (vVar != null && vVar.c()) {
                return true;
            }
        }
        return false;
    }

    public final void i(la2.a aVar) {
        this.f111649h.remove(aVar);
    }

    public final boolean j(String str, boolean z14) {
        ma2.a aVar;
        if (!this.f111658q || (aVar = this.f111655n) == null) {
            return false;
        }
        synchronized (aVar.f117636d) {
            f fVar = aVar.f117637e;
            try {
                if (z14) {
                    synchronized (fVar.f111672c) {
                        if (fVar.f111672c.add(str)) {
                            fVar.f111670a.getSharedPreferences("com.garmin.android.deviceinterface.prefs", 0).edit().putStringSet(fVar.f111671b, fVar.f111672c).apply();
                        }
                    }
                } else {
                    synchronized (fVar.f111672c) {
                        if (fVar.f111672c.remove(str)) {
                            fVar.f111670a.getSharedPreferences("com.garmin.android.deviceinterface.prefs", 0).edit().putStringSet(fVar.f111671b, fVar.f111672c).apply();
                        }
                    }
                }
                ma2.a.c cVar = aVar.f117636d.get(str);
                if (cVar == null) {
                    aVar.f117639g.warn("cannot reset MTU [" + str + "], connection does not exist.");
                    return false;
                }
                if (cVar.f117648a.h(z14)) {
                    return true;
                }
                aVar.f117639g.debug("mtuNegotiation already set: " + z14);
                return false;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void k(String str) {
        ma2.a aVar;
        if (!this.f111658q || (aVar = this.f111655n) == null) {
            return;
        }
        synchronized (aVar.f117636d) {
            try {
                ma2.a.c cVar = aVar.f117636d.get(str);
                if (cVar != null) {
                    if (cVar.f117649b != ma2.i.PERSISTENT) {
                        aVar.f117639g.warn("attempt to reset non-NORMAL connection, device is being disconnected");
                        aVar.e(str);
                    } else {
                        cVar.f117648a.g();
                    }
                    return;
                }
                aVar.f117639g.warn("cannot reset [" + str + "], connection does not exist.");
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final synchronized void l() {
        na2.d dVar;
        boolean zIsEmpty;
        ma2.a aVar;
        try {
            if (da2.h.a()) {
                this.f111648g.info("re-init HandshakeBroadcaster and reset fallback listener");
                da2.h.f58902c.set(this.f111652k);
            }
            if (oa2.a.b(this.f111654m)) {
                if (this.f111658q && (aVar = this.f111655n) != null) {
                    aVar.g();
                }
                if (this.f111657p && (dVar = this.f111656o) != null) {
                    synchronized (dVar.f125226b) {
                        zIsEmpty = dVar.f125225a.isEmpty();
                    }
                    Logger logger = dVar.f125231g;
                    if (zIsEmpty) {
                        logger.debug("ignoring startKnownConnections since no known mac addresses");
                    } else {
                        logger.debug("BluetoothClassicManager => startAccepting");
                        dVar.f125227c.b(dVar);
                    }
                }
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public final void m(da2.a aVar) {
        long jMax;
        if (!aVar.f58874e) {
            this.f111648g.warn("attempt to start connection to non-paired device is ignored: " + aVar.f58870a);
            return;
        }
        if (aVar.b()) {
            AuthRegistry.getInstance().registerAuthInfo(aVar.f58870a, aVar);
        }
        if (!this.f111658q || this.f111655n == null) {
            return;
        }
        da2.e.a aVar2 = da2.e.f58888g;
        da2.e eVar = this.f111659r;
        aVar2.getClass();
        da2.e eVarA = da2.e.a.a(eVar, aVar);
        ma2.a aVar3 = this.f111655n;
        String str = aVar.f58870a;
        aVar3.getClass();
        if (TextUtils.isEmpty(str)) {
            vb.h.s("macAddress is invalid");
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (aVar3.f117636d) {
            try {
                int i14 = 0;
                long j8 = 350;
                for (ma2.a.c cVar : aVar3.f117636d.values()) {
                    if (cVar.f117648a.d() != pj2.j.d.TERMINATED) {
                        long j14 = jCurrentTimeMillis - cVar.f117650c;
                        if (cVar.f117648a.d() == pj2.j.d.CONNECTED || cVar.f117649b != ma2.i.PERSISTENT) {
                            if (str.equals(cVar.f117648a.f138072f)) {
                                j8 = 0;
                            }
                        }
                        if (j14 < 700) {
                            i14++;
                        }
                    }
                }
                if (j8 <= 0 || i14 < 2) {
                    aVar3.f117638f = jCurrentTimeMillis;
                    jMax = 0;
                } else {
                    jMax = Math.max(j8, (aVar3.f117638f + j8) - jCurrentTimeMillis);
                    aVar3.f117638f = jCurrentTimeMillis + jMax;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        aVar3.f117639g.info(n23.j.d(jMax, "persistent connection requested to [", str, "], delay:"));
        if (jMax > 0) {
            aVar3.f117633a.postDelayed(new fh2.a(aVar3, 17, str, eVarA), jMax);
        } else {
            aVar3.d(str, false, ma2.i.PERSISTENT, aVar3.f117635c, eVarA);
        }
    }

    public final void n() {
        na2.d dVar;
        ma2.a aVar;
        HashMap map;
        this.f111653l.removeCallbacksAndMessages(null);
        if (this.f111658q && (aVar = this.f111655n) != null) {
            synchronized (aVar.f117636d) {
                try {
                    map = new HashMap(aVar.f117636d);
                    for (Map.Entry entry : map.entrySet()) {
                        if (((ma2.a.c) entry.getValue()).f117649b != ma2.i.PERSISTENT) {
                            aVar.f117636d.remove(entry.getKey());
                        }
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                ((ma2.a.c) ((Map.Entry) it.next()).getValue()).f117648a.i();
            }
        }
        if (!this.f111657p || (dVar = this.f111656o) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        synchronized (dVar.f125226b) {
            arrayList.addAll(dVar.f125226b.values());
            dVar.f125226b.clear();
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            ((na2.c) it3.next()).a();
        }
        dVar.f125231g.debug("BluetoothClassicManager => stopAccepting");
        dVar.f125227c.c(true);
    }
}
