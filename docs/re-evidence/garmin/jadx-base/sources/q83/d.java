package q83;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import v83.s;

/* JADX INFO: loaded from: classes11.dex */
public final class d extends j83.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f143398a;

    public static final class a extends j83.h.a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Executor f143399a;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final ScheduledExecutorService f143403e;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ConcurrentLinkedQueue<j> f143401c = new ConcurrentLinkedQueue<>();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final AtomicInteger f143402d = new AtomicInteger();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final y83.b f143400b = new y83.b();

        public a(Executor executor) {
            ScheduledExecutorService scheduledExecutorService;
            this.f143399a = executor;
            ScheduledExecutorService[] scheduledExecutorServiceArr = e.f143406d.f143408a.get();
            if (scheduledExecutorServiceArr == e.f143404b) {
                scheduledExecutorService = e.f143405c;
            } else {
                int i14 = e.f143407e + 1;
                i14 = i14 >= scheduledExecutorServiceArr.length ? 0 : i14;
                e.f143407e = i14;
                scheduledExecutorService = scheduledExecutorServiceArr[i14];
            }
            this.f143403e = scheduledExecutorService;
        }

        @Override // j83.h.a
        public final j83.o a(n83.a aVar) {
            if (this.f143400b.f195247b) {
                return y83.d.f195249a;
            }
            j jVar = new j(s.c(aVar), this.f143400b);
            this.f143400b.a(jVar);
            this.f143401c.offer(jVar);
            if (this.f143402d.getAndIncrement() != 0) {
                return jVar;
            }
            try {
                this.f143399a.execute(this);
                return jVar;
            } catch (RejectedExecutionException e4) {
                this.f143400b.b(jVar);
                this.f143402d.decrementAndGet();
                s.a(e4);
                throw e4;
            }
        }

        @Override // j83.o
        public final boolean e() {
            return this.f143400b.f195247b;
        }

        @Override // j83.o
        public final void f() {
            this.f143400b.f();
            this.f143401c.clear();
        }

        @Override // java.lang.Runnable
        public final void run() {
            do {
                boolean z14 = this.f143400b.f195247b;
                ConcurrentLinkedQueue<j> concurrentLinkedQueue = this.f143401c;
                if (z14) {
                    concurrentLinkedQueue.clear();
                    return;
                }
                j jVarPoll = concurrentLinkedQueue.poll();
                if (jVarPoll == null) {
                    return;
                }
                if (!jVarPoll.f143422a.f157986b) {
                    if (this.f143400b.f195247b) {
                        this.f143401c.clear();
                        return;
                    }
                    jVarPoll.run();
                }
            } while (this.f143402d.decrementAndGet() != 0);
        }
    }

    public d(Executor executor) {
        this.f143398a = executor;
    }

    @Override // j83.h
    public final j83.h.a createWorker() {
        return new a(this.f143398a);
    }
}
