package rx.internal.operators;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import rx.Observable;
import rx.Observer;
import rx.Subscriber;
import rx.Subscription;
import rx.exceptions.Exceptions;
import rx.functions.Func1;
import rx.functions.Func2;
import rx.observers.SerializedObserver;
import rx.observers.SerializedSubscriber;
import rx.subjects.PublishSubject;
import rx.subscriptions.CompositeSubscription;
import rx.subscriptions.RefCountSubscription;

/* JADX INFO: loaded from: classes23.dex */
public final class OnSubscribeGroupJoin<T1, T2, D1, D2, R> implements Observable.OnSubscribe<R> {
    public final Observable<T1> a;
    public final Observable<T2> b;
    public final Func1<? super T1, ? extends Observable<D1>> c;
    public final Func1<? super T2, ? extends Observable<D2>> d;
    public final Func2<? super T1, ? super Observable<T2>, ? extends R> e;

    public final class a extends HashMap<Integer, Observer<T2>> implements Subscription {
        private static final long serialVersionUID = -3035156013812425335L;
        public final RefCountSubscription a;
        public final Subscriber<? super R> b;
        public final CompositeSubscription c;
        public int d;
        public int e;
        public final Map<Integer, T2> f = new HashMap();
        public boolean g;
        public boolean h;

        /* JADX INFO: renamed from: rx.internal.operators.OnSubscribeGroupJoin$a$a, reason: collision with other inner class name */
        public final class C1233a extends Subscriber<D1> {
            public final int f;
            public boolean g = true;

            public C1233a(int i) {
                this.f = i;
            }

            @Override // rx.Observer
            public void onCompleted() {
                Observer<T2> observerRemove;
                if (this.g) {
                    this.g = false;
                    synchronized (a.this) {
                        observerRemove = a.this.g().remove(Integer.valueOf(this.f));
                    }
                    if (observerRemove != null) {
                        observerRemove.onCompleted();
                    }
                    a.this.c.remove(this);
                }
            }

            @Override // rx.Observer
            public void onError(Throwable th) {
                a.this.e(th);
            }

            @Override // rx.Observer
            public void onNext(D1 d1) {
                onCompleted();
            }
        }

        public final class b extends Subscriber<T1> {
            public b() {
            }

            @Override // rx.Observer
            public void onCompleted() {
                ArrayList arrayList;
                synchronized (a.this) {
                    a aVar = a.this;
                    aVar.g = true;
                    if (aVar.h) {
                        arrayList = new ArrayList(a.this.g().values());
                        a.this.g().clear();
                        a.this.f.clear();
                    } else {
                        arrayList = null;
                    }
                }
                a.this.a(arrayList);
            }

            @Override // rx.Observer
            public void onError(Throwable th) {
                a.this.c(th);
            }

            @Override // rx.Observer
            public void onNext(T1 t1) {
                int i;
                ArrayList arrayList;
                try {
                    PublishSubject publishSubjectCreate = PublishSubject.create();
                    SerializedObserver serializedObserver = new SerializedObserver(publishSubjectCreate);
                    synchronized (a.this) {
                        a aVar = a.this;
                        i = aVar.d;
                        aVar.d = i + 1;
                        aVar.g().put(Integer.valueOf(i), serializedObserver);
                    }
                    Observable observableUnsafeCreate = Observable.unsafeCreate(new b(publishSubjectCreate, a.this.a));
                    Observable<D1> observableCall = OnSubscribeGroupJoin.this.c.call(t1);
                    C1233a c1233a = a.this.new C1233a(i);
                    a.this.c.add(c1233a);
                    observableCall.unsafeSubscribe(c1233a);
                    R rCall = OnSubscribeGroupJoin.this.e.call(t1, observableUnsafeCreate);
                    synchronized (a.this) {
                        arrayList = new ArrayList(a.this.f.values());
                    }
                    a.this.b.onNext(rCall);
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        serializedObserver.onNext(it2.next());
                    }
                } catch (Throwable th) {
                    Exceptions.throwOrReport(th, this);
                }
            }
        }

        public final class c extends Subscriber<D2> {
            public final int f;
            public boolean g = true;

            public c(int i) {
                this.f = i;
            }

            @Override // rx.Observer
            public void onCompleted() {
                if (this.g) {
                    this.g = false;
                    synchronized (a.this) {
                        a.this.f.remove(Integer.valueOf(this.f));
                    }
                    a.this.c.remove(this);
                }
            }

            @Override // rx.Observer
            public void onError(Throwable th) {
                a.this.e(th);
            }

            @Override // rx.Observer
            public void onNext(D2 d2) {
                onCompleted();
            }
        }

        public final class d extends Subscriber<T2> {
            public d() {
            }

            @Override // rx.Observer
            public void onCompleted() {
                ArrayList arrayList;
                synchronized (a.this) {
                    a aVar = a.this;
                    aVar.h = true;
                    if (aVar.g) {
                        arrayList = new ArrayList(a.this.g().values());
                        a.this.g().clear();
                        a.this.f.clear();
                    } else {
                        arrayList = null;
                    }
                }
                a.this.a(arrayList);
            }

            @Override // rx.Observer
            public void onError(Throwable th) {
                a.this.c(th);
            }

            @Override // rx.Observer
            public void onNext(T2 t2) {
                int i;
                ArrayList arrayList;
                try {
                    synchronized (a.this) {
                        a aVar = a.this;
                        i = aVar.e;
                        aVar.e = i + 1;
                        aVar.f.put(Integer.valueOf(i), t2);
                    }
                    Observable<D2> observableCall = OnSubscribeGroupJoin.this.d.call(t2);
                    c cVar = a.this.new c(i);
                    a.this.c.add(cVar);
                    observableCall.unsafeSubscribe(cVar);
                    synchronized (a.this) {
                        arrayList = new ArrayList(a.this.g().values());
                    }
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        ((Observer) it2.next()).onNext(t2);
                    }
                } catch (Throwable th) {
                    Exceptions.throwOrReport(th, this);
                }
            }
        }

        public a(Subscriber<? super R> subscriber) {
            this.b = subscriber;
            CompositeSubscription compositeSubscription = new CompositeSubscription();
            this.c = compositeSubscription;
            this.a = new RefCountSubscription(compositeSubscription);
        }

        public void a(List<Observer<T2>> list) {
            if (list != null) {
                Iterator<Observer<T2>> it2 = list.iterator();
                while (it2.hasNext()) {
                    it2.next().onCompleted();
                }
                this.b.onCompleted();
                this.a.unsubscribe();
            }
        }

        public void c(Throwable th) {
            ArrayList arrayList;
            synchronized (this) {
                arrayList = new ArrayList(g().values());
                g().clear();
                this.f.clear();
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((Observer) it2.next()).onError(th);
            }
            this.b.onError(th);
            this.a.unsubscribe();
        }

        public void e(Throwable th) {
            synchronized (this) {
                g().clear();
                this.f.clear();
            }
            this.b.onError(th);
            this.a.unsubscribe();
        }

        public void f() {
            b bVar = new b();
            d dVar = new d();
            this.c.add(bVar);
            this.c.add(dVar);
            OnSubscribeGroupJoin.this.a.unsafeSubscribe(bVar);
            OnSubscribeGroupJoin.this.b.unsafeSubscribe(dVar);
        }

        public Map<Integer, Observer<T2>> g() {
            return this;
        }

        @Override // rx.Subscription
        public boolean isUnsubscribed() {
            return this.a.isUnsubscribed();
        }

        @Override // rx.Subscription
        public void unsubscribe() {
            this.a.unsubscribe();
        }
    }

    public static final class b<T> implements Observable.OnSubscribe<T> {
        public final RefCountSubscription a;
        public final Observable<T> b;

        public final class a extends Subscriber<T> {
            public final Subscriber<? super T> f;
            private final Subscription g;

            public a(Subscriber<? super T> subscriber, Subscription subscription) {
                super(subscriber);
                this.f = subscriber;
                this.g = subscription;
            }

            @Override // rx.Observer
            public void onCompleted() {
                this.f.onCompleted();
                this.g.unsubscribe();
            }

            @Override // rx.Observer
            public void onError(Throwable th) {
                this.f.onError(th);
                this.g.unsubscribe();
            }

            @Override // rx.Observer
            public void onNext(T t) {
                this.f.onNext(t);
            }
        }

        public b(Observable<T> observable, RefCountSubscription refCountSubscription) {
            this.a = refCountSubscription;
            this.b = observable;
        }

        @Override // rx.functions.Action1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Subscriber<? super T> subscriber) {
            Subscription subscription = this.a.get();
            a aVar = new a(subscriber, subscription);
            aVar.add(subscription);
            this.b.unsafeSubscribe(aVar);
        }
    }

    public OnSubscribeGroupJoin(Observable<T1> observable, Observable<T2> observable2, Func1<? super T1, ? extends Observable<D1>> func1, Func1<? super T2, ? extends Observable<D2>> func2, Func2<? super T1, ? super Observable<T2>, ? extends R> func3) {
        this.a = observable;
        this.b = observable2;
        this.c = func1;
        this.d = func2;
        this.e = func3;
    }

    @Override // rx.functions.Action1
    public void call(Subscriber<? super R> subscriber) {
        a aVar = new a(new SerializedSubscriber(subscriber));
        subscriber.add(aVar);
        aVar.f();
    }
}
