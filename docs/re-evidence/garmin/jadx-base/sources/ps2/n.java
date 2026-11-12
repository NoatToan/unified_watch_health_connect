package ps2;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import ch.qos.logback.classic.Logger;
import com.google.common.base.Optional;
import com.google.common.util.concurrent.FutureCallback;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicReference;
import p005kotlin.Metadata;
import p13.h0;
import p13.u0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lps2/n;", "", "Lhs2/a;", "metadataField", "Lhs2/d;", "device", "", "userId", "Lzi2/a;", "environment", "Lps2/t;", "providerManager", "Landroid/os/Handler;", "uiHandler", "<init>", "(Lhs2/a;Lhs2/d;JLzi2/a;Lps2/t;Landroid/os/Handler;)V", "garminpay-core_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public hs2.a f140498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hs2.d f140499b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f140500c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final zi2.a f140501d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f140502e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Handler f140503f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Logger f140504g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ExecutorService f140505h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AtomicReference<hs2.b> f140506i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final js2.b f140507j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final HashMap f140508k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final LinkedHashMap f140509l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final CopyOnWriteArraySet f140510m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f140511n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f140512o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public js2.d f140513p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Optional<hs2.c> f140514q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @SuppressLint({"CheckResult"})
    public final i f140515r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final i f140516s;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f140517a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f140518b;

        static {
            int[] iArr = new int[pl2.c.values().length];
            try {
                iArr[pl2.c.f138556c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[pl2.c.f138557d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[pl2.c.f138558e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[pl2.c.f138559f.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[pl2.c.f138560g.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[pl2.c.f138561h.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[pl2.c.f138562i.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[pl2.c.f138563j.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[pl2.c.f138564k.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[pl2.c.f138565l.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[pl2.c.f138572t.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[pl2.c.f138566m.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[pl2.c.f138567n.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[pl2.c.f138568o.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[pl2.c.f138569p.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[pl2.c.f138570q.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[pl2.c.f138571r.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            f140517a = iArr;
            int[] iArr2 = new int[hs2.b.values().length];
            try {
                iArr2[hs2.b.DISCONNECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr2[hs2.b.CONNECTING.ordinal()] = 2;
            } catch (NoSuchFieldError unused19) {
            }
            f140518b = iArr2;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.garminpay.wallet.DeviceWallet", f = "DeviceWallet.kt", l = {795}, m = "getOperators", v = 2)
    public static final class b extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Collection f140519a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Iterator f140520b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Collection f140521c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f140522d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f140523e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public /* synthetic */ Object f140524f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f140526h;

        public b(t13.d<? super b> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f140524f = obj;
            this.f140526h |= Integer.MIN_VALUE;
            return n.this.i(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0001¨\u0006\u0004"}, d2 = {"ps2/n$c", "Lcom/google/common/util/concurrent/FutureCallback;", "", "Lcom/garmin/device/nfc/b;", "garminpay-core_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c implements FutureCallback<Collection<? extends com.garmin.device.nfc.b>> {
        public c() {
        }

        @Override // com.google.common.util.concurrent.FutureCallback
        public final void onFailure(Throwable th3) {
            th3.getClass();
            n.this.f140504g.error("refreshDeviceCardsOnConnection failure", th3);
        }

        @Override // com.google.common.util.concurrent.FutureCallback
        public final void onSuccess(Collection<? extends com.garmin.device.nfc.b> collection) {
            Collection<? extends com.garmin.device.nfc.b> collection2 = collection;
            n.this.f140504g.debug("refreshDeviceCardsOnConnection success " + (collection2 != null ? Integer.valueOf(collection2.size()) : null) + " cards");
        }
    }

    /* JADX WARN: Type inference failed for: r8v5, types: [ps2.i] */
    /* JADX WARN: Type inference failed for: r8v6, types: [ps2.i] */
    public n(hs2.a aVar, hs2.d dVar, long j8, zi2.a aVar2, t tVar, Handler handler) {
        aVar.getClass();
        dVar.getClass();
        aVar2.getClass();
        tVar.getClass();
        handler.getClass();
        this.f140498a = aVar;
        this.f140499b = dVar;
        this.f140500c = j8;
        this.f140501d = aVar2;
        this.f140502e = tVar;
        this.f140503f = handler;
        String strE = org.apache.commons.lang3.e.e(dVar.getF99647a(), "PAY#CORE#DeviceWallet:");
        int i14 = gt2.c.f79010a;
        this.f140504g = gt2.b.f79005a.i(strE);
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        this.f140505h = executorServiceNewSingleThreadExecutor;
        this.f140506i = new AtomicReference<>();
        js2.b bVar = new js2.b(j8, aVar2);
        this.f140507j = bVar;
        this.f140508k = new HashMap();
        this.f140509l = new LinkedHashMap();
        this.f140510m = new CopyOnWriteArraySet();
        this.f140511n = this.f140498a.getUnitId();
        this.f140512o = this.f140498a.getMacAddress();
        js2.d.f100659h.getClass();
        this.f140513p = new js2.d(js2.e.UNKNOWN, bVar, null, null, 12, null);
        Optional<hs2.c> optionalAbsent = Optional.absent();
        optionalAbsent.getClass();
        this.f140514q = optionalAbsent;
        k();
        final int i15 = 0;
        executorServiceNewSingleThreadExecutor.execute(new Runnable(this) { // from class: ps2.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ n f140486b;

            {
                this.f140486b = this;
            }

            @Override // java.lang.Runnable
            public final void run() throws InterruptedException {
                switch (i15) {
                    case 0:
                        n nVar = this.f140486b;
                        HashSet<ms2.d> hashSetC = nVar.c();
                        HashMap map = nVar.f140508k;
                        Logger logger = nVar.f140504g;
                        for (ms2.d dVar2 : hashSetC) {
                            map.put(dVar2.getF205815a(), dVar2);
                        }
                        CountDownLatch countDownLatch = new CountDownLatch(map.values().size());
                        logger.debug("Start " + map.values().size() + " provider init");
                        for (ms2.d dVar3 : map.values()) {
                            logger.debug("Start " + dVar3.getF205815a() + " provider init");
                            try {
                                dVar3.c(nVar.f140507j, new b(nVar, dVar3, countDownLatch, 0));
                            } catch (Exception e4) {
                                logger.error("Failed " + dVar3.getF205815a() + " provider init", (Throwable) e4);
                                countDownLatch.countDown();
                            }
                        }
                        logger.debug("Waiting for all providers initialize");
                        countDownLatch.await();
                        logger.debug("Finished all providers initialize");
                        nVar.f140506i.set(hs2.b.DISCONNECTED);
                        break;
                    case 1:
                        n nVar2 = this.f140486b;
                        long j14 = nVar2.f140500c;
                        hs2.d dVar4 = nVar2.f140499b;
                        long j15 = nVar2.f140511n;
                        zi2.a aVar3 = nVar2.f140501d;
                        HashMap map2 = nVar2.f140508k;
                        Logger logger2 = nVar2.f140504g;
                        if (j14 < 0) {
                            logger2.error("Invalid wallet userId! Keep device disconnected for security.");
                            nVar2.o(hs2.b.DISCONNECTED);
                        } else {
                            nVar2.o(hs2.b.CONNECTING);
                            CountDownLatch countDownLatch2 = new CountDownLatch(map2.values().size());
                            js2.d dVarC = nVar2.b().c();
                            js2.b bVar2 = dVarC.f100661b;
                            js2.e eVar = dVarC.f100660a;
                            js2.c cVar = dVarC.f100662c;
                            js2.c cVar2 = js2.c.FAILED_TO_GET_OWNER_DATA;
                            boolean z14 = cVar == cVar2;
                            String strName = aVar3.name();
                            Long lValueOf = bVar2 != null ? Long.valueOf(bVar2.f100652a) : null;
                            zi2.a aVar4 = bVar2 != null ? bVar2.f100653b : null;
                            String strName2 = cVar.name();
                            StringBuilder sbK = com.airbnb.lottie.animation.keyframe.a.k(j14, "deviceConnectingRunnable -> checkPasscodeDataMatch complete: userId ", ", env ", strName);
                            sbK.append(", ownerData : userId ");
                            sbK.append(lValueOf);
                            sbK.append(", serverenv ");
                            sbK.append(aVar4);
                            sbK.append(", ownerDataState: ");
                            sbK.append(strName2);
                            logger2.debug(sbK.toString());
                            js2.c cVar3 = js2.c.OWNER_DATA_NOT_SET;
                            if (cVar == cVar3 && p13.x.k(js2.e.NO_PASSCODE_SET, js2.e.NOT_APPLICABLE).contains(eVar)) {
                                logger2.debug("No passcode data detected for device " + j15 + ", notifying providers");
                                try {
                                    nVar2.d();
                                    nVar2.e();
                                } catch (Exception e14) {
                                    logger2.error("Deleting cached or cloud data failed", (Throwable) e14);
                                }
                                nVar2.l(countDownLatch2);
                                break;
                            } else if (cVar != js2.c.OWNER_DATA_SET) {
                                if (cVar == cVar2 || eVar == js2.e.UNKNOWN) {
                                    logger2.error(com.airbnb.lottie.animation.keyframe.a.e("is passcode check successful: ", " is ownerDataCheck successful: ", ", can not continue... ", dVarC.f100665f != null, !z14));
                                    while (countDownLatch2.getCount() > 0) {
                                        countDownLatch2.countDown();
                                    }
                                    nVar2.o(hs2.b.DISCONNECTED);
                                } else if (cVar == cVar3 && eVar == js2.e.PASSCODE_SET) {
                                    logger2.error("Unexpected owner/passcode state here. For not resetting wallet in this case, can not continue...");
                                    nVar2.o(hs2.b.DISCONNECTED);
                                } else {
                                    logger2.error("PasscodeState " + dVarC + " is not expected here. See checkPasscodeDataMatch().");
                                    nVar2.o(hs2.b.DISCONNECTED);
                                }
                                break;
                            } else if (bVar2 != null && bVar2.f100652a == j14 && bVar2.f100653b == aVar3) {
                                nVar2.l(countDownLatch2);
                            } else {
                                logger2.debug("Owner data mismatch for device " + j15 + ", resetting device");
                                try {
                                    nVar2.n().e();
                                    nVar2.l(countDownLatch2);
                                } catch (Exception e15) {
                                    nVar2.o(hs2.b.DISCONNECTED);
                                    logger2.error("Owner data mismatch device reset failed", (Throwable) e15);
                                }
                            }
                            countDownLatch2.await();
                            nVar2.o(hs2.b.READY);
                            nVar2.a().j(l13.a.f108328c).h(new d(new c(nVar2, 4), 7), new d(new c(nVar2, 5), 8));
                            if (dVar4.s()) {
                                logger2.debug("Notifying providers of deviceWalletReady");
                                Iterator it = map2.values().iterator();
                                while (it.hasNext()) {
                                    ((ms2.d) it.next()).e();
                                }
                                Iterator it3 = h0.O0(nVar2.f140498a.i(), map2.keySet()).iterator();
                                while (it3.hasNext()) {
                                    ms2.g gVarA = w.f140538a.a((is2.b) it3.next());
                                    if (gVarA != null) {
                                        gVarA.g(dVar4.getF99647a());
                                    }
                                }
                            } else {
                                logger2.debug("Device connection lost");
                            }
                        }
                        break;
                    default:
                        hs2.b bVar3 = hs2.b.DISCONNECTED;
                        n nVar3 = this.f140486b;
                        nVar3.o(bVar3);
                        HashMap map3 = nVar3.f140508k;
                        CountDownLatch countDownLatch3 = new CountDownLatch(map3.values().size());
                        nVar3.f140504g.debug("Start disconnecting " + map3.values().size() + " providers");
                        for (ms2.d dVar5 : map3.values()) {
                            dVar5.h(new b(nVar3, dVar5, countDownLatch3, 3));
                        }
                        countDownLatch3.await();
                        break;
                }
            }
        });
        final int i16 = 1;
        this.f140515r = new Runnable(this) { // from class: ps2.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ n f140486b;

            {
                this.f140486b = this;
            }

            @Override // java.lang.Runnable
            public final void run() throws InterruptedException {
                switch (i16) {
                    case 0:
                        n nVar = this.f140486b;
                        HashSet<ms2.d> hashSetC = nVar.c();
                        HashMap map = nVar.f140508k;
                        Logger logger = nVar.f140504g;
                        for (ms2.d dVar2 : hashSetC) {
                            map.put(dVar2.getF205815a(), dVar2);
                        }
                        CountDownLatch countDownLatch = new CountDownLatch(map.values().size());
                        logger.debug("Start " + map.values().size() + " provider init");
                        for (ms2.d dVar3 : map.values()) {
                            logger.debug("Start " + dVar3.getF205815a() + " provider init");
                            try {
                                dVar3.c(nVar.f140507j, new b(nVar, dVar3, countDownLatch, 0));
                            } catch (Exception e4) {
                                logger.error("Failed " + dVar3.getF205815a() + " provider init", (Throwable) e4);
                                countDownLatch.countDown();
                            }
                        }
                        logger.debug("Waiting for all providers initialize");
                        countDownLatch.await();
                        logger.debug("Finished all providers initialize");
                        nVar.f140506i.set(hs2.b.DISCONNECTED);
                        break;
                    case 1:
                        n nVar2 = this.f140486b;
                        long j14 = nVar2.f140500c;
                        hs2.d dVar4 = nVar2.f140499b;
                        long j15 = nVar2.f140511n;
                        zi2.a aVar3 = nVar2.f140501d;
                        HashMap map2 = nVar2.f140508k;
                        Logger logger2 = nVar2.f140504g;
                        if (j14 < 0) {
                            logger2.error("Invalid wallet userId! Keep device disconnected for security.");
                            nVar2.o(hs2.b.DISCONNECTED);
                        } else {
                            nVar2.o(hs2.b.CONNECTING);
                            CountDownLatch countDownLatch2 = new CountDownLatch(map2.values().size());
                            js2.d dVarC = nVar2.b().c();
                            js2.b bVar2 = dVarC.f100661b;
                            js2.e eVar = dVarC.f100660a;
                            js2.c cVar = dVarC.f100662c;
                            js2.c cVar2 = js2.c.FAILED_TO_GET_OWNER_DATA;
                            boolean z14 = cVar == cVar2;
                            String strName = aVar3.name();
                            Long lValueOf = bVar2 != null ? Long.valueOf(bVar2.f100652a) : null;
                            zi2.a aVar4 = bVar2 != null ? bVar2.f100653b : null;
                            String strName2 = cVar.name();
                            StringBuilder sbK = com.airbnb.lottie.animation.keyframe.a.k(j14, "deviceConnectingRunnable -> checkPasscodeDataMatch complete: userId ", ", env ", strName);
                            sbK.append(", ownerData : userId ");
                            sbK.append(lValueOf);
                            sbK.append(", serverenv ");
                            sbK.append(aVar4);
                            sbK.append(", ownerDataState: ");
                            sbK.append(strName2);
                            logger2.debug(sbK.toString());
                            js2.c cVar3 = js2.c.OWNER_DATA_NOT_SET;
                            if (cVar == cVar3 && p13.x.k(js2.e.NO_PASSCODE_SET, js2.e.NOT_APPLICABLE).contains(eVar)) {
                                logger2.debug("No passcode data detected for device " + j15 + ", notifying providers");
                                try {
                                    nVar2.d();
                                    nVar2.e();
                                } catch (Exception e14) {
                                    logger2.error("Deleting cached or cloud data failed", (Throwable) e14);
                                }
                                nVar2.l(countDownLatch2);
                                break;
                            } else if (cVar != js2.c.OWNER_DATA_SET) {
                                if (cVar == cVar2 || eVar == js2.e.UNKNOWN) {
                                    logger2.error(com.airbnb.lottie.animation.keyframe.a.e("is passcode check successful: ", " is ownerDataCheck successful: ", ", can not continue... ", dVarC.f100665f != null, !z14));
                                    while (countDownLatch2.getCount() > 0) {
                                        countDownLatch2.countDown();
                                    }
                                    nVar2.o(hs2.b.DISCONNECTED);
                                } else if (cVar == cVar3 && eVar == js2.e.PASSCODE_SET) {
                                    logger2.error("Unexpected owner/passcode state here. For not resetting wallet in this case, can not continue...");
                                    nVar2.o(hs2.b.DISCONNECTED);
                                } else {
                                    logger2.error("PasscodeState " + dVarC + " is not expected here. See checkPasscodeDataMatch().");
                                    nVar2.o(hs2.b.DISCONNECTED);
                                }
                                break;
                            } else if (bVar2 != null && bVar2.f100652a == j14 && bVar2.f100653b == aVar3) {
                                nVar2.l(countDownLatch2);
                            } else {
                                logger2.debug("Owner data mismatch for device " + j15 + ", resetting device");
                                try {
                                    nVar2.n().e();
                                    nVar2.l(countDownLatch2);
                                } catch (Exception e15) {
                                    nVar2.o(hs2.b.DISCONNECTED);
                                    logger2.error("Owner data mismatch device reset failed", (Throwable) e15);
                                }
                            }
                            countDownLatch2.await();
                            nVar2.o(hs2.b.READY);
                            nVar2.a().j(l13.a.f108328c).h(new d(new c(nVar2, 4), 7), new d(new c(nVar2, 5), 8));
                            if (dVar4.s()) {
                                logger2.debug("Notifying providers of deviceWalletReady");
                                Iterator it = map2.values().iterator();
                                while (it.hasNext()) {
                                    ((ms2.d) it.next()).e();
                                }
                                Iterator it3 = h0.O0(nVar2.f140498a.i(), map2.keySet()).iterator();
                                while (it3.hasNext()) {
                                    ms2.g gVarA = w.f140538a.a((is2.b) it3.next());
                                    if (gVarA != null) {
                                        gVarA.g(dVar4.getF99647a());
                                    }
                                }
                            } else {
                                logger2.debug("Device connection lost");
                            }
                        }
                        break;
                    default:
                        hs2.b bVar3 = hs2.b.DISCONNECTED;
                        n nVar3 = this.f140486b;
                        nVar3.o(bVar3);
                        HashMap map3 = nVar3.f140508k;
                        CountDownLatch countDownLatch3 = new CountDownLatch(map3.values().size());
                        nVar3.f140504g.debug("Start disconnecting " + map3.values().size() + " providers");
                        for (ms2.d dVar5 : map3.values()) {
                            dVar5.h(new b(nVar3, dVar5, countDownLatch3, 3));
                        }
                        countDownLatch3.await();
                        break;
                }
            }
        };
        final int i17 = 2;
        this.f140516s = new Runnable(this) { // from class: ps2.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ n f140486b;

            {
                this.f140486b = this;
            }

            @Override // java.lang.Runnable
            public final void run() throws InterruptedException {
                switch (i17) {
                    case 0:
                        n nVar = this.f140486b;
                        HashSet<ms2.d> hashSetC = nVar.c();
                        HashMap map = nVar.f140508k;
                        Logger logger = nVar.f140504g;
                        for (ms2.d dVar2 : hashSetC) {
                            map.put(dVar2.getF205815a(), dVar2);
                        }
                        CountDownLatch countDownLatch = new CountDownLatch(map.values().size());
                        logger.debug("Start " + map.values().size() + " provider init");
                        for (ms2.d dVar3 : map.values()) {
                            logger.debug("Start " + dVar3.getF205815a() + " provider init");
                            try {
                                dVar3.c(nVar.f140507j, new b(nVar, dVar3, countDownLatch, 0));
                            } catch (Exception e4) {
                                logger.error("Failed " + dVar3.getF205815a() + " provider init", (Throwable) e4);
                                countDownLatch.countDown();
                            }
                        }
                        logger.debug("Waiting for all providers initialize");
                        countDownLatch.await();
                        logger.debug("Finished all providers initialize");
                        nVar.f140506i.set(hs2.b.DISCONNECTED);
                        break;
                    case 1:
                        n nVar2 = this.f140486b;
                        long j14 = nVar2.f140500c;
                        hs2.d dVar4 = nVar2.f140499b;
                        long j15 = nVar2.f140511n;
                        zi2.a aVar3 = nVar2.f140501d;
                        HashMap map2 = nVar2.f140508k;
                        Logger logger2 = nVar2.f140504g;
                        if (j14 < 0) {
                            logger2.error("Invalid wallet userId! Keep device disconnected for security.");
                            nVar2.o(hs2.b.DISCONNECTED);
                        } else {
                            nVar2.o(hs2.b.CONNECTING);
                            CountDownLatch countDownLatch2 = new CountDownLatch(map2.values().size());
                            js2.d dVarC = nVar2.b().c();
                            js2.b bVar2 = dVarC.f100661b;
                            js2.e eVar = dVarC.f100660a;
                            js2.c cVar = dVarC.f100662c;
                            js2.c cVar2 = js2.c.FAILED_TO_GET_OWNER_DATA;
                            boolean z14 = cVar == cVar2;
                            String strName = aVar3.name();
                            Long lValueOf = bVar2 != null ? Long.valueOf(bVar2.f100652a) : null;
                            zi2.a aVar4 = bVar2 != null ? bVar2.f100653b : null;
                            String strName2 = cVar.name();
                            StringBuilder sbK = com.airbnb.lottie.animation.keyframe.a.k(j14, "deviceConnectingRunnable -> checkPasscodeDataMatch complete: userId ", ", env ", strName);
                            sbK.append(", ownerData : userId ");
                            sbK.append(lValueOf);
                            sbK.append(", serverenv ");
                            sbK.append(aVar4);
                            sbK.append(", ownerDataState: ");
                            sbK.append(strName2);
                            logger2.debug(sbK.toString());
                            js2.c cVar3 = js2.c.OWNER_DATA_NOT_SET;
                            if (cVar == cVar3 && p13.x.k(js2.e.NO_PASSCODE_SET, js2.e.NOT_APPLICABLE).contains(eVar)) {
                                logger2.debug("No passcode data detected for device " + j15 + ", notifying providers");
                                try {
                                    nVar2.d();
                                    nVar2.e();
                                } catch (Exception e14) {
                                    logger2.error("Deleting cached or cloud data failed", (Throwable) e14);
                                }
                                nVar2.l(countDownLatch2);
                                break;
                            } else if (cVar != js2.c.OWNER_DATA_SET) {
                                if (cVar == cVar2 || eVar == js2.e.UNKNOWN) {
                                    logger2.error(com.airbnb.lottie.animation.keyframe.a.e("is passcode check successful: ", " is ownerDataCheck successful: ", ", can not continue... ", dVarC.f100665f != null, !z14));
                                    while (countDownLatch2.getCount() > 0) {
                                        countDownLatch2.countDown();
                                    }
                                    nVar2.o(hs2.b.DISCONNECTED);
                                } else if (cVar == cVar3 && eVar == js2.e.PASSCODE_SET) {
                                    logger2.error("Unexpected owner/passcode state here. For not resetting wallet in this case, can not continue...");
                                    nVar2.o(hs2.b.DISCONNECTED);
                                } else {
                                    logger2.error("PasscodeState " + dVarC + " is not expected here. See checkPasscodeDataMatch().");
                                    nVar2.o(hs2.b.DISCONNECTED);
                                }
                                break;
                            } else if (bVar2 != null && bVar2.f100652a == j14 && bVar2.f100653b == aVar3) {
                                nVar2.l(countDownLatch2);
                            } else {
                                logger2.debug("Owner data mismatch for device " + j15 + ", resetting device");
                                try {
                                    nVar2.n().e();
                                    nVar2.l(countDownLatch2);
                                } catch (Exception e15) {
                                    nVar2.o(hs2.b.DISCONNECTED);
                                    logger2.error("Owner data mismatch device reset failed", (Throwable) e15);
                                }
                            }
                            countDownLatch2.await();
                            nVar2.o(hs2.b.READY);
                            nVar2.a().j(l13.a.f108328c).h(new d(new c(nVar2, 4), 7), new d(new c(nVar2, 5), 8));
                            if (dVar4.s()) {
                                logger2.debug("Notifying providers of deviceWalletReady");
                                Iterator it = map2.values().iterator();
                                while (it.hasNext()) {
                                    ((ms2.d) it.next()).e();
                                }
                                Iterator it3 = h0.O0(nVar2.f140498a.i(), map2.keySet()).iterator();
                                while (it3.hasNext()) {
                                    ms2.g gVarA = w.f140538a.a((is2.b) it3.next());
                                    if (gVarA != null) {
                                        gVarA.g(dVar4.getF99647a());
                                    }
                                }
                            } else {
                                logger2.debug("Device connection lost");
                            }
                        }
                        break;
                    default:
                        hs2.b bVar3 = hs2.b.DISCONNECTED;
                        n nVar3 = this.f140486b;
                        nVar3.o(bVar3);
                        HashMap map3 = nVar3.f140508k;
                        CountDownLatch countDownLatch3 = new CountDownLatch(map3.values().size());
                        nVar3.f140504g.debug("Start disconnecting " + map3.values().size() + " providers");
                        for (ms2.d dVar5 : map3.values()) {
                            dVar5.h(new b(nVar3, dVar5, countDownLatch3, 3));
                        }
                        countDownLatch3.await();
                        break;
                }
            }
        };
    }

    public final e13.b a() {
        g gVar = new g(this, 0);
        int i14 = w03.b.f181178a;
        return new e13.b(gVar);
    }

    public final q03.r<js2.d> b() {
        if (this.f140499b.q() == hs2.g.DISCONNECTED) {
            return q03.r.f(this.f140513p);
        }
        e eVar = new e(this, 0);
        int i14 = w03.b.f181178a;
        return new e13.a(eVar);
    }

    public final HashSet c() {
        ms2.g gVarA;
        hs2.d dVar = this.f140499b;
        HashSet hashSet = new HashSet();
        for (is2.b bVar : this.f140498a.i()) {
            if (this.f140508k.get(bVar) == null && (gVarA = this.f140502e.a(bVar)) != null && gVarA.h(this.f140498a)) {
                try {
                    hashSet.add(gVarA.c(dVar, this.f140498a));
                } catch (Exception unused) {
                    this.f140504g.error("createNewServiceProviders: failed to create device service provider for type " + gVarA.getF133320a() + " device " + dVar.getF99647a());
                }
            }
        }
        return hashSet;
    }

    public final void d() {
        Iterator it = this.f140508k.values().iterator();
        while (it.hasNext()) {
            ((ms2.d) it.next()).g();
        }
    }

    public final void e() {
        for (ms2.d dVar : this.f140508k.values()) {
            try {
                dVar.l();
            } catch (Exception e4) {
                this.f140504g.error("Failed cloud delete for " + dVar.getF205815a(), (Throwable) e4);
            }
        }
    }

    public final void f(w.a aVar) {
        aVar.getClass();
        d();
        Iterator it = this.f140508k.values().iterator();
        while (it.hasNext()) {
            ((ms2.d) it.next()).j(aVar);
        }
    }

    public final ms2.d g(is2.b bVar) {
        if (bVar == null) {
            return null;
        }
        return (ms2.d) this.f140508k.get(bVar);
    }

    public final hs2.b h() {
        hs2.b bVar = this.f140506i.get();
        if (bVar != null) {
            return bVar;
        }
        this.f140504g.error("Status is null. Return default value DISCONNECTED");
        return hs2.b.DISCONNECTED;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0061  */
    /* JADX WARN: Code duplicated, block: B:19:0x007e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x007f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x007f -> B:21:0x0080). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object i(t13.d<? super ns2.a<? extends ms2.e>> r12) {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ps2.n.i(t13.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0050 A[PHI: r5
      0x0050: PHI (r5v4 ms2.e) = (r5v0 ms2.e), (r5v5 ms2.e) binds: [B:15:0x003f, B:20:0x004e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object j(ms2.e eVar, v13.c cVar) {
        o oVar;
        ns2.a aVarQ;
        if (cVar instanceof o) {
            oVar = (o) cVar;
            int i14 = oVar.f140531d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                oVar.f140531d = i14 - Integer.MIN_VALUE;
            } else {
                oVar = new o(this, cVar);
            }
        } else {
            oVar = new o(this, cVar);
        }
        Object objB = oVar.f140529b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = oVar.f140531d;
        if (i15 == 0) {
            o13.r.b(objB);
            ms2.c cVar2 = (ms2.c) this.f140509l.get(eVar.getF205851b());
            if (cVar2 != null) {
                oVar.f140528a = eVar;
                oVar.f140531d = 1;
                objB = cVar2.b(eVar, oVar);
                if (objB == aVar) {
                    return aVar;
                }
            } else {
                aVarQ = gg.b.q(false);
            }
            this.f140504g.trace("getProducts for " + eVar + ": " + aVarQ);
            return aVarQ;
        }
        if (i15 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        eVar = oVar.f140528a;
        o13.r.b(objB);
        aVarQ = (ns2.a) objB;
        if (aVarQ == null) {
            aVarQ = gg.b.q(false);
        }
        this.f140504g.trace("getProducts for " + eVar + ": " + aVarQ);
        return aVarQ;
    }

    public final void k() {
        ms2.c cVarC;
        Set<is2.b> setI = this.f140498a.i();
        ArrayList arrayList = new ArrayList();
        for (is2.b bVar : setI) {
            ms2.i iVar = ms2.i.f120498a;
            Set<pl2.c> setB = this.f140498a.getNfcInfo().b();
            iVar.getClass();
            bVar.getClass();
            setB.getClass();
            ConcurrentHashMap<is2.b, ms2.h> concurrentHashMap = ms2.i.f120499b;
            ms2.h hVar = concurrentHashMap.get(bVar);
            if (hVar == null ? false : hVar.b(setB)) {
                ms2.h hVar2 = concurrentHashMap.get(bVar);
                hVar2.getClass();
                cVarC = hVar2.c(setB);
                if (cVarC.getF205738a() != bVar) {
                    vb.h.s("IServiceProviderCreator created provider with unexpected type");
                    return;
                }
            } else {
                cVarC = null;
            }
            o13.p pVar = cVarC != null ? new o13.p(bVar, cVarC) : null;
            if (pVar != null) {
                arrayList.add(pVar);
            }
        }
        LinkedHashMap linkedHashMap = this.f140509l;
        linkedHashMap.getClass();
        u0.j(linkedHashMap, arrayList);
    }

    public final void l(CountDownLatch countDownLatch) {
        Logger logger = this.f140504g;
        logger.debug("refreshDeviceCardsOnConnection");
        ListenableFuture listenableFutureB = this.f140499b.B(p13.w.c(com.garmin.device.nfc.h.b.f50886c), false);
        if (listenableFutureB != null) {
            Futures.addCallback(listenableFutureB, new c(), this.f140505h);
        }
        HashMap map = this.f140508k;
        logger.debug("Start connecting " + map.values().size() + " providers");
        for (ms2.d dVar : map.values()) {
            dVar.d(this.f140498a, this.f140513p.f100661b, new ps2.b(this, dVar, countDownLatch, 1));
        }
    }

    public final void m(r rVar) {
        rVar.getClass();
        if (this.f140510m.add(rVar)) {
            return;
        }
        this.f140504g.trace("Listener already added for wallet " + this.f140511n);
    }

    public final z03.a n() {
        int i14 = 1;
        g gVar = new g(this, i14);
        int i15 = w03.b.f181178a;
        return new z03.d(gVar).d(new z03.c(new e(this, i14))).d(new z03.j(new e13.o(b(), new d(new ps2.c(this, i14), 2))));
    }

    public final void o(hs2.b bVar) {
        if (this.f140506i.getAndSet(bVar) != bVar) {
            this.f140504g.debug("Update wallet status: " + bVar);
            Iterator it = this.f140510m.iterator();
            while (it.hasNext()) {
                this.f140503f.post(new l0.e(23, (r) it.next(), bVar));
            }
        }
    }

    public final z03.d p(byte[] bArr, String str, float f14) {
        str.getClass();
        ps2.a aVar = new ps2.a(this, str, bArr, f14);
        int i14 = w03.b.f181178a;
        return new z03.d(aVar);
    }

    public final void q(r rVar) {
        if (this.f140510m.remove(rVar)) {
            return;
        }
        this.f140504g.trace("Listener already removed for wallet " + this.f140511n);
    }

    public final void r(hs2.b bVar, hs2.a aVar) {
        bVar.getClass();
        if (bVar == hs2.b.READY) {
            com.google.firebase.messaging.l.j(bVar, "Attempted to set unsupported status: ");
            return;
        }
        Logger logger = this.f140504g;
        logger.debug("update(" + bVar + ")");
        int i14 = a.f140518b[bVar.ordinal()];
        hs2.d dVar = this.f140499b;
        ExecutorService executorService = this.f140505h;
        if (i14 == 1) {
            dVar.G(false);
            executorService.execute(this.f140516s);
        } else {
            if (i14 != 2) {
                logger.error("Unexpected status update");
                return;
            }
            dVar.G(true);
            if (aVar != null) {
                executorService.execute(new l0.e(24, this, aVar));
            }
            executorService.execute(this.f140515r);
        }
    }

    public /* synthetic */ n(hs2.a aVar, hs2.d dVar, long j8, zi2.a aVar2, t tVar, Handler handler, int i14, p005kotlin.jvm.internal.j jVar) {
        this(aVar, dVar, j8, aVar2, (i14 & 16) != 0 ? w.f140538a : tVar, (i14 & 32) != 0 ? new Handler(Looper.getMainLooper()) : handler);
    }
}
