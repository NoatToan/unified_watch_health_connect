package org.eclipse.californium.core.observe;

import defpackage.zve;
import defpackage.zxi;
import java.util.concurrent.ScheduledExecutorService;
import org.eclipse.californium.elements.EndpointContext;

/* JADX INFO: loaded from: classes20.dex */
public interface ObservationStore {
    zxi get(zve zveVar);

    zxi put(zve zveVar, zxi zxiVar);

    zxi putIfAbsent(zve zveVar, zxi zxiVar);

    void remove(zve zveVar);

    void setContext(zve zveVar, EndpointContext endpointContext);

    void setExecutor(ScheduledExecutorService scheduledExecutorService);

    void start();

    void stop();
}
