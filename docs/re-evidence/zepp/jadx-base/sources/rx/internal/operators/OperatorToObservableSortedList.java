package rx.internal.operators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import rx.Observable;
import rx.Subscriber;
import rx.exceptions.Exceptions;
import rx.functions.Func2;
import rx.internal.producers.SingleDelayedProducer;

/* JADX INFO: loaded from: classes23.dex */
public final class OperatorToObservableSortedList<T> implements Observable.Operator<List<T>, T> {
    private static final Comparator c = new c();
    public final Comparator<? super T> a;
    public final int b;

    public class a implements Comparator<T> {
        public final /* synthetic */ Func2 a;

        public a(Func2 func2) {
            this.a = func2;
        }

        @Override // java.util.Comparator
        public int compare(T t, T t2) {
            return ((Integer) this.a.call(t, t2)).intValue();
        }
    }

    public class b extends Subscriber<T> {
        public List<T> f;
        public boolean g;
        public final /* synthetic */ SingleDelayedProducer h;
        public final /* synthetic */ Subscriber i;

        public b(SingleDelayedProducer singleDelayedProducer, Subscriber subscriber) {
            this.h = singleDelayedProducer;
            this.i = subscriber;
            this.f = new ArrayList(OperatorToObservableSortedList.this.b);
        }

        @Override // rx.Observer
        public void onCompleted() {
            if (this.g) {
                return;
            }
            this.g = true;
            List<T> list = this.f;
            this.f = null;
            try {
                Collections.sort(list, OperatorToObservableSortedList.this.a);
                this.h.setValue(list);
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
            if (this.g) {
                return;
            }
            this.f.add(t);
        }

        @Override // rx.Subscriber, rx.observers.AssertableSubscriber
        public void onStart() {
            request(Long.MAX_VALUE);
        }
    }

    public static final class c implements Comparator<Object> {
        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            return ((Comparable) obj).compareTo((Comparable) obj2);
        }
    }

    public OperatorToObservableSortedList(int i) {
        this.a = c;
        this.b = i;
    }

    @Override // rx.functions.Func1
    public Subscriber<? super T> call(Subscriber<? super List<T>> subscriber) {
        SingleDelayedProducer singleDelayedProducer = new SingleDelayedProducer(subscriber);
        b bVar = new b(singleDelayedProducer, subscriber);
        subscriber.add(bVar);
        subscriber.setProducer(singleDelayedProducer);
        return bVar;
    }

    public OperatorToObservableSortedList(Func2<? super T, ? super T, Integer> func2, int i) {
        this.b = i;
        this.a = new a(func2);
    }
}
