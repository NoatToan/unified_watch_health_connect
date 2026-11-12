package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.security.Principal;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.eclipse.californium.elements.util.ClockUtil;
import org.eclipse.californium.elements.util.LeastRecentlyUpdatedCache;
import org.eclipse.californium.elements.util.SerialExecutor;
import org.eclipse.californium.scandium.ConnectionListener;
import org.eclipse.californium.scandium.dtls.ConnectionIdGenerator;
import org.eclipse.californium.scandium.dtls.Handshaker;
import org.eclipse.californium.scandium.dtls.ReadWriteLockConnectionStore;
import org.eclipse.californium.scandium.dtls.SessionStore;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes20.dex */
public class aabd implements ReadWriteLockConnectionStore {
    private static final zzk f;
    private static boolean g;
    private static final Logger i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final ConcurrentMap<aacd, aaag> f65a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final ConcurrentMap<Principal, aaag> f66b;
    protected final ConcurrentMap<InetSocketAddress, aaag> d;
    protected final LeastRecentlyUpdatedCache<aaae, aaag> e;
    private ConnectionListener h;
    private ConnectionIdGenerator j;
    private final SessionStore k;
    private volatile ExecutorService l;
    private volatile long m;
    private final AtomicBoolean o = new AtomicBoolean();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected String f67c = "";

    static {
        Logger loggerA = aaex.a((Class<?>) aabd.class);
        i = loggerA;
        f = new zzk(loggerA.getName(), 3L, TimeUnit.SECONDS.toNanos(10L));
        g = true;
    }

    public aabd(int i2, long j, SessionStore sessionStore, boolean z) {
        LeastRecentlyUpdatedCache<aaae, aaag> leastRecentlyUpdatedCache = new LeastRecentlyUpdatedCache<>(i2, j, TimeUnit.SECONDS);
        this.e = leastRecentlyUpdatedCache;
        this.d = new ConcurrentHashMap();
        this.f66b = z ? new ConcurrentHashMap() : null;
        this.k = sessionStore;
        if (g && sessionStore != null) {
            this.f65a = null;
        } else {
            this.f65a = new ConcurrentHashMap();
        }
        leastRecentlyUpdatedCache.a(new LeastRecentlyUpdatedCache.EvictionListener<aaag>() { // from class: aabd.1
            @Override // org.eclipse.californium.elements.util.LeastRecentlyUpdatedCache.EvictionListener
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public void onEviction(final aaag aaagVar) {
                Runnable runnable = new Runnable() { // from class: aabd.1.5
                    @Override // java.lang.Runnable
                    public void run() {
                        Handshaker handshakerO = aaagVar.o();
                        if (handshakerO != null) {
                            handshakerO.handshakeFailed(new aaah("Evicted!"));
                        }
                        synchronized (aabd.this) {
                            aabd.this.c(aaagVar);
                            aabd.this.a(aaagVar.i(), aaagVar);
                            ConnectionListener connectionListener = aabd.this.h;
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
        i.info("Created new InMemoryConnectionStore [capacity: {}, connection expiration threshold: {}s]", Integer.valueOf(i2), Long.valueOf(j));
    }

    public aabd d(String str) {
        synchronized (this) {
            this.f67c = zzp.j(str);
        }
        return this;
    }

    private aaae a() {
        for (int i2 = 0; i2 < 10; i2++) {
            aaae aaaeVarCreateConnectionId = this.j.createConnectionId();
            if (this.e.d(aaaeVarCreateConnectionId) == null) {
                return aaaeVarCreateConnectionId;
            }
        }
        return null;
    }

    @Override // org.eclipse.californium.scandium.dtls.ReadWriteLockConnectionStore
    public ReentrantReadWriteLock.ReadLock readLock() {
        return this.e.a();
    }

    @Override // org.eclipse.californium.scandium.dtls.ReadWriteLockConnectionStore
    public ReentrantReadWriteLock.WriteLock writeLock() {
        return this.e.f();
    }

    @Override // org.eclipse.californium.scandium.dtls.ResumptionSupportingConnectionStore
    public void setConnectionListener(ConnectionListener connectionListener) {
        this.h = connectionListener;
    }

    @Override // org.eclipse.californium.scandium.dtls.ReadWriteLockConnectionStore
    public void setExecutor(ExecutorService executorService) {
        this.l = executorService;
    }

    @Override // org.eclipse.californium.scandium.dtls.ResumptionSupportingConnectionStore
    public void attach(ConnectionIdGenerator connectionIdGenerator) {
        if (this.j != null) {
            throw new IllegalStateException("Connection id generator already attached!");
        }
        if (connectionIdGenerator == null || !connectionIdGenerator.useConnectionId()) {
            int iNumberOfLeadingZeros = (39 - Integer.numberOfLeadingZeros(this.e.b())) / 8;
            this.j = new aacg(iNumberOfLeadingZeros + (iNumberOfLeadingZeros < 3 ? 2 : 3));
        } else {
            this.j = connectionIdGenerator;
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
            if (this.j == null) {
                throw new IllegalStateException("Connection id generator must be attached before!");
            }
            aaaeVarC = a();
            if (aaaeVarC == null) {
                throw new IllegalStateException("Connection ids exhausted!");
            }
            aaagVar.d(aaaeVarC);
        } else {
            if (aaaeVarC.b()) {
                throw new IllegalStateException("Connection must have a none empty connection id!");
            }
            if (this.e.d(aaaeVarC) != null) {
                throw new IllegalStateException("Connection id already used! " + aaaeVarC);
            }
        }
        aaam aaamVarJ = aaagVar.j();
        this.e.f().lock();
        try {
            if (this.e.a(aaaeVarC, aaagVar)) {
                Logger logger = i;
                if (logger.isTraceEnabled()) {
                    logger.trace("{}connection: add {} (size {})", this.f67c, aaagVar, Integer.valueOf(this.e.h()), new Throwable("connection added!"));
                } else {
                    logger.debug("{}connection: add {} (size {})", this.f67c, aaaeVarC, Integer.valueOf(this.e.h()));
                }
                d(aaagVar);
                if (aaamVarJ != null) {
                    if (aaamVarJ.n() != null) {
                        b(aaamVarJ.n(), aaagVar, false);
                    }
                    d(aaamVarJ.l(), aaagVar);
                }
                z = true;
            } else {
                f.c("{}connection store is full! {} max. entries.", this.f67c, Integer.valueOf(this.e.b()));
            }
            this.e.f().unlock();
            if (z && (sessionStore = this.k) != null && aaamVarJ != null) {
                sessionStore.put(aaamVarJ);
            }
            return z;
        } catch (Throwable th) {
            this.e.f().unlock();
            throw th;
        }
    }

    @Override // org.eclipse.californium.scandium.dtls.ResumptionSupportingConnectionStore
    public boolean update(aaag aaagVar, InetSocketAddress inetSocketAddress) {
        if (aaagVar == null) {
            return false;
        }
        this.e.f().lock();
        try {
            if (this.e.e(aaagVar.c()) != null) {
                aaagVar.u();
                if (inetSocketAddress == null) {
                    i.debug("{}connection: {} updated usage!", this.f67c, aaagVar.c());
                } else if (!aaagVar.d(inetSocketAddress)) {
                    InetSocketAddress inetSocketAddressM = aaagVar.m();
                    Logger logger = i;
                    if (logger.isTraceEnabled()) {
                        logger.trace("{}connection: {} updated, address changed from {} to {}!", this.f67c, aaagVar.c(), zzp.e(inetSocketAddressM), zzp.e(inetSocketAddress), new Throwable("connection updated!"));
                    } else {
                        logger.debug("{}connection: {} updated, address changed from {} to {}!", this.f67c, aaagVar.c(), zzp.e(inetSocketAddressM), zzp.e(inetSocketAddress));
                    }
                    if (inetSocketAddressM != null) {
                        this.d.remove(inetSocketAddressM, aaagVar);
                        aaagVar.c((InetSocketAddress) null);
                    }
                    aaagVar.c(inetSocketAddress);
                    d(aaagVar);
                }
                return true;
            }
            i.debug("{}connection: {} - {} update failed!", this.f67c, aaagVar.c(), zzp.e(inetSocketAddress));
            return false;
        } finally {
            this.e.f().unlock();
        }
    }

    @Override // org.eclipse.californium.scandium.dtls.ResumptionSupportingConnectionStore
    public void putEstablishedSession(aaag aaagVar) {
        SessionStore sessionStore;
        aaam aaamVarJ = aaagVar.j();
        if (aaamVarJ == null) {
            throw new IllegalArgumentException("connection has no established session!");
        }
        ConnectionListener connectionListener = this.h;
        if (connectionListener != null) {
            connectionListener.onConnectionEstablished(aaagVar);
        }
        Principal principalN = aaamVarJ.n();
        aacd aacdVarL = aaamVarJ.l();
        boolean zB = aacdVarL.b();
        if (principalN == null && zB) {
            return;
        }
        this.e.f().lock();
        if (principalN != null) {
            try {
                b(principalN, aaagVar, false);
            } catch (Throwable th) {
                this.e.f().unlock();
                throw th;
            }
        }
        if (!zB) {
            d(aacdVarL, aaagVar);
        }
        this.e.f().unlock();
        if (zB || (sessionStore = this.k) == null) {
            return;
        }
        sessionStore.put(aaamVarJ);
    }

    @Override // org.eclipse.californium.scandium.dtls.ResumptionSupportingConnectionStore
    public void removeFromEstablishedSessions(aaag aaagVar) {
        aacd aacdVarI = aaagVar.i();
        if (aacdVarI == null) {
            throw new IllegalArgumentException("connection has no established session!");
        }
        this.e.f().lock();
        try {
            a(aacdVarI, aaagVar);
        } finally {
            this.e.f().unlock();
        }
    }

    @Override // org.eclipse.californium.scandium.dtls.ResumptionSupportingConnectionStore
    public aaam find(aacd aacdVar) {
        if (aacdVar == null || aacdVar.b()) {
            return null;
        }
        SessionStore sessionStore = this.k;
        aaam aaamVar = sessionStore != null ? sessionStore.get(aacdVar) : null;
        aaag aaagVarD = d(aacdVar);
        if (aaagVarD != null) {
            if (this.k == null) {
                aaam aaamVarJ = aaagVarD.j();
                if (aaamVarJ != null) {
                    return new aaam(aaamVarJ);
                }
            } else if (aaamVar == null) {
                remove(aaagVarD, false);
                return null;
            }
        }
        return aaamVar;
    }

    private aaag d(aacd aacdVar) {
        if (aacdVar == null) {
            throw new NullPointerException("DTLS Session ID must not be null!");
        }
        ConcurrentMap<aacd, aaag> concurrentMap = this.f65a;
        if (concurrentMap == null) {
            return null;
        }
        aaag aaagVar = concurrentMap.get(aacdVar);
        if (aaagVar != null) {
            aacd aacdVarI = aaagVar.i();
            if (aacdVarI != null) {
                if (!aacdVar.equals(aacdVarI)) {
                    i.warn("{}connection {} changed session {}!={}!", this.f67c, aaagVar.c(), aacdVar, aacdVarI);
                }
            } else {
                i.warn("{}connection {} lost session {}!", this.f67c, aaagVar.c(), aacdVar);
            }
            this.e.e(aaagVar.c());
        }
        return aaagVar;
    }

    @Override // org.eclipse.californium.scandium.dtls.ResumptionSupportingConnectionStore
    public void markAllAsResumptionRequired() {
        for (aaag aaagVar : this.e.j()) {
            if (aaagVar.m() != null && !aaagVar.y()) {
                aaagVar.a(true);
                i.trace("{}connection: mark for resumption {}!", this.f67c, aaagVar);
            }
        }
    }

    @Override // org.eclipse.californium.scandium.dtls.ResumptionSupportingConnectionStore
    public int remainingCapacity() {
        int iC = this.e.c();
        i.debug("{}connection: size {}, remaining {}!", this.f67c, Integer.valueOf(this.e.h()), Integer.valueOf(iC));
        return iC;
    }

    @Override // org.eclipse.californium.scandium.dtls.ReadWriteLockConnectionStore
    public void shrink(int i2, AtomicBoolean atomicBoolean) {
        int iH;
        if (this.f66b == null || 1024 >= (iH = this.e.h())) {
            return;
        }
        int size = this.f66b.size();
        if (size * 2 < iH || i2 % 12 == 9) {
            if (this.o.compareAndSet(false, true)) {
                i.info("{}: start shrinking {}/{}", this.f67c, Integer.valueOf(size), Integer.valueOf(iH));
                d(atomicBoolean, false);
                return;
            } else {
                i.info("{}: shrinking {}/{} ...", this.f67c, Integer.valueOf(size), Integer.valueOf(iH));
                return;
            }
        }
        i.info("{}: no shrinking {}/{}", this.f67c, Integer.valueOf(size), Integer.valueOf(iH));
    }

    private void d(AtomicBoolean atomicBoolean, boolean z) {
        int iMax = Math.max(10000, this.e.h() / 5);
        this.m = ClockUtil.c();
        Iterator<aaag> itD = this.e.d();
        int i2 = 0;
        int i3 = 0;
        while (atomicBoolean.get() && itD.hasNext()) {
            try {
                final aaag next = itD.next();
                i2++;
                if (i2 % iMax == 0) {
                    i.info("{}shrink {}: {}", this.f67c, Integer.valueOf(i2), next.c());
                }
                if (next.w()) {
                    if (this.e.b(next.c())) {
                        Runnable runnable = new Runnable() { // from class: aabd.4
                            @Override // java.lang.Runnable
                            public void run() {
                                aabd.i.trace("{}Remove connection from stale principals", aabd.this.f67c);
                                aabd.this.remove(next, false);
                            }
                        };
                        if (next.x()) {
                            next.h().execute(runnable);
                        } else {
                            remove(next, false);
                        }
                        i3++;
                    } else if (!z) {
                        break;
                    }
                }
            } catch (Throwable th) {
                this.m = ClockUtil.c() - this.m;
                i.error("{}: shrinking failed, {} of {}/{} in {} ms", this.f67c, Integer.valueOf(i3), Integer.valueOf(this.f66b.size()), Integer.valueOf(this.e.h()), Long.valueOf(TimeUnit.NANOSECONDS.toMillis(this.m)), th);
            }
        }
        this.m = ClockUtil.c() - this.m;
        int iH = this.e.h();
        int size = this.f66b.size();
        if (i3 > 0) {
            i.info("{}: shrinked {} of {}/{} in {} ms", this.f67c, Integer.valueOf(i3), Integer.valueOf(size), Integer.valueOf(iH), Long.valueOf(TimeUnit.NANOSECONDS.toMillis(this.m)), null);
        } else {
            i.info("{}: nothing shrinked, {}/{} in {} ms", this.f67c, Integer.valueOf(size), Integer.valueOf(iH), Long.valueOf(TimeUnit.NANOSECONDS.toMillis(this.m)), null);
        }
        this.o.set(false);
    }

    @Override // org.eclipse.californium.scandium.dtls.ResumptionSupportingConnectionStore
    public aaag get(InetSocketAddress inetSocketAddress) {
        aaag aaagVar = this.d.get(inetSocketAddress);
        if (aaagVar == null) {
            i.trace("{}connection: missing connection for {}!", this.f67c, zzp.e(inetSocketAddress));
            return aaagVar;
        }
        InetSocketAddress inetSocketAddressM = aaagVar.m();
        if (inetSocketAddressM == null) {
            i.warn("{}connection {} lost ip-address {}!", this.f67c, aaagVar.c(), zzp.e(inetSocketAddress));
            return aaagVar;
        }
        if (!inetSocketAddressM.equals(inetSocketAddress)) {
            i.warn("{}connection {} changed ip-address {}!={}!", this.f67c, aaagVar.c(), zzp.e(inetSocketAddress), zzp.e(inetSocketAddressM));
        }
        return aaagVar;
    }

    @Override // org.eclipse.californium.scandium.dtls.ResumptionSupportingConnectionStore
    public aaag get(aaae aaaeVar) {
        aaag aaagVarD = this.e.d(aaaeVar);
        if (aaagVarD == null) {
            i.debug("{}connection: missing connection for {}!", this.f67c, aaaeVar);
            return aaagVarD;
        }
        aaae aaaeVarC = aaagVarD.c();
        if (aaaeVarC == null) {
            i.warn("{}connection lost cid {}!", this.f67c, aaaeVar);
            return aaagVarD;
        }
        if (!aaaeVarC.equals(aaaeVar)) {
            i.warn("{}connection changed cid {}!={}!", this.f67c, aaaeVarC, aaaeVar);
        }
        return aaagVarD;
    }

    @Override // org.eclipse.californium.scandium.dtls.ResumptionSupportingConnectionStore
    public boolean remove(aaag aaagVar, boolean z) {
        aaam aaamVarJ = aaagVar.j();
        aacd aacdVarL = aaamVarJ == null ? null : aaamVarJ.l();
        Principal principalN = aaamVarJ == null ? null : aaamVarJ.n();
        this.e.f().lock();
        try {
            boolean z2 = this.e.c(aaagVar.c(), aaagVar) == aaagVar;
            if (z2) {
                int iAb = aaagVar.ab();
                Logger logger = i;
                if (logger.isTraceEnabled()) {
                    logger.trace("{}connection: remove {} (size {}, left jobs: {})", this.f67c, aaagVar, Integer.valueOf(this.e.h()), Integer.valueOf(iAb), new Throwable("connection removed!"));
                } else if (iAb == 0) {
                    logger.debug("{}connection: remove {} (size {})", this.f67c, aaagVar, Integer.valueOf(this.e.h()));
                } else {
                    logger.debug("{}connection: remove {} (size {}, left jobs: {})", this.f67c, aaagVar, Integer.valueOf(this.e.h()), Integer.valueOf(iAb));
                }
                aaagVar.a((aaai) null);
                c(aaagVar);
                a(aacdVarL, aaagVar);
                a(principalN, aaagVar);
                ConnectionListener connectionListener = this.h;
                if (connectionListener != null) {
                    connectionListener.onConnectionRemoved(aaagVar);
                }
                aadd.a(aaagVar.b());
            }
            this.e.f().unlock();
            if (z) {
                b(aacdVarL);
            }
            return z2;
        } catch (Throwable th) {
            this.e.f().unlock();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(aacd aacdVar, aaag aaagVar) {
        if (this.f65a == null || aacdVar == null || aacdVar.b()) {
            return;
        }
        this.f65a.remove(aacdVar, aaagVar);
    }

    private void a(Principal principal, aaag aaagVar) {
        ConcurrentMap<Principal, aaag> concurrentMap = this.f66b;
        if (concurrentMap == null || principal == null) {
            return;
        }
        concurrentMap.remove(principal, aaagVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(aaag aaagVar) {
        InetSocketAddress inetSocketAddressM = aaagVar.m();
        if (inetSocketAddressM != null) {
            this.d.remove(inetSocketAddressM, aaagVar);
            aaagVar.c((InetSocketAddress) null);
        }
    }

    private void b(aacd aacdVar) {
        if (this.k == null || aacdVar == null || aacdVar.b()) {
            return;
        }
        this.k.remove(aacdVar);
    }

    private void d(aaag aaagVar) {
        final InetSocketAddress inetSocketAddressM = aaagVar.m();
        if (inetSocketAddressM != null) {
            final aaag aaagVarPut = this.d.put(inetSocketAddressM, aaagVar);
            if (aaagVarPut != null && aaagVarPut != aaagVar) {
                Runnable runnable = new Runnable() { // from class: aabd.3
                    @Override // java.lang.Runnable
                    public void run() {
                        if (aaagVarPut.d(inetSocketAddressM)) {
                            aaagVarPut.c((InetSocketAddress) null);
                            if (aabd.this.f65a != null || aaagVarPut.e()) {
                                return;
                            }
                            aabd.this.remove(aaagVarPut, false);
                        }
                    }
                };
                i.debug("{}connection: {} - {} added! {} removed from address.", this.f67c, aaagVar.c(), zzp.e(inetSocketAddressM), aaagVarPut.c());
                if (aaagVarPut.x()) {
                    aaagVarPut.h().execute(runnable);
                    return;
                } else {
                    runnable.run();
                    return;
                }
            }
            i.debug("{}connection: {} - {} added!", this.f67c, aaagVar.c(), zzp.e(inetSocketAddressM));
            return;
        }
        i.debug("{}connection: {} - missing address!", this.f67c, aaagVar.c());
    }

    private boolean d(aacd aacdVar, aaag aaagVar) {
        aaag aaagVarPut;
        ConcurrentMap<aacd, aaag> concurrentMap = this.f65a;
        if (concurrentMap == null || (aaagVarPut = concurrentMap.put(aacdVar, aaagVar)) == null || aaagVarPut == aaagVar) {
            return false;
        }
        e("session", aaagVarPut);
        return true;
    }

    private boolean b(Principal principal, aaag aaagVar, boolean z) {
        aaag aaagVarPut;
        ConcurrentMap<Principal, aaag> concurrentMap = this.f66b;
        if (concurrentMap == null || (aaagVarPut = concurrentMap.put(principal, aaagVar)) == null || aaagVarPut == aaagVar) {
            return false;
        }
        if (z) {
            e("principal", aaagVarPut);
            return true;
        }
        aaagVarPut.z();
        aaagVarPut.j().d(principal);
        return false;
    }

    private void e(final String str, final aaag aaagVar) {
        Runnable runnable = new Runnable() { // from class: aabd.2
            @Override // java.lang.Runnable
            public void run() {
                aabd.i.debug("{}Remove connection from {}", aabd.this.f67c, str);
                aabd.this.remove(aaagVar, false);
            }
        };
        if (aaagVar.x()) {
            aaagVar.h().execute(runnable);
        } else {
            runnable.run();
        }
    }

    @Override // org.eclipse.californium.scandium.dtls.ResumptionSupportingConnectionStore
    public final void clear() {
        Iterator<aaag> it = this.e.j().iterator();
        while (it.hasNext()) {
            SerialExecutor serialExecutorH = it.next().h();
            if (serialExecutorH != null) {
                serialExecutorH.shutdownNow();
            }
        }
        this.e.e();
        ConcurrentMap<aacd, aaag> concurrentMap = this.f65a;
        if (concurrentMap != null) {
            concurrentMap.clear();
        }
        this.d.clear();
    }

    @Override // org.eclipse.californium.scandium.dtls.ResumptionSupportingConnectionStore
    public final void stop(List<Runnable> list) {
        Iterator<aaag> it = this.e.j().iterator();
        while (it.hasNext()) {
            SerialExecutor serialExecutorH = it.next().h();
            if (serialExecutorH != null) {
                serialExecutorH.b(list);
            }
        }
    }

    @Override // org.eclipse.californium.scandium.dtls.ResumptionSupportingConnectionStore, java.lang.Iterable
    public Iterator<aaag> iterator() {
        return this.e.g();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00c5  */
    @Override // org.eclipse.californium.scandium.dtls.ResumptionSupportingConnectionStore, org.eclipse.californium.elements.PersistentConnector
    public int saveConnections(OutputStream outputStream, long j) throws IOException {
        long j2;
        Iterator<LeastRecentlyUpdatedCache.b<aaag>> it;
        int iH = this.e.h();
        int i2 = iH / 20;
        zzl zzlVar = new zzl(4096);
        long jC = ClockUtil.c();
        Iterator<LeastRecentlyUpdatedCache.b<aaag>> itI = this.e.i();
        long j3 = jC;
        int i3 = 0;
        boolean z = false;
        while (itI.hasNext()) {
            LeastRecentlyUpdatedCache.b<aaag> next = itI.next();
            long jA = next.a();
            int i4 = i3;
            long seconds = TimeUnit.NANOSECONDS.toSeconds(jC - jA);
            if (seconds > j) {
                i.trace("{}skip {} ts, {}s too quiet!", this.f67c, Long.valueOf(jA), Long.valueOf(seconds));
                j2 = jC;
                it = itI;
                i3 = i4;
            } else {
                Logger logger = i;
                j2 = jC;
                logger.trace("{}write {} ts, {}s ", this.f67c, Long.valueOf(jA), Long.valueOf(seconds));
                if (next.e().b(zzlVar)) {
                    zzlVar.d(outputStream);
                    i3 = i4 + 1;
                } else {
                    zzlVar.c();
                    i3 = i4;
                }
                if (i2 > 100 && i3 % i2 == 0) {
                    z = true;
                }
                if (z) {
                    long jC2 = ClockUtil.c();
                    if (z) {
                        it = itI;
                        if (jC2 - j3 > TimeUnit.SECONDS.toNanos(2L)) {
                            logger.info("{}written {} connections of {}", this.f67c, Integer.valueOf(i3), Integer.valueOf(iH));
                            j3 = jC2;
                            z = false;
                        }
                    } else {
                        it = itI;
                    }
                } else {
                    it = itI;
                }
            }
            itI = it;
            jC = j2;
        }
        int i5 = i3;
        zzs.d(outputStream);
        outputStream.flush();
        zzlVar.b();
        clear();
        return i5;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x009e A[Catch: IllegalArgumentException -> 0x0046, all -> 0x00b9, TRY_LEAVE, TryCatch #2 {all -> 0x00b9, blocks: (B:4:0x0013, B:6:0x0019, B:9:0x0025, B:19:0x005f, B:21:0x0069, B:23:0x008c, B:25:0x009e, B:36:0x00be, B:37:0x00db, B:14:0x004b, B:16:0x0051), top: B:42:0x0013 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00ad A[SYNTHETIC] */
    @Override // org.eclipse.californium.scandium.dtls.ResumptionSupportingConnectionStore, org.eclipse.californium.elements.PersistentConnector
    public int loadConnections(InputStream inputStream, long j) throws IOException {
        zzh zzhVar;
        int i2;
        long jC;
        long jC2 = ClockUtil.c();
        zzh zzhVar2 = new zzh(inputStream);
        char c2 = 0;
        long j2 = jC2;
        int i3 = 0;
        while (true) {
            try {
                try {
                    aaag aaagVarE = aaag.e(zzhVar2, j);
                    if (aaagVarE == null) {
                        return i3;
                    }
                    long jK = aaagVarE.k();
                    try {
                        if (jK - jC2 > 0) {
                            try {
                                zzk zzkVar = f;
                                zzhVar = zzhVar2;
                                Object[] objArr = new Object[3];
                                objArr[c2] = this.f67c;
                                objArr[1] = Long.valueOf(jK);
                                objArr[2] = Long.valueOf(jC2);
                                zzkVar.e("{}read {} ts is after {} (future)", objArr);
                            } catch (IllegalArgumentException e) {
                                e = e;
                                i.warn("{}reading failed after {} connections", this.f67c, Integer.valueOf(i3), e);
                                throw e;
                            }
                        } else {
                            zzhVar = zzhVar2;
                            if (!aaagVarE.w() || (!this.e.b(aaagVarE.c()))) {
                            }
                            jC = ClockUtil.c();
                            if (jC - j2 > TimeUnit.SECONDS.toNanos(2L)) {
                                i.info("{}read {} connections", this.f67c, Integer.valueOf(i3));
                                j2 = jC;
                            }
                            zzhVar2 = zzhVar;
                            c2 = 0;
                        }
                        i.trace("{}read {} ts, {}s", this.f67c, Long.valueOf(jK), Long.valueOf(TimeUnit.NANOSECONDS.toSeconds(jC2 - jK)));
                        restore(aaagVarE);
                        i3 = i2 + 1;
                        jC = ClockUtil.c();
                        if (jC - j2 > TimeUnit.SECONDS.toNanos(2L)) {
                            i.info("{}read {} connections", this.f67c, Integer.valueOf(i3));
                            j2 = jC;
                        }
                        zzhVar2 = zzhVar;
                        c2 = 0;
                    } catch (IllegalArgumentException e2) {
                        e = e2;
                        i3 = i2;
                        i.warn("{}reading failed after {} connections", this.f67c, Integer.valueOf(i3), e);
                        throw e;
                    }
                    i2 = i3;
                } catch (IllegalArgumentException e3) {
                    e = e3;
                }
            } finally {
                clear();
            }
        }
    }

    @Override // org.eclipse.californium.scandium.dtls.ResumptionSupportingConnectionStore
    public boolean restore(aaag aaagVar) {
        aaae aaaeVarC = aaagVar.c();
        if (aaaeVarC == null) {
            throw new IllegalStateException("Connection must have a connection id!");
        }
        if (aaaeVarC.b()) {
            throw new IllegalStateException("Connection must have a none empty connection id!");
        }
        if (this.e.d(aaaeVarC) != null) {
            throw new IllegalStateException("Connection id already used! " + aaaeVarC);
        }
        this.e.f().lock();
        try {
            boolean z = false;
            if (this.e.a(aaaeVarC, aaagVar, aaagVar.k())) {
                Logger logger = i;
                if (logger.isTraceEnabled()) {
                    logger.trace("{}connection: add {} (size {})", this.f67c, aaagVar, Integer.valueOf(this.e.h()), new Throwable("connection added!"));
                } else {
                    logger.debug("{}connection: add {} (size {})", this.f67c, aaaeVarC, Integer.valueOf(this.e.h()));
                }
                d(aaagVar);
                if (!aaagVar.x()) {
                    aaagVar.a(this.l, this.h);
                }
                z = true;
            } else {
                i.warn("{}connection store is full! {} max. entries.", this.f67c, Integer.valueOf(this.e.b()));
            }
            this.e.f().unlock();
            if (z && aaagVar.p()) {
                putEstablishedSession(aaagVar);
            }
            return z;
        } catch (Throwable th) {
            this.e.f().unlock();
            throw th;
        }
    }
}
