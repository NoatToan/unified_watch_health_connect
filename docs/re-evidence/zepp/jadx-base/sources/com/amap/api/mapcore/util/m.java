package com.amap.api.mapcore.util;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.GLDebugHelper;
import android.opengl.GLSurfaceView;
import android.os.Build;
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

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"NewApi"})
public class m extends TextureView implements TextureView.SurfaceTextureListener {
    private static final j a = new j(0);
    private final WeakReference<m> b;
    private i c;
    private GLSurfaceView.Renderer d;
    private boolean e;
    private e f;
    private f g;
    private g h;
    private k i;
    private int j;
    private int k;
    private boolean l;

    public abstract class a implements e {
        public int[] a;

        public a(int[] iArr) {
            if (m.this.k == 2 || m.this.k == 3) {
                int[] iArr2 = new int[15];
                System.arraycopy(iArr, 0, iArr2, 0, 12);
                iArr2[12] = 12352;
                if (m.this.k == 2) {
                    iArr2[13] = 4;
                } else {
                    iArr2[13] = 64;
                }
                iArr2[14] = 12344;
                iArr = iArr2;
            }
            this.a = iArr;
        }

        public abstract EGLConfig a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig[] eGLConfigArr);

        @Override // com.amap.api.mapcore.util.m.e
        public EGLConfig chooseConfig(EGL10 egl10, EGLDisplay eGLDisplay) {
            int[] iArr = new int[1];
            if (!egl10.eglChooseConfig(eGLDisplay, this.a, null, 0, iArr)) {
                throw new IllegalArgumentException("eglChooseConfig failed");
            }
            int i = iArr[0];
            if (i <= 0) {
                throw new IllegalArgumentException("No configs match configSpec");
            }
            EGLConfig[] eGLConfigArr = new EGLConfig[i];
            if (!egl10.eglChooseConfig(eGLDisplay, this.a, eGLConfigArr, i, iArr)) {
                throw new IllegalArgumentException("eglChooseConfig#2 failed");
            }
            EGLConfig eGLConfigA = a(egl10, eGLDisplay, eGLConfigArr);
            if (eGLConfigA != null) {
                return eGLConfigA;
            }
            throw new IllegalArgumentException("No config chosen");
        }
    }

    public class c implements f {
        private c() {
        }

        @Override // com.amap.api.mapcore.util.m.f
        public final EGLContext createContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
            int[] iArr = {12440, m.this.k, 12344};
            EGLContext eGLContext = EGL10.EGL_NO_CONTEXT;
            if (m.this.k == 0) {
                iArr = null;
            }
            return egl10.eglCreateContext(eGLDisplay, eGLConfig, eGLContext, iArr);
        }

        @Override // com.amap.api.mapcore.util.m.f
        public final void destroyContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLContext eGLContext) {
            if (egl10.eglDestroyContext(eGLDisplay, eGLContext)) {
                return;
            }
            Log.e("DefaultContextFactory", "display:" + eGLDisplay + " context: " + eGLContext);
            h.a("eglDestroyContex", egl10.eglGetError());
        }

        public /* synthetic */ c(m mVar, byte b) {
            this();
        }
    }

    public static class d implements g {
        private d() {
        }

        @Override // com.amap.api.mapcore.util.m.g
        public final EGLSurface a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, Object obj) {
            try {
                return egl10.eglCreateWindowSurface(eGLDisplay, eGLConfig, obj, null);
            } catch (IllegalArgumentException e) {
                Log.e("GLSurfaceView", "eglCreateWindowSurface", e);
                return null;
            }
        }

        public /* synthetic */ d(byte b) {
            this();
        }

        @Override // com.amap.api.mapcore.util.m.g
        public final void a(EGL10 egl10, EGLDisplay eGLDisplay, EGLSurface eGLSurface) {
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

        void a(EGL10 egl10, EGLDisplay eGLDisplay, EGLSurface eGLSurface);
    }

    public static class i extends Thread {
        private boolean a;
        private boolean b;
        private boolean c;
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
        private WeakReference<m> t;
        private ArrayList<Runnable> q = new ArrayList<>();
        private boolean r = true;
        private int l = 0;
        private int m = 0;
        private boolean o = true;
        private int n = 1;

        public i(WeakReference<m> weakReference) {
            this.t = weakReference;
        }

        public static /* synthetic */ boolean a(i iVar) {
            iVar.b = true;
            return true;
        }

        private void k() {
            if (this.i) {
                this.i = false;
                this.s.d();
            }
        }

        private void l() {
            if (this.h) {
                this.s.e();
                this.h = false;
                m.a.c(this);
            }
        }

        /* JADX WARN: Code duplicated, block: B:147:0x0221  */
        /* JADX WARN: Code duplicated, block: B:162:0x0238 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        private void m() throws InterruptedException {
            boolean z;
            this.s = new h(this.t);
            this.h = false;
            this.i = false;
            boolean z2 = false;
            boolean z3 = false;
            boolean z4 = false;
            GL10 gl10 = null;
            boolean z5 = false;
            boolean z6 = false;
            boolean z7 = false;
            boolean z8 = false;
            int i = 0;
            int i2 = 0;
            Runnable runnableRemove = null;
            boolean z9 = false;
            while (true) {
                try {
                    synchronized (m.a) {
                        while (true) {
                            if (this.a) {
                                synchronized (m.a) {
                                    k();
                                    l();
                                }
                                return;
                            }
                            if (!this.q.isEmpty()) {
                                runnableRemove = this.q.remove(0);
                                break;
                            }
                            boolean z10 = this.d;
                            boolean z11 = this.c;
                            if (z10 != z11) {
                                this.d = z11;
                                m.a.notifyAll();
                            } else {
                                z11 = false;
                            }
                            if (this.k) {
                                k();
                                l();
                                this.k = false;
                                z4 = true;
                            }
                            if (z2) {
                                k();
                                l();
                                z2 = false;
                            }
                            if (z11 && this.i) {
                                k();
                            }
                            if (z11 && this.h) {
                                m mVar = this.t.get();
                                if (!(mVar == null ? false : mVar.l) || m.a.a()) {
                                    l();
                                }
                            }
                            if (z11 && m.a.b()) {
                                this.s.e();
                            }
                            if (!this.e && !this.g) {
                                if (this.i) {
                                    k();
                                }
                                this.g = true;
                                this.f = false;
                                m.a.notifyAll();
                            }
                            if (this.e && this.g) {
                                this.g = false;
                                m.a.notifyAll();
                            }
                            if (z3) {
                                this.p = true;
                                m.a.notifyAll();
                                z3 = false;
                                z9 = false;
                            }
                            if (n()) {
                                if (!this.h) {
                                    if (z4) {
                                        z4 = false;
                                    } else if (m.a.b(this)) {
                                        try {
                                            this.s.a();
                                            this.h = true;
                                            m.a.notifyAll();
                                            z5 = true;
                                        } catch (RuntimeException e) {
                                            m.a.c(this);
                                            throw e;
                                        }
                                    }
                                }
                                if (this.h && !this.i) {
                                    this.i = true;
                                    z6 = true;
                                    z7 = true;
                                    z8 = true;
                                }
                                if (this.i) {
                                    if (this.r) {
                                        int i3 = this.l;
                                        int i4 = this.m;
                                        this.r = false;
                                        i = i3;
                                        i2 = i4;
                                        z = false;
                                        z6 = true;
                                        z8 = true;
                                        z9 = true;
                                    } else {
                                        z = false;
                                    }
                                    this.o = z;
                                    m.a.notifyAll();
                                    break;
                                }
                            }
                            m.a.wait();
                        }
                    }
                    if (runnableRemove != null) {
                        runnableRemove.run();
                        runnableRemove = null;
                    } else {
                        if (z6) {
                            if (this.s.b()) {
                                synchronized (m.a) {
                                    this.j = true;
                                    m.a.notifyAll();
                                }
                                z6 = false;
                            } else {
                                synchronized (m.a) {
                                    this.j = true;
                                    this.f = true;
                                    m.a.notifyAll();
                                }
                            }
                            synchronized (m.a) {
                                k();
                                l();
                                throw th;
                            }
                        }
                        if (z7) {
                            gl10 = (GL10) this.s.c();
                            m.a.a(gl10);
                            z7 = false;
                        }
                        if (z5) {
                            m mVar2 = this.t.get();
                            if (mVar2 != null) {
                                mVar2.d.onSurfaceCreated(gl10, this.s.d);
                            }
                            z5 = false;
                        }
                        if (z8) {
                            m mVar3 = this.t.get();
                            if (mVar3 != null) {
                                mVar3.d.onSurfaceChanged(gl10, i, i2);
                            }
                            z8 = false;
                        }
                        m mVar4 = this.t.get();
                        if (mVar4 != null) {
                            mVar4.d.onDrawFrame(gl10);
                        }
                        h hVar = this.s;
                        boolean z12 = z2;
                        int iEglGetError = !hVar.a.eglSwapBuffers(hVar.b, hVar.c) ? hVar.a.eglGetError() : 12288;
                        if (iEglGetError != 12288) {
                            if (iEglGetError != 12302) {
                                h.a("GLThread", "eglSwapBuffers", iEglGetError);
                                synchronized (m.a) {
                                    this.f = true;
                                    m.a.notifyAll();
                                }
                            } else {
                                z2 = true;
                            }
                            if (z9) {
                                z3 = true;
                            }
                        }
                        z2 = z12;
                        if (z9) {
                            z3 = true;
                        }
                    }
                } catch (Throwable th) {
                    synchronized (m.a) {
                        k();
                        l();
                        throw th;
                    }
                }
            }
        }

        private boolean n() {
            if (this.d || !this.e || this.f || this.l <= 0 || this.m <= 0) {
                return false;
            }
            return this.o || this.n == 1;
        }

        public final void b() {
            synchronized (m.a) {
                this.o = true;
                m.a.notifyAll();
            }
        }

        public final void c() {
            synchronized (m.a) {
                this.e = true;
                this.j = false;
                m.a.notifyAll();
                while (this.g && !this.j && !this.b) {
                    try {
                        m.a.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        public final void d() {
            synchronized (m.a) {
                this.e = false;
                m.a.notifyAll();
                while (!this.g && !this.b) {
                    try {
                        if (MapsInitializer.getTextureViewDestorySync()) {
                            m.a.wait();
                        } else {
                            m.a.wait(2000L);
                        }
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        public final void e() {
            synchronized (m.a) {
                this.c = true;
                m.a.notifyAll();
                while (!this.b && !this.d) {
                    try {
                        if (MapsInitializer.getTextureViewDestorySync()) {
                            m.a.wait();
                        } else {
                            m.a.wait(2000L);
                        }
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        public final void f() {
            synchronized (m.a) {
                this.c = false;
                this.o = true;
                this.p = false;
                m.a.notifyAll();
                while (!this.b && this.d && !this.p) {
                    try {
                        m.a.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        public final void g() {
            synchronized (m.a) {
                this.a = true;
                m.a.notifyAll();
                while (!this.b) {
                    try {
                        m.a.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        public final void h() {
            this.k = true;
            m.a.notifyAll();
        }

        public final int i() {
            int i;
            synchronized (m.a) {
                i = this.l;
            }
            return i;
        }

        public final int j() {
            int i;
            synchronized (m.a) {
                i = this.m;
            }
            return i;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            setName("GLThread " + getId());
            try {
                m();
            } catch (InterruptedException unused) {
            } finally {
                m.a.a(this);
            }
        }

        public final void a(int i) {
            if (i < 0 || i > 1) {
                throw new IllegalArgumentException("renderMode");
            }
            synchronized (m.a) {
                this.n = i;
                m.a.notifyAll();
            }
        }

        public final int a() {
            int i;
            synchronized (m.a) {
                i = this.n;
            }
            return i;
        }

        public final void a(int i, int i2) {
            synchronized (m.a) {
                this.l = i;
                this.m = i2;
                this.r = true;
                this.o = true;
                this.p = false;
                m.a.notifyAll();
                while (!this.b && !this.d && !this.p) {
                    if (!(this.h && this.i && n())) {
                        break;
                    }
                    try {
                        m.a.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            }
        }

        public final void a(Runnable runnable) {
            if (runnable != null) {
                synchronized (m.a) {
                    this.q.add(runnable);
                    m.a.notifyAll();
                }
                return;
            }
            throw new IllegalArgumentException("r must not be null");
        }
    }

    public static class j {
        private static String a = "GLThreadManager";
        private boolean b;
        private int c;
        private boolean d;
        private boolean e;
        private boolean f;
        private i g;

        private j() {
        }

        public final synchronized void a(i iVar) {
            i.a(iVar);
            if (this.g == iVar) {
                this.g = null;
            }
            notifyAll();
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

        public /* synthetic */ j(byte b) {
            this();
        }

        private void c() {
            if (this.b) {
                return;
            }
            this.c = 131072;
            this.e = true;
            this.b = true;
        }

        public final synchronized boolean a() {
            return this.f;
        }

        public final synchronized void a(GL10 gl10) {
            if (!this.d && gl10 != null) {
                c();
                String strGlGetString = gl10.glGetString(7937);
                if (this.c < 131072) {
                    this.e = !strGlGetString.startsWith("Q3Dimension MSM7500 ");
                    notifyAll();
                }
                this.f = this.e ? false : true;
                this.d = true;
            }
        }

        public final synchronized boolean b() {
            c();
            return !this.e;
        }
    }

    public interface k {
        GL a();
    }

    public static class l extends Writer {
        private StringBuilder a = new StringBuilder();

        private void a() {
            if (this.a.length() > 0) {
                Log.v("GLSurfaceView", this.a.toString());
                StringBuilder sb = this.a;
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
                    this.a.append(c);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.amap.api.mapcore.util.m$m, reason: collision with other inner class name */
    public class C0110m extends b {
        public C0110m() {
            super();
        }
    }

    public m(Context context) {
        super(context, null);
        this.b = new WeakReference<>(this);
        setSurfaceTextureListener(this);
    }

    public void finalize() throws Throwable {
        try {
            i iVar = this.c;
            if (iVar != null) {
                iVar.g();
            }
        } finally {
            super.finalize();
        }
    }

    public int getRenderMode() {
        return this.c.a();
    }

    @Override // android.view.TextureView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.e && this.d != null) {
            i iVar = this.c;
            int iA = iVar != null ? iVar.a() : 1;
            i iVar2 = new i(this.b);
            this.c = iVar2;
            if (iA != 1) {
                iVar2.a(iA);
            }
            this.c.start();
        }
        this.e = false;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        i iVar = this.c;
        if (iVar != null) {
            iVar.g();
        }
        this.e = true;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        onSurfaceTextureSizeChanged(getSurfaceTexture(), i4 - i2, i5 - i3);
        super.onLayout(z, i2, i3, i4, i5);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i2, int i3) {
        this.c.c();
        if ((Build.VERSION.SDK_INT < 23) || MapsInitializer.getTextureSizeChangedInvoked()) {
            onSurfaceTextureSizeChanged(surfaceTexture, i2, i3);
        } else {
            if (this.c.i() == i2 && this.c.j() == i3) {
                return;
            }
            onSurfaceTextureSizeChanged(surfaceTexture, i2, i3);
        }
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.c.d();
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i2, int i3) {
        this.c.a(i2, i3);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public void queueEvent(Runnable runnable) {
        this.c.a(runnable);
    }

    public void requestRender() {
        this.c.b();
    }

    public void setRenderMode(int i2) {
        this.c.a(i2);
    }

    public void setRenderer(GLSurfaceView.Renderer renderer) {
        a();
        if (this.f == null) {
            this.f = new C0110m();
        }
        byte b2 = 0;
        if (this.g == null) {
            this.g = new c(this, b2);
        }
        if (this.h == null) {
            this.h = new d(b2);
        }
        this.d = renderer;
        i iVar = new i(this.b);
        this.c = iVar;
        iVar.start();
    }

    public final void a(f fVar) {
        a();
        this.g = fVar;
    }

    public void b() {
        this.c.e();
    }

    public void c() {
        this.c.f();
    }

    public final void a(e eVar) {
        a();
        this.f = eVar;
    }

    private void a() {
        if (this.c != null) {
            throw new IllegalStateException("setRenderer has already been called for this instance.");
        }
    }

    public class b extends a {
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;
        public int h;
        private int[] j;

        public b() {
            super(new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 0, 12325, 16, 12326, 0, 12344});
            this.j = new int[1];
            this.c = 8;
            this.d = 8;
            this.e = 8;
            this.f = 0;
            this.g = 16;
            this.h = 0;
        }

        @Override // com.amap.api.mapcore.util.m.a
        public final EGLConfig a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig[] eGLConfigArr) {
            for (EGLConfig eGLConfig : eGLConfigArr) {
                int iA = a(egl10, eGLDisplay, eGLConfig, 12325);
                int iA2 = a(egl10, eGLDisplay, eGLConfig, 12326);
                if (iA >= this.g && iA2 >= this.h) {
                    int iA3 = a(egl10, eGLDisplay, eGLConfig, 12324);
                    int iA4 = a(egl10, eGLDisplay, eGLConfig, 12323);
                    int iA5 = a(egl10, eGLDisplay, eGLConfig, 12322);
                    int iA6 = a(egl10, eGLDisplay, eGLConfig, 12321);
                    if (iA3 == this.c && iA4 == this.d && iA5 == this.e && iA6 == this.f) {
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

    public static class h {
        public EGL10 a;
        public EGLDisplay b;
        public EGLSurface c;
        public EGLConfig d;
        public EGLContext e;
        private WeakReference<m> f;

        public h(WeakReference<m> weakReference) {
            this.f = weakReference;
        }

        private void f() {
            EGLSurface eGLSurface;
            EGLSurface eGLSurface2 = this.c;
            if (eGLSurface2 == null || eGLSurface2 == (eGLSurface = EGL10.EGL_NO_SURFACE)) {
                return;
            }
            this.a.eglMakeCurrent(this.b, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            m mVar = this.f.get();
            if (mVar != null) {
                mVar.h.a(this.a, this.b, this.c);
            }
            this.c = null;
        }

        public final void a() {
            EGL10 egl10 = (EGL10) EGLContext.getEGL();
            this.a = egl10;
            EGLDisplay eGLDisplayEglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            this.b = eGLDisplayEglGetDisplay;
            if (eGLDisplayEglGetDisplay == EGL10.EGL_NO_DISPLAY) {
                throw new RuntimeException("eglGetDisplay failed");
            }
            if (!this.a.eglInitialize(eGLDisplayEglGetDisplay, new int[2])) {
                throw new RuntimeException("eglInitialize failed");
            }
            m mVar = this.f.get();
            if (mVar == null) {
                this.d = null;
                this.e = null;
            } else {
                this.d = mVar.f.chooseConfig(this.a, this.b);
                this.e = mVar.g.createContext(this.a, this.b, this.d);
            }
            EGLContext eGLContext = this.e;
            if (eGLContext == null || eGLContext == EGL10.EGL_NO_CONTEXT) {
                this.e = null;
                a("createContext", this.a.eglGetError());
            }
            this.c = null;
        }

        public final boolean b() {
            if (this.a == null) {
                throw new RuntimeException("egl not initialized");
            }
            if (this.b == null) {
                throw new RuntimeException("eglDisplay not initialized");
            }
            if (this.d == null) {
                throw new RuntimeException("mEglConfig not initialized");
            }
            f();
            m mVar = this.f.get();
            if (mVar != null) {
                this.c = mVar.h.a(this.a, this.b, this.d, mVar.getSurfaceTexture());
            } else {
                this.c = null;
            }
            EGLSurface eGLSurface = this.c;
            if (eGLSurface == null || eGLSurface == EGL10.EGL_NO_SURFACE) {
                if (this.a.eglGetError() == 12299) {
                    Log.e("EglHelper", "createWindowSurface returned EGL_BAD_NATIVE_WINDOW.");
                }
                return false;
            }
            if (this.a.eglMakeCurrent(this.b, eGLSurface, eGLSurface, this.e)) {
                return true;
            }
            a("EGLHelper", "eglMakeCurrent", this.a.eglGetError());
            return false;
        }

        public final GL c() {
            GL gl = this.e.getGL();
            m mVar = this.f.get();
            if (mVar == null) {
                return gl;
            }
            if (mVar.i != null) {
                gl = mVar.i.a();
            }
            if ((mVar.j & 3) != 0) {
                return GLDebugHelper.wrap(gl, (mVar.j & 1) != 0 ? 1 : 0, (mVar.j & 2) != 0 ? new l() : null);
            }
            return gl;
        }

        public final void d() {
            f();
        }

        public final void e() {
            if (this.e != null) {
                m mVar = this.f.get();
                if (mVar != null) {
                    mVar.g.destroyContext(this.a, this.b, this.e);
                }
                this.e = null;
            }
            EGLDisplay eGLDisplay = this.b;
            if (eGLDisplay != null) {
                this.a.eglTerminate(eGLDisplay);
                this.b = null;
            }
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
}
