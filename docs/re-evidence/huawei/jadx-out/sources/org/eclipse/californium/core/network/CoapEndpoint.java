package org.eclipse.californium.core.network;

import defpackage.aaex;
import defpackage.zuw;
import defpackage.zvb;
import defpackage.zvd;
import defpackage.zve;
import defpackage.zvf;
import defpackage.zvg;
import defpackage.zvq;
import defpackage.zvr;
import defpackage.zvu;
import defpackage.zvy;
import defpackage.zvz;
import defpackage.zwc;
import defpackage.zwe;
import defpackage.zwi;
import defpackage.zwk;
import defpackage.zwl;
import defpackage.zwm;
import defpackage.zws;
import defpackage.zwu;
import defpackage.zxl;
import defpackage.zxx;
import defpackage.zyi;
import defpackage.zzj;
import defpackage.zzo;
import defpackage.zzp;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import org.eclipse.californium.core.coap.CoAP;
import org.eclipse.californium.core.coap.Message;
import org.eclipse.californium.core.coap.option.OptionRegistry;
import org.eclipse.californium.core.config.CoapConfig;
import org.eclipse.californium.core.network.interceptors.MalformedMessageInterceptor;
import org.eclipse.californium.core.network.interceptors.MessageInterceptor;
import org.eclipse.californium.core.network.serialization.DataParser;
import org.eclipse.californium.core.network.serialization.DataSerializer;
import org.eclipse.californium.core.network.stack.CoapStack;
import org.eclipse.californium.core.observe.NotificationListener;
import org.eclipse.californium.core.observe.ObservationStore;
import org.eclipse.californium.core.server.MessageDeliverer;
import org.eclipse.californium.elements.Connector;
import org.eclipse.californium.elements.EndpointContext;
import org.eclipse.californium.elements.EndpointContextMatcher;
import org.eclipse.californium.elements.EndpointIdentityResolver;
import org.eclipse.californium.elements.MessageCallback;
import org.eclipse.californium.elements.RawDataChannel;
import org.eclipse.californium.elements.UDPConnector;
import org.eclipse.californium.elements.config.Configuration;
import org.eclipse.californium.elements.util.ClockUtil;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes20.dex */
public class CoapEndpoint implements Endpoint, Executor {
    private static CoapStackFactory i;
    private ScheduledFuture<?> aa;
    private final String ad;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final CoapStack f44416c;
    private final MessageExchangeStore g;
    private final Connector h;
    private final Configuration j;
    private final Matcher k;
    private final EndpointIdentityResolver n;
    private ExecutorService o;
    private final int q;
    private final DataParser r;
    private final ObservationStore t;
    private final DataSerializer v;
    private final String w;
    private ScheduledExecutorService x;
    private volatile boolean y;
    private final boolean z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Logger f44414a = aaex.a((Class<?>) CoapEndpoint.class);
    private static final Logger d = aaex.a("org.eclipse.californium.ban");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AtomicBoolean f44415b = new AtomicBoolean();
    public static final CoapStackFactory e = new ExtendedCoapStackFactory() { // from class: org.eclipse.californium.core.network.CoapEndpoint.7
        @Override // org.eclipse.californium.core.network.ExtendedCoapStackFactory
        public CoapStack createCoapStack(String str, String str2, Configuration configuration, EndpointContextMatcher endpointContextMatcher, Outbox outbox, Object obj) {
            if (CoAP.b(str)) {
                return new zwu(str2, configuration, endpointContextMatcher, outbox);
            }
            return new zws(str2, configuration, endpointContextMatcher, outbox);
        }

        @Override // org.eclipse.californium.core.network.CoapStackFactory
        public CoapStack createCoapStack(String str, String str2, Configuration configuration, Outbox outbox, Object obj) {
            return createCoapStack(str, str2, configuration, null, outbox, obj);
        }
    };
    private List<EndpointObserver> p = new CopyOnWriteArrayList();
    private List<MessageInterceptor> l = new CopyOnWriteArrayList();
    private List<MessageInterceptor> u = new CopyOnWriteArrayList();
    private List<MalformedMessageInterceptor> m = new CopyOnWriteArrayList();
    private List<NotificationListener> s = new CopyOnWriteArrayList();
    private final EndpointReceiver f = new EndpointReceiver() { // from class: org.eclipse.californium.core.network.CoapEndpoint.4
        @Override // org.eclipse.californium.core.network.EndpointReceiver
        public void receiveRequest(Exchange exchange, zvg zvgVar) {
            if (CoapEndpoint.this.y) {
                exchange.d(CoapEndpoint.this);
                CoapEndpoint.this.f44416c.receiveRequest(exchange, zvgVar);
                CoapEndpoint coapEndpoint = CoapEndpoint.this;
                coapEndpoint.b(coapEndpoint.u, zvgVar);
            }
        }

        @Override // org.eclipse.californium.core.network.EndpointReceiver
        public void receiveResponse(Exchange exchange, zvf zvfVar) {
            if (CoapEndpoint.this.y) {
                if (exchange != null && !zvfVar.isCanceled()) {
                    exchange.d(CoapEndpoint.this);
                    if (!exchange.w()) {
                        zvfVar.d(exchange.c());
                        zvfVar.a(exchange.e());
                    }
                    CoapEndpoint.this.f44416c.receiveResponse(exchange, zvfVar);
                }
                CoapEndpoint coapEndpoint = CoapEndpoint.this;
                coapEndpoint.d((List<MessageInterceptor>) coapEndpoint.u, zvfVar);
            }
        }

        @Override // org.eclipse.californium.core.network.EndpointReceiver
        public void receiveEmptyMessage(Exchange exchange, zvd zvdVar) {
            zvf zvfVarJ;
            if (CoapEndpoint.this.y) {
                if (exchange != null && !zvdVar.isCanceled()) {
                    exchange.d(CoapEndpoint.this);
                    if (!exchange.ac() && (zvfVarJ = exchange.j()) != null && zvfVarJ.isConfirmable()) {
                        zvfVarJ.a(exchange.e());
                    }
                    CoapEndpoint.this.f44416c.receiveEmptyMessage(exchange, zvdVar);
                }
                CoapEndpoint coapEndpoint = CoapEndpoint.this;
                coapEndpoint.a((List<MessageInterceptor>) coapEndpoint.u, zvdVar);
            }
        }

        @Override // org.eclipse.californium.core.network.EndpointReceiver
        public void reject(Message message) {
            if (CoapEndpoint.this.y) {
                CoapEndpoint.this.f44416c.sendEmptyMessage(null, zvd.d(message));
            }
        }
    };

    protected CoapEndpoint(Connector connector, Configuration configuration, TokenGenerator tokenGenerator, ObservationStore observationStore, MessageExchangeStore messageExchangeStore, EndpointContextMatcher endpointContextMatcher, DataSerializer dataSerializer, DataParser dataParser, String str, CoapStackFactory coapStackFactory, Object obj) {
        Logger logger = d;
        if (logger.isInfoEnabled() && f44415b.compareAndSet(false, true)) {
            logger.info("Started.");
        }
        this.j = configuration;
        this.h = connector;
        connector.setRawDataReceiver(new c());
        this.w = CoAP.e(connector.getProtocol());
        this.q = ((Integer) configuration.c(CoapConfig.ag)).intValue();
        String strJ = zzp.j(str);
        this.ad = strJ;
        TokenGenerator zvzVar = tokenGenerator == null ? new zvz(configuration) : tokenGenerator;
        CoapStackFactory coapStackFactoryA = coapStackFactory == null ? a() : coapStackFactory;
        MessageExchangeStore zvuVar = messageExchangeStore != null ? messageExchangeStore : new zvu(strJ, configuration, zvzVar);
        this.g = zvuVar;
        ObservationStore zxlVar = observationStore != null ? observationStore : new zxl(configuration);
        this.t = zxlVar;
        EndpointContextMatcher endpointContextMatcherC = endpointContextMatcher == null ? zvq.c(connector, configuration) : endpointContextMatcher;
        this.n = endpointContextMatcherC;
        connector.setEndpointContextMatcher(endpointContextMatcherC);
        f44414a.info("{}{} uses {}", strJ, getClass().getSimpleName(), endpointContextMatcherC.getName());
        if (coapStackFactoryA instanceof ExtendedCoapStackFactory) {
            this.f44416c = ((ExtendedCoapStackFactory) coapStackFactoryA).createCoapStack(connector.getProtocol(), strJ, configuration, endpointContextMatcherC, new d(), obj);
        } else {
            this.f44416c = coapStackFactoryA.createCoapStack(connector.getProtocol(), strJ, configuration, new d(), obj);
        }
        if (CoAP.b(connector.getProtocol())) {
            this.z = false;
            this.k = new zwc(configuration, new a(), zvzVar, zxlVar, zvuVar, endpointContextMatcherC, this);
            this.v = dataSerializer != null ? dataSerializer : new zwl();
            this.r = dataParser != null ? dataParser : new zwk();
            return;
        }
        this.z = ((Boolean) configuration.c(CoapConfig.ax)).booleanValue();
        this.k = new zvy(configuration, new a(), zvzVar, zxlVar, zvuVar, this, endpointContextMatcherC);
        this.v = dataSerializer != null ? dataSerializer : new zwm();
        this.r = dataParser != null ? dataParser : new zwi();
    }

    @Override // org.eclipse.californium.core.network.Endpoint
    public void start() throws IOException {
        synchronized (this) {
            if (this.y) {
                f44414a.debug("{}Endpoint at {} is already started", this.ad, getUri());
                return;
            }
            if (!this.f44416c.hasDeliverer()) {
                setMessageDeliverer(new zvr.c());
            }
            if (this.o == null) {
                f44414a.info("{}Endpoint [{}] requires an executor to start, using default single-threaded daemon executor", this.ad, getUri());
                final ScheduledExecutorService scheduledExecutorServiceC = zzo.c(new zzj(":CoapEndpoint-" + this.h + '#'));
                setExecutors(scheduledExecutorServiceC, scheduledExecutorServiceC);
                addObserver(new EndpointObserver() { // from class: org.eclipse.californium.core.network.CoapEndpoint.3
                    @Override // org.eclipse.californium.core.network.EndpointObserver
                    public void started(Endpoint endpoint) {
                    }

                    @Override // org.eclipse.californium.core.network.EndpointObserver
                    public void stopped(Endpoint endpoint) {
                    }

                    @Override // org.eclipse.californium.core.network.EndpointObserver
                    public void destroyed(Endpoint endpoint) {
                        zzo.c(1000L, scheduledExecutorServiceC);
                    }
                });
            }
            try {
                f44414a.debug("{}Starting endpoint at {}", this.ad, getUri());
                this.k.start();
                this.h.start();
                this.f44416c.start();
                this.y = true;
                Iterator<EndpointObserver> it = this.p.iterator();
                while (it.hasNext()) {
                    it.next().started(this);
                }
                f44414a.info("{}Started endpoint at {}", this.ad, getUri());
            } catch (IOException e2) {
                stop();
                throw e2;
            }
        }
    }

    @Override // org.eclipse.californium.core.network.Endpoint
    public void stop() {
        synchronized (this) {
            URI uri = getUri();
            if (!this.y) {
                f44414a.debug("{}Endpoint at {} is already stopped", this.ad, uri);
            } else {
                f44414a.debug("{}Stopping endpoint at {}", this.ad, uri);
                this.y = false;
                ScheduledFuture<?> scheduledFuture = this.aa;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                    this.aa = null;
                }
                this.h.stop();
                this.k.stop();
                Iterator<EndpointObserver> it = this.p.iterator();
                while (it.hasNext()) {
                    it.next().stopped(this);
                }
                f44414a.debug("{}Stopped endpoint at {}", this.ad, uri);
            }
        }
    }

    @Override // org.eclipse.californium.core.network.Endpoint
    public void destroy() {
        synchronized (this) {
            f44414a.info("{}Destroying endpoint at {}", this.ad, getUri());
            if (this.y) {
                stop();
            }
            this.h.destroy();
            this.f44416c.destroy();
            Iterator<EndpointObserver> it = this.p.iterator();
            while (it.hasNext()) {
                it.next().destroyed(this);
            }
        }
    }

    @Override // org.eclipse.californium.core.network.Endpoint
    public void clear() {
        this.k.clear();
    }

    @Override // org.eclipse.californium.core.network.Endpoint
    public boolean isStarted() {
        return this.y;
    }

    @Override // org.eclipse.californium.core.network.Endpoint
    public void setExecutors(ScheduledExecutorService scheduledExecutorService, ScheduledExecutorService scheduledExecutorService2) {
        if (scheduledExecutorService == null || scheduledExecutorService2 == null) {
            throw new IllegalArgumentException("executors must not be null");
        }
        if (this.o == scheduledExecutorService && this.x == scheduledExecutorService2) {
            return;
        }
        if (this.y) {
            throw new IllegalStateException("endpoint already started!");
        }
        this.o = scheduledExecutorService;
        this.x = scheduledExecutorService2;
        this.f44416c.setExecutors(scheduledExecutorService, scheduledExecutorService2);
        this.g.setExecutor(this.x);
        this.t.setExecutor(this.x);
    }

    @Override // org.eclipse.californium.core.network.Endpoint
    public void addNotificationListener(NotificationListener notificationListener) {
        this.s.add(notificationListener);
    }

    @Override // org.eclipse.californium.core.network.Endpoint
    public void removeNotificationListener(NotificationListener notificationListener) {
        this.s.remove(notificationListener);
    }

    @Override // org.eclipse.californium.core.network.Endpoint
    public void addObserver(EndpointObserver endpointObserver) {
        this.p.add(endpointObserver);
        if (isStarted()) {
            endpointObserver.started(this);
        }
    }

    @Override // org.eclipse.californium.core.network.Endpoint
    public void removeObserver(EndpointObserver endpointObserver) {
        this.p.remove(endpointObserver);
    }

    @Override // org.eclipse.californium.core.network.Endpoint
    public void addInterceptor(MessageInterceptor messageInterceptor) {
        this.l.add(messageInterceptor);
    }

    @Override // org.eclipse.californium.core.network.Endpoint
    public void removeInterceptor(MessageInterceptor messageInterceptor) {
        this.l.remove(messageInterceptor);
    }

    @Override // org.eclipse.californium.core.network.Endpoint
    public List<MessageInterceptor> getInterceptors() {
        return Collections.unmodifiableList(this.l);
    }

    @Override // org.eclipse.californium.core.network.Endpoint
    public void addPostProcessInterceptor(MessageInterceptor messageInterceptor) {
        this.u.add(messageInterceptor);
        if (messageInterceptor instanceof MalformedMessageInterceptor) {
            this.m.add((MalformedMessageInterceptor) messageInterceptor);
        }
    }

    @Override // org.eclipse.californium.core.network.Endpoint
    public void removePostProcessInterceptor(MessageInterceptor messageInterceptor) {
        this.u.remove(messageInterceptor);
        if (messageInterceptor instanceof MalformedMessageInterceptor) {
            this.m.remove((MalformedMessageInterceptor) messageInterceptor);
        }
    }

    @Override // org.eclipse.californium.core.network.Endpoint
    public List<MessageInterceptor> getPostProcessInterceptors() {
        return Collections.unmodifiableList(this.u);
    }

    @Override // org.eclipse.californium.core.network.Endpoint
    public void sendRequest(final zvg zvgVar) {
        Object peerAddress;
        if (!this.y) {
            zvgVar.cancel();
            return;
        }
        InetSocketAddress peerAddress2 = zvgVar.getDestinationContext().getPeerAddress();
        int mid = zvgVar.getMID();
        if (zvgVar.j()) {
            if (this.q <= 0) {
                f44414a.warn("{}multicast messaging to destination {} is not enabled! Please enable it configuring \"" + CoapConfig.ag.getKey() + "\" greater than 0", this.ad, zzp.e(peerAddress2));
                zvgVar.setSendError(new IllegalArgumentException("multicast is not enabled!"));
                return;
            }
            if (zvgVar.getType() == CoAP.Type.CON) {
                f44414a.warn("{}CON request to multicast destination {} is not allowed, as per RFC 7252, 8.1, a client MUST use NON message type for multicast requests", this.ad, zzp.e(peerAddress2));
                zvgVar.setSendError(new IllegalArgumentException("multicast is not supported for CON!"));
                return;
            }
            if (zvgVar.hasMID() && mid < this.q) {
                f44414a.warn("{}multicast request to group {} has mid {} which is not in the MULTICAST_MID range [{}-65535]", this.ad, zzp.e(peerAddress2), Integer.valueOf(mid), Integer.valueOf(this.q));
                zvgVar.setSendError(new IllegalArgumentException("multicast mid is not in range [" + this.q + "-65535]"));
                return;
            }
        } else if (d(mid)) {
            f44414a.warn("{}request to {} has mid {}, which is in the MULTICAST_MID range [{}-65535]", this.ad, zzp.e(peerAddress2), Integer.valueOf(mid), Integer.valueOf(this.q));
            zvgVar.setSendError(new IllegalArgumentException("unicast mid is in multicast range [" + this.q + "-65535]"));
            return;
        }
        if (peerAddress2.isUnresolved()) {
            String strB = zzp.b(peerAddress2);
            f44414a.warn("{}request has unresolved destination address {}", this.ad, strB);
            zvgVar.setSendError(new IllegalArgumentException(strB + " is a unresolved address!"));
            return;
        }
        if (zvgVar.isSent()) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Request already sent!");
            f44414a.error("{}request was already sent!", this.ad, illegalArgumentException);
            zvgVar.setSendError(illegalArgumentException);
            return;
        }
        try {
            peerAddress = this.n.getEndpointIdentity(zvgVar.getDestinationContext());
        } catch (IllegalArgumentException e2) {
            if (zvgVar.getRawCode() == 0) {
                peerAddress = zvgVar.getDestinationContext().getPeerAddress();
            } else {
                throw e2;
            }
        }
        final Exchange exchange = new Exchange(zvgVar, peerAddress, Exchange.Origin.LOCAL, this.o);
        exchange.d(this);
        exchange.d(new Runnable() { // from class: org.eclipse.californium.core.network.CoapEndpoint.5
            @Override // java.lang.Runnable
            public void run() {
                CoapEndpoint.this.f44416c.sendRequest(exchange, zvgVar);
            }
        });
    }

    @Override // org.eclipse.californium.core.network.Endpoint
    public void sendResponse(final Exchange exchange, final zvf zvfVar) {
        if (!this.y) {
            zvfVar.cancel();
            return;
        }
        if (zvfVar.isSent()) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Response already sent!");
            f44414a.error("{}response was already sent!", this.ad, illegalArgumentException);
            zvfVar.setSendError(illegalArgumentException);
        } else if (exchange.d()) {
            this.f44416c.sendResponse(exchange, zvfVar);
        } else {
            exchange.d(new Runnable() { // from class: org.eclipse.californium.core.network.CoapEndpoint.2
                @Override // java.lang.Runnable
                public void run() {
                    CoapEndpoint.this.f44416c.sendResponse(exchange, zvfVar);
                }
            });
        }
    }

    @Override // org.eclipse.californium.core.network.Endpoint
    public void sendEmptyMessage(final Exchange exchange, final zvd zvdVar) {
        if (!this.y) {
            zvdVar.cancel();
            return;
        }
        if (zvdVar.isSent()) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Empty message already sent!");
            f44414a.error("{}empty message was already sent!", this.ad, illegalArgumentException);
            zvdVar.setSendError(illegalArgumentException);
        } else if (exchange.d()) {
            this.f44416c.sendEmptyMessage(exchange, zvdVar);
        } else {
            exchange.d(new Runnable() { // from class: org.eclipse.californium.core.network.CoapEndpoint.1
                @Override // java.lang.Runnable
                public void run() {
                    CoapEndpoint.this.f44416c.sendEmptyMessage(exchange, zvdVar);
                }
            });
        }
    }

    @Override // org.eclipse.californium.core.network.Endpoint
    public void setMessageDeliverer(MessageDeliverer messageDeliverer) {
        this.f44416c.setDeliverer(messageDeliverer);
    }

    @Override // org.eclipse.californium.core.network.Endpoint
    public InetSocketAddress getAddress() {
        return this.h.getAddress();
    }

    @Override // org.eclipse.californium.core.network.Endpoint
    public URI getUri() {
        try {
            InetSocketAddress address = getAddress();
            return new URI(this.w, null, zzp.e(address.getAddress()), address.getPort(), null, null, null);
        } catch (URISyntaxException e2) {
            f44414a.warn("{}URI", this.ad, e2);
            return null;
        }
    }

    @Override // org.eclipse.californium.core.network.Endpoint
    public Configuration getConfig() {
        return this.j;
    }

    class a implements NotificationListener {
        private a() {
        }

        @Override // org.eclipse.californium.core.observe.NotificationListener
        public void onNotification(zvg zvgVar, zvf zvfVar) {
            Iterator it = CoapEndpoint.this.s.iterator();
            while (it.hasNext()) {
                ((NotificationListener) it.next()).onNotification(zvgVar, zvfVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(List<MessageInterceptor> list, zvg zvgVar) {
        Iterator<MessageInterceptor> it = list.iterator();
        while (it.hasNext()) {
            it.next().sendRequest(zvgVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(List<MessageInterceptor> list, zvf zvfVar) {
        Iterator<MessageInterceptor> it = list.iterator();
        while (it.hasNext()) {
            it.next().sendResponse(zvfVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(List<MessageInterceptor> list, zvd zvdVar) {
        Iterator<MessageInterceptor> it = list.iterator();
        while (it.hasNext()) {
            it.next().sendEmptyMessage(zvdVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(List<MessageInterceptor> list, zvg zvgVar) {
        Iterator<MessageInterceptor> it = list.iterator();
        while (it.hasNext()) {
            it.next().receiveRequest(zvgVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(List<MessageInterceptor> list, zvf zvfVar) {
        Iterator<MessageInterceptor> it = list.iterator();
        while (it.hasNext()) {
            it.next().receiveResponse(zvfVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(List<MessageInterceptor> list, zvd zvdVar) {
        Iterator<MessageInterceptor> it = list.iterator();
        while (it.hasNext()) {
            it.next().receiveEmptyMessage(zvdVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(zxx zxxVar) {
        Iterator<MalformedMessageInterceptor> it = this.m.iterator();
        while (it.hasNext()) {
            it.next().receivedMalformedMessage(zxxVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean d(int i2) {
        int i3 = this.q;
        return i3 > 0 && i3 <= i2 && i2 <= 65535;
    }

    public class d implements Outbox {
        public d() {
        }

        @Override // org.eclipse.californium.core.network.Outbox
        public void sendRequest(Exchange exchange, zvg zvgVar) {
            e(zvgVar);
            exchange.d(zvgVar);
            CoapEndpoint.this.k.sendRequest(exchange);
            CoapEndpoint coapEndpoint = CoapEndpoint.this;
            coapEndpoint.d((List<MessageInterceptor>) coapEndpoint.l, zvgVar);
            zvgVar.setReadyToSend();
            if (!CoapEndpoint.this.y) {
                zvgVar.cancel();
            }
            if (zvgVar.isCanceled() || zvgVar.getSendError() != null) {
                exchange.a();
                return;
            }
            if (exchange.m() == 0) {
                exchange.ah();
            }
            CoapEndpoint.this.h.send(CoapEndpoint.this.v.serializeRequest(zvgVar, new ExchangeCallback<zvg>(exchange, zvgVar) { // from class: org.eclipse.californium.core.network.CoapEndpoint.d.5
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // org.eclipse.californium.core.network.CoapEndpoint.SendingCallback
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public void notifyPostProcess(zvg zvgVar2) {
                    CoapEndpoint.this.d((List<MessageInterceptor>) CoapEndpoint.this.u, zvgVar2);
                }
            }));
        }

        @Override // org.eclipse.californium.core.network.Outbox
        public void sendResponse(Exchange exchange, zvf zvfVar) {
            e(zvfVar);
            exchange.a(zvfVar);
            CoapEndpoint.this.k.sendResponse(exchange);
            CoapEndpoint coapEndpoint = CoapEndpoint.this;
            coapEndpoint.e((List<MessageInterceptor>) coapEndpoint.l, zvfVar);
            zvfVar.setReadyToSend();
            if (!CoapEndpoint.this.y) {
                zvfVar.cancel();
            }
            if (!zvfVar.isCanceled() && zvfVar.getSendError() == null) {
                zxx zxxVarSerializeResponse = CoapEndpoint.this.v.serializeResponse(zvfVar, new ExchangeCallback<zvf>(exchange, zvfVar) { // from class: org.eclipse.californium.core.network.CoapEndpoint.d.1
                    /* JADX INFO: Access modifiers changed from: protected */
                    @Override // org.eclipse.californium.core.network.CoapEndpoint.SendingCallback
                    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
                    public void notifyPostProcess(zvf zvfVar2) {
                        CoapEndpoint.this.e((List<MessageInterceptor>) CoapEndpoint.this.u, zvfVar2);
                        if (CoapEndpoint.this.z) {
                            this.exchange.f().offload(Message.OffloadMode.FULL);
                            zvfVar2.offload(Message.OffloadMode.PAYLOAD);
                        }
                    }
                });
                if (zvfVar.isConfirmable() && exchange.m() == 0) {
                    exchange.ah();
                }
                CoapEndpoint.this.h.send(zxxVarSerializeResponse);
                return;
            }
            exchange.a();
        }

        @Override // org.eclipse.californium.core.network.Outbox
        public void sendEmptyMessage(Exchange exchange, zvd zvdVar) {
            e(zvdVar);
            CoapEndpoint.this.k.sendEmptyMessage(exchange, zvdVar);
            CoapEndpoint coapEndpoint = CoapEndpoint.this;
            coapEndpoint.e((List<MessageInterceptor>) coapEndpoint.l, zvdVar);
            zvdVar.setReadyToSend();
            if (!CoapEndpoint.this.y) {
                zvdVar.cancel();
            }
            if (zvdVar.isCanceled() || zvdVar.getSendError() != null) {
                if (exchange != null) {
                    exchange.a();
                }
            } else if (exchange != null) {
                CoapEndpoint.this.h.send(CoapEndpoint.this.v.serializeEmptyMessage(zvdVar, new ExchangeCallback<zvd>(exchange, zvdVar) { // from class: org.eclipse.californium.core.network.CoapEndpoint.d.2
                    /* JADX INFO: Access modifiers changed from: protected */
                    @Override // org.eclipse.californium.core.network.CoapEndpoint.SendingCallback
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public void notifyPostProcess(zvd zvdVar2) {
                        CoapEndpoint.this.e((List<MessageInterceptor>) CoapEndpoint.this.u, zvdVar2);
                    }
                }));
            } else {
                CoapEndpoint.this.h.send(CoapEndpoint.this.v.serializeEmptyMessage(zvdVar, new SendingCallback<zvd>(zvdVar) { // from class: org.eclipse.californium.core.network.CoapEndpoint.d.4
                    /* JADX INFO: Access modifiers changed from: protected */
                    @Override // org.eclipse.californium.core.network.CoapEndpoint.SendingCallback
                    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                    public void notifyPostProcess(zvd zvdVar2) {
                        CoapEndpoint.this.e((List<MessageInterceptor>) CoapEndpoint.this.u, zvdVar2);
                    }
                }));
            }
        }

        private void e(Message message) {
            if (message.getDestinationContext() == null) {
                throw new IllegalArgumentException("Message has no endpoint context");
            }
        }
    }

    class c implements RawDataChannel {
        private c() {
        }

        @Override // org.eclipse.californium.elements.RawDataChannel
        public void receiveData(final zxx zxxVar) {
            if (zxxVar.c() == null) {
                throw new IllegalArgumentException("received message that does not have a endpoint context");
            }
            if (zxxVar.c().getPeerAddress() == null) {
                throw new IllegalArgumentException("received message that does not have a source address");
            }
            if (zxxVar.c().getPeerAddress().getPort() != 0) {
                if (CoapEndpoint.this.y) {
                    CoapEndpoint.this.execute(new Runnable() { // from class: org.eclipse.californium.core.network.CoapEndpoint.c.3
                        @Override // java.lang.Runnable
                        public void run() {
                            c.this.a(zxxVar);
                        }
                    });
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("received message that does not have a source port");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(zxx zxxVar) {
            zvb zvbVar;
            zvb zvbVar2;
            int i;
            char cCharAt;
            EndpointContext endpointContextC = zxxVar.c();
            try {
                Message message = CoapEndpoint.this.r.parseMessage(zxxVar);
                if (CoAP.a(message.getRawCode())) {
                    b((zvg) message);
                    return;
                }
                if (CoAP.f(message.getRawCode())) {
                    if (zxxVar.f()) {
                        CoapEndpoint.f44414a.debug("{}multicast-receiver silently ignoring responses from {}", CoapEndpoint.this.ad, zxxVar.c());
                        return;
                    } else {
                        e((zvf) message);
                        return;
                    }
                }
                if (CoAP.b(message.getRawCode())) {
                    if (zxxVar.f()) {
                        CoapEndpoint.f44414a.debug("{}multicast-receiver silently ignoring empty messages from {}", CoapEndpoint.this.ad, zxxVar.c());
                        return;
                    } else {
                        c((zvd) message);
                        return;
                    }
                }
                if (!zxxVar.f()) {
                    CoapEndpoint.f44414a.debug("{}silently ignoring non-CoAP message from {}", CoapEndpoint.this.ad, endpointContextC);
                } else {
                    CoapEndpoint.f44414a.debug("{}multicast-receiver silently ignoring non-CoAP message from {}", CoapEndpoint.this.ad, zxxVar.c());
                }
                zvbVar2 = null;
                CoapEndpoint.this.e(zxxVar);
                if (CoapEndpoint.d.isInfoEnabled()) {
                    String hostAddress = endpointContextC.getPeerAddress().getAddress().getHostAddress();
                    String protocol = CoapEndpoint.this.h.getProtocol();
                    StringBuilder sb = new StringBuilder();
                    if (zvbVar2 != null) {
                        sb.append(zvbVar2.getMessage().trim());
                        int length = sb.length();
                        if (length > 0 && (cCharAt = sb.charAt((i = length - 1))) != '.' && cCharAt != '!' && cCharAt != ';' && cCharAt != '#') {
                            if (cCharAt == ':') {
                                sb.setLength(i);
                            }
                            sb.append(";");
                        }
                        sb.append(" ");
                    }
                    sb.append(zzp.a(zxxVar.b(), (char) 0, 8));
                    CoapEndpoint.d.info("{}{} {} Ban: {}", CoapEndpoint.this.ad, sb, protocol, hostAddress);
                }
            } catch (zuw e) {
                if (!e.f() || !e.d() || zxxVar.f()) {
                    CoapEndpoint.f44414a.debug("{}discarding malformed message from [{}]: {}", CoapEndpoint.this.ad, endpointContextC, e.getMessage());
                    zvbVar = e;
                } else if (CoAP.a(e.a()) && e.b() != null && e.c() != null) {
                    e(endpointContextC, e);
                    CoapEndpoint.f44414a.debug("{}respond malformed request from [{}], reason: {}", CoapEndpoint.this.ad, endpointContextC, e.getMessage());
                    zvbVar = e;
                } else {
                    b(zxxVar, e);
                    CoapEndpoint.f44414a.debug("{}rejected malformed message from [{}], reason: {}", CoapEndpoint.this.ad, endpointContextC, e.getMessage());
                    zvbVar = e;
                }
                zvbVar2 = zvbVar;
            } catch (zvb e2) {
                CoapEndpoint.f44414a.debug("{}discarding malformed message from [{}]: {}", CoapEndpoint.this.ad, endpointContextC, e2.getMessage());
                zvbVar = e2;
                zvbVar2 = zvbVar;
            }
        }

        private void e(EndpointContext endpointContext, zuw zuwVar) {
            zvf zvfVar = new zvf(zuwVar.c(), true);
            zvfVar.setDestinationContext(endpointContext);
            zvfVar.setToken(zuwVar.b());
            zvfVar.setMID(zuwVar.e());
            zvfVar.setType(CoAP.Type.ACK);
            zvfVar.setPayload(zuwVar.getMessage());
            CoapEndpoint coapEndpoint = CoapEndpoint.this;
            coapEndpoint.e((List<MessageInterceptor>) coapEndpoint.l, zvfVar);
            zvfVar.setReadyToSend();
            if (!CoapEndpoint.this.y) {
                zvfVar.cancel();
            }
            CoapEndpoint.this.h.send(CoapEndpoint.this.v.serializeResponse(zvfVar, new SendingCallback<zvf>(zvfVar) { // from class: org.eclipse.californium.core.network.CoapEndpoint.c.2
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // org.eclipse.californium.core.network.CoapEndpoint.SendingCallback
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public void notifyPostProcess(zvf zvfVar2) {
                    CoapEndpoint.this.e((List<MessageInterceptor>) CoapEndpoint.this.u, zvfVar2);
                }
            }));
        }

        private void b(zxx zxxVar, zuw zuwVar) {
            zvd zvdVar = new zvd(CoAP.Type.RST);
            zvdVar.setMID(zuwVar.e());
            zvdVar.setDestinationContext(zxxVar.c());
            CoapEndpoint.this.f44416c.sendEmptyMessage(null, zvdVar);
        }

        private void b(zvg zvgVar) {
            zvgVar.a(CoapEndpoint.this.w);
            if (!CoapEndpoint.this.y) {
                CoapEndpoint.f44414a.debug("{}not running, drop request {}", CoapEndpoint.this.ad, zvgVar);
                return;
            }
            CoapEndpoint coapEndpoint = CoapEndpoint.this;
            coapEndpoint.b(coapEndpoint.l, zvgVar);
            if (zvgVar.isCanceled()) {
                return;
            }
            CoapEndpoint.this.k.receiveRequest(zvgVar, CoapEndpoint.this.f);
        }

        private void e(zvf zvfVar) {
            CoapEndpoint coapEndpoint = CoapEndpoint.this;
            coapEndpoint.d((List<MessageInterceptor>) coapEndpoint.l, zvfVar);
            if (zvfVar.isCanceled()) {
                return;
            }
            CoapEndpoint.this.k.receiveResponse(zvfVar, CoapEndpoint.this.f);
        }

        private void c(zvd zvdVar) {
            CoapEndpoint coapEndpoint = CoapEndpoint.this;
            coapEndpoint.a((List<MessageInterceptor>) coapEndpoint.l, zvdVar);
            if (zvdVar.isCanceled()) {
                return;
            }
            if ((zvdVar.getType() == CoAP.Type.CON || zvdVar.getType() == CoAP.Type.NON) && zvdVar.hasMID()) {
                CoapEndpoint.f44414a.debug("{}responding to ping from {}", CoapEndpoint.this.ad, zvdVar.getSourceContext());
                CoapEndpoint.this.f.reject(zvdVar);
            } else {
                if (!CoapEndpoint.this.d(zvdVar.getMID())) {
                    CoapEndpoint.this.k.receiveEmptyMessage(zvdVar, CoapEndpoint.this.f);
                    return;
                }
                CoapEndpoint.f44414a.debug("{} silently ignoring empty messages for multicast request {}", CoapEndpoint.this.ad, zvdVar.getSourceContext());
                zvdVar.setCanceled(true);
                CoapEndpoint.this.f.receiveEmptyMessage(null, zvdVar);
            }
        }
    }

    static abstract class SendingCallback<T extends Message> implements MessageCallback {
        private final T message;

        protected abstract void notifyPostProcess(T t);

        protected void onContextEstablished(EndpointContext endpointContext, long j) {
        }

        public SendingCallback(T t) {
            if (t == null) {
                throw new NullPointerException("message must not be null");
            }
            this.message = t;
        }

        @Override // org.eclipse.californium.elements.MessageCallback
        public void onConnecting() {
            this.message.onConnecting();
        }

        @Override // org.eclipse.californium.elements.MessageCallback
        public void onDtlsRetransmission(int i) {
            this.message.onDtlsRetransmission(i);
        }

        @Override // org.eclipse.californium.elements.MessageCallback
        public final void onContextEstablished(EndpointContext endpointContext) {
            long jC = ClockUtil.c();
            this.message.setNanoTimestamp(jC);
            onContextEstablished(endpointContext, jC);
        }

        @Override // org.eclipse.californium.elements.MessageCallback
        public void onSent() {
            if (this.message.isSent()) {
                this.message.setDuplicate(true);
            }
            this.message.setSent(true);
            notifyPostProcess(this.message);
        }

        @Override // org.eclipse.californium.elements.MessageCallback
        public void onError(Throwable th) {
            this.message.setSendError(th);
            notifyPostProcess(this.message);
        }
    }

    static abstract class ExchangeCallback<T extends Message> extends SendingCallback<T> {
        protected final Exchange exchange;

        public ExchangeCallback(Exchange exchange, T t) {
            super(t);
            if (exchange == null) {
                throw new NullPointerException("exchange must not be null");
            }
            this.exchange = exchange;
        }

        @Override // org.eclipse.californium.core.network.CoapEndpoint.SendingCallback
        protected void onContextEstablished(EndpointContext endpointContext, long j) {
            Exchange exchange = this.exchange;
            if (j == 0) {
                j = -1;
            }
            exchange.e(j);
            this.exchange.a(endpointContext);
        }
    }

    @Override // org.eclipse.californium.core.network.Endpoint
    public void cancelObservation(zve zveVar) {
        this.k.cancelObserve(zveVar);
    }

    @Override // java.util.concurrent.Executor
    public void execute(final Runnable runnable) {
        ExecutorService executorService = this.o;
        if (executorService == null) {
            f44414a.error("{}Executor not ready!", this.ad, new Throwable("execution failed!"));
            return;
        }
        try {
            executorService.execute(new Runnable() { // from class: org.eclipse.californium.core.network.CoapEndpoint.6
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        runnable.run();
                    } catch (Throwable th) {
                        CoapEndpoint.f44414a.error("{}exception in protocol stage thread: {}", CoapEndpoint.this.ad, th.getMessage(), th);
                    }
                }
            });
        } catch (RejectedExecutionException e2) {
            f44414a.debug("{} execute:", this.ad, e2);
        }
    }

    public static class e {
        private CoapStackFactory d;
        private Object f;
        private OptionRegistry h;
        private DataParser k;
        private String l;
        private DataSerializer m;
        private TokenGenerator n;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Configuration f44431b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private InetSocketAddress f44432c = null;
        private Connector e = null;
        private ObservationStore g = null;
        private MessageExchangeStore j = null;
        private EndpointContextMatcher i = null;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Deprecated
        private int[] f44430a = new int[0];

        public e c(Connector connector) {
            if (this.f44432c != null || this.e != null) {
                throw new IllegalStateException("bind address already defined!");
            }
            if ((connector instanceof zyi) && ((zyi) connector).a()) {
                throw new IllegalStateException("connector must not be a multicast receiver!");
            }
            this.e = connector;
            return this;
        }

        public e d(DataSerializer dataSerializer, DataParser dataParser) {
            this.m = dataSerializer;
            this.k = dataParser;
            return this;
        }

        public CoapEndpoint a() {
            zvu zvuVar;
            if (this.f44431b == null) {
                this.f44431b = Configuration.e();
            }
            if (this.e == null) {
                if (this.f44432c == null) {
                    this.f44432c = new InetSocketAddress(0);
                }
                this.e = new UDPConnector(this.f44432c, this.f44431b);
            }
            if (this.n == null) {
                this.n = new zvz(this.f44431b);
            }
            if (this.g == null) {
                this.g = new zxl(this.f44431b);
            }
            if (this.i == null) {
                this.i = zvq.c(this.e, this.f44431b);
            }
            if (this.l == null) {
                this.l = CoAP.e(this.e.getProtocol());
            }
            this.l = zzp.j(this.l);
            if (this.j == null) {
                zvuVar = new zvu(this.l, this.f44431b, this.n);
                this.j = zvuVar;
            } else {
                zvuVar = null;
            }
            if (this.d == null) {
                this.d = CoapEndpoint.a();
            }
            if (this.k == null) {
                if (CoAP.b(this.e.getProtocol())) {
                    OptionRegistry optionRegistry = this.h;
                    if (optionRegistry != null) {
                        this.k = new zwk(optionRegistry);
                    } else {
                        this.k = new zwk(this.f44430a);
                    }
                    if (zvuVar != null) {
                        zvuVar.d(new zwe());
                    }
                } else {
                    boolean zBooleanValue = ((Boolean) this.f44431b.c(CoapConfig.av)).booleanValue();
                    OptionRegistry optionRegistry2 = this.h;
                    if (optionRegistry2 != null) {
                        this.k = new zwi(zBooleanValue, optionRegistry2);
                    } else {
                        this.k = new zwi(zBooleanValue, this.f44430a);
                    }
                }
            }
            return new CoapEndpoint(this.e, this.f44431b, this.n, this.g, this.j, this.i, this.m, this.k, this.l, this.d, this.f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static CoapStackFactory a() {
        CoapStackFactory coapStackFactory;
        synchronized (CoapEndpoint.class) {
            if (i == null) {
                i = e;
            }
            coapStackFactory = i;
        }
        return coapStackFactory;
    }
}
