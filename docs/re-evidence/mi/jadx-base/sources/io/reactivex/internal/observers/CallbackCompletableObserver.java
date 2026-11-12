package io.reactivex.internal.observers;

import defpackage.bg4;
import defpackage.ea4;
import defpackage.jz6;
import defpackage.qf8;
import defpackage.t5l;
import defpackage.vc0;
import io.reactivex.exceptions.OnErrorNotImplementedException;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class CallbackCompletableObserver extends AtomicReference<jz6> implements ea4, jz6, bg4<Throwable> {
    private static final long serialVersionUID = -4361286194466301354L;
    final vc0 onComplete;
    final bg4<? super Throwable> onError;

    public CallbackCompletableObserver(vc0 vc0Var) {
        this.onError = this;
        this.onComplete = vc0Var;
    }

    @Override // defpackage.jz6
    public void dispose() {
        DisposableHelper.dispose(this);
    }

    public boolean hasCustomOnError() {
        return this.onError != this;
    }

    @Override // defpackage.jz6
    public boolean isDisposed() {
        return get() == DisposableHelper.DISPOSED;
    }

    @Override // defpackage.ea4
    public void onComplete() {
        try {
            this.onComplete.run();
        } catch (Throwable th) {
            qf8.b(th);
            t5l.p(th);
        }
        lazySet(DisposableHelper.DISPOSED);
    }

    @Override // defpackage.ea4
    public void onError(Throwable th) {
        try {
            this.onError.accept(th);
        } catch (Throwable th2) {
            qf8.b(th2);
            t5l.p(th2);
        }
        lazySet(DisposableHelper.DISPOSED);
    }

    @Override // defpackage.ea4
    public void onSubscribe(jz6 jz6Var) {
        DisposableHelper.setOnce(this, jz6Var);
    }

    @Override // defpackage.bg4
    public void accept(Throwable th) {
        t5l.p(new OnErrorNotImplementedException(th));
    }

    public CallbackCompletableObserver(bg4<? super Throwable> bg4Var, vc0 vc0Var) {
        this.onError = bg4Var;
        this.onComplete = vc0Var;
    }
}
