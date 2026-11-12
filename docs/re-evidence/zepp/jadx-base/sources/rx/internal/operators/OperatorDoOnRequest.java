package rx.internal.operators;

import rx.Observable;
import rx.Producer;
import rx.Subscriber;
import rx.functions.Action1;

/* JADX INFO: loaded from: classes23.dex */
public class OperatorDoOnRequest<T> implements Observable.Operator<T, T> {
    public final Action1<? super Long> a;

    public class a implements Producer {
        public final /* synthetic */ b a;

        public a(b bVar) {
            this.a = bVar;
        }

        @Override // rx.Producer
        public void request(long j) {
            OperatorDoOnRequest.this.a.call(Long.valueOf(j));
            this.a.requestMore(j);
        }
    }

    public static final class b<T> extends Subscriber<T> {
        private final Subscriber<? super T> f;

        public b(Subscriber<? super T> subscriber) {
            this.f = subscriber;
            request(0L);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void requestMore(long j) {
            request(j);
        }

        @Override // rx.Observer
        public void onCompleted() {
            this.f.onCompleted();
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            this.f.onError(th);
        }

        @Override // rx.Observer
        public void onNext(T t) {
            this.f.onNext(t);
        }
    }

    public OperatorDoOnRequest(Action1<? super Long> action1) {
        this.a = action1;
    }

    @Override // rx.functions.Func1
    public Subscriber<? super T> call(Subscriber<? super T> subscriber) {
        b bVar = new b(subscriber);
        subscriber.setProducer(new a(bVar));
        subscriber.add(bVar);
        return bVar;
    }
}
