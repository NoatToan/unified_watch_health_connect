package io.reactivex.internal.operators.observable;

import defpackage.jz6;
import defpackage.z5h;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class ObserverResourceWrapper<T> extends AtomicReference<jz6> implements z5h<T>, jz6 {
    private static final long serialVersionUID = -8612022020200669122L;
    final z5h<? super T> downstream;
    final AtomicReference<jz6> upstream = new AtomicReference<>();

    public ObserverResourceWrapper(z5h<? super T> z5hVar) {
        this.downstream = z5hVar;
    }

    @Override // defpackage.jz6
    public void dispose() {
        DisposableHelper.dispose(this.upstream);
        DisposableHelper.dispose(this);
    }

    @Override // defpackage.jz6
    public boolean isDisposed() {
        return this.upstream.get() == DisposableHelper.DISPOSED;
    }

    @Override // defpackage.z5h
    public void onComplete() {
        dispose();
        this.downstream.onComplete();
    }

    @Override // defpackage.z5h
    public void onError(Throwable th) {
        dispose();
        this.downstream.onError(th);
    }

    @Override // defpackage.z5h
    public void onNext(T t) {
        this.downstream.onNext(t);
    }

    @Override // defpackage.z5h
    public void onSubscribe(jz6 jz6Var) {
        if (DisposableHelper.setOnce(this.upstream, jz6Var)) {
            this.downstream.onSubscribe(this);
        }
    }

    public void setResource(jz6 jz6Var) {
        DisposableHelper.set(this, jz6Var);
    }
}
