package com.google.android.exoplayer2.upstream;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.TraceUtil;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.v;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes14.dex */
public final class Loader implements LoaderErrorThrower {
    private static final int ACTION_TYPE_DONT_RETRY = 2;
    private static final int ACTION_TYPE_DONT_RETRY_FATAL = 3;
    private static final int ACTION_TYPE_RETRY = 0;
    private static final int ACTION_TYPE_RETRY_AND_RESET_ERROR_COUNT = 1;
    public static final LoadErrorAction DONT_RETRY;
    public static final LoadErrorAction DONT_RETRY_FATAL;
    public static final LoadErrorAction RETRY;
    public static final LoadErrorAction RETRY_RESET_ERROR_COUNT;
    private static final String THREAD_NAME_PREFIX = "ExoPlayer:Loader:";
    private LoadTask<? extends Loadable> currentTask;
    private final ExecutorService downloadExecutorService;
    private IOException fatalError;

    public interface Callback<T extends Loadable> {
        void onLoadCanceled(T t7, long j8, long j14, boolean z14);

        void onLoadCompleted(T t7, long j8, long j14);

        LoadErrorAction onLoadError(T t7, long j8, long j14, IOException iOException, int i14);
    }

    public static final class LoadErrorAction {
        private final long retryDelayMillis;
        private final int type;

        private LoadErrorAction(int i14, long j8) {
            this.type = i14;
            this.retryDelayMillis = j8;
        }

        public boolean isRetry() {
            int i14 = this.type;
            return i14 == 0 || i14 == 1;
        }
    }

    @SuppressLint({"HandlerLeak"})
    public final class LoadTask<T extends Loadable> extends Handler implements Runnable {
        private static final int MSG_FATAL_ERROR = 3;
        private static final int MSG_FINISH = 1;
        private static final int MSG_IO_EXCEPTION = 2;
        private static final int MSG_START = 0;
        private static final String TAG = "LoadTask";
        private Callback<T> callback;
        private boolean canceled;
        private IOException currentError;
        public final int defaultMinRetryCount;
        private int errorCount;
        private Thread executorThread;
        private final T loadable;
        private volatile boolean released;
        private final long startTimeMs;

        public LoadTask(Looper looper, T t7, Callback<T> callback, int i14, long j8) {
            super(looper);
            this.loadable = t7;
            this.callback = callback;
            this.defaultMinRetryCount = i14;
            this.startTimeMs = j8;
        }

        private void execute() {
            this.currentError = null;
            Loader.this.downloadExecutorService.execute((Runnable) Assertions.checkNotNull(Loader.this.currentTask));
        }

        private void finish() {
            Loader.this.currentTask = null;
        }

        private long getRetryDelayMillis() {
            return Math.min((this.errorCount - 1) * 1000, 5000);
        }

        public void cancel(boolean z14) {
            this.released = z14;
            this.currentError = null;
            if (hasMessages(0)) {
                this.canceled = true;
                removeMessages(0);
                if (!z14) {
                    sendEmptyMessage(1);
                }
            } else {
                synchronized (this) {
                    try {
                        this.canceled = true;
                        this.loadable.cancelLoad();
                        Thread thread = this.executorThread;
                        if (thread != null) {
                            thread.interrupt();
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            }
            if (z14) {
                finish();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                ((Callback) Assertions.checkNotNull(this.callback)).onLoadCanceled(this.loadable, jElapsedRealtime, jElapsedRealtime - this.startTimeMs, true);
                this.callback = null;
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (this.released) {
                return;
            }
            int i14 = message.what;
            if (i14 == 0) {
                execute();
                return;
            }
            if (i14 == 3) {
                throw ((Error) message.obj);
            }
            finish();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j8 = jElapsedRealtime - this.startTimeMs;
            Callback callback = (Callback) Assertions.checkNotNull(this.callback);
            if (this.canceled) {
                callback.onLoadCanceled(this.loadable, jElapsedRealtime, j8, false);
                return;
            }
            int i15 = message.what;
            if (i15 == 1) {
                try {
                    callback.onLoadCompleted(this.loadable, jElapsedRealtime, j8);
                    return;
                } catch (RuntimeException e4) {
                    Log.e(TAG, "Unexpected exception handling load completed", e4);
                    Loader.this.fatalError = new UnexpectedLoaderException(e4);
                    return;
                }
            }
            if (i15 != 2) {
                return;
            }
            IOException iOException = (IOException) message.obj;
            this.currentError = iOException;
            int i16 = this.errorCount + 1;
            this.errorCount = i16;
            LoadErrorAction loadErrorActionOnLoadError = callback.onLoadError(this.loadable, jElapsedRealtime, j8, iOException, i16);
            if (loadErrorActionOnLoadError.type == 3) {
                Loader.this.fatalError = this.currentError;
            } else if (loadErrorActionOnLoadError.type != 2) {
                if (loadErrorActionOnLoadError.type == 1) {
                    this.errorCount = 1;
                }
                start(loadErrorActionOnLoadError.retryDelayMillis != C.TIME_UNSET ? loadErrorActionOnLoadError.retryDelayMillis : getRetryDelayMillis());
            }
        }

        public void maybeThrowError(int i14) throws IOException {
            IOException iOException = this.currentError;
            if (iOException != null && this.errorCount > i14) {
                throw iOException;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z14;
            try {
                synchronized (this) {
                    z14 = this.canceled;
                    this.executorThread = Thread.currentThread();
                }
                if (!z14) {
                    String simpleName = this.loadable.getClass().getSimpleName();
                    TraceUtil.beginSection(simpleName.length() != 0 ? "load:".concat(simpleName) : new String("load:"));
                    try {
                        this.loadable.load();
                        TraceUtil.endSection();
                    } catch (Throwable th3) {
                        TraceUtil.endSection();
                        throw th3;
                    }
                }
                synchronized (this) {
                    this.executorThread = null;
                    Thread.interrupted();
                }
                if (this.released) {
                    return;
                }
                sendEmptyMessage(1);
            } catch (IOException e4) {
                if (this.released) {
                    return;
                }
                obtainMessage(2, e4).sendToTarget();
            } catch (Error e14) {
                if (!this.released) {
                    Log.e(TAG, "Unexpected error loading stream", e14);
                    obtainMessage(3, e14).sendToTarget();
                }
                throw e14;
            } catch (Exception e15) {
                if (this.released) {
                    return;
                }
                Log.e(TAG, "Unexpected exception loading stream", e15);
                obtainMessage(2, new UnexpectedLoaderException(e15)).sendToTarget();
            } catch (OutOfMemoryError e16) {
                if (this.released) {
                    return;
                }
                Log.e(TAG, "OutOfMemory error loading stream", e16);
                obtainMessage(2, new UnexpectedLoaderException(e16)).sendToTarget();
            }
        }

        public void start(long j8) {
            Assertions.checkState(Loader.this.currentTask == null);
            Loader.this.currentTask = this;
            if (j8 > 0) {
                sendEmptyMessageDelayed(0, j8);
            } else {
                execute();
            }
        }
    }

    public interface Loadable {
        void cancelLoad();

        void load();
    }

    public interface ReleaseCallback {
        void onLoaderReleased();
    }

    public static final class ReleaseTask implements Runnable {
        private final ReleaseCallback callback;

        public ReleaseTask(ReleaseCallback releaseCallback) {
            this.callback = releaseCallback;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.callback.onLoaderReleased();
        }
    }

    public static final class UnexpectedLoaderException extends IOException {
        public UnexpectedLoaderException(Throwable th3) {
            String simpleName = th3.getClass().getSimpleName();
            String message = th3.getMessage();
            StringBuilder sb3 = new StringBuilder(v.a(simpleName.length() + 13, message));
            sb3.append("Unexpected ");
            sb3.append(simpleName);
            sb3.append(": ");
            sb3.append(message);
            super(sb3.toString(), th3);
        }
    }

    static {
        long j8 = C.TIME_UNSET;
        RETRY = createRetryAction(false, C.TIME_UNSET);
        RETRY_RESET_ERROR_COUNT = createRetryAction(true, C.TIME_UNSET);
        DONT_RETRY = new LoadErrorAction(2, j8);
        DONT_RETRY_FATAL = new LoadErrorAction(3, j8);
    }

    public Loader(String str) {
        String strValueOf = String.valueOf(str);
        this.downloadExecutorService = Util.newSingleThreadExecutor(strValueOf.length() != 0 ? THREAD_NAME_PREFIX.concat(strValueOf) : new String(THREAD_NAME_PREFIX));
    }

    public static LoadErrorAction createRetryAction(boolean z14, long j8) {
        return new LoadErrorAction(z14 ? 1 : 0, j8);
    }

    public void cancelLoading() {
        ((LoadTask) Assertions.checkStateNotNull(this.currentTask)).cancel(false);
    }

    public void clearFatalError() {
        this.fatalError = null;
    }

    public boolean hasFatalError() {
        return this.fatalError != null;
    }

    public boolean isLoading() {
        return this.currentTask != null;
    }

    @Override // com.google.android.exoplayer2.upstream.LoaderErrorThrower
    public void maybeThrowError(int i14) throws IOException {
        IOException iOException = this.fatalError;
        if (iOException != null) {
            throw iOException;
        }
        LoadTask<? extends Loadable> loadTask = this.currentTask;
        if (loadTask != null) {
            if (i14 == Integer.MIN_VALUE) {
                i14 = loadTask.defaultMinRetryCount;
            }
            loadTask.maybeThrowError(i14);
        }
    }

    public void release(ReleaseCallback releaseCallback) {
        LoadTask<? extends Loadable> loadTask = this.currentTask;
        if (loadTask != null) {
            loadTask.cancel(true);
        }
        if (releaseCallback != null) {
            this.downloadExecutorService.execute(new ReleaseTask(releaseCallback));
        }
        this.downloadExecutorService.shutdown();
    }

    public <T extends Loadable> long startLoading(T t7, Callback<T> callback, int i14) {
        Looper looper = (Looper) Assertions.checkStateNotNull(Looper.myLooper());
        this.fatalError = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        new LoadTask(looper, t7, callback, i14, jElapsedRealtime).start(0L);
        return jElapsedRealtime;
    }

    @Override // com.google.android.exoplayer2.upstream.LoaderErrorThrower
    public void maybeThrowError() throws IOException {
        maybeThrowError(Integer.MIN_VALUE);
    }

    public void release() {
        release(null);
    }
}
