package defpackage;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.eclipse.californium.core.observe.ObservationStore;
import org.eclipse.californium.elements.EndpointContext;
import org.eclipse.californium.elements.config.Configuration;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes20.dex */
public final class zxl implements ObservationStore {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Logger f54740b;
    private static final Logger e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile boolean f54741a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Configuration f54742c;
    private ScheduledExecutorService d;
    private ScheduledFuture<?> h;
    private final ConcurrentMap<zve, zxi> j = new ConcurrentHashMap();

    static {
        Logger loggerA = aaex.a((Class<?>) zxl.class);
        e = loggerA;
        f54740b = aaex.a(loggerA.getName() + ".health");
    }

    public zxl(Configuration configuration) {
        this.f54742c = configuration;
    }

    @Override // org.eclipse.californium.core.observe.ObservationStore
    public void setExecutor(ScheduledExecutorService scheduledExecutorService) {
        this.d = scheduledExecutorService;
    }

    @Override // org.eclipse.californium.core.observe.ObservationStore
    public zxi putIfAbsent(zve zveVar, zxi zxiVar) {
        if (zveVar == null) {
            throw new NullPointerException("token must not be null");
        }
        if (zxiVar == null) {
            throw new NullPointerException("observation must not be null");
        }
        this.f54741a = true;
        zxi zxiVarPutIfAbsent = this.j.putIfAbsent(zveVar, zxiVar);
        if (zxiVarPutIfAbsent == null) {
            e.debug("added observation for {}", zveVar);
            return zxiVarPutIfAbsent;
        }
        e.debug("kept observation {} for {}", zxiVarPutIfAbsent, zveVar);
        return zxiVarPutIfAbsent;
    }

    @Override // org.eclipse.californium.core.observe.ObservationStore
    public zxi put(zve zveVar, zxi zxiVar) {
        if (zveVar == null) {
            throw new NullPointerException("token must not be null");
        }
        if (zxiVar == null) {
            throw new NullPointerException("observation must not be null");
        }
        this.f54741a = true;
        zxi zxiVarPut = this.j.put(zveVar, zxiVar);
        if (zxiVarPut == null) {
            e.debug("added observation for {}", zveVar);
            return zxiVarPut;
        }
        e.debug("replaced observation {} for {}", zxiVarPut, zveVar);
        return zxiVarPut;
    }

    @Override // org.eclipse.californium.core.observe.ObservationStore
    public zxi get(zve zveVar) {
        if (zveVar == null) {
            return null;
        }
        zxi zxiVar = this.j.get(zveVar);
        e.debug("looking up observation for token {}: {}", zveVar, zxiVar);
        return zxo.a(zxiVar);
    }

    @Override // org.eclipse.californium.core.observe.ObservationStore
    public void remove(zve zveVar) {
        if (zveVar != null) {
            if (this.j.remove(zveVar) != null) {
                e.debug("removed observation for token {}", zveVar);
            } else {
                e.debug("Already removed observation for token {}", zveVar);
            }
        }
    }

    @Override // org.eclipse.californium.core.observe.ObservationStore
    public void setContext(zve zveVar, EndpointContext endpointContext) {
        zxi zxiVar;
        if (zveVar == null || endpointContext == null || (zxiVar = this.j.get(zveVar)) == null) {
            return;
        }
        this.j.replace(zveVar, zxiVar, new zxi(zxiVar.c(), endpointContext));
    }

    @Override // org.eclipse.californium.core.observe.ObservationStore
    public void start() {
        ScheduledExecutorService scheduledExecutorService;
        synchronized (this) {
            long jLongValue = this.f54742c.e(zyq.f54785b, TimeUnit.MILLISECONDS).longValue();
            if (jLongValue > 0 && f54740b.isDebugEnabled() && (scheduledExecutorService = this.d) != null) {
                this.h = scheduledExecutorService.scheduleAtFixedRate(new Runnable() { // from class: zxl.5
                    @Override // java.lang.Runnable
                    public void run() {
                        if (zxl.this.f54741a) {
                            zxl.f54740b.debug("{} observes", Integer.valueOf(zxl.this.j.size()));
                            Iterator it = zxl.this.j.keySet().iterator();
                            int i = 5;
                            while (it.hasNext()) {
                                zxl.f54740b.debug("   observe {}", it.next());
                                i--;
                                if (i == 0) {
                                    return;
                                }
                            }
                        }
                    }
                }, jLongValue, jLongValue, TimeUnit.MILLISECONDS);
            }
        }
    }

    @Override // org.eclipse.californium.core.observe.ObservationStore
    public void stop() {
        synchronized (this) {
            ScheduledFuture<?> scheduledFuture = this.h;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
                this.h = null;
            }
        }
    }
}
