package eh2;

import android.content.Context;
import com.garmin.android.gfdi.framework.DeviceManager;
import com.garmin.android.gfdi.framework.GfdiServiceSubscriber;
import com.garmin.device.ble.BleCommunicationException;
import com.garmin.device.multilink.MultiLinkException;
import com.garmin.device.multilink.reliable.MLRConnectionHelper;
import com.google.common.util.concurrent.AsyncFunction;
import com.google.common.util.concurrent.FutureCallback;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import ml2.e0;
import ml2.j;
import ml2.l;
import ml2.n;
import ml2.o;
import ml2.q;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p13.l0;
import p13.y;
import pj2.k;
import rs2.i;

/* JADX INFO: loaded from: classes11.dex */
public class f implements ma2.f {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final ConcurrentHashMap<String, Collection<q>> f64063i = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Logger f64064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public i.b f64065b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f64066c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k f64067d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final da2.e f64068e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public DeviceManager f64069f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final CopyOnWriteArrayList<e> f64070g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public l f64071h;

    public class a implements FutureCallback<n> {
        public a() {
        }

        @Override // com.google.common.util.concurrent.FutureCallback
        public final void onFailure(Throwable th3) {
            f.this.f64064a.error("Failed to start Multi-Link channel", th3);
        }

        @Override // com.google.common.util.concurrent.FutureCallback
        public final void onSuccess(n nVar) {
            d dVarA;
            e eVarA;
            n nVar2 = nVar;
            f fVar = f.this;
            Logger logger = fVar.f64064a;
            k kVar = fVar.f64067d;
            logger.info("MLInfo:" + nVar2);
            DeviceManager deviceManager = fVar.f64069f;
            if (deviceManager != null) {
                deviceManager.setGenericCapability(l.class, fVar.f64071h);
            }
            f.f64063i.put(kVar.getMacAddress(), (List) nVar2.f119407k.getValue());
            l lVar = fVar.f64071h;
            CopyOnWriteArrayList<e> copyOnWriteArrayList = fVar.f64070g;
            Logger logger2 = fVar.f64064a;
            List<Integer> list = nVar2.f119398b;
            ArrayList arrayList = new ArrayList();
            da2.e eVar = fVar.f64068e;
            int i14 = oa2.c.f131087a;
            eVar.getClass();
            ConcurrentHashMap<Integer, e.a> concurrentHashMap = h.f64078a;
            HashSet<Integer> hashSet = new HashSet(new HashSet(h.f64078a.keySet()));
            int i15 = 1;
            hashSet.add(1);
            xm2.g.f191527c.getClass();
            xm2.g.a.b().getClass();
            ArrayList arrayListC = xm2.g.c();
            ArrayList arrayList2 = new ArrayList(y.r(arrayListC, 10));
            Iterator it = arrayListC.iterator();
            while (it.hasNext()) {
                arrayList2.add(Integer.valueOf(((xm2.h) it.next()).f191549a));
            }
            hashSet.addAll(arrayList2);
            Iterable iterable = eVar.f58890a;
            if (iterable == null) {
                iterable = l0.f134950a;
            }
            Iterator it3 = iterable.iterator();
            while (true) {
                dVarA = null;
                if (!it3.hasNext()) {
                    break;
                }
                ma2.l lVar2 = (ma2.l) it3.next();
                q qVar = lVar2.f117699b;
                if ((qVar != null ? Integer.valueOf(qVar.f119440a) : null) != null) {
                    hashSet.add(Integer.valueOf(lVar2.f117699b.f119440a));
                }
            }
            for (Integer num : hashSet) {
                if (num != null) {
                    if (list == null || !list.contains(num)) {
                        logger2.trace("Device does not support " + num);
                        i15 = 1;
                    } else {
                        xm2.h hVar = (xm2.h) zm2.a.f205370o.get(num);
                        if (hVar != null) {
                            arrayList.add(hVar);
                        } else {
                            if (i15 == num.intValue()) {
                                HashSet hashSet2 = new HashSet(kVar.p());
                                hashSet2.retainAll(eVar.f58891b);
                                if (hashSet2.isEmpty()) {
                                    eVarA = fVar.a(lVar, ma2.h.f117688p, new UUID[]{ma2.h.f117679g, ma2.h.f117678f});
                                } else {
                                    logger2.info("Device has dedicated GFDI service for " + ((UUID) hashSet2.iterator().next()) + ". Disabling GFDI over Multi-Link");
                                }
                            } else {
                                Context context = fVar.f64066c;
                                ConcurrentHashMap<Integer, e.a> concurrentHashMap2 = h.f64078a;
                                if (context == null) {
                                    vb.h.s("context is null");
                                    return;
                                } else if (lVar == null) {
                                    vb.h.s("communicator is null");
                                    return;
                                } else {
                                    e.a aVar = h.f64078a.get(num);
                                    eVarA = aVar == null ? null : aVar.a(context, lVar);
                                }
                            }
                            e eVar2 = eVarA;
                            if (eVar2 == null) {
                                logger2.info("No Multi-Link handler for " + num);
                            } else {
                                copyOnWriteArrayList.add(eVar2);
                                int iIntValue = num.intValue();
                                if (eVar2.delayStartUntilAfterHandshake()) {
                                    String macAddress = kVar.getMacAddress();
                                    la2.e eVar3 = da2.d.b().f58886a;
                                    logger2.trace("Delaying start of handler for service " + iIntValue + " until handshake completes");
                                    eVar3.b(new g(fVar, macAddress, iIntValue, eVar2, eVar3));
                                } else {
                                    eVar2.b(iIntValue);
                                }
                            }
                            i15 = 1;
                        }
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            if (kVar.p().contains(ma2.h.f117687o)) {
                logger2.debug("Device has dedicated Real-Time service. Disabling Real-Time over Multi-Link");
            } else {
                int i16 = oa2.c.f131087a;
                ArrayList arrayList3 = new ArrayList();
                Iterator it4 = arrayList.iterator();
                while (it4.hasNext()) {
                    UUID uuid = (UUID) zm2.a.f205368m.get((xm2.h) it4.next());
                    if (uuid != null) {
                        arrayList3.add(uuid);
                    }
                }
                dVarA = fVar.a(lVar, ma2.h.f117687o, (UUID[]) arrayList3.toArray(new UUID[0]));
            }
            if (dVarA != null) {
                copyOnWriteArrayList.add(dVarA);
                dVarA.b(((xm2.h) arrayList.iterator().next()).f191549a);
            }
        }
    }

    public static class b implements ma2.f.a {
        @Override // ma2.f.a
        public final ma2.f create(Context context, da2.e eVar, k kVar) {
            return new f(context, kVar, eVar, 0);
        }
    }

    private f(Context context, k kVar, da2.e eVar) {
        this.f64065b = i.b.NOTIFY_MISMATCH;
        this.f64070g = new CopyOnWriteArrayList<>();
        if (context == null) {
            vb.h.s("context is null");
            throw null;
        }
        if (kVar == null) {
            vb.h.s("gatt is null");
            throw null;
        }
        if (eVar == null) {
            vb.h.s("config is null");
            throw null;
        }
        this.f64064a = LoggerFactory.getLogger(oa2.d.b("GDI#", "MultiLinkSubscriber", kVar.getMacAddress(), -1L, this));
        this.f64066c = context.getApplicationContext();
        this.f64067d = kVar;
        this.f64068e = eVar;
    }

    public final d a(l lVar, UUID uuid, UUID[] uuidArr) {
        d dVar = new d(lVar, uuid, uuidArr);
        ma2.f fVarA = ma2.g.a(this.f64066c, uuid, this.f64068e, dVar);
        if (fVarA == null) {
            return null;
        }
        if (fVarA instanceof GfdiServiceSubscriber) {
            ((GfdiServiceSubscriber) fVarA).setGuidMismatchCheck(this.f64065b);
        }
        dVar.f64055f = fVarA;
        return dVar;
    }

    @Override // ma2.f
    public final boolean delayStartUntilAfterHandshake() {
        return false;
    }

    @Override // ma2.f
    public final boolean initialize(UUID uuid, UUID[] uuidArr) {
        ListenableFuture<e0.b> listenableFutureB;
        ml2.d dVar;
        long j8 = this.f64068e.f58892c;
        k kVar = this.f64067d;
        final l lVar = new l(kVar, j8);
        if (GfdiServiceSubscriber.INSTANCE.getENABLE_NO_RESPONSE_WATCHDOG()) {
            eh2.b bVar = new eh2.b(this, 0);
            lVar.f119387n = bVar;
            MLRConnectionHelper mLRConnectionHelper = lVar.f119386m;
            if (mLRConnectionHelper != null && (dVar = mLRConnectionHelper.watchDog) != null) {
                dVar.f119317d.debug("enableOnResetNeeded");
                dVar.f119314a = new ml2.e(dVar, bVar);
            }
        }
        this.f64071h = lVar;
        final ArrayList arrayList = new ArrayList();
        arrayList.add(o.g.f119416c);
        arrayList.add(o.a.f119411c);
        arrayList.add(o.d.f119413c);
        arrayList.add(o.e.f119414c);
        arrayList.add(o.c.f119412c);
        arrayList.add(new o.f(q.NFC.f119440a));
        e0 e0Var = new e0(lVar.f119377d, lVar.f119378e);
        if (uuidArr == null) {
            vb.h.s("characteristics is null");
            return false;
        }
        ArrayList arrayList2 = new ArrayList(Arrays.asList(uuidArr));
        ArrayList arrayList3 = new ArrayList();
        for (int i14 = 0; i14 < 10; i14++) {
            arrayList3.add(UUID.fromString(String.format(Locale.US, "6A4E%04X-667B-11E3-949A-0800200C9A66", Integer.valueOf(i14 + 10256))));
        }
        arrayList3.retainAll(arrayList2);
        if (arrayList3.size() == 0) {
            listenableFutureB = Futures.immediateFailedFuture(new BleCommunicationException("Device has no multi-link data characteristics"));
        } else {
            UUID uuid2 = (UUID) arrayList3.get(new Random().nextInt(arrayList3.size()));
            UUID uuidA = e0.a(uuid2);
            if (!Arrays.asList(uuidArr).contains(uuidA)) {
                e0Var.f119329a.warn("Using {} for ML read and write", uuid2);
                uuidA = uuid2;
            }
            listenableFutureB = e0Var.b(uuid2, uuidA);
        }
        final int i15 = 0;
        final int i16 = 1;
        ListenableFuture listenableFutureTransformAsync = Futures.transformAsync(Futures.transformAsync(listenableFutureB, new AsyncFunction() { // from class: ml2.h
            @Override // com.google.common.util.concurrent.AsyncFunction
            public final ListenableFuture apply(Object obj) {
                p cVar;
                switch (i15) {
                    case 0:
                        e0.b bVar2 = (e0.b) obj;
                        int i17 = bVar2.f119336c;
                        l lVar2 = lVar;
                        Logger logger = lVar2.f119376c;
                        ArrayList arrayList4 = arrayList;
                        if (i17 >= 1) {
                            logger.trace("Using RegistrationService for info query");
                            cVar = new h0(lVar2.f119377d, bVar2.f119334a, bVar2.f119335b, bVar2.f119337d, arrayList4);
                        } else {
                            logger.trace("Using legacy characteristic for info query");
                            cVar = new c(lVar2.f119377d, arrayList4);
                        }
                        return cVar.a();
                    default:
                        n nVar = (n) obj;
                        lVar.f119376c.trace("Available multi-link services: {}", nVar.f119398b);
                        return (arrayList.contains(o.g.f119416c) && nVar.f119398b.isEmpty()) ? Futures.immediateFailedFuture(new MultiLinkException("No supported services.")) : Futures.immediateFuture(nVar);
                }
            }
        }, MoreExecutors.directExecutor()), new AsyncFunction() { // from class: ml2.h
            @Override // com.google.common.util.concurrent.AsyncFunction
            public final ListenableFuture apply(Object obj) {
                p cVar;
                switch (i16) {
                    case 0:
                        e0.b bVar2 = (e0.b) obj;
                        int i17 = bVar2.f119336c;
                        l lVar2 = lVar;
                        Logger logger = lVar2.f119376c;
                        ArrayList arrayList4 = arrayList;
                        if (i17 >= 1) {
                            logger.trace("Using RegistrationService for info query");
                            cVar = new h0(lVar2.f119377d, bVar2.f119334a, bVar2.f119335b, bVar2.f119337d, arrayList4);
                        } else {
                            logger.trace("Using legacy characteristic for info query");
                            cVar = new c(lVar2.f119377d, arrayList4);
                        }
                        return cVar.a();
                    default:
                        n nVar = (n) obj;
                        lVar.f119376c.trace("Available multi-link services: {}", nVar.f119398b);
                        return (arrayList.contains(o.g.f119416c) && nVar.f119398b.isEmpty()) ? Futures.immediateFailedFuture(new MultiLinkException("No supported services.")) : Futures.immediateFuture(nVar);
                }
            }
        }, MoreExecutors.directExecutor());
        Futures.addCallback(listenableFutureTransformAsync, new j(lVar, listenableFutureB), MoreExecutors.directExecutor());
        Futures.addCallback(listenableFutureTransformAsync, new a(), MoreExecutors.directExecutor());
        DeviceManager deviceManagerRegister = DeviceManager.register(this.f64066c, kVar.getMacAddress(), 1);
        this.f64069f = deviceManagerRegister;
        if (deviceManagerRegister == null) {
            return false;
        }
        deviceManagerRegister.setSupportsMultiLink(true);
        return true;
    }

    @Override // ma2.f
    public final void onDeviceDisconnect() {
        k kVar = this.f64067d;
        f64063i.remove(kVar.getMacAddress());
        l lVar = this.f64071h;
        if (lVar != null) {
            lVar.close();
            this.f64071h = null;
        }
        Iterator<e> it = this.f64070g.iterator();
        while (it.hasNext()) {
            try {
                it.next().onDeviceDisconnect();
            } catch (Throwable th3) {
                this.f64064a.error("Failed to disconnect handler", th3);
            }
        }
        DeviceManager deviceManager = this.f64069f;
        this.f64069f = null;
        if (deviceManager != null) {
            deviceManager.terminate();
            da2.d.c(this.f64066c).f58886a.f111646e.h(kVar.getMacAddress());
        }
    }

    public /* synthetic */ f(Context context, k kVar, da2.e eVar, int i14) {
        this(context, kVar, eVar);
    }
}
