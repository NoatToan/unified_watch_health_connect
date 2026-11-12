package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.TimeUnit;
import org.eclipse.californium.elements.util.ClockUtil;
import org.eclipse.californium.elements.util.LeastRecentlyUsedCache;
import org.eclipse.californium.elements.util.SerialExecutor;
import org.eclipse.californium.scandium.ConnectionListener;
import org.eclipse.californium.scandium.dtls.ConnectionIdGenerator;
import org.eclipse.californium.scandium.dtls.Handshaker;
import org.eclipse.californium.scandium.dtls.ResumptionSupportingConnectionStore;
import org.eclipse.californium.scandium.dtls.SessionStore;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes20.dex */
@Deprecated
public class aabh implements ResumptionSupportingConnectionStore {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Logger f78b;
    private static final zzk g;
    private static boolean h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final LeastRecentlyUsedCache<aaae, aaag> f79a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected String f80c;
    protected final ConcurrentMap<InetSocketAddress, aaag> d;
    protected final ConcurrentMap<aacd, aaag> e;
    private ConnectionIdGenerator f;
    private ConnectionListener i;
    private final SessionStore j;

    static {
        Logger loggerA = aaex.a((Class<?>) aabh.class);
        f78b = loggerA;
        g = new zzk(loggerA.getName(), 3L, TimeUnit.SECONDS.toNanos(10L));
        h = true;
    }

    public aabh() {
        this(150000, 129600L, null);
    }

    public aabh(int i, long j, SessionStore sessionStore) {
        this.f80c = "";
        LeastRecentlyUsedCache<aaae, aaag> leastRecentlyUsedCache = new LeastRecentlyUsedCache<>(i, j);
        this.f79a = leastRecentlyUsedCache;
        leastRecentlyUsedCache.e(false);
        leastRecentlyUsedCache.a(false);
        this.d = new ConcurrentHashMap();
        this.j = sessionStore;
        if (h && sessionStore != null) {
            this.e = null;
        } else {
            this.e = new ConcurrentHashMap();
        }
        leastRecentlyUsedCache.a(new LeastRecentlyUsedCache.EvictionListener<aaag>() { // from class: aabh.2
            @Override // org.eclipse.californium.elements.util.LeastRecentlyUsedCache.EvictionListener
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public void onEviction(final aaag aaagVar) {
                Runnable runnable = new Runnable() { // from class: aabh.2.3
                    @Override // java.lang.Runnable
                    public void run() {
                        Handshaker handshakerO = aaagVar.o();
                        if (handshakerO != null) {
                            handshakerO.handshakeFailed(new aaah("Evicted!"));
                        }
                        synchronized (aabh.this) {
                            aabh.this.e(aaagVar);
                            aabh.this.d(aaagVar.i(), aaagVar);
                            ConnectionListener connectionListener = aabh.this.i;
                            if (connectionListener != null) {
                                connectionListener.onConnectionRemoved(aaagVar);
                            }
                        }
                    }
                };
                if (aaagVar.x()) {
                    aaagVar.h().execute(runnable);
                } else {
                    runnable.run();
                }
            }
        });
        f78b.info("Created new InMemoryConnectionStore [capacity: {}, connection expiration threshold: {}s]", Integer.valueOf(i), Long.valueOf(j));
    }

    public aabh e(String str) {
        synchronized (this) {
            this.f80c = zzp.j(str);
        }
        return this;
    }

    private aaae d() {
        for (int i = 0; i < 10; i++) {
            aaae aaaeVarCreateConnectionId = this.f.createConnectionId();
            if (this.f79a.c(aaaeVarCreateConnectionId) == null) {
                return aaaeVarCreateConnectionId;
            }
        }
        return null;
    }

    @Override // org.eclipse.californium.scandium.dtls.ResumptionSupportingConnectionStore
    public void setConnectionListener(ConnectionListener connectionListener) {
        this.i = connectionListener;
    }

    @Override // org.eclipse.californium.scandium.dtls.ResumptionSupportingConnectionStore
    public void attach(ConnectionIdGenerator connectionIdGenerator) {
        if (this.f != null) {
            throw new IllegalStateException("Connection id generator already attached!");
        }
        if (connectionIdGenerator == null || !connectionIdGenerator.useConnectionId()) {
            int iNumberOfLeadingZeros = (39 - Integer.numberOfLeadingZeros(this.f79a.b())) / 8;
            this.f = new aacg(iNumberOfLeadingZeros + (iNumberOfLeadingZeros < 3 ? 2 : 3));
        } else {
            this.f = connectionIdGenerator;
        }
    }

    @Override // org.eclipse.californium.scandium.dtls.ResumptionSupportingConnectionStore
    public boolean put(aaag aaagVar) {
        SessionStore sessionStore;
        boolean z = false;
        if (aaagVar == null) {
            return false;
        }
        if (!aaagVar.x()) {
            throw new IllegalStateException("Connection is not executing!");
        }
        aaae aaaeVarC = aaagVar.c();
        if (aaaeVarC == null) {
            if (this.f == null) {
                throw new IllegalStateException("Connection id generator must be attached before!");
            }
            aaaeVarC = d();
            if (aaaeVarC == null) {
                throw new IllegalStateException("Connection ids exhausted!");
            }
            aaagVar.d(aaaeVarC);
        } else {
            if (aaaeVarC.b()) {
                throw new IllegalStateException("Connection must have a none empty connection id!");
            }
            if (this.f79a.c(aaaeVarC) != null) {
                throw new IllegalStateException("Connection id already used! " + aaaeVarC);
            }
        }
        aaam aaamVarJ = aaagVar.j();
        synchronized (this) {
            if (this.f79a.e(aaaeVarC, aaagVar)) {
                Logger logger = f78b;
                if (logger.isTraceEnabled()) {
                    logger.trace("{}connection: add {} (size {})", this.f80c, aaagVar, Integer.valueOf(this.f79a.c()), new Throwable("connection added!"));
                } else {
                    logger.debug("{}connection: add {} (size {})", this.f80c, aaaeVarC, Integer.valueOf(this.f79a.c()));
                }
                c(aaagVar);
                if (aaamVarJ != null) {
                    e(aaamVarJ.l(), aaagVar);
                }
                z = true;
            } else {
                g.c("{}connection store is full! {} max. entries.", this.f80c, Integer.valueOf(this.f79a.b()));
            }
        }
        if (z && (sessionStore = this.j) != null && aaamVarJ != null) {
            sessionStore.put(aaamVarJ);
        }
        return z;
    }

    @Override // org.eclipse.californium.scandium.dtls.ResumptionSupportingConnectionStore
    public boolean update(aaag aaagVar, InetSocketAddress inetSocketAddress) {
        synchronized (this) {
            if (aaagVar == null) {
                return false;
            }
            if (this.f79a.a(aaagVar.c())) {
                aaagVar.u();
                if (inetSocketAddress == null) {
                    f78b.debug("{}connection: {} updated usage!", this.f80c, aaagVar.c());
                } else if (!aaagVar.d(inetSocketAddress)) {
                    InetSocketAddress inetSocketAddressM = aaagVar.m();
                    Logger logger = f78b;
                    if (logger.isTraceEnabled()) {
                        logger.trace("{}connection: {} updated, address changed from {} to {}!", this.f80c, aaagVar.c(), zzp.e(inetSocketAddressM), zzp.e(inetSocketAddress), new Throwable("connection updated!"));
                    } else {
                        logger.debug("{}connection: {} updated, address changed from {} to {}!", this.f80c, aaagVar.c(), zzp.e(inetSocketAddressM), zzp.e(inetSocketAddress));
                    }
                    if (inetSocketAddressM != null) {
                        this.d.remove(inetSocketAddressM, aaagVar);
                        aaagVar.c((InetSocketAddress) null);
                    }
                    aaagVar.c(inetSocketAddress);
                    c(aaagVar);
                }
                return true;
            }
            f78b.debug("{}connection: {} - {} update failed!", this.f80c, aaagVar.c(), zzp.e(inetSocketAddress));
            return false;
        }
    }

    @Override // org.eclipse.californium.scandium.dtls.ResumptionSupportingConnectionStore
    public void putEstablishedSession(aaag aaagVar) {
        aaam aaamVarJ = aaagVar.j();
        if (aaamVarJ == null) {
            throw new IllegalArgumentException("connection has no established session!");
        }
        ConnectionListener connectionListener = this.i;
        if (connectionListener != null) {
            connectionListener.onConnectionEstablished(aaagVar);
        }
        aacd aacdVarL = aaamVarJ.l();
        if (aacdVarL.b()) {
            return;
        }
        synchronized (this) {
            e(aacdVarL, aaagVar);
        }
        SessionStore sessionStore = this.j;
        if (sessionStore != null) {
            sessionStore.put(aaamVarJ);
        }
    }

    @Override // org.eclipse.californium.scandium.dtls.ResumptionSupportingConnectionStore
    public void removeFromEstablishedSessions(aaag aaagVar) {
        synchronized (this) {
            aacd aacdVarI = aaagVar.i();
            if (aacdVarI == null) {
                throw new IllegalArgumentException("connection has no established session!");
            }
            d(aacdVarI, aaagVar);
        }
    }

    @Override // org.eclipse.californium.scandium.dtls.ResumptionSupportingConnectionStore
    public aaam find(aacd aacdVar) {
        if (aacdVar == null || aacdVar.b()) {
            return null;
        }
        SessionStore sessionStore = this.j;
        aaam aaamVar = sessionStore != null ? sessionStore.get(aacdVar) : null;
        synchronized (this) {
            aaag aaagVarE = e(aacdVar);
            if (aaagVarE != null) {
                if (this.j == null) {
                    aaam aaamVarJ = aaagVarE.j();
                    if (aaamVarJ != null) {
                        aaamVar = new aaam(aaamVarJ);
                    }
                } else if (aaamVar == null) {
                    remove(aaagVarE, false);
                    return null;
                }
            }
            return aaamVar;
        }
    }

    private aaag e(aacd aacdVar) {
        if (aacdVar == null) {
            throw new NullPointerException("DTLS Session ID must not be null!");
        }
        ConcurrentMap<aacd, aaag> concurrentMap = this.e;
        if (concurrentMap == null) {
            return null;
        }
        aaag aaagVar = concurrentMap.get(aacdVar);
        if (aaagVar != null) {
            aacd aacdVarI = aaagVar.i();
            if (aacdVarI != null) {
                if (!aacdVar.equals(aacdVarI)) {
                    f78b.warn("{}connection {} changed session {}!={}!", this.f80c, aaagVar.c(), aacdVar, aacdVarI);
                }
            } else {
                f78b.warn("{}connection {} lost session {}!", this.f80c, aaagVar.c(), aacdVar);
            }
            this.f79a.a(aaagVar.c());
        }
        return aaagVar;
    }

    @Override // org.eclipse.californium.scandium.dtls.ResumptionSupportingConnectionStore
    public void markAllAsResumptionRequired() {
        synchronized (this) {
            for (aaag aaagVar : this.f79a.i()) {
                if (aaagVar.m() != null && !aaagVar.y()) {
                    aaagVar.a(true);
                    f78b.trace("{}connection: mark for resumption {}!", this.f80c, aaagVar);
                }
            }
        }
    }

    @Override // org.eclipse.californium.scandium.dtls.ResumptionSupportingConnectionStore
    public int remainingCapacity() {
        int iD;
        synchronized (this) {
            iD = this.f79a.d();
            f78b.debug("{}connection: size {}, remaining {}!", this.f80c, Integer.valueOf(this.f79a.c()), Integer.valueOf(iD));
        }
        return iD;
    }

    @Override // org.eclipse.californium.scandium.dtls.ResumptionSupportingConnectionStore
    public aaag get(InetSocketAddress inetSocketAddress) {
        aaag aaagVar;
        synchronized (this) {
            aaagVar = this.d.get(inetSocketAddress);
            if (aaagVar == null) {
                f78b.trace("{}connection: missing connection for {}!", this.f80c, zzp.e(inetSocketAddress));
            } else {
                InetSocketAddress inetSocketAddressM = aaagVar.m();
                if (inetSocketAddressM == null) {
                    f78b.warn("{}connection {} lost ip-address {}!", this.f80c, aaagVar.c(), zzp.e(inetSocketAddress));
                } else if (!inetSocketAddressM.equals(inetSocketAddress)) {
                    f78b.warn("{}connection {} changed ip-address {}!={}!", this.f80c, aaagVar.c(), zzp.e(inetSocketAddress), zzp.e(inetSocketAddressM));
                }
            }
        }
        return aaagVar;
    }

    @Override // org.eclipse.californium.scandium.dtls.ResumptionSupportingConnectionStore
    public aaag get(aaae aaaeVar) {
        aaag aaagVarC;
        synchronized (this) {
            aaagVarC = this.f79a.c(aaaeVar);
        }
        if (aaagVarC == null) {
            f78b.debug("{}connection: missing connection for {}!", this.f80c, aaaeVar);
            return aaagVarC;
        }
        aaae aaaeVarC = aaagVarC.c();
        if (aaaeVarC == null) {
            f78b.warn("{}connection lost cid {}!", this.f80c, aaaeVar);
            return aaagVarC;
        }
        if (!aaaeVarC.equals(aaaeVar)) {
            f78b.warn("{}connection changed cid {}!={}!", this.f80c, aaaeVarC, aaaeVar);
        }
        return aaagVarC;
    }

    @Override // org.eclipse.californium.scandium.dtls.ResumptionSupportingConnectionStore
    public boolean remove(aaag aaagVar, boolean z) {
        boolean z2;
        aacd aacdVarI = aaagVar.i();
        synchronized (this) {
            z2 = this.f79a.a(aaagVar.c(), aaagVar) == aaagVar;
            if (z2) {
                int iAb = aaagVar.ab();
                Logger logger = f78b;
                if (logger.isTraceEnabled()) {
                    logger.trace("{}connection: remove {} (size {}, left jobs: {})", this.f80c, aaagVar, Integer.valueOf(this.f79a.c()), Integer.valueOf(iAb), new Throwable("connection removed!"));
                } else if (iAb == 0) {
                    logger.debug("{}connection: remove {} (size {})", this.f80c, aaagVar, Integer.valueOf(this.f79a.c()));
                } else {
                    logger.debug("{}connection: remove {} (size {}, left jobs: {})", this.f80c, aaagVar, Integer.valueOf(this.f79a.c()), Integer.valueOf(iAb));
                }
                aaagVar.a((aaai) null);
                e(aaagVar);
                d(aacdVarI, aaagVar);
                ConnectionListener connectionListener = this.i;
                if (connectionListener != null) {
                    connectionListener.onConnectionRemoved(aaagVar);
                }
                aadd.a(aaagVar.b());
            }
        }
        if (z) {
            b(aacdVarI);
        }
        return z2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(aacd aacdVar, aaag aaagVar) {
        if (this.e == null || aacdVar == null || aacdVar.b()) {
            return;
        }
        this.e.remove(aacdVar, aaagVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(aaag aaagVar) {
        InetSocketAddress inetSocketAddressM = aaagVar.m();
        if (inetSocketAddressM != null) {
            this.d.remove(inetSocketAddressM, aaagVar);
            aaagVar.c((InetSocketAddress) null);
        }
    }

    private void b(aacd aacdVar) {
        if (this.j == null || aacdVar == null || aacdVar.b()) {
            return;
        }
        this.j.remove(aacdVar);
    }

    private void c(aaag aaagVar) {
        final InetSocketAddress inetSocketAddressM = aaagVar.m();
        if (inetSocketAddressM != null) {
            final aaag aaagVarPut = this.d.put(inetSocketAddressM, aaagVar);
            if (aaagVarPut != null && aaagVarPut != aaagVar) {
                Runnable runnable = new Runnable() { // from class: aabh.3
                    @Override // java.lang.Runnable
                    public void run() {
                        if (aaagVarPut.d(inetSocketAddressM)) {
                            aaagVarPut.c((InetSocketAddress) null);
                            if (aabh.this.e != null || aaagVarPut.e()) {
                                return;
                            }
                            aabh.this.remove(aaagVarPut, false);
                        }
                    }
                };
                f78b.debug("{}connection: {} - {} added! {} removed from address.", this.f80c, aaagVar.c(), zzp.e(inetSocketAddressM), aaagVarPut.c());
                if (aaagVarPut.x()) {
                    aaagVarPut.h().execute(runnable);
                    return;
                } else {
                    runnable.run();
                    return;
                }
            }
            f78b.debug("{}connection: {} - {} added!", this.f80c, aaagVar.c(), zzp.e(inetSocketAddressM));
            return;
        }
        f78b.debug("{}connection: {} - missing address!", this.f80c, aaagVar.c());
    }

    private void e(aacd aacdVar, aaag aaagVar) {
        final aaag aaagVarPut;
        ConcurrentMap<aacd, aaag> concurrentMap = this.e;
        if (concurrentMap == null || (aaagVarPut = concurrentMap.put(aacdVar, aaagVar)) == null || aaagVarPut == aaagVar) {
            return;
        }
        Runnable runnable = new Runnable() { // from class: aabh.4
            @Override // java.lang.Runnable
            public void run() {
                aabh.this.remove(aaagVarPut, false);
            }
        };
        if (aaagVarPut.x()) {
            aaagVarPut.h().execute(runnable);
        } else {
            runnable.run();
        }
    }

    @Override // org.eclipse.californium.scandium.dtls.ResumptionSupportingConnectionStore
    public final void clear() {
        synchronized (this) {
            Iterator<aaag> it = this.f79a.i().iterator();
            while (it.hasNext()) {
                SerialExecutor serialExecutorH = it.next().h();
                if (serialExecutorH != null) {
                    serialExecutorH.shutdownNow();
                }
            }
            this.f79a.e();
            ConcurrentMap<aacd, aaag> concurrentMap = this.e;
            if (concurrentMap != null) {
                concurrentMap.clear();
            }
            this.d.clear();
        }
    }

    @Override // org.eclipse.californium.scandium.dtls.ResumptionSupportingConnectionStore
    public final void stop(List<Runnable> list) {
        synchronized (this) {
            Iterator<aaag> it = this.f79a.i().iterator();
            while (it.hasNext()) {
                SerialExecutor serialExecutorH = it.next().h();
                if (serialExecutorH != null) {
                    serialExecutorH.b(list);
                }
            }
        }
    }

    @Override // org.eclipse.californium.scandium.dtls.ResumptionSupportingConnectionStore, java.lang.Iterable
    public Iterator<aaag> iterator() {
        return this.f79a.c(false);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00e6  */
    @Override // org.eclipse.californium.scandium.dtls.ResumptionSupportingConnectionStore, org.eclipse.californium.elements.PersistentConnector
    public int saveConnections(OutputStream outputStream, long j) throws IOException {
        int i;
        long j2;
        int iC = this.f79a.c();
        int i2 = iC / 20;
        zzl zzlVar = new zzl(4096);
        long jC = ClockUtil.c();
        synchronized (this.f79a) {
            Iterator<LeastRecentlyUsedCache.e<aaag>> itA = this.f79a.a();
            long j3 = jC;
            i = 0;
            boolean z = false;
            while (itA.hasNext()) {
                LeastRecentlyUsedCache.e<aaag> next = itA.next();
                long jE = next.e();
                boolean z2 = z;
                long j4 = j3;
                long seconds = TimeUnit.NANOSECONDS.toSeconds(jC - jE);
                if (seconds > j) {
                    f78b.trace("{}skip {} ts, {}s too quiet!", this.f80c, Long.valueOf(jE), Long.valueOf(seconds));
                    j2 = jC;
                    z = z2;
                } else {
                    Logger logger = f78b;
                    j2 = jC;
                    logger.trace("{}write {} ts, {}s ", this.f80c, Long.valueOf(jE), Long.valueOf(seconds));
                    if (next.c().b(zzlVar)) {
                        zzlVar.d(outputStream);
                        i++;
                    } else {
                        zzlVar.c();
                    }
                    z = (i2 <= 100 || i % i2 != 0) ? z2 : true;
                    if (z) {
                        long jC2 = ClockUtil.c();
                        if (z && jC2 - j4 > TimeUnit.SECONDS.toNanos(2L)) {
                            logger.info("{}written {} connections of {}", this.f80c, Integer.valueOf(i), Integer.valueOf(iC));
                            z = false;
                            j4 = jC2;
                        }
                    }
                }
                j3 = j4;
                jC = j2;
            }
        }
        zzs.d(outputStream);
        outputStream.flush();
        zzlVar.b();
        clear();
        return i;
    }

    @Override // org.eclipse.californium.scandium.dtls.ResumptionSupportingConnectionStore, org.eclipse.californium.elements.PersistentConnector
    public int loadConnections(InputStream inputStream, long j) throws IOException {
        long jC = ClockUtil.c();
        zzh zzhVar = new zzh(inputStream);
        char c2 = 0;
        long j2 = jC;
        int i = 0;
        while (true) {
            try {
                try {
                    aaag aaagVarE = aaag.e(zzhVar, j);
                    if (aaagVarE == null) {
                        return i;
                    }
                    long jK = aaagVarE.k();
                    if (jK - jC > 0) {
                        try {
                            zzk zzkVar = g;
                            Object[] objArr = new Object[3];
                            objArr[c2] = this.f80c;
                            objArr[1] = Long.valueOf(jK);
                            objArr[2] = Long.valueOf(jC);
                            zzkVar.e("{}read {} ts is after {} (future)", objArr);
                        } catch (IllegalArgumentException e) {
                            e = e;
                        }
                    }
                    Logger logger = f78b;
                    int i2 = i;
                    try {
                        logger.trace("{}read {} ts, {}s", this.f80c, Long.valueOf(jK), Long.valueOf(TimeUnit.NANOSECONDS.toSeconds(jC - jK)));
                        restore(aaagVarE);
                        i = i2 + 1;
                        long jC2 = ClockUtil.c();
                        if (jC2 - j2 > TimeUnit.SECONDS.toNanos(2L)) {
                            logger.info("{}read {} connections", this.f80c, Integer.valueOf(i));
                            j2 = jC2;
                        }
                        zzhVar = zzhVar;
                        c2 = 0;
                    } catch (IllegalArgumentException e2) {
                        e = e2;
                        i = i2;
                    }
                } catch (IllegalArgumentException e3) {
                    e = e3;
                }
            } finally {
                clear();
            }
            f78b.warn("{}reading failed after {} connections", this.f80c, Integer.valueOf(i), e);
            throw e;
        }
    }

    @Override // org.eclipse.californium.scandium.dtls.ResumptionSupportingConnectionStore
    public boolean restore(aaag aaagVar) {
        boolean z;
        aaae aaaeVarC = aaagVar.c();
        if (aaaeVarC == null) {
            throw new IllegalStateException("Connection must have a connection id!");
        }
        if (aaaeVarC.b()) {
            throw new IllegalStateException("Connection must have a none empty connection id!");
        }
        if (this.f79a.c(aaaeVarC) != null) {
            throw new IllegalStateException("Connection id already used! " + aaaeVarC);
        }
        synchronized (this.f79a) {
            z = false;
            if (this.f79a.a(aaaeVarC, aaagVar, aaagVar.k())) {
                Logger logger = f78b;
                if (logger.isTraceEnabled()) {
                    logger.trace("{}connection: add {} (size {})", this.f80c, aaagVar, Integer.valueOf(this.f79a.c()), new Throwable("connection added!"));
                } else {
                    logger.debug("{}connection: add {} (size {})", this.f80c, aaaeVarC, Integer.valueOf(this.f79a.c()));
                }
                c(aaagVar);
                z = true;
            } else {
                f78b.warn("{}connection store is full! {} max. entries.", this.f80c, Integer.valueOf(this.f79a.b()));
            }
        }
        if (z && aaagVar.p()) {
            putEstablishedSession(aaagVar);
        }
        return z;
    }
}
