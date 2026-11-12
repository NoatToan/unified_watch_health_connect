package rx.internal.schedulers;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import rx.Completable;
import rx.CompletableSubscriber;
import rx.Observable;
import rx.Observer;
import rx.Scheduler;
import rx.Subscription;
import rx.functions.Action0;
import rx.functions.Func1;
import rx.internal.operators.BufferUntilSubscriber;
import rx.observers.SerializedObserver;
import rx.subjects.PublishSubject;
import rx.subscriptions.Subscriptions;

/* JADX INFO: loaded from: classes23.dex */
public class SchedulerWhen extends Scheduler implements Subscription {
    public static final Subscription d = new c();
    public static final Subscription e = Subscriptions.unsubscribed();
    private final Scheduler a;
    private final Observer<Observable<Completable>> b;
    private final Subscription c;

    public class a implements Func1<g, Completable> {
        public final /* synthetic */ Scheduler.Worker a;

        /* JADX INFO: renamed from: rx.internal.schedulers.SchedulerWhen$a$a, reason: collision with other inner class name */
        public class C1265a implements Completable.OnSubscribe {
            public final /* synthetic */ g a;

            public C1265a(g gVar) {
                this.a = gVar;
            }

            @Override // rx.functions.Action1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void call(CompletableSubscriber completableSubscriber) {
                completableSubscriber.onSubscribe(this.a);
                this.a.b(a.this.a, completableSubscriber);
            }
        }

        public a(Scheduler.Worker worker) {
            this.a = worker;
        }

        @Override // rx.functions.Func1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Completable call(g gVar) {
            return Completable.create(new C1265a(gVar));
        }
    }

    public static class c implements Subscription {
        @Override // rx.Subscription
        public boolean isUnsubscribed() {
            return false;
        }

        @Override // rx.Subscription
        public void unsubscribe() {
        }
    }

    public static class d extends g {
        private final Action0 a;
        private final long b;
        private final TimeUnit c;

        public d(Action0 action0, long j, TimeUnit timeUnit) {
            this.a = action0;
            this.b = j;
            this.c = timeUnit;
        }

        @Override // rx.internal.schedulers.SchedulerWhen.g
        public Subscription c(Scheduler.Worker worker, CompletableSubscriber completableSubscriber) {
            return worker.schedule(new f(this.a, completableSubscriber), this.b, this.c);
        }
    }

    public static class e extends g {
        private final Action0 a;

        public e(Action0 action0) {
            this.a = action0;
        }

        @Override // rx.internal.schedulers.SchedulerWhen.g
        public Subscription c(Scheduler.Worker worker, CompletableSubscriber completableSubscriber) {
            return worker.schedule(new f(this.a, completableSubscriber));
        }
    }

    public static class f implements Action0 {
        private CompletableSubscriber a;
        private Action0 b;

        public f(Action0 action0, CompletableSubscriber completableSubscriber) {
            this.b = action0;
            this.a = completableSubscriber;
        }

        @Override // rx.functions.Action0
        public void call() {
            try {
                this.b.call();
            } finally {
                this.a.onCompleted();
            }
        }
    }

    public static abstract class g extends AtomicReference<Subscription> implements Subscription {
        public g() {
            super(SchedulerWhen.d);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(Scheduler.Worker worker, CompletableSubscriber completableSubscriber) {
            Subscription subscription;
            Subscription subscription2 = get();
            if (subscription2 != SchedulerWhen.e && subscription2 == (subscription = SchedulerWhen.d)) {
                Subscription subscriptionC = c(worker, completableSubscriber);
                if (compareAndSet(subscription, subscriptionC)) {
                    return;
                }
                subscriptionC.unsubscribe();
            }
        }

        public abstract Subscription c(Scheduler.Worker worker, CompletableSubscriber completableSubscriber);

        @Override // rx.Subscription
        public boolean isUnsubscribed() {
            return get().isUnsubscribed();
        }

        @Override // rx.Subscription
        public void unsubscribe() {
            Subscription subscription;
            Subscription subscription2 = SchedulerWhen.e;
            do {
                subscription = get();
                if (subscription == SchedulerWhen.e) {
                    return;
                }
            } while (!compareAndSet(subscription, subscription2));
            if (subscription != SchedulerWhen.d) {
                subscription.unsubscribe();
            }
        }
    }

    public SchedulerWhen(Func1<Observable<Observable<Completable>>, Completable> func1, Scheduler scheduler) {
        this.a = scheduler;
        PublishSubject publishSubjectCreate = PublishSubject.create();
        this.b = new SerializedObserver(publishSubjectCreate);
        this.c = func1.call(publishSubjectCreate.onBackpressureBuffer()).subscribe();
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
    @Override // rx.Scheduler
    public Scheduler.Worker createWorker() {
        Scheduler.Worker workerCreateWorker = this.a.createWorker();
        BufferUntilSubscriber bufferUntilSubscriberCreate = BufferUntilSubscriber.create();
        SerializedObserver serializedObserver = new SerializedObserver(bufferUntilSubscriberCreate);
        Object map = bufferUntilSubscriberCreate.map(new a(workerCreateWorker));
        b bVar = new b(workerCreateWorker, serializedObserver);
        this.b.onNext(map);
        return bVar;
    }

    @Override // rx.Subscription
    public boolean isUnsubscribed() {
        return this.c.isUnsubscribed();
    }

    @Override // rx.Subscription
    public void unsubscribe() {
        this.c.unsubscribe();
    }

    public class b extends Scheduler.Worker {
        private final AtomicBoolean a = new AtomicBoolean();
        public final /* synthetic */ Scheduler.Worker b;
        public final /* synthetic */ Observer c;

        public b(Scheduler.Worker worker, Observer observer) {
            this.b = worker;
            this.c = observer;
        }

        @Override // rx.Subscription
        public boolean isUnsubscribed() {
            return this.a.get();
        }

        @Override // rx.Scheduler.Worker
        public Subscription schedule(Action0 action0, long j, TimeUnit timeUnit) {
            d dVar = new d(action0, j, timeUnit);
            this.c.onNext(dVar);
            return dVar;
        }

        @Override // rx.Subscription
        public void unsubscribe() {
            if (this.a.compareAndSet(false, true)) {
                this.b.unsubscribe();
                this.c.onCompleted();
            }
        }

        @Override // rx.Scheduler.Worker
        public Subscription schedule(Action0 action0) {
            e eVar = new e(action0);
            this.c.onNext(eVar);
            return eVar;
        }
    }
}
