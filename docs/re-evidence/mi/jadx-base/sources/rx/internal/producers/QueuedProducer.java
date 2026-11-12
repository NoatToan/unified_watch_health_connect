package rx.internal.producers;

import defpackage.a6h;
import defpackage.cbi;
import defpackage.d8o;
import defpackage.hx1;
import defpackage.pf8;
import defpackage.xno;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import rx.exceptions.MissingBackpressureException;
import rx.internal.util.unsafe.SpscLinkedQueue;
import rx.internal.util.unsafe.UnsafeAccess;

/* JADX INFO: loaded from: classes3.dex */
public final class QueuedProducer<T> extends AtomicLong implements cbi, a6h<T> {
    static final Object NULL_SENTINEL = new Object();
    private static final long serialVersionUID = 7277121710709137047L;
    final xno<? super T> child;
    volatile boolean done;
    Throwable error;
    final Queue<Object> queue;
    final AtomicInteger wip;

    public QueuedProducer(xno<? super T> xnoVar) {
        this(xnoVar, UnsafeAccess.isUnsafeAvailable() ? new SpscLinkedQueue() : new d8o());
    }

    private boolean checkTerminated(boolean z, boolean z2) {
        if (this.child.isUnsubscribed()) {
            return true;
        }
        if (!z) {
            return false;
        }
        Throwable th = this.error;
        if (th != null) {
            this.queue.clear();
            this.child.onError(th);
            return true;
        }
        if (!z2) {
            return false;
        }
        this.child.onCompleted();
        return true;
    }

    private void drain() {
        if (this.wip.getAndIncrement() == 0) {
            xno<? super T> xnoVar = this.child;
            Queue<Object> queue = this.queue;
            while (!checkTerminated(this.done, queue.isEmpty())) {
                this.wip.lazySet(1);
                long j = get();
                long j2 = 0;
                while (j != 0) {
                    boolean z = this.done;
                    Object objPoll = queue.poll();
                    if (checkTerminated(z, objPoll == null)) {
                        return;
                    }
                    if (objPoll == null) {
                        break;
                    }
                    try {
                        if (objPoll == NULL_SENTINEL) {
                            xnoVar.onNext(null);
                        } else {
                            xnoVar.onNext(objPoll);
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

    @Override // defpackage.a6h
    public void onCompleted() {
        this.done = true;
        drain();
    }

    @Override // defpackage.a6h
    public void onError(Throwable th) {
        this.error = th;
        this.done = true;
        drain();
    }

    @Override // defpackage.a6h
    public void onNext(T t) {
        if (offer(t)) {
            return;
        }
        onError(new MissingBackpressureException());
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

    public QueuedProducer(xno<? super T> xnoVar, Queue<Object> queue) {
        this.child = xnoVar;
        this.queue = queue;
        this.wip = new AtomicInteger();
    }
}
