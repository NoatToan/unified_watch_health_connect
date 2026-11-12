package org.eclipse.californium.core.network;

import defpackage.zve;
import defpackage.zvt;
import defpackage.zvv;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import org.eclipse.californium.core.coap.Message;

/* JADX INFO: loaded from: classes20.dex */
public interface MessageExchangeStore {
    int assignMessageId(Message message);

    Exchange find(zvv zvvVar);

    List<Exchange> findByToken(zve zveVar);

    Exchange findPrevious(zvv zvvVar, Exchange exchange);

    Exchange get(zvt zvtVar);

    Exchange get(zvv zvvVar);

    boolean isEmpty();

    boolean registerOutboundRequest(Exchange exchange);

    boolean registerOutboundRequestWithTokenOnly(Exchange exchange);

    boolean registerOutboundResponse(Exchange exchange);

    Exchange remove(zvv zvvVar, Exchange exchange);

    void remove(zvt zvtVar, Exchange exchange);

    boolean replacePrevious(zvv zvvVar, Exchange exchange, Exchange exchange2);

    void setExecutor(ScheduledExecutorService scheduledExecutorService);

    void start();

    void stop();
}
