package r83;

import j83.o;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends AtomicReference<o> implements o {
    public a(o oVar) {
        lazySet(oVar);
    }

    @Override // j83.o
    public final boolean e() {
        return get() == b.INSTANCE;
    }

    @Override // j83.o
    public final void f() {
        o andSet;
        o oVar = get();
        b bVar = b.INSTANCE;
        if (oVar == bVar || (andSet = getAndSet(bVar)) == null || andSet == bVar) {
            return;
        }
        andSet.f();
    }

    public a() {
    }
}
