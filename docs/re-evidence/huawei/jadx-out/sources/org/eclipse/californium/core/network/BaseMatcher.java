package org.eclipse.californium.core.network;

import defpackage.aaex;
import defpackage.zve;
import defpackage.zvf;
import defpackage.zvg;
import defpackage.zxi;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.eclipse.californium.core.coap.MessageObserverAdapter;
import org.eclipse.californium.core.observe.NotificationListener;
import org.eclipse.californium.core.observe.ObservationStore;
import org.eclipse.californium.elements.EndpointContext;
import org.eclipse.californium.elements.EndpointIdentityResolver;
import org.eclipse.californium.elements.config.Configuration;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes20.dex */
public abstract class BaseMatcher implements Matcher {
    private static final Logger LOG = aaex.a((Class<?>) BaseMatcher.class);
    protected final Configuration config;
    public final MessageExchangeStore exchangeStore;
    protected final Executor executor;
    private final EndpointIdentityResolver identityResolver;
    private final NotificationListener notificationListener;
    protected final ObservationStore observationStore;
    public boolean running = false;
    protected final TokenGenerator tokenGenerator;

    @Override // org.eclipse.californium.core.network.Matcher
    public void clear() {
    }

    public BaseMatcher(Configuration configuration, NotificationListener notificationListener, TokenGenerator tokenGenerator, ObservationStore observationStore, MessageExchangeStore messageExchangeStore, EndpointIdentityResolver endpointIdentityResolver, Executor executor) {
        if (configuration == null) {
            throw new NullPointerException("Config must not be null");
        }
        if (notificationListener == null) {
            throw new NullPointerException("NotificationListener must not be null");
        }
        if (tokenGenerator == null) {
            throw new NullPointerException("TokenGenerator must not be null");
        }
        if (messageExchangeStore == null) {
            throw new NullPointerException("MessageExchangeStore must not be null");
        }
        if (observationStore == null) {
            throw new NullPointerException("ObservationStore must not be null");
        }
        if (endpointIdentityResolver == null) {
            throw new NullPointerException("EndpointIdentityResolver must not be null");
        }
        if (executor == null) {
            throw new NullPointerException("Executor must not be null");
        }
        this.config = configuration;
        this.notificationListener = notificationListener;
        this.exchangeStore = messageExchangeStore;
        this.observationStore = observationStore;
        this.tokenGenerator = tokenGenerator;
        this.identityResolver = endpointIdentityResolver;
        this.executor = executor;
    }

    @Override // org.eclipse.californium.core.network.Matcher
    public void start() {
        synchronized (this) {
            if (!this.running) {
                this.exchangeStore.start();
                this.observationStore.start();
                this.running = true;
            }
        }
    }

    @Override // org.eclipse.californium.core.network.Matcher
    public void stop() {
        synchronized (this) {
            if (this.running) {
                this.exchangeStore.stop();
                this.observationStore.stop();
                clear();
                this.running = false;
            }
        }
    }

    protected final void registerObserve(zvg zvgVar) {
        if (!zvgVar.getOptions().af() || zvgVar.getOptions().j().b() == 0) {
            LOG.debug("registering observe request {}", zvgVar);
            zve token = zvgVar.getToken();
            if (token == null) {
                do {
                    token = this.tokenGenerator.createToken(TokenGenerator.Scope.LONG_TERM);
                    zvgVar.setToken(token);
                } while (this.observationStore.putIfAbsent(token, new zxi(zvgVar, null)) != null);
            } else {
                this.observationStore.put(token, new zxi(zvgVar, null));
            }
            zvgVar.addMessageObserver(new e(token) { // from class: org.eclipse.californium.core.network.BaseMatcher.2
                @Override // org.eclipse.californium.core.coap.MessageObserverAdapter, org.eclipse.californium.core.coap.MessageObserver
                public void onCancel() {
                    a();
                }

                @Override // org.eclipse.californium.core.coap.MessageObserverAdapter
                public void failed() {
                    a();
                }

                @Override // org.eclipse.californium.core.coap.MessageObserverAdapter, org.eclipse.californium.core.coap.MessageObserver
                public void onContextEstablished(EndpointContext endpointContext) {
                    BaseMatcher.this.observationStore.setContext(this.g, endpointContext);
                }
            });
        }
    }

    protected final Exchange matchNotifyResponse(zvf zvfVar) {
        zve token;
        zxi zxiVar;
        if ((zvfVar.i() && !zvfVar.getOptions().ak()) || (zxiVar = this.observationStore.get((token = zvfVar.getToken()))) == null) {
            return null;
        }
        final zvg zvgVarC = zxiVar.c();
        Exchange exchange = new Exchange(zvgVarC, this.identityResolver.getEndpointIdentity(zvfVar.getSourceContext()), Exchange.Origin.LOCAL, this.executor, zxiVar.e(), true);
        LOG.debug("re-created exchange from original observe request: {}", zvgVarC);
        zvgVarC.addMessageObserver(new e(token) { // from class: org.eclipse.californium.core.network.BaseMatcher.1
            @Override // org.eclipse.californium.core.network.BaseMatcher.e, org.eclipse.californium.core.coap.MessageObserverAdapter, org.eclipse.californium.core.coap.MessageObserver
            public void onResponse(zvf zvfVar2) {
                try {
                    BaseMatcher.this.notificationListener.onNotification(zvgVarC, zvfVar2);
                } finally {
                    if (!zvfVar2.g()) {
                        BaseMatcher.LOG.debug("observation with token {} removed, removing from observation store", this.g);
                        a();
                    }
                }
            }
        });
        return exchange;
    }

    @Override // org.eclipse.californium.core.network.Matcher
    public void cancelObserve(zve zveVar) {
        boolean z = false;
        for (Exchange exchange : this.exchangeStore.findByToken(zveVar)) {
            zvg zvgVarP = exchange.p();
            if (zvgVarP.m()) {
                zvgVarP.cancel();
                if (!exchange.w()) {
                    z = true;
                }
                exchange.a();
            }
        }
        if (z) {
            return;
        }
        this.observationStore.remove(zveVar);
    }

    class e extends MessageObserverAdapter {
        protected final AtomicBoolean d;
        protected final zve g;

        public e(zve zveVar) {
            super(true);
            this.d = new AtomicBoolean();
            this.g = zveVar;
        }

        @Override // org.eclipse.californium.core.coap.MessageObserverAdapter, org.eclipse.californium.core.coap.MessageObserver
        public void onResponse(zvf zvfVar) {
            if (BaseMatcher.this.observationStore.get(this.g) != null) {
                if (zvfVar.h() || !zvfVar.g()) {
                    BaseMatcher.LOG.debug("observation with token {} not established, removing from observation store", this.g);
                    a();
                }
            }
        }

        protected void a() {
            if (this.d.compareAndSet(false, true)) {
                BaseMatcher.this.observationStore.remove(this.g);
            }
        }
    }
}
