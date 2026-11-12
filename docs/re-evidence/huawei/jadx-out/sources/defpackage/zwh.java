package defpackage;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.eclipse.californium.core.config.CoapConfig;
import org.eclipse.californium.core.network.Exchange;
import org.eclipse.californium.core.network.deduplication.Deduplicator;
import org.eclipse.californium.elements.config.Configuration;
import org.eclipse.californium.elements.util.ClockUtil;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes20.dex */
public class zwh implements Deduplicator {
    private static final Logger d = aaex.a((Class<?>) zwh.class);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Runnable f54676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final boolean f54677b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final long f54678c;
    final ConcurrentMap<zvv, a> e = new ConcurrentHashMap();
    private volatile ScheduledFuture<?> f;
    private final long g;
    private ScheduledExecutorService i;

    protected void a(zvv zvvVar, boolean z) {
    }

    static class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f54679c = ClockUtil.c();
        public final Exchange e;

        public a(Exchange exchange) {
            this.e = exchange;
        }

        public int hashCode() {
            return this.e.hashCode();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                return this.e.equals(((a) obj).e);
            }
            return false;
        }
    }

    public zwh(Configuration configuration) {
        this.g = configuration.e(CoapConfig.v, TimeUnit.MILLISECONDS).longValue();
        this.f54678c = configuration.e(CoapConfig.s, TimeUnit.MILLISECONDS).longValue();
        this.f54677b = ((Boolean) configuration.c(CoapConfig.t)).booleanValue();
    }

    @Override // org.eclipse.californium.core.network.deduplication.Deduplicator
    public void start() {
        synchronized (this) {
            if (this.f54676a == null) {
                this.f54676a = new c();
            }
            if (this.f == null) {
                ScheduledExecutorService scheduledExecutorService = this.i;
                Runnable runnable = this.f54676a;
                long j = this.g;
                this.f = scheduledExecutorService.scheduleAtFixedRate(runnable, j, j, TimeUnit.MILLISECONDS);
            }
        }
    }

    @Override // org.eclipse.californium.core.network.deduplication.Deduplicator
    public void stop() {
        synchronized (this) {
            if (this.f != null) {
                this.f.cancel(false);
                this.f = null;
                clear();
            }
        }
    }

    @Override // org.eclipse.californium.core.network.deduplication.Deduplicator
    public void setExecutor(ScheduledExecutorService scheduledExecutorService) {
        synchronized (this) {
            if (this.f != null) {
                throw new IllegalStateException("executor service can not be set on running Deduplicator");
            }
            this.i = scheduledExecutorService;
        }
    }

    @Override // org.eclipse.californium.core.network.deduplication.Deduplicator
    public Exchange findPrevious(zvv zvvVar, Exchange exchange) {
        a aVar = new a(exchange);
        a aVarPutIfAbsent = this.e.putIfAbsent(zvvVar, aVar);
        boolean z = false;
        if (this.f54677b && aVarPutIfAbsent != null && aVarPutIfAbsent.e.k() != exchange.k()) {
            if (this.e.replace(zvvVar, aVarPutIfAbsent, aVar)) {
                d.debug("replace exchange for {}", zvvVar);
                z = true;
                aVarPutIfAbsent = null;
            } else {
                aVarPutIfAbsent = this.e.putIfAbsent(zvvVar, aVar);
            }
        }
        if (aVarPutIfAbsent == null) {
            d.debug("add exchange for {}", zvvVar);
            a(zvvVar, z);
            return null;
        }
        d.debug("found exchange for {}", zvvVar);
        return aVarPutIfAbsent.e;
    }

    @Override // org.eclipse.californium.core.network.deduplication.Deduplicator
    public boolean replacePrevious(zvv zvvVar, Exchange exchange, Exchange exchange2) {
        boolean z;
        a aVar = new a(exchange);
        a aVar2 = new a(exchange2);
        boolean zReplace = this.e.replace(zvvVar, aVar, aVar2);
        boolean z2 = true;
        if (zReplace) {
            z = true;
        } else {
            z = false;
            if (this.e.putIfAbsent(zvvVar, aVar2) != null) {
                z2 = false;
            }
        }
        if (z2) {
            a(zvvVar, z);
        }
        return z2;
    }

    @Override // org.eclipse.californium.core.network.deduplication.Deduplicator
    public Exchange find(zvv zvvVar) {
        a aVar = this.e.get(zvvVar);
        if (aVar == null) {
            return null;
        }
        return aVar.e;
    }

    @Override // org.eclipse.californium.core.network.deduplication.Deduplicator
    public void clear() {
        this.e.clear();
    }

    @Override // org.eclipse.californium.core.network.deduplication.Deduplicator
    public boolean isEmpty() {
        return this.e.isEmpty();
    }

    @Override // org.eclipse.californium.core.network.deduplication.Deduplicator
    public int size() {
        return this.e.size();
    }

    class c implements Runnable {
        private c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                zwh.d.trace("Start Mark-And-Sweep with {} entries", Integer.valueOf(zwh.this.e.size()));
                b();
            } catch (Throwable th) {
                zwh.d.warn("Exception in Mark-and-Sweep algorithm", th);
            }
        }

        private void b() {
            if (zwh.this.e.isEmpty()) {
                return;
            }
            long jC = ClockUtil.c();
            long nanos = TimeUnit.MILLISECONDS.toNanos(zwh.this.f54678c);
            for (Map.Entry<zvv, a> entry : zwh.this.e.entrySet()) {
                if (entry.getValue().f54679c - (jC - nanos) < 0) {
                    zwh.d.trace("Mark-And-Sweep removes {}", entry.getKey());
                    zwh.this.e.remove(entry.getKey());
                }
            }
            zwh.d.debug("Sweep run took {}ms", Long.valueOf(TimeUnit.NANOSECONDS.toMillis(ClockUtil.c() - jC)));
        }
    }
}
