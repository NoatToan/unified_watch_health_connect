package defpackage;

import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class x4h<T> extends o4h<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Callable<? extends Throwable> f38683a;

    public x4h(Callable<? extends Throwable> callable) {
        this.f38683a = callable;
    }

    @Override // defpackage.o4h
    public void R(z5h<? super T> z5hVar) {
        try {
            th = (Throwable) x3h.d(this.f38683a.call(), "Callable returned null throwable. Null values are generally not allowed in 2.x operators and sources.");
        } catch (Throwable th) {
            th = th;
            qf8.b(th);
        }
        EmptyDisposable.error(th, z5hVar);
    }
}
