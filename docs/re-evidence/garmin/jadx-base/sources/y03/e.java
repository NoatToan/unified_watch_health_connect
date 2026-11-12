package y03;

import io.reactivex.exceptions.CompositeException;
import java.util.concurrent.atomic.AtomicReference;
import q03.t;

/* JADX INFO: loaded from: classes3.dex */
public final class e<T> extends AtomicReference<s03.b> implements t<T>, s03.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u03.d<? super T> f193059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u03.d<? super Throwable> f193060b;

    public e(u03.d<? super T> dVar, u03.d<? super Throwable> dVar2) {
        this.f193059a = dVar;
        this.f193060b = dVar2;
    }

    @Override // q03.t
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

    @Override // q03.t
    public final void onError(Throwable th3) {
        lazySet(v03.c.DISPOSED);
        try {
            this.f193060b.accept(th3);
        } catch (Throwable th4) {
            t03.a.a(th4);
            k13.a.b(new CompositeException(th3, th4));
        }
    }

    @Override // q03.t
    public final void onSuccess(T t7) {
        lazySet(v03.c.DISPOSED);
        try {
            this.f193059a.accept(t7);
        } catch (Throwable th3) {
            t03.a.a(th3);
            k13.a.b(th3);
        }
    }
}
