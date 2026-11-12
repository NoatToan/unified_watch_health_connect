package rx.internal.operators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import rx.Observable;
import rx.Subscriber;
import rx.exceptions.Exceptions;
import rx.functions.Func1;
import rx.observers.SerializedSubscriber;
import rx.subscriptions.CompositeSubscription;

/* JADX INFO: loaded from: classes23.dex */
public final class OperatorBufferWithStartEndObservable<T, TOpening, TClosing> implements Observable.Operator<List<T>, T> {
    public final Observable<? extends TOpening> a;
    public final Func1<? super TOpening, ? extends Observable<? extends TClosing>> b;

    public class a extends Subscriber<TOpening> {
        public final /* synthetic */ b f;

        public a(b bVar) {
            this.f = bVar;
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
        public void onNext(TOpening topening) {
            this.f.c(topening);
        }
    }

    public final class b extends Subscriber<T> {
        public final Subscriber<? super List<T>> f;
        public final List<List<T>> g = new LinkedList();
        public boolean h;
        public final CompositeSubscription i;

        public class a extends Subscriber<TClosing> {
            public final /* synthetic */ List f;

            public a(List list) {
                this.f = list;
            }

            @Override // rx.Observer
            public void onCompleted() {
                b.this.i.remove(this);
                b.this.b(this.f);
            }

            @Override // rx.Observer
            public void onError(Throwable th) {
                b.this.onError(th);
            }

            @Override // rx.Observer
            public void onNext(TClosing tclosing) {
                b.this.i.remove(this);
                b.this.b(this.f);
            }
        }

        public b(Subscriber<? super List<T>> subscriber) {
            this.f = subscriber;
            CompositeSubscription compositeSubscription = new CompositeSubscription();
            this.i = compositeSubscription;
            add(compositeSubscription);
        }

        public void b(List<T> list) {
            boolean z;
            synchronized (this) {
                if (this.h) {
                    return;
                }
                Iterator<List<T>> it2 = this.g.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        z = false;
                        break;
                    } else if (it2.next() == list) {
                        z = true;
                        it2.remove();
                        break;
                    }
                }
                if (z) {
                    this.f.onNext(list);
                }
            }
        }

        public void c(TOpening topening) {
            ArrayList arrayList = new ArrayList();
            synchronized (this) {
                if (this.h) {
                    return;
                }
                this.g.add(arrayList);
                try {
                    Observable<? extends TClosing> observableCall = OperatorBufferWithStartEndObservable.this.b.call(topening);
                    a aVar = new a(arrayList);
                    this.i.add(aVar);
                    observableCall.unsafeSubscribe(aVar);
                } catch (Throwable th) {
                    Exceptions.throwOrReport(th, this);
                }
            }
        }

        @Override // rx.Observer
        public void onCompleted() {
            try {
                synchronized (this) {
                    if (this.h) {
                        return;
                    }
                    this.h = true;
                    LinkedList linkedList = new LinkedList(this.g);
                    this.g.clear();
                    Iterator it2 = linkedList.iterator();
                    while (it2.hasNext()) {
                        this.f.onNext((List) it2.next());
                    }
                    this.f.onCompleted();
                    unsubscribe();
                }
            } catch (Throwable th) {
                Exceptions.throwOrReport(th, this.f);
            }
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            synchronized (this) {
                if (this.h) {
                    return;
                }
                this.h = true;
                this.g.clear();
                this.f.onError(th);
                unsubscribe();
            }
        }

        @Override // rx.Observer
        public void onNext(T t) {
            synchronized (this) {
                Iterator<List<T>> it2 = this.g.iterator();
                while (it2.hasNext()) {
                    it2.next().add(t);
                }
            }
        }
    }

    public OperatorBufferWithStartEndObservable(Observable<? extends TOpening> observable, Func1<? super TOpening, ? extends Observable<? extends TClosing>> func1) {
        this.a = observable;
        this.b = func1;
    }

    @Override // rx.functions.Func1
    public Subscriber<? super T> call(Subscriber<? super List<T>> subscriber) {
        b bVar = new b(new SerializedSubscriber(subscriber));
        a aVar = new a(bVar);
        subscriber.add(aVar);
        subscriber.add(bVar);
        this.a.unsafeSubscribe(aVar);
        return bVar;
    }
}
