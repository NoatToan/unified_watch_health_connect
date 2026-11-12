package defpackage;

import io.reactivex.internal.observers.DeferredScalarDisposable;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class z4h<T> extends o4h<T> implements Callable<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Callable<? extends T> f40871a;

    public z4h(Callable<? extends T> callable) {
        this.f40871a = callable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.o4h
    public void R(z5h<? super T> z5hVar) {
        DeferredScalarDisposable deferredScalarDisposable = new DeferredScalarDisposable(z5hVar);
        z5hVar.onSubscribe(deferredScalarDisposable);
        if (deferredScalarDisposable.isDisposed()) {
            return;
        }
        try {
            deferredScalarDisposable.complete(x3h.d(this.f40871a.call(), "Callable returned null"));
        } catch (Throwable th) {
            qf8.b(th);
            if (deferredScalarDisposable.isDisposed()) {
                t5l.p(th);
            } else {
                z5hVar.onError(th);
            }
        }
    }

    @Override // java.util.concurrent.Callable
    public T call() throws Exception {
        return (T) x3h.d(this.f40871a.call(), "The callable returned a null value");
    }
}
