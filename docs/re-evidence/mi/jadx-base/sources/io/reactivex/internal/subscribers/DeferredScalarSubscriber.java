package io.reactivex.internal.subscribers;

import defpackage.joo;
import defpackage.yno;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;

/* JADX INFO: loaded from: classes2.dex */
public abstract class DeferredScalarSubscriber<T, R> extends DeferredScalarSubscription<R> implements yno {
    private static final long serialVersionUID = 2984505488220891551L;
    protected boolean hasValue;
    protected joo upstream;

    public DeferredScalarSubscriber(yno<? super R> ynoVar) {
        super(ynoVar);
    }

    @Override // io.reactivex.internal.subscriptions.DeferredScalarSubscription, io.reactivex.internal.subscriptions.BasicIntQueueSubscription, defpackage.joo
    public void cancel() {
        super.cancel();
        this.upstream.cancel();
    }

    @Override // defpackage.yno
    public void onComplete() {
        if (this.hasValue) {
            complete(this.value);
        } else {
            this.downstream.onComplete();
        }
    }

    @Override // defpackage.yno
    public void onError(Throwable th) {
        this.value = null;
        this.downstream.onError(th);
    }

    @Override // defpackage.yno
    public abstract /* synthetic */ void onNext(Object obj);

    @Override // defpackage.yno
    public void onSubscribe(joo jooVar) {
        if (SubscriptionHelper.validate(this.upstream, jooVar)) {
            this.upstream = jooVar;
            this.downstream.onSubscribe(this);
            jooVar.request(Long.MAX_VALUE);
        }
    }
}
