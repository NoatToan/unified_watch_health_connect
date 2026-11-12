package defpackage;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.view.Surface;

/* JADX INFO: loaded from: classes10.dex */
public class krq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public EGLDisplay f24239a = EGL14.EGL_NO_DISPLAY;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public EGLContext f24240b = EGL14.EGL_NO_CONTEXT;
    public EGLSurface c = EGL14.EGL_NO_SURFACE;
    public Surface d;

    public krq(Surface surface) {
        this.d = surface;
        b();
        c();
    }

    public final void a(String str) {
        int iEglGetError = EGL14.eglGetError();
        if (iEglGetError == 12288) {
            return;
        }
        throw new RuntimeException(str + ": EGL error: 0x" + Integer.toHexString(iEglGetError));
    }

    public final void b() {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        this.f24239a = eGLDisplayEglGetDisplay;
        if (eGLDisplayEglGetDisplay == EGL14.EGL_NO_DISPLAY) {
            throw new RuntimeException("unable to get EGL14 display");
        }
        int[] iArr = new int[2];
        if (!EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1)) {
            this.f24239a = null;
            throw new RuntimeException("unable to initialize EGL14");
        }
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (!EGL14.eglChooseConfig(this.f24239a, new int[]{12324, 8, 12323, 8, 12322, 8, 12352, 4, 12610, 1, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
            throw new RuntimeException("unable to find RGB888+recordable ES2 EGL config");
        }
        this.f24240b = EGL14.eglCreateContext(this.f24239a, eGLConfigArr[0], EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
        a("eglCreateContext");
        if (this.f24240b == null) {
            throw new RuntimeException("null context");
        }
        this.c = EGL14.eglCreateWindowSurface(this.f24239a, eGLConfigArr[0], this.d, new int[]{12344}, 0);
        a("eglCreateWindowSurface");
        if (this.c == null) {
            throw new RuntimeException("surface was null");
        }
    }

    public final void c() {
        EGLDisplay eGLDisplay = this.f24239a;
        EGLSurface eGLSurface = this.c;
        if (!EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.f24240b)) {
            throw new RuntimeException("eglMakeCurrent failed");
        }
    }

    public void d() {
        EGLDisplay eGLDisplay = this.f24239a;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
            EGL14.eglDestroySurface(eGLDisplay, this.c);
            EGL14.eglDestroyContext(this.f24239a, this.f24240b);
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.f24239a);
            this.f24239a = EGL14.EGL_NO_DISPLAY;
            this.f24240b = EGL14.EGL_NO_CONTEXT;
            this.c = EGL14.EGL_NO_SURFACE;
        }
        Surface surface = this.d;
        if (surface != null) {
            surface.release();
            this.d = null;
        }
    }

    public void e(long j) {
        EGLExt.eglPresentationTimeANDROID(this.f24239a, this.c, j);
    }

    public boolean f() {
        return EGL14.eglSwapBuffers(this.f24239a, this.c);
    }
}
