package com.xiaomi.push;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.xiaomi.push.r, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public class C1648r {
    private a a;
    private Handler b;
    private volatile boolean c;
    private final boolean d;
    private int e;
    private volatile b f;

    /* JADX INFO: renamed from: com.xiaomi.push.r$a */
    public class a extends Thread {
        private final LinkedBlockingQueue<b> a;

        public a() {
            super("PackageProcessor");
            this.a = new LinkedBlockingQueue<>();
        }

        private void a(int i, b bVar) {
            try {
                C1648r.this.b.sendMessage(C1648r.this.b.obtainMessage(i, bVar));
            } catch (Exception e) {
                com.xiaomi.channel.commonutils.logger.b.a(e);
            }
        }

        public void b(b bVar) {
            try {
                this.a.add(bVar);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            long j = C1648r.this.e > 0 ? C1648r.this.e : Long.MAX_VALUE;
            while (!C1648r.this.c) {
                try {
                    b bVarPoll = this.a.poll(j, TimeUnit.SECONDS);
                    C1648r.this.f = bVarPoll;
                    if (bVarPoll != null) {
                        a(0, bVarPoll);
                        bVarPoll.b();
                        a(1, bVarPoll);
                    } else if (C1648r.this.e > 0) {
                        C1648r.this.d();
                    }
                } catch (InterruptedException e) {
                    com.xiaomi.channel.commonutils.logger.b.a(e);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.push.r$b */
    public static abstract class b {
        public void a() {
        }

        public abstract void b();

        public void c() {
        }
    }

    public C1648r() {
        this(false);
    }

    public C1648r(boolean z) {
        this(z, 0);
    }

    public C1648r(boolean z, int i) {
        this.b = null;
        this.c = false;
        this.e = 0;
        this.b = new s0(this, Looper.getMainLooper());
        this.d = z;
        this.e = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void d() {
        this.a = null;
        this.c = true;
    }

    public synchronized void a(b bVar) {
        if (this.a == null) {
            a aVar = new a();
            this.a = aVar;
            aVar.setDaemon(this.d);
            this.c = false;
            this.a.start();
        }
        this.a.b(bVar);
    }

    public void a(b bVar, long j) {
        this.b.postDelayed(new t0(this, bVar), j);
    }
}
