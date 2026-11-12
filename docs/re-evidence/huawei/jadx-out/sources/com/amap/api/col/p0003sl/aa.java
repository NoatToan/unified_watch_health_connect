package com.amap.api.col.p0003sl;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.GLDebugHelper;
import android.opengl.GLSurfaceView;
import android.util.Log;
import android.view.TextureView;
import com.amap.api.maps.MapsInitializer;
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
public class aa extends TextureView implements TextureView.SurfaceTextureListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final j f2156a = new j(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final WeakReference<aa> f2157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private i f2158c;
    private GLSurfaceView.Renderer d;
    private boolean e;
    private e f;
    private f g;
    private g h;
    private k i;
    private int j;
    private int k;
    private boolean l;

    public interface e {
        EGLConfig chooseConfig(EGL10 egl10, EGLDisplay eGLDisplay);
    }

    public interface f {
        EGLContext createContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig);

        void destroyContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLContext eGLContext);
    }

    public interface g {
        EGLSurface a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, Object obj);

        void a(EGL10 egl10, EGLDisplay eGLDisplay, EGLSurface eGLSurface);
    }

    public interface k {
        GL a();
    }

    private static boolean f() {
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public aa(Context context) {
        super(context, null);
        this.f2157b = new WeakReference<>(this);
        a();
    }

    protected void finalize() throws Throwable {
        try {
            i iVar = this.f2158c;
            if (iVar != null) {
                iVar.g();
            }
        } finally {
            super.finalize();
        }
    }

    private void a() {
        setSurfaceTextureListener(this);
    }

    public void setRenderer(GLSurfaceView.Renderer renderer) {
        e();
        if (this.f == null) {
            this.f = new m();
        }
        byte b2 = 0;
        if (this.g == null) {
            this.g = new c(this, b2);
        }
        if (this.h == null) {
            this.h = new d(b2);
        }
        this.d = renderer;
        i iVar = new i(this.f2157b);
        this.f2158c = iVar;
        iVar.start();
    }

    public final void a(f fVar) {
        e();
        this.g = fVar;
    }

    public final void a(e eVar) {
        e();
        this.f = eVar;
    }

    public void setRenderMode(int i2) {
        this.f2158c.a(i2);
    }

    public void requestRender() {
        this.f2158c.b();
    }

    public int getRenderMode() {
        return this.f2158c.a();
    }

    public void b() {
        this.f2158c.e();
    }

    public void c() {
        this.f2158c.f();
    }

    public void queueEvent(Runnable runnable) {
        this.f2158c.a(runnable);
    }

    @Override // android.view.TextureView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.e && this.d != null) {
            i iVar = this.f2158c;
            int iA = iVar != null ? iVar.a() : 1;
            i iVar2 = new i(this.f2157b);
            this.f2158c = iVar2;
            if (iA != 1) {
                iVar2.a(iA);
            }
            this.f2158c.start();
        }
        this.e = false;
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        i iVar = this.f2158c;
        if (iVar != null) {
            iVar.g();
        }
        this.e = true;
        super.onDetachedFromWindow();
    }

    final class c implements f {
        private c() {
        }

        /* synthetic */ c(aa aaVar, byte b2) {
            this();
        }

        @Override // com.amap.api.col.3sl.aa.f
        public final EGLContext createContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
            int[] iArr = {12440, aa.this.k, 12344};
            EGLContext eGLContext = EGL10.EGL_NO_CONTEXT;
            if (aa.this.k == 0) {
                iArr = null;
            }
            return egl10.eglCreateContext(eGLDisplay, eGLConfig, eGLContext, iArr);
        }

        @Override // com.amap.api.col.3sl.aa.f
        public final void destroyContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLContext eGLContext) {
            if (egl10.eglDestroyContext(eGLDisplay, eGLContext)) {
                return;
            }
            Log.e("DefaultContextFactory", "display:" + eGLDisplay + " context: " + eGLContext);
            h.a("eglDestroyContex", egl10.eglGetError());
        }
    }

    static final class d implements g {
        private d() {
        }

        /* synthetic */ d(byte b2) {
            this();
        }

        @Override // com.amap.api.col.3sl.aa.g
        public final EGLSurface a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, Object obj) {
            try {
                return egl10.eglCreateWindowSurface(eGLDisplay, eGLConfig, obj, null);
            } catch (IllegalArgumentException e) {
                Log.e("GLSurfaceView", "eglCreateWindowSurface", e);
                return null;
            }
        }

        @Override // com.amap.api.col.3sl.aa.g
        public final void a(EGL10 egl10, EGLDisplay eGLDisplay, EGLSurface eGLSurface) {
            egl10.eglDestroySurface(eGLDisplay, eGLSurface);
        }
    }

    abstract class a implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected int[] f2159a;

        abstract EGLConfig a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig[] eGLConfigArr);

        public a(int[] iArr) {
            this.f2159a = a(iArr);
        }

        @Override // com.amap.api.col.3sl.aa.e
        public EGLConfig chooseConfig(EGL10 egl10, EGLDisplay eGLDisplay) {
            int[] iArr = new int[1];
            if (!egl10.eglChooseConfig(eGLDisplay, this.f2159a, null, 0, iArr)) {
                throw new IllegalArgumentException("eglChooseConfig failed");
            }
            int i = iArr[0];
            if (i <= 0) {
                throw new IllegalArgumentException("No configs match configSpec");
            }
            EGLConfig[] eGLConfigArr = new EGLConfig[i];
            if (!egl10.eglChooseConfig(eGLDisplay, this.f2159a, eGLConfigArr, i, iArr)) {
                throw new IllegalArgumentException("eglChooseConfig#2 failed");
            }
            EGLConfig eGLConfigA = a(egl10, eGLDisplay, eGLConfigArr);
            if (eGLConfigA != null) {
                return eGLConfigA;
            }
            throw new IllegalArgumentException("No config chosen");
        }

        private int[] a(int[] iArr) {
            if (aa.this.k != 2 && aa.this.k != 3) {
                return iArr;
            }
            int length = iArr.length;
            int[] iArr2 = new int[length + 2];
            int i = length - 1;
            System.arraycopy(iArr, 0, iArr2, 0, i);
            iArr2[i] = 12352;
            if (aa.this.k == 2) {
                iArr2[length] = 4;
            } else {
                iArr2[length] = 64;
            }
            iArr2[length + 1] = 12344;
            return iArr2;
        }
    }

    class b extends a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        protected int f2161c;
        protected int d;
        protected int e;
        protected int f;
        protected int g;
        protected int h;
        private int[] j;

        public b() {
            super(new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 0, 12325, 16, 12326, 0, 12344});
            this.j = new int[1];
            this.f2161c = 8;
            this.d = 8;
            this.e = 8;
            this.f = 0;
            this.g = 16;
            this.h = 0;
        }

        @Override // com.amap.api.col.3sl.aa.a
        public final EGLConfig a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig[] eGLConfigArr) {
            for (EGLConfig eGLConfig : eGLConfigArr) {
                int iA = a(egl10, eGLDisplay, eGLConfig, 12325);
                int iA2 = a(egl10, eGLDisplay, eGLConfig, 12326);
                if (iA >= this.g && iA2 >= this.h) {
                    int iA3 = a(egl10, eGLDisplay, eGLConfig, 12324);
                    int iA4 = a(egl10, eGLDisplay, eGLConfig, 12323);
                    int iA5 = a(egl10, eGLDisplay, eGLConfig, 12322);
                    int iA6 = a(egl10, eGLDisplay, eGLConfig, 12321);
                    if (iA3 == this.f2161c && iA4 == this.d && iA5 == this.e && iA6 == this.f) {
                        return eGLConfig;
                    }
                }
            }
            return null;
        }

        private int a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i) {
            if (egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, i, this.j)) {
                return this.j[0];
            }
            return 0;
        }
    }

    final class m extends b {
        public m() {
            super();
        }
    }

    static final class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        EGL10 f2163a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        EGLDisplay f2164b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        EGLSurface f2165c;
        EGLConfig d;
        EGLContext e;
        private WeakReference<aa> f;

        public h(WeakReference<aa> weakReference) {
            this.f = weakReference;
        }

        public final void a() {
            EGL10 egl10 = (EGL10) EGLContext.getEGL();
            this.f2163a = egl10;
            EGLDisplay eGLDisplayEglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            this.f2164b = eGLDisplayEglGetDisplay;
            if (eGLDisplayEglGetDisplay == EGL10.EGL_NO_DISPLAY) {
                throw new RuntimeException("eglGetDisplay failed");
            }
            if (!this.f2163a.eglInitialize(this.f2164b, new int[2])) {
                throw new RuntimeException("eglInitialize failed");
            }
            aa aaVar = this.f.get();
            if (aaVar != null) {
                this.d = aaVar.f.chooseConfig(this.f2163a, this.f2164b);
                this.e = aaVar.g.createContext(this.f2163a, this.f2164b, this.d);
            } else {
                this.d = null;
                this.e = null;
            }
            EGLContext eGLContext = this.e;
            if (eGLContext == null || eGLContext == EGL10.EGL_NO_CONTEXT) {
                this.e = null;
                a("createContext");
            }
            this.f2165c = null;
        }

        public final boolean b() {
            if (this.f2163a == null) {
                throw new RuntimeException("egl not initialized");
            }
            if (this.f2164b == null) {
                throw new RuntimeException("eglDisplay not initialized");
            }
            if (this.d == null) {
                throw new RuntimeException("mEglConfig not initialized");
            }
            g();
            aa aaVar = this.f.get();
            if (aaVar != null) {
                this.f2165c = aaVar.h.a(this.f2163a, this.f2164b, this.d, aaVar.getSurfaceTexture());
            } else {
                this.f2165c = null;
            }
            EGLSurface eGLSurface = this.f2165c;
            if (eGLSurface == null || eGLSurface == EGL10.EGL_NO_SURFACE) {
                if (this.f2163a.eglGetError() == 12299) {
                    Log.e("EglHelper", "createWindowSurface returned EGL_BAD_NATIVE_WINDOW.");
                }
                return false;
            }
            EGL10 egl10 = this.f2163a;
            EGLDisplay eGLDisplay = this.f2164b;
            EGLSurface eGLSurface2 = this.f2165c;
            if (egl10.eglMakeCurrent(eGLDisplay, eGLSurface2, eGLSurface2, this.e)) {
                return true;
            }
            a("EGLHelper", "eglMakeCurrent", this.f2163a.eglGetError());
            return false;
        }

        final GL c() {
            GL gl = this.e.getGL();
            aa aaVar = this.f.get();
            if (aaVar == null) {
                return gl;
            }
            if (aaVar.i != null) {
                gl = aaVar.i.a();
            }
            if ((aaVar.j & 3) != 0) {
                return GLDebugHelper.wrap(gl, (aaVar.j & 1) == 0 ? 0 : 1, (aaVar.j & 2) != 0 ? new l() : null);
            }
            return gl;
        }

        public final int d() {
            if (this.f2163a.eglSwapBuffers(this.f2164b, this.f2165c)) {
                return 12288;
            }
            return this.f2163a.eglGetError();
        }

        public final void e() {
            g();
        }

        private void g() {
            EGLSurface eGLSurface = this.f2165c;
            if (eGLSurface == null || eGLSurface == EGL10.EGL_NO_SURFACE) {
                return;
            }
            EGL10 egl10 = this.f2163a;
            EGLDisplay eGLDisplay = this.f2164b;
            EGLSurface eGLSurface2 = EGL10.EGL_NO_SURFACE;
            egl10.eglMakeCurrent(eGLDisplay, eGLSurface2, eGLSurface2, EGL10.EGL_NO_CONTEXT);
            aa aaVar = this.f.get();
            if (aaVar != null) {
                aaVar.h.a(this.f2163a, this.f2164b, this.f2165c);
            }
            this.f2165c = null;
        }

        public final void f() {
            if (this.e != null) {
                aa aaVar = this.f.get();
                if (aaVar != null) {
                    aaVar.g.destroyContext(this.f2163a, this.f2164b, this.e);
                }
                this.e = null;
            }
            EGLDisplay eGLDisplay = this.f2164b;
            if (eGLDisplay != null) {
                this.f2163a.eglTerminate(eGLDisplay);
                this.f2164b = null;
            }
        }

        private void a(String str) {
            a(str, this.f2163a.eglGetError());
        }

        public static void a(String str, int i) {
            throw new RuntimeException(b(str, i));
        }

        public static void a(String str, String str2, int i) {
            Log.w(str, b(str2, i));
        }

        private static String b(String str, int i) {
            return str + " failed: " + i;
        }
    }

    static final class i extends Thread {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f2166a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f2167b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f2168c;
        private boolean d;
        private boolean e;
        private boolean f;
        private boolean g;
        private boolean h;
        private boolean i;
        private boolean j;
        private boolean k;
        private boolean p;
        private h s;
        private WeakReference<aa> t;
        private ArrayList<Runnable> q = new ArrayList<>();
        private boolean r = true;
        private int l = 0;
        private int m = 0;
        private boolean o = true;
        private int n = 1;

        static /* synthetic */ boolean a(i iVar) {
            iVar.f2167b = true;
            return true;
        }

        i(WeakReference<aa> weakReference) {
            this.t = weakReference;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            setName("GLThread " + getId());
            try {
                m();
            } catch (InterruptedException unused) {
            } finally {
                aa.f2156a.a(this);
            }
        }

        private void k() {
            if (this.i) {
                this.i = false;
                this.s.e();
            }
        }

        private void l() {
            if (this.h) {
                this.s.f();
                this.h = false;
                aa.f2156a.c(this);
            }
        }

        /* JADX WARN: Code duplicated, block: B:166:0x021e A[EXC_TOP_SPLITTER, SYNTHETIC] */
        private void m() throws InterruptedException {
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
            boolean z10 = false;
            int i = 0;
            int i2 = 0;
            GL10 gl10 = null;
            while (true) {
                Runnable runnableRemove = null;
                while (true) {
                    try {
                        synchronized (aa.f2156a) {
                            while (true) {
                                if (this.f2166a) {
                                    synchronized (aa.f2156a) {
                                        k();
                                        l();
                                    }
                                    return;
                                }
                                if (!this.q.isEmpty()) {
                                    runnableRemove = this.q.remove(0);
                                    z = false;
                                    break;
                                }
                                boolean z11 = this.d;
                                boolean z12 = this.f2168c;
                                if (z11 != z12) {
                                    this.d = z12;
                                    aa.f2156a.notifyAll();
                                } else {
                                    z12 = false;
                                }
                                if (this.k) {
                                    k();
                                    l();
                                    this.k = false;
                                    z6 = true;
                                }
                                if (z4) {
                                    k();
                                    l();
                                    z4 = false;
                                }
                                if (z12 && this.i) {
                                    k();
                                }
                                if (z12 && this.h && ((aaVar = this.t.get()) == null || !aaVar.l || aa.f2156a.a())) {
                                    l();
                                }
                                if (z12 && aa.f2156a.b()) {
                                    this.s.f();
                                }
                                if (!this.e && !this.g) {
                                    if (this.i) {
                                        k();
                                    }
                                    this.g = true;
                                    this.f = false;
                                    aa.f2156a.notifyAll();
                                }
                                if (this.e && this.g) {
                                    this.g = false;
                                    aa.f2156a.notifyAll();
                                }
                                if (z9) {
                                    this.p = true;
                                    aa.f2156a.notifyAll();
                                    z5 = false;
                                    z9 = false;
                                }
                                if (o()) {
                                    if (!this.h) {
                                        if (z6) {
                                            z6 = false;
                                        } else if (aa.f2156a.b(this)) {
                                            try {
                                                this.s.a();
                                                this.h = true;
                                                aa.f2156a.notifyAll();
                                                z3 = true;
                                            } catch (RuntimeException e) {
                                                aa.f2156a.c(this);
                                                throw e;
                                            }
                                        }
                                    }
                                    if (this.h && !this.i) {
                                        this.i = true;
                                        z7 = true;
                                        z8 = true;
                                        z10 = true;
                                    }
                                    if (this.i) {
                                        if (this.r) {
                                            i = this.l;
                                            i2 = this.m;
                                            z = false;
                                            this.r = false;
                                            z5 = true;
                                            z7 = true;
                                            z10 = true;
                                        } else {
                                            z = false;
                                        }
                                        this.o = z;
                                        aa.f2156a.notifyAll();
                                        break;
                                    }
                                }
                                aa.f2156a.wait();
                            }
                        }
                        if (runnableRemove != null) {
                            break;
                        }
                        if (z10) {
                            if (this.s.b()) {
                                synchronized (aa.f2156a) {
                                    this.j = true;
                                    aa.f2156a.notifyAll();
                                }
                                z10 = z;
                            } else {
                                synchronized (aa.f2156a) {
                                    this.j = true;
                                    this.f = true;
                                    aa.f2156a.notifyAll();
                                }
                            }
                            synchronized (aa.f2156a) {
                                k();
                                l();
                                throw th;
                            }
                        }
                        if (z8) {
                            GL10 gl11 = (GL10) this.s.c();
                            aa.f2156a.a(gl11);
                            z8 = z;
                            gl10 = gl11;
                        }
                        if (z3) {
                            aa aaVar2 = this.t.get();
                            if (aaVar2 != null) {
                                aaVar2.d.onSurfaceCreated(gl10, this.s.d);
                            }
                            z3 = z;
                        }
                        if (z7) {
                            aa aaVar3 = this.t.get();
                            if (aaVar3 != null) {
                                aaVar3.d.onSurfaceChanged(gl10, i, i2);
                            }
                            z7 = z;
                        }
                        aa aaVar4 = this.t.get();
                        if (aaVar4 != null) {
                            aaVar4.d.onDrawFrame(gl10);
                        }
                        int iD = this.s.d();
                        if (iD == 12288) {
                            z2 = true;
                        } else if (iD != 12302) {
                            h.a("GLThread", "eglSwapBuffers", iD);
                            synchronized (aa.f2156a) {
                                z2 = true;
                                this.f = true;
                                aa.f2156a.notifyAll();
                            }
                        } else {
                            z2 = true;
                            z4 = true;
                        }
                        if (z5) {
                            z9 = z2;
                        }
                    } catch (Throwable th) {
                        synchronized (aa.f2156a) {
                            k();
                            l();
                            throw th;
                        }
                    }
                }
                runnableRemove.run();
            }
        }

        private boolean n() {
            return this.h && this.i && o();
        }

        private boolean o() {
            if (this.d || !this.e || this.f || this.l <= 0 || this.m <= 0) {
                return false;
            }
            return this.o || this.n == 1;
        }

        public final void a(int i) {
            if (i >= 0 && i <= 1) {
                synchronized (aa.f2156a) {
                    this.n = i;
                    aa.f2156a.notifyAll();
                }
                return;
            }
            throw new IllegalArgumentException("renderMode");
        }

        public final int a() {
            int i;
            synchronized (aa.f2156a) {
                i = this.n;
            }
            return i;
        }

        public final void b() {
            synchronized (aa.f2156a) {
                this.o = true;
                aa.f2156a.notifyAll();
            }
        }

        public final void c() {
            synchronized (aa.f2156a) {
                this.e = true;
                this.j = false;
                aa.f2156a.notifyAll();
                while (this.g && !this.j && !this.f2167b) {
                    try {
                        aa.f2156a.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        public final void d() {
            synchronized (aa.f2156a) {
                this.e = false;
                aa.f2156a.notifyAll();
                while (!this.g && !this.f2167b) {
                    try {
                        if (MapsInitializer.getTextureViewDestorySync()) {
                            aa.f2156a.wait();
                        } else {
                            aa.f2156a.wait(2000L);
                        }
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        public final void e() {
            synchronized (aa.f2156a) {
                this.f2168c = true;
                aa.f2156a.notifyAll();
                while (!this.f2167b && !this.d) {
                    try {
                        if (MapsInitializer.getTextureViewDestorySync()) {
                            aa.f2156a.wait();
                        } else {
                            aa.f2156a.wait(2000L);
                        }
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        public final void f() {
            synchronized (aa.f2156a) {
                this.f2168c = false;
                this.o = true;
                this.p = false;
                aa.f2156a.notifyAll();
                while (!this.f2167b && this.d && !this.p) {
                    try {
                        aa.f2156a.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        public final void a(int i, int i2) {
            synchronized (aa.f2156a) {
                this.l = i;
                this.m = i2;
                this.r = true;
                this.o = true;
                this.p = false;
                aa.f2156a.notifyAll();
                while (!this.f2167b && !this.d && !this.p && n()) {
                    try {
                        aa.f2156a.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        public final void g() {
            synchronized (aa.f2156a) {
                this.f2166a = true;
                aa.f2156a.notifyAll();
                while (!this.f2167b) {
                    try {
                        aa.f2156a.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        public final void h() {
            this.k = true;
            aa.f2156a.notifyAll();
        }

        public final void a(Runnable runnable) {
            if (runnable != null) {
                synchronized (aa.f2156a) {
                    this.q.add(runnable);
                    aa.f2156a.notifyAll();
                }
                return;
            }
            throw new IllegalArgumentException("r must not be null");
        }

        public final int i() {
            int i;
            synchronized (aa.f2156a) {
                i = this.l;
            }
            return i;
        }

        public final int j() {
            int i;
            synchronized (aa.f2156a) {
                i = this.m;
            }
            return i;
        }
    }

    static final class l extends Writer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private StringBuilder f2172a = new StringBuilder();

        l() {
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
                char c2 = cArr[i + i3];
                if (c2 == '\n') {
                    a();
                } else {
                    this.f2172a.append(c2);
                }
            }
        }

        private void a() {
            if (this.f2172a.length() > 0) {
                Log.v("GLSurfaceView", this.f2172a.toString());
                StringBuilder sb = this.f2172a;
                sb.delete(0, sb.length());
            }
        }
    }

    private void e() {
        if (this.f2158c != null) {
            throw new IllegalStateException("setRenderer has already been called for this instance.");
        }
    }

    static final class j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static String f2169a = "GLThreadManager";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f2170b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f2171c;
        private boolean d;
        private boolean e;
        private boolean f;
        private i g;

        private j() {
        }

        /* synthetic */ j(byte b2) {
            this();
        }

        public final void a(i iVar) {
            synchronized (this) {
                i.a(iVar);
                if (this.g == iVar) {
                    this.g = null;
                }
                notifyAll();
            }
        }

        public final boolean b(i iVar) {
            i iVar2 = this.g;
            if (iVar2 == iVar || iVar2 == null) {
                this.g = iVar;
                notifyAll();
                return true;
            }
            c();
            if (this.e) {
                return true;
            }
            i iVar3 = this.g;
            if (iVar3 == null) {
                return false;
            }
            iVar3.h();
            return false;
        }

        public final void c(i iVar) {
            if (this.g == iVar) {
                this.g = null;
            }
            notifyAll();
        }

        public final boolean a() {
            boolean z;
            synchronized (this) {
                z = this.f;
            }
            return z;
        }

        public final boolean b() {
            boolean z;
            synchronized (this) {
                c();
                z = this.e;
            }
            return !z;
        }

        public final void a(GL10 gl10) {
            synchronized (this) {
                if (!this.d && gl10 != null) {
                    c();
                    String strGlGetString = gl10.glGetString(7937);
                    if (this.f2171c < 131072) {
                        this.e = !strGlGetString.startsWith("Q3Dimension MSM7500 ");
                        notifyAll();
                    }
                    this.f = !this.e;
                    this.d = true;
                }
            }
        }

        private void c() {
            if (this.f2170b) {
                return;
            }
            this.f2171c = 131072;
            this.e = true;
            this.f2170b = true;
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i2, int i3) {
        this.f2158c.c();
        if (f() || MapsInitializer.getTextureSizeChangedInvoked()) {
            onSurfaceTextureSizeChanged(surfaceTexture, i2, i3);
        } else {
            if (this.f2158c.i() == i2 && this.f2158c.j() == i3) {
                return;
            }
            onSurfaceTextureSizeChanged(surfaceTexture, i2, i3);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.f2158c.d();
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i2, int i3) {
        this.f2158c.a(i2, i3);
    }

    @Override // android.view.View
    protected void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        onSurfaceTextureSizeChanged(getSurfaceTexture(), i4 - i2, i5 - i3);
        super.onLayout(z, i2, i3, i4, i5);
    }
}
