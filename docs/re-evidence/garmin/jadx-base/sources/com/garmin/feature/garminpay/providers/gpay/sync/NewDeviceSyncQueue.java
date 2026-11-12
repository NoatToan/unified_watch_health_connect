package com.garmin.feature.garminpay.providers.gpay.sync;

import androidx.media3.exoplayer.n;
import ch.qos.logback.core.spi.AbstractComponentTracker;
import com.garmin.feature.garminpay.providers.gpay.NewFitPayException;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.ListeningScheduledExecutorService;
import fo2.s;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.CoroutineExceptionHandler;
import o13.q;
import o13.r;
import o53.c0;
import o53.j2;
import o53.k;
import o53.s0;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.m0;
import p13.u;
import p13.x;
import ps2.w;
import t13.g;
import u62.z;
import v.e0;
import vb.h;
import vn2.b1;
import vo2.i;
import vo2.j;
import vo2.m;
import vo2.o;
import vo2.p;
import vo2.y;
import xo2.f;
import zn2.g1;
import zn2.l;
import zn2.t;
import zn2.v;
import zn2.z0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u00002\u00020\u0001:\u0002\f\rB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/garmin/feature/garminpay/providers/gpay/sync/NewDeviceSyncQueue;", "", "Lzn2/l;", "deviceDataManager", "Lhs2/d;", "payDevice", "Lzn2/t;", "deviceServiceProvider", "Lhs2/a;", "deviceWalletMetadata", "<init>", "(Lzn2/l;Lhs2/d;Lzn2/t;Lhs2/a;)V", "a", "ApduPackageException", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class NewDeviceSyncQueue {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final List<y> f51325l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final List<y> f51326m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f51327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hs2.d f51328b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f51329c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final hs2.a f51330d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Logger f51331e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LinkedBlockingDeque f51332f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LinkedBlockingDeque f51333g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicReference<ul2.c> f51334h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final u53.d f51335i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final z53.b f51336j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f51337k;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/garmin/feature/garminpay/providers/gpay/sync/NewDeviceSyncQueue$ApduPackageException;", "Lcom/garmin/feature/garminpay/providers/gpay/NewFitPayException;", "", "message", "Lxo2/d$b;", "stateFlag", "<init>", "(Ljava/lang/String;Lxo2/d$b;)V", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "Lxo2/d$b;", "getStateFlag", "()Lxo2/d$b;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class ApduPackageException extends NewFitPayException {
        public static final int $stable = 8;
        private final String message;
        private final xo2.d.b stateFlag;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ApduPackageException(String str, xo2.d.b bVar) {
            super(str, null, null, 6, null);
            str.getClass();
            bVar.getClass();
            this.message = str;
            this.stateFlag = bVar;
        }

        @Override // com.garmin.feature.garminpay.providers.gpay.NewFitPayException, java.lang.Throwable
        public String getMessage() {
            return this.message;
        }

        public final xo2.d.b getStateFlag() {
            return this.stateFlag;
        }
    }

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f51338a;

        static {
            int[] iArr = new int[y.values().length];
            try {
                iArr[y.CREDITCARD_PROVISION_SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[y.CREDITCARD_ACTIVATED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[y.CREDITCARD_REACTIVATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[y.CREDITCARD_DEACTIVATED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[y.CREDITCARD_DELETED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[y.CREDITCARD_METADATA_UPDATED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f51338a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"com/garmin/feature/garminpay/providers/gpay/sync/NewDeviceSyncQueue$c", "Lt13/a;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c extends t13.a implements CoroutineExceptionHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ NewDeviceSyncQueue f51339a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(CoroutineExceptionHandler.a aVar, NewDeviceSyncQueue newDeviceSyncQueue) {
            super(aVar);
            this.f51339a = newDeviceSyncQueue;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public final void L(Throwable th3, g gVar) {
            this.f51339a.f51331e.error("Exception happens in coroutines", th3);
        }
    }

    static {
        new a(null);
        f51325l = x.k(y.CREDITCARD_CREATED, y.CREDITCARD_ACTIVATED, y.CREDITCARD_DEACTIVATED, y.CREDITCARD_REACTIVATED, y.CREDITCARD_DELETED, y.RESET_DEFAULT_CREDITCARD, y.SET_DEFAULT_CREDITCARD, y.CREDITCARD_METADATA_UPDATED, y.CREDITCARD_PROVISION_FAILED, y.CREDITCARD_PROVISION_SUCCESS);
        f51326m = x.k(y.CREDENTIAL_CREATED, y.CREDENTIAL_ACTIVATED, y.CREDENTIAL_DELETED, y.CREDENTIAL_DELETE_FAILED, y.CREDENTIAL_METADATA_UPDATED);
    }

    public NewDeviceSyncQueue(l lVar, hs2.d dVar, t tVar, hs2.a aVar) {
        lVar.getClass();
        dVar.getClass();
        tVar.getClass();
        aVar.getClass();
        this.f51327a = lVar;
        this.f51328b = dVar;
        this.f51329c = tVar;
        this.f51330d = aVar;
        String strN = fb1.c.n("PAY#NEW_FITPAY#NewDeviceSyncQueue: ", lVar.f205629a.f73101a);
        int i14 = gt2.c.f79010a;
        this.f51331e = gt2.b.f79005a.h(strN);
        this.f51332f = new LinkedBlockingDeque(100);
        this.f51333g = new LinkedBlockingDeque();
        this.f51334h = new AtomicReference<>(null);
        this.f51335i = c0.h(c0.h(c0.a(s0.f129406a), ge1.b.h()), new c(CoroutineExceptionHandler.f105965e0, this));
        this.f51336j = z53.c.a();
        new AtomicBoolean(false);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:32:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:34:0x0122  */
    /* JADX WARN: Code duplicated, block: B:35:0x0133  */
    /* JADX WARN: Code duplicated, block: B:44:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:47:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:7:0x001c  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0093, code lost:
    
        if (r2 == r4) goto L49;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:30:0x00d1, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [u13.a] */
    /* JADX WARN: Type inference failed for: r4v3, types: [yo2.a] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(NewDeviceSyncQueue newDeviceSyncQueue, xo2.g gVar, yo2.a aVar, v13.c cVar) throws Throwable {
        p pVar;
        String creditCardId;
        UUID uuidFromString;
        yo2.a aVar2;
        yo2.b bVar;
        NewFitPayCreditCardSync newFitPayCreditCardSync;
        Logger logger;
        hs2.d dVar;
        long f99647a;
        ListeningScheduledExecutorService listeningScheduledExecutorService;
        ListenableFuture listenableFutureE;
        ListenableFuture listenableFutureTransform;
        Object bVar2;
        Object objP;
        xo2.g gVar2 = gVar;
        newDeviceSyncQueue.getClass();
        if (cVar instanceof p) {
            pVar = (p) cVar;
            int i14 = pVar.f179198f;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                pVar.f179198f = i14 - Integer.MIN_VALUE;
            } else {
                pVar = new p(newDeviceSyncQueue, cVar);
            }
        } else {
            pVar = new p(newDeviceSyncQueue, cVar);
        }
        Object objA = pVar.f179196d;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = pVar.f179198f;
        int i16 = 2;
        try {
            if (i15 != 0) {
                if (i15 == 1) {
                    UUID uuid = pVar.f179195c;
                    yo2.a aVar3 = pVar.f179194b;
                    xo2.g gVar3 = pVar.f179193a;
                    r.b(objA);
                    aVar2 = aVar3;
                    uuidFromString = uuid;
                    gVar2 = gVar3;
                } else {
                    if (i15 != 2) {
                        h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    yo2.a aVar4 = pVar.f179194b;
                    r.b(objA);
                    obj = aVar4;
                }
                obj.e(yo2.a.EnumC3717a.SUCCESS);
                return obj;
            }
            r.b(objA);
            newDeviceSyncQueue.f51331e.debug("synchronizeCards");
            f fVar = gVar2.f191813g;
            if (fVar == null || (creditCardId = fVar.getCreditCardId()) == null) {
                throw new NewFitPayCreditCardSync.CreditCardSyncException("credit card id is missing or empty from the payload", yo2.a.b.MISSING_CREDITCARD_ID);
            }
            uuidFromString = UUID.fromString(creditCardId);
            ms2.g gVarA = w.f140538a.a(is2.b.FITPAY);
            gVarA.getClass();
            z0 z0Var = (z0) gVarA;
            if (gVar2.f191808b == y.CREDITCARD_DELETED) {
                aVar2 = aVar;
                bVar = null;
                xo2.g gVar4 = gVar2;
                o13.p pVar2 = new o13.p(uuidFromString, bVar);
                newFitPayCreditCardSync = new NewFitPayCreditCardSync(newDeviceSyncQueue.f51329c, false);
                pVar.f179193a = null;
                pVar.f179194b = aVar2;
                pVar.f179195c = null;
                pVar.f179198f = 2;
                k kVar = new k(u13.f.b(pVar), 1);
                kVar.q();
                logger = NewFitPayCreditCardSync.f51340f;
                logger.debug("syncCreditCard: calling requestWalletStateFromDevice()...");
                dVar = newFitPayCreditCardSync.f51341a.f205816b;
                f99647a = dVar.getF99647a();
                listeningScheduledExecutorService = newFitPayCreditCardSync.f51343c;
                if (f99647a <= 0) {
                    logger.warn("requestWalletStateFromDevice: invalid unit id [" + dVar.getF99647a() + "], nothing to do");
                    listenableFutureTransform = Futures.immediateFailedFuture(new NewFitPayCreditCardSync.CreditCardSyncException("Missing unit id", yo2.a.b.DEVICE_WALLET_TRANSFER_FAILED));
                    listenableFutureTransform.getClass();
                } else {
                    logger.debug("requestWalletStateFromDevice: calling 'requestDeviceCards'...");
                    listenableFutureE = dVar.E(u.m0(new String[]{qs2.a.f147378g.f147399d, qs2.a.f147380i.f147399d, qs2.a.f147381j.f147399d, qs2.a.f147379h.f147399d}), newFitPayCreditCardSync.f51342b);
                    if (listenableFutureE == null) {
                        listenableFutureTransform = Futures.immediateFailedFuture(new NewFitPayCreditCardSync.CreditCardSyncException("PayDevice failed to requestDeviceCards", yo2.a.b.UNABLE_TO_REQUEST_DEVICE_STATES));
                        listenableFutureTransform.getClass();
                    } else {
                        listenableFutureTransform = Futures.transform(Futures.withTimeout(listenableFutureE, 25L, TimeUnit.SECONDS, listeningScheduledExecutorService), new n(new b1(i16), 8), listeningScheduledExecutorService);
                        listenableFutureTransform.getClass();
                    }
                }
                ListenableFuture listenableFuture = listenableFutureTransform;
                logger.debug("syncCreditCard: requesting card image sizes from GC...");
                Future futureSubmit = listeningScheduledExecutorService.submit((Callable) new a73.h(newFitPayCreditCardSync, 13));
                futureSubmit.getClass();
                ListenableFuture listenableFuture2 = (ListenableFuture) futureSubmit;
                ListenableFuture listenableFutureCallAsync = Futures.whenAllComplete(listenableFuture, listenableFuture2).callAsync(new e(listenableFuture, newFitPayCreditCardSync, listenableFuture2, gVar4, pVar2), listeningScheduledExecutorService);
                listenableFutureCallAsync.addListener(new vo2.w(newFitPayCreditCardSync), listeningScheduledExecutorService);
                int i17 = q.f128596b;
                listenableFutureCallAsync.get();
                bVar2 = Unit.INSTANCE;
                kVar.resumeWith(bVar2);
                objP = kVar.p();
                if (objP != u13.a.COROUTINE_SUSPENDED) {
                    objP = Unit.INSTANCE;
                }
                if (objP != obj) {
                    obj = aVar2;
                    obj.e(yo2.a.EnumC3717a.SUCCESS);
                }
            } else {
                g1 g1Var = z0Var.f205979a;
                s sVar = newDeviceSyncQueue.f51327a.f205629a;
                pVar.f179193a = gVar2;
                aVar2 = aVar;
                pVar.f179194b = aVar2;
                pVar.f179195c = uuidFromString;
                pVar.f179198f = 1;
                ch.qos.logback.classic.Logger logger2 = g1.f205525n;
                objA = g1Var.A(creditCardId, sVar, false, pVar);
            }
            return obj;
            int i18 = q.f128596b;
            listenableFutureCallAsync.get();
            bVar2 = Unit.INSTANCE;
        } catch (Throwable th3) {
            int i19 = q.f128596b;
            bVar2 = new q.b(th3);
        }
        bVar = (yo2.b) objA;
        xo2.g gVar5 = gVar2;
        o13.p pVar3 = new o13.p(uuidFromString, bVar);
        newFitPayCreditCardSync = new NewFitPayCreditCardSync(newDeviceSyncQueue.f51329c, false);
        pVar.f179193a = null;
        pVar.f179194b = aVar2;
        pVar.f179195c = null;
        pVar.f179198f = 2;
        k kVar2 = new k(u13.f.b(pVar), 1);
        kVar2.q();
        logger = NewFitPayCreditCardSync.f51340f;
        logger.debug("syncCreditCard: calling requestWalletStateFromDevice()...");
        dVar = newFitPayCreditCardSync.f51341a.f205816b;
        f99647a = dVar.getF99647a();
        listeningScheduledExecutorService = newFitPayCreditCardSync.f51343c;
        if (f99647a <= 0) {
            logger.warn("requestWalletStateFromDevice: invalid unit id [" + dVar.getF99647a() + "], nothing to do");
            listenableFutureTransform = Futures.immediateFailedFuture(new NewFitPayCreditCardSync.CreditCardSyncException("Missing unit id", yo2.a.b.DEVICE_WALLET_TRANSFER_FAILED));
            listenableFutureTransform.getClass();
        } else {
            logger.debug("requestWalletStateFromDevice: calling 'requestDeviceCards'...");
            listenableFutureE = dVar.E(u.m0(new String[]{qs2.a.f147378g.f147399d, qs2.a.f147380i.f147399d, qs2.a.f147381j.f147399d, qs2.a.f147379h.f147399d}), newFitPayCreditCardSync.f51342b);
            if (listenableFutureE == null) {
                listenableFutureTransform = Futures.immediateFailedFuture(new NewFitPayCreditCardSync.CreditCardSyncException("PayDevice failed to requestDeviceCards", yo2.a.b.UNABLE_TO_REQUEST_DEVICE_STATES));
                listenableFutureTransform.getClass();
            } else {
                listenableFutureTransform = Futures.transform(Futures.withTimeout(listenableFutureE, 25L, TimeUnit.SECONDS, listeningScheduledExecutorService), new n(new b1(i16), 8), listeningScheduledExecutorService);
                listenableFutureTransform.getClass();
            }
        }
        ListenableFuture listenableFuture3 = listenableFutureTransform;
        logger.debug("syncCreditCard: requesting card image sizes from GC...");
        Future futureSubmit2 = listeningScheduledExecutorService.submit((Callable) new a73.h(newFitPayCreditCardSync, 13));
        futureSubmit2.getClass();
        ListenableFuture listenableFuture4 = (ListenableFuture) futureSubmit2;
        ListenableFuture listenableFutureCallAsync2 = Futures.whenAllComplete(listenableFuture3, listenableFuture4).callAsync(new e(listenableFuture3, newFitPayCreditCardSync, listenableFuture4, gVar5, pVar3), listeningScheduledExecutorService);
        listenableFutureCallAsync2.addListener(new vo2.w(newFitPayCreditCardSync), listeningScheduledExecutorService);
        kVar2.resumeWith(bVar2);
        objP = kVar2.p();
        if (objP != u13.a.COROUTINE_SUSPENDED) {
            objP = Unit.INSTANCE;
        }
        if (objP != obj) {
            obj = aVar2;
            obj.e(yo2.a.EnumC3717a.SUCCESS);
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0167  */
    /* JADX WARN: Code duplicated, block: B:48:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:52:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v6, types: [com.garmin.feature.garminpay.providers.gpay.sync.NewDeviceSyncQueue, java.lang.Object, java.util.List, kotlin.jvm.internal.r0, xo2.c] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x01c8 -> B:88:0x01cf). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static java.lang.Object e(com.garmin.feature.garminpay.providers.gpay.sync.NewDeviceSyncQueue r33, xo2.c r34, wo2.e r35, v13.c r36) {
        /*
            Method dump skipped, instruction units count: 793
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.garmin.feature.garminpay.providers.gpay.sync.NewDeviceSyncQueue.e(com.garmin.feature.garminpay.providers.gpay.sync.NewDeviceSyncQueue, xo2.c, wo2.e, v13.c):java.lang.Object");
    }

    public Object b(v vVar) {
        this.f51331e.info("Sync queue destroy");
        c0.c(this.f51335i, null);
        Object objO = o(vVar);
        return objO == u13.a.COROUTINE_SUSPENDED ? objO : Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0094, code lost:
    
        if (k(true, r0) == r1) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(v13.c cVar, wo2.e eVar, wo2.f fVar) {
        vo2.f fVar2;
        if (cVar instanceof vo2.f) {
            fVar2 = (vo2.f) cVar;
            int i14 = fVar2.f179133d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                fVar2.f179133d = i14 - Integer.MIN_VALUE;
            } else {
                fVar2 = new vo2.f(this, cVar);
            }
        } else {
            fVar2 = new vo2.f(this, cVar);
        }
        Object obj = fVar2.f179131b;
        Object obj2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = fVar2.f179133d;
        Logger logger = this.f51331e;
        if (i15 == 0) {
            r.b(obj);
            com.airbnb.lottie.animation.keyframe.a.w("endProcessSync: end process sync id: ", fVar.getF186515a(), logger);
            eVar.a();
            fVar2.f179130a = fVar;
            fVar2.f179133d = 1;
            if (this.f51327a.b(fVar2, eVar, fVar) != obj2) {
            }
            return obj2;
        }
        if (i15 == 1) {
            fVar = fVar2.f179130a;
            r.b(obj);
        } else {
            if (i15 != 2) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        return Unit.INSTANCE;
        LinkedBlockingDeque linkedBlockingDeque = this.f51332f;
        linkedBlockingDeque.getClass();
        if (linkedBlockingDeque.size() >= 100) {
            linkedBlockingDeque.clear();
        }
        linkedBlockingDeque.add(fVar);
        LinkedBlockingDeque linkedBlockingDeque2 = this.f51333g;
        logger.debug("endProcessSync: old pending sync count: " + linkedBlockingDeque2.size());
        linkedBlockingDeque2.remove(fVar);
        z.i("endProcessSync: new pending sync count: ", linkedBlockingDeque2.size(), logger);
        fVar2.f179130a = null;
        fVar2.f179133d = 2;
    }

    public Object d(xo2.c cVar, wo2.e eVar, t13.d<? super xo2.d> dVar) {
        return e(this, cVar, eVar, (v13.c) dVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object f(xo2.g gVar, yo2.a aVar, v13.c cVar) {
        vo2.h hVar;
        if (cVar instanceof vo2.h) {
            hVar = (vo2.h) cVar;
            int i14 = hVar.f179151d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                hVar.f179151d = i14 - Integer.MIN_VALUE;
            } else {
                hVar = new vo2.h(this, cVar);
            }
        } else {
            hVar = new vo2.h(this, cVar);
        }
        Object obj = hVar.f179149b;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = hVar.f179151d;
        Logger logger = this.f51331e;
        try {
            if (i15 != 0) {
                if (i15 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                yo2.a aVar3 = hVar.f179148a;
                r.b(obj);
                return obj;
            }
            r.b(obj);
            y yVar = gVar.f191808b;
            switch (yVar == null ? -1 : b.f51338a[yVar.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    i iVar = new i(this, gVar, aVar, null);
                    hVar.f179148a = aVar;
                    hVar.f179151d = 1;
                    Object objB = j2.b(45000L, iVar, hVar);
                    return objB == aVar2 ? aVar2 : objB;
                default:
                    y yVar2 = gVar.f191808b;
                    logger.warn("executeCreditCardCommit: not handling creditCard commit, type: " + (yVar2 != null ? yVar2.f179240a : null));
                    aVar.e(yo2.a.EnumC3717a.SKIPPED);
                    aVar.c().add(yo2.a.b.UNHANDLED_COMMIT_TYPE);
                    return aVar;
            }
        } catch (Exception e4) {
            logger.error("executeCreditCardCommit: creditCard synchronization failed", (Throwable) e4);
            if (e4 instanceof NewFitPayCreditCardSync.CreditCardSyncException) {
                aVar.c().add(((NewFitPayCreditCardSync.CreditCardSyncException) e4).getResultFlag());
                aVar.e(yo2.a.EnumC3717a.FAILED);
            } else if (!(e4 instanceof NewFitPayException)) {
                aVar.c().add(yo2.a.b.DEVICE_WALLET_TRANSFER_FAILED);
                aVar.e(yo2.a.EnumC3717a.FAILED);
            } else if (((NewFitPayException) e4).getErrorFlag() == zn2.z.NOT_FOUND) {
                aVar.c().add(yo2.a.b.NOT_FOUND);
                aVar.e(yo2.a.EnumC3717a.SKIPPED);
            }
            aVar.d(e4.getMessage());
            return aVar;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object g(v13.c cVar, wo2.e eVar, wo2.f fVar) {
        j jVar;
        l lVar = this.f51327a;
        if (cVar instanceof j) {
            jVar = (j) cVar;
            int i14 = jVar.f179160e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                jVar.f179160e = i14 - Integer.MIN_VALUE;
            } else {
                jVar = new j(this, cVar);
            }
        } else {
            jVar = new j(this, cVar);
        }
        Object objC = jVar.f179158c;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = jVar.f179160e;
        Logger logger = this.f51331e;
        try {
            if (i15 == 0) {
                r.b(objC);
                wr2.p pVar = wr2.p.f186870a;
                String str = lVar.f205629a.f73101a;
                pVar.getClass();
                String strC = wr2.p.c("dynamic_feature_app", str);
                logger.trace("getLastProcessedCommitId() = " + strC);
                jVar.f179156a = eVar;
                jVar.f179157b = fVar;
                jVar.f179160e = 1;
                objC = lVar.c(100, strC, jVar);
                if (objC == obj) {
                    return obj;
                }
            } else {
                if (i15 != 1) {
                    if (i15 == 2) {
                        r.b(objC);
                        return null;
                    }
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                fVar = jVar.f179157b;
                eVar = jVar.f179156a;
                r.b(objC);
            }
            return (xo2.e) objC;
        } catch (Exception e4) {
            logger.error("processNextPendingSync: failed to get commits from the platform", (Throwable) e4);
            eVar.e(wo2.e.a.FAILED);
            if (e4 instanceof NewFitPayException) {
                eVar.c().add(((NewFitPayException) e4).getErrorFlag());
            } else {
                eVar.c().add(zn2.z.UNABLE_TO_LOAD_COMMITS);
            }
            eVar.d(e4.getMessage());
            jVar.f179156a = null;
            jVar.f179157b = null;
            jVar.f179160e = 2;
            if (c(jVar, eVar, fVar) != obj) {
                return null;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object h(xo2.a aVar, StringBuilder sb3, v13.c cVar) throws Throwable {
        vo2.k kVar;
        StringBuilder sb4;
        Object objP;
        String strSubstring;
        xo2.a aVar2 = aVar;
        if (cVar instanceof vo2.k) {
            kVar = (vo2.k) cVar;
            int i14 = kVar.f179165e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                kVar.f179165e = i14 - Integer.MIN_VALUE;
            } else {
                kVar = new vo2.k(this, cVar);
            }
        } else {
            kVar = new vo2.k(this, cVar);
        }
        Object obj = kVar.f179163c;
        Object obj2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = kVar.f179165e;
        if (i15 == 0) {
            r.b(obj);
            kVar.f179161a = aVar2;
            sb4 = sb3;
            kVar.f179162b = sb4;
            kVar.f179165e = 1;
            k kVar2 = new k(u13.f.b(kVar), 1);
            kVar2.q();
            byte[] bArrD = aVar2.d();
            if (bArrD == null) {
                this.f51331e.error("executeApduCommand: Command is null, can not execute current command.");
                int i16 = q.f128596b;
                kVar2.resumeWith(new q.b(new ApduPackageException("apdu command is null, can not execute command", xo2.d.b.UNABLE_TO_GET_COMMAND_BYTES)));
            } else {
                ul2.c cVar2 = this.f51334h.get();
                cVar2.getClass();
                if (!cVar2.l(bArrD, new com.garmin.feature.garminpay.providers.gpay.sync.b(this, kVar2, aVar2), AbstractComponentTracker.LINGERING_TIMEOUT)) {
                    int i17 = q.f128596b;
                    kVar2.resumeWith(new q.b(new ApduPackageException("execute apdu command failed", xo2.d.b.TRANSFER_INACTIVE)));
                }
            }
            objP = kVar2.p();
            if (objP != obj2) {
            }
        }
        if (i15 != 1) {
            if (i15 == 2) {
                r.b(obj);
                return obj;
            }
            h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        StringBuilder sb5 = kVar.f179162b;
        xo2.a aVar3 = kVar.f179161a;
        r.b(obj);
        sb4 = sb5;
        aVar2 = aVar3;
        objP = obj;
        xo2.b bVar = (xo2.b) objP;
        if (!bVar.d()) {
            if (sb4.length() > 0) {
                sb4.append(bVar.getResponseData());
                bVar.e(sb4.toString());
                sb4.setLength(0);
            }
            return bVar;
        }
        String responseData = bVar.getResponseData();
        if (responseData != null) {
            String responseData2 = bVar.getResponseData();
            responseData2.getClass();
            strSubstring = responseData.substring(0, responseData2.length() - 4);
        } else {
            strSubstring = null;
        }
        sb4.append(strSubstring);
        String strA = aq2.h.a(vo2.d.f179122c);
        String responseCode = bVar.getResponseCode();
        xo2.a aVar4 = new xo2.a(aVar2.getCommandId(), aVar2.getGroupId(), aVar2.getSequence(), tn.k.g(strA, responseCode != null ? responseCode.substring(2) : null), aVar2.getType(), aVar2.getContinueOnFailure(), aVar2.getDescription());
        kVar.f179161a = null;
        kVar.f179162b = null;
        kVar.f179165e = 2;
        Object objH = h(aVar4, sb4, kVar);
        return objH == obj2 ? obj2 : objH;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x009f, code lost:
    
        if (r6.f51327a.a(r7, r9, r0) == r1) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(xo2.g gVar, wo2.e eVar, v13.c cVar) {
        vo2.l lVar;
        if (cVar instanceof vo2.l) {
            lVar = (vo2.l) cVar;
            int i14 = lVar.f179170e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                lVar.f179170e = i14 - Integer.MIN_VALUE;
            } else {
                lVar = new vo2.l(this, cVar);
            }
        } else {
            lVar = new vo2.l(this, cVar);
        }
        Object objD = lVar.f179168c;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = lVar.f179170e;
        if (i15 != 0) {
            if (i15 == 1) {
                eVar = lVar.f179167b;
                gVar = lVar.f179166a;
                r.b(objD);
            } else {
                if (i15 != 2) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                gVar = lVar.f179166a;
                r.b(objD);
            }
            n(gVar.f191807a);
            return Boolean.TRUE;
        }
        r.b(objD);
        String str = gVar.f191807a;
        Logger logger = this.f51331e;
        com.airbnb.lottie.animation.keyframe.a.w("processApduCommits: processing apdu commit: id ", str, logger);
        xo2.c cVar2 = gVar.f191812f;
        if (cVar2 == null) {
            logger.error("executeApduCommit: payload is null, can not process commit");
            eVar.c().add(wo2.e.b.INVALID_APDU_PACKAGE);
            eVar.d("executeApduCommit: payload is null, can not process commit");
            return Boolean.TRUE;
        }
        lVar.f179166a = gVar;
        lVar.f179167b = eVar;
        lVar.f179170e = 1;
        objD = d(cVar2, eVar, lVar);
        if (objD != obj) {
        }
        return obj;
        xo2.d dVar = (xo2.d) objD;
        if (dVar.getState() == xo2.d.a.ERROR) {
            if (dVar.c().contains(xo2.d.b.UNABLE_TO_OPEN_APDU_TRANSFER)) {
                eVar.c().add(wo2.e.b.UNABLE_TO_OPEN_APDU_TRANSFER);
            }
            return Boolean.FALSE;
        }
        dVar.a();
        lVar.f179166a = gVar;
        lVar.f179167b = null;
        lVar.f179170e = 2;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:31:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public final Object j(xo2.g gVar, wo2.e eVar, v13.c cVar) {
        m mVar;
        xo2.g gVar2;
        yo2.a aVar;
        xo2.g gVar3 = gVar;
        if (cVar instanceof m) {
            mVar = (m) cVar;
            int i14 = mVar.f179175e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                mVar.f179175e = i14 - Integer.MIN_VALUE;
            } else {
                mVar = new m(this, cVar);
            }
        } else {
            mVar = new m(this, cVar);
        }
        Object objF = mVar.f179173c;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = mVar.f179175e;
        if (i15 != 0) {
            if (i15 == 1) {
                gVar3 = mVar.f179171a;
                r.b(objF);
            } else {
                if (i15 != 2) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                aVar = mVar.f179172b;
                gVar2 = mVar.f179171a;
                r.b(objF);
            }
            if (aVar.getResult() == yo2.a.EnumC3717a.FAILED) {
                return Boolean.FALSE;
            }
            n(gVar2.f191807a);
            return Boolean.TRUE;
        }
        r.b(objF);
        yo2.a aVar2 = new yo2.a(eVar.f186494a, null, null, null, null, 0L, eVar.f186501h, this.f51330d, 62, null);
        String str = "processCreditCardCommit: process creditcard commit id: " + gVar3.f191807a + " type: " + gVar3.f191808b;
        Logger logger = this.f51331e;
        logger.debug(str);
        if (gVar3.f191813g == null) {
            logger.error("processCreditCardCommit: unable to create creditcard package");
            eVar.c().add(wo2.e.b.INVALID_COMMIT_PAYLOAD);
            eVar.d("processCreditCardCommit: unable to create creditcard package");
            return Boolean.TRUE;
        }
        mVar.f179171a = gVar3;
        mVar.f179172b = null;
        mVar.f179175e = 1;
        objF = f(gVar3, aVar2, mVar);
        if (objF != obj) {
        }
        return obj;
        yo2.a aVar3 = (yo2.a) objF;
        aVar3.a();
        mVar.f179171a = gVar3;
        mVar.f179172b = aVar3;
        mVar.f179175e = 2;
        if (this.f51327a.a(gVar3, aVar3, mVar) != obj) {
            gVar2 = gVar3;
            aVar = aVar3;
            if (aVar.getResult() == yo2.a.EnumC3717a.FAILED) {
                return Boolean.FALSE;
            }
            n(gVar2.f191807a);
            return Boolean.TRUE;
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:101:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:109:0x032f  */
    /* JADX WARN: Code duplicated, block: B:115:0x035d  */
    /* JADX WARN: Code duplicated, block: B:117:0x0365  */
    /* JADX WARN: Code duplicated, block: B:121:0x038a  */
    /* JADX WARN: Code duplicated, block: B:123:0x03aa  */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Code duplicated, block: B:96:0x02d8 A[PHI: r2 r3 r4 r7 r8
      0x02d8: PHI (r2v21 int) = (r2v12 int), (r2v22 int) binds: [B:95:0x02b5, B:122:0x03a8] A[DONT_GENERATE, DONT_INLINE]
      0x02d8: PHI (r3v21 boolean) = (r3v15 boolean), (r3v22 boolean) binds: [B:95:0x02b5, B:122:0x03a8] A[DONT_GENERATE, DONT_INLINE]
      0x02d8: PHI (r4v16 java.util.Iterator<xo2.g>) = (r4v8 java.util.Iterator<xo2.g>), (r4v20 java.util.Iterator<xo2.g>) binds: [B:95:0x02b5, B:122:0x03a8] A[DONT_GENERATE, DONT_INLINE]
      0x02d8: PHI (r7v24 wo2.e) = (r7v16 wo2.e), (r7v27 wo2.e) binds: [B:95:0x02b5, B:122:0x03a8] A[DONT_GENERATE, DONT_INLINE]
      0x02d8: PHI (r8v9 wo2.f) = (r8v3 wo2.f), (r8v12 wo2.f) binds: [B:95:0x02b5, B:122:0x03a8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:98:0x02de  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:118:0x0380 -> B:120:0x0383). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:121:0x038a -> B:122:0x03a8). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @android.annotation.SuppressLint({"CheckResult"})
    public final java.lang.Object k(boolean r27, v13.c r28) {
        /*
            Method dump skipped, instruction units count: 1012
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.garmin.feature.garminpay.providers.gpay.sync.NewDeviceSyncQueue.k(boolean, v13.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00e5, code lost:
    
        if (r22.f51327a.a(r2, r0, r4) == r5) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(xo2.g gVar, wo2.e eVar, v13.c cVar) {
        o oVar;
        yo2.a aVar;
        yo2.a aVar2;
        yo2.a aVar3;
        yo2.a aVar4;
        xo2.g gVar2 = gVar;
        if (cVar instanceof o) {
            oVar = (o) cVar;
            int i14 = oVar.f179192g;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                oVar.f179192g = i14 - Integer.MIN_VALUE;
            } else {
                oVar = new o(this, cVar);
            }
        } else {
            oVar = new o(this, cVar);
        }
        Object objA = oVar.f179190e;
        u13.a aVar5 = u13.a.COROUTINE_SUSPENDED;
        int i15 = oVar.f179192g;
        Logger logger = this.f51331e;
        if (i15 == 0) {
            r.b(objA);
            logger.debug("processTransitCardCommit: process transit card commit id: " + gVar2);
            aVar = new yo2.a(eVar.f186494a, null, null, null, null, 0L, eVar.f186501h, this.f51330d, 62, null);
            try {
                t tVar = this.f51329c;
                NewFitPayTransitCardSync newFitPayTransitCardSync = new NewFitPayTransitCardSync(tVar.f205816b, tVar.f205818d, tVar.f205817c.f205979a, tVar, null, null, 48, null);
                oVar.f179186a = gVar2;
                oVar.f179187b = aVar;
                oVar.f179188c = aVar;
                oVar.f179189d = aVar;
                oVar.f179192g = 1;
                objA = newFitPayTransitCardSync.a(gVar2, oVar);
                if (objA != aVar5) {
                    aVar3 = aVar;
                    aVar2 = aVar3;
                    aVar3.e((yo2.a.EnumC3717a) objA);
                    aVar4 = aVar2;
                    aVar4.a();
                    oVar.f179186a = gVar2;
                    oVar.f179187b = aVar4;
                    oVar.f179188c = null;
                    oVar.f179189d = null;
                    oVar.f179192g = 2;
                }
            } catch (NewFitPayTransitCardSync.SyncException e4) {
                e = e4;
                aVar2 = aVar;
                logger.error("processTransitCardCommit: sync fails", (Throwable) e);
                aVar.e(yo2.a.EnumC3717a.FAILED);
                aVar.c().add(e.getResultFlag());
                aVar.d(e.getMessage());
                aVar4 = aVar2;
                aVar4.a();
                oVar.f179186a = gVar2;
                oVar.f179187b = aVar4;
                oVar.f179188c = null;
                oVar.f179189d = null;
                oVar.f179192g = 2;
            }
            return aVar5;
        }
        if (i15 == 1) {
            aVar3 = oVar.f179189d;
            yo2.a aVar6 = oVar.f179188c;
            aVar2 = oVar.f179187b;
            xo2.g gVar3 = oVar.f179186a;
            try {
                r.b(objA);
                aVar = aVar6;
                gVar2 = gVar3;
                try {
                    aVar3.e((yo2.a.EnumC3717a) objA);
                } catch (NewFitPayTransitCardSync.SyncException e14) {
                    e = e14;
                    logger.error("processTransitCardCommit: sync fails", (Throwable) e);
                    aVar.e(yo2.a.EnumC3717a.FAILED);
                    aVar.c().add(e.getResultFlag());
                    aVar.d(e.getMessage());
                }
            } catch (NewFitPayTransitCardSync.SyncException e15) {
                e = e15;
                aVar = aVar6;
                gVar2 = gVar3;
                logger.error("processTransitCardCommit: sync fails", (Throwable) e);
                aVar.e(yo2.a.EnumC3717a.FAILED);
                aVar.c().add(e.getResultFlag());
                aVar.d(e.getMessage());
                aVar4 = aVar2;
                aVar4.a();
                oVar.f179186a = gVar2;
                oVar.f179187b = aVar4;
                oVar.f179188c = null;
                oVar.f179189d = null;
                oVar.f179192g = 2;
            }
            aVar4 = aVar2;
            aVar4.a();
            oVar.f179186a = gVar2;
            oVar.f179187b = aVar4;
            oVar.f179188c = null;
            oVar.f179189d = null;
            oVar.f179192g = 2;
        } else {
            if (i15 != 2) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            aVar4 = oVar.f179187b;
            gVar2 = oVar.f179186a;
            r.b(objA);
        }
        if (aVar4.getResult() == yo2.a.EnumC3717a.FAILED) {
            return Boolean.FALSE;
        }
        n(gVar2.f191807a);
        return Boolean.TRUE;
    }

    public final Object m(v13.c cVar) throws Throwable {
        k kVar = new k(u13.f.b(cVar), 1);
        kVar.q();
        int iD = this.f51328b.D(new com.garmin.feature.garminpay.providers.gpay.sync.c(new m0(), this, kVar));
        z.i("reserveNFC: GDI transferId ", iD, this.f51331e);
        if (iD == -1) {
            int i14 = q.f128596b;
            kVar.resumeWith(new q.b(new ApduPackageException(e0.f(iD, "received INVALID_TRANSACTION_ID ", ", can not open apdu transfer"), xo2.d.b.UNABLE_TO_OPEN_APDU_TRANSFER)));
        }
        Object objP = kVar.p();
        return objP == u13.a.COROUTINE_SUSPENDED ? objP : Unit.INSTANCE;
    }

    public final void n(String str) {
        if (str != null) {
            wr2.p pVar = wr2.p.f186870a;
            String str2 = this.f51327a.f205629a.f73101a;
            pVar.getClass();
            wr2.p.f("dynamic_feature_app", str2, str);
            this.f51331e.trace("setLastProcessedCommitId(" + str + ")");
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object o(v13.c cVar) {
        vo2.q qVar;
        if (cVar instanceof vo2.q) {
            qVar = (vo2.q) cVar;
            int i14 = qVar.f179201c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                qVar.f179201c = i14 - Integer.MIN_VALUE;
            } else {
                qVar = new vo2.q(this, cVar);
            }
        } else {
            qVar = new vo2.q(this, cVar);
        }
        Object obj = qVar.f179199a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = qVar.f179201c;
        try {
            if (i15 == 0) {
                r.b(obj);
                this.f51331e.debug("tryReleasingExplicitLock");
                vo2.r rVar = new vo2.r(this, null);
                qVar.f179201c = 1;
                if (j2.b(30000L, rVar, qVar) == aVar) {
                    return aVar;
                }
            } else {
                if (i15 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
        } catch (Exception unused) {
        }
        return Unit.INSTANCE;
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/garmin/feature/garminpay/providers/gpay/sync/NewDeviceSyncQueue$a;", "", "<init>", "()V", "", "MAX_PENDING_SYNC_CAPACITY", "I", "", "CARD_SYNC_TIMEOUT_MILLIS", "J", "UNRESEARVE_NFC_TIMEOUT_MILLIS", "", "Lvo2/y;", "CREDIT_CARD_COMMIT_TYPES", "Ljava/util/List;", "TRANSIT_CARD_COMMIT_TYPES", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
