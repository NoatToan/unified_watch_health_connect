package io.reactivex.internal.observers;

import defpackage.bg4;
import defpackage.hua;
import defpackage.jz6;
import defpackage.kem;
import defpackage.qf8;
import defpackage.t5l;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class ConsumerSingleObserver<T> extends AtomicReference<jz6> implements kem<T>, jz6 {
    private static final long serialVersionUID = -7012088219455310787L;
    final bg4<? super Throwable> onError;
    final bg4<? super T> onSuccess;

    public ConsumerSingleObserver(bg4<? super T> bg4Var, bg4<? super Throwable> bg4Var2) {
        this.onSuccess = bg4Var;
        this.onError = bg4Var2;
    }

    @Override // defpackage.jz6
    public void dispose() {
        DisposableHelper.dispose(this);
    }

    public boolean hasCustomOnError() {
        return this.onError != hua.f;
    }

    @Override // defpackage.jz6
    public boolean isDisposed() {
        return get() == DisposableHelper.DISPOSED;
    }

    @Override // defpackage.kem
    public void onError(Throwable th) {
        lazySet(DisposableHelper.DISPOSED);
        try {
            this.onError.accept(th);
        } catch (Throwable th2) {
            qf8.b(th2);
            t5l.p(new CompositeException(th, th2));
        }
    }

    @Override // defpackage.kem
    public void onSubscribe(jz6 jz6Var) {
        DisposableHelper.setOnce(this, jz6Var);
    }

    public void onSuccess(T t) {
        lazySet(DisposableHelper.DISPOSED);
        try {
            this.onSuccess.accept(t);
        } catch (Throwable th) {
            qf8.b(th);
            t5l.p(th);
        }
    }
}
