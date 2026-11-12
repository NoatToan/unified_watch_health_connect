package rx.internal.producers;

import defpackage.cbi;
import defpackage.d8o;
import defpackage.hx1;
import defpackage.pf8;
import defpackage.xno;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import rx.internal.util.unsafe.SpscLinkedQueue;
import rx.internal.util.unsafe.UnsafeAccess;

/* JADX INFO: loaded from: classes3.dex */
public final class QueuedValueProducer<T> extends AtomicLong implements cbi {
    static final Object NULL_SENTINEL = new Object();
    private static final long serialVersionUID = 7277121710709137047L;
    final xno<? super T> child;
    final Queue<Object> queue;
    final AtomicInteger wip;

    public QueuedValueProducer(xno<? super T> xnoVar) {
        this(xnoVar, UnsafeAccess.isUnsafeAvailable() ? new SpscLinkedQueue() : new d8o());
    }

    private void drain() {
        Object objPoll;
        if (this.wip.getAndIncrement() == 0) {
            xno<? super T> xnoVar = this.child;
            Queue<Object> queue = this.queue;
            while (!xnoVar.isUnsubscribed()) {
                this.wip.lazySet(1);
                long j = get();
                long j2 = 0;
                while (j != 0 && (objPoll = queue.poll()) != null) {
                    try {
                        if (objPoll == NULL_SENTINEL) {
                            xnoVar.onNext(null);
                        } else {
                            xnoVar.onNext(objPoll);
                        }
                        if (xnoVar.isUnsubscribed()) {
                            return;
                        }
                        j--;
                        j2++;
                    } catch (Throwable th) {
                        if (objPoll == NULL_SENTINEL) {
                            objPoll = null;
                        }
                        pf8.f(th, xnoVar, objPoll);
                        return;
                    }
                }
                if (j2 != 0 && get() != Long.MAX_VALUE) {
                    addAndGet(-j2);
                }
                if (this.wip.decrementAndGet() == 0) {
                    return;
                }
            }
        }
    }

    public boolean offer(T t) {
        if (t == null) {
            if (!this.queue.offer(NULL_SENTINEL)) {
                return false;
            }
        } else if (!this.queue.offer(t)) {
            return false;
        }
        drain();
        return true;
    }

    @Override // defpackage.cbi
    public void request(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("n >= 0 required");
        }
        if (j > 0) {
            hx1.b(this, j);
            drain();
        }
    }

    public QueuedValueProducer(xno<? super T> xnoVar, Queue<Object> queue) {
        this.child = xnoVar;
        this.queue = queue;
        this.wip = new AtomicInteger();
    }
}
