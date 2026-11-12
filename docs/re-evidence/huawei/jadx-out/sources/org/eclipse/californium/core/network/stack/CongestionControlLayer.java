package org.eclipse.californium.core.network.stack;

import defpackage.aaex;
import defpackage.zvd;
import defpackage.zvf;
import defpackage.zvg;
import defpackage.zwx;
import defpackage.zxc;
import defpackage.zxd;
import defpackage.zxf;
import defpackage.zxg;
import defpackage.zxj;
import java.util.Queue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.eclipse.californium.core.coap.CoAP;
import org.eclipse.californium.core.coap.Message;
import org.eclipse.californium.core.coap.MessageObserverAdapter;
import org.eclipse.californium.core.config.CoapConfig;
import org.eclipse.californium.core.network.Exchange;
import org.eclipse.californium.core.observe.ObserveRelation;
import org.eclipse.californium.elements.config.Configuration;
import org.eclipse.californium.elements.util.LeastRecentlyUpdatedCache;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes20.dex */
public abstract class CongestionControlLayer extends ReliabilityLayer {
    private static final int EXCHANGELIMIT = 50;
    private static final Logger LOG = aaex.a((Class<?>) CongestionControlLayer.class);
    private static final int MAX_RTO = 60000;
    private static final int MIN_RTO = 500;
    private boolean appliesDithering;
    protected final Configuration config;
    private LeastRecentlyUpdatedCache<Object, RemoteEndpoint> remoteEndpoints;
    private zxg statistic;
    protected final String tag;
    private final boolean useInetSocketAddress;

    protected float calculateVBF(long j, float f) {
        return f;
    }

    protected abstract RemoteEndpoint createRemoteEndpoint(Object obj);

    public CongestionControlLayer(String str, Configuration configuration) {
        super(configuration);
        this.tag = str;
        this.config = configuration;
        LeastRecentlyUpdatedCache<Object, RemoteEndpoint> leastRecentlyUpdatedCache = new LeastRecentlyUpdatedCache<>(((Integer) configuration.c(CoapConfig.y)).intValue(), configuration.e(CoapConfig.ad, TimeUnit.SECONDS).longValue(), TimeUnit.SECONDS);
        this.remoteEndpoints = leastRecentlyUpdatedCache;
        leastRecentlyUpdatedCache.c(true);
        this.useInetSocketAddress = ((Boolean) configuration.c(CoapConfig.m)).booleanValue();
        setDithering(false);
    }

    @Override // org.eclipse.californium.core.network.stack.AbstractLayer, org.eclipse.californium.core.network.stack.Layer
    public void start() {
        zxg zxgVar = new zxg(this.tag, 5000, TimeUnit.MILLISECONDS, this.executor);
        this.statistic = zxgVar;
        zxgVar.start();
    }

    @Override // org.eclipse.californium.core.network.stack.AbstractLayer, org.eclipse.californium.core.network.stack.Layer
    public void destroy() {
        zxg zxgVar = this.statistic;
        if (zxgVar != null) {
            if (zxgVar.stop()) {
                zxgVar.dump();
            }
            this.statistic = null;
        }
    }

    protected RemoteEndpoint getRemoteEndpoint(Exchange exchange) {
        Object objQ;
        if (this.useInetSocketAddress) {
            objQ = exchange.t();
        } else {
            objQ = exchange.q();
        }
        this.remoteEndpoints.a(32);
        ReentrantReadWriteLock.WriteLock writeLockF = this.remoteEndpoints.f();
        writeLockF.lock();
        try {
            RemoteEndpoint remoteEndpointE = this.remoteEndpoints.e(objQ);
            if (remoteEndpointE == null) {
                remoteEndpointE = createRemoteEndpoint(objQ);
                this.remoteEndpoints.a(objQ, remoteEndpointE);
            }
            return remoteEndpointE;
        } finally {
            writeLockF.unlock();
        }
    }

    public boolean appliesDithering() {
        return this.appliesDithering;
    }

    public void setDithering(boolean z) {
        this.appliesDithering = z;
    }

    public RemoteEndpoint.RtoType getExchangeEstimatorState(Exchange exchange) {
        int iM = exchange.m();
        if (iM == 0) {
            return RemoteEndpoint.RtoType.STRONG;
        }
        if (iM == 1 || iM == 2) {
            return RemoteEndpoint.RtoType.WEAK;
        }
        return RemoteEndpoint.RtoType.NONE;
    }

    private boolean processResponse(RemoteEndpoint remoteEndpoint, Exchange exchange, zvf zvfVar) {
        int size;
        boolean zStartProcessingNotifies;
        exchange.a(zvfVar);
        if (!zvfVar.g()) {
            if (zvfVar.isConfirmable()) {
                return checkNSTART(remoteEndpoint, exchange);
            }
            return true;
        }
        Queue<b> notifyQueue = remoteEndpoint.getNotifyQueue();
        synchronized (remoteEndpoint) {
            b bVar = new b(exchange, zvfVar);
            notifyQueue.remove(bVar);
            size = notifyQueue.size();
            if (size < 50) {
                notifyQueue.add(bVar);
                zStartProcessingNotifies = remoteEndpoint.startProcessingNotifies();
            } else {
                zStartProcessingNotifies = false;
            }
        }
        if (size >= 50) {
            LOG.debug("{}drop outgoing notify, queue full {}", this.tag, Integer.valueOf(size));
        } else if (zStartProcessingNotifies) {
            this.executor.execute(new a(remoteEndpoint));
        }
        return false;
    }

    private boolean checkNSTART(RemoteEndpoint remoteEndpoint, Exchange exchange) {
        String str;
        Message messageJ;
        Queue<Exchange> responseQueue;
        int size;
        boolean z;
        boolean z2;
        if (exchange.ac()) {
            str = "req.-";
            messageJ = exchange.f();
            responseQueue = remoteEndpoint.getRequestQueue();
        } else {
            str = "resp.-";
            messageJ = exchange.j();
            responseQueue = remoteEndpoint.getResponseQueue();
        }
        synchronized (remoteEndpoint) {
            size = responseQueue.size();
            if (remoteEndpoint.registerExchange(exchange)) {
                z = true;
                z2 = false;
            } else if (size < 50) {
                responseQueue.add(exchange);
                z2 = true;
                z = false;
            } else {
                z = false;
                z2 = false;
            }
        }
        if (z) {
            messageJ.addMessageObserver(new e(remoteEndpoint, exchange));
            LOG.trace("{}send {}{}", this.tag, str, messageJ.getType());
            zxg zxgVar = this.statistic;
            if (zxgVar != null) {
                zxgVar.e();
            }
            return true;
        }
        if (z2) {
            zxg zxgVar2 = this.statistic;
            if (zxgVar2 != null) {
                zxgVar2.c();
            }
        } else {
            LOG.debug("{}drop {}{}, queue full {}", this.tag, str, messageJ.getType(), Integer.valueOf(size));
        }
        return false;
    }

    private void processRttMeasurement(Exchange exchange) {
        Long lB;
        RemoteEndpoint.RtoType exchangeEstimatorState;
        RemoteEndpoint remoteEndpoint = getRemoteEndpoint(exchange);
        zvf zvfVarJ = exchange.j();
        if (zvfVarJ != null && (lB = zvfVarJ.b()) != null && (exchangeEstimatorState = getExchangeEstimatorState(exchange)) != RemoteEndpoint.RtoType.NONE) {
            remoteEndpoint.processRttMeasurement(exchangeEstimatorState, Math.max(TimeUnit.NANOSECONDS.toMillis(lB.longValue()), 1L));
        }
        nextQueuedExchange(remoteEndpoint, exchange);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void nextQueuedExchange(final RemoteEndpoint remoteEndpoint, Exchange exchange) {
        final Exchange exchangePoll;
        String str;
        CoAP.Type type;
        int size;
        synchronized (remoteEndpoint) {
            if (remoteEndpoint.removeExchange(exchange)) {
                exchangePoll = remoteEndpoint.getResponseQueue().poll();
                if (exchangePoll == null) {
                    exchangePoll = remoteEndpoint.getRequestQueue().poll();
                }
                if (exchangePoll != null) {
                    remoteEndpoint.registerExchange(exchangePoll);
                }
            } else {
                exchangePoll = null;
            }
        }
        if (exchangePoll != null) {
            this.statistic.a();
            if (exchangePoll.ac()) {
                str = "req.-";
                type = exchangePoll.f().getType();
                size = remoteEndpoint.getRequestQueue().size();
            } else {
                str = "resp.-";
                type = exchangePoll.j().getType();
                size = remoteEndpoint.getResponseQueue().size();
            }
            LOG.trace("{}send from queue {}{}, queue left {}", this.tag, str, type, Integer.valueOf(size));
            exchangePoll.d(new Runnable() { // from class: org.eclipse.californium.core.network.stack.CongestionControlLayer.5
                @Override // java.lang.Runnable
                public void run() {
                    if (exchangePoll.y()) {
                        CongestionControlLayer.this.nextQueuedExchange(remoteEndpoint, exchangePoll);
                        return;
                    }
                    if (exchangePoll.ac()) {
                        CongestionControlLayer congestionControlLayer = CongestionControlLayer.this;
                        Exchange exchange2 = exchangePoll;
                        congestionControlLayer.sendRequest(exchange2, exchange2.f());
                    } else {
                        CongestionControlLayer congestionControlLayer2 = CongestionControlLayer.this;
                        Exchange exchange3 = exchangePoll;
                        congestionControlLayer2.sendResponse(exchange3, exchange3.j());
                    }
                }
            });
        }
    }

    @Override // org.eclipse.californium.core.network.stack.ReliabilityLayer, org.eclipse.californium.core.network.stack.AbstractLayer, org.eclipse.californium.core.network.stack.Layer
    public void sendRequest(Exchange exchange, zvg zvgVar) {
        if (exchange.m() > 0) {
            LOG.warn("{}retransmission in sendRequest", this.tag, new Throwable("retransmission"));
            return;
        }
        prepareRequest(exchange, zvgVar);
        RemoteEndpoint remoteEndpoint = getRemoteEndpoint(exchange);
        exchange.d(zvgVar);
        if (checkNSTART(remoteEndpoint, exchange)) {
            remoteEndpoint.checkAging();
            Logger logger = LOG;
            logger.debug("{}send request", this.tag);
            if (!remoteEndpoint.inFlightExchange(exchange)) {
                logger.warn("{}unregistered request", this.tag, new Throwable("unregistered request"));
            }
            lower().sendRequest(exchange, zvgVar);
        }
    }

    @Override // org.eclipse.californium.core.network.stack.ReliabilityLayer, org.eclipse.californium.core.network.stack.AbstractLayer, org.eclipse.californium.core.network.stack.Layer
    public void sendResponse(Exchange exchange, zvf zvfVar) {
        RemoteEndpoint remoteEndpoint = getRemoteEndpoint(exchange);
        prepareResponse(exchange, zvfVar);
        if (exchange.m() > 0) {
            if (zvfVar.g()) {
                lower().sendResponse(exchange, zvfVar);
                return;
            } else {
                LOG.warn("{}retransmission in sendResponse", this.tag, new Throwable("retransmission"));
                return;
            }
        }
        if (processResponse(remoteEndpoint, exchange, zvfVar)) {
            remoteEndpoint.checkAging();
            lower().sendResponse(exchange, zvfVar);
        }
    }

    @Override // org.eclipse.californium.core.network.stack.ReliabilityLayer
    protected void updateRetransmissionTimeout(Exchange exchange, zwx zwxVar) {
        int iMin;
        int iC;
        int iMin2 = Math.min(zwxVar.a(), 60000);
        RemoteEndpoint remoteEndpoint = getRemoteEndpoint(exchange);
        if (exchange.m() == 0) {
            if (this.defaultReliabilityLayerParameters == zwxVar) {
                iC = (int) remoteEndpoint.getRTO();
            } else {
                iC = zwxVar.c();
            }
            if (appliesDithering()) {
                iC = getRandomTimeout(iC, zwxVar.d());
            }
            iMin = Math.min(iMin2, Math.max(500, iC));
            exchange.e(calculateVBF(iMin, zwxVar.b()));
        } else {
            iMin = Math.min(iMin2, (int) (exchange.v() * exchange.g()));
        }
        exchange.e(iMin);
    }

    @Override // org.eclipse.californium.core.network.stack.ReliabilityLayer, org.eclipse.californium.core.network.stack.AbstractLayer, org.eclipse.californium.core.network.stack.Layer
    public void receiveResponse(Exchange exchange, zvf zvfVar) {
        LOG.debug("{}receive response", this.tag);
        if (processResponse(exchange, zvfVar)) {
            processRttMeasurement(exchange);
            zxg zxgVar = this.statistic;
            if (zxgVar != null) {
                zxgVar.b(zvfVar);
            }
            upper().receiveResponse(exchange, zvfVar);
        }
    }

    @Override // org.eclipse.californium.core.network.stack.ReliabilityLayer, org.eclipse.californium.core.network.stack.AbstractLayer, org.eclipse.californium.core.network.stack.Layer
    public void receiveEmptyMessage(Exchange exchange, zvd zvdVar) {
        if (processEmptyMessage(exchange, zvdVar)) {
            processRttMeasurement(exchange);
            upper().receiveEmptyMessage(exchange, zvdVar);
        }
    }

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final AtomicInteger f44444a = new AtomicInteger();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final RemoteEndpoint f44445b;

        public a(RemoteEndpoint remoteEndpoint) {
            this.f44445b = remoteEndpoint;
        }

        @Override // java.lang.Runnable
        public void run() {
            final b bVarPeek;
            int size;
            synchronized (this.f44445b) {
                bVarPeek = this.f44445b.getNotifyQueue().peek();
                if (bVarPeek == null) {
                    this.f44445b.stopProcessingNotifies();
                    size = 0;
                } else {
                    this.f44444a.incrementAndGet();
                    size = this.f44445b.getNotifyQueue().size();
                }
            }
            if (bVarPeek != null) {
                final long rto = this.f44445b.getRTO();
                CongestionControlLayer.LOG.trace("{}send notify from queue, left {}, next {} ms", CongestionControlLayer.this.tag, Integer.valueOf(size), Long.valueOf(rto));
                bVarPeek.e.d(new Runnable() { // from class: org.eclipse.californium.core.network.stack.CongestionControlLayer.a.5
                    /* JADX WARN: Code duplicated, block: B:29:0x00a9  */
                    @Override // java.lang.Runnable
                    public void run() {
                        long j;
                        try {
                            synchronized (a.this.f44445b) {
                                if (a.this.f44445b.getNotifyQueue().peek() != bVarPeek) {
                                    CongestionControlLayer.this.executor.execute(a.this);
                                    return;
                                }
                                a.this.f44445b.getNotifyQueue().remove();
                                ObserveRelation observeRelationS = bVarPeek.e.s();
                                if (observeRelationS == null || observeRelationS.i()) {
                                    j = 0;
                                } else {
                                    zvf zvfVarJ = bVarPeek.e.j();
                                    if (bVarPeek.f44447c != zvfVarJ) {
                                        if (zvfVarJ.g()) {
                                            CongestionControlLayer.LOG.warn("{} notify changed!", CongestionControlLayer.this.tag);
                                        } else {
                                            CongestionControlLayer.LOG.warn("{} notification finished!", CongestionControlLayer.this.tag);
                                        }
                                        CongestionControlLayer.this.executor.execute(a.this);
                                        return;
                                    }
                                    if (bVarPeek.e.y() || zvfVarJ.isCanceled()) {
                                        j = 0;
                                    } else {
                                        CongestionControlLayer.super.sendResponse(bVarPeek.e, zvfVarJ);
                                        j = rto;
                                    }
                                }
                                if (j > 0) {
                                    CongestionControlLayer.this.executor.schedule(a.this, j, TimeUnit.MILLISECONDS);
                                } else {
                                    CongestionControlLayer.this.executor.execute(a.this);
                                }
                            }
                        } catch (Throwable th) {
                            CongestionControlLayer.this.executor.execute(a.this);
                            throw th;
                        }
                    }
                });
            } else {
                CongestionControlLayer.LOG.debug("{}queue for outgoing notify stopped after {} jobs!", CongestionControlLayer.this.tag, Integer.valueOf(this.f44444a.getAndSet(0)));
            }
        }
    }

    class e extends MessageObserverAdapter {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final Exchange f44449c;
        final RemoteEndpoint e;

        public e(RemoteEndpoint remoteEndpoint, Exchange exchange) {
            this.e = remoteEndpoint;
            this.f44449c = exchange;
        }

        @Override // org.eclipse.californium.core.coap.MessageObserverAdapter, org.eclipse.californium.core.coap.MessageObserver
        public void onTimeout() {
            CongestionControlLayer.this.nextQueuedExchange(this.e, this.f44449c);
        }
    }

    public static class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Message f44447c;
        private final Exchange e;

        b(Exchange exchange, Message message) {
            this.e = exchange;
            this.f44447c = message;
        }

        public int hashCode() {
            return this.e.hashCode();
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.e.equals(((b) obj).e);
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: org.eclipse.californium.core.network.stack.CongestionControlLayer$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] d;

        static {
            int[] iArr = new int[CoapConfig.CongestionControlMode.values().length];
            d = iArr;
            try {
                iArr[CoapConfig.CongestionControlMode.COCOA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                d[CoapConfig.CongestionControlMode.COCOA_STRONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                d[CoapConfig.CongestionControlMode.BASIC_RTO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                d[CoapConfig.CongestionControlMode.LINUX_RTO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                d[CoapConfig.CongestionControlMode.PEAKHOPPER_RTO.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                d[CoapConfig.CongestionControlMode.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public static ReliabilityLayer newImplementation(String str, Configuration configuration) {
        ReliabilityLayer zxdVar;
        ReliabilityLayer reliabilityLayer;
        CoapConfig.CongestionControlMode congestionControlMode = (CoapConfig.CongestionControlMode) configuration.c(CoapConfig.o);
        switch (AnonymousClass3.d[congestionControlMode.ordinal()]) {
            case 1:
                zxdVar = new zxd(str, configuration, false);
                reliabilityLayer = zxdVar;
                break;
            case 2:
                zxdVar = new zxd(str, configuration, true);
                reliabilityLayer = zxdVar;
                break;
            case 3:
                zxdVar = new zxc(str, configuration);
                reliabilityLayer = zxdVar;
                break;
            case 4:
                zxdVar = new zxf(str, configuration);
                reliabilityLayer = zxdVar;
                break;
            case 5:
                zxdVar = new zxj(str, configuration);
                reliabilityLayer = zxdVar;
                break;
            case 6:
                reliabilityLayer = new ReliabilityLayer(configuration);
                break;
            default:
                reliabilityLayer = null;
                break;
        }
        if (reliabilityLayer != null) {
            if (congestionControlMode != CoapConfig.CongestionControlMode.NULL) {
                LOG.info("Enabling congestion control: {}", reliabilityLayer.getClass().getSimpleName());
            }
            return reliabilityLayer;
        }
        throw new IllegalArgumentException("Unsupported " + CoapConfig.o.getKey());
    }
}
