package rx.internal.operators;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;
import rx.Observable;
import rx.Producer;
import rx.Subscriber;
import rx.functions.Action0;
import rx.subscriptions.Subscriptions;

/* JADX INFO: loaded from: classes23.dex */
public final class OnSubscribeAmb<T> implements Observable.OnSubscribe<T> {
    public final Iterable<? extends Observable<? extends T>> a;

    public class a implements Action0 {
        public final /* synthetic */ d a;

        public a(d dVar) {
            this.a = dVar;
        }

        @Override // rx.functions.Action0
        public void call() {
            c<T> cVar = this.a.get();
            if (cVar != null) {
                cVar.unsubscribe();
            }
            OnSubscribeAmb.a(this.a.a);
        }
    }

    public class b implements Producer {
        public final /* synthetic */ d a;

        public b(d dVar) {
            this.a = dVar;
        }

        @Override // rx.Producer
        public void request(long j) {
            c<T> cVar = this.a.get();
            if (cVar != null) {
                cVar.requestMore(j);
                return;
            }
            for (c<T> cVar2 : this.a.a) {
                if (!cVar2.isUnsubscribed()) {
                    if (this.a.get() == cVar2) {
                        cVar2.requestMore(j);
                        return;
                    }
                    cVar2.requestMore(j);
                }
            }
        }
    }

    public static final class c<T> extends Subscriber<T> {
        private final Subscriber<? super T> f;
        private final d<T> g;
        private boolean h;

        public c(long j, Subscriber<? super T> subscriber, d<T> dVar) {
            this.f = subscriber;
            this.g = dVar;
            request(j);
        }

        private boolean c() {
            if (this.h) {
                return true;
            }
            if (this.g.get() == this) {
                this.h = true;
                return true;
            }
            if (!this.g.compareAndSet(null, this)) {
                this.g.a();
                return false;
            }
            this.g.b(this);
            this.h = true;
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void requestMore(long j) {
            request(j);
        }

        @Override // rx.Observer
        public void onCompleted() {
            if (c()) {
                this.f.onCompleted();
            }
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            if (c()) {
                this.f.onError(th);
            }
        }

        @Override // rx.Observer
        public void onNext(T t) {
            if (c()) {
                this.f.onNext(t);
            }
        }
    }

    public static final class d<T> extends AtomicReference<c<T>> {
        public final Collection<c<T>> a = new ConcurrentLinkedQueue();

        public void a() {
            c<T> cVar = get();
            if (cVar != null) {
                b(cVar);
            }
        }

        public void b(c<T> cVar) {
            for (c<T> cVar2 : this.a) {
                if (cVar2 != cVar) {
                    cVar2.unsubscribe();
                }
            }
            this.a.clear();
        }
    }

    private OnSubscribeAmb(Iterable<? extends Observable<? extends T>> iterable) {
        this.a = iterable;
    }

    public static <T> void a(Collection<c<T>> collection) {
        if (collection.isEmpty()) {
            return;
        }
        Iterator<c<T>> it2 = collection.iterator();
        while (it2.hasNext()) {
            it2.next().unsubscribe();
        }
        collection.clear();
    }

    public static <T> Observable.OnSubscribe<T> amb(Observable<? extends T> observable, Observable<? extends T> observable2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(observable);
        arrayList.add(observable2);
        return amb(arrayList);
    }

    @Override // rx.functions.Action1
    public void call(Subscriber<? super T> subscriber) {
        d dVar = new d();
        subscriber.add(Subscriptions.create(new a(dVar)));
        for (Observable<? extends T> observable : this.a) {
            if (subscriber.isUnsubscribed()) {
                break;
            }
            c<T> cVar = new c<>(0L, subscriber, dVar);
            dVar.a.add(cVar);
            c<T> cVar2 = dVar.get();
            if (cVar2 != null) {
                dVar.b(cVar2);
                return;
            }
            observable.unsafeSubscribe(cVar);
        }
        if (subscriber.isUnsubscribed()) {
            a(dVar.a);
        }
        subscriber.setProducer(new b(dVar));
    }

    public static <T> Observable.OnSubscribe<T> amb(Observable<? extends T> observable, Observable<? extends T> observable2, Observable<? extends T> observable3) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(observable);
        arrayList.add(observable2);
        arrayList.add(observable3);
        return amb(arrayList);
    }

    public static <T> Observable.OnSubscribe<T> amb(Observable<? extends T> observable, Observable<? extends T> observable2, Observable<? extends T> observable3, Observable<? extends T> observable4) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(observable);
        arrayList.add(observable2);
        arrayList.add(observable3);
        arrayList.add(observable4);
        return amb(arrayList);
    }

    public static <T> Observable.OnSubscribe<T> amb(Observable<? extends T> observable, Observable<? extends T> observable2, Observable<? extends T> observable3, Observable<? extends T> observable4, Observable<? extends T> observable5) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(observable);
        arrayList.add(observable2);
        arrayList.add(observable3);
        arrayList.add(observable4);
        arrayList.add(observable5);
        return amb(arrayList);
    }

    public static <T> Observable.OnSubscribe<T> amb(Observable<? extends T> observable, Observable<? extends T> observable2, Observable<? extends T> observable3, Observable<? extends T> observable4, Observable<? extends T> observable5, Observable<? extends T> observable6) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(observable);
        arrayList.add(observable2);
        arrayList.add(observable3);
        arrayList.add(observable4);
        arrayList.add(observable5);
        arrayList.add(observable6);
        return amb(arrayList);
    }

    public static <T> Observable.OnSubscribe<T> amb(Observable<? extends T> observable, Observable<? extends T> observable2, Observable<? extends T> observable3, Observable<? extends T> observable4, Observable<? extends T> observable5, Observable<? extends T> observable6, Observable<? extends T> observable7) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(observable);
        arrayList.add(observable2);
        arrayList.add(observable3);
        arrayList.add(observable4);
        arrayList.add(observable5);
        arrayList.add(observable6);
        arrayList.add(observable7);
        return amb(arrayList);
    }

    public static <T> Observable.OnSubscribe<T> amb(Observable<? extends T> observable, Observable<? extends T> observable2, Observable<? extends T> observable3, Observable<? extends T> observable4, Observable<? extends T> observable5, Observable<? extends T> observable6, Observable<? extends T> observable7, Observable<? extends T> observable8) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(observable);
        arrayList.add(observable2);
        arrayList.add(observable3);
        arrayList.add(observable4);
        arrayList.add(observable5);
        arrayList.add(observable6);
        arrayList.add(observable7);
        arrayList.add(observable8);
        return amb(arrayList);
    }

    public static <T> Observable.OnSubscribe<T> amb(Observable<? extends T> observable, Observable<? extends T> observable2, Observable<? extends T> observable3, Observable<? extends T> observable4, Observable<? extends T> observable5, Observable<? extends T> observable6, Observable<? extends T> observable7, Observable<? extends T> observable8, Observable<? extends T> observable9) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(observable);
        arrayList.add(observable2);
        arrayList.add(observable3);
        arrayList.add(observable4);
        arrayList.add(observable5);
        arrayList.add(observable6);
        arrayList.add(observable7);
        arrayList.add(observable8);
        arrayList.add(observable9);
        return amb(arrayList);
    }

    public static <T> Observable.OnSubscribe<T> amb(Iterable<? extends Observable<? extends T>> iterable) {
        return new OnSubscribeAmb(iterable);
    }
}
