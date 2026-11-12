package za;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;
import androidx.media3.common.util.GlUtil;
import fa.z;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class b extends Surface {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f203167d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static boolean f203168e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f203169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HandlerThreadC3792b f203170b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f203171c;

    /* JADX INFO: renamed from: za.b$b, reason: collision with other inner class name */
    public static class HandlerThreadC3792b extends HandlerThread implements Handler.Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public androidx.media3.common.util.a f203172a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Handler f203173b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Error f203174c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public RuntimeException f203175d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public b f203176e;

        public HandlerThreadC3792b() {
            super("ExoPlayer:PlaceholderSurface");
        }

        public final void a(int i14) throws GlUtil.GlException {
            EGLSurface eGLSurfaceEglCreatePbufferSurface;
            this.f203172a.getClass();
            androidx.media3.common.util.a aVar = this.f203172a;
            int[] iArr = aVar.f8510b;
            EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
            GlUtil.c("eglGetDisplay failed", eGLDisplayEglGetDisplay != null);
            int[] iArr2 = new int[2];
            GlUtil.c("eglInitialize failed", EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr2, 0, iArr2, 1));
            aVar.f8511c = eGLDisplayEglGetDisplay;
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            int[] iArr3 = new int[1];
            boolean zEglChooseConfig = EGL14.eglChooseConfig(eGLDisplayEglGetDisplay, androidx.media3.common.util.a.f8508g, 0, eGLConfigArr, 0, 1, iArr3, 0);
            boolean z14 = zEglChooseConfig && iArr3[0] > 0 && eGLConfigArr[0] != null;
            Object[] objArr = {Boolean.valueOf(zEglChooseConfig), Integer.valueOf(iArr3[0]), eGLConfigArr[0]};
            int i15 = z.f70071a;
            GlUtil.c(String.format(Locale.US, "eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", objArr), z14);
            EGLConfig eGLConfig = eGLConfigArr[0];
            EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(aVar.f8511c, eGLConfig, EGL14.EGL_NO_CONTEXT, i14 == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
            GlUtil.c("eglCreateContext failed", eGLContextEglCreateContext != null);
            aVar.f8512d = eGLContextEglCreateContext;
            EGLDisplay eGLDisplay = aVar.f8511c;
            if (i14 == 1) {
                eGLSurfaceEglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
            } else {
                eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i14 == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
                GlUtil.c("eglCreatePbufferSurface failed", eGLSurfaceEglCreatePbufferSurface != null);
            }
            GlUtil.c("eglMakeCurrent failed", EGL14.eglMakeCurrent(eGLDisplay, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, eGLContextEglCreateContext));
            aVar.f8513e = eGLSurfaceEglCreatePbufferSurface;
            GLES20.glGenTextures(1, iArr, 0);
            GlUtil.b();
            SurfaceTexture surfaceTexture = new SurfaceTexture(iArr[0]);
            aVar.f8514f = surfaceTexture;
            surfaceTexture.setOnFrameAvailableListener(aVar);
            SurfaceTexture surfaceTexture2 = this.f203172a.f8514f;
            surfaceTexture2.getClass();
            this.f203176e = new b(this, surfaceTexture2, i14 != 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void b() {
            this.f203172a.getClass();
            androidx.media3.common.util.a aVar = this.f203172a;
            aVar.f8509a.removeCallbacks(aVar);
            try {
                SurfaceTexture surfaceTexture = aVar.f8514f;
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                    GLES20.glDeleteTextures(1, aVar.f8510b, 0);
                }
            } finally {
                EGLDisplay eGLDisplay = aVar.f8511c;
                if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                    EGLDisplay eGLDisplay2 = aVar.f8511c;
                    EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                    EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
                }
                EGLSurface eGLSurface2 = aVar.f8513e;
                if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                    EGL14.eglDestroySurface(aVar.f8511c, aVar.f8513e);
                }
                EGLContext eGLContext = aVar.f8512d;
                if (eGLContext != null) {
                    EGL14.eglDestroyContext(aVar.f8511c, eGLContext);
                }
                EGL14.eglReleaseThread();
                EGLDisplay eGLDisplay3 = aVar.f8511c;
                if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                    EGL14.eglTerminate(aVar.f8511c);
                }
                aVar.f8511c = null;
                aVar.f8512d = null;
                aVar.f8513e = null;
                aVar.f8514f = null;
            }
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i14 = message.what;
            try {
                if (i14 == 1) {
                    try {
                        a(message.arg1);
                        synchronized (this) {
                            notify();
                        }
                        return true;
                    } catch (GlUtil.GlException e4) {
                        fa.k.d("Failed to initialize placeholder surface", e4);
                        this.f203175d = new IllegalStateException(e4);
                        synchronized (this) {
                            notify();
                        }
                    } catch (Error e14) {
                        fa.k.d("Failed to initialize placeholder surface", e14);
                        this.f203174c = e14;
                        synchronized (this) {
                            notify();
                        }
                    } catch (RuntimeException e15) {
                        fa.k.d("Failed to initialize placeholder surface", e15);
                        this.f203175d = e15;
                        synchronized (this) {
                            notify();
                        }
                    }
                } else if (i14 == 2) {
                    try {
                        b();
                        quit();
                        return true;
                    } catch (Throwable th3) {
                        try {
                            fa.k.d("Failed to release placeholder surface", th3);
                            return true;
                        } finally {
                            quit();
                        }
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
    }

    private b(HandlerThreadC3792b handlerThreadC3792b, SurfaceTexture surfaceTexture, boolean z14) {
        super(surfaceTexture);
        this.f203170b = handlerThreadC3792b;
        this.f203169a = z14;
    }

    public static synchronized boolean b(Context context) {
        String strEglQueryString;
        int i14;
        try {
            if (!f203168e) {
                int i15 = z.f70071a;
                if (i15 >= 24 && ((i15 >= 26 || !("samsung".equals(z.f70073c) || "XT1650".equals(z.f70074d))) && ((i15 >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) && (strEglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && strEglQueryString.contains("EGL_EXT_protected_content")))) {
                    String strEglQueryString2 = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
                    i14 = strEglQueryString2 != null && strEglQueryString2.contains("EGL_KHR_surfaceless_context") ? 1 : 2;
                } else {
                    i14 = 0;
                }
                f203167d = i14;
                f203168e = true;
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return f203167d != 0;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.f203170b) {
            try {
                if (!this.f203171c) {
                    HandlerThreadC3792b handlerThreadC3792b = this.f203170b;
                    handlerThreadC3792b.f203173b.getClass();
                    handlerThreadC3792b.f203173b.sendEmptyMessage(2);
                    this.f203171c = true;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
