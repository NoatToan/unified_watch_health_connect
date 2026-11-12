package io.reactivex.internal.subscribers;

import defpackage.joo;
import defpackage.jz6;
import defpackage.yno;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class SubscriberResourceWrapper<T> extends AtomicReference<jz6> implements yno, jz6, joo {
    private static final long serialVersionUID = -8612022020200669122L;
    final yno<? super T> downstream;
    final AtomicReference<joo> upstream = new AtomicReference<>();

    public SubscriberResourceWrapper(yno<? super T> ynoVar) {
        this.downstream = ynoVar;
    }

    @Override // defpackage.joo
    public void cancel() {
        dispose();
    }

    @Override // defpackage.jz6
    public void dispose() {
        SubscriptionHelper.cancel(this.upstream);
        DisposableHelper.dispose(this);
    }

    @Override // defpackage.jz6
    public boolean isDisposed() {
        return this.upstream.get() == SubscriptionHelper.CANCELLED;
    }

    @Override // defpackage.yno
    public void onComplete() {
        DisposableHelper.dispose(this);
        this.downstream.onComplete();
    }

    @Override // defpackage.yno
    public void onError(Throwable th) {
        DisposableHelper.dispose(this);
        this.downstream.onError(th);
    }

    @Override // defpackage.yno
    public void onNext(T t) {
        this.downstream.onNext(t);
    }

    @Override // defpackage.yno
    public void onSubscribe(joo jooVar) {
        if (SubscriptionHelper.setOnce(this.upstream, jooVar)) {
            this.downstream.onSubscribe(this);
        }
    }

    @Override // defpackage.joo
    public void request(long j) {
        if (SubscriptionHelper.validate(j)) {
            this.upstream.get().request(j);
        }
    }

    public void setResource(jz6 jz6Var) {
        DisposableHelper.set(this, jz6Var);
    }
}
