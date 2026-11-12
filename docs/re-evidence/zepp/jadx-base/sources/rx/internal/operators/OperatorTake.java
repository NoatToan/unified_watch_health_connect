package rx.internal.operators;

import java.util.concurrent.atomic.AtomicLong;
import rx.Observable;
import rx.Producer;
import rx.Subscriber;

/* JADX INFO: loaded from: classes23.dex */
public final class OperatorTake<T> implements Observable.Operator<T, T> {
    public final int a;

    public class a extends Subscriber<T> {
        public int f;
        public boolean g;
        public final /* synthetic */ Subscriber h;

        /* JADX INFO: renamed from: rx.internal.operators.OperatorTake$a$a, reason: collision with other inner class name */
        public class C1250a implements Producer {
            public final AtomicLong a = new AtomicLong(0);
            public final /* synthetic */ Producer b;

            public C1250a(Producer producer) {
                this.b = producer;
            }

            @Override // rx.Producer
            public void request(long j) {
                long j2;
                long jMin;
                if (j <= 0 || a.this.g) {
                    return;
                }
                do {
                    j2 = this.a.get();
                    jMin = Math.min(j, ((long) OperatorTake.this.a) - j2);
                    if (jMin == 0) {
                        return;
                    }
                } while (!this.a.compareAndSet(j2, j2 + jMin));
                this.b.request(jMin);
            }
        }

        public a(Subscriber subscriber) {
            this.h = subscriber;
        }

        @Override // rx.Observer
        public void onCompleted() {
            if (this.g) {
                return;
            }
            this.g = true;
            this.h.onCompleted();
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            if (this.g) {
                return;
            }
            this.g = true;
            try {
                this.h.onError(th);
            } finally {
                unsubscribe();
            }
        }

        @Override // rx.Observer
        public void onNext(T t) {
            if (isUnsubscribed()) {
                return;
            }
            int i = this.f;
            int i2 = i + 1;
            this.f = i2;
            int i3 = OperatorTake.this.a;
            if (i < i3) {
                boolean z = i2 == i3;
                this.h.onNext(t);
                if (!z || this.g) {
                    return;
                }
                this.g = true;
                try {
                    this.h.onCompleted();
                } finally {
                    unsubscribe();
                }
            }
        }

        @Override // rx.Subscriber, rx.observers.AssertableSubscriber
        public void setProducer(Producer producer) {
            this.h.setProducer(new C1250a(producer));
        }
    }

    public OperatorTake(int i) {
        if (i >= 0) {
            this.a = i;
            return;
        }
        throw new IllegalArgumentException("limit >= 0 required but it was " + i);
    }

    @Override // rx.functions.Func1
    public Subscriber<? super T> call(Subscriber<? super T> subscriber) {
        a aVar = new a(subscriber);
        if (this.a == 0) {
            subscriber.onCompleted();
            aVar.unsubscribe();
        }
        subscriber.add(aVar);
        return aVar;
    }
}
