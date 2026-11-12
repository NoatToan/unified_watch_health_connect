package io.reactivex.internal.subscribers;

import defpackage.gx1;
import defpackage.joo;
import defpackage.yno;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes2.dex */
public abstract class SinglePostCompleteSubscriber<T, R> extends AtomicLong implements yno, joo {
    static final long COMPLETE_MASK = Long.MIN_VALUE;
    static final long REQUEST_MASK = Long.MAX_VALUE;
    private static final long serialVersionUID = 7917814472626990048L;
    protected final yno<? super R> downstream;
    protected long produced;
    protected joo upstream;
    protected R value;

    public SinglePostCompleteSubscriber(yno<? super R> ynoVar) {
        this.downstream = ynoVar;
    }

    @Override // defpackage.joo
    public void cancel() {
        this.upstream.cancel();
    }

    public final void complete(R r2) {
        long j = this.produced;
        if (j != 0) {
            gx1.c(this, j);
        }
        while (true) {
            long j2 = get();
            if ((j2 & Long.MIN_VALUE) != 0) {
                onDrop(r2);
                return;
            }
            if ((j2 & Long.MAX_VALUE) != 0) {
                lazySet(-9223372036854775807L);
                this.downstream.onNext(r2);
                this.downstream.onComplete();
                return;
            } else {
                this.value = r2;
                if (compareAndSet(0L, Long.MIN_VALUE)) {
                    return;
                } else {
                    this.value = null;
                }
            }
        }
    }

    @Override // defpackage.yno
    public abstract /* synthetic */ void onComplete();

    public void onDrop(R r2) {
    }

    @Override // defpackage.yno
    public abstract /* synthetic */ void onError(Throwable th);

    @Override // defpackage.yno
    public abstract /* synthetic */ void onNext(Object obj);

    @Override // defpackage.yno
    public void onSubscribe(joo jooVar) {
        if (SubscriptionHelper.validate(this.upstream, jooVar)) {
            this.upstream = jooVar;
            this.downstream.onSubscribe(this);
        }
    }

    @Override // defpackage.joo
    public final void request(long j) {
        long j2;
        if (SubscriptionHelper.validate(j)) {
            do {
                j2 = get();
                if ((j2 & Long.MIN_VALUE) != 0) {
                    if (compareAndSet(Long.MIN_VALUE, -9223372036854775807L)) {
                        this.downstream.onNext(this.value);
                        this.downstream.onComplete();
                        return;
                    }
                    return;
                }
            } while (!compareAndSet(j2, gx1.b(j2, j)));
            this.upstream.request(j);
        }
    }
}
