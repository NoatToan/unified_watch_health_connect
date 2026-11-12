package ue;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0002\u0006\u0007B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lue/c0;", "Lue/j0;", "Lue/c0$a;", "builder", "<init>", "(Lue/c0$a;)V", "a", "b", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c0 extends j0 {
    static {
        new b(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(a aVar) {
        super(aVar.f170097b, aVar.f170098c, aVar.f170099d);
        aVar.getClass();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lue/c0$b;", "", "<init>", "()V", "", "MIN_PERIODIC_INTERVAL_MILLIS", "J", "MIN_PERIODIC_FLEX_MILLIS", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001B+\b\u0016\u0012\u0010\u0010\u0005\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB)\b\u0016\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\f\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\rB!\b\u0017\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u000e¢\u0006\u0004\b\n\u0010\u000fB!\b\u0017\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\f\u0012\u0006\u0010\u0007\u001a\u00020\u000e¢\u0006\u0004\b\n\u0010\u0010B;\b\u0016\u0012\u0010\u0010\u0005\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u0011\u001a\u00020\u0006\u0012\u0006\u0010\u0012\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u0013B9\b\u0016\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\f\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u0011\u001a\u00020\u0006\u0012\u0006\u0010\u0012\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u0014B+\b\u0017\u0012\u0010\u0010\u0005\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\n\u0010\u0015B)\b\u0017\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\f\u0012\u0006\u0010\u0007\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\n\u0010\u0016¨\u0006\u0017"}, d2 = {"Lue/c0$a;", "Lue/j0$a;", "Lue/c0;", "Ljava/lang/Class;", "Landroidx/work/d;", "workerClass", "", "repeatInterval", "Ljava/util/concurrent/TimeUnit;", "repeatIntervalTimeUnit", "<init>", "(Ljava/lang/Class;JLjava/util/concurrent/TimeUnit;)V", "Lk23/d;", "(Lk23/d;JLjava/util/concurrent/TimeUnit;)V", "Ljava/time/Duration;", "(Ljava/lang/Class;Ljava/time/Duration;)V", "(Lk23/d;Ljava/time/Duration;)V", "flexInterval", "flexIntervalTimeUnit", "(Ljava/lang/Class;JLjava/util/concurrent/TimeUnit;JLjava/util/concurrent/TimeUnit;)V", "(Lk23/d;JLjava/util/concurrent/TimeUnit;JLjava/util/concurrent/TimeUnit;)V", "(Ljava/lang/Class;Ljava/time/Duration;Ljava/time/Duration;)V", "(Lk23/d;Ljava/time/Duration;Ljava/time/Duration;)V", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends j0.a<a, c0> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(k23.d<? extends androidx.work.d> dVar, long j8, TimeUnit timeUnit, long j14, TimeUnit timeUnit2) {
            super(dh.b.u(dVar));
            dVar.getClass();
            timeUnit.getClass();
            timeUnit2.getClass();
            this.f170098c.e(timeUnit.toMillis(j8), timeUnit2.toMillis(j14));
        }

        @Override // ue.j0.a
        public final j0 b() {
            if (this.f170096a && this.f170098c.f26950j.f170046d) {
                vb.h.s("Cannot set backoff criteria on an idle mode job");
                return null;
            }
            if (!this.f170098c.f26957q) {
                return new c0(this);
            }
            vb.h.s("PeriodicWorkRequests cannot be expedited");
            return null;
        }

        @Override // ue.j0.a
        public final j0.a c() {
            return this;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(k23.d<? extends androidx.work.d> dVar, long j8, TimeUnit timeUnit) {
            super(dh.b.u(dVar));
            dVar.getClass();
            timeUnit.getClass();
            this.f170098c.d(timeUnit.toMillis(j8));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Class<? extends androidx.work.d> cls, Duration duration) {
            super(cls);
            cls.getClass();
            duration.getClass();
            this.f170098c.d(duration.toMillis());
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(k23.d<? extends androidx.work.d> dVar, Duration duration) {
            super(dh.b.u(dVar));
            dVar.getClass();
            duration.getClass();
            this.f170098c.d(duration.toMillis());
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Class<? extends androidx.work.d> cls, long j8, TimeUnit timeUnit, long j14, TimeUnit timeUnit2) {
            super(cls);
            cls.getClass();
            timeUnit.getClass();
            timeUnit2.getClass();
            this.f170098c.e(timeUnit.toMillis(j8), timeUnit2.toMillis(j14));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Class<? extends androidx.work.d> cls, long j8, TimeUnit timeUnit) {
            super(cls);
            cls.getClass();
            timeUnit.getClass();
            this.f170098c.d(timeUnit.toMillis(j8));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Class<? extends androidx.work.d> cls, Duration duration, Duration duration2) {
            super(cls);
            cls.getClass();
            duration.getClass();
            duration2.getClass();
            this.f170098c.e(duration.toMillis(), duration2.toMillis());
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(k23.d<? extends androidx.work.d> dVar, Duration duration, Duration duration2) {
            super(dh.b.u(dVar));
            dVar.getClass();
            duration.getClass();
            duration2.getClass();
            this.f170098c.e(duration.toMillis(), duration2.toMillis());
        }
    }
}
