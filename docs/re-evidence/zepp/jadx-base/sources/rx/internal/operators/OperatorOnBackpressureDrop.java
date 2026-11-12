package rx.internal.operators;

import java.util.concurrent.atomic.AtomicLong;
import rx.Observable;
import rx.Producer;
import rx.Subscriber;
import rx.exceptions.Exceptions;
import rx.functions.Action1;
import rx.plugins.RxJavaHooks;

/* JADX INFO: loaded from: classes23.dex */
public class OperatorOnBackpressureDrop<T> implements Observable.Operator<T, T> {
    public final Action1<? super T> a;

    public class a implements Producer {
        public final /* synthetic */ AtomicLong a;

        public a(AtomicLong atomicLong) {
            this.a = atomicLong;
        }

        @Override // rx.Producer
        public void request(long j) {
            BackpressureUtils.getAndAddRequest(this.a, j);
        }
    }

    public class b extends Subscriber<T> {
        public boolean f;
        public final /* synthetic */ Subscriber g;
        public final /* synthetic */ AtomicLong h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Subscriber subscriber, Subscriber subscriber2, AtomicLong atomicLong) {
            super(subscriber);
            this.g = subscriber2;
            this.h = atomicLong;
        }

        @Override // rx.Observer
        public void onCompleted() {
            if (this.f) {
                return;
            }
            this.f = true;
            this.g.onCompleted();
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            if (this.f) {
                RxJavaHooks.onError(th);
            } else {
                this.f = true;
                this.g.onError(th);
            }
        }

        @Override // rx.Observer
        public void onNext(T t) {
            if (this.f) {
                return;
            }
            if (this.h.get() > 0) {
                this.g.onNext(t);
                this.h.decrementAndGet();
                return;
            }
            Action1<? super T> action1 = OperatorOnBackpressureDrop.this.a;
            if (action1 != null) {
                try {
                    action1.call(t);
                } catch (Throwable th) {
                    Exceptions.throwOrReport(th, this, t);
                }
            }
        }

        @Override // rx.Subscriber, rx.observers.AssertableSubscriber
        public void onStart() {
            request(Long.MAX_VALUE);
        }
    }

    public static final class c {
        public static final OperatorOnBackpressureDrop<Object> a = new OperatorOnBackpressureDrop<>();
    }

    public OperatorOnBackpressureDrop() {
        this(null);
    }

    public static <T> OperatorOnBackpressureDrop<T> instance() {
        return (OperatorOnBackpressureDrop<T>) c.a;
    }

    public OperatorOnBackpressureDrop(Action1<? super T> action1) {
        this.a = action1;
    }

    @Override // rx.functions.Func1
    public Subscriber<? super T> call(Subscriber<? super T> subscriber) {
        AtomicLong atomicLong = new AtomicLong();
        subscriber.setProducer(new a(atomicLong));
        return new b(subscriber, subscriber, atomicLong);
    }
}
