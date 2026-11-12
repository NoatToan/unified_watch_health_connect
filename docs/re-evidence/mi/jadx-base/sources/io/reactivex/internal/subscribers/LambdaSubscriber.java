package io.reactivex.internal.subscribers;

import defpackage.bg4;
import defpackage.hua;
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
public final class LambdaSubscriber<T> extends AtomicReference<joo> implements yno, joo, jz6 {
    private static final long serialVersionUID = -7251123623727029452L;
    final vc0 onComplete;
    final bg4<? super Throwable> onError;
    final bg4<? super T> onNext;
    final bg4<? super joo> onSubscribe;

    public LambdaSubscriber(bg4<? super T> bg4Var, bg4<? super Throwable> bg4Var2, vc0 vc0Var, bg4<? super joo> bg4Var3) {
        this.onNext = bg4Var;
        this.onError = bg4Var2;
        this.onComplete = vc0Var;
        this.onSubscribe = bg4Var3;
    }

    @Override // defpackage.joo
    public void cancel() {
        SubscriptionHelper.cancel(this);
    }

    @Override // defpackage.jz6
    public void dispose() {
        cancel();
    }

    public boolean hasCustomOnError() {
        return this.onError != hua.f;
    }

    @Override // defpackage.jz6
    public boolean isDisposed() {
        return get() == SubscriptionHelper.CANCELLED;
    }

    @Override // defpackage.yno
    public void onComplete() {
        joo jooVar = get();
        SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
        if (jooVar != subscriptionHelper) {
            lazySet(subscriptionHelper);
            try {
                this.onComplete.run();
            } catch (Throwable th) {
                qf8.b(th);
                t5l.p(th);
            }
        }
    }

    @Override // defpackage.yno
    public void onError(Throwable th) {
        joo jooVar = get();
        SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
        if (jooVar == subscriptionHelper) {
            t5l.p(th);
            return;
        }
        lazySet(subscriptionHelper);
        try {
            this.onError.accept(th);
        } catch (Throwable th2) {
            qf8.b(th2);
            t5l.p(new CompositeException(th, th2));
        }
    }

    @Override // defpackage.yno
    public void onNext(T t) {
        if (isDisposed()) {
            return;
        }
        try {
            this.onNext.accept(t);
        } catch (Throwable th) {
            qf8.b(th);
            get().cancel();
            onError(th);
        }
    }

    @Override // defpackage.yno
    public void onSubscribe(joo jooVar) {
        if (SubscriptionHelper.setOnce(this, jooVar)) {
            try {
                this.onSubscribe.accept(this);
            } catch (Throwable th) {
                qf8.b(th);
                jooVar.cancel();
                onError(th);
            }
        }
    }

    @Override // defpackage.joo
    public void request(long j) {
        get().request(j);
    }
}
