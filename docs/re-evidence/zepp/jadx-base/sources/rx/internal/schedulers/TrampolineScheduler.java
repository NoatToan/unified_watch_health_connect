package rx.internal.schedulers;

import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import rx.Scheduler;
import rx.Subscription;
import rx.functions.Action0;
import rx.subscriptions.BooleanSubscription;
import rx.subscriptions.Subscriptions;

/* JADX INFO: loaded from: classes23.dex */
public final class TrampolineScheduler extends Scheduler {
    public static final TrampolineScheduler INSTANCE = new TrampolineScheduler();

    public static final class a extends Scheduler.Worker implements Subscription {
        public final AtomicInteger a = new AtomicInteger();
        public final PriorityBlockingQueue<b> b = new PriorityBlockingQueue<>();
        private final BooleanSubscription c = new BooleanSubscription();
        private final AtomicInteger d = new AtomicInteger();

        /* JADX INFO: renamed from: rx.internal.schedulers.TrampolineScheduler$a$a, reason: collision with other inner class name */
        public class C1266a implements Action0 {
            public final /* synthetic */ b a;

            public C1266a(b bVar) {
                this.a = bVar;
            }

            @Override // rx.functions.Action0
            public void call() {
                a.this.b.remove(this.a);
            }
        }

        private Subscription a(Action0 action0, long j) {
            if (this.c.isUnsubscribed()) {
                return Subscriptions.unsubscribed();
            }
            b bVar = new b(action0, Long.valueOf(j), this.a.incrementAndGet());
            this.b.add(bVar);
            if (this.d.getAndIncrement() != 0) {
                return Subscriptions.create(new C1266a(bVar));
            }
            do {
                b bVarPoll = this.b.poll();
                if (bVarPoll != null) {
                    bVarPoll.a.call();
                }
            } while (this.d.decrementAndGet() > 0);
            return Subscriptions.unsubscribed();
        }

        @Override // rx.Subscription
        public boolean isUnsubscribed() {
            return this.c.isUnsubscribed();
        }

        @Override // rx.Scheduler.Worker
        public Subscription schedule(Action0 action0) {
            return a(action0, now());
        }

        @Override // rx.Subscription
        public void unsubscribe() {
            this.c.unsubscribe();
        }

        @Override // rx.Scheduler.Worker
        public Subscription schedule(Action0 action0, long j, TimeUnit timeUnit) {
            long jNow = now() + timeUnit.toMillis(j);
            return a(new rx.internal.schedulers.b(action0, this, jNow), jNow);
        }
    }

    public static final class b implements Comparable<b> {
        public final Action0 a;
        public final Long b;
        public final int c;

        public b(Action0 action0, Long l, int i) {
            this.a = action0;
            this.b = l;
            this.c = i;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            int iCompareTo = this.b.compareTo(bVar.b);
            return iCompareTo == 0 ? TrampolineScheduler.a(this.c, bVar.c) : iCompareTo;
        }
    }

    private TrampolineScheduler() {
    }

    public static int a(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    @Override // rx.Scheduler
    public Scheduler.Worker createWorker() {
        return new a();
    }
}
