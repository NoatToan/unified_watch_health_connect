package u53;

import ch.qos.logback.core.CoreConstants;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import o53.h0;
import o53.k0;
import o53.u0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\fB!\u0012\u0006\u0010\u0003\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u000b\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¨\u0006\r"}, d2 = {"Lu53/i;", "Lo53/z;", "Lo53/k0;", "dispatcher", "", "parallelism", "", "name", "<init>", "(Lo53/z;ILjava/lang/String;)V", "", "runningWorkers", "a", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class i extends o53.z implements k0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f168739g = AtomicIntegerFieldUpdater.newUpdater(i.class, "runningWorkers$volatile");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k0 f168740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o53.z f168741b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f168742c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f168743d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m<Runnable> f168744e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f168745f;
    private volatile /* synthetic */ int runningWorkers$volatile;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0013\u0012\n\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lu53/i$a;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "currentTask", "<init>", "(Lu53/i;Ljava/lang/Runnable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Runnable f168746a;

        public a(Runnable runnable) {
            this.f168746a = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i14 = 0;
            while (true) {
                try {
                    this.f168746a.run();
                } catch (Throwable th3) {
                    kotlinx.coroutines.a.a(th3, t13.h.f161748a);
                }
                try {
                    i iVar = i.this;
                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = i.f168739g;
                    Runnable runnableH = iVar.H();
                    if (runnableH == null) {
                        return;
                    }
                    this.f168746a = runnableH;
                    i14++;
                    if (i14 >= 16) {
                        i iVar2 = i.this;
                        if (g.c(iVar2.f168741b, iVar2)) {
                            i iVar3 = i.this;
                            g.b(iVar3.f168741b, iVar3, this);
                            return;
                        }
                    }
                } catch (Throwable th4) {
                    i iVar4 = i.this;
                    synchronized (iVar4.f168745f) {
                        i.f168739g.decrementAndGet(iVar4);
                        throw th4;
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i(o53.z zVar, int i14, String str) {
        k0 k0Var = zVar instanceof k0 ? (k0) zVar : null;
        this.f168740a = k0Var == null ? h0.f129344a : k0Var;
        this.f168741b = zVar;
        this.f168742c = i14;
        this.f168743d = str;
        this.f168744e = new m<>(false);
        this.f168745f = new Object();
    }

    @Override // o53.k0
    public final void C(long j8, o53.k kVar) {
        this.f168740a.C(j8, kVar);
    }

    public final Runnable H() {
        while (true) {
            Runnable runnableD = this.f168744e.d();
            if (runnableD != null) {
                return runnableD;
            }
            synchronized (this.f168745f) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f168739g;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.f168744e.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    public final boolean T() {
        synchronized (this.f168745f) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f168739g;
            if (atomicIntegerFieldUpdater.get(this) >= this.f168742c) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }

    @Override // o53.z
    public final void dispatch(t13.g gVar, Runnable runnable) {
        Runnable runnableH;
        this.f168744e.a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f168739g;
        if (atomicIntegerFieldUpdater.get(this) >= this.f168742c || !T() || (runnableH = H()) == null) {
            return;
        }
        try {
            g.b(this.f168741b, this, new a(runnableH));
        } catch (Throwable th3) {
            atomicIntegerFieldUpdater.decrementAndGet(this);
            throw th3;
        }
    }

    @Override // o53.z
    public final void dispatchYield(t13.g gVar, Runnable runnable) {
        Runnable runnableH;
        this.f168744e.a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f168739g;
        if (atomicIntegerFieldUpdater.get(this) >= this.f168742c || !T() || (runnableH = H()) == null) {
            return;
        }
        try {
            this.f168741b.dispatchYield(this, new a(runnableH));
        } catch (Throwable th3) {
            atomicIntegerFieldUpdater.decrementAndGet(this);
            throw th3;
        }
    }

    @Override // o53.k0
    public final u0 j(long j8, Runnable runnable, t13.g gVar) {
        return this.f168740a.j(j8, runnable, gVar);
    }

    @Override // o53.z
    public final o53.z limitedParallelism(int i14, String str) {
        oe2.f.i(i14);
        if (i14 >= this.f168742c) {
            return str != null ? new q(this, str) : this;
        }
        return super.limitedParallelism(i14, str);
    }

    @Override // o53.z
    /* JADX INFO: renamed from: toString */
    public final String getF168767c() {
        String str = this.f168743d;
        if (str != null) {
            return str;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.f168741b);
        sb3.append(".limitedParallelism(");
        return ds.e0.j(sb3, this.f168742c, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
