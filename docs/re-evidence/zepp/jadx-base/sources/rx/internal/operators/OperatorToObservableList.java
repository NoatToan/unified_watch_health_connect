package rx.internal.operators;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import rx.Observable;
import rx.Subscriber;
import rx.exceptions.Exceptions;
import rx.internal.producers.SingleDelayedProducer;

/* JADX INFO: loaded from: classes23.dex */
public final class OperatorToObservableList<T> implements Observable.Operator<List<T>, T> {

    public class a extends Subscriber<T> {
        public boolean f;
        public List<T> g = new LinkedList();
        public final /* synthetic */ SingleDelayedProducer h;
        public final /* synthetic */ Subscriber i;

        public a(SingleDelayedProducer singleDelayedProducer, Subscriber subscriber) {
            this.h = singleDelayedProducer;
            this.i = subscriber;
        }

        @Override // rx.Observer
        public void onCompleted() {
            if (this.f) {
                return;
            }
            this.f = true;
            try {
                ArrayList arrayList = new ArrayList(this.g);
                this.g = null;
                this.h.setValue(arrayList);
            } catch (Throwable th) {
                Exceptions.throwOrReport(th, this);
            }
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            this.i.onError(th);
        }

        @Override // rx.Observer
        public void onNext(T t) {
            if (this.f) {
                return;
            }
            this.g.add(t);
        }

        @Override // rx.Subscriber, rx.observers.AssertableSubscriber
        public void onStart() {
            request(Long.MAX_VALUE);
        }
    }

    public static final class b {
        public static final OperatorToObservableList<Object> a = new OperatorToObservableList<>();
    }

    public static <T> OperatorToObservableList<T> instance() {
        return (OperatorToObservableList<T>) b.a;
    }

    @Override // rx.functions.Func1
    public Subscriber<? super T> call(Subscriber<? super List<T>> subscriber) {
        SingleDelayedProducer singleDelayedProducer = new SingleDelayedProducer(subscriber);
        a aVar = new a(singleDelayedProducer, subscriber);
        subscriber.add(aVar);
        subscriber.setProducer(singleDelayedProducer);
        return aVar;
    }
}
