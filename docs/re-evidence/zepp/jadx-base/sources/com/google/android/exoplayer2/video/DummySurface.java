package com.google.android.exoplayer2.video;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.EGLSurfaceTexture;
import com.google.android.exoplayer2.util.GlUtil;
import com.google.android.exoplayer2.util.Log;

/* JADX INFO: loaded from: classes3.dex */
@RequiresApi(17)
public final class DummySurface extends Surface {
    private static final String c = "DummySurface";
    private static int d;
    private static boolean e;
    private final b a;
    private boolean b;
    public final boolean secure;

    public static class b extends HandlerThread implements Handler.Callback {
        private static final int f = 1;
        private static final int g = 2;
        private EGLSurfaceTexture a;
        private Handler b;

        @Nullable
        private Error c;

        @Nullable
        private RuntimeException d;

        @Nullable
        private DummySurface e;

        public b() {
            super("ExoPlayer:DummySurface");
        }

        private void b(int secureMode) {
            Assertions.checkNotNull(this.a);
            this.a.init(secureMode);
            this.e = new DummySurface(this, this.a.getSurfaceTexture(), secureMode != 0);
        }

        private void d() {
            Assertions.checkNotNull(this.a);
            this.a.release();
        }

        public DummySurface a(int secureMode) {
            boolean z;
            start();
            this.b = new Handler(getLooper(), this);
            this.a = new EGLSurfaceTexture(this.b);
            synchronized (this) {
                z = false;
                this.b.obtainMessage(1, secureMode, 0).sendToTarget();
                while (this.e == null && this.d == null && this.c == null) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
            RuntimeException runtimeException = this.d;
            if (runtimeException != null) {
                throw runtimeException;
            }
            Error error = this.c;
            if (error == null) {
                return (DummySurface) Assertions.checkNotNull(this.e);
            }
            throw error;
        }

        public void c() {
            Assertions.checkNotNull(this.b);
            this.b.sendEmptyMessage(2);
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message msg) {
            int i = msg.what;
            try {
                if (i != 1) {
                    if (i != 2) {
                        return true;
                    }
                    try {
                        d();
                    } catch (Throwable th) {
                        try {
                            Log.e(DummySurface.c, "Failed to release dummy surface", th);
                        } finally {
                            quit();
                        }
                    }
                    return true;
                }
                try {
                    b(msg.arg1);
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e) {
                    Log.e(DummySurface.c, "Failed to initialize dummy surface", e);
                    this.c = e;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e2) {
                    Log.e(DummySurface.c, "Failed to initialize dummy surface", e2);
                    this.d = e2;
                    synchronized (this) {
                        notify();
                    }
                }
                return true;
            } catch (Throwable th2) {
                synchronized (this) {
                    notify();
                    throw th2;
                }
            }
        }
    }

    private static int a(Context context) {
        if (GlUtil.isProtectedContentExtensionSupported(context)) {
            return GlUtil.isSurfacelessContextExtensionSupported() ? 1 : 2;
        }
        return 0;
    }

    public static synchronized boolean isSecureSupported(Context context) {
        if (!e) {
            d = a(context);
            e = true;
        }
        return d != 0;
    }

    public static DummySurface newInstanceV17(Context context, boolean secure) {
        Assertions.checkState(!secure || isSecureSupported(context));
        return new b().a(secure ? d : 0);
    }

    @Override // android.view.Surface
    public void release() {
        super.release();
        synchronized (this.a) {
            if (!this.b) {
                this.a.c();
                this.b = true;
            }
        }
    }

    private DummySurface(b thread, SurfaceTexture surfaceTexture, boolean secure) {
        super(surfaceTexture);
        this.a = thread;
        this.secure = secure;
    }
}
