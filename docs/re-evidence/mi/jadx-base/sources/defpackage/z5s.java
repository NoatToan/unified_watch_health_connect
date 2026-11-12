package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes11.dex */
public class z5s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f40926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Handler f40927b;
    public volatile boolean c;
    public final boolean d;
    public int e;
    public volatile b f;

    public class a extends Thread {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LinkedBlockingQueue<b> f40928a;

        public a() {
            super("PackageProcessor");
            this.f40928a = new LinkedBlockingQueue<>();
        }

        public final void a(int i, b bVar) {
            try {
                z5s.this.f40927b.sendMessage(z5s.this.f40927b.obtainMessage(i, bVar));
            } catch (Exception e) {
                x9s.s(e);
            }
        }

        public void b(b bVar) {
            try {
                this.f40928a.add(bVar);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            long j = z5s.this.e > 0 ? z5s.this.e : Long.MAX_VALUE;
            while (!z5s.this.c) {
                try {
                    b bVarPoll = this.f40928a.poll(j, TimeUnit.SECONDS);
                    z5s.this.f = bVarPoll;
                    if (bVarPoll != null) {
                        a(0, bVarPoll);
                        bVarPoll.b();
                        a(1, bVarPoll);
                    } else if (z5s.this.e > 0) {
                        z5s.this.d();
                    }
                } catch (InterruptedException e) {
                    x9s.s(e);
                }
            }
        }
    }

    public static abstract class b {
        public void a() {
        }

        public abstract void b();

        public void c() {
        }
    }

    public z5s(boolean z) {
        this(z, 0);
    }

    public final synchronized void d() {
        this.f40926a = null;
        this.c = true;
    }

    public synchronized void e(b bVar) {
        try {
            if (this.f40926a == null) {
                a aVar = new a();
                this.f40926a = aVar;
                aVar.setDaemon(this.d);
                this.c = false;
                this.f40926a.start();
            }
            this.f40926a.b(bVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    public void f(b bVar, long j) {
        this.f40927b.postDelayed(new i6s(this, bVar), j);
    }

    public z5s(boolean z, int i) {
        this.f40927b = null;
        this.c = false;
        this.e = 0;
        this.f40927b = new e6s(this, Looper.getMainLooper());
        this.d = z;
        this.e = i;
    }
}
