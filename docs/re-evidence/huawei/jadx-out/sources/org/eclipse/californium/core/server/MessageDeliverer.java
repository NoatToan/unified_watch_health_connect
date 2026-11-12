package org.eclipse.californium.core.server;

import defpackage.zvf;
import org.eclipse.californium.core.network.Exchange;

/* JADX INFO: loaded from: classes20.dex */
public interface MessageDeliverer {
    void deliverRequest(Exchange exchange);

    void deliverResponse(Exchange exchange, zvf zvfVar);
}
