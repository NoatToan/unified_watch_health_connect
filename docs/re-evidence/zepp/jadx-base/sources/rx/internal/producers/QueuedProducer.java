package rx.internal.producers;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import rx.Observer;
import rx.Producer;
import rx.Subscriber;
import rx.exceptions.Exceptions;
import rx.exceptions.MissingBackpressureException;
import rx.internal.operators.BackpressureUtils;
import rx.internal.util.atomic.SpscLinkedAtomicQueue;
import rx.internal.util.unsafe.SpscLinkedQueue;
import rx.internal.util.unsafe.UnsafeAccess;

/* JADX INFO: loaded from: classes23.dex */
public final class QueuedProducer<T> extends AtomicLong implements Producer, Observer<T> {
    public static final Object f = new Object();
    private static final long serialVersionUID = 7277121710709137047L;
    public final Subscriber<? super T> a;
    public final Queue<Object> b;
    public final AtomicInteger c;
    public Throwable d;
    public volatile boolean e;

    public QueuedProducer(Subscriber<? super T> subscriber) {
        this(subscriber, UnsafeAccess.isUnsafeAvailable() ? new SpscLinkedQueue() : new SpscLinkedAtomicQueue());
    }

    private boolean a(boolean z, boolean z2) {
        if (this.a.isUnsubscribed()) {
            return true;
        }
        if (!z) {
            return false;
        }
        Throwable th = this.d;
        if (th != null) {
            this.b.clear();
            this.a.onError(th);
            return true;
        }
        if (!z2) {
            return false;
        }
        this.a.onCompleted();
        return true;
    }

    private void b() {
        if (this.c.getAndIncrement() == 0) {
            Subscriber<? super T> subscriber = this.a;
            Queue<Object> queue = this.b;
            while (!a(this.e, queue.isEmpty())) {
                this.c.lazySet(1);
                long j = get();
                long j2 = 0;
                while (j != 0) {
                    boolean z = this.e;
                    Object objPoll = queue.poll();
                    if (a(z, objPoll == null)) {
                        return;
                    }
                    if (objPoll == null) {
                        break;
                    }
                    try {
                        if (objPoll == f) {
                            subscriber.onNext(null);
                        } else {
                            subscriber.onNext(objPoll);
                        }
                        j--;
                        j2++;
                    } catch (Throwable th) {
                        if (objPoll == f) {
                            objPoll = null;
                        }
                        Exceptions.throwOrReport(th, subscriber, objPoll);
                        return;
                    }
                }
                if (j2 != 0 && get() != Long.MAX_VALUE) {
                    addAndGet(-j2);
                }
                if (this.c.decrementAndGet() == 0) {
                    return;
                }
            }
        }
    }

    public boolean offer(T t) {
        if (t == null) {
            if (!this.b.offer(f)) {
                return false;
            }
        } else if (!this.b.offer(t)) {
            return false;
        }
        b();
        return true;
    }

    @Override // rx.Observer
    public void onCompleted() {
        this.e = true;
        b();
    }

    @Override // rx.Observer
    public void onError(Throwable th) {
        this.d = th;
        this.e = true;
        b();
    }

    @Override // rx.Observer
    public void onNext(T t) {
        if (offer(t)) {
            return;
        }
        onError(new MissingBackpressureException());
    }

    @Override // rx.Producer
    public void request(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("n >= 0 required");
        }
        if (j > 0) {
            BackpressureUtils.getAndAddRequest(this, j);
            b();
        }
    }

    public QueuedProducer(Subscriber<? super T> subscriber, Queue<Object> queue) {
        this.a = subscriber;
        this.b = queue;
        this.c = new AtomicInteger();
    }
}
