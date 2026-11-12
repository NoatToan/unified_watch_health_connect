package io.reactivex.internal.subscriptions;

import defpackage.yno;

/* JADX INFO: loaded from: classes2.dex */
public class DeferredScalarSubscription<T> extends BasicIntQueueSubscription<T> {
    static final int CANCELLED = 4;
    static final int FUSED_CONSUMED = 32;
    static final int FUSED_EMPTY = 8;
    static final int FUSED_READY = 16;
    static final int HAS_REQUEST_HAS_VALUE = 3;
    static final int HAS_REQUEST_NO_VALUE = 2;
    static final int NO_REQUEST_HAS_VALUE = 1;
    static final int NO_REQUEST_NO_VALUE = 0;
    private static final long serialVersionUID = -2151279923272604993L;
    protected final yno<? super T> downstream;
    protected T value;

    public DeferredScalarSubscription(yno<? super T> ynoVar) {
        this.downstream = ynoVar;
    }

    @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, defpackage.joo
    public void cancel() {
        set(4);
        this.value = null;
    }

    @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, defpackage.jdm
    public final void clear() {
        lazySet(32);
        this.value = null;
    }

    public final void complete(T t) {
        int i = get();
        while (i != 8) {
            if ((i & (-3)) != 0) {
                return;
            }
            if (i == 2) {
                lazySet(3);
                yno<? super T> ynoVar = this.downstream;
                ynoVar.onNext(t);
                if (get() != 4) {
                    ynoVar.onComplete();
                    return;
                }
                return;
            }
            this.value = t;
            if (compareAndSet(0, 1)) {
                return;
            }
            i = get();
            if (i == 4) {
                this.value = null;
                return;
            }
        }
        this.value = t;
        lazySet(16);
        yno<? super T> ynoVar2 = this.downstream;
        ynoVar2.onNext(t);
        if (get() != 4) {
            ynoVar2.onComplete();
        }
    }

    public final boolean isCancelled() {
        return get() == 4;
    }

    @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, defpackage.jdm
    public final boolean isEmpty() {
        return get() != 16;
    }

    @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, defpackage.jdm
    public final T poll() {
        if (get() != 16) {
            return null;
        }
        lazySet(32);
        T t = this.value;
        this.value = null;
        return t;
    }

    @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, defpackage.joo
    public final void request(long j) {
        T t;
        if (SubscriptionHelper.validate(j)) {
            do {
                int i = get();
                if ((i & (-2)) != 0) {
                    return;
                }
                if (i == 1) {
                    if (!compareAndSet(1, 3) || (t = this.value) == null) {
                        return;
                    }
                    this.value = null;
                    yno<? super T> ynoVar = this.downstream;
                    ynoVar.onNext(t);
                    if (get() != 4) {
                        ynoVar.onComplete();
                        return;
                    }
                    return;
                }
            } while (!compareAndSet(0, 2));
        }
    }

    @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, defpackage.dgi
    public final int requestFusion(int i) {
        if ((i & 2) == 0) {
            return 0;
        }
        lazySet(8);
        return 2;
    }

    public final boolean tryCancel() {
        return getAndSet(4) != 4;
    }
}
