package defpackage;

import org.eclipse.californium.core.network.Exchange;
import org.eclipse.californium.core.network.stack.AbstractLayer;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes20.dex */
public class zxb extends AbstractLayer {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final Logger f54719b = aaex.a((Class<?>) zxb.class);

    @Override // org.eclipse.californium.core.network.stack.AbstractLayer, org.eclipse.californium.core.network.stack.Layer
    public void sendRequest(Exchange exchange, zvg zvgVar) {
        zvgVar.addMessageObserver(new zwn(exchange));
        super.sendRequest(exchange, zvgVar);
    }

    @Override // org.eclipse.californium.core.network.stack.AbstractLayer, org.eclipse.californium.core.network.stack.Layer
    public void receiveResponse(Exchange exchange, zvf zvfVar) {
        exchange.ai();
        exchange.p().onTransferComplete();
        super.receiveResponse(exchange, zvfVar);
    }
}
