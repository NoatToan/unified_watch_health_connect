package org.eclipse.californium.core.network.stack;

import defpackage.zvd;
import defpackage.zvf;
import defpackage.zvg;
import java.util.concurrent.ScheduledExecutorService;
import org.eclipse.californium.core.network.Exchange;
import org.eclipse.californium.core.server.MessageDeliverer;

/* JADX INFO: loaded from: classes20.dex */
public interface CoapStack {
    void destroy();

    boolean hasDeliverer();

    void receiveEmptyMessage(Exchange exchange, zvd zvdVar);

    void receiveRequest(Exchange exchange, zvg zvgVar);

    void receiveResponse(Exchange exchange, zvf zvfVar);

    void sendEmptyMessage(Exchange exchange, zvd zvdVar);

    void sendRequest(Exchange exchange, zvg zvgVar);

    void sendResponse(Exchange exchange, zvf zvfVar);

    void setDeliverer(MessageDeliverer messageDeliverer);

    void setExecutors(ScheduledExecutorService scheduledExecutorService, ScheduledExecutorService scheduledExecutorService2);

    void start();
}
