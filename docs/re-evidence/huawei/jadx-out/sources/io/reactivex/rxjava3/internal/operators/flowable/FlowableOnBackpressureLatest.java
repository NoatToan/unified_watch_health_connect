package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Consumer;
import org.reactivestreams.Subscriber;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableOnBackpressureLatest<T> extends AbstractFlowableWithUpstream<T, T> {
    final Consumer<? super T> onDropped;

    public FlowableOnBackpressureLatest(Flowable<T> flowable, Consumer<? super T> consumer) {
        super(flowable);
        this.onDropped = consumer;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        this.source.subscribe((FlowableSubscriber) new BackpressureLatestSubscriber(subscriber, this.onDropped));
    }

    /* JADX INFO: loaded from: classes46.dex */
    static final class BackpressureLatestSubscriber<T> extends AbstractBackpressureThrottlingSubscriber<T, T> {
        private static final long serialVersionUID = 163080509307634843L;
        final Consumer<? super T> onDropped;

        BackpressureLatestSubscriber(Subscriber<? super T> subscriber, Consumer<? super T> consumer) {
            super(subscriber);
            this.onDropped = consumer;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // io.reactivex.rxjava3.internal.operators.flowable.AbstractBackpressureThrottlingSubscriber, org.reactivestreams.Subscriber
        public void onNext(T t) {
            Object andSet = this.current.getAndSet((R) t);
            Consumer<? super T> consumer = this.onDropped;
            if (consumer != null && andSet != null) {
                try {
                    consumer.accept(andSet);
                } catch (Throwable th) {
                    Exceptions.throwIfFatal(th);
                    this.upstream.cancel();
                    this.downstream.onError(th);
                }
            }
            drain();
        }
    }
}
