package com.huawei.healthcloud.plugintrack.trackanimation.recorder.glec;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.view.Surface;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.jgk;
import defpackage.jgm;
import health.compact.a.LogAnonymous;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes10.dex */
public class RecorderEglRender implements SurfaceTexture.OnFrameAvailableListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f10673b;
    private OnFrameCallBack d;
    private long g;
    private int j;
    private Surface k;
    private boolean n;
    private int o;
    private jgk p;
    private long q;
    private SurfaceTexture s;
    private int t;
    private EGLDisplay e = EGL14.EGL_NO_DISPLAY;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private EGLContext f10672a = EGL14.EGL_NO_CONTEXT;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private EGLContext f10674c = EGL14.EGL_NO_CONTEXT;
    private EGLSurface i = EGL14.EGL_NO_SURFACE;
    private EGLSurface h = EGL14.EGL_NO_SURFACE;
    private boolean l = false;
    private int f = 1;
    private long m = 0;

    public interface OnFrameCallBack {
        void onUpdate();
    }

    public RecorderEglRender(int i, int i2, int i3, Surface surface, long j) {
        this.t = i;
        this.o = i2;
        this.j = i3;
        this.g = j;
        a(surface);
        f();
        h();
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.l = true;
    }

    public void c(OnFrameCallBack onFrameCallBack) {
        this.d = onFrameCallBack;
    }

    public Surface c() {
        return this.k;
    }

    public void a() {
        this.n = false;
    }

    public void e() {
        this.n = true;
        this.q = System.currentTimeMillis();
        while (this.n) {
            e(1);
            d();
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.f10673b = jCurrentTimeMillis;
            if (jCurrentTimeMillis - this.q < 280) {
                d(this.g);
            } else {
                long j = jCurrentTimeMillis - this.m;
                long j2 = this.g;
                if (j >= j2) {
                    b();
                    this.d.onUpdate();
                    c(a(this.f));
                    this.f++;
                    g();
                    this.m = this.f10673b;
                } else {
                    d(j2 - j);
                }
            }
        }
    }

    private void d(long j) {
        if (j < 0) {
            return;
        }
        try {
            Thread.sleep(j);
        } catch (InterruptedException e) {
            ReleaseLogUtil.a("Track_RecorderEglRender", "start sleep ", LogAnonymous.b(e));
        }
    }

    private void a(Surface surface) {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        this.e = eGLDisplayEglGetDisplay;
        if (eGLDisplayEglGetDisplay == EGL14.EGL_NO_DISPLAY) {
            throw new jgm("unable to get EGL14 display");
        }
        int[] iArr = new int[2];
        if (!EGL14.eglInitialize(this.e, iArr, 0, iArr, 1)) {
            this.e = null;
            throw new jgm("unable to initialize EGL14");
        }
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (!EGL14.eglChooseConfig(this.e, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12339, 1, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
            throw new jgm("unable to find RGB888+recordable ES2 EGL config");
        }
        int[] iArr2 = {12440, 2, 12344};
        this.f10672a = EGL14.eglCreateContext(this.e, eGLConfigArr[0], EGL14.EGL_NO_CONTEXT, iArr2, 0);
        b("eglCreateContext");
        if (this.f10672a == null) {
            throw new jgm("null context");
        }
        EGLConfig eGLConfigC = c(2);
        this.f10674c = EGL14.eglCreateContext(this.e, eGLConfigC, this.f10672a, iArr2, 0);
        b("eglCreateContext");
        if (this.f10674c == null) {
            throw new jgm("null context2");
        }
        this.i = EGL14.eglCreatePbufferSurface(this.e, eGLConfigArr[0], new int[]{12375, this.t, 12374, this.o, 12344}, 0);
        b("eglCreatePbufferSurface");
        if (this.i == null) {
            throw new jgm("surface was null");
        }
        this.h = EGL14.eglCreateWindowSurface(this.e, eGLConfigC, surface, new int[]{12344}, 0);
        b("eglCreateWindowSurface");
        if (this.h == null) {
            throw new jgm("surface was null");
        }
    }

    private void f() {
        EGLDisplay eGLDisplay = this.e;
        EGLSurface eGLSurface = this.i;
        if (!EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.f10672a)) {
            throw new jgm("in makeCurrent, eglMakeCurrent failed");
        }
    }

    private void e(int i) {
        if (i == 0) {
            EGLDisplay eGLDisplay = this.e;
            EGLSurface eGLSurface = this.i;
            if (!EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.f10672a)) {
                throw new jgm("eglMakeCurrent failed");
            }
            return;
        }
        EGLDisplay eGLDisplay2 = this.e;
        EGLSurface eGLSurface2 = this.h;
        if (!EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface2, eGLSurface2, this.f10674c)) {
            throw new jgm("eglMakeCurrent failed");
        }
    }

    private void h() {
        jgk jgkVar = new jgk(this.t, this.o);
        this.p = jgkVar;
        jgkVar.c();
        LogUtil.d("Track_RecorderEglRender", "textureID=", Integer.valueOf(this.p.a()));
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.p.a());
        this.s = surfaceTexture;
        surfaceTexture.setDefaultBufferSize(this.t, this.o);
        this.s.setOnFrameAvailableListener(this);
        this.k = new Surface(this.s);
    }

    private EGLConfig c(int i) {
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (!EGL14.eglChooseConfig(this.e, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, i >= 3 ? 68 : 4, 12344, 0, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
            LogUtil.j("Track_RecorderEglRender", "unable to find RGB8888 / ", Integer.valueOf(i), " EGLConfig");
            return null;
        }
        return eGLConfigArr[0];
    }

    private void b(String str) {
        int iEglGetError = EGL14.eglGetError();
        if (iEglGetError == 12288) {
            return;
        }
        throw new jgm(str + ": EGL error: 0x" + Integer.toHexString(iEglGetError));
    }

    private void c(long j) {
        EGLExt.eglPresentationTimeANDROID(this.e, this.h, j);
        b("eglPresentationTimeANDROID");
    }

    private void d() {
        if (this.l) {
            this.l = false;
            this.s.updateTexImage();
        }
    }

    private boolean g() {
        boolean zEglSwapBuffers = EGL14.eglSwapBuffers(this.e, this.h);
        b("eglSwapBuffers");
        return zEglSwapBuffers;
    }

    private long a(int i) {
        return (((long) i) * 1000000000) / ((long) this.j);
    }

    private void b() {
        this.p.e();
    }
}
