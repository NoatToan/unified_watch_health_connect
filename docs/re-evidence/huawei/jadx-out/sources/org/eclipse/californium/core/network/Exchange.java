package org.eclipse.californium.core.network;

import androidx.lifecycle.LifecycleKt$$ExternalSyntheticBackportWithForwarding0;
import defpackage.aaex;
import defpackage.zuv;
import defpackage.zvd;
import defpackage.zve;
import defpackage.zvf;
import defpackage.zvg;
import defpackage.zvp;
import defpackage.zvt;
import defpackage.zvv;
import defpackage.zzp;
import java.net.InetSocketAddress;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.eclipse.californium.core.coap.CoAP;
import org.eclipse.californium.core.coap.Message;
import org.eclipse.californium.core.config.CoapConfig;
import org.eclipse.californium.core.observe.ObserveRelation;
import org.eclipse.californium.elements.EndpointContext;
import org.eclipse.californium.elements.util.CheckedExecutor;
import org.eclipse.californium.elements.util.ClockUtil;
import org.eclipse.californium.elements.util.SerialExecutor;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes20.dex */
public class Exchange {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AtomicInteger f44433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Logger f44434b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final boolean f44435c;
    private static final CheckedExecutor e;
    private final Object aa;
    private volatile ObserveRelation ab;
    private zvt ac;
    private volatile RemoveHandler ad;
    private volatile boolean ae;
    private volatile ScheduledFuture<?> af;
    private float ag;
    private volatile zvf ah;
    private volatile long ai;
    private boolean aj;
    private boolean am;
    private long an;
    private volatile zuv d;
    private Throwable f;
    private zvt g;
    private final AtomicBoolean h;
    private volatile zvg i;
    private zvv j;
    private volatile Endpoint k;
    private volatile EndpointContextOperator l;
    private int m;
    private volatile zvf n;
    private final AtomicReference<EndpointContext> o;
    private final long p;
    private final int q;
    private volatile int r;
    private final boolean s;
    private final CheckedExecutor t;
    private long u;
    private volatile List<d> v;
    private volatile Integer w;
    private final boolean x;
    private final Origin y;
    private volatile zvg z;

    public interface EndpointContextOperator {
        EndpointContext apply(EndpointContext endpointContext);
    }

    public enum Origin {
        LOCAL,
        REMOTE
    }

    static {
        Logger loggerA = aaex.a((Class<?>) Exchange.class);
        f44434b = loggerA;
        e = new CheckedExecutor() { // from class: org.eclipse.californium.core.network.Exchange.5
            @Override // org.eclipse.californium.elements.util.CheckedExecutor
            public void assertOwner() {
            }

            @Override // org.eclipse.californium.elements.util.CheckedExecutor
            public boolean checkOwner() {
                return true;
            }

            @Override // java.util.concurrent.Executor
            public void execute(Runnable runnable) {
                runnable.run();
            }
        };
        f44435c = loggerA.isTraceEnabled();
        f44433a = new AtomicInteger();
    }

    public Exchange(zvg zvgVar, Object obj, Origin origin, Executor executor) {
        this(zvgVar, obj, origin, executor, null, false);
    }

    public Exchange(zvg zvgVar, Object obj, Origin origin, Executor executor, EndpointContext endpointContext, boolean z) {
        this.h = new AtomicBoolean();
        boolean z2 = false;
        this.r = 0;
        AtomicReference<EndpointContext> atomicReference = new AtomicReference<>();
        this.o = atomicReference;
        if (zvgVar == null) {
            throw new NullPointerException("request must not be null!");
        }
        executor = executor == null ? e : executor;
        this.q = f44433a.incrementAndGet();
        this.t = executor instanceof CheckedExecutor ? (CheckedExecutor) executor : new SerialExecutor(executor);
        this.i = zvgVar;
        this.z = zvgVar;
        this.y = origin;
        this.aa = obj;
        atomicReference.set(endpointContext);
        if (!z && zvgVar.m() && origin == Origin.LOCAL) {
            z2 = true;
        }
        this.s = z2;
        this.x = z;
        this.p = ClockUtil.c();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Exchange[");
        sb.append(this.y == Origin.LOCAL ? 'L' : 'R');
        sb.append(this.q);
        sb.append(", ");
        Object obj = this.aa;
        if (obj instanceof InetSocketAddress) {
            sb.append(zzp.c((InetSocketAddress) obj));
        } else {
            sb.append(obj);
        }
        if (this.h.get()) {
            sb.append(", complete");
        }
        sb.append(']');
        return sb.toString();
    }

    public void af() {
        d(this.i.getSourceContext());
    }

    public void d(EndpointContext endpointContext) {
        zvg zvgVar = this.i;
        if (!zvgVar.hasMID() || zvgVar.isRejected() || zvgVar.isAcknowledged()) {
            return;
        }
        zvgVar.setRejected(true);
        if (zvgVar.j()) {
            return;
        }
        this.k.sendEmptyMessage(this, zvd.c(zvgVar, endpointContext));
    }

    public Origin k() {
        return this.y;
    }

    public boolean ac() {
        return this.y == Origin.LOCAL;
    }

    public InetSocketAddress t() {
        EndpointContext sourceContext;
        if (this.y == Origin.LOCAL) {
            sourceContext = this.i.getDestinationContext();
            if (sourceContext == null) {
                throw new IllegalArgumentException("Outgoing request must have destination context");
            }
        } else {
            sourceContext = this.i.getSourceContext();
            if (sourceContext == null) {
                throw new IllegalArgumentException("Incoming request must have source context");
            }
        }
        return sourceContext.getPeerAddress();
    }

    public boolean w() {
        return this.x;
    }

    public zvg p() {
        return this.z;
    }

    public void a(zvg zvgVar) {
        zve token;
        ag();
        if (this.z != zvgVar) {
            if (this.s && (token = this.z.getToken()) != null && !token.equals(zvgVar.getToken())) {
                throw new IllegalArgumentException(this + " token missmatch (" + token + "!=" + zvgVar.getToken() + ")!");
            }
            this.z = zvgVar;
        }
    }

    public zvg f() {
        return this.i;
    }

    public void d(zvg zvgVar) {
        ag();
        if (this.i != zvgVar) {
            a((ScheduledFuture<?>) null);
            this.r = 0;
            f44434b.debug("{} replace {} by {}", this, this.i, zvgVar);
            this.i = zvgVar;
        }
    }

    public zvf r() {
        return this.ah;
    }

    public void c(zvf zvfVar) {
        ag();
        this.ah = zvfVar;
    }

    public zvf j() {
        return this.n;
    }

    public void a(zvf zvfVar) {
        ag();
        if (this.n != zvfVar) {
            if (!ac() && this.j != null && this.n != null && this.n.getType() == CoAP.Type.NON && this.n.g()) {
                f44434b.info("{} store NON notification: {}", this, this.j);
                long jC = ClockUtil.c();
                RemoveHandler removeHandler = this.ad;
                while (true) {
                    if (!this.v.isEmpty()) {
                        d dVar = this.v.get(0);
                        if (!dVar.b(jC)) {
                            break;
                        }
                        this.v.remove(0);
                        if (removeHandler != null) {
                            zvv zvvVarB = dVar.b();
                            f44434b.info("{} removing expired NON notification: {}", this, zvvVarB);
                            removeHandler.remove(this, null, zvvVarB);
                        }
                    } else {
                        break;
                    }
                }
                if (this.u == 0) {
                    Endpoint endpoint = this.k;
                    if (endpoint != null) {
                        this.u = endpoint.getConfig().e(CoapConfig.an, TimeUnit.NANOSECONDS).longValue();
                    } else {
                        this.u = TimeUnit.SECONDS.toNanos(145L);
                    }
                }
                this.v.add(new d(this.j, jC + this.u));
                this.j = null;
            }
            this.n = zvfVar;
        }
    }

    public zvv n() {
        return this.j;
    }

    public void b(zvv zvvVar) {
        zvv zvvVar2;
        ag();
        if (zvvVar.equals(this.j)) {
            return;
        }
        RemoveHandler removeHandler = this.ad;
        if (removeHandler != null && (zvvVar2 = this.j) != null) {
            removeHandler.remove(this, null, zvvVar2);
        }
        this.j = zvvVar;
    }

    public void d(zvt zvtVar) {
        zvt zvtVar2;
        ag();
        if (!ac()) {
            throw new IllegalStateException("Token is only supported for local exchanges!");
        }
        if (zvtVar.equals(this.g)) {
            return;
        }
        RemoveHandler removeHandler = this.ad;
        if (removeHandler != null && (zvtVar2 = this.g) != null && !zvtVar2.equals(this.ac)) {
            removeHandler.remove(this, this.g, null);
        }
        this.g = zvtVar;
        if (this.s && this.ac == null) {
            this.ac = zvtVar;
        }
    }

    public zvt l() {
        return this.g;
    }

    public zuv b() {
        return this.d;
    }

    public void d(zuv zuvVar) {
        this.d = zuvVar;
    }

    public void d(Endpoint endpoint) {
        this.k = endpoint;
    }

    public Object q() {
        return this.aa;
    }

    public void d(Message message) {
        ag();
        f44434b.debug("{} timed out {}!", this, message);
        if (y()) {
            return;
        }
        ai();
        this.ae = true;
        message.setTimedOut(true);
        if (this.z == null || this.z == message || this.i != message) {
            return;
        }
        this.z.setTimedOut(true);
    }

    public int m() {
        return this.r;
    }

    public int x() {
        ag();
        int i = this.r + 1;
        this.r = i;
        return i;
    }

    public float v() {
        return this.ag;
    }

    public void e(float f) {
        if (f < 1.0f) {
            throw new IllegalArgumentException("Timeout scale factor must be at least 1.0, not " + f);
        }
        this.ag = f;
    }

    public int g() {
        return this.m;
    }

    public void e(int i) {
        if (i <= 1) {
            throw new IllegalArgumentException("Timeout  must be larger than 1 ms, not " + i);
        }
        this.m = i;
    }

    public boolean ad() {
        return this.af != null;
    }

    public void a(ScheduledFuture<?> scheduledFuture) {
        ag();
        if (!this.h.get() || scheduledFuture == null) {
            ScheduledFuture<?> scheduledFuture2 = this.af;
            this.af = scheduledFuture;
            if (scheduledFuture2 != null) {
                scheduledFuture2.cancel(false);
            }
        }
    }

    public void aa() {
        ag();
        if (this.y == Origin.REMOTE) {
            this.f = null;
            this.h.set(false);
        } else {
            throw new IllegalStateException(this + " retransmit on local exchange not allowed!");
        }
    }

    public void a(int i) {
        if (i < 0 || i > 16777215) {
            throw new IllegalArgumentException(this + " illegal observe number");
        }
        this.w = Integer.valueOf(i);
    }

    public Integer o() {
        return this.w;
    }

    public void c(RemoveHandler removeHandler) {
        this.ad = removeHandler;
    }

    public boolean y() {
        return this.h.get();
    }

    public Throwable i() {
        return this.f;
    }

    public boolean ai() {
        ag();
        if (this.h.compareAndSet(false, true)) {
            if (f44435c) {
                this.f = new Throwable(toString());
                Logger logger = f44434b;
                if (logger.isTraceEnabled()) {
                    logger.trace("{}!", this, this.f);
                } else {
                    logger.debug("{}!", this);
                }
            } else {
                f44434b.debug("{}!", this);
            }
            a((ScheduledFuture<?>) null);
            RemoveHandler removeHandler = this.ad;
            if (removeHandler != null) {
                if (this.y == Origin.LOCAL) {
                    zvt zvtVar = this.g;
                    if (zvtVar != null || this.j != null) {
                        removeHandler.remove(this, zvtVar, this.j);
                    }
                    zvt zvtVar2 = this.g;
                    zvt zvtVar3 = this.ac;
                    if (zvtVar2 != zvtVar3) {
                        removeHandler.remove(this, zvtVar3, null);
                    }
                    Logger logger2 = f44434b;
                    if (logger2.isDebugEnabled()) {
                        zvg zvgVarF = f();
                        zvg zvgVarP = p();
                        if (zvgVarP == zvgVarF) {
                            logger2.debug("local {} completed {}!", this, zvgVarP);
                        } else {
                            logger2.debug("local {} completed {} -/- {}!", this, zvgVarP, zvgVarF);
                        }
                    }
                } else {
                    zvf zvfVarJ = j();
                    if (zvfVarJ == null) {
                        f44434b.debug("remote {} rejected (without response)!", this);
                    } else {
                        zvv zvvVar = this.j;
                        if (zvvVar != null) {
                            removeHandler.remove(this, null, zvvVar);
                        }
                        z();
                        zvf zvfVarR = r();
                        if (zvfVarR == zvfVarJ || zvfVarR == null) {
                            f44434b.debug("Remote {} completed {}!", this, zvfVarJ);
                        } else {
                            f44434b.debug("Remote {} completed {} -/- {}!", this, zvfVarR, zvfVarJ);
                        }
                    }
                }
            }
            return true;
        }
        throw new zvp(this + " already complete!", this.f);
    }

    public boolean a() {
        if (this.h.get()) {
            return false;
        }
        if (d()) {
            ai();
            return true;
        }
        d(new Runnable() { // from class: org.eclipse.californium.core.network.Exchange.1
            @Override // java.lang.Runnable
            public void run() {
                if (Exchange.this.h.get()) {
                    return;
                }
                Exchange.this.ai();
            }
        });
        return true;
    }

    public long u() {
        return this.ai;
    }

    public void e(long j) {
        this.ai = j;
    }

    public void ah() {
        this.am = true;
        this.aj = false;
        this.an = ClockUtil.c();
    }

    public long e() {
        boolean z = this.aj;
        if (!z && !this.am) {
            throw new IllegalStateException("startTransmissionRtt must be called before!");
        }
        if (!z) {
            this.aj = true;
            this.am = false;
            long jC = ClockUtil.c() - this.an;
            this.an = jC;
            if (jC == 0) {
                this.an = 1L;
            }
        }
        return this.an;
    }

    public long c() {
        return ClockUtil.c() - this.p;
    }

    public ObserveRelation s() {
        return this.ab;
    }

    public void z() {
        ag();
        if (this.v == null || this.v.isEmpty()) {
            return;
        }
        RemoveHandler removeHandler = this.ad;
        if (removeHandler != null) {
            Iterator<d> it = this.v.iterator();
            while (it.hasNext()) {
                zvv zvvVarB = it.next().b();
                f44434b.info("{} removing NON notification: {}", this, zvvVarB);
                removeHandler.remove(this, null, zvvVarB);
            }
        }
        this.v.clear();
        f44434b.debug("{} removed all remaining NON-notifications of observe relation with {}", this, this.ab.h());
    }

    public void a(EndpointContext endpointContext) {
        EndpointContextOperator endpointContextOperator = this.l;
        if (endpointContextOperator != null) {
            endpointContext = endpointContextOperator.apply(endpointContext);
        }
        if (LifecycleKt$$ExternalSyntheticBackportWithForwarding0.m(this.o, null, endpointContext)) {
            f().onContextEstablished(endpointContext);
        } else {
            this.o.set(endpointContext);
        }
    }

    public void ab() {
        this.o.set(null);
    }

    public EndpointContext h() {
        return this.o.get();
    }

    public void d(Runnable runnable) {
        try {
            if (d()) {
                runnable.run();
            } else {
                this.t.execute(runnable);
            }
        } catch (RejectedExecutionException e2) {
            f44434b.debug("{} execute:", this, e2);
        } catch (Throwable th) {
            f44434b.error("{} execute:", this, th);
        }
    }

    public void c(Object obj) {
        ag();
        if (this.h.get()) {
            throw new zvp(this + " is already complete! " + obj, this.f);
        }
    }

    private void ag() {
        this.t.assertOwner();
    }

    public boolean d() {
        return this.t.checkOwner();
    }

    static class d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private zvv f44436b;
        private long e;

        private d(zvv zvvVar, long j) {
            this.f44436b = zvvVar;
            this.e = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean b(long j) {
            return j - this.e > 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public zvv b() {
            return this.f44436b;
        }
    }
}
