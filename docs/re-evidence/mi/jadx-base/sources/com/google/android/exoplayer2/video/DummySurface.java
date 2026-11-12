package com.google.android.exoplayer2.video;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.util.EGLSurfaceTexture;
import defpackage.rk1;
import defpackage.toe;
import defpackage.yza;

/* JADX INFO: loaded from: classes4.dex */
@RequiresApi(17)
public final class DummySurface extends Surface {
    public static int d;
    public static boolean e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f8454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f8455b;
    public boolean c;

    public static class b extends HandlerThread implements Handler.Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public EGLSurfaceTexture f8456a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Handler f8457b;
        public Error c;
        public RuntimeException d;
        public DummySurface e;

        public b() {
            super("ExoPlayer:DummySurface");
        }

        public DummySurface a(int i) {
            boolean z;
            start();
            this.f8457b = new Handler(getLooper(), this);
            this.f8456a = new EGLSurfaceTexture(this.f8457b);
            synchronized (this) {
                z = false;
                this.f8457b.obtainMessage(1, i, 0).sendToTarget();
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
                return (DummySurface) rk1.e(this.e);
            }
            throw error;
        }

        public final void b(int i) {
            rk1.e(this.f8456a);
            this.f8456a.h(i);
            this.e = new DummySurface(this, this.f8456a.g(), i != 0);
        }

        public void c() {
            rk1.e(this.f8457b);
            this.f8457b.sendEmptyMessage(2);
        }

        public final void d() {
            rk1.e(this.f8456a);
            this.f8456a.i();
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            try {
                if (i != 1) {
                    if (i != 2) {
                        return true;
                    }
                    try {
                        d();
                    } catch (Throwable th) {
                        try {
                            toe.d("DummySurface", "Failed to release dummy surface", th);
                        } finally {
                            quit();
                        }
                    }
                    return true;
                }
                try {
                    b(message.arg1);
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e) {
                    toe.d("DummySurface", "Failed to initialize dummy surface", e);
                    this.c = e;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e2) {
                    toe.d("DummySurface", "Failed to initialize dummy surface", e2);
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

    public static int a(Context context) {
        if (yza.h(context)) {
            return yza.i() ? 1 : 2;
        }
        return 0;
    }

    public static synchronized boolean c(Context context) {
        try {
            if (!e) {
                d = a(context);
                e = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return d != 0;
    }

    public static DummySurface d(Context context, boolean z) {
        rk1.g(!z || c(context));
        return new b().a(z ? d : 0);
    }

    @Override // android.view.Surface
    public void release() {
        super.release();
        synchronized (this.f8455b) {
            try {
                if (!this.c) {
                    this.f8455b.c();
                    this.c = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public DummySurface(b bVar, SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.f8455b = bVar;
        this.f8454a = z;
    }
}
