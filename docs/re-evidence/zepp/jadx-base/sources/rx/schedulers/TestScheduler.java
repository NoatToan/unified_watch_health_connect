package rx.schedulers;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.TimeUnit;
import rx.Scheduler;
import rx.Subscription;
import rx.functions.Action0;
import rx.internal.schedulers.SchedulePeriodicHelper;
import rx.subscriptions.BooleanSubscription;
import rx.subscriptions.Subscriptions;

/* JADX INFO: loaded from: classes23.dex */
public class TestScheduler extends Scheduler {
    public static long c;
    public final Queue<c> a = new PriorityQueue(11, new a());
    public long b;

    public static final class a implements Comparator<c> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(c cVar, c cVar2) {
            long j = cVar.a;
            long j2 = cVar2.a;
            if (j == j2) {
                if (cVar.d < cVar2.d) {
                    return -1;
                }
                return cVar.d > cVar2.d ? 1 : 0;
            }
            if (j < j2) {
                return -1;
            }
            return j > j2 ? 1 : 0;
        }
    }

    public static final class c {
        public final long a;
        public final Action0 b;
        public final Scheduler.Worker c;
        private final long d;

        public c(Scheduler.Worker worker, long j, Action0 action0) {
            long j2 = TestScheduler.c;
            TestScheduler.c = 1 + j2;
            this.d = j2;
            this.a = j;
            this.b = action0;
            this.c = worker;
        }

        public String toString() {
            return String.format("TimedAction(time = %d, action = %s)", Long.valueOf(this.a), this.b.toString());
        }
    }

    private void a(long j) {
        while (!this.a.isEmpty()) {
            c cVarPeek = this.a.peek();
            long j2 = cVarPeek.a;
            if (j2 > j) {
                break;
            }
            if (j2 == 0) {
                j2 = this.b;
            }
            this.b = j2;
            this.a.remove();
            if (!cVarPeek.c.isUnsubscribed()) {
                cVarPeek.b.call();
            }
        }
        this.b = j;
    }

    public void advanceTimeBy(long j, TimeUnit timeUnit) {
        advanceTimeTo(this.b + timeUnit.toNanos(j), TimeUnit.NANOSECONDS);
    }

    public void advanceTimeTo(long j, TimeUnit timeUnit) {
        a(timeUnit.toNanos(j));
    }

    @Override // rx.Scheduler
    public Scheduler.Worker createWorker() {
        return new b();
    }

    @Override // rx.Scheduler
    public long now() {
        return TimeUnit.NANOSECONDS.toMillis(this.b);
    }

    public void triggerActions() {
        a(this.b);
    }

    public final class b extends Scheduler.Worker implements SchedulePeriodicHelper.NowNanoSupplier {
        private final BooleanSubscription a = new BooleanSubscription();

        public class a implements Action0 {
            public final /* synthetic */ c a;

            public a(c cVar) {
                this.a = cVar;
            }

            @Override // rx.functions.Action0
            public void call() {
                TestScheduler.this.a.remove(this.a);
            }
        }

        /* JADX INFO: renamed from: rx.schedulers.TestScheduler$b$b, reason: collision with other inner class name */
        public class C1267b implements Action0 {
            public final /* synthetic */ c a;

            public C1267b(c cVar) {
                this.a = cVar;
            }

            @Override // rx.functions.Action0
            public void call() {
                TestScheduler.this.a.remove(this.a);
            }
        }

        public b() {
        }

        @Override // rx.Subscription
        public boolean isUnsubscribed() {
            return this.a.isUnsubscribed();
        }

        @Override // rx.Scheduler.Worker
        public long now() {
            return TestScheduler.this.now();
        }

        @Override // rx.internal.schedulers.SchedulePeriodicHelper.NowNanoSupplier
        public long nowNanos() {
            return TestScheduler.this.b;
        }

        @Override // rx.Scheduler.Worker
        public Subscription schedule(Action0 action0, long j, TimeUnit timeUnit) {
            c cVar = new c(this, TestScheduler.this.b + timeUnit.toNanos(j), action0);
            TestScheduler.this.a.add(cVar);
            return Subscriptions.create(new a(cVar));
        }

        @Override // rx.Scheduler.Worker
        public Subscription schedulePeriodically(Action0 action0, long j, long j2, TimeUnit timeUnit) {
            return SchedulePeriodicHelper.schedulePeriodically(this, action0, j, j2, timeUnit, this);
        }

        @Override // rx.Subscription
        public void unsubscribe() {
            this.a.unsubscribe();
        }

        @Override // rx.Scheduler.Worker
        public Subscription schedule(Action0 action0) {
            c cVar = new c(this, 0L, action0);
            TestScheduler.this.a.add(cVar);
            return Subscriptions.create(new C1267b(cVar));
        }
    }
}
