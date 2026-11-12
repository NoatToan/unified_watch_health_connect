package defpackage;

import java.util.concurrent.ScheduledExecutorService;
import org.eclipse.californium.core.network.Exchange;
import org.eclipse.californium.core.network.deduplication.Deduplicator;

/* JADX INFO: loaded from: classes20.dex */
public class zwe implements Deduplicator {
    @Override // org.eclipse.californium.core.network.deduplication.Deduplicator
    public void clear() {
    }

    @Override // org.eclipse.californium.core.network.deduplication.Deduplicator
    public Exchange find(zvv zvvVar) {
        return null;
    }

    @Override // org.eclipse.californium.core.network.deduplication.Deduplicator
    public Exchange findPrevious(zvv zvvVar, Exchange exchange) {
        return null;
    }

    @Override // org.eclipse.californium.core.network.deduplication.Deduplicator
    public boolean isEmpty() {
        return true;
    }

    @Override // org.eclipse.californium.core.network.deduplication.Deduplicator
    public boolean replacePrevious(zvv zvvVar, Exchange exchange, Exchange exchange2) {
        return true;
    }

    @Override // org.eclipse.californium.core.network.deduplication.Deduplicator
    public void setExecutor(ScheduledExecutorService scheduledExecutorService) {
    }

    @Override // org.eclipse.californium.core.network.deduplication.Deduplicator
    public int size() {
        return 0;
    }

    @Override // org.eclipse.californium.core.network.deduplication.Deduplicator
    public void start() {
    }

    @Override // org.eclipse.californium.core.network.deduplication.Deduplicator
    public void stop() {
    }
}
