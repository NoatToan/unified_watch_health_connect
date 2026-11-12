package defpackage;

import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class nwp extends hfl {
    public static final nwp c = new nwp();

    public static final class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Runnable f28520a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final c f28521b;
        public final long c;

        public a(Runnable runnable, c cVar, long j) {
            this.f28520a = runnable;
            this.f28521b = cVar;
            this.c = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f28521b.d) {
                return;
            }
            long jA = this.f28521b.a(TimeUnit.MILLISECONDS);
            long j = this.c;
            if (j > jA) {
                try {
                    Thread.sleep(j - jA);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    t5l.p(e);
                    return;
                }
            }
            if (this.f28521b.d) {
                return;
            }
            this.f28520a.run();
        }
    }

    public static final class b implements Comparable<b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Runnable f28522a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f28523b;
        public final int c;
        public volatile boolean d;

        public b(Runnable runnable, Long l, int i) {
            this.f28522a = runnable;
            this.f28523b = l.longValue();
            this.c = i;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            int iB = x3h.b(this.f28523b, bVar.f28523b);
            return iB == 0 ? x3h.a(this.c, bVar.c) : iB;
        }
    }

    public static final class c extends hfl.c implements jz6 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PriorityBlockingQueue<b> f28524a = new PriorityBlockingQueue<>();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AtomicInteger f28525b = new AtomicInteger();
        public final AtomicInteger c = new AtomicInteger();
        public volatile boolean d;

        public final class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final b f28526a;

            public a(b bVar) {
                this.f28526a = bVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f28526a.d = true;
                c.this.f28524a.remove(this.f28526a);
            }
        }

        @Override // hfl.c
        public jz6 b(Runnable runnable) {
            return e(runnable, a(TimeUnit.MILLISECONDS));
        }

        @Override // hfl.c
        public jz6 c(Runnable runnable, long j, TimeUnit timeUnit) {
            long jA = a(TimeUnit.MILLISECONDS) + timeUnit.toMillis(j);
            return e(new a(runnable, this, jA), jA);
        }

        @Override // defpackage.jz6
        public void dispose() {
            this.d = true;
        }

        public jz6 e(Runnable runnable, long j) {
            if (this.d) {
                return EmptyDisposable.INSTANCE;
            }
            b bVar = new b(runnable, Long.valueOf(j), this.c.incrementAndGet());
            this.f28524a.add(bVar);
            if (this.f28525b.getAndIncrement() != 0) {
                return nz6.b(new a(bVar));
            }
            int iAddAndGet = 1;
            while (!this.d) {
                b bVarPoll = this.f28524a.poll();
                if (bVarPoll == null) {
                    iAddAndGet = this.f28525b.addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return EmptyDisposable.INSTANCE;
                    }
                } else if (!bVarPoll.d) {
                    bVarPoll.f28522a.run();
                }
            }
            this.f28524a.clear();
            return EmptyDisposable.INSTANCE;
        }

        @Override // defpackage.jz6
        public boolean isDisposed() {
            return this.d;
        }
    }

    public static nwp f() {
        return c;
    }

    @Override // defpackage.hfl
    public hfl.c b() {
        return new c();
    }

    @Override // defpackage.hfl
    public jz6 c(Runnable runnable) {
        t5l.r(runnable).run();
        return EmptyDisposable.INSTANCE;
    }

    @Override // defpackage.hfl
    public jz6 d(Runnable runnable, long j, TimeUnit timeUnit) {
        try {
            timeUnit.sleep(j);
            t5l.r(runnable).run();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            t5l.p(e);
        }
        return EmptyDisposable.INSTANCE;
    }
}
