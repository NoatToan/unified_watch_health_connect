package org.eclipse.californium.core.network.deduplication;

import defpackage.zvv;
import java.util.concurrent.ScheduledExecutorService;
import org.eclipse.californium.core.network.Exchange;

/* JADX INFO: loaded from: classes20.dex */
public interface Deduplicator {
    void clear();

    Exchange find(zvv zvvVar);

    Exchange findPrevious(zvv zvvVar, Exchange exchange);

    boolean isEmpty();

    boolean replacePrevious(zvv zvvVar, Exchange exchange, Exchange exchange2);

    void setExecutor(ScheduledExecutorService scheduledExecutorService);

    int size();

    void start();

    void stop();
}
