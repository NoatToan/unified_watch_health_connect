package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.schedulers.TrampolineScheduler;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes22.dex */
public final class FlowableIntervalRange extends Flowable<Long> {
    public final Scheduler b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final TimeUnit g;

    public static final class a extends AtomicLong implements Subscription, Runnable {
        private static final long serialVersionUID = -2809475196591179431L;
        public final Subscriber<? super Long> a;
        public final long b;
        public long c;
        public final AtomicReference<Disposable> d = new AtomicReference<>();

        public a(Subscriber<? super Long> subscriber, long j, long j2) {
            this.a = subscriber;
            this.c = j;
            this.b = j2;
        }

        public void a(Disposable disposable) {
            DisposableHelper.setOnce(this.d, disposable);
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            DisposableHelper.dispose(this.d);
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                BackpressureHelper.add(this, j);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            Disposable disposable = this.d.get();
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (disposable != disposableHelper) {
                long j = get();
                if (j == 0) {
                    this.a.onError(new MissingBackpressureException("Can't deliver value " + this.c + " due to lack of requests"));
                    DisposableHelper.dispose(this.d);
                    return;
                }
                long j2 = this.c;
                this.a.onNext(Long.valueOf(j2));
                if (j2 == this.b) {
                    if (this.d.get() != disposableHelper) {
                        this.a.onComplete();
                    }
                    DisposableHelper.dispose(this.d);
                } else {
                    this.c = j2 + 1;
                    if (j != Long.MAX_VALUE) {
                        decrementAndGet();
                    }
                }
            }
        }
    }

    public FlowableIntervalRange(long j, long j2, long j3, long j4, TimeUnit timeUnit, Scheduler scheduler) {
        this.e = j3;
        this.f = j4;
        this.g = timeUnit;
        this.b = scheduler;
        this.c = j;
        this.d = j2;
    }

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
    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super Long> subscriber) {
        a aVar = new a(subscriber, this.c, this.d);
        subscriber.onSubscribe(aVar);
        Scheduler scheduler = this.b;
        if (!(scheduler instanceof TrampolineScheduler)) {
            aVar.a(scheduler.schedulePeriodicallyDirect(aVar, this.e, this.f, this.g));
            return;
        }
        Scheduler.Worker workerCreateWorker = scheduler.createWorker();
        aVar.a(workerCreateWorker);
        workerCreateWorker.schedulePeriodically(aVar, this.e, this.f, this.g);
    }
}
