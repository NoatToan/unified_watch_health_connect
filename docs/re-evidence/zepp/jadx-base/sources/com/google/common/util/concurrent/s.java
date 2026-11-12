package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.concurrent.GuardedBy;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
@GwtIncompatible
final class s implements Executor {
    private static final Logger f = Logger.getLogger(s.class.getName());
    private final Executor a;

    @GuardedBy("queue")
    private final Deque<Runnable> b = new ArrayDeque();

    @GuardedBy("queue")
    private c c = c.IDLE;

    @GuardedBy("queue")
    private long d = 0;
    private final b e = new b(this, null);

    public class a implements Runnable {
        public final /* synthetic */ Runnable a;

        public a(Runnable runnable) {
            this.a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.run();
        }
    }

    public final class b implements Runnable {
        private b() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0041, code lost:
        
            if (r1 == false) goto L45;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0043, code lost:
        
            java.lang.Thread.currentThread().interrupt();
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x004a, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0050, code lost:
        
            r1 = r1 | java.lang.Thread.interrupted();
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
        
            r3.run();
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0055, code lost:
        
            r2 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0056, code lost:
        
            com.google.common.util.concurrent.s.f.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + r3, (java.lang.Throwable) r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:?, code lost:
        
            return;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private void a() {
            boolean z = false;
            boolean zInterrupted = false;
            while (true) {
                try {
                    synchronized (s.this.b) {
                        if (!z) {
                            c cVar = s.this.c;
                            c cVar2 = c.RUNNING;
                            if (cVar != cVar2) {
                                s.d(s.this);
                                s.this.c = cVar2;
                                z = true;
                            }
                        }
                        Runnable runnable = (Runnable) s.this.b.poll();
                        if (runnable == null) {
                            s.this.c = c.IDLE;
                        }
                    }
                    if (zInterrupted) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    if (zInterrupted) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                a();
            } catch (Error e) {
                synchronized (s.this.b) {
                    s.this.c = c.IDLE;
                    throw e;
                }
            }
        }

        public /* synthetic */ b(s sVar, a aVar) {
            this();
        }
    }

    public enum c {
        IDLE,
        QUEUING,
        QUEUED,
        RUNNING
    }

    public s(Executor executor) {
        this.a = (Executor) Preconditions.checkNotNull(executor);
    }

    public static /* synthetic */ long d(s sVar) {
        long j = sVar.d;
        sVar.d = 1 + j;
        return j;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        c cVar;
        Preconditions.checkNotNull(runnable);
        synchronized (this.b) {
            c cVar2 = this.c;
            if (cVar2 != c.RUNNING && cVar2 != (cVar = c.QUEUED)) {
                long j = this.d;
                a aVar = new a(runnable);
                this.b.add(aVar);
                c cVar3 = c.QUEUING;
                this.c = cVar3;
                boolean z = true;
                try {
                    this.a.execute(this.e);
                    if (this.c != cVar3) {
                        return;
                    }
                    synchronized (this.b) {
                        if (this.d == j && this.c == cVar3) {
                            this.c = cVar;
                        }
                    }
                    return;
                } catch (Error | RuntimeException e) {
                    synchronized (this.b) {
                        c cVar4 = this.c;
                        if ((cVar4 != c.IDLE && cVar4 != c.QUEUING) || !this.b.removeLastOccurrence(aVar)) {
                            z = false;
                        }
                        if (!(e instanceof RejectedExecutionException) || z) {
                            throw e;
                        }
                    }
                    return;
                }
            }
            this.b.add(runnable);
        }
    }
}
