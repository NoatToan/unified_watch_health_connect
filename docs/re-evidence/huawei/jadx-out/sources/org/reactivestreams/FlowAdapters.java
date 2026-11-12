package org.reactivestreams;

import j$.util.concurrent.Flow$Processor;
import j$.util.concurrent.Flow$Publisher;
import j$.util.concurrent.Flow$Subscriber;
import j$.util.concurrent.Flow$Subscription;
import java.util.Objects;

/* JADX INFO: loaded from: classes46.dex */
public final class FlowAdapters {
    private FlowAdapters() {
        throw new IllegalStateException("No instances!");
    }

    public static <T> Publisher<T> toPublisher(Flow$Publisher<? extends T> flow$Publisher) {
        Objects.requireNonNull(flow$Publisher, "flowPublisher");
        if (flow$Publisher instanceof FlowPublisherFromReactive) {
            return ((FlowPublisherFromReactive) flow$Publisher).reactiveStreams;
        }
        if (flow$Publisher instanceof Publisher) {
            return (Publisher) flow$Publisher;
        }
        return new ReactivePublisherFromFlow(flow$Publisher);
    }

    public static <T> Flow$Publisher<T> toFlowPublisher(Publisher<? extends T> publisher) {
        Objects.requireNonNull(publisher, "reactiveStreamsPublisher");
        if (publisher instanceof ReactivePublisherFromFlow) {
            return ((ReactivePublisherFromFlow) publisher).flow;
        }
        if (publisher instanceof Flow$Publisher) {
            return (Flow$Publisher) publisher;
        }
        return new FlowPublisherFromReactive(publisher);
    }

    public static <T, U> Processor<T, U> toProcessor(Flow$Processor<? super T, ? extends U> flow$Processor) {
        Objects.requireNonNull(flow$Processor, "flowProcessor");
        if (flow$Processor instanceof FlowToReactiveProcessor) {
            return ((FlowToReactiveProcessor) flow$Processor).reactiveStreams;
        }
        if (flow$Processor instanceof Processor) {
            return (Processor) flow$Processor;
        }
        return new ReactiveToFlowProcessor(flow$Processor);
    }

    public static <T, U> Flow$Processor<T, U> toFlowProcessor(Processor<? super T, ? extends U> processor) {
        Objects.requireNonNull(processor, "reactiveStreamsProcessor");
        if (processor instanceof ReactiveToFlowProcessor) {
            return ((ReactiveToFlowProcessor) processor).flow;
        }
        if (processor instanceof Flow$Processor) {
            return (Flow$Processor) processor;
        }
        return new FlowToReactiveProcessor(processor);
    }

    public static <T> Flow$Subscriber<T> toFlowSubscriber(Subscriber<T> subscriber) {
        Objects.requireNonNull(subscriber, "reactiveStreamsSubscriber");
        if (subscriber instanceof ReactiveToFlowSubscriber) {
            return ((ReactiveToFlowSubscriber) subscriber).flow;
        }
        if (subscriber instanceof Flow$Subscriber) {
            return (Flow$Subscriber) subscriber;
        }
        return new FlowToReactiveSubscriber(subscriber);
    }

    public static <T> Subscriber<T> toSubscriber(Flow$Subscriber<T> flow$Subscriber) {
        Objects.requireNonNull(flow$Subscriber, "flowSubscriber");
        if (flow$Subscriber instanceof FlowToReactiveSubscriber) {
            return ((FlowToReactiveSubscriber) flow$Subscriber).reactiveStreams;
        }
        if (flow$Subscriber instanceof Subscriber) {
            return (Subscriber) flow$Subscriber;
        }
        return new ReactiveToFlowSubscriber(flow$Subscriber);
    }

    static final class FlowToReactiveSubscription implements Flow$Subscription {
        final Subscription reactiveStreams;

        public FlowToReactiveSubscription(Subscription subscription) {
            this.reactiveStreams = subscription;
        }

        @Override // j$.util.concurrent.Flow$Subscription
        public void request(long j) {
            this.reactiveStreams.request(j);
        }

        @Override // j$.util.concurrent.Flow$Subscription
        public void cancel() {
            this.reactiveStreams.cancel();
        }
    }

    static final class ReactiveToFlowSubscription implements Subscription {
        final Flow$Subscription flow;

        public ReactiveToFlowSubscription(Flow$Subscription flow$Subscription) {
            this.flow = flow$Subscription;
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j) {
            this.flow.request(j);
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            this.flow.cancel();
        }
    }

    static final class FlowToReactiveSubscriber<T> implements Flow$Subscriber<T> {
        final Subscriber<? super T> reactiveStreams;

        public FlowToReactiveSubscriber(Subscriber<? super T> subscriber) {
            this.reactiveStreams = subscriber;
        }

        @Override // j$.util.concurrent.Flow$Subscriber
        public void onSubscribe(Flow$Subscription flow$Subscription) {
            this.reactiveStreams.onSubscribe(flow$Subscription == null ? null : new ReactiveToFlowSubscription(flow$Subscription));
        }

        @Override // j$.util.concurrent.Flow$Subscriber
        public void onNext(T t) {
            this.reactiveStreams.onNext(t);
        }

        @Override // j$.util.concurrent.Flow$Subscriber
        public void onError(Throwable th) {
            this.reactiveStreams.onError(th);
        }

        @Override // j$.util.concurrent.Flow$Subscriber
        public void onComplete() {
            this.reactiveStreams.onComplete();
        }
    }

    static final class ReactiveToFlowSubscriber<T> implements Subscriber<T> {
        final Flow$Subscriber<? super T> flow;

        public ReactiveToFlowSubscriber(Flow$Subscriber<? super T> flow$Subscriber) {
            this.flow = flow$Subscriber;
        }

        @Override // org.reactivestreams.Subscriber
        public void onSubscribe(Subscription subscription) {
            this.flow.onSubscribe(subscription == null ? null : new FlowToReactiveSubscription(subscription));
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            this.flow.onNext(t);
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            this.flow.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.flow.onComplete();
        }
    }

    static final class ReactiveToFlowProcessor<T, U> implements Processor<T, U> {
        final Flow$Processor<? super T, ? extends U> flow;

        public ReactiveToFlowProcessor(Flow$Processor<? super T, ? extends U> flow$Processor) {
            this.flow = flow$Processor;
        }

        @Override // org.reactivestreams.Subscriber
        public void onSubscribe(Subscription subscription) {
            this.flow.onSubscribe(subscription == null ? null : new FlowToReactiveSubscription(subscription));
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            this.flow.onNext(t);
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            this.flow.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.flow.onComplete();
        }

        @Override // org.reactivestreams.Publisher
        public void subscribe(Subscriber<? super U> subscriber) {
            this.flow.subscribe(subscriber == null ? null : new FlowToReactiveSubscriber(subscriber));
        }
    }

    static final class FlowToReactiveProcessor<T, U> implements Flow$Processor<T, U> {
        final Processor<? super T, ? extends U> reactiveStreams;

        public FlowToReactiveProcessor(Processor<? super T, ? extends U> processor) {
            this.reactiveStreams = processor;
        }

        @Override // j$.util.concurrent.Flow$Subscriber
        public void onSubscribe(Flow$Subscription flow$Subscription) {
            this.reactiveStreams.onSubscribe(flow$Subscription == null ? null : new ReactiveToFlowSubscription(flow$Subscription));
        }

        @Override // j$.util.concurrent.Flow$Subscriber
        public void onNext(T t) {
            this.reactiveStreams.onNext(t);
        }

        @Override // j$.util.concurrent.Flow$Subscriber
        public void onError(Throwable th) {
            this.reactiveStreams.onError(th);
        }

        @Override // j$.util.concurrent.Flow$Subscriber
        public void onComplete() {
            this.reactiveStreams.onComplete();
        }

        @Override // j$.util.concurrent.Flow$Publisher
        public void subscribe(Flow$Subscriber<? super U> flow$Subscriber) {
            this.reactiveStreams.subscribe(flow$Subscriber == null ? null : new ReactiveToFlowSubscriber(flow$Subscriber));
        }
    }

    static final class ReactivePublisherFromFlow<T> implements Publisher<T> {
        final Flow$Publisher<? extends T> flow;

        public ReactivePublisherFromFlow(Flow$Publisher<? extends T> flow$Publisher) {
            this.flow = flow$Publisher;
        }

        @Override // org.reactivestreams.Publisher
        public void subscribe(Subscriber<? super T> subscriber) {
            this.flow.subscribe(subscriber == null ? null : new FlowToReactiveSubscriber(subscriber));
        }
    }

    static final class FlowPublisherFromReactive<T> implements Flow$Publisher<T> {
        final Publisher<? extends T> reactiveStreams;

        public FlowPublisherFromReactive(Publisher<? extends T> publisher) {
            this.reactiveStreams = publisher;
        }

        @Override // j$.util.concurrent.Flow$Publisher
        public void subscribe(Flow$Subscriber<? super T> flow$Subscriber) {
            this.reactiveStreams.subscribe(flow$Subscriber == null ? null : new ReactiveToFlowSubscriber(flow$Subscriber));
        }
    }
}
