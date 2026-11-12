package rx.internal.operators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import rx.Observable;
import rx.Observer;
import rx.Subscriber;
import rx.functions.Func0;
import rx.observers.SerializedSubscriber;
import rx.subjects.UnicastSubject;
import rx.subscriptions.SerialSubscription;

/* JADX INFO: loaded from: classes23.dex */
public final class OperatorWindowWithObservableFactory<T, U> implements Observable.Operator<Observable<T>, T> {
    public static final Object b = new Object();
    public final Func0<? extends Observable<? extends U>> a;

    public static final class a<T, U> extends Subscriber<U> {
        public final b<T, U> f;
        public boolean g;

        public a(b<T, U> bVar) {
            this.f = bVar;
        }

        @Override // rx.Observer
        public void onCompleted() {
            if (this.g) {
                return;
            }
            this.g = true;
            this.f.onCompleted();
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            this.f.onError(th);
        }

        @Override // rx.Observer
        public void onNext(U u) throws Throwable {
            if (this.g) {
                return;
            }
            this.g = true;
            this.f.g();
        }

        @Override // rx.Subscriber, rx.observers.AssertableSubscriber
        public void onStart() {
            request(Long.MAX_VALUE);
        }
    }

    public static final class b<T, U> extends Subscriber<T> {
        public final Subscriber<? super Observable<T>> f;
        public final Object g = new Object();
        public Observer<T> h;
        public Observable<T> i;
        public boolean j;
        public List<Object> k;
        public final SerialSubscription l;
        public final Func0<? extends Observable<? extends U>> m;

        public b(Subscriber<? super Observable<T>> subscriber, Func0<? extends Observable<? extends U>> func0) {
            this.f = new SerializedSubscriber(subscriber);
            SerialSubscription serialSubscription = new SerialSubscription();
            this.l = serialSubscription;
            this.m = func0;
            add(serialSubscription);
        }

        public void b() {
            UnicastSubject unicastSubjectCreate = UnicastSubject.create();
            this.h = unicastSubjectCreate;
            this.i = unicastSubjectCreate;
            try {
                Observable<? extends U> observableCall = this.m.call();
                a aVar = new a(this);
                this.l.set(aVar);
                observableCall.unsafeSubscribe(aVar);
            } catch (Throwable th) {
                this.f.onError(th);
                unsubscribe();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void c(List<Object> list) {
            if (list == null) {
                return;
            }
            for (Object obj : list) {
                if (obj == OperatorWindowWithObservableFactory.b) {
                    f();
                } else if (NotificationLite.isError(obj)) {
                    e(NotificationLite.getError(obj));
                    return;
                } else {
                    if (NotificationLite.isCompleted(obj)) {
                        complete();
                        return;
                    }
                    d(obj);
                }
            }
        }

        public void complete() {
            Observer<T> observer = this.h;
            this.h = null;
            this.i = null;
            if (observer != null) {
                observer.onCompleted();
            }
            this.f.onCompleted();
            unsubscribe();
        }

        public void d(T t) {
            Observer<T> observer = this.h;
            if (observer != null) {
                observer.onNext(t);
            }
        }

        public void e(Throwable th) {
            Observer<T> observer = this.h;
            this.h = null;
            this.i = null;
            if (observer != null) {
                observer.onError(th);
            }
            this.f.onError(th);
            unsubscribe();
        }

        public void f() {
            Observer<T> observer = this.h;
            if (observer != null) {
                observer.onCompleted();
            }
            b();
            this.f.onNext(this.i);
        }

        public void g() throws Throwable {
            synchronized (this.g) {
                if (this.j) {
                    if (this.k == null) {
                        this.k = new ArrayList();
                    }
                    this.k.add(OperatorWindowWithObservableFactory.b);
                    return;
                }
                List<Object> list = this.k;
                this.k = null;
                boolean z = true;
                this.j = true;
                boolean z2 = true;
                while (true) {
                    try {
                        c(list);
                        if (z2) {
                            f();
                            z2 = false;
                        }
                        try {
                            synchronized (this.g) {
                                try {
                                    List<Object> list2 = this.k;
                                    this.k = null;
                                    if (list2 == null) {
                                        this.j = false;
                                        return;
                                    } else {
                                        if (this.f.isUnsubscribed()) {
                                            synchronized (this.g) {
                                                this.j = false;
                                            }
                                            return;
                                        }
                                        list = list2;
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    z = false;
                                    try {
                                        throw th;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        if (!z) {
                                            synchronized (this.g) {
                                                this.j = false;
                                            }
                                        }
                                        throw th;
                                    }
                                }
                            }
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        z = false;
                    }
                }
            }
        }

        @Override // rx.Observer
        public void onCompleted() {
            synchronized (this.g) {
                if (this.j) {
                    if (this.k == null) {
                        this.k = new ArrayList();
                    }
                    this.k.add(NotificationLite.completed());
                    return;
                }
                List<Object> list = this.k;
                this.k = null;
                this.j = true;
                try {
                    c(list);
                    complete();
                } catch (Throwable th) {
                    e(th);
                }
            }
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            synchronized (this.g) {
                if (this.j) {
                    this.k = Collections.singletonList(NotificationLite.error(th));
                    return;
                }
                this.k = null;
                this.j = true;
                e(th);
            }
        }

        @Override // rx.Observer
        public void onNext(T t) throws Throwable {
            synchronized (this.g) {
                if (this.j) {
                    if (this.k == null) {
                        this.k = new ArrayList();
                    }
                    this.k.add(t);
                    return;
                }
                List<Object> list = this.k;
                this.k = null;
                boolean z = true;
                this.j = true;
                boolean z2 = true;
                while (true) {
                    try {
                        c(list);
                        if (z2) {
                            d(t);
                            z2 = false;
                        }
                        try {
                            synchronized (this.g) {
                                try {
                                    List<Object> list2 = this.k;
                                    this.k = null;
                                    if (list2 == null) {
                                        this.j = false;
                                        return;
                                    } else {
                                        if (this.f.isUnsubscribed()) {
                                            synchronized (this.g) {
                                                this.j = false;
                                            }
                                            return;
                                        }
                                        list = list2;
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    z = false;
                                    try {
                                        throw th;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        if (!z) {
                                            synchronized (this.g) {
                                                this.j = false;
                                            }
                                        }
                                        throw th;
                                    }
                                }
                            }
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        z = false;
                    }
                }
            }
        }

        @Override // rx.Subscriber, rx.observers.AssertableSubscriber
        public void onStart() {
            request(Long.MAX_VALUE);
        }
    }

    public OperatorWindowWithObservableFactory(Func0<? extends Observable<? extends U>> func0) {
        this.a = func0;
    }

    @Override // rx.functions.Func1
    public Subscriber<? super T> call(Subscriber<? super Observable<T>> subscriber) throws Throwable {
        b bVar = new b(subscriber, this.a);
        subscriber.add(bVar);
        bVar.g();
        return bVar;
    }
}
