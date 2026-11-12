package defpackage;

import java.net.InetSocketAddress;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import org.eclipse.californium.core.coap.CoAP;
import org.eclipse.californium.core.network.BaseMatcher;
import org.eclipse.californium.core.network.EndpointReceiver;
import org.eclipse.californium.core.network.Exchange;
import org.eclipse.californium.core.network.MessageExchangeStore;
import org.eclipse.californium.core.network.RemoveHandler;
import org.eclipse.californium.core.network.TokenGenerator;
import org.eclipse.californium.core.observe.NotificationListener;
import org.eclipse.californium.core.observe.ObservationStore;
import org.eclipse.californium.elements.EndpointContext;
import org.eclipse.californium.elements.EndpointContextMatcher;
import org.eclipse.californium.elements.config.Configuration;
import org.eclipse.californium.elements.util.NetworkInterfacesUtil;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes20.dex */
public final class zvy extends BaseMatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Logger f54641a = aaex.a((Class<?>) zvy.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final EndpointContextMatcher f54642b;
    private final RemoveHandler d;

    public zvy(Configuration configuration, NotificationListener notificationListener, TokenGenerator tokenGenerator, ObservationStore observationStore, MessageExchangeStore messageExchangeStore, Executor executor, EndpointContextMatcher endpointContextMatcher) {
        super(configuration, notificationListener, tokenGenerator, observationStore, messageExchangeStore, endpointContextMatcher, executor);
        this.d = new a();
        this.f54642b = endpointContextMatcher;
    }

    @Override // org.eclipse.californium.core.network.Matcher
    public void sendRequest(Exchange exchange) {
        zvg zvgVarF = exchange.f();
        if (zvgVarF.m() && exchange.m() == 0) {
            if (this.exchangeStore.assignMessageId(zvgVarF) != -1) {
                registerObserve(zvgVarF);
            } else {
                f54641a.debug("message IDs exhausted, could not register outbound observe request for tracking");
                zvgVarF.setSendError(new IllegalStateException("automatic message IDs exhausted"));
                return;
            }
        }
        try {
            if (this.exchangeStore.registerOutboundRequest(exchange)) {
                exchange.c(this.d);
                f54641a.debug("tracking open request [{}, {}]", exchange.n(), exchange.l());
            } else {
                f54641a.debug("message IDs exhausted, could not register outbound request for tracking");
                zvgVarF.setSendError(new IllegalStateException("automatic message IDs exhausted"));
            }
        } catch (IllegalArgumentException e) {
            zvgVarF.setSendError(e);
        }
    }

    @Override // org.eclipse.californium.core.network.Matcher
    public void sendResponse(Exchange exchange) {
        zvf zvfVarJ = exchange.j();
        zvfVarJ.e(exchange.f().getToken());
        if (zvfVarJ.getType() == CoAP.Type.CON) {
            exchange.z();
            if (this.exchangeStore.registerOutboundResponse(exchange)) {
                f54641a.debug("tracking open response [{}]", exchange.n());
                return;
            }
            zvfVarJ.setSendError(new IllegalStateException("automatic message IDs exhausted"));
        } else if (zvfVarJ.getType() == CoAP.Type.NON) {
            if (zvfVarJ.g()) {
                if (this.exchangeStore.registerOutboundResponse(exchange)) {
                    return;
                } else {
                    zvfVarJ.setSendError(new IllegalStateException("automatic message IDs exhausted"));
                }
            } else if (this.exchangeStore.assignMessageId(zvfVarJ) == -1) {
                zvfVarJ.setSendError(new IllegalStateException("automatic message IDs exhausted"));
            }
        }
        exchange.ai();
    }

    @Override // org.eclipse.californium.core.network.Matcher
    public void sendEmptyMessage(Exchange exchange, zvd zvdVar) {
        zvdVar.setToken(zve.e);
        if (zvdVar.getType() != CoAP.Type.RST || exchange == null) {
            return;
        }
        exchange.a();
    }

    @Override // org.eclipse.californium.core.network.Matcher
    public void receiveRequest(final zvg zvgVar, final EndpointReceiver endpointReceiver) {
        EndpointContext sourceContext;
        Object endpointIdentity = this.f54642b.getEndpointIdentity(zvgVar.getSourceContext());
        zvv zvvVar = new zvv(zvgVar.getMID(), endpointIdentity);
        final Exchange exchange = new Exchange(zvgVar, endpointIdentity, Exchange.Origin.REMOTE, this.executor);
        final Exchange exchangeFindPrevious = this.exchangeStore.findPrevious(zvvVar, exchange);
        boolean zIsToBeSent = exchangeFindPrevious != null;
        if (zIsToBeSent) {
            EndpointContext sourceContext2 = zvgVar.getSourceContext();
            zvg zvgVarF = exchangeFindPrevious.f();
            if (exchangeFindPrevious.ac()) {
                sourceContext = zvgVarF.getDestinationContext();
            } else {
                sourceContext = zvgVarF.getSourceContext();
            }
            zIsToBeSent = this.f54642b.isToBeSent(sourceContext, sourceContext2);
            if (!zIsToBeSent) {
                if (this.exchangeStore.replacePrevious(zvvVar, exchangeFindPrevious, exchange)) {
                    f54641a.debug("replaced request {} by new request {}!", zvgVarF, zvgVar);
                } else {
                    f54641a.warn("new request {} could not be registered! Deduplication disabled!", zvgVar);
                }
            } else if (zvgVarF.j() || zvgVar.j()) {
                InetSocketAddress localAddress = zvgVar.getLocalAddress();
                InetSocketAddress localAddress2 = zvgVarF.getLocalAddress();
                if (!NetworkInterfacesUtil.a(localAddress, localAddress2)) {
                    boolean zC = zzg.c(zvgVar.getToken(), zvgVarF.getToken());
                    long millis = TimeUnit.NANOSECONDS.toMillis(Math.abs(zvgVar.getNanoTimestamp() - zvgVarF.getNanoTimestamp()));
                    if (!zC) {
                        f54641a.info("received different requests {} with same MID via different multicast groups ({} != {}) within {}ms!", zvgVar, zzp.e(localAddress), zzp.e(localAddress2), Long.valueOf(millis));
                    } else {
                        f54641a.warn("received requests {} via different multicast groups ({} != {}) within {}ms!", zvgVar, zzp.e(localAddress), zzp.e(localAddress2), Long.valueOf(millis));
                    }
                }
            }
        }
        if (zIsToBeSent && exchangeFindPrevious != null) {
            f54641a.trace("duplicate request: {}", zvgVar);
            zvgVar.setDuplicate(true);
            exchangeFindPrevious.d(new Runnable() { // from class: zvy.2
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        endpointReceiver.receiveRequest(exchangeFindPrevious, zvgVar);
                    } catch (RuntimeException e) {
                        zvy.f54641a.warn("error receiving again request {}", zvgVar, e);
                        if (zvgVar.j()) {
                            return;
                        }
                        endpointReceiver.reject(zvgVar);
                    }
                }
            });
        } else {
            exchange.c(this.d);
            exchange.d(new Runnable() { // from class: zvy.4
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        endpointReceiver.receiveRequest(exchange, zvgVar);
                    } catch (RuntimeException e) {
                        zvy.f54641a.warn("error receiving request {}", zvgVar, e);
                        if (zvgVar.j()) {
                            return;
                        }
                        endpointReceiver.reject(zvgVar);
                    }
                }
            });
        }
    }

    @Override // org.eclipse.californium.core.network.Matcher
    public void receiveResponse(final zvf zvfVar, final EndpointReceiver endpointReceiver) {
        final Object endpointIdentity = this.f54642b.getEndpointIdentity(zvfVar.getSourceContext());
        final zvt keyToken = this.tokenGenerator.getKeyToken(zvfVar.getToken(), endpointIdentity);
        Logger logger = f54641a;
        logger.trace("received response {} from {}", zvfVar, zvfVar.getSourceContext());
        Exchange exchangeMatchNotifyResponse = this.exchangeStore.get(keyToken);
        if (exchangeMatchNotifyResponse == null) {
            if (zvfVar.getType() != CoAP.Type.ACK) {
                final Exchange exchangeFind = this.exchangeStore.find(new zvv(zvfVar.getMID(), endpointIdentity));
                if (exchangeFind != null) {
                    exchangeFind.d(new Runnable() { // from class: zvy.1
                        @Override // java.lang.Runnable
                        public void run() {
                            if (exchangeFind.f().j()) {
                                zvy.f54641a.debug("Ignore delayed response {} to multicast request {}", zvfVar, zzp.e(exchangeFind.f().getDestinationContext().getPeerAddress()));
                                zvy.this.c(zvfVar, endpointReceiver);
                                return;
                            }
                            try {
                                if (zvy.this.f54642b.isResponseRelatedToRequest(exchangeFind.h(), zvfVar.getSourceContext())) {
                                    zvy.f54641a.trace("received response {} for already completed {}", zvfVar, exchangeFind);
                                    zvfVar.setDuplicate(true);
                                    zvf zvfVarJ = exchangeFind.j();
                                    if (zvfVarJ != null) {
                                        zvfVar.setRejected(zvfVarJ.isRejected());
                                    }
                                    endpointReceiver.receiveResponse(exchangeFind, zvfVar);
                                    return;
                                }
                                zvy.f54641a.debug("ignoring potentially forged response {} for already completed {}", zvfVar, exchangeFind);
                                zvy.this.e(zvfVar, endpointReceiver);
                            } catch (RuntimeException e) {
                                zvy.f54641a.warn("error receiving response {} for {}", zvfVar, exchangeFind, e);
                            }
                        }
                    });
                    return;
                }
            }
            exchangeMatchNotifyResponse = matchNotifyResponse(zvfVar);
            if (exchangeMatchNotifyResponse == null) {
                if (zvfVar.getType() == CoAP.Type.ACK) {
                    logger.trace("discarding by [{}] unmatchable piggy-backed response from [{}]: {}", keyToken, zvfVar.getSourceContext(), zvfVar);
                    c(zvfVar, endpointReceiver);
                    return;
                } else {
                    logger.trace("discarding by [{}] unmatchable response from [{}]: {}", keyToken, zvfVar.getSourceContext(), zvfVar);
                    e(zvfVar, endpointReceiver);
                    return;
                }
            }
        }
        final Exchange exchange = exchangeMatchNotifyResponse;
        exchangeMatchNotifyResponse.d(new Runnable() { // from class: zvy.5
            @Override // java.lang.Runnable
            public void run() {
                Exchange exchangeFindPrevious;
                if ((!exchange.w() || exchange.p() != exchange.f()) && zvy.this.exchangeStore.get(keyToken) != exchange) {
                    if (zvy.this.running) {
                        zvy.f54641a.debug("ignoring response {}, exchange not longer matching!", zvfVar);
                    }
                    zvy.this.c(zvfVar, endpointReceiver);
                    return;
                }
                EndpointContext endpointContextH = exchange.h();
                if (endpointContextH == null) {
                    zvy.f54641a.debug("ignoring response {}, request pending to sent!", zvfVar);
                    zvy.this.c(zvfVar, endpointReceiver);
                    return;
                }
                try {
                    if (!zvy.this.f54642b.isResponseRelatedToRequest(endpointContextH, zvfVar.getSourceContext())) {
                        zvy.f54641a.debug("ignoring potentially forged response for token {} with non-matching endpoint context", keyToken);
                        zvy.this.e(zvfVar, endpointReceiver);
                        return;
                    }
                    CoAP.Type type = zvfVar.getType();
                    zvg zvgVarF = exchange.f();
                    int mid = zvgVarF.getMID();
                    if (zvgVarF.j()) {
                        if (type != CoAP.Type.NON) {
                            zvy.f54641a.debug("ignoring response of type {} for multicast request with token [{}], from {}", zvfVar.getType(), zvfVar.getTokenString(), zzp.e(zvfVar.getSourceContext().getPeerAddress()));
                            zvy.this.c(zvfVar, endpointReceiver);
                            return;
                        }
                    } else if (type == CoAP.Type.ACK && mid != zvfVar.getMID()) {
                        zvy.f54641a.debug("ignoring ACK, possible MID reuse before lifetime end for token {}, expected MID {} but received {}", zvfVar.getTokenString(), Integer.valueOf(mid), Integer.valueOf(zvfVar.getMID()));
                        zvy.this.c(zvfVar, endpointReceiver);
                        return;
                    }
                    if (type != CoAP.Type.ACK && !exchange.w() && zvfVar.g() && zvgVarF.n()) {
                        zvy.f54641a.debug("ignoring notify for pending cancel {}!", zvfVar);
                        zvy.this.c(zvfVar, endpointReceiver);
                        return;
                    }
                    if ((type == CoAP.Type.CON || type == CoAP.Type.NON) && (exchangeFindPrevious = zvy.this.exchangeStore.findPrevious(new zvv(zvfVar.getMID(), endpointIdentity), exchange)) != null) {
                        zvy.f54641a.trace("received duplicate response for open {}: {}", exchange, zvfVar);
                        zvfVar.setDuplicate(true);
                        zvf zvfVarJ = exchangeFindPrevious.j();
                        if (zvfVarJ != null) {
                            zvfVar.setRejected(zvfVarJ.isRejected());
                        }
                    }
                    endpointReceiver.receiveResponse(exchange, zvfVar);
                } catch (RuntimeException e) {
                    zvy.f54641a.warn("error receiving response {} for {}", zvfVar, exchange, e);
                }
            }
        });
    }

    @Override // org.eclipse.californium.core.network.Matcher
    public void receiveEmptyMessage(final zvd zvdVar, final EndpointReceiver endpointReceiver) {
        zvv zvvVar;
        EndpointContext sourceContext = zvdVar.getSourceContext();
        Object endpointIdentity = this.f54642b.getEndpointIdentity(sourceContext);
        zvv zvvVar2 = new zvv(zvdVar.getMID(), endpointIdentity);
        Exchange exchange = this.exchangeStore.get(zvvVar2);
        final zvv zvvVar3 = (exchange != null || endpointIdentity == sourceContext.getPeerAddress() || (exchange = this.exchangeStore.get((zvvVar = new zvv(zvdVar.getMID(), sourceContext.getPeerAddress())))) == null) ? zvvVar2 : zvvVar;
        if (exchange == null) {
            f54641a.debug("ignoring {} message unmatchable by {}", zvdVar.getType(), zvvVar3);
            d(zvdVar, endpointReceiver);
        } else {
            final Exchange exchange2 = exchange;
            exchange.d(new Runnable() { // from class: zvy.3
                @Override // java.lang.Runnable
                public void run() {
                    if (exchange2.f().j()) {
                        zvy.f54641a.debug("ignoring {} message for multicast request {}", zvdVar.getType(), zvvVar3);
                        zvy.this.d(zvdVar, endpointReceiver);
                        return;
                    }
                    if (zvy.this.exchangeStore.get(zvvVar3) != exchange2) {
                        if (zvy.this.running) {
                            zvy.f54641a.debug("ignoring {} message not longer matching by {}", zvdVar.getType(), zvvVar3);
                        }
                        zvy.this.d(zvdVar, endpointReceiver);
                        return;
                    }
                    try {
                        if (zvy.this.f54642b.isResponseRelatedToRequest(exchange2.h(), zvdVar.getSourceContext())) {
                            zvy.this.exchangeStore.remove(zvvVar3, exchange2);
                            zvy.f54641a.debug("received expected {} reply for {}", zvdVar.getType(), zvvVar3);
                            endpointReceiver.receiveEmptyMessage(exchange2, zvdVar);
                        } else {
                            zvy.f54641a.debug("ignoring potentially forged {} reply for {} with non-matching endpoint context", zvdVar.getType(), zvvVar3);
                            zvy.this.d(zvdVar, endpointReceiver);
                        }
                    } catch (RuntimeException e) {
                        zvy.f54641a.warn("error receiving {} message for {}", zvdVar.getType(), exchange2, e);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(zvf zvfVar, EndpointReceiver endpointReceiver) {
        if (zvfVar.getType() != CoAP.Type.ACK && zvfVar.hasMID()) {
            endpointReceiver.reject(zvfVar);
        }
        c(zvfVar, endpointReceiver);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(zvf zvfVar, EndpointReceiver endpointReceiver) {
        zvfVar.setCanceled(true);
        endpointReceiver.receiveResponse(null, zvfVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(zvd zvdVar, EndpointReceiver endpointReceiver) {
        zvdVar.setCanceled(true);
        endpointReceiver.receiveEmptyMessage(null, zvdVar);
    }

    class a implements RemoveHandler {
        private a() {
        }

        @Override // org.eclipse.californium.core.network.RemoveHandler
        public void remove(Exchange exchange, zvt zvtVar, zvv zvvVar) {
            if (zvtVar != null) {
                zvy.this.exchangeStore.remove(zvtVar, exchange);
            }
            if (zvvVar != null) {
                zvy.this.exchangeStore.remove(zvvVar, exchange);
            }
        }
    }
}
