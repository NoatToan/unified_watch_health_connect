package rx.internal.producers;

import java.util.concurrent.atomic.AtomicInteger;
import rx.Producer;
import rx.Subscriber;
import rx.exceptions.Exceptions;

/* JADX INFO: loaded from: classes23.dex */
public final class SingleDelayedProducer<T> extends AtomicInteger implements Producer {
    public static final int c = 0;
    public static final int d = 1;
    public static final int e = 2;
    public static final int f = 3;
    private static final long serialVersionUID = -2873467947112093874L;
    public final Subscriber<? super T> a;
    public T b;

    public SingleDelayedProducer(Subscriber<? super T> subscriber) {
        this.a = subscriber;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <T> void a(Subscriber<? super T> subscriber, T t) {
        if (subscriber.isUnsubscribed()) {
            return;
        }
        try {
            subscriber.onNext(t);
            if (subscriber.isUnsubscribed()) {
                return;
            }
            subscriber.onCompleted();
        } catch (Throwable th) {
            Exceptions.throwOrReport(th, subscriber, t);
        }
    }

    @Override // rx.Producer
    public void request(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("n >= 0 required");
        }
        if (j == 0) {
            return;
        }
        do {
            int i = get();
            if (i != 0) {
                if (i == 1 && compareAndSet(1, 3)) {
                    a(this.a, this.b);
                    return;
                }
                return;
            }
        } while (!compareAndSet(0, 2));
    }

    public void setValue(T t) {
        do {
            int i = get();
            if (i != 0) {
                if (i == 2 && compareAndSet(2, 3)) {
                    a(this.a, t);
                    return;
                }
                return;
            }
            this.b = t;
        } while (!compareAndSet(0, 1));
    }
}
