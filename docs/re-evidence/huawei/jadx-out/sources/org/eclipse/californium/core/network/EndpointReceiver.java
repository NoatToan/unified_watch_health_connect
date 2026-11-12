package org.eclipse.californium.core.network;

import defpackage.zvd;
import defpackage.zvf;
import defpackage.zvg;
import org.eclipse.californium.core.coap.Message;

/* JADX INFO: loaded from: classes20.dex */
public interface EndpointReceiver {
    void receiveEmptyMessage(Exchange exchange, zvd zvdVar);

    void receiveRequest(Exchange exchange, zvg zvgVar);

    void receiveResponse(Exchange exchange, zvf zvfVar);

    void reject(Message message);
}
