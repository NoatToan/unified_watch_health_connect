package com.huawei.openalliance.ad;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.view.Surface;

/* JADX INFO: loaded from: classes41.dex */
public final class eg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private EGLDisplay f18681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private EGLContext f18682b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private EGLConfig f18683c;
    private final int[] d = {12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12344, 0, 12344};

    protected void finalize() throws Throwable {
        try {
            if (this.f18681a != EGL14.EGL_NO_DISPLAY) {
                a();
            }
        } finally {
            super.finalize();
        }
    }

    void c(EGLSurface eGLSurface) {
        if (EGL14.eglSwapBuffers(this.f18681a, eGLSurface)) {
            return;
        }
        hw.a("GlEngine", "fail to update buffer");
    }

    void b(EGLSurface eGLSurface) {
        if (!EGL14.eglMakeCurrent(this.f18681a, eGLSurface, eGLSurface, this.f18682b)) {
            throw new IllegalStateException("set current fail");
        }
    }

    public void b() {
        if (!EGL14.eglMakeCurrent(this.f18681a, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_CONTEXT)) {
            throw new IllegalStateException("set no current fail");
        }
    }

    void a(EGLSurface eGLSurface) {
        EGL14.eglDestroySurface(this.f18681a, eGLSurface);
    }

    public void a() {
        if (this.f18681a != EGL14.EGL_NO_DISPLAY) {
            EGL14.eglMakeCurrent(this.f18681a, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_CONTEXT);
            EGL14.eglDestroyContext(this.f18681a, this.f18682b);
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.f18681a);
        }
        this.f18681a = EGL14.EGL_NO_DISPLAY;
        this.f18682b = EGL14.EGL_NO_CONTEXT;
        this.f18683c = null;
    }

    EGLSurface a(Surface surface) {
        EGLSurface eGLSurfaceEglCreateWindowSurface = EGL14.eglCreateWindowSurface(this.f18681a, this.f18683c, surface, new int[]{12344}, 0);
        a("create window surface fail");
        if (eGLSurfaceEglCreateWindowSurface != null) {
            return eGLSurfaceEglCreateWindowSurface;
        }
        throw new IllegalStateException("gl surface is null");
    }

    int a(EGLSurface eGLSurface, int i) {
        int[] iArr = new int[1];
        EGL14.eglQuerySurface(this.f18681a, eGLSurface, i, iArr, 0);
        return iArr[0];
    }

    private EGLConfig e() {
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (EGL14.eglChooseConfig(this.f18681a, this.d, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
            return eGLConfigArr[0];
        }
        hw.c("GlEngine", "fail to choose gl config");
        return null;
    }

    private void d() {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        this.f18681a = eGLDisplayEglGetDisplay;
        if (eGLDisplayEglGetDisplay == EGL14.EGL_NO_DISPLAY) {
            throw new IllegalStateException("fail to get gl display");
        }
        int[] iArr = new int[2];
        if (EGL14.eglInitialize(this.f18681a, iArr, 0, iArr, 1)) {
            return;
        }
        this.f18681a = null;
        throw new IllegalStateException("fail to init gl");
    }

    private void c() {
        EGLConfig eGLConfigE = e();
        if (eGLConfigE == null) {
            throw new IllegalStateException("fail to get config");
        }
        this.f18682b = EGL14.eglCreateContext(this.f18681a, eGLConfigE, EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
        a("create context fail");
        this.f18683c = eGLConfigE;
    }

    private void a(String str) {
        int iEglGetError = EGL14.eglGetError();
        if (iEglGetError == 12288) {
            return;
        }
        throw new IllegalStateException(str + " err code " + Integer.toHexString(iEglGetError));
    }

    public eg() {
        d();
        c();
        EGL14.eglQueryContext(this.f18681a, this.f18682b, 12440, new int[1], 0);
    }
}
