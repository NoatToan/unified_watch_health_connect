package b13;

import io.reactivex.exceptions.CompositeException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class b<T> extends AtomicReference<s03.b> implements q03.j<T>, s03.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u03.d<? super T> f14423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u03.d<? super Throwable> f14424b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u03.a f14425c;

    public b(u03.d<? super T> dVar, u03.d<? super Throwable> dVar2, u03.a aVar) {
        this.f14423a = dVar;
        this.f14424b = dVar2;
        this.f14425c = aVar;
    }

    @Override // q03.j
    public final void a(s03.b bVar) {
        v03.c.f(this, bVar);
    }

    @Override // s03.b
    public final boolean b() {
        return v03.c.c(get());
    }

    @Override // s03.b
    public final void dispose() {
        v03.c.a(this);
    }

    @Override // q03.j
    public final void onComplete() {
        lazySet(v03.c.DISPOSED);
        try {
            this.f14425c.run();
        } catch (Throwable th3) {
            t03.a.a(th3);
            k13.a.b(th3);
        }
    }

    @Override // q03.j
    public final void onError(Throwable th3) {
        lazySet(v03.c.DISPOSED);
        try {
            this.f14424b.accept(th3);
        } catch (Throwable th4) {
            t03.a.a(th4);
            k13.a.b(new CompositeException(th3, th4));
        }
    }

    @Override // q03.j
    public final void onSuccess(T t7) {
        lazySet(v03.c.DISPOSED);
        try {
            this.f14423a.accept(t7);
        } catch (Throwable th3) {
            t03.a.a(th3);
            k13.a.b(th3);
        }
    }
}
