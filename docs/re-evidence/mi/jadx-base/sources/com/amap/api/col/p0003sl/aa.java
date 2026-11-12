package com.amap.api.col.p0003sl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.GLDebugHelper;
import android.opengl.GLSurfaceView;
import android.view.TextureView;
import com.amap.api.maps.MapsInitializer;
import com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeProgressBar;
import java.io.Writer;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL;
import javax.microedition.khronos.opengles.GL10;

/* JADX INFO: loaded from: classes4.dex */
@SuppressLint({"NewApi"})
public class aa extends TextureView implements TextureView.SurfaceTextureListener {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final j f5952k = new j(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference<aa> f5953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public i f5954b;
    public GLSurfaceView.Renderer c;
    public boolean d;
    public e e;
    public f f;
    public g g;
    public int h;
    public int i;
    public boolean j;

    public abstract class a implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int[] f5955a;

        public a(int[] iArr) {
            this.f5955a = b(iArr);
        }

        public abstract EGLConfig a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig[] eGLConfigArr);

        public final int[] b(int[] iArr) {
            if (aa.this.i != 2 && aa.this.i != 3) {
                return iArr;
            }
            int length = iArr.length;
            int[] iArr2 = new int[length + 2];
            int i = length - 1;
            System.arraycopy(iArr, 0, iArr2, 0, i);
            iArr2[i] = 12352;
            if (aa.this.i == 2) {
                iArr2[length] = 4;
            } else {
                iArr2[length] = 64;
            }
            iArr2[length + 1] = 12344;
            return iArr2;
        }

        @Override // com.amap.api.col.3sl.aa.e
        public EGLConfig chooseConfig(EGL10 egl10, EGLDisplay eGLDisplay) {
            int[] iArr = new int[1];
            if (!egl10.eglChooseConfig(eGLDisplay, this.f5955a, null, 0, iArr)) {
                throw new IllegalArgumentException("eglChooseConfig failed");
            }
            int i = iArr[0];
            if (i <= 0) {
                throw new IllegalArgumentException("No configs match configSpec");
            }
            EGLConfig[] eGLConfigArr = new EGLConfig[i];
            if (!egl10.eglChooseConfig(eGLDisplay, this.f5955a, eGLConfigArr, i, iArr)) {
                throw new IllegalArgumentException("eglChooseConfig#2 failed");
            }
            EGLConfig eGLConfigA = a(egl10, eGLDisplay, eGLConfigArr);
            if (eGLConfigA != null) {
                return eGLConfigA;
            }
            throw new IllegalArgumentException("No config chosen");
        }
    }

    public class b extends a {
        public int[] c;
        public int d;
        public int e;
        public int f;
        public int g;
        public int h;
        public int i;

        public b() {
            super(new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 0, 12325, 16, 12326, 0, 12344});
            this.c = new int[1];
            this.d = 8;
            this.e = 8;
            this.f = 8;
            this.g = 0;
            this.h = 16;
            this.i = 0;
        }

        @Override // com.amap.api.col.3sl.aa.a
        public final EGLConfig a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig[] eGLConfigArr) {
            for (EGLConfig eGLConfig : eGLConfigArr) {
                int iC = c(egl10, eGLDisplay, eGLConfig, 12325);
                int iC2 = c(egl10, eGLDisplay, eGLConfig, 12326);
                if (iC >= this.h && iC2 >= this.i) {
                    int iC3 = c(egl10, eGLDisplay, eGLConfig, 12324);
                    int iC4 = c(egl10, eGLDisplay, eGLConfig, 12323);
                    int iC5 = c(egl10, eGLDisplay, eGLConfig, 12322);
                    int iC6 = c(egl10, eGLDisplay, eGLConfig, 12321);
                    if (iC3 == this.d && iC4 == this.e && iC5 == this.f && iC6 == this.g) {
                        return eGLConfig;
                    }
                }
            }
            return null;
        }

        public final int c(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i) {
            if (egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, i, this.c)) {
                return this.c[0];
            }
            return 0;
        }
    }

    public class c implements f {
        public c() {
        }

        @Override // com.amap.api.col.3sl.aa.f
        public final EGLContext createContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
            int[] iArr = {12440, aa.this.i, 12344};
            EGLContext eGLContext = EGL10.EGL_NO_CONTEXT;
            if (aa.this.i == 0) {
                iArr = null;
            }
            return egl10.eglCreateContext(eGLDisplay, eGLConfig, eGLContext, iArr);
        }

        @Override // com.amap.api.col.3sl.aa.f
        public final void destroyContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLContext eGLContext) {
            if (egl10.eglDestroyContext(eGLDisplay, eGLContext)) {
                return;
            }
            StringBuilder sb = new StringBuilder("display:");
            sb.append(eGLDisplay);
            sb.append(" context: ");
            sb.append(eGLContext);
            h.c("eglDestroyContex", egl10.eglGetError());
        }

        public /* synthetic */ c(aa aaVar, byte b2) {
            this();
        }
    }

    public static class d implements g {
        public d() {
        }

        public /* synthetic */ d(byte b2) {
            this();
        }

        @Override // com.amap.api.col.3sl.aa.g
        public final EGLSurface a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, Object obj) {
            try {
                return egl10.eglCreateWindowSurface(eGLDisplay, eGLConfig, obj, null);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        @Override // com.amap.api.col.3sl.aa.g
        public final void b(EGL10 egl10, EGLDisplay eGLDisplay, EGLSurface eGLSurface) {
            egl10.eglDestroySurface(eGLDisplay, eGLSurface);
        }
    }

    public interface e {
        EGLConfig chooseConfig(EGL10 egl10, EGLDisplay eGLDisplay);
    }

    public interface f {
        EGLContext createContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig);

        void destroyContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLContext eGLContext);
    }

    public interface g {
        EGLSurface a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, Object obj);

        void b(EGL10 egl10, EGLDisplay eGLDisplay, EGLSurface eGLSurface);
    }

    public static class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public WeakReference<aa> f5958a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public EGL10 f5959b;
        public EGLDisplay c;
        public EGLSurface d;
        public EGLConfig e;
        public EGLContext f;

        public h(WeakReference<aa> weakReference) {
            this.f5958a = weakReference;
        }

        public static void c(String str, int i) {
            throw new RuntimeException(e(str, i));
        }

        public static void d(String str, String str2, int i) {
            e(str2, i);
        }

        public static String e(String str, int i) {
            return str + " failed: " + i;
        }

        public final void a() {
            EGL10 egl10 = (EGL10) EGLContext.getEGL();
            this.f5959b = egl10;
            EGLDisplay eGLDisplayEglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            this.c = eGLDisplayEglGetDisplay;
            if (eGLDisplayEglGetDisplay == EGL10.EGL_NO_DISPLAY) {
                throw new RuntimeException("eglGetDisplay failed");
            }
            if (!this.f5959b.eglInitialize(eGLDisplayEglGetDisplay, new int[2])) {
                throw new RuntimeException("eglInitialize failed");
            }
            aa aaVar = this.f5958a.get();
            if (aaVar == null) {
                this.e = null;
                this.f = null;
            } else {
                this.e = aaVar.e.chooseConfig(this.f5959b, this.c);
                this.f = aaVar.f.createContext(this.f5959b, this.c, this.e);
            }
            EGLContext eGLContext = this.f;
            if (eGLContext == null || eGLContext == EGL10.EGL_NO_CONTEXT) {
                this.f = null;
                b("createContext");
            }
            this.d = null;
        }

        public final void b(String str) {
            c(str, this.f5959b.eglGetError());
        }

        public final boolean f() {
            if (this.f5959b == null) {
                throw new RuntimeException("egl not initialized");
            }
            if (this.c == null) {
                throw new RuntimeException("eglDisplay not initialized");
            }
            if (this.e == null) {
                throw new RuntimeException("mEglConfig not initialized");
            }
            k();
            aa aaVar = this.f5958a.get();
            if (aaVar != null) {
                this.d = aaVar.g.a(this.f5959b, this.c, this.e, aaVar.getSurfaceTexture());
            } else {
                this.d = null;
            }
            EGLSurface eGLSurface = this.d;
            if (eGLSurface == null || eGLSurface == EGL10.EGL_NO_SURFACE) {
                this.f5959b.eglGetError();
                return false;
            }
            if (this.f5959b.eglMakeCurrent(this.c, eGLSurface, eGLSurface, this.f)) {
                return true;
            }
            d("EGLHelper", "eglMakeCurrent", this.f5959b.eglGetError());
            return false;
        }

        public final GL g() {
            GL gl = this.f.getGL();
            aa aaVar = this.f5958a.get();
            if (aaVar == null) {
                return gl;
            }
            aa.k(aaVar);
            if ((aaVar.h & 3) != 0) {
                return GLDebugHelper.wrap(gl, (aaVar.h & 1) == 0 ? 0 : 1, (aaVar.h & 2) != 0 ? new l() : null);
            }
            return gl;
        }

        public final int h() {
            if (this.f5959b.eglSwapBuffers(this.c, this.d)) {
                return 12288;
            }
            return this.f5959b.eglGetError();
        }

        public final void i() {
            k();
        }

        public final void j() {
            if (this.f != null) {
                aa aaVar = this.f5958a.get();
                if (aaVar != null) {
                    aaVar.f.destroyContext(this.f5959b, this.c, this.f);
                }
                this.f = null;
            }
            EGLDisplay eGLDisplay = this.c;
            if (eGLDisplay != null) {
                this.f5959b.eglTerminate(eGLDisplay);
                this.c = null;
            }
        }

        public final void k() {
            EGLSurface eGLSurface;
            EGLSurface eGLSurface2 = this.d;
            if (eGLSurface2 == null || eGLSurface2 == (eGLSurface = EGL10.EGL_NO_SURFACE)) {
                return;
            }
            this.f5959b.eglMakeCurrent(this.c, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            aa aaVar = this.f5958a.get();
            if (aaVar != null) {
                aaVar.g.b(this.f5959b, this.c, this.d);
            }
            this.d = null;
        }
    }

    public static class i extends Thread {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f5960a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f5961b;
        public boolean c;
        public boolean d;
        public boolean e;
        public boolean f;
        public boolean g;
        public boolean h;
        public boolean i;
        public boolean j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f5962k;
        public boolean p;
        public h s;
        public WeakReference<aa> t;
        public ArrayList<Runnable> q = new ArrayList<>();

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public boolean f5963r = true;
        public int l = 0;
        public int m = 0;
        public boolean o = true;
        public int n = 1;

        public i(WeakReference<aa> weakReference) {
            this.t = weakReference;
        }

        public static /* synthetic */ boolean e(i iVar) {
            iVar.f5961b = true;
            return true;
        }

        public final int a() {
            int i;
            synchronized (aa.f5952k) {
                i = this.n;
            }
            return i;
        }

        public final void b(int i) {
            if (i < 0 || i > 1) {
                throw new IllegalArgumentException("renderMode");
            }
            synchronized (aa.f5952k) {
                this.n = i;
                aa.f5952k.notifyAll();
            }
        }

        public final void c(int i, int i2) {
            synchronized (aa.f5952k) {
                this.l = i;
                this.m = i2;
                this.f5963r = true;
                this.o = true;
                this.p = false;
                aa.f5952k.notifyAll();
                while (!this.f5961b && !this.d && !this.p && r()) {
                    try {
                        aa.f5952k.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        public final void d(Runnable runnable) {
            if (runnable == null) {
                throw new IllegalArgumentException("r must not be null");
            }
            synchronized (aa.f5952k) {
                this.q.add(runnable);
                aa.f5952k.notifyAll();
            }
        }

        public final void f() {
            synchronized (aa.f5952k) {
                this.o = true;
                aa.f5952k.notifyAll();
            }
        }

        public final void g() {
            synchronized (aa.f5952k) {
                this.e = true;
                this.j = false;
                aa.f5952k.notifyAll();
                while (this.g && !this.j && !this.f5961b) {
                    try {
                        aa.f5952k.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        public final void h() {
            synchronized (aa.f5952k) {
                try {
                    this.e = false;
                    aa.f5952k.notifyAll();
                    while (!this.g && !this.f5961b) {
                        try {
                            if (MapsInitializer.getTextureViewDestorySync()) {
                                aa.f5952k.wait();
                            } else {
                                aa.f5952k.wait(VibrateModeProgressBar.sLongToLong);
                            }
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final void i() {
            synchronized (aa.f5952k) {
                try {
                    this.c = true;
                    aa.f5952k.notifyAll();
                    while (!this.f5961b && !this.d) {
                        try {
                            if (MapsInitializer.getTextureViewDestorySync()) {
                                aa.f5952k.wait();
                            } else {
                                aa.f5952k.wait(VibrateModeProgressBar.sLongToLong);
                            }
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final void j() {
            synchronized (aa.f5952k) {
                this.c = false;
                this.o = true;
                this.p = false;
                aa.f5952k.notifyAll();
                while (!this.f5961b && this.d && !this.p) {
                    try {
                        aa.f5952k.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        public final void k() {
            synchronized (aa.f5952k) {
                this.f5960a = true;
                aa.f5952k.notifyAll();
                while (!this.f5961b) {
                    try {
                        aa.f5952k.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        public final void l() {
            this.f5962k = true;
            aa.f5952k.notifyAll();
        }

        public final int m() {
            int i;
            synchronized (aa.f5952k) {
                i = this.l;
            }
            return i;
        }

        public final int n() {
            int i;
            synchronized (aa.f5952k) {
                i = this.m;
            }
            return i;
        }

        public final void o() {
            if (this.i) {
                this.i = false;
                this.s.i();
            }
        }

        public final void p() {
            if (this.h) {
                this.s.j();
                this.h = false;
                aa.f5952k.g(this);
            }
        }

        /* JADX WARN: Code duplicated, block: B:169:0x0222 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        public final void q() throws InterruptedException {
            boolean z;
            boolean z2;
            aa aaVar;
            this.s = new h(this.t);
            this.h = false;
            this.i = false;
            boolean z3 = false;
            boolean z4 = false;
            boolean z5 = false;
            boolean z6 = false;
            boolean z7 = false;
            boolean z8 = false;
            boolean z9 = false;
            int i = 0;
            int i2 = 0;
            boolean z10 = false;
            GL10 gl10 = null;
            while (true) {
                Runnable runnableRemove = null;
                while (true) {
                    try {
                        synchronized (aa.f5952k) {
                            while (true) {
                                if (this.f5960a) {
                                    synchronized (aa.f5952k) {
                                        o();
                                        p();
                                    }
                                    return;
                                }
                                if (!this.q.isEmpty()) {
                                    runnableRemove = this.q.remove(0);
                                    z = false;
                                    break;
                                }
                                boolean z11 = this.d;
                                boolean z12 = this.c;
                                if (z11 != z12) {
                                    this.d = z12;
                                    aa.f5952k.notifyAll();
                                } else {
                                    z12 = false;
                                }
                                if (this.f5962k) {
                                    o();
                                    p();
                                    this.f5962k = false;
                                    z5 = true;
                                }
                                if (z3) {
                                    o();
                                    p();
                                    z3 = false;
                                }
                                if (z12 && this.i) {
                                    o();
                                }
                                if (z12 && this.h && ((aaVar = this.t.get()) == null || !aaVar.j || aa.f5952k.c())) {
                                    p();
                                }
                                if (z12 && aa.f5952k.d()) {
                                    this.s.j();
                                }
                                if (!this.e && !this.g) {
                                    if (this.i) {
                                        o();
                                    }
                                    this.g = true;
                                    this.f = false;
                                    aa.f5952k.notifyAll();
                                }
                                if (this.e && this.g) {
                                    this.g = false;
                                    aa.f5952k.notifyAll();
                                }
                                if (z4) {
                                    this.p = true;
                                    aa.f5952k.notifyAll();
                                    z4 = false;
                                    z10 = false;
                                }
                                if (s()) {
                                    if (!this.h) {
                                        if (z5) {
                                            z5 = false;
                                        } else if (aa.f5952k.e(this)) {
                                            try {
                                                this.s.a();
                                                this.h = true;
                                                aa.f5952k.notifyAll();
                                                z6 = true;
                                            } catch (RuntimeException e) {
                                                aa.f5952k.g(this);
                                                throw e;
                                            }
                                        }
                                    }
                                    if (this.h && !this.i) {
                                        this.i = true;
                                        z7 = true;
                                        z8 = true;
                                        z9 = true;
                                    }
                                    if (this.i) {
                                        if (this.f5963r) {
                                            i = this.l;
                                            i2 = this.m;
                                            z = false;
                                            this.f5963r = false;
                                            z7 = true;
                                            z9 = true;
                                            z10 = true;
                                        } else {
                                            z = false;
                                        }
                                        this.o = z;
                                        aa.f5952k.notifyAll();
                                        break;
                                    }
                                }
                                aa.f5952k.wait();
                            }
                        }
                        if (runnableRemove != null) {
                            break;
                        }
                        if (z7) {
                            if (this.s.f()) {
                                synchronized (aa.f5952k) {
                                    this.j = true;
                                    aa.f5952k.notifyAll();
                                }
                                z7 = z;
                            } else {
                                synchronized (aa.f5952k) {
                                    this.j = true;
                                    this.f = true;
                                    aa.f5952k.notifyAll();
                                }
                            }
                            synchronized (aa.f5952k) {
                                o();
                                p();
                                throw th;
                            }
                        }
                        if (z8) {
                            GL10 gl11 = (GL10) this.s.g();
                            aa.f5952k.b(gl11);
                            z8 = z;
                            gl10 = gl11;
                        }
                        if (z6) {
                            aa aaVar2 = this.t.get();
                            if (aaVar2 != null) {
                                aaVar2.c.onSurfaceCreated(gl10, this.s.e);
                            }
                            z6 = z;
                        }
                        if (z9) {
                            aa aaVar3 = this.t.get();
                            if (aaVar3 != null) {
                                aaVar3.c.onSurfaceChanged(gl10, i, i2);
                            }
                            z9 = z;
                        }
                        aa aaVar4 = this.t.get();
                        if (aaVar4 != null) {
                            aaVar4.c.onDrawFrame(gl10);
                        }
                        int iH = this.s.h();
                        if (iH == 12288) {
                            z2 = true;
                        } else if (iH != 12302) {
                            h.d("GLThread", "eglSwapBuffers", iH);
                            synchronized (aa.f5952k) {
                                z2 = true;
                                this.f = true;
                                aa.f5952k.notifyAll();
                            }
                        } else {
                            z2 = true;
                            z3 = true;
                        }
                        if (z10) {
                            z4 = z2;
                        }
                    } catch (Throwable th) {
                        synchronized (aa.f5952k) {
                            o();
                            p();
                            throw th;
                        }
                    }
                }
                runnableRemove.run();
            }
        }

        public final boolean r() {
            return this.h && this.i && s();
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            setName("GLThread " + getId());
            try {
                q();
            } catch (InterruptedException unused) {
            } finally {
                aa.f5952k.a(this);
            }
        }

        public final boolean s() {
            if (this.d || !this.e || this.f || this.l <= 0 || this.m <= 0) {
                return false;
            }
            return this.o || this.n == 1;
        }
    }

    public static class j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f5964a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f5965b;
        public boolean c;
        public boolean d;
        public boolean e;
        public i f;

        public j() {
        }

        public /* synthetic */ j(byte b2) {
            this();
        }

        public final synchronized void a(i iVar) {
            try {
                i.e(iVar);
                if (this.f == iVar) {
                    this.f = null;
                }
                notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }

        public final synchronized void b(GL10 gl10) {
            try {
                if (!this.c && gl10 != null) {
                    f();
                    String strGlGetString = gl10.glGetString(7937);
                    if (this.f5965b < 131072) {
                        this.d = !strGlGetString.startsWith("Q3Dimension MSM7500 ");
                        notifyAll();
                    }
                    this.e = !this.d;
                    this.c = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }

        public final synchronized boolean c() {
            return this.e;
        }

        public final synchronized boolean d() {
            f();
            return !this.d;
        }

        public final boolean e(i iVar) {
            i iVar2 = this.f;
            if (iVar2 == iVar || iVar2 == null) {
                this.f = iVar;
                notifyAll();
                return true;
            }
            f();
            if (this.d) {
                return true;
            }
            i iVar3 = this.f;
            if (iVar3 == null) {
                return false;
            }
            iVar3.l();
            return false;
        }

        public final void f() {
            if (this.f5964a) {
                return;
            }
            this.f5965b = 131072;
            this.d = true;
            this.f5964a = true;
        }

        public final void g(i iVar) {
            if (this.f == iVar) {
                this.f = null;
            }
            notifyAll();
        }
    }

    public interface k {
    }

    public static class l extends Writer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public StringBuilder f5966a = new StringBuilder();

        public final void a() {
            if (this.f5966a.length() > 0) {
                this.f5966a.toString();
                StringBuilder sb = this.f5966a;
                sb.delete(0, sb.length());
            }
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            a();
        }

        @Override // java.io.Writer, java.io.Flushable
        public final void flush() {
            a();
        }

        @Override // java.io.Writer
        public final void write(char[] cArr, int i, int i2) {
            for (int i3 = 0; i3 < i2; i3++) {
                char c = cArr[i + i3];
                if (c == '\n') {
                    a();
                } else {
                    this.f5966a.append(c);
                }
            }
        }
    }

    public class m extends b {
        public m() {
            super();
        }
    }

    public aa(Context context) {
        super(context, null);
        this.f5953a = new WeakReference<>(this);
        b();
    }

    public static /* synthetic */ k k(aa aaVar) {
        aaVar.getClass();
        return null;
    }

    public static boolean n() {
        return false;
    }

    public final void b() {
        setSurfaceTextureListener(this);
    }

    public final void c(e eVar) {
        l();
        this.e = eVar;
    }

    public final void d(f fVar) {
        l();
        this.f = fVar;
    }

    public void f() {
        this.f5954b.i();
    }

    public void finalize() throws Throwable {
        try {
            i iVar = this.f5954b;
            if (iVar != null) {
                iVar.k();
            }
        } finally {
            super.finalize();
        }
    }

    public int getRenderMode() {
        return this.f5954b.a();
    }

    public void h() {
        this.f5954b.j();
    }

    public final void l() {
        if (this.f5954b != null) {
            throw new IllegalStateException("setRenderer has already been called for this instance.");
        }
    }

    @Override // android.view.TextureView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.d && this.c != null) {
            i iVar = this.f5954b;
            int iA = iVar != null ? iVar.a() : 1;
            i iVar2 = new i(this.f5953a);
            this.f5954b = iVar2;
            if (iA != 1) {
                iVar2.b(iA);
            }
            this.f5954b.start();
        }
        this.d = false;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        i iVar = this.f5954b;
        if (iVar != null) {
            iVar.k();
        }
        this.d = true;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        onSurfaceTextureSizeChanged(getSurfaceTexture(), i4 - i2, i5 - i3);
        super.onLayout(z, i2, i3, i4, i5);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i2, int i3) {
        this.f5954b.g();
        if (n() || MapsInitializer.getTextureSizeChangedInvoked()) {
            onSurfaceTextureSizeChanged(surfaceTexture, i2, i3);
        } else {
            if (this.f5954b.m() == i2 && this.f5954b.n() == i3) {
                return;
            }
            onSurfaceTextureSizeChanged(surfaceTexture, i2, i3);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.f5954b.h();
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i2, int i3) {
        this.f5954b.c(i2, i3);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public void queueEvent(Runnable runnable) {
        this.f5954b.d(runnable);
    }

    public void requestRender() {
        this.f5954b.f();
    }

    public void setRenderMode(int i2) {
        this.f5954b.b(i2);
    }

    public void setRenderer(GLSurfaceView.Renderer renderer) {
        l();
        if (this.e == null) {
            this.e = new m();
        }
        byte b2 = 0;
        if (this.f == null) {
            this.f = new c(this, b2);
        }
        if (this.g == null) {
            this.g = new d(b2);
        }
        this.c = renderer;
        i iVar = new i(this.f5953a);
        this.f5954b = iVar;
        iVar.start();
    }
}
