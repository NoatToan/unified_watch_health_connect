package rx.internal.operators;

import java.util.concurrent.atomic.AtomicBoolean;
import rx.Observable;
import rx.Producer;
import rx.Subscriber;

/* JADX INFO: loaded from: classes23.dex */
public final class OperatorElementAt<T> implements Observable.Operator<T, T> {
    public final int a;
    public final boolean b;
    public final T c;

    public class a extends Subscriber<T> {
        private int f;
        public final /* synthetic */ Subscriber g;

        public a(Subscriber subscriber) {
            this.g = subscriber;
        }

        @Override // rx.Observer
        public void onCompleted() {
            int i = this.f;
            OperatorElementAt operatorElementAt = OperatorElementAt.this;
            if (i <= operatorElementAt.a) {
                if (operatorElementAt.b) {
                    this.g.onNext(operatorElementAt.c);
                    this.g.onCompleted();
                    return;
                }
                this.g.onError(new IndexOutOfBoundsException(OperatorElementAt.this.a + " is out of bounds"));
            }
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            this.g.onError(th);
        }

        @Override // rx.Observer
        public void onNext(T t) {
            int i = this.f;
            this.f = i + 1;
            if (i == OperatorElementAt.this.a) {
                this.g.onNext(t);
                this.g.onCompleted();
                unsubscribe();
            }
        }

        @Override // rx.Subscriber, rx.observers.AssertableSubscriber
        public void setProducer(Producer producer) {
            this.g.setProducer(new b(producer));
        }
    }

    public static class b extends AtomicBoolean implements Producer {
        private static final long serialVersionUID = 1;
        public final Producer a;

        public b(Producer producer) {
            this.a = producer;
        }

        @Override // rx.Producer
        public void request(long j) {
            if (j < 0) {
                throw new IllegalArgumentException("n >= 0 required");
            }
            if (j <= 0 || !compareAndSet(false, true)) {
                return;
            }
            this.a.request(Long.MAX_VALUE);
        }
    }

    public OperatorElementAt(int i) {
        this(i, null, false);
    }

    public OperatorElementAt(int i, T t) {
        this(i, t, true);
    }

    @Override // rx.functions.Func1
    public Subscriber<? super T> call(Subscriber<? super T> subscriber) {
        a aVar = new a(subscriber);
        subscriber.add(aVar);
        return aVar;
    }

    private OperatorElementAt(int i, T t, boolean z) {
        if (i >= 0) {
            this.a = i;
            this.c = t;
            this.b = z;
        } else {
            throw new IndexOutOfBoundsException(i + " is out of bounds");
        }
    }
}
