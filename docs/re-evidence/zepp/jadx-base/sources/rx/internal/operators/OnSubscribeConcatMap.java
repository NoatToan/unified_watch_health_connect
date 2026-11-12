package rx.internal.operators;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import rx.Observable;
import rx.Producer;
import rx.Subscriber;
import rx.exceptions.Exceptions;
import rx.exceptions.MissingBackpressureException;
import rx.functions.Func1;
import rx.internal.producers.ProducerArbiter;
import rx.internal.util.ExceptionsUtils;
import rx.internal.util.ScalarSynchronousObservable;
import rx.internal.util.atomic.SpscAtomicArrayQueue;
import rx.internal.util.unsafe.SpscArrayQueue;
import rx.internal.util.unsafe.UnsafeAccess;
import rx.observers.SerializedSubscriber;
import rx.plugins.RxJavaHooks;
import rx.subscriptions.SerialSubscription;

/* JADX INFO: loaded from: classes23.dex */
public final class OnSubscribeConcatMap<T, R> implements Observable.OnSubscribe<R> {
    public static final int BOUNDARY = 1;
    public static final int END = 2;
    public static final int IMMEDIATE = 0;
    public final Observable<? extends T> a;
    public final Func1<? super T, ? extends Observable<? extends R>> b;
    public final int c;
    public final int d;

    public class a implements Producer {
        public final /* synthetic */ d a;

        public a(d dVar) {
            this.a = dVar;
        }

        @Override // rx.Producer
        public void request(long j) {
            this.a.requestMore(j);
        }
    }

    public static final class b<T, R> implements Producer {
        public final R a;
        public final d<T, R> b;
        public boolean c;

        public b(R r, d<T, R> dVar) {
            this.a = r;
            this.b = dVar;
        }

        @Override // rx.Producer
        public void request(long j) {
            if (this.c || j <= 0) {
                return;
            }
            this.c = true;
            d<T, R> dVar = this.b;
            dVar.f(this.a);
            dVar.d(1L);
        }
    }

    public static final class c<T, R> extends Subscriber<R> {
        public final d<T, R> f;
        public long g;

        public c(d<T, R> dVar) {
            this.f = dVar;
        }

        @Override // rx.Observer
        public void onCompleted() {
            this.f.d(this.g);
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            this.f.e(th, this.g);
        }

        @Override // rx.Observer
        public void onNext(R r) {
            this.g++;
            this.f.f(r);
        }

        @Override // rx.Subscriber, rx.observers.AssertableSubscriber
        public void setProducer(Producer producer) {
            this.f.i.setProducer(producer);
        }
    }

    public static final class d<T, R> extends Subscriber<T> {
        public final Subscriber<? super R> f;
        public final Func1<? super T, ? extends Observable<? extends R>> g;
        public final int h;
        public final Queue<Object> j;
        public final SerialSubscription m;
        public volatile boolean n;
        public volatile boolean o;
        public final ProducerArbiter i = new ProducerArbiter();
        public final AtomicInteger k = new AtomicInteger();
        public final AtomicReference<Throwable> l = new AtomicReference<>();

        public d(Subscriber<? super R> subscriber, Func1<? super T, ? extends Observable<? extends R>> func1, int i, int i2) {
            this.f = subscriber;
            this.g = func1;
            this.h = i2;
            this.j = UnsafeAccess.isUnsafeAvailable() ? new SpscArrayQueue<>(i) : new SpscAtomicArrayQueue<>(i);
            this.m = new SerialSubscription();
            request(i);
        }

        public void b() {
            if (this.k.getAndIncrement() != 0) {
                return;
            }
            int i = this.h;
            while (!this.f.isUnsubscribed()) {
                if (!this.o) {
                    if (i == 1 && this.l.get() != null) {
                        Throwable thTerminate = ExceptionsUtils.terminate(this.l);
                        if (ExceptionsUtils.isTerminated(thTerminate)) {
                            return;
                        }
                        this.f.onError(thTerminate);
                        return;
                    }
                    boolean z = this.n;
                    Object objPoll = this.j.poll();
                    boolean z2 = objPoll == null;
                    if (z && z2) {
                        Throwable thTerminate2 = ExceptionsUtils.terminate(this.l);
                        if (thTerminate2 == null) {
                            this.f.onCompleted();
                            return;
                        } else {
                            if (ExceptionsUtils.isTerminated(thTerminate2)) {
                                return;
                            }
                            this.f.onError(thTerminate2);
                            return;
                        }
                    }
                    if (!z2) {
                        try {
                            Observable<? extends R> observableCall = this.g.call((Object) NotificationLite.getValue(objPoll));
                            if (observableCall == null) {
                                c(new NullPointerException("The source returned by the mapper was null"));
                                return;
                            }
                            if (observableCall != Observable.empty()) {
                                if (observableCall instanceof ScalarSynchronousObservable) {
                                    this.o = true;
                                    this.i.setProducer(new b(((ScalarSynchronousObservable) observableCall).get(), this));
                                } else {
                                    c cVar = new c(this);
                                    this.m.set(cVar);
                                    if (cVar.isUnsubscribed()) {
                                        return;
                                    }
                                    this.o = true;
                                    observableCall.unsafeSubscribe(cVar);
                                }
                                request(1L);
                            } else {
                                request(1L);
                            }
                        } catch (Throwable th) {
                            Exceptions.throwIfFatal(th);
                            c(th);
                            return;
                        }
                    }
                }
                if (this.k.decrementAndGet() == 0) {
                    return;
                }
            }
        }

        public void c(Throwable th) {
            unsubscribe();
            if (!ExceptionsUtils.addThrowable(this.l, th)) {
                g(th);
                return;
            }
            Throwable thTerminate = ExceptionsUtils.terminate(this.l);
            if (ExceptionsUtils.isTerminated(thTerminate)) {
                return;
            }
            this.f.onError(thTerminate);
        }

        public void d(long j) {
            if (j != 0) {
                this.i.produced(j);
            }
            this.o = false;
            b();
        }

        public void e(Throwable th, long j) {
            if (!ExceptionsUtils.addThrowable(this.l, th)) {
                g(th);
                return;
            }
            if (this.h == 0) {
                Throwable thTerminate = ExceptionsUtils.terminate(this.l);
                if (!ExceptionsUtils.isTerminated(thTerminate)) {
                    this.f.onError(thTerminate);
                }
                unsubscribe();
                return;
            }
            if (j != 0) {
                this.i.produced(j);
            }
            this.o = false;
            b();
        }

        public void f(R r) {
            this.f.onNext(r);
        }

        public void g(Throwable th) {
            RxJavaHooks.onError(th);
        }

        @Override // rx.Observer
        public void onCompleted() {
            this.n = true;
            b();
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            if (!ExceptionsUtils.addThrowable(this.l, th)) {
                g(th);
                return;
            }
            this.n = true;
            if (this.h != 0) {
                b();
                return;
            }
            Throwable thTerminate = ExceptionsUtils.terminate(this.l);
            if (!ExceptionsUtils.isTerminated(thTerminate)) {
                this.f.onError(thTerminate);
            }
            this.m.unsubscribe();
        }

        @Override // rx.Observer
        public void onNext(T t) {
            if (this.j.offer(NotificationLite.next(t))) {
                b();
            } else {
                unsubscribe();
                onError(new MissingBackpressureException());
            }
        }

        public void requestMore(long j) {
            if (j > 0) {
                this.i.request(j);
            } else {
                if (j >= 0) {
                    return;
                }
                throw new IllegalArgumentException("n >= 0 required but it was " + j);
            }
        }
    }

    public OnSubscribeConcatMap(Observable<? extends T> observable, Func1<? super T, ? extends Observable<? extends R>> func1, int i, int i2) {
        this.a = observable;
        this.b = func1;
        this.c = i;
        this.d = i2;
    }

    @Override // rx.functions.Action1
    public void call(Subscriber<? super R> subscriber) {
        d dVar = new d(this.d == 0 ? new SerializedSubscriber<>(subscriber) : subscriber, this.b, this.c, this.d);
        subscriber.add(dVar);
        subscriber.add(dVar.m);
        subscriber.setProducer(new a(dVar));
        if (subscriber.isUnsubscribed()) {
            return;
        }
        this.a.unsafeSubscribe(dVar);
    }
}
