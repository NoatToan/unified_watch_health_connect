package u53;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import o53.f0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.g0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00048\u0002X\u0082\u0004R\u0011\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00000\u00048\u0002X\u0082\u0004R\u0013\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00048\u0002X\u0082\u0004¨\u0006\t"}, d2 = {"Lu53/l;", "", "<init>", "()V", "Lh53/b;", "_next", "_prev", "Lu53/r;", "_removedRef", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f168749a = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f168750b = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "_prev$volatile");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f168751c = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "_removedRef$volatile");
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    public final boolean c(l lVar, int i14) {
        while (true) {
            l lVarD = d();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f168750b;
            if (lVarD == null) {
                Object obj = atomicReferenceFieldUpdater.get(this);
                while (true) {
                    lVarD = (l) obj;
                    if (!lVarD.g()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(lVarD);
                }
            }
            if (lVarD instanceof j) {
                return (((j) lVarD).f168748d & i14) == 0 && lVarD.c(lVar, i14);
            }
            atomicReferenceFieldUpdater.set(lVar, lVarD);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f168749a;
            atomicReferenceFieldUpdater2.set(lVar, this);
            do {
                if (atomicReferenceFieldUpdater2.compareAndSet(lVarD, this, lVar)) {
                    lVar.e(this);
                    return true;
                }
            } while (atomicReferenceFieldUpdater2.get(lVarD) == this);
        }
    }

    public final l d() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object obj;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f168750b;
            l lVar = (l) atomicReferenceFieldUpdater2.get(this);
            l lVar2 = lVar;
            while (true) {
                l lVar3 = null;
                while (true) {
                    atomicReferenceFieldUpdater = f168749a;
                    obj = atomicReferenceFieldUpdater.get(lVar2);
                    if (obj == this) {
                        if (lVar == lVar2) {
                            return lVar2;
                        }
                        while (!atomicReferenceFieldUpdater2.compareAndSet(this, lVar, lVar2)) {
                            if (atomicReferenceFieldUpdater2.get(this) != lVar) {
                                break;
                            }
                        }
                        return lVar2;
                    }
                    if (g()) {
                        return null;
                    }
                    if (!(obj instanceof r)) {
                        obj.getClass();
                        lVar3 = lVar2;
                        lVar2 = (l) obj;
                    } else {
                        if (lVar3 != null) {
                            break;
                        }
                        lVar2 = (l) atomicReferenceFieldUpdater2.get(lVar2);
                    }
                }
                l lVar4 = ((r) obj).f168768a;
                while (!atomicReferenceFieldUpdater.compareAndSet(lVar3, lVar2, lVar4)) {
                    if (atomicReferenceFieldUpdater.get(lVar3) != lVar2) {
                        break;
                    }
                }
                lVar2 = lVar3;
            }
        }
    }

    public final void e(l lVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f168750b;
            l lVar2 = (l) atomicReferenceFieldUpdater.get(lVar);
            if (f168749a.get(this) != lVar) {
                return;
            }
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(lVar, lVar2, this)) {
                    if (g()) {
                        lVar.d();
                        return;
                    }
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(lVar) == lVar2);
        }
    }

    public final l f() {
        l lVar;
        Object obj = f168749a.get(this);
        r rVar = obj instanceof r ? (r) obj : null;
        if (rVar != null && (lVar = rVar.f168768a) != null) {
            return lVar;
        }
        obj.getClass();
        return (l) obj;
    }

    public boolean g() {
        return f168749a.get(this) instanceof r;
    }

    public String toString() {
        return new g0(this) { // from class: u53.l.a
            @Override // p005kotlin.jvm.internal.g0, k23.m
            public final Object get() {
                return this.receiver.getClass().getSimpleName();
            }
        } + '@' + f0.u(this);
    }
}
