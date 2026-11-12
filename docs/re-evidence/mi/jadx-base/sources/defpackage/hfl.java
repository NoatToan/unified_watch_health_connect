package defpackage;

import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.disposables.SequentialDisposable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public abstract class hfl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f20015a = Boolean.getBoolean("rx2.scheduler.use-nanotime");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f20016b = TimeUnit.MINUTES.toNanos(Long.getLong("rx2.scheduler.drift-tolerance", 15).longValue());

    public static final class a implements jz6, Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Runnable f20017a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final c f20018b;
        public Thread c;

        public a(Runnable runnable, c cVar) {
            this.f20017a = runnable;
            this.f20018b = cVar;
        }

        @Override // defpackage.jz6
        public void dispose() {
            if (this.c == Thread.currentThread()) {
                c cVar = this.f20018b;
                if (cVar instanceof nlg) {
                    ((nlg) cVar).h();
                    return;
                }
            }
            this.f20018b.dispose();
        }

        @Override // defpackage.jz6
        public boolean isDisposed() {
            return this.f20018b.isDisposed();
        }

        @Override // java.lang.Runnable
        public void run() {
            this.c = Thread.currentThread();
            try {
                this.f20017a.run();
            } finally {
                dispose();
                this.c = null;
            }
        }
    }

    public static final class b implements jz6, Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Runnable f20019a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final c f20020b;
        public volatile boolean c;

        public b(Runnable runnable, c cVar) {
            this.f20019a = runnable;
            this.f20020b = cVar;
        }

        @Override // defpackage.jz6
        public void dispose() {
            this.c = true;
            this.f20020b.dispose();
        }

        @Override // defpackage.jz6
        public boolean isDisposed() {
            return this.c;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.c) {
                return;
            }
            try {
                this.f20019a.run();
            } catch (Throwable th) {
                qf8.b(th);
                this.f20020b.dispose();
                throw jf8.d(th);
            }
        }
    }

    public static abstract class c implements jz6 {

        public final class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Runnable f20021a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final SequentialDisposable f20022b;
            public final long c;
            public long d;
            public long e;
            public long f;

            public a(long j, Runnable runnable, long j2, SequentialDisposable sequentialDisposable, long j3) {
                this.f20021a = runnable;
                this.f20022b = sequentialDisposable;
                this.c = j3;
                this.e = j2;
                this.f = j;
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0034  */
            @Override // java.lang.Runnable
            public void run() {
                long j;
                this.f20021a.run();
                if (this.f20022b.isDisposed()) {
                    return;
                }
                c cVar = c.this;
                TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                long jA = cVar.a(timeUnit);
                long j2 = hfl.f20016b;
                long j3 = jA + j2;
                long j4 = this.e;
                if (j3 >= j4) {
                    long j5 = this.c;
                    if (jA >= j4 + j5 + j2) {
                        long j6 = this.c;
                        long j7 = jA + j6;
                        long j8 = this.d + 1;
                        this.d = j8;
                        this.f = j7 - (j6 * j8);
                        j = j7;
                    } else {
                        long j9 = this.f;
                        long j10 = this.d + 1;
                        this.d = j10;
                        j = j9 + (j10 * j5);
                    }
                } else {
                    long j11 = this.c;
                    long j12 = jA + j11;
                    long j13 = this.d + 1;
                    this.d = j13;
                    this.f = j12 - (j11 * j13);
                    j = j12;
                }
                this.e = jA;
                this.f20022b.replace(c.this.c(this, j - jA, timeUnit));
            }
        }

        public long a(TimeUnit timeUnit) {
            return hfl.a(timeUnit);
        }

        public jz6 b(Runnable runnable) {
            return c(runnable, 0L, TimeUnit.NANOSECONDS);
        }

        public abstract jz6 c(Runnable runnable, long j, TimeUnit timeUnit);

        public jz6 d(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
            SequentialDisposable sequentialDisposable = new SequentialDisposable();
            SequentialDisposable sequentialDisposable2 = new SequentialDisposable(sequentialDisposable);
            Runnable runnableR = t5l.r(runnable);
            long nanos = timeUnit.toNanos(j2);
            long jA = a(TimeUnit.NANOSECONDS);
            jz6 jz6VarC = c(new a(jA + timeUnit.toNanos(j), runnableR, jA, sequentialDisposable2, nanos), j, timeUnit);
            if (jz6VarC == EmptyDisposable.INSTANCE) {
                return jz6VarC;
            }
            sequentialDisposable.replace(jz6VarC);
            return sequentialDisposable2;
        }
    }

    public static long a(TimeUnit timeUnit) {
        return !f20015a ? timeUnit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS) : timeUnit.convert(System.nanoTime(), TimeUnit.NANOSECONDS);
    }

    public abstract c b();

    public jz6 c(Runnable runnable) {
        return d(runnable, 0L, TimeUnit.NANOSECONDS);
    }

    public jz6 d(Runnable runnable, long j, TimeUnit timeUnit) {
        c cVarB = b();
        a aVar = new a(t5l.r(runnable), cVarB);
        cVarB.c(aVar, j, timeUnit);
        return aVar;
    }

    public jz6 e(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        c cVarB = b();
        b bVar = new b(t5l.r(runnable), cVarB);
        jz6 jz6VarD = cVarB.d(bVar, j, j2, timeUnit);
        return jz6VarD == EmptyDisposable.INSTANCE ? jz6VarD : bVar;
    }
}
