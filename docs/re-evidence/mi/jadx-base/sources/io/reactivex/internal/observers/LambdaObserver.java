package io.reactivex.internal.observers;

import defpackage.bg4;
import defpackage.hua;
import defpackage.jz6;
import defpackage.qf8;
import defpackage.t5l;
import defpackage.vc0;
import defpackage.z5h;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class LambdaObserver<T> extends AtomicReference<jz6> implements z5h<T>, jz6 {
    private static final long serialVersionUID = -7251123623727029452L;
    final vc0 onComplete;
    final bg4<? super Throwable> onError;
    final bg4<? super T> onNext;
    final bg4<? super jz6> onSubscribe;

    public LambdaObserver(bg4<? super T> bg4Var, bg4<? super Throwable> bg4Var2, vc0 vc0Var, bg4<? super jz6> bg4Var3) {
        this.onNext = bg4Var;
        this.onError = bg4Var2;
        this.onComplete = vc0Var;
        this.onSubscribe = bg4Var3;
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

    @Override // defpackage.z5h
    public void onComplete() {
        if (isDisposed()) {
            return;
        }
        lazySet(DisposableHelper.DISPOSED);
        try {
            this.onComplete.run();
        } catch (Throwable th) {
            qf8.b(th);
            t5l.p(th);
        }
    }

    @Override // defpackage.z5h
    public void onError(Throwable th) {
        if (isDisposed()) {
            t5l.p(th);
            return;
        }
        lazySet(DisposableHelper.DISPOSED);
        try {
            this.onError.accept(th);
        } catch (Throwable th2) {
            qf8.b(th2);
            t5l.p(new CompositeException(th, th2));
        }
    }

    @Override // defpackage.z5h
    public void onNext(T t) {
        if (isDisposed()) {
            return;
        }
        try {
            this.onNext.accept(t);
        } catch (Throwable th) {
            qf8.b(th);
            get().dispose();
            onError(th);
        }
    }

    @Override // defpackage.z5h
    public void onSubscribe(jz6 jz6Var) {
        if (DisposableHelper.setOnce(this, jz6Var)) {
            try {
                this.onSubscribe.accept(this);
            } catch (Throwable th) {
                qf8.b(th);
                jz6Var.dispose();
                onError(th);
            }
        }
    }
}
