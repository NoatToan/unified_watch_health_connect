package y03;

import io.reactivex.exceptions.OnErrorNotImplementedException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends AtomicReference<s03.b> implements q03.d, s03.b {
    @Override // q03.d
    public final void a(s03.b bVar) {
        v03.c.f(this, bVar);
    }

    @Override // s03.b
    public final boolean b() {
        return get() == v03.c.DISPOSED;
    }

    @Override // s03.b
    public final void dispose() {
        v03.c.a(this);
    }

    @Override // q03.d
    public final void onComplete() {
        lazySet(v03.c.DISPOSED);
    }

    @Override // q03.d
    public final void onError(Throwable th3) {
        lazySet(v03.c.DISPOSED);
        k13.a.b(new OnErrorNotImplementedException(th3));
    }
}
