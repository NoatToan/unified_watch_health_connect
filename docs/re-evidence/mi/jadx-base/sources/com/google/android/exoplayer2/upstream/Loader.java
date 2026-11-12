package com.google.android.exoplayer2.upstream;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import defpackage.nkp;
import defpackage.rk1;
import defpackage.sie;
import defpackage.toe;
import defpackage.wlq;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes4.dex */
public final class Loader implements sie {
    public static final c d = h(false, -9223372036854775807L);
    public static final c e = h(true, -9223372036854775807L);
    public static final c f;
    public static final c g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExecutorService f8395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d<? extends e> f8396b;
    public IOException c;

    public static final class UnexpectedLoaderException extends IOException {
        public UnexpectedLoaderException(Throwable th) {
            String simpleName = th.getClass().getSimpleName();
            String message = th.getMessage();
            StringBuilder sb = new StringBuilder(simpleName.length() + 13 + String.valueOf(message).length());
            sb.append("Unexpected ");
            sb.append(simpleName);
            sb.append(": ");
            sb.append(message);
            super(sb.toString(), th);
        }
    }

    public interface b<T extends e> {
        void o(T t, long j, long j2, boolean z);

        void q(T t, long j, long j2);

        c s(T t, long j, long j2, IOException iOException, int i);
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f8397a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f8398b;

        public boolean c() {
            int i = this.f8397a;
            return i == 0 || i == 1;
        }

        public c(int i, long j) {
            this.f8397a = i;
            this.f8398b = j;
        }
    }

    @SuppressLint({"HandlerLeak"})
    public final class d<T extends e> extends Handler implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f8399a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final T f8400b;
        public final long c;
        public b<T> d;
        public IOException e;
        public int f;
        public Thread g;
        public boolean h;
        public volatile boolean i;

        public d(Looper looper, T t, b<T> bVar, int i, long j) {
            super(looper);
            this.f8400b = t;
            this.d = bVar;
            this.f8399a = i;
            this.c = j;
        }

        public void a(boolean z) {
            this.i = z;
            this.e = null;
            if (hasMessages(0)) {
                this.h = true;
                removeMessages(0);
                if (!z) {
                    sendEmptyMessage(1);
                }
            } else {
                synchronized (this) {
                    try {
                        this.h = true;
                        this.f8400b.b();
                        Thread thread = this.g;
                        if (thread != null) {
                            thread.interrupt();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            if (z) {
                c();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                ((b) rk1.e(this.d)).o(this.f8400b, jElapsedRealtime, jElapsedRealtime - this.c, true);
                this.d = null;
            }
        }

        public final void b() {
            this.e = null;
            Loader.this.f8395a.execute((Runnable) rk1.e(Loader.this.f8396b));
        }

        public final void c() {
            Loader.this.f8396b = null;
        }

        public final long d() {
            return Math.min((this.f - 1) * 1000, 5000);
        }

        public void e(int i) throws IOException {
            IOException iOException = this.e;
            if (iOException != null && this.f > i) {
                throw iOException;
            }
        }

        public void f(long j) {
            rk1.g(Loader.this.f8396b == null);
            Loader.this.f8396b = this;
            if (j > 0) {
                sendEmptyMessageDelayed(0, j);
            } else {
                b();
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (this.i) {
                return;
            }
            int i = message.what;
            if (i == 0) {
                b();
                return;
            }
            if (i == 3) {
                throw ((Error) message.obj);
            }
            c();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j = jElapsedRealtime - this.c;
            b bVar = (b) rk1.e(this.d);
            if (this.h) {
                bVar.o(this.f8400b, jElapsedRealtime, j, false);
                return;
            }
            int i2 = message.what;
            if (i2 == 1) {
                try {
                    bVar.q(this.f8400b, jElapsedRealtime, j);
                    return;
                } catch (RuntimeException e) {
                    toe.d("LoadTask", "Unexpected exception handling load completed", e);
                    Loader.this.c = new UnexpectedLoaderException(e);
                    return;
                }
            }
            if (i2 != 2) {
                return;
            }
            IOException iOException = (IOException) message.obj;
            this.e = iOException;
            int i3 = this.f + 1;
            this.f = i3;
            c cVarS = bVar.s(this.f8400b, jElapsedRealtime, j, iOException, i3);
            if (cVarS.f8397a == 3) {
                Loader.this.c = this.e;
            } else if (cVarS.f8397a != 2) {
                if (cVarS.f8397a == 1) {
                    this.f = 1;
                }
                f(cVarS.f8398b != -9223372036854775807L ? cVarS.f8398b : d());
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z;
            try {
                synchronized (this) {
                    z = !this.h;
                    this.g = Thread.currentThread();
                }
                if (z) {
                    String simpleName = this.f8400b.getClass().getSimpleName();
                    nkp.a(simpleName.length() != 0 ? "load:".concat(simpleName) : new String("load:"));
                    try {
                        this.f8400b.load();
                        nkp.c();
                    } catch (Throwable th) {
                        nkp.c();
                        throw th;
                    }
                }
                synchronized (this) {
                    this.g = null;
                    Thread.interrupted();
                }
                if (this.i) {
                    return;
                }
                sendEmptyMessage(1);
            } catch (IOException e) {
                if (this.i) {
                    return;
                }
                obtainMessage(2, e).sendToTarget();
            } catch (Error e2) {
                if (!this.i) {
                    toe.d("LoadTask", "Unexpected error loading stream", e2);
                    obtainMessage(3, e2).sendToTarget();
                }
                throw e2;
            } catch (Exception e3) {
                if (this.i) {
                    return;
                }
                toe.d("LoadTask", "Unexpected exception loading stream", e3);
                obtainMessage(2, new UnexpectedLoaderException(e3)).sendToTarget();
            } catch (OutOfMemoryError e4) {
                if (this.i) {
                    return;
                }
                toe.d("LoadTask", "OutOfMemory error loading stream", e4);
                obtainMessage(2, new UnexpectedLoaderException(e4)).sendToTarget();
            }
        }
    }

    public interface e {
        void b();

        void load() throws IOException;
    }

    public interface f {
        void l();
    }

    public static final class g implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f f8401a;

        public g(f fVar) {
            this.f8401a = fVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f8401a.l();
        }
    }

    static {
        long j = -9223372036854775807L;
        f = new c(2, j);
        g = new c(3, j);
    }

    public Loader(String str) {
        String strValueOf = String.valueOf(str);
        this.f8395a = wlq.w0(strValueOf.length() != 0 ? "ExoPlayer:Loader:".concat(strValueOf) : new String("ExoPlayer:Loader:"));
    }

    public static c h(boolean z, long j) {
        return new c(z ? 1 : 0, j);
    }

    @Override // defpackage.sie
    public void a() throws IOException {
        k(Integer.MIN_VALUE);
    }

    public void f() {
        ((d) rk1.i(this.f8396b)).a(false);
    }

    public void g() {
        this.c = null;
    }

    public boolean i() {
        return this.c != null;
    }

    public boolean j() {
        return this.f8396b != null;
    }

    public void k(int i) throws IOException {
        IOException iOException = this.c;
        if (iOException != null) {
            throw iOException;
        }
        d<? extends e> dVar = this.f8396b;
        if (dVar != null) {
            if (i == Integer.MIN_VALUE) {
                i = dVar.f8399a;
            }
            dVar.e(i);
        }
    }

    public void l() {
        m(null);
    }

    public void m(f fVar) {
        d<? extends e> dVar = this.f8396b;
        if (dVar != null) {
            dVar.a(true);
        }
        if (fVar != null) {
            this.f8395a.execute(new g(fVar));
        }
        this.f8395a.shutdown();
    }

    public <T extends e> long n(T t, b<T> bVar, int i) {
        Looper looper = (Looper) rk1.i(Looper.myLooper());
        this.c = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        new d(looper, t, bVar, i, jElapsedRealtime).f(0L);
        return jElapsedRealtime;
    }
}
