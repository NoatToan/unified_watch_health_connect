package com.amap.api.col.p0003sl;

import com.autonavi.base.amap.api.mapcore.IGLSurfaceView;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;

/* JADX INFO: loaded from: classes4.dex */
public final class dn {
    public static void a(IGLSurfaceView iGLSurfaceView, int i, int i2, int i3) {
        iGLSurfaceView.setEGLContextFactory(new b());
        iGLSurfaceView.setEGLConfigChooser(new a(i, i2, i3));
    }

    public static final class b extends dm {
        @Override // com.amap.api.col.p0003sl.dm, android.opengl.GLSurfaceView.EGLContextFactory, com.amap.api.col.3sl.aa.f
        public final EGLContext createContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
            try {
                return egl10.eglCreateContext(eGLDisplay, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{12440, 2, 12344});
            } catch (Throwable th) {
                th.printStackTrace();
                return null;
            }
        }

        @Override // com.amap.api.col.p0003sl.dm, android.opengl.GLSurfaceView.EGLContextFactory, com.amap.api.col.3sl.aa.f
        public final void destroyContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLContext eGLContext) {
            egl10.eglDestroyContext(eGLDisplay, eGLContext);
        }
    }

    static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int[] f2381a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int[] f2382b;

        private c() {
            this.f2381a = null;
            this.f2382b = new int[1];
        }

        /* synthetic */ c(byte b2) {
            this();
        }
    }

    public static final class a extends dl {
        private static int g = 4;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected int f2378a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected int f2379b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        protected int f2380c;
        private int[] h = new int[1];
        protected int d = 0;
        protected int e = 16;
        protected int f = 8;

        public a(int i, int i2, int i3) {
            this.f2378a = i;
            this.f2379b = i2;
            this.f2380c = i3;
        }

        private int[] a(boolean z) {
            return new int[]{12324, this.f2378a, 12323, this.f2379b, 12322, this.f2380c, 12321, this.d, 12325, this.e, 12326, this.f, 12338, z ? 1 : 0, 12352, g, 12344};
        }

        private c a(EGL10 egl10, EGLDisplay eGLDisplay) {
            c cVar = new c((byte) 0);
            cVar.f2381a = a(true);
            egl10.eglChooseConfig(eGLDisplay, cVar.f2381a, null, 0, cVar.f2382b);
            if (cVar.f2382b[0] > 0) {
                return cVar;
            }
            cVar.f2381a = a(false);
            egl10.eglChooseConfig(eGLDisplay, cVar.f2381a, null, 0, cVar.f2382b);
            if (cVar.f2382b[0] <= 0) {
                return null;
            }
            return cVar;
        }

        @Override // com.amap.api.col.p0003sl.dl, android.opengl.GLSurfaceView.EGLConfigChooser, com.amap.api.col.3sl.aa.e
        public final EGLConfig chooseConfig(EGL10 egl10, EGLDisplay eGLDisplay) {
            c cVarA = a(egl10, eGLDisplay);
            if (cVarA == null || cVarA.f2381a == null) {
                return null;
            }
            EGLConfig[] eGLConfigArr = new EGLConfig[cVarA.f2382b[0]];
            egl10.eglChooseConfig(eGLDisplay, cVarA.f2381a, eGLConfigArr, cVarA.f2382b[0], cVarA.f2382b);
            EGLConfig eGLConfigA = a(egl10, eGLDisplay, eGLConfigArr);
            if (eGLConfigA == null) {
                this.f2378a = 8;
                this.f2379b = 8;
                this.f2380c = 8;
                c cVarA2 = a(egl10, eGLDisplay);
                if (cVarA2 != null && cVarA2.f2381a != null) {
                    EGLConfig[] eGLConfigArr2 = new EGLConfig[cVarA2.f2382b[0]];
                    egl10.eglChooseConfig(eGLDisplay, cVarA2.f2381a, eGLConfigArr2, cVarA2.f2382b[0], cVarA2.f2382b);
                    return a(egl10, eGLDisplay, eGLConfigArr2);
                }
            }
            return eGLConfigA;
        }

        private EGLConfig a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig[] eGLConfigArr) {
            for (EGLConfig eGLConfig : eGLConfigArr) {
                int iA = a(egl10, eGLDisplay, eGLConfig, 12325);
                int iA2 = a(egl10, eGLDisplay, eGLConfig, 12326);
                if (iA >= this.e && iA2 >= this.f) {
                    int iA3 = a(egl10, eGLDisplay, eGLConfig, 12324);
                    int iA4 = a(egl10, eGLDisplay, eGLConfig, 12323);
                    int iA5 = a(egl10, eGLDisplay, eGLConfig, 12322);
                    int iA6 = a(egl10, eGLDisplay, eGLConfig, 12321);
                    if (iA3 == this.f2378a && iA4 == this.f2379b && iA5 == this.f2380c && iA6 == this.d) {
                        return eGLConfig;
                    }
                }
            }
            return null;
        }

        private int a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i) {
            if (egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, i, this.h)) {
                return this.h[0];
            }
            return 0;
        }
    }
}
