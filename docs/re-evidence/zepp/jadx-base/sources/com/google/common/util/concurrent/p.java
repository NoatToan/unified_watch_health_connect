package com.google.common.util.concurrent;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.collect.Queues;
import com.google.errorprone.annotations.concurrent.GuardedBy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
@GwtIncompatible
final class p<L> {
    private static final Logger b = Logger.getLogger(p.class.getName());
    private final List<b<L>> a = Collections.synchronizedList(new ArrayList());

    public interface a<L> {
        void call(L l);
    }

    public static final class b<L> implements Runnable {
        public final L a;
        public final Executor b;

        @GuardedBy("this")
        public final Queue<a<L>> c = Queues.newArrayDeque();

        @GuardedBy("this")
        public final Queue<Object> d = Queues.newArrayDeque();

        @GuardedBy("this")
        public boolean e;

        public b(L l, Executor executor) {
            this.a = (L) Preconditions.checkNotNull(l);
            this.b = (Executor) Preconditions.checkNotNull(executor);
        }

        public synchronized void a(a<L> aVar, Object obj) {
            this.c.add(aVar);
            this.d.add(obj);
        }

        public void b() {
            boolean z;
            synchronized (this) {
                z = true;
                if (this.e) {
                    z = false;
                } else {
                    this.e = true;
                }
            }
            if (z) {
                try {
                    this.b.execute(this);
                } catch (RuntimeException e) {
                    synchronized (this) {
                        this.e = false;
                        p.b.log(Level.SEVERE, "Exception while running callbacks for " + this.a + " on " + this.b, (Throwable) e);
                        throw e;
                    }
                }
            }
        }

        /* JADX WARN: Bottom block not found for handler: all -> 0x0056 */
        /* JADX WARN: Code duplicated, block: B:27:0x005b  */
        /* JADX WARN: Code duplicated, block: B:37:0x005c A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0020, code lost:
        
            r2.call(r9.a);
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0026, code lost:
        
            r2 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0027, code lost:
        
            com.google.common.util.concurrent.p.b.log(java.util.logging.Level.SEVERE, "Exception while executing callback: " + r9.a + " " + r3, (java.lang.Throwable) r2);
         */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void run() throws Throwable {
            Throwable th;
            boolean z;
            while (true) {
                boolean z2 = true;
                try {
                    synchronized (this) {
                        try {
                            Preconditions.checkState(this.e);
                            a<L> aVarPoll = this.c.poll();
                            Object objPoll = this.d.poll();
                            if (aVarPoll == null) {
                                this.e = false;
                                try {
                                    return;
                                } catch (Throwable th2) {
                                    th = th2;
                                    z = false;
                                }
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            z = true;
                        }
                        while (true) {
                        }
                    }
                    try {
                        throw th;
                    } catch (Throwable th4) {
                        boolean z3 = z;
                        th = th4;
                        z2 = z3;
                        if (z2) {
                            synchronized (this) {
                                this.e = false;
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    if (z2) {
                        synchronized (this) {
                            this.e = false;
                        }
                    }
                    throw th;
                }
            }
        }
    }

    private void f(a<L> aVar, Object obj) {
        Preconditions.checkNotNull(aVar, "event");
        Preconditions.checkNotNull(obj, "label");
        synchronized (this.a) {
            Iterator<b<L>> it2 = this.a.iterator();
            while (it2.hasNext()) {
                it2.next().a(aVar, obj);
            }
        }
    }

    public void b(L l, Executor executor) {
        Preconditions.checkNotNull(l, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        Preconditions.checkNotNull(executor, "executor");
        this.a.add(new b<>(l, executor));
    }

    public void c() {
        for (int i = 0; i < this.a.size(); i++) {
            this.a.get(i).b();
        }
    }

    public void d(a<L> aVar) {
        f(aVar, aVar);
    }

    public void e(a<L> aVar, String str) {
        f(aVar, str);
    }
}
