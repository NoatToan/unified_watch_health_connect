package o53;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b \u0018\u00002\u00020\u00012\u00020\u0002:\u0004\f\r\u000e\u000fB\u0007¢\u0006\u0004\b\u0003\u0010\u0004R\u0013\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00058\u0002X\u0082\u0004R\u0013\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00058\u0002X\u0082\u0004R\u000b\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¨\u0006\u0010"}, d2 = {"Lo53/z0;", "Lo53/a1;", "Lo53/k0;", "<init>", "()V", "Lh53/b;", "", "_queue", "Lo53/z0$d;", "_delayed", "Lh53/a;", "_isCompleted", "c", "a", "b", "d", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class z0 extends a1 implements k0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f129426e = AtomicReferenceFieldUpdater.newUpdater(z0.class, Object.class, "_queue$volatile");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f129427f = AtomicReferenceFieldUpdater.newUpdater(z0.class, Object.class, "_delayed$volatile");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f129428g = AtomicIntegerFieldUpdater.newUpdater(z0.class, "_isCompleted$volatile");
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile;
    private volatile /* synthetic */ Object _queue$volatile;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lo53/z0$a;", "Lo53/z0$c;", "", "nanoTime", "Lo53/j;", "", "cont", "<init>", "(Lo53/z0;JLo53/j;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class a extends c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final j<Unit> f129429c;

        /* JADX WARN: Multi-variable type inference failed */
        public a(long j8, j<? super Unit> jVar) {
            super(j8);
            this.f129429c = jVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f129429c.F(z0.this, Unit.INSTANCE);
        }

        @Override // o53.z0.c
        public final String toString() {
            return super.toString() + this.f129429c;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lo53/z0$b;", "Lo53/z0$c;", "", "nanoTime", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "<init>", "(JLjava/lang/Runnable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Runnable f129431c;

        public b(long j8, Runnable runnable) {
            super(j8);
            this.f129431c = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f129431c.run();
        }

        @Override // o53.z0.c
        public final String toString() {
            return super.toString() + this.f129431c;
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0006\b \u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00000\u00032\u00020\u00042\u00020\u00052\u00060\u0006j\u0002`\u0007B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0018\u0010\f\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lo53/z0$c;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "", "Lo53/u0;", "Lu53/d0;", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "", "nanoTime", "<init>", "(J)V", "_heap", "Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class c implements Runnable, Comparable<c>, u0, u53.d0 {
        private volatile Object _heap;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f129432a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f129433b = -1;

        public c(long j8) {
            this.f129432a = j8;
        }

        @Override // u53.d0
        public final void a(d dVar) {
            if (this._heap != b1.f129307a) {
                this._heap = dVar;
            } else {
                vb.h.s("Failed requirement.");
            }
        }

        public final int c(long j8, d dVar, z0 z0Var) {
            synchronized (this) {
                if (this._heap == b1.f129307a) {
                    return 2;
                }
                synchronized (dVar) {
                    try {
                        Object[] objArr = dVar.f168724a;
                        c cVar = (c) (objArr != null ? objArr[0] : null);
                        if (z0.f129428g.get(z0Var) == 1) {
                            return 1;
                        }
                        if (cVar == null) {
                            dVar.f129434c = j8;
                        } else {
                            long j14 = cVar.f129432a;
                            if (j14 - j8 < 0) {
                                j8 = j14;
                            }
                            if (j8 - dVar.f129434c > 0) {
                                dVar.f129434c = j8;
                            }
                        }
                        long j15 = this.f129432a;
                        long j16 = dVar.f129434c;
                        if (j15 - j16 < 0) {
                            this.f129432a = j16;
                        }
                        dVar.a(this);
                        return 0;
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            }
        }

        @Override // java.lang.Comparable
        public final int compareTo(c cVar) {
            long j8 = this.f129432a - cVar.f129432a;
            if (j8 > 0) {
                return 1;
            }
            return j8 < 0 ? -1 : 0;
        }

        @Override // o53.u0
        public final void dispose() {
            synchronized (this) {
                try {
                    Object obj = this._heap;
                    u53.x xVar = b1.f129307a;
                    if (obj == xVar) {
                        return;
                    }
                    d dVar = obj instanceof d ? (d) obj : null;
                    if (dVar != null) {
                        synchronized (dVar) {
                            Object obj2 = this._heap;
                            if ((obj2 instanceof u53.c0 ? (u53.c0) obj2 : null) != null) {
                                dVar.b(this.f129433b);
                            }
                        }
                    }
                    this._heap = xVar;
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }

        @Override // u53.d0
        public final void setIndex(int i14) {
            this.f129433b = i14;
        }

        public String toString() {
            return androidx.room.a0.l(new StringBuilder("Delayed[nanos="), this.f129432a, ']');
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lo53/z0$d;", "Lu53/c0;", "Lo53/z0$c;", "", "timeNow", "<init>", "(J)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class d extends u53.c0<c> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f129434c;

        public d(long j8) {
            this.f129434c = j8;
        }
    }

    @Override // o53.k0
    public final void C(long j8, k kVar) {
        u53.x xVar = b1.f129307a;
        long j14 = 0;
        if (j8 > 0) {
            j14 = j8 >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j8;
        }
        if (j14 < 4611686018427387903L) {
            long jNanoTime = System.nanoTime();
            a aVar = new a(j14 + jNanoTime, kVar);
            f0(jNanoTime, aVar);
            kVar.t(new v0(aVar));
        }
    }

    @Override // o53.y0
    public final long V() {
        Runnable runnable;
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f129426e;
        if (!W()) {
            b0();
            loop0: while (true) {
                Object obj2 = atomicReferenceFieldUpdater.get(this);
                if (obj2 != null) {
                    if (obj2 instanceof u53.n) {
                        u53.n nVar = (u53.n) obj2;
                        Object objD = nVar.d();
                        if (objD != u53.n.f168756h) {
                            runnable = (Runnable) objD;
                            break;
                        }
                        u53.n nVarC = nVar.c();
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, nVarC) && atomicReferenceFieldUpdater.get(this) == obj2) {
                        }
                    } else if (obj2 != b1.f129308b) {
                        do {
                            if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, null)) {
                                runnable = (Runnable) obj2;
                                break loop0;
                            }
                        } while (atomicReferenceFieldUpdater.get(this) == obj2);
                    }
                }
                runnable = null;
                break;
            }
            if (runnable != null) {
                runnable.run();
                return 0L;
            }
            p13.k<p0<?>> kVar = this.f129425c;
            if (((kVar == null || kVar.isEmpty()) ? Long.MAX_VALUE : 0L) != 0) {
                Object obj3 = atomicReferenceFieldUpdater.get(this);
                if (obj3 != null) {
                    if (obj3 instanceof u53.n) {
                        long j8 = u53.n.f168755g.get((u53.n) obj3);
                        if (((int) (1073741823 & j8)) != ((int) ((j8 & 1152921503533105152L) >> 30))) {
                            return 0L;
                        }
                    } else if (obj3 == b1.f129308b) {
                        return Long.MAX_VALUE;
                    }
                }
                d dVar = (d) f129427f.get(this);
                if (dVar != null) {
                    synchronized (dVar) {
                        Object[] objArr = dVar.f168724a;
                        obj = objArr != null ? objArr[0] : null;
                    }
                    c cVar = (c) obj;
                    if (cVar != null) {
                        long jNanoTime = cVar.f129432a - System.nanoTime();
                        if (jNanoTime >= 0) {
                            return jNanoTime;
                        }
                    }
                }
                return Long.MAX_VALUE;
            }
        }
        return 0L;
    }

    public void Z(Runnable runnable) {
        b0();
        if (!c0(runnable)) {
            g0.f129339h.Z(runnable);
            return;
        }
        Thread threadX = getF129338h();
        if (Thread.currentThread() != threadX) {
            LockSupport.unpark(threadX);
        }
    }

    public final void b0() {
        c cVarB;
        d dVar = (d) f129427f.get(this);
        if (dVar == null || u53.c0.f168723b.get(dVar) == 0) {
            return;
        }
        long jNanoTime = System.nanoTime();
        do {
            synchronized (dVar) {
                try {
                    Object[] objArr = dVar.f168724a;
                    cVarB = null;
                    Object obj = objArr != null ? objArr[0] : null;
                    if (obj != null) {
                        c cVar = (c) obj;
                        cVarB = ((jNanoTime - cVar.f129432a) > 0L ? 1 : ((jNanoTime - cVar.f129432a) == 0L ? 0 : -1)) >= 0 ? c0(cVar) : false ? dVar.b(0) : null;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        } while (cVarB != null);
    }

    public final boolean c0(Runnable runnable) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f129426e;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (f129428g.get(this) == 1) {
                return false;
            }
            if (obj == null) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, runnable)) {
                    if (atomicReferenceFieldUpdater.get(this) != null) {
                    }
                }
                return true;
            }
            if (!(obj instanceof u53.n)) {
                if (obj == b1.f129308b) {
                    return false;
                }
                u53.n nVar = new u53.n(8, true);
                nVar.a((Runnable) obj);
                nVar.a(runnable);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, nVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                    }
                }
                return true;
            }
            u53.n nVar2 = (u53.n) obj;
            int iA = nVar2.a(runnable);
            if (iA == 0) {
                return true;
            }
            if (iA == 1) {
                u53.n nVarC = nVar2.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, nVarC) && atomicReferenceFieldUpdater.get(this) == obj) {
                }
            } else if (iA == 2) {
                return false;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0027  */
    /* JADX WARN: Code duplicated, block: B:20:0x0030  */
    /* JADX WARN: Code duplicated, block: B:22:0x0034  */
    /* JADX WARN: Code duplicated, block: B:24:0x004d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:0x004e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:26:0x004f  */
    public final boolean d0() {
        Object obj;
        long j8;
        p13.k<p0<?>> kVar = this.f129425c;
        if (kVar != null ? kVar.isEmpty() : true) {
            d dVar = (d) f129427f.get(this);
            if (dVar == null) {
                obj = f129426e.get(this);
                if (obj != null) {
                    if (obj instanceof u53.n) {
                        j8 = u53.n.f168755g.get((u53.n) obj);
                        if (((int) (1073741823 & j8)) == ((int) ((j8 & 1152921503533105152L) >> 30))) {
                            return true;
                        }
                        return false;
                    }
                    if (obj == b1.f129308b) {
                    }
                }
                return true;
            }
            if (u53.c0.f168723b.get(dVar) == 0) {
                obj = f129426e.get(this);
                if (obj != null) {
                    if (obj instanceof u53.n) {
                        j8 = u53.n.f168755g.get((u53.n) obj);
                        if (((int) (1073741823 & j8)) == ((int) ((j8 & 1152921503533105152L) >> 30))) {
                            return true;
                        }
                        return false;
                    }
                    if (obj == b1.f129308b) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // o53.z
    public final void dispatch(t13.g gVar, Runnable runnable) {
        Z(runnable);
    }

    public final void f0(long j8, c cVar) {
        int iC;
        Thread threadX;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f129427f;
        Object obj = null;
        if (f129428g.get(this) == 1) {
            iC = 1;
        } else {
            d dVar = (d) atomicReferenceFieldUpdater.get(this);
            if (dVar == null) {
                d dVar2 = new d(j8);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, dVar2) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                Object obj2 = atomicReferenceFieldUpdater.get(this);
                obj2.getClass();
                dVar = (d) obj2;
            }
            iC = cVar.c(j8, dVar, this);
        }
        if (iC != 0) {
            if (iC == 1) {
                Y(j8, cVar);
                return;
            } else {
                if (iC == 2) {
                    return;
                }
                vb.h.z("unexpected result");
                return;
            }
        }
        d dVar3 = (d) atomicReferenceFieldUpdater.get(this);
        if (dVar3 != null) {
            synchronized (dVar3) {
                Object[] objArr = dVar3.f168724a;
                obj = objArr != null ? objArr[0] : null;
            }
            obj = (c) obj;
        }
        if (obj != cVar || Thread.currentThread() == (threadX = getF129338h())) {
            return;
        }
        LockSupport.unpark(threadX);
    }

    public u0 j(long j8, Runnable runnable, t13.g gVar) {
        return h0.f129344a.j(j8, runnable, gVar);
    }

    @Override // o53.y0
    public void shutdown() {
        c cVarB;
        g2.f129341a.getClass();
        g2.f129342b.set(null);
        f129428g.set(this, 1);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f129426e;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                u53.x xVar = b1.f129308b;
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, null, xVar)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == null);
            } else if (obj instanceof u53.n) {
                ((u53.n) obj).b();
                break;
            } else {
                if (obj == b1.f129308b) {
                    break;
                }
                u53.n nVar = new u53.n(8, true);
                nVar.a((Runnable) obj);
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj, nVar)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == obj);
            }
        }
        while (V() <= 0) {
        }
        long jNanoTime = System.nanoTime();
        while (true) {
            d dVar = (d) f129427f.get(this);
            if (dVar == null) {
                return;
            }
            synchronized (dVar) {
                cVarB = u53.c0.f168723b.get(dVar) > 0 ? dVar.b(0) : null;
            }
            c cVar = cVarB;
            if (cVar == null) {
                return;
            } else {
                Y(jNanoTime, cVar);
            }
        }
    }
}
