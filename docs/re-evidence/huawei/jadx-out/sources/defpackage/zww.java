package defpackage;

import java.util.concurrent.TimeUnit;
import org.eclipse.californium.core.coap.CoAP;
import org.eclipse.californium.core.config.CoapConfig;
import org.eclipse.californium.core.network.Exchange;
import org.eclipse.californium.core.network.stack.AbstractLayer;
import org.eclipse.californium.elements.config.Configuration;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes20.dex */
public class zww extends AbstractLayer {
    static final Logger e = aaex.a((Class<?>) zww.class);
    private final int d;

    public zww(Configuration configuration) {
        this.d = configuration.d(CoapConfig.an, TimeUnit.MILLISECONDS) + configuration.d(CoapConfig.u, TimeUnit.MILLISECONDS) + configuration.d(CoapConfig.ah, TimeUnit.MILLISECONDS);
    }

    @Override // org.eclipse.californium.core.network.stack.AbstractLayer, org.eclipse.californium.core.network.stack.Layer
    public void sendRequest(Exchange exchange, zvg zvgVar) {
        if (zvgVar.j()) {
            zvgVar.addMessageObserver(new zwv(exchange, this.executor, this.d));
        } else if (zvgVar.getOptions().an()) {
            zvgVar.addMessageObserver(new zxa(exchange, this.executor, this.d));
        } else {
            zvgVar.addMessageObserver(new zwn(exchange));
        }
        super.sendRequest(exchange, zvgVar);
    }

    @Override // org.eclipse.californium.core.network.stack.AbstractLayer, org.eclipse.californium.core.network.stack.Layer
    public void sendResponse(Exchange exchange, zvf zvfVar) {
        CoAP.Type type;
        if (exchange.s() == null && ((type = zvfVar.getType()) == null || type == CoAP.Type.CON)) {
            zvfVar.addMessageObserver(new zwn(exchange));
        }
        super.sendResponse(exchange, zvfVar);
    }

    @Override // org.eclipse.californium.core.network.stack.AbstractLayer, org.eclipse.californium.core.network.stack.Layer
    public void receiveResponse(Exchange exchange, zvf zvfVar) {
        if (!exchange.p().j()) {
            exchange.ai();
            exchange.p().onTransferComplete();
        }
        super.receiveResponse(exchange, zvfVar);
    }
}
