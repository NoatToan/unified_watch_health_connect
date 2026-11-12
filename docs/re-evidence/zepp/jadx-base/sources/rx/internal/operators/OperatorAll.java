package rx.internal.operators;

import rx.Observable;
import rx.Subscriber;
import rx.exceptions.Exceptions;
import rx.functions.Func1;
import rx.internal.producers.SingleDelayedProducer;
import rx.plugins.RxJavaHooks;

/* JADX INFO: loaded from: classes23.dex */
public final class OperatorAll<T> implements Observable.Operator<Boolean, T> {
    public final Func1<? super T, Boolean> a;

    public class a extends Subscriber<T> {
        public boolean f;
        public final /* synthetic */ SingleDelayedProducer g;
        public final /* synthetic */ Subscriber h;

        public a(SingleDelayedProducer singleDelayedProducer, Subscriber subscriber) {
            this.g = singleDelayedProducer;
            this.h = subscriber;
        }

        @Override // rx.Observer
        public void onCompleted() {
            if (this.f) {
                return;
            }
            this.f = true;
            this.g.setValue(Boolean.TRUE);
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            if (this.f) {
                RxJavaHooks.onError(th);
            } else {
                this.f = true;
                this.h.onError(th);
            }
        }

        @Override // rx.Observer
        public void onNext(T t) {
            if (this.f) {
                return;
            }
            try {
                if (OperatorAll.this.a.call(t).booleanValue()) {
                    return;
                }
                this.f = true;
                this.g.setValue(Boolean.FALSE);
                unsubscribe();
            } catch (Throwable th) {
                Exceptions.throwOrReport(th, this, t);
            }
        }
    }

    public OperatorAll(Func1<? super T, Boolean> func1) {
        this.a = func1;
    }

    @Override // rx.functions.Func1
    public Subscriber<? super T> call(Subscriber<? super Boolean> subscriber) {
        SingleDelayedProducer singleDelayedProducer = new SingleDelayedProducer(subscriber);
        a aVar = new a(singleDelayedProducer, subscriber);
        subscriber.add(aVar);
        subscriber.setProducer(singleDelayedProducer);
        return aVar;
    }
}
