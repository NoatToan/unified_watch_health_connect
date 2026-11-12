package k0;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes.dex */
public final class h implements Executor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f101944b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayDeque f101943a = new ArrayDeque();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f101945c = new b();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c f101946d = c.IDLE;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f101947e = 0;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Runnable f101948a;

        public a(h hVar, Runnable runnable) {
            this.f101948a = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f101948a.run();
        }
    }

    public final class b implements Runnable {
        public b() {
        }

        /* JADX WARN: Code duplicated, block: B:40:0x0034 A[SYNTHETIC] */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x003b, code lost:
        
            if (r1 == false) goto L45;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0044, code lost:
        
            r1 = r1 | java.lang.Thread.interrupted();
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0045, code lost:
        
            r3.run();
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x004b, code lost:
        
            r3.toString();
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:?, code lost:
        
            return;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void a() {
            Runnable runnable;
            boolean z14 = false;
            boolean zInterrupted = false;
            while (true) {
                try {
                    synchronized (h.this.f101943a) {
                        if (z14) {
                            runnable = (Runnable) h.this.f101943a.poll();
                            if (runnable == null) {
                                h.this.f101946d = c.IDLE;
                            }
                        } else {
                            h hVar = h.this;
                            c cVar = hVar.f101946d;
                            c cVar2 = c.RUNNING;
                            if (cVar != cVar2) {
                                hVar.f101947e++;
                                hVar.f101946d = cVar2;
                                z14 = true;
                                runnable = (Runnable) h.this.f101943a.poll();
                                if (runnable == null) {
                                    h.this.f101946d = c.IDLE;
                                }
                            }
                        }
                    }
                    if (zInterrupted) {
                        break;
                    } else {
                        return;
                    }
                } catch (Throwable th3) {
                    if (zInterrupted) {
                        Thread.currentThread().interrupt();
                    }
                    throw th3;
                }
            }
            Thread.currentThread().interrupt();
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                a();
            } catch (Error e4) {
                synchronized (h.this.f101943a) {
                    h.this.f101946d = c.IDLE;
                    throw e4;
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

    public h(Executor executor) {
        executor.getClass();
        this.f101944b = executor;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0061  */
    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        c cVar;
        boolean z14;
        runnable.getClass();
        synchronized (this.f101943a) {
            c cVar2 = this.f101946d;
            if (cVar2 != c.RUNNING && cVar2 != (cVar = c.QUEUED)) {
                long j8 = this.f101947e;
                a aVar = new a(this, runnable);
                this.f101943a.add(aVar);
                c cVar3 = c.QUEUING;
                this.f101946d = cVar3;
                try {
                    this.f101944b.execute(this.f101945c);
                    if (this.f101946d != cVar3) {
                        return;
                    }
                    synchronized (this.f101943a) {
                        try {
                            if (this.f101947e == j8 && this.f101946d == cVar3) {
                                this.f101946d = cVar;
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    return;
                } catch (Error | RuntimeException e4) {
                    synchronized (this.f101943a) {
                        try {
                            c cVar4 = this.f101946d;
                            if (cVar4 != c.IDLE && cVar4 != c.QUEUING) {
                                z14 = false;
                            } else if (this.f101943a.removeLastOccurrence(aVar)) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            if (!(e4 instanceof RejectedExecutionException) || z14) {
                                throw e4;
                            }
                        } catch (Throwable th4) {
                            throw th4;
                        }
                    }
                    return;
                }
            }
            this.f101943a.add(runnable);
        }
    }
}
