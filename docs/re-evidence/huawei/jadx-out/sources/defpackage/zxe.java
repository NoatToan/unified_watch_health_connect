package defpackage;

import org.eclipse.californium.core.coap.CoAP;
import org.eclipse.californium.core.network.Exchange;
import org.eclipse.californium.core.network.stack.AbstractLayer;
import org.eclipse.californium.core.observe.ObserveRelation;
import org.eclipse.californium.elements.config.Configuration;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes20.dex */
public class zxe extends AbstractLayer {
    private static final Logger d = aaex.a((Class<?>) zxe.class);
    private static final Integer e = 1;

    public zxe(Configuration configuration) {
    }

    @Override // org.eclipse.californium.core.network.stack.AbstractLayer, org.eclipse.californium.core.network.stack.Layer
    public void sendRequest(Exchange exchange, zvg zvgVar) {
        e.equals(zvgVar.getOptions().q());
        lower().sendRequest(exchange, zvgVar);
    }

    @Override // org.eclipse.californium.core.network.stack.AbstractLayer, org.eclipse.californium.core.network.stack.Layer
    public void sendResponse(Exchange exchange, zvf zvfVar) {
        zvfVar.setType(CoAP.Type.CON);
        ObserveRelation observeRelationS = exchange.s();
        ObserveRelation.State stateD = ObserveRelation.d(observeRelationS, zvfVar);
        if (observeRelationS != null) {
            if (stateD == ObserveRelation.State.CANCELED && exchange.y()) {
                d.debug("drop notification {}, relation was canceled!", zvfVar);
                zvfVar.setCanceled(true);
                return;
            }
            observeRelationS.b(zvfVar);
        }
        lower().sendResponse(exchange, zvfVar);
    }

    @Override // org.eclipse.californium.core.network.stack.AbstractLayer, org.eclipse.californium.core.network.stack.Layer
    public void receiveResponse(Exchange exchange, zvf zvfVar) {
        if (zvfVar.getOptions().ak() && exchange.p().isCanceled()) {
            d.debug("ignoring notification for canceled TCP Exchange");
        } else {
            upper().receiveResponse(exchange, zvfVar);
        }
    }
}
