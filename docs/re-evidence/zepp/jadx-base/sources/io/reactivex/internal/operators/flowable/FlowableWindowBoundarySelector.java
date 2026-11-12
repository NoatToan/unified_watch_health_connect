package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.internal.subscribers.QueueDrainSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.processors.UnicastProcessor;
import io.reactivex.subscribers.DisposableSubscriber;
import io.reactivex.subscribers.SerializedSubscriber;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes22.dex */
public final class FlowableWindowBoundarySelector<T, B, V> extends io.reactivex.internal.operators.flowable.a<T, Flowable<T>> {
    public final Publisher<B> b;
    public final Function<? super B, ? extends Publisher<V>> c;
    public final int d;

    public static final class a<T, V> extends DisposableSubscriber<V> {
        public final c<T, ?, V> b;
        public final UnicastProcessor<T> c;
        public boolean d;

        public a(c<T, ?, V> cVar, UnicastProcessor<T> unicastProcessor) {
            this.b = cVar;
            this.c = unicastProcessor;
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (this.d) {
                return;
            }
            this.d = true;
            this.b.a(this);
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            if (this.d) {
                RxJavaPlugins.onError(th);
            } else {
                this.d = true;
                this.b.c(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(V v) {
            cancel();
            onComplete();
        }
    }

    public static final class b<T, B> extends DisposableSubscriber<B> {
        public final c<T, B, ?> b;

        public b(c<T, B, ?> cVar) {
            this.b = cVar;
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.b.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            this.b.c(th);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(B b) {
            this.b.d(b);
        }
    }

    public static final class c<T, B, V> extends QueueDrainSubscriber<T, Object, Flowable<T>> implements Subscription {
        public final Publisher<B> V;
        public final Function<? super B, ? extends Publisher<V>> W;
        public final int X;
        public final CompositeDisposable Y;
        public Subscription Z;
        public final AtomicReference<Disposable> m0;
        public final List<UnicastProcessor<T>> n0;
        public final AtomicLong o0;

        public c(Subscriber<? super Flowable<T>> subscriber, Publisher<B> publisher, Function<? super B, ? extends Publisher<V>> function, int i) {
            super(subscriber, new MpscLinkedQueue());
            this.m0 = new AtomicReference<>();
            AtomicLong atomicLong = new AtomicLong();
            this.o0 = atomicLong;
            this.V = publisher;
            this.W = function;
            this.X = i;
            this.Y = new CompositeDisposable();
            this.n0 = new ArrayList();
            atomicLong.lazySet(1L);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        public void a(a<T, V> aVar) {
            this.Y.delete(aVar);
            this.queue.offer((U) new d(aVar.c, null));
            if (enter()) {
                b();
            }
        }

        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.internal.util.QueueDrain
        public boolean accept(Subscriber<? super Flowable<T>> subscriber, Object obj) {
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void b() {
            SimpleQueue simpleQueue = this.queue;
            Subscriber<? super V> subscriber = this.downstream;
            List<UnicastProcessor<T>> list = this.n0;
            int iLeave = 1;
            while (true) {
                boolean z = this.done;
                Object objPoll = simpleQueue.poll();
                boolean z2 = objPoll == null;
                if (z && z2) {
                    dispose();
                    Throwable th = this.error;
                    if (th != null) {
                        Iterator<UnicastProcessor<T>> it2 = list.iterator();
                        while (it2.hasNext()) {
                            it2.next().onError(th);
                        }
                    } else {
                        Iterator<UnicastProcessor<T>> it3 = list.iterator();
                        while (it3.hasNext()) {
                            it3.next().onComplete();
                        }
                    }
                    list.clear();
                    return;
                }
                if (z2) {
                    iLeave = leave(-iLeave);
                    if (iLeave == 0) {
                        return;
                    }
                } else if (objPoll instanceof d) {
                    d dVar = (d) objPoll;
                    UnicastProcessor<T> unicastProcessor = dVar.a;
                    if (unicastProcessor != null) {
                        if (list.remove(unicastProcessor)) {
                            dVar.a.onComplete();
                            if (this.o0.decrementAndGet() == 0) {
                                dispose();
                                return;
                            }
                        } else {
                            continue;
                        }
                    } else if (!this.cancelled) {
                        UnicastProcessor<T> unicastProcessorCreate = UnicastProcessor.create(this.X);
                        long jRequested = requested();
                        if (jRequested != 0) {
                            list.add(unicastProcessorCreate);
                            subscriber.onNext(unicastProcessorCreate);
                            if (jRequested != Long.MAX_VALUE) {
                                produced(1L);
                            }
                            try {
                                Publisher publisher = (Publisher) ObjectHelper.requireNonNull(this.W.apply(dVar.b), "The publisher supplied is null");
                                a aVar = new a(this, unicastProcessorCreate);
                                if (this.Y.add(aVar)) {
                                    this.o0.getAndIncrement();
                                    publisher.subscribe(aVar);
                                }
                            } catch (Throwable th2) {
                                this.cancelled = true;
                                subscriber.onError(th2);
                            }
                        } else {
                            this.cancelled = true;
                            subscriber.onError(new MissingBackpressureException("Could not deliver new window due to lack of requests"));
                        }
                    }
                } else {
                    Iterator<UnicastProcessor<T>> it4 = list.iterator();
                    while (it4.hasNext()) {
                        it4.next().onNext(NotificationLite.getValue(objPoll));
                    }
                }
            }
        }

        public void c(Throwable th) {
            this.Z.cancel();
            this.Y.dispose();
            DisposableHelper.dispose(this.m0);
            this.downstream.onError(th);
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            this.cancelled = true;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        public void d(B b) {
            this.queue.offer((U) new d(null, b));
            if (enter()) {
                b();
            }
        }

        public void dispose() {
            this.Y.dispose();
            DisposableHelper.dispose(this.m0);
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            if (enter()) {
                b();
            }
            if (this.o0.decrementAndGet() == 0) {
                this.Y.dispose();
            }
            this.downstream.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            if (this.done) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.error = th;
            this.done = true;
            if (enter()) {
                b();
            }
            if (this.o0.decrementAndGet() == 0) {
                this.Y.dispose();
            }
            this.downstream.onError(th);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            if (this.done) {
                return;
            }
            if (fastEnter()) {
                Iterator<UnicastProcessor<T>> it2 = this.n0.iterator();
                while (it2.hasNext()) {
                    it2.next().onNext(t);
                }
                if (leave(-1) == 0) {
                    return;
                }
            } else {
                this.queue.offer((U) NotificationLite.next(t));
                if (!enter()) {
                    return;
                }
            }
            b();
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.Z, subscription)) {
                this.Z = subscription;
                this.downstream.onSubscribe(this);
                if (this.cancelled) {
                    return;
                }
                b bVar = new b(this);
                if (this.m0.compareAndSet(null, bVar)) {
                    this.o0.getAndIncrement();
                    subscription.request(Long.MAX_VALUE);
                    this.V.subscribe(bVar);
                }
            }
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j) {
            requested(j);
        }
    }

    public static final class d<T, B> {
        public final UnicastProcessor<T> a;
        public final B b;

        public d(UnicastProcessor<T> unicastProcessor, B b) {
            this.a = unicastProcessor;
            this.b = b;
        }
    }

    public FlowableWindowBoundarySelector(Flowable<T> flowable, Publisher<B> publisher, Function<? super B, ? extends Publisher<V>> function, int i) {
        super(flowable);
        this.b = publisher;
        this.c = function;
        this.d = i;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super Flowable<T>> subscriber) {
        this.source.subscribe((FlowableSubscriber) new c(new SerializedSubscriber(subscriber), this.b, this.c, this.d));
    }
}
