package com.huawei.haf.mediaprocess;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.view.Surface;
import health.compact.a.LogUtil;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class EncodeInputSurface {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private EGLDisplay f5993b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Surface f5994c;
    private EGLSurface d;
    private EGLContext e;

    public EncodeInputSurface(Surface surface) throws IOException {
        if (surface == null) {
            LogUtil.d("EncodeInputSurface", "surface is null");
        }
        this.f5994c = surface;
        a();
    }

    private void a() throws IOException {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        this.f5993b = eGLDisplayEglGetDisplay;
        if (eGLDisplayEglGetDisplay == EGL14.EGL_NO_DISPLAY) {
            LogUtil.d("EncodeInputSurface", "unable to get EGL14 display");
            throw new IOException("unable to get EGL14 display");
        }
        int[] iArr = new int[2];
        if (!EGL14.eglInitialize(this.f5993b, iArr, 0, iArr, 1)) {
            this.f5993b = null;
            LogUtil.d("EncodeInputSurface", "unable to initialize EGL14");
            throw new IOException("unable to initialize EGL14");
        }
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (!EGL14.eglChooseConfig(this.f5993b, new int[]{12324, 8, 12323, 8, 12322, 8, 12352, 4, 12610, 1, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
            LogUtil.d("EncodeInputSurface", "unable to find RGB888+recordable ES2 EGL config");
            throw new IOException("unable to find RGB888+recordable ES2 EGL config");
        }
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(this.f5993b, eGLConfigArr[0], EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
        this.e = eGLContextEglCreateContext;
        if (eGLContextEglCreateContext == null) {
            LogUtil.d("EncodeInputSurface", "null eglcontext");
            throw new IOException("null eglcontext");
        }
        EGLSurface eGLSurfaceEglCreateWindowSurface = EGL14.eglCreateWindowSurface(this.f5993b, eGLConfigArr[0], this.f5994c, new int[]{12344}, 0);
        this.d = eGLSurfaceEglCreateWindowSurface;
        if (eGLSurfaceEglCreateWindowSurface != null) {
            return;
        }
        LogUtil.d("EncodeInputSurface", "null eglSurface");
        throw new IOException("null eglSurface");
    }

    public void d() {
        if (EGL14.eglGetCurrentContext().equals(this.e)) {
            EGL14.eglMakeCurrent(this.f5993b, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_CONTEXT);
        }
        EGL14.eglDestroySurface(this.f5993b, this.d);
        EGL14.eglDestroyContext(this.f5993b, this.e);
        this.f5994c.release();
        this.f5993b = null;
        this.e = null;
        this.d = null;
        this.f5994c = null;
    }

    public void b() throws IOException {
        EGLDisplay eGLDisplay = this.f5993b;
        EGLSurface eGLSurface = this.d;
        if (EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.e)) {
            return;
        }
        LogUtil.d("EncodeInputSurface", "eglMakeCurrent failed");
        throw new IOException("eglMakeCurrent failed");
    }

    public boolean e() {
        return EGL14.eglSwapBuffers(this.f5993b, this.d);
    }

    public void b(long j) {
        EGLExt.eglPresentationTimeANDROID(this.f5993b, this.d, j);
    }
}
