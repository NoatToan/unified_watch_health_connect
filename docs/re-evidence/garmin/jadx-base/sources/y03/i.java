package y03;

import io.reactivex.exceptions.CompositeException;
import java.util.concurrent.atomic.AtomicReference;
import q03.p;

/* JADX INFO: loaded from: classes3.dex */
public final class i<T> extends AtomicReference<s03.b> implements p<T>, s03.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u03.d<? super T> f193067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u03.d<? super Throwable> f193068b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u03.a f193069c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u03.d<? super s03.b> f193070d;

    public i(u03.d<? super T> dVar, u03.d<? super Throwable> dVar2, u03.a aVar, u03.d<? super s03.b> dVar3) {
        this.f193067a = dVar;
        this.f193068b = dVar2;
        this.f193069c = aVar;
        this.f193070d = dVar3;
    }

    @Override // q03.p
    public final void a(s03.b bVar) {
        if (v03.c.f(this, bVar)) {
            try {
                this.f193070d.accept(this);
            } catch (Throwable th3) {
                t03.a.a(th3);
                bVar.dispose();
                onError(th3);
            }
        }
    }

    @Override // s03.b
    public final boolean b() {
        return get() == v03.c.DISPOSED;
    }

    @Override // q03.p
    public final void c(T t7) {
        if (b()) {
            return;
        }
        try {
            this.f193067a.accept(t7);
        } catch (Throwable th3) {
            t03.a.a(th3);
            get().dispose();
            onError(th3);
        }
    }

    @Override // s03.b
    public final void dispose() {
        v03.c.a(this);
    }

    @Override // q03.p
    public final void onComplete() {
        if (b()) {
            return;
        }
        lazySet(v03.c.DISPOSED);
        try {
            this.f193069c.run();
        } catch (Throwable th3) {
            t03.a.a(th3);
            k13.a.b(th3);
        }
    }

    @Override // q03.p
    public final void onError(Throwable th3) {
        if (b()) {
            k13.a.b(th3);
            return;
        }
        lazySet(v03.c.DISPOSED);
        try {
            this.f193068b.accept(th3);
        } catch (Throwable th4) {
            t03.a.a(th4);
            k13.a.b(new CompositeException(th3, th4));
        }
    }
}
