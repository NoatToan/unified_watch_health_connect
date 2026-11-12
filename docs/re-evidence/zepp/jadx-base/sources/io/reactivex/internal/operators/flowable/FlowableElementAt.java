package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.NoSuchElementException;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes22.dex */
public final class FlowableElementAt<T> extends io.reactivex.internal.operators.flowable.a<T, T> {
    public final long b;
    public final T c;
    public final boolean d;

    public static final class a<T> extends DeferredScalarSubscription<T> implements FlowableSubscriber<T> {
        private static final long serialVersionUID = 4066607327284737757L;
        public final long i;
        public final T j;
        public final boolean k;
        public Subscription l;
        public long m;
        public boolean n;

        public a(Subscriber<? super T> subscriber, long j, T t, boolean z) {
            super(subscriber);
            this.i = j;
            this.j = t;
            this.k = z;
        }

        @Override // io.reactivex.internal.subscriptions.DeferredScalarSubscription, org.reactivestreams.Subscription
        public void cancel() {
            super.cancel();
            this.l.cancel();
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (this.n) {
                return;
            }
            this.n = true;
            T t = this.j;
            if (t != null) {
                complete(t);
            } else if (this.k) {
                this.downstream.onError(new NoSuchElementException());
            } else {
                this.downstream.onComplete();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            if (this.n) {
                RxJavaPlugins.onError(th);
            } else {
                this.n = true;
                this.downstream.onError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            if (this.n) {
                return;
            }
            long j = this.m;
            if (j != this.i) {
                this.m = j + 1;
                return;
            }
            this.n = true;
            this.l.cancel();
            complete(t);
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.l, subscription)) {
                this.l = subscription;
                this.downstream.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }
    }

    public FlowableElementAt(Flowable<T> flowable, long j, T t, boolean z) {
        super(flowable);
        this.b = j;
        this.c = t;
        this.d = z;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        this.source.subscribe((FlowableSubscriber) new a(subscriber, this.b, this.c, this.d));
    }
}
