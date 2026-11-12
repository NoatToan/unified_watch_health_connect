package u53;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p005kotlin.Metadata;
import u53.c;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\u00020\u0002B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0004\u0010\u0005R\u0013\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00068\u0002X\u0082\u0004R\u0013\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00068\u0002X\u0082\u0004¨\u0006\t"}, d2 = {"Lu53/c;", "N", "", "prev", "<init>", "(Lu53/c;)V", "Lh53/b;", "_next", "_prev", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class c<N extends c<N>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f168721a = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f168722b = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_prev$volatile");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    public c(N n14) {
        this._prev$volatile = n14;
    }

    public final void b() {
        f168722b.set(this, null);
    }

    public final N c() {
        Object obj = f168721a.get(this);
        if (obj == b.f168719a) {
            return null;
        }
        return (N) obj;
    }

    public abstract boolean d();

    public final void e() {
        c cVarC;
        if (c() == null) {
            return;
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f168722b;
            c cVar = (c) atomicReferenceFieldUpdater.get(this);
            while (cVar != null && cVar.d()) {
                cVar = (c) atomicReferenceFieldUpdater.get(cVar);
            }
            c cVarC2 = c();
            cVarC2.getClass();
            while (cVarC2.d() && (cVarC = cVarC2.c()) != null) {
                cVarC2 = cVarC;
            }
            while (true) {
                Object obj = atomicReferenceFieldUpdater.get(cVarC2);
                c cVar2 = ((c) obj) == null ? null : cVar;
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(cVarC2, obj, cVar2)) {
                        break;
                    } else if (atomicReferenceFieldUpdater.get(cVarC2) != obj) {
                    }
                }
            }
            if (cVar != null) {
                f168721a.set(cVar, cVarC2);
            }
            if (!cVarC2.d() || cVarC2.c() == null) {
                if (cVar == null || !cVar.d()) {
                    return;
                }
            }
        }
    }
}
