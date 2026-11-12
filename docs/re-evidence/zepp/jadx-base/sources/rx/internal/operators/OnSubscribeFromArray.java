package rx.internal.operators;

import defpackage.a05;
import java.util.concurrent.atomic.AtomicLong;
import rx.Observable;
import rx.Producer;
import rx.Subscriber;

/* JADX INFO: loaded from: classes23.dex */
public final class OnSubscribeFromArray<T> implements Observable.OnSubscribe<T> {
    public final T[] a;

    public static final class a<T> extends AtomicLong implements Producer {
        private static final long serialVersionUID = 3534218984725836979L;
        public final Subscriber<? super T> a;
        public final T[] b;
        public int c;

        public a(Subscriber<? super T> subscriber, T[] tArr) {
            this.a = subscriber;
            this.b = tArr;
        }

        public void a() {
            Subscriber<? super T> subscriber = this.a;
            for (a05 a05Var : this.b) {
                if (subscriber.isUnsubscribed()) {
                    return;
                }
                subscriber.onNext(a05Var);
            }
            if (subscriber.isUnsubscribed()) {
                return;
            }
            subscriber.onCompleted();
        }

        public void b(long j) {
            Subscriber<? super T> subscriber = this.a;
            T[] tArr = this.b;
            int length = tArr.length;
            int i = this.c;
            do {
                long j2 = 0;
                while (true) {
                    if (j == 0 || i == length) {
                        j = get() + j2;
                        if (j == 0) {
                            break;
                        }
                    } else {
                        if (subscriber.isUnsubscribed()) {
                            return;
                        }
                        subscriber.onNext(tArr[i]);
                        i++;
                        if (i == length) {
                            if (subscriber.isUnsubscribed()) {
                                return;
                            }
                            subscriber.onCompleted();
                            return;
                        }
                        j--;
                        j2--;
                    }
                }
                this.c = i;
                j = addAndGet(j2);
            } while (j != 0);
        }

        @Override // rx.Producer
        public void request(long j) {
            if (j < 0) {
                throw new IllegalArgumentException("n >= 0 required but it was " + j);
            }
            if (j == Long.MAX_VALUE) {
                if (BackpressureUtils.getAndAddRequest(this, j) == 0) {
                    a();
                }
            } else {
                if (j == 0 || BackpressureUtils.getAndAddRequest(this, j) != 0) {
                    return;
                }
                b(j);
            }
        }
    }

    public OnSubscribeFromArray(T[] tArr) {
        this.a = tArr;
    }

    @Override // rx.functions.Action1
    public void call(Subscriber<? super T> subscriber) {
        subscriber.setProducer(new a(subscriber, this.a));
    }
}
