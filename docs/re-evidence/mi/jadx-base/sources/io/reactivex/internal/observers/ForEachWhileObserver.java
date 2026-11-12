package io.reactivex.internal.observers;

import defpackage.bg4;
import defpackage.i6i;
import defpackage.jz6;
import defpackage.qf8;
import defpackage.t5l;
import defpackage.vc0;
import defpackage.z5h;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class ForEachWhileObserver<T> extends AtomicReference<jz6> implements z5h<T>, jz6 {
    private static final long serialVersionUID = -4403180040475402120L;
    boolean done;
    final vc0 onComplete;
    final bg4<? super Throwable> onError;
    final i6i<? super T> onNext;

    public ForEachWhileObserver(i6i<? super T> i6iVar, bg4<? super Throwable> bg4Var, vc0 vc0Var) {
        this.onNext = i6iVar;
        this.onError = bg4Var;
        this.onComplete = vc0Var;
    }

    @Override // defpackage.jz6
    public void dispose() {
        DisposableHelper.dispose(this);
    }

    @Override // defpackage.jz6
    public boolean isDisposed() {
        return DisposableHelper.isDisposed(get());
    }

    @Override // defpackage.z5h
    public void onComplete() {
        if (this.done) {
            return;
        }
        this.done = true;
        try {
            this.onComplete.run();
        } catch (Throwable th) {
            qf8.b(th);
            t5l.p(th);
        }
    }

    @Override // defpackage.z5h
    public void onError(Throwable th) {
        if (this.done) {
            t5l.p(th);
            return;
        }
        this.done = true;
        try {
            this.onError.accept(th);
        } catch (Throwable th2) {
            qf8.b(th2);
            t5l.p(new CompositeException(th, th2));
        }
    }

    @Override // defpackage.z5h
    public void onNext(T t) {
        if (this.done) {
            return;
        }
        try {
            if (this.onNext.test(t)) {
                return;
            }
            dispose();
            onComplete();
        } catch (Throwable th) {
            qf8.b(th);
            dispose();
            onError(th);
        }
    }

    @Override // defpackage.z5h
    public void onSubscribe(jz6 jz6Var) {
        DisposableHelper.setOnce(this, jz6Var);
    }
}
