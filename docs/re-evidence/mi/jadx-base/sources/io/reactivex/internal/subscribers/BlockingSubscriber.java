package io.reactivex.internal.subscribers;

import defpackage.joo;
import defpackage.yno;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.NotificationLite;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class BlockingSubscriber<T> extends AtomicReference<joo> implements yno, joo {
    public static final Object TERMINATED = new Object();
    private static final long serialVersionUID = -4875965440900746268L;
    final Queue<Object> queue;

    public BlockingSubscriber(Queue<Object> queue) {
        this.queue = queue;
    }

    @Override // defpackage.joo
    public void cancel() {
        if (SubscriptionHelper.cancel(this)) {
            this.queue.offer(TERMINATED);
        }
    }

    public boolean isCancelled() {
        return get() == SubscriptionHelper.CANCELLED;
    }

    @Override // defpackage.yno
    public void onComplete() {
        this.queue.offer(NotificationLite.complete());
    }

    @Override // defpackage.yno
    public void onError(Throwable th) {
        this.queue.offer(NotificationLite.error(th));
    }

    @Override // defpackage.yno
    public void onNext(T t) {
        this.queue.offer(NotificationLite.next(t));
    }

    @Override // defpackage.yno
    public void onSubscribe(joo jooVar) {
        if (SubscriptionHelper.setOnce(this, jooVar)) {
            this.queue.offer(NotificationLite.subscription(this));
        }
    }

    @Override // defpackage.joo
    public void request(long j) {
        get().request(j);
    }
}
