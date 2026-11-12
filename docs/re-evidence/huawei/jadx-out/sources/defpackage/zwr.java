package defpackage;

import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.eclipse.californium.core.coap.CoAP;
import org.eclipse.californium.core.coap.Message;
import org.eclipse.californium.core.config.CoapConfig;
import org.eclipse.californium.core.network.Exchange;
import org.eclipse.californium.core.network.stack.AbstractLayer;
import org.eclipse.californium.core.network.stack.BlockwiseStatus;
import org.eclipse.californium.elements.EndpointContext;
import org.eclipse.californium.elements.EndpointContextMatcher;
import org.eclipse.californium.elements.config.Configuration;
import org.eclipse.californium.elements.util.LeastRecentlyUpdatedCache;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes20.dex */
public class zwr extends AbstractLayer {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Logger f54689b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Logger f54690c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LeastRecentlyUpdatedCache<zwt, zwq> f54691a;
    private final LeastRecentlyUpdatedCache<zwt, zwo> d;
    private final int e;
    private final boolean f;
    private final int g;
    private ScheduledFuture<?> h;
    private volatile boolean i;
    private final long j;
    private final EndpointContextMatcher k;
    private final int m;
    private final int n;
    private final int o;
    private final int p;
    private final boolean r;
    private ScheduledFuture<?> t;
    private final boolean v;
    private final String w;
    private final boolean y;
    private final BlockwiseStatus.RemoveHandler q = new BlockwiseStatus.RemoveHandler() { // from class: zwr.1
        @Override // org.eclipse.californium.core.network.stack.BlockwiseStatus.RemoveHandler
        public void remove(BlockwiseStatus blockwiseStatus) {
            zwr.this.b((zwq) blockwiseStatus);
        }
    };
    private final BlockwiseStatus.RemoveHandler s = new BlockwiseStatus.RemoveHandler() { // from class: zwr.5
        @Override // org.eclipse.californium.core.network.stack.BlockwiseStatus.RemoveHandler
        public void remove(BlockwiseStatus blockwiseStatus) {
            zwr.this.c((zwo) blockwiseStatus);
        }
    };
    private final AtomicInteger l = new AtomicInteger();

    static {
        Logger loggerA = aaex.a((Class<?>) zwr.class);
        f54689b = loggerA;
        f54690c = aaex.a(loggerA.getName() + ".health");
    }

    public zwr(String str, boolean z, Configuration configuration, EndpointContextMatcher endpointContextMatcher) {
        this.w = str;
        this.k = endpointContextMatcher;
        int iIntValue = ((Integer) configuration.c(CoapConfig.ap)).intValue();
        int iA = zuv.a(iIntValue);
        String strValueOf = String.valueOf(iIntValue);
        int iIntValue2 = z ? ((Integer) configuration.c(CoapConfig.at)).intValue() : 1;
        this.m = iIntValue2;
        if (iIntValue2 > 1) {
            iA = 7;
            strValueOf = "1024(BERT)";
        }
        String str2 = strValueOf;
        int iIntValue3 = ((Integer) configuration.c(CoapConfig.ac)).intValue();
        this.n = iIntValue3;
        this.p = iA;
        int iD = configuration.d(CoapConfig.h, TimeUnit.MILLISECONDS);
        this.g = iD;
        this.e = configuration.d(CoapConfig.j, TimeUnit.MILLISECONDS);
        int iIntValue4 = ((Integer) configuration.c(CoapConfig.aa)).intValue();
        this.o = iIntValue4;
        int iIntValue5 = ((Integer) configuration.c(CoapConfig.y)).intValue();
        int i = iIntValue5 / 10;
        long j = iD;
        LeastRecentlyUpdatedCache<zwt, zwq> leastRecentlyUpdatedCache = new LeastRecentlyUpdatedCache<>(i, iIntValue5, j, TimeUnit.MILLISECONDS);
        this.f54691a = leastRecentlyUpdatedCache;
        leastRecentlyUpdatedCache.a(new LeastRecentlyUpdatedCache.EvictionListener<zwq>() { // from class: zwr.2
            @Override // org.eclipse.californium.elements.util.LeastRecentlyUpdatedCache.EvictionListener
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onEviction(zwq zwqVar) {
                if (zwqVar.complete()) {
                    zwr.f54689b.debug("{}block1 transfer timed out!", zwr.this.w);
                    zwqVar.timeoutCurrentTranfer();
                }
            }
        });
        LeastRecentlyUpdatedCache<zwt, zwo> leastRecentlyUpdatedCache2 = new LeastRecentlyUpdatedCache<>(i, iIntValue5, j, TimeUnit.MILLISECONDS);
        this.d = leastRecentlyUpdatedCache2;
        leastRecentlyUpdatedCache2.a(new LeastRecentlyUpdatedCache.EvictionListener<zwo>() { // from class: zwr.3
            @Override // org.eclipse.californium.elements.util.LeastRecentlyUpdatedCache.EvictionListener
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public void onEviction(zwo zwoVar) {
                if (zwoVar.complete()) {
                    zwr.f54689b.debug("{}block2 transfer timed out!", zwr.this.w);
                    zwoVar.timeoutCurrentTranfer();
                }
            }
        });
        this.v = ((Boolean) configuration.c(CoapConfig.i)).booleanValue();
        boolean zBooleanValue = ((Boolean) configuration.c(CoapConfig.g)).booleanValue();
        this.y = zBooleanValue;
        this.r = ((Boolean) configuration.c(CoapConfig.f44409b)).booleanValue();
        this.j = configuration.e(zyq.f54785b, TimeUnit.MILLISECONDS).longValue();
        this.f = ((Boolean) configuration.c(CoapConfig.d)).booleanValue();
        f54689b.info("{}BlockwiseLayer uses MAX_MESSAGE_SIZE={}, PREFERRED_BLOCK_SIZE={}, BLOCKWISE_STATUS_LIFETIME={}, MAX_RESOURCE_BODY_SIZE={}, BLOCKWISE_STRICT_BLOCK2_OPTION={}", str, Integer.valueOf(iIntValue3), str2, Integer.valueOf(iD), Integer.valueOf(iIntValue4), Boolean.valueOf(zBooleanValue));
    }

    @Override // org.eclipse.californium.core.network.stack.AbstractLayer, org.eclipse.californium.core.network.stack.Layer
    public void start() {
        if (this.j > 0 && f54690c.isDebugEnabled() && this.t == null) {
            ScheduledExecutorService scheduledExecutorService = this.secondaryExecutor;
            Runnable runnable = new Runnable() { // from class: zwr.4
                @Override // java.lang.Runnable
                public void run() {
                    if (zwr.this.i) {
                        zwr.f54690c.debug("{}{} block1 transfers", zwr.this.w, Integer.valueOf(zwr.this.f54691a.h()));
                        Iterator itD = zwr.this.f54691a.d();
                        int i = 5;
                        int i2 = 5;
                        while (itD.hasNext()) {
                            zwr.f54690c.debug("   block1 {}", itD.next());
                            i2--;
                            if (i2 == 0) {
                                break;
                            }
                        }
                        zwr.f54690c.debug("{}{} block2 transfers", zwr.this.w, Integer.valueOf(zwr.this.d.h()));
                        Iterator itD2 = zwr.this.d.d();
                        while (itD2.hasNext()) {
                            zwr.f54690c.debug("   block2 {}", itD2.next());
                            i--;
                            if (i == 0) {
                                break;
                            }
                        }
                        zwr.f54690c.debug("{}{} block2 responses ignored", zwr.this.w, Integer.valueOf(zwr.this.l.get()));
                        zwr.this.d(true);
                    }
                }
            };
            long j = this.j;
            this.t = scheduledExecutorService.scheduleAtFixedRate(runnable, j, j, TimeUnit.MILLISECONDS);
        }
        ScheduledExecutorService scheduledExecutorService2 = this.secondaryExecutor;
        Runnable runnable2 = new Runnable() { // from class: zwr.8
            @Override // java.lang.Runnable
            public void run() {
                zwr.this.d(false);
            }
        };
        long j2 = this.e;
        this.h = scheduledExecutorService2.scheduleAtFixedRate(runnable2, j2, j2, TimeUnit.MILLISECONDS);
    }

    @Override // org.eclipse.californium.core.network.stack.AbstractLayer, org.eclipse.californium.core.network.stack.Layer
    public void destroy() {
        ScheduledFuture<?> scheduledFuture = this.t;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            this.t = null;
        }
        ScheduledFuture<?> scheduledFuture2 = this.h;
        if (scheduledFuture2 != null) {
            scheduledFuture2.cancel(false);
            this.h = null;
        }
    }

    @Override // org.eclipse.californium.core.network.stack.AbstractLayer, org.eclipse.californium.core.network.stack.Layer
    public void sendRequest(Exchange exchange, zvg zvgVar) {
        if (a() && !zvgVar.j() && !d(exchange)) {
            zwt zwtVarD = zwt.d(exchange);
            zwo zwoVarD = this.d.d(zwtVarD);
            if (zwoVarD != null) {
                c(zwoVarD);
                zwoVarD.a(null);
            }
            if (b(zvgVar)) {
                try {
                    zvgVar = c(zwtVarD, exchange, zvgVar, this.p);
                } catch (zwp e) {
                    f54689b.debug("{}{} {}", this.w, zwtVarD, e.getMessage());
                    if (!e.e()) {
                        zvgVar.setSendError(e);
                    }
                }
            }
        }
        exchange.d(zvgVar);
        lower().sendRequest(exchange, zvgVar);
    }

    private zvg c(zwt zwtVar, Exchange exchange, zvg zvgVar, int i) throws zwp {
        zvg zvgVarC = a(zwtVar, exchange, zvgVar, true).c(i);
        zvgVarC.setDestinationContext(zvgVar.getDestinationContext());
        zve token = zvgVar.getToken();
        if (token != null) {
            zvgVarC.setToken(token);
        }
        return zvgVarC;
    }

    @Override // org.eclipse.californium.core.network.stack.AbstractLayer, org.eclipse.californium.core.network.stack.Layer
    public void receiveRequest(Exchange exchange, zvg zvgVar) {
        if (a()) {
            if (zvgVar.getOptions().ai()) {
                d(exchange, zvgVar);
                return;
            }
            zuv zuvVarJ = zvgVar.getOptions().j();
            if (zuvVarJ != null && zuvVarJ.b() > 0) {
                zwt zwtVarD = zwt.d(exchange);
                zwo zwoVarD = this.d.d(zwtVarD);
                if (zwoVarD == null) {
                    f54689b.debug("{}peer wants to retrieve individual block2 {} of {}, delivering request to application layer", this.w, zuvVarJ, zwtVarD);
                } else {
                    if (this.k != null) {
                        EndpointContext sourceContext = zvgVar.getSourceContext();
                        if (!this.k.isResponseRelatedToRequest(zwoVarD.firstMessage.getDestinationContext(), sourceContext)) {
                            c(zwoVarD);
                            f54689b.debug("{}peer wants to retrieve block2 {} of {} with new security context, delivering request to application layer", this.w, zuvVarJ, zwtVarD);
                        }
                    }
                    e(exchange, zvgVar, zwoVarD);
                    return;
                }
            }
        }
        upper().receiveRequest(exchange, zvgVar);
    }

    private void d(Exchange exchange, zvg zvgVar) {
        if (a(zvgVar)) {
            int iD = d(zvgVar);
            zvf zvfVar = new zvf(CoAP.ResponseCode.REQUEST_ENTITY_TOO_LARGE, true);
            zvfVar.setDestinationContext(zvgVar.getSourceContext());
            zvfVar.setPayload(String.format("body too large, max. %d bytes", Integer.valueOf(iD)));
            zvfVar.getOptions().g(iD);
            lower().sendResponse(exchange, zvfVar);
            return;
        }
        zuv zuvVarF = zvgVar.getOptions().f();
        Logger logger = f54689b;
        logger.debug("{}inbound request contains block1 option {}", this.w, zuvVarF);
        zwt zwtVarD = zwt.d(exchange);
        zwq zwqVarB = b(zwtVarD, exchange, zvgVar, false);
        if (zuvVarF.d() == 0 && !zwqVarB.isStarting()) {
            zwqVarB = b(zwtVarD, exchange, zvgVar, true);
        } else if (!zwqVarB.hasContentFormat(zvgVar.getOptions().h())) {
            a(zwqVarB, exchange, zvgVar, CoAP.ResponseCode.REQUEST_ENTITY_INCOMPLETE, "unexpected Content-Format");
            return;
        }
        try {
            zwqVarB.c(zvgVar);
            if (zuvVarF.j()) {
                logger.debug("{}acknowledging incoming block1 [num={}], expecting more blocks to come", this.w, Integer.valueOf(zuvVarF.b()));
                zvf zvfVar2 = new zvf(CoAP.ResponseCode.CONTINUE);
                zvfVar2.setDestinationContext(zvgVar.getSourceContext());
                zuv zuvVarC = c(zuvVarF);
                zvfVar2.getOptions().c(zuvVarC.c(), true, zuvVarC.b());
                lower().sendResponse(exchange, zvfVar2);
                return;
            }
            logger.debug("{}peer has sent last block1 [num={}], delivering request to application layer", this.w, Integer.valueOf(zuvVarF.b()));
            exchange.d(zuvVarF);
            zvg zvgVar2 = new zvg(zvgVar.a());
            zwqVarB.assembleReceivedMessage(zvgVar2);
            zvgVar2.setMID(zvgVar.getMID());
            zvgVar2.setToken(zvgVar.getToken());
            zvgVar2.a(zvgVar.b());
            zvgVar2.getOptions().d(zvgVar.getOptions().j());
            b(zwqVarB);
            exchange.a(zvgVar2);
            upper().receiveRequest(exchange, zvgVar2);
        } catch (zwp e) {
            CoAP.ResponseCode responseCodeC = e.c();
            f54689b.debug("{}peer {} {}. Responding with {}", this.w, zwtVarD, e.getMessage(), responseCodeC);
            a(zwqVarB, exchange, zvgVar, responseCodeC, e.getMessage());
        }
    }

    private void a(zwq zwqVar, Exchange exchange, zvg zvgVar, CoAP.ResponseCode responseCode, String str) {
        zvf zvfVar = new zvf(responseCode, true);
        if (this.v) {
            zvfVar.getOptions().a(zvgVar.getOptions().f());
        }
        zvfVar.setDestinationContext(zvgVar.getSourceContext());
        zvfVar.setPayload(str);
        b(zwqVar);
        lower().sendResponse(exchange, zvfVar);
    }

    private void e(Exchange exchange, zvg zvgVar, zwo zwoVar) {
        zvf zvfVarB = zwoVar.b(c(zvgVar.getOptions().j()));
        zvfVarB.setDestinationContext(zvgVar.getSourceContext());
        if (zvfVarB.getOptions().j().j()) {
            f54689b.debug("{}peer has requested intermediary block of blockwise transfer: {}", this.w, zwoVar);
            this.d.e(zwoVar.getKeyUri());
        } else {
            f54689b.debug("{}peer has requested last block of blockwise transfer: {}", this.w, zwoVar);
            c(zwoVar);
        }
        lower().sendResponse(exchange, zvfVarB);
    }

    @Override // org.eclipse.californium.core.network.stack.AbstractLayer, org.eclipse.californium.core.network.stack.Layer
    public void sendResponse(Exchange exchange, zvf zvfVar) {
        zuv zuvVar;
        zvf zvfVarB;
        if (a()) {
            zuv zuvVarJ = exchange.p().getOptions().j();
            EndpointContext effectiveDestinationContext = zvfVar.getEffectiveDestinationContext();
            if (effectiveDestinationContext == null) {
                effectiveDestinationContext = exchange.p().getSourceContext();
            }
            if (d(exchange)) {
                zuv zuvVarJ2 = zvfVar.getOptions().j();
                if (zuvVarJ2 != null) {
                    if (zuvVarJ.d() != zuvVarJ2.d()) {
                        f54689b.warn("{}resource [{}] implementation error, peer requested block offset {} but resource returned block offest {}", this.w, exchange.p().i(), Integer.valueOf(zuvVarJ.d()), Integer.valueOf(zuvVarJ2.d()));
                        zvfVarB = new zvf(CoAP.ResponseCode.INTERNAL_SERVER_ERROR, true);
                        zvfVarB.setDestinationContext(effectiveDestinationContext);
                        zvfVarB.setType(zvfVar.getType());
                        zvfVarB.setMID(zvfVar.getMID());
                        zvfVarB.addMessageObservers(zvfVar.getMessageObservers());
                        zvfVar = zvfVarB;
                    }
                } else if (zvfVar.hasBlock(zuvVarJ)) {
                    zwo.c(zvfVar, c(zuvVarJ), this.m);
                } else if (!zvfVar.h()) {
                    zvfVarB = new zvf(CoAP.ResponseCode.BAD_OPTION, true);
                    zvfVarB.setDestinationContext(effectiveDestinationContext);
                    zvfVarB.setType(zvfVar.getType());
                    zvfVarB.setMID(zvfVar.getMID());
                    zvfVarB.addMessageObservers(zvfVar.getMessageObservers());
                    zvfVar = zvfVarB;
                }
            } else if (e(zvfVar, zuvVarJ)) {
                zwo zwoVarD = d(zwt.d(exchange), exchange, zvfVar, true);
                if (zuvVarJ != null) {
                    zuvVar = c(zuvVarJ);
                } else {
                    zuvVar = new zuv(this.p, false, 0);
                }
                zvfVarB = zwoVarD.b(zuvVar);
                zvfVarB.setDestinationContext(effectiveDestinationContext);
                if (!zvfVarB.getOptions().j().j()) {
                    c(zwoVarD);
                }
                zvfVar = zvfVarB;
            } else if (a(zuvVarJ)) {
                zwo.c(zvfVar, c(zuvVarJ), this.m);
            }
            zuv zuvVarB = exchange.b();
            if (zuvVarB != null) {
                exchange.d((zuv) null);
                zvfVar.getOptions().a(zuvVarB);
            }
        }
        lower().sendResponse(exchange, zvfVar);
    }

    private zvf b(Exchange exchange, zvf zvfVar) {
        if (exchange.p() != exchange.f()) {
            zvf zvfVar2 = new zvf(zvfVar.d());
            zvfVar2.setToken(exchange.p().getToken());
            if (exchange.p().getType() == CoAP.Type.CON) {
                zvfVar2.setType(CoAP.Type.ACK);
                zvfVar2.setMID(exchange.p().getMID());
            } else {
                zvfVar2.setType(CoAP.Type.NON);
            }
            zvfVar2.setSourceContext(zvfVar.getSourceContext());
            zvfVar2.setPayload(zvfVar.getPayload());
            zvfVar2.setOptions(zvfVar.getOptions());
            zvfVar2.d(exchange.c());
            Long lB = zvfVar.b();
            if (lB != null) {
                zvfVar2.a(lB.longValue());
            }
            exchange.c(zvfVar2);
            return zvfVar2;
        }
        exchange.c(zvfVar);
        return zvfVar;
    }

    @Override // org.eclipse.californium.core.network.stack.AbstractLayer, org.eclipse.californium.core.network.stack.Layer
    public void receiveResponse(Exchange exchange, zvf zvfVar) {
        if (a() && !exchange.p().j()) {
            if (zvfVar.h()) {
                f54689b.debug("{} received error {}:", this.w, zvfVar);
                int i = AnonymousClass10.f54692c[zvfVar.d().ordinal()];
                if (i == 1 || i == 2) {
                    if (e(exchange, zvfVar)) {
                        return;
                    }
                    d(this.f54691a.a(zwt.d(exchange)));
                }
                upper().receiveResponse(exchange, b(exchange, zvfVar));
                return;
            }
            if (zvfVar.getMaxResourceBodySize() == 0) {
                zvfVar.setMaxResourceBodySize(exchange.p().getMaxResourceBodySize());
            }
            if (!d(exchange)) {
                zwt zwtVarD = zwt.d(exchange);
                if (e(zwtVarD, this.d.d(zwtVarD), exchange, zvfVar)) {
                    return;
                }
            }
            if (!zvfVar.a()) {
                exchange.c(zvfVar);
                upper().receiveResponse(exchange, zvfVar);
                return;
            }
            if (zvfVar.getOptions().ai()) {
                a(exchange, zvfVar);
            }
            if (zvfVar.getOptions().af()) {
                d(exchange, zvfVar);
                return;
            }
            return;
        }
        exchange.c(zvfVar);
        upper().receiveResponse(exchange, zvfVar);
    }

    /* JADX INFO: renamed from: zwr$10, reason: invalid class name */
    static /* synthetic */ class AnonymousClass10 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f54692c;

        static {
            int[] iArr = new int[CoAP.ResponseCode.values().length];
            f54692c = iArr;
            try {
                iArr[CoAP.ResponseCode.REQUEST_ENTITY_INCOMPLETE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f54692c[CoAP.ResponseCode.REQUEST_ENTITY_TOO_LARGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private boolean e(Exchange exchange, zvf zvfVar) {
        if (this.f) {
            zwt zwtVarD = zwt.d(exchange);
            try {
                zvg zvgVarP = exchange.p();
                zvg zvgVarC = null;
                if (zvfVar.getOptions().ai()) {
                    zuv zuvVarF = zvfVar.getOptions().f();
                    boolean z = !zvgVarP.isCanceled() && zuvVarF.b() == 0 && zuvVarF.a() < zvgVarP.getPayloadSize();
                    ReentrantReadWriteLock.WriteLock writeLockF = this.f54691a.f();
                    writeLockF.lock();
                    try {
                        zwq zwqVarE = this.f54691a.e(zwtVarD);
                        if (zwqVarE == null && z) {
                            zvgVarC = c(zwtVarD, exchange, zvgVarP, Math.min(zuvVarF.c(), this.p));
                        }
                        writeLockF.unlock();
                        if (zwqVarE == null) {
                            if (zvgVarC != null) {
                                exchange.d(zvgVarC);
                                lower().sendRequest(exchange, zvgVarC);
                                return true;
                            }
                        } else {
                            if (!zwqVarE.b(zvfVar)) {
                                f54689b.debug("{}discarding obsolete block1 response: {}", this.w, zvfVar);
                                return true;
                            }
                            if (zvgVarP.isCanceled()) {
                                b(zwqVarE);
                                return true;
                            }
                            if (zwqVarE.isStarting() && zuvVarF.c() < this.p) {
                                zwqVarE.restart();
                                b(exchange, zvfVar, zwqVarE);
                                return true;
                            }
                        }
                    } catch (Throwable th) {
                        writeLockF.unlock();
                        throw th;
                    }
                } else if (!exchange.p().isCanceled()) {
                    Integer numP = zvfVar.getOptions().p();
                    if (numP != null && (numP.intValue() < 16 || numP.intValue() >= zvgVarP.getPayloadSize())) {
                        numP = null;
                    }
                    if (numP == null && zvgVarP.getPayloadSize() > 16) {
                        numP = Integer.valueOf(zvgVarP.getPayloadSize() - 1);
                    }
                    if (numP != null) {
                        ReentrantReadWriteLock.WriteLock writeLockF2 = this.f54691a.f();
                        writeLockF2.lock();
                        try {
                            zvgVarC = this.f54691a.e(zwtVarD) == null ? c(zwtVarD, exchange, zvgVarP, Math.min(zuv.a(numP.intValue()), this.p)) : null;
                            writeLockF2.unlock();
                        } catch (Throwable th2) {
                            writeLockF2.unlock();
                            throw th2;
                        }
                    }
                    if (zvgVarC != null) {
                        exchange.d(zvgVarC);
                        lower().sendRequest(exchange, zvgVarC);
                        return true;
                    }
                }
            } catch (zwp e) {
                f54689b.debug("{}{} {}", this.w, zwtVarD, e.getMessage());
            }
        }
        return false;
    }

    private void a(Exchange exchange, zvf zvfVar) {
        zuv zuvVarF = zvfVar.getOptions().f();
        Logger logger = f54689b;
        logger.debug("{}received response acknowledging block1 {}", this.w, zuvVarF);
        zwq zwqVarE = this.f54691a.e(zwt.d(exchange));
        if (zwqVarE == null) {
            logger.debug("{}discarding unexpected block1 response: {}", this.w, zvfVar);
            return;
        }
        if (!zwqVarE.b(zvfVar)) {
            logger.debug("{}discarding obsolete block1 response: {}", this.w, zvfVar);
            return;
        }
        if (exchange.p().isCanceled()) {
            b(zwqVarE);
            return;
        }
        if (!zwqVarE.isComplete()) {
            if (zuvVarF.j()) {
                if (zvfVar.d() == CoAP.ResponseCode.CONTINUE) {
                    b(exchange, zvfVar, zwqVarE);
                    return;
                } else {
                    b(zwqVarE);
                    exchange.p().setRejected(true);
                    return;
                }
            }
            b(exchange, zvfVar, zwqVarE);
            return;
        }
        b(zwqVarE);
        if (zvfVar.getOptions().af()) {
            logger.debug("{}Block1 followed by Block2 transfer", this.w);
        } else {
            upper().receiveResponse(exchange, b(exchange, zvfVar));
        }
    }

    private void b(Exchange exchange, zvf zvfVar, zwq zwqVar) {
        Message message = null;
        try {
            if (zwqVar.isComplete()) {
                f54689b.debug("{}stopped block1 transfer, droping request.", this.w);
                return;
            }
            zvg zvgVarC = zwqVar.c(Math.min(zvfVar.getOptions().f().c(), this.p));
            if (this.r) {
                zvgVarC.setToken(zvfVar.getToken());
            }
            zvgVarC.setDestinationContext(zwqVar.getFollowUpEndpointContext(zvfVar.getSourceContext()));
            f54689b.debug("{}sending (next) Block1 [num={}]: {}", this.w, Integer.valueOf(zvgVarC.getOptions().f().b()), zvgVarC);
            exchange.d(zvgVarC);
            lower().sendRequest(exchange, zvgVarC);
        } catch (RuntimeException e) {
            f54689b.warn("{}cannot process next block request, aborting request!", this.w, e);
            if (0 != 0) {
                message.setSendError(e);
            } else {
                exchange.p().setSendError(e);
            }
        } catch (zwp e2) {
            f54689b.warn("{}cannot process next block request, aborting request!", this.w, e2);
            if (e2.e()) {
                return;
            }
            exchange.p().setSendError(e2);
        }
    }

    private boolean e(zwt zwtVar, zwo zwoVar, Exchange exchange, zvf zvfVar) {
        zuv zuvVarJ = zvfVar.getOptions().j();
        if (zwoVar != null) {
            if (zuvVarJ == null || zuvVarJ.b() == 0) {
                if (zwoVar.c(zvfVar)) {
                    f54689b.debug("{}discarding outdated block2 transfer {}, current is [{}]", this.w, zwoVar.d(), zvfVar);
                    c(zwoVar);
                    zwoVar.a(exchange);
                    return false;
                }
                f54689b.debug("{}discarding old block2 transfer [{}], received during ongoing block2 transfer {}", this.w, zvfVar, zwoVar.d());
                zwoVar.e(exchange);
                return true;
            }
            if (zwoVar.c(exchange)) {
                return false;
            }
            f54689b.debug("{}discarding outdate block2 response [{}, {}] received during ongoing block2 transfer {}", this.w, exchange.o(), zvfVar, zwoVar.d());
            zwoVar.e(exchange);
            return true;
        }
        if (zuvVarJ == null || zuvVarJ.b() == 0) {
            return false;
        }
        f54689b.debug("{}discarding stale block2 response [{}, {}] received without ongoing block2 transfer for {}", this.w, exchange.o(), zvfVar, zwtVar);
        exchange.ai();
        return true;
    }

    private void d(Exchange exchange, zvf zvfVar) {
        zuv zuvVarJ = zvfVar.getOptions().j();
        zwt zwtVarD = zwt.d(exchange);
        if (exchange.p().isCanceled()) {
            d(this.d.a(zwtVarD));
            if (zvfVar.g()) {
                upper().receiveResponse(exchange, zvfVar);
                return;
            }
            return;
        }
        if (a(zvfVar)) {
            String str = String.format("requested resource body [%d bytes] exceeds max buffer size [%d bytes], aborting request", zvfVar.getOptions().x(), Integer.valueOf(d(zvfVar)));
            f54689b.debug("{}{}", this.w, str);
            exchange.p().a(new IllegalStateException(str));
            return;
        }
        if (d(exchange)) {
            exchange.c(zvfVar);
            upper().receiveResponse(exchange, zvfVar);
            return;
        }
        ReentrantReadWriteLock.WriteLock writeLockF = this.d.f();
        writeLockF.lock();
        try {
            if (!e(zwtVarD, this.d.d(zwtVarD), exchange, zvfVar)) {
                zwo zwoVarD = d(zwtVarD, exchange, zvfVar);
                writeLockF.unlock();
                try {
                    zwoVarD.d(zvfVar);
                    if (zuvVarJ.j()) {
                        c(exchange, zvfVar, zwoVarD);
                        return;
                    }
                    Logger logger = f54689b;
                    logger.debug("{}all blocks have been retrieved, assembling response and delivering to application layer", this.w);
                    zvf zvfVar2 = new zvf(zvfVar.d());
                    zwoVarD.assembleReceivedMessage(zvfVar2);
                    zvfVar2.d(exchange.c());
                    Long lB = zvfVar.b();
                    if (lB != null) {
                        zvfVar2.a(lB.longValue());
                    }
                    c(zwoVarD);
                    logger.debug("{}assembled response: {}", this.w, zvfVar2);
                    exchange.d(exchange.p());
                    exchange.c(zvfVar2);
                    upper().receiveResponse(exchange, zvfVar2);
                    return;
                } catch (zwp e) {
                    this.l.incrementAndGet();
                    f54689b.debug("{}peer {}{}. Ignores response", this.w, zwtVarD, e.getMessage());
                    if (e.e()) {
                        return;
                    }
                    exchange.p().a(e);
                    return;
                }
            }
            writeLockF.unlock();
        } catch (Throwable th) {
            writeLockF.unlock();
            throw th;
        }
    }

    private void c(Exchange exchange, zvf zvfVar, zwo zwoVar) {
        int iMin = Math.min(zvfVar.getOptions().j().c(), this.p);
        if (zvfVar.g() && exchange.w()) {
            exchange.p().addMessageObserver(new zwn(exchange));
        }
        try {
            zvg zvgVarE = zwoVar.e(iMin);
            zvgVarE.setDestinationContext(zwoVar.getFollowUpEndpointContext(zvfVar.getSourceContext()));
            if (this.r && !zvfVar.g()) {
                zvgVarE.setToken(zvfVar.getToken());
            }
            if (zwoVar.isComplete()) {
                f54689b.debug("{}stopped block2 transfer, droping response.", this.w);
                return;
            }
            f54689b.debug("{}requesting next Block2 [num={}]: {}", this.w, Integer.valueOf(zvgVarE.getOptions().j().b()), zvgVarE);
            exchange.d(zvgVarE);
            lower().sendRequest(exchange, zvgVarE);
        } catch (RuntimeException e) {
            f54689b.debug("{}cannot process next block request, aborting request!", this.w, e);
            if (exchange.y()) {
                return;
            }
            exchange.p().setSendError(e);
        } catch (zwp e2) {
            f54689b.debug("{}{} Stop next block request!", this.w, e2.getMessage());
            if (e2.e()) {
                return;
            }
            exchange.p().setSendError(e2);
        }
    }

    private zwq a(zwt zwtVar, Exchange exchange, zvg zvgVar, boolean z) {
        zwq zwqVarE;
        zwq zwqVarA;
        ReentrantReadWriteLock.WriteLock writeLockF = this.f54691a.f();
        writeLockF.lock();
        Integer numValueOf = null;
        try {
            if (z) {
                zwqVarA = this.f54691a.a(zwtVar);
                zwqVarE = null;
            } else {
                zwqVarE = this.f54691a.e(zwtVar);
                zwqVarA = null;
            }
            if (zwqVarE == null) {
                zwqVarE = zwq.e(zwtVar, this.q, exchange, zvgVar, this.m);
                this.f54691a.a(zwtVar, zwqVarE);
                this.i = true;
                numValueOf = Integer.valueOf(this.f54691a.h());
            }
            writeLockF.unlock();
            if (zwqVarA != null && zwqVarA.c()) {
                f54689b.debug("{}stop previous block1 transfer {} {} for new {}", this.w, zwtVar, zwqVarA, zvgVar);
            }
            if (numValueOf != null) {
                f54689b.debug("{}created tracker for outbound block1 transfer {}, transfers in progress: {}", this.w, zwqVarE, numValueOf);
                return zwqVarE;
            }
            f54689b.debug("{}block1 transfer {} for {}", this.w, zwtVar, zvgVar);
            return zwqVarE;
        } catch (Throwable th) {
            writeLockF.unlock();
            throw th;
        }
    }

    private zwq b(zwt zwtVar, Exchange exchange, zvg zvgVar, boolean z) {
        zwq zwqVarE;
        zwq zwqVarA;
        boolean z2 = !z;
        int iD = d(zvgVar);
        ReentrantReadWriteLock.WriteLock writeLockF = this.f54691a.f();
        writeLockF.lock();
        Integer numValueOf = null;
        try {
            if (z) {
                zwqVarA = this.f54691a.a(zwtVar);
                zwqVarE = null;
            } else {
                zwqVarE = this.f54691a.e(zwtVar);
                zwqVarA = null;
            }
            if (zwqVarE == null) {
                zwqVarE = zwq.b(zwtVar, this.q, exchange, zvgVar, iD, this.m);
                this.f54691a.a(zwtVar, zwqVarE);
                this.i = true;
                numValueOf = Integer.valueOf(this.f54691a.h());
                z2 = false;
            }
            writeLockF.unlock();
            if (zwqVarA != null && zwqVarA.complete()) {
                f54689b.debug("{}stop previous block1 transfer {} {} for new {}", this.w, zwtVar, zwqVarA, zvgVar);
            }
            if (z2 && this.k != null) {
                if (!this.k.isResponseRelatedToRequest(zwqVarE.firstMessage.getSourceContext(), zvgVar.getSourceContext())) {
                    f54689b.debug("{}stop block1 transfer {} {} by context mismatch!", this.w, zwtVar, zwqVarA);
                    return b(zwtVar, exchange, zvgVar, true);
                }
            }
            if (numValueOf != null) {
                f54689b.debug("{}created tracker for inbound block1 transfer {}, transfers in progress: {}", this.w, zwqVarE, numValueOf);
                return zwqVarE;
            }
            f54689b.debug("{}block1 transfer {} for {}", this.w, zwtVar, zvgVar);
            return zwqVarE;
        } catch (Throwable th) {
            writeLockF.unlock();
            throw th;
        }
    }

    private zwo d(zwt zwtVar, Exchange exchange, zvf zvfVar, boolean z) {
        zwo zwoVarE;
        zwo zwoVarA;
        ReentrantReadWriteLock.WriteLock writeLockF = this.d.f();
        writeLockF.lock();
        Integer numValueOf = null;
        try {
            if (z) {
                zwoVarA = this.d.a(zwtVar);
                zwoVarE = null;
            } else {
                zwoVarE = this.d.e(zwtVar);
                zwoVarA = null;
            }
            if (zwoVarE == null) {
                zwoVarE = zwo.c(zwtVar, this.s, exchange, zvfVar, this.m);
                this.d.a(zwtVar, zwoVarE);
                this.i = true;
                numValueOf = Integer.valueOf(this.d.h());
            }
            writeLockF.unlock();
            if (zwoVarA != null && zwoVarA.c()) {
                f54689b.debug("{}stop previous block2 transfer {} {} for new {}", this.w, zwtVar, zwoVarA, zvfVar);
            }
            if (numValueOf != null) {
                f54689b.debug("{}created tracker for outbound block2 transfer {}, transfers in progress: {}", this.w, zwoVarE, numValueOf);
                return zwoVarE;
            }
            f54689b.debug("{}block2 transfer {} for {}", this.w, zwtVar, zvfVar);
            return zwoVarE;
        } catch (Throwable th) {
            writeLockF.unlock();
            throw th;
        }
    }

    private zwo d(zwt zwtVar, Exchange exchange, zvf zvfVar) {
        Integer numValueOf;
        int iD = d(zvfVar);
        ReentrantReadWriteLock.WriteLock writeLockF = this.d.f();
        writeLockF.lock();
        try {
            zwo zwoVarE = this.d.e(zwtVar);
            if (zwoVarE == null) {
                zwoVarE = zwo.e(zwtVar, this.s, exchange, zvfVar, iD, this.m);
                this.d.a(zwtVar, zwoVarE);
                this.i = true;
                numValueOf = Integer.valueOf(this.d.h());
            } else {
                numValueOf = null;
            }
            writeLockF.unlock();
            if (numValueOf != null) {
                f54689b.debug("{}created tracker for inbound block2 transfer {}, transfers in progress: {}, {}", this.w, zwoVarE, numValueOf, zvfVar);
            }
            return zwoVarE;
        } catch (Throwable th) {
            writeLockF.unlock();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(boolean z) {
        int iA = this.f54691a.a(128) + this.d.a(128);
        if (z) {
            f54690c.debug("{}cleaned up {} block transfers!", this.w, Integer.valueOf(iA));
        } else {
            if (!this.i || iA <= 0) {
                return;
            }
            f54689b.info("{}cleaned up {} block transfers!", this.w, Integer.valueOf(iA));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(zwq zwqVar) {
        d(this.f54691a.c(zwqVar.getKeyUri(), zwqVar));
    }

    private void d(zwq zwqVar) {
        if (zwqVar == null || !zwqVar.complete()) {
            return;
        }
        f54689b.debug("{}removing block1 tracker [{}], block1 transfers still in progress: {}", this.w, zwqVar.getKeyUri(), Integer.valueOf(this.f54691a.h()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(zwo zwoVar) {
        d(this.d.c(zwoVar.getKeyUri(), zwoVar));
    }

    private void d(zwo zwoVar) {
        if (zwoVar == null || !zwoVar.complete()) {
            return;
        }
        f54689b.debug("{}removing block2 tracker [{}], block2 transfers still in progress: {}", this.w, zwoVar.getKeyUri(), Integer.valueOf(this.d.h()));
    }

    private boolean b(zvg zvgVar) {
        boolean z = zvgVar.getPayloadSize() > this.n;
        if (z) {
            f54689b.debug("{}request body [{}/{}] requires blockwise transfer", this.w, Integer.valueOf(zvgVar.getPayloadSize()), Integer.valueOf(this.n));
        }
        return z;
    }

    private boolean e(zvf zvfVar, zuv zuvVar) {
        boolean z = zvfVar.getPayloadSize() > this.n;
        if (!z && zuvVar != null) {
            z = zvfVar.getPayloadSize() > zuv.d(Math.min(zuvVar.c(), this.p));
        }
        if (z) {
            f54689b.debug("{}response body [{}/{}] requires blockwise transfer", this.w, Integer.valueOf(zvfVar.getPayloadSize()), Integer.valueOf(this.n));
        }
        return z;
    }

    private boolean a(zuv zuvVar) {
        boolean z = this.y && zuvVar != null;
        if (z) {
            f54689b.debug("{}response requires requested {} blockwise transfer", this.w, zuvVar);
        }
        return z;
    }

    private boolean d(Exchange exchange) {
        zuv zuvVarJ = exchange.p().getOptions().j();
        return zuvVarJ != null && zuvVarJ.b() > 0;
    }

    private boolean a() {
        return this.o > 0;
    }

    private boolean a(zvf zvfVar) {
        return zvfVar.getOptions().as() && zvfVar.getOptions().x().intValue() > d(zvfVar);
    }

    private boolean a(zvg zvgVar) {
        return zvgVar.getOptions().ao() && zvgVar.getOptions().p().intValue() > d(zvgVar);
    }

    private int d(Message message) {
        int maxResourceBodySize = message.getMaxResourceBodySize();
        return maxResourceBodySize == 0 ? this.o : maxResourceBodySize;
    }

    private zuv c(zuv zuvVar) {
        if (this.p >= zuvVar.c()) {
            return zuvVar;
        }
        int iD = zuvVar.d();
        int iD2 = zuv.d(this.p);
        if (iD % iD2 != 0) {
            throw new IllegalStateException("Block offset " + iD + " doesn't align with preferred blocksize " + iD2 + "!");
        }
        return new zuv(this.p, zuvVar.j(), iD / iD2);
    }
}
