package io.reactivex.internal.subscriptions;

import defpackage.fgi;
import defpackage.yno;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class ScalarSubscription<T> extends AtomicInteger implements fgi<T> {
    static final int CANCELLED = 2;
    static final int NO_REQUEST = 0;
    static final int REQUESTED = 1;
    private static final long serialVersionUID = -3830916580126663321L;
    final yno<? super T> subscriber;
    final T value;

    public ScalarSubscription(yno<? super T> ynoVar, T t) {
        this.subscriber = ynoVar;
        this.value = t;
    }

    @Override // defpackage.joo
    public void cancel() {
        lazySet(2);
    }

    @Override // defpackage.jdm
    public void clear() {
        lazySet(1);
    }

    public boolean isCancelled() {
        return get() == 2;
    }

    @Override // defpackage.jdm
    public boolean isEmpty() {
        return get() != 0;
    }

    @Override // defpackage.jdm
    public boolean offer(T t) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // defpackage.jdm
    public T poll() {
        if (get() != 0) {
            return null;
        }
        lazySet(1);
        return this.value;
    }

    @Override // defpackage.joo
    public void request(long j) {
        if (SubscriptionHelper.validate(j) && compareAndSet(0, 1)) {
            yno<? super T> ynoVar = this.subscriber;
            ynoVar.onNext(this.value);
            if (get() != 2) {
                ynoVar.onComplete();
            }
        }
    }

    @Override // defpackage.dgi
    public int requestFusion(int i) {
        return i & 1;
    }

    public boolean offer(T t, T t2) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
