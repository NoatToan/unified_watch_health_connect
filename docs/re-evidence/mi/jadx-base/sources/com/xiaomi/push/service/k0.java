package com.xiaomi.push.service;

import android.os.SystemClock;
import defpackage.x9s;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes11.dex */
public class k0 {
    public static long c;
    public static long d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f14220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f14221b;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f14222a;

        public a(c cVar) {
            this.f14222a = cVar;
        }

        public void finalize() throws Throwable {
            try {
                synchronized (this.f14222a) {
                    this.f14222a.e = true;
                    this.f14222a.notify();
                }
                super.finalize();
            } catch (Throwable th) {
                super.finalize();
                throw th;
            }
        }
    }

    public static abstract class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f14223a;

        public b(int i) {
            this.f14223a = i;
        }
    }

    public static final class c extends Thread {
        public boolean d;
        public boolean e;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public volatile long f14224a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public volatile boolean f14225b = false;
        public long c = 50;
        public a f = new a();

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f14226a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public d[] f14227b;
            public int c;
            public int d;

            public a() {
                this.f14226a = 256;
                this.f14227b = new d[256];
                this.c = 0;
                this.d = 0;
            }

            public final int b(d dVar) {
                int i = 0;
                while (true) {
                    d[] dVarArr = this.f14227b;
                    if (i >= dVarArr.length) {
                        return -1;
                    }
                    if (dVarArr[i] == dVar) {
                        return i;
                    }
                    i++;
                }
            }

            public d c() {
                return this.f14227b[0];
            }

            public void d() {
                this.f14227b = new d[this.f14226a];
                this.c = 0;
            }

            public void e(int i) {
                for (int i2 = 0; i2 < this.c; i2++) {
                    d dVar = this.f14227b[i2];
                    if (dVar.e == i) {
                        dVar.b();
                    }
                }
                j();
            }

            public void f(int i, b bVar) {
                for (int i2 = 0; i2 < this.c; i2++) {
                    d dVar = this.f14227b[i2];
                    if (dVar.d == bVar) {
                        dVar.b();
                    }
                }
                j();
            }

            public void g(d dVar) {
                d[] dVarArr = this.f14227b;
                int length = dVarArr.length;
                int i = this.c;
                if (length == i) {
                    d[] dVarArr2 = new d[i * 2];
                    System.arraycopy(dVarArr, 0, dVarArr2, 0, i);
                    this.f14227b = dVarArr2;
                }
                d[] dVarArr3 = this.f14227b;
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
                    if (this.f14227b[i2].e == i) {
                        return true;
                    }
                }
                return false;
            }

            public void j() {
                int i = 0;
                while (i < this.c) {
                    if (this.f14227b[i].f14229b) {
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
                d[] dVarArr = this.f14227b;
                int i3 = i2 - 1;
                this.c = i3;
                dVarArr[i] = dVarArr[i3];
                dVarArr[i3] = null;
                m(i);
            }

            public final void l() {
                int i = this.c;
                int i2 = i - 1;
                int i3 = (i - 2) / 2;
                while (true) {
                    d[] dVarArr = this.f14227b;
                    d dVar = dVarArr[i2];
                    long j = dVar.c;
                    d dVar2 = dVarArr[i3];
                    if (j >= dVar2.c) {
                        return;
                    }
                    dVarArr[i2] = dVar2;
                    dVarArr[i3] = dVar;
                    i2 = i3;
                    i3 = (i3 - 1) / 2;
                }
            }

            public final void m(int i) {
                int i2 = (i * 2) + 1;
                while (true) {
                    int i3 = this.c;
                    if (i2 >= i3 || i3 <= 0) {
                        return;
                    }
                    int i4 = i2 + 1;
                    if (i4 < i3) {
                        d[] dVarArr = this.f14227b;
                        if (dVarArr[i4].c < dVarArr[i2].c) {
                            i2 = i4;
                        }
                    }
                    d[] dVarArr2 = this.f14227b;
                    d dVar = dVarArr2[i];
                    long j = dVar.c;
                    d dVar2 = dVarArr2[i2];
                    if (j < dVar2.c) {
                        return;
                    }
                    dVarArr2[i] = dVar2;
                    dVarArr2[i2] = dVar;
                    int i5 = i2;
                    i2 = (i2 * 2) + 1;
                    i = i5;
                }
            }
        }

        public c(String str, boolean z) {
            setName(str);
            setDaemon(z);
            start();
        }

        public synchronized void b() {
            this.d = true;
            this.f.d();
            notify();
        }

        public final void d(d dVar) {
            this.f.g(dVar);
            notify();
        }

        public boolean e() {
            return this.f14225b && SystemClock.uptimeMillis() - this.f14224a > 600000;
        }

        /* JADX WARN: Code restructure failed: missing block: B:59:0x009a, code lost:
        
            r10.f14224a = android.os.SystemClock.uptimeMillis();
            r10.f14225b = true;
            r2.d.run();
            r10.f14225b = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x00ab, code lost:
        
            r1 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:62:0x00ac, code lost:
        
            monitor-enter(r10);
         */
        /* JADX WARN: Code restructure failed: missing block: B:63:0x00ad, code lost:
        
            r10.d = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:65:0x00b0, code lost:
        
            throw r1;
         */
        @Override // java.lang.Thread, java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void run() {
            /*
                r10 = this;
            L0:
                monitor-enter(r10)
                boolean r0 = r10.d     // Catch: java.lang.Throwable -> L7
                if (r0 == 0) goto La
                monitor-exit(r10)     // Catch: java.lang.Throwable -> L7
                return
            L7:
                r0 = move-exception
                goto Lb8
            La:
                com.xiaomi.push.service.k0$c$a r0 = r10.f     // Catch: java.lang.Throwable -> L7
                boolean r0 = r0.h()     // Catch: java.lang.Throwable -> L7
                if (r0 == 0) goto L1d
                boolean r0 = r10.e     // Catch: java.lang.Throwable -> L7
                if (r0 == 0) goto L18
                monitor-exit(r10)     // Catch: java.lang.Throwable -> L7
                return
            L18:
                r10.wait()     // Catch: java.lang.Throwable -> L7 java.lang.InterruptedException -> L1b
            L1b:
                monitor-exit(r10)     // Catch: java.lang.Throwable -> L7
                goto L0
            L1d:
                long r0 = com.xiaomi.push.service.k0.a()     // Catch: java.lang.Throwable -> L7
                com.xiaomi.push.service.k0$c$a r2 = r10.f     // Catch: java.lang.Throwable -> L7
                com.xiaomi.push.service.k0$d r2 = r2.c()     // Catch: java.lang.Throwable -> L7
                java.lang.Object r3 = r2.f14228a     // Catch: java.lang.Throwable -> L7
                monitor-enter(r3)     // Catch: java.lang.Throwable -> L7
                boolean r4 = r2.f14229b     // Catch: java.lang.Throwable -> L37
                r5 = 0
                if (r4 == 0) goto L3a
                com.xiaomi.push.service.k0$c$a r0 = r10.f     // Catch: java.lang.Throwable -> L37
                r0.k(r5)     // Catch: java.lang.Throwable -> L37
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L37
                monitor-exit(r10)     // Catch: java.lang.Throwable -> L7
                goto L0
            L37:
                r0 = move-exception
                goto Lb6
            L3a:
                long r6 = r2.c     // Catch: java.lang.Throwable -> L37
                long r6 = r6 - r0
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L37
                r0 = 0
                int r3 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
                r8 = 50
                if (r3 <= 0) goto L5d
                long r0 = r10.c     // Catch: java.lang.Throwable -> L7
                int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
                if (r2 <= 0) goto L4d
                r6 = r0
            L4d:
                long r0 = r0 + r8
                r10.c = r0     // Catch: java.lang.Throwable -> L7
                r2 = 500(0x1f4, double:2.47E-321)
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 <= 0) goto L58
                r10.c = r2     // Catch: java.lang.Throwable -> L7
            L58:
                r10.wait(r6)     // Catch: java.lang.Throwable -> L7 java.lang.InterruptedException -> L5b
            L5b:
                monitor-exit(r10)     // Catch: java.lang.Throwable -> L7
                goto L0
            L5d:
                r10.c = r8     // Catch: java.lang.Throwable -> L7
                java.lang.Object r3 = r2.f14228a     // Catch: java.lang.Throwable -> L7
                monitor-enter(r3)     // Catch: java.lang.Throwable -> L7
                com.xiaomi.push.service.k0$c$a r4 = r10.f     // Catch: java.lang.Throwable -> L77
                com.xiaomi.push.service.k0$d r4 = r4.c()     // Catch: java.lang.Throwable -> L77
                long r6 = r4.c     // Catch: java.lang.Throwable -> L77
                long r8 = r2.c     // Catch: java.lang.Throwable -> L77
                int r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r4 == 0) goto L79
                com.xiaomi.push.service.k0$c$a r4 = r10.f     // Catch: java.lang.Throwable -> L77
                int r4 = com.xiaomi.push.service.k0.c.a.a(r4, r2)     // Catch: java.lang.Throwable -> L77
                goto L7a
            L77:
                r0 = move-exception
                goto Lb4
            L79:
                r4 = r5
            L7a:
                boolean r6 = r2.f14229b     // Catch: java.lang.Throwable -> L77
                if (r6 == 0) goto L8b
                com.xiaomi.push.service.k0$c$a r0 = r10.f     // Catch: java.lang.Throwable -> L77
                int r1 = com.xiaomi.push.service.k0.c.a.a(r0, r2)     // Catch: java.lang.Throwable -> L77
                r0.k(r1)     // Catch: java.lang.Throwable -> L77
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L77
                monitor-exit(r10)     // Catch: java.lang.Throwable -> L7
                goto L0
            L8b:
                long r6 = r2.c     // Catch: java.lang.Throwable -> L77
                r2.a(r6)     // Catch: java.lang.Throwable -> L77
                com.xiaomi.push.service.k0$c$a r6 = r10.f     // Catch: java.lang.Throwable -> L77
                r6.k(r4)     // Catch: java.lang.Throwable -> L77
                r2.c = r0     // Catch: java.lang.Throwable -> L77
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L77
                monitor-exit(r10)     // Catch: java.lang.Throwable -> L7
                r0 = 1
                long r3 = android.os.SystemClock.uptimeMillis()     // Catch: java.lang.Throwable -> Lab
                r10.f14224a = r3     // Catch: java.lang.Throwable -> Lab
                r10.f14225b = r0     // Catch: java.lang.Throwable -> Lab
                com.xiaomi.push.service.k0$b r1 = r2.d     // Catch: java.lang.Throwable -> Lab
                r1.run()     // Catch: java.lang.Throwable -> Lab
                r10.f14225b = r5     // Catch: java.lang.Throwable -> Lab
                goto L0
            Lab:
                r1 = move-exception
                monitor-enter(r10)
                r10.d = r0     // Catch: java.lang.Throwable -> Lb1
                monitor-exit(r10)     // Catch: java.lang.Throwable -> Lb1
                throw r1
            Lb1:
                r0 = move-exception
                monitor-exit(r10)     // Catch: java.lang.Throwable -> Lb1
                throw r0
            Lb4:
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L77
                throw r0     // Catch: java.lang.Throwable -> L7
            Lb6:
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L37
                throw r0     // Catch: java.lang.Throwable -> L7
            Lb8:
                monitor-exit(r10)     // Catch: java.lang.Throwable -> L7
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.k0.c.run():void");
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f14228a = new Object();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f14229b;
        public long c;
        public b d;
        public int e;
        public long f;

        public void a(long j) {
            synchronized (this.f14228a) {
                this.f = j;
            }
        }

        public boolean b() {
            boolean z;
            synchronized (this.f14228a) {
                try {
                    z = !this.f14229b && this.c > 0;
                    this.f14229b = true;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return z;
        }
    }

    static {
        long jElapsedRealtime = SystemClock.elapsedRealtime() > 0 ? SystemClock.elapsedRealtime() : 0L;
        c = jElapsedRealtime;
        d = jElapsedRealtime;
    }

    public k0(String str, boolean z) {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        c cVar = new c(str, z);
        this.f14220a = cVar;
        this.f14221b = new a(cVar);
    }

    public static synchronized long a() {
        try {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j = d;
            if (jElapsedRealtime > j) {
                c += jElapsedRealtime - j;
            }
            d = jElapsedRealtime;
        } catch (Throwable th) {
            throw th;
        }
        return c;
    }

    public void b() {
        x9s.o("quit. finalizer:" + this.f14221b);
        this.f14220a.b();
    }

    public void c(int i) {
        synchronized (this.f14220a) {
            this.f14220a.f.e(i);
        }
    }

    public void d(int i, b bVar) {
        synchronized (this.f14220a) {
            this.f14220a.f.f(i, bVar);
        }
    }

    public void e(b bVar) {
        if (x9s.a() >= 1 || Thread.currentThread() == this.f14220a) {
            bVar.run();
        } else {
            x9s.D("run job outside job job thread");
            throw new RejectedExecutionException("Run job outside job thread");
        }
    }

    public void f(b bVar, long j) {
        if (j >= 0) {
            j(bVar, j);
            return;
        }
        throw new IllegalArgumentException("delay < 0: " + j);
    }

    public boolean g() {
        return this.f14220a.e();
    }

    public boolean h(int i) {
        boolean zI;
        synchronized (this.f14220a) {
            zI = this.f14220a.f.i(i);
        }
        return zI;
    }

    public void i() {
        synchronized (this.f14220a) {
            this.f14220a.f.d();
        }
    }

    public final void j(b bVar, long j) {
        synchronized (this.f14220a) {
            try {
                if (this.f14220a.d) {
                    throw new IllegalStateException("Timer was canceled");
                }
                long jA = j + a();
                if (jA < 0) {
                    throw new IllegalArgumentException("Illegal delay to start the TimerTask: " + jA);
                }
                d dVar = new d();
                dVar.e = bVar.f14223a;
                dVar.d = bVar;
                dVar.c = jA;
                this.f14220a.d(dVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public k0(String str) {
        this(str, false);
    }
}
