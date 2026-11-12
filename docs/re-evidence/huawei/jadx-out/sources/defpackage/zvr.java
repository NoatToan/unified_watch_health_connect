package defpackage;

import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.eclipse.californium.core.coap.CoAP;
import org.eclipse.californium.core.network.CoapEndpoint;
import org.eclipse.californium.core.network.Endpoint;
import org.eclipse.californium.core.network.Exchange;
import org.eclipse.californium.core.server.MessageDeliverer;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes20.dex */
public class zvr {
    private static final Logger d = aaex.a((Class<?>) zvr.class);
    private static final zvr e = new zvr();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<String, Endpoint> f54625c = new ConcurrentHashMap();

    public static zvr c() {
        return e;
    }

    public Endpoint b(String str) {
        Endpoint endpointA;
        synchronized (this) {
            if (str == null) {
                str = "coap";
            }
            if (!CoAP.d(str)) {
                throw new IllegalArgumentException("URI scheme " + str + " not supported!");
            }
            String lowerCase = str.toLowerCase();
            endpointA = this.f54625c.get(lowerCase);
            if (endpointA == null) {
                if ("coaps".equalsIgnoreCase(lowerCase)) {
                    throw new IllegalStateException("URI scheme " + lowerCase + " requires a previous set connector!");
                }
                if ("coap+tcp".equalsIgnoreCase(lowerCase)) {
                    throw new IllegalStateException("URI scheme " + lowerCase + " requires a previous set connector!");
                }
                if ("coaps+tcp".equalsIgnoreCase(lowerCase)) {
                    throw new IllegalStateException("URI scheme " + lowerCase + " requires a previous set connector!");
                }
                endpointA = new CoapEndpoint.e().a();
                try {
                    endpointA.start();
                    d.info("created implicit endpoint {} for {}", endpointA.getUri(), lowerCase);
                } catch (IOException e2) {
                    d.error("could not create {} endpoint", lowerCase, e2);
                }
                this.f54625c.put(lowerCase, endpointA);
            }
        }
        return endpointA;
    }

    public static class c implements MessageDeliverer {
        @Override // org.eclipse.californium.core.server.MessageDeliverer
        public void deliverRequest(Exchange exchange) {
            zvr.d.error("Default endpoint without CoapServer has received a request.");
            exchange.af();
        }

        @Override // org.eclipse.californium.core.server.MessageDeliverer
        public void deliverResponse(Exchange exchange, zvf zvfVar) {
            if (exchange == null) {
                throw new NullPointerException("no CoAP exchange!");
            }
            if (exchange.p() == null) {
                throw new NullPointerException("no CoAP request!");
            }
            if (zvfVar == null) {
                throw new NullPointerException("no CoAP response!");
            }
            exchange.p().e(zvfVar);
        }
    }
}
