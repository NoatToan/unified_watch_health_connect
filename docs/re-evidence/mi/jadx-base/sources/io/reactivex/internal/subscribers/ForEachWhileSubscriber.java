package io.reactivex.internal.subscribers;

import defpackage.bg4;
import defpackage.i6i;
import defpackage.joo;
import defpackage.jz6;
import defpackage.qf8;
import defpackage.t5l;
import defpackage.vc0;
import defpackage.yno;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class ForEachWhileSubscriber<T> extends AtomicReference<joo> implements yno, jz6 {
    private static final long serialVersionUID = -4403180040475402120L;
    boolean done;
    final vc0 onComplete;
    final bg4<? super Throwable> onError;
    final i6i<? super T> onNext;

    public ForEachWhileSubscriber(i6i<? super T> i6iVar, bg4<? super Throwable> bg4Var, vc0 vc0Var) {
        this.onNext = i6iVar;
        this.onError = bg4Var;
        this.onComplete = vc0Var;
    }

    @Override // defpackage.jz6
    public void dispose() {
        SubscriptionHelper.cancel(this);
    }

    @Override // defpackage.jz6
    public boolean isDisposed() {
        return get() == SubscriptionHelper.CANCELLED;
    }

    @Override // defpackage.yno
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

    @Override // defpackage.yno
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

    @Override // defpackage.yno
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

    @Override // defpackage.yno
    public void onSubscribe(joo jooVar) {
        SubscriptionHelper.setOnce(this, jooVar, Long.MAX_VALUE);
    }
}
