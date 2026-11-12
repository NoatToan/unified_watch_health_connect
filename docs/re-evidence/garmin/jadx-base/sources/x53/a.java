package x53;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.room.a0;
import ch.qos.logback.core.spi.AbstractComponentTracker;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import lc.u0;
import o53.f0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.r0;
import u53.s;
import u53.x;
import v.e0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u0011\u0012\u0013B+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u000b\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004R\u000b\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004R\u000b\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¨\u0006\u0014"}, d2 = {"Lx53/a;", "Ljava/util/concurrent/Executor;", "Ljava/io/Closeable;", "", "corePoolSize", "maxPoolSize", "", "idleWorkerKeepAliveNs", "", "schedulerName", "<init>", "(IIJLjava/lang/String;)V", "", "parkedWorkersStack", "controlState", "Lh53/a;", "_isTerminated", "a", "c", "d", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a implements Executor, Closeable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f189125h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f189126i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f189127j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final x f189128k;
    private volatile /* synthetic */ int _isTerminated$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f189129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f189130b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f189131c;
    private volatile /* synthetic */ long controlState$volatile;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f189132d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final x53.d f189133e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final x53.d f189134f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final s<c> f189135g;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f189136a;

        static {
            int[] iArr = new int[d.values().length];
            try {
                iArr[d.PARKING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d.BLOCKING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[d.CPU_ACQUIRED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[d.DORMANT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[d.TERMINATED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f189136a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lx53/a$d;", "", "<init>", "(Ljava/lang/String;I)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum d {
        CPU_ACQUIRED,
        BLOCKING,
        PARKING,
        DORMANT,
        TERMINATED
    }

    static {
        new C3517a(null);
        f189125h = AtomicLongFieldUpdater.newUpdater(a.class, "parkedWorkersStack$volatile");
        f189126i = AtomicLongFieldUpdater.newUpdater(a.class, "controlState$volatile");
        f189127j = AtomicIntegerFieldUpdater.newUpdater(a.class, "_isTerminated$volatile");
        f189128k = new x("NOT_IN_STACK");
    }

    public a(int i14, int i15, long j8, String str) {
        this.f189129a = i14;
        this.f189130b = i15;
        this.f189131c = j8;
        this.f189132d = str;
        if (i14 < 1) {
            vb.h.x(e0.f(i14, "Core pool size ", " should be at least 1"));
            throw null;
        }
        if (i15 < i14) {
            vb.h.x(tn.k.e(i15, i14, "Max pool size ", " should be greater than or equals to core pool size "));
            throw null;
        }
        if (i15 > 2097150) {
            vb.h.x(e0.f(i15, "Max pool size ", " should not exceed maximal supported number of threads 2097150"));
            throw null;
        }
        if (j8 <= 0) {
            vb.h.x(a0.f(j8, "Idle worker keep alive time ", " must be positive"));
            throw null;
        }
        this.f189133e = new x53.d();
        this.f189134f = new x53.d();
        this.f189135g = new s<>((i14 + 1) * 2);
        this.controlState$volatile = ((long) i14) << 42;
    }

    public static /* synthetic */ void e(a aVar, Runnable runnable, int i14) {
        aVar.c(runnable, false, (i14 & 4) == 0);
    }

    public final int a() {
        synchronized (this.f189135g) {
            try {
                if (f189127j.get(this) == 1) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = f189126i;
                long j8 = atomicLongFieldUpdater.get(this);
                int i14 = (int) (j8 & 2097151);
                int i15 = i14 - ((int) ((j8 & 4398044413952L) >> 21));
                if (i15 < 0) {
                    i15 = 0;
                }
                if (i15 >= this.f189129a) {
                    return 0;
                }
                if (i14 >= this.f189130b) {
                    return 0;
                }
                int i16 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i16 <= 0 || this.f189135g.b(i16) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                c cVar = new c(this, i16);
                this.f189135g.c(i16, cVar);
                if (i16 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i17 = i15 + 1;
                cVar.start();
                return i17;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void c(Runnable runnable, boolean z14, boolean z15) {
        h iVar;
        d dVar;
        j.f189165f.getClass();
        long jNanoTime = System.nanoTime();
        if (runnable instanceof h) {
            iVar = (h) runnable;
            iVar.f189157a = jNanoTime;
            iVar.f189158b = z14;
        } else {
            iVar = new i(runnable, jNanoTime, z14);
        }
        boolean z16 = iVar.f189158b;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f189126i;
        long jAddAndGet = z16 ? atomicLongFieldUpdater.addAndGet(this, PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE) : 0L;
        Thread threadCurrentThread = Thread.currentThread();
        c cVar = threadCurrentThread instanceof c ? (c) threadCurrentThread : null;
        if (cVar == null || !p005kotlin.jvm.internal.s.g(a.this, this)) {
            cVar = null;
        }
        if (cVar != null && (dVar = cVar.f189140c) != d.TERMINATED && (iVar.f189158b || dVar != d.BLOCKING)) {
            cVar.f189144g = true;
            l lVar = cVar.f189138a;
            if (z15) {
                iVar = lVar.a(iVar);
            } else {
                lVar.getClass();
                h hVar = (h) l.f189167b.getAndSet(lVar, iVar);
                iVar = hVar == null ? null : lVar.a(hVar);
            }
        }
        if (iVar != null) {
            if (!(iVar.f189158b ? this.f189134f.a(iVar) : this.f189133e.a(iVar))) {
                throw new RejectedExecutionException(am.j.o(this.f189132d, " was terminated", new StringBuilder()));
            }
        }
        if (z16) {
            if (k() || j(jAddAndGet)) {
                return;
            }
            k();
            return;
        }
        if (k() || j(atomicLongFieldUpdater.get(this))) {
            return;
        }
        k();
    }

    /* JADX WARN: Code duplicated, block: B:39:0x008a  */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws InterruptedException {
        int i14;
        h hVarD;
        if (f189127j.compareAndSet(this, 0, 1)) {
            Thread threadCurrentThread = Thread.currentThread();
            c cVar = threadCurrentThread instanceof c ? (c) threadCurrentThread : null;
            if (cVar == null || !p005kotlin.jvm.internal.s.g(a.this, this)) {
                cVar = null;
            }
            synchronized (this.f189135g) {
                i14 = (int) (f189126i.get(this) & 2097151);
            }
            if (1 <= i14) {
                int i15 = 1;
                while (true) {
                    c cVarB = this.f189135g.b(i15);
                    cVarB.getClass();
                    c cVar2 = cVarB;
                    if (cVar2 != cVar) {
                        while (cVar2.getState() != Thread.State.TERMINATED) {
                            LockSupport.unpark(cVar2);
                            cVar2.join(AbstractComponentTracker.LINGERING_TIMEOUT);
                        }
                        l lVar = cVar2.f189138a;
                        x53.d dVar = this.f189134f;
                        lVar.getClass();
                        h hVar = (h) l.f189167b.getAndSet(lVar, null);
                        if (hVar != null) {
                            dVar.a(hVar);
                        }
                        while (true) {
                            h hVarB = lVar.b();
                            if (hVarB == null) {
                                break;
                            } else {
                                dVar.a(hVarB);
                            }
                        }
                    }
                    if (i15 == i14) {
                        break;
                    } else {
                        i15++;
                    }
                }
            }
            this.f189134f.b();
            this.f189133e.b();
            while (true) {
                if (cVar != null) {
                    hVarD = cVar.a(true);
                    if (hVarD == null) {
                        hVarD = this.f189133e.d();
                        if (hVarD == null) {
                            break;
                            break;
                        }
                    }
                } else {
                    hVarD = this.f189133e.d();
                    if (hVarD == null && (hVarD = this.f189134f.d()) == null) {
                        break;
                    }
                }
                try {
                    hVarD.run();
                } catch (Throwable th3) {
                    Thread threadCurrentThread2 = Thread.currentThread();
                    threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th3);
                }
            }
            if (cVar != null) {
                cVar.h(d.TERMINATED);
            }
            f189125h.set(this, 0L);
            f189126i.set(this, 0L);
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        e(this, runnable, 6);
    }

    public final void f(c cVar, int i14, int i15) {
        while (true) {
            long j8 = f189125h.get(this);
            int i16 = (int) (2097151 & j8);
            long j14 = (PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE + j8) & (-2097152);
            if (i16 == i14) {
                if (i15 == 0) {
                    Object nextParkedWorker = cVar.getNextParkedWorker();
                    while (true) {
                        if (nextParkedWorker == f189128k) {
                            i16 = -1;
                            break;
                        }
                        if (nextParkedWorker == null) {
                            i16 = 0;
                            break;
                        }
                        c cVar2 = (c) nextParkedWorker;
                        int indexInArray = cVar2.getIndexInArray();
                        if (indexInArray != 0) {
                            i16 = indexInArray;
                            break;
                        }
                        nextParkedWorker = cVar2.getNextParkedWorker();
                    }
                } else {
                    i16 = i15;
                }
            }
            if (i16 >= 0) {
                if (f189125h.compareAndSet(this, j8, ((long) i16) | j14)) {
                    return;
                }
            }
        }
    }

    public final boolean j(long j8) {
        int i14 = ((int) (2097151 & j8)) - ((int) ((j8 & 4398044413952L) >> 21));
        if (i14 < 0) {
            i14 = 0;
        }
        int i15 = this.f189129a;
        if (i14 < i15) {
            int iA = a();
            if (iA == 1 && i15 > 1) {
                a();
            }
            if (iA > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean k() {
        x xVar;
        int indexInArray;
        while (true) {
            long j8 = f189125h.get(this);
            c cVarB = this.f189135g.b((int) (2097151 & j8));
            if (cVarB == null) {
                cVarB = null;
            } else {
                long j14 = (PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE + j8) & (-2097152);
                Object nextParkedWorker = cVarB.getNextParkedWorker();
                while (true) {
                    xVar = f189128k;
                    if (nextParkedWorker == xVar) {
                        indexInArray = -1;
                        break;
                    }
                    if (nextParkedWorker == null) {
                        indexInArray = 0;
                        break;
                    }
                    c cVar = (c) nextParkedWorker;
                    indexInArray = cVar.getIndexInArray();
                    if (indexInArray != 0) {
                        break;
                    }
                    nextParkedWorker = cVar.getNextParkedWorker();
                }
                if (indexInArray >= 0) {
                    if (f189125h.compareAndSet(this, j8, ((long) indexInArray) | j14)) {
                        cVarB.g(xVar);
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
            if (cVarB == null) {
                return false;
            }
            if (c.f189137i.compareAndSet(cVarB, -1, 0)) {
                LockSupport.unpark(cVarB);
                return true;
            }
        }
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        s<c> sVar = this.f189135g;
        int iA = sVar.a();
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        for (int i19 = 1; i19 < iA; i19++) {
            c cVarB = sVar.b(i19);
            if (cVarB != null) {
                l lVar = cVarB.f189138a;
                lVar.getClass();
                int i24 = l.f189167b.get(lVar) != null ? (l.f189168c.get(lVar) - l.f189169d.get(lVar)) + 1 : l.f189168c.get(lVar) - l.f189169d.get(lVar);
                int i25 = b.f189136a[cVarB.f189140c.ordinal()];
                if (i25 == 1) {
                    i16++;
                } else if (i25 == 2) {
                    i15++;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(i24);
                    sb3.append('b');
                    arrayList.add(sb3.toString());
                } else if (i25 == 3) {
                    i14++;
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(i24);
                    sb4.append('c');
                    arrayList.add(sb4.toString());
                } else if (i25 == 4) {
                    i17++;
                    if (i24 > 0) {
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append(i24);
                        sb5.append('d');
                        arrayList.add(sb5.toString());
                    }
                } else {
                    if (i25 != 5) {
                        u0.r();
                        return null;
                    }
                    i18++;
                }
            }
        }
        long j8 = f189126i.get(this);
        StringBuilder sb6 = new StringBuilder();
        sb6.append(this.f189132d);
        sb6.append('@');
        sb6.append(f0.u(this));
        sb6.append("[Pool Size {core = ");
        int i26 = this.f189129a;
        sb6.append(i26);
        sb6.append(", max = ");
        ds.e0.m(this.f189130b, i14, "}, Worker States {CPU = ", ", blocking = ", sb6);
        ds.e0.m(i15, i16, ", parked = ", ", dormant = ", sb6);
        ds.e0.m(i17, i18, ", terminated = ", "}, running workers queues = ", sb6);
        sb6.append(arrayList);
        sb6.append(", global CPU queue size = ");
        sb6.append(this.f189133e.c());
        sb6.append(", global blocking queue size = ");
        sb6.append(this.f189134f.c());
        sb6.append(", Control State {created workers= ");
        sb6.append((int) (2097151 & j8));
        sb6.append(", blocking tasks = ");
        sb6.append((int) ((4398044413952L & j8) >> 21));
        sb6.append(", CPUs acquired = ");
        sb6.append(i26 - ((int) ((j8 & 9223367638808264704L) >> 42)));
        sb6.append("}]");
        return sb6.toString();
    }

    /* JADX INFO: renamed from: x53.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\tR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\tR\u0014\u0010\u0012\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00078\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0013\u0010\tR\u0014\u0010\u0014\u001a\u00020\u00078\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0014\u0010\tR\u0014\u0010\u0015\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u000fR\u0014\u0010\u0016\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u000fR\u0014\u0010\u0017\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u000f¨\u0006\u0018"}, d2 = {"Lx53/a$a;", "", "<init>", "()V", "Lu53/x;", "NOT_IN_STACK", "Lu53/x;", "", "PARKED", "I", "CLAIMED", "TERMINATED", "BLOCKING_SHIFT", "", "CREATED_MASK", "J", "BLOCKING_MASK", "CPU_PERMITS_SHIFT", "CPU_PERMITS_MASK", "MIN_SUPPORTED_POOL_SIZE", "MAX_SUPPORTED_POOL_SIZE", "PARKED_INDEX_MASK", "PARKED_VERSION_MASK", "PARKED_VERSION_INC", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class C3517a {
        public /* synthetic */ C3517a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C3517a() {
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\b\b\u0080\u0004\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006R*\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR$\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\b\u0010\u0014\u001a\u00020\r8\u0006¨\u0006\u0015"}, d2 = {"Lx53/a$c;", "Ljava/lang/Thread;", "<init>", "(Lx53/a;)V", "", FirebaseAnalytics.Param.INDEX, "(Lx53/a;I)V", "indexInArray", "I", "b", "()I", "f", "(I)V", "", "nextParkedWorker", "Ljava/lang/Object;", "c", "()Ljava/lang/Object;", "g", "(Ljava/lang/Object;)V", "workerCtl", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class c extends Thread {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final /* synthetic */ AtomicIntegerFieldUpdater f189137i = AtomicIntegerFieldUpdater.newUpdater(c.class, "workerCtl$volatile");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final l f189138a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final r0<h> f189139b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public d f189140c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f189141d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f189142e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f189143f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f189144g;
        private volatile int indexInArray;
        private volatile Object nextParkedWorker;
        private volatile /* synthetic */ int workerCtl$volatile;

        private c() {
            setDaemon(true);
            setContextClassLoader(a.this.getClass().getClassLoader());
            this.f189138a = new l();
            this.f189139b = new r0<>();
            this.f189140c = d.DORMANT;
            this.nextParkedWorker = a.f189128k;
            int iNanoTime = (int) System.nanoTime();
            this.f189143f = iNanoTime == 0 ? 42 : iNanoTime;
        }

        public final h a(boolean z14) {
            h hVarE;
            h hVarE2;
            long j8;
            d dVar = this.f189140c;
            d dVar2 = d.CPU_ACQUIRED;
            a aVar = a.this;
            h hVar = null;
            l lVar = this.f189138a;
            if (dVar != dVar2) {
                AtomicLongFieldUpdater atomicLongFieldUpdater = a.f189126i;
                do {
                    j8 = atomicLongFieldUpdater.get(aVar);
                    if (((int) ((9223367638808264704L & j8) >> 42)) == 0) {
                        lVar.getClass();
                        loop1: while (true) {
                            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = l.f189167b;
                            h hVar2 = (h) atomicReferenceFieldUpdater.get(lVar);
                            if (hVar2 == null || !hVar2.f189158b) {
                                int i14 = l.f189169d.get(lVar);
                                int i15 = l.f189168c.get(lVar);
                                while (i14 != i15 && l.f189170e.get(lVar) != 0) {
                                    i15--;
                                    h hVarC = lVar.c(i15, true);
                                    if (hVarC != null) {
                                        hVar = hVarC;
                                        break;
                                    }
                                }
                                break;
                            }
                            do {
                                if (atomicReferenceFieldUpdater.compareAndSet(lVar, hVar2, null)) {
                                    hVar = hVar2;
                                    break loop1;
                                }
                            } while (atomicReferenceFieldUpdater.get(lVar) == hVar2);
                        }
                        if (hVar != null) {
                            return hVar;
                        }
                        h hVarD = aVar.f189134f.d();
                        return hVarD == null ? i(1) : hVarD;
                    }
                } while (!a.f189126i.compareAndSet(aVar, j8, j8 - 4398046511104L));
                this.f189140c = d.CPU_ACQUIRED;
            }
            if (z14) {
                boolean z15 = d(aVar.f189129a * 2) == 0;
                if (z15 && (hVarE2 = e()) != null) {
                    return hVarE2;
                }
                lVar.getClass();
                h hVarB = (h) l.f189167b.getAndSet(lVar, null);
                if (hVarB == null) {
                    hVarB = lVar.b();
                }
                if (hVarB != null) {
                    return hVarB;
                }
                if (!z15 && (hVarE = e()) != null) {
                    return hVarE;
                }
            } else {
                h hVarE3 = e();
                if (hVarE3 != null) {
                    return hVarE3;
                }
            }
            return i(3);
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getIndexInArray() {
            return this.indexInArray;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final Object getNextParkedWorker() {
            return this.nextParkedWorker;
        }

        public final int d(int i14) {
            int i15 = this.f189143f;
            int i16 = i15 ^ (i15 << 13);
            int i17 = i16 ^ (i16 >> 17);
            int i18 = i17 ^ (i17 << 5);
            this.f189143f = i18;
            int i19 = i14 - 1;
            return (i19 & i14) == 0 ? i18 & i19 : (i18 & Integer.MAX_VALUE) % i14;
        }

        public final h e() {
            int iD = d(2);
            a aVar = a.this;
            if (iD == 0) {
                h hVarD = aVar.f189133e.d();
                return hVarD != null ? hVarD : aVar.f189134f.d();
            }
            h hVarD2 = aVar.f189134f.d();
            return hVarD2 != null ? hVarD2 : aVar.f189133e.d();
        }

        public final void f(int i14) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(a.this.f189132d);
            sb3.append("-worker-");
            sb3.append(i14 == 0 ? "TERMINATED" : String.valueOf(i14));
            setName(sb3.toString());
            this.indexInArray = i14;
        }

        public final void g(Object obj) {
            this.nextParkedWorker = obj;
        }

        public final boolean h(d dVar) {
            d dVar2 = this.f189140c;
            boolean z14 = dVar2 == d.CPU_ACQUIRED;
            if (z14) {
                a.f189126i.addAndGet(a.this, 4398046511104L);
            }
            if (dVar2 != dVar) {
                this.f189140c = dVar;
            }
            return z14;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r14v1, types: [T, java.lang.Object, x53.h] */
        /* JADX WARN: Type inference failed for: r7v14, types: [x53.h] */
        /* JADX WARN: Type inference failed for: r7v4 */
        /* JADX WARN: Type inference failed for: r7v5, types: [x53.h] */
        public final h i(int i14) {
            long j8;
            T tC;
            long j14;
            long j15;
            T t7;
            AtomicLongFieldUpdater atomicLongFieldUpdater = a.f189126i;
            a aVar = a.this;
            int i15 = (int) (atomicLongFieldUpdater.get(aVar) & 2097151);
            Object obj = null;
            if (i15 < 2) {
                return null;
            }
            int iD = d(i15);
            int i16 = 0;
            long jMin = Long.MAX_VALUE;
            while (i16 < i15) {
                iD++;
                if (iD > i15) {
                    iD = 1;
                }
                c cVarB = aVar.f189135g.b(iD);
                if (cVarB != null && cVarB != this) {
                    l lVar = cVarB.f189138a;
                    if (i14 != 3) {
                        lVar.getClass();
                        int i17 = l.f189169d.get(lVar);
                        int i18 = l.f189168c.get(lVar);
                        boolean z14 = i14 == 1;
                        while (true) {
                            if (i17 != i18) {
                                j8 = 0;
                                if (!z14 || l.f189170e.get(lVar) != 0) {
                                    int i19 = i17 + 1;
                                    tC = lVar.c(i17, z14);
                                    if (tC != 0) {
                                        break;
                                    }
                                    i17 = i19;
                                }
                            } else {
                                j8 = 0;
                            }
                            tC = obj;
                            break;
                        }
                    } else {
                        tC = lVar.b();
                        j8 = 0;
                    }
                    r0<h> r0Var = this.f189139b;
                    if (tC == 0) {
                        while (true) {
                            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = l.f189167b;
                            ?? r14 = (h) atomicReferenceFieldUpdater.get(lVar);
                            if (r14 == 0) {
                                j14 = -1;
                            } else {
                                j14 = -1;
                                if (((r14.f189158b ? 1 : 2) & i14) != 0) {
                                    j.f189165f.getClass();
                                    l lVar2 = lVar;
                                    long jNanoTime = System.nanoTime() - r14.f189157a;
                                    long j16 = j.f189161b;
                                    if (jNanoTime < j16) {
                                        j15 = j16 - jNanoTime;
                                        t7 = 0;
                                        break;
                                    }
                                    do {
                                        t7 = 0;
                                        if (atomicReferenceFieldUpdater.compareAndSet(lVar2, r14, null)) {
                                            r0Var.f105810a = r14;
                                            j15 = -1;
                                            break;
                                        }
                                    } while (atomicReferenceFieldUpdater.get(lVar2) == r14);
                                    lVar = lVar2;
                                    obj = null;
                                }
                            }
                            j15 = -2;
                            t7 = obj;
                            break;
                        }
                    } else {
                        r0Var.f105810a = tC;
                        t7 = obj;
                        j15 = -1;
                        j14 = -1;
                    }
                    if (j15 == j14) {
                        h hVar = r0Var.f105810a;
                        r0Var.f105810a = t7;
                        return hVar;
                    }
                    if (j15 > j8) {
                        jMin = Math.min(jMin, j15);
                    }
                }
                i16++;
                obj = null;
            }
            if (jMin == Long.MAX_VALUE) {
                jMin = 0;
            }
            this.f189142e = jMin;
            return null;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            long j8;
            loop0: while (true) {
                boolean z14 = false;
                while (true) {
                    a aVar = a.this;
                    aVar.getClass();
                    if (a.f189127j.get(aVar) != 1) {
                        d dVar = this.f189140c;
                        d dVar2 = d.TERMINATED;
                        if (dVar == dVar2) {
                            break loop0;
                        }
                        h hVarA = a(this.f189144g);
                        if (hVarA != null) {
                            this.f189142e = 0L;
                            a aVar2 = a.this;
                            this.f189141d = 0L;
                            if (this.f189140c == d.PARKING) {
                                this.f189140c = d.BLOCKING;
                            }
                            if (!hVarA.f189158b) {
                                aVar2.getClass();
                                try {
                                    hVarA.run();
                                    break;
                                } catch (Throwable th3) {
                                    Thread threadCurrentThread = Thread.currentThread();
                                    threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th3);
                                    break;
                                }
                            }
                            if (h(d.BLOCKING) && !aVar2.k() && !aVar2.j(a.f189126i.get(aVar2))) {
                                aVar2.k();
                            }
                            aVar2.getClass();
                            try {
                                hVarA.run();
                            } catch (Throwable th4) {
                                Thread threadCurrentThread2 = Thread.currentThread();
                                threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th4);
                            }
                            a.f189126i.addAndGet(aVar2, -2097152L);
                            if (this.f189140c == dVar2) {
                                break;
                            }
                            this.f189140c = d.DORMANT;
                            break;
                        }
                        this.f189144g = false;
                        if (this.f189142e == 0) {
                            Object obj = this.nextParkedWorker;
                            x xVar = a.f189128k;
                            if (obj != xVar) {
                                f189137i.set(this, -1);
                                while (this.nextParkedWorker != a.f189128k) {
                                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f189137i;
                                    if (atomicIntegerFieldUpdater.get(this) != -1) {
                                        break;
                                    }
                                    a aVar3 = a.this;
                                    aVar3.getClass();
                                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = a.f189127j;
                                    if (atomicIntegerFieldUpdater2.get(aVar3) == 1) {
                                        break;
                                    }
                                    d dVar3 = this.f189140c;
                                    d dVar4 = d.TERMINATED;
                                    if (dVar3 == dVar4) {
                                        break;
                                    }
                                    h(d.PARKING);
                                    Thread.interrupted();
                                    if (this.f189141d == 0) {
                                        j8 = 2097151;
                                        this.f189141d = System.nanoTime() + a.this.f189131c;
                                    } else {
                                        j8 = 2097151;
                                    }
                                    LockSupport.parkNanos(a.this.f189131c);
                                    if (System.nanoTime() - this.f189141d >= 0) {
                                        this.f189141d = 0L;
                                        a aVar4 = a.this;
                                        synchronized (aVar4.f189135g) {
                                            try {
                                                if (!(atomicIntegerFieldUpdater2.get(aVar4) == 1)) {
                                                    AtomicLongFieldUpdater atomicLongFieldUpdater = a.f189126i;
                                                    if (((int) (atomicLongFieldUpdater.get(aVar4) & j8)) > aVar4.f189129a) {
                                                        if (atomicIntegerFieldUpdater.compareAndSet(this, -1, 1)) {
                                                            int i14 = this.indexInArray;
                                                            f(0);
                                                            aVar4.f(this, i14, 0);
                                                            int andDecrement = (int) (atomicLongFieldUpdater.getAndDecrement(aVar4) & j8);
                                                            if (andDecrement != i14) {
                                                                c cVarB = aVar4.f189135g.b(andDecrement);
                                                                cVarB.getClass();
                                                                c cVar = cVarB;
                                                                aVar4.f189135g.c(i14, cVar);
                                                                cVar.f(i14);
                                                                aVar4.f(cVar, andDecrement, i14);
                                                            }
                                                            aVar4.f189135g.c(andDecrement, null);
                                                            Unit unit = Unit.INSTANCE;
                                                            this.f189140c = dVar4;
                                                        }
                                                    }
                                                }
                                            } catch (Throwable th5) {
                                                throw th5;
                                            }
                                        }
                                    }
                                }
                            } else {
                                a aVar5 = a.this;
                                aVar5.getClass();
                                if (this.nextParkedWorker == xVar) {
                                    AtomicLongFieldUpdater atomicLongFieldUpdater2 = a.f189125h;
                                    while (true) {
                                        long j14 = atomicLongFieldUpdater2.get(aVar5);
                                        long j15 = (j14 + PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE) & (-2097152);
                                        int i15 = this.indexInArray;
                                        this.nextParkedWorker = aVar5.f189135g.b((int) (j14 & 2097151));
                                        a aVar6 = aVar5;
                                        if (a.f189125h.compareAndSet(aVar6, j14, j15 | ((long) i15))) {
                                            break;
                                        } else {
                                            aVar5 = aVar6;
                                        }
                                    }
                                }
                            }
                        } else {
                            if (z14) {
                                h(d.PARKING);
                                Thread.interrupted();
                                LockSupport.parkNanos(this.f189142e);
                                this.f189142e = 0L;
                                break;
                            }
                            z14 = true;
                        }
                    } else {
                        break loop0;
                    }
                }
            }
            h(d.TERMINATED);
        }

        public c(a aVar, int i14) {
            this();
            f(i14);
        }
    }

    public /* synthetic */ a(int i14, int i15, long j8, String str, int i16, p005kotlin.jvm.internal.j jVar) {
        this(i14, i15, (i16 & 4) != 0 ? j.f189164e : j8, (i16 & 8) != 0 ? j.f189160a : str);
    }
}
