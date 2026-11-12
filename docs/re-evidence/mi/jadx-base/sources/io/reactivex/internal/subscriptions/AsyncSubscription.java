package io.reactivex.internal.subscriptions;

import defpackage.joo;
import defpackage.jz6;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class AsyncSubscription extends AtomicLong implements joo, jz6 {
    private static final long serialVersionUID = 7028635084060361255L;
    final AtomicReference<joo> actual;
    final AtomicReference<jz6> resource;

    public AsyncSubscription() {
        this.resource = new AtomicReference<>();
        this.actual = new AtomicReference<>();
    }

    @Override // defpackage.joo
    public void cancel() {
        dispose();
    }

    @Override // defpackage.jz6
    public void dispose() {
        SubscriptionHelper.cancel(this.actual);
        DisposableHelper.dispose(this.resource);
    }

    @Override // defpackage.jz6
    public boolean isDisposed() {
        return this.actual.get() == SubscriptionHelper.CANCELLED;
    }

    public boolean replaceResource(jz6 jz6Var) {
        return DisposableHelper.replace(this.resource, jz6Var);
    }

    @Override // defpackage.joo
    public void request(long j) {
        SubscriptionHelper.deferredRequest(this.actual, this, j);
    }

    public boolean setResource(jz6 jz6Var) {
        return DisposableHelper.set(this.resource, jz6Var);
    }

    public void setSubscription(joo jooVar) {
        SubscriptionHelper.deferredSetOnce(this.actual, this, jooVar);
    }

    public AsyncSubscription(jz6 jz6Var) {
        this();
        this.resource.lazySet(jz6Var);
    }
}
