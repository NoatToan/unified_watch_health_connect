package io.reactivex.internal.observers;

import defpackage.jz6;
import defpackage.z5h;
import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: loaded from: classes2.dex */
public abstract class DeferredScalarObserver<T, R> extends DeferredScalarDisposable<R> implements z5h<T> {
    private static final long serialVersionUID = -266195175408988651L;
    protected jz6 upstream;

    public DeferredScalarObserver(z5h<? super R> z5hVar) {
        super(z5hVar);
    }

    @Override // io.reactivex.internal.observers.DeferredScalarDisposable, io.reactivex.internal.observers.BasicIntQueueDisposable, defpackage.jz6
    public void dispose() {
        super.dispose();
        this.upstream.dispose();
    }

    @Override // defpackage.z5h
    public void onComplete() {
        T t = this.value;
        if (t == null) {
            complete();
        } else {
            this.value = null;
            complete(t);
        }
    }

    @Override // defpackage.z5h
    public void onError(Throwable th) {
        this.value = null;
        error(th);
    }

    @Override // defpackage.z5h
    public abstract /* synthetic */ void onNext(Object obj);

    @Override // defpackage.z5h
    public void onSubscribe(jz6 jz6Var) {
        if (DisposableHelper.validate(this.upstream, jz6Var)) {
            this.upstream = jz6Var;
            this.downstream.onSubscribe(this);
        }
    }
}
