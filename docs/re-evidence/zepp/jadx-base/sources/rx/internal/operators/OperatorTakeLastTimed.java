package rx.internal.operators;

import java.util.ArrayDeque;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import rx.Observable;
import rx.Producer;
import rx.Scheduler;
import rx.Subscriber;
import rx.functions.Func1;

/* JADX INFO: loaded from: classes23.dex */
public final class OperatorTakeLastTimed<T> implements Observable.Operator<T, T> {
    public final long a;
    public final Scheduler b;
    public final int c;

    public class a implements Producer {
        public final /* synthetic */ b a;

        public a(b bVar) {
            this.a = bVar;
        }

        @Override // rx.Producer
        public void request(long j) {
            this.a.requestMore(j);
        }
    }

    public static final class b<T> extends Subscriber<T> implements Func1<Object, T> {
        public final Subscriber<? super T> f;
        public final long g;
        public final Scheduler h;
        public final int i;
        public final AtomicLong j = new AtomicLong();
        public final ArrayDeque<Object> k = new ArrayDeque<>();
        public final ArrayDeque<Long> l = new ArrayDeque<>();

        public b(Subscriber<? super T> subscriber, int i, long j, Scheduler scheduler) {
            this.f = subscriber;
            this.i = i;
            this.g = j;
            this.h = scheduler;
        }

        public void b(long j) {
            long j2 = j - this.g;
            while (true) {
                Long lPeek = this.l.peek();
                if (lPeek == null || lPeek.longValue() >= j2) {
                    return;
                }
                this.k.poll();
                this.l.poll();
            }
        }

        @Override // rx.functions.Func1
        public T call(Object obj) {
            return (T) NotificationLite.getValue(obj);
        }

        @Override // rx.Observer
        public void onCompleted() {
            b(this.h.now());
            this.l.clear();
            BackpressureUtils.postCompleteDone(this.j, this.k, this.f, this);
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            this.k.clear();
            this.l.clear();
            this.f.onError(th);
        }

        @Override // rx.Observer
        public void onNext(T t) {
            if (this.i != 0) {
                long jNow = this.h.now();
                if (this.k.size() == this.i) {
                    this.k.poll();
                    this.l.poll();
                }
                b(jNow);
                this.k.offer(NotificationLite.next(t));
                this.l.offer(Long.valueOf(jNow));
            }
        }

        public void requestMore(long j) {
            BackpressureUtils.postCompleteRequest(this.j, j, this.k, this.f, this);
        }
    }

    public OperatorTakeLastTimed(long j, TimeUnit timeUnit, Scheduler scheduler) {
        this.a = timeUnit.toMillis(j);
        this.b = scheduler;
        this.c = -1;
    }

    @Override // rx.functions.Func1
    public Subscriber<? super T> call(Subscriber<? super T> subscriber) {
        b bVar = new b(subscriber, this.c, this.a, this.b);
        subscriber.add(bVar);
        subscriber.setProducer(new a(bVar));
        return bVar;
    }

    public OperatorTakeLastTimed(int i, long j, TimeUnit timeUnit, Scheduler scheduler) {
        if (i >= 0) {
            this.a = timeUnit.toMillis(j);
            this.b = scheduler;
            this.c = i;
            return;
        }
        throw new IndexOutOfBoundsException("count could not be negative");
    }
}
