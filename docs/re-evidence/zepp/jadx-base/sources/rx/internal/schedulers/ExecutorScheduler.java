package rx.internal.schedulers;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import rx.Scheduler;
import rx.Subscription;
import rx.functions.Action0;
import rx.plugins.RxJavaHooks;
import rx.subscriptions.CompositeSubscription;
import rx.subscriptions.MultipleAssignmentSubscription;
import rx.subscriptions.Subscriptions;

/* JADX INFO: loaded from: classes23.dex */
public final class ExecutorScheduler extends Scheduler {
    public final Executor a;

    public ExecutorScheduler(Executor executor) {
        this.a = executor;
    }

    @Override // rx.Scheduler
    public Scheduler.Worker createWorker() {
        return new a(this.a);
    }

    public static final class a extends Scheduler.Worker implements Runnable {
        public final Executor a;
        public final ConcurrentLinkedQueue<ScheduledAction> c = new ConcurrentLinkedQueue<>();
        public final AtomicInteger d = new AtomicInteger();
        public final CompositeSubscription b = new CompositeSubscription();
        public final ScheduledExecutorService e = GenericScheduledExecutorService.getInstance();

        /* JADX INFO: renamed from: rx.internal.schedulers.ExecutorScheduler$a$a, reason: collision with other inner class name */
        public class C1264a implements Action0 {
            public final /* synthetic */ MultipleAssignmentSubscription a;

            public C1264a(MultipleAssignmentSubscription multipleAssignmentSubscription) {
                this.a = multipleAssignmentSubscription;
            }

            @Override // rx.functions.Action0
            public void call() {
                a.this.b.remove(this.a);
            }
        }

        public class b implements Action0 {
            public final /* synthetic */ MultipleAssignmentSubscription a;
            public final /* synthetic */ Action0 b;
            public final /* synthetic */ Subscription c;

            public b(MultipleAssignmentSubscription multipleAssignmentSubscription, Action0 action0, Subscription subscription) {
                this.a = multipleAssignmentSubscription;
                this.b = action0;
                this.c = subscription;
            }

            @Override // rx.functions.Action0
            public void call() {
                if (this.a.isUnsubscribed()) {
                    return;
                }
                Subscription subscriptionSchedule = a.this.schedule(this.b);
                this.a.set(subscriptionSchedule);
                if (subscriptionSchedule.getClass() == ScheduledAction.class) {
                    ((ScheduledAction) subscriptionSchedule).add(this.c);
                }
            }
        }

        public a(Executor executor) {
            this.a = executor;
        }

        @Override // rx.Subscription
        public boolean isUnsubscribed() {
            return this.b.isUnsubscribed();
        }

        @Override // java.lang.Runnable
        public void run() {
            while (!this.b.isUnsubscribed()) {
                ScheduledAction scheduledActionPoll = this.c.poll();
                if (scheduledActionPoll == null) {
                    return;
                }
                if (!scheduledActionPoll.isUnsubscribed()) {
                    if (this.b.isUnsubscribed()) {
                        this.c.clear();
                        return;
                    }
                    scheduledActionPoll.run();
                }
                if (this.d.decrementAndGet() == 0) {
                    return;
                }
            }
            this.c.clear();
        }

        @Override // rx.Scheduler.Worker
        public Subscription schedule(Action0 action0) {
            if (isUnsubscribed()) {
                return Subscriptions.unsubscribed();
            }
            ScheduledAction scheduledAction = new ScheduledAction(RxJavaHooks.onScheduledAction(action0), this.b);
            this.b.add(scheduledAction);
            this.c.offer(scheduledAction);
            if (this.d.getAndIncrement() == 0) {
                try {
                    this.a.execute(this);
                } catch (RejectedExecutionException e) {
                    this.b.remove(scheduledAction);
                    this.d.decrementAndGet();
                    RxJavaHooks.onError(e);
                    throw e;
                }
            }
            return scheduledAction;
        }

        @Override // rx.Subscription
        public void unsubscribe() {
            this.b.unsubscribe();
            this.c.clear();
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
        @Override // rx.Scheduler.Worker
        public Subscription schedule(Action0 action0, long j, TimeUnit timeUnit) {
            if (j <= 0) {
                return schedule(action0);
            }
            if (isUnsubscribed()) {
                return Subscriptions.unsubscribed();
            }
            Action0 action0OnScheduledAction = RxJavaHooks.onScheduledAction(action0);
            MultipleAssignmentSubscription multipleAssignmentSubscription = new MultipleAssignmentSubscription();
            MultipleAssignmentSubscription multipleAssignmentSubscription2 = new MultipleAssignmentSubscription();
            multipleAssignmentSubscription2.set(multipleAssignmentSubscription);
            this.b.add(multipleAssignmentSubscription2);
            Subscription subscriptionCreate = Subscriptions.create(new C1264a(multipleAssignmentSubscription2));
            ScheduledAction scheduledAction = new ScheduledAction(new b(multipleAssignmentSubscription2, action0OnScheduledAction, subscriptionCreate));
            multipleAssignmentSubscription.set(scheduledAction);
            try {
                scheduledAction.add(this.e.schedule(scheduledAction, j, timeUnit));
                return subscriptionCreate;
            } catch (RejectedExecutionException e) {
                RxJavaHooks.onError(e);
                throw e;
            }
        }
    }
}
