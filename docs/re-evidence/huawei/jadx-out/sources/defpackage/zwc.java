package defpackage;

import java.util.concurrent.Executor;
import org.eclipse.californium.core.coap.MessageObserverAdapter;
import org.eclipse.californium.core.network.BaseMatcher;
import org.eclipse.californium.core.network.EndpointReceiver;
import org.eclipse.californium.core.network.Exchange;
import org.eclipse.californium.core.network.MessageExchangeStore;
import org.eclipse.californium.core.network.RemoveHandler;
import org.eclipse.californium.core.network.TokenGenerator;
import org.eclipse.californium.core.observe.NotificationListener;
import org.eclipse.californium.core.observe.ObservationStore;
import org.eclipse.californium.core.observe.ObserveRelation;
import org.eclipse.californium.elements.EndpointContext;
import org.eclipse.californium.elements.EndpointContextMatcher;
import org.eclipse.californium.elements.config.Configuration;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes20.dex */
public final class zwc extends BaseMatcher {
    private static final Logger d = aaex.a((Class<?>) zwc.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final RemoveHandler f54663b;
    private final EndpointContextMatcher e;

    @Override // org.eclipse.californium.core.network.Matcher
    public void receiveEmptyMessage(zvd zvdVar, EndpointReceiver endpointReceiver) {
    }

    public zwc(Configuration configuration, NotificationListener notificationListener, TokenGenerator tokenGenerator, ObservationStore observationStore, MessageExchangeStore messageExchangeStore, EndpointContextMatcher endpointContextMatcher, Executor executor) {
        super(configuration, notificationListener, tokenGenerator, observationStore, messageExchangeStore, endpointContextMatcher, executor);
        this.f54663b = new d();
        this.e = endpointContextMatcher;
    }

    @Override // org.eclipse.californium.core.network.Matcher
    public void sendRequest(Exchange exchange) {
        zvg zvgVarF = exchange.f();
        if (zvgVarF.m()) {
            registerObserve(zvgVarF);
        }
        exchange.c(this.f54663b);
        this.exchangeStore.registerOutboundRequestWithTokenOnly(exchange);
        d.debug("tracking open request using [{}]", exchange.l());
    }

    @Override // org.eclipse.californium.core.network.Matcher
    public void sendResponse(Exchange exchange) {
        zvf zvfVarJ = exchange.j();
        final ObserveRelation observeRelationS = exchange.s();
        zvfVarJ.e(exchange.f().getToken());
        if (observeRelationS != null) {
            zvfVarJ.addMessageObserver(new MessageObserverAdapter() { // from class: zwc.1
                @Override // org.eclipse.californium.core.coap.MessageObserverAdapter, org.eclipse.californium.core.coap.MessageObserver
                public void onSendError(Throwable th) {
                    observeRelationS.e();
                }
            });
        }
        exchange.ai();
    }

    @Override // org.eclipse.californium.core.network.Matcher
    public void sendEmptyMessage(Exchange exchange, zvd zvdVar) {
        if (zvdVar.isConfirmable()) {
            zvdVar.setToken(zve.e);
            return;
        }
        throw new UnsupportedOperationException("sending empty message (ACK/RST) over tcp is not supported!");
    }

    @Override // org.eclipse.californium.core.network.Matcher
    public void receiveRequest(final zvg zvgVar, final EndpointReceiver endpointReceiver) {
        final Exchange exchange = new Exchange(zvgVar, this.e.getEndpointIdentity(zvgVar.getSourceContext()), Exchange.Origin.REMOTE, this.executor);
        exchange.c(this.f54663b);
        exchange.d(new Runnable() { // from class: zwc.4
            @Override // java.lang.Runnable
            public void run() {
                endpointReceiver.receiveRequest(exchange, zvgVar);
            }
        });
    }

    @Override // org.eclipse.californium.core.network.Matcher
    public void receiveResponse(final zvf zvfVar, final EndpointReceiver endpointReceiver) {
        final zvt keyToken = this.tokenGenerator.getKeyToken(zvfVar.getToken(), this.e.getEndpointIdentity(zvfVar.getSourceContext()));
        Exchange exchangeMatchNotifyResponse = this.exchangeStore.get(keyToken);
        if (exchangeMatchNotifyResponse == null) {
            exchangeMatchNotifyResponse = matchNotifyResponse(zvfVar);
        }
        if (exchangeMatchNotifyResponse == null) {
            d.trace("discarding by [{}] unmatchable response from [{}]: {}", keyToken, zvfVar.getSourceContext(), zvfVar);
            b(zvfVar, endpointReceiver);
        } else {
            final Exchange exchange = exchangeMatchNotifyResponse;
            exchangeMatchNotifyResponse.d(new Runnable() { // from class: zwc.3
                @Override // java.lang.Runnable
                public void run() {
                    if ((!exchange.w() || exchange.p() != exchange.f()) && zwc.this.exchangeStore.get(keyToken) != exchange) {
                        if (zwc.this.running) {
                            zwc.d.debug("ignoring response {}, exchange not longer matching!", zvfVar);
                        }
                        zwc.this.b(zvfVar, endpointReceiver);
                        return;
                    }
                    EndpointContext endpointContextH = exchange.h();
                    if (endpointContextH != null) {
                        try {
                            if (!zwc.this.e.isResponseRelatedToRequest(endpointContextH, zvfVar.getSourceContext())) {
                                if (zwc.d.isDebugEnabled()) {
                                    zwc.d.debug("ignoring potentially forged response from [{}]: {} for {} with non-matching endpoint context", zwc.this.e.toRelevantState(zvfVar.getSourceContext()), zvfVar, exchange);
                                }
                                zwc.this.b(zvfVar, endpointReceiver);
                                return;
                            }
                            zvg zvgVarF = exchange.f();
                            if (exchange.w() && zvfVar.g() && zvgVarF.n()) {
                                zwc.d.debug("ignoring notify for pending cancel {}!", zvfVar);
                                zwc.this.b(zvfVar, endpointReceiver);
                            } else {
                                endpointReceiver.receiveResponse(exchange, zvfVar);
                            }
                        } catch (Exception e) {
                            zwc.d.error("error receiving response from [{}]: {} for {}", zvfVar.getSourceContext(), zvfVar, exchange, e);
                        }
                    } else {
                        zwc.d.debug("ignoring response from [{}]: {}, request pending to sent!", zvfVar.getSourceContext(), zvfVar);
                        zwc.this.b(zvfVar, endpointReceiver);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(zvf zvfVar, EndpointReceiver endpointReceiver) {
        zvfVar.setCanceled(true);
        endpointReceiver.receiveResponse(null, zvfVar);
    }

    class d implements RemoveHandler {
        private d() {
        }

        @Override // org.eclipse.californium.core.network.RemoveHandler
        public void remove(Exchange exchange, zvt zvtVar, zvv zvvVar) {
            if (zvtVar != null) {
                zwc.this.exchangeStore.remove(zvtVar, exchange);
            }
        }
    }
}
