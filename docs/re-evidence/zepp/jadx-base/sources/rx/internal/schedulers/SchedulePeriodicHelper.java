package rx.internal.schedulers;

import java.util.concurrent.TimeUnit;
import rx.Scheduler;
import rx.Subscription;
import rx.functions.Action0;
import rx.internal.subscriptions.SequentialSubscription;

/* JADX INFO: loaded from: classes23.dex */
public final class SchedulePeriodicHelper {
    public static final long CLOCK_DRIFT_TOLERANCE_NANOS = TimeUnit.MINUTES.toNanos(Long.getLong("rx.scheduler.drift-tolerance", 15).longValue());

    public interface NowNanoSupplier {
        long nowNanos();
    }

    public static class a implements Action0 {
        public long a;
        public long b;
        public long c;
        public final /* synthetic */ long d;
        public final /* synthetic */ long e;
        public final /* synthetic */ Action0 f;
        public final /* synthetic */ SequentialSubscription g;
        public final /* synthetic */ NowNanoSupplier h;
        public final /* synthetic */ Scheduler.Worker i;
        public final /* synthetic */ long j;

        public a(long j, long j2, Action0 action0, SequentialSubscription sequentialSubscription, NowNanoSupplier nowNanoSupplier, Scheduler.Worker worker, long j3) {
            this.d = j;
            this.e = j2;
            this.f = action0;
            this.g = sequentialSubscription;
            this.h = nowNanoSupplier;
            this.i = worker;
            this.j = j3;
            this.b = j;
            this.c = j2;
        }

        /* JADX WARN: Code duplicated, block: B:14:0x0042  */
        @Override // rx.functions.Action0
        public void call() {
            long j;
            this.f.call();
            if (this.g.isUnsubscribed()) {
                return;
            }
            NowNanoSupplier nowNanoSupplier = this.h;
            long jNowNanos = nowNanoSupplier != null ? nowNanoSupplier.nowNanos() : TimeUnit.MILLISECONDS.toNanos(this.i.now());
            long j2 = SchedulePeriodicHelper.CLOCK_DRIFT_TOLERANCE_NANOS;
            long j3 = jNowNanos + j2;
            long j4 = this.b;
            if (j3 >= j4) {
                long j5 = this.j;
                if (jNowNanos >= j4 + j5 + j2) {
                    long j6 = this.j;
                    long j7 = jNowNanos + j6;
                    long j8 = this.a + 1;
                    this.a = j8;
                    this.c = j7 - (j6 * j8);
                    j = j7;
                } else {
                    long j9 = this.c;
                    long j10 = this.a + 1;
                    this.a = j10;
                    j = j9 + (j10 * j5);
                }
            } else {
                long j11 = this.j;
                long j12 = jNowNanos + j11;
                long j13 = this.a + 1;
                this.a = j13;
                this.c = j12 - (j11 * j13);
                j = j12;
            }
            this.b = jNowNanos;
            this.g.replace(this.i.schedule(this, j - jNowNanos, TimeUnit.NANOSECONDS));
        }
    }

    private SchedulePeriodicHelper() {
        throw new IllegalStateException("No instances!");
    }

    public static Subscription schedulePeriodically(Scheduler.Worker worker, Action0 action0, long j, long j2, TimeUnit timeUnit, NowNanoSupplier nowNanoSupplier) {
        long nanos = timeUnit.toNanos(j2);
        long jNowNanos = nowNanoSupplier != null ? nowNanoSupplier.nowNanos() : TimeUnit.MILLISECONDS.toNanos(worker.now());
        long nanos2 = timeUnit.toNanos(j) + jNowNanos;
        SequentialSubscription sequentialSubscription = new SequentialSubscription();
        SequentialSubscription sequentialSubscription2 = new SequentialSubscription(sequentialSubscription);
        sequentialSubscription.replace(worker.schedule(new a(jNowNanos, nanos2, action0, sequentialSubscription2, nowNanoSupplier, worker, nanos), j, timeUnit));
        return sequentialSubscription2;
    }
}
