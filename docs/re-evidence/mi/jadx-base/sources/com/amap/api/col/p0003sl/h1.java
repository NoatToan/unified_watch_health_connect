package com.amap.api.col.p0003sl;

import android.text.TextUtils;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes4.dex */
public final class h1 implements ThreadFactory {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f6072k;
    public static final int l;
    public static final int m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicLong f6073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ThreadFactory f6074b;
    public final Thread.UncaughtExceptionHandler c;
    public final String d;
    public final Integer e;
    public final Boolean f;
    public final int g;
    public final int h;
    public final BlockingQueue<Runnable> i;
    public final int j;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Runnable f6075a;

        public a(Runnable runnable) {
            this.f6075a = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                this.f6075a.run();
            } catch (Throwable unused) {
            }
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ThreadFactory f6077a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Thread.UncaughtExceptionHandler f6078b;
        public String c;
        public Integer d;
        public Boolean e;
        public int f = h1.l;
        public int g = h1.m;
        public int h = 30;
        public BlockingQueue<Runnable> i;

        public final b a() {
            this.f = 1;
            return this;
        }

        public final b b(int i) {
            if (this.f <= 0) {
                throw new NullPointerException("corePoolSize  must > 0!");
            }
            this.g = i;
            return this;
        }

        public final b c(String str) {
            if (str == null) {
                throw new NullPointerException("Naming pattern must not be null!");
            }
            this.c = str;
            return this;
        }

        public final b d(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            if (uncaughtExceptionHandler == null) {
                throw new NullPointerException("Uncaught exception handler must not be null!");
            }
            this.f6078b = uncaughtExceptionHandler;
            return this;
        }

        public final b e(BlockingQueue<Runnable> blockingQueue) {
            this.i = blockingQueue;
            return this;
        }

        public final h1 h() {
            h1 h1Var = new h1(this, (byte) 0);
            j();
            return h1Var;
        }

        public final void j() {
            this.f6077a = null;
            this.f6078b = null;
            this.c = null;
            this.d = null;
            this.e = null;
        }
    }

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        f6072k = iAvailableProcessors;
        l = Math.max(2, Math.min(iAvailableProcessors - 1, 4));
        m = (iAvailableProcessors * 2) + 1;
    }

    public /* synthetic */ h1(b bVar, byte b2) {
        this(bVar);
    }

    public final int a() {
        return this.g;
    }

    public final int b() {
        return this.h;
    }

    public final BlockingQueue<Runnable> c() {
        return this.i;
    }

    public final int d() {
        return this.j;
    }

    public final ThreadFactory g() {
        return this.f6074b;
    }

    public final String h() {
        return this.d;
    }

    public final Boolean i() {
        return this.f;
    }

    public final Integer j() {
        return this.e;
    }

    public final Thread.UncaughtExceptionHandler k() {
        return this.c;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        new a(runnable);
        Thread threadNewThread = g().newThread(runnable);
        if (h() != null) {
            threadNewThread.setName(String.format(h() + "-%d", Long.valueOf(this.f6073a.incrementAndGet())));
        }
        if (k() != null) {
            threadNewThread.setUncaughtExceptionHandler(k());
        }
        if (j() != null) {
            threadNewThread.setPriority(j().intValue());
        }
        if (i() != null) {
            threadNewThread.setDaemon(i().booleanValue());
        }
        return threadNewThread;
    }

    public h1(b bVar) {
        if (bVar.f6077a == null) {
            this.f6074b = Executors.defaultThreadFactory();
        } else {
            this.f6074b = bVar.f6077a;
        }
        int i = bVar.f;
        this.g = i;
        int i2 = m;
        this.h = i2;
        if (i2 < i) {
            throw new NullPointerException("maxPoolSize must > corePoolSize!");
        }
        this.j = bVar.h;
        if (bVar.i == null) {
            this.i = new LinkedBlockingQueue(256);
        } else {
            this.i = bVar.i;
        }
        if (TextUtils.isEmpty(bVar.c)) {
            this.d = "amap-threadpool";
        } else {
            this.d = bVar.c;
        }
        this.e = bVar.d;
        this.f = bVar.e;
        this.c = bVar.f6078b;
        this.f6073a = new AtomicLong();
    }
}
