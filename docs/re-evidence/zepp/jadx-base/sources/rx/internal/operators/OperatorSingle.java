package rx.internal.operators;

import java.util.NoSuchElementException;
import rx.Observable;
import rx.Subscriber;
import rx.internal.producers.SingleProducer;
import rx.plugins.RxJavaHooks;

/* JADX INFO: loaded from: classes23.dex */
public final class OperatorSingle<T> implements Observable.Operator<T, T> {
    private final boolean a;
    private final T b;

    public static final class a {
        public static final OperatorSingle<?> a = new OperatorSingle<>();
    }

    public static final class b<T> extends Subscriber<T> {
        private final Subscriber<? super T> f;
        private final boolean g;
        private final T h;
        private T i;
        private boolean j;
        private boolean k;

        public b(Subscriber<? super T> subscriber, boolean z, T t) {
            this.f = subscriber;
            this.g = z;
            this.h = t;
            request(2L);
        }

        @Override // rx.Observer
        public void onCompleted() {
            if (this.k) {
                return;
            }
            if (this.j) {
                this.f.setProducer(new SingleProducer(this.f, this.i));
            } else if (this.g) {
                this.f.setProducer(new SingleProducer(this.f, this.h));
            } else {
                this.f.onError(new NoSuchElementException("Sequence contains no elements"));
            }
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            if (this.k) {
                RxJavaHooks.onError(th);
            } else {
                this.f.onError(th);
            }
        }

        @Override // rx.Observer
        public void onNext(T t) {
            if (this.k) {
                return;
            }
            if (!this.j) {
                this.i = t;
                this.j = true;
            } else {
                this.k = true;
                this.f.onError(new IllegalArgumentException("Sequence contains too many elements"));
                unsubscribe();
            }
        }
    }

    public OperatorSingle() {
        this(false, null);
    }

    public static <T> OperatorSingle<T> instance() {
        return (OperatorSingle<T>) a.a;
    }

    public OperatorSingle(T t) {
        this(true, t);
    }

    @Override // rx.functions.Func1
    public Subscriber<? super T> call(Subscriber<? super T> subscriber) {
        b bVar = new b(subscriber, this.a, this.b);
        subscriber.add(bVar);
        return bVar;
    }

    private OperatorSingle(boolean z, T t) {
        this.a = z;
        this.b = t;
    }
}
