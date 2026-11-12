package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.internal.subscribers.QueueDrainSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.processors.UnicastProcessor;
import io.reactivex.subscribers.SerializedSubscriber;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes22.dex */
public final class FlowableWindowTimed<T> extends io.reactivex.internal.operators.flowable.a<T, Flowable<T>> {
    public final long b;
    public final long c;
    public final TimeUnit d;
    public final Scheduler e;
    public final long f;
    public final int g;
    public final boolean h;

    public static final class a<T> extends QueueDrainSubscriber<T, Object, Flowable<T>> implements Subscription {
        public final long V;
        public final TimeUnit W;
        public final Scheduler X;
        public final int Y;
        public final boolean Z;
        public final long m0;
        public final Scheduler.Worker n0;
        public long o0;
        public long p0;
        public Subscription q0;
        public UnicastProcessor<T> r0;
        public volatile boolean s0;
        public final SequentialDisposable t0;

        /* JADX INFO: renamed from: io.reactivex.internal.operators.flowable.FlowableWindowTimed$a$a, reason: collision with other inner class name */
        public static final class RunnableC1110a implements Runnable {
            public final long a;
            public final a<?> b;

            public RunnableC1110a(long j, a<?> aVar) {
                this.a = j;
                this.b = aVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                a<?> aVar = this.b;
                if (aVar.cancelled) {
                    aVar.s0 = true;
                    aVar.dispose();
                } else {
                    aVar.queue.offer(this);
                }
                if (aVar.enter()) {
                    aVar.c();
                }
            }
        }

        public a(Subscriber<? super Flowable<T>> subscriber, long j, TimeUnit timeUnit, Scheduler scheduler, int i, long j2, boolean z) {
            super(subscriber, new MpscLinkedQueue());
            this.t0 = new SequentialDisposable();
            this.V = j;
            this.W = timeUnit;
            this.X = scheduler;
            this.Y = i;
            this.m0 = j2;
            this.Z = z;
            if (z) {
                this.n0 = scheduler.createWorker();
            } else {
                this.n0 = null;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public void c() {
            UnicastProcessor<T> unicastProcessorCreate;
            SimpleQueue simpleQueue = this.queue;
            Subscriber<? super V> subscriber = this.downstream;
            UnicastProcessor<T> unicastProcessor = this.r0;
            int iLeave = 1;
            while (!this.s0) {
                boolean z = this.done;
                Object objPoll = simpleQueue.poll();
                boolean z2 = objPoll == null;
                boolean z3 = objPoll instanceof RunnableC1110a;
                if (z && (z2 || z3)) {
                    this.r0 = null;
                    simpleQueue.clear();
                    Throwable th = this.error;
                    if (th != null) {
                        ((UnicastProcessor) unicastProcessor).onError(th);
                    } else {
                        ((UnicastProcessor) unicastProcessor).onComplete();
                    }
                    dispose();
                    return;
                }
                if (z2) {
                    iLeave = leave(-iLeave);
                    if (iLeave == 0) {
                        return;
                    }
                } else {
                    int i = iLeave;
                    if (z3) {
                        RunnableC1110a runnableC1110a = (RunnableC1110a) objPoll;
                        if (this.Z || this.p0 == runnableC1110a.a) {
                            unicastProcessor = unicastProcessor;
                            ((UnicastProcessor) unicastProcessor).onComplete();
                            this.o0 = 0L;
                            unicastProcessorCreate = UnicastProcessor.create(this.Y);
                            this.r0 = unicastProcessorCreate;
                            long jRequested = requested();
                            if (jRequested == 0) {
                                this.r0 = null;
                                this.queue.clear();
                                this.q0.cancel();
                                subscriber.onError(new MissingBackpressureException("Could not deliver first window due to lack of requests."));
                                dispose();
                                return;
                            }
                            subscriber.onNext(unicastProcessorCreate);
                            if (jRequested != Long.MAX_VALUE) {
                                unicastProcessor = unicastProcessorCreate;
                                produced(1L);
                                unicastProcessor = unicastProcessorCreate;
                            }
                        }
                    } else {
                        ((UnicastProcessor) unicastProcessor).onNext(NotificationLite.getValue(objPoll));
                        long j = this.o0 + 1;
                        if (j >= this.m0) {
                            this.p0++;
                            this.o0 = 0L;
                            ((UnicastProcessor) unicastProcessor).onComplete();
                            long jRequested2 = requested();
                            if (jRequested2 == 0) {
                                this.r0 = null;
                                this.q0.cancel();
                                this.downstream.onError(new MissingBackpressureException("Could not deliver window due to lack of requests"));
                                dispose();
                                return;
                            }
                            UnicastProcessor<T> unicastProcessorCreate2 = UnicastProcessor.create(this.Y);
                            this.r0 = unicastProcessorCreate2;
                            this.downstream.onNext(unicastProcessorCreate2);
                            if (jRequested2 != Long.MAX_VALUE) {
                                produced(1L);
                            }
                            if (this.Z) {
                                this.t0.get().dispose();
                                Scheduler.Worker worker = this.n0;
                                RunnableC1110a runnableC1110a2 = new RunnableC1110a(this.p0, this);
                                long j2 = this.V;
                                this.t0.replace(worker.schedulePeriodically(runnableC1110a2, j2, j2, this.W));
                            }
                            unicastProcessor = unicastProcessorCreate2;
                        } else {
                            this.o0 = j;
                            unicastProcessor = unicastProcessor;
                        }
                    }
                    unicastProcessor = unicastProcessorCreate;
                    unicastProcessor = unicastProcessor;
                    iLeave = i;
                }
            }
            this.q0.cancel();
            simpleQueue.clear();
            dispose();
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            this.cancelled = true;
        }

        public void dispose() {
            DisposableHelper.dispose(this.t0);
            Scheduler.Worker worker = this.n0;
            if (worker != null) {
                worker.dispose();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.done = true;
            if (enter()) {
                c();
            }
            this.downstream.onComplete();
            dispose();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            this.error = th;
            this.done = true;
            if (enter()) {
                c();
            }
            this.downstream.onError(th);
            dispose();
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            if (this.s0) {
                return;
            }
            if (fastEnter()) {
                UnicastProcessor<T> unicastProcessor = this.r0;
                unicastProcessor.onNext(t);
                long j = this.o0 + 1;
                if (j >= this.m0) {
                    this.p0++;
                    this.o0 = 0L;
                    unicastProcessor.onComplete();
                    long jRequested = requested();
                    if (jRequested == 0) {
                        this.r0 = null;
                        this.q0.cancel();
                        this.downstream.onError(new MissingBackpressureException("Could not deliver window due to lack of requests"));
                        dispose();
                        return;
                    }
                    UnicastProcessor<T> unicastProcessorCreate = UnicastProcessor.create(this.Y);
                    this.r0 = unicastProcessorCreate;
                    this.downstream.onNext(unicastProcessorCreate);
                    if (jRequested != Long.MAX_VALUE) {
                        produced(1L);
                    }
                    if (this.Z) {
                        this.t0.get().dispose();
                        Scheduler.Worker worker = this.n0;
                        RunnableC1110a runnableC1110a = new RunnableC1110a(this.p0, this);
                        long j2 = this.V;
                        this.t0.replace(worker.schedulePeriodically(runnableC1110a, j2, j2, this.W));
                    }
                } else {
                    this.o0 = j;
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
            c();
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(Subscription subscription) {
            Disposable disposableSchedulePeriodicallyDirect;
            if (SubscriptionHelper.validate(this.q0, subscription)) {
                this.q0 = subscription;
                Subscriber<? super V> subscriber = this.downstream;
                subscriber.onSubscribe(this);
                if (this.cancelled) {
                    return;
                }
                UnicastProcessor<T> unicastProcessorCreate = UnicastProcessor.create(this.Y);
                this.r0 = unicastProcessorCreate;
                long jRequested = requested();
                if (jRequested == 0) {
                    this.cancelled = true;
                    subscription.cancel();
                    subscriber.onError(new MissingBackpressureException("Could not deliver initial window due to lack of requests."));
                    return;
                }
                subscriber.onNext(unicastProcessorCreate);
                if (jRequested != Long.MAX_VALUE) {
                    produced(1L);
                }
                RunnableC1110a runnableC1110a = new RunnableC1110a(this.p0, this);
                if (this.Z) {
                    Scheduler.Worker worker = this.n0;
                    long j = this.V;
                    disposableSchedulePeriodicallyDirect = worker.schedulePeriodically(runnableC1110a, j, j, this.W);
                } else {
                    Scheduler scheduler = this.X;
                    long j2 = this.V;
                    disposableSchedulePeriodicallyDirect = scheduler.schedulePeriodicallyDirect(runnableC1110a, j2, j2, this.W);
                }
                if (this.t0.replace(disposableSchedulePeriodicallyDirect)) {
                    subscription.request(Long.MAX_VALUE);
                }
            }
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j) {
            requested(j);
        }
    }

    public static final class b<T> extends QueueDrainSubscriber<T, Object, Flowable<T>> implements FlowableSubscriber<T>, Subscription, Runnable {
        public static final Object p0 = new Object();
        public final long V;
        public final TimeUnit W;
        public final Scheduler X;
        public final int Y;
        public Subscription Z;
        public UnicastProcessor<T> m0;
        public final SequentialDisposable n0;
        public volatile boolean o0;

        public b(Subscriber<? super Flowable<T>> subscriber, long j, TimeUnit timeUnit, Scheduler scheduler, int i) {
            super(subscriber, new MpscLinkedQueue());
            this.n0 = new SequentialDisposable();
            this.V = j;
            this.W = timeUnit;
            this.X = scheduler;
            this.Y = i;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [io.reactivex.processors.UnicastProcessor<T>] */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public void a() {
            SimpleQueue simpleQueue = this.queue;
            Subscriber<? super V> subscriber = this.downstream;
            UnicastProcessor<T> unicastProcessor = this.m0;
            int iLeave = 1;
            while (true) {
                boolean z = this.o0;
                boolean z2 = this.done;
                Object objPoll = simpleQueue.poll();
                if (z2 && (objPoll == null || objPoll == p0)) {
                    break;
                }
                if (objPoll == null) {
                    iLeave = leave(-iLeave);
                    if (iLeave == 0) {
                        return;
                    }
                } else if (objPoll == p0) {
                    unicastProcessor.onComplete();
                    if (z) {
                        this.Z.cancel();
                    } else {
                        unicastProcessor = (UnicastProcessor<T>) UnicastProcessor.create(this.Y);
                        this.m0 = unicastProcessor;
                        long jRequested = requested();
                        if (jRequested == 0) {
                            this.m0 = null;
                            this.queue.clear();
                            this.Z.cancel();
                            dispose();
                            subscriber.onError(new MissingBackpressureException("Could not deliver first window due to lack of requests."));
                            return;
                        }
                        subscriber.onNext(unicastProcessor);
                        if (jRequested != Long.MAX_VALUE) {
                            produced(1L);
                        }
                    }
                } else {
                    unicastProcessor.onNext(NotificationLite.getValue(objPoll));
                }
            }
            this.m0 = null;
            simpleQueue.clear();
            dispose();
            Throwable th = this.error;
            if (th != null) {
                unicastProcessor.onError(th);
            } else {
                unicastProcessor.onComplete();
            }
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            this.cancelled = true;
        }

        public void dispose() {
            DisposableHelper.dispose(this.n0);
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.done = true;
            if (enter()) {
                a();
            }
            this.downstream.onComplete();
            dispose();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            this.error = th;
            this.done = true;
            if (enter()) {
                a();
            }
            this.downstream.onError(th);
            dispose();
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            if (this.o0) {
                return;
            }
            if (fastEnter()) {
                this.m0.onNext(t);
                if (leave(-1) == 0) {
                    return;
                }
            } else {
                this.queue.offer((U) NotificationLite.next(t));
                if (!enter()) {
                    return;
                }
            }
            a();
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.Z, subscription)) {
                this.Z = subscription;
                this.m0 = UnicastProcessor.create(this.Y);
                Subscriber<? super V> subscriber = this.downstream;
                subscriber.onSubscribe(this);
                long jRequested = requested();
                if (jRequested == 0) {
                    this.cancelled = true;
                    subscription.cancel();
                    subscriber.onError(new MissingBackpressureException("Could not deliver first window due to lack of requests."));
                    return;
                }
                subscriber.onNext(this.m0);
                if (jRequested != Long.MAX_VALUE) {
                    produced(1L);
                }
                if (this.cancelled) {
                    return;
                }
                SequentialDisposable sequentialDisposable = this.n0;
                Scheduler scheduler = this.X;
                long j = this.V;
                if (sequentialDisposable.replace(scheduler.schedulePeriodicallyDirect(this, j, j, this.W))) {
                    subscription.request(Long.MAX_VALUE);
                }
            }
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j) {
            requested(j);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // java.lang.Runnable
        public void run() {
            if (this.cancelled) {
                this.o0 = true;
                dispose();
            }
            this.queue.offer((U) p0);
            if (enter()) {
                a();
            }
        }
    }

    public static final class c<T> extends QueueDrainSubscriber<T, Object, Flowable<T>> implements Subscription, Runnable {
        public final long V;
        public final long W;
        public final TimeUnit X;
        public final Scheduler.Worker Y;
        public final int Z;
        public final List<UnicastProcessor<T>> m0;
        public Subscription n0;
        public volatile boolean o0;

        public final class a implements Runnable {
            private final UnicastProcessor<T> a;

            public a(UnicastProcessor<T> unicastProcessor) {
                this.a = unicastProcessor;
            }

            @Override // java.lang.Runnable
            public void run() {
                c.this.a(this.a);
            }
        }

        public static final class b<T> {
            public final UnicastProcessor<T> a;
            public final boolean b;

            public b(UnicastProcessor<T> unicastProcessor, boolean z) {
                this.a = unicastProcessor;
                this.b = z;
            }
        }

        public c(Subscriber<? super Flowable<T>> subscriber, long j, long j2, TimeUnit timeUnit, Scheduler.Worker worker, int i) {
            super(subscriber, new MpscLinkedQueue());
            this.V = j;
            this.W = j2;
            this.X = timeUnit;
            this.Y = worker;
            this.Z = i;
            this.m0 = new LinkedList();
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        public void a(UnicastProcessor<T> unicastProcessor) {
            this.queue.offer((U) new b(unicastProcessor, false));
            if (enter()) {
                b();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference incomplete: some casts might be missing */
        public void b() {
            SimpleQueue simpleQueue = this.queue;
            Subscriber<? super V> subscriber = this.downstream;
            List<UnicastProcessor<T>> list = this.m0;
            int iLeave = 1;
            while (!this.o0) {
                boolean z = this.done;
                Object objPoll = simpleQueue.poll();
                boolean z2 = objPoll == null;
                boolean z3 = objPoll instanceof b;
                if (z && (z2 || z3)) {
                    simpleQueue.clear();
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
                    dispose();
                    return;
                }
                if (z2) {
                    iLeave = leave(-iLeave);
                    if (iLeave == 0) {
                        return;
                    }
                } else if (z3) {
                    b bVar = (b) objPoll;
                    if (!bVar.b) {
                        list.remove(bVar.a);
                        bVar.a.onComplete();
                        if (list.isEmpty() && this.cancelled) {
                            this.o0 = true;
                        }
                    } else if (!this.cancelled) {
                        long jRequested = requested();
                        if (jRequested != 0) {
                            UnicastProcessor<T> unicastProcessorCreate = UnicastProcessor.create(this.Z);
                            list.add(unicastProcessorCreate);
                            subscriber.onNext(unicastProcessorCreate);
                            if (jRequested != Long.MAX_VALUE) {
                                produced(1L);
                            }
                            this.Y.schedule(new a(unicastProcessorCreate), this.V, this.X);
                        } else {
                            subscriber.onError(new MissingBackpressureException("Can't emit window due to lack of requests"));
                        }
                    }
                } else {
                    Iterator<UnicastProcessor<T>> it4 = list.iterator();
                    while (it4.hasNext()) {
                        it4.next().onNext(objPoll);
                    }
                }
            }
            this.n0.cancel();
            dispose();
            simpleQueue.clear();
            list.clear();
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            this.cancelled = true;
        }

        public void dispose() {
            this.Y.dispose();
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.done = true;
            if (enter()) {
                b();
            }
            this.downstream.onComplete();
            dispose();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            this.error = th;
            this.done = true;
            if (enter()) {
                b();
            }
            this.downstream.onError(th);
            dispose();
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            if (fastEnter()) {
                Iterator<UnicastProcessor<T>> it2 = this.m0.iterator();
                while (it2.hasNext()) {
                    it2.next().onNext(t);
                }
                if (leave(-1) == 0) {
                    return;
                }
            } else {
                this.queue.offer((U) t);
                if (!enter()) {
                    return;
                }
            }
            b();
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.n0, subscription)) {
                this.n0 = subscription;
                this.downstream.onSubscribe(this);
                if (this.cancelled) {
                    return;
                }
                long jRequested = requested();
                if (jRequested == 0) {
                    subscription.cancel();
                    this.downstream.onError(new MissingBackpressureException("Could not emit the first window due to lack of requests"));
                    return;
                }
                UnicastProcessor<T> unicastProcessorCreate = UnicastProcessor.create(this.Z);
                this.m0.add(unicastProcessorCreate);
                this.downstream.onNext(unicastProcessorCreate);
                if (jRequested != Long.MAX_VALUE) {
                    produced(1L);
                }
                this.Y.schedule(new a(unicastProcessorCreate), this.V, this.X);
                Scheduler.Worker worker = this.Y;
                long j = this.W;
                worker.schedulePeriodically(this, j, j, this.X);
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j) {
            requested(j);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // java.lang.Runnable
        public void run() {
            Object bVar = new b(UnicastProcessor.create(this.Z), true);
            if (!this.cancelled) {
                this.queue.offer((U) bVar);
            }
            if (enter()) {
                b();
            }
        }
    }

    public FlowableWindowTimed(Flowable<T> flowable, long j, long j2, TimeUnit timeUnit, Scheduler scheduler, long j3, int i, boolean z) {
        super(flowable);
        this.b = j;
        this.c = j2;
        this.d = timeUnit;
        this.e = scheduler;
        this.f = j3;
        this.g = i;
        this.h = z;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super Flowable<T>> subscriber) {
        SerializedSubscriber serializedSubscriber = new SerializedSubscriber(subscriber);
        long j = this.b;
        long j2 = this.c;
        if (j != j2) {
            this.source.subscribe((FlowableSubscriber) new c(serializedSubscriber, j, j2, this.d, this.e.createWorker(), this.g));
            return;
        }
        long j3 = this.f;
        if (j3 == Long.MAX_VALUE) {
            this.source.subscribe((FlowableSubscriber) new b(serializedSubscriber, this.b, this.d, this.e, this.g));
        } else {
            this.source.subscribe((FlowableSubscriber) new a(serializedSubscriber, j, this.d, this.e, this.g, j3, this.h));
        }
    }
}
