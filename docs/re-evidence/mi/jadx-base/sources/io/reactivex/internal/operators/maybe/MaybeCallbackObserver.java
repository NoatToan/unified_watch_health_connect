package io.reactivex.internal.operators.maybe;

import defpackage.bg4;
import defpackage.hua;
import defpackage.jz6;
import defpackage.qf8;
import defpackage.s9f;
import defpackage.t5l;
import defpackage.vc0;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class MaybeCallbackObserver<T> extends AtomicReference<jz6> implements s9f<T>, jz6 {
    private static final long serialVersionUID = -6076952298809384986L;
    final vc0 onComplete;
    final bg4<? super Throwable> onError;
    final bg4<? super T> onSuccess;

    public MaybeCallbackObserver(bg4<? super T> bg4Var, bg4<? super Throwable> bg4Var2, vc0 vc0Var) {
        this.onSuccess = bg4Var;
        this.onError = bg4Var2;
        this.onComplete = vc0Var;
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
        return DisposableHelper.isDisposed(get());
    }

    @Override // defpackage.s9f
    public void onComplete() {
        lazySet(DisposableHelper.DISPOSED);
        try {
            this.onComplete.run();
        } catch (Throwable th) {
            qf8.b(th);
            t5l.p(th);
        }
    }

    @Override // defpackage.s9f
    public void onError(Throwable th) {
        lazySet(DisposableHelper.DISPOSED);
        try {
            this.onError.accept(th);
        } catch (Throwable th2) {
            qf8.b(th2);
            t5l.p(new CompositeException(th, th2));
        }
    }

    @Override // defpackage.s9f
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
