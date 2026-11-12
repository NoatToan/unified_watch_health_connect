package org.eclipse.californium.core.network.interceptors;

import defpackage.zvd;
import defpackage.zvf;
import defpackage.zvg;

/* JADX INFO: loaded from: classes20.dex */
public interface MessageInterceptor {
    void receiveEmptyMessage(zvd zvdVar);

    void receiveRequest(zvg zvgVar);

    void receiveResponse(zvf zvfVar);

    void sendEmptyMessage(zvd zvdVar);

    void sendRequest(zvg zvgVar);

    void sendResponse(zvf zvfVar);
}
