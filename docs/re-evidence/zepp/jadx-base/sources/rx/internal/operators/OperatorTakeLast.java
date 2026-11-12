package rx.internal.operators;

import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicLong;
import rx.Observable;
import rx.Producer;
import rx.Subscriber;
import rx.functions.Func1;

/* JADX INFO: loaded from: classes23.dex */
public final class OperatorTakeLast<T> implements Observable.Operator<T, T> {
    public final int a;

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
        public final AtomicLong g = new AtomicLong();
        public final ArrayDeque<Object> h = new ArrayDeque<>();
        public final int i;

        public b(Subscriber<? super T> subscriber, int i) {
            this.f = subscriber;
            this.i = i;
        }

        @Override // rx.functions.Func1
        public T call(Object obj) {
            return (T) NotificationLite.getValue(obj);
        }

        @Override // rx.Observer
        public void onCompleted() {
            BackpressureUtils.postCompleteDone(this.g, this.h, this.f, this);
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            this.h.clear();
            this.f.onError(th);
        }

        @Override // rx.Observer
        public void onNext(T t) {
            if (this.h.size() == this.i) {
                this.h.poll();
            }
            this.h.offer(NotificationLite.next(t));
        }

        public void requestMore(long j) {
            if (j > 0) {
                BackpressureUtils.postCompleteRequest(this.g, j, this.h, this.f, this);
            }
        }
    }

    public OperatorTakeLast(int i) {
        if (i < 0) {
            throw new IndexOutOfBoundsException("count cannot be negative");
        }
        this.a = i;
    }

    @Override // rx.functions.Func1
    public Subscriber<? super T> call(Subscriber<? super T> subscriber) {
        b bVar = new b(subscriber, this.a);
        subscriber.add(bVar);
        subscriber.setProducer(new a(bVar));
        return bVar;
    }
}
