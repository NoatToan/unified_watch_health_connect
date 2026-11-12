package com.google.android.exoplayer2.upstream;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.TraceUtil;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes3.dex */
public final class Loader implements LoaderErrorThrower {
    public static final LoadErrorAction DONT_RETRY;
    public static final LoadErrorAction DONT_RETRY_FATAL;
    public static final LoadErrorAction RETRY;
    public static final LoadErrorAction RETRY_RESET_ERROR_COUNT;
    private static final String d = "ExoPlayer:Loader:";
    private static final int e = 0;
    private static final int f = 1;
    private static final int g = 2;
    private static final int h = 3;
    private final ExecutorService a;

    @Nullable
    private b<? extends Loadable> b;

    @Nullable
    private IOException c;

    public interface Callback<T extends Loadable> {
        void onLoadCanceled(T loadable, long elapsedRealtimeMs, long loadDurationMs, boolean released);

        void onLoadCompleted(T loadable, long elapsedRealtimeMs, long loadDurationMs);

        LoadErrorAction onLoadError(T loadable, long elapsedRealtimeMs, long loadDurationMs, IOException error, int errorCount);
    }

    public static final class LoadErrorAction {
        private final int a;
        private final long b;

        public boolean isRetry() {
            int i = this.a;
            return i == 0 || i == 1;
        }

        private LoadErrorAction(int type, long retryDelayMillis) {
            this.a = type;
            this.b = retryDelayMillis;
        }
    }

    public interface Loadable {
        void cancelLoad();

        void load() throws IOException;
    }

    public interface ReleaseCallback {
        void onLoaderReleased();
    }

    public static final class UnexpectedLoaderException extends IOException {
        public UnexpectedLoaderException(Throwable cause) {
            String simpleName = cause.getClass().getSimpleName();
            String message = cause.getMessage();
            StringBuilder sb = new StringBuilder(simpleName.length() + 13 + String.valueOf(message).length());
            sb.append("Unexpected ");
            sb.append(simpleName);
            sb.append(": ");
            sb.append(message);
            super(sb.toString(), cause);
        }
    }

    @SuppressLint({"HandlerLeak"})
    public final class b<T extends Loadable> extends Handler implements Runnable {
        private static final String k = "LoadTask";
        private static final int l = 0;
        private static final int m = 1;
        private static final int n = 2;
        private static final int o = 3;
        public final int a;
        private final T b;
        private final long c;

        @Nullable
        private Callback<T> d;

        @Nullable
        private IOException e;
        private int f;

        @Nullable
        private Thread g;
        private boolean h;
        private volatile boolean i;

        public b(Looper looper, T loadable, Callback<T> callback, int defaultMinRetryCount, long startTimeMs) {
            super(looper);
            this.b = loadable;
            this.d = callback;
            this.a = defaultMinRetryCount;
            this.c = startTimeMs;
        }

        private void b() {
            this.e = null;
            Loader.this.a.execute((Runnable) Assertions.checkNotNull(Loader.this.b));
        }

        private void c() {
            Loader.this.b = null;
        }

        private long d() {
            return Math.min((this.f - 1) * 1000, 5000);
        }

        public void a(boolean released) {
            this.i = released;
            this.e = null;
            if (hasMessages(0)) {
                this.h = true;
                removeMessages(0);
                if (!released) {
                    sendEmptyMessage(1);
                }
            } else {
                synchronized (this) {
                    this.h = true;
                    this.b.cancelLoad();
                    Thread thread = this.g;
                    if (thread != null) {
                        thread.interrupt();
                    }
                }
            }
            if (released) {
                c();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                ((Callback) Assertions.checkNotNull(this.d)).onLoadCanceled(this.b, jElapsedRealtime, jElapsedRealtime - this.c, true);
                this.d = null;
            }
        }

        public void e(int minRetryCount) throws IOException {
            IOException iOException = this.e;
            if (iOException != null && this.f > minRetryCount) {
                throw iOException;
            }
        }

        public void f(long delayMillis) {
            Assertions.checkState(Loader.this.b == null);
            Loader.this.b = this;
            if (delayMillis > 0) {
                sendEmptyMessageDelayed(0, delayMillis);
            } else {
                b();
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message msg) {
            if (this.i) {
                return;
            }
            int i = msg.what;
            if (i == 0) {
                b();
                return;
            }
            if (i == 3) {
                throw ((Error) msg.obj);
            }
            c();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j = jElapsedRealtime - this.c;
            Callback callback = (Callback) Assertions.checkNotNull(this.d);
            if (this.h) {
                callback.onLoadCanceled(this.b, jElapsedRealtime, j, false);
                return;
            }
            int i2 = msg.what;
            if (i2 == 1) {
                try {
                    callback.onLoadCompleted(this.b, jElapsedRealtime, j);
                    return;
                } catch (RuntimeException e) {
                    Log.e(k, "Unexpected exception handling load completed", e);
                    Loader.this.c = new UnexpectedLoaderException(e);
                    return;
                }
            }
            if (i2 != 2) {
                return;
            }
            IOException iOException = (IOException) msg.obj;
            this.e = iOException;
            int i3 = this.f + 1;
            this.f = i3;
            LoadErrorAction loadErrorActionOnLoadError = callback.onLoadError(this.b, jElapsedRealtime, j, iOException, i3);
            if (loadErrorActionOnLoadError.a == 3) {
                Loader.this.c = this.e;
            } else if (loadErrorActionOnLoadError.a != 2) {
                if (loadErrorActionOnLoadError.a == 1) {
                    this.f = 1;
                }
                f(loadErrorActionOnLoadError.b != C.TIME_UNSET ? loadErrorActionOnLoadError.b : d());
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
                    String simpleName = this.b.getClass().getSimpleName();
                    TraceUtil.beginSection(simpleName.length() != 0 ? "load:".concat(simpleName) : new String("load:"));
                    try {
                        this.b.load();
                        TraceUtil.endSection();
                    } catch (Throwable th) {
                        TraceUtil.endSection();
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
                    Log.e(k, "Unexpected error loading stream", e2);
                    obtainMessage(3, e2).sendToTarget();
                }
                throw e2;
            } catch (Exception e3) {
                if (this.i) {
                    return;
                }
                Log.e(k, "Unexpected exception loading stream", e3);
                obtainMessage(2, new UnexpectedLoaderException(e3)).sendToTarget();
            } catch (OutOfMemoryError e4) {
                if (this.i) {
                    return;
                }
                Log.e(k, "OutOfMemory error loading stream", e4);
                obtainMessage(2, new UnexpectedLoaderException(e4)).sendToTarget();
            }
        }
    }

    public static final class c implements Runnable {
        private final ReleaseCallback a;

        public c(ReleaseCallback callback) {
            this.a = callback;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.onLoaderReleased();
        }
    }

    static {
        long j = C.TIME_UNSET;
        RETRY = createRetryAction(false, C.TIME_UNSET);
        RETRY_RESET_ERROR_COUNT = createRetryAction(true, C.TIME_UNSET);
        DONT_RETRY = new LoadErrorAction(2, j);
        DONT_RETRY_FATAL = new LoadErrorAction(3, j);
    }

    public Loader(String threadNameSuffix) {
        String strValueOf = String.valueOf(threadNameSuffix);
        this.a = Util.newSingleThreadExecutor(strValueOf.length() != 0 ? d.concat(strValueOf) : new String(d));
    }

    public static LoadErrorAction createRetryAction(boolean z, long j) {
        return new LoadErrorAction(z ? 1 : 0, j);
    }

    public void cancelLoading() {
        ((b) Assertions.checkStateNotNull(this.b)).a(false);
    }

    public void clearFatalError() {
        this.c = null;
    }

    public boolean hasFatalError() {
        return this.c != null;
    }

    public boolean isLoading() {
        return this.b != null;
    }

    @Override // com.google.android.exoplayer2.upstream.LoaderErrorThrower
    public void maybeThrowError() throws IOException {
        maybeThrowError(Integer.MIN_VALUE);
    }

    public void release() {
        release(null);
    }

    public <T extends Loadable> long startLoading(T loadable, Callback<T> callback, int defaultMinRetryCount) {
        Looper looper = (Looper) Assertions.checkStateNotNull(Looper.myLooper());
        this.c = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        new b(looper, loadable, callback, defaultMinRetryCount, jElapsedRealtime).f(0L);
        return jElapsedRealtime;
    }

    @Override // com.google.android.exoplayer2.upstream.LoaderErrorThrower
    public void maybeThrowError(int minRetryCount) throws IOException {
        IOException iOException = this.c;
        if (iOException != null) {
            throw iOException;
        }
        b<? extends Loadable> bVar = this.b;
        if (bVar != null) {
            if (minRetryCount == Integer.MIN_VALUE) {
                minRetryCount = bVar.a;
            }
            bVar.e(minRetryCount);
        }
    }

    public void release(@Nullable ReleaseCallback callback) {
        b<? extends Loadable> bVar = this.b;
        if (bVar != null) {
            bVar.a(true);
        }
        if (callback != null) {
            this.a.execute(new c(callback));
        }
        this.a.shutdown();
    }
}
