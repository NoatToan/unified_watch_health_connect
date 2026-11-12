package ma2;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.garmin.android.gfdi.framework.DeviceManager;
import com.garmin.android.gfdi.framework.GfdiServiceSubscriber;
import com.garmin.device.datatypes.DeviceProfile;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p006l2.v0;
import pj2.m;

/* JADX INFO: loaded from: classes7.dex */
public class a implements pj2.j.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final AtomicReference<Timer> f117631h = new AtomicReference<>(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final ConcurrentHashMap<String, d> f117632i = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f117634b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final la2.g f117635c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final la2.f f117637e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Logger f117639g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f117633a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap<String, c> f117636d = new HashMap<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f117638f = 0;

    /* JADX INFO: renamed from: ma2.a$a, reason: collision with other inner class name */
    public class C2228a implements la2.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f117640a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ f f117641b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ la2.j f117642c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ UUID f117643d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ UUID[] f117644e;

        public C2228a(String str, f fVar, la2.j jVar, UUID uuid, UUID[] uuidArr) {
            this.f117640a = str;
            this.f117641b = fVar;
            this.f117642c = jVar;
            this.f117643d = uuid;
            this.f117644e = uuidArr;
        }

        @Override // la2.a
        public final void onDeviceConnected(la2.b bVar) {
            if (this.f117640a.equals(bVar.f111632a.getMacAddress())) {
                f fVar = this.f117641b;
                if (fVar.delayStartUntilAfterHandshake()) {
                    a aVar = a.this;
                    Logger logger = aVar.f117639g;
                    StringBuilder sb3 = new StringBuilder("initializing delayed subscriber ");
                    UUID uuid = this.f117643d;
                    sb3.append(uuid);
                    logger.trace(sb3.toString());
                    if (fVar.initialize(uuid, this.f117644e)) {
                        return;
                    }
                    aVar.f117639g.warn("initialize subscriber [" + fVar.getClass().getSimpleName() + "] failed");
                }
            }
        }

        @Override // la2.a
        public final void onDeviceConnectingFailure(la2.c cVar) {
            if (this.f117640a.equals(cVar.f111633a)) {
                this.f117641b.onDeviceDisconnect();
                ((la2.e) this.f117642c).i(this);
            }
        }

        @Override // la2.a
        public final void onDeviceDisconnected(la2.h hVar) {
            if (this.f117640a.equals(hVar.f111673a.getMacAddress())) {
                this.f117641b.onDeviceDisconnect();
                ((la2.e) this.f117642c).i(this);
            }
        }
    }

    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f117646a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f117647b;

        static {
            int[] iArr = new int[m.values().length];
            f117647b = iArr;
            try {
                iArr[m.BLUETOOTH_UNAVAILABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f117647b[m.SCAN_FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f117647b[m.SCAN_TIMEOUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f117647b[m.NULL_GATT_HANDLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f117647b[m.CONNECT_GATT_TIMEOUT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f117647b[m.CONNECT_GATT_FAILURE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f117647b[m.AUTHENTICATION.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f117647b[m.CREATE_BOND_FAILURE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f117647b[m.DISCOVER_SERVICE_FAILURE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f117647b[m.DISCOVER_SERVICE_TIMEOUT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f117647b[m.PREMATURE_DISCONNECT.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f117647b[m.SYSTEM_BONDING_LOST.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            int[] iArr2 = new int[i.values().length];
            f117646a = iArr2;
            try {
                iArr2[i.PAIRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f117646a[i.PROBE.ordinal()] = 2;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f117646a[i.PERSISTENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused15) {
            }
        }
    }

    public class d implements da2.h.b, la2.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f117654a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final j f117655b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public DeviceProfile f117656c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public C2229a f117657d = null;

        /* JADX INFO: renamed from: ma2.a$d$a, reason: collision with other inner class name */
        public class C2229a extends TimerTask {
            public C2229a() {
            }

            @Override // java.util.TimerTask, java.lang.Runnable
            public final void run() {
                d dVar = d.this;
                a.this.f117639g.warn("probe messaging time's up for " + dVar.f117654a);
                dVar.h();
            }
        }

        public d(String str, j jVar) {
            this.f117654a = str;
            this.f117655b = jVar;
        }

        @Override // da2.h.b
        public final void a(String str) {
            da2.h.f58901b.remove(str);
            a.f117632i.remove(str);
            this.f117655b.c(la2.i.HANDSHAKE_TIMEOUT);
        }

        @Override // la2.g
        public final void b(String str) {
            da2.h.d(str);
        }

        @Override // da2.h.b
        public final void c(DeviceProfile deviceProfile) {
            c cVar;
            da2.h.f58901b.remove(this.f117654a);
            this.f117656c = deviceProfile;
            synchronized (a.this.f117636d) {
                cVar = a.this.f117636d.get(this.f117654a);
            }
            this.f117655b.d(deviceProfile);
            j jVar = this.f117655b;
            if (!(jVar instanceof k) || !((k) jVar).b(deviceProfile)) {
                g(cVar);
                return;
            }
            this.f117657d = new C2229a();
            a.f117631h.get().schedule(this.f117657d, 90000L);
            ((k) this.f117655b).a(this.f117654a, new v0(this, 25));
        }

        @Override // la2.g
        public final void d(String str, la2.i iVar, String str2) {
            da2.h.f58901b.remove(str);
            a.f117632i.remove(str);
            la2.i iVar2 = la2.i.BLE_NO_SERVICE_SUBSCRIBER;
            j jVar = this.f117655b;
            if (iVar == iVar2) {
                jVar.e();
            } else {
                jVar.c(iVar);
            }
        }

        @Override // la2.g
        public final void e(String str, int i14, i iVar) {
            da2.h.f58901b.remove(str);
            a.f117632i.remove(str);
            C2229a c2229a = this.f117657d;
            if (c2229a != null) {
                c2229a.cancel();
            }
        }

        @Override // da2.h.b
        public final void f(String str, String str2) {
            da2.h.f58901b.remove(str);
            a.f117632i.remove(str);
            this.f117655b.c(la2.i.HANDSHAKE_FAILURE);
        }

        public final void g(c cVar) {
            ConcurrentHashMap<String, d> concurrentHashMap = a.f117632i;
            String str = this.f117654a;
            concurrentHashMap.remove(str);
            if (cVar == null || cVar.f117649b != i.PROBE || cVar.f117648a.d() == pj2.j.d.TERMINATED) {
                return;
            }
            a aVar = a.this;
            aVar.f117639g.debug("auto disconnect from probe connection to [" + str + "]");
            da2.d.c(aVar.f117634b).f58886a.e(str);
            DeviceManager.register(aVar.f117634b, str, 1).terminate();
        }

        public final void h() {
            c cVar;
            C2229a c2229a = this.f117657d;
            if (c2229a != null) {
                c2229a.cancel();
            }
            synchronized (a.this.f117636d) {
                cVar = a.this.f117636d.get(this.f117654a);
            }
            g(cVar);
        }
    }

    public a(Context context, la2.g gVar) {
        if (context == null) {
            vb.h.s("context is null");
            throw null;
        }
        if (gVar == null) {
            vb.h.s("callback is null");
            throw null;
        }
        this.f117639g = LoggerFactory.getLogger(oa2.d.a(this, "Ble#Manager"));
        Context applicationContext = context.getApplicationContext();
        this.f117634b = applicationContext;
        this.f117637e = new la2.f(applicationContext, "ble_mac_mtu_whitelist");
        this.f117635c = gVar;
    }

    @Override // pj2.j.c
    public final void a(pj2.j jVar, pj2.k kVar) {
        c cVar;
        Set<UUID> hashSet;
        UUID uuid;
        String str = jVar.f138072f;
        synchronized (this.f117636d) {
            cVar = this.f117636d.get(str);
        }
        if (cVar == null) {
            return;
        }
        List<UUID> listP = kVar.p();
        ConcurrentHashMap<UUID, f.a> concurrentHashMap = g.f117672a;
        HashSet hashSet2 = new HashSet(g.f117672a.keySet());
        UUID uuid2 = h.f117673a;
        if (listP == null || listP.isEmpty()) {
            hashSet = Collections.EMPTY_SET;
        } else if (listP.contains(h.f117682j)) {
            hashSet = new HashSet<>(listP);
        } else {
            HashSet hashSet3 = new HashSet();
            UUID uuid3 = h.f117689q;
            if (listP.contains(uuid3)) {
                hashSet3.add(uuid3);
            }
            for (UUID uuid4 : listP) {
                String upperCase = uuid4.toString().toUpperCase();
                if ((upperCase.startsWith("6A4E") && upperCase.endsWith("-667B-11E3-949A-0800200C9A66")) || uuid4.equals(h.f117674b) || uuid4.equals(h.f117683k)) {
                    hashSet3.add(uuid4);
                }
            }
            for (UUID uuid5 : listP) {
                if (hashSet2.contains(uuid5)) {
                    hashSet3.add(uuid5);
                }
            }
            hashSet = hashSet3;
        }
        if (cVar.f117649b != i.PROBE) {
            f(cVar, kVar, hashSet);
            return;
        }
        Logger logger = this.f117639g;
        HashSet hashSet4 = new HashSet(cVar.f117652e.f58891b);
        hashSet4.retainAll(hashSet);
        Iterator it = hashSet4.iterator();
        while (true) {
            if (!it.hasNext()) {
                uuid = null;
                break;
            }
            uuid = (UUID) it.next();
            if (g.f117672a.containsKey(uuid)) {
                logger.debug("probing device on GFDI service [" + uuid + "]");
                break;
            }
        }
        if (uuid == null) {
            UUID uuid6 = ml2.m.f119394a;
            if (g.f117672a.containsKey(uuid6)) {
                logger.debug("probing device on Multi-Link service");
                uuid = uuid6;
            }
        }
        if (uuid != null) {
            f(cVar, kVar, Collections.singleton(uuid));
            return;
        }
        logger.warn("no GFDI compatible services on this device");
        cVar.f117648a.i();
        cVar.f117651d.d(kVar.getMacAddress(), la2.i.BLE_NO_SERVICE_SUBSCRIBER, null);
    }

    @Override // pj2.j.c
    public final void b(pj2.j jVar, m mVar) {
        la2.i iVar;
        c cVar;
        String str;
        switch (b.f117647b[mVar.ordinal()]) {
            case 1:
                iVar = la2.i.BLE_NOT_AVAILABLE;
                break;
            case 2:
                iVar = la2.i.BLE_SCAN_FAILURE;
                break;
            case 3:
                iVar = la2.i.BLE_SCAN_TIMEOUT;
                break;
            case 4:
                iVar = la2.i.BLE_NULL_GATT_HANDLE;
                break;
            case 5:
                iVar = la2.i.BLE_CONNECT_GATT_TIMEOUT;
                break;
            case 6:
                iVar = la2.i.BLE_CONNECTION_STATE_FAILURE;
                break;
            case 7:
                iVar = la2.i.AUTHENTICATION_EXCEPTION;
                break;
            case 8:
                iVar = la2.i.CREATE_BOND_FAILURE;
                break;
            case 9:
                iVar = la2.i.BLE_DISCOVER_SERVICE_FAILURE;
                break;
            case 10:
                iVar = la2.i.BLE_SERVICE_DISCOVERY_TIMEOUT;
                break;
            case 11:
                iVar = la2.i.BLE_PREMATURE_DISCONNECT;
                break;
            case 12:
                iVar = la2.i.SYSTEM_BONDING_LOST;
                break;
            default:
                iVar = la2.i.UNKNOWN_ERROR;
                break;
        }
        String str2 = jVar.f138072f;
        synchronized (this.f117636d) {
            cVar = this.f117636d.get(str2);
        }
        if (cVar != null) {
            if (iVar == la2.i.BLE_PREMATURE_DISCONNECT) {
                str = cVar.f117649b + " connection disconnected unexpectedly";
            } else {
                str = null;
            }
            if (cVar.f117649b != i.PAIRING || iVar != la2.i.SYSTEM_BONDING_LOST) {
                cVar.f117651d.d(str2, iVar, str);
                return;
            }
            this.f117639g.warn("ignoring bond lost during pairing: " + cVar.f117648a.f138072f + StringUtils.SPACE + Build.MANUFACTURER + StringUtils.SPACE + Build.MODEL);
        }
    }

    @Override // pj2.j.c
    public final void c(pj2.j jVar, int i14) {
        c cVar;
        String str = jVar.f138072f;
        synchronized (this.f117636d) {
            cVar = this.f117636d.get(str);
        }
        if (cVar != null) {
            cVar.f117651d.e(str, i14, cVar.f117649b);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001e  */
    /* JADX WARN: Code duplicated, block: B:52:0x0140 A[PHI: r3
      0x0140: PHI (r3v3 ma2.a$c) = (r3v2 ma2.a$c), (r3v17 ma2.a$c), (r3v17 ma2.a$c) binds: [B:5:0x0013, B:42:0x00d9, B:44:0x00dd] A[DONT_GENERATE, DONT_INLINE]] */
    public final void d(String str, boolean z14, i iVar, la2.g gVar, da2.e eVar) {
        da2.e eVar2;
        synchronized (this.f117636d) {
            try {
                c cVar = this.f117636d.get(str);
                if (cVar == null) {
                    eVar2 = eVar;
                } else {
                    i iVar2 = i.PAIRING;
                    if (iVar == iVar2 || iVar == i.PROBE) {
                        if (cVar.f117648a.d() != pj2.j.d.TERMINATED) {
                            if (iVar == iVar2 && cVar.f117649b == i.PROBE) {
                                this.f117639g.info("upgrading connection to pairing for [" + str + "]");
                                c cVarRemove = this.f117636d.remove(str);
                                if (cVarRemove != null) {
                                    pj2.j jVar = cVarRemove.f117648a;
                                    a aVar = a.this;
                                    if (aVar != null) {
                                        jVar.f138075i.remove(aVar);
                                    } else {
                                        jVar.getClass();
                                    }
                                    jVar.i();
                                    cVarRemove.f117651d.e(jVar.f138072f, -3, cVarRemove.f117649b);
                                }
                            } else {
                                if (iVar != iVar2 || cVar.f117649b != i.PERSISTENT) {
                                    gVar.d(str, la2.i.CONNECTION_ALREADY_IN_PROGRESS, iVar + " connection should not be in progress");
                                    return;
                                }
                                this.f117639g.warn("downgrading connection to pairing for [" + str + "]");
                                c cVarRemove2 = this.f117636d.remove(str);
                                if (cVarRemove2 != null) {
                                    pj2.j jVar2 = cVarRemove2.f117648a;
                                    a aVar2 = a.this;
                                    if (aVar2 != null) {
                                        jVar2.f138075i.remove(aVar2);
                                    } else {
                                        jVar2.getClass();
                                    }
                                    jVar2.i();
                                    cVarRemove2.f117651d.e(jVar2.f138072f, -3, cVarRemove2.f117649b);
                                }
                            }
                            cVar = null;
                        }
                    }
                    if (iVar != i.PERSISTENT || cVar.f117649b == iVar) {
                        eVar2 = eVar;
                    } else {
                        this.f117639g.info("upgrading connection to persistent for [" + str + "]");
                        i iVar3 = cVar.f117649b;
                        da2.e eVar3 = cVar.f117652e;
                        c cVar2 = new c(cVar.f117648a, gVar, iVar, eVar);
                        this.f117636d.put(str, cVar2);
                        if (iVar3 == iVar2) {
                            eVar2 = eVar;
                            if (!eVar2.equals(eVar3)) {
                                this.f117639g.warn("different config between pairing and persistent, must disconnect and reconnect.\noldConfig=" + eVar3.toString() + "\nnewConfig=" + eVar2.toString());
                                cVar2.f117648a.g();
                            }
                        } else {
                            eVar2 = eVar;
                        }
                        cVar = cVar2;
                    }
                }
                if (cVar == null || cVar.f117648a.d() == pj2.j.d.TERMINATED) {
                    c cVar3 = new c(this, str, z14, gVar, iVar, eVar2);
                    this.f117636d.put(str, cVar3);
                    cVar = cVar3;
                }
                if (oa2.a.b(this.f117634b) && cVar.f117648a.d() == pj2.j.d.NOT_STARTED) {
                    try {
                        cVar.f117648a.b();
                    } catch (IllegalStateException e4) {
                        this.f117639g.error("failed to ble connect", (Throwable) e4);
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final boolean e(String str) {
        c cVarRemove;
        synchronized (this.f117636d) {
            cVarRemove = this.f117636d.remove(str);
        }
        if (cVarRemove == null || cVarRemove.f117648a.d() == pj2.j.d.TERMINATED) {
            return false;
        }
        cVarRemove.f117648a.i();
        return true;
    }

    public final void f(c cVar, pj2.k kVar, Set<UUID> set) {
        rs2.i.b bVar;
        i iVar = cVar.f117649b;
        pj2.j jVar = cVar.f117648a;
        da2.e eVar = cVar.f117652e;
        la2.g gVar = cVar.f117651d;
        la2.e eVar2 = da2.d.b().f58886a;
        String macAddress = kVar.getMacAddress();
        Iterator<UUID> it = set.iterator();
        int i14 = 1;
        boolean z14 = true;
        while (true) {
            boolean zHasNext = it.hasNext();
            Logger logger = this.f117639g;
            if (!zHasNext) {
                if (z14 && iVar != i.PROBE) {
                    Iterator<UUID> it3 = kVar.p().iterator();
                    while (it3.hasNext()) {
                        logger.trace("Device GATT: " + it3.next().toString());
                    }
                    ConcurrentHashMap<UUID, f.a> concurrentHashMap = g.f117672a;
                    Iterator it4 = new HashSet(g.f117672a.keySet()).iterator();
                    while (it4.hasNext()) {
                        logger.trace("App Registered: " + ((UUID) it4.next()).toString());
                    }
                    Iterator<UUID> it5 = set.iterator();
                    while (it5.hasNext()) {
                        logger.trace("Filtered: " + it5.next().toString());
                    }
                }
                if (!z14) {
                    logger.info("subscribers found");
                    gVar.b(kVar.getMacAddress());
                    return;
                } else {
                    logger.warn("no subscribers found for any services");
                    jVar.g();
                    gVar.d(kVar.getMacAddress(), la2.i.BLE_NO_SERVICE_SUBSCRIBER, null);
                    return;
                }
            }
            UUID next = it.next();
            f fVarA = g.a(this.f117634b, next, eVar, kVar);
            if (fVarA != null) {
                List<UUID> listN = kVar.n(next);
                UUID[] uuidArr = (UUID[]) listN.toArray(new UUID[listN.size()]);
                eVar2.b(new C2228a(macAddress, fVarA, eVar2, next, uuidArr));
                if (fVarA.delayStartUntilAfterHandshake()) {
                    logger.trace("delaying start of subscriber for service " + next + " until handshake completes");
                } else {
                    int i15 = b.f117646a[iVar.ordinal()];
                    if (i15 != i14) {
                        bVar = i15 != 2 ? rs2.i.b.NOTIFY_MISMATCH : rs2.i.b.SKIP_GUID_CHECK;
                    } else {
                        bVar = eVar.f58895f ? rs2.i.b.AUTO_OVERWRITE_MISMATCH : rs2.i.b.NOTIFY_MISMATCH;
                    }
                    if (fVarA instanceof GfdiServiceSubscriber) {
                        ((GfdiServiceSubscriber) fVarA).setGuidMismatchCheck(bVar);
                    } else if (fVarA instanceof eh2.f) {
                        ((eh2.f) fVarA).f64065b = bVar;
                    }
                    logger.debug("initializing subscriber [" + fVarA.getClass().getSimpleName() + "], conn type [" + iVar + "], guid check [" + bVar + "]");
                    if (!fVarA.initialize(next, uuidArr)) {
                        logger.warn("initialize subscriber [" + fVarA.getClass().getSimpleName() + "] failed");
                        jVar.f138075i.remove(this);
                        jVar.g();
                        gVar.d(kVar.getMacAddress(), la2.i.BLE_SUBSCRIBER_INIT_FAILED, null);
                        return;
                    }
                    z14 = false;
                }
            }
            i14 = 1;
        }
    }

    public final void g() {
        HashSet<c> hashSet;
        synchronized (this.f117636d) {
            hashSet = new HashSet(this.f117636d.values());
        }
        for (c cVar : hashSet) {
            i iVar = cVar.f117649b;
            if (iVar == i.PERSISTENT) {
                d(cVar.f117648a.f138072f, false, iVar, cVar.f117651d, cVar.f117652e);
            }
        }
    }

    public class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final pj2.j f117648a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final i f117649b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f117650c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final la2.g f117651d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final da2.e f117652e;

        public c(pj2.j jVar, la2.g gVar, i iVar, da2.e eVar) {
            boolean zContains;
            a.this.getClass();
            this.f117650c = System.currentTimeMillis();
            this.f117648a = jVar;
            jVar.f138075i.add(a.this);
            boolean z14 = iVar == i.PERSISTENT;
            jVar.f138068b.trace("setAutoReconnect: {}", Boolean.valueOf(z14));
            jVar.f138081o.set(z14);
            this.f117649b = iVar;
            this.f117651d = gVar;
            this.f117652e = eVar;
            if (da2.d.f58881d && eVar.f58891b.isEmpty()) {
                jVar.h(true);
                return;
            }
            la2.f fVar = a.this.f117637e;
            String str = jVar.f138072f;
            synchronized (fVar.f111672c) {
                zContains = fVar.f111672c.contains(str);
            }
            if (zContains) {
                jVar.h(true);
            }
        }

        public c(a aVar, String str, boolean z14, la2.g gVar, i iVar, da2.e eVar) {
            this(new pj2.j(aVar.f117634b, str, z14, da2.d.f58882e), gVar, iVar, eVar);
        }
    }
}
