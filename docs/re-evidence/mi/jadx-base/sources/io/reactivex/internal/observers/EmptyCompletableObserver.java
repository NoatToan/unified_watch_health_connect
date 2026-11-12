package io.reactivex.internal.observers;

import defpackage.ea4;
import defpackage.jz6;
import defpackage.t5l;
import io.reactivex.exceptions.OnErrorNotImplementedException;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class EmptyCompletableObserver extends AtomicReference<jz6> implements ea4, jz6 {
    private static final long serialVersionUID = -7545121636549663526L;

    @Override // defpackage.jz6
    public void dispose() {
        DisposableHelper.dispose(this);
    }

    public boolean hasCustomOnError() {
        return false;
    }

    @Override // defpackage.jz6
    public boolean isDisposed() {
        return get() == DisposableHelper.DISPOSED;
    }

    @Override // defpackage.ea4
    public void onComplete() {
        lazySet(DisposableHelper.DISPOSED);
    }

    @Override // defpackage.ea4
    public void onError(Throwable th) {
        lazySet(DisposableHelper.DISPOSED);
        t5l.p(new OnErrorNotImplementedException(th));
    }

    @Override // defpackage.ea4
    public void onSubscribe(jz6 jz6Var) {
        DisposableHelper.setOnce(this, jz6Var);
    }
}
