package rx.internal.operators;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import rx.Completable;
import rx.CompletableSubscriber;
import rx.Scheduler;
import rx.Subscription;
import rx.functions.Action0;
import rx.plugins.RxJavaHooks;
import rx.subscriptions.CompositeSubscription;

/* JADX INFO: loaded from: classes23.dex */
public final class CompletableOnSubscribeTimeout implements Completable.OnSubscribe {
    public final Completable a;
    public final long b;
    public final TimeUnit c;
    public final Scheduler d;
    public final Completable e;

    public class a implements Action0 {
        public final /* synthetic */ AtomicBoolean a;
        public final /* synthetic */ CompositeSubscription b;
        public final /* synthetic */ CompletableSubscriber c;

        /* JADX INFO: renamed from: rx.internal.operators.CompletableOnSubscribeTimeout$a$a, reason: collision with other inner class name */
        public class C1230a implements CompletableSubscriber {
            public C1230a() {
            }

            @Override // rx.CompletableSubscriber
            public void onCompleted() {
                a.this.b.unsubscribe();
                a.this.c.onCompleted();
            }

            @Override // rx.CompletableSubscriber
            public void onError(Throwable th) {
                a.this.b.unsubscribe();
                a.this.c.onError(th);
            }

            @Override // rx.CompletableSubscriber
            public void onSubscribe(Subscription subscription) {
                a.this.b.add(subscription);
            }
        }

        public a(AtomicBoolean atomicBoolean, CompositeSubscription compositeSubscription, CompletableSubscriber completableSubscriber) {
            this.a = atomicBoolean;
            this.b = compositeSubscription;
            this.c = completableSubscriber;
        }

        @Override // rx.functions.Action0
        public void call() {
            if (this.a.compareAndSet(false, true)) {
                this.b.clear();
                Completable completable = CompletableOnSubscribeTimeout.this.e;
                if (completable == null) {
                    this.c.onError(new TimeoutException());
                } else {
                    completable.unsafeSubscribe(new C1230a());
                }
            }
        }
    }

    public class b implements CompletableSubscriber {
        public final /* synthetic */ CompositeSubscription a;
        public final /* synthetic */ AtomicBoolean b;
        public final /* synthetic */ CompletableSubscriber c;

        public b(CompositeSubscription compositeSubscription, AtomicBoolean atomicBoolean, CompletableSubscriber completableSubscriber) {
            this.a = compositeSubscription;
            this.b = atomicBoolean;
            this.c = completableSubscriber;
        }

        @Override // rx.CompletableSubscriber
        public void onCompleted() {
            if (this.b.compareAndSet(false, true)) {
                this.a.unsubscribe();
                this.c.onCompleted();
            }
        }

        @Override // rx.CompletableSubscriber
        public void onError(Throwable th) {
            if (!this.b.compareAndSet(false, true)) {
                RxJavaHooks.onError(th);
            } else {
                this.a.unsubscribe();
                this.c.onError(th);
            }
        }

        @Override // rx.CompletableSubscriber
        public void onSubscribe(Subscription subscription) {
            this.a.add(subscription);
        }
    }

    public CompletableOnSubscribeTimeout(Completable completable, long j, TimeUnit timeUnit, Scheduler scheduler, Completable completable2) {
        this.a = completable;
        this.b = j;
        this.c = timeUnit;
        this.d = scheduler;
        this.e = completable2;
    }

    @Override // rx.functions.Action1
    public void call(CompletableSubscriber completableSubscriber) {
        CompositeSubscription compositeSubscription = new CompositeSubscription();
        completableSubscriber.onSubscribe(compositeSubscription);
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        Scheduler.Worker workerCreateWorker = this.d.createWorker();
        compositeSubscription.add(workerCreateWorker);
        workerCreateWorker.schedule(new a(atomicBoolean, compositeSubscription, completableSubscriber), this.b, this.c);
        this.a.unsafeSubscribe(new b(compositeSubscription, atomicBoolean, completableSubscriber));
    }
}
