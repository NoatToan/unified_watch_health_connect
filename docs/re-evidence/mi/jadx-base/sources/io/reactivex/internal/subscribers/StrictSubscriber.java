package io.reactivex.internal.subscribers;

import defpackage.fkb;
import defpackage.joo;
import defpackage.yno;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public class StrictSubscriber<T> extends AtomicInteger implements yno, joo {
    private static final long serialVersionUID = -4945028590049415624L;
    volatile boolean done;
    final yno<? super T> downstream;
    final AtomicThrowable error = new AtomicThrowable();
    final AtomicLong requested = new AtomicLong();
    final AtomicReference<joo> upstream = new AtomicReference<>();
    final AtomicBoolean once = new AtomicBoolean();

    public StrictSubscriber(yno<? super T> ynoVar) {
        this.downstream = ynoVar;
    }

    @Override // defpackage.joo
    public void cancel() {
        if (this.done) {
            return;
        }
        SubscriptionHelper.cancel(this.upstream);
    }

    @Override // defpackage.yno
    public void onComplete() {
        this.done = true;
        fkb.b(this.downstream, this, this.error);
    }

    @Override // defpackage.yno
    public void onError(Throwable th) {
        this.done = true;
        fkb.d(this.downstream, th, this, this.error);
    }

    @Override // defpackage.yno
    public void onNext(T t) {
        fkb.f(this.downstream, t, this, this.error);
    }

    @Override // defpackage.yno
    public void onSubscribe(joo jooVar) {
        if (this.once.compareAndSet(false, true)) {
            this.downstream.onSubscribe(this);
            SubscriptionHelper.deferredSetOnce(this.upstream, this.requested, jooVar);
        } else {
            jooVar.cancel();
            cancel();
            onError(new IllegalStateException("§2.12 violated: onSubscribe must be called at most once"));
        }
    }

    @Override // defpackage.joo
    public void request(long j) {
        if (j > 0) {
            SubscriptionHelper.deferredRequest(this.upstream, this.requested, j);
            return;
        }
        cancel();
        onError(new IllegalArgumentException("§3.9 violated: positive request amount required but it was " + j));
    }
}
