package rx.internal.operators;

import rx.Observable;
import rx.Producer;
import rx.Subscriber;
import rx.exceptions.Exceptions;
import rx.functions.Func1;

/* JADX INFO: loaded from: classes23.dex */
public final class OperatorTakeUntilPredicate<T> implements Observable.Operator<T, T> {
    public final Func1<? super T, Boolean> a;

    public class a implements Producer {
        public final /* synthetic */ b a;

        public a(b bVar) {
            this.a = bVar;
        }

        @Override // rx.Producer
        public void request(long j) {
            this.a.b(j);
        }
    }

    public final class b extends Subscriber<T> {
        private final Subscriber<? super T> f;
        private boolean g;

        public b(Subscriber<? super T> subscriber) {
            this.f = subscriber;
        }

        public void b(long j) {
            request(j);
        }

        @Override // rx.Observer
        public void onCompleted() {
            if (this.g) {
                return;
            }
            this.f.onCompleted();
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            if (this.g) {
                return;
            }
            this.f.onError(th);
        }

        @Override // rx.Observer
        public void onNext(T t) {
            this.f.onNext(t);
            try {
                if (OperatorTakeUntilPredicate.this.a.call(t).booleanValue()) {
                    this.g = true;
                    this.f.onCompleted();
                    unsubscribe();
                }
            } catch (Throwable th) {
                this.g = true;
                Exceptions.throwOrReport(th, this.f, t);
                unsubscribe();
            }
        }
    }

    public OperatorTakeUntilPredicate(Func1<? super T, Boolean> func1) {
        this.a = func1;
    }

    @Override // rx.functions.Func1
    public Subscriber<? super T> call(Subscriber<? super T> subscriber) {
        b bVar = new b(subscriber);
        subscriber.add(bVar);
        subscriber.setProducer(new a(bVar));
        return bVar;
    }
}
