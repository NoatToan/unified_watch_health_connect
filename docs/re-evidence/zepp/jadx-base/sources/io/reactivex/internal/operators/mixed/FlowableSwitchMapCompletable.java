package io.reactivex.internal.operators.mixed;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes22.dex */
public final class FlowableSwitchMapCompletable<T> extends Completable {
    public final Flowable<T> a;
    public final Function<? super T, ? extends CompletableSource> b;
    public final boolean c;

    public static final class a<T> implements FlowableSubscriber<T>, Disposable {
        public static final C1122a h = new C1122a(null);
        public final CompletableObserver a;
        public final Function<? super T, ? extends CompletableSource> b;
        public final boolean c;
        public final AtomicThrowable d = new AtomicThrowable();
        public final AtomicReference<C1122a> e = new AtomicReference<>();
        public volatile boolean f;
        public Subscription g;

        /* JADX INFO: renamed from: io.reactivex.internal.operators.mixed.FlowableSwitchMapCompletable$a$a, reason: collision with other inner class name */
        public static final class C1122a extends AtomicReference<Disposable> implements CompletableObserver {
            private static final long serialVersionUID = -8003404460084760287L;
            public final a<?> a;

            public C1122a(a<?> aVar) {
                this.a = aVar;
            }

            public void a() {
                DisposableHelper.dispose(this);
            }

            @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
            public void onComplete() {
                this.a.b(this);
            }

            @Override // io.reactivex.CompletableObserver
            public void onError(Throwable th) {
                this.a.c(this, th);
            }

            @Override // io.reactivex.CompletableObserver
            public void onSubscribe(Disposable disposable) {
                DisposableHelper.setOnce(this, disposable);
            }
        }

        public a(CompletableObserver completableObserver, Function<? super T, ? extends CompletableSource> function, boolean z) {
            this.a = completableObserver;
            this.b = function;
            this.c = z;
        }

        public void a() {
            AtomicReference<C1122a> atomicReference = this.e;
            C1122a c1122a = h;
            C1122a andSet = atomicReference.getAndSet(c1122a);
            if (andSet == null || andSet == c1122a) {
                return;
            }
            andSet.a();
        }

        public void b(C1122a c1122a) {
            if (this.e.compareAndSet(c1122a, null) && this.f) {
                Throwable thTerminate = this.d.terminate();
                if (thTerminate == null) {
                    this.a.onComplete();
                } else {
                    this.a.onError(thTerminate);
                }
            }
        }

        public void c(C1122a c1122a, Throwable th) {
            if (!this.e.compareAndSet(c1122a, null) || !this.d.addThrowable(th)) {
                RxJavaPlugins.onError(th);
                return;
            }
            if (this.c) {
                if (this.f) {
                    this.a.onError(this.d.terminate());
                    return;
                }
                return;
            }
            dispose();
            Throwable thTerminate = this.d.terminate();
            if (thTerminate != ExceptionHelper.TERMINATED) {
                this.a.onError(thTerminate);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.g.cancel();
            a();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.e.get() == h;
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.f = true;
            if (this.e.get() == null) {
                Throwable thTerminate = this.d.terminate();
                if (thTerminate == null) {
                    this.a.onComplete();
                } else {
                    this.a.onError(thTerminate);
                }
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            if (!this.d.addThrowable(th)) {
                RxJavaPlugins.onError(th);
                return;
            }
            if (this.c) {
                onComplete();
                return;
            }
            a();
            Throwable thTerminate = this.d.terminate();
            if (thTerminate != ExceptionHelper.TERMINATED) {
                this.a.onError(thTerminate);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            C1122a c1122a;
            try {
                CompletableSource completableSource = (CompletableSource) ObjectHelper.requireNonNull(this.b.apply(t), "The mapper returned a null CompletableSource");
                C1122a c1122a2 = new C1122a(this);
                do {
                    c1122a = this.e.get();
                    if (c1122a == h) {
                        return;
                    }
                } while (!this.e.compareAndSet(c1122a, c1122a2));
                if (c1122a != null) {
                    c1122a.a();
                }
                completableSource.subscribe(c1122a2);
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                this.g.cancel();
                onError(th);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.g, subscription)) {
                this.g = subscription;
                this.a.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }
    }

    public FlowableSwitchMapCompletable(Flowable<T> flowable, Function<? super T, ? extends CompletableSource> function, boolean z) {
        this.a = flowable;
        this.b = function;
        this.c = z;
    }

    @Override // io.reactivex.Completable
    public void subscribeActual(CompletableObserver completableObserver) {
        this.a.subscribe((FlowableSubscriber) new a(completableObserver, this.b, this.c));
    }
}
