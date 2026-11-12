package androidx.media3.exoplayer.upstream;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import com.google.android.exoplayer2.C;
import fa.k;
import fa.z;
import java.io.IOException;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes.dex */
public final class Loader {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f9697d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f9698e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final c f9699f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ya.b f9700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d<? extends e> f9701b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public IOException f9702c;

    public static final class UnexpectedLoaderException extends IOException {
        public UnexpectedLoaderException(Throwable th3) {
            String str;
            StringBuilder sb3 = new StringBuilder("Unexpected ");
            sb3.append(th3.getClass().getSimpleName());
            if (th3.getMessage() != null) {
                str = ": " + th3.getMessage();
            } else {
                str = "";
            }
            sb3.append(str);
            super(sb3.toString(), th3);
        }
    }

    public interface b<T extends e> {
        void g(T t7, long j8, long j14);

        c i(T t7, long j8, long j14, IOException iOException, int i14);

        void l(T t7, long j8, long j14, boolean z14);
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f9703a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f9704b;

        private c(int i14, long j8) {
            this.f9703a = i14;
            this.f9704b = j8;
        }
    }

    @SuppressLint({"HandlerLeak"})
    public final class d<T extends e> extends Handler implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f9705a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final T f9706b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f9707c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public b<T> f9708d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public IOException f9709e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f9710f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Thread f9711g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f9712h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public volatile boolean f9713i;

        public d(Looper looper, T t7, b<T> bVar, int i14, long j8) {
            super(looper);
            this.f9706b = t7;
            this.f9708d = bVar;
            this.f9705a = i14;
            this.f9707c = j8;
        }

        public final void a(boolean z14) {
            this.f9713i = z14;
            this.f9709e = null;
            if (hasMessages(1)) {
                this.f9712h = true;
                removeMessages(1);
                if (!z14) {
                    sendEmptyMessage(2);
                }
            } else {
                synchronized (this) {
                    try {
                        this.f9712h = true;
                        this.f9706b.cancelLoad();
                        Thread thread = this.f9711g;
                        if (thread != null) {
                            thread.interrupt();
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            }
            if (z14) {
                Loader.this.f9701b = null;
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                b<T> bVar = this.f9708d;
                bVar.getClass();
                bVar.l(this.f9706b, jElapsedRealtime, jElapsedRealtime - this.f9707c, true);
                this.f9708d = null;
            }
        }

        public final void b() {
            SystemClock.elapsedRealtime();
            this.f9708d.getClass();
            this.f9709e = null;
            Loader loader = Loader.this;
            ya.b bVar = loader.f9700a;
            d<? extends e> dVar = loader.f9701b;
            dVar.getClass();
            bVar.execute(dVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            if (this.f9713i) {
                return;
            }
            int i14 = message.what;
            if (i14 == 1) {
                b();
                return;
            }
            if (i14 == 4) {
                throw ((Error) message.obj);
            }
            Loader.this.f9701b = null;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j8 = jElapsedRealtime - this.f9707c;
            b<T> bVar = this.f9708d;
            bVar.getClass();
            if (this.f9712h) {
                bVar.l(this.f9706b, jElapsedRealtime, j8, false);
                return;
            }
            int i15 = message.what;
            if (i15 == 2) {
                try {
                    bVar.g(this.f9706b, jElapsedRealtime, j8);
                    return;
                } catch (RuntimeException e4) {
                    k.d("Unexpected exception handling load completed", e4);
                    Loader.this.f9702c = new UnexpectedLoaderException(e4);
                    return;
                }
            }
            if (i15 != 3) {
                return;
            }
            IOException iOException = (IOException) message.obj;
            this.f9709e = iOException;
            int i16 = this.f9710f + 1;
            this.f9710f = i16;
            c cVarI = bVar.i(this.f9706b, jElapsedRealtime, j8, iOException, i16);
            int i17 = cVarI.f9703a;
            if (i17 == 3) {
                Loader.this.f9702c = this.f9709e;
                return;
            }
            if (i17 != 2) {
                if (i17 == 1) {
                    this.f9710f = 1;
                }
                long jMin = cVarI.f9704b;
                if (jMin == C.TIME_UNSET) {
                    jMin = Math.min((this.f9710f - 1) * 1000, 5000);
                }
                Loader loader = Loader.this;
                fa.a.d(loader.f9701b == null);
                loader.f9701b = this;
                if (jMin > 0) {
                    sendEmptyMessageDelayed(1, jMin);
                } else {
                    b();
                }
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean z14;
            try {
                synchronized (this) {
                    z14 = this.f9712h;
                    this.f9711g = Thread.currentThread();
                }
                if (!z14) {
                    Trace.beginSection("load:".concat(this.f9706b.getClass().getSimpleName()));
                    try {
                        this.f9706b.load();
                        Trace.endSection();
                    } catch (Throwable th3) {
                        Trace.endSection();
                        throw th3;
                    }
                }
                synchronized (this) {
                    this.f9711g = null;
                    Thread.interrupted();
                }
                if (this.f9713i) {
                    return;
                }
                sendEmptyMessage(2);
            } catch (IOException e4) {
                if (this.f9713i) {
                    return;
                }
                obtainMessage(3, e4).sendToTarget();
            } catch (Exception e14) {
                if (this.f9713i) {
                    return;
                }
                k.d("Unexpected exception loading stream", e14);
                obtainMessage(3, new UnexpectedLoaderException(e14)).sendToTarget();
            } catch (OutOfMemoryError e15) {
                if (this.f9713i) {
                    return;
                }
                k.d("OutOfMemory error loading stream", e15);
                obtainMessage(3, new UnexpectedLoaderException(e15)).sendToTarget();
            } catch (Error e16) {
                if (!this.f9713i) {
                    k.d("Unexpected error loading stream", e16);
                    obtainMessage(4, e16).sendToTarget();
                }
                throw e16;
            }
        }
    }

    public interface e {
        void cancelLoad();

        void load();
    }

    public interface f {
        void onLoaderReleased();
    }

    public static final class g implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f f9715a;

        public g(f fVar) {
            this.f9715a = fVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f9715a.onLoaderReleased();
        }
    }

    static {
        long j8 = C.TIME_UNSET;
        f9697d = b(C.TIME_UNSET, false);
        b(C.TIME_UNSET, true);
        f9698e = new c(2, j8);
        f9699f = new c(3, j8);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Loader(String str) {
        String strN = fb1.c.n("ExoPlayer:Loader:", str);
        int i14 = z.f70071a;
        this(new ya.a(Executors.newSingleThreadExecutor(new a8.a(strN, 2)), new wr.g(5)));
    }

    public static c b(long j8, boolean z14) {
        return new c(z14 ? 1 : 0, j8);
    }

    public final void a() {
        d<? extends e> dVar = this.f9701b;
        fa.a.f(dVar);
        dVar.a(false);
    }

    public final boolean c() {
        return this.f9701b != null;
    }

    public final void d(f fVar) {
        d<? extends e> dVar = this.f9701b;
        if (dVar != null) {
            dVar.a(true);
        }
        ya.b bVar = this.f9700a;
        if (fVar != null) {
            bVar.execute(new g(fVar));
        }
        bVar.release();
    }

    public final <T extends e> long e(T t7, b<T> bVar, int i14) {
        Looper looperMyLooper = Looper.myLooper();
        fa.a.f(looperMyLooper);
        this.f9702c = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        d<? extends e> dVar = new d<>(looperMyLooper, t7, bVar, i14, jElapsedRealtime);
        Loader loader = Loader.this;
        fa.a.d(loader.f9701b == null);
        loader.f9701b = dVar;
        dVar.b();
        return jElapsedRealtime;
    }

    public Loader(ya.b bVar) {
        this.f9700a = bVar;
    }
}
