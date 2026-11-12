package v03;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends AtomicReference<u03.c> implements s03.b {
    public a(u03.c cVar) {
        super(cVar);
    }

    @Override // s03.b
    public final boolean b() {
        return get() == null;
    }

    @Override // s03.b
    public final void dispose() {
        u03.c andSet;
        if (get() == null || (andSet = getAndSet(null)) == null) {
            return;
        }
        try {
            andSet.cancel();
        } catch (Exception e4) {
            t03.a.a(e4);
            k13.a.b(e4);
        }
    }
}
