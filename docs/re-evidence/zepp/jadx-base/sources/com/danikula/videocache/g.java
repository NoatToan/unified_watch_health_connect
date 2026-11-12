package com.danikula.videocache;

import java.util.concurrent.atomic.AtomicInteger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* JADX INFO: loaded from: classes2.dex */
class g {
    private static final Logger i = LoggerFactory.getLogger("ProxyCache");
    private static final int j = 1;
    private final Source a;
    private final Cache b;
    private volatile Thread f;
    private volatile boolean g;
    private final Object c = new Object();
    private final Object d = new Object();
    private volatile int h = -1;
    private final AtomicInteger e = new AtomicInteger();

    public class b implements Runnable {
        private b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            g.this.k();
        }
    }

    public g(Source source, Cache cache) {
        this.a = (Source) Preconditions.checkNotNull(source);
        this.b = (Cache) Preconditions.checkNotNull(cache);
    }

    private void b() throws ProxyCacheException {
        int i2 = this.e.get();
        if (i2 < 1) {
            return;
        }
        this.e.set(0);
        throw new ProxyCacheException("Error reading source " + i2 + " times");
    }

    private void c() {
        try {
            this.a.close();
        } catch (ProxyCacheException e) {
            h(new ProxyCacheException("Error closing source " + this.a, e));
        }
    }

    private boolean d() {
        return Thread.currentThread().isInterrupted() || this.g;
    }

    private void e(long j2, long j3) {
        f(j2, j3);
        synchronized (this.c) {
            this.c.notifyAll();
        }
    }

    private void i() {
        this.h = 100;
        g(this.h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        long length = -1;
        long jAvailable = 0;
        try {
            jAvailable = this.b.available();
            this.a.open(jAvailable);
            length = this.a.length();
            byte[] bArr = new byte[8192];
            while (true) {
                int i2 = this.a.read(bArr);
                if (i2 == -1) {
                    n();
                    i();
                    break;
                }
                synchronized (this.d) {
                    if (d()) {
                        c();
                        e(jAvailable, length);
                        return;
                    }
                    this.b.append(bArr, i2);
                }
                jAvailable += (long) i2;
                e(jAvailable, length);
            }
        } catch (Throwable th) {
            try {
                this.e.incrementAndGet();
                h(th);
            } finally {
                c();
                e(jAvailable, length);
            }
        }
    }

    private synchronized void l() throws ProxyCacheException {
        boolean z = (this.f == null || this.f.getState() == Thread.State.TERMINATED) ? false : true;
        if (!this.g && !this.b.isCompleted() && !z) {
            this.f = new Thread(new b(), "Source reader for " + this.a);
            this.f.start();
        }
    }

    private void n() throws ProxyCacheException {
        synchronized (this.d) {
            if (!d() && this.b.available() == this.a.length()) {
                this.b.complete();
            }
        }
    }

    private void o() throws ProxyCacheException {
        synchronized (this.c) {
            try {
                try {
                    this.c.wait(1000L);
                } catch (InterruptedException e) {
                    throw new ProxyCacheException("Waiting source data is interrupted!", e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void f(long j2, long j3) {
        int i2 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1)) == 0 ? 100 : (int) ((j2 / j3) * 100.0f);
        boolean z = i2 != this.h;
        if ((j3 >= 0) && z) {
            g(i2);
        }
        this.h = i2;
    }

    public void g(int i2) {
    }

    public final void h(Throwable th) {
        if (th instanceof InterruptedProxyCacheException) {
            i.debug("ProxyCache is interrupted");
        } else {
            i.error("ProxyCache error", th);
        }
    }

    public int j(byte[] bArr, long j2, int i2) throws ProxyCacheException {
        ProxyCacheUtils.a(bArr, j2, i2);
        while (!this.b.isCompleted() && this.b.available() < ((long) i2) + j2 && !this.g) {
            l();
            o();
            b();
        }
        int i3 = this.b.read(bArr, j2, i2);
        if (this.b.isCompleted() && this.h != 100) {
            this.h = 100;
            g(100);
        }
        return i3;
    }

    public void m() {
        synchronized (this.d) {
            i.debug("Shutdown proxy for " + this.a);
            try {
                this.g = true;
                if (this.f != null) {
                    this.f.interrupt();
                }
                this.b.close();
            } catch (ProxyCacheException e) {
                h(e);
            }
        }
    }
}
