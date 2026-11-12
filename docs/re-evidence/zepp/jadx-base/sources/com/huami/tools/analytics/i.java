package com.huami.tools.analytics;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.huami.tools.analytics.internal.utils.Const;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes15.dex */
class i implements Executor {
    private final String a;
    private final int b;

    @Nullable
    private Executor c;
    private final Deque<b> d;
    private final Deque<b> e;

    public static class a implements ThreadFactory {
        private final AtomicInteger a = new AtomicInteger(1);
        private String b;

        public a(String str) {
            this.b = str;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(@NonNull Runnable runnable) {
            Thread thread = new Thread(runnable, Const.LOG_TAG_PREFIX + this.b + "/Thread-" + this.a.getAndIncrement());
            thread.setDaemon(false);
            return thread;
        }
    }

    public final class b implements Runnable {
        private Runnable a;

        public b(Runnable runnable) {
            this.a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.a.run();
            } finally {
                i.this.c(this);
            }
        }
    }

    public i(int i, String str) {
        this.d = new ArrayDeque();
        this.e = new ArrayDeque();
        this.b = i;
        this.a = str;
    }

    private synchronized Executor b() {
        if (this.c == null) {
            this.c = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), new a(this.a));
        }
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void c(b bVar) {
        if (!this.e.remove(bVar)) {
            p.b().e(d(), "Call wasn't in-flight!");
        }
        e();
    }

    private String d() {
        return Const.LOG_TAG_PREFIX + this.a;
    }

    private void e() {
        if (this.e.size() < this.b && !this.d.isEmpty()) {
            Iterator<b> it2 = this.d.iterator();
            while (it2.hasNext()) {
                b next = it2.next();
                it2.remove();
                this.e.add(next);
                b().execute(next);
                if (this.e.size() >= this.b) {
                    return;
                }
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public synchronized void execute(@NonNull Runnable runnable) {
        b bVar = new b(runnable);
        if (this.e.size() < this.b) {
            this.e.add(bVar);
            b().execute(bVar);
        } else {
            this.d.add(bVar);
        }
    }

    @VisibleForTesting
    public i(int i, String str, @Nullable Executor executor) {
        this(i, str);
        this.c = executor;
    }
}
