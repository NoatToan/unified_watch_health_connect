package rx.internal.operators;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import rx.Observable;
import rx.Subscriber;
import rx.Subscription;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.functions.Func0;
import rx.observables.ConnectableObservable;
import rx.observers.Subscribers;
import rx.subjects.Subject;
import rx.subscriptions.Subscriptions;

/* JADX INFO: loaded from: classes23.dex */
public final class OperatorMulticast<T, R> extends ConnectableObservable<R> {
    public final Observable<? extends T> b;
    public final Object c;
    public final Func0<? extends Subject<? super T, ? extends R>> d;
    public final AtomicReference<Subject<? super T, ? extends R>> e;
    public final List<Subscriber<? super R>> f;
    public Subscriber<T> g;
    public Subscription h;

    public class a implements Observable.OnSubscribe<R> {
        public final /* synthetic */ Object a;
        public final /* synthetic */ AtomicReference b;
        public final /* synthetic */ List c;

        public a(Object obj, AtomicReference atomicReference, List list) {
            this.a = obj;
            this.b = atomicReference;
            this.c = list;
        }

        @Override // rx.functions.Action1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Subscriber<? super R> subscriber) {
            synchronized (this.a) {
                if (this.b.get() == null) {
                    this.c.add(subscriber);
                } else {
                    ((Subject) this.b.get()).unsafeSubscribe(subscriber);
                }
            }
        }
    }

    public class b implements Action0 {
        public final /* synthetic */ AtomicReference a;

        public b(AtomicReference atomicReference) {
            this.a = atomicReference;
        }

        @Override // rx.functions.Action0
        public void call() {
            synchronized (OperatorMulticast.this.c) {
                if (OperatorMulticast.this.h == this.a.get()) {
                    OperatorMulticast operatorMulticast = OperatorMulticast.this;
                    Subscriber<T> subscriber = operatorMulticast.g;
                    operatorMulticast.g = null;
                    operatorMulticast.h = null;
                    operatorMulticast.e.set(null);
                    if (subscriber != null) {
                        subscriber.unsubscribe();
                    }
                }
            }
        }
    }

    public class c extends Subscriber<R> {
        public final /* synthetic */ Subscriber f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Subscriber subscriber, Subscriber subscriber2) {
            super(subscriber);
            this.f = subscriber2;
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
        public void onNext(R r) {
            this.f.onNext(r);
        }
    }

    public OperatorMulticast(Observable<? extends T> observable, Func0<? extends Subject<? super T, ? extends R>> func0) {
        this(new Object(), new AtomicReference(), new ArrayList(), observable, func0);
    }

    @Override // rx.observables.ConnectableObservable
    public void connect(Action1<? super Subscription> action1) {
        Subscriber<T> subscriber;
        synchronized (this.c) {
            if (this.g != null) {
                action1.call(this.h);
                return;
            }
            Subject<? super T, ? extends R> subjectCall = this.d.call();
            this.g = Subscribers.from(subjectCall);
            AtomicReference atomicReference = new AtomicReference();
            atomicReference.set(Subscriptions.create(new b(atomicReference)));
            this.h = (Subscription) atomicReference.get();
            for (Subscriber<? super R> subscriber2 : this.f) {
                subjectCall.unsafeSubscribe(new c(subscriber2, subscriber2));
            }
            this.f.clear();
            this.e.set(subjectCall);
            action1.call(this.h);
            synchronized (this.c) {
                subscriber = this.g;
            }
            if (subscriber != null) {
                this.b.subscribe((Subscriber<? super Object>) subscriber);
            }
        }
    }

    private OperatorMulticast(Object obj, AtomicReference<Subject<? super T, ? extends R>> atomicReference, List<Subscriber<? super R>> list, Observable<? extends T> observable, Func0<? extends Subject<? super T, ? extends R>> func0) {
        super(new a(obj, atomicReference, list));
        this.c = obj;
        this.e = atomicReference;
        this.f = list;
        this.b = observable;
        this.d = func0;
    }
}
