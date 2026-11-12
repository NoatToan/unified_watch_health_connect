package com.xmlywind.sdk.b;

import com.xmlywind.logger.SigmobLog;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes22.dex */
class m {
    private final p a;
    private final com.xmlywind.sdk.b.a b;
    private volatile Thread f;
    private volatile boolean g;
    private final Object c = new Object();
    private final Object d = new Object();
    private volatile int h = -1;
    private final AtomicInteger e = new AtomicInteger();

    public class a implements Runnable {
        private a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            m.this.e();
        }
    }

    public m(p pVar, com.xmlywind.sdk.b.a aVar) {
        this.a = (p) l.a(pVar);
        this.b = (com.xmlywind.sdk.b.a) l.a(aVar);
    }

    private void b() throws n {
        int i = this.e.get();
        if (i < 3) {
            return;
        }
        this.e.set(0);
        throw new n("Error reading source " + i + " times");
    }

    private void b(long j, long j2) {
        a(j, j2);
        synchronized (this.c) {
            this.c.notifyAll();
        }
    }

    private void c() {
        synchronized (this) {
            boolean z = (this.f == null || this.f.getState() == Thread.State.TERMINATED) ? false : true;
            if (!this.g && !this.b.d() && !z) {
                this.f = new Thread(new a(), "Source reader for " + this.a);
                this.f.start();
            }
        }
    }

    private void d() {
        synchronized (this.c) {
            try {
                try {
                    this.c.wait(1000L);
                } catch (InterruptedException e) {
                    throw new n("Waiting source data is interrupted!", e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0038, code lost:
    
        r2 = r2 + ((long) r5);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void e() {
        long jA = -1;
        long jA2 = 0;
        try {
            jA2 = this.b.a();
            this.a.a(jA2);
            jA = this.a.a();
            byte[] bArr = new byte[8192];
            while (true) {
                int iA = this.a.a(bArr);
                if (iA == -1) {
                    g();
                    f();
                    break;
                }
                synchronized (this.d) {
                    if (h()) {
                        SigmobLog.d("SourceReaderRunnable停止从服务器下载视频数据");
                    } else {
                        this.b.a(bArr, iA);
                    }
                }
                break;
                b(jA2, jA);
            }
        } catch (Throwable th) {
            try {
                this.e.incrementAndGet();
                a(th);
            } finally {
                i();
                b(jA2, jA);
            }
        }
    }

    private void f() {
        this.h = 100;
        a(this.h);
    }

    private void g() {
        synchronized (this.d) {
            if (!h() && this.b.a() == this.a.a()) {
                this.b.c();
            }
        }
    }

    private boolean h() {
        return Thread.currentThread().isInterrupted() || this.g;
    }

    private void i() {
        try {
            this.a.b();
        } catch (n e) {
            a(new n("Error closing source " + this.a, e));
        }
    }

    public int a(byte[] bArr, long j, int i) throws n {
        o.a(bArr, j, i);
        while (!this.b.d() && this.b.a() < ((long) i) + j && !this.g) {
            c();
            d();
            b();
        }
        int iA = this.b.a(bArr, j, i);
        if (this.b.d() && this.h != 100) {
            this.h = 100;
            a(100);
        }
        return iA;
    }

    public void a() {
        synchronized (this.d) {
            SigmobLog.d("Shutdown proxy for " + this.a);
            try {
                this.g = true;
                if (this.f != null) {
                    this.f.interrupt();
                }
                this.b.b();
            } catch (n e) {
                a(e);
            }
        }
    }

    public void a(int i) {
    }

    public void a(long j, long j2) {
        int i = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1)) == 0 ? 100 : (int) ((j / j2) * 100.0f);
        boolean z = i != this.h;
        if ((j2 >= 0) && z) {
            a(i);
        }
        this.h = i;
    }

    public final void a(Throwable th) {
        if (th instanceof j) {
            SigmobLog.d("ProxyCache is interrupted");
        } else {
            SigmobLog.e("ProxyCache error", th);
        }
    }
}
