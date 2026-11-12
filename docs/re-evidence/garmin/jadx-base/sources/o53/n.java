package o53;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lo53/n;", "Lo53/o1;", "Lo53/k;", "child", "<init>", "(Lo53/k;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class n extends o1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final k<?> f129374e;

    public n(k<?> kVar) {
        this.f129374e = kVar;
    }

    @Override // o53.o1
    public final boolean i() {
        return true;
    }

    @Override // o53.o1
    public final void j(Throwable th3) {
        p1 p1VarH = h();
        k<?> kVar = this.f129374e;
        Throwable thN = kVar.n(p1VarH);
        if (kVar.v()) {
            t13.d<?> dVar = kVar.f129361d;
            dVar.getClass();
            u53.f fVar = (u53.f) dVar;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = u53.f.f168731h;
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(fVar);
                u53.x xVar = u53.g.f168737b;
                if (p005kotlin.jvm.internal.s.g(obj, xVar)) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(fVar, xVar, thN)) {
                        if (atomicReferenceFieldUpdater.get(fVar) != xVar) {
                        }
                    }
                    return;
                } else {
                    if (obj instanceof Throwable) {
                        return;
                    }
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(fVar, obj, null)) {
                            break loop0;
                        }
                    } while (atomicReferenceFieldUpdater.get(fVar) == obj);
                }
            }
        }
        kVar.u(thN);
        if (kVar.v()) {
            return;
        }
        kVar.l();
    }
}
