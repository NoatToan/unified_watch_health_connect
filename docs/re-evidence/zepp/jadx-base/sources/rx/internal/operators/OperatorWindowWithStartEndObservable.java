package rx.internal.operators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import rx.Observable;
import rx.Observer;
import rx.Subscriber;
import rx.functions.Func1;
import rx.observers.SerializedObserver;
import rx.observers.SerializedSubscriber;
import rx.subjects.UnicastSubject;
import rx.subscriptions.CompositeSubscription;

/* JADX INFO: loaded from: classes23.dex */
public final class OperatorWindowWithStartEndObservable<T, U, V> implements Observable.Operator<Observable<T>, T> {
    public final Observable<? extends U> a;
    public final Func1<? super U, ? extends Observable<? extends V>> b;

    public class a extends Subscriber<U> {
        public final /* synthetic */ c f;

        public a(c cVar) {
            this.f = cVar;
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
        public void onNext(U u) {
            this.f.b(u);
        }

        @Override // rx.Subscriber, rx.observers.AssertableSubscriber
        public void onStart() {
            request(Long.MAX_VALUE);
        }
    }

    public static final class b<T> {
        public final Observer<T> a;
        public final Observable<T> b;

        public b(Observer<T> observer, Observable<T> observable) {
            this.a = new SerializedObserver(observer);
            this.b = observable;
        }
    }

    public final class c extends Subscriber<T> {
        public final Subscriber<? super Observable<T>> f;
        public final CompositeSubscription g;
        public final Object h = new Object();
        public final List<b<T>> i = new LinkedList();
        public boolean j;

        public class a extends Subscriber<V> {
            public boolean f = true;
            public final /* synthetic */ b g;

            public a(b bVar) {
                this.g = bVar;
            }

            @Override // rx.Observer
            public void onCompleted() {
                if (this.f) {
                    this.f = false;
                    c.this.d(this.g);
                    c.this.g.remove(this);
                }
            }

            @Override // rx.Observer
            public void onError(Throwable th) {
                c.this.onError(th);
            }

            @Override // rx.Observer
            public void onNext(V v) {
                onCompleted();
            }
        }

        public c(Subscriber<? super Observable<T>> subscriber, CompositeSubscription compositeSubscription) {
            this.f = new SerializedSubscriber(subscriber);
            this.g = compositeSubscription;
        }

        public void b(U u) {
            b<T> bVarC = c();
            synchronized (this.h) {
                if (this.j) {
                    return;
                }
                this.i.add(bVarC);
                this.f.onNext(bVarC.b);
                try {
                    Observable<? extends V> observableCall = OperatorWindowWithStartEndObservable.this.b.call(u);
                    a aVar = new a(bVarC);
                    this.g.add(aVar);
                    observableCall.unsafeSubscribe(aVar);
                } catch (Throwable th) {
                    onError(th);
                }
            }
        }

        public b<T> c() {
            UnicastSubject unicastSubjectCreate = UnicastSubject.create();
            return new b<>(unicastSubjectCreate, unicastSubjectCreate);
        }

        public void d(b<T> bVar) {
            boolean z;
            synchronized (this.h) {
                if (this.j) {
                    return;
                }
                Iterator<b<T>> it2 = this.i.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        z = false;
                        break;
                    } else if (it2.next() == bVar) {
                        z = true;
                        it2.remove();
                        break;
                    }
                }
                if (z) {
                    bVar.a.onCompleted();
                }
            }
        }

        @Override // rx.Observer
        public void onCompleted() {
            try {
                synchronized (this.h) {
                    if (this.j) {
                        this.g.unsubscribe();
                        return;
                    }
                    this.j = true;
                    ArrayList arrayList = new ArrayList(this.i);
                    this.i.clear();
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        ((b) it2.next()).a.onCompleted();
                    }
                    this.f.onCompleted();
                    this.g.unsubscribe();
                }
            } catch (Throwable th) {
                this.g.unsubscribe();
                throw th;
            }
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            try {
                synchronized (this.h) {
                    if (this.j) {
                        this.g.unsubscribe();
                        return;
                    }
                    this.j = true;
                    ArrayList arrayList = new ArrayList(this.i);
                    this.i.clear();
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        ((b) it2.next()).a.onError(th);
                    }
                    this.f.onError(th);
                    this.g.unsubscribe();
                }
            } catch (Throwable th2) {
                this.g.unsubscribe();
                throw th2;
            }
        }

        @Override // rx.Observer
        public void onNext(T t) {
            synchronized (this.h) {
                if (this.j) {
                    return;
                }
                Iterator it2 = new ArrayList(this.i).iterator();
                while (it2.hasNext()) {
                    ((b) it2.next()).a.onNext(t);
                }
            }
        }

        @Override // rx.Subscriber, rx.observers.AssertableSubscriber
        public void onStart() {
            request(Long.MAX_VALUE);
        }
    }

    public OperatorWindowWithStartEndObservable(Observable<? extends U> observable, Func1<? super U, ? extends Observable<? extends V>> func1) {
        this.a = observable;
        this.b = func1;
    }

    @Override // rx.functions.Func1
    public Subscriber<? super T> call(Subscriber<? super Observable<T>> subscriber) {
        CompositeSubscription compositeSubscription = new CompositeSubscription();
        subscriber.add(compositeSubscription);
        c cVar = new c(subscriber, compositeSubscription);
        a aVar = new a(cVar);
        compositeSubscription.add(cVar);
        compositeSubscription.add(aVar);
        this.a.unsafeSubscribe(aVar);
        return cVar;
    }
}
