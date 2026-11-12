package io.reactivex.internal.observers;

import defpackage.jz6;
import defpackage.z5h;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.NotificationLite;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class BlockingObserver<T> extends AtomicReference<jz6> implements z5h<T>, jz6 {
    public static final Object TERMINATED = new Object();
    private static final long serialVersionUID = -4875965440900746268L;
    final Queue<Object> queue;

    public BlockingObserver(Queue<Object> queue) {
        this.queue = queue;
    }

    @Override // defpackage.jz6
    public void dispose() {
        if (DisposableHelper.dispose(this)) {
            this.queue.offer(TERMINATED);
        }
    }

    @Override // defpackage.jz6
    public boolean isDisposed() {
        return get() == DisposableHelper.DISPOSED;
    }

    @Override // defpackage.z5h
    public void onComplete() {
        this.queue.offer(NotificationLite.complete());
    }

    @Override // defpackage.z5h
    public void onError(Throwable th) {
        this.queue.offer(NotificationLite.error(th));
    }

    @Override // defpackage.z5h
    public void onNext(T t) {
        this.queue.offer(NotificationLite.next(t));
    }

    @Override // defpackage.z5h
    public void onSubscribe(jz6 jz6Var) {
        DisposableHelper.setOnce(this, jz6Var);
    }
}
