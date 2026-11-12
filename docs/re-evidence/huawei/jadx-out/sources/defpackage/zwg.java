package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.eclipse.californium.core.config.CoapConfig;
import org.eclipse.californium.core.network.Exchange;
import org.eclipse.californium.core.network.deduplication.Deduplicator;
import org.eclipse.californium.elements.config.Configuration;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes20.dex */
public class zwg implements Deduplicator {
    private static final Logger d = aaex.a((Class<?>) zwg.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ScheduledExecutorService f54674b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile ScheduledFuture<?> f54675c;
    private final c[] e;
    private final b f;
    private final long i;
    private final boolean j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile int f54673a = 0;
    private volatile int h = 1;

    public zwg(Configuration configuration) {
        this.f = new b();
        this.e = new c[]{new c(), new c(), new c()};
        this.i = configuration.e(CoapConfig.n, TimeUnit.MILLISECONDS).longValue();
        this.j = ((Boolean) configuration.c(CoapConfig.t)).booleanValue();
    }

    @Override // org.eclipse.californium.core.network.deduplication.Deduplicator
    public void start() {
        synchronized (this) {
            if (this.f54675c == null) {
                ScheduledExecutorService scheduledExecutorService = this.f54674b;
                b bVar = this.f;
                long j = this.i;
                this.f54675c = scheduledExecutorService.scheduleAtFixedRate(bVar, j, j, TimeUnit.MILLISECONDS);
            }
        }
    }

    @Override // org.eclipse.californium.core.network.deduplication.Deduplicator
    public void stop() {
        synchronized (this) {
            if (this.f54675c != null) {
                this.f54675c.cancel(false);
                this.f54675c = null;
                clear();
            }
        }
    }

    @Override // org.eclipse.californium.core.network.deduplication.Deduplicator
    public void setExecutor(ScheduledExecutorService scheduledExecutorService) {
        synchronized (this) {
            if (this.f54675c != null) {
                throw new IllegalStateException("executor service can not be set on running Deduplicator");
            }
            this.f54674b = scheduledExecutorService;
        }
    }

    @Override // org.eclipse.californium.core.network.deduplication.Deduplicator
    public Exchange findPrevious(zvv zvvVar, Exchange exchange) {
        int i = this.f54673a;
        int i2 = this.h;
        Exchange exchangePutIfAbsent = this.e[i].putIfAbsent(zvvVar, exchange);
        if (exchangePutIfAbsent != null || i == i2) {
            return exchangePutIfAbsent;
        }
        Exchange exchangePutIfAbsent2 = this.e[i2].putIfAbsent(zvvVar, exchange);
        if (!this.j || exchangePutIfAbsent2 == null || exchangePutIfAbsent2.k() == exchange.k()) {
            return exchangePutIfAbsent2;
        }
        d.debug("replace exchange for {}", zvvVar);
        if (this.e[i2].replace(zvvVar, exchangePutIfAbsent2, exchange)) {
            return null;
        }
        return this.e[i2].putIfAbsent(zvvVar, exchange);
    }

    @Override // org.eclipse.californium.core.network.deduplication.Deduplicator
    public boolean replacePrevious(zvv zvvVar, Exchange exchange, Exchange exchange2) {
        int i = this.h;
        return this.e[i].replace(zvvVar, exchange, exchange2) || this.e[i].putIfAbsent(zvvVar, exchange2) == null;
    }

    @Override // org.eclipse.californium.core.network.deduplication.Deduplicator
    public Exchange find(zvv zvvVar) {
        int i = this.f54673a;
        int i2 = this.h;
        Exchange exchange = this.e[i2].get(zvvVar);
        return (exchange != null || i == i2) ? exchange : this.e[i].get(zvvVar);
    }

    @Override // org.eclipse.californium.core.network.deduplication.Deduplicator
    public void clear() {
        synchronized (this.e) {
            this.e[0].clear();
            this.e[1].clear();
            this.e[2].clear();
        }
    }

    @Override // org.eclipse.californium.core.network.deduplication.Deduplicator
    public int size() {
        int size;
        int size2;
        int size3;
        synchronized (this.e) {
            size = this.e[0].size();
            size2 = this.e[1].size();
            size3 = this.e[2].size();
        }
        return size + size2 + size3;
    }

    @Override // org.eclipse.californium.core.network.deduplication.Deduplicator
    public boolean isEmpty() {
        for (c cVar : this.e) {
            if (!cVar.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    class b implements Runnable {
        private b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                a();
            } catch (Throwable th) {
                zwg.d.warn("Exception in Crop-Rotation algorithm", th);
            }
        }

        private void a() {
            synchronized (zwg.this.e) {
                int i = zwg.this.f54673a;
                zwg zwgVar = zwg.this;
                zwgVar.f54673a = zwgVar.h;
                zwg zwgVar2 = zwg.this;
                zwgVar2.h = (zwgVar2.h + 1) % 3;
                zwg.this.e[i].clear();
            }
        }
    }

    static class c extends ConcurrentHashMap<zvv, Exchange> {
        private static final long serialVersionUID = 1504940670839294042L;

        private c() {
        }
    }
}
