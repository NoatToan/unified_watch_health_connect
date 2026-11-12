package v03;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends AtomicReference<s03.b> implements s03.b {
    public f(s03.b bVar) {
        lazySet(bVar);
    }

    @Override // s03.b
    public final boolean b() {
        return c.c(get());
    }

    @Override // s03.b
    public final void dispose() {
        c.a(this);
    }

    public f() {
    }
}
