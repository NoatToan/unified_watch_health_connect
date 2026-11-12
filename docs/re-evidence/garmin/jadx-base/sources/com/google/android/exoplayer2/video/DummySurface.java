package com.google.android.exoplayer2.video;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.EGLSurfaceTexture;
import com.google.android.exoplayer2.util.GlUtil;
import com.google.android.exoplayer2.util.Log;

/* JADX INFO: loaded from: classes14.dex */
public final class DummySurface extends Surface {
    private static final String TAG = "DummySurface";
    private static int secureMode;
    private static boolean secureModeInitialized;
    public final boolean secure;
    private final DummySurfaceThread thread;
    private boolean threadReleased;

    public static class DummySurfaceThread extends HandlerThread implements Handler.Callback {
        private static final int MSG_INIT = 1;
        private static final int MSG_RELEASE = 2;
        private EGLSurfaceTexture eglSurfaceTexture;
        private Handler handler;
        private Error initError;
        private RuntimeException initException;
        private DummySurface surface;

        public DummySurfaceThread() {
            super("ExoPlayer:DummySurface");
        }

        private void initInternal(int i14) {
            Assertions.checkNotNull(this.eglSurfaceTexture);
            this.eglSurfaceTexture.init(i14);
            this.surface = new DummySurface(this, this.eglSurfaceTexture.getSurfaceTexture(), i14 != 0);
        }

        private void releaseInternal() {
            Assertions.checkNotNull(this.eglSurfaceTexture);
            this.eglSurfaceTexture.release();
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i14 = message.what;
            try {
                if (i14 != 1) {
                    if (i14 != 2) {
                        return true;
                    }
                    try {
                        releaseInternal();
                    } catch (Throwable th3) {
                        try {
                            Log.e(DummySurface.TAG, "Failed to release dummy surface", th3);
                        } finally {
                            quit();
                        }
                    }
                    return true;
                }
                try {
                    initInternal(message.arg1);
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e4) {
                    Log.e(DummySurface.TAG, "Failed to initialize dummy surface", e4);
                    this.initError = e4;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e14) {
                    Log.e(DummySurface.TAG, "Failed to initialize dummy surface", e14);
                    this.initException = e14;
                    synchronized (this) {
                        notify();
                    }
                }
                return true;
            } catch (Throwable th4) {
                synchronized (this) {
                    notify();
                    throw th4;
                }
            }
        }

        public DummySurface init(int i14) {
            boolean z14;
            start();
            Handler handler = new Handler(getLooper(), this);
            this.handler = handler;
            this.eglSurfaceTexture = new EGLSurfaceTexture(handler);
            synchronized (this) {
                z14 = false;
                this.handler.obtainMessage(1, i14, 0).sendToTarget();
                while (this.surface == null && this.initException == null && this.initError == null) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                        z14 = true;
                    }
                }
            }
            if (z14) {
                Thread.currentThread().interrupt();
            }
            RuntimeException runtimeException = this.initException;
            if (runtimeException != null) {
                throw runtimeException;
            }
            Error error = this.initError;
            if (error == null) {
                return (DummySurface) Assertions.checkNotNull(this.surface);
            }
            throw error;
        }

        public void release() {
            Assertions.checkNotNull(this.handler);
            this.handler.sendEmptyMessage(2);
        }
    }

    private DummySurface(DummySurfaceThread dummySurfaceThread, SurfaceTexture surfaceTexture, boolean z14) {
        super(surfaceTexture);
        this.thread = dummySurfaceThread;
        this.secure = z14;
    }

    private static int getSecureMode(Context context) {
        if (GlUtil.isProtectedContentExtensionSupported(context)) {
            return GlUtil.isSurfacelessContextExtensionSupported() ? 1 : 2;
        }
        return 0;
    }

    public static synchronized boolean isSecureSupported(Context context) {
        try {
            if (!secureModeInitialized) {
                secureMode = getSecureMode(context);
                secureModeInitialized = true;
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return secureMode != 0;
    }

    public static DummySurface newInstanceV17(Context context, boolean z14) {
        Assertions.checkState(!z14 || isSecureSupported(context));
        return new DummySurfaceThread().init(z14 ? secureMode : 0);
    }

    @Override // android.view.Surface
    public void release() {
        super.release();
        synchronized (this.thread) {
            try {
                if (!this.threadReleased) {
                    this.thread.release();
                    this.threadReleased = true;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
