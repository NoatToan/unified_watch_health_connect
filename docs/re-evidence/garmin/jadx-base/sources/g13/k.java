package g13;

import d13.p;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import q03.q;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f74998b = 0;

    public static final class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Runnable f74999a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final c f75000b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f75001c;

        public a(Runnable runnable, c cVar, long j8) {
            this.f74999a = runnable;
            this.f75000b = cVar;
            this.f75001c = j8;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f75000b.f75009d) {
                return;
            }
            this.f75000b.getClass();
            long jA = q.b.a();
            long j8 = this.f75001c;
            if (j8 > jA) {
                try {
                    Thread.sleep(j8 - jA);
                } catch (InterruptedException e4) {
                    Thread.currentThread().interrupt();
                    k13.a.b(e4);
                    return;
                }
            }
            if (this.f75000b.f75009d) {
                return;
            }
            this.f74999a.run();
        }
    }

    public static final class b implements Comparable<b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Runnable f75002a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f75003b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f75004c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public volatile boolean f75005d;

        public b(Runnable runnable, Long l14, int i14) {
            this.f75002a = runnable;
            this.f75003b = l14.longValue();
            this.f75004c = i14;
        }

        @Override // java.lang.Comparable
        public final int compareTo(b bVar) {
            int i14;
            b bVar2 = bVar;
            long j8 = bVar2.f75003b;
            int i15 = w03.b.f181178a;
            long j14 = this.f75003b;
            if (j14 < j8) {
                i14 = -1;
            } else {
                i14 = j14 > j8 ? 1 : 0;
            }
            if (i14 != 0) {
                return i14;
            }
            int i16 = bVar2.f75004c;
            int i17 = this.f75004c;
            if (i17 < i16) {
                return -1;
            }
            return i17 > i16 ? 1 : 0;
        }
    }

    public static final class c extends q.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PriorityBlockingQueue<b> f75006a = new PriorityBlockingQueue<>();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AtomicInteger f75007b = new AtomicInteger();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final AtomicInteger f75008c = new AtomicInteger();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public volatile boolean f75009d;

        public final class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final b f75010a;

            public a(b bVar) {
                this.f75010a = bVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f75010a.f75005d = true;
                c.this.f75006a.remove(this.f75010a);
            }
        }

        @Override // s03.b
        public final boolean b() {
            return this.f75009d;
        }

        @Override // q03.q.b
        public final s03.b c(Runnable runnable, long j8, TimeUnit timeUnit) {
            long millis = timeUnit.toMillis(j8) + q.b.a();
            return e(millis, new a(runnable, this, millis));
        }

        @Override // q03.q.b
        public final void d(p.a aVar) {
            e(q.b.a(), aVar);
        }

        @Override // s03.b
        public final void dispose() {
            this.f75009d = true;
        }

        public final s03.b e(long j8, Runnable runnable) {
            if (this.f75009d) {
                return v03.d.INSTANCE;
            }
            b bVar = new b(runnable, Long.valueOf(j8), this.f75008c.incrementAndGet());
            this.f75006a.add(bVar);
            if (this.f75007b.getAndIncrement() != 0) {
                return s03.c.a(new a(bVar));
            }
            int iAddAndGet = 1;
            while (true) {
                boolean z14 = this.f75009d;
                PriorityBlockingQueue<b> priorityBlockingQueue = this.f75006a;
                if (z14) {
                    priorityBlockingQueue.clear();
                    return v03.d.INSTANCE;
                }
                b bVarPoll = priorityBlockingQueue.poll();
                if (bVarPoll == null) {
                    iAddAndGet = this.f75007b.addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return v03.d.INSTANCE;
                    }
                } else if (!bVarPoll.f75005d) {
                    bVarPoll.f75002a.run();
                }
            }
        }
    }

    static {
        new k();
    }

    @Override // q03.q
    public final q.b a() {
        return new c();
    }

    @Override // q03.q
    public final s03.b b(Runnable runnable) {
        int i14 = w03.b.f181178a;
        runnable.run();
        return v03.d.INSTANCE;
    }

    @Override // q03.q
    public final s03.b c(Runnable runnable, long j8, TimeUnit timeUnit) {
        try {
            timeUnit.sleep(j8);
            int i14 = w03.b.f181178a;
            runnable.run();
        } catch (InterruptedException e4) {
            Thread.currentThread().interrupt();
            k13.a.b(e4);
        }
        return v03.d.INSTANCE;
    }
}
