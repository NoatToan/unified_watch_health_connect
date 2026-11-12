package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.Surface;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.sport_capture.utils.SportStatusUtils;

/* JADX INFO: loaded from: classes10.dex */
public class nva {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public EGLDisplay f28472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public EGLConfig f28473b;
    public EGLContext c;
    public EGLSurface d;
    public int e;
    public hoa f;
    public h2o g;
    public int h;
    public goa i;
    public ol8 j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Context f28474k;
    public Handler l = new a(Looper.getMainLooper());

    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            nva.this.l.sendEmptyMessageDelayed(0, 1000L);
        }
    }

    public final boolean b(Bitmap bitmap) {
        return bitmap != null && !bitmap.isRecycled() && bitmap.getWidth() > 0 && bitmap.getHeight() > 0;
    }

    public final EGLConfig c(EGLDisplay eGLDisplay) {
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (EGL14.eglChooseConfig(eGLDisplay, new int[]{12320, 32, 12321, 8, 12324, 8, 12323, 8, 12322, 8, 12352, 4, 12339, 4, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
            return eGLConfigArr[0];
        }
        throw new RuntimeException("eglChooseConfig failed");
    }

    public EGLSurface d(Surface surface) {
        return EGL14.eglCreateWindowSurface(this.f28472a, this.f28473b, surface, new int[]{12344}, 0);
    }

    public final EGLContext e(EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
        return EGL14.eglCreateContext(eGLDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
    }

    public EGLSurface f() {
        return this.d;
    }

    public int g() {
        if (this.e == -1) {
            int[] iArr = new int[1];
            GLES20.glGenTextures(1, iArr, 0);
            this.e = iArr[0];
        }
        return this.e;
    }

    public void h(Context context, SurfaceTexture surfaceTexture, int i, int i2) {
        this.f28474k = context;
        i(surfaceTexture);
        j(context, i, i2);
        this.l.sendEmptyMessage(0);
    }

    public final void i(SurfaceTexture surfaceTexture) {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        this.f28472a = eGLDisplayEglGetDisplay;
        if (eGLDisplayEglGetDisplay == EGL14.EGL_NO_DISPLAY) {
            throw new RuntimeException("can't get eglGetDisplay");
        }
        if (!EGL14.eglInitialize(eGLDisplayEglGetDisplay, null, 0, null, 0)) {
            throw new RuntimeException("eglInitialize failed");
        }
        EGLConfig eGLConfigC = c(this.f28472a);
        this.f28473b = eGLConfigC;
        EGLContext eGLContextE = e(this.f28472a, eGLConfigC);
        this.c = eGLContextE;
        if (eGLContextE == EGL14.EGL_NO_CONTEXT) {
            throw new RuntimeException("eglCreateContext failed");
        }
        EGLSurface eGLSurfaceD = d(new Surface(surfaceTexture));
        this.d = eGLSurfaceD;
        k(eGLSurfaceD);
    }

    public final void j(Context context, int i, int i2) {
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        GLES20.glViewport(0, 0, i, i2);
        this.f = new hoa();
        this.g = new h2o();
        this.j = new ol8();
        this.f.d(new ioa());
        this.j.d(new i2o());
        this.g.d(new i2o());
        goa goaVar = new goa();
        this.i = goaVar;
        goaVar.g(i, i2);
    }

    public void k(EGLSurface eGLSurface) {
        EGL14.eglMakeCurrent(this.f28472a, eGLSurface, eGLSurface, this.c);
    }

    public void l(float[] fArr, EGLSurface eGLSurface, int i, int i2, boolean z, boolean z2) {
        try {
            k(eGLSurface);
            this.i.a();
            GLES20.glClear(16640);
            GLES20.glEnable(3042);
            GLES20.glBlendFunc(1, 771);
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
            GLES20.glViewport(0, 0, i, i2);
            if (z) {
                this.f.b(this.e, fArr, null);
            } else if (z2) {
                this.f.b(this.e, fArr, SportStatusUtils.getFlipFoldedRecordSurfaceMatrix());
            } else {
                this.f.b(this.e, fArr, SportStatusUtils.getRecordSurfaceMatrix());
            }
            Bitmap bitmapProvideLastRotateSportStatusBitmap = z ? SportStatusUtils.provideLastRotateSportStatusBitmap() : SportStatusUtils.provideLastSportStatusBitmap();
            if (b(bitmapProvideLastRotateSportStatusBitmap)) {
                GLES20.glViewport(0, 0, i, i2);
                GLES20.glDeleteTextures(1, new int[]{this.h}, 0);
                int iA = v8p.a(bitmapProvideLastRotateSportStatusBitmap, false);
                this.h = iA;
                this.g.b(iA);
            } else {
                Logger.d("GLSportStatusRender", "texBitmap is not valid");
            }
            this.i.c();
            GLES20.glViewport(0, 0, i, i2);
            this.j.b(this.i.d());
            EGL14.eglSwapBuffers(this.f28472a, eGLSurface);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void m(int i, int i2) {
        this.i.e(i, i2);
    }
}
