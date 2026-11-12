package y03;

import io.reactivex.exceptions.OnErrorNotImplementedException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends AtomicReference<s03.b> implements q03.d, s03.b, u03.d<Throwable> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u03.d<? super Throwable> f193057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u03.a f193058b;

    public d(u03.a aVar) {
        this.f193057a = this;
        this.f193058b = aVar;
    }

    @Override // q03.d
    public final void a(s03.b bVar) {
        v03.c.f(this, bVar);
    }

    @Override // u03.d
    public final void accept(Throwable th3) {
        k13.a.b(new OnErrorNotImplementedException(th3));
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
        try {
            this.f193058b.run();
        } catch (Throwable th3) {
            t03.a.a(th3);
            k13.a.b(th3);
        }
        lazySet(v03.c.DISPOSED);
    }

    @Override // q03.d
    public final void onError(Throwable th3) {
        try {
            this.f193057a.accept(th3);
        } catch (Throwable th4) {
            t03.a.a(th4);
            k13.a.b(th4);
        }
        lazySet(v03.c.DISPOSED);
    }

    public d(u03.d<? super Throwable> dVar, u03.a aVar) {
        this.f193057a = dVar;
        this.f193058b = aVar;
    }
}
