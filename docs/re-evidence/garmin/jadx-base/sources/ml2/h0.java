package ml2;

import com.garmin.device.ble.BleCommunicationException;
import com.google.common.util.concurrent.AsyncFunction;
import com.google.common.util.concurrent.FluentFuture;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.common.util.concurrent.SettableFuture;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes11.dex */
public class h0 extends p {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f119352l = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final pj2.k f119353f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final UUID f119354g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final UUID f119355h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final byte f119356i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AtomicReference<SettableFuture<n>> f119357j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final SettableFuture<n> f119358k;

    public h0(pj2.k kVar, UUID uuid, UUID uuid2, byte b14, Collection<o> collection) {
        super(kVar.getMacAddress(), collection);
        this.f119357j = new AtomicReference<>();
        this.f119358k = SettableFuture.create();
        this.f119353f = kVar;
        this.f119354g = uuid;
        this.f119355h = uuid2;
        this.f119356i = b14;
    }

    @Override // ml2.p
    public final ListenableFuture<n> a() {
        Set<o> set = this.f119418b;
        if (set.isEmpty()) {
            return Futures.immediateFuture(this.f119421e);
        }
        final ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        pj2.l lVar = new pj2.l() { // from class: ml2.f0
            @Override // pj2.l
            public final void a(pj2.k kVar, UUID uuid, UUID uuid2, byte[] bArr) {
                int i14 = h0.f119352l;
                h0 h0Var = this.f119341a;
                Set<o> set2 = h0Var.f119418b;
                SettableFuture<n> andSet = h0Var.f119357j.getAndSet(null);
                if (andSet != null && m.f119394a.equals(uuid) && h0Var.f119354g.equals(uuid2)) {
                    int i15 = 1;
                    if (bArr == null || bArr.length < 1 || bArr[0] == h0Var.f119356i) {
                        if (bArr == null || bArr.length <= 2) {
                            andSet.setException(new BleCommunicationException("Device failed to change multi-link info page"));
                            return;
                        }
                        b0 b0VarB = h0Var.b(Arrays.copyOfRange(bArr, 1, bArr.length));
                        if (b0VarB == null) {
                            h0Var.f119417a.warn("Device failed to provide valid multi-link info page: " + dz2.c.a(bArr));
                            andSet.setException(new BleCommunicationException("Device failed to provide valid multi-link info page"));
                            return;
                        }
                        if (b0VarB instanceof b0.a) {
                            set2.remove(((b0.a) b0VarB).f119304a);
                        } else if (b0VarB instanceof b0.b) {
                            set2.removeIf(new b((b0.b) b0VarB, i15));
                        }
                        andSet.set(h0Var.f119421e);
                        Iterator<o> it = set2.iterator();
                        if (!it.hasNext()) {
                            h0Var.f119358k.set(h0Var.f119421e);
                        } else {
                            h0Var.c(scheduledExecutorServiceNewSingleThreadScheduledExecutor, 5, it.next());
                        }
                    }
                }
            }
        };
        this.f119353f.a(lVar, m.f119394a, this.f119354g);
        c(scheduledExecutorServiceNewSingleThreadScheduledExecutor, 5, set.iterator().next());
        fh2.a aVar = new fh2.a(this, 20, lVar, scheduledExecutorServiceNewSingleThreadScheduledExecutor);
        Executor executorDirectExecutor = MoreExecutors.directExecutor();
        SettableFuture<n> settableFuture = this.f119358k;
        settableFuture.addListener(aVar, executorDirectExecutor);
        return settableFuture;
    }

    public final FluentFuture c(final ScheduledExecutorService scheduledExecutorService, final int i14, final o oVar) {
        byte[] bArrA = oVar.a();
        byte[] bArr = new byte[bArrA.length + 1];
        bArr[0] = this.f119356i;
        System.arraycopy(bArrA, 0, bArr, 1, bArrA.length);
        SettableFuture<n> settableFutureCreate = SettableFuture.create();
        this.f119357j.set(settableFutureCreate);
        FluentFuture fluentFutureFrom = FluentFuture.from(this.f119353f.j(m.f119394a, this.f119355h, bArr));
        AsyncFunction asyncFunction = new AsyncFunction() { // from class: ml2.g0
            @Override // com.google.common.util.concurrent.AsyncFunction
            public final ListenableFuture apply(Object obj) throws Exception {
                int i15;
                Exception exc = (Exception) obj;
                int i16 = h0.f119352l;
                h0 h0Var = this.f119345a;
                Logger logger = h0Var.f119417a;
                if (h0Var.f119419c.get() || (i15 = i14) == 0) {
                    logger.warn(exc.getMessage(), (Throwable) exc);
                    h0Var.f119358k.setException(exc);
                    throw exc;
                }
                StringBuilder sb3 = new StringBuilder("Remaining retries ");
                int i17 = i15 - 1;
                sb3.append(i17);
                sb3.append(" for page ");
                o oVar2 = oVar;
                sb3.append(oVar2);
                logger.warn(sb3.toString());
                return h0Var.c(scheduledExecutorService, i17, oVar2);
            }
        };
        return fluentFutureFrom.transformAsync(new jn2.k(settableFutureCreate, 3), scheduledExecutorService).withTimeout(1L, TimeUnit.SECONDS, scheduledExecutorService).catchingAsync(BleCommunicationException.class, asyncFunction, scheduledExecutorService).catchingAsync(TimeoutException.class, asyncFunction, scheduledExecutorService);
    }
}
