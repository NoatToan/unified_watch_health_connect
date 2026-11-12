package rx.internal.operators;

import rx.Observable;
import rx.Subscriber;
import rx.exceptions.Exceptions;
import rx.functions.Func1;
import rx.internal.producers.SingleDelayedProducer;
import rx.plugins.RxJavaHooks;

/* JADX INFO: loaded from: classes23.dex */
public final class OperatorAny<T> implements Observable.Operator<Boolean, T> {
    public final Func1<? super T, Boolean> a;
    public final boolean b;

    public class a extends Subscriber<T> {
        public boolean f;
        public boolean g;
        public final /* synthetic */ SingleDelayedProducer h;
        public final /* synthetic */ Subscriber i;

        public a(SingleDelayedProducer singleDelayedProducer, Subscriber subscriber) {
            this.h = singleDelayedProducer;
            this.i = subscriber;
        }

        @Override // rx.Observer
        public void onCompleted() {
            if (this.g) {
                return;
            }
            this.g = true;
            if (this.f) {
                this.h.setValue(Boolean.FALSE);
            } else {
                this.h.setValue(Boolean.valueOf(OperatorAny.this.b));
            }
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            if (this.g) {
                RxJavaHooks.onError(th);
            } else {
                this.g = true;
                this.i.onError(th);
            }
        }

        @Override // rx.Observer
        public void onNext(T t) {
            if (this.g) {
                return;
            }
            this.f = true;
            try {
                if (OperatorAny.this.a.call(t).booleanValue()) {
                    this.g = true;
                    this.h.setValue(Boolean.valueOf(true ^ OperatorAny.this.b));
                    unsubscribe();
                }
            } catch (Throwable th) {
                Exceptions.throwOrReport(th, this, t);
            }
        }
    }

    public OperatorAny(Func1<? super T, Boolean> func1, boolean z) {
        this.a = func1;
        this.b = z;
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
