package org.eclipse.californium.core.network;

/* JADX INFO: loaded from: classes20.dex */
public interface EndpointObserver {
    void destroyed(Endpoint endpoint);

    void started(Endpoint endpoint);

    void stopped(Endpoint endpoint);
}
