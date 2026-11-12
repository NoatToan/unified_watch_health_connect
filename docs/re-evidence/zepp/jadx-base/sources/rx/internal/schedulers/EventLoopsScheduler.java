package rx.internal.schedulers;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import rx.Scheduler;
import rx.Subscription;
import rx.functions.Action0;
import rx.internal.util.RxThreadFactory;
import rx.internal.util.SubscriptionList;
import rx.subscriptions.CompositeSubscription;
import rx.subscriptions.Subscriptions;

/* JADX INFO: loaded from: classes23.dex */
public final class EventLoopsScheduler extends Scheduler implements SchedulerLifecycle {
    public static final String c = "rx.scheduler.max-computation-threads";
    public static final int d;
    public static final c e;
    public static final b f;
    public final ThreadFactory a;
    public final AtomicReference<b> b = new AtomicReference<>(f);

    public static final class b {
        public final int a;
        public final c[] b;
        public long c;

        public b(ThreadFactory threadFactory, int i) {
            this.a = i;
            this.b = new c[i];
            for (int i2 = 0; i2 < i; i2++) {
                this.b[i2] = new c(threadFactory);
            }
        }

        public c a() {
            int i = this.a;
            if (i == 0) {
                return EventLoopsScheduler.e;
            }
            c[] cVarArr = this.b;
            long j = this.c;
            this.c = 1 + j;
            return cVarArr[(int) (j % ((long) i))];
        }

        public void b() {
            for (c cVar : this.b) {
                cVar.unsubscribe();
            }
        }
    }

    public static final class c extends NewThreadWorker {
        public c(ThreadFactory threadFactory) {
            super(threadFactory);
        }
    }

    static {
        int iIntValue = Integer.getInteger(c, 0).intValue();
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        if (iIntValue <= 0 || iIntValue > iAvailableProcessors) {
            iIntValue = iAvailableProcessors;
        }
        d = iIntValue;
        c cVar = new c(RxThreadFactory.NONE);
        e = cVar;
        cVar.unsubscribe();
        f = new b(null, 0);
    }

    public EventLoopsScheduler(ThreadFactory threadFactory) {
        this.a = threadFactory;
        start();
    }

    @Override // rx.Scheduler
    public Scheduler.Worker createWorker() {
        return new a(this.b.get().a());
    }

    public Subscription scheduleDirect(Action0 action0) {
        return this.b.get().a().scheduleActual(action0, -1L, TimeUnit.NANOSECONDS);
    }

    @Override // rx.internal.schedulers.SchedulerLifecycle
    public void shutdown() {
        b bVar;
        b bVar2;
        do {
            bVar = this.b.get();
            bVar2 = f;
            if (bVar == bVar2) {
                return;
            }
        } while (!this.b.compareAndSet(bVar, bVar2));
        bVar.b();
    }

    @Override // rx.internal.schedulers.SchedulerLifecycle
    public void start() {
        b bVar = new b(this.a, d);
        if (this.b.compareAndSet(f, bVar)) {
            return;
        }
        bVar.b();
    }

    public static final class a extends Scheduler.Worker {
        private final SubscriptionList a;
        private final CompositeSubscription b;
        private final SubscriptionList c;
        private final c d;

        /* JADX INFO: renamed from: rx.internal.schedulers.EventLoopsScheduler$a$a, reason: collision with other inner class name */
        public class C1263a implements Action0 {
            public final /* synthetic */ Action0 a;

            public C1263a(Action0 action0) {
                this.a = action0;
            }

            @Override // rx.functions.Action0
            public void call() {
                if (a.this.isUnsubscribed()) {
                    return;
                }
                this.a.call();
            }
        }

        public class b implements Action0 {
            public final /* synthetic */ Action0 a;

            public b(Action0 action0) {
                this.a = action0;
            }

            @Override // rx.functions.Action0
            public void call() {
                if (a.this.isUnsubscribed()) {
                    return;
                }
                this.a.call();
            }
        }

        public a(c cVar) {
            SubscriptionList subscriptionList = new SubscriptionList();
            this.a = subscriptionList;
            CompositeSubscription compositeSubscription = new CompositeSubscription();
            this.b = compositeSubscription;
            this.c = new SubscriptionList(subscriptionList, compositeSubscription);
            this.d = cVar;
        }

        @Override // rx.Subscription
        public boolean isUnsubscribed() {
            return this.c.isUnsubscribed();
        }

        @Override // rx.Scheduler.Worker
        public Subscription schedule(Action0 action0) {
            return isUnsubscribed() ? Subscriptions.unsubscribed() : this.d.scheduleActual(new C1263a(action0), 0L, (TimeUnit) null, this.a);
        }

        @Override // rx.Subscription
        public void unsubscribe() {
            this.c.unsubscribe();
        }

        @Override // rx.Scheduler.Worker
        public Subscription schedule(Action0 action0, long j, TimeUnit timeUnit) {
            if (isUnsubscribed()) {
                return Subscriptions.unsubscribed();
            }
            return this.d.scheduleActual(new b(action0), j, timeUnit, this.b);
        }
    }
}
