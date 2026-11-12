package rx.internal.operators;

import java.util.concurrent.atomic.AtomicLong;
import rx.Observable;
import rx.Producer;
import rx.Subscriber;

/* JADX INFO: loaded from: classes23.dex */
public final class OnSubscribeRange implements Observable.OnSubscribe<Integer> {
    private final int a;
    private final int b;

    public static final class a extends AtomicLong implements Producer {
        private static final long serialVersionUID = 4114392207069098388L;
        private final Subscriber<? super Integer> a;
        private final int b;
        private long c;

        public a(Subscriber<? super Integer> subscriber, int i, int i2) {
            this.a = subscriber;
            this.c = i;
            this.b = i2;
        }

        public void a() {
            long j = ((long) this.b) + 1;
            Subscriber<? super Integer> subscriber = this.a;
            for (long j2 = this.c; j2 != j; j2++) {
                if (subscriber.isUnsubscribed()) {
                    return;
                }
                subscriber.onNext(Integer.valueOf((int) j2));
            }
            if (subscriber.isUnsubscribed()) {
                return;
            }
            subscriber.onCompleted();
        }

        public void b(long j) {
            long j2 = ((long) this.b) + 1;
            long j3 = this.c;
            Subscriber<? super Integer> subscriber = this.a;
            do {
                long j4 = 0;
                while (true) {
                    if (j4 == j || j3 == j2) {
                        if (subscriber.isUnsubscribed()) {
                            return;
                        }
                        if (j3 == j2) {
                            subscriber.onCompleted();
                            return;
                        } else {
                            j = get();
                            if (j == j4) {
                                break;
                            }
                        }
                    } else {
                        if (subscriber.isUnsubscribed()) {
                            return;
                        }
                        subscriber.onNext(Integer.valueOf((int) j3));
                        j3++;
                        j4++;
                    }
                }
                this.c = j3;
                j = addAndGet(-j4);
            } while (j != 0);
        }

        @Override // rx.Producer
        public void request(long j) {
            if (get() == Long.MAX_VALUE) {
                return;
            }
            if (j == Long.MAX_VALUE && compareAndSet(0L, Long.MAX_VALUE)) {
                a();
            } else {
                if (j <= 0 || BackpressureUtils.getAndAddRequest(this, j) != 0) {
                    return;
                }
                b(j);
            }
        }
    }

    public OnSubscribeRange(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // rx.functions.Action1
    public void call(Subscriber<? super Integer> subscriber) {
        subscriber.setProducer(new a(subscriber, this.a, this.b));
    }
}
