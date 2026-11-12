package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiPredicate;
import io.reactivex.internal.fuseable.FuseToFlowable;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import org.reactivestreams.Publisher;

/* JADX INFO: loaded from: classes22.dex */
public final class FlowableSequenceEqualSingle<T> extends Single<Boolean> implements FuseToFlowable<Boolean> {
    public final Publisher<? extends T> a;
    public final Publisher<? extends T> b;
    public final BiPredicate<? super T, ? super T> c;
    public final int d;

    public static final class a<T> extends AtomicInteger implements Disposable, FlowableSequenceEqual.b {
        private static final long serialVersionUID = -6178010334400373240L;
        public final SingleObserver<? super Boolean> a;
        public final BiPredicate<? super T, ? super T> b;
        public final FlowableSequenceEqual.c<T> c;
        public final FlowableSequenceEqual.c<T> d;
        public final AtomicThrowable e = new AtomicThrowable();
        public T f;
        public T g;

        public a(SingleObserver<? super Boolean> singleObserver, int i, BiPredicate<? super T, ? super T> biPredicate) {
            this.a = singleObserver;
            this.b = biPredicate;
            this.c = new FlowableSequenceEqual.c<>(this, i);
            this.d = new FlowableSequenceEqual.c<>(this, i);
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableSequenceEqual.b
        public void a(Throwable th) {
            if (this.e.addThrowable(th)) {
                drain();
            } else {
                RxJavaPlugins.onError(th);
            }
        }

        public void b() {
            this.c.a();
            this.c.b();
            this.d.a();
            this.d.b();
        }

        public void c(Publisher<? extends T> publisher, Publisher<? extends T> publisher2) {
            publisher.subscribe(this.c);
            publisher2.subscribe(this.d);
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.c.a();
            this.d.a();
            if (getAndIncrement() == 0) {
                this.c.b();
                this.d.b();
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableSequenceEqual.b
        public void drain() {
            if (getAndIncrement() != 0) {
                return;
            }
            int iAddAndGet = 1;
            do {
                SimpleQueue<T> simpleQueue = this.c.e;
                SimpleQueue<T> simpleQueue2 = this.d.e;
                if (simpleQueue != null && simpleQueue2 != null) {
                    while (true) {
                        if (isDisposed()) {
                            this.c.b();
                            this.d.b();
                            return;
                        }
                        if (this.e.get() != null) {
                            b();
                            this.a.onError(this.e.terminate());
                            return;
                        }
                        boolean z = this.c.f;
                        T tPoll = this.f;
                        if (tPoll == null) {
                            try {
                                tPoll = simpleQueue.poll();
                                this.f = tPoll;
                            } catch (Throwable th) {
                                Exceptions.throwIfFatal(th);
                                b();
                                this.e.addThrowable(th);
                                this.a.onError(this.e.terminate());
                                return;
                            }
                        }
                        boolean z2 = tPoll == null;
                        boolean z3 = this.d.f;
                        T tPoll2 = this.g;
                        if (tPoll2 == null) {
                            try {
                                tPoll2 = simpleQueue2.poll();
                                this.g = tPoll2;
                            } catch (Throwable th2) {
                                Exceptions.throwIfFatal(th2);
                                b();
                                this.e.addThrowable(th2);
                                this.a.onError(this.e.terminate());
                                return;
                            }
                        }
                        boolean z4 = tPoll2 == null;
                        if (z && z3 && z2 && z4) {
                            this.a.onSuccess(Boolean.TRUE);
                            return;
                        }
                        if (z && z3 && z2 != z4) {
                            b();
                            this.a.onSuccess(Boolean.FALSE);
                            return;
                        }
                        if (z2 || z4) {
                            break;
                        }
                        try {
                            if (!this.b.test(tPoll, tPoll2)) {
                                b();
                                this.a.onSuccess(Boolean.FALSE);
                                return;
                            } else {
                                this.f = null;
                                this.g = null;
                                this.c.c();
                                this.d.c();
                            }
                        } catch (Throwable th3) {
                            Exceptions.throwIfFatal(th3);
                            b();
                            this.e.addThrowable(th3);
                            this.a.onError(this.e.terminate());
                            return;
                        }
                    }
                } else if (isDisposed()) {
                    this.c.b();
                    this.d.b();
                    return;
                } else if (this.e.get() != null) {
                    b();
                    this.a.onError(this.e.terminate());
                    return;
                }
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.c.get() == SubscriptionHelper.CANCELLED;
        }
    }

    public FlowableSequenceEqualSingle(Publisher<? extends T> publisher, Publisher<? extends T> publisher2, BiPredicate<? super T, ? super T> biPredicate, int i) {
        this.a = publisher;
        this.b = publisher2;
        this.c = biPredicate;
        this.d = i;
    }

    @Override // io.reactivex.internal.fuseable.FuseToFlowable
    public Flowable<Boolean> fuseToFlowable() {
        return RxJavaPlugins.onAssembly(new FlowableSequenceEqual(this.a, this.b, this.c, this.d));
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super Boolean> singleObserver) {
        a aVar = new a(singleObserver, this.d, this.c);
        singleObserver.onSubscribe(aVar);
        aVar.c(this.a, this.b);
    }
}
