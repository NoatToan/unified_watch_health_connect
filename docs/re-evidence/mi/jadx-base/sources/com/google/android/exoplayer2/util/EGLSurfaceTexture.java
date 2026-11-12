package com.google.android.exoplayer2.util;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import androidx.annotation.RequiresApi;
import defpackage.rk1;
import defpackage.wlq;
import defpackage.yza;

/* JADX INFO: loaded from: classes4.dex */
@RequiresApi(17)
public final class EGLSurfaceTexture implements SurfaceTexture.OnFrameAvailableListener, Runnable {
    public static final int[] g = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f8440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f8441b;
    public EGLDisplay c;
    public EGLContext d;
    public EGLSurface e;
    public SurfaceTexture f;

    public static final class GlException extends RuntimeException {
        private GlException(String str) {
            super(str);
        }
    }

    public interface b {
    }

    public EGLSurfaceTexture(Handler handler) {
        this(handler, null);
    }

    public static EGLConfig a(EGLDisplay eGLDisplay) {
        EGLConfig eGLConfig;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr = new int[1];
        boolean zEglChooseConfig = EGL14.eglChooseConfig(eGLDisplay, g, 0, eGLConfigArr, 0, 1, iArr, 0);
        if (!zEglChooseConfig || iArr[0] <= 0 || (eGLConfig = eGLConfigArr[0]) == null) {
            throw new GlException(wlq.D("eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", Boolean.valueOf(zEglChooseConfig), Integer.valueOf(iArr[0]), eGLConfigArr[0]));
        }
        return eGLConfig;
    }

    public static EGLContext b(EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i) {
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, i == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
        if (eGLContextEglCreateContext != null) {
            return eGLContextEglCreateContext;
        }
        throw new GlException("eglCreateContext failed");
    }

    public static EGLSurface c(EGLDisplay eGLDisplay, EGLConfig eGLConfig, EGLContext eGLContext, int i) {
        EGLSurface eGLSurfaceEglCreatePbufferSurface;
        if (i == 1) {
            eGLSurfaceEglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
            if (eGLSurfaceEglCreatePbufferSurface == null) {
                throw new GlException("eglCreatePbufferSurface failed");
            }
        }
        if (EGL14.eglMakeCurrent(eGLDisplay, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, eGLContext)) {
            return eGLSurfaceEglCreatePbufferSurface;
        }
        throw new GlException("eglMakeCurrent failed");
    }

    public static void e(int[] iArr) {
        GLES20.glGenTextures(1, iArr, 0);
        yza.b();
    }

    public static EGLDisplay f() {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        if (eGLDisplayEglGetDisplay == null) {
            throw new GlException("eglGetDisplay failed");
        }
        int[] iArr = new int[2];
        if (EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1)) {
            return eGLDisplayEglGetDisplay;
        }
        throw new GlException("eglInitialize failed");
    }

    public final void d() {
    }

    public SurfaceTexture g() {
        return (SurfaceTexture) rk1.e(this.f);
    }

    public void h(int i) {
        EGLDisplay eGLDisplayF = f();
        this.c = eGLDisplayF;
        EGLConfig eGLConfigA = a(eGLDisplayF);
        EGLContext eGLContextB = b(this.c, eGLConfigA, i);
        this.d = eGLContextB;
        this.e = c(this.c, eGLConfigA, eGLContextB, i);
        e(this.f8441b);
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f8441b[0]);
        this.f = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void i() {
        this.f8440a.removeCallbacks(this);
        try {
            SurfaceTexture surfaceTexture = this.f;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, this.f8441b, 0);
            }
        } finally {
            EGLDisplay eGLDisplay = this.c;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = this.c;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = this.e;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.c, this.e);
            }
            EGLContext eGLContext = this.d;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(this.c, eGLContext);
            }
            if (wlq.f38110a >= 19) {
                EGL14.eglReleaseThread();
            }
            EGLDisplay eGLDisplay3 = this.c;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(this.c);
            }
            this.c = null;
            this.d = null;
            this.e = null;
            this.f = null;
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f8440a.post(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        d();
        SurfaceTexture surfaceTexture = this.f;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }

    public EGLSurfaceTexture(Handler handler, b bVar) {
        this.f8440a = handler;
        this.f8441b = new int[1];
    }
}
