package org.eclipse.californium.core.network;

import defpackage.zvd;
import defpackage.zvf;
import defpackage.zvg;

/* JADX INFO: loaded from: classes20.dex */
public interface Outbox {
    void sendEmptyMessage(Exchange exchange, zvd zvdVar);

    void sendRequest(Exchange exchange, zvg zvgVar);

    void sendResponse(Exchange exchange, zvf zvfVar);
}
