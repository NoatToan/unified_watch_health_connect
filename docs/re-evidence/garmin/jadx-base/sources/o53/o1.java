package o53;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lo53/o1;", "Lu53/l;", "Lo53/u0;", "Lo53/g1;", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class o1 extends u53.l implements u0, g1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public p1 f129376d;

    @Override // o53.g1
    /* JADX INFO: renamed from: a */
    public final u1 getF129391a() {
        return null;
    }

    @Override // o53.u0
    public final void dispose() {
        p1 p1VarH = h();
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = p1.f129381a;
            Object obj = atomicReferenceFieldUpdater.get(p1VarH);
            if (obj instanceof o1) {
                if (obj != this) {
                    return;
                }
                x0 x0Var = q1.f129403g;
                while (!atomicReferenceFieldUpdater.compareAndSet(p1VarH, obj, x0Var)) {
                    if (atomicReferenceFieldUpdater.get(p1VarH) != obj) {
                    }
                }
                return;
            }
            if (!(obj instanceof g1) || ((g1) obj).getF129391a() == null) {
                return;
            }
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = u53.l.f168749a;
                Object obj2 = atomicReferenceFieldUpdater2.get(this);
                if (obj2 instanceof u53.r) {
                    return;
                }
                if (obj2 == this) {
                    return;
                }
                obj2.getClass();
                u53.l lVar = (u53.l) obj2;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = u53.l.f168751c;
                u53.r rVar = (u53.r) atomicReferenceFieldUpdater3.get(lVar);
                if (rVar == null) {
                    rVar = new u53.r(lVar);
                    atomicReferenceFieldUpdater3.set(lVar, rVar);
                }
                do {
                    if (atomicReferenceFieldUpdater2.compareAndSet(this, obj2, rVar)) {
                        lVar.d();
                        return;
                    }
                } while (atomicReferenceFieldUpdater2.get(this) == obj2);
            }
        }
    }

    public l1 getParent() {
        return h();
    }

    public final p1 h() {
        p1 p1Var = this.f129376d;
        if (p1Var != null) {
            return p1Var;
        }
        p005kotlin.jvm.internal.s.m("job");
        throw null;
    }

    public abstract boolean i();

    @Override // o53.g1
    /* JADX INFO: renamed from: isActive */
    public final boolean getF129421a() {
        return true;
    }

    public abstract void j(Throwable th3);

    @Override // u53.l
    public final String toString() {
        return getClass().getSimpleName() + '@' + f0.u(this) + "[job@" + f0.u(h()) + ']';
    }
}
