package org.eclipse.californium.core.network;

import defpackage.zvd;
import defpackage.zve;
import defpackage.zvf;
import defpackage.zvg;

/* JADX INFO: loaded from: classes20.dex */
public interface Matcher {
    void cancelObserve(zve zveVar);

    void clear();

    void receiveEmptyMessage(zvd zvdVar, EndpointReceiver endpointReceiver);

    void receiveRequest(zvg zvgVar, EndpointReceiver endpointReceiver);

    void receiveResponse(zvf zvfVar, EndpointReceiver endpointReceiver);

    void sendEmptyMessage(Exchange exchange, zvd zvdVar);

    void sendRequest(Exchange exchange);

    void sendResponse(Exchange exchange);

    void start();

    void stop();
}
