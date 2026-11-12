package r0;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.util.Size;
import android.view.Surface;
import androidx.room.a0;
import b0.b0;
import com.google.firebase.crashlytics.internal.common.IdManager;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public class j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Thread f148728c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public EGLConfig f148732g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Surface f148734i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f148726a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f148727b = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public EGLDisplay f148729d = EGL14.EGL_NO_DISPLAY;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public EGLContext f148730e = EGL14.EGL_NO_CONTEXT;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int[] f148731f = t0.d.f161627a;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public EGLSurface f148733h = EGL14.EGL_NO_SURFACE;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Map<t0.d.e, t0.d.f> f148735j = Collections.EMPTY_MAP;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public t0.d.f f148736k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public t0.d.e f148737l = t0.d.e.UNKNOWN;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f148738m = -1;

    public final void a(b0 b0Var, t0.a.b bVar) {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        this.f148729d = eGLDisplayEglGetDisplay;
        if (Objects.equals(eGLDisplayEglGetDisplay, EGL14.EGL_NO_DISPLAY)) {
            vb.h.z("Unable to get EGL14 display");
            return;
        }
        int[] iArr = new int[2];
        if (!EGL14.eglInitialize(this.f148729d, iArr, 0, iArr, 1)) {
            this.f148729d = EGL14.EGL_NO_DISPLAY;
            vb.h.z("Unable to initialize EGL14");
            return;
        }
        if (bVar != null) {
            bVar.f161613b = iArr[0] + "." + iArr[1];
        }
        int i14 = b0Var.a() ? 10 : 8;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (!EGL14.eglChooseConfig(this.f148729d, new int[]{12324, i14, 12323, i14, 12322, i14, 12321, b0Var.a() ? 2 : 8, 12325, 0, 12326, 0, 12352, b0Var.a() ? 64 : 4, 12610, b0Var.a() ? -1 : 1, 12339, 5, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
            vb.h.z("Unable to find a suitable EGLConfig");
            return;
        }
        EGLConfig eGLConfig = eGLConfigArr[0];
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(this.f148729d, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, b0Var.a() ? 3 : 2, 12344}, 0);
        t0.d.a("eglCreateContext");
        this.f148732g = eGLConfig;
        this.f148730e = eGLContextEglCreateContext;
        EGL14.eglQueryContext(this.f148729d, eGLContextEglCreateContext, 12440, new int[1], 0);
    }

    public final t0.c b(Surface surface) {
        try {
            EGLDisplay eGLDisplay = this.f148729d;
            EGLConfig eGLConfig = this.f148732g;
            Objects.requireNonNull(eGLConfig);
            EGLSurface eGLSurfaceH = t0.d.h(eGLDisplay, eGLConfig, surface, this.f148731f);
            EGLDisplay eGLDisplay2 = this.f148729d;
            int[] iArr = new int[1];
            EGL14.eglQuerySurface(eGLDisplay2, eGLSurfaceH, 12375, iArr, 0);
            int i14 = iArr[0];
            int[] iArr2 = new int[1];
            EGL14.eglQuerySurface(eGLDisplay2, eGLSurfaceH, 12374, iArr2, 0);
            Size size = new Size(i14, iArr2[0]);
            return new t0.c(eGLSurfaceH, size.getWidth(), size.getHeight());
        } catch (IllegalArgumentException | IllegalStateException e4) {
            e4.getMessage();
            return null;
        }
    }

    public final void c() {
        EGLDisplay eGLDisplay = this.f148729d;
        EGLConfig eGLConfig = this.f148732g;
        Objects.requireNonNull(eGLConfig);
        int[] iArr = t0.d.f161627a;
        EGLSurface eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, new int[]{12375, 1, 12374, 1, 12344}, 0);
        t0.d.a("eglCreatePbufferSurface");
        if (eGLSurfaceEglCreatePbufferSurface != null) {
            this.f148733h = eGLSurfaceEglCreatePbufferSurface;
        } else {
            vb.h.z("surface was null");
        }
    }

    public final k7.d<String, String> d(b0 b0Var) {
        t0.d.d(false, this.f148726a);
        try {
            a(b0Var, null);
            c();
            f(this.f148733h);
            String strGlGetString = GLES20.glGetString(7939);
            String strEglQueryString = EGL14.eglQueryString(this.f148729d, 12373);
            if (strGlGetString == null) {
                strGlGetString = "";
            }
            if (strEglQueryString == null) {
                strEglQueryString = "";
            }
            return new k7.d<>(strGlGetString, strEglQueryString);
        } catch (IllegalStateException e4) {
            e4.getMessage();
            return new k7.d<>("", "");
        } finally {
            h();
        }
    }

    public t0.a e(b0 b0Var, Map map) throws Throwable {
        AtomicBoolean atomicBoolean = this.f148726a;
        t0.d.d(false, atomicBoolean);
        t0.a.b bVar = new t0.a.b();
        bVar.f161612a = IdManager.DEFAULT_VERSION_NAME;
        bVar.f161613b = IdManager.DEFAULT_VERSION_NAME;
        bVar.f161614c = "";
        bVar.f161615d = "";
        try {
            if (b0Var.a()) {
                k7.d<String, String> dVarD = d(b0Var);
                String str = dVarD.f103262a;
                str.getClass();
                String str2 = dVarD.f103263b;
                str2.getClass();
                if (!str.contains("GL_EXT_YUV_target")) {
                    b0Var = b0.f13854d;
                }
                int[] iArr = t0.d.f161627a;
                if (b0Var.f13860a == 3 && str2.contains("EGL_EXT_gl_colorspace_bt2020_hlg")) {
                    iArr = t0.d.f161628b;
                }
                this.f148731f = iArr;
                bVar.f161614c = str;
                bVar.f161615d = str2;
            }
            a(b0Var, bVar);
            c();
            f(this.f148733h);
            bVar.f161612a = t0.d.i();
            this.f148735j = t0.d.f(b0Var, map);
            int iG = t0.d.g();
            this.f148738m = iG;
            k(iG);
            this.f148728c = Thread.currentThread();
            atomicBoolean.set(true);
            String strConcat = bVar.f161612a == null ? " glVersion" : "";
            if (bVar.f161613b == null) {
                strConcat = strConcat.concat(" eglVersion");
            }
            if (bVar.f161614c == null) {
                strConcat = strConcat.concat(" glExtensions");
            }
            if (bVar.f161615d == null) {
                strConcat = strConcat.concat(" eglExtensions");
            }
            if (strConcat.isEmpty()) {
                return new t0.a(bVar.f161612a, bVar.f161613b, bVar.f161614c, bVar.f161615d);
            }
            vb.h.z("Missing required properties:".concat(strConcat));
            return null;
        } catch (IllegalArgumentException e4) {
            e = e4;
            Throwable th3 = e;
            h();
            throw th3;
        } catch (IllegalStateException e14) {
            e = e14;
            Throwable th4 = e;
            h();
            throw th4;
        }
    }

    public final void f(EGLSurface eGLSurface) {
        this.f148729d.getClass();
        this.f148730e.getClass();
        if (EGL14.eglMakeCurrent(this.f148729d, eGLSurface, eGLSurface, this.f148730e)) {
            return;
        }
        vb.h.z("eglMakeCurrent failed");
    }

    public final void g(Surface surface) {
        t0.d.d(true, this.f148726a);
        t0.d.c(this.f148728c);
        HashMap map = this.f148727b;
        if (map.containsKey(surface)) {
            return;
        }
        map.put(surface, t0.d.f161636j);
    }

    public final void h() {
        Iterator<t0.d.f> it = this.f148735j.values().iterator();
        while (it.hasNext()) {
            GLES20.glDeleteProgram(it.next().f161641a);
        }
        this.f148735j = Collections.EMPTY_MAP;
        this.f148736k = null;
        if (!Objects.equals(this.f148729d, EGL14.EGL_NO_DISPLAY)) {
            EGLDisplay eGLDisplay = this.f148729d;
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            HashMap map = this.f148727b;
            for (t0.g gVar : map.values()) {
                if (!Objects.equals(gVar.a(), EGL14.EGL_NO_SURFACE) && !EGL14.eglDestroySurface(this.f148729d, gVar.a())) {
                    try {
                        t0.d.a("eglDestroySurface");
                    } catch (IllegalStateException e4) {
                        e4.toString();
                    }
                }
            }
            map.clear();
            if (!Objects.equals(this.f148733h, EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f148729d, this.f148733h);
                this.f148733h = EGL14.EGL_NO_SURFACE;
            }
            if (!Objects.equals(this.f148730e, EGL14.EGL_NO_CONTEXT)) {
                EGL14.eglDestroyContext(this.f148729d, this.f148730e);
                this.f148730e = EGL14.EGL_NO_CONTEXT;
            }
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.f148729d);
            this.f148729d = EGL14.EGL_NO_DISPLAY;
        }
        this.f148732g = null;
        this.f148738m = -1;
        this.f148737l = t0.d.e.UNKNOWN;
        this.f148734i = null;
        this.f148728c = null;
    }

    public final void i(Surface surface, boolean z14) {
        if (this.f148734i == surface) {
            this.f148734i = null;
            f(this.f148733h);
        }
        HashMap map = this.f148727b;
        t0.g gVar = z14 ? (t0.g) map.remove(surface) : (t0.g) map.put(surface, t0.d.f161636j);
        if (gVar == null || gVar == t0.d.f161636j) {
            return;
        }
        try {
            EGL14.eglDestroySurface(this.f148729d, gVar.a());
        } catch (RuntimeException e4) {
            e4.getMessage();
        }
    }

    public final void j(long j8, float[] fArr, Surface surface) {
        t0.d.d(true, this.f148726a);
        t0.d.c(this.f148728c);
        HashMap map = this.f148727b;
        k7.h.f(map.containsKey(surface), "The surface is not registered.");
        t0.g gVarB = (t0.g) map.get(surface);
        Objects.requireNonNull(gVarB);
        if (gVarB == t0.d.f161636j) {
            gVarB = b(surface);
            if (gVarB == null) {
                return;
            } else {
                map.put(surface, gVarB);
            }
        }
        if (surface != this.f148734i) {
            f(gVarB.a());
            this.f148734i = surface;
            GLES20.glViewport(0, 0, gVarB.c(), gVarB.b());
            GLES20.glScissor(0, 0, gVarB.c(), gVarB.b());
        }
        t0.d.f fVar = this.f148736k;
        fVar.getClass();
        if (fVar instanceof t0.d.g) {
            GLES20.glUniformMatrix4fv(((t0.d.g) fVar).f161646f, 1, false, fArr, 0);
            t0.d.b("glUniformMatrix4fv");
        }
        GLES20.glDrawArrays(5, 0, 4);
        t0.d.b("glDrawArrays");
        EGLExt.eglPresentationTimeANDROID(this.f148729d, gVarB.a(), j8);
        if (EGL14.eglSwapBuffers(this.f148729d, gVarB.a())) {
            return;
        }
        Integer.toHexString(EGL14.eglGetError());
        i(surface, false);
    }

    public final void k(int i14) {
        t0.d.f fVar = this.f148735j.get(this.f148737l);
        if (fVar == null) {
            a0.s(this.f148737l, "Unable to configure program for input format: ");
            return;
        }
        if (this.f148736k != fVar) {
            this.f148736k = fVar;
            fVar.b();
            Objects.toString(this.f148737l);
            Objects.toString(this.f148736k);
        }
        GLES20.glActiveTexture(33984);
        t0.d.b("glActiveTexture");
        GLES20.glBindTexture(36197, i14);
        t0.d.b("glBindTexture");
    }
}
