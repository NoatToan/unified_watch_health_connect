package com.xiaomi.push.service;

import android.os.SystemClock;
import java.util.Objects;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes22.dex */
public class o {
    private static long c;
    private static long d;
    private static long e;
    private final c a;
    private final a b;

    public static final class a {
        private final c a;

        public a(c cVar) {
            this.a = cVar;
        }

        public void finalize() throws Throwable {
            try {
                synchronized (this.a) {
                    this.a.e = true;
                    this.a.notify();
                }
                super.finalize();
            } catch (Throwable th) {
                super.finalize();
                throw th;
            }
        }
    }

    public static abstract class b implements Runnable {
        public int a;

        public b(int i) {
            this.a = i;
        }
    }

    public static final class c extends Thread {
        private boolean d;
        private boolean e;
        private volatile long a = 0;
        private volatile boolean b = false;
        private long c = 50;
        private a f = new a();

        public static final class a {
            private int a;
            private d[] b;
            private int c;
            private int d;

            private a() {
                this.a = 256;
                this.b = new d[256];
                this.c = 0;
                this.d = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public int b(d dVar) {
                int i = 0;
                while (true) {
                    d[] dVarArr = this.b;
                    if (i >= dVarArr.length) {
                        return -1;
                    }
                    if (dVarArr[i] == dVar) {
                        return i;
                    }
                    i++;
                }
            }

            private void l() {
                int i = this.c - 1;
                int i2 = (i - 1) / 2;
                while (true) {
                    d[] dVarArr = this.b;
                    if (dVarArr[i].c >= dVarArr[i2].c) {
                        return;
                    }
                    d dVar = dVarArr[i];
                    dVarArr[i] = dVarArr[i2];
                    dVarArr[i2] = dVar;
                    int i3 = i2;
                    i2 = (i2 - 1) / 2;
                    i = i3;
                }
            }

            private void m(int i) {
                int i2 = (i * 2) + 1;
                while (true) {
                    int i3 = this.c;
                    if (i2 >= i3 || i3 <= 0) {
                        return;
                    }
                    int i4 = i2 + 1;
                    if (i4 < i3) {
                        d[] dVarArr = this.b;
                        if (dVarArr[i4].c < dVarArr[i2].c) {
                            i2 = i4;
                        }
                    }
                    d[] dVarArr2 = this.b;
                    if (dVarArr2[i].c < dVarArr2[i2].c) {
                        return;
                    }
                    d dVar = dVarArr2[i];
                    dVarArr2[i] = dVarArr2[i2];
                    dVarArr2[i2] = dVar;
                    int i5 = i2;
                    i2 = (i2 * 2) + 1;
                    i = i5;
                }
            }

            public d c() {
                return this.b[0];
            }

            public void d() {
                this.b = new d[this.a];
                this.c = 0;
            }

            public void e(int i) {
                for (int i2 = 0; i2 < this.c; i2++) {
                    d[] dVarArr = this.b;
                    if (dVarArr[i2].e == i) {
                        dVarArr[i2].b();
                    }
                }
                j();
            }

            public void f(int i, b bVar) {
                for (int i2 = 0; i2 < this.c; i2++) {
                    d[] dVarArr = this.b;
                    if (dVarArr[i2].d == bVar) {
                        dVarArr[i2].b();
                    }
                }
                j();
            }

            public void g(d dVar) {
                d[] dVarArr = this.b;
                int length = dVarArr.length;
                int i = this.c;
                if (length == i) {
                    d[] dVarArr2 = new d[i * 2];
                    System.arraycopy(dVarArr, 0, dVarArr2, 0, i);
                    this.b = dVarArr2;
                }
                d[] dVarArr3 = this.b;
                int i2 = this.c;
                this.c = i2 + 1;
                dVarArr3[i2] = dVar;
                l();
            }

            public boolean h() {
                return this.c == 0;
            }

            public boolean i(int i) {
                for (int i2 = 0; i2 < this.c; i2++) {
                    if (this.b[i2].e == i) {
                        return true;
                    }
                }
                return false;
            }

            public void j() {
                int i = 0;
                while (i < this.c) {
                    if (this.b[i].b) {
                        this.d++;
                        k(i);
                        i--;
                    }
                    i++;
                }
            }

            public void k(int i) {
                int i2;
                if (i < 0 || i >= (i2 = this.c)) {
                    return;
                }
                d[] dVarArr = this.b;
                int i3 = i2 - 1;
                this.c = i3;
                dVarArr[i] = dVarArr[i3];
                dVarArr[i3] = null;
                m(i);
            }
        }

        public c(String str, boolean z) {
            setName(str);
            setDaemon(z);
            start();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d(d dVar) {
            this.f.g(dVar);
            notify();
        }

        public synchronized void b() {
            this.d = true;
            this.f.d();
            notify();
        }

        public boolean e() {
            return this.b && SystemClock.uptimeMillis() - this.a > 600000;
        }

        /* JADX WARN: Code restructure failed: missing block: B:50:0x008e, code lost:
        
            r10.a = android.os.SystemClock.uptimeMillis();
            r10.b = true;
            r2.d.run();
            r10.b = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x009f, code lost:
        
            r1 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x00a0, code lost:
        
            monitor-enter(r10);
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x00a1, code lost:
        
            r10.d = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x00a4, code lost:
        
            throw r1;
         */
        @Override // java.lang.Thread, java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void run() {
            while (true) {
                synchronized (this) {
                    if (this.d) {
                        return;
                    }
                    if (!this.f.h()) {
                        long jC = o.c();
                        d dVarC = this.f.c();
                        synchronized (dVarC.a) {
                            if (dVarC.b) {
                                this.f.k(0);
                            } else {
                                long j = dVarC.c - jC;
                                if (j > 0) {
                                    long j2 = this.c;
                                    if (j > j2) {
                                        j = j2;
                                    }
                                    long j3 = j2 + 50;
                                    this.c = j3;
                                    if (j3 > 500) {
                                        this.c = 500L;
                                    }
                                    wait(j);
                                } else {
                                    this.c = 50L;
                                    synchronized (dVarC.a) {
                                        int iB = this.f.c().c != dVarC.c ? this.f.b(dVarC) : 0;
                                        if (dVarC.b) {
                                            a aVar = this.f;
                                            aVar.k(aVar.b(dVarC));
                                        } else {
                                            dVarC.a(dVarC.c);
                                            this.f.k(iB);
                                            dVarC.c = 0L;
                                        }
                                    }
                                }
                            }
                        }
                    } else if (this.e) {
                        return;
                    } else {
                        try {
                            wait();
                        } catch (InterruptedException unused) {
                        }
                    }
                }
            }
        }
    }

    public static class d {
        public final Object a = new Object();
        public boolean b;
        public long c;
        public b d;
        public int e;
        private long f;

        public void a(long j) {
            synchronized (this.a) {
                this.f = j;
            }
        }

        public boolean b() {
            boolean z;
            synchronized (this.a) {
                z = !this.b && this.c > 0;
                this.b = true;
            }
            return z;
        }
    }

    static {
        long jElapsedRealtime = SystemClock.elapsedRealtime() > 0 ? SystemClock.elapsedRealtime() : 0L;
        c = jElapsedRealtime;
        d = jElapsedRealtime;
    }

    public o() {
        this(false);
    }

    public o(String str) {
        this(str, false);
    }

    public o(String str, boolean z) {
        Objects.requireNonNull(str, "name == null");
        c cVar = new c(str, z);
        this.a = cVar;
        this.b = new a(cVar);
    }

    public o(boolean z) {
        this("Timer-" + d(), z);
    }

    public static synchronized long c() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = d;
        if (jElapsedRealtime > j) {
            c += jElapsedRealtime - j;
        }
        d = jElapsedRealtime;
        return c;
    }

    private static synchronized long d() {
        long j;
        j = e;
        e = 1 + j;
        return j;
    }

    private void e(b bVar, long j) {
        synchronized (this.a) {
            if (this.a.d) {
                throw new IllegalStateException("Timer was canceled");
            }
            long jC = j + c();
            if (jC < 0) {
                throw new IllegalArgumentException("Illegal delay to start the TimerTask: " + jC);
            }
            d dVar = new d();
            dVar.e = bVar.a;
            dVar.d = bVar;
            dVar.c = jC;
            this.a.d(dVar);
        }
    }

    public void a() {
        com.xiaomi.channel.commonutils.logger.b.m3434a("quit. finalizer:" + this.b);
        this.a.b();
    }

    public void a(int i) {
        synchronized (this.a) {
            this.a.f.e(i);
        }
    }

    public void a(int i, b bVar) {
        synchronized (this.a) {
            this.a.f.f(i, bVar);
        }
    }

    public void a(b bVar) {
        if (com.xiaomi.channel.commonutils.logger.b.a() >= 1 || Thread.currentThread() == this.a) {
            bVar.run();
        } else {
            com.xiaomi.channel.commonutils.logger.b.d("run job outside job job thread");
            throw new RejectedExecutionException("Run job outside job thread");
        }
    }

    public void a(b bVar, long j) {
        if (j >= 0) {
            e(bVar, j);
            return;
        }
        throw new IllegalArgumentException("delay < 0: " + j);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m3834a() {
        return this.a.e();
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m3835a(int i) {
        boolean zI;
        synchronized (this.a) {
            zI = this.a.f.i(i);
        }
        return zI;
    }

    public void b() {
        synchronized (this.a) {
            this.a.f.d();
        }
    }
}
