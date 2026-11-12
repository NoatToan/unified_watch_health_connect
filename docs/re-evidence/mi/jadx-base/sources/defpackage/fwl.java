package defpackage;

import androidx.annotation.GuardedBy;
import androidx.annotation.RequiresApi;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class fwl implements Executor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f18321b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @GuardedBy("mQueue")
    public final Deque<Runnable> f18320a = new ArrayDeque();
    public final b c = new b();

    @GuardedBy("mQueue")
    public c d = c.IDLE;

    @GuardedBy("mQueue")
    public long e = 0;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Runnable f18322a;

        public a(Runnable runnable) {
            this.f18322a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f18322a.run();
        }
    }

    public final class b implements Runnable {
        public b() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x003b, code lost:
        
            if (r1 == false) goto L47;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x003d, code lost:
        
            java.lang.Thread.currentThread().interrupt();
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0044, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x004a, code lost:
        
            r1 = r1 | java.lang.Thread.interrupted();
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x004b, code lost:
        
            r3.run();
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0051, code lost:
        
            r2 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0052, code lost:
        
            defpackage.zpe.d("SequentialExecutor", "Exception while executing runnable " + r3, r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:?, code lost:
        
            return;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void a() {
            /*
                r9 = this;
                r0 = 0
                r1 = r0
            L2:
                fwl r2 = defpackage.fwl.this     // Catch: java.lang.Throwable -> L4f
                java.util.Deque<java.lang.Runnable> r2 = r2.f18320a     // Catch: java.lang.Throwable -> L4f
                monitor-enter(r2)     // Catch: java.lang.Throwable -> L4f
                if (r0 != 0) goto L28
                fwl r0 = defpackage.fwl.this     // Catch: java.lang.Throwable -> L1c
                fwl$c r3 = r0.d     // Catch: java.lang.Throwable -> L1c
                fwl$c r4 = fwl.c.RUNNING     // Catch: java.lang.Throwable -> L1c
                if (r3 != r4) goto L1e
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
                if (r1 == 0) goto L1b
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
            L1b:
                return
            L1c:
                r0 = move-exception
                goto L69
            L1e:
                long r5 = r0.e     // Catch: java.lang.Throwable -> L1c
                r7 = 1
                long r5 = r5 + r7
                r0.e = r5     // Catch: java.lang.Throwable -> L1c
                r0.d = r4     // Catch: java.lang.Throwable -> L1c
                r0 = 1
            L28:
                fwl r3 = defpackage.fwl.this     // Catch: java.lang.Throwable -> L1c
                java.util.Deque<java.lang.Runnable> r3 = r3.f18320a     // Catch: java.lang.Throwable -> L1c
                java.lang.Object r3 = r3.poll()     // Catch: java.lang.Throwable -> L1c
                java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch: java.lang.Throwable -> L1c
                if (r3 != 0) goto L45
                fwl r0 = defpackage.fwl.this     // Catch: java.lang.Throwable -> L1c
                fwl$c r3 = fwl.c.IDLE     // Catch: java.lang.Throwable -> L1c
                r0.d = r3     // Catch: java.lang.Throwable -> L1c
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
                if (r1 == 0) goto L44
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
            L44:
                return
            L45:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
                boolean r2 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L4f
                r1 = r1 | r2
                r3.run()     // Catch: java.lang.Throwable -> L4f java.lang.RuntimeException -> L51
                goto L2
            L4f:
                r0 = move-exception
                goto L6b
            L51:
                r2 = move-exception
                java.lang.String r4 = "SequentialExecutor"
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4f
                r5.<init>()     // Catch: java.lang.Throwable -> L4f
                java.lang.String r6 = "Exception while executing runnable "
                r5.append(r6)     // Catch: java.lang.Throwable -> L4f
                r5.append(r3)     // Catch: java.lang.Throwable -> L4f
                java.lang.String r3 = r5.toString()     // Catch: java.lang.Throwable -> L4f
                defpackage.zpe.d(r4, r3, r2)     // Catch: java.lang.Throwable -> L4f
                goto L2
            L69:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
                throw r0     // Catch: java.lang.Throwable -> L4f
            L6b:
                if (r1 == 0) goto L74
                java.lang.Thread r1 = java.lang.Thread.currentThread()
                r1.interrupt()
            L74:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: fwl.b.a():void");
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                a();
            } catch (Error e) {
                synchronized (fwl.this.f18320a) {
                    fwl.this.d = c.IDLE;
                    throw e;
                }
            }
        }
    }

    public enum c {
        IDLE,
        QUEUING,
        QUEUED,
        RUNNING
    }

    public fwl(Executor executor) {
        this.f18321b = (Executor) g6i.g(executor);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0061  */
    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        c cVar;
        boolean z;
        g6i.g(runnable);
        synchronized (this.f18320a) {
            c cVar2 = this.d;
            if (cVar2 != c.RUNNING && cVar2 != (cVar = c.QUEUED)) {
                long j = this.e;
                a aVar = new a(runnable);
                this.f18320a.add(aVar);
                c cVar3 = c.QUEUING;
                this.d = cVar3;
                try {
                    this.f18321b.execute(this.c);
                    if (this.d != cVar3) {
                        return;
                    }
                    synchronized (this.f18320a) {
                        try {
                            if (this.e == j && this.d == cVar3) {
                                this.d = cVar;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return;
                } catch (Error | RuntimeException e) {
                    synchronized (this.f18320a) {
                        try {
                            c cVar4 = this.d;
                            if (cVar4 != c.IDLE && cVar4 != c.QUEUING) {
                                z = false;
                            } else if (this.f18320a.removeLastOccurrence(aVar)) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (!(e instanceof RejectedExecutionException) || z) {
                                throw e;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return;
                }
            }
            this.f18320a.add(runnable);
        }
    }
}
