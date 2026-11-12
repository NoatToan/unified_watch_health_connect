package defpackage;

import org.eclipse.californium.core.network.Exchange;
import org.eclipse.californium.core.network.stack.AbstractLayer;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes20.dex */
public class zwz extends AbstractLayer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Logger f54713a = aaex.a((Class<?>) zwz.class);

    @Override // org.eclipse.californium.core.network.stack.AbstractLayer, org.eclipse.californium.core.network.stack.Layer
    public void sendEmptyMessage(Exchange exchange, zvd zvdVar) {
        if (zvdVar.isConfirmable()) {
            lower().sendEmptyMessage(exchange, zvdVar);
        } else if (exchange != null) {
            f54713a.warn("attempting to send empty message ({}) in TCP mode {}", zvdVar, exchange, new Throwable());
        } else {
            f54713a.warn("attempting to send empty message ({}) in TCP mode.", zvdVar, new Throwable());
        }
    }

    @Override // org.eclipse.californium.core.network.stack.AbstractLayer, org.eclipse.californium.core.network.stack.Layer
    public void receiveRequest(Exchange exchange, zvg zvgVar) {
        zvgVar.setAcknowledged(true);
        upper().receiveRequest(exchange, zvgVar);
    }

    @Override // org.eclipse.californium.core.network.stack.AbstractLayer, org.eclipse.californium.core.network.stack.Layer
    public void receiveResponse(Exchange exchange, zvf zvfVar) {
        zvfVar.setAcknowledged(true);
        upper().receiveResponse(exchange, zvfVar);
    }

    @Override // org.eclipse.californium.core.network.stack.AbstractLayer, org.eclipse.californium.core.network.stack.Layer
    public void receiveEmptyMessage(Exchange exchange, zvd zvdVar) {
        f54713a.info("discarding empty message received in TCP mode: {}", zvdVar);
    }
}
